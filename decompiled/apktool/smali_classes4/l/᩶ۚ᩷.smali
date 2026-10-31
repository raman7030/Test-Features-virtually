.class public final Ll/᩶ۚ᩷;
.super Ljava/lang/Object;
.source "96WS"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final ֫֫:Ll/۠ۚ᩷;

.field public final ۗ:Landroid/view/ViewGroup;

.field public ۙ:Z

.field public ۛ:F

.field public ۜ֫:Z

.field public ۟:Z

.field public final ۡ֫:I

.field public ۢ֫:Ll/ۧ۬;

.field public ۤ:F

.field public final ۧ֫:I

.field public ۨ:F

.field public ۫:F

.field public ۬:F

.field public final ܰ:I

.field public ܳ֫:F

.field public ܺ֫:Z

.field public ܽ֫:Z

.field public ܿ֫:F

.field public ᩳ֫:Z

.field public ᩶:F

.field public ᩷֫:Z

.field public final ᩸:Landroid/view/View;

.field public ᩹:F

.field public ᩺:Z

.field public final ᩻֫:Ll/۫ۤۡ;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/۫ۤۡ;)V
    .locals 4

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object v0, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    iput-object v0, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    .line 35
    new-instance v0, Ll/۠ۚ᩷;

    invoke-direct {v0, p0}, Ll/۠ۚ᩷;-><init>(Ll/᩶ۚ᩷;)V

    iput-object v0, p0, Ll/᩶ۚ᩷;->֫֫:Ll/۠ۚ᩷;

    .line 47
    iput-object p1, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    .line 49
    iput-object p2, p0, Ll/᩶ۚ᩷;->᩻֫:Ll/۫ۤۡ;

    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41000000    # 8.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p0, Ll/᩶ۚ᩷;->ܰ:I

    const-string v1, "hfpx"

    const/4 v2, 0x0

    .line 51
    invoke-interface {p2, v1, v2}, Ll/۫ۤۡ;->getFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-static {v1}, Ll/᩶ۚ᩷;->֫(F)F

    move-result v1

    iput v1, p0, Ll/᩶ۚ᩷;->ܿ֫:F

    const-string v1, "hfpy"

    .line 52
    invoke-interface {p2, v1, v2}, Ll/۫ۤۡ;->getFloat(Ljava/lang/String;F)F

    move-result p2

    invoke-static {p2}, Ll/᩶ۚ᩷;->֫(F)F

    move-result p2

    iput p2, p0, Ll/᩶ۚ᩷;->ܳ֫:F

    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Ll/᩶ۚ᩷;->ۡ֫:I

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "accessibility"

    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    .line 55
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/16 v3, 0xbb8

    if-lt v1, v2, :cond_0

    if-eqz p2, :cond_0

    const/4 v1, 0x5

    .line 56
    invoke-virtual {p2, v3, v1}, Landroid/view/accessibility/AccessibilityManager;->getRecommendedTimeoutMillis(II)I

    move-result v3

    .line 58
    :cond_0
    iput v3, p0, Ll/᩶ۚ᩷;->ۧ֫:I

    .line 59
    new-instance p2, Ll/ܶۚ᩷;

    invoke-direct {p2, p0}, Ll/ܶۚ᩷;-><init>(Ll/᩶ۚ᩷;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 60
    new-instance p2, Ll/᩸ۚ᩷;

    invoke-direct {p2, p0}, Ll/᩸ۚ᩷;-><init>(Ll/᩶ۚ᩷;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 61
    new-instance p2, Ll/᩹ۚ᩷;

    invoke-direct {p2, p0}, Ll/᩹ۚ᩷;-><init>(Ll/᩶ۚ᩷;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 62
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    return-void
.end method

.method public static ֫(F)F
    .locals 2

    .line 180
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0

    :cond_1
    :goto_0
    return v1
.end method

.method public static synthetic ֫(Ll/᩶ۚ᩷;)V
    .locals 1

    .line 288
    iget-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-nez v0, :cond_0

    .line 289
    iget-object p0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩶ۚ᩷;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 73
    iget v0, p0, Ll/᩶ۚ᩷;->ۡ֫:I

    iget-object v1, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    iget-boolean v2, p0, Ll/᩶ۚ᩷;->۟:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v4, 0x1

    if-nez v2, :cond_1

    .line 78
    iput-boolean v4, p0, Ll/᩶ۚ᩷;->ۙ:Z

    .line 79
    iput-boolean v3, p0, Ll/᩶ۚ᩷;->᩺:Z

    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/᩶ۚ᩷;->᩹:F

    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->᩶:F

    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getX()F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->ۛ:F

    .line 83
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->ۨ:F

    .line 84
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩷()V

    return v3

    .line 87
    :cond_1
    iget-boolean v3, p0, Ll/᩶ۚ᩷;->ۙ:Z

    if-nez v3, :cond_2

    return v4

    :cond_2
    const/4 v3, 0x5

    const/4 v5, 0x3

    if-ne v2, v3, :cond_3

    .line 132
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    .line 133
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->setAction(I)V

    .line 134
    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 92
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܽ()V

    .line 93
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    return v4

    :cond_3
    const/4 v3, 0x2

    if-ne v2, v3, :cond_9

    .line 97
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    iget v3, p0, Ll/᩶ۚ᩷;->᩹:F

    sub-float/2addr v2, v3

    .line 98
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    iget v6, p0, Ll/᩶ۚ᩷;->᩶:F

    sub-float/2addr v3, v6

    .line 99
    iget-boolean v6, p0, Ll/᩶ۚ᩷;->᩺:Z

    if-nez v6, :cond_5

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v6

    int-to-float v0, v0

    cmpl-float v6, v6, v0

    if-gtz v6, :cond_4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v0, v6, v0

    if-lez v0, :cond_5

    .line 100
    :cond_4
    iput-boolean v4, p0, Ll/᩶ۚ᩷;->᩺:Z

    .line 132
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    .line 133
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->setAction(I)V

    .line 134
    invoke-virtual {v1, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 102
    iget-object p1, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 104
    :cond_5
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->᩺:Z

    if-eqz p1, :cond_8

    .line 105
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܳ()F

    move-result p1

    .line 106
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩻()F

    move-result v0

    .line 107
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ᩳ()F

    move-result v1

    sub-float/2addr v1, p1

    const/4 v5, 0x0

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 108
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܿ()F

    move-result v6

    sub-float/2addr v6, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    cmpl-float v7, v1, v5

    if-lez v7, :cond_6

    .line 111
    iget v7, p0, Ll/᩶ۚ᩷;->ۛ:F

    add-float/2addr v7, v2

    sub-float/2addr v7, p1

    div-float/2addr v7, v1

    invoke-static {v7}, Ll/᩶ۚ᩷;->֫(F)F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->ܿ֫:F

    :cond_6
    cmpl-float p1, v6, v5

    if-lez p1, :cond_7

    .line 114
    iget p1, p0, Ll/᩶ۚ᩷;->ۨ:F

    add-float/2addr p1, v3

    sub-float/2addr p1, v0

    div-float/2addr p1, v6

    invoke-static {p1}, Ll/᩶ۚ᩷;->֫(F)F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->ܳ֫:F

    .line 116
    :cond_7
    iput-boolean v4, p0, Ll/᩶ۚ᩷;->ᩳ֫:Z

    .line 117
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    .line 119
    :cond_8
    iget-boolean p0, p0, Ll/᩶ۚ᩷;->᩺:Z

    return p0

    :cond_9
    if-eq v2, v4, :cond_b

    if-ne v2, v5, :cond_a

    goto :goto_0

    .line 127
    :cond_a
    iget-boolean p0, p0, Ll/᩶ۚ᩷;->᩺:Z

    return p0

    .line 122
    :cond_b
    :goto_0
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->᩺:Z

    .line 123
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܽ()V

    .line 124
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    return p1
.end method

.method private ۜ()V
    .locals 4

    .line 273
    iget-object v0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    iget-object v1, p0, Ll/᩶ۚ᩷;->֫֫:Ll/۠ۚ᩷;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 274
    iget-boolean v2, p0, Ll/᩶ۚ᩷;->۟:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Ll/᩶ۚ᩷;->ۙ:Z

    if-nez v2, :cond_0

    .line 275
    iget v2, p0, Ll/᩶ۚ᩷;->ۧ֫:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private ۧ()V
    .locals 5

    .line 172
    iget-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 175
    :cond_0
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܳ()F

    move-result v0

    invoke-direct {p0}, Ll/᩶ۚ᩷;->ᩳ()F

    move-result v1

    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܳ()F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget v3, p0, Ll/᩶ۚ᩷;->ܿ֫:F

    mul-float v1, v1, v3

    add-float/2addr v1, v0

    iget-object v0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setX(F)V

    .line 176
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩻()F

    move-result v1

    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܿ()F

    move-result v3

    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩻()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget v3, p0, Ll/᩶ۚ᩷;->ܳ֫:F

    mul-float v2, v2, v3

    add-float/2addr v2, v1

    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ۧ(Ll/᩶ۚ᩷;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    return-void
.end method

.method private ۧ(Z)V
    .locals 3

    .line 280
    iget-object v0, p0, Ll/᩶ۚ᩷;->֫֫:Ll/۠ۚ᩷;

    iget-object v1, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    if-eqz p1, :cond_0

    .line 281
    iget-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 284
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    .line 285
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 287
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0xb4

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Ll/᩷᩸᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷᩸᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 291
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    .line 293
    :cond_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    const/16 p1, 0x8

    .line 294
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private ܳ()F
    .locals 2

    .line 153
    iget-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    iget v1, v1, Ll/ۧ۬;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Ll/᩶ۚ᩷;->ܰ:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method private ܽ()V
    .locals 4

    const/4 v0, 0x0

    .line 140
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ۙ:Z

    .line 141
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->᩺:Z

    .line 142
    iget-object v1, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 143
    iget-boolean v1, p0, Ll/᩶ۚ᩷;->ᩳ֫:Z

    if-eqz v1, :cond_0

    .line 144
    iget-object v1, p0, Ll/᩶ۚ᩷;->᩻֫:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "hfpx"

    iget v3, p0, Ll/᩶ۚ᩷;->ܿ֫:F

    .line 145
    invoke-interface {v1, v2, v3}, Ll/۬ۤۡ;->putFloat(Ljava/lang/String;F)Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "hfpy"

    iget v3, p0, Ll/᩶ۚ᩷;->ܳ֫:F

    .line 146
    invoke-interface {v1, v2, v3}, Ll/۬ۤۡ;->putFloat(Ljava/lang/String;F)Ll/۬ۤۡ;

    move-result-object v1

    .line 147
    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 148
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ᩳ֫:Z

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/᩶ۚ᩷;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    return-void
.end method

.method private ܿ()F
    .locals 3

    .line 166
    iget-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    iget-object v2, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    iget v2, v2, Ll/ۧ۬;->֫:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    .line 167
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sub-int/2addr v1, v0

    iget v0, p0, Ll/᩶ۚ᩷;->ܰ:I

    sub-int/2addr v1, v0

    int-to-float v0, v1

    return v0
.end method

.method private ᩳ()F
    .locals 3

    .line 161
    iget-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iget-object v2, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    iget v2, v2, Ll/ۧ۬;->ܽ:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    .line 162
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    sub-int/2addr v1, v0

    iget v0, p0, Ll/᩶ۚ᩷;->ܰ:I

    sub-int/2addr v1, v0

    int-to-float v0, v1

    return v0
.end method

.method public static synthetic ᩳ(Ll/᩶ۚ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 35
    invoke-direct {p0, v0}, Ll/᩶ۚ᩷;->ۧ(Z)V

    return-void
.end method

.method private ᩷()V
    .locals 3

    .line 259
    iget-boolean v0, p0, Ll/᩶ۚ᩷;->۟:Z

    if-nez v0, :cond_0

    return-void

    .line 262
    :cond_0
    iget-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-nez v0, :cond_1

    .line 263
    iget-object v0, p0, Ll/᩶ۚ᩷;->᩸:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const/4 v1, 0x0

    .line 264
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 265
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    .line 266
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xb4

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    .line 269
    :cond_1
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    return-void
.end method

.method private ᩻()F
    .locals 2

    .line 157
    iget-object v0, p0, Ll/᩶ۚ᩷;->ۗ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget-object v1, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    iget v1, v1, Ll/ۧ۬;->ᩳ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Ll/᩶ۚ᩷;->ܰ:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 199
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->۟:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 202
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_c

    if-eq p1, v1, :cond_9

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_1

    goto :goto_0

    .line 212
    :cond_1
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    .line 213
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    return v0

    .line 216
    :cond_2
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    if-eqz p1, :cond_8

    .line 217
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v2, p0, Ll/᩶ۚ᩷;->۫:F

    sub-float/2addr p1, v2

    .line 218
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, p0, Ll/᩶ۚ᩷;->ۤ:F

    sub-float/2addr v2, v3

    .line 219
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Ll/᩶ۚ᩷;->ۡ֫:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v4

    if-lez v3, :cond_4

    .line 220
    :cond_3
    iput-boolean v1, p0, Ll/᩶ۚ᩷;->ܽ֫:Z

    .line 222
    :cond_4
    iget-boolean v3, p0, Ll/᩶ۚ᩷;->ܽ֫:Z

    if-eqz v3, :cond_8

    iget-boolean v3, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    if-nez v3, :cond_5

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, v2, p1

    if-lez p1, :cond_8

    .line 223
    :cond_5
    iput-boolean v1, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    .line 224
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v2, p0, Ll/᩶ۚ᩷;->۬:F

    sub-float/2addr p1, v2

    .line 225
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v2, v2, v4

    if-lez v2, :cond_7

    .line 226
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    iput p2, p0, Ll/᩶ۚ᩷;->۬:F

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-lez p1, :cond_6

    .line 228
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩷()V

    return v0

    .line 230
    :cond_6
    invoke-direct {p0, v1}, Ll/᩶ۚ᩷;->ۧ(Z)V

    return v0

    .line 232
    :cond_7
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-eqz p1, :cond_8

    .line 233
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    :cond_8
    :goto_0
    return v0

    .line 239
    :cond_9
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    if-eqz p1, :cond_a

    iget-boolean p1, p0, Ll/᩶ۚ᩷;->ܽ֫:Z

    if-nez p1, :cond_a

    .line 240
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide p1

    sub-long/2addr v1, p1

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long p1, p1

    cmp-long v3, v1, p1

    if-gez v3, :cond_a

    .line 241
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩷()V

    goto :goto_1

    .line 242
    :cond_a
    iget-boolean p1, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-eqz p1, :cond_b

    .line 243
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    .line 245
    :cond_b
    :goto_1
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    return v0

    .line 204
    :cond_c
    iput-boolean v1, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    .line 205
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ܽ֫:Z

    .line 206
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    .line 207
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->۫:F

    .line 208
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/᩶ۚ᩷;->۬:F

    iput p1, p0, Ll/᩶ۚ᩷;->ۤ:F

    return v0
.end method

.method public final ֫()V
    .locals 1

    .line 253
    iget-boolean v0, p0, Ll/᩶ۚ᩷;->۟:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ۚ᩷;->᩷֫:Z

    if-eqz v0, :cond_0

    .line 254
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۜ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧ۬;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/᩶ۚ᩷;->ۢ֫:Ll/ۧ۬;

    .line 68
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ۧ()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 185
    invoke-direct {p0}, Ll/᩶ۚ᩷;->ܽ()V

    .line 186
    iput-boolean p1, p0, Ll/᩶ۚ᩷;->۟:Z

    const/4 v0, 0x0

    .line 187
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ܺ֫:Z

    .line 188
    iput-boolean v0, p0, Ll/᩶ۚ᩷;->ۜ֫:Z

    if-eqz p1, :cond_0

    .line 190
    invoke-direct {p0}, Ll/᩶ۚ᩷;->᩷()V

    return-void

    .line 192
    :cond_0
    invoke-direct {p0, v0}, Ll/᩶ۚ᩷;->ۧ(Z)V

    return-void
.end method
