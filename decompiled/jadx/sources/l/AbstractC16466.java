package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: LAS4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16466 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f50607 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50608;

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC16466 mo21315(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo21316(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo21317();

    public AbstractC16466(int i) {
        f50607.getAndIncrement();
        this.f50608 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8000 m38769(C21631 c21631, C19515 c19515) {
        if (c19515 == null) {
            c19515 = C8931.f27153;
        }
        C8931 c8931 = c19515.f63075;
        if (c8931 == null || c19515 == C8931.f27153) {
            return C21198.f68319;
        }
        C21198 c21198 = C21198.f68319;
        return C8000.m21314(m38769(c21631, c8931), ((C8706) ((AbstractC23041) c21631.f69449.get(c19515.f63074)).m51211(0)).f26506.f74153);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo27960() {
        return this == C21198.f68319;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38772() {
        return mo21316(mo21317() - 1) == Integer.MAX_VALUE;
    }

    public final int hashCode() {
        return this.f50608;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16466 m38770(AbstractC16466 abstractC16466, AbstractC16466 abstractC16467, boolean z, C11237 c11237) {
        AbstractC16466 c11320;
        AbstractC16466 abstractC16468;
        AbstractC16466 c11321 = abstractC16466;
        AbstractC16466 c11322 = abstractC16467;
        if (c11321 != c11322 && !abstractC16466.equals(abstractC16467)) {
            boolean z2 = c11321 instanceof C8000;
            if (z2 && (c11322 instanceof C8000)) {
                C8000 c8000 = (C8000) c11321;
                AbstractC16466 abstractC16469 = c8000.f24706;
                int i = c8000.f24707;
                C8000 c8001 = (C8000) c11322;
                AbstractC16466 abstractC164610 = c8001.f24706;
                int i2 = c8001.f24707;
                if (c11237 != null) {
                    AbstractC16466 abstractC164611 = (AbstractC16466) c11237.m27810(c8000, c8001);
                    if (abstractC164611 != null) {
                        return abstractC164611;
                    }
                    AbstractC16466 abstractC164612 = (AbstractC16466) c11237.m27810(c8001, c8000);
                    if (abstractC164612 != null) {
                        return abstractC164612;
                    }
                }
                AbstractC16466 abstractC164613 = null;
                if (z) {
                    abstractC16468 = C21198.f68319;
                    if (c8000 != abstractC16468 && c8001 != abstractC16468) {
                        abstractC16468 = null;
                    }
                } else {
                    AbstractC16466 abstractC164614 = C21198.f68319;
                    if (c8000 == abstractC164614 && c8001 == abstractC164614) {
                        abstractC16468 = abstractC164614;
                    } else {
                        if (c8000 == abstractC164614) {
                            c11320 = new C11320(new AbstractC16466[]{abstractC164610, null}, new int[]{i2, Integer.MAX_VALUE});
                        } else if (c8001 == abstractC164614) {
                            c11320 = new C11320(new AbstractC16466[]{abstractC16469, null}, new int[]{i, Integer.MAX_VALUE});
                        } else {
                            abstractC16468 = null;
                        }
                        abstractC16468 = c11320;
                    }
                }
                if (abstractC16468 != null) {
                    if (c11237 != null) {
                        c11237.m27811(c8000, c8001, abstractC16468);
                    }
                    return abstractC16468;
                }
                if (i == i2) {
                    AbstractC16466 abstractC16466M38770 = m38770(abstractC16469, abstractC164610, z, c11237);
                    if (abstractC16466M38770 == abstractC16469) {
                        return c8000;
                    }
                    if (abstractC16466M38770 == abstractC164610) {
                        return c8001;
                    }
                    AbstractC16466 abstractC16466M21314 = C8000.m21314(abstractC16466M38770, i);
                    if (c11237 != null) {
                        c11237.m27811(c8000, c8001, abstractC16466M21314);
                    }
                    return abstractC16466M21314;
                }
                if (c8000 == c8001 || (abstractC16469 != null && abstractC16469.equals(abstractC164610))) {
                    abstractC164613 = abstractC16469;
                }
                if (abstractC164613 != null) {
                    int[] iArr = {i, i2};
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    }
                    AbstractC16466 c11323 = new C11320(new AbstractC16466[]{abstractC164613, abstractC164613}, iArr);
                    if (c11237 != null) {
                        c11237.m27811(c8000, c8001, c11323);
                    }
                    return c11323;
                }
                int[] iArr2 = {i, i2};
                AbstractC16466[] abstractC16466Arr = {abstractC16469, abstractC164610};
                if (i > i2) {
                    iArr2[0] = i2;
                    iArr2[1] = i;
                    abstractC16466Arr = new AbstractC16466[]{abstractC164610, abstractC16469};
                }
                AbstractC16466 c11324 = new C11320(abstractC16466Arr, iArr2);
                if (c11237 != null) {
                    c11237.m27811(c8000, c8001, c11324);
                }
                return c11324;
            }
            if (z) {
                if (c11321 instanceof C21198) {
                    return c11321;
                }
                if (c11322 instanceof C21198) {
                    return c11322;
                }
            }
            if (z2) {
                c11321 = new C11320((C8000) c11321);
            }
            if (c11322 instanceof C8000) {
                c11322 = new C11320((C8000) c11322);
            }
            C11320 c11325 = (C11320) c11321;
            C11320 c11326 = (C11320) c11322;
            if (c11237 != null) {
                AbstractC16466 abstractC164615 = (AbstractC16466) c11237.m27810(c11325, c11326);
                if (abstractC164615 != null) {
                    boolean z3 = C23313.f74933;
                    return abstractC164615;
                }
                AbstractC16466 abstractC164616 = (AbstractC16466) c11237.m27810(c11326, c11325);
                if (abstractC164616 != null) {
                    boolean z4 = C23313.f74933;
                    return abstractC164616;
                }
            }
            int[] iArr3 = c11325.f33882;
            AbstractC16466[] abstractC16466Arr2 = c11325.f33881;
            int length = iArr3.length;
            int[] iArr4 = c11326.f33882;
            AbstractC16466[] abstractC16466Arr3 = c11326.f33881;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC16466[] abstractC16466Arr4 = new AbstractC16466[length2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < iArr3.length && i4 < iArr4.length) {
                AbstractC16466 abstractC164617 = abstractC16466Arr2[i3];
                AbstractC16466 abstractC164618 = abstractC16466Arr3[i4];
                C11320 c11327 = c11325;
                int i6 = iArr3[i3];
                C11320 c11328 = c11326;
                int i7 = iArr4[i4];
                if (i6 == i7) {
                    boolean z5 = i6 == Integer.MAX_VALUE && abstractC164617 == null && abstractC164618 == null;
                    boolean z6 = (abstractC164617 == null || abstractC164618 == null || !abstractC164617.equals(abstractC164618)) ? false : true;
                    if (z5 || z6) {
                        abstractC16466Arr4[i5] = abstractC164617;
                        iArrCopyOf[i5] = i6;
                    } else {
                        abstractC16466Arr4[i5] = m38770(abstractC164617, abstractC164618, z, c11237);
                        iArrCopyOf[i5] = i6;
                    }
                    i3++;
                } else {
                    if (i6 < i7) {
                        abstractC16466Arr4[i5] = abstractC164617;
                        iArrCopyOf[i5] = i6;
                        i3++;
                    } else {
                        abstractC16466Arr4[i5] = abstractC164618;
                        iArrCopyOf[i5] = i7;
                    }
                    i5++;
                    c11325 = c11327;
                    c11326 = c11328;
                }
                i4++;
                i5++;
                c11325 = c11327;
                c11326 = c11328;
            }
            AbstractC16466 abstractC164619 = c11325;
            AbstractC16466 abstractC164620 = c11326;
            if (i3 < iArr3.length) {
                while (i3 < iArr3.length) {
                    abstractC16466Arr4[i5] = abstractC16466Arr2[i3];
                    iArrCopyOf[i5] = iArr3[i3];
                    i5++;
                    i3++;
                }
            } else {
                while (i4 < iArr4.length) {
                    abstractC16466Arr4[i5] = abstractC16466Arr3[i4];
                    iArrCopyOf[i5] = iArr4[i4];
                    i5++;
                    i4++;
                }
            }
            if (i5 < length2) {
                if (i5 == 1) {
                    AbstractC16466 abstractC16466M21315 = C8000.m21314(abstractC16466Arr4[0], iArrCopyOf[0]);
                    if (c11237 != null) {
                        c11237.m27811(abstractC164619, abstractC164620, abstractC16466M21315);
                    }
                    return abstractC16466M21315;
                }
                abstractC16466Arr4 = (AbstractC16466[]) Arrays.copyOf(abstractC16466Arr4, i5);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
            }
            c11321 = new C11320(abstractC16466Arr4, iArrCopyOf);
            if (c11321.equals(abstractC164619)) {
                if (c11237 != null) {
                    c11237.m27811(abstractC164619, abstractC164620, abstractC164619);
                }
                boolean z7 = C23313.f74933;
                return abstractC164619;
            }
            if (c11321.equals(abstractC164620)) {
                if (c11237 != null) {
                    c11237.m27811(abstractC164619, abstractC164620, abstractC164620);
                }
                boolean z8 = C23313.f74933;
                return abstractC164620;
            }
            HashMap map = new HashMap();
            for (AbstractC16466 abstractC164621 : abstractC16466Arr4) {
                if (!map.containsKey(abstractC164621)) {
                    map.put(abstractC164621, abstractC164621);
                }
            }
            for (int i8 = 0; i8 < abstractC16466Arr4.length; i8++) {
                abstractC16466Arr4[i8] = (AbstractC16466) map.get(abstractC16466Arr4[i8]);
            }
            if (c11237 != null) {
                c11237.m27811(abstractC164619, abstractC164620, c11321);
            }
            boolean z9 = C23313.f74933;
        }
        return c11321;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16466 m38771(AbstractC16466 abstractC16466, C17878 c17878, IdentityHashMap identityHashMap) {
        AbstractC16466 c11320;
        if (abstractC16466.mo27960()) {
            return abstractC16466;
        }
        AbstractC16466 abstractC16467 = (AbstractC16466) identityHashMap.get(abstractC16466);
        if (abstractC16467 != null) {
            return abstractC16467;
        }
        AbstractC16466 abstractC16466M41846 = c17878.m41846(abstractC16466);
        HashMap map = c17878.f54599;
        if (abstractC16466M41846 != null) {
            identityHashMap.put(abstractC16466, abstractC16466M41846);
            return abstractC16466M41846;
        }
        AbstractC16466[] abstractC16466Arr = new AbstractC16466[abstractC16466.mo21317()];
        boolean z = false;
        for (int i = 0; i < abstractC16466Arr.length; i++) {
            AbstractC16466 abstractC16466M38771 = m38771(abstractC16466.mo21315(i), c17878, identityHashMap);
            if (z || abstractC16466M38771 != abstractC16466.mo21315(i)) {
                if (!z) {
                    abstractC16466Arr = new AbstractC16466[abstractC16466.mo21317()];
                    for (int i2 = 0; i2 < abstractC16466.mo21317(); i2++) {
                        abstractC16466Arr[i2] = abstractC16466.mo21315(i2);
                    }
                    z = true;
                }
                abstractC16466Arr[i] = abstractC16466M38771;
            }
        }
        if (!z) {
            if (abstractC16466 != C21198.f68319 && ((AbstractC16466) map.get(abstractC16466)) == null) {
                map.put(abstractC16466, abstractC16466);
            }
            identityHashMap.put(abstractC16466, abstractC16466);
            return abstractC16466;
        }
        if (abstractC16466Arr.length == 0) {
            c11320 = C21198.f68319;
        } else if (abstractC16466Arr.length == 1) {
            c11320 = C8000.m21314(abstractC16466Arr[0], abstractC16466.mo21316(0));
        } else {
            c11320 = new C11320(abstractC16466Arr, ((C11320) abstractC16466).f33882);
        }
        if (c11320 != C21198.f68319 && ((AbstractC16466) map.get(c11320)) == null) {
            map.put(c11320, c11320);
        }
        identityHashMap.put(c11320, c11320);
        identityHashMap.put(abstractC16466, c11320);
        return c11320;
    }
}
