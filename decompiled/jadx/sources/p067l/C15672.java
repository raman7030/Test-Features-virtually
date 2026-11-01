package p067l;

/* JADX INFO: renamed from: l.ܰᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15672 extends AbstractC25081 {

    /* JADX INFO: renamed from: ۜ */
    public C10309 f44808;

    /* JADX INFO: renamed from: ܳ */
    public C10309 f44809;

    /* JADX INFO: renamed from: ᩻ */
    public C17013 f44810;

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f44809.m40212();
        double[] dArrM40213 = this.f44808.m40212();
        C17013 c17013 = this.f44810;
        double[] dArrM40211 = c17013.m40211(0);
        double[] dArrM40214 = c17013.m40211(1);
        for (int i = 0; i < 8; i++) {
            double d = (dArrM40213[i] * 0.5d) + 0.5d;
            double d2 = dArrM40212[i];
            dArrM40211[i] = (1.0d - d) * d2;
            dArrM40214[i] = d2 * d;
        }
    }
}
