package p067l;

/* JADX INFO: renamed from: l.ۨۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13238 {
    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC13238 mo8328(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public static int m30297(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }
}
