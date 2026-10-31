package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E77V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11054 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f33228;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f33229;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f33230;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Edit text inside an APK edit session. For ordinary zip_entry text, the existing entry and encoded result must each fit within 10485760 uncompressed bytes (10 MiB). For existing targets, first call mt_apk_read_text on the exact locator string and copy locator and data.targetVersion. Send edits as edits[] items with mode, matchText, and writeText; top-level mode/matchText/writeText are invalid. edit_text rejects stale targetVersion values for that exact target; dex_method targetVersion is scoped to the method text, not the owner class. Local edits match the same LF-normalized original target text and apply atomically; any failed edit leaves the session unchanged. Use one write_target for a whole-target write, including targetVersion=\"missing\" to create a missing dex_class, axml, or zip_entry. Use mt_apk_delete_target to remove a whole class, method, AXML, text, or binary ZIP entry without first reading it. Local modes replace_match/insert_before_match/insert_after_match require exactly one occurrence of matchText; replace_match with writeText=\"\" still deletes only the matched text. On TEXT_MATCH_AMBIGUOUS, retry with longer surrounding context. Smali and AXML are prepared before saving; failures leave the session unchanged. resources.arsc cannot be edited as zip_entry; use mt_apk_resource_edit.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Edit APK Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_edit_text";
    }

    public C11054(C19793 c19793) {
        this.f33230 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f33228;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"For existing targets, use the exact locator string from mt_apk_read_text. Locators from mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search must be read first to obtain data.targetVersion. edit_text accepts only dex_class:, dex_method:, axml:, and zip_entry:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;. dex_method requires a full Smali method reference such as dex_method:Lcom/example/Foo;->bar()V. zip_entry uses ZIP entry paths after the first colon.\"\n  },\n  \"targetVersion\": {\n    \"type\": \"string\",\n    \"description\": \"Required current target version: 16 lowercase hex digits. Copy data.targetVersion from the mt_apk_read_text result for the same workspaceId, editSessionId, and locator. For a missing dex_class, axml, or zip_entry creation with write_target, pass the literal string \\\"missing\\\". dex_method targetVersion is scoped to that method text only, not to the owner class.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic edits for this one locator. Must contain at least one item. All local matchText values are matched against the original LF-normalized target text before anything is saved. write_target must be the only item. Item indexes are 0-based in failedEditIndex diagnostics.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"mode\": {\n          \"type\": \"string\",\n          \"enum\": [\n            \"write_target\",\n            \"replace_match\",\n            \"insert_before_match\",\n            \"insert_after_match\"\n          ],\n          \"description\": \"write_target writes the whole locator target and creates missing dex_class, axml, or zip_entry targets when targetVersion is \\\"missing\\\"; dex_method write_target replaces one existing method block. replace_match replaces non-empty matchText and may delete it with writeText=\\\"\\\"; insert_before_match and insert_after_match insert non-empty writeText before or after non-empty matchText. Insert modes concatenate writeText literally and never add a newline automatically. Use mt_apk_delete_target for whole-target deletion. Do not pass unified-diff text, @@ headers, or unavailable mode names.\"\n        },\n        \"matchText\": {\n          \"type\": \"string\",\n          \"description\": \"For local match modes, exact current LF-normalized text that must appear exactly once anywhere in the current target. If it appears multiple times, the edit is rejected and you must retry with longer surrounding context. It must include every matched character, including LF line breaks; for whole-line or multi-line replacement, include every matched line break, and whole-line replacement usually includes the line's trailing LF. For write_target pass an empty string.\"\n        },\n        \"writeText\": {\n          \"type\": \"string\",\n          \"description\": \"For write_target, full locator text: dex_class Smali must contain exactly one .class matching locator target after the first colon; dex_method Smali must contain exactly one complete .method ... .end method block matching locator target after the first colon; AXML should be complete XML source; zip_entry may be empty and is encoded directly. Smali and AXML are prepared before saving; failures leave the session unchanged. For existing zip_entry locators, write LF text and the saved bytes keep the entry's original line ending style; new zip_entry locators use LF. For replace_match, text to write in place of matchText; writeText=\\\"\\\" deletes the matched text. For insert_before_match and insert_after_match, non-empty text to concatenate literally before or after matchText; no newline is added automatically, so include LF in writeText when inserting a separate line.\"\n        }\n      },\n      \"required\": [\n        \"mode\",\n        \"matchText\",\n        \"writeText\"\n      ]\n    }\n  }\n}\n");
        this.f33228 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f33229;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20396 = C7609.m20396();
        this.f33229 = jSONObjectM20396;
        return jSONObjectM20396;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C7609.m20398(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        int i;
        try {
            C16629.m39164();
            return new C12936(C7609.m20392(this.f33230.m45532(C13169.m31954(jSONObject), new C15923())));
        } finally {
            i = C8869.f27007;
        }
    }
}
