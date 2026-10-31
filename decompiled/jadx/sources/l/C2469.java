package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۖۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2469 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19403 f7881;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18697 f7882;

    public C2469(C19403 c19403, C18697 c18697) {
        this.f7881 = c19403;
        this.f7882 = c18697;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C18697 c18697 = this.f7882;
        C19403.m44678(fFloatValue, c18697);
        C19403 c19403 = this.f7881;
        c19403.m44681(fFloatValue, c18697, false);
        c19403.invalidateSelf();
    }
}
