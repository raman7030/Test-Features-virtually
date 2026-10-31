package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۡܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8933 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8227 f27157;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f27158;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f27159;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f27160;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f27161;

    public C8933(ViewGroup viewGroup, View view, boolean z, C4888 c4888, C8227 c8227) {
        this.f27158 = viewGroup;
        this.f27160 = view;
        this.f27159 = z;
        this.f27161 = c4888;
        this.f27157 = c8227;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f27158;
        View view = this.f27160;
        viewGroup.endViewTransition(view);
        boolean z = this.f27159;
        C4888 c4888 = this.f27161;
        if (z) {
            c4888.m14246().m46733(view);
        }
        this.f27157.m36287();
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c4888);
        }
    }
}
