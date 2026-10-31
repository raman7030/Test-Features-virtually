package l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.ۘۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3880 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19403 f12399;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18697 f12400;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C3880(C19403 c19403, C18697 c18697) {
        this.f12399 = c19403;
        this.f12400 = c18697;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12399.f62776 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C19403 c19403 = this.f12399;
        C18697 c18697 = this.f12400;
        c19403.m44681(1.0f, c18697, true);
        c18697.f59108 = c18697.f59125;
        c18697.f59107 = c18697.f59115;
        c18697.f59112 = c18697.f59111;
        c18697.m43312((c18697.f59113 + 1) % c18697.f59126.length);
        if (c19403.f62779) {
            c19403.f62779 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c18697.f59124) {
                c18697.f59124 = false;
                return;
            }
            return;
        }
        c19403.f62776 += 1.0f;
    }
}
