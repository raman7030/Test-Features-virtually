package l;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.᩺ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public class C22764 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f73495;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f73496;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f73497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC3255 f73498;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f73499;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f73501;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f73502;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f73503;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f73505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f73506;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f73507;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f73504 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73500 = false;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C22764(AbstractC3255 abstractC3255, int i, float f, float f2, float f3, float f4) {
        this.f73495 = i;
        this.f73498 = abstractC3255;
        this.f73501 = f;
        this.f73507 = f2;
        this.f73497 = f3;
        this.f73506 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f73499 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C11476(this));
        valueAnimatorOfFloat.setTarget(abstractC3255.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f73503 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f73503 = 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50839(float f) {
        this.f73503 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50838() {
        AbstractC3255 abstractC3255 = this.f73498;
        float f = this.f73501;
        float f2 = this.f73497;
        if (f == f2) {
            this.f73502 = abstractC3255.itemView.getTranslationX();
        } else {
            this.f73502 = C20382.m46695(f2, f, this.f73503, f);
        }
        float f3 = this.f73507;
        float f4 = this.f73506;
        if (f3 == f4) {
            this.f73496 = abstractC3255.itemView.getTranslationY();
        } else {
            this.f73496 = C20382.m46695(f4, f3, this.f73503, f3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f73500) {
            this.f73498.setIsRecyclable(true);
        }
        this.f73500 = true;
    }
}
