package l;

/* JADX INFO: renamed from: l.ۨۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11437 {
    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC11437 mo6130(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28253(int i, int i2) {
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
