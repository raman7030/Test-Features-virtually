package l;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ܽۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16613 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39137(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39136(MediaDrm mediaDrm, byte[] bArr, C13830 c13830) {
        LogSessionId logSessionIdM33184 = c13830.m33184();
        if (logSessionIdM33184.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdM33184);
    }
}
