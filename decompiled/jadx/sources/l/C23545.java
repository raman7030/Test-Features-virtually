package l;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: renamed from: l.᩻۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes.dex */
public final class C23545 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Boolean f75600;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52003(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f75600;
        if (bool == null || !bool.booleanValue()) {
            return C14372.m34339(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
