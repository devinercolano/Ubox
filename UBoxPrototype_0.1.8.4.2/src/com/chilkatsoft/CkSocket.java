/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSocket {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkSocket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkSocket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSocket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSocket() {
    this(chilkatJNI.new_CkSocket(), true);
  }

  public boolean DnsLookup(String hostname, int maxWaitMs, CkString outStr) {
    return chilkatJNI.CkSocket_DnsLookup(swigCPtr, this, hostname, maxWaitMs, CkString.getCPtr(outStr), outStr);
  }

  public String dnsLookup(String hostname, int maxWaitMs) {
    return chilkatJNI.CkSocket_dnsLookup(swigCPtr, this, hostname, maxWaitMs);
  }

  public CkCert GetMyCert() {
    long cPtr = chilkatJNI.CkSocket_GetMyCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, false);
  }

  public CkCert GetSslServerCert() {
    long cPtr = chilkatJNI.CkSocket_GetSslServerCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, false);
  }

  public boolean ReceiveToCRLF(CkString outStr) {
    return chilkatJNI.CkSocket_ReceiveToCRLF(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String receiveToCRLF() {
    return chilkatJNI.CkSocket_receiveToCRLF(swigCPtr, this);
  }

  public void get_SessionLog(CkString str) {
    chilkatJNI.CkSocket_get_SessionLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sessionLog() {
    return chilkatJNI.CkSocket_sessionLog(swigCPtr, this);
  }

  public boolean get_KeepSessionLog() {
    return chilkatJNI.CkSocket_get_KeepSessionLog(swigCPtr, this);
  }

  public void put_KeepSessionLog(boolean newVal) {
    chilkatJNI.CkSocket_put_KeepSessionLog(swigCPtr, this, newVal);
  }

  public void get_SessionLogEncoding(CkString str) {
    chilkatJNI.CkSocket_get_SessionLogEncoding(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sessionLogEncoding() {
    return chilkatJNI.CkSocket_sessionLogEncoding(swigCPtr, this);
  }

  public void put_SessionLogEncoding(String newVal) {
    chilkatJNI.CkSocket_put_SessionLogEncoding(swigCPtr, this, newVal);
  }

  public boolean ReceiveUntilByte(int byteValue, CkByteData outBytes) {
    return chilkatJNI.CkSocket_ReceiveUntilByte(swigCPtr, this, byteValue, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void ClearSessionLog() {
    chilkatJNI.CkSocket_ClearSessionLog(swigCPtr, this);
  }

  public boolean ReceiveStringUntilByte(int byteValue, CkString outStr) {
    return chilkatJNI.CkSocket_ReceiveStringUntilByte(swigCPtr, this, byteValue, CkString.getCPtr(outStr), outStr);
  }

  public String receiveStringUntilByte(int byteValue) {
    return chilkatJNI.CkSocket_receiveStringUntilByte(swigCPtr, this, byteValue);
  }

  public boolean ReceiveStringMaxN(int maxBytes, CkString outStr) {
    return chilkatJNI.CkSocket_ReceiveStringMaxN(swigCPtr, this, maxBytes, CkString.getCPtr(outStr), outStr);
  }

  public String receiveStringMaxN(int maxBytes) {
    return chilkatJNI.CkSocket_receiveStringMaxN(swigCPtr, this, maxBytes);
  }

  public void get_SslProtocol(CkString str) {
    chilkatJNI.CkSocket_get_SslProtocol(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sslProtocol() {
    return chilkatJNI.CkSocket_sslProtocol(swigCPtr, this);
  }

  public void put_SslProtocol(String newVal) {
    chilkatJNI.CkSocket_put_SslProtocol(swigCPtr, this, newVal);
  }

  public boolean SetSslClientCert(CkCert cert) {
    return chilkatJNI.CkSocket_SetSslClientCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkSocket_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkSocket_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkSocket_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public boolean SendCount(int byteCount) {
    return chilkatJNI.CkSocket_SendCount(swigCPtr, this, byteCount);
  }

  public int ReceiveCount() {
    return chilkatJNI.CkSocket_ReceiveCount(swigCPtr, this);
  }

  public boolean get_LastMethodFailed() {
    return chilkatJNI.CkSocket_get_LastMethodFailed(swigCPtr, this);
  }

  public boolean ConvertToSsl() {
    return chilkatJNI.CkSocket_ConvertToSsl(swigCPtr, this);
  }

  public boolean ConvertFromSsl() {
    return chilkatJNI.CkSocket_ConvertFromSsl(swigCPtr, this);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkSocket_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkSocket_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkSocket_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkSocket_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public int get_ClientPort() {
    return chilkatJNI.CkSocket_get_ClientPort(swigCPtr, this);
  }

  public void put_ClientPort(int newVal) {
    chilkatJNI.CkSocket_put_ClientPort(swigCPtr, this, newVal);
  }

  public void get_LocalIpAddress(CkString str) {
    chilkatJNI.CkSocket_get_LocalIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String localIpAddress() {
    return chilkatJNI.CkSocket_localIpAddress(swigCPtr, this);
  }

  public int get_LocalPort() {
    return chilkatJNI.CkSocket_get_LocalPort(swigCPtr, this);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkSocket_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkSocket_put_SocksPort(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkSocket_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkSocket_put_SocksVersion(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkSocket_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkSocket_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkSocket_put_SocksUsername(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkSocket_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkSocket_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkSocket_put_SocksPassword(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkSocket_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkSocket_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkSocket_put_SocksHostname(swigCPtr, this, newVal);
  }

  public int CheckWriteable(int maxWaitMs) {
    return chilkatJNI.CkSocket_CheckWriteable(swigCPtr, this, maxWaitMs);
  }

  public boolean SetSslClientCertPfx(String pfxFilename, String pfxPassword) {
    return chilkatJNI.CkSocket_SetSslClientCertPfx(swigCPtr, this, pfxFilename, pfxPassword);
  }

  public boolean get_TcpNoDelay() {
    return chilkatJNI.CkSocket_get_TcpNoDelay(swigCPtr, this);
  }

  public void put_TcpNoDelay(boolean newVal) {
    chilkatJNI.CkSocket_put_TcpNoDelay(swigCPtr, this, newVal);
  }

  public boolean get_BigEndian() {
    return chilkatJNI.CkSocket_get_BigEndian(swigCPtr, this);
  }

  public void put_BigEndian(boolean newVal) {
    chilkatJNI.CkSocket_put_BigEndian(swigCPtr, this, newVal);
  }

  public boolean PollDataAvailable() {
    return chilkatJNI.CkSocket_PollDataAvailable(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSocket_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSocket_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean TakeSocket(CkSocket sock) {
    return chilkatJNI.CkSocket_TakeSocket(swigCPtr, this, CkSocket.getCPtr(sock), sock);
  }

  public int SelectForReading(int timeoutMs) {
    return chilkatJNI.CkSocket_SelectForReading(swigCPtr, this, timeoutMs);
  }

  public int SelectForWriting(int timeoutMs) {
    return chilkatJNI.CkSocket_SelectForWriting(swigCPtr, this, timeoutMs);
  }

  public int get_SelectorIndex() {
    return chilkatJNI.CkSocket_get_SelectorIndex(swigCPtr, this);
  }

  public void put_SelectorIndex(int newVal) {
    chilkatJNI.CkSocket_put_SelectorIndex(swigCPtr, this, newVal);
  }

  public int get_SelectorReadIndex() {
    return chilkatJNI.CkSocket_get_SelectorReadIndex(swigCPtr, this);
  }

  public void put_SelectorReadIndex(int newVal) {
    chilkatJNI.CkSocket_put_SelectorReadIndex(swigCPtr, this, newVal);
  }

  public int get_SelectorWriteIndex() {
    return chilkatJNI.CkSocket_get_SelectorWriteIndex(swigCPtr, this);
  }

  public void put_SelectorWriteIndex(int newVal) {
    chilkatJNI.CkSocket_put_SelectorWriteIndex(swigCPtr, this, newVal);
  }

  public int get_NumSocketsInSet() {
    return chilkatJNI.CkSocket_get_NumSocketsInSet(swigCPtr, this);
  }

  public void get_UserData(CkString str) {
    chilkatJNI.CkSocket_get_UserData(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String userData() {
    return chilkatJNI.CkSocket_userData(swigCPtr, this);
  }

  public void put_UserData(String newVal) {
    chilkatJNI.CkSocket_put_UserData(swigCPtr, this, newVal);
  }

  public void StartTiming() {
    chilkatJNI.CkSocket_StartTiming(swigCPtr, this);
  }

  public int get_ElapsedSeconds() {
    return chilkatJNI.CkSocket_get_ElapsedSeconds(swigCPtr, this);
  }

  public boolean ReceiveBytesToFile(String appendFilename) {
    return chilkatJNI.CkSocket_ReceiveBytesToFile(swigCPtr, this, appendFilename);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkSocket_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkSocket_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkSocket_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkSocket_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkSocket_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkSocket_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkSocket_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkSocket_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkSocket_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkSocket_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkSocket_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkSocket_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkSocket_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkSocket_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public int get_NumSslAcceptableClientCAs() {
    return chilkatJNI.CkSocket_get_NumSslAcceptableClientCAs(swigCPtr, this);
  }

  public boolean GetSslAcceptableClientCaDn(int index, CkString outStr) {
    return chilkatJNI.CkSocket_GetSslAcceptableClientCaDn(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getSslAcceptableClientCaDn(int index) {
    return chilkatJNI.CkSocket_getSslAcceptableClientCaDn(swigCPtr, this, index);
  }

  public boolean AddSslAcceptableClientCaDn(String certAuthDN) {
    return chilkatJNI.CkSocket_AddSslAcceptableClientCaDn(swigCPtr, this, certAuthDN);
  }

  public int get_ReceivedCount() {
    return chilkatJNI.CkSocket_get_ReceivedCount(swigCPtr, this);
  }

  public void put_ReceivedCount(int newVal) {
    chilkatJNI.CkSocket_put_ReceivedCount(swigCPtr, this, newVal);
  }

  public boolean SetSslClientCertPem(String pemDataOrFilename, String pemPassword) {
    return chilkatJNI.CkSocket_SetSslClientCertPem(swigCPtr, this, pemDataOrFilename, pemPassword);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSocket_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSocket_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSocket_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean SendByteData(CkByteData data) {
    return chilkatJNI.CkSocket_SendByteData(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean AsyncSendByteData(CkByteData data) {
    return chilkatJNI.CkSocket_AsyncSendByteData(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public int get_NumReceivedClientCerts() {
    return chilkatJNI.CkSocket_get_NumReceivedClientCerts(swigCPtr, this);
  }

  public CkCert GetReceivedClientCert(int index) {
    long cPtr = chilkatJNI.CkSocket_GetReceivedClientCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, false);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkSocket_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkSocket_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkSocket_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public boolean get_SoReuseAddr() {
    return chilkatJNI.CkSocket_get_SoReuseAddr(swigCPtr, this);
  }

  public void put_SoReuseAddr(boolean newVal) {
    chilkatJNI.CkSocket_put_SoReuseAddr(swigCPtr, this, newVal);
  }

  public boolean get_ListenIpv6() {
    return chilkatJNI.CkSocket_get_ListenIpv6(swigCPtr, this);
  }

  public void put_ListenIpv6(boolean newVal) {
    chilkatJNI.CkSocket_put_ListenIpv6(swigCPtr, this, newVal);
  }

  public boolean UnlockComponent(String code) {
    return chilkatJNI.CkSocket_UnlockComponent(swigCPtr, this, code);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkSocket_IsUnlocked(swigCPtr, this);
  }

  public boolean AsyncSendString(String str) {
    return chilkatJNI.CkSocket_AsyncSendString(swigCPtr, this, str);
  }

  public boolean get_AsyncSendFinished() {
    return chilkatJNI.CkSocket_get_AsyncSendFinished(swigCPtr, this);
  }

  public void AsyncSendAbort() {
    chilkatJNI.CkSocket_AsyncSendAbort(swigCPtr, this);
  }

  public void get_AsyncSendLog(CkString str) {
    chilkatJNI.CkSocket_get_AsyncSendLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AsyncSendSuccess() {
    return chilkatJNI.CkSocket_get_AsyncSendSuccess(swigCPtr, this);
  }

  public boolean AsyncReceiveBytes() {
    return chilkatJNI.CkSocket_AsyncReceiveBytes(swigCPtr, this);
  }

  public boolean AsyncReceiveBytesN(int numBytes) {
    return chilkatJNI.CkSocket_AsyncReceiveBytesN(swigCPtr, this, numBytes);
  }

  public boolean AsyncReceiveString() {
    return chilkatJNI.CkSocket_AsyncReceiveString(swigCPtr, this);
  }

  public boolean AsyncReceiveToCRLF() {
    return chilkatJNI.CkSocket_AsyncReceiveToCRLF(swigCPtr, this);
  }

  public boolean AsyncReceiveUntilMatch(String matchStr) {
    return chilkatJNI.CkSocket_AsyncReceiveUntilMatch(swigCPtr, this, matchStr);
  }

  public boolean get_AsyncReceiveFinished() {
    return chilkatJNI.CkSocket_get_AsyncReceiveFinished(swigCPtr, this);
  }

  public void AsyncReceiveAbort() {
    chilkatJNI.CkSocket_AsyncReceiveAbort(swigCPtr, this);
  }

  public void get_AsyncReceiveLog(CkString str) {
    chilkatJNI.CkSocket_get_AsyncReceiveLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AsyncReceiveSuccess() {
    return chilkatJNI.CkSocket_get_AsyncReceiveSuccess(swigCPtr, this);
  }

  public void get_AsyncReceivedString(CkString str) {
    chilkatJNI.CkSocket_get_AsyncReceivedString(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_AsyncReceivedBytes(CkByteData byteData) {
    chilkatJNI.CkSocket_get_AsyncReceivedBytes(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public String asyncReceivedString() {
    return chilkatJNI.CkSocket_asyncReceivedString(swigCPtr, this);
  }

  public String asyncReceiveLog() {
    return chilkatJNI.CkSocket_asyncReceiveLog(swigCPtr, this);
  }

  public String asyncSendLog() {
    return chilkatJNI.CkSocket_asyncSendLog(swigCPtr, this);
  }

  public void SleepMs(int millisec) {
    chilkatJNI.CkSocket_SleepMs(swigCPtr, this, millisec);
  }

  public void Close(int maxWaitMs) {
    chilkatJNI.CkSocket_Close(swigCPtr, this, maxWaitMs);
  }

  public int get_ObjectId() {
    return chilkatJNI.CkSocket_get_ObjectId(swigCPtr, this);
  }

  public boolean SaveLastError(String filename) {
    return chilkatJNI.CkSocket_SaveLastError(swigCPtr, this, filename);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSocket_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSocket_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSocket_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSocket_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean AsyncDnsStart(String hostname, int maxWaitMs) {
    return chilkatJNI.CkSocket_AsyncDnsStart(swigCPtr, this, hostname, maxWaitMs);
  }

  public boolean get_AsyncDnsFinished() {
    return chilkatJNI.CkSocket_get_AsyncDnsFinished(swigCPtr, this);
  }

  public void get_AsyncDnsResult(CkString str) {
    chilkatJNI.CkSocket_get_AsyncDnsResult(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void AsyncDnsAbort() {
    chilkatJNI.CkSocket_AsyncDnsAbort(swigCPtr, this);
  }

  public void get_AsyncDnsLog(CkString str) {
    chilkatJNI.CkSocket_get_AsyncDnsLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AsyncDnsSuccess() {
    return chilkatJNI.CkSocket_get_AsyncDnsSuccess(swigCPtr, this);
  }

  public boolean AsyncConnectStart(String hostname, int port, boolean ssl, int maxWaitMs) {
    return chilkatJNI.CkSocket_AsyncConnectStart(swigCPtr, this, hostname, port, ssl, maxWaitMs);
  }

  public boolean get_AsyncConnectFinished() {
    return chilkatJNI.CkSocket_get_AsyncConnectFinished(swigCPtr, this);
  }

  public void AsyncConnectAbort() {
    chilkatJNI.CkSocket_AsyncConnectAbort(swigCPtr, this);
  }

  public void get_AsyncConnectLog(CkString str) {
    chilkatJNI.CkSocket_get_AsyncConnectLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AsyncConnectSuccess() {
    return chilkatJNI.CkSocket_get_AsyncConnectSuccess(swigCPtr, this);
  }

  public void get_MyIpAddress(CkString str) {
    chilkatJNI.CkSocket_get_MyIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean BindAndListen(int port, int backlog) {
    return chilkatJNI.CkSocket_BindAndListen(swigCPtr, this, port, backlog);
  }

  public boolean Connect(String hostname, int port, boolean ssl, int maxWaitMs) {
    return chilkatJNI.CkSocket_Connect(swigCPtr, this, hostname, port, ssl, maxWaitMs);
  }

  public CkSocket AcceptNextConnection(int maxWaitMs) {
    long cPtr = chilkatJNI.CkSocket_AcceptNextConnection(swigCPtr, this, maxWaitMs);
    return (cPtr == 0) ? null : new CkSocket(cPtr, true);
  }

  public boolean get_Ssl() {
    return chilkatJNI.CkSocket_get_Ssl(swigCPtr, this);
  }

  public void put_Ssl(boolean newVal) {
    chilkatJNI.CkSocket_put_Ssl(swigCPtr, this, newVal);
  }

  public boolean InitSslServer(CkCert cert) {
    return chilkatJNI.CkSocket_InitSslServer(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public int get_ConnectFailReason() {
    return chilkatJNI.CkSocket_get_ConnectFailReason(swigCPtr, this);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkSocket_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int millisec) {
    chilkatJNI.CkSocket_put_HeartbeatMs(swigCPtr, this, millisec);
  }

  public int get_MaxSendIdleMs() {
    return chilkatJNI.CkSocket_get_MaxSendIdleMs(swigCPtr, this);
  }

  public void put_MaxSendIdleMs(int millisec) {
    chilkatJNI.CkSocket_put_MaxSendIdleMs(swigCPtr, this, millisec);
  }

  public int get_MaxReadIdleMs() {
    return chilkatJNI.CkSocket_get_MaxReadIdleMs(swigCPtr, this);
  }

  public void put_MaxReadIdleMs(int millisec) {
    chilkatJNI.CkSocket_put_MaxReadIdleMs(swigCPtr, this, millisec);
  }

  public void get_StringCharset(CkString str) {
    chilkatJNI.CkSocket_get_StringCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_StringCharset(String str) {
    chilkatJNI.CkSocket_put_StringCharset(swigCPtr, this, str);
  }

  public int get_DebugDnsDelayMs() {
    return chilkatJNI.CkSocket_get_DebugDnsDelayMs(swigCPtr, this);
  }

  public void put_DebugDnsDelayMs(int millisec) {
    chilkatJNI.CkSocket_put_DebugDnsDelayMs(swigCPtr, this, millisec);
  }

  public int get_DebugConnectDelayMs() {
    return chilkatJNI.CkSocket_get_DebugConnectDelayMs(swigCPtr, this);
  }

  public void put_DebugConnectDelayMs(int millisec) {
    chilkatJNI.CkSocket_put_DebugConnectDelayMs(swigCPtr, this, millisec);
  }

  public boolean get_IsConnected() {
    return chilkatJNI.CkSocket_get_IsConnected(swigCPtr, this);
  }

  public int get_RemotePort() {
    return chilkatJNI.CkSocket_get_RemotePort(swigCPtr, this);
  }

  public void get_RemoteIpAddress(CkString str) {
    chilkatJNI.CkSocket_get_RemoteIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean AsyncAcceptStart(int maxWaitMs) {
    return chilkatJNI.CkSocket_AsyncAcceptStart(swigCPtr, this, maxWaitMs);
  }

  public boolean get_AsyncAcceptFinished() {
    return chilkatJNI.CkSocket_get_AsyncAcceptFinished(swigCPtr, this);
  }

  public void AsyncAcceptAbort() {
    chilkatJNI.CkSocket_AsyncAcceptAbort(swigCPtr, this);
  }

  public void get_AsyncAcceptLog(CkString str) {
    chilkatJNI.CkSocket_get_AsyncAcceptLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_AsyncAcceptSuccess() {
    return chilkatJNI.CkSocket_get_AsyncAcceptSuccess(swigCPtr, this);
  }

  public CkSocket AsyncAcceptSocket() {
    long cPtr = chilkatJNI.CkSocket_AsyncAcceptSocket(swigCPtr, this);
    return (cPtr == 0) ? null : new CkSocket(cPtr, true);
  }

  public void BuildHttpGetRequest(String url, CkString str) {
    chilkatJNI.CkSocket_BuildHttpGetRequest(swigCPtr, this, url, CkString.getCPtr(str), str);
  }

  public int get_SendPacketSize() {
    return chilkatJNI.CkSocket_get_SendPacketSize(swigCPtr, this);
  }

  public void put_SendPacketSize(int sizeInBytes) {
    chilkatJNI.CkSocket_put_SendPacketSize(swigCPtr, this, sizeInBytes);
  }

  public int get_ReceivePacketSize() {
    return chilkatJNI.CkSocket_get_ReceivePacketSize(swigCPtr, this);
  }

  public void put_ReceivePacketSize(int sizeInBytes) {
    chilkatJNI.CkSocket_put_ReceivePacketSize(swigCPtr, this, sizeInBytes);
  }

  public boolean SendString(String str) {
    return chilkatJNI.CkSocket_SendString(swigCPtr, this, str);
  }

  public boolean ReceiveString(CkString strOut) {
    return chilkatJNI.CkSocket_ReceiveString(swigCPtr, this, CkString.getCPtr(strOut), strOut);
  }

  public boolean ReceiveUntilMatch(String matchStr, CkString strOut) {
    return chilkatJNI.CkSocket_ReceiveUntilMatch(swigCPtr, this, matchStr, CkString.getCPtr(strOut), strOut);
  }

  public boolean ReceiveBytes(CkByteData byteData) {
    return chilkatJNI.CkSocket_ReceiveBytes(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public boolean ReceiveBytesN(int numBytes, CkByteData byteData) {
    return chilkatJNI.CkSocket_ReceiveBytesN(swigCPtr, this, numBytes, CkByteData.getCPtr(byteData), byteData);
  }

  public String stringCharset() {
    return chilkatJNI.CkSocket_stringCharset(swigCPtr, this);
  }

  public String remoteIpAddress() {
    return chilkatJNI.CkSocket_remoteIpAddress(swigCPtr, this);
  }

  public String asyncAcceptLog() {
    return chilkatJNI.CkSocket_asyncAcceptLog(swigCPtr, this);
  }

  public String buildHttpGetRequest(String url) {
    return chilkatJNI.CkSocket_buildHttpGetRequest(swigCPtr, this, url);
  }

  public String receiveString() {
    return chilkatJNI.CkSocket_receiveString(swigCPtr, this);
  }

  public String receiveUntilMatch(String matchStr) {
    return chilkatJNI.CkSocket_receiveUntilMatch(swigCPtr, this, matchStr);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSocket_lastErrorText(swigCPtr, this);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSocket_lastErrorXml(swigCPtr, this);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSocket_lastErrorHtml(swigCPtr, this);
  }

  public String asyncDnsResult() {
    return chilkatJNI.CkSocket_asyncDnsResult(swigCPtr, this);
  }

  public String asyncDnsLog() {
    return chilkatJNI.CkSocket_asyncDnsLog(swigCPtr, this);
  }

  public String asyncConnectLog() {
    return chilkatJNI.CkSocket_asyncConnectLog(swigCPtr, this);
  }

  public String myIpAddress() {
    return chilkatJNI.CkSocket_myIpAddress(swigCPtr, this);
  }

  public String version() {
    return chilkatJNI.CkSocket_version(swigCPtr, this);
  }

}