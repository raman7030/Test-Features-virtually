package l;

/* JADX INFO: renamed from: l.֫ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1929 extends C17535 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1929 c1929) {
        int size = size();
        int size2 = c1929.size();
        int i = size < size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC13717) m40978(i2)).compareTo((AbstractC13717) c1929.m40978(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
