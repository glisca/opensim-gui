/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoInitialForceEquilibriumDGFGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoInitialForceEquilibriumDGFGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoInitialForceEquilibriumDGFGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoInitialForceEquilibriumDGFGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoInitialForceEquilibriumDGFGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoInitialForceEquilibriumDGFGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoInitialForceEquilibriumDGFGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoInitialForceEquilibriumDGFGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoInitialForceEquilibriumDGFGoal() {
    this(opensimMocoJNI.new_MocoInitialForceEquilibriumDGFGoal__SWIG_0(), true);
  }

  public MocoInitialForceEquilibriumDGFGoal(String name) {
    this(opensimMocoJNI.new_MocoInitialForceEquilibriumDGFGoal__SWIG_1(name), true);
  }

}
