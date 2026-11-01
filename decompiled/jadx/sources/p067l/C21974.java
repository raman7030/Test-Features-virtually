package p067l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩷ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final class C21974 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ FloatingActionButton f69040;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ FloatingActionButton f69041;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C21974(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2) {
        this.f69040 = floatingActionButton;
        this.f69041 = floatingActionButton2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f69040.setVisibility(4);
        this.f69041.setVisibility(4);
    }
}
