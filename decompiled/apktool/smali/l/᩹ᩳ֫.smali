.class public abstract Ll/᩹ᩳ֫;
.super Landroid/text/style/ReplacementSpan;
.source "GB1W"


# instance fields
.field public ۙ:S

.field public final ᩶:Landroid/graphics/Paint$FontMetricsInt;

.field public final ᩸:Ll/֫ܿ֫;

.field public ᩹:F


# direct methods
.method public constructor <init>(Ll/֫ܿ֫;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 41
    new-instance v0, Landroid/graphics/Paint$FontMetricsInt;

    invoke-direct {v0}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    iput-object v0, p0, Ll/᩹ᩳ֫;->᩶:Landroid/graphics/Paint$FontMetricsInt;

    const/4 v0, -0x1

    .line 54
    iput-short v0, p0, Ll/᩹ᩳ֫;->ۙ:S

    const/high16 v0, 0x3f800000    # 1.0f

    .line 64
    iput v0, p0, Ll/᩹ᩳ֫;->᩹:F

    const-string v0, "rasterizer cannot be null"

    .line 75
    invoke-static {p1, v0}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iput-object p1, p0, Ll/᩹ᩳ֫;->᩸:Ll/֫ܿ֫;

    return-void
.end method


# virtual methods
.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 86
    iget-object p2, p0, Ll/᩹ᩳ֫;->᩶:Landroid/graphics/Paint$FontMetricsInt;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 87
    iget p1, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x3f800000    # 1.0f

    mul-float p1, p1, p3

    .line 89
    iget-object p3, p0, Ll/᩹ᩳ֫;->᩸:Ll/֫ܿ֫;

    invoke-virtual {p3}, Ll/֫ܿ֫;->ܽ()I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p1, p4

    iput p1, p0, Ll/᩹ᩳ֫;->᩹:F

    .line 90
    invoke-virtual {p3}, Ll/֫ܿ֫;->ܽ()I

    .line 91
    invoke-virtual {p3}, Ll/֫ܿ֫;->ܳ()I

    move-result p1

    int-to-float p1, p1

    iget p3, p0, Ll/᩹ᩳ֫;->᩹:F

    mul-float p1, p1, p3

    float-to-int p1, p1

    int-to-short p1, p1

    iput-short p1, p0, Ll/᩹ᩳ֫;->ۙ:S

    if-eqz p5, :cond_0

    .line 94
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 95
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 96
    iget p3, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 97
    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :cond_0
    return p1
.end method

.method public final ֫()Ll/֫ܿ֫;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/᩹ᩳ֫;->᩸:Ll/֫ܿ֫;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 120
    iget-short v0, p0, Ll/᩹ᩳ֫;->ۙ:S

    return v0
.end method
