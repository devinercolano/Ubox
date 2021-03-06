/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkZipCrc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkZipCrc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkZipCrc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkZipCrc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkZipCrc() {
    this(chilkatJNI.new_CkZipCrc(), true);
  }

  public void ToHex(int crc, CkString strHex) {
    chilkatJNI.CkZipCrc_ToHex(swigCPtr, this, crc, CkString.getCPtr(strHex), strHex);
  }

  public int FileCrc(String filename) {
    return chilkatJNI.CkZipCrc_FileCrc(swigCPtr, this, filename);
  }

  public int CalculateCrc(CkByteData byteData) {
    return chilkatJNI.CkZipCrc_CalculateCrc(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public void MoreData(CkByteData byteData) {
    chilkatJNI.CkZipCrc_MoreData(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public int EndStream() {
    return chilkatJNI.CkZipCrc_EndStream(swigCPtr, this);
  }

  public void BeginStream() {
    chilkatJNI.CkZipCrc_BeginStream(swigCPtr, this);
  }

  public String toHex(int crc) {
    return chilkatJNI.CkZipCrc_toHex(swigCPtr, this, crc);
  }

}
