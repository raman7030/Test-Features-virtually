package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18028 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9521 f56205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56206;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15869 f56207;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56208;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 8;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C9521 c9521 = this.f56205;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(c9521.f28914);
        c6053.m16889(c9521.f28913);
        c6053.m16889(this.f56208);
        C15869 c15869 = this.f56207;
        if (c15869.mo18355()) {
            c6053.m16889(c15869.f20943);
        } else {
            c6053.m16889(0);
        }
    }
}
