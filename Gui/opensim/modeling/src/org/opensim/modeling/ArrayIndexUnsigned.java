/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayIndexUnsigned {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayIndexUnsigned(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayIndexUnsigned obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrayIndexUnsigned(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long max_size() {
    return opensimModelJNI.ArrayIndexUnsigned_max_size();
  }

  public ArrayIndexUnsigned() {
    this(opensimModelJNI.new_ArrayIndexUnsigned(), true);
  }

}
