package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W760 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14964 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f42743;

    /* JADX INFO: renamed from: ۧ */
    public final C4092 f42744 = new C4092();

    /* JADX INFO: renamed from: ܽ */
    public JSONObject f42745;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "List APK targets that mt_apk_workspace_open can open. Use prefix=\"\" for no filter; when the current APK is available, the first page may start with mt://current-apk. Other items recursively include APK files in the current Home folder and its subdirectories, and return paths relative to Home. Pass data.items[].path directly as mt_apk_workspace_open.path, choose mt_apk_workspace_open.temporary for the intended lifetime, pass limit=50 unless you need a different page size, and use mt_apk_continue for later pages.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "List Available APKs";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_list_available_apks";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f42743;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Home-relative path prefix filter for APK paths returned by this tool. Pass \\\"\\\" for no filter and to include mt://current-apk when available. Prefixes may name subdirectories such as release/.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Recommended value is 50; maximum 200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f42743 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f42745;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_list_available_apks. data.items[] contains APK targets that can be opened by mt_apk_workspace_open; pass items[i].path to mt_apk_workspace_open.path and choose mt_apk_workspace_open.temporary for the intended lifetime; nextActions carries continuation calls.", C3935.m7762(JSON.object().add("prefix", C3935.m7775("string", "Actual relative path prefix filter; empty string means no filter and may include mt://current-apk.")).add("items", C9417.m21913("type", "array", "description", "APK targets that can be opened by mt_apk_workspace_open.").add("items", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Path target to pass directly to mt_apk_workspace_open.path; may be mt://current-apk for the current APK or a relative APK path. Also set mt_apk_workspace_open.temporary when opening it.")).add("size", C3935.m7775("integer", "File size in bytes.")).add("lastModified", C3935.m7775("integer", "File modification time as epoch milliseconds.")).add("appLabel", C3935.m7772("string", "Resolved or raw application label when available.")).add("packageName", C3935.m7772("string", "Manifest package name when available.")).add("versionName", C3935.m7772("string", "Manifest versionName when available.")).add("versionCode", C3935.m7772("integer", "Manifest versionCode when available.")).add("manifestAvailable", C3935.m7775(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C3935.m7772("string", "Manifest parse error, or null.")), "Available APK target."))).add("pagination", C3935.m7774(C3935.m7767("Number of APK targets returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor.", "Total available count when known, or null."))), "Successful mt_apk_list_available_apks data."), C3935.m7770(C14214.m32686()), C3935.m7768("Executable continue actions; copy arguments directly.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue")));
        this.f42745 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C5577 c5577M34258 = m34258(jSONObject);
            int i = C10798.f29931;
            C4092 c4092 = this.f42744;
            String str = c5577M34258.f13479;
            int i2 = c5577M34258.f13478;
            c4092.getClass();
            return new C14663(C6918.m15849(C4092.m8231(str, i2, 0, true)));
        } catch (Throwable th) {
            int i3 = C10798.f29931;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m34259(C4763 c4763, JSONObject jSONObject) throws C5276 {
        JSONObject jSONObject2 = c4763.f10788;
        JSONObject jSONObject3 = c4763.f10789;
        String string = jSONObject2.getString("prefix", null);
        int i = jSONObject3.getInt("offset", -1);
        JSONValue jSONValue = jSONObject.get("limit");
        int iM5572 = c4763.f10791;
        if (jSONValue != null) {
            if (!jSONValue.isNumber()) {
                throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
            try {
                iM5572 = C3223.m5572(jSONValue);
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
        }
        m34257(iM5572);
        int i2 = C10798.f29931;
        this.f42744.getClass();
        return new C14663(C6918.m15849(C4092.m8231(string, iM5572, i, false)));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5577 m34258(JSONObject jSONObject) throws C5276 {
        for (String str : jSONObject.names()) {
            if (!"prefix".equals(str) && !"limit".equals(str)) {
                throw C5276.m11406("Invalid list_available_apks argument", str, jSONObject.get(str), JSON.array("prefix", "limit"), JSON.object().add("prefix", "").add("limit", 50));
            }
        }
        JSONValue jSONValue = jSONObject.get("prefix");
        if (jSONValue == null || jSONValue.isNull()) {
            throw C5276.m11406("Missing parameter: prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406("Invalid prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || jSONValue2.isNull()) {
            throw C5276.m11406("Missing parameter: limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        if (!jSONValue2.isNumber()) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        try {
            int iM5572 = C3223.m5572(jSONValue2);
            m34257(iM5572);
            return new C5577(strAsString, iM5572);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34257(int i) throws C5276 {
        if (i < 1 || i > 200) {
            throw C5276.m11406("Invalid limit", "limit", JSON.value(i), JSON.array(1, 200), JSON.object().add("limit", 50));
        }
    }
}
