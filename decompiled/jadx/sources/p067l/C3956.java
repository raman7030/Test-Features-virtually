package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.֫۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3956 extends AbstractC12674 {

    /* JADX INFO: renamed from: ۧ */
    public final C14645 f8621;

    /* JADX INFO: renamed from: ܽ */
    public final int f8622;

    public C3956(C14645 c14645, int i) {
        this.f8621 = c14645;
        this.f8622 = i;
    }

    @Override // p067l.AbstractC12674
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15529 mo7902() {
        AbstractC6086 abstractC6086M33504 = this.f8621.m33504();
        int i = this.f8622;
        int iMo13855 = abstractC6086M33504.mo13855(i + 4);
        if (iMo13855 == 0) {
            return InterfaceC15529.f44390;
        }
        return new C9495(this, i + 16, iMo13855);
    }

    @Override // p067l.AbstractC12674
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC15529 mo7903() {
        C14645 c14645 = this.f8621;
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int i = this.f8622;
        int iMo13855 = abstractC6086M33504.mo13855(i + 8);
        if (iMo13855 != 0) {
            return new C9495(this, (c14645.m33504().mo13855(i + 4) * 8) + i + 16, iMo13855);
        }
        return InterfaceC15529.f44390;
    }

    @Override // p067l.AbstractC12674
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15529 mo7904() {
        C14645 c14645 = this.f8621;
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int i = this.f8622;
        int iMo13855 = abstractC6086M33504.mo13855(i + 12);
        if (iMo13855 != 0) {
            int iMo13856 = c14645.m33504().mo13855(i + 4);
            int i2 = iMo13856 * 8;
            return new C9495(this, (c14645.m33504().mo13855(i + 8) * 8) + i2 + i + 16, iMo13855);
        }
        return InterfaceC15529.f44390;
    }

    @Override // p067l.AbstractC12674
    /* JADX INFO: renamed from: ֫ */
    public final Set mo7901() {
        C14645 c14645 = this.f8621;
        return AbstractC12674.m29151(c14645, c14645.m33504().mo13855(this.f8622));
    }
}
