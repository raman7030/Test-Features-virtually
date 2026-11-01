package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16122 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f47445;

    /* JADX INFO: renamed from: ۧ */
    public final List f47446;

    public C16122(List list, boolean z) {
        C15419.m35147(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f47446 = C21562.unmodifiableList(arrayList);
        this.f47445 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16122 m36703(String str) {
        EnumC8890 enumC8890;
        if (str == null) {
            Object[] objArr = {new C15419("/", EnumC8890.DIRECTORY, EnumC8044.DENY, true)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C12826.requireNonNull(obj);
            arrayList.add(obj);
            return new C16122(C21562.unmodifiableList(arrayList), false);
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(str).asObject();
            m36704(jSONObjectAsObject, "version", "rules");
            if (!"2".equals(jSONObjectAsObject.get("version").toString())) {
                throw new IllegalArgumentException("Unsupported file access policy version");
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it = jSONObjectAsObject.get("rules").asArray().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it.next()).asObject();
                m36704(jSONObjectAsObject2, MotionUtils.EASING_TYPE_PATH, "targetType", C0655am.f2262Q);
                String strM31907 = C14059.m31907(jSONObjectAsObject2.get(MotionUtils.EASING_TYPE_PATH).asString(), MotionUtils.EASING_TYPE_PATH);
                if (!hashSet.add(strM31907)) {
                    throw new IllegalArgumentException("Duplicate file access rule path");
                }
                String strAsString = jSONObjectAsObject2.get("targetType").asString();
                int iHashCode = strAsString.hashCode();
                if (iHashCode != -962584979) {
                    if (iHashCode != 3143036 || !strAsString.equals("file")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC8890 = EnumC8890.FILE;
                    arrayList2.add(new C15419(strM31907, enumC8890, m36706(jSONObjectAsObject2.get(C0655am.f2262Q).asString()), false));
                } else {
                    if (!strAsString.equals("directory")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC8890 = EnumC8890.DIRECTORY;
                    arrayList2.add(new C15419(strM31907, enumC8890, m36706(jSONObjectAsObject2.get(C0655am.f2262Q).asString()), false));
                }
            }
            return new C16122(arrayList2, false);
        } catch (RuntimeException | C5276 unused) {
            Object[] objArr2 = {new C15419("/", EnumC8890.DIRECTORY, EnumC8044.DENY, true)};
            ArrayList arrayList3 = new ArrayList(1);
            Object obj2 = objArr2[0];
            C12826.requireNonNull(obj2);
            arrayList3.add(obj2);
            return new C16122(C21562.unmodifiableList(arrayList3), true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m36707() {
        JSONArray jSONArrayArray = JSON.array();
        for (C15419 c15419 : this.f47446) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c15419.f44088).add("targetType", c15419.f44089.m20498()).add(C0655am.f2262Q, c15419.f44086.m18664()));
        }
        return JSON.object().add("version", 2).add("rules", jSONArrayArray).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9385 m36708(String str, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C15419 c15419 : this.f47446) {
            arrayList2.add(new C15419(c15419.f44088, c15419.f44089, c15419.f44086, c15419.m35148() || !m36705(c15419.f44088, str, arrayList)));
        }
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return new C9385(str, "acl-v2-".concat(C16111.m36665(C16111.m36668().digest(JSON.object().add("home", str).add("config", m36707()).add("managed", jSONArrayArray).toString().getBytes(StandardCharsets.UTF_8)))), arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36705(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14059.m31906(str, (String) it.next())) {
                return true;
            }
        }
        return !C14059.m31905(str) && C14059.m31906(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36704(JSONObject jSONObject, String... strArr) {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C12826.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C21562.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid file access policy fields");
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC8044 m36706(String str) {
        str.getClass();
        switch (str) {
            case "read_only":
                return EnumC8044.READ_ONLY;
            case "read_write":
                return EnumC8044.READ_WRITE;
            case "deny":
                return EnumC8044.DENY;
            default:
                throw new IllegalArgumentException("Invalid file access level");
        }
    }
}
