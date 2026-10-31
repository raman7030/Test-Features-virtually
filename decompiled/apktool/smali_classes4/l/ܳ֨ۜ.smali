.class public final Ll/ܳ֨ۜ;
.super Ljava/lang/Object;
.source "I749"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:Ll/ܰܶ֫;

.field public final ۖ:Ljava/util/ArrayList;

.field public volatile ۜ:Z

.field public ۡ:Ll/ۚ֨ۜ;

.field public ۢ:Ll/ܺ᩸֫;

.field public ۧ:Ljava/util/List;

.field public ܳ:I

.field public final synthetic ܺ:Ll/᩻֨ۜ;

.field public ܽ:Ll/᩸۠֫;

.field public ܿ:[B

.field public ᩳ:Ll/ۤۚۜ;

.field public ᩷:Ljava/util/Map;

.field public ᩻:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/᩻֨ۜ;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    .line 150
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܳ֨ۜ;->ۖ:Ljava/util/ArrayList;

    .line 156
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ܳ֨ۜ;->᩷:Ljava/util/Map;

    .line 160
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    return-void
.end method

.method private ֫(Ll/ۗ۠֫;Ll/ܺ᩸֫;Ljava/lang/String;ZLl/ۤۚۜ;)J
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    .line 404
    iget-object v1, v7, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v1}, Ll/᩻֨ۜ;->᩻(Ll/᩻֨ۜ;)Ll/ܶ۠֫;

    move-result-object v2

    invoke-interface {v2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v9

    .line 405
    iput-object v9, v7, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 406
    invoke-direct {v7, v9}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;)V

    .line 408
    invoke-static {v1}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v10

    const/4 v11, 0x0

    if-nez v10, :cond_0

    move-object v12, v11

    goto :goto_0

    .line 410
    :cond_0
    new-instance v2, Ll/ۚ֨ۜ;

    invoke-direct {v2}, Ll/ۚ֨ۜ;-><init>()V

    move-object v12, v2

    .line 412
    :goto_0
    :try_start_0
    invoke-virtual/range {p5 .. p5}, Ll/ۤۚۜ;->᩻()V

    .line 413
    invoke-interface {v9, v8}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v2

    .line 414
    iget-object v13, v8, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {v7, v9, v13}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    const-wide/32 v4, 0x200000

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    if-eqz v12, :cond_c

    .line 417
    iput-object v12, v7, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 418
    iput-object v0, v7, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    return-wide v2

    :cond_1
    const/16 v4, 0x2000

    const v5, 0x200001

    .line 423
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-array v4, v4, [B

    const/4 v14, 0x0

    const/4 v6, 0x0

    .line 426
    :goto_1
    invoke-virtual/range {p5 .. p5}, Ll/ۤۚۜ;->᩻()V

    .line 427
    array-length v15, v4

    if-ne v6, v15, :cond_2

    .line 428
    array-length v15, v4

    mul-int/lit8 v15, v15, 0x2

    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 429
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    .line 431
    :cond_2
    array-length v5, v4

    sub-int/2addr v5, v6

    invoke-interface {v9, v4, v6, v5}, Ll/ۢᩴ֫;->read([BII)I

    move-result v5

    const/4 v15, -0x1

    if-ne v5, v15, :cond_a

    .line 433
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v15

    .line 434
    invoke-direct {v7, v9, v13}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    .line 435
    iput-object v11, v7, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 437
    invoke-static {v9}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 438
    iput-object v15, v7, Ll/ܳ֨ۜ;->ܿ:[B

    .line 439
    iput v14, v7, Ll/ܳ֨ۜ;->ܳ:I

    if-eqz p4, :cond_3

    .line 440
    array-length v2, v15

    if-lez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v10, :cond_7

    .line 442
    new-instance v6, Ll/֡֨ۜ;

    invoke-static {v1}, Ll/᩻֨ۜ;->ܽ(Ll/᩻֨ۜ;)Ll/᩻ۗۜ;

    move-result-object v1

    .line 444
    invoke-interface {v1, v8}, Ll/᩻ۗۜ;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object v2

    .line 447
    iget-object v1, v7, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    if-nez v1, :cond_4

    move-object v5, v13

    goto :goto_3

    :cond_4
    move-object v5, v1

    :goto_3
    move-object v1, v6

    move-object/from16 v3, p3

    move-object v4, v15

    move-object v11, v6

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, Ll/֡֨ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;[BLandroid/net/Uri;Ll/ۗ۠֫;)V

    .line 451
    invoke-virtual {v12}, Ll/ۚ֨ۜ;->֫()Ll/֨֨ۜ;

    move-result-object v1

    .line 450
    invoke-virtual {v10, v1, v11}, Ll/ܶ֨ۜ;->֫(Ll/֨֨ۜ;Ll/֡֨ۜ;)Ljava/util/List;

    move-result-object v1

    .line 453
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 454
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֨ۜ;

    if-ne v3, v11, :cond_5

    move/from16 v14, p4

    goto :goto_4

    .line 458
    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 461
    :cond_6
    iput-object v2, v7, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    move v2, v14

    :cond_7
    if-eqz v2, :cond_9

    .line 465
    iget-object v1, v7, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    if-nez v1, :cond_8

    move-object v5, v13

    goto :goto_5

    :cond_8
    move-object v5, v1

    :goto_5
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v4, v15

    move-object/from16 v6, p5

    .line 464
    invoke-direct/range {v1 .. v6}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;[BLandroid/net/Uri;Ll/ۤۚۜ;)V

    .line 467
    :cond_9
    array-length v0, v15

    int-to-long v0, v0

    return-wide v0

    :cond_a
    if-eqz v5, :cond_e

    if-eqz v12, :cond_b

    .line 473
    invoke-virtual {v12, v6, v5, v4}, Ll/ۚ֨ۜ;->֫(II[B)V

    :cond_b
    add-int/2addr v6, v5

    const/high16 v5, 0x200000

    if-le v6, v5, :cond_d

    .line 477
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, v7, Ll/ܳ֨ۜ;->ܿ:[B

    .line 478
    iput v14, v7, Ll/ܳ֨ۜ;->ܳ:I

    if-eqz v12, :cond_c

    .line 480
    iput-object v12, v7, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 481
    iput-object v0, v7, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    :cond_c
    return-wide v2

    :cond_d
    const v5, 0x200001

    const/4 v11, 0x0

    goto/16 :goto_1

    .line 470
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "HLS playlist upstream returned no data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    .line 487
    :goto_6
    iget-object v1, v8, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {v7, v9, v1}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    .line 885
    iget-object v1, v7, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    const/4 v2, 0x0

    .line 886
    iput-object v2, v7, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 887
    invoke-static {v1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 489
    throw v0
.end method

.method private ֫(Ll/ܺ᩸֫;Ljava/lang/String;Ll/ۗ۠֫;Z)Ll/۟ۚۜ;
    .locals 8

    const/4 v0, 0x0

    .line 508
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v1

    .line 509
    invoke-direct {p0, v1}, Ll/ܳ֨ۜ;->֫(Ll/ۜ᩸֫;)Ll/ܰۚۜ;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 510
    invoke-static {v1}, Ll/ܰۚۜ;->֫(Ll/ܰۚۜ;)J

    move-result-wide v6

    const-wide/16 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v2 .. v7}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 513
    :cond_0
    new-instance v2, Ll/ۗܶ֫;

    invoke-direct {v2}, Ll/ۗܶ֫;-><init>()V

    .line 514
    invoke-virtual {v2, p1}, Ll/ۗܶ֫;->֫(Ll/ܺ᩸֫;)V

    .line 515
    invoke-virtual {v2, v0}, Ll/ۗܶ֫;->֫(Ll/ܶ۠֫;)V

    .line 516
    invoke-virtual {v2, v0}, Ll/ۗܶ֫;->֫(Ll/᩶ܶ֫;)V

    new-instance p1, Ll/ᩳ֨ۜ;

    invoke-direct {p1, p2}, Ll/ᩳ֨ۜ;-><init>(Ljava/lang/String;)V

    .line 517
    invoke-virtual {v2, p1}, Ll/ۗܶ֫;->֫(Ll/ۨܶ֫;)V

    const/4 p1, 0x0

    .line 518
    invoke-virtual {v2, p1}, Ll/ۗܶ֫;->֫(I)V

    .line 519
    invoke-virtual {v2}, Ll/ۗܶ֫;->ۧ()V

    .line 520
    invoke-virtual {v2}, Ll/ۗܶ֫;->֫()Ll/۬ܶ֫;

    move-result-object v2

    if-eqz p4, :cond_1

    .line 522
    invoke-direct {p0, v2}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;)V

    .line 524
    :cond_1
    invoke-static {v1}, Ll/ܰۚۜ;->֫(Ll/ܰۚۜ;)J

    move-result-wide v3

    long-to-int p4, v3

    new-array v3, p4, [B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 526
    :try_start_1
    invoke-virtual {p3}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object p3

    .line 527
    invoke-virtual {p3, p2}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܰۚۜ;->֫(Ll/ܰۚۜ;)J

    move-result-wide v4

    .line 528
    invoke-virtual {p3, v4, v5}, Ll/ۙ۠֫;->֫(J)V

    .line 529
    invoke-virtual {p3}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p2

    .line 526
    invoke-virtual {v2, p2}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;)J

    :goto_0
    if-ge p1, p4, :cond_4

    sub-int p2, p4, p1

    .line 532
    invoke-virtual {v2, v3, p1, p2}, Ll/۬ܶ֫;->read([BII)I

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    if-nez p2, :cond_3

    .line 542
    :goto_1
    :try_start_2
    invoke-static {v2}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    return-object v0

    :cond_3
    add-int/2addr p1, p2

    goto :goto_0

    :cond_4
    invoke-static {v2}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 544
    invoke-static {v1}, Ll/ܰۚۜ;->ܽ(Ll/ܰۚۜ;)Ljava/lang/String;

    move-result-object p1

    .line 893
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p2

    invoke-static {p2}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p2

    .line 544
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 545
    new-instance p1, Ll/۟ۚۜ;

    invoke-static {v1}, Ll/ܰۚۜ;->ۧ(Ll/ܰۚۜ;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {p1, p2, v3}, Ll/۟ۚۜ;-><init>(Landroid/net/Uri;[B)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 542
    invoke-static {v2}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 543
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_5
    :goto_2
    return-object v0
.end method

.method private ֫(Ll/ۜ᩸֫;)Ll/ܰۚۜ;
    .locals 16

    move-object/from16 v0, p1

    const-wide/high16 v1, -0x8000000000000000L

    const-string v3, "mt.hls.schema"

    .line 554
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v3

    move-object/from16 v5, p0

    iget-object v6, v5, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v6}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܽ֨ۜ;->֫()J

    move-result-wide v7

    cmp-long v9, v3, v7

    if-nez v9, :cond_6

    const-string v3, "mt.hls.complete"

    .line 555
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v3

    const-wide/16 v7, 0x1

    cmp-long v9, v3, v7

    if-eqz v9, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v3, "mt.hls.body_length"

    .line 558
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v3

    const-string v7, "mt.hls.sha256"

    .line 559
    invoke-virtual {v0, v7}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "mt.hls.final_uri"

    .line 560
    invoke-virtual {v0, v8}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-wide/16 v9, 0x0

    cmp-long v11, v3, v9

    if-lez v11, :cond_6

    const-wide/32 v11, 0x200000

    cmp-long v13, v3, v11

    if-gtz v13, :cond_6

    if-eqz v7, :cond_6

    if-nez v8, :cond_1

    goto :goto_0

    .line 565
    :cond_1
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 566
    invoke-static {v6}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v11

    invoke-virtual {v11, v8}, Ll/ܽ֨ۜ;->֫(Landroid/net/Uri;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    const-string v11, "mt.hls.created_at_ms"

    .line 569
    invoke-virtual {v0, v11}, Ll/ۜ᩸֫;->֫(Ljava/lang/String;)Z

    move-result v12

    const-string v13, "mt.hls.expires_at_ms"

    .line 570
    invoke-virtual {v0, v13}, Ll/ۜ᩸֫;->֫(Ljava/lang/String;)Z

    move-result v14

    const-string v15, "mt.hls.stream_type"

    .line 571
    invoke-virtual {v0, v15}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 572
    invoke-static {v6}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v9

    sget-object v10, Ll/ܽ֨ۜ;->᩹:Ll/ܽ֨ۜ;

    if-ne v9, v10, :cond_4

    if-eqz v12, :cond_6

    if-eqz v14, :cond_6

    const-string v9, "vod"

    .line 574
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_0

    .line 577
    :cond_3
    invoke-virtual {v0, v1, v2, v11}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v9

    .line 578
    invoke-virtual {v0, v1, v2, v13}, Ll/ۜ᩸֫;->֫(JLjava/lang/String;)J

    move-result-wide v0

    .line 579
    invoke-static {v6}, Ll/᩻֨ۜ;->֫(Ll/᩻֨ۜ;)Ljava/util/function/LongSupplier;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/function/LongSupplier;->getAsLong()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v2, v9, v13

    if-ltz v2, :cond_6

    cmp-long v2, v0, v9

    if-lez v2, :cond_6

    cmp-long v2, v11, v9

    if-ltz v2, :cond_6

    cmp-long v2, v11, v0

    if-ltz v2, :cond_5

    goto :goto_0

    :cond_4
    if-nez v12, :cond_6

    if-nez v14, :cond_6

    if-eqz v15, :cond_5

    goto :goto_0

    .line 586
    :cond_5
    new-instance v0, Ll/ܰۚۜ;

    invoke-direct {v0, v3, v4, v8, v7}, Ll/ܰۚۜ;-><init>(JLandroid/net/Uri;Ljava/lang/String;)V

    return-object v0

    :cond_6
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private ֫(Ll/ܺ᩸֫;Ljava/lang/String;[BLandroid/net/Uri;Ll/ۤۚۜ;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v0, p3

    .line 613
    :try_start_0
    iget-object v2, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v2

    sget-object v10, Ll/ܽ֨ۜ;->᩹:Ll/ܽ֨ۜ;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    if-ne v2, v10, :cond_3

    .line 614
    iget-object v2, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->֫(Ll/᩻֨ۜ;)Ljava/util/function/LongSupplier;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/function/LongSupplier;->getAsLong()J

    move-result-wide v6

    const-wide/32 v11, 0x493e0

    add-long v13, v6, v11

    xor-long/2addr v11, v6

    const/4 v2, 0x1

    cmp-long v15, v11, v4

    if-gez v15, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    :goto_0
    xor-long v15, v6, v13

    cmp-long v12, v15, v4

    if-ltz v12, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    or-int/2addr v2, v11

    if-eqz v2, :cond_2

    move-wide v11, v6

    goto :goto_2

    .line 0
    :cond_2
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_3
    move-wide v11, v4

    move-wide v13, v11

    .line 680
    :goto_2
    iget-object v2, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v2

    if-nez v2, :cond_4

    const-wide/16 v4, -0x1

    move-wide v6, v4

    goto :goto_3

    .line 684
    :cond_4
    invoke-virtual {v2}, Ll/ܶ֨ۜ;->ܳ()J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-ltz v2, :cond_e

    .line 618
    :goto_3
    invoke-virtual/range {p5 .. p5}, Ll/ۤۚۜ;->᩻()V

    .line 619
    new-instance v2, Ll/᩶ܶ֫;

    .line 56
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 620
    invoke-virtual {v2, v8}, Ll/᩶ܶ֫;->֫(Ll/᩸ܶ֫;)V

    .line 622
    new-instance v4, Ll/ۗܶ֫;

    invoke-direct {v4}, Ll/ۗܶ֫;-><init>()V

    .line 623
    invoke-virtual {v4, v8}, Ll/ۗܶ֫;->֫(Ll/ܺ᩸֫;)V

    new-instance v5, Ll/ܿ֨ۜ;

    invoke-direct {v5, v0}, Ll/ܿ֨ۜ;-><init>([B)V

    .line 624
    invoke-virtual {v4, v5}, Ll/ۗܶ֫;->֫(Ll/ܶ۠֫;)V

    .line 625
    invoke-virtual {v4, v2}, Ll/ۗܶ֫;->֫(Ll/᩶ܶ֫;)V

    new-instance v2, Ll/ᩳ֨ۜ;

    invoke-direct {v2, v9}, Ll/ᩳ֨ۜ;-><init>(Ljava/lang/String;)V

    .line 626
    invoke-virtual {v4, v2}, Ll/ۗܶ֫;->֫(Ll/ۨܶ֫;)V

    .line 627
    invoke-virtual {v4, v3}, Ll/ۗܶ֫;->֫(I)V

    .line 628
    invoke-virtual {v4}, Ll/ۗܶ֫;->ۧ()V

    .line 629
    invoke-virtual {v4}, Ll/ۗܶ֫;->֫()Ll/۬ܶ֫;

    move-result-object v2

    .line 630
    new-instance v3, Ll/ۙ۠֫;

    invoke-direct {v3}, Ll/ۙ۠֫;-><init>()V

    invoke-static {}, Ll/᩻֨ۜ;->ۧ()Landroid/net/Uri;

    move-result-object v4

    .line 631
    invoke-virtual {v3, v4}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 632
    invoke-virtual {v3, v9}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    array-length v4, v0

    int-to-long v4, v4

    .line 633
    invoke-virtual {v3, v4, v5}, Ll/ۙ۠֫;->֫(J)V

    .line 634
    invoke-virtual {v3}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v3

    .line 635
    new-instance v4, Ll/ܰܶ֫;

    invoke-direct {v4, v2, v3}, Ll/ܰܶ֫;-><init>(Ll/۬ܶ֫;Ll/ۗ۠֫;)V

    .line 636
    iput-object v4, v1, Ll/ܳ֨ۜ;->֫:Ll/ܰܶ֫;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v2, 0x0

    .line 638
    :try_start_1
    invoke-virtual {v4}, Ll/ܰܶ֫;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 640
    :try_start_2
    iput-object v2, v1, Ll/ܳ֨ۜ;->֫:Ll/ܰܶ֫;

    .line 642
    invoke-virtual/range {p5 .. p5}, Ll/ۤۚۜ;->᩻()V

    .line 643
    array-length v2, v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    int-to-long v4, v2

    const-wide/16 v15, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v17, v4

    move-wide v4, v15

    move-wide v8, v6

    move-wide/from16 v6, v17

    :try_start_3
    invoke-virtual/range {v2 .. v7}, Ll/ܺ᩸֫;->ܳ(Ljava/lang/String;JJ)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 693
    iget-object v2, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 694
    invoke-virtual {v2, v8, v9}, Ll/ܶ֨ۜ;->ۧ(J)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    .line 695
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache state changed while publishing"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 647
    :cond_6
    :goto_4
    new-instance v2, Ll/᩻᩸֫;

    invoke-direct {v2}, Ll/᩻᩸֫;-><init>()V

    const-string v3, "mt.hls.schema"

    iget-object v4, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v4}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v4

    .line 648
    invoke-virtual {v4}, Ll/ܽ֨ۜ;->֫()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5, v3}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    const-string v3, "mt.hls.complete"

    const-wide/16 v4, 0x1

    .line 649
    invoke-virtual {v2, v4, v5, v3}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    const-string v3, "mt.hls.body_length"

    array-length v4, v0

    int-to-long v4, v4

    .line 650
    invoke-virtual {v2, v4, v5, v3}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    const-string v3, "mt.hls.sha256"

    .line 893
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    .line 651
    invoke-virtual {v2, v3, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt.hls.final_uri"

    .line 652
    invoke-virtual/range {p4 .. p4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    iget-object v0, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v0}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v0

    if-ne v0, v10, :cond_7

    const-string v0, "mt.hls.created_at_ms"

    .line 654
    invoke-virtual {v2, v11, v12, v0}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    const-string v0, "mt.hls.expires_at_ms"

    .line 655
    invoke-virtual {v2, v13, v14, v0}, Ll/᩻᩸֫;->֫(JLjava/lang/String;)V

    const-string v0, "mt.hls.stream_type"

    const-string v3, "vod"

    .line 656
    invoke-virtual {v2, v0, v3}, Ll/᩻᩸֫;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    const-string v0, "mt.hls.created_at_ms"

    .line 658
    invoke-virtual {v2, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v0, "mt.hls.expires_at_ms"

    .line 659
    invoke-virtual {v2, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v0, "mt.hls.stream_type"

    .line 660
    invoke-virtual {v2, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    .line 662
    :goto_5
    iget-object v0, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v0}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    if-nez v0, :cond_8

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-wide v6, v8

    .line 664
    :try_start_4
    invoke-virtual {v3, v4, v2}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V

    goto :goto_6

    :cond_8
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-wide v6, v8

    move-object/from16 v16, v0

    .line 0
    monitor-enter v16
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 152
    :try_start_5
    invoke-virtual {v0, v6, v7}, Ll/ܶ֨ۜ;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 666
    invoke-virtual {v3, v4, v2}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 156
    :try_start_6
    monitor-exit v16

    .line 693
    :goto_6
    iget-object v0, v1, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v0}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 694
    invoke-virtual {v0, v6, v7}, Ll/ܶ֨ۜ;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    .line 695
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache state changed while publishing"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 670
    :cond_a
    :goto_7
    invoke-virtual/range {p1 .. p2}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܳ֨ۜ;->֫(Ll/ۜ᩸֫;)Ll/ܰۚۜ;

    move-result-object v0

    if-eqz v0, :cond_b

    goto :goto_9

    .line 671
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache metadata was not published"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 153
    :cond_c
    monitor-exit v16

    .line 667
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache state changed before publishing"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2

    :catchall_0
    move-exception v0

    .line 156
    :try_start_7
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v0

    :cond_d
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 644
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache write was incomplete"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v3, v8

    move-object v4, v9

    move-object v5, v0

    .line 640
    iput-object v2, v1, Ll/ܳ֨ۜ;->֫:Ll/ܰܶ֫;

    .line 641
    throw v5

    :cond_e
    move-object v3, v8

    move-object v4, v9

    .line 686
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HLS playlist cache was disabled for this stream"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_1
    move-object v3, v8

    move-object v4, v9

    .line 756
    :catch_2
    :goto_8
    :try_start_9
    invoke-static {}, Ll/ܳ֨ۜ;->ܳ()Ll/᩻᩸֫;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_3

    .line 761
    :catch_3
    :try_start_a
    invoke-virtual/range {p1 .. p2}, Ll/ܺ᩸֫;->ܽ(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4

    :catch_4
    :goto_9
    return-void
.end method

.method private ֫(Ll/ܺ᩸֫;Ljava/util/List;)V
    .locals 11

    .line 705
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v0}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 706
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 709
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡֨ۜ;

    .line 710
    iget-boolean v2, p0, Ll/ܳ֨ۜ;->ۜ:Z

    if-nez v2, :cond_9

    invoke-virtual {v0}, Ll/ܶ֨ۜ;->ᩳ()Ll/۠֨ۜ;

    move-result-object v2

    sget-object v3, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-eq v2, v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const/4 v2, 0x0

    .line 715
    :try_start_0
    iget-object v3, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v3}, Ll/᩻֨ۜ;->ۧ(Ll/᩻֨ۜ;)Ll/ۨۚۜ;

    move-result-object v3

    invoke-virtual {v1}, Ll/֡֨ۜ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۨۚۜ;->֫(Ljava/lang/String;)Ll/ۤۚۜ;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 716
    :try_start_1
    iput-object v3, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 717
    invoke-virtual {v3}, Ll/ۤۚۜ;->֫()V

    .line 720
    :cond_3
    invoke-virtual {v1}, Ll/֡֨ۜ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ll/֡֨ۜ;->ܳ()Ll/ۗ۠֫;

    move-result-object v5

    const/4 v6, 0x0

    .line 719
    invoke-direct {p0, p1, v4, v5, v6}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;Ll/ۗ۠֫;Z)Ll/۟ۚۜ;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 722
    invoke-virtual {v4}, Ll/۟ۚۜ;->֫()[B

    move-result-object v5

    invoke-virtual {v1}, Ll/֡֨ۜ;->֫()[B

    move-result-object v6

    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 723
    invoke-virtual {v4}, Ll/۟ۚۜ;->ܽ()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v1}, Ll/֡֨ۜ;->ܽ()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 724
    invoke-virtual {v3}, Ll/ۤۚۜ;->ܽ()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    nop

    goto :goto_3

    .line 727
    :cond_4
    invoke-virtual {v3}, Ll/ۤۚۜ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 728
    invoke-virtual {v1}, Ll/֡֨ۜ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 729
    invoke-virtual {v0}, Ll/ܶ֨ۜ;->ᩳ()Ll/۠֨ۜ;

    move-result-object v4

    sget-object v5, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-ne v4, v5, :cond_5

    .line 731
    invoke-virtual {v1}, Ll/֡֨ۜ;->᩻()Ljava/lang/String;

    move-result-object v7

    .line 732
    invoke-virtual {v1}, Ll/֡֨ۜ;->֫()[B

    move-result-object v8

    .line 733
    invoke-virtual {v1}, Ll/֡֨ۜ;->ܽ()Landroid/net/Uri;

    move-result-object v9

    move-object v5, p0

    move-object v6, p1

    move-object v10, v3

    .line 730
    invoke-direct/range {v5 .. v10}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;[BLandroid/net/Uri;Ll/ۤۚۜ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 743
    :cond_5
    :goto_1
    invoke-virtual {v3}, Ll/ۤۚۜ;->ᩳ()V

    .line 744
    invoke-virtual {v3}, Ll/ۤۚۜ;->close()V

    .line 746
    iget-object v1, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-ne v1, v3, :cond_1

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_6

    .line 743
    invoke-virtual {v3}, Ll/ۤۚۜ;->ᩳ()V

    .line 744
    invoke-virtual {v3}, Ll/ۤۚۜ;->close()V

    .line 746
    :cond_6
    iget-object p2, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-ne p2, v3, :cond_7

    .line 747
    iput-object v2, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 749
    :cond_7
    throw p1

    :catch_1
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_8

    .line 743
    invoke-virtual {v3}, Ll/ۤۚۜ;->ᩳ()V

    .line 744
    invoke-virtual {v3}, Ll/ۤۚۜ;->close()V

    .line 746
    :cond_8
    iget-object v1, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-ne v1, v3, :cond_1

    .line 747
    :goto_4
    iput-object v2, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    goto/16 :goto_0

    :cond_9
    :goto_5
    return-void
.end method

.method private ֫(Ll/᩸۠֫;)V
    .locals 2

    .line 784
    iget-object v0, p0, Ll/ܳ֨ۜ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܶ֫;

    .line 785
    invoke-interface {p1, v1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/᩸۠֫;Landroid/net/Uri;)V
    .locals 3

    .line 790
    invoke-interface {p1}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 791
    :goto_0
    iput-object p2, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    .line 792
    invoke-interface {p1}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object p1

    .line 899
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 900
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_2

    .line 902
    :cond_1
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 903
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 904
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 906
    :cond_2
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 792
    :goto_2
    iput-object p1, p0, Ll/ܳ֨ۜ;->᩷:Ljava/util/Map;

    return-void
.end method

.method public static ֫(Ll/ܺ᩸֫;Ljava/lang/String;)Z
    .locals 2

    .line 592
    :try_start_0
    invoke-static {}, Ll/ܳ֨ۜ;->ܳ()Ll/᩻᩸֫;

    move-result-object v0

    .line 593
    invoke-virtual {p0, p1, v0}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V

    .line 594
    invoke-virtual {p0, p1}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v0

    const-string v1, "mt.hls.complete"

    invoke-virtual {v0, v1}, Ll/ۜ᩸֫;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 597
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܺ᩸֫;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۧ(Ll/ۗ۠֫;)J
    .locals 4

    .line 383
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v0}, Ll/᩻֨ۜ;->᩻(Ll/᩻֨ۜ;)Ll/ܶ۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v0

    .line 384
    iput-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 385
    invoke-direct {p0, v0}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;)V

    .line 387
    :try_start_0
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v1

    .line 388
    iget-object v3, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {p0, v0, v3}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 391
    :goto_0
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {p0, v0, p1}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    .line 885
    iget-object p1, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    const/4 v0, 0x0

    .line 886
    iput-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 887
    invoke-static {p1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 393
    throw v1
.end method

.method public static ܳ()Ll/᩻᩸֫;
    .locals 3

    .line 769
    new-instance v0, Ll/᩻᩸֫;

    invoke-direct {v0}, Ll/᩻᩸֫;-><init>()V

    const-string v1, "mt.hls.schema"

    .line 770
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.complete"

    .line 771
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.body_length"

    .line 772
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.sha256"

    .line 773
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.final_uri"

    .line 774
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.created_at_ms"

    .line 775
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.expires_at_ms"

    .line 776
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-string v1, "mt.hls.stream_type"

    .line 777
    invoke-virtual {v0, v1}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    const-wide/16 v1, -0x1

    .line 778
    invoke-static {v0, v1, v2}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;J)V

    const/4 v1, 0x0

    .line 779
    invoke-static {v0, v1}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;Landroid/net/Uri;)V

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x1

    .line 860
    iput-boolean v0, p0, Ll/ܳ֨ۜ;->ۜ:Z

    .line 861
    iget-object v0, p0, Ll/ܳ֨ۜ;->֫:Ll/ܰܶ֫;

    if-eqz v0, :cond_0

    .line 863
    invoke-virtual {v0}, Ll/ܰܶ֫;->ۧ()V

    .line 865
    :cond_0
    iget-object v0, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    const/4 v1, 0x0

    .line 866
    iput-object v1, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-eqz v0, :cond_1

    .line 868
    invoke-virtual {v0}, Ll/ۤۚۜ;->close()V

    .line 870
    :cond_1
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 871
    iput-object v1, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 872
    iput-object v1, p0, Ll/ܳ֨ۜ;->ܿ:[B

    const/4 v2, 0x0

    .line 873
    iput v2, p0, Ll/ܳ֨ۜ;->ܳ:I

    .line 874
    iput-object v1, p0, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 875
    iput-object v1, p0, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    .line 876
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 877
    iput-object v1, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    .line 878
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v1, p0, Ll/ܳ֨ۜ;->᩷:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 880
    invoke-interface {v0}, Ll/᩸۠֫;->close()V

    :cond_2
    return-void
.end method

.method public final read([BII)I
    .locals 3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 800
    :cond_0
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܿ:[B

    if-eqz v0, :cond_1

    .line 801
    iget v1, p0, Ll/ܳ֨ۜ;->ܳ:I

    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 802
    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 803
    iget v1, p0, Ll/ܳ֨ۜ;->ܳ:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 804
    iget p1, p0, Ll/ܳ֨ۜ;->ܳ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܳ֨ۜ;->ܳ:I

    return p3

    .line 807
    :cond_1
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    .line 809
    invoke-interface {v0, p1, p2, p3}, Ll/ۢᩴ֫;->read([BII)I

    move-result p3

    .line 810
    iget-object v0, p0, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    if-eqz v0, :cond_4

    if-ne p3, v1, :cond_3

    const/4 p1, 0x0

    .line 829
    iput-object p1, p0, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 830
    iget-object p2, p0, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    .line 831
    iput-object p1, p0, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    .line 832
    iget-object v1, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v1}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 837
    :cond_2
    invoke-virtual {v0}, Ll/ۚ֨ۜ;->֫()Ll/֨֨ۜ;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Ll/ܶ֨ۜ;->֫(Ll/֨֨ۜ;Ll/֡֨ۜ;)Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_4

    .line 839
    invoke-direct {p0, p2, p1}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/util/List;)V

    return p3

    :cond_3
    if-lez p3, :cond_4

    .line 815
    invoke-virtual {v0, p2, p3, p1}, Ll/ۚ֨ۜ;->֫(II[B)V

    :cond_4
    :goto_0
    return p3

    :cond_5
    return v1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 14

    .line 177
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    if-nez v0, :cond_18

    iget-object v0, p0, Ll/ܳ֨ۜ;->ܿ:[B

    if-nez v0, :cond_18

    const/4 v0, 0x0

    .line 181
    iput-boolean v0, p0, Ll/ܳ֨ۜ;->ۜ:Z

    .line 182
    iget-object v1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iput-object v1, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    .line 183
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v1, p0, Ll/ܳ֨ۜ;->᩷:Ljava/util/Map;

    .line 184
    iget-wide v1, p1, Ll/ۗ۠֫;->᩻:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_17

    iget-wide v1, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    goto/16 :goto_7

    .line 188
    :cond_0
    iget-object v1, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v1}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    .line 189
    iget-object v2, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v2

    sget-object v3, Ll/ܽ֨ۜ;->᩹:Ll/ܽ֨ۜ;

    const/4 v4, 0x1

    const-string v5, "hls-playlist:"

    const/4 v6, 0x0

    if-ne v2, v3, :cond_11

    if-eqz v1, :cond_11

    .line 190
    invoke-virtual {v1}, Ll/ܶ֨ۜ;->ᩳ()Ll/۠֨ۜ;

    move-result-object v2

    .line 191
    sget-object v3, Ll/۠֨ۜ;->᩹:Ll/۠֨ۜ;

    if-ne v2, v3, :cond_1

    .line 192
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 194
    :cond_1
    sget-object v7, Ll/۠֨ۜ;->᩶:Ll/۠֨ۜ;

    if-ne v2, v7, :cond_11

    .line 248
    iget-object v2, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ܿ(Ll/᩻֨ۜ;)Ll/᩻۬ۜ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 252
    iget-object v7, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v7}, Ll/᩻֨ۜ;->ܽ(Ll/᩻֨ۜ;)Ll/᩻ۗۜ;

    move-result-object v7

    invoke-interface {v7, p1}, Ll/᩻ۗۜ;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object v7

    .line 253
    iget-object v8, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v8}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/ܽ֨ۜ;->֫(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 0
    invoke-static {v5, v7}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v10, v5

    move-object v9, v7

    goto :goto_0

    :cond_2
    move-object v9, v6

    move-object v10, v9

    :goto_0
    if-eqz v2, :cond_7

    if-eqz v9, :cond_7

    if-eqz v10, :cond_7

    .line 285
    iget-object v5, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v5}, Ll/᩻֨ۜ;->ۧ(Ll/᩻֨ۜ;)Ll/ۨۚۜ;

    move-result-object v5

    invoke-virtual {v5, v9}, Ll/ۨۚۜ;->֫(Ljava/lang/String;)Ll/ۤۚۜ;

    move-result-object v5

    .line 286
    iput-object v5, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 288
    :try_start_0
    invoke-virtual {v5}, Ll/ۤۚۜ;->֫()V

    .line 498
    invoke-direct {p0, v2, v10, p1, v4}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;Ll/ۗ۠֫;Z)Ll/۟ۚۜ;

    move-result-object v4

    .line 290
    invoke-virtual {v5}, Ll/ۤۚۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    invoke-virtual {v5}, Ll/ۤۚۜ;->close()V

    .line 294
    iget-object v7, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-ne v7, v5, :cond_3

    .line 295
    iput-object v6, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    :cond_3
    if-eqz v4, :cond_5

    .line 262
    invoke-virtual {v1}, Ll/ܶ֨ۜ;->֫()Z

    move-result v3

    if-nez v3, :cond_4

    .line 263
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 265
    :cond_4
    invoke-static {v4}, Ll/۟ۚۜ;->֫(Ll/۟ۚۜ;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۜ;->ܿ:[B

    .line 266
    invoke-static {v4}, Ll/۟ۚۜ;->ۧ(Ll/۟ۚۜ;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    .line 267
    iput v0, p0, Ll/ܳ֨ۜ;->ܳ:I

    .line 268
    invoke-virtual {v1}, Ll/ܶ֨ۜ;->ܽ()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/util/List;)V

    .line 269
    invoke-static {v4}, Ll/۟ۚۜ;->֫(Ll/۟ۚۜ;)[B

    move-result-object p1

    array-length p1, p1

    int-to-long v0, p1

    return-wide v0

    .line 271
    :cond_5
    invoke-virtual {v1}, Ll/ܶ֨ۜ;->ᩳ()Ll/۠֨ۜ;

    move-result-object v4

    if-ne v4, v3, :cond_7

    .line 272
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    :catchall_0
    move-exception p1

    .line 293
    invoke-virtual {v5}, Ll/ۤۚۜ;->close()V

    .line 294
    iget-object v0, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    if-ne v0, v5, :cond_6

    .line 295
    iput-object v6, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 297
    :cond_6
    throw p1

    .line 307
    :cond_7
    iget-object v3, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v3}, Ll/᩻֨ۜ;->᩻(Ll/᩻֨ۜ;)Ll/ܶ۠֫;

    move-result-object v3

    invoke-interface {v3}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v3

    .line 308
    iput-object v3, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 309
    invoke-direct {p0, v3}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;)V

    .line 310
    new-instance v4, Ll/ۚ֨ۜ;

    invoke-direct {v4}, Ll/ۚ֨ۜ;-><init>()V

    .line 313
    :try_start_1
    invoke-interface {v3, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v7

    .line 314
    iget-object v5, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {p0, v3, v5}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    const-wide/32 v11, 0x200000

    cmp-long v5, v7, v11

    if-lez v5, :cond_8

    .line 317
    iput-object v4, p0, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 318
    iput-object v2, p0, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    return-wide v7

    :cond_8
    const/16 v5, 0x2000

    const v11, 0x200001

    .line 323
    invoke-static {v5, v11}, Ljava/lang/Math;->min(II)I

    move-result v5

    new-array v5, v5, [B

    const/4 v12, 0x0

    .line 326
    :goto_1
    iget-boolean v13, p0, Ll/ܳ֨ۜ;->ۜ:Z

    if-nez v13, :cond_10

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v13

    if-nez v13, :cond_10

    .line 330
    array-length v13, v5

    if-ne v12, v13, :cond_9

    .line 331
    array-length v13, v5

    mul-int/lit8 v13, v13, 0x2

    invoke-static {v11, v13}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 332
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 334
    :cond_9
    array-length v11, v5

    sub-int/2addr v11, v12

    invoke-interface {v3, v5, v12, v11}, Ll/ۢᩴ֫;->read([BII)I

    move-result v11

    const/4 v13, -0x1

    if-ne v11, v13, :cond_d

    .line 336
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 337
    iget-object v7, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {p0, v3, v7}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    .line 338
    iput-object v6, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 339
    invoke-static {v3}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 340
    iput-object v5, p0, Ll/ܳ֨ۜ;->ܿ:[B

    .line 341
    iput v0, p0, Ll/ܳ֨ۜ;->ܳ:I

    if-eqz v2, :cond_b

    if-eqz v9, :cond_b

    if-eqz v10, :cond_b

    .line 343
    array-length v0, v5

    if-lez v0, :cond_b

    .line 345
    new-instance v0, Ll/֡֨ۜ;

    .line 349
    iget-object v7, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    if-nez v7, :cond_a

    iget-object v7, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    :cond_a
    move-object v12, v7

    move-object v8, v0

    move-object v11, v5

    move-object v13, p1

    invoke-direct/range {v8 .. v13}, Ll/֡֨ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;[BLandroid/net/Uri;Ll/ۗ۠֫;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_b
    move-object v0, v6

    .line 353
    :goto_2
    invoke-virtual {v4}, Ll/ۚ֨ۜ;->֫()Ll/֨֨ۜ;

    move-result-object v4

    invoke-virtual {v1, v4, v0}, Ll/ܶ֨ۜ;->֫(Ll/֨֨ۜ;Ll/֡֨ۜ;)Ljava/util/List;

    move-result-object v0

    if-eqz v2, :cond_c

    .line 355
    invoke-direct {p0, v2, v0}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/util/List;)V

    .line 357
    :cond_c
    array-length p1, v5

    int-to-long v0, p1

    return-wide v0

    :cond_d
    if-eqz v11, :cond_f

    .line 362
    invoke-virtual {v4, v12, v11, v5}, Ll/ۚ֨ۜ;->֫(II[B)V

    add-int/2addr v12, v11

    const/high16 v11, 0x200000

    if-le v12, v11, :cond_e

    .line 365
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, p0, Ll/ܳ֨ۜ;->ܿ:[B

    .line 366
    iput v0, p0, Ll/ܳ֨ۜ;->ܳ:I

    .line 368
    iput-object v4, p0, Ll/ܳ֨ۜ;->ۡ:Ll/ۚ֨ۜ;

    .line 369
    iput-object v2, p0, Ll/ܳ֨ۜ;->ۢ:Ll/ܺ᩸֫;

    return-wide v7

    :cond_e
    const v11, 0x200001

    goto :goto_1

    .line 360
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "HLS playlist upstream returned no data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 327
    :cond_10
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Interrupted while loading HLS playlist"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 375
    :goto_3
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-direct {p0, v3, p1}, Ll/ܳ֨ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)V

    .line 885
    iget-object p1, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 886
    iput-object v6, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 887
    invoke-static {p1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 377
    throw v0

    .line 199
    :cond_11
    iget-object v1, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v1}, Ll/᩻֨ۜ;->ܿ(Ll/᩻֨ۜ;)Ll/᩻۬ۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻۬ۜ;->ᩳ()Ll/ܺ᩸֫;

    move-result-object v1

    if-nez v1, :cond_12

    .line 201
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 203
    :cond_12
    iget-object v2, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v2}, Ll/᩻֨ۜ;->ܽ(Ll/᩻֨ۜ;)Ll/᩻ۗۜ;

    move-result-object v2

    invoke-interface {v2, p1}, Ll/᩻ۗۜ;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object v2

    .line 204
    iget-object v3, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v3}, Ll/᩻֨ۜ;->ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ܽ֨ۜ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_13

    .line 205
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 0
    :cond_13
    invoke-static {v5, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 208
    iget-object v3, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {v3}, Ll/᩻֨ۜ;->ۧ(Ll/᩻֨ۜ;)Ll/ۨۚۜ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۨۚۜ;->֫(Ljava/lang/String;)Ll/ۤۚۜ;

    move-result-object v2

    .line 209
    iput-object v2, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 211
    :try_start_2
    invoke-virtual {v2}, Ll/ۤۚۜ;->֫()V

    .line 498
    :cond_14
    invoke-direct {p0, v1, v10, p1, v4}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;Ll/ۗ۠֫;Z)Ll/۟ۚۜ;

    move-result-object v3

    if-eqz v3, :cond_16

    .line 215
    invoke-virtual {v2}, Ll/ۤۚۜ;->ܽ()V

    .line 216
    iget-object p1, p0, Ll/ܳ֨ۜ;->ܺ:Ll/᩻֨ۜ;

    invoke-static {p1}, Ll/᩻֨ۜ;->ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;

    move-result-object p1

    if-eqz p1, :cond_15

    .line 218
    invoke-virtual {p1}, Ll/ܶ֨ۜ;->ܽ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 220
    :cond_15
    invoke-static {v3}, Ll/۟ۚۜ;->֫(Ll/۟ۚۜ;)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۜ;->ܿ:[B

    .line 221
    invoke-static {v3}, Ll/۟ۚۜ;->ۧ(Ll/۟ۚۜ;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    .line 222
    iput v0, p0, Ll/ܳ֨ۜ;->ܳ:I

    .line 223
    invoke-static {v3}, Ll/۟ۚۜ;->֫(Ll/۟ۚۜ;)[B

    move-result-object p1

    array-length p1, p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    int-to-long v3, p1

    .line 236
    :goto_4
    invoke-virtual {v2}, Ll/ۤۚۜ;->ᩳ()V

    .line 237
    invoke-virtual {v2}, Ll/ۤۚۜ;->close()V

    .line 238
    iput-object v6, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 239
    iget-object p1, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 240
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 241
    invoke-direct {p0, v1, p1}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/util/List;)V

    return-wide v3

    .line 225
    :cond_16
    :try_start_3
    invoke-virtual {v2}, Ll/ۤۚۜ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 230
    invoke-static {v1, v10}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/lang/String;)Z

    move-result v11

    move-object v7, p0

    move-object v8, p1

    move-object v9, v1

    move-object v12, v2

    .line 231
    invoke-direct/range {v7 .. v12}, Ll/ܳ֨ۜ;->֫(Ll/ۗ۠֫;Ll/ܺ᩸֫;Ljava/lang/String;ZLl/ۤۚۜ;)J

    move-result-wide v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catch_2
    move-exception p1

    goto :goto_5

    :catch_3
    move-exception p1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 885
    :goto_5
    :try_start_4
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 886
    iput-object v6, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    .line 887
    invoke-static {v0}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 234
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 236
    :goto_6
    invoke-virtual {v2}, Ll/ۤۚۜ;->ᩳ()V

    .line 237
    invoke-virtual {v2}, Ll/ۤۚۜ;->close()V

    .line 238
    iput-object v6, p0, Ll/ܳ֨ۜ;->ᩳ:Ll/ۤۚۜ;

    .line 239
    iget-object v0, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 240
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Ll/ܳ֨ۜ;->ۧ:Ljava/util/List;

    .line 241
    invoke-direct {p0, v1, v0}, Ll/ܳ֨ۜ;->֫(Ll/ܺ᩸֫;Ljava/util/List;)V

    .line 242
    throw p1

    .line 185
    :cond_17
    :goto_7
    invoke-direct {p0, p1}, Ll/ܳ֨ۜ;->ۧ(Ll/ۗ۠֫;)J

    move-result-wide v0

    return-wide v0

    .line 178
    :cond_18
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data source is already open"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 854
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    .line 855
    iget-object v0, p0, Ll/ܳ֨ۜ;->᩷:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 166
    iget-object v0, p0, Ll/ܳ֨ۜ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 167
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    if-eqz v0, :cond_0

    .line 170
    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 846
    iget-object v0, p0, Ll/ܳ֨ۜ;->ܽ:Ll/᩸۠֫;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 847
    :cond_0
    invoke-interface {v0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    .line 848
    iget-object v0, p0, Ll/ܳ֨ۜ;->᩻:Landroid/net/Uri;

    :cond_1
    return-object v0
.end method
