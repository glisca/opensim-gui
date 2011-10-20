/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Force extends ModelComponent {
  private long swigCPtr;

  public Force(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Force_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Force obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Force(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void copyData(Force aForce) {
    opensimModelJNI.Force_copyData(swigCPtr, this, Force.getCPtr(aForce), aForce);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.Force_copy__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.Force_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(SWIGTYPE_p_SimTK__State state) {
    return new ArrayDouble(opensimModelJNI.Force_getRecordValues(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state)), true);
  }

  public boolean isDisabled(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Force_isDisabled(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setDisabled(SWIGTYPE_p_SimTK__State s, boolean disabled) {
    opensimModelJNI.Force_setDisabled(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), disabled);
  }

  public boolean hasGeometryPath() {
    return opensimModelJNI.Force_hasGeometryPath(swigCPtr, this);
  }

  public static boolean isKindOf(String type) {
    return opensimModelJNI.Force_isKindOf(type);
  }

  public boolean isA(String type) {
    return opensimModelJNI.Force_isA(swigCPtr, this, type);
  }

  public static Force safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Force_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Force(cPtr, false);
  }

  public void copy(OpenSimObject aObject) {
    opensimModelJNI.Force_copy__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

}
