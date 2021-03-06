/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdVectorString {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StdVectorString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdVectorString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_StdVectorString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdVectorString() {
    this(opensimMocoJNI.new_StdVectorString__SWIG_0(), true);
  }

  public StdVectorString(long n) {
    this(opensimMocoJNI.new_StdVectorString__SWIG_1(n), true);
  }

  public long size() {
    return opensimMocoJNI.StdVectorString_size(swigCPtr, this);
  }

  public long capacity() {
    return opensimMocoJNI.StdVectorString_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opensimMocoJNI.StdVectorString_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opensimMocoJNI.StdVectorString_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opensimMocoJNI.StdVectorString_clear(swigCPtr, this);
  }

  public void add(String x) {
    opensimMocoJNI.StdVectorString_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return opensimMocoJNI.StdVectorString_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    opensimMocoJNI.StdVectorString_set(swigCPtr, this, i, val);
  }

}
