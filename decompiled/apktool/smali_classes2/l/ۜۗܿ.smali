.class public Ll/ۜۗܿ;
.super Landroid/view/View;
.source "E14L"


# static fields
.field public static final synthetic ܺ֫:I


# instance fields
.field public ֫֫:F

.field public ۗ:Ll/֨ۛ;

.field public ۙ:Landroid/widget/EdgeEffect;

.field public ۛ:Landroid/widget/EdgeEffect;

.field public ۜ֫:Ll/ܽۗܿ;

.field public ۟:F

.field public ۡ֫:Z

.field public final ۢ֫:Landroid/graphics/RectF;

.field public ۤ:Landroid/widget/OverScroller;

.field public ۧ֫:Ll/ۧ᩻ۢ;

.field public final ۨ:I

.field public ۫:Landroid/widget/EdgeEffect;

.field public ۬:Landroid/widget/EdgeEffect;

.field public ܰ:I

.field public ܳ֫:F

.field public final ܽ֫:F

.field public ܿ֫:I

.field public ᩳ֫:Ll/֫ۖܽ;

.field public ᩶:Ll/֫ۖܽ;

.field public ᩷֫:Landroid/graphics/PointF;

.field public ᩸:F

.field public ᩹:F

.field public ᩺:I

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Ll/ۜۗܿ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p2, 0x3f000000    # 0.5f

    .line 44
    iput p2, p0, Ll/ۜۗܿ;->ܳ֫:F

    .line 233
    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Ll/ۜۗܿ;->᩷֫:Landroid/graphics/PointF;

    .line 436
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Ll/ۜۗܿ;->ۢ֫:Landroid/graphics/RectF;

    const/4 p2, 0x1

    .line 57
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 58
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    const/high16 p3, 0x42400000    # 48.0f

    .line 59
    sget v0, Ll/ۤۙܿ;->֫:F

    mul-float v0, v0, p3

    iput v0, p0, Ll/ۜۗܿ;->ܽ֫:F

    .line 60
    new-instance p3, Ll/֫ۖܽ;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ll/֫ۖܽ;-><init>(I)V

    iput-object p3, p0, Ll/ۜۗܿ;->ᩳ֫:Ll/֫ۖܽ;

    .line 61
    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 62
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p3, v1}, Ll/֫ۖܽ;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v1, 0x41900000    # 18.0f

    .line 63
    sget v2, Ll/ۤۙܿ;->ᩳ:F

    mul-float v2, v2, v1

    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 64
    new-instance p3, Ll/֫ۖܽ;

    invoke-direct {p3, v0}, Ll/֫ۖܽ;-><init>(I)V

    iput-object p3, p0, Ll/ۜۗܿ;->᩶:Ll/֫ۖܽ;

    .line 65
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 66
    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 68
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p3

    iput p3, p0, Ll/ۜۗܿ;->ۨ:I

    .line 70
    new-instance p3, Landroid/widget/EdgeEffect;

    invoke-direct {p3, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜۗܿ;->۬:Landroid/widget/EdgeEffect;

    .line 71
    new-instance p3, Landroid/widget/EdgeEffect;

    invoke-direct {p3, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜۗܿ;->ۛ:Landroid/widget/EdgeEffect;

    .line 72
    new-instance p3, Landroid/widget/EdgeEffect;

    invoke-direct {p3, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜۗܿ;->۫:Landroid/widget/EdgeEffect;

    .line 73
    new-instance p3, Landroid/widget/EdgeEffect;

    invoke-direct {p3, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜۗܿ;->ۙ:Landroid/widget/EdgeEffect;

    .line 75
    new-instance p3, Landroid/widget/OverScroller;

    invoke-direct {p3, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Ll/ۜۗܿ;->ۤ:Landroid/widget/OverScroller;

    .line 76
    invoke-virtual {p3, p2}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 77
    new-instance p2, Ll/֨ۛ;

    new-instance p3, Ll/ܳۗܿ;

    invoke-direct {p3, p0}, Ll/ܳۗܿ;-><init>(Ll/ۜۗܿ;)V

    invoke-direct {p2, p1, p3}, Ll/֨ۛ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Ll/ۜۗܿ;->ۗ:Ll/֨ۛ;

    return-void
.end method

.method public static ֫(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    .line 324
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 325
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float v1, v1, v1

    mul-float v0, v0, v0

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 326
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static ֫(Ll/ۜۗܿ;I)I
    .locals 0

    if-gez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 416
    :cond_0
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result p0

    if-le p1, p0, :cond_1

    return p0

    :cond_1
    return p1
.end method

.method public static bridge synthetic ֫(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->ۙ:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method private ֫(Landroid/graphics/Canvas;)V
    .locals 9

    const/4 v0, 0x0

    .line 501
    iget-object v1, p0, Ll/ۜۗܿ;->۬:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_0

    .line 502
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    const/high16 v3, 0x43870000    # 270.0f

    .line 503
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 504
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 505
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 506
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    .line 507
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 509
    :goto_0
    iget-object v2, p0, Ll/ۜۗܿ;->ۛ:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_1

    .line 510
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 511
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 512
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v2, v0, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 513
    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    or-int/2addr v1, v0

    .line 514
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 516
    iget v2, p0, Ll/ۜۗܿ;->ܽ֫:F

    iget-object v3, p0, Ll/ۜۗܿ;->۫:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_2

    .line 517
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 518
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    const/high16 v6, 0x42b40000    # 90.0f

    .line 519
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 520
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    int-to-float v6, v6

    iget v7, p0, Ll/ۜۗܿ;->ܰ:I

    int-to-float v7, v7

    mul-float v8, v2, v0

    add-float/2addr v8, v7

    iget v7, p0, Ll/ۜۗܿ;->ܳ֫:F

    mul-float v8, v8, v7

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    neg-float v7, v7

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 522
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-virtual {v3, v6, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 523
    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    or-int/2addr v1, v3

    .line 524
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 526
    :cond_2
    iget-object v3, p0, Ll/ۜۗܿ;->ۙ:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_3

    .line 527
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    const/high16 v5, 0x43340000    # 180.0f

    .line 528
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 529
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    iget v6, p0, Ll/ۜۗܿ;->᩺:I

    int-to-float v6, v6

    mul-float v2, v2, v0

    add-float/2addr v2, v6

    iget v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    mul-float v2, v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 530
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v3, v0, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 531
    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    or-int/2addr v1, v0

    .line 532
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    if-eqz v1, :cond_4

    .line 535
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_4
    return-void
.end method

.method private ֫(Landroid/graphics/PointF;)V
    .locals 3

    .line 649
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p0, Ll/ۜۗܿ;->ܽ֫:F

    add-float/2addr v0, v1

    iget v2, p0, Ll/ۜۗܿ;->ܳ֫:F

    mul-float v0, v0, v2

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 650
    iget v0, p1, Landroid/graphics/PointF;->y:F

    add-float/2addr v0, v1

    mul-float v0, v0, v2

    iput v0, p1, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۗܿ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۜۗܿ;->ܳ֫:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۗܿ;Landroid/graphics/PointF;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۜۗܿ;->֫(Landroid/graphics/PointF;)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۜۗܿ;)I
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/ۜۗܿ;I)I
    .locals 0

    if-gez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 428
    :cond_0
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result p0

    if-le p1, p0, :cond_1

    return p0

    :cond_1
    return p1
.end method

.method public static bridge synthetic ۧ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->۬:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method public static ۧ(Ll/ۜۗܿ;Landroid/graphics/PointF;)V
    .locals 2

    .line 641
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p0, Ll/ۜۗܿ;->ܳ֫:F

    div-float/2addr v0, v1

    iget p0, p0, Ll/ۜۗܿ;->ܽ֫:F

    sub-float/2addr v0, p0

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 642
    iget v0, p1, Landroid/graphics/PointF;->y:F

    div-float/2addr v0, v1

    sub-float/2addr v0, p0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۜۗܿ;)Ll/᩻ۗܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->ۧ֫:Ll/ۧ᩻ۢ;

    return-object p0
.end method

.method private ܽ()I
    .locals 3

    .line 405
    iget v0, p0, Ll/ۜۗܿ;->ܰ:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۜۗܿ;->ܽ֫:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    add-float/2addr v1, v0

    iget v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    mul-float v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v1, v0

    const/4 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public static bridge synthetic ܽ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->۫:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->ۛ:Landroid/widget/EdgeEffect;

    return-object p0
.end method

.method private ܿ()V
    .locals 2

    .line 310
    iget-object v0, p0, Ll/ۜۗܿ;->۬:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 311
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    .line 312
    iget-object v1, p0, Ll/ۜۗܿ;->ۛ:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 313
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    .line 314
    iget-object v1, p0, Ll/ۜۗܿ;->۫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 315
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    .line 316
    iget-object v1, p0, Ll/ۜۗܿ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 317
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 319
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_0
    return-void
.end method

.method private ᩳ()I
    .locals 3

    .line 409
    iget v0, p0, Ll/ۜۗܿ;->᩺:I

    int-to-float v0, v0

    iget v1, p0, Ll/ۜۗܿ;->ܽ֫:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    add-float/2addr v1, v0

    iget v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    mul-float v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v1, v0

    const/4 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۜۗܿ;)Landroid/widget/OverScroller;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۗܿ;->ۤ:Landroid/widget/OverScroller;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۜۗܿ;)I
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۜۗܿ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜۗܿ;->ܳ֫:F

    return p0
.end method


# virtual methods
.method public final computeScroll()V
    .locals 6

    .line 373
    iget-object v0, p0, Ll/ۜۗܿ;->ۤ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 374
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 375
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    .line 376
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v3

    .line 377
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v4

    if-eq v4, v2, :cond_1

    if-lez v2, :cond_0

    if-gtz v4, :cond_0

    .line 380
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    iget-object v5, p0, Ll/ۜۗܿ;->ۛ:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_0

    .line 382
    :cond_0
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result v5

    if-ge v2, v5, :cond_1

    if-lt v4, v5, :cond_1

    .line 384
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    iget-object v5, p0, Ll/ۜۗܿ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_1
    :goto_0
    if-eq v3, v1, :cond_3

    if-lez v1, :cond_2

    if-gtz v3, :cond_2

    .line 390
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Ll/ۜۗܿ;->۬:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_1

    .line 392
    :cond_2
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result v2

    if-ge v1, v2, :cond_3

    if-lt v3, v2, :cond_3

    .line 394
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Ll/ۜۗܿ;->۫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 399
    :cond_3
    :goto_1
    invoke-virtual {p0, v3, v4}, Landroid/view/View;->scrollTo(II)V

    .line 400
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_4
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 221
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 222
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    if-eqz v0, :cond_1

    .line 49
    iget-object v1, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۙܿ;

    .line 50
    invoke-virtual {v2}, Ll/۟ۙܿ;->᩷()V

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 52
    iput-wide v1, v0, Ll/ܽۗܿ;->֫:J

    :cond_1
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 440
    sget v0, Ll/ۤۙܿ;->֫:F

    const v0, -0xececed

    const v1, -0x70708

    .line 29
    invoke-static {v0, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result v0

    .line 440
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 441
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    if-nez v0, :cond_0

    .line 443
    invoke-direct {p0, p1}, Ll/ۜۗܿ;->֫(Landroid/graphics/Canvas;)V

    return-void

    .line 442
    :cond_0
    iget-object v1, v0, Ll/ܽۗܿ;->ۧ:Ljava/util/LinkedHashSet;

    .line 447
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    iget-object v9, p0, Ll/ۜۗܿ;->ۢ֫:Landroid/graphics/RectF;

    iput v2, v9, Landroid/graphics/RectF;->left:F

    .line 448
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    iput v2, v9, Landroid/graphics/RectF;->top:F

    .line 449
    iget v2, v9, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iput v2, v9, Landroid/graphics/RectF;->right:F

    .line 450
    iget v2, v9, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 459
    iget v10, p0, Ll/ۜۗܿ;->ܳ֫:F

    .line 631
    iget v3, v9, Landroid/graphics/RectF;->left:F

    div-float/2addr v3, v10

    iget v4, p0, Ll/ۜۗܿ;->ܽ֫:F

    sub-float/2addr v3, v4

    iput v3, v9, Landroid/graphics/RectF;->left:F

    .line 632
    iget v3, v9, Landroid/graphics/RectF;->top:F

    div-float/2addr v3, v10

    sub-float/2addr v3, v4

    iput v3, v9, Landroid/graphics/RectF;->top:F

    .line 633
    iget v3, v9, Landroid/graphics/RectF;->right:F

    div-float/2addr v3, v10

    sub-float/2addr v3, v4

    iput v3, v9, Landroid/graphics/RectF;->right:F

    div-float/2addr v2, v10

    sub-float/2addr v2, v4

    .line 634
    iput v2, v9, Landroid/graphics/RectF;->bottom:F

    .line 464
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    mul-float v4, v4, v10

    .line 465
    invoke-virtual {p1, v4, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 467
    iget v3, v0, Ll/ܽۗܿ;->ܳ:I

    const/4 v4, -0x1

    iget-object v11, p0, Ll/ۜۗܿ;->ᩳ֫:Ll/֫ۖܽ;

    if-eq v3, v4, :cond_6

    .line 468
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۙܿ;

    .line 89
    iget-object v5, v4, Ll/ۛۙܿ;->ܿ:Ll/ܽۗܿ;

    iget v5, v5, Ll/ܽۗܿ;->ܳ:I

    .line 90
    iget-object v6, v4, Ll/ۛۙܿ;->ܳ:Ll/۟ۙܿ;

    iget v6, v6, Ll/۟ۙܿ;->ܳ:I

    if-eq v5, v6, :cond_1

    iget-object v6, v4, Ll/ۛۙܿ;->֫:Ll/۟ۙܿ;

    iget v6, v6, Ll/۟ۙܿ;->ܳ:I

    if-ne v5, v6, :cond_2

    goto :goto_0

    .line 470
    :cond_2
    invoke-virtual {v4, p1, v11, v9, v10}, Ll/ۛۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_0

    .line 472
    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۙܿ;

    .line 89
    iget-object v4, v3, Ll/ۛۙܿ;->ܿ:Ll/ܽۗܿ;

    iget v4, v4, Ll/ܽۗܿ;->ܳ:I

    .line 90
    iget-object v5, v3, Ll/ۛۙܿ;->ܳ:Ll/۟ۙܿ;

    iget v5, v5, Ll/۟ۙܿ;->ܳ:I

    if-eq v4, v5, :cond_5

    iget-object v5, v3, Ll/ۛۙܿ;->֫:Ll/۟ۙܿ;

    iget v5, v5, Ll/۟ۙܿ;->ܳ:I

    if-ne v4, v5, :cond_4

    .line 474
    :cond_5
    invoke-virtual {v3, p1, v11, v9, v10}, Ll/ۛۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_1

    .line 477
    :cond_6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۙܿ;

    .line 478
    invoke-virtual {v3, p1, v11, v9, v10}, Ll/ۛۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_2

    :cond_7
    const v1, -0x777778

    const v3, -0x4f4f50

    .line 74
    invoke-static {v1, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v1

    .line 482
    iget-object v12, p0, Ll/ۜۗܿ;->᩶:Ll/֫ۖܽ;

    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 483
    iget-object v0, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/۟ۙܿ;

    move-object v4, p1

    move-object v5, v11

    move-object v6, v12

    move-object v7, v9

    move v8, v10

    .line 484
    invoke-virtual/range {v3 .. v8}, Ll/۟ۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_3

    .line 494
    :cond_8
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 495
    invoke-direct {p0, p1}, Ll/ۜۗܿ;->֫(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    if-eqz p1, :cond_5

    .line 617
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    .line 618
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    const/4 p3, 0x0

    if-gez p1, :cond_0

    const/4 p4, 0x0

    goto :goto_0

    .line 416
    :cond_0
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result p4

    if-le p1, p4, :cond_1

    goto :goto_0

    :cond_1
    move p4, p1

    :goto_0
    if-gez p2, :cond_2

    goto :goto_1

    .line 428
    :cond_2
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result p3

    if-le p2, p3, :cond_3

    goto :goto_1

    :cond_3
    move p3, p2

    :goto_1
    if-ne p1, p4, :cond_4

    if-eq p2, p3, :cond_5

    .line 622
    :cond_4
    invoke-virtual {p0, p4, p3}, Landroid/view/View;->scrollTo(II)V

    :cond_5
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 238
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    const/4 v1, 0x3

    iget-object v2, p0, Ll/ۜۗܿ;->ۗ:Ll/֨ۛ;

    const/4 v3, 0x1

    if-nez v0, :cond_1

    .line 239
    invoke-virtual {v2, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eq p1, v3, :cond_0

    if-eq p1, v1, :cond_0

    goto/16 :goto_4

    .line 243
    :cond_0
    invoke-direct {p0}, Ll/ۜۗܿ;->ܿ()V

    return v3

    .line 248
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_d

    if-eq v0, v3, :cond_c

    const/4 v5, 0x2

    if-eq v0, v5, :cond_4

    if-eq v0, v1, :cond_c

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    goto/16 :goto_3

    .line 268
    :cond_2
    iget p1, p0, Ll/ۜۗܿ;->ܿ֫:I

    sub-int/2addr p1, v3

    iput p1, p0, Ll/ۜۗܿ;->ܿ֫:I

    return v3

    .line 256
    :cond_3
    iget v0, p0, Ll/ۜۗܿ;->ܿ֫:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ۜۗܿ;->ܿ֫:I

    .line 257
    iget-boolean v0, p0, Ll/ۜۗܿ;->ۡ֫:Z

    if-nez v0, :cond_10

    .line 258
    invoke-static {p1}, Ll/ۜۗܿ;->֫(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Ll/ۜۗܿ;->۟:F

    .line 259
    iget v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    iput v0, p0, Ll/ۜۗܿ;->֫֫:F

    .line 260
    iput-boolean v3, p0, Ll/ۜۗܿ;->ۡ֫:Z

    .line 261
    iput-boolean v4, p0, Ll/ۜۗܿ;->᩻֫:Z

    .line 263
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    add-float/2addr v1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v1, v0

    iput v1, p0, Ll/ۜۗܿ;->᩸:F

    .line 264
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v1

    div-float/2addr p1, v0

    iput p1, p0, Ll/ۜۗܿ;->᩹:F

    return v3

    .line 271
    :cond_4
    iget v0, p0, Ll/ۜۗܿ;->ܿ֫:I

    if-ne v0, v3, :cond_f

    iget-boolean v0, p0, Ll/ۜۗܿ;->ۡ֫:Z

    if-eqz v0, :cond_f

    .line 272
    invoke-static {p1}, Ll/ۜۗܿ;->֫(Landroid/view/MotionEvent;)F

    move-result p1

    .line 273
    iget-boolean v0, p0, Ll/ۜۗܿ;->᩻֫:Z

    if-nez v0, :cond_5

    .line 274
    iget v0, p0, Ll/ۜۗܿ;->۟:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Ll/ۜۗܿ;->ۨ:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_10

    .line 275
    iput-boolean v3, p0, Ll/ۜۗܿ;->᩻֫:Z

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    .line 276
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    .line 279
    :cond_5
    iget v0, p0, Ll/ۜۗܿ;->᩸:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Ll/ۜۗܿ;->᩹:F

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iget-object v2, p0, Ll/ۜۗܿ;->᩷֫:Landroid/graphics/PointF;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 641
    iget v0, v2, Landroid/graphics/PointF;->x:F

    iget v1, p0, Ll/ۜۗܿ;->ܳ֫:F

    div-float/2addr v0, v1

    iget v5, p0, Ll/ۜۗܿ;->ܽ֫:F

    sub-float/2addr v0, v5

    iput v0, v2, Landroid/graphics/PointF;->x:F

    .line 642
    iget v0, v2, Landroid/graphics/PointF;->y:F

    div-float/2addr v0, v1

    sub-float/2addr v0, v5

    iput v0, v2, Landroid/graphics/PointF;->y:F

    .line 282
    iget v0, p0, Ll/ۜۗܿ;->֫֫:F

    mul-float v0, v0, p1

    iget p1, p0, Ll/ۜۗܿ;->۟:F

    div-float/2addr v0, p1

    iput v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, p1

    if-lez v1, :cond_6

    .line 284
    iput p1, p0, Ll/ۜۗܿ;->ܳ֫:F

    goto :goto_0

    :cond_6
    const p1, 0x3d4ccccd    # 0.05f

    cmpg-float v0, v0, p1

    if-gez v0, :cond_7

    .line 286
    iput p1, p0, Ll/ۜۗܿ;->ܳ֫:F

    .line 289
    :cond_7
    :goto_0
    invoke-direct {p0, v2}, Ll/ۜۗܿ;->֫(Landroid/graphics/PointF;)V

    .line 290
    iget p1, v2, Landroid/graphics/PointF;->x:F

    iget v0, p0, Ll/ۜۗܿ;->᩸:F

    sub-float/2addr p1, v0

    float-to-int p1, p1

    if-gez p1, :cond_8

    const/4 p1, 0x0

    goto :goto_1

    .line 416
    :cond_8
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result v0

    if-le p1, v0, :cond_9

    move p1, v0

    .line 291
    :cond_9
    :goto_1
    iget v0, v2, Landroid/graphics/PointF;->y:F

    iget v1, p0, Ll/ۜۗܿ;->᩹:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    if-gez v0, :cond_a

    goto :goto_2

    .line 428
    :cond_a
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result v4

    if-le v0, v4, :cond_b

    goto :goto_2

    :cond_b
    move v4, v0

    .line 292
    :goto_2
    invoke-virtual {p0, p1, v4}, Landroid/view/View;->scrollTo(II)V

    .line 293
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v3

    .line 299
    :cond_c
    invoke-direct {p0}, Ll/ۜۗܿ;->ܿ()V

    goto :goto_3

    .line 250
    :cond_d
    iget-object v0, p0, Ll/ۜۗܿ;->ۤ:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_e

    .line 251
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 252
    :cond_e
    iput v4, p0, Ll/ۜۗܿ;->ܿ֫:I

    .line 253
    iput-boolean v4, p0, Ll/ۜۗܿ;->ۡ֫:Z

    .line 302
    :cond_f
    :goto_3
    iget-boolean v0, p0, Ll/ۜۗܿ;->ۡ֫:Z

    if-nez v0, :cond_10

    .line 303
    invoke-virtual {v2, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    :cond_10
    :goto_4
    return v3
.end method

.method public final ֫()I
    .locals 2

    .line 540
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 544
    :cond_0
    iget-object v0, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۙܿ;

    invoke-virtual {v0}, Ll/۟ۙܿ;->ᩳ()I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۙܿ;

    invoke-virtual {p1}, Ll/۟ۙܿ;->ᩳ()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 16

    move-object/from16 v0, p0

    .line 654
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 658
    iget v3, v0, Ll/ۜۗܿ;->ܰ:I

    int-to-long v4, v3

    iget v6, v0, Ll/ۜۗܿ;->᩺:I

    int-to-long v7, v6

    mul-long v4, v4, v7

    const-wide/16 v7, 0x2

    mul-long v4, v4, v7

    const-wide/16 v9, 0x400

    div-long/2addr v4, v9

    div-long/2addr v4, v9

    div-long/2addr v4, v7

    long-to-int v5, v4

    const/16 v4, 0xfa

    const/high16 v7, 0x3f000000    # 0.5f

    if-gt v5, v4, :cond_0

    const/high16 v4, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_0
    const/16 v4, 0x1f4

    if-gt v5, v4, :cond_1

    const v4, 0x3ecccccd    # 0.4f

    goto :goto_0

    :cond_1
    const v4, 0x3e99999a    # 0.3f

    :goto_0
    int-to-float v3, v3

    .line 668
    iget v5, v0, Ll/ۜۗܿ;->ܽ֫:F

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v8, v8, v5

    add-float/2addr v3, v8

    mul-float v3, v3, v4

    add-float/2addr v3, v7

    float-to-int v3, v3

    int-to-float v6, v6

    add-float/2addr v8, v6

    mul-float v8, v8, v4

    add-float/2addr v8, v7

    float-to-int v6, v8

    .line 670
    iget-object v7, v0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    .line 675
    invoke-static {v3, v6, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 676
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 677
    sget v6, Ll/ۤۙܿ;->֫:F

    const v6, -0xececed

    const v8, -0x70708

    .line 29
    invoke-static {v6, v8}, Ll/᩹֡᩷;->֫(II)I

    move-result v6

    .line 677
    invoke-virtual {v3, v6}, Landroid/graphics/Canvas;->drawColor(I)V

    if-eqz v7, :cond_3

    mul-float v5, v5, v4

    .line 680
    invoke-virtual {v3, v5, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 681
    iget v5, v0, Ll/ۜۗܿ;->ܰ:I

    int-to-float v5, v5

    iget v6, v0, Ll/ۜۗܿ;->᩺:I

    int-to-float v6, v6

    iget-object v14, v0, Ll/ۜۗܿ;->ۢ֫:Landroid/graphics/RectF;

    const/4 v8, 0x0

    invoke-virtual {v14, v8, v8, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 685
    iget-object v5, v7, Ll/ܽۗܿ;->ۧ:Ljava/util/LinkedHashSet;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v15, v0, Ll/ۜۗܿ;->ᩳ֫:Ll/֫ۖܽ;

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛۙܿ;

    .line 686
    invoke-virtual {v6, v3, v15, v14, v4}, Ll/ۛۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_1

    :cond_2
    const v5, -0x777778

    const v6, -0x4f4f50

    .line 74
    invoke-static {v5, v6}, Ll/᩹֡᩷;->֫(II)I

    move-result v5

    .line 688
    iget-object v6, v0, Ll/ۜۗܿ;->᩶:Ll/֫ۖܽ;

    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 689
    iget-object v5, v7, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ll/۟ۙܿ;

    move-object v9, v3

    move-object v10, v15

    move-object v11, v6

    move-object v12, v14

    move v13, v4

    .line 690
    invoke-virtual/range {v8 .. v13}, Ll/۟ۙܿ;->֫(Landroid/graphics/Canvas;Ll/֫ۖܽ;Ll/֫ۖܽ;Landroid/graphics/RectF;F)V

    goto :goto_2

    :cond_3
    const/16 v3, 0x50

    move-object/from16 v4, p1

    .line 694
    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 695
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 5

    .line 343
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 344
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 345
    iget v0, p0, Ll/ۜۗܿ;->ܳ֫:F

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(F)V

    .line 346
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    .line 347
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 348
    iget-object v2, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    .line 567
    iget-object v3, v2, Ll/ܽۗܿ;->ۧ:Ljava/util/LinkedHashSet;

    const v4, 0x76676723

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 568
    iget v4, v2, Ll/ܽۗܿ;->ᩳ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 569
    iget v4, v2, Ll/ܽۗܿ;->ܽ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 570
    iget v4, v2, Ll/ܽۗܿ;->ܳ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 571
    iget-object v2, v2, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 572
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ۙܿ;

    .line 573
    invoke-virtual {v4, p1}, Ll/۟ۙܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 575
    :cond_0
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 576
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۙܿ;

    .line 166
    iget-object v4, v3, Ll/ۛۙܿ;->ܳ:Ll/۟ۙܿ;

    iget v4, v4, Ll/۟ۙܿ;->ܳ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 167
    iget-object v4, v3, Ll/ۛۙܿ;->֫:Ll/۟ۙܿ;

    iget v4, v4, Ll/۟ۙܿ;->ܳ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 168
    iget v4, v3, Ll/ۛۙܿ;->ۢ:I

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 169
    iget-object v4, v3, Ll/ۛۙܿ;->ۜ:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, v3, Ll/ۛۙܿ;->ᩳ:Ljava/lang/String;

    if-eqz v4, :cond_1

    .line 170
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 171
    iget-object v4, v3, Ll/ۛۙܿ;->ۜ:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 172
    iget-object v3, v3, Ll/ۛۙܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    .line 174
    :cond_1
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_1

    :cond_2
    return-void

    .line 91
    :cond_3
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ֫(Ll/ۧ᩻ۢ;)V
    .locals 0

    .line 216
    iput-object p1, p0, Ll/ۜۗܿ;->ۧ֫:Ll/ۧ᩻ۢ;

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 3

    .line 355
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 356
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 357
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۜ()F

    move-result v2

    iput v2, p0, Ll/ۜۗܿ;->ܳ֫:F

    .line 358
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 359
    new-instance v2, Ll/ܽۗܿ;

    invoke-direct {v2, p1}, Ll/ܽۗܿ;-><init>(Ll/۬ۜܽ;)V

    iput-object v2, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    .line 360
    iget p1, v2, Ll/ܽۗܿ;->ᩳ:I

    iput p1, p0, Ll/ۜۗܿ;->ܰ:I

    .line 361
    iget p1, v2, Ll/ܽۗܿ;->ܽ:I

    iput p1, p0, Ll/ۜۗܿ;->᩺:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 363
    iput-object p1, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    .line 365
    :goto_0
    new-instance p1, Ll/ᩳۗܿ;

    invoke-direct {p1, p0, v0, v1}, Ll/ᩳۗܿ;-><init>(Ll/ۜۗܿ;II)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Ll/ܽۗܿ;)V
    .locals 2

    .line 330
    iput-object p1, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 332
    iput v0, p0, Ll/ۜۗܿ;->᩺:I

    iput v0, p0, Ll/ۜۗܿ;->ܰ:I

    .line 333
    invoke-virtual {p0, v0, v0}, Landroid/view/View;->scrollTo(II)V

    goto :goto_0

    .line 335
    :cond_0
    iget v1, p1, Ll/ܽۗܿ;->ᩳ:I

    iput v1, p0, Ll/ۜۗܿ;->ܰ:I

    .line 336
    iget p1, p1, Ll/ܽۗܿ;->ܽ:I

    iput p1, p0, Ll/ۜۗܿ;->᩺:I

    .line 337
    invoke-virtual {p0}, Ll/ۜۗܿ;->֫()I

    move-result p1

    invoke-virtual {p0, p1, v0, v0}, Ll/ۜۗܿ;->֫(IZZ)Z

    .line 339
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(IZZ)Z
    .locals 15

    move-object v0, p0

    move/from16 v1, p1

    .line 563
    iget-object v2, v0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto/16 :goto_7

    .line 567
    :cond_0
    iget-object v4, v2, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۟ۙܿ;

    .line 130
    iget-object v6, v5, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .line 571
    :cond_2
    invoke-virtual {v5}, Ll/۟ۙܿ;->ۜ()Ll/ۨۙܿ;

    move-result-object v6

    iget v6, v6, Ll/ۨۙܿ;->ۧ:I

    if-gt v1, v6, :cond_1

    .line 572
    invoke-virtual {v5}, Ll/۟ۙܿ;->ܳ()F

    move-result v4

    .line 573
    invoke-virtual {v5}, Ll/۟ۙܿ;->᩻()F

    move-result v6

    .line 574
    invoke-virtual {v5}, Ll/۟ۙܿ;->ܿ()F

    move-result v7

    .line 575
    invoke-virtual {v5}, Ll/۟ۙܿ;->֫()F

    move-result v8

    .line 576
    iget v9, v0, Ll/ۜۗܿ;->ܽ֫:F

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    .line 578
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    iget v12, v0, Ll/ۜۗܿ;->ܳ֫:F

    div-float/2addr v11, v12

    .line 579
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    iget v13, v0, Ll/ۜۗܿ;->ܳ֫:F

    div-float/2addr v12, v13

    .line 581
    new-instance v13, Landroid/graphics/PointF;

    invoke-direct {v13}, Landroid/graphics/PointF;-><init>()V

    add-float v14, v7, v9

    add-float/2addr v14, v9

    cmpg-float v14, v14, v11

    if-gez v14, :cond_3

    sub-float/2addr v11, v7

    div-float/2addr v11, v10

    sub-float/2addr v4, v11

    .line 583
    iput v4, v13, Landroid/graphics/PointF;->x:F

    goto :goto_1

    :cond_3
    sub-float/2addr v4, v9

    .line 585
    iput v4, v13, Landroid/graphics/PointF;->x:F

    :goto_1
    if-nez p3, :cond_4

    add-float v4, v8, v9

    add-float/2addr v4, v9

    cmpg-float v4, v4, v12

    if-gez v4, :cond_4

    sub-float/2addr v12, v8

    div-float/2addr v12, v10

    sub-float/2addr v6, v12

    .line 588
    iput v6, v13, Landroid/graphics/PointF;->y:F

    goto :goto_2

    :cond_4
    sub-float/2addr v6, v9

    .line 590
    iput v6, v13, Landroid/graphics/PointF;->y:F

    :goto_2
    const/4 v4, 0x1

    if-eqz p3, :cond_6

    .line 65
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 66
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v7, 0x41900000    # 18.0f

    .line 67
    sget v8, Ll/ۤۙܿ;->ᩳ:F

    mul-float v8, v8, v7

    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 68
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v6

    .line 69
    iget v7, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v7, v6

    .line 594
    iget-object v6, v5, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۨۙܿ;

    .line 595
    iget v8, v8, Ll/ۨۙܿ;->ۧ:I

    if-ne v8, v1, :cond_5

    goto :goto_4

    .line 598
    :cond_5
    iget v8, v13, Landroid/graphics/PointF;->y:F

    add-float/2addr v8, v7

    iput v8, v13, Landroid/graphics/PointF;->y:F

    goto :goto_3

    .line 601
    :cond_6
    :goto_4
    invoke-direct {p0, v13}, Ll/ۜۗܿ;->֫(Landroid/graphics/PointF;)V

    .line 602
    iget v1, v13, Landroid/graphics/PointF;->x:F

    float-to-int v1, v1

    if-gez v1, :cond_7

    const/4 v1, 0x0

    goto :goto_5

    .line 416
    :cond_7
    invoke-direct {p0}, Ll/ۜۗܿ;->ܽ()I

    move-result v6

    if-le v1, v6, :cond_8

    move v1, v6

    .line 603
    :cond_8
    :goto_5
    iget v6, v13, Landroid/graphics/PointF;->y:F

    float-to-int v6, v6

    if-gez v6, :cond_9

    goto :goto_6

    .line 428
    :cond_9
    invoke-direct {p0}, Ll/ۜۗܿ;->ᩳ()I

    move-result v3

    if-le v6, v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v6

    .line 604
    :goto_6
    invoke-virtual {p0, v1, v3}, Landroid/view/View;->scrollTo(II)V

    if-eqz p2, :cond_b

    .line 606
    iget v1, v5, Ll/۟ۙܿ;->ܳ:I

    iput v1, v2, Ll/ܽۗܿ;->ܳ:I

    :cond_b
    return v4

    :cond_c
    :goto_7
    return v3
.end method

.method public final ۧ()I
    .locals 4

    .line 548
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 552
    :cond_0
    iget-object v0, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    .line 553
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 554
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۙܿ;

    .line 130
    iget-object v3, v2, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 556
    invoke-virtual {v2}, Ll/۟ۙܿ;->ۜ()Ll/ۨۙܿ;

    move-result-object v0

    iget v0, v0, Ll/ۨۙܿ;->ۧ:I

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 195
    iget-object v0, p0, Ll/ۜۗܿ;->ۜ֫:Ll/ܽۗܿ;

    if-eqz v0, :cond_0

    .line 197
    iget-object v1, v0, Ll/ܽۗܿ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۙܿ;

    iget p1, p1, Ll/۟ۙܿ;->ܳ:I

    iput p1, v0, Ll/ܽۗܿ;->ܳ:I

    .line 198
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
