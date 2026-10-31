.class public final Ll/ۜܰۜ;
.super Ljava/lang/Object;
.source "G6MJ"


# direct methods
.method public static ֫(IILandroid/graphics/RectF;FIJ)Ljava/util/List;
    .locals 38

    move/from16 v9, p0

    move/from16 v10, p1

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    if-lez v9, :cond_c

    if-lez v10, :cond_c

    .line 20
    invoke-static/range {p3 .. p3}, Ll/ۜܰۜ;->֫(F)Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    if-lez v6, :cond_c

    const/4 v6, 0x1

    if-lt v2, v6, :cond_c

    if-eqz v0, :cond_c

    iget v6, v0, Landroid/graphics/RectF;->left:F

    .line 21
    invoke-static {v6}, Ll/ۜܰۜ;->֫(F)Z

    move-result v6

    if-eqz v6, :cond_c

    iget v6, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v6}, Ll/ۜܰۜ;->֫(F)Z

    move-result v6

    if-eqz v6, :cond_c

    iget v6, v0, Landroid/graphics/RectF;->right:F

    .line 22
    invoke-static {v6}, Ll/ۜܰۜ;->֫(F)Z

    move-result v6

    if-eqz v6, :cond_c

    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v6}, Ll/ۜܰۜ;->֫(F)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 25
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_b

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-gtz v8, :cond_0

    goto/16 :goto_6

    .line 26
    :cond_0
    iget v6, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    float-to-double v11, v6

    iget v6, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v5

    float-to-double v13, v5

    int-to-float v5, v9

    .line 27
    iget v6, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    float-to-double v7, v5

    int-to-float v5, v10

    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    float-to-double v5, v5

    cmpl-double v15, v11, v7

    if-gez v15, :cond_a

    cmpl-double v15, v13, v5

    if-ltz v15, :cond_1

    goto/16 :goto_5

    .line 29
    :cond_1
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->getExponent(F)I

    move-result v15

    const/16 v0, 0x1e

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/16 v15, -0x1e

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move-wide/from16 v16, v5

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 30
    invoke-static {v5, v6, v0}, Ljava/lang/Math;->scalb(DI)D

    move-result-wide v18

    float-to-double v5, v1

    cmpg-double v1, v18, v5

    if-gez v1, :cond_2

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    move v15, v0

    const/16 v0, -0x1e

    :goto_0
    if-lt v15, v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    .line 32
    invoke-static {v0, v15}, Ljava/lang/Math;->scalb(FI)F

    move-result v0

    int-to-double v5, v9

    float-to-double v0, v0

    mul-double v5, v5, v0

    move-wide/from16 v18, v7

    int-to-double v7, v10

    mul-double v7, v7, v0

    const/16 v22, 0x200

    const/16 v9, 0x200

    :goto_1
    const/16 v10, 0x80

    if-lt v9, v10, :cond_5

    move-wide/from16 v30, v13

    int-to-double v13, v9

    div-double v22, v5, v13

    move-wide/from16 v32, v11

    .line 56
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    .line 57
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v12

    float-to-double v3, v12

    const-wide/high16 v34, 0x4050000000000000L    # 64.0

    move-wide/from16 v22, v3

    move-wide/from16 v24, v0

    move-wide/from16 v26, v34

    move-wide/from16 v28, v13

    invoke-static/range {v22 .. v29}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    add-double v3, v3, v20

    .line 56
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    double-to-long v3, v3

    div-double v10, v7, v13

    .line 58
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    .line 59
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v12

    move-wide/from16 v36, v7

    float-to-double v7, v12

    move-wide/from16 v22, v7

    invoke-static/range {v22 .. v29}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    add-double/2addr v7, v12

    .line 58
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v7

    double-to-long v7, v7

    long-to-double v3, v3

    long-to-double v7, v7

    mul-double v3, v3, v7

    add-int/lit8 v7, v9, 0x3

    int-to-double v7, v7

    .line 62
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    add-double/2addr v10, v12

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v10

    .line 63
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v20

    move-wide/from16 v22, v5

    add-double v5, v20, v12

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    mul-double v5, v5, v10

    const-wide/high16 v7, 0x4010000000000000L    # 4.0

    mul-double v5, v5, v7

    cmpg-double v7, v3, v34

    if-gtz v7, :cond_3

    int-to-double v7, v2

    add-double/2addr v3, v7

    sub-double/2addr v3, v12

    mul-double v3, v3, v5

    move-wide/from16 v5, p5

    long-to-double v7, v5

    cmpg-double v10, v3, v7

    if-gtz v10, :cond_4

    const/16 v10, 0x80

    goto :goto_2

    :cond_3
    move-wide/from16 v5, p5

    .line 35
    :cond_4
    div-int/lit8 v9, v9, 0x2

    move-wide v3, v5

    move-wide/from16 v5, v22

    move-wide/from16 v13, v30

    move-wide/from16 v11, v32

    move-wide/from16 v7, v36

    goto/16 :goto_1

    :cond_5
    move-wide/from16 v22, v5

    move-wide/from16 v36, v7

    move-wide/from16 v32, v11

    move-wide/from16 v30, v13

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    move-wide v5, v3

    :goto_2
    if-ge v9, v10, :cond_6

    add-int/lit8 v15, v15, -0x1

    const/16 v0, -0x1e

    move/from16 v9, p0

    move/from16 v10, p1

    move-wide v3, v5

    move-wide/from16 v7, v18

    move-wide/from16 v13, v30

    move-wide/from16 v11, v32

    goto/16 :goto_0

    :cond_6
    mul-double v11, v32, v0

    const-wide/high16 v2, 0x4040000000000000L    # 32.0

    sub-double/2addr v11, v2

    const-wide/16 v4, 0x0

    .line 37
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    int-to-double v10, v9

    div-double/2addr v6, v10

    double-to-long v12, v6

    mul-double v6, v30, v0

    sub-double/2addr v6, v2

    .line 38
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    div-double/2addr v4, v10

    double-to-long v4, v4

    mul-double v7, v18, v0

    add-double/2addr v7, v2

    move-wide/from16 v2, v22

    .line 39
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    div-double/2addr v2, v10

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v7, v2

    mul-double v0, v0, v16

    const-wide/high16 v2, 0x4040000000000000L    # 32.0

    add-double/2addr v0, v2

    move-wide/from16 v2, v36

    .line 40
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    div-double/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v10, v0

    .line 41
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v20, v4

    :goto_3
    cmp-long v0, v20, v10

    if-gez v0, :cond_8

    move-wide/from16 v22, v12

    :goto_4
    const-wide/16 v24, 0x1

    cmp-long v0, v22, v7

    if-gez v0, :cond_7

    .line 44
    new-instance v6, Ll/᩻ܰۜ;

    move-object v0, v6

    move-wide/from16 v1, v22

    move-wide/from16 v3, v20

    move/from16 v5, p0

    move-wide/from16 v26, v10

    move-object v10, v6

    move/from16 v6, p1

    move-wide/from16 v28, v7

    move v7, v15

    move v8, v9

    invoke-direct/range {v0 .. v8}, Ll/᩻ܰۜ;-><init>(JJIIII)V

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-long v22, v22, v24

    move-wide/from16 v10, v26

    move-wide/from16 v7, v28

    goto :goto_4

    :cond_7
    move-wide/from16 v28, v7

    move-wide/from16 v26, v10

    add-long v20, v20, v24

    goto :goto_3

    :cond_8
    add-double v11, v32, v18

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr v11, v0

    add-double v2, v30, v16

    div-double/2addr v2, v0

    .line 48
    new-instance v0, Ll/ܳܰۜ;

    invoke-direct {v0, v11, v12, v2, v3}, Ll/ܳܰۜ;-><init>(DD)V

    invoke-static {v14, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v14

    .line 51
    :cond_9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 28
    :cond_a
    :goto_5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 25
    :cond_b
    :goto_6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 23
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid SVG tile geometry"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(F)Z
    .locals 1

    .line 67
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
