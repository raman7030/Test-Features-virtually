package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9329 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ScheduledThreadPoolExecutor f28297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f28298 = new HashMap();

    public final String toString() {
        return "EvictionTimer []";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m24011(RunnableC22693 runnableC22693, C2828 c2828, C2828 c2829) {
        if (f28297 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC23439(0));
            f28297 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            f28297.scheduleAtFixedRate(new RunnableC6506(), c2828.toMillis(), c2829.toMillis(), TimeUnit.MILLISECONDS);
        }
        WeakReference weakReference = new WeakReference(runnableC22693);
        RunnableC20618 runnableC20618 = new RunnableC20618(weakReference);
        runnableC22693.m50705(f28297.scheduleWithFixedDelay(runnableC20618, c2828.toMillis(), c2829.toMillis(), TimeUnit.MILLISECONDS));
        f28298.put(weakReference, runnableC20618);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m24012(RunnableC22693 runnableC22693, C2828 c2828, boolean z) {
        if (runnableC22693 != null) {
            try {
                runnableC22693.m50704();
                m24010(runnableC22693);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z && f28297 != null && f28298.isEmpty()) {
            f28297.shutdown();
            try {
                f28297.awaitTermination(c2828.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            f28297.setCorePoolSize(0);
            f28297 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24010(RunnableC22693 runnableC22693) {
        HashMap map = f28298;
        for (Map.Entry entry : map.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == runnableC22693) {
                f28297.remove((Runnable) entry.getValue());
                map.remove(entry.getKey());
                return;
            }
        }
    }
}
