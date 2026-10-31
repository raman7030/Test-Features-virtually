package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۚۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class AnimationAnimationListenerC5291 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f16528;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC5291(C12346 c12346) {
        this.f16528 = c12346;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC4585 interfaceC4585;
        C12346 c12346 = this.f16528;
        if (c12346.f36952) {
            c12346.f36969.setAlpha(255);
            c12346.f36969.start();
            if (c12346.f36956 && (interfaceC4585 = c12346.f36962) != null) {
                interfaceC4585.mo1502();
            }
            c12346.f36955 = c12346.f36964.getTop();
            return;
        }
        c12346.m29963();
    }
}
