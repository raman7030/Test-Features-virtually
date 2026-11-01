package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: LAS4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18017 {

    /* JADX INFO: renamed from: ۧ */
    public static final AtomicInteger f53785 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ */
    public final int f53786;

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC18017 mo23281(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo23282(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo23283();

    public AbstractC18017(int i) {
        f53785.getAndIncrement();
        this.f53786 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9971 m40995(C22926 c22926, C20915 c20915) {
        if (c20915 == null) {
            c20915 = C10856.f30088;
        }
        C10856 c10856 = c20915.f65695;
        if (c10856 == null || c20915 == C10856.f30088) {
            return C22515.f71002;
        }
        C22515 c22515 = C22515.f71002;
        return C9971.m23280(m40995(c22926, c10856), ((C10642) ((AbstractC24266) c22926.f72152.get(c20915.f65694)).m53604(0)).f29431.f76895);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo30021() {
        return this == C22515.f71002;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40998() {
        return mo23282(mo23283() - 1) == Integer.MAX_VALUE;
    }

    public final int hashCode() {
        return this.f53786;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18017 m40996(AbstractC18017 abstractC18017, AbstractC18017 abstractC18018, boolean z, C13048 c13048) {
        AbstractC18017 c13127;
        AbstractC18017 abstractC18019;
        AbstractC18017 c13128 = abstractC18017;
        AbstractC18017 c13129 = abstractC18018;
        if (c13128 != c13129 && !abstractC18017.equals(abstractC18018)) {
            boolean z2 = c13128 instanceof C9971;
            if (z2 && (c13129 instanceof C9971)) {
                C9971 c9971 = (C9971) c13128;
                AbstractC18017 abstractC180110 = c9971.f27620;
                int i = c9971.f27621;
                C9971 c9972 = (C9971) c13129;
                AbstractC18017 abstractC180111 = c9972.f27620;
                int i2 = c9972.f27621;
                if (c13048 != null) {
                    AbstractC18017 abstractC180112 = (AbstractC18017) c13048.m29872(c9971, c9972);
                    if (abstractC180112 != null) {
                        return abstractC180112;
                    }
                    AbstractC18017 abstractC180113 = (AbstractC18017) c13048.m29872(c9972, c9971);
                    if (abstractC180113 != null) {
                        return abstractC180113;
                    }
                }
                AbstractC18017 abstractC180114 = null;
                if (z) {
                    abstractC18019 = C22515.f71002;
                    if (c9971 != abstractC18019 && c9972 != abstractC18019) {
                        abstractC18019 = null;
                    }
                } else {
                    AbstractC18017 abstractC180115 = C22515.f71002;
                    if (c9971 == abstractC180115 && c9972 == abstractC180115) {
                        abstractC18019 = abstractC180115;
                    } else {
                        if (c9971 == abstractC180115) {
                            c13127 = new C13127(new AbstractC18017[]{abstractC180111, null}, new int[]{i2, Integer.MAX_VALUE});
                        } else if (c9972 == abstractC180115) {
                            c13127 = new C13127(new AbstractC18017[]{abstractC180110, null}, new int[]{i, Integer.MAX_VALUE});
                        } else {
                            abstractC18019 = null;
                        }
                        abstractC18019 = c13127;
                    }
                }
                if (abstractC18019 != null) {
                    if (c13048 != null) {
                        c13048.m29873(c9971, c9972, abstractC18019);
                    }
                    return abstractC18019;
                }
                if (i == i2) {
                    AbstractC18017 abstractC18017M40996 = m40996(abstractC180110, abstractC180111, z, c13048);
                    if (abstractC18017M40996 == abstractC180110) {
                        return c9971;
                    }
                    if (abstractC18017M40996 == abstractC180111) {
                        return c9972;
                    }
                    AbstractC18017 abstractC18017M23280 = C9971.m23280(abstractC18017M40996, i);
                    if (c13048 != null) {
                        c13048.m29873(c9971, c9972, abstractC18017M23280);
                    }
                    return abstractC18017M23280;
                }
                if (c9971 == c9972 || (abstractC180110 != null && abstractC180110.equals(abstractC180111))) {
                    abstractC180114 = abstractC180110;
                }
                if (abstractC180114 != null) {
                    int[] iArr = {i, i2};
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    }
                    AbstractC18017 c131210 = new C13127(new AbstractC18017[]{abstractC180114, abstractC180114}, iArr);
                    if (c13048 != null) {
                        c13048.m29873(c9971, c9972, c131210);
                    }
                    return c131210;
                }
                int[] iArr2 = {i, i2};
                AbstractC18017[] abstractC18017Arr = {abstractC180110, abstractC180111};
                if (i > i2) {
                    iArr2[0] = i2;
                    iArr2[1] = i;
                    abstractC18017Arr = new AbstractC18017[]{abstractC180111, abstractC180110};
                }
                AbstractC18017 c131211 = new C13127(abstractC18017Arr, iArr2);
                if (c13048 != null) {
                    c13048.m29873(c9971, c9972, c131211);
                }
                return c131211;
            }
            if (z) {
                if (c13128 instanceof C22515) {
                    return c13128;
                }
                if (c13129 instanceof C22515) {
                    return c13129;
                }
            }
            if (z2) {
                c13128 = new C13127((C9971) c13128);
            }
            if (c13129 instanceof C9971) {
                c13129 = new C13127((C9971) c13129);
            }
            C13127 c131212 = (C13127) c13128;
            C13127 c131213 = (C13127) c13129;
            if (c13048 != null) {
                AbstractC18017 abstractC180116 = (AbstractC18017) c13048.m29872(c131212, c131213);
                if (abstractC180116 != null) {
                    boolean z3 = C24525.f77680;
                    return abstractC180116;
                }
                AbstractC18017 abstractC180117 = (AbstractC18017) c13048.m29872(c131213, c131212);
                if (abstractC180117 != null) {
                    boolean z4 = C24525.f77680;
                    return abstractC180117;
                }
            }
            int[] iArr3 = c131212.f36881;
            AbstractC18017[] abstractC18017Arr2 = c131212.f36880;
            int length = iArr3.length;
            int[] iArr4 = c131213.f36881;
            AbstractC18017[] abstractC18017Arr3 = c131213.f36880;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC18017[] abstractC18017Arr4 = new AbstractC18017[length2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < iArr3.length && i4 < iArr4.length) {
                AbstractC18017 abstractC180118 = abstractC18017Arr2[i3];
                AbstractC18017 abstractC180119 = abstractC18017Arr3[i4];
                C13127 c131214 = c131212;
                int i6 = iArr3[i3];
                C13127 c131215 = c131213;
                int i7 = iArr4[i4];
                if (i6 == i7) {
                    boolean z5 = i6 == Integer.MAX_VALUE && abstractC180118 == null && abstractC180119 == null;
                    boolean z6 = (abstractC180118 == null || abstractC180119 == null || !abstractC180118.equals(abstractC180119)) ? false : true;
                    if (z5 || z6) {
                        abstractC18017Arr4[i5] = abstractC180118;
                        iArrCopyOf[i5] = i6;
                    } else {
                        abstractC18017Arr4[i5] = m40996(abstractC180118, abstractC180119, z, c13048);
                        iArrCopyOf[i5] = i6;
                    }
                    i3++;
                } else {
                    if (i6 < i7) {
                        abstractC18017Arr4[i5] = abstractC180118;
                        iArrCopyOf[i5] = i6;
                        i3++;
                    } else {
                        abstractC18017Arr4[i5] = abstractC180119;
                        iArrCopyOf[i5] = i7;
                    }
                    i5++;
                    c131212 = c131214;
                    c131213 = c131215;
                }
                i4++;
                i5++;
                c131212 = c131214;
                c131213 = c131215;
            }
            AbstractC18017 abstractC180120 = c131212;
            AbstractC18017 abstractC180121 = c131213;
            if (i3 < iArr3.length) {
                while (i3 < iArr3.length) {
                    abstractC18017Arr4[i5] = abstractC18017Arr2[i3];
                    iArrCopyOf[i5] = iArr3[i3];
                    i5++;
                    i3++;
                }
            } else {
                while (i4 < iArr4.length) {
                    abstractC18017Arr4[i5] = abstractC18017Arr3[i4];
                    iArrCopyOf[i5] = iArr4[i4];
                    i5++;
                    i4++;
                }
            }
            if (i5 < length2) {
                if (i5 == 1) {
                    AbstractC18017 abstractC18017M23281 = C9971.m23280(abstractC18017Arr4[0], iArrCopyOf[0]);
                    if (c13048 != null) {
                        c13048.m29873(abstractC180120, abstractC180121, abstractC18017M23281);
                    }
                    return abstractC18017M23281;
                }
                abstractC18017Arr4 = (AbstractC18017[]) Arrays.copyOf(abstractC18017Arr4, i5);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
            }
            c13128 = new C13127(abstractC18017Arr4, iArrCopyOf);
            if (c13128.equals(abstractC180120)) {
                if (c13048 != null) {
                    c13048.m29873(abstractC180120, abstractC180121, abstractC180120);
                }
                boolean z7 = C24525.f77680;
                return abstractC180120;
            }
            if (c13128.equals(abstractC180121)) {
                if (c13048 != null) {
                    c13048.m29873(abstractC180120, abstractC180121, abstractC180121);
                }
                boolean z8 = C24525.f77680;
                return abstractC180121;
            }
            HashMap map = new HashMap();
            for (AbstractC18017 abstractC180122 : abstractC18017Arr4) {
                if (!map.containsKey(abstractC180122)) {
                    map.put(abstractC180122, abstractC180122);
                }
            }
            for (int i8 = 0; i8 < abstractC18017Arr4.length; i8++) {
                abstractC18017Arr4[i8] = (AbstractC18017) map.get(abstractC18017Arr4[i8]);
            }
            if (c13048 != null) {
                c13048.m29873(abstractC180120, abstractC180121, c13128);
            }
            boolean z9 = C24525.f77680;
        }
        return c13128;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18017 m40997(AbstractC18017 abstractC18017, C19359 c19359, IdentityHashMap identityHashMap) {
        AbstractC18017 c13127;
        if (abstractC18017.mo30021()) {
            return abstractC18017;
        }
        AbstractC18017 abstractC18018 = (AbstractC18017) identityHashMap.get(abstractC18017);
        if (abstractC18018 != null) {
            return abstractC18018;
        }
        AbstractC18017 abstractC18017M44093 = c19359.m44093(abstractC18017);
        HashMap map = c19359.f57796;
        if (abstractC18017M44093 != null) {
            identityHashMap.put(abstractC18017, abstractC18017M44093);
            return abstractC18017M44093;
        }
        AbstractC18017[] abstractC18017Arr = new AbstractC18017[abstractC18017.mo23283()];
        boolean z = false;
        for (int i = 0; i < abstractC18017Arr.length; i++) {
            AbstractC18017 abstractC18017M40997 = m40997(abstractC18017.mo23281(i), c19359, identityHashMap);
            if (z || abstractC18017M40997 != abstractC18017.mo23281(i)) {
                if (!z) {
                    abstractC18017Arr = new AbstractC18017[abstractC18017.mo23283()];
                    for (int i2 = 0; i2 < abstractC18017.mo23283(); i2++) {
                        abstractC18017Arr[i2] = abstractC18017.mo23281(i2);
                    }
                    z = true;
                }
                abstractC18017Arr[i] = abstractC18017M40997;
            }
        }
        if (!z) {
            if (abstractC18017 != C22515.f71002 && ((AbstractC18017) map.get(abstractC18017)) == null) {
                map.put(abstractC18017, abstractC18017);
            }
            identityHashMap.put(abstractC18017, abstractC18017);
            return abstractC18017;
        }
        if (abstractC18017Arr.length == 0) {
            c13127 = C22515.f71002;
        } else if (abstractC18017Arr.length == 1) {
            c13127 = C9971.m23280(abstractC18017Arr[0], abstractC18017.mo23282(0));
        } else {
            c13127 = new C13127(abstractC18017Arr, ((C13127) abstractC18017).f36881);
        }
        if (c13127 != C22515.f71002 && ((AbstractC18017) map.get(c13127)) == null) {
            map.put(c13127, c13127);
        }
        identityHashMap.put(c13127, c13127);
        identityHashMap.put(abstractC18017, c13127);
        return c13127;
    }
}
