.class public Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;
.super Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;
.source "ShapePath.java"


# instance fields
.field public final operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

.field public final operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

.field public final startX:F

.field public final startY:F


# direct methods
.method public constructor <init>(Lcom/google/android/material/shape/ShapePath$PathLineOperation;Lcom/google/android/material/shape/ShapePath$PathLineOperation;FF)V
    .locals 0

    .line 465
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;-><init>()V

    .line 466
    iput-object p1, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 467
    iput-object p2, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 468
    iput p3, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startX:F

    .line 469
    iput p4, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startY:F

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Matrix;Lcom/google/android/material/shadow/ShadowRenderer;ILandroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v11, p3

    move-object/from16 v12, p4

    .line 475
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getSweepAngle()F

    move-result v8

    const/4 v2, 0x0

    cmpl-float v3, v8, v2

    if-lez v3, :cond_0

    goto/16 :goto_1

    .line 481
    :cond_0
    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v3}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v3

    iget v4, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startX:F

    sub-float/2addr v3, v4

    float-to-double v3, v3

    iget-object v5, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v5}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v5

    iget v6, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startY:F

    sub-float/2addr v5, v6

    float-to-double v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    .line 482
    iget-object v5, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v5}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v5

    iget-object v6, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v6}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v6

    sub-float/2addr v5, v6

    float-to-double v5, v5

    iget-object v7, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v7}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v7

    iget-object v9, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v9}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v9

    sub-float/2addr v7, v9

    float-to-double v13, v7

    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v13

    int-to-double v5, v11

    .line 483
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->min(DD)D

    move-result-wide v9

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    double-to-float v5, v5

    float-to-double v6, v5

    neg-float v9, v8

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    float-to-double v10, v9

    .line 484
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->tan(D)D

    move-result-wide v9

    mul-double v10, v9, v6

    cmpl-double v9, v3, v10

    if-lez v9, :cond_1

    .line 487
    new-instance v9, Landroid/graphics/RectF;

    sub-double/2addr v3, v10

    double-to-float v3, v3

    invoke-direct {v9, v2, v2, v3, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 488
    iget-object v2, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 489
    iget-object v2, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    iget v3, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startX:F

    iget v4, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startY:F

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 490
    iget-object v2, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getStartAngle()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 491
    iget-object v2, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    move-object/from16 v4, p2

    move/from16 v3, p3

    invoke-virtual {v4, v12, v2, v9, v3}, Lcom/google/android/material/shadow/ShadowRenderer;->drawEdgeShadow(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;I)V

    goto :goto_0

    :cond_1
    move-object/from16 v4, p2

    move/from16 v3, p3

    .line 494
    :goto_0
    new-instance v9, Landroid/graphics/RectF;

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v2, v2, v5

    const/4 v15, 0x0

    invoke-direct {v9, v15, v15, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 495
    iget-object v15, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v15, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 496
    iget-object v15, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v3}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v3

    iget-object v4, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v4}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v4

    invoke-virtual {v15, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 497
    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getStartAngle()F

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 498
    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    move-wide v15, v13

    neg-double v12, v10

    sub-double/2addr v12, v6

    double-to-float v4, v12

    const/high16 v12, -0x40000000    # -2.0f

    mul-float v12, v12, v5

    invoke-virtual {v3, v4, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 499
    iget-object v4, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    float-to-int v12, v5

    add-double/2addr v6, v10

    double-to-float v3, v6

    const/4 v5, 0x2

    new-array v13, v5, [F

    const/4 v5, 0x0

    aput v3, v13, v5

    const/4 v3, 0x1

    aput v2, v13, v3

    const/high16 v7, 0x43e10000    # 450.0f

    move-object/from16 v2, p2

    move/from16 v14, p3

    move-object/from16 v3, p4

    move-object/from16 v6, p2

    move-object v5, v9

    move-object v9, v6

    move v6, v12

    move-object v12, v9

    move-object v9, v13

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/material/shadow/ShadowRenderer;->drawInnerCornerShadow(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF[F)V

    cmpl-double v2, v15, v10

    if-lez v2, :cond_2

    .line 509
    new-instance v2, Landroid/graphics/RectF;

    sub-double v3, v15, v10

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v4, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 510
    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 511
    iget-object v1, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    iget-object v3, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v3}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v3

    iget-object v4, v0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v4}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 512
    iget-object v1, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getEndAngle()F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 513
    iget-object v1, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    double-to-float v3, v10

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 514
    iget-object v1, v0, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->renderMatrix:Landroid/graphics/Matrix;

    move-object/from16 v3, p4

    invoke-virtual {v12, v3, v1, v2, v14}, Lcom/google/android/material/shadow/ShadowRenderer;->drawEdgeShadow(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public getEndAngle()F
    .locals 3

    .line 523
    iget-object v0, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 524
    invoke-static {v0}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v1}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation2:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v1}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v2}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v2

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public getStartAngle()F
    .locals 3

    .line 519
    iget-object v0, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v0}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$100(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v0

    iget v1, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startY:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->operation1:Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    invoke-static {v1}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->access$000(Lcom/google/android/material/shape/ShapePath$PathLineOperation;)F

    move-result v1

    iget v2, p0, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->startX:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public getSweepAngle()F
    .locals 3

    .line 533
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getEndAngle()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->getStartAngle()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    rem-float/2addr v0, v1

    const/high16 v2, 0x43340000    # 180.0f

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_0

    return v0

    :cond_0
    sub-float/2addr v0, v1

    return v0
.end method
