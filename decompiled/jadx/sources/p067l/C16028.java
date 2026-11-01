package p067l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܳ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39KO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16028 extends AbstractFutureC9498 {

    /* JADX INFO: renamed from: ᩸ */
    public C18711 f46406;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    public C16028(C18711 c18711) {
        this.f46406 = c18711;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f46406.m42705();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        try {
            C18711 c18711 = this.f46406;
            c18711.getClass();
            return c18711.m42706(0L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        try {
            return this.f46406.m42702(j, timeUnit);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
