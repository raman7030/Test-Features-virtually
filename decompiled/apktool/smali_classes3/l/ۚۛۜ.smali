.class public final Ll/ۚۛۜ;
.super Ll/۬ۛۜ;
.source "B6LA"


# instance fields
.field public ֡֫:Landroid/animation/ValueAnimator;

.field public final ֫֫:Landroid/util/SparseArray;

.field public final ۖ֫:Ll/ܺۛۜ;

.field public ۗ:Z

.field public ۘ֫:Z

.field public final ۙ:Landroid/view/GestureDetector;

.field public ۛ:Ll/ۡۛۜ;

.field public final ۜ֫:Landroid/widget/OverScroller;

.field public ۟:J

.field public final ۡ֫:Landroid/graphics/Matrix;

.field public ۢ֫:Z

.field public ۤ:I

.field public final ۧ֫:Landroid/graphics/Paint;

.field public ۨ:Ll/ۗۛۜ;

.field public ۫:I

.field public final ۬:Landroid/graphics/Matrix;

.field public ܰ:Z

.field public final ܳ֫:Landroid/view/ScaleGestureDetector;

.field public ܺ֫:F

.field public ܽ֫:Landroid/os/Bundle;

.field public ܿ֫:I

.field public final ᩳ֫:Ll/ܰۨۜ;

.field public final ᩴ֫:Landroid/graphics/RectF;

.field public ᩵֫:F

.field public ᩶:I

.field public final ᩷֫:Landroid/graphics/Paint;

.field public ᩸:Ll/᩶᩺ۜ;

.field public ᩹:I

.field public final ᩺:Landroid/os/Handler;

.field public ᩻֫:D


# direct methods
.method public constructor <init>(Ll/ܺܶۜ;)V
    .locals 4

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0}, Ll/۬ۛۜ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    new-instance v0, Ll/ܰۨۜ;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {v0, v1}, Ll/ܰۨۜ;-><init>(F)V

    iput-object v0, p0, Ll/ۚۛۜ;->ᩳ֫:Ll/ܰۨۜ;

    .line 26
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    .line 27
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۚۛۜ;->ۧ֫:Landroid/graphics/Paint;

    .line 28
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۚۛۜ;->᩷֫:Landroid/graphics/Paint;

    .line 29
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/ۚۛۜ;->ۡ֫:Landroid/graphics/Matrix;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/ۚۛۜ;->۬:Landroid/graphics/Matrix;

    .line 30
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/ۚۛۜ;->ᩴ֫:Landroid/graphics/RectF;

    .line 34
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Ll/ۚۛۜ;->᩺:Landroid/os/Handler;

    .line 35
    new-instance v2, Ll/ܺۛۜ;

    invoke-direct {v2, p0}, Ll/ܺۛۜ;-><init>(Ll/ۚۛۜ;)V

    iput-object v2, p0, Ll/ۚۛۜ;->ۖ֫:Ll/ܺۛۜ;

    const/4 v2, -0x1

    .line 39
    iput v2, p0, Ll/ۚۛۜ;->᩶:I

    const/high16 v2, -0x1000000

    iput v2, p0, Ll/ۚۛۜ;->᩹:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 42
    iput v2, p0, Ll/ۚۛۜ;->᩵֫:F

    .line 54
    new-instance v2, Landroid/widget/OverScroller;

    invoke-direct {v2, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/ۚۛۜ;->ۜ֫:Landroid/widget/OverScroller;

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v3, 0x41800000    # 16.0f

    mul-float v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 56
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 57
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 58
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 59
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 60
    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Ll/ۖۛۜ;

    invoke-direct {v1, p0}, Ll/ۖۛۜ;-><init>(Ll/ۚۛۜ;)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Ll/ۚۛۜ;->ܳ֫:Landroid/view/ScaleGestureDetector;

    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/ScaleGestureDetector;->setQuickScaleEnabled(Z)V

    .line 74
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Ll/ᩴۛۜ;

    invoke-direct {v1, p0}, Ll/ᩴۛۜ;-><init>(Ll/ۚۛۜ;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Ll/ۚۛۜ;->ۙ:Landroid/view/GestureDetector;

    return-void
.end method

.method public static bridge synthetic ֡(Ll/ۚۛۜ;)D
    .locals 2

    .line 0
    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide v0

    return-wide v0
.end method

.method private ֫(F)Ll/᩵ۛۜ;
    .locals 8

    .line 149
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    if-gez v1, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    iget-wide v1, p0, Ll/ۚۛۜ;->᩻֫:D

    iget v3, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float v3, p1, v3

    float-to-double v3, v3

    add-double/2addr v1, v3

    .line 151
    invoke-virtual {v0, v1, v2}, Ll/ۡۛۜ;->֫(D)I

    move-result v0

    .line 152
    new-instance v3, Ll/᩵ۛۜ;

    iget-object v4, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v4, v0}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v4

    sub-double/2addr v1, v4

    iget-object v4, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v4, v0}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    div-double/2addr v1, v4

    invoke-direct {v3, v0, v1, v2, p1}, Ll/᩵ۛۜ;-><init>(IDF)V

    return-object v3

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(FF)V
    .locals 4

    const/4 v0, 0x0

    .line 335
    iput-boolean v0, p0, Ll/ۚۛۜ;->ۗ:Z

    const/4 v0, 0x0

    .line 336
    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    .line 337
    iget-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    iget v2, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr p2, v2

    float-to-double v2, p2

    sub-double/2addr v0, v2

    iput-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 338
    iget p2, p0, Ll/ۚۛۜ;->ܺ֫:F

    add-float/2addr p2, p1

    iput p2, p0, Ll/ۚۛۜ;->ܺ֫:F

    .line 339
    invoke-direct {p0}, Ll/ۚۛۜ;->ܺ()V

    return-void
.end method

.method private ֫(Ll/֡ۛۜ;)V
    .locals 4

    .line 221
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    iget v1, p1, Ll/֡ۛۜ;->ܿ:I

    iget-wide v2, p1, Ll/֡ۛۜ;->᩻:J

    invoke-virtual {v0, v1, v2, v3}, Ll/᩶᩺ۜ;->֫(IJ)V

    .line 222
    iget-object p1, p1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    if-eqz p1, :cond_0

    check-cast p1, Ll/ܶ᩺ۜ;

    invoke-virtual {p1}, Ll/ܶ᩺ۜ;->ۧ()V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۚۛۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۚۛۜ;->ܺ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۛۜ;FF)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۚۛۜ;->֫(FF)V

    return-void
.end method

.method public static ֫(Ll/ۚۛۜ;FFF)V
    .locals 5

    .line 343
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 344
    iput-boolean v0, p0, Ll/ۚۛۜ;->ۗ:Z

    const/4 v0, 0x0

    .line 345
    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    const/high16 v0, 0x40a00000    # 5.0f

    .line 346
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 347
    iget-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    iget v2, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float v3, p3, v2

    float-to-double v3, v3

    add-double/2addr v0, v3

    .line 348
    iget v3, p0, Ll/ۚۛۜ;->ܺ֫:F

    sub-float v3, p2, v3

    mul-float v3, v3, p1

    div-float/2addr v3, v2

    sub-float/2addr p2, v3

    iput p2, p0, Ll/ۚۛۜ;->ܺ֫:F

    .line 349
    iput p1, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr p3, p1

    float-to-double p1, p3

    sub-double/2addr v0, p1

    .line 350
    iput-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 351
    invoke-direct {p0}, Ll/ۚۛۜ;->ܺ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۛۜ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚۛۜ;->֡֫:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private ֫(Ll/᩵ۛۜ;)V
    .locals 7

    .line 156
    iget-boolean v0, p0, Ll/ۚۛۜ;->ۗ:Z

    if-eqz v0, :cond_0

    .line 158
    iget-object p1, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v0, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {p1, v0}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v0

    iget-object p1, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {p1, v2}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget v4, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr p1, v4

    float-to-double v4, p1

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    add-double/2addr v2, v0

    iput-wide v2, p0, Ll/ۚۛۜ;->᩻֫:D

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 159
    iget v0, p1, Ll/᩵ۛۜ;->ۧ:I

    .line 160
    iget-object v1, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v1, v0}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v1

    iget-wide v3, p1, Ll/᩵ۛۜ;->֫:D

    iget-object v5, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v5, v0}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v5

    mul-double v3, v3, v5

    add-double/2addr v3, v1

    iget p1, p1, Ll/᩵ۛۜ;->ܽ:F

    iget v0, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr p1, v0

    float-to-double v0, p1

    sub-double/2addr v3, v0

    iput-wide v3, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 162
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۚۛۜ;->ۜ()V

    return-void
.end method

.method private ֫(Ll/֡ۛۜ;J)Z
    .locals 3

    .line 210
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-wide v0, p1, Ll/֡ۛۜ;->᩻:J

    cmp-long v2, v0, p2

    if-nez v2, :cond_0

    iget p2, p1, Ll/֡ۛۜ;->ܿ:I

    int-to-long p2, p2

    const-wide/16 v0, 0x1

    add-long/2addr p2, v0

    iget-wide v0, p1, Ll/֡ۛۜ;->ܽ:J

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۖ(Ll/ۚۛۜ;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->֡֫:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/ۚۛۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ۚۛۜ;->۫:I

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۚۛۜ;)Landroid/view/ScaleGestureDetector;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->ܳ֫:Landroid/view/ScaleGestureDetector;

    return-object p0
.end method

.method private ۜ()V
    .locals 6

    .line 330
    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide v0

    invoke-direct {p0}, Ll/ۚۛۜ;->᩷()D

    move-result-wide v2

    iget-wide v4, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    iget v2, p0, Ll/ۚۛۜ;->᩵֫:F

    sub-float/2addr v1, v2

    mul-float v1, v1, v0

    const/4 v0, 0x0

    iget v2, p0, Ll/ۚۛۜ;->ܺ֫:F

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Ll/ۚۛۜ;->ܺ֫:F

    return-void
.end method

.method public static bridge synthetic ۡ(Ll/ۚۛۜ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۛۜ;->ܺ֫:F

    return p0
.end method

.method private ۡ()V
    .locals 2

    .line 404
    iget-object v0, p0, Ll/ۚۛۜ;->ۜ֫:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 405
    iget-object v0, p0, Ll/ۚۛۜ;->֡֫:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ۚۛۜ;->֡֫:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method private ۢ()D
    .locals 7

    .line 320
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v5, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr v0, v5

    float-to-double v5, v0

    sub-double/2addr v3, v5

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic ۢ(Ll/ۚۛۜ;)Landroid/widget/OverScroller;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->ۜ֫:Landroid/widget/OverScroller;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚۛۜ;)Ll/ۙۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۚۛۜ;)Landroid/util/SparseArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ۚۛۜ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۛۜ;->᩵֫:F

    return p0
.end method

.method private ܺ()V
    .locals 12

    .line 226
    iget-object v0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    iget-object v1, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-lez v1, :cond_6

    iget-boolean v1, p0, Ll/ۚۛۜ;->ۘ֫:Z

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, 0x1

    .line 227
    iput-boolean v1, p0, Ll/ۚۛۜ;->ۘ֫:Z

    const/4 v2, 0x0

    .line 229
    :try_start_0
    invoke-direct {p0}, Ll/ۚۛۜ;->ۜ()V

    .line 230
    iget-object v3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget-wide v4, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-virtual {v3, v4, v5}, Ll/ۡۛۜ;->֫(D)I

    move-result v3

    iget-object v4, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget-wide v5, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    iget v8, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr v7, v8

    float-to-double v7, v7

    add-double/2addr v5, v7

    invoke-virtual {v4, v5, v6}, Ll/ۡۛۜ;->֫(D)I

    move-result v4

    .line 231
    iget-object v5, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v5}, Ll/ۡۛۜ;->ۧ()D

    move-result-wide v5

    const-wide v7, 0x3f50624dd2f1a9fcL    # 0.001

    sub-double/2addr v5, v7

    iget-wide v7, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    iget v10, p0, Ll/ۚۛۜ;->᩵֫:F

    const/high16 v11, 0x40000000    # 2.0f

    mul-float v10, v10, v11

    div-float/2addr v9, v10

    float-to-double v9, v9

    add-double/2addr v7, v9

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    .line 232
    iget-object v7, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v7, v5, v6}, Ll/ۡۛۜ;->֫(D)I

    move-result v7

    .line 233
    iget-boolean v8, p0, Ll/ۚۛۜ;->ۗ:Z

    if-nez v8, :cond_1

    iget-object v8, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    if-nez v8, :cond_1

    iget-object v8, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v8, v7}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v8

    iget-object v10, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v10, v7}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v10

    add-double/2addr v8, v10

    cmpg-double v10, v5, v8

    if-gtz v10, :cond_1

    iget v5, p0, Ll/ۚۛۜ;->᩶:I

    if-eq v7, v5, :cond_1

    .line 234
    iput v7, p0, Ll/ۚۛۜ;->᩶:I

    .line 235
    iget-object v5, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v5, v7}, Ll/᩶᩺ۜ;->ᩳ(I)V

    .line 236
    iget-object v5, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    if-eqz v5, :cond_1

    iget v6, p0, Ll/ۚۛۜ;->᩶:I

    invoke-interface {v5, v6}, Ll/ۗۛۜ;->֫(I)V

    .line 238
    :cond_1
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v5

    sub-int/2addr v5, v1

    :goto_0
    if-ltz v5, :cond_4

    .line 239
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ۛۜ;

    .line 240
    iget v7, v6, Ll/֡ۛۜ;->ܿ:I

    add-int/lit8 v8, v3, -0x1

    if-lt v7, v8, :cond_2

    add-int/lit8 v8, v4, 0x1

    if-le v7, v8, :cond_3

    .line 241
    :cond_2
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->removeAt(I)V

    .line 242
    invoke-direct {p0, v6}, Ll/ۚۛۜ;->֫(Ll/֡ۛۜ;)V

    :cond_3
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 245
    :cond_4
    iget v0, p0, Ll/ۚۛۜ;->᩶:I

    invoke-direct {p0, v0}, Ll/ۚۛۜ;->ᩳ(I)V

    move v0, v3

    :goto_1
    if-gt v0, v4, :cond_5

    .line 246
    invoke-direct {p0, v0}, Ll/ۚۛۜ;->ᩳ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    sub-int/2addr v3, v1

    .line 247
    invoke-direct {p0, v3}, Ll/ۚۛۜ;->ᩳ(I)V

    add-int/2addr v4, v1

    .line 248
    invoke-direct {p0, v4}, Ll/ۚۛۜ;->ᩳ(I)V

    .line 249
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->ܽ()V

    .line 250
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    iput-boolean v2, p0, Ll/ۚۛۜ;->ۘ֫:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v2, p0, Ll/ۚۛۜ;->ۘ֫:Z

    throw v0

    :cond_6
    :goto_2
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۚۛۜ;)Ll/ۡۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۚۛۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۛۜ;->ܰ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۚۛۜ;)Ll/ۗۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    return-object p0
.end method

.method private ᩳ(I)V
    .locals 10

    if-ltz p1, :cond_1

    .line 214
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v0}, Ll/ۡۛۜ;->֫()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 215
    :cond_0
    new-instance v1, Ll/֡ۛۜ;

    iget-object v2, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long v2, p1

    const-wide/16 v4, 0x1

    add-long v6, v2, v4

    iget-wide v2, p0, Ll/ۚۛۜ;->۟:J

    add-long v8, v2, v4

    iput-wide v8, p0, Ll/ۚۛۜ;->۟:J

    move-object v2, v1

    move-wide v3, v6

    move v5, p1

    move-wide v6, v8

    invoke-direct/range {v2 .. v7}, Ll/֡ۛۜ;-><init>(JIJ)V

    .line 216
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 217
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    iget-wide v1, v1, Ll/֡ۛۜ;->᩻:J

    invoke-virtual {v0, p1, v1, v2}, Ll/᩶᩺ۜ;->ۧ(IJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۚۛۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ۚۛۜ;->ۤ:I

    return-void
.end method

.method public static bridge synthetic ᩵(Ll/ۚۛۜ;)D
    .locals 2

    .line 0
    invoke-direct {p0}, Ll/ۚۛۜ;->᩷()D

    move-result-wide v0

    return-wide v0
.end method

.method private ᩷()D
    .locals 11

    .line 324
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 325
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v3, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr v0, v3

    float-to-double v3, v0

    .line 326
    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide v5

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v0}, Ll/ۡۛۜ;->ۧ()D

    move-result-wide v7

    sub-double/2addr v7, v3

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    .line 327
    invoke-virtual {v0}, Ll/ۡۛۜ;->֫()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-virtual {v0, v9}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v9

    sub-double/2addr v3, v9

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v9

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    add-double/2addr v0, v7

    .line 326
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static bridge synthetic ᩷(Ll/ۚۛۜ;)D
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    return-wide v0
.end method

.method public static bridge synthetic ᩻(Ll/ۚۛۜ;)Ll/ܰۨۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۛۜ;->ᩳ֫:Ll/ܰۨۜ;

    return-object p0
.end method

.method private ᩻()V
    .locals 6

    .line 478
    iget-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v0, v1}, Ll/ۡۛۜ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 479
    :cond_0
    iget-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    .line 480
    iget-object v1, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛۜ;

    const-string v2, "width"

    .line 481
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v4, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v3, v4}, Ll/ۡۛۜ;->᩻(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    const-string v2, "height"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v4, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v3, v4}, Ll/ۡۛۜ;->֫(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    if-eqz v1, :cond_2

    iget-object v2, v1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    if-eqz v2, :cond_2

    const-string v2, "orientation"

    .line 482
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iget-object v1, v1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 828
    iget-object v1, v1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v1, v1, Ll/ܶۨۜ;->ᩳ:I

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 486
    iput-boolean v1, p0, Ll/ۚۛۜ;->ۗ:Z

    const-string v1, "zoom"

    .line 487
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Ll/ۚۛۜ;->᩵֫:F

    .line 488
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const-string v2, "centerX"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float v2, v2, v3

    iget v3, p0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v2, v2, v3

    sub-float/2addr v1, v2

    iput v1, p0, Ll/ۚۛۜ;->ܺ֫:F

    .line 490
    new-instance v1, Ll/᩵ۛۜ;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    const-string v3, "fraction"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    const-string v5, "screenY"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    mul-float v0, v0, v5

    invoke-direct {v1, v2, v3, v4, v0}, Ll/᩵ۛۜ;-><init>(IDF)V

    invoke-direct {p0, v1}, Ll/ۚۛۜ;->֫(Ll/᩵ۛۜ;)V

    return-void

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 483
    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final computeScroll()V
    .locals 4

    .line 395
    iget-object v0, p0, Ll/ۚۛۜ;->ۜ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 396
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    iget v2, p0, Ll/ۚۛۜ;->۫:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Ll/ۚۛۜ;->ۤ:I

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-direct {p0, v1, v2}, Ll/ۚۛۜ;->֫(FF)V

    .line 397
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    iput v1, p0, Ll/ۚۛۜ;->۫:I

    .line 398
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    iput v0, p0, Ll/ۚۛۜ;->ۤ:I

    .line 399
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 426
    invoke-virtual {p0}, Ll/ۚۛۜ;->֫()V

    .line 427
    iget-object v0, p0, Ll/ۚۛۜ;->᩺:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۚۛۜ;->ۖ֫:Ll/ܺۛۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 428
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 275
    iget v2, v0, Ll/ۚۛۜ;->᩹:I

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 276
    iget-object v2, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-nez v2, :cond_0

    goto/16 :goto_7

    .line 277
    :cond_0
    iget v2, v0, Ll/ۚۛۜ;->᩹:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const v2, -0xbbbbbc

    goto :goto_0

    :cond_1
    const v2, -0x333334

    :goto_0
    iget-object v3, v0, Ll/ۚۛۜ;->᩷֫:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v2, 0x0

    .line 278
    :goto_1
    iget-object v4, v0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v2, v5, :cond_a

    .line 279
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ۛۜ;

    .line 280
    iget-object v5, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v6, v4, Ll/֡ۛۜ;->ܿ:I

    invoke-virtual {v5, v6}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v7

    iget-wide v9, v0, Ll/ۚۛۜ;->᩻֫:D

    sub-double/2addr v7, v9

    iget v5, v0, Ll/ۚۛۜ;->᩵֫:F

    float-to-double v9, v5

    mul-double v7, v7, v9

    double-to-float v5, v7

    .line 281
    iget-object v7, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v7, v6}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v7

    iget v9, v0, Ll/ۚۛۜ;->᩵֫:F

    float-to-double v9, v9

    mul-double v7, v7, v9

    double-to-float v7, v7

    add-float/2addr v7, v5

    .line 282
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/4 v9, 0x0

    cmpg-float v8, v5, v8

    if-gez v8, :cond_2

    cmpl-float v8, v7, v9

    if-lez v8, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 283
    :goto_2
    iget-object v10, v4, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    const/high16 v11, 0x40000000    # 2.0f

    if-nez v10, :cond_5

    if-eqz v8, :cond_4

    .line 284
    iget-object v10, v0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v10, v6}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v10

    if-nez v10, :cond_4

    .line 285
    iget-boolean v10, v4, Ll/֡ۛۜ;->֫:Z

    if-eqz v10, :cond_3

    iget v4, v4, Ll/֡ۛۜ;->ۧ:I

    goto :goto_3

    :cond_3
    const v4, 0x7f120528

    .line 286
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v10, v11

    .line 287
    invoke-static {v9, v5}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    invoke-static {v12, v7}, Ljava/lang/Math;->min(FF)F

    move-result v12

    add-float/2addr v12, v9

    div-float/2addr v12, v11

    .line 286
    invoke-virtual {v1, v4, v10, v12, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    const/high16 v4, 0x40000000    # 2.0f

    move-object/from16 v16, v3

    goto/16 :goto_5

    .line 290
    :cond_5
    iget-object v10, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v10, v6}, Ll/ۡۛۜ;->ܿ(I)D

    move-result-wide v12

    double-to-float v10, v12

    iget v12, v0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v10, v10, v12

    .line 291
    iget v12, v0, Ll/ۚۛۜ;->ܺ֫:F

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v13

    int-to-float v13, v13

    iget v14, v0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v13, v13, v14

    iget-object v14, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v14, v6}, Ll/ۡۛۜ;->᩻(I)I

    move-result v14

    int-to-float v14, v14

    mul-float v14, v14, v10

    sub-float/2addr v13, v14

    div-float/2addr v13, v11

    add-float/2addr v13, v12

    .line 292
    iget-object v11, v0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v11, v6}, Ll/ۡۛۜ;->ۧ(I)D

    move-result-wide v14

    double-to-float v11, v14

    iget v14, v0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v11, v11, v14

    add-float/2addr v11, v5

    iget-object v14, v0, Ll/ۚۛۜ;->ۡ֫:Landroid/graphics/Matrix;

    invoke-virtual {v14, v13, v11}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 293
    invoke-virtual {v14, v10, v10}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 294
    iget-object v11, v4, Ll/֡ۛۜ;->ᩳ:Landroid/graphics/Matrix;

    invoke-virtual {v14, v11}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 295
    iget-object v11, v0, Ll/ۚۛۜ;->ᩴ֫:Landroid/graphics/RectF;

    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz v8, :cond_6

    .line 296
    iget-object v13, v0, Ll/ۚۛۜ;->۬:Landroid/graphics/Matrix;

    invoke-virtual {v14, v13}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v15

    if-eqz v15, :cond_6

    .line 297
    invoke-static {v9, v5}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v15

    int-to-float v15, v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    invoke-static {v12, v7}, Ljava/lang/Math;->min(FF)F

    move-result v12

    move-object/from16 v16, v3

    const/4 v3, 0x0

    invoke-virtual {v11, v3, v9, v15, v12}, Landroid/graphics/RectF;->set(FFFF)V

    .line 298
    invoke-virtual {v13, v11}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    goto :goto_4

    :cond_6
    move-object/from16 v16, v3

    const/4 v3, 0x0

    .line 300
    :goto_4
    iget-object v9, v4, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    check-cast v9, Ll/ܶ᩺ۜ;

    invoke-virtual {v9, v11, v10, v8}, Ll/ܶ᩺ۜ;->֫(Landroid/graphics/RectF;FZ)V

    if-eqz v8, :cond_7

    .line 302
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v9

    .line 303
    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-float v12, v12

    invoke-static {v12, v7}, Ljava/lang/Math;->min(FF)F

    move-result v12

    invoke-virtual {v1, v3, v10, v11, v12}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 304
    invoke-virtual {v1, v14}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 305
    iget-object v3, v4, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    iget-object v4, v0, Ll/ۚۛۜ;->ۧ֫:Landroid/graphics/Paint;

    check-cast v3, Ll/ܶ᩺ۜ;

    invoke-virtual {v3, v1, v4}, Ll/ܶ᩺ۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 306
    invoke-virtual {v1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_7
    const/high16 v4, 0x40000000    # 2.0f

    :goto_5
    if-eqz v8, :cond_9

    .line 309
    iget-object v3, v0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v3, v6}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 383
    iget v3, v0, Ll/ۚۛۜ;->ܿ֫:I

    const/4 v6, 0x1

    if-le v3, v6, :cond_8

    goto :goto_6

    .line 310
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    const/4 v6, 0x0

    .line 311
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v10

    int-to-float v10, v10

    invoke-static {v10, v7}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-virtual {v1, v6, v8, v9, v10}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 312
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v8, v4

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    add-float/2addr v6, v5

    div-float/2addr v6, v4

    iget-object v4, v0, Ll/ۚۛۜ;->ᩳ֫:Ll/ܰۨۜ;

    invoke-virtual {v4, v1, v8, v6}, Ll/ܰۨۜ;->֫(Landroid/graphics/Canvas;FF)V

    .line 313
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_9
    :goto_6
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v16

    goto/16 :goto_1

    :cond_a
    :goto_7
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    .line 494
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 v0, 0x1

    .line 495
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 496
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    if-ltz v1, :cond_0

    invoke-virtual {v0, v1}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    new-instance v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 498
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f12069a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-direct {v0, v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 497
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 499
    :cond_0
    iget-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide v2

    cmpl-double v4, v0, v2

    if-lez v4, :cond_1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 500
    :cond_1
    iget-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-direct {p0}, Ll/ۚۛۜ;->᩷()D

    move-result-wide v2

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_2
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x14

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/16 v0, 0x5d

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x13

    if-eq p1, v0, :cond_2

    const/16 v0, 0x5c

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 517
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/16 p1, 0x2000

    .line 516
    invoke-virtual {p0, p1, v1}, Ll/ۚۛۜ;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_3
    :goto_1
    const/16 p1, 0x1000

    .line 514
    invoke-virtual {p0, p1, v1}, Ll/ۚۛۜ;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final onSizeChanged(IIII)V
    .locals 6

    .line 166
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 167
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/high16 v1, 0x40000000    # 2.0f

    if-lez p3, :cond_1

    if-lez p4, :cond_1

    int-to-float v2, p4

    div-float/2addr v2, v1

    .line 168
    invoke-direct {p0, v2}, Ll/ۚۛۜ;->֫(F)Ll/᩵ۛۜ;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance v2, Ll/᩵ۛۜ;

    iget v3, p0, Ll/ۚۛۜ;->᩶:I

    const-wide/16 v4, 0x0

    invoke-direct {v2, v3, v4, v5, v0}, Ll/᩵ۛۜ;-><init>(IDF)V

    .line 169
    :goto_0
    invoke-virtual {p0}, Ll/ۚۛۜ;->֫()V

    if-lez p3, :cond_2

    int-to-float p3, p3

    div-float v3, p3, v1

    .line 170
    iget v4, p0, Ll/ۚۛۜ;->ܺ֫:F

    sub-float/2addr v3, v4

    iget v4, p0, Ll/ۚۛۜ;->᩵֫:F

    mul-float p3, p3, v4

    div-float/2addr v3, p3

    goto :goto_1

    :cond_2
    const/high16 v3, 0x3f000000    # 0.5f

    .line 171
    :goto_1
    iget-object p3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p3, p1, v4, p2}, Ll/ۡۛۜ;->֫(IFI)V

    int-to-float p1, p1

    div-float p3, p1, v1

    mul-float v3, v3, p1

    .line 172
    iget p1, p0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v3, v3, p1

    sub-float/2addr p3, v3

    iput p3, p0, Ll/ۚۛۜ;->ܺ֫:F

    .line 173
    new-instance p1, Ll/᩵ۛۜ;

    iget p3, v2, Ll/᩵ۛۜ;->ۧ:I

    iget-wide v2, v2, Ll/᩵ۛۜ;->֫:D

    if-lez p4, :cond_3

    int-to-float p2, p2

    div-float v0, p2, v1

    :cond_3
    invoke-direct {p1, p3, v2, v3, v0}, Ll/᩵ۛۜ;-><init>(IDF)V

    invoke-direct {p0, p1}, Ll/ۚۛۜ;->֫(Ll/᩵ۛۜ;)V

    .line 174
    invoke-direct {p0}, Ll/ۚۛۜ;->᩻()V

    .line 175
    invoke-direct {p0}, Ll/ۚۛۜ;->ܺ()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 355
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 383
    :cond_0
    iget v0, p0, Ll/ۚۛۜ;->ܿ֫:I

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 357
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x3

    if-eq v3, v2, :cond_4

    if-ne v3, v4, :cond_2

    goto :goto_2

    .line 359
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    const/4 v6, 0x6

    if-ne v3, v6, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    sub-int/2addr v5, v6

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v5, 0x0

    :goto_3
    iput v5, p0, Ll/ۚۛۜ;->ܿ֫:I

    if-nez v3, :cond_5

    .line 361
    invoke-direct {p0}, Ll/ۚۛۜ;->ۡ()V

    .line 362
    iput-boolean v2, p0, Ll/ۚۛۜ;->ۢ֫:Z

    .line 363
    iput-boolean v1, p0, Ll/ۚۛۜ;->ܰ:Z

    .line 364
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    invoke-interface {v5, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 366
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-le v5, v2, :cond_6

    .line 367
    iput-boolean v2, p0, Ll/ۚۛۜ;->ܰ:Z

    .line 368
    invoke-direct {p0}, Ll/ۚۛۜ;->ۡ()V

    .line 370
    :cond_6
    iget-object v5, p0, Ll/ۚۛۜ;->ܳ֫:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v5, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 371
    iget-object v5, p0, Ll/ۚۛۜ;->ۙ:Landroid/view/GestureDetector;

    invoke-virtual {v5, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    if-eq v3, v2, :cond_7

    if-ne v3, v4, :cond_a

    .line 373
    :cond_7
    iput-boolean v1, p0, Ll/ۚۛۜ;->ۢ֫:Z

    .line 374
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_8
    if-ne v3, v4, :cond_9

    .line 375
    invoke-direct {p0}, Ll/ۚۛۜ;->ۡ()V

    .line 376
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 383
    :cond_a
    iget p1, p0, Ll/ۚۛۜ;->ܿ֫:I

    if-le p1, v2, :cond_b

    const/4 v1, 0x1

    :cond_b
    if-eq v0, v1, :cond_c

    .line 378
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_c
    return v2
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 421
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-nez p1, :cond_0

    .line 422
    invoke-virtual {p0}, Ll/ۚۛۜ;->֫()V

    :cond_0
    return-void
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    const/16 v0, 0x1000

    if-eq p1, v0, :cond_1

    const/16 v1, 0x2000

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 509
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    .line 505
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/ۚۛۜ;->ۡ()V

    .line 506
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    const v1, 0x3f4ccccd    # 0.8f

    mul-float p2, p2, v1

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    :goto_1
    int-to-float p1, p1

    mul-float p2, p2, p1

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Ll/ۚۛۜ;->֫(FF)V

    return v1
.end method

.method public final performClick()Z
    .locals 2

    .line 386
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 387
    iget-object v0, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    if-eqz v0, :cond_1

    .line 388
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    if-ltz v1, :cond_0

    invoke-virtual {v0, v1}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    invoke-interface {v0, v1}, Ll/ۗۛۜ;->ۧ(I)V

    goto :goto_0

    .line 389
    :cond_0
    iget-object v0, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    invoke-interface {v0}, Ll/ۗۛۜ;->֫()V

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ֫()V
    .locals 9

    .line 409
    invoke-direct {p0}, Ll/ۚۛۜ;->ۡ()V

    const/4 v0, 0x0

    .line 410
    iput-boolean v0, p0, Ll/ۚۛۜ;->ۢ֫:Z

    .line 411
    iput v0, p0, Ll/ۚۛۜ;->ܿ֫:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    .line 412
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    .line 413
    iget-object v2, p0, Ll/ۚۛۜ;->ۙ:Landroid/view/GestureDetector;

    invoke-virtual {v2, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 414
    iget-object v2, p0, Ll/ۚۛۜ;->ܳ֫:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2, v1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 415
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 416
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 417
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 1

    .line 265
    iget-object v0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۛۜ;

    .line 266
    invoke-direct {p0, v0, p3, p4}, Ll/ۚۛۜ;->֫(Ll/֡ۛۜ;J)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    .line 267
    iput-boolean p3, v0, Ll/֡ۛۜ;->֫:Z

    .line 268
    iput p2, v0, Ll/֡ۛۜ;->ۧ:I

    .line 269
    iget p2, p0, Ll/ۚۛۜ;->᩶:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    .line 270
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗۛۜ;)V
    .locals 0

    .line 125
    iput-object p1, p0, Ll/ۚۛۜ;->ۨ:Ll/ۗۛۜ;

    return-void
.end method

.method public final ֫(Ll/᩶᩺ۜ;I)V
    .locals 4

    .line 132
    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-lez v0, :cond_0

    if-ltz p2, :cond_0

    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 134
    invoke-virtual {p0}, Ll/ۚۛۜ;->ܿ()V

    .line 135
    iput-object p1, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    .line 137
    new-instance v0, Ll/ۡۛۜ;

    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۡۛۜ;-><init>(I)V

    iput-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v0, v1, v3, v2}, Ll/ۡۛۜ;->֫(IFI)V

    .line 139
    iput p2, p0, Ll/ۚۛۜ;->᩶:I

    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ۚۛۜ;->ۗ:Z

    .line 141
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v0, p2}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 142
    iget p2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {p1, p2}, Ll/᩶᩺ۜ;->ᩳ(I)V

    .line 143
    iget p1, p0, Ll/ۚۛۜ;->᩶:I

    invoke-direct {p0, p1}, Ll/ۚۛۜ;->ᩳ(I)V

    .line 144
    invoke-direct {p0}, Ll/ۚۛۜ;->ܺ()V

    return-void

    .line 133
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)Z
    .locals 6

    .line 120
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v0

    iget-wide v2, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Ll/ۚۛۜ;->᩵֫:F

    div-float/2addr v4, v5

    float-to-double v4, v4

    add-double/2addr v2, v4

    cmpg-double v4, v0, v2

    if-gez v4, :cond_0

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    .line 121
    invoke-virtual {v0, p1}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v0

    iget-object v2, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    invoke-virtual {v2, p1}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v2

    add-double/2addr v0, v2

    iget-wide v2, p0, Ll/ۚۛۜ;->᩻֫:D

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(IJLl/ۗۨۜ;)Z
    .locals 11

    .line 179
    move-object v0, p4

    check-cast v0, Ll/ܶ᩺ۜ;

    .line 826
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v2, v1, Ll/ܶۨۜ;->ۜ:I

    if-lez v2, :cond_6

    .line 827
    iget v2, v1, Ll/ܶۨۜ;->ۧ:I

    if-lez v2, :cond_6

    .line 828
    iget v1, v1, Ll/ܶۨۜ;->ᩳ:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_6

    const/16 v3, 0x8

    if-gt v1, v3, :cond_6

    .line 183
    iget-object v1, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛۜ;

    .line 184
    invoke-direct {p0, v1, p2, p3}, Ll/ۚۛۜ;->֫(Ll/֡ۛۜ;J)Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    return p3

    :cond_0
    const/4 p2, 0x0

    .line 185
    invoke-direct {p0, p2}, Ll/ۚۛۜ;->֫(F)Ll/᩵ۛۜ;

    move-result-object p2

    .line 186
    iget-wide v3, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide v5

    cmpl-double v7, v3, v5

    if-nez v7, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-wide v4, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-direct {p0}, Ll/ۚۛۜ;->᩷()D

    move-result-wide v6

    cmpl-double v8, v4, v6

    if-nez v8, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 187
    :goto_1
    iget-object v5, v1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    iget-object v6, v1, Ll/֡ۛۜ;->ۜ:[F

    .line 188
    iput-object p4, v1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    .line 189
    iput-boolean p3, v1, Ll/֡ۛۜ;->֫:Z

    .line 190
    iget-object p3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    .line 826
    iget-object v7, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v8, v7, Ll/ܶۨۜ;->ۜ:I

    .line 827
    iget v9, v7, Ll/ܶۨۜ;->ۧ:I

    .line 828
    iget v7, v7, Ll/ܶۨۜ;->ᩳ:I

    .line 190
    invoke-static {v8, v9, v7}, Ll/᩶ۗ֡;->ܽ(III)I

    move-result v7

    .line 826
    iget-object v8, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v9, v8, Ll/ܶۨۜ;->ۜ:I

    .line 827
    iget v10, v8, Ll/ܶۨۜ;->ۧ:I

    .line 828
    iget v8, v8, Ll/ܶۨۜ;->ᩳ:I

    .line 191
    invoke-static {v9, v10, v8}, Ll/᩶ۗ֡;->ۧ(III)I

    move-result v8

    .line 190
    invoke-virtual {p3, p1, v7, v8}, Ll/ۡۛۜ;->֫(III)V

    .line 826
    iget-object p1, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget p3, p1, Ll/ܶۨۜ;->ۜ:I

    .line 827
    iget v0, p1, Ll/ܶۨۜ;->ۧ:I

    .line 828
    iget p1, p1, Ll/ܶۨۜ;->ᩳ:I

    .line 192
    invoke-static {p3, v0, p1, v6}, Ll/᩶ۗ֡;->֫(III[F)V

    .line 193
    iget-object p1, v1, Ll/֡ۛۜ;->ᩳ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v6}, Landroid/graphics/Matrix;->setValues([F)V

    if-eqz v5, :cond_3

    if-eq v5, p4, :cond_3

    .line 194
    check-cast v5, Ll/ܶ᩺ۜ;

    invoke-virtual {v5}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 195
    :cond_3
    invoke-direct {p0, p2}, Ll/ۚۛۜ;->֫(Ll/᩵ۛۜ;)V

    .line 197
    iget-boolean p1, p0, Ll/ۚۛۜ;->ۗ:Z

    if-nez p1, :cond_5

    iget-object p1, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    if-nez p1, :cond_5

    if-eqz v3, :cond_4

    .line 198
    invoke-direct {p0}, Ll/ۚۛۜ;->ۢ()D

    move-result-wide p1

    iput-wide p1, p0, Ll/ۚۛۜ;->᩻֫:D

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    .line 199
    invoke-direct {p0}, Ll/ۚۛۜ;->᩷()D

    move-result-wide p1

    iput-wide p1, p0, Ll/ۚۛۜ;->᩻֫:D

    .line 201
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ۚۛۜ;->᩻()V

    .line 203
    iget-object p1, p0, Ll/ۚۛۜ;->᩺:Landroid/os/Handler;

    iget-object p2, p0, Ll/ۚۛۜ;->ۖ֫:Ll/ܺۛۜ;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 204
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 205
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    .line 180
    :cond_6
    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 181
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery renderer geometry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/os/Bundle;)Z
    .locals 8

    const/4 v0, 0x0

    .line 466
    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    if-eqz p1, :cond_2

    .line 467
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_2

    const-string v0, "continuous"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "fraction"

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    .line 468
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v0

    const-string v2, "zoom"

    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 469
    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    const-string v4, "centerX"

    invoke-virtual {p1, v4, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v4

    const-string v5, "screenY"

    .line 470
    invoke-virtual {p1, v5, v3}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v3

    const-wide/16 v5, 0x0

    cmpl-double v7, v0, v5

    if-ltz v7, :cond_2

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpg-double v7, v0, v5

    if-gtz v7, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, v2, v0

    if-ltz v1, :cond_2

    const/high16 v1, 0x40a00000    # 5.0f

    cmpg-float v1, v2, v1

    if-gtz v1, :cond_2

    const/4 v1, 0x0

    cmpl-float v2, v4, v1

    if-ltz v2, :cond_2

    cmpg-float v2, v4, v0

    if-gtz v2, :cond_2

    cmpl-float v1, v3, v1

    if-ltz v1, :cond_2

    cmpg-float v0, v3, v0

    if-lez v0, :cond_1

    goto :goto_0

    .line 472
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    .line 473
    invoke-direct {p0}, Ll/ۚۛۜ;->᩻()V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 126
    iget v0, p0, Ll/ۚۛۜ;->᩶:I

    return v0
.end method

.method public final ۧ(I)Z
    .locals 3

    .line 255
    iget-object v0, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛۜ;

    if-eqz v1, :cond_1

    .line 256
    iget-object v2, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    if-nez v2, :cond_0

    goto :goto_0

    .line 257
    :cond_0
    invoke-direct {p0, v1}, Ll/ۚۛۜ;->֫(Ll/֡ۛۜ;)V

    .line 258
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 259
    invoke-direct {p0, p1}, Ll/ۚۛۜ;->ᩳ(I)V

    .line 260
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Landroid/os/Bundle;
    .locals 10

    .line 448
    iget-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0

    .line 449
    :cond_0
    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۚۛۜ;->᩶:I

    if-ltz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v1, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v0, v1}, Ll/ۡۛۜ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 450
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "continuous"

    const/4 v2, 0x1

    .line 451
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 452
    iget-wide v1, p0, Ll/ۚۛۜ;->᩻֫:D

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Ll/ۚۛۜ;->᩵֫:F

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v4, v4, v5

    div-float/2addr v3, v4

    float-to-double v3, v3

    add-double/2addr v1, v3

    .line 453
    iget-object v3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v4, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v3, v4}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v3

    iget-object v6, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v7, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v6, v7}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v6

    iget-object v8, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v9, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v8, v9}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v8

    add-double/2addr v6, v8

    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    .line 454
    iget-object v3, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v4, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v3, v4}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v3

    sub-double v3, v1, v3

    iget-object v6, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v7, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v6, v7}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v6

    div-double/2addr v3, v6

    const-string v6, "fraction"

    invoke-virtual {v0, v6, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 455
    iget-wide v3, p0, Ll/ۚۛۜ;->᩻֫:D

    sub-double/2addr v1, v3

    iget v3, p0, Ll/ۚۛۜ;->᩵֫:F

    float-to-double v3, v3

    mul-double v1, v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-double v3, v3

    div-double/2addr v1, v3

    double-to-float v1, v1

    const-string v2, "screenY"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 456
    iget-object v1, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛۜ;

    if-eqz v1, :cond_2

    .line 457
    iget-object v1, v1, Ll/֡ۛۜ;->ܳ:Ll/ۗۨۜ;

    if-eqz v1, :cond_2

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 828
    iget-object v1, v1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v1, v1, Ll/ܶۨۜ;->ᩳ:I

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const-string v2, "orientation"

    .line 457
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "zoom"

    .line 458
    iget v2, p0, Ll/ۚۛۜ;->᩵֫:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 459
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v5

    iget v2, p0, Ll/ۚۛۜ;->ܺ֫:F

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ll/ۚۛۜ;->᩵֫:F

    mul-float v2, v2, v3

    div-float/2addr v1, v2

    const-string v2, "centerX"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 460
    iget-object v1, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v1, v2}, Ll/ۡۛۜ;->᩻(I)I

    move-result v1

    const-string v2, "width"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 461
    iget-object v1, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    iget v2, p0, Ll/ۚۛۜ;->᩶:I

    invoke-virtual {v1, v2}, Ll/ۡۛۜ;->֫(I)I

    move-result v1

    const-string v2, "height"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 127
    iput p1, p0, Ll/ۚۛۜ;->᩹:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۚۛۜ;->ۜ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚۛۜ;->֡֫:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()V
    .locals 4

    .line 432
    invoke-virtual {p0}, Ll/ۚۛۜ;->֫()V

    .line 433
    iget-object v0, p0, Ll/ۚۛۜ;->᩺:Landroid/os/Handler;

    iget-object v1, p0, Ll/ۚۛۜ;->ۖ֫:Ll/ܺۛۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 434
    iget-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۚۛۜ;->֫֫:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۛۜ;

    invoke-direct {p0, v3}, Ll/ۚۛۜ;->֫(Ll/֡ۛۜ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 435
    :cond_0
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    .line 436
    iput-object v0, p0, Ll/ۚۛۜ;->᩸:Ll/᩶᩺ۜ;

    .line 437
    iput-object v0, p0, Ll/ۚۛۜ;->ۛ:Ll/ۡۛۜ;

    const/4 v2, -0x1

    .line 438
    iput v2, p0, Ll/ۚۛۜ;->᩶:I

    .line 439
    iput-boolean v1, p0, Ll/ۚۛۜ;->ۗ:Z

    .line 440
    iput-object v0, p0, Ll/ۚۛۜ;->ܽ֫:Landroid/os/Bundle;

    const-wide/16 v0, 0x0

    .line 441
    iput-wide v0, p0, Ll/ۚۛۜ;->᩻֫:D

    const/high16 v0, 0x3f800000    # 1.0f

    .line 442
    iput v0, p0, Ll/ۚۛۜ;->᩵֫:F

    const/4 v0, 0x0

    .line 443
    iput v0, p0, Ll/ۚۛۜ;->ܺ֫:F

    .line 444
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 129
    iget-boolean v0, p0, Ll/ۚۛۜ;->ۢ֫:Z

    return v0
.end method
