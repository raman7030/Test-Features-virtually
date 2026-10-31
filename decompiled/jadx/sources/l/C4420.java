package l;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: l.ۙۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C4420 extends C22764 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1556 f14133;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3255 f14134;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14135;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4420(C1556 c1556, AbstractC3255 abstractC3255, int i, float f, float f2, float f3, float f4, int i2, AbstractC3255 abstractC3256) {
        super(abstractC3255, i, f, f2, f3, f4);
        this.f14133 = c1556;
        this.f14135 = i2;
        this.f14134 = abstractC3256;
    }

    @Override // l.C22764, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f73504) {
            return;
        }
        int i = this.f14135;
        AbstractC3255 abstractC3255 = this.f14134;
        C1556 c1556 = this.f14133;
        if (i <= 0) {
            c1556.f5493.mo25263(c1556.f5475, abstractC3255);
        } else {
            c1556.f5496.add(abstractC3255.itemView);
            this.f73505 = true;
            if (i > 0) {
                c1556.f5475.post(new RunnableC3009(c1556, this, i));
            }
        }
        View view = c1556.f5480;
        View view2 = abstractC3255.itemView;
        if (view == view2) {
            c1556.m5328(view2);
        }
    }
}
