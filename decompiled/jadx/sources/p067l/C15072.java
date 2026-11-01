package p067l;

/* JADX INFO: renamed from: l.۬᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C15072 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f43054;

    /* JADX INFO: renamed from: ۧ */
    public final long[] f43055;

    /* JADX INFO: renamed from: ܽ */
    public final long[] f43056;

    /* JADX INFO: renamed from: ᩳ */
    public final int f43057;

    public C15072(int i) {
        this.f43057 = i;
        this.f43054 = new long[i];
        this.f43055 = new long[i * 128];
        this.f43056 = new long[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15072 m34482(C9235[] c9235Arr) {
        for (C9235 c9235 : c9235Arr) {
            if (!c9235.m21275() && !c9235.m21276() && !c9235.m21270()) {
                C15072 c15072 = new C15072((c9235Arr.length + 63) >>> 6);
                for (int i = 0; i < c9235Arr.length; i++) {
                    C9235 c9236 = c9235Arr[i];
                    int i2 = i >>> 6;
                    long j = 1 << (i & 63);
                    if (c9236.m21275() || c9236.m21276() || c9236.m21270()) {
                        long[] jArr = c15072.f43054;
                        jArr[i2] = jArr[i2] | j;
                    } else {
                        c15072.m34483(0, i2, c9236.m21274(), j);
                        c15072.m34483(64, i2, c9236.m21272(), j);
                        if (c9236.m21273()) {
                            long[] jArr2 = c15072.f43056;
                            jArr2[i2] = jArr2[i2] | j;
                        }
                    }
                }
                return c15072;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34484() {
        return this.f43057;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m34485(int i, int i2) {
        long j = this.f43054[i];
        if (i2 < 0) {
            return j;
        }
        if (i2 < 128) {
            return j | this.f43055[(i2 * this.f43057) + i];
        }
        return this.f43056[i] | j;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34483(int i, int i2, long j, long j2) {
        while (j != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + i;
            j &= j - 1;
            int i3 = (iNumberOfTrailingZeros * this.f43057) + i2;
            long[] jArr = this.f43055;
            jArr[i3] = jArr[i3] | j2;
        }
    }
}
