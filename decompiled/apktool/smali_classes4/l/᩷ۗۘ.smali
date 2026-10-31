.class public final Ll/᩷ۗۘ;
.super Landroid/text/style/MetricAffectingSpan;
.source "08Y1"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final ۙ:Ll/۬ۙۘ;

.field public final ᩶:Landroid/graphics/Rect;

.field public final ᩸:I

.field public final ᩹:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;I)V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 20
    invoke-static {}, Ll/ܺۗۘ;->ۧ()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۗۘ;->᩶:Landroid/graphics/Rect;

    .line 21
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۗۘ;->᩹:Landroid/graphics/Paint;

    .line 25
    iput-object p1, p0, Ll/᩷ۗۘ;->ۙ:Ll/۬ۙۘ;

    .line 26
    iput p2, p0, Ll/᩷ۗۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    const/4 p5, 0x1

    .line 52
    iget p6, p0, Ll/᩷ۗۘ;->᩸:I

    if-eq p6, p5, :cond_0

    const/4 p5, 0x2

    if-ne p6, p5, :cond_2

    .line 12
    :cond_0
    instance-of p5, p8, Landroid/text/Spanned;

    if-eqz p5, :cond_2

    check-cast p8, Landroid/text/Spanned;

    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p5

    if-ne p5, p10, :cond_2

    .line 55
    iget-object p5, p0, Ll/᩷ۗۘ;->᩹:Landroid/graphics/Paint;

    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 57
    iget-object p2, p0, Ll/᩷ۗۘ;->ۙ:Ll/۬ۙۘ;

    invoke-virtual {p2, p5}, Ll/۬ۙۘ;->֫(Landroid/graphics/Paint;)V

    .line 59
    invoke-virtual {p5}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p2

    const/4 p6, 0x0

    cmpl-float p6, p2, p6

    if-lez p6, :cond_2

    int-to-float p6, p7

    sub-float/2addr p6, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p6, p2

    float-to-int p2, p6

    if-lez p4, :cond_1

    .line 69
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p4

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p4

    sub-int p4, p3, p4

    move v0, p4

    move p4, p3

    move p3, v0

    .line 75
    :goto_0
    iget-object p6, p0, Ll/᩷ۗۘ;->᩶:Landroid/graphics/Rect;

    invoke-virtual {p6, p3, p2, p4, p7}, Landroid/graphics/Rect;->set(IIII)V

    .line 76
    invoke-virtual {p1, p6, p5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 40
    iget-object v0, p0, Ll/᩷ۗۘ;->ۙ:Ll/۬ۙۘ;

    iget v1, p0, Ll/᩷ۗۘ;->᩸:I

    invoke-virtual {v0, p1, v1}, Ll/۬ۙۘ;->֫(Landroid/text/TextPaint;I)V

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    .line 40
    iget-object v0, p0, Ll/᩷ۗۘ;->ۙ:Ll/۬ۙۘ;

    iget v1, p0, Ll/᩷ۗۘ;->᩸:I

    invoke-virtual {v0, p1, v1}, Ll/۬ۙۘ;->֫(Landroid/text/TextPaint;I)V

    return-void
.end method
