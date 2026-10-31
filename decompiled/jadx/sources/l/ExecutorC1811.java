package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FB */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC1811 extends AbstractC15255 implements Executor {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final RunnableC17874 f6238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final ExecutorC1811 f6239 = new ExecutorC1811();

    @Override // l.AbstractC2975
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        C8867 c8867 = C8867.f27003;
        int iM48478 = C21402.m48478();
        if (64 >= iM48478) {
            iM48478 = 64;
        }
        int iM48479 = C21402.m48479(iM48478, 12, "kotlinx.coroutines.io.parallelism");
        c8867.getClass();
        if (iM48479 < 1) {
            throw new IllegalArgumentException(C19370.m44628(iM48479, "Expected positive parallelism level, but got ").toString());
        }
        f6238 = new RunnableC17874(c8867, iM48479);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo6030(C23974.f77731, runnable);
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        f6238.mo6030(interfaceC14801, runnable);
    }
}
