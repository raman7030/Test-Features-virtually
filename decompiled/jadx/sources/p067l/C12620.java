package p067l;

/* JADX INFO: renamed from: l.ۧۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBJU */
/* JADX INFO: loaded from: classes4.dex */
public class C12620 extends AbstractC11811 {
    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public void mo9269(Appendable appendable, int i, C2421 c2421) {
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC13152 mo12956() {
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public String mo5244() {
        return "#text";
    }

    @Override // p067l.AbstractC11811, p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo12957() {
        return 0;
    }

    public C12620(String str) {
        this.f32967 = str;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public void mo9268(Appendable appendable, int i, C2421 c2421) {
        boolean z;
        boolean z2;
        boolean zM3374 = c2421.m3374();
        AbstractC13152 abstractC13152 = this.f36967;
        C21199 c21199 = abstractC13152 instanceof C21199 ? (C21199) abstractC13152 : null;
        boolean z3 = zM3374 && !C21199.m47872(abstractC13152);
        if (z3) {
            boolean z4 = (this.f36968 == 0 && c21199 != null && c21199.m47882().m40580()) || (this.f36967 instanceof C3092);
            boolean z5 = m30137() == null && c21199 != null && c21199.m47882().m40580();
            AbstractC13152 abstractC13152M30137 = m30137();
            if ((((abstractC13152M30137 instanceof C21199) && ((C21199) abstractC13152M30137).m47875(c2421)) || ((abstractC13152M30137 instanceof C12620) && C21869.m49327(((C12620) abstractC13152M30137).m27070()))) && C21869.m49327(m27070())) {
                return;
            }
            if (this.f36968 == 0 && c21199 != null && c21199.m47882().m40574() && !C21869.m49327(m27070())) {
                AbstractC13152.m30128(appendable, i, c2421);
            }
            z = z4;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        C14492.m33143(appendable, m27070(), c2421, false, z3, z, z2);
    }

    @Override // p067l.AbstractC13152
    public final String toString() {
        return mo5239();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone */
    public C12620 mo55709clone() {
        return (C12620) super.mo55709clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29032(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }
}
