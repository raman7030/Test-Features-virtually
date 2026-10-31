.class public Ll/ᩴۢۡ;
.super Ll/ۨۢۡ;
.source "U713"


# instance fields
.field public final ۗ:Landroid/graphics/Paint;

.field public ۙ:F

.field public ۛ:J

.field public final ۟:I

.field public ۤ:Z

.field public final ۨ:Ll/ۘۢۡ;

.field public ۫:Z

.field public ۬:Z

.field public final ܰ:F

.field public final ᩶:Ll/ܳ᩸ۡ;

.field public ᩸:F

.field public ᩹:F

.field public final ᩺:F


# direct methods
.method public constructor <init>(Ll/֨ۚ᩷;)V
    .locals 2

    .line 43
    invoke-direct {p0, p1}, Ll/ۨۢۡ;-><init>(Landroid/content/Context;)V

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ᩴۢۡ;->ۗ:Landroid/graphics/Paint;

    .line 25
    new-instance v0, Ll/ܳ᩸ۡ;

    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Ll/ܳ᩸ۡ;-><init>(I)V

    .line 25
    iput-object v0, p0, Ll/ᩴۢۡ;->᩶:Ll/ܳ᩸ۡ;

    .line 26
    new-instance v0, Ll/ۘۢۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۘۢۡ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ᩴۢۡ;->ۨ:Ll/ۘۢۡ;

    const-wide/16 v0, -0x1

    .line 31
    iput-wide v0, p0, Ll/ᩴۢۡ;->ۛ:J

    .line 44
    invoke-virtual {p1}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41000000    # 8.0f

    mul-float v1, v1, v0

    .line 45
    iput v1, p0, Ll/ᩴۢۡ;->ܰ:F

    const/high16 v1, 0x42400000    # 48.0f

    mul-float v0, v0, v1

    .line 46
    iput v0, p0, Ll/ᩴۢۡ;->᩺:F

    .line 47
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ᩴۢۡ;->۟:I

    const/4 p1, 0x0

    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method private ֫(J)F
    .locals 6

    .line 128
    iget-boolean v0, p0, Ll/ᩴۢۡ;->۫:Z

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    iget-wide v2, p0, Ll/ᩴۢۡ;->ۛ:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    sub-long/2addr p1, v2

    cmp-long v0, p1, v4

    if-ltz v0, :cond_4

    const-wide/16 v2, 0x708

    cmp-long v0, p1, v2

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v2, 0x5dc

    cmp-long v0, p1, v2

    if-gtz v0, :cond_3

    :goto_0
    return v1

    :cond_3
    sub-long/2addr p1, v2

    long-to-float p1, p1

    const/high16 p2, 0x43960000    # 300.0f

    div-float/2addr p1, p2

    sub-float/2addr v1, p1

    return v1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method private ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 179
    iput-boolean v0, p0, Ll/ᩴۢۡ;->۬:Z

    const/4 v0, 0x1

    .line 180
    iput-boolean v0, p0, Ll/ᩴۢۡ;->۫:Z

    .line 181
    iget-object v1, p0, Ll/ᩴۢۡ;->᩶:Ll/ܳ᩸ۡ;

    iget v1, v1, Ll/ܳ᩸ۡ;->ܿ:F

    iget v2, p0, Ll/ᩴۢۡ;->᩹:F

    sub-float/2addr v1, v2

    iput v1, p0, Ll/ᩴۢۡ;->ۙ:F

    .line 182
    iget-object v1, p0, Ll/ᩴۢۡ;->ۨ:Ll/ۘۢۡ;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 186
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private ֫(F)V
    .locals 4

    .line 193
    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollRange()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    move-result v1

    sub-int/2addr v0, v1

    .line 194
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ll/ᩴۢۡ;->᩺:F

    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    sub-float/2addr v1, v2

    if-lez v0, :cond_1

    const/4 v2, 0x0

    cmpg-float v3, v1, v2

    if-gtz v3, :cond_0

    goto :goto_0

    .line 198
    :cond_0
    iget v3, p0, Ll/ᩴۢۡ;->ۙ:F

    add-float/2addr p1, v3

    div-float/2addr p1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    .line 199
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 200
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v0, v0

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollTo(II)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    .line 73
    invoke-super/range {p0 .. p1}, Landroid/webkit/WebView;->draw(Landroid/graphics/Canvas;)V

    .line 81
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->computeVerticalScrollRange()I

    move-result v1

    .line 82
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    move-result v2

    sub-int v3, v1, v2

    .line 84
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 85
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 86
    iget-object v6, v0, Ll/ᩴۢۡ;->᩶:Ll/ܳ᩸ۡ;

    const/4 v7, 0x0

    if-lez v4, :cond_1

    if-lez v5, :cond_1

    if-lez v3, :cond_1

    if-lez v2, :cond_1

    iget-boolean v8, v0, Ll/ᩴۢۡ;->۫:Z

    if-nez v8, :cond_0

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x40600000    # 3.5f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 93
    invoke-direct {v0, v1, v2}, Ll/ᩴۢۡ;->֫(J)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v10, v8, v9

    if-gtz v10, :cond_2

    .line 156
    :cond_1
    :goto_0
    iput-boolean v7, v0, Ll/ᩴۢۡ;->ۤ:Z

    .line 157
    invoke-virtual {v6}, Ll/ܳ᩸ۡ;->֫()V

    return-void

    :cond_2
    const/4 v10, 0x1

    .line 98
    iput-boolean v10, v0, Ll/ᩴۢۡ;->ۤ:Z

    int-to-float v5, v5

    .line 100
    iget v10, v0, Ll/ᩴۢۡ;->᩺:F

    invoke-static {v10, v5}, Ljava/lang/Math;->min(FF)F

    move-result v10

    sub-float v11, v5, v10

    .line 102
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->computeVerticalScrollOffset()I

    move-result v12

    invoke-static {v12, v3}, Ljava/lang/Math;->min(II)I

    move-result v12

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    int-to-float v7, v7

    mul-float v11, v11, v7

    int-to-float v3, v3

    div-float v9, v11, v3

    :goto_1
    int-to-float v3, v4

    .line 104
    iget v7, v0, Ll/ᩴۢۡ;->ܰ:F

    sub-float v11, v3, v7

    add-float v12, v9, v10

    invoke-virtual {v6, v11, v9, v3, v12}, Ll/ܳ᩸ۡ;->֫(FFFF)V

    .line 107
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    add-int/2addr v3, v4

    int-to-float v3, v3

    .line 108
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    int-to-float v4, v4

    mul-float v7, v7, v8

    const/16 v6, 0x39

    int-to-float v6, v6

    mul-float v6, v6, v8

    float-to-int v6, v6

    const v11, 0x777777

    shl-int/lit8 v6, v6, 0x18

    or-int/2addr v6, v11

    .line 149
    iget-object v15, v0, Ll/ᩴۢۡ;->ۗ:Landroid/graphics/Paint;

    invoke-virtual {v15, v6}, Landroid/graphics/Paint;->setColor(I)V

    sub-float v6, v3, v7

    add-float/2addr v5, v4

    move-object/from16 v11, p1

    move v12, v6

    move v13, v4

    move v14, v3

    move-object v7, v15

    move v15, v5

    move-object/from16 v16, v7

    .line 111
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 114
    iget-boolean v5, v0, Ll/ᩴۢۡ;->۫:Z

    if-eqz v5, :cond_4

    sget v5, Ll/᩹֡᩷;->֫:I

    goto :goto_2

    :cond_4
    const v5, -0x22888889

    :goto_2
    ushr-int/lit8 v11, v5, 0x18

    and-int/lit16 v11, v11, 0xff

    int-to-float v11, v11

    mul-float v11, v11, v8

    float-to-int v8, v11

    const v11, 0xffffff

    and-int/2addr v5, v11

    shl-int/lit8 v8, v8, 0x18

    or-int/2addr v5, v8

    .line 149
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    add-float v13, v4, v9

    add-float v15, v13, v10

    move-object/from16 v11, p1

    move v12, v6

    move v14, v3

    move-object/from16 v16, v7

    .line 116
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 119
    iget-boolean v3, v0, Ll/ᩴۢۡ;->۫:Z

    if-nez v3, :cond_5

    iget-wide v3, v0, Ll/ᩴۢۡ;->ۛ:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x5dc

    cmp-long v5, v1, v3

    if-ltz v5, :cond_5

    .line 120
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_5
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 279
    iget-object v0, p0, Ll/ᩴۢۡ;->ۨ:Ll/ۘۢۡ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 280
    invoke-super {p0}, Landroid/webkit/WebView;->onDetachedFromWindow()V

    return-void
.end method

.method public onScrollChanged(IIII)V
    .locals 0

    .line 53
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    .line 61
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ᩴۢۡ;->ۛ:J

    .line 63
    iget-object p1, p0, Ll/ᩴۢۡ;->ۨ:Ll/ۘۢۡ;

    if-nez p1, :cond_0

    return-void

    .line 66
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide/16 p2, 0x5dc

    .line 67
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 219
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 220
    iget-boolean v1, p0, Ll/ᩴۢۡ;->۫:Z

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-ne v0, v2, :cond_0

    .line 222
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, p1}, Ll/ᩴۢۡ;->֫(F)V

    return v5

    :cond_0
    if-eq v0, v5, :cond_1

    if-ne v0, v3, :cond_3

    .line 226
    :cond_1
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۫:Z

    .line 61
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ᩴۢۡ;->ۛ:J

    .line 63
    iget-object p1, p0, Ll/ᩴۢۡ;->ۨ:Ll/ۘۢۡ;

    if-nez p1, :cond_2

    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide/16 v0, 0x5dc

    .line 67
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 228
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_3
    return v5

    :cond_4
    if-eqz v0, :cond_a

    if-eq v0, v5, :cond_9

    if-eq v0, v2, :cond_6

    if-eq v0, v3, :cond_9

    const/4 v1, 0x5

    if-eq v0, v1, :cond_5

    goto/16 :goto_1

    .line 267
    :cond_5
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۬:Z

    goto/16 :goto_1

    .line 250
    :cond_6
    iget-boolean v0, p0, Ll/ᩴۢۡ;->۬:Z

    if-eqz v0, :cond_c

    .line 251
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Ll/ᩴۢۡ;->᩸:F

    sub-float/2addr v0, v1

    .line 252
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Ll/ᩴۢۡ;->᩹:F

    sub-float/2addr v1, v2

    .line 253
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v8

    sub-long/2addr v6, v8

    .line 254
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    int-to-long v8, v2

    cmp-long v2, v6, v8

    if-ltz v2, :cond_7

    .line 255
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۬:Z

    goto/16 :goto_1

    .line 256
    :cond_7
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v6, p0, Ll/ᩴۢۡ;->۟:I

    int-to-float v6, v6

    cmpl-float v2, v2, v6

    if-lez v2, :cond_8

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_8

    .line 207
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 208
    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->setAction(I)V

    .line 209
    invoke-super {p0, v0}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 210
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 258
    invoke-direct {p0}, Ll/ᩴۢۡ;->֫()V

    .line 259
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, p1}, Ll/ᩴۢۡ;->֫(F)V

    return v5

    .line 261
    :cond_8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v6

    if-lez v0, :cond_c

    .line 262
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۬:Z

    goto :goto_1

    .line 271
    :cond_9
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۬:Z

    goto :goto_1

    .line 238
    :cond_a
    iput-boolean v4, p0, Ll/ᩴۢۡ;->۬:Z

    .line 164
    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    move-result v0

    .line 165
    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollRange()I

    move-result v1

    .line 166
    iget-boolean v2, p0, Ll/ᩴۢۡ;->ۤ:Z

    if-eqz v2, :cond_c

    .line 167
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Ll/ᩴۢۡ;->֫(J)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_c

    iget-object v2, p0, Ll/ᩴۢۡ;->᩶:Ll/ܳ᩸ۡ;

    iget v3, v2, Ll/ܳ᩸ۡ;->ᩳ:F

    iget v4, v2, Ll/ܳ᩸ۡ;->ۧ:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_c

    iget v3, v2, Ll/ܳ᩸ۡ;->֫:F

    iget v4, v2, Ll/ܳ᩸ۡ;->ܿ:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_c

    if-lez v0, :cond_c

    if-le v1, v0, :cond_c

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    const/high16 v0, 0x40600000    # 3.5f

    cmpl-float v0, v1, v0

    if-lez v0, :cond_c

    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/ᩴۢۡ;->᩸:F

    .line 241
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Ll/ᩴۢۡ;->᩹:F

    .line 242
    iget v1, p0, Ll/ᩴۢۡ;->᩸:F

    invoke-virtual {v2, v1, v0}, Ll/ܳ᩸ۡ;->ۧ(FF)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 243
    invoke-direct {p0}, Ll/ᩴۢۡ;->֫()V

    return v5

    .line 246
    :cond_b
    iget v0, p0, Ll/ᩴۢۡ;->᩸:F

    iget v1, p0, Ll/ᩴۢۡ;->᩹:F

    invoke-virtual {v2, v0, v1}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v0

    iput-boolean v0, p0, Ll/ᩴۢۡ;->۬:Z

    .line 274
    :cond_c
    :goto_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
