package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20786 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f65335;

    /* JADX INFO: renamed from: ۧ */
    public final Map f65336;

    /* JADX INFO: renamed from: ܽ */
    public final List f65337;

    /* JADX INFO: renamed from: ܿ */
    public final long f65338;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f65339;

    public C20786(boolean z, boolean z2, long j, List list) {
        this.f65339 = z;
        this.f65335 = z2;
        this.f65338 = j;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f65337 = C21562.unmodifiableList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20115 c20115 = (C20115) it.next();
            linkedHashMap.put(c20115.f62234, c20115);
        }
        this.f65336 = C21562.unmodifiableMap(linkedHashMap);
    }
}
