package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20145 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f65244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65245;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 4;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C20145(int i, long j) {
        this.f65245 = i;
        this.f65244 = j;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f65245);
        c6053.m16889((int) this.f65244);
    }
}
