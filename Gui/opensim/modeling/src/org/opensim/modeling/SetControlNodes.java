/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetControlNodes {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SetControlNodes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetControlNodes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetControlNodes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SetControlNodes(int aCapacity) {
    this(opensimModelJNI.new_SetControlNodes__SWIG_0(aCapacity), true);
  }

  public SetControlNodes() {
    this(opensimModelJNI.new_SetControlNodes__SWIG_1(), true);
  }

  public SetControlNodes(SetControlNodes aArray) {
    this(opensimModelJNI.new_SetControlNodes__SWIG_2(SetControlNodes.getCPtr(aArray), aArray), true);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetControlNodes_clearAndDestroy(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetControlNodes_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean getMemoryOwner() {
    return opensimModelJNI.SetControlNodes_getMemoryOwner(swigCPtr, this);
  }

  public boolean computeNewCapacity(int aMinCapacity, SWIGTYPE_p_int rNewCapacity) {
    return opensimModelJNI.SetControlNodes_computeNewCapacity(swigCPtr, this, aMinCapacity, SWIGTYPE_p_int.getCPtr(rNewCapacity));
  }

  public boolean ensureCapacity(int aCapacity) {
    return opensimModelJNI.SetControlNodes_ensureCapacity(swigCPtr, this, aCapacity);
  }

  public void trim() {
    opensimModelJNI.SetControlNodes_trim(swigCPtr, this);
  }

  public int getCapacity() {
    return opensimModelJNI.SetControlNodes_getCapacity(swigCPtr, this);
  }

  public void setCapacityIncrement(int aIncrement) {
    opensimModelJNI.SetControlNodes_setCapacityIncrement(swigCPtr, this, aIncrement);
  }

  public int getCapacityIncrement() {
    return opensimModelJNI.SetControlNodes_getCapacityIncrement(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetControlNodes_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetControlNodes_getSize(swigCPtr, this);
  }

  public int getIndex(ControlLinearNode aObject, int aStartIndex) {
    return opensimModelJNI.SetControlNodes_getIndex__SWIG_0(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_getIndex__SWIG_1(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetControlNodes_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetControlNodes_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public boolean append(ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_append__SWIG_0(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject);
  }

  public boolean append(SetControlNodes aArray) {
    return opensimModelJNI.SetControlNodes_append__SWIG_1(swigCPtr, this, SetControlNodes.getCPtr(aArray), aArray);
  }

  public boolean insert(int aIndex, ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_insert(swigCPtr, this, aIndex, ControlLinearNode.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetControlNodes_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_remove__SWIG_1(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_set(swigCPtr, this, aIndex, ControlLinearNode.getCPtr(aObject), aObject);
  }

  public ControlLinearNode get(int aIndex) {
    long cPtr = opensimModelJNI.SetControlNodes_get__SWIG_0(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ControlLinearNode(cPtr, false);
  }

  public ControlLinearNode get(String aName) {
    long cPtr = opensimModelJNI.SetControlNodes_get__SWIG_1(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new ControlLinearNode(cPtr, false);
  }

  public ControlLinearNode getLast() {
    long cPtr = opensimModelJNI.SetControlNodes_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlLinearNode(cPtr, false);
  }

  public int searchBinary(ControlLinearNode aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.SetControlNodes_searchBinary__SWIG_0(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject, aFindFirst, aLo, aHi);
  }

  public int searchBinary(ControlLinearNode aObject, boolean aFindFirst, int aLo) {
    return opensimModelJNI.SetControlNodes_searchBinary__SWIG_1(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject, aFindFirst, aLo);
  }

  public int searchBinary(ControlLinearNode aObject, boolean aFindFirst) {
    return opensimModelJNI.SetControlNodes_searchBinary__SWIG_2(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject, aFindFirst);
  }

  public int searchBinary(ControlLinearNode aObject) {
    return opensimModelJNI.SetControlNodes_searchBinary__SWIG_3(swigCPtr, this, ControlLinearNode.getCPtr(aObject), aObject);
  }

}
