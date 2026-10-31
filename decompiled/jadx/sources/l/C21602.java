package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21602 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f69363 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20191 m48779() {
        int i = C13758.f41051;
        AbstractC10232 abstractC10232 = C22931.f73892;
        abstractC10232.getClass();
        C18534 c18534 = new C18534(EnumC23637.f76585, abstractC10232);
        ArrayList arrayList = this.f69363;
        Collections.sort(arrayList, c18534);
        C1846 c1846 = new C1846(arrayList.size());
        C1846 c1847 = new C1846(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C13758 c13758 = (C13758) ((Map.Entry) arrayList.get(i2)).getKey();
            if (i2 > 0) {
                C13758 c13759 = (C13758) ((Map.Entry) arrayList.get(i2 - 1)).getKey();
                if (c13758.m33078(c13759) && !c13758.m33076(c13759).m33072()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + c13759 + " overlaps with entry " + c13758);
                }
            }
            c1846.m16262((Object) c13758);
            c1847.m16262(((Map.Entry) arrayList.get(i2)).getValue());
        }
        return new C20191(c1846.m6131(), c1847.m6131());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48780(C13758 c13758, Object obj) {
        c13758.getClass();
        obj.getClass();
        C4025.m12107(c13758, "Range must not be empty, but was %s", !c13758.m33072());
        this.f69363.add(new AbstractMap.SimpleImmutableEntry(c13758, obj));
    }
}
