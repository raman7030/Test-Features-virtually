package p067l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A3HU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13048 {

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashMap f36690 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m29873(AbstractC18017 abstractC18017, AbstractC18017 abstractC18018, AbstractC18017 abstractC18019) {
        LinkedHashMap linkedHashMap = this.f36690;
        Map linkedHashMap2 = (Map) linkedHashMap.get(abstractC18017);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(abstractC18017, linkedHashMap2);
        } else {
            linkedHashMap2.get(abstractC18018);
        }
        linkedHashMap2.put(abstractC18018, abstractC18019);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m29872(AbstractC18017 abstractC18017, AbstractC18017 abstractC18018) {
        Map map = (Map) this.f36690.get(abstractC18017);
        if (map == null) {
            return null;
        }
        return map.get(abstractC18018);
    }
}
