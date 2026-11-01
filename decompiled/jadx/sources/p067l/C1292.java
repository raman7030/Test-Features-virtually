package p067l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۡ᩵ */
/* JADX INFO: compiled from: 93YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1292 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public static final double f30451 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ۧ */
    public static float m25378(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f30451) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m25377(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f30451) * ((double) f2)) + ((double) f));
    }
}
