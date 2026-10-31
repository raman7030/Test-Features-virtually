.class public Ll/᩹۫ܿ;
.super Landroid/view/View;
.source "K7AX"


# static fields
.field public static final ܰ:J

.field public static final ᩺:J


# instance fields
.field public ۗ:I

.field public final ۙ:I

.field public final ۛ:Landroid/graphics/Paint;

.field public final ۤ:F

.field public final ۨ:I

.field public ۫:F

.field public final ۬:Landroid/graphics/Paint;

.field public final ᩶:I

.field public final ᩸:Landroid/graphics/RectF;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 23
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sput-wide v1, Ll/᩹۫ܿ;->᩺:J

    const-wide/16 v1, 0x7

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ll/᩹۫ܿ;->ܰ:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Ll/᩹۫ܿ;->ۛ:Landroid/graphics/Paint;

    .line 27
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Ll/᩹۫ܿ;->۬:Landroid/graphics/Paint;

    .line 28
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Ll/᩹۫ܿ;->᩸:Landroid/graphics/RectF;

    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    iput v2, p0, Ll/᩹۫ܿ;->۫:F

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const v3, 0x3fcccccd    # 1.6f

    mul-float v3, v3, v2

    .line 50
    iput v3, p0, Ll/᩹۫ܿ;->ۤ:F

    const/high16 v4, 0x41600000    # 14.0f

    mul-float v2, v2, v4

    .line 51
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Ll/᩹۫ܿ;->᩶:I

    .line 52
    sget v2, Ll/᩹֡᩷;->֫:I

    iput v2, p0, Ll/᩹۫ܿ;->ۙ:I

    .line 53
    sget v4, Ll/᩹֡᩷;->ۘ֫:I

    iput v4, p0, Ll/᩹۫ܿ;->᩹:I

    .line 54
    sget v4, Ll/᩹֡᩷;->ᩳ֫:I

    iput v4, p0, Ll/᩹۫ܿ;->ۨ:I

    .line 55
    iput v2, p0, Ll/᩹۫ܿ;->ۗ:I

    .line 123
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    const v6, 0x1010038

    invoke-virtual {v5, v6, v4, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const p1, -0x777778

    goto :goto_0

    .line 127
    :cond_0
    iget v0, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_1

    .line 128
    invoke-static {p1, v0}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    .line 130
    :cond_1
    iget p1, v4, Landroid/util/TypedValue;->data:I

    .line 58
    :goto_0
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 59
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/16 p1, 0x2c

    .line 61
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 63
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 64
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 65
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 99
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 100
    iget v0, p0, Ll/᩹۫ܿ;->ۤ:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iget-object v4, p0, Ll/᩹۫ܿ;->᩸:Landroid/graphics/RectF;

    invoke-virtual {v4, v0, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 102
    iget-object v0, p0, Ll/᩹۫ܿ;->ۛ:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    const/high16 v0, 0x43b40000    # 360.0f

    .line 103
    iget v1, p0, Ll/᩹۫ܿ;->۫:F

    mul-float v6, v1, v0

    const/4 v7, 0x0

    iget-object v8, p0, Ll/᩹۫ܿ;->۬:Landroid/graphics/Paint;

    const/high16 v5, -0x3d4c0000    # -90.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 89
    iget v0, p0, Ll/᩹۫ܿ;->᩶:I

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    .line 90
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    .line 91
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-lez v3, :cond_0

    long-to-float v3, p1

    long-to-float p3, p3

    div-float/2addr v3, p3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/high16 p3, 0x3f800000    # 1.0f

    .line 74
    invoke-static {p3, v3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    invoke-static {v0, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    cmp-long p4, p1, v1

    if-lez p4, :cond_1

    .line 110
    sget-wide v0, Ll/᩹۫ܿ;->ܰ:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    .line 111
    iget p1, p0, Ll/᩹۫ܿ;->ۨ:I

    goto :goto_1

    :cond_1
    if-lez p4, :cond_2

    .line 113
    sget-wide v0, Ll/᩹۫ܿ;->᩺:J

    cmp-long p4, p1, v0

    if-gtz p4, :cond_2

    .line 114
    iget p1, p0, Ll/᩹۫ܿ;->᩹:I

    goto :goto_1

    .line 116
    :cond_2
    iget p1, p0, Ll/᩹۫ܿ;->ۙ:I

    .line 76
    :goto_1
    iget p2, p0, Ll/᩹۫ܿ;->۫:F

    cmpl-float p2, p2, p3

    if-nez p2, :cond_4

    iget p2, p0, Ll/᩹۫ܿ;->ۗ:I

    if-eq p2, p1, :cond_3

    goto :goto_2

    :cond_3
    return-void

    .line 77
    :cond_4
    :goto_2
    iput p3, p0, Ll/᩹۫ܿ;->۫:F

    .line 78
    iput p1, p0, Ll/᩹۫ܿ;->ۗ:I

    .line 79
    iget-object p2, p0, Ll/᩹۫ܿ;->۬:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
