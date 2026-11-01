package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܶۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H89S */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16640 extends AbstractC12342 {

    /* JADX INFO: renamed from: ֫ */
    public int f48909;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37710(C17311 c17311);

    /* JADX INFO: renamed from: ֫ */
    public final int m37708() {
        return this.f48909;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37709(C17311 c17311) throws C10607 {
        mo37710(c17311);
        c17311.m39276(EnumC5913.FOUR);
        this.f48909 = c17311.m39280();
        try {
            c17311.m39274();
            throw new C10607("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }
}
