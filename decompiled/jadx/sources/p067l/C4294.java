package p067l;

/* JADX INFO: renamed from: l.֫᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4294 extends AbstractC25081 implements InterfaceC22400 {

    /* JADX INFO: renamed from: ۜ */
    public C17013 f9541;

    /* JADX INFO: renamed from: ܳ */
    public C10309 f9542;

    /* JADX INFO: renamed from: ᩷ */
    public C23720 f9543;

    /* JADX INFO: renamed from: ᩻ */
    public C10309 f9544;

    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8715(int i) {
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f9544.m40212();
        double[] dArrM40213 = this.f9542.m40212();
        double[] dArrM40214 = this.f9541.m40212();
        C23720 c23720 = this.f9543;
        double dM52746 = c23720.m52746();
        for (int i = 0; i < 8; i++) {
            try {
                double dM21262 = dArrM40212[i] * this.f80012.m21262();
                if (dM21262 > 1.0d) {
                    dM21262 = 1.0d;
                } else if (dM21262 < -1.0d) {
                    dM21262 = -1.0d;
                }
                dM52746 += dM21262;
                if (dM52746 >= 1.0d) {
                    dM52746 -= 2.0d;
                } else if (dM52746 < -1.0d) {
                    dM52746 += 2.0d;
                }
                double d = (dM52746 > 0.5d ? 1.0d - dM52746 : dM52746 < -0.5d ? (-1.0d) - dM52746 : dM52746) * 3.141592653589793d;
                double d2 = d * d;
                dArrM40214[i] = (((((((((((-2.505210838544172E-8d) * d2) + 2.7557319223985893E-6d) * d2) - 1.984126984126984E-4d) * d2) + 0.008333333333333333d) * d2) - 0.16666666666666666d) * d2) + 1.0d) * d * dArrM40213[i];
            } catch (NullPointerException unused) {
                throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
            }
        }
        c23720.m52745(dM52746);
    }

    @Override // p067l.InterfaceC8988
    /* JADX INFO: renamed from: ᩳ */
    public final C17013 mo8718() {
        return this.f9541;
    }

    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8716(C22559 c22559) {
        this.f9542.m23924(0.0d, c22559);
    }

    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8714(double d, double d2, C22559 c22559) {
        this.f9544.m23924(d, c22559);
        this.f9542.m23924(d2, c22559);
    }
}
