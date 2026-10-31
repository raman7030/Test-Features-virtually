.class public Ll/۟ۚۧ;
.super Landroid/view/View;
.source "18GG"

# interfaces
.implements Ll/۠۠ۧ;


# instance fields
.field public final ֡֫:I

.field public ֨֫:Z

.field public final ֫֫:Ljava/util/Formatter;

.field public final ۖ֫:Landroid/graphics/Rect;

.field public final ۗ:I

.field public final ۗ֫:Landroid/graphics/Point;

.field public final ۘ֫:I

.field public final ۙ:I

.field public final ۙ֫:Ll/᩸ۛᩳ;

.field public final ۚ֫:I

.field public ۛ:J

.field public final ۜ֫:Landroid/graphics/Paint;

.field public final ۟:Ljava/lang/StringBuilder;

.field public final ۠֫:Landroid/graphics/Paint;

.field public final ۡ֫:Landroid/graphics/Rect;

.field public ۢ֫:J

.field public final ۤ:Landroid/graphics/Paint;

.field public ۧ֫:I

.field public final ۨ:F

.field public final ۫:Landroid/graphics/Rect;

.field public final ۫֫:Landroid/graphics/Paint;

.field public final ۬:I

.field public final ۬֫:I

.field public final ܰ:I

.field public final ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public ܶ֫:F

.field public ܺ֫:J

.field public ܽ֫:J

.field public ܿ֫:Landroid/graphics/Rect;

.field public ᩳ֫:I

.field public final ᩴ֫:I

.field public final ᩵֫:Landroid/graphics/drawable/Drawable;

.field public final ᩶:Landroid/graphics/Paint;

.field public final ᩶֫:Landroid/graphics/Rect;

.field public final ᩷֫:Landroid/graphics/Paint;

.field public ᩸:I

.field public ᩸֫:Landroid/animation/ValueAnimator;

.field public ᩹:[J

.field public ᩹֫:Z

.field public ᩺:J

.field public ᩻֫:[Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 252
    invoke-direct {p0, p1, p2, v0}, Ll/۟ۚۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p2

    .line 264
    invoke-direct/range {v0 .. v5}, Ll/۟ۚۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    .line 275
    invoke-direct/range {p0 .. p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 276
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v1, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    .line 277
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v1, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    .line 278
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v1, Ll/۟ۚۧ;->۫:Landroid/graphics/Rect;

    .line 279
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v1, Ll/۟ۚۧ;->ۖ֫:Landroid/graphics/Rect;

    .line 280
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, v1, Ll/۟ۚۧ;->᩷֫:Landroid/graphics/Paint;

    .line 281
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, v1, Ll/۟ۚۧ;->ۤ:Landroid/graphics/Paint;

    .line 282
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v1, Ll/۟ۚۧ;->۫֫:Landroid/graphics/Paint;

    .line 283
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    iput-object v5, v1, Ll/۟ۚۧ;->᩶:Landroid/graphics/Paint;

    .line 284
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, v1, Ll/۟ۚۧ;->ۜ֫:Landroid/graphics/Paint;

    .line 285
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    iput-object v7, v1, Ll/۟ۚۧ;->۠֫:Landroid/graphics/Paint;

    const/4 v8, 0x1

    .line 286
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 287
    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Ll/۟ۚۧ;->ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 288
    new-instance v8, Landroid/graphics/Point;

    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    iput-object v8, v1, Ll/۟ۚۧ;->ۗ֫:Landroid/graphics/Point;

    .line 291
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 292
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    .line 293
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    iput v8, v1, Ll/۟ۚۧ;->ۨ:F

    const/16 v9, -0x32

    .line 294
    invoke-static {v8, v9}, Ll/۟ۚۧ;->֫(FI)I

    move-result v9

    iput v9, v1, Ll/۟ۚۧ;->ܰ:I

    const/4 v9, 0x4

    .line 295
    invoke-static {v8, v9}, Ll/۟ۚۧ;->֫(FI)I

    move-result v10

    const/16 v11, 0x1a

    .line 296
    invoke-static {v8, v11}, Ll/۟ۚۧ;->֫(FI)I

    move-result v11

    .line 297
    invoke-static {v8, v9}, Ll/۟ۚۧ;->֫(FI)I

    move-result v9

    const/16 v12, 0xc

    .line 298
    invoke-static {v8, v12}, Ll/۟ۚۧ;->֫(FI)I

    move-result v12

    const/4 v13, 0x0

    .line 299
    invoke-static {v8, v13}, Ll/۟ۚۧ;->֫(FI)I

    move-result v13

    const/16 v14, 0x10

    .line 300
    invoke-static {v8, v14}, Ll/۟ۚۧ;->֫(FI)I

    move-result v8

    if-eqz v0, :cond_2

    .line 304
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v14

    sget-object v15, Ll/᩺ۘ֫;->ۧ:[I

    move-object/from16 v16, v5

    move-object/from16 p2, v6

    move/from16 v6, p3

    move/from16 v5, p5

    .line 305
    invoke-virtual {v14, v0, v15, v6, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    const/16 v0, 0xa

    .line 308
    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, v1, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 989
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x17

    if-lt v6, v14, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-lt v6, v14, :cond_0

    .line 993
    invoke-virtual {v0, v15}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result v6

    .line 312
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    :cond_1
    const/4 v0, 0x3

    .line 315
    invoke-virtual {v5, v0, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->۬:I

    const/16 v0, 0xc

    .line 317
    invoke-virtual {v5, v0, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->۬֫:I

    const/4 v0, 0x2

    const/4 v6, 0x0

    .line 319
    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->ۗ:I

    const/4 v0, 0x1

    .line 321
    invoke-virtual {v5, v0, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->ۙ:I

    const/16 v0, 0xb

    .line 324
    invoke-virtual {v5, v0, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->֡֫:I

    const/16 v0, 0x8

    .line 327
    invoke-virtual {v5, v0, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->ۘ֫:I

    const/16 v0, 0x9

    .line 330
    invoke-virtual {v5, v0, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, v1, Ll/۟ۚۧ;->ᩴ֫:I

    const/4 v0, 0x6

    const/4 v6, -0x1

    .line 332
    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 v8, 0x7

    .line 334
    invoke-virtual {v5, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    const v8, -0x33000001    # -1.3421772E8f

    const/4 v9, 0x4

    .line 336
    invoke-virtual {v5, v9, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    const/16 v9, 0xd

    const v10, 0x33ffffff

    .line 338
    invoke-virtual {v5, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    const v10, -0x4d000100

    const/4 v11, 0x0

    .line 340
    invoke-virtual {v5, v11, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    const/4 v11, 0x5

    const v12, 0x33ffff00

    .line 342
    invoke-virtual {v5, v11, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    .line 344
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 345
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 346
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 347
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, v16

    .line 348
    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v6, p2

    .line 349
    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 352
    throw v0

    :cond_2
    move-object v0, v5

    .line 354
    iput v10, v1, Ll/۟ۚۧ;->۬:I

    .line 355
    iput v11, v1, Ll/۟ۚۧ;->۬֫:I

    const/4 v5, 0x0

    .line 356
    iput v5, v1, Ll/۟ۚۧ;->ۗ:I

    .line 357
    iput v9, v1, Ll/۟ۚۧ;->ۙ:I

    .line 358
    iput v12, v1, Ll/۟ۚۧ;->֡֫:I

    .line 359
    iput v13, v1, Ll/۟ۚۧ;->ۘ֫:I

    .line 360
    iput v8, v1, Ll/۟ۚۧ;->ᩴ֫:I

    const/4 v5, -0x1

    .line 361
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 362
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    const v2, -0x33000001    # -1.3421772E8f

    .line 363
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    const v2, 0x33ffffff

    .line 364
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    const v2, -0x4d000100

    .line 365
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    const v0, 0x33ffff00

    .line 366
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x0

    .line 367
    iput-object v0, v1, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    .line 369
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, v1, Ll/۟ۚۧ;->۟:Ljava/lang/StringBuilder;

    .line 370
    new-instance v2, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v2, v1, Ll/۟ۚۧ;->֫֫:Ljava/util/Formatter;

    .line 371
    new-instance v0, Ll/᩸ۛᩳ;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ll/᩸ۛᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v0, v1, Ll/۟ۚۧ;->ۙ֫:Ll/᩸ۛᩳ;

    .line 372
    iget-object v0, v1, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 373
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    iput v0, v1, Ll/۟ۚۧ;->ۚ֫:I

    goto :goto_1

    .line 375
    :cond_3
    iget v0, v1, Ll/۟ۚۧ;->ۘ֫:I

    iget v2, v1, Ll/۟ۚۧ;->֡֫:I

    iget v3, v1, Ll/۟ۚۧ;->ᩴ֫:I

    .line 376
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    iput v0, v1, Ll/۟ۚۧ;->ۚ֫:I

    :goto_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 379
    iput v0, v1, Ll/۟ۚۧ;->ܶ֫:F

    .line 380
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, v1, Ll/۟ۚۧ;->᩸֫:Landroid/animation/ValueAnimator;

    .line 381
    new-instance v2, Ll/ܰۚۧ;

    invoke-direct {v2, v1}, Ll/ܰۚۧ;-><init>(Ll/۟ۚۧ;)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 386
    iput-wide v2, v1, Ll/۟ۚۧ;->᩺:J

    .line 387
    iput-wide v2, v1, Ll/۟ۚۧ;->ܽ֫:J

    const/16 v0, 0x14

    .line 388
    iput v0, v1, Ll/۟ۚۧ;->ۧ֫:I

    const/4 v0, 0x1

    .line 389
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 390
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v2

    if-nez v2, :cond_4

    .line 391
    invoke-virtual {v1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_4
    return-void
.end method

.method public static ֫(FI)I
    .locals 0

    int-to-float p1, p1

    mul-float p1, p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method public static synthetic ֫(Ll/۟ۚۧ;)V
    .locals 1

    const/4 v0, 0x0

    .line 371
    invoke-direct {p0, v0}, Ll/۟ۚۧ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/۟ۚۧ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 383
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Ll/۟ۚۧ;->ܶ֫:F

    .line 384
    iget-object p1, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method private ۧ(Z)V
    .locals 4

    .line 821
    iget-object v0, p0, Ll/۟ۚۧ;->ۙ֫:Ll/᩸ۛᩳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 822
    iput-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    .line 823
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 824
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 826
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 828
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 829
    iget-object v0, p0, Ll/۟ۚۧ;->ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۠ۧ;

    .line 830
    iget-wide v2, p0, Ll/۟ۚۧ;->ܺ֫:J

    invoke-interface {v1, v2, v3, p1}, Ll/֨۠ۧ;->֫(JZ)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܳ()J
    .locals 6

    .line 884
    iget-object v0, p0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_1

    iget-wide v1, p0, Ll/۟ۚۧ;->᩺:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    .line 887
    :cond_0
    iget-object v1, p0, Ll/۟ۚۧ;->ۖ֫:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-long v1, v1

    iget-wide v3, p0, Ll/۟ۚۧ;->᩺:J

    mul-long v1, v1, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private ܳ(J)V
    .locals 3

    .line 811
    iget-wide v0, p0, Ll/۟ۚۧ;->ܺ֫:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    goto :goto_1

    .line 814
    :cond_0
    iput-wide p1, p0, Ll/۟ۚۧ;->ܺ֫:J

    .line 815
    iget-object v0, p0, Ll/۟ۚۧ;->ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۠ۧ;

    .line 816
    invoke-interface {v1, p1, p2}, Ll/֨۠ۧ;->ܽ(J)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private ܿ()J
    .locals 5

    .line 983
    iget-wide v0, p0, Ll/۟ۚۧ;->ܽ֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 984
    iget-wide v0, p0, Ll/۟ۚۧ;->᩺:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget v2, p0, Ll/۟ۚۧ;->ۧ֫:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method

.method private ܿ(J)V
    .locals 2

    .line 798
    iput-wide p1, p0, Ll/۟ۚۧ;->ܺ֫:J

    const/4 v0, 0x1

    .line 799
    iput-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    .line 800
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 801
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 803
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 805
    :cond_0
    iget-object v0, p0, Ll/۟ۚۧ;->ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۠ۧ;

    .line 806
    invoke-interface {v1, p1, p2}, Ll/֨۠ۧ;->ۧ(J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩳ(J)Z
    .locals 8

    .line 841
    iget-wide v4, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-gtz v2, :cond_0

    goto :goto_1

    .line 844
    :cond_0
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll/۟ۚۧ;->ܺ֫:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Ll/۟ۚۧ;->ۢ֫:J

    :goto_0
    move-wide v6, v0

    add-long v0, v6, p1

    const-wide/16 v2, 0x0

    .line 845
    invoke-static/range {v0 .. v5}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide p1

    cmp-long v0, p1, v6

    if-nez v0, :cond_2

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 849
    :cond_2
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-nez v0, :cond_3

    .line 850
    invoke-direct {p0, p1, p2}, Ll/۟ۚۧ;->ܿ(J)V

    goto :goto_2

    .line 852
    :cond_3
    invoke-direct {p0, p1, p2}, Ll/۟ۚۧ;->ܳ(J)V

    .line 854
    :goto_2
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    const/4 p1, 0x1

    return p1
.end method

.method private ᩻()V
    .locals 10

    .line 859
    iget-object v0, p0, Ll/۟ۚۧ;->۫:Landroid/graphics/Rect;

    iget-object v1, p0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 860
    iget-object v2, p0, Ll/۟ۚۧ;->ۖ֫:Landroid/graphics/Rect;

    invoke-virtual {v2, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 861
    iget-boolean v3, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v3, :cond_0

    iget-wide v3, p0, Ll/۟ۚۧ;->ܺ֫:J

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Ll/۟ۚۧ;->ۢ֫:J

    .line 862
    :goto_0
    iget-wide v5, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-lez v9, :cond_1

    .line 863
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-long v5, v5

    iget-wide v7, p0, Ll/۟ۚۧ;->ۛ:J

    mul-long v5, v5, v7

    iget-wide v7, p0, Ll/۟ۚۧ;->᩺:J

    div-long/2addr v5, v7

    long-to-int v6, v5

    .line 864
    iget v5, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v6

    iget v6, v1, Landroid/graphics/Rect;->right:I

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 865
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-long v5, v0

    mul-long v5, v5, v3

    iget-wide v3, p0, Ll/۟ۚۧ;->᩺:J

    div-long/2addr v5, v3

    long-to-int v0, v5

    .line 866
    iget v3, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v3, v0

    iget v0, v1, Landroid/graphics/Rect;->right:I

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v2, Landroid/graphics/Rect;->right:I

    goto :goto_1

    .line 868
    :cond_1
    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 869
    iput v1, v2, Landroid/graphics/Rect;->right:I

    .line 871
    :goto_1
    iget-object v0, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 2

    .line 689
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 959
    iget-object v0, p0, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 960
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 961
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 962
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 1

    .line 695
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 696
    iget-object v0, p0, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 697
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 597
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 895
    iget-object v8, v0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 896
    invoke-virtual {v8}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    div-int/lit8 v3, v1, 0x2

    sub-int v9, v2, v3

    add-int v10, v9, v1

    .line 898
    iget-wide v1, v0, Ll/۟ۚۧ;->᩺:J

    iget-object v6, v0, Ll/۟ۚۧ;->۫֫:Landroid/graphics/Paint;

    iget-object v11, v0, Ll/۟ۚۧ;->ۖ֫:Landroid/graphics/Rect;

    const-wide/16 v12, 0x0

    cmp-long v3, v1, v12

    if-gtz v3, :cond_0

    .line 899
    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    int-to-float v3, v9

    iget v1, v8, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    int-to-float v5, v10

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_2

    .line 902
    :cond_0
    iget-object v1, v0, Ll/۟ۚۧ;->۫:Landroid/graphics/Rect;

    iget v14, v1, Landroid/graphics/Rect;->left:I

    .line 903
    iget v15, v1, Landroid/graphics/Rect;->right:I

    .line 904
    iget v1, v8, Landroid/graphics/Rect;->left:I

    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, v11, Landroid/graphics/Rect;->right:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 905
    iget v2, v8, Landroid/graphics/Rect;->right:I

    if-ge v1, v2, :cond_1

    int-to-float v3, v1

    int-to-float v4, v9

    int-to-float v5, v2

    int-to-float v2, v10

    move-object/from16 v1, p1

    move/from16 v16, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move/from16 v5, v16

    .line 906
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 908
    :cond_1
    iget v1, v11, Landroid/graphics/Rect;->right:I

    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-le v15, v1, :cond_2

    int-to-float v2, v1

    int-to-float v3, v9

    int-to-float v4, v15

    int-to-float v5, v10

    .line 910
    iget-object v6, v0, Ll/۟ۚۧ;->ۤ:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 912
    :cond_2
    invoke-virtual {v11}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_3

    .line 913
    iget v1, v11, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    int-to-float v3, v9

    iget v1, v11, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    int-to-float v5, v10

    iget-object v6, v0, Ll/۟ۚۧ;->᩷֫:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 915
    :cond_3
    iget v1, v0, Ll/۟ۚۧ;->᩸:I

    if-nez v1, :cond_4

    goto :goto_2

    .line 918
    :cond_4
    iget-object v14, v0, Ll/۟ۚۧ;->᩹:[J

    .line 155
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    iget-object v15, v0, Ll/۟ۚۧ;->᩻֫:[Z

    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    iget v6, v0, Ll/۟ۚۧ;->ۙ:I

    div-int/lit8 v16, v6, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 921
    :goto_0
    iget v2, v0, Ll/۟ۚۧ;->᩸:I

    if-ge v5, v2, :cond_6

    .line 922
    aget-wide v17, v14, v5

    const-wide/16 v19, 0x0

    iget-wide v2, v0, Ll/۟ۚۧ;->᩺:J

    move-wide/from16 v21, v2

    invoke-static/range {v17 .. v22}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v2

    .line 924
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-long v12, v4

    mul-long v12, v12, v2

    iget-wide v2, v0, Ll/۟ۚۧ;->᩺:J

    div-long/2addr v12, v2

    long-to-int v2, v12

    sub-int v2, v2, v16

    .line 925
    iget v3, v8, Landroid/graphics/Rect;->left:I

    .line 927
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v1, v3

    .line 928
    aget-boolean v2, v15, v5

    if-eqz v2, :cond_5

    iget-object v2, v0, Ll/۟ۚۧ;->ۜ֫:Landroid/graphics/Paint;

    goto :goto_1

    :cond_5
    iget-object v2, v0, Ll/۟ۚۧ;->᩶:Landroid/graphics/Paint;

    :goto_1
    move-object v12, v2

    int-to-float v2, v1

    int-to-float v3, v9

    add-int/2addr v1, v6

    int-to-float v4, v1

    int-to-float v13, v10

    move-object/from16 v1, p1

    move/from16 v19, v5

    move v5, v13

    move v13, v6

    move-object v6, v12

    .line 929
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v5, v19, 0x1

    const/4 v1, 0x0

    move v6, v13

    const-wide/16 v12, 0x0

    goto :goto_0

    .line 934
    :cond_6
    :goto_2
    iget-wide v1, v0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_7

    goto :goto_5

    .line 937
    :cond_7
    iget v1, v11, Landroid/graphics/Rect;->right:I

    iget v2, v11, Landroid/graphics/Rect;->left:I

    iget v3, v8, Landroid/graphics/Rect;->right:I

    invoke-static {v1, v2, v3}, Ll/ۘ֨֫;->֫(III)I

    move-result v1

    .line 938
    invoke-virtual {v11}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    .line 939
    iget-object v3, v0, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-nez v3, :cond_b

    .line 941
    iget-boolean v3, v0, Ll/۟ۚۧ;->᩹֫:Z

    if-nez v3, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    .line 943
    :cond_8
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_9

    iget v3, v0, Ll/۟ۚۧ;->֡֫:I

    goto :goto_4

    :cond_9
    iget v3, v0, Ll/۟ۚۧ;->ۘ֫:I

    goto :goto_4

    .line 942
    :cond_a
    :goto_3
    iget v3, v0, Ll/۟ۚۧ;->ᩴ֫:I

    :goto_4
    int-to-float v3, v3

    .line 944
    iget v4, v0, Ll/۟ۚۧ;->ܶ֫:F

    mul-float v3, v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    int-to-float v1, v1

    int-to-float v2, v2

    int-to-float v3, v3

    .line 945
    iget-object v4, v0, Ll/۟ۚۧ;->۠֫:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_5

    .line 947
    :cond_b
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    int-to-float v4, v4

    iget v5, v0, Ll/۟ۚۧ;->ܶ֫:F

    mul-float v4, v4, v5

    float-to-int v4, v4

    .line 948
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    int-to-float v5, v5

    iget v6, v0, Ll/۟ۚۧ;->ܶ֫:F

    mul-float v5, v5, v6

    float-to-int v5, v5

    .line 949
    div-int/lit8 v4, v4, 0x2

    sub-int v6, v1, v4

    div-int/lit8 v5, v5, 0x2

    sub-int v8, v2, v5

    add-int/2addr v1, v4

    add-int/2addr v2, v5

    invoke-virtual {v3, v6, v8, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 954
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 600
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 681
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 682
    iget-boolean p2, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz p2, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 683
    invoke-direct {p0, p1}, Ll/۟ۚۧ;->ۧ(Z)V

    :cond_0
    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 5

    .line 753
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 754
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 755
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    .line 979
    iget-object v1, p0, Ll/۟ۚۧ;->֫֫:Ljava/util/Formatter;

    iget-wide v2, p0, Ll/۟ۚۧ;->ۢ֫:J

    iget-object v4, p0, Ll/۟ۚۧ;->۟:Ljava/lang/StringBuilder;

    invoke-static {v4, v1, v2, v3}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v1

    .line 755
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v0, "android.widget.SeekBar"

    .line 757
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    .line 762
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "android.widget.SeekBar"

    .line 763
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 979
    iget-object v0, p0, Ll/۟ۚۧ;->֫֫:Ljava/util/Formatter;

    iget-wide v1, p0, Ll/۟ۚۧ;->ۢ֫:J

    iget-object v3, p0, Ll/۟ۚۧ;->۟:Ljava/lang/StringBuilder;

    invoke-static {v3, v0, v1, v2}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v0

    .line 764
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 765
    iget-wide v0, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 768
    :cond_0
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_FORWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 769
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_BACKWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 651
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 652
    invoke-direct {p0}, Ll/۟ۚۧ;->ܿ()J

    move-result-wide v0

    const/16 v2, 0x42

    const/4 v3, 0x1

    if-eq p1, v2, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    neg-long v0, v0

    .line 658
    :pswitch_1
    invoke-direct {p0, v0, v1}, Ll/۟ۚۧ;->ᩳ(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 659
    iget-object p1, p0, Ll/۟ۚۧ;->ۙ֫:Ll/᩸ۛᩳ;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide/16 v0, 0x3e8

    .line 660
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v3

    .line 666
    :cond_0
    :pswitch_2
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    .line 667
    invoke-direct {p0, p1}, Ll/۟ۚۧ;->ۧ(Z)V

    return v3

    .line 675
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 719
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    .line 720
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    .line 723
    iget-boolean p3, p0, Ll/۟ۚۧ;->֨֫:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    iget p3, p0, Ll/۟ۚۧ;->ۚ֫:I

    .line 724
    :goto_0
    iget v1, p0, Ll/۟ۚۧ;->ۗ:I

    const/4 v2, 0x1

    iget v3, p0, Ll/۟ۚۧ;->۬:I

    iget v4, p0, Ll/۟ۚۧ;->۬֫:I

    if-ne v1, v2, :cond_1

    .line 725
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int v1, p5, v1

    sub-int/2addr v1, v4

    .line 727
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int v2, p5, v2

    sub-int/2addr v2, v3

    div-int/lit8 v5, v3, 0x2

    sub-int v5, p3, v5

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v2, v5

    goto :goto_1

    :cond_1
    sub-int v1, p5, v4

    .line 729
    div-int/lit8 v1, v1, 0x2

    sub-int v2, p5, v3

    .line 730
    div-int/lit8 v2, v2, 0x2

    :goto_1
    add-int/2addr v4, v1

    .line 732
    iget-object v5, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {v5, p1, v1, p2, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 733
    iget p1, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, p3

    iget p2, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p2, p3

    add-int/2addr v3, v2

    iget-object p3, p0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    invoke-virtual {p3, p1, v2, p2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 738
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_3

    .line 968
    iget-object p1, p0, Ll/۟ۚۧ;->ܿ֫:Landroid/graphics/Rect;

    if-eqz p1, :cond_2

    .line 969
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    if-ne p1, p4, :cond_2

    iget-object p1, p0, Ll/۟ۚۧ;->ܿ֫:Landroid/graphics/Rect;

    .line 970
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    if-ne p1, p5, :cond_2

    goto :goto_2

    .line 974
    :cond_2
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, v0, v0, p4, p5}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p1, p0, Ll/۟ۚۧ;->ܿ֫:Landroid/graphics/Rect;

    .line 975
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemGestureExclusionRects(Ljava/util/List;)V

    .line 741
    :cond_3
    :goto_2
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 703
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 704
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 706
    iget v1, p0, Ll/۟ۚۧ;->۬֫:I

    if-nez v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 710
    :cond_1
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 711
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 959
    iget-object p1, p0, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_2

    .line 960
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 961
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 962
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 3

    .line 746
    iget-object v0, p0, Ll/۟ۚۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 993
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 747
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 605
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-wide v2, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    goto/16 :goto_1

    .line 879
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Ll/۟ۚۧ;->ۗ֫:Landroid/graphics/Point;

    invoke-virtual {v3, v0, v2}, Landroid/graphics/Point;->set(II)V

    .line 609
    iget v0, v3, Landroid/graphics/Point;->x:I

    .line 610
    iget v2, v3, Landroid/graphics/Point;->y:I

    .line 611
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    iget-object v4, p0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    iget-object v5, p0, Ll/۟ۚۧ;->ۖ֫:Landroid/graphics/Rect;

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    const/4 v7, 0x3

    if-eq v3, v6, :cond_3

    const/4 v8, 0x2

    if-eq v3, v8, :cond_1

    if-eq v3, v7, :cond_3

    goto :goto_1

    .line 622
    :cond_1
    iget-boolean p1, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz p1, :cond_6

    .line 623
    iget p1, p0, Ll/۟ۚۧ;->ܰ:I

    if-ge v2, p1, :cond_2

    .line 624
    iget p1, p0, Ll/۟ۚۧ;->ᩳ֫:I

    invoke-static {v0, p1, v7, p1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result p1

    int-to-float p1, p1

    goto :goto_0

    .line 627
    :cond_2
    iput v0, p0, Ll/۟ۚۧ;->ᩳ֫:I

    int-to-float p1, v0

    :goto_0
    float-to-int p1, p1

    .line 875
    iget v0, v4, Landroid/graphics/Rect;->left:I

    iget v1, v4, Landroid/graphics/Rect;->right:I

    invoke-static {p1, v0, v1}, Ll/ۘ֨֫;->֫(III)I

    move-result p1

    iput p1, v5, Landroid/graphics/Rect;->right:I

    .line 630
    invoke-direct {p0}, Ll/۟ۚۧ;->ܳ()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/۟ۚۧ;->ܳ(J)V

    .line 631
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    .line 632
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v6

    .line 638
    :cond_3
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v0, :cond_6

    .line 639
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v7, :cond_4

    const/4 v1, 0x1

    :cond_4
    invoke-direct {p0, v1}, Ll/۟ۚۧ;->ۧ(Z)V

    return v6

    :cond_5
    int-to-float p1, v0

    int-to-float v0, v2

    float-to-int p1, p1

    float-to-int v0, v0

    .line 891
    iget-object v2, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 875
    iget v0, v4, Landroid/graphics/Rect;->left:I

    iget v1, v4, Landroid/graphics/Rect;->right:I

    invoke-static {p1, v0, v1}, Ll/ۘ֨֫;->֫(III)I

    move-result p1

    iput p1, v5, Landroid/graphics/Rect;->right:I

    .line 615
    invoke-direct {p0}, Ll/۟ۚۧ;->ܳ()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/۟ۚۧ;->ܿ(J)V

    .line 616
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    .line 617
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v6

    :cond_6
    :goto_1
    return v1
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 6

    .line 774
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 777
    :cond_0
    iget-wide v1, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v3, 0x0

    const/4 p2, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    return p2

    :cond_1
    const/16 v1, 0x2000

    if-ne p1, v1, :cond_2

    .line 781
    invoke-direct {p0}, Ll/۟ۚۧ;->ܿ()J

    move-result-wide v1

    neg-long v1, v1

    invoke-direct {p0, v1, v2}, Ll/۟ۚۧ;->ᩳ(J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 782
    invoke-direct {p0, p2}, Ll/۟ۚۧ;->ۧ(Z)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x1000

    if-ne p1, v1, :cond_4

    .line 785
    invoke-direct {p0}, Ll/۟ۚۧ;->ܿ()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/۟ۚۧ;->ᩳ(J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 786
    invoke-direct {p0, p2}, Ll/۟ۚۧ;->ۧ(Z)V

    :cond_3
    :goto_0
    const/4 p1, 0x4

    .line 791
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return v0

    :cond_4
    return p2
.end method

.method public final setEnabled(Z)V
    .locals 1

    .line 589
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 590
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 591
    invoke-direct {p0, p1}, Ll/۟ۚۧ;->ۧ(Z)V

    :cond_0
    return-void
.end method

.method public final ֫()J
    .locals 6

    .line 568
    iget-object v0, p0, Ll/۟ۚۧ;->ۡ֫:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 1001
    iget v1, p0, Ll/۟ۚۧ;->ۨ:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    if-eqz v0, :cond_1

    .line 569
    iget-wide v1, p0, Ll/۟ۚۧ;->᩺:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v3, v0

    .line 571
    div-long/2addr v1, v3

    return-wide v1

    :cond_1
    :goto_0
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 3

    .line 537
    iget-wide v0, p0, Ll/۟ۚۧ;->ۢ֫:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-void

    .line 540
    :cond_0
    iput-wide p1, p0, Ll/۟ۚۧ;->ۢ֫:J

    .line 979
    iget-object v0, p0, Ll/۟ۚۧ;->۟:Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۚۧ;->֫֫:Ljava/util/Formatter;

    invoke-static {v0, v1, p1, p2}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    .line 541
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 542
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    return-void
.end method

.method public final ֫(Ll/֨۠ۧ;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    iget-object v0, p0, Ll/۟ۚۧ;->ܳ֫:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 422
    iget-object v0, p0, Ll/۟ۚۧ;->᩸֫:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 423
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 425
    :cond_0
    iput-boolean p1, p0, Ll/۟ۚۧ;->֨֫:Z

    const/4 p1, 0x0

    .line 426
    iput p1, p0, Ll/۟ۚۧ;->ܶ֫:F

    .line 427
    iget-object p1, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ֫([J[ZI)V
    .locals 1

    if-eqz p3, :cond_1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 577
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 579
    iput p3, p0, Ll/۟ۚۧ;->᩸:I

    .line 580
    iput-object p1, p0, Ll/۟ۚۧ;->᩹:[J

    .line 581
    iput-object p2, p0, Ll/۟ۚۧ;->᩻֫:[Z

    .line 582
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 436
    iget-object v0, p0, Ll/۟ۚۧ;->᩸֫:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 437
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 439
    :cond_0
    iget v1, p0, Ll/۟ۚۧ;->ܶ֫:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x0

    const/4 v3, 0x1

    aput v1, v2, v3

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const-wide/16 v1, 0xfa

    .line 440
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 441
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final ۧ(J)V
    .locals 3

    .line 556
    iget-wide v0, p0, Ll/۟ۚۧ;->᩺:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-void

    .line 559
    :cond_0
    iput-wide p1, p0, Ll/۟ۚۧ;->᩺:J

    .line 560
    iget-boolean v0, p0, Ll/۟ۚۧ;->᩹֫:Z

    if-eqz v0, :cond_1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    const/4 p1, 0x1

    .line 561
    invoke-direct {p0, p1}, Ll/۟ۚۧ;->ۧ(Z)V

    .line 563
    :cond_1
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 397
    iget-object v0, p0, Ll/۟ۚۧ;->᩸֫:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 398
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 400
    iput-boolean v0, p0, Ll/۟ۚۧ;->֨֫:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 401
    iput v0, p0, Ll/۟ۚۧ;->ܶ֫:F

    .line 402
    iget-object v0, p0, Ll/۟ۚۧ;->᩶֫:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final ܽ(J)V
    .locals 3

    .line 547
    iget-wide v0, p0, Ll/۟ۚۧ;->ۛ:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-void

    .line 550
    :cond_0
    iput-wide p1, p0, Ll/۟ۚۧ;->ۛ:J

    .line 551
    invoke-direct {p0}, Ll/۟ۚۧ;->᩻()V

    return-void
.end method

.method public final ᩳ()V
    .locals 4

    .line 411
    iget-object v0, p0, Ll/۟ۚۧ;->᩸֫:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 412
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v1, 0x0

    .line 414
    iput-boolean v1, p0, Ll/۟ۚۧ;->֨֫:Z

    .line 415
    iget v2, p0, Ll/۟ۚۧ;->ܶ֫:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    aput v2, v3, v1

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    aput v1, v3, v2

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const-wide/16 v1, 0xfa

    .line 416
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 417
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
