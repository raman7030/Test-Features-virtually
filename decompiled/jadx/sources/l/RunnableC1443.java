package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֨᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1443 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f5150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f5151;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5152;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5153;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f5154;

    public RunnableC1443(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5153 = true;
        this.f5151 = viewGroup;
        this.f5154 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f5153 = true;
        if (this.f5152) {
            return !this.f5150;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f5152 = true;
            ViewTreeObserverOnPreDrawListenerC14493.m34591(this.f5151, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f5153 = true;
        if (this.f5152) {
            return !this.f5150;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f5152 = true;
            ViewTreeObserverOnPreDrawListenerC14493.m34591(this.f5151, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f5152;
        ViewGroup viewGroup = this.f5151;
        if (!z && this.f5153) {
            this.f5153 = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f5154);
            this.f5150 = true;
        }
    }
}
