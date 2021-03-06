/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoInverse extends MocoTool {
  private transient long swigCPtr;

  public MocoInverse(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoInverse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoInverse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoInverse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoInverse safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoInverse_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoInverse(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoInverse_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoInverse_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoInverse_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoInverse(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoInverse_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_kinematics(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_kinematics(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public TableProcessor get_kinematics(int i) {
    return new TableProcessor(opensimMocoJNI.MocoInverse_get_kinematics__SWIG_0(swigCPtr, this, i), false);
  }

  public TableProcessor upd_kinematics(int i) {
    return new TableProcessor(opensimMocoJNI.MocoInverse_upd_kinematics__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_kinematics(int i, TableProcessor value) {
    opensimMocoJNI.MocoInverse_set_kinematics__SWIG_0(swigCPtr, this, i, TableProcessor.getCPtr(value), value);
  }

  public int append_kinematics(TableProcessor value) {
    return opensimMocoJNI.MocoInverse_append_kinematics(swigCPtr, this, TableProcessor.getCPtr(value), value);
  }

  public void constructProperty_kinematics(TableProcessor initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_kinematics(swigCPtr, this, TableProcessor.getCPtr(initValue), initValue);
  }

  public TableProcessor get_kinematics() {
    return new TableProcessor(opensimMocoJNI.MocoInverse_get_kinematics__SWIG_1(swigCPtr, this), false);
  }

  public TableProcessor upd_kinematics() {
    return new TableProcessor(opensimMocoJNI.MocoInverse_upd_kinematics__SWIG_1(swigCPtr, this), false);
  }

  public void set_kinematics(TableProcessor value) {
    opensimMocoJNI.MocoInverse_set_kinematics__SWIG_1(swigCPtr, this, TableProcessor.getCPtr(value), value);
  }

  public void copyProperty_kinematics_allow_extra_columns(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_kinematics_allow_extra_columns(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public boolean get_kinematics_allow_extra_columns(int i) {
    return opensimMocoJNI.MocoInverse_get_kinematics_allow_extra_columns__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_kinematics_allow_extra_columns(int i) {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoInverse_upd_kinematics_allow_extra_columns__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_kinematics_allow_extra_columns(int i, boolean value) {
    opensimMocoJNI.MocoInverse_set_kinematics_allow_extra_columns__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_kinematics_allow_extra_columns(boolean value) {
    return opensimMocoJNI.MocoInverse_append_kinematics_allow_extra_columns(swigCPtr, this, value);
  }

  public void constructProperty_kinematics_allow_extra_columns(boolean initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_kinematics_allow_extra_columns(swigCPtr, this, initValue);
  }

  public boolean get_kinematics_allow_extra_columns() {
    return opensimMocoJNI.MocoInverse_get_kinematics_allow_extra_columns__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_kinematics_allow_extra_columns() {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoInverse_upd_kinematics_allow_extra_columns__SWIG_1(swigCPtr, this), false);
  }

  public void set_kinematics_allow_extra_columns(boolean value) {
    opensimMocoJNI.MocoInverse_set_kinematics_allow_extra_columns__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_minimize_sum_squared_activations(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_minimize_sum_squared_activations(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public boolean get_minimize_sum_squared_activations(int i) {
    return opensimMocoJNI.MocoInverse_get_minimize_sum_squared_activations__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_minimize_sum_squared_activations(int i) {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoInverse_upd_minimize_sum_squared_activations__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_minimize_sum_squared_activations(int i, boolean value) {
    opensimMocoJNI.MocoInverse_set_minimize_sum_squared_activations__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_minimize_sum_squared_activations(boolean value) {
    return opensimMocoJNI.MocoInverse_append_minimize_sum_squared_activations(swigCPtr, this, value);
  }

  public void constructProperty_minimize_sum_squared_activations(boolean initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_minimize_sum_squared_activations(swigCPtr, this, initValue);
  }

  public boolean get_minimize_sum_squared_activations() {
    return opensimMocoJNI.MocoInverse_get_minimize_sum_squared_activations__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_minimize_sum_squared_activations() {
    return new SWIGTYPE_p_bool(opensimMocoJNI.MocoInverse_upd_minimize_sum_squared_activations__SWIG_1(swigCPtr, this), false);
  }

  public void set_minimize_sum_squared_activations(boolean value) {
    opensimMocoJNI.MocoInverse_set_minimize_sum_squared_activations__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_max_iterations(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_max_iterations(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public int get_max_iterations(int i) {
    return opensimMocoJNI.MocoInverse_get_max_iterations__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_max_iterations(int i) {
    return new SWIGTYPE_p_int(opensimMocoJNI.MocoInverse_upd_max_iterations__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_iterations(int i, int value) {
    opensimMocoJNI.MocoInverse_set_max_iterations__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_iterations(int value) {
    return opensimMocoJNI.MocoInverse_append_max_iterations(swigCPtr, this, value);
  }

  public void constructProperty_max_iterations() {
    opensimMocoJNI.MocoInverse_constructProperty_max_iterations__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_max_iterations(int initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_max_iterations__SWIG_1(swigCPtr, this, initValue);
  }

  public int get_max_iterations() {
    return opensimMocoJNI.MocoInverse_get_max_iterations__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_max_iterations() {
    return new SWIGTYPE_p_int(opensimMocoJNI.MocoInverse_upd_max_iterations__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_iterations(int value) {
    opensimMocoJNI.MocoInverse_set_max_iterations__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_convergence_tolerance(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_convergence_tolerance(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public double get_convergence_tolerance(int i) {
    return opensimMocoJNI.MocoInverse_get_convergence_tolerance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_convergence_tolerance(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_convergence_tolerance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_convergence_tolerance(int i, double value) {
    opensimMocoJNI.MocoInverse_set_convergence_tolerance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_convergence_tolerance(double value) {
    return opensimMocoJNI.MocoInverse_append_convergence_tolerance(swigCPtr, this, value);
  }

  public void constructProperty_convergence_tolerance(double initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_convergence_tolerance(swigCPtr, this, initValue);
  }

  public double get_convergence_tolerance() {
    return opensimMocoJNI.MocoInverse_get_convergence_tolerance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_convergence_tolerance() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_convergence_tolerance__SWIG_1(swigCPtr, this), false);
  }

  public void set_convergence_tolerance(double value) {
    opensimMocoJNI.MocoInverse_set_convergence_tolerance__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_constraint_tolerance(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_constraint_tolerance(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public double get_constraint_tolerance(int i) {
    return opensimMocoJNI.MocoInverse_get_constraint_tolerance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_constraint_tolerance(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_constraint_tolerance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_constraint_tolerance(int i, double value) {
    opensimMocoJNI.MocoInverse_set_constraint_tolerance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_constraint_tolerance(double value) {
    return opensimMocoJNI.MocoInverse_append_constraint_tolerance(swigCPtr, this, value);
  }

  public void constructProperty_constraint_tolerance(double initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_constraint_tolerance(swigCPtr, this, initValue);
  }

  public double get_constraint_tolerance() {
    return opensimMocoJNI.MocoInverse_get_constraint_tolerance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_constraint_tolerance() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_constraint_tolerance__SWIG_1(swigCPtr, this), false);
  }

  public void set_constraint_tolerance(double value) {
    opensimMocoJNI.MocoInverse_set_constraint_tolerance__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_output_paths(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_output_paths(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public String get_output_paths(int i) {
    return opensimMocoJNI.MocoInverse_get_output_paths(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_output_paths(int i) {
    return new SWIGTYPE_p_std__string(opensimMocoJNI.MocoInverse_upd_output_paths(swigCPtr, this, i), false);
  }

  public void set_output_paths(int i, String value) {
    opensimMocoJNI.MocoInverse_set_output_paths(swigCPtr, this, i, value);
  }

  public int append_output_paths(String value) {
    return opensimMocoJNI.MocoInverse_append_output_paths(swigCPtr, this, value);
  }

  public void constructProperty_output_paths() {
    opensimMocoJNI.MocoInverse_constructProperty_output_paths(swigCPtr, this);
  }

  public void copyProperty_reserves_weight(MocoInverse source) {
    opensimMocoJNI.MocoInverse_copyProperty_reserves_weight(swigCPtr, this, MocoInverse.getCPtr(source), source);
  }

  public double get_reserves_weight(int i) {
    return opensimMocoJNI.MocoInverse_get_reserves_weight__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_reserves_weight(int i) {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_reserves_weight__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_reserves_weight(int i, double value) {
    opensimMocoJNI.MocoInverse_set_reserves_weight__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_reserves_weight(double value) {
    return opensimMocoJNI.MocoInverse_append_reserves_weight(swigCPtr, this, value);
  }

  public void constructProperty_reserves_weight(double initValue) {
    opensimMocoJNI.MocoInverse_constructProperty_reserves_weight(swigCPtr, this, initValue);
  }

  public double get_reserves_weight() {
    return opensimMocoJNI.MocoInverse_get_reserves_weight__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_reserves_weight() {
    return new SWIGTYPE_p_double(opensimMocoJNI.MocoInverse_upd_reserves_weight__SWIG_1(swigCPtr, this), false);
  }

  public void set_reserves_weight(double value) {
    opensimMocoJNI.MocoInverse_set_reserves_weight__SWIG_1(swigCPtr, this, value);
  }

  public MocoInverse() {
    this(opensimMocoJNI.new_MocoInverse(), true);
  }

  public void setKinematics(TableProcessor kinematics) {
    opensimMocoJNI.MocoInverse_setKinematics(swigCPtr, this, TableProcessor.getCPtr(kinematics), kinematics);
  }

  public MocoStudy initialize() {
    return new MocoStudy(opensimMocoJNI.MocoInverse_initialize(swigCPtr, this), true);
  }

  public MocoInverseSolution solve() {
    return new MocoInverseSolution(opensimMocoJNI.MocoInverse_solve(swigCPtr, this), true);
  }

}
