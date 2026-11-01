package p067l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11467 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC24877 f31976;

    /* JADX INFO: renamed from: ۧ */
    public static final int f31977;

    /* JADX INFO: renamed from: ܳ */
    public static final long f31978 = C22709.m50816("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, C14849.FOREVER_NS);

    /* JADX INFO: renamed from: ܽ */
    public static final long f31979;

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC24877 f31980;

    /* JADX INFO: renamed from: ᩳ */
    public static final int f31981;

    /* JADX INFO: renamed from: ᩻ */
    public static C19513 f31982;

    static {
        int iM50814 = C22709.m50814();
        if (iM50814 < 2) {
            iM50814 = 2;
        }
        f31977 = C22709.m50815(iM50814, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f31981 = C22709.m50815(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f31979 = TimeUnit.SECONDS.toNanos(C22709.m50816("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, C14849.FOREVER_NS));
        f31982 = C19513.f59435;
        f31980 = new C8784(0);
        f31976 = new C8784(1);
    }
}
