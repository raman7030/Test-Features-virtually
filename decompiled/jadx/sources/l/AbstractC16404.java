package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܽۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 855A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16404 implements Comparable {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo5433(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5434(C1547 c1547);

    /* JADX INFO: renamed from: ۖ */
    public abstract EnumC3705 mo5435();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo5436(AbstractC16404 abstractC16404);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16404 m38657(C3454 c3454, C10720 c10720) {
        byte bM26901 = c10720.m26901();
        EnumC3705 enumC3705M11291 = EnumC3705.m11291((byte) (bM26901 & bo.j));
        byte b = (byte) ((bM26901 & 255) >> 5);
        switch (C10761.f32403[enumC3705M11291.ordinal()]) {
            case 1:
                return new C14036(c10720);
            case 2:
                return new C8644(c10720, b);
            case 3:
                return new C7687(c10720, b);
            case 4:
                return new C23460(c10720, b);
            case 5:
                return new C6527(c10720, b);
            case 6:
                return new C14287(c10720, b);
            case 7:
                return new C1588(c10720, b);
            case 8:
                return new C15698(c3454, c10720, b);
            case 9:
                return new C2294(c3454, c10720, b);
            case 10:
                return new C17110(c3454, c10720, b);
            case 11:
                return new C20639(c3454, c10720, b);
            case 12:
                return new C17816(c3454, c10720, b);
            case 13:
                return new C11921(c3454, c10720);
            case 14:
                return new C10510(c3454, c10720);
            case 15:
                return C9350.f28396;
            case 16:
                if (b == 0) {
                    return C23209.f74591;
                }
                if (b == 1) {
                    return C23209.f74590;
                }
                C23209 c23209 = C23209.f74590;
                throw new RuntimeException("valueArg must be either 0 or 1");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16404 m38658(C3454 c3454, AbstractC16404 abstractC16404) {
        int i = 0;
        C11467[] c11467Arr = null;
        switch (C10761.f32403[abstractC16404.mo5435().ordinal()]) {
            case 1:
                return new C14036(((C14036) abstractC16404).f42436);
            case 2:
                return new C8644(((C8644) abstractC16404).f26391);
            case 3:
                return new C7687(((C7687) abstractC16404).f23735);
            case 4:
                return new C23460(((C23460) abstractC16404).f75291);
            case 5:
                return new C6527(((C6527) abstractC16404).f20170);
            case 6:
                return new C14287(((C14287) abstractC16404).f43066);
            case 7:
                return new C1588(((C1588) abstractC16404).f5627);
            case 8:
                return new C15698(C11467.m28270(((C15698) abstractC16404).f48387.m28273(), c3454));
            case 9:
                return new C2294(C22755.m50831(((C2294) abstractC16404).f7417.m50835(), c3454));
            case 10:
                return new C17110(((C17110) abstractC16404).f52442.m43042(c3454));
            case 11:
                return new C20639(((C20639) abstractC16404).f66406.m49613(c3454));
            case 12:
                return new C17816(((C17816) abstractC16404).f54455.m43042(c3454));
            case 13:
                AbstractC16404[] abstractC16404Arr = ((C11921) abstractC16404).f19421;
                int length = abstractC16404Arr.length;
                AbstractC16404[] abstractC16404Arr2 = new AbstractC16404[length];
                while (i < length) {
                    abstractC16404Arr2[i] = m38658(c3454, abstractC16404Arr[i]);
                    i++;
                }
                return new C11921(abstractC16404Arr2);
            case 14:
                C10510 c10510 = (C10510) abstractC16404;
                C22755 c22755M50831 = C22755.m50831(c10510.f38050.m50835(), c3454);
                C11467[] c11467Arr2 = c10510.f38049;
                if (c11467Arr2 != null) {
                    int length2 = c11467Arr2.length;
                    C11467[] c11467Arr3 = new C11467[length2];
                    while (i < length2) {
                        c11467Arr3[i] = C11467.m28270(c11467Arr2[i].m28273(), c3454);
                        i++;
                    }
                    c11467Arr = c11467Arr3;
                }
                return new C10510(c22755M50831, c11467Arr, c10510.m30892(c3454));
            case 15:
                return C9350.f28396;
            case 16:
                if (((C23209) abstractC16404).f74592) {
                    return C23209.f74590;
                }
                return C23209.f74591;
            default:
                return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC16404 abstractC16404) {
        int iCompareTo = mo5435().compareTo(abstractC16404.mo5435());
        return iCompareTo == 0 ? mo5436(abstractC16404) : iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof AbstractC16404) && compareTo((AbstractC16404) obj) == 0;
    }
}
