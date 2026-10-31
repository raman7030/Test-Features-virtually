.class public final Ll/ۡ۟ᩳ;
.super Ljava/lang/Object;
.source "35IJ"


# static fields
.field public static final ֨:Ll/֡ۛۡ;

.field public static final ۠:I

.field public static ܶ:Z


# instance fields
.field public ֡:I

.field public ֫:Z

.field public ۖ:Ll/۫ۨᩳ;

.field public ۘ:I

.field public ۚ:I

.field public final ۜ:Landroid/graphics/Bitmap;

.field public final ۡ:Ll/ۙۖ;

.field public ۢ:Landroid/graphics/Paint;

.field public ۧ:Z

.field public ܳ:I

.field public ܺ:I

.field public ܽ:Ll/֨ۚۢ;

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public final ᩷:Landroid/graphics/Canvas;

.field public ᩻:Ll/ᩳۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 52
    new-instance v0, Ll/֡ۛۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۡ۟ᩳ;->֨:Ll/֡ۛۡ;

    const/high16 v0, 0x40200000    # 2.5f

    .line 114
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    sput v0, Ll/ۡ۟ᩳ;->۠:I

    .line 209
    sput-boolean v1, Ll/ۡ۟ᩳ;->ܶ:Z

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 7

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ll/ۡ۟ᩳ;->ۧ:Z

    .line 46
    new-instance v1, Ll/֨ۚۢ;

    new-instance v2, Ll/֫᩺ᩳ;

    invoke-direct {v2, p0}, Ll/֫᩺ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, p0, v2}, Ll/֨ۚۢ;-><init>(Ljava/lang/Object;Ll/ۚۚۢ;)V

    iput-object v1, p0, Ll/ۡ۟ᩳ;->ܽ:Ll/֨ۚۢ;

    .line 47
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Ll/ۡ۟ᩳ;->ۢ:Landroid/graphics/Paint;

    .line 58
    iput-object p1, p0, Ll/ۡ۟ᩳ;->ۖ:Ll/۫ۨᩳ;

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x1010054

    .line 60
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 130
    invoke-static {v4, v3}, Ll/᩸֡᩷;->ۧ(Landroid/content/res/Resources$Theme;I)I

    move-result v3

    .line 60
    iput v3, p0, Ll/ۡ۟ᩳ;->ᩴ:I

    const/high16 v3, -0x10000

    .line 61
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    new-instance v1, Ll/ۙۖ;

    const/4 v3, 0x0

    const v4, 0x7f0403bd

    invoke-direct {v1, v2, v3, v4}, Ll/ۙۖ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v1, p0, Ll/ۡ۟ᩳ;->ۡ:Ll/ۙۖ;

    const/high16 v3, 0x42b40000    # 90.0f

    .line 63
    invoke-static {v3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v3

    iput v3, p0, Ll/ۡ۟ᩳ;->ۘ:I

    const/high16 v4, 0x420c0000    # 35.0f

    .line 64
    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    iput v4, p0, Ll/ۡ۟ᩳ;->ܳ:I

    int-to-float v5, v3

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float v5, v5, v6

    float-to-int v5, v5

    int-to-float v4, v4

    mul-float v4, v4, v6

    float-to-int v4, v4

    .line 67
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v4, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, p0, Ll/ۡ۟ᩳ;->ۜ:Landroid/graphics/Bitmap;

    .line 68
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v5, p0, Ll/ۡ۟ᩳ;->᩷:Landroid/graphics/Canvas;

    const/high16 v4, 0x42dc0000    # 110.0f

    .line 69
    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    iput v4, p0, Ll/ۡ۟ᩳ;->ۚ:I

    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f080197

    const v5, 0x7f080196

    invoke-static {v4, v5}, Ll/᩹֡᩷;->֫(II)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v2, -0x2

    .line 72
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 73
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 75
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 76
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 77
    iget v4, v2, Landroid/graphics/Rect;->left:I

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v5, v3, 0x4

    add-int/2addr v5, v4

    iput v5, p0, Ll/ۡ۟ᩳ;->֡:I

    .line 78
    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v2

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v4

    iput v3, p0, Ll/ۡ۟ᩳ;->ܺ:I

    const/4 v2, 0x0

    .line 80
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 81
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 82
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 83
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 85
    new-instance v0, Ll/ᩳۡ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ᩳۡ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۡ۟ᩳ;->᩻:Ll/ᩳۡ;

    const/high16 p1, 0x7f100000

    .line 86
    invoke-virtual {v0, p1}, Ll/ᩳۡ;->setImageResource(I)V

    .line 87
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Bitmap;II)V
    .locals 21

    move-object/from16 v0, p0

    .line 243
    iget-object v1, v0, Ll/ۡ۟ᩳ;->ۡ:Ll/ۙۖ;

    iget-object v2, v0, Ll/ۡ۟ᩳ;->ۖ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    .line 247
    iget v4, v0, Ll/ۡ۟ᩳ;->ۘ:I

    div-int/lit8 v5, v4, 0x2

    sub-int v5, p2, v5

    .line 248
    iget v6, v0, Ll/ۡ۟ᩳ;->ܳ:I

    div-int/lit8 v7, v6, 0x2

    sub-int v7, p3, v7

    const/4 v8, 0x0

    if-eq v3, v2, :cond_0

    const/4 v9, 0x2

    new-array v9, v9, [I

    .line 252
    invoke-virtual {v2, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 253
    aget v2, v9, v8

    add-int/2addr v5, v2

    const/4 v10, 0x1

    .line 254
    aget v9, v9, v10

    add-int/2addr v7, v9

    add-int v2, p2, v2

    add-int v9, p3, v9

    goto :goto_0

    :cond_0
    move/from16 v2, p2

    move/from16 v9, p3

    :goto_0
    if-gez v5, :cond_1

    add-int v10, v4, v5

    const/4 v11, 0x0

    move v11, v10

    move v10, v5

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    add-int v10, v5, v4

    .line 265
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    if-le v10, v11, :cond_2

    .line 266
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    sub-int v5, v10, v5

    sub-int v10, v4, v5

    .line 268
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    sub-int/2addr v11, v10

    move/from16 v20, v10

    move v10, v5

    move v5, v11

    move/from16 v11, v20

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    move v11, v4

    :goto_1
    if-gez v7, :cond_3

    const/4 v7, 0x0

    goto :goto_2

    :cond_3
    add-int v12, v7, v6

    .line 273
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    if-le v12, v13, :cond_4

    .line 274
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr v7, v6

    :cond_4
    :goto_2
    if-lez v11, :cond_b

    if-gtz v6, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object/from16 v12, p1

    .line 280
    invoke-static {v12, v5, v7, v11, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 310
    iget-object v7, v0, Ll/ۡ۟ᩳ;->ۜ:Landroid/graphics/Bitmap;

    invoke-virtual {v7, v8}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 313
    new-instance v8, Landroid/graphics/RectF;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    int-to-float v12, v12

    const/4 v13, 0x0

    invoke-direct {v8, v13, v13, v11, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v11, 0x0

    .line 315
    iget-object v12, v0, Ll/ۡ۟ᩳ;->ۢ:Landroid/graphics/Paint;

    invoke-virtual {v12, v11}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 316
    iget-object v11, v0, Ll/ۡ۟ᩳ;->᩷:Landroid/graphics/Canvas;

    const/high16 v14, 0x40c00000    # 6.0f

    invoke-virtual {v11, v8, v14, v14, v12}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 319
    new-instance v8, Landroid/graphics/PorterDuffXfermode;

    sget-object v14, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v8, v14}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 322
    invoke-virtual {v11}, Landroid/graphics/Canvas;->save()I

    const/high16 v8, 0x3fc00000    # 1.5f

    .line 323
    invoke-virtual {v11, v8, v8}, Landroid/graphics/Canvas;->scale(FF)V

    if-eqz v10, :cond_7

    .line 327
    invoke-virtual {v12}, Landroid/graphics/Paint;->getColor()I

    move-result v8

    .line 328
    iget v14, v0, Ll/ۡ۟ᩳ;->ᩴ:I

    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v4, v4

    int-to-float v6, v6

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v14, v11

    move/from16 v17, v4

    move/from16 v18, v6

    move-object/from16 v19, v12

    .line 329
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 330
    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setColor(I)V

    if-gez v10, :cond_6

    neg-int v4, v10

    int-to-float v4, v4

    goto :goto_3

    :cond_6
    const/4 v4, 0x0

    .line 334
    :goto_3
    invoke-virtual {v11, v5, v4, v13, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 336
    :cond_7
    invoke-virtual {v11, v5, v13, v13, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 339
    :goto_4
    invoke-virtual {v11}, Landroid/graphics/Canvas;->restore()V

    .line 342
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 286
    iget v4, v0, Ll/ۡ۟ᩳ;->֡:I

    sub-int/2addr v2, v4

    .line 287
    iget v4, v0, Ll/ۡ۟ᩳ;->ۚ:I

    sub-int/2addr v9, v4

    if-gez v2, :cond_8

    mul-int/lit8 v2, v2, 0x3

    .line 291
    div-int/lit8 v2, v2, 0x4

    goto :goto_5

    .line 292
    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    iget v5, v0, Ll/ۡ۟ᩳ;->ܺ:I

    sub-int/2addr v4, v5

    if-le v2, v4, :cond_9

    .line 293
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v4, v5

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x4

    add-int/2addr v2, v4

    .line 296
    :cond_9
    :goto_5
    iget-object v4, v0, Ll/ۡ۟ᩳ;->᩻:Ll/ᩳۡ;

    invoke-virtual {v4, v7}, Ll/ᩳۡ;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 299
    :try_start_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 300
    iget v3, v0, Ll/ۡ۟ᩳ;->᩵:I

    add-int/2addr v9, v3

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v4

    invoke-virtual {v1, v2, v9, v3, v4}, Landroid/widget/PopupWindow;->update(IIII)V

    return-void

    .line 302
    :cond_a
    iget v4, v0, Ll/ۡ۟ᩳ;->᩵:I

    add-int/2addr v9, v4

    const v4, 0x800033

    invoke-virtual {v1, v3, v4, v2, v9}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_b
    :goto_6
    return-void
.end method

.method private ֫(Landroid/view/View;II)V
    .locals 2

    const/4 v0, 0x1

    .line 228
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 229
    invoke-virtual {p1}, Landroid/view/View;->buildDrawingCache()V

    .line 230
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 233
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void

    .line 237
    :cond_0
    invoke-direct {p0, v0, p2, p3}, Ll/ۡ۟ᩳ;->֫(Landroid/graphics/Bitmap;II)V

    .line 238
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۡ۟ᩳ;Landroid/graphics/Bitmap;IILandroid/view/View;I)V
    .locals 2

    .line 187
    iget-boolean v0, p0, Ll/ۡ۟ᩳ;->֫:Z

    sget-object v1, Ll/ۡ۟ᩳ;->֨:Ll/֡ۛۡ;

    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v1, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 190
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void

    :cond_0
    if-nez p5, :cond_1

    .line 195
    invoke-direct {p0, p1, p2, p3}, Ll/ۡ۟ᩳ;->֫(Landroid/graphics/Bitmap;II)V

    goto :goto_0

    .line 198
    :cond_1
    invoke-direct {p0, p4, p2, p3}, Ll/ۡ۟ᩳ;->֫(Landroid/view/View;II)V

    .line 201
    :goto_0
    invoke-virtual {v1, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 202
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ۡ۟ᩳ;Ll/ۡ۟ᩳ;)V
    .locals 8

    .line 46
    iget v3, p0, Ll/ۡ۟ᩳ;->ᩳ:I

    iget v4, p0, Ll/ۡ۟ᩳ;->ܿ:I

    .line 139
    iget-object p0, p1, Ll/ۡ۟ᩳ;->ۖ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p1, Ll/ۡ۟ᩳ;->֫:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 142
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v5

    .line 145
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_6

    .line 213
    sget-boolean p0, Ll/ۡ۟ᩳ;->ܶ:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p0, :cond_1

    goto :goto_0

    .line 217
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string v2, "mWindow"

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v2, 0x1

    .line 218
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 219
    invoke-virtual {p0, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/Window;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 221
    :catch_0
    sput-boolean v0, Ll/ۡ۟ᩳ;->ܶ:Z

    :goto_0
    move-object p0, v1

    :goto_1
    if-nez p0, :cond_2

    .line 161
    invoke-direct {p1, v5, v3, v4}, Ll/ۡ۟ᩳ;->֫(Landroid/view/View;II)V

    goto :goto_4

    .line 165
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 166
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 169
    sget-object v6, Ll/ۡ۟ᩳ;->֨:Ll/֡ۛۡ;

    invoke-virtual {v6}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    if-eqz v6, :cond_4

    .line 171
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-ne v7, v1, :cond_4

    .line 172
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-eq v7, v2, :cond_3

    goto :goto_2

    .line 178
    :cond_3
    invoke-virtual {v6, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    .line 174
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 176
    :cond_5
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 183
    :goto_3
    new-instance v7, Ll/ۢ۟ᩳ;

    move-object v0, v7

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Ll/ۢ۟ᩳ;-><init>(Ll/ۡ۟ᩳ;Landroid/graphics/Bitmap;IILandroid/view/View;)V

    .line 205
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    .line 183
    invoke-static {p0, v6, v7, p1}, Landroid/view/PixelCopy;->request(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    goto :goto_4

    .line 149
    :cond_6
    invoke-direct {p1, v5, v3, v4}, Ll/ۡ۟ᩳ;->֫(Landroid/view/View;II)V

    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 99
    iget-object v0, p0, Ll/ۡ۟ᩳ;->ۡ:Ll/ۙۖ;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/ۡ۟ᩳ;->֫:Z

    .line 100
    iget-object v1, p0, Ll/ۡ۟ᩳ;->ܽ:Ll/֨ۚۢ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 102
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 103
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 95
    iget v0, p0, Ll/ۡ۟ᩳ;->ܳ:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    const p1, 0x3f8ccccd    # 1.1f

    cmpl-float p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ۡ۟ᩳ;->ۧ:Z

    return-void
.end method

.method public final ֫(III)V
    .locals 2

    .line 117
    iget-boolean v0, p0, Ll/ۡ۟ᩳ;->ۧ:Z

    if-eqz v0, :cond_3

    .line 118
    iget-boolean v0, p0, Ll/ۡ۟ᩳ;->֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 119
    iput-boolean v1, p0, Ll/ۡ۟ᩳ;->֫:Z

    .line 121
    :cond_0
    iput p3, p0, Ll/ۡ۟ᩳ;->᩵:I

    .line 122
    iput p1, p0, Ll/ۡ۟ᩳ;->ᩳ:I

    .line 123
    iput p2, p0, Ll/ۡ۟ᩳ;->ܿ:I

    .line 124
    iget-object p1, p0, Ll/ۡ۟ᩳ;->ܽ:Ll/֨ۚۢ;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    if-nez p2, :cond_3

    .line 125
    iget-object p2, p0, Ll/ۡ۟ᩳ;->ۖ:Ll/۫ۨᩳ;

    iget-boolean p3, p2, Ll/۫ۨᩳ;->ܳۧ:Z

    if-eqz p3, :cond_2

    .line 126
    iget p2, p2, Ll/۫ۨᩳ;->֨֫:I

    sget p3, Ll/ۡ۟ᩳ;->۠:I

    if-gt p2, p3, :cond_1

    const-wide/16 p2, 0xa

    .line 127
    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_1
    const-wide/16 p2, 0x32

    .line 129
    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 132
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_3
    return-void
.end method
