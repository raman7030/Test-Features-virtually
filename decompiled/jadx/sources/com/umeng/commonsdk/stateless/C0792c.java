package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.C0833a;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.c */
/* JADX INFO: compiled from: O464 */
/* JADX INFO: loaded from: classes.dex */
public class C0792c {

    /* JADX INFO: renamed from: a */
    public String f3332a = "10.0.0.172";

    /* JADX INFO: renamed from: b */
    public int f3333b = 80;

    /* JADX INFO: renamed from: c */
    public Context f3334c;

    public C0792c(Context context) {
        this.f3334c = context;
    }

    /* JADX INFO: renamed from: a */
    private void m2897a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f3334c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        C0790a.f3316i = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    /* JADX INFO: renamed from: b */
    private void m2898b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f3334c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f3334c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            C0790a.f3315h = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            C0790a.f3318k = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        C0790a.f3316i = C0790a.f3318k;
        if (TextUtils.isEmpty(C0795b.f3343b)) {
            return;
        }
        if (C0795b.f3343b.startsWith("460") || C0795b.f3343b.startsWith("461")) {
            C0790a.f3316i = C0790a.f3315h;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x011e A[EXC_TOP_SPLITTER, PHI: r5 r13
      0x011e: PHI (r5v9 java.io.OutputStream) = (r5v7 java.io.OutputStream), (r5v10 java.io.OutputStream) binds: [B:40:0x010b, B:49:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r13v7 ??) = (r13v5 ??), (r13v8 ??) binds: [B:40:0x010b, B:49:0x011c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: a */
    public boolean m2899a(byte[] bArr, String str, String str2, String str3) {
        boolean z = true;
        if (bArr == null || str == null) {
            ULog.m2986i("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
            return false;
        }
        if (SdkVersion.SDK_TYPE == 0) {
            m2897a();
        } else {
            C0790a.f3315h = C0790a.f3318k;
            m2898b();
        }
        String str4 = C0790a.f3316i;
        ?? r13 = str2;
        if (!C0833a.f3658c.equalsIgnoreCase(str)) {
            r13 = str4;
        }
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 无状态收数域名：" + r13);
        OutputStream outputStream = null;
        try {
            try {
                r13 = (HttpsURLConnection) new URL(r13 + File.separator + str).openConnection();
                try {
                    r13.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, new SecureRandom());
                    r13.setSSLSocketFactory(sSLContext.getSocketFactory());
                    r13.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    r13.setRequestProperty("Msg-Type", "envelope/json");
                    r13.setRequestProperty("Content-Type", C0655am.f2289aQ + str3);
                    r13.setRequestProperty("SM-IMP", "1");
                    r13.setConnectTimeout(30000);
                    r13.setReadTimeout(30000);
                    r13.setRequestMethod("POST");
                    r13.setDoOutput(true);
                    r13.setDoInput(true);
                    r13.setUseCaches(false);
                    OutputStream outputStream2 = r13.getOutputStream();
                    try {
                        outputStream2.write(bArr);
                        outputStream2.flush();
                        r13.connect();
                        if (r13.getResponseCode() == 200) {
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> send stateless message success : " + C0790a.f3316i + "/" + str);
                        } else {
                            z = false;
                        }
                        try {
                            outputStream2.close();
                        } catch (Exception unused) {
                        }
                        try {
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            r13.disconnect();
                        } catch (Throwable unused2) {
                        }
                        return z;
                    } catch (SSLHandshakeException e) {
                        e = e;
                        outputStream = outputStream2;
                        MLog.m2949e("SSLHandshakeException, Failed to send message.", e);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (r13 != 0) {
                            try {
                                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                                r13.disconnect();
                            } catch (Throwable unused4) {
                                return false;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = outputStream2;
                        MLog.m2949e("Exception,Failed to send message.", th);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused5) {
                            }
                        }
                        if (r13 != 0) {
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            r13.disconnect();
                        }
                        return false;
                    }
                } catch (SSLHandshakeException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                if (r13 == 0) {
                    throw th3;
                }
                try {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                    r13.disconnect();
                    throw th3;
                } catch (Throwable unused7) {
                    throw th3;
                }
            }
        } catch (SSLHandshakeException e3) {
            e = e3;
            r13 = 0;
        } catch (Throwable th4) {
            th = th4;
            r13 = 0;
        }
    }
}
