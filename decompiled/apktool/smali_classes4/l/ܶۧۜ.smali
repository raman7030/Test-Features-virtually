.class public final Ll/ܶۧۜ;
.super Ll/ۙۛ᩻;
.source "M75X"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 40
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ܶۧۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 56
    iput-object v0, p0, Ll/ܶۧۜ;->֫:Ll/᩹ۧۜ;

    .line 57
    iput-object v1, p0, Ll/ܶۧۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static ֫(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)I
    .locals 1

    .line 369
    :try_start_0
    iget-object p0, p0, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz p0, :cond_0

    return p0

    .line 371
    :cond_0
    invoke-static {p2}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 375
    :catch_0
    invoke-static {p2}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J
    .locals 4

    const-wide/16 v0, -0x1

    .line 356
    :try_start_0
    invoke-virtual {p0, p2, v0, v1}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-ltz p0, :cond_0

    return-wide v0

    .line 358
    :cond_0
    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    :catch_0
    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static synthetic ֫(Ll/ܶۧۜ;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 10

    .line 232
    iget-object v0, p1, Ll/᩹۟᩻;->᩷:Ljava/lang/String;

    invoke-virtual {p5, p4, v0}, Ll/ܺ۟᩻;->ۧ(Ll/ܳ᩻ۜ;Ljava/lang/String;)I

    move-result v6

    if-eqz p2, :cond_0

    .line 236
    invoke-virtual {p3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    invoke-static {v1, v6, v2, v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ۖۨ᩻;

    .line 239
    :cond_0
    iget-object v7, p0, Ll/ܶۧۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v8, p1, Ll/᩹۟᩻;->ۢ:Ljava/lang/String;

    new-instance v9, Ll/۠ۧۜ;

    move-object v1, v9

    move-object v2, p0

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Ll/۠ۧۜ;-><init>(Ll/ܶۧۜ;ZLl/᩹۟᩻;Lbin/mt/json/JSONValue;I)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p4, p5, v0, v8, v9}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public static ֫(Ll/ܶۧۜ;ZLl/᩹۟᩻;Lbin/mt/json/JSONValue;ILl/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 14

    move v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    .line 241
    iget-object v4, v1, Ll/᩹۟᩻;->᩷:Ljava/lang/String;

    iget-wide v5, v2, Ll/۟۟᩻;->᩸:J

    iget-wide v7, v2, Ll/۟۟᩻;->᩹:J

    if-eqz v0, :cond_2

    .line 293
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 296
    :cond_0
    iget-wide v9, v1, Ll/᩹۟᩻;->ۜ:J

    cmp-long v3, v9, v7

    if-nez v3, :cond_1

    iget-wide v9, v1, Ll/᩹۟᩻;->᩻:J

    cmp-long v3, v9, v5

    if-nez v3, :cond_1

    goto :goto_0

    .line 297
    :cond_1
    invoke-static/range {p3 .. p3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_2
    :goto_0
    move-object v3, p0

    .line 244
    iget-object v3, v3, Ll/ܶۧۜ;->֫:Ll/᩹ۧۜ;

    move-object/from16 v9, p3

    invoke-static {v3, v2, v1, p1, v9}, Ll/ۚۧۜ;->֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)Ll/᩵ۧۜ;

    move-result-object v0

    iget-object v9, v0, Ll/᩵ۧۜ;->ܳ:Ll/ۘܺۢ;

    iget-object v10, v0, Ll/᩵ۧۜ;->᩻:Ll/ܺۖۢ;

    .line 263
    iget-boolean v2, v10, Ll/ܺۖۢ;->ۜ:Z

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    :goto_1
    move-object v11, v2

    goto/16 :goto_4

    .line 266
    :cond_3
    iget-object v3, v1, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    .line 267
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "locator"

    iget-object v12, v1, Ll/᩹۟᩻;->ۖ:Ljava/lang/String;

    .line 268
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "addressKind"

    iget-object v12, v1, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    .line 269
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "address"

    iget-wide v12, v1, Ll/᩹۟᩻;->֫:J

    .line 270
    invoke-virtual {v2, v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "instructionMode"

    iget-object v12, v1, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    .line 271
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "scanKind"

    iget-object v12, v1, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    .line 272
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "referenceKindMask"

    iget v12, v1, Ll/᩹۟᩻;->֡:I

    .line 273
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "resolvedInstructionMode"

    iget-object v12, v0, Ll/᩵ۧۜ;->ۜ:Ljava/lang/String;

    .line 274
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "targetVirtualAddress"

    iget-wide v12, v9, Ll/ۘܺۢ;->ܺ:J

    .line 275
    invoke-virtual {v2, v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "arch"

    iget-object v12, v0, Ll/᩵ۧۜ;->֫:Ljava/lang/String;

    .line 276
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "bits"

    iget v12, v0, Ll/᩵ۧۜ;->ܽ:I

    .line 277
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v11, "maxScanBytes"

    iget v12, v1, Ll/᩹۟᩻;->ۘ:I

    .line 278
    invoke-virtual {v2, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 279
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    const-wide/16 v12, 0x0

    if-eqz v11, :cond_4

    goto :goto_2

    :cond_4
    move-wide v7, v12

    :goto_2
    const-string v11, "entrySize"

    invoke-virtual {v2, v11, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 280
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    move-wide v5, v12

    :goto_3
    const-string v7, "entryCrc"

    invoke-virtual {v2, v7, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "recommendedLimit"

    iget v6, v1, Ll/᩹۟᩻;->ܺ:I

    .line 281
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "limitMax"

    const/16 v6, 0xc8

    .line 282
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 283
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "phaseIndex"

    iget v7, v10, Ll/ܺۖۢ;->ᩳ:I

    .line 284
    invoke-virtual {v2, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "rangeIndex"

    iget v7, v10, Ll/ܺۖۢ;->ܿ:I

    .line 285
    invoke-virtual {v2, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "byteOffsetInRange"

    iget-wide v7, v10, Ll/ܺۖۢ;->ܽ:J

    .line 286
    invoke-virtual {v2, v5, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "relocationIndex"

    iget v7, v10, Ll/ܺۖۢ;->ܳ:I

    .line 287
    invoke-virtual {v2, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v2, "native_xref"

    move/from16 v5, p4

    .line 266
    invoke-static/range {v2 .. v7}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    .line 248
    :goto_4
    iget-object v2, v0, Ll/᩵ۧۜ;->ۜ:Ljava/lang/String;

    iget-boolean v3, v0, Ll/᩵ۧۜ;->᩷:Z

    iget-object v4, v0, Ll/᩵ۧۜ;->֫:Ljava/lang/String;

    iget v5, v0, Ll/᩵ۧۜ;->ۧ:I

    iget-object v6, v0, Ll/᩵ۧۜ;->ᩳ:Ljava/lang/String;

    iget-object v7, v0, Ll/᩵ۧۜ;->ܿ:Ljava/lang/String;

    move-object/from16 v0, p2

    move-object v1, v2

    move v2, v3

    move-object v3, v9

    move-object v8, v10

    move-object v9, v11

    invoke-static/range {v0 .. v9}, Ll/۫֫ۜ;->֫(Ll/᩹۟᩻;Ljava/lang/String;ZLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ܺۖۢ;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 4

    .line 412
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 413
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "<cursor>"

    const-string v3, "nextCursor"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid cursor"

    .line 411
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;
    .locals 5

    .line 225
    iget v0, p1, Ll/᩹۟᩻;->ᩴ:I

    if-ltz v0, :cond_1

    iget v0, p1, Ll/᩹۟᩻;->᩵:I

    if-ltz v0, :cond_1

    iget-wide v0, p1, Ll/᩹۟᩻;->ܳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    iget v0, p1, Ll/᩹۟᩻;->֨:I

    if-gez v0, :cond_0

    goto :goto_1

    .line 229
    :cond_0
    iget-object v0, p0, Ll/ܶۧۜ;->ܿ:Ll/᩵᩻ۜ;

    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v1

    .line 230
    :try_start_0
    iget-object v2, p1, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    new-instance v3, Ll/֨ۧۜ;

    invoke-direct {v3, p0, p1, p2, p3}, Ll/֨ۧۜ;-><init>(Ll/ܶۧۜ;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)V

    invoke-virtual {v0, v2, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/json/JSONObject;

    .line 255
    new-instance p2, Ll/۬ۛ᩻;

    invoke-direct {p2, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object p2

    :catchall_0
    move-exception p1

    .line 229
    :try_start_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_1
    :goto_1
    if-eqz p2, :cond_2

    .line 227
    invoke-static {p3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p1

    :goto_2
    throw p1
.end method

.method public static ֫(Ll/᩹۟᩻;Lbin/mt/json/JSONValue;)V
    .locals 7

    .line 303
    iget-object v0, p0, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    const-string v2, "virtual"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "file_offset"

    .line 304
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 305
    :cond_0
    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 307
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    const-string v2, "auto"

    .line 328
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "thumb"

    const-string v5, "arm"

    if-nez v3, :cond_2

    .line 329
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 330
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 307
    :cond_2
    iget-object v0, p0, Ll/᩹۟᩻;->۠:Ljava/lang/String;

    .line 328
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 329
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 330
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 308
    :cond_3
    iget-wide v2, p0, Ll/᩹۟᩻;->᩸:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_5

    iget v0, p0, Ll/᩹۟᩻;->ܿ:I

    if-lez v0, :cond_5

    iget-object v0, p0, Ll/᩹۟᩻;->ᩳ:Ljava/lang/String;

    .line 310
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "code"

    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "data"

    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "both"

    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 311
    :cond_4
    iget v0, p0, Ll/᩹۟᩻;->֡:I

    if-eqz v0, :cond_5

    iget v2, p0, Ll/᩹۟᩻;->ۘ:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_5

    const/high16 v3, 0x400000

    if-gt v2, v3, :cond_5

    iget v2, p0, Ll/᩹۟᩻;->ᩴ:I

    if-ltz v2, :cond_5

    iget v2, p0, Ll/᩹۟᩻;->᩵:I

    if-ltz v2, :cond_5

    iget-wide v2, p0, Ll/᩹۟᩻;->ܳ:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_5

    iget p0, p0, Ll/᩹۟᩻;->֨:I

    if-ltz p0, :cond_5

    .line 320
    :try_start_0
    invoke-static {v0, v1}, Ll/ۘۢܽ;->֫(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 323
    :catch_0
    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 317
    :cond_5
    invoke-static {p1}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)I
    .locals 5

    .line 391
    iget p0, p0, Ll/ۖۨ᩻;->֫:I

    const-string v0, "limit"

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "1.."

    const-string v3, "Invalid limit"

    if-eqz p1, :cond_1

    .line 392
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 398
    :try_start_0
    invoke-static {p1}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x1

    if-lt p1, v4, :cond_0

    if-gt p1, p0, :cond_0

    return p1

    .line 404
    :cond_0
    invoke-static {p1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 405
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 404
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 400
    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 401
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 400
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 393
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 394
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 393
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;
    .locals 0

    .line 341
    iget-object p0, p0, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 342
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 345
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 343
    :cond_0
    invoke-static {p2}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 77
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 510
    invoke-static {p1}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    invoke-static {p1}, Ll/ۜ֫ۜ;->ܽ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto :goto_0

    .line 512
    :cond_0
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_0
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 509
    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 3

    .line 154
    iget-object v0, p0, Ll/ܶۧۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 160
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->ۜ(Lbin/mt/json/JSONObject;)Ll/᩹۟᩻;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "nextCursor"

    .line 161
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p1}, Ll/ܶۧۜ;->֫(Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    iget-object v1, v1, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 166
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    .line 164
    iget-object v1, v1, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 166
    :cond_0
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 167
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 175
    iget-object v3, v1, Ll/ܶۧۜ;->ܿ:Ll/᩵᩻ۜ;

    const-string v4, "address"

    const-string v5, "nextCursor"

    const-string v6, "workspaceId"

    const-string v7, ""

    .line 179
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "editSessionId"

    .line 180
    invoke-virtual {v2, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 182
    :try_start_0
    invoke-static/range {p1 .. p2}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)I

    move-result v21

    iget-object v7, v0, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    iget-object v8, v0, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    const-string v9, "locator"

    .line 183
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-static {v0, v9, v11}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v11

    const-string v9, "zip_entry:"

    .line 184
    invoke-virtual {v11, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v12, 0xa

    if-eq v9, v12, :cond_1

    .line 189
    :try_start_1
    new-instance v14, Ll/᩹۟᩻;

    .line 190
    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    const-string v9, "addressKind"

    .line 191
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v13

    invoke-static {v0, v9, v13}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v13

    .line 192
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    .line 350
    invoke-static {v8, v9, v4}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v15

    .line 193
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    .line 350
    invoke-static {v8, v9, v4}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v17

    .line 193
    invoke-static/range {v17 .. v18}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v4

    const-string v9, "instructionMode"
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v36, v3

    .line 194
    :try_start_2
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v0, v9, v3}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v17

    const-string v3, "scanKind"

    .line 195
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-static {v0, v3, v9}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v18

    .line 196
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v9, "referenceKindMask"

    .line 382
    invoke-static {v0, v9, v3}, Ll/ܶۧۜ;->֫(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)I

    move-result v9

    invoke-static {v9}, Ll/ۖۖۢ;->֫(I)Ljava/util/List;

    move-result-object v19
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v3, "maxScanBytes"

    .line 197
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-static {v0, v3, v9}, Ll/ܶۧۜ;->֫(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)I

    move-result v20

    const-string v3, "phaseIndex"

    const/4 v9, -0x1

    .line 199
    invoke-virtual {v7, v3, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v22

    const-string v3, "rangeIndex"

    .line 200
    invoke-virtual {v7, v3, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v23

    const-string v3, "byteOffsetInRange"

    .line 201
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-static {v7, v9, v3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v24

    const-string v3, "relocationIndex"

    const/4 v9, -0x1

    .line 202
    invoke-virtual {v7, v3, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v26

    const-string v3, "entrySize"

    .line 203
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    .line 350
    invoke-static {v8, v7, v3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v27

    const-string v3, "entryCrc"

    .line 204
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    .line 350
    invoke-static {v8, v7, v3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v29

    const-string v3, "targetVirtualAddress"

    .line 205
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    .line 350
    invoke-static {v8, v7, v3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;Ljava/lang/String;)J

    move-result-wide v31

    const-string v3, "resolvedInstructionMode"

    .line 206
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v0, v3, v7}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v33

    const-string v3, "bits"

    .line 207
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v0, v3, v7}, Ll/ܶۧۜ;->֫(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)I

    move-result v34

    const-string v3, "arch"

    .line 208
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v0, v3, v7}, Ll/ܶۧۜ;->ۧ(Ll/ۖۨ᩻;Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v35

    move-object v8, v14

    move-object v9, v6

    move-object v0, v14

    move-wide v14, v15

    move-object/from16 v16, v4

    invoke-direct/range {v8 .. v35}, Ll/᩹۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIIJIJJJLjava/lang/String;ILjava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    :try_start_5
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ܶۧۜ;->֫(Ll/᩹۟᩻;Lbin/mt/json/JSONValue;)V

    .line 213
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v0, v3, v2}, Ll/ܶۧۜ;->֫(Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 215
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    move-object/from16 v4, v36

    .line 216
    invoke-virtual {v4, v6}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 218
    :cond_0
    sget v2, Ll/ۡۨ᩻;->֫:I

    return-object v0

    :catch_0
    move-object/from16 v4, v36

    .line 385
    :try_start_6
    invoke-static {v3}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_0
    move-exception v0

    move-object/from16 v4, v36

    goto :goto_1

    :catch_1
    move-object/from16 v4, v36

    goto :goto_0

    :catch_2
    move-object v4, v3

    .line 210
    :catch_3
    :goto_0
    :try_start_7
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    move-object v4, v3

    .line 185
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v4, v3

    .line 215
    :goto_1
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 216
    invoke-virtual {v4, v6}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 218
    :cond_2
    sget v2, Ll/ۡۨ᩻;->֫:I

    .line 219
    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find best-effort direct static references to an ELF address; this is not a complete caller graph or data-flow proof. file_offset is inside the SO entry, not the APK. For functions start with scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]; for strings, vtables, JNI tables, or function pointers use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto. Recommended maxScanBytes=1048576 and limit=50. ARM32 code/both scans require an explicit arm or thumb source mode; follow retry actions if needed. Executable ARM32 targets also match Thumb function pointers. Read scanSummary.meaning, completionReason, and warning before interpreting refs, especially empty results. targetMapped=false means no usable loaded file-backed target mapping; loaded data targets can still have references. Continue with mt_apk_continue when pagination.hasMore=true, including empty pages; totalAvailableCount=null means unknown. To change the target or scan settings, start a new call. For instruction refs, inspect sourceSymbol.startVirtualAddress with mt_apk_native_analyze_control_flow when available, otherwise sourceVirtualAddress, and copy resolvedInstructionMode; choose outputMode=summary for triage or full for details. For data refs, sourceSymbol identifies the slot owner, not a caller. Use mt_apk_native_disassemble for exact instruction bytes."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find Native Xrefs"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܶۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to scan the edited session view; pass an empty string to scan the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the SO zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned target address string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. ARM32 odd virtual targets are mapped exactly first; bit0 is cleared only for an executable mapping, while loaded non-executable odd targets stay exact.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. scanKind=data requires auto and ignores instruction decoding; non-ARM code/both requires auto; ARM32 code/both requires explicit thumb or arm. Odd ARM32 target virtual addresses do not choose the source scan mode.\"\n  },\n  \"scanKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"code\", \"data\", \"both\"],\n    \"description\": \"Scan domain. Use code for instruction references, data for relocation slots and aligned data pointers, or both for code first then data. For data use referenceKinds=[\\\"data\\\"]; for both include data in referenceKinds.\"\n  },\n  \"referenceKinds\": {\n    \"type\": \"array\",\n    \"description\": \"Reference kinds to return. Use [\\\"call\\\",\\\"jump\\\",\\\"data\\\"] with scanKind=both for symbol/function targets, [\\\"call\\\",\\\"jump\\\"] with scanKind=code for only call and branch/jump references, and [\\\"data\\\"] with scanKind=data for native strings, vtables, JNI tables, or function pointer arrays. Valid strings are call, jump, data, and unknown; jump covers branch/jump instructions.\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\"call\", \"jump\", \"data\", \"unknown\"]\n    }\n  },\n  \"maxScanBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code/data-pointer bytes to consume on this xref page. Recommended first call: 1048576. This field is required; valid range is 16..4194304. Relocation scanning uses a separate fixed per-page item budget. Continue keeps the original scan budget.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs to return on this page. Recommended first call: 50. This field is required; valid range is 1..200. Use mt_apk_continue for later pages.\"\n  }\n}\n"

    .line 85
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ܶۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 144
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ۢ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_xref"

    return-object v0
.end method
