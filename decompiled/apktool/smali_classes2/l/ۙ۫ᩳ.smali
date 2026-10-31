.class public final Ll/ۙ۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public final synthetic ܿ:Ll/۟۫ᩳ;

.field public final ᩳ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Ll/۟۫ᩳ;)V
    .locals 5

    .line 2154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۫ᩳ;->ܿ:Ll/۟۫ᩳ;

    .line 2149
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Ll/ۙ۫ᩳ;->ᩳ:Landroid/graphics/Paint;

    .line 2155
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2156
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2157
    new-instance v0, Landroid/graphics/DashPathEffect;

    const/high16 v1, 0x40a00000    # 5.0f

    .line 2158
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40200000    # 2.5f

    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    aput v2, v3, v1

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 2157
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۨᩳ;)I
    .locals 2

    .line 2198
    iget-object v0, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v0}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v0

    .line 2199
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩻֫()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    .line 2200
    iget-object v0, p0, Ll/ۙ۫ᩳ;->ܿ:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->ܺ(Ll/۟۫ᩳ;)Z

    move-result v0

    int-to-float p1, p1

    if-eqz v0, :cond_0

    const v0, 0x3ecccccd    # 0.4f

    goto :goto_0

    :cond_0
    const v0, 0x3ea8f5c3    # 0.33f

    :goto_0
    mul-float p1, p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final ֫(Ll/۫ۨᩳ;Ll/۫ۨᩳ;Z)Z
    .locals 7

    .line 2163
    iget-object v0, p0, Ll/ۙ۫ᩳ;->ܿ:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->ᩳ(Ll/۟۫ᩳ;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2165
    invoke-static {v0}, Ll/۟۫ᩳ;->ۖ(Ll/۟۫ᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 2168
    :cond_0
    iget-object v0, p1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v0, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 2169
    iget-object v3, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    .line 2170
    invoke-virtual {p0, p1}, Ll/ۙ۫ᩳ;->֫(Ll/۫ۨᩳ;)I

    move-result v4

    .line 2171
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v3

    float-to-int v3, v5

    add-int/2addr v3, v4

    const/4 v4, 0x1

    if-gez v3, :cond_1

    goto :goto_0

    .line 2174
    :cond_1
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    if-lt v3, v2, :cond_2

    .line 2175
    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    sub-int/2addr v2, v4

    goto :goto_0

    :cond_2
    move v2, v3

    .line 2177
    :goto_0
    invoke-virtual {v0, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 2178
    iget v3, v0, Ll/ۨܰᩳ;->᩶:I

    .line 2180
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 2181
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 2178
    invoke-static {p3, v3, v5, v6, v1}, Ll/۟۫ᩳ;->֫(ZIIILjava/util/List;)I

    move-result v3

    .line 2183
    iget v0, v0, Ll/ۨܰᩳ;->᩸:I

    add-int/2addr v0, v4

    .line 2185
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    .line 2186
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 2183
    invoke-static {p3, v0, p1, v5, v1}, Ll/۟۫ᩳ;->֫(ZIIILjava/util/List;)I

    move-result p1

    .line 2188
    iget-object p3, p2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {p3, v3}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result p3

    if-ne v3, p1, :cond_3

    move p1, p3

    goto :goto_1

    .line 2190
    :cond_3
    iget-object p2, p2, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {p2, p1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result p1

    .line 2191
    :goto_1
    iput v2, p0, Ll/ۙ۫ᩳ;->֫:I

    .line 2192
    iput p3, p0, Ll/ۙ۫ᩳ;->ܽ:I

    .line 2193
    iput p1, p0, Ll/ۙ۫ᩳ;->ۧ:I

    return v4

    :cond_4
    :goto_2
    return v2
.end method

.method public final ۧ(Ll/۫ۨᩳ;)F
    .locals 1

    .line 2208
    invoke-virtual {p0, p1}, Ll/ۙ۫ᩳ;->֫(Ll/۫ۨᩳ;)I

    move-result v0

    .line 2209
    iget-object p1, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p1

    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0
.end method
