package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩶᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20509 extends AbstractC1458 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f66090;

    public C20509(Executor executor, FutureC3575 futureC3575, FutureC3575 futureC3576, Runnable runnable) {
        super(executor, futureC3575, futureC3576);
        this.f66090 = runnable;
    }

    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Object obj;
        FutureC3575 futureC3575;
        Runnable runnable;
        Throwable th;
        FutureC3575 futureC3576 = this.f5207;
        if (futureC3576 != null && (obj = futureC3576.f11341) != null && (futureC3575 = this.f5205) != null && (runnable = this.f66090) != null) {
            if (futureC3575.f11341 == null) {
                if ((obj instanceof C24036) && (th = ((C24036) obj).f77869) != null) {
                    futureC3575.m10913(obj, th);
                } else {
                    if (i <= 0) {
                        try {
                            if (!m5011()) {
                            }
                        } catch (Throwable th2) {
                            futureC3575.m10924(th2);
                        }
                    }
                    runnable.run();
                    futureC3575.m10928();
                }
            }
            this.f5207 = null;
            this.f5205 = null;
            this.f66090 = null;
            return futureC3575.m10908(futureC3576, i);
        }
        return null;
    }
}
