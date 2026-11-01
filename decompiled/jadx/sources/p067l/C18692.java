package p067l;

/* JADX INFO: renamed from: l.ܿۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18692 extends C15141 {

    /* JADX INFO: renamed from: ۫ */
    public boolean f55822;

    /* JADX INFO: renamed from: ۬ */
    public String f55823;

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ᩴ */
    public final void mo7828() throws C14392 {
        C9383 c9383M47808 = m47808();
        try {
            if (this.f43227) {
                new C5360().mo11615(c9383M47808, this);
            }
            new C12066().m27635(c9383M47808, this, this.f55823, this.f55822);
            if (this.f66554.f66297 != null) {
                ThreadFactoryC8042 threadFactoryC8042M21852 = c9383M47808.m21852();
                Runnable runnable = new Runnable() { // from class: l.ᩳۜۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f57807.mo5176();
                    }
                };
                threadFactoryC8042M21852.getClass();
                Thread thread = new Thread(runnable);
                this.f66545 = thread;
                thread.setName("Subsystem for " + c9383M47808.f25599);
                this.f66545.start();
            }
        } catch (Exception e) {
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            throw new C14392("ChannelSubsystem", e);
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۜ */
    public final void mo7821() {
        C21099 c21099 = this.f66554;
        m47808();
        c21099.f66297 = null;
        C21099 c210910 = this.f66554;
        m47808();
        c210910.f66298 = null;
    }
}
