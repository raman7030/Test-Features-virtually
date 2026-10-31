package l;

/* JADX INFO: renamed from: l.ܿۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7Z7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17176 extends C13439 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52641;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f52642;

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5598() throws C12651 {
        C7381 c7381M45497 = m45497();
        try {
            if (this.f40156) {
                new C3148().mo9572(c7381M45497, this);
            }
            new C10204().m25613(c7381M45497, this, this.f52642, this.f52641);
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 threadFactoryC5970M19879 = c7381M45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.ᩳۜۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54610.mo2847();
                    }
                };
                threadFactoryC5970M19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("Subsystem for " + c7381M45497.f22687);
                this.f63908.start();
            }
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651("ChannelSubsystem", e);
        }
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۜ */
    public final void mo5591() {
        C19708 c19708 = this.f63917;
        m45497();
        c19708.f63666 = null;
        C19708 c19709 = this.f63917;
        m45497();
        c19709.f63667 = null;
    }
}
