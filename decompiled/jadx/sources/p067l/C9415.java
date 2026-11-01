package p067l;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: l.۟ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FANM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9415 {

    /* JADX INFO: renamed from: ֫ */
    public static final Method f25704;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f25704 = method;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m21910(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = f25704) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }
}
