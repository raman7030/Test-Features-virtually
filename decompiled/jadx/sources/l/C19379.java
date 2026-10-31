package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19379 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f62724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f62725;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f62726;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f62727;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f62728;

    public C19379(boolean z, boolean z2, long j, List list) {
        this.f62728 = z;
        this.f62724 = z2;
        this.f62727 = j;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f62726 = C20195.unmodifiableList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18673 c18673 = (C18673) it.next();
            linkedHashMap.put(c18673.f59011, c18673);
        }
        this.f62725 = C20195.unmodifiableMap(linkedHashMap);
    }
}
