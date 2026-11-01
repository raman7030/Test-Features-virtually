package p067l;

/* JADX INFO: renamed from: l.᩹ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23592 {
    /* JADX INFO: renamed from: c */
    public static long m52401c(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        return j3 >= 0 ? j3 : C14849.FOREVER_NS;
    }

    /* JADX INFO: renamed from: a */
    public static long m52399a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC16847 m52400b(EnumC10521 enumC10521, InterfaceC16847 interfaceC16847, long j, long j2) {
        long jM52401c = m52401c(j, j2);
        int i = AbstractC4146.f9157a[enumC10521.ordinal()];
        if (i == 1) {
            return new C18227(interfaceC16847, j, jM52401c);
        }
        if (i == 2) {
            return new C2825((InterfaceC20202) interfaceC16847, j, jM52401c);
        }
        if (i == 3) {
            return new C20499((InterfaceC2766) interfaceC16847, j, jM52401c);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC10521);
        }
        return new C16236((InterfaceC10124) interfaceC16847, j, jM52401c);
    }

    /* JADX INFO: renamed from: h */
    public static C18999 m52406h(AbstractC13204 abstractC13204, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C18999(abstractC13204, m52402d(j2), j, j2);
    }

    /* JADX INFO: renamed from: f */
    public static C14975 m52404f(AbstractC8428 abstractC8428, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C14975(abstractC8428, m52402d(j2), j, j2);
    }

    /* JADX INFO: renamed from: g */
    public static C20261 m52405g(AbstractC20580 abstractC20580, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C20261(abstractC20580, m52402d(j2), j, j2);
    }

    /* JADX INFO: renamed from: e */
    public static C21840 m52403e(AbstractC7758 abstractC7758, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C21840(abstractC7758, m52402d(j2), j, j2);
    }

    /* JADX INFO: renamed from: d */
    public static int m52402d(long j) {
        return (j != -1 ? EnumC9335.f25426u : 0) | EnumC9335.f25425t;
    }
}
