package l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ᩳ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17902 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m41878(long j, Future future) throws Throwable {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC16490 interfaceC16490 = C2380.f7586;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw interfaceC16490.mo5928(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw interfaceC16490.mo5928(e);
        } catch (TimeoutException e3) {
            e = e3;
            throw interfaceC16490.mo5928(e);
        }
    }
}
