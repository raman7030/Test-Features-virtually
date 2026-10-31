.class public final Ll/᩵ܰ֫;
.super Ll/ۙ᩹֫;
.source "08T5"


# instance fields
.field public ֡֫:J

.field public ֨֫:Ll/ᩴܰ֫;

.field public ۖ֫:Ll/ܺܰ֫;

.field public ۘ֫:Ll/᩸᩸֫;

.field public ۙ֫:Ll/ᩴܰ֫;

.field public ۚ֫:J

.field public ۜ֫:Ll/ۜܰ֫;

.field public ۠֫:Landroid/graphics/Bitmap;

.field public ۡ֫:I

.field public ۢ֫:I

.field public ܳ֫:Z

.field public ܶ֫:Z

.field public final ܺ֫:Ll/᩸᩸֫;

.field public ᩴ֫:Ll/۠ᩴ֫;

.field public ᩵֫:Z

.field public ᩶֫:Z

.field public final ᩷֫:Ll/᩻ܰ֫;

.field public ᩸֫:Ll/ۘܰ֫;

.field public final ᩹֫:Ljava/util/ArrayDeque;

.field public ᩻֫:I


# direct methods
.method public constructor <init>(Ll/᩻ܰ֫;)V
    .locals 3

    const/4 v0, 0x4

    .line 130
    invoke-direct {p0, v0}, Ll/ۙ᩹֫;-><init>(I)V

    .line 131
    iput-object p1, p0, Ll/᩵ܰ֫;->᩷֫:Ll/᩻ܰ֫;

    .line 611
    sget-object p1, Ll/ܺܰ֫;->֫:Ll/ܺܰ֫;

    .line 132
    iput-object p1, p0, Ll/᩵ܰ֫;->ۖ֫:Ll/ܺܰ֫;

    .line 123
    new-instance p1, Ll/᩸᩸֫;

    const/4 v0, 0x0

    .line 132
    invoke-direct {p1, v0, v0}, Ll/᩸᩸֫;-><init>(II)V

    .line 133
    iput-object p1, p0, Ll/᩵ܰ֫;->ܺ֫:Ll/᩸᩸֫;

    .line 134
    sget-object p1, Ll/ۘܰ֫;->ܽ:Ll/ۘܰ֫;

    iput-object p1, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    .line 135
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/᩵ܰ֫;->᩹֫:Ljava/util/ArrayDeque;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 136
    iput-wide v1, p0, Ll/᩵ܰ֫;->֡֫:J

    .line 137
    iput-wide v1, p0, Ll/᩵ܰ֫;->ۚ֫:J

    .line 138
    iput v0, p0, Ll/᩵ܰ֫;->ۢ֫:I

    const/4 p1, 0x1

    .line 139
    iput p1, p0, Ll/᩵ܰ֫;->ۡ֫:I

    return-void
.end method

.method private ֫֫()V
    .locals 4

    .line 520
    iget-boolean v0, p0, Ll/᩵ܰ֫;->ܳ֫:Z

    if-nez v0, :cond_0

    return-void

    .line 524
    :cond_0
    iget-object v0, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    iget-object v1, p0, Ll/᩵ܰ֫;->᩷֫:Ll/᩻ܰ֫;

    invoke-virtual {v1, v0}, Ll/᩻ܰ֫;->֫(Ll/۠ᩴ֫;)I

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    .line 245
    invoke-static {v2, v3, v3, v3}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    invoke-static {v2, v3, v3, v3}, Ll/ۧ۬֫;->֫(IIII)I

    move-result v2

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 530
    :cond_1
    new-instance v0, Ll/ۢܰ֫;

    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 530
    iget-object v1, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    const/16 v2, 0xfa5

    invoke-virtual {p0, v0, v1, v2}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object v0

    throw v0

    .line 525
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    if-eqz v0, :cond_3

    .line 526
    invoke-virtual {v0}, Ll/ۗ᩸֫;->֫()V

    .line 528
    :cond_3
    invoke-virtual {v1}, Ll/᩻ܰ֫;->֫()Ll/ۜܰ֫;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    .line 535
    iput-boolean v3, p0, Ll/᩵ܰ֫;->ܳ֫:Z

    return-void
.end method

.method private ۧ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 550
    iput-object v0, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    const/4 v1, 0x0

    .line 551
    iput v1, p0, Ll/᩵ܰ֫;->ۢ֫:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 552
    iput-wide v1, p0, Ll/᩵ܰ֫;->֡֫:J

    .line 553
    iget-object v1, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    if-eqz v1, :cond_0

    .line 554
    invoke-virtual {v1}, Ll/ۗ᩸֫;->֫()V

    .line 555
    iput-object v0, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    :cond_0
    return-void
.end method

.method private ܽ(J)Z
    .locals 12

    .line 303
    iget-object v0, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    if-nez v0, :cond_0

    goto/16 :goto_8

    .line 306
    :cond_0
    iget v0, p0, Ll/᩵ܰ֫;->ۡ֫:I

    const/4 v2, 0x2

    if-nez v0, :cond_1

    .line 307
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result v0

    if-eq v0, v2, :cond_1

    goto/16 :goto_8

    .line 310
    :cond_1
    iget-object v0, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    iget-object v3, p0, Ll/᩵ܰ֫;->᩹֫:Ljava/util/ArrayDeque;

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-nez v0, :cond_6

    .line 311
    iget-object v0, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    .line 52
    invoke-virtual {v0}, Ll/ۗ᩸֫;->ۧ()Ll/᩶᩸֫;

    move-result-object v0

    check-cast v0, Ll/ۖܰ֫;

    if-nez v0, :cond_2

    goto/16 :goto_8

    .line 316
    :cond_2
    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 317
    iget p1, p0, Ll/᩵ܰ֫;->ۢ֫:I

    if-ne p1, v4, :cond_3

    .line 319
    invoke-direct {p0}, Ll/᩵ܰ֫;->ۧ֫()V

    .line 320
    iget-object p1, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 321
    invoke-direct {p0}, Ll/᩵ܰ֫;->֫֫()V

    return v1

    .line 323
    :cond_3
    invoke-virtual {v0}, Ll/᩶᩸֫;->ᩴ()V

    .line 324
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_15

    .line 325
    iput-boolean v5, p0, Ll/᩵ܰ֫;->ܶ֫:Z

    return v1

    .line 330
    :cond_4
    iget-object v6, v0, Ll/ۖܰ֫;->ۗ:Landroid/graphics/Bitmap;

    if-eqz v6, :cond_5

    .line 332
    iput-object v6, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    .line 333
    invoke-virtual {v0}, Ll/᩶᩸֫;->ᩴ()V

    goto :goto_0

    .line 137
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Non-EOS buffer came back from the decoder without bitmap."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 336
    :cond_6
    :goto_0
    iget-boolean v0, p0, Ll/᩵ܰ֫;->᩶֫:Z

    if-eqz v0, :cond_15

    iget-object v0, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_15

    iget-object v0, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    if-eqz v0, :cond_15

    .line 337
    iget-object v0, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    iget v6, v0, Ll/۠ᩴ֫;->᩻֫:I

    iget v0, v0, Ll/۠ᩴ֫;->ۜ֫:I

    if-ne v6, v5, :cond_7

    if-eq v0, v5, :cond_8

    :cond_7
    const/4 v7, -0x1

    if-eq v6, v7, :cond_8

    if-eq v0, v7, :cond_8

    const/4 v0, 0x1

    goto :goto_1

    :cond_8
    const/4 v0, 0x0

    .line 344
    :goto_1
    iget-object v6, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    invoke-virtual {v6}, Ll/ᩴܰ֫;->ᩳ()Z

    move-result v6

    if-nez v6, :cond_a

    .line 345
    iget-object v6, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    if-eqz v0, :cond_9

    .line 347
    invoke-virtual {v6}, Ll/ᩴܰ֫;->ܽ()I

    move-result v7

    .line 601
    iget-object v8, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    invoke-static {v8}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 602
    iget-object v8, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    iget-object v9, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    invoke-static {v9}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v9, v9, Ll/۠ᩴ֫;->᩻֫:I

    div-int/2addr v8, v9

    .line 603
    iget-object v9, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    iget-object v10, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    invoke-static {v10}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v10, v10, Ll/۠ᩴ֫;->ۜ֫:I

    div-int/2addr v9, v10

    .line 604
    iget-object v10, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    iget v10, v10, Ll/۠ᩴ֫;->᩻֫:I

    rem-int v11, v7, v10

    mul-int v11, v11, v8

    .line 605
    div-int/2addr v7, v10

    mul-int v7, v7, v9

    .line 606
    iget-object v10, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    invoke-static {v10, v11, v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v7

    goto :goto_2

    .line 348
    :cond_9
    iget-object v7, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    invoke-static {v7}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 345
    :goto_2
    invoke-virtual {v6, v7}, Ll/ᩴܰ֫;->֫(Landroid/graphics/Bitmap;)V

    .line 350
    :cond_a
    iget-object v6, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 353
    invoke-virtual {v6}, Ll/ᩴܰ֫;->ۧ()Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object v7, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 354
    invoke-virtual {v7}, Ll/ᩴܰ֫;->֫()J

    move-result-wide v7

    sub-long p1, v7, p1

    .line 374
    invoke-virtual {p0}, Ll/ۙ᩹֫;->getState()I

    move-result v9

    if-ne v9, v2, :cond_b

    const/4 v2, 0x1

    goto :goto_3

    :cond_b
    const/4 v2, 0x0

    .line 375
    :goto_3
    iget v9, p0, Ll/᩵ܰ֫;->ۡ֫:I

    if-eqz v9, :cond_e

    if-eq v9, v5, :cond_d

    if-ne v9, v4, :cond_c

    const/4 v2, 0x0

    goto :goto_4

    .line 383
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_d
    const/4 v2, 0x1

    :cond_e
    :goto_4
    if-nez v2, :cond_10

    const-wide/16 v9, 0x7530

    cmp-long v2, p1, v9

    if-gez v2, :cond_f

    goto :goto_5

    :cond_f
    const/4 p1, 0x0

    goto :goto_6

    .line 406
    :cond_10
    :goto_5
    iget-object p1, p0, Ll/᩵ܰ֫;->ۖ֫:Ll/ܺܰ֫;

    iget-object p2, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    iget-wide v9, p2, Ll/ۘܰ֫;->ۧ:J

    sub-long/2addr v7, v9

    invoke-interface {p1, v7, v8, v6}, Ll/ܺܰ֫;->֫(JLandroid/graphics/Bitmap;)V

    const/4 p1, 0x1

    :goto_6
    if-nez p1, :cond_11

    goto :goto_8

    .line 357
    :cond_11
    iget-object p1, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll/ᩴܰ֫;->֫()J

    move-result-wide p1

    .line 436
    iput-wide p1, p0, Ll/᩵ܰ֫;->ۚ֫:J

    .line 437
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    .line 438
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘܰ֫;

    iget-wide v1, v1, Ll/ۘܰ֫;->֫:J

    cmp-long v6, p1, v1

    if-ltz v6, :cond_12

    .line 439
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘܰ֫;

    iput-object v1, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    goto :goto_7

    .line 358
    :cond_12
    iput v4, p0, Ll/᩵ܰ֫;->ۡ֫:I

    const/4 p1, 0x0

    if-eqz v0, :cond_13

    .line 359
    iget-object p2, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 360
    invoke-static {p2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ll/ᩴܰ֫;->ܽ()I

    move-result p2

    iget-object v0, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 361
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v0, v0, Ll/۠ᩴ֫;->ۜ֫:I

    iget-object v1, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 362
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v1, v1, Ll/۠ᩴ֫;->᩻֫:I

    mul-int v0, v0, v1

    sub-int/2addr v0, v5

    if-ne p2, v0, :cond_14

    .line 364
    :cond_13
    iput-object p1, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    .line 366
    :cond_14
    iget-object p2, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    iput-object p2, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 367
    iput-object p1, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    return v5

    :cond_15
    :goto_8
    return v1
.end method

.method private ᩳ(J)Z
    .locals 11

    .line 449
    iget-boolean v0, p0, Ll/᩵ܰ֫;->᩶֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    if-eqz v0, :cond_0

    goto/16 :goto_9

    .line 452
    :cond_0
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object v0

    .line 453
    iget-object v2, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    if-eqz v2, :cond_15

    iget v3, p0, Ll/᩵ܰ֫;->ۢ֫:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_15

    iget-boolean v3, p0, Ll/᩵ܰ֫;->᩵֫:Z

    if-eqz v3, :cond_1

    goto/16 :goto_9

    .line 459
    :cond_1
    iget-object v3, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    if-nez v3, :cond_2

    .line 460
    invoke-virtual {v2}, Ll/ۗ᩸֫;->ܽ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩸֫;

    iput-object v2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    if-nez v2, :cond_2

    goto/16 :goto_9

    .line 465
    :cond_2
    iget v2, p0, Ll/᩵ܰ֫;->ۢ֫:I

    const/4 v3, 0x2

    const/4 v5, 0x0

    if-ne v2, v3, :cond_3

    .line 466
    iget-object p1, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 467
    iget-object p1, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Ll/ۘ᩸֫;->ܿ(I)V

    .line 468
    iget-object p1, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object p2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-interface {p1, p2}, Ll/᩷ܰ֫;->֫(Ll/᩸᩸֫;)V

    .line 469
    iput-object v5, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    .line 470
    iput v4, p0, Ll/᩵ܰ֫;->ۢ֫:I

    return v1

    .line 473
    :cond_3
    iget-object v2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-virtual {p0, v0, v2, v1}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v2

    const/4 v4, -0x5

    const/4 v6, 0x1

    if-eq v2, v4, :cond_14

    const/4 v0, -0x4

    if-eq v2, v0, :cond_5

    const/4 p1, -0x3

    if-ne v2, p1, :cond_4

    goto/16 :goto_9

    .line 511
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 477
    :cond_5
    iget-object v0, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-virtual {v0}, Ll/᩸᩸֫;->ᩴ()V

    .line 480
    iget-object v0, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    iget-object v0, v0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_6

    .line 481
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-gtz v0, :cond_7

    :cond_6
    iget-object v0, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    .line 482
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    const/4 v0, 0x1

    goto :goto_0

    :cond_8
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_9

    .line 484
    iget-object v2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object v3, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    iput-object v3, v2, Ll/᩸᩸֫;->ۗ:Ll/۠ᩴ֫;

    .line 485
    iget-object v2, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object v3, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ll/᩷ܰ֫;->֫(Ll/᩸᩸֫;)V

    .line 486
    iput v1, p0, Ll/᩵ܰ֫;->᩻֫:I

    .line 488
    :cond_9
    iget-object v2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 564
    invoke-virtual {v2}, Ll/ۘ᩸֫;->᩻()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 565
    iput-boolean v6, p0, Ll/᩵ܰ֫;->᩶֫:Z

    goto/16 :goto_7

    .line 568
    :cond_a
    new-instance v3, Ll/ᩴܰ֫;

    iget v4, p0, Ll/᩵ܰ֫;->᩻֫:I

    iget-wide v7, v2, Ll/᩸᩸֫;->ۤ:J

    invoke-direct {v3, v4, v7, v8}, Ll/ᩴܰ֫;-><init>(IJ)V

    iput-object v3, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    add-int/2addr v4, v6

    .line 569
    iput v4, p0, Ll/᩵ܰ֫;->᩻֫:I

    .line 572
    iget-boolean v2, p0, Ll/᩵ܰ֫;->᩶֫:Z

    if-nez v2, :cond_11

    .line 573
    invoke-virtual {v3}, Ll/ᩴܰ֫;->֫()J

    move-result-wide v2

    const-wide/16 v7, 0x7530

    sub-long v9, v2, v7

    cmp-long v4, v9, p1

    if-gtz v4, :cond_b

    add-long/2addr v7, v2

    cmp-long v4, p1, v7

    if-gtz v4, :cond_b

    const/4 v4, 0x1

    goto :goto_1

    :cond_b
    const/4 v4, 0x0

    .line 577
    :goto_1
    iget-object v7, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    if-eqz v7, :cond_c

    .line 579
    invoke-virtual {v7}, Ll/ᩴܰ֫;->֫()J

    move-result-wide v7

    cmp-long v9, v7, p1

    if-gtz v9, :cond_c

    cmp-long v7, p1, v2

    if-gez v7, :cond_c

    const/4 p1, 0x1

    goto :goto_2

    :cond_c
    const/4 p1, 0x0

    .line 581
    :goto_2
    iget-object p2, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    invoke-static {p2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 593
    iget-object v2, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v2, v2, Ll/۠ᩴ֫;->᩻֫:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_e

    iget-object v2, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    iget v2, v2, Ll/۠ᩴ֫;->ۜ֫:I

    if-eq v2, v3, :cond_e

    .line 595
    invoke-virtual {p2}, Ll/ᩴܰ֫;->ܽ()I

    move-result p2

    iget-object v2, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 596
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget v2, v2, Ll/۠ᩴ֫;->ۜ֫:I

    iget-object v3, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    iget v3, v3, Ll/۠ᩴ֫;->᩻֫:I

    mul-int v2, v2, v3

    sub-int/2addr v2, v6

    if-ne p2, v2, :cond_d

    goto :goto_3

    :cond_d
    const/4 p2, 0x0

    goto :goto_4

    :cond_e
    :goto_3
    const/4 p2, 0x1

    :goto_4
    if-nez v4, :cond_10

    if-nez p1, :cond_10

    if-eqz p2, :cond_f

    goto :goto_5

    :cond_f
    const/4 p2, 0x0

    goto :goto_6

    :cond_10
    :goto_5
    const/4 p2, 0x1

    .line 582
    :goto_6
    iput-boolean p2, p0, Ll/᩵ܰ֫;->᩶֫:Z

    if-eqz p1, :cond_11

    if-nez v4, :cond_11

    goto :goto_7

    .line 588
    :cond_11
    iget-object p1, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    iput-object p1, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 589
    iput-object v5, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    .line 489
    :goto_7
    iget-object p1, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    if-eqz p1, :cond_12

    .line 490
    iput-boolean v6, p0, Ll/᩵ܰ֫;->᩵֫:Z

    .line 491
    iput-object v5, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    return v1

    .line 494
    :cond_12
    iget-wide p1, p0, Ll/᩵ܰ֫;->֡֫:J

    iget-object v1, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    .line 495
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-wide v1, v1, Ll/᩸᩸֫;->ۤ:J

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵ܰ֫;->֡֫:J

    if-eqz v0, :cond_13

    .line 500
    iput-object v5, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    goto :goto_8

    .line 502
    :cond_13
    iget-object p1, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll/᩸᩸֫;->ۧ()V

    .line 504
    :goto_8
    iget-boolean p1, p0, Ll/᩵ܰ֫;->᩶֫:Z

    xor-int/2addr p1, v6

    return p1

    .line 506
    :cond_14
    iget-object p1, v0, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 507
    iput-boolean v6, p0, Ll/᩵ܰ֫;->ܳ֫:Z

    .line 508
    iput v3, p0, Ll/᩵ܰ֫;->ۢ֫:I

    return v6

    :cond_15
    :goto_9
    return v1
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ImageRenderer"

    return-object v0
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 1

    .line 149
    iget-object v0, p0, Ll/᩵ܰ֫;->᩷֫:Ll/᩻ܰ֫;

    invoke-virtual {v0, p1}, Ll/᩻ܰ֫;->֫(Ll/۠ᩴ֫;)I

    move-result p1

    return p1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_0

    return-void

    .line 281
    :cond_0
    instance-of p1, p2, Ll/ܺܰ֫;

    if-eqz p1, :cond_1

    check-cast p2, Ll/ܺܰ֫;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    .line 611
    sget-object p2, Ll/ܺܰ֫;->֫:Ll/ܺܰ֫;

    .line 560
    :cond_2
    iput-object p2, p0, Ll/᩵ܰ֫;->ۖ֫:Ll/ܺܰ֫;

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    .line 154
    iget-boolean p3, p0, Ll/᩵ܰ֫;->ܶ֫:Z

    if-eqz p3, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object p3, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    if-nez p3, :cond_3

    .line 160
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩸()Ll/ۗۙ֫;

    move-result-object p3

    .line 161
    iget-object p4, p0, Ll/᩵ܰ֫;->ܺ֫:Ll/᩸᩸֫;

    invoke-virtual {p4}, Ll/᩸᩸֫;->ۧ()V

    const/4 v0, 0x2

    .line 163
    invoke-virtual {p0, p3, p4, v0}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v0

    const/4 v1, -0x5

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 166
    iget-object p3, p3, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    invoke-static {p3}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iput-object p3, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 167
    iput-boolean v2, p0, Ll/᩵ܰ֫;->ܳ֫:Z

    goto :goto_1

    :cond_1
    const/4 p1, -0x4

    if-ne v0, p1, :cond_2

    .line 170
    invoke-virtual {p4}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 171
    iput-boolean v2, p0, Ll/᩵ܰ֫;->᩵֫:Z

    .line 172
    iput-boolean v2, p0, Ll/᩵ܰ֫;->ܶ֫:Z

    :cond_2
    :goto_0
    return-void

    .line 179
    :cond_3
    :goto_1
    iget-object p3, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    if-nez p3, :cond_4

    invoke-direct {p0}, Ll/᩵ܰ֫;->֫֫()V

    :cond_4
    :try_start_0
    const-string p3, "drainAndFeedDecoder"

    .line 38
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 185
    :goto_2
    invoke-direct {p0, p1, p2}, Ll/᩵ܰ֫;->ܽ(J)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_2

    .line 186
    :cond_5
    :goto_3
    invoke-direct {p0, p1, p2}, Ll/᩵ܰ֫;->ᩳ(J)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_3

    .line 49
    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Ll/ۢܰ֫; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    const/16 p3, 0xfa3

    .line 189
    invoke-virtual {p0, p1, p2, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1
.end method

.method public final ֫(JZ)V
    .locals 0

    const/4 p1, 0x1

    .line 546
    iget p2, p0, Ll/᩵ܰ֫;->ۡ֫:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/᩵ܰ֫;->ۡ֫:I

    const/4 p1, 0x0

    .line 242
    iput-boolean p1, p0, Ll/᩵ܰ֫;->ܶ֫:Z

    .line 243
    iput-boolean p1, p0, Ll/᩵ܰ֫;->᩵֫:Z

    const/4 p2, 0x0

    .line 244
    iput-object p2, p0, Ll/᩵ܰ֫;->۠֫:Landroid/graphics/Bitmap;

    .line 245
    iput-object p2, p0, Ll/᩵ܰ֫;->ۙ֫:Ll/ᩴܰ֫;

    .line 246
    iput-object p2, p0, Ll/᩵ܰ֫;->֨֫:Ll/ᩴܰ֫;

    .line 247
    iput-boolean p1, p0, Ll/᩵ܰ֫;->᩶֫:Z

    .line 248
    iput-object p2, p0, Ll/᩵ܰ֫;->ۘ֫:Ll/᩸᩸֫;

    .line 249
    iget-object p1, p0, Ll/᩵ܰ֫;->ۜ֫:Ll/ۜܰ֫;

    if-eqz p1, :cond_0

    .line 250
    invoke-virtual {p1}, Ll/ۗ᩸֫;->flush()V

    .line 252
    :cond_0
    iget-object p1, p0, Ll/᩵ܰ֫;->᩹֫:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 0

    .line 211
    iput p2, p0, Ll/᩵ܰ֫;->ۡ֫:I

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 4

    .line 223
    iget-object p1, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    iget-wide p1, p1, Ll/ۘܰ֫;->ۧ:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_1

    .line 224
    iget-object p1, p0, Ll/᩵ܰ֫;->᩹֫:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-wide p2, p0, Ll/᩵ܰ֫;->֡֫:J

    cmp-long p6, p2, v0

    if-eqz p6, :cond_1

    iget-wide v2, p0, Ll/᩵ܰ֫;->ۚ֫:J

    cmp-long p6, v2, v0

    if-eqz p6, :cond_0

    cmp-long p6, v2, p2

    if-ltz p6, :cond_0

    goto :goto_0

    .line 233
    :cond_0
    new-instance p2, Ll/ۘܰ֫;

    iget-wide v0, p0, Ll/᩵ܰ֫;->֡֫:J

    invoke-direct {p2, v0, v1, p4, p5}, Ll/ۘܰ֫;-><init>(JJ)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void

    .line 230
    :cond_1
    :goto_0
    new-instance p1, Ll/ۘܰ֫;

    invoke-direct {p1, v0, v1, p4, p5}, Ll/ۘܰ֫;-><init>(JJ)V

    iput-object p1, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    return-void
.end method

.method public final ۛ()V
    .locals 0

    .line 272
    invoke-direct {p0}, Ll/᩵ܰ֫;->ۧ֫()V

    return-void
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 257
    iput-object v0, p0, Ll/᩵ܰ֫;->ᩴ֫:Ll/۠ᩴ֫;

    .line 258
    sget-object v0, Ll/ۘܰ֫;->ܽ:Ll/ۘܰ֫;

    iput-object v0, p0, Ll/᩵ܰ֫;->᩸֫:Ll/ۘܰ֫;

    .line 259
    iget-object v0, p0, Ll/᩵ܰ֫;->᩹֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 260
    invoke-direct {p0}, Ll/᩵ܰ֫;->ۧ֫()V

    .line 261
    iget-object v0, p0, Ll/᩵ܰ֫;->ۖ֫:Ll/ܺܰ֫;

    invoke-interface {v0}, Ll/ܺܰ֫;->֫()V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 202
    iget-boolean v0, p0, Ll/᩵ܰ֫;->ܶ֫:Z

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 195
    iget v0, p0, Ll/᩵ܰ֫;->ۡ֫:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩵ܰ֫;->᩶֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩺()V
    .locals 2

    .line 266
    invoke-direct {p0}, Ll/᩵ܰ֫;->ۧ֫()V

    const/4 v0, 0x1

    .line 546
    iget v1, p0, Ll/᩵ܰ֫;->ۡ֫:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/᩵ܰ֫;->ۡ֫:I

    return-void
.end method
