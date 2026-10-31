.class public final Ll/ܿۖܽ;
.super Landroid/graphics/drawable/Drawable;
.source "47UH"


# instance fields
.field public final ֡:Landroid/graphics/Path;

.field public ֫:F

.field public final ۖ:[Ll/ܿ۬;

.field public ۘ:F

.field public final ۚ:F

.field public final ۜ:[Ll/ܿ۬;

.field public final ۡ:Landroid/graphics/Paint;

.field public final ۢ:I

.field public ۧ:F

.field public ܳ:I

.field public final ܺ:[Ll/ܿ۬;

.field public ܽ:Landroid/animation/ValueAnimator;

.field public ܿ:I

.field public ᩳ:Landroid/graphics/Path;

.field public final ᩴ:Landroid/graphics/Path;

.field public final ᩵:Landroid/graphics/Matrix;

.field public ᩷:F

.field public final ᩻:Landroid/graphics/Path;


# direct methods
.method public constructor <init>([Ll/ܿ۬;[Ll/ܿ۬;)V
    .locals 3

    .line 49
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 25
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/ܿۖܽ;->᩻:Landroid/graphics/Path;

    .line 26
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Ll/ܿۖܽ;->᩵:Landroid/graphics/Matrix;

    .line 27
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ll/ܿۖܽ;->֡:Landroid/graphics/Path;

    .line 28
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ll/ܿۖܽ;->ᩴ:Landroid/graphics/Path;

    const/4 v1, 0x0

    .line 30
    iput v1, p0, Ll/ܿۖܽ;->᩷:F

    const/high16 v2, -0x40800000    # -1.0f

    .line 32
    iput v2, p0, Ll/ܿۖܽ;->֫:F

    .line 33
    iput v2, p0, Ll/ܿۖܽ;->ۧ:F

    const/high16 v2, -0x1000000

    .line 34
    iput v2, p0, Ll/ܿۖܽ;->ܿ:I

    .line 35
    iput v2, p0, Ll/ܿۖܽ;->ܳ:I

    .line 36
    iput v1, p0, Ll/ܿۖܽ;->ۘ:F

    .line 50
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/ܿۖܽ;->ۡ:Landroid/graphics/Paint;

    const/4 v2, 0x1

    .line 51
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 52
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    invoke-static {p1, p2}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 57
    iput-object p1, p0, Ll/ܿۖܽ;->ܺ:[Ll/ܿ۬;

    .line 58
    iput-object p2, p0, Ll/ܿۖܽ;->ۖ:[Ll/ܿ۬;

    .line 59
    invoke-static {p1}, Ll/ܳ۬;->֫([Ll/ܿ۬;)[Ll/ܿ۬;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۖܽ;->ۜ:[Ll/ܿ۬;

    .line 60
    invoke-static {p1, v0}, Ll/ܳ۬;->֫([Ll/ܿ۬;Landroid/graphics/Path;)V

    const/16 p1, 0x18

    int-to-float p1, p1

    .line 67
    iput p1, p0, Ll/ܿۖܽ;->ۚ:F

    .line 68
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 69
    iput p1, p0, Ll/ܿۖܽ;->ۢ:I

    return-void

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 120
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 121
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-lez v0, :cond_9

    if-gtz v1, :cond_0

    goto/16 :goto_3

    .line 125
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    int-to-float v0, v0

    .line 128
    iget v2, p0, Ll/ܿۖܽ;->ۚ:F

    div-float v3, v0, v2

    int-to-float v1, v1

    div-float v4, v1, v2

    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    div-float/2addr v1, v4

    .line 136
    iget v5, p0, Ll/ܿۖܽ;->᩷:F

    const/4 v6, 0x0

    cmpl-float v7, v5, v6

    if-nez v7, :cond_1

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    sub-float v7, v6, v5

    .line 138
    iget v8, p0, Ll/ܿۖܽ;->ۘ:F

    mul-float v7, v7, v8

    add-float/2addr v5, v7

    .line 139
    :goto_0
    iget v7, p0, Ll/ܿۖܽ;->ܿ:I

    .line 140
    iget v8, p0, Ll/ܿۖܽ;->ܳ:I

    .line 141
    iget-object v9, p0, Ll/ܿۖܽ;->ۡ:Landroid/graphics/Paint;

    if-ne v7, v8, :cond_2

    .line 142
    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 144
    :cond_2
    iget v10, p0, Ll/ܿۖܽ;->ۘ:F

    invoke-static {v7, v8, v10}, Ll/۟ۗ;->֫(IIF)I

    move-result v7

    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    :goto_1
    iget v7, p0, Ll/ܿۖܽ;->֫:F

    .line 147
    iget v8, p0, Ll/ܿۖܽ;->ۧ:F

    const/high16 v10, -0x40800000    # -1.0f

    cmpl-float v11, v7, v10

    if-eqz v11, :cond_3

    cmpl-float v10, v8, v10

    if-eqz v10, :cond_3

    sub-float/2addr v8, v7

    .line 149
    iget v10, p0, Ll/ܿۖܽ;->ۘ:F

    mul-float v8, v8, v10

    add-float/2addr v8, v7

    const/high16 v7, 0x437f0000    # 255.0f

    mul-float v8, v8, v7

    float-to-int v7, v8

    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 152
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v7

    iget-object v8, p0, Ll/ܿۖܽ;->᩻:Landroid/graphics/Path;

    if-eqz v7, :cond_6

    neg-float v2, v2

    div-float/2addr v2, v4

    .line 175
    iget-object v4, p0, Ll/ܿۖܽ;->᩵:Landroid/graphics/Matrix;

    invoke-virtual {v4, v2, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 176
    invoke-virtual {v4, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    cmpl-float v2, v5, v6

    if-eqz v2, :cond_4

    .line 178
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 180
    :cond_4
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 182
    iget-object v0, p0, Ll/ܿۖܽ;->֡:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 183
    invoke-virtual {v8, v4, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 184
    iget-object v1, p0, Ll/ܿۖܽ;->ᩳ:Landroid/graphics/Path;

    if-eqz v1, :cond_5

    .line 185
    iget-object v1, p0, Ll/ܿۖܽ;->ᩴ:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 186
    iget-object v2, p0, Ll/ܿۖܽ;->ᩳ:Landroid/graphics/Path;

    invoke-virtual {v2, v4, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 187
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 189
    :cond_5
    invoke-virtual {p1, v0, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_2

    .line 155
    :cond_6
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    cmpl-float v0, v5, v6

    if-eqz v0, :cond_7

    .line 157
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 159
    :cond_7
    invoke-virtual {p1, v3, v3}, Landroid/graphics/Canvas;->scale(FF)V

    neg-float v0, v2

    div-float/2addr v0, v4

    .line 160
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 161
    iget-object v0, p0, Ll/ܿۖܽ;->ᩳ:Landroid/graphics/Path;

    if-eqz v0, :cond_8

    .line 162
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 164
    :cond_8
    invoke-virtual {p1, v8, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 167
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_9
    :goto_3
    return-void
.end method

.method public final finalize()V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 260
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 199
    iget v0, p0, Ll/ܿۖܽ;->ۢ:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 194
    iget v0, p0, Ll/ܿۖܽ;->ۢ:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ܿۖܽ;->ۡ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    const/high16 p1, -0x40800000    # -1.0f

    .line 205
    iput p1, p0, Ll/ܿۖܽ;->ۧ:F

    iput p1, p0, Ll/ܿۖܽ;->֫:F

    .line 206
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ܿۖܽ;->ۡ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 212
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 102
    iget v0, p0, Ll/ܿۖܽ;->ۘ:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 112
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    const/16 v1, 0x12c

    int-to-long v1, v1

    .line 113
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 114
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    new-instance v1, Ll/ܽۖܽ;

    invoke-direct {v1, p0}, Ll/ܽۖܽ;-><init>(Ll/ܿۖܽ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 115
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final ֫(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 79
    iput v0, p0, Ll/ܿۖܽ;->֫:F

    .line 80
    iput p1, p0, Ll/ܿۖܽ;->ۧ:F

    .line 81
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 226
    iput p1, p0, Ll/ܿۖܽ;->ܳ:I

    iput p1, p0, Ll/ܿۖܽ;->ܿ:I

    .line 227
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫(Landroid/graphics/Path;)V
    .locals 0

    .line 221
    iput-object p1, p0, Ll/ܿۖܽ;->ᩳ:Landroid/graphics/Path;

    .line 222
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/high16 v0, 0x42b40000    # 90.0f

    .line 73
    iput v0, p0, Ll/ܿۖܽ;->᩷:F

    .line 75
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ۧ(F)V
    .locals 7

    const/high16 v0, 0x3f800000    # 1.0f

    .line 241
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 242
    iget v0, p0, Ll/ܿۖܽ;->ۘ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_3

    .line 243
    iput p1, p0, Ll/ܿۖܽ;->ۘ:F

    .line 355
    iget-object v0, p0, Ll/ܿۖܽ;->ۜ:[Ll/ܿ۬;

    array-length v1, v0

    iget-object v2, p0, Ll/ܿۖܽ;->ܺ:[Ll/ܿ۬;

    array-length v3, v2

    if-ne v1, v3, :cond_2

    array-length v1, v2

    iget-object v3, p0, Ll/ܿۖܽ;->ۖ:[Ll/ܿ۬;

    array-length v4, v3

    if-ne v1, v4, :cond_2

    .line 360
    invoke-static {v2, v3}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 364
    :goto_0
    array-length v4, v0

    if-ge v1, v4, :cond_0

    .line 365
    aget-object v4, v0, v1

    aget-object v5, v2, v1

    aget-object v6, v3, v1

    invoke-virtual {v4, v5, v6, p1}, Ll/ܿ۬;->֫(Ll/ܿ۬;Ll/ܿ۬;F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 245
    :cond_0
    iget-object p1, p0, Ll/ܿۖܽ;->᩻:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 246
    invoke-static {v0, p1}, Ll/ܳ۬;->֫([Ll/ܿ۬;Landroid/graphics/Path;)V

    .line 247
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 327
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can\'t interpolate between two incompatible pathData"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 356
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The nodes to be interpolated and resulting nodes must have the same length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 231
    iput p1, p0, Ll/ܿۖܽ;->ܿ:I

    .line 232
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    .line 236
    iput p1, p0, Ll/ܿۖܽ;->ܳ:I

    .line 237
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ᩳ(I)V
    .locals 3

    .line 85
    iget v0, p0, Ll/ܿۖܽ;->ۘ:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    .line 88
    :cond_0
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    if-nez p1, :cond_2

    .line 92
    invoke-virtual {p0, v1}, Ll/ܿۖܽ;->ۧ(F)V

    return-void

    :cond_2
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 95
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    int-to-long v1, p1

    .line 96
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 97
    iget-object p1, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    new-instance v0, Ll/ᩳۖܽ;

    invoke-direct {v0, p0}, Ll/ᩳۖܽ;-><init>(Ll/ܿۖܽ;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 98
    iget-object p1, p0, Ll/ܿۖܽ;->ܽ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
