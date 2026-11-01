package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13725 extends C18774 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C16091 f38723;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13725(C16091 c16091, AbstractC7783 abstractC7783) {
        super(c16091, abstractC7783);
        this.f38723 = c16091;
    }

    @Override // p067l.C18774, p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        AbstractC7783 abstractC7783 = this.f56095;
        C1446.m31704(abstractC7783.f20405 == EnumC3600.f7339);
        C16091 c16091 = this.f38723;
        int iM7020 = C3666.m7020(abstractC7783.mo18010(c16091.f47350));
        c16091.f47348.m7047((InterfaceC10057) abstractC7783);
        return c16091.f47349[iM7020];
    }

    @Override // p067l.C18774, p067l.AbstractC9701
    /* JADX INFO: renamed from: ܳ */
    public final void mo8025() {
        C1446.m31702("this method shouldn't be invoked");
        throw null;
    }

    @Override // p067l.C18774, p067l.AbstractC9701
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9701 mo22646() {
        AbstractC7783 abstractC7783 = this.f56095;
        C1446.m31704(abstractC7783.f20405 == EnumC3600.f7343);
        C16091 c16091 = this.f38723;
        C12497 c12497 = (C12497) abstractC7783.mo18010(c16091.f47350);
        int iM7020 = C3666.m7020(c12497.f35031);
        c16091.f47348.m7048((C11136) abstractC7783, c12497);
        return c16091.f47349[iM7020];
    }

    @Override // p067l.C18774
    public final String toString() {
        return "dynamic(" + this.f56095 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
