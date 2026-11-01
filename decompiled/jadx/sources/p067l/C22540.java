package p067l;

/* JADX INFO: renamed from: l.᩸֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes5.dex */
public final class C22540 implements InterfaceC11081 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ StringBuilder f71098;

    public C22540(StringBuilder sb) {
        this.f71098 = sb;
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ۧ */
    public final void mo18031(AbstractC13152 abstractC13152, int i) {
        boolean z = abstractC13152 instanceof C12620;
        StringBuilder sb = this.f71098;
        if (z) {
            C12620 c12620 = (C12620) abstractC13152;
            String strM27070 = c12620.m27070();
            if (C21199.m47872(c12620.f36967) || (c12620 instanceof C4434)) {
                sb.append(strM27070);
                return;
            } else {
                C21869.m49325(strM27070, sb, C12620.m29032(sb));
                return;
            }
        }
        if (abstractC13152 instanceof C21199) {
            C21199 c21199 = (C21199) abstractC13152;
            if (sb.length() > 0) {
                if ((c21199.m47876() || c21199.f66646.m40577().equals("br")) && !C12620.m29032(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ֫ */
    public final void mo18030(AbstractC13152 abstractC13152, int i) {
        if ((abstractC13152 instanceof C21199) && ((C21199) abstractC13152).m47876() && (abstractC13152.m30137() instanceof C12620)) {
            StringBuilder sb = this.f71098;
            if (C12620.m29032(sb)) {
                return;
            }
            sb.append(' ');
        }
    }
}
