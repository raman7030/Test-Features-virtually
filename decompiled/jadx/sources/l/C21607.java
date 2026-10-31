package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.᩸۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21607 extends AbstractC15255 implements InterfaceC17373 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Executor f69384;

    public C21607(Executor executor) {
        this.f69384 = executor;
        C7414.m19936(executor);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f69384);
    }

    @Override // l.AbstractC2975
    public final String toString() {
        return this.f69384.toString();
    }

    @Override // l.AbstractC2975
    /* JADX INFO: renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        try {
            this.f69384.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C13844.m33203(interfaceC14801, cancellationException);
            C9613.m24546().mo6030(interfaceC14801, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f69384;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C21607) && ((C21607) obj).f69384 == this.f69384;
    }
}
