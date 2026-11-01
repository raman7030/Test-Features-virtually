package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۡܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10858 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10187 f30092;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewGroup f30093;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f30094;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ View f30095;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C7014 f30096;

    public C10858(ViewGroup viewGroup, View view, boolean z, C7014 c7014, C10187 c10187) {
        this.f30093 = viewGroup;
        this.f30095 = view;
        this.f30094 = z;
        this.f30096 = c7014;
        this.f30092 = c10187;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f30093;
        View view = this.f30095;
        viewGroup.endViewTransition(view);
        boolean z = this.f30094;
        C7014 c7014 = this.f30096;
        if (z) {
            c7014.m16143().m49056(view);
        }
        this.f30092.m38448();
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7014);
        }
    }
}
