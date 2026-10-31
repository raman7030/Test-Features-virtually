package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16905 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18317 f51966;

    public RunnableC16905(C18317 c18317) {
        this.f51966 = c18317;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB;
        int iM49230;
        long jC;
        boolean z;
        int i;
        C18317 c18317 = this.f51966;
        try {
            HashMap mapM42687 = c18317.m42687();
            if (mapM42687 == null) {
                return;
            }
            C9145.m23520("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM42687);
            int iM51575 = C23255.m51569(C22927.m51019(), (String) null).m51575("Common_HttpRetryCount");
            int i2 = iM51575 == 0 ? 2 : iM51575;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = 0;
            int iD = 0;
            do {
                int i4 = i3 + 1;
                try {
                    InterfaceC4722 interfaceC4722M46494 = C20245.m46489().m46494(mapM42687, "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report");
                    C9145.m23520("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC4722M46494.d());
                    JSONObject jSONObjectM42748 = C18338.m42748(interfaceC4722M46494.a());
                    jC = (long) interfaceC4722M46494.c();
                    jB = interfaceC4722M46494.b();
                    try {
                        try {
                            if (interfaceC4722M46494.d() != 200) {
                                iD = interfaceC4722M46494.d();
                                break;
                            }
                            try {
                                i = jSONObjectM42748.getInt("ret");
                            } catch (JSONException unused) {
                                i = -4;
                            }
                            if (i == 0 || jB != 0) {
                                z = true;
                            } else {
                                i3 = i4;
                            }
                        } catch (JSONException unused2) {
                            jB = 0;
                            i3 = i4;
                            jC = jB;
                            iD = -4;
                        }
                    } catch (SocketTimeoutException unused3) {
                        jB = 0;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        iM49230 = -8;
                        iD = iM49230;
                        i3 = i4;
                        jC = jB;
                    } catch (IOException e) {
                        e = e;
                        jB = 0;
                        iM49230 = C21845.m49230(e);
                        iD = iM49230;
                        i3 = i4;
                        jC = jB;
                    } catch (Exception unused4) {
                        jB = 0;
                        iM49230 = -6;
                        i4 = i2;
                        iD = iM49230;
                        i3 = i4;
                        jC = jB;
                    }
                } catch (SocketTimeoutException unused5) {
                    jB = 0;
                } catch (IOException e2) {
                    e = e2;
                    jB = 0;
                } catch (JSONException unused6) {
                    jB = 0;
                } catch (Exception unused7) {
                    jB = 0;
                }
                int i5 = iD;
                C18317.m42685("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i5, null);
                c18317.f56953.clear();
                C9145.m23520("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
            } while (i3 < i2);
            z = false;
            int i6 = iD;
            C18317.m42685("mapp_apptrace_sdk", jElapsedRealtime, jC, jB, i6, null);
            c18317.f56953.clear();
            C9145.m23520("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
        } catch (Throwable th) {
            C9145.m23517("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
        }
    }
}
