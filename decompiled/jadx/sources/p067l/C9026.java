package p067l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.ۜ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes2.dex */
public final class C9026 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f24491;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    public C9026(Runnable runnable) {
        this.f24491 = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f24491.run();
    }
}
