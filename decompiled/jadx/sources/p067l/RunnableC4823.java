package p067l;

/* JADX INFO: renamed from: l.ۖܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4823 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AnimationAnimationListenerC6164 f10965;

    public RunnableC4823(AnimationAnimationListenerC6164 animationAnimationListenerC6164) {
        this.f10965 = animationAnimationListenerC6164;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationAnimationListenerC6164 animationAnimationListenerC6164 = this.f10965;
        animationAnimationListenerC6164.f15475.endViewTransition(animationAnimationListenerC6164.f15477);
        animationAnimationListenerC6164.f15474.m38448();
    }
}
