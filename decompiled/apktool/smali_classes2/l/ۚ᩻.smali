.class public final Ll/ۚ᩻;
.super Landroid/graphics/drawable/Drawable;
.source "A3PC"


# static fields
.field public static final ۖ:F


# instance fields
.field public ֫:F

.field public final ۜ:Landroid/graphics/Path;

.field public ۡ:Z

.field public final ۢ:I

.field public ۧ:F

.field public ܳ:F

.field public ܺ:Z

.field public ܽ:F

.field public ܿ:I

.field public ᩳ:F

.field public ᩷:F

.field public final ᩻:Landroid/graphics/Paint;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4046800000000000L    # 45.0

    .line 101
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float v0, v0

    sput v0, Ll/ۚ᩻;->ۖ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 129
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 98
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۚ᩻;->᩻:Landroid/graphics/Paint;

    .line 114
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Ll/ۚ᩻;->ۜ:Landroid/graphics/Path;

    const/4 v1, 0x0

    .line 118
    iput-boolean v1, p0, Ll/ۚ᩻;->ܺ:Z

    const/4 v2, 0x2

    .line 124
    iput v2, p0, Ll/ۚ᩻;->ܿ:I

    .line 130
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 131
    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 132
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 v3, 0x1

    .line 133
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 135
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v4, 0x7f0401ad

    const v5, 0x7f1300f7

    const/4 v6, 0x0

    sget-object v7, Ll/ۗᩳ;->ᩴ:[I

    invoke-virtual {p1, v6, v7, v4, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v4, 0x3

    .line 139
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    invoke-virtual {p0, v4}, Ll/ۚ᩻;->֫(I)V

    const/4 v4, 0x7

    const/4 v5, 0x0

    .line 140
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    .line 237
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v6

    cmpl-float v6, v6, v4

    if-eqz v6, :cond_0

    .line 238
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v4, v0

    float-to-double v6, v4

    .line 239
    sget v0, Ll/ۚ᩻;->ۖ:F

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double v8, v8, v6

    double-to-float v0, v8

    iput v0, p0, Ll/ۚ᩻;->ܳ:F

    .line 240
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    const/4 v0, 0x6

    .line 141
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 301
    iget-boolean v4, p0, Ll/ۚ᩻;->ۡ:Z

    if-eq v4, v0, :cond_1

    .line 302
    iput-boolean v0, p0, Ll/ۚ᩻;->ۡ:Z

    .line 303
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    const/4 v0, 0x5

    .line 143
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    .line 268
    iget v4, p0, Ll/ۚ᩻;->ܽ:F

    cmpl-float v4, v0, v4

    if-eqz v4, :cond_2

    .line 269
    iput v0, p0, Ll/ۚ᩻;->ܽ:F

    .line 270
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_2
    const/4 v0, 0x4

    .line 145
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Ll/ۚ᩻;->ۢ:I

    .line 147
    invoke-virtual {p1, v2, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Ll/ۚ᩻;->ᩳ:F

    .line 149
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Ll/ۚ᩻;->֫:F

    .line 151
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Ll/ۚ᩻;->ۧ:F

    .line 152
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static ֫(FFF)F
    .locals 0

    .line 466
    invoke-static {p1, p0, p2, p0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 327
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 330
    iget v3, p0, Ll/ۚ᩻;->ܿ:I

    if-eqz v3, :cond_2

    if-eq v3, v2, :cond_1

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    .line 343
    invoke-static {p0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v3

    if-ne v3, v2, :cond_2

    goto :goto_0

    .line 338
    :cond_0
    invoke-static {p0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 350
    :cond_2
    iget v2, p0, Ll/ۚ᩻;->֫:F

    mul-float v2, v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v2, v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    .line 351
    iget v3, p0, Ll/ۚ᩻;->᩷:F

    iget v4, p0, Ll/ۚ᩻;->ᩳ:F

    invoke-static {v4, v2, v3}, Ll/ۚ᩻;->֫(FFF)F

    move-result v2

    .line 352
    iget v3, p0, Ll/ۚ᩻;->ۧ:F

    iget v5, p0, Ll/ۚ᩻;->᩷:F

    invoke-static {v4, v3, v5}, Ll/ۚ᩻;->֫(FFF)F

    move-result v3

    .line 354
    iget v4, p0, Ll/ۚ᩻;->ܳ:F

    iget v5, p0, Ll/ۚ᩻;->᩷:F

    const/4 v6, 0x0

    invoke-static {v6, v4, v5}, Ll/ۚ᩻;->֫(FFF)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    int-to-float v4, v4

    .line 356
    sget v5, Ll/ۚ᩻;->ۖ:F

    iget v7, p0, Ll/ۚ᩻;->᩷:F

    invoke-static {v6, v5, v7}, Ll/ۚ᩻;->֫(FFF)F

    move-result v5

    if-eqz v1, :cond_3

    const/4 v7, 0x0

    goto :goto_1

    :cond_3
    const/high16 v7, -0x3ccc0000    # -180.0f

    :goto_1
    if-eqz v1, :cond_4

    const/high16 v8, 0x43340000    # 180.0f

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    .line 360
    :goto_2
    iget v9, p0, Ll/ۚ᩻;->᩷:F

    .line 359
    invoke-static {v7, v8, v9}, Ll/ۚ᩻;->֫(FFF)F

    move-result v7

    float-to-double v8, v2

    float-to-double v10, v5

    .line 362
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double v12, v12, v8

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-float v2, v12

    .line 363
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double v10, v10, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-float v5, v8

    .line 365
    iget-object v8, p0, Ll/ۚ᩻;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/Path;->rewind()V

    .line 366
    iget v9, p0, Ll/ۚ᩻;->ܽ:F

    iget-object v10, p0, Ll/ۚ᩻;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v11

    add-float/2addr v9, v11

    const/high16 v11, 0x40000000    # 2.0f

    iget v12, p0, Ll/ۚ᩻;->ܳ:F

    neg-float v12, v12

    iget v13, p0, Ll/ۚ᩻;->᩷:F

    invoke-static {v9, v12, v13}, Ll/ۚ᩻;->֫(FFF)F

    move-result v9

    neg-float v12, v3

    div-float/2addr v12, v11

    add-float v13, v12, v4

    .line 371
    invoke-virtual {v8, v13, v6}, Landroid/graphics/Path;->moveTo(FF)V

    mul-float v4, v4, v11

    sub-float/2addr v3, v4

    .line 372
    invoke-virtual {v8, v3, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 375
    invoke-virtual {v8, v12, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 376
    invoke-virtual {v8, v2, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    neg-float v3, v9

    .line 379
    invoke-virtual {v8, v12, v3}, Landroid/graphics/Path;->moveTo(FF)V

    neg-float v3, v5

    .line 380
    invoke-virtual {v8, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 382
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 384
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 388
    invoke-virtual {v10}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    .line 389
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40400000    # 3.0f

    mul-float v4, v4, v2

    sub-float/2addr v3, v4

    iget v4, p0, Ll/ۚ᩻;->ܽ:F

    mul-float v11, v11, v4

    sub-float/2addr v3, v11

    float-to-int v3, v3

    .line 390
    div-int/lit8 v3, v3, 0x4

    mul-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    const/high16 v5, 0x3fc00000    # 1.5f

    mul-float v2, v2, v5

    add-float/2addr v2, v4

    add-float/2addr v2, v3

    .line 393
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 394
    iget-boolean v0, p0, Ll/ۚ᩻;->ۡ:Z

    if-eqz v0, :cond_6

    .line 395
    iget-boolean v0, p0, Ll/ۚ᩻;->ܺ:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x1

    :goto_3
    int-to-float v0, v0

    mul-float v7, v7, v0

    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_4

    :cond_6
    if-eqz v1, :cond_7

    const/high16 v0, 0x43340000    # 180.0f

    .line 397
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 399
    :cond_7
    :goto_4
    invoke-virtual {p1, v8, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 401
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 420
    iget v0, p0, Ll/ۚ᩻;->ۢ:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 425
    iget v0, p0, Ll/ۚ᩻;->ۢ:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 406
    iget-object v0, p0, Ll/ۚ᩻;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    if-eq p1, v1, :cond_0

    .line 407
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 408
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 414
    iget-object v0, p0, Ll/ۚ᩻;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 415
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 449
    iget v0, p0, Ll/ۚ᩻;->᩷:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 450
    iput p1, p0, Ll/ۚ᩻;->᩷:F

    .line 451
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 217
    iget-object v0, p0, Ll/ۚ᩻;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    if-eq p1, v1, :cond_0

    .line 218
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 219
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 319
    iget-boolean v0, p0, Ll/ۚ᩻;->ܺ:Z

    if-eq v0, p1, :cond_0

    .line 320
    iput-boolean p1, p0, Ll/ۚ᩻;->ܺ:Z

    .line 321
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
