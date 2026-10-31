package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A3HU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11237 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f33690 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27811(AbstractC16466 abstractC16466, AbstractC16466 abstractC16467, AbstractC16466 abstractC16468) {
        LinkedHashMap linkedHashMap = this.f33690;
        Map linkedHashMap2 = (Map) linkedHashMap.get(abstractC16466);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(abstractC16466, linkedHashMap2);
        } else {
            linkedHashMap2.get(abstractC16467);
        }
        linkedHashMap2.put(abstractC16467, abstractC16468);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m27810(AbstractC16466 abstractC16466, AbstractC16466 abstractC16467) {
        Map map = (Map) this.f33690.get(abstractC16466);
        if (map == null) {
            return null;
        }
        return map.get(abstractC16467);
    }
}
