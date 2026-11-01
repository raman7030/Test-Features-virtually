package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V77Q */
/* JADX INFO: loaded from: classes.dex */
public final class C15634 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֨ۜܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f82210;

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f44737;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f44738;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f44739;

    static {
        ApplicationC14266.m56479(108);
        f82210 = new short[]{8071, 12349, 12325, 12344, 12321, 12345, 12346, 12331, 12329, 12335, 12291, 12334, 12335, 12334, 12323, 12350, 12313, 12335, 12345, 12345, 12323, 12325, 12324, 12291, 12334};
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public native C14663 mo5348(JSONObject jSONObject);

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Create an isolated APK edit session from an immutable workspace. Choose semantic write tools when applicable: use mt_apk_native_patch_instructions for executable ELF instructions, mt_apk_native_patch_string for ELF UTF-8 strings, mt_apk_edit_text for text targets, and mt_apk_resource_edit for resource values. Use mt_apk_patch_bytes as the raw-byte fallback only when exact bytes are intentionally required or no semantic editor applies. The base workspace remains unchanged, and multiple sessions for the same workspace are independent. Pass the returned editSessionId to every follow-up read, search, analyze, continue, edit, check, or build tool that accepts editSessionId; use an empty string only when you intentionally want the base workspace.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Create APK Edit Session";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_session_create";
    }

    public C15634(C21180 c21180) {
        this.f44739 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f44737;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  }\n}\n");
        this.f44737 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f44738;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM22374 = C9600.m22374();
        this.f44738 = jSONObjectM22374;
        return jSONObjectM22374;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C9600.m22376(c5276);
    }
}
