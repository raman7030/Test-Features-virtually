.class public final Ll/֫ܳۜ;
.super Ll/ۙۛ᩻;
.source "L779"


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
    iput-object p1, p0, Ll/֫ܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 51
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

    .line 115
    invoke-static {p1}, Ll/۟ܿۜ;->ᩳ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 1

    .line 129
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 130
    invoke-static {p1}, Ll/۬ܳۜ;->ۢ(Lbin/mt/json/JSONObject;)Ll/۫᩻ۜ;

    move-result-object p1

    .line 131
    iget-object v0, p0, Ll/֫ܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ll/۫᩻ۜ;)Ll/֫᩷ۜ;

    move-result-object p1

    .line 132
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 133
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/۟ܿۜ;->֫(Ll/֫᩷ۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 135
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 136
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Edit one or more resources.arsc values inside an APK edit session using complete valueXml from mt_apk_resource_read. Pass edits[] items; each item has locator, variant, targetVersion, and valueXml for one resourceId+variant. Runtime allows 1..200 items; around 20 per call is recommended. Items apply atomically in edits[] order, later items can observe earlier edits, and dependent valueXml edits should put the dependency first. Duplicate resourceId+variant items are rejected; failedEditIndex is 0-based and matches edits[i]. valueXml must contain exactly one supported root element and cannot change the root name, resource id, or variant, and it cannot create new resources. stale targetVersion is checked before semantic no-op. On resource-name-confused APKs, APP references and style item attr names must use 8 uppercase hex digits without 0x in output, while input also accepts a 0x prefix; android: system names remain accepted."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Edit APK Resource"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/֫ܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic resource value edits. Must contain 1..200 items at runtime; around 20 is recommended. Items apply in order and failedEditIndex uses this 0-based array index.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string copied from mt_apk_resource_read, such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Exact resource variant copied from the value to edit. Do not pass *.\"\n        },\n        \"targetVersion\": {\n          \"type\": \"string\",\n          \"description\": \"Required semantic targetVersion copied from results[].targetVersion for the same workspaceId, editSessionId, resourceId, and variant.\"\n        },\n        \"valueXml\": {\n          \"type\": \"string\",\n          \"description\": \"Complete single-entry resource XML copied from results[].valueXml, optionally modified. The root name attribute is read-only and must remain unchanged.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\",\n        \"targetVersion\",\n        \"valueXml\"\n      ]\n    }\n  }\n}\n"

    .line 59
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 12

    .line 107
    iget-object v0, p0, Ll/֫ܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 202
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this edit session."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 203
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this resource edit."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 204
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v5, "Whether this batch changed resource values in the edit session."

    .line 124
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "changed"

    .line 205
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "integer"

    const-string v7, "Number of edits whose semantic targetVersion changed."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "changedCount"

    .line 206
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Number of edits whose semantic targetVersion stayed the same."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "noOpCount"

    .line 207
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "description"

    const-string v8, "Per-edit results in the same order as input edits[]."

    const-string v9, "type"

    const-string v10, "array"

    .line 0
    invoke-static {v9, v10, v7, v8}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 241
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "0-based input edits[] index."

    .line 110
    invoke-static {v5, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "index"

    .line 242
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Edited resource locator."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "locator"

    .line 243
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Edited resource variant."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "variant"

    .line 244
    invoke-virtual {v8, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Whether this item changed its resource value in the edit session."

    .line 124
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 245
    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Semantic targetVersion after this edit item, as 16 lowercase hex digits."

    .line 103
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "newTargetVersion"

    .line 246
    invoke-virtual {v6, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "One mt_apk_resource_edit item result."

    .line 241
    invoke-static {v6, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "items"

    invoke-virtual {v7, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "results"

    .line 208
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Successful mt_apk_resource_edit data."

    .line 202
    invoke-static {v0, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 227
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Workspace id, or null."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 228
    invoke-virtual {v6, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Edit session id, or null."

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 229
    invoke-virtual {v3, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Rejected resource locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 230
    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Rejected resource variant, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 231
    invoke-virtual {v3, v11, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Current targetVersion when stale was detected, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "currentTargetVersion"

    .line 232
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based edits[] index for the rejected item, or null for top-level parameter errors."

    .line 117
    invoke-static {v5, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "failedEditIndex"

    .line 233
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 250
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether resources.arsc appears resource-name confused."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "confused"

    .line 251
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "names_or_hex"

    const-string v5, "hex8_upper_no_0x"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "APP reference output policy."

    .line 252
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "appReferenceOutput"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether APP name references are accepted in valueXml input."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "appNameReferencesAccepted"

    .line 254
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether android: system name references are accepted in valueXml input."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "systemNameReferencesAccepted"

    .line 255
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "hexPrefixAccepted"

    .line 256
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Resource name/reference policy for this ARSC snapshot."

    .line 250
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 234
    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "resourceNamePolicy"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_resource_edit diagnostics."

    .line 227
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 45
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "retry"

    .line 289
    invoke-static {}, Ll/ۧᩳܽ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_resource_read"

    .line 288
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "mt_apk_resource_edit errors may return a re-read action with current valueXml and targetVersion."

    .line 287
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_resource_edit. data returns batch edit counts and per-item new targetVersion values."

    .line 44
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 110
    iput-object v0, p0, Ll/֫ܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_edit"

    return-object v0
.end method
