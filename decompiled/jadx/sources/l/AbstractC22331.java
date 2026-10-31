package l;

/* JADX INFO: renamed from: l.᩹ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22331 {
    public static long c(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        return j3 >= 0 ? j3 : C13132.FOREVER_NS;
    }

    public static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static InterfaceC15234 b(EnumC8578 enumC8578, InterfaceC15234 interfaceC15234, long j, long j2) {
        long jC = c(j, j2);
        int i = AbstractC1870.a[enumC8578.ordinal()];
        if (i == 1) {
            return new C16686(interfaceC15234, j, jC);
        }
        if (i == 2) {
            return new C0480((InterfaceC18764) interfaceC15234, j, jC);
        }
        if (i == 3) {
            return new C19076((InterfaceC0418) interfaceC15234, j, jC);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC8578);
        }
        return new C14591((InterfaceC8160) interfaceC15234, j, jC);
    }

    public static C17498 h(AbstractC11401 abstractC11401, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C17498(abstractC11401, d(j2), j, j2);
    }

    public static C13264 f(AbstractC6375 abstractC6375, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C13264(abstractC6375, d(j2), j, j2);
    }

    public static C18826 g(AbstractC19162 abstractC19162, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C18826(abstractC19162, d(j2), j, j2);
    }

    public static C20487 e(AbstractC5670 abstractC5670, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C20487(abstractC5670, d(j2), j, j2);
    }

    public static int d(long j) {
        return (j != -1 ? EnumC7330.u : 0) | EnumC7330.t;
    }
}
