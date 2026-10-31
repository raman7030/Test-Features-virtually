package l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.ۜ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes2.dex */
public final class C7005 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f21610;

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

    public C7005(Runnable runnable) {
        this.f21610 = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f21610.run();
    }
}
