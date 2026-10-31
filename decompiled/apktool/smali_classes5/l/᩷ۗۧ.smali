.class public Ll/᩷ۗۧ;
.super Ll/ܶ۬ۧ;
.source "33LY"


# static fields
.field public static final DEBUG:Z = false

.field public static final MILLISECONDS_PER_INCH:F = 25.0f

.field public static final SNAP_TO_ANY:I = 0x0

.field public static final SNAP_TO_END:I = 0x1

.field public static final SNAP_TO_START:I = -0x1

.field public static final TARGET_SEEK_EXTRA_SCROLL_RATIO:F = 1.2f

.field public static final TARGET_SEEK_SCROLL_DISTANCE_PX:I = 0x2710


# instance fields
.field public final mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

.field public final mDisplayMetrics:Landroid/util/DisplayMetrics;

.field public mHasCalculatedMillisPerPixel:Z

.field public mInterimTargetDx:I

.field public mInterimTargetDy:I

.field public final mLinearInterpolator:Landroid/view/animation/LinearInterpolator;

.field public mMillisPerPixel:F

.field public mTargetVector:Landroid/graphics/PointF;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Ll/ܶ۬ۧ;-><init>()V

    .line 80
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Ll/᩷ۗۧ;->mLinearInterpolator:Landroid/view/animation/LinearInterpolator;

    .line 82
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Ll/᩷ۗۧ;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Ll/᩷ۗۧ;->mHasCalculatedMillisPerPixel:Z

    .line 93
    iput v0, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    iput v0, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۗۧ;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    return-void
.end method

.method private ֫()F
    .locals 1

    .line 176
    iget-boolean v0, p0, Ll/᩷ۗۧ;->mHasCalculatedMillisPerPixel:Z

    if-nez v0, :cond_0

    .line 177
    iget-object v0, p0, Ll/᩷ۗۧ;->mDisplayMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {p0, v0}, Ll/᩷ۗۧ;->calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Ll/᩷ۗۧ;->mMillisPerPixel:F

    const/4 v0, 0x1

    .line 178
    iput-boolean v0, p0, Ll/᩷ۗۧ;->mHasCalculatedMillisPerPixel:Z

    .line 180
    :cond_0
    iget v0, p0, Ll/᩷ۗۧ;->mMillisPerPixel:F

    return v0
.end method

.method private ֫(II)I
    .locals 0

    sub-int p2, p1, p2

    mul-int p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return p2
.end method


# virtual methods
.method public calculateDtToFit(IIIII)I
    .locals 1

    const/4 v0, -0x1

    if-eq p5, v0, :cond_4

    if-eqz p5, :cond_1

    const/4 p1, 0x1

    if-ne p5, p1, :cond_0

    sub-int/2addr p4, p2

    return p4

    .line 303
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sub-int/2addr p3, p1

    if-lez p3, :cond_2

    return p3

    :cond_2
    sub-int/2addr p4, p2

    if-gez p4, :cond_3

    return p4

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    sub-int/2addr p3, p1

    return p3
.end method

.method public calculateDxToMakeVisible(Landroid/view/View;I)I
    .locals 10

    .line 348
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 349
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 353
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܳ۬ۧ;

    .line 354
    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->getDecoratedLeft(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v5, v2, v3

    .line 355
    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->getDecoratedRight(Landroid/view/View;)I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int v6, p1, v1

    .line 356
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v7

    .line 357
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result p1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v0

    sub-int v8, p1, v0

    move-object v4, p0

    move v9, p2

    .line 358
    invoke-virtual/range {v4 .. v9}, Ll/᩷ۗۧ;->calculateDtToFit(IIIII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public calculateDyToMakeVisible(Landroid/view/View;I)I
    .locals 10

    .line 322
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 323
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 327
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܳ۬ۧ;

    .line 328
    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->getDecoratedTop(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int v5, v2, v3

    .line 329
    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->getDecoratedBottom(Landroid/view/View;)I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v6, p1, v1

    .line 330
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v7

    .line 331
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result p1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v0

    sub-int v8, p1, v0

    move-object v4, p0

    move v9, p2

    .line 332
    invoke-virtual/range {v4 .. v9}, Ll/᩷ۗۧ;->calculateDtToFit(IIIII)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 172
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x41c80000    # 25.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public calculateTimeForDeceleration(I)I
    .locals 4

    .line 197
    invoke-virtual {p0, p1}, Ll/᩷ۗۧ;->calculateTimeForScrolling(I)I

    move-result p1

    int-to-double v0, p1

    const-wide v2, 0x3fd57a786c22680aL    # 0.3356

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public calculateTimeForScrolling(I)I
    .locals 2

    .line 211
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    invoke-direct {p0}, Ll/᩷ۗۧ;->֫()F

    move-result v0

    mul-float p1, p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public getHorizontalSnapPreference()I
    .locals 3

    .line 224
    iget-object v0, p0, Ll/᩷ۗۧ;->mTargetVector:Landroid/graphics/PointF;

    if-eqz v0, :cond_2

    iget v0, v0, Landroid/graphics/PointF;->x:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public getVerticalSnapPreference()I
    .locals 3

    .line 238
    iget-object v0, p0, Ll/᩷ۗۧ;->mTargetVector:Landroid/graphics/PointF;

    if-eqz v0, :cond_2

    iget v0, v0, Landroid/graphics/PointF;->y:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onSeekTargetStep(IILl/᩸۬ۧ;Ll/֨۬ۧ;)V
    .locals 0

    .line 132
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    .line 133
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->stop()V

    return-void

    .line 142
    :cond_0
    iget p3, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    invoke-direct {p0, p3, p1}, Ll/᩷ۗۧ;->֫(II)I

    move-result p1

    iput p1, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    .line 143
    iget p1, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    invoke-direct {p0, p1, p2}, Ll/᩷ۗۧ;->֫(II)I

    move-result p1

    iput p1, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    .line 145
    iget p2, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    if-nez p2, :cond_1

    if-nez p1, :cond_1

    .line 146
    invoke-virtual {p0, p4}, Ll/᩷ۗۧ;->updateActionForInterimTarget(Ll/֨۬ۧ;)V

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x0

    .line 156
    iput v0, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    iput v0, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Ll/᩷ۗۧ;->mTargetVector:Landroid/graphics/PointF;

    return-void
.end method

.method public onTargetFound(Landroid/view/View;Ll/᩸۬ۧ;Ll/֨۬ۧ;)V
    .locals 2

    .line 114
    invoke-virtual {p0}, Ll/᩷ۗۧ;->getHorizontalSnapPreference()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/᩷ۗۧ;->calculateDxToMakeVisible(Landroid/view/View;I)I

    move-result p2

    .line 115
    invoke-virtual {p0}, Ll/᩷ۗۧ;->getVerticalSnapPreference()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ll/᩷ۗۧ;->calculateDyToMakeVisible(Landroid/view/View;I)I

    move-result p1

    mul-int v0, p2, p2

    mul-int v1, p1, p1

    add-int/2addr v1, v0

    int-to-double v0, v1

    .line 116
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 117
    invoke-virtual {p0, v0}, Ll/᩷ۗۧ;->calculateTimeForDeceleration(I)I

    move-result v0

    if-lez v0, :cond_0

    neg-int p2, p2

    neg-int p1, p1

    .line 119
    iget-object v1, p0, Ll/᩷ۗۧ;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p3, p2, p1, v1, v0}, Ll/֨۬ۧ;->֫(IILandroid/view/animation/Interpolator;I)V

    :cond_0
    return-void
.end method

.method public updateActionForInterimTarget(Ll/֨۬ۧ;)V
    .locals 4

    .line 251
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getTargetPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܶ۬ۧ;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 252
    iget v1, v0, Landroid/graphics/PointF;->x:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    .line 258
    :cond_0
    invoke-virtual {p0, v0}, Ll/ܶ۬ۧ;->normalize(Landroid/graphics/PointF;)V

    .line 259
    iput-object v0, p0, Ll/᩷ۗۧ;->mTargetVector:Landroid/graphics/PointF;

    .line 261
    iget v1, v0, Landroid/graphics/PointF;->x:F

    const v2, 0x461c4000    # 10000.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    .line 262
    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float v0, v0, v2

    float-to-int v0, v0

    iput v0, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    const/16 v0, 0x2710

    .line 263
    invoke-virtual {p0, v0}, Ll/᩷ۗۧ;->calculateTimeForScrolling(I)I

    move-result v0

    .line 267
    iget v1, p0, Ll/᩷ۗۧ;->mInterimTargetDx:I

    int-to-float v1, v1

    const v2, 0x3f99999a    # 1.2f

    mul-float v1, v1, v2

    float-to-int v1, v1

    iget v3, p0, Ll/᩷ۗۧ;->mInterimTargetDy:I

    int-to-float v3, v3

    mul-float v3, v3, v2

    float-to-int v3, v3

    int-to-float v0, v0

    mul-float v0, v0, v2

    float-to-int v0, v0

    iget-object v2, p0, Ll/᩷ۗۧ;->mLinearInterpolator:Landroid/view/animation/LinearInterpolator;

    invoke-virtual {p1, v1, v3, v2, v0}, Ll/֨۬ۧ;->֫(IILandroid/view/animation/Interpolator;I)V

    return-void

    .line 253
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->getTargetPosition()I

    move-result v0

    .line 254
    invoke-virtual {p1, v0}, Ll/֨۬ۧ;->֫(I)V

    .line 255
    invoke-virtual {p0}, Ll/ܶ۬ۧ;->stop()V

    return-void
.end method
