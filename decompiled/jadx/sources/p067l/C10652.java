package p067l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ۡۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8N5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10652 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f29452;

    /* JADX INFO: renamed from: ֫ */
    public final float[] f29451 = new float[16];

    /* JADX INFO: renamed from: ܽ */
    public final float[] f29453 = new float[16];

    /* JADX INFO: renamed from: ᩳ */
    public final C21886 f29454 = new C21886();

    /* JADX INFO: renamed from: ۧ */
    public final void m24489(long j, float[] fArr) {
        this.f29454.m49349(j, fArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24487() {
        this.f29454.m49348();
        this.f29452 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24488(long j, float[] fArr) {
        float[] fArr2 = (float[]) this.f29454.m49351(j);
        if (fArr2 == null) {
            return;
        }
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        float[] fArr3 = this.f29453;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        boolean z = this.f29452;
        float[] fArr4 = this.f29451;
        if (!z) {
            m24486(fArr4, fArr3);
            this.f29452 = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr4, 0, fArr3, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24486(float[] fArr, float[] fArr2) {
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
