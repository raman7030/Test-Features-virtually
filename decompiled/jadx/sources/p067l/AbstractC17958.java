package p067l;

import com.umeng.analytics.pro.C0684bo;

/* JADX INFO: renamed from: l.ܽۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 855A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17958 implements Comparable {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo7662(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7663(C3838 c3838);

    /* JADX INFO: renamed from: ۖ */
    public abstract EnumC5889 mo7664();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo7665(AbstractC17958 abstractC17958);

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17958 m40873(C5651 c5651, C12556 c12556) {
        byte bM28941 = c12556.m28941();
        EnumC5889 enumC5889M13238 = EnumC5889.m13238((byte) (bM28941 & C0684bo.f2505j));
        byte b = (byte) ((bM28941 & 255) >> 5);
        switch (C12595.f35378[enumC5889M13238.ordinal()]) {
            case 1:
                return new C15708(c12556);
            case 2:
                return new C10583(c12556, b);
            case 3:
                return new C9674(c12556, b);
            case 4:
                return new C24664(c12556, b);
            case 5:
                return new C8571(c12556, b);
            case 6:
                return new C15946(c12556, b);
            case 7:
                return new C3877(c12556, b);
            case 8:
                return new C17287(c5651, c12556, b);
            case 9:
                return new C4548(c5651, c12556, b);
            case 10:
                return new C18629(c5651, c12556, b);
            case 11:
                return new C21983(c5651, c12556, b);
            case 12:
                return new C19300(c5651, c12556, b);
            case 13:
                return new C13698(c5651, c12556);
            case 14:
                return new C12357(c5651, c12556);
            case 15:
                return C11254.f31345;
            case 16:
                if (b == 0) {
                    return C24426.f77334;
                }
                if (b == 1) {
                    return C24426.f77333;
                }
                C24426 c24426 = C24426.f77333;
                throw new RuntimeException("valueArg must be either 0 or 1");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17958 m40874(C5651 c5651, AbstractC17958 abstractC17958) {
        int i = 0;
        C13266[] c13266Arr = null;
        switch (C12595.f35378[abstractC17958.mo7664().ordinal()]) {
            case 1:
                return new C15708(((C15708) abstractC17958).f45519);
            case 2:
                return new C10583(((C10583) abstractC17958).f29309);
            case 3:
                return new C9674(((C9674) abstractC17958).f26648);
            case 4:
                return new C24664(((C24664) abstractC17958).f78038);
            case 5:
                return new C8571(((C8571) abstractC17958).f23048);
            case 6:
                return new C15946(((C15946) abstractC17958).f46158);
            case 7:
                return new C3877(((C3877) abstractC17958).f8406);
            case 8:
                return new C17287(C13266.m30314(((C17287) abstractC17958).f51525.m30317(), c5651));
            case 9:
                return new C4548(C23994.m53164(((C4548) abstractC17958).f10203.m53168(), c5651));
            case 10:
                return new C18629(((C18629) abstractC17958).f55624.m45320(c5651));
            case 11:
                return new C21983(((C21983) abstractC17958).f69086.m51949(c5651));
            case 12:
                return new C19300(((C19300) abstractC17958).f57651.m45320(c5651));
            case 13:
                AbstractC17958[] abstractC17958Arr = ((C13698) abstractC17958).f22284;
                int length = abstractC17958Arr.length;
                AbstractC17958[] abstractC17958Arr2 = new AbstractC17958[length];
                while (i < length) {
                    abstractC17958Arr2[i] = m40874(c5651, abstractC17958Arr[i]);
                    i++;
                }
                return new C13698(abstractC17958Arr2);
            case 14:
                C12357 c12357 = (C12357) abstractC17958;
                C23994 c23994M53164 = C23994.m53164(c12357.f41076.m53168(), c5651);
                C13266[] c13266Arr2 = c12357.f41075;
                if (c13266Arr2 != null) {
                    int length2 = c13266Arr2.length;
                    C13266[] c13266Arr3 = new C13266[length2];
                    while (i < length2) {
                        c13266Arr3[i] = C13266.m30314(c13266Arr2[i].m30317(), c5651);
                        i++;
                    }
                    c13266Arr = c13266Arr3;
                }
                return new C12357(c23994M53164, c13266Arr, c12357.m32969(c5651));
            case 15:
                return C11254.f31345;
            case 16:
                if (((C24426) abstractC17958).f77335) {
                    return C24426.f77333;
                }
                return C24426.f77334;
            default:
                return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC17958 abstractC17958) {
        int iCompareTo = mo7664().compareTo(abstractC17958.mo7664());
        return iCompareTo == 0 ? mo7665(abstractC17958) : iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof AbstractC17958) && compareTo((AbstractC17958) obj) == 0;
    }
}
