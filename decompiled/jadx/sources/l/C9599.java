package l;

/* JADX INFO: renamed from: l.ۢ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9599 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9599 f29128;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f29129;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f29130;

    static {
        C9599 c9599 = new C9599(0L, 0L);
        new C9599(C13132.FOREVER_NS, C13132.FOREVER_NS);
        new C9599(C13132.FOREVER_NS, 0L);
        new C9599(0L, C13132.FOREVER_NS);
        f29128 = c9599;
    }

    public C9599(long j, long j2) {
        C22632.m50631(j >= 0);
        C22632.m50631(j2 >= 0);
        this.f29130 = j;
        this.f29129 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m24534(long j, long j2, long j3) {
        long j4 = this.f29129;
        long j5 = this.f29130;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = C3603.f11424;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = C13132.FOREVER_NS;
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
        if (obj != null && C9599.class == obj.getClass()) {
            C9599 c9599 = (C9599) obj;
            if (this.f29130 == c9599.f29130 && this.f29129 == c9599.f29129) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f29130) * 31) + ((int) this.f29129);
    }
}
