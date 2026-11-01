package p067l;

/* JADX INFO: renamed from: l.᩷ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21973 {

    /* JADX INFO: renamed from: ֫ */
    public final long f69032;

    /* JADX INFO: renamed from: ۜ */
    public final C15936 f69033;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f69034;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f69035;

    /* JADX INFO: renamed from: ܽ */
    public final int f69036;

    /* JADX INFO: renamed from: ܿ */
    public final int f69037;

    /* JADX INFO: renamed from: ᩳ */
    public final long[] f69038;

    /* JADX INFO: renamed from: ᩻ */
    public final long[] f69039;

    public C21973(C15936 c15936, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C23877.m52957(iArr.length == jArr2.length);
        C23877.m52957(jArr.length == jArr2.length);
        C23877.m52957(iArr2.length == jArr2.length);
        this.f69033 = c15936;
        this.f69038 = jArr;
        this.f69035 = iArr;
        this.f69036 = i;
        this.f69039 = jArr2;
        this.f69034 = iArr2;
        this.f69032 = j;
        this.f69037 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49493(long j) {
        long[] jArr = this.f69039;
        for (int iM12988 = C5792.m12988(jArr, j, true); iM12988 < jArr.length; iM12988++) {
            if ((this.f69034[iM12988] & 1) != 0) {
                return iM12988;
            }
        }
        return -1;
    }
}
