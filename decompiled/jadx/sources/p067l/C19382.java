package p067l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ᩳ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19382 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m44125(long j, Future future) throws Throwable {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC18040 interfaceC18040 = C4630.f10377;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw interfaceC18040.mo8123(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw interfaceC18040.mo8123(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw interfaceC18040.mo8123(e);
        }
    }
}
