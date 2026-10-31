.class public final Ll/ۛۨ֫;
.super Ll/ۢ֫ۧ;
.source "T7N0"

# interfaces
.implements Ll/ᩳܰ֫;


# instance fields
.field public ֫֫:Ll/ۛᩴ֫;

.field public final ۛ:Ll/ᩳ᩸ۡ;

.field public final ۟:Ll/᩹ۨ֫;

.field public final ۤ:Z

.field public final ۧ֫:Ll/ۧܳۧ;

.field public final ۨ:Ll/᩸ۨ֫;

.field public final ܰ:J

.field public final ܳ֫:Ll/ܿܰ֫;

.field public ܽ֫:Ll/ۧ᩵֫;

.field public final ܿ֫:I

.field public ᩳ֫:Ll/֡ܶ֫;

.field public final ᩺:Ll/ۙۛ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer.hls"

    .line 76
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ۧ᩵֫;Ll/᩸ۨ֫;Ll/ۖۨ֫;Ll/ᩳ᩸ۡ;Ll/ۙۛ֫;Ll/ۧܳۧ;Ll/ܿܰ֫;JZI)V
    .locals 0

    .line 481
    invoke-direct {p0}, Ll/ۢ֫ۧ;-><init>()V

    .line 482
    iput-object p1, p0, Ll/ۛۨ֫;->ܽ֫:Ll/ۧ᩵֫;

    .line 483
    iget-object p1, p1, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    iput-object p1, p0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    .line 484
    iput-object p2, p0, Ll/ۛۨ֫;->ۨ:Ll/᩸ۨ֫;

    .line 485
    iput-object p3, p0, Ll/ۛۨ֫;->۟:Ll/᩹ۨ֫;

    .line 486
    iput-object p4, p0, Ll/ۛۨ֫;->ۛ:Ll/ᩳ᩸ۡ;

    .line 488
    iput-object p5, p0, Ll/ۛۨ֫;->᩺:Ll/ۙۛ֫;

    .line 489
    iput-object p6, p0, Ll/ۛۨ֫;->ۧ֫:Ll/ۧܳۧ;

    .line 490
    iput-object p7, p0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    .line 491
    iput-wide p8, p0, Ll/ۛۨ֫;->ܰ:J

    .line 492
    iput-boolean p10, p0, Ll/ۛۨ֫;->ۤ:Z

    .line 493
    iput p11, p0, Ll/ۛۨ֫;->ܿ֫:I

    return-void
.end method

.method public static ֫(JLjava/util/List;)Ll/۠᩺֫;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 762
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 763
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠᩺֫;

    .line 764
    iget-wide v3, v2, Ll/᩹᩺֫;->ۨ:J

    cmp-long v5, v3, p0

    if-gtz v5, :cond_0

    iget-boolean v5, v2, Ll/۠᩺֫;->ܰ:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p0

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;
    .locals 16

    move-object/from16 v0, p0

    .line 542
    invoke-virtual/range {p0 .. p1}, Ll/ۢ֫ۧ;->ۧ(Ll/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object v9

    .line 543
    invoke-virtual/range {p0 .. p1}, Ll/ۢ֫ۧ;->֫(Ll/ܺۧۧ;)Ll/ܶۛ֫;

    move-result-object v7

    .line 544
    new-instance v15, Ll/۫ۨ֫;

    iget-object v5, v0, Ll/ۛۨ֫;->ᩳ֫:Ll/֡ܶ֫;

    iget v13, v0, Ll/ۛۨ֫;->ܿ֫:I

    .line 559
    invoke-virtual/range {p0 .. p0}, Ll/ۢ֫ۧ;->᩻()Ll/ܰ۬֫;

    move-result-object v14

    iget-object v2, v0, Ll/ۛۨ֫;->۟:Ll/᩹ۨ֫;

    iget-object v3, v0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    iget-object v4, v0, Ll/ۛۨ֫;->ۨ:Ll/᩸ۨ֫;

    iget-object v6, v0, Ll/ۛۨ֫;->᩺:Ll/ۙۛ֫;

    iget-object v8, v0, Ll/ۛۨ֫;->ۧ֫:Ll/ۧܳۧ;

    iget-object v11, v0, Ll/ۛۨ֫;->ۛ:Ll/ᩳ᩸ۡ;

    iget-boolean v12, v0, Ll/ۛۨ֫;->ۤ:Z

    move-object v1, v15

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v14}, Ll/۫ۨ֫;-><init>(Ll/᩹ۨ֫;Ll/ܿܰ֫;Ll/᩸ۨ֫;Ll/֡ܶ֫;Ll/ۙۛ֫;Ll/ܶۛ֫;Ll/ۧܳۧ;Ll/۠ۧۧ;Ll/᩸ܿۧ;Ll/ᩳ᩸ۡ;ZILl/ܰ۬֫;)V

    return-object v15
.end method

.method public final declared-synchronized ֫()Ll/ۧ᩵֫;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 500
    :try_start_0
    iget-object v1, p0, Ll/ۛۨ֫;->ܽ֫:Ll/ۧ᩵֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 523
    iput-object p1, p0, Ll/ۛۨ֫;->ᩳ֫:Ll/֡ܶ֫;

    .line 525
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    invoke-virtual {p0}, Ll/ۢ֫ۧ;->᩻()Ll/ܰ۬֫;

    move-result-object v0

    .line 524
    iget-object v1, p0, Ll/ۛۨ֫;->᩺:Ll/ۙۛ֫;

    invoke-interface {v1, p1, v0}, Ll/ۙۛ֫;->֫(Landroid/os/Looper;Ll/ܰ۬֫;)V

    .line 526
    invoke-interface {v1}, Ll/ۙۛ֫;->ۧ()V

    const/4 p1, 0x0

    .line 528
    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->ۧ(Ll/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object p1

    .line 530
    invoke-virtual {p0}, Ll/ۛۨ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v0

    iget-object v0, v0, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    iget-object v0, v0, Ll/ۨᩴ֫;->᩻:Landroid/net/Uri;

    .line 529
    iget-object v1, p0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    invoke-interface {v1, v0, p1, p0}, Ll/ܿܰ֫;->֫(Landroid/net/Uri;Ll/۠ۧۧ;Ll/ᩳܰ֫;)V

    return-void
.end method

.method public final ֫(Ll/ۙ᩺֫;)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 577
    iget-boolean v2, v1, Ll/ۙ᩺֫;->᩷:Z

    iget-boolean v3, v1, Ll/ۙ᩺֫;->ۘ:Z

    iget-object v4, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    iget-wide v5, v1, Ll/ۙ᩺֫;->ܿ:J

    iget-wide v7, v1, Ll/ۙ᩺֫;->֨:J

    iget v9, v1, Ll/ۙ᩺֫;->ۖ:I

    iget-wide v10, v1, Ll/ۙ᩺֫;->۠:J

    if-eqz v2, :cond_0

    invoke-static {v10, v11}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v12

    goto :goto_0

    :cond_0
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    move-wide/from16 v17, v12

    const/4 v2, 0x1

    const/4 v12, 0x2

    if-eq v9, v12, :cond_2

    if-ne v9, v2, :cond_1

    goto :goto_1

    :cond_1
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v15, v12

    goto :goto_2

    :cond_2
    :goto_1
    move-wide/from16 v15, v17

    .line 586
    :goto_2
    new-instance v30, Ll/ۜۡܽ;

    .line 587
    iget-object v2, v0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    invoke-interface {v2}, Ll/ܿܰ֫;->ۧ()Ll/۫᩺֫;

    move-result-object v12

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct/range {v30 .. v30}, Ljava/lang/Object;-><init>()V

    .line 589
    invoke-interface {v2}, Ll/ܿܰ֫;->ܽ()Z

    move-result v12

    if-eqz v12, :cond_13

    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 602
    iget-object v12, v1, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    .line 603
    invoke-interface {v2}, Ll/ܿܰ֫;->֫()J

    move-result-wide v21

    sub-long v23, v10, v21

    .line 605
    iget-boolean v2, v1, Ll/ۙ᩺֫;->᩻:Z

    if-eqz v2, :cond_3

    add-long v21, v23, v5

    move-wide/from16 v25, v21

    goto :goto_3

    :cond_3
    move-wide/from16 v25, v19

    .line 675
    :goto_3
    iget-boolean v13, v1, Ll/ۙ᩺֫;->᩷:Z

    if-eqz v13, :cond_5

    .line 676
    sget-object v13, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3479
    iget-wide v13, v0, Ll/ۛۨ֫;->ܰ:J

    cmp-long v27, v13, v19

    if-nez v27, :cond_4

    .line 3480
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    goto :goto_4

    .line 3481
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v27

    add-long v13, v27, v13

    .line 676
    :goto_4
    invoke-static {v13, v14}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v13

    add-long/2addr v10, v5

    sub-long/2addr v13, v10

    move-wide/from16 v33, v13

    goto :goto_5

    :cond_5
    const-wide/16 v33, 0x0

    .line 608
    :goto_5
    iget-object v10, v0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    iget-wide v10, v10, Ll/ۛᩴ֫;->ܿ:J

    cmp-long v13, v10, v19

    if-eqz v13, :cond_6

    .line 610
    invoke-static {v10, v11}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v10

    :goto_6
    move-wide/from16 v31, v10

    goto :goto_8

    :cond_6
    cmp-long v10, v7, v19

    if-eqz v10, :cond_7

    sub-long v10, v5, v7

    goto :goto_7

    .line 745
    :cond_7
    iget-wide v10, v12, Ll/᩶᩺֫;->ᩳ:J

    cmp-long v13, v10, v19

    if-eqz v13, :cond_8

    iget-wide v13, v1, Ll/ۙ᩺֫;->ܺ:J

    cmp-long v27, v13, v19

    if-eqz v27, :cond_8

    goto :goto_7

    .line 749
    :cond_8
    iget-wide v10, v12, Ll/᩶᩺֫;->ܽ:J

    cmp-long v13, v10, v19

    if-eqz v13, :cond_9

    goto :goto_7

    :cond_9
    const-wide/16 v10, 0x3

    .line 753
    iget-wide v13, v1, Ll/ۙ᩺֫;->ܶ:J

    mul-long v10, v10, v13

    :goto_7
    add-long v10, v10, v33

    goto :goto_6

    :goto_8
    add-long v5, v5, v33

    move-wide/from16 v35, v5

    .line 617
    invoke-static/range {v31 .. v36}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v10

    .line 710
    invoke-virtual/range {p0 .. p0}, Ll/ۛۨ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v13

    iget-object v13, v13, Ll/ۧ᩵֫;->ۧ:Ll/ۛᩴ֫;

    .line 711
    iget v14, v13, Ll/ۛᩴ֫;->ᩳ:F

    const v27, -0x800001

    cmpl-float v14, v14, v27

    if-nez v14, :cond_a

    iget v13, v13, Ll/ۛᩴ֫;->ۧ:F

    cmpl-float v13, v13, v27

    if-nez v13, :cond_a

    iget-wide v13, v12, Ll/᩶᩺֫;->ܽ:J

    cmp-long v27, v13, v19

    if-nez v27, :cond_a

    iget-wide v12, v12, Ll/᩶᩺֫;->ᩳ:J

    cmp-long v14, v12, v19

    if-nez v14, :cond_a

    const/4 v12, 0x1

    goto :goto_9

    :cond_a
    const/4 v12, 0x0

    .line 716
    :goto_9
    new-instance v13, Ll/ۤᩴ֫;

    invoke-direct {v13}, Ll/ۤᩴ֫;-><init>()V

    .line 718
    invoke-static {v10, v11}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v10

    invoke-virtual {v13, v10, v11}, Ll/ۤᩴ֫;->ܽ(J)V

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v12, :cond_b

    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_a

    .line 719
    :cond_b
    iget-object v11, v0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    iget v11, v11, Ll/ۛᩴ֫;->ᩳ:F

    :goto_a
    invoke-virtual {v13, v11}, Ll/ۤᩴ֫;->ۧ(F)V

    if-eqz v12, :cond_c

    goto :goto_b

    .line 720
    :cond_c
    iget-object v10, v0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    iget v10, v10, Ll/ۛᩴ֫;->ۧ:F

    :goto_b
    invoke-virtual {v13, v10}, Ll/ۤᩴ֫;->֫(F)V

    .line 721
    invoke-virtual {v13}, Ll/ۤᩴ֫;->֫()Ll/ۛᩴ֫;

    move-result-object v10

    iput-object v10, v0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    cmp-long v11, v7, v19

    if-eqz v11, :cond_d

    goto :goto_c

    .line 687
    :cond_d
    iget-wide v7, v10, Ll/ۛᩴ֫;->ܿ:J

    invoke-static {v7, v8}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v7

    sub-long v7, v5, v7

    :goto_c
    if-eqz v3, :cond_e

    move-wide v3, v7

    goto :goto_d

    .line 692
    :cond_e
    iget-object v3, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 693
    invoke-static {v7, v8, v3}, Ll/ۛۨ֫;->֫(JLjava/util/List;)Ll/۠᩺֫;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 695
    iget-wide v3, v3, Ll/᩹᩺֫;->ۨ:J

    goto :goto_d

    .line 697
    :cond_f
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_10

    const-wide/16 v3, 0x0

    goto :goto_d

    .line 781
    :cond_10
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v5, 0x1

    .line 780
    invoke-static {v4, v3, v5}, Ll/ۘ֨֫;->֫(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v3

    .line 782
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    .line 702
    iget-object v4, v3, Ll/᩸᩺֫;->ܰ:Ll/ܳ۬ܺ;

    invoke-static {v7, v8, v4}, Ll/ۛۨ֫;->֫(JLjava/util/List;)Ll/۠᩺֫;

    move-result-object v4

    if-eqz v4, :cond_11

    .line 704
    iget-wide v3, v4, Ll/᩹᩺֫;->ۨ:J

    goto :goto_d

    .line 706
    :cond_11
    iget-wide v3, v3, Ll/᩹᩺֫;->ۨ:J

    :goto_d
    const/4 v5, 0x2

    if-ne v9, v5, :cond_12

    .line 622
    iget-boolean v5, v1, Ll/ۙ᩺֫;->ۜ:Z

    if-eqz v5, :cond_12

    const/4 v5, 0x1

    const/16 v29, 0x1

    goto :goto_e

    :cond_12
    const/4 v5, 0x0

    const/16 v29, 0x0

    .line 625
    :goto_e
    new-instance v5, Ll/۠ܽۧ;

    move-object v14, v5

    iget-wide v6, v1, Ll/ۙ᩺֫;->ܿ:J

    move-wide/from16 v21, v6

    xor-int/lit8 v28, v2, 0x1

    .line 637
    invoke-virtual/range {p0 .. p0}, Ll/ۛۨ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v31

    iget-object v1, v0, Ll/ۛۨ֫;->֫֫:Ll/ۛᩴ֫;

    move-object/from16 v32, v1

    const/16 v27, 0x1

    move-wide/from16 v19, v25

    move-wide/from16 v25, v3

    invoke-direct/range {v14 .. v32}, Ll/۠ܽۧ;-><init>(JJJJJJZZZLl/ۜۡܽ;Ll/ۧ᩵֫;Ll/ۛᩴ֫;)V

    goto :goto_12

    :cond_13
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v7, v9

    if-eqz v2, :cond_17

    .line 647
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_10

    :cond_14
    if-nez v3, :cond_16

    cmp-long v2, v7, v5

    if-nez v2, :cond_15

    goto :goto_f

    .line 781
    :cond_15
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    .line 780
    invoke-static {v4, v2, v3}, Ll/ۘ֨֫;->֫(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v2

    .line 782
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩺֫;

    .line 654
    iget-wide v7, v2, Ll/᩹᩺֫;->ۨ:J

    :cond_16
    :goto_f
    move-wide/from16 v25, v7

    goto :goto_11

    :cond_17
    :goto_10
    const-wide/16 v25, 0x0

    .line 658
    :goto_11
    new-instance v5, Ll/۠ܽۧ;

    move-object v14, v5

    iget-wide v1, v1, Ll/ۙ᩺֫;->ܿ:J

    move-wide/from16 v19, v1

    move-wide/from16 v21, v1

    .line 670
    invoke-virtual/range {p0 .. p0}, Ll/ۛۨ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v31

    const/16 v32, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x1

    invoke-direct/range {v14 .. v32}, Ll/۠ܽۧ;-><init>(JJJJJJZZZLl/ۜۡܽ;Ll/ۧ᩵֫;Ll/ۛᩴ֫;)V

    .line 594
    :goto_12
    invoke-virtual {v0, v5}, Ll/ۢ֫ۧ;->֫(Ll/ۙ᩵֫;)V

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 0

    .line 565
    check-cast p1, Ll/۫ۨ֫;

    invoke-virtual {p1}, Ll/۫ۨ֫;->ܳ()V

    return-void
.end method

.method public final declared-synchronized ֫(Ll/ۧ᩵֫;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 518
    :try_start_0
    iput-object p1, p0, Ll/ۛۨ֫;->ܽ֫:Ll/ۧ᩵֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 519
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 1

    .line 537
    iget-object v0, p0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    invoke-interface {v0}, Ll/ܿܰ֫;->ᩳ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 570
    iget-object v0, p0, Ll/ۛۨ֫;->ܳ֫:Ll/ܿܰ֫;

    invoke-interface {v0}, Ll/ܿܰ֫;->stop()V

    .line 571
    iget-object v0, p0, Ll/ۛۨ֫;->᩺:Ll/ۙۛ֫;

    invoke-interface {v0}, Ll/ۙۛ֫;->֫()V

    return-void
.end method
