/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PropertyGroup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PropertyGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PropertyGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PropertyGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PropertyGroup() {
    this(opensimModelJNI.new_PropertyGroup__SWIG_0(), true);
  }

  public PropertyGroup(SWIGTYPE_p_std__string aName) {
    this(opensimModelJNI.new_PropertyGroup__SWIG_1(SWIGTYPE_p_std__string.getCPtr(aName)), true);
  }

  public PropertyGroup(PropertyGroup aGroup) {
    this(opensimModelJNI.new_PropertyGroup__SWIG_2(PropertyGroup.getCPtr(aGroup), aGroup), true);
  }

  public PropertyGroup clone() {
    long cPtr = opensimModelJNI.PropertyGroup_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyGroup(cPtr, false);
  }

  public void copyData(PropertyGroup aGroup) {
    opensimModelJNI.PropertyGroup_copyData(swigCPtr, this, PropertyGroup.getCPtr(aGroup), aGroup);
  }

  public void clear() {
    opensimModelJNI.PropertyGroup_clear(swigCPtr, this);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.PropertyGroup_contains(swigCPtr, this, aName);
  }

  public void add(SWIGTYPE_p_Property_Deprecated aProperty) {
    opensimModelJNI.PropertyGroup_add(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public void remove(SWIGTYPE_p_Property_Deprecated aProperty) {
    opensimModelJNI.PropertyGroup_remove(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public SWIGTYPE_p_OpenSim__ArrayT_Property_Deprecated_p_t getProperties() {
    return new SWIGTYPE_p_OpenSim__ArrayT_Property_Deprecated_p_t(opensimModelJNI.PropertyGroup_getProperties(swigCPtr, this), false);
  }

  public SWIGTYPE_p_Property_Deprecated get(int aIndex) {
    long cPtr = opensimModelJNI.PropertyGroup_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Property_Deprecated(cPtr, false);
  }

  public int getPropertyIndex(SWIGTYPE_p_Property_Deprecated aProperty) {
    return opensimModelJNI.PropertyGroup_getPropertyIndex(swigCPtr, this, SWIGTYPE_p_Property_Deprecated.getCPtr(aProperty));
  }

  public void setName(String aName) {
    opensimModelJNI.PropertyGroup_setName(swigCPtr, this, aName);
  }

  public String getName() {
    return opensimModelJNI.PropertyGroup_getName(swigCPtr, this);
  }

}
