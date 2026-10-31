.class public final Ll/᩸ۛۘ;
.super Landroid/text/style/MetricAffectingSpan;
.source "58Z9"


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    iget v0, p1, Landroid/text/TextPaint;->baselineShift:I

    invoke-virtual {p1}, Landroid/graphics/Paint;->ascent()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/text/TextPaint;->baselineShift:I

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 3

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    iget v0, p1, Landroid/text/TextPaint;->baselineShift:I

    invoke-virtual {p1}, Landroid/graphics/Paint;->ascent()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/text/TextPaint;->baselineShift:I

    return-void
.end method
