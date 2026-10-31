.class public final Ll/ܿ۬;
.super Ljava/lang/Object;
.source "7553"


# instance fields
.field public final ֫:[F

.field public ۧ:C


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 414
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    iput-char p1, p0, Ll/ܿ۬;->ۧ:C

    .line 416
    iput-object p2, p0, Ll/ܿ۬;->֫:[F

    return-void
.end method

.method public constructor <init>(Ll/ܿ۬;)V
    .locals 1

    .line 419
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 420
    iget-char v0, p1, Ll/ܿ۬;->ۧ:C

    iput-char v0, p0, Ll/ܿ۬;->ۧ:C

    .line 421
    iget-object p1, p1, Ll/ܿ۬;->֫:[F

    array-length v0, p1

    invoke-static {v0, p1}, Ll/ܳ۬;->֫(I[F)[F

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۬;->֫:[F

    return-void
.end method

.method public static synthetic ֫(Ll/ܿ۬;)C
    .locals 0

    .line 395
    iget-char p0, p0, Ll/ܿ۬;->ۧ:C

    return p0
.end method

.method public static ֫(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 53

    move/from16 v1, p1

    move/from16 v3, p3

    move/from16 v0, p5

    move/from16 v2, p6

    move/from16 v7, p7

    move/from16 v9, p9

    float-to-double v4, v7

    .line 721
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 723
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    .line 724
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v20

    float-to-double v14, v1

    mul-double v10, v14, v18

    move/from16 v6, p2

    float-to-double v12, v6

    mul-double v16, v12, v20

    add-double v16, v16, v10

    float-to-double v10, v0

    div-double v22, v16, v10

    neg-float v8, v1

    float-to-double v6, v8

    mul-double v6, v6, v20

    mul-double v16, v12, v18

    add-double v16, v16, v6

    float-to-double v6, v2

    div-double v24, v16, v6

    move-wide/from16 v16, v10

    float-to-double v10, v3

    mul-double v26, v10, v18

    move/from16 v8, p4

    float-to-double v10, v8

    move-wide/from16 v30, v10

    move-wide/from16 v28, v16

    move-wide/from16 v32, v12

    move-wide/from16 v12, v20

    move-wide/from16 v34, v14

    move-wide/from16 v14, v26

    .line 729
    invoke-static/range {v10 .. v17}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v26

    neg-float v10, v3

    float-to-double v10, v10

    mul-double v14, v10, v20

    move-wide/from16 v10, v30

    move-wide/from16 v12, v18

    move-wide/from16 v16, v6

    .line 730
    invoke-static/range {v10 .. v17}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v10

    sub-double v12, v22, v26

    sub-double v14, v24, v10

    add-double v16, v22, v26

    const-wide/high16 v30, 0x4000000000000000L    # 2.0

    div-double v16, v16, v30

    add-double v36, v24, v10

    div-double v36, v36, v30

    mul-double v38, v12, v12

    mul-double v40, v14, v14

    add-double v40, v40, v38

    const-wide/16 v38, 0x0

    cmpl-double v42, v40, v38

    if-nez v42, :cond_0

    return-void

    :cond_0
    const-wide/high16 v42, 0x3ff0000000000000L    # 1.0

    div-double v44, v42, v40

    const-wide/high16 v46, 0x3fd0000000000000L    # 0.25

    sub-double v44, v44, v46

    cmpg-double v46, v44, v38

    if-gez v46, :cond_1

    .line 746
    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const-wide v6, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v4, v6

    double-to-float v4, v4

    mul-float v5, v0, v4

    mul-float v6, v4, v2

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    .line 747
    invoke-static/range {v0 .. v9}, Ll/ܿ۬;->֫(Landroid/graphics/Path;FFFFFFFZZ)V

    return-void

    .line 751
    :cond_1
    invoke-static/range {v44 .. v45}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double v12, v12, v0

    mul-double v0, v0, v14

    move/from16 v2, p8

    if-ne v2, v9, :cond_2

    sub-double v16, v16, v0

    add-double v36, v36, v12

    goto :goto_0

    :cond_2
    add-double v16, v16, v0

    sub-double v36, v36, v12

    :goto_0
    sub-double v0, v24, v36

    sub-double v2, v22, v16

    .line 764
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    sub-double v10, v10, v36

    sub-double v2, v26, v16

    .line 766
    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    sub-double/2addr v2, v0

    cmpl-double v8, v2, v38

    if-ltz v8, :cond_3

    const/4 v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    :goto_1
    if-eq v9, v10, :cond_5

    const-wide v9, 0x401921fb54442d18L    # 6.283185307179586

    if-lez v8, :cond_4

    sub-double/2addr v2, v9

    goto :goto_2

    :cond_4
    add-double/2addr v2, v9

    :cond_5
    :goto_2
    move-wide/from16 v8, v28

    mul-double v16, v16, v8

    mul-double v36, v36, v6

    mul-double v10, v16, v18

    mul-double v12, v36, v20

    sub-double/2addr v10, v12

    mul-double v16, v16, v20

    mul-double v36, v36, v18

    add-double v36, v36, v16

    const-wide/high16 v12, 0x4010000000000000L    # 4.0

    mul-double v14, v2, v12

    const-wide v16, 0x400921fb54442d18L    # Math.PI

    div-double v14, v14, v16

    .line 814
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v14, v14

    .line 817
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v15

    .line 818
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    .line 819
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    .line 820
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v19

    neg-double v12, v8

    mul-double v21, v12, v15

    mul-double v23, v21, v19

    mul-double v25, v6, v4

    mul-double v27, v25, v17

    sub-double v23, v23, v27

    mul-double v12, v12, v4

    mul-double v19, v19, v12

    mul-double v6, v6, v15

    mul-double v17, v17, v6

    add-double v17, v17, v19

    move-wide/from16 p3, v0

    int-to-double v0, v14

    div-double/2addr v2, v0

    const/4 v0, 0x0

    move-wide/from16 v19, v17

    move-wide/from16 v17, p3

    :goto_3
    if-ge v0, v14, :cond_6

    add-double v27, v17, v2

    .line 827
    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->sin(D)D

    move-result-wide v38

    .line 828
    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->cos(D)D

    move-result-wide v40

    mul-double v44, v8, v15

    mul-double v44, v44, v40

    add-double v44, v44, v10

    mul-double v46, v25, v38

    move-wide/from16 p3, v2

    sub-double v1, v44, v46

    mul-double v44, v8, v4

    mul-double v44, v44, v40

    add-double v44, v44, v36

    mul-double v46, v6, v38

    move-wide/from16 p5, v4

    add-double v3, v46, v44

    mul-double v44, v21, v38

    mul-double v46, v25, v40

    sub-double v44, v44, v46

    mul-double v38, v38, v12

    mul-double v40, v40, v6

    add-double v38, v40, v38

    sub-double v17, v27, v17

    div-double v40, v17, v30

    .line 833
    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->tan(D)D

    move-result-wide v40

    .line 835
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v17

    const-wide/high16 v46, 0x4008000000000000L    # 3.0

    mul-double v48, v40, v46

    mul-double v48, v48, v40

    const-wide/high16 v40, 0x4010000000000000L    # 4.0

    add-double v48, v48, v40

    invoke-static/range {v48 .. v49}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v48

    sub-double v48, v48, v42

    mul-double v48, v48, v17

    div-double v48, v48, v46

    mul-double v23, v23, v48

    move-wide/from16 p1, v6

    add-double v5, v23, v34

    mul-double v19, v19, v48

    move-wide/from16 p7, v8

    add-double v7, v19, v32

    mul-double v17, v48, v44

    move-wide/from16 v19, v10

    sub-double v9, v1, v17

    mul-double v48, v48, v38

    move-wide/from16 v17, v12

    sub-double v11, v3, v48

    const/4 v13, 0x0

    move/from16 v23, v14

    move-object/from16 v14, p0

    .line 842
    invoke-virtual {v14, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    double-to-float v5, v5

    double-to-float v6, v7

    double-to-float v7, v9

    double-to-float v8, v11

    double-to-float v9, v1

    double-to-float v10, v3

    move-object/from16 v46, p0

    move/from16 v47, v5

    move/from16 v48, v6

    move/from16 v49, v7

    move/from16 v50, v8

    move/from16 v51, v9

    move/from16 v52, v10

    .line 844
    invoke-virtual/range {v46 .. v52}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v0, v0, 0x1

    move-wide/from16 v6, p1

    move-wide/from16 v8, p7

    move-wide/from16 v34, v1

    move-wide/from16 v32, v3

    move-wide/from16 v12, v17

    move-wide/from16 v10, v19

    move/from16 v14, v23

    move-wide/from16 v17, v27

    move-wide/from16 v19, v38

    move-wide/from16 v23, v44

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    goto/16 :goto_3

    :cond_6
    return-void
.end method

.method public static ֫(Landroid/graphics/Path;[FCC[F)V
    .locals 22

    move-object/from16 v10, p0

    move/from16 v11, p3

    move-object/from16 v12, p4

    const/4 v0, 0x0

    .line 463
    aget v0, p1, v0

    const/4 v1, 0x1

    .line 464
    aget v1, p1, v1

    const/4 v2, 0x2

    .line 465
    aget v2, p1, v2

    const/4 v3, 0x3

    .line 466
    aget v3, p1, v3

    const/4 v13, 0x4

    .line 467
    aget v4, p1, v13

    const/4 v14, 0x5

    .line 468
    aget v5, p1, v14

    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    .line 475
    :sswitch_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Path;->close()V

    .line 483
    invoke-virtual {v10, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    move v0, v4

    move v2, v0

    move v1, v5

    move v3, v1

    goto :goto_0

    :sswitch_1
    const/4 v6, 0x4

    const/4 v15, 0x4

    goto :goto_1

    :sswitch_2
    const/4 v6, 0x1

    const/4 v15, 0x1

    goto :goto_1

    :sswitch_3
    const/4 v6, 0x6

    const/4 v15, 0x6

    goto :goto_1

    :sswitch_4
    const/4 v6, 0x7

    const/4 v15, 0x7

    goto :goto_1

    :goto_0
    const/4 v6, 0x2

    const/4 v15, 0x2

    :goto_1
    const/4 v6, 0x0

    move v9, v0

    move v8, v1

    move/from16 v16, v4

    move/from16 v17, v5

    const/4 v7, 0x0

    move/from16 v0, p2

    .line 515
    :goto_2
    array-length v1, v12

    if-ge v7, v1, :cond_20

    const/16 v1, 0x41

    if-eq v11, v1, :cond_1d

    const/16 v1, 0x43

    if-eq v11, v1, :cond_1c

    const/16 v1, 0x48

    if-eq v11, v1, :cond_1b

    const/16 v1, 0x51

    if-eq v11, v1, :cond_1a

    const/16 v4, 0x56

    if-eq v11, v4, :cond_19

    const/16 v4, 0x61

    if-eq v11, v4, :cond_16

    const/16 v4, 0x63

    if-eq v11, v4, :cond_15

    const/16 v5, 0x68

    if-eq v11, v5, :cond_14

    const/16 v5, 0x71

    if-eq v11, v5, :cond_13

    const/16 v6, 0x76

    if-eq v11, v6, :cond_12

    const/16 v6, 0x4c

    if-eq v11, v6, :cond_11

    const/16 v6, 0x4d

    if-eq v11, v6, :cond_f

    const/16 v6, 0x73

    const/16 v14, 0x53

    const/high16 v18, 0x40000000    # 2.0f

    if-eq v11, v14, :cond_c

    const/16 v14, 0x74

    const/16 v13, 0x54

    if-eq v11, v13, :cond_9

    const/16 v4, 0x6c

    if-eq v11, v4, :cond_8

    const/16 v4, 0x6d

    if-eq v11, v4, :cond_6

    if-eq v11, v6, :cond_3

    if-eq v11, v14, :cond_0

    goto/16 :goto_b

    :cond_0
    if-eq v0, v5, :cond_2

    if-eq v0, v14, :cond_2

    if-eq v0, v1, :cond_2

    if-ne v0, v13, :cond_1

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    goto :goto_4

    :cond_2
    :goto_3
    sub-float v1, v9, v2

    sub-float v0, v8, v3

    .line 643
    :goto_4
    aget v2, v12, v7

    add-int/lit8 v3, v7, 0x1

    aget v4, v12, v3

    invoke-virtual {v10, v1, v0, v2, v4}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    add-float v2, v1, v9

    add-float/2addr v0, v8

    .line 647
    aget v1, v12, v7

    add-float/2addr v9, v1

    .line 648
    aget v1, v12, v3

    add-float/2addr v8, v1

    move v3, v0

    goto/16 :goto_b

    :cond_3
    const/16 v1, 0x63

    if-eq v0, v1, :cond_5

    if-eq v0, v6, :cond_5

    const/16 v1, 0x43

    if-eq v0, v1, :cond_5

    const/16 v1, 0x53

    if-ne v0, v1, :cond_4

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto :goto_6

    :cond_5
    :goto_5
    sub-float v0, v9, v2

    sub-float v1, v8, v3

    move v2, v1

    move v1, v0

    .line 597
    :goto_6
    aget v3, v12, v7

    add-int/lit8 v13, v7, 0x1

    aget v4, v12, v13

    add-int/lit8 v14, v7, 0x2

    aget v5, v12, v14

    add-int/lit8 v18, v7, 0x3

    aget v6, v12, v18

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 601
    aget v0, v12, v7

    add-float/2addr v0, v9

    .line 602
    aget v1, v12, v13

    add-float/2addr v1, v8

    .line 603
    aget v2, v12, v14

    add-float/2addr v9, v2

    .line 604
    aget v2, v12, v18

    goto/16 :goto_9

    .line 518
    :cond_6
    aget v0, v12, v7

    add-float/2addr v9, v0

    add-int/lit8 v1, v7, 0x1

    .line 519
    aget v1, v12, v1

    add-float/2addr v8, v1

    if-lez v7, :cond_7

    .line 524
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    goto/16 :goto_b

    .line 526
    :cond_7
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->rMoveTo(FF)V

    move/from16 v17, v8

    goto/16 :goto_7

    .line 546
    :cond_8
    aget v0, v12, v7

    add-int/lit8 v1, v7, 0x1

    aget v4, v12, v1

    invoke-virtual {v10, v0, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 547
    aget v0, v12, v7

    add-float/2addr v9, v0

    .line 548
    aget v0, v12, v1

    goto/16 :goto_a

    :cond_9
    if-eq v0, v5, :cond_a

    if-eq v0, v14, :cond_a

    if-eq v0, v1, :cond_a

    if-ne v0, v13, :cond_b

    :cond_a
    mul-float v9, v9, v18

    sub-float/2addr v9, v2

    mul-float v8, v8, v18

    sub-float/2addr v8, v3

    .line 658
    :cond_b
    aget v0, v12, v7

    add-int/lit8 v1, v7, 0x1

    aget v2, v12, v1

    invoke-virtual {v10, v9, v8, v0, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 662
    aget v0, v12, v7

    .line 663
    aget v1, v12, v1

    move/from16 v21, v7

    move v3, v8

    move v2, v9

    move/from16 v18, v15

    goto/16 :goto_f

    :cond_c
    const/16 v1, 0x63

    if-eq v0, v1, :cond_d

    if-eq v0, v6, :cond_d

    const/16 v1, 0x43

    if-eq v0, v1, :cond_d

    const/16 v1, 0x53

    if-ne v0, v1, :cond_e

    :cond_d
    mul-float v9, v9, v18

    sub-float/2addr v9, v2

    mul-float v8, v8, v18

    sub-float/2addr v8, v3

    :cond_e
    move v2, v8

    move v1, v9

    .line 614
    aget v3, v12, v7

    add-int/lit8 v8, v7, 0x1

    aget v4, v12, v8

    add-int/lit8 v9, v7, 0x2

    aget v5, v12, v9

    add-int/lit8 v13, v7, 0x3

    aget v6, v12, v13

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 616
    aget v0, v12, v7

    .line 617
    aget v1, v12, v8

    .line 618
    aget v2, v12, v9

    .line 619
    aget v3, v12, v13

    move v8, v3

    move/from16 v21, v7

    move/from16 v18, v15

    goto/16 :goto_e

    .line 532
    :cond_f
    aget v0, v12, v7

    add-int/lit8 v1, v7, 0x1

    .line 533
    aget v1, v12, v1

    if-lez v7, :cond_10

    .line 538
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_8

    .line 540
    :cond_10
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    move v9, v0

    move/from16 v17, v1

    :goto_7
    move/from16 v16, v9

    move/from16 v8, v17

    goto/16 :goto_b

    .line 551
    :cond_11
    aget v0, v12, v7

    add-int/lit8 v1, v7, 0x1

    aget v4, v12, v1

    invoke-virtual {v10, v0, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 552
    aget v0, v12, v7

    .line 553
    aget v1, v12, v1

    :goto_8
    move v9, v0

    move v8, v1

    goto :goto_b

    .line 564
    :cond_12
    aget v0, v12, v7

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 565
    aget v0, v12, v7

    goto :goto_a

    .line 622
    :cond_13
    aget v0, v12, v7

    add-int/lit8 v1, v7, 0x1

    aget v2, v12, v1

    add-int/lit8 v3, v7, 0x2

    aget v4, v12, v3

    add-int/lit8 v5, v7, 0x3

    aget v6, v12, v5

    invoke-virtual {v10, v0, v2, v4, v6}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 623
    aget v0, v12, v7

    add-float/2addr v0, v9

    .line 624
    aget v1, v12, v1

    add-float/2addr v1, v8

    .line 625
    aget v2, v12, v3

    add-float/2addr v9, v2

    .line 626
    aget v2, v12, v5

    :goto_9
    move v3, v1

    add-float/2addr v8, v2

    move v2, v0

    goto :goto_b

    .line 556
    :cond_14
    aget v0, v12, v7

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 557
    aget v0, v12, v7

    add-float/2addr v9, v0

    goto :goto_b

    .line 572
    :cond_15
    aget v1, v12, v7

    add-int/lit8 v0, v7, 0x1

    aget v2, v12, v0

    add-int/lit8 v13, v7, 0x2

    aget v3, v12, v13

    add-int/lit8 v14, v7, 0x3

    aget v4, v12, v14

    add-int/lit8 v18, v7, 0x4

    aget v5, v12, v18

    add-int/lit8 v19, v7, 0x5

    aget v6, v12, v19

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 575
    aget v0, v12, v13

    add-float v2, v0, v9

    .line 576
    aget v0, v12, v14

    add-float v3, v0, v8

    .line 577
    aget v0, v12, v18

    add-float/2addr v9, v0

    .line 578
    aget v0, v12, v19

    :goto_a
    add-float/2addr v8, v0

    :goto_b
    move/from16 v21, v7

    move/from16 v18, v15

    goto/16 :goto_12

    :cond_16
    add-int/lit8 v13, v7, 0x5

    .line 667
    aget v0, v12, v13

    add-float v3, v0, v9

    add-int/lit8 v14, v7, 0x6

    aget v0, v12, v14

    add-float v4, v0, v8

    aget v5, v12, v7

    add-int/lit8 v0, v7, 0x1

    aget v6, v12, v0

    add-int/lit8 v0, v7, 0x2

    aget v18, v12, v0

    add-int/lit8 v0, v7, 0x3

    aget v0, v12, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_17

    const/4 v0, 0x1

    const/16 v19, 0x1

    goto :goto_c

    :cond_17
    const/4 v0, 0x0

    const/16 v19, 0x0

    :goto_c
    const/4 v0, 0x0

    add-int/lit8 v1, v7, 0x4

    aget v1, v12, v1

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_18

    const/4 v0, 0x1

    const/16 v20, 0x1

    goto :goto_d

    :cond_18
    const/4 v0, 0x0

    const/16 v20, 0x0

    :goto_d
    move-object/from16 v0, p0

    move v1, v9

    move v2, v8

    move/from16 v21, v7

    move/from16 v7, v18

    move v11, v8

    move/from16 v8, v19

    move/from16 v18, v15

    move v15, v9

    move/from16 v9, v20

    invoke-static/range {v0 .. v9}, Ll/ܿ۬;->֫(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 677
    aget v0, v12, v13

    add-float v9, v15, v0

    .line 678
    aget v0, v12, v14

    add-float v8, v11, v0

    move v3, v8

    move v2, v9

    goto/16 :goto_12

    :cond_19
    move/from16 v21, v7

    move/from16 v18, v15

    move v15, v9

    .line 568
    aget v0, v12, v21

    invoke-virtual {v10, v15, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 569
    aget v0, v12, v21

    move v8, v0

    goto/16 :goto_12

    :cond_1a
    move/from16 v21, v7

    move/from16 v18, v15

    .line 629
    aget v0, v12, v21

    add-int/lit8 v7, v21, 0x1

    aget v1, v12, v7

    add-int/lit8 v2, v21, 0x2

    aget v3, v12, v2

    add-int/lit8 v4, v21, 0x3

    aget v5, v12, v4

    invoke-virtual {v10, v0, v1, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 630
    aget v0, v12, v21

    .line 631
    aget v1, v12, v7

    .line 632
    aget v2, v12, v2

    .line 633
    aget v3, v12, v4

    move v8, v3

    :goto_e
    move v3, v1

    move v9, v2

    move v2, v0

    goto/16 :goto_12

    :cond_1b
    move/from16 v21, v7

    move v11, v8

    move/from16 v18, v15

    .line 560
    aget v0, v12, v21

    invoke-virtual {v10, v0, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 561
    aget v0, v12, v21

    move v9, v0

    goto/16 :goto_12

    :cond_1c
    move/from16 v21, v7

    move/from16 v18, v15

    .line 582
    aget v1, v12, v21

    add-int/lit8 v7, v21, 0x1

    aget v2, v12, v7

    add-int/lit8 v7, v21, 0x2

    aget v3, v12, v7

    add-int/lit8 v8, v21, 0x3

    aget v4, v12, v8

    add-int/lit8 v9, v21, 0x4

    aget v5, v12, v9

    add-int/lit8 v11, v21, 0x5

    aget v6, v12, v11

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 584
    aget v0, v12, v9

    .line 585
    aget v1, v12, v11

    .line 586
    aget v2, v12, v7

    .line 587
    aget v3, v12, v8

    :goto_f
    move v9, v0

    move v8, v1

    goto :goto_12

    :cond_1d
    move/from16 v21, v7

    move v11, v8

    move/from16 v18, v15

    move v15, v9

    add-int/lit8 v13, v21, 0x5

    .line 683
    aget v3, v12, v13

    add-int/lit8 v14, v21, 0x6

    aget v4, v12, v14

    aget v5, v12, v21

    add-int/lit8 v7, v21, 0x1

    aget v6, v12, v7

    add-int/lit8 v7, v21, 0x2

    aget v7, v12, v7

    add-int/lit8 v0, v21, 0x3

    aget v0, v12, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1e

    const/4 v0, 0x1

    const/4 v8, 0x1

    goto :goto_10

    :cond_1e
    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_10
    const/4 v0, 0x0

    add-int/lit8 v1, v21, 0x4

    aget v1, v12, v1

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x1

    const/4 v9, 0x1

    goto :goto_11

    :cond_1f
    const/4 v0, 0x0

    const/4 v9, 0x0

    :goto_11
    move-object/from16 v0, p0

    move v1, v15

    move v2, v11

    invoke-static/range {v0 .. v9}, Ll/ܿ۬;->֫(Landroid/graphics/Path;FFFFFFFZZ)V

    .line 693
    aget v0, v12, v13

    .line 694
    aget v8, v12, v14

    move v2, v0

    move v9, v2

    move v3, v8

    :goto_12
    add-int v7, v21, v18

    move/from16 v0, p3

    move v11, v0

    move/from16 v15, v18

    const/4 v13, 0x4

    const/4 v14, 0x5

    goto/16 :goto_2

    :cond_20
    move v11, v8

    move v15, v9

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x3

    .line 701
    aput v15, p1, v0

    .line 702
    aput v11, p1, v1

    .line 703
    aput v2, p1, v4

    .line 704
    aput v3, p1, v5

    const/4 v0, 0x4

    .line 705
    aput v16, p1, v0

    const/4 v0, 0x5

    .line 706
    aput v17, p1, v0

    return-void

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic ֫(Ll/ܿ۬;C)V
    .locals 0

    .line 395
    iput-char p1, p0, Ll/ܿ۬;->ۧ:C

    return-void
.end method

.method public static synthetic ۧ(Ll/ܿ۬;)[F
    .locals 0

    .line 395
    iget-object p0, p0, Ll/ܿ۬;->֫:[F

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܿ۬;Ll/ܿ۬;F)V
    .locals 3

    .line 452
    iget-char v0, p1, Ll/ܿ۬;->ۧ:C

    iput-char v0, p0, Ll/ܿ۬;->ۧ:C

    const/4 v0, 0x0

    .line 453
    :goto_0
    iget-object v1, p1, Ll/ܿ۬;->֫:[F

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 454
    aget v1, v1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p3

    mul-float v2, v2, v1

    iget-object v1, p2, Ll/ܿ۬;->֫:[F

    aget v1, v1, v0

    mul-float v1, v1, p3

    add-float/2addr v1, v2

    iget-object v2, p0, Ll/ܿ۬;->֫:[F

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()[F
    .locals 1

    .line 411
    iget-object v0, p0, Ll/ܿ۬;->֫:[F

    return-object v0
.end method

.method public final ۧ()C
    .locals 1

    .line 406
    iget-char v0, p0, Ll/ܿ۬;->ۧ:C

    return v0
.end method
