package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3740 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f7923;

    /* JADX INFO: renamed from: ۙ */
    public final ViewGroup f7924;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f7925;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f7926;

    /* JADX INFO: renamed from: ᩹ */
    public final View f7927;

    public RunnableC3740(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f7926 = true;
        this.f7924 = viewGroup;
        this.f7927 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f7926 = true;
        if (this.f7925) {
            return !this.f7923;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f7925 = true;
            ViewTreeObserverOnPreDrawListenerC1561.m36732(this.f7924, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f7926 = true;
        if (this.f7925) {
            return !this.f7923;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f7925 = true;
            ViewTreeObserverOnPreDrawListenerC1561.m36732(this.f7924, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f7925;
        ViewGroup viewGroup = this.f7924;
        if (!z && this.f7926) {
            this.f7926 = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f7927);
            this.f7923 = true;
        }
    }
}
