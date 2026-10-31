.class public final Ll/֨ܺۡ;
.super Landroid/text/style/ReplacementSpan;
.source "34MM"


# instance fields
.field public final ۙ:I

.field public final ᩶:I

.field public final ᩸:Landroid/graphics/Paint;

.field public final ᩹:I


# direct methods
.method public constructor <init>(III)V
    .locals 2

    .line 132
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 127
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/֨ܺۡ;->᩸:Landroid/graphics/Paint;

    .line 133
    iput p1, p0, Ll/֨ܺۡ;->᩹:I

    .line 134
    iput p2, p0, Ll/֨ܺۡ;->ۙ:I

    .line 135
    iput p3, p0, Ll/֨ܺۡ;->᩶:I

    .line 136
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 137
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 161
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p2

    .line 162
    iget p3, p0, Ll/֨ܺۡ;->ۙ:I

    int-to-float p3, p3

    add-float/2addr p5, p3

    iget p3, p0, Ll/֨ܺۡ;->᩹:I

    int-to-float p4, p3

    const/high16 p6, 0x40000000    # 2.0f

    div-float/2addr p4, p6

    add-float/2addr p4, p5

    int-to-float p5, p7

    .line 163
    iget p7, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr p7, p2

    int-to-float p2, p7

    div-float/2addr p2, p6

    add-float/2addr p2, p5

    int-to-float p3, p3

    div-float/2addr p3, p6

    .line 164
    iget-object p5, p0, Ll/֨ܺۡ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p2, p3, p5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    if-eqz p5, :cond_0

    .line 146
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p1

    .line 147
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 148
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 149
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 150
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 152
    :cond_0
    iget p1, p0, Ll/֨ܺۡ;->ۙ:I

    iget p2, p0, Ll/֨ܺۡ;->᩹:I

    add-int/2addr p1, p2

    iget p2, p0, Ll/֨ܺۡ;->᩶:I

    add-int/2addr p1, p2

    return p1
.end method
