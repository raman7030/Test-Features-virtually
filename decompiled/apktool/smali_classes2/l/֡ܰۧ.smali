.class public Ll/֡ܰۧ;
.super Landroid/view/ViewGroup;
.source "Q69A"


# static fields
.field public static final ۨ֫:Ljava/util/Comparator;

.field public static final ܰ֫:Landroid/view/animation/Interpolator;

.field public static final ᩺֫:[I


# instance fields
.field public ֡֫:Ll/ۘܰۧ;

.field public ֨֫:Ljava/util/ArrayList;

.field public ֫֫:I

.field public ۖ֫:F

.field public ۗ:I

.field public ۗ֫:Z

.field public ۘ֫:Landroid/widget/EdgeEffect;

.field public ۙ:Z

.field public ۙ֫:Landroid/widget/Scroller;

.field public ۚ֫:I

.field public ۛ:I

.field public ۛ֫:Landroid/view/VelocityTracker;

.field public ۜ֫:Z

.field public ۟:F

.field public ۠֫:Z

.field public ۡ֫:F

.field public final ۢ֫:Ljava/util/ArrayList;

.field public ۤ:I

.field public ۤ֫:I

.field public ۧ֫:I

.field public final ۨ:Ljava/lang/Runnable;

.field public ۫:I

.field public final ۫֫:Landroid/graphics/Rect;

.field public ۬:I

.field public final ۬֫:Ll/᩷ܰۧ;

.field public ܰ:Z

.field public ܳ֫:Ll/ۖܰۧ;

.field public ܶ֫:Landroid/os/Parcelable;

.field public ܺ֫:F

.field public ܽ֫:Z

.field public ܿ֫:F

.field public ᩳ֫:F

.field public ᩴ֫:I

.field public ᩵֫:I

.field public ᩶:Ljava/util/ArrayList;

.field public ᩶֫:I

.field public ᩷֫:Z

.field public ᩸:I

.field public ᩸֫:I

.field public ᩹:Ll/ۨ᩺ۧ;

.field public ᩹֫:Landroid/widget/EdgeEffect;

.field public ᩺:I

.field public ᩻֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100b3

    .line 122
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/֡ܰۧ;->᩺֫:[I

    .line 140
    new-instance v0, Ll/ᩳܰۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֡ܰۧ;->ۨ֫:Ljava/util/Comparator;

    .line 147
    new-instance v0, Ll/ܿܰۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֡ܰۧ;->ܰ֫:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 396
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 155
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    .line 156
    new-instance p1, Ll/᩷ܰۧ;

    invoke-direct {p1}, Ll/᩷ܰۧ;-><init>()V

    iput-object p1, p0, Ll/֡ܰۧ;->۬֫:Ll/᩷ܰۧ;

    .line 158
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/֡ܰۧ;->۫֫:Landroid/graphics/Rect;

    const/4 p1, -0x1

    .line 162
    iput p1, p0, Ll/֡ܰۧ;->᩸֫:I

    const/4 p2, 0x0

    .line 163
    iput-object p2, p0, Ll/֡ܰۧ;->ܶ֫:Landroid/os/Parcelable;

    const p2, -0x800001

    .line 179
    iput p2, p0, Ll/֡ܰۧ;->۟:F

    const p2, 0x7f7fffff    # Float.MAX_VALUE

    .line 180
    iput p2, p0, Ll/֡ܰۧ;->ۖ֫:F

    const/4 p2, 0x1

    .line 189
    iput p2, p0, Ll/֡ܰۧ;->ۚ֫:I

    .line 207
    iput p1, p0, Ll/֡ܰۧ;->᩸:I

    .line 234
    iput-boolean p2, p0, Ll/֡ܰۧ;->ܰ:Z

    .line 269
    new-instance p1, Ll/ܳܰۧ;

    invoke-direct {p1, p0}, Ll/ܳܰۧ;-><init>(Ll/֡ܰۧ;)V

    iput-object p1, p0, Ll/֡ܰۧ;->ۨ:Ljava/lang/Runnable;

    const/4 p1, 0x0

    .line 277
    iput p1, p0, Ll/֡ܰۧ;->᩶֫:I

    .line 401
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/high16 p1, 0x40000

    .line 402
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 403
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 405
    new-instance v0, Landroid/widget/Scroller;

    sget-object v1, Ll/֡ܰۧ;->ܰ֫:Landroid/view/animation/Interpolator;

    invoke-direct {v0, p1, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    .line 406
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 407
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 409
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result v2

    iput v2, p0, Ll/֡ܰۧ;->ۤ֫:I

    const/high16 v2, 0x43c80000    # 400.0f

    mul-float v2, v2, v1

    float-to-int v2, v2

    .line 410
    iput v2, p0, Ll/֡ܰۧ;->᩵֫:I

    .line 411
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->ᩴ֫:I

    .line 412
    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-direct {v0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֡ܰۧ;->ۘ֫:Landroid/widget/EdgeEffect;

    .line 413
    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-direct {v0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/֡ܰۧ;->᩹֫:Landroid/widget/EdgeEffect;

    const/high16 p1, 0x41c80000    # 25.0f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 415
    iput p1, p0, Ll/֡ܰۧ;->֫֫:I

    const/high16 p1, 0x40000000    # 2.0f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 416
    iput p1, p0, Ll/֡ܰۧ;->۬:I

    const/high16 p1, 0x41800000    # 16.0f

    mul-float v1, v1, p1

    float-to-int p1, v1

    .line 417
    iput p1, p0, Ll/֡ܰۧ;->ۛ:I

    .line 419
    new-instance p1, Ll/ۡܰۧ;

    invoke-direct {p1, p0}, Ll/ۡܰۧ;-><init>(Ll/֡ܰۧ;)V

    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 1400
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 1427
    invoke-virtual {p0, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 427
    :cond_0
    new-instance p1, Ll/᩻ܰۧ;

    invoke-direct {p1, p0}, Ll/᩻ܰۧ;-><init>(Ll/֡ܰۧ;)V

    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 2

    if-nez p1, :cond_0

    .line 2860
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 2863
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-object p1

    .line 2866
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 2867
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 2868
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 2869
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 2871
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    .line 2872
    :goto_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    if-eq p2, p0, :cond_2

    .line 2873
    check-cast p2, Landroid/view/ViewGroup;

    .line 2874
    iget v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 2875
    iget v0, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 2876
    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 2877
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p1, Landroid/graphics/Rect;->bottom:I

    .line 2879
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 3

    .line 2644
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2645
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 2646
    iget v2, p0, Ll/֡ܰۧ;->᩸:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2650
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2651
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/֡ܰۧ;->᩸:I

    .line 2652
    iget-object p1, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    .line 2653
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method private ֫(Z)V
    .locals 6

    .line 1974
    iget v0, p0, Ll/֡ܰۧ;->᩶֫:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 1977
    invoke-direct {p0, v2}, Ll/֡ܰۧ;->ۧ(Z)V

    .line 1978
    iget-object v1, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1980
    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1981
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    .line 1982
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    .line 1983
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v5

    .line 1984
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    if-ne v3, v5, :cond_1

    if-eq v4, v1, :cond_2

    .line 1986
    :cond_1
    invoke-virtual {p0, v5, v1}, Landroid/view/View;->scrollTo(II)V

    if-eq v5, v3, :cond_2

    .line 1988
    invoke-direct {p0, v5}, Ll/֡ܰۧ;->ۜ(I)Z

    .line 1993
    :cond_2
    iput-boolean v2, p0, Ll/֡ܰۧ;->۠֫:Z

    const/4 v1, 0x0

    .line 1994
    :goto_1
    iget-object v3, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 1995
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ܰۧ;

    .line 1996
    iget-boolean v4, v3, Ll/᩷ܰۧ;->ᩳ:Z

    if-eqz v4, :cond_3

    .line 1998
    iput-boolean v2, v3, Ll/᩷ܰۧ;->ᩳ:Z

    const/4 v0, 0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_6

    .line 2002
    iget-object v0, p0, Ll/֡ܰۧ;->ۨ:Ljava/lang/Runnable;

    if-eqz p1, :cond_5

    .line 2003
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {p0, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 2005
    :cond_5
    check-cast v0, Ll/ܳܰۧ;

    invoke-virtual {v0}, Ll/ܳܰۧ;->run()V

    :cond_6
    return-void
.end method

.method private ֫(F)Z
    .locals 9

    .line 2312
    iget v0, p0, Ll/֡ܰۧ;->ۡ֫:F

    sub-float/2addr v0, p1

    .line 2313
    iput p1, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2315
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v0

    .line 2317
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v0

    int-to-float v0, v0

    .line 2319
    iget v1, p0, Ll/֡ܰۧ;->۟:F

    mul-float v1, v1, v0

    .line 2320
    iget v2, p0, Ll/֡ܰۧ;->ۖ֫:F

    mul-float v2, v2, v0

    .line 2324
    iget-object v3, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ܰۧ;

    const/4 v6, 0x1

    .line 0
    invoke-static {v3, v6}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 2325
    check-cast v3, Ll/᩷ܰۧ;

    .line 2326
    iget v7, v5, Ll/᩷ܰۧ;->ܽ:I

    if-eqz v7, :cond_0

    .line 2328
    iget v1, v5, Ll/᩷ܰۧ;->ۧ:F

    mul-float v1, v1, v0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    .line 2330
    :goto_0
    iget v7, v3, Ll/᩷ܰۧ;->ܽ:I

    iget-object v8, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v8}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v8

    sub-int/2addr v8, v6

    if-eq v7, v8, :cond_1

    .line 2332
    iget v2, v3, Ll/᩷ܰۧ;->ۧ:F

    mul-float v2, v2, v0

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    :goto_1
    cmpg-float v6, p1, v1

    if-gez v6, :cond_3

    if-eqz v5, :cond_2

    sub-float p1, v1, p1

    .line 2338
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr p1, v0

    iget-object v0, p0, Ll/֡ܰۧ;->ۘ֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->onPull(F)V

    const/4 v4, 0x1

    :cond_2
    move p1, v1

    goto :goto_2

    :cond_3
    cmpl-float v1, p1, v2

    if-lez v1, :cond_5

    if-eqz v3, :cond_4

    sub-float/2addr p1, v2

    .line 2345
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr p1, v0

    iget-object v0, p0, Ll/֡ܰۧ;->᩹֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->onPull(F)V

    const/4 p1, 0x1

    const/4 v4, 0x1

    :cond_4
    move p1, v2

    .line 2351
    :cond_5
    :goto_2
    iget v0, p0, Ll/֡ܰۧ;->ۡ֫:F

    float-to-int v1, p1

    int-to-float v2, v1

    sub-float/2addr p1, v2

    add-float/2addr p1, v0

    iput p1, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2352
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollTo(II)V

    .line 2353
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۜ(I)Z

    return v4
.end method

.method public static ֫(IIILandroid/view/View;Z)Z
    .locals 9

    .line 2719
    instance-of v0, p3, Landroid/view/ViewGroup;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2720
    move-object v0, p3

    check-cast v0, Landroid/view/ViewGroup;

    .line 2721
    invoke-virtual {p3}, Landroid/view/View;->getScrollX()I

    move-result v2

    .line 2722
    invoke-virtual {p3}, Landroid/view/View;->getScrollY()I

    move-result v3

    .line 2723
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    sub-int/2addr v4, v1

    :goto_0
    if-ltz v4, :cond_1

    .line 2728
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    add-int v6, p1, v2

    .line 2729
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    if-lt v6, v7, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v7

    if-ge v6, v7, :cond_0

    add-int v7, p2, v3

    .line 2730
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    if-lt v7, v8, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v8

    if-ge v7, v8, :cond_0

    .line 2731
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v8

    sub-int/2addr v6, v8

    .line 2732
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    sub-int/2addr v7, v8

    .line 2731
    invoke-static {p0, v6, v7, v5, v1}, Ll/֡ܰۧ;->֫(IIILandroid/view/View;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    neg-int p0, p0

    .line 2738
    invoke-virtual {p3, p0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_1
    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private ۜ()Ll/᩷ܰۧ;
    .locals 12

    .line 2363
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 2364
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, v0

    div-float/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-lez v0, :cond_1

    int-to-float v3, v3

    int-to-float v0, v0

    div-float/2addr v3, v0

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v0, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 2372
    :goto_2
    iget-object v8, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v6, v9, :cond_6

    .line 2373
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ܰۧ;

    if-nez v7, :cond_2

    .line 2375
    iget v10, v9, Ll/᩷ܰۧ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    if-eq v10, v0, :cond_2

    add-float/2addr v1, v5

    add-float/2addr v1, v3

    .line 2378
    iget-object v5, p0, Ll/֡ܰۧ;->۬֫:Ll/᩷ܰۧ;

    iput v1, v5, Ll/᩷ܰۧ;->ۧ:F

    .line 2379
    iput v0, v5, Ll/᩷ܰۧ;->ܽ:I

    .line 2380
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v5, Ll/᩷ܰۧ;->ܿ:F

    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_2
    move-object v5, v9

    .line 2383
    :goto_3
    iget v1, v5, Ll/᩷ܰۧ;->ۧ:F

    .line 2386
    iget v0, v5, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v0, v1

    add-float/2addr v0, v3

    if-nez v7, :cond_3

    cmpl-float v7, v2, v1

    if-ltz v7, :cond_6

    :cond_3
    cmpg-float v0, v2, v0

    if-ltz v0, :cond_5

    .line 2388
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v6, v0, :cond_4

    goto :goto_4

    .line 2395
    :cond_4
    iget v0, v5, Ll/᩷ܰۧ;->ܽ:I

    .line 2397
    iget v4, v5, Ll/᩷ܰۧ;->ܿ:F

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    move-object v11, v5

    move v5, v4

    move-object v4, v11

    goto :goto_2

    :cond_5
    :goto_4
    return-object v5

    :cond_6
    return-object v4
.end method

.method private ۜ(I)Z
    .locals 7

    .line 1818
    iget-object v0, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, "onPageScrolled did not call superclass implementation"

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 1819
    iget-boolean p1, p0, Ll/֡ܰۧ;->ܰ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 1824
    :cond_0
    iput-boolean v2, p0, Ll/֡ܰۧ;->ۙ:Z

    const/4 p1, 0x0

    .line 1825
    invoke-virtual {p0, v2, p1, v2}, Ll/֡ܰۧ;->֫(IFI)V

    .line 1826
    iget-boolean p1, p0, Ll/֡ܰۧ;->ۙ:Z

    if-eqz p1, :cond_1

    :goto_0
    return v2

    .line 1827
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1832
    :cond_2
    invoke-direct {p0}, Ll/֡ܰۧ;->ۜ()Ll/᩷ܰۧ;

    move-result-object v0

    .line 1833
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v3

    int-to-float v4, v2

    int-to-float v3, v3

    div-float/2addr v4, v3

    .line 1836
    iget v5, v0, Ll/᩷ܰۧ;->ܽ:I

    int-to-float p1, p1

    div-float/2addr p1, v3

    .line 1837
    iget v6, v0, Ll/᩷ܰۧ;->ۧ:F

    sub-float/2addr p1, v6

    iget v0, v0, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v0, v4

    div-float/2addr p1, v0

    mul-float v3, v3, p1

    float-to-int v0, v3

    .line 1841
    iput-boolean v2, p0, Ll/֡ܰۧ;->ۙ:Z

    .line 1842
    invoke-virtual {p0, v5, p1, v0}, Ll/֡ܰۧ;->֫(IFI)V

    .line 1843
    iget-boolean p1, p0, Ll/֡ܰۧ;->ۙ:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 1844
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ(IIZZ)V
    .locals 10

    .line 676
    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->ۧ(I)Ll/᩷ܰۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 679
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v2

    int-to-float v2, v2

    .line 680
    iget v3, p0, Ll/֡ܰۧ;->۟:F

    iget v0, v0, Ll/᩷ܰۧ;->ۧ:F

    iget v4, p0, Ll/֡ܰۧ;->ۖ֫:F

    .line 681
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 680
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    mul-float v0, v0, v2

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p3, :cond_7

    .line 950
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_1

    .line 952
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۧ(Z)V

    goto/16 :goto_4

    .line 957
    :cond_1
    iget-object p3, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/widget/Scroller;->isFinished()Z

    move-result v2

    if-nez v2, :cond_3

    .line 963
    iget-boolean v2, p0, Ll/֡ܰۧ;->ۜ֫:Z

    if-eqz v2, :cond_2

    invoke-virtual {p3}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Landroid/widget/Scroller;->getStartX()I

    move-result v2

    .line 965
    :goto_1
    invoke-virtual {p3}, Landroid/widget/Scroller;->abortAnimation()V

    .line 966
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۧ(Z)V

    goto :goto_2

    .line 968
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    :goto_2
    move v4, v2

    .line 970
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    sub-int v6, v0, v4

    rsub-int/lit8 v7, v5, 0x0

    if-nez v6, :cond_4

    if-nez v7, :cond_4

    .line 974
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->֫(Z)V

    .line 975
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    .line 976
    invoke-virtual {p0, v1}, Ll/֡ܰۧ;->ܳ(I)V

    goto :goto_4

    :cond_4
    const/4 p3, 0x1

    .line 980
    invoke-direct {p0, p3}, Ll/֡ܰۧ;->ۧ(Z)V

    const/4 p3, 0x2

    .line 981
    invoke-virtual {p0, p3}, Ll/֡ܰۧ;->ܳ(I)V

    .line 983
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result p3

    .line 984
    div-int/lit8 v0, p3, 0x2

    .line 985
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v2, v2, v3

    int-to-float p3, p3

    div-float/2addr v2, p3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v0, v0

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v2, v8

    const v8, 0x3ef1463b

    mul-float v2, v2, v8

    float-to-double v8, v2

    .line 929
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v2, v8

    mul-float v2, v2, v0

    add-float/2addr v2, v0

    .line 990
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_5

    int-to-float p2, p2

    div-float/2addr v2, p2

    .line 992
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const/high16 p3, 0x447a0000    # 1000.0f

    mul-float p2, p2, p3

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    mul-int/lit8 p2, p2, 0x4

    goto :goto_3

    .line 994
    :cond_5
    iget-object p2, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    mul-float p3, p3, v3

    .line 995
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    int-to-float v0, v1

    add-float/2addr p3, v0

    div-float/2addr p2, p3

    add-float/2addr p2, v3

    const/high16 p3, 0x42c80000    # 100.0f

    mul-float p2, p2, p3

    float-to-int p2, p2

    :goto_3
    const/16 p3, 0x258

    .line 998
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 1002
    iput-boolean v1, p0, Ll/֡ܰۧ;->ۜ֫:Z

    .line 1003
    iget-object v3, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual/range {v3 .. v8}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1004
    sget p2, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :goto_4
    if-eqz p4, :cond_6

    .line 686
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->᩻(I)V

    :cond_6
    return-void

    :cond_7
    if-eqz p4, :cond_8

    .line 690
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->᩻(I)V

    .line 692
    :cond_8
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->֫(Z)V

    .line 693
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->scrollTo(II)V

    .line 694
    invoke-direct {p0, v0}, Ll/֡ܰۧ;->ۜ(I)Z

    return-void
.end method

.method private ۧ(Z)V
    .locals 1

    .line 2669
    iget-boolean v0, p0, Ll/֡ܰۧ;->ۗ֫:Z

    if-eq v0, p1, :cond_0

    .line 2670
    iput-boolean p1, p0, Ll/֡ܰۧ;->ۗ֫:Z

    :cond_0
    return-void
.end method

.method private ᩷()Z
    .locals 2

    const/4 v0, -0x1

    .line 2294
    iput v0, p0, Ll/֡ܰۧ;->᩸:I

    const/4 v0, 0x0

    .line 2659
    iput-boolean v0, p0, Ll/֡ܰۧ;->᩻֫:Z

    .line 2660
    iput-boolean v0, p0, Ll/֡ܰۧ;->᩷֫:Z

    .line 2662
    iget-object v1, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_0

    .line 2663
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v1, 0x0

    .line 2664
    iput-object v1, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    .line 2296
    :cond_0
    iget-object v1, p0, Ll/֡ܰۧ;->ۘ֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2297
    iget-object v1, p0, Ll/֡ܰۧ;->᩹֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2298
    iget-object v1, p0, Ll/֡ܰۧ;->ۘ֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/֡ܰۧ;->᩹֫:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private ᩻()I
    .locals 2

    .line 600
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private ᩻(I)V
    .locals 3

    .line 1943
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1944
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 1945
    iget-object v2, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܰۧ;

    if-eqz v2, :cond_0

    .line 1947
    invoke-interface {v2, p1}, Ll/ۖܰۧ;->onPageSelected(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1951
    :cond_1
    iget-object v0, p0, Ll/֡ܰۧ;->ܳ֫:Ll/ۖܰۧ;

    if-eqz v0, :cond_2

    .line 1952
    invoke-interface {v0, p1}, Ll/ۖܰۧ;->onPageSelected(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 6

    .line 2905
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2907
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v1

    const/high16 v2, 0x60000

    if-eq v1, v2, :cond_1

    const/4 v2, 0x0

    .line 2910
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 2911
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2912
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    .line 2913
    invoke-virtual {p0, v3}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 2914
    iget v4, v4, Ll/᩷ܰۧ;->ܽ:I

    iget v5, p0, Ll/֡ܰۧ;->۫:I

    if-ne v4, v5, :cond_0

    .line 2915
    invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/high16 p2, 0x40000

    if-ne v1, p2, :cond_2

    .line 2926
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne v0, p2, :cond_4

    .line 2929
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 p2, 0x1

    and-int/2addr p3, p2

    if-ne p3, p2, :cond_5

    .line 2933
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    :goto_1
    return-void

    .line 2937
    :cond_5
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addTouchables(Ljava/util/ArrayList;)V
    .locals 4

    const/4 v0, 0x0

    .line 2950
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2951
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2952
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    .line 2953
    invoke-virtual {p0, v1}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2954
    iget v2, v2, Ll/᩷ܰۧ;->ܽ:I

    iget v3, p0, Ll/֡ܰۧ;->۫:I

    if-ne v2, v3, :cond_0

    .line 2955
    invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 4

    .line 1472
    invoke-virtual {p0, p3}, Ll/֡ܰۧ;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3019
    new-instance p3, Ll/ۢܰۧ;

    invoke-direct {p3}, Ll/ۢܰۧ;-><init>()V

    .line 1475
    :cond_0
    move-object v0, p3

    check-cast v0, Ll/ۢܰۧ;

    .line 1477
    iget-boolean v1, v0, Ll/ۢܰۧ;->ۧ:Z

    .line 1498
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 1499
    const-class v3, Ll/ۜܰۧ;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    or-int/2addr v1, v2

    .line 1477
    iput-boolean v1, v0, Ll/ۢܰۧ;->ۧ:Z

    .line 1478
    iget-boolean v2, p0, Ll/֡ܰۧ;->ܽ֫:Z

    if-eqz v2, :cond_3

    if-nez v1, :cond_2

    .line 1482
    iput-boolean v3, v0, Ll/ۢܰۧ;->ܽ:Z

    .line 1483
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    return-void

    .line 1480
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot add pager decor view during layout"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1485
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    .line 2692
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2696
    :cond_0
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v0

    .line 2697
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    const/4 v3, 0x1

    if-gez p1, :cond_2

    int-to-float p1, v0

    .line 2699
    iget v0, p0, Ll/֡ܰۧ;->۟:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    if-le v2, p1, :cond_1

    return v3

    :cond_1
    return v1

    :cond_2
    if-lez p1, :cond_3

    int-to-float p1, v0

    .line 2701
    iget v0, p0, Ll/֡ܰۧ;->ۖ֫:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    if-ge v2, p1, :cond_3

    return v3

    :cond_3
    return v1
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 3029
    instance-of v0, p1, Ll/ۢܰۧ;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final computeScroll()V
    .locals 5

    const/4 v0, 0x1

    .line 1793
    iput-boolean v0, p0, Ll/֡ܰۧ;->ۜ֫:Z

    .line 1794
    iget-object v1, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1795
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 1796
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    .line 1797
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v3

    .line 1798
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v4

    if-ne v0, v3, :cond_0

    if-eq v2, v4, :cond_1

    .line 1801
    :cond_0
    invoke-virtual {p0, v3, v4}, Landroid/view/View;->scrollTo(II)V

    .line 1802
    invoke-direct {p0, v3}, Ll/֡ܰۧ;->ۜ(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1803
    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    const/4 v0, 0x0

    .line 1804
    invoke-virtual {p0, v0, v4}, Landroid/view/View;->scrollTo(II)V

    .line 1809
    :cond_1
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 1814
    :cond_2
    invoke-direct {p0, v0}, Ll/֡ܰۧ;->֫(Z)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 2744
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_8

    .line 2757
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_6

    .line 2758
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x15

    const/4 v4, 0x2

    if-eq v0, v3, :cond_4

    const/16 v3, 0x16

    if-eq v0, v3, :cond_2

    const/16 v3, 0x3d

    if-eq v0, v3, :cond_0

    goto :goto_0

    .line 2774
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2775
    invoke-virtual {p0, v4}, Ll/֡ܰۧ;->֫(I)Z

    move-result p1

    goto :goto_1

    .line 2776
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 2777
    invoke-virtual {p0, v1}, Ll/֡ܰۧ;->֫(I)Z

    move-result p1

    goto :goto_1

    .line 2767
    :cond_2
    invoke-virtual {p1, v4}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2768
    invoke-virtual {p0}, Ll/֡ܰۧ;->ᩳ()Z

    move-result p1

    goto :goto_1

    :cond_3
    const/16 p1, 0x42

    .line 2770
    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->֫(I)Z

    move-result p1

    goto :goto_1

    .line 2760
    :cond_4
    invoke-virtual {p1, v4}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2885
    iget p1, p0, Ll/֡ܰۧ;->۫:I

    if-lez p1, :cond_6

    sub-int/2addr p1, v1

    .line 2886
    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->ܿ(I)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_5
    const/16 p1, 0x11

    .line 2763
    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->֫(I)Z

    move-result p1

    goto :goto_1

    :cond_6
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    return v2

    :cond_8
    :goto_2
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6

    .line 2997
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_0

    .line 2998
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    .line 3002
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 3004
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3005
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_1

    .line 3006
    invoke-virtual {p0, v3}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 3007
    iget v4, v4, Ll/᩷ܰۧ;->ܽ:I

    iget v5, p0, Ll/֡ܰۧ;->۫:I

    if-ne v4, v5, :cond_1

    .line 3008
    invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 2426
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2429
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    .line 2430
    iget-object v1, p0, Ll/֡ܰۧ;->᩹֫:Landroid/widget/EdgeEffect;

    iget-object v2, p0, Ll/֡ܰۧ;->ۘ֫:Landroid/widget/EdgeEffect;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_0

    .line 2432
    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    if-le v0, v4, :cond_0

    goto :goto_0

    .line 2456
    :cond_0
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    .line 2457
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->finish()V

    goto/16 :goto_1

    .line 2433
    :cond_1
    :goto_0
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2434
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 2435
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 2436
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    const/high16 v5, 0x43870000    # 270.0f

    .line 2438
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v5, v3

    .line 2439
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    add-int/2addr v6, v5

    int-to-float v5, v6

    iget v6, p0, Ll/֡ܰۧ;->۟:F

    int-to-float v7, v4

    mul-float v6, v6, v7

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2440
    invoke-virtual {v2, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2441
    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v2

    .line 2442
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    move v3, v2

    .line 2444
    :cond_2
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2445
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 2446
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 2447
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    const/high16 v5, 0x42b40000    # 90.0f

    .line 2449
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 2450
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    iget v6, p0, Ll/֡ܰۧ;->ۖ֫:F

    const/high16 v7, 0x3f800000    # 1.0f

    add-float/2addr v6, v7

    neg-float v6, v6

    int-to-float v7, v2

    mul-float v6, v6, v7

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2451
    invoke-virtual {v1, v4, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2452
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    or-int/2addr v3, v1

    .line 2453
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    .line 2462
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_4
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 0

    .line 915
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 3019
    new-instance v0, Ll/ۢܰۧ;

    invoke-direct {v0}, Ll/ۢܰۧ;-><init>()V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 3034
    new-instance v0, Ll/ۢܰۧ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ۢܰۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 3019
    new-instance p1, Ll/ۢܰۧ;

    invoke-direct {p1}, Ll/ۢܰۧ;-><init>()V

    return-object p1
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    const/4 p1, 0x0

    .line 804
    throw p1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1544
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1545
    iput-boolean v0, p0, Ll/֡ܰۧ;->ܰ:Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 479
    iget-object v0, p0, Ll/֡ܰۧ;->ۨ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 481
    iget-object v0, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 482
    iget-object v0, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 484
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 2468
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 2031
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_12

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz v0, :cond_2

    .line 2044
    iget-boolean v3, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-eqz v3, :cond_1

    return v1

    .line 2048
    :cond_1
    iget-boolean v3, p0, Ll/֡ܰۧ;->᩷֫:Z

    if-eqz v3, :cond_2

    return v2

    :cond_2
    const/4 v3, 0x2

    if-eqz v0, :cond_d

    if-eq v0, v3, :cond_4

    const/4 v1, 0x6

    if-eq v0, v1, :cond_3

    goto/16 :goto_3

    .line 2148
    :cond_3
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->֫(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 2065
    :cond_4
    iget v0, p0, Ll/֡ܰۧ;->᩸:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_5

    goto/16 :goto_3

    .line 2071
    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 2072
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 2073
    iget v4, p0, Ll/֡ܰۧ;->ۡ֫:F

    sub-float v4, v3, v4

    .line 2074
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 2075
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    .line 2076
    iget v6, p0, Ll/֡ܰۧ;->ܿ֫:F

    sub-float v6, v0, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v8, v4, v7

    if-eqz v8, :cond_8

    .line 2079
    iget v9, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2011
    iget v10, p0, Ll/֡ܰۧ;->ۧ֫:I

    int-to-float v10, v10

    cmpg-float v10, v9, v10

    if-gez v10, :cond_6

    if-gtz v8, :cond_8

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v10

    iget v11, p0, Ll/֡ܰۧ;->ۧ֫:I

    sub-int/2addr v10, v11

    int-to-float v10, v10

    cmpl-float v9, v9, v10

    if-lez v9, :cond_7

    cmpg-float v7, v4, v7

    if-gez v7, :cond_7

    goto :goto_0

    :cond_7
    float-to-int v4, v4

    float-to-int v7, v3

    float-to-int v9, v0

    .line 2080
    invoke-static {v4, v7, v9, p0, v2}, Ll/֡ܰۧ;->֫(IIILandroid/view/View;Z)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 2082
    iput v3, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2083
    iput v0, p0, Ll/֡ܰۧ;->ܺ֫:F

    .line 2084
    iput-boolean v1, p0, Ll/֡ܰۧ;->᩷֫:Z

    return v2

    .line 2087
    :cond_8
    :goto_0
    iget v2, p0, Ll/֡ܰۧ;->ۤ֫:I

    int-to-float v4, v2

    cmpl-float v7, v5, v4

    if-lez v7, :cond_b

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v5, v5, v7

    cmpl-float v5, v5, v6

    if-lez v5, :cond_b

    .line 2089
    iput-boolean v1, p0, Ll/֡ܰۧ;->᩻֫:Z

    .line 2303
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 2305
    invoke-interface {v4, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2091
    :cond_9
    invoke-virtual {p0, v1}, Ll/֡ܰۧ;->ܳ(I)V

    .line 2092
    iget v4, p0, Ll/֡ܰۧ;->ᩳ֫:F

    int-to-float v2, v2

    if-lez v8, :cond_a

    add-float/2addr v4, v2

    goto :goto_1

    :cond_a
    sub-float/2addr v4, v2

    :goto_1
    iput v4, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2094
    iput v0, p0, Ll/֡ܰۧ;->ܺ֫:F

    .line 2095
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۧ(Z)V

    goto :goto_2

    :cond_b
    cmpl-float v0, v6, v4

    if-lez v0, :cond_c

    .line 2102
    iput-boolean v1, p0, Ll/֡ܰۧ;->᩷֫:Z

    .line 2104
    :cond_c
    :goto_2
    iget-boolean v0, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-eqz v0, :cond_10

    .line 2106
    invoke-direct {p0, v3}, Ll/֡ܰۧ;->֫(F)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 2107
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_3

    .line 2118
    :cond_d
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->ᩳ֫:F

    iput v0, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2119
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->ܿ֫:F

    iput v0, p0, Ll/֡ܰۧ;->ܺ֫:F

    .line 2120
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->᩸:I

    .line 2121
    iput-boolean v2, p0, Ll/֡ܰۧ;->᩷֫:Z

    .line 2123
    iput-boolean v1, p0, Ll/֡ܰۧ;->ۜ֫:Z

    .line 2124
    iget-object v0, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 2125
    iget v4, p0, Ll/֡ܰۧ;->᩶֫:I

    if-ne v4, v3, :cond_f

    .line 2126
    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Ll/֡ܰۧ;->۬:I

    if-le v3, v4, :cond_f

    .line 2128
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 2129
    iput-boolean v2, p0, Ll/֡ܰۧ;->۠֫:Z

    .line 2130
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    .line 2131
    iput-boolean v1, p0, Ll/֡ܰۧ;->᩻֫:Z

    .line 2303
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 2305
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2133
    :cond_e
    invoke-virtual {p0, v1}, Ll/֡ܰۧ;->ܳ(I)V

    goto :goto_3

    .line 2135
    :cond_f
    invoke-direct {p0, v2}, Ll/֡ܰۧ;->֫(Z)V

    .line 2136
    iput-boolean v2, p0, Ll/֡ܰۧ;->᩻֫:Z

    .line 2152
    :cond_10
    :goto_3
    iget-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_11

    .line 2153
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    .line 2155
    :cond_11
    iget-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2161
    iget-boolean p1, p0, Ll/֡ܰۧ;->᩻֫:Z

    return p1

    .line 2037
    :cond_12
    :goto_4
    invoke-direct {p0}, Ll/֡ܰۧ;->᩷()Z

    return v2
.end method

.method public final onLayout(ZIIII)V
    .locals 17

    move-object/from16 v0, p0

    .line 1682
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int v2, p4, p2

    sub-int v3, p5, p3

    .line 1685
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    .line 1686
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    .line 1687
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    .line 1688
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    .line 1689
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0x8

    if-ge v9, v1, :cond_7

    .line 1696
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 1697
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-eq v13, v11, :cond_6

    .line 1698
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ۢܰۧ;

    .line 1701
    iget-boolean v13, v11, Ll/ۢܰۧ;->ۧ:Z

    if-eqz v13, :cond_6

    .line 1702
    iget v11, v11, Ll/ۢܰۧ;->֫:I

    and-int/lit8 v13, v11, 0x7

    and-int/lit8 v11, v11, 0x70

    const/4 v14, 0x1

    if-eq v13, v14, :cond_2

    const/4 v14, 0x3

    if-eq v13, v14, :cond_1

    const/4 v14, 0x5

    if-eq v13, v14, :cond_0

    move v13, v4

    goto :goto_2

    :cond_0
    sub-int v13, v2, v6

    .line 1717
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    sub-int/2addr v13, v14

    .line 1718
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v6, v14

    goto :goto_1

    .line 1710
    :cond_1
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    add-int/2addr v13, v4

    goto :goto_2

    .line 1713
    :cond_2
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    sub-int v13, v2, v13

    div-int/lit8 v13, v13, 0x2

    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v13

    :goto_1
    move/from16 v16, v13

    move v13, v4

    move/from16 v4, v16

    :goto_2
    const/16 v14, 0x10

    if-eq v11, v14, :cond_5

    const/16 v14, 0x30

    if-eq v11, v14, :cond_4

    const/16 v14, 0x50

    if-eq v11, v14, :cond_3

    move v11, v5

    goto :goto_4

    :cond_3
    sub-int v11, v3, v7

    .line 1734
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    sub-int/2addr v11, v14

    .line 1735
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    add-int/2addr v7, v14

    goto :goto_3

    .line 1727
    :cond_4
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    add-int/2addr v11, v5

    goto :goto_4

    .line 1730
    :cond_5
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    sub-int v11, v3, v11

    div-int/lit8 v11, v11, 0x2

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v11

    :goto_3
    move/from16 v16, v11

    move v11, v5

    move/from16 v5, v16

    :goto_4
    add-int/2addr v4, v8

    .line 1740
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v4

    .line 1741
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v5

    .line 1739
    invoke-virtual {v12, v4, v5, v14, v15}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 v10, v10, 0x1

    move v5, v11

    move v4, v13

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_7
    sub-int/2addr v2, v4

    sub-int/2addr v2, v6

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v1, :cond_a

    .line 1750
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 1751
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-eq v9, v11, :cond_9

    .line 1752
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ۢܰۧ;

    .line 1754
    iget-boolean v12, v9, Ll/ۢܰۧ;->ۧ:Z

    if-nez v12, :cond_9

    invoke-virtual {v0, v8}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v12

    if-eqz v12, :cond_9

    int-to-float v13, v2

    .line 1755
    iget v12, v12, Ll/᩷ܰۧ;->ۧ:F

    mul-float v12, v12, v13

    float-to-int v12, v12

    add-int/2addr v12, v4

    .line 1758
    iget-boolean v14, v9, Ll/ۢܰۧ;->ܽ:Z

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    .line 1761
    iput-boolean v14, v9, Ll/ۢܰۧ;->ܽ:Z

    .line 1762
    iget v9, v9, Ll/ۢܰۧ;->ᩳ:F

    mul-float v13, v13, v9

    float-to-int v9, v13

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    sub-int v14, v3, v5

    sub-int/2addr v14, v7

    .line 1765
    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 1768
    invoke-virtual {v8, v9, v13}, Landroid/view/View;->measure(II)V

    .line 1776
    :cond_8
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v12

    .line 1777
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v13, v5

    .line 1775
    invoke-virtual {v8, v12, v5, v9, v13}, Landroid/view/View;->layout(IIII)V

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 1783
    :cond_a
    iput v10, v0, Ll/֡ܰۧ;->ۤ:I

    .line 1785
    iget-boolean v1, v0, Ll/֡ܰۧ;->ܰ:Z

    if-eqz v1, :cond_b

    .line 1786
    iget v1, v0, Ll/֡ܰۧ;->۫:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Ll/֡ܰۧ;->ۧ(IIZZ)V

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    .line 1788
    :goto_6
    iput-boolean v2, v0, Ll/֡ܰۧ;->ܰ:Z

    return-void
.end method

.method public onMeasure(II)V
    .locals 13

    const/4 v0, 0x0

    .line 1555
    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    .line 1556
    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    move-result p2

    .line 1555
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1558
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 1559
    div-int/lit8 p2, p1, 0xa

    .line 1560
    iget v1, p0, Ll/֡ܰۧ;->ۛ:I

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/֡ܰۧ;->ۧ֫:I

    .line 1563
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p1, p2

    .line 1564
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    .line 1571
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    const/4 v4, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    if-ge v2, v1, :cond_c

    .line 1573
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1574
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v3, :cond_b

    .line 1575
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ۢܰۧ;

    if-eqz v3, :cond_b

    .line 1576
    iget-boolean v7, v3, Ll/ۢܰۧ;->ۧ:Z

    if-eqz v7, :cond_b

    .line 1577
    iget v7, v3, Ll/ۢܰۧ;->֫:I

    and-int/lit8 v8, v7, 0x7

    and-int/lit8 v7, v7, 0x70

    const/16 v9, 0x30

    if-eq v7, v9, :cond_1

    const/16 v9, 0x50

    if-ne v7, v9, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v7, 0x1

    :goto_2
    const/4 v9, 0x3

    if-eq v8, v9, :cond_3

    const/4 v9, 0x5

    if-ne v8, v9, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    :cond_3
    :goto_3
    const/high16 v8, -0x80000000

    if-eqz v7, :cond_4

    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_4

    :cond_4
    if-eqz v4, :cond_5

    const/high16 v9, 0x40000000    # 2.0f

    goto :goto_5

    :cond_5
    :goto_4
    const/high16 v9, -0x80000000

    .line 1592
    :goto_5
    iget v10, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v11, -0x1

    const/4 v12, -0x2

    if-eq v10, v12, :cond_7

    if-eq v10, v11, :cond_6

    goto :goto_6

    :cond_6
    move v10, p1

    :goto_6
    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_7

    :cond_7
    move v10, p1

    .line 1598
    :goto_7
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v3, v12, :cond_9

    if-eq v3, v11, :cond_8

    goto :goto_8

    :cond_8
    move v3, p2

    goto :goto_8

    :cond_9
    move v3, p2

    move v5, v9

    .line 1604
    :goto_8
    invoke-static {v10, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 1605
    invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 1606
    invoke-virtual {v6, v8, v3}, Landroid/view/View;->measure(II)V

    if-eqz v7, :cond_a

    .line 1609
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sub-int/2addr p2, v3

    goto :goto_9

    :cond_a
    if-eqz v4, :cond_b

    .line 1611
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr p1, v3

    :cond_b
    :goto_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1617
    :cond_c
    invoke-static {p1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1618
    invoke-static {p2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iput p2, p0, Ll/֡ܰۧ;->ۗ:I

    .line 1621
    iput-boolean v4, p0, Ll/֡ܰۧ;->ܽ֫:Z

    .line 1622
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    .line 1623
    iput-boolean v0, p0, Ll/֡ܰۧ;->ܽ֫:Z

    .line 1626
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    :goto_a
    if-ge v0, p2, :cond_f

    .line 1628
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1629
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v3, :cond_e

    .line 1634
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ۢܰۧ;

    if-eqz v2, :cond_d

    .line 1635
    iget-boolean v4, v2, Ll/ۢܰۧ;->ۧ:Z

    if-nez v4, :cond_e

    :cond_d
    int-to-float v4, p1

    .line 1636
    iget v2, v2, Ll/ۢܰۧ;->ᩳ:F

    mul-float v4, v4, v2

    float-to-int v2, v4

    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1638
    iget v4, p0, Ll/֡ܰۧ;->ۗ:I

    invoke-virtual {v1, v2, v4}, Landroid/view/View;->measure(II)V

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_f
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 8

    .line 2970
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    and-int/lit8 v1, p1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    const/4 v0, -0x1

    const/4 v4, -0x1

    :goto_0
    if-eq v1, v0, :cond_2

    .line 2981
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2982
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_1

    .line 2983
    invoke-virtual {p0, v5}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 2984
    iget v6, v6, Ll/᩷ܰۧ;->ܽ:I

    iget v7, p0, Ll/֡ܰۧ;->۫:I

    if-ne v6, v7, :cond_1

    .line 2985
    invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v3

    :cond_1
    add-int/2addr v1, v4

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1452
    instance-of v0, p1, Ll/᩵ܰۧ;

    if-nez v0, :cond_0

    .line 1453
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1457
    :cond_0
    check-cast p1, Ll/᩵ܰۧ;

    .line 1458
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1460
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_1

    .line 1462
    iget p1, p1, Ll/᩵ܰۧ;->᩶:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 631
    invoke-virtual {p0, p1, v1, v1, v0}, Ll/֡ܰۧ;->֫(IIZZ)V

    return-void

    .line 1464
    :cond_1
    iget v0, p1, Ll/᩵ܰۧ;->᩶:I

    iput v0, p0, Ll/֡ܰۧ;->᩸֫:I

    .line 1465
    iget-object p1, p1, Ll/᩵ܰۧ;->᩸:Landroid/os/Parcelable;

    iput-object p1, p0, Ll/֡ܰۧ;->ܶ֫:Landroid/os/Parcelable;

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1441
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1442
    new-instance v1, Ll/᩵ܰۧ;

    invoke-direct {v1, v0}, Ll/᩵ܰۧ;-><init>(Landroid/os/Parcelable;)V

    .line 1443
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    iput v0, v1, Ll/᩵ܰۧ;->᩶:I

    .line 1444
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1445
    iput-object v0, v1, Ll/᩵ܰۧ;->᩸:Landroid/os/Parcelable;

    :cond_0
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1646
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    if-eq p1, p3, :cond_3

    if-lez p3, :cond_1

    .line 1655
    iget-object p2, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 1656
    iget-object p2, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {p2}, Landroid/widget/Scroller;->isFinished()Z

    move-result p2

    if-nez p2, :cond_0

    .line 627
    iget p1, p0, Ll/֡ܰۧ;->۫:I

    .line 1657
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result p2

    mul-int p1, p1, p2

    iget-object p2, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {p2, p1}, Landroid/widget/Scroller;->setFinalX(I)V

    return-void

    .line 1659
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p1, p2

    .line 1660
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p3, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p3, p2

    .line 1662
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    int-to-float p2, p2

    int-to-float p3, p3

    div-float/2addr p2, p3

    int-to-float p1, p1

    mul-float p2, p2, p1

    float-to-int p1, p2

    .line 1666
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    return-void

    .line 1669
    :cond_1
    iget p2, p0, Ll/֡ܰۧ;->۫:I

    invoke-virtual {p0, p2}, Ll/֡ܰۧ;->ۧ(I)Ll/᩷ܰۧ;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 1670
    iget p2, p2, Ll/᩷ܰۧ;->ۧ:F

    iget p3, p0, Ll/֡ܰۧ;->ۖ֫:F

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 1672
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    int-to-float p1, p1

    mul-float p2, p2, p1

    float-to-int p1, p2

    .line 1673
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x0

    .line 1674
    invoke-direct {p0, p2}, Ll/֡ܰۧ;->֫(Z)V

    .line 1675
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    :cond_3
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 2173
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 2179
    :cond_0
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    .line 2184
    :cond_1
    iget-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_2

    .line 2185
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    .line 2187
    :cond_2
    iget-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2189
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x1

    if-eqz v0, :cond_10

    if-eq v0, v2, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x5

    if-eq v0, v3, :cond_4

    const/4 v3, 0x6

    if-eq v0, v3, :cond_3

    goto/16 :goto_3

    .line 2282
    :cond_3
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->֫(Landroid/view/MotionEvent;)V

    .line 2283
    iget v0, p0, Ll/֡ܰۧ;->᩸:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    iput p1, p0, Ll/֡ܰۧ;->ۡ֫:F

    goto/16 :goto_3

    .line 2275
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2276
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 2277
    iput v3, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2278
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/֡ܰۧ;->᩸:I

    goto/16 :goto_3

    .line 2269
    :cond_5
    iget-boolean p1, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-eqz p1, :cond_11

    .line 2270
    iget p1, p0, Ll/֡ܰۧ;->۫:I

    invoke-direct {p0, p1, v1, v2, v1}, Ll/֡ܰۧ;->ۧ(IIZZ)V

    .line 2271
    invoke-direct {p0}, Ll/֡ܰۧ;->᩷()Z

    move-result v1

    goto/16 :goto_3

    .line 2205
    :cond_6
    iget-boolean v0, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-nez v0, :cond_a

    .line 2206
    iget v0, p0, Ll/֡ܰۧ;->᩸:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_7

    .line 2210
    invoke-direct {p0}, Ll/֡ܰۧ;->᩷()Z

    move-result v1

    goto/16 :goto_3

    .line 2213
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 2214
    iget v4, p0, Ll/֡ܰۧ;->ۡ֫:F

    sub-float v4, v3, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 2215
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    .line 2216
    iget v5, p0, Ll/֡ܰۧ;->ܺ֫:F

    sub-float v5, v0, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 2220
    iget v6, p0, Ll/֡ܰۧ;->ۤ֫:I

    int-to-float v7, v6

    cmpl-float v7, v4, v7

    if-lez v7, :cond_a

    cmpl-float v4, v4, v5

    if-lez v4, :cond_a

    .line 2222
    iput-boolean v2, p0, Ll/֡ܰۧ;->᩻֫:Z

    .line 2303
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 2305
    invoke-interface {v4, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2224
    :cond_8
    iget v4, p0, Ll/֡ܰۧ;->ᩳ֫:F

    sub-float/2addr v3, v4

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    if-lez v3, :cond_9

    int-to-float v3, v6

    add-float/2addr v4, v3

    goto :goto_0

    :cond_9
    int-to-float v3, v6

    sub-float/2addr v4, v3

    :goto_0
    iput v4, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2226
    iput v0, p0, Ll/֡ܰۧ;->ܺ֫:F

    .line 2227
    invoke-virtual {p0, v2}, Ll/֡ܰۧ;->ܳ(I)V

    .line 2228
    invoke-direct {p0, v2}, Ll/֡ܰۧ;->ۧ(Z)V

    .line 2231
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 2233
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2238
    :cond_a
    iget-boolean v0, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-eqz v0, :cond_11

    .line 2240
    iget v0, p0, Ll/֡ܰۧ;->᩸:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 2241
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 2242
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->֫(F)Z

    move-result v1

    goto/16 :goto_3

    .line 2246
    :cond_b
    iget-boolean v0, p0, Ll/֡ܰۧ;->᩻֫:Z

    if-eqz v0, :cond_11

    .line 2247
    iget-object v0, p0, Ll/֡ܰۧ;->ۛ֫:Landroid/view/VelocityTracker;

    .line 2248
    iget v3, p0, Ll/֡ܰۧ;->ᩴ֫:I

    int-to-float v3, v3

    const/16 v4, 0x3e8

    invoke-virtual {v0, v4, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2249
    iget v3, p0, Ll/֡ܰۧ;->᩸:I

    invoke-virtual {v0, v3}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    .line 2250
    iput-boolean v2, p0, Ll/֡ܰۧ;->۠֫:Z

    .line 2251
    invoke-direct {p0}, Ll/֡ܰۧ;->᩻()I

    move-result v3

    .line 2252
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    .line 2253
    invoke-direct {p0}, Ll/֡ܰۧ;->ۜ()Ll/᩷ܰۧ;

    move-result-object v5

    int-to-float v6, v1

    int-to-float v3, v3

    div-float/2addr v6, v3

    .line 2255
    iget v7, v5, Ll/᩷ܰۧ;->ܽ:I

    int-to-float v4, v4

    div-float/2addr v4, v3

    .line 2256
    iget v3, v5, Ll/᩷ܰۧ;->ۧ:F

    sub-float/2addr v4, v3

    iget v3, v5, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v3, v6

    div-float/2addr v4, v3

    .line 2258
    iget v3, p0, Ll/֡ܰۧ;->᩸:I

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    .line 2259
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 2260
    iget v3, p0, Ll/֡ܰۧ;->ᩳ֫:F

    sub-float/2addr p1, v3

    float-to-int p1, p1

    .line 2406
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget v3, p0, Ll/֡ܰۧ;->֫֫:I

    if-le p1, v3, :cond_d

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget v3, p0, Ll/֡ܰۧ;->᩵֫:I

    if-le p1, v3, :cond_d

    if-lez v0, :cond_c

    goto :goto_2

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 2409
    :cond_d
    iget p1, p0, Ll/֡ܰۧ;->۫:I

    if-lt v7, p1, :cond_e

    const p1, 0x3ecccccd    # 0.4f

    goto :goto_1

    :cond_e
    const p1, 0x3f19999a    # 0.6f

    :goto_1
    add-float/2addr v4, p1

    float-to-int p1, v4

    add-int/2addr v7, p1

    .line 2413
    :goto_2
    iget-object p1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_f

    .line 2414
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ܰۧ;

    .line 0
    invoke-static {p1, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 2415
    check-cast p1, Ll/᩷ܰۧ;

    .line 2418
    iget v1, v1, Ll/᩷ܰۧ;->ܽ:I

    iget p1, p1, Ll/᩷ܰۧ;->ܽ:I

    invoke-static {v7, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 2263
    :cond_f
    invoke-virtual {p0, v7, v0, v2, v2}, Ll/֡ܰۧ;->֫(IIZZ)V

    .line 2265
    invoke-direct {p0}, Ll/֡ܰۧ;->᩷()Z

    move-result v1

    goto :goto_3

    .line 2194
    :cond_10
    iget-object v0, p0, Ll/֡ܰۧ;->ۙ֫:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 2195
    iput-boolean v1, p0, Ll/֡ܰۧ;->۠֫:Z

    .line 2196
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    .line 2199
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->ᩳ֫:F

    iput v0, p0, Ll/֡ܰۧ;->ۡ֫:F

    .line 2200
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Ll/֡ܰۧ;->ܿ֫:F

    iput v0, p0, Ll/֡ܰۧ;->ܺ֫:F

    .line 2201
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/֡ܰۧ;->᩸:I

    :cond_11
    :goto_3
    if-eqz v1, :cond_12

    .line 2287
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_12
    return v2

    :cond_13
    :goto_4
    return v1
.end method

.method public final removeView(Landroid/view/View;)V
    .locals 1

    .line 1504
    iget-boolean v0, p0, Ll/֡ܰۧ;->ܽ֫:Z

    if-eqz v0, :cond_0

    .line 1505
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void

    .line 1507
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 910
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(II)Ll/᩷ܰۧ;
    .locals 2

    .line 1008
    new-instance v0, Ll/᩷ܰۧ;

    invoke-direct {v0}, Ll/᩷ܰۧ;-><init>()V

    .line 1009
    iput p1, v0, Ll/᩷ܰۧ;->ܽ:I

    .line 1010
    iget-object v1, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v1, p0, p1}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    .line 1011
    iget-object p1, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, v0, Ll/᩷ܰۧ;->ܿ:F

    .line 1012
    iget-object p1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    if-ltz p2, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p2, v1, :cond_0

    goto :goto_0

    .line 1015
    :cond_0
    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object v0

    .line 1013
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(Landroid/view/View;)Ll/᩷ܰۧ;
    .locals 4

    const/4 v0, 0x0

    .line 1512
    :goto_0
    iget-object v1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 1513
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ܰۧ;

    .line 1514
    iget-object v2, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v3, v1, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Ll/ۨ᩺ۧ;->֫(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()V
    .locals 8

    .line 1023
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    .line 1024
    iput v0, p0, Ll/֡ܰۧ;->᩺:I

    .line 1025
    iget-object v1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Ll/֡ܰۧ;->ۚ֫:I

    mul-int/lit8 v3, v3, 0x2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    const/4 v5, 0x0

    if-ge v2, v3, :cond_0

    .line 1026
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1027
    :goto_0
    iget v2, p0, Ll/֡ܰۧ;->۫:I

    const/4 v3, 0x0

    .line 1030
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_1

    .line 1031
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ܰۧ;

    .line 1032
    iget-object v7, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v6, v6, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1073
    :cond_1
    sget-object v3, Ll/֡ܰۧ;->ۨ֫:Ljava/util/Comparator;

    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    if-eqz v0, :cond_4

    .line 1077
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_3

    .line 1079
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1080
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ۢܰۧ;

    .line 1081
    iget-boolean v6, v3, Ll/ۢܰۧ;->ۧ:Z

    if-nez v6, :cond_2

    const/4 v6, 0x0

    .line 1082
    iput v6, v3, Ll/ۢܰۧ;->ᩳ:F

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 631
    :cond_3
    invoke-virtual {p0, v2, v5, v5, v4}, Ll/֡ܰۧ;->֫(IIZZ)V

    .line 1087
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_4
    return-void
.end method

.method public final ֫(IFI)V
    .locals 12

    .line 1865
    iget v0, p0, Ll/֡ܰۧ;->ۤ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_5

    .line 1866
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 1867
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    .line 1868
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 1869
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    .line 1870
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    .line 1872
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 1873
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ۢܰۧ;

    .line 1874
    iget-boolean v10, v9, Ll/ۢܰۧ;->ۧ:Z

    if-nez v10, :cond_0

    goto :goto_3

    .line 1876
    :cond_0
    iget v9, v9, Ll/ۢܰۧ;->֫:I

    and-int/lit8 v9, v9, 0x7

    if-eq v9, v2, :cond_3

    const/4 v10, 0x3

    if-eq v9, v10, :cond_2

    const/4 v10, 0x5

    if-eq v9, v10, :cond_1

    move v9, v3

    goto :goto_2

    :cond_1
    sub-int v9, v5, v4

    .line 1891
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    sub-int/2addr v9, v10

    .line 1892
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    add-int/2addr v4, v10

    goto :goto_1

    .line 1884
    :cond_2
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v3

    goto :goto_2

    .line 1887
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    sub-int v9, v5, v9

    div-int/lit8 v9, v9, 0x2

    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    :goto_1
    move v11, v9

    move v9, v3

    move v3, v11

    :goto_2
    add-int/2addr v3, v0

    .line 1897
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    move-result v10

    sub-int/2addr v3, v10

    if-eqz v3, :cond_4

    .line 1899
    invoke-virtual {v8, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_4
    move v3, v9

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1926
    :cond_5
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 1927
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_4
    if-ge v1, v0, :cond_7

    .line 1928
    iget-object v3, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖܰۧ;

    if-eqz v3, :cond_6

    .line 1930
    invoke-interface {v3, p1, p2, p3}, Ll/ۖܰۧ;->onPageScrolled(IFI)V

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 1934
    :cond_7
    iget-object v0, p0, Ll/֡ܰۧ;->ܳ֫:Ll/ۖܰۧ;

    if-eqz v0, :cond_8

    .line 1935
    invoke-interface {v0, p1, p2, p3}, Ll/ۖܰۧ;->onPageScrolled(IFI)V

    .line 1919
    :cond_8
    iput-boolean v2, p0, Ll/֡ܰۧ;->ۙ:Z

    return-void
.end method

.method public final ֫(IIZZ)V
    .locals 5

    .line 635
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_2

    .line 639
    :cond_0
    iget-object v0, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    if-nez p4, :cond_1

    iget p4, p0, Ll/֡ܰۧ;->۫:I

    if-ne p4, p1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-eqz p4, :cond_1

    .line 640
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۧ(Z)V

    return-void

    :cond_1
    const/4 p4, 0x1

    if-gez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    .line 646
    :cond_2
    iget-object v2, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v2}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v2

    if-lt p1, v2, :cond_3

    .line 647
    iget-object p1, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {p1}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result p1

    sub-int/2addr p1, p4

    .line 649
    :cond_3
    :goto_0
    iget v2, p0, Ll/֡ܰۧ;->ۚ֫:I

    .line 650
    iget v3, p0, Ll/֡ܰۧ;->۫:I

    add-int v4, v3, v2

    if-gt p1, v4, :cond_4

    sub-int/2addr v3, v2

    if-ge p1, v3, :cond_5

    :cond_4
    const/4 v2, 0x0

    .line 654
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 655
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ܰۧ;

    iput-boolean p4, v3, Ll/᩷ܰۧ;->ᩳ:Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 658
    :cond_5
    iget p4, p0, Ll/֡ܰۧ;->۫:I

    if-eq p4, p1, :cond_6

    const/4 v1, 0x1

    .line 660
    :cond_6
    iget-boolean p4, p0, Ll/֡ܰۧ;->ܰ:Z

    if-eqz p4, :cond_8

    .line 663
    iput p1, p0, Ll/֡ܰۧ;->۫:I

    if-eqz v1, :cond_7

    .line 665
    invoke-direct {p0, p1}, Ll/֡ܰۧ;->᩻(I)V

    .line 667
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    .line 669
    :cond_8
    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->ܽ(I)V

    .line 670
    invoke-direct {p0, p1, p2, p3, v1}, Ll/֡ܰۧ;->ۧ(IIZZ)V

    return-void

    .line 636
    :cond_9
    :goto_2
    invoke-direct {p0, v1}, Ll/֡ܰۧ;->ۧ(Z)V

    return-void
.end method

.method public final ֫(Ll/ۖܰۧ;)V
    .locals 1

    .line 723
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 724
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    .line 726
    :cond_0
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۨ᩺ۧ;)V
    .locals 7

    .line 506
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 507
    invoke-virtual {v0, v1}, Ll/ۨ᩺ۧ;->ۧ(Landroid/database/DataSetObserver;)V

    .line 508
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v0, p0}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;)V

    const/4 v0, 0x0

    .line 509
    :goto_0
    iget-object v4, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_0

    .line 510
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܰۧ;

    .line 511
    iget-object v5, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget v6, v4, Ll/᩷ܰۧ;->ܽ:I

    iget-object v4, v4, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v5, p0, v6, v4}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 513
    :cond_0
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->֫()V

    .line 514
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 555
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 556
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 557
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ۢܰۧ;

    .line 558
    iget-boolean v4, v4, Ll/ۢܰۧ;->ۧ:Z

    if-nez v4, :cond_1

    .line 559
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/2addr v0, v2

    goto :goto_1

    .line 516
    :cond_2
    iput v3, p0, Ll/֡ܰۧ;->۫:I

    .line 517
    invoke-virtual {p0, v3, v3}, Landroid/view/View;->scrollTo(II)V

    .line 520
    :cond_3
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 521
    iput-object p1, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 522
    iput v3, p0, Ll/֡ܰۧ;->᩺:I

    if-eqz p1, :cond_7

    .line 525
    iget-object v4, p0, Ll/֡ܰۧ;->֡֫:Ll/ۘܰۧ;

    if-nez v4, :cond_4

    .line 526
    new-instance v4, Ll/ۘܰۧ;

    invoke-direct {v4, p0}, Ll/ۘܰۧ;-><init>(Ll/֡ܰۧ;)V

    iput-object v4, p0, Ll/֡ܰۧ;->֡֫:Ll/ۘܰۧ;

    .line 528
    :cond_4
    iget-object v4, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v5, p0, Ll/֡ܰۧ;->֡֫:Ll/ۘܰۧ;

    invoke-virtual {v4, v5}, Ll/ۨ᩺ۧ;->ۧ(Landroid/database/DataSetObserver;)V

    .line 529
    iput-boolean v3, p0, Ll/֡ܰۧ;->۠֫:Z

    .line 530
    iget-boolean v4, p0, Ll/֡ܰۧ;->ܰ:Z

    .line 531
    iput-boolean v2, p0, Ll/֡ܰۧ;->ܰ:Z

    .line 532
    iget-object v5, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v5}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v5

    iput v5, p0, Ll/֡ܰۧ;->᩺:I

    .line 533
    iget v5, p0, Ll/֡ܰۧ;->᩸֫:I

    if-ltz v5, :cond_5

    .line 534
    iget-object v4, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    iget v4, p0, Ll/֡ܰۧ;->᩸֫:I

    .line 631
    invoke-virtual {p0, v4, v3, v3, v2}, Ll/֡ܰۧ;->֫(IIZZ)V

    const/4 v2, -0x1

    .line 536
    iput v2, p0, Ll/֡ܰۧ;->᩸֫:I

    .line 537
    iput-object v1, p0, Ll/֡ܰۧ;->ܶ֫:Landroid/os/Parcelable;

    goto :goto_2

    :cond_5
    if-nez v4, :cond_6

    .line 540
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    goto :goto_2

    .line 542
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 547
    :cond_7
    :goto_2
    iget-object v1, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    .line 548
    iget-object v1, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_3
    if-ge v3, v1, :cond_8

    .line 549
    iget-object v2, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺܰۧ;

    invoke-interface {v2, p0, v0, p1}, Ll/ܺܰۧ;->onAdapterChanged(Ll/֡ܰۧ;Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public final ֫(Ll/ܺܰۧ;)V
    .locals 1

    .line 581
    iget-object v0, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 582
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    .line 584
    :cond_0
    iget-object v0, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(I)Z
    .locals 7

    .line 2793
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, p0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v0, :cond_4

    .line 2798
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    if-ne v2, p0, :cond_1

    goto :goto_3

    .line 2799
    :cond_1
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    .line 2809
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_1
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_3

    .line 2810
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_2
    move-object v0, v1

    .line 2821
    :cond_4
    :goto_3
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x42

    const/16 v5, 0x11

    if-eqz v1, :cond_8

    if-eq v1, v0, :cond_8

    .line 2824
    iget-object v6, p0, Ll/֡ܰۧ;->۫֫:Landroid/graphics/Rect;

    if-ne p1, v5, :cond_6

    .line 2827
    invoke-direct {p0, v6, v1}, Ll/֡ܰۧ;->֫(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 2828
    invoke-direct {p0, v6, v0}, Ll/֡ܰۧ;->֫(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->left:I

    if-eqz v0, :cond_5

    if-lt v3, v4, :cond_5

    .line 2885
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    if-lez v0, :cond_c

    goto :goto_6

    .line 2832
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    move-result v0

    :goto_4
    move v3, v0

    goto :goto_8

    :cond_6
    if-ne p1, v4, :cond_d

    .line 2837
    invoke-direct {p0, v6, v1}, Ll/֡ܰۧ;->֫(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 2838
    invoke-direct {p0, v6, v0}, Ll/֡ܰۧ;->֫(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-eqz v0, :cond_7

    if-gt v2, v3, :cond_7

    .line 2840
    invoke-virtual {p0}, Ll/֡ܰۧ;->ᩳ()Z

    move-result v0

    goto :goto_4

    .line 2842
    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    move-result v0

    goto :goto_4

    :cond_8
    if-eq p1, v5, :cond_b

    if-ne p1, v2, :cond_9

    goto :goto_5

    :cond_9
    if-eq p1, v4, :cond_a

    const/4 v0, 0x2

    if-ne p1, v0, :cond_d

    .line 2850
    :cond_a
    invoke-virtual {p0}, Ll/֡ܰۧ;->ᩳ()Z

    move-result v3

    goto :goto_8

    .line 2885
    :cond_b
    :goto_5
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    if-lez v0, :cond_c

    :goto_6
    sub-int/2addr v0, v2

    .line 2886
    invoke-virtual {p0, v0}, Ll/֡ܰۧ;->ܿ(I)V

    goto :goto_7

    :cond_c
    const/4 v2, 0x0

    :goto_7
    move v3, v2

    :cond_d
    :goto_8
    if-eqz v3, :cond_e

    .line 2853
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->playSoundEffect(I)V

    :cond_e
    return v3
.end method

.method public final ۧ()Ll/ۨ᩺ۧ;
    .locals 1

    .line 572
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    return-object v0
.end method

.method public final ۧ(I)Ll/᩷ܰۧ;
    .locals 3

    const/4 v0, 0x0

    .line 1533
    :goto_0
    iget-object v1, p0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 1534
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ܰۧ;

    .line 1535
    iget v2, v1, Ll/᩷ܰۧ;->ܽ:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ۖܰۧ;)V
    .locals 1

    .line 736
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 737
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ܺܰۧ;)V
    .locals 1

    .line 594
    iget-object v0, p0, Ll/֡ܰۧ;->᩶:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 595
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 854
    iget v0, p0, Ll/֡ܰۧ;->ۚ֫:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    .line 855
    iput v1, p0, Ll/֡ܰۧ;->ۚ֫:I

    .line 856
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ܳ(I)V
    .locals 3

    .line 488
    iget v0, p0, Ll/֡ܰۧ;->᩶֫:I

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 492
    :cond_0
    iput p1, p0, Ll/֡ܰۧ;->᩶֫:I

    .line 1960
    iget-object v0, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1961
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 1962
    iget-object v2, p0, Ll/֡ܰۧ;->֨֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܰۧ;

    if-eqz v2, :cond_1

    .line 1964
    invoke-interface {v2, p1}, Ll/ۖܰۧ;->onPageScrollStateChanged(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1968
    :cond_2
    iget-object v0, p0, Ll/֡ܰۧ;->ܳ֫:Ll/ۖܰۧ;

    if-eqz v0, :cond_3

    .line 1969
    invoke-interface {v0, p1}, Ll/ۖܰۧ;->onPageScrollStateChanged(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 627
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1097
    iget v2, v0, Ll/֡ܰۧ;->۫:I

    if-eq v2, v1, :cond_0

    .line 1098
    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->ۧ(I)Ll/᩷ܰۧ;

    move-result-object v2

    .line 1099
    iput v1, v0, Ll/֡ܰۧ;->۫:I

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1102
    :goto_0
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-nez v1, :cond_1

    goto/16 :goto_20

    .line 1111
    :cond_1
    iget-boolean v1, v0, Ll/֡ܰۧ;->۠֫:Z

    if-eqz v1, :cond_2

    goto/16 :goto_20

    .line 1120
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_3

    goto/16 :goto_20

    .line 1124
    :cond_3
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v1, v0}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;)V

    .line 1126
    iget v1, v0, Ll/֡ܰۧ;->ۚ֫:I

    .line 1127
    iget v3, v0, Ll/֡ܰۧ;->۫:I

    sub-int/2addr v3, v1

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1128
    iget-object v5, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v5}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v5

    add-int/lit8 v6, v5, -0x1

    .line 1129
    iget v7, v0, Ll/֡ܰۧ;->۫:I

    add-int/2addr v7, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1131
    iget v6, v0, Ll/֡ܰۧ;->᩺:I

    if-ne v5, v6, :cond_2f

    const/4 v6, 0x0

    .line 1149
    :goto_1
    iget-object v7, v0, Ll/֡ܰۧ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_5

    .line 1150
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ܰۧ;

    .line 1151
    iget v9, v8, Ll/᩷ܰۧ;->ܽ:I

    iget v10, v0, Ll/֡ܰۧ;->۫:I

    if-lt v9, v10, :cond_4

    if-ne v9, v10, :cond_5

    goto :goto_2

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_6

    if-lez v5, :cond_6

    .line 1158
    iget v8, v0, Ll/֡ܰۧ;->۫:I

    invoke-virtual {v0, v8, v6}, Ll/֡ܰۧ;->֫(II)Ll/᩷ܰۧ;

    move-result-object v8

    :cond_6
    if-eqz v8, :cond_26

    add-int/lit8 v9, v6, -0x1

    if-ltz v9, :cond_7

    .line 1167
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ܰۧ;

    goto :goto_3

    :cond_7
    const/4 v10, 0x0

    .line 1168
    :goto_3
    invoke-direct/range {p0 .. p0}, Ll/֡ܰۧ;->᩻()I

    move-result v11

    const/high16 v12, 0x40000000    # 2.0f

    if-gtz v11, :cond_8

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_4

    .line 1169
    :cond_8
    iget v13, v8, Ll/᩷ܰۧ;->ܿ:F

    sub-float/2addr v12, v13

    .line 1170
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    int-to-float v13, v13

    const/4 v14, 0x0

    int-to-float v15, v11

    div-float/2addr v13, v15

    add-float/2addr v13, v12

    const/4 v12, 0x0

    .line 1171
    :goto_4
    iget v14, v0, Ll/֡ܰۧ;->۫:I

    add-int/lit8 v14, v14, -0x1

    const/4 v15, 0x0

    :goto_5
    if-ltz v14, :cond_e

    cmpl-float v16, v15, v13

    if-ltz v16, :cond_a

    if-ge v14, v3, :cond_a

    if-nez v10, :cond_9

    goto :goto_7

    .line 1176
    :cond_9
    iget v4, v10, Ll/᩷ܰۧ;->ܽ:I

    if-ne v14, v4, :cond_d

    iget-boolean v4, v10, Ll/᩷ܰۧ;->ᩳ:Z

    if-nez v4, :cond_d

    .line 1177
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1178
    iget-object v4, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v10, v10, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v4, v0, v14, v10}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;ILjava/lang/Object;)V

    add-int/lit8 v9, v9, -0x1

    add-int/lit8 v6, v6, -0x1

    if-ltz v9, :cond_c

    .line 1185
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܰۧ;

    goto :goto_6

    :cond_a
    if-eqz v10, :cond_b

    .line 1187
    iget v4, v10, Ll/᩷ܰۧ;->ܽ:I

    if-ne v14, v4, :cond_b

    .line 1188
    iget v4, v10, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v15, v4

    add-int/lit8 v9, v9, -0x1

    if-ltz v9, :cond_c

    .line 1190
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܰۧ;

    goto :goto_6

    :cond_b
    add-int/lit8 v4, v9, 0x1

    .line 1192
    invoke-virtual {v0, v14, v4}, Ll/֡ܰۧ;->֫(II)Ll/᩷ܰۧ;

    move-result-object v4

    .line 1193
    iget v4, v4, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v15, v4

    add-int/lit8 v6, v6, 0x1

    if-ltz v9, :cond_c

    .line 1195
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܰۧ;

    goto :goto_6

    :cond_c
    const/4 v4, 0x0

    :goto_6
    move-object v10, v4

    :cond_d
    add-int/lit8 v14, v14, -0x1

    const/4 v4, 0x0

    goto :goto_5

    :cond_e
    :goto_7
    const/high16 v3, 0x40000000    # 2.0f

    .line 1199
    iget v4, v8, Ll/᩷ܰۧ;->ܿ:F

    add-int/lit8 v9, v6, 0x1

    cmpg-float v10, v4, v3

    if-gez v10, :cond_16

    .line 1202
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_f

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ܰۧ;

    goto :goto_8

    :cond_f
    const/4 v10, 0x0

    :goto_8
    if-gtz v11, :cond_10

    const/4 v3, 0x0

    goto :goto_9

    .line 1204
    :cond_10
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v13

    int-to-float v13, v13

    int-to-float v11, v11

    div-float/2addr v13, v11

    add-float/2addr v3, v13

    .line 1205
    :goto_9
    iget v11, v0, Ll/֡ܰۧ;->۫:I

    add-int/lit8 v11, v11, 0x1

    move v13, v9

    :goto_a
    if-ge v11, v5, :cond_16

    cmpl-float v14, v4, v3

    if-ltz v14, :cond_12

    if-le v11, v1, :cond_12

    if-nez v10, :cond_11

    goto :goto_c

    .line 1210
    :cond_11
    iget v14, v10, Ll/᩷ܰۧ;->ܽ:I

    if-ne v11, v14, :cond_15

    iget-boolean v14, v10, Ll/᩷ܰۧ;->ᩳ:Z

    if-nez v14, :cond_15

    .line 1211
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1212
    iget-object v14, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v10, v10, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v14, v0, v11, v10}, Ll/ۨ᩺ۧ;->֫(Ll/֡ܰۧ;ILjava/lang/Object;)V

    .line 1217
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v13, v10, :cond_14

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ܰۧ;

    goto :goto_b

    :cond_12
    if-eqz v10, :cond_13

    .line 1219
    iget v14, v10, Ll/᩷ܰۧ;->ܽ:I

    if-ne v11, v14, :cond_13

    .line 1220
    iget v10, v10, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v4, v10

    add-int/lit8 v13, v13, 0x1

    .line 1222
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v13, v10, :cond_14

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ܰۧ;

    goto :goto_b

    .line 1224
    :cond_13
    invoke-virtual {v0, v11, v13}, Ll/֡ܰۧ;->֫(II)Ll/᩷ܰۧ;

    move-result-object v10

    add-int/lit8 v13, v13, 0x1

    .line 1226
    iget v10, v10, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v4, v10

    .line 1227
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v13, v10, :cond_14

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ܰۧ;

    goto :goto_b

    :cond_14
    const/4 v10, 0x0

    :cond_15
    :goto_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    .line 1298
    :cond_16
    :goto_c
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v1}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v1

    .line 1299
    invoke-direct/range {p0 .. p0}, Ll/֡ܰۧ;->᩻()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_17

    int-to-float v5, v4

    int-to-float v3, v3

    div-float/2addr v5, v3

    goto :goto_d

    :cond_17
    const/4 v5, 0x0

    :goto_d
    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v2, :cond_1d

    .line 1303
    iget v10, v2, Ll/᩷ܰۧ;->ܽ:I

    .line 1305
    iget v11, v8, Ll/᩷ܰۧ;->ܽ:I

    if-ge v10, v11, :cond_1a

    .line 1308
    iget v11, v2, Ll/᩷ܰۧ;->ۧ:F

    iget v2, v2, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v11, v2

    add-float/2addr v11, v5

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x0

    .line 1310
    :goto_e
    iget v13, v8, Ll/᩷ܰۧ;->ܽ:I

    if-gt v10, v13, :cond_1d

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v2, v13, :cond_1d

    .line 1311
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ܰۧ;

    .line 1312
    :goto_f
    iget v14, v13, Ll/᩷ܰۧ;->ܽ:I

    if-le v10, v14, :cond_18

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v14

    add-int/lit8 v14, v14, -0x1

    if-ge v2, v14, :cond_18

    add-int/lit8 v2, v2, 0x1

    .line 1314
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ܰۧ;

    goto :goto_f

    .line 1316
    :cond_18
    :goto_10
    iget v14, v13, Ll/᩷ܰۧ;->ܽ:I

    if-ge v10, v14, :cond_19

    .line 1319
    iget-object v14, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v14, v3, v5

    add-float/2addr v11, v14

    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    .line 1322
    :cond_19
    iput v11, v13, Ll/᩷ܰۧ;->ۧ:F

    .line 1323
    iget v13, v13, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v13, v5

    add-float/2addr v11, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    :cond_1a
    if-le v10, v11, :cond_1d

    .line 1326
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    .line 1328
    iget v2, v2, Ll/᩷ܰۧ;->ۧ:F

    :goto_11
    add-int/lit8 v10, v10, -0x1

    .line 1330
    iget v13, v8, Ll/᩷ܰۧ;->ܽ:I

    if-lt v10, v13, :cond_1d

    if-ltz v11, :cond_1d

    .line 1331
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ܰۧ;

    .line 1332
    :goto_12
    iget v14, v13, Ll/᩷ܰۧ;->ܽ:I

    if-ge v10, v14, :cond_1b

    if-lez v11, :cond_1b

    add-int/lit8 v11, v11, -0x1

    .line 1334
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ܰۧ;

    goto :goto_12

    .line 1336
    :cond_1b
    :goto_13
    iget v14, v13, Ll/᩷ܰۧ;->ܽ:I

    if-le v10, v14, :cond_1c

    .line 1339
    iget-object v14, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v14, v3, v5

    sub-float/2addr v2, v14

    add-int/lit8 v10, v10, -0x1

    goto :goto_13

    .line 1342
    :cond_1c
    iget v14, v13, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v14, v5

    sub-float/2addr v2, v14

    .line 1343
    iput v2, v13, Ll/᩷ܰۧ;->ۧ:F

    goto :goto_11

    .line 1349
    :cond_1d
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1350
    iget v10, v8, Ll/᩷ܰۧ;->ۧ:F

    .line 1351
    iget v11, v8, Ll/᩷ܰۧ;->ܽ:I

    add-int/lit8 v13, v11, -0x1

    if-nez v11, :cond_1e

    move v14, v10

    goto :goto_14

    :cond_1e
    const v14, -0x800001

    .line 1352
    :goto_14
    iput v14, v0, Ll/֡ܰۧ;->۟:F

    add-int/lit8 v1, v1, -0x1

    if-ne v11, v1, :cond_1f

    .line 1353
    iget v11, v8, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v11, v10

    sub-float/2addr v11, v3

    goto :goto_15

    :cond_1f
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    :goto_15
    iput v11, v0, Ll/֡ܰۧ;->ۖ֫:F

    add-int/lit8 v6, v6, -0x1

    :goto_16
    if-ltz v6, :cond_22

    .line 1357
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ܰۧ;

    .line 1358
    :goto_17
    iget v14, v11, Ll/᩷ܰۧ;->ܽ:I

    if-le v13, v14, :cond_20

    .line 1359
    iget-object v14, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    add-int/lit8 v13, v13, -0x1

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v14, v3, v5

    sub-float/2addr v10, v14

    goto :goto_17

    .line 1361
    :cond_20
    iget v15, v11, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v15, v5

    sub-float/2addr v10, v15

    .line 1362
    iput v10, v11, Ll/᩷ܰۧ;->ۧ:F

    if-nez v14, :cond_21

    .line 1363
    iput v10, v0, Ll/֡ܰۧ;->۟:F

    :cond_21
    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v13, v13, -0x1

    goto :goto_16

    .line 1365
    :cond_22
    iget v6, v8, Ll/᩷ܰۧ;->ۧ:F

    iget v10, v8, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v6, v10

    add-float/2addr v6, v5

    .line 1366
    iget v10, v8, Ll/᩷ܰۧ;->ܽ:I

    :goto_18
    add-int/lit8 v10, v10, 0x1

    if-ge v9, v2, :cond_25

    .line 1369
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ܰۧ;

    .line 1370
    :goto_19
    iget v13, v11, Ll/᩷ܰۧ;->ܽ:I

    if-ge v10, v13, :cond_23

    .line 1371
    iget-object v13, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-float v13, v3, v5

    add-float/2addr v6, v13

    goto :goto_19

    :cond_23
    if-ne v13, v1, :cond_24

    .line 1374
    iget v13, v11, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v13, v6

    sub-float/2addr v13, v3

    iput v13, v0, Ll/֡ܰۧ;->ۖ֫:F

    .line 1376
    :cond_24
    iput v6, v11, Ll/᩷ܰۧ;->ۧ:F

    .line 1377
    iget v11, v11, Ll/᩷ܰۧ;->ܿ:F

    add-float/2addr v11, v5

    add-float/2addr v6, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_18

    .line 1234
    :cond_25
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    iget-object v2, v8, Ll/᩷ܰۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ll/ۨ᩺ۧ;->֫(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_26
    const/4 v12, 0x0

    .line 1244
    :goto_1a
    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    invoke-virtual {v1}, Ll/ۨ᩺ۧ;->֫()V

    .line 1248
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1b
    if-ge v2, v1, :cond_28

    .line 1250
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1251
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ۢܰۧ;

    .line 1252
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1253
    iget-boolean v6, v5, Ll/ۢܰۧ;->ۧ:Z

    if-nez v6, :cond_27

    iget v6, v5, Ll/ۢܰۧ;->ᩳ:F

    cmpl-float v6, v6, v12

    if-nez v6, :cond_27

    .line 1255
    invoke-virtual {v0, v3}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v3

    if-eqz v3, :cond_27

    .line 1257
    iget v3, v3, Ll/᩷ܰۧ;->ܿ:F

    iput v3, v5, Ll/ۢܰۧ;->ᩳ:F

    :cond_27
    add-int/lit8 v2, v2, 0x1

    goto :goto_1b

    .line 1264
    :cond_28
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_2e

    .line 1265
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 1523
    :goto_1c
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eq v2, v0, :cond_2a

    if-eqz v2, :cond_2b

    .line 1524
    instance-of v1, v2, Landroid/view/View;

    if-nez v1, :cond_29

    goto :goto_1d

    .line 1527
    :cond_29
    move-object v1, v2

    check-cast v1, Landroid/view/View;

    goto :goto_1c

    .line 1529
    :cond_2a
    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v1

    goto :goto_1e

    :cond_2b
    :goto_1d
    const/4 v1, 0x0

    :goto_1e
    if-eqz v1, :cond_2c

    .line 1267
    iget v1, v1, Ll/᩷ܰۧ;->ܽ:I

    iget v2, v0, Ll/֡ܰۧ;->۫:I

    if-eq v1, v2, :cond_2e

    .line 1268
    :cond_2c
    :goto_1f
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v4, v1, :cond_2e

    .line 1269
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1270
    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->֫(Landroid/view/View;)Ll/᩷ܰۧ;

    move-result-object v2

    if-eqz v2, :cond_2d

    .line 1271
    iget v2, v2, Ll/᩷ܰۧ;->ܽ:I

    iget v3, v0, Ll/֡ܰۧ;->۫:I

    if-ne v2, v3, :cond_2d

    const/4 v2, 0x2

    .line 1272
    invoke-virtual {v1, v2}, Landroid/view/View;->requestFocus(I)Z

    move-result v1

    if-eqz v1, :cond_2d

    goto :goto_20

    :cond_2d
    add-int/lit8 v4, v4, 0x1

    goto :goto_1f

    :cond_2e
    :goto_20
    return-void

    .line 1134
    :cond_2f
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_21

    .line 1136
    :catch_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    .line 1138
    :goto_21
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, Ll/֡ܰۧ;->᩺:I

    const-string v6, ", found: "

    const-string v7, " Pager id: "

    .line 0
    invoke-static {v3, v4, v6, v5, v7}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1138
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Pager class: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1142
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " Problematic adapter: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 1143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ܽ(Ll/ۖܰۧ;)V
    .locals 0

    .line 816
    iput-object p1, p0, Ll/֡ܰۧ;->ܳ֫:Ll/ۖܰۧ;

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 1092
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    invoke-virtual {p0, v0}, Ll/֡ܰۧ;->ܽ(I)V

    return-void
.end method

.method public final ܿ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 622
    iput-boolean v0, p0, Ll/֡ܰۧ;->۠֫:Z

    const/4 v1, 0x1

    .line 631
    invoke-virtual {p0, p1, v0, v1, v0}, Ll/֡ܰۧ;->֫(IIZZ)V

    return-void
.end method

.method public final ᩳ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 611
    iput-boolean v0, p0, Ll/֡ܰۧ;->۠֫:Z

    .line 612
    iget-boolean v1, p0, Ll/֡ܰۧ;->ܰ:Z

    xor-int/lit8 v1, v1, 0x1

    .line 631
    invoke-virtual {p0, p1, v0, v1, v0}, Ll/֡ܰۧ;->֫(IIZZ)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 3

    .line 2893
    iget-object v0, p0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/֡ܰۧ;->۫:I

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_0

    .line 2894
    iget v0, p0, Ll/֡ܰۧ;->۫:I

    add-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ll/֡ܰۧ;->ܿ(I)V

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
