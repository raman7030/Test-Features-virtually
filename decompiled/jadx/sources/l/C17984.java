package l;

import android.media.AudioTrack;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ᩳۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17984 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42024(AudioTrack audioTrack, C9579 c9579) {
        audioTrack.setPreferredDevice(c9579 == null ? null : c9579.f29041);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m42023(AudioTrack audioTrack, C9518 c9518) {
        if (c9518.f28911 == 0) {
            return C3603.m11013(c9518.f28903, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int iM50530 = C22535.m50530(c9518.f28902);
        C22632.m50634(iM50530 != -2147483647);
        return C3603.m11017(bufferSizeInFrames, 1000000L, iM50530, RoundingMode.DOWN);
    }
}
