package p067l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۖۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4715 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20809 f10669;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C20138 f10670;

    public C4715(C20809 c20809, C20138 c20138) {
        this.f10669 = c20809;
        this.f10670 = c20138;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C20138 c20138 = this.f10670;
        C20809.m46972(fFloatValue, c20138);
        C20809 c20809 = this.f10669;
        c20809.m46975(fFloatValue, c20138, false);
        c20809.invalidateSelf();
    }
}
