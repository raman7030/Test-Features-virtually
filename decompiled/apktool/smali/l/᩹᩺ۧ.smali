.class public final Ll/᩹᩺ۧ;
.super Ll/ۘ᩺ۧ;
.source "G5V7"


# static fields
.field public static final ۨ:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public ۗ:Landroid/graphics/PorterDuffColorFilter;

.field public ۙ:Z

.field public ۛ:Ll/ܶ᩺ۧ;

.field public final ۤ:Landroid/graphics/Matrix;

.field public final ۫:[F

.field public final ۬:Landroid/graphics/Rect;

.field public ᩶:Landroid/graphics/ColorFilter;

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 280
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Ll/᩹᩺ۧ;->ۨ:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 311
    iput-boolean v0, p0, Ll/᩹᩺ۧ;->᩹:Z

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 317
    iput-object v0, p0, Ll/᩹᩺ۧ;->۫:[F

    .line 318
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩹᩺ۧ;->ۤ:Landroid/graphics/Matrix;

    .line 319
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩹᩺ۧ;->۬:Landroid/graphics/Rect;

    .line 322
    new-instance v0, Ll/ܶ᩺ۧ;

    .line 1121
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v1, 0x0

    .line 1015
    iput-object v1, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    .line 1016
    sget-object v1, Ll/᩹᩺ۧ;->ۨ:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    .line 1122
    new-instance v1, Ll/۠᩺ۧ;

    invoke-direct {v1}, Ll/۠᩺ۧ;-><init>()V

    iput-object v1, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 322
    iput-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩺ۧ;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 311
    iput-boolean v0, p0, Ll/᩹᩺ۧ;->᩹:Z

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 317
    iput-object v0, p0, Ll/᩹᩺ۧ;->۫:[F

    .line 318
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩹᩺ۧ;->ۤ:Landroid/graphics/Matrix;

    .line 319
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩹᩺ۧ;->۬:Landroid/graphics/Rect;

    .line 326
    iput-object p1, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 327
    iget-object v0, p1, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v0, p1}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method

.method public static ֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;
    .locals 4

    .line 645
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 646
    new-instance v0, Ll/᩹᩺ۧ;

    invoke-direct {v0}, Ll/᩹᩺ۧ;-><init>()V

    .line 647
    invoke-static {p0, p1, p2}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    iput-object p0, v0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    .line 648
    new-instance p0, Ll/᩸᩺ۧ;

    iget-object p1, v0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    .line 649
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩸᩺ۧ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    .line 654
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    .line 655
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 657
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    if-ne v1, v2, :cond_2

    .line 664
    invoke-static {p0, p1, v0, p2}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object p0

    return-object p0

    .line 662
    :cond_2
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;
    .locals 1

    .line 681
    new-instance v0, Ll/᩹᩺ۧ;

    invoke-direct {v0}, Ll/᩹᩺ۧ;-><init>()V

    .line 682
    invoke-virtual {v0, p0, p1, p2, p3}, Ll/᩹᩺ۧ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-object v0
.end method


# virtual methods
.method public final canApplyTheme()Z
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 588
    invoke-static {v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;)Z

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 360
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 366
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->۬:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 367
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_d

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_4

    .line 373
    :cond_1
    iget-object v1, p0, Ll/᩹᩺ۧ;->᩶:Landroid/graphics/ColorFilter;

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    .line 379
    :cond_2
    iget-object v2, p0, Ll/᩹᩺ۧ;->ۤ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 380
    iget-object v3, p0, Ll/᩹᩺ۧ;->۫:[F

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x0

    .line 381
    aget v4, v3, v2

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/4 v5, 0x4

    .line 382
    aget v5, v3, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/4 v6, 0x1

    .line 384
    aget v7, v3, v6

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const/4 v8, 0x3

    .line 385
    aget v3, v3, v8

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    cmpl-float v7, v7, v9

    if-nez v7, :cond_3

    cmpl-float v3, v3, v9

    if-eqz v3, :cond_4

    :cond_3
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    .line 393
    :cond_4
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v4

    float-to-int v3, v3

    .line 394
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, v5

    float-to-int v4, v4

    const/16 v5, 0x800

    .line 395
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 396
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-lez v3, :cond_d

    if-gtz v4, :cond_5

    goto/16 :goto_4

    .line 402
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    .line 403
    iget v7, v0, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v10, v0, Landroid/graphics/Rect;->top:I

    int-to-float v10, v10

    invoke-virtual {p1, v7, v10}, Landroid/graphics/Canvas;->translate(FF)V

    .line 908
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->isAutoMirrored()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 909
    invoke-static {p0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v7

    if-ne v7, v6, :cond_6

    .line 408
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {p1, v7, v9}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v7, -0x40800000    # -1.0f

    .line 409
    invoke-virtual {p1, v7, v8}, Landroid/graphics/Canvas;->scale(FF)V

    .line 415
    :cond_6
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 417
    iget-object v7, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1084
    iget-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    if-eqz v8, :cond_7

    .line 1093
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    if-ne v3, v8, :cond_7

    iget-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    .line 1094
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    if-ne v4, v8, :cond_7

    goto :goto_0

    .line 1085
    :cond_7
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    iput-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    .line 1087
    iput-boolean v6, v7, Ll/ܶ᩺ۧ;->ۧ:Z

    .line 418
    :goto_0
    iget-boolean v7, p0, Ll/᩹᩺ۧ;->᩹:Z

    if-nez v7, :cond_8

    .line 419
    iget-object v7, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1078
    iget-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    invoke-virtual {v8, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 1079
    new-instance v2, Landroid/graphics/Canvas;

    iget-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    invoke-direct {v2, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1080
    iget-object v7, v7, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v7, v2, v3, v4}, Ll/۠᩺ۧ;->֫(Landroid/graphics/Canvas;II)V

    goto :goto_1

    .line 421
    :cond_8
    iget-object v7, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1101
    iget-boolean v8, v7, Ll/ܶ᩺ۧ;->ۧ:Z

    if-nez v8, :cond_9

    iget-object v8, v7, Ll/ܶ᩺ۧ;->ܳ:Landroid/content/res/ColorStateList;

    iget-object v9, v7, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    if-ne v8, v9, :cond_9

    iget-object v8, v7, Ll/ܶ᩺ۧ;->᩻:Landroid/graphics/PorterDuff$Mode;

    iget-object v9, v7, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    if-ne v8, v9, :cond_9

    iget-boolean v8, v7, Ll/ܶ᩺ۧ;->ܽ:Z

    iget-boolean v9, v7, Ll/ܶ᩺ۧ;->֫:Z

    if-ne v8, v9, :cond_9

    iget v8, v7, Ll/ܶ᩺ۧ;->ܿ:I

    iget-object v7, v7, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 1105
    invoke-virtual {v7}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v7

    if-ne v8, v7, :cond_9

    goto :goto_1

    .line 422
    :cond_9
    iget-object v7, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1078
    iget-object v8, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    invoke-virtual {v8, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 1079
    new-instance v8, Landroid/graphics/Canvas;

    iget-object v9, v7, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    invoke-direct {v8, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1080
    iget-object v7, v7, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v7, v8, v3, v4}, Ll/۠᩺ۧ;->֫(Landroid/graphics/Canvas;II)V

    .line 423
    iget-object v3, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1114
    iget-object v4, v3, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    iput-object v4, v3, Ll/ܶ᩺ۧ;->ܳ:Landroid/content/res/ColorStateList;

    .line 1115
    iget-object v4, v3, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    iput-object v4, v3, Ll/ܶ᩺ۧ;->᩻:Landroid/graphics/PorterDuff$Mode;

    .line 1116
    iget-object v4, v3, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v4}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v4

    iput v4, v3, Ll/ܶ᩺ۧ;->ܿ:I

    .line 1117
    iget-boolean v4, v3, Ll/ܶ᩺ۧ;->֫:Z

    iput-boolean v4, v3, Ll/ܶ᩺ۧ;->ܽ:Z

    .line 1118
    iput-boolean v2, v3, Ll/ܶ᩺ۧ;->ۧ:Z

    .line 426
    :goto_1
    iget-object v2, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1057
    iget-object v3, v2, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v3}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v3

    const/16 v4, 0xff

    const/4 v7, 0x0

    if-ge v3, v4, :cond_a

    goto :goto_2

    :cond_a
    if-nez v1, :cond_b

    move-object v1, v7

    goto :goto_3

    .line 1068
    :cond_b
    :goto_2
    iget-object v3, v2, Ll/ܶ᩺ۧ;->᩷:Landroid/graphics/Paint;

    if-nez v3, :cond_c

    .line 1069
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, v2, Ll/ܶ᩺ۧ;->᩷:Landroid/graphics/Paint;

    .line 1070
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1072
    :cond_c
    iget-object v3, v2, Ll/ܶ᩺ۧ;->᩷:Landroid/graphics/Paint;

    iget-object v4, v2, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v4}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1073
    iget-object v3, v2, Ll/ܶ᩺ۧ;->᩷:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 1074
    iget-object v1, v2, Ll/ܶ᩺ۧ;->᩷:Landroid/graphics/Paint;

    .line 1053
    :goto_3
    iget-object v2, v2, Ll/ܶ᩺ۧ;->ᩳ:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v2, v7, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 427
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_d
    :goto_4
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v0

    return v0

    .line 436
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v0}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v0

    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 925
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 926
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    .line 928
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    invoke-virtual {v1}, Ll/ܶ᩺ۧ;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 465
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 466
    invoke-static {v0}, Ll/۠۬;->ܽ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0

    .line 468
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->᩶:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 350
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 352
    new-instance v0, Ll/᩸᩺ۧ;

    iget-object v1, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩸᩺ۧ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    .line 354
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    invoke-virtual {p0}, Ll/᩹᩺ۧ;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Ll/ܶ᩺ۧ;->ۜ:I

    .line 355
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 578
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    .line 581
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget v0, v0, Ll/۠᩺ۧ;->֫:F

    float-to-int v0, v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 569
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    .line 572
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget v0, v0, Ll/۠᩺ۧ;->ۧ:F

    float-to-int v0, v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 559
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 560
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x3

    return v0
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    .line 696
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 697
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 701
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/᩹᩺ۧ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 707
    iget-object v5, v0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_0

    .line 708
    invoke-static {v5, v1, v2, v3, v4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void

    .line 712
    :cond_0
    iget-object v5, v0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 713
    new-instance v6, Ll/۠᩺ۧ;

    invoke-direct {v6}, Ll/۠᩺ۧ;-><init>()V

    .line 714
    iput-object v6, v5, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 716
    sget-object v6, Ll/ۧ᩺ۧ;->ۡ:[I

    invoke-static {v1, v4, v3, v6}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 754
    iget-object v7, v0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 755
    iget-object v8, v7, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    const-string v9, "tintMode"

    const/4 v10, 0x6

    const/4 v11, -0x1

    .line 760
    invoke-static {v6, v2, v9, v10, v11}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v9

    .line 762
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    const/16 v11, 0x9

    const/4 v12, 0x5

    const/4 v13, 0x3

    if-eq v9, v13, :cond_2

    if-eq v9, v12, :cond_3

    if-eq v9, v11, :cond_1

    packed-switch v9, :pswitch_data_0

    goto :goto_0

    .line 746
    :pswitch_0
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    .line 744
    :pswitch_1
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    .line 742
    :pswitch_2
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    .line 740
    :cond_1
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    .line 736
    :cond_2
    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 762
    :cond_3
    :goto_0
    iput-object v10, v7, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    const-string v9, "http://schemas.android.com/apk/res/android"

    const-string v10, "tint"

    .line 57
    invoke-interface {v2, v9, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v10, :cond_6

    .line 168
    new-instance v10, Landroid/util/TypedValue;

    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 169
    invoke-virtual {v6, v14, v10}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 170
    iget v15, v10, Landroid/util/TypedValue;->type:I

    if-eq v15, v11, :cond_5

    const/16 v11, 0x1c

    if-lt v15, v11, :cond_4

    const/16 v11, 0x1f

    if-gt v15, v11, :cond_4

    .line 189
    iget v10, v10, Landroid/util/TypedValue;->data:I

    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v15

    goto :goto_1

    .line 178
    :cond_4
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 179
    invoke-virtual {v6, v14, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 178
    sget v15, Ll/ܳۗ;->֫:I

    .line 70
    :try_start_0
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v11

    .line 71
    invoke-static {v10, v11, v4}, Ll/ܳۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 171
    :cond_5
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to resolve attribute at index 1: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_0
    :cond_6
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_7

    .line 768
    iput-object v15, v7, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    .line 771
    :cond_7
    iget-boolean v10, v7, Ll/ܶ᩺ۧ;->֫:Z

    const-string v11, "autoMirrored"

    .line 57
    invoke-interface {v2, v9, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_8

    .line 90
    invoke-virtual {v6, v12, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 771
    :cond_8
    iput-boolean v10, v7, Ll/ܶ᩺ۧ;->֫:Z

    .line 774
    iget v7, v8, Ll/۠᩺ۧ;->ᩴ:F

    const-string v10, "viewportWidth"

    .line 57
    invoke-interface {v2, v9, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x7

    if-eqz v10, :cond_9

    .line 73
    invoke-virtual {v6, v11, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 774
    :cond_9
    iput v7, v8, Ll/۠᩺ۧ;->ᩴ:F

    .line 778
    iget v7, v8, Ll/۠᩺ۧ;->ۘ:F

    const-string v10, "viewportHeight"

    .line 57
    invoke-interface {v2, v9, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x8

    if-eqz v10, :cond_a

    .line 73
    invoke-virtual {v6, v11, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 778
    :cond_a
    iput v7, v8, Ll/۠᩺ۧ;->ۘ:F

    .line 782
    iget v10, v8, Ll/۠᩺ۧ;->ᩴ:F

    const/4 v11, 0x0

    cmpg-float v10, v10, v11

    if-lez v10, :cond_31

    cmpg-float v7, v7, v11

    if-lez v7, :cond_30

    .line 790
    iget v7, v8, Ll/۠᩺ۧ;->ۧ:F

    const/4 v10, 0x3

    invoke-virtual {v6, v10, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    iput v7, v8, Ll/۠᩺ۧ;->ۧ:F

    .line 792
    iget v7, v8, Ll/۠᩺ۧ;->֫:F

    const/4 v10, 0x2

    invoke-virtual {v6, v10, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    iput v7, v8, Ll/۠᩺ۧ;->֫:F

    .line 794
    iget v10, v8, Ll/۠᩺ۧ;->ۧ:F

    cmpg-float v10, v10, v11

    if-lez v10, :cond_2f

    cmpg-float v7, v7, v11

    if-lez v7, :cond_2e

    .line 804
    invoke-virtual {v8}, Ll/۠᩺ۧ;->getAlpha()F

    move-result v7

    const-string v10, "alpha"

    .line 57
    invoke-interface {v2, v9, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    if-eqz v10, :cond_b

    .line 73
    invoke-virtual {v6, v11, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 805
    :cond_b
    invoke-virtual {v8, v7}, Ll/۠᩺ۧ;->setAlpha(F)V

    .line 807
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    .line 809
    iput-object v7, v8, Ll/۠᩺ۧ;->ۡ:Ljava/lang/String;

    .line 810
    iget-object v10, v8, Ll/۠᩺ۧ;->ۖ:Ll/ۖ᩵;

    invoke-virtual {v10, v7, v8}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    :cond_c
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 721
    invoke-virtual/range {p0 .. p0}, Ll/᩹᩺ۧ;->getChangingConfigurations()I

    move-result v6

    iput v6, v5, Ll/ܶ᩺ۧ;->ۜ:I

    .line 722
    iput-boolean v14, v5, Ll/ܶ᩺ۧ;->ۧ:Z

    .line 816
    iget-object v6, v0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 817
    iget-object v7, v6, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 822
    new-instance v8, Ljava/util/ArrayDeque;

    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 823
    iget-object v10, v7, Ll/۠᩺ۧ;->ۢ:Ll/֡᩺ۧ;

    iget-object v7, v7, Ll/۠᩺ۧ;->ۖ:Ll/ۖ᩵;

    invoke-virtual {v8, v10}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 825
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v10

    .line 826
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    const/4 v12, 0x1

    :goto_2
    if-eq v10, v14, :cond_2c

    .line 830
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v13

    if-ge v13, v11, :cond_d

    const/4 v13, 0x3

    if-eq v10, v13, :cond_2c

    :cond_d
    const-string v13, "group"

    const/4 v14, 0x2

    if-ne v10, v14, :cond_2a

    .line 832
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    .line 833
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֡᩺ۧ;

    const-string v15, "path"

    .line 834
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move/from16 v16, v11

    const-string v11, "fillType"

    const-string v0, "pathData"

    if-eqz v15, :cond_22

    .line 835
    new-instance v10, Ll/᩵᩺ۧ;

    invoke-direct {v10}, Ll/᩵᩺ۧ;-><init>()V

    .line 1890
    sget-object v12, Ll/ۧ᩺ۧ;->ۢ:[I

    invoke-static {v1, v4, v3, v12}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v12

    .line 57
    invoke-interface {v2, v9, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_20

    const/4 v0, 0x0

    .line 1915
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 1918
    iput-object v0, v10, Ll/֨᩺ۧ;->ܽ:Ljava/lang/String;

    :cond_e
    const/4 v0, 0x2

    .line 1921
    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 1923
    invoke-static {v0}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object v0

    iput-object v0, v10, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    :cond_f
    const-string v0, "fillColor"

    const/4 v13, 0x1

    .line 1926
    invoke-static {v12, v2, v4, v0, v13}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ll/᩻ۗ;

    move-result-object v0

    iput-object v0, v10, Ll/᩵᩺ۧ;->ܿ:Ll/᩻ۗ;

    .line 1928
    iget v0, v10, Ll/᩵᩺ۧ;->ᩳ:F

    const-string v13, "fillAlpha"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_10

    const/16 v13, 0xc

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1928
    :cond_10
    iput v0, v10, Ll/᩵᩺ۧ;->ᩳ:F

    const-string v0, "strokeLineCap"

    .line 57
    invoke-interface {v2, v9, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    const/4 v0, -0x1

    const/16 v13, 0x8

    .line 107
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    goto :goto_3

    :cond_11
    const/4 v0, -0x1

    .line 1932
    :goto_3
    iget-object v13, v10, Ll/᩵᩺ۧ;->ۜ:Landroid/graphics/Paint$Cap;

    if-eqz v0, :cond_14

    const/4 v15, 0x1

    if-eq v0, v15, :cond_13

    const/4 v15, 0x2

    if-eq v0, v15, :cond_12

    goto :goto_4

    .line 1865
    :cond_12
    sget-object v13, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_4

    .line 1863
    :cond_13
    sget-object v13, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_4

    .line 1861
    :cond_14
    sget-object v13, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 1932
    :goto_4
    iput-object v13, v10, Ll/᩵᩺ۧ;->ۜ:Landroid/graphics/Paint$Cap;

    const-string v0, "strokeLineJoin"

    .line 57
    invoke-interface {v2, v9, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    const/16 v0, 0x9

    const/4 v13, -0x1

    .line 107
    invoke-virtual {v12, v0, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    goto :goto_5

    :cond_15
    const/4 v0, -0x1

    .line 1935
    :goto_5
    iget-object v13, v10, Ll/᩵᩺ۧ;->᩷:Landroid/graphics/Paint$Join;

    if-eqz v0, :cond_18

    const/4 v15, 0x1

    if-eq v0, v15, :cond_17

    const/4 v15, 0x2

    if-eq v0, v15, :cond_16

    goto :goto_6

    .line 1878
    :cond_16
    sget-object v13, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_6

    .line 1876
    :cond_17
    sget-object v13, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_6

    .line 1874
    :cond_18
    sget-object v13, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 1935
    :goto_6
    iput-object v13, v10, Ll/᩵᩺ۧ;->᩷:Landroid/graphics/Paint$Join;

    .line 1936
    iget v0, v10, Ll/᩵᩺ۧ;->ۢ:F

    const-string v13, "strokeMiterLimit"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_19

    const/16 v13, 0xa

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1936
    :cond_19
    iput v0, v10, Ll/᩵᩺ۧ;->ۢ:F

    const-string v0, "strokeColor"

    const/4 v13, 0x3

    .line 1939
    invoke-static {v12, v2, v4, v0, v13}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ll/᩻ۗ;

    move-result-object v0

    iput-object v0, v10, Ll/᩵᩺ۧ;->᩻:Ll/᩻ۗ;

    .line 1941
    iget v0, v10, Ll/᩵᩺ۧ;->ܳ:F

    const-string v13, "strokeAlpha"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1a

    const/16 v13, 0xb

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1941
    :cond_1a
    iput v0, v10, Ll/᩵᩺ۧ;->ܳ:F

    .line 1943
    iget v0, v10, Ll/᩵᩺ۧ;->ۡ:F

    const-string v13, "strokeWidth"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1b

    const/4 v13, 0x4

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1943
    :cond_1b
    iput v0, v10, Ll/᩵᩺ۧ;->ۡ:F

    .line 1945
    iget v0, v10, Ll/᩵᩺ۧ;->ܺ:F

    const-string v13, "trimPathEnd"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1c

    const/4 v13, 0x6

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1945
    :cond_1c
    iput v0, v10, Ll/᩵᩺ۧ;->ܺ:F

    .line 1947
    iget v0, v10, Ll/᩵᩺ۧ;->ۖ:F

    const-string v13, "trimPathOffset"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1d

    const/4 v13, 0x7

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1947
    :cond_1d
    iput v0, v10, Ll/᩵᩺ۧ;->ۖ:F

    .line 1950
    iget v0, v10, Ll/᩵᩺ۧ;->ۘ:F

    const-string v13, "trimPathStart"

    .line 57
    invoke-interface {v2, v9, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1e

    const/4 v13, 0x5

    .line 73
    invoke-virtual {v12, v13, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 1950
    :cond_1e
    iput v0, v10, Ll/᩵᩺ۧ;->ۘ:F

    .line 1953
    iget v0, v10, Ll/֨᩺ۧ;->֫:I

    .line 57
    invoke-interface {v2, v9, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1f

    const/16 v11, 0xd

    .line 107
    invoke-virtual {v12, v11, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 1953
    :cond_1f
    iput v0, v10, Ll/֨᩺ۧ;->֫:I

    .line 1893
    :cond_20
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 837
    iget-object v0, v14, Ll/֡᩺ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    invoke-virtual {v10}, Ll/֨᩺ۧ;->getPathName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 839
    invoke-virtual {v10}, Ll/֨᩺ۧ;->getPathName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0, v10}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    :cond_21
    iget v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    iput v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    const/4 v0, 0x0

    const/4 v12, 0x0

    goto/16 :goto_8

    :cond_22
    const-string v15, "clip-path"

    .line 843
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_28

    .line 844
    new-instance v10, Ll/ᩴ᩺ۧ;

    .line 1768
    invoke-direct {v10}, Ll/֨᩺ۧ;-><init>()V

    .line 57
    invoke-interface {v2, v9, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_26

    .line 1782
    sget-object v0, Ll/ۧ᩺ۧ;->ۜ:[I

    invoke-static {v1, v4, v3, v0}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v13, 0x0

    .line 1793
    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_23

    .line 1795
    iput-object v13, v10, Ll/֨᩺ۧ;->ܽ:Ljava/lang/String;

    :cond_23
    const/4 v13, 0x1

    .line 1799
    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_24

    .line 1801
    invoke-static {v13}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object v13

    iput-object v13, v10, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    .line 103
    :cond_24
    invoke-static {v2, v11}, Ll/ۗۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_25

    const/4 v11, 0x0

    goto :goto_7

    :cond_25
    const/4 v11, 0x2

    const/4 v13, 0x0

    .line 107
    invoke-virtual {v0, v11, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    .line 1803
    :goto_7
    iput v11, v10, Ll/֨᩺ۧ;->֫:I

    .line 1785
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 846
    :cond_26
    iget-object v0, v14, Ll/֡᩺ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    invoke-virtual {v10}, Ll/֨᩺ۧ;->getPathName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 848
    invoke-virtual {v10}, Ll/֨᩺ۧ;->getPathName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0, v10}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    :cond_27
    iget v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    iput v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    goto :goto_8

    .line 851
    :cond_28
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 852
    new-instance v0, Ll/֡᩺ۧ;

    invoke-direct {v0}, Ll/֡᩺ۧ;-><init>()V

    .line 853
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/֡᩺ۧ;->֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 854
    iget-object v10, v14, Ll/֡᩺ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 855
    invoke-virtual {v8, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 856
    invoke-virtual {v0}, Ll/֡᩺ۧ;->getGroupName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_29

    .line 857
    invoke-virtual {v0}, Ll/֡᩺ۧ;->getGroupName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    :cond_29
    iget v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    iput v0, v6, Ll/ܶ᩺ۧ;->ۜ:I

    goto :goto_8

    :cond_2a
    move/from16 v16, v11

    const/4 v0, 0x3

    if-ne v10, v0, :cond_2b

    .line 863
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 864
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 865
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 868
    :cond_2b
    :goto_8
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    const/4 v14, 0x1

    move-object/from16 v0, p0

    move/from16 v11, v16

    goto/16 :goto_2

    :cond_2c
    if-nez v12, :cond_2d

    .line 725
    iget-object v0, v5, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    iget-object v1, v5, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, v2, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    return-void

    :cond_2d
    move-object/from16 v2, p0

    .line 877
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "no path defined"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    move-object v2, v0

    .line 798
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires height > 0"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    move-object v2, v0

    .line 795
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires width > 0"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    move-object v2, v0

    .line 786
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires viewportHeight > 0"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    move-object v2, v0

    .line 783
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires viewportWidth > 0"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 933
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 934
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 937
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 596
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0

    .line 599
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-boolean v0, v0, Ll/ܶ᩺ۧ;->֫:Z

    return v0
.end method

.method public final isStateful()Z
    .locals 2

    .line 528
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 529
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    .line 532
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    if-eqz v0, :cond_2

    .line 1143
    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 1412
    iget-object v1, v0, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 1413
    iget-object v1, v0, Ll/۠᩺ۧ;->ۢ:Ll/֡᩺ۧ;

    invoke-virtual {v1}, Ll/֡᩺ۧ;->֫()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    .line 1415
    :cond_1
    iget-object v0, v0, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 533
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    .line 534
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 332
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    return-object p0

    .line 337
    :cond_0
    iget-boolean v0, p0, Ll/᩹᩺ۧ;->ۙ:Z

    if-nez v0, :cond_4

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_4

    .line 338
    new-instance v0, Ll/ܶ᩺ۧ;

    iget-object v1, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 1033
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v2, 0x0

    .line 1015
    iput-object v2, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    .line 1016
    sget-object v2, Ll/᩹᩺ۧ;->ۨ:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v1, :cond_3

    .line 1035
    iget v2, v1, Ll/ܶ᩺ۧ;->ۜ:I

    iput v2, v0, Ll/ܶ᩺ۧ;->ۜ:I

    .line 1036
    new-instance v2, Ll/۠᩺ۧ;

    iget-object v3, v1, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-direct {v2, v3}, Ll/۠᩺ۧ;-><init>(Ll/۠᩺ۧ;)V

    iput-object v2, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 1037
    iget-object v3, v1, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget-object v3, v3, Ll/۠᩺ۧ;->ܽ:Landroid/graphics/Paint;

    if-eqz v3, :cond_1

    .line 1038
    new-instance v3, Landroid/graphics/Paint;

    iget-object v4, v1, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget-object v4, v4, Ll/۠᩺ۧ;->ܽ:Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, v2, Ll/۠᩺ۧ;->ܽ:Landroid/graphics/Paint;

    .line 1040
    :cond_1
    iget-object v2, v1, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget-object v2, v2, Ll/۠᩺ۧ;->ܺ:Landroid/graphics/Paint;

    if-eqz v2, :cond_2

    .line 1041
    iget-object v2, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    new-instance v3, Landroid/graphics/Paint;

    iget-object v4, v1, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget-object v4, v4, Ll/۠᩺ۧ;->ܺ:Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, v2, Ll/۠᩺ۧ;->ܺ:Landroid/graphics/Paint;

    .line 1043
    :cond_2
    iget-object v2, v1, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    iput-object v2, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    .line 1044
    iget-object v2, v1, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    .line 1045
    iget-boolean v1, v1, Ll/ܶ᩺ۧ;->֫:Z

    iput-boolean v1, v0, Ll/ܶ᩺ۧ;->֫:Z

    .line 338
    :cond_3
    iput-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    const/4 v0, 0x1

    .line 339
    iput-boolean v0, p0, Ll/᩹᩺ۧ;->ۙ:Z

    :cond_4
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 918
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 919
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 5

    .line 539
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 540
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    .line 544
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 545
    iget-object v1, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v3, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v3, :cond_1

    .line 546
    invoke-virtual {p0, v1, v3}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iput-object v1, p0, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    .line 547
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 1143
    :goto_0
    iget-object v3, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 1412
    iget-object v4, v3, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    if-nez v4, :cond_2

    .line 1413
    iget-object v4, v3, Ll/۠᩺ۧ;->ۢ:Ll/֡᩺ۧ;

    invoke-virtual {v4}, Ll/֡᩺ۧ;->֫()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v3, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    .line 1415
    :cond_2
    iget-object v3, v3, Ll/۠᩺ۧ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1147
    iget-object v3, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    .line 1419
    iget-object v3, v3, Ll/۠᩺ۧ;->ۢ:Ll/֡᩺ۧ;

    invoke-virtual {v3, p1}, Ll/֡᩺ۧ;->֫([I)Z

    move-result p1

    .line 1148
    iget-boolean v3, v0, Ll/ܶ᩺ۧ;->ۧ:Z

    or-int/2addr v3, p1

    iput-boolean v3, v0, Ll/ܶ᩺ۧ;->ۧ:Z

    if-eqz p1, :cond_3

    .line 551
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    return v2

    :cond_3
    return v1
.end method

.method public final scheduleSelf(Ljava/lang/Runnable;J)V
    .locals 1

    .line 942
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 943
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void

    .line 946
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 441
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 442
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    .line 446
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v0}, Ll/۠᩺ۧ;->getRootAlpha()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 447
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    invoke-virtual {v0, p1}, Ll/۠᩺ۧ;->setRootAlpha(I)V

    .line 448
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 604
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void

    .line 608
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iput-boolean p1, v0, Ll/ܶ᩺ۧ;->֫:Z

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 454
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 455
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    .line 459
    :cond_0
    iput-object p1, p0, Ll/᩹᩺ۧ;->᩶:Landroid/graphics/ColorFilter;

    .line 460
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 1

    .line 488
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 489
    invoke-static {v0, p1}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;I)V

    return-void

    .line 493
    :cond_0
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩹᩺ۧ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 498
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 499
    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    .line 503
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 504
    iget-object v1, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_1

    .line 505
    iput-object p1, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    .line 506
    iget-object v0, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, v0}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    .line 507
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 513
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 514
    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 518
    :cond_0
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    .line 519
    iget-object v1, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_1

    .line 520
    iput-object p1, v0, Ll/ܶ᩺ۧ;->ۡ:Landroid/graphics/PorterDuff$Mode;

    .line 521
    iget-object v0, v0, Ll/ܶ᩺ۧ;->ۢ:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0, p1}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩺ۧ;->ۗ:Landroid/graphics/PorterDuffColorFilter;

    .line 522
    invoke-virtual {p0}, Ll/᩹᩺ۧ;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 951
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 952
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    .line 954
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public final unscheduleSelf(Ljava/lang/Runnable;)V
    .locals 1

    .line 959
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 960
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void

    .line 963
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 277
    :cond_0
    invoke-super {p0}, Ll/ۘ᩺ۧ;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 482
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 483
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 345
    iget-object v0, p0, Ll/᩹᩺ۧ;->ۛ:Ll/ܶ᩺ۧ;

    iget-object v0, v0, Ll/ܶ᩺ۧ;->ܺ:Ll/۠᩺ۧ;

    iget-object v0, v0, Ll/۠᩺ۧ;->ۖ:Ll/ۖ᩵;

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 902
    iput-boolean v0, p0, Ll/᩹᩺ۧ;->᩹:Z

    return-void
.end method
