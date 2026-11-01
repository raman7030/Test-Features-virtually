package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19096 {

    /* JADX INFO: renamed from: ֫ */
    public final Map f56971;

    /* JADX INFO: renamed from: ۜ */
    public final Map f56972;

    /* JADX INFO: renamed from: ۧ */
    public final Map f56973;

    /* JADX INFO: renamed from: ܳ */
    public final C9314 f56974;

    /* JADX INFO: renamed from: ܽ */
    public final List f56975;

    /* JADX INFO: renamed from: ܿ */
    public final Map f56976;

    /* JADX INFO: renamed from: ᩳ */
    public final Map f56977;

    /* JADX INFO: renamed from: ᩷ */
    public final List f56978;

    /* JADX INFO: renamed from: ᩻ */
    public int f56979;

    public C19096(C16413 c16413) {
        this.f56974 = c16413.f48255;
        Map map = c16413.f48252;
        int i = C9038.f24535;
        this.f56973 = C21562.unmodifiableMap(new HashMap(map));
        this.f56971 = C21562.unmodifiableMap(new HashMap(c16413.f48251));
        this.f56972 = C21562.unmodifiableMap(new HashMap(c16413.f48254));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(new HashMap(c16413.f48253));
        this.f56976 = mapUnmodifiableMap;
        ArrayList<C16689> arrayList = new ArrayList(mapUnmodifiableMap.values());
        C8150.sort(arrayList, C10162.comparing(new C14008(0)));
        this.f56975 = C21562.unmodifiableList(arrayList);
        HashMap map2 = new HashMap();
        for (C16689 c16689 : arrayList) {
            Iterator it = c16689.m37820().iterator();
            while (it.hasNext()) {
                C15525.putIfAbsent(map2, ((String) it.next()).toLowerCase(Locale.ROOT), c16689);
            }
        }
        this.f56977 = C21562.unmodifiableMap(new HashMap(map2));
        Collection<C16689> collectionValues = this.f56973.values();
        ArrayList arrayList2 = new ArrayList(arrayList.size() + collectionValues.size() + 1);
        for (C16689 c166810 : collectionValues) {
            if (!c166810.m37812()) {
                arrayList2.add(c166810.m37815());
            }
        }
        for (C16689 c166811 : arrayList) {
            if (!c166811.m37812()) {
                arrayList2.add(c166811.m37815());
            }
        }
        Collections.sort(arrayList2);
        arrayList2.add(0, "Text");
        arrayList2.trimToSize();
        this.f56978 = C21562.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C16689 m43382(C19096 c19096, String str) {
        C16689 c16689 = (C16689) c19096.f56976.get(str);
        return c16689 != null ? c16689 : (C16689) c19096.f56973.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16689 m43378(C19096 c19096, String str) {
        C16689 c16689 = (C16689) c19096.f56977.get(str);
        return c16689 != null ? c16689 : (C16689) c19096.f56971.get(str);
    }
}
