package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V77Q */
/* JADX INFO: loaded from: classes.dex */
public final class C13958 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֨ۜܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f41656;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f41657;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f41658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f41659;

    static {
        ApplicationC12518.m30701(108);
        f41656 = new short[]{8071, 12349, 12325, 12344, 12321, 12345, 12346, 12331, 12329, 12335, 12291, 12334, 12335, 12334, 12323, 12350, 12313, 12335, 12345, 12345, 12323, 12325, 12324, 12291, 12334};
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public native C12936 mo3035(JSONObject jSONObject);

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Create an isolated APK edit session from an immutable workspace. Choose semantic write tools when applicable: use mt_apk_native_patch_instructions for executable ELF instructions, mt_apk_native_patch_string for ELF UTF-8 strings, mt_apk_edit_text for text targets, and mt_apk_resource_edit for resource values. Use mt_apk_patch_bytes as the raw-byte fallback only when exact bytes are intentionally required or no semantic editor applies. The base workspace remains unchanged, and multiple sessions for the same workspace are independent. Pass the returned editSessionId to every follow-up read, search, analyze, continue, edit, check, or build tool that accepts editSessionId; use an empty string only when you intentionally want the base workspace.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Create APK Edit Session";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_session_create";
    }

    public C13958(C19793 c19793) {
        this.f41659 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f41657;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  }\n}\n");
        this.f41657 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f41658;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20395 = C7609.m20395();
        this.f41658 = jSONObjectM20395;
        return jSONObjectM20395;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C7609.m20397(c3059);
    }
}
