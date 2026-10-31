package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ۤۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10031 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f30187;

    static {
        try {
            Iterator it = Arrays.asList(new C8181()).iterator();
            C11233.m27805(it, "<this>");
            f30187 = C20656.m47242(new C7704(new C2311(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m25205(Throwable th, InterfaceC14801 interfaceC14801) {
        Throwable runtimeException;
        Iterator it = f30187.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC12147) it.next()).mo21673(th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C10881.m27179(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C10881.m27179(th, new C14550(interfaceC14801));
            C8058 c8058 = C8058.f24861;
        } catch (Throwable th3) {
            C18642.m43235(th3);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
