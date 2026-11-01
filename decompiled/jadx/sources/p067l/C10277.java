package p067l;

/* JADX INFO: renamed from: l.۠ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10277 extends C19034 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C10277 f28444 = new C10277(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10277 c10277 = (C10277) obj;
        if (this != c10277) {
            int size = size();
            int size2 = c10277.size();
            int iMin = Math.min(size, size2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C3571) m43238(i)).compareTo((C3571) c10277.m43238(i));
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
