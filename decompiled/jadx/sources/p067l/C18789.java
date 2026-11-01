package p067l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ܿۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18789 {
    /* JADX INFO: renamed from: ֫ */
    public static void m42818(AudioTrack audioTrack, C15512 c15512) {
        LogSessionId logSessionIdM35302 = c15512.m35302();
        if (logSessionIdM35302.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM35302);
    }
}
