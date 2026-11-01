package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C15735 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C16091 f45576;

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19305() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15735(C16091 c16091, AbstractC6462 abstractC6462) {
        super(c16091, C3666.m7020(abstractC6462));
        this.f45576 = c16091;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        C16091 c16091 = this.f45576;
        C3666 c3666 = c16091.f47348;
        int i = this.f26759;
        c3666.m7062(i + 46);
        return c16091.f47349[i];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ܳ */
    public final void mo8025() {
        this.f45576.f47348.m7062(this.f26759 + 79);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19301() {
        this.f45576.f47348.m7062(92);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final void mo19298() {
        this.f45576.f47348.m7062(88);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19302(int i) {
        this.f45576.f47348.m7062(((C3666.m7034(i) - 1) * 3) + 91);
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("indexed("), InterfaceC24273.f76903[this.f26759], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
