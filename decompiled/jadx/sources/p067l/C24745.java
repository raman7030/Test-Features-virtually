package p067l;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: renamed from: l.᩻۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes.dex */
public final class C24745 {

    /* JADX INFO: renamed from: ֫ */
    public static Boolean f78346;

    /* JADX INFO: renamed from: ֫ */
    public static int m54405(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f78346;
        if (bool == null || !bool.booleanValue()) {
            return C16027.m36473(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
