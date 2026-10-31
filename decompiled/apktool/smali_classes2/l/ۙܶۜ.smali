.class public final Ll/ۙܶۜ;
.super Ljava/lang/Object;
.source "A75O"


# instance fields
.field public ֡:I

.field public final ֨:Landroid/media/MediaCodec$BufferInfo;

.field public final ֫:Ll/۬ܶۜ;

.field public ۖ:J

.field public final ۘ:I

.field public final ۚ:I

.field public ۜ:J

.field public final ۠:I

.field public ۡ:I

.field public ۢ:Z

.field public final ۧ:Z

.field public ܳ:Landroid/media/MediaFormat;

.field public ܶ:I

.field public ܺ:J

.field public final ܽ:Landroid/media/MediaCodec;

.field public ܿ:Z

.field public final ᩳ:Ljava/lang/String;

.field public ᩴ:J

.field public ᩵:Z

.field public ᩷:Z

.field public final ᩸:Ll/۠ᩴ֫;

.field public final ᩻:Ll/ᩳۗ֫;


# direct methods
.method public constructor <init>(Ll/۬ܶۜ;Ll/ᩳۗ֫;Landroid/media/MediaCodec;Ljava/lang/String;Landroid/media/MediaFormat;Ll/۠ᩴ֫;IIZZ)V
    .locals 2

    .line 398
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Ll/ۙܶۜ;->֨:Landroid/media/MediaCodec$BufferInfo;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 375
    iput-wide v0, p0, Ll/ۙܶۜ;->ۜ:J

    .line 380
    iput-wide v0, p0, Ll/ۙܶۜ;->ܺ:J

    .line 399
    iput-object p1, p0, Ll/ۙܶۜ;->֫:Ll/۬ܶۜ;

    .line 400
    iput-object p2, p0, Ll/ۙܶۜ;->᩻:Ll/ᩳۗ֫;

    .line 401
    iput-object p3, p0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    .line 402
    iput-object p4, p0, Ll/ۙܶۜ;->ᩳ:Ljava/lang/String;

    .line 403
    iput-object p5, p0, Ll/ۙܶۜ;->ܳ:Landroid/media/MediaFormat;

    .line 404
    iput-object p6, p0, Ll/ۙܶۜ;->᩸:Ll/۠ᩴ֫;

    .line 405
    iput p7, p0, Ll/ۙܶۜ;->۠:I

    .line 406
    iput p8, p0, Ll/ۙܶۜ;->ۚ:I

    .line 407
    iput-boolean p9, p0, Ll/ۙܶۜ;->ۧ:Z

    if-eqz p10, :cond_0

    const/16 p1, 0x3e8

    goto :goto_0

    :cond_0
    const/16 p1, 0xfa

    .line 410
    :goto_0
    iput p1, p0, Ll/ۙܶۜ;->ۘ:I

    const/4 p1, 0x1

    .line 411
    iput-boolean p1, p0, Ll/ۙܶۜ;->ܿ:Z

    return-void
.end method

.method public static ֫(Ll/۠ᩴ֫;Landroid/media/MediaFormat;ZLjava/lang/String;Ll/᩶ۗۜ;)Landroid/media/MediaCodec;
    .locals 7

    .line 536
    iget-object v0, p0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz v0, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez p2, :cond_0

    .line 541
    invoke-interface {p4}, Ll/᩶ۗۜ;->֫()V

    .line 545
    :try_start_0
    invoke-static {v0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 546
    :try_start_1
    invoke-static {p0, v0}, Ll/ۙܶۜ;->ۧ(Landroid/media/MediaCodec;Ljava/lang/String;)V

    .line 547
    invoke-virtual {p0, p1, v2, v2, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 548
    invoke-virtual {p0}, Landroid/media/MediaCodec;->start()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    move-object v2, p0

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    .line 552
    :goto_1
    invoke-static {v2, v1}, Ll/᩺ܶۜ;->֫(Landroid/media/MediaCodec;Z)V

    .line 553
    new-instance p0, Ll/᩹ܶۜ;

    const-string p2, "Failed to initialize MPEG-TS preview decoder"

    .line 845
    invoke-direct {p0, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 553
    throw p0

    .line 559
    :cond_0
    :try_start_2
    invoke-static {v0, v1, v1}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p2
    :try_end_2
    .catch Ll/ۚ۟֫; {:try_start_2 .. :try_end_2} :catch_c

    .line 565
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v3, v2

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿ۟֫;

    .line 566
    iget-boolean v5, v4, Ll/ܿ۟֫;->ۖ:Z

    iget-object v6, v4, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    if-eqz v5, :cond_1

    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    .line 572
    :cond_2
    :try_start_3
    invoke-interface {p4}, Ll/᩶ۗۜ;->֫()V

    .line 573
    invoke-virtual {v4, p0}, Ll/ܿ۟֫;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    .line 576
    :cond_3
    invoke-static {v6}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v3
    :try_end_3
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ll/ۚ۟֫; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_8

    .line 577
    :try_start_4
    invoke-static {v3, v0}, Ll/ۙܶۜ;->ۧ(Landroid/media/MediaCodec;Ljava/lang/String;)V

    .line 578
    invoke-virtual {v3, p1, v2, v2, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 579
    invoke-virtual {v3}, Landroid/media/MediaCodec;->start()V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ll/ۚ۟֫; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    return-object v3

    :catch_4
    move-exception v4

    goto :goto_4

    :catch_5
    move-exception v4

    goto :goto_4

    :catch_6
    move-exception v4

    goto :goto_4

    :catch_7
    move-exception p0

    move-object v2, v3

    goto :goto_5

    :catch_8
    move-exception v3

    goto :goto_3

    :catch_9
    move-exception v3

    goto :goto_3

    :catch_a
    move-exception v3

    :goto_3
    move-object v4, v3

    move-object v3, v2

    .line 588
    :goto_4
    invoke-static {v3, v1}, Ll/᩺ܶۜ;->֫(Landroid/media/MediaCodec;Z)V

    move-object v3, v4

    goto :goto_2

    :catch_b
    move-exception p0

    .line 583
    :goto_5
    invoke-static {v2, v1}, Ll/᩺ܶۜ;->֫(Landroid/media/MediaCodec;Z)V

    .line 584
    throw p0

    :cond_4
    if-eqz v3, :cond_5

    .line 594
    new-instance p0, Ll/᩹ܶۜ;

    const-string p1, "Failed to initialize software MPEG-TS preview decoder"

    .line 845
    invoke-direct {p0, p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 594
    throw p0

    .line 597
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing software MPEG-TS preview decoder"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_c
    move-exception p0

    .line 562
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to query software video decoders"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 538
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing MPEG-TS video MIME type"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۙܶۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܶۜ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Ll/۫֡ۜ;Ll/۬ܶۜ;IIZZLjava/lang/String;Ll/᩶ۗۜ;)Ll/ۙܶۜ;
    .locals 14

    move-object/from16 v0, p7

    .line 440
    invoke-interface/range {p7 .. p7}, Ll/᩶ۗۜ;->֫()V

    .line 441
    new-instance v11, Ll/ᩳۗ֫;

    .line 417
    new-instance v1, Ll/ܽ᩷ᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 442
    new-instance v2, Ll/ۛܶۜ;

    move-object v3, p0

    invoke-direct {v2, p0, v0}, Ll/ۛܶۜ;-><init>(Ll/۫֡ۜ;Ll/᩶ۗۜ;)V

    invoke-direct {v11, v1, v2}, Ll/ᩳۗ֫;-><init>(Ll/ܽ᩷ᩳ;Ll/ܶ۠֫;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 447
    :try_start_0
    invoke-static {}, Ll/᩺ܶۜ;->ܿ()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v11, v3}, Ll/ᩳۗ֫;->֫(Landroid/net/Uri;)V

    .line 448
    invoke-interface/range {p7 .. p7}, Ll/᩶ۗۜ;->֫()V

    const/4 v3, 0x0

    .line 602
    :goto_0
    invoke-virtual {v11}, Ll/ᩳۗ֫;->ᩳ()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 603
    invoke-virtual {v11, v3}, Ll/ᩳۗ֫;->֫(I)Landroid/media/MediaFormat;

    move-result-object v4

    const-string v5, "mime"

    .line 604
    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 605
    invoke-static {v4}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_1
    if-ltz v3, :cond_5

    .line 453
    invoke-virtual {v11, v3}, Ll/ᩳۗ֫;->֫(I)Landroid/media/MediaFormat;

    move-result-object v5

    .line 454
    invoke-static {v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;)Ll/۠ᩴ֫;

    move-result-object v6

    .line 455
    iget-object v4, v6, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 456
    invoke-static {v4}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 459
    invoke-static {v5}, Ll/ۙܶۜ;->֫(Landroid/media/MediaFormat;)V

    .line 460
    invoke-virtual {v11, v3}, Ll/ᩳۗ֫;->ۧ(I)V

    const-string v3, "color-format"

    const v7, 0x7f420888

    .line 462
    invoke-virtual {v5, v3, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "max-input-size"

    .line 643
    iget v7, v6, Ll/۠ᩴ֫;->᩷֫:I

    if-lez v7, :cond_2

    iget v8, v6, Ll/۠ᩴ֫;->۠:I

    if-lez v8, :cond_2

    int-to-long v9, v7

    int-to-long v7, v8

    mul-long v9, v9, v7

    const-wide/16 v7, 0x2

    .line 644
    div-long/2addr v9, v7

    goto :goto_2

    :cond_2
    const-wide/16 v9, 0x0

    :goto_2
    const-wide/32 v7, 0x200000

    .line 648
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    const-wide/32 v9, 0x800000

    .line 646
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v8, v7

    .line 465
    invoke-virtual {v5, v3, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move/from16 v3, p5

    move-object/from16 v7, p6

    .line 468
    invoke-static {v6, v5, v3, v7, v0}, Ll/ۙܶۜ;->֫(Ll/۠ᩴ֫;Landroid/media/MediaFormat;ZLjava/lang/String;Ll/᩶ۗۜ;)Landroid/media/MediaCodec;

    move-result-object v12
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 475
    :try_start_1
    new-instance v13, Ll/ۙܶۜ;

    .line 500
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 501
    invoke-virtual {v12}, Landroid/media/MediaCodec;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 502
    :cond_3
    invoke-virtual {v12}, Landroid/media/MediaCodec;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v7, v0

    .line 485
    invoke-static {v12, v4}, Ll/ۙܶۜ;->֫(Landroid/media/MediaCodec;Ljava/lang/String;)Z

    move-result v10

    move-object v0, v13

    move-object v1, p1

    move-object v2, v11

    move-object v3, v12

    move-object v4, v7

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    invoke-direct/range {v0 .. v10}, Ll/ۙܶۜ;-><init>(Ll/۬ܶۜ;Ll/ᩳۗ֫;Landroid/media/MediaCodec;Ljava/lang/String;Landroid/media/MediaFormat;Ll/۠ᩴ֫;IIZZ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v13

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_4
    const/4 v2, 0x1

    move-object v1, v12

    goto :goto_5

    .line 457
    :cond_4
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Unsupported MPEG-TS video format"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 451
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Missing MPEG-TS video track"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    .line 488
    :goto_5
    invoke-static {v1, v2}, Ll/᩺ܶۜ;->֫(Landroid/media/MediaCodec;Z)V

    .line 489
    invoke-virtual {v11}, Ll/ᩳۗ֫;->ܿ()V

    .line 490
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_6

    check-cast v0, Ljava/io/IOException;

    .line 491
    throw v0

    .line 493
    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to initialize MPEG-TS preview decoder"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private ֫(IZ)V
    .locals 7

    .line 734
    iget-wide v4, p0, Ll/ۙܶۜ;->ۖ:J

    const/4 v6, 0x4

    iget-object v0, p0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p1

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 740
    iput-boolean p2, p0, Ll/ۙܶۜ;->᩷:Z

    const/4 p1, 0x1

    .line 741
    iput-boolean p1, p0, Ll/ۙܶۜ;->ۢ:Z

    return-void
.end method

.method private ֫(Landroid/media/Image;J)V
    .locals 6

    .line 806
    :try_start_0
    iget v1, p0, Ll/ۙܶۜ;->۠:I

    iget v2, p0, Ll/ۙܶۜ;->ۚ:I

    iget-object v3, p0, Ll/ۙܶۜ;->᩸:Ll/۠ᩴ֫;

    iget-boolean v4, p0, Ll/ۙܶۜ;->ۧ:Z

    iget-object v5, p0, Ll/ۙܶۜ;->ܳ:Landroid/media/MediaFormat;

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Ll/᩺ܶۜ;->֫(Landroid/media/Image;IILl/۠ᩴ֫;ZLandroid/media/MediaFormat;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 817
    :goto_0
    iget-wide v0, p0, Ll/ۙܶۜ;->ᩴ:J

    cmp-long v2, v0, p2

    if-gtz v2, :cond_1

    .line 818
    new-instance v2, Ll/۫ܶۜ;

    iget v3, p0, Ll/ۙܶۜ;->۠:I

    iget v4, p0, Ll/ۙܶۜ;->ۚ:I

    invoke-direct {v2, v3, v4, v0, v1}, Ll/۫ܶۜ;-><init>(IIJ)V

    .line 819
    iget-object v0, p0, Ll/ۙܶۜ;->֫:Ll/۬ܶۜ;

    invoke-virtual {v0, v2}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    .line 820
    invoke-virtual {v0, v2, p1}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;Landroid/graphics/Bitmap;)V

    .line 822
    :cond_0
    iget-wide v0, p0, Ll/ۙܶۜ;->ᩴ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۙܶۜ;->ᩴ:J

    goto :goto_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 814
    :goto_1
    new-instance p2, Ll/᩶ܶۜ;

    const-string p3, "Unsupported MPEG-TS decoder output image"

    .line 857
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 814
    throw p2
.end method

.method public static ֫(Landroid/media/MediaFormat;)V
    .locals 2

    .line 630
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    const-string v0, "color-transfer"

    .line 631
    invoke-virtual {p0, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 634
    :cond_0
    invoke-virtual {p0, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_1

    goto :goto_0

    .line 637
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "HDR MPEG-TS preview is unsupported"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۙܶۜ;JLl/᩶ۗۜ;)V
    .locals 19

    move-object/from16 v0, p0

    .line 660
    new-instance v7, Ll/۫ܶۜ;

    iget v1, v0, Ll/ۙܶۜ;->۠:I

    iget v2, v0, Ll/ۙܶۜ;->ۚ:I

    move-wide/from16 v8, p1

    invoke-direct {v7, v1, v2, v8, v9}, Ll/۫ܶۜ;-><init>(IIJ)V

    .line 661
    :goto_0
    iget-object v1, v0, Ll/ۙܶۜ;->֫:Ll/۬ܶۜ;

    invoke-virtual {v1, v7}, Ll/۬ܶۜ;->֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_b

    iget-boolean v1, v0, Ll/ۙܶۜ;->᩵:Z

    if-nez v1, :cond_b

    .line 662
    invoke-interface/range {p3 .. p3}, Ll/᩶ۗۜ;->֫()V

    const-wide/16 v4, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v6, p3

    .line 663
    invoke-direct/range {v1 .. v6}, Ll/ۙܶۜ;->֫(JJLl/᩶ۗۜ;)Z

    move-result v1

    .line 664
    iget-boolean v2, v0, Ll/ۙܶۜ;->ۢ:Z

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v2, :cond_8

    .line 686
    iget-object v2, v0, Ll/ۙܶۜ;->᩻:Ll/ᩳۗ֫;

    iget-object v3, v0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    const-wide/16 v4, 0x7d0

    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v13

    if-gez v13, :cond_0

    const/4 v2, 0x0

    goto/16 :goto_3

    .line 690
    :cond_0
    invoke-interface/range {p3 .. p3}, Ll/᩶ۗۜ;->֫()V

    .line 691
    invoke-virtual {v2}, Ll/ᩳۗ֫;->ܽ()J

    move-result-wide v4

    const-wide/16 v14, 0x0

    cmp-long v6, v4, v14

    if-gez v6, :cond_1

    .line 693
    invoke-direct {v0, v13, v11}, Ll/ۙܶۜ;->֫(IZ)V

    goto :goto_2

    .line 696
    :cond_1
    iget v6, v0, Ll/ۙܶۜ;->ۡ:I

    const/16 v12, 0x4b0

    if-lt v6, v12, :cond_2

    .line 697
    invoke-direct {v0, v13, v10}, Ll/ۙܶۜ;->֫(IZ)V

    goto :goto_2

    .line 700
    :cond_2
    iget-wide v11, v0, Ll/ۙܶۜ;->ۜ:J

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v11, v16

    if-nez v6, :cond_3

    .line 701
    iput-wide v4, v0, Ll/ۙܶۜ;->ۜ:J

    .line 703
    :cond_3
    iget-wide v11, v0, Ll/ۙܶۜ;->ۜ:J

    sub-long/2addr v4, v11

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide/32 v11, 0x989680

    cmp-long v6, v4, v11

    if-lez v6, :cond_4

    .line 705
    invoke-direct {v0, v13, v10}, Ll/ۙܶۜ;->֫(IZ)V

    goto :goto_2

    .line 708
    :cond_4
    invoke-virtual {v3, v13}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 712
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 715
    :try_start_0
    invoke-virtual {v2, v3}, Ll/ᩳۗ֫;->֫(Ljava/nio/ByteBuffer;)I

    move-result v15
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v15, :cond_5

    const/4 v3, 0x0

    .line 720
    invoke-direct {v0, v13, v3}, Ll/ۙܶۜ;->֫(IZ)V

    goto :goto_2

    .line 723
    :cond_5
    invoke-virtual {v2}, Ll/ᩳۗ֫;->ۧ()I

    move-result v3

    and-int/2addr v3, v10

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    const/16 v18, 0x1

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    const/16 v18, 0x0

    .line 726
    :goto_1
    iget-object v12, v0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    const/4 v14, 0x0

    move-wide/from16 v16, v4

    invoke-virtual/range {v12 .. v18}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 727
    iput-wide v4, v0, Ll/ۙܶۜ;->ۖ:J

    .line 728
    iget v3, v0, Ll/ۙܶۜ;->ۡ:I

    add-int/2addr v3, v10

    iput v3, v0, Ll/ۙܶۜ;->ۡ:I

    .line 729
    invoke-virtual {v2}, Ll/ᩳۗ֫;->֫()V

    :goto_2
    const/4 v2, 0x1

    :goto_3
    or-int/2addr v1, v2

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 717
    new-instance v0, Ljava/io/IOException;

    const-string v2, "MPEG-TS access unit exceeds codec input buffer"

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 710
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing MPEG-TS decoder input buffer"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    move v11, v1

    const-wide/16 v4, 0x7d0

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v6, p3

    .line 667
    invoke-direct/range {v1 .. v6}, Ll/ۙܶۜ;->֫(JJLl/᩶ۗۜ;)Z

    move-result v1

    or-int/2addr v1, v11

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    .line 670
    iput v1, v0, Ll/ۙܶۜ;->ܶ:I

    goto/16 :goto_0

    .line 671
    :cond_9
    iget v1, v0, Ll/ۙܶۜ;->ܶ:I

    add-int/2addr v1, v10

    iput v1, v0, Ll/ۙܶۜ;->ܶ:I

    iget v2, v0, Ll/ۙܶۜ;->ۘ:I

    if-ge v1, v2, :cond_a

    goto/16 :goto_0

    .line 672
    :cond_a
    new-instance v1, Ll/ۗܶۜ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MPEG-TS preview decoder timed out: input="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, Ll/ۙܶۜ;->ۡ:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", inputEnded="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, v0, Ll/ۙܶۜ;->ۢ:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", output="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Ll/ۙܶۜ;->֡:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", lastOutputUs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Ll/ۙܶۜ;->ܺ:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", nextBucket="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Ll/ۙܶۜ;->ᩴ:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 837
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 672
    throw v1

    :cond_b
    return-void
.end method

.method private ֫(JJLl/᩶ۗۜ;)Z
    .locals 6

    .line 750
    iget-object v0, p0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    iget-object v1, p0, Ll/ۙܶۜ;->֨:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v0, v1, p3, p4}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result p3

    const/4 p4, -0x1

    const/4 v2, 0x0

    if-ne p3, p4, :cond_0

    return v2

    :cond_0
    const/4 p4, -0x2

    const/4 v3, 0x1

    if-ne p3, p4, :cond_1

    .line 756
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܶۜ;->ܳ:Landroid/media/MediaFormat;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception p1

    .line 758
    new-instance p2, Ll/᩶ܶۜ;

    const-string p3, "Failed to read MPEG-TS decoder output format"

    .line 857
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 758
    throw p2

    :cond_1
    if-gez p3, :cond_2

    return v3

    .line 768
    :cond_2
    :try_start_1
    invoke-interface {p5}, Ll/᩶ۗۜ;->֫()V

    .line 769
    iget p4, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_3

    goto :goto_1

    .line 770
    :cond_3
    iget p4, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez p4, :cond_6

    .line 771
    iget-wide p4, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v4, 0x0

    .line 773
    invoke-static {v4, v5, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    const-wide/32 v4, 0xf4240

    div-long/2addr p4, v4

    .line 771
    invoke-static {p1, p2, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 775
    iget-wide p4, p0, Ll/ۙܶۜ;->ᩴ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v4, p4, p1

    if-gtz v4, :cond_5

    .line 777
    :try_start_2
    invoke-virtual {v0, p3}, Landroid/media/MediaCodec;->getOutputImage(I)Landroid/media/Image;

    move-result-object p4
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_4

    .line 786
    :try_start_3
    invoke-direct {p0, p4, p1, p2}, Ll/ۙܶۜ;->֫(Landroid/media/Image;J)V

    goto :goto_0

    .line 783
    :cond_4
    new-instance p1, Ll/᩶ܶۜ;

    const-string p2, "Decoder did not expose an output image"

    .line 852
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 783
    throw p1

    :catch_1
    move-exception p1

    .line 779
    new-instance p2, Ll/᩶ܶۜ;

    const-string p4, "Failed to obtain MPEG-TS decoder output image"

    .line 857
    invoke-direct {p2, p4, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 779
    throw p2

    .line 788
    :cond_5
    :goto_0
    iget p1, p0, Ll/ۙܶۜ;->֡:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۙܶۜ;->֡:I

    .line 789
    iget-wide p1, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide p1, p0, Ll/ۙܶۜ;->ܺ:J

    .line 791
    :cond_6
    :goto_1
    iget p1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_7

    .line 792
    iput-boolean v3, p0, Ll/ۙܶۜ;->᩵:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 796
    :cond_7
    invoke-virtual {v0, p3, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return v3

    :catchall_0
    move-exception p1

    invoke-virtual {v0, p3, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 797
    throw p1
.end method

.method public static ֫(Landroid/media/MediaCodec;Ljava/lang/String;)Z
    .locals 3

    .line 508
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 509
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isSoftwareOnly()Z

    move-result p0

    return p0

    :cond_0
    if-lt v0, v1, :cond_1

    .line 501
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 502
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getName()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 v0, 0x0

    .line 514
    :try_start_0
    invoke-static {p1, v0, v0}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۟֫;

    .line 515
    iget-object v2, v1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 516
    iget-boolean p0, v1, Ll/ܿ۟֫;->ۖ:Z
    :try_end_0
    .catch Ll/ۚ۟֫; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    nop

    .line 521
    :cond_3
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "omx.google."

    .line 522
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "c2.android."

    .line 523
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "c2.google."

    .line 524
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    :cond_4
    const/4 v0, 0x1

    :cond_5
    return v0
.end method

.method public static ֫(Ll/ۙܶۜ;II)Z
    .locals 1

    .line 652
    iget v0, p0, Ll/ۙܶۜ;->۠:I

    if-ne v0, p1, :cond_0

    iget p0, p0, Ll/ۙܶۜ;->ۚ:I

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Landroid/media/MediaCodec;Ljava/lang/String;)V
    .locals 3

    .line 616
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 619
    :cond_0
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object p0

    iget-object p0, p0, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    .line 620
    array-length p1, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    aget v1, p0, v0

    const v2, 0x7f420888

    if-ne v1, v2, :cond_1

    :goto_1
    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 625
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Decoder does not expose flexible YUV output"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙܶۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۙܶۜ;->᩷:Z

    return p0
.end method

.method public static ܳ(Ll/ۙܶۜ;)V
    .locals 2

    .line 828
    iget-object v0, p0, Ll/ۙܶۜ;->ܽ:Landroid/media/MediaCodec;

    iget-boolean v1, p0, Ll/ۙܶۜ;->ܿ:Z

    invoke-static {v0, v1}, Ll/᩺ܶۜ;->֫(Landroid/media/MediaCodec;Z)V

    const/4 v0, 0x0

    .line 829
    iput-boolean v0, p0, Ll/ۙܶۜ;->ܿ:Z

    .line 830
    iget-object p0, p0, Ll/ۙܶۜ;->᩻:Ll/ᩳۗ֫;

    invoke-virtual {p0}, Ll/ᩳۗ֫;->ܿ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۙܶۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۙܶۜ;->ᩴ:J

    return-wide v0
.end method

.method public static bridge synthetic ܿ(Ll/ۙܶۜ;)Ll/۠ᩴ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܶۜ;->᩸:Ll/۠ᩴ֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۙܶۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۙܶۜ;->᩵:Z

    return p0
.end method
