package l;

/* JADX INFO: renamed from: l.۠ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8321 extends C17535 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C8321 f25533 = new C8321(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8321 c8321 = (C8321) obj;
        if (this != c8321) {
            int size = size();
            int size2 = c8321.size();
            int iMin = Math.min(size, size2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C1265) m40978(i)).compareTo((C1265) c8321.m40978(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            if (size > size2) {
                return 1;
            }
        }
        return 0;
    }
}
