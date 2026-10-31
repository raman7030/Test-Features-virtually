.class public final Ll/ۜۡۜ;
.super Ljava/lang/Object;
.source "D6WW"


# instance fields
.field public final ֫:Ll/᩶۫᩷;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 1

    .line 29
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    .line 36
    iput-object v0, p0, Ll/ۜۡۜ;->֫:Ll/᩶۫᩷;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    const-string v0, "check_parent_links"

    .line 147
    invoke-virtual {p2, p3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "backendReason"

    .line 148
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "changed"

    const/4 p4, 0x0

    .line 149
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "stateKnown"

    const/4 p4, 0x1

    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "warnings"

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "fatal"

    const/4 p4, 0x0

    .line 144
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    .line 354
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "backendReason"

    .line 355
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "changed"

    .line 356
    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p7, :cond_0

    .line 358
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_0
    const-string p5, "operationMode"

    .line 357
    invoke-virtual {p2, p5, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "stateKnown"

    const/4 p5, 0x1

    .line 359
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    new-instance p3, Lbin/mt/json/JSONArray;

    invoke-direct {p3, p8}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p6, "warnings"

    .line 360
    invoke-virtual {p2, p6, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "createdDirectories"

    .line 361
    invoke-virtual {p2, p3, p9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p10, :cond_1

    .line 363
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static {p10}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_1
    const-string p6, "deepestCreatedPath"

    .line 362
    invoke-virtual {p2, p6, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p11, :cond_2

    .line 364
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_2
    invoke-static {p11}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_2
    const-string p6, "failedPath"

    invoke-virtual {p2, p6, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "failureStage"

    .line 365
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "safeToRetry"

    .line 366
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_STORAGE_ERROR"

    .line 367
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_3

    const-string p3, "warning"

    .line 368
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_3
    const-string p3, "fatal"

    .line 371
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;
    .locals 3

    .line 255
    sget-object v0, Ll/ܿۡۜ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 262
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_NOT_DIRECTORY"

    const-string v1, "An existing mkdir -p path component is not a directory."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1

    .line 259
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "A special node cannot be used as a mkdir -p directory component."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1

    .line 256
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "A symbolic link cannot be used as a mkdir -p directory component."

    invoke-static {v0, v1, p1, p2}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;
    .locals 7

    move-object v0, p0

    .line 322
    new-instance v1, Lbin/mt/json/JSONObject;

    iget-object v2, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v3, v0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v4, v0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object v5, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-direct {v1, v2}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v2, "path"

    move-object v6, p1

    .line 323
    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v2, "policyRevision"

    move-object v6, p2

    .line 324
    invoke-virtual {v1, v2, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v2, "changed"

    move v6, p4

    .line 325
    invoke-virtual {v1, v2, p4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v2, "operationMode"

    .line 327
    invoke-static {p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    .line 326
    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v2, "stateKnown"

    move v6, p5

    .line 328
    invoke-virtual {v1, v2, p5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 329
    new-instance v2, Lbin/mt/json/JSONArray;

    move-object v6, p6

    invoke-direct {v2, p6}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v6, "warnings"

    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v2, "createdDirectories"

    move v6, p7

    .line 330
    invoke-virtual {v1, v2, p7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    if-nez p8, :cond_0

    .line 332
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_0
    const-string v6, "deepestCreatedPath"

    .line 331
    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    if-nez p9, :cond_1

    .line 333
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static/range {p9 .. p9}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_1
    const-string v6, "failedPath"

    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    if-nez p10, :cond_2

    .line 335
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_2
    invoke-static/range {p10 .. p10}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_2
    const-string v6, "failureStage"

    .line 334
    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v2, "safeToRetry"

    move/from16 v6, p11

    .line 336
    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 337
    iget-boolean v2, v0, Ll/ۗۛ᩻;->۫:Z

    if-eqz v2, :cond_3

    .line 338
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v4, v3, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0

    .line 341
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v4, v3, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;
    .locals 14

    .line 277
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/۬᩵ܿ;->᩹:Ll/۬᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v0

    .line 279
    sget-object v1, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v0, v1, :cond_0

    return-object v0

    .line 282
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    .line 283
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v13

    const-string v2, "FILE_BACKEND_UNSUPPORTED"

    const-string v3, "The file backend does not support checked directory creation."

    const-string v6, "create_directory"

    const-string v7, "unsupported"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v5, p1

    .line 280
    invoke-static/range {v2 .. v13}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 1

    .line 238
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 240
    iget-object v0, p0, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ljava/lang/String;Ll/۟ۢۜ;)Ll/ܳۡۜ;
    .locals 14

    move-object v1, p0

    move-object v13, p1

    move-object/from16 v0, p2

    .line 72
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 74
    iget-object v3, v1, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v3, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    move-object v5, v13

    .line 77
    :goto_0
    invoke-virtual {v0, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v6, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 78
    invoke-virtual {v3, v5}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 79
    invoke-direct {p0, v7}, Ll/ۜۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v8

    .line 80
    invoke-virtual {v8}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v9

    sget-object v10, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v9, v10, :cond_6

    .line 97
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    .line 98
    invoke-virtual {v0, v5}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    :cond_0
    const-string v7, "FILE_LINK_CHECK_FAILED"

    .line 108
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 0
    instance-of v0, v4, Ll/۬ܶܿ;

    if-nez v0, :cond_1

    instance-of v0, v4, Ll/۬۠ܿ;

    if-nez v0, :cond_1

    goto :goto_3

    .line 112
    :cond_1
    invoke-static {v5}, Ll/ۜۡۜ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_5

    .line 114
    invoke-virtual {v3, v0}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 117
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v4
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v8, Ll/ۗ᩵ܿ;->᩶:Ll/ۗ᩵ܿ;

    if-eq v5, v8, :cond_4

    .line 129
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v8, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-eq v5, v8, :cond_3

    .line 130
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v0, v2, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "FILE_NOT_DIRECTORY"

    .line 133
    :goto_2
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "The existing parent chain could not be verified safely."

    .line 130
    invoke-static {v7, v2, p1, v6, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 136
    :cond_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, "A symbolic-link parent cannot be traversed by a modifying file tool."

    const-string v2, "parent_is_link"

    const-string v3, "FILE_IS_SYMLINK"

    .line 125
    invoke-static {v3, v0, p1, v6, v2}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_0
    move-exception v0

    .line 121
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "A parent link status could not be verified safely."

    .line 119
    invoke-static {v7, v2, p1, v6, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 101
    :cond_5
    :goto_3
    new-instance v0, Ll/ܳۡۜ;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v3}, Ll/ܳۡۜ;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    .line 83
    :cond_6
    invoke-virtual {v8}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v9

    sget-object v10, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v9, v10, :cond_8

    .line 86
    invoke-static {v7, v6}, Ll/ۜۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 87
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 88
    invoke-static {v5}, Ll/ۜۡۜ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_7

    goto/16 :goto_0

    .line 90
    :cond_7
    iget-object v5, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 93
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v2, "FILE_PARENT_NOT_FOUND"

    const-string v3, "No existing writable parent directory was found."

    const-string v6, "preflight"

    const-string v7, "parent_missing"

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p1

    move-object v13, p1

    .line 90
    invoke-static/range {v2 .. v13}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 84
    :cond_8
    invoke-virtual {v8}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 3

    .line 408
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 409
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 413
    :cond_1
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 400
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v1, 0x2f

    .line 403
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 404
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/᩻ۡۜ;
    .locals 4

    .line 43
    iget-object v0, p0, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "path"

    const/4 v3, 0x0

    .line 44
    invoke-static {v1, p1, v2, v3}, Ll/۫ۡۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-virtual {v1, p1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v0

    .line 47
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۜۡۜ;->ۧ(Ljava/lang/String;)Ll/᩻ۡۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/᩻ۡۜ;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    .line 54
    :goto_0
    iget-object v2, v1, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v0

    .line 55
    invoke-direct {v1, v14, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;)Ll/ܳۡۜ;

    move-result-object v3

    .line 56
    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v15

    .line 57
    iget-object v0, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v4, v15, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, v3, Ll/ܳۡۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 157
    new-instance v0, Ll/᩻ۡۜ;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-direct {v0, v14, v4, v2, v4}, Ll/᩻ۡۜ;-><init>(Ljava/lang/String;ZLbin/mt/json/JSONArray;I)V

    return-object v0

    .line 290
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x1

    if-le v3, v5, :cond_2

    const-string v3, "non_atomic"

    :goto_1
    move-object/from16 v16, v3

    goto :goto_2

    .line 293
    :cond_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 294
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/۬᩵ܿ;->᩹:Ll/۬᩵ܿ;

    invoke-virtual {v3, v4}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v3

    .line 295
    sget-object v4, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v3, v4, :cond_3

    const-string v3, "atomic"

    goto :goto_1

    :cond_3
    const-string v3, "best_effort"

    goto :goto_1

    .line 161
    :goto_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v13

    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v12, v0

    move-object v0, v14

    const/4 v11, 0x0

    const/16 v17, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v10, "Directory change notification could not be completed."

    iget-object v9, v1, Ll/ۜۡۜ;->֫:Ll/᩶۫᩷;

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    .line 167
    invoke-virtual {v2, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 169
    :try_start_0
    invoke-direct {v1, v4}, Ll/ۜۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    .line 170
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    sget-object v7, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v6, v7, :cond_4

    move-object v14, v13

    goto/16 :goto_7

    .line 174
    :cond_4
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v6, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v0, v6, :cond_d

    .line 177
    invoke-static {v8}, Ll/ۜۡۜ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_a

    if-nez v0, :cond_6

    :try_start_1
    const-string v2, "FILE_PARENT_NOT_FOUND"

    const-string v3, "The directory has no writable parent."

    .line 179
    iget-object v5, v15, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, "create_directory"
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    const-string v7, "parent_missing"
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0

    if-lez v11, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    move-object/from16 v4, p1

    move-object/from16 v18, v8

    move v8, v0

    move-object/from16 v19, v9

    move-object/from16 v9, v16

    move-object v14, v10

    move-object v10, v13

    move/from16 v20, v11

    move-object/from16 v21, v12

    move-object/from16 v22, v14

    move-object v14, v13

    move-object/from16 v13, v18

    :try_start_3
    invoke-static/range {v2 .. v13}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :goto_5
    move/from16 v23, v20

    move-object/from16 v24, v18

    move-object/from16 v18, v15

    move-object/from16 v15, v24

    goto/16 :goto_f

    :catch_0
    move-exception v0

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v22, v10

    move/from16 v20, v11

    move-object/from16 v21, v12

    move-object v14, v13

    goto :goto_5

    :catch_1
    move-exception v0

    move-object/from16 v19, v9

    move-object/from16 v22, v10

    move-object/from16 v21, v12

    move-object v14, v13

    move/from16 v23, v11

    goto/16 :goto_e

    :cond_6
    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v22, v10

    move/from16 v20, v11

    move-object/from16 v21, v12

    move-object v14, v13

    .line 185
    invoke-virtual {v2, v0}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-direct {v1, v5}, Ll/ۜۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    .line 269
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    if-ne v6, v7, :cond_c

    .line 186
    iget-object v0, v15, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v4, v0}, Ll/ۜۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    move-result-object v5
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_8

    .line 190
    :try_start_4
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩵ܿ;->ۧ()V
    :try_end_4
    .catch Ll/᩹᩵ܿ; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_2

    move/from16 v13, v20

    add-int/lit8 v11, v13, 0x1

    const/16 v17, 0x1

    move-object/from16 v0, p1

    move-object v13, v14

    move-object/from16 v12, v18

    move-object v14, v0

    goto/16 :goto_3

    :catch_2
    move-exception v0

    move/from16 v23, v20

    move-object/from16 v24, v18

    move-object/from16 v18, v15

    move-object/from16 v15, v24

    goto/16 :goto_c

    :catch_3
    move-exception v0

    move/from16 v13, v20

    move-object/from16 v12, v18

    .line 247
    :try_start_5
    invoke-virtual {v2, v12}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v4
    :try_end_5
    .catch Ll/᩹᩵ܿ; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_6

    :catch_4
    move-exception v0

    move/from16 v23, v13

    move-object/from16 v18, v15

    move-object v15, v12

    goto/16 :goto_c

    :catch_5
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_7

    .line 196
    :try_start_6
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v6

    sget-object v7, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_4

    if-ne v6, v7, :cond_7

    add-int/lit8 v11, v13, 0x1

    :try_start_7
    const-string v0, "The backend reported an error after the directory appeared."

    .line 199
    invoke-static {v14, v0}, Ll/ۜۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_6

    const/4 v0, 0x1

    move-object/from16 v0, p1

    const/16 v17, 0x1

    :goto_7
    move-object v13, v14

    move-object/from16 v14, p1

    goto/16 :goto_3

    :catch_6
    move-exception v0

    move-object/from16 v18, v15

    move-object v15, v12

    goto :goto_d

    :cond_7
    if-nez v4, :cond_9

    .line 203
    :try_start_8
    sget-object v2, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v5, v2, :cond_8

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    const/16 v17, 0x0

    goto :goto_9

    :cond_9
    :goto_8
    const/4 v2, 0x1

    const/16 v17, 0x1

    :goto_9
    if-gtz v13, :cond_b

    if-nez v17, :cond_a

    .line 205
    sget-object v2, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-eq v5, v2, :cond_a

    goto :goto_a

    :cond_a
    const/4 v2, 0x0

    const/4 v6, 0x0

    goto :goto_b

    :cond_b
    :goto_a
    const/4 v2, 0x1

    const/4 v6, 0x1

    .line 301
    :goto_b
    invoke-static {v0}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v2

    .line 207
    iget-object v4, v15, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v0, "create_directory"
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_4

    move-object/from16 v3, p1

    move-object/from16 v5, v16

    move/from16 v7, v17

    move-object v8, v14

    move v9, v13

    move-object/from16 v10, v21

    move-object v11, v12

    move-object/from16 v18, v15

    move-object v15, v12

    move-object v12, v0

    move/from16 v23, v13

    move/from16 v13, v17

    :try_start_9
    invoke-static/range {v2 .. v13}, Ll/ۜۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_7

    :catch_7
    move-exception v0

    :goto_c
    move-object/from16 v12, v21

    move/from16 v11, v23

    :goto_d
    const/16 v17, 0x1

    move-object v2, v0

    move v9, v11

    move-object v10, v12

    goto :goto_10

    :cond_c
    move/from16 v23, v20

    move-object/from16 v24, v18

    move-object/from16 v18, v15

    move-object/from16 v15, v24

    .line 270
    :try_start_a
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_8
    move-exception v0

    goto/16 :goto_5

    :cond_d
    move-object/from16 v19, v9

    move-object/from16 v22, v10

    move/from16 v23, v11

    move-object/from16 v21, v12

    move-object v14, v13

    move-object/from16 v18, v15

    move-object v15, v8

    .line 175
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    invoke-direct {v1, v15, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_a
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_9

    :catch_9
    move-exception v0

    goto :goto_f

    :catch_a
    move-exception v0

    move-object/from16 v19, v9

    move-object/from16 v22, v10

    move/from16 v23, v11

    move-object/from16 v21, v12

    move-object v14, v13

    :goto_e
    move-object/from16 v18, v15

    move-object v15, v8

    :goto_f
    move-object v2, v0

    move-object/from16 v10, v21

    move/from16 v9, v23

    .line 217
    :goto_10
    iget-object v0, v2, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    if-gtz v9, :cond_10

    const-string v3, "changed"

    .line 376
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 377
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3

    goto :goto_11

    :cond_e
    move/from16 v3, v17

    :goto_11
    if-eqz v3, :cond_f

    goto :goto_12

    :cond_f
    const/4 v3, 0x0

    const/4 v6, 0x0

    goto :goto_13

    :cond_10
    :goto_12
    const/4 v3, 0x1

    const/4 v6, 0x1

    :goto_13
    xor-int/lit8 v3, v17, 0x1

    const-string v4, "stateKnown"

    .line 381
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    if-eqz v4, :cond_11

    .line 382
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3

    :cond_11
    move v7, v3

    if-nez v10, :cond_12

    move-object v8, v15

    goto :goto_14

    :cond_12
    move-object v8, v10

    :goto_14
    if-eqz v6, :cond_13

    .line 310
    :try_start_b
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    const/4 v3, 0x0

    .line 20
    invoke-static {v8, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 21
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_b
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_15

    :catch_b
    move-object/from16 v3, v22

    .line 312
    invoke-static {v14, v3}, Ll/ۜۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    :cond_13
    :goto_15
    move-object/from16 v3, v18

    .line 223
    iget-object v4, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v3, "failureStage"

    .line 386
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_14

    .line 387
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_14

    .line 388
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    goto :goto_16

    :cond_14
    const-string v3, "operation"

    .line 390
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_15

    .line 391
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    goto :goto_16

    :cond_15
    const-string v3, "create_directory"

    :goto_16
    move-object v12, v3

    const-string v3, "safeToRetry"

    .line 395
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 396
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v0

    move v13, v0

    goto :goto_17

    :cond_16
    move v13, v7

    :goto_17
    move-object/from16 v3, p1

    move-object/from16 v5, v16

    move-object v8, v14

    move-object v11, v15

    .line 223
    invoke-static/range {v2 .. v13}, Ll/ۜۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_17
    move-object/from16 v19, v9

    move-object v3, v10

    move-object/from16 v21, v12

    move-object v14, v13

    if-lez v11, :cond_18

    const/4 v2, 0x1

    goto :goto_18

    :cond_18
    const/4 v2, 0x0

    :goto_18
    if-eqz v2, :cond_1a

    move-object/from16 v12, v21

    if-nez v12, :cond_19

    goto :goto_19

    .line 310
    :cond_19
    :try_start_c
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    const/4 v2, 0x0

    .line 20
    invoke-static {v12, v2}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 21
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_19

    .line 312
    :catch_c
    invoke-static {v14, v3}, Ll/ۜۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    .line 231
    :cond_1a
    :goto_19
    new-instance v2, Ll/᩻ۡۜ;

    if-lez v11, :cond_1b

    const/4 v3, 0x1

    goto :goto_1a

    :cond_1b
    const/4 v3, 0x0

    :goto_1a
    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v14}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    invoke-direct {v2, v0, v3, v4, v11}, Ll/᩻ۡۜ;-><init>(Ljava/lang/String;ZLbin/mt/json/JSONArray;I)V

    return-object v2
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۜۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/ۜۡۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;)Ll/ܳۡۜ;

    return-void
.end method
