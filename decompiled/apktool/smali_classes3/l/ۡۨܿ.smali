.class public Ll/ۡۨܿ;
.super Landroid/view/View;
.source "YALU"


# instance fields
.field public ֫֫:I

.field public ۗ:Landroid/text/ClipboardManager;

.field public ۙ:Landroid/graphics/Paint;

.field public ۛ:[F

.field public ۟:Ljava/lang/String;

.field public ۤ:Ll/ۢۨܿ;

.field public ۧ֫:I

.field public ۨ:Landroid/widget/TextView;

.field public ۫:Landroid/graphics/Paint;

.field public ۬:Ljava/lang/String;

.field public ܰ:Landroid/graphics/Path;

.field public ܳ֫:Landroid/graphics/Paint;

.field public ܽ֫:I

.field public ܿ֫:I

.field public ᩳ֫:I

.field public ᩶:I

.field public ᩸:Landroid/graphics/Bitmap;

.field public ᩹:I

.field public ᩺:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 61
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Ll/ۡۨܿ;->ܰ:Landroid/graphics/Path;

    const/4 p1, 0x3

    new-array p1, p1, [F

    .line 49
    iput-object p1, p0, Ll/ۡۨܿ;->ۛ:[F

    const-string p1, ""

    .line 50
    iput-object p1, p0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Ll/ۡۨܿ;->۟:Ljava/lang/String;

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "clipboard"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/ClipboardManager;

    iput-object p1, p0, Ll/ۡۨܿ;->ۗ:Landroid/text/ClipboardManager;

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 69
    iget p1, p1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 71
    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Ll/ۡۨܿ;->᩺:Landroid/graphics/Paint;

    .line 73
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 74
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 75
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 77
    iput-object p2, p0, Ll/ۡۨܿ;->۫:Landroid/graphics/Paint;

    .line 79
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 80
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 81
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 82
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 83
    iput-object p2, p0, Ll/ۡۨܿ;->ۙ:Landroid/graphics/Paint;

    .line 85
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 86
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v0, 0x41400000    # 12.0f

    mul-float p1, p1, v0

    .line 88
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 89
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p1

    .line 90
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v1, p1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Ll/ۡۨܿ;->ᩳ֫:I

    .line 91
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->descent:F

    neg-float p1, p1

    float-to-int p1, p1

    iput p1, p0, Ll/ۡۨܿ;->ܿ֫:I

    .line 92
    iput-object p2, p0, Ll/ۡۨܿ;->ܳ֫:Landroid/graphics/Paint;

    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 152
    :try_start_0
    iget-object v1, p0, Ll/ۡۨܿ;->ۗ:Landroid/text/ClipboardManager;

    invoke-virtual {v1, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const p1, 0x7f120b8a

    .line 153
    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 157
    :goto_0
    iget-object v1, p0, Ll/ۡۨܿ;->ۨ:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 158
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    iget-object p1, p0, Ll/ۡۨܿ;->ۨ:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 160
    iget-object p1, p0, Ll/ۡۨܿ;->ۨ:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 161
    iget-object p1, p0, Ll/ۡۨܿ;->ۤ:Ll/ۢۨܿ;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 162
    iget-object p1, p0, Ll/ۡۨܿ;->ۤ:Ll/ۢۨܿ;

    const-wide/16 v1, 0x5dc

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 163
    iget-object p1, p0, Ll/ۡۨܿ;->ۨ:Landroid/widget/TextView;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const-string v1, "alpha"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x96

    .line 164
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 165
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_1

    .line 167
    :cond_0
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    :goto_1
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private ܽ(FF)I
    .locals 5

    .line 389
    iget v0, p0, Ll/ۡۨܿ;->᩹:I

    int-to-float v1, v0

    int-to-float v0, v0

    .line 392
    iget v2, p0, Ll/ۡۨܿ;->᩶:I

    int-to-float v2, v2

    sub-float/2addr p2, v2

    float-to-double v3, p2

    sub-float/2addr p1, v0

    float-to-double p1, p1

    .line 393
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    const/4 v3, 0x0

    sub-float/2addr v3, v2

    float-to-double v2, v3

    sub-float/2addr v1, v0

    float-to-double v0, v1

    .line 394
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    sub-double/2addr p1, v0

    .line 395
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    double-to-int p1, p1

    return p1
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 221
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object v8, v0, Ll/ۡۨܿ;->᩺:Landroid/graphics/Paint;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 222
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 225
    iget v1, v0, Ll/ۡۨܿ;->ܽ֫:I

    .line 226
    iget v9, v0, Ll/ۡۨܿ;->᩹:I

    .line 227
    iget v10, v0, Ll/ۡۨܿ;->᩶:I

    .line 229
    iget-object v11, v0, Ll/ۡۨܿ;->᩸:Landroid/graphics/Bitmap;

    const/4 v2, -0x1

    .line 230
    iget v12, v0, Ll/ۡۨܿ;->ᩳ֫:I

    if-nez v11, :cond_0

    .line 231
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v9

    int-to-float v3, v10

    int-to-float v4, v1

    .line 232
    invoke-virtual {v7, v2, v3, v4, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    sub-int/2addr v1, v12

    int-to-float v1, v1

    .line 233
    iget-object v4, v0, Ll/ۡۨܿ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {v7, v2, v3, v1, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    .line 236
    :cond_0
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    sub-int/2addr v1, v12

    mul-int/lit8 v14, v1, 0x2

    .line 238
    div-int v15, v14, v13

    mul-int v1, v15, v13

    .line 239
    div-int/lit8 v1, v1, 0x2

    add-int v6, v1, v12

    const/high16 v2, -0x1000000

    .line 242
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v5, v9

    int-to-float v4, v10

    const/16 v16, 0x2

    sub-int v3, v6, v12

    const/high16 v17, 0x3f800000    # 1.0f

    int-to-float v2, v3

    .line 243
    invoke-virtual {v7, v5, v4, v2, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 245
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    const/high16 v18, -0x1000000

    move/from16 v19, v2

    sub-int v2, v9, v1

    int-to-float v2, v2

    sub-int v1, v10, v1

    int-to-float v1, v1

    .line 247
    invoke-virtual {v7, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v21, 0x1

    .line 249
    iget-object v1, v0, Ll/ۡۨܿ;->۫:Landroid/graphics/Paint;

    if-ge v2, v13, :cond_3

    const/16 v21, 0x0

    move/from16 v22, v10

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v13, :cond_2

    .line 251
    invoke-virtual {v11, v2, v10}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v21

    move/from16 v23, v3

    and-int v3, v21, v18

    move/from16 v18, v4

    const/high16 v4, -0x1000000

    if-eq v3, v4, :cond_1

    const v21, -0x3f3f40

    const v3, -0x3f3f40

    goto :goto_2

    :cond_1
    move/from16 v3, v21

    .line 255
    :goto_2
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    mul-int v3, v2, v15

    mul-int v4, v10, v15

    move/from16 v24, v2

    int-to-float v2, v3

    move/from16 v25, v5

    int-to-float v5, v4

    add-int/2addr v3, v15

    add-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    add-int/2addr v4, v15

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    move-object/from16 v26, v1

    move-object/from16 v1, p1

    move/from16 v27, v9

    move/from16 v9, v19

    move/from16 v19, v24

    move/from16 v21, v3

    move v3, v5

    move/from16 v5, v18

    move/from16 v18, v4

    move/from16 v4, v21

    move v7, v5

    move/from16 v24, v9

    move/from16 v9, v25

    move/from16 v5, v18

    move/from16 v18, v7

    move v7, v6

    move-object/from16 v6, v26

    .line 258
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v10, v10, 0x1

    const/high16 v1, -0x1000000

    move v6, v7

    move v5, v9

    move/from16 v4, v18

    move/from16 v2, v19

    move/from16 v3, v23

    move/from16 v19, v24

    move-object/from16 v1, v26

    move/from16 v9, v27

    const/high16 v18, -0x1000000

    move-object/from16 v7, p1

    goto :goto_1

    :cond_2
    move/from16 v23, v3

    move/from16 v18, v4

    move v7, v6

    move/from16 v27, v9

    move/from16 v24, v19

    move/from16 v19, v2

    move v9, v5

    add-int/lit8 v2, v19, 0x1

    const/high16 v1, -0x1000000

    move/from16 v10, v22

    move/from16 v19, v24

    move/from16 v9, v27

    const/high16 v18, -0x1000000

    move-object/from16 v7, p1

    goto/16 :goto_0

    :cond_3
    move-object/from16 v26, v1

    move/from16 v23, v3

    move/from16 v18, v4

    move v7, v6

    move/from16 v27, v9

    move/from16 v22, v10

    move/from16 v24, v19

    move v9, v5

    .line 262
    invoke-static {}, Ll/۬ۨܿ;->᩷()Z

    move-result v1

    const v2, -0xf0f10

    if-eqz v1, :cond_5

    move-object/from16 v10, v26

    .line 263
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x1

    const/4 v6, 0x1

    :goto_3
    if-ge v6, v13, :cond_4

    mul-int v1, v6, v15

    int-to-float v5, v1

    int-to-float v4, v14

    const/4 v2, 0x0

    move-object/from16 v1, p1

    move v3, v5

    move/from16 v19, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move-object v6, v10

    .line 265
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v3, 0x0

    move/from16 v2, v25

    move/from16 v4, v25

    move/from16 v5, v19

    .line 266
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v6, v26, 0x1

    goto :goto_3

    :cond_4
    const v1, -0x5f5f60

    .line 268
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x1

    const/4 v6, 0x1

    :goto_4
    if-ge v6, v13, :cond_5

    mul-int v1, v6, v15

    add-int/lit8 v1, v1, 0x1

    int-to-float v5, v1

    int-to-float v4, v14

    const/4 v2, 0x0

    move-object/from16 v1, p1

    move v3, v5

    move/from16 v19, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move-object v6, v10

    .line 270
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v3, 0x0

    move/from16 v2, v25

    move/from16 v4, v25

    move/from16 v5, v19

    .line 271
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v6, v26, 0x1

    goto :goto_4

    .line 275
    :cond_5
    div-int/lit8 v13, v13, 0x2

    invoke-virtual {v11, v13, v13}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v10

    .line 278
    iget-object v1, v0, Ll/ۡۨܿ;->ۛ:[F

    invoke-static {v10, v1}, Ll/۟۫ۡ;->֫(I[F)V

    .line 279
    aget v2, v1, v21

    sub-float v2, v17, v2

    const v3, 0x3e99999a    # 0.3f

    mul-float v2, v2, v3

    aget v1, v1, v16

    const v11, 0x3f333333    # 0.7f

    mul-float v1, v1, v11

    add-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_6

    const/16 v20, 0x1

    :cond_6
    cmpg-float v14, v1, v11

    if-gtz v14, :cond_7

    const/4 v1, -0x1

    goto :goto_5

    :cond_7
    const v2, 0x3f666666    # 0.9f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_8

    const v1, -0xbbbbbc

    goto :goto_5

    :cond_8
    const v1, -0x666667

    .line 292
    :goto_5
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 293
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x40400000    # 3.0f

    .line 294
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    mul-int v13, v13, v15

    int-to-float v3, v13

    add-int/2addr v13, v15

    int-to-float v5, v13

    move-object/from16 v1, p1

    move v2, v3

    move v4, v5

    move-object v13, v6

    move-object v6, v8

    .line 296
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 297
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    int-to-float v1, v12

    .line 300
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 301
    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 302
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v7

    const/high16 v3, 0x40000000    # 2.0f

    div-float v12, v1, v3

    sub-float v1, v2, v12

    sub-float v1, v1, v17

    move-object/from16 v13, p1

    move/from16 v3, v18

    .line 303
    invoke-virtual {v13, v9, v3, v1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 305
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    if-eqz v20, :cond_9

    const v1, -0xf0f10

    goto :goto_6

    :cond_9
    const v1, -0x5f5f60

    .line 306
    :goto_6
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v1, v24

    .line 307
    invoke-virtual {v13, v9, v3, v1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 308
    invoke-virtual {v13, v9, v3, v2, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-eqz v20, :cond_a

    const v1, -0x5f5f60

    goto :goto_7

    :cond_a
    const v1, -0xf0f10

    .line 309
    :goto_7
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 v1, v23, 0x1

    int-to-float v1, v1

    .line 310
    invoke-virtual {v13, v9, v3, v1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v6, v7, -0x1

    int-to-float v1, v6

    .line 311
    invoke-virtual {v13, v9, v3, v1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 316
    invoke-static {}, Ll/۬ۨܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 368
    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x23

    .line 369
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v2, v10, 0x14

    and-int/lit8 v2, v2, 0xf

    const-string v3, "0123456789ABCDEF"

    .line 371
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v2, v10, 0x10

    and-int/lit8 v2, v2, 0xf

    .line 372
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v2, v10, 0xc

    and-int/lit8 v2, v2, 0xf

    .line 373
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v2, v10, 0x8

    and-int/lit8 v2, v2, 0xf

    .line 374
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v2, v10, 0x4

    and-int/lit8 v2, v2, 0xf

    .line 375
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v10, 0xf

    .line 376
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 377
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 317
    iput-object v1, v0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    goto :goto_8

    .line 319
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "R"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v2, v10, 0x10

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",G"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 v2, v10, 0x8

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",B"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v2, v10, 0xff

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    .line 323
    :goto_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, v0, Ll/ۡۨܿ;->֫֫:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Ll/ۡۨܿ;->ۧ֫:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡۨܿ;->۟:Ljava/lang/String;

    if-gtz v14, :cond_c

    const/4 v1, -0x1

    goto :goto_9

    :cond_c
    const/high16 v1, -0x1000000

    .line 325
    :goto_9
    iget-object v8, v0, Ll/ۡۨܿ;->ܳ֫:Landroid/graphics/Paint;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 327
    iget v1, v0, Ll/ۡۨܿ;->ܿ֫:I

    sub-int v3, v23, v1

    sub-int v1, v27, v3

    sub-int v10, v22, v3

    add-int v2, v27, v3

    add-int v3, v22, v3

    .line 333
    iget-object v6, v0, Ll/ۡۨܿ;->ܰ:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    int-to-float v5, v1

    int-to-float v10, v10

    int-to-float v4, v2

    int-to-float v3, v3

    .line 334
    invoke-static {}, Ll/۬ۨܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_d

    const/high16 v1, 0x43250000    # 165.0f

    const/high16 v19, 0x43250000    # 165.0f

    goto :goto_a

    :cond_d
    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v19, 0x43340000    # 180.0f

    :goto_a
    const/high16 v21, 0x42b40000    # 90.0f

    move-object v14, v6

    move v15, v5

    move/from16 v16, v10

    move/from16 v17, v4

    move/from16 v18, v3

    move/from16 v20, v21

    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->addArc(FFFFFF)V

    .line 335
    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 336
    iget-object v2, v0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v1, p1

    move-object v3, v6

    move/from16 v4, v23

    move/from16 v5, v24

    move-object/from16 v25, v6

    move-object v6, v8

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 345
    invoke-virtual/range {v25 .. v25}, Landroid/graphics/Path;->reset()V

    const v19, 0x438e8000    # 285.0f

    move-object/from16 v14, v25

    .line 346
    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->addArc(FFFFFF)V

    .line 347
    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 348
    iget-object v2, v0, Ll/ۡۨܿ;->۟:Ljava/lang/String;

    move-object/from16 v1, p1

    move-object/from16 v3, v25

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 356
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    add-int v10, v22, v7

    int-to-float v1, v10

    sub-float/2addr v1, v12

    .line 357
    invoke-virtual {v13, v9, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v1, 0x42340000    # 45.0f

    .line 358
    invoke-virtual {v13, v1}, Landroid/graphics/Canvas;->rotate(F)V

    mul-float v7, v12, v11

    const v1, 0x3de147ae    # 0.11f

    mul-float v9, v7, v1

    neg-float v10, v7

    neg-float v11, v9

    move-object/from16 v1, p1

    move v2, v10

    move v3, v11

    move v4, v7

    move v5, v9

    .line 361
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move v2, v11

    move v3, v10

    move v4, v9

    move v5, v7

    .line 362
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 363
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 382
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 383
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    add-int/lit8 p3, p3, -0x1

    iput p3, p0, Ll/ۡۨܿ;->ܽ֫:I

    .line 384
    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ۡۨܿ;->᩹:I

    .line 385
    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Ll/ۡۨܿ;->᩶:I

    return-void
.end method

.method public final ֫(FF)V
    .locals 4

    .line 106
    iget v0, p0, Ll/ۡۨܿ;->᩹:I

    int-to-float v0, v0

    sub-float v0, p1, v0

    .line 107
    iget v1, p0, Ll/ۡۨܿ;->᩶:I

    int-to-float v1, v1

    sub-float v1, p2, v1

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v1, v0

    float-to-double v0, v1

    .line 108
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 109
    iget v1, p0, Ll/ۡۨܿ;->ᩳ֫:I

    int-to-float v1, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float v1, v1, v2

    int-to-float v0, v0

    .line 110
    iget v2, p0, Ll/ۡۨܿ;->ܽ֫:I

    int-to-float v2, v2

    sub-float v3, v2, v1

    cmpg-float v3, v0, v3

    if-ltz v3, :cond_5

    add-float/2addr v2, v1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/ۡۨܿ;->ܽ(FF)I

    move-result p1

    const/16 p2, -0x46

    if-gt p2, p1, :cond_3

    const/4 p2, -0x5

    if-gt p1, p2, :cond_3

    .line 115
    invoke-static {}, Ll/۬ۨܿ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 116
    iget-object p1, p0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    const-string p2, "#"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 117
    iget-object p1, p0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۡۨܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 119
    :cond_1
    iget-object p1, p0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    const-string p2, "[RGB]"

    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۡۨܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 122
    :cond_2
    iget-object p1, p0, Ll/ۡۨܿ;->۬:Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/ۡۨܿ;->֫(Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 p2, 0x5

    if-gt p2, p1, :cond_4

    const/16 p2, 0x46

    if-gt p1, p2, :cond_4

    .line 125
    iget-object p1, p0, Ll/ۡۨܿ;->۟:Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/ۡۨܿ;->֫(Ljava/lang/String;)V

    return-void

    :cond_4
    const/16 p2, 0xa0

    if-gt p2, p1, :cond_5

    const/16 p2, 0xc8

    if-gt p1, p2, :cond_5

    .line 127
    new-instance p1, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p2

    const-class v0, Ll/ۗۨܿ;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 128
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    :cond_5
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/graphics/Bitmap;II)V
    .locals 2

    .line 96
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 99
    iput-object p1, p0, Ll/ۡۨܿ;->᩸:Landroid/graphics/Bitmap;

    .line 100
    iput p2, p0, Ll/ۡۨܿ;->֫֫:I

    .line 101
    iput p3, p0, Ll/ۡۨܿ;->ۧ֫:I

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 97
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 172
    iput-object p1, p0, Ll/ۡۨܿ;->ۨ:Landroid/widget/TextView;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 173
    :cond_0
    new-instance v0, Ll/ۢۨܿ;

    invoke-direct {v0, p1}, Ll/ۢۨܿ;-><init>(Landroid/widget/TextView;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Ll/ۡۨܿ;->ۤ:Ll/ۢۨܿ;

    return-void
.end method

.method public final ۧ(FF)Z
    .locals 4

    .line 133
    iget v0, p0, Ll/ۡۨܿ;->᩹:I

    int-to-float v0, v0

    sub-float v0, p1, v0

    .line 134
    iget v1, p0, Ll/ۡۨܿ;->᩶:I

    int-to-float v1, v1

    sub-float v1, p2, v1

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v1, v0

    float-to-double v0, v1

    .line 135
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 136
    iget v1, p0, Ll/ۡۨܿ;->ᩳ֫:I

    int-to-float v1, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float v1, v1, v2

    int-to-float v0, v0

    .line 137
    iget v2, p0, Ll/ۡۨܿ;->ܽ֫:I

    int-to-float v2, v2

    sub-float v3, v2, v1

    cmpg-float v3, v0, v3

    if-ltz v3, :cond_1

    add-float/2addr v2, v1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/ۡۨܿ;->ܽ(FF)I

    move-result p1

    const/16 p2, -0x46

    if-gt p2, p1, :cond_1

    const/4 p2, -0x5

    if-gt p1, p2, :cond_1

    .line 142
    invoke-static {}, Ll/۬ۨܿ;->᩻()Z

    move-result p1

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    invoke-static {p1}, Ll/۬ۨܿ;->֫(Z)V

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return p2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
