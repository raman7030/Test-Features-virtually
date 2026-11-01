package p067l;

/* JADX INFO: renamed from: l.ۚ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O73P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7315 {

    /* JADX INFO: renamed from: ֫ */
    public final long[] f19146;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f19147;

    /* JADX INFO: renamed from: ܽ */
    public final long[] f19148;

    public C7315(long[] jArr, long[] jArr2, int[] iArr) {
        this.f19148 = jArr;
        this.f19146 = jArr2;
        this.f19147 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16886() {
        return this.f19148.length;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m16890() {
        return this.f19148[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16888(int i) {
        return this.f19146[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m16889(int i) {
        return this.f19147[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16887(long j) {
        long[] jArr = this.f19148;
        int length = jArr.length - 1;
        int i = 0;
        int i2 = 0;
        while (i <= length) {
            int i3 = (i + length) >>> 1;
            if (jArr[i3] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        return i2;
    }
}
