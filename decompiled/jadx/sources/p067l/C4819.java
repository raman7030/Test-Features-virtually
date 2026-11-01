package p067l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.ۖܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ FloatingActionButton f10951;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ FloatingActionButton f10952;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ FloatingActionButton f10953;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C4819(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3) {
        this.f10951 = floatingActionButton;
        this.f10952 = floatingActionButton2;
        this.f10953 = floatingActionButton3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10951.setVisibility(4);
        this.f10952.setVisibility(4);
        this.f10953.setVisibility(4);
    }
}
