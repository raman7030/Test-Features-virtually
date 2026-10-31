.class public Ll/ۨ֡ᩳ;
.super Landroid/view/ViewGroup;
.source "GAP9"


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public final ۙ:Landroid/widget/EdgeEffect;

.field public final ᩶:Landroid/widget/OverScroller;

.field public final ᩸:Landroid/widget/EdgeEffect;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Ll/ۨ֡ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ۨ֡ᩳ;->ۗ:Ljava/util/ArrayList;

    .line 39
    new-instance p2, Landroid/widget/EdgeEffect;

    invoke-direct {p2, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    .line 40
    new-instance p2, Landroid/widget/EdgeEffect;

    invoke-direct {p2, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    .line 41
    new-instance p2, Landroid/widget/OverScroller;

    invoke-direct {p2, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۨ֡ᩳ;->᩶:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final computeScroll()V
    .locals 4

    .line 228
    iget-object v0, p0, Ll/ۨ֡ᩳ;->᩶:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    .line 230
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 232
    invoke-virtual {p0, v2}, Landroid/view/View;->setScrollY(I)V

    if-lez v1, :cond_0

    if-gtz v2, :cond_0

    .line 234
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 235
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    goto :goto_0

    .line 237
    :cond_0
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v3

    if-ge v1, v3, :cond_1

    if-lt v2, v3, :cond_1

    .line 239
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 240
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 244
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 162
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 164
    iget-object v0, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_0

    .line 165
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 167
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 168
    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    .line 169
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 171
    :goto_0
    iget-object v1, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_1

    .line 172
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    const/high16 v3, 0x43340000    # 180.0f

    .line 173
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 175
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 176
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 177
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_1
    if-eqz v0, :cond_2

    .line 180
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_2
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 5

    sub-int/2addr p4, p2

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    sub-int/2addr p4, p1

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    .line 122
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    const/4 p5, 0x0

    move v0, p1

    :goto_0
    if-ge p5, p3, :cond_2

    .line 123
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_1

    .line 125
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 126
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    if-eq v0, p1, :cond_0

    add-int v4, v0, v2

    if-le v4, p4, :cond_0

    .line 129
    iget v0, p0, Ll/ۨ֡ᩳ;->᩹:I

    add-int/2addr p2, v0

    move v0, p1

    :cond_0
    add-int/2addr v2, v0

    add-int/2addr v3, p2

    .line 131
    invoke-virtual {v1, v0, p2, v2, v3}, Landroid/view/View;->layout(IIII)V

    move v0, v2

    :cond_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 18

    move-object/from16 v0, p0

    .line 51
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 52
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int v2, v1, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    .line 53
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    const/high16 v4, -0x80000000

    .line 54
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 63
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    iget-object v12, v0, Ll/ۨ֡ᩳ;->ۗ:Ljava/util/ArrayList;

    if-ge v7, v5, :cond_3

    .line 64
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 65
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-eq v14, v15, :cond_2

    .line 66
    invoke-virtual {v13, v4, v3}, Landroid/view/View;->measure(II)V

    .line 67
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 68
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    if-lez v8, :cond_1

    add-int v15, v8, v14

    if-le v15, v2, :cond_1

    sub-int v8, v2, v8

    .line 71
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v15

    div-int/2addr v8, v15

    add-int/2addr v11, v8

    add-int/lit8 v9, v9, 0x1

    if-lez v8, :cond_0

    .line 75
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move/from16 p1, v3

    move-object/from16 v3, v16

    check-cast v3, Landroid/view/View;

    .line 76
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v16

    move/from16 p2, v4

    add-int v4, v16, v8

    move/from16 v16, v5

    .line 77
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    move/from16 v17, v8

    const/high16 v8, 0x40000000    # 2.0f

    .line 78
    invoke-static {v4, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/view/View;->measure(II)V

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, v16

    move/from16 v8, v17

    goto :goto_1

    :cond_0
    move/from16 p1, v3

    move/from16 p2, v4

    move/from16 v16, v5

    .line 81
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    add-int/lit8 v6, v6, 0x1

    const/4 v8, 0x0

    goto :goto_2

    :cond_1
    move/from16 p1, v3

    move/from16 p2, v4

    move/from16 v16, v5

    :goto_2
    add-int/2addr v8, v14

    .line 86
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    move/from16 p1, v3

    move/from16 p2, v4

    move/from16 v16, v5

    :goto_3
    add-int/lit8 v7, v7, 0x1

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, v16

    goto/16 :goto_0

    .line 89
    :cond_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    sub-int/2addr v2, v8

    .line 91
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    div-int/2addr v2, v3

    if-lez v9, :cond_4

    .line 93
    div-int/2addr v11, v9

    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_4

    :cond_4
    const/high16 v3, 0x41400000    # 12.0f

    .line 95
    invoke-static {v3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_4
    if-lez v2, :cond_5

    .line 98
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 99
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, v2

    .line 100
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    .line 101
    invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-virtual {v4, v5, v7}, Landroid/view/View;->measure(II)V

    goto :goto_5

    .line 104
    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    :cond_6
    mul-int v6, v6, v10

    .line 106
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    add-int/2addr v2, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v2

    .line 107
    iput v10, v0, Ll/ۨ֡ᩳ;->᩹:I

    .line 109
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 221
    iget-object v0, p0, Ll/ۨ֡ᩳ;->᩶:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_0

    .line 222
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    return-void
.end method

.method public final ֫(FF)V
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    invoke-static {v0, p1, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 209
    iget-object p1, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_0

    .line 210
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 212
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final ֫(II)V
    .locals 9

    .line 216
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v0, p0, Ll/ۨ֡ᩳ;->᩶:Landroid/widget/OverScroller;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move v4, p1

    move v8, p2

    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 217
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 113
    iget v0, p0, Ll/ۨ֡ᩳ;->᩹:I

    return v0
.end method

.method public final ۧ(FF)V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-static {v0, p1, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 201
    iget-object p1, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_0

    .line 202
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 204
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 186
    iget-object v0, p0, Ll/ۨ֡ᩳ;->ۙ:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 187
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 190
    :goto_0
    iget-object v1, p0, Ll/ۨ֡ᩳ;->᩸:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_1

    .line 191
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    if-eqz v2, :cond_2

    .line 195
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_2
    return-void
.end method
