package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ۡۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8N5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8716 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f26527;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f26526 = new float[16];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float[] f26528 = new float[16];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20537 f26529 = new C20537();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22520(long j, float[] fArr) {
        this.f26529.m47026(j, fArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22518() {
        this.f26529.m47025();
        this.f26527 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22519(long j, float[] fArr) {
        float[] fArr2 = (float[]) this.f26529.m47028(j);
        if (fArr2 == null) {
            return;
        }
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        float[] fArr3 = this.f26528;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        boolean z = this.f26527;
        float[] fArr4 = this.f26526;
        if (!z) {
            m22517(fArr4, fArr3);
            this.f26527 = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr4, 0, fArr3, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22517(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }
}
