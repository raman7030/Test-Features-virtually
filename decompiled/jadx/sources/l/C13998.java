package l;

/* JADX INFO: renamed from: l.ܰᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13998 extends AbstractC23898 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8355 f41725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f41726;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15409 f41727;

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double[] dArrM38021 = this.f41726.m38021();
        double[] dArrM38022 = this.f41725.m38021();
        C15409 c15409 = this.f41727;
        double[] dArrM38020 = c15409.m38020(0);
        double[] dArrM38023 = c15409.m38020(1);
        for (int i = 0; i < 8; i++) {
            double d = (dArrM38022[i] * 0.5d) + 0.5d;
            double d2 = dArrM38021[i];
            dArrM38020[i] = (1.0d - d) * d2;
            dArrM38023[i] = d2 * d;
        }
    }
}
