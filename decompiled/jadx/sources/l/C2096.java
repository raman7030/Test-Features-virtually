package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.json.JSONValue;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17CG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10630 f7020;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f7021;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5242 f7022;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f7023;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f7024;

    static {
        Object obj = new Object();
        f7024 = obj;
        ArrayList arrayList = new ArrayList();
        f7021 = arrayList;
        C10630 c10630 = new C10630();
        f7020 = c10630;
        f7022 = new C5242();
        f7023 = 1;
        synchronized (obj) {
            try {
                arrayList.clear();
                c10630.clear();
                f7023 = 1;
                String string = ApplicationC20075.f65008.getString("ndg_data", null);
                if (string != null && !string.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        f7023 = Math.max(1, jSONObject.getInt("nextId"));
                        JSONArray jSONArray = jSONObject.getJSONArray("groups");
                        for (int i = 0; i < jSONArray.size(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            f7021.add(new C13900(jSONObject2.getInt("id"), jSONObject2.getString("name")));
                        }
                        if (jSONObject.contains("assignments")) {
                            for (JSONObject.Member member : jSONObject.getJSONObject("assignments")) {
                                f7020.mo23658(Integer.parseInt(member.getName()), member.getValue().asInt());
                            }
                        }
                    } catch (JSONParseException | NumberFormatException unused) {
                        f7021.clear();
                        f7020.clear();
                        f7023 = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m6969();
        C12749.m31036(new C10374());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6950(Main main, C8257 c8257) {
        f7022.m1668(main, c8257);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6965() {
        ArrayList arrayList;
        synchronized (f7024) {
            arrayList = new ArrayList(f7021);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m6968() {
        return f7021.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6954(C20252 c20252) {
        synchronized (f7024) {
            Iterator it = f7021.iterator();
            while (it.hasNext()) {
                c20252.accept((C13900) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m6957(int i, String str) {
        synchronized (f7024) {
            for (C13900 c13900 : f7021) {
                if (c13900.f41423 != i && str.equals(c13900.f41424)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6951(String str) {
        synchronized (f7024) {
            int i = f7023;
            f7023 = i + 1;
            f7021.add(new C13900(i, str));
            m6966();
        }
        f7022.mo1664(Object.class);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m6962(int i, String str) {
        synchronized (f7024) {
            C13900 c13900M6961 = m6961(i);
            if (c13900M6961 == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            c13900M6961.f41424 = str;
            m6966();
        }
        f7022.mo1664(Object.class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6946(final int i) {
        ArrayList arrayListM6963 = m6963();
        synchronized (f7024) {
            if (m6961(i) == null) {
                throw new IllegalArgumentException("Unknown group " + i);
            }
            C5378.removeIf(f7021, new Predicate() { // from class: l.ۛܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C13900) obj).f41423 == i;
                }
            });
            C5378.removeIf(f7020.mo26663(), new Predicate() { // from class: l.ۨܶܳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC2869) obj).mo8792() == i;
                }
            });
        }
        m6953(arrayListM6963, true, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6952(ArrayList arrayList) {
        ArrayList arrayListM6963 = m6963();
        synchronized (f7024) {
            int size = arrayList.size();
            ArrayList<C13900> arrayList2 = f7021;
            if (size != arrayList2.size()) {
                throw new IllegalArgumentException("Unexpected group count " + arrayList.size());
            }
            HashMap map = new HashMap(arrayList2.size());
            for (C13900 c13900 : arrayList2) {
                map.put(Integer.valueOf(c13900.f41423), c13900);
            }
            ArrayList arrayList3 = new ArrayList(f7021.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num == null) {
                    throw new IllegalArgumentException("Group id can not be null");
                }
                C13900 c13901 = (C13900) map.remove(num);
                if (c13901 == null) {
                    throw new IllegalArgumentException("Unknown or duplicate group " + num);
                }
                arrayList3.add(c13901);
            }
            if (!map.isEmpty()) {
                throw new IllegalArgumentException("Missing group ids " + map.keySet());
            }
            ArrayList arrayList4 = f7021;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        m6953(arrayListM6963, true, true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6959() {
        ArrayList<AbstractC3577> arrayListM6963 = m6963();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (f7024) {
            for (C13900 c13900 : f7021) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", c13900.f41424);
                jSONArray.add(jSONObject3);
            }
            for (AbstractC3577 abstractC3577 : arrayListM6963) {
                int iM6967 = m6967(abstractC3577.f11356);
                C13900 c13900M6961 = iM6967 == -1 ? null : m6961(iM6967);
                jSONObject2.put(String.valueOf(abstractC3577.f11356), c13900M6961 == null ? "" : c13900M6961.f41424);
            }
        }
        jSONObject.put("groups", jSONArray);
        jSONObject.put("assignments", jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6949(JSONObject jSONObject, boolean z) {
        JSONValue value;
        String strAsString;
        String strTrim;
        ArrayList arrayListM6963 = m6963();
        C23073 c23073 = new C23073();
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
                    c23073.f74215.add(str);
                }
            }
        }
        HashMap map2 = new HashMap(arrayListM6963.size());
        Iterator it = arrayListM6963.iterator();
        while (it.hasNext()) {
            map2.put(Integer.valueOf(((AbstractC3577) it.next()).f11356), Boolean.TRUE);
        }
        JSONObject<JSONObject.Member> jSONObject2 = jSONObject.getJSONObject("assignments");
        if (jSONObject2 != null) {
            for (JSONObject.Member member : jSONObject2) {
                try {
                    int i2 = Integer.parseInt(member.getName());
                    if (map2.containsKey(Integer.valueOf(i2)) && (value = member.getValue()) != null && value.isString()) {
                        String strTrim2 = value.asString().trim();
                        if (strTrim2.isEmpty() || map.containsKey(strTrim2)) {
                            c23073.f74214.put(Integer.valueOf(i2), strTrim2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        synchronized (f7024) {
            try {
                if (z) {
                    m6955(c23073);
                } else {
                    m6956(c23073, arrayListM6963);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m6953(arrayListM6963, true, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m6964(int i) {
        int iM6967;
        synchronized (f7024) {
            iM6967 = m6967(i);
        }
        return iM6967;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6947(int i, int i2, Integer num) {
        int iM6943;
        ArrayList arrayListM6963 = m6963();
        int iM6944 = m6943(arrayListM6963, i);
        if (iM6944 < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unknown config "));
        }
        synchronized (f7024) {
            iM6943 = -1;
            if (m6967(i) == i2) {
                if (num != null) {
                    iM6943 = m6943(arrayListM6963, num.intValue());
                }
                if (iM6943 < 0) {
                    iM6943 = iM6944;
                }
            } else {
                int iM6945 = m6944(arrayListM6963, iM6944, i2, num);
                C10630 c10630 = f7020;
                if (i2 == -1) {
                    c10630.remove(i);
                } else {
                    if (m6961(i2) == null) {
                        throw new IllegalArgumentException("Unknown group " + i2);
                    }
                    c10630.mo23658(i, i2);
                }
                m6966();
                iM6943 = iM6945;
            }
        }
        if (iM6944 != iM6943) {
            C12749.m31034(iM6944, iM6943);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6944(ArrayList arrayList, int i, int i2, Integer num) {
        int iM6943 = num == null ? -1 : m6943(arrayList, num.intValue());
        if (iM6943 < 0) {
            ArrayList arrayList2 = f7021;
            C10630 c10630 = new C10630(arrayList2.size() + 1, 0);
            c10630.m43653();
            c10630.mo23658(-1, 0);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = ((C13900) arrayList2.get(i3)).f41423;
                i3++;
                c10630.mo23658(i4, i3);
            }
            int i5 = c10630.get(i2);
            if (i5 < 0) {
                throw new IllegalArgumentException(C19370.m44628(i2, "Unknown group "));
            }
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                if (c10630.get(m6967(((AbstractC3577) arrayList.get(i6)).f11356)) > i5) {
                    iM6943 = i6;
                }
            }
            iM6943 = size2;
        }
        return i < iM6943 ? iM6943 - 1 : iM6943;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6963() {
        ArrayList arrayList;
        synchronized (C12749.class) {
            arrayList = new ArrayList(C12749.m31046());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m6969() {
        m6953(m6963(), false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6953(ArrayList arrayList, boolean z, boolean z2) {
        C7551 c7551M6960;
        synchronized (f7024) {
            c7551M6960 = m6960(arrayList);
            if (z || c7551M6960.f23332) {
                m6966();
            }
        }
        InterfaceC1022 interfaceC1022 = c7551M6960.f23333;
        if (interfaceC1022 != null) {
            C12749.m31037(interfaceC1022);
        }
        if (z2 || c7551M6960.f23332 || c7551M6960.f23333 != null) {
            f7022.mo1664(Object.class);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6943(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC3577) arrayList.get(i2)).f11356 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7551 m6960(ArrayList arrayList) {
        C15859 c15859;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(Integer.valueOf(((AbstractC3577) it.next()).f11356), Boolean.TRUE);
        }
        boolean zRemoveIf = C5378.removeIf(f7020.mo26663(), new C5176(1, map));
        ArrayList arrayList2 = f7021;
        if (arrayList2.isEmpty()) {
            c15859 = null;
        } else {
            C15859 c158510 = new C15859(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c158510.add(((AbstractC3577) it2.next()).f11356);
            }
            C10630 c10630 = new C10630(arrayList2.size() + 1, 0);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
            c10630.mo23658(-1, 0);
            arrayList3.add(new C15859());
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = ((C13900) arrayList2.get(i)).f41423;
                i++;
                c10630.mo23658(i2, i);
                arrayList3.add(new C15859());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AbstractC3577 abstractC3577 = (AbstractC3577) it3.next();
                ((InterfaceC1022) arrayList3.get(c10630.get(m6967(abstractC3577.f11356)))).add(abstractC3577.f11356);
            }
            c15859 = new C15859(arrayList.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c15859.mo26283((InterfaceC1022) it4.next());
            }
            if (c158510.size() == c15859.size()) {
                int size2 = c158510.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (c158510.getInt(i3) == c15859.getInt(i3)) {
                    }
                }
                c15859 = null;
            }
        }
        return new C7551(zRemoveIf, c15859);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6958(HashMap map, InterfaceC2869 interfaceC2869) {
        if (map.containsKey(Integer.valueOf(interfaceC2869.mo8791()))) {
            return interfaceC2869.mo8792() != -1 && m6961(interfaceC2869.mo8792()) == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m6967(int i) {
        int iM26664 = f7020.m26664(i);
        if (iM26664 == -1 || m6961(iM26664) == null) {
            return -1;
        }
        return iM26664;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13900 m6961(int i) {
        for (C13900 c13900 : f7021) {
            if (c13900.f41423 == i) {
                return c13900;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6956(C23073 c23073, ArrayList arrayList) {
        ArrayList arrayList2 = f7021;
        arrayList2.clear();
        f7020.clear();
        f7023 = 1;
        for (String str : c23073.f74215) {
            int i = f7023;
            f7023 = i + 1;
            arrayList2.add(new C13900(i, str));
        }
        HashMap mapM6945 = m6945();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = ((AbstractC3577) it.next()).f11356;
            m6948(i2, (String) c23073.f74214.get(Integer.valueOf(i2)), mapM6945);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6955(C23073 c23073) {
        ArrayList<String> arrayList = c23073.f74215;
        ArrayList<C13900> arrayList2 = f7021;
        HashMap map = new HashMap(arrayList2.size());
        for (C13900 c13900 : arrayList2) {
            map.put(c13900.f41424, c13900);
        }
        ArrayList arrayList3 = new ArrayList(Math.max(arrayList2.size(), arrayList.size()));
        for (String str : arrayList) {
            C13900 c13901 = (C13900) map.remove(str);
            if (c13901 == null) {
                int i = f7023;
                f7023 = i + 1;
                c13901 = new C13900(i, str);
            }
            arrayList3.add(c13901);
        }
        for (C13900 c13902 : arrayList2) {
            if (map.containsKey(c13902.f41424)) {
                arrayList3.add(c13902);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        HashMap mapM6945 = m6945();
        for (Map.Entry entry : c23073.f74214.entrySet()) {
            m6948(((Integer) entry.getKey()).intValue(), (String) entry.getValue(), mapM6945);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m6945() {
        ArrayList<C13900> arrayList = f7021;
        HashMap map = new HashMap(arrayList.size());
        for (C13900 c13900 : arrayList) {
            map.put(c13900.f41424, Integer.valueOf(c13900.f41423));
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6948(int i, String str, HashMap map) {
        C10630 c10630 = f7020;
        if (str == null || str.isEmpty()) {
            c10630.remove(i);
            return;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            c10630.mo23658(i, num.intValue());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m6966() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextId", f7023);
        JSONArray jSONArray = new JSONArray();
        for (C13900 c13900 : f7021) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", c13900.f41423);
            jSONObject2.put("name", c13900.f41424);
            jSONArray.add(jSONObject2);
        }
        jSONObject.put("groups", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        InterfaceC12063 it = f7020.mo26663().iterator();
        while (it.hasNext()) {
            InterfaceC2869 interfaceC2869 = (InterfaceC2869) it.next();
            jSONObject3.put(String.valueOf(interfaceC2869.mo8791()), interfaceC2869.mo8792());
        }
        jSONObject.put("assignments", jSONObject3);
        ApplicationC20075.f65008.edit().putString("ndg_data", jSONObject.toString()).apply();
    }
}
