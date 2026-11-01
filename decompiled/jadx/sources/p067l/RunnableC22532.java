package p067l;

/* JADX INFO: renamed from: l.᩷᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC22532 extends AbstractFutureC10659 implements Runnable, InterfaceC11803 {

    /* JADX INFO: renamed from: ۛ */
    public C5824 f71039;

    /* JADX INFO: renamed from: ۤ */
    public FutureC5767 f71040;

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo14731() {
        return null;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14730() {
        run();
        return false;
    }

    @Override // p067l.AbstractFutureC10659, java.lang.Runnable
    public final void run() {
        C5824 c5824;
        FutureC5767 futureC5767 = this.f71040;
        if (futureC5767 == null || (c5824 = this.f71039) == null) {
            return;
        }
        this.f71040 = null;
        this.f71039 = null;
        if (futureC5767.f14147 == null) {
            try {
                futureC5767.m12906(C3141.m5360(c5824.f14292, c5824.f14293));
            } catch (Throwable th) {
                futureC5767.m12901(th);
            }
        }
        futureC5767.m12903();
    }
}
