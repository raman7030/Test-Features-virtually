.class public final Ll/ᩴ᩺֫;
.super Ljava/lang/Object;
.source "K7MX"

# interfaces
.implements Ll/ܿܰ֫;
.implements Ll/ᩳܳۧ;


# static fields
.field public static final ۧ֫:Ll/ܽ᩷ᩳ;


# instance fields
.field public ֫֫:Ll/ᩳܰ֫;

.field public ۗ:Z

.field public ۙ:J

.field public final ۛ:Ljava/util/HashMap;

.field public ۟:Landroid/net/Uri;

.field public ۤ:Ll/۫᩺֫;

.field public final ۨ:Ll/ܰ᩺֫;

.field public final ۫:Ll/ۧܳۧ;

.field public final ۬:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ܰ:Ll/ۙ᩺֫;

.field public ᩶:Ll/ۡܳۧ;

.field public final ᩸:Ll/᩸ۨ֫;

.field public ᩹:Ll/۠ۧۧ;

.field public ᩺:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 61
    new-instance v0, Ll/ܽ᩷ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩴ᩺֫;->ۧ֫:Ll/ܽ᩷ᩳ;

    return-void
.end method

.method public constructor <init>(Ll/᩸ۨ֫;Ll/ۧܳۧ;Ll/ܰ᩺֫;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Ll/ᩴ᩺֫;->᩸:Ll/᩸ۨ֫;

    .line 127
    iput-object p3, p0, Ll/ᩴ᩺֫;->ۨ:Ll/ܰ᩺֫;

    .line 128
    iput-object p2, p0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    .line 131
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 132
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    iput-wide p1, p0, Ll/ᩴ᩺֫;->ۙ:J

    return-void
.end method

.method public static ֫(Ll/ᩴ᩺֫;Ll/ۙ᩺֫;Ll/ۙ᩺֫;)Ll/ۙ᩺֫;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 8
    iget-boolean v3, v2, Ll/ۙ᩺֫;->᩻:Z

    .line 10
    iget-wide v4, v2, Ll/ۙ᩺֫;->ۡ:J

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    .line 1413
    iget-wide v7, v1, Ll/ۙ᩺֫;->ۡ:J

    cmp-long v9, v4, v7

    if-lez v9, :cond_0

    goto :goto_1

    :cond_0
    if-gez v9, :cond_1

    goto :goto_0

    .line 1420
    :cond_1
    iget-object v7, v2, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    iget-object v8, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v7, v8

    if-eqz v7, :cond_2

    if-lez v7, :cond_3

    goto :goto_1

    .line 1424
    :cond_2
    iget-object v7, v2, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    .line 1425
    iget-object v8, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-gt v7, v8, :cond_4

    if-ne v7, v8, :cond_3

    if-eqz v3, :cond_3

    .line 1426
    iget-boolean v7, v1, Ll/ۙ᩺֫;->᩻:Z

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v6, 0x0

    .line 504
    :cond_4
    :goto_1
    iget-object v14, v2, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    if-nez v6, :cond_7

    if-eqz v3, :cond_6

    .line 1474
    iget-boolean v0, v1, Ll/ۙ᩺֫;->᩻:Z

    if-eqz v0, :cond_5

    return-object v1

    .line 1477
    :cond_5
    new-instance v0, Ll/ۙ᩺֫;

    move-object v2, v0

    iget v3, v1, Ll/ۙ᩺֫;->ۖ:I

    iget-object v4, v1, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v5, v1, Ll/ۤ᩺֫;->ܽ:Ljava/util/List;

    iget-wide v6, v1, Ll/ۙ᩺֫;->֨:J

    iget-boolean v8, v1, Ll/ۙ᩺֫;->ۘ:Z

    iget-wide v9, v1, Ll/ۙ᩺֫;->۠:J

    iget-boolean v11, v1, Ll/ۙ᩺֫;->ܳ:Z

    iget v12, v1, Ll/ۙ᩺֫;->ᩳ:I

    iget-wide v13, v1, Ll/ۙ᩺֫;->ۡ:J

    iget v15, v1, Ll/ۙ᩺֫;->᩹:I

    move-object/from16 p0, v2

    move/from16 p2, v3

    iget-wide v2, v1, Ll/ۙ᩺֫;->ܶ:J

    move-wide/from16 v16, v2

    iget-wide v2, v1, Ll/ۙ᩺֫;->ܺ:J

    move-wide/from16 v18, v2

    iget-boolean v2, v1, Ll/ۤ᩺֫;->ۧ:Z

    move/from16 v20, v2

    iget-boolean v2, v1, Ll/ۙ᩺֫;->᩷:Z

    move/from16 v22, v2

    iget-object v2, v1, Ll/ۙ᩺֫;->ᩴ:Ll/᩵ᩴ֫;

    move-object/from16 v23, v2

    iget-object v2, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    move-object/from16 v24, v2

    iget-object v2, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    move-object/from16 v25, v2

    iget-object v2, v1, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    move-object/from16 v26, v2

    iget-object v2, v1, Ll/ۙ᩺֫;->᩵:Ll/ۢ۬ܺ;

    move-object/from16 v27, v2

    iget-object v1, v1, Ll/ۙ᩺֫;->ۢ:Ll/ܳ۬ܺ;

    move-object/from16 v28, v1

    const/16 v21, 0x1

    move-object/from16 v2, p0

    move/from16 v3, p2

    invoke-direct/range {v2 .. v28}, Ll/ۙ᩺֫;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLl/᩵ᩴ֫;Ljava/util/List;Ljava/util/List;Ll/᩶᩺֫;Ljava/util/Map;Ljava/util/List;)V

    goto :goto_2

    :cond_6
    move-object v0, v1

    :goto_2
    return-object v0

    .line 522
    :cond_7
    iget-boolean v3, v2, Ll/ۙ᩺֫;->᩷:Z

    if-eqz v3, :cond_8

    .line 523
    iget-wide v6, v2, Ll/ۙ᩺֫;->۠:J

    move-wide/from16 v34, v6

    goto :goto_7

    .line 526
    :cond_8
    iget-object v3, v0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    if-eqz v3, :cond_9

    iget-wide v6, v3, Ll/ۙ᩺֫;->۠:J

    goto :goto_3

    :cond_9
    const-wide/16 v6, 0x0

    :goto_3
    if-nez v1, :cond_a

    move-wide v15, v6

    goto :goto_6

    .line 527
    :cond_a
    iget-wide v8, v1, Ll/ۙ᩺֫;->۠:J

    iget-wide v10, v1, Ll/ۙ᩺֫;->ۡ:J

    iget-object v3, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 530
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v12

    move-wide v15, v6

    sub-long v6, v4, v10

    long-to-int v7, v6

    .line 568
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v7, v6, :cond_b

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    goto :goto_4

    :cond_b
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_c

    .line 533
    iget-wide v6, v3, Ll/᩹᩺֫;->ۨ:J

    goto :goto_5

    :cond_c
    int-to-long v6, v12

    sub-long v10, v4, v10

    cmp-long v3, v6, v10

    if-nez v3, :cond_d

    .line 1432
    iget-wide v6, v1, Ll/ۙ᩺֫;->ܿ:J

    :goto_5
    add-long/2addr v8, v6

    move-wide/from16 v34, v8

    goto :goto_7

    :cond_d
    :goto_6
    move-wide/from16 v34, v15

    .line 544
    :goto_7
    iget-boolean v3, v2, Ll/ۙ᩺֫;->ܳ:Z

    if-eqz v3, :cond_f

    .line 545
    iget v0, v2, Ll/ۙ᩺֫;->ᩳ:I

    :cond_e
    :goto_8
    move/from16 v17, v0

    goto :goto_b

    .line 549
    :cond_f
    iget-object v0, v0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    if-eqz v0, :cond_10

    .line 550
    iget v0, v0, Ll/ۙ᩺֫;->ᩳ:I

    goto :goto_9

    :cond_10
    const/4 v0, 0x0

    :goto_9
    if-nez v1, :cond_11

    goto :goto_8

    .line 566
    :cond_11
    iget-wide v6, v1, Ll/ۙ᩺֫;->ۡ:J

    sub-long/2addr v4, v6

    long-to-int v3, v4

    .line 567
    iget-object v4, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 568
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_12

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    goto :goto_a

    :cond_12
    const/4 v3, 0x0

    :goto_a
    if-eqz v3, :cond_e

    .line 557
    iget v0, v1, Ll/ۙ᩺֫;->ᩳ:I

    iget v1, v3, Ll/᩹᩺֫;->ۛ:I

    add-int/2addr v0, v1

    const/4 v1, 0x0

    .line 559
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩺֫;

    iget v1, v1, Ll/᩹᩺֫;->ۛ:I

    sub-int/2addr v0, v1

    goto :goto_8

    .line 1445
    :goto_b
    new-instance v0, Ll/ۙ᩺֫;

    move-object v7, v0

    iget v8, v2, Ll/ۙ᩺֫;->ۖ:I

    iget-object v9, v2, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    iget-object v10, v2, Ll/ۤ᩺֫;->ܽ:Ljava/util/List;

    iget-wide v11, v2, Ll/ۙ᩺֫;->֨:J

    iget-boolean v13, v2, Ll/ۙ᩺֫;->ۘ:Z

    iget-wide v3, v2, Ll/ۙ᩺֫;->ۡ:J

    move-wide/from16 v18, v3

    iget v1, v2, Ll/ۙ᩺֫;->᩹:I

    move/from16 v20, v1

    iget-wide v3, v2, Ll/ۙ᩺֫;->ܶ:J

    move-wide/from16 v21, v3

    iget-wide v3, v2, Ll/ۙ᩺֫;->ܺ:J

    move-wide/from16 v23, v3

    iget-boolean v1, v2, Ll/ۤ᩺֫;->ۧ:Z

    move/from16 v25, v1

    iget-boolean v1, v2, Ll/ۙ᩺֫;->᩻:Z

    move/from16 v26, v1

    iget-boolean v1, v2, Ll/ۙ᩺֫;->᩷:Z

    move/from16 v27, v1

    iget-object v1, v2, Ll/ۙ᩺֫;->ᩴ:Ll/᩵ᩴ֫;

    move-object/from16 v28, v1

    iget-object v1, v2, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    move-object/from16 v30, v1

    iget-object v1, v2, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    move-object/from16 v31, v1

    iget-object v1, v2, Ll/ۙ᩺֫;->᩵:Ll/ۢ۬ܺ;

    move-object/from16 v32, v1

    iget-object v1, v2, Ll/ۙ᩺֫;->ۢ:Ll/ܳ۬ܺ;

    move-object/from16 v33, v1

    const/16 v16, 0x1

    move-object v1, v14

    move-wide/from16 v14, v34

    move-object/from16 v29, v1

    invoke-direct/range {v7 .. v33}, Ll/ۙ᩺֫;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLl/᩵ᩴ֫;Ljava/util/List;Ljava/util/List;Ll/᩶᩺֫;Ljava/util/Map;Ljava/util/List;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ᩴ᩺֫;)Ll/᩸ۨ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->᩸:Ll/᩸ۨ֫;

    return-object p0
.end method

.method public static ֫(Ll/ᩴ᩺֫;Landroid/net/Uri;Ll/ۙ᩺֫;)V
    .locals 2

    .line 479
    iget-object v0, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 480
    iget-object p1, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    if-nez p1, :cond_0

    .line 482
    iget-boolean p1, p2, Ll/ۙ᩺֫;->᩻:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Ll/ᩴ᩺֫;->ۗ:Z

    .line 483
    iget-wide v0, p2, Ll/ۙ᩺֫;->۠:J

    iput-wide v0, p0, Ll/ᩴ᩺֫;->ۙ:J

    .line 485
    :cond_0
    iput-object p2, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    .line 486
    iget-object p1, p0, Ll/ᩴ᩺֫;->֫֫:Ll/ᩳܰ֫;

    invoke-interface {p1, p2}, Ll/ᩳܰ֫;->֫(Ll/ۙ᩺֫;)V

    .line 488
    :cond_1
    iget-object p0, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܰ֫;

    .line 489
    invoke-interface {p1}, Ll/֫ܰ֫;->ᩳ()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ᩴ᩺֫;Landroid/net/Uri;Ll/֫ܳۧ;Z)Z
    .locals 2

    .line 496
    iget-object p0, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܰ֫;

    .line 497
    invoke-interface {v1, p1, p2, p3}, Ll/֫ܰ֫;->֫(Landroid/net/Uri;Ll/֫ܳۧ;Z)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static bridge synthetic ۜ(Ll/ᩴ᩺֫;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->᩺:Landroid/os/Handler;

    return-object p0
.end method

.method public static ۡ(Ll/ᩴ᩺֫;)Z
    .locals 10

    .line 380
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    iget-object v0, v0, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    .line 381
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 382
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    .line 384
    iget-object v6, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬᩺֫;

    iget-object v7, v7, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ᩺֫;

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    invoke-static {v6}, Ll/ۘ᩺֫;->֫(Ll/ۘ᩺֫;)J

    move-result-wide v7

    cmp-long v9, v2, v7

    if-lez v9, :cond_0

    .line 386
    invoke-static {v6}, Ll/ۘ᩺֫;->ܽ(Ll/ۘ᩺֫;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    .line 387
    invoke-direct {p0, v0}, Ll/ᩴ᩺֫;->ܿ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {v6, p0}, Ll/ۘ᩺֫;->ۧ(Ll/ۘ᩺֫;Landroid/net/Uri;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public static bridge synthetic ۢ(Ll/ᩴ᩺֫;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩴ᩺֫;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ᩺֫;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method private ܿ(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    .line 430
    iget-object v0, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    iget-boolean v1, v1, Ll/᩶᩺֫;->֫:Z

    if-eqz v1, :cond_1

    .line 433
    iget-object v0, v0, Ll/ۙ᩺֫;->᩵:Ll/ۢ۬ܺ;

    .line 434
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺֫;

    if-eqz v0, :cond_1

    .line 436
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    .line 437
    iget-wide v1, v0, Ll/ܶ᩺֫;->֫:J

    .line 438
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    .line 437
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 439
    iget v0, v0, Ll/ܶ᩺֫;->ۧ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v1, "_HLS_part"

    .line 441
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 440
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 443
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static bridge synthetic ܿ(Ll/ᩴ᩺֫;)Ll/۫᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ᩴ᩺֫;)Ll/ۙ᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ᩴ᩺֫;)Ll/ܰ᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺֫;->ۨ:Ll/ܰ᩺֫;

    return-object p0
.end method


# virtual methods
.method public final stop()V
    .locals 4

    const/4 v0, 0x0

    .line 174
    iput-object v0, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    .line 175
    iput-object v0, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    .line 176
    iput-object v0, p0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 177
    iput-wide v1, p0, Ll/ᩴ᩺֫;->ۙ:J

    .line 178
    iget-object v1, p0, Ll/ᩴ᩺֫;->᩶:Ll/ۡܳۧ;

    .line 318
    invoke-virtual {v1, v0}, Ll/ۡܳۧ;->֫(Ll/ۜܳۧ;)V

    .line 179
    iput-object v0, p0, Ll/ᩴ᩺֫;->᩶:Ll/ۡܳۧ;

    .line 180
    iget-object v1, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ᩺֫;

    .line 181
    invoke-virtual {v3}, Ll/ۘ᩺֫;->ܿ()V

    goto :goto_0

    .line 183
    :cond_0
    iget-object v2, p0, Ll/ᩴ᩺֫;->᩺:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 184
    iput-object v0, p0, Ll/ᩴ᩺֫;->᩺:Landroid/os/Handler;

    .line 185
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 219
    iget-wide v0, p0, Ll/ᩴ᩺֫;->ۙ:J

    return-wide v0
.end method

.method public final ֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;
    .locals 4

    .line 208
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩺֫;

    .line 209
    invoke-virtual {v1}, Ll/ۘ᩺֫;->֫()Ll/ۙ᩺֫;

    move-result-object v1

    if-eqz v1, :cond_5

    if-eqz p2, :cond_5

    .line 395
    iget-object p2, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 454
    iget-object p2, p0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    iget-object p2, p2, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    const/4 v2, 0x0

    .line 455
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 456
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩺֫;

    iget-object v3, v3, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 396
    iget-object p2, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    if-eqz p2, :cond_0

    iget-boolean p2, p2, Ll/ۙ᩺֫;->᩻:Z

    if-eqz p2, :cond_0

    goto :goto_1

    .line 402
    :cond_0
    iput-object p1, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    .line 403
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ᩺֫;

    .line 404
    invoke-static {p2}, Ll/ۘ᩺֫;->ۧ(Ll/ۘ᩺֫;)Ll/ۙ᩺֫;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 405
    iget-boolean v3, v2, Ll/ۙ᩺֫;->᩻:Z

    if-eqz v3, :cond_1

    .line 406
    iput-object v2, p0, Ll/ᩴ᩺֫;->ܰ:Ll/ۙ᩺֫;

    .line 407
    iget-object p2, p0, Ll/ᩴ᩺֫;->֫֫:Ll/ᩳܰ֫;

    invoke-interface {p2, v2}, Ll/ᩳܰ֫;->֫(Ll/ۙ᩺֫;)V

    goto :goto_1

    .line 411
    :cond_1
    invoke-direct {p0, p1}, Ll/ᩴ᩺֫;->ܿ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {p2, v2}, Ll/ۘ᩺֫;->ۧ(Ll/ۘ᩺֫;Landroid/net/Uri;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 416
    :cond_3
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    .line 417
    invoke-virtual {p1}, Ll/ۘ᩺֫;->֫()Ll/ۙ᩺֫;

    move-result-object p2

    .line 418
    invoke-virtual {p1}, Ll/ۘ᩺֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    .line 421
    invoke-virtual {p1, v0}, Ll/ۘ᩺֫;->ۧ(Z)V

    if-eqz p2, :cond_5

    .line 422
    iget-boolean p2, p2, Ll/ۙ᩺֫;->᩻:Z

    if-nez p2, :cond_5

    .line 425
    invoke-virtual {p1, v0}, Ll/ۘ᩺֫;->֫(Z)V

    :cond_5
    :goto_2
    return-object v1
.end method

.method public final ֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;
    .locals 20

    move-object/from16 v0, p0

    .line 56
    move-object/from16 v1, p1

    check-cast v1, Ll/ۖܳۧ;

    .line 354
    new-instance v3, Ll/ۧۧۧ;

    iget-wide v4, v1, Ll/ۖܳۧ;->ܽ:J

    .line 358
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 359
    invoke-virtual {v1}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 362
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v4, p4

    invoke-direct {v3, v4, v5, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 363
    iget v4, v1, Ll/ۖܳۧ;->ܳ:I

    .line 364
    new-instance v1, Ll/֫ܳۧ;

    move-object/from16 v13, p6

    move/from16 v2, p7

    invoke-direct {v1, v13, v2}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 365
    iget-object v2, v0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    invoke-interface {v2, v1}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v14

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v11, 0x0

    cmp-long v5, v14, v1

    if-nez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 368
    :goto_0
    iget-object v2, v0, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide/from16 v11, v16

    move-object/from16 v13, p6

    move-wide/from16 v18, v14

    move v14, v1

    .line 410
    invoke-virtual/range {v2 .. v14}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v1, :cond_1

    .line 373
    sget-object v1, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    return-object v1

    :cond_1
    move-wide/from16 v1, v18

    const/4 v3, 0x0

    .line 374
    invoke-static {v1, v2, v3}, Ll/ۡܳۧ;->֫(JZ)Ll/ܿܳۧ;

    move-result-object v1

    return-object v1
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 1

    .line 263
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 265
    invoke-virtual {p1, v0}, Ll/ۘ᩺֫;->ۧ(Z)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/net/Uri;Ll/۠ۧۧ;Ll/ᩳܰ֫;)V
    .locals 2

    const/4 v0, 0x0

    .line 715
    invoke-static {v0}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object v0

    .line 143
    iput-object v0, p0, Ll/ᩴ᩺֫;->᩺:Landroid/os/Handler;

    .line 144
    iput-object p2, p0, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    .line 145
    iput-object p3, p0, Ll/ᩴ᩺֫;->֫֫:Ll/ᩳܰ֫;

    .line 146
    new-instance p2, Ll/ۙ۠֫;

    invoke-direct {p2}, Ll/ۙ۠֫;-><init>()V

    .line 148
    invoke-virtual {p2, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const/4 p1, 0x1

    .line 149
    invoke-virtual {p2, p1}, Ll/ۙ۠֫;->֫(I)V

    .line 150
    invoke-virtual {p2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p2

    .line 158
    new-instance p3, Ll/ۖܳۧ;

    iget-object v0, p0, Ll/ᩴ᩺֫;->᩸:Ll/᩸ۨ֫;

    const/4 v1, 0x4

    .line 160
    invoke-interface {v0, v1}, Ll/᩸ۨ֫;->֫(I)Ll/᩸۠֫;

    move-result-object v0

    iget-object v1, p0, Ll/ᩴ᩺֫;->ۨ:Ll/ܰ᩺֫;

    .line 163
    invoke-interface {v1}, Ll/ܰ᩺֫;->֫()Ll/ܺܳۧ;

    move-result-object v1

    invoke-direct {p3, v0, p2, v1}, Ll/ۖܳۧ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ll/ܺܳۧ;)V

    .line 164
    iget-object p2, p0, Ll/ᩴ᩺֫;->᩶:Ll/ۡܳۧ;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 165
    new-instance p1, Ll/ۡܳۧ;

    const-string p2, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    invoke-direct {p1, p2}, Ll/ۡܳۧ;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ᩴ᩺֫;->᩶:Ll/ۡܳۧ;

    .line 166
    iget-object p2, p0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    iget v0, p3, Ll/ۖܳۧ;->ܳ:I

    .line 169
    invoke-interface {p2, v0}, Ll/ۧܳۧ;->֫(I)I

    move-result p2

    .line 166
    invoke-virtual {p1, p3, p0, p2}, Ll/ۡܳۧ;->֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V

    return-void
.end method

.method public final ֫(Ll/֫ܰ֫;)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJ)V
    .locals 26

    move-object/from16 v0, p0

    .line 56
    move-object/from16 v1, p1

    check-cast v1, Ll/ۖܳۧ;

    .line 294
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܿ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ᩺֫;

    .line 296
    instance-of v3, v2, Ll/ۙ᩺֫;

    if-eqz v3, :cond_0

    .line 298
    iget-object v4, v2, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    .line 299
    sget-object v5, Ll/۫᩺֫;->ۘ:Ll/۫᩺֫;

    .line 259
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 106
    new-instance v4, Ll/֨ᩴ֫;

    invoke-direct {v4}, Ll/֨ᩴ֫;-><init>()V

    const-string v5, "0"

    .line 107
    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v5, "application/x-mpegURL"

    invoke-virtual {v4, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v8

    .line 108
    new-instance v4, Ll/۬᩺֫;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, Ll/۬᩺֫;-><init>(Landroid/net/Uri;Ll/۠ᩴ֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    .line 260
    new-instance v4, Ll/۫᩺֫;

    .line 262
    sget-object v25, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/16 v23, 0x0

    .line 271
    sget-object v24, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v14, ""

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v13, v4

    move-object/from16 v15, v25

    move-object/from16 v17, v25

    move-object/from16 v18, v25

    move-object/from16 v19, v25

    move-object/from16 v20, v25

    .line 272
    invoke-direct/range {v13 .. v25}, Ll/۫᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ll/۠ᩴ֫;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    goto :goto_0

    .line 301
    :cond_0
    move-object v4, v2

    check-cast v4, Ll/۫᩺֫;

    .line 303
    :goto_0
    iput-object v4, v0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    .line 304
    iget-object v5, v4, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬᩺֫;

    iget-object v5, v5, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    iput-object v5, v0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    .line 306
    new-instance v5, Ll/ܺ᩺֫;

    invoke-direct {v5, v0}, Ll/ܺ᩺֫;-><init>(Ll/ᩴ᩺֫;)V

    iget-object v7, v0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v7, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    iget-object v4, v4, Ll/۫᩺֫;->ܳ:Ljava/util/List;

    .line 464
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    .line 465
    :goto_1
    iget-object v8, v0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    if-ge v7, v5, :cond_1

    .line 466
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/net/Uri;

    .line 467
    new-instance v10, Ll/ۘ᩺֫;

    invoke-direct {v10, v0, v9}, Ll/ۘ᩺֫;-><init>(Ll/ᩴ᩺֫;Landroid/net/Uri;)V

    .line 468
    invoke-virtual {v8, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 308
    :cond_1
    new-instance v9, Ll/ۧۧۧ;

    .line 312
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 313
    invoke-virtual {v1}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v4

    .line 316
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v10, p4

    invoke-direct {v9, v10, v11, v4}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 317
    iget-object v1, v0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩺֫;

    if-eqz v3, :cond_2

    .line 320
    check-cast v2, Ll/ۙ᩺֫;

    invoke-static {v1, v2, v9}, Ll/ۘ᩺֫;->֫(Ll/ۘ᩺֫;Ll/ۙ᩺֫;Ll/ۧۧۧ;)V

    goto :goto_2

    .line 322
    :cond_2
    invoke-virtual {v1, v6}, Ll/ۘ᩺֫;->֫(Z)V

    .line 324
    :goto_2
    iget-object v1, v0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    iget-object v8, v0, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x4

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 319
    invoke-virtual/range {v8 .. v18}, Ll/۠ۧۧ;->ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJI)V
    .locals 14

    .line 56
    move-object v0, p1

    check-cast v0, Ll/ۖܳۧ;

    if-nez p6, :cond_0

    .line 279
    new-instance v1, Ll/ۧۧۧ;

    iget-wide v2, v0, Ll/ۖܳۧ;->ܽ:J

    iget-object v2, v0, Ll/ۖܳۧ;->ۧ:Ll/ۗ۠֫;

    invoke-direct {v1, v2}, Ll/ۧۧۧ;-><init>(Ll/ۗ۠֫;)V

    goto :goto_0

    .line 280
    :cond_0
    new-instance v1, Ll/ۧۧۧ;

    iget-wide v2, v0, Ll/ۖܳۧ;->ܽ:J

    .line 283
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 284
    invoke-virtual {v0}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 287
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v3, p4

    invoke-direct {v1, v3, v4, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    :goto_0
    move-object v2, v1

    move-object v13, p0

    .line 288
    iget-object v1, v13, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    iget v3, v0, Ll/ۖܳۧ;->ܳ:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v12, p6

    .line 237
    invoke-virtual/range {v1 .. v12}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJZ)V
    .locals 13

    move-object v0, p0

    .line 56
    move-object v1, p1

    check-cast v1, Ll/ۖܳۧ;

    .line 334
    new-instance v3, Ll/ۧۧۧ;

    iget-wide v4, v1, Ll/ۖܳۧ;->ܽ:J

    .line 338
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 339
    invoke-virtual {v1}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 342
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v4, p4

    invoke-direct {v3, v4, v5, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 343
    iget-object v1, v0, Ll/ᩴ᩺֫;->۫:Ll/ۧܳۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    iget-object v2, v0, Ll/ᩴ᩺֫;->᩹:Ll/۠ۧۧ;

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x4

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 361
    invoke-virtual/range {v2 .. v12}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Landroid/net/Uri;J)Z
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    if-eqz p1, :cond_0

    .line 256
    invoke-static {p1, p2, p3}, Ll/ۘ᩺֫;->֫(Ll/ۘ᩺֫;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/۫᩺֫;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۤ:Ll/۫᩺֫;

    return-object v0
.end method

.method public final ۧ(Landroid/net/Uri;)V
    .locals 1

    .line 239
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    invoke-virtual {p1}, Ll/ۘ᩺֫;->ᩳ()V

    return-void
.end method

.method public final ۧ(Ll/֫ܰ֫;)V
    .locals 1

    .line 191
    iget-object v0, p0, Ll/ᩴ᩺֫;->۬:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ(Landroid/net/Uri;)V
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/ۘ᩺֫;->֫(Z)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 249
    iget-boolean v0, p0, Ll/ᩴ᩺֫;->ۗ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ᩴ᩺֫;->᩶:Ll/ۡܳۧ;

    if-eqz v0, :cond_0

    const/high16 v1, -0x80000000

    .line 341
    invoke-virtual {v0, v1}, Ll/ۡܳۧ;->֫(I)V

    .line 232
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺֫;->۟:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 233
    invoke-virtual {p0, v0}, Ll/ᩴ᩺֫;->ۧ(Landroid/net/Uri;)V

    :cond_1
    return-void
.end method

.method public final ᩳ(Landroid/net/Uri;)Z
    .locals 1

    .line 224
    iget-object v0, p0, Ll/ᩴ᩺֫;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    invoke-virtual {p1}, Ll/ۘ᩺֫;->ܽ()Z

    move-result p1

    return p1
.end method
