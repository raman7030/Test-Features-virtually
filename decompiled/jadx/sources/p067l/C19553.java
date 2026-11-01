package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6VM */
/* JADX INFO: loaded from: classes4.dex */
public final class C19553 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile C19553 f59525;

    /* JADX INFO: renamed from: ֫ */
    public static void m44410(C19553 c19553) {
        f59525 = c19553;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19553 m44409() {
        C19553 c19553 = f59525;
        C12826.requireNonNull(c19553, "MCP host is not installed");
        return c19553;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m44416(String str) {
        return C20953.m47267().m47268(str, "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m44403(C7295 c7295) {
        return C21370.m48410(JSON.object().add("workspaceId", c7295.f19099).add("editSessionId", c7295.f19096).add("locator", C14884.m34020(c7295.f19098, c7295.f19097)).add("deleted", true), JSON.array());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m44411() {
        return C5276.m11409(JSON.array(), "OUT_OF_MEMORY", "Not enough memory to complete this operation.", "fatal");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m44408(String str, boolean z) {
        if (str != null) {
            try {
                String strM31907 = C14059.m31907(str, MotionUtils.EASING_TYPE_PATH);
                C23499.m52231().m51035().m21856(strM31907);
                if (C18524.m42109(strM31907, new String[0]).mo25094()) {
                    return C5276.m11403(JSON.array().add(C11982.m27418(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM31907).add("temporary", z), "mt_apk_workspace_open", "retry", "Recreate workspace from source APK")), "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
                }
            } catch (C5276 unused) {
            }
        }
        return C5276.m11409(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m44412(String str, String str2) {
        return m44404(C9417.m21913("workspaceId", str, "editSessionId", str2).add("view", "resource_table").add("prefix", "").add("limit", 200), "RESOURCE_NOT_FOUND", "Resource not found.", "mt_apk_list", "Verify resource table entries in workspace");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C5276 m44415(String str, String str2, String str3) {
        String strM34021 = C14884.m34021("axml", str3, (String) null, (String) null, (String) null, (String) null);
        return C5276.m11407("NOT_TEXT_ENTRY", "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator.", "fatal", JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", C14884.m34021("axml", str3, (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read this ZIP entry as decoded AXML")), JSON.object().add("suggestedLocator", strM34021));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5276 m44414(String str, String str2, String str3) {
        return C5276.m11403(JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", C14884.m34021("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "retry", "Read this ZIP entry as hex bytes")), "NOT_TEXT_ENTRY", "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes.", "fatal");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m44405(String str, String str2) {
        return m44404(C9417.m21913("workspaceId", str, "editSessionId", str2).add("view", "dex_classes").add("prefix", "").add("limit", 200), "CLASS_NOT_FOUND", "Class not found", "mt_apk_list", "Verify dex classes in workspace");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m44413(String str, String str2, String str3) {
        return m44407("METHOD_NOT_FOUND", "Method not found", "Verify class outline for method signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m44406(String str, String str2, String str3) {
        return m44407("FIELD_NOT_FOUND", "Field not found", "Verify class outline for field signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m44407(String str, String str2, String str3, String str4, String str5, String str6) {
        return m44404(C9417.m21913("workspaceId", str4, "editSessionId", str5).add("locator", C14884.m34021("dex_class", (String) null, str6, (String) null, (String) null, (String) null)).add("limit", 200), str, str2, "mt_apk_dex_read_class_outline", str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m44404(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C5276.m11403(JSON.array().add(C11982.m27418(jSONObject, str3, "verify_workspace", str4)), str, str2, "fatal");
    }
}
