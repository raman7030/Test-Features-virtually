package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.᩸۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22904 extends AbstractC16867 implements InterfaceC18880 {

    /* JADX INFO: renamed from: ᩶ */
    public final Executor f72087;

    public C22904(Executor executor) {
        this.f72087 = executor;
        C9415.m21910(executor);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f72087);
    }

    @Override // p067l.AbstractC5196
    public final String toString() {
        return this.f72087.toString();
    }

    @Override // p067l.AbstractC5196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable) {
        try {
            this.f72087.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C15526.m35321(interfaceC16436, cancellationException);
            C11505.m26559().mo8227(interfaceC16436, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f72087;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C22904) && ((C22904) obj).f72087 == this.f72087;
    }
}
