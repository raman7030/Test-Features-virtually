.class public final Ll/ۗܶۡ;
.super Landroid/text/style/ReplacementSpan;
.source "37HW"


# instance fields
.field public ۗ:Landroid/graphics/drawable/Drawable;

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 48
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Ll/ۗܶۡ;->᩹:I

    .line 51
    iput v0, p0, Ll/ۗܶۡ;->᩶:I

    const/high16 v1, -0x80000000

    .line 52
    iput v1, p0, Ll/ۗܶۡ;->᩸:I

    .line 53
    iput v0, p0, Ll/ۗܶۡ;->ۙ:I

    return-void
.end method

.method private ֫(Landroid/graphics/Paint;)V
    .locals 5

    .line 85
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    .line 86
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const v2, 0x3f733333    # 0.95f

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v3, v1

    const v4, 0x3fb33333    # 1.4f

    mul-float v3, v3, v4

    .line 87
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 88
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p1

    const v4, 0x3dcccccd    # 0.1f

    mul-float p1, p1, v4

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 89
    iget-object v2, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۗܶۡ;->᩹:I

    if-ne v2, v3, :cond_0

    iget v2, p0, Ll/ۗܶۡ;->᩶:I

    if-ne v2, v1, :cond_0

    iget v2, p0, Ll/ۗܶۡ;->᩸:I

    if-ne v2, v0, :cond_0

    iget v2, p0, Ll/ۗܶۡ;->ۙ:I

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    const v2, 0x7f080165

    .line 96
    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 97
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 98
    iget-object v2, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v4, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 99
    iput v3, p0, Ll/ۗܶۡ;->᩹:I

    .line 100
    iput v1, p0, Ll/ۗܶۡ;->᩶:I

    .line 101
    iput v0, p0, Ll/ۗܶۡ;->᩸:I

    .line 102
    iput p1, p0, Ll/ۗܶۡ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 70
    invoke-direct {p0, p9}, Ll/ۗܶۡ;->֫(Landroid/graphics/Paint;)V

    .line 71
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p2

    .line 73
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    add-int/2addr p7, p3

    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    sub-int/2addr p2, p3

    iget-object p3, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p7

    .line 74
    invoke-virtual {p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result p3

    const p4, 0x3d75c28f    # 0.06f

    mul-float p3, p3, p4

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    add-int/2addr p3, p2

    .line 75
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 76
    iget p2, p0, Ll/ۗܶۡ;->ۙ:I

    int-to-float p2, p2

    add-float/2addr p5, p2

    int-to-float p2, p3

    invoke-virtual {p1, p5, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 77
    iget-object p2, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 78
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Ll/ۗܶۡ;->֫(Landroid/graphics/Paint;)V

    if-eqz p5, :cond_0

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    .line 60
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 61
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 62
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 63
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 65
    :cond_0
    iget-object p1, p0, Ll/ۗܶۡ;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    iget p2, p0, Ll/ۗܶۡ;->ۙ:I

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p1

    return p2
.end method
