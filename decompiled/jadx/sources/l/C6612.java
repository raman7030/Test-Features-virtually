package l;

import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ۜ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6612 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18120(C23023 c23023, C13830 c13830) {
        LogSessionId logSessionIdM33184 = c13830.m33184();
        if (logSessionIdM33184.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c23023.f74105.setString("log-session-id", logSessionIdM33184.getStringId());
    }
}
