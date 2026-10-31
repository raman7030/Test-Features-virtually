.class public final Ll/۠ۢۜ;
.super Ljava/lang/Object;
.source "56XR"


# direct methods
.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 12

    .line 152
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspace_to_local"

    const-string v2, "local_to_edit_session"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "Completed copy direction."

    .line 153
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "direction"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v3, "Workspace containing the source or destination entry."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 157
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Empty for a base workspace read; otherwise the observed or modified edit session."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "editSessionId"

    .line 159
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Copied ordinary zip_entry locator."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "locator"

    .line 161
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Normalized absolute local source or destination path fixed for this call."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "localPath"

    .line 163
    invoke-virtual {v0, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 165
    invoke-static {}, Ll/۠ۢۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "warnings"

    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "integer"

    const-string v9, "Number of bytes copied."

    const-string v10, "size"

    const-string v11, "Successful workspace entry payload copy."

    .line 0
    invoke-static {v0, v3, v9, v10, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 174
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "Requested direction, or null when it could not be parsed."

    .line 103
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 175
    invoke-virtual {v9, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "Workspace id, or null for an argument error."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 177
    invoke-virtual {v2, v4, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Edit session id, including an empty base sentinel, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 179
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Normalized zip_entry locator, or null when unavailable."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 181
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Normalized absolute local path, or null before path resolution."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 183
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "boolean"

    const-string v5, "Whether the logical destination may already have changed."

    .line 124
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "changed"

    .line 185
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "atomic or best_effort when a publication guarantee was selected."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "operationMode"

    .line 187
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Whether the final destination state is known."

    .line 124
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "stateKnown"

    .line 189
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 191
    invoke-static {}, Ll/۠ۢۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v2, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Bytes copied before failure; this does not mean those bytes reached the destination. Null when unknown."

    .line 117
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "bytesCopied"

    .line 192
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Whether retrying the same copy arguments is safe."

    .line 124
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "safeToRetry"

    .line 194
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Stable workspace entry copy failure context; unavailable values are null."

    .line 172
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 31
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 213
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    const-string v5, "Normalized absolute copied local destination path."

    const-string v6, "Arguments for mt_file_stat."

    .line 0
    invoke-static {v3, v1, v5, v4, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_file_stat"

    const-string v4, "inspect"

    .line 211
    invoke-static {v1, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_read_bytes"

    .line 218
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 216
    invoke-static {v5, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 221
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_workspace_open"

    .line 219
    invoke-static {v5, v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v3, v5, v1

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const-string v1, "Success returns mt_file_stat for the local destination or mt_apk_read_bytes for up to the first 256 entry bytes. Neither checks complete content equality. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open for retry."

    .line 208
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_apk_copy_entry. data identifies the copied raw payload, the normalized local path, and any warnings. For workspace_to_local, nextActions checks destination file metadata; for local_to_edit_session, it reads up to the first 256 bytes. Neither action verifies the complete copied content; a corrupt workspace may return mt_apk_workspace_open for retry."

    .line 27
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "description"

    const-string v1, "Non-fatal metadata, cleanup, or notification degradation."

    const-string v2, "type"

    const-string v3, "array"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One warning message."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    .line 203
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
