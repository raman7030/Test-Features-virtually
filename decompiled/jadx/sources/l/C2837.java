package l;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۖ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB2X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2837 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8731(Intent intent, Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme())) {
            return;
        }
        intent.addFlags(1);
        intent.addFlags(2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static char m8732(int i) {
        if (i >= 0 && 65535 >= i) {
            return (char) i;
        }
        throw new IllegalArgumentException(i + " can't be represented as char");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m8729(int i) {
        if (i >= -128 && 127 >= i) {
            return (byte) i;
        }
        throw new IllegalArgumentException(i + " can't be represented as byte (out of range)");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m8730(double d) {
        if (Double.isNaN(d)) {
            return Float.NaN;
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (d < -3.4028234663852886E38d || 3.4028234663852886E38d < d) {
            throw new IllegalArgumentException(d + " can't be represented as float (out of range)");
        }
        float f = (float) d;
        if (f == d) {
            return f;
        }
        throw new IllegalArgumentException(d + " can't be represented as float (imprecise)");
    }
}
