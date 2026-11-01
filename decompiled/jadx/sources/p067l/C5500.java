package p067l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.ۗܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5500 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ FloatingActionButton f13144;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ FloatingActionButton f13145;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ FloatingActionButton f13146;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ FloatingActionButton f13147;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C5500(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, FloatingActionButton floatingActionButton4) {
        this.f13144 = floatingActionButton;
        this.f13145 = floatingActionButton2;
        this.f13147 = floatingActionButton3;
        this.f13146 = floatingActionButton4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f13144.setVisibility(4);
        this.f13145.setVisibility(4);
        this.f13147.setVisibility(4);
        this.f13146.setVisibility(4);
    }
}
