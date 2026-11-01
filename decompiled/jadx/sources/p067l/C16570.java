package p067l;

/* JADX INFO: renamed from: l.ܶۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16570 implements InterfaceC18621 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22607 f48657;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24794 f48658;

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9599(C13889 c13889) {
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9600(C15229 c15229) {
    }

    public C16570(C22607 c22607, C24794 c24794) {
        this.f48657 = c22607;
        this.f48658 = c24794;
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ۧ */
    public final void mo9602(C13889 c13889) {
        C5348 c5348M39656 = c13889.mo31607().m39656();
        C21442 c21442Mo31600 = c13889.mo31600();
        C22607 c22607 = this.f48657;
        if (!C22607.m50666(c22607, c13889) && c21442Mo31600.size() == 2) {
            if (c5348M39656.m11601() != 4) {
                C22783 c22783M56524get = c21442Mo31600.m56524get(0);
                C22783 c22783M56524get2 = c21442Mo31600.m56524get(1);
                C24794 c24794 = this.f48658;
                if (c24794.m54473(c5348M39656, c22783M56524get, c22783M56524get2)) {
                    c13889.m31606();
                    return;
                } else {
                    if (c5348M39656.m11600() && c24794.m54473(c5348M39656, c21442Mo31600.m56524get(1), c21442Mo31600.m56524get(0))) {
                        c13889.m31599(C21442.m48566(c21442Mo31600.m56524get(1), c21442Mo31600.m56524get(0)));
                        c13889.m31606();
                        return;
                    }
                    return;
                }
            }
            InterfaceC3830 interfaceC3830M50974 = c21442Mo31600.m56524get(0).m50974();
            if (!(interfaceC3830M50974 instanceof AbstractC3531) || ((AbstractC3531) interfaceC3830M50974).mo4594() != 0) {
                InterfaceC3830 interfaceC3830M50975 = c21442Mo31600.m56524get(1).m50974();
                if ((interfaceC3830M50975 instanceof AbstractC3531) && ((AbstractC3531) interfaceC3830M50975).mo4594() == 0) {
                    c22607.m50663(c13889, c21442Mo31600.m48574(), c5348M39656.m11605(), (AbstractC15405) null);
                    return;
                }
                return;
            }
            C21442 c21442M48573 = c21442Mo31600.m48573();
            int iM11605 = c5348M39656.m11605();
            switch (iM11605) {
                case 7:
                case 8:
                    break;
                case 9:
                    iM11605 = 12;
                    break;
                case 10:
                    iM11605 = 11;
                    break;
                case 11:
                    iM11605 = 10;
                    break;
                case 12:
                    iM11605 = 9;
                    break;
                default:
                    throw new RuntimeException(C20778.m46922(iM11605, "Unrecognized IF regop: "));
            }
            c22607.m50663(c13889, c21442M48573, iM11605, (AbstractC15405) null);
        }
    }
}
