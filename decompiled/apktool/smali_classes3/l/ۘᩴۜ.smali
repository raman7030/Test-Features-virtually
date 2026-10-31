.class public final synthetic Ll/ۘᩴۜ;
.super Ljava/lang/Object;
.source "N6Y2"

# interfaces
.implements Ll/ۤۘۜ;


# virtual methods
.method public final ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 5

    .line 267
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "targetVersion"

    const-string v2, ""

    const-string v3, "path"

    const-string v4, "file.bin"

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffset"

    const/4 v3, 0x0

    .line 269
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxBytes"

    const/16 v3, 0x100

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 267
    invoke-static {p2, p3, p1, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method
