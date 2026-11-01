package p067l;

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
public final class C13939 {

    /* JADX INFO: renamed from: ܽ */
    public static final Comparator f39323 = new C5222();

    /* JADX INFO: renamed from: ۧ */
    public final C2582 f39325 = new C2582();

    /* JADX INFO: renamed from: ֫ */
    public final C2582 f39324 = new C2582(200);

    /* JADX INFO: renamed from: ֫ */
    public final void m31714(C7726 c7726) {
        C14609[] c14609Arr;
        int i;
        int i2;
        C2582 c2582;
        C14609[] c14609Arr2;
        Iterator it;
        Iterator it2;
        C14609[] c14609Arr3;
        Iterator it3;
        C12833 c12833;
        ArrayList<C19736> arrayList = c7726.f20261;
        if (arrayList.size() == 0) {
            return;
        }
        C4115 c4115 = new C4115(c7726);
        c4115.m21224();
        int iM8306 = c4115.m8306();
        C14609[] c14609Arr4 = new C14609[iM8306];
        for (C19736 c19736 : arrayList) {
            C14609 c14609 = new C14609();
            char cCharAt = c19736.f28659.charAt(0);
            if (cCharAt == '[') {
                cCharAt = 'L';
            }
            c14609.f41702 = cCharAt;
            c19736.f28661 = c14609;
            c14609Arr4[c19736.f60034] = c14609;
        }
        if (c7726.f20259) {
            c14609Arr = new C14609[c7726.f20256.length];
        } else {
            c14609Arr = new C14609[c7726.f20256.length + 1];
        }
        HashSet hashSet = new HashSet();
        for (AbstractC3880 abstractC3880 : c7726.f20257) {
            EnumC9677 enumC9677 = abstractC3880.f8417;
            if (enumC9677 == EnumC9677.ASSIGN || enumC9677 == EnumC9677.IDENTITY) {
                if (abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                    C19736 c19737 = (C19736) abstractC3880.mo7675();
                    AbstractC10348 abstractC10348Mo7674 = abstractC3880.mo7674();
                    int i3 = c19737.f60034;
                    C14609 c146010 = c14609Arr4[i3];
                    C16620.m37682(abstractC3880, hashSet);
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        C12833[] c12833Arr = (C12833[]) ((AbstractC3880) it4.next()).f8416;
                        if (c12833Arr != null) {
                            for (int i4 = 0; i4 < c12833Arr.length; i4++) {
                                if (i4 != i3 && (c12833 = c12833Arr[i4]) != null && c12833.f36116) {
                                    C14609 c146011 = c14609Arr4[i4];
                                    c146010.f41699.add(c146011);
                                    c146011.f41699.add(c146010);
                                }
                            }
                        }
                    }
                    hashSet.clear();
                    if (abstractC10348Mo7674.f28658 == EnumC3642.LOCAL) {
                        C14609 c146012 = c14609Arr4[((C19736) abstractC10348Mo7674).f60034];
                        c146010.f41700.add(c146012);
                        c146012.f41700.add(c146010);
                    }
                    EnumC3642 enumC3642 = abstractC10348Mo7674.f28658;
                    if (enumC3642 == EnumC3642.THIS_REF) {
                        c14609Arr[0] = c146010;
                    } else if (enumC3642 == EnumC3642.PARAMETER_REF) {
                        int i5 = ((C22419) abstractC10348Mo7674).f70720;
                        if (c7726.f20259) {
                            c14609Arr[i5] = c146010;
                        } else {
                            c14609Arr[i5 + 1] = c146010;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < iM8306; i6++) {
            C14609 c146013 = c14609Arr4[i6];
            c146013.f41699.remove(c146013);
            c146013.f41700.remove(c146013);
        }
        if (!c7726.f20259) {
            C14609 c146014 = c14609Arr[0];
            for (int i7 = 0; i7 < iM8306; i7++) {
                C14609 c146015 = c14609Arr4[i7];
                if (c146015 != c146014) {
                    c146015.f41699.add(c146014);
                    c146014.f41699.add(c146015);
                }
            }
        }
        if (c7726.f20259) {
            i = 0;
            i2 = 0;
        } else {
            c14609Arr[0].f41701 = 0;
            i = 1;
            i2 = 1;
        }
        int i8 = 0;
        while (true) {
            String[] strArr = c7726.f20256;
            if (i8 >= strArr.length) {
                break;
            }
            int i9 = i + 1;
            C14609 c146016 = c14609Arr[i];
            String str = strArr[i8];
            if (c146016 == null) {
                i2++;
            } else {
                c146016.f41701 = i2;
                i2++;
            }
            if ("J".equals(str) || "D".equals(str)) {
                i2++;
            }
            i8++;
            i = i9;
        }
        C2582 c2583 = this.f39325;
        Map map = (Map) c2583.m3892();
        if (map == null) {
            map = new HashMap();
        }
        int i10 = 0;
        while (true) {
            c2582 = this.f39324;
            if (i10 >= iM8306) {
                break;
            }
            C14609 c146017 = c14609Arr4[i10];
            char c = c146017.f41702;
            List list = (List) map.get(Character.valueOf(c));
            if (list == null) {
                List arrayList2 = (List) c2582.m3892();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                list = arrayList2;
                map.put(Character.valueOf(c), list);
            }
            list.add(c146017);
            Iterator it5 = c146017.f41699.iterator();
            while (it5.hasNext()) {
                if (((C14609) it5.next()).f41702 != c146017.f41702) {
                    it5.remove();
                }
            }
            Iterator it6 = c146017.f41700.iterator();
            while (it6.hasNext()) {
                if (((C14609) it6.next()).f41702 != c146017.f41702) {
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
            Collections.sort(list2, f39323);
            char cCharValue = ((Character) entry.getKey()).charValue();
            boolean z = cCharValue == 'J' || cCharValue == 'D';
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C14609 c146018 = (C14609) it8.next();
                if (c146018.f41701 < 0) {
                    bitSet.clear();
                    Iterator it9 = c146018.f41699.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = it9;
                        C14609 c146019 = (C14609) it9.next();
                        Iterator it11 = it7;
                        int i11 = c146019.f41701;
                        if (i11 >= 0) {
                            bitSet.set(i11);
                            char c2 = c146019.f41702;
                            it3 = it8;
                            if (c2 == 'J' || c2 == 'D') {
                                bitSet.set(c146019.f41701 + 1);
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
                    int length = c14609Arr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C14609 c146020 = c14609Arr[i12];
                        int i13 = length;
                        if (c146020.f41702 != cCharValue) {
                            bitSet.set(c146020.f41701);
                            char c3 = c146020.f41702;
                            c14609Arr3 = c14609Arr;
                            if (c3 == 'J' || c3 == 'D') {
                                bitSet.set(c146020.f41701 + 1);
                            }
                        } else {
                            c14609Arr3 = c14609Arr;
                        }
                        i12++;
                        length = i13;
                        c14609Arr = c14609Arr3;
                    }
                    c14609Arr2 = c14609Arr;
                    bitSet.or(bitSet3);
                    bitSet2.clear();
                    Iterator it12 = c146018.f41700.iterator();
                    while (it12.hasNext()) {
                        int i14 = ((C14609) it12.next()).f41701;
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
                                c146018.f41701 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        } else {
                            if (!bitSet.get(iNextSetBit)) {
                                c146018.f41701 = iNextSetBit;
                                break;
                            }
                            i15 = iNextSetBit + 1;
                        }
                    }
                    if (c146018.f41701 < 0) {
                        if (z) {
                            int iNextClearBit = -1;
                            do {
                                iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                            } while (bitSet.get(iNextClearBit + 1));
                            c146018.f41701 = iNextClearBit;
                        } else {
                            c146018.f41701 = bitSet.nextClearBit(0);
                        }
                    }
                } else {
                    c14609Arr2 = c14609Arr;
                    it = it7;
                    it2 = it8;
                }
                bitSet4.set(c146018.f41701);
                if (z) {
                    bitSet4.set(c146018.f41701 + 1);
                }
                it7 = it;
                it8 = it2;
                c14609Arr = c14609Arr2;
            }
            bitSet3.or(bitSet4);
            bitSet4.clear();
        }
        for (C19736 c19738 : arrayList) {
            c19738.f60034 = ((C14609) c19738.f28661).f41701;
            c19738.f28661 = null;
        }
        Iterator it13 = c7726.f20257.iterator();
        while (it13.hasNext()) {
            ((AbstractC3880) it13.next()).f8416 = null;
        }
        for (List list3 : map.values()) {
            list3.clear();
            c2582.m3890(list3);
        }
        map.clear();
        c2583.m3890(map);
    }
}
