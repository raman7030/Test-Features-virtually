.class public final Ll/᩻ۧۜ;
.super Ll/ۙۛ᩻;
.source "P75X"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 44
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 59
    iput-object p1, p0, Ll/᩻ۧۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 60
    iput-object v0, p0, Ll/᩻ۧۜ;->֫:Ll/᩹ۧۜ;

    .line 61
    iput-object v1, p0, Ll/᩻ۧۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻ۧۜ;Ll/᩸۟᩻;ZLbin/mt/json/JSONValue;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 10

    .line 202
    iget-object v0, p1, Ll/᩸۟᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {p5, p4, v0}, Ll/ܺ۟᩻;->ۧ(Ll/ܳ᩻ۜ;Ljava/lang/String;)I

    move-result v6

    if-eqz p2, :cond_0

    .line 206
    invoke-virtual {p3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    invoke-static {v1, v6, v2, v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ۖۨ᩻;

    .line 209
    :cond_0
    iget-object v7, p0, Ll/᩻ۧۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v8, p1, Ll/᩸۟᩻;->ܿ:Ljava/lang/String;

    new-instance v9, Ll/ܳۧۜ;

    move-object v1, v9

    move-object v2, p0

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Ll/ܳۧۜ;-><init>(Ll/᩻ۧۜ;ZLl/᩸۟᩻;Lbin/mt/json/JSONValue;I)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p4, p5, v0, v8, v9}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public static ֫(Ll/᩻ۧۜ;ZLl/᩸۟᩻;Lbin/mt/json/JSONValue;ILl/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 16

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    .line 8
    iget-object v4, v1, Ll/᩸۟᩻;->ᩳ:Ljava/lang/String;

    .line 10
    iget-wide v5, v2, Ll/۟۟᩻;->᩸:J

    .line 12
    iget-wide v7, v2, Ll/۟۟᩻;->᩹:J

    if-eqz v0, :cond_2

    .line 329
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 332
    :cond_0
    iget-wide v9, v1, Ll/᩸۟᩻;->ۧ:J

    cmp-long v3, v9, v7

    if-nez v3, :cond_1

    iget-wide v9, v1, Ll/᩸۟᩻;->֫:J

    cmp-long v3, v9, v5

    if-nez v3, :cond_1

    goto :goto_0

    .line 333
    :cond_1
    invoke-static/range {p3 .. p3}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 214
    :cond_2
    :goto_0
    iget-object v9, v2, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 228
    :try_start_0
    iget-object v2, v2, Ll/᩻ۧۜ;->֫:Ll/᩹ۧۜ;

    iget-object v10, v1, Ll/᩸۟᩻;->ܳ:Ljava/lang/String;

    iget-object v11, v1, Ll/᩸۟᩻;->ۢ:Ljava/lang/String;

    iget-boolean v12, v1, Ll/᩸۟᩻;->ܽ:Z

    iget v13, v1, Ll/᩸۟᩻;->ۡ:I

    iget v14, v1, Ll/᩸۟᩻;->ۜ:I

    iget v15, v1, Ll/᩸۟᩻;->᩻:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-static/range {v9 .. v15}, Ll/ܺܺۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIII)Ll/᩸ܺۢ;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v2, p3

    .line 230
    :try_start_1
    invoke-static {v1, v9, v0, v2}, Ll/᩻ۧۜ;->֫(Ll/᩸۟᩻;Ll/᩸ܺۢ;ZLbin/mt/json/JSONValue;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 308
    iget v0, v9, Ll/᩸ܺۢ;->ᩳ:I

    int-to-long v2, v0

    iget-object v0, v9, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v10, v0

    add-long/2addr v2, v10

    .line 309
    iget v0, v9, Ll/᩸ܺۢ;->ܿ:I

    int-to-long v10, v0

    cmp-long v12, v2, v10

    if-ltz v12, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    .line 312
    :cond_3
    iget-object v10, v1, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    .line 313
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "locator"

    iget-object v13, v1, Ll/᩸۟᩻;->᩷:Ljava/lang/String;

    .line 314
    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "itemKind"

    iget-object v13, v1, Ll/᩸۟᩻;->ܳ:Ljava/lang/String;

    .line 315
    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "namePrefix"

    iget-object v13, v1, Ll/᩸۟᩻;->ۢ:Ljava/lang/String;

    .line 316
    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "demangle"

    iget-boolean v13, v1, Ll/᩸۟᩻;->ܽ:Z

    .line 317
    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 318
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    const-wide/16 v13, 0x0

    if-eqz v12, :cond_4

    goto :goto_1

    :cond_4
    move-wide v7, v13

    :goto_1
    const-string v12, "entrySize"

    invoke-virtual {v11, v12, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 319
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    move-wide v5, v13

    :goto_2
    const-string v8, "entryCrc"

    invoke-virtual {v7, v8, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "totalCount"

    .line 320
    invoke-virtual {v5, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "recommendedLimit"

    iget v6, v1, Ll/᩸۟᩻;->ۜ:I

    .line 321
    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "limitMax"

    const/16 v6, 0x1f4

    .line 322
    invoke-virtual {v0, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 323
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "offset"

    long-to-int v3, v2

    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v2, "native_items"

    move-object v3, v10

    move/from16 v5, p4

    .line 312
    invoke-static/range {v2 .. v7}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    .line 217
    :goto_3
    invoke-static {v1, v9, v0}, Ll/۫֫ۜ;->֫(Ll/᩸۟᩻;Ll/᩸ܺۢ;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    :catch_0
    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF analysis failed."

    .line 238
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_1
    move-object/from16 v2, p3

    :catch_2
    if-eqz v0, :cond_6

    .line 234
    invoke-static/range {p3 .. p3}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 236
    :cond_6
    invoke-static {}, Ll/᩻ۧۜ;->᩻()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 4

    .line 409
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 410
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "<cursor>"

    const-string v3, "nextCursor"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid cursor"

    .line 408
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/᩸۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;
    .locals 4

    .line 196
    iget v0, p1, Ll/᩸۟᩻;->ۡ:I

    if-gez v0, :cond_1

    if-eqz p2, :cond_0

    .line 197
    invoke-static {p3}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/᩻ۧۜ;->᩻()Ll/ۗۛ᩻;

    move-result-object p1

    :goto_0
    throw p1

    .line 199
    :cond_1
    iget-object v0, p0, Ll/᩻ۧۜ;->ܿ:Ll/᩵᩻ۜ;

    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v1

    .line 200
    :try_start_0
    iget-object v2, p1, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    new-instance v3, Ll/ܿۧۜ;

    invoke-direct {v3, p0, p1, p2, p3}, Ll/ܿۧۜ;-><init>(Ll/᩻ۧۜ;Ll/᩸۟᩻;ZLbin/mt/json/JSONValue;)V

    invoke-virtual {v0, v2, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/json/JSONObject;

    .line 220
    new-instance p2, Ll/۬ۛ᩻;

    invoke-direct {p2, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object p2

    :catchall_0
    move-exception p1

    .line 199
    :try_start_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static ֫(Ll/᩸۟᩻;Ll/᩸ܺۢ;ZLbin/mt/json/JSONValue;)V
    .locals 6

    .line 245
    iget-object v0, p0, Ll/᩸۟᩻;->ܳ:Ljava/lang/String;

    iget v1, p0, Ll/᩸۟᩻;->ۜ:I

    iget-object v2, p1, Ll/᩸ܺۢ;->֫:Ljava/lang/String;

    iget v3, p1, Ll/᩸ܺۢ;->ᩳ:I

    iget v4, p1, Ll/᩸ܺۢ;->ܿ:I

    iget-object v5, p1, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget v0, p0, Ll/᩸۟᩻;->ۡ:I

    if-ne v3, v0, :cond_12

    iget p1, p1, Ll/᩸ܺۢ;->ܽ:I

    if-ne p1, v1, :cond_12

    if-ltz v4, :cond_12

    .line 247
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p1

    if-gt p1, v1, :cond_12

    if-ltz v3, :cond_12

    if-le v3, v4, :cond_1

    if-eqz p2, :cond_0

    .line 252
    invoke-static {p3}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 254
    :cond_0
    invoke-static {}, Ll/᩻ۧۜ;->᩻()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 256
    :cond_1
    iget p0, p0, Ll/᩸۟᩻;->᩻:I

    if-ltz p0, :cond_3

    if-ne v4, p0, :cond_2

    goto :goto_0

    .line 257
    :cond_2
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_3
    :goto_0
    int-to-long p0, v3

    .line 259
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p2

    int-to-long p2, p2

    add-long/2addr p0, p2

    int-to-long p2, v4

    cmp-long v0, p0, p2

    if-gtz v0, :cond_11

    if-gez v0, :cond_5

    .line 263
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p0

    if-lt p0, v1, :cond_4

    goto :goto_1

    .line 264
    :cond_4
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 266
    :cond_5
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۢ;

    .line 277
    instance-of p2, p1, Ll/ۚܺۢ;

    if-eqz p2, :cond_7

    .line 278
    move-object p2, p1

    check-cast p2, Ll/ۚܺۢ;

    iget-object p2, p2, Ll/ۚܺۢ;->ܽ:Ljava/lang/String;

    goto :goto_3

    .line 279
    :cond_7
    instance-of p2, p1, Ll/ۨܺۢ;

    if-eqz p2, :cond_8

    .line 280
    move-object p2, p1

    check-cast p2, Ll/ۨܺۢ;

    iget-object p2, p2, Ll/ۨܺۢ;->ᩳ:Ljava/lang/String;

    goto :goto_3

    .line 281
    :cond_8
    instance-of p2, p1, Ll/᩶ܺۢ;

    if-eqz p2, :cond_9

    .line 282
    move-object p2, p1

    check-cast p2, Ll/᩶ܺۢ;

    iget-object p2, p2, Ll/᩶ܺۢ;->ܽ:Ljava/lang/String;

    goto :goto_3

    :cond_9
    const/4 p2, 0x0

    :goto_3
    if-eqz p2, :cond_b

    .line 284
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0x1000

    if-gt p2, p3, :cond_a

    goto :goto_4

    .line 285
    :cond_a
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 293
    :cond_b
    :goto_4
    instance-of p2, p1, Ll/֨ܺۢ;

    if-nez p2, :cond_c

    goto :goto_2

    .line 296
    :cond_c
    check-cast p1, Ll/֨ܺۢ;

    .line 297
    iget p2, p1, Ll/֨ܺۢ;->֫:I

    if-ltz p2, :cond_f

    iget p2, p1, Ll/֨ܺۢ;->ܽ:I

    const/4 p3, 0x4

    if-eq p2, p3, :cond_d

    const/16 p3, 0x8

    if-ne p2, p3, :cond_f

    .line 300
    :cond_d
    iget-object p1, p1, Ll/֨ܺۢ;->ܳ:Ljava/lang/String;

    const-string p2, "auto"

    .line 301
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    const-string p2, "arm"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    const-string p2, "thumb"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    goto :goto_2

    .line 302
    :cond_e
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 298
    :cond_f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_10
    return-void

    .line 261
    :cond_11
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 248
    :cond_12
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)I
    .locals 5

    .line 383
    iget p0, p0, Ll/ۖۨ᩻;->֫:I

    const-string v0, "limit"

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "1.."

    const-string v3, "Invalid limit"

    if-eqz p1, :cond_1

    .line 384
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 390
    :try_start_0
    invoke-static {p1}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x1

    if-lt p1, v4, :cond_0

    if-gt p1, p0, :cond_0

    return p1

    .line 396
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

    .line 397
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 396
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 392
    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 393
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 392
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 385
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 386
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 385
    invoke-static {v3, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩻()Ll/ۗۛ᩻;
    .locals 5

    .line 404
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "<cursor>"

    const-string v3, "nextCursor"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid offset"

    const/4 v4, 0x0

    .line 403
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 81
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

    .line 480
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 3

    .line 140
    iget-object v0, p0, Ll/᩻ۧۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 146
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->᩻(Lbin/mt/json/JSONObject;)Ll/᩸۟᩻;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "nextCursor"

    .line 147
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p1}, Ll/᩻ۧۜ;->֫(Ll/᩸۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    iget-object v1, v1, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 152
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

    .line 150
    iget-object v1, v1, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 152
    :cond_0
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 153
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 161
    iget-object v3, v0, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    iget-object v4, v1, Ll/᩻ۧۜ;->ܿ:Ll/᩵᩻ۜ;

    const-string v5, "nextCursor"

    const-string v6, "workspaceId"

    const-string v7, ""

    .line 165
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "editSessionId"

    .line 166
    invoke-virtual {v2, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 168
    :try_start_0
    invoke-static/range {p1 .. p2}, Ll/᩻ۧۜ;->ۧ(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)I

    move-result v16

    const-string v8, "locator"

    .line 169
    invoke-virtual {v3, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v8, "itemKind"

    .line 170
    invoke-virtual {v3, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 171
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "namePrefix"

    .line 365
    invoke-virtual {v3, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 366
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 369
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v14

    .line 172
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "demangle"

    .line 374
    invoke-virtual {v3, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 375
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 378
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v15

    const-string v7, "zip_entry:"

    .line 173
    invoke-virtual {v11, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0xa

    if-eq v7, v8, :cond_4

    .line 174
    invoke-static {v13}, Ll/ܶܺۢ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v7, "entrySize"

    .line 177
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v8

    const-wide/16 v8, -0x1

    .line 340
    :try_start_1
    invoke-virtual {v3, v7, v8, v9}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v19
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v17, 0x0

    cmp-long v7, v19, v17

    if-ltz v7, :cond_3

    :try_start_2
    const-string v7, "entryCrc"

    .line 178
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 340
    :try_start_3
    invoke-virtual {v3, v7, v8, v9}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v21
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    cmp-long v7, v21, v17

    if-ltz v7, :cond_2

    :try_start_4
    const-string v7, "totalCount"

    .line 179
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v9, -0x1

    .line 353
    :try_start_5
    invoke-virtual {v3, v7, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v18
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-ltz v18, :cond_1

    .line 180
    :try_start_6
    new-instance v3, Ll/᩸۟᩻;

    const/16 v7, 0xa

    .line 181
    invoke-virtual {v11, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    iget-object v0, v0, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    const-string v7, "offset"

    const/4 v8, -0x1

    .line 182
    invoke-virtual {v0, v7, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v17

    move-object v8, v3

    move-object v9, v6

    invoke-direct/range {v8 .. v22}, Ll/᩸۟᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIJJ)V

    .line 184
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {v1, v3, v2, v0}, Ll/᩻ۧۜ;->֫(Ll/᩸۟᩻;ZLbin/mt/json/JSONValue;)Ll/۬ۛ᩻;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 186
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 187
    invoke-virtual {v4, v6}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 189
    :cond_0
    sget v2, Ll/ۡۨ᩻;->֫:I

    return-object v0

    .line 355
    :cond_1
    :try_start_7
    invoke-static {v8}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 359
    :catch_0
    :try_start_8
    invoke-static {v8}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 342
    :cond_2
    :try_start_9
    invoke-static {v12}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 346
    :catch_1
    :try_start_a
    invoke-static {v12}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 342
    :cond_3
    :try_start_b
    invoke-static {v12}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_b
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 346
    :catch_2
    :try_start_c
    invoke-static {v12}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 175
    :cond_4
    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 376
    :cond_5
    invoke-static {v7}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 367
    :cond_6
    invoke-static {v7}, Ll/᩻ۧۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catchall_0
    move-exception v0

    .line 186
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 187
    invoke-virtual {v4, v6}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 189
    :cond_7
    sget v2, Ll/ۡۨ᩻;->֫:I

    .line 190
    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "List the first page of one ELF detail list. Start with mt_apk_native_inspect and copy a nextActions call; for later pages use mt_apk_continue with the returned action arguments. mt_apk_native_inspect.counts is unfiltered. This tool returns items and pagination.totalAvailableCount after applying namePrefix; zero means no items match that filter, not necessarily that the ELF has no items of this kind. Use namePrefix=\"\" and limit=100 initially. For initArray/finiArray, disassemble targetVirtualAddress when available, otherwise targetFileOffset, using targetInstructionMode and stopAtSymbolBoundary=true. If neither target address exists, inspect the slot bytes with mt_apk_read_bytes: convert slotFileOffset to decimal byteOffset and use maxBytes=pointerSize. A missing library name is returned as an empty string. See input fields for item kinds and filtering rules."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List Native ELF Items"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩻ۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session view; pass an empty string to read the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"itemKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"neededLibraries\", \"sections\", \"segments\", \"imports\", \"symbols\", \"entries\", \"initArray\", \"finiArray\", \"relocations\"],\n    \"description\": \"ELF list to read. Prefer copying this from the mt_apk_native_inspect result\'s nextActions. For manual calls, use one of neededLibraries, sections, segments, imports, symbols, entries, initArray, finiArray, or relocations; if mt_apk_native_inspect reported count 0 for that itemKind, this returns an empty page. entries means all loader-recognized entry point records with stable entryN names, including program, init, fini, and preinit entries when present. initArray and finiArray separately read .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.\"\n  },\n  \"namePrefix\": {\n    \"type\": \"string\",\n    \"description\": \"Case-sensitive literal prefix for the returned item name only. Pass an empty string for no filter. entries uses stable generated entryN names; other named item kinds keep their raw ELF names. It does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter; the so file is selected only by locator. initArray/finiArray items have no name, so non-empty namePrefix matches no items.\"\n  },\n  \"demangle\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, add demangledName for imports, symbols, and relocations when C++ Itanium demangling succeeds. namePrefix still matches only name. This has no effect for entries, initArray, or finiArray. Pass false by default; use true when readable C++ symbols help interpretation.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size. Pass 100 by default; valid range is 1..500.\"\n  }\n}\n"

    .line 89
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۧۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 23

    move-object/from16 v0, p0

    .line 127
    iget-object v1, v0, Ll/᩻ۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v1, :cond_0

    return-object v1

    .line 1732
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Workspace id."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 1733
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "editSessionId"

    .line 1734
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "zip_entry locator."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 1735
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "ELF item kind returned on this page."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "itemKind"

    .line 1736
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Case-sensitive literal prefix for the returned item name only. Empty string means no filter; it does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter. entries uses generated entryN names; initArray/finiArray items have no name, so non-empty namePrefix matches no items."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "namePrefix"

    .line 1737
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "boolean"

    const-string v4, "Whether imports, symbols, and relocations include best-effort C++ demangledName values. This flag does not affect pagination, counts, or namePrefix filtering, and has no effect for entries, initArray, or finiArray."

    .line 124
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "demangle"

    .line 1738
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2397
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Stable hint code, or empty string when no hint applies."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "code"

    .line 2398
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "message"

    const-string v6, "Short hint message, or empty string when no hint applies."

    const-string v7, "Non-blocking filter hint. code=name_prefix_not_applicable means itemKind has no name field and non-empty namePrefix filtered out every item. Empty code/message means no hint applies."

    .line 0
    invoke-static {v4, v2, v6, v5, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "filterHint"

    .line 1739
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2228
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 2242
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Needed library name."

    const-string v7, "name"

    const-string v8, "Needed shared library item."

    .line 0
    invoke-static {v5, v2, v6, v7, v8}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 2229
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 2145
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Name."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 2146
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Type."

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "type"

    .line 2147
    invoke-virtual {v5, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "Architecture."

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "arch"

    .line 2148
    invoke-virtual {v5, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "Virtual address, or null."

    .line 103
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "virtualAddress"

    .line 2149
    invoke-virtual {v5, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "ELF file offset within the zip_entry bytes, or null."

    .line 103
    invoke-static {v2, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "fileOffset"

    .line 2150
    invoke-virtual {v5, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v12, "integer"

    const-string v14, "File size."

    .line 110
    invoke-static {v12, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "size"

    .line 2151
    invoke-virtual {v5, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v14, "Virtual size."

    .line 110
    invoke-static {v12, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v0, "virtualSize"

    .line 2152
    invoke-virtual {v5, v0, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Permission bitset."

    .line 110
    invoke-static {v12, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v14, "permissions"

    .line 2153
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Flag bitset."

    .line 110
    invoke-static {v12, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v14, "flags"

    .line 2154
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Whether this range is data."

    .line 124
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v14, "data"

    .line 2155
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "segment"

    const-string v14, "Whether this item is a segment."

    move-object/from16 v16, v1

    const-string v1, "ELF section or segment item."

    .line 0
    invoke-static {v0, v3, v14, v5, v1}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 2230
    invoke-virtual {v4, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 2160
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Import name."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2161
    invoke-virtual {v1, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Best-effort C++ demangled import name when requested and different from name, otherwise empty string."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "demangledName"

    .line 2162
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Source shared library name when ELF metadata identifies one, otherwise empty string."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v17, v15

    const-string v15, "library"

    .line 2163
    invoke-virtual {v1, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v14, "Binding."

    move-object/from16 v18, v13

    .line 96
    invoke-static {v2, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v19, v10

    const-string v10, "bind"

    .line 2164
    invoke-virtual {v1, v10, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    .line 2165
    invoke-virtual {v1, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v13, "ELF/analyzer class metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java class name."

    .line 96
    invoke-static {v2, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v20, v11

    const-string v11, "className"

    .line 2166
    invoke-virtual {v1, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v13, "ELF/analyzer descriptor metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java method descriptor."

    .line 96
    invoke-static {v2, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v21, v8

    const-string v8, "descriptor"

    .line 2167
    invoke-virtual {v1, v8, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "Ordinal."

    .line 110
    invoke-static {v12, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "ordinal"

    .line 2168
    invoke-virtual {v1, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "Whether the import is in a section header."

    .line 124
    invoke-static {v3, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "inSectionHeader"

    .line 2169
    invoke-virtual {v1, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "Always true for the imports itemKind because this list represents ELF imports; do not use it to infer the provider library."

    const-string v13, "imported"

    move-object/from16 v22, v12

    const-string v12, "ELF import item."

    .line 0
    invoke-static {v1, v3, v8, v13, v12}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2231
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 2174
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "Raw ELF symbol name, or a stable generated entryN name for an entries item."

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2175
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "Best-effort C++ demangled symbol name when requested and different from name; always empty for entries."

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2176
    invoke-virtual {v1, v5, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "ELF/analyzer class metadata when present. Ordinary Android ELF SO symbols usually leave this empty; do not treat it as a Dex/Java class name."

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2177
    invoke-virtual {v1, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2178
    invoke-virtual {v1, v15, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-static {v2, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2179
    invoke-virtual {v1, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 2180
    invoke-virtual {v1, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "Whether this item is imported."

    .line 124
    invoke-static {v3, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 2181
    invoke-virtual {v1, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v6, v21

    .line 103
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    move-object/from16 v10, v20

    .line 2182
    invoke-virtual {v1, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v8, v19

    .line 103
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v12, v18

    .line 2183
    invoke-virtual {v1, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v11, "Symbol size."

    move-object/from16 v13, v22

    .line 110
    invoke-static {v13, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v14, v17

    .line 2184
    invoke-virtual {v1, v14, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v11, "symbolBits"

    const-string v14, "Symbol bit width reported by ELF metadata."

    move-object/from16 v17, v3

    const-string v3, "ELF symbol or entry item."

    .line 0
    invoke-static {v1, v13, v14, v11, v3}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2232
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 2203
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, ".init_array or .fini_array."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "arrayName"

    .line 2204
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based item offset within the current itemKind view."

    .line 110
    invoke-static {v13, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "arrayIndex"

    .line 2205
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Array slot virtual address, or null."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "slotVirtualAddress"

    .line 2206
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Array slot ELF file offset within the zip_entry bytes, or null. Convert this 0x hex string to decimal before passing it as mt_apk_read_bytes.byteOffset."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "slotFileOffset"

    .line 2207
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Target function virtual address, or null. Prefer this for mt_apk_native_disassemble with addressKind=virtual when non-null."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "targetVirtualAddress"

    .line 2208
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Target function ELF file offset within the zip_entry bytes, or null. Use this for mt_apk_native_disassemble with addressKind=file_offset only when targetVirtualAddress is null."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "targetFileOffset"

    .line 2209
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Instruction mode to pass to mt_apk_native_disassemble with targetVirtualAddress or targetFileOffset: auto, arm, or thumb."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "targetInstructionMode"

    .line 2210
    invoke-virtual {v1, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "pointerSize"

    const-string v11, "Pointer slot size in bytes: 4 for ELF32, 8 for ELF64."

    const-string v14, "ELF init/fini array pointer slot item."

    .line 0
    invoke-static {v1, v13, v11, v3, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2233
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 2189
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Relocation name."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2190
    invoke-virtual {v1, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Best-effort C++ demangled relocation name when requested and different from name, otherwise empty string."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2191
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2192
    invoke-virtual {v1, v15, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Relocation type."

    .line 110
    invoke-static {v13, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2193
    invoke-virtual {v1, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Numeric relocation type."

    .line 110
    invoke-static {v13, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "numericType"

    .line 2194
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 103
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2195
    invoke-virtual {v1, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 103
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 2196
    invoke-virtual {v1, v12, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Relocation addend."

    .line 110
    invoke-static {v13, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "addend"

    .line 2197
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Whether the relocation is additive."

    move-object/from16 v3, v17

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "additive"

    .line 2198
    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "ifunc"

    const-string v4, "Whether the relocation is IFUNC."

    const-string v5, "ELF relocation item."

    .line 0
    invoke-static {v1, v3, v4, v2, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2234
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "description"

    const-string v2, "ELF items for data.itemKind. neededLibraries items use {name}; sections and segments use the section shape; imports use the import shape; symbols and entries use the symbol shape. entries contain all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present, and use stable generated entryN names. initArray and finiArray use the .init_array/.fini_array pointer-slot shape, may describe the same lifecycle target with slot metadata, and have no name field. imports, symbols, and relocations may include demangledName and library=\"\" when ELF metadata does not identify a source shared library; entries always use an empty demangledName and library. relocations use the relocation shape."

    const-string v3, "array"

    .line 0
    invoke-static {v9, v3, v1, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2238
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "anyOf"

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "items"

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v16

    .line 1740
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Maximum limit accepted by mt_apk_continue for later native item pages."

    const-string v2, "Total item count after applying data.namePrefix, or null when unknown."

    const-string v3, "Number of filtered items returned on this page."

    .line 1741
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "One native ELF item list page. data.itemKind determines the item shape."

    .line 1732
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "No tool-specific diagnostics."

    .line 2393
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 88
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 92
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_continue"

    .line 90
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "nextActions contains mt_apk_continue only when data.pagination.hasMore=true; otherwise it is empty."

    .line 89
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_native_list_items. One filtered ELF detail page. Read filterHint before interpreting an empty page; use nextActions to continue."

    .line 87
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    .line 130
    iput-object v0, v1, Ll/᩻ۧۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_list_items"

    return-object v0
.end method
