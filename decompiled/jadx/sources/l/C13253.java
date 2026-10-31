package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W760 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13253 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f39679;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1813 f39680 = new C1813();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public JSONObject f39681;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "List APK targets that mt_apk_workspace_open can open. Use prefix=\"\" for no filter; when the current APK is available, the first page may start with mt://current-apk. Other items recursively include APK files in the current Home folder and its subdirectories, and return paths relative to Home. Pass data.items[].path directly as mt_apk_workspace_open.path, choose mt_apk_workspace_open.temporary for the intended lifetime, pass limit=50 unless you need a different page size, and use mt_apk_continue for later pages.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "List Available APKs";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_list_available_apks";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f39679;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Home-relative path prefix filter for APK paths returned by this tool. Pass \\\"\\\" for no filter and to include mt://current-apk when available. Prefixes may name subdirectories such as release/.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Recommended value is 50; maximum 200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f39679 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f39681;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_list_available_apks. data.items[] contains APK targets that can be opened by mt_apk_workspace_open; pass items[i].path to mt_apk_workspace_open.path and choose mt_apk_workspace_open.temporary for the intended lifetime; nextActions carries continuation calls.", C1648.m5532(JSON.object().add("prefix", C1648.m5545("string", "Actual relative path prefix filter; empty string means no filter and may include mt://current-apk.")).add("items", C7416.m19939("type", "array", "description", "APK targets that can be opened by mt_apk_workspace_open.").add("items", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Path target to pass directly to mt_apk_workspace_open.path; may be mt://current-apk for the current APK or a relative APK path. Also set mt_apk_workspace_open.temporary when opening it.")).add("size", C1648.m5545("integer", "File size in bytes.")).add("lastModified", C1648.m5545("integer", "File modification time as epoch milliseconds.")).add("appLabel", C1648.m5542("string", "Resolved or raw application label when available.")).add("packageName", C1648.m5542("string", "Manifest package name when available.")).add("versionName", C1648.m5542("string", "Manifest versionName when available.")).add("versionCode", C1648.m5542("integer", "Manifest versionCode when available.")).add("manifestAvailable", C1648.m5545(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C1648.m5542("string", "Manifest parse error, or null.")), "Available APK target."))).add("pagination", C1648.m5544(C1648.m5537("Number of APK targets returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor.", "Total available count when known, or null."))), "Successful mt_apk_list_available_apks data."), C1648.m5540(C12464.m30621()), C1648.m5538("Executable continue actions; copy arguments directly.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue")));
        this.f39681 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C3376 c3376M32159 = m32159(jSONObject);
            int i = C8869.f27007;
            C1813 c1813 = this.f39680;
            String str = c3376M32159.f10672;
            int i2 = c3376M32159.f10671;
            c1813.getClass();
            return new C12936(C4787.m13969(C1813.m6033(str, i2, 0, true)));
        } catch (Throwable th) {
            int i3 = C8869.f27007;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m32160(C2519 c2519, JSONObject jSONObject) throws C3059 {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        String string = jSONObject2.getString("prefix", null);
        int i = jSONObject3.getInt("offset", -1);
        JSONValue jSONValue = jSONObject.get("limit");
        int iM3253 = c2519.f7999;
        if (jSONValue != null) {
            if (!jSONValue.isNumber()) {
                throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
            try {
                iM3253 = C0899.m3253(jSONValue);
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
        }
        m32158(iM3253);
        int i2 = C8869.f27007;
        this.f39680.getClass();
        return new C12936(C4787.m13969(C1813.m6033(string, iM3253, i, false)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3376 m32159(JSONObject jSONObject) throws C3059 {
        for (String str : jSONObject.names()) {
            if (!"prefix".equals(str) && !"limit".equals(str)) {
                throw C3059.m9364("Invalid list_available_apks argument", str, jSONObject.get(str), JSON.array("prefix", "limit"), JSON.object().add("prefix", "").add("limit", 50));
            }
        }
        JSONValue jSONValue = jSONObject.get("prefix");
        if (jSONValue == null || jSONValue.isNull()) {
            throw C3059.m9364("Missing parameter: prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || jSONValue2.isNull()) {
            throw C3059.m9364("Missing parameter: limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        if (!jSONValue2.isNumber()) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        try {
            int iM3253 = C0899.m3253(jSONValue2);
            m32158(iM3253);
            return new C3376(strAsString, iM3253);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32158(int i) throws C3059 {
        if (i < 1 || i > 200) {
            throw C3059.m9364("Invalid limit", "limit", JSON.value(i), JSON.array(1, 200), JSON.object().add("limit", 50));
        }
    }
}
