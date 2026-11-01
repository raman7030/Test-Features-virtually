package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E77V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12874 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f36229;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f36230;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f36231;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Edit text inside an APK edit session. For ordinary zip_entry text, the existing entry and encoded result must each fit within 10485760 uncompressed bytes (10 MiB). For existing targets, first call mt_apk_read_text on the exact locator string and copy locator and data.targetVersion. Send edits as edits[] items with mode, matchText, and writeText; top-level mode/matchText/writeText are invalid. edit_text rejects stale targetVersion values for that exact target; dex_method targetVersion is scoped to the method text, not the owner class. Local edits match the same LF-normalized original target text and apply atomically; any failed edit leaves the session unchanged. Use one write_target for a whole-target write, including targetVersion=\"missing\" to create a missing dex_class, axml, or zip_entry. Use mt_apk_delete_target to remove a whole class, method, AXML, text, or binary ZIP entry without first reading it. Local modes replace_match/insert_before_match/insert_after_match require exactly one occurrence of matchText; replace_match with writeText=\"\" still deletes only the matched text. On TEXT_MATCH_AMBIGUOUS, retry with longer surrounding context. Smali and AXML are prepared before saving; failures leave the session unchanged. resources.arsc cannot be edited as zip_entry; use mt_apk_resource_edit.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Edit APK Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_edit_text";
    }

    public C12874(C21180 c21180) {
        this.f36231 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f36229;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"For existing targets, use the exact locator string from mt_apk_read_text. Locators from mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search must be read first to obtain data.targetVersion. edit_text accepts only dex_class:, dex_method:, axml:, and zip_entry:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;. dex_method requires a full Smali method reference such as dex_method:Lcom/example/Foo;->bar()V. zip_entry uses ZIP entry paths after the first colon.\"\n  },\n  \"targetVersion\": {\n    \"type\": \"string\",\n    \"description\": \"Required current target version: 16 lowercase hex digits. Copy data.targetVersion from the mt_apk_read_text result for the same workspaceId, editSessionId, and locator. For a missing dex_class, axml, or zip_entry creation with write_target, pass the literal string \\\"missing\\\". dex_method targetVersion is scoped to that method text only, not to the owner class.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic edits for this one locator. Must contain at least one item. All local matchText values are matched against the original LF-normalized target text before anything is saved. write_target must be the only item. Item indexes are 0-based in failedEditIndex diagnostics.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"mode\": {\n          \"type\": \"string\",\n          \"enum\": [\n            \"write_target\",\n            \"replace_match\",\n            \"insert_before_match\",\n            \"insert_after_match\"\n          ],\n          \"description\": \"write_target writes the whole locator target and creates missing dex_class, axml, or zip_entry targets when targetVersion is \\\"missing\\\"; dex_method write_target replaces one existing method block. replace_match replaces non-empty matchText and may delete it with writeText=\\\"\\\"; insert_before_match and insert_after_match insert non-empty writeText before or after non-empty matchText. Insert modes concatenate writeText literally and never add a newline automatically. Use mt_apk_delete_target for whole-target deletion. Do not pass unified-diff text, @@ headers, or unavailable mode names.\"\n        },\n        \"matchText\": {\n          \"type\": \"string\",\n          \"description\": \"For local match modes, exact current LF-normalized text that must appear exactly once anywhere in the current target. If it appears multiple times, the edit is rejected and you must retry with longer surrounding context. It must include every matched character, including LF line breaks; for whole-line or multi-line replacement, include every matched line break, and whole-line replacement usually includes the line's trailing LF. For write_target pass an empty string.\"\n        },\n        \"writeText\": {\n          \"type\": \"string\",\n          \"description\": \"For write_target, full locator text: dex_class Smali must contain exactly one .class matching locator target after the first colon; dex_method Smali must contain exactly one complete .method ... .end method block matching locator target after the first colon; AXML should be complete XML source; zip_entry may be empty and is encoded directly. Smali and AXML are prepared before saving; failures leave the session unchanged. For existing zip_entry locators, write LF text and the saved bytes keep the entry's original line ending style; new zip_entry locators use LF. For replace_match, text to write in place of matchText; writeText=\\\"\\\" deletes the matched text. For insert_before_match and insert_after_match, non-empty text to concatenate literally before or after matchText; no newline is added automatically, so include LF in writeText when inserting a separate line.\"\n        }\n      },\n      \"required\": [\n        \"mode\",\n        \"matchText\",\n        \"writeText\"\n      ]\n    }\n  }\n}\n");
        this.f36229 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f36230;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM22375 = C9600.m22375();
        this.f36230 = jSONObjectM22375;
        return jSONObjectM22375;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C9600.m22377(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        int i;
        try {
            C18173.m41392();
            return new C14663(C9600.m22371(this.f36231.m47843(C14884.m34050(jSONObject), new C17502())));
        } finally {
            i = C10798.f29931;
        }
    }
}
