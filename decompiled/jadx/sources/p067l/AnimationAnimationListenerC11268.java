package p067l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۢۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class AnimationAnimationListenerC11268 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5232 f31386;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC11268(C5232 c5232) {
        this.f31386 = c5232;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C5232 c5232 = this.f31386;
        c5232.f12310.setEnabled(false);
        c5232.f12296.setVisibility(0);
        c5232.f12297.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f31386.f12322.post(new Runnable() { // from class: l.᩷ۙܿ
            @Override // java.lang.Runnable
            public final void run() {
                C5232 c5232 = this.f69109.f31386;
                c5232.m11275();
                c5232.m11257();
            }
        });
    }
}
