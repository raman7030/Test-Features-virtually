.class public final Ll/᩻ۗۘ;
.super Landroid/text/style/MetricAffectingSpan;
.source "18XN"


# instance fields
.field public final ᩸:Ll/۬ۙۘ;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 18
    iput-object p1, p0, Ll/᩻ۗۘ;->᩸:Ll/۬ۙۘ;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    .line 33
    iget-object v0, p0, Ll/᩻ۗۘ;->᩸:Ll/۬ۙۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 333
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const v2, 0x3f5eb852    # 0.87f

    mul-float v1, v1, v2

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    const/16 v1, 0x19

    invoke-static {v0, v1}, Ll/ۜ᩺ۘ;->֫(II)I

    move-result v0

    .line 29
    iput v0, p1, Landroid/text/TextPaint;->bgColor:I

    return-void
.end method

.method public final updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    .line 33
    iget-object v0, p0, Ll/᩻ۗۘ;->᩸:Ll/۬ۙۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 333
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method
