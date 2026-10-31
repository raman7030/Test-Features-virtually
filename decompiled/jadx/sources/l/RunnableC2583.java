package l;

/* JADX INFO: renamed from: l.ۖܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2583 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AnimationAnimationListenerC3994 f8173;

    public RunnableC2583(AnimationAnimationListenerC3994 animationAnimationListenerC3994) {
        this.f8173 = animationAnimationListenerC3994;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationAnimationListenerC3994 animationAnimationListenerC3994 = this.f8173;
        animationAnimationListenerC3994.f12659.endViewTransition(animationAnimationListenerC3994.f12661);
        animationAnimationListenerC3994.f12658.m36287();
    }
}
