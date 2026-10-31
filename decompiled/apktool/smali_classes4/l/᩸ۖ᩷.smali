.class public final Ll/᩸ۖ᩷;
.super Landroid/text/style/MetricAffectingSpan;
.source "JAJI"


# instance fields
.field public final ᩸:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 673
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 674
    iput p1, p0, Ll/᩸ۖ᩷;->᩸:F

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 682
    iget v0, p0, Ll/᩸ۖ᩷;->᩸:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 1

    .line 690
    iget v0, p0, Ll/᩸ۖ᩷;->᩸:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method
