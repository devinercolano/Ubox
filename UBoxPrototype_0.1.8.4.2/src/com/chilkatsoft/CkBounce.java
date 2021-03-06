/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkBounce {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkBounce(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkBounce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkBounce(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkBounce() {
    this(chilkatJNI.new_CkBounce(), true);
  }

  public String lastErrorText() {
    return chilkatJNI.CkBounce_lastErrorText(swigCPtr, this);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkBounce_lastErrorXml(swigCPtr, this);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkBounce_lastErrorHtml(swigCPtr, this);
  }

  public String bounceAddress() {
    return chilkatJNI.CkBounce_bounceAddress(swigCPtr, this);
  }

  public String bounceData() {
    return chilkatJNI.CkBounce_bounceData(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkBounce_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkBounce_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkBounce_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkBounce_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkBounce_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkBounce_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkBounce_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean ExamineEmail(CkEmail email) {
    return chilkatJNI.CkBounce_ExamineEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public boolean ExamineMime(String mimeString) {
    return chilkatJNI.CkBounce_ExamineMime(swigCPtr, this, mimeString);
  }

  public boolean ExamineEml(String emlFilename) {
    return chilkatJNI.CkBounce_ExamineEml(swigCPtr, this, emlFilename);
  }

  public int get_BounceType() {
    return chilkatJNI.CkBounce_get_BounceType(swigCPtr, this);
  }

  public void get_BounceAddress(CkString bouncedEmailAddr) {
    chilkatJNI.CkBounce_get_BounceAddress(swigCPtr, this, CkString.getCPtr(bouncedEmailAddr), bouncedEmailAddr);
  }

  public void get_BounceData(CkString mailBodyText) {
    chilkatJNI.CkBounce_get_BounceData(swigCPtr, this, CkString.getCPtr(mailBodyText), mailBodyText);
  }

  public boolean SaveLastError(String filename) {
    return chilkatJNI.CkBounce_SaveLastError(swigCPtr, this, filename);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkBounce_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkBounce_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkBounce_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

}
