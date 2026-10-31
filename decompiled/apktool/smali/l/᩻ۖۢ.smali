.class public final Ll/᩻ۖۢ;
.super Ljava/lang/Object;
.source "I764"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-nez p0, :cond_0

    return-wide p2

    .line 39
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result p1

    if-nez p1, :cond_1

    .line 40
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide p0

    return-wide p0

    .line 42
    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0xa

    .line 44
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p1

    .line 48
    :try_start_1
    invoke-static {p0}, Ll/᩺᩵ܿ;->֫(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-wide p0

    .line 50
    :catch_1
    throw p1
.end method

.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 25
    :try_start_0
    invoke-static {p0}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 27
    new-instance v0, Ll/᩺ܺۢ;

    const-string v1, "Unable to parse radare2 native response"

    .line 19
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    throw v0
.end method
