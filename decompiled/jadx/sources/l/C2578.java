package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.ۖܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2578 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f8159;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f8160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f8161;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C2578(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3) {
        this.f8159 = floatingActionButton;
        this.f8160 = floatingActionButton2;
        this.f8161 = floatingActionButton3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8159.setVisibility(4);
        this.f8160.setVisibility(4);
        this.f8161.setVisibility(4);
    }
}
