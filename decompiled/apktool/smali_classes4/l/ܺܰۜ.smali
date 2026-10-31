.class public final Ll/ܺܰۜ;
.super Ljava/lang/Object;
.source "76MD"


# direct methods
.method public static ֫(Ll/ۡܰۜ;DD)D
    .locals 6

    .line 74
    iget v0, p0, Ll/ۡܰۜ;->ܽ:I

    int-to-double v0, v0

    iget v2, p0, Ll/ۡܰۜ;->ᩳ:I

    int-to-double v2, v2

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    sub-double/2addr v0, p1

    .line 75
    iget p1, p0, Ll/ۡܰۜ;->ܿ:I

    int-to-double p1, p1

    iget p0, p0, Ll/ۡܰۜ;->ۧ:I

    int-to-double v4, p0

    add-double/2addr p1, v4

    mul-double p1, p1, v2

    sub-double/2addr p1, p3

    mul-double v0, v0, v0

    mul-double p1, p1, p1

    add-double/2addr p1, v0

    return-wide p1
.end method

.method public static synthetic ֫(DDLl/ۡܰۜ;Ll/ۡܰۜ;)I
    .locals 2

    .line 63
    invoke-static {p4, p0, p1, p2, p3}, Ll/ܺܰۜ;->֫(Ll/ۡܰۜ;DD)D

    move-result-wide v0

    invoke-static {p5, p0, p1, p2, p3}, Ll/ܺܰۜ;->֫(Ll/ۡܰۜ;DD)D

    move-result-wide p0

    .line 62
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Double;->compare(DD)I

    move-result p0

    return p0
.end method

.method public static ֫(IILandroid/graphics/RectF;FIJ)Ljava/util/List;
    .locals 42

    move/from16 v12, p0

    move/from16 v13, p1

    move-object/from16 v8, p2

    move/from16 v0, p3

    move/from16 v9, p4

    if-lez v12, :cond_c

    if-lez v13, :cond_c

    if-eqz v8, :cond_c

    .line 21
    invoke-static/range {p3 .. p3}, Ll/ܺܰۜ;->֫(F)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-lez v2, :cond_c

    if-lez v9, :cond_c

    add-int/lit8 v2, v9, -0x1

    and-int/2addr v2, v9

    if-nez v2, :cond_c

    iget v2, v8, Landroid/graphics/RectF;->left:F

    .line 23
    invoke-static {v2}, Ll/ܺܰۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_c

    iget v2, v8, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ll/ܺܰۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_c

    iget v2, v8, Landroid/graphics/RectF;->right:F

    .line 24
    invoke-static {v2}, Ll/ܺܰۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_c

    iget v2, v8, Landroid/graphics/RectF;->bottom:F

    invoke-static {v2}, Ll/ܺܰۜ;->֫(F)Z

    move-result v2

    if-eqz v2, :cond_c

    const-wide/16 v2, 0x0

    cmp-long v4, p5, v2

    if-lez v4, :cond_b

    .line 27
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_7

    .line 28
    :cond_0
    iget v2, v8, Landroid/graphics/RectF;->left:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    float-to-double v14, v2

    iget v2, v8, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    float-to-double v10, v1

    int-to-float v1, v12

    .line 29
    iget v2, v8, Landroid/graphics/RectF;->right:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v6, v1

    int-to-float v1, v13

    iget v2, v8, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v4, v1

    cmpl-double v1, v14, v6

    if-gez v1, :cond_a

    cmpl-double v1, v10, v4

    if-ltz v1, :cond_1

    goto/16 :goto_6

    :cond_1
    const/4 v1, 0x1

    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    if-ge v1, v2, :cond_2

    int-to-double v2, v1

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    mul-double v2, v2, v16

    move-wide/from16 v16, v4

    float-to-double v4, v0

    mul-double v2, v2, v4

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v18, v2, v4

    if-gtz v18, :cond_3

    shl-int/lit8 v1, v1, 0x1

    move-wide/from16 v4, v16

    goto :goto_0

    :cond_2
    move-wide/from16 v16, v4

    :cond_3
    move v5, v1

    :goto_1
    if-ge v5, v9, :cond_9

    const/16 v18, 0x200

    const/16 v19, 0x40

    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v5

    move/from16 v4, v18

    move/from16 p3, v5

    move/from16 v5, v19

    move-wide/from16 v20, v6

    move-wide/from16 v6, p5

    .line 38
    invoke-static/range {v0 .. v7}, Ll/ܺܰۜ;->֫(IILandroid/graphics/RectF;IIIJ)Z

    move-result v0

    if-nez v0, :cond_4

    const/16 v18, 0x180

    const/16 v19, 0x20

    const/16 v6, 0x180

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x200

    const/16 v7, 0x40

    :goto_2
    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move v4, v6

    move v5, v7

    move v8, v6

    move v9, v7

    move-wide/from16 v6, p5

    .line 42
    invoke-static/range {v0 .. v7}, Ll/ܺܰۜ;->֫(IILandroid/graphics/RectF;IIIJ)Z

    move-result v0

    if-nez v0, :cond_6

    const/high16 v0, 0x40000000    # 2.0f

    move/from16 v6, p3

    if-lt v6, v0, :cond_5

    goto/16 :goto_5

    :cond_5
    shl-int/lit8 v5, v6, 0x1

    move-object/from16 v8, p2

    move/from16 v9, p4

    move-wide/from16 v6, v20

    goto :goto_1

    :cond_6
    move/from16 v6, p3

    int-to-long v0, v8

    int-to-long v2, v6

    mul-long v7, v2, v0

    int-to-double v0, v9

    int-to-double v2, v6

    mul-double v0, v0, v2

    sub-double v2, v14, v0

    const-wide/16 v4, 0x0

    .line 49
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    long-to-double v4, v7

    div-double/2addr v2, v4

    double-to-long v2, v2

    move-wide/from16 v18, v14

    sub-double v14, v10, v0

    move-wide/from16 v22, v10

    const-wide/16 v9, 0x0

    .line 50
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    div-double/2addr v9, v4

    double-to-long v9, v9

    int-to-double v14, v12

    add-double v11, v20, v0

    .line 51
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->min(DD)D

    move-result-wide v11

    div-double/2addr v11, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-long v14, v11

    int-to-double v11, v13

    add-double v0, v16, v0

    .line 52
    invoke-static {v11, v12, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    div-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v11, v0

    sub-long v0, v14, v2

    sub-long v4, v11, v9

    mul-long v0, v0, v4

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    long-to-int v1, v0

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-wide/from16 v24, v9

    :goto_3
    cmp-long v0, v24, v11

    if-gez v0, :cond_8

    move-wide/from16 v26, v2

    :goto_4
    const-wide/16 v28, 0x1

    cmp-long v0, v26, v14

    if-gez v0, :cond_7

    .line 57
    new-instance v10, Ll/ۡܰۜ;

    mul-long v30, v26, v7

    mul-long v32, v24, v7

    add-long v34, v30, v7

    add-long v36, v32, v7

    move-object v0, v10

    move/from16 v1, p0

    move-wide/from16 v38, v2

    move/from16 v2, p1

    move v3, v6

    move-object v9, v4

    move-wide/from16 v4, v30

    move/from16 v30, v6

    move-wide/from16 v40, v7

    move-wide/from16 v6, v32

    move-wide/from16 v31, v11

    move-object v12, v9

    move-wide/from16 v8, v34

    move-object v13, v10

    move-wide/from16 v10, v36

    .line 101
    invoke-direct/range {v0 .. v11}, Ll/ۡܰۜ;-><init>(IIIJJJJ)V

    .line 57
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-long v26, v26, v28

    move/from16 v13, p1

    move-object v4, v12

    move/from16 v6, v30

    move-wide/from16 v11, v31

    move-wide/from16 v2, v38

    move-wide/from16 v7, v40

    goto :goto_4

    :cond_7
    move-wide/from16 v38, v2

    move/from16 v30, v6

    move-wide/from16 v40, v7

    move-wide/from16 v31, v11

    move-object v12, v4

    add-long v24, v24, v28

    move/from16 v13, p1

    move-wide/from16 v11, v31

    goto :goto_3

    :cond_8
    move-object v12, v4

    add-double v14, v18, v20

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double v14, v14, v0

    add-double v10, v22, v16

    mul-double v10, v10, v0

    .line 62
    new-instance v0, Ll/ۢܰۜ;

    invoke-direct {v0, v14, v15, v10, v11}, Ll/ۢܰۜ;-><init>(DD)V

    invoke-static {v12, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v12

    .line 66
    :cond_9
    :goto_5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 30
    :cond_a
    :goto_6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 27
    :cond_b
    :goto_7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 25
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid tile planning geometry"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(F)Z
    .locals 1

    .line 70
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

.method public static ֫(IILandroid/graphics/RectF;IIIJ)Z
    .locals 23

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p4

    int-to-long v3, v2

    int-to-long v5, v1

    mul-long v3, v3, v5

    move/from16 v7, p0

    int-to-long v7, v7

    add-long v9, v7, v3

    const-wide/16 v11, 0x1

    sub-long/2addr v9, v11

    .line 83
    div-long/2addr v9, v3

    long-to-double v9, v9

    iget v13, v0, Landroid/graphics/RectF;->right:F

    float-to-double v13, v13

    iget v15, v0, Landroid/graphics/RectF;->left:F

    float-to-double v11, v15

    sub-double/2addr v13, v11

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    move/from16 v15, p5

    move-wide/from16 v17, v5

    int-to-double v5, v15

    mul-double v5, v5, v11

    int-to-double v11, v1

    mul-double v5, v5, v11

    add-double/2addr v13, v5

    long-to-double v11, v3

    div-double/2addr v13, v11

    .line 84
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    add-double v13, v13, v19

    .line 83
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(DD)D

    move-result-wide v9

    double-to-long v9, v9

    move/from16 v1, p1

    int-to-long v13, v1

    add-long v21, v13, v3

    const-wide/16 v15, 0x1

    sub-long v21, v21, v15

    .line 85
    div-long v3, v21, v3

    long-to-double v3, v3

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    move-wide/from16 v21, v13

    float-to-double v13, v1

    iget v0, v0, Landroid/graphics/RectF;->top:F

    float-to-double v0, v0

    sub-double/2addr v13, v0

    add-double/2addr v13, v5

    div-double/2addr v13, v11

    .line 86
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    add-double v0, v0, v19

    .line 85
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-long v0, v0

    mul-long v9, v9, v0

    const-wide/16 v0, 0x20

    const/4 v3, 0x0

    cmp-long v4, v9, v0

    if-lez v4, :cond_0

    return v3

    :cond_0
    add-int/lit8 v0, v2, 0x2

    int-to-long v0, v0

    add-long v7, v7, v17

    const-wide/16 v4, 0x1

    sub-long/2addr v7, v4

    .line 89
    div-long v7, v7, v17

    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    add-long v13, v21, v17

    sub-long/2addr v13, v4

    .line 90
    div-long v13, v13, v17

    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    mul-long v9, v9, v6

    mul-long v9, v9, v0

    const-wide/16 v0, 0x4

    mul-long v9, v9, v0

    cmp-long v0, v9, p6

    if-gtz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v3
.end method
