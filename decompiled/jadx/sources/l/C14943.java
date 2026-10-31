package l;

/* JADX INFO: renamed from: l.ܶۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14943 implements InterfaceC17101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21295 f45543;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23596 f45544;

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫ */
    public final void mo7531(C12122 c12122) {
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫ */
    public final void mo7532(C13532 c13532) {
    }

    public C14943(C21295 c21295, C23596 c23596) {
        this.f45543 = c21295;
        this.f45544 = c23596;
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ۧ */
    public final void mo7534(C12122 c12122) {
        C3135 c3135M37484 = c12122.mo29542().m37484();
        C20069 c20069Mo29535 = c12122.mo29535();
        C21295 c21295 = this.f45543;
        if (!C21295.m48332(c21295, c12122) && c20069Mo29535.size() == 2) {
            if (c3135M37484.m9558() != 4) {
                C21480 c21480M41004get = c20069Mo29535.m41004get(0);
                C21480 c21480M41004get2 = c20069Mo29535.m41004get(1);
                C23596 c23596 = this.f45544;
                if (c23596.m52070(c3135M37484, c21480M41004get, c21480M41004get2)) {
                    c12122.m29541();
                    return;
                } else {
                    if (c3135M37484.m9557() && c23596.m52070(c3135M37484, c20069Mo29535.m41004get(1), c20069Mo29535.m41004get(0))) {
                        c12122.m29534(C20069.m46250(c20069Mo29535.m41004get(1), c20069Mo29535.m41004get(0)));
                        c12122.m29541();
                        return;
                    }
                    return;
                }
            }
            InterfaceC1538 interfaceC1538M48637 = c20069Mo29535.m41004get(0).m48637();
            if (!(interfaceC1538M48637 instanceof AbstractC1223) || ((AbstractC1223) interfaceC1538M48637).mo2227() != 0) {
                InterfaceC1538 interfaceC1538M48638 = c20069Mo29535.m41004get(1).m48637();
                if ((interfaceC1538M48638 instanceof AbstractC1223) && ((AbstractC1223) interfaceC1538M48638).mo2227() == 0) {
                    c21295.m48329(c12122, c20069Mo29535.m46258(), c3135M37484.m9562(), (AbstractC13717) null);
                    return;
                }
                return;
            }
            C20069 c20069M46257 = c20069Mo29535.m46257();
            int iM9562 = c3135M37484.m9562();
            switch (iM9562) {
                case 7:
                case 8:
                    break;
                case 9:
                    iM9562 = 12;
                    break;
                case 10:
                    iM9562 = 11;
                    break;
                case 11:
                    iM9562 = 10;
                    break;
                case 12:
                    iM9562 = 9;
                    break;
                default:
                    throw new RuntimeException(C19370.m44628(iM9562, "Unrecognized IF regop: "));
            }
            c21295.m48329(c12122, c20069M46257, iM9562, (AbstractC13717) null);
        }
    }
}
