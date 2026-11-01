package p067l;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.᩺ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public class C24003 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final int f76221;

    /* JADX INFO: renamed from: ۖ */
    public float f76222;

    /* JADX INFO: renamed from: ۜ */
    public final float f76223;

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC5462 f76224;

    /* JADX INFO: renamed from: ۢ */
    public final ValueAnimator f76225;

    /* JADX INFO: renamed from: ܳ */
    public final float f76227;

    /* JADX INFO: renamed from: ܺ */
    public float f76228;

    /* JADX INFO: renamed from: ܽ */
    public float f76229;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f76231;

    /* JADX INFO: renamed from: ᩷ */
    public final float f76232;

    /* JADX INFO: renamed from: ᩻ */
    public final float f76233;

    /* JADX INFO: renamed from: ܿ */
    public boolean f76230 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f76226 = false;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C24003(AbstractC5462 abstractC5462, int i, float f, float f2, float f3, float f4) {
        this.f76221 = i;
        this.f76224 = abstractC5462;
        this.f76227 = f;
        this.f76233 = f2;
        this.f76223 = f3;
        this.f76232 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f76225 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C13275(this));
        valueAnimatorOfFloat.setTarget(abstractC5462.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f76229 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f76229 = 1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53172(float f) {
        this.f76229 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53171() {
        AbstractC5462 abstractC5462 = this.f76224;
        float f = this.f76227;
        float f2 = this.f76223;
        if (f == f2) {
            this.f76228 = abstractC5462.itemView.getTranslationX();
        } else {
            this.f76228 = C21740.m49018(f2, f, this.f76229, f);
        }
        float f3 = this.f76233;
        float f4 = this.f76232;
        if (f3 == f4) {
            this.f76222 = abstractC5462.itemView.getTranslationY();
        } else {
            this.f76222 = C21740.m49018(f4, f3, this.f76229, f3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f76226) {
            this.f76224.setIsRecyclable(true);
        }
        this.f76226 = true;
    }
}
