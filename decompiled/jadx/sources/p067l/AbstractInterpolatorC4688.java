package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۖۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U53B */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractInterpolatorC4688 implements Interpolator {

    /* JADX INFO: renamed from: ֫ */
    public final float f10561;

    /* JADX INFO: renamed from: ۧ */
    public final float[] f10562;

    public AbstractInterpolatorC4688(float[] fArr) {
        this.f10562 = fArr;
        this.f10561 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f10562;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f10561;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return C21740.m49018(fArr[iMin + 1], f4, f3, f4);
    }
}
