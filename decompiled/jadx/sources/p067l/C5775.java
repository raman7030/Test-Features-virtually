package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5775 extends AbstractC11811 {
    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public final void mo9269(Appendable appendable, int i, C2421 c2421) {
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC13152 mo12956() {
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public final String mo5244() {
        return "#comment";
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo12957() {
        return 0;
    }

    public C5775(String str) {
        this.f32967 = str;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m12954() {
        String strM27070 = m27070();
        if (strM27070.length() > 1) {
            return strM27070.startsWith("!") || strM27070.startsWith("?");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public final C17983 m12955() {
        String strM27070 = m27070();
        String strM38720 = C17073.m38720(1, 1, strM27070);
        if (strM38720.length() > 1 && (strM38720.startsWith("!") || strM38720.startsWith("?"))) {
            return null;
        }
        String strM16053 = C6988.m16053("<", strM38720, ">");
        C12501 c12501 = new C12501(new C18654());
        c12501.m28803();
        C3092 c3092M28797 = c12501.m28797(strM16053, super.mo27067());
        if (c3092M28797.m5246().m47890().size() <= 0) {
            return null;
        }
        C21199 c21199M47900 = c3092M28797.m5246().m47900();
        C17983 c17983 = new C17983(C23880.m52963(c3092M28797).m28802().m7398(c21199M47900.m47902()), strM27070.startsWith("!"));
        c17983.mo27062().m38891(c21199M47900.mo27062());
        return c17983;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final void mo9268(Appendable appendable, int i, C2421 c2421) throws IOException {
        if (c2421.m3374() && this.f36968 == 0) {
            AbstractC13152 abstractC13152 = this.f36967;
            if ((abstractC13152 instanceof C21199) && ((C21199) abstractC13152).m47882().m40574()) {
                AbstractC13152.m30128(appendable, i, c2421);
            }
        }
        appendable.append("<!--").append(m27070()).append("-->");
    }

    @Override // p067l.AbstractC13152
    public final String toString() {
        return mo5239();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final Object mo55709clone() {
        return (C5775) super.mo55709clone();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public final AbstractC13152 mo55709clone() {
        return (C5775) super.mo55709clone();
    }
}
