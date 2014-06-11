/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactMesh extends ContactGeometry {
  private long swigCPtr;

  public ContactMesh(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ContactMesh_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ContactMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactMesh safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ContactMesh_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactMesh(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ContactMesh_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ContactMesh_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ContactMesh_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactMesh(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ContactMesh_getConcreteClassName(swigCPtr, this);
  }

  public ContactMesh() {
    this(opensimModelJNI.new_ContactMesh__SWIG_0(), true);
  }

  public ContactMesh(String filename, Vec3 location, Vec3 orientation, Body body) {
    this(opensimModelJNI.new_ContactMesh__SWIG_1(filename, Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, Body.getCPtr(body), body), true);
  }

  public ContactMesh(String filename, Vec3 location, Vec3 orientation, Body body, String name) {
    this(opensimModelJNI.new_ContactMesh__SWIG_2(filename, Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, Body.getCPtr(body), body, name), true);
  }

  public ContactMesh(ContactMesh geom) {
    this(opensimModelJNI.new_ContactMesh__SWIG_3(ContactMesh.getCPtr(geom), geom), true);
  }

  public void copyData(ContactMesh source) {
    opensimModelJNI.ContactMesh_copyData(swigCPtr, this, ContactMesh.getCPtr(source), source);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimModelJNI.ContactMesh_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public String getFilename() {
    return opensimModelJNI.ContactMesh_getFilename(swigCPtr, this);
  }

  public void setFilename(String filename) {
    opensimModelJNI.ContactMesh_setFilename(swigCPtr, this, filename);
  }

}
