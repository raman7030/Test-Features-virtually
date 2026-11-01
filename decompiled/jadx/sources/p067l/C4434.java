package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBJ8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4434 extends C12620 {
    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public final String mo5244() {
        return "#cdata";
    }

    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final void mo9268(Appendable appendable, int i, C2421 c2421) throws IOException {
        appendable.append("<![CDATA[").append(m27070());
    }

    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public final void mo9269(Appendable appendable, int i, C2421 c2421) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C12481(e);
        }
    }

    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final Object mo55709clone() {
        return (C4434) super.mo55709clone();
    }

    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final C12620 mo55709clone() {
        return (C4434) super.mo55709clone();
    }

    @Override // p067l.C12620, p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final AbstractC13152 mo55709clone() {
        return (C4434) super.mo55709clone();
    }
}
