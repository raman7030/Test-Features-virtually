package l;

/* JADX INFO: renamed from: l.ܽۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZI */
/* JADX INFO: loaded from: classes5.dex */
public final class C16470 extends C13439 {
    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5598() throws C12651 {
        C7381 c7381M45497 = m45497();
        try {
            m32473();
            new C12320().mo9572(c7381M45497, this);
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 threadFactoryC5970M19879 = c7381M45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.ۧۜۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32570.mo2847();
                    }
                };
                threadFactoryC5970M19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("Shell for " + c7381M45497.f22687);
                this.f63908.start();
            }
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651("ChannelShell", e);
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
