package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۘܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnimationAnimationListenerC6164 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10187 f15474;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewGroup f15475;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C7014 f15476;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f15477;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC6164(View view, ViewGroup viewGroup, C10187 c10187, C7014 c7014) {
        this.f15476 = c7014;
        this.f15475 = viewGroup;
        this.f15477 = view;
        this.f15474 = c10187;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC7291.m16763(2)) {
            C12826.toString(this.f15476);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f15475.post(new RunnableC4823(this));
        if (AbstractC7291.m16763(2)) {
            C12826.toString(this.f15476);
        }
    }
}
