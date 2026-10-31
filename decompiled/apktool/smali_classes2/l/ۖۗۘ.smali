.class public final Ll/ۖۗۘ;
.super Ljava/lang/Object;
.source "Q917"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# instance fields
.field public final ۗ:Ll/۬ۙۘ;

.field public final ۙ:Landroid/graphics/Paint;

.field public final ᩶:Ljava/lang/String;

.field public ᩸:I

.field public final ᩹:Ll/᩶ۙۘ;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;Ljava/lang/String;Ll/᩶ۙۘ;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-static {}, Ll/ܺۗۘ;->֫()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۗۘ;->ۙ:Landroid/graphics/Paint;

    .line 67
    iput-object p1, p0, Ll/ۖۗۘ;->ۗ:Ll/۬ۙۘ;

    .line 68
    iput-object p2, p0, Ll/ۖۗۘ;->᩶:Ljava/lang/String;

    .line 69
    iput-object p3, p0, Ll/ۖۗۘ;->᩹:Ll/᩶ۙۘ;

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 7

    .line 39
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/ۖۗۘ;

    const/4 v2, 0x0

    .line 37
    invoke-interface {p1, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۖۗۘ;

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p0

    const-string v0, "8"

    .line 44
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    const-string v1, "."

    .line 45
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    const-string v3, " "

    .line 46
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p0

    .line 47
    array-length v3, p1

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, p1, v2

    .line 48
    iget-object v5, v4, Ll/ۖۗۘ;->᩹:Ll/᩶ۙۘ;

    invoke-interface {v5}, Ll/᩶ۙۘ;->֫()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-float v5, v5

    mul-float v5, v5, v0

    add-float/2addr v5, v1

    add-float/2addr v5, p0

    const/high16 v6, 0x3f000000    # 0.5f

    add-float/2addr v5, v6

    float-to-int v5, v5

    iput v5, v4, Ll/ۖۗۘ;->᩸:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p6

    move-object/from16 v2, p8

    if-eqz p11, :cond_3

    .line 8
    instance-of v3, v2, Landroid/text/Spanned;

    if-eqz v3, :cond_3

    check-cast v2, Landroid/text/Spanned;

    invoke-interface {v2, v0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    move/from16 v3, p9

    if-ne v2, v3, :cond_3

    .line 87
    iget-object v2, v0, Ll/ۖۗۘ;->ۙ:Landroid/graphics/Paint;

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 89
    iget-object v3, v0, Ll/ۖۗۘ;->ۗ:Ll/۬ۙۘ;

    invoke-virtual {v3, v2}, Ll/۬ۙۘ;->ܽ(Landroid/graphics/Paint;)V

    const-string v4, "8"

    .line 91
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v10

    const-string v11, "."

    .line 92
    invoke-virtual {v2, v11}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v12

    const-string v4, " "

    .line 93
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    .line 95
    iget-object v5, v0, Ll/ۖۗۘ;->᩶:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v10

    add-float/2addr v6, v12

    add-float/2addr v6, v4

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v6, v7

    float-to-int v6, v6

    .line 96
    iget-object v8, v0, Ll/ۖۗۘ;->᩹:Ll/᩶ۙۘ;

    invoke-interface {v8}, Ll/᩶ۙۘ;->֫()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    int-to-float v8, v8

    mul-float v8, v8, v10

    add-float/2addr v8, v12

    add-float/2addr v8, v4

    add-float/2addr v8, v7

    float-to-int v4, v8

    .line 99
    invoke-virtual {v3}, Ll/۬ۙۘ;->֫()I

    move-result v3

    const/4 v7, 0x0

    if-le v4, v3, :cond_0

    .line 104
    iput v4, v0, Ll/ۖۗۘ;->᩸:I

    goto :goto_0

    .line 106
    :cond_0
    iput v7, v0, Ll/ۖۗۘ;->᩸:I

    move v4, v3

    :goto_0
    if-lez p4, :cond_1

    mul-int v4, v4, p4

    add-int v4, v4, p3

    sub-int/2addr v4, v6

    goto :goto_1

    :cond_1
    mul-int v3, v4, p4

    add-int v3, v3, p3

    sub-int/2addr v4, v6

    add-int/2addr v4, v3

    :goto_1
    int-to-float v3, v4

    .line 116
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextAlign()Landroid/graphics/Paint$Align;

    move-result-object v13

    .line 117
    sget-object v4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    const/high16 v14, 0x40000000    # 2.0f

    div-float v15, v10, v14

    add-float/2addr v3, v15

    .line 120
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v4, 0x0

    move/from16 v16, v3

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v9, :cond_2

    add-int/lit8 v17, v5, 0x1

    int-to-float v8, v1

    .line 121
    iget-object v4, v0, Ll/ۖۗۘ;->᩶:Ljava/lang/String;

    move-object/from16 v3, p1

    move/from16 v6, v17

    move/from16 v7, v16

    move/from16 v18, v9

    move-object v9, v2

    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    add-float v16, v16, v10

    move/from16 v5, v17

    move/from16 v9, v18

    goto :goto_2

    :cond_2
    sub-float v16, v16, v15

    div-float/2addr v12, v14

    add-float v12, v12, v16

    int-to-float v1, v1

    move-object/from16 v3, p1

    .line 126
    invoke-virtual {v3, v11, v12, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 128
    invoke-virtual {v2, v13}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    :cond_3
    return-void
.end method

.method public final getLeadingMargin(Z)I
    .locals 1

    .line 75
    iget p1, p0, Ll/ۖۗۘ;->᩸:I

    iget-object v0, p0, Ll/ۖۗۘ;->ۗ:Ll/۬ۙۘ;

    invoke-virtual {v0}, Ll/۬ۙۘ;->֫()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method
