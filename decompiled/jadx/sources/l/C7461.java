package l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: renamed from: l.۟۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7461 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15927 m19985(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            C8873 c8873 = new C8873();
            c8873.m22926();
            c8873.m22927(z);
            return c8873.m22924();
        }
        return C15927.f49192;
    }
}
