package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBJ8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2174 extends C10787 {
    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public final String mo2915() {
        return "#cdata";
    }

    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7189(Appendable appendable, int i, C0056 c0056) throws IOException {
        appendable.append("<![CDATA[").append(m25053());
    }

    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7190(Appendable appendable, int i, C0056 c0056) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C10641(e);
        }
    }

    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final Object mo2918clone() {
        return (C2174) super.mo2918clone();
    }

    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final C10787 mo2918clone() {
        return (C2174) super.mo2918clone();
    }

    @Override // l.C10787, l.AbstractC11347
    /* JADX INFO: renamed from: clone */
    public final AbstractC11347 mo2918clone() {
        return (C2174) super.mo2918clone();
    }
}
