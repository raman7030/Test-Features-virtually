package p067l;

/* JADX INFO: renamed from: l.ۢۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11269 {

    /* JADX INFO: renamed from: ֫ */
    public final int f31387;

    /* JADX INFO: renamed from: ۧ */
    public final Object f31388;

    /* JADX INFO: renamed from: ܳ */
    public final C11269 f31389;

    /* JADX INFO: renamed from: ܽ */
    public final C11269 f31390;

    /* JADX INFO: renamed from: ܿ */
    public C22902 f31391;

    /* JADX INFO: renamed from: ᩳ */
    public volatile long f31392 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public final int f31393;

    public C11269(Object obj) {
        C12826.requireNonNull(obj);
        this.f31388 = obj;
        this.f31389 = null;
        this.f31390 = null;
        this.f31393 = 1;
        this.f31387 = 1;
    }

    public C11269(C11269 c11269, C11269 c112610) {
        C12826.requireNonNull(c11269);
        this.f31390 = c11269;
        C12826.requireNonNull(c112610);
        this.f31389 = c112610;
        this.f31388 = null;
        this.f31387 = Math.max(c11269.f31387, c112610.f31387) + 1;
        long j = ((long) c11269.f31393) + ((long) c112610.f31393);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        this.f31393 = i;
    }
}
