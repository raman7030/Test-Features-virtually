package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6657 extends AbstractC22751 {

    /* JADX INFO: renamed from: ۙ */
    public static C2582 f17172 = new C2582(200);

    /* JADX INFO: renamed from: ᩶ */
    public int f17173;

    /* JADX INFO: renamed from: ֫ */
    public static C6657 m15160(int i, InterfaceC22580 interfaceC22580) {
        C6657 c6657 = (C6657) f17172.m3892();
        if (c6657 != null) {
            c6657.f28294 = i;
            c6657.f17173 = interfaceC22580.getLineNumber();
        } else {
            c6657 = new C6657(i, -2);
            c6657.f17173 = interfaceC22580.getLineNumber();
        }
        if (interfaceC22580 instanceof C7309) {
            ((C7309) interfaceC22580).m16883();
        }
        return c6657;
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ܿ */
    public final void mo14008() {
        f17172.m3890(this);
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.getClass();
        c5636.write(".line ", 0, 6);
        c5636.m12537(this.f17173);
        return true;
    }
}
