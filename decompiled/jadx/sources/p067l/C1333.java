package p067l;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.ۢ᩻ */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333 implements TimeInterpolator {

    /* JADX INFO: renamed from: ֫ */
    public int[] f32927;

    /* JADX INFO: renamed from: ۧ */
    public int f32928;

    /* JADX INFO: renamed from: ܽ */
    public int f32929;

    public C1333(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f32928 = numberOfFrames;
        int[] iArr = this.f32927;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f32927 = new int[numberOfFrames];
        }
        int[] iArr2 = this.f32927;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f32929 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27032() {
        return this.f32929;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i;
        int i2;
        int i3 = (int) ((f * this.f32929) + 0.5f);
        int i4 = 0;
        while (true) {
            i = this.f32928;
            if (i4 >= i || i3 < (i2 = this.f32927[i4])) {
                break;
            }
            i3 -= i2;
            i4++;
        }
        return (i4 / i) + (i4 < i ? i3 / this.f32929 : 0.0f);
    }
}
