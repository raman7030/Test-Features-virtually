package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D88X */
/* JADX INFO: loaded from: classes3.dex */
public final class C5141 extends C17135 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f16081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m14702() {
        return this.f16081;
    }

    @Override // l.C17135
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14701(C15723 c15723) throws IOException {
        super.mo14701(c15723);
        int i = C0201.f1444[m40165().ordinal()];
        if (i == 1) {
            this.f16081 = c15723.m37113();
            c15723.m37113();
            c15723.m37106(m40163() - 20);
        } else if (i == 2) {
            c15723.m37106(m40163() - 16);
        } else {
            throw new IOException("Invalid PDU type: " + m40165());
        }
    }
}
