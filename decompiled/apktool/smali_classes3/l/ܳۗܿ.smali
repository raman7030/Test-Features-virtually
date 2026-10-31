.class public final Ll/ܳۗܿ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "E14L"


# instance fields
.field public final synthetic ᩸:Ll/ۜۗܿ;


# direct methods
.method public constructor <init>(Ll/ۜۗܿ;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 165
    iget-object v0, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-static {v0}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    .line 169
    :cond_0
    invoke-static {v0}, Ll/ۜۗܿ;->᩻(Ll/ۜۗܿ;)F

    move-result v1

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1

    goto :goto_0

    .line 171
    :cond_1
    invoke-static {v0}, Ll/ۜۗܿ;->᩻(Ll/ۜۗܿ;)F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    const v3, 0x3e4ccccd    # 0.2f

    .line 176
    :goto_0
    invoke-static {v0}, Ll/ۜۗܿ;->᩻(Ll/ۜۗܿ;)F

    move-result v0

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v4, 0x0

    aput v0, v1, v4

    aput v3, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v3, 0xc8

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 177
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 178
    new-instance v3, Ll/ܿۗܿ;

    invoke-direct {v3, p0, v1, p1}, Ll/ܿۗܿ;-><init>(Ll/ܳۗܿ;Landroid/graphics/PointF;Landroid/view/MotionEvent;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 188
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return v2
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 10

    .line 125
    iget-object p1, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-static {p1}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object p2

    const/4 v0, 0x1

    if-nez p2, :cond_0

    return v0

    .line 128
    :cond_0
    invoke-static {p1}, Ll/ۜۗܿ;->ᩳ(Ll/ۜۗܿ;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v3

    neg-float p2, p3

    float-to-int v4, p2

    neg-float p2, p4

    float-to-int v5, p2

    .line 129
    invoke-static {p1}, Ll/ۜۗܿ;->᩷(Ll/ۜۗܿ;)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {p1}, Ll/ۜۗܿ;->ۢ(Ll/ۜۗܿ;)I

    move-result v9

    const/4 v6, 0x0

    .line 128
    invoke-virtual/range {v1 .. v9}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 6

    .line 148
    iget-object v0, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-static {v0}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 151
    :cond_0
    invoke-static {v0}, Ll/ۜۗܿ;->ܳ(Ll/ۜۗܿ;)Ll/᩻ۗܿ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 153
    new-instance v2, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 154
    invoke-static {v0, v2}, Ll/ۜۗܿ;->ۧ(Ll/ۜۗܿ;Landroid/graphics/PointF;)V

    .line 155
    invoke-static {v0}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ܽۗܿ;->֫(Landroid/graphics/PointF;)Ll/۟ۙܿ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 156
    iget-object v3, v2, Ll/۟ۙܿ;->ᩳ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget v2, v2, Ll/۟ۙܿ;->ܳ:I

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, -0x1

    .line 157
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    check-cast v1, Ll/ۧ᩻ۢ;

    iget-object v1, v1, Ll/ۧ᩻ۢ;->֫:Ll/ܺ᩻ۢ;

    invoke-static {v1, v2, v3, p1}, Ll/ܺ᩻ۢ;->֫(Ll/ܺ᩻ۢ;IFF)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 158
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_3
    :goto_2
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .line 81
    iget-object p1, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, p3

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 82
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, p4

    add-float/2addr v2, v1

    float-to-int v1, v2

    .line 83
    invoke-static {p1}, Ll/ۜۗܿ;->᩷(Ll/ۜۗܿ;)I

    move-result v2

    .line 84
    invoke-static {p1}, Ll/ۜۗܿ;->ۢ(Ll/ۜۗܿ;)I

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-gez v0, :cond_1

    if-eqz p2, :cond_0

    .line 88
    invoke-static {p1}, Ll/ۜۗܿ;->ۧ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object v0

    neg-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr p3, v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v2, v5

    sub-float v2, v4, v2

    invoke-static {v0, p3, v2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 89
    sget p3, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 90
    invoke-static {p1}, Ll/ۜۗܿ;->ܽ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p3

    if-nez p3, :cond_0

    .line 91
    invoke-static {p1}, Ll/ۜۗܿ;->ܽ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    if-le v0, v2, :cond_3

    if-eqz p2, :cond_2

    .line 96
    invoke-static {p1}, Ll/ۜۗܿ;->ܽ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr p3, v5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-static {v0, p3, v5}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 97
    sget p3, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 98
    invoke-static {p1}, Ll/ۜۗܿ;->ۧ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p3

    if-nez p3, :cond_2

    .line 99
    invoke-static {p1}, Ll/ۜۗܿ;->ۧ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_2
    move v0, v2

    :cond_3
    :goto_0
    if-gez v1, :cond_5

    if-eqz p2, :cond_4

    .line 105
    invoke-static {p1}, Ll/ۜۗܿ;->ܿ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    neg-float p4, p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p4, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p2, v1

    invoke-static {p3, p4, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 106
    sget p2, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 107
    invoke-static {p1}, Ll/ۜۗܿ;->֫(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_4

    .line 108
    invoke-static {p1}, Ll/ۜۗܿ;->֫(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_4
    const/4 v1, 0x0

    goto :goto_1

    :cond_5
    if-le v1, v3, :cond_7

    if-eqz p2, :cond_6

    .line 113
    invoke-static {p1}, Ll/ۜۗܿ;->֫(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p4, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p2, v1

    sub-float/2addr v4, p2

    invoke-static {p3, p4, v4}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 114
    sget p2, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 115
    invoke-static {p1}, Ll/ۜۗܿ;->ܿ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_6

    .line 116
    invoke-static {p1}, Ll/ۜۗܿ;->ܿ(Ll/ۜۗܿ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_6
    move v1, v3

    .line 119
    :cond_7
    :goto_1
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->scrollTo(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 136
    iget-object v0, p0, Ll/ܳۗܿ;->᩸:Ll/ۜۗܿ;

    invoke-static {v0}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    .line 139
    :cond_0
    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr p1, v4

    invoke-direct {v1, v3, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 140
    invoke-static {v0, v1}, Ll/ۜۗܿ;->ۧ(Ll/ۜۗܿ;Landroid/graphics/PointF;)V

    .line 141
    invoke-static {v0}, Ll/ۜۗܿ;->ۜ(Ll/ۜۗܿ;)Ll/ܽۗܿ;

    move-result-object p1

    .line 446
    invoke-virtual {p1, v1}, Ll/ܽۗܿ;->֫(Landroid/graphics/PointF;)Ll/۟ۙܿ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 448
    iget v1, v1, Ll/۟ۙܿ;->ܳ:I

    iput v1, p1, Ll/ܽۗܿ;->ܳ:I

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    .line 450
    iput v1, p1, Ll/ܽۗܿ;->ܳ:I

    .line 142
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v2
.end method
