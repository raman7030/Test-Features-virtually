package l;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: l.۟ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FANM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7414 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Method f22791;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f22791 = method;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m19936(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = f22791) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }
}
