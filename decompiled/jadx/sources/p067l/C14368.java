package p067l;

/* JADX INFO: renamed from: l.۫᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5CF */
/* JADX INFO: loaded from: classes4.dex */
public class C14368 extends AbstractC17958 {

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17958[] f41074;

    /* JADX INFO: renamed from: ᩶ */
    public final C13266[] f41075;

    /* JADX INFO: renamed from: ᩸ */
    public final C23994 f41076;

    /* JADX INFO: renamed from: ᩹ */
    public int f41077 = 0;

    public C14368(C5651 c5651, C12556 c12556) {
        int i = 0;
        this.f41076 = (C23994) c5651.f13727.m3722(c12556.m28943());
        int iM28943 = c12556.m28943();
        this.f41075 = new C13266[iM28943];
        this.f41074 = new AbstractC17958[iM28943];
        while (true) {
            C13266[] c13266Arr = this.f41075;
            if (i >= c13266Arr.length) {
                return;
            }
            c13266Arr[i] = (C13266) c5651.f13748.m3722(c12556.m28943());
            this.f41074[i] = AbstractC17958.m40873(c5651, c12556);
            i++;
        }
    }

    public C14368(C23994 c23994, C13266[] c13266Arr, AbstractC17958[] abstractC17958Arr) {
        this.f41076 = c23994;
        if (c13266Arr.length != abstractC17958Arr.length) {
            throw new RuntimeException("The names and values parameters must be the same length");
        }
        this.f41075 = c13266Arr;
        this.f41074 = abstractC17958Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17958[] m32969(C5651 c5651) {
        AbstractC17958[] abstractC17958Arr = this.f41074;
        if (abstractC17958Arr == null) {
            return null;
        }
        int length = abstractC17958Arr.length;
        AbstractC17958[] abstractC17958Arr2 = new AbstractC17958[length];
        for (int i = 0; i < length; i++) {
            abstractC17958Arr2[i] = AbstractC17958.m40874(c5651, abstractC17958Arr[i]);
        }
        return abstractC17958Arr2;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public void mo7663(C3838 c3838) {
        C23994 c23994 = this.f41076;
        c23994.m53168();
        c3838.m7530(c23994.m16569());
        C13266[] c13266Arr = this.f41075;
        Integer.toHexString(c13266Arr.length);
        c3838.m7530(c13266Arr.length);
        for (int i = 0; i < c13266Arr.length; i++) {
            c3838.m7528();
            c13266Arr[i].m30317();
            c3838.m7530(c13266Arr[i].m16569());
            c3838.m7528();
            this.f41074[i].mo7663(c3838);
            c3838.m7524();
            c3838.m7524();
        }
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public int mo7662(int i) {
        int iM29759 = C12981.m29759(this.f41076.m16569()) + i;
        C13266[] c13266Arr = this.f41075;
        int iM297510 = C12981.m29759(c13266Arr.length) + iM29759;
        for (int i2 = 0; i2 < c13266Arr.length; i2++) {
            iM297510 = this.f41074[i2].mo7662(C12981.m29759(c13266Arr[i2].m16569()) + iM297510);
        }
        return iM297510;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        C14368 c14368 = (C14368) abstractC17958;
        C23994 c23994 = c14368.f41076;
        C13266[] c13266Arr = c14368.f41075;
        int iCompareTo = this.f41076.compareTo(c23994);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C13266[] c13266Arr2 = this.f41075;
        int length = c13266Arr2.length - c13266Arr.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i < c13266Arr2.length; i++) {
            int iCompareTo2 = c13266Arr2[i].compareTo(c13266Arr[i]);
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            length = this.f41074[i].compareTo(c14368.f41074[i]);
            if (length != 0) {
                return length;
            }
        }
        return length;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_ANNOTATION;
    }

    public final int hashCode() {
        if (this.f41077 == 0) {
            this.f41077 = this.f41076.hashCode();
            int i = 0;
            while (true) {
                C13266[] c13266Arr = this.f41075;
                if (i >= c13266Arr.length) {
                    break;
                }
                int iHashCode = c13266Arr[i].hashCode() + (this.f41077 * 31);
                this.f41077 = iHashCode;
                this.f41077 = this.f41074[i].hashCode() + (iHashCode * 31);
                i++;
            }
        }
        return this.f41077;
    }
}
