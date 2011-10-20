/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetActuators extends OpenSimObject {
  private long swigCPtr;

  public SetActuators(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetActuators_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetActuators obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetActuators(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SetActuators() {
    this(opensimModelJNI.new_SetActuators__SWIG_0(), true);
  }

  public SetActuators(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetActuators__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetActuators(String aFileName) {
    this(opensimModelJNI.new_SetActuators__SWIG_2(aFileName), true);
  }

  public SetActuators(SetActuators aSet) {
    this(opensimModelJNI.new_SetActuators__SWIG_3(SetActuators.getCPtr(aSet), aSet), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.SetActuators_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setup() {
    opensimModelJNI.SetActuators_setup(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetActuators_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean getMemoryOwner() {
    return opensimModelJNI.SetActuators_getMemoryOwner(swigCPtr, this);
  }

  public boolean computeNewCapacity(int aMinCapacity, SWIGTYPE_p_int rNewCapacity) {
    return opensimModelJNI.SetActuators_computeNewCapacity(swigCPtr, this, aMinCapacity, SWIGTYPE_p_int.getCPtr(rNewCapacity));
  }

  public boolean ensureCapacity(int aCapacity) {
    return opensimModelJNI.SetActuators_ensureCapacity(swigCPtr, this, aCapacity);
  }

  public void trim() {
    opensimModelJNI.SetActuators_trim(swigCPtr, this);
  }

  public int getCapacity() {
    return opensimModelJNI.SetActuators_getCapacity(swigCPtr, this);
  }

  public void setCapacityIncrement(int aIncrement) {
    opensimModelJNI.SetActuators_setCapacityIncrement(swigCPtr, this, aIncrement);
  }

  public int getCapacityIncrement() {
    return opensimModelJNI.SetActuators_getCapacityIncrement(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetActuators_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetActuators_getSize(swigCPtr, this);
  }

  public int getIndex(Actuator aObject, int aStartIndex) {
    return opensimModelJNI.SetActuators_getIndex__SWIG_0(swigCPtr, this, Actuator.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Actuator aObject) {
    return opensimModelJNI.SetActuators_getIndex__SWIG_1(swigCPtr, this, Actuator.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetActuators_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetActuators_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetActuators_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean append(Actuator aObject) {
    return opensimModelJNI.SetActuators_append(swigCPtr, this, Actuator.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Actuator aObject) {
    return opensimModelJNI.SetActuators_insert(swigCPtr, this, aIndex, Actuator.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetActuators_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Actuator aObject) {
    return opensimModelJNI.SetActuators_remove__SWIG_1(swigCPtr, this, Actuator.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetActuators_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Actuator aObject, boolean preserveGroups) {
    return opensimModelJNI.SetActuators_set__SWIG_0(swigCPtr, this, aIndex, Actuator.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Actuator aObject) {
    return opensimModelJNI.SetActuators_set__SWIG_1(swigCPtr, this, aIndex, Actuator.getCPtr(aObject), aObject);
  }

  public Actuator get(int aIndex) {
    return new Actuator(opensimModelJNI.SetActuators_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Actuator get(String aName) {
    return new Actuator(opensimModelJNI.SetActuators_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetActuators_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetActuators_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public Actuator getLast() {
    long cPtr = opensimModelJNI.SetActuators_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new Actuator(cPtr, false);
  }

  public int searchBinary(Actuator aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.SetActuators_searchBinary__SWIG_0(swigCPtr, this, Actuator.getCPtr(aObject), aObject, aFindFirst, aLo, aHi);
  }

  public int searchBinary(Actuator aObject, boolean aFindFirst, int aLo) {
    return opensimModelJNI.SetActuators_searchBinary__SWIG_1(swigCPtr, this, Actuator.getCPtr(aObject), aObject, aFindFirst, aLo);
  }

  public int searchBinary(Actuator aObject, boolean aFindFirst) {
    return opensimModelJNI.SetActuators_searchBinary__SWIG_2(swigCPtr, this, Actuator.getCPtr(aObject), aObject, aFindFirst);
  }

  public int searchBinary(Actuator aObject) {
    return opensimModelJNI.SetActuators_searchBinary__SWIG_3(swigCPtr, this, Actuator.getCPtr(aObject), aObject);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetActuators_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetActuators_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetActuators_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetActuators_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetActuators_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetActuators_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetActuators_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetActuators_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
