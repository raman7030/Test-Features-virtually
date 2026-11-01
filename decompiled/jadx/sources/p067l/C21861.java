package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21861 extends AbstractC3755 {

    /* JADX INFO: renamed from: ܰ */
    public Runnable f68769;

    public C21861(Executor executor, FutureC5767 futureC5767, FutureC5767 futureC5768, Runnable runnable) {
        super(executor, futureC5767, futureC5768);
        this.f68769 = runnable;
    }

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Object obj;
        FutureC5767 futureC5767;
        Runnable runnable;
        Throwable th;
        FutureC5767 futureC5768 = this.f7980;
        if (futureC5768 != null && (obj = futureC5768.f14147) != null && (futureC5767 = this.f7978) != null && (runnable = this.f68769) != null) {
            if (futureC5767.f14147 == null) {
                if ((obj instanceof C25213) && (th = ((C25213) obj).f80621) != null) {
                    futureC5767.m12890(obj, th);
                } else {
                    if (i <= 0) {
                        try {
                            if (!m7254()) {
                            }
                        } catch (Throwable th2) {
                            futureC5767.m12901(th2);
                        }
                    }
                    runnable.run();
                    futureC5767.m12905();
                }
            }
            this.f7980 = null;
            this.f7978 = null;
            this.f68769 = null;
            return futureC5767.m12885(futureC5768, i);
        }
        return null;
    }
}
