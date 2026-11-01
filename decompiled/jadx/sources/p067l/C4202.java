package p067l;

/* JADX INFO: renamed from: l.֫ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4202 extends C19034 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4202 c4202) {
        int size = size();
        int size2 = c4202.size();
        int i = size < size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC15405) m43238(i2)).compareTo((AbstractC15405) c4202.m43238(i2));
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
