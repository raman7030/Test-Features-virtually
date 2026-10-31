package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۤܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W76J */
/* JADX INFO: loaded from: classes3.dex */
public final class C10432 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f31344;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f31345;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f31346;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Delete an APK workspace and all associated state, including edit sessions. Delete temporary workspaces opened with mt_apk_workspace_open temporary=true after they are no longer needed. Keep ordinary non-temporary workspaces because they are intended for reuse and later analysis; delete one only when the user explicitly asks or clearly confirms it is no longer needed.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Delete APK Workspace";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_workspace_delete";
    }

    public C10432(C19793 c19793) {
        this.f31346 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f31344;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Delete temporary=true workspaces after they are no longer needed. Keep ordinary non-temporary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed. This deletes the workspace and associated state, including edit sessions.\"\n  }\n}\n");
        this.f31344 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f31345;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_workspace_delete. data confirms that a workspace and all state under it were closed and deleted; temporary identifies the deleted workspace type; nextActions is always empty.", C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Closed workspace id.")).add("temporary", C1648.m5545(ClassTransform.BOOLEAN, "Whether the closed workspace was temporary.")).add("closed", C1648.m5545(ClassTransform.BOOLEAN, "Whether the workspace was closed.")), ClassTransform.BOOLEAN, "Whether the workspace directory and all state under it were deleted.", "deleted", "Successful mt_apk_workspace_delete data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Requested workspace id after argument parsing, or null when the argument was missing or not a string.")).add("temporary", C1648.m5542(ClassTransform.BOOLEAN, "Whether the workspace was temporary when known, or null when it could not be confirmed.")), "mt_apk_workspace_delete diagnostics.")), C1648.m5534("mt_apk_workspace_delete has no follow-up actions."));
        this.f31345 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        int i;
        try {
            C19296 c19296M45529 = this.f31346.m45529(C13169.m31984(jSONObject));
            return new C12936(C19993.m46095(JSON.object().add("workspaceId", c19296M45529.f60700).add("temporary", c19296M45529.f60699).add("closed", true).add("deleted", true), JSON.array()));
        } finally {
            i = C8869.f27007;
        }
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get("temporary");
        return C19993.m46097(c3059, C16895.m39755(jSONObject, "workspaceId", JSON.object(), "workspaceId").add("temporary", (jSONValue == null || !jSONValue.isBoolean()) ? JSON.NULL : JSON.value(jSONValue.asBoolean())), JSON.array());
    }
}
