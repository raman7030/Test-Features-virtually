package p067l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۚۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class AnimationAnimationListenerC7397 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14102 f19365;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC7397(C14102 c14102) {
        this.f19365 = c14102;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC6726 interfaceC6726;
        C14102 c14102 = this.f19365;
        if (c14102.f39965) {
            c14102.f39982.setAlpha(255);
            c14102.f39982.start();
            if (c14102.f39969 && (interfaceC6726 = c14102.f39975) != null) {
                interfaceC6726.mo3900();
            }
            c14102.f39968 = c14102.f39977.getTop();
            return;
        }
        c14102.m32023();
    }
}
