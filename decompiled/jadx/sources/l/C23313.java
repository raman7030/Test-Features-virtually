package l;

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
public class C23313 extends AbstractC11753 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean f74933;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5883[] f74934;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC9637 f74935;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EnumC23522 f74936;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8931 f74937;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1875 f74938;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5883 f74939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11237 f74940;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f74941;

    @Override // l.AbstractC11753
    /* JADX INFO: renamed from: ֫ */
    public final void mo12834() {
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo22944() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22942(C22336 c22336, AbstractC23041 abstractC23041, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (abstractC23041.f74150) {
            for (int i2 = 0; i2 < abstractC23041.f74151.size(); i2++) {
                AbstractC23041 abstractC23042 = abstractC23041.m51211(i2).f38806;
                if (m51700(abstractC23042, z3)) {
                    mo22942(c22336, abstractC23042, c13163, hashSet, z, z2, i, z3);
                } else {
                    mo22941(new C22336(c22336, abstractC23042, c22336.f72391, c22336.f72394), c13163, hashSet, z, z2, i, z3);
                }
            }
            return;
        }
        c13163.m31895(c22336, abstractC23041, c22336.f72391, c22336.f72394, this.f74940);
    }

    public C23313(AbstractC9637 abstractC9637, C21631 c21631, C5883[] c5883Arr, C17878 c17878) {
        super(c21631, c17878);
        this.f74936 = EnumC23522.LL;
        this.f74935 = abstractC9637;
        this.f74934 = c5883Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public int mo22933(int i, C1875 c1875, C8931 c8931) {
        C13643 c13643Mo22938;
        this.f74938 = c1875;
        this.f74941 = c1875.index();
        this.f74937 = c8931;
        C5883 c5883 = this.f74934[i];
        this.f74939 = c5883;
        c1875.mo6200();
        int i2 = this.f74941;
        try {
            if (c5883.m16470()) {
                c13643Mo22938 = c5883.m16468(this.f74935.m24556());
            } else {
                c13643Mo22938 = c5883.f18066;
            }
            if (c13643Mo22938 == null) {
                if (c8931 == null) {
                    c8931 = C8931.f27153;
                }
                C13163 c13163M51707 = m51707((AbstractC23041) c5883.f18062, C8931.f27153, false);
                if (c5883.m16470()) {
                    c5883.f18066.f40683 = c13163M51707;
                    c13643Mo22938 = mo22938(c5883, new C13643(m51706(c13163M51707)));
                    c5883.m16469(this.f74935.m24556(), c13643Mo22938);
                } else {
                    c13643Mo22938 = mo22938(c5883, new C13643(c13163M51707));
                    c5883.f18066 = c13643Mo22938;
                }
            }
            return m51703(c5883, c13643Mo22938, c1875, i2, c8931);
        } finally {
            this.f74940 = null;
            this.f74939 = null;
            c1875.mo6201(i2);
            c1875.getClass();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m51701(C13163 c13163) {
        int i = 0;
        for (C22336 c22336 : c13163.f39354) {
            if (i == 0) {
                i = c22336.f72390;
            } else if (c22336.f72390 != i) {
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51703(C5883 c5883, C13643 c13643, C1875 c1875, int i, C8931 c8931) {
        BitSet bitSet;
        int iMo6203 = c1875.mo6203(1);
        C13643 c13644 = c13643;
        while (true) {
            C13643 c13643Mo22937 = mo22937(iMo6203, c13644);
            if (c13643Mo22937 == null) {
                c13643Mo22937 = mo22939(c5883, c13644, iMo6203);
            }
            C13643 c13645 = c13643Mo22937;
            if (c13645 == AbstractC11753.f35088) {
                C20926 c20926M51711 = m51711(i, c1875, c8931);
                c1875.mo6201(i);
                int iM51704 = m51704(c13644.f40683, c8931);
                if (iM51704 != 0) {
                    return iM51704;
                }
                throw c20926M51711;
            }
            if (c13645.f40690 && this.f74936 != EnumC23522.SLL) {
                BitSet bitSet2 = c13645.f40683.f39353;
                if (c13645.f40688 != null) {
                    int iIndex = c1875.index();
                    if (iIndex != i) {
                        c1875.mo6201(i);
                    }
                    BitSet bitSetM51705 = m51705(c13645.f40688, c8931);
                    if (bitSetM51705.cardinality() == 1) {
                        return bitSetM51705.nextSetBit(0);
                    }
                    if (iIndex != i) {
                        c1875.mo6201(iIndex);
                    }
                    bitSet = bitSetM51705;
                } else {
                    bitSet = bitSet2;
                }
                C13163 c13163M51707 = m51707((AbstractC23041) c5883.f18062, c8931, true);
                C13163 c13163 = c13645.f40683;
                int iIndex2 = c1875.index();
                AbstractC9637 abstractC9637 = this.f74935;
                if (abstractC9637 != null) {
                    abstractC9637.m43461().mo17111(this.f74935, c5883, i, iIndex2, bitSet, c13163);
                }
                return mo22934(c5883, c13645, c13163M51707, c1875, i, c8931);
            }
            if (c13645.f40687) {
                if (c13645.f40688 == null) {
                    return c13645.f40686;
                }
                int iIndex3 = c1875.index();
                c1875.mo6201(i);
                BitSet bitSetM51706 = m51705(c13645.f40688, c8931);
                int iCardinality = bitSetM51706.cardinality();
                if (iCardinality == 0) {
                    throw m51711(i, c1875, c8931);
                }
                if (iCardinality == 1) {
                    return bitSetM51706.nextSetBit(0);
                }
                m51709(c5883, i, iIndex3, false, bitSetM51706, c13645.f40683);
                return bitSetM51706.nextSetBit(0);
            }
            if (iMo6203 != -1) {
                c1875.mo6204();
                iMo6203 = c1875.mo6203(1);
            }
            c13644 = c13645;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C13643 mo22937(int i, C13643 c13643) {
        int i2;
        C13643[] c13643Arr = c13643.f40685;
        if (c13643Arr == null || (i2 = i + 1) < 0 || i2 >= c13643Arr.length) {
            return null;
        }
        return c13643Arr[i2];
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[PHI: r10
      0x00ac: PHI (r10v1 l.ۚۜ֡) = (r10v3 l.ۚۜ֡), (r10v4 l.ۚۜ֡), (r10v5 l.ۚۜ֡) binds: [B:31:0x009a, B:32:0x009c, B:35:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public C13643 mo22939(C5883 c5883, C13643 c13643, int i) {
        BitSet bitSet;
        C13163 c13163Mo22935 = mo22935(c13643.f40683, i, false);
        if (c13163Mo22935 == null) {
            C13643 c13644 = AbstractC11753.f35088;
            m51708(c5883, c13643, i, c13644);
            return c13644;
        }
        C13643 c13645 = new C13643(c13163Mo22935);
        int iM51701 = m51701(c13163Mo22935);
        if (iM51701 != 0) {
            c13645.f40687 = true;
            c13645.f40683.f39357 = iM51701;
            c13645.f40686 = iM51701;
        } else if (mo22945(c13163Mo22935)) {
            c13645.f40683.f39353 = mo22943(c13163Mo22935);
            c13645.f40690 = true;
            c13645.f40687 = true;
            c13645.f40686 = c13645.f40683.f39353.nextSetBit(0);
        }
        if (c13645.f40687 && c13645.f40683.f39356) {
            int size = this.f35089.m48892(c5883.f18063).f74151.size();
            C13163 c13163 = c13645.f40683;
            if (c13163.f39357 != 0) {
                bitSet = new BitSet();
                bitSet.set(c13163.f39357);
            } else {
                bitSet = c13163.f39353;
            }
            AbstractC5178[] abstractC5178Arr = new AbstractC5178[size + 1];
            for (C22336 c22336 : c13645.f40683.f39354) {
                if (bitSet.get(c22336.f72390)) {
                    int i2 = c22336.f72390;
                    AbstractC5178 abstractC5178 = abstractC5178Arr[i2];
                    AbstractC5178 abstractC5179 = c22336.f72394;
                    AbstractC5178 abstractC51710 = abstractC5178;
                    if (abstractC5178 == null) {
                        abstractC51710 = abstractC5179;
                    } else if (abstractC5179 != null) {
                        C2356 c2356 = C2356.f7548;
                        if (abstractC5178 == c2356 || abstractC5179 == c2356) {
                            AbstractC5178 abstractC51711 = c2356;
                            abstractC51711 = c2356;
                            abstractC51710 = abstractC51711;
                        } else {
                            C3767 c3767 = new C3767(abstractC5178, abstractC5179);
                            AbstractC5178[] abstractC5178Arr2 = c3767.f11880;
                            abstractC51711 = c3767;
                            if (abstractC5178Arr2.length == 1) {
                                abstractC51710 = abstractC5178Arr2[0];
                            } else {
                                AbstractC5178 abstractC51712 = c2356;
                                abstractC51712 = c2356;
                                abstractC51710 = abstractC51712;
                            }
                        }
                    }
                    abstractC5178Arr[i2] = abstractC51710;
                }
            }
            int i3 = 0;
            for (int i4 = 1; i4 <= size; i4++) {
                AbstractC5178 abstractC51713 = abstractC5178Arr[i4];
                if (abstractC51713 == null) {
                    abstractC5178Arr[i4] = C2356.f7548;
                } else if (abstractC51713 != C2356.f7548) {
                    i3++;
                }
            }
            AbstractC5178[] abstractC5178Arr3 = abstractC5178Arr;
            if (i3 == 0) {
                abstractC5178Arr3 = null;
            }
            if (abstractC5178Arr3 == null) {
                c13645.f40686 = bitSet.nextSetBit(0);
            } else {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i5 = 1; i5 < abstractC5178Arr3.length; i5++) {
                    AbstractC5178 abstractC51714 = abstractC5178Arr3[i5];
                    if (bitSet != null && bitSet.get(i5)) {
                        C22816 c22816 = new C22816();
                        c22816.f73664 = i5;
                        c22816.f73665 = abstractC51714;
                        arrayList.add(c22816);
                    }
                    if (abstractC51714 != C2356.f7548) {
                        z = true;
                    }
                }
                c13645.f40688 = z ? (C22816[]) arrayList.toArray(new C22816[0]) : null;
                c13645.f40686 = 0;
            }
            if (c13645.f40688 != null) {
                c13645.f40686 = 0;
            }
        }
        return m51708(c5883, c13643, i, c13645);
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo22945(C13163 c13163) {
        return EnumC23522.m51952(this.f74936, c13163);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo22934(C5883 c5883, C13643 c13643, C13163 c13163, C1875 c1875, int i, C8931 c8931) {
        C13163 c13163Mo22935;
        int iM51963;
        boolean z;
        c1875.mo6201(i);
        int iMo6203 = c1875.mo6203(1);
        while (true) {
            c13163Mo22935 = mo22935(c13163, iMo6203, true);
            if (c13163Mo22935 == null) {
                C20926 c20926M51711 = m51711(i, c1875, c8931);
                c1875.mo6201(i);
                int iM51704 = m51704(c13163, c8931);
                if (iM51704 != 0) {
                    return iM51704;
                }
                throw c20926M51711;
            }
            Collection collectionM51960 = EnumC23522.m51960(c13163Mo22935);
            int iM51701 = m51701(c13163Mo22935);
            c13163Mo22935.f39357 = iM51701;
            if (iM51701 == 0) {
                if (this.f74936 != EnumC23522.LL_EXACT_AMBIG_DETECTION) {
                    iM51701 = EnumC23522.m51954(collectionM51960);
                    if (iM51701 != 0) {
                    }
                } else if (EnumC23522.m51950(collectionM51960) && EnumC23522.m51956(collectionM51960)) {
                    iM51963 = EnumC23522.m51963(collectionM51960);
                    z = true;
                    break;
                }
                if (iMo6203 != -1) {
                    c1875.mo6204();
                    iMo6203 = c1875.mo6203(1);
                }
                c13163 = c13163Mo22935;
            }
            iM51963 = iM51701;
            z = false;
            break;
        }
        if (c13163Mo22935.f39357 != 0) {
            m51710(c5883, iM51963, c13163Mo22935, i, c1875.index());
            return iM51963;
        }
        m51709(c5883, i, c1875.index(), z, c13163Mo22935.m31896(), c13163Mo22935);
        return iM51963;
    }

    /* JADX INFO: renamed from: ֫ */
    public C13163 mo22936(boolean z) {
        return new C13163(z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public C13163 mo22935(C13163 c13163, int i, boolean z) {
        C21631 c21631;
        int i2;
        if (this.f74940 == null) {
            this.f74940 = new C11237();
        }
        C13163 c13163Mo22936 = mo22936(z);
        ArrayList arrayList = c13163Mo22936.f39354;
        Iterator it = c13163.f39354.iterator();
        ArrayList arrayList2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c21631 = this.f35089;
            if (!zHasNext) {
                break;
            }
            C22336 c22336 = (C22336) it.next();
            AbstractC23041 abstractC23041 = c22336.f72393;
            if (!(abstractC23041 instanceof C9412)) {
                int i3 = 0;
                for (int size = abstractC23041.f74151.size(); i3 < size; size = size) {
                    AbstractC12938 abstractC12938M51211 = c22336.f72393.m51211(i3);
                    AbstractC23041 abstractC23042 = abstractC12938M51211.mo3364(i, c21631.f69448) ? abstractC12938M51211.f38806 : null;
                    if (abstractC23042 != null) {
                        c13163Mo22936.m31895(c22336, abstractC23042, c22336.f72391, c22336.f72394, this.f74940);
                    }
                    i3++;
                }
            } else if (z || i == -1) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c22336);
            }
        }
        C13163 c13164 = (arrayList2 != null || i == -1 || (arrayList.size() != 1 && m51701(c13163Mo22936) == 0)) ? null : c13163Mo22936;
        if (c13164 == null) {
            C13163 c13163Mo22937 = mo22936(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mo22941((C22336) it2.next(), c13163Mo22937, hashSet, false, z, 0, z2);
            }
            i2 = -1;
            c13164 = c13163Mo22937;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c13164 == c13163Mo22936;
            if (!EnumC23522.m51951(c13164)) {
                C13163 c13163Mo22938 = mo22936(c13164.f39358);
                for (C22336 c22337 : c13164.f39354) {
                    AbstractC23041 abstractC23043 = c22337.f72393;
                    if (!(abstractC23043 instanceof C9412)) {
                        if (z3 && abstractC23043.f74150 && c21631.m48894(abstractC23043).m52723(-2)) {
                            c13163Mo22938.m31895(c22337, c21631.f69450[c22337.f72393.f74154], c22337.f72391, c22337.f72394, this.f74940);
                        }
                    } else {
                        c13163Mo22938.m31894(c22337, this.f74940);
                    }
                }
                c13164 = c13163Mo22938;
            }
        }
        if (arrayList2 != null && (!z || !EnumC23522.m51962(c13164))) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c13164.m31894((C22336) it3.next(), this.f74940);
            }
        }
        if (c13164.f39354.isEmpty()) {
            return null;
        }
        return c13164;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 m51707(AbstractC23041 abstractC23041, C8931 c8931, boolean z) {
        C8000 c8000M38769 = AbstractC16466.m38769(this.f35089, c8931);
        C13163 c13163Mo22936 = mo22936(z);
        int i = 0;
        while (i < abstractC23041.f74151.size()) {
            int i2 = i + 1;
            mo22941(new C22336(abstractC23041.m51211(i).f38806, i2, c8000M38769), c13163Mo22936, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c13163Mo22936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 m51706(C13163 c13163) {
        AbstractC16466 abstractC16466;
        AbstractC5178 abstractC5178Mo11420;
        HashMap map = new HashMap();
        C13163 c13163Mo22936 = mo22936(c13163.f39358);
        ArrayList<C22336> arrayList = c13163.f39354;
        for (C22336 c22336 : arrayList) {
            int i = c22336.f72390;
            AbstractC5178 abstractC5178 = c22336.f72394;
            if (i == 1 && (abstractC5178Mo11420 = abstractC5178.mo11420(this.f74935, this.f74937)) != null) {
                map.put(Integer.valueOf(c22336.f72393.f74153), c22336.f72391);
                if (abstractC5178Mo11420 != abstractC5178) {
                    c13163Mo22936.m31895(c22336, c22336.f72393, c22336.f72391, abstractC5178Mo11420, this.f74940);
                } else {
                    c13163Mo22936.m31894(c22336, this.f74940);
                }
            }
        }
        for (C22336 c22337 : arrayList) {
            if (c22337.f72390 != 1 && ((c22337.f72392 & 1073741824) != 0 || (abstractC16466 = (AbstractC16466) map.get(Integer.valueOf(c22337.f72393.f74153))) == null || !abstractC16466.equals(c22337.f72391))) {
                c13163Mo22936.m31894(c22337, this.f74940);
            }
        }
        return c13163Mo22936;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m51702(C13163 c13163) {
        C23936 c23936 = new C23936(new int[0]);
        for (C22336 c22336 : c13163.f39354) {
            if ((c22336.f72392 & (-1073741825)) > 0 || ((c22336.f72393 instanceof C9412) && c22336.f72391.m38772())) {
                c23936.m52719(c22336.f72390);
            }
        }
        if (c23936.m52725() == 0) {
            return 0;
        }
        return c23936.m52717();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51704(C13163 c13163, C8931 c8931) {
        int iM51702;
        C13163 c13163Mo22936 = mo22936(c13163.f39358);
        C13163 c13163Mo22937 = mo22936(c13163.f39358);
        for (C22336 c22336 : c13163.f39354) {
            AbstractC5178 abstractC5178 = c22336.f72394;
            if (abstractC5178 == C2356.f7548 || abstractC5178.mo1496(this.f74935, c8931)) {
                c13163Mo22936.m31894(c22336, null);
            } else {
                c13163Mo22937.m31894(c22336, null);
            }
        }
        int iM51703 = m51702(c13163Mo22936);
        if (iM51703 != 0) {
            return iM51703;
        }
        if (c13163Mo22937.f39354.size() <= 0 || (iM51702 = m51702(c13163Mo22937)) == 0) {
            return 0;
        }
        return iM51702;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet m51705(C22816[] c22816Arr, C8931 c8931) {
        BitSet bitSet = new BitSet();
        for (C22816 c22816 : c22816Arr) {
            AbstractC5178 abstractC5178 = c22816.f73665;
            int i = c22816.f73664;
            if (abstractC5178 == C2356.f7548) {
                bitSet.set(i);
            } else if (abstractC5178.mo1496(this.f74935, c8931)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22941(C22336 c22336, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c22336.f72393 instanceof C9412) {
            if (!c22336.f72391.mo27960()) {
                for (int i2 = 0; i2 < c22336.f72391.mo21317(); i2++) {
                    if (c22336.f72391.mo21316(i2) != Integer.MAX_VALUE) {
                        C22336 c22337 = new C22336((AbstractC23041) this.f35089.f69449.get(c22336.f72391.mo21316(i2)), c22336.f72390, c22336.f72391.mo21315(i2), c22336.f72394);
                        c22337.f72392 = c22336.f72392;
                        mo22941(c22337, c13163, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c13163.m31895(c22336, c22336.f72393, C21198.f68319, c22336.f72394, this.f74940);
                    } else {
                        m51712(c22336, c13163, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c13163.m31894(c22336, this.f74940);
                return;
            }
        }
        m51712(c22336, c13163, hashSet, z, z2, i, z3);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51712(C22336 c22336, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        AbstractC12938 abstractC12938M51211;
        boolean z4;
        boolean z5;
        int iMo3363;
        C1650 c1650;
        C22336 c22337;
        C22336 c22338;
        C13163 c13164;
        int i2;
        int i3;
        C5883 c5883;
        C10823 c10823;
        C13163 c13165 = c13163;
        AbstractC23041 abstractC23041 = c22336.f72393;
        AbstractC5178 abstractC5178 = c22336.f72394;
        if (!abstractC23041.f74150) {
            c13165.m31894(c22336, this.f74940);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC23041.f74151.size()) {
            int i6 = 1;
            if (i5 != 0 || f74933 || abstractC23041.mo13211() != 10 || !((C22111) abstractC23041).f71785 || c22336.f72391.mo27960() || c22336.f72391.m38772()) {
                abstractC12938M51211 = abstractC23041.m51211(i5);
                if ((abstractC12938M51211 instanceof C2147) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!mo22944() && abstractC23041.f74150 && !(abstractC23041 instanceof C9412) && abstractC12938M51211.mo3363() == 1 && m51700(abstractC12938M51211.f38806, z3)) {
                    mo22942(c22336, abstractC12938M51211.f38806, c13163, hashSet, z4, z2, i, z3);
                    c13164 = c13165;
                } else {
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo3363 = abstractC12938M51211.mo3363();
                    AbstractC9637 abstractC9637 = this.f74935;
                    if (iMo3363 != 10) {
                        switch (iMo3363) {
                            case 1:
                                c22338 = new C22336(c22336, abstractC12938M51211.f38806, c22336.f72391, abstractC5178);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3 && abstractC12938M51211.mo3364(-1, 1)) {
                                    c22338 = new C22336(c22336, abstractC12938M51211.f38806, c22336.f72391, abstractC5178);
                                } else {
                                    c22338 = null;
                                }
                                break;
                            case 3:
                                C8706 c8706 = (C8706) abstractC12938M51211;
                                c22337 = new C22336(c22336, c8706.f38806, C8000.m21314(c22336.f72391, c8706.f26506.f74153), abstractC5178);
                                c22338 = c22337;
                                break;
                            case 4:
                                c10823 = (C10823) abstractC12938M51211;
                                int i7 = c10823.f32555;
                                int i8 = c10823.f32554;
                                boolean z6 = c10823.f32553;
                                if (!z4 || (z6 && (!z6 || !z5))) {
                                    c22338 = new C22336(c22336, c10823.f38806, c22336.f72391, abstractC5178);
                                } else if (!z2) {
                                    c22337 = new C22336(c22336, c10823.f38806, c22336.f72391, AbstractC5178.m14833(abstractC5178, new C0238(i8, i7, z6)));
                                    c22338 = c22337;
                                } else {
                                    int iIndex = this.f74938.index();
                                    this.f74938.mo6201(this.f74941);
                                    boolean zMo1496 = new C0238(i8, i7, z6).mo1496(abstractC9637, this.f74937);
                                    this.f74938.mo6201(iIndex);
                                    if (!zMo1496) {
                                        c22338 = null;
                                    } else {
                                        c22338 = new C22336(c22336, c10823.f38806, c22336.f72391, abstractC5178);
                                    }
                                }
                                break;
                            case 6:
                                c22338 = new C22336(c22336, ((C2147) abstractC12938M51211).f38806, c22336.f72391, abstractC5178);
                                break;
                            default:
                                c22338 = null;
                                break;
                        }
                    } else {
                        c1650 = (C1650) abstractC12938M51211;
                        int i9 = c1650.f5752;
                        if (z4 || !z5) {
                            c22337 = new C22336(c22336, c1650.f38806, c22336.f72391, abstractC5178);
                        } else if (z2) {
                            int iIndex2 = this.f74938.index();
                            this.f74938.mo6201(this.f74941);
                            boolean zMo24565 = abstractC9637.mo24565(new C19290(i9).f60696);
                            this.f74938.mo6201(iIndex2);
                            if (zMo24565) {
                                c22338 = new C22336(c22336, c1650.f38806, c22336.f72391, abstractC5178);
                            } else {
                                c22338 = null;
                            }
                        } else {
                            c22337 = new C22336(c22336, c1650.f38806, c22336.f72391, AbstractC5178.m14833(abstractC5178, new C19290(i9)));
                        }
                        c22338 = c22337;
                    }
                    if (c22338 == null) {
                        c13164 = c13163;
                    } else {
                        if (abstractC23041 instanceof C9412) {
                            c5883 = this.f74939;
                            if (c5883 != null && c5883.m16470() && ((C9909) abstractC12938M51211).m25016() == this.f74939.f18062.f74154) {
                                c22338.f72392 |= 1073741824;
                            }
                            c22338.f72392++;
                            if (hashSet.add(c22338)) {
                                c13164 = c13163;
                                c13164.f39359 = true;
                                i3 = i - 1;
                            } else {
                                c13164 = c13163;
                            }
                        } else {
                            c13164 = c13163;
                            if (!abstractC12938M51211.mo5546() || hashSet.add(c22338)) {
                                if ((abstractC12938M51211 instanceof C8706) || i < 0) {
                                    i2 = i;
                                } else {
                                    i3 = i + 1;
                                }
                                mo22941(c22338, c13163, hashSet, z4, z2, i2, z3);
                            }
                        }
                        i2 = i3;
                        mo22941(c22338, c13163, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iMo21317 = c22336.f72391.mo21317();
                int i10 = 0;
                while (true) {
                    C21631 c21631 = this.f35089;
                    if (i10 >= iMo21317) {
                        C14846 c14846 = (C14846) c21631.f69449.get(((AbstractC24019) abstractC23041.m51211(i4).f38806).f77840.f74153);
                        int i11 = 0;
                        while (true) {
                            if (i11 < iMo21317) {
                                AbstractC23041 abstractC23042 = (AbstractC23041) c21631.f69449.get(c22336.f72391.mo21316(i11));
                                if (abstractC23042.f74151.size() == i6 && abstractC23042.m51211(i4).mo5546()) {
                                    AbstractC23041 abstractC23043 = abstractC23042.m51211(i4).f38806;
                                    if ((abstractC23042.mo13211() == 8 && abstractC23043 == abstractC23041) || abstractC23042 == c14846 || abstractC23043 == c14846 || (abstractC23043.mo13211() == 8 && abstractC23043.f74151.size() == 1 && abstractC23043.m51211(0).mo5546() && abstractC23043.m51211(0).f38806 == abstractC23041)) {
                                        i4 = 0;
                                        i11++;
                                        i6 = 1;
                                    }
                                }
                            }
                            c13164 = c13165;
                        }
                    } else if (((AbstractC23041) c21631.f69449.get(c22336.f72391.mo21316(i10))).f74154 == abstractC23041.f74154) {
                        i10++;
                    }
                    abstractC12938M51211 = abstractC23041.m51211(i5);
                    if (abstractC12938M51211 instanceof C2147) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!mo22944()) {
                    }
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo3363 = abstractC12938M51211.mo3363();
                    AbstractC9637 abstractC9638 = this.f74935;
                    if (iMo3363 != 10) {
                        switch (iMo3363) {
                            case 1:
                                c22338 = new C22336(c22336, abstractC12938M51211.f38806, c22336.f72391, abstractC5178);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c22338 = null;
                                } else {
                                    c22338 = null;
                                }
                                break;
                            case 3:
                                C8706 c8707 = (C8706) abstractC12938M51211;
                                c22337 = new C22336(c22336, c8707.f38806, C8000.m21314(c22336.f72391, c8707.f26506.f74153), abstractC5178);
                                c22338 = c22337;
                                break;
                            case 4:
                                c10823 = (C10823) abstractC12938M51211;
                                int i12 = c10823.f32555;
                                int i13 = c10823.f32554;
                                boolean z7 = c10823.f32553;
                                if (!z4) {
                                    c22338 = new C22336(c22336, c10823.f38806, c22336.f72391, abstractC5178);
                                } else {
                                    c22338 = new C22336(c22336, c10823.f38806, c22336.f72391, abstractC5178);
                                }
                                break;
                            case 6:
                                c22338 = new C22336(c22336, ((C2147) abstractC12938M51211).f38806, c22336.f72391, abstractC5178);
                                break;
                            default:
                                c22338 = null;
                                break;
                        }
                    } else {
                        c1650 = (C1650) abstractC12938M51211;
                        int i14 = c1650.f5752;
                        if (z4) {
                            c22337 = new C22336(c22336, c1650.f38806, c22336.f72391, abstractC5178);
                            c22338 = c22337;
                        } else {
                            c22337 = new C22336(c22336, c1650.f38806, c22336.f72391, abstractC5178);
                            c22338 = c22337;
                        }
                    }
                    if (c22338 == null) {
                        c13164 = c13163;
                    } else {
                        if (abstractC23041 instanceof C9412) {
                            c5883 = this.f74939;
                            if (c5883 != null) {
                                c22338.f72392 |= 1073741824;
                            }
                            c22338.f72392++;
                            if (hashSet.add(c22338)) {
                                c13164 = c13163;
                            } else {
                                c13164 = c13163;
                                c13164.f39359 = true;
                                i3 = i - 1;
                            }
                        } else {
                            c13164 = c13163;
                            if (!abstractC12938M51211.mo5546()) {
                            }
                            if (abstractC12938M51211 instanceof C8706) {
                            }
                            i2 = i;
                            mo22941(c22338, c13163, hashSet, z4, z2, i2, z3);
                        }
                        i2 = i3;
                        mo22941(c22338, c13163, hashSet, z4, z2, i2, z3);
                    }
                }
            }
            c13165 = c13164;
            i5++;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51700(AbstractC23041 abstractC23041, boolean z) {
        if ((abstractC23041 instanceof C9412) || (abstractC23041 instanceof C22111)) {
            return false;
        }
        boolean z2 = abstractC23041.f74150;
        for (int i = 0; i < abstractC23041.f74151.size(); i++) {
            AbstractC12938 abstractC12938M51211 = abstractC23041.m51211(i);
            int iMo3363 = abstractC12938M51211.mo3363();
            if (z2) {
                if (iMo3363 != 1) {
                    return false;
                }
            } else {
                if (abstractC12938M51211.mo5546() || (z && ((iMo3363 == 5 || iMo3363 == 2 || iMo3363 == 7) && abstractC12938M51211.mo3364(-1, 1)))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public BitSet mo22943(C13163 c13163) {
        return EnumC23522.m51959(EnumC23522.m51960(c13163));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20926 m51711(int i, C1875 c1875, C8931 c8931) {
        return new C20926(this.f74935, c1875, c1875.m6213(i), c1875.mo6211(1), c8931);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 m51708(C5883 c5883, C13643 c13643, int i, C13643 c13644) {
        if (c13644 == null) {
            return null;
        }
        C13643 c13643Mo22938 = mo22938(c5883, c13644);
        if (c13643 == null || i < -1 || i > this.f35089.f69448) {
            return c13643Mo22938;
        }
        synchronized (c13643) {
            if (c13643.f40685 == null) {
                c13643.f40685 = new C13643[this.f35089.f69448 + 2];
            }
            c13643.f40685[i + 1] = c13643Mo22938;
        }
        return c13643Mo22938;
    }

    /* JADX INFO: renamed from: ֫ */
    public C13643 mo22938(C5883 c5883, C13643 c13643) {
        if (c13643 == AbstractC11753.f35088) {
            return c13643;
        }
        synchronized (c5883.f18065) {
            C13643 c13644 = (C13643) c5883.f18065.get(c13643);
            if (c13644 != null) {
                return c13644;
            }
            c13643.f40684 = c5883.f18065.size();
            C13163 c13163 = c13643.f40683;
            boolean z = c13163.f39355;
            if (!z) {
                ArrayList<C22336> arrayList = c13163.f39354;
                if (z) {
                    throw new IllegalStateException("This set is readonly");
                }
                if (!arrayList.isEmpty()) {
                    for (C22336 c22336 : arrayList) {
                        c22336.f72391 = mo22940(c22336.f72391);
                    }
                }
                c13643.f40683.m31897();
            }
            c5883.f18065.put(c13643, c13643);
            return c13643;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51710(C5883 c5883, int i, C13163 c13163, int i2, int i3) {
        AbstractC9637 abstractC9637 = this.f74935;
        if (abstractC9637 != null) {
            abstractC9637.m43461().mo17110(this.f74935, c5883, i2, i3, i, c13163);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51709(C5883 c5883, int i, int i2, boolean z, BitSet bitSet, C13163 c13163) {
        AbstractC9637 abstractC9637 = this.f74935;
        if (abstractC9637 != null) {
            abstractC9637.m43461().mo17112(this.f74935, c5883, i, i2, z, bitSet, c13163);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC23522 m51713() {
        return this.f74936;
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C12025());
        } catch (SecurityException unused) {
            str = null;
        }
        f74933 = Boolean.parseBoolean(str);
    }
}
