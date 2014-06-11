/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PropertyHelper {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PropertyHelper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PropertyHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PropertyHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean getValueBool(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueBool__SWIG_0(AbstractProperty.getCPtr(p), p, index);
  }

  public static boolean getValueBool(AbstractProperty p) {
    return opensimModelJNI.PropertyHelper_getValueBool__SWIG_1(AbstractProperty.getCPtr(p), p);
  }

  public static void setValueBool(boolean v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueBool__SWIG_0(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueBool(boolean v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_setValueBool__SWIG_1(v, AbstractProperty.getCPtr(p), p);
  }

  public static void appendValueBool(boolean v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_appendValueBool(v, AbstractProperty.getCPtr(p), p);
  }

  public static int getValueInt(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueInt__SWIG_0(AbstractProperty.getCPtr(p), p, index);
  }

  public static int getValueInt(AbstractProperty p) {
    return opensimModelJNI.PropertyHelper_getValueInt__SWIG_1(AbstractProperty.getCPtr(p), p);
  }

  public static void setValueInt(int v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueInt__SWIG_0(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueInt(int v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_setValueInt__SWIG_1(v, AbstractProperty.getCPtr(p), p);
  }

  public static void appendValueInt(int v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_appendValueInt(v, AbstractProperty.getCPtr(p), p);
  }

  public static double getValueDouble(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueDouble__SWIG_0(AbstractProperty.getCPtr(p), p, index);
  }

  public static double getValueDouble(AbstractProperty p) {
    return opensimModelJNI.PropertyHelper_getValueDouble__SWIG_1(AbstractProperty.getCPtr(p), p);
  }

  public static void setValueDouble(double v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueDouble__SWIG_0(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueDouble(double v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_setValueDouble__SWIG_1(v, AbstractProperty.getCPtr(p), p);
  }

  public static void appendValueDouble(double v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_appendValueDouble(v, AbstractProperty.getCPtr(p), p);
  }

  public static String getValueString(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueString__SWIG_0(AbstractProperty.getCPtr(p), p, index);
  }

  public static String getValueString(AbstractProperty p) {
    return opensimModelJNI.PropertyHelper_getValueString__SWIG_1(AbstractProperty.getCPtr(p), p);
  }

  public static void setValueString(String v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueString__SWIG_0(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueString(String v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_setValueString__SWIG_1(v, AbstractProperty.getCPtr(p), p);
  }

  public static void appendValueString(String v, AbstractProperty p) {
    opensimModelJNI.PropertyHelper_appendValueString(v, AbstractProperty.getCPtr(p), p);
  }

  public static double getValueTransform(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueTransform(AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueTransform(double v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueTransform(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static double getValueVec3(AbstractProperty p, int index) {
    return opensimModelJNI.PropertyHelper_getValueVec3(AbstractProperty.getCPtr(p), p, index);
  }

  public static void setValueVec3(double v, AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_setValueVec3(v, AbstractProperty.getCPtr(p), p, index);
  }

  public static ArrayStr getValueStringArray(AbstractProperty p) {
    return new ArrayStr(opensimModelJNI.PropertyHelper_getValueStringArray(AbstractProperty.getCPtr(p), p), true);
  }

  public static void setValueStringArray(AbstractProperty p, ArrayStr aStringArray) {
    opensimModelJNI.PropertyHelper_setValueStringArray(AbstractProperty.getCPtr(p), p, ArrayStr.getCPtr(aStringArray), aStringArray);
  }

  public static void removeItem(AbstractProperty p, int index) {
    opensimModelJNI.PropertyHelper_removeItem(AbstractProperty.getCPtr(p), p, index);
  }

  public PropertyHelper() {
    this(opensimModelJNI.new_PropertyHelper(), true);
  }

}
