.class public final Ll/ܰۤ᩻;
.super Ljava/lang/Object;
.source "H79P"


# instance fields
.field public final ֫:Ll/ۤۤ᩻;

.field public final ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۫ۛ᩻;


# direct methods
.method public constructor <init>(Ll/ۤۤ᩻;Lbin/mt/json/JSONObject;Ll/۫ۛ᩻;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ܰۤ᩻;->֫:Ll/ۤۤ᩻;

    .line 22
    iput-object p2, p0, Ll/ܰۤ᩻;->ۧ:Lbin/mt/json/JSONObject;

    .line 23
    iput-object p3, p0, Ll/ܰۤ᩻;->ܽ:Ll/۫ۛ᩻;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 136
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 137
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "Invalid "

    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 48
    invoke-static {p0, v0, v0, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 141
    throw p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 92
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "protocolVersion"

    .line 93
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "serverInfo"

    iget-object v1, p0, Ll/ܰۤ᩻;->ۧ:Lbin/mt/json/JSONObject;

    .line 94
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 95
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "tools"

    .line 96
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "capabilities"

    .line 95
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const-string v1, "name"

    .line 121
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 122
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "arguments"

    .line 125
    invoke-static {p1, v0}, Ll/ܰۤ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    .line 127
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 129
    :cond_0
    iget-object v0, p0, Ll/ܰۤ᩻;->ܽ:Ll/۫ۛ᩻;

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/۫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "Missing name"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 123
    throw p1

    :cond_2
    const-string p1, "Missing params"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 119
    throw p1
.end method

.method private ܽ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    .line 103
    invoke-static {p1, v0}, Ll/ܰۤ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "protocolVersion"

    .line 107
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    iget-object v0, p0, Ll/ܰۤ᩻;->֫:Ll/ۤۤ᩻;

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۤ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Invalid protocolVersion"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 109
    throw p1

    :cond_1
    const-string p1, "Missing protocolVersion"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 105
    throw p1
.end method


# virtual methods
.method public final ֫(Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;
    .locals 4

    const-string v0, "id"

    .line 37
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "jsonrpc"

    .line 38
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "method"

    .line 39
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v1, :cond_8

    .line 40
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, "2.0"

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 45
    :cond_0
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "tools/call"

    if-nez v0, :cond_1

    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 48
    sget-object p1, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    invoke-static {p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;)Ll/᩺ۤ᩻;

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_0
    const-string v3, "initialize"

    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 53
    invoke-direct {p0, p1}, Ll/ܰۤ᩻;->ܽ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    .line 54
    sget-object v1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    .line 55
    invoke-direct {p0, p1}, Ll/ܰۤ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1, v0}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 54
    invoke-static {v1, p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    goto/16 :goto_0

    :cond_2
    const-string v3, "notifications/initialized"

    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 57
    sget-object p1, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    invoke-static {p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;)Ll/᩺ۤ᩻;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v3, "ping"

    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 59
    sget-object p1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    .line 60
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 59
    invoke-static {p1, v1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    goto :goto_0

    :cond_4
    const-string v3, "tools/list"

    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 62
    sget-object p1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    .line 64
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "tools"

    iget-object v3, p0, Ll/ܰۤ᩻;->ܽ:Ll/۫ۛ᩻;

    invoke-virtual {v3}, Ll/۫ۛ᩻;->֫()Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 63
    invoke-static {v1, v0}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 62
    invoke-static {p1, v1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    goto :goto_0

    .line 65
    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 66
    sget-object v1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const-string v2, "params"

    .line 68
    invoke-static {p1, v2}, Ll/ܰۤ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܰۤ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 67
    invoke-static {p1, v0}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 66
    invoke-static {v1, p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    goto :goto_0

    .line 70
    :cond_6
    sget-object p1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const-string v1, "Method not found"

    const/16 v2, -0x7f59

    .line 71
    invoke-static {v0, v2, v1}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 70
    invoke-static {p1, v1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 79
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const/16 v1, -0x7f5b

    const-string v2, "Internal error"

    .line 80
    invoke-static {v0, v1, v2}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 79
    invoke-static {p1, v1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 75
    sget-object v1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    const/16 v2, -0x7f5a

    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-static {v0, v2, p1}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 75
    invoke-static {v1, p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    :goto_0
    if-nez v0, :cond_7

    .line 85
    sget-object p1, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    invoke-static {p1}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;)Ll/᩺ۤ᩻;

    move-result-object p1

    :cond_7
    return-object p1

    .line 41
    :cond_8
    :goto_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const/16 v1, -0x7f58

    const-string v2, "Invalid Request"

    .line 42
    invoke-static {v0, v1, v2}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 41
    invoke-static {p1, v0}, Ll/᩺ۤ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object p1

    return-object p1
.end method
