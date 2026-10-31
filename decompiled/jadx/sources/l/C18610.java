package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C18610 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6739 f57710;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC13833 f57711;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 3;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C18610(EnumC13833 enumC13833, C6739 c6739) {
        this.f57711 = enumC13833;
        this.f57710 = c6739;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882(this.f57711.m33193().intValue());
        c6053.m16889(this.f57710.f20943);
    }
}
