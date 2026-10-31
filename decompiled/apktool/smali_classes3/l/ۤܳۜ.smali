.class public final Ll/ۤܳۜ;
.super Ljava/lang/Object;
.source "E6ZH"


# direct methods
.method public static ֫(Ll/ۧ᩻ۜ;)Lbin/mt/json/JSONObject;
    .locals 9

    .line 34
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩻ۜ;->֫:Ljava/util/ArrayList;

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫᩻ۜ;

    .line 46
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    iget-object v7, v4, Ll/֫᩻ۜ;->ܺ:Ljava/lang/String;

    .line 47
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "mt://workspace/"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Ll/֫᩻ۜ;->ܺ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "path"

    .line 48
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "sourcePath"

    iget-object v7, v4, Ll/֫᩻ۜ;->᩷:Ljava/lang/String;

    .line 49
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "sourceExists"

    iget-boolean v7, v4, Ll/֫᩻ۜ;->ۜ:Z

    .line 50
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "temporary"

    const/4 v7, 0x0

    .line 51
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "apkFileName"

    iget-object v7, v4, Ll/֫᩻ۜ;->֫:Ljava/lang/String;

    .line 52
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "appLabel"

    iget-object v7, v4, Ll/֫᩻ۜ;->ۧ:Ljava/lang/String;

    .line 53
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "packageName"

    iget-object v7, v4, Ll/֫᩻ۜ;->᩻:Ljava/lang/String;

    .line 54
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "versionName"

    iget-object v7, v4, Ll/֫᩻ۜ;->ۡ:Ljava/lang/String;

    .line 55
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 56
    iget-object v6, v4, Ll/֫᩻ۜ;->ۢ:Ljava/lang/Long;

    if-nez v6, :cond_0

    sget-object v6, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v6, v7}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    :goto_1
    const-string v7, "versionCode"

    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "createdAt"

    iget-wide v7, v4, Ll/֫᩻ۜ;->ܽ:J

    .line 57
    invoke-virtual {v5, v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "lastAccessedAt"

    iget-wide v7, v4, Ll/֫᩻ۜ;->ᩳ:J

    .line 58
    invoke-virtual {v5, v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "manifestAvailable"

    iget-boolean v7, v4, Ll/֫᩻ۜ;->ܿ:Z

    .line 59
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "manifestError"

    iget-object v4, v4, Ll/֫᩻ۜ;->ܳ:Ljava/lang/String;

    .line 60
    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 46
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_0

    :cond_1
    const-string v3, "items"

    .line 35
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "returnedCount"

    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "unavailableCount"

    iget p0, p0, Ll/ۧ᩻ۜ;->ۧ:I

    .line 37
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 34
    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
