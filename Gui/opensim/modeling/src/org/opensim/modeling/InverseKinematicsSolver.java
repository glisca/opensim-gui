/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseKinematicsSolver extends AssemblySolver {
  private transient long swigCPtr;

  public InverseKinematicsSolver(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.InverseKinematicsSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseKinematicsSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_InverseKinematicsSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, SimTKArrayCoordinateReference coordinateReferences, double constraintWeight) {
    this(opensimSimulationJNI.new_InverseKinematicsSolver__SWIG_0(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences, constraintWeight), true);
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, SimTKArrayCoordinateReference coordinateReferences) {
    this(opensimSimulationJNI.new_InverseKinematicsSolver__SWIG_1(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences), true);
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, OrientationsReference orientationsReference, SimTKArrayCoordinateReference coordinateReferences, double constraintWeight) {
    this(opensimSimulationJNI.new_InverseKinematicsSolver__SWIG_2(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, OrientationsReference.getCPtr(orientationsReference), orientationsReference, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences, constraintWeight), true);
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, OrientationsReference orientationsReference, SimTKArrayCoordinateReference coordinateReferences) {
    this(opensimSimulationJNI.new_InverseKinematicsSolver__SWIG_3(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, OrientationsReference.getCPtr(orientationsReference), orientationsReference, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences), true);
  }

  public int getNumMarkersInUse() {
    return opensimSimulationJNI.InverseKinematicsSolver_getNumMarkersInUse(swigCPtr, this);
  }

  public int getNumOrientationSensorsInUse() {
    return opensimSimulationJNI.InverseKinematicsSolver_getNumOrientationSensorsInUse(swigCPtr, this);
  }

  public void updateMarkerWeight(String markerName, double value) {
    opensimSimulationJNI.InverseKinematicsSolver_updateMarkerWeight__SWIG_0(swigCPtr, this, markerName, value);
  }

  public void updateMarkerWeight(int markerIndex, double value) {
    opensimSimulationJNI.InverseKinematicsSolver_updateMarkerWeight__SWIG_1(swigCPtr, this, markerIndex, value);
  }

  public void updateMarkerWeights(SimTKArrayDouble weights) {
    opensimSimulationJNI.InverseKinematicsSolver_updateMarkerWeights(swigCPtr, this, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public void updateOrientationWeight(String orientationName, double value) {
    opensimSimulationJNI.InverseKinematicsSolver_updateOrientationWeight__SWIG_0(swigCPtr, this, orientationName, value);
  }

  public void updateOrientationWeight(int orientationIndex, double value) {
    opensimSimulationJNI.InverseKinematicsSolver_updateOrientationWeight__SWIG_1(swigCPtr, this, orientationIndex, value);
  }

  public void updateOrientationWeights(SimTKArrayDouble weights) {
    opensimSimulationJNI.InverseKinematicsSolver_updateOrientationWeights(swigCPtr, this, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public Vec3 computeCurrentMarkerLocation(String markerName) {
    return new Vec3(opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerLocation__SWIG_0(swigCPtr, this, markerName), true);
  }

  public Vec3 computeCurrentMarkerLocation(int markerIndex) {
    return new Vec3(opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerLocation__SWIG_1(swigCPtr, this, markerIndex), true);
  }

  public void computeCurrentMarkerLocations(SimTKArrayVec3 markerLocations) {
    opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerLocations(swigCPtr, this, SimTKArrayVec3.getCPtr(markerLocations), markerLocations);
  }

  public double computeCurrentMarkerError(String markerName) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerError__SWIG_0(swigCPtr, this, markerName);
  }

  public double computeCurrentMarkerError(int markerIndex) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerError__SWIG_1(swigCPtr, this, markerIndex);
  }

  public void computeCurrentMarkerErrors(SimTKArrayDouble markerErrors) {
    opensimSimulationJNI.InverseKinematicsSolver_computeCurrentMarkerErrors(swigCPtr, this, SimTKArrayDouble.getCPtr(markerErrors), markerErrors);
  }

  public double computeCurrentSquaredMarkerError(String markerName) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerError__SWIG_0(swigCPtr, this, markerName);
  }

  public double computeCurrentSquaredMarkerError(int markerIndex) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerError__SWIG_1(swigCPtr, this, markerIndex);
  }

  public void computeCurrentSquaredMarkerErrors(SimTKArrayDouble markerErrors) {
    opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerErrors(swigCPtr, this, SimTKArrayDouble.getCPtr(markerErrors), markerErrors);
  }

  public String getMarkerNameForIndex(int markerIndex) {
    return opensimSimulationJNI.InverseKinematicsSolver_getMarkerNameForIndex(swigCPtr, this, markerIndex);
  }

  public SWIGTYPE_p_SimTK__Rotation_T_SimTK__Real_t computeCurrentSensorOrientation(String osensorName) {
    return new SWIGTYPE_p_SimTK__Rotation_T_SimTK__Real_t(opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSensorOrientation__SWIG_0(swigCPtr, this, osensorName), true);
  }

  public SWIGTYPE_p_SimTK__Rotation_T_SimTK__Real_t computeCurrentSensorOrientation(int osensorIndex) {
    return new SWIGTYPE_p_SimTK__Rotation_T_SimTK__Real_t(opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSensorOrientation__SWIG_1(swigCPtr, this, osensorIndex), true);
  }

  public void computeCurrentSensorOrientations(SWIGTYPE_p_SimTK__Array_T_SimTK__Rotation_T_SimTK__Real_t_unsigned_int_t osensorOrientations) {
    opensimSimulationJNI.InverseKinematicsSolver_computeCurrentSensorOrientations(swigCPtr, this, SWIGTYPE_p_SimTK__Array_T_SimTK__Rotation_T_SimTK__Real_t_unsigned_int_t.getCPtr(osensorOrientations));
  }

  public double computeCurrentOrientationError(String osensorName) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentOrientationError__SWIG_0(swigCPtr, this, osensorName);
  }

  public double computeCurrentOrientationError(int osensorIndex) {
    return opensimSimulationJNI.InverseKinematicsSolver_computeCurrentOrientationError__SWIG_1(swigCPtr, this, osensorIndex);
  }

  public void computeCurrentOrientationErrors(SimTKArrayDouble osensorErrors) {
    opensimSimulationJNI.InverseKinematicsSolver_computeCurrentOrientationErrors(swigCPtr, this, SimTKArrayDouble.getCPtr(osensorErrors), osensorErrors);
  }

  public String getOrientationSensorNameForIndex(int osensorIndex) {
    return opensimSimulationJNI.InverseKinematicsSolver_getOrientationSensorNameForIndex(swigCPtr, this, osensorIndex);
  }

  public void setAdvanceTimeFromReference(boolean newValue) {
    opensimSimulationJNI.InverseKinematicsSolver_setAdvanceTimeFromReference(swigCPtr, this, newValue);
  }

}
