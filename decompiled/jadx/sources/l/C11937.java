package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11937 {
    public final Map a;
    public final Map b;

    public C11937(Map map) {
        this.a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                ConcurrentMapC10942 concurrentMapC10942 = C14052.a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C14052.b);
            map2.put((EnumC20655) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C14052.b);
        this.b = map2;
    }

    public final String a(long j, EnumC20655 enumC20655) {
        Map map = (Map) this.a.get(enumC20655);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
