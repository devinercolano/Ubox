/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkImap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkImap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkImap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkImap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkImap() {
    this(chilkatJNI.new_CkImap(), true);
  }

  public void get_LastAppendedMime(CkString str) {
    chilkatJNI.CkImap_get_LastAppendedMime(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastAppendedMime() {
    return chilkatJNI.CkImap_lastAppendedMime(swigCPtr, this);
  }

  public void get_LastIntermediateResponse(CkString str) {
    chilkatJNI.CkImap_get_LastIntermediateResponse(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastIntermediateResponse() {
    return chilkatJNI.CkImap_lastIntermediateResponse(swigCPtr, this);
  }

  public void get_LastResponse(CkString str) {
    chilkatJNI.CkImap_get_LastResponse(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastResponse() {
    return chilkatJNI.CkImap_lastResponse(swigCPtr, this);
  }

  public void get_LastCommand(CkString str) {
    chilkatJNI.CkImap_get_LastCommand(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastCommand() {
    return chilkatJNI.CkImap_lastCommand(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkImap_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkImap_version(swigCPtr, this);
  }

  public boolean AppendMimeWithFlags(String mailbox, String mimeText, boolean seen, boolean flagged, boolean answered, boolean draft) {
    return chilkatJNI.CkImap_AppendMimeWithFlags(swigCPtr, this, mailbox, mimeText, seen, flagged, answered, draft);
  }

  public boolean Subscribe(String mailbox) {
    return chilkatJNI.CkImap_Subscribe(swigCPtr, this, mailbox);
  }

  public boolean Unsubscribe(String mailbox) {
    return chilkatJNI.CkImap_Unsubscribe(swigCPtr, this, mailbox);
  }

  public boolean FetchSingleHeaderAsMime(int msgId, boolean bUID, CkString outStr) {
    return chilkatJNI.CkImap_FetchSingleHeaderAsMime(swigCPtr, this, msgId, bUID, CkString.getCPtr(outStr), outStr);
  }

  public String fetchSingleHeaderAsMime(int msgId, boolean bUID) {
    return chilkatJNI.CkImap_fetchSingleHeaderAsMime(swigCPtr, this, msgId, bUID);
  }

  public boolean AppendMimeWithDate(String mailbox, String mimeText, SYSTEMTIME internalDate) {
    return chilkatJNI.CkImap_AppendMimeWithDate(swigCPtr, this, mailbox, mimeText, SYSTEMTIME.getCPtr(internalDate), internalDate);
  }

  public void get_SelectedMailbox(CkString str) {
    chilkatJNI.CkImap_get_SelectedMailbox(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String selectedMailbox() {
    return chilkatJNI.CkImap_selectedMailbox(swigCPtr, this);
  }

  public int get_AppendUid() {
    return chilkatJNI.CkImap_get_AppendUid(swigCPtr, this);
  }

  public void get_AuthzId(CkString str) {
    chilkatJNI.CkImap_get_AuthzId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String authzId() {
    return chilkatJNI.CkImap_authzId(swigCPtr, this);
  }

  public void put_AuthzId(String newVal) {
    chilkatJNI.CkImap_put_AuthzId(swigCPtr, this, newVal);
  }

  public int get_SendBufferSize() {
    return chilkatJNI.CkImap_get_SendBufferSize(swigCPtr, this);
  }

  public void put_SendBufferSize(int newVal) {
    chilkatJNI.CkImap_put_SendBufferSize(swigCPtr, this, newVal);
  }

  public boolean SshTunnel(String sshServerHostname, int sshServerPort) {
    return chilkatJNI.CkImap_SshTunnel(swigCPtr, this, sshServerHostname, sshServerPort);
  }

  public boolean SshAuthenticatePw(String sshLogin, String sshPassword) {
    return chilkatJNI.CkImap_SshAuthenticatePw(swigCPtr, this, sshLogin, sshPassword);
  }

  public boolean SshAuthenticatePk(String sshLogin, CkSshKey privateKey) {
    return chilkatJNI.CkImap_SshAuthenticatePk(swigCPtr, this, sshLogin, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public boolean Noop() {
    return chilkatJNI.CkImap_Noop(swigCPtr, this);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkImap_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkImap_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkImap_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkImap_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkImap_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkImap_put_SocksUsername(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkImap_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkImap_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkImap_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkImap_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkImap_put_SocksPort(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkImap_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkImap_put_SocksVersion(swigCPtr, this, newVal);
  }

  public boolean SetSslClientCertPfx(String pfxFilename, String pfxPassword) {
    return chilkatJNI.CkImap_SetSslClientCertPfx(swigCPtr, this, pfxFilename, pfxPassword);
  }

  public boolean get_StartTls() {
    return chilkatJNI.CkImap_get_StartTls(swigCPtr, this);
  }

  public void put_StartTls(boolean newVal) {
    chilkatJNI.CkImap_put_StartTls(swigCPtr, this, newVal);
  }

  public void get_SslProtocol(CkString str) {
    chilkatJNI.CkImap_get_SslProtocol(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sslProtocol() {
    return chilkatJNI.CkImap_sslProtocol(swigCPtr, this);
  }

  public void put_SslProtocol(String newVal) {
    chilkatJNI.CkImap_put_SslProtocol(swigCPtr, this, newVal);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkImap_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkImap_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkImap_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkImap_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkImap_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkImap_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkImap_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkImap_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkImap_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkImap_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkImap_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkImap_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkImap_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkImap_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public int get_UidNext() {
    return chilkatJNI.CkImap_get_UidNext(swigCPtr, this);
  }

  public boolean get_AutoFix() {
    return chilkatJNI.CkImap_get_AutoFix(swigCPtr, this);
  }

  public void put_AutoFix(boolean newVal) {
    chilkatJNI.CkImap_put_AutoFix(swigCPtr, this, newVal);
  }

  public boolean AddPfxSourceData(CkByteData pfxData, String password) {
    return chilkatJNI.CkImap_AddPfxSourceData(swigCPtr, this, CkByteData.getCPtr(pfxData), pfxData, password);
  }

  public boolean AddPfxSourceFile(String pfxFilePath, String password) {
    return chilkatJNI.CkImap_AddPfxSourceFile(swigCPtr, this, pfxFilePath, password);
  }

  public boolean SetSslClientCertPem(String pemDataOrFilename, String pemPassword) {
    return chilkatJNI.CkImap_SetSslClientCertPem(swigCPtr, this, pemDataOrFilename, pemPassword);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkImap_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkImap_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkImap_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_UidValidity() {
    return chilkatJNI.CkImap_get_UidValidity(swigCPtr, this);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkImap_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkImap_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkImap_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkImap_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkImap_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_AutoDownloadAttachments() {
    return chilkatJNI.CkImap_get_AutoDownloadAttachments(swigCPtr, this);
  }

  public void put_AutoDownloadAttachments(boolean newVal) {
    chilkatJNI.CkImap_put_AutoDownloadAttachments(swigCPtr, this, newVal);
  }

  public boolean FetchAttachmentBytes(CkEmail email, int attachIndex, CkByteData outBytes) {
    return chilkatJNI.CkImap_FetchAttachmentBytes(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean FetchAttachmentString(CkEmail email, int attachIndex, String charset, CkString outStr) {
    return chilkatJNI.CkImap_FetchAttachmentString(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex, charset, CkString.getCPtr(outStr), outStr);
  }

  public String fetchAttachmentString(CkEmail email, int attachIndex, String charset) {
    return chilkatJNI.CkImap_fetchAttachmentString(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex, charset);
  }

  public boolean FetchAttachment(CkEmail email, int attachIndex, String saveToPath) {
    return chilkatJNI.CkImap_FetchAttachment(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex, saveToPath);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkImap_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkImap_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkImap_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public boolean CloseMailbox(String mailbox) {
    return chilkatJNI.CkImap_CloseMailbox(swigCPtr, this, mailbox);
  }

  public CkMessageSet CheckForNewEmail() {
    long cPtr = chilkatJNI.CkImap_CheckForNewEmail(swigCPtr, this);
    return (cPtr == 0) ? null : new CkMessageSet(cPtr, false);
  }

  public CkMailboxes ListSubscribed(String reference, String wildcardedMailbox) {
    long cPtr = chilkatJNI.CkImap_ListSubscribed(swigCPtr, this, reference, wildcardedMailbox);
    return (cPtr == 0) ? null : new CkMailboxes(cPtr, false);
  }

  public boolean AppendMimeWithDateStr(String mailbox, String mimeText, String internalDateStr) {
    return chilkatJNI.CkImap_AppendMimeWithDateStr(swigCPtr, this, mailbox, mimeText, internalDateStr);
  }

  public void get_SearchCharset(CkString str) {
    chilkatJNI.CkImap_get_SearchCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String searchCharset() {
    return chilkatJNI.CkImap_searchCharset(swigCPtr, this);
  }

  public void put_SearchCharset(String newVal) {
    chilkatJNI.CkImap_put_SearchCharset(swigCPtr, this, newVal);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkImap_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkImap_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkImap_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkImap_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public boolean Connect(String hostname) {
    return chilkatJNI.CkImap_Connect(swigCPtr, this, hostname);
  }

  public boolean Disconnect() {
    return chilkatJNI.CkImap_Disconnect(swigCPtr, this);
  }

  public boolean IsConnected() {
    return chilkatJNI.CkImap_IsConnected(swigCPtr, this);
  }

  public char get_SeparatorChar() {
    return chilkatJNI.CkImap_get_SeparatorChar(swigCPtr, this);
  }

  public void put_SeparatorChar(char c) {
    chilkatJNI.CkImap_put_SeparatorChar(swigCPtr, this, c);
  }

  public int get_NumMessages() {
    return chilkatJNI.CkImap_get_NumMessages(swigCPtr, this);
  }

  public CkStringArray FetchSequenceAsMime(int startSeqNum, int count) {
    long cPtr = chilkatJNI.CkImap_FetchSequenceAsMime(swigCPtr, this, startSeqNum, count);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public boolean Login(String login, String password) {
    return chilkatJNI.CkImap_Login(swigCPtr, this, login, password);
  }

  public boolean Logout() {
    return chilkatJNI.CkImap_Logout(swigCPtr, this);
  }

  public boolean IsLoggedIn() {
    return chilkatJNI.CkImap_IsLoggedIn(swigCPtr, this);
  }

  public boolean SetSslClientCert(CkCert cert) {
    return chilkatJNI.CkImap_SetSslClientCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public CkCert GetSslServerCert() {
    long cPtr = chilkatJNI.CkImap_GetSslServerCert(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean get_SslServerCertVerified() {
    return chilkatJNI.CkImap_get_SslServerCertVerified(swigCPtr, this);
  }

  public void get_LoggedInUser(CkString str) {
    chilkatJNI.CkImap_get_LoggedInUser(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_ConnectedToHost(CkString str) {
    chilkatJNI.CkImap_get_ConnectedToHost(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean CreateMailbox(String mailbox) {
    return chilkatJNI.CkImap_CreateMailbox(swigCPtr, this, mailbox);
  }

  public boolean DeleteMailbox(String mailbox) {
    return chilkatJNI.CkImap_DeleteMailbox(swigCPtr, this, mailbox);
  }

  public boolean RenameMailbox(String fromMailbox, String toMailbox) {
    return chilkatJNI.CkImap_RenameMailbox(swigCPtr, this, fromMailbox, toMailbox);
  }

  public boolean CopyMultiple(CkMessageSet messageSet, String copyToMailbox) {
    return chilkatJNI.CkImap_CopyMultiple(swigCPtr, this, CkMessageSet.getCPtr(messageSet), messageSet, copyToMailbox);
  }

  public boolean CopySequence(int startSeqNum, int count, String copyToMailbox) {
    return chilkatJNI.CkImap_CopySequence(swigCPtr, this, startSeqNum, count, copyToMailbox);
  }

  public boolean SetDecryptCert2(CkCert cert, CkPrivateKey key) {
    return chilkatJNI.CkImap_SetDecryptCert2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(key), key);
  }

  public CkMailboxes ListMailboxes(String reference, String wildcardedMailbox) {
    long cPtr = chilkatJNI.CkImap_ListMailboxes(swigCPtr, this, reference, wildcardedMailbox);
    return (cPtr == 0) ? null : new CkMailboxes(cPtr, true);
  }

  public boolean SelectMailbox(String mailbox) {
    return chilkatJNI.CkImap_SelectMailbox(swigCPtr, this, mailbox);
  }

  public boolean ExamineMailbox(String mailbox) {
    return chilkatJNI.CkImap_ExamineMailbox(swigCPtr, this, mailbox);
  }

  public CkMessageSet Search(String criteria, boolean bUid) {
    long cPtr = chilkatJNI.CkImap_Search(swigCPtr, this, criteria, bUid);
    return (cPtr == 0) ? null : new CkMessageSet(cPtr, true);
  }

  public void ClearSessionLog() {
    chilkatJNI.CkImap_ClearSessionLog(swigCPtr, this);
  }

  public CkMessageSet GetAllUids() {
    long cPtr = chilkatJNI.CkImap_GetAllUids(swigCPtr, this);
    return (cPtr == 0) ? null : new CkMessageSet(cPtr, true);
  }

  public CkEmail FetchSingle(int msgId, boolean bUid) {
    long cPtr = chilkatJNI.CkImap_FetchSingle(swigCPtr, this, msgId, bUid);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmail FetchSingleHeader(int msgId, boolean bUid) {
    long cPtr = chilkatJNI.CkImap_FetchSingleHeader(swigCPtr, this, msgId, bUid);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmailBundle FetchBundle(CkMessageSet messageSet) {
    long cPtr = chilkatJNI.CkImap_FetchBundle(swigCPtr, this, CkMessageSet.getCPtr(messageSet), messageSet);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle FetchHeaders(CkMessageSet messageSet) {
    long cPtr = chilkatJNI.CkImap_FetchHeaders(swigCPtr, this, CkMessageSet.getCPtr(messageSet), messageSet);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle FetchChunk(int startSeqNum, int fetchCount, CkMessageSet failedSet, CkMessageSet fetchedSet) {
    long cPtr = chilkatJNI.CkImap_FetchChunk(swigCPtr, this, startSeqNum, fetchCount, CkMessageSet.getCPtr(failedSet), failedSet, CkMessageSet.getCPtr(fetchedSet), fetchedSet);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle FetchSequence(int startSeqNum, int numMessages) {
    long cPtr = chilkatJNI.CkImap_FetchSequence(swigCPtr, this, startSeqNum, numMessages);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public CkEmailBundle FetchSequenceHeaders(int startSeqNum, int numMessages) {
    long cPtr = chilkatJNI.CkImap_FetchSequenceHeaders(swigCPtr, this, startSeqNum, numMessages);
    return (cPtr == 0) ? null : new CkEmailBundle(cPtr, true);
  }

  public boolean FetchSingleAsMime(int msgId, boolean bUid, CkString strMime) {
    return chilkatJNI.CkImap_FetchSingleAsMime(swigCPtr, this, msgId, bUid, CkString.getCPtr(strMime), strMime);
  }

  public CkStringArray FetchBundleAsMime(CkMessageSet messageSet) {
    long cPtr = chilkatJNI.CkImap_FetchBundleAsMime(swigCPtr, this, CkMessageSet.getCPtr(messageSet), messageSet);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public boolean Expunge() {
    return chilkatJNI.CkImap_Expunge(swigCPtr, this);
  }

  public boolean ExpungeAndClose() {
    return chilkatJNI.CkImap_ExpungeAndClose(swigCPtr, this);
  }

  public boolean StoreFlags(int msgId, boolean bUid, String flagName, int value) {
    return chilkatJNI.CkImap_StoreFlags(swigCPtr, this, msgId, bUid, flagName, value);
  }

  public boolean FetchFlags(int msgId, boolean bUid, CkString strFlags) {
    return chilkatJNI.CkImap_FetchFlags(swigCPtr, this, msgId, bUid, CkString.getCPtr(strFlags), strFlags);
  }

  public boolean SetFlag(int msgId, boolean bUid, String flagName, int value) {
    return chilkatJNI.CkImap_SetFlag(swigCPtr, this, msgId, bUid, flagName, value);
  }

  public boolean SetFlags(CkMessageSet messageSet, String flagName, int value) {
    return chilkatJNI.CkImap_SetFlags(swigCPtr, this, CkMessageSet.getCPtr(messageSet), messageSet, flagName, value);
  }

  public void get_AuthMethod(CkString str) {
    chilkatJNI.CkImap_get_AuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_AuthMethod(String str) {
    chilkatJNI.CkImap_put_AuthMethod(swigCPtr, this, str);
  }

  public void get_Domain(CkString str) {
    chilkatJNI.CkImap_get_Domain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_Domain(String str) {
    chilkatJNI.CkImap_put_Domain(swigCPtr, this, str);
  }

  public int get_Port() {
    return chilkatJNI.CkImap_get_Port(swigCPtr, this);
  }

  public void put_Port(int port) {
    chilkatJNI.CkImap_put_Port(swigCPtr, this, port);
  }

  public boolean get_Ssl() {
    return chilkatJNI.CkImap_get_Ssl(swigCPtr, this);
  }

  public void put_Ssl(boolean s) {
    chilkatJNI.CkImap_put_Ssl(swigCPtr, this, s);
  }

  public boolean AppendMime(String mailbox, String mimeText) {
    return chilkatJNI.CkImap_AppendMime(swigCPtr, this, mailbox, mimeText);
  }

  public boolean AppendMail(String mailbox, CkEmail email) {
    return chilkatJNI.CkImap_AppendMail(swigCPtr, this, mailbox, CkEmail.getCPtr(email), email);
  }

  public boolean Copy(int msgId, boolean bUid, String copyToMailbox) {
    return chilkatJNI.CkImap_Copy(swigCPtr, this, msgId, bUid, copyToMailbox);
  }

  public boolean SetMailFlag(CkEmail email, String flagName, int value) {
    return chilkatJNI.CkImap_SetMailFlag(swigCPtr, this, CkEmail.getCPtr(email), email, flagName, value);
  }

  public int GetMailFlag(CkEmail email, String flagName) {
    return chilkatJNI.CkImap_GetMailFlag(swigCPtr, this, CkEmail.getCPtr(email), email, flagName);
  }

  public boolean RefetchMailFlags(CkEmail emailInOut) {
    return chilkatJNI.CkImap_RefetchMailFlags(swigCPtr, this, CkEmail.getCPtr(emailInOut), emailInOut);
  }

  public int GetMailSize(CkEmail email) {
    return chilkatJNI.CkImap_GetMailSize(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public int GetMailNumAttach(CkEmail email) {
    return chilkatJNI.CkImap_GetMailNumAttach(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public int GetMailAttachSize(CkEmail email, int attachIndex) {
    return chilkatJNI.CkImap_GetMailAttachSize(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex);
  }

  public boolean GetMailAttachFilename(CkEmail email, int attachIndex, CkString strFilename) {
    return chilkatJNI.CkImap_GetMailAttachFilename(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex, CkString.getCPtr(strFilename), strFilename);
  }

  public boolean get_PeekMode() {
    return chilkatJNI.CkImap_get_PeekMode(swigCPtr, this);
  }

  public void put_PeekMode(boolean bPeek) {
    chilkatJNI.CkImap_put_PeekMode(swigCPtr, this, bPeek);
  }

  public void get_SessionLog(CkString str) {
    chilkatJNI.CkImap_get_SessionLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean get_KeepSessionLog() {
    return chilkatJNI.CkImap_get_KeepSessionLog(swigCPtr, this);
  }

  public void put_KeepSessionLog(boolean newVal) {
    chilkatJNI.CkImap_put_KeepSessionLog(swigCPtr, this, newVal);
  }

  public boolean get_AppendSeen() {
    return chilkatJNI.CkImap_get_AppendSeen(swigCPtr, this);
  }

  public void put_AppendSeen(boolean alreadySeen) {
    chilkatJNI.CkImap_put_AppendSeen(swigCPtr, this, alreadySeen);
  }

  public boolean SaveLastError(String filename) {
    return chilkatJNI.CkImap_SaveLastError(swigCPtr, this, filename);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkImap_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkImap_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkImap_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkImap_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkImap_IsUnlocked(swigCPtr, this);
  }

  public int get_ReadTimeout() {
    return chilkatJNI.CkImap_get_ReadTimeout(swigCPtr, this);
  }

  public void put_ReadTimeout(int numSec) {
    chilkatJNI.CkImap_put_ReadTimeout(swigCPtr, this, numSec);
  }

  public int get_ConnectTimeout() {
    return chilkatJNI.CkImap_get_ConnectTimeout(swigCPtr, this);
  }

  public void put_ConnectTimeout(int numSec) {
    chilkatJNI.CkImap_put_ConnectTimeout(swigCPtr, this, numSec);
  }

  public boolean SendRawCommand(String rawCommand, CkString rawResponse) {
    return chilkatJNI.CkImap_SendRawCommand(swigCPtr, this, rawCommand, CkString.getCPtr(rawResponse), rawResponse);
  }

  public String lastErrorText() {
    return chilkatJNI.CkImap_lastErrorText(swigCPtr, this);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkImap_lastErrorXml(swigCPtr, this);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkImap_lastErrorHtml(swigCPtr, this);
  }

  public String getMailAttachFilename(CkEmail email, int attachIndex) {
    return chilkatJNI.CkImap_getMailAttachFilename(swigCPtr, this, CkEmail.getCPtr(email), email, attachIndex);
  }

  public String fetchFlags(int msgId, boolean bUid) {
    return chilkatJNI.CkImap_fetchFlags(swigCPtr, this, msgId, bUid);
  }

  public String authMethod() {
    return chilkatJNI.CkImap_authMethod(swigCPtr, this);
  }

  public String domain() {
    return chilkatJNI.CkImap_domain(swigCPtr, this);
  }

  public String fetchSingleAsMime(int msgId, boolean bUid) {
    return chilkatJNI.CkImap_fetchSingleAsMime(swigCPtr, this, msgId, bUid);
  }

  public String loggedInUser() {
    return chilkatJNI.CkImap_loggedInUser(swigCPtr, this);
  }

  public String connectedToHost() {
    return chilkatJNI.CkImap_connectedToHost(swigCPtr, this);
  }

  public String sendRawCommand(String rawCommand) {
    return chilkatJNI.CkImap_sendRawCommand(swigCPtr, this, rawCommand);
  }

  public String sessionLog() {
    return chilkatJNI.CkImap_sessionLog(swigCPtr, this);
  }

}
