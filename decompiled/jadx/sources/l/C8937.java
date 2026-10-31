package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۡܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H79G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8937 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f27166;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f27167;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2587 f27168;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Use this when you need text from a known APK locator string: zip_entry text, decoded axml, dex_class smali, dex_method smali, or dex_field smali. Returned text is LF-normalized. Ordinary zip_entry text is decoded only up to the first 10485760 uncompressed bytes (10 MiB); source truncation cannot be bypassed by paging. For editable locators (zip_entry, axml, dex_class, dex_method), copy data.targetVersion to mt_apk_edit_text; dex_field is read-only and its targetVersion is informational. startLine/startColumn are read positions only, and edit_text does not accept line coordinates. Copy the full locator string exactly. Do not use this for resource table values or raw ZIP entry bytes; use mt_apk_resource_read for resource locators and mt_apk_read_bytes for zip_entry bytes. Continue pages via nextActions.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Read APK Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_read_text";
    }

    public C8937(C2587 c2587) {
        this.f27168 = c2587;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f27166;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Copy the full locator string returned by nextActions, mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search. Accepted prefixes: zip_entry:, axml:, dex_class:, dex_method:, dex_field:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Text page line count. Pass 500 by default; maximum 2000.\"\n  },\n  \"maxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code points in data.textWindow.text. Pass 49152 by default; maximum 131072.\"\n  },\n  \"startLine\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based first line within this read target. Pass 0 by default. For dex_method and dex_field this is member-relative, not class-smali absolute. Smali .line N directives are original Java source debug lines; do not use them as read_text positions. edit_text does not accept line coordinates.\"\n  },\n  \"startColumn\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based code point column within startLine. Pass 0 by default.\"\n  }\n}\n");
        this.f27166 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f27167;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM18506 = C6820.m18506();
        this.f27167 = jSONObjectM18506;
        return jSONObjectM18506;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.object().add("suggestedLocator", C0899.m3254(c3059.f9609.get("suggestedLocator"))), c3059.f9604);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            return this.f27168.m8197(C13169.m31908(jSONObject), new C15923());
        } finally {
            int i = C8869.f27007;
        }
    }
}
