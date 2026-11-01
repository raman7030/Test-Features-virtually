package p067l;

/* JADX INFO: renamed from: l.֡᩵ */
/* JADX INFO: compiled from: R5S6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0872 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f5138 = new int[0];

    /* JADX INFO: renamed from: ۧ */
    public static final Object[] f5139 = new Object[0];

    /* JADX INFO: renamed from: ֫ */
    public static int m4842(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m4843(long j, long[] jArr, int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
