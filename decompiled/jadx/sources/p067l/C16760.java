package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.HashSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܶۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16760 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f49394;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f49395;

    /* JADX INFO: renamed from: ܽ */
    public final C14079 f49396;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Copy the raw content of one ordinary zip_entry between an APK workspace and a local file, preserving the source. workspace_to_local reads the base APK when editSessionId=\"\" or the edited session otherwise; overwrite controls the local destination. local_to_edit_session requires a non-empty editSessionId and copies into the entry; overwrite controls replacement of an existing entry; a deleted entry can be recreated. localPath may be absolute or relative to Home and requires file access permission. Both directions reject classes*.dex, resources.arsc, AXML, and directories. ZIP metadata is not copied and text encoding is not changed. Large files are supported; disconnecting does not cancel a copy already in progress. Inspect failure diagnostics before retrying. After success, nextActions checks local file metadata or reads the first entry bytes; it does not verify complete content equality.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Copy APK Entry";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_copy_entry";
    }

    public C16760(C14079 c14079) {
        this.f49396 = c14079;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f49394 == null) {
            this.f49394 = C20175.m45657(JSON.object().add("direction", C3935.m7769("workspace_to_local copies an entry view to localPath; local_to_edit_session copies localPath into an edit session and requires a non-empty editSessionId.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C3935.m7775("string", "Non-empty workspace id returned by mt_apk_workspace_open.")).add("editSessionId", C3935.m7775("string", "For workspace_to_local, pass an empty string to read the base workspace or a non-empty id to read that edit-session view. For local_to_edit_session, this must be a non-empty id returned by mt_apk_session_create.")).add("locator", C3935.m7775("string", "Exact ordinary zip_entry locator. classes*.dex, resources.arsc, AXML, and ZIP directory entries are rejected in both directions.")).add("localPath", C3935.m7775("string", "Non-empty absolute or Home-relative local source or destination path, selected by direction.")), ClassTransform.BOOLEAN, "For workspace_to_local, true permits replacing an existing regular local file. For local_to_edit_session, true permits replacing an ordinary entry in the current session view; a tombstoned entry counts as missing.", "overwrite", "Arguments for mt_apk_copy_entry.");
        }
        return this.f49394;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f49395 == null) {
            this.f49395 = C10056.m23427();
        }
        return this.f49395;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if ((!"direction".equals(str) && !"workspaceId".equals(str) && !"editSessionId".equals(str) && !"locator".equals(str) && !"localPath".equals(str) && !"overwrite".equals(str)) || !hashSet.add(str)) {
                throw m38008(jSONObject.get(str), "Invalid workspace entry copy argument", str);
            }
        }
        String[] strArr = {"direction", "workspaceId", "editSessionId", "locator", "localPath", "overwrite"};
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            if (!hashSet.contains(str2)) {
                throw m38008(null, C21466.m48631("Missing parameter: ", str2), str2);
            }
        }
        JSONValue jSONValue = jSONObject.get("direction");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m38008(jSONValue, "Invalid direction", "direction");
        }
        String strAsString = jSONValue.asString();
        if (!"workspace_to_local".equals(strAsString) && !"local_to_edit_session".equals(strAsString)) {
            throw C5276.m11406("Invalid direction", "direction", jSONValue, JSON.array("workspace_to_local", "local_to_edit_session"), m38010());
        }
        String strM38007 = m38007(jSONObject, "workspaceId");
        String strM38009 = m38009(jSONObject, "editSessionId");
        String strM34040 = C14884.m34040(m38007(jSONObject, "locator"));
        String strM380010 = m38009(jSONObject, "localPath");
        JSONValue jSONValue2 = jSONObject.get("overwrite");
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m38008(jSONValue2, "Invalid boolean argument", "overwrite");
        }
        C14749 c14749M31944 = this.f49396.m31944(strAsString, strM38007, strM38009, strM34040, strM380010, jSONValue2.asBoolean());
        String strM34021 = C14884.m34021("zip_entry", c14749M31944.f42040, (String) null, (String) null, (String) null, (String) null);
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c14749M31944.f42037;
        JSONObject jSONObjectAdd = jSONObjectObject.add("direction", str3);
        String str4 = c14749M31944.f42043;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("workspaceId", str4);
        String str5 = c14749M31944.f42038;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("editSessionId", str5).add("locator", strM34021);
        String str6 = c14749M31944.f42042;
        return new C14663(C21370.m48410(jSONObjectAdd3.add("localPath", str6).add("warnings", c14749M31944.f42039).add("size", c14749M31944.f42041), "workspace_to_local".equals(str3) ? JSON.array().add(C11982.m27418(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str6), "mt_file_stat", "inspect", "Inspect the copied local file at its normalized destination path.")) : JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", str4, "editSessionId", str5).add("locator", strM34021).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "inspect", "Read back the first raw byte window from the committed edit-session entry."))));
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectM41996 = C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", C18426.m41996(jSONObject, "direction", JSON.object(), "direction"), "workspaceId"), "editSessionId");
        JSONValue jSONValueValue = jSONObject.get("locator");
        if (jSONValueValue == null || !jSONValueValue.isString()) {
            String string = jSONObject.getString("entryName", null);
            jSONValueValue = (string == null || string.isEmpty()) ? JSON.NULL : JSON.value(C14884.m34021("zip_entry", string, (String) null, (String) null, (String) null, (String) null));
        }
        JSONObject jSONObjectM41997 = C18426.m41996(jSONObject, "localPath", jSONObjectM41996.add("locator", jSONValueValue), "localPath");
        JSONValue jSONValue = jSONObject.get("changed");
        boolean zAsBoolean = false;
        JSONObject jSONObjectM41998 = C18426.m41996(jSONObject, "operationMode", jSONObjectM41997.add("changed", (jSONValue == null || !jSONValue.isBoolean()) ? false : jSONValue.asBoolean()), "operationMode");
        JSONValue jSONValue2 = jSONObject.get("stateKnown");
        JSONObject jSONObjectAdd = jSONObjectM41998.add("stateKnown", (jSONValue2 == null || !jSONValue2.isBoolean()) ? true : jSONValue2.asBoolean());
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
        JSONArray<JSONValue> jSONArray = c5276.f12407;
        JSONArray jSONArrayArray2 = JSON.array();
        for (JSONValue jSONValue7 : jSONArray) {
            if (jSONValue7.isObject()) {
                JSONObject jSONObjectAsObject = jSONValue7.asObject();
                if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null)) && "retry".equals(jSONObjectAsObject.getString("purpose", null))) {
                    jSONArrayArray2.add(new JSONObject(jSONObjectAsObject));
                }
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd4, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m38009(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m38008(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38007(JSONObject jSONObject, String str) throws C5276 {
        String strM38009 = m38009(jSONObject, str);
        if (!strM38009.isEmpty()) {
            return strM38009;
        }
        throw m38008(JSON.value(strM38009), "Invalid ".concat(str), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m38008(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), m38010());
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m38010() {
        return C9417.m21913("direction", "workspace_to_local", "workspaceId", "workspace1234").add("editSessionId", "").add("locator", C14884.m34021("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null)).add("localPath", "copied/data.bin").add("overwrite", false);
    }
}
