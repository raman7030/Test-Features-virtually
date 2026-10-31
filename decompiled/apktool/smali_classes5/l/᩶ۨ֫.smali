.class public final Ll/᩶ۨ֫;
.super Ll/ۧᩳۧ;
.source "17MS"


# static fields
.field public static final ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ֡:Ll/ܿܺۧ;

.field public final ֨:Ll/᩸۠֫;

.field public final ֫֫:Ll/ᩳ֨֫;

.field public ۖ:Ll/ۙۨ֫;

.field public final ۗ:Z

.field public final ۘ:Ll/᩹ۨ֫;

.field public ۙ:Z

.field public ۚ:Z

.field public final ۛ:I

.field public ۟:Ll/ܳ۬ܺ;

.field public final ۠:Ll/ۗ۠֫;

.field public final ۡ:I

.field public ۤ:Ll/ܿ᩺֫;

.field public ۧ֫:Z

.field public final ۨ:Landroid/net/Uri;

.field public ۫:I

.field public final ۬:Ljava/util/List;

.field public ܰ:J

.field public final ܶ:Z

.field public final ܺ:Ll/᩵ᩴ֫;

.field public final ܽ֫:Ll/ۢ֨֫;

.field public final ᩳ֫:I

.field public ᩴ:Z

.field public final ᩵:Z

.field public volatile ᩶:Z

.field public final ᩸:Z

.field public final ᩹:Z

.field public final ᩺:Ll/ۙۨ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 260
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/᩶ۨ֫;->ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ll/᩹ۨ֫;Ll/᩸۠֫;Ll/ۗ۠֫;Ll/۠ᩴ֫;ZLl/᩸۠֫;Ll/ۗ۠֫;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLl/ۢ֨֫;Ll/᩵ᩴ֫;Ll/ۙۨ֫;Ll/ܿܺۧ;Ll/ᩳ֨֫;ZZLl/ܰ۬֫;)V
    .locals 14

    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    .line 337
    invoke-direct/range {v0 .. v11}, Ll/ۧᩳۧ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ll/۠ᩴ֫;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    .line 346
    iput-boolean v0, v12, Ll/᩶ۨ֫;->ۗ:Z

    move/from16 v0, p19

    .line 347
    iput v0, v12, Ll/᩶ۨ֫;->ۛ:I

    if-eqz p20, :cond_0

    sub-long v0, p15, p13

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 348
    :goto_0
    iput-wide v0, v12, Ll/᩶ۨ֫;->ܰ:J

    move/from16 v0, p21

    .line 349
    iput v0, v12, Ll/᩶ۨ֫;->ۡ:I

    .line 350
    iput-object v13, v12, Ll/᩶ۨ֫;->۠:Ll/ۗ۠֫;

    move-object/from16 v0, p6

    .line 351
    iput-object v0, v12, Ll/᩶ۨ֫;->֨:Ll/᩸۠֫;

    if-eqz v13, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 352
    :goto_1
    iput-boolean v0, v12, Ll/᩶ۨ֫;->ۚ:Z

    move/from16 v0, p8

    .line 353
    iput-boolean v0, v12, Ll/᩶ۨ֫;->ܶ:Z

    move-object/from16 v0, p9

    .line 354
    iput-object v0, v12, Ll/᩶ۨ֫;->ۨ:Landroid/net/Uri;

    move/from16 v0, p23

    .line 355
    iput-boolean v0, v12, Ll/᩶ۨ֫;->᩹:Z

    move-object/from16 v0, p24

    .line 356
    iput-object v0, v12, Ll/᩶ۨ֫;->ܽ֫:Ll/ۢ֨֫;

    move/from16 v0, p22

    .line 358
    iput-boolean v0, v12, Ll/᩶ۨ֫;->᩵:Z

    move-object v0, p1

    .line 359
    iput-object v0, v12, Ll/᩶ۨ֫;->ۘ:Ll/᩹ۨ֫;

    move-object/from16 v0, p10

    .line 360
    iput-object v0, v12, Ll/᩶ۨ֫;->۬:Ljava/util/List;

    move-object/from16 v0, p25

    .line 361
    iput-object v0, v12, Ll/᩶ۨ֫;->ܺ:Ll/᩵ᩴ֫;

    move-object/from16 v0, p26

    .line 362
    iput-object v0, v12, Ll/᩶ۨ֫;->᩺:Ll/ۙۨ֫;

    move-object/from16 v0, p27

    .line 363
    iput-object v0, v12, Ll/᩶ۨ֫;->֡:Ll/ܿܺۧ;

    move-object/from16 v0, p28

    .line 364
    iput-object v0, v12, Ll/᩶ۨ֫;->֫֫:Ll/ᩳ֨֫;

    move/from16 v0, p29

    .line 365
    iput-boolean v0, v12, Ll/᩶ۨ֫;->ۧ֫:Z

    move/from16 v0, p30

    .line 366
    iput-boolean v0, v12, Ll/᩶ۨ֫;->᩸:Z

    .line 368
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, v12, Ll/᩶ۨ֫;->۟:Ll/ܳ۬ܺ;

    .line 369
    sget-object v0, Ll/᩶ۨ֫;->ܿ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Ll/᩶ۨ֫;->ᩳ֫:I

    return-void
.end method

.method private ֫(Ll/᩸۠֫;Ll/ۗ۠֫;Z)Ll/ܺ᩷ۧ;
    .locals 18
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractor"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 557
    invoke-interface/range {p1 .. p2}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v6

    .line 558
    iget-wide v8, v1, Ll/۟ܽۧ;->ܿ:J

    iget-object v10, v1, Ll/᩶ۨ֫;->ܽ֫:Ll/ۢ֨֫;

    if-eqz p3, :cond_0

    .line 560
    :try_start_0
    iget-boolean v2, v1, Ll/᩶ۨ֫;->᩹:Z

    invoke-virtual {v10, v8, v9, v2}, Ll/ۢ֨֫;->֫(JZ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 565
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 563
    :catch_1
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    .line 568
    :cond_0
    :goto_0
    new-instance v15, Ll/ܺ᩷ۧ;

    iget-wide v4, v0, Ll/ۗ۠֫;->᩻:J

    move-object v2, v15

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Ll/ܺ᩷ۧ;-><init>(Ll/ۢᩴ֫;JJ)V

    .line 571
    iget-object v2, v1, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    if-nez v2, :cond_a

    .line 613
    iget-object v2, v1, Ll/᩶ۨ֫;->֫֫:Ll/ᩳ֨֫;

    invoke-virtual {v15}, Ll/ܺ᩷ۧ;->ۧ()V

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v5, 0xa

    .line 615
    :try_start_1
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 616
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    const/4 v7, 0x0

    .line 157
    invoke-virtual {v15, v7, v7, v5, v6}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_2

    .line 621
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩸()I

    move-result v6

    const v11, 0x494433

    if-eq v6, v11, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x3

    .line 625
    invoke-virtual {v2, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 626
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۚ()I

    move-result v6

    add-int/lit8 v11, v6, 0xa

    .line 628
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۧ()I

    move-result v12

    if-le v11, v12, :cond_2

    .line 629
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    .line 630
    invoke-virtual {v2, v11}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 631
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    invoke-static {v12, v7, v11, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 633
    :cond_2
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    .line 157
    invoke-virtual {v15, v7, v5, v6, v11}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 634
    iget-object v5, v1, Ll/᩶ۨ֫;->֡:Ll/ܿܺۧ;

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    invoke-virtual {v5, v6, v11}, Ll/ܿܺۧ;->֫(I[B)Ll/᩻᩵֫;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_2

    .line 638
    :cond_3
    invoke-virtual {v5}, Ll/᩻᩵֫;->֫()I

    move-result v6

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v6, :cond_5

    .line 640
    invoke-virtual {v5, v11}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v12

    .line 641
    instance-of v13, v12, Ll/ۢܺۧ;

    if-eqz v13, :cond_4

    .line 642
    check-cast v12, Ll/ۢܺۧ;

    const-string v13, "com.apple.streaming.transportStreamTimestamp"

    .line 643
    iget-object v14, v12, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 644
    iget-object v5, v12, Ll/ۢܺۧ;->ܽ:[B

    .line 645
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    const/16 v11, 0x8

    .line 644
    invoke-static {v5, v7, v6, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 646
    invoke-virtual {v2, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 647
    invoke-virtual {v2, v11}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 650
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v5

    const-wide v11, 0x1ffffffffL

    and-long/2addr v5, v11

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :catch_2
    :cond_5
    :goto_2
    move-wide v5, v3

    .line 573
    :goto_3
    invoke-virtual {v15}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 576
    iget-object v2, v1, Ll/᩶ۨ֫;->᩺:Ll/ۙۨ֫;

    if-eqz v2, :cond_6

    .line 577
    check-cast v2, Ll/ۡۨ֫;

    invoke-virtual {v2}, Ll/ۡۨ֫;->֫()Ll/ۡۨ֫;

    move-result-object v0

    move-object v2, v15

    goto :goto_4

    .line 578
    :cond_6
    iget-object v12, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 583
    invoke-interface/range {p1 .. p1}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v16

    .line 578
    iget-object v0, v1, Ll/᩶ۨ֫;->ۘ:Ll/᩹ۨ֫;

    move-object v11, v0

    check-cast v11, Ll/ۖۨ֫;

    iget-object v13, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget-object v14, v1, Ll/᩶ۨ֫;->۬:Ljava/util/List;

    iget-object v0, v1, Ll/᩶ۨ֫;->ܽ֫:Ll/ۢ֨֫;

    move-object v2, v15

    move-object v15, v0

    move-object/from16 v17, v2

    invoke-virtual/range {v11 .. v17}, Ll/ۖۨ֫;->֫(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/util/List;Ll/ۢ֨֫;Ljava/util/Map;Ll/ܺ᩷ۧ;)Ll/ۡۨ֫;

    move-result-object v0

    :goto_4
    iput-object v0, v1, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    .line 107
    iget-object v0, v0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v0

    .line 108
    instance-of v7, v0, Ll/᩻֡ۧ;

    if-nez v7, :cond_8

    instance-of v7, v0, Ll/ܽ֡ۧ;

    if-nez v7, :cond_8

    instance-of v7, v0, Ll/ܿ֡ۧ;

    if-nez v7, :cond_8

    instance-of v0, v0, Ll/ܿۖۧ;

    if-eqz v0, :cond_7

    goto :goto_5

    .line 594
    :cond_7
    iget-object v0, v1, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4}, Ll/ܿ᩺֫;->ܽ(J)V

    goto :goto_6

    .line 587
    :cond_8
    :goto_5
    iget-object v0, v1, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    cmp-long v7, v5, v3

    if-eqz v7, :cond_9

    .line 589
    invoke-virtual {v10, v5, v6}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v8

    .line 587
    :cond_9
    invoke-virtual {v0, v8, v9}, Ll/ܿ᩺֫;->ܽ(J)V

    .line 596
    :goto_6
    iget-object v0, v1, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    invoke-virtual {v0}, Ll/ܿ᩺֫;->ۖ()V

    .line 597
    iget-object v0, v1, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    iget-object v3, v1, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    check-cast v0, Ll/ۡۨ֫;

    .line 97
    iget-object v0, v0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, v3}, Ll/֨᩷ۧ;->֫(Ll/᩸᩷ۧ;)V

    goto :goto_7

    :cond_a
    move-object v2, v15

    .line 599
    :goto_7
    iget-object v0, v1, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    iget-object v3, v1, Ll/᩶ۨ֫;->ܺ:Ll/᩵ᩴ֫;

    invoke-virtual {v0, v3}, Ll/ܿ᩺֫;->֫(Ll/᩵ᩴ֫;)V

    return-object v2
.end method

.method public static ֫(Ll/᩹ۨ֫;Ll/᩸۠֫;Ll/۠ᩴ֫;JLl/ۙ᩺֫;Ll/۠ۨ֫;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLl/᩷᩺֫;Ll/᩶ۨ֫;[B[BZZLl/ܰ۬֫;)Ll/᩶ۨ֫;
    .locals 43

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    .line 108
    iget-object v6, v2, Ll/۠ۨ֫;->ᩳ:Ll/᩹᩺֫;

    .line 109
    new-instance v7, Ll/ۙ۠֫;

    invoke-direct {v7}, Ll/ۙ۠֫;-><init>()V

    iget-object v8, v1, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v9, v6, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    .line 111
    invoke-static {v8, v9}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v7, v9}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    iget-wide v9, v6, Ll/᩹᩺֫;->᩹:J

    .line 112
    invoke-virtual {v7, v9, v10}, Ll/ۙ۠֫;->ۧ(J)V

    iget-wide v9, v6, Ll/᩹᩺֫;->᩸:J

    .line 113
    invoke-virtual {v7, v9, v10}, Ll/ۙ۠֫;->֫(J)V

    .line 114
    iget-boolean v9, v2, Ll/۠ۨ֫;->֫:Z

    if-eqz v9, :cond_0

    const/16 v10, 0x8

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v7, v10}, Ll/ۙ۠֫;->֫(I)V

    .line 115
    invoke-virtual {v7}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v14

    if-eqz v4, :cond_1

    const/4 v7, 0x1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    const/16 v16, 0x0

    :goto_1
    if-eqz v16, :cond_2

    .line 125
    iget-object v7, v6, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    invoke-static {v7}, Ll/᩶ۨ֫;->֫(Ljava/lang/String;)[B

    move-result-object v7

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    if-eqz v4, :cond_3

    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    new-instance v10, Ll/ۢۨ֫;

    invoke-direct {v10, v0, v4, v7}, Ll/ۢۨ֫;-><init>(Ll/᩸۠֫;[B[B)V

    move-object v13, v10

    goto :goto_3

    :cond_3
    move-object v13, v0

    .line 130
    :goto_3
    iget-object v4, v6, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    if-eqz v4, :cond_7

    if-eqz v5, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_5

    .line 139
    iget-object v10, v4, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    invoke-static {v10}, Ll/᩶ۨ֫;->֫(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_5

    :cond_5
    const/4 v10, 0x0

    .line 141
    :goto_5
    iget-object v11, v4, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    invoke-static {v8, v11}, Ll/ۡ֨֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 142
    new-instance v11, Ll/ۙ۠֫;

    invoke-direct {v11}, Ll/ۙ۠֫;-><init>()V

    .line 144
    invoke-virtual {v11, v8}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    move/from16 p14, v7

    iget-wide v7, v4, Ll/᩹᩺֫;->᩹:J

    .line 145
    invoke-virtual {v11, v7, v8}, Ll/ۙ۠֫;->ۧ(J)V

    iget-wide v7, v4, Ll/᩹᩺֫;->᩸:J

    .line 146
    invoke-virtual {v11, v7, v8}, Ll/ۙ۠֫;->֫(J)V

    .line 147
    invoke-virtual {v11}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v4

    if-eqz v5, :cond_6

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    new-instance v7, Ll/ۢۨ֫;

    invoke-direct {v7, v0, v5, v10}, Ll/ۢۨ֫;-><init>(Ll/᩸۠֫;[B[B)V

    move-object v0, v7

    :cond_6
    move/from16 v19, p14

    move-object/from16 v17, v0

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v17, v0

    const/16 v19, 0x0

    .line 157
    :goto_6
    iget-wide v7, v6, Ll/᩹᩺֫;->ۨ:J

    add-long v24, p3, v7

    .line 158
    iget-wide v7, v6, Ll/᩹᩺֫;->ۙ:J

    add-long v26, v24, v7

    .line 159
    iget v0, v1, Ll/ۙ᩺֫;->ᩳ:I

    iget v1, v6, Ll/᩹᩺֫;->ۛ:I

    add-int/2addr v0, v1

    if-eqz v3, :cond_c

    .line 166
    iget-object v1, v3, Ll/᩶ۨ֫;->۠:Ll/ۗ۠֫;

    if-eq v4, v1, :cond_9

    if-eqz v4, :cond_8

    if-eqz v1, :cond_8

    .line 167
    iget-object v5, v4, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-object v7, v1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 171
    invoke-virtual {v5, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-wide v7, v4, Ll/ۗ۠֫;->᩻:J

    iget-wide v10, v1, Ll/ۗ۠֫;->᩻:J

    cmp-long v1, v7, v10

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    goto :goto_8

    :cond_9
    :goto_7
    const/4 v1, 0x1

    .line 173
    :goto_8
    iget-object v5, v3, Ll/᩶ۨ֫;->ۨ:Landroid/net/Uri;

    move-object/from16 v7, p7

    .line 174
    invoke-virtual {v7, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-boolean v5, v3, Ll/᩶ۨ֫;->ۙ:Z

    if-eqz v5, :cond_a

    const/4 v5, 0x1

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    .line 175
    :goto_9
    iget-object v8, v3, Ll/᩶ۨ֫;->֡:Ll/ܿܺۧ;

    .line 176
    iget-object v10, v3, Ll/᩶ۨ֫;->֫֫:Ll/ᩳ֨֫;

    if-eqz v1, :cond_b

    if-eqz v5, :cond_b

    .line 181
    iget-boolean v1, v3, Ll/᩶ۨ֫;->ᩴ:Z

    if-nez v1, :cond_b

    iget v1, v3, Ll/᩶ۨ֫;->ۡ:I

    if-ne v1, v0, :cond_b

    .line 182
    iget-object v1, v3, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    goto :goto_a

    :cond_b
    const/4 v1, 0x0

    :goto_a
    move-object/from16 v37, v1

    move-object/from16 v38, v8

    move-object/from16 v39, v10

    goto :goto_b

    :cond_c
    move-object/from16 v7, p7

    .line 185
    new-instance v1, Ll/ܿܺۧ;

    const/4 v3, 0x0

    .line 88
    invoke-direct {v1, v3}, Ll/ܿܺۧ;-><init>(Ll/ܽܺۧ;)V

    .line 186
    new-instance v5, Ll/ᩳ֨֫;

    const/16 v8, 0xa

    invoke-direct {v5, v8}, Ll/ᩳ֨֫;-><init>(I)V

    move-object/from16 v38, v1

    move-object/from16 v37, v3

    move-object/from16 v39, v5

    .line 188
    :goto_b
    new-instance v1, Ll/᩶ۨ֫;

    move-object v11, v1

    iget-wide v7, v2, Ll/۠ۨ֫;->ۧ:J

    move-wide/from16 v28, v7

    iget v2, v2, Ll/۠ۨ֫;->ܽ:I

    move/from16 v30, v2

    xor-int/lit8 v31, v9, 0x1

    iget-boolean v2, v6, Ll/᩹᩺֫;->۫:Z

    move/from16 v33, v2

    move-object/from16 v2, p12

    .line 209
    invoke-virtual {v2, v0}, Ll/᩷᩺֫;->֫(I)Ll/ۢ֨֫;

    move-result-object v35

    iget-object v2, v6, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    move-object/from16 v36, v2

    move-object/from16 v12, p0

    move-object/from16 v15, p2

    move-object/from16 v18, v4

    move-object/from16 v20, p7

    move-object/from16 v21, p8

    move/from16 v22, p9

    move-object/from16 v23, p10

    move/from16 v32, v0

    move/from16 v34, p11

    move/from16 v40, p16

    move/from16 v41, p17

    move-object/from16 v42, p18

    invoke-direct/range {v11 .. v42}, Ll/᩶ۨ֫;-><init>(Ll/᩹ۨ֫;Ll/᩸۠֫;Ll/ۗ۠֫;Ll/۠ᩴ֫;ZLl/᩸۠֫;Ll/ۗ۠֫;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLl/ۢ֨֫;Ll/᩵ᩴ֫;Ll/ۙۨ֫;Ll/ܿܺۧ;Ll/ᩳ֨֫;ZZLl/ܰ۬֫;)V

    return-object v1
.end method

.method private ֫(Ll/᩸۠֫;Ll/ۗ۠֫;ZZ)V
    .locals 7
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 523
    iget p3, p0, Ll/᩶ۨ֫;->۫:I

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    move v1, p3

    move-object p3, p2

    goto :goto_2

    .line 525
    :cond_1
    iget p3, p0, Ll/᩶ۨ֫;->۫:I

    int-to-long v1, p3

    .line 520
    iget-wide v3, p2, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v5, -0x1

    cmp-long p3, v3, v5

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    sub-long v5, v3, v1

    :goto_1
    invoke-virtual {p2, v1, v2, v5, v6}, Ll/ۗ۠֫;->֫(JJ)Ll/ۗ۠֫;

    move-result-object p3

    const/4 v1, 0x0

    .line 530
    :goto_2
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, Ll/᩶ۨ֫;->֫(Ll/᩸۠֫;Ll/ۗ۠֫;Z)Ll/ܺ᩷ۧ;

    move-result-object p3

    if-eqz v1, :cond_3

    .line 532
    iget p4, p0, Ll/᩶ۨ֫;->۫:I

    .line 117
    invoke-virtual {p3, p4, v0}, Ll/ܺ᩷ۧ;->֫(IZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 535
    :cond_3
    :goto_3
    :try_start_1
    iget-boolean p4, p0, Ll/᩶ۨ֫;->᩶:Z

    if-nez p4, :cond_4

    iget-object p4, p0, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    check-cast p4, Ll/ۡۨ֫;

    invoke-virtual {p4, p3}, Ll/ۡۨ֫;->֫(Ll/ܺ᩷ۧ;)Z

    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p4, :cond_4

    goto :goto_3

    .line 545
    :cond_4
    :goto_4
    :try_start_2
    invoke-virtual {p3}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_0
    move-exception p4

    goto :goto_6

    :catch_0
    move-exception p4

    .line 537
    :try_start_3
    iget-object v0, p0, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget v0, v0, Ll/۠ᩴ֫;->۟:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_5

    .line 540
    iget-object p4, p0, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    check-cast p4, Ll/ۡۨ֫;

    .line 159
    iget-object p4, p4, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    const-wide/16 v0, 0x0

    invoke-interface {p4, v0, v1, v0, v1}, Ll/֨᩷ۧ;->֫(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    .line 545
    :goto_5
    :try_start_4
    iget-wide v0, p2, Ll/ۗ۠֫;->᩻:J

    sub-long/2addr p3, v0

    long-to-int p2, p3

    iput p2, p0, Ll/᩶ۨ֫;->۫:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 548
    invoke-static {p1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    return-void

    .line 542
    :cond_5
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 545
    :goto_6
    :try_start_6
    invoke-virtual {p3}, Ll/ܺ᩷ۧ;->getPosition()J

    move-result-wide v0

    iget-wide p2, p2, Ll/ۗ۠֫;->᩻:J

    sub-long/2addr v0, p2

    long-to-int p2, v0

    iput p2, p0, Ll/᩶ۨ֫;->۫:I

    .line 546
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p2

    .line 548
    invoke-static {p1}, Ll/ۡ۠ۘ;->֫(Ll/᩸۠֫;)V

    .line 549
    throw p2
.end method

.method public static ֫(Ll/᩶ۨ֫;JLandroid/net/Uri;ZLl/۠ۨ֫;J)Z
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 245
    :cond_0
    iget-object v0, p0, Ll/᩶ۨ֫;->ۨ:Landroid/net/Uri;

    invoke-virtual {p3, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-boolean p0, p0, Ll/᩶ۨ֫;->ۙ:Z

    if-eqz p0, :cond_1

    goto :goto_0

    .line 252
    :cond_1
    iget-object p0, p5, Ll/۠ۨ֫;->ᩳ:Ll/᩹᩺֫;

    iget-wide v0, p0, Ll/᩹᩺֫;->ۨ:J

    add-long/2addr p6, v0

    if-eqz p4, :cond_3

    cmp-long p0, p6, p1

    if-gez p0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 4

    .line 661
    invoke-static {p0}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 662
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 667
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    new-array v0, v1, [B

    .line 669
    array-length v2, p0

    if-le v2, v1, :cond_1

    array-length v2, p0

    sub-int/2addr v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 670
    :goto_0
    array-length v3, p0

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    array-length v3, p0

    sub-int/2addr v3, v2

    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 393
    iget-boolean v0, p0, Ll/᩶ۨ֫;->ۧ֫:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 394
    iget-object v0, p0, Ll/᩶ۨ֫;->۟:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 398
    :cond_0
    iget-object v0, p0, Ll/᩶ۨ֫;->۟:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 4

    .line 435
    iget-object v0, p0, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    iget-object v0, p0, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩶ۨ֫;->᩺:Ll/ۙۨ֫;

    if-eqz v0, :cond_1

    check-cast v0, Ll/ۡۨ֫;

    .line 116
    iget-object v0, v0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v0

    .line 117
    instance-of v2, v0, Ll/ܺۚۧ;

    if-nez v2, :cond_0

    instance-of v0, v0, Ll/۬ۖۧ;

    if-eqz v0, :cond_1

    .line 437
    :cond_0
    iget-object v0, p0, Ll/᩶ۨ֫;->᩺:Ll/ۙۨ֫;

    iput-object v0, p0, Ll/᩶ۨ֫;->ۖ:Ll/ۙۨ֫;

    .line 438
    iput-boolean v1, p0, Ll/᩶ۨ֫;->ۚ:Z

    .line 482
    :cond_1
    iget-object v0, p0, Ll/᩶ۨ֫;->۠:Ll/ۗ۠֫;

    iget-object v2, p0, Ll/᩶ۨ֫;->֨:Ll/᩸۠֫;

    iget-boolean v3, p0, Ll/᩶ۨ֫;->ۚ:Z

    if-nez v3, :cond_2

    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    iget-boolean v3, p0, Ll/᩶ۨ֫;->ܶ:Z

    invoke-direct {p0, v2, v0, v3, v1}, Ll/᩶ۨ֫;->֫(Ll/᩸۠֫;Ll/ۗ۠֫;ZZ)V

    .line 493
    iput v1, p0, Ll/᩶ۨ֫;->۫:I

    .line 494
    iput-boolean v1, p0, Ll/᩶ۨ֫;->ۚ:Z

    .line 441
    :goto_0
    iget-boolean v0, p0, Ll/᩶ۨ֫;->᩶:Z

    if-nez v0, :cond_4

    .line 442
    iget-boolean v0, p0, Ll/᩶ۨ֫;->᩵:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 499
    iget-object v0, p0, Ll/۟ܽۧ;->֫:Ll/ᩴܶ֫;

    iget-object v2, p0, Ll/۟ܽۧ;->ۧ:Ll/ۗ۠֫;

    iget-boolean v3, p0, Ll/᩶ۨ֫;->ۗ:Z

    invoke-direct {p0, v0, v2, v3, v1}, Ll/᩶ۨ֫;->֫(Ll/᩸۠֫;Ll/ۗ۠֫;ZZ)V

    .line 445
    :cond_3
    iget-boolean v0, p0, Ll/᩶ۨ֫;->᩶:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Ll/᩶ۨ֫;->ۙ:Z

    :cond_4
    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 475
    iput-wide p1, p0, Ll/᩶ۨ֫;->ܰ:J

    return-void
.end method

.method public final ֫(Ll/ܿ᩺֫;Ll/ܳ۬ܺ;)V
    .locals 0

    .line 380
    iput-object p1, p0, Ll/᩶ۨ֫;->ۤ:Ll/ܿ᩺֫;

    .line 381
    iput-object p2, p0, Ll/᩶ۨ֫;->۟:Ll/ܳ۬ܺ;

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x1

    .line 403
    iput-boolean v0, p0, Ll/᩶ۨ֫;->ᩴ:Z

    return-void
.end method

.method public final ۡ()Z
    .locals 1

    .line 409
    iget-boolean v0, p0, Ll/᩶ۨ֫;->ۧ֫:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 5

    .line 454
    iget-wide v0, p0, Ll/᩶ۨ֫;->ܰ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 429
    iput-boolean v0, p0, Ll/᩶ۨ֫;->᩶:Z

    return-void
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 417
    iput-boolean v0, p0, Ll/᩶ۨ֫;->ۧ֫:Z

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 422
    iget-boolean v0, p0, Ll/᩶ۨ֫;->ۙ:Z

    return v0
.end method

.method public final ᩻()J
    .locals 5

    .line 465
    iget-wide v0, p0, Ll/᩶ۨ֫;->ܰ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p0, Ll/۟ܽۧ;->ܿ:J

    add-long/2addr v2, v0

    :cond_0
    return-wide v2
.end method
