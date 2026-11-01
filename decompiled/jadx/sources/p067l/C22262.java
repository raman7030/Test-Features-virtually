package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩷ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M779 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22262 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f70377;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f70378;

    /* JADX INFO: renamed from: ܽ */
    public final C4827 f70379;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Batch-read resources.arsc values by exact resource locators and concrete variants. All input fields are required; use editSessionId=\"\" for the base workspace. reads[] accepts 1..200 items, each with a resource:0x... locator string and a concrete variant such as \"default\". Suggested budget values: maxValueChars=4096, maxValueXmlChars=32768, maxItemsPerValue=50, resolveDepth=0. The result data.results[] order matches reads[]. A result with errorCode is an item-level RESOURCE_NOT_FOUND or RESOURCE_VARIANT_NOT_FOUND failure; otherwise inspect valueKind and use only the fields present in that success branch. Item-level failures do not stop the batch, while argument errors or an unreadable resource table fail the tool. data.variantSets[] lists available variants for resources that exist. valueXml is complete editable single-entry XML, never a styled text fragment; maxValueXmlChars controls only whether that complete XML is returned. valueTruncated only means the display summary was cut and does not provide the full summary length; valueXmlCharCount is the budget hint for complete XML. Editing requires a non-empty editSessionId. If data.editSessionId is empty, call mt_apk_session_create, then re-read the same locator and variant with the returned editSessionId. When editable=true and valueXml is non-null, call mt_apk_resource_edit with data.workspaceId, the non-empty data.editSessionId, and edits[] items containing locator, variant, targetVersion, and valueXml. If editable=true and valueXmlTruncated=true, re-read with maxValueXmlChars at least valueXmlCharCount. If editable=false, inspect editableReason instead of editing from targetVersion alone.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read APK Resource";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_resource_read";
    }

    public C22262(C4827 c4827) {
        this.f70379 = c4827;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f70377;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"reads\": {\n    \"type\": \"array\",\n    \"description\": \"Resource reads. Runtime accepts 1..200 items. Each item reads one exact resource locator and one concrete public variant.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"description\": \"One resource value read.\",\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Concrete public resource variant to read, such as default; not wildcard *.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\"\n      ]\n    }\n  },\n  \"maxValueChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum characters for the decoded value summary only. Suggested value is 4096; allowed range is 1..32768. valueTruncated=true only means this summary was cut; the exact full summary length is not returned.\"\n  },\n  \"maxValueXmlChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum characters for complete valueXml. Suggested value is 32768; allowed range is 1..1048576. valueXml is omitted rather than returned partially when it exceeds this budget.\"\n  },\n  \"maxItemsPerValue\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum item_list children returned per result. Suggested value is 50; allowed range is 0..2000. This does not affect valueXml.\"\n  },\n  \"resolveDepth\": {\n    \"type\": \"integer\",\n    \"description\": \"Direct reference summary depth. Suggested value is 0; allowed values are 0 or 1.\"\n  }\n}\n");
        this.f70377 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f70378;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20458 = C8850.m20458();
        this.f70378 = jSONObjectM20458;
        return jSONObjectM20458;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            return this.f70379.m10238(C14884.m34003(jSONObject));
        } finally {
            int i = C10798.f29931;
        }
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.object(), c5276.f12407);
    }
}
