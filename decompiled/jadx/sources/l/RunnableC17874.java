package l;

/* JADX INFO: renamed from: l.ᩳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VANM */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC17874 extends AbstractC2975 implements Runnable, InterfaceC17373 {
    public volatile int runningWorkers;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f54586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2975 f54587;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f54588;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9408 f54589;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17373 f54590;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC17874(AbstractC2975 abstractC2975, int i) {
        this.f54587 = abstractC2975;
        this.f54586 = i;
        InterfaceC17373 interfaceC17373 = abstractC2975 instanceof InterfaceC17373 ? (InterfaceC17373) abstractC2975 : null;
        this.f54590 = interfaceC17373 == null ? C18079.m42140() : interfaceC17373;
        this.f54589 = new C9408();
        this.f54588 = new Object();
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnable = (Runnable) this.f54589.m24249();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        C5797.m16273(th, C23974.f77731);
                    }
                    i++;
                    if (i >= 16 && this.f54587.mo9084()) {
                        this.f54587.mo6030(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f54588) {
                this.runningWorkers--;
                if (this.f54589.m24248() == 0) {
                    return;
                }
                this.runningWorkers++;
                C8058 c8058 = C8058.f24861;
            }
        }
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        this.f54589.m24247(runnable);
        if (this.runningWorkers >= this.f54586) {
            return;
        }
        synchronized (this.f54588) {
            if (this.runningWorkers >= this.f54586) {
                return;
            }
            this.runningWorkers++;
            this.f54587.mo6030(this, this);
        }
    }
}
