/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FrameIterator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public FrameIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FrameIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_FrameIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(FrameIterator other) {
    return opensimModelSimulationJNI.FrameIterator_equals(swigCPtr, this, FrameIterator.getCPtr(other), other);
  }

  public Frame __ref__() {
    return new Frame(opensimModelSimulationJNI.FrameIterator___ref__(swigCPtr, this), false);
  }

  public Frame __deref__() {
    long cPtr = opensimModelSimulationJNI.FrameIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Frame(cPtr, false);
  }

  public FrameIterator next() {
    return new FrameIterator(opensimModelSimulationJNI.FrameIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.FrameIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Frame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.FrameIterator_getConcreteClassName(swigCPtr, this);
  }

  public boolean get_has_output_position() {
    return opensimModelSimulationJNI.FrameIterator__has_output_position_get(swigCPtr, this);
  }

  public boolean get_has_output_transform() {
    return opensimModelSimulationJNI.FrameIterator__has_output_transform_get(swigCPtr, this);
  }

  public boolean get_has_output_velocity() {
    return opensimModelSimulationJNI.FrameIterator__has_output_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_acceleration() {
    return opensimModelSimulationJNI.FrameIterator__has_output_acceleration_get(swigCPtr, this);
  }

  public Transform getTransformInGround(State state) {
    return new Transform(opensimModelSimulationJNI.FrameIterator_getTransformInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getVelocityInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.FrameIterator_getVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getAccelerationInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.FrameIterator_getAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Transform findTransformBetween(State state, Frame otherFrame) {
    return new Transform(opensimModelSimulationJNI.FrameIterator_findTransformBetween(swigCPtr, this, State.getCPtr(state), state, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInAnotherFrame(State state, Vec3 vec_F, Frame otherFrame) {
    return new Vec3(opensimModelSimulationJNI.FrameIterator_expressVectorInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 findLocationInAnotherFrame(State state, Vec3 point_F, Frame otherFrame) {
    return new Vec3(opensimModelSimulationJNI.FrameIterator_findLocationInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(point_F), point_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Frame findBaseFrame() {
    return new Frame(opensimModelSimulationJNI.FrameIterator_findBaseFrame(swigCPtr, this), false);
  }

  public Transform findTransformInBaseFrame() {
    return new Transform(opensimModelSimulationJNI.FrameIterator_findTransformInBaseFrame(swigCPtr, this), true);
  }

  public Vec3 getPositionInGround(State state) {
    return new Vec3(opensimModelSimulationJNI.FrameIterator_getPositionInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Geometry get_geometry(int i) {
    return new Geometry(opensimModelSimulationJNI.FrameIterator_get_geometry(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelSimulationJNI.FrameIterator_getModel(swigCPtr, this), false);
  }

  public int getNumGeometry() {
    return opensimModelSimulationJNI.FrameIterator_getNumGeometry(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelSimulationJNI.FrameIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelSimulationJNI.FrameIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.FrameIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelSimulationJNI.FrameIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelSimulationJNI.FrameIterator_hasSystem(swigCPtr, this);
  }

  public String getFullPathName() {
    return opensimModelSimulationJNI.FrameIterator_getFullPathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelSimulationJNI.FrameIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimModelSimulationJNI.FrameIterator_hasComponent(swigCPtr, this, pathname);
  }

  public long printComponentsMatching(String substring) {
    return opensimModelSimulationJNI.FrameIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimModelSimulationJNI.FrameIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelSimulationJNI.FrameIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelSimulationJNI.FrameIterator_getNumConnectors(swigCPtr, this);
  }

  public int getNumInputs() {
    return opensimModelSimulationJNI.FrameIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelSimulationJNI.FrameIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelSimulationJNI.FrameIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelSimulationJNI.FrameIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelSimulationJNI.FrameIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelSimulationJNI.FrameIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator(opensimModelSimulationJNI.FrameIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator(opensimModelSimulationJNI.FrameIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelSimulationJNI.FrameIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelSimulationJNI.FrameIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelSimulationJNI.FrameIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.FrameIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelSimulationJNI.FrameIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelSimulationJNI.FrameIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelSimulationJNI.FrameIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.FrameIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelSimulationJNI.FrameIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelSimulationJNI.FrameIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelSimulationJNI.FrameIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelSimulationJNI.FrameIterator_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelSimulationJNI.FrameIterator_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelSimulationJNI.FrameIterator_dumpConnections(swigCPtr, this);
  }

  public AbstractConnector findConnector(String name) {
    long cPtr = opensimModelSimulationJNI.FrameIterator_findConnector(swigCPtr, this, name);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public Component getParent() {
    return new Component(opensimModelSimulationJNI.FrameIterator_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelSimulationJNI.FrameIterator_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelSimulationJNI.FrameIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelSimulationJNI.FrameIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelSimulationJNI.FrameIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelSimulationJNI.FrameIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelSimulationJNI.FrameIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelSimulationJNI.FrameIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelSimulationJNI.FrameIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelSimulationJNI.FrameIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelSimulationJNI.FrameIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelSimulationJNI.FrameIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelSimulationJNI.FrameIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelSimulationJNI.FrameIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelSimulationJNI.FrameIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelSimulationJNI.FrameIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelSimulationJNI.FrameIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelSimulationJNI.FrameIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelSimulationJNI.FrameIterator_toString(swigCPtr, this);
  }

}