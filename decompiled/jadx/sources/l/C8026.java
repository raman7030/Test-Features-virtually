package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8026 extends C16636 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC17734 f24761;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13669 f24762;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1506 f24763;

    public C8026(C15869 c15869, boolean z) {
        super(c15869, z);
        this.f24763 = new C1506();
    }

    @Override // l.C16636, l.InterfaceC1800
    public final int getLength() {
        return this.f24763.getLength() + super.getLength() + 1 + this.f24762.getLength();
    }

    @Override // l.C16636, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882(this.f24761.f54274);
        this.f24762.mo2828(c6053);
        this.f24763.mo2828(c6053);
        super.mo2828(c6053);
    }

    public final String toString() {
        return this.f24761.toString() + " " + this.f24762.toString() + " " + this.f24763.toString();
    }
}
