package l;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۘۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3877 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2466 f12394;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Thread f12395;

    public C3877(C2466 c2466) {
        this.f12394 = c2466;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11698(C3877 c3877, Thread thread) {
        boolean z;
        synchronized (c3877) {
            c3877.f12395 = thread;
            z = !c3877.f12393;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m11699(C3877 c3877) {
        synchronized (c3877) {
            Thread.interrupted();
            c3877.f12395 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11697(C3877 c3877) {
        synchronized (c3877) {
            if (c3877.f12393) {
                return;
            }
            c3877.f12393 = true;
            Thread thread = c3877.f12395;
            if (thread != null) {
                thread.interrupt();
            }
            C0991 c0991M7951 = c3877.f12394.m7951();
            ExecutorService executorService = C1802.f6211;
            c0991M7951.m3464();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2466 m11700(C3877 c3877) {
        return c3877.f12394;
    }
}
