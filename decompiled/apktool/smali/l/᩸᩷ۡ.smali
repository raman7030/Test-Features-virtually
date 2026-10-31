.class public Ll/᩸᩷ۡ;
.super Ll/ᩳۡ;
.source "E5ZZ"


# static fields
.field public static final ܳ֫:Landroid/widget/ImageView$ScaleType;

.field public static final ܿ֫:Landroid/graphics/Bitmap$Config;

.field public static final synthetic ᩳ֫:I


# instance fields
.field public ֫֫:J

.field public final ۗ:Landroid/graphics/RectF;

.field public ۙ:F

.field public final ۛ:Landroid/graphics/RectF;

.field public final ۟:Landroid/graphics/Matrix;

.field public ۤ:F

.field public ۧ֫:Z

.field public ۨ:I

.field public ۫:Z

.field public ۬:Landroid/graphics/ColorFilter;

.field public ܰ:Z

.field public ܽ֫:F

.field public final ᩶:Landroid/graphics/Paint;

.field public ᩸:Landroid/graphics/Bitmap;

.field public ᩹:Landroid/graphics/Canvas;

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    sput-object v0, Ll/᩸᩷ۡ;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    .line 39
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Ll/᩸᩷ۡ;->ܿ֫:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, p1, p2, v0}, Ll/᩸᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 90
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Ll/᩸᩷ۡ;->ۛ:Landroid/graphics/RectF;

    .line 49
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Ll/᩸᩷ۡ;->ۗ:Landroid/graphics/RectF;

    .line 51
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Ll/᩸᩷ۡ;->۟:Landroid/graphics/Matrix;

    .line 52
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Ll/᩸᩷ۡ;->᩶:Landroid/graphics/Paint;

    .line 53
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 54
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    const/16 v0, 0xff

    .line 59
    iput v0, p0, Ll/᩸᩷ۡ;->ۨ:I

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Ll/᩸᩷ۡ;->ۧ֫:Z

    const/4 v1, 0x0

    .line 77
    iput v1, p0, Ll/᩸᩷ۡ;->ܽ֫:F

    const/4 v1, 0x1

    .line 101
    iput-boolean v1, p0, Ll/᩸᩷ۡ;->᩺:Z

    .line 103
    sget-object v2, Ll/᩸᩷ۡ;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 105
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 106
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 107
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 108
    iget v2, p0, Ll/᩸᩷ۡ;->ۨ:I

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 109
    iget-object v2, p0, Ll/᩸᩷ۡ;->۬:Landroid/graphics/ColorFilter;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 111
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 112
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 p1, -0x1000000

    .line 113
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float p1, v0

    .line 114
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 116
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 117
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 118
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 120
    new-instance p1, Ll/ܶ᩷ۡ;

    invoke-direct {p1, p0}, Ll/ܶ᩷ۡ;-><init>(Ll/᩸᩷ۡ;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸᩷ۡ;)Landroid/graphics/RectF;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩷ۡ;->ۗ:Landroid/graphics/RectF;

    return-object p0
.end method

.method private ܳ()V
    .locals 8

    .line 471
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 479
    iget-object v1, p0, Ll/᩸᩷ۡ;->۟:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 481
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    .line 482
    iget-object v2, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 484
    iget-object v3, p0, Ll/᩸᩷ۡ;->ۛ:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v4

    mul-float v4, v4, v2

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v5

    int-to-float v0, v0

    mul-float v5, v5, v0

    const/4 v6, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    .line 485
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v4, v0

    .line 486
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v0

    mul-float v2, v2, v4

    sub-float/2addr v0, v2

    mul-float v6, v0, v7

    const/4 v0, 0x0

    goto :goto_0

    .line 488
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v4

    div-float/2addr v4, v2

    .line 489
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float v0, v0, v4

    sub-float/2addr v2, v0

    mul-float v0, v2, v7

    .line 492
    :goto_0
    invoke-virtual {v1, v4, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    add-float/2addr v6, v7

    float-to-int v2, v6

    int-to-float v2, v2

    .line 493
    iget v4, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v4

    add-float/2addr v0, v7

    float-to-int v0, v0

    int-to-float v0, v0

    iget v3, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    const/4 v0, 0x1

    .line 495
    iput-boolean v0, p0, Ll/᩸᩷ۡ;->ܰ:Z

    return-void
.end method

.method private ܿ()V
    .locals 6

    .line 459
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 460
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 462
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 464
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    sub-int/2addr v0, v2

    int-to-float v0, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    add-float/2addr v0, v3

    .line 465
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v1, v4

    add-float/2addr v1, v3

    .line 467
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v2, v2

    add-float v5, v0, v2

    add-float/2addr v2, v1

    invoke-direct {v3, v0, v1, v5, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 446
    iget-object v0, p0, Ll/᩸᩷ۡ;->ۗ:Landroid/graphics/RectF;

    invoke-virtual {v0, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 447
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    const/4 v2, 0x0

    int-to-float v2, v2

    sub-float/2addr v1, v2

    div-float/2addr v1, v4

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v3

    sub-float/2addr v3, v2

    div-float/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, p0, Ll/᩸᩷ۡ;->ۙ:F

    .line 449
    iget-object v1, p0, Ll/᩸᩷ۡ;->ۛ:Landroid/graphics/RectF;

    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 453
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v4

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Ll/᩸᩷ۡ;->ۤ:F

    .line 455
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ܳ()V

    return-void
.end method

.method private ᩳ()V
    .locals 7

    .line 426
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 402
    :cond_0
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_1

    .line 403
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    .line 409
    :cond_1
    :try_start_0
    instance-of v2, v0, Landroid/graphics/drawable/ColorDrawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v3, Ll/᩸᩷ۡ;->ܿ֫:Landroid/graphics/Bitmap$Config;

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    .line 410
    :try_start_1
    invoke-static {v2, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    .line 412
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-static {v2, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 415
    :goto_0
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 416
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 417
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v2

    goto :goto_2

    :catch_0
    :goto_1
    move-object v0, v1

    .line 426
    :goto_2
    iput-object v0, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 428
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 429
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v2, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    goto :goto_3

    .line 431
    :cond_3
    iput-object v1, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    .line 434
    :goto_3
    iget-boolean v0, p0, Ll/᩸᩷ۡ;->᩺:Z

    if-nez v0, :cond_4

    goto :goto_4

    .line 438
    :cond_4
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    .line 439
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ܳ()V

    goto :goto_4

    .line 441
    :cond_5
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩶:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :goto_4
    return-void
.end method


# virtual methods
.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 394
    iget-object v0, p0, Ll/᩸᩷ۡ;->۬:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getImageAlpha()I
    .locals 1

    .line 373
    iget v0, p0, Ll/᩸᩷ۡ;->ۨ:I

    return v0
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x1

    .line 213
    iput-boolean p1, p0, Ll/᩸᩷ۡ;->۫:Z

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 143
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Ll/֡᩸ۜ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/֡᩸ۜ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v1, v0

    .line 148
    iget v0, p0, Ll/᩸᩷ۡ;->ܽ֫:F

    .line 149
    iget-boolean v2, p0, Ll/᩸᩷ۡ;->ۧ֫:Z

    if-eqz v2, :cond_4

    .line 150
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 151
    iget-wide v4, p0, Ll/᩸᩷ۡ;->֫֫:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    if-nez v1, :cond_1

    const/high16 v4, 0x3f000000    # 0.5f

    goto :goto_1

    :cond_1
    const/high16 v4, 0x3fa00000    # 1.25f

    :goto_1
    add-float/2addr v0, v4

    const/high16 v4, 0x43b40000    # 360.0f

    cmpl-float v5, v0, v4

    if-ltz v5, :cond_2

    sub-float/2addr v0, v4

    .line 160
    :cond_2
    iput v0, p0, Ll/᩸᩷ۡ;->ܽ֫:F

    const-wide/16 v4, 0xf

    add-long/2addr v2, v4

    .line 161
    iput-wide v2, p0, Ll/᩸᩷ۡ;->֫֫:J

    .line 162
    invoke-virtual {p0, v4, v5}, Landroid/view/View;->postInvalidateDelayed(J)V

    goto :goto_2

    :cond_3
    sub-long/2addr v4, v2

    .line 164
    invoke-virtual {p0, v4, v5}, Landroid/view/View;->postInvalidateDelayed(J)V

    :cond_4
    :goto_2
    move v5, v0

    if-eqz v1, :cond_5

    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v7

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Ll/֡᩸ۜ;->֫(Landroid/graphics/Canvas;IIFZZ)V

    return-void

    :cond_5
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-eqz v0, :cond_6

    .line 175
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    invoke-virtual {p1, v5, v0, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 186
    :cond_6
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_9

    .line 187
    iget-boolean v0, p0, Ll/᩸᩷ۡ;->۫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    if-eqz v0, :cond_7

    .line 188
    iput-boolean v1, p0, Ll/᩸᩷ۡ;->۫:Z

    .line 189
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 190
    iget-object v2, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    iget-object v3, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 191
    iget-object v2, p0, Ll/᩸᩷ۡ;->᩹:Landroid/graphics/Canvas;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 194
    :cond_7
    iget-boolean v0, p0, Ll/᩸᩷ۡ;->ܰ:Z

    iget-object v2, p0, Ll/᩸᩷ۡ;->᩶:Landroid/graphics/Paint;

    if-eqz v0, :cond_8

    .line 195
    iput-boolean v1, p0, Ll/᩸᩷ۡ;->ܰ:Z

    .line 197
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Ll/᩸᩷ۡ;->᩸:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 198
    iget-object v1, p0, Ll/᩸᩷ۡ;->۟:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 200
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 203
    :cond_8
    iget-object v0, p0, Ll/᩸᩷ۡ;->ۛ:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    iget v3, p0, Ll/᩸᩷ۡ;->ۤ:F

    invoke-virtual {p1, v1, v0, v3, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_9
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 219
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 220
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ܿ()V

    .line 221
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 505
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 509
    iget-object v2, p0, Ll/᩸᩷ۡ;->ۗ:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 513
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    sub-float/2addr v0, v3

    float-to-double v3, v0

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    sub-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v0, v3

    iget v2, p0, Ll/᩸᩷ۡ;->ۙ:F

    float-to-double v2, v2

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_1

    .line 505
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final setAdjustViewBounds(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 133
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "adjustViewBounds not supported."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 378
    iget-object v0, p0, Ll/᩸᩷ۡ;->۬:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 382
    :cond_0
    iput-object p1, p0, Ll/᩸᩷ۡ;->۬:Landroid/graphics/ColorFilter;

    .line 386
    iget-boolean v0, p0, Ll/᩸᩷ۡ;->᩺:Z

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩶:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 388
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setImageAlpha(I)V
    .locals 1

    and-int/lit16 p1, p1, 0xff

    .line 357
    iget v0, p0, Ll/᩸᩷ۡ;->ۨ:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 361
    :cond_0
    iput p1, p0, Ll/᩸᩷ۡ;->ۨ:I

    .line 365
    iget-boolean v0, p0, Ll/᩸᩷ۡ;->᩺:Z

    if-eqz v0, :cond_1

    .line 366
    iget-object v0, p0, Ll/᩸᩷ۡ;->᩶:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 367
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 327
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 328
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ᩳ()V

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 334
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 335
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ᩳ()V

    .line 336
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setImageResource(I)V
    .locals 0

    .line 341
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageResource(I)V

    .line 342
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ᩳ()V

    .line 343
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 348
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageURI(Landroid/net/Uri;)V

    .line 349
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ᩳ()V

    .line 350
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    .line 226
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 227
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ܿ()V

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setPaddingRelative(IIII)V
    .locals 0

    .line 233
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setPaddingRelative(IIII)V

    .line 234
    invoke-direct {p0}, Ll/᩸᩷ۡ;->ܿ()V

    .line 235
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 3

    .line 125
    sget-object v0, Ll/᩸᩷ۡ;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    if-ne p1, v0, :cond_0

    return-void

    .line 126
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ScaleType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not supported."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 538
    iput-boolean p1, p0, Ll/᩸᩷ۡ;->ۧ֫:Z

    if-eqz p1, :cond_0

    .line 540
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 4

    const/4 v0, 0x0

    .line 532
    iput v0, p0, Ll/᩸᩷ۡ;->ܽ֫:F

    .line 533
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0xc8

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩸᩷ۡ;->֫֫:J

    .line 534
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
