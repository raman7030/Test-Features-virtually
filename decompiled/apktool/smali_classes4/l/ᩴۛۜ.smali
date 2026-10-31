.class public final Ll/ᩴۛۜ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "B6LA"


# instance fields
.field public final synthetic ᩸:Ll/ۚۛۜ;


# direct methods
.method public constructor <init>(Ll/ۚۛۜ;)V
    .locals 0

    .line 74
    iput-object p1, p0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 108
    iget-object v0, p0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-static {v0}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v1

    invoke-static {v0}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v2

    const v3, 0x3f8147ae    # 1.01f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v2, 0x40000000    # 2.0f

    .line 109
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v4, 0x2

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v1, v4, v5

    const/4 v1, 0x1

    aput v2, v4, v1

    .line 110
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۚۛۜ;->֫(Ll/ۚۛۜ;Landroid/animation/ValueAnimator;)V

    .line 111
    invoke-static {v0}, Ll/ۚۛۜ;->ۖ(Ll/ۚۛۜ;)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v4, 0xb4

    invoke-virtual {v2, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 112
    invoke-static {v0}, Ll/ۚۛۜ;->ۖ(Ll/ۚۛۜ;)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v4, Ll/ۘۛۜ;

    invoke-direct {v4, p0, v3, p1}, Ll/ۘۛۜ;-><init>(Ll/ᩴۛۜ;FF)V

    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 113
    invoke-static {v0}, Ll/ۚۛۜ;->ۖ(Ll/ۚۛۜ;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return v1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 11

    .line 81
    iget-object p1, p0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-static {p1}, Ll/ۚۛۜ;->ܿ(Ll/ۚۛۜ;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 82
    :cond_0
    invoke-static {p1}, Ll/ۚۛۜ;->ᩴ(Ll/ۚۛۜ;)V

    invoke-static {p1}, Ll/ۚۛۜ;->ۘ(Ll/ۚۛۜ;)V

    .line 84
    invoke-static {p1}, Ll/ۚۛۜ;->ۢ(Ll/ۚۛۜ;)Landroid/widget/OverScroller;

    move-result-object v1

    float-to-int v4, p3

    neg-float p2, p4

    float-to-int v5, p2

    const p2, -0x1fffffff

    int-to-float p2, p2

    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-static {p1}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v2

    sub-float/2addr p4, v2

    mul-float p4, p4, p3

    invoke-static {p1}, Ll/ۚۛۜ;->ۡ(Ll/ۚۛۜ;)F

    move-result p3

    sub-float/2addr p4, p3

    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    move-result p2

    float-to-int v6, p2

    invoke-static {p1}, Ll/ۚۛۜ;->ۡ(Ll/ۚۛۜ;)F

    move-result p2

    neg-float p2, p2

    float-to-int v7, p2

    const p2, 0x1fffffff

    int-to-double p2, p2

    invoke-static {p1}, Ll/ۚۛۜ;->᩷(Ll/ۚۛۜ;)D

    move-result-wide v2

    .line 86
    invoke-static {p1}, Ll/ۚۛۜ;->֡(Ll/ۚۛۜ;)D

    move-result-wide v8

    sub-double/2addr v2, v8

    invoke-static {p1}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result p4

    float-to-double v8, p4

    mul-double v2, v2, v8

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    neg-double v2, v2

    double-to-int v8, v2

    invoke-static {p1}, Ll/ۚۛۜ;->᩵(Ll/ۚۛۜ;)D

    move-result-wide v2

    invoke-static {p1}, Ll/ۚۛۜ;->᩷(Ll/ۚۛۜ;)D

    move-result-wide v9

    sub-double/2addr v2, v9

    invoke-static {p1}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result p4

    float-to-double v9, p4

    mul-double v2, v2, v9

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    double-to-int v9, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 84
    invoke-virtual/range {v1 .. v9}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 87
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    return v0
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .line 77
    iget-object p1, p0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-static {p1}, Ll/ۚۛۜ;->ۜ(Ll/ۚۛۜ;)Landroid/view/ScaleGestureDetector;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p2

    if-ne p2, v1, :cond_0

    neg-float p2, p3

    neg-float p3, p4

    invoke-static {p1, p2, p3}, Ll/ۚۛۜ;->֫(Ll/ۚۛۜ;FF)V

    :cond_0
    return v1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 91
    iget-object v0, p0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-static {v0}, Ll/ۚۛۜ;->ܽ(Ll/ۚۛۜ;)Ll/ۡۛۜ;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/ۚۛۜ;->ۧ(Ll/ۚۛۜ;)Ll/ۙۛۜ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 92
    invoke-static {v0}, Ll/ۚۛۜ;->ܳ(Ll/ۚۛۜ;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-static {v0}, Ll/ۚۛۜ;->ܽ(Ll/ۚۛۜ;)Ll/ۡۛۜ;

    move-result-object v3

    invoke-static {v0}, Ll/ۚۛۜ;->᩷(Ll/ۚۛۜ;)D

    move-result-wide v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    invoke-static {v0}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v7

    div-float/2addr v6, v7

    float-to-double v6, v6

    add-double/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ll/ۡۛۜ;->֫(D)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۛۜ;

    if-eqz v1, :cond_0

    .line 93
    iget v3, v1, Ll/֡ۛۜ;->ܿ:I

    invoke-static {v0}, Ll/ۚۛۜ;->ۧ(Ll/ۚۛۜ;)Ll/ۙۛۜ;

    move-result-object v4

    check-cast v4, Ll/᩶᩺ۜ;

    invoke-virtual {v4, v3}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 94
    invoke-static {v0}, Ll/ۚۛۜ;->ܽ(Ll/ۚۛۜ;)Ll/ۡۛۜ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ۡۛۜ;->ܳ(I)D

    move-result-wide v4

    invoke-static {v0}, Ll/ۚۛۜ;->᩷(Ll/ۚۛۜ;)D

    move-result-wide v6

    sub-double/2addr v4, v6

    invoke-static {v0}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v6

    float-to-double v6, v6

    mul-double v4, v4, v6

    double-to-float v4, v4

    .line 95
    invoke-static {v0}, Ll/ۚۛۜ;->ܽ(Ll/ۚۛۜ;)Ll/ۡۛۜ;

    move-result-object v5

    invoke-virtual {v5, v3}, Ll/ۡۛۜ;->ܽ(I)D

    move-result-wide v5

    invoke-static {v0}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v7

    float-to-double v7, v7

    mul-double v5, v5, v7

    double-to-float v5, v5

    add-float/2addr v5, v4

    const/4 v6, 0x0

    .line 96
    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    add-float/2addr v5, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v5, v4

    .line 97
    invoke-static {v0}, Ll/ۚۛۜ;->᩻(Ll/ۚۛۜ;)Ll/ܰۨۜ;

    move-result-object v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v8, v4

    invoke-virtual {v6, v7, p1, v8, v5}, Ll/ܰۨۜ;->֫(FFFF)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 98
    invoke-static {v0}, Ll/ۚۛۜ;->ᩳ(Ll/ۚۛۜ;)Ll/ۗۛۜ;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Ll/ۚۛۜ;->ᩳ(Ll/ۚۛۜ;)Ll/ۗۛۜ;

    move-result-object p1

    invoke-interface {p1, v3}, Ll/ۗۛۜ;->ۧ(I)V

    return v2

    :cond_0
    if-eqz v1, :cond_1

    .line 102
    iget p1, v1, Ll/֡ۛۜ;->ܿ:I

    invoke-static {v0}, Ll/ۚۛۜ;->ۧ(Ll/ۚۛۜ;)Ll/ۙۛۜ;

    move-result-object v3

    check-cast v3, Ll/᩶᩺ۜ;

    invoke-virtual {v3, p1}, Ll/᩶᩺ۜ;->ܽ(I)Z

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v1, v1, Ll/֡ۛۜ;->֫:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ll/ۚۛۜ;->ۧ(I)Z

    return v2

    .line 104
    :cond_1
    invoke-static {v0}, Ll/ۚۛۜ;->ᩳ(Ll/ۚۛۜ;)Ll/ۗۛۜ;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Ll/ۚۛۜ;->ᩳ(Ll/ۚۛۜ;)Ll/ۗۛۜ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۗۛۜ;->֫()V

    :cond_2
    return v2
.end method
