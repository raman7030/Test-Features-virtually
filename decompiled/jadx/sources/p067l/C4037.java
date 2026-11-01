package p067l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.֫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4037 {
    /* JADX INFO: renamed from: ֫ */
    public static C17505 m8088(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport != 0) {
            C10801 c10801 = new C10801();
            boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            c10801.m24897();
            c10801.m24896(z2);
            c10801.m24898(z);
            return c10801.m24895();
        }
        return C17505.f52339;
    }
}
