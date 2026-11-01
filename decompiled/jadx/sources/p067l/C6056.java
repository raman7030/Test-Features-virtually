package p067l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.ۘۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6056 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20809 f15206;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C20138 f15207;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C6056(C20809 c20809, C20138 c20138) {
        this.f15206 = c20809;
        this.f15207 = c20138;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15206.f65387 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C20809 c20809 = this.f15206;
        C20138 c20138 = this.f15207;
        c20809.m46975(1.0f, c20138, true);
        c20138.f62331 = c20138.f62348;
        c20138.f62330 = c20138.f62338;
        c20138.f62335 = c20138.f62334;
        c20138.m45578((c20138.f62336 + 1) % c20138.f62349.length);
        if (c20809.f65390) {
            c20809.f65390 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c20138.f62347) {
                c20138.f62347 = false;
                return;
            }
            return;
        }
        c20809.f65387 += 1.0f;
    }
}
