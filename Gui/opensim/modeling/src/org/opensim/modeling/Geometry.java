/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Geometry extends Component {
  private long swigCPtr;

  public Geometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Geometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Geometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Geometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Geometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Geometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Geometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Geometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Geometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Geometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Geometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_scale_factors(Geometry source) {
    opensimModelJNI.Geometry_copyProperty_scale_factors(swigCPtr, this, Geometry.getCPtr(source), source);
  }

  public Vec3 get_scale_factors(int i) {
    return new Vec3(opensimModelJNI.Geometry_get_scale_factors__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_scale_factors(int i) {
    return new Vec3(opensimModelJNI.Geometry_upd_scale_factors__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_scale_factors(int i, Vec3 value) {
    opensimModelJNI.Geometry_set_scale_factors__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_scale_factors(Vec3 value) {
    return opensimModelJNI.Geometry_append_scale_factors(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_scale_factors(Vec3 initValue) {
    opensimModelJNI.Geometry_constructProperty_scale_factors(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_scale_factors() {
    return new Vec3(opensimModelJNI.Geometry_get_scale_factors__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_scale_factors() {
    return new Vec3(opensimModelJNI.Geometry_upd_scale_factors__SWIG_1(swigCPtr, this), false);
  }

  public void set_scale_factors(Vec3 value) {
    opensimModelJNI.Geometry_set_scale_factors__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_frame_name(Geometry source) {
    opensimModelJNI.Geometry_copyProperty_frame_name(swigCPtr, this, Geometry.getCPtr(source), source);
  }

  public String get_frame_name(int i) {
    return opensimModelJNI.Geometry_get_frame_name__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_frame_name(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Geometry_upd_frame_name__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_frame_name(int i, String value) {
    opensimModelJNI.Geometry_set_frame_name__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_frame_name(String value) {
    return opensimModelJNI.Geometry_append_frame_name(swigCPtr, this, value);
  }

  public void constructProperty_frame_name() {
    opensimModelJNI.Geometry_constructProperty_frame_name__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_frame_name(String initValue) {
    opensimModelJNI.Geometry_constructProperty_frame_name__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_frame_name() {
    return opensimModelJNI.Geometry_get_frame_name__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_frame_name() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Geometry_upd_frame_name__SWIG_1(swigCPtr, this), false);
  }

  public void set_frame_name(String value) {
    opensimModelJNI.Geometry_set_frame_name__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Appearance(Geometry source) {
    opensimModelJNI.Geometry_copyProperty_Appearance(swigCPtr, this, Geometry.getCPtr(source), source);
  }

  public Appearance get_Appearance(int i) {
    return new Appearance(opensimModelJNI.Geometry_get_Appearance__SWIG_0(swigCPtr, this, i), false);
  }

  public Appearance upd_Appearance(int i) {
    return new Appearance(opensimModelJNI.Geometry_upd_Appearance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Appearance(int i, Appearance value) {
    opensimModelJNI.Geometry_set_Appearance__SWIG_0(swigCPtr, this, i, Appearance.getCPtr(value), value);
  }

  public int append_Appearance(Appearance value) {
    return opensimModelJNI.Geometry_append_Appearance(swigCPtr, this, Appearance.getCPtr(value), value);
  }

  public void constructProperty_Appearance(Appearance initValue) {
    opensimModelJNI.Geometry_constructProperty_Appearance(swigCPtr, this, Appearance.getCPtr(initValue), initValue);
  }

  public Appearance get_Appearance() {
    return new Appearance(opensimModelJNI.Geometry_get_Appearance__SWIG_1(swigCPtr, this), false);
  }

  public Appearance upd_Appearance() {
    return new Appearance(opensimModelJNI.Geometry_upd_Appearance__SWIG_1(swigCPtr, this), false);
  }

  public void set_Appearance(Appearance value) {
    opensimModelJNI.Geometry_set_Appearance__SWIG_1(swigCPtr, this, Appearance.getCPtr(value), value);
  }

  public Transform getTransform(State state, RigidFrame frame) {
    return new Transform(opensimModelJNI.Geometry_getTransform(swigCPtr, this, State.getCPtr(state), state, RigidFrame.getCPtr(frame), frame), true);
  }

  public void setDecorativeGeometryAppearance(DecorativeGeometry decoration) {
    opensimModelJNI.Geometry_setDecorativeGeometryAppearance(swigCPtr, this, DecorativeGeometry.getCPtr(decoration), decoration);
  }

  public void setColor(Vec3 color) {
    opensimModelJNI.Geometry_setColor(swigCPtr, this, Vec3.getCPtr(color), color);
  }

  public Vec3 getColor() {
    return new Vec3(opensimModelJNI.Geometry_getColor(swigCPtr, this), false);
  }

  public void setOpacity(double opacity) {
    opensimModelJNI.Geometry_setOpacity(swigCPtr, this, opacity);
  }

  public double getOpacity() {
    return opensimModelJNI.Geometry_getOpacity(swigCPtr, this);
  }

  public void setRepresentation(Geometry.Representation rep) {
    opensimModelJNI.Geometry_setRepresentation(swigCPtr, this, rep.swigValue());
  }

  public Geometry.Representation getRepresentation() {
    return Geometry.Representation.swigToEnum(opensimModelJNI.Geometry_getRepresentation(swigCPtr, this));
  }

  public void setOwnerModelComponent(ModelComponent mc) {
    opensimModelJNI.Geometry_setOwnerModelComponent(swigCPtr, this, ModelComponent.getCPtr(mc), mc);
  }

  public ModelComponent getOwnerModelComponent() {
    return new ModelComponent(opensimModelJNI.Geometry_getOwnerModelComponent(swigCPtr, this), false);
  }

  public String getFrameName() {
    return opensimModelJNI.Geometry_getFrameName(swigCPtr, this);
  }

  public void createDecorativeGeometry(ArrayDecorativeGeometry arg0) {
    opensimModelJNI.Geometry_createDecorativeGeometry(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(arg0), arg0);
  }

  public final static class Representation {
    public final static Geometry.Representation Hide = new Geometry.Representation("Hide", opensimModelJNI.Geometry_Hide_get());
    public final static Geometry.Representation DrawPoints = new Geometry.Representation("DrawPoints", opensimModelJNI.Geometry_DrawPoints_get());
    public final static Geometry.Representation DrawWireframe = new Geometry.Representation("DrawWireframe", opensimModelJNI.Geometry_DrawWireframe_get());
    public final static Geometry.Representation DrawSurface = new Geometry.Representation("DrawSurface", opensimModelJNI.Geometry_DrawSurface_get());
    public final static Geometry.Representation DrawDefault = new Geometry.Representation("DrawDefault", opensimModelJNI.Geometry_DrawDefault_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Representation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Representation.class + " with value " + swigValue);
    }

    private Representation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Representation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Representation(String swigName, Representation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Representation[] swigValues = { Hide, DrawPoints, DrawWireframe, DrawSurface, DrawDefault };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}