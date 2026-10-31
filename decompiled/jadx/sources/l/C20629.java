package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩷ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final class C20629 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f66359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f66360;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C20629(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2) {
        this.f66359 = floatingActionButton;
        this.f66360 = floatingActionButton2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f66359.setVisibility(4);
        this.f66360.setVisibility(4);
    }
}
