.class public Ll/ۤ᩷ۡ;
.super Landroid/view/View;
.source "N933"


# instance fields
.field public final ֡֫:Landroid/graphics/Paint;

.field public final ֨֫:I

.field public final ֫֫:Landroid/graphics/Rect;

.field public final ۖ֫:Landroid/graphics/Paint;

.field public final ۗ:Landroid/graphics/Rect;

.field public ۘ֫:F

.field public final ۙ:Ll/ۗ᩷ۡ;

.field public ۚ֫:Z

.field public final ۛ:[F

.field public final ۜ֫:I

.field public final ۟:I

.field public final ۠֫:I

.field public ۡ֫:Landroid/graphics/Path;

.field public final ۢ֫:I

.field public final ۤ:F

.field public final ۧ֫:I

.field public ۨ:F

.field public final ۫:I

.field public ۬:I

.field public final ܰ:Ll/۬᩷ۡ;

.field public ܳ֫:Ll/᩸ۙۡ;

.field public ܶ֫:Landroid/graphics/Point;

.field public final ܺ֫:I

.field public final ܽ֫:I

.field public final ܿ֫:Landroid/graphics/Paint;

.field public final ᩳ֫:I

.field public final ᩴ֫:Ll/۫᩷ۡ;

.field public final ᩵֫:Landroid/graphics/Rect;

.field public final ᩶:Ll/ۗ᩷ۡ;

.field public final ᩷֫:Landroid/graphics/Point;

.field public ᩸:I

.field public ᩸֫:F

.field public final ᩹:Ll/ۙ᩷ۡ;

.field public final ᩺:Landroid/graphics/Paint;

.field public final ᩻֫:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, v0}, Ll/ۤ᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 84
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷ۡ;->ܿ֫:Landroid/graphics/Paint;

    .line 47
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Ll/ۤ᩷ۡ;->֡֫:Landroid/graphics/Paint;

    .line 48
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Ll/ۤ᩷ۡ;->᩺:Landroid/graphics/Paint;

    .line 49
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۤ᩷ۡ;->ۖ֫:Landroid/graphics/Paint;

    .line 51
    new-instance v1, Ll/۫᩷ۡ;

    invoke-direct {v1}, Ll/۫᩷ۡ;-><init>()V

    iput-object v1, p0, Ll/ۤ᩷ۡ;->ᩴ֫:Ll/۫᩷ۡ;

    .line 52
    new-instance v1, Ll/۬᩷ۡ;

    .line 597
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object v1, p0, Ll/ۤ᩷ۡ;->ܰ:Ll/۬᩷ۡ;

    .line 53
    new-instance v1, Ll/ۙ᩷ۡ;

    invoke-direct {v1}, Ll/ۙ᩷ۡ;-><init>()V

    iput-object v1, p0, Ll/ۤ᩷ۡ;->᩹:Ll/ۙ᩷ۡ;

    const/16 v1, 0xff

    .line 56
    iput v1, p0, Ll/ۤ᩷ۡ;->᩸:I

    const/high16 v1, 0x43b40000    # 360.0f

    .line 57
    iput v1, p0, Ll/ۤ᩷ۡ;->ۨ:F

    const/4 v1, 0x0

    .line 58
    iput v1, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    .line 59
    iput v1, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    const/4 v2, 0x1

    .line 61
    iput-boolean v2, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    const v3, -0x919192

    .line 63
    iput v3, p0, Ll/ۤ᩷ۡ;->۬:I

    .line 67
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Ll/ۤ᩷ۡ;->᩵֫:Landroid/graphics/Rect;

    .line 68
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Ll/ۤ᩷ۡ;->֫֫:Landroid/graphics/Rect;

    .line 69
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Ll/ۤ᩷ۡ;->ۗ:Landroid/graphics/Rect;

    .line 142
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    iput-object v3, p0, Ll/ۤ᩷ۡ;->᩷֫:Landroid/graphics/Point;

    const/4 v3, 0x3

    new-array v3, v3, [F

    .line 143
    iput-object v3, p0, Ll/ۤ᩷ۡ;->ۛ:[F

    const/4 v3, 0x0

    .line 288
    iput-object v3, p0, Ll/ۤ᩷ۡ;->ܶ֫:Landroid/graphics/Point;

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Ll/ۤ᩷ۡ;->ۤ:F

    const/high16 p1, 0x43340000    # 180.0f

    .line 87
    invoke-direct {p0, p1}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result p1

    iput p1, p0, Ll/ۤ᩷ۡ;->۟:I

    const/high16 p1, 0x41c80000    # 25.0f

    .line 88
    invoke-direct {p0, p1}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result p1

    iput p1, p0, Ll/ۤ᩷ۡ;->᩻֫:I

    const/high16 v3, 0x41400000    # 12.0f

    .line 89
    invoke-direct {p0, v3}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v3

    iput v3, p0, Ll/ۤ᩷ۡ;->ۜ֫:I

    const/high16 v4, 0x40800000    # 4.0f

    .line 90
    invoke-direct {p0, v4}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v5

    iput v5, p0, Ll/ۤ᩷ۡ;->۫:I

    .line 91
    invoke-direct {p0, v4}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v4

    iput v4, p0, Ll/ۤ᩷ۡ;->۠֫:I

    const/high16 v6, 0x40000000    # 2.0f

    .line 92
    invoke-direct {p0, v6}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v7

    iput v7, p0, Ll/ۤ᩷ۡ;->֨֫:I

    .line 93
    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, p1

    iput v3, p0, Ll/ۤ᩷ۡ;->ܺ֫:I

    .line 94
    invoke-direct {p0, v6}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v3

    iput v3, p0, Ll/ۤ᩷ۡ;->ۢ֫:I

    const/high16 v3, 0x41c00000    # 24.0f

    .line 95
    invoke-direct {p0, v3}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v3

    iput v3, p0, Ll/ۤ᩷ۡ;->ᩳ֫:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 96
    invoke-direct {p0, v3}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v8

    iput v8, p0, Ll/ۤ᩷ۡ;->ܽ֫:I

    .line 98
    div-int/lit8 v4, v4, 0x2

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Ll/ۤ᩷ۡ;->ۧ֫:I

    .line 100
    div-int/lit8 p1, p1, 0x5

    add-int/2addr p1, v2

    .line 101
    new-instance v4, Ll/ۗ᩷ۡ;

    invoke-direct {v4, p1}, Ll/ۗ᩷ۡ;-><init>(I)V

    iput-object v4, p0, Ll/ۤ᩷ۡ;->᩶:Ll/ۗ᩷ۡ;

    .line 102
    new-instance v4, Ll/ۗ᩷ۡ;

    invoke-direct {v4, p1}, Ll/ۗ᩷ۡ;-><init>(I)V

    iput-object v4, p0, Ll/ۤ᩷ۡ;->ۙ:Ll/ۗ᩷ۡ;

    .line 104
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 105
    invoke-direct {p0, v3}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 106
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const p2, -0x424243

    .line 107
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 109
    invoke-direct {p0, v6}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 110
    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 111
    invoke-direct {p0, v3}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result p1

    int-to-float p1, p1

    const p2, -0x777778

    invoke-virtual {v0, p1, v1, v1, p2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 113
    invoke-virtual {p0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 114
    invoke-virtual {p0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    return-void
.end method

.method private ֫(F)I
    .locals 1

    .line 552
    iget v0, p0, Ll/ۤ᩷ۡ;->ۤ:F

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method private ֫(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 320
    iget-object v0, p0, Ll/ۤ᩷ۡ;->ܶ֫:Landroid/graphics/Point;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 324
    :cond_0
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 325
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 326
    iget-object v3, p0, Ll/ۤ᩷ۡ;->᩵֫:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    iget v5, p0, Ll/ۤ᩷ۡ;->ۜ֫:I

    const/4 v6, 0x2

    div-int/2addr v5, v6

    add-int/2addr v4, v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ge v0, v4, :cond_5

    .line 327
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 237
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    .line 238
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    .line 240
    iget v5, v3, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    cmpg-float v9, v0, v5

    if-gez v9, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 242
    :cond_1
    iget v9, v3, Landroid/graphics/Rect;->right:I

    int-to-float v9, v9

    cmpl-float v9, v0, v9

    if-lez v9, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    sub-float/2addr v0, v5

    .line 248
    :goto_0
    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    cmpg-float v9, p1, v5

    if-gez v9, :cond_3

    goto :goto_1

    .line 250
    :cond_3
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    cmpl-float v3, p1, v3

    if-lez v3, :cond_4

    move v7, v4

    goto :goto_1

    :cond_4
    sub-float v7, p1, v5

    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    div-float v2, p1, v2

    mul-float v2, v2, v0

    div-float v0, p1, v4

    mul-float v0, v0, v7

    sub-float/2addr p1, v0

    new-array v0, v6, [F

    aput v2, v0, v1

    aput p1, v0, v8

    .line 328
    aget p1, v0, v1

    iput p1, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    .line 329
    aget p1, v0, v8

    iput p1, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    return v8

    .line 331
    :cond_5
    iget v3, p0, Ll/ۤ᩷ۡ;->ܺ֫:I

    mul-int/lit8 v3, v3, 0x2

    if-le v2, v3, :cond_b

    .line 332
    iget-object v2, p0, Ll/ۤ᩷ۡ;->֫֫:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v3

    if-ge v0, v5, :cond_8

    .line 333
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 264
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 265
    iget v1, v2, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    cmpg-float v3, p1, v1

    if-gez v3, :cond_6

    goto :goto_2

    .line 267
    :cond_6
    iget v2, v2, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    cmpl-float v2, p1, v2

    if-lez v2, :cond_7

    move v7, v0

    goto :goto_2

    :cond_7
    sub-float v7, p1, v1

    :goto_2
    const/high16 p1, 0x43b40000    # 360.0f

    mul-float v7, v7, p1

    div-float/2addr v7, v0

    .line 333
    iput v7, p0, Ll/ۤ᩷ۡ;->ۨ:F

    return v8

    .line 335
    :cond_8
    iget-boolean v0, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    if-eqz v0, :cond_b

    .line 336
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    .line 277
    iget-object v0, p0, Ll/ۤ᩷ۡ;->ۗ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 278
    iget v3, v0, Landroid/graphics/Rect;->left:I

    if-ge p1, v3, :cond_9

    goto :goto_3

    .line 280
    :cond_9
    iget v0, v0, Landroid/graphics/Rect;->right:I

    if-le p1, v0, :cond_a

    move v1, v2

    goto :goto_3

    :cond_a
    sub-int v1, p1, v3

    :goto_3
    mul-int/lit16 v1, v1, 0xff

    .line 285
    div-int/2addr v1, v2

    .line 336
    iput v1, p0, Ll/ۤ᩷ۡ;->᩸:I

    return v8

    :cond_b
    :goto_4
    return v1
.end method


# virtual methods
.method public final getPaddingBottom()I
    .locals 2

    .line 433
    invoke-super {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    iget v1, p0, Ll/ۤ᩷ۡ;->ۧ֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getPaddingLeft()I
    .locals 2

    .line 438
    invoke-super {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget v1, p0, Ll/ۤ᩷ۡ;->ۧ֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getPaddingRight()I
    .locals 2

    .line 443
    invoke-super {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iget v1, p0, Ll/ۤ᩷ۡ;->ۧ֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getPaddingTop()I
    .locals 2

    .line 428
    invoke-super {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget v1, p0, Ll/ۤ᩷ۡ;->ۧ֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v9, p1

    .line 153
    iget v1, v0, Ll/ۤ᩷ۡ;->۬:I

    iget-object v10, v0, Ll/ۤ᩷ۡ;->ܿ֫:Landroid/graphics/Paint;

    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 154
    iget-object v7, v0, Ll/ۤ᩷ۡ;->᩵֫:Landroid/graphics/Rect;

    iget v1, v7, Landroid/graphics/Rect;->left:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v2, v1

    iget v1, v7, Landroid/graphics/Rect;->top:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v3, v1

    iget v1, v7, Landroid/graphics/Rect;->right:I

    add-int/lit8 v1, v1, 0x1

    int-to-float v4, v1

    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, 0x1

    int-to-float v5, v1

    move-object/from16 v1, p1

    move-object v6, v10

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 156
    iget v1, v0, Ll/ۤ᩷ۡ;->ۨ:F

    iget-object v2, v0, Ll/ۤ᩷ۡ;->ᩴ֫:Ll/۫᩷ۡ;

    invoke-virtual {v2, v7, v1}, Ll/۫᩷ۡ;->֫(Landroid/graphics/Rect;F)V

    .line 157
    invoke-virtual {v2, v9}, Ll/۫᩷ۡ;->֫(Landroid/graphics/Canvas;)V

    .line 159
    iget v1, v0, Ll/ۤ᩷ۡ;->ۘ֫:F

    iget v2, v0, Ll/ۤ᩷ۡ;->᩸֫:F

    .line 220
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    .line 221
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    mul-float v1, v1, v4

    .line 222
    iget v4, v7, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    add-float/2addr v1, v4

    float-to-int v1, v1

    iget-object v11, v0, Ll/ۤ᩷ۡ;->᩷֫:Landroid/graphics/Point;

    iput v1, v11, Landroid/graphics/Point;->x:I

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, v1, v2

    mul-float v2, v2, v3

    .line 223
    iget v3, v7, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v11, Landroid/graphics/Point;->y:I

    const v2, -0xbbbbbc

    .line 160
    iget-object v3, v0, Ll/ۤ᩷ۡ;->֡֫:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 161
    iget v2, v11, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget v4, v11, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    invoke-direct {p0, v1}, Ll/ۤ᩷ۡ;->֫(F)I

    move-result v1

    iget v5, v0, Ll/ۤ᩷ۡ;->۫:I

    sub-int v1, v5, v1

    int-to-float v1, v1

    invoke-virtual {v9, v2, v4, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const v1, -0x222223

    .line 162
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v11, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v4, v5

    invoke-virtual {v9, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 169
    iget-object v1, v0, Ll/ۤ᩷ۡ;->ܰ:Ll/۬᩷ۡ;

    iget-object v2, v0, Ll/ۤ᩷ۡ;->֫֫:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Ll/۬᩷ۡ;->֫(Landroid/graphics/Rect;)V

    .line 170
    invoke-virtual {v1, v9}, Ll/۬᩷ۡ;->֫(Landroid/graphics/Canvas;)V

    .line 172
    iget v1, v0, Ll/ۤ᩷ۡ;->ۨ:F

    .line 213
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    mul-float v1, v1, v3

    const/high16 v3, 0x43b40000    # 360.0f

    div-float/2addr v1, v3

    .line 214
    iget v3, v2, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, v11, Landroid/graphics/Point;->x:I

    .line 215
    iget v3, v2, Landroid/graphics/Rect;->top:I

    iput v3, v11, Landroid/graphics/Point;->y:I

    .line 173
    iget v12, v0, Ll/ۤ᩷ۡ;->֨֫:I

    sub-int/2addr v3, v12

    int-to-float v3, v3

    .line 174
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v12

    int-to-float v5, v2

    int-to-float v1, v1

    .line 175
    iget v2, v0, Ll/ۤ᩷ۡ;->۠֫:I

    int-to-float v2, v2

    const/high16 v6, 0x40000000    # 2.0f

    div-float v13, v2, v6

    sub-float v2, v1, v13

    add-float v4, v1, v13

    const/high16 v7, 0x40000000    # 2.0f

    .line 177
    iget-object v14, v0, Ll/ۤ᩷ۡ;->᩺:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v8, v14

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 181
    iget-boolean v1, v0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    if-eqz v1, :cond_0

    .line 183
    iget-object v1, v0, Ll/ۤ᩷ۡ;->᩶:Ll/ۗ᩷ۡ;

    invoke-virtual {v1, v9}, Ll/ۗ᩷ۡ;->draw(Landroid/graphics/Canvas;)V

    .line 184
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->֫()I

    move-result v1

    iget-object v2, v0, Ll/ۤ᩷ۡ;->᩹:Ll/ۙ᩷ۡ;

    iget-object v3, v0, Ll/ۤ᩷ۡ;->ۗ:Landroid/graphics/Rect;

    invoke-virtual {v2, v1, v3}, Ll/ۙ᩷ۡ;->֫(ILandroid/graphics/Rect;)V

    .line 185
    invoke-virtual {v2, v9}, Ll/ۙ᩷ۡ;->֫(Landroid/graphics/Canvas;)V

    .line 186
    iget v1, v0, Ll/ۤ᩷ۡ;->᩸:I

    .line 228
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float v1, v1, v2

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    .line 229
    iget v2, v3, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v11, Landroid/graphics/Point;->x:I

    .line 230
    iget v2, v3, Landroid/graphics/Rect;->top:I

    iput v2, v11, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    sub-float v4, v1, v13

    add-float v5, v13, v1

    sub-int/2addr v2, v12

    int-to-float v6, v2

    .line 190
    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v12

    int-to-float v7, v1

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v11, 0x40000000    # 2.0f

    move-object/from16 v1, p1

    move v2, v4

    move v3, v6

    move v4, v5

    move v5, v7

    move v6, v8

    move v7, v11

    move-object v8, v14

    .line 191
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 195
    :cond_0
    iget-object v1, v0, Ll/ۤ᩷ۡ;->ۡ֫:Landroid/graphics/Path;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 198
    iget-object v3, v0, Ll/ۤ᩷ۡ;->ۖ֫:Landroid/graphics/Paint;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 199
    invoke-virtual {v9, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 201
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 202
    invoke-virtual {v9, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 203
    iget-object v2, v0, Ll/ۤ᩷ۡ;->ۙ:Ll/ۗ᩷ۡ;

    invoke-virtual {v2, v9}, Ll/ۗ᩷ۡ;->draw(Landroid/graphics/Canvas;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 206
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->֫()I

    move-result v2

    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 207
    invoke-virtual {v9, v1, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    move-object/from16 v0, p0

    .line 367
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 372
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩷ۡ;->getPaddingLeft()I

    move-result v1

    .line 373
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩷ۡ;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 374
    invoke-virtual/range {p0 .. p0}, Ll/ۤ᩷ۡ;->getPaddingTop()I

    move-result v3

    .line 377
    iget-boolean v4, v0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    add-int/lit8 v5, v1, 0x1

    add-int/lit8 v6, v2, -0x1

    add-int/lit8 v3, v3, 0x1

    .line 383
    iget v7, v0, Ll/ۤ᩷ۡ;->۟:I

    add-int/2addr v7, v3

    .line 384
    iget-object v8, v0, Ll/ۤ᩷ۡ;->᩵֫:Landroid/graphics/Rect;

    invoke-virtual {v8, v5, v3, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 388
    iget v3, v0, Ll/ۤ᩷ۡ;->ᩳ֫:I

    iget v5, v0, Ll/ۤ᩷ۡ;->ܺ֫:I

    if-eqz v4, :cond_0

    move v6, v5

    goto :goto_0

    :cond_0
    move v6, v3

    :goto_0
    if-eqz v4, :cond_1

    .line 389
    iget v7, v0, Ll/ۤ᩷ۡ;->ۢ֫:I

    goto :goto_1

    :cond_1
    iget v7, v0, Ll/ۤ᩷ۡ;->ܽ֫:I

    .line 390
    :goto_1
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    iput-object v9, v0, Ll/ۤ᩷ۡ;->ۡ֫:Landroid/graphics/Path;

    .line 391
    iget v10, v8, Landroid/graphics/Rect;->left:I

    .line 392
    iget v11, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v11, v11, 0x1

    iget v12, v0, Ll/ۤ᩷ۡ;->ۜ֫:I

    add-int/2addr v11, v12

    mul-int/lit8 v13, v6, 0x2

    add-int v14, v11, v13

    add-int v15, v10, v6

    int-to-float v15, v15

    move/from16 p1, v3

    add-int v3, v11, v6

    int-to-float v3, v3

    sub-int/2addr v6, v7

    int-to-float v6, v6

    move/from16 p2, v2

    .line 394
    sget-object v2, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v15, v3, v6, v2}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    add-int v2, v10, v7

    add-int v3, v11, v7

    add-int/2addr v10, v13

    sub-int/2addr v10, v7

    sub-int v6, v14, v7

    .line 395
    iget-object v7, v0, Ll/ۤ᩷ۡ;->ۙ:Ll/ۗ᩷ۡ;

    invoke-virtual {v7, v2, v3, v10, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 403
    iget-object v2, v0, Ll/ۤ᩷ۡ;->֫֫:Landroid/graphics/Rect;

    iget v3, v0, Ll/ۤ᩷ۡ;->᩻֫:I

    const/4 v6, 0x2

    if-eqz v4, :cond_2

    invoke-static {v5, v6, v1, v12}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v7

    .line 405
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v8, v8, 0x1

    add-int/2addr v8, v12

    add-int v9, v8, v3

    move/from16 v10, p2

    .line 407
    invoke-virtual {v2, v7, v8, v10, v9}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_2

    :cond_2
    move/from16 v10, p2

    int-to-float v7, v3

    const v8, 0x3f99999a    # 1.2f

    mul-float v7, v7, v8

    float-to-int v7, v7

    move/from16 v8, p1

    .line 409
    invoke-static {v8, v6, v1, v12}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v8

    add-int/2addr v11, v14

    .line 411
    div-int/2addr v11, v6

    div-int/lit8 v9, v7, 0x2

    sub-int/2addr v11, v9

    add-int/2addr v7, v11

    .line 413
    invoke-virtual {v2, v8, v11, v10, v7}, Landroid/graphics/Rect;->set(IIII)V

    :goto_2
    if-eqz v4, :cond_3

    .line 416
    invoke-static {v5, v6, v1, v12}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v1

    .line 418
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v12

    add-int/2addr v3, v2

    .line 420
    iget-object v4, v0, Ll/ۤ᩷ۡ;->ۗ:Landroid/graphics/Rect;

    invoke-virtual {v4, v1, v2, v10, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 421
    iget-object v1, v0, Ll/ۤ᩷ۡ;->᩶:Ll/ۗ᩷ۡ;

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_3
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 345
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 347
    iget-boolean p2, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    iget v0, p0, Ll/ۤ᩷ۡ;->ۜ֫:I

    iget v1, p0, Ll/ۤ᩷ۡ;->۟:I

    if-eqz p2, :cond_0

    .line 348
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->getPaddingTop()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    add-int/2addr p2, v1

    add-int/lit8 p2, p2, 0x1

    add-int/2addr p2, v0

    iget v1, p0, Ll/ۤ᩷ۡ;->᩻֫:I

    invoke-static {p2, v1, v0, v1}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p2

    .line 354
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    .line 356
    :cond_0
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->getPaddingTop()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    add-int/2addr p2, v1

    add-int/lit8 p2, p2, 0x1

    add-int/2addr p2, v0

    iget v0, p0, Ll/ۤ᩷ۡ;->ᩳ֫:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    iget p2, p0, Ll/ۤ᩷ۡ;->ܽ֫:I

    sub-int/2addr v0, p2

    .line 360
    invoke-virtual {p0}, Ll/ۤ᩷ۡ;->getPaddingBottom()I

    move-result p2

    :goto_0
    add-int/2addr v0, p2

    .line 362
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 131
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "alpha"

    .line 132
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۤ᩷ۡ;->᩸:I

    const-string v0, "hue"

    .line 133
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ۤ᩷ۡ;->ۨ:F

    const-string v0, "sat"

    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    const-string v0, "val"

    .line 135
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    const-string v0, "show_alpha"

    .line 136
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    const-string v0, "instanceState"

    .line 137
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 139
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 119
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "instanceState"

    .line 120
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "alpha"

    .line 121
    iget v2, p0, Ll/ۤ᩷ۡ;->᩸:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "hue"

    .line 122
    iget v2, p0, Ll/ۤ᩷ۡ;->ۨ:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "sat"

    .line 123
    iget v2, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "val"

    .line 124
    iget v2, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "show_alpha"

    .line 125
    iget-boolean v2, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 294
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 303
    :cond_0
    invoke-direct {p0, p1}, Ll/ۤ᩷ۡ;->֫(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 306
    iput-object v0, p0, Ll/ۤ᩷ۡ;->ܶ֫:Landroid/graphics/Point;

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    .line 296
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_3

    .line 297
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 299
    :cond_3
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {v0, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Ll/ۤ᩷ۡ;->ܶ֫:Landroid/graphics/Point;

    .line 300
    invoke-direct {p0, p1}, Ll/ۤ᩷ۡ;->֫(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_5

    .line 310
    iget-object p1, p0, Ll/ۤ᩷ۡ;->ܳ֫:Ll/᩸ۙۡ;

    if-eqz p1, :cond_4

    .line 311
    iget v0, p0, Ll/ۤ᩷ۡ;->᩸:I

    iget v4, p0, Ll/ۤ᩷ۡ;->ۨ:F

    iget v5, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    iget v6, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    const/4 v7, 0x3

    new-array v7, v7, [F

    aput v4, v7, v3

    aput v5, v7, v2

    aput v6, v7, v1

    invoke-static {v0, v7}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    iget-object p1, p1, Ll/᩸ۙۡ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۘۗܿ;

    invoke-static {p1, v0}, Ll/ۘۗܿ;->֫(Ll/ۘۗܿ;I)V

    .line 313
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    .line 316
    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 3

    const/4 v0, 0x0

    .line 463
    iget v1, p0, Ll/ۤ᩷ۡ;->ۨ:F

    iget-object v2, p0, Ll/ۤ᩷ۡ;->ۛ:[F

    aput v1, v2, v0

    const/4 v0, 0x1

    .line 464
    iget v1, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    aput v1, v2, v0

    const/4 v0, 0x2

    .line 465
    iget v1, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    aput v1, v2, v0

    .line 466
    iget v0, p0, Ll/ۤ᩷ۡ;->᩸:I

    invoke-static {v0, v2}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 486
    iget-object v0, p0, Ll/ۤ᩷ۡ;->ۛ:[F

    invoke-static {p1, v0}, Ll/۟۫ۡ;->֫(I[F)V

    const/4 v1, 0x0

    .line 487
    aget v1, v0, v1

    iput v1, p0, Ll/ۤ᩷ۡ;->ۨ:F

    const/4 v1, 0x1

    .line 488
    aget v1, v0, v1

    iput v1, p0, Ll/ۤ᩷ۡ;->ۘ֫:F

    const/4 v1, 0x2

    .line 489
    aget v0, v0, v1

    iput v0, p0, Ll/ۤ᩷ۡ;->᩸֫:F

    .line 490
    iget-boolean v0, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    if-eqz v0, :cond_0

    .line 491
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    iput p1, p0, Ll/ۤ᩷ۡ;->᩸:I

    goto :goto_0

    :cond_0
    const/16 p1, 0xff

    .line 493
    iput p1, p0, Ll/ۤ᩷ۡ;->᩸:I

    .line 498
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ll/᩸ۙۡ;)V
    .locals 0

    .line 453
    iput-object p1, p0, Ll/ۤ᩷ۡ;->ܳ֫:Ll/᩸ۙۡ;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 508
    iget-boolean v0, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 509
    iput-boolean v0, p0, Ll/ۤ᩷ۡ;->ۚ֫:Z

    .line 510
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method
