package p067l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.֫۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4095 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m8237(C19695 c19695) {
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        AbstractC21520 it = C19518.f59439.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= C5792.m12974(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c19695.m44733().f54801)) {
                c4123.m18184(num);
            }
        }
        c4123.m18184(2);
        return c4123.m8329();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8236(int i, int i2, C19695 c19695) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM13011 = C5792.m13011(i3);
            if (iM13011 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM13011).build(), c19695.m44733().f54801)) {
                return i3;
            }
        }
        return 0;
    }
}
