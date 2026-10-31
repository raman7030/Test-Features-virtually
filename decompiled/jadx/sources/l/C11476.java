package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۨۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11476 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22764 f34283;

    public C11476(C22764 c22764) {
        this.f34283 = c22764;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34283.m50839(valueAnimator.getAnimatedFraction());
    }
}
