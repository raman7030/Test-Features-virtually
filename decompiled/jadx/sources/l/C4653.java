package l;

/* JADX INFO: renamed from: l.ۙ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4653 extends AbstractC23642 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20176 f14755;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6502 f14756;

    @Override // l.AbstractC23642
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13622(C17998 c17998) {
        C6502 c6502 = this.f14756;
        if (c6502.m17999() != null) {
            this.f14755.m46408(c17998);
            c6502.m18007();
        }
    }

    public C4653(C20176 c20176, C6502 c6502) {
        this.f14755 = c20176;
        this.f14756 = c6502;
    }

    @Override // l.InterfaceC6709
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13621(C17473 c17473) {
        this.f14755.m46408(c17473);
        this.f14756.m18007();
    }

    @Override // l.InterfaceC6709
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15050 mo13623(C17473 c17473) {
        AbstractC12414 abstractC12414 = this.f14755.f65304;
        if (this.f14756.m18005((InterfaceC16233) null) == null) {
            return null;
        }
        return C20614.f66332;
    }

    @Override // l.C20697
    public final String toString() {
        return "ReceiveHasNext@" + C11024.m27354(this);
    }
}
