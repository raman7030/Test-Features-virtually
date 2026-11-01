package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12740 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public AbstractC7783 f35762;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C16091 f35763;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f35764;

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19305() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12740(C16091 c16091, AbstractC7783 abstractC7783, boolean z) {
        super(c16091, C3666.m7020(abstractC7783.mo18010(c16091.f47350)));
        this.f35763 = c16091;
        this.f35762 = abstractC7783;
        this.f35764 = z;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        C16091 c16091 = this.f35763;
        C3666 c3666 = c16091.f47348;
        C14750 c14750 = c3666.f7740.f39897;
        AbstractC7783 abstractC7783 = this.f35762;
        c3666.m7043(180, C14750.m33698(c14750, abstractC7783), abstractC7783);
        return c16091.f47349[this.f26759];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܳ */
    public final void mo8025() {
        C3666 c3666 = this.f35763.f47348;
        C14750 c14750 = c3666.f7740.f39897;
        AbstractC7783 abstractC7783 = this.f35762;
        c3666.m7043(181, C14750.m33698(c14750, abstractC7783), abstractC7783);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9701 mo22646() {
        C16091 c16091 = this.f35763;
        C8374 c8374 = c16091.f47350;
        C3666 c3666 = c16091.f47348;
        AbstractC7783 abstractC7783 = this.f35762;
        C12497 c12497 = (C12497) abstractC7783.m18015(c8374);
        int iM7020 = C3666.m7020(c12497.f35031);
        long jMo18003 = abstractC7783.f20407.mo18003() & 512;
        boolean z = this.f35764;
        if (jMo18003 != 0 && !z) {
            c3666.m7045(abstractC7783, c12497);
        } else if (z) {
            c3666.m7058(abstractC7783, c12497);
        } else {
            c3666.m7068(abstractC7783, c12497);
        }
        return c16091.f47349[iM7020];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19301() {
        this.f35763.f47349[4].mo19301();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final void mo19298() {
        this.f35763.f47349[4].mo19298();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19302(int i) {
        this.f35763.f47349[4].mo19302(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("member(");
        sb.append(this.f35762);
        sb.append(this.f35764 ? " nonvirtual)" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
