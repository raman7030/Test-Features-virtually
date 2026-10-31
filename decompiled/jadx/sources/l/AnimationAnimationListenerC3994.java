package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۘܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnimationAnimationListenerC3994 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8227 f12658;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f12659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f12660;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f12661;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC3994(View view, ViewGroup viewGroup, C8227 c8227, C4888 c4888) {
        this.f12660 = c4888;
        this.f12659 = viewGroup;
        this.f12661 = view;
        this.f12658 = c8227;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC5180.m14853(2)) {
            C11003.toString(this.f12660);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f12659.post(new RunnableC2583(this));
        if (AbstractC5180.m14853(2)) {
            C11003.toString(this.f12660);
        }
    }
}
