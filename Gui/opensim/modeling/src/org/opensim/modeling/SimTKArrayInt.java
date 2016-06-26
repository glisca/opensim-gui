/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimTKArrayInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SimTKArrayInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimTKArrayInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_SimTKArrayInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimTKArrayInt() {
    this(opensimSimbodyJNI.new_SimTKArrayInt__SWIG_0(), true);
  }

  public SimTKArrayInt(long n) {
    this(opensimSimbodyJNI.new_SimTKArrayInt__SWIG_1(n), true);
  }

  public SimTKArrayInt(long n, int initVal) {
    this(opensimSimbodyJNI.new_SimTKArrayInt__SWIG_2(n, initVal), true);
  }

  public SimTKArrayInt(SimTKArrayInt src) {
    this(opensimSimbodyJNI.new_SimTKArrayInt__SWIG_3(SimTKArrayInt.getCPtr(src), src), true);
  }

  public SimTKArrayInt(SWIGTYPE_p_int first, SWIGTYPE_p_int last1, DontCopy arg2) {
    this(opensimSimbodyJNI.new_SimTKArrayInt__SWIG_4(SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1), DontCopy.getCPtr(arg2), arg2), true);
  }

  public SimTKArrayInt deallocate() {
    return new SimTKArrayInt(opensimSimbodyJNI.SimTKArrayInt_deallocate(swigCPtr, this), false);
  }

  public void assign(long n, int fillValue) {
    opensimSimbodyJNI.SimTKArrayInt_assign(swigCPtr, this, n, fillValue);
  }

  public void fill(int fillValue) {
    opensimSimbodyJNI.SimTKArrayInt_fill(swigCPtr, this, fillValue);
  }

  public void swap(SimTKArrayInt other) {
    opensimSimbodyJNI.SimTKArrayInt_swap(swigCPtr, this, SimTKArrayInt.getCPtr(other), other);
  }

  public SimTKArrayInt adoptData(SWIGTYPE_p_int newData, long dataSize, long dataCapacity) {
    return new SimTKArrayInt(opensimSimbodyJNI.SimTKArrayInt_adoptData__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize, dataCapacity), false);
  }

  public SimTKArrayInt adoptData(SWIGTYPE_p_int newData, long dataSize) {
    return new SimTKArrayInt(opensimSimbodyJNI.SimTKArrayInt_adoptData__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize), false);
  }

  public SimTKArrayInt shareData(SWIGTYPE_p_int newData, long dataSize) {
    return new SimTKArrayInt(opensimSimbodyJNI.SimTKArrayInt_shareData__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize), false);
  }

  public SimTKArrayInt shareData(SWIGTYPE_p_int first, SWIGTYPE_p_int last1) {
    return new SimTKArrayInt(opensimSimbodyJNI.SimTKArrayInt_shareData__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1)), false);
  }

  public long size() {
    return opensimSimbodyJNI.SimTKArrayInt_size(swigCPtr, this);
  }

  public long max_size() {
    return opensimSimbodyJNI.SimTKArrayInt_max_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimSimbodyJNI.SimTKArrayInt_empty(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.SimTKArrayInt_capacity(swigCPtr, this);
  }

  public void resize(long n) {
    opensimSimbodyJNI.SimTKArrayInt_resize__SWIG_0(swigCPtr, this, n);
  }

  public void resize(long n, int initVal) {
    opensimSimbodyJNI.SimTKArrayInt_resize__SWIG_1(swigCPtr, this, n, initVal);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.SimTKArrayInt_reserve(swigCPtr, this, n);
  }

  public void shrink_to_fit() {
    opensimSimbodyJNI.SimTKArrayInt_shrink_to_fit(swigCPtr, this);
  }

  public long allocated() {
    return opensimSimbodyJNI.SimTKArrayInt_allocated(swigCPtr, this);
  }

  public boolean isOwner() {
    return opensimSimbodyJNI.SimTKArrayInt_isOwner(swigCPtr, this);
  }

  public SWIGTYPE_p_int cbegin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_cbegin(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int begin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int cend() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_cend(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int end() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t crbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayInt_crbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t rbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayInt_rbegin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t crend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayInt_crend(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t rend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayInt_rend__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_int cdata() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_cdata(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int data() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public int at(long i) {
    return opensimSimbodyJNI.SimTKArrayInt_at__SWIG_0(swigCPtr, this, i);
  }

  public int getElt(long i) {
    return opensimSimbodyJNI.SimTKArrayInt_getElt(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int updElt(long i) {
    return new SWIGTYPE_p_int(opensimSimbodyJNI.SimTKArrayInt_updElt(swigCPtr, this, i), false);
  }

  public int front() {
    return opensimSimbodyJNI.SimTKArrayInt_front__SWIG_0(swigCPtr, this);
  }

  public int back() {
    return opensimSimbodyJNI.SimTKArrayInt_back__SWIG_0(swigCPtr, this);
  }

  public void push_back(int value) {
    opensimSimbodyJNI.SimTKArrayInt_push_back__SWIG_0(swigCPtr, this, value);
  }

  public void push_back() {
    opensimSimbodyJNI.SimTKArrayInt_push_back__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int raw_push_back() {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_raw_push_back(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void pop_back() {
    opensimSimbodyJNI.SimTKArrayInt_pop_back(swigCPtr, this);
  }

  public SWIGTYPE_p_int erase(SWIGTYPE_p_int first, SWIGTYPE_p_int last1) {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int erase(SWIGTYPE_p_int p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int eraseFast(SWIGTYPE_p_int p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_eraseFast(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void clear() {
    opensimSimbodyJNI.SimTKArrayInt_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_int insert(SWIGTYPE_p_int p, long n, int value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_insert__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p), n, value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int insert(SWIGTYPE_p_int p, int value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayInt_insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p), value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

}