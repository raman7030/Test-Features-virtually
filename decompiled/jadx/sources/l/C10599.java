package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C10599 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15869 f31810;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char f31811;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C10599(char c, C15869 c15869) {
        this.f31811 = c;
        this.f31810 = c15869;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882((int) this.f31811);
        this.f31810.mo2828((InterfaceC0408) c6053);
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        if (!this.f31810.mo18355()) {
            C15869 c15869 = this.f31810;
            C12923.m31434(c15869, c3046);
            this.f31810 = c15869;
            if (!EnumC7464.m19995(this.f31811)) {
                AbstractC2465 abstractC2465 = this.f31810.f49042;
                this.f31811 = abstractC2465 == null ? EnumC7464.AE_NOT_APPLICABLE.m19999() : abstractC2465.f7865.m27252();
            }
        }
        return this;
    }
}
