package l;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۠ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8216 extends AbstractC21622 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC3277 m21757(Object obj) {
        if (obj == null) {
            return C20211.f65385;
        }
        return new C20211(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC3277 m21758(Throwable th) {
        C22327 c22327 = new C22327();
        c22327.mo26127(th);
        return c22327;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceFutureC3277 m21759(InterfaceFutureC3277 interfaceFutureC3277, C14817 c14817, final Executor executor) {
        int i = AbstractRunnableC18800.f59334;
        final C3983 c3983 = new C3983();
        c3983.f59335 = interfaceFutureC3277;
        c3983.f59336 = c14817;
        executor.getClass();
        if (executor != EnumC19506.INSTANCE) {
            executor = new Executor() { // from class: l.۬ܰܺ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        c3983.mo26127((Throwable) e);
                    }
                }
            };
        }
        ((C20211) interfaceFutureC3277).mo10080(c3983, executor);
        return c3983;
    }
}
