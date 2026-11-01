package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC4090 extends AbstractC16867 implements Executor {

    /* JADX INFO: renamed from: ۙ */
    public static final RunnableC19356 f9018;

    /* JADX INFO: renamed from: ᩶ */
    public static final ExecutorC4090 f9019 = new ExecutorC4090();

    @Override // p067l.AbstractC5196
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        C10796 c10796 = C10796.f29927;
        int iM50814 = C22709.m50814();
        if (64 >= iM50814) {
            iM50814 = 64;
        }
        int iM50815 = C22709.m50815(iM50814, 12, "kotlinx.coroutines.io.parallelism");
        c10796.getClass();
        if (iM50815 < 1) {
            throw new IllegalArgumentException(C20778.m46922(iM50815, "Expected positive parallelism level, but got ").toString());
        }
        f9018 = new RunnableC19356(c10796, iM50815);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo8227(C25154.f80484, runnable);
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        f9018.mo8227(interfaceC16436, runnable);
    }
}
