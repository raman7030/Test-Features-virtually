package l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ܿۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17278 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40568(AudioTrack audioTrack, C13830 c13830) {
        LogSessionId logSessionIdM33184 = c13830.m33184();
        if (logSessionIdM33184.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM33184);
    }
}
