.class public final Ll/ۧۛ᩻;
.super Ljava/lang/Object;
.source "J79K"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 66
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "jsonrpc"

    const-string v2, "2.0"

    .line 67
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez p1, :cond_0

    .line 88
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :cond_0
    const-string v1, "id"

    .line 68
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "result"

    .line 69
    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "jsonrpc"

    const-string v2, "2.0"

    .line 77
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-nez p0, :cond_0

    .line 88
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :cond_0
    const-string v1, "id"

    .line 78
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    .line 80
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "message"

    .line 81
    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "error"

    .line 79
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;
    .locals 0

    .line 59
    invoke-static {p1, p2, p3}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "application/json"

    .line 31
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p2, p1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p0

    return-object p0
.end method
