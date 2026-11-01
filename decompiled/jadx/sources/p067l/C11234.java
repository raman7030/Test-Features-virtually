package p067l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11234 {

    /* JADX INFO: renamed from: ֫ */
    public static ScheduledThreadPoolExecutor f31247;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f31248 = new HashMap();

    public final String toString() {
        return "EvictionTimer []";
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m26020(RunnableC23935 runnableC23935, C5057 c5057, C5057 c5058) {
        if (f31247 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC24644(0));
            f31247 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            f31247.scheduleAtFixedRate(new RunnableC8551(), c5057.toMillis(), c5058.toMillis(), TimeUnit.MILLISECONDS);
        }
        WeakReference weakReference = new WeakReference(runnableC23935);
        RunnableC21963 runnableC21963 = new RunnableC21963(weakReference);
        runnableC23935.m53031(f31247.scheduleWithFixedDelay(runnableC21963, c5057.toMillis(), c5058.toMillis(), TimeUnit.MILLISECONDS));
        f31248.put(weakReference, runnableC21963);
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m26021(RunnableC23935 runnableC23935, C5057 c5057, boolean z) {
        if (runnableC23935 != null) {
            try {
                runnableC23935.m53030();
                m26019(runnableC23935);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z && f31247 != null && f31248.isEmpty()) {
            f31247.shutdown();
            try {
                f31247.awaitTermination(c5057.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            f31247.setCorePoolSize(0);
            f31247 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26019(RunnableC23935 runnableC23935) {
        HashMap map = f31248;
        for (Map.Entry entry : map.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == runnableC23935) {
                f31247.remove((Runnable) entry.getValue());
                map.remove(entry.getKey());
                return;
            }
        }
    }
}
