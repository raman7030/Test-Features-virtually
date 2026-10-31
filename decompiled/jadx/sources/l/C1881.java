package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L779 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1881 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f6389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f6390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f6391;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Edit one or more resources.arsc values inside an APK edit session using complete valueXml from mt_apk_resource_read. Pass edits[] items; each item has locator, variant, targetVersion, and valueXml for one resourceId+variant. Runtime allows 1..200 items; around 20 per call is recommended. Items apply atomically in edits[] order, later items can observe earlier edits, and dependent valueXml edits should put the dependency first. Duplicate resourceId+variant items are rejected; failedEditIndex is 0-based and matches edits[i]. valueXml must contain exactly one supported root element and cannot change the root name, resource id, or variant, and it cannot create new resources. stale targetVersion is checked before semantic no-op. On resource-name-confused APKs, APP references and style item attr names must use 8 uppercase hex digits without 0x in output, while input also accepts a 0x prefix; android: system names remain accepted.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Edit APK Resource";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_resource_edit";
    }

    public C1881(C19793 c19793) {
        this.f6391 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f6389;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic resource value edits. Must contain 1..200 items at runtime; around 20 is recommended. Items apply in order and failedEditIndex uses this 0-based array index.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string copied from mt_apk_resource_read, such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Exact resource variant copied from the value to edit. Do not pass *.\"\n        },\n        \"targetVersion\": {\n          \"type\": \"string\",\n          \"description\": \"Required semantic targetVersion copied from results[].targetVersion for the same workspaceId, editSessionId, resourceId, and variant.\"\n        },\n        \"valueXml\": {\n          \"type\": \"string\",\n          \"description\": \"Complete single-entry resource XML copied from results[].valueXml, optionally modified. The root name attribute is read-only and must remain unchanged.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\",\n        \"targetVersion\",\n        \"valueXml\"\n      ]\n    }\n  }\n}\n");
        this.f6389 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f6390;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_resource_edit. data returns batch edit counts and per-item new targetVersion values.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this edit session.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this resource edit.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether this batch changed resource values in the edit session.")).add("changedCount", C1648.m5545("integer", "Number of edits whose semantic targetVersion changed.")).add("noOpCount", C1648.m5545("integer", "Number of edits whose semantic targetVersion stayed the same.")).add("results", C7416.m19939("type", "array", "description", "Per-edit results in the same order as input edits[].").add("items", C1648.m5532(JSON.object().add("index", C1648.m5545("integer", "0-based input edits[] index.")).add("locator", C1648.m5542("string", "Edited resource locator.")).add("variant", C1648.m5542("string", "Edited resource variant.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether this item changed its resource value in the edit session.")).add("newTargetVersion", C1648.m5542("string", "Semantic targetVersion after this edit item, as 16 lowercase hex digits.")), "One mt_apk_resource_edit item result."))), "Successful mt_apk_resource_edit data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null.")).add("editSessionId", C1648.m5542("string", "Edit session id, or null.")).add("locator", C1648.m5542("string", "Rejected resource locator, or null.")).add("variant", C1648.m5542("string", "Rejected resource variant, or null.")).add("currentTargetVersion", C1648.m5542("string", "Current targetVersion when stale was detected, or null.")).add("failedEditIndex", C1648.m5542("integer", "0-based edits[] index for the rejected item, or null for top-level parameter errors.")).add("resourceNamePolicy", C1648.m5544(C1648.m5532(JSON.object().add("confused", C1648.m5545(ClassTransform.BOOLEAN, "Whether resources.arsc appears resource-name confused.")).add("appReferenceOutput", C1648.m5539("APP reference output policy.", "names_or_hex", "hex8_upper_no_0x")).add("appNameReferencesAccepted", C1648.m5545(ClassTransform.BOOLEAN, "Whether APP name references are accepted in valueXml input.")).add("systemNameReferencesAccepted", C1648.m5545(ClassTransform.BOOLEAN, "Whether android: system name references are accepted in valueXml input.")).add("hexPrefixAccepted", C1648.m5545(ClassTransform.BOOLEAN, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions.")), "Resource name/reference policy for this ARSC snapshot."))), "mt_apk_resource_edit diagnostics.")), C1648.m5538("mt_apk_resource_edit errors may return a re-read action with current valueXml and targetVersion.", C1648.m5533(C11166.m27710(), "mt_apk_resource_read", "retry")));
        this.f6390 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C7609.m20399(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        int i;
        try {
            C16629.m39164();
            return new C12936(C7609.m20391(this.f6391.m45514(C13169.m31955(jSONObject))));
        } finally {
            i = C8869.f27007;
        }
    }
}
