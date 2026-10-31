.class public final Ll/ۗ֡ۢ;
.super Ljava/lang/Object;
.source "A7BU"


# direct methods
.method public static ֫(Ljava/util/Map;)Ll/۠ܳܳ;
    .locals 2

    .line 22
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/util/Map;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 36
    sget-object v0, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const-string v1, "application/json"

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    .line 76
    invoke-static {v0, v1, p0}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;
    .locals 2

    .line 43
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "error"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "application/json"

    .line 44
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-static {p0, v0, p1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p0

    return-object p0
.end method
