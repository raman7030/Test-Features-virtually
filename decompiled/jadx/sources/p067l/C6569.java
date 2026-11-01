package p067l;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: l.ۙۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6569 extends C24003 {

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C3847 f16949;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ AbstractC5462 f16950;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ int f16951;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6569(C3847 c3847, AbstractC5462 abstractC5462, int i, float f, float f2, float f3, float f4, int i2, AbstractC5462 abstractC5463) {
        super(abstractC5462, i, f, f2, f3, f4);
        this.f16949 = c3847;
        this.f16951 = i2;
        this.f16950 = abstractC5463;
    }

    @Override // p067l.C24003, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f76230) {
            return;
        }
        int i = this.f16951;
        AbstractC5462 abstractC5462 = this.f16950;
        C3847 c3847 = this.f16949;
        if (i <= 0) {
            c3847.f8274.mo27280(c3847.f8256, abstractC5462);
        } else {
            c3847.f8277.add(abstractC5462.itemView);
            this.f76231 = true;
            if (i > 0) {
                c3847.f8256.post(new RunnableC5228(c3847, this, i));
            }
        }
        View view = c3847.f8261;
        View view2 = abstractC5462.itemView;
        if (view == view2) {
            c3847.m7557(view2);
        }
    }
}
