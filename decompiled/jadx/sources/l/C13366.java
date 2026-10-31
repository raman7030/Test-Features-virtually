package l;

/* JADX INFO: renamed from: l.۬᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C13366 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f39987;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f39988;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long[] f39989;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39990;

    public C13366(int i) {
        this.f39990 = i;
        this.f39987 = new long[i];
        this.f39988 = new long[i * 128];
        this.f39989 = new long[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13366 m32381(C7225[] c7225Arr) {
        for (C7225 c7225 : c7225Arr) {
            if (!c7225.m19326() && !c7225.m19327() && !c7225.m19321()) {
                C13366 c13366 = new C13366((c7225Arr.length + 63) >>> 6);
                for (int i = 0; i < c7225Arr.length; i++) {
                    C7225 c7226 = c7225Arr[i];
                    int i2 = i >>> 6;
                    long j = 1 << (i & 63);
                    if (c7226.m19326() || c7226.m19327() || c7226.m19321()) {
                        long[] jArr = c13366.f39987;
                        jArr[i2] = jArr[i2] | j;
                    } else {
                        c13366.m32382(0, i2, c7226.m19325(), j);
                        c13366.m32382(64, i2, c7226.m19323(), j);
                        if (c7226.m19324()) {
                            long[] jArr2 = c13366.f39989;
                            jArr2[i2] = jArr2[i2] | j;
                        }
                    }
                }
                return c13366;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32383() {
        return this.f39990;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m32384(int i, int i2) {
        long j = this.f39987[i];
        if (i2 < 0) {
            return j;
        }
        if (i2 < 128) {
            return j | this.f39988[(i2 * this.f39990) + i];
        }
        return this.f39989[i] | j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32382(int i, int i2, long j, long j2) {
        while (j != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + i;
            j &= j - 1;
            int i3 = (iNumberOfTrailingZeros * this.f39990) + i2;
            long[] jArr = this.f39988;
            jArr[i3] = jArr[i3] | j2;
        }
    }
}
