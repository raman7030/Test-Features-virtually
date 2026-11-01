package p067l;

/* JADX INFO: renamed from: l.ۢ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11491 {

    /* JADX INFO: renamed from: ܽ */
    public static final C11491 f32075;

    /* JADX INFO: renamed from: ֫ */
    public final long f32076;

    /* JADX INFO: renamed from: ۧ */
    public final long f32077;

    static {
        C11491 c11491 = new C11491(0L, 0L);
        new C11491(C14849.FOREVER_NS, C14849.FOREVER_NS);
        new C11491(C14849.FOREVER_NS, 0L);
        new C11491(0L, C14849.FOREVER_NS);
        f32075 = c11491;
    }

    public C11491(long j, long j2) {
        C23877.m52957(j >= 0);
        C23877.m52957(j2 >= 0);
        this.f32077 = j;
        this.f32076 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public final long m26546(long j, long j2, long j3) {
        long j4 = this.f32076;
        long j5 = this.f32077;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = C5792.f14228;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = C14849.FOREVER_NS;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11491.class == obj.getClass()) {
            C11491 c11491 = (C11491) obj;
            if (this.f32077 == c11491.f32077 && this.f32076 == c11491.f32076) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f32077) * 31) + ((int) this.f32076);
    }
}
