package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D88X */
/* JADX INFO: loaded from: classes3.dex */
public final class C7254 extends C18653 {

    /* JADX INFO: renamed from: ᩷ */
    public short f18920;

    /* JADX INFO: renamed from: ܿ */
    public final short m16610() {
        return this.f18920;
    }

    @Override // p067l.C18653
    /* JADX INFO: renamed from: ֫ */
    public final void mo16609(C17311 c17311) throws IOException {
        super.mo16609(c17311);
        int i = C2559.f4223[m42410().ordinal()];
        if (i == 1) {
            this.f18920 = c17311.m39282();
            c17311.m39282();
            c17311.m39275(m42408() - 20);
        } else if (i == 2) {
            c17311.m39275(m42408() - 16);
        } else {
            throw new IOException("Invalid PDU type: " + m42410());
        }
    }
}
