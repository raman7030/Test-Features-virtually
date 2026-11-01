package p067l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18435 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19777 f55146;

    public RunnableC18435(C19777 c19777) {
        this.f55146 = c19777;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jMo15699b;
        int iM51581;
        long jMo15700c;
        boolean z;
        int i;
        C19777 c19777 = this.f55146;
        try {
            HashMap mapM44949 = c19777.m44949();
            if (mapM44949 == null) {
                return;
            }
            C11060.m25471("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM44949);
            int iM53971 = C24470.m53965(C24158.m53410(), (String) null).m53971("Common_HttpRetryCount");
            int i2 = iM53971 == 0 ? 2 : iM53971;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = 0;
            int iMo15701d = 0;
            do {
                int i4 = i3 + 1;
                try {
                    InterfaceC6856 interfaceC6856M48815 = C21609.m48810().m48815(mapM44949, "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report");
                    C11060.m25471("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC6856M48815.mo15701d());
                    JSONObject jSONObjectM45010 = C19797.m45010(interfaceC6856M48815.mo15698a());
                    jMo15700c = (long) interfaceC6856M48815.mo15700c();
                    jMo15699b = interfaceC6856M48815.mo15699b();
                    try {
                        try {
                            if (interfaceC6856M48815.mo15701d() != 200) {
                                iMo15701d = interfaceC6856M48815.mo15701d();
                                break;
                            }
                            try {
                                i = jSONObjectM45010.getInt("ret");
                            } catch (JSONException unused) {
                                i = -4;
                            }
                            if (i == 0 || jMo15699b != 0) {
                                z = true;
                            } else {
                                i3 = i4;
                            }
                        } catch (JSONException unused2) {
                            jMo15699b = 0;
                            i3 = i4;
                            jMo15700c = jMo15699b;
                            iMo15701d = -4;
                        }
                    } catch (SocketTimeoutException unused3) {
                        jMo15699b = 0;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        iM51581 = -8;
                        iMo15701d = iM51581;
                        i3 = i4;
                        jMo15700c = jMo15699b;
                    } catch (IOException e) {
                        e = e;
                        jMo15699b = 0;
                        iM51581 = C23130.m51581(e);
                        iMo15701d = iM51581;
                        i3 = i4;
                        jMo15700c = jMo15699b;
                    } catch (Exception unused4) {
                        jMo15699b = 0;
                        iM51581 = -6;
                        i4 = i2;
                        iMo15701d = iM51581;
                        i3 = i4;
                        jMo15700c = jMo15699b;
                    }
                } catch (SocketTimeoutException unused5) {
                    jMo15699b = 0;
                } catch (IOException e2) {
                    e = e2;
                    jMo15699b = 0;
                } catch (JSONException unused6) {
                    jMo15699b = 0;
                } catch (Exception unused7) {
                    jMo15699b = 0;
                }
                int i5 = iMo15701d;
                C19777.m44947("mapp_apptrace_sdk", jElapsedRealtime, jMo15700c, jMo15699b, i5, null);
                c19777.f60171.clear();
                C11060.m25471("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
            } while (i3 < i2);
            z = false;
            int i6 = iMo15701d;
            C19777.m44947("mapp_apptrace_sdk", jElapsedRealtime, jMo15700c, jMo15699b, i6, null);
            c19777.f60171.clear();
            C11060.m25471("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
        } catch (Throwable th) {
            C11060.m25468("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
        }
    }
}
