package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܶۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H89S */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15017 extends AbstractC10494 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45792;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35554(C15723 c15723);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35552() {
        return this.f45792;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35553(C15723 c15723) throws C8669 {
        mo35554(c15723);
        c15723.m37107(EnumC3730.FOUR);
        this.f45792 = c15723.m37111();
        try {
            c15723.m37105();
            throw new C8669("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }
}
