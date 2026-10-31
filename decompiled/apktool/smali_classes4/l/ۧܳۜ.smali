.class public final Ll/ۧܳۜ;
.super Ll/ۙۛ᩻;
.source "E77V"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۧܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 52
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 128
    invoke-static {p1}, Ll/۟ܿۜ;->ܿ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 142
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 143
    invoke-static {p1}, Ll/۬ܳۜ;->ۡ(Lbin/mt/json/JSONObject;)Ll/ۛ᩻ۜ;

    move-result-object p1

    .line 144
    iget-object v0, p0, Ll/ۧܳۜ;->ܽ:Ll/᩵᩻ۜ;

    new-instance v1, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 144
    invoke-virtual {v0, p1, v1}, Ll/᩵᩻ۜ;->֫(Ll/ۛ᩻ۜ;Ll/ܺۨ᩻;)Ll/᩸ۜۜ;

    move-result-object p1

    .line 145
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 146
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/۟ܿۜ;->֫(Ll/᩸ۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 148
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 149
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Edit text inside an APK edit session. For ordinary zip_entry text, the existing entry and encoded result must each fit within 10485760 uncompressed bytes (10 MiB). For existing targets, first call mt_apk_read_text on the exact locator string and copy locator and data.targetVersion. Send edits as edits[] items with mode, matchText, and writeText; top-level mode/matchText/writeText are invalid. edit_text rejects stale targetVersion values for that exact target; dex_method targetVersion is scoped to the method text, not the owner class. Local edits match the same LF-normalized original target text and apply atomically; any failed edit leaves the session unchanged. Use one write_target for a whole-target write, including targetVersion=\"missing\" to create a missing dex_class, axml, or zip_entry. Use mt_apk_delete_target to remove a whole class, method, AXML, text, or binary ZIP entry without first reading it. Local modes replace_match/insert_before_match/insert_after_match require exactly one occurrence of matchText; replace_match with writeText=\"\" still deletes only the matched text. On TEXT_MATCH_AMBIGUOUS, retry with longer surrounding context. Smali and AXML are prepared before saving; failures leave the session unchanged. resources.arsc cannot be edited as zip_entry; use mt_apk_resource_edit."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Edit APK Text"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۧܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"For existing targets, use the exact locator string from mt_apk_read_text. Locators from mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search must be read first to obtain data.targetVersion. edit_text accepts only dex_class:, dex_method:, axml:, and zip_entry:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;. dex_method requires a full Smali method reference such as dex_method:Lcom/example/Foo;->bar()V. zip_entry uses ZIP entry paths after the first colon.\"\n  },\n  \"targetVersion\": {\n    \"type\": \"string\",\n    \"description\": \"Required current target version: 16 lowercase hex digits. Copy data.targetVersion from the mt_apk_read_text result for the same workspaceId, editSessionId, and locator. For a missing dex_class, axml, or zip_entry creation with write_target, pass the literal string \\\"missing\\\". dex_method targetVersion is scoped to that method text only, not to the owner class.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic edits for this one locator. Must contain at least one item. All local matchText values are matched against the original LF-normalized target text before anything is saved. write_target must be the only item. Item indexes are 0-based in failedEditIndex diagnostics.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"mode\": {\n          \"type\": \"string\",\n          \"enum\": [\n            \"write_target\",\n            \"replace_match\",\n            \"insert_before_match\",\n            \"insert_after_match\"\n          ],\n          \"description\": \"write_target writes the whole locator target and creates missing dex_class, axml, or zip_entry targets when targetVersion is \\\"missing\\\"; dex_method write_target replaces one existing method block. replace_match replaces non-empty matchText and may delete it with writeText=\\\"\\\"; insert_before_match and insert_after_match insert non-empty writeText before or after non-empty matchText. Insert modes concatenate writeText literally and never add a newline automatically. Use mt_apk_delete_target for whole-target deletion. Do not pass unified-diff text, @@ headers, or unavailable mode names.\"\n        },\n        \"matchText\": {\n          \"type\": \"string\",\n          \"description\": \"For local match modes, exact current LF-normalized text that must appear exactly once anywhere in the current target. If it appears multiple times, the edit is rejected and you must retry with longer surrounding context. It must include every matched character, including LF line breaks; for whole-line or multi-line replacement, include every matched line break, and whole-line replacement usually includes the line\'s trailing LF. For write_target pass an empty string.\"\n        },\n        \"writeText\": {\n          \"type\": \"string\",\n          \"description\": \"For write_target, full locator text: dex_class Smali must contain exactly one .class matching locator target after the first colon; dex_method Smali must contain exactly one complete .method ... .end method block matching locator target after the first colon; AXML should be complete XML source; zip_entry may be empty and is encoded directly. Smali and AXML are prepared before saving; failures leave the session unchanged. For existing zip_entry locators, write LF text and the saved bytes keep the entry\'s original line ending style; new zip_entry locators use LF. For replace_match, text to write in place of matchText; writeText=\\\"\\\" deletes the matched text. For insert_before_match and insert_after_match, non-empty text to concatenate literally before or after matchText; no newline is added automatically, so include LF in writeText when inserting a separate line.\"\n        }\n      },\n      \"required\": [\n        \"mode\",\n        \"matchText\",\n        \"writeText\"\n      ]\n    }\n  }\n}\n"

    .line 60
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۧܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۧܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 120
    :cond_0
    invoke-static {}, Ll/۟ܿۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۧܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_edit_text"

    return-object v0
.end method
