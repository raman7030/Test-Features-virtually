package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile C18081 f56313;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42151(C18081 c18081) {
        f56313 = c18081;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18081 m42150() {
        C18081 c18081 = f56313;
        C11003.requireNonNull(c18081, "MCP host is not installed");
        return c18081;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m42157(String str) {
        return C19554.m44967().m44968(str, "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m42144(C5184 c5184) {
        return C19993.m46095(JSON.object().add("workspaceId", c5184.f16258).add("editSessionId", c5184.f16255).add("locator", C13169.m31924(c5184.f16257, c5184.f16256)).add("deleted", true), JSON.array());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m42152() {
        return C3059.m9367(JSON.array(), "OUT_OF_MEMORY", "Not enough memory to complete this operation.", "fatal");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m42149(String str, boolean z) {
        if (str != null) {
            try {
                String strM29847 = C12301.m29847(str, MotionUtils.EASING_TYPE_PATH);
                C22233.m49903().m48690().m19883(strM29847);
                if (C16999.m39866(strM29847, new String[0]).mo23120()) {
                    return C3059.m9361(JSON.array().add(C10115.m25398(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM29847).add("temporary", z), "mt_apk_workspace_open", "retry", "Recreate workspace from source APK")), "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
                }
            } catch (C3059 unused) {
            }
        }
        return C3059.m9367(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m42153(String str, String str2) {
        return m42145(C7416.m19939("workspaceId", str, "editSessionId", str2).add("view", "resource_table").add("prefix", "").add("limit", 200), "RESOURCE_NOT_FOUND", "Resource not found.", "mt_apk_list", "Verify resource table entries in workspace");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C3059 m42156(String str, String str2, String str3) {
        String strM31925 = C13169.m31925("axml", str3, (String) null, (String) null, (String) null, (String) null);
        return C3059.m9365("NOT_TEXT_ENTRY", "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator.", "fatal", JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", C13169.m31925("axml", str3, (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read this ZIP entry as decoded AXML")), JSON.object().add("suggestedLocator", strM31925));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m42155(String str, String str2, String str3) {
        return C3059.m9361(JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", C13169.m31925("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "retry", "Read this ZIP entry as hex bytes")), "NOT_TEXT_ENTRY", "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes.", "fatal");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m42146(String str, String str2) {
        return m42145(C7416.m19939("workspaceId", str, "editSessionId", str2).add("view", "dex_classes").add("prefix", "").add("limit", 200), "CLASS_NOT_FOUND", "Class not found", "mt_apk_list", "Verify dex classes in workspace");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m42154(String str, String str2, String str3) {
        return m42148("METHOD_NOT_FOUND", "Method not found", "Verify class outline for method signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m42147(String str, String str2, String str3) {
        return m42148("FIELD_NOT_FOUND", "Field not found", "Verify class outline for field signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m42148(String str, String str2, String str3, String str4, String str5, String str6) {
        return m42145(C7416.m19939("workspaceId", str4, "editSessionId", str5).add("locator", C13169.m31925("dex_class", (String) null, str6, (String) null, (String) null, (String) null)).add("limit", 200), str, str2, "mt_apk_dex_read_class_outline", str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m42145(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C3059.m9361(JSON.array().add(C10115.m25398(jSONObject, str3, "verify_workspace", str4)), str, str2, "fatal");
    }
}
