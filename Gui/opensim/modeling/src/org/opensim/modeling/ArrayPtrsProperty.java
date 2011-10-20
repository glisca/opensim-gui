/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayPtrsProperty {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayPtrsProperty(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPtrsProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrayPtrsProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayPtrsProperty(int aCapacity) {
    this(opensimModelJNI.new_ArrayPtrsProperty__SWIG_0(aCapacity), true);
  }

  public ArrayPtrsProperty() {
    this(opensimModelJNI.new_ArrayPtrsProperty__SWIG_1(), true);
  }

  public ArrayPtrsProperty(ArrayPtrsProperty aArray) {
    this(opensimModelJNI.new_ArrayPtrsProperty__SWIG_2(ArrayPtrsProperty.getCPtr(aArray), aArray), true);
  }

  public void clearAndDestroy() {
    opensimModelJNI.ArrayPtrsProperty_clearAndDestroy(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.ArrayPtrsProperty_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean getMemoryOwner() {
    return opensimModelJNI.ArrayPtrsProperty_getMemoryOwner(swigCPtr, this);
  }

  public boolean computeNewCapacity(int aMinCapacity, SWIGTYPE_p_int rNewCapacity) {
    return opensimModelJNI.ArrayPtrsProperty_computeNewCapacity(swigCPtr, this, aMinCapacity, SWIGTYPE_p_int.getCPtr(rNewCapacity));
  }

  public boolean ensureCapacity(int aCapacity) {
    return opensimModelJNI.ArrayPtrsProperty_ensureCapacity(swigCPtr, this, aCapacity);
  }

  public void trim() {
    opensimModelJNI.ArrayPtrsProperty_trim(swigCPtr, this);
  }

  public int getCapacity() {
    return opensimModelJNI.ArrayPtrsProperty_getCapacity(swigCPtr, this);
  }

  public void setCapacityIncrement(int aIncrement) {
    opensimModelJNI.ArrayPtrsProperty_setCapacityIncrement(swigCPtr, this, aIncrement);
  }

  public int getCapacityIncrement() {
    return opensimModelJNI.ArrayPtrsProperty_getCapacityIncrement(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.ArrayPtrsProperty_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.ArrayPtrsProperty_getSize(swigCPtr, this);
  }

  public int getIndex(Property aObject, int aStartIndex) {
    return opensimModelJNI.ArrayPtrsProperty_getIndex__SWIG_0(swigCPtr, this, Property.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_getIndex__SWIG_1(swigCPtr, this, Property.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.ArrayPtrsProperty_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.ArrayPtrsProperty_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public boolean append(Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_append__SWIG_0(swigCPtr, this, Property.getCPtr(aObject), aObject);
  }

  public boolean append(ArrayPtrsProperty aArray) {
    return opensimModelJNI.ArrayPtrsProperty_append__SWIG_1(swigCPtr, this, ArrayPtrsProperty.getCPtr(aArray), aArray);
  }

  public boolean insert(int aIndex, Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_insert(swigCPtr, this, aIndex, Property.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.ArrayPtrsProperty_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_remove__SWIG_1(swigCPtr, this, Property.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_set(swigCPtr, this, aIndex, Property.getCPtr(aObject), aObject);
  }

  public Property get(int aIndex) {
    long cPtr = opensimModelJNI.ArrayPtrsProperty_get__SWIG_0(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public Property get(String aName) {
    long cPtr = opensimModelJNI.ArrayPtrsProperty_get__SWIG_1(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public Property getLast() {
    long cPtr = opensimModelJNI.ArrayPtrsProperty_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new Property(cPtr, false);
  }

  public int searchBinary(Property aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.ArrayPtrsProperty_searchBinary__SWIG_0(swigCPtr, this, Property.getCPtr(aObject), aObject, aFindFirst, aLo, aHi);
  }

  public int searchBinary(Property aObject, boolean aFindFirst, int aLo) {
    return opensimModelJNI.ArrayPtrsProperty_searchBinary__SWIG_1(swigCPtr, this, Property.getCPtr(aObject), aObject, aFindFirst, aLo);
  }

  public int searchBinary(Property aObject, boolean aFindFirst) {
    return opensimModelJNI.ArrayPtrsProperty_searchBinary__SWIG_2(swigCPtr, this, Property.getCPtr(aObject), aObject, aFindFirst);
  }

  public int searchBinary(Property aObject) {
    return opensimModelJNI.ArrayPtrsProperty_searchBinary__SWIG_3(swigCPtr, this, Property.getCPtr(aObject), aObject);
  }

}
