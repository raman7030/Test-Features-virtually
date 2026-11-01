package com.alipay.sdk.interior;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0244g;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class Log {

    /* JADX INFO: renamed from: a */
    public static long f286a;

    /* JADX INFO: compiled from: N673 */
    public interface ISdkLogCallback {
        void onLogLine(String str);
    }

    public static boolean forcedLogReport(Context context) {
        try {
            C0234b.m1121c().m1124a(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f286a < 600) {
                return false;
            }
            f286a = jElapsedRealtime;
            C0167a.m747a(context);
            return true;
        } catch (Exception e) {
            C0244g.m1199a(e);
            return false;
        }
    }

    public static void setupLogCallback(ISdkLogCallback iSdkLogCallback) {
        C0244g.m1196a(iSdkLogCallback);
    }
}
