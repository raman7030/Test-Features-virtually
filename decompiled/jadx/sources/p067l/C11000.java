package p067l;

/* JADX INFO: renamed from: l.ۡ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11000 extends AbstractC25081 implements InterfaceC8988 {

    /* JADX INFO: renamed from: ۜ */
    public C7647 f30457 = new C7647();

    /* JADX INFO: renamed from: ܳ */
    public C10309 f30458;

    /* JADX INFO: renamed from: ᩻ */
    public C17013 f30459;

    public C11000() {
        C10309 c10309 = new C10309(1, "Amplitude", 1.0d);
        this.f30458 = c10309;
        m55058(c10309);
        C17013 c17013 = new C17013(0);
        this.f30459 = c17013;
        m55058(c17013);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f30458.m40212();
        double[] dArrM40213 = this.f30459.m40212();
        for (int i = 0; i < 8; i++) {
            dArrM40213[i] = this.f30457.m17623() * dArrM40212[i];
        }
    }
}
