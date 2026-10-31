package l;

/* JADX INFO: renamed from: l.᩹۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87AH */
/* JADX INFO: loaded from: classes.dex */
public final class C22306 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C22306 f72317 = new C22306(-1, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f72318;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f72319;

    public C22306(long j, long j2) {
        this.f72318 = j < 0 ? -1L : j;
        this.f72319 = j2 <= 0 ? 0L : j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50047(long j, long j2) {
        C22306 c22306 = new C22306(j, j2);
        return c22306.m50052() ? c22306 : f72317;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50049(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889 == null) {
            return f72317;
        }
        return m50047(interfaceC17889.mo36969() ? interfaceC17889.getSize() : -1L, interfaceC17889.getTime());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50048(AbstractC15440 abstractC15440) {
        long jMo23117;
        if (abstractC15440 == null) {
            return f72317;
        }
        long jMo23127 = -1;
        try {
            if (abstractC15440.mo23119()) {
                jMo23127 = abstractC15440.mo23127();
            }
        } catch (RuntimeException unused) {
        }
        try {
            jMo23117 = abstractC15440.mo23117();
        } catch (RuntimeException unused2) {
            jMo23117 = 0;
        }
        return m50047(jMo23127, jMo23117);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50050() {
        return this.f72318;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m50051() {
        return this.f72319;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50054() {
        return this.f72318 >= 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50053() {
        return this.f72319 > 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50052() {
        return m50054() || m50053();
    }
}
