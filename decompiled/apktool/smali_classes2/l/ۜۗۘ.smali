.class public final Ll/ۜۗۘ;
.super Landroid/text/style/MetricAffectingSpan;
.source "28XZ"


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    const/high16 v0, -0x41800000    # -0.25f

    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 1

    const/high16 v0, -0x41800000    # -0.25f

    .line 10
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method
