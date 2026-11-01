package p067l;

/* JADX INFO: renamed from: l.᩹۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87AH */
/* JADX INFO: loaded from: classes.dex */
public final class C23568 {

    /* JADX INFO: renamed from: ܽ */
    public static final C23568 f75044 = new C23568(-1, 0);

    /* JADX INFO: renamed from: ֫ */
    public final long f75045;

    /* JADX INFO: renamed from: ۧ */
    public final long f75046;

    public C23568(long j, long j2) {
        this.f75045 = j < 0 ? -1L : j;
        this.f75046 = j2 <= 0 ? 0L : j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23568 m52377(long j, long j2) {
        C23568 c23568 = new C23568(j, j2);
        return c23568.m52382() ? c23568 : f75044;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23568 m52379(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370 == null) {
            return f75044;
        }
        return m52377(interfaceC19370.mo39135() ? interfaceC19370.getSize() : -1L, interfaceC19370.getTime());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23568 m52378(AbstractC17043 abstractC17043) {
        long jMo25091;
        if (abstractC17043 == null) {
            return f75044;
        }
        long jMo25101 = -1;
        try {
            if (abstractC17043.mo25093()) {
                jMo25101 = abstractC17043.mo25101();
            }
        } catch (RuntimeException unused) {
        }
        try {
            jMo25091 = abstractC17043.mo25091();
        } catch (RuntimeException unused2) {
            jMo25091 = 0;
        }
        return m52377(jMo25101, jMo25091);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m52380() {
        return this.f75045;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m52381() {
        return this.f75046;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52384() {
        return this.f75045 >= 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m52383() {
        return this.f75046 > 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52382() {
        return m52384() || m52383();
    }
}
