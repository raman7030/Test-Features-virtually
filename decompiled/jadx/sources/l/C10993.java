package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10993 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15869 f33052;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC1800 f33053;

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C10993(C15869 c15869, InterfaceC12218 interfaceC12218) {
        this.f33052 = c15869;
        this.f33053 = interfaceC12218;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        this.f33052.mo2828(interfaceC0408);
        this.f33053.mo2828(interfaceC0408);
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return this.f33053.getLength() + 2;
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        C15869 c15869 = this.f33052;
        C12923.m31434(c15869, c3046);
        this.f33052 = c15869;
        this.f33053 = C12923.m31433(this.f33053, c3046);
        return this;
    }
}
