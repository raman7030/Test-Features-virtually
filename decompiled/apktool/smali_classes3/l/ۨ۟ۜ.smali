.class public final Ll/ۨ۟ۜ;
.super Ljava/lang/Object;
.source "59KW"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/ܰ۟ۜ;

.field public ᩶:I

.field public ᩸:J

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܰ۟ۜ;I)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ۟ۜ;->ۙ:Ll/ܰ۟ۜ;

    iput p2, p0, Ll/ۨ۟ۜ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 123
    iget-object p1, p0, Ll/ۨ۟ۜ;->ۙ:Ll/ܰ۟ۜ;

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p3, v0

    float-to-int p3, p3

    add-int/2addr p2, p3

    .line 124
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p3

    add-float/2addr p4, v0

    float-to-int p4, p4

    add-int/2addr p3, p4

    .line 125
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->scrollTo(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 131
    iget-wide v0, p0, Ll/ۨ۟ۜ;->᩸:J

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/ۨ۟ۜ;->ۙ:Ll/ܰ۟ۜ;

    const-wide/16 v6, 0x0

    cmp-long v8, v0, v6

    if-eqz v8, :cond_1

    .line 132
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iget-wide v8, p0, Ll/ۨ۟ۜ;->᩸:J

    sub-long/2addr v0, v8

    const-wide/16 v8, 0x28

    cmp-long v10, v0, v8

    if-ltz v10, :cond_1

    const-wide/16 v8, 0x12c

    cmp-long v10, v0, v8

    if-gtz v10, :cond_1

    .line 134
    iget v0, p0, Ll/ۨ۟ۜ;->᩹:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v0, v1

    .line 135
    iget v1, p0, Ll/ۨ۟ۜ;->᩶:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    float-to-int v8, v8

    sub-int/2addr v1, v8

    mul-int v0, v0, v0

    mul-int v1, v1, v1

    add-int/2addr v1, v0

    .line 136
    iget v0, p0, Ll/ۨ۟ۜ;->ۗ:I

    if-ge v1, v0, :cond_1

    .line 137
    iput-wide v6, p0, Ll/ۨ۟ۜ;->᩸:J

    .line 183
    invoke-static {v5}, Ll/ܰ۟ۜ;->ܺ(Ll/ܰ۟ۜ;)F

    move-result p1

    .line 184
    invoke-virtual {v5}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 185
    invoke-virtual {v5}, Landroid/view/View;->getScrollY()I

    move-result v1

    .line 186
    invoke-static {v5}, Ll/ܰ۟ۜ;->ۜ(Ll/ܰ۟ۜ;)F

    move-result v6

    cmpl-float v6, v6, p1

    if-nez v6, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 189
    :cond_0
    invoke-static {v5}, Ll/ܰ۟ۜ;->ۜ(Ll/ܰ۟ۜ;)F

    move-result v5

    new-array v2, v2, [F

    aput v5, v2, v3

    aput p1, v2, v4

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 190
    new-instance v2, Ll/ۛ۟ۜ;

    invoke-direct {v2, p0, v0, v1}, Ll/ۛ۟ۜ;-><init>(Ll/ۨ۟ۜ;II)V

    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 196
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return v4

    .line 143
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ۟ۜ;->᩸:J

    .line 144
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Ll/ۨ۟ۜ;->᩹:I

    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Ll/ۨ۟ۜ;->᩶:I

    .line 146
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 147
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 148
    invoke-static {v5}, Ll/ܰ۟ۜ;->᩻(Ll/ܰ۟ۜ;)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5}, Ll/ܰ۟ۜ;->ۜ(Ll/ܰ۟ۜ;)F

    move-result v7

    mul-float v6, v6, v7

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v6, v7

    float-to-int v6, v6

    .line 149
    invoke-static {v5}, Ll/ܰ۟ۜ;->ܳ(Ll/ܰ۟ۜ;)I

    move-result v8

    int-to-float v8, v8

    invoke-static {v5}, Ll/ܰ۟ۜ;->ۜ(Ll/ܰ۟ۜ;)F

    move-result v9

    mul-float v8, v8, v9

    add-float/2addr v8, v7

    float-to-int v7, v8

    .line 150
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v8

    invoke-virtual {v5}, Landroid/view/View;->getScrollX()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v8, v9

    sub-int/2addr v0, v6

    int-to-float v0, v0

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v0, v9

    sub-float/2addr v8, v0

    .line 151
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v5}, Landroid/view/View;->getScrollY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    sub-int/2addr v1, v7

    int-to-float v0, v1

    div-float/2addr v0, v9

    sub-float/2addr p1, v0

    .line 152
    invoke-static {v5}, Ll/ܰ۟ۜ;->᩷(Ll/ܰ۟ۜ;)I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    cmpg-float v0, v8, v0

    if-ltz v0, :cond_3

    invoke-static {v5}, Ll/ܰ۟ۜ;->᩷(Ll/ܰ۟ۜ;)I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_3

    invoke-static {v5}, Ll/ܰ۟ۜ;->᩷(Ll/ܰ۟ۜ;)I

    move-result v0

    add-int/2addr v6, v0

    int-to-float v0, v6

    cmpl-float v0, v8, v0

    if-gtz v0, :cond_3

    invoke-static {v5}, Ll/ܰ۟ۜ;->᩷(Ll/ܰ۟ۜ;)I

    move-result v0

    add-int/2addr v7, v0

    int-to-float v0, v7

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 153
    :goto_1
    new-instance v1, Ll/ۗ۟ۜ;

    invoke-static {v5}, Ll/ܰ۟ۜ;->ۜ(Ll/ܰ۟ۜ;)F

    move-result v6

    invoke-static {v5}, Ll/ܰ۟ۜ;->᩷(Ll/ܰ۟ۜ;)I

    move-result v7

    invoke-direct {v1, v6, v7}, Ll/ۗ۟ۜ;-><init>(FI)V

    .line 154
    invoke-static {v5}, Ll/ܰ۟ۜ;->ܿ(Ll/ܰ۟ۜ;)I

    move-result v6

    if-eqz v6, :cond_6

    if-eq v6, v4, :cond_5

    if-eq v6, v2, :cond_4

    goto :goto_4

    .line 167
    :cond_4
    invoke-static {v5}, Ll/ܰ۟ۜ;->ܽ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 169
    invoke-static {v5}, Ll/ܰ۟ۜ;->ܽ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    .line 170
    invoke-static {v5}, Ll/ܰ۟ۜ;->ᩳ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    goto :goto_4

    .line 160
    :cond_5
    invoke-static {v5}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 162
    invoke-static {v5}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    .line 163
    invoke-static {v5}, Ll/ܰ۟ۜ;->ۧ(Ll/ܰ۟ۜ;)Ll/۬۟ۜ;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    goto :goto_4

    .line 156
    :cond_6
    invoke-static {v5}, Ll/ܰ۟ۜ;->ۢ(Ll/ܰ۟ۜ;)Ljava/util/List;

    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ۟ۜ;

    .line 19
    invoke-virtual {v1, v6, v8}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    goto :goto_2

    .line 157
    :cond_7
    invoke-static {v5}, Ll/ܰ۟ۜ;->ۡ(Ll/ܰ۟ۜ;)Ljava/util/List;

    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ۟ۜ;

    .line 19
    invoke-virtual {v1, v6, p1}, Ll/ۗ۟ۜ;->֫(Ll/ۙ۟ۜ;F)V

    goto :goto_3

    .line 174
    :cond_8
    :goto_4
    invoke-virtual {v1}, Ll/ۗ۟ۜ;->֫()Ll/ۙ۟ۜ;

    move-result-object p1

    check-cast p1, Ll/۬۟ۜ;

    .line 175
    invoke-static {v5, p1}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;Ll/ۙ۟ۜ;)V

    .line 176
    invoke-static {v5, p1}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;Ll/۬۟ۜ;)V

    if-nez p1, :cond_9

    if-nez v0, :cond_a

    :cond_9
    const/4 v3, 0x1

    .line 177
    :cond_a
    invoke-static {v5, v3}, Ll/ܰ۟ۜ;->֫(Ll/ܰ۟ۜ;Z)V

    .line 178
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    return v4
.end method
