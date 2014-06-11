/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Mat33 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Mat33(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mat33 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Mat33(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int size() {
    return opensimModelJNI.Mat33_size();
  }

  public static int nrow() {
    return opensimModelJNI.Mat33_nrow();
  }

  public static int ncol() {
    return opensimModelJNI.Mat33_ncol();
  }

  public Mat33() {
    this(opensimModelJNI.new_Mat33__SWIG_0(), true);
  }

  public Mat33(Mat33 src) {
    this(opensimModelJNI.new_Mat33__SWIG_1(Mat33.getCPtr(src), src), true);
  }

  public Mat33(double e) {
    this(opensimModelJNI.new_Mat33__SWIG_2(e), true);
  }

  public Mat33(int i) {
    this(opensimModelJNI.new_Mat33__SWIG_3(i), true);
  }

  public Mat33(double e0, double e1) {
    this(opensimModelJNI.new_Mat33__SWIG_4(e0, e1), true);
  }

  public Mat33(double e0, double e1, double e2) {
    this(opensimModelJNI.new_Mat33__SWIG_5(e0, e1, e2), true);
  }

  public Mat33(double e0, double e1, double e2, double e3) {
    this(opensimModelJNI.new_Mat33__SWIG_6(e0, e1, e2, e3), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4) {
    this(opensimModelJNI.new_Mat33__SWIG_7(e0, e1, e2, e3, e4), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5) {
    this(opensimModelJNI.new_Mat33__SWIG_8(e0, e1, e2, e3, e4, e5), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6) {
    this(opensimModelJNI.new_Mat33__SWIG_9(e0, e1, e2, e3, e4, e5, e6), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7) {
    this(opensimModelJNI.new_Mat33__SWIG_10(e0, e1, e2, e3, e4, e5, e6, e7), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8) {
    this(opensimModelJNI.new_Mat33__SWIG_11(e0, e1, e2, e3, e4, e5, e6, e7, e8), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9) {
    this(opensimModelJNI.new_Mat33__SWIG_12(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10) {
    this(opensimModelJNI.new_Mat33__SWIG_13(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10, double e11) {
    this(opensimModelJNI.new_Mat33__SWIG_14(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10, double e11, double e12) {
    this(opensimModelJNI.new_Mat33__SWIG_15(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10, double e11, double e12, double e13) {
    this(opensimModelJNI.new_Mat33__SWIG_16(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10, double e11, double e12, double e13, double e14) {
    this(opensimModelJNI.new_Mat33__SWIG_17(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14), true);
  }

  public Mat33(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8, double e9, double e10, double e11, double e12, double e13, double e14, double e15) {
    this(opensimModelJNI.new_Mat33__SWIG_18(e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15), true);
  }

  public void setToNaN() {
    opensimModelJNI.Mat33_setToNaN(swigCPtr, this);
  }

  public void setToZero() {
    opensimModelJNI.Mat33_setToZero(swigCPtr, this);
  }

  public boolean isNaN() {
    return opensimModelJNI.Mat33_isNaN(swigCPtr, this);
  }

  public boolean isInf() {
    return opensimModelJNI.Mat33_isInf(swigCPtr, this);
  }

  public boolean isFinite() {
    return opensimModelJNI.Mat33_isFinite(swigCPtr, this);
  }

  public static double getDefaultTolerance() {
    return opensimModelJNI.Mat33_getDefaultTolerance();
  }

  public boolean isNumericallyEqual(double e, double tol) {
    return opensimModelJNI.Mat33_isNumericallyEqual__SWIG_0(swigCPtr, this, e, tol);
  }

  public boolean isNumericallyEqual(double e) {
    return opensimModelJNI.Mat33_isNumericallyEqual__SWIG_1(swigCPtr, this, e);
  }

  public boolean isNumericallySymmetric(double tol) {
    return opensimModelJNI.Mat33_isNumericallySymmetric__SWIG_0(swigCPtr, this, tol);
  }

  public boolean isNumericallySymmetric() {
    return opensimModelJNI.Mat33_isNumericallySymmetric__SWIG_1(swigCPtr, this);
  }

  public boolean isExactlySymmetric() {
    return opensimModelJNI.Mat33_isExactlySymmetric(swigCPtr, this);
  }

  public String toString() {
    return opensimModelJNI.Mat33_toString(swigCPtr, this);
  }

  public double get(int i, int j) {
    return opensimModelJNI.Mat33_get(swigCPtr, this, i, j);
  }

  public void set(int i, int j, double value) {
    opensimModelJNI.Mat33_set(swigCPtr, this, i, j, value);
  }

}
