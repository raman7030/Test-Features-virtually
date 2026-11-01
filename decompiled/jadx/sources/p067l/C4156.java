package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L779 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4156 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f9171;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f9172;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f9173;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Edit one or more resources.arsc values inside an APK edit session using complete valueXml from mt_apk_resource_read. Pass edits[] items; each item has locator, variant, targetVersion, and valueXml for one resourceId+variant. Runtime allows 1..200 items; around 20 per call is recommended. Items apply atomically in edits[] order, later items can observe earlier edits, and dependent valueXml edits should put the dependency first. Duplicate resourceId+variant items are rejected; failedEditIndex is 0-based and matches edits[i]. valueXml must contain exactly one supported root element and cannot change the root name, resource id, or variant, and it cannot create new resources. stale targetVersion is checked before semantic no-op. On resource-name-confused APKs, APP references and style item attr names must use 8 uppercase hex digits without 0x in output, while input also accepts a 0x prefix; android: system names remain accepted.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Edit APK Resource";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_resource_edit";
    }

    public C4156(C21180 c21180) {
        this.f9173 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f9171;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic resource value edits. Must contain 1..200 items at runtime; around 20 is recommended. Items apply in order and failedEditIndex uses this 0-based array index.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string copied from mt_apk_resource_read, such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Exact resource variant copied from the value to edit. Do not pass *.\"\n        },\n        \"targetVersion\": {\n          \"type\": \"string\",\n          \"description\": \"Required semantic targetVersion copied from results[].targetVersion for the same workspaceId, editSessionId, resourceId, and variant.\"\n        },\n        \"valueXml\": {\n          \"type\": \"string\",\n          \"description\": \"Complete single-entry resource XML copied from results[].valueXml, optionally modified. The root name attribute is read-only and must remain unchanged.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\",\n        \"targetVersion\",\n        \"valueXml\"\n      ]\n    }\n  }\n}\n");
        this.f9171 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f9172;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_resource_edit. data returns batch edit counts and per-item new targetVersion values.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this edit session.")).add("editSessionId", C3935.m7772("string", "Edit session id used for this resource edit.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether this batch changed resource values in the edit session.")).add("changedCount", C3935.m7775("integer", "Number of edits whose semantic targetVersion changed.")).add("noOpCount", C3935.m7775("integer", "Number of edits whose semantic targetVersion stayed the same.")).add("results", C9417.m21913("type", "array", "description", "Per-edit results in the same order as input edits[].").add("items", C3935.m7762(JSON.object().add("index", C3935.m7775("integer", "0-based input edits[] index.")).add("locator", C3935.m7772("string", "Edited resource locator.")).add("variant", C3935.m7772("string", "Edited resource variant.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether this item changed its resource value in the edit session.")).add("newTargetVersion", C3935.m7772("string", "Semantic targetVersion after this edit item, as 16 lowercase hex digits.")), "One mt_apk_resource_edit item result."))), "Successful mt_apk_resource_edit data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null.")).add("editSessionId", C3935.m7772("string", "Edit session id, or null.")).add("locator", C3935.m7772("string", "Rejected resource locator, or null.")).add("variant", C3935.m7772("string", "Rejected resource variant, or null.")).add("currentTargetVersion", C3935.m7772("string", "Current targetVersion when stale was detected, or null.")).add("failedEditIndex", C3935.m7772("integer", "0-based edits[] index for the rejected item, or null for top-level parameter errors.")).add("resourceNamePolicy", C3935.m7774(C3935.m7762(JSON.object().add("confused", C3935.m7775(ClassTransform.BOOLEAN, "Whether resources.arsc appears resource-name confused.")).add("appReferenceOutput", C3935.m7769("APP reference output policy.", "names_or_hex", "hex8_upper_no_0x")).add("appNameReferencesAccepted", C3935.m7775(ClassTransform.BOOLEAN, "Whether APP name references are accepted in valueXml input.")).add("systemNameReferencesAccepted", C3935.m7775(ClassTransform.BOOLEAN, "Whether android: system name references are accepted in valueXml input.")).add("hexPrefixAccepted", C3935.m7775(ClassTransform.BOOLEAN, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions.")), "Resource name/reference policy for this ARSC snapshot."))), "mt_apk_resource_edit diagnostics.")), C3935.m7768("mt_apk_resource_edit errors may return a re-read action with current valueXml and targetVersion.", C3935.m7763(C12981.m29772(), "mt_apk_resource_read", "retry")));
        this.f9172 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C9600.m22378(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        int i;
        try {
            C18173.m41392();
            return new C14663(C9600.m22370(this.f9173.m47825(C14884.m34051(jSONObject))));
        } finally {
            i = C10798.f29931;
        }
    }
}
