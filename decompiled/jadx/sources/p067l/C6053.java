package p067l;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۘۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6053 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f15200;

    /* JADX INFO: renamed from: ۧ */
    public final C4712 f15201;

    /* JADX INFO: renamed from: ܽ */
    public Thread f15202;

    public C6053(C4712 c4712) {
        this.f15201 = c4712;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13634(C6053 c6053, Thread thread) {
        boolean z;
        synchronized (c6053) {
            c6053.f15202 = thread;
            z = !c6053.f15200;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m13635(C6053 c6053) {
        synchronized (c6053) {
            Thread.interrupted();
            c6053.f15202 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13633(C6053 c6053) {
        synchronized (c6053) {
            if (c6053.f15200) {
                return;
            }
            c6053.f15200 = true;
            Thread thread = c6053.f15202;
            if (thread != null) {
                thread.interrupt();
            }
            C3310 c3310M9999 = c6053.f15201.m9999();
            ExecutorService executorService = C4081.f8990;
            c3310M9999.m5767();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C4712 m13636(C6053 c6053) {
        return c6053.f15201;
    }
}
