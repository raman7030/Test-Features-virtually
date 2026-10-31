.class public final Ll/ۤۛ᩻;
.super Ljava/lang/Object;
.source "E79W"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 1

    const/4 v0, 0x1

    .line 41
    invoke-static {p0, v0}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "tool"

    const-string v1, "purpose"

    .line 0
    invoke-static {v0, p1, v1, p2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "description"

    .line 91
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "arguments"

    .line 92
    invoke-virtual {p1, p2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Z)Lbin/mt/json/JSONObject;
    .locals 5

    .line 100
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 101
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "type"

    const-string v4, "text"

    .line 102
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 101
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "structuredContent"

    .line 104
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "isError"

    .line 105
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬ۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 27
    iget-object p0, p0, Ll/۬ۛ᩻;->֫:Lbin/mt/json/JSONObject;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method
