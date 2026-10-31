.class public final Ll/ۢ۠ۜ;
.super Ljava/lang/Object;
.source "K74T"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/֨᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 71
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ۢ۠ۜ;->ۧ:Ll/֨᩵;

    return-void
.end method

.method public static ֫(Ll/ܿ۠ۜ;Ll/ܶ۠֫;ILl/ۨ֨ۜ;)Landroid/graphics/Bitmap;
    .locals 19

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    .line 348
    invoke-static/range {p0 .. p0}, Ll/ܿ۠ۜ;->ۧ(Ll/ܿ۠ۜ;)Ll/᩷֨ۜ;

    move-result-object v3

    sget-object v4, Ll/᩷֨ۜ;->᩶:Ll/᩷֨ۜ;

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    .line 350
    invoke-static/range {p0 .. p0}, Ll/ܿ۠ۜ;->ᩳ(Ll/ܿ۠ۜ;)Ll/ܳ۠ۜ;

    move-result-object v3

    invoke-static {v3}, Ll/ܳ۠ۜ;->֫(Ll/ܳ۠ۜ;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll/۬֨ۜ;

    move-object/from16 v6, p0

    invoke-direct {v4, v2, v6, v0}, Ll/۬֨ۜ;-><init>(Ll/ۨ֨ۜ;Ll/ܿ۠ۜ;Ll/ܶ۠֫;)V

    .line 351
    invoke-static {v3, v4, v5}, Ll/۫֡ۜ;->֫(Ljava/lang/String;Ll/ۛ֡ۜ;Z)Ll/۫֡ۜ;

    move-result-object v0

    .line 359
    invoke-static/range {p3 .. p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/۫֨ۜ;

    invoke-direct {v3, v2}, Ll/۫֨ۜ;-><init>(Ll/ۨ֨ۜ;)V

    .line 356
    invoke-static {v0, v1, v3}, Ll/᩺ܶۜ;->֫(Ll/۫֡ۜ;ILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v6, p0

    .line 361
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_e

    invoke-static/range {p0 .. p0}, Ll/ܿ۠ۜ;->ܽ(Ll/ܿ۠ۜ;)Ll/ܳ۠ۜ;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 376
    invoke-static/range {p0 .. p0}, Ll/ܿ۠ۜ;->ܽ(Ll/ܿ۠ۜ;)Ll/ܳ۠ۜ;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 380
    invoke-static/range {p0 .. p0}, Ll/ܿ۠ۜ;->ᩳ(Ll/ܿ۠ۜ;)Ll/ܳ۠ۜ;

    move-result-object v4

    .line 439
    invoke-virtual {v3, v0}, Ll/ܳ۠ۜ;->֫(Ll/ܶ۠֫;)Ll/ۙ᩶ۜ;

    move-result-object v6

    const/4 v7, 0x0

    .line 442
    :try_start_0
    invoke-virtual {v4, v0}, Ll/ܳ۠ۜ;->֫(Ll/ܶ۠֫;)Ll/ۙ᩶ۜ;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_5

    .line 443
    :try_start_1
    new-instance v0, Ll/ۡۚۜ;

    invoke-direct {v0, v6, v4}, Ll/ۡۚۜ;-><init>(Ll/ۙ᩶ۜ;Ll/ۙ᩶ۜ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2

    .line 633
    new-instance v4, Ll/ۛ֨ۜ;

    invoke-virtual {v2, v0}, Ll/ۨ֨ۜ;->֫(Ljava/io/Closeable;)Ll/ۤ֨ۜ;

    move-result-object v6

    invoke-direct {v4, v0, v6}, Ll/ۛ֨ۜ;-><init>(Ll/۟ܰۜ;Ll/ۤ֨ۜ;)V

    .line 382
    invoke-static {v3}, Ll/ܳ۠ۜ;->ۧ(Ll/ܳ۠ۜ;)J

    move-result-wide v10

    .line 384
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 386
    :try_start_2
    invoke-virtual/range {p3 .. p3}, Ll/ۨ֨ۜ;->ۧ()V

    .line 387
    invoke-static {v4, v10, v11}, Ll/֡۟ۜ;->֫(Ll/۟ܰۜ;J)Ll/ۚ۟ۜ;

    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ll/ۚ۟ۜ;->֫()I

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-nez v6, :cond_1

    .line 423
    :try_start_3
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 429
    :catchall_0
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto/16 :goto_9

    .line 392
    :cond_1
    :try_start_4
    new-instance v6, Ll/ܿۚۜ;

    const/4 v14, 0x0

    .line 395
    invoke-virtual {v0, v14}, Ll/ۚ۟ۜ;->֫(I)J

    move-result-wide v12

    .line 396
    invoke-virtual {v0, v14}, Ll/ۚ۟ۜ;->ۧ(I)I

    move-result v8

    int-to-long v8, v8

    move-wide v15, v8

    move-object v8, v6

    move-object v9, v4

    const/16 v17, 0x0

    move-wide v14, v15

    invoke-direct/range {v8 .. v15}, Ll/ܿۚۜ;-><init>(Ll/۟ܰۜ;JJJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 398
    :try_start_5
    invoke-virtual {v3, v6}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 399
    invoke-virtual/range {p3 .. p3}, Ll/ۨ֨ۜ;->ۧ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/16 v4, 0x12

    const/4 v8, -0x1

    .line 463
    :try_start_6
    invoke-virtual {v3, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v4, -0x1

    goto :goto_0

    .line 464
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_0
    if-lez v4, :cond_3

    goto :goto_1

    :catch_0
    :cond_3
    const/4 v4, -0x1

    :goto_1
    const/16 v9, 0x13

    .line 463
    :try_start_7
    invoke-virtual {v3, v9}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_4

    const/4 v9, -0x1

    goto :goto_2

    .line 464
    :cond_4
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_2
    if-lez v9, :cond_5

    move v8, v9

    goto :goto_3

    :catch_1
    nop

    :cond_5
    :goto_3
    if-lez v4, :cond_7

    if-lez v8, :cond_7

    .line 474
    :try_start_8
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    int-to-double v10, v4

    int-to-double v12, v8

    div-double/2addr v10, v12

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    cmpl-double v14, v10, v12

    if-ltz v14, :cond_6

    mul-int/lit8 v12, v9, 0x3

    int-to-double v13, v9

    mul-double v13, v13, v10

    .line 479
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    move/from16 v18, v10

    move v10, v9

    move/from16 v9, v18

    goto :goto_4

    :cond_6
    mul-int/lit8 v12, v9, 0x3

    int-to-double v13, v9

    div-double/2addr v13, v10

    .line 483
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 485
    :goto_4
    filled-new-array {v9, v10}, [I

    move-result-object v9

    .line 408
    invoke-virtual {v0}, Ll/ۚ۟ۜ;->ۧ()J

    move-result-wide v10

    aget v0, v9, v17

    aget v5, v9, v5

    .line 407
    invoke-static {v3, v10, v11, v0, v5}, Ll/ۙۚۜ;->֫(Landroid/media/MediaMetadataRetriever;JII)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_5

    .line 411
    :cond_7
    invoke-virtual {v0}, Ll/ۚ۟ۜ;->ۧ()J

    move-result-wide v9

    const/4 v0, 0x2

    .line 410
    invoke-virtual {v3, v9, v10, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 413
    :goto_5
    invoke-virtual/range {p3 .. p3}, Ll/ۨ֨ۜ;->ۧ()V

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    if-lez v4, :cond_9

    goto :goto_6

    .line 417
    :cond_9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    :goto_6
    if-lez v8, :cond_a

    goto :goto_7

    .line 418
    :cond_a
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 419
    :goto_7
    invoke-static {v0, v1, v4, v8}, Ll/ܿܺۡ;->֫(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-object v7, v0

    .line 423
    :goto_8
    :try_start_9
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 427
    :catchall_1
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :goto_9
    return-object v7

    :catchall_2
    move-exception v0

    move-object v4, v7

    move-object v7, v6

    goto :goto_a

    :catchall_3
    move-exception v0

    .line 423
    :goto_a
    :try_start_a
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_b

    :catchall_4
    nop

    :goto_b
    if-eqz v7, :cond_b

    .line 427
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_c

    .line 429
    :cond_b
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 431
    :goto_c
    throw v0

    :catch_2
    move-exception v0

    goto :goto_d

    :catch_3
    move-exception v0

    goto :goto_d

    :catch_4
    move-exception v0

    :goto_d
    move-object v1, v0

    move-object v7, v4

    goto :goto_f

    :catch_5
    move-exception v0

    goto :goto_e

    :catch_6
    move-exception v0

    goto :goto_e

    :catch_7
    move-exception v0

    :goto_e
    move-object v1, v0

    :goto_f
    if-eqz v7, :cond_c

    .line 447
    :try_start_b
    invoke-virtual {v7}, Ll/ۙ᩶ۜ;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    goto :goto_10

    :catch_8
    move-exception v0

    move-object v2, v0

    .line 449
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 453
    :cond_c
    :goto_10
    :try_start_c
    invoke-virtual {v6}, Ll/ۙ᩶ۜ;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9

    goto :goto_11

    :catch_9
    move-exception v0

    move-object v2, v0

    .line 455
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 457
    :goto_11
    throw v1

    .line 378
    :cond_d
    new-instance v0, Ll/᩷۠ۜ;

    const-string v1, "Fragmented MP4 initialization is missing"

    .line 1027
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 378
    throw v0

    .line 362
    :cond_e
    new-instance v0, Ll/᩷۠ۜ;

    const-string v1, "Fragmented MP4 thumbnails require Android M"

    .line 1027
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 362
    throw v0
.end method

.method public static ֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩺᩺֫;Ll/ۨ֨ۜ;)Ll/֫۠ۜ;
    .locals 5

    .line 303
    invoke-static {p1}, Ll/ۢ۠ۜ;->ۧ(Landroid/net/Uri;)V

    .line 304
    invoke-interface {p0}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object p0

    .line 305
    new-instance v0, Ll/᩶۠֫;

    new-instance v1, Ll/ۙ۠֫;

    invoke-direct {v1}, Ll/ۙ۠֫;-><init>()V

    .line 308
    invoke-virtual {v1, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const/4 v2, 0x1

    .line 309
    invoke-virtual {v1, v2}, Ll/ۙ۠֫;->֫(I)V

    .line 310
    invoke-virtual {v1}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/᩶۠֫;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;)V

    .line 311
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v1

    .line 312
    invoke-virtual {p3, v0}, Ll/ۨ֨ۜ;->֫(Ljava/io/Closeable;)Ll/ۤ֨ۜ;

    move-result-object v2

    .line 313
    :try_start_0
    invoke-virtual {p3}, Ll/ۨ֨ۜ;->ۧ()V

    .line 314
    invoke-virtual {v0}, Ll/᩶۠֫;->֫()V

    .line 315
    invoke-interface {p0}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p0

    .line 319
    :goto_0
    invoke-static {p1}, Ll/ۢ۠ۜ;->ۧ(Landroid/net/Uri;)V

    .line 321
    new-instance p0, Ll/۟֨ۜ;

    new-instance v3, Ljava/security/DigestInputStream;

    new-instance v4, Ll/᩺֨ۜ;

    invoke-direct {v4, v0}, Ll/᩺֨ۜ;-><init>(Ll/᩶۠֫;)V

    invoke-direct {v3, v4, v1}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    invoke-direct {p0, v3}, Ll/۟֨ۜ;-><init>(Ljava/security/DigestInputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 323
    :try_start_1
    invoke-virtual {p2, p1, p0}, Ll/᩺᩺֫;->֫(Landroid/net/Uri;Ljava/io/InputStream;)Ll/ۤ᩺֫;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    :try_start_2
    invoke-virtual {p3}, Ll/ۨ֨ۜ;->ۧ()V

    .line 326
    new-instance p2, Ll/֫۠ۜ;

    .line 327
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p3

    invoke-static {p3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p0, p1, p3}, Ll/֫۠ۜ;-><init>(Ll/ۤ᩺֫;Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 328
    invoke-virtual {v2}, Ll/ۤ֨ۜ;->close()V

    return-object p2

    :catchall_0
    move-exception p0

    .line 321
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    .line 312
    :try_start_4
    invoke-virtual {v2}, Ll/ۤ֨ۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static ֫(Ll/ܶ۠֫;Ll/ܽ۠ۜ;Landroid/net/Uri;Ll/ۨ֨ۜ;)Ll/ܿ۠ۜ;
    .locals 10

    .line 214
    invoke-static {p2}, Ll/ۢ۠ۜ;->ۧ(Landroid/net/Uri;)V

    .line 215
    new-instance v0, Ll/᩺᩺֫;

    invoke-direct {v0}, Ll/᩺᩺֫;-><init>()V

    invoke-static {p0, p2, v0, p3}, Ll/ۢ۠ۜ;->֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩺᩺֫;Ll/ۨ֨ۜ;)Ll/֫۠ۜ;

    move-result-object p2

    .line 220
    invoke-static {p2}, Ll/֫۠ۜ;->ܽ(Ll/֫۠ۜ;)Ll/ۤ᩺֫;

    move-result-object v0

    instance-of v1, v0, Ll/۫᩺֫;

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    check-cast v0, Ll/۫᩺֫;

    .line 266
    iget-object v1, v0, Ll/۫᩺֫;->ۖ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Ll/۫᩺֫;->᩷:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 269
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 270
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 271
    iget-object v4, v0, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬᩺֫;

    .line 272
    iget-object v6, v5, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    iget-object v7, v6, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    iget v8, v6, Ll/۠ᩴ֫;->۟:I

    and-int/lit16 v8, v8, 0x4000

    if-nez v8, :cond_0

    iget-object v8, v5, Ll/۬᩺֫;->ܳ:Ljava/lang/String;

    if-eqz v8, :cond_1

    goto :goto_0

    .line 276
    :cond_1
    invoke-static {v7}, Ll/ۢ᩵֫;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 277
    invoke-static {v7}, Ll/ۢ᩵֫;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 278
    iget v9, v6, Ll/۠ᩴ֫;->᩷֫:I

    if-gtz v9, :cond_3

    iget v6, v6, Ll/۠ᩴ֫;->۠:I

    if-lez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v6, 0x1

    :goto_2
    if-nez v8, :cond_5

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    if-nez v7, :cond_0

    .line 283
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 280
    :cond_5
    :goto_3
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 287
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v1, v3

    .line 288
    :cond_7
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v3, Ll/᩸֨ۜ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 290
    invoke-static {v3}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v3

    new-instance v4, Ll/᩹֨ۜ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 291
    invoke-static {v3, v4}, Ll/ܶ۬ᩴ;->thenComparingLong(Ljava/util/Comparator;Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v3

    new-instance v4, Ll/᩶֨ۜ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 292
    invoke-static {v3, v4}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v3

    .line 289
    invoke-interface {v1, v3}, Ll/ܿ᩺ᩴ;->min(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;

    move-result-object v1

    new-instance v3, Ll/ۙ֨ۜ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 293
    invoke-virtual {v1, v3}, Ll/ܽ۫ᩴ;->orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩺֫;

    .line 222
    iget-object v3, v1, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-static {v3}, Ll/ۢ۠ۜ;->ۧ(Landroid/net/Uri;)V

    .line 223
    new-instance v4, Ll/᩺᩺֫;

    invoke-direct {v4, v0, v2}, Ll/᩺᩺֫;-><init>(Ll/۫᩺֫;Ll/ۙ᩺֫;)V

    invoke-static {p0, v3, v4, p3}, Ll/ۢ۠ۜ;->֫(Ll/ܶ۠֫;Landroid/net/Uri;Ll/᩺᩺֫;Ll/ۨ֨ۜ;)Ll/֫۠ۜ;

    move-result-object p0

    .line 228
    invoke-static {p0}, Ll/֫۠ۜ;->ܽ(Ll/֫۠ۜ;)Ll/ۤ᩺֫;

    move-result-object p3

    instance-of v0, p3, Ll/ۙ᩺֫;

    if-eqz v0, :cond_8

    check-cast p3, Ll/ۙ᩺֫;

    .line 508
    iget-object v0, v1, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    .line 509
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "|"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Ll/۠ᩴ֫;->ܽ:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v0, Ll/۠ᩴ֫;->ۨ:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Ll/۠ᩴ֫;->᩷֫:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Ll/۠ᩴ֫;->۠:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 229
    :cond_8
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "Nested multivariant playlists are unsupported"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 229
    throw p0

    .line 267
    :cond_9
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "External video renditions or session DRM are unsupported"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 267
    throw p0

    .line 233
    :cond_a
    invoke-static {p2}, Ll/֫۠ۜ;->ܽ(Ll/֫۠ۜ;)Ll/ۤ᩺֫;

    move-result-object p0

    instance-of p3, p0, Ll/ۙ᩺֫;

    if-eqz p3, :cond_13

    move-object p3, p0

    check-cast p3, Ll/ۙ᩺֫;

    const-string v0, "direct"

    move-object p0, p2

    .line 335
    :goto_4
    iget-object v1, p3, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    .line 336
    iget-boolean v4, v3, Ll/᩹᩺֫;->۫:Z

    if-nez v4, :cond_b

    .line 242
    invoke-static {p3, v3}, Ll/ܺ֨ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/᩷֨ۜ;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 246
    iget-object v4, v3, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-nez v4, :cond_c

    goto :goto_5

    .line 247
    :cond_c
    invoke-virtual {p1, p3, v4}, Ll/ܽ۠ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/ܳ۠ۜ;

    move-result-object v2

    .line 248
    :goto_5
    invoke-virtual {p1, p3, v3}, Ll/ܽ۠ۜ;->֫(Ll/ۙ᩺֫;Ll/᩸᩺֫;)Ll/ܳ۠ۜ;

    move-result-object p1

    .line 249
    sget-object p3, Ll/᩷֨ۜ;->᩹:Ll/᩷֨ۜ;

    if-ne v1, p3, :cond_e

    if-eqz v2, :cond_d

    goto :goto_6

    .line 251
    :cond_d
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "Fragmented MP4 initialization is missing"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 251
    throw p0

    :cond_e
    :goto_6
    if-eqz v2, :cond_10

    .line 253
    invoke-static {v2}, Ll/ܳ۠ۜ;->ۧ(Ll/ܳ۠ۜ;)J

    move-result-wide v3

    const-wide v5, 0x7fffffffffffffffL

    invoke-static {p1}, Ll/ܳ۠ۜ;->ۧ(Ll/ܳ۠ۜ;)J

    move-result-wide v7

    sub-long/2addr v5, v7

    cmp-long p3, v3, v5

    if-gtz p3, :cond_f

    goto :goto_7

    .line 254
    :cond_f
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "HLS thumbnail resource length overflows"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 254
    throw p0

    .line 520
    :cond_10
    :goto_7
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p3

    const-string v3, "hls-thumb-v1"

    .line 521
    invoke-static {p3, v3}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 522
    invoke-static {p2}, Ll/֫۠ۜ;->ۧ(Ll/֫۠ۜ;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p3, v3}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 523
    invoke-static {p2}, Ll/֫۠ۜ;->֫(Ll/֫۠ۜ;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 524
    invoke-static {p0}, Ll/֫۠ۜ;->ۧ(Ll/֫۠ۜ;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 525
    invoke-static {p0}, Ll/֫۠ۜ;->֫(Ll/֫۠ۜ;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 526
    invoke-static {p3, v0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 527
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 528
    invoke-static {p3, v2}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ll/ܳ۠ۜ;)V

    .line 529
    invoke-static {p3, p1}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ll/ܳ۠ۜ;)V

    .line 530
    invoke-virtual {p3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    const-string p2, "hls_thumb_v1_"

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 258
    new-instance p2, Ll/ܿ۠ۜ;

    invoke-direct {p2, v1, v2, p1, p0}, Ll/ܿ۠ۜ;-><init>(Ll/᩷֨ۜ;Ll/ܳ۠ۜ;Ll/ܳ۠ۜ;Ljava/lang/String;)V

    return-object p2

    .line 244
    :cond_11
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "HLS playlist is not eligible for thumbnails"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 244
    throw p0

    .line 340
    :cond_12
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "HLS media segment is missing"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 340
    throw p0

    .line 237
    :cond_13
    new-instance p0, Ll/᩷۠ۜ;

    const-string p1, "Unsupported HLS playlist type"

    .line 1027
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 237
    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;I)Ll/᩻۠ۜ;
    .locals 11

    .line 88
    instance-of v1, p0, Ll/ۗۢ᩻;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 89
    instance-of v0, p0, Ll/ۖۧ᩻;

    if-nez v0, :cond_0

    .line 950
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->۫:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v2}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 141
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "hls-corrupt:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "short-lived"

    .line 142
    invoke-static {p0, p1, v3}, Ll/᩷۬ۜ;->֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 123
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 124
    sget-object v6, Ll/ۢ۠ۜ;->ۧ:Ll/֨᩵;

    move-object v0, v6

    monitor-enter v0

    .line 125
    :try_start_0
    invoke-virtual {v6, v3}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    if-nez v7, :cond_1

    .line 127
    monitor-exit v0

    goto :goto_0

    .line 129
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v10, v4, v8

    if-ltz v10, :cond_2

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sub-long/2addr v4, v7

    const-wide/16 v7, 0x7530

    cmp-long v9, v4, v7

    if-gez v9, :cond_2

    .line 130
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 955
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->᩶:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v2}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 132
    :cond_2
    :try_start_1
    invoke-virtual {v6, v3}, Ll/֨᩵;->ۧ(Ljava/lang/Object;)V

    .line 133
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_3

    .line 96
    sget-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    goto :goto_1

    :cond_3
    sget-object v0, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    .line 97
    :goto_1
    new-instance v1, Ll/ܰ֨ۜ;

    invoke-direct {v1, p1, p0}, Ll/ܰ֨ۜ;-><init>(Ll/ᩳۜܳ;Ll/ܰܺܳ;)V

    .line 98
    new-instance p0, Ll/ۗ֨ۜ;

    invoke-direct {p0, v1}, Ll/ۗ֨ۜ;-><init>(Ll/ܰ֨ۜ;)V

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    const/4 p1, 0x1

    .line 100
    :try_start_2
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-long v4, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v4, v5, p2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻۠ۜ;

    .line 101
    invoke-virtual {p2}, Ll/᩻۠ۜ;->ܽ()Ll/ۜ۠ۜ;

    move-result-object v0

    sget-object v4, Ll/ۜ۠ۜ;->᩶:Ll/ۜ۠ۜ;

    if-ne v0, v4, :cond_4

    .line 102
    invoke-static {v3}, Ll/ۢ۠ۜ;->֫(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_4
    return-object p2

    .line 115
    :catch_0
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 116
    invoke-virtual {v1}, Ll/ܰ֨ۜ;->֫()V

    .line 960
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->۬:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v2}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 110
    :catch_1
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 111
    invoke-virtual {v1}, Ll/ܰ֨ۜ;->֫()V

    .line 112
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 965
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->᩹:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v2}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 106
    :catch_2
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 107
    invoke-virtual {v1}, Ll/ܰ֨ۜ;->֫()V

    .line 970
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->ۗ:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v2}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 134
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ll/ۨ֨ۜ;)Ll/᩻۠ۜ;
    .locals 3

    const/4 v0, 0x0

    .line 157
    :try_start_0
    invoke-static {p1, p0}, Ll/ᩳ۠ۜ;->֫(Ll/ᩳۜܳ;Ll/ܰܺܳ;)Ll/ᩳ۠ۜ;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/᩷۠ۜ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۧ۠ۜ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۨܽۧ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :try_start_1
    invoke-virtual {p2, p0}, Ll/ۨ֨ۜ;->֫(Ll/ᩳ۠ۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    :try_start_2
    invoke-virtual {p2}, Ll/ۨ֨ۜ;->ۧ()V

    .line 161
    iget-object p1, p0, Ll/ᩳ۠ۜ;->ۙ:Ll/ܶ۠֫;

    iget-object v1, p0, Ll/ᩳ۠ۜ;->ۗ:Ll/ܽ۠ۜ;

    iget-object v2, p0, Ll/ᩳ۠ۜ;->۬:Landroid/net/Uri;

    invoke-static {p1, v1, v2, p2}, Ll/ۢ۠ۜ;->֫(Ll/ܶ۠֫;Ll/ܽ۠ۜ;Landroid/net/Uri;Ll/ۨ֨ۜ;)Ll/ܿ۠ۜ;

    move-result-object p1

    .line 166
    invoke-static {p1}, Ll/ܿ۠ۜ;->֫(Ll/ܿ۠ۜ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 168
    invoke-virtual {p2}, Ll/ۨ֨ۜ;->ۧ()V

    .line 945
    new-instance p1, Ll/᩻۠ۜ;

    sget-object v2, Ll/ۜ۠ۜ;->ۙ:Ll/ۜ۠ۜ;

    invoke-direct {p1, v2, v1}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 171
    :cond_0
    invoke-virtual {p2}, Ll/ۨ֨ۜ;->ۧ()V

    .line 174
    invoke-virtual {p0}, Ll/ᩳ۠ۜ;->֫()Ll/ܶ۠֫;

    move-result-object v1

    const/high16 v2, 0x42000000    # 32.0f

    .line 489
    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    .line 172
    invoke-static {p1, v1, v2, p2}, Ll/ۢ۠ۜ;->֫(Ll/ܿ۠ۜ;Ll/ܶ۠֫;ILl/ۨ֨ۜ;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_1

    .line 960
    new-instance p1, Ll/᩻۠ۜ;

    sget-object v1, Ll/ۜ۠ۜ;->۬:Ll/ۜ۠ۜ;

    invoke-direct {p1, v1, v0}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 180
    :cond_1
    invoke-virtual {p2}, Ll/ۨ֨ۜ;->ۧ()V

    .line 181
    invoke-static {p1}, Ll/ܿ۠ۜ;->֫(Ll/ܿ۠ۜ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/۬۫ۡ;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 945
    new-instance p1, Ll/᩻۠ۜ;

    sget-object v2, Ll/ۜ۠ۜ;->ۙ:Ll/ۜ۠ۜ;

    invoke-direct {p1, v2, v1}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    :goto_0
    :try_start_3
    invoke-virtual {p2, p0}, Ll/ۨ֨ۜ;->ۧ(Ll/ᩳ۠ۜ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 186
    :try_start_4
    invoke-virtual {p0}, Ll/ᩳ۠ۜ;->close()V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ll/᩷۠ۜ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ll/ۧ۠ۜ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ll/ۨܽۧ; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ll/ۡ᩵֫; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 184
    :try_start_5
    invoke-virtual {p2, p0}, Ll/ۨ֨ۜ;->ۧ(Ll/ᩳ۠ۜ;)V

    .line 185
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    .line 157
    :try_start_6
    invoke-virtual {p0}, Ll/ᩳ۠ۜ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    :try_start_7
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_7
    .catch Ljava/io/InterruptedIOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ll/᩷۠ۜ; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ll/ۧ۠ۜ; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ll/ۨܽۧ; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ll/ۡ᩵֫; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0

    .line 960
    :catch_0
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->۬:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v0}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 955
    :catch_1
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->᩶:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v0}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 950
    :catch_2
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->۫:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v0}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 965
    :catch_3
    new-instance p0, Ll/᩻۠ۜ;

    sget-object p1, Ll/ۜ۠ۜ;->᩹:Ll/ۜ۠ۜ;

    invoke-direct {p0, p1, v0}, Ll/᩻۠ۜ;-><init>(Ll/ۜ۠ۜ;Landroid/graphics/Bitmap;)V

    :goto_2
    return-object p0
.end method

.method public static bridge synthetic ֫(Landroid/net/Uri;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۢ۠ۜ;->ۧ(Landroid/net/Uri;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 4

    .line 147
    sget-object v1, Ll/ۢ۠ۜ;->ۧ:Ll/֨᩵;

    move-object v0, v1

    monitor-enter v0

    .line 148
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/security/MessageDigest;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 547
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    const/4 p1, 0x0

    .line 549
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update(B)V

    return-void
.end method

.method public static ֫(Ljava/security/MessageDigest;Ll/ܳ۠ۜ;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "none"

    .line 536
    invoke-static {p0, p1}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    return-void

    .line 539
    :cond_0
    invoke-static {p1}, Ll/ܳ۠ۜ;->ᩳ(Ll/ܳ۠ۜ;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 540
    invoke-static {p1}, Ll/ܳ۠ۜ;->֫(Ll/ܳ۠ۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 541
    invoke-static {p1}, Ll/ܳ۠ۜ;->ܽ(Ll/ܳ۠ۜ;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 542
    invoke-static {p1}, Ll/ܳ۠ۜ;->ۧ(Ll/ܳ۠ۜ;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۢ۠ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ(Landroid/net/Uri;)V
    .locals 2

    .line 553
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 554
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 555
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mt_media"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 556
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 557
    :cond_0
    new-instance p0, Ll/᩷۠ۜ;

    const-string v0, "HLS thumbnail URI must stay in the current visitor"

    .line 1027
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 557
    throw p0
.end method
