package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11843 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f35330;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f35331;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f35332;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Delete one exact locator from an APK edit session identified by a non-empty editSessionId without first calling mt_apk_read_text. Pass workspaceId and editSessionId from mt_apk_session_create plus a locator returned by list, search, or class outline. The tool accepts dex_class:, dex_method:, axml:, and zip_entry:; dex_field: is read-only. It has no targetVersion parameter and deletes the latest visible target without a stale-version check. zip_entry: deletes ordinary text, oversized text, binary, or AXML entry payloads without decoding them as text; axml: requires the current entry to be AXML. Standard classes*.dex entries, resources.arsc, ZIP directory entries, wildcard/batch targets, and the base workspace are rejected. A missing or already deleted target is an error, not an idempotent success. The source APK is never modified; mt_apk_build omits the deleted target from the generated APK. This tool is destructive within the edit session and is available without a VIP membership.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Delete APK Target";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_delete_target";
    }

    public C11843(C19793 c19793) {
        this.f35332 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectM39755 = C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM39755.add("locator", jSONValue);
        JSONArray jSONArray = c3059.f9604;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C19993.m46097(c3059, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f35330;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class:, dex_method:, axml:, or zip_entry: locator to delete. A prior mt_apk_read_text call and targetVersion are not required. zip_entry: may identify text, binary, oversized, or AXML content, but not resources.arsc, a standard classes*.dex entry, or a ZIP directory entry.\"\n  }\n}\n");
        this.f35330 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f35331;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_delete_target. Successful data identifies the one deleted locator. Errors may suggest listing classes, reading a class outline, or reopening a corrupt workspace.", C18736.m43390(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id containing the modified edit session.")).add("editSessionId", C1648.m5542("string", "Non-empty edit session id that was modified.")).add("locator", C1648.m5542("string", "Exact locator removed from the edit session view.")), ClassTransform.BOOLEAN, "Always true for a successful deletion.", "deleted", "Successful mt_apk_delete_target data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null for an argument error.")).add("editSessionId", C1648.m5542("string", "Edit session id, or null for an argument error.")).add("locator", C1648.m5542("string", "Rejected normalized locator, or null when it could not be parsed.")), "mt_apk_delete_target diagnostics.")), C1648.m5538("Successful deletion returns no next action. Missing class or method errors may suggest the matching session list or outline, and a corrupt workspace may suggest mt_apk_workspace_open.", C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace"), C1648.m5533(C11166.m27712(), "mt_apk_dex_read_class_outline", "verify_workspace"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
        this.f35331 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C20498 c20498M32001 = C13169.m32001(jSONObject);
            try {
                C5184 c5184M45519 = this.f35332.m45519(c20498M32001, new C15923());
                int i = C8869.f27007;
                return new C12936(C18081.m42144(c5184M45519));
            } catch (C3059 e) {
                e.f9609.put("workspaceId", c20498M32001.f66071).put("editSessionId", c20498M32001.f66068).put("locator", C13169.m31924(c20498M32001.f66070, c20498M32001.f66069));
                throw e;
            }
        } catch (Throwable th) {
            int i2 = C8869.f27007;
            throw th;
        }
    }
}
