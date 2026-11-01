package p067l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C22221 extends AbstractC12342 {
    /* JADX INFO: renamed from: ֫ */
    public static void m50049(C7726 c7726, HashMap map) {
        HashSet hashSet;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C19736) it.next()).f60034 = i;
            i++;
        }
        ArrayList arrayList = new ArrayList();
        C16620.m37687(c7726.f20257, new C19538(i, arrayList, map));
        HashSet<C8809> hashSet2 = new HashSet(arrayList.size() / 2);
        C7865 c7865 = new C7865();
        c7865.addAll(arrayList);
        arrayList.clear();
        while (!c7865.isEmpty()) {
            C8809 c8809 = (C8809) c7865.poll();
            if (c8809.f23915 && !hashSet2.contains(c8809)) {
                hashSet2.add(c8809);
                C8809 c88010 = c8809.f23918;
                if (c88010 != null && !c88010.f23915) {
                    c88010.f23915 = true;
                    c7865.add(c88010);
                }
                HashSet<C8809> hashSet3 = c8809.f23916;
                if (hashSet3 != null) {
                    for (C8809 c88011 : hashSet3) {
                        if (!c88011.f23915) {
                            c88011.f23915 = true;
                            c7865.add(c88011);
                        }
                    }
                }
            }
        }
        for (C8809 c88012 : hashSet2) {
            C24902 c24902 = c88012.f23913;
            C19736 c19736 = c88012.f23914;
            if (c24902.f79527.size() > 1) {
                map.remove(c19736);
            } else {
                C8809 c88013 = c88012.f23918;
                if (c88013 != null && (hashSet = c88012.f23916) != null) {
                    BitSet bitSet = c88013.f23917;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        if (!bitSet.equals(((C8809) it2.next()).f23917)) {
                            map.remove(c19736);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C19736 c19737 = (C19736) entry.getKey();
            C24902 c24903 = (C24902) entry.getValue();
            Iterator it4 = c24903.f79527.iterator();
            while (it4.hasNext()) {
                BitSet bitSet2 = ((C8809[]) ((AbstractC3880) it4.next()).f8416)[c19737.f60034].f23917;
                int iNextClearBit = bitSet2.nextClearBit(0);
                int i2 = c24903.f79526;
                if (iNextClearBit < i2 || bitSet2.nextSetBit(i2) >= 0) {
                    it3.remove();
                    break;
                }
            }
        }
        Iterator it5 = c7726.f20257.iterator();
        while (it5.hasNext()) {
            ((AbstractC3880) it5.next()).f8416 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50050(C7726 c7726) {
        HashMap map = new HashMap();
        ArrayList arrayList = c7726.f20261;
        if (arrayList.size() != 0) {
            C16620.m37684(c7726);
            C16620.m37685(c7726, new C18867(map));
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = c7726.f20260;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList<C23089> arrayList3 = ((C15041) it.next()).f42963;
                        if (arrayList3 != null) {
                            for (C23089 c23089 : arrayList3) {
                                hashSet.add((C19736) c23089.f45527);
                                for (AbstractC10348 abstractC10348 : c23089.f45528.mo17753()) {
                                    hashSet.add((C19736) abstractC10348);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        map.remove((C19736) it2.next());
                    }
                }
            }
        }
        if (map.size() != 0) {
            BitSet bitSet = new BitSet();
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                C24902 c24902 = (C24902) ((Map.Entry) it3.next()).getValue();
                Iterator it4 = c24902.f79525.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC3880 abstractC3880 = (AbstractC3880) it4.next();
                        if (abstractC3880.f8417 == EnumC9677.FILL_ARRAY_DATA) {
                            int length = Array.getLength(((C13761) abstractC3880.mo7674()).f38899);
                            int iNextSetBit = bitSet.nextSetBit(0);
                            if (iNextSetBit < 0 || iNextSetBit >= length) {
                                bitSet.set(0, length);
                            }
                        } else {
                            int iIntValue = ((Number) ((C13761) ((C14431) abstractC3880.mo7675()).f5201).f38899).intValue();
                            if (!bitSet.get(iIntValue)) {
                                bitSet.set(iIntValue);
                            }
                        }
                    } else {
                        int iNextClearBit = bitSet.nextClearBit(0);
                        int i = c24902.f79526;
                        if (iNextClearBit >= i && bitSet.nextSetBit(i) < 0) {
                            break;
                        }
                    }
                    it3.remove();
                    break;
                }
                bitSet.clear();
            }
            if (map.size() != 0) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((C19736) it5.next()).f60034 = -1;
                }
                if (map.size() < 50) {
                    m50049(c7726, map);
                } else {
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(50);
                    Iterator it6 = map.entrySet().iterator();
                    while (it6.hasNext()) {
                        for (int i2 = 0; i2 < 50 && it6.hasNext(); i2++) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            map3.put((C19736) entry.getKey(), (C24902) entry.getValue());
                            it6.remove();
                            arrayList4.add((C19736) entry.getKey());
                        }
                        m50049(c7726, map3);
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            ((C19736) it7.next()).f60034 = -1;
                        }
                        arrayList4.clear();
                        map2.putAll(map3);
                        map3.clear();
                    }
                    map.putAll(map2);
                }
                C16620.m37690(c7726);
                if (map.size() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        C19736 c19736 = (C19736) entry2.getKey();
                        C24902 c24903 = (C24902) entry2.getValue();
                        int i3 = c24903.f79526;
                        ArrayList<AbstractC3880> arrayList6 = c24903.f79525;
                        ArrayList arrayList7 = c24903.f79527;
                        AbstractC10348[] abstractC10348Arr = new AbstractC10348[i3];
                        for (AbstractC3880 abstractC3881 : arrayList6) {
                            if (abstractC3881.f8417 == EnumC9677.FILL_ARRAY_DATA) {
                                if (((C19736) abstractC3881.mo7675()) == c19736) {
                                    Object obj = ((C13761) abstractC3881.mo7674()).f38899;
                                    int length2 = Array.getLength(obj);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        abstractC10348Arr[i4] = new C13761(Array.get(obj, i4));
                                    }
                                }
                            } else {
                                C14431 c14431 = (C14431) abstractC3881.mo7675();
                                if (((C19736) c14431.f5200) == c19736) {
                                    int iIntValue2 = ((Number) ((C13761) c14431.f5201).f38899).intValue();
                                    AbstractC10348 abstractC10348Mo7674 = abstractC3881.mo7674();
                                    EnumC3642 enumC3642 = abstractC10348Mo7674.f28658;
                                    if (enumC3642 != EnumC3642.LOCAL && enumC3642 != EnumC3642.CONSTANT) {
                                        C19736 c19737 = new C19736(-1);
                                        arrayList.add(c19737);
                                        c7726.f20257.m40882(abstractC3881, C19303.m43990(c19737, abstractC10348Mo7674));
                                        abstractC10348Mo7674 = c19737;
                                    }
                                    abstractC10348Arr[iIntValue2] = abstractC10348Mo7674;
                                }
                            }
                        }
                        arrayList.remove(c19736);
                        c7726.f20257.m40883(c24903.f79524);
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            c7726.f20257.m40883((AbstractC3880) it8.next());
                        }
                        C18196 c18196 = new C18196(c19736, c24903, abstractC10348Arr, arrayList5);
                        if (arrayList7.size() == 1) {
                            AbstractC3880 abstractC3882 = (AbstractC3880) arrayList7.get(0);
                            if (c7726.f20257.m40879(abstractC3882)) {
                                C16620.m37692(abstractC3882, c18196, false);
                            } else {
                                int size = arrayList5.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    C16620.m37691((AbstractC10348) arrayList5.get(i5), c18196);
                                }
                            }
                        } else if (arrayList7.size() != 0) {
                            throw new RuntimeException("array is used multiple times");
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
