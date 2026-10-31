package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14471 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f44344;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f44345;

    public C14471(List list, boolean z) {
        C13732.m33033(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f44345 = C20195.unmodifiableList(arrayList);
        this.f44344 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14471 m34562(String str) {
        EnumC6862 enumC6862;
        if (str == null) {
            Object[] objArr = {new C13732("/", EnumC6862.DIRECTORY, EnumC5972.DENY, true)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            arrayList.add(obj);
            return new C14471(C20195.unmodifiableList(arrayList), false);
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(str).asObject();
            m34563(jSONObjectAsObject, "version", "rules");
            if (!"2".equals(jSONObjectAsObject.get("version").toString())) {
                throw new IllegalArgumentException("Unsupported file access policy version");
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it = jSONObjectAsObject.get("rules").asArray().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it.next()).asObject();
                m34563(jSONObjectAsObject2, MotionUtils.EASING_TYPE_PATH, "targetType", am.Q);
                String strM29847 = C12301.m29847(jSONObjectAsObject2.get(MotionUtils.EASING_TYPE_PATH).asString(), MotionUtils.EASING_TYPE_PATH);
                if (!hashSet.add(strM29847)) {
                    throw new IllegalArgumentException("Duplicate file access rule path");
                }
                String strAsString = jSONObjectAsObject2.get("targetType").asString();
                int iHashCode = strAsString.hashCode();
                if (iHashCode != -962584979) {
                    if (iHashCode != 3143036 || !strAsString.equals("file")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC6862 = EnumC6862.FILE;
                    arrayList2.add(new C13732(strM29847, enumC6862, m34565(jSONObjectAsObject2.get(am.Q).asString()), false));
                } else {
                    if (!strAsString.equals("directory")) {
                        throw new IllegalArgumentException("Invalid file access rule type");
                    }
                    enumC6862 = EnumC6862.DIRECTORY;
                    arrayList2.add(new C13732(strM29847, enumC6862, m34565(jSONObjectAsObject2.get(am.Q).asString()), false));
                }
            }
            return new C14471(arrayList2, false);
        } catch (RuntimeException | C3059 unused) {
            Object[] objArr2 = {new C13732("/", EnumC6862.DIRECTORY, EnumC5972.DENY, true)};
            ArrayList arrayList3 = new ArrayList(1);
            Object obj2 = objArr2[0];
            C11003.requireNonNull(obj2);
            arrayList3.add(obj2);
            return new C14471(C20195.unmodifiableList(arrayList3), true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34566() {
        JSONArray jSONArrayArray = JSON.array();
        for (C13732 c13732 : this.f44345) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c13732.f41009).add("targetType", c13732.f41010.m18549()).add(am.Q, c13732.f41007.m16738()));
        }
        return JSON.object().add("version", 2).add("rules", jSONArrayArray).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7383 m34567(String str, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C13732 c13732 : this.f44345) {
            arrayList2.add(new C13732(c13732.f41009, c13732.f41010, c13732.f41007, c13732.m33034() || !m34564(c13732.f41009, str, arrayList)));
        }
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return new C7383(str, "acl-v2-".concat(C14460.m34531(C14460.m34534().digest(JSON.object().add("home", str).add("config", m34566()).add("managed", jSONArrayArray).toString().getBytes(StandardCharsets.UTF_8)))), arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34564(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C12301.m29846(str, (String) it.next())) {
                return true;
            }
        }
        return !C12301.m29845(str) && C12301.m29846(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34563(JSONObject jSONObject, String... strArr) {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C11003.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C20195.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid file access policy fields");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC5972 m34565(String str) {
        str.getClass();
        switch (str) {
            case "read_only":
                return EnumC5972.READ_ONLY;
            case "read_write":
                return EnumC5972.READ_WRITE;
            case "deny":
                return EnumC5972.DENY;
            default:
                throw new IllegalArgumentException("Invalid file access level");
        }
    }
}
