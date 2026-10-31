package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 865M */
/* JADX INFO: loaded from: classes4.dex */
public final class C12274 extends AbstractC21447 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f36563;

    public C12274(int i, InterfaceC4333 interfaceC4333) {
        super(i, -3);
        this.f36563 = interfaceC4333.mo9896();
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        c3438.getClass();
        c3438.write(".source", 0, 7);
        String str = this.f36563;
        if (str == null) {
            return true;
        }
        c3438.write(" \"", 0, 2);
        C14020.m33624(c3438, str);
        c3438.write(34);
        return true;
    }
}
