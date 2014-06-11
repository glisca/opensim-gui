/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OpenSimException {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public OpenSimException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSimException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_OpenSimException(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OpenSimException(String aMsg, String aFile, int aLine) {
    this(opensimModelJNI.new_OpenSimException__SWIG_0(aMsg, aFile, aLine), true);
  }

  public OpenSimException(String aMsg, String aFile) {
    this(opensimModelJNI.new_OpenSimException__SWIG_1(aMsg, aFile), true);
  }

  public OpenSimException(String aMsg) {
    this(opensimModelJNI.new_OpenSimException__SWIG_2(aMsg), true);
  }

  public OpenSimException() {
    this(opensimModelJNI.new_OpenSimException__SWIG_3(), true);
  }

  public void setMessage(String aMsg) {
    opensimModelJNI.OpenSimException_setMessage(swigCPtr, this, aMsg);
  }

  public String getMessage() {
    return opensimModelJNI.OpenSimException_getMessage(swigCPtr, this);
  }

  public String what() {
    return opensimModelJNI.OpenSimException_what(swigCPtr, this);
  }

}
