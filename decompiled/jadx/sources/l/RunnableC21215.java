package l;

/* JADX INFO: renamed from: l.᩷᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC21215 extends AbstractFutureC8723 implements Runnable, InterfaceC9926 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3636 f68356;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f68357;

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
        C3636 c3636;
        FutureC3575 futureC3575 = this.f68357;
        if (futureC3575 == null || (c3636 = this.f68356) == null) {
            return;
        }
        this.f68357 = null;
        this.f68356 = null;
        if (futureC3575.f11341 == null) {
            try {
                futureC3575.m10929(C0813.m3047(c3636.f11487, c3636.f11488));
            } catch (Throwable th) {
                futureC3575.m10924(th);
            }
        }
        futureC3575.m10926();
    }
}
