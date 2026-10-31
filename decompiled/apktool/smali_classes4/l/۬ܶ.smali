.class public Ll/۬ܶ;
.super Ll/ᩳۡ;
.source "B1CI"


# instance fields
.field public ۗ:Z

.field public ۙ:[Landroid/graphics/drawable/Drawable;

.field public ۛ:F

.field public ۤ:F

.field public ۨ:Landroid/view/ViewOutlineProvider;

.field public ۫:Landroid/graphics/RectF;

.field public ۬:Landroid/graphics/Path;

.field public ᩶:Landroid/graphics/drawable/LayerDrawable;

.field public ᩸:F

.field public ᩹:Ll/ۗܶ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 302
    invoke-direct {p0, p1, p2}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 284
    new-instance p1, Ll/ۗܶ;

    invoke-direct {p1}, Ll/ۗܶ;-><init>()V

    iput-object p1, p0, Ll/۬ܶ;->᩹:Ll/ۗܶ;

    const/4 p1, 0x1

    .line 285
    iput-boolean p1, p0, Ll/۬ܶ;->ۗ:Z

    const/4 p1, 0x0

    .line 286
    iput p1, p0, Ll/۬ܶ;->᩸:F

    .line 287
    iput p1, p0, Ll/۬ܶ;->ۛ:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 288
    iput p1, p0, Ll/۬ܶ;->ۤ:F

    .line 303
    invoke-direct {p0, p2}, Ll/۬ܶ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 307
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 284
    new-instance p1, Ll/ۗܶ;

    invoke-direct {p1}, Ll/ۗܶ;-><init>()V

    iput-object p1, p0, Ll/۬ܶ;->᩹:Ll/ۗܶ;

    const/4 p1, 0x1

    .line 285
    iput-boolean p1, p0, Ll/۬ܶ;->ۗ:Z

    const/4 p1, 0x0

    .line 286
    iput p1, p0, Ll/۬ܶ;->᩸:F

    .line 287
    iput p1, p0, Ll/۬ܶ;->ۛ:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 288
    iput p1, p0, Ll/۬ܶ;->ۤ:F

    .line 308
    invoke-direct {p0, p2}, Ll/۬ܶ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۬ܶ;)F
    .locals 0

    .line 85
    iget p0, p0, Ll/۬ܶ;->ۛ:F

    return p0
.end method

.method private ֫(Landroid/util/AttributeSet;)V
    .locals 10

    if-eqz p1, :cond_e

    .line 313
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ܳ:[I

    .line 314
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 315
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    .line 316
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v3, v0, :cond_d

    .line 319
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-ne v6, v7, :cond_0

    .line 321
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Ll/۬ܶ;->᩸:F

    goto/16 :goto_3

    :cond_0
    const/16 v7, 0x8

    .line 322
    iget-object v9, p0, Ll/۬ܶ;->᩹:Ll/ۗܶ;

    if-ne v6, v7, :cond_1

    .line 323
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 410
    iput v4, v9, Ll/ۗܶ;->᩻:F

    .line 411
    invoke-virtual {v9, p0}, Ll/ۗܶ;->֫(Landroid/widget/ImageView;)V

    goto/16 :goto_3

    :cond_1
    const/4 v7, 0x7

    if-ne v6, v7, :cond_2

    .line 325
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 372
    iput v4, v9, Ll/ۗܶ;->ܿ:F

    .line 373
    invoke-virtual {v9, p0}, Ll/ۗܶ;->֫(Landroid/widget/ImageView;)V

    goto/16 :goto_3

    :cond_2
    if-ne v6, v4, :cond_3

    .line 327
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 391
    iput v4, v9, Ll/ۗܶ;->ᩳ:F

    .line 392
    invoke-virtual {v9, p0}, Ll/ۗܶ;->֫(Landroid/widget/ImageView;)V

    goto/16 :goto_3

    :cond_3
    const/4 v4, 0x5

    if-ne v6, v4, :cond_a

    .line 330
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    .line 528
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 529
    iput v4, p0, Ll/۬ܶ;->ۤ:F

    .line 530
    iget v4, p0, Ll/۬ܶ;->ۛ:F

    const/high16 v5, -0x40800000    # -1.0f

    .line 531
    iput v5, p0, Ll/۬ܶ;->ۛ:F

    .line 532
    invoke-virtual {p0, v4}, Ll/۬ܶ;->֫(F)V

    goto/16 :goto_3

    .line 535
    :cond_4
    iget v6, p0, Ll/۬ܶ;->ۤ:F

    cmpl-float v6, v6, v4

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    const/4 v6, 0x0

    .line 536
    :goto_1
    iput v4, p0, Ll/۬ܶ;->ۤ:F

    cmpl-float v4, v4, v8

    if-eqz v4, :cond_9

    .line 539
    iget-object v4, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    if-nez v4, :cond_6

    .line 540
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    iput-object v4, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    .line 542
    :cond_6
    iget-object v4, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    if-nez v4, :cond_7

    .line 543
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    .line 546
    :cond_7
    iget-object v4, p0, Ll/۬ܶ;->ۨ:Landroid/view/ViewOutlineProvider;

    if-nez v4, :cond_8

    .line 547
    new-instance v4, Ll/ۙܶ;

    invoke-direct {v4, p0}, Ll/ۙܶ;-><init>(Ll/۬ܶ;)V

    iput-object v4, p0, Ll/۬ܶ;->ۨ:Landroid/view/ViewOutlineProvider;

    .line 555
    invoke-virtual {p0, v4}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 557
    :cond_8
    invoke-virtual {p0, v5}, Landroid/view/View;->setClipToOutline(Z)V

    .line 559
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 560
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 561
    iget-object v7, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    int-to-float v4, v4

    int-to-float v5, v5

    invoke-virtual {v7, v8, v8, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 562
    iget-object v4, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 563
    iget-object v4, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    iget-object v5, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    iget v7, p0, Ll/۬ܶ;->ۤ:F

    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v4, v5, v7, v7, v8}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_2

    .line 566
    :cond_9
    invoke-virtual {p0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    :goto_2
    if-eqz v6, :cond_c

    .line 571
    invoke-virtual {p0}, Landroid/view/View;->invalidateOutline()V

    goto :goto_3

    :cond_a
    const/4 v4, 0x6

    if-ne v6, v4, :cond_b

    .line 334
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    invoke-virtual {p0, v4}, Ll/۬ܶ;->֫(F)V

    goto :goto_3

    :cond_b
    const/4 v4, 0x4

    if-ne v6, v4, :cond_c

    .line 337
    iget-boolean v4, p0, Ll/۬ܶ;->ۗ:Z

    invoke-virtual {p1, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 361
    iput-boolean v4, p0, Ll/۬ܶ;->ۗ:Z

    :cond_c
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 340
    :cond_d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v2, :cond_e

    new-array p1, v4, [Landroid/graphics/drawable/Drawable;

    .line 343
    iput-object p1, p0, Ll/۬ܶ;->ۙ:[Landroid/graphics/drawable/Drawable;

    .line 344
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aput-object v0, p1, v1

    .line 345
    iget-object p1, p0, Ll/۬ܶ;->ۙ:[Landroid/graphics/drawable/Drawable;

    aput-object v2, p1, v5

    .line 347
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Ll/۬ܶ;->ۙ:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Ll/۬ܶ;->᩶:Landroid/graphics/drawable/LayerDrawable;

    .line 348
    invoke-virtual {p1, v5}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/high16 v0, 0x437f0000    # 255.0f

    iget v1, p0, Ll/۬ܶ;->᩸:F

    mul-float v1, v1, v0

    float-to-int v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 349
    iget-object p1, p0, Ll/۬ܶ;->᩶:Landroid/graphics/drawable/LayerDrawable;

    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_e
    return-void
.end method

.method public static synthetic ۧ(Ll/۬ܶ;)F
    .locals 0

    .line 85
    iget p0, p0, Ll/۬ܶ;->ۤ:F

    return p0
.end method


# virtual methods
.method public final ֫(F)V
    .locals 5

    .line 477
    iget v0, p0, Ll/۬ܶ;->ۛ:F

    const/4 v1, 0x0

    const/4 v2, 0x1

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 478
    :goto_0
    iput p1, p0, Ll/۬ܶ;->ۛ:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_4

    .line 480
    iget-object p1, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    if-nez p1, :cond_1

    .line 481
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    .line 483
    :cond_1
    iget-object p1, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    if-nez p1, :cond_2

    .line 484
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    .line 487
    :cond_2
    iget-object p1, p0, Ll/۬ܶ;->ۨ:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_3

    .line 488
    new-instance p1, Ll/᩶ܶ;

    invoke-direct {p1, p0}, Ll/᩶ܶ;-><init>(Ll/۬ܶ;)V

    iput-object p1, p0, Ll/۬ܶ;->ۨ:Landroid/view/ViewOutlineProvider;

    .line 497
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 499
    :cond_3
    invoke-virtual {p0, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 502
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 503
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 504
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Ll/۬ܶ;->ۛ:F

    mul-float v2, v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 505
    iget-object v4, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 506
    iget-object p1, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 507
    iget-object p1, p0, Ll/۬ܶ;->۬:Landroid/graphics/Path;

    iget-object v1, p0, Ll/۬ܶ;->۫:Landroid/graphics/RectF;

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_1

    .line 510
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    :goto_1
    if-eqz v0, :cond_5

    .line 515
    invoke-virtual {p0}, Landroid/view/View;->invalidateOutline()V

    :cond_5
    return-void
.end method
