package l;

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
public final class C17600 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f53777;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map f53778;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f53779;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7308 f53780;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f53781;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f53782;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f53783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f53784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f53785;

    public C17600(C14777 c14777) {
        this.f53780 = c14777.f45141;
        Map map = c14777.f45138;
        int i = C7017.f21654;
        this.f53779 = C20195.unmodifiableMap(new HashMap(map));
        this.f53777 = C20195.unmodifiableMap(new HashMap(c14777.f45137));
        this.f53778 = C20195.unmodifiableMap(new HashMap(c14777.f45140));
        Map mapUnmodifiableMap = C20195.unmodifiableMap(new HashMap(c14777.f45139));
        this.f53782 = mapUnmodifiableMap;
        ArrayList<C15068> arrayList = new ArrayList(mapUnmodifiableMap.values());
        C6083.sort(arrayList, C8200.comparing(new C12247(0)));
        this.f53781 = C20195.unmodifiableList(arrayList);
        HashMap map2 = new HashMap();
        for (C15068 c15068 : arrayList) {
            Iterator it = c15068.m35662().iterator();
            while (it.hasNext()) {
                C13843.putIfAbsent(map2, ((String) it.next()).toLowerCase(Locale.ROOT), c15068);
            }
        }
        this.f53783 = C20195.unmodifiableMap(new HashMap(map2));
        Collection<C15068> collectionValues = this.f53779.values();
        ArrayList arrayList2 = new ArrayList(arrayList.size() + collectionValues.size() + 1);
        for (C15068 c15069 : collectionValues) {
            if (!c15069.m35654()) {
                arrayList2.add(c15069.m35657());
            }
        }
        for (C15068 c150610 : arrayList) {
            if (!c150610.m35654()) {
                arrayList2.add(c150610.m35657());
            }
        }
        Collections.sort(arrayList2);
        arrayList2.add(0, "Text");
        arrayList2.trimToSize();
        this.f53784 = C20195.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15068 m41136(C17600 c17600, String str) {
        C15068 c15068 = (C15068) c17600.f53782.get(str);
        return c15068 != null ? c15068 : (C15068) c17600.f53779.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15068 m41132(C17600 c17600, String str) {
        C15068 c15068 = (C15068) c17600.f53783.get(str);
        return c15068 != null ? c15068 : (C15068) c17600.f53777.get(str);
    }
}
