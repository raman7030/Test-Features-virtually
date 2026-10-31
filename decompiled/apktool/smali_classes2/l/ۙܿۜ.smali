.class public final Ll/ۙܿۜ;
.super Ljava/lang/Object;
.source "6773"


# direct methods
.method public static ֫(Ll/۟ۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 17

    move-object/from16 v0, p0

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 293
    iget v2, v0, Ll/۟ۛ᩻;->ᩳ:I

    iget v3, v0, Ll/۟ۛ᩻;->֫:I

    if-ge v2, v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 39
    :goto_0
    iget v5, v0, Ll/۟ۛ᩻;->ܽ:I

    iget-object v6, v0, Ll/۟ۛ᩻;->ܿ:Ljava/lang/String;

    const-string v7, "nextCursor"

    const/16 v8, 0xc8

    const-string v9, "limitMax"

    const-string v10, "prefix"

    if-eqz v4, :cond_1

    .line 58
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 59
    invoke-virtual {v4, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "recommendedLimit"

    .line 60
    invoke-virtual {v4, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 61
    invoke-virtual {v4, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v15

    .line 42
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "offset"

    invoke-virtual {v4, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v16

    const/4 v14, 0x0

    const-string v11, "available_apks"

    const-string v12, "available_apks"

    const-string v13, ""

    .line 115
    invoke-static/range {v11 .. v16}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "editSessionId"

    const-string v11, ""

    const-string v12, "workspaceId"

    const-string v13, "available_apks"

    .line 0
    invoke-static {v12, v13, v8, v11}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 48
    invoke-virtual {v8, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v11, "limit"

    .line 49
    invoke-virtual {v8, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "mt_apk_continue"

    const-string v11, "continue"

    const-string v12, "Continue available APK files"

    .line 43
    invoke-static {v5, v8, v11, v12}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v1, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 65
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 66
    invoke-virtual {v5, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v0, Ll/۟ۛ᩻;->ۧ:Ljava/util/ArrayList;

    .line 77
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 78
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܰۛ᩻;

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "path"

    iget-object v14, v11, Ll/ܰۛ᩻;->ܳ:Ljava/lang/String;

    .line 80
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "size"

    iget-wide v14, v11, Ll/ܰۛ᩻;->᩻:J

    .line 81
    invoke-virtual {v12, v13, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "lastModified"

    iget-wide v14, v11, Ll/ܰۛ᩻;->ۧ:J

    .line 82
    invoke-virtual {v12, v13, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "appLabel"

    iget-object v14, v11, Ll/ܰۛ᩻;->֫:Ljava/lang/String;

    .line 83
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "packageName"

    iget-object v14, v11, Ll/ܰۛ᩻;->ܿ:Ljava/lang/String;

    .line 84
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "versionName"

    iget-object v14, v11, Ll/ܰۛ᩻;->᩷:Ljava/lang/String;

    .line 85
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 86
    iget-object v13, v11, Ll/ܰۛ᩻;->ۜ:Ljava/lang/Long;

    if-nez v13, :cond_2

    sget-object v13, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_3

    :cond_2
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static {v13, v14}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v13

    :goto_3
    const-string v14, "versionCode"

    invoke-virtual {v12, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "manifestAvailable"

    iget-boolean v14, v11, Ll/ܰۛ᩻;->ܽ:Z

    .line 87
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "manifestError"

    iget-object v11, v11, Ll/ܰۛ᩻;->ᩳ:Ljava/lang/String;

    .line 88
    invoke-virtual {v12, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 79
    invoke-virtual {v8, v11}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_3
    const-string v10, "items"

    .line 67
    invoke-virtual {v5, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 68
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    if-ge v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    const-string v3, "hasMore"

    .line 69
    invoke-virtual {v8, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-nez v4, :cond_5

    .line 70
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_5

    :cond_5
    invoke-static {v4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_5
    invoke-virtual {v2, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "returnedCount"

    .line 71
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/16 v3, 0xc8

    .line 72
    invoke-virtual {v2, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "totalAvailableCount"

    iget v0, v0, Ll/۟ۛ᩻;->ܳ:I

    .line 73
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "pagination"

    .line 68
    invoke-virtual {v5, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 51
    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
