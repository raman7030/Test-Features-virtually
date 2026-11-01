package p067l;

/* JADX INFO: renamed from: l.ܺ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17372 {

    /* JADX INFO: renamed from: ֫ */
    public long f51842;

    /* JADX INFO: renamed from: ۧ */
    public final long f51843;

    /* JADX INFO: renamed from: ܽ */
    public final C4633 f51844;

    /* JADX INFO: renamed from: ᩳ */
    public long f51845;

    public /* synthetic */ C17372(C4633 c4633, long j, int i) {
        this(c4633, j);
    }

    public C17372(C4633 c4633, long j) {
        this.f51842 = -9223372036854775807L;
        this.f51845 = Long.MIN_VALUE;
        this.f51844 = c4633;
        this.f51843 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17372 m39414(C4633 c4633, long j) {
        C17372 c17372 = new C17372(c4633, C14849.FOREVER_NS);
        c17372.f51842 = j;
        return c17372;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m39418(C17372 c17372) {
        return c17372.f51842 == -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m39419(C17372 c17372) {
        long j = c17372.f51842;
        return j == -9223372036854775807L ? C2620.m3953(c17372.f51845, c17372.f51844.f10382) : j;
    }
}
