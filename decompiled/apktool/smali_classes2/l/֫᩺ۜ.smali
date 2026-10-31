.class public final Ll/֫᩺ۜ;
.super Ljava/lang/Object;
.source "26K9"


# direct methods
.method public static ֫(IILandroid/graphics/RectF;FIJII)Ljava/util/List;
    .locals 43

    move/from16 v15, p0

    move/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v0, p3

    if-lez v15, :cond_a

    if-lez v14, :cond_a

    .line 26
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-lez v2, :cond_a

    invoke-static/range {p3 .. p3}, Ll/֫᩺ۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_a

    iget v2, v13, Landroid/graphics/RectF;->left:F

    .line 27
    invoke-static {v2}, Ll/֫᩺ۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_a

    iget v2, v13, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ll/֫᩺ۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_a

    iget v2, v13, Landroid/graphics/RectF;->right:F

    invoke-static {v2}, Ll/֫᩺ۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_a

    iget v2, v13, Landroid/graphics/RectF;->bottom:F

    invoke-static {v2}, Ll/֫᩺ۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_a

    const-wide/16 v2, 0x0

    cmp-long v4, p5, v2

    if-lez v4, :cond_a

    if-lez p7, :cond_a

    if-gtz p8, :cond_0

    goto/16 :goto_6

    .line 29
    :cond_0
    iget v2, v13, Landroid/graphics/RectF;->left:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    float-to-double v11, v2

    iget v2, v13, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    float-to-double v9, v1

    int-to-float v1, v15

    .line 30
    iget v2, v13, Landroid/graphics/RectF;->right:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v7, v1

    int-to-float v1, v14

    iget v2, v13, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v5, v1

    cmpl-double v1, v11, v7

    if-gez v1, :cond_9

    cmpl-double v1, v9, v5

    if-ltz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v1, 0x1

    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    if-ge v1, v2, :cond_2

    int-to-double v2, v1

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    mul-double v2, v2, v16

    move-wide/from16 v16, v5

    float-to-double v4, v0

    mul-double v2, v2, v4

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v6, v2, v4

    if-gtz v6, :cond_3

    shl-int/lit8 v1, v1, 0x1

    move-wide/from16 v5, v16

    goto :goto_0

    :cond_2
    move-wide/from16 v16, v5

    :cond_3
    move/from16 v6, p4

    move v5, v1

    :goto_1
    if-ge v5, v6, :cond_8

    .line 35
    iget v0, v13, Landroid/graphics/RectF;->right:F

    float-to-double v0, v0

    iget v2, v13, Landroid/graphics/RectF;->left:F

    float-to-double v2, v2

    sub-double/2addr v0, v2

    int-to-double v3, v5

    div-double v18, v0, v3

    .line 36
    iget v0, v13, Landroid/graphics/RectF;->bottom:F

    float-to-double v0, v0

    iget v2, v13, Landroid/graphics/RectF;->top:F

    move-wide/from16 v20, v7

    float-to-double v6, v2

    sub-double/2addr v0, v6

    div-double v22, v0, v3

    const-wide/high16 v7, 0x4040000000000000L    # 32.0

    const-wide/high16 v24, 0x4040000000000000L    # 32.0

    const/high16 v6, 0x40000000    # 2.0f

    move/from16 v0, p0

    move/from16 v1, p1

    move v2, v5

    move-wide/from16 v26, v3

    move-wide/from16 v3, v18

    move/from16 p3, v5

    move-wide/from16 v5, v22

    move-wide/from16 v29, v9

    move-wide/from16 v9, v24

    move-wide/from16 v24, v11

    move-wide/from16 v11, p5

    move/from16 v13, p7

    move/from16 v14, p8

    .line 37
    invoke-static/range {v0 .. v14}, Ll/֫᩺ۜ;->֫(IIIDDDDJII)Z

    move-result v0

    if-eqz v0, :cond_6

    const-wide/high16 v31, 0x4010000000000000L    # 4.0

    div-double v0, v18, v31

    const-wide/high16 v2, 0x4070000000000000L    # 256.0

    .line 40
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide/high16 v33, 0x4040000000000000L    # 32.0

    sub-double v0, v0, v33

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v35

    div-double v0, v22, v31

    .line 41
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    sub-double v0, v0, v33

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v37

    const/4 v0, 0x4

    const/4 v14, 0x4

    :goto_2
    if-lez v14, :cond_5

    int-to-double v0, v14

    mul-double v2, v35, v0

    div-double v2, v2, v31

    add-double v39, v2, v33

    mul-double v0, v0, v37

    div-double v0, v0, v31

    add-double v41, v0, v33

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    move-wide/from16 v3, v18

    move-wide/from16 v5, v22

    move-wide/from16 v7, v39

    move-wide/from16 v9, v41

    move-wide/from16 v11, p5

    move/from16 v13, p7

    move/from16 v28, v14

    move/from16 v14, p8

    .line 46
    invoke-static/range {v0 .. v14}, Ll/֫᩺ۜ;->֫(IIIDDDDJII)Z

    move-result v0

    if-eqz v0, :cond_4

    move-wide/from16 v33, v39

    goto :goto_3

    :cond_4
    add-int/lit8 v14, v28, -0x1

    goto :goto_2

    :cond_5
    move-wide/from16 v41, v33

    :goto_3
    const-wide/16 v0, 0x40

    move/from16 v3, p3

    int-to-long v4, v3

    mul-long v4, v4, v0

    mul-double v33, v33, v26

    sub-double v11, v24, v33

    const-wide/16 v0, 0x0

    .line 53
    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    long-to-double v8, v4

    div-double/2addr v6, v8

    double-to-long v6, v6

    mul-long v6, v6, v4

    mul-double v41, v41, v26

    sub-double v10, v29, v41

    .line 54
    invoke-static {v0, v1, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    div-double/2addr v0, v8

    double-to-long v0, v0

    mul-long v10, v0, v4

    int-to-double v0, v15

    add-double v12, v20, v33

    .line 55
    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    div-double/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    mul-long v12, v0, v4

    move/from16 v2, p1

    int-to-double v0, v2

    add-double v14, v16, v41

    .line 56
    invoke-static {v0, v1, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    div-double/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    mul-long v14, v0, v4

    .line 57
    new-instance v16, Ll/ۡܰۜ;

    move-object/from16 v0, v16

    move/from16 v1, p0

    move-wide v4, v6

    move-wide v6, v10

    move-wide v8, v12

    move-wide v10, v14

    invoke-direct/range {v0 .. v11}, Ll/ۡܰۜ;-><init>(IIIJJJJ)V

    invoke-static/range {v16 .. v16}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_6
    move/from16 v2, p1

    move/from16 v3, p3

    const/high16 v0, 0x40000000    # 2.0f

    if-lt v3, v0, :cond_7

    goto :goto_4

    :cond_7
    shl-int/lit8 v5, v3, 0x1

    move/from16 v15, p0

    move-object/from16 v13, p2

    move/from16 v6, p4

    move v14, v2

    move-wide/from16 v7, v20

    move-wide/from16 v11, v24

    move-wide/from16 v9, v29

    goto/16 :goto_1

    .line 62
    :cond_8
    :goto_4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 31
    :cond_9
    :goto_5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 28
    :cond_a
    :goto_6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public static ֫(F)Z
    .locals 1

    .line 76
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

.method public static ֫(IIIDDDDJII)Z
    .locals 18

    move/from16 v0, p0

    int-to-double v0, v0

    move/from16 v2, p2

    int-to-double v2, v2

    div-double/2addr v0, v2

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    const-wide/high16 v14, 0x4050000000000000L    # 64.0

    move-wide/from16 v4, p7

    move-wide v6, v12

    move-wide/from16 v8, p3

    move-wide v10, v14

    invoke-static/range {v4 .. v11}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v4

    .line 69
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    add-double v4, v4, v16

    mul-double v4, v4, v14

    add-double/2addr v4, v12

    .line 68
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-long v0, v0

    move/from16 v4, p1

    int-to-double v4, v4

    div-double/2addr v4, v2

    .line 70
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    move-wide/from16 v4, p9

    move-wide/from16 v8, p5

    invoke-static/range {v4 .. v11}, Ll/ۘ᩺ۘ;->֫(DDDD)D

    move-result-wide v4

    .line 71
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    add-double v4, v4, v16

    mul-double v4, v4, v14

    add-double/2addr v4, v12

    .line 70
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    double-to-long v2, v2

    move/from16 v4, p13

    int-to-long v4, v4

    cmp-long v6, v0, v4

    if-gtz v6, :cond_0

    move/from16 v4, p14

    int-to-long v4, v4

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    mul-long v0, v0, v2

    const-wide/16 v2, 0x4

    .line 72
    div-long v2, p11, v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ֫(Ll/ۡܰۜ;Landroid/graphics/RectF;III)Z
    .locals 3

    .line 18
    iget v0, p1, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    int-to-float p2, p2

    .line 19
    iget v2, p1, Landroid/graphics/RectF;->right:F

    invoke-static {p2, v2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    int-to-float p3, p3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 20
    iget p3, p0, Ll/ۡܰۜ;->ۜ:I

    if-gt p3, p4, :cond_0

    cmpg-float p3, v0, p2

    if-gez p3, :cond_0

    cmpg-float p3, v1, p1

    if-gez p3, :cond_0

    iget p3, p0, Ll/ۡܰۜ;->ܽ:I

    int-to-float p3, p3

    cmpg-float p3, p3, v0

    if-gtz p3, :cond_0

    iget p3, p0, Ll/ۡܰۜ;->ܿ:I

    int-to-float p3, p3

    cmpg-float p3, p3, v1

    if-gtz p3, :cond_0

    iget p3, p0, Ll/ۡܰۜ;->ᩳ:I

    int-to-float p3, p3

    cmpl-float p2, p3, p2

    if-ltz p2, :cond_0

    iget p0, p0, Ll/ۡܰۜ;->ۧ:I

    int-to-float p0, p0

    cmpl-float p0, p0, p1

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
