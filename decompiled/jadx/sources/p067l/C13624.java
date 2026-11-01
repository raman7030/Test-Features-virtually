package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6YK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13624 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f38335;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f38336;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f38337;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Delete one exact locator from an APK edit session identified by a non-empty editSessionId without first calling mt_apk_read_text. Pass workspaceId and editSessionId from mt_apk_session_create plus a locator returned by list, search, or class outline. The tool accepts dex_class:, dex_method:, axml:, and zip_entry:; dex_field: is read-only. It has no targetVersion parameter and deletes the latest visible target without a stale-version check. zip_entry: deletes ordinary text, oversized text, binary, or AXML entry payloads without decoding them as text; axml: requires the current entry to be AXML. Standard classes*.dex entries, resources.arsc, ZIP directory entries, wildcard/batch targets, and the base workspace are rejected. A missing or already deleted target is an error, not an idempotent success. The source APK is never modified; mt_apk_build omits the deleted target from the generated APK. This tool is destructive within the edit session and is available without a VIP membership.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Delete APK Target";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_delete_target";
    }

    public C13624(C21180 c21180) {
        this.f38337 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectM41996 = C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId");
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM41996.add("locator", jSONValue);
        JSONArray jSONArray = c5276.f12407;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C21370.m48412(c5276, jSONObjectAdd, jSONArrayArray);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f38335;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class:, dex_method:, axml:, or zip_entry: locator to delete. A prior mt_apk_read_text call and targetVersion are not required. zip_entry: may identify text, binary, oversized, or AXML content, but not resources.arsc, a standard classes*.dex entry, or a ZIP directory entry.\"\n  }\n}\n");
        this.f38335 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f38336;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_delete_target. Successful data identifies the one deleted locator. Errors may suggest listing classes, reading a class outline, or reopening a corrupt workspace.", C20175.m45657(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id containing the modified edit session.")).add("editSessionId", C3935.m7772("string", "Non-empty edit session id that was modified.")).add("locator", C3935.m7772("string", "Exact locator removed from the edit session view.")), ClassTransform.BOOLEAN, "Always true for a successful deletion.", "deleted", "Successful mt_apk_delete_target data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null for an argument error.")).add("editSessionId", C3935.m7772("string", "Edit session id, or null for an argument error.")).add("locator", C3935.m7772("string", "Rejected normalized locator, or null when it could not be parsed.")), "mt_apk_delete_target diagnostics.")), C3935.m7768("Successful deletion returns no next action. Missing class or method errors may suggest the matching session list or outline, and a corrupt workspace may suggest mt_apk_workspace_open.", C3935.m7763(C12981.m29770(), "mt_apk_list", "verify_workspace"), C3935.m7763(C12981.m29774(), "mt_apk_dex_read_class_outline", "verify_workspace"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
        this.f38336 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C21850 c21850M34097 = C14884.m34097(jSONObject);
            try {
                C7295 c7295M47830 = this.f38337.m47830(c21850M34097, new C17502());
                int i = C10798.f29931;
                return new C14663(C19553.m44403(c7295M47830));
            } catch (C5276 e) {
                e.f12412.put("workspaceId", c21850M34097.f68750).put("editSessionId", c21850M34097.f68747).put("locator", C14884.m34020(c21850M34097.f68749, c21850M34097.f68748));
                throw e;
            }
        } catch (Throwable th) {
            int i2 = C10798.f29931;
            throw th;
        }
    }
}
