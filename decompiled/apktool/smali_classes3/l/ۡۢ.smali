.class public Ll/ۡۢ;
.super Ll/֫ۖ;
.source "M5Y2"

# interfaces
.implements Ll/ۙۜ;
.implements Ll/ۜ᩷;


# instance fields
.field public ۗ:Ll/ۗۜ;

.field public ۙ:I

.field public ۛ:Landroid/content/Context;

.field public ۤ:Ll/ۢۢ;

.field public ۨ:I

.field public ۫:I

.field public ۬:Ll/᩶ۜ;

.field public ܰ:Z

.field public ᩶:I

.field public ᩸:Ll/ܿ᩷;

.field public ᩹:Z

.field public ᩺:Ll/ܿۢ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 83
    invoke-direct {p0, p1, p2}, Ll/֫ۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 84
    invoke-virtual {p0, p2}, Ll/֫ۖ;->setBaselineAligned(Z)V

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float v1, v1, v0

    float-to-int v1, v1

    .line 86
    iput v1, p0, Ll/ۡۢ;->۫:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 87
    iput v0, p0, Ll/ۡۢ;->ۙ:I

    .line 88
    iput-object p1, p0, Ll/ۡۢ;->ۛ:Landroid/content/Context;

    .line 89
    iput p2, p0, Ll/ۡۢ;->ۨ:I

    return-void
.end method

.method public static generateDefaultLayoutParams()Ll/ۜۢ;
    .locals 2

    .line 580
    new-instance v0, Ll/ۜۢ;

    const/4 v1, -0x2

    .line 1814
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x0

    .line 834
    iput-boolean v1, v0, Ll/ۜۢ;->ܿ:Z

    const/16 v1, 0x10

    .line 582
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object v0
.end method

.method public static generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ۜۢ;
    .locals 1

    if-eqz p0, :cond_2

    .line 594
    instance-of v0, p0, Ll/ۜۢ;

    if-eqz v0, :cond_0

    .line 595
    new-instance v0, Ll/ۜۢ;

    check-cast p0, Ll/ۜۢ;

    .line 1835
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 829
    iget-boolean p0, p0, Ll/ۜۢ;->ܿ:Z

    iput-boolean p0, v0, Ll/ۜۢ;->ܿ:Z

    goto :goto_0

    .line 596
    :cond_0
    new-instance v0, Ll/ۜۢ;

    .line 1835
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 597
    :goto_0
    iget p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gtz p0, :cond_1

    const/16 p0, 0x10

    .line 598
    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    :cond_1
    return-object v0

    .line 602
    :cond_2
    invoke-static {}, Ll/ۡۢ;->generateDefaultLayoutParams()Ll/ۜۢ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 607
    instance-of p1, p1, Ll/ۜۢ;

    return p1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 50
    invoke-static {}, Ll/ۡۢ;->generateDefaultLayoutParams()Ll/ۜۢ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Ll/۟ܺ;
    .locals 1

    .line 50
    invoke-static {}, Ll/ۡۢ;->generateDefaultLayoutParams()Ll/ۜۢ;

    move-result-object v0

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 588
    new-instance v0, Ll/ۜۢ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ۜۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 50
    invoke-static {p1}, Ll/ۡۢ;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ۜۢ;

    move-result-object p1

    return-object p1
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Ll/۟ܺ;
    .locals 2

    .line 588
    new-instance v0, Ll/ۜۢ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ۜۢ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/۟ܺ;
    .locals 0

    .line 50
    invoke-static {p1}, Ll/ۡۢ;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ۜۢ;

    move-result-object p1

    return-object p1
.end method

.method public final initialize(Ll/ۗۜ;)V
    .locals 0

    .line 632
    iput-object p1, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 130
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 132
    iget-object p1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 133
    invoke-virtual {p1, v0}, Ll/ܿۢ;->updateMenuView(Z)V

    .line 135
    iget-object p1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {p1}, Ll/ܿۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 136
    iget-object p1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {p1}, Ll/ܿۢ;->ܽ()Z

    .line 137
    iget-object p1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {p1}, Ll/ܿۢ;->ۜ()Z

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 543
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 544
    invoke-virtual {p0}, Ll/ۡۢ;->ܽ()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 10

    .line 441
    iget-boolean v0, p0, Ll/ۡۢ;->᩹:Z

    if-nez v0, :cond_0

    .line 442
    invoke-super/range {p0 .. p5}, Ll/֫ۖ;->onLayout(ZIIII)V

    return-void

    .line 446
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    sub-int/2addr p5, p3

    .line 447
    div-int/lit8 p5, p5, 0x2

    .line 448
    invoke-virtual {p0}, Ll/֫ۖ;->getDividerWidth()I

    move-result p3

    sub-int/2addr p4, p2

    .line 451
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    .line 453
    sget v0, Ll/᩹ᩴ;->֫:I

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const/16 v5, 0x8

    if-ge v2, p1, :cond_6

    .line 455
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 456
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-ne v7, v5, :cond_2

    goto :goto_3

    .line 460
    :cond_2
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ۜۢ;

    .line 461
    iget-boolean v7, v5, Ll/ۜۢ;->ܿ:Z

    if-eqz v7, :cond_5

    .line 462
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 463
    invoke-virtual {p0, v2}, Ll/ۡۢ;->֫(I)Z

    move-result v7

    if-eqz v7, :cond_3

    add-int/2addr v3, p3

    .line 466
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    if-eqz v0, :cond_4

    .line 470
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v8, v5

    add-int v5, v8, v3

    goto :goto_2

    .line 473
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    sub-int/2addr v8, v9

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    sub-int v5, v8, v5

    sub-int v8, v5, v3

    .line 476
    :goto_2
    div-int/lit8 v9, v7, 0x2

    sub-int v9, p5, v9

    add-int/2addr v7, v9

    .line 478
    invoke-virtual {v6, v8, v9, v5, v7}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr p2, v3

    const/4 v3, 0x1

    goto :goto_3

    .line 483
    :cond_5
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v6, v7

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v6, v5

    sub-int/2addr p2, v6

    .line 485
    invoke-virtual {p0, v2}, Ll/ۡۢ;->֫(I)Z

    add-int/lit8 v4, v4, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    if-ne p1, v1, :cond_7

    if-nez v3, :cond_7

    const/4 p1, 0x0

    .line 493
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 494
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 495
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    .line 496
    div-int/lit8 p4, p4, 0x2

    .line 497
    div-int/lit8 v0, p2, 0x2

    sub-int/2addr p4, v0

    .line 498
    div-int/lit8 v0, p3, 0x2

    sub-int/2addr p5, v0

    add-int/2addr p2, p4

    add-int/2addr p3, p5

    .line 499
    invoke-virtual {p1, p4, p5, p2, p3}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_7
    xor-int/lit8 p3, v3, 0x1

    sub-int/2addr v4, p3

    if-lez v4, :cond_8

    .line 504
    div-int/2addr p2, v4

    goto :goto_4

    :cond_8
    const/4 p2, 0x0

    :goto_4
    const/4 p3, 0x0

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-eqz v0, :cond_b

    .line 507
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p4

    sub-int/2addr p3, p4

    const/4 p4, 0x0

    :goto_5
    if-ge p4, p1, :cond_e

    .line 509
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 510
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ۜۢ;

    .line 511
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v5, :cond_a

    iget-boolean v2, v1, Ll/ۜۢ;->ܿ:Z

    if-eqz v2, :cond_9

    goto :goto_6

    .line 515
    :cond_9
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    sub-int/2addr p3, v2

    .line 516
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 517
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 518
    div-int/lit8 v4, v3, 0x2

    sub-int v4, p5, v4

    sub-int v6, p3, v2

    add-int/2addr v3, v4

    .line 519
    invoke-virtual {v0, v6, v4, p3, v3}, Landroid/view/View;->layout(IIII)V

    .line 520
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, p2

    sub-int/2addr p3, v2

    :cond_a
    :goto_6
    add-int/lit8 p4, p4, 0x1

    goto :goto_5

    .line 523
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    const/4 p4, 0x0

    :goto_7
    if-ge p4, p1, :cond_e

    .line 525
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 526
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ۜۢ;

    .line 527
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v5, :cond_d

    iget-boolean v2, v1, Ll/ۜۢ;->ܿ:Z

    if-eqz v2, :cond_c

    goto :goto_8

    .line 531
    :cond_c
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr p3, v2

    .line 532
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 533
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 534
    div-int/lit8 v4, v3, 0x2

    sub-int v4, p5, v4

    add-int v6, p3, v2

    add-int/2addr v3, v4

    .line 535
    invoke-virtual {v0, p3, v4, v6, v3}, Landroid/view/View;->layout(IIII)V

    .line 536
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    invoke-static {v2, v0, p2, p3}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p3

    :cond_d
    :goto_8
    add-int/lit8 p4, p4, 0x1

    goto :goto_7

    :cond_e
    return-void
.end method

.method public final onMeasure(II)V
    .locals 31

    move-object/from16 v0, p0

    .line 149
    iget-boolean v1, v0, Ll/ۡۢ;->᩹:Z

    .line 150
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Ll/ۡۢ;->᩹:Z

    if-eq v1, v2, :cond_1

    .line 153
    iput v4, v0, Ll/ۡۢ;->᩶:I

    .line 158
    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 159
    iget-boolean v2, v0, Ll/ۡۢ;->᩹:Z

    if-eqz v2, :cond_2

    iget-object v2, v0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    if-eqz v2, :cond_2

    iget v5, v0, Ll/ۡۢ;->᩶:I

    if-eq v1, v5, :cond_2

    .line 160
    iput v1, v0, Ll/ۡۢ;->᩶:I

    .line 161
    invoke-virtual {v2, v3}, Ll/ۗۜ;->onItemsChanged(Z)V

    .line 164
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 165
    iget-boolean v2, v0, Ll/ۡۢ;->᩹:Z

    if-eqz v2, :cond_2e

    if-lez v1, :cond_2e

    .line 180
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 181
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 182
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 184
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v5

    .line 185
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v7, v5

    const/4 v5, -0x2

    move/from16 v8, p2

    .line 187
    invoke-static {v8, v7, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    sub-int/2addr v2, v6

    .line 193
    iget v6, v0, Ll/ۡۢ;->۫:I

    div-int v8, v2, v6

    .line 194
    rem-int v9, v2, v6

    if-nez v8, :cond_3

    .line 198
    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    .line 202
    :cond_3
    div-int/2addr v9, v8

    add-int/2addr v9, v6

    .line 214
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    .line 215
    :goto_1
    iget v10, v0, Ll/ۡۢ;->ۙ:I

    if-ge v14, v4, :cond_12

    .line 216
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    move/from16 v19, v3

    .line 217
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v3

    move/from16 v20, v2

    const/16 v2, 0x8

    if-ne v3, v2, :cond_4

    move/from16 v23, v1

    move/from16 v21, v7

    goto/16 :goto_8

    .line 219
    :cond_4
    instance-of v2, v11, Ll/ۢۜ;

    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    .line 225
    invoke-virtual {v11, v10, v3, v10, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 228
    :cond_5
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Ll/ۜۢ;

    .line 229
    iput-boolean v3, v10, Ll/ۜۢ;->ܽ:Z

    .line 230
    iput v3, v10, Ll/ۜۢ;->ᩳ:I

    .line 231
    iput v3, v10, Ll/ۜۢ;->֫:I

    .line 232
    iput-boolean v3, v10, Ll/ۜۢ;->ۧ:Z

    .line 233
    iput v3, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 234
    iput v3, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    if-eqz v2, :cond_6

    .line 235
    move-object v3, v11

    check-cast v3, Ll/ۢۜ;

    .line 241
    invoke-virtual {v3}, Ll/ܳܺ;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    .line 235
    :goto_2
    iput-boolean v3, v10, Ll/ۜۢ;->ܳ:Z

    .line 238
    iget-boolean v3, v10, Ll/ۜۢ;->ܿ:Z

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    move v3, v8

    .line 406
    :goto_3
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v21

    move/from16 v22, v12

    move-object/from16 v12, v21

    check-cast v12, Ll/ۜۢ;

    .line 408
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v21

    move/from16 v23, v1

    sub-int v1, v21, v7

    move/from16 v21, v7

    .line 410
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 411
    invoke-static {v1, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    if-eqz v2, :cond_8

    .line 414
    move-object v2, v11

    check-cast v2, Ll/ۢۜ;

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_9

    .line 241
    invoke-virtual {v2}, Ll/ܳܺ;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    const/4 v2, 0x1

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    :goto_5
    if-lez v3, :cond_c

    if-eqz v2, :cond_a

    const/4 v7, 0x2

    if-lt v3, v7, :cond_c

    :cond_a
    mul-int v3, v3, v9

    const/high16 v7, -0x80000000

    .line 419
    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 421
    invoke-virtual {v11, v3, v1}, Landroid/view/View;->measure(II)V

    .line 423
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 424
    div-int v7, v3, v9

    .line 425
    rem-int/2addr v3, v9

    if-eqz v3, :cond_b

    add-int/lit8 v7, v7, 0x1

    :cond_b
    if-eqz v2, :cond_d

    const/4 v3, 0x2

    if-ge v7, v3, :cond_d

    const/4 v7, 0x2

    goto :goto_6

    :cond_c
    const/4 v7, 0x0

    .line 429
    :cond_d
    :goto_6
    iget-boolean v3, v12, Ll/ۜۢ;->ܿ:Z

    if-nez v3, :cond_e

    if-eqz v2, :cond_e

    const/4 v2, 0x1

    goto :goto_7

    :cond_e
    const/4 v2, 0x0

    .line 430
    :goto_7
    iput-boolean v2, v12, Ll/ۜۢ;->ۧ:Z

    .line 432
    iput v7, v12, Ll/ۜۢ;->֫:I

    mul-int v2, v7, v9

    const/high16 v3, 0x40000000    # 2.0f

    .line 434
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v11, v2, v1}, Landroid/view/View;->measure(II)V

    .line 243
    invoke-static {v13, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 244
    iget-boolean v2, v10, Ll/ۜۢ;->ۧ:Z

    if-eqz v2, :cond_f

    add-int/lit8 v16, v16, 0x1

    .line 245
    :cond_f
    iget-boolean v2, v10, Ll/ۜۢ;->ܿ:Z

    if-eqz v2, :cond_10

    const/4 v15, 0x1

    :cond_10
    sub-int/2addr v8, v7

    .line 248
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v3, 0x1

    if-ne v7, v3, :cond_11

    shl-int/2addr v3, v14

    int-to-long v6, v3

    or-long v6, v17, v6

    move v13, v1

    move-wide/from16 v17, v6

    move/from16 v12, v22

    move v6, v2

    goto :goto_8

    :cond_11
    move v13, v1

    move v6, v2

    move/from16 v12, v22

    :goto_8
    add-int/lit8 v14, v14, 0x1

    move/from16 v3, v19

    move/from16 v2, v20

    move/from16 v7, v21

    move/from16 v1, v23

    goto/16 :goto_1

    :cond_12
    move/from16 v23, v1

    move/from16 v20, v2

    move/from16 v19, v3

    if-eqz v15, :cond_13

    const/4 v1, 0x2

    if-ne v12, v1, :cond_13

    const/4 v1, 0x1

    goto :goto_9

    :cond_13
    const/4 v1, 0x0

    :goto_9
    const/4 v2, 0x0

    :goto_a
    const-wide/16 v21, 0x1

    if-lez v16, :cond_1e

    if-lez v8, :cond_1e

    const v3, 0x7fffffff

    const/4 v7, 0x0

    const/4 v11, 0x0

    const-wide/16 v24, 0x0

    :goto_b
    if-ge v11, v4, :cond_17

    .line 265
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 266
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Ll/ۜۢ;

    move/from16 v26, v2

    .line 269
    iget-boolean v2, v14, Ll/ۜۢ;->ۧ:Z

    if-nez v2, :cond_14

    goto :goto_c

    .line 272
    :cond_14
    iget v2, v14, Ll/ۜۢ;->֫:I

    if-ge v2, v3, :cond_15

    shl-long v24, v21, v11

    const/4 v3, 0x1

    move v3, v2

    const/4 v7, 0x1

    goto :goto_c

    :cond_15
    if-ne v2, v3, :cond_16

    shl-long v27, v21, v11

    or-long v24, v24, v27

    add-int/lit8 v7, v7, 0x1

    :cond_16
    :goto_c
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v26

    goto :goto_b

    :cond_17
    move/from16 v26, v2

    or-long v17, v17, v24

    if-le v7, v8, :cond_18

    goto :goto_10

    :cond_18
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v4, :cond_1d

    .line 291
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 292
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ۜۢ;

    const/4 v14, 0x1

    shl-int/2addr v14, v2

    move/from16 v27, v5

    move/from16 v28, v6

    int-to-long v5, v14

    and-long v21, v24, v5

    const-wide/16 v29, 0x0

    cmp-long v14, v21, v29

    if-nez v14, :cond_19

    .line 295
    iget v7, v11, Ll/ۜۢ;->֫:I

    if-ne v7, v3, :cond_1c

    or-long v17, v17, v5

    goto :goto_f

    :cond_19
    if-eqz v1, :cond_1a

    .line 299
    iget-boolean v5, v11, Ll/ۜۢ;->ܳ:Z

    if-eqz v5, :cond_1a

    const/4 v5, 0x1

    if-ne v8, v5, :cond_1b

    add-int v6, v10, v9

    const/4 v14, 0x0

    .line 301
    invoke-virtual {v7, v6, v14, v10, v14}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_e

    :cond_1a
    const/4 v5, 0x1

    .line 303
    :cond_1b
    :goto_e
    iget v6, v11, Ll/ۜۢ;->֫:I

    add-int/2addr v6, v5

    iput v6, v11, Ll/ۜۢ;->֫:I

    .line 304
    iput-boolean v5, v11, Ll/ۜۢ;->ܽ:Z

    add-int/lit8 v8, v8, -0x1

    :cond_1c
    :goto_f
    add-int/lit8 v2, v2, 0x1

    move/from16 v5, v27

    move/from16 v6, v28

    goto :goto_d

    :cond_1d
    move/from16 v27, v5

    move/from16 v28, v6

    const/4 v2, 0x1

    goto/16 :goto_a

    :cond_1e
    move/from16 v26, v2

    :goto_10
    move/from16 v27, v5

    move/from16 v28, v6

    const/4 v1, 0x1

    if-nez v15, :cond_1f

    if-ne v12, v1, :cond_1f

    const/4 v2, 0x1

    goto :goto_11

    :cond_1f
    const/4 v2, 0x0

    :goto_11
    if-lez v8, :cond_2a

    const-wide/16 v5, 0x0

    cmp-long v3, v17, v5

    if-eqz v3, :cond_2a

    sub-int/2addr v12, v1

    if-lt v8, v12, :cond_20

    if-nez v2, :cond_20

    if-le v13, v1, :cond_2a

    .line 317
    :cond_20
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->bitCount(J)I

    move-result v1

    int-to-float v1, v1

    if-nez v2, :cond_22

    and-long v2, v17, v21

    const/high16 v5, 0x3f000000    # 0.5f

    const-wide/16 v6, 0x0

    cmp-long v10, v2, v6

    if-eqz v10, :cond_21

    const/4 v2, 0x0

    .line 322
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ۜۢ;

    .line 323
    iget-boolean v2, v2, Ll/ۜۢ;->ܳ:Z

    if-nez v2, :cond_21

    sub-float/2addr v1, v5

    :cond_21
    add-int/lit8 v2, v4, -0x1

    const/4 v3, 0x1

    shl-int/2addr v3, v2

    int-to-long v6, v3

    and-long v6, v17, v6

    const-wide/16 v10, 0x0

    cmp-long v3, v6, v10

    if-eqz v3, :cond_22

    .line 326
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ۜۢ;

    .line 327
    iget-boolean v2, v2, Ll/ۜۢ;->ܳ:Z

    if-nez v2, :cond_22

    sub-float/2addr v1, v5

    :cond_22
    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_23

    mul-int v8, v8, v9

    int-to-float v2, v8

    div-float/2addr v2, v1

    float-to-int v1, v2

    goto :goto_12

    :cond_23
    const/4 v1, 0x0

    :goto_12
    const/4 v2, 0x0

    :goto_13
    if-ge v2, v4, :cond_2a

    const/4 v3, 0x1

    shl-int/2addr v3, v2

    int-to-long v5, v3

    and-long v5, v17, v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-nez v3, :cond_24

    goto :goto_15

    .line 337
    :cond_24
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 338
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ۜۢ;

    .line 339
    instance-of v3, v3, Ll/ۢۜ;

    if-eqz v3, :cond_25

    .line 341
    iput v1, v5, Ll/ۜۢ;->ᩳ:I

    const/4 v3, 0x1

    .line 342
    iput-boolean v3, v5, Ll/ۜۢ;->ܽ:Z

    if-nez v2, :cond_26

    .line 343
    iget-boolean v3, v5, Ll/ۜۢ;->ܳ:Z

    if-nez v3, :cond_26

    neg-int v3, v1

    .line 346
    div-int/lit8 v3, v3, 0x2

    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    goto :goto_14

    .line 349
    :cond_25
    iget-boolean v3, v5, Ll/ۜۢ;->ܿ:Z

    if-eqz v3, :cond_27

    .line 350
    iput v1, v5, Ll/ۜۢ;->ᩳ:I

    const/4 v3, 0x1

    .line 351
    iput-boolean v3, v5, Ll/ۜۢ;->ܽ:Z

    neg-int v3, v1

    .line 352
    div-int/lit8 v3, v3, 0x2

    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :cond_26
    :goto_14
    const/16 v26, 0x1

    goto :goto_15

    :cond_27
    if-eqz v2, :cond_28

    .line 359
    div-int/lit8 v3, v1, 0x2

    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    :cond_28
    add-int/lit8 v3, v4, -0x1

    if-eq v2, v3, :cond_29

    .line 362
    div-int/lit8 v3, v1, 0x2

    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :cond_29
    :goto_15
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_2a
    move/from16 v2, v26

    if-eqz v2, :cond_2c

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v4, :cond_2c

    .line 373
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 374
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ۜۢ;

    .line 376
    iget-boolean v5, v3, Ll/ۜۢ;->ܽ:Z

    if-nez v5, :cond_2b

    move/from16 v5, v27

    goto :goto_17

    .line 378
    :cond_2b
    iget v5, v3, Ll/ۜۢ;->֫:I

    mul-int v5, v5, v9

    iget v3, v3, Ll/ۜۢ;->ᩳ:I

    add-int/2addr v5, v3

    const/high16 v3, 0x40000000    # 2.0f

    .line 379
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    move/from16 v5, v27

    invoke-virtual {v2, v3, v5}, Landroid/view/View;->measure(II)V

    :goto_17
    add-int/lit8 v1, v1, 0x1

    move/from16 v27, v5

    goto :goto_16

    :cond_2c
    const/high16 v1, 0x40000000    # 2.0f

    move/from16 v2, v23

    if-eq v2, v1, :cond_2d

    move/from16 v2, v20

    move/from16 v3, v28

    goto :goto_18

    :cond_2d
    move/from16 v3, v19

    move/from16 v2, v20

    .line 388
    :goto_18
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_2e
    move/from16 v8, p2

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v1, :cond_2f

    .line 170
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 171
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ۜۢ;

    const/4 v4, 0x0

    .line 172
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    .line 174
    :cond_2f
    invoke-super/range {p0 .. p2}, Ll/֫ۖ;->onMeasure(II)V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 553
    invoke-virtual {p0}, Ll/ۡۢ;->ᩳ()Landroid/view/Menu;

    .line 554
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {v0, p1}, Ll/ܿۢ;->֫(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final ֫(Ll/ܿۢ;)V
    .locals 0

    .line 124
    iput-object p1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    .line 125
    invoke-virtual {p1, p0}, Ll/ܿۢ;->֫(Ll/ۡۢ;)V

    return-void
.end method

.method public final ֫(Ll/ܿ᩷;Ll/᩶ۜ;)V
    .locals 0

    .line 664
    iput-object p1, p0, Ll/ۡۢ;->᩸:Ll/ܿ᩷;

    .line 665
    iput-object p2, p0, Ll/ۡۢ;->۬:Ll/᩶ۜ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 575
    iput-boolean p1, p0, Ll/ۡۢ;->ܰ:Z

    return-void
.end method

.method public final ֫(I)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, p1, -0x1

    .line 725
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 726
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 728
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1

    instance-of v3, v1, Ll/ܳۢ;

    if-eqz v3, :cond_1

    .line 729
    check-cast v1, Ll/ܳۢ;

    invoke-interface {v1}, Ll/ܳۢ;->֫()Z

    move-result v0

    :cond_1
    if-lez p1, :cond_2

    .line 731
    instance-of p1, v2, Ll/ܳۢ;

    if-eqz p1, :cond_2

    .line 732
    check-cast v2, Ll/ܳۢ;

    invoke-interface {v2}, Ll/ܳۢ;->ۧ()Z

    move-result p1

    or-int/2addr p1, v0

    return p1

    :cond_2
    return v0
.end method

.method public final ֫(Ll/ۛۜ;)Z
    .locals 2

    .line 620
    iget-object v0, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result p1

    return p1
.end method

.method public final ۖ()Z
    .locals 1

    .line 682
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Z
    .locals 2

    .line 706
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz v0, :cond_1

    .line 399
    iget-object v1, v0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/ܿۢ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Ll/ۗۜ;
    .locals 1

    .line 673
    iget-object v0, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    return-object v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 570
    iget-boolean v0, p0, Ll/ۡۢ;->ܰ:Z

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 100
    iget v0, p0, Ll/ۡۢ;->ۨ:I

    if-eq v0, p1, :cond_1

    .line 101
    iput p1, p0, Ll/ۡۢ;->ۨ:I

    if-nez p1, :cond_0

    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۡۢ;->ۛ:Landroid/content/Context;

    return-void

    .line 105
    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll/ۡۢ;->ۛ:Landroid/content/Context;

    :cond_1
    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 116
    iget v0, p0, Ll/ۡۢ;->ۨ:I

    return v0
.end method

.method public final ܺ()V
    .locals 1

    .line 744
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {v0}, Ll/ܿۢ;->ܳ()V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 713
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz v0, :cond_0

    .line 373
    invoke-virtual {v0}, Ll/ܿۢ;->ܽ()Z

    .line 384
    iget-object v0, v0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 564
    invoke-virtual {p0}, Ll/ۡۢ;->ᩳ()Landroid/view/Menu;

    .line 565
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {v0}, Ll/ܿۢ;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Landroid/view/Menu;
    .locals 3

    .line 644
    iget-object v0, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    if-nez v0, :cond_1

    .line 645
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 646
    new-instance v1, Ll/ۗۜ;

    invoke-direct {v1, v0}, Ll/ۗۜ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    .line 647
    new-instance v2, Ll/᩷ۢ;

    invoke-direct {v2, p0}, Ll/᩷ۢ;-><init>(Ll/ۡۢ;)V

    invoke-virtual {v1, v2}, Ll/ۗۜ;->setCallback(Ll/᩶ۜ;)V

    .line 648
    new-instance v1, Ll/ܿۢ;

    invoke-direct {v1, v0}, Ll/ܿۢ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    .line 649
    invoke-virtual {v1}, Ll/ܿۢ;->᩻()V

    .line 650
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    iget-object v1, p0, Ll/ۡۢ;->᩸:Ll/ܿ᩷;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 651
    :cond_0
    new-instance v1, Ll/᩻ۢ;

    .line 781
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 650
    :goto_0
    invoke-virtual {v0, v1}, Ll/ۡۜ;->setCallback(Ll/ܿ᩷;)V

    .line 652
    iget-object v0, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    iget-object v1, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    iget-object v2, p0, Ll/ۡۢ;->ۛ:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;Landroid/content/Context;)V

    .line 653
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    invoke-virtual {v0, p0}, Ll/ܿۢ;->֫(Ll/ۡۢ;)V

    .line 656
    :cond_1
    iget-object v0, p0, Ll/ۡۢ;->ۗ:Ll/ۗۜ;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 701
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿۢ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 691
    iget-object v0, p0, Ll/ۡۢ;->᩺:Ll/ܿۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
