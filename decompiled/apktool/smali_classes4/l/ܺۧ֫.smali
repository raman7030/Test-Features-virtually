.class public final Ll/ܺۧ֫;
.super Ljava/lang/Object;
.source "651C"


# static fields
.field public static final ᩶:Landroid/view/animation/Interpolator;


# instance fields
.field public ֡:I

.field public ֨:Landroid/widget/OverScroller;

.field public ֫:I

.field public ۖ:[F

.field public ۘ:F

.field public ۚ:Z

.field public ۜ:I

.field public final ۠:Ljava/lang/Runnable;

.field public ۡ:[F

.field public ۢ:[F

.field public final ۧ:Ll/ۡۧ֫;

.field public ܳ:[I

.field public ܶ:I

.field public ܺ:[F

.field public ܽ:Landroid/view/View;

.field public ܿ:I

.field public final ᩳ:I

.field public ᩴ:F

.field public final ᩵:Landroid/view/ViewGroup;

.field public ᩷:[I

.field public ᩸:I

.field public ᩹:Landroid/view/VelocityTracker;

.field public ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 334
    new-instance v0, Ll/᩷ۧ֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܺۧ֫;->᩶:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Ll/ۡۧ֫;)V
    .locals 1

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 120
    iput v0, p0, Ll/ܺۧ֫;->֫:I

    .line 342
    new-instance v0, Ll/ۢۧ֫;

    invoke-direct {v0, p0}, Ll/ۢۧ֫;-><init>(Ll/ܺۧ֫;)V

    iput-object v0, p0, Ll/ܺۧ֫;->۠:Ljava/lang/Runnable;

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 393
    iput-object p2, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    .line 394
    iput-object p3, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    .line 396
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 397
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float p3, p3, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p3, v0

    float-to-int p3, p3

    .line 398
    iput p3, p0, Ll/ܺۧ֫;->ᩳ:I

    .line 399
    iput p3, p0, Ll/ܺۧ֫;->ۜ:I

    .line 401
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p3

    iput p3, p0, Ll/ܺۧ֫;->ܶ:I

    .line 402
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Ll/ܺۧ֫;->ۘ:F

    .line 403
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Ll/ܺۧ֫;->ᩴ:F

    .line 404
    new-instance p2, Landroid/widget/OverScroller;

    sget-object p3, Ll/ܺۧ֫;->᩶:Landroid/view/animation/Interpolator;

    invoke-direct {p2, p1, p3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p2, p0, Ll/ܺۧ֫;->֨:Landroid/widget/OverScroller;

    return-void

    .line 390
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 387
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parent view may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(III)I
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 671
    :cond_0
    iget-object v0, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 672
    div-int/lit8 v1, v0, 0x2

    .line 673
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    int-to-float v0, v0

    div-float/2addr v2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v1, v1

    const/high16 v3, 0x3f000000    # 0.5f

    sub-float/2addr v2, v3

    const v3, 0x3ef1463b

    mul-float v2, v2, v3

    float-to-double v2, v2

    .line 725
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v1

    add-float/2addr v2, v1

    .line 678
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_1

    int-to-float p1, p2

    div-float/2addr v2, p1

    .line 680
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float p1, p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    goto :goto_0

    .line 682
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    int-to-float p2, p3

    div-float/2addr p1, p2

    add-float/2addr p1, v0

    const/high16 p2, 0x43800000    # 256.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    :goto_0
    const/16 p2, 0x258

    .line 685
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public static ֫(Landroid/view/ViewGroup;FLl/ۡۧ֫;)Ll/ܺۧ֫;
    .locals 1

    .line 371
    invoke-static {p0, p2}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;Ll/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object p0

    .line 372
    iget p2, p0, Ll/ܺۧ֫;->ܶ:I

    int-to-float p2, p2

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p1

    mul-float v0, v0, p2

    float-to-int p1, v0

    iput p1, p0, Ll/ܺۧ֫;->ܶ:I

    return-object p0
.end method

.method public static ֫(Landroid/view/ViewGroup;Ll/ۡۧ֫;)Ll/ܺۧ֫;
    .locals 2

    .line 357
    new-instance v0, Ll/ܺۧ֫;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1}, Ll/ܺۧ֫;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Ll/ۡۧ֫;)V

    return-object v0
.end method

.method private ֫(FFI)V
    .locals 2

    const/4 v0, 0x1

    .line 1285
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܺۧ֫;->֫(FFII)Z

    move-result v0

    const/4 v1, 0x4

    .line 1288
    invoke-direct {p0, p2, p1, p3, v1}, Ll/ܺۧ֫;->֫(FFII)Z

    move-result v1

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x4

    :cond_0
    const/4 v1, 0x2

    .line 1291
    invoke-direct {p0, p1, p2, p3, v1}, Ll/ܺۧ֫;->֫(FFII)Z

    move-result v1

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    :cond_1
    const/16 v1, 0x8

    .line 1294
    invoke-direct {p0, p2, p1, p3, v1}, Ll/ܺۧ֫;->֫(FFII)Z

    move-result p1

    if-eqz p1, :cond_2

    or-int/lit8 v0, v0, 0x8

    :cond_2
    if-eqz v0, :cond_3

    .line 1299
    iget-object p1, p0, Ll/ܺۧ֫;->ܳ:[I

    aget p2, p1, p3

    or-int/2addr p2, v0

    aput p2, p1, p3

    .line 1300
    iget-object p1, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {p1, v0, p3}, Ll/ۡۧ֫;->onEdgeDragStarted(II)V

    :cond_3
    return-void
.end method

.method private ֫(FFII)Z
    .locals 3

    .line 1305
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 1306
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    .line 1308
    iget-object v0, p0, Ll/ܺۧ֫;->᩷:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    const/4 v1, 0x0

    if-ne v0, p4, :cond_2

    iget v0, p0, Ll/ܺۧ֫;->᩸:I

    and-int/2addr v0, p4

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܺۧ֫;->᩻:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_2

    iget-object v0, p0, Ll/ܺۧ֫;->ܳ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_2

    iget v0, p0, Ll/ܺۧ֫;->ܶ:I

    int-to-float v0, v0

    cmpg-float v2, p1, v0

    if-gtz v2, :cond_0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    mul-float p2, p2, v0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_1

    .line 1314
    iget-object p2, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {p2, p4}, Ll/ۡۧ֫;->onEdgeLock(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 1315
    iget-object p1, p0, Ll/ܺۧ֫;->᩻:[I

    aget p2, p1, p3

    or-int/2addr p2, p4

    aput p2, p1, p3

    return v1

    .line 1318
    :cond_1
    iget-object p2, p0, Ll/ܺۧ֫;->ܳ:[I

    aget p2, p2, p3

    and-int/2addr p2, p4

    if-nez p2, :cond_2

    iget p2, p0, Ll/ܺۧ֫;->ܶ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method private ֫(FFLandroid/view/View;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 1335
    :cond_0
    iget-object v1, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v1, p3}, Ll/ۡۧ֫;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 1336
    :goto_0
    invoke-virtual {v1, p3}, Ll/ۡۧ֫;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result p3

    if-lez p3, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    if-eqz v2, :cond_4

    if-eqz p3, :cond_4

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p2, p1

    .line 1339
    iget p1, p0, Ll/ܺۧ֫;->ܶ:I

    mul-int p1, p1, p1

    int-to-float p1, p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    return v3

    :cond_3
    return v0

    :cond_4
    if-eqz v2, :cond_6

    .line 1341
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Ll/ܺۧ֫;->ܶ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_5

    return v3

    :cond_5
    return v0

    :cond_6
    if-eqz p3, :cond_7

    .line 1343
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Ll/ܺۧ֫;->ܶ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_7

    return v3

    :cond_7
    return v0
.end method

.method private ֫(IIII)Z
    .locals 10

    .line 626
    iget-object v0, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 627
    iget-object v0, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v4, p1, v2

    sub-int v5, p2, v3

    const/4 p1, 0x0

    .line 631
    iget-object v1, p0, Ll/ܺۧ֫;->֨:Landroid/widget/OverScroller;

    if-nez v4, :cond_0

    if-nez v5, :cond_0

    .line 633
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 634
    invoke-virtual {p0, p1}, Ll/ܺۧ֫;->֫(I)V

    return p1

    .line 638
    :cond_0
    iget-object p1, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    .line 646
    iget p2, p0, Ll/ܺۧ֫;->ᩴ:F

    float-to-int p2, p2

    iget v0, p0, Ll/ܺۧ֫;->ۘ:F

    float-to-int v0, v0

    .line 699
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-ge v6, p2, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    if-le v6, v0, :cond_3

    if-lez p3, :cond_2

    move p3, v0

    goto :goto_0

    :cond_2
    neg-int p3, v0

    .line 647
    :cond_3
    :goto_0
    iget p2, p0, Ll/ܺۧ֫;->ᩴ:F

    float-to-int p2, p2

    .line 699
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-ge v6, p2, :cond_4

    const/4 p4, 0x0

    goto :goto_1

    :cond_4
    if-le v6, v0, :cond_6

    if-lez p4, :cond_5

    move p4, v0

    goto :goto_1

    :cond_5
    neg-int p4, v0

    .line 648
    :cond_6
    :goto_1
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result p2

    .line 649
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 650
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 651
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result v7

    add-int v8, v6, v7

    add-int v9, p2, v0

    if-eqz p3, :cond_7

    int-to-float p2, v6

    int-to-float v6, v8

    goto :goto_2

    :cond_7
    int-to-float p2, p2

    int-to-float v6, v9

    :goto_2
    div-float/2addr p2, v6

    if-eqz p4, :cond_8

    int-to-float v0, v7

    int-to-float v6, v8

    goto :goto_3

    :cond_8
    int-to-float v0, v0

    int-to-float v6, v9

    :goto_3
    div-float/2addr v0, v6

    .line 660
    iget-object v6, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v6, p1}, Ll/ۡۧ֫;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v7

    invoke-direct {p0, v4, p3, v7}, Ll/ܺۧ֫;->֫(III)I

    move-result p3

    .line 661
    invoke-virtual {v6, p1}, Ll/ۡۧ֫;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result p1

    invoke-direct {p0, v5, p4, p1}, Ll/ܺۧ֫;->֫(III)I

    move-result p1

    int-to-float p3, p3

    mul-float p3, p3, p2

    int-to-float p1, p1

    mul-float p1, p1, v0

    add-float/2addr p1, p3

    float-to-int v6, p1

    .line 639
    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    const/4 p1, 0x2

    .line 641
    invoke-virtual {p0, p1}, Ll/ܺۧ֫;->֫(I)V

    const/4 p1, 0x1

    return p1
.end method

.method private ۢ()V
    .locals 6

    .line 1442
    iget-object v0, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    iget v2, p0, Ll/ܺۧ֫;->ۘ:F

    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1443
    iget-object v0, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    iget v1, p0, Ll/ܺۧ֫;->֫:I

    .line 1444
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    iget v1, p0, Ll/ܺۧ֫;->ᩴ:F

    .line 716
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v1, v3, v1

    if-gez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    cmpl-float v1, v3, v2

    if-lez v1, :cond_2

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    neg-float v0, v2

    .line 1446
    :cond_2
    :goto_0
    iget-object v1, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    iget v3, p0, Ll/ܺۧ֫;->֫:I

    .line 1447
    invoke-virtual {v1, v3}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    iget v3, p0, Ll/ܺۧ֫;->ᩴ:F

    .line 716
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v3, v5, v3

    if-gez v3, :cond_3

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    cmpl-float v3, v5, v2

    if-lez v3, :cond_5

    cmpl-float v1, v1, v4

    if-lez v1, :cond_4

    goto :goto_1

    :cond_4
    neg-float v2, v2

    goto :goto_1

    :cond_5
    move v2, v1

    :goto_1
    const/4 v1, 0x1

    .line 808
    iput-boolean v1, p0, Ll/ܺۧ֫;->ۚ:Z

    .line 809
    iget-object v3, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v3, v4, v0, v2}, Ll/ۡۧ֫;->onViewReleased(Landroid/view/View;FF)V

    const/4 v0, 0x0

    .line 810
    iput-boolean v0, p0, Ll/ܺۧ֫;->ۚ:Z

    .line 812
    iget v2, p0, Ll/ܺۧ֫;->ܿ:I

    if-ne v2, v1, :cond_6

    .line 814
    invoke-virtual {p0, v0}, Ll/ܺۧ֫;->֫(I)V

    :cond_6
    return-void
.end method

.method private ۧ(FFI)V
    .locals 10

    .line 847
    iget-object v0, p0, Ll/ܺۧ֫;->ۢ:[F

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    if-gt v2, p3, :cond_2

    :cond_0
    add-int/lit8 v2, p3, 0x1

    .line 848
    new-array v3, v2, [F

    .line 849
    new-array v4, v2, [F

    .line 850
    new-array v5, v2, [F

    .line 851
    new-array v6, v2, [F

    .line 852
    new-array v7, v2, [I

    .line 853
    new-array v8, v2, [I

    .line 854
    new-array v2, v2, [I

    if-eqz v0, :cond_1

    .line 857
    array-length v9, v0

    invoke-static {v0, v1, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 858
    iget-object v0, p0, Ll/ܺۧ֫;->ۡ:[F

    array-length v9, v0

    invoke-static {v0, v1, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 859
    iget-object v0, p0, Ll/ܺۧ֫;->ܺ:[F

    array-length v9, v0

    invoke-static {v0, v1, v5, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 860
    iget-object v0, p0, Ll/ܺۧ֫;->ۖ:[F

    array-length v9, v0

    invoke-static {v0, v1, v6, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 861
    iget-object v0, p0, Ll/ܺۧ֫;->᩷:[I

    array-length v9, v0

    invoke-static {v0, v1, v7, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 862
    iget-object v0, p0, Ll/ܺۧ֫;->ܳ:[I

    array-length v9, v0

    invoke-static {v0, v1, v8, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 863
    iget-object v0, p0, Ll/ܺۧ֫;->᩻:[I

    array-length v9, v0

    invoke-static {v0, v1, v2, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 866
    :cond_1
    iput-object v3, p0, Ll/ܺۧ֫;->ۢ:[F

    .line 867
    iput-object v4, p0, Ll/ܺۧ֫;->ۡ:[F

    .line 868
    iput-object v5, p0, Ll/ܺۧ֫;->ܺ:[F

    .line 869
    iput-object v6, p0, Ll/ܺۧ֫;->ۖ:[F

    .line 870
    iput-object v7, p0, Ll/ܺۧ֫;->᩷:[I

    .line 871
    iput-object v8, p0, Ll/ܺۧ֫;->ܳ:[I

    .line 872
    iput-object v2, p0, Ll/ܺۧ֫;->᩻:[I

    .line 878
    :cond_2
    iget-object v0, p0, Ll/ܺۧ֫;->ۢ:[F

    iget-object v2, p0, Ll/ܺۧ֫;->ܺ:[F

    aput p1, v2, p3

    aput p1, v0, p3

    .line 879
    iget-object v0, p0, Ll/ܺۧ֫;->ۡ:[F

    iget-object v2, p0, Ll/ܺۧ֫;->ۖ:[F

    aput p2, v2, p3

    aput p2, v0, p3

    .line 880
    iget-object v0, p0, Ll/ܺۧ֫;->᩷:[I

    float-to-int p1, p1

    float-to-int p2, p2

    .line 1530
    iget-object v2, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    iget v4, p0, Ll/ܺۧ֫;->ۜ:I

    add-int/2addr v3, v4

    const/4 v4, 0x1

    if-ge p1, v3, :cond_3

    const/4 v1, 0x1

    .line 1531
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    iget v5, p0, Ll/ܺۧ֫;->ۜ:I

    add-int/2addr v3, v5

    if-ge p2, v3, :cond_4

    or-int/lit8 v1, v1, 0x4

    .line 1532
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    iget v5, p0, Ll/ܺۧ֫;->ۜ:I

    sub-int/2addr v3, v5

    if-le p1, v3, :cond_5

    or-int/lit8 v1, v1, 0x2

    .line 1533
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v2, p0, Ll/ܺۧ֫;->ۜ:I

    sub-int/2addr p1, v2

    if-le p2, p1, :cond_6

    or-int/lit8 v1, v1, 0x8

    .line 880
    :cond_6
    aput v1, v0, p3

    .line 881
    iget p1, p0, Ll/ܺۧ֫;->֡:I

    shl-int p2, v4, p3

    or-int/2addr p1, p2

    iput p1, p0, Ll/ܺۧ֫;->֡:I

    return-void
.end method

.method public static ۧ(Landroid/view/View;II)Z
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 1500
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 1501
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 1502
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p1

    if-lt p2, p1, :cond_1

    .line 1503
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    if-ge p2, p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private ܽ(Landroid/view/MotionEvent;)V
    .locals 6

    .line 885
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 887
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 913
    iget v3, p0, Ll/ܺۧ֫;->֡:I

    const/4 v4, 0x1

    shl-int/2addr v4, v2

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    .line 892
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 893
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    .line 894
    iget-object v5, p0, Ll/ܺۧ֫;->ܺ:[F

    aput v3, v5, v2

    .line 895
    iget-object v3, p0, Ll/ܺۧ֫;->ۖ:[F

    aput v4, v3, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩳ(I)V
    .locals 4

    .line 833
    iget-object v0, p0, Ll/ܺۧ֫;->ۢ:[F

    if-eqz v0, :cond_0

    .line 913
    iget v1, p0, Ll/ܺۧ֫;->֡:I

    const/4 v2, 0x1

    shl-int/2addr v2, p1

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 836
    aput v3, v0, p1

    .line 837
    iget-object v0, p0, Ll/ܺۧ֫;->ۡ:[F

    aput v3, v0, p1

    .line 838
    iget-object v0, p0, Ll/ܺۧ֫;->ܺ:[F

    aput v3, v0, p1

    .line 839
    iget-object v0, p0, Ll/ܺۧ֫;->ۖ:[F

    aput v3, v0, p1

    .line 840
    iget-object v0, p0, Ll/ܺۧ֫;->᩷:[I

    const/4 v3, 0x0

    aput v3, v0, p1

    .line 841
    iget-object v0, p0, Ll/ܺۧ֫;->ܳ:[I

    aput v3, v0, p1

    .line 842
    iget-object v0, p0, Ll/ܺۧ֫;->᩻:[I

    aput v3, v0, p1

    not-int p1, v2

    and-int/2addr p1, v1

    .line 843
    iput p1, p0, Ll/ܺۧ֫;->֡:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(II)Landroid/view/View;
    .locals 4

    .line 1516
    iget-object v0, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 1518
    iget-object v2, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v2, v1}, Ll/ۡۧ֫;->getOrderedChildIndex(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1519
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    if-lt p1, v3, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    if-ge p1, v3, :cond_0

    .line 1520
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    if-lt p2, v3, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v3

    if-ge p2, v3, :cond_0

    return-object v2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()V
    .locals 9

    .line 554
    invoke-virtual {p0}, Ll/ܺۧ֫;->ۧ()V

    .line 555
    iget v0, p0, Ll/ܺۧ֫;->ܿ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 556
    iget-object v0, p0, Ll/ܺۧ֫;->֨:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    .line 557
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    .line 558
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 559
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v5

    .line 560
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    .line 561
    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    sub-int v7, v5, v1

    sub-int v8, v6, v2

    iget-object v3, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual/range {v3 .. v8}, Ll/ۡۧ֫;->onViewPositionChanged(Landroid/view/View;IIII)V

    :cond_0
    const/4 v0, 0x0

    .line 563
    invoke-virtual {p0, v0}, Ll/ܺۧ֫;->֫(I)V

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 414
    iput p1, p0, Ll/ܺۧ֫;->ᩴ:F

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 917
    iget-object v0, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    iget-object v1, p0, Ll/ܺۧ֫;->۠:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 918
    iget v0, p0, Ll/ܺۧ֫;->ܿ:I

    if-eq v0, p1, :cond_0

    .line 919
    iput p1, p0, Ll/ܺۧ֫;->ܿ:I

    .line 920
    iget-object v0, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v0, p1}, Ll/ۡۧ֫;->onViewDragStateChanged(I)V

    .line 921
    iget p1, p0, Ll/ܺۧ֫;->ܿ:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 922
    iput-object p1, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public final ֫(ILandroid/view/View;)V
    .locals 2

    .line 500
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    if-ne v0, v1, :cond_0

    .line 505
    iput-object p2, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    .line 506
    iput p1, p0, Ll/ܺۧ֫;->֫:I

    .line 507
    iget-object v0, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v0, p2, p1}, Ll/ۡۧ֫;->onViewCaptured(Landroid/view/View;I)V

    const/4 p1, 0x1

    .line 508
    invoke-virtual {p0, p1}, Ll/ܺۧ֫;->֫(I)V

    return-void

    .line 501
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1126
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 1127
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    if-nez v2, :cond_0

    .line 1132
    invoke-virtual/range {p0 .. p0}, Ll/ܺۧ֫;->ۧ()V

    .line 1135
    :cond_0
    iget-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    if-nez v4, :cond_1

    .line 1136
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    .line 1138
    :cond_1
    iget-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1140
    iget-object v4, v0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    const/4 v5, 0x0

    if-eqz v2, :cond_1a

    const/4 v6, 0x1

    if-eq v2, v6, :cond_18

    const/4 v7, 0x2

    if-eq v2, v7, :cond_b

    const/4 v7, 0x3

    if-eq v2, v7, :cond_9

    const/4 v7, 0x5

    if-eq v2, v7, :cond_7

    const/4 v4, 0x6

    if-eq v2, v4, :cond_2

    goto/16 :goto_7

    .line 1235
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 1236
    iget v3, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v3, v6, :cond_6

    iget v3, v0, Ll/ܺۧ֫;->֫:I

    if-ne v2, v3, :cond_6

    .line 1239
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    :goto_0
    const/4 v4, -0x1

    if-ge v5, v3, :cond_5

    .line 1241
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    .line 1242
    iget v7, v0, Ll/ܺۧ֫;->֫:I

    if-ne v6, v7, :cond_3

    goto :goto_1

    .line 1247
    :cond_3
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    .line 1248
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    float-to-int v7, v7

    float-to-int v8, v8

    .line 1249
    invoke-virtual {v0, v7, v8}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v7

    iget-object v8, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    if-ne v7, v8, :cond_4

    .line 1250
    invoke-virtual {v0, v6, v8}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1251
    iget v1, v0, Ll/ܺۧ֫;->֫:I

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    const/4 v1, -0x1

    :goto_2
    if-ne v1, v4, :cond_6

    .line 1258
    invoke-direct/range {p0 .. p0}, Ll/ܺۧ֫;->ۢ()V

    .line 1261
    :cond_6
    invoke-direct {v0, v2}, Ll/ܺۧ֫;->ᩳ(I)V

    return-void

    .line 1162
    :cond_7
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 1163
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    .line 1164
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    .line 1166
    invoke-direct {v0, v5, v1, v2}, Ll/ܺۧ֫;->ۧ(FFI)V

    .line 1169
    iget v3, v0, Ll/ܺۧ֫;->ܿ:I

    if-nez v3, :cond_8

    float-to-int v3, v5

    float-to-int v1, v1

    .line 1172
    invoke-virtual {v0, v3, v1}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v1

    .line 1173
    invoke-virtual {v0, v2, v1}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    .line 1175
    iget-object v1, v0, Ll/ܺۧ֫;->᩷:[I

    aget v1, v1, v2

    .line 1176
    iget v3, v0, Ll/ܺۧ֫;->᩸:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_1b

    .line 1177
    invoke-virtual {v4, v1, v2}, Ll/ۡۧ֫;->onEdgeTouched(II)V

    return-void

    :cond_8
    float-to-int v3, v5

    float-to-int v1, v1

    .line 1484
    iget-object v4, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-static {v4, v3, v1}, Ll/ܺۧ֫;->ۧ(Landroid/view/View;II)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 1184
    iget-object v1, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v0, v2, v1}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    return-void

    .line 1274
    :cond_9
    iget v1, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v1, v6, :cond_a

    .line 808
    iput-boolean v6, v0, Ll/ܺۧ֫;->ۚ:Z

    .line 809
    iget-object v1, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v2, v2}, Ll/ۡۧ֫;->onViewReleased(Landroid/view/View;FF)V

    .line 810
    iput-boolean v5, v0, Ll/ܺۧ֫;->ۚ:Z

    .line 812
    iget v1, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v1, v6, :cond_a

    .line 814
    invoke-virtual {v0, v5}, Ll/ܺۧ֫;->֫(I)V

    .line 1277
    :cond_a
    invoke-virtual/range {p0 .. p0}, Ll/ܺۧ֫;->ۧ()V

    return-void

    .line 1190
    :cond_b
    iget v2, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v2, v6, :cond_12

    .line 1192
    iget v2, v0, Ll/ܺۧ֫;->֫:I

    .line 913
    iget v3, v0, Ll/ܺۧ֫;->֡:I

    shl-int/2addr v6, v2

    and-int/2addr v3, v6

    if-eqz v3, :cond_c

    const/4 v5, 0x1

    :cond_c
    if-nez v5, :cond_d

    goto/16 :goto_7

    .line 1194
    :cond_d
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    .line 1195
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 1196
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    .line 1197
    iget-object v5, v0, Ll/ܺۧ֫;->ܺ:[F

    iget v6, v0, Ll/ܺۧ֫;->֫:I

    aget v5, v5, v6

    sub-float/2addr v3, v5

    float-to-int v3, v3

    .line 1198
    iget-object v5, v0, Ll/ܺۧ֫;->ۖ:[F

    aget v5, v5, v6

    sub-float/2addr v2, v5

    float-to-int v2, v2

    .line 1200
    iget-object v5, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v5

    add-int/2addr v5, v3

    iget-object v6, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v6

    add-int/2addr v6, v2

    .line 1455
    iget-object v7, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v7

    .line 1456
    iget-object v8, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    move-result v8

    if-eqz v3, :cond_e

    .line 1458
    iget-object v9, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v4, v9, v5, v3}, Ll/ۡۧ֫;->clampViewPositionHorizontal(Landroid/view/View;II)I

    move-result v5

    .line 1459
    iget-object v9, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    sub-int v10, v5, v7

    invoke-static {v10, v9}, Ll/ܿ᩺;->ۧ(ILandroid/view/View;)V

    :cond_e
    move v13, v5

    if-eqz v2, :cond_f

    .line 1462
    iget-object v5, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v4, v5, v6, v2}, Ll/ۡۧ֫;->clampViewPositionVertical(Landroid/view/View;II)I

    move-result v6

    .line 1463
    iget-object v4, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    sub-int v5, v6, v8

    invoke-static {v5, v4}, Ll/ܿ᩺;->ܽ(ILandroid/view/View;)V

    :cond_f
    move v14, v6

    if-nez v3, :cond_10

    if-eqz v2, :cond_11

    :cond_10
    sub-int v15, v13, v7

    sub-int v16, v14, v8

    .line 1469
    iget-object v11, v0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    iget-object v12, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual/range {v11 .. v16}, Ll/ۡۧ֫;->onViewPositionChanged(Landroid/view/View;IIII)V

    .line 1202
    :cond_11
    invoke-direct/range {p0 .. p1}, Ll/ܺۧ֫;->ܽ(Landroid/view/MotionEvent;)V

    return-void

    .line 1205
    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_17

    .line 1207
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    .line 913
    iget v5, v0, Ll/ܺۧ֫;->֡:I

    shl-int v7, v6, v4

    and-int/2addr v5, v7

    if-eqz v5, :cond_13

    const/4 v5, 0x1

    goto :goto_4

    :cond_13
    const/4 v5, 0x0

    :goto_4
    if-nez v5, :cond_14

    goto :goto_5

    .line 1212
    :cond_14
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    .line 1213
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    .line 1214
    iget-object v8, v0, Ll/ܺۧ֫;->ۢ:[F

    aget v8, v8, v4

    sub-float v8, v5, v8

    .line 1215
    iget-object v9, v0, Ll/ܺۧ֫;->ۡ:[F

    aget v9, v9, v4

    sub-float v9, v7, v9

    .line 1217
    invoke-direct {v0, v8, v9, v4}, Ll/ܺۧ֫;->֫(FFI)V

    .line 1218
    iget v10, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v10, v6, :cond_15

    goto :goto_6

    :cond_15
    float-to-int v5, v5

    float-to-int v7, v7

    .line 1223
    invoke-virtual {v0, v5, v7}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v5

    .line 1224
    invoke-direct {v0, v8, v9, v5}, Ll/ܺۧ֫;->֫(FFLandroid/view/View;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 1225
    invoke-virtual {v0, v4, v5}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_16

    goto :goto_6

    :cond_16
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 1229
    :cond_17
    :goto_6
    invoke-direct/range {p0 .. p1}, Ll/ܺۧ֫;->ܽ(Landroid/view/MotionEvent;)V

    return-void

    .line 1266
    :cond_18
    iget v1, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v1, v6, :cond_19

    .line 1267
    invoke-direct/range {p0 .. p0}, Ll/ܺۧ֫;->ۢ()V

    .line 1269
    :cond_19
    invoke-virtual/range {p0 .. p0}, Ll/ܺۧ֫;->ۧ()V

    return-void

    .line 1142
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 1143
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1144
    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    float-to-int v5, v2

    float-to-int v6, v3

    .line 1145
    invoke-virtual {v0, v5, v6}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v5

    .line 1147
    invoke-direct {v0, v2, v3, v1}, Ll/ܺۧ֫;->ۧ(FFI)V

    .line 1152
    invoke-virtual {v0, v1, v5}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    .line 1154
    iget-object v2, v0, Ll/ܺۧ֫;->᩷:[I

    aget v2, v2, v1

    .line 1155
    iget v3, v0, Ll/ܺۧ֫;->᩸:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_1b

    .line 1156
    invoke-virtual {v4, v2, v1}, Ll/ۡۧ֫;->onEdgeTouched(II)V

    :cond_1b
    :goto_7
    return-void
.end method

.method public final ֫(Landroid/view/View;II)Z
    .locals 0

    .line 581
    iput-object p1, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    const/4 p1, -0x1

    .line 582
    iput p1, p0, Ll/ܺۧ֫;->֫:I

    const/4 p1, 0x0

    .line 584
    invoke-direct {p0, p2, p3, p1, p1}, Ll/ܺۧ֫;->֫(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    .line 585
    iget p2, p0, Ll/ܺۧ֫;->ܿ:I

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 588
    iput-object p2, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    :cond_0
    return p1
.end method

.method public final ۜ()I
    .locals 1

    .line 532
    iget v0, p0, Ll/ܺۧ֫;->ܶ:I

    return v0
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, -0x1

    .line 540
    iput v0, p0, Ll/ܺۧ֫;->֫:I

    .line 819
    iget-object v0, p0, Ll/ܺۧ֫;->ۢ:[F

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 822
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 823
    iget-object v0, p0, Ll/ܺۧ֫;->ۡ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 824
    iget-object v0, p0, Ll/ܺۧ֫;->ܺ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 825
    iget-object v0, p0, Ll/ܺۧ֫;->ۖ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 826
    iget-object v0, p0, Ll/ܺۧ֫;->᩷:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 827
    iget-object v0, p0, Ll/ܺۧ֫;->ܳ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 828
    iget-object v0, p0, Ll/ܺۧ֫;->᩻:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 829
    iput v1, p0, Ll/ܺۧ֫;->֡:I

    .line 543
    :goto_0
    iget-object v0, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_1

    .line 544
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 545
    iput-object v0, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    :cond_1
    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 475
    iput p1, p0, Ll/ܺۧ֫;->ۜ:I

    return-void
.end method

.method public final ۧ(II)Z
    .locals 3

    .line 606
    iget-boolean v0, p0, Ll/ܺۧ֫;->ۚ:Z

    if-eqz v0, :cond_0

    .line 611
    iget-object v0, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    iget v1, p0, Ll/ܺۧ֫;->֫:I

    .line 612
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    iget v2, p0, Ll/ܺۧ֫;->֫:I

    .line 613
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    .line 611
    invoke-direct {p0, p1, p2, v0, v1}, Ll/ܺۧ֫;->֫(IIII)Z

    move-result p1

    return p1

    .line 607
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(ILandroid/view/View;)Z
    .locals 2

    .line 937
    iget-object v0, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    iget v0, p0, Ll/ܺۧ֫;->֫:I

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    if-eqz p2, :cond_1

    .line 941
    iget-object v0, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    invoke-virtual {v0, p2, p1}, Ll/ۡۧ֫;->tryCaptureView(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 942
    iput p1, p0, Ll/ܺۧ֫;->֫:I

    .line 943
    invoke-virtual {p0, p1, p2}, Ll/ܺۧ֫;->֫(ILandroid/view/View;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 992
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 993
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    if-nez v2, :cond_0

    .line 998
    invoke-virtual/range {p0 .. p0}, Ll/ܺۧ֫;->ۧ()V

    .line 1001
    :cond_0
    iget-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    if-nez v4, :cond_1

    .line 1002
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    .line 1004
    :cond_1
    iget-object v4, v0, Ll/ܺۧ֫;->᩹:Landroid/view/VelocityTracker;

    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v4, 0x2

    .line 1006
    iget-object v5, v0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    const/4 v6, 0x1

    if-eqz v2, :cond_e

    if-eq v2, v6, :cond_d

    if-eq v2, v4, :cond_5

    const/4 v7, 0x3

    if-eq v2, v7, :cond_d

    const/4 v7, 0x5

    if-eq v2, v7, :cond_3

    const/4 v4, 0x6

    if-eq v2, v4, :cond_2

    goto/16 :goto_3

    .line 1104
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1105
    invoke-direct {v0, v1}, Ll/ܺۧ֫;->ᩳ(I)V

    goto/16 :goto_3

    .line 1028
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 1029
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    .line 1030
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    .line 1032
    invoke-direct {v0, v7, v1, v2}, Ll/ܺۧ֫;->ۧ(FFI)V

    .line 1035
    iget v3, v0, Ll/ܺۧ֫;->ܿ:I

    if-nez v3, :cond_4

    .line 1036
    iget-object v1, v0, Ll/ܺۧ֫;->᩷:[I

    aget v1, v1, v2

    .line 1037
    iget v3, v0, Ll/ܺۧ֫;->᩸:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_10

    .line 1038
    invoke-virtual {v5, v1, v2}, Ll/ۡۧ֫;->onEdgeTouched(II)V

    goto/16 :goto_3

    :cond_4
    if-ne v3, v4, :cond_10

    float-to-int v3, v7

    float-to-int v1, v1

    .line 1042
    invoke-virtual {v0, v3, v1}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v1

    .line 1043
    iget-object v3, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    if-ne v1, v3, :cond_10

    .line 1044
    invoke-virtual {v0, v2, v1}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    goto/16 :goto_3

    .line 1051
    :cond_5
    iget-object v2, v0, Ll/ܺۧ֫;->ۢ:[F

    if-eqz v2, :cond_10

    iget-object v2, v0, Ll/ܺۧ֫;->ۡ:[F

    if-nez v2, :cond_6

    goto/16 :goto_3

    .line 1054
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_c

    .line 1056
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    .line 913
    iget v7, v0, Ll/ܺۧ֫;->֡:I

    shl-int v8, v6, v4

    and-int/2addr v7, v8

    if-eqz v7, :cond_b

    .line 1061
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    .line 1062
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    .line 1063
    iget-object v9, v0, Ll/ܺۧ֫;->ۢ:[F

    aget v9, v9, v4

    sub-float v9, v7, v9

    .line 1064
    iget-object v10, v0, Ll/ܺۧ֫;->ۡ:[F

    aget v10, v10, v4

    sub-float v10, v8, v10

    float-to-int v7, v7

    float-to-int v8, v8

    .line 1066
    invoke-virtual {v0, v7, v8}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 1067
    invoke-direct {v0, v9, v10, v7}, Ll/ܺۧ֫;->֫(FFLandroid/view/View;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v8, 0x1

    goto :goto_1

    :cond_7
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_9

    .line 1074
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v11

    float-to-int v12, v9

    add-int v13, v11, v12

    .line 1076
    invoke-virtual {v5, v7, v13, v12}, Ll/ۡۧ֫;->clampViewPositionHorizontal(Landroid/view/View;II)I

    move-result v12

    .line 1078
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v13

    float-to-int v14, v10

    add-int v15, v13, v14

    .line 1080
    invoke-virtual {v5, v7, v15, v14}, Ll/ۡۧ֫;->clampViewPositionVertical(Landroid/view/View;II)I

    move-result v14

    .line 1082
    invoke-virtual {v5, v7}, Ll/ۡۧ֫;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v15

    .line 1083
    invoke-virtual {v5, v7}, Ll/ۡۧ֫;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result v16

    if-eqz v15, :cond_8

    if-lez v15, :cond_9

    if-ne v12, v11, :cond_9

    :cond_8
    if-eqz v16, :cond_c

    if-lez v16, :cond_9

    if-ne v14, v13, :cond_9

    goto :goto_2

    .line 1089
    :cond_9
    invoke-direct {v0, v9, v10, v4}, Ll/ܺۧ֫;->֫(FFI)V

    .line 1090
    iget v9, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v9, v6, :cond_a

    goto :goto_2

    :cond_a
    if-eqz v8, :cond_b

    .line 1095
    invoke-virtual {v0, v4, v7}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_2

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1099
    :cond_c
    :goto_2
    invoke-direct/range {p0 .. p1}, Ll/ܺۧ֫;->ܽ(Landroid/view/MotionEvent;)V

    goto :goto_3

    .line 1111
    :cond_d
    invoke-virtual/range {p0 .. p0}, Ll/ܺۧ֫;->ۧ()V

    goto :goto_3

    .line 1008
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 1009
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v7, 0x0

    .line 1010
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1011
    invoke-direct {v0, v2, v3, v1}, Ll/ܺۧ֫;->ۧ(FFI)V

    float-to-int v2, v2

    float-to-int v3, v3

    .line 1013
    invoke-virtual {v0, v2, v3}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v2

    .line 1016
    iget-object v3, v0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    if-ne v2, v3, :cond_f

    iget v3, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v3, v4, :cond_f

    .line 1017
    invoke-virtual {v0, v1, v2}, Ll/ܺۧ֫;->ۧ(ILandroid/view/View;)Z

    .line 1020
    :cond_f
    iget-object v2, v0, Ll/ܺۧ֫;->᩷:[I

    aget v2, v2, v1

    .line 1021
    iget v3, v0, Ll/ܺۧ֫;->᩸:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_10

    .line 1022
    invoke-virtual {v5, v2, v1}, Ll/ۡۧ֫;->onEdgeTouched(II)V

    .line 1116
    :cond_10
    :goto_3
    iget v1, v0, Ll/ܺۧ֫;->ܿ:I

    if-ne v1, v6, :cond_11

    return v6

    :cond_11
    const/4 v1, 0x0

    return v1
.end method

.method public final ܳ()I
    .locals 1

    .line 488
    iget v0, p0, Ll/ܺۧ֫;->ᩳ:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 450
    iput p1, p0, Ll/ܺۧ֫;->᩸:I

    return-void
.end method

.method public final ܽ()Z
    .locals 7

    .line 1363
    iget-object v0, p0, Ll/ܺۧ֫;->ۢ:[F

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 913
    iget v3, p0, Ll/ܺۧ֫;->֡:I

    const/4 v4, 0x1

    shl-int v5, v4, v2

    and-int/2addr v3, v5

    if-eqz v3, :cond_0

    .line 1395
    iget-object v3, p0, Ll/ܺۧ֫;->ܺ:[F

    aget v3, v3, v2

    iget-object v5, p0, Ll/ܺۧ֫;->ۢ:[F

    aget v5, v5, v2

    sub-float/2addr v3, v5

    .line 1396
    iget-object v5, p0, Ll/ܺۧ֫;->ۖ:[F

    aget v5, v5, v2

    iget-object v6, p0, Ll/ܺۧ֫;->ۡ:[F

    aget v6, v6, v2

    sub-float/2addr v5, v6

    mul-float v3, v3, v3

    mul-float v5, v5, v5

    add-float/2addr v5, v3

    .line 1399
    iget v3, p0, Ll/ܺۧ֫;->ܶ:I

    mul-int v3, v3, v3

    int-to-float v3, v3

    cmpl-float v3, v5, v3

    if-lez v3, :cond_0

    return v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final ܿ()Landroid/view/View;
    .locals 1

    .line 516
    iget-object v0, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 12

    .line 764
    iget v0, p0, Ll/ܺۧ֫;->ܿ:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_5

    .line 765
    iget-object v0, p0, Ll/ܺۧ֫;->֨:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v3

    .line 766
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v10

    .line 767
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v11

    .line 768
    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int v8, v10, v4

    .line 769
    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int v9, v11, v4

    if-eqz v8, :cond_0

    .line 772
    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-static {v8, v4}, Ll/ܿ᩺;->ۧ(ILandroid/view/View;)V

    :cond_0
    if-eqz v9, :cond_1

    .line 775
    iget-object v4, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    invoke-static {v9, v4}, Ll/ܿ᩺;->ܽ(ILandroid/view/View;)V

    :cond_1
    if-nez v8, :cond_2

    if-eqz v9, :cond_3

    .line 779
    :cond_2
    iget-object v4, p0, Ll/ܺۧ֫;->ۧ:Ll/ۡۧ֫;

    iget-object v5, p0, Ll/ܺۧ֫;->ܽ:Landroid/view/View;

    move v6, v10

    move v7, v11

    invoke-virtual/range {v4 .. v9}, Ll/ۡۧ֫;->onViewPositionChanged(Landroid/view/View;IIII)V

    :cond_3
    if-eqz v3, :cond_4

    .line 782
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v4

    if-ne v10, v4, :cond_4

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v4

    if-ne v11, v4, :cond_4

    .line 785
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 v3, 0x0

    :cond_4
    if-nez v3, :cond_5

    .line 791
    iget-object v0, p0, Ll/ܺۧ֫;->᩵:Landroid/view/ViewGroup;

    iget-object v3, p0, Ll/ܺۧ֫;->۠:Ljava/lang/Runnable;

    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 798
    :cond_5
    iget v0, p0, Ll/ܺۧ֫;->ܿ:I

    if-ne v0, v2, :cond_6

    const/4 v0, 0x1

    return v0

    :cond_6
    return v1
.end method

.method public final ᩷()I
    .locals 1

    .line 434
    iget v0, p0, Ll/ܺۧ֫;->ܿ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 462
    iget v0, p0, Ll/ܺۧ֫;->ۜ:I

    return v0
.end method
