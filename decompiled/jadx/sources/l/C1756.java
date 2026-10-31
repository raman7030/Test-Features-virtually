package l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.֫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1756 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15927 m5878(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport != 0) {
            C8873 c8873 = new C8873();
            boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            c8873.m22926();
            c8873.m22925(z2);
            c8873.m22927(z);
            return c8873.m22924();
        }
        return C15927.f49192;
    }
}
