package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10913 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f32784;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f32785;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32786;

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17365() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10913(C14439 c14439, AbstractC5698 abstractC5698, boolean z) {
        super(c14439, C1365.m4782(abstractC5698.mo16091(c14439.f44256)));
        this.f32785 = c14439;
        this.f32784 = abstractC5698;
        this.f32786 = z;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        C14439 c14439 = this.f32785;
        C1365 c1365 = c14439.f44254;
        C13028 c13028 = c1365.f4968.f36883;
        AbstractC5698 abstractC5698 = this.f32784;
        c1365.m4805(180, C13028.m31613(c13028, abstractC5698), abstractC5698);
        return c14439.f44255[this.f23845];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܳ */
    public final void mo5815() {
        C1365 c1365 = this.f32785.f44254;
        C13028 c13028 = c1365.f4968.f36883;
        AbstractC5698 abstractC5698 = this.f32784;
        c1365.m4805(181, C13028.m31613(c13028, abstractC5698), abstractC5698);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7715 mo20666() {
        C14439 c14439 = this.f32785;
        C6319 c6319 = c14439.f44256;
        C1365 c1365 = c14439.f44254;
        AbstractC5698 abstractC5698 = this.f32784;
        C10658 c10658 = (C10658) abstractC5698.m16096(c6319);
        int iM4782 = C1365.m4782(c10658.f32060);
        long jMo16084 = abstractC5698.f17561.mo16084() & 512;
        boolean z = this.f32786;
        if (jMo16084 != 0 && !z) {
            c1365.m4807(abstractC5698, c10658);
        } else if (z) {
            c1365.m4820(abstractC5698, c10658);
        } else {
            c1365.m4830(abstractC5698, c10658);
        }
        return c14439.f44255[iM4782];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17361() {
        this.f32785.f44255[4].mo17361();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫ */
    public final void mo17358() {
        this.f32785.f44255[4].mo17358();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17362(int i) {
        this.f32785.f44255[4].mo17362(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("member(");
        sb.append(this.f32784);
        sb.append(this.f32786 ? " nonvirtual)" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
