.class public Ll/ۨۤ᩻;
.super Ll/ۙܳܳ;
.source "C7AH"


# instance fields
.field public final ۖ:Ll/ܽۛ᩻;

.field public final ۘ:Ll/ۤۤ᩻;

.field public final ۡ:Ljava/lang/String;

.field public final ܺ:Ll/ܰۤ᩻;

.field public final ᩴ:Ll/ۛۤ᩻;

.field public final ᩵:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILl/ۤۤ᩻;Lbin/mt/json/JSONObject;Ll/۫ۛ᩻;Ll/ܽۛ᩻;Ll/ۚۢۜ;)V
    .locals 2

    .line 51
    invoke-direct {p0, p1}, Ll/ۙܳܳ;-><init>(I)V

    const-string p1, "/mcp"

    .line 52
    iput-object p1, p0, Ll/ۨۤ᩻;->ۡ:Ljava/lang/String;

    const-string p1, "protocolVersions"

    .line 53
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Ll/ۨۤ᩻;->ۘ:Ll/ۤۤ᩻;

    const-string p1, "MCP"

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "name"

    .line 277
    invoke-virtual {p3, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 278
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 279
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 280
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    move-object p1, v0

    .line 55
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ۨۤ᩻;->᩵:Ljava/lang/String;

    .line 57
    iput-object p5, p0, Ll/ۨۤ᩻;->ۖ:Ll/ܽۛ᩻;

    const-string p1, "requestAuthenticator"

    .line 58
    invoke-static {p6, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p6, p0, Ll/ۨۤ᩻;->ᩴ:Ll/ۛۤ᩻;

    .line 59
    new-instance p1, Ll/ܰۤ᩻;

    invoke-direct {p1, p2, p3, p4}, Ll/ܰۤ᩻;-><init>(Ll/ۤۤ᩻;Lbin/mt/json/JSONObject;Ll/۫ۛ᩻;)V

    iput-object p1, p0, Ll/ۨۤ᩻;->ܺ:Ll/ܰۤ᩻;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const-string v0, "method"

    .line 386
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 387
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V
    .locals 6

    .line 404
    invoke-virtual {p0}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "content-length"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 407
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 412
    :cond_1
    invoke-virtual {p0}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "transfer-encoding"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    .line 394
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܺ()Z

    move-result p0

    if-nez p0, :cond_2

    .line 395
    invoke-virtual {p1}, Ll/۠ܳܳ;->֫()V

    :cond_2
    return-void
.end method

.method public static ۧ(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 5

    .line 292
    invoke-virtual {p0}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "content-length"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 293
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v2, 0x800000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 294
    :cond_0
    new-instance p0, Ll/ܶܳܳ;

    sget-object v0, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    const-string v1, "Request body too large"

    invoke-direct {p0, v0, v1}, Ll/ܶܳܳ;-><init>(Ll/֨ܳܳ;Ljava/lang/String;)V

    throw p0

    .line 296
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܺ()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_3

    .line 297
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܽ()Ljava/lang/String;

    move-result-object p0

    .line 298
    invoke-static {p0}, Ll/ۨۤ᩻;->ܽ(Ljava/lang/String;)V

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    return-object p0

    .line 301
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 302
    invoke-virtual {p0, v0}, Ll/ܺܳܳ;->֫(Ljava/util/HashMap;)V

    const-string v2, "postData"

    .line 303
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v0

    .line 307
    :goto_1
    invoke-static {v1}, Ll/ۨۤ᩻;->ܽ(Ljava/lang/String;)V

    .line 308
    invoke-virtual {p0, v1}, Ll/ܺܳܳ;->֫(Ljava/lang/String;)V

    return-object v1
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Z
    .locals 6

    const-string v0, "jsonrpc"

    .line 212
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "id"

    .line 213
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "result"

    .line 214
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v3, "error"

    .line 215
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 216
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez p0, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-eq v2, v5, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-eqz v0, :cond_8

    .line 219
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, "2.0"

    .line 220
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    if-eqz v2, :cond_8

    if-nez p0, :cond_5

    return v4

    .line 245
    :cond_5
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    .line 248
    :cond_6
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 249
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz v0, :cond_8

    .line 250
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_4

    .line 254
    :cond_7
    :try_start_0
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asLong()J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    :cond_8
    :goto_4
    return v3
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 4

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 316
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 317
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/16 v3, 0x800

    if-ge v2, v3, :cond_2

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    .line 320
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 321
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v1, v1, 0x4

    move v0, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v1, v1, 0x3

    :goto_1
    const/high16 v2, 0x800000

    if-gt v1, v2, :cond_4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 327
    :cond_4
    new-instance p0, Ll/ܶܳܳ;

    sget-object v0, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    const-string v1, "Request body too large"

    invoke-direct {p0, v0, v1}, Ll/ܶܳܳ;-><init>(Ll/֨ܳܳ;Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "Invalid Request"

    .line 67
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Ll/ۨۤ᩻;->ۡ:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "text/plain; charset=UTF-8"

    if-nez v3, :cond_0

    .line 68
    sget-object v2, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const-string v3, "Not Found"

    .line 45
    invoke-static {v2, v5, v3}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v2

    .line 68
    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 70
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v3

    sget-object v6, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    const-string v7, "POST"

    const-string v8, "Allow"

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v3, v6, :cond_1

    new-array v2, v10, [Ljava/lang/Object;

    .line 71
    iget-object v3, v1, Ll/ۨۤ᩻;->᩵:Ljava/lang/String;

    aput-object v3, v2, v9

    const v3, 0x7f12058d

    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 265
    sget-object v3, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    .line 45
    invoke-static {v3, v5, v2}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v2

    .line 266
    invoke-virtual {v2, v8, v7}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 74
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v3

    sget-object v6, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    if-eq v3, v6, :cond_2

    const-string v2, "Only POST "

    const-string v3, " is supported"

    .line 0
    invoke-static {v2, v4, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 265
    sget-object v3, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    .line 45
    invoke-static {v3, v5, v2}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v2

    .line 266
    invoke-virtual {v2, v8, v7}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 336
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v3

    const-string v4, "accept"

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "application/json"

    if-eqz v3, :cond_7

    .line 337
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 340
    :cond_3
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    const-string v7, ","

    .line 341
    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v7, v3

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_5

    aget-object v10, v3, v8

    const-string v11, ";"

    const/4 v12, 0x2

    .line 342
    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    aget-object v10, v10, v9

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    .line 343
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_4

    .line 344
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 347
    :cond_5
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, "application/*"

    .line 348
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, "*/*"

    .line 349
    invoke-virtual {v6, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_1

    .line 78
    :cond_6
    sget-object v2, Ll/֨ܳܳ;->ܽ֫:Ll/֨ܳܳ;

    const-string v3, "Accept must allow application/json"

    .line 45
    invoke-static {v2, v5, v3}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v2

    .line 78
    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 356
    :cond_7
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v3

    const-string v6, "origin"

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_c

    .line 357
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_4

    .line 361
    :cond_8
    :try_start_0
    iget-object v6, v1, Ll/ۨۤ᩻;->ۖ:Ll/ܽۛ᩻;

    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    iget v6, v6, Ll/ܽۛ᩻;->֫:I

    const-string v7, "http"

    .line 86
    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 87
    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v7

    if-ne v7, v6, :cond_b

    .line 88
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    const-string v6, "127.0.0.1"

    .line 74
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "localhost"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_2

    .line 77
    :cond_9
    invoke-static {}, Ll/ܿ۬᩻;->֫()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v3, 0x1

    :goto_3
    if-eqz v3, :cond_b

    goto :goto_4

    :catch_0
    :cond_b
    const/4 v3, 0x0

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v3, 0x1

    :goto_5
    if-nez v3, :cond_d

    .line 81
    sget-object v2, Ll/֨ܳܳ;->ۛ:Ll/֨ܳܳ;

    const-string v3, "Origin is not allowed"

    .line 45
    invoke-static {v2, v5, v3}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v2

    .line 81
    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 83
    :cond_d
    iget-object v3, v1, Ll/ۨۤ᩻;->ᩴ:Ll/ۛۤ᩻;

    .line 84
    invoke-interface {v3, v0}, Ll/ۛۤ᩻;->֫(Ll/ܺܳܳ;)Ll/۫ۤ᩻;

    move-result-object v3

    .line 85
    invoke-static {v3}, Ll/۫ۤ᩻;->ۧ(Ll/۫ۤ᩻;)Z

    move-result v6

    if-nez v6, :cond_e

    .line 86
    invoke-static {v3}, Ll/۫ۤ᩻;->֫(Ll/۫ۤ᩻;)Ll/۠ܳܳ;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۨۤ᩻;->֫(Ll/ܺܳܳ;Ll/۠ܳܳ;)V

    return-object v2

    .line 91
    :cond_e
    :try_start_1
    invoke-static/range {p1 .. p1}, Ll/ۨۤ᩻;->ۧ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 109
    :try_start_2
    invoke-static {v3}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3
    :try_end_2
    .catch Lbin/mt/json/JSONParseException; {:try_start_2 .. :try_end_2} :catch_1

    .line 113
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v6

    const-string v7, "error"

    const-string v8, "result"

    const-string v9, "method"

    const-string v10, "mcp-protocol-version"

    const-string v11, ""

    const-string v12, "2025-03-26"

    iget-object v13, v1, Ll/ۨۤ᩻;->ܺ:Ll/ܰۤ᩻;

    const-string v14, "initialize"

    const-string v15, "Invalid MCP-Protocol-Version"

    iget-object v0, v1, Ll/ۨۤ᩻;->ۘ:Ll/ۤۤ᩻;

    const-string v1, "id"

    if-eqz v6, :cond_20

    .line 114
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 378
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v6

    check-cast v6, Ljava/util/HashMap;

    invoke-virtual {v6, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_f

    move-object v6, v12

    .line 138
    :cond_f
    invoke-virtual {v0, v6}, Ll/ۤۤ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 139
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v2, -0x7f58

    invoke-static {v0, v1, v2, v15}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto/16 :goto_b

    :cond_10
    const/16 v0, -0x7f58

    .line 142
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    .line 143
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const-string v3, "Batch requests are not supported"

    invoke-static {v1, v2, v0, v3}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto/16 :goto_b

    .line 146
    :cond_11
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    if-nez v6, :cond_12

    .line 147
    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {v1, v3, v0, v2}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto/16 :goto_b

    .line 153
    :cond_12
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v6, 0x0

    const/4 v10, 0x0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lbin/mt/json/JSONValue;

    .line 154
    invoke-virtual {v12}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v15

    if-eqz v15, :cond_16

    invoke-virtual {v12}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v15

    .line 204
    invoke-virtual {v15, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v16

    if-nez v16, :cond_14

    .line 205
    invoke-virtual {v15, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v16

    if-nez v16, :cond_13

    invoke-virtual {v15, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    if-eqz v15, :cond_14

    :cond_13
    const/4 v15, 0x1

    goto :goto_7

    :cond_14
    const/4 v15, 0x0

    :goto_7
    if-eqz v15, :cond_16

    .line 155
    invoke-virtual {v12}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ll/ۨۤ᩻;->ۧ(Lbin/mt/json/JSONObject;)Z

    move-result v6

    if-nez v6, :cond_15

    .line 156
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const-string v1, "Invalid JSON-RPC response batch"

    goto :goto_8

    :cond_15
    const/4 v6, 0x1

    goto :goto_6

    :cond_16
    const/4 v10, 0x1

    goto :goto_6

    :cond_17
    if-eqz v6, :cond_19

    if-eqz v10, :cond_18

    .line 166
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const-string v1, "JSON-RPC response batches cannot contain requests or notifications"

    .line 45
    :goto_8
    invoke-static {v0, v5, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto/16 :goto_b

    .line 169
    :cond_18
    sget-object v0, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    .line 38
    :goto_9
    invoke-static {v0, v5, v11}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto/16 :goto_b

    .line 172
    :cond_19
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 173
    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1a
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbin/mt/json/JSONValue;

    .line 174
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v7

    if-nez v7, :cond_1b

    .line 175
    sget-object v6, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v7, -0x7f58

    invoke-static {v6, v7, v2}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_a

    .line 179
    :cond_1b
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 181
    invoke-static {v6}, Ll/ۨۤ᩻;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    const-string v7, "jsonrpc"

    .line 230
    invoke-virtual {v6, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    .line 231
    invoke-virtual {v6, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-nez v8, :cond_1c

    if-eqz v7, :cond_1c

    .line 233
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v8

    if-eqz v8, :cond_1c

    const-string v8, "2.0"

    .line 234
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1c

    .line 235
    invoke-static {v6}, Ll/ۨۤ᩻;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1c

    goto :goto_a

    .line 183
    :cond_1c
    invoke-virtual {v6, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    const-string v7, "Initialize requests must not be batched"

    const/16 v8, -0x7f58

    invoke-static {v6, v8, v7}, Ll/ۧۛ᩻;->֫(Lbin/mt/json/JSONValue;ILjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_a

    .line 189
    :cond_1d
    invoke-virtual {v13, v6}, Ll/ܰۤ᩻;->֫(Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩺ۤ᩻;->֫()Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_1a

    .line 191
    invoke-virtual {v0, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_a

    .line 194
    :cond_1e
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    if-nez v1, :cond_1f

    .line 195
    sget-object v0, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    goto/16 :goto_9

    .line 197
    :cond_1f
    sget-object v1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    .line 31
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v4, v0}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    :goto_b
    return-object v0

    .line 116
    :cond_20
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v4

    if-nez v4, :cond_21

    .line 117
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v3, -0x7f58

    invoke-static {v0, v1, v3, v2}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    .line 120
    :cond_21
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 121
    invoke-static {v2}, Ll/ۨۤ᩻;->֫(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 122
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    .line 378
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ᩳ()Ljava/util/Map;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_22

    goto :goto_c

    :cond_22
    move-object v12, v3

    .line 371
    :goto_c
    invoke-virtual {v0, v12}, Ll/ۤۤ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_23

    .line 123
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const/16 v2, -0x7f58

    invoke-static {v0, v1, v2, v15}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    .line 204
    :cond_23
    invoke-virtual {v2, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_25

    .line 205
    invoke-virtual {v2, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_24

    invoke-virtual {v2, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_25

    :cond_24
    const/4 v0, 0x1

    goto :goto_d

    :cond_25
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_27

    .line 126
    invoke-static {v2}, Ll/ۨۤ᩻;->ۧ(Lbin/mt/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 127
    sget-object v0, Ll/֨ܳܳ;->ۙ:Ll/֨ܳܳ;

    .line 38
    invoke-static {v0, v5, v11}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    goto :goto_e

    .line 128
    :cond_26
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const-string v1, "Invalid JSON-RPC response"

    .line 45
    invoke-static {v0, v5, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    :goto_e
    return-object v0

    .line 30
    :cond_27
    invoke-virtual {v13, v2}, Ll/ܰۤ᩻;->֫(Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۤ᩻;->ۧ()Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    .line 111
    :catch_1
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v2, -0x7fbc

    const-string v3, "Parse error"

    invoke-static {v0, v1, v2, v3}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    :catch_2
    move-exception v0

    move-object v1, v0

    .line 93
    nop

    instance-of v0, v1, Ll/ܶܳܳ;

    if-eqz v0, :cond_28

    move-object v0, v1

    check-cast v0, Ll/ܶܳܳ;

    .line 94
    invoke-virtual {v0}, Ll/ܶܳܳ;->֫()Ll/֨ܳܳ;

    move-result-object v0

    sget-object v1, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    if-ne v0, v1, :cond_28

    const-string v0, "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON."

    .line 45
    invoke-static {v1, v5, v0}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ll/۠ܳܳ;->֫()V

    return-object v0

    .line 102
    :cond_28
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v3, -0x7f58

    invoke-static {v0, v1, v3, v2}, Ll/ۧۛ᩻;->֫(Ll/֨ܳܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ll/۠ܳܳ;->֫()V

    return-object v0
.end method
