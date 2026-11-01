package p067l;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: AARN */
/* JADX INFO: loaded from: classes.dex */
public class C24525 extends AbstractC13538 {

    /* JADX INFO: renamed from: ܺ */
    public static final boolean f77680;

    /* JADX INFO: renamed from: ۜ */
    public final C7959[] f77681;

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC11527 f77682;

    /* JADX INFO: renamed from: ۢ */
    public EnumC24723 f77683;

    /* JADX INFO: renamed from: ܳ */
    public C10856 f77684;

    /* JADX INFO: renamed from: ܿ */
    public C4150 f77685;

    /* JADX INFO: renamed from: ᩳ */
    public C7959 f77686;

    /* JADX INFO: renamed from: ᩷ */
    public C13048 f77687;

    /* JADX INFO: renamed from: ᩻ */
    public int f77688;

    @Override // p067l.AbstractC13538
    /* JADX INFO: renamed from: ֫ */
    public final void mo14698() {
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo24915() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24913(C23596 c23596, AbstractC24266 abstractC24266, C14878 c14878, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (abstractC24266.f76892) {
            for (int i2 = 0; i2 < abstractC24266.f76893.size(); i2++) {
                AbstractC24266 abstractC24267 = abstractC24266.m53604(i2).f41850;
                if (m54097(abstractC24267, z3)) {
                    mo24913(c23596, abstractC24267, c14878, hashSet, z, z2, i, z3);
                } else {
                    mo24912(new C23596(c23596, abstractC24267, c23596.f75117, c23596.f75120), c14878, hashSet, z, z2, i, z3);
                }
            }
            return;
        }
        c14878.m33991(c23596, abstractC24266, c23596.f75117, c23596.f75120, this.f77687);
    }

    public C24525(AbstractC11527 abstractC11527, C22926 c22926, C7959[] c7959Arr, C19359 c19359) {
        super(c22926, c19359);
        this.f77683 = EnumC24723.LL;
        this.f77682 = abstractC11527;
        this.f77681 = c7959Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public int mo24904(int i, C4150 c4150, C10856 c10856) {
        C15334 c15334Mo24909;
        this.f77685 = c4150;
        this.f77688 = c4150.index();
        this.f77684 = c10856;
        C7959 c7959 = this.f77681[i];
        this.f77686 = c7959;
        c4150.mo8402();
        int i2 = this.f77688;
        try {
            if (c7959.m18396()) {
                c15334Mo24909 = c7959.m18394(this.f77682.m26570());
            } else {
                c15334Mo24909 = c7959.f20921;
            }
            if (c15334Mo24909 == null) {
                if (c10856 == null) {
                    c10856 = C10856.f30088;
                }
                C14878 c14878M54104 = m54104((AbstractC24266) c7959.f20917, C10856.f30088, false);
                if (c7959.m18396()) {
                    c7959.f20921.f43764 = c14878M54104;
                    c15334Mo24909 = mo24909(c7959, new C15334(m54103(c14878M54104)));
                    c7959.m18395(this.f77682.m26570(), c15334Mo24909);
                } else {
                    c15334Mo24909 = mo24909(c7959, new C15334(c14878M54104));
                    c7959.f20921 = c15334Mo24909;
                }
            }
            return m54100(c7959, c15334Mo24909, c4150, i2, c10856);
        } finally {
            this.f77687 = null;
            this.f77686 = null;
            c4150.mo8403(i2);
            c4150.getClass();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m54098(C14878 c14878) {
        int i = 0;
        for (C23596 c23596 : c14878.f42416) {
            if (i == 0) {
                i = c23596.f75116;
            } else if (c23596.f75116 != i) {
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54100(C7959 c7959, C15334 c15334, C4150 c4150, int i, C10856 c10856) {
        BitSet bitSet;
        int iMo8405 = c4150.mo8405(1);
        C15334 c15335 = c15334;
        while (true) {
            C15334 c15334Mo24908 = mo24908(iMo8405, c15335);
            if (c15334Mo24908 == null) {
                c15334Mo24908 = mo24910(c7959, c15335, iMo8405);
            }
            C15334 c15336 = c15334Mo24908;
            if (c15336 == AbstractC13538.f38087) {
                C22256 c22256M54108 = m54108(i, c4150, c10856);
                c4150.mo8403(i);
                int iM54101 = m54101(c15335.f43764, c10856);
                if (iM54101 != 0) {
                    return iM54101;
                }
                throw c22256M54108;
            }
            if (c15336.f43771 && this.f77683 != EnumC24723.SLL) {
                BitSet bitSet2 = c15336.f43764.f42415;
                if (c15336.f43769 != null) {
                    int iIndex = c4150.index();
                    if (iIndex != i) {
                        c4150.mo8403(i);
                    }
                    BitSet bitSetM54102 = m54102(c15336.f43769, c10856);
                    if (bitSetM54102.cardinality() == 1) {
                        return bitSetM54102.nextSetBit(0);
                    }
                    if (iIndex != i) {
                        c4150.mo8403(iIndex);
                    }
                    bitSet = bitSetM54102;
                } else {
                    bitSet = bitSet2;
                }
                C14878 c14878M54104 = m54104((AbstractC24266) c7959.f20917, c10856, true);
                C14878 c14878 = c15336.f43764;
                int iIndex2 = c4150.index();
                AbstractC11527 abstractC11527 = this.f77682;
                if (abstractC11527 != null) {
                    abstractC11527.m45730().mo19043(this.f77682, c7959, i, iIndex2, bitSet, c14878);
                }
                return mo24905(c7959, c15336, c14878M54104, c4150, i, c10856);
            }
            if (c15336.f43768) {
                if (c15336.f43769 == null) {
                    return c15336.f43767;
                }
                int iIndex3 = c4150.index();
                c4150.mo8403(i);
                BitSet bitSetM54103 = m54102(c15336.f43769, c10856);
                int iCardinality = bitSetM54103.cardinality();
                if (iCardinality == 0) {
                    throw m54108(i, c4150, c10856);
                }
                if (iCardinality == 1) {
                    return bitSetM54103.nextSetBit(0);
                }
                m54106(c7959, i, iIndex3, false, bitSetM54103, c15336.f43764);
                return bitSetM54103.nextSetBit(0);
            }
            if (iMo8405 != -1) {
                c4150.mo8406();
                iMo8405 = c4150.mo8405(1);
            }
            c15335 = c15336;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C15334 mo24908(int i, C15334 c15334) {
        int i2;
        C15334[] c15334Arr = c15334.f43766;
        if (c15334Arr == null || (i2 = i + 1) < 0 || i2 >= c15334Arr.length) {
            return null;
        }
        return c15334Arr[i2];
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[PHI: r10
      0x00ac: PHI (r10v1 l.ۚۜ֡) = (r10v3 l.ۚۜ֡), (r10v4 l.ۚۜ֡), (r10v5 l.ۚۜ֡) binds: [B:31:0x009a, B:32:0x009c, B:35:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public C15334 mo24910(C7959 c7959, C15334 c15334, int i) {
        BitSet bitSet;
        C14878 c14878Mo24906 = mo24906(c15334.f43764, i, false);
        if (c14878Mo24906 == null) {
            C15334 c15335 = AbstractC13538.f38087;
            m54105(c7959, c15334, i, c15335);
            return c15335;
        }
        C15334 c15336 = new C15334(c14878Mo24906);
        int iM54098 = m54098(c14878Mo24906);
        if (iM54098 != 0) {
            c15336.f43768 = true;
            c15336.f43764.f42419 = iM54098;
            c15336.f43767 = iM54098;
        } else if (mo24916(c14878Mo24906)) {
            c15336.f43764.f42415 = mo24914(c14878Mo24906);
            c15336.f43771 = true;
            c15336.f43768 = true;
            c15336.f43767 = c15336.f43764.f42415.nextSetBit(0);
        }
        if (c15336.f43768 && c15336.f43764.f42418) {
            int size = this.f38088.m51240(c7959.f20918).f76893.size();
            C14878 c14878 = c15336.f43764;
            if (c14878.f42419 != 0) {
                bitSet = new BitSet();
                bitSet.set(c14878.f42419);
            } else {
                bitSet = c14878.f42415;
            }
            AbstractC7289[] abstractC7289Arr = new AbstractC7289[size + 1];
            for (C23596 c23596 : c15336.f43764.f42416) {
                if (bitSet.get(c23596.f75116)) {
                    int i2 = c23596.f75116;
                    AbstractC7289 abstractC7289 = abstractC7289Arr[i2];
                    AbstractC7289 abstractC72810 = c23596.f75120;
                    AbstractC7289 abstractC72811 = abstractC7289;
                    if (abstractC7289 == null) {
                        abstractC72811 = abstractC72810;
                    } else if (abstractC72810 != null) {
                        C4607 c4607 = C4607.f10339;
                        if (abstractC7289 == c4607 || abstractC72810 == c4607) {
                            AbstractC7289 abstractC72812 = c4607;
                            abstractC72812 = c4607;
                            abstractC72811 = abstractC72812;
                        } else {
                            C5948 c5948 = new C5948(abstractC7289, abstractC72810);
                            AbstractC7289[] abstractC7289Arr2 = c5948.f14686;
                            abstractC72812 = c5948;
                            if (abstractC7289Arr2.length == 1) {
                                abstractC72811 = abstractC7289Arr2[0];
                            } else {
                                AbstractC7289 abstractC72813 = c4607;
                                abstractC72813 = c4607;
                                abstractC72811 = abstractC72813;
                            }
                        }
                    }
                    abstractC7289Arr[i2] = abstractC72811;
                }
            }
            int i3 = 0;
            for (int i4 = 1; i4 <= size; i4++) {
                AbstractC7289 abstractC72814 = abstractC7289Arr[i4];
                if (abstractC72814 == null) {
                    abstractC7289Arr[i4] = C4607.f10339;
                } else if (abstractC72814 != C4607.f10339) {
                    i3++;
                }
            }
            AbstractC7289[] abstractC7289Arr3 = abstractC7289Arr;
            if (i3 == 0) {
                abstractC7289Arr3 = null;
            }
            if (abstractC7289Arr3 == null) {
                c15336.f43767 = bitSet.nextSetBit(0);
            } else {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i5 = 1; i5 < abstractC7289Arr3.length; i5++) {
                    AbstractC7289 abstractC72815 = abstractC7289Arr3[i5];
                    if (bitSet != null && bitSet.get(i5)) {
                        C24052 c24052 = new C24052();
                        c24052.f76396 = i5;
                        c24052.f76397 = abstractC72815;
                        arrayList.add(c24052);
                    }
                    if (abstractC72815 != C4607.f10339) {
                        z = true;
                    }
                }
                c15336.f43769 = z ? (C24052[]) arrayList.toArray(new C24052[0]) : null;
                c15336.f43767 = 0;
            }
            if (c15336.f43769 != null) {
                c15336.f43767 = 0;
            }
        }
        return m54105(c7959, c15334, i, c15336);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo24916(C14878 c14878) {
        return EnumC24723.m54354(this.f77683, c14878);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo24905(C7959 c7959, C15334 c15334, C14878 c14878, C4150 c4150, int i, C10856 c10856) {
        C14878 c14878Mo24906;
        int iM54365;
        boolean z;
        c4150.mo8403(i);
        int iMo8405 = c4150.mo8405(1);
        while (true) {
            c14878Mo24906 = mo24906(c14878, iMo8405, true);
            if (c14878Mo24906 == null) {
                C22256 c22256M54108 = m54108(i, c4150, c10856);
                c4150.mo8403(i);
                int iM54101 = m54101(c14878, c10856);
                if (iM54101 != 0) {
                    return iM54101;
                }
                throw c22256M54108;
            }
            Collection collectionM54362 = EnumC24723.m54362(c14878Mo24906);
            int iM54098 = m54098(c14878Mo24906);
            c14878Mo24906.f42419 = iM54098;
            if (iM54098 == 0) {
                if (this.f77683 != EnumC24723.LL_EXACT_AMBIG_DETECTION) {
                    iM54098 = EnumC24723.m54356(collectionM54362);
                    if (iM54098 != 0) {
                    }
                } else if (EnumC24723.m54352(collectionM54362) && EnumC24723.m54358(collectionM54362)) {
                    iM54365 = EnumC24723.m54365(collectionM54362);
                    z = true;
                    break;
                }
                if (iMo8405 != -1) {
                    c4150.mo8406();
                    iMo8405 = c4150.mo8405(1);
                }
                c14878 = c14878Mo24906;
            }
            iM54365 = iM54098;
            z = false;
            break;
        }
        if (c14878Mo24906.f42419 != 0) {
            m54107(c7959, iM54365, c14878Mo24906, i, c4150.index());
            return iM54365;
        }
        m54106(c7959, i, c4150.index(), z, c14878Mo24906.m33992(), c14878Mo24906);
        return iM54365;
    }

    /* JADX INFO: renamed from: ֫ */
    public C14878 mo24907(boolean z) {
        return new C14878(z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public C14878 mo24906(C14878 c14878, int i, boolean z) {
        C22926 c22926;
        int i2;
        if (this.f77687 == null) {
            this.f77687 = new C13048();
        }
        C14878 c14878Mo24907 = mo24907(z);
        ArrayList arrayList = c14878Mo24907.f42416;
        Iterator it = c14878.f42416.iterator();
        ArrayList arrayList2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c22926 = this.f38088;
            if (!zHasNext) {
                break;
            }
            C23596 c23596 = (C23596) it.next();
            AbstractC24266 abstractC24266 = c23596.f75119;
            if (!(abstractC24266 instanceof C11313)) {
                int i3 = 0;
                for (int size = abstractC24266.f76893.size(); i3 < size; size = size) {
                    AbstractC14664 abstractC14664M53604 = c23596.f75119.m53604(i3);
                    AbstractC24266 abstractC24267 = abstractC14664M53604.mo5683(i, c22926.f72151) ? abstractC14664M53604.f41850 : null;
                    if (abstractC24267 != null) {
                        c14878Mo24907.m33991(c23596, abstractC24267, c23596.f75117, c23596.f75120, this.f77687);
                    }
                    i3++;
                }
            } else if (z || i == -1) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c23596);
            }
        }
        C14878 c14879 = (arrayList2 != null || i == -1 || (arrayList.size() != 1 && m54098(c14878Mo24907) == 0)) ? null : c14878Mo24907;
        if (c14879 == null) {
            C14878 c14878Mo24908 = mo24907(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mo24912((C23596) it2.next(), c14878Mo24908, hashSet, false, z, 0, z2);
            }
            i2 = -1;
            c14879 = c14878Mo24908;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c14879 == c14878Mo24907;
            if (!EnumC24723.m54353(c14879)) {
                C14878 c14878Mo24909 = mo24907(c14879.f42420);
                for (C23596 c23597 : c14879.f42416) {
                    AbstractC24266 abstractC24268 = c23597.f75119;
                    if (!(abstractC24268 instanceof C11313)) {
                        if (z3 && abstractC24268.f76892 && c22926.m51242(abstractC24268).m55129(-2)) {
                            c14878Mo24909.m33991(c23597, c22926.f72153[c23597.f75119.f76896], c23597.f75117, c23597.f75120, this.f77687);
                        }
                    } else {
                        c14878Mo24909.m33990(c23597, this.f77687);
                    }
                }
                c14879 = c14878Mo24909;
            }
        }
        if (arrayList2 != null && (!z || !EnumC24723.m54364(c14879))) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c14879.m33990((C23596) it3.next(), this.f77687);
            }
        }
        if (c14879.f42416.isEmpty()) {
            return null;
        }
        return c14879;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14878 m54104(AbstractC24266 abstractC24266, C10856 c10856, boolean z) {
        C9971 c9971M40995 = AbstractC18017.m40995(this.f38088, c10856);
        C14878 c14878Mo24907 = mo24907(z);
        int i = 0;
        while (i < abstractC24266.f76893.size()) {
            int i2 = i + 1;
            mo24912(new C23596(abstractC24266.m53604(i).f41850, i2, c9971M40995), c14878Mo24907, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c14878Mo24907;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14878 m54103(C14878 c14878) {
        AbstractC18017 abstractC18017;
        AbstractC7289 abstractC7289Mo13356;
        HashMap map = new HashMap();
        C14878 c14878Mo24907 = mo24907(c14878.f42420);
        ArrayList<C23596> arrayList = c14878.f42416;
        for (C23596 c23596 : arrayList) {
            int i = c23596.f75116;
            AbstractC7289 abstractC7289 = c23596.f75120;
            if (i == 1 && (abstractC7289Mo13356 = abstractC7289.mo13356(this.f77682, this.f77684)) != null) {
                map.put(Integer.valueOf(c23596.f75119.f76895), c23596.f75117);
                if (abstractC7289Mo13356 != abstractC7289) {
                    c14878Mo24907.m33991(c23596, c23596.f75119, c23596.f75117, abstractC7289Mo13356, this.f77687);
                } else {
                    c14878Mo24907.m33990(c23596, this.f77687);
                }
            }
        }
        for (C23596 c23597 : arrayList) {
            if (c23597.f75116 != 1 && ((c23597.f75118 & 1073741824) != 0 || (abstractC18017 = (AbstractC18017) map.get(Integer.valueOf(c23597.f75119.f76895))) == null || !abstractC18017.equals(c23597.f75117))) {
                c14878Mo24907.m33990(c23597, this.f77687);
            }
        }
        return c14878Mo24907;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m54099(C14878 c14878) {
        C25117 c25117 = new C25117(new int[0]);
        for (C23596 c23596 : c14878.f42416) {
            if ((c23596.f75118 & (-1073741825)) > 0 || ((c23596.f75119 instanceof C11313) && c23596.f75117.m40998())) {
                c25117.m55125(c23596.f75116);
            }
        }
        if (c25117.m55131() == 0) {
            return 0;
        }
        return c25117.m55123();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54101(C14878 c14878, C10856 c10856) {
        int iM54099;
        C14878 c14878Mo24907 = mo24907(c14878.f42420);
        C14878 c14878Mo24908 = mo24907(c14878.f42420);
        for (C23596 c23596 : c14878.f42416) {
            AbstractC7289 abstractC7289 = c23596.f75120;
            if (abstractC7289 == C4607.f10339 || abstractC7289.mo3894(this.f77682, c10856)) {
                c14878Mo24907.m33990(c23596, null);
            } else {
                c14878Mo24908.m33990(c23596, null);
            }
        }
        int iM540910 = m54099(c14878Mo24907);
        if (iM540910 != 0) {
            return iM540910;
        }
        if (c14878Mo24908.f42416.size() <= 0 || (iM54099 = m54099(c14878Mo24908)) == 0) {
            return 0;
        }
        return iM54099;
    }

    /* JADX INFO: renamed from: ֫ */
    public final BitSet m54102(C24052[] c24052Arr, C10856 c10856) {
        BitSet bitSet = new BitSet();
        for (C24052 c24052 : c24052Arr) {
            AbstractC7289 abstractC7289 = c24052.f76397;
            int i = c24052.f76396;
            if (abstractC7289 == C4607.f10339) {
                bitSet.set(i);
            } else if (abstractC7289.mo3894(this.f77682, c10856)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24912(C23596 c23596, C14878 c14878, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c23596.f75119 instanceof C11313) {
            if (!c23596.f75117.mo30021()) {
                for (int i2 = 0; i2 < c23596.f75117.mo23283(); i2++) {
                    if (c23596.f75117.mo23282(i2) != Integer.MAX_VALUE) {
                        C23596 c23597 = new C23596((AbstractC24266) this.f38088.f72152.get(c23596.f75117.mo23282(i2)), c23596.f75116, c23596.f75117.mo23281(i2), c23596.f75120);
                        c23597.f75118 = c23596.f75118;
                        mo24912(c23597, c14878, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c14878.m33991(c23596, c23596.f75119, C22515.f71002, c23596.f75120, this.f77687);
                    } else {
                        m54109(c23596, c14878, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c14878.m33990(c23596, this.f77687);
                return;
            }
        }
        m54109(c23596, c14878, hashSet, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0217  */
    /* JADX WARN: Code duplicated, block: B:108:0x022c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0268  */
    /* JADX WARN: Code duplicated, block: B:123:0x026f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0299  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e3  */
    /* JADX INFO: renamed from: ۧ */
    public final void m54109(C23596 c23596, C14878 c14878, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        AbstractC14664 abstractC14664M53604;
        boolean z4;
        boolean z5;
        int iMo5682;
        C3936 c3936;
        C23596 c23597;
        C23596 c23598;
        C14878 c14879;
        int i2;
        int i3;
        C7959 c7959;
        C12654 c12654;
        C14878 c148710 = c14878;
        AbstractC24266 abstractC24266 = c23596.f75119;
        AbstractC7289 abstractC7289 = c23596.f75120;
        if (!abstractC24266.f76892) {
            c148710.m33990(c23596, this.f77687);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC24266.f76893.size()) {
            int i6 = 1;
            if (i5 != 0 || f77680 || abstractC24266.mo15093() != 10 || !((C23382) abstractC24266).f74507 || c23596.f75117.mo30021() || c23596.f75117.m40998()) {
                abstractC14664M53604 = abstractC24266.m53604(i5);
                if ((abstractC14664M53604 instanceof C4409) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!mo24915() && abstractC24266.f76892 && !(abstractC24266 instanceof C11313) && abstractC14664M53604.mo5682() == 1 && m54097(abstractC14664M53604.f41850, z3)) {
                    mo24913(c23596, abstractC14664M53604.f41850, c14878, hashSet, z4, z2, i, z3);
                    c14879 = c148710;
                } else {
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo5682 = abstractC14664M53604.mo5682();
                    AbstractC11527 abstractC11527 = this.f77682;
                    if (iMo5682 != 10) {
                        switch (iMo5682) {
                            case 1:
                                c23598 = new C23596(c23596, abstractC14664M53604.f41850, c23596.f75117, abstractC7289);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3 && abstractC14664M53604.mo5683(-1, 1)) {
                                    c23598 = new C23596(c23596, abstractC14664M53604.f41850, c23596.f75117, abstractC7289);
                                } else {
                                    c23598 = null;
                                }
                                break;
                            case 3:
                                C10642 c10642 = (C10642) abstractC14664M53604;
                                c23597 = new C23596(c23596, c10642.f41850, C9971.m23280(c23596.f75117, c10642.f29431.f76895), abstractC7289);
                                c23598 = c23597;
                                break;
                            case 4:
                                c12654 = (C12654) abstractC14664M53604;
                                int i7 = c12654.f35531;
                                int i8 = c12654.f35530;
                                boolean z6 = c12654.f35529;
                                if (!z4 || (z6 && (!z6 || !z5))) {
                                    c23598 = new C23596(c23596, c12654.f41850, c23596.f75117, abstractC7289);
                                } else if (!z2) {
                                    c23597 = new C23596(c23596, c12654.f41850, c23596.f75117, AbstractC7289.m16743(abstractC7289, new C2594(i8, i7, z6)));
                                    c23598 = c23597;
                                } else {
                                    int iIndex = this.f77685.index();
                                    this.f77685.mo8403(this.f77688);
                                    boolean zMo3894 = new C2594(i8, i7, z6).mo3894(abstractC11527, this.f77684);
                                    this.f77685.mo8403(iIndex);
                                    if (!zMo3894) {
                                        c23598 = null;
                                    } else {
                                        c23598 = new C23596(c23596, c12654.f41850, c23596.f75117, abstractC7289);
                                    }
                                }
                                break;
                            case 6:
                                c23598 = new C23596(c23596, ((C4409) abstractC14664M53604).f41850, c23596.f75117, abstractC7289);
                                break;
                            default:
                                c23598 = null;
                                break;
                        }
                    } else {
                        c3936 = (C3936) abstractC14664M53604;
                        int i9 = c3936.f8532;
                        if (z4 || !z5) {
                            c23597 = new C23596(c23596, c3936.f41850, c23596.f75117, abstractC7289);
                        } else if (z2) {
                            int iIndex2 = this.f77685.index();
                            this.f77685.mo8403(this.f77688);
                            boolean zMo26579 = abstractC11527.mo26579(new C20701(i9).f63926);
                            this.f77685.mo8403(iIndex2);
                            if (zMo26579) {
                                c23598 = new C23596(c23596, c3936.f41850, c23596.f75117, abstractC7289);
                            } else {
                                c23598 = null;
                            }
                        } else {
                            c23597 = new C23596(c23596, c3936.f41850, c23596.f75117, AbstractC7289.m16743(abstractC7289, new C20701(i9)));
                        }
                        c23598 = c23597;
                    }
                    if (c23598 == null) {
                        c14879 = c14878;
                    } else {
                        if (abstractC24266 instanceof C11313) {
                            c7959 = this.f77686;
                            if (c7959 != null && c7959.m18396() && ((C11786) abstractC14664M53604).m27033() == this.f77686.f20917.f76896) {
                                c23598.f75118 |= 1073741824;
                            }
                            c23598.f75118++;
                            if (hashSet.add(c23598)) {
                                c14879 = c14878;
                                c14879.f42421 = true;
                                i3 = i - 1;
                            } else {
                                c14879 = c14878;
                            }
                        } else {
                            c14879 = c14878;
                            if (!abstractC14664M53604.mo7776() || hashSet.add(c23598)) {
                                if ((abstractC14664M53604 instanceof C10642) || i < 0) {
                                    i2 = i;
                                } else {
                                    i3 = i + 1;
                                }
                                mo24912(c23598, c14878, hashSet, z4, z2, i2, z3);
                            }
                        }
                        i2 = i3;
                        mo24912(c23598, c14878, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iMo23283 = c23596.f75117.mo23283();
                int i10 = 0;
                while (true) {
                    C22926 c22926 = this.f38088;
                    if (i10 >= iMo23283) {
                        C16478 c16478 = (C16478) c22926.f72152.get(((AbstractC25196) abstractC24266.m53604(i4).f41850).f80592.f76895);
                        int i11 = 0;
                        while (true) {
                            if (i11 < iMo23283) {
                                AbstractC24266 abstractC24267 = (AbstractC24266) c22926.f72152.get(c23596.f75117.mo23282(i11));
                                if (abstractC24267.f76893.size() == i6 && abstractC24267.m53604(i4).mo7776()) {
                                    AbstractC24266 abstractC24268 = abstractC24267.m53604(i4).f41850;
                                    if ((abstractC24267.mo15093() == 8 && abstractC24268 == abstractC24266) || abstractC24267 == c16478 || abstractC24268 == c16478 || (abstractC24268.mo15093() == 8 && abstractC24268.f76893.size() == 1 && abstractC24268.m53604(0).mo7776() && abstractC24268.m53604(0).f41850 == abstractC24266)) {
                                        i4 = 0;
                                        i11++;
                                        i6 = 1;
                                    }
                                }
                            }
                            c14879 = c148710;
                        }
                    } else if (((AbstractC24266) c22926.f72152.get(c23596.f75117.mo23282(i10))).f76896 == abstractC24266.f76896) {
                        i10++;
                    }
                    abstractC14664M53604 = abstractC24266.m53604(i5);
                    if (abstractC14664M53604 instanceof C4409) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!mo24915()) {
                    }
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo5682 = abstractC14664M53604.mo5682();
                    AbstractC11527 abstractC11528 = this.f77682;
                    if (iMo5682 != 10) {
                        switch (iMo5682) {
                            case 1:
                                c23598 = new C23596(c23596, abstractC14664M53604.f41850, c23596.f75117, abstractC7289);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c23598 = null;
                                } else {
                                    c23598 = null;
                                }
                                break;
                            case 3:
                                C10642 c10643 = (C10642) abstractC14664M53604;
                                c23597 = new C23596(c23596, c10643.f41850, C9971.m23280(c23596.f75117, c10643.f29431.f76895), abstractC7289);
                                c23598 = c23597;
                                break;
                            case 4:
                                c12654 = (C12654) abstractC14664M53604;
                                int i12 = c12654.f35531;
                                int i13 = c12654.f35530;
                                boolean z7 = c12654.f35529;
                                if (!z4) {
                                    c23598 = new C23596(c23596, c12654.f41850, c23596.f75117, abstractC7289);
                                } else {
                                    c23598 = new C23596(c23596, c12654.f41850, c23596.f75117, abstractC7289);
                                }
                                break;
                            case 6:
                                c23598 = new C23596(c23596, ((C4409) abstractC14664M53604).f41850, c23596.f75117, abstractC7289);
                                break;
                            default:
                                c23598 = null;
                                break;
                        }
                    } else {
                        c3936 = (C3936) abstractC14664M53604;
                        int i14 = c3936.f8532;
                        if (z4) {
                            c23597 = new C23596(c23596, c3936.f41850, c23596.f75117, abstractC7289);
                            c23598 = c23597;
                        } else {
                            c23597 = new C23596(c23596, c3936.f41850, c23596.f75117, abstractC7289);
                            c23598 = c23597;
                        }
                    }
                    if (c23598 == null) {
                        c14879 = c14878;
                    } else {
                        if (abstractC24266 instanceof C11313) {
                            c7959 = this.f77686;
                            if (c7959 != null) {
                                c23598.f75118 |= 1073741824;
                            }
                            c23598.f75118++;
                            if (hashSet.add(c23598)) {
                                c14879 = c14878;
                            } else {
                                c14879 = c14878;
                                c14879.f42421 = true;
                                i3 = i - 1;
                            }
                        } else {
                            c14879 = c14878;
                            if (!abstractC14664M53604.mo7776()) {
                            }
                            if (abstractC14664M53604 instanceof C10642) {
                            }
                            i2 = i;
                            mo24912(c23598, c14878, hashSet, z4, z2, i2, z3);
                        }
                        i2 = i3;
                        mo24912(c23598, c14878, hashSet, z4, z2, i2, z3);
                    }
                }
            }
            c148710 = c14879;
            i5++;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54097(AbstractC24266 abstractC24266, boolean z) {
        if ((abstractC24266 instanceof C11313) || (abstractC24266 instanceof C23382)) {
            return false;
        }
        boolean z2 = abstractC24266.f76892;
        for (int i = 0; i < abstractC24266.f76893.size(); i++) {
            AbstractC14664 abstractC14664M53604 = abstractC24266.m53604(i);
            int iMo5682 = abstractC14664M53604.mo5682();
            if (z2) {
                if (iMo5682 != 1) {
                    return false;
                }
            } else {
                if (abstractC14664M53604.mo7776() || (z && ((iMo5682 == 5 || iMo5682 == 2 || iMo5682 == 7) && abstractC14664M53604.mo5683(-1, 1)))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public BitSet mo24914(C14878 c14878) {
        return EnumC24723.m54361(EnumC24723.m54362(c14878));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22256 m54108(int i, C4150 c4150, C10856 c10856) {
        return new C22256(this.f77682, c4150, c4150.m8415(i), c4150.mo8413(1), c10856);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15334 m54105(C7959 c7959, C15334 c15334, int i, C15334 c15335) {
        if (c15335 == null) {
            return null;
        }
        C15334 c15334Mo24909 = mo24909(c7959, c15335);
        if (c15334 == null || i < -1 || i > this.f38088.f72151) {
            return c15334Mo24909;
        }
        synchronized (c15334) {
            if (c15334.f43766 == null) {
                c15334.f43766 = new C15334[this.f38088.f72151 + 2];
            }
            c15334.f43766[i + 1] = c15334Mo24909;
        }
        return c15334Mo24909;
    }

    /* JADX INFO: renamed from: ֫ */
    public C15334 mo24909(C7959 c7959, C15334 c15334) {
        if (c15334 == AbstractC13538.f38087) {
            return c15334;
        }
        synchronized (c7959.f20920) {
            C15334 c15335 = (C15334) c7959.f20920.get(c15334);
            if (c15335 != null) {
                return c15335;
            }
            c15334.f43765 = c7959.f20920.size();
            C14878 c14878 = c15334.f43764;
            boolean z = c14878.f42417;
            if (!z) {
                ArrayList<C23596> arrayList = c14878.f42416;
                if (z) {
                    throw new IllegalStateException("This set is readonly");
                }
                if (!arrayList.isEmpty()) {
                    for (C23596 c23596 : arrayList) {
                        c23596.f75117 = mo24911(c23596.f75117);
                    }
                }
                c15334.f43764.m33993();
            }
            c7959.f20920.put(c15334, c15334);
            return c15334;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54107(C7959 c7959, int i, C14878 c14878, int i2, int i3) {
        AbstractC11527 abstractC11527 = this.f77682;
        if (abstractC11527 != null) {
            abstractC11527.m45730().mo19042(this.f77682, c7959, i2, i3, i, c14878);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54106(C7959 c7959, int i, int i2, boolean z, BitSet bitSet, C14878 c14878) {
        AbstractC11527 abstractC11527 = this.f77682;
        if (abstractC11527 != null) {
            abstractC11527.m45730().mo19044(this.f77682, c7959, i, i2, z, bitSet, c14878);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC24723 m54110() {
        return this.f77683;
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C13797());
        } catch (SecurityException unused) {
            str = null;
        }
        f77680 = Boolean.parseBoolean(str);
    }
}
