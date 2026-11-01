package p067l;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۠ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10177 extends AbstractC22918 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceFutureC5483 m23726(Object obj) {
        if (obj == null) {
            return C21577.f68032;
        }
        return new C21577(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceFutureC5483 m23727(Throwable th) {
        C23588 c23588 = new C23588();
        c23588.mo28152(th);
        return c23588;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceFutureC5483 m23728(InterfaceFutureC5483 interfaceFutureC5483, C16451 c16451, final Executor executor) {
        int i = AbstractRunnableC20236.f62557;
        final C6154 c6154 = new C6154();
        c6154.f62558 = interfaceFutureC5483;
        c6154.f62559 = c16451;
        executor.getClass();
        if (executor != EnumC20907.INSTANCE) {
            executor = new Executor() { // from class: l.۬ܰܺ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        c6154.mo28152((Throwable) e);
                    }
                }
            };
        }
        ((C21577) interfaceFutureC5483).mo12113(c6154, executor);
        return c6154;
    }
}
