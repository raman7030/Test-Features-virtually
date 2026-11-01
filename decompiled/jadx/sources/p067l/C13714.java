package p067l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13714 {

    /* JADX INFO: renamed from: a */
    public final Map f38707a;

    /* JADX INFO: renamed from: b */
    public final Map f38708b;

    public C13714(Map map) {
        this.f38707a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                ConcurrentMapC12768 concurrentMapC12768 = C15724.f45560a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C15724.f45561b);
            map2.put((EnumC21999) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C15724.f45561b);
        this.f38708b = map2;
    }

    /* JADX INFO: renamed from: a */
    public final String m31181a(long j, EnumC21999 enumC21999) {
        Map map = (Map) this.f38707a.get(enumC21999);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
