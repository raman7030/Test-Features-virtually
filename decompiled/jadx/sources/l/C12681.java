package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۫᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12681 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4920 f38196 = new C4920();

    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m30954(ArrayList arrayList) {
        C23075 c23075;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11787 c11787 = (C11787) it.next();
            C13902 c13902 = c11787.f35172;
            C13902 c13903 = c11787.f35173;
            if (c13902 != null) {
                linkedHashSet.add(c13902);
            }
            if (c13903 != null) {
                linkedHashSet2.add(c13903);
            }
            if (c13902 != null && c13903 != null) {
                ((List) C13843.computeIfAbsent(linkedHashMap, new C13386(c13902, c13903), new C8448())).add(c11787);
                ((Set) C13843.computeIfAbsent(linkedHashMap4, c13903, new C15502())).add(c13902);
                ((Set) C13843.computeIfAbsent(linkedHashMap5, c13902, new C21854())).add(c13903);
            } else if (c13902 != null) {
                ((List) C13843.computeIfAbsent(linkedHashMap2, c13902, new C22559())).add(c11787);
            } else if (c13903 != null) {
                ((List) C13843.computeIfAbsent(linkedHashMap3, c13903, new C20443())).add(c11787);
            }
        }
        long jM30953 = m30953(linkedHashSet, linkedHashSet2, linkedHashMap4);
        long jM30954 = m30953(linkedHashSet2, linkedHashSet, linkedHashMap5);
        boolean z = false;
        if (jM30953 >= jM30954) {
            if (jM30954 < jM30953) {
                z = true;
            } else {
                Iterator it2 = linkedHashSet.iterator();
                long j = 0;
                long j2 = 0;
                while (it2.hasNext()) {
                    long j3 = ((C13902) it2.next()).f41429;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                Iterator it3 = linkedHashSet2.iterator();
                while (it3.hasNext()) {
                    long j4 = ((C13902) it3.next()).f41429;
                    if (j4 > j) {
                        j = j4;
                    }
                }
                if (j2 <= j && j > j2) {
                    z = true;
                }
            }
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        LinkedHashMap linkedHashMap8 = !z ? linkedHashMap2 : linkedHashMap3;
        if (!z) {
            linkedHashMap2 = linkedHashMap3;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C13386 c13386 = (C13386) entry.getKey();
            C13902 c13904 = !z ? c13386.f40010 : c13386.f40011;
            C13386 c13387 = (C13386) entry.getKey();
            C13902 c13905 = !z ? c13387.f40011 : c13387.f40010;
            List list = (List) C13843.computeIfAbsent(linkedHashMap6, c13904, new C0686());
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    c23075 = null;
                    break;
                }
                c23075 = (C23075) it4.next();
            } while (c23075.f74218 != c13905);
            if (c23075 == null) {
                c23075 = new C23075(c13904, c13905);
                list.add(c23075);
            }
            c23075.f74216.addAll((Collection) entry.getValue());
        }
        ArrayList<C13902> arrayList2 = new ArrayList(linkedHashMap6.keySet());
        C6083.sort(arrayList2, f38196);
        HashMap map = new HashMap();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List<C23075> list2 = (List) linkedHashMap6.get((C13902) it5.next());
            C6083.sort(list2, new C3509());
            for (C23075 c23076 : list2) {
                C13843.putIfAbsent(map, c23076.f74218, c23076);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C23075 c23077 = (C23075) map.get(entry2.getKey());
            if (c23077 != null) {
                c23077.f74216.addAll((Collection) entry2.getValue());
            } else {
                arrayList3.add(new C23075((C13902) entry2.getKey(), (List) entry2.getValue()));
            }
        }
        for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
            if (linkedHashMap6.containsKey(entry3.getKey())) {
                linkedHashMap7.put((C13902) entry3.getKey(), new C23075((C13902) entry3.getKey(), (List) entry3.getValue()));
            } else {
                arrayList3.add(new C23075((C13902) entry3.getKey(), (List) entry3.getValue()));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C13902 c13906 : arrayList2) {
            List list3 = (List) linkedHashMap6.get(c13906);
            C6083.sort(list3, new C5626(0));
            arrayList4.addAll(list3);
            C23075 c23078 = (C23075) linkedHashMap7.get(c13906);
            if (c23078 != null) {
                arrayList4.add(c23078);
            }
        }
        C6083.sort(arrayList3, new C1392());
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m30953(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C13902) it.next()).f41429;
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            C13902 c13902 = (C13902) it2.next();
            Set set = (Set) linkedHashMap.get(c13902);
            int iMax = 1;
            if (set != null) {
                iMax = Math.max(1, set.size());
            }
            j += c13902.f41429 * ((long) iMax);
        }
        return j;
    }
}
