package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9573 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23683 f29029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f29030;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long f29031 = C21402.m48480("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, C13132.FOREVER_NS);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f29032;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23683 f29033;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f29034;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C18039 f29035;

    static {
        int iM48478 = C21402.m48478();
        if (iM48478 < 2) {
            iM48478 = 2;
        }
        f29030 = C21402.m48479(iM48478, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f29034 = C21402.m48479(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f29032 = TimeUnit.SECONDS.toNanos(C21402.m48480("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, C13132.FOREVER_NS));
        f29035 = C18039.f56232;
        f29033 = new C6750(0);
        f29029 = new C6750(1);
    }
}
