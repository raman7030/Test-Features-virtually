.class public final Ll/ܳۗۘ;
.super Landroid/text/style/MetricAffectingSpan;
.source "V8Y4"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final ᩶:Ll/۬ۙۘ;

.field public final ᩸:Landroid/graphics/Paint;

.field public final ᩹:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 21
    invoke-static {}, Ll/ܺۗۘ;->ۧ()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۗۘ;->᩹:Landroid/graphics/Rect;

    .line 22
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۗۘ;->᩸:Landroid/graphics/Paint;

    .line 25
    iput-object p1, p0, Ll/ܳۗۘ;->᩶:Ll/۬ۙۘ;

    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 1

    .line 50
    sget-object p6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object p8, p0, Ll/ܳۗۘ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {p8, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    iget-object p6, p0, Ll/ܳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    const/16 p6, 0x19

    invoke-static {p2, p6}, Ll/ۜ᩺ۘ;->֫(II)I

    move-result p2

    .line 51
    invoke-virtual {p8, p2}, Landroid/graphics/Paint;->setColor(I)V

    if-lez p4, :cond_0

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p2

    sub-int p2, p3, p2

    move v0, p3

    move p3, p2

    move p2, v0

    .line 63
    :goto_0
    iget-object p4, p0, Ll/ܳۗۘ;->᩹:Landroid/graphics/Rect;

    invoke-virtual {p4, p3, p5, p2, p7}, Landroid/graphics/Rect;->set(IIII)V

    .line 65
    invoke-virtual {p1, p4, p8}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 0

    .line 44
    iget-object p1, p0, Ll/ܳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p1}, Ll/۬ۙۘ;->ᩳ()I

    move-result p1

    return p1
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ܳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 384
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    .line 39
    iget-object v0, p0, Ll/ܳۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 384
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method
