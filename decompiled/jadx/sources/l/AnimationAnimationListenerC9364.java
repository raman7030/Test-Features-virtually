package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۢۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class AnimationAnimationListenerC9364 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f28437;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC9364(C3013 c3013) {
        this.f28437 = c3013;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C3013 c3013 = this.f28437;
        c3013.f9512.setEnabled(false);
        c3013.f9498.setVisibility(0);
        c3013.f9499.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f28437.f9524.post(new Runnable() { // from class: l.᩷ۙܿ
            @Override // java.lang.Runnable
            public final void run() {
                C3013 c3013 = this.f66429.f28437;
                c3013.m9224();
                c3013.m9206();
            }
        });
    }
}
