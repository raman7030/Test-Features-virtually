package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12175 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Comparator f36312 = new C3003();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0225 f36314 = new C0225();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f36313 = new C0225(200);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29652(C5637 c5637) {
        C12880[] c12880Arr;
        int i;
        int i2;
        C0225 c0225;
        C12880[] c12880Arr2;
        Iterator it;
        Iterator it2;
        C12880[] c12880Arr3;
        Iterator it3;
        C11011 c11011;
        ArrayList<C18274> arrayList = c5637.f17415;
        if (arrayList.size() == 0) {
            return;
        }
        C1838 c1838 = new C1838(c5637);
        c1838.m19277();
        int iM6108 = c1838.m6108();
        C12880[] c12880Arr4 = new C12880[iM6108];
        for (C18274 c18274 : arrayList) {
            C12880 c12880 = new C12880();
            char cCharAt = c18274.f25746.charAt(0);
            if (cCharAt == '[') {
                cCharAt = 'L';
            }
            c12880.f38659 = cCharAt;
            c18274.f25748 = c12880;
            c12880Arr4[c18274.f56817] = c12880;
        }
        if (c5637.f17413) {
            c12880Arr = new C12880[c5637.f17410.length];
        } else {
            c12880Arr = new C12880[c5637.f17410.length + 1];
        }
        HashSet hashSet = new HashSet();
        for (AbstractC1591 abstractC1591 : c5637.f17411) {
            EnumC7690 enumC7690 = abstractC1591.f5638;
            if (enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY) {
                if (abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                    C18274 c18275 = (C18274) abstractC1591.mo5445();
                    AbstractC8396 abstractC8396Mo5444 = abstractC1591.mo5444();
                    int i3 = c18275.f56817;
                    C12880 c12881 = c12880Arr4[i3];
                    C14996.m35526(abstractC1591, hashSet);
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        C11011[] c11011Arr = (C11011[]) ((AbstractC1591) it4.next()).f5637;
                        if (c11011Arr != null) {
                            for (int i4 = 0; i4 < c11011Arr.length; i4++) {
                                if (i4 != i3 && (c11011 = c11011Arr[i4]) != null && c11011.f33122) {
                                    C12880 c12882 = c12880Arr4[i4];
                                    c12881.f38656.add(c12882);
                                    c12882.f38656.add(c12881);
                                }
                            }
                        }
                    }
                    hashSet.clear();
                    if (abstractC8396Mo5444.f25745 == EnumC1340.LOCAL) {
                        C12880 c12883 = c12880Arr4[((C18274) abstractC8396Mo5444).f56817];
                        c12881.f38657.add(c12883);
                        c12883.f38657.add(c12881);
                    }
                    EnumC1340 enumC1340 = abstractC8396Mo5444.f25745;
                    if (enumC1340 == EnumC1340.THIS_REF) {
                        c12880Arr[0] = c12881;
                    } else if (enumC1340 == EnumC1340.PARAMETER_REF) {
                        int i5 = ((C21097) abstractC8396Mo5444).f68038;
                        if (c5637.f17413) {
                            c12880Arr[i5] = c12881;
                        } else {
                            c12880Arr[i5 + 1] = c12881;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < iM6108; i6++) {
            C12880 c12884 = c12880Arr4[i6];
            c12884.f38656.remove(c12884);
            c12884.f38657.remove(c12884);
        }
        if (!c5637.f17413) {
            C12880 c12885 = c12880Arr[0];
            for (int i7 = 0; i7 < iM6108; i7++) {
                C12880 c12886 = c12880Arr4[i7];
                if (c12886 != c12885) {
                    c12886.f38656.add(c12885);
                    c12885.f38656.add(c12886);
                }
            }
        }
        if (c5637.f17413) {
            i = 0;
            i2 = 0;
        } else {
            c12880Arr[0].f38658 = 0;
            i = 1;
            i2 = 1;
        }
        int i8 = 0;
        while (true) {
            String[] strArr = c5637.f17410;
            if (i8 >= strArr.length) {
                break;
            }
            int i9 = i + 1;
            C12880 c12887 = c12880Arr[i];
            String str = strArr[i8];
            if (c12887 == null) {
                i2++;
            } else {
                c12887.f38658 = i2;
                i2++;
            }
            if ("J".equals(str) || "D".equals(str)) {
                i2++;
            }
            i8++;
            i = i9;
        }
        C0225 c0226 = this.f36314;
        Map map = (Map) c0226.m1479();
        if (map == null) {
            map = new HashMap();
        }
        int i10 = 0;
        while (true) {
            c0225 = this.f36313;
            if (i10 >= iM6108) {
                break;
            }
            C12880 c12888 = c12880Arr4[i10];
            char c = c12888.f38659;
            List list = (List) map.get(Character.valueOf(c));
            if (list == null) {
                List arrayList2 = (List) c0225.m1479();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                list = arrayList2;
                map.put(Character.valueOf(c), list);
            }
            list.add(c12888);
            Iterator it5 = c12888.f38656.iterator();
            while (it5.hasNext()) {
                if (((C12880) it5.next()).f38659 != c12888.f38659) {
                    it5.remove();
                }
            }
            Iterator it6 = c12888.f38657.iterator();
            while (it6.hasNext()) {
                if (((C12880) it6.next()).f38659 != c12888.f38659) {
                    it6.remove();
                }
            }
            i10++;
        }
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        BitSet bitSet3 = new BitSet();
        BitSet bitSet4 = new BitSet();
        Iterator it7 = map.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry = (Map.Entry) it7.next();
            List list2 = (List) entry.getValue();
            Collections.sort(list2, f36312);
            char cCharValue = ((Character) entry.getKey()).charValue();
            boolean z = cCharValue == 'J' || cCharValue == 'D';
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C12880 c12889 = (C12880) it8.next();
                if (c12889.f38658 < 0) {
                    bitSet.clear();
                    Iterator it9 = c12889.f38656.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = it9;
                        C12880 c128810 = (C12880) it9.next();
                        Iterator it11 = it7;
                        int i11 = c128810.f38658;
                        if (i11 >= 0) {
                            bitSet.set(i11);
                            char c2 = c128810.f38659;
                            it3 = it8;
                            if (c2 == 'J' || c2 == 'D') {
                                bitSet.set(c128810.f38658 + 1);
                            }
                        } else {
                            it3 = it8;
                        }
                        it7 = it11;
                        it9 = it10;
                        it8 = it3;
                    }
                    it = it7;
                    it2 = it8;
                    int length = c12880Arr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C12880 c128811 = c12880Arr[i12];
                        int i13 = length;
                        if (c128811.f38659 != cCharValue) {
                            bitSet.set(c128811.f38658);
                            char c3 = c128811.f38659;
                            c12880Arr3 = c12880Arr;
                            if (c3 == 'J' || c3 == 'D') {
                                bitSet.set(c128811.f38658 + 1);
                            }
                        } else {
                            c12880Arr3 = c12880Arr;
                        }
                        i12++;
                        length = i13;
                        c12880Arr = c12880Arr3;
                    }
                    c12880Arr2 = c12880Arr;
                    bitSet.or(bitSet3);
                    bitSet2.clear();
                    Iterator it12 = c12889.f38657.iterator();
                    while (it12.hasNext()) {
                        int i14 = ((C12880) it12.next()).f38658;
                        if (i14 >= 0) {
                            bitSet2.set(i14);
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        int iNextSetBit = bitSet2.nextSetBit(i15);
                        if (iNextSetBit < 0) {
                            break;
                        }
                        if (z) {
                            if (!bitSet.get(iNextSetBit) && !bitSet.get(iNextSetBit + 1)) {
                                c12889.f38658 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        } else {
                            if (!bitSet.get(iNextSetBit)) {
                                c12889.f38658 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        }
                    }
                    if (c12889.f38658 < 0) {
                        if (z) {
                            int iNextClearBit = -1;
                            do {
                                iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                            } while (bitSet.get(iNextClearBit + 1));
                            c12889.f38658 = iNextClearBit;
                        } else {
                            c12889.f38658 = bitSet.nextClearBit(0);
                        }
                    }
                } else {
                    c12880Arr2 = c12880Arr;
                    it = it7;
                    it2 = it8;
                }
                bitSet4.set(c12889.f38658);
                if (z) {
                    bitSet4.set(c12889.f38658 + 1);
                }
                it7 = it;
                it8 = it2;
                c12880Arr = c12880Arr2;
            }
            bitSet3.or(bitSet4);
            bitSet4.clear();
        }
        for (C18274 c18276 : arrayList) {
            c18276.f56817 = ((C12880) c18276.f25748).f38658;
            c18276.f25748 = null;
        }
        Iterator it13 = c5637.f17411.iterator();
        while (it13.hasNext()) {
            ((AbstractC1591) it13.next()).f5637 = null;
        }
        for (List list3 : map.values()) {
            list3.clear();
            c0225.m1477(list3);
        }
        map.clear();
        c0226.m1477(map);
    }
}
