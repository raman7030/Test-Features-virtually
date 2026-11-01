package p067l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: renamed from: l.۟۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9459 {
    /* JADX INFO: renamed from: ֫ */
    public static C17505 m21960(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            C10801 c10801 = new C10801();
            c10801.m24897();
            c10801.m24898(z);
            return c10801.m24895();
        }
        return C17505.f52339;
    }
}
