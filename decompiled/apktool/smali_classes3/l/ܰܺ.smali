.class public abstract Ll/ܰܺ;
.super Ljava/lang/Object;
.source "44YF"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final ۗ:F

.field public final ۙ:I

.field public ۛ:Ljava/lang/Runnable;

.field public final ۤ:[I

.field public final ۫:I

.field public final ۬:Landroid/view/View;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 65
    iput-object v1, p0, Ll/ܰܺ;->ۤ:[I

    .line 68
    iput-object p1, p0, Ll/ܰܺ;->۬:Landroid/view/View;

    const/4 v1, 0x1

    .line 69
    invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 70
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Ll/ܰܺ;->ۗ:F

    .line 73
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result p1

    iput p1, p0, Ll/ܰܺ;->۫:I

    .line 76
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    add-int/2addr v1, p1

    div-int/2addr v1, v0

    iput v1, p0, Ll/ܰܺ;->ۙ:I

    return-void
.end method

.method private ܿ()V
    .locals 2

    .line 215
    iget-object v0, p0, Ll/ܰܺ;->ۛ:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/ܰܺ;->۬:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 219
    :cond_0
    iget-object v0, p0, Ll/ܰܺ;->᩹:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 220
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 93
    iget-boolean p1, p0, Ll/ܰܺ;->᩶:Z

    const/4 v0, 0x3

    .line 95
    iget-object v1, p0, Ll/ܰܺ;->۬:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_5

    .line 259
    invoke-virtual {p0}, Ll/ܰܺ;->֫()Ll/ۢ᩷;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 260
    invoke-interface {v4}, Ll/ۢ᩷;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 264
    :cond_0
    invoke-interface {v4}, Ll/ۢ᩷;->ᩳ()Landroid/widget/ListView;

    move-result-object v4

    check-cast v4, Ll/۫ܺ;

    if-eqz v4, :cond_3

    .line 265
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 270
    :cond_1
    invoke-static {p2}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v5

    .line 309
    iget-object v6, p0, Ll/ܰܺ;->ۤ:[I

    invoke-virtual {v1, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 310
    aget v1, v6, v2

    int-to-float v1, v1

    aget v7, v6, v3

    int-to-float v7, v7

    invoke-virtual {v5, v1, v7}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 298
    invoke-virtual {v4, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 299
    aget v1, v6, v2

    neg-int v1, v1

    int-to-float v1, v1

    aget v6, v6, v3

    neg-int v6, v6

    int-to-float v6, v6

    invoke-virtual {v5, v1, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 275
    iget v1, p0, Ll/ܰܺ;->᩸:I

    invoke-virtual {v4, v5, v1}, Ll/۫ܺ;->֫(Landroid/view/MotionEvent;I)Z

    move-result v1

    .line 276
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    .line 279
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-eq p2, v3, :cond_2

    if-eq p2, v0, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz v1, :cond_3

    if-eqz p2, :cond_3

    goto :goto_2

    .line 96
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll/ܰܺ;->ܽ()Z

    move-result p2

    if-nez p2, :cond_4

    :goto_2
    const/4 p2, 0x1

    goto/16 :goto_5

    :cond_4
    const/4 p2, 0x0

    goto/16 :goto_5

    .line 170
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_3

    .line 174
    :cond_6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-eqz v4, :cond_a

    if-eq v4, v3, :cond_9

    const/4 v5, 0x2

    if-eq v4, v5, :cond_7

    if-eq v4, v0, :cond_9

    goto/16 :goto_3

    .line 190
    :cond_7
    iget v0, p0, Ll/ܰܺ;->᩸:I

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_d

    .line 192
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    .line 193
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    .line 287
    iget v0, p0, Ll/ܰܺ;->ۗ:F

    neg-float v5, v0

    cmpl-float v6, v4, v5

    if-ltz v6, :cond_8

    cmpl-float v5, p2, v5

    if-ltz v5, :cond_8

    .line 288
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v5, v0

    cmpg-float v4, v4, v5

    if-gez v4, :cond_8

    .line 289
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    add-float/2addr v4, v0

    cmpg-float p2, p2, v4

    if-gez p2, :cond_8

    goto :goto_3

    .line 197
    :cond_8
    invoke-direct {p0}, Ll/ܰܺ;->ܿ()V

    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    invoke-interface {p2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 98
    invoke-virtual {p0}, Ll/ܰܺ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_d

    const/4 p2, 0x1

    goto :goto_4

    .line 207
    :cond_9
    invoke-direct {p0}, Ll/ܰܺ;->ܿ()V

    goto :goto_3

    .line 177
    :cond_a
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p2

    iput p2, p0, Ll/ܰܺ;->᩸:I

    .line 179
    iget-object p2, p0, Ll/ܰܺ;->᩹:Ljava/lang/Runnable;

    if-nez p2, :cond_b

    .line 180
    new-instance p2, Ll/ۨܺ;

    invoke-direct {p2, p0}, Ll/ۨܺ;-><init>(Ll/ܰܺ;)V

    iput-object p2, p0, Ll/ܰܺ;->᩹:Ljava/lang/Runnable;

    .line 182
    :cond_b
    iget-object p2, p0, Ll/ܰܺ;->᩹:Ljava/lang/Runnable;

    iget v0, p0, Ll/ܰܺ;->۫:I

    int-to-long v4, v0

    invoke-virtual {v1, p2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 184
    iget-object p2, p0, Ll/ܰܺ;->ۛ:Ljava/lang/Runnable;

    if-nez p2, :cond_c

    .line 185
    new-instance p2, Ll/᩺ܺ;

    invoke-direct {p2, p0}, Ll/᩺ܺ;-><init>(Ll/ܰܺ;)V

    iput-object p2, p0, Ll/ܰܺ;->ۛ:Ljava/lang/Runnable;

    .line 187
    :cond_c
    iget-object p2, p0, Ll/ܰܺ;->ۛ:Ljava/lang/Runnable;

    iget v0, p0, Ll/ܰܺ;->ۙ:I

    int-to-long v4, v0

    invoke-virtual {v1, p2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_d
    :goto_3
    const/4 p2, 0x0

    :goto_4
    if-eqz p2, :cond_e

    .line 102
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-wide v4, v6

    .line 103
    invoke-static/range {v4 .. v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 105
    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 106
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 110
    :cond_e
    :goto_5
    iput-boolean p2, p0, Ll/ܰܺ;->᩶:Z

    if-nez p2, :cond_10

    if-eqz p1, :cond_f

    goto :goto_6

    :cond_f
    return v2

    :cond_10
    :goto_6
    return v3
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const/4 p1, 0x0

    .line 120
    iput-boolean p1, p0, Ll/ܰܺ;->᩶:Z

    const/4 p1, -0x1

    .line 121
    iput p1, p0, Ll/ܰܺ;->᩸:I

    .line 123
    iget-object p1, p0, Ll/ܰܺ;->᩹:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    .line 124
    iget-object v0, p0, Ll/ܰܺ;->۬:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public abstract ֫()Ll/ۢ᩷;
.end method

.method public abstract ۧ()Z
.end method

.method public ܽ()Z
    .locals 2

    .line 155
    invoke-virtual {p0}, Ll/ܰܺ;->֫()Ll/ۢ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    invoke-interface {v0}, Ll/ۢ᩷;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    invoke-interface {v0}, Ll/ۢ᩷;->dismiss()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()V
    .locals 11

    .line 225
    invoke-direct {p0}, Ll/ܰܺ;->ܿ()V

    .line 228
    iget-object v0, p0, Ll/ܰܺ;->۬:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isLongClickable()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {p0}, Ll/ܰܺ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 239
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 242
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-wide v3, v5

    .line 243
    invoke-static/range {v3 .. v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 245
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 247
    iput-boolean v2, p0, Ll/ܰܺ;->᩶:Z

    :cond_2
    :goto_0
    return-void
.end method
