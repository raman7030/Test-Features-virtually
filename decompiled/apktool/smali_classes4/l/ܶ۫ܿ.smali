.class public final Ll/ܶ۫ܿ;
.super Landroid/text/style/ReplacementSpan;
.source "G7AW"


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 355
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 356
    iput p1, p0, Ll/ܶ۫ܿ;->᩸:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    if-eqz p5, :cond_0

    .line 365
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    .line 366
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 367
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 368
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 369
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 371
    :cond_0
    iget p1, p0, Ll/ܶ۫ܿ;->᩸:I

    return p1
.end method
