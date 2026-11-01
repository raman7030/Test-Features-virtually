package p067l;

import bin.p000mt.json.JSONArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3081 {

    /* JADX INFO: renamed from: ֫ */
    public static List f5571;

    /* JADX INFO: renamed from: ۧ */
    public static Map f5572;

    /* JADX INFO: renamed from: ܽ */
    public static int f5573;

    static {
        String string = ApplicationC21448.f67649.getString("tma", null);
        if (string != null) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    linkedHashSet.add(jSONArray.getString(i));
                }
                m5211(m5209(linkedHashSet));
                return;
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C21188(1));
        arrayList.add(new C21188(2));
        arrayList.add(new C21188(3));
        arrayList.add(new C21188(4));
        arrayList.add(new C21188(5));
        arrayList.add(new C21188(6));
        arrayList.add(new C21188(7));
        arrayList.add(new C21188(8));
        arrayList.add(new C21188(9));
        arrayList.add(new C21188(10));
        arrayList.add(new C21188(11));
        arrayList.add(new C21188(12));
        arrayList.add(new C21188(13));
        arrayList.add(new C21188(14));
        arrayList.add(C20517.f63369);
        arrayList.add(C11129.f30852);
        m5211(arrayList);
        m5214();
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m5213() {
        return f5571;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m5212() {
        m5210();
        return f5571;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Map m5215() {
        m5210();
        return f5572;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5210() {
        int iM34317 = C14976.m34317();
        if (iM34317 == f5573) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C18249 c18249 : C14976.m34301()) {
            ArrayList arrayList = new ArrayList();
            c18249.m41549(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add("plugin:" + c18249.m41531() + ":" + ((Class) it.next()).getName());
            }
        }
        for (AbstractC5094 abstractC5094 : f5571) {
            if (abstractC5094 instanceof C6435) {
                linkedHashSet.remove(abstractC5094.mo10845());
            }
        }
        if (linkedHashSet.isEmpty()) {
            f5573 = iM34317;
            return;
        }
        ArrayList arrayList2 = new ArrayList(f5571);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C6435((String) it2.next(), false));
        }
        m5211(arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m5209(LinkedHashSet linkedHashSet) {
        linkedHashSet.add("divider:secondary");
        linkedHashSet.add("divider:hidden");
        linkedHashSet.addAll(C21188.m47856());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (C18249 c18249 : C14976.m34301()) {
            ArrayList arrayList = new ArrayList();
            c18249.m41549(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet2.add("plugin:" + c18249.m41531() + ":" + ((Class) it.next()).getName());
            }
        }
        linkedHashSet.addAll(linkedHashSet2);
        HashMap map = new HashMap();
        List<AbstractC5094> list = f5571;
        if (list != null) {
            for (AbstractC5094 abstractC5094 : list) {
                if (abstractC5094 instanceof C6435) {
                    map.put(abstractC5094.mo10845(), (C6435) abstractC5094);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.startsWith("builtin:")) {
                Integer numM47855 = C21188.m47855(str);
                if (numM47855 != null) {
                    arrayList2.add(new C21188(numM47855.intValue()));
                }
            } else if (str.startsWith("plugin:") && linkedHashSet2.contains(str)) {
                C6435 c6435 = (C6435) map.get(str);
                if (c6435 == null) {
                    c6435 = new C6435(str, false);
                }
                arrayList2.add(c6435);
            } else if (str.startsWith("divider:")) {
                if (str.equals("divider:hidden")) {
                    arrayList2.add(C11129.f30852);
                } else if (str.equals("divider:secondary")) {
                    arrayList2.add(C20517.f63369);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5211(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC5094 abstractC5094 = (AbstractC5094) it.next();
            if (abstractC5094 == C20517.f63369) {
                i = 300;
            } else {
                if (abstractC5094 == C11129.f30852) {
                    break;
                }
                map.put(abstractC5094.mo10845(), Integer.valueOf(i));
                i++;
            }
        }
        f5571 = C21562.unmodifiableList(arrayList);
        f5572 = C21562.unmodifiableMap(map);
        f5573 = C14976.m34317();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m5214() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f5571.iterator();
        while (it.hasNext()) {
            jSONArray.add(((AbstractC5094) it.next()).mo10845());
        }
        ApplicationC21448.f67649.edit().putString("tma", jSONArray.toString()).apply();
    }
}
