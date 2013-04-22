/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMailMan {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkMailMan(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkMailMan obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMailMan(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMailMan() {
    this(chilkatJNI.new_CkMailMan(), true);
  }

  public int GetSizeByUidl(String uidl) {
    return chilkatJNI.CkMailMan_GetSizeByUidl(swigCPtr, this, uidl);
  }

  public boolean SendMimeToList(String from, String distListFile, String mimeText) {
    return chilkatJNI.CkMailMan_SendMimeToList(swigCPtr, this, from, distListFile, mimeText);
  }

  public boolean SendToDistributionList(CkEmail email, CkStringArray array) {
    return chilkatJNI.CkMailMan_SendToDistributionList(swigCPtr, this, CkEmail.getCPtr(email), email, CkStringArray.getCPtr(array), array);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkMailMan_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkMailMan_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkMailMan_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public int get_Pop3SessionId() {
    return chilkatJNI.CkMailMan_get_Pop3SessionId(swigCPtr, this);
  }

  public CkStringArray MxLookupAll(String emailAddress) {
    long cPtr = chilkatJNI.CkMailMan_MxLookupAll(swigCPtr, this, emailAddress);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public boolean DeleteByMsgnum(int msgnum) {
    return chilkatJNI.CkMailMan_DeleteByMsgnum(swigCPtr, this, msgnum);
  }

  public CkEmail FetchByMsgnum(int msgnum) {
    long cPtr = chilkatJNI.CkMailMan_FetchByMsgnum(swigCPtr, this, msgnum);
    return (cPtr == 0) ? null : new CkEmail(cPtr, false);
  }

  public boolean FetchMimeByMsgnum(int msgnum, CkByteData outBytes) {
    return chilkatJNI.CkMailMan_FetchMimeByMsgnum(swigCPtr, this, msgnum, CkByteData.getCPtr(outBytes), outBytes);
  }

  public int get_SendBufferSize() {
    return chilkatJNI.CkMailMan_get_SendBufferSize(swigCPtr, this);
  }

  public void put_SendBufferSize(int newVal) {
    chilkatJNI.CkMailMan_put_SendBufferSize(swigCPtr, this, newVal);
  }

  public boolean SshTunnel(boolean bSmtp, String sshServerHostname, int sshServerPort) {
    return chilkatJNI.CkMailMan_SshTunnel(swigCPtr, this, bSmtp, sshServerHostname, sshServerPort);
  }

  public boolean SshAuthenticatePw(boolean bSmtp, String sshLogin, String sshPassword) {
    return chilkatJNI.CkMailMan_SshAuthenticatePw(swigCPtr, this, bSmtp, sshLogin, sshPassword);
  }

  public boolean SshAuthenticatePk(boolean bSmtp, String sshLogin, CkSshKey privateKey) {
    return chilkatJNI.CkMailMan_SshAuthenticatePk(swigCPtr, this, bSmtp, sshLogin, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public boolean SshCloseTunnel(boolean bSmtp) {
    return chilkatJNI.CkMailMan_SshCloseTunnel(swigCPtr, this, bSmtp);
  }

  public boolean get_IncludeRootCert() {
    return chilkatJNI.CkMailMan_get_IncludeRootCert(swigCPtr, this);
  }

  public void put_IncludeRootCert(boolean newVal) {
    chilkatJNI.CkMailMan_put_IncludeRootCert(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkMailMan_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkMailMan_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkMailMan_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkMailMan_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkMailMan_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkMailMan_put_SocksUsername(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkMailMan_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkMailMan_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkMailMan_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkMailMan_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkMailMan_put_SocksPort(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkMailMan_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkMailMan_put_SocksVersion(swigCPtr, this, newVal);
  }

  public boolean SetSslClientCertPfx(String pfxFilename, String pfxPassword) {
    return chilkatJNI.CkMailMan_SetSslClientCertPfx(swigCPtr, this, pfxFilename, pfxPassword);
  }

  public boolean SendMimeBytes(String from, String recipients, CkByteData mimeData) {
    return chilkatJNI.CkMailMan_SendMimeBytes(swigCPtr, this, from, recipients, CkByteData.getCPtr(mimeData), mimeData);
  }

  public boolean RenderToMimeBytes(CkEmail email, CkByteData outBytes) {
    return chilkatJNI.CkMailMan_RenderToMimeBytes(swigCPtr, this, CkEmail.getCPtr(email), email, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean SendMimeBytesQ(String from, String recipients, CkByteData mimeData) {
    return chilkatJNI.CkMailMan_SendMimeBytesQ(swigCPtr, this, from, recipients, CkByteData.getCPtr(mimeData), mimeData);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkMailMan_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkMailMan_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkMailMan_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkMailMan_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkMailMan_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkMailMan_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkMailMan_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkMailMan_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkMailMan_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public boolean get_AutoFix() {
    return chilkatJNI.CkMailMan_get_AutoFix(swigCPtr, this);
  }

  public void put_AutoFix(boolean newVal) {
    chilkatJNI.CkMailMan_put_AutoFix(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkMailMan_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkMailMan_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_Pop3Stls() {
    return chilkatJNI.CkMailMan_get_Pop3Stls(swigCPtr, this);
  }

  public void put_Pop3Stls(boolean newVal) {
    chilkatJNI.CkMailMan_put_Pop3Stls(swigCPtr, this, newVal);
  }

  public boolean AddPfxSourceData(CkByteData pfxData, String password) {
    return chilkatJNI.CkMailMan_AddPfxSourceData(swigCPtr, this, CkByteData.getCPtr(pfxData), pfxData, password);
  }

  public boolean AddPfxSourceFile(String pfxFilePath, String password) {
    return chilkatJNI.CkMailMan_AddPfxSourceFile(swigCPtr, this, pfxFilePath, password);
  }

  public boolean SmtpSendRawCommand(String command, String charset, boolean bEncodeBase64, CkString outStr) {
    return chilkatJNI.CkMailMan_SmtpSendRawCommand(swigCPtr, this, command, charset, bEncodeBase64, CkString.getCPtr(outStr), outStr);
  }

  public String smtpSendRawCommand(String command, String charset, boolean bEncodeBase64) {
    return chilkatJNI.CkMailMan_smtpSendRawCommand(swigCPtr, this, command, charset, bEncodeBase64);
  }

  public boolean Pop3SendRawCommand(String command, String charset, CkString outStr) {
    return chilkatJNI.CkMailMan_Pop3SendRawCommand(swigCPtr, this, command, charset, CkString.getCPtr(outStr), outStr);
  }

  public String pop3SendRawCommand(String command, String charset) {
    return chilkatJNI.CkMailMan_pop3SendRawCommand(swigCPtr, this, command, charset);
  }

  public boolean Pop3EndSessionNoQuit() {
    return chilkatJNI.CkMailMan_Pop3EndSessionNoQuit(swigCPtr, this);
  }

  public boolean SetSslClientCertPem(String pemDataOrFilename, String pemPassword) {
    return chilkatJNI.CkMailMan_SetSslClientCertPem(swigCPtr, this, pemDataOrFilename, pemPassword);
  }

  public boolean get_UseApop() {
    return chilkatJNI.CkMailMan_get_UseApop(swigCPtr, this);
  }

  public void put_UseApop(boolean newVal) {
    chilkatJNI.CkMailMan_put_UseApop(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkMailMan_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkMailMan_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkMailMan_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_RequireSslCertVerify() {
    return chilkatJNI.CkMailMan_get_RequireSslCertVerify(swigCPtr, this);
  }

  public void put_RequireSslCertVerify(boolean newVal) {
    chilkatJNI.CkMailMan_put_RequireSslCertVerify(swigCPtr, this, newVal);
  }

  public boolean get_IsSmtpConnected() {
    return chilkatJNI.CkMailMan_get_IsSmtpConnected(swigCPtr, this);
  }

  public boolean get_AutoSmtpRset() {
    return chilkatJNI.CkMailMan_get_AutoSmtpRset(swigCPtr, this);
  }

  public void put_AutoSmtpRset(boolean newVal) {
    chilkatJNI.CkMailMan_put_AutoSmtpRset(swigCPtr, this, newVal);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkMailMan_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkMailMan_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkMailMan_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkMailMan_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkMailMan_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkMailMan_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkMailMan_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public void get_PopPasswordBase64(CkString str) {
    chilkatJNI.CkMailMan_get_PopPasswordBase64(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String popPasswordBase64() {
    return chilkatJNI.CkMailMan_popPasswordBase64(swigCPtr, this);
  }

  public void put_PopPasswordBase64(String newVal) {
    chilkatJNI.CkMailMan_put_PopPasswordBase64(swigCPtr, this, newVal);
  }

  public String lastErrorText() {
    return chilkatJNI.CkMailMan_lastErrorText(swigCPtr, this);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkMailMan_lastErrorXml(swigCPtr, this);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkMailMan_lastErrorHtml(swigCPtr, this);
  }

  public String smtpPassword() {
    return chilkatJNI.CkMailMan_smtpPassword(swigCPtr, this);
  }

  public String smtpUsername() {
    return chilkatJNI.CkMailMan_smtpUsername(swigCPtr, this);
  }

  public String dsnNotify() {
    return chilkatJNI.CkMailMan_dsnNotify(swigCPtr, this);
  }

  public String dsnEnvid() {
    return chilkatJNI.CkMailMan_dsnEnvid(swigCPtr, this);
  }

  public String dsnRet() {
    return chilkatJNI.CkMailMan_dsnRet(swigCPtr, this);
  }

  public String smtpAuthMethod() {
    return chilkatJNI.CkMailMan_smtpAuthMethod(swigCPtr, this);
  }

  public String smtpLoginDomain() {
    return chilkatJNI.CkMailMan_smtpLoginDomain(swigCPtr, this);
  }

  public String filter() {
    return chilkatJNI.CkMailMan_filter(swigCPtr, this);
  }

  public String popPassword() {
    return chilkatJNI.CkMailMan_popPassword(swigCPtr, this);
  }

  public String popUsername() {
    return chilkatJNI.CkMailMan_popUsername(swigCPtr, this);
  }

  public String mailHost() {
    return chilkatJNI.CkMailMan_mailHost(swigCPtr, this);
  }

  public String heloHostname() {
    return chilkatJNI.CkMailMan_heloHostname(swigCPtr, this);
  }

  public String lastSendQFilename() {
    return chilkatJNI.CkMailMan_lastSendQFilename(swigCPtr, this);
  }

  public String version() {
    return chilkatJNI.CkMailMan_version(swigCPtr, this);
  }

  public String smtpHost() {
    return chilkatJNI.CkMailMan_smtpHost(swigCPtr, this);
  }

  public String logMailReceivedFilename() {
    return chilkatJNI.CkMailMan_logMailReceivedFilename(swigCPtr, this);
  }

  public String logMailSentFilename() {
    return chilkatJNI.CkMailMan_logMailSentFilename(swigCPtr, this);
  }

  public String mxLookup(String emailAddr) {
    return chilkatJNI.CkMailMan_mxLookup(swigCPtr, this, emailAddr);
  }

  public String renderToMime(CkEmail email) {
    return chilkatJNI.CkMailMan_renderToMime(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public String getMailboxInfoXml() {
    return chilkatJNI.CkMailMan_getMailboxInfoXml(swigCPtr, this);
  }

  public boolean VerifyRecips(CkEmail email, CkStringArray saBadAddrs) {
    return chilkatJNI.CkMailMan_VerifyRecips(swigCPtr, this, CkEmail.getCPtr(email), email, CkStringArray.getCPtr(saBadAddrs), saBadAddrs);
  }

  public boolean SetSslClientCert(CkCert cert) {
    return chilkatJNI.CkMailMan_SetSslClientCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public CkCert GetPop3SslServerCert() {
    long cPtr = chilkatJNI.CkMailMan_GetPop3SslServerCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public CkCert GetSmtpSslServerCert() {
    long cPtr = chilkatJNI.CkMailMan_GetSmtpSslServerCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean get_Pop3SslServerCertVerified() {
    return chilkatJNI.CkMailMan_get_Pop3SslServerCertVerified(swigCPtr, this);
  }

  public boolean get_SmtpSslServerCertVerified() {
    return chilkatJNI.CkMailMan_get_SmtpSslServerCertVerified(swigCPtr, this);
  }

  public int GetMailboxSize() {
    return chilkatJNI.CkMailMan_GetMailboxSize(swigCPtr, this);
  }

  public int GetMailboxCount() {
    return chilkatJNI.CkMailMan_GetMailboxCount(swigCPtr, this);
  }

  public boolean Pop3BeginSession() {
    return chilkatJNI.CkMailMan_Pop3BeginSession(swigCPtr, this);
  }

  public boolean Pop3EndSession() {
    return chilkatJNI.CkMailMan_Pop3EndSession(swigCPtr, this);
  }

  public boolean Pop3Noop() {
    return chilkatJNI.CkMailMan_Pop3Noop(swigCPtr, this);
  }

  public boolean Pop3Reset() {
    return chilkatJNI.CkMailMan_Pop3Reset(swigCPtr, this);
  }

  public void get_Pop3SessionLog(CkString log) {
    chilkatJNI.CkMailMan_get_Pop3SessionLog(swigCPtr, this, CkString.getCPtr(log), log);
  }

  public void ClearPop3SessionLog() {
    chilkatJNI.CkMailMan_ClearPop3SessionLog(swigCPtr, this);
  }

  public String pop3SessionLog() {
    return chilkatJNI.CkMailMan_pop3SessionLog(swigCPtr, this);
  }

  public boolean GetMailboxInfoXml(CkString xml) {
    return chilkatJNI.CkMailMan_GetMailboxInfoXml(swigCPtr, this, CkString.getCPtr(xml), xml);
  }

  public boolean SetDecryptCert2(CkCert cert, CkPrivateKey key) {
    return chilkatJNI.CkMailMan_SetDecryptCert2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(key), key);
  }

  public void get_SmtpSessionLog(CkString log) {
    chilkatJNI.CkMailMan_get_SmtpSessionLog(swigCPtr, this, CkString.getCPtr(log), log);
  }

  public void ClearSmtpSessionLog() {
    chilkatJNI.CkMailMan_ClearSmtpSessionLog(swigCPtr, this);
  }

  public String smtpSessionLog() {
    return chilkatJNI.CkMailMan_smtpSessionLog(swigCPtr, this);
  }

  public boolean OpenSmtpConnection() {
    return chilkatJNI.CkMailMan_OpenSmtpConnection(swigCPtr, this);
  }

  public boolean CloseSmtpConnection() {
    return chilkatJNI.CkMailMan_CloseSmtpConnection(swigCPtr, this);
  }

  public boolean SmtpReset() {
    return chilkatJNI.CkMailMan_SmtpReset(swigCPtr, this);
  }

  public boolean SmtpNoop() {
    return chilkatJNI.CkMailMan_SmtpNoop(swigCPtr, this);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkMailMan_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int millisec) {
    chilkatJNI.CkMailMan_put_HeartbeatMs(swigCPtr, this, millisec);
  }

  public void get_HeloHostname(CkString str) {
    chilkatJNI.CkMailMan_get_HeloHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_HeloHostname(String str) {
    chilkatJNI.CkMailMan_put_HeloHostname(swigCPtr, this, str);
  }

  public boolean SaveLastError(String filename) {
    return chilkatJNI.CkMailMan_SaveLastError(swigCPtr, this, filename);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkMailMan_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkMailMan_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkMailMan_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_SmtpPassword(CkString str) {
    chilkatJNI.CkMailMan_get_SmtpPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_SmtpPassword(String str) {
    chilkatJNI.CkMailMan_put_SmtpPassword(swigCPtr, this, str);
  }

  public void get_SmtpUsername(CkString str) {
    chilkatJNI.CkMailMan_get_SmtpUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_SmtpUsername(String str) {
    chilkatJNI.CkMailMan_put_SmtpUsername(swigCPtr, this, str);
  }

  public void get_DsnNotify(CkString str) {
    chilkatJNI.CkMailMan_get_DsnNotify(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_DsnNotify(String str) {
    chilkatJNI.CkMailMan_put_DsnNotify(swigCPtr, this, str);
  }

  public void get_DsnEnvid(CkString str) {
    chilkatJNI.CkMailMan_get_DsnEnvid(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_DsnEnvid(String str) {
    chilkatJNI.CkMailMan_put_DsnEnvid(swigCPtr, this, str);
  }

  public void get_DsnRet(CkString str) {
    chilkatJNI.CkMailMan_get_DsnRet(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_DsnRet(String str) {
    chilkatJNI.CkMailMan_put_DsnRet(swigCPtr, this, str);
  }

  public int get_LastSmtpStatus() {
    return chilkatJNI.CkMailMan_get_LastSmtpStatus(swigCPtr, this);
  }

  public int get_ReadTimeout() {
    return chilkatJNI.CkMailMan_get_ReadTimeout(swigCPtr, this);
  }

  public void put_ReadTimeout(int newVal) {
    chilkatJNI.CkMailMan_put_ReadTimeout(swigCPtr, this, newVal);
  }

  public int get_ConnectTimeout() {
    return chilkatJNI.CkMailMan_get_ConnectTimeout(swigCPtr, this);
  }

  public void put_ConnectTimeout(int newVal) {
    chilkatJNI.CkMailMan_put_ConnectTimeout(swigCPtr, this, newVal);
  }

  public boolean get_ResetDateOnLoad() {
    return chilkatJNI.CkMailMan_get_ResetDateOnLoad(swigCPtr, this);
  }

  public void put_ResetDateOnLoad(boolean newVal) {
    chilkatJNI.CkMailMan_put_ResetDateOnLoad(swigCPtr, this, newVal);
  }

  public boolean get_OpaqueSigning() {
    return chilkatJNI.CkMailMan_get_OpaqueSigning(swigCPtr, this);
  }

  public void put_OpaqueSigning(boolean newVal) {
    chilkatJNI.CkMailMan_put_OpaqueSigning(swigCPtr, this, newVal);
  }

  public boolean get_AllOrNone() {
    return chilkatJNI.CkMailMan_get_AllOrNone(swigCPtr, this);
  }

  public void put_AllOrNone(boolean newVal) {
    chilkatJNI.CkMailMan_put_AllOrNone(swigCPtr, this, newVal);
  }

  public boolean get_Pop3SPA() {
    return chilkatJNI.CkMailMan_get_Pop3SPA(swigCPtr, this);
  }

  public void put_Pop3SPA(boolean newVal) {
    chilkatJNI.CkMailMan_put_Pop3SPA(swigCPtr, this, newVal);
  }

  public boolean get_StartTLS() {
    return chilkatJNI.CkMailMan_get_StartTLS(swigCPtr, this);
  }

  public void put_StartTLS(boolean newVal) {
    chilkatJNI.CkMailMan_put_StartTLS(swigCPtr, this, newVal);
  }

  public boolean get_EmbedCertChain() {
    return chilkatJNI.CkMailMan_get_EmbedCertChain(swigCPtr, this);
  }

  public void put_EmbedCertChain(boolean newVal) {
    chilkatJNI.CkMailMan_put_EmbedCertChain(swigCPtr, this, newVal);
  }

  public boolean get_PopSsl() {
    return chilkatJNI.CkMailMan_get_PopSsl(swigCPtr, this);
  }

  public void put_PopSsl(boolean newVal) {
    chilkatJNI.CkMailMan_put_PopSsl(swigCPtr, this, newVal);
  }

  public boolean get_SmtpSsl() {
    return chilkatJNI.CkMailMan_get_SmtpSsl(swigCPtr, this);
  }

  public void put_SmtpSsl(boolean newVal) {
    chilkatJNI.CkMailMan_put_SmtpSsl(swigCPtr, this, newVal);
  }

  public boolean get_ImmediateDelete() {
    return chilkatJNI.CkMailMan_get_ImmediateDelete(swigCPtr, this);
  }

  public void put_ImmediateDelete(boolean newVal) {
    chilkatJNI.CkMailMan_put_ImmediateDelete(swigCPtr, this, newVal);
  }

  public boolean get_SendIndividual() {
    return chilkatJNI.CkMailMan_get_SendIndividual(swigCPtr, this);
  }

  public void put_SendIndividual(boolean newVal) {
    chilkatJNI.CkMailMan_put_SendIndividual(swigCPtr, this, newVal);
  }

  public void get_SmtpAuthMethod(CkString str) {
    chilkatJNI.CkMailMan_get_SmtpAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_SmtpAuthMethod(String str) {
    chilkatJNI.CkMailMan_put_SmtpAuthMethod(swigCPtr, this, str);
  }

  public void get_SmtpLoginDomain(CkString str) {
    chilkatJNI.CkMailMan_get_SmtpLoginDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_SmtpLoginDomain(String str) {
    chilkatJNI.CkMailMan_put_SmtpLoginDomain(swigCPtr, this, str);
  }

  public void get_Filter(CkString str) {
    chilkatJNI.CkMailMan_get_Filter(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_Filter(String str) {
    chilkatJNI.CkMailMan_put_Filter(swigCPtr, this, str);
  }

  public int get_SizeLimit() {
    return chilkatJNI.CkMailMan_get_SizeLimit(swigCPtr, this);
  }

  public void put_SizeLimit(int newVal) {
    chilkatJNI.CkMailMan_put_SizeLimit(swigCPtr, this, newVal);
  }

  public int get_MaxCount() {
    return chilkatJNI.CkMailMan_get_MaxCount(swigCPtr, this);
  }

  public void put_MaxCount(int newVal) {
    chilkatJNI.CkMailMan_put_MaxCount(swigCPtr, this, newVal);
  }

  public int get_MailPort() {
    return chilkatJNI.CkMailMan_get_MailPort(swigCPtr, this);
  }

  public void put_MailPort(int newVal) {
    chilkatJNI.CkMailMan_put_MailPort(swigCPtr, this, newVal);
  }

  public int get_SmtpPort() {
    return chilkatJNI.CkMailMan_get_SmtpPort(swigCPtr, this);
  }

  public void put_SmtpPort(int newVal) {
    chilkatJNI.CkMailMan_put_SmtpPort(swigCPtr, this, newVal);
  }

  public void get_PopPassword(CkString str) {
    chilkatJNI.CkMailMan_get_PopPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_PopPassword(String str) {
    chilkatJNI.CkMailMan_put_PopPassword(swigCPtr, this, str);
  }

  public void get_PopUsername(CkString str) {
    chilkatJNI.CkMailMan_get_PopUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_PopUsername(String str) {
    chilkatJNI.CkMailMan_put_PopUsername(swigCPtr, this, str);
  }

  public void get_MailHost(CkString str) {
    chilkatJNI.CkMailMan_get_MailHost(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_MailHost(String str) {
    chilkatJNI.CkMailMan_put_MailHost(swigCPtr, this, str);
  }

  public void get_LastSendQFilename(CkString str) {
    chilkatJNI.CkMailMan_get_LastSendQFilename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkMailMan_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_SmtpHost(CkString str) {
    chilkatJNI.CkMailMan_get_SmtpHost(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_SmtpHost(String str) {
    chilkatJNI.CkMailMan_put_SmtpHost(swigCPtr, this, str);
  }

  public boolean get_AutoGenMessageId() {
    return chilkatJNI.CkMailMan_get_AutoGenMessageId(swigCPtr, this);
  }

  public void put_AutoGenMessageId(boolean newVal) {
    chilkatJNI.CkMailMan_put_AutoGenMessageId(swigCPtr, this, newVal);
  }

  public void get_LogMailReceivedFilename(CkString str) {
    chilkatJNI.CkMailMan_get_LogMailReceivedFilename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_LogMailReceivedFilename(String str) {
    chilkatJNI.CkMailMan_put_LogMailReceivedFilename(swigCPtr, this, str);
  }

  public void get_LogMailSentFilename(CkString str) {
    chilkatJNI.CkMailMan_get_LogMailSentFilename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_LogMailSentFilename(String str) {
    chilkatJNI.CkMailMan_put_LogMailSentFilename(swigCPtr, this, str);
  }

  public void ClearBadEmailAddresses() {
    chilkatJNI.CkMailMan_ClearBadEmailAddresses(swigCPtr, this);
  }

  public CkStringArray GetBadEmailAddrs() {
    long cPtr = chilkatJNI.CkMailMan_GetBadEmailAddrs(swigCPtr, this);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public CkStringArray GetUidls() {
    long cPtr = chilkatJNI.CkMailMan_GetUidls(swigCPtr, this);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public boolean IsSmtpDsnCapable() {
    return chilkatJNI.CkMailMan_IsSmtpDsnCapable(swigCPtr, this);
  }

  public boolean VerifySmtpLogin() {
    return chilkatJNI.CkMailMan_VerifySmtpLogin(swigCPtr, this);
  }

  public boolean VerifySmtpConnection() {
    return chilkatJNI.CkMailMan_VerifySmtpConnection(swigCPtr, this);
  }

  public boolean VerifyPopLogin() {
    return chilkatJNI.CkMailMan_VerifyPopLogin(swigCPtr, this);
  }

  public boolean VerifyPopConnection() {
    return chilkatJNI.CkMailMan_VerifyPopConnection(swigCPtr, this);
  }

  public CkEmailBundle FetchMultiple(CkStringArray uidlArray) {
    long cPtr = chilkatJNI.CkMailMan_FetchMultiple(swigCPtr, this, CkStringArray.getCPtr(uidlArray), uidlArray);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkStringArray FetchMultipleMime(CkStringArray uidlArray) {
    long cPtr = chilkatJNI.CkMailMan_FetchMultipleMime(swigCPtr, this, CkStringArray.getCPtr(uidlArray), uidlArray);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public CkStringArray TransferMultipleMime(CkStringArray uidlArray) {
    long cPtr = chilkatJNI.CkMailMan_TransferMultipleMime(swigCPtr, this, CkStringArray.getCPtr(uidlArray), uidlArray);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public CkEmailBundle FetchMultipleHeaders(CkStringArray uidlArray, int numBodyLines) {
    long cPtr = chilkatJNI.CkMailMan_FetchMultipleHeaders(swigCPtr, this, CkStringArray.getCPtr(uidlArray), uidlArray, numBodyLines);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public boolean DeleteByUidl(String uidl) {
    return chilkatJNI.CkMailMan_DeleteByUidl(swigCPtr, this, uidl);
  }

  public CkEmail FetchEmail(String uidl) {
    long cPtr = chilkatJNI.CkMailMan_FetchEmail(swigCPtr, this, uidl);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean FetchMime(String uidl, CkByteData mimeBytes) {
    return chilkatJNI.CkMailMan_FetchMime(swigCPtr, this, uidl, CkByteData.getCPtr(mimeBytes), mimeBytes);
  }

  public boolean DeleteMultiple(CkStringArray uidlArray) {
    return chilkatJNI.CkMailMan_DeleteMultiple(swigCPtr, this, CkStringArray.getCPtr(uidlArray), uidlArray);
  }

  public boolean DeleteBundle(CkEmailBundle bundle) {
    return chilkatJNI.CkMailMan_DeleteBundle(swigCPtr, this, CkEmailBundle.getCPtr(bundle), bundle);
  }

  public CkEmail FetchSingleHeader(int numBodyLines, int index) {
    long cPtr = chilkatJNI.CkMailMan_FetchSingleHeader(swigCPtr, this, numBodyLines, index);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmail FetchSingleHeaderByUidl(int numBodyLines, String uidl) {
    long cPtr = chilkatJNI.CkMailMan_FetchSingleHeaderByUidl(swigCPtr, this, numBodyLines, uidl);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmail GetFullEmail(CkEmail email) {
    long cPtr = chilkatJNI.CkMailMan_GetFullEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmailBundle GetHeaders(int numBodyLines, int fromIndex, int toIndex) {
    long cPtr = chilkatJNI.CkMailMan_GetHeaders(swigCPtr, this, numBodyLines, fromIndex, toIndex);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public boolean DeleteEmail(CkEmail email) {
    return chilkatJNI.CkMailMan_DeleteEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public CkEmailBundle GetAllHeaders(int numBodyLines) {
    long cPtr = chilkatJNI.CkMailMan_GetAllHeaders(swigCPtr, this, numBodyLines);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle LoadXmlString(String xmlString) {
    long cPtr = chilkatJNI.CkMailMan_LoadXmlString(swigCPtr, this, xmlString);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle LoadXmlFile(String folderPath) {
    long cPtr = chilkatJNI.CkMailMan_LoadXmlFile(swigCPtr, this, folderPath);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmail LoadXmlEmail(String folderPath) {
    long cPtr = chilkatJNI.CkMailMan_LoadXmlEmail(swigCPtr, this, folderPath);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean MxLookup(String emailAddr, CkString strHostname) {
    return chilkatJNI.CkMailMan_MxLookup(swigCPtr, this, emailAddr, CkString.getCPtr(strHostname), strHostname);
  }

  public CkEmail LoadXmlEmailString(String xmlString) {
    long cPtr = chilkatJNI.CkMailMan_LoadXmlEmailString(swigCPtr, this, xmlString);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean QuickSend(String from, String to, String subject, String body, String smtpServer) {
    return chilkatJNI.CkMailMan_QuickSend(swigCPtr, this, from, to, subject, body, smtpServer);
  }

  public boolean UnlockComponent(String code) {
    return chilkatJNI.CkMailMan_UnlockComponent(swigCPtr, this, code);
  }

  public int CheckMail() {
    return chilkatJNI.CkMailMan_CheckMail(swigCPtr, this);
  }

  public CkEmailBundle TransferMail() {
    long cPtr = chilkatJNI.CkMailMan_TransferMail(swigCPtr, this);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle CopyMail() {
    long cPtr = chilkatJNI.CkMailMan_CopyMail(swigCPtr, this);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public boolean SendBundle(CkEmailBundle bundle) {
    return chilkatJNI.CkMailMan_SendBundle(swigCPtr, this, CkEmailBundle.getCPtr(bundle), bundle);
  }

  public boolean SendEmail(CkEmail email) {
    return chilkatJNI.CkMailMan_SendEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public boolean SendQ(CkEmail email) {
    return chilkatJNI.CkMailMan_SendQ(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public boolean SendQ2(CkEmail email, String queueDir) {
    return chilkatJNI.CkMailMan_SendQ2(swigCPtr, this, CkEmail.getCPtr(email), email, queueDir);
  }

  public CkEmailBundle LoadMbx(String mbxFileName) {
    long cPtr = chilkatJNI.CkMailMan_LoadMbx(swigCPtr, this, mbxFileName);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmail LoadEml(String emlFilename) {
    long cPtr = chilkatJNI.CkMailMan_LoadEml(swigCPtr, this, emlFilename);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmail LoadMime(String mimeText) {
    long cPtr = chilkatJNI.CkMailMan_LoadMime(swigCPtr, this, mimeText);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkMailMan_IsUnlocked(swigCPtr, this);
  }

  public boolean RenderToMime(CkEmail email, CkString str) {
    return chilkatJNI.CkMailMan_RenderToMime(swigCPtr, this, CkEmail.getCPtr(email), email, CkString.getCPtr(str), str);
  }

  public boolean SendMime(String from, String recipients, String mimeMsg) {
    return chilkatJNI.CkMailMan_SendMime(swigCPtr, this, from, recipients, mimeMsg);
  }

  public boolean SendMimeQ(String from, String recipients, String mimeMsg) {
    return chilkatJNI.CkMailMan_SendMimeQ(swigCPtr, this, from, recipients, mimeMsg);
  }

}
