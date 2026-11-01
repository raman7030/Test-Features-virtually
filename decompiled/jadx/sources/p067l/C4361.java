package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONParseException;
import bin.p000mt.json.JSONValue;
import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17CG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4361 {

    /* JADX INFO: renamed from: ֫ */
    public static final C12472 f9804;

    /* JADX INFO: renamed from: ۧ */
    public static final ArrayList f9805;

    /* JADX INFO: renamed from: ܽ */
    public static final C7350 f9806;

    /* JADX INFO: renamed from: ܿ */
    public static int f9807;

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f9808;

    static {
        Object obj = new Object();
        f9808 = obj;
        ArrayList arrayList = new ArrayList();
        f9805 = arrayList;
        C12472 c12472 = new C12472();
        f9804 = c12472;
        f9806 = new C7350();
        f9807 = 1;
        synchronized (obj) {
            arrayList.clear();
            c12472.clear();
            f9807 = 1;
            String string = ApplicationC21448.f67649.getString("ndg_data", null);
            if (string != null && !string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f9807 = Math.max(1, jSONObject.getInt("nextId"));
                    JSONArray jSONArray = jSONObject.getJSONArray("groups");
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        f9805.add(new C15579(jSONObject2.getInt("id"), jSONObject2.getString("name")));
                    }
                    if (jSONObject.contains("assignments")) {
                        for (JSONObject.Member member : jSONObject.getJSONObject("assignments")) {
                            f9804.mo25657(Integer.parseInt(member.getName()), member.getValue().asInt());
                        }
                    }
                } catch (JSONParseException | NumberFormatException unused) {
                    f9805.clear();
                    f9804.clear();
                    f9807 = 1;
                }
            }
        }
        m9095();
        C14486.m33120(new C12228());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9076(Main main, C10216 c10216) {
        f9806.m4066(main, c10216);
    }

    /* JADX INFO: renamed from: ܽ */
    public static ArrayList m9091() {
        ArrayList arrayList;
        synchronized (f9808) {
            arrayList = new ArrayList(f9805);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m9094() {
        return f9805.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9080(C21616 c21616) {
        synchronized (f9808) {
            Iterator it = f9805.iterator();
            while (it.hasNext()) {
                c21616.accept((C15579) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9083(int i, String str) {
        synchronized (f9808) {
            for (C15579 c15579 : f9805) {
                if (c15579.f44504 != i && str.equals(c15579.f44505)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9077(String str) {
        synchronized (f9808) {
            int i = f9807;
            f9807 = i + 1;
            f9805.add(new C15579(i, str));
            m9092();
        }
        f9806.mo4062(Object.class);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m9088(int i, String str) {
        synchronized (f9808) {
            C15579 c15579M9087 = m9087(i);
            if (c15579M9087 == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            c15579M9087.f44505 = str;
            m9092();
        }
        f9806.mo4062(Object.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9072(final int i) {
        ArrayList arrayListM9089 = m9089();
        synchronized (f9808) {
            if (m9087(i) == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            C7480.removeIf(f9805, new Predicate() { // from class: l.ۛܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m18991or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C15579) obj).f44504 == i;
                }
            });
            C7480.removeIf(f9804.mo28703(), new Predicate() { // from class: l.ۨܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m30889or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC5096) obj).mo10859() == i;
                }
            });
        }
        m9079(arrayListM9089, true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9078(ArrayList arrayList) {
        ArrayList arrayListM9089 = m9089();
        synchronized (f9808) {
            int size = arrayList.size();
            ArrayList<C15579> arrayList2 = f9805;
            if (size != arrayList2.size()) {
                throw new IllegalArgumentException("Unexpected group count " + arrayList.size());
            }
            HashMap map = new HashMap(arrayList2.size());
            for (C15579 c15579 : arrayList2) {
                map.put(Integer.valueOf(c15579.f44504), c15579);
            }
            ArrayList arrayList3 = new ArrayList(f9805.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num == null) {
                    throw new IllegalArgumentException("Group id can not be null");
                }
                C15579 c155710 = (C15579) map.remove(num);
                if (c155710 == null) {
                    throw new IllegalArgumentException("Unknown or duplicate group " + num);
                }
                arrayList3.add(c155710);
            }
            if (!map.isEmpty()) {
                throw new IllegalArgumentException("Missing group ids " + map.keySet());
            }
            ArrayList arrayList4 = f9805;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        m9079(arrayListM9089, true, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m9085() {
        ArrayList<AbstractC5769> arrayListM9089 = m9089();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f9808) {
            for (C15579 c15579 : f9805) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", c15579.f44505);
                jSONArray.add(jSONObject3);
            }
            for (AbstractC5769 abstractC5769 : arrayListM9089) {
                int iM9093 = m9093(abstractC5769.f14161);
                C15579 c15579M9087 = iM9093 == -1 ? null : m9087(iM9093);
                jSONObject2.put(String.valueOf(abstractC5769.f14161), c15579M9087 == null ? "" : c15579M9087.f44505);
            }
        }
        jSONObject.put("groups", jSONArray);
        jSONObject.put("assignments", jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX INFO: renamed from: ֫ */
    public static void m9075(JSONObject jSONObject, boolean z) {
        JSONValue value;
        String strAsString;
        String strTrim;
        ArrayList arrayListM9089 = m9089();
        C24297 c24297 = new C24297();
        HashMap map = new HashMap();
        JSONArray jSONArray = jSONObject.getJSONArray("groups");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONValue jSONValue = jSONArray.get(i);
                String str = null;
                if (jSONValue != null) {
                    if (jSONValue.isObject()) {
                        JSONValue jSONValue2 = jSONValue.asObject().get("name");
                        if (jSONValue2 != null && jSONValue2.isString()) {
                            strAsString = jSONValue2.asString();
                            strTrim = strAsString.trim();
                            if (!strTrim.isEmpty()) {
                                str = strTrim;
                            }
                        }
                    } else if (jSONValue.isString()) {
                        strAsString = jSONValue.asString();
                        strTrim = strAsString.trim();
                        if (!strTrim.isEmpty()) {
                            str = strTrim;
                        }
                    }
                }
                if (str != null && !map.containsKey(str)) {
                    map.put(str, Boolean.TRUE);
                    c24297.f76960.add(str);
                }
            }
        }
        HashMap map2 = new HashMap(arrayListM9089.size());
        Iterator it = arrayListM9089.iterator();
        while (it.hasNext()) {
            map2.put(Integer.valueOf(((AbstractC5769) it.next()).f14161), Boolean.TRUE);
        }
        JSONObject<JSONObject.Member> jSONObject2 = jSONObject.getJSONObject("assignments");
        if (jSONObject2 != null) {
            for (JSONObject.Member member : jSONObject2) {
                try {
                    int i2 = Integer.parseInt(member.getName());
                    if (map2.containsKey(Integer.valueOf(i2)) && (value = member.getValue()) != null && value.isString()) {
                        String strTrim2 = value.asString().trim();
                        if (strTrim2.isEmpty() || map.containsKey(strTrim2)) {
                            c24297.f76959.put(Integer.valueOf(i2), strTrim2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        synchronized (f9808) {
            try {
                if (z) {
                    m9081(c24297);
                } else {
                    m9082(c24297, arrayListM9089);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m9079(arrayListM9089, true, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m9090(int i) {
        int iM9093;
        synchronized (f9808) {
            iM9093 = m9093(i);
        }
        return iM9093;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9073(int i, int i2, Integer num) {
        int iM9069;
        ArrayList arrayListM9089 = m9089();
        int iM90610 = m9069(arrayListM9089, i);
        if (iM90610 < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unknown config "));
        }
        synchronized (f9808) {
            iM9069 = -1;
            if (m9093(i) == i2) {
                if (num != null) {
                    iM9069 = m9069(arrayListM9089, num.intValue());
                }
                if (iM9069 < 0) {
                    iM9069 = iM90610;
                }
            } else {
                int iM9070 = m9070(arrayListM9089, iM90610, i2, num);
                C12472 c12472 = f9804;
                if (i2 == -1) {
                    c12472.remove(i);
                } else {
                    if (m9087(i2) == null) {
                        throw new IllegalArgumentException("Unknown group " + i2);
                    }
                    c12472.mo25657(i, i2);
                }
                m9092();
                iM9069 = iM9070;
            }
        }
        if (iM90610 != iM9069) {
            C14486.m33118(iM90610, iM9069);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m9070(ArrayList arrayList, int i, int i2, Integer num) {
        int iM9069 = num == null ? -1 : m9069(arrayList, num.intValue());
        if (iM9069 < 0) {
            ArrayList arrayList2 = f9805;
            C12472 c12472 = new C12472(arrayList2.size() + 1, 0);
            c12472.m45919();
            c12472.mo25657(-1, 0);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = ((C15579) arrayList2.get(i3)).f44504;
                i3++;
                c12472.mo25657(i4, i3);
            }
            int i5 = c12472.get(i2);
            if (i5 < 0) {
                throw new IllegalArgumentException(C20778.m46922(i2, "Unknown group "));
            }
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                if (c12472.get(m9093(((AbstractC5769) arrayList.get(i6)).f14161)) > i5) {
                    iM9069 = i6;
                }
            }
            iM9069 = size2;
        }
        return i < iM9069 ? iM9069 - 1 : iM9069;
    }

    /* JADX INFO: renamed from: ܳ */
    public static ArrayList m9089() {
        ArrayList arrayList;
        synchronized (C14486.class) {
            arrayList = new ArrayList(C14486.m33130());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m9095() {
        m9079(m9089(), false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9079(ArrayList arrayList, boolean z, boolean z2) {
        C9545 c9545M9086;
        synchronized (f9808) {
            c9545M9086 = m9086(arrayList);
            if (z || c9545M9086.f26244) {
                m9092();
            }
        }
        InterfaceC3340 interfaceC3340 = c9545M9086.f26245;
        if (interfaceC3340 != null) {
            C14486.m33121(interfaceC3340);
        }
        if (z2 || c9545M9086.f26244 || c9545M9086.f26245 != null) {
            f9806.mo4062(Object.class);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m9069(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC5769) arrayList.get(i2)).f14161 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9545 m9086(ArrayList arrayList) {
        C17441 c17441;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(Integer.valueOf(((AbstractC5769) it.next()).f14161), Boolean.TRUE);
        }
        boolean zRemoveIf = C7480.removeIf(f9804.mo28703(), new C7288(1, map));
        ArrayList arrayList2 = f9805;
        if (arrayList2.isEmpty()) {
            c17441 = null;
        } else {
            C17441 c17442 = new C17441(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c17442.add(((AbstractC5769) it2.next()).f14161);
            }
            C12472 c12472 = new C12472(arrayList2.size() + 1, 0);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
            c12472.mo25657(-1, 0);
            arrayList3.add(new C17441());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = ((C15579) arrayList2.get(i)).f44504;
                i++;
                c12472.mo25657(i2, i);
                arrayList3.add(new C17441());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC5769 abstractC5769 = (AbstractC5769) it3.next();
                ((InterfaceC3340) arrayList3.get(c12472.get(m9093(abstractC5769.f14161)))).add(abstractC5769.f14161);
            }
            c17441 = new C17441(arrayList.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c17441.mo28312((InterfaceC3340) it4.next());
            }
            if (c17442.size() == c17441.size()) {
                int size2 = c17442.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (c17442.getInt(i3) == c17441.getInt(i3)) {
                    }
                }
                c17441 = null;
            }
        }
        return new C9545(zRemoveIf, c17441);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m9084(HashMap map, InterfaceC5096 interfaceC5096) {
        if (map.containsKey(Integer.valueOf(interfaceC5096.mo10858()))) {
            return interfaceC5096.mo10859() != -1 && m9087(interfaceC5096.mo10859()) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m9093(int i) {
        int iM28704 = f9804.m28704(i);
        if (iM28704 == -1 || m9087(iM28704) == null) {
            return -1;
        }
        return iM28704;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15579 m9087(int i) {
        for (C15579 c15579 : f9805) {
            if (c15579.f44504 == i) {
                return c15579;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9082(C24297 c24297, ArrayList arrayList) {
        ArrayList arrayList2 = f9805;
        arrayList2.clear();
        f9804.clear();
        f9807 = 1;
        for (String str : c24297.f76960) {
            int i = f9807;
            f9807 = i + 1;
            arrayList2.add(new C15579(i, str));
        }
        HashMap mapM9071 = m9071();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = ((AbstractC5769) it.next()).f14161;
            m9074(i2, (String) c24297.f76959.get(Integer.valueOf(i2)), mapM9071);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9081(C24297 c24297) {
        ArrayList<String> arrayList = c24297.f76960;
        ArrayList<C15579> arrayList2 = f9805;
        HashMap map = new HashMap(arrayList2.size());
        for (C15579 c15579 : arrayList2) {
            map.put(c15579.f44505, c15579);
        }
        ArrayList arrayList3 = new ArrayList(Math.max(arrayList2.size(), arrayList.size()));
        for (String str : arrayList) {
            C15579 c155710 = (C15579) map.remove(str);
            if (c155710 == null) {
                int i = f9807;
                f9807 = i + 1;
                c155710 = new C15579(i, str);
            }
            arrayList3.add(c155710);
        }
        for (C15579 c155711 : arrayList2) {
            if (map.containsKey(c155711.f44505)) {
                arrayList3.add(c155711);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        HashMap mapM9071 = m9071();
        for (Map.Entry entry : c24297.f76959.entrySet()) {
            m9074(((Integer) entry.getKey()).intValue(), (String) entry.getValue(), mapM9071);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m9071() {
        ArrayList<C15579> arrayList = f9805;
        HashMap map = new HashMap(arrayList.size());
        for (C15579 c15579 : arrayList) {
            map.put(c15579.f44505, Integer.valueOf(c15579.f44504));
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9074(int i, String str, HashMap map) {
        C12472 c12472 = f9804;
        if (str == null || str.isEmpty()) {
            c12472.remove(i);
            return;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            c12472.mo25657(i, num.intValue());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m9092() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextId", f9807);
        JSONArray jSONArray = new JSONArray();
        for (C15579 c15579 : f9805) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", c15579.f44504);
            jSONObject2.put("name", c15579.f44505);
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("groups", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        InterfaceC13833 it = f9804.mo28703().iterator();
        while (it.hasNext()) {
            InterfaceC5096 interfaceC5096 = (InterfaceC5096) it.next();
            jSONObject3.put(String.valueOf(interfaceC5096.mo10858()), interfaceC5096.mo10859());
        }
        jSONObject.put("assignments", jSONObject3);
        ApplicationC21448.f67649.edit().putString("ndg_data", jSONObject.toString()).apply();
    }
}
