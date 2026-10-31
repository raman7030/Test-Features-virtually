.class public Lcom/google/android/material/carousel/KeylineStateList;
.super Ljava/lang/Object;
.source "KeylineStateList.java"


# static fields
.field public static final NO_INDEX:I = -0x1


# instance fields
.field public final defaultState:Lcom/google/android/material/carousel/KeylineState;

.field public final endShiftRange:F

.field public final endStateSteps:Ljava/util/List;

.field public final endStateStepsInterpolationPoints:[F

.field public final startShiftRange:F

.field public final startStateSteps:Ljava/util/List;

.field public final startStateStepsInterpolationPoints:[F


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/KeylineState;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/google/android/material/carousel/KeylineStateList;->defaultState:Lcom/google/android/material/carousel/KeylineState;

    .line 63
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateSteps:Ljava/util/List;

    .line 64
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateSteps:Ljava/util/List;

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p2}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    .line 69
    check-cast v1, Lcom/google/android/material/carousel/KeylineState;

    invoke-virtual {v1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    .line 70
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/google/android/material/carousel/KeylineStateList;->startShiftRange:F

    .line 72
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getLastKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object p1

    iget p1, p1, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    .line 0
    invoke-static {v0, p3}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/android/material/carousel/KeylineState;

    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->getLastKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    sub-float/2addr p1, v2

    iput p1, p0, Lcom/google/android/material/carousel/KeylineStateList;->endShiftRange:F

    .line 78
    invoke-static {v1, p2, v0}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepInterpolationPoints(FLjava/util/List;Z)[F

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateStepsInterpolationPoints:[F

    const/4 p2, 0x0

    .line 81
    invoke-static {p1, p3, p2}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepInterpolationPoints(FLjava/util/List;Z)[F

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateStepsInterpolationPoints:[F

    return-void
.end method

.method private closestStateStepFromInterpolation(Ljava/util/List;F[F)Lcom/google/android/material/carousel/KeylineState;
    .locals 1

    .line 265
    invoke-static {p1, p2, p3}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepsRange(Ljava/util/List;F[F)[F

    move-result-object p2

    const/4 p3, 0x0

    .line 271
    aget p3, p2, p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p3, p3, v0

    if-ltz p3, :cond_0

    const/4 p3, 0x2

    .line 272
    aget p2, p2, p3

    float-to-int p2, p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/KeylineState;

    return-object p1

    :cond_0
    const/4 p3, 0x1

    .line 274
    aget p2, p2, p3

    float-to-int p2, p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/KeylineState;

    return-object p1
.end method

.method public static findFirstIndexAfterLastFocalKeylineWithMask(Lcom/google/android/material/carousel/KeylineState;F)I
    .locals 2

    .line 690
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v0

    .line 691
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 692
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 697
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static findFirstNonAnchorKeylineIndex(Lcom/google/android/material/carousel/KeylineState;)I
    .locals 2

    const/4 v0, 0x0

    .line 712
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 713
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget-boolean v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->isAnchor:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static findLastIndexBeforeFirstFocalKeylineWithMask(Lcom/google/android/material/carousel/KeylineState;F)I
    .locals 2

    .line 701
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 703
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static findLastNonAnchorKeylineIndex(Lcom/google/android/material/carousel/KeylineState;)I
    .locals 2

    .line 722
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 723
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget-boolean v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->isAnchor:Z

    if-nez v1, :cond_0

    return v0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static from(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;FFF)Lcom/google/android/material/carousel/KeylineStateList;
    .locals 1

    .line 87
    new-instance v0, Lcom/google/android/material/carousel/KeylineStateList;

    .line 88
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepsStart(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;FF)Ljava/util/List;

    move-result-object p3

    .line 89
    invoke-static {p0, p1, p2, p4}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepsEnd(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;FF)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p1, p3, p0}, Lcom/google/android/material/carousel/KeylineStateList;-><init>(Lcom/google/android/material/carousel/KeylineState;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static getStateStepInterpolationPoints(FLjava/util/List;Z)[F
    .locals 6

    .line 307
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 308
    new-array v1, v0, [F

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v0, :cond_2

    add-int/lit8 v3, v2, -0x1

    .line 313
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/KeylineState;

    .line 314
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/carousel/KeylineState;

    if-eqz p2, :cond_0

    .line 318
    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    invoke-virtual {v4}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    sub-float/2addr v5, v4

    goto :goto_1

    .line 319
    :cond_0
    invoke-virtual {v4}, Lcom/google/android/material/carousel/KeylineState;->getLastKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineState;->getLastKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->loc:F

    sub-float v5, v4, v5

    :goto_1
    div-float/2addr v5, p0

    add-int/lit8 v4, v0, -0x1

    if-ne v2, v4, :cond_1

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_2

    .line 323
    :cond_1
    aget v3, v1, v3

    add-float/2addr v3, v5

    :goto_2
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static getStateStepsEnd(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;FF)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    .line 540
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 541
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    invoke-static/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineStateList;->findLastNonAnchorKeylineIndex(Lcom/google/android/material/carousel/KeylineState;)I

    move-result v11

    .line 544
    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->isHorizontal()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->getContainerWidth()I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->getContainerHeight()I

    move-result v4

    :goto_0
    int-to-float v12, v4

    .line 549
    invoke-static/range {p0 .. p1}, Lcom/google/android/material/carousel/KeylineStateList;->isLastFocalItemVisibleAtRightOfContainer(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;)Z

    move-result v4

    const/4 v14, 0x0

    if-nez v4, :cond_5

    const/4 v4, -0x1

    if-ne v11, v4, :cond_1

    goto/16 :goto_3

    .line 564
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v4

    sub-int v15, v11, v4

    .line 568
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    .line 569
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float v16, v4, v5

    if-gtz v15, :cond_2

    .line 571
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    cmpl-float v4, v4, v14

    if-lez v4, :cond_2

    .line 575
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    sub-float v1, v16, v1

    .line 577
    invoke-static {v0, v1, v12}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylinesAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;FF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v0

    .line 576
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v15, :cond_6

    const/4 v5, 0x1

    .line 0
    invoke-static {v3, v5}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v6

    .line 584
    check-cast v6, Lcom/google/android/material/carousel/KeylineState;

    sub-int v7, v11, v10

    .line 586
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v8, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    add-float v17, v4, v8

    add-int/2addr v7, v5

    .line 591
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v7, v4, :cond_3

    .line 592
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    .line 594
    invoke-static {v6, v4}, Lcom/google/android/material/carousel/KeylineStateList;->findLastIndexBeforeFirstFocalKeylineWithMask(Lcom/google/android/material/carousel/KeylineState;F)I

    move-result v4

    add-int/2addr v4, v5

    move v7, v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 599
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v4

    add-int/2addr v4, v10

    add-int/lit8 v8, v4, 0x1

    .line 600
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v4

    add-int/2addr v4, v10

    add-int/lit8 v9, v4, 0x1

    sub-float v18, v16, v17

    move-object v4, v6

    move v5, v11

    move v6, v7

    move/from16 v7, v18

    move v13, v10

    move v10, v12

    .line 602
    invoke-static/range {v4 .. v10}, Lcom/google/android/material/carousel/KeylineStateList;->moveKeylineAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v4

    add-int/lit8 v5, v15, -0x1

    if-ne v13, v5, :cond_4

    cmpl-float v5, v2, v14

    if-lez v5, :cond_4

    const/4 v5, 0x0

    .line 612
    invoke-static {v4, v2, v12, v5, v1}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylineStateForPadding(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v4

    .line 619
    :cond_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v13, 0x1

    move/from16 v4, v17

    goto :goto_1

    :cond_5
    :goto_3
    cmpl-float v4, v2, v14

    if-lez v4, :cond_6

    const/4 v4, 0x0

    .line 554
    invoke-static {v0, v2, v12, v4, v1}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylineStateForPadding(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v0

    .line 553
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v3
.end method

.method public static getStateStepsRange(Ljava/util/List;F[F)[F
    .locals 7

    .line 241
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    .line 244
    aget v1, p2, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_0
    const/4 v4, 0x3

    if-ge v3, p0, :cond_1

    .line 246
    aget v5, p2, v3

    cmpg-float v6, p1, v5

    if-gtz v6, :cond_0

    add-int/lit8 p0, v3, -0x1

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 251
    invoke-static {v6, p2, v1, v5, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFFFF)F

    move-result p1

    int-to-float p0, p0

    int-to-float p2, v3

    new-array v1, v4, [F

    aput p1, v1, v0

    aput p0, v1, v2

    const/4 p0, 0x2

    aput p2, v1, p0

    return-object v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v1, v5

    goto :goto_0

    :cond_1
    new-array p0, v4, [F

    .line 259
    fill-array-data p0, :array_0

    return-object p0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static getStateStepsStart(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;FF)Ljava/util/List;
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    .line 438
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 439
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    invoke-static/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineStateList;->findFirstNonAnchorKeylineIndex(Lcom/google/android/material/carousel/KeylineState;)I

    move-result v11

    .line 442
    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->isHorizontal()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->getContainerWidth()I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-interface/range {p0 .. p0}, Lcom/google/android/material/carousel/Carousel;->getContainerHeight()I

    move-result v4

    :goto_0
    int-to-float v12, v4

    .line 447
    invoke-static/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineStateList;->isFirstFocalItemAtLeftOfContainer(Lcom/google/android/material/carousel/KeylineState;)Z

    move-result v4

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-nez v4, :cond_5

    const/4 v4, -0x1

    if-ne v11, v4, :cond_1

    goto/16 :goto_3

    .line 462
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v4

    sub-int v15, v4, v11

    .line 465
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    .line 466
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float v16, v4, v5

    if-gtz v15, :cond_2

    .line 468
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    cmpl-float v4, v4, v13

    if-lez v4, :cond_2

    .line 472
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    add-float v1, v16, v1

    .line 474
    invoke-static {v0, v1, v12}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylinesAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;FF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v0

    .line 473
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v15, :cond_6

    .line 0
    invoke-static {v3, v14}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v5

    .line 481
    check-cast v5, Lcom/google/android/material/carousel/KeylineState;

    add-int v6, v11, v10

    .line 486
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v14

    .line 487
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v8, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    add-float v17, v4, v8

    sub-int/2addr v6, v14

    if-ltz v6, :cond_3

    .line 489
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/KeylineState$Keyline;

    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    .line 491
    invoke-static {v5, v4}, Lcom/google/android/material/carousel/KeylineStateList;->findFirstIndexAfterLastFocalKeylineWithMask(Lcom/google/android/material/carousel/KeylineState;F)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    move v6, v4

    goto :goto_2

    :cond_3
    move v6, v7

    .line 495
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v4

    sub-int/2addr v4, v10

    add-int/lit8 v8, v4, -0x1

    .line 496
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v4

    sub-int/2addr v4, v10

    add-int/lit8 v9, v4, -0x1

    add-float v7, v16, v17

    move-object v4, v5

    move v5, v11

    move v14, v10

    move v10, v12

    .line 499
    invoke-static/range {v4 .. v10}, Lcom/google/android/material/carousel/KeylineStateList;->moveKeylineAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v4

    add-int/lit8 v5, v15, -0x1

    if-ne v14, v5, :cond_4

    cmpl-float v5, v2, v13

    if-lez v5, :cond_4

    const/4 v5, 0x1

    .line 510
    invoke-static {v4, v2, v12, v5, v1}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylineStateForPadding(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v4

    .line 517
    :cond_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v14, 0x1

    move/from16 v4, v17

    const/4 v14, 0x1

    goto :goto_1

    :cond_5
    :goto_3
    cmpl-float v4, v2, v13

    if-lez v4, :cond_6

    const/4 v4, 0x1

    .line 451
    invoke-static {v0, v2, v12, v4, v1}, Lcom/google/android/material/carousel/KeylineStateList;->shiftKeylineStateForPadding(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object v0

    .line 450
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v3
.end method

.method public static isFirstFocalItemAtLeftOfContainer(Lcom/google/android/material/carousel/KeylineState;)Z
    .locals 3

    .line 339
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 341
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstNonAnchorKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isLastFocalItemVisibleAtRightOfContainer(Lcom/google/android/material/carousel/Carousel;Lcom/google/android/material/carousel/KeylineState;)Z
    .locals 3

    .line 355
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getContainerHeight()I

    move-result v0

    .line 356
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->isHorizontal()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 357
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getContainerWidth()I

    move-result v0

    .line 360
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object p0

    iget p0, p0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, p0

    int-to-float p0, v0

    cmpg-float p0, v1, p0

    if-gtz p0, :cond_1

    .line 362
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState;->getLastNonAnchorKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object p1

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static lerp(Ljava/util/List;F[F)Lcom/google/android/material/carousel/KeylineState;
    .locals 1

    .line 220
    invoke-static {p0, p1, p2}, Lcom/google/android/material/carousel/KeylineStateList;->getStateStepsRange(Ljava/util/List;F[F)[F

    move-result-object p1

    const/4 p2, 0x1

    .line 221
    aget p2, p1, p2

    float-to-int p2, p2

    .line 222
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/carousel/KeylineState;

    const/4 v0, 0x2

    aget v0, p1, v0

    float-to-int v0, v0

    .line 223
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/carousel/KeylineState;

    const/4 v0, 0x0

    aget p1, p1, v0

    .line 221
    invoke-static {p2, p0, p1}, Lcom/google/android/material/carousel/KeylineState;->lerp(Lcom/google/android/material/carousel/KeylineState;Lcom/google/android/material/carousel/KeylineState;F)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p0

    return-object p0
.end method

.method public static moveKeylineAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;
    .locals 8

    .line 669
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 670
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 671
    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 673
    new-instance p1, Lcom/google/android/material/carousel/KeylineState$Builder;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getItemSize()F

    move-result p0

    invoke-direct {p1, p0, p6}, Lcom/google/android/material/carousel/KeylineState$Builder;-><init>(FF)V

    const/4 p0, 0x0

    .line 675
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p0, p2, :cond_1

    .line 676
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 677
    iget v4, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/high16 p6, 0x40000000    # 2.0f

    div-float p6, v4, p6

    add-float v2, p6, p3

    if-lt p0, p4, :cond_0

    if-gt p0, p5, :cond_0

    const/4 p6, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 p6, 0x0

    const/4 v5, 0x0

    .line 682
    :goto_1
    iget v3, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    iget-boolean v6, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->isAnchor:Z

    iget v7, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/material/carousel/KeylineState$Builder;->addKeyline(FFFZZF)Lcom/google/android/material/carousel/KeylineState$Builder;

    .line 683
    iget p2, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    add-float/2addr p3, p2

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 686
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineState$Builder;->build()Lcom/google/android/material/carousel/KeylineState;

    move-result-object p0

    return-object p0
.end method

.method public static shiftKeylineStateForPadding(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;
    .locals 16

    .line 369
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getKeylines()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 370
    new-instance v1, Lcom/google/android/material/carousel/KeylineState$Builder;

    .line 371
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getItemSize()F

    move-result v2

    move/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lcom/google/android/material/carousel/KeylineState$Builder;-><init>(FF)V

    .line 373
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getNumberOfNonAnchorKeylines()I

    move-result v2

    int-to-float v2, v2

    div-float v11, p1, v2

    if-eqz p3, :cond_0

    move/from16 v2, p1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    move v12, v2

    const/4 v13, 0x0

    .line 380
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v13, v2, :cond_5

    .line 381
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 382
    iget-boolean v3, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->isAnchor:Z

    if-eqz v3, :cond_1

    .line 383
    iget v3, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    iget v4, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    iget v5, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    const/4 v7, 0x1

    iget v8, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    const/4 v6, 0x0

    move-object v2, v1

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/material/carousel/KeylineState$Builder;->addKeyline(FFFZZF)Lcom/google/android/material/carousel/KeylineState$Builder;

    move/from16 v15, p4

    goto :goto_5

    .line 394
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v3

    if-lt v13, v3, :cond_2

    .line 395
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v3

    if-gt v13, v3, :cond_2

    const/4 v3, 0x1

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 397
    :goto_2
    iget v3, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->maskedItemSize:F

    sub-float v14, v3, v11

    .line 400
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/KeylineState;->getItemSize()F

    move-result v3

    move/from16 v15, p4

    .line 399
    invoke-static {v14, v3, v15}, Lcom/google/android/material/carousel/CarouselStrategy;->getChildMaskPercentage(FFF)F

    move-result v4

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v14, v3

    add-float/2addr v3, v12

    .line 403
    iget v5, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    sub-float v5, v3, v5

    .line 405
    iget v8, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->cutoff:F

    if-eqz p3, :cond_3

    move v9, v5

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    const/4 v9, 0x0

    :goto_3
    if-eqz p3, :cond_4

    const/4 v2, 0x0

    const/4 v10, 0x0

    goto :goto_4

    :cond_4
    move v10, v5

    :goto_4
    const/4 v7, 0x0

    move-object v2, v1

    move v5, v14

    invoke-virtual/range {v2 .. v10}, Lcom/google/android/material/carousel/KeylineState$Builder;->addKeyline(FFFZZFFF)Lcom/google/android/material/carousel/KeylineState$Builder;

    add-float/2addr v12, v14

    :goto_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 416
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/material/carousel/KeylineState$Builder;->build()Lcom/google/android/material/carousel/KeylineState;

    move-result-object v0

    return-object v0
.end method

.method public static shiftKeylinesAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;FF)Lcom/google/android/material/carousel/KeylineState;
    .locals 7

    .line 642
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeylineIndex()I

    move-result v4

    .line 643
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeylineIndex()I

    move-result v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p1

    move v6, p2

    .line 637
    invoke-static/range {v0 .. v6}, Lcom/google/android/material/carousel/KeylineStateList;->moveKeylineAndCreateKeylineState(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getDefaultState()Lcom/google/android/material/carousel/KeylineState;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->defaultState:Lcom/google/android/material/carousel/KeylineState;

    return-object v0
.end method

.method public getEndState()Lcom/google/android/material/carousel/KeylineState;
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateSteps:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 109
    check-cast v0, Lcom/google/android/material/carousel/KeylineState;

    return-object v0
.end method

.method public getKeylineStateForPositionMap(IIIZ)Ljava/util/Map;
    .locals 9

    .line 733
    iget-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->defaultState:Lcom/google/android/material/carousel/KeylineState;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/KeylineState;->getItemSize()F

    move-result v0

    .line 734
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v3, p1, :cond_4

    if-eqz p4, :cond_0

    sub-int v6, p1, v3

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    int-to-float v7, v6

    mul-float v7, v7, v0

    if-eqz p4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v5, 0x1

    :goto_2
    int-to-float v5, v5

    mul-float v7, v7, v5

    int-to-float v5, p3

    .line 742
    iget v8, p0, Lcom/google/android/material/carousel/KeylineStateList;->endShiftRange:F

    sub-float/2addr v5, v8

    cmpl-float v5, v7, v5

    if-gtz v5, :cond_2

    iget-object v5, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateSteps:Ljava/util/List;

    .line 743
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    sub-int v5, p1, v5

    if-lt v3, v5, :cond_3

    .line 745
    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateSteps:Ljava/util/List;

    .line 746
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-static {v4, v2, v7}, Ll/֫۫;->֫(III)I

    move-result v7

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/material/carousel/KeylineState;

    .line 744
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    add-int/lit8 p3, p1, -0x1

    const/4 v3, 0x0

    :goto_3
    if-ltz p3, :cond_9

    if-eqz p4, :cond_5

    sub-int v4, p1, p3

    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    :cond_5
    move v4, p3

    :goto_4
    int-to-float v5, v4

    mul-float v5, v5, v0

    if-eqz p4, :cond_6

    const/4 v6, -0x1

    goto :goto_5

    :cond_6
    const/4 v6, 0x1

    :goto_5
    int-to-float v6, v6

    mul-float v5, v5, v6

    int-to-float v6, p2

    .line 757
    iget v7, p0, Lcom/google/android/material/carousel/KeylineStateList;->startShiftRange:F

    add-float/2addr v6, v7

    cmpg-float v5, v5, v6

    if-ltz v5, :cond_7

    iget-object v5, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateSteps:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge p3, v5, :cond_8

    .line 761
    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateSteps:Ljava/util/List;

    .line 762
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-static {v3, v2, v6}, Ll/֫۫;->֫(III)I

    move-result v6

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/carousel/KeylineState;

    .line 760
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    :cond_8
    add-int/lit8 p3, p3, -0x1

    goto :goto_3

    :cond_9
    return-object v1
.end method

.method public getShiftedState(FFF)Lcom/google/android/material/carousel/KeylineState;
    .locals 1

    const/4 v0, 0x0

    .line 129
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/carousel/KeylineStateList;->getShiftedState(FFFZ)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p1

    return-object p1
.end method

.method public getShiftedState(FFFZ)Lcom/google/android/material/carousel/KeylineState;
    .locals 5

    .line 155
    iget v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->startShiftRange:F

    add-float/2addr v0, p2

    .line 156
    iget v1, p0, Lcom/google/android/material/carousel/KeylineStateList;->endShiftRange:F

    sub-float v1, p3, v1

    .line 157
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineStateList;->getStartState()Lcom/google/android/material/carousel/KeylineState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->getFirstFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->leftOrTopPaddingShift:F

    .line 158
    invoke-virtual {p0}, Lcom/google/android/material/carousel/KeylineStateList;->getEndState()Lcom/google/android/material/carousel/KeylineState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/material/carousel/KeylineState;->getLastFocalKeyline()Lcom/google/android/material/carousel/KeylineState$Keyline;

    move-result-object v3

    iget v3, v3, Lcom/google/android/material/carousel/KeylineState$Keyline;->rightOrBottomPaddingShift:F

    .line 166
    iget v4, p0, Lcom/google/android/material/carousel/KeylineStateList;->startShiftRange:F

    cmpl-float v4, v4, v2

    if-nez v4, :cond_0

    add-float/2addr v0, v2

    .line 170
    :cond_0
    iget v2, p0, Lcom/google/android/material/carousel/KeylineStateList;->endShiftRange:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    sub-float/2addr v1, v3

    :cond_1
    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, p1, v0

    if-gez v4, :cond_2

    .line 178
    invoke-static {v3, v2, p2, v0, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFFFF)F

    move-result p1

    .line 184
    iget-object p2, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateSteps:Ljava/util/List;

    .line 185
    iget-object p3, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateStepsInterpolationPoints:[F

    goto :goto_0

    :cond_2
    cmpl-float p2, p1, v1

    if-lez p2, :cond_4

    .line 188
    invoke-static {v2, v3, v1, p3, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFFFF)F

    move-result p1

    .line 194
    iget-object p2, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateSteps:Ljava/util/List;

    .line 195
    iget-object p3, p0, Lcom/google/android/material/carousel/KeylineStateList;->endStateStepsInterpolationPoints:[F

    :goto_0
    if-eqz p4, :cond_3

    .line 201
    invoke-direct {p0, p2, p1, p3}, Lcom/google/android/material/carousel/KeylineStateList;->closestStateStepFromInterpolation(Ljava/util/List;F[F)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p1

    return-object p1

    .line 203
    :cond_3
    invoke-static {p2, p1, p3}, Lcom/google/android/material/carousel/KeylineStateList;->lerp(Ljava/util/List;F[F)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p1

    return-object p1

    .line 197
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/carousel/KeylineStateList;->defaultState:Lcom/google/android/material/carousel/KeylineState;

    return-object p1
.end method

.method public getStartState()Lcom/google/android/material/carousel/KeylineState;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/google/android/material/carousel/KeylineStateList;->startStateSteps:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 101
    check-cast v0, Lcom/google/android/material/carousel/KeylineState;

    return-object v0
.end method
