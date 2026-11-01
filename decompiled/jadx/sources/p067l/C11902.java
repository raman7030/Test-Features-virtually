package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ۤۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11902 {

    /* JADX INFO: renamed from: ֫ */
    public static final List f33145;

    static {
        try {
            Iterator it = Arrays.asList(new C10144()).iterator();
            C13045.m29867(it, "<this>");
            f33145 = C22000.m49569(new C9691(new C4565(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m27222(Throwable th, InterfaceC16436 interfaceC16436) {
        Throwable runtimeException;
        Iterator it = f33145.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC13913) it.next()).mo23642(th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C12710.m29224(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C12710.m29224(th, new C16197(interfaceC16436));
            C10027 c10027 = C10027.f27775;
        } catch (Throwable th3) {
            C20086.m45501(th3);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
