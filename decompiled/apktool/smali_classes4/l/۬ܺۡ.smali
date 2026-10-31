.class public abstract Ll/۬ܺۡ;
.super Ll/ۙܺۡ;
.source "H4IH"


# instance fields
.field public ۫:Landroid/graphics/Paint;


# virtual methods
.method public final getAlpha()I
    .locals 1

    .line 36
    iget v0, p0, Ll/ۙܺۡ;->᩸:I

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۙܺۡ;->᩹:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final bridge synthetic getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final ֫(Landroid/graphics/Canvas;II)V
    .locals 2

    .line 19
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    .line 87
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    :cond_0
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    iget v1, p0, Ll/ۙܺۡ;->᩸:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 26
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    .line 148
    iget-object v1, p0, Ll/ۙܺۡ;->᩹:Landroid/graphics/ColorFilter;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/ۙܺۡ;->ۙ:Landroid/graphics/PorterDuffColorFilter;

    .line 26
    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 28
    iget-object v0, p0, Ll/۬ܺۡ;->۫:Landroid/graphics/Paint;

    invoke-virtual {p0, p1, v0, p2, p3}, Ll/۬ܺۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    return-void
.end method

.method public abstract ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
.end method
