.class public Ll/ۜۨܿ;
.super Landroid/view/View;
.source "SAKT"


# instance fields
.field public ۗ:Landroid/graphics/Paint;

.field public ۙ:I

.field public ۛ:F

.field public ۤ:F

.field public ۨ:F

.field public ۫:I

.field public ۬:Landroid/graphics/Paint;

.field public ᩶:I

.field public ᩸:F

.field public ᩹:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x40000000    # 2.0f

    mul-float p1, p1, p2

    .line 36
    iput p1, p0, Ll/ۜۨܿ;->ۛ:F

    .line 38
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 39
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    iput-object p1, p0, Ll/ۜۨܿ;->۬:Landroid/graphics/Paint;

    .line 42
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 43
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 45
    iput-object p1, p0, Ll/ۜۨܿ;->ۗ:Landroid/graphics/Paint;

    .line 47
    invoke-static {}, Ll/۬ۨܿ;->֫()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۜۨܿ;->֫(I)V

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    const v0, -0x7f444445

    .line 74
    iget-object v1, p0, Ll/ۜۨܿ;->۬:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    iget v0, p0, Ll/ۜۨܿ;->᩸:F

    iget v2, p0, Ll/ۜۨܿ;->᩹:F

    iget v3, p0, Ll/ۜۨܿ;->ۤ:F

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/high16 v0, -0x80000000

    .line 77
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    iget v0, p0, Ll/ۜۨܿ;->᩸:F

    iget v2, p0, Ll/ۜۨܿ;->᩹:F

    iget v3, p0, Ll/ۜۨܿ;->ۤ:F

    iget v4, p0, Ll/ۜۨܿ;->ۛ:F

    sub-float/2addr v3, v4

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 80
    iget v0, p0, Ll/ۜۨܿ;->᩸:F

    iget v2, p0, Ll/ۜۨܿ;->᩶:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    .line 81
    iget v2, p0, Ll/ۜۨܿ;->᩹:F

    iget v3, p0, Ll/ۜۨܿ;->ۙ:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 83
    iget v3, p0, Ll/ۜۨܿ;->ۨ:F

    iget v4, p0, Ll/ۜۨܿ;->ۛ:F

    add-float/2addr v3, v4

    iget-object v4, p0, Ll/ۜۨܿ;->ۗ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const v3, -0x7f777778

    .line 85
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    iget v3, p0, Ll/ۜۨܿ;->ۨ:F

    iget v5, p0, Ll/ۜۨܿ;->ۛ:F

    add-float/2addr v3, v5

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 88
    iget v3, p0, Ll/ۜۨܿ;->ۨ:F

    iget v5, p0, Ll/ۜۨܿ;->ۛ:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v5, v3

    invoke-virtual {p1, v0, v2, v5, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const v3, -0x7f111112

    .line 90
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    iget v3, p0, Ll/ۜۨܿ;->ۨ:F

    iget v5, p0, Ll/ۜۨܿ;->ۛ:F

    div-float/2addr v5, v6

    add-float/2addr v5, v3

    invoke-virtual {p1, v0, v2, v5, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 93
    iget v1, p0, Ll/ۜۨܿ;->ۨ:F

    invoke-virtual {p1, v0, v2, v1, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 98
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 99
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    int-to-float p3, p3

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    iput p3, p0, Ll/ۜۨܿ;->ۤ:F

    int-to-float p1, p1

    div-float/2addr p1, p4

    .line 100
    iput p1, p0, Ll/ۜۨܿ;->᩸:F

    int-to-float p1, p2

    div-float/2addr p1, p4

    .line 101
    iput p1, p0, Ll/ۜۨܿ;->᩹:F

    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ۜۨܿ;->۫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 54
    iput p1, p0, Ll/ۜۨܿ;->۫:I

    add-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    .line 55
    iget v0, p0, Ll/ۜۨܿ;->ۛ:F

    add-float/2addr p1, v0

    iput p1, p0, Ll/ۜۨܿ;->ۨ:F

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(II)V
    .locals 0

    .line 64
    iput p1, p0, Ll/ۜۨܿ;->᩶:I

    .line 65
    iput p2, p0, Ll/ۜۨܿ;->ۙ:I

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
