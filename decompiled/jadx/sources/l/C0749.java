package l;

import bin.mt.json.JSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0749 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List f2798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Map f2799;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f2800;

    static {
        String string = ApplicationC20075.f65008.getString("tma", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    linkedHashSet.add(jSONArray.getString(i));
                }
                m2882(m2880(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19801(1));
        arrayList.add(new C19801(2));
        arrayList.add(new C19801(3));
        arrayList.add(new C19801(4));
        arrayList.add(new C19801(5));
        arrayList.add(new C19801(6));
        arrayList.add(new C19801(7));
        arrayList.add(new C19801(8));
        arrayList.add(new C19801(9));
        arrayList.add(new C19801(10));
        arrayList.add(new C19801(11));
        arrayList.add(new C19801(12));
        arrayList.add(new C19801(13));
        arrayList.add(new C19801(14));
        arrayList.add(C19095.f60135);
        arrayList.add(C9217.f27906);
        m2882(arrayList);
        m2885();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m2884() {
        return f2798;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m2883() {
        m2881();
        return f2798;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Map m2886() {
        m2881();
        return f2799;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2881() {
        int iM32218 = C13265.m32218();
        if (iM32218 == f2800) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C16709 c16709 : C13265.m32202()) {
            ArrayList arrayList = new ArrayList();
            c16709.m39313(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c16709.m39295() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC2867 abstractC2867 : f2798) {
            if (abstractC2867 instanceof C4278) {
                linkedHashSet.remove(abstractC2867.mo8778());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f2800 = iM32218;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f2798);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C4278((String) it2.next(), false));
        }
        m2882(arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2880(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C19801.m45545());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C16709 c16709 : C13265.m32202()) {
            ArrayList arrayList = new ArrayList();
            c16709.m39313(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c16709.m39295() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC2867> list = f2798;
        if (list != null) {
            for (AbstractC2867 abstractC2867 : list) {
                if (abstractC2867 instanceof C4278) {
                    map.put(abstractC2867.mo8778(), (C4278) abstractC2867);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM45544 = C19801.m45544(str);
                if (numM45544 != null) {
                    arrayList2.add(new C19801(numM45544.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C4278 c4278 = (C4278) map.get(str);
                if (c4278 == null) {
                    c4278 = new C4278(str, false);
                }
                arrayList2.add(c4278);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C9217.f27906);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C19095.f60135);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2882(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC2867 abstractC2867 = (AbstractC2867) it.next();
            if (abstractC2867 == C19095.f60135) {
                i = 300;
            } else {
                if (abstractC2867 == C9217.f27906) {
                    break;
                }
                map.put(abstractC2867.mo8778(), Integer.valueOf(i));
                i++;
            }
        }
        f2798 = C20195.unmodifiableList(arrayList);
        f2799 = C20195.unmodifiableMap(map);
        f2800 = C13265.m32218();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m2885() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f2798.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC2867) it.next()).mo8778());
        }
        ApplicationC20075.f65008.edit().putString("tma", jSONArray.toString()).apply();
    }
}
