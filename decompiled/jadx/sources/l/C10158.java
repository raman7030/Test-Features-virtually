package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10158 extends AbstractC21447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2922 f30553;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15300 f30554;

    public C10158(int i, C15300 c15300, InterfaceC2922 interfaceC2922) {
        super(i, -1);
        this.f30553 = interfaceC2922;
        this.f30554 = c15300;
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.getClass();
        c3438.write(".local ", 0, 7);
        InterfaceC2922 interfaceC2922 = this.f30553;
        this.f30554.m36320(c3438, interfaceC2922.mo8920());
        String name = interfaceC2922.getName();
        String type = interfaceC2922.getType();
        String signature = interfaceC2922.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c3438.write(", ", 0, 2);
        C3102.m9464(c3438, name, type, signature);
        return true;
    }
}
