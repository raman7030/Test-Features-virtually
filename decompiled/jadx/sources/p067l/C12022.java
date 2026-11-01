package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12022 extends AbstractC22751 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5145 f33515;

    /* JADX INFO: renamed from: ᩶ */
    public final C16909 f33516;

    public C12022(int i, C16909 c16909, InterfaceC5145 interfaceC5145) {
        super(i, -1);
        this.f33515 = interfaceC5145;
        this.f33516 = c16909;
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        c5636.getClass();
        c5636.write(".local ", 0, 7);
        InterfaceC5145 interfaceC5145 = this.f33515;
        this.f33516.m38481(c5636, interfaceC5145.mo10988());
        String name = interfaceC5145.getName();
        String type = interfaceC5145.getType();
        String signature = interfaceC5145.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c5636.write(", ", 0, 2);
        C5316.m11507(c5636, name, type, signature);
        return true;
    }
}
