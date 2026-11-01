package p067l;

/* JADX INFO: renamed from: l.ᩳۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VANM */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19356 extends AbstractC5196 implements Runnable, InterfaceC18880 {
    public volatile int runningWorkers;

    /* JADX INFO: renamed from: ۗ */
    public final int f57783;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5196 f57784;

    /* JADX INFO: renamed from: ۫ */
    public final Object f57785;

    /* JADX INFO: renamed from: ۬ */
    public final C11310 f57786;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC18880 f57787;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC19356(AbstractC5196 abstractC5196, int i) {
        this.f57784 = abstractC5196;
        this.f57783 = i;
        InterfaceC18880 interfaceC18880 = abstractC5196 instanceof InterfaceC18880 ? (InterfaceC18880) abstractC5196 : null;
        this.f57787 = interfaceC18880 == null ? C19551.m44399() : interfaceC18880;
        this.f57786 = new C11310();
        this.f57785 = new Object();
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnable = (Runnable) this.f57786.m26259();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        C7878.m18198(th, C25154.f80484);
                    }
                    i++;
                    if (i >= 16 && this.f57784.mo11136()) {
                        this.f57784.mo8227(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f57785) {
                this.runningWorkers--;
                if (this.f57786.m26258() == 0) {
                    return;
                }
                this.runningWorkers++;
                C10027 c10027 = C10027.f27775;
            }
        }
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        this.f57786.m26257(runnable);
        if (this.runningWorkers >= this.f57783) {
            return;
        }
        synchronized (this.f57785) {
            if (this.runningWorkers >= this.f57783) {
                return;
            }
            this.runningWorkers++;
            this.f57784.mo8227(this, this);
        }
    }
}
