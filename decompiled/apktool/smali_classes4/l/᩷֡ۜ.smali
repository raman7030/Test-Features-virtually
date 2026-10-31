.class public final Ll/᩷֡ۜ;
.super Ljava/lang/Object;
.source "L6KZ"


# direct methods
.method public static ֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 13

    .line 17
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "Normalized absolute source ZIP path."

    goto :goto_0

    :cond_0
    const-string v1, "Normalized absolute output ZIP path."

    :goto_0
    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 17
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "changed"

    const-string v4, "createdDirectories"

    const-string v5, "completedFiles"

    const-string v6, "boolean"

    const-string v7, "integer"

    if-eqz p1, :cond_1

    const-string v8, "Number of files successfully extracted."

    .line 110
    invoke-static {v7, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 20
    invoke-virtual {v0, v5, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Number of directories created by this call."

    .line 110
    invoke-static {v7, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 21
    invoke-virtual {v8, v4, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_1

    :cond_1
    const-string v8, "Final ZIP file size in bytes."

    .line 110
    invoke-static {v7, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "size"

    .line 23
    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Whether the output file changed."

    .line 124
    invoke-static {v6, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 24
    invoke-virtual {v8, v1, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_1
    const-string v8, "Non-fatal metadata, cleanup, or notification issues."

    .line 26
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "warnings"

    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 27
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "Normalized archive path, when available."

    .line 103
    invoke-static {v2, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 28
    invoke-virtual {v8, v3, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "ZIP paths involved in the failure."

    .line 29
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "entryPaths"

    invoke-virtual {v3, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "description"

    const-string v10, "Zero-based indexes in operations, sources, or entries for this tool; empty for a whole-call failure."

    const-string v11, "type"

    const-string v12, "array"

    .line 0
    invoke-static {v11, v12, v8, v10}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "Zero-based request item index."

    .line 110
    invoke-static {v7, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "items"

    .line 32
    invoke-virtual {v8, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "operationIndexes"

    .line 30
    invoke-virtual {v3, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Whether destination changes occurred or may have occurred."

    .line 124
    invoke-static {v6, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 33
    invoke-virtual {v3, v1, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Whether the destination state after failure is known."

    .line 124
    invoke-static {v6, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "stateKnown"

    .line 34
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Write guarantee: atomic replaces a target in one step; best_effort may leave a changed target after failure; non_atomic may leave completed files and directories from the batch. Null when not applicable. Always inspect changed and stateKnown before retrying."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "operationMode"

    .line 35
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Non-fatal issues observed before the failure."

    .line 36
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-eqz p1, :cond_2

    const-string p1, "Destination involved in the failure: normalized absolute path when resolved, otherwise original input; null when unavailable."

    .line 103
    invoke-static {v2, p1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "destinationPath"

    .line 38
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "Files successfully written before stopping."

    .line 110
    invoke-static {v7, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 39
    invoke-virtual {p1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "Directories created before stopping."

    .line 110
    invoke-static {v7, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 40
    invoke-virtual {p1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_2
    const-string p1, "Absolute local source path that failed, possibly a child of a directory mapping; null when unavailable or unrelated to a source."

    .line 103
    invoke-static {v2, p1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "sourcePath"

    .line 42
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_2
    const-string p1, "Result for "

    const-string v2, "."

    .line 0
    invoke-static {p1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "ZIP operation result."

    .line 45
    invoke-static {v0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "ZIP write failure details."

    .line 46
    invoke-static {v1, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "No automatic follow-up action; correct the request or inspect the reported state before retrying."

    .line 47
    invoke-static {v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 44
    invoke-static {p0, p1, v0, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Z)Lbin/mt/json/JSONObject;
    .locals 7

    .line 51
    iget-object v0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 52
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    .line 70
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_0

    .line 71
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 52
    :cond_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryPaths"

    .line 75
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_1

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    goto :goto_0

    :cond_1
    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v3, v4

    .line 53
    :goto_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "operationIndexes"

    .line 75
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_2

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    goto :goto_1

    :cond_2
    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v3, v4

    .line 54
    :goto_1
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "changed"

    .line 55
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "stateKnown"

    .line 56
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "operationMode"

    .line 70
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-nez v3, :cond_3

    .line 71
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 57
    :cond_3
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    .line 75
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_4

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    goto :goto_2

    :cond_4
    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v3, v4

    .line 58
    :goto_2
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-eqz p1, :cond_6

    const-string p1, "destinationPath"

    .line 70
    invoke-virtual {v0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-nez v2, :cond_5

    .line 71
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 60
    :cond_5
    invoke-virtual {v1, p1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "completedFiles"

    const-wide/16 v3, 0x0

    .line 61
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-virtual {p1, v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v2, "createdDirectories"

    .line 62
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    goto :goto_3

    :cond_6
    const-string p1, "sourcePath"

    .line 70
    invoke-virtual {v0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_7

    .line 71
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 64
    :cond_7
    invoke-virtual {v1, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 66
    :goto_3
    iget-object p1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p0, v1, p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
