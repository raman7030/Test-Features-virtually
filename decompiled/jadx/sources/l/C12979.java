package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12979 extends AbstractC21447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19856 f38883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15300 f38884;

    public C12979(int i, C15300 c15300, InterfaceC19856 interfaceC19856) {
        super(i, -1);
        this.f38883 = interfaceC19856;
        this.f38884 = c15300;
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.getClass();
        c3438.write(".restart local ", 0, 15);
        InterfaceC19856 interfaceC19856 = this.f38883;
        this.f38884.m36320(c3438, interfaceC19856.mo12317());
        String name = interfaceC19856.getName();
        String type = interfaceC19856.getType();
        String signature = interfaceC19856.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c3438.write("  # ", 0, 4);
        C3102.m9464(c3438, name, type, signature);
        return true;
    }
}
