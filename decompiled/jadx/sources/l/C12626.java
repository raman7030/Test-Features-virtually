package l;

/* JADX INFO: renamed from: l.۫᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5CF */
/* JADX INFO: loaded from: classes4.dex */
public class C12626 extends AbstractC16404 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16404[] f38048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11467[] f38049;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22755 f38050;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38051 = 0;

    public C12626(C3454 c3454, C10720 c10720) {
        int i = 0;
        this.f38050 = (C22755) c3454.f10926.m1314(c10720.m26903());
        int iM26903 = c10720.m26903();
        this.f38049 = new C11467[iM26903];
        this.f38048 = new AbstractC16404[iM26903];
        while (true) {
            C11467[] c11467Arr = this.f38049;
            if (i >= c11467Arr.length) {
                return;
            }
            c11467Arr[i] = (C11467) c3454.f10947.m1314(c10720.m26903());
            this.f38048[i] = AbstractC16404.m38657(c3454, c10720);
            i++;
        }
    }

    public C12626(C22755 c22755, C11467[] c11467Arr, AbstractC16404[] abstractC16404Arr) {
        this.f38050 = c22755;
        if (c11467Arr.length != abstractC16404Arr.length) {
            throw new RuntimeException("The names and values parameters must be the same length");
        }
        this.f38049 = c11467Arr;
        this.f38048 = abstractC16404Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC16404[] m30892(C3454 c3454) {
        AbstractC16404[] abstractC16404Arr = this.f38048;
        if (abstractC16404Arr == null) {
            return null;
        }
        int length = abstractC16404Arr.length;
        AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[length];
        for (int i = 0; i < length; i++) {
            abstractC16404Arr2[i] = AbstractC16404.m38658(c3454, abstractC16404Arr[i]);
        }
        return abstractC16404Arr2;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public void mo5434(C1547 c1547) {
        C22755 c22755 = this.f38050;
        c22755.m50835();
        c1547.m5301(c22755.m14661());
        C11467[] c11467Arr = this.f38049;
        Integer.toHexString(c11467Arr.length);
        c1547.m5301(c11467Arr.length);
        for (int i = 0; i < c11467Arr.length; i++) {
            c1547.m5299();
            c11467Arr[i].m28273();
            c1547.m5301(c11467Arr[i].m14661());
            c1547.m5299();
            this.f38048[i].mo5434(c1547);
            c1547.m5295();
            c1547.m5295();
        }
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public int mo5433(int i) {
        int iM27697 = C11166.m27697(this.f38050.m14661()) + i;
        C11467[] c11467Arr = this.f38049;
        int iM27698 = C11166.m27697(c11467Arr.length) + iM27697;
        for (int i2 = 0; i2 < c11467Arr.length; i2++) {
            iM27698 = this.f38048[i2].mo5433(C11166.m27697(c11467Arr[i2].m14661()) + iM27698);
        }
        return iM27698;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        C12626 c12626 = (C12626) abstractC16404;
        C22755 c22755 = c12626.f38050;
        C11467[] c11467Arr = c12626.f38049;
        int iCompareTo = this.f38050.compareTo(c22755);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C11467[] c11467Arr2 = this.f38049;
        int length = c11467Arr2.length - c11467Arr.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i < c11467Arr2.length; i++) {
            int iCompareTo2 = c11467Arr2[i].compareTo(c11467Arr[i]);
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            length = this.f38048[i].compareTo(c12626.f38048[i]);
            if (length != 0) {
                return length;
            }
        }
        return length;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_ANNOTATION;
    }

    public final int hashCode() {
        if (this.f38051 == 0) {
            this.f38051 = this.f38050.hashCode();
            int i = 0;
            while (true) {
                C11467[] c11467Arr = this.f38049;
                if (i >= c11467Arr.length) {
                    break;
                }
                int iHashCode = c11467Arr[i].hashCode() + (this.f38051 * 31);
                this.f38051 = iHashCode;
                this.f38051 = this.f38048[i].hashCode() + (iHashCode * 31);
                i++;
            }
        }
        return this.f38051;
    }
}
