package p067l;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1472 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1704 f41275;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f41276;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C1914 f41277;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ View f41278;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C1914 f41279;

    public C1472(C1704 c1704, C1914 c1914, C1914 c1915, int i, View view) {
        this.f41275 = c1704;
        this.f41279 = c1914;
        this.f41277 = c1915;
        this.f41276 = i;
        this.f41278 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1704 c1704 = this.f41275;
        c1704.m42975(animatedFraction);
        float fM42976 = c1704.m42976();
        int i = C1997.f77532;
        C1914 c1914 = this.f41279;
        C2019 c2019 = new C2019(c1914);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f41276 & i2) == 0) {
                c2019.m54781(i2, c1914.m51163(i2));
            } else {
                C1388 c1388M51163 = c1914.m51163(i2);
                C1388 c1388M51164 = this.f41277.m51163(i2);
                float f = 1.0f - fM42976;
                c2019.m54781(i2, C1914.m51161(c1388M51163, (int) (((double) ((c1388M51163.f36103 - c1388M51164.f36103) * f)) + 0.5d), (int) (((double) ((c1388M51163.f36105 - c1388M51164.f36105) * f)) + 0.5d), (int) (((double) ((c1388M51163.f36104 - c1388M51164.f36104) * f)) + 0.5d), (int) (((double) ((c1388M51163.f36102 - c1388M51164.f36102) * f)) + 0.5d)));
            }
        }
        C1997.m54010(this.f41278, c2019.m54780(), Collections.singletonList(c1704));
    }
}
