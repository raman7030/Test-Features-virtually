.class public final Ll/᩵ۤۧ;
.super Landroid/graphics/drawable/Drawable;
.source "D5XC"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final ۛ:Ll/ۡۢ֫;

.field public static final ۤ:Landroid/view/animation/LinearInterpolator;

.field public static final ۫:[I


# instance fields
.field public ۗ:F

.field public final ۙ:Ll/ᩴۤۧ;

.field public ۬:F

.field public ᩶:Landroid/content/res/Resources;

.field public ᩸:Landroid/animation/ValueAnimator;

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 68
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Ll/᩵ۤۧ;->ۤ:Landroid/view/animation/LinearInterpolator;

    .line 69
    new-instance v0, Ll/ۡۢ֫;

    invoke-direct {v0}, Ll/ۡۢ֫;-><init>()V

    sput-object v0, Ll/᩵ۤۧ;->ۛ:Ll/ۡۢ֫;

    const/high16 v0, -0x1000000

    .line 97
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/᩵ۤۧ;->۫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 138
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۤۧ;->᩶:Landroid/content/res/Resources;

    .line 141
    new-instance p1, Ll/ᩴۤۧ;

    invoke-direct {p1}, Ll/ᩴۤۧ;-><init>()V

    iput-object p1, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    .line 142
    sget-object v0, Ll/᩵ۤۧ;->۫:[I

    .line 762
    iput-object v0, p1, Ll/ᩴۤۧ;->᩷:[I

    const/4 v0, 0x0

    .line 764
    invoke-virtual {p1, v0}, Ll/ᩴۤۧ;->֫(I)V

    const/high16 v0, 0x40200000    # 2.5f

    .line 843
    iput v0, p1, Ll/ᩴۤۧ;->۠:F

    .line 844
    iget-object v1, p1, Ll/ᩴۤۧ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 193
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 568
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 569
    new-instance v1, Ll/ۖۤۧ;

    invoke-direct {v1, p0, p1}, Ll/ۖۤۧ;-><init>(Ll/᩵ۤۧ;Ll/ᩴۤۧ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v1, -0x1

    .line 578
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 v1, 0x1

    .line 579
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 580
    sget-object v1, Ll/᩵ۤۧ;->ۤ:Landroid/view/animation/LinearInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 581
    new-instance v1, Ll/ۘۤۧ;

    invoke-direct {v1, p0, p1}, Ll/ۘۤۧ;-><init>(Ll/᩵ۤۧ;Ll/ᩴۤۧ;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 616
    iput-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static ֫(FLl/ᩴۤۧ;)V
    .locals 8

    const/high16 v0, 0x3f400000    # 0.75f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_0

    sub-float/2addr p0, v0

    const/high16 v0, 0x3e800000    # 0.25f

    div-float/2addr p0, v0

    .line 868
    iget-object v0, p1, Ll/ᩴۤۧ;->᩷:[I

    iget v1, p1, Ll/ᩴۤۧ;->ۜ:I

    aget v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 810
    array-length v3, v0

    rem-int/2addr v1, v3

    .line 806
    aget v0, v0, v1

    shr-int/lit8 v1, v2, 0x18

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v3, v2, 0x10

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v4, v2, 0x8

    and-int/lit16 v4, v4, 0xff

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v5, v0, 0x18

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v6, v0, 0x10

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v7, v0, 0x8

    and-int/lit16 v7, v7, 0xff

    and-int/lit16 v0, v0, 0xff

    sub-int/2addr v5, v1

    int-to-float v5, v5

    mul-float v5, v5, p0

    float-to-int v5, v5

    add-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x18

    sub-int/2addr v6, v3

    int-to-float v5, v6

    mul-float v5, v5, p0

    float-to-int v5, v5

    add-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    sub-int/2addr v7, v4

    int-to-float v3, v7

    mul-float v3, v3, p0

    float-to-int v3, v3

    add-int/2addr v4, v3

    shl-int/lit8 v3, v4, 0x8

    or-int/2addr v1, v3

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float p0, p0, v0

    float-to-int p0, p0

    add-int/2addr v2, p0

    or-int p0, v1, v2

    .line 779
    :goto_0
    iput p0, p1, Ll/ᩴۤۧ;->ۢ:I

    return-void

    .line 868
    :cond_0
    iget-object p0, p1, Ll/ᩴۤۧ;->᩷:[I

    iget v0, p1, Ll/ᩴۤۧ;->ۜ:I

    aget p0, p0, v0

    goto :goto_0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 397
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 398
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 399
    iget v1, p0, Ll/᩵ۤۧ;->ۗ:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v3

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 693
    iget-object v1, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iget-object v7, v1, Ll/ᩴۤۧ;->ܺ:Landroid/graphics/Paint;

    iget-object v8, v1, Ll/ᩴۤۧ;->ܶ:Landroid/graphics/RectF;

    .line 694
    iget v2, v1, Ll/ᩴۤۧ;->ۖ:F

    iget v3, v1, Ll/ᩴۤۧ;->۠:F

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v3, v9

    add-float/2addr v3, v2

    const/4 v10, 0x0

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_0

    .line 697
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    iget v3, v1, Ll/ᩴۤۧ;->ܳ:I

    int-to-float v3, v3

    iget v4, v1, Ll/ᩴۤۧ;->ܿ:F

    mul-float v3, v3, v4

    div-float/2addr v3, v9

    iget v4, v1, Ll/ᩴۤۧ;->۠:F

    div-float/2addr v4, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sub-float v3, v2, v3

    .line 700
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v3

    .line 701
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v3

    .line 702
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v3

    .line 703
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v3

    .line 700
    invoke-virtual {v8, v2, v4, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 705
    iget v0, v1, Ll/ᩴۤۧ;->᩵:F

    iget v2, v1, Ll/ᩴۤۧ;->ۘ:F

    add-float/2addr v0, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float v0, v0, v3

    .line 706
    iget v4, v1, Ll/ᩴۤۧ;->ۡ:F

    add-float/2addr v4, v2

    mul-float v4, v4, v3

    sub-float v11, v4, v0

    .line 709
    iget v2, v1, Ll/ᩴۤۧ;->ۢ:I

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 710
    iget v2, v1, Ll/ᩴۤۧ;->֫:I

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 713
    iget v2, v1, Ll/ᩴۤۧ;->۠:F

    div-float/2addr v2, v9

    .line 714
    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 715
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v9

    iget-object v6, v1, Ll/ᩴۤۧ;->᩻:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    neg-float v2, v2

    .line 717
    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, v8

    move v4, v0

    move v5, v11

    .line 719
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 725
    iget-object v2, v1, Ll/ᩴۤۧ;->ᩳ:Landroid/graphics/Paint;

    iget-boolean v3, v1, Ll/ᩴۤۧ;->ᩴ:Z

    if-eqz v3, :cond_2

    .line 726
    iget-object v3, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    if-nez v3, :cond_1

    .line 727
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    iput-object v3, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    .line 728
    sget-object v4, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v3, v4}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    goto :goto_0

    .line 730
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 732
    :goto_0
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v9

    .line 733
    iget v4, v1, Ll/ᩴۤۧ;->ܳ:I

    int-to-float v4, v4

    iget v5, v1, Ll/ᩴۤۧ;->ܿ:F

    mul-float v4, v4, v5

    div-float/2addr v4, v9

    .line 738
    iget-object v5, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    invoke-virtual {v5, v10, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 739
    iget-object v5, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    iget v6, v1, Ll/ᩴۤۧ;->ܳ:I

    int-to-float v6, v6

    iget v7, v1, Ll/ᩴۤۧ;->ܿ:F

    mul-float v6, v6, v7

    invoke-virtual {v5, v6, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 740
    iget-object v5, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    iget v6, v1, Ll/ᩴۤۧ;->ܳ:I

    int-to-float v6, v6

    iget v7, v1, Ll/ᩴۤۧ;->ܿ:F

    mul-float v6, v6, v7

    div-float/2addr v6, v9

    iget v10, v1, Ll/ᩴۤۧ;->ܽ:I

    int-to-float v10, v10

    mul-float v10, v10, v7

    invoke-virtual {v5, v6, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 742
    iget-object v5, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    add-float/2addr v6, v3

    sub-float/2addr v6, v4

    .line 743
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    iget v4, v1, Ll/ᩴۤۧ;->۠:F

    div-float/2addr v4, v9

    add-float/2addr v4, v3

    .line 742
    invoke-virtual {v5, v6, v4}, Landroid/graphics/Path;->offset(FF)V

    .line 744
    iget-object v3, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 746
    iget v3, v1, Ll/ᩴۤۧ;->ۢ:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 747
    iget v3, v1, Ll/ᩴۤۧ;->֫:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 748
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    add-float/2addr v0, v11

    .line 749
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    .line 750
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    .line 749
    invoke-virtual {p1, v0, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 751
    iget-object v0, v1, Ll/ᩴۤۧ;->ۧ:Landroid/graphics/Path;

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 752
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 401
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 412
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    .line 836
    iget v0, v0, Ll/ᩴۤۧ;->֫:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 439
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 406
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    .line 829
    iput p1, v0, Ll/ᩴۤۧ;->֫:I

    .line 407
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 417
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    .line 822
    iget-object v0, v0, Ll/ᩴۤۧ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 418
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final start()V
    .locals 4

    .line 447
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 936
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iget v1, v0, Ll/ᩴۤۧ;->᩵:F

    iput v1, v0, Ll/ᩴۤۧ;->֨:F

    .line 937
    iget v2, v0, Ll/ᩴۤۧ;->ۡ:F

    iput v2, v0, Ll/ᩴۤۧ;->֡:F

    .line 938
    iget v3, v0, Ll/ᩴۤۧ;->ۘ:F

    iput v3, v0, Ll/ᩴۤۧ;->ۚ:F

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 451
    iput-boolean v0, p0, Ll/᩵ۤۧ;->᩹:Z

    .line 452
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x29a

    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 453
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 455
    invoke-virtual {v0, v1}, Ll/ᩴۤۧ;->֫(I)V

    const/4 v1, 0x0

    .line 945
    iput v1, v0, Ll/ᩴۤۧ;->֨:F

    .line 946
    iput v1, v0, Ll/ᩴۤۧ;->֡:F

    .line 947
    iput v1, v0, Ll/ᩴۤۧ;->ۚ:F

    .line 852
    iput v1, v0, Ll/ᩴۤۧ;->᩵:F

    .line 872
    iput v1, v0, Ll/ᩴۤۧ;->ۡ:F

    .line 880
    iput v1, v0, Ll/ᩴۤۧ;->ۘ:F

    .line 457
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x534

    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 458
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public final stop()V
    .locals 4

    .line 467
    iget-object v0, p0, Ll/᩵ۤۧ;->᩸:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    .line 422
    iput v0, p0, Ll/᩵ۤۧ;->ۗ:F

    .line 902
    iget-object v1, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iget-boolean v2, v1, Ll/ᩴۤۧ;->ᩴ:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 903
    iput-boolean v3, v1, Ll/ᩴۤۧ;->ᩴ:Z

    .line 470
    :cond_0
    invoke-virtual {v1, v3}, Ll/ᩴۤۧ;->֫(I)V

    .line 945
    iput v0, v1, Ll/ᩴۤۧ;->֨:F

    .line 946
    iput v0, v1, Ll/ᩴۤۧ;->֡:F

    .line 947
    iput v0, v1, Ll/ᩴۤۧ;->ۚ:F

    .line 852
    iput v0, v1, Ll/ᩴۤۧ;->᩵:F

    .line 872
    iput v0, v1, Ll/ᩴۤۧ;->ۡ:F

    .line 880
    iput v0, v1, Ll/ᩴۤۧ;->ۘ:F

    .line 472
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 152
    iget-object v0, p0, Ll/᩵ۤۧ;->᩶:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 153
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40200000    # 2.5f

    mul-float v1, v1, v0

    .line 843
    iget-object v2, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iput v1, v2, Ll/ᩴۤۧ;->۠:F

    .line 844
    iget-object v3, v2, Ll/ᩴۤۧ;->ܺ:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/high16 v1, 0x40f00000    # 7.5f

    mul-float v1, v1, v0

    .line 891
    iput v1, v2, Ll/ᩴۤۧ;->ۖ:F

    const/4 v1, 0x0

    .line 157
    invoke-virtual {v2, v1}, Ll/ᩴۤۧ;->֫(I)V

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v1, v1, v0

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float v0, v0, v3

    float-to-int v1, v1

    .line 669
    iput v1, v2, Ll/ᩴۤۧ;->ܳ:I

    float-to-int v0, v0

    .line 670
    iput v0, v2, Ll/ᩴۤۧ;->ܽ:I

    .line 174
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 915
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iget v1, v0, Ll/ᩴۤۧ;->ܿ:F

    cmpl-float v1, p1, v1

    if-eqz v1, :cond_0

    .line 916
    iput p1, v0, Ll/ᩴۤۧ;->ܿ:F

    .line 299
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫(FLl/ᩴۤۧ;Z)V
    .locals 7

    .line 535
    iget-boolean v0, p0, Ll/᩵ۤۧ;->᩹:Z

    const v1, 0x3c23d70a    # 0.01f

    if-eqz v0, :cond_0

    .line 517
    invoke-static {p1, p2}, Ll/᩵ۤۧ;->֫(FLl/ᩴۤۧ;)V

    .line 928
    iget p3, p2, Ll/ᩴۤۧ;->ۚ:F

    const v0, 0x3f4ccccd    # 0.8f

    div-float/2addr p3, v0

    float-to-double v2, p3

    .line 518
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v4

    double-to-float p3, v2

    .line 860
    iget v0, p2, Ll/ᩴۤۧ;->֨:F

    .line 864
    iget v2, p2, Ll/ᩴۤۧ;->֡:F

    sub-float v1, v2, v1

    sub-float/2addr v1, v0

    mul-float v1, v1, p1

    add-float/2addr v1, v0

    .line 852
    iput v1, p2, Ll/ᩴۤۧ;->᩵:F

    .line 872
    iput v2, p2, Ll/ᩴۤۧ;->ۡ:F

    .line 928
    iget v0, p2, Ll/ᩴۤۧ;->ۚ:F

    invoke-static {p3, v0, p1, v0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p1

    .line 880
    iput p1, p2, Ll/ᩴۤۧ;->ۘ:F

    return-void

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v0

    if-nez v2, :cond_2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 928
    :cond_2
    :goto_0
    iget p3, p2, Ll/ᩴۤۧ;->ۚ:F

    .line 543
    sget-object v2, Ll/᩵ۤۧ;->ۛ:Ll/ۡۢ֫;

    const v3, 0x3f4a3d71    # 0.79f

    const/high16 v4, 0x3f000000    # 0.5f

    cmpg-float v5, p1, v4

    if-gez v5, :cond_3

    div-float v0, p1, v4

    .line 860
    iget v4, p2, Ll/ᩴۤۧ;->֨:F

    .line 547
    invoke-virtual {v2, v0}, Ll/ۖۢ֫;->getInterpolation(F)F

    move-result v0

    mul-float v0, v0, v3

    add-float/2addr v0, v1

    add-float/2addr v0, v4

    goto :goto_1

    :cond_3
    sub-float v5, p1, v4

    div-float/2addr v5, v4

    .line 860
    iget v4, p2, Ll/ᩴۤۧ;->֨:F

    add-float/2addr v4, v3

    .line 552
    invoke-virtual {v2, v5}, Ll/ۖۢ֫;->getInterpolation(F)F

    move-result v2

    sub-float/2addr v0, v2

    mul-float v0, v0, v3

    add-float/2addr v0, v1

    sub-float v0, v4, v0

    move v6, v4

    move v4, v0

    move v0, v6

    :goto_1
    const v1, 0x3e570a3c    # 0.20999998f

    mul-float v1, v1, p1

    add-float/2addr v1, p3

    .line 557
    iget p3, p0, Ll/᩵ۤۧ;->۬:F

    add-float/2addr p1, p3

    const/high16 p3, 0x43580000    # 216.0f

    mul-float p1, p1, p3

    .line 852
    iput v4, p2, Ll/ᩴۤۧ;->᩵:F

    .line 872
    iput v0, p2, Ll/ᩴۤۧ;->ۡ:F

    .line 880
    iput v1, p2, Ll/ᩴۤۧ;->ۘ:F

    .line 422
    iput p1, p0, Ll/᩵ۤۧ;->ۗ:F

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 902
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iget-boolean v1, v0, Ll/ᩴۤۧ;->ᩴ:Z

    if-eq v1, p1, :cond_0

    .line 903
    iput-boolean p1, v0, Ll/ᩴۤۧ;->ᩴ:Z

    .line 280
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final varargs ֫([I)V
    .locals 1

    .line 762
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    iput-object p1, v0, Ll/ᩴۤۧ;->᩷:[I

    const/4 p1, 0x0

    .line 764
    invoke-virtual {v0, p1}, Ll/ᩴۤۧ;->֫(I)V

    .line 391
    invoke-virtual {v0, p1}, Ll/ᩴۤۧ;->֫(I)V

    .line 392
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ۧ(F)V
    .locals 1

    .line 349
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    .line 880
    iput p1, v0, Ll/ᩴۤۧ;->ۘ:F

    .line 350
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ܽ(F)V
    .locals 2

    .line 852
    iget-object v0, p0, Ll/᩵ۤۧ;->ۙ:Ll/ᩴۤۧ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ᩴۤۧ;->᩵:F

    .line 872
    iput p1, v0, Ll/ᩴۤۧ;->ۡ:F

    .line 331
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
