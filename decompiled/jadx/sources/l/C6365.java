package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6365 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15869 f19694;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15869 f19695;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 5;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C6365(C15869 c15869, C15869 c158610) {
        this.f19695 = c15869;
        this.f19694 = c158610;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882((int) EnumC7464.AE_ENUM.m19999());
        this.f19695.mo2828((InterfaceC0408) c6053);
        this.f19694.mo2828((InterfaceC0408) c6053);
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        C15869 c15869 = this.f19695;
        C12923.m31434(c15869, c3046);
        this.f19695 = c15869;
        C15869 c158610 = this.f19694;
        C12923.m31434(c158610, c3046);
        this.f19694 = c158610;
        return this;
    }
}
