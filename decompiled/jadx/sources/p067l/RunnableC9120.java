package p067l;

/* JADX INFO: renamed from: l.ۜ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9120 extends AbstractFutureC10659 implements Runnable, InterfaceC11803 {

    /* JADX INFO: renamed from: ۛ */
    public RunnableC2963 f24690;

    /* JADX INFO: renamed from: ۤ */
    public FutureC5767 f24691;

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
        RunnableC2963 runnableC2963;
        FutureC5767 futureC5767 = this.f24691;
        if (futureC5767 == null || (runnableC2963 = this.f24690) == null) {
            return;
        }
        this.f24691 = null;
        this.f24690 = null;
        if (futureC5767.f14147 == null) {
            try {
                runnableC2963.run();
                futureC5767.m12905();
            } catch (Throwable th) {
                futureC5767.m12901(th);
            }
        }
        futureC5767.m12903();
    }
}
