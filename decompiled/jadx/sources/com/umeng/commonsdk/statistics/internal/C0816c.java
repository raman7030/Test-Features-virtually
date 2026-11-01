package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C0716l;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.C0772b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.C0832d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;
import p067l.C7470;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.c */
/* JADX INFO: compiled from: A612 */
/* JADX INFO: loaded from: classes.dex */
public class C0816c {

    /* JADX INFO: renamed from: e */
    public static boolean f3447e;

    /* JADX INFO: renamed from: f */
    public static boolean f3448f;

    /* JADX INFO: renamed from: g */
    public static boolean f3449g;

    /* JADX INFO: renamed from: a */
    public String f3450a = "10.0.0.172";

    /* JADX INFO: renamed from: b */
    public int f3451b = 80;

    /* JADX INFO: renamed from: c */
    public Context f3452c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0815b f3453d;

    public C0816c(Context context) {
        this.f3452c = context;
    }

    /* JADX INFO: renamed from: a */
    public void m3104a(InterfaceC0815b interfaceC0815b) {
        this.f3453d = interfaceC0815b;
    }

    /* JADX INFO: renamed from: a */
    private void m3100a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f3452c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f3452c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    /* JADX INFO: renamed from: b */
    private void m3101b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f3452c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f3452c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f3452c, "oversea_domain_p", "");
        String strImprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f3452c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(strImprintProperty3);
        }
        if (!TextUtils.isEmpty(strImprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(strImprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(C0795b.f3343b)) {
            return;
        }
        if (C0795b.f3343b.startsWith("460") || C0795b.f3343b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3102c() {
        if (f3449g) {
            return;
        }
        ImprintHandler.getImprintService(this.f3452c).registImprintCallback("cfgfd", new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                if (FieldManager.m2731b()) {
                    FieldManager.m2730a().m2733a(C0816c.this.f3452c, str2);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                    UMWorkDispatch.sendEvent(C0816c.this.f3452c, C0771a.f3238w, C0772b.m2790a(C0816c.this.f3452c).m2791a(), null);
                }
            }
        });
        f3449g = true;
    }

    /* JADX INFO: renamed from: d */
    private void m3103d() {
        if (f3448f) {
            return;
        }
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
        ImprintHandler.getImprintService(this.f3452c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.2
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
            public boolean onPreProcessImprintKey(String str, String str2) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.m2730a().m2732a(C0816c.this.f3452c);
                UMWorkDispatch.sendEvent(C0816c.this.f3452c, C0771a.f3234s, C0772b.m2790a(C0816c.this.f3452c).m2791a(), null);
                ImprintHandler.getImprintService(C0816c.this.f3452c).m3045a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                return true;
            }
        });
        ImprintHandler.getImprintService(this.f3452c).registImprintCallback("cfgfd", new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.3
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.m2730a().m2733a(C0816c.this.f3452c, str2);
                UMWorkDispatch.sendEvent(C0816c.this.f3452c, C0771a.f3234s, C0772b.m2790a(C0816c.this.f3452c).m2791a(), null);
                if (FieldManager.allow(C0832d.f3591E)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: foregound count timer enabled.");
                    if (!UMWorkDispatch.eventHasExist()) {
                        UMWorkDispatch.sendEventEx(C0816c.this.f3452c, C0719o.a.f2892D, CoreProtocol.getInstance(C0816c.this.f3452c), null, 0L);
                    }
                }
                if (FieldManager.allow(C0832d.f3592F)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                    C0716l.m2517a(C0816c.this.f3452c).m2537b(C0816c.this.f3452c);
                }
                ImprintHandler.getImprintService(C0816c.this.f3452c).unregistImprintCallback("cfgfd", this);
            }
        });
        f3448f = true;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3106a(byte[] bArr, boolean z, boolean z2, String str) {
        if (SdkVersion.SDK_TYPE == 0) {
            m3100a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            m3101b();
        }
        byte[] bArrM3105a = null;
        int i = 0;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i >= strArr.length) {
                return bArrM3105a;
            }
            String str2 = strArr[i];
            if (z2) {
                m3103d();
            } else {
                m3102c();
            }
            StringBuilder sbM17248 = C7470.m17248(str2);
            sbM17248.append(File.separator);
            sbM17248.append(str);
            bArrM3105a = m3105a(bArr, sbM17248.toString());
            if (bArrM3105a != null) {
                InterfaceC0815b interfaceC0815b = this.f3453d;
                if (interfaceC0815b != null) {
                    interfaceC0815b.onRequestSucceed(z);
                }
                return bArrM3105a;
            }
            InterfaceC0815b interfaceC0815b2 = this.f3453d;
            if (interfaceC0815b2 != null) {
                interfaceC0815b2.onRequestFailed();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0160: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:85:0x016c, block:B:80:0x0160 */
    /* JADX INFO: renamed from: a */
    public byte[] m3105a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        try {
            try {
                InterfaceC0815b interfaceC0815b = this.f3453d;
                if (interfaceC0815b != null) {
                    interfaceC0815b.onRequestStart();
                }
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    boolean z = true;
                    if (!f3447e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f3447e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", C0814a.m3088a(this.f3452c).m3093b());
                    httpsURLConnection.setRequestProperty("Content-Type", C0814a.m3088a(this.f3452c).m3091a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setRequestProperty("SM-IMP", "1");
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                        httpsURLConnection.connect();
                        InterfaceC0815b interfaceC0815b2 = this.f3453d;
                        if (interfaceC0815b2 != null) {
                            interfaceC0815b2.onRequestEnd();
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        String headerField = httpsURLConnection.getHeaderField("Content-Type");
                        if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                            z = false;
                        }
                        String str2 = AnalyticsConstants.f3338OS;
                        if (responseCode != 200 || !z) {
                            try {
                                outputStream.close();
                            } catch (Exception e) {
                                UMCrashManager.reportCrash(this.f3452c, e);
                            }
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused) {
                            }
                            httpsURLConnection.disconnect();
                            return null;
                        }
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        try {
                            byte[] streamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                            HelperUtils.safeClose(inputStream);
                            try {
                                outputStream.close();
                            } catch (Exception e2) {
                                UMCrashManager.reportCrash(this.f3452c, e2);
                            }
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused2) {
                            }
                            httpsURLConnection.disconnect();
                            return streamToByteArray;
                        } catch (Throwable th) {
                            HelperUtils.safeClose(inputStream);
                            throw th;
                        }
                    } catch (UnknownHostException unused3) {
                        UMLog.m2750aq("A_10200", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e3) {
                                UMCrashManager.reportCrash(this.f3452c, e3);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused4) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (SSLHandshakeException unused5) {
                        UMLog.m2750aq("A_10201", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e4) {
                                UMCrashManager.reportCrash(this.f3452c, e4);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused6) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable unused7) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e5) {
                                UMCrashManager.reportCrash(this.f3452c, e5);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused8) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (UnknownHostException unused9) {
                    outputStream = null;
                } catch (SSLHandshakeException unused10) {
                    outputStream = null;
                } catch (Throwable unused11) {
                    outputStream = null;
                }
            } catch (Throwable th2) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e6) {
                        UMCrashManager.reportCrash(this.f3452c, e6);
                    }
                }
                if (str == 0) {
                    throw th2;
                }
                try {
                    str.getInputStream().close();
                } catch (IOException unused12) {
                }
                str.disconnect();
                throw th2;
            }
        } catch (UnknownHostException unused13) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused14) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused15) {
            httpsURLConnection = null;
            outputStream = null;
        }
    }
}
