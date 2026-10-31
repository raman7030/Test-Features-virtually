.class public final Ll/֡ۨۘ;
.super Landroid/text/style/ReplacementSpan;
.source "58YR"


# instance fields
.field public final ᩶:Ll/۬ۙۘ;

.field public final ᩸:Ll/ܿۨۘ;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;Ll/ܿۨۘ;Z)V
    .locals 0

    .line 40
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 41
    iput-object p1, p0, Ll/֡ۨۘ;->᩶:Ll/۬ۙۘ;

    .line 42
    iput-object p2, p0, Ll/֡ۨۘ;->᩸:Ll/ܿۨۘ;

    .line 44
    iput-boolean p3, p0, Ll/֡ۨۘ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 9

    move-object v1, p0

    move-object v2, p1

    move/from16 v0, p8

    .line 105
    invoke-static {p1, p2}, Ll/ۤ᩵ۚ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)I

    move-result v3

    .line 106
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    .line 104
    iget-object v5, v1, Ll/֡ۨۘ;->᩸:Ll/ܿۨۘ;

    invoke-virtual {v5, v4, v3}, Ll/ܿۨۘ;->֫(FI)V

    .line 111
    invoke-virtual {v5}, Ll/ܿۨۘ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 113
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v3

    .line 115
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    int-to-float v0, v0

    move v6, p5

    .line 125
    :try_start_0
    invoke-virtual {p1, p5, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 126
    invoke-virtual {v5, p1}, Ll/ܿۨۘ;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 129
    throw v0

    :cond_0
    move v6, p5

    const/4 v3, 0x2

    move v4, p6

    invoke-static {v0, p6, v3, p6}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v0

    int-to-float v0, v0

    .line 152
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->descent()F

    move-result v3

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->ascent()F

    move-result v4

    add-float/2addr v4, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v4, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v4, v3

    sub-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v7, v0

    .line 136
    iget-boolean v0, v1, Ll/֡ۨۘ;->᩹:Z

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, v1, Ll/֡ۨۘ;->᩶:Ll/۬ۙۘ;

    move-object/from16 v8, p9

    invoke-virtual {v0, v8}, Ll/۬ۙۘ;->ۧ(Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    move-object/from16 v8, p9

    :goto_0
    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object/from16 v8, p9

    .line 141
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 2

    .line 63
    iget-object v0, p0, Ll/֡ۨۘ;->᩸:Ll/ܿۨۘ;

    invoke-virtual {v0}, Ll/ܿۨۘ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 65
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    if-eqz p5, :cond_0

    .line 68
    iget p2, p1, Landroid/graphics/Rect;->bottom:I

    neg-int p2, p2

    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    const/4 p3, 0x0

    .line 69
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 71
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 72
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 75
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->right:I

    return p1

    .line 80
    :cond_1
    iget-boolean p5, p0, Ll/֡ۨۘ;->᩹:Z

    if-eqz p5, :cond_2

    .line 81
    iget-object p5, p0, Ll/֡ۨۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {p5, p1}, Ll/۬ۙۘ;->ۧ(Landroid/graphics/Paint;)V

    .line 85
    :cond_2
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result p1

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1
.end method

.method public final ֫()Ll/ܿۨۘ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/֡ۨۘ;->᩸:Ll/ܿۨۘ;

    return-object v0
.end method
