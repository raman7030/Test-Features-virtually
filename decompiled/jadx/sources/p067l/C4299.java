package p067l;

/* JADX INFO: renamed from: l.֫᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4299 {

    /* JADX INFO: renamed from: ֫ */
    public final long f9552;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f9553;

    /* JADX INFO: renamed from: ܽ */
    public final long f9554;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f9555;

    public C4299(long j, long j2, boolean z, boolean z2) {
        this.f9553 = z;
        this.f9555 = z2;
        this.f9554 = j;
        this.f9552 = j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4299 m8734(long j) {
        return new C4299(0L, j <= 0 ? -1L : j - 1, false, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4299 m8735(long j, long j2) {
        return new C4299(j, j2, true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4299 m8733() {
        return new C4299(0L, 0L, false, false);
    }
}
