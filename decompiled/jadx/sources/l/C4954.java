package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4954 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16636 f15614;

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882((int) EnumC7464.AE_ANNOTATION.m19999());
        this.f15614.mo2828(c6053);
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return this.f15614.getLength() + 1;
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        this.f15614 = (C16636) C12923.m31433(this.f15614, c3046);
        return this;
    }
}
