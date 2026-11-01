package p067l;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: l.ܽۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18157 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m41364(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41363(MediaDrm mediaDrm, byte[] bArr, C15512 c15512) {
        LogSessionId logSessionIdM35302 = c15512.m35302();
        if (logSessionIdM35302.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdM35302);
    }
}
