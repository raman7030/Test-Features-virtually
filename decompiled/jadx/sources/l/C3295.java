package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.ۗܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3295 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f10336;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f10337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f10338;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f10339;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C3295(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, FloatingActionButton floatingActionButton4) {
        this.f10336 = floatingActionButton;
        this.f10337 = floatingActionButton2;
        this.f10339 = floatingActionButton3;
        this.f10338 = floatingActionButton4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10336.setVisibility(4);
        this.f10337.setVisibility(4);
        this.f10339.setVisibility(4);
        this.f10338.setVisibility(4);
    }
}
