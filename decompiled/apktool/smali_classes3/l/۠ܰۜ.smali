.class public final Ll/۠ܰۜ;
.super Ll/۬ۛۜ;
.source "S6MQ"


# static fields
.field public static final synthetic ᩳۧ:I


# instance fields
.field public final ֡֫:Landroid/graphics/Matrix;

.field public ֨֫:F

.field public final ֫֫:Ll/᩵ܰۜ;

.field public ֫ۧ:F

.field public ۖ֫:Ll/ۚܰۜ;

.field public ۗ:Ll/֡ܰۜ;

.field public ۗ֫:F

.field public final ۘ֫:Landroid/graphics/Paint;

.field public ۙ:I

.field public ۙ֫:F

.field public final ۚ֫:Landroid/widget/OverScroller;

.field public final ۛ:Landroid/graphics/Paint;

.field public ۛ֫:F

.field public final ۜ֫:F

.field public final ۟:Ll/᩵ܰۜ;

.field public ۟֫:F

.field public ۠֫:F

.field public ۡ֫:F

.field public final ۢ֫:F

.field public ۤ:I

.field public ۤ֫:F

.field public ۧ֫:F

.field public final ۧۧ:Landroid/graphics/RectF;

.field public ۨ:I

.field public ۨ֫:I

.field public final ۫:Landroid/graphics/Matrix;

.field public ۫֫:F

.field public ۬:J

.field public ۬֫:F

.field public ܰ:F

.field public ܰ֫:F

.field public final ܳ֫:Ll/᩹ܶ᩷;

.field public ܶ֫:F

.field public final ܺ֫:Ljava/util/ArrayList;

.field public ܽ֫:F

.field public final ܽۧ:Landroid/graphics/RectF;

.field public ܿ֫:Ll/ۗۛۜ;

.field public final ᩳ֫:Ll/ܳۨۜ;

.field public final ᩴ֫:Ll/ܰۨۜ;

.field public final ᩵֫:Landroid/graphics/Matrix;

.field public ᩶:Ll/ᩴܰۜ;

.field public ᩶֫:F

.field public ᩷֫:J

.field public ᩸:Ll/᩶᩺ۜ;

.field public ᩸֫:F

.field public ᩹:Z

.field public ᩹֫:F

.field public ᩺:Z

.field public ᩺֫:F

.field public final ᩻֫:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 80
    invoke-direct {p0, p1, p2}, Ll/۬ۛۜ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance p2, Ll/ܰۨۜ;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {p2, v0}, Ll/ܰۨۜ;-><init>(F)V

    iput-object p2, p0, Ll/۠ܰۜ;->ᩴ֫:Ll/ܰۨۜ;

    .line 34
    new-instance p2, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    .line 35
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Ll/۠ܰۜ;->ۛ:Landroid/graphics/Paint;

    .line 36
    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Ll/۠ܰۜ;->ۘ֫:Landroid/graphics/Paint;

    .line 37
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Ll/۠ܰۜ;->᩻֫:Landroid/graphics/Paint;

    .line 40
    new-instance v2, Ll/᩹ܶ᩷;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p0}, Ll/᩹ܶ᩷;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    .line 43
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/۠ܰۜ;->᩵֫:Landroid/graphics/Matrix;

    .line 44
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/۠ܰۜ;->֡֫:Landroid/graphics/Matrix;

    .line 45
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/۠ܰۜ;->۫:Landroid/graphics/Matrix;

    .line 46
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۠ܰۜ;->ܽۧ:Landroid/graphics/RectF;

    .line 47
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/۠ܰۜ;->ۧۧ:Landroid/graphics/RectF;

    .line 49
    new-instance v2, Ll/᩵ܰۜ;

    .line 772
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object v2, p0, Ll/۠ܰۜ;->۟:Ll/᩵ܰۜ;

    .line 50
    new-instance v2, Ll/᩵ܰۜ;

    .line 772
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object v2, p0, Ll/۠ܰۜ;->֫֫:Ll/᩵ܰۜ;

    const/4 v2, -0x1

    .line 55
    iput v2, p0, Ll/۠ܰۜ;->ۨ:I

    const/high16 v2, -0x1000000

    .line 57
    iput v2, p0, Ll/۠ܰۜ;->ۤ:I

    .line 60
    sget-object v2, Ll/ᩴܰۜ;->ۙ:Ll/ᩴܰۜ;

    iput-object v2, p0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41800000    # 16.0f

    mul-float v2, v2, v3

    iput v2, p0, Ll/۠ܰۜ;->ۢ֫:F

    .line 82
    new-instance v2, Landroid/widget/OverScroller;

    invoke-direct {v2, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/۠ܰۜ;->ۚ֫:Landroid/widget/OverScroller;

    .line 83
    new-instance v2, Ll/ܳۨۜ;

    invoke-direct {v2, p0}, Ll/ܳۨۜ;-><init>(Ll/۠ܰۜ;)V

    iput-object v2, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float v2, v2, v3

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 85
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41680000    # 14.5f

    mul-float v2, v2, p2

    .line 87
    iput v2, p0, Ll/۠ܰۜ;->ۜ֫:F

    const v2, 0x7f0400f3

    .line 17
    filled-new-array {v2}, [I

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 p1, 0x40400000    # 3.0f

    mul-float p2, p2, p1

    .line 91
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 93
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 94
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void

    :catchall_0
    move-exception p2

    .line 21
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 22
    throw p2
.end method

.method public static ֫(FFF)F
    .locals 0

    .line 768
    invoke-static {p1, p0, p2, p0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۨܰۜ;FD)F
    .locals 6

    float-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    .line 805
    invoke-virtual {p0}, Ll/ۨܰۜ;->ۜ()I

    move-result p1

    int-to-double v2, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double v4, v4, v2

    .line 806
    invoke-virtual {p0}, Ll/ۨܰۜ;->᩻()I

    move-result p0

    int-to-double p0, p0

    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double p2, p2, p0

    sub-double/2addr v4, p2

    mul-double v4, v4, v0

    double-to-float p0, v4

    return p0
.end method

.method private ֫(FI)I
    .locals 1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 654
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x41c00000    # 24.0f

    mul-float p1, p1, v0

    int-to-float p2, p2

    const v0, 0x3d23d70a    # 0.04f

    mul-float p2, p2, v0

    .line 653
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private ֫(Ll/ᩴܰۜ;FFI)V
    .locals 8

    .line 659
    invoke-virtual {p0}, Ll/۠ܰۜ;->ۡ()V

    .line 660
    iput-object p1, p0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 661
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    if-eqz v0, :cond_0

    .line 662
    iget-object v0, v0, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    invoke-virtual {v0}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/۠ܰۜ;->᩹:Z

    .line 663
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۠ܰۜ;->۬:J

    .line 664
    iput p4, p0, Ll/۠ܰۜ;->ۙ:I

    .line 665
    iget p4, p0, Ll/۠ܰۜ;->ۡ֫:F

    iput p4, p0, Ll/۠ܰۜ;->᩸֫:F

    .line 666
    iput p2, p0, Ll/۠ܰۜ;->ۛ֫:F

    .line 667
    iget p2, p0, Ll/۠ܰۜ;->ܰ:F

    iput p2, p0, Ll/۠ܰۜ;->ܶ֫:F

    .line 668
    iput p3, p0, Ll/۠ܰۜ;->ۤ֫:F

    .line 669
    iget-boolean p2, p0, Ll/۠ܰۜ;->᩹:Z

    if-eqz p2, :cond_4

    .line 670
    iget-object p2, p0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    iget-object p2, p2, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 671
    invoke-virtual {p2}, Ll/ۨܰۜ;->ᩴ()F

    move-result p3

    iput p3, p0, Ll/۠ܰۜ;->᩶֫:F

    invoke-virtual {p2}, Ll/ۨܰۜ;->᩵()F

    move-result p3

    iput p3, p0, Ll/۠ܰۜ;->ۙ֫:F

    invoke-virtual {p2}, Ll/ۨܰۜ;->֡()F

    move-result p3

    iput p3, p0, Ll/۠ܰۜ;->ۗ֫:F

    .line 672
    invoke-virtual {p2}, Ll/ۨܰۜ;->ۘ()F

    move-result p3

    iput p3, p0, Ll/۠ܰۜ;->᩹֫:F

    .line 674
    sget-object p4, Ll/ᩴܰۜ;->۫:Ll/ᩴܰۜ;

    if-eq p1, p4, :cond_2

    sget-object p4, Ll/ᩴܰۜ;->ۤ:Ll/ᩴܰۜ;

    if-ne p1, p4, :cond_1

    goto :goto_1

    .line 675
    :cond_1
    invoke-virtual {p2}, Ll/ۨܰۜ;->ᩳ()F

    move-result p1

    move v2, p1

    goto :goto_2

    :cond_2
    :goto_1
    move v2, p3

    :goto_2
    iput v2, p0, Ll/۠ܰۜ;->᩺֫:F

    .line 676
    iget v1, p0, Ll/۠ܰۜ;->᩶֫:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x3f000000    # 0.5f

    mul-float v3, p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float v4, p1, p3

    .line 677
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    mul-float v5, p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float v6, p1, p3

    const/4 v7, 0x1

    move-object v0, p2

    .line 676
    invoke-virtual/range {v0 .. v7}, Ll/ۨܰۜ;->֫(FFFFFFZ)V

    .line 678
    invoke-virtual {p2}, Ll/ۨܰۜ;->ᩴ()F

    move-result p1

    iput p1, p0, Ll/۠ܰۜ;->ܰ֫:F

    invoke-virtual {p2}, Ll/ۨܰۜ;->᩵()F

    move-result p1

    iput p1, p0, Ll/۠ܰۜ;->۟֫:F

    invoke-virtual {p2}, Ll/ۨܰۜ;->֡()F

    move-result p1

    iput p1, p0, Ll/۠ܰۜ;->֫ۧ:F

    .line 679
    iget p1, p0, Ll/۠ܰۜ;->᩹֫:F

    iget p3, p0, Ll/۠ܰۜ;->᩺֫:F

    cmpl-float p3, p1, p3

    if-eqz p3, :cond_3

    float-to-double p3, p1

    .line 680
    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p3

    iget p1, p0, Ll/۠ܰۜ;->᩺֫:F

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    .line 681
    iget p1, p0, Ll/۠ܰۜ;->ۙ֫:F

    iget v2, p0, Ll/۠ܰۜ;->᩶֫:F

    invoke-static {p2, v2, p3, p4}, Ll/۠ܰۜ;->֫(Ll/ۨܰۜ;FD)F

    move-result v2

    add-float/2addr p1, v2

    iput p1, p0, Ll/۠ܰۜ;->֨֫:F

    .line 682
    iget p1, p0, Ll/۠ܰۜ;->ۗ֫:F

    iget v2, p0, Ll/۠ܰۜ;->᩶֫:F

    invoke-static {p2, v2, p3, p4}, Ll/۠ܰۜ;->ۧ(Ll/ۨܰۜ;FD)F

    move-result p3

    add-float/2addr p1, p3

    iput p1, p0, Ll/۠ܰۜ;->۠֫:F

    .line 683
    iget p1, p0, Ll/۠ܰۜ;->۟֫:F

    iget p3, p0, Ll/۠ܰۜ;->ܰ֫:F

    invoke-static {p2, p3, v0, v1}, Ll/۠ܰۜ;->֫(Ll/ۨܰۜ;FD)F

    move-result p3

    add-float/2addr p1, p3

    iput p1, p0, Ll/۠ܰۜ;->۬֫:F

    .line 684
    iget p1, p0, Ll/۠ܰۜ;->֫ۧ:F

    iget p3, p0, Ll/۠ܰۜ;->ܰ֫:F

    invoke-static {p2, p3, v0, v1}, Ll/۠ܰۜ;->ۧ(Ll/ۨܰۜ;FD)F

    move-result p3

    add-float/2addr p1, p3

    iput p1, p0, Ll/۠ܰۜ;->۫֫:F

    .line 686
    :cond_3
    iget v1, p0, Ll/۠ܰۜ;->᩶֫:F

    iget v2, p0, Ll/۠ܰۜ;->᩹֫:F

    iget v3, p0, Ll/۠ܰۜ;->ۙ֫:F

    iget v4, p0, Ll/۠ܰۜ;->ۗ֫:F

    const/4 v5, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۨܰۜ;->֫(FFFFZ)V

    .line 688
    :cond_4
    iget-object p1, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {p1}, Ll/ܳۨۜ;->ᩳ()V

    .line 689
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method private ֫(Ll/֡ܰۜ;J)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 235
    iget v0, p1, Ll/֡ܰۜ;->᩻:I

    iget-wide v1, p1, Ll/֡ܰۜ;->ۡ:J

    cmp-long v3, v1, p2

    if-nez v3, :cond_0

    iget-object p2, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz p2, :cond_0

    .line 236
    invoke-virtual {p2}, Ll/᩶᩺ۜ;->֫()I

    move-result p2

    if-ge v0, p2, :cond_0

    iget-object p2, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long p2, v0

    const-wide/16 v0, 0x1

    add-long/2addr p2, v0

    iget-wide v0, p1, Ll/֡ܰۜ;->ܽ:J

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۖ()V
    .locals 3

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f12074d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/۠ܰۜ;->ۨ:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v2}, Ll/᩶᩺ۜ;->֫()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 429
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private ۘ()V
    .locals 9

    .line 297
    iget-object v0, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_4

    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    if-gez v0, :cond_0

    goto :goto_1

    .line 298
    :cond_0
    iget-object v0, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    .line 299
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܰۜ;

    .line 300
    iget v4, v3, Ll/֡ܰۜ;->᩻:I

    iget v5, p0, Ll/۠ܰۜ;->ۨ:I

    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-le v4, v2, :cond_2

    .line 301
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 302
    iget-object v4, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    .line 320
    iget-object v5, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    const/4 v6, 0x0

    .line 321
    iput-object v6, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-eqz v4, :cond_1

    .line 322
    iget v6, v3, Ll/֡ܰۜ;->᩻:I

    iget-wide v7, v3, Ll/֡ܰۜ;->ۡ:J

    invoke-virtual {v4, v6, v7, v8}, Ll/᩶᩺ۜ;->֫(IJ)V

    :cond_1
    if-eqz v5, :cond_2

    .line 323
    check-cast v5, Ll/ܶ᩺ۜ;

    invoke-virtual {v5}, Ll/ܶ᩺ۜ;->ۧ()V

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 306
    :cond_3
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ۜ(I)V

    .line 307
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    sub-int/2addr v0, v2

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ۜ(I)V

    .line 308
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ۜ(I)V

    :cond_4
    :goto_1
    return-void
.end method

.method private ۜ(I)V
    .locals 9

    .line 312
    iget-object v0, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 313
    :cond_0
    new-instance v0, Ll/֡ܰۜ;

    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long v1, p1

    const-wide/16 v3, 0x1

    add-long v5, v1, v3

    iget-wide v1, p0, Ll/۠ܰۜ;->᩷֫:J

    add-long v7, v1, v3

    iput-wide v7, p0, Ll/۠ܰۜ;->᩷֫:J

    move-object v1, v0

    move-wide v2, v5

    move v4, p1

    move-wide v5, v7

    invoke-direct/range {v1 .. v6}, Ll/֡ܰۜ;-><init>(JIJ)V

    .line 314
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v3, v0, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    invoke-virtual {v3, v1, v2}, Ll/ۨܰۜ;->ۧ(II)V

    .line 315
    iget-object v1, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    iget-wide v2, v0, Ll/֡ܰۜ;->ۡ:J

    invoke-virtual {v1, p1, v2, v3}, Ll/᩶᩺ۜ;->ۧ(IJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۧ(Ll/ۨܰۜ;FD)F
    .locals 6

    float-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    .line 810
    invoke-virtual {p0}, Ll/ۨܰۜ;->ۜ()I

    move-result p1

    int-to-double v2, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double v4, v4, v2

    .line 811
    invoke-virtual {p0}, Ll/ۨܰۜ;->᩻()I

    move-result p0

    int-to-double p0, p0

    invoke-static {p2, p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide p2

    mul-double p2, p2, p0

    add-double/2addr p2, v4

    mul-double p2, p2, v0

    double-to-float p0, p2

    return p0
.end method

.method private ܳ(I)Ll/֡ܰۜ;
    .locals 3

    const/4 v0, 0x0

    .line 327
    :goto_0
    iget-object v1, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 328
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܰۜ;

    iget v2, v2, Ll/֡ܰۜ;->᩻:I

    if-ne v2, p1, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܰۜ;

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ܺ()V
    .locals 9

    .line 154
    iget-object v0, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    iget-object v1, v0, Ll/ۚܰۜ;->ܽ:Ll/֨ܰۜ;

    .line 156
    iget v2, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v2}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    .line 157
    iget-object v4, v2, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 885
    iget-object v5, v0, Ll/ۚܰۜ;->֫:Ll/֡ܰۜ;

    if-ne v5, v2, :cond_5

    iget-wide v5, v0, Ll/ۚܰۜ;->ۧ:J

    iget-wide v7, v2, Ll/֡ܰۜ;->ۡ:J

    cmp-long v0, v5, v7

    if-nez v0, :cond_5

    .line 157
    invoke-direct {p0, v2, v5, v6}, Ll/۠ܰۜ;->֫(Ll/֡ܰۜ;J)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 161
    :cond_1
    iget-object v0, v2, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-nez v0, :cond_2

    goto :goto_0

    .line 162
    :cond_2
    invoke-virtual {v1, v2}, Ll/֨ܰۜ;->֫(Ll/֡ܰۜ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 163
    iput-object v3, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    return-void

    .line 166
    :cond_3
    invoke-virtual {v4}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_4

    :goto_0
    return-void

    .line 167
    :cond_4
    iput-object v3, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 168
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 169
    iget-object v0, v1, Ll/֨ܰۜ;->֫:Ll/ۛܰۜ;

    invoke-virtual {v4, v0}, Ll/ۨܰۜ;->֫(Ll/ۛܰۜ;)V

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 158
    :cond_5
    :goto_1
    iput-object v3, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    return-void
.end method

.method private ܿ(F)V
    .locals 1

    .line 397
    iput p1, p0, Ll/۠ܰۜ;->ܰ:F

    .line 398
    iget-object v0, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ᩳ(F)F

    move-result p1

    invoke-interface {v0, p1}, Ll/ۗۛۜ;->֫(F)V

    :cond_0
    return-void
.end method

.method private ᩳ(F)F
    .locals 2

    .line 346
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f266666    # 0.65f

    mul-float v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr p1, v0

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method

.method private ᩷(I)Z
    .locals 2

    .line 376
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 379
    iput-object v1, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 380
    invoke-virtual {p0}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 381
    invoke-virtual {v1}, Ll/ۨܰۜ;->᩸()V

    .line 383
    :cond_1
    iput p1, p0, Ll/۠ܰۜ;->ۨ:I

    const/4 v1, 0x0

    .line 384
    iput v1, p0, Ll/۠ܰۜ;->ۡ֫:F

    if-eqz v0, :cond_2

    .line 385
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ll/᩶᩺ۜ;->ᩳ(I)V

    .line 386
    :cond_2
    invoke-direct {p0}, Ll/۠ܰۜ;->ۘ()V

    .line 387
    invoke-direct {p0}, Ll/۠ܰۜ;->ۖ()V

    return v0
.end method

.method private ᩻(I)Z
    .locals 1

    .line 414
    iget-object v0, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    invoke-virtual {v0, p1}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final computeScroll()V
    .locals 23

    move-object/from16 v0, p0

    .line 694
    iget-object v1, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    sget-object v2, Ll/ᩴܰۜ;->ۙ:Ll/ᩴܰۜ;

    if-ne v1, v2, :cond_0

    goto/16 :goto_5

    .line 695
    :cond_0
    iget-object v1, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    iget v3, v0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {v0, v3}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v3

    if-eq v1, v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Ll/۠ܰۜ;->֫()V

    return-void

    .line 696
    :cond_1
    iget-object v1, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    sget-object v3, Ll/ᩴܰۜ;->᩶:Ll/ᩴܰۜ;

    const/4 v4, 0x0

    iget-object v5, v0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-ne v1, v3, :cond_7

    .line 697
    iget-object v1, v0, Ll/۠ܰۜ;->ۚ֫:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v3

    .line 698
    iget v9, v0, Ll/۠ܰۜ;->ۧ֫:F

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-nez v9, :cond_2

    iget v9, v0, Ll/۠ܰۜ;->ܽ֫:F

    cmpl-float v9, v9, v10

    if-nez v9, :cond_2

    const/4 v8, 0x0

    goto :goto_0

    .line 699
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    iget-wide v13, v0, Ll/۠ܰۜ;->۬:J

    sub-long/2addr v11, v13

    long-to-float v9, v11

    const/high16 v11, 0x435c0000    # 220.0f

    div-float/2addr v9, v11

    sub-float/2addr v8, v9

    .line 698
    invoke-static {v10, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    .line 700
    :goto_0
    iget-object v9, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    if-eqz v9, :cond_4

    .line 701
    iget-object v9, v9, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 702
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v19

    .line 703
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v15, v11, Landroid/util/DisplayMetrics;->density:F

    .line 704
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v12

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v13

    .line 705
    invoke-virtual {v9}, Ll/ۨܰۜ;->ܺ()F

    move-result v14

    invoke-virtual {v9}, Ll/ۨܰۜ;->᩷()F

    move-result v16

    .line 704
    iget-object v11, v0, Ll/۠ܰۜ;->۟:Ll/᩵ܰۜ;

    move/from16 v21, v15

    move/from16 v15, v16

    move/from16 v16, v21

    move-wide/from16 v17, v19

    invoke-virtual/range {v11 .. v18}, Ll/᩵ܰۜ;->֫(IIFFFJ)F

    move-result v22

    .line 706
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v12

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v13

    .line 707
    invoke-virtual {v9}, Ll/ۨܰۜ;->ۖ()F

    move-result v14

    invoke-virtual {v9}, Ll/ۨܰۜ;->ۢ()F

    move-result v15

    .line 706
    iget-object v11, v0, Ll/۠ܰۜ;->֫֫:Ll/᩵ܰۜ;

    invoke-virtual/range {v11 .. v18}, Ll/᩵ܰۜ;->֫(IIFFFJ)F

    move-result v1

    mul-float v11, v8, v8

    mul-float v11, v11, v8

    .line 709
    invoke-virtual {v9}, Ll/ۨܰۜ;->ᩴ()F

    move-result v12

    iget v13, v0, Ll/۠ܰۜ;->ۧ֫:F

    mul-float v13, v13, v11

    add-float v13, v13, v22

    iget v14, v0, Ll/۠ܰۜ;->ܽ֫:F

    mul-float v14, v14, v11

    add-float/2addr v14, v1

    if-nez v3, :cond_3

    cmpl-float v1, v8, v10

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v9, v12, v13, v14, v6}, Ll/ۨܰۜ;->֫(FFFZ)V

    :cond_4
    if-nez v3, :cond_6

    cmpl-float v1, v8, v10

    if-lez v1, :cond_5

    goto :goto_2

    .line 716
    :cond_5
    iput-object v2, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 717
    iput-object v4, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    .line 718
    invoke-virtual {v5, v7}, Ll/ܳۨۜ;->֫(Z)V

    return-void

    .line 713
    :cond_6
    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 721
    :cond_7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    iget-wide v11, v0, Ll/۠ܰۜ;->۬:J

    sub-long/2addr v9, v11

    long-to-float v1, v9

    iget v3, v0, Ll/۠ܰۜ;->ۙ:I

    int-to-float v3, v3

    div-float/2addr v1, v3

    invoke-static {v8, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    sub-float v3, v8, v1

    .line 724
    iget-object v9, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    sget-object v10, Ll/ᩴܰۜ;->ۤ:Ll/ᩴܰۜ;

    if-ne v9, v10, :cond_8

    mul-float v3, v1, v1

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v8, v8, v1

    const/high16 v9, 0x40400000    # 3.0f

    sub-float/2addr v9, v8

    mul-float v9, v9, v3

    goto :goto_3

    .line 727
    :cond_8
    sget-object v10, Ll/ᩴܰۜ;->ۗ:Ll/ᩴܰۜ;

    if-ne v9, v10, :cond_9

    mul-float v3, v3, v3

    sub-float v9, v8, v3

    goto :goto_3

    :cond_9
    mul-float v9, v3, v3

    mul-float v9, v9, v3

    sub-float v9, v8, v9

    .line 733
    :goto_3
    iget v3, v0, Ll/۠ܰۜ;->᩸֫:F

    iget v8, v0, Ll/۠ܰۜ;->ۛ֫:F

    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v3

    iput v3, v0, Ll/۠ܰۜ;->ۡ֫:F

    .line 734
    iget v3, v0, Ll/۠ܰۜ;->ܶ֫:F

    iget v8, v0, Ll/۠ܰۜ;->ۤ֫:F

    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v3

    invoke-direct {v0, v3}, Ll/۠ܰۜ;->ܿ(F)V

    .line 735
    iget-boolean v3, v0, Ll/۠ܰۜ;->᩹:Z

    if-eqz v3, :cond_b

    iget-object v3, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    if-eqz v3, :cond_b

    iget-object v3, v3, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    invoke-virtual {v3}, Ll/ۨܰۜ;->۠()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 736
    iget-object v3, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    iget-object v10, v3, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 737
    iget v3, v0, Ll/۠ܰۜ;->᩶֫:F

    iget v8, v0, Ll/۠ܰۜ;->ܰ֫:F

    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v11

    .line 738
    iget v3, v0, Ll/۠ܰۜ;->᩹֫:F

    iget v8, v0, Ll/۠ܰۜ;->᩺֫:F

    cmpl-float v12, v3, v8

    if-eqz v12, :cond_a

    .line 739
    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v12

    float-to-double v13, v12

    .line 740
    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v13

    .line 742
    iget v3, v0, Ll/۠ܰۜ;->֨֫:F

    iget v8, v0, Ll/۠ܰۜ;->۬֫:F

    .line 743
    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v3

    invoke-static {v10, v11, v13, v14}, Ll/۠ܰۜ;->֫(Ll/ۨܰۜ;FD)F

    move-result v8

    sub-float/2addr v3, v8

    iget v8, v0, Ll/۠ܰۜ;->۠֫:F

    const/high16 v16, 0x3f800000    # 1.0f

    iget v15, v0, Ll/۠ܰۜ;->۫֫:F

    .line 744
    invoke-static {v8, v15, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v8

    invoke-static {v10, v11, v13, v14}, Ll/۠ܰۜ;->ۧ(Ll/ۨܰۜ;FD)F

    move-result v9

    sub-float v14, v8, v9

    const/4 v15, 0x0

    move v13, v3

    .line 742
    invoke-virtual/range {v10 .. v15}, Ll/ۨܰۜ;->֫(FFFFZ)V

    goto :goto_4

    :cond_a
    const/high16 v16, 0x3f800000    # 1.0f

    .line 746
    iget v3, v0, Ll/۠ܰۜ;->ۙ֫:F

    iget v8, v0, Ll/۠ܰۜ;->۟֫:F

    invoke-static {v3, v8, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v3

    iget v8, v0, Ll/۠ܰۜ;->ۗ֫:F

    iget v12, v0, Ll/۠ܰۜ;->֫ۧ:F

    invoke-static {v8, v12, v9}, Ll/۠ܰۜ;->֫(FFF)F

    move-result v8

    invoke-virtual {v10, v11, v3, v8, v7}, Ll/ۨܰۜ;->֫(FFFZ)V

    goto :goto_4

    :cond_b
    const/high16 v16, 0x3f800000    # 1.0f

    .line 749
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    cmpg-float v1, v1, v16

    if-gez v1, :cond_c

    .line 750
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 751
    :cond_c
    iget-object v1, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 752
    iput-object v2, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 753
    iput-object v4, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    .line 754
    sget-object v2, Ll/ᩴܰۜ;->ۗ:Ll/ᩴܰۜ;

    if-ne v1, v2, :cond_d

    .line 755
    iget v1, v0, Ll/۠ܰۜ;->ۨ֫:I

    invoke-direct {v0, v1}, Ll/۠ܰۜ;->᩷(I)Z

    move-result v1

    .line 756
    invoke-virtual {v5, v7}, Ll/ܳۨۜ;->֫(Z)V

    if-eqz v1, :cond_f

    .line 757
    iget-object v1, v0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz v1, :cond_f

    iget v2, v0, Ll/۠ܰۜ;->ۨ:I

    invoke-interface {v1, v2}, Ll/ۗۛۜ;->֫(I)V

    return-void

    .line 759
    :cond_d
    sget-object v2, Ll/ᩴܰۜ;->۫:Ll/ᩴܰۜ;

    if-ne v1, v2, :cond_e

    const/4 v7, 0x1

    :cond_e
    invoke-virtual {v5, v7}, Ll/ܳۨۜ;->֫(Z)V

    .line 760
    sget-object v2, Ll/ᩴܰۜ;->᩹:Ll/ᩴܰۜ;

    if-ne v1, v2, :cond_f

    .line 761
    iput-boolean v6, v0, Ll/۠ܰۜ;->᩺:Z

    .line 762
    iget-object v1, v0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz v1, :cond_f

    invoke-interface {v1}, Ll/ۗۛۜ;->onDismiss()V

    :cond_f
    :goto_5
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 448
    iget-object v0, p0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 449
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 450
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    .line 465
    iget-object v11, v0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    invoke-virtual {v0, v11}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 466
    iget-boolean v1, v0, Ll/۠ܰۜ;->᩺:Z

    if-eqz v1, :cond_0

    goto/16 :goto_b

    .line 467
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v12

    .line 469
    iget v1, v0, Ll/۠ܰۜ;->ܰ:F

    invoke-direct {v0, v1}, Ll/۠ܰۜ;->ᩳ(F)F

    move-result v1

    .line 470
    iget v2, v0, Ll/۠ܰۜ;->ۤ:I

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v14, v3, v1

    mul-float v2, v2, v14

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 471
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v15

    .line 473
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v10, v4, v4, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 474
    iget v2, v0, Ll/۠ܰۜ;->ۤ:I

    const v3, 0xffffff

    and-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    invoke-virtual {v10, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 475
    iget v1, v0, Ll/۠ܰۜ;->ܰ:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    const/16 v16, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    const/16 v16, 0x0

    :goto_0
    if-eqz v16, :cond_2

    .line 476
    invoke-virtual {v0, v1}, Ll/۠ܰۜ;->ܽ(F)F

    move-result v1

    move v9, v1

    goto :goto_1

    :cond_2
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    :goto_1
    const-wide v17, 0x7fffffffffffffffL

    const/4 v1, 0x0

    move-wide/from16 v1, v17

    const/4 v8, 0x0

    .line 477
    :goto_2
    iget-object v3, v0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v5, v0, Ll/۠ܰۜ;->ۢ֫:F

    const-wide/16 v19, 0x0

    if-ge v8, v4, :cond_11

    .line 478
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܰۜ;

    .line 479
    iget v4, v3, Ll/֡ܰۜ;->᩻:I

    iget-object v7, v3, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    const/16 v21, 0x0

    iget v6, v0, Ll/۠ܰۜ;->ۨ:I

    if-ne v4, v6, :cond_3

    const/16 v23, 0x1

    move/from16 v24, v8

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/16 v23, 0x0

    move/from16 v24, v8

    const/4 v8, 0x0

    :goto_3
    sub-int/2addr v4, v6

    int-to-float v4, v4

    .line 349
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v6, v5

    mul-float v6, v6, v4

    .line 480
    iget v4, v0, Ll/۠ܰۜ;->ۡ֫:F

    add-float/2addr v6, v4

    if-eqz v16, :cond_4

    if-eqz v8, :cond_5

    .line 481
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v4, v6, v4

    if-gez v4, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v6

    cmpl-float v4, v4, v21

    if-lez v4, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 482
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    move-object/from16 v21, v11

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v11

    int-to-float v11, v11

    move/from16 v23, v15

    iget-object v15, v0, Ll/۠ܰۜ;->ܽۧ:Landroid/graphics/RectF;

    move/from16 v25, v14

    const/4 v14, 0x0

    invoke-virtual {v15, v14, v14, v5, v11}, Landroid/graphics/RectF;->set(FFFF)V

    if-eqz v4, :cond_6

    if-nez v16, :cond_6

    .line 483
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v15, v6, v14, v4, v5}, Landroid/graphics/RectF;->intersect(FFFF)Z

    move-result v4

    .line 484
    :cond_6
    iget-object v5, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-eqz v5, :cond_b

    invoke-virtual {v7}, Ll/ۨܰۜ;->۠()Z

    move-result v5

    if-eqz v5, :cond_b

    .line 487
    iget-object v5, v0, Ll/۠ܰۜ;->᩵֫:Landroid/graphics/Matrix;

    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    if-eqz v16, :cond_7

    .line 489
    iget v11, v0, Ll/۠ܰۜ;->ܰ:F

    const/4 v14, 0x0

    const/high16 v19, 0x3f000000    # 0.5f

    invoke-virtual {v5, v14, v11}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 490
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    mul-float v11, v11, v19

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v14

    int-to-float v14, v14

    mul-float v14, v14, v19

    invoke-virtual {v5, v9, v9, v11, v14}, Landroid/graphics/Matrix;->preScale(FFFF)Z

    .line 492
    :cond_7
    invoke-virtual {v7}, Ll/ۨܰۜ;->᩵()F

    move-result v11

    add-float/2addr v11, v6

    invoke-virtual {v7}, Ll/ۨܰۜ;->֡()F

    move-result v14

    invoke-virtual {v5, v11, v14}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 493
    invoke-virtual {v7}, Ll/ۨܰۜ;->ۘ()F

    move-result v11

    invoke-virtual {v5, v11}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 494
    invoke-virtual {v7}, Ll/ۨܰۜ;->ᩴ()F

    move-result v11

    invoke-virtual {v7}, Ll/ۨܰۜ;->ᩴ()F

    move-result v14

    invoke-virtual {v5, v11, v14}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 495
    iget-object v11, v3, Ll/֡ܰۜ;->ܳ:Landroid/graphics/Matrix;

    invoke-virtual {v5, v11}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 496
    iget-object v11, v0, Ll/۠ܰۜ;->ۧۧ:Landroid/graphics/RectF;

    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    if-eqz v4, :cond_8

    .line 497
    iget-object v14, v0, Ll/۠ܰۜ;->֡֫:Landroid/graphics/Matrix;

    invoke-virtual {v5, v14}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v19

    if-eqz v19, :cond_8

    .line 498
    invoke-virtual {v14, v11, v15}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 501
    :cond_8
    iget-object v14, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    invoke-virtual {v7}, Ll/ۨܰۜ;->ᩴ()F

    move-result v7

    mul-float v7, v7, v9

    check-cast v14, Ll/ܶ᩺ۜ;

    invoke-virtual {v14, v11, v7, v8}, Ll/ܶ᩺ۜ;->֫(Landroid/graphics/RectF;FZ)V

    if-nez v4, :cond_9

    goto/16 :goto_8

    .line 503
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    if-nez v16, :cond_a

    .line 505
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v7, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/4 v11, 0x0

    invoke-virtual {v10, v6, v11, v7, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 506
    :cond_a
    invoke-virtual {v10, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 507
    iget-object v3, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    iget-object v5, v0, Ll/۠ܰۜ;->ۛ:Landroid/graphics/Paint;

    check-cast v3, Ll/ܶ᩺ۜ;

    invoke-virtual {v3, v10, v5}, Ll/ܶ᩺ۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 508
    invoke-virtual {v10, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_8

    :cond_b
    const/high16 v5, 0x3f000000    # 0.5f

    if-eqz v4, :cond_10

    .line 509
    iget v4, v3, Ll/֡ܰۜ;->᩻:I

    invoke-direct {v0, v4}, Ll/۠ܰۜ;->᩻(I)Z

    move-result v4

    if-nez v4, :cond_10

    .line 511
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v11

    if-eqz v16, :cond_c

    .line 513
    iget v4, v0, Ll/۠ܰۜ;->ܰ:F

    const/4 v7, 0x0

    invoke-virtual {v10, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 514
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    mul-float v8, v8, v5

    invoke-virtual {v10, v9, v9, v4, v8}, Landroid/graphics/Canvas;->scale(FFFF)V

    goto :goto_5

    :cond_c
    const/4 v7, 0x0

    .line 516
    :goto_5
    invoke-virtual {v10, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    if-nez v16, :cond_d

    .line 517
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v10, v6, v6, v4, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    :cond_d
    const v4, -0x333334

    .line 518
    iget-object v5, v0, Ll/۠ܰۜ;->ۘ֫:Landroid/graphics/Paint;

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 519
    iget-boolean v4, v3, Ll/֡ܰۜ;->֫:Z

    if-eqz v4, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget v3, v3, Ll/֡ܰۜ;->ۧ:I

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v6

    invoke-virtual {v10, v3, v4, v7, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_6

    .line 521
    :cond_e
    iget-wide v3, v3, Ll/֡ܰۜ;->ᩳ:J

    sub-long v3, v12, v3

    const-wide/16 v5, 0xc8

    sub-long/2addr v3, v5

    cmp-long v5, v3, v19

    if-gez v5, :cond_f

    neg-long v3, v3

    .line 522
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :goto_6
    move-wide/from16 v26, v12

    move/from16 v15, v24

    move v12, v9

    goto :goto_7

    .line 524
    :cond_f
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v2

    long-to-float v2, v3

    const/high16 v6, 0x42f00000    # 120.0f

    div-float/2addr v2, v6

    const/high16 v6, 0x3f800000    # 1.0f

    .line 525
    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    const/high16 v6, 0x437f0000    # 255.0f

    mul-float v2, v2, v6

    mul-float v2, v2, v25

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v14, v0, Ll/۠ܰۜ;->᩻֫:Landroid/graphics/Paint;

    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 526
    iget v2, v0, Ll/۠ܰۜ;->ۜ֫:F

    sub-float v6, v1, v2

    sub-float v7, v5, v2

    add-float v8, v1, v2

    add-float/2addr v5, v2

    const-wide/16 v1, 0x384

    rem-long/2addr v3, v1

    long-to-float v1, v3

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v1, v1, v2

    const/high16 v2, 0x44610000    # 900.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x42b40000    # 90.0f

    sub-float v15, v1, v2

    const/high16 v22, 0x43700000    # 240.0f

    const/16 v26, 0x0

    move-object/from16 v1, p1

    move v2, v6

    move v3, v7

    move v4, v8

    move v6, v15

    move/from16 v7, v22

    move/from16 v15, v24

    move/from16 v8, v26

    move-wide/from16 v26, v12

    move v12, v9

    move-object v9, v14

    invoke-virtual/range {v1 .. v9}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    move-wide/from16 v1, v19

    .line 531
    :goto_7
    invoke-virtual {v10, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_9

    :cond_10
    :goto_8
    move-wide/from16 v26, v12

    move/from16 v15, v24

    move v12, v9

    :goto_9
    add-int/lit8 v8, v15, 0x1

    move v9, v12

    move-object/from16 v11, v21

    move/from16 v15, v23

    move/from16 v14, v25

    move-wide/from16 v12, v26

    goto/16 :goto_2

    :cond_11
    move v12, v9

    move-object/from16 v21, v11

    move/from16 v23, v15

    const/4 v4, 0x0

    .line 535
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_12
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܰۜ;

    .line 536
    iget-object v7, v0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {v7}, Ll/ܳۨۜ;->ۧ()Z

    move-result v7

    if-nez v7, :cond_12

    iget v6, v6, Ll/֡ܰۜ;->᩻:I

    invoke-direct {v0, v6}, Ll/۠ܰۜ;->᩻(I)Z

    move-result v7

    if-eqz v7, :cond_12

    if-eqz v16, :cond_13

    iget v7, v0, Ll/۠ܰۜ;->ۨ:I

    if-eq v6, v7, :cond_13

    goto :goto_a

    .line 537
    :cond_13
    iget v7, v0, Ll/۠ܰۜ;->ۨ:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    .line 349
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v7, v5

    mul-float v7, v7, v6

    .line 537
    iget v6, v0, Ll/۠ܰۜ;->ۡ֫:F

    add-float/2addr v7, v6

    .line 538
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    cmpl-float v6, v7, v6

    if-gez v6, :cond_12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v6, v7

    cmpg-float v6, v6, v4

    if-gtz v6, :cond_14

    goto :goto_a

    .line 539
    :cond_14
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    if-eqz v16, :cond_15

    .line 541
    iget v8, v0, Ll/۠ܰۜ;->ܰ:F

    invoke-virtual {v10, v4, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 542
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v11, v9

    invoke-virtual {v10, v12, v12, v8, v11}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 544
    :cond_15
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v8, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v10, v7, v4, v8, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 545
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    add-float/2addr v8, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v9

    iget-object v11, v0, Ll/۠ܰۜ;->ᩴ֫:Ll/ܰۨۜ;

    invoke-virtual {v11, v10, v8, v7}, Ll/ܰۨۜ;->֫(Landroid/graphics/Canvas;FF)V

    .line 546
    invoke-virtual {v10, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_a

    :cond_16
    move/from16 v6, v23

    .line 548
    invoke-virtual {v10, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    cmp-long v3, v1, v17

    if-eqz v3, :cond_18

    .line 549
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v3

    if-nez v3, :cond_18

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isShown()Z

    move-result v3

    if-eqz v3, :cond_18

    cmp-long v3, v1, v19

    if-nez v3, :cond_17

    move-object/from16 v3, v21

    .line 550
    invoke-virtual {v0, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    :cond_17
    move-object/from16 v3, v21

    .line 551
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_18
    :goto_b
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    .line 816
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 v0, 0x1

    .line 817
    invoke-virtual {p0, v0}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v1

    const/4 v2, -0x1

    if-nez v1, :cond_1

    invoke-virtual {p0, v2}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 818
    iget v1, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v1}, Ll/۠ܰۜ;->᩻(I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 819
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f12069a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-direct {v1, v4, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 818
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 820
    :cond_2
    invoke-virtual {p0, v0}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 821
    :cond_3
    invoke-virtual {p0, v2}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_4
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/16 v0, 0x16

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x15

    if-ne p1, v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 840
    invoke-virtual {p0, v0}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 841
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 842
    invoke-virtual {p0, v0}, Ll/۠ܰۜ;->ܿ(I)V

    return v1

    :cond_2
    const/16 v0, 0x51

    if-eq p1, v0, :cond_4

    const/16 v0, 0x46

    if-eq p1, v0, :cond_4

    const/16 v0, 0x45

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 850
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 846
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 847
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p2

    invoke-virtual {p0, p1, v0}, Ll/۠ܰۜ;->ܽ(FF)V

    return v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 435
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 436
    iget-object p3, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֡ܰۜ;

    iget-object p4, p4, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    invoke-virtual {p4, p1, p2}, Ll/ۨܰۜ;->ۧ(II)V

    goto :goto_0

    .line 437
    :cond_0
    invoke-direct {p0}, Ll/۠ܰۜ;->ܺ()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 455
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    if-ltz v0, :cond_3

    iget-boolean v0, p0, Ll/۠ܰۜ;->᩺:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 456
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 457
    :cond_1
    iget-object v0, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {v0}, Ll/ܳۨۜ;->ۧ()Z

    move-result v1

    .line 458
    invoke-virtual {v0, p1}, Ll/ܳۨۜ;->֫(Landroid/view/MotionEvent;)V

    .line 459
    invoke-virtual {v0}, Ll/ܳۨۜ;->ۧ()Z

    move-result p1

    const/4 v0, 0x1

    if-eq v1, p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 442
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-nez p1, :cond_0

    .line 443
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    :cond_0
    return-void
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 3

    .line 826
    iget-boolean v0, p0, Ll/۠ܰۜ;->᩺:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x1000

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2000

    if-ne p1, v0, :cond_2

    const/4 v1, -0x1

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 829
    invoke-virtual {p0, v1}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 830
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 831
    invoke-virtual {p0, v1}, Ll/۠ܰۜ;->ܿ(I)V

    return v2

    .line 834
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final performClick()Z
    .locals 2

    .line 419
    iget-boolean v0, p0, Ll/۠ܰۜ;->᩺:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 420
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 421
    iget-object v0, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz v0, :cond_2

    .line 422
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->᩻(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    iget v1, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-interface {v0, v1}, Ll/ۗۛۜ;->ۧ(I)V

    goto :goto_0

    .line 423
    :cond_1
    iget-object v0, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    invoke-interface {v0}, Ll/ۗۛۜ;->֫()V

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Landroid/graphics/RectF;)F
    .locals 9

    .line 561
    iget-object v0, p0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 563
    :cond_0
    iget-object v2, p0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    sget-object v3, Ll/ᩴܰۜ;->ۤ:Ll/ᩴܰۜ;

    if-ne v2, v3, :cond_1

    iget-boolean v3, p0, Ll/۠ܰۜ;->᩹:Z

    if-eqz v3, :cond_1

    .line 564
    iget v0, p0, Ll/۠ܰۜ;->ܰ֫:F

    iget v2, p0, Ll/۠ܰۜ;->۟֫:F

    iget v3, p0, Ll/۠ܰۜ;->֫ۧ:F

    iget v4, p0, Ll/۠ܰۜ;->᩺֫:F

    goto :goto_0

    .line 565
    :cond_1
    sget-object v3, Ll/ᩴܰۜ;->᩶:Ll/ᩴܰۜ;

    if-ne v2, v3, :cond_3

    .line 566
    iget-object v0, v0, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    .line 567
    invoke-virtual {v0}, Ll/ۨܰۜ;->ᩴ()F

    move-result v2

    invoke-virtual {v0}, Ll/ۨܰۜ;->ۘ()F

    move-result v4

    .line 569
    invoke-virtual {v0}, Ll/ۨܰۜ;->ܺ()F

    move-result v3

    invoke-virtual {v0}, Ll/ۨܰۜ;->᩷()F

    move-result v5

    iget-object v6, p0, Ll/۠ܰۜ;->ۚ֫:Landroid/widget/OverScroller;

    invoke-virtual {v6}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v7

    int-to-float v7, v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 570
    invoke-virtual {v0}, Ll/ۨܰۜ;->ۖ()F

    move-result v5

    invoke-virtual {v0}, Ll/ۨܰۜ;->ۢ()F

    move-result v0

    invoke-virtual {v6}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v6

    int-to-float v6, v6

    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    move v8, v3

    move v3, v0

    move v0, v2

    move v2, v8

    .line 572
    :goto_0
    iget-object v5, p0, Ll/۠ܰۜ;->۫:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 573
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 574
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 575
    iget-object v2, p0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    iget-object v2, v2, Ll/֡ܰۜ;->ܳ:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 576
    iget-object v2, p0, Ll/۠ܰۜ;->֡֫:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v3

    if-nez v3, :cond_2

    return v1

    .line 577
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1, v1, v1, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 578
    invoke-virtual {v2, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    return v0

    :cond_3
    return v1
.end method

.method public final ֫()V
    .locals 1

    .line 270
    invoke-virtual {p0}, Ll/۠ܰۜ;->ۡ()V

    .line 271
    iget-object v0, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {v0}, Ll/ܳۨۜ;->֫()V

    .line 273
    iget-boolean v0, p0, Ll/۠ܰۜ;->᩺:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 274
    iput v0, p0, Ll/۠ܰۜ;->ۡ֫:F

    .line 275
    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ܿ(F)V

    .line 276
    invoke-virtual {p0}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {v0}, Ll/ۨܰۜ;->֫()V

    .line 279
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 402
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/۠ܰۜ;->ܰ:F

    add-float/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ܿ(F)V

    .line 403
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(FF)V
    .locals 20

    move-object/from16 v0, p0

    .line 622
    invoke-virtual/range {p0 .. p0}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 623
    invoke-virtual {v1}, Ll/ۨܰۜ;->۠()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_4

    .line 625
    :cond_0
    invoke-virtual {v1}, Ll/ۨܰۜ;->ۘ()F

    move-result v3

    invoke-virtual {v1}, Ll/ۨܰۜ;->ᩳ()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ll/۠ܰۜ;->֫(Z)V

    return-void

    .line 626
    :cond_1
    invoke-virtual {v1}, Ll/ۨܰۜ;->ᩴ()F

    move-result v3

    invoke-virtual {v1}, Ll/ۨܰۜ;->᩵()F

    move-result v4

    invoke-virtual {v1}, Ll/ۨܰۜ;->֡()F

    move-result v5

    .line 627
    invoke-virtual {v1}, Ll/ۨܰۜ;->ۧ()V

    .line 628
    invoke-virtual {v1}, Ll/ۨܰۜ;->ᩴ()F

    move-result v6

    sub-float v6, v3, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const v7, 0x38d1b717    # 1.0E-4f

    cmpl-float v6, v6, v7

    if-lez v6, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    .line 629
    :goto_0
    invoke-virtual {v1}, Ll/ۨܰۜ;->᩵()F

    move-result v7

    invoke-virtual {v1}, Ll/ۨܰۜ;->֡()F

    move-result v8

    .line 630
    invoke-virtual {v1, v3, v4, v5, v2}, Ll/ۨܰۜ;->֫(FFFZ)V

    if-eqz v6, :cond_3

    .line 631
    invoke-virtual {v0, v2}, Ll/۠ܰۜ;->֫(Z)V

    return-void

    .line 632
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/۠ܰۜ;->ۡ()V

    sub-float/2addr v4, v7

    .line 633
    iput v4, v0, Ll/۠ܰۜ;->ۧ֫:F

    sub-float/2addr v5, v8

    .line 634
    iput v5, v0, Ll/۠ܰۜ;->ܽ֫:F

    .line 636
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v3, 0x0

    const v4, 0x3dcccccd    # 0.1f

    cmpl-float v2, v2, v4

    if-gtz v2, :cond_5

    invoke-virtual {v1}, Ll/ۨܰۜ;->ܺ()F

    move-result v2

    invoke-virtual {v1}, Ll/ۨܰۜ;->᩷()F

    move-result v5

    cmpl-float v2, v2, v5

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    move/from16 v2, p1

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v2, 0x0

    .line 637
    :goto_2
    iget v5, v0, Ll/۠ܰۜ;->ܽ֫:F

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpl-float v4, v5, v4

    if-gtz v4, :cond_7

    invoke-virtual {v1}, Ll/ۨܰۜ;->ۖ()F

    move-result v4

    invoke-virtual {v1}, Ll/ۨܰۜ;->ۢ()F

    move-result v5

    cmpl-float v4, v4, v5

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v3, p2

    .line 638
    :cond_7
    :goto_3
    sget-object v4, Ll/ᩴܰۜ;->᩶:Ll/ᩴܰۜ;

    iput-object v4, v0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    .line 639
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Ll/۠ܰۜ;->۬:J

    .line 640
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget-wide v5, v0, Ll/۠ܰۜ;->۬:J

    iget-object v9, v0, Ll/۠ܰۜ;->۟:Ll/᩵ܰۜ;

    invoke-virtual {v9, v4, v2, v5, v6}, Ll/᩵ܰۜ;->֫(IFJ)V

    .line 641
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget-wide v5, v0, Ll/۠ܰۜ;->۬:J

    iget-object v9, v0, Ll/۠ܰۜ;->֫֫:Ll/᩵ܰۜ;

    invoke-virtual {v9, v4, v3, v5, v6}, Ll/᩵ܰۜ;->֫(IFJ)V

    .line 642
    iget v4, v0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {v0, v4}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v4

    iput-object v4, v0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    .line 643
    iget-object v4, v0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {v4}, Ll/ܳۨۜ;->ᩳ()V

    .line 644
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v10

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v11

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v12

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v13

    .line 645
    invoke-virtual {v1}, Ll/ۨܰۜ;->ܺ()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v14

    invoke-virtual {v1}, Ll/ۨܰۜ;->᩷()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v15

    .line 646
    invoke-virtual {v1}, Ll/ۨܰۜ;->ۖ()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v16

    invoke-virtual {v1}, Ll/ۨܰۜ;->ۢ()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v17

    .line 647
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-direct {v0, v2, v1}, Ll/۠ܰۜ;->֫(FI)I

    move-result v18

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {v0, v3, v1}, Ll/۠ܰۜ;->֫(FI)I

    move-result v19

    .line 644
    iget-object v9, v0, Ll/۠ܰۜ;->ۚ֫:Landroid/widget/OverScroller;

    invoke-virtual/range {v9 .. v19}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 648
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 623
    :cond_8
    :goto_4
    invoke-virtual {v0, v2}, Ll/۠ܰۜ;->֫(Z)V

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 3

    .line 259
    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 260
    iget-wide v0, p1, Ll/֡ܰۜ;->ۡ:J

    cmp-long v2, v0, p3

    if-nez v2, :cond_0

    const/4 p3, 0x1

    .line 261
    iput-boolean p3, p1, Ll/֡ܰۜ;->֫:Z

    .line 262
    iput p2, p1, Ll/֡ܰۜ;->ۧ:I

    .line 263
    iget-object p1, p0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 264
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗۛۜ;)V
    .locals 0

    .line 117
    iput-object p1, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    return-void
.end method

.method public final ֫(Ll/᩶᩺ۜ;I)V
    .locals 1

    .line 100
    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-lez v0, :cond_0

    if-ltz p2, :cond_3

    .line 101
    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-ge p2, v0, :cond_3

    .line 104
    :cond_0
    invoke-virtual {p0}, Ll/۠ܰۜ;->ܿ()V

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/۠ܰۜ;->᩺:Z

    const/4 v0, 0x0

    .line 106
    iput v0, p0, Ll/۠ܰۜ;->ۡ֫:F

    .line 107
    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ܿ(F)V

    .line 108
    iput-object p1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    .line 109
    invoke-virtual {p1}, Ll/᩶᩺ۜ;->֫()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p2, -0x1

    :cond_1
    iput p2, p0, Ll/۠ܰۜ;->ۨ:I

    if-ltz p2, :cond_2

    .line 110
    invoke-virtual {p1, p2}, Ll/᩶᩺ۜ;->ᩳ(I)V

    .line 111
    :cond_2
    invoke-direct {p0}, Ll/۠ܰۜ;->ۘ()V

    .line 112
    invoke-direct {p0}, Ll/۠ܰۜ;->ۖ()V

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 102
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 601
    sget-object v0, Ll/ᩴܰۜ;->۫:Ll/ᩴܰۜ;

    goto :goto_0

    :cond_0
    sget-object v0, Ll/ᩴܰۜ;->۬:Ll/ᩴܰۜ;

    :goto_0
    if-eqz p1, :cond_1

    const/16 p1, 0x78

    goto :goto_1

    :cond_1
    const/16 p1, 0xdc

    :goto_1
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v1, p1}, Ll/۠ܰۜ;->֫(Ll/ᩴܰۜ;FFI)V

    return-void
.end method

.method public final ֫(IJLl/ۗۨۜ;)Z
    .locals 9

    if-eqz p4, :cond_7

    .line 201
    move-object v0, p4

    check-cast v0, Ll/ܶ᩺ۜ;

    .line 826
    iget-object v1, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v2, v1, Ll/ܶۨۜ;->ۜ:I

    .line 827
    iget v3, v1, Ll/ܶۨۜ;->ۧ:I

    .line 828
    iget v1, v1, Ll/ܶۨۜ;->ᩳ:I

    if-lez v2, :cond_6

    if-lez v3, :cond_6

    const/4 v4, 0x1

    if-lt v1, v4, :cond_6

    const/16 v5, 0x8

    if-gt v1, v5, :cond_6

    .line 207
    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v5

    .line 208
    invoke-direct {p0, v5, p2, p3}, Ll/۠ܰۜ;->֫(Ll/֡ܰۜ;J)Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 209
    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    return p3

    .line 212
    :cond_0
    invoke-static {v2, v3, v1}, Ll/᩶ۗ֡;->ܽ(III)I

    move-result p2

    .line 213
    invoke-static {v2, v3, v1}, Ll/᩶ۗ֡;->ۧ(III)I

    move-result v0

    .line 214
    iget-object v6, v5, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    iget-object v7, v5, Ll/֡ܰۜ;->ܿ:[F

    invoke-virtual {v6}, Ll/ۨܰۜ;->ۜ()I

    move-result v8

    if-ne v8, p2, :cond_1

    invoke-virtual {v6}, Ll/ۨܰۜ;->᩻()I

    move-result v8

    if-eq v8, v0, :cond_4

    .line 216
    :cond_1
    iget v8, p0, Ll/۠ܰۜ;->ۨ:I

    if-ne p1, v8, :cond_2

    invoke-virtual {v6}, Ll/ۨܰۜ;->۠()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    goto :goto_0

    .line 217
    :cond_2
    iget v8, p0, Ll/۠ܰۜ;->ۨ:I

    if-ne p1, v8, :cond_3

    iget-object p1, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {p1}, Ll/ܳۨۜ;->ܿ()V

    .line 218
    :cond_3
    :goto_0
    invoke-virtual {v6, p2, v0}, Ll/ۨܰۜ;->֫(II)V

    .line 220
    :cond_4
    iget-object p1, v5, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 221
    iput-object p4, v5, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 222
    iput-boolean p3, v5, Ll/֡ܰۜ;->֫:Z

    .line 223
    iget-object p2, p0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    invoke-virtual {p0, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 224
    iput v2, v5, Ll/֡ܰۜ;->᩷:I

    .line 225
    iput v3, v5, Ll/֡ܰۜ;->ۜ:I

    .line 226
    invoke-static {v2, v3, v1, v7}, Ll/᩶ۗ֡;->֫(III[F)V

    .line 227
    iget-object p2, v5, Ll/֡ܰۜ;->ܳ:Landroid/graphics/Matrix;

    invoke-virtual {p2, v7}, Landroid/graphics/Matrix;->setValues([F)V

    if-eqz p1, :cond_5

    if-eq p1, p4, :cond_5

    .line 228
    check-cast p1, Ll/ܶ᩺ۜ;

    invoke-virtual {p1}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 229
    :cond_5
    invoke-direct {p0}, Ll/۠ܰۜ;->ܺ()V

    .line 230
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v4

    .line 204
    :cond_6
    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 205
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery renderer geometry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 200
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing gallery renderer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/os/Bundle;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 143
    iput-object v2, v0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 144
    iget v3, v0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {v0, v3}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v3

    const/4 v4, 0x1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    const-string v5, "version"

    .line 921
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    if-eq v5, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "width"

    .line 922
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v5, "height"

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v6, "orientation"

    .line 923
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v6

    if-lez v2, :cond_3

    if-lez v5, :cond_3

    if-lt v6, v4, :cond_3

    const/16 v7, 0x8

    if-le v6, v7, :cond_2

    goto :goto_0

    .line 925
    :cond_2
    new-instance v7, Ll/ۛܰۜ;

    .line 926
    invoke-static {v2, v5, v6}, Ll/᩶ۗ֡;->ܽ(III)I

    move-result v9

    .line 927
    invoke-static {v2, v5, v6}, Ll/᩶ۗ֡;->ۧ(III)I

    move-result v10

    const-string v8, "relativeScale"

    const-wide/high16 v11, 0x7ff8000000000000L    # Double.NaN

    .line 928
    invoke-virtual {v1, v8, v11, v12}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v13

    const-string v8, "centerX"

    invoke-virtual {v1, v8, v11, v12}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v15

    const-string v8, "centerY"

    .line 929
    invoke-virtual {v1, v8, v11, v12}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v17

    const-string v8, "rotation"

    const/high16 v11, 0x7fc00000    # Float.NaN

    invoke-virtual {v1, v8, v11}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    move-object v8, v7

    move-wide v11, v13

    move-wide v13, v15

    move-wide/from16 v15, v17

    move/from16 v17, v1

    invoke-direct/range {v8 .. v17}, Ll/ۛܰۜ;-><init>(IIDDDF)V

    .line 930
    invoke-virtual {v7}, Ll/ۛܰۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ll/֨ܰۜ;

    invoke-direct {v1, v2, v5, v6, v7}, Ll/֨ܰۜ;-><init>(IIILl/ۛܰۜ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v1

    goto :goto_1

    :catch_0
    :cond_3
    :goto_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v3, :cond_6

    .line 146
    iget-wide v5, v3, Ll/֡ܰۜ;->ۡ:J

    invoke-direct {v0, v3, v5, v6}, Ll/۠ܰۜ;->֫(Ll/֡ܰۜ;J)Z

    move-result v1

    if-eqz v1, :cond_6

    if-nez v2, :cond_4

    goto :goto_2

    .line 147
    :cond_4
    iget-object v1, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-eqz v1, :cond_5

    invoke-virtual {v2, v3}, Ll/֨ܰۜ;->֫(Ll/֡ܰۜ;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    .line 148
    :cond_5
    new-instance v1, Ll/ۚܰۜ;

    invoke-direct {v1, v3, v2}, Ll/ۚܰۜ;-><init>(Ll/֡ܰۜ;Ll/֨ܰۜ;)V

    iput-object v1, v0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 149
    invoke-direct/range {p0 .. p0}, Ll/۠ܰۜ;->ܺ()V

    return v4

    :cond_6
    :goto_2
    const/4 v1, 0x0

    return v1
.end method

.method public final ۜ()F
    .locals 1

    .line 339
    iget v0, p0, Ll/۠ܰۜ;->ܰ:F

    return v0
.end method

.method public final ۡ()V
    .locals 2

    .line 583
    sget-object v0, Ll/ᩴܰۜ;->ۙ:Ll/ᩴܰۜ;

    iput-object v0, p0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    const/4 v0, 0x0

    .line 584
    iput-object v0, p0, Ll/۠ܰۜ;->ۗ:Ll/֡ܰۜ;

    .line 585
    iget-object v0, p0, Ll/۠ܰۜ;->ۚ֫:Landroid/widget/OverScroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    return-void
.end method

.method public final ۢ()V
    .locals 1

    const/4 v0, 0x0

    .line 392
    iput v0, p0, Ll/۠ܰۜ;->ۡ֫:F

    .line 393
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 121
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    return v0
.end method

.method public final ۧ(F)V
    .locals 5

    .line 357
    iget v0, p0, Ll/۠ܰۜ;->ۡ֫:F

    add-float/2addr v0, p1

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 349
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ll/۠ܰۜ;->ۢ֫:F

    add-float/2addr v2, v3

    .line 361
    :cond_1
    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v2

    if-ltz v3, :cond_2

    invoke-virtual {p0, v1}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v3

    if-eqz v3, :cond_2

    int-to-float v3, v1

    mul-float v3, v3, v2

    add-float/2addr v0, v3

    .line 363
    iget v3, p0, Ll/۠ܰۜ;->ۨ:I

    add-int/2addr v3, v1

    invoke-direct {p0, v3}, Ll/۠ܰۜ;->᩷(I)Z

    .line 364
    iget-object v3, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz v3, :cond_1

    iget v4, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-interface {v3, v4}, Ll/ۗۛۜ;->֫(I)V

    goto :goto_1

    .line 366
    :cond_2
    invoke-virtual {p0, v1}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_3

    .line 367
    iget p1, p0, Ll/۠ܰۜ;->ۡ֫:F

    sub-float/2addr v0, p1

    .line 368
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v1, v3}, Ll/᩻ۨۜ;->֫(FF)F

    move-result v1

    mul-float v0, v0, v1

    add-float/2addr v0, p1

    :cond_3
    neg-float p1, v2

    .line 370
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/۠ܰۜ;->ۡ֫:F

    .line 371
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ(FF)V
    .locals 3

    .line 407
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 408
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->᩻(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget-object v1, p0, Ll/۠ܰۜ;->ᩴ֫:Ll/ܰۨۜ;

    invoke-virtual {v1, p1, p2, v0, v2}, Ll/ܰۨۜ;->֫(FFFF)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 409
    iget-object p1, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz p1, :cond_1

    iget p2, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-interface {p1, p2}, Ll/ۗۛۜ;->ۧ(I)V

    return-void

    .line 410
    :cond_0
    iget-object p1, p0, Ll/۠ܰۜ;->ܿ֫:Ll/ۗۛۜ;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ll/ۗۛۜ;->֫()V

    :cond_1
    return-void
.end method

.method public final ۧ(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 596
    sget-object v0, Ll/ᩴܰۜ;->᩹:Ll/ᩴܰۜ;

    goto :goto_0

    :cond_0
    sget-object v0, Ll/ᩴܰۜ;->۬:Ll/ᩴܰۜ;

    :goto_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 597
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    const/16 v2, 0xdc

    .line 596
    invoke-direct {p0, v0, v1, p1, v2}, Ll/۠ܰۜ;->֫(Ll/ᩴܰۜ;FFI)V

    return-void
.end method

.method public final ۧ(I)Z
    .locals 10

    .line 241
    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 242
    iget-wide v2, v0, Ll/֡ܰۜ;->ۡ:J

    invoke-direct {p0, v0, v2, v3}, Ll/۠ܰۜ;->֫(Ll/֡ܰۜ;J)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 243
    :cond_0
    iget-object v2, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, Ll/ۚܰۜ;->֫:Ll/֡ܰۜ;

    if-ne v2, v0, :cond_1

    iput-object v3, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 244
    :cond_1
    iget-wide v4, v0, Ll/֡ܰۜ;->ۡ:J

    .line 245
    iget-object v2, v0, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 246
    iget-wide v6, p0, Ll/۠ܰۜ;->᩷֫:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, p0, Ll/۠ܰۜ;->᩷֫:J

    iput-wide v6, v0, Ll/֡ܰۜ;->ۡ:J

    .line 247
    iput-object v3, v0, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 248
    iput-boolean v1, v0, Ll/֡ܰۜ;->֫:Z

    .line 249
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iput-wide v6, v0, Ll/֡ܰۜ;->ᩳ:J

    .line 250
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    invoke-virtual {v1, p1, v4, v5}, Ll/᩶᩺ۜ;->֫(IJ)V

    if-eqz v2, :cond_2

    .line 251
    check-cast v2, Ll/ܶ᩺ۜ;

    invoke-virtual {v2}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 252
    :cond_2
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    iget-wide v2, v0, Ll/֡ܰۜ;->ۡ:J

    invoke-virtual {v1, p1, v2, v3}, Ll/᩶᩺ۜ;->ۧ(IJ)V

    .line 253
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v1
.end method

.method public final ܳ()Landroid/os/Bundle;
    .locals 17

    move-object/from16 v0, p0

    .line 130
    iget v1, v0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {v0, v1}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 131
    iget-object v2, v1, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    iget-wide v3, v1, Ll/֡ܰۜ;->ۡ:J

    invoke-direct {v0, v1, v3, v4}, Ll/۠ܰۜ;->֫(Ll/֡ܰۜ;J)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    .line 132
    :cond_0
    iget-object v3, v0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    const-string v4, "rotation"

    const-string v5, "centerY"

    const-string v6, "centerX"

    const-string v7, "relativeScale"

    const-string v8, "orientation"

    const-string v9, "height"

    const-string v10, "width"

    const-string v11, "version"

    if-eqz v3, :cond_1

    .line 885
    iget-object v12, v3, Ll/ۚܰۜ;->֫:Ll/֡ܰۜ;

    if-ne v12, v1, :cond_1

    iget-wide v12, v3, Ll/ۚܰۜ;->ۧ:J

    iget-wide v14, v1, Ll/֡ܰۜ;->ۡ:J

    cmp-long v16, v12, v14

    if-nez v16, :cond_1

    .line 132
    iget-object v1, v3, Ll/ۚܰۜ;->ܽ:Ll/֨ܰۜ;

    .line 905
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const/4 v3, 0x1

    .line 906
    invoke-virtual {v2, v11, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 907
    iget v3, v1, Ll/֨ܰۜ;->ᩳ:I

    invoke-virtual {v2, v10, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 908
    iget v3, v1, Ll/֨ܰۜ;->ۧ:I

    invoke-virtual {v2, v9, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 909
    iget v3, v1, Ll/֨ܰۜ;->ܽ:I

    invoke-virtual {v2, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 910
    iget-object v1, v1, Ll/֨ܰۜ;->֫:Ll/ۛܰۜ;

    iget-wide v8, v1, Ll/ۛܰۜ;->ܿ:D

    invoke-virtual {v2, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 911
    iget-wide v7, v1, Ll/ۛܰۜ;->֫:D

    invoke-virtual {v2, v6, v7, v8}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 912
    iget-wide v6, v1, Ll/ۛܰۜ;->ۧ:D

    invoke-virtual {v2, v5, v6, v7}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 913
    iget v1, v1, Ll/ۛܰۜ;->ܳ:F

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v2

    .line 133
    :cond_1
    iget-object v3, v1, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Ll/ۨܰۜ;->۠()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 134
    :cond_2
    iget v3, v1, Ll/֡ܰۜ;->᩷:I

    iget v12, v1, Ll/֡ܰۜ;->ۜ:I

    iget-object v1, v1, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 828
    iget-object v1, v1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v1, v1, Ll/ܶۨۜ;->ᩳ:I

    .line 135
    invoke-virtual {v2}, Ll/ۨܰۜ;->᩹()Ll/ۛܰۜ;

    move-result-object v2

    .line 905
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const/4 v14, 0x1

    .line 906
    invoke-virtual {v13, v11, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 907
    invoke-virtual {v13, v10, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 908
    invoke-virtual {v13, v9, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 909
    invoke-virtual {v13, v8, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 910
    iget-wide v8, v2, Ll/ۛܰۜ;->ܿ:D

    invoke-virtual {v13, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 911
    iget-wide v7, v2, Ll/ۛܰۜ;->֫:D

    invoke-virtual {v13, v6, v7, v8}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 912
    iget-wide v6, v2, Ll/ۛܰۜ;->ۧ:D

    invoke-virtual {v13, v5, v6, v7}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 913
    iget v1, v2, Ll/ۛܰۜ;->ܳ:F

    invoke-virtual {v13, v4, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v13

    :cond_3
    :goto_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final ܽ(F)F
    .locals 1

    const/high16 v0, 0x3e800000    # 0.25f

    .line 342
    invoke-direct {p0, p1}, Ll/۠ܰۜ;->ᩳ(F)F

    move-result p1

    mul-float p1, p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    return v0
.end method

.method public final ܽ(FF)V
    .locals 10

    .line 606
    invoke-virtual {p0}, Ll/۠ܰۜ;->᩻()Ll/ۨܰۜ;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 607
    invoke-virtual {v6}, Ll/ۨܰۜ;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 608
    :cond_0
    invoke-virtual {v6}, Ll/ۨܰۜ;->ᩴ()F

    move-result v7

    invoke-virtual {v6}, Ll/ۨܰۜ;->᩵()F

    move-result v8

    invoke-virtual {v6}, Ll/ۨܰۜ;->֡()F

    move-result v9

    .line 609
    invoke-virtual {v6}, Ll/ۨܰۜ;->ܳ()F

    move-result v1

    .line 610
    invoke-virtual {v6}, Ll/ۨܰۜ;->ܿ()F

    move-result v0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_1

    move-object v0, v6

    move v2, p1

    move v3, p2

    move v4, p1

    move v5, p2

    .line 611
    invoke-virtual/range {v0 .. v5}, Ll/ۨܰۜ;->֫(FFFFF)V

    goto :goto_0

    .line 612
    :cond_1
    invoke-virtual {v6}, Ll/ۨܰۜ;->ܶ()V

    .line 613
    :goto_0
    invoke-virtual {v6}, Ll/ۨܰۜ;->ᩴ()F

    move-result p1

    invoke-virtual {v6}, Ll/ۨܰۜ;->᩵()F

    move-result p2

    invoke-virtual {v6}, Ll/ۨܰۜ;->֡()F

    move-result v0

    const/4 v1, 0x0

    .line 614
    invoke-virtual {v6, v7, v8, v9, v1}, Ll/ۨܰۜ;->֫(FFFZ)V

    .line 615
    sget-object v1, Ll/ᩴܰۜ;->ۤ:Ll/ᩴܰۜ;

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v3, v2}, Ll/۠ܰۜ;->֫(Ll/ᩴܰۜ;FFI)V

    .line 616
    iput p1, p0, Ll/۠ܰۜ;->ܰ֫:F

    .line 617
    iput p2, p0, Ll/۠ܰۜ;->۟֫:F

    .line 618
    iput v0, p0, Ll/۠ܰۜ;->֫ۧ:F

    :cond_2
    :goto_1
    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    .line 174
    iput p1, p0, Ll/۠ܰۜ;->ۤ:I

    .line 175
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 555
    iget-object v0, p0, Ll/۠ܰۜ;->᩶:Ll/ᩴܰۜ;

    sget-object v1, Ll/ᩴܰۜ;->ۙ:Ll/ᩴܰۜ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 8

    .line 284
    iget-object v0, p0, Ll/۠ܰۜ;->ܳ֫:Ll/᩹ܶ᩷;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 285
    iput-object v0, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 286
    invoke-virtual {p0}, Ll/۠ܰۜ;->֫()V

    .line 287
    iget-object v1, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    .line 288
    iput-object v0, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    const/4 v2, -0x1

    .line 289
    iput v2, p0, Ll/۠ܰۜ;->ۨ:I

    .line 290
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/۠ܰۜ;->ܺ֫:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 291
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 292
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܰۜ;

    .line 320
    iget-object v4, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 321
    iput-object v0, v3, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    if-eqz v1, :cond_1

    .line 322
    iget v5, v3, Ll/֡ܰۜ;->᩻:I

    iget-wide v6, v3, Ll/֡ܰۜ;->ۡ:J

    invoke-virtual {v1, v5, v6, v7}, Ll/᩶᩺ۜ;->֫(IJ)V

    :cond_1
    if-eqz v4, :cond_0

    .line 323
    check-cast v4, Ll/ܶ᩺ۜ;

    invoke-virtual {v4}, Ll/ܶ᩺ۜ;->ۧ()V

    goto :goto_0

    .line 293
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܿ(I)V
    .locals 3

    .line 589
    invoke-virtual {p0, p1}, Ll/۠ܰۜ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 590
    iput-object v0, p0, Ll/۠ܰۜ;->ۖ֫:Ll/ۚܰۜ;

    .line 591
    :cond_1
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۠ܰۜ;->ۨ֫:I

    .line 592
    sget-object v0, Ll/ᩴܰۜ;->ۗ:Ll/ᩴܰۜ;

    neg-int p1, p1

    int-to-float p1, p1

    .line 349
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Ll/۠ܰۜ;->ۢ֫:F

    add-float/2addr v1, v2

    mul-float v1, v1, p1

    const/4 p1, 0x0

    const/16 v2, 0x118

    .line 592
    invoke-direct {p0, v0, v1, p1, v2}, Ll/۠ܰۜ;->֫(Ll/ᩴܰۜ;FFI)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 557
    iget-object v0, p0, Ll/۠ܰۜ;->ᩳ֫:Ll/ܳۨۜ;

    invoke-virtual {v0}, Ll/ܳۨۜ;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ(I)Z
    .locals 2

    .line 352
    iget-object v0, p0, Ll/۠ܰۜ;->᩸:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/۠ܰۜ;->ۨ:I

    add-int/2addr v1, p1

    if-ltz v1, :cond_0

    .line 353
    invoke-virtual {v0}, Ll/᩶᩺ۜ;->֫()I

    move-result p1

    if-ge v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷()F
    .locals 1

    .line 338
    iget v0, p0, Ll/۠ܰۜ;->ۡ֫:F

    return v0
.end method

.method public final ᩻()Ll/ۨܰۜ;
    .locals 1

    .line 334
    iget v0, p0, Ll/۠ܰۜ;->ۨ:I

    invoke-direct {p0, v0}, Ll/۠ܰۜ;->ܳ(I)Ll/֡ܰۜ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 335
    :cond_0
    iget-object v0, v0, Ll/֡ܰۜ;->ܺ:Ll/ۨܰۜ;

    return-object v0
.end method
