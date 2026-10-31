package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20851 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15869 f67506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15869 f67507;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67508;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15869 f67509;

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
        C15869 c15869 = this.f67507;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f67509.f20943);
        C15869 c158610 = this.f67506;
        if (c158610.mo18355()) {
            c6053.m16889(c158610.f20943);
        } else {
            c6053.m16889(0);
        }
        if (c15869.mo18355()) {
            c6053.m16889(c15869.f20943);
        } else {
            c6053.m16889(0);
        }
        c6053.m16889(this.f67508);
    }
}
