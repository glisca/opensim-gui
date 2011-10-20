/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Actuator extends Actuator_ {
  private long swigCPtr;

  public Actuator(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Actuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Actuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Actuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.Actuator_copy__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public double getControl(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getControl(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public int numControls() {
    return opensimModelJNI.Actuator_numControls(swigCPtr, this);
  }

  public void setForce(SWIGTYPE_p_SimTK__State s, double aForce) {
    opensimModelJNI.Actuator_setForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), aForce);
  }

  public double getForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setSpeed(SWIGTYPE_p_SimTK__State s, double aspeed) {
    opensimModelJNI.Actuator_setSpeed(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), aspeed);
  }

  public double getSpeed(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getSpeed(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPower(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getPower(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getStress(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getStress(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getOptimalForce() {
    return opensimModelJNI.Actuator_getOptimalForce(swigCPtr, this);
  }

  public void setMinControl(double aMinControl) {
    opensimModelJNI.Actuator_setMinControl(swigCPtr, this, aMinControl);
  }

  public double getMinControl() {
    return opensimModelJNI.Actuator_getMinControl(swigCPtr, this);
  }

  public void setMaxControl(double aMaxControl) {
    opensimModelJNI.Actuator_setMaxControl(swigCPtr, this, aMaxControl);
  }

  public double getMaxControl() {
    return opensimModelJNI.Actuator_getMaxControl(swigCPtr, this);
  }

  public void overrideForce(SWIGTYPE_p_SimTK__State s, boolean flag) {
    opensimModelJNI.Actuator_overrideForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), flag);
  }

  public boolean isForceOverriden(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_isForceOverriden(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setOverrideForce(SWIGTYPE_p_SimTK__State s, double value) {
    opensimModelJNI.Actuator_setOverrideForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), value);
  }

  public double getOverrideForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Actuator_getOverrideForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setOverrideForceFunction(SWIGTYPE_p_OpenSim__StateFunction arg0) {
    opensimModelJNI.Actuator_setOverrideForceFunction(swigCPtr, this, SWIGTYPE_p_OpenSim__StateFunction.getCPtr(arg0));
  }

  public SWIGTYPE_p_OpenSim__StateFunction getOverrideForceFunction() {
    long cPtr = opensimModelJNI.Actuator_getOverrideForceFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OpenSim__StateFunction(cPtr, false);
  }

  public SWIGTYPE_p_OpenSim__StateFunction updOverrideForceFunction() {
    long cPtr = opensimModelJNI.Actuator_updOverrideForceFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_OpenSim__StateFunction(cPtr, false);
  }

  public void resetOverrideForceFunction() {
    opensimModelJNI.Actuator_resetOverrideForceFunction(swigCPtr, this);
  }

  public static boolean isKindOf(String type) {
    return opensimModelJNI.Actuator_isKindOf(type);
  }

  public boolean isA(String type) {
    return opensimModelJNI.Actuator_isA(swigCPtr, this, type);
  }

  public static Actuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Actuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Actuator(cPtr, false);
  }

  public void copy(OpenSimObject aObject) {
    opensimModelJNI.Actuator_copy__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

}
