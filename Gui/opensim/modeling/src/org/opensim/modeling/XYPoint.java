/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class XYPoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public XYPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(XYPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_XYPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_x(double value) {
    opensimModelJNI.XYPoint__x_set(swigCPtr, this, value);
  }

  public double get_x() {
    return opensimModelJNI.XYPoint__x_get(swigCPtr, this);
  }

  public void set_y(double value) {
    opensimModelJNI.XYPoint__y_set(swigCPtr, this, value);
  }

  public double get_y() {
    return opensimModelJNI.XYPoint__y_get(swigCPtr, this);
  }

  public XYPoint() {
    this(opensimModelJNI.new_XYPoint__SWIG_0(), true);
  }

  public XYPoint(double aX, double aY) {
    this(opensimModelJNI.new_XYPoint__SWIG_1(aX, aY), true);
  }

}
