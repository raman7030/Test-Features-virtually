package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۤܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W76J */
/* JADX INFO: loaded from: classes3.dex */
public final class C12283 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f34308;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f34309;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f34310;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Delete an APK workspace and all associated state, including edit sessions. Delete temporary workspaces opened with mt_apk_workspace_open temporary=true after they are no longer needed. Keep ordinary non-temporary workspaces because they are intended for reuse and later analysis; delete one only when the user explicitly asks or clearly confirms it is no longer needed.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Delete APK Workspace";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_workspace_delete";
    }

    public C12283(C21180 c21180) {
        this.f34310 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f34308;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Delete temporary=true workspaces after they are no longer needed. Keep ordinary non-temporary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed. This deletes the workspace and associated state, including edit sessions.\"\n  }\n}\n");
        this.f34308 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f34309;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_workspace_delete. data confirms that a workspace and all state under it were closed and deleted; temporary identifies the deleted workspace type; nextActions is always empty.", C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Closed workspace id.")).add("temporary", C3935.m7775(ClassTransform.BOOLEAN, "Whether the closed workspace was temporary.")).add("closed", C3935.m7775(ClassTransform.BOOLEAN, "Whether the workspace was closed.")), ClassTransform.BOOLEAN, "Whether the workspace directory and all state under it were deleted.", "deleted", "Successful mt_apk_workspace_delete data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Requested workspace id after argument parsing, or null when the argument was missing or not a string.")).add("temporary", C3935.m7772(ClassTransform.BOOLEAN, "Whether the workspace was temporary when known, or null when it could not be confirmed.")), "mt_apk_workspace_delete diagnostics.")), C3935.m7764("mt_apk_workspace_delete has no follow-up actions."));
        this.f34309 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        int i;
        try {
            C20707 c20707M47840 = this.f34310.m47840(C14884.m34080(jSONObject));
            return new C14663(C21370.m48410(JSON.object().add("workspaceId", c20707M47840.f63930).add("temporary", c20707M47840.f63929).add("closed", true).add("deleted", true), JSON.array()));
        } finally {
            i = C10798.f29931;
        }
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        JSONValue jSONValue = jSONObject.get("temporary");
        return C21370.m48412(c5276, C18426.m41996(jSONObject, "workspaceId", JSON.object(), "workspaceId").add("temporary", (jSONValue == null || !jSONValue.isBoolean()) ? JSON.NULL : JSON.value(jSONValue.asBoolean())), JSON.array());
    }
}
