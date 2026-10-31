.class public final Ll/᩶۬ܳ;
.super Landroid/text/style/ReplacementSpan;
.source "N7AP"


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 115
    invoke-virtual {p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result p2

    const p3, 0x3f4ccccd    # 0.8f

    mul-float p2, p2, p3

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 116
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p4

    int-to-float p6, p7

    .line 117
    iget p7, p4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    iget p4, p4, Landroid/graphics/Paint$FontMetrics;->descent:F

    add-float/2addr p7, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p7, p4

    add-float/2addr p7, p6

    .line 118
    invoke-virtual {p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result p6

    const p8, 0x3d75c28f    # 0.06f

    mul-float p6, p6, p8

    invoke-static {p3, p6}, Ljava/lang/Math;->max(FF)F

    move-result p3

    div-float/2addr p2, p4

    add-float/2addr p2, p5

    .line 119
    invoke-virtual {p1, p2, p7, p3, p9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 110
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p1

    const p2, 0x3f4ccccd    # 0.8f

    mul-float p1, p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 p2, 0x1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method
