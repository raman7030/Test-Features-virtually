package p067l;

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
public final class C14421 {

    /* JADX INFO: renamed from: ֫ */
    public static final C7045 f41223 = new C7045();

    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX INFO: renamed from: ֫ */
    public static List m33032(ArrayList arrayList) {
        C24299 c24299;
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
            C13571 c13571 = (C13571) it.next();
            C15581 c15581 = c13571.f38171;
            C15581 c15582 = c13571.f38172;
            if (c15581 != null) {
                linkedHashSet.add(c15581);
            }
            if (c15582 != null) {
                linkedHashSet2.add(c15582);
            }
            if (c15581 != null && c15582 != null) {
                ((List) C15525.computeIfAbsent(linkedHashMap, new C15091(c15581, c15582), new C10398())).add(c13571);
                ((Set) C15525.computeIfAbsent(linkedHashMap4, c15582, new C17102())).add(c15581);
                ((Set) C15525.computeIfAbsent(linkedHashMap5, c15581, new C23139())).add(c15582);
            } else if (c15581 != null) {
                ((List) C15525.computeIfAbsent(linkedHashMap2, c15581, new C23809())).add(c13571);
            } else if (c15582 != null) {
                ((List) C15525.computeIfAbsent(linkedHashMap3, c15582, new C21798())).add(c13571);
            }
        }
        long jM33031 = m33031(linkedHashSet, linkedHashSet2, linkedHashMap4);
        long jM33032 = m33031(linkedHashSet2, linkedHashSet, linkedHashMap5);
        boolean z = false;
        if (jM33031 >= jM33032) {
            if (jM33032 < jM33031) {
                z = true;
            } else {
                Iterator it2 = linkedHashSet.iterator();
                long j = 0;
                long j2 = 0;
                while (it2.hasNext()) {
                    long j3 = ((C15581) it2.next()).f44510;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                Iterator it3 = linkedHashSet2.iterator();
                while (it3.hasNext()) {
                    long j4 = ((C15581) it3.next()).f44510;
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
            C15091 c15091 = (C15091) entry.getKey();
            C15581 c15583 = !z ? c15091.f43077 : c15091.f43078;
            C15091 c15092 = (C15091) entry.getKey();
            C15581 c15584 = !z ? c15092.f43078 : c15092.f43077;
            List list = (List) C15525.computeIfAbsent(linkedHashMap6, c15583, new C3021());
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    c24299 = null;
                    break;
                }
                c24299 = (C24299) it4.next();
            } while (c24299.f76963 != c15584);
            if (c24299 == null) {
                c24299 = new C24299(c15583, c15584);
                list.add(c24299);
            }
            c24299.f76961.addAll((Collection) entry.getValue());
        }
        ArrayList<C15581> arrayList2 = new ArrayList(linkedHashMap6.keySet());
        C8150.sort(arrayList2, f41223);
        HashMap map = new HashMap();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List<C24299> list2 = (List) linkedHashMap6.get((C15581) it5.next());
            C8150.sort(list2, new C5704());
            for (C24299 c242910 : list2) {
                C15525.putIfAbsent(map, c242910.f76963, c242910);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C24299 c242911 = (C24299) map.get(entry2.getKey());
            if (c242911 != null) {
                c242911.f76961.addAll((Collection) entry2.getValue());
            } else {
                arrayList3.add(new C24299((C15581) entry2.getKey(), (List) entry2.getValue()));
            }
        }
        for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
            if (linkedHashMap6.containsKey(entry3.getKey())) {
                linkedHashMap7.put((C15581) entry3.getKey(), new C24299((C15581) entry3.getKey(), (List) entry3.getValue()));
            } else {
                arrayList3.add(new C24299((C15581) entry3.getKey(), (List) entry3.getValue()));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C15581 c15585 : arrayList2) {
            List list3 = (List) linkedHashMap6.get(c15585);
            C8150.sort(list3, new C7716(0));
            arrayList4.addAll(list3);
            C24299 c242912 = (C24299) linkedHashMap7.get(c15585);
            if (c242912 != null) {
                arrayList4.add(c242912);
            }
        }
        C8150.sort(arrayList3, new C3692());
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m33031(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C15581) it.next()).f44510;
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            C15581 c15581 = (C15581) it2.next();
            Set set = (Set) linkedHashMap.get(c15581);
            int iMax = 1;
            if (set != null) {
                iMax = Math.max(1, set.size());
            }
            j += c15581.f44510 * ((long) iMax);
        }
        return j;
    }
}
