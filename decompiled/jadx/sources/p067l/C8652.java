package p067l;

import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ۜ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8652 {
    /* JADX INFO: renamed from: ֫ */
    public static void m20072(C24249 c24249, C15512 c15512) {
        LogSessionId logSessionIdM35302 = c15512.m35302();
        if (logSessionIdM35302.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c24249.f76844.setString("log-session-id", logSessionIdM35302.getStringId());
    }
}
