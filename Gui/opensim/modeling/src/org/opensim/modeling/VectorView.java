/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorView extends VectorBaseDouble {
  private transient long swigCPtr;

  public VectorView(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorView_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorView(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorView(VectorView v) {
    this(opensimSimbodyJNI.new_VectorView(VectorView.getCPtr(v), v), true);
  }

}
