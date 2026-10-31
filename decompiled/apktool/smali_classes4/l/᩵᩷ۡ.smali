.class public Ll/᩵᩷ۡ;
.super Landroid/view/View;
.source "Y169"


# static fields
.field public static final synthetic ܶ֫:I = 0x0

.field public static ᩸֫:Z = true


# instance fields
.field public ֡֫:Ll/ᩴ᩷ۡ;

.field public ֨֫:Landroid/graphics/PorterDuffColorFilter;

.field public ֫֫:Ll/۬ۧ֫;

.field public final ۖ֫:Ll/ۖ᩷ۡ;

.field public ۗ:F

.field public ۘ֫:I

.field public ۙ:Landroid/view/View;

.field public ۚ֫:J

.field public ۛ:Z

.field public ۜ֫:Z

.field public ۟:Landroid/view/View;

.field public final ۠֫:I

.field public ۡ֫:Z

.field public ۢ֫:Z

.field public final ۤ:Ljava/util/ArrayList;

.field public ۧ֫:Landroid/view/View;

.field public ۨ:Z

.field public ۫:Landroid/view/VelocityTracker;

.field public ۬:Ll/ۜ᩷ۡ;

.field public ܰ:F

.field public final ܳ֫:Landroid/graphics/Rect;

.field public ܺ֫:Z

.field public ܽ֫:Landroid/view/VelocityTracker;

.field public ܿ֫:Landroid/graphics/drawable/Drawable;

.field public ᩳ֫:F

.field public ᩴ֫:Ll/ۡ᩷ۡ;

.field public ᩵֫:I

.field public ᩶:Ll/ܳ᩷ۡ;

.field public ᩷֫:Z

.field public final ᩸:Ll/֨ۚۢ;

.field public ᩹:Landroid/app/Activity;

.field public ᩺:F

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, p2, v0}, Ll/᩵᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 109
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    new-instance p2, Ljava/util/ArrayList;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    .line 66
    new-instance p2, Ll/ۖ᩷ۡ;

    invoke-direct {p2}, Ll/ۖ᩷ۡ;-><init>()V

    iput-object p2, p0, Ll/᩵᩷ۡ;->ۖ֫:Ll/ۖ᩷ۡ;

    .line 70
    sget-object p2, Ll/ᩴ᩷ۡ;->᩹:Ll/ᩴ᩷ۡ;

    iput-object p2, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    .line 72
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p2

    iput-object p2, p0, Ll/᩵᩷ۡ;->ܽ֫:Landroid/view/VelocityTracker;

    .line 79
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p2

    iput-object p2, p0, Ll/᩵᩷ۡ;->۫:Landroid/view/VelocityTracker;

    .line 84
    new-instance p2, Ll/ۜ᩷ۡ;

    invoke-direct {p2, p0}, Ll/ۜ᩷ۡ;-><init>(Ll/᩵᩷ۡ;)V

    iput-object p2, p0, Ll/᩵᩷ۡ;->۬:Ll/ۜ᩷ۡ;

    const/4 p2, 0x1

    .line 97
    iput-boolean p2, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    .line 346
    new-instance p2, Ll/֨ۚۢ;

    new-instance p3, Ll/۟֫ᩴ;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-direct {p2, p0, p3}, Ll/֨ۚۢ;-><init>(Ljava/lang/Object;Ll/ۚۚۢ;)V

    iput-object p2, p0, Ll/᩵᩷ۡ;->᩸:Ll/֨ۚۢ;

    .line 565
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Ll/᩵᩷ۡ;->ܳ֫:Landroid/graphics/Rect;

    .line 110
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Ll/᩵᩷ۡ;->۠֫:I

    .line 111
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_0

    .line 112
    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ۜ()V

    .line 113
    sget-boolean p2, Ll/᩵᩷ۡ;->᩸֫:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 114
    sput-boolean p2, Ll/᩵᩷ۡ;->᩸֫:Z

    .line 116
    new-instance p2, Ll/᩷᩷ۡ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xf2ac

    invoke-virtual {p0, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 119
    :cond_0
    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩷ۡ;->᩹:Landroid/app/Activity;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩷ۡ;)V
    .locals 1

    .line 347
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 348
    iput-boolean v0, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    .line 349
    invoke-virtual {p0}, Landroid/view/View;->performLongClick()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 350
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩷ۡ;F)V
    .locals 2

    .line 85
    iget v0, p0, Ll/᩵᩷ۡ;->ۗ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 86
    iput p1, p0, Ll/᩵᩷ۡ;->ۗ:F

    .line 87
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 89
    :cond_0
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    if-eqz p1, :cond_2

    .line 90
    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v0}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result p1

    .line 91
    iget v0, p0, Ll/᩵᩷ۡ;->ۗ:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    if-eq p1, v0, :cond_2

    .line 93
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object p0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v0, p0}, Ll/۬ۧ֫;->ۧ(ILandroid/view/View;)V

    :cond_2
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩵᩷ۡ;)Ll/ᩴ᩷ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩵᩷ۡ;)Landroid/graphics/ColorFilter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩷ۡ;->֨֫:Landroid/graphics/PorterDuffColorFilter;

    return-object p0
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 569
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 571
    iget-object v2, v0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_5

    .line 574
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/᩵᩷ۡ;->ܽ()I

    move-result v3

    .line 575
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v6, v4, v5

    int-to-float v7, v3

    div-float/2addr v7, v5

    .line 579
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    const/4 v8, 0x0

    invoke-virtual {v1, v8, v8, v5, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 582
    sget-object v5, Ll/ۢ᩷ۡ;->֫:[I

    iget-object v8, v0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v5, v5, v8

    const/4 v8, 0x1

    const/4 v9, 0x2

    if-eq v5, v8, :cond_6

    const/high16 v8, 0x437a0000    # 250.0f

    const-wide/16 v12, 0xfa

    if-eq v5, v9, :cond_3

    const/4 v9, 0x3

    if-eq v5, v9, :cond_4

    const/4 v9, 0x4

    if-eq v5, v9, :cond_1

    goto :goto_0

    .line 601
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iget-wide v10, v0, Ll/᩵᩷ۡ;->ۚ֫:J

    sub-long/2addr v14, v10

    cmp-long v10, v14, v12

    if-ltz v10, :cond_2

    .line 603
    sget-object v8, Ll/ᩴ᩷ۡ;->᩹:Ll/ᩴ᩷ۡ;

    iput-object v8, v0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    :goto_0
    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    long-to-float v10, v14

    div-float/2addr v10, v8

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v10, v8, v10

    .line 607
    sget v8, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    move v8, v10

    goto :goto_1

    .line 587
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const/high16 v14, 0x437a0000    # 250.0f

    iget-wide v8, v0, Ll/᩵᩷ۡ;->ۚ֫:J

    sub-long/2addr v10, v8

    cmp-long v8, v10, v12

    if-ltz v8, :cond_5

    .line 589
    sget-object v8, Ll/ᩴ᩷ۡ;->ۙ:Ll/ᩴ᩷ۡ;

    iput-object v8, v0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    :cond_4
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    long-to-float v8, v10

    div-float/2addr v8, v14

    .line 593
    sget v9, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :goto_1
    const/high16 v10, 0x40000000    # 2.0f

    goto :goto_2

    :cond_6
    const/high16 v10, 0x40000000    # 2.0f

    const/4 v8, 0x0

    .line 612
    :goto_2
    iget-object v9, v0, Ll/᩵᩷ۡ;->ۖ֫:Ll/ۖ᩷ۡ;

    invoke-virtual {v9}, Ll/ۖ᩷ۡ;->ܽ()Z

    move-result v11

    if-eqz v11, :cond_8

    .line 614
    iget-boolean v11, v0, Ll/᩵᩷ۡ;->ۨ:Z

    if-eqz v11, :cond_7

    .line 615
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v11, v10

    mul-float v12, v7, v7

    mul-float v13, v11, v11

    add-float/2addr v13, v12

    float-to-double v12, v13

    .line 616
    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v13, v12

    .line 617
    invoke-virtual {v9, v1, v13, v11, v7}, Ll/ۖ᩷ۡ;->֫(Landroid/graphics/Canvas;IFF)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 618
    sget v9, Ll/ܿ᩺;->֫:I

    goto :goto_3

    :cond_7
    mul-float v11, v7, v7

    mul-float v12, v6, v6

    add-float/2addr v12, v11

    float-to-double v11, v12

    .line 621
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v12, v11

    .line 622
    iget v11, v0, Ll/᩵᩷ۡ;->ۘ֫:I

    int-to-float v11, v11

    mul-float v11, v11, v4

    add-float/2addr v11, v6

    invoke-virtual {v9, v1, v12, v11, v7}, Ll/ۖ᩷ۡ;->֫(Landroid/graphics/Canvas;IFF)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 623
    sget v9, Ll/ܿ᩺;->֫:I

    .line 1323
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 628
    :cond_8
    iget v11, v0, Ll/᩵᩷ۡ;->ۗ:F

    const/high16 v9, 0x3f000000    # 0.5f

    .line 629
    iget-object v12, v0, Ll/᩵᩷ۡ;->ܳ֫:Landroid/graphics/Rect;

    cmpg-float v9, v11, v9

    if-gtz v9, :cond_a

    mul-float v9, v11, v10

    const/high16 v13, 0x3f800000    # 1.0f

    sub-float v14, v13, v9

    .line 631
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    const/4 v5, 0x0

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۡ᩷ۡ;

    .line 632
    invoke-virtual {v13}, Ll/ۡ᩷ۡ;->ۧ()I

    move-result v15

    .line 633
    invoke-virtual {v13}, Ll/ۡ᩷ۡ;->֫()I

    move-result v9

    cmpl-float v5, v11, v5

    if-eqz v5, :cond_9

    int-to-float v5, v9

    mul-float v5, v5, v14

    float-to-int v9, v5

    :cond_9
    int-to-float v5, v15

    div-float/2addr v5, v10

    sub-float v5, v6, v5

    float-to-int v5, v5

    .line 637
    iput v5, v12, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v15

    .line 638
    iput v5, v12, Landroid/graphics/Rect;->right:I

    int-to-float v5, v9

    div-float/2addr v5, v10

    sub-float v5, v7, v5

    float-to-int v5, v5

    .line 639
    iput v5, v12, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v9

    .line 640
    iput v5, v12, Landroid/graphics/Rect;->bottom:I

    .line 641
    invoke-virtual {v13, v1, v12, v8, v14}, Ll/ۡ᩷ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Rect;FF)V

    add-float/2addr v6, v4

    goto :goto_4

    :cond_a
    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v4, v11, v2

    if-ltz v4, :cond_b

    .line 646
    iget-object v4, v0, Ll/᩵᩷ۡ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    .line 647
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    .line 648
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float v7, v11, v10

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v7, v8

    mul-float v7, v7, v6

    float-to-int v6, v7

    .line 650
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    sub-int/2addr v7, v5

    div-int/lit8 v7, v7, 0x2

    iput v7, v12, Landroid/graphics/Rect;->left:I

    add-int/2addr v7, v5

    .line 651
    iput v7, v12, Landroid/graphics/Rect;->right:I

    sub-int/2addr v3, v6

    .line 652
    div-int/lit8 v3, v3, 0x2

    iput v3, v12, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v6

    .line 653
    iput v3, v12, Landroid/graphics/Rect;->bottom:I

    .line 654
    invoke-virtual {v4, v12}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    const/high16 v3, 0x43190000    # 153.0f

    sub-float/2addr v11, v2

    mul-float v11, v11, v3

    mul-float v11, v11, v10

    float-to-int v2, v11

    .line 655
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 656
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_b
    :goto_5
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    .line 172
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 173
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    const v3, 0x7f070052

    if-eq v0, v1, :cond_0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_3

    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    float-to-int p2, p2

    .line 132
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    if-eqz v0, :cond_2

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    goto :goto_2

    .line 179
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 132
    iget-boolean v1, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    sub-int/2addr p2, v1

    .line 179
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 132
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    add-int/2addr p2, v2

    .line 188
    :cond_3
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 364
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 365
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ܽ()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/᩵᩷ۡ;->ۛ:Z

    .line 367
    :cond_1
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ۛ:Z

    if-eqz v0, :cond_2

    goto/16 :goto_a

    .line 370
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    iget-object v3, p0, Ll/᩵᩷ۡ;->᩸:Ll/֨ۚۢ;

    iget-object v4, p0, Ll/᩵᩷ۡ;->ۖ֫:Ll/ۖ᩷ۡ;

    const/4 v5, 0x0

    if-eqz v0, :cond_31

    iget-object v6, p0, Ll/᩵᩷ۡ;->۫:Landroid/view/VelocityTracker;

    iget-object v7, p0, Ll/᩵᩷ۡ;->ܽ֫:Landroid/view/VelocityTracker;

    if-eq v0, v2, :cond_21

    const/4 v8, 0x2

    if-eq v0, v8, :cond_7

    const/4 p1, 0x3

    if-eq v0, p1, :cond_3

    goto/16 :goto_a

    .line 537
    :cond_3
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    if-eqz p1, :cond_4

    .line 538
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    .line 1731
    invoke-virtual {p1, v0}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    .line 540
    :cond_4
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    if-eqz p1, :cond_5

    .line 541
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    .line 1731
    invoke-virtual {p1, v0}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    .line 543
    :cond_5
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    if-eqz p1, :cond_6

    .line 544
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ܽ()V

    .line 545
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->֫()V

    .line 547
    :cond_6
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->ᩳ()V

    .line 548
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 557
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    .line 558
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    .line 559
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->clear()V

    .line 560
    iput v5, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    .line 561
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    .line 562
    invoke-virtual {v6}, Landroid/view/VelocityTracker;->clear()V

    .line 550
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    .line 406
    :cond_7
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    const/high16 v8, 0x40000000    # 2.0f

    if-nez v0, :cond_11

    .line 407
    iget v0, p0, Ll/᩵᩷ۡ;->᩺:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    sub-float/2addr v0, v9

    .line 408
    iget v9, p0, Ll/᩵᩷ۡ;->ܰ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    sub-float/2addr v9, v10

    .line 409
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v10

    .line 410
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 411
    iget v11, p0, Ll/᩵᩷ۡ;->۠֫:I

    int-to-float v11, v11

    cmpl-float v12, v10, v11

    if-gtz v12, :cond_8

    cmpl-float v11, v9, v11

    if-lez v11, :cond_11

    .line 412
    :cond_8
    iget-boolean v11, p0, Ll/᩵᩷ۡ;->ۨ:Z

    if-eqz v11, :cond_9

    .line 413
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->֫()V

    goto :goto_3

    .line 414
    :cond_9
    iget-object v11, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    if-eqz v11, :cond_e

    cmpl-float v11, v10, v9

    if-lez v11, :cond_e

    .line 415
    iget-object v9, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    if-eqz v9, :cond_b

    iget-object v10, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    if-eqz v10, :cond_b

    cmpg-float v0, v0, v5

    if-gez v0, :cond_a

    .line 417
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    goto :goto_1

    .line 419
    :cond_a
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    goto :goto_1

    :cond_b
    if-eqz v9, :cond_c

    .line 422
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    goto :goto_1

    .line 423
    :cond_c
    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    if-eqz v0, :cond_d

    .line 424
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    .line 428
    :goto_1
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->ᩳ()V

    goto :goto_3

    .line 426
    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 429
    :cond_e
    iget-object v0, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    if-eqz v0, :cond_10

    cmpg-float v0, v10, v9

    if-gtz v0, :cond_10

    .line 430
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    .line 431
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->֫()V

    .line 432
    iget v0, p0, Ll/᩵᩷ۡ;->᩺:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v8

    cmpg-float v0, v0, v4

    if-gez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_2

    :cond_f
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Ll/᩵᩷ۡ;->ۡ֫:Z

    .line 434
    :cond_10
    :goto_3
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    .line 435
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 436
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 439
    :cond_11
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    const/4 v3, 0x4

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v0, :cond_16

    .line 440
    invoke-virtual {v7, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 441
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v8

    .line 442
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v6, p0, Ll/᩵᩷ۡ;->᩺:F

    sub-float/2addr p1, v6

    div-float/2addr p1, v0

    cmpl-float v0, p1, v4

    if-lez v0, :cond_12

    goto :goto_4

    :cond_12
    cmpg-float v0, p1, v5

    if-gez v0, :cond_13

    const/4 v4, 0x0

    goto :goto_4

    :cond_13
    move v4, p1

    :goto_4
    cmpl-float p1, v4, v5

    if-nez p1, :cond_14

    .line 447
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_15

    .line 448
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 450
    :cond_14
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-ne p1, v3, :cond_15

    .line 451
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 453
    :cond_15
    :goto_5
    iput v4, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    .line 454
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    invoke-static {p1, v0, v4}, Ll/۫ۧ֫;->֫(Ll/۬ۧ֫;Landroid/view/View;F)V

    return v2

    .line 455
    :cond_16
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    if-eqz v0, :cond_1b

    .line 456
    invoke-virtual {v7, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 457
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v8

    .line 458
    iget v6, p0, Ll/᩵᩷ۡ;->᩺:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    sub-float/2addr v6, p1

    div-float/2addr v6, v0

    cmpl-float p1, v6, v4

    if-lez p1, :cond_17

    goto :goto_6

    :cond_17
    cmpg-float p1, v6, v5

    if-gez p1, :cond_18

    const/4 v4, 0x0

    goto :goto_6

    :cond_18
    move v4, v6

    :goto_6
    cmpl-float p1, v4, v5

    if-nez p1, :cond_19

    .line 463
    iget-object p1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1a

    .line 464
    iget-object p1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    .line 466
    :cond_19
    iget-object p1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-ne p1, v3, :cond_1a

    .line 467
    iget-object p1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 469
    :cond_1a
    :goto_7
    iput v4, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    .line 470
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    invoke-static {p1, v0, v4}, Ll/۫ۧ֫;->֫(Ll/۬ۧ֫;Landroid/view/View;F)V

    return v2

    .line 471
    :cond_1b
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    if-eqz v0, :cond_20

    .line 472
    invoke-virtual {v6, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 473
    iget-object v0, p0, Ll/᩵᩷ۡ;->ۙ:Landroid/view/View;

    if-nez v0, :cond_1c

    const/4 v0, 0x0

    goto :goto_8

    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3fc00000    # 1.5f

    div-float/2addr v0, v1

    :goto_8
    cmpl-float v1, v0, v5

    if-nez v1, :cond_1d

    .line 475
    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ܽ()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v8

    .line 476
    :cond_1d
    iget v1, p0, Ll/᩵᩷ۡ;->ܰ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    sub-float/2addr v1, p1

    div-float/2addr v1, v0

    cmpl-float p1, v1, v4

    if-lez p1, :cond_1e

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_1e
    cmpg-float p1, v1, v5

    if-gez p1, :cond_1f

    goto :goto_9

    :cond_1f
    move v5, v1

    .line 480
    :goto_9
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1, v5}, Ll/ܳ᩷ۡ;->ۧ(F)V

    :cond_20
    :goto_a
    return v2

    .line 484
    :cond_21
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 485
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    const v0, 0x3ecccccd    # 0.4f

    const/high16 v3, -0x3b860000    # -1000.0f

    const/high16 v8, 0x447a0000    # 1000.0f

    const/16 v9, 0x3e8

    if-eqz p1, :cond_25

    .line 486
    invoke-virtual {v7, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 487
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    cmpl-float v8, p1, v8

    if-ltz v8, :cond_22

    .line 489
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    .line 1731
    :goto_b
    invoke-virtual {p1, v0}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    goto/16 :goto_d

    :cond_22
    cmpg-float p1, p1, v3

    if-gtz p1, :cond_23

    .line 491
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    .line 1809
    :goto_c
    invoke-virtual {p1, v0, v2}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    goto/16 :goto_d

    .line 492
    :cond_23
    iget p1, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_24

    .line 493
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    goto :goto_b

    .line 495
    :cond_24
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    goto :goto_c

    .line 497
    :cond_25
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    if-eqz p1, :cond_29

    .line 498
    invoke-virtual {v7, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 499
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    neg-float p1, p1

    cmpl-float v8, p1, v8

    if-ltz v8, :cond_26

    .line 501
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    goto :goto_b

    :cond_26
    cmpg-float p1, p1, v3

    if-gtz p1, :cond_27

    .line 503
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    goto :goto_c

    .line 504
    :cond_27
    iget p1, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_28

    .line 505
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    goto :goto_b

    .line 507
    :cond_28
    iget-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    iget-object v0, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    goto :goto_c

    .line 509
    :cond_29
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->ۨ:Z

    if-eqz p1, :cond_2b

    .line 510
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    if-nez p1, :cond_2a

    .line 511
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ܽ()V

    .line 513
    :cond_2a
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->֫()V

    goto :goto_d

    .line 514
    :cond_2b
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    if-eqz p1, :cond_2f

    .line 515
    invoke-virtual {v6, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 516
    invoke-virtual {v6}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_2c

    .line 518
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ۜ()V

    goto :goto_d

    :cond_2c
    cmpl-float p1, p1, v8

    if-ltz p1, :cond_2d

    .line 520
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ܽ()V

    goto :goto_d

    .line 521
    :cond_2d
    iget p1, p0, Ll/᩵᩷ۡ;->ۗ:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_2e

    .line 522
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ۜ()V

    goto :goto_d

    .line 524
    :cond_2e
    iget-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    invoke-virtual {p1}, Ll/ܳ᩷ۡ;->ܽ()V

    .line 527
    :cond_2f
    :goto_d
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->ᩳ()V

    .line 528
    iget-boolean p1, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    if-nez p1, :cond_30

    iget-object p1, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    if-eqz p1, :cond_30

    .line 529
    invoke-virtual {p1}, Ll/ۡ᩷ۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_30

    .line 530
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 557
    :cond_30
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->ۢ֫:Z

    .line 558
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->ۜ֫:Z

    .line 559
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->clear()V

    .line 560
    iput v5, p0, Ll/᩵᩷ۡ;->ᩳ֫:F

    .line 561
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->᩻֫:Z

    .line 562
    invoke-virtual {v6}, Landroid/view/VelocityTracker;->clear()V

    .line 534
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    .line 372
    :cond_31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/᩵᩷ۡ;->᩺:F

    .line 373
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/᩵᩷ۡ;->ܰ:F

    .line 374
    iget p1, p0, Ll/᩵᩷ۡ;->ۗ:F

    const/4 v0, 0x0

    cmpl-float p1, p1, v5

    if-eqz p1, :cond_32

    .line 375
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    .line 376
    iput-boolean v2, p0, Ll/᩵᩷ۡ;->ۨ:Z

    .line 377
    iput-object v0, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    .line 378
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->ۧ()V

    goto :goto_e

    .line 380
    :cond_32
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->ۨ:Z

    .line 381
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_36

    .line 382
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    div-int/2addr v5, v6

    .line 383
    iget v6, p0, Ll/᩵᩷ۡ;->᩺:F

    int-to-float v5, v5

    div-float/2addr v6, v5

    float-to-int v5, v6

    iput v5, p0, Ll/᩵᩷ۡ;->᩵֫:I

    if-ltz v5, :cond_35

    .line 384
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_35

    .line 385
    iput-boolean v1, p0, Ll/᩵᩷ۡ;->᩷֫:Z

    .line 386
    iget v0, p0, Ll/᩵᩷ۡ;->᩵֫:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ᩷ۡ;

    iput-object p1, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    .line 387
    invoke-virtual {p1}, Ll/ۡ᩷ۡ;->ܽ()Z

    move-result p1

    .line 388
    iget-object v0, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    invoke-virtual {v0}, Ll/ۡ᩷ۡ;->ᩳ()Z

    move-result v0

    if-nez p1, :cond_33

    if-eqz v0, :cond_34

    .line 390
    :cond_33
    invoke-virtual {v4}, Ll/ۖ᩷ۡ;->ۧ()V

    .line 391
    iget p1, p0, Ll/᩵᩷ۡ;->᩵֫:I

    iput p1, p0, Ll/᩵᩷ۡ;->ۘ֫:I

    :cond_34
    if-eqz v0, :cond_37

    .line 394
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_e

    .line 397
    :cond_35
    iput-object v0, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    goto :goto_e

    .line 400
    :cond_36
    iput-object v0, p0, Ll/᩵᩷ۡ;->ᩴ֫:Ll/ۡ᩷ۡ;

    .line 403
    :cond_37
    :goto_e
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2
.end method

.method public final ֫(I)Ll/ۡ᩷ۡ;
    .locals 1

    .line 259
    iget-object v0, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ᩷ۡ;

    return-object p1
.end method

.method public final ֫(II)Ll/ܺ᩷ۡ;
    .locals 1

    .line 267
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 268
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 278
    new-instance v0, Ll/ܺ᩷ۡ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܺ᩷ۡ;-><init>(Ll/᩵᩷ۡ;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 279
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(Ll/ᩴۢᩳ;)Ll/ܺ᩷ۡ;
    .locals 2

    const v0, 0x7f0802c3

    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 278
    new-instance v1, Ll/ܺ᩷ۡ;

    invoke-direct {v1, p0, p1, v0}, Ll/ܺ᩷ۡ;-><init>(Ll/᩵᩷ۡ;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 279
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final ֫()V
    .locals 1

    .line 263
    iget-object v0, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ll/۬ۧ֫;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 296
    iput-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    .line 297
    iput-object p1, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    .line 298
    iput-object p1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    return-void

    :cond_0
    const v0, 0x800003

    .line 300
    invoke-static {p1, v0}, Ll/۫ۧ֫;->֫(Ll/۬ۧ֫;I)Landroid/view/View;

    move-result-object v0

    const v1, 0x800005

    .line 301
    invoke-static {p1, v1}, Ll/۫ۧ֫;->֫(Ll/۬ۧ֫;I)Landroid/view/View;

    move-result-object v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    .line 303
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 305
    :cond_2
    :goto_0
    iput-object p1, p0, Ll/᩵᩷ۡ;->֫֫:Ll/۬ۧ֫;

    .line 306
    iput-object v0, p0, Ll/᩵᩷ۡ;->ۧ֫:Landroid/view/View;

    .line 307
    iput-object v1, p0, Ll/᩵᩷ۡ;->۟:Landroid/view/View;

    return-void
.end method

.method public final ֫(Ll/ܳ᩷ۡ;)V
    .locals 3

    .line 312
    iget-object v0, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    const v1, 0x7f0a0092

    if-ne v0, p1, :cond_0

    .line 313
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩷ۡ;->ۙ:Landroid/view/View;

    return-void

    .line 316
    :cond_0
    iget-object v2, p0, Ll/᩵᩷ۡ;->۬:Ll/ۜ᩷ۡ;

    if-eqz v0, :cond_1

    .line 317
    invoke-virtual {v0, v2}, Ll/ܳ᩷ۡ;->֫(Ll/ۜ᩷ۡ;)V

    .line 319
    :cond_1
    iput-object p1, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    const/4 v0, 0x0

    .line 320
    iput v0, p0, Ll/᩵᩷ۡ;->ۗ:F

    if-eqz p1, :cond_3

    .line 322
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩷ۡ;->ۙ:Landroid/view/View;

    .line 323
    invoke-virtual {p1, v2}, Ll/ܳ᩷ۡ;->֫(Ll/᩻᩷ۡ;)V

    .line 324
    iget-object p1, p0, Ll/᩵᩷ۡ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_2

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f080114

    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩷ۡ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    .line 326
    iget-object v0, p0, Ll/᩵᩷ۡ;->֨֫:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_2
    return-void

    :cond_3
    const/4 p1, 0x0

    .line 329
    iput-object p1, p0, Ll/᩵᩷ۡ;->ۙ:Landroid/view/View;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 123
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    if-eq v0, p1, :cond_0

    .line 124
    iput-boolean p1, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p1

    if-eqz p1, :cond_0

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ۜ()V
    .locals 3

    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v2, 0x7f060058

    invoke-static {v1, v2, v0}, Ll/ۙۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result v0

    .line 193
    invoke-static {v0}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩷ۡ;->֨֫:Landroid/graphics/PorterDuffColorFilter;

    .line 194
    iget-object v1, p0, Ll/᩵᩷ۡ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 195
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    const v0, -0xbfbfc0

    const v1, -0x29292a

    .line 198
    invoke-static {v0, v1}, Ll/᩹֡᩷;->֫(II)I

    move-result v0

    .line 199
    iget-object v1, p0, Ll/᩵᩷ۡ;->ۖ֫:Ll/ۖ᩷ۡ;

    invoke-virtual {v1, v0}, Ll/ۖ᩷ۡ;->֫(I)V

    .line 200
    iget-object v0, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩷ۡ;

    .line 201
    invoke-virtual {v1}, Ll/ۡ᩷ۡ;->ܿ()V

    goto :goto_0

    .line 203
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۡ()V
    .locals 5

    .line 147
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "bottom_toolbar_padding_type"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, -0x1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :pswitch_1
    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0xc

    const-string v1, "bottom_toolbar_padding_bottom"

    packed-switch v4, :pswitch_data_1

    return-void

    .line 163
    :pswitch_3
    invoke-virtual {p0, v3}, Ll/᩵᩷ۡ;->ۧ(I)V

    return-void

    .line 159
    :pswitch_4
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    .line 160
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩵᩷ۡ;->ۧ(I)V

    return-void

    .line 149
    :pswitch_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v2, v4, :cond_3

    iget-object v2, p0, Ll/᩵᩷ۡ;->᩹:Landroid/app/Activity;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 150
    invoke-virtual {p0, v3}, Ll/᩵᩷ۡ;->ۧ(I)V

    return-void

    .line 151
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۤۡ;->֫(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 152
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    .line 153
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩵᩷ۡ;->ۧ(I)V

    return-void

    .line 155
    :cond_4
    invoke-virtual {p0, v3}, Ll/᩵᩷ۡ;->ۧ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final ۢ()V
    .locals 2

    .line 232
    iget-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    sget-object v1, Ll/ᩴ᩷ۡ;->᩹:Ll/ᩴ᩷ۡ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ᩴ᩷ۡ;->ۗ:Ll/ᩴ᩷ۡ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 237
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 233
    :cond_1
    :goto_0
    sget-object v0, Ll/ᩴ᩷ۡ;->᩶:Ll/ᩴ᩷ۡ;

    iput-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    .line 234
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵᩷ۡ;->ۚ֫:J

    .line 235
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final ۧ()Ll/ܳ᩷ۡ;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/᩵᩷ۡ;->᩶:Ll/ܳ᩷ۡ;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    .line 284
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 289
    new-instance v0, Ll/ۘ᩷ۡ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۘ᩷ۡ;-><init>(Ll/᩵᩷ۡ;Landroid/graphics/drawable/Drawable;I)V

    .line 290
    iget-object p1, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 214
    iget-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    sget-object v1, Ll/ᩴ᩷ۡ;->᩹:Ll/ᩴ᩷ۡ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 3

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 132
    iget-boolean v1, p0, Ll/᩵᩷ۡ;->ܺ֫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sub-int/2addr v0, v1

    .line 137
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ܽ(II)V
    .locals 7

    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 246
    new-instance p2, Ll/ۗۖ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Ll/ۗۖ;-><init>(Landroid/content/Context;)V

    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Ll/᩵᩷ۡ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v0, v1

    .line 249
    invoke-virtual {p0}, Ll/᩵᩷ۡ;->ܽ()I

    move-result v2

    div-int/lit8 v4, v2, 0x2

    int-to-float p1, p1

    mul-float v0, v0, p1

    add-float/2addr v0, v1

    float-to-int v3, v0

    const/4 v5, 0x1

    move-object v1, p2

    move-object v2, p0

    .line 250
    invoke-virtual/range {v1 .. v6}, Ll/ۗۖ;->֫(Landroid/view/View;IIZLjava/lang/CharSequence;)V

    .line 38
    new-instance p1, Ll/᩺ۤᩳ;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p2}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    const/16 p2, 0x5dc

    int-to-long v0, p2

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 355
    iget-boolean v0, p0, Ll/᩵᩷ۡ;->ۡ֫:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 255
    iget v0, p0, Ll/᩵᩷ۡ;->᩵֫:I

    return v0
.end method

.method public final ᩷()V
    .locals 2

    .line 222
    iget-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    sget-object v1, Ll/ᩴ᩷ۡ;->ۙ:Ll/ᩴ᩷ۡ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ᩴ᩷ۡ;->᩶:Ll/ᩴ᩷ۡ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 227
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 223
    :cond_1
    :goto_0
    sget-object v0, Ll/ᩴ᩷ۡ;->ۗ:Ll/ᩴ᩷ۡ;

    iput-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    .line 224
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩵᩷ۡ;->ۚ֫:J

    .line 225
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 218
    iget-object v0, p0, Ll/᩵᩷ۡ;->֡֫:Ll/ᩴ᩷ۡ;

    sget-object v1, Ll/ᩴ᩷ۡ;->ۙ:Ll/ᩴ᩷ۡ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
