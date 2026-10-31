package l;

/* JADX INFO: renamed from: l.ۜ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7103 extends AbstractFutureC8723 implements Runnable, InterfaceC9926 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public RunnableC0625 f21809;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f21810;

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo12867() {
        return null;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12866() {
        run();
        return false;
    }

    @Override // l.AbstractFutureC8723, java.lang.Runnable
    public final void run() {
        RunnableC0625 runnableC0625;
        FutureC3575 futureC3575 = this.f21810;
        if (futureC3575 == null || (runnableC0625 = this.f21809) == null) {
            return;
        }
        this.f21810 = null;
        this.f21809 = null;
        if (futureC3575.f11341 == null) {
            try {
                runnableC0625.run();
                futureC3575.m10928();
            } catch (Throwable th) {
                futureC3575.m10924(th);
            }
        }
        futureC3575.m10926();
    }
}
