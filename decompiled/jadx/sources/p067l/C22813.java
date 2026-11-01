package p067l;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.᩸ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08N4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22813 implements InterfaceC8731 {
    /* JADX INFO: renamed from: ֫ */
    public final AudioTrack m51017(C3424 c3424, C19695 c19695, int i, Context context) {
        boolean z = c3424.f6826;
        int i2 = c3424.f6827;
        int i3 = c3424.f6825;
        int i4 = c3424.f6828;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m51016(c19695, z)).setAudioFormat(C5792.m13016(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(c3424.f6824).setSessionId(i);
            if (i5 >= 29) {
                sessionId.setOffloadedPlayback(c3424.f6829);
            }
            if (i5 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            return sessionId.build();
        }
        return new AudioTrack(m51016(c19695, z), C5792.m13016(i4, i3, i2), c3424.f6824, 1, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AudioAttributes m51016(C19695 c19695, boolean z) {
        if (!z) {
            return c19695.m44733().f54801;
        }
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
}
