.class public final Ll/ۨܿۜ;
.super Ll/ۙۛ᩻;
.source "C6YK"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ۨܿۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 60
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    .line 61
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    .line 62
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "workspaceId"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "editSessionId"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "locator"

    .line 42
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 56
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 42
    :goto_0
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 60
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 61
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 62
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "tool"

    const/4 v5, 0x0

    .line 63
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "mt_apk_list"

    .line 64
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "mt_apk_dex_read_class_outline"

    .line 65
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "mt_apk_workspace_open"

    .line 66
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 67
    :cond_2
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 39
    :cond_3
    invoke-static {p1, v0, v2}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 4

    .line 114
    :try_start_0
    invoke-static {p1}, Ll/۬ܳۜ;->᩻(Lbin/mt/json/JSONObject;)Ll/᩶᩻ۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :try_start_1
    iget-object v0, p0, Ll/ۨܿۜ;->ܽ:Ll/᩵᩻ۜ;

    new-instance v1, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 116
    invoke-virtual {v0, p1, v1}, Ll/᩵᩻ۜ;->֫(Ll/᩶᩻ۜ;Ll/ܺۨ᩻;)Ll/ۚۜۜ;

    move-result-object v0

    .line 118
    sget v1, Ll/ۡۨ᩻;->֫:I

    .line 119
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {v0}, Ll/ᩳ۬᩻;->֫(Ll/ۚۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v1

    :catch_0
    move-exception v0

    .line 50
    :try_start_2
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "workspaceId"

    iget-object v3, p1, Ll/᩶᩻ۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    iget-object v3, p1, Ll/᩶᩻ۜ;->֫:Ljava/lang/String;

    .line 51
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    iget-object v3, p1, Ll/᩶᩻ۜ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩶᩻ۜ;->ۧ:Ljava/lang/String;

    .line 52
    invoke-static {v3, p1}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 122
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 125
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 126
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Delete one exact locator from an APK edit session identified by a non-empty editSessionId without first calling mt_apk_read_text. Pass workspaceId and editSessionId from mt_apk_session_create plus a locator returned by list, search, or class outline. The tool accepts dex_class:, dex_method:, axml:, and zip_entry:; dex_field: is read-only. It has no targetVersion parameter and deletes the latest visible target without a stale-version check. zip_entry: deletes ordinary text, oversized text, binary, or AXML entry payloads without decoding them as text; axml: requires the current entry to be AXML. Standard classes*.dex entries, resources.arsc, ZIP directory entries, wildcard/batch targets, and the base workspace are rejected. A missing or already deleted target is an error, not an idempotent success. The source APK is never modified; mt_apk_build omits the deleted target from the generated APK. This tool is destructive within the edit session and is available without a VIP membership."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Delete APK Target"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۨܿۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class:, dex_method:, axml:, or zip_entry: locator to delete. A prior mt_apk_read_text call and targetVersion are not required. zip_entry: may identify text, binary, oversized, or AXML content, but not resources.arsc, a standard classes*.dex entry, or a ZIP directory entry.\"\n  }\n}\n"

    .line 70
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܿۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 9

    .line 90
    iget-object v0, p0, Ll/ۨܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 74
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id containing the modified edit session."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 75
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Non-empty edit session id that was modified."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 76
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Exact locator removed from the edit session view."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "locator"

    .line 77
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Always true for a successful deletion."

    const-string v6, "boolean"

    const-string v7, "deleted"

    const-string v8, "Successful mt_apk_delete_target data."

    .line 0
    invoke-static {v0, v6, v2, v7, v8}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 82
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Workspace id, or null for an argument error."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 83
    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Edit session id, or null for an argument error."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 84
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Rejected normalized locator, or null when it could not be parsed."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 85
    invoke-virtual {v2, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_delete_target diagnostics."

    .line 82
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 27
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 93
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_list"

    const-string v4, "verify_workspace"

    .line 91
    invoke-static {v2, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_dex_read_class_outline"

    .line 96
    invoke-static {}, Ll/ۧᩳܽ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 94
    invoke-static {v5, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 99
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_workspace_open"

    .line 97
    invoke-static {v5, v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const-string v2, "Successful deletion returns no next action. Missing class or method errors may suggest the matching session list or outline, and a corrupt workspace may suggest mt_apk_workspace_open."

    .line 89
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_delete_target. Successful data identifies the one deleted locator. Errors may suggest listing classes, reading a class outline, or reopening a corrupt workspace."

    .line 25
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 93
    iput-object v0, p0, Ll/ۨܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_delete_target"

    return-object v0
.end method
