.class public final Ll/۟ܿۜ;
.super Ljava/lang/Object;
.source "S77V"


# direct methods
.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 7

    .line 275
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_workspace_open"

    const-string v2, "retry"

    .line 274
    invoke-static {v0, v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_read_text"

    .line 277
    invoke-static {}, Ll/ۧᩳܽ;->ۢ()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 276
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_read_bytes"

    .line 279
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 278
    invoke-static {v4, v3, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 281
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_list"

    const-string v5, "verify_workspace"

    .line 280
    invoke-static {v3, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_dex_read_class_outline"

    .line 283
    invoke-static {}, Ll/ۧᩳܽ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 282
    invoke-static {v6, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    const-string v0, "Edit success emits no follow-up actions; errors may return retry or workspace verification actions."

    .line 273
    invoke-static {v0, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/֫᩷ۜ;)Lbin/mt/json/JSONObject;
    .locals 11

    .line 107
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/֫᩷ۜ;->ܳ:Ljava/lang/String;

    .line 108
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/֫᩷ۜ;->ܽ:Ljava/lang/String;

    .line 109
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-boolean v1, p0, Ll/֫᩷ۜ;->֫:Z

    const-string v2, "changed"

    .line 110
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "changedCount"

    iget v3, p0, Ll/֫᩷ۜ;->ۧ:I

    .line 111
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "noOpCount"

    iget v3, p0, Ll/֫᩷ۜ;->ᩳ:I

    .line 112
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object p0, p0, Ll/֫᩷ۜ;->ܿ:Ljava/util/ArrayList;

    .line 117
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 118
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ۜۜ;

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "index"

    iget v6, v3, Ll/۟ۜۜ;->ۧ:I

    .line 120
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v9, 0x0

    iget-object v10, v3, Ll/۟ۜۜ;->ᩳ:Ljava/lang/String;

    const-string v5, "resource"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 121
    invoke-static/range {v5 .. v10}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "locator"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "variant"

    iget-object v6, v3, Ll/۟ۜۜ;->ܿ:Ljava/lang/String;

    .line 123
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-boolean v5, v3, Ll/۟ۜۜ;->֫:Z

    .line 124
    invoke-virtual {v4, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "newTargetVersion"

    iget-object v3, v3, Ll/۟ۜۜ;->ܽ:Ljava/lang/String;

    .line 125
    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const-string p0, "results"

    .line 113
    invoke-virtual {v0, p0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 67
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸ۜۜ;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 99
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/᩸ۜۜ;->ۜ:Ljava/lang/String;

    .line 100
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/᩸ۜۜ;->֫:Ljava/lang/String;

    .line 101
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۜۜ;->᩻:Ljava/lang/String;

    iget-object v2, p0, Ll/᩸ۜۜ;->ܳ:Ljava/lang/String;

    .line 102
    invoke-static {v1, v2}, Ll/۬ܳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "locator"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "newTargetVersion"

    iget-object p0, p0, Ll/᩸ۜۜ;->ᩳ:Ljava/lang/String;

    .line 103
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 60
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONValue;
    .locals 3

    .line 331
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v0, "locator"

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 332
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_0

    .line 333
    invoke-static {v0}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "targetType"

    const/4 v1, 0x0

    .line 335
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "target"

    .line 336
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 335
    invoke-static {v0, p0}, Ll/۬ܳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONArray;
    .locals 4

    .line 293
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 294
    iget-object p0, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 295
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "tool"

    const/4 v3, 0x0

    .line 315
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    .line 316
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "mt_apk_read_text"

    .line 317
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "mt_apk_read_bytes"

    .line 318
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "mt_apk_list"

    .line 319
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "mt_apk_dex_read_class_outline"

    .line 320
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 297
    :cond_1
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 188
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this edit session."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 189
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 190
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Successful mt_apk_session_create data."

    .line 188
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 212
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Workspace id, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 213
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_session_create diagnostics."

    .line 212
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 29
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/۟ܿۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_session_create. data returns the new edit session id."

    .line 28
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ()Lbin/mt/json/JSONObject;
    .locals 9

    .line 194
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this edit session."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 195
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 196
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edited locator for this edit_text request."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "locator"

    .line 197
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Version token of the edited target after this successful edit (16 lowercase hex digits, or missing); pass this for the next edit of the same target."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "newTargetVersion"

    .line 198
    invoke-virtual {v0, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Successful edit_text data."

    .line 194
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 217
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Workspace id, or null."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 218
    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Edit session id to keep using when fixing current failures, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 219
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Rejected edit_text request locator, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 220
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Only set for TARGET_VERSION_MISMATCH; current targetVersion at rejection time. Prefer nextActions to re-read and copy data.targetVersion; use this value directly only for the same target and editSessionId when not re-reading."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "currentTargetVersion"

    .line 221
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "integer"

    const-string v4, "0-based edits[] index for runtime failures tied to one edit, or JSON null for parameter errors, stale targetVersion, and prepare failures."

    .line 117
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "failedEditIndex"

    .line 222
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "description"

    const-string v6, "Edit session prepare failures bound to locator. Success data describes current saved session failures; edit_text error diagnostics describe the rejected candidate text."

    const-string v7, "type"

    const-string v8, "array"

    .line 0
    invoke-static {v7, v8, v4, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 263
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 264
    invoke-virtual {v6, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Dex class descriptor."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "className"

    .line 265
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Failure code."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "errorCode"

    .line 266
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Compiler error message."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "message"

    .line 267
    invoke-virtual {v5, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "0-based line in the failed text, or null."

    .line 117
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "line"

    .line 268
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "0-based column in the failed text, or null."

    .line 117
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "column"

    .line 269
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "One edit session prepare failure."

    .line 263
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "items"

    invoke-virtual {v4, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "failures"

    .line 223
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "edit_text diagnostics."

    .line 217
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 37
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/۟ܿۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_edit_text. data returns the edited locator and new targetVersion for the next edit of the same target."

    .line 36
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 131
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 0
    invoke-static {v2, v1, v0, v1}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 74
    invoke-static {p0}, Ll/۟ܿۜ;->ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 18

    move-object/from16 v0, p0

    .line 136
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v3, "workspaceId"

    .line 0
    invoke-static {v2, v3, v1, v3}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "editSessionId"

    invoke-static {v2, v3, v1, v3}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 139
    invoke-static/range {p0 .. p0}, Ll/۟ܿۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const-string v4, "locator"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "currentTargetVersion"

    .line 0
    invoke-static {v2, v3, v1, v3}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "failedEditIndex"

    .line 141
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 324
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    .line 327
    :cond_0
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    .line 325
    :cond_2
    :goto_0
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 141
    :goto_1
    invoke-virtual {v1, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "failures"

    .line 142
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 158
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    if-nez v2, :cond_4

    :cond_3
    move-object v0, v1

    goto/16 :goto_9

    .line 162
    :cond_4
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbin/mt/json/JSONValue;

    .line 163
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "line"

    .line 164
    invoke-virtual {v6, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    const-string v9, "column"

    .line 165
    invoke-virtual {v6, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    .line 166
    invoke-static {v6}, Ll/۫ܳۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v11

    const-string v12, "className"

    const/4 v13, 0x0

    .line 167
    invoke-virtual {v6, v12, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "errorCode"

    move-object/from16 v16, v2

    .line 168
    invoke-virtual {v6, v15, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "message"

    .line 169
    invoke-virtual {v6, v0, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v17, v1

    const/4 v1, -0x1

    if-eqz v8, :cond_6

    .line 170
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v6, v7, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v8, 0x0

    :goto_4
    if-eqz v10, :cond_8

    .line 171
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v6, v9, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v1, 0x0

    .line 178
    :goto_6
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 179
    invoke-virtual {v6, v4, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 180
    invoke-virtual {v6, v12, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 181
    invoke-virtual {v6, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 182
    invoke-virtual {v2, v0, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez v8, :cond_9

    .line 183
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_7

    :cond_9
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_7
    invoke-virtual {v0, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez v1, :cond_a

    .line 184
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_8

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_8
    invoke-virtual {v0, v9, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 166
    invoke-virtual {v5, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    goto/16 :goto_2

    .line 142
    :goto_9
    invoke-virtual {v0, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 81
    invoke-static/range {p0 .. p0}, Ll/۟ܿۜ;->ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONArray;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 146
    iget-object v0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v1, "resourceNamePolicy"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 147
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 0
    invoke-static {v0, v4, v3, v4}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "editSessionId"

    invoke-static {v0, v4, v3, v4}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 150
    invoke-static {p0}, Ll/۟ܿۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "variant"

    .line 0
    invoke-static {v0, v4, v3, v4}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "currentTargetVersion"

    invoke-static {v0, v4, v3, v4}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "failedEditIndex"

    .line 153
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 324
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 327
    :cond_0
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    .line 325
    :cond_2
    :goto_0
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 153
    :goto_1
    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez v2, :cond_3

    .line 154
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_3
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v2}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    move-object v2, v3

    :goto_2
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 304
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 305
    iget-object v2, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 306
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "tool"

    const/4 v5, 0x0

    .line 307
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "mt_apk_resource_read"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 308
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 88
    :cond_5
    invoke-static {p0, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
