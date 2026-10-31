.class public final Ll/ۜ᩻ۜ;
.super Ljava/lang/Object;
.source "H78K"


# instance fields
.field public final ֫:Ll/۠᩷ۜ;


# direct methods
.method public constructor <init>(Ll/۠᩷ۜ;Ll/ۢ᩻ۜ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۜ᩻ۜ;->֫:Ll/۠᩷ۜ;

    return-void
.end method

.method public static ֫(Ll/֡᩷ۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/֡᩷ۜ;
    .locals 1

    .line 153
    new-instance v0, Ll/֡᩷ۜ;

    invoke-direct {v0, p1, p2}, Ll/֡᩷ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 154
    iget-boolean p1, p0, Ll/֡᩷ۜ;->ۘ:Z

    iput-boolean p1, v0, Ll/֡᩷ۜ;->ۘ:Z

    .line 155
    iget-object p1, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iput-object p1, v0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    .line 156
    iget-wide p1, p0, Ll/֡᩷ۜ;->ۖ:J

    iput-wide p1, v0, Ll/֡᩷ۜ;->ۖ:J

    .line 157
    iget-wide p1, p0, Ll/֡᩷ۜ;->ۡ:J

    iput-wide p1, v0, Ll/֡᩷ۜ;->ۡ:J

    .line 158
    iget-object p1, p0, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    iput-object p1, v0, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    .line 159
    iget-wide p1, p0, Ll/֡᩷ۜ;->֫:J

    iput-wide p1, v0, Ll/֡᩷ۜ;->֫:J

    .line 160
    iget-wide p1, p0, Ll/֡᩷ۜ;->ᩳ:J

    iput-wide p1, v0, Ll/֡᩷ۜ;->ᩳ:J

    .line 161
    iget-object p1, v0, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    iget-object p2, p0, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 162
    iget-object p1, p0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    iput-object p1, v0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 163
    iget-object p1, p0, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    iput-object p1, v0, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    .line 164
    iget-object p1, p0, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    iput-object p1, v0, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 165
    iget-wide p1, p0, Ll/֡᩷ۜ;->᩻:J

    iput-wide p1, v0, Ll/֡᩷ۜ;->᩻:J

    .line 166
    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۜ:Z

    iput-boolean p0, v0, Ll/֡᩷ۜ;->ۜ:Z

    return-object v0
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;Z)Ll/֡᩷ۜ;
    .locals 3

    .line 120
    new-instance v0, Ll/֡᩷ۜ;

    const-string v1, ""

    invoke-direct {v0, p1, v1}, Ll/֡᩷ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 121
    iput-boolean p4, v0, Ll/֡᩷ۜ;->ۘ:Z

    .line 123
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    const-string p4, "sourcePath"

    .line 122
    invoke-static {p1, p4}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    .line 124
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    iput-wide v1, v0, Ll/֡᩷ۜ;->ۖ:J

    .line 125
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide p1

    iput-wide p1, v0, Ll/֡᩷ۜ;->ۡ:J

    .line 126
    iput-object p3, v0, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v0, Ll/֡᩷ۜ;->֫:J

    .line 128
    iput-wide p1, v0, Ll/֡᩷ۜ;->ᩳ:J

    return-object v0
.end method

.method private ֫(Ll/֡᩷ۜ;Ll/ᩳ᩻ۜ;Ll/᩶ۨ᩻;)Ll/ܳ᩻ۜ;
    .locals 22

    move-object/from16 v1, p1

    .line 292
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 293
    iget-object v0, v1, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    iget-object v2, v1, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "available"

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵᩷ۜ;

    .line 294
    iget-object v6, v4, Ll/᩵᩷ۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v4, v4, Ll/᩵᩷ۜ;->֫:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 295
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 368
    :cond_1
    new-instance v14, Ll/۟ۨ᩻;

    invoke-direct {v14}, Ll/۟ۨ᩻;-><init>()V

    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v4, "entries"

    const/4 v6, 0x0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵᩷ۜ;

    .line 370
    iget-object v7, v0, Ll/᩵᩷ۜ;->֫:Ljava/lang/String;

    iget-object v0, v0, Ll/᩵᩷ۜ;->ᩳ:Ljava/lang/String;

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    const-string v8, "error"

    .line 374
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 58
    new-instance v0, Ll/ܰۨ᩻;

    invoke-direct {v0, v7}, Ll/ܰۨ᩻;-><init>(Ljava/lang/String;)V

    .line 60
    iput-boolean v6, v0, Ll/ܰۨ᩻;->֫:Z

    .line 375
    invoke-virtual {v14, v0}, Ll/۟ۨ᩻;->֫(Ll/ܰۨ᩻;)V

    goto :goto_1

    :cond_3
    const-string v8, "skipped"

    .line 378
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 69
    new-instance v0, Ll/ܰۨ᩻;

    invoke-direct {v0, v7}, Ll/ܰۨ᩻;-><init>(Ljava/lang/String;)V

    .line 71
    iput-boolean v6, v0, Ll/ܰۨ᩻;->֫:Z

    .line 379
    invoke-virtual {v14, v0}, Ll/۟ۨ᩻;->֫(Ll/ܰۨ᩻;)V

    goto :goto_1

    .line 382
    :cond_4
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    .line 387
    :cond_5
    :try_start_0
    sget v0, Ll/۠᩷ۜ;->ۧ:I

    .line 401
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 417
    invoke-virtual {v0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 387
    invoke-static {v0}, Ll/ۜ᩻ۜ;->֫(Ll/ܶ᩵ܿ;)[B

    move-result-object v0

    .line 388
    invoke-static {v7, v0}, Ll/ܰۨ᩻;->֫(Ljava/lang/String;[B)Ll/ܰۨ᩻;

    move-result-object v0

    .line 389
    invoke-virtual {v14, v0}, Ll/۟ۨ᩻;->֫(Ll/ܰۨ᩻;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 392
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    :goto_2
    new-instance v0, Ll/ܰۨ᩻;

    invoke-direct {v0, v7}, Ll/ܰۨ᩻;-><init>(Ljava/lang/String;)V

    .line 60
    iput-boolean v6, v0, Ll/ܰۨ᩻;->֫:Z

    .line 393
    invoke-virtual {v14, v0}, Ll/۟ۨ᩻;->֫(Ll/ܰۨ᩻;)V

    goto :goto_1

    .line 443
    :cond_7
    iget-object v0, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x1

    const/4 v7, 0x0

    if-nez v0, :cond_9

    .line 444
    invoke-static/range {p1 .. p1}, Ll/ۜ᩻ۜ;->ۧ(Ll/֡᩷ۜ;)V

    .line 462
    iget-boolean v0, v1, Ll/֡᩷ۜ;->ۜ:Z

    if-nez v0, :cond_8

    goto :goto_3

    .line 466
    :cond_8
    :try_start_1
    iput-boolean v6, v1, Ll/֡᩷ۜ;->ۜ:Z

    .line 467
    invoke-static {v2, v1}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Ll/֡᩷ۜ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_3
    move-object/from16 v20, v7

    goto :goto_5

    .line 448
    :cond_9
    sget v0, Ll/۠᩷ۜ;->ۧ:I

    .line 401
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v4, "resources.arsc"

    .line 413
    invoke-virtual {v0, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 449
    iget-object v4, v1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    if-nez v4, :cond_a

    .line 477
    invoke-static {v0}, Ll/۠᩷ۜ;->ܳ(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 478
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v7

    iput-wide v7, v1, Ll/֡᩷ۜ;->᩻:J

    .line 479
    iput-boolean v3, v1, Ll/֡᩷ۜ;->ۜ:Z

    .line 452
    :cond_a
    new-instance v3, Ll/᩵ᩳۜ;

    iget-object v4, v1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    iget-wide v7, v1, Ll/֡᩷ۜ;->᩻:J

    invoke-direct {v3, v7, v8, v0, v4}, Ll/᩵ᩳۜ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 462
    iget-boolean v0, v1, Ll/֡᩷ۜ;->ۜ:Z

    if-nez v0, :cond_b

    goto :goto_4

    .line 466
    :cond_b
    :try_start_2
    iput-boolean v6, v1, Ll/֡᩷ۜ;->ۜ:Z

    .line 467
    invoke-static {v2, v1}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Ll/֡᩷ۜ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :goto_4
    move-object/from16 v20, v3

    :goto_5
    const-string v0, "absent"

    .line 404
    iget-object v2, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "parse_error"

    if-nez v0, :cond_f

    const-string v0, "extract_error"

    iget-object v3, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 405
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    .line 408
    :cond_c
    iget-object v0, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 409
    iget-object v0, v1, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    if-nez v0, :cond_d

    const-string v0, "Failed to parse resources.arsc"

    .line 38
    :cond_d
    new-instance v3, Ll/ᩴᩳۜ;

    invoke-direct {v3, v6, v0}, Ll/ᩴᩳۜ;-><init>(ZLjava/lang/String;)V

    goto :goto_7

    .line 412
    :cond_e
    invoke-static/range {v20 .. v20}, Ll/ۜ᩻ۜ;->֫(Ll/᩵ᩳۜ;)Ll/ᩴᩳۜ;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_8

    .line 406
    :cond_f
    :goto_6
    iget-object v0, v1, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    .line 38
    new-instance v3, Ll/ᩴᩳۜ;

    invoke-direct {v3, v6, v0}, Ll/ᩴᩳۜ;-><init>(ZLjava/lang/String;)V

    :goto_7
    move-object/from16 v19, v3

    .line 277
    :goto_8
    iget-object v0, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 278
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_9

    :cond_10
    const/4 v0, 0x0

    goto :goto_a

    :cond_11
    :goto_9
    const/4 v0, 0x1

    .line 279
    :goto_a
    new-instance v3, Ll/ܳ᩻ۜ;

    move-object v2, v3

    iget-object v4, v1, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    iget-boolean v5, v1, Ll/֡᩷ۜ;->ۘ:Z

    iget-object v6, v1, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    iget-object v7, v1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-wide v8, v1, Ll/֡᩷ۜ;->ۖ:J

    iget-wide v10, v1, Ll/֡᩷ۜ;->ۡ:J

    move-object/from16 v12, p2

    iget-object v12, v12, Ll/ᩳ᩻ۜ;->֫:Ljava/util/ArrayList;

    const/16 v21, 0x1

    iget-object v15, v1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    iget-object v1, v1, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    move-object/from16 v16, v1

    move-object/from16 v1, p0

    move-object/from16 v17, v3

    iget-object v3, v1, Ll/ۜ᩻ۜ;->֫:Ll/۠᩷ۜ;

    move-object/from16 v1, v17

    move-object/from16 v18, v14

    move v14, v0

    move-object/from16 v17, p3

    invoke-direct/range {v2 .. v20}, Ll/ܳ᩻ۜ;-><init>(Ll/۠᩷ۜ;Ljava/lang/String;ZLl/ܶ᩵ܿ;Ljava/lang/String;JJLjava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;Ll/᩶ۨ᩻;Ll/۟ۨ᩻;Ll/ᩴᩳۜ;Ll/᩵ᩳۜ;)V

    .line 305
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 306
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 307
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 308
    iget-object v4, v1, Ll/ܳ᩻ۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 309
    iget-object v6, v1, Ll/ܳ᩻ۜ;->᩻:Ll/۟ۨ᩻;

    .line 41
    iget-object v6, v6, Ll/۟ۨ᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, -0x1

    if-eqz v7, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܰۨ᩻;

    .line 42
    iget-boolean v9, v7, Ll/ܰۨ᩻;->֫:Z

    if-eqz v9, :cond_13

    iget-object v9, v7, Ll/ܰۨ᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    .line 43
    iget v6, v7, Ll/ܰۨ᩻;->ۧ:I

    goto :goto_b

    :cond_14
    const/4 v6, -0x1

    .line 216
    :goto_b
    iget-object v7, v1, Ll/ܳ᩻ۜ;->ۗ:Ll/۠᩷ۜ;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v1, Ll/ܳ᩻ۜ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-static {v7, v5}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 64
    new-instance v9, Ljava/io/DataInputStream;

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 65
    :try_start_3
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    const v11, 0x4d445449    # 2.05866128E8f

    if-ne v10, v11, :cond_1b

    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    const/4 v11, 0x2

    if-ne v10, v11, :cond_1b

    .line 68
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    if-ltz v10, :cond_1a

    if-ltz v6, :cond_15

    if-ne v10, v6, :cond_1a

    :cond_15
    int-to-long v11, v10

    .line 97
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v6

    const-wide/16 v13, 0xc

    sub-long/2addr v6, v13

    const-wide/16 v13, 0x6

    div-long/2addr v6, v13

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    cmp-long v13, v11, v6

    if-gtz v13, :cond_1a

    .line 72
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0x1000

    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v10, :cond_17

    .line 74
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v11

    .line 75
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v12

    const/high16 v13, -0x80000000

    and-int/2addr v13, v12

    if-eqz v13, :cond_16

    const v13, 0x7fffffff

    and-int/2addr v12, v13

    .line 79
    invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I

    move-result v13

    goto :goto_d

    :cond_16
    const/4 v13, 0x0

    .line 83
    :goto_d
    new-instance v14, Ll/ܿ᩺᩻;

    const/4 v15, 0x0

    .line 147
    invoke-direct {v14, v15, v12, v13, v11}, Ll/ܿ᩺᩻;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 83
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_c

    .line 85
    :cond_17
    invoke-virtual {v9}, Ljava/io/InputStream;->read()I

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v7, v8, :cond_19

    .line 89
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    .line 313
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿ᩺᩻;

    .line 314
    iget-object v8, v7, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v10, Ll/ۧ֫᩻;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v8, v9, v10}, Ll/ܰ۬ᩴ;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 315
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_18

    goto :goto_e

    .line 164
    :cond_18
    new-instance v9, Ll/ܿ᩺᩻;

    iget v10, v7, Ll/ܿ᩺᩻;->֫:I

    iget v7, v7, Ll/ܿ᩺᩻;->ᩳ:I

    invoke-direct {v9, v5, v10, v7, v8}, Ll/ܿ᩺᩻;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 319
    invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 86
    :cond_19
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing type index data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid type index count"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid type index header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 64
    :try_start_5
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_f

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1

    .line 323
    :cond_1c
    iput-object v0, v1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 324
    iput-object v2, v1, Ll/ܳ᩻ۜ;->ۧ:Ljava/util/HashMap;

    .line 325
    iput-object v3, v1, Ll/ܳ᩻ۜ;->ܽ:Ljava/util/HashMap;

    .line 333
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 335
    new-instance v0, Ll/᩻᩻ۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 326
    iput-object v2, v1, Ll/ܳ᩻ۜ;->᩹:Ljava/util/ArrayList;

    return-object v1
.end method

.method public static ֫(Ll/ᩳܰۡ;)Ll/ᩳ᩻ۜ;
    .locals 8

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "AndroidManifest.xml"

    .line 54
    invoke-virtual {p0, v1}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v4, "resources.arsc"

    .line 55
    invoke-virtual {p0, v4}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 57
    :goto_1
    invoke-virtual {p0}, Ll/ᩳܰۡ;->ۖ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 58
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_2

    .line 59
    invoke-static {v6}, Ll/ܰܳۜ;->֫(Ll/ۗ᩺ۡ;)Ll/ܰܳۜ;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 63
    :cond_3
    :try_start_0
    invoke-virtual {p0, v3}, Ll/ᩳܰۡ;->֫(Z)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p0, v3

    goto :goto_3

    :catch_0
    const/4 p0, 0x0

    :goto_3
    if-eqz v1, :cond_5

    if-nez p0, :cond_4

    if-eqz v4, :cond_5

    :cond_4
    const/4 v2, 0x1

    .line 68
    :cond_5
    new-instance p0, Ll/ᩳ᩻ۜ;

    invoke-direct {p0, v0, v2}, Ll/ᩳ᩻ۜ;-><init>(Ljava/util/ArrayList;Z)V

    return-object p0
.end method

.method public static ֫(Ll/᩵ᩳۜ;)Ll/ᩴᩳۜ;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 38
    new-instance p0, Ll/ᩴᩳۜ;

    invoke-direct {p0, v0, v1}, Ll/ᩴᩳۜ;-><init>(ZLjava/lang/String;)V

    return-object p0

    .line 423
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/᩵ᩳۜ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object p0

    .line 424
    invoke-virtual {p0}, Ll/᩺᩻ܽ;->ۚ()I

    .line 427
    invoke-virtual {p0}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 428
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->ۗ()I

    .line 429
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 430
    invoke-interface {v3}, Ll/֡᩻ܽ;->᩷()I

    goto :goto_0

    .line 31
    :cond_2
    new-instance p0, Ll/ᩴᩳۜ;

    const/4 v2, 0x1

    invoke-direct {p0, v2, v1}, Ll/ᩴᩳۜ;-><init>(ZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 435
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string p0, "Failed to parse resources.arsc"

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 38
    :goto_1
    new-instance v1, Ll/ᩴᩳۜ;

    invoke-direct {v1, v0, p0}, Ll/ᩴᩳۜ;-><init>(ZLjava/lang/String;)V

    return-object v1
.end method

.method private ֫(Ll/ᩳܰۡ;Ll/֡᩷ۜ;)V
    .locals 9

    .line 223
    iget-object v0, p2, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    iget-object p2, p2, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x1

    .line 225
    invoke-virtual {p1, v1}, Ll/ᩳܰۡ;->֫(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 226
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    .line 228
    new-instance v3, Ll/᩵᩷ۜ;

    const-string v6, "skipped"

    const-string v7, "Skipped after previous dex error"

    invoke-direct {v3, v4, v6, v7, v5}, Ll/᩵᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 232
    :cond_0
    sget v6, Ll/۠᩷ۜ;->ۧ:I

    const-string v6, "entries"

    .line 401
    invoke-virtual {p2, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 417
    invoke-virtual {v6, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 234
    :try_start_0
    invoke-virtual {p1, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v6, v3}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 235
    invoke-static {p2, v4}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 236
    invoke-static {v6, v3}, Ll/ܳ᩺᩻;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V

    .line 237
    new-instance v3, Ll/᩵᩷ۜ;

    const-string v6, "available"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "cache/dex/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".type_index"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v4, v6, v5, v7}, Ll/᩵᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 241
    new-instance v3, Ll/᩵᩷ۜ;

    .line 243
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    const-string v2, "Failed to open dex"

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    :goto_1
    const-string v6, "error"

    invoke-direct {v3, v4, v6, v2, v5}, Ll/᩵᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)[B
    .locals 7

    .line 497
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    .line 498
    :try_start_0
    new-instance v0, Ll/֡ܺᩴ;

    const/16 v1, 0x70

    invoke-direct {v0, v1}, Ll/֡ܺᩴ;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v2, 0x2000

    :try_start_1
    new-array v3, v2, [B

    :goto_0
    if-lez v1, :cond_1

    .line 502
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p0, v3, v5, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_0

    goto :goto_1

    .line 506
    :cond_0
    invoke-virtual {v0, v3, v5, v4}, Ll/֡ܺᩴ;->write([BII)V

    sub-int/2addr v1, v4

    goto :goto_0

    .line 509
    :cond_1
    :goto_1
    iget-object v1, v0, Ll/֡ܺᩴ;->᩸:[B

    array-length v2, v1

    iget v0, v0, Ll/֡ܺᩴ;->᩹:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v0, :cond_3

    if-eqz p0, :cond_2

    .line 513
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_2
    return-object v1

    .line 512
    :cond_3
    :try_start_2
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p0, :cond_4

    .line 513
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_4
    return-object v0

    :catchall_0
    move-exception v0

    .line 497
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz p0, :cond_5

    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw v0
.end method

.method public static ۧ(Ll/֡᩷ۜ;)V
    .locals 5

    .line 486
    iget-object v0, p0, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    const-wide/16 v1, -0x1

    if-nez v0, :cond_0

    iget-wide v3, p0, Ll/֡᩷ۜ;->᩻:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 487
    iput-boolean v0, p0, Ll/֡᩷ۜ;->ۜ:Z

    :cond_1
    const/4 v0, 0x0

    .line 489
    iput-object v0, p0, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 490
    iput-wide v1, p0, Ll/֡᩷ۜ;->᩻:J

    return-void
.end method

.method private ۧ(Ll/ᩳܰۡ;Ll/֡᩷ۜ;)V
    .locals 6

    const-string v0, "parse_error"

    const-string v1, "resources.arsc"

    .line 181
    invoke-virtual {p1, v1}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string p1, "absent"

    .line 183
    iput-object p1, p2, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 184
    iput-object v3, p2, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    return-void

    .line 187
    :cond_0
    iget-object v4, p2, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    sget v5, Ll/۠᩷ۜ;->ۧ:I

    const-string v5, "entries"

    .line 401
    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 413
    invoke-virtual {v4, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 189
    :try_start_0
    invoke-virtual {p1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 477
    invoke-static {v1}, Ll/۠᩷ۜ;->ܳ(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 478
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    iput-wide v4, p2, Ll/֡᩷ۜ;->᩻:J

    const/4 p1, 0x1

    .line 479
    iput-boolean p1, p2, Ll/֡᩷ۜ;->ۜ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 200
    :try_start_1
    new-instance p1, Ll/᩵ᩳۜ;

    iget-object v2, p2, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    invoke-direct {p1, v4, v5, v1, v2}, Ll/᩵ᩳۜ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 208
    invoke-static {p1}, Ll/ۜ᩻ۜ;->֫(Ll/᩵ᩳۜ;)Ll/ᩴᩳۜ;

    move-result-object p1

    .line 209
    iget-boolean v1, p1, Ll/ᩴᩳۜ;->֫:Z

    if-eqz v1, :cond_1

    const-string p1, "available"

    .line 210
    iput-object p1, p2, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 211
    iput-object v3, p2, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    return-void

    .line 213
    :cond_1
    invoke-static {p2}, Ll/ۜ᩻ۜ;->ۧ(Ll/֡᩷ۜ;)V

    .line 214
    iput-object v0, p2, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 215
    iget-object p1, p1, Ll/ᩴᩳۜ;->ۧ:Ljava/lang/String;

    iput-object p1, p2, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    .line 203
    invoke-static {p2}, Ll/ۜ᩻ۜ;->ۧ(Ll/֡᩷ۜ;)V

    .line 204
    iput-object v0, p2, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 205
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "Failed to parse resources.arsc"

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p2, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    return-void

    :catch_1
    move-exception p1

    .line 192
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 193
    invoke-static {p2}, Ll/ۜ᩻ۜ;->ۧ(Ll/֡᩷ۜ;)V

    const-string v0, "extract_error"

    .line 194
    iput-object v0, p2, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 195
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string p1, "Failed to extract resources.arsc"

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_1
    iput-object p1, p2, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡᩷ۜ;)Ll/ܳ᩻ۜ;
    .locals 3

    .line 253
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    iget-object v1, p1, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    const-string v2, "original.apk"

    .line 393
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 253
    invoke-direct {v0, v1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    :try_start_1
    invoke-static {v0}, Ll/ۜ᩻ۜ;->֫(Ll/ᩳܰۡ;)Ll/ᩳ᩻ۜ;

    move-result-object v1

    .line 353
    invoke-static {v0}, Ll/ۗۨ᩻;->֫(Ll/ᩳܰۡ;)Ll/᩶ۨ᩻;

    move-result-object v2

    .line 265
    invoke-direct {p0, p1, v1, v2}, Ll/ۜ᩻ۜ;->֫(Ll/֡᩷ۜ;Ll/ᩳ᩻ۜ;Ll/᩶ۨ᩻;)Ll/ܳ᩻ۜ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 256
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catchall_0
    move-exception v1

    .line 253
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 257
    :catch_0
    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p1}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 257
    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Z)Ll/ܳ᩻ۜ;
    .locals 11

    const-string v0, "Not an APK"

    const-string v1, "NOT_APK"

    .line 75
    iget-object v2, p0, Ll/ۜ᩻ۜ;->֫:Ll/۠᩷ۜ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 77
    :try_start_0
    new-instance v5, Ll/ᩳܰۡ;

    invoke-direct {v5, p1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 78
    :try_start_1
    invoke-static {v5}, Ll/ۜ᩻ۜ;->֫(Ll/ᩳܰۡ;)Ll/ᩳ᩻ۜ;

    move-result-object v6

    .line 79
    iget-boolean v7, v6, Ll/ᩳ᩻ۜ;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v7, :cond_2

    .line 84
    :try_start_2
    invoke-static {v5}, Ll/ۗۨ᩻;->֫(Ll/ᩳܰۡ;)Ll/᩶ۨ᩻;

    move-result-object v7

    .line 360
    iget-object v8, v7, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    invoke-static {v8}, Ll/ᩳۨ᩻;->֫(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v2}, Ll/۠᩷ۜ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    const-string v9, "original.apk"

    .line 393
    invoke-virtual {v8, v9}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 87
    invoke-static {v5, v9}, Ll/۠᩷ۜ;->֫(Ll/ᩳܰۡ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v9

    .line 88
    invoke-direct {p0, v8, p1, v9, p2}, Ll/ۜ᩻ۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;Z)Ll/֡᩷ۜ;

    move-result-object p1

    .line 90
    invoke-direct {p0, v5, p1}, Ll/ۜ᩻ۜ;->ۧ(Ll/ᩳܰۡ;Ll/֡᩷ۜ;)V

    .line 91
    invoke-direct {p0, v5, p1}, Ll/ۜ᩻ۜ;->֫(Ll/ᩳܰۡ;Ll/֡᩷ۜ;)V

    :goto_0
    const/16 p2, 0x64

    if-ge v4, p2, :cond_1

    .line 138
    invoke-virtual {v2}, Ll/۠᩷ۜ;->ۧ()Ljava/lang/String;

    move-result-object p2

    .line 139
    invoke-static {p1, v8, p2}, Ll/ۜ᩻ۜ;->֫(Ll/֡᩷ۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object v9

    iget-object v10, v9, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    .line 140
    invoke-static {v8, v9}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Ll/֡᩷ۜ;)V

    .line 141
    invoke-virtual {v2, v8, p2}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 174
    invoke-virtual {v2, v10}, Ll/۠᩷ۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {v9, p1, v10}, Ll/ۜ᩻ۜ;->֫(Ll/֡᩷ۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object p1

    .line 93
    invoke-direct {p0, p1, v6, v7}, Ll/ۜ᩻ۜ;->֫(Ll/֡᩷ۜ;Ll/ᩳ᩻ۜ;Ll/᩶ۨ᩻;)Ll/ܳ᩻ۜ;

    move-result-object p2

    .line 94
    iget-wide v6, p1, Ll/֡᩷ۜ;->ᩳ:J

    .line 117
    iput-wide v6, p2, Ll/ܳ᩻ۜ;->ܺ:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    :try_start_4
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    const/4 v4, 0x1

    goto :goto_4

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 145
    :cond_1
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unable to publish workspace"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v8, v3

    :goto_1
    const/4 v4, 0x1

    goto :goto_2

    .line 80
    :cond_2
    :try_start_6
    invoke-static {v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    move-object v8, v3

    .line 77
    :goto_2
    :try_start_7
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p2

    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :catch_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    move-object v3, v8

    goto :goto_6

    :catch_3
    move-exception p1

    move-object v8, v3

    :goto_4
    if-eqz v8, :cond_3

    .line 104
    invoke-static {v8}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 105
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    :cond_3
    if-eqz v4, :cond_5

    .line 87
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    const-string p1, "Failed to create workspace."

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_5
    const-string p2, "WORKSPACE_CREATE_FAILED"

    const-string v0, "fatal"

    .line 88
    invoke-static {v3, p2, p1, v0}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 110
    throw p1

    .line 108
    :cond_5
    invoke-static {v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    :goto_6
    if-eqz v3, :cond_6

    .line 98
    invoke-static {v3}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 99
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    .line 101
    :cond_6
    throw p1
.end method
