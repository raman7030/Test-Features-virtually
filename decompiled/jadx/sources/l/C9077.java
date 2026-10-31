package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 93YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9077 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final double f27514 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m23432(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f27514) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m23431(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f27514) * ((double) f2)) + ((double) f));
    }
}
