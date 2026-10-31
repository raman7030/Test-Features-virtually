.class public final Ll/۫ܳۜ;
.super Ljava/lang/Object;
.source "577G"


# direct methods
.method public static ֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 10

    .line 31
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    if-nez p0, :cond_0

    goto/16 :goto_5

    .line 35
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 36
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "line"

    .line 37
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const-string v4, "column"

    .line 38
    invoke-virtual {v1, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "locator"

    .line 40
    invoke-static {v1}, Ll/۫ܳۜ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "className"

    const/4 v8, 0x0

    .line 41
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "errorCode"

    .line 42
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "message"

    .line 43
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const/4 v7, -0x1

    if-eqz v3, :cond_2

    .line 44
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v2, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_2
    invoke-virtual {v6, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v5, :cond_4

    .line 45
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1, v4, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    goto :goto_4

    :cond_4
    :goto_3
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_4
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_5
    :goto_5
    return-object v0
.end method

.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "No tool-specific diagnostics."

    .line 24
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;
    .locals 3

    const-string v0, "locator"

    .line 54
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_0

    .line 56
    invoke-static {v0}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "targetType"

    const/4 v1, 0x0

    .line 58
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "target"

    .line 59
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 58
    invoke-static {v0, p0}, Ll/۬ܳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method
