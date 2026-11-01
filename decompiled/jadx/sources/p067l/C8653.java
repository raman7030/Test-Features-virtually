package p067l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۜ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17B9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8653 extends AbstractFutureC9498 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC15532 f23224;

    /* JADX INFO: renamed from: ᩹ */
    public Future f23225;

    public C8653(AbstractFutureC9498 abstractFutureC9498, InterfaceC15532 interfaceC15532) {
        this.f23225 = abstractFutureC9498;
        this.f23224 = interfaceC15532;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f23225.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23225.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23225.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f23224.apply(this.f23225.get());
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f23224.apply(this.f23225.get(j, timeUnit));
    }
}
