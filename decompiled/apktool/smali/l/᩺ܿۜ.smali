.class public final Ll/᩺ܿۜ;
.super Ll/ۙۛ᩻;
.source "Y75Z"


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
    iput-object p1, p0, Ll/᩺ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ll/ۗۛ᩻;Ll/ۙ᩻ۜ;)V
    .locals 3

    .line 141
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v0, p1, Ll/ۙ᩻ۜ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "workspaceId"

    .line 149
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 150
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 142
    :cond_0
    iget-object v0, p1, Ll/ۙ᩻ۜ;->֫:Ljava/lang/String;

    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "editSessionId"

    .line 149
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 150
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 143
    :cond_1
    iget-boolean p1, p1, Ll/ۙ᩻ۜ;->ۧ:Z

    invoke-static {p1}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p1

    const-string v0, "runBuildChecks"

    .line 149
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 150
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_2
    const/4 p1, 0x0

    .line 144
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p1

    const-string v0, "overlaySaved"

    .line 149
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 150
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 145
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string v0, "failures"

    .line 149
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 150
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_4
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
    .locals 6

    .line 65
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

    const-string v2, "runBuildChecks"

    const/4 v3, 0x0

    .line 68
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "overlaySaved"

    .line 69
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "failures"

    .line 70
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Ll/۫ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 141
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 142
    iget-object v2, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 143
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "tool"

    const/4 v5, 0x0

    .line 152
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "mt_apk_workspace_open"

    .line 153
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "mt_apk_read_text"

    .line 154
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "mt_apk_read_bytes"

    .line 155
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "mt_apk_list"

    .line 156
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "mt_apk_dex_read_class_outline"

    .line 157
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 145
    :cond_1
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 104
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :try_start_1
    invoke-static {p1}, Ll/۬ܳۜ;->ۜ(Lbin/mt/json/JSONObject;)Ll/ۙ᩻ۜ;

    move-result-object p1
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :try_start_2
    iget-object v0, p0, Ll/᩺ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ll/ۙ᩻ۜ;)Ll/ܶۜۜ;

    move-result-object v0

    .line 114
    sget v1, Ll/ۡۨ᩻;->֫:I

    .line 115
    new-instance v1, Ll/۬ۛ᩻;

    invoke-static {v0}, Ll/ܰۤ;->֫(Ll/ܶۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v1

    :catch_0
    move-exception v0

    .line 117
    :try_start_3
    invoke-static {v0, p1}, Ll/᩺ܿۜ;->֫(Ll/ۗۛ᩻;Ll/ۙ᩻ۜ;)V

    .line 118
    throw v0

    :catch_1
    move-exception v0

    .line 130
    iget-object v1, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "workspaceId"

    .line 155
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 156
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 130
    :goto_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    .line 155
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 156
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 131
    :goto_1
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "runBuildChecks"

    const/4 v2, 0x0

    .line 132
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "overlaySaved"

    .line 133
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "failures"

    .line 134
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 110
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 121
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 122
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Check an APK edit session without producing or signing an APK. runBuildChecks=false reports pending work and recorded failures. runBuildChecks=true runs pre-build content checks: prepare edited content, check changed entry readability, and merge Dex. It does not validate output paths, signing configuration, final APK packaging, or installability. Inspect buildCheckStatus and failures; passed applies only to these content checks."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "APK Edit Session Check"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩺ܿۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"runBuildChecks\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass false for current edit session status only. Pass true to run the pre-build content checks described above without producing or signing an APK.\"\n  }\n}\n"

    .line 60
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܿۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩺ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 83
    :cond_0
    invoke-static {}, Ll/ܰۤ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_session_check"

    return-object v0
.end method
