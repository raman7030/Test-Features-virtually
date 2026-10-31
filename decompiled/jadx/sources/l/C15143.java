package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.HashSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܶۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15143 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f46275;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f46276;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12322 f46277;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Copy the raw content of one ordinary zip_entry between an APK workspace and a local file, preserving the source. workspace_to_local reads the base APK when editSessionId=\"\" or the edited session otherwise; overwrite controls the local destination. local_to_edit_session requires a non-empty editSessionId and copies into the entry; overwrite controls replacement of an existing entry; a deleted entry can be recreated. localPath may be absolute or relative to Home and requires file access permission. Both directions reject classes*.dex, resources.arsc, AXML, and directories. ZIP metadata is not copied and text encoding is not changed. Large files are supported; disconnecting does not cancel a copy already in progress. Inspect failure diagnostics before retrying. After success, nextActions checks local file metadata or reads the first entry bytes; it does not verify complete content equality.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Copy APK Entry";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_copy_entry";
    }

    public C15143(C12322 c12322) {
        this.f46277 = c12322;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f46275 == null) {
            this.f46275 = C18736.m43390(JSON.object().add("direction", C1648.m5539("workspace_to_local copies an entry view to localPath; local_to_edit_session copies localPath into an edit session and requires a non-empty editSessionId.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C1648.m5545("string", "Non-empty workspace id returned by mt_apk_workspace_open.")).add("editSessionId", C1648.m5545("string", "For workspace_to_local, pass an empty string to read the base workspace or a non-empty id to read that edit-session view. For local_to_edit_session, this must be a non-empty id returned by mt_apk_session_create.")).add("locator", C1648.m5545("string", "Exact ordinary zip_entry locator. classes*.dex, resources.arsc, AXML, and ZIP directory entries are rejected in both directions.")).add("localPath", C1648.m5545("string", "Non-empty absolute or Home-relative local source or destination path, selected by direction.")), ClassTransform.BOOLEAN, "For workspace_to_local, true permits replacing an existing regular local file. For local_to_edit_session, true permits replacing an ordinary entry in the current session view; a tombstoned entry counts as missing.", "overwrite", "Arguments for mt_apk_copy_entry.");
        }
        return this.f46275;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f46276 == null) {
            this.f46276 = C8089.m21459();
        }
        return this.f46276;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if ((!"direction".equals(str) && !"workspaceId".equals(str) && !"editSessionId".equals(str) && !"locator".equals(str) && !"localPath".equals(str) && !"overwrite".equals(str)) || !hashSet.add(str)) {
                throw m35850(jSONObject.get(str), "Invalid workspace entry copy argument", str);
            }
        }
        String[] strArr = {"direction", "workspaceId", "editSessionId", "locator", "localPath", "overwrite"};
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            if (!hashSet.contains(str2)) {
                throw m35850(null, C20094.m46315("Missing parameter: ", str2), str2);
            }
        }
        JSONValue jSONValue = jSONObject.get("direction");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m35850(jSONValue, "Invalid direction", "direction");
        }
        String strAsString = jSONValue.asString();
        if (!"workspace_to_local".equals(strAsString) && !"local_to_edit_session".equals(strAsString)) {
            throw C3059.m9364("Invalid direction", "direction", jSONValue, JSON.array("workspace_to_local", "local_to_edit_session"), m35852());
        }
        String strM35849 = m35849(jSONObject, "workspaceId");
        String strM35851 = m35851(jSONObject, "editSessionId");
        String strM31944 = C13169.m31944(m35849(jSONObject, "locator"));
        String strM35852 = m35851(jSONObject, "localPath");
        JSONValue jSONValue2 = jSONObject.get("overwrite");
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m35850(jSONValue2, "Invalid boolean argument", "overwrite");
        }
        C13027 c13027M29884 = this.f46277.m29884(strAsString, strM35849, strM35851, strM31944, strM35852, jSONValue2.asBoolean());
        String strM31925 = C13169.m31925("zip_entry", c13027M29884.f38994, (String) null, (String) null, (String) null, (String) null);
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c13027M29884.f38991;
        JSONObject jSONObjectAdd = jSONObjectObject.add("direction", str3);
        String str4 = c13027M29884.f38997;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("workspaceId", str4);
        String str5 = c13027M29884.f38992;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("editSessionId", str5).add("locator", strM31925);
        String str6 = c13027M29884.f38996;
        return new C12936(C19993.m46095(jSONObjectAdd3.add("localPath", str6).add("warnings", c13027M29884.f38993).add("size", c13027M29884.f38995), "workspace_to_local".equals(str3) ? JSON.array().add(C10115.m25398(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str6), "mt_file_stat", "inspect", "Inspect the copied local file at its normalized destination path.")) : JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str4, "editSessionId", str5).add("locator", strM31925).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "inspect", "Read back the first raw byte window from the committed edit-session entry."))));
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectM39755 = C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", C16895.m39755(jSONObject, "direction", JSON.object(), "direction"), "workspaceId"), "editSessionId");
        JSONValue jSONValueValue = jSONObject.get("locator");
        if (jSONValueValue == null || !jSONValueValue.isString()) {
            String string = jSONObject.getString("entryName", null);
            jSONValueValue = (string == null || string.isEmpty()) ? JSON.NULL : JSON.value(C13169.m31925("zip_entry", string, (String) null, (String) null, (String) null, (String) null));
        }
        JSONObject jSONObjectM39756 = C16895.m39755(jSONObject, "localPath", jSONObjectM39755.add("locator", jSONValueValue), "localPath");
        JSONValue jSONValue = jSONObject.get("changed");
        boolean zAsBoolean = false;
        JSONObject jSONObjectM39757 = C16895.m39755(jSONObject, "operationMode", jSONObjectM39756.add("changed", (jSONValue == null || !jSONValue.isBoolean()) ? false : jSONValue.asBoolean()), "operationMode");
        JSONValue jSONValue2 = jSONObject.get("stateKnown");
        JSONObject jSONObjectAdd = jSONObjectM39757.add("stateKnown", (jSONValue2 == null || !jSONValue2.isBoolean()) ? true : jSONValue2.asBoolean());
        JSONValue jSONValue3 = jSONObject.get("warnings");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONValue3 != null && jSONValue3.isArray()) {
            for (JSONValue jSONValue4 : jSONValue3.asArray()) {
                if (jSONValue4.isString()) {
                    jSONArrayArray.add(jSONValue4.asString());
                }
            }
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("warnings", jSONArrayArray);
        JSONValue jSONValue5 = jSONObject.get("bytesCopied");
        if (jSONValue5 == null || !jSONValue5.isNumber()) {
            jSONValue5 = JSON.NULL;
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("bytesCopied", jSONValue5);
        JSONValue jSONValue6 = jSONObject.get("safeToRetry");
        if (jSONValue6 != null && jSONValue6.isBoolean()) {
            zAsBoolean = jSONValue6.asBoolean();
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("safeToRetry", zAsBoolean);
        JSONArray<JSONValue> jSONArray = c3059.f9604;
        JSONArray jSONArrayArray2 = JSON.array();
        for (JSONValue jSONValue7 : jSONArray) {
            if (jSONValue7.isObject()) {
                JSONObject jSONObjectAsObject = jSONValue7.asObject();
                if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null)) && "retry".equals(jSONObjectAsObject.getString("purpose", null))) {
                    jSONArrayArray2.add(new JSONObject(jSONObjectAsObject));
                }
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd4, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35851(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m35850(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35849(JSONObject jSONObject, String str) throws C3059 {
        String strM35851 = m35851(jSONObject, str);
        if (!strM35851.isEmpty()) {
            return strM35851;
        }
        throw m35850(JSON.value(strM35851), "Invalid ".concat(str), str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m35850(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), m35852());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m35852() {
        return C7416.m19939("direction", "workspace_to_local", "workspaceId", "workspace1234").add("editSessionId", "").add("locator", C13169.m31925("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null)).add("localPath", "copied/data.bin").add("overwrite", false);
    }
}
