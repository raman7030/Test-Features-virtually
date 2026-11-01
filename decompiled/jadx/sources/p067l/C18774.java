package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public class C18774 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public AbstractC7783 f56095;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16091 f56096;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18774(C16091 c16091, AbstractC7783 abstractC7783) {
        super(c16091, C3666.m7020(abstractC7783.mo18010(c16091.f47350)));
        this.f56096 = c16091;
        this.f56095 = abstractC7783;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public AbstractC9701 mo8027() {
        C16091 c16091 = this.f56096;
        C3666 c3666 = c16091.f47348;
        C14750 c14750 = c3666.f7740.f39897;
        AbstractC7783 abstractC7783 = this.f56095;
        c3666.m7043(178, C14750.m33698(c14750, abstractC7783), abstractC7783);
        return c16091.f47349[this.f26759];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܳ */
    public void mo8025() {
        C3666 c3666 = this.f56096.f47348;
        C14750 c14750 = c3666.f7740.f39897;
        AbstractC7783 abstractC7783 = this.f56095;
        c3666.m7043(179, C14750.m33698(c14750, abstractC7783), abstractC7783);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܽ */
    public AbstractC9701 mo22646() {
        C16091 c16091 = this.f56096;
        C8374 c8374 = c16091.f47350;
        AbstractC7783 abstractC7783 = this.f56095;
        C12497 c12497 = (C12497) abstractC7783.mo18010(c8374);
        int iM7020 = C3666.m7020(c12497.f35031);
        c16091.f47348.m7064(abstractC7783, c12497);
        return c16091.f47349[iM7020];
    }

    public String toString() {
        return "static(" + this.f56095 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
