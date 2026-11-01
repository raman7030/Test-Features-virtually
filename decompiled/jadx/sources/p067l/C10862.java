package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۡܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H79G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10862 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f30101;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f30102;

    /* JADX INFO: renamed from: ܽ */
    public final C4827 f30103;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Use this when you need text from a known APK locator string: zip_entry text, decoded axml, dex_class smali, dex_method smali, or dex_field smali. Returned text is LF-normalized. Ordinary zip_entry text is decoded only up to the first 10485760 uncompressed bytes (10 MiB); source truncation cannot be bypassed by paging. For editable locators (zip_entry, axml, dex_class, dex_method), copy data.targetVersion to mt_apk_edit_text; dex_field is read-only and its targetVersion is informational. startLine/startColumn are read positions only, and edit_text does not accept line coordinates. Copy the full locator string exactly. Do not use this for resource table values or raw ZIP entry bytes; use mt_apk_resource_read for resource locators and mt_apk_read_bytes for zip_entry bytes. Continue pages via nextActions.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read APK Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_read_text";
    }

    public C10862(C4827 c4827) {
        this.f30103 = c4827;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f30101;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Copy the full locator string returned by nextActions, mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search. Accepted prefixes: zip_entry:, axml:, dex_class:, dex_method:, dex_field:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Text page line count. Pass 500 by default; maximum 2000.\"\n  },\n  \"maxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code points in data.textWindow.text. Pass 49152 by default; maximum 131072.\"\n  },\n  \"startLine\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based first line within this read target. Pass 0 by default. For dex_method and dex_field this is member-relative, not class-smali absolute. Smali .line N directives are original Java source debug lines; do not use them as read_text positions. edit_text does not accept line coordinates.\"\n  },\n  \"startColumn\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based code point column within startLine. Pass 0 by default.\"\n  }\n}\n");
        this.f30101 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f30102;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20455 = C8850.m20455();
        this.f30102 = jSONObjectM20455;
        return jSONObjectM20455;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.object().add("suggestedLocator", C3223.m5573(c5276.f12412.get("suggestedLocator"))), c5276.f12407);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            return this.f30103.m10236(C14884.m34004(jSONObject), new C17502());
        } finally {
            int i = C10798.f29931;
        }
    }
}
