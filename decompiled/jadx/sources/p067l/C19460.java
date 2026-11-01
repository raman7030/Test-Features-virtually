package p067l;

import android.media.AudioTrack;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ᩳۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19460 {
    /* JADX INFO: renamed from: ֫ */
    public static void m44274(AudioTrack audioTrack, C11472 c11472) {
        audioTrack.setPreferredDevice(c11472 == null ? null : c11472.f31988);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m44273(AudioTrack audioTrack, C11414 c11414) {
        if (c11414.f31858 == 0) {
            return C5792.m12989(c11414.f31850, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int iM52872 = C23786.m52872(c11414.f31849);
        C23877.m52960(iM52872 != -2147483647);
        return C5792.m12993(bufferSizeInFrames, 1000000L, iM52872, RoundingMode.DOWN);
    }
}
