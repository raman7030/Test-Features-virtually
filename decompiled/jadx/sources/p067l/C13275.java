package p067l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۨۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13275 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24003 f37279;

    public C13275(C24003 c24003) {
        this.f37279 = c24003;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f37279.m53172(valueAnimator.getAnimatedFraction());
    }
}
