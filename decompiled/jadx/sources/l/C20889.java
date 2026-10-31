package l;

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
public final class C20889 extends AbstractC10494 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47719(C5637 c5637, HashMap map) {
        HashSet hashSet;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C18274) it.next()).f56817 = i;
            i++;
        }
        ArrayList arrayList = new ArrayList();
        C14996.m35531(c5637.f17411, new C18066(i, arrayList, map));
        HashSet<C6777> hashSet2 = new HashSet(arrayList.size() / 2);
        C5784 c5784 = new C5784();
        c5784.addAll(arrayList);
        arrayList.clear();
        while (!c5784.isEmpty()) {
            C6777 c6777 = (C6777) c5784.poll();
            if (c6777.f21041 && !hashSet2.contains(c6777)) {
                hashSet2.add(c6777);
                C6777 c6778 = c6777.f21044;
                if (c6778 != null && !c6778.f21041) {
                    c6778.f21041 = true;
                    c5784.add(c6778);
                }
                HashSet<C6777> hashSet3 = c6777.f21042;
                if (hashSet3 != null) {
                    for (C6777 c6779 : hashSet3) {
                        if (!c6779.f21041) {
                            c6779.f21041 = true;
                            c5784.add(c6779);
                        }
                    }
                }
            }
        }
        for (C6777 c67710 : hashSet2) {
            C23710 c23710 = c67710.f21039;
            C18274 c18274 = c67710.f21040;
            if (c23710.f76777.size() > 1) {
                map.remove(c18274);
            } else {
                C6777 c67711 = c67710.f21044;
                if (c67711 != null && (hashSet = c67710.f21042) != null) {
                    BitSet bitSet = c67711.f21043;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        if (!bitSet.equals(((C6777) it2.next()).f21043)) {
                            map.remove(c18274);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C18274 c18275 = (C18274) entry.getKey();
            C23710 c23711 = (C23710) entry.getValue();
            Iterator it4 = c23711.f76777.iterator();
            while (it4.hasNext()) {
                BitSet bitSet2 = ((C6777[]) ((AbstractC1591) it4.next()).f5637)[c18275.f56817].f21043;
                int iNextClearBit = bitSet2.nextClearBit(0);
                int i2 = c23711.f76776;
                if (iNextClearBit < i2 || bitSet2.nextSetBit(i2) >= 0) {
                    it3.remove();
                    break;
                }
            }
        }
        Iterator it5 = c5637.f17411.iterator();
        while (it5.hasNext()) {
            ((AbstractC1591) it5.next()).f5637 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47720(C5637 c5637) {
        HashMap map = new HashMap();
        ArrayList arrayList = c5637.f17415;
        if (arrayList.size() != 0) {
            C14996.m35528(c5637);
            C14996.m35529(c5637, new C17360(map));
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = c5637.f17414;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList<C21802> arrayList3 = ((C13334) it.next()).f39897;
                        if (arrayList3 != null) {
                            for (C21802 c21802 : arrayList3) {
                                hashSet.add((C18274) c21802.f42444);
                                for (AbstractC8396 abstractC8396 : c21802.f42445.mo15838()) {
                                    hashSet.add((C18274) abstractC8396);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        map.remove((C18274) it2.next());
                    }
                }
            }
        }
        if (map.size() != 0) {
            BitSet bitSet = new BitSet();
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                C23710 c23710 = (C23710) ((Map.Entry) it3.next()).getValue();
                Iterator it4 = c23710.f76775.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC1591 abstractC1591 = (AbstractC1591) it4.next();
                        if (abstractC1591.f5638 == EnumC7690.FILL_ARRAY_DATA) {
                            int length = Array.getLength(((C11987) abstractC1591.mo5444()).f35889);
                            int iNextSetBit = bitSet.nextSetBit(0);
                            if (iNextSetBit < 0 || iNextSetBit >= length) {
                                bitSet.set(0, length);
                            }
                        } else {
                            int iIntValue = ((Number) ((C11987) ((C12692) abstractC1591.mo5445()).f2429).f35889).intValue();
                            if (!bitSet.get(iIntValue)) {
                                bitSet.set(iIntValue);
                            }
                        }
                    } else {
                        int iNextClearBit = bitSet.nextClearBit(0);
                        int i = c23710.f76776;
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
                    ((C18274) it5.next()).f56817 = -1;
                }
                if (map.size() < 50) {
                    m47719(c5637, map);
                } else {
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(50);
                    Iterator it6 = map.entrySet().iterator();
                    while (it6.hasNext()) {
                        for (int i2 = 0; i2 < 50 && it6.hasNext(); i2++) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            map3.put((C18274) entry.getKey(), (C23710) entry.getValue());
                            it6.remove();
                            arrayList4.add((C18274) entry.getKey());
                        }
                        m47719(c5637, map3);
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            ((C18274) it7.next()).f56817 = -1;
                        }
                        arrayList4.clear();
                        map2.putAll(map3);
                        map3.clear();
                    }
                    map.putAll(map2);
                }
                C14996.m35534(c5637);
                if (map.size() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        C18274 c18274 = (C18274) entry2.getKey();
                        C23710 c23711 = (C23710) entry2.getValue();
                        int i3 = c23711.f76776;
                        ArrayList<AbstractC1591> arrayList6 = c23711.f76775;
                        ArrayList arrayList7 = c23711.f76777;
                        AbstractC8396[] abstractC8396Arr = new AbstractC8396[i3];
                        for (AbstractC1591 abstractC1592 : arrayList6) {
                            if (abstractC1592.f5638 == EnumC7690.FILL_ARRAY_DATA) {
                                if (((C18274) abstractC1592.mo5445()) == c18274) {
                                    Object obj = ((C11987) abstractC1592.mo5444()).f35889;
                                    int length2 = Array.getLength(obj);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        abstractC8396Arr[i4] = new C11987(Array.get(obj, i4));
                                    }
                                }
                            } else {
                                C12692 c12692 = (C12692) abstractC1592.mo5445();
                                if (((C18274) c12692.f2428) == c18274) {
                                    int iIntValue2 = ((Number) ((C11987) c12692.f2429).f35889).intValue();
                                    AbstractC8396 abstractC8396Mo5444 = abstractC1592.mo5444();
                                    EnumC1340 enumC1340 = abstractC8396Mo5444.f25745;
                                    if (enumC1340 != EnumC1340.LOCAL && enumC1340 != EnumC1340.CONSTANT) {
                                        C18274 c18275 = new C18274(-1);
                                        arrayList.add(c18275);
                                        c5637.f17411.m38666(abstractC1592, C17819.m41744(c18275, abstractC8396Mo5444));
                                        abstractC8396Mo5444 = c18275;
                                    }
                                    abstractC8396Arr[iIntValue2] = abstractC8396Mo5444;
                                }
                            }
                        }
                        arrayList.remove(c18274);
                        c5637.f17411.m38667(c23711.f76774);
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            c5637.f17411.m38667((AbstractC1591) it8.next());
                        }
                        C16654 c16654 = new C16654(c18274, c23711, abstractC8396Arr, arrayList5);
                        if (arrayList7.size() == 1) {
                            AbstractC1591 abstractC1593 = (AbstractC1591) arrayList7.get(0);
                            if (c5637.f17411.m38663(abstractC1593)) {
                                C14996.m35536(abstractC1593, c16654, false);
                            } else {
                                int size = arrayList5.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    C14996.m35535((AbstractC8396) arrayList5.get(i5), c16654);
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
