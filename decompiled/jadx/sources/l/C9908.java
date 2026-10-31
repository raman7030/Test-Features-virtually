package l;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9908 implements TimeInterpolator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f29969;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29970;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29971;

    public C9908(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f29970 = numberOfFrames;
        int[] iArr = this.f29969;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f29969 = new int[numberOfFrames];
        }
        int[] iArr2 = this.f29969;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f29971 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25015() {
        return this.f29971;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i;
        int i2;
        int i3 = (int) ((f * this.f29971) + 0.5f);
        int i4 = 0;
        while (true) {
            i = this.f29970;
            if (i4 >= i || i3 < (i2 = this.f29969[i4])) {
                break;
            }
            i3 -= i2;
            i4++;
        }
        return (i4 / i) + (i4 < i ? i3 / this.f29971 : 0.0f);
    }
}
