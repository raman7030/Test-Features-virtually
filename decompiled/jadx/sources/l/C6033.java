package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6033 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15869 f18514;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 4;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C6033(int i, C15869 c15869) {
        this.f18513 = i;
        this.f18514 = c15869;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C15869 c15869 = this.f18514;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(c15869 == null ? 0 : c15869.f20943);
        c6053.m16889(this.f18513);
    }
}
