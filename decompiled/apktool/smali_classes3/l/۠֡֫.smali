.class public final Ll/۠֡֫;
.super Ljava/lang/Object;
.source "68KO"


# instance fields
.field public ֡:[S

.field public ֨:I

.field public ֫:D

.field public ۖ:I

.field public ۘ:[S

.field public ۚ:I

.field public final ۜ:I

.field public ۠:I

.field public final ۡ:I

.field public ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܶ:F

.field public ܺ:I

.field public final ܽ:[S

.field public ܿ:I

.field public ᩳ:[S

.field public ᩴ:I

.field public final ᩵:F

.field public final ᩷:I

.field public ᩸:I

.field public final ᩹:F

.field public ᩻:I


# direct methods
.method public constructor <init>(FIFII)V
    .locals 0

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput p2, p0, Ll/۠֡֫;->ܳ:I

    .line 218
    iput p4, p0, Ll/۠֡֫;->ۧ:I

    .line 219
    iput p1, p0, Ll/۠֡֫;->᩹:F

    .line 220
    iput p3, p0, Ll/۠֡֫;->᩵:F

    int-to-float p1, p2

    int-to-float p3, p5

    div-float/2addr p1, p3

    .line 221
    iput p1, p0, Ll/۠֡֫;->ܶ:F

    .line 222
    div-int/lit16 p1, p2, 0x190

    iput p1, p0, Ll/۠֡֫;->ۡ:I

    .line 223
    div-int/lit8 p2, p2, 0x41

    iput p2, p0, Ll/۠֡֫;->ۜ:I

    mul-int/lit8 p2, p2, 0x2

    .line 224
    iput p2, p0, Ll/۠֡֫;->᩷:I

    .line 225
    new-array p1, p2, [S

    iput-object p1, p0, Ll/۠֡֫;->ܽ:[S

    mul-int p1, p2, p4

    .line 226
    new-array p1, p1, [S

    iput-object p1, p0, Ll/۠֡֫;->ᩳ:[S

    mul-int p1, p2, p4

    .line 227
    new-array p1, p1, [S

    iput-object p1, p0, Ll/۠֡֫;->ۘ:[S

    mul-int p2, p2, p4

    .line 228
    new-array p1, p2, [S

    iput-object p1, p0, Ll/۠֡֫;->֡:[S

    return-void
.end method

.method private ֫([SIII)I
    .locals 8

    .line 412
    iget v0, p0, Ll/۠֡֫;->ۧ:I

    mul-int p2, p2, v0

    const/16 v0, 0xff

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-gt p3, p4, :cond_3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, p3, :cond_0

    add-int v6, p2, v4

    .line 416
    aget-short v6, p1, v6

    add-int v7, p2, p3

    add-int/2addr v7, v4

    .line 417
    aget-short v7, p1, v7

    sub-int/2addr v6, v7

    .line 418
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    mul-int v4, v5, v2

    mul-int v6, v1, p3

    if-ge v4, v6, :cond_1

    move v2, p3

    move v1, v5

    :cond_1
    mul-int v4, v5, v0

    mul-int v6, v3, p3

    if-le v4, v6, :cond_2

    move v0, p3

    move v3, v5

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 432
    :cond_3
    div-int/2addr v1, v2

    iput v1, p0, Ll/۠֡֫;->ۢ:I

    .line 433
    div-int/2addr v3, v0

    iput v3, p0, Ll/۠֡֫;->᩻:I

    return v2
.end method

.method public static ֫(II[SI[SI[SI)V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    mul-int v1, p3, p1

    add-int/2addr v1, v0

    mul-int v2, p7, p1

    add-int/2addr v2, v0

    mul-int v3, p5, p1

    add-int/2addr v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, p0, :cond_0

    .line 690
    aget-short v5, p4, v3

    sub-int v6, p0, v4

    mul-int v6, v6, v5

    aget-short v5, p6, v2

    mul-int v5, v5, v4

    add-int/2addr v5, v6

    div-int/2addr v5, p0

    int-to-short v5, v5

    aput-short v5, p2, v1

    add-int/2addr v1, p1

    add-int/2addr v3, p1

    add-int/2addr v2, p1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫([SII)V
    .locals 3

    .line 372
    iget-object v0, p0, Ll/۠֡֫;->ۘ:[S

    iget v1, p0, Ll/۠֡֫;->ᩴ:I

    invoke-direct {p0, v0, v1, p3}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v0

    iput-object v0, p0, Ll/۠֡֫;->ۘ:[S

    .line 373
    iget v1, p0, Ll/۠֡֫;->ۧ:I

    mul-int p2, p2, v1

    iget v2, p0, Ll/۠֡֫;->ᩴ:I

    mul-int v2, v2, v1

    mul-int v1, v1, p3

    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 379
    iget p1, p0, Ll/۠֡֫;->ᩴ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/۠֡֫;->ᩴ:I

    return-void
.end method

.method private ۧ([SII)V
    .locals 5

    .line 392
    iget v0, p0, Ll/۠֡֫;->᩷:I

    div-int/2addr v0, p3

    .line 393
    iget v1, p0, Ll/۠֡֫;->ۧ:I

    mul-int p3, p3, v1

    mul-int p2, p2, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, p3, :cond_0

    .line 397
    invoke-static {v1, p3, p2, v2}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v4

    .line 398
    aget-short v4, p1, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 400
    :cond_0
    div-int/2addr v3, p3

    .line 401
    iget-object v2, p0, Ll/۠֡֫;->ܽ:[S

    int-to-short v3, v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܽ([SII)[S
    .locals 2

    .line 355
    array-length v0, p1

    iget v1, p0, Ll/۠֡֫;->ۧ:I

    div-int/2addr v0, v1

    add-int/2addr p2, p3

    if-gt p2, v0, :cond_0

    return-object p1

    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 359
    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p3

    mul-int v0, v0, v1

    .line 360
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    move-result-object p1

    return-object p1
.end method

.method private ܿ()V
    .locals 22

    move-object/from16 v0, p0

    .line 662
    iget v1, v0, Ll/۠֡֫;->ᩴ:I

    .line 663
    iget v2, v0, Ll/۠֡֫;->᩹:F

    iget v3, v0, Ll/۠֡֫;->᩵:F

    div-float/2addr v2, v3

    float-to-double v4, v2

    .line 664
    iget v2, v0, Ll/۠֡֫;->ܶ:F

    mul-float v2, v2, v3

    const-wide v6, 0x3ff0000a80000000L    # 1.0000100135803223

    .line 665
    iget v3, v0, Ll/۠֡֫;->ܳ:I

    const/4 v8, 0x1

    iget v9, v0, Ll/۠֡֫;->ۧ:I

    const/4 v10, 0x0

    cmpl-double v11, v4, v6

    if-gtz v11, :cond_1

    const-wide v6, 0x3fefffeb00000000L    # 0.9999899864196777

    cmpg-double v11, v4, v6

    if-gez v11, :cond_0

    goto :goto_0

    .line 668
    :cond_0
    iget-object v4, v0, Ll/۠֡֫;->ᩳ:[S

    iget v5, v0, Ll/۠֡֫;->ܿ:I

    invoke-direct {v0, v4, v10, v5}, Ll/۠֡֫;->֫([SII)V

    .line 669
    iput v10, v0, Ll/۠֡֫;->ܿ:I

    goto :goto_1

    .line 640
    :cond_1
    :goto_0
    iget v6, v0, Ll/۠֡֫;->ܿ:I

    iget v7, v0, Ll/۠֡֫;->᩷:I

    if-ge v6, v7, :cond_2

    :goto_1
    move/from16 v20, v1

    move/from16 v19, v3

    goto/16 :goto_b

    :cond_2
    const/4 v11, 0x0

    const/4 v15, 0x0

    .line 646
    :goto_2
    iget v11, v0, Ll/۠֡֫;->᩸:I

    if-lez v11, :cond_3

    .line 383
    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 384
    iget-object v10, v0, Ll/۠֡֫;->ᩳ:[S

    invoke-direct {v0, v10, v15, v8}, Ll/۠֡֫;->֫([SII)V

    .line 385
    iget v10, v0, Ll/۠֡֫;->᩸:I

    sub-int/2addr v10, v8

    iput v10, v0, Ll/۠֡֫;->᩸:I

    add-int/2addr v15, v8

    move/from16 v20, v1

    move/from16 v19, v3

    goto/16 :goto_a

    .line 649
    :cond_3
    iget-object v11, v0, Ll/۠֡֫;->ᩳ:[S

    const/16 v12, 0xfa0

    if-le v3, v12, :cond_4

    .line 463
    div-int/lit16 v12, v3, 0xfa0

    goto :goto_3

    :cond_4
    const/4 v12, 0x1

    .line 464
    :goto_3
    iget v13, v0, Ll/۠֡֫;->ۜ:I

    iget v14, v0, Ll/۠֡֫;->ۡ:I

    if-ne v9, v8, :cond_5

    if-ne v12, v8, :cond_5

    .line 465
    invoke-direct {v0, v11, v15, v14, v13}, Ll/۠֡֫;->֫([SIII)I

    move-result v8

    move/from16 v20, v1

    move/from16 v19, v3

    goto :goto_6

    .line 467
    :cond_5
    invoke-direct {v0, v11, v15, v12}, Ll/۠֡֫;->ۧ([SII)V

    .line 468
    div-int v8, v14, v12

    move/from16 v19, v3

    div-int v3, v13, v12

    move/from16 v20, v1

    iget-object v1, v0, Ll/۠֡֫;->ܽ:[S

    invoke-direct {v0, v1, v10, v8, v3}, Ll/۠֡֫;->֫([SIII)I

    move-result v8

    const/4 v3, 0x1

    if-eq v12, v3, :cond_9

    mul-int v8, v8, v12

    mul-int/lit8 v12, v12, 0x4

    sub-int v3, v8, v12

    add-int/2addr v8, v12

    if-ge v3, v14, :cond_6

    goto :goto_4

    :cond_6
    move v14, v3

    :goto_4
    if-le v8, v13, :cond_7

    goto :goto_5

    :cond_7
    move v13, v8

    :goto_5
    const/4 v3, 0x1

    if-ne v9, v3, :cond_8

    .line 480
    invoke-direct {v0, v11, v15, v14, v13}, Ll/۠֡֫;->֫([SIII)I

    move-result v8

    goto :goto_6

    .line 482
    :cond_8
    invoke-direct {v0, v11, v15, v3}, Ll/۠֡֫;->ۧ([SII)V

    .line 483
    invoke-direct {v0, v1, v10, v14, v13}, Ll/۠֡֫;->֫([SIII)I

    move-result v8

    .line 487
    :cond_9
    :goto_6
    iget v1, v0, Ll/۠֡֫;->ۢ:I

    iget v3, v0, Ll/۠֡֫;->᩻:I

    if-eqz v1, :cond_c

    .line 442
    iget v10, v0, Ll/۠֡֫;->۠:I

    if-nez v10, :cond_a

    goto :goto_7

    :cond_a
    mul-int/lit8 v11, v1, 0x3

    if-le v3, v11, :cond_b

    goto :goto_7

    :cond_b
    mul-int/lit8 v3, v1, 0x2

    .line 449
    iget v11, v0, Ll/۠֡֫;->֨:I

    mul-int/lit8 v11, v11, 0x3

    if-gt v3, v11, :cond_d

    :cond_c
    :goto_7
    move v10, v8

    .line 492
    :cond_d
    iput v1, v0, Ll/۠֡֫;->֨:I

    .line 493
    iput v8, v0, Ll/۠֡֫;->۠:I

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v4, v13

    if-lez v1, :cond_f

    .line 651
    iget-object v1, v0, Ll/۠֡֫;->ᩳ:[S

    cmpl-double v3, v4, v11

    if-ltz v3, :cond_e

    int-to-double v11, v10

    sub-double v13, v4, v13

    div-double/2addr v11, v13

    .line 580
    iget-wide v13, v0, Ll/۠֡֫;->֫:D

    add-double/2addr v11, v13

    .line 581
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v3, v13

    int-to-double v13, v3

    sub-double/2addr v11, v13

    .line 582
    iput-wide v11, v0, Ll/۠֡֫;->֫:D

    goto :goto_8

    :cond_e
    int-to-double v13, v10

    sub-double/2addr v11, v4

    mul-double v11, v11, v13

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    sub-double v13, v4, v13

    div-double/2addr v11, v13

    .line 585
    iget-wide v13, v0, Ll/۠֡֫;->֫:D

    add-double/2addr v11, v13

    .line 587
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v3, v13

    iput v3, v0, Ll/۠֡֫;->᩸:I

    int-to-double v13, v3

    sub-double/2addr v11, v13

    .line 588
    iput-wide v11, v0, Ll/۠֡֫;->֫:D

    move v3, v10

    .line 590
    :goto_8
    iget-object v8, v0, Ll/۠֡֫;->ۘ:[S

    iget v11, v0, Ll/۠֡֫;->ᩴ:I

    invoke-direct {v0, v8, v11, v3}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v13

    iput-object v13, v0, Ll/۠֡֫;->ۘ:[S

    .line 591
    iget v14, v0, Ll/۠֡֫;->ᩴ:I

    add-int v18, v15, v10

    iget v12, v0, Ll/۠֡֫;->ۧ:I

    move v11, v3

    move v8, v15

    move-object v15, v1

    move/from16 v16, v8

    move-object/from16 v17, v1

    invoke-static/range {v11 .. v18}, Ll/۠֡֫;->֫(II[SI[SI[SI)V

    .line 600
    iget v1, v0, Ll/۠֡֫;->ᩴ:I

    add-int/2addr v1, v3

    iput v1, v0, Ll/۠֡֫;->ᩴ:I

    add-int/2addr v10, v3

    add-int/2addr v10, v8

    move v15, v10

    goto :goto_a

    :cond_f
    move v8, v15

    .line 653
    iget-object v1, v0, Ll/۠֡֫;->ᩳ:[S

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    cmpg-double v3, v4, v13

    if-gez v3, :cond_10

    int-to-double v11, v10

    mul-double v11, v11, v4

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v13, v4

    div-double/2addr v11, v13

    .line 608
    iget-wide v13, v0, Ll/۠֡֫;->֫:D

    add-double/2addr v11, v13

    .line 609
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v3, v13

    int-to-double v13, v3

    sub-double/2addr v11, v13

    .line 610
    iput-wide v11, v0, Ll/۠֡֫;->֫:D

    goto :goto_9

    :cond_10
    int-to-double v13, v10

    mul-double v11, v11, v4

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v11, v15

    mul-double v11, v11, v13

    sub-double v13, v15, v4

    div-double/2addr v11, v13

    .line 613
    iget-wide v13, v0, Ll/۠֡֫;->֫:D

    add-double/2addr v11, v13

    .line 615
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v3, v13

    iput v3, v0, Ll/۠֡֫;->᩸:I

    int-to-double v13, v3

    sub-double/2addr v11, v13

    .line 616
    iput-wide v11, v0, Ll/۠֡֫;->֫:D

    move v3, v10

    .line 618
    :goto_9
    iget-object v11, v0, Ll/۠֡֫;->ۘ:[S

    iget v12, v0, Ll/۠֡֫;->ᩴ:I

    add-int v15, v10, v3

    .line 619
    invoke-direct {v0, v11, v12, v15}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v11

    iput-object v11, v0, Ll/۠֡֫;->ۘ:[S

    mul-int v12, v8, v9

    .line 620
    iget v13, v0, Ll/۠֡֫;->ᩴ:I

    mul-int v13, v13, v9

    mul-int v14, v10, v9

    invoke-static {v1, v12, v11, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 626
    iget-object v13, v0, Ll/۠֡֫;->ۘ:[S

    iget v11, v0, Ll/۠֡֫;->ᩴ:I

    add-int v14, v11, v10

    add-int v16, v8, v10

    iget v12, v0, Ll/۠֡֫;->ۧ:I

    move v11, v3

    move v10, v15

    move-object v15, v1

    move-object/from16 v17, v1

    move/from16 v18, v8

    invoke-static/range {v11 .. v18}, Ll/۠֡֫;->֫(II[SI[SI[SI)V

    .line 635
    iget v1, v0, Ll/۠֡֫;->ᩴ:I

    add-int/2addr v1, v10

    iput v1, v0, Ll/۠֡֫;->ᩴ:I

    add-int v15, v8, v3

    :goto_a
    add-int v1, v15, v7

    if-le v1, v6, :cond_1a

    .line 365
    iget v1, v0, Ll/۠֡֫;->ܿ:I

    sub-int/2addr v1, v15

    .line 366
    iget-object v3, v0, Ll/۠֡֫;->ᩳ:[S

    mul-int v15, v15, v9

    mul-int v4, v1, v9

    const/4 v5, 0x0

    invoke-static {v3, v15, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 368
    iput v1, v0, Ll/۠֡֫;->ܿ:I

    :goto_b
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_19

    .line 535
    iget v1, v0, Ll/۠֡֫;->ᩴ:I

    move/from16 v3, v20

    if-ne v1, v3, :cond_11

    goto/16 :goto_11

    :cond_11
    move/from16 v1, v19

    int-to-float v4, v1

    div-float/2addr v4, v2

    float-to-long v4, v4

    int-to-long v1, v1

    :goto_c
    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_12

    cmp-long v8, v1, v6

    if-eqz v8, :cond_12

    const-wide/16 v10, 0x2

    .line 544
    rem-long v12, v4, v10

    cmp-long v8, v12, v6

    if-nez v8, :cond_12

    rem-long v12, v1, v10

    cmp-long v8, v12, v6

    if-nez v8, :cond_12

    .line 548
    div-long/2addr v4, v10

    .line 549
    div-long/2addr v1, v10

    goto :goto_c

    .line 498
    :cond_12
    iget v6, v0, Ll/۠֡֫;->ᩴ:I

    sub-int/2addr v6, v3

    .line 499
    iget-object v7, v0, Ll/۠֡֫;->֡:[S

    iget v8, v0, Ll/۠֡֫;->ۚ:I

    invoke-direct {v0, v7, v8, v6}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v7

    iput-object v7, v0, Ll/۠֡֫;->֡:[S

    .line 500
    iget-object v8, v0, Ll/۠֡֫;->ۘ:[S

    mul-int v10, v3, v9

    iget v11, v0, Ll/۠֡֫;->ۚ:I

    mul-int v11, v11, v9

    mul-int v12, v6, v9

    invoke-static {v8, v10, v7, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 506
    iput v3, v0, Ll/۠֡֫;->ᩴ:I

    .line 507
    iget v3, v0, Ll/۠֡֫;->ۚ:I

    add-int/2addr v3, v6

    iput v3, v0, Ll/۠֡֫;->ۚ:I

    const/4 v3, 0x0

    .line 553
    :goto_d
    iget v6, v0, Ll/۠֡֫;->ۚ:I

    add-int/lit8 v7, v6, -0x1

    if-ge v3, v7, :cond_17

    .line 555
    :goto_e
    iget v6, v0, Ll/۠֡֫;->ۖ:I

    const/4 v7, 0x1

    add-int/2addr v6, v7

    int-to-long v10, v6

    mul-long v12, v10, v4

    iget v8, v0, Ll/۠֡֫;->ܺ:I

    int-to-long v14, v8

    mul-long v16, v14, v1

    cmp-long v8, v12, v16

    if-lez v8, :cond_14

    .line 556
    iget-object v6, v0, Ll/۠֡֫;->ۘ:[S

    iget v8, v0, Ll/۠֡֫;->ᩴ:I

    .line 557
    invoke-direct {v0, v6, v8, v7}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v6

    iput-object v6, v0, Ll/۠֡֫;->ۘ:[S

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v9, :cond_13

    .line 560
    iget-object v7, v0, Ll/۠֡֫;->ۘ:[S

    iget v8, v0, Ll/۠֡֫;->ᩴ:I

    mul-int v8, v8, v9

    add-int/2addr v8, v6

    iget-object v10, v0, Ll/۠֡֫;->֡:[S

    mul-int v11, v3, v9

    add-int/2addr v11, v6

    .line 524
    aget-short v12, v10, v11

    add-int/2addr v11, v9

    .line 525
    aget-short v10, v10, v11

    .line 526
    iget v11, v0, Ll/۠֡֫;->ܺ:I

    int-to-long v13, v11

    mul-long v13, v13, v1

    .line 527
    iget v11, v0, Ll/۠֡֫;->ۖ:I

    move-wide/from16 v16, v1

    int-to-long v1, v11

    mul-long v1, v1, v4

    add-int/lit8 v11, v11, 0x1

    move v15, v6

    move-object/from16 v18, v7

    int-to-long v6, v11

    mul-long v6, v6, v4

    sub-long v13, v6, v13

    sub-long/2addr v6, v1

    int-to-long v1, v12

    mul-long v1, v1, v13

    sub-long v11, v6, v13

    int-to-long v13, v10

    mul-long v11, v11, v13

    add-long/2addr v11, v1

    .line 531
    div-long/2addr v11, v6

    long-to-int v1, v11

    int-to-short v1, v1

    .line 561
    aput-short v1, v18, v8

    add-int/lit8 v6, v15, 0x1

    move-wide/from16 v1, v16

    goto :goto_f

    :cond_13
    move-wide/from16 v16, v1

    .line 563
    iget v1, v0, Ll/۠֡֫;->ܺ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/۠֡֫;->ܺ:I

    .line 564
    iget v1, v0, Ll/۠֡֫;->ᩴ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/۠֡֫;->ᩴ:I

    move-wide/from16 v1, v16

    goto :goto_e

    :cond_14
    move-wide/from16 v16, v1

    .line 566
    iput v6, v0, Ll/۠֡֫;->ۖ:I

    cmp-long v1, v10, v16

    if-nez v1, :cond_16

    const/4 v1, 0x0

    .line 568
    iput v1, v0, Ll/۠֡֫;->ۖ:I

    cmp-long v2, v14, v4

    if-nez v2, :cond_15

    const/4 v2, 0x1

    goto :goto_10

    :cond_15
    const/4 v2, 0x0

    .line 569
    :goto_10
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 570
    iput v1, v0, Ll/۠֡֫;->ܺ:I

    :cond_16
    add-int/lit8 v3, v3, 0x1

    move-wide/from16 v1, v16

    goto/16 :goto_d

    :cond_17
    if-nez v7, :cond_18

    goto :goto_11

    .line 514
    :cond_18
    iget-object v1, v0, Ll/۠֡֫;->֡:[S

    mul-int v2, v7, v9

    sub-int/2addr v6, v7

    mul-int v6, v6, v9

    const/4 v3, 0x0

    invoke-static {v1, v2, v1, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 520
    iget v1, v0, Ll/۠֡֫;->ۚ:I

    sub-int/2addr v1, v7

    iput v1, v0, Ll/۠֡֫;->ۚ:I

    :cond_19
    :goto_11
    return-void

    :cond_1a
    move/from16 v1, v19

    move/from16 v3, v20

    const/4 v8, 0x1

    const/4 v10, 0x0

    move/from16 v21, v3

    move v3, v1

    move/from16 v1, v21

    goto/16 :goto_2
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 322
    iput v0, p0, Ll/۠֡֫;->ܿ:I

    .line 323
    iput v0, p0, Ll/۠֡֫;->ᩴ:I

    .line 324
    iput v0, p0, Ll/۠֡֫;->ۚ:I

    .line 325
    iput v0, p0, Ll/۠֡֫;->ۖ:I

    .line 326
    iput v0, p0, Ll/۠֡֫;->ܺ:I

    .line 327
    iput v0, p0, Ll/۠֡֫;->᩸:I

    .line 328
    iput v0, p0, Ll/۠֡֫;->۠:I

    .line 329
    iput v0, p0, Ll/۠֡֫;->֨:I

    .line 330
    iput v0, p0, Ll/۠֡֫;->ۢ:I

    .line 331
    iput v0, p0, Ll/۠֡֫;->᩻:I

    const-wide/16 v0, 0x0

    .line 332
    iput-wide v0, p0, Ll/۠֡֫;->֫:D

    return-void
.end method

.method public final ֫(Ljava/nio/ShortBuffer;)V
    .locals 5

    .line 261
    iget v0, p0, Ll/۠֡֫;->ᩴ:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 262
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget v2, p0, Ll/۠֡֫;->ۧ:I

    div-int/2addr v0, v2

    iget v3, p0, Ll/۠֡֫;->ᩴ:I

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 263
    iget-object v3, p0, Ll/۠֡֫;->ۘ:[S

    mul-int v4, v0, v2

    invoke-virtual {p1, v3, v1, v4}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 264
    iget p1, p0, Ll/۠֡֫;->ᩴ:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/۠֡֫;->ᩴ:I

    .line 265
    iget-object v3, p0, Ll/۠֡֫;->ۘ:[S

    mul-int v0, v0, v2

    mul-int p1, p1, v2

    invoke-static {v3, v0, v3, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 337
    iget v0, p0, Ll/۠֡֫;->ᩴ:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 338
    iget v0, p0, Ll/۠֡֫;->ᩴ:I

    iget v1, p0, Ll/۠֡֫;->ۧ:I

    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۧ(Ljava/nio/ShortBuffer;)V
    .locals 5

    .line 246
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget v1, p0, Ll/۠֡֫;->ۧ:I

    div-int/2addr v0, v1

    mul-int v2, v0, v1

    mul-int/lit8 v2, v2, 0x2

    .line 248
    iget-object v3, p0, Ll/۠֡֫;->ᩳ:[S

    iget v4, p0, Ll/۠֡֫;->ܿ:I

    invoke-direct {p0, v3, v4, v0}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v3

    iput-object v3, p0, Ll/۠֡֫;->ᩳ:[S

    .line 249
    iget v4, p0, Ll/۠֡֫;->ܿ:I

    mul-int v4, v4, v1

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p1, v3, v4, v2}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    .line 250
    iget p1, p0, Ll/۠֡֫;->ܿ:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/۠֡֫;->ܿ:I

    .line 251
    invoke-direct {p0}, Ll/۠֡֫;->ܿ()V

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 236
    iget v0, p0, Ll/۠֡֫;->ܿ:I

    iget v1, p0, Ll/۠֡֫;->ۧ:I

    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ᩳ()V
    .locals 10

    .line 278
    iget v0, p0, Ll/۠֡֫;->ܿ:I

    .line 279
    iget v1, p0, Ll/۠֡֫;->᩹:F

    iget v2, p0, Ll/۠֡֫;->᩵:F

    div-float/2addr v1, v2

    float-to-double v3, v1

    .line 280
    iget v1, p0, Ll/۠֡֫;->ܶ:F

    mul-float v1, v1, v2

    float-to-double v1, v1

    .line 284
    iget v5, p0, Ll/۠֡֫;->᩸:I

    sub-int v6, v0, v5

    .line 289
    iget v7, p0, Ll/۠֡֫;->ᩴ:I

    int-to-double v8, v6

    div-double/2addr v8, v3

    int-to-double v3, v5

    add-double/2addr v8, v3

    iget-wide v3, p0, Ll/۠֡֫;->֫:D

    add-double/2addr v8, v3

    iget v3, p0, Ll/۠֡֫;->ۚ:I

    int-to-double v3, v3

    add-double/2addr v8, v3

    div-double/2addr v8, v1

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    add-double/2addr v8, v1

    double-to-int v1, v8

    add-int/2addr v7, v1

    const-wide/16 v1, 0x0

    .line 298
    iput-wide v1, p0, Ll/۠֡֫;->֫:D

    .line 301
    iget-object v1, p0, Ll/۠֡֫;->ᩳ:[S

    iget v2, p0, Ll/۠֡֫;->᩷:I

    mul-int/lit8 v2, v2, 0x2

    add-int v3, v2, v0

    .line 302
    invoke-direct {p0, v1, v0, v3}, Ll/۠֡֫;->ܽ([SII)[S

    move-result-object v1

    iput-object v1, p0, Ll/۠֡֫;->ᩳ:[S

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 304
    :goto_0
    iget v4, p0, Ll/۠֡֫;->ۧ:I

    mul-int v5, v2, v4

    if-ge v3, v5, :cond_0

    .line 305
    iget-object v5, p0, Ll/۠֡֫;->ᩳ:[S

    mul-int v4, v4, v0

    add-int/2addr v4, v3

    aput-short v1, v5, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 307
    :cond_0
    iget v0, p0, Ll/۠֡֫;->ܿ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/۠֡֫;->ܿ:I

    .line 308
    invoke-direct {p0}, Ll/۠֡֫;->ܿ()V

    .line 310
    iget v0, p0, Ll/۠֡֫;->ᩴ:I

    if-le v0, v7, :cond_1

    .line 312
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/۠֡֫;->ᩴ:I

    .line 315
    :cond_1
    iput v1, p0, Ll/۠֡֫;->ܿ:I

    .line 316
    iput v1, p0, Ll/۠֡֫;->᩸:I

    .line 317
    iput v1, p0, Ll/۠֡֫;->ۚ:I

    return-void
.end method
