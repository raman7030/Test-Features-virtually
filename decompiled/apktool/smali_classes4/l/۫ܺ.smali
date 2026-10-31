.class public Ll/۫ܺ;
.super Ll/ۢۢۡ;
.source "J5NH"


# instance fields
.field public ֡֫:Z

.field public ֨֫:I

.field public ۗ֫:Ll/ۙܺ;

.field public ۙ֫:I

.field public ۚ֫:Z

.field public ۠֫:Ll/۬ܺ;

.field public final ۬֫:Landroid/graphics/Rect;

.field public ܶ֫:Ll/ۢ֫֫;

.field public ᩵֫:Z

.field public ᩶֫:I

.field public ᩸֫:I

.field public ᩹֫:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0401b1

    .line 125
    invoke-direct {p0, p1, v0, v1}, Ll/ۢۢۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/۫ܺ;->۬֫:Landroid/graphics/Rect;

    const/4 p1, 0x0

    .line 59
    iput p1, p0, Ll/۫ܺ;->᩹֫:I

    .line 60
    iput p1, p0, Ll/۫ܺ;->ۙ֫:I

    .line 61
    iput p1, p0, Ll/۫ܺ;->᩶֫:I

    .line 62
    iput p1, p0, Ll/۫ܺ;->᩸֫:I

    .line 126
    iput-boolean p2, p0, Ll/۫ܺ;->֡֫:Z

    .line 127
    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->setCacheColorHint(I)V

    const/4 p1, 0x1

    .line 128
    invoke-virtual {p0, p1}, Ll/ۢۢۡ;->setFastScrollEnabled(Z)V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 583
    iget-object v0, p0, Ll/۫ܺ;->۬֫:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 584
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 586
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 587
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 216
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final drawableStateChanged()V
    .locals 2

    .line 199
    iget-object v0, p0, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 203
    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    .line 384
    iget-object v0, p0, Ll/۫ܺ;->ۗ֫:Ll/ۙܺ;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 385
    invoke-virtual {v0, v1}, Ll/ۙܺ;->֫(Z)V

    .line 576
    :cond_1
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 708
    iget-boolean v1, p0, Ll/۫ܺ;->᩵֫:Z

    if-eqz v1, :cond_2

    .line 577
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 578
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public hasFocus()Z
    .locals 1

    .line 177
    iget-boolean v0, p0, Ll/۫ܺ;->֡֫:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .line 157
    iget-boolean v0, p0, Ll/۫ܺ;->֡֫:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isFocused()Z
    .locals 1

    .line 167
    iget-boolean v0, p0, Ll/۫ܺ;->֡֫:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isInTouchMode()Z
    .locals 1

    .line 147
    iget-boolean v0, p0, Ll/۫ܺ;->֡֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/۫ܺ;->ۚ֫:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    .line 489
    iput-object v0, p0, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    .line 490
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 441
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 444
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 447
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 448
    iget-object v2, p0, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    if-nez v2, :cond_1

    .line 451
    new-instance v2, Ll/۬ܺ;

    invoke-direct {v2, p0}, Ll/۬ܺ;-><init>(Ll/۫ܺ;)V

    iput-object v2, p0, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    .line 731
    invoke-virtual {p0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 456
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    const/16 v3, 0x9

    const/4 v4, -0x1

    if-eq v1, v3, :cond_3

    const/4 v3, 0x7

    if-ne v1, v3, :cond_2

    goto :goto_0

    .line 481
    :cond_2
    invoke-virtual {p0, v4}, Ll/ۢۢۡ;->setSelection(I)V

    return v2

    .line 459
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v1, p1}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result p1

    if-eq p1, v4, :cond_6

    .line 461
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    if-eq p1, v1, :cond_6

    .line 462
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 463
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 466
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_4

    .line 468
    invoke-static {}, Ll/᩹ܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 471
    invoke-static {p0, p1, v1}, Ll/᩹ܺ;->֫(Ll/۫ܺ;ILandroid/view/View;)V

    goto :goto_1

    .line 473
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, v0}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    .line 576
    :cond_5
    :goto_1
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 708
    iget-boolean v0, p0, Ll/۫ܺ;->᩵֫:Z

    if-eqz v0, :cond_6

    .line 577
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 578
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_6
    return v2
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 221
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 223
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Ll/۫ܺ;->֨֫:I

    .line 226
    :goto_0
    iget-object v0, p0, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    if-eqz v0, :cond_1

    .line 726
    iget-object v1, v0, Ll/۬ܺ;->᩸:Ll/۫ܺ;

    const/4 v2, 0x0

    iput-object v2, v1, Ll/۫ܺ;->۠֫:Ll/۬ܺ;

    .line 727
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 230
    :cond_1
    invoke-super {p0, p1}, Ll/ۢۢۡ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 182
    new-instance v0, Ll/ۙܺ;

    invoke-direct {v0, p1}, Ll/ۙܺ;-><init>(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/۫ܺ;->ۗ֫:Ll/ۙܺ;

    .line 183
    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 185
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    if-eqz p1, :cond_1

    .line 187
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 190
    :cond_1
    iget p1, v0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Ll/۫ܺ;->᩹֫:I

    .line 191
    iget p1, v0, Landroid/graphics/Rect;->top:I

    iput p1, p0, Ll/۫ܺ;->ۙ֫:I

    .line 192
    iget p1, v0, Landroid/graphics/Rect;->right:I

    iput p1, p0, Ll/۫ܺ;->᩶֫:I

    .line 193
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iput p1, p0, Ll/۫ܺ;->᩸֫:I

    return-void
.end method

.method public ֫(II)I
    .locals 11

    .line 303
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingTop()I

    move-result v0

    .line 304
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getListPaddingBottom()I

    move-result v1

    .line 305
    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v2

    .line 306
    invoke-virtual {p0}, Landroid/widget/ListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 308
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    add-int/2addr v0, v1

    if-nez v4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-lez v2, :cond_1

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 325
    :goto_0
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v5

    :goto_1
    if-ge v6, v3, :cond_7

    .line 327
    invoke-interface {v4, v6}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v9

    if-eq v9, v7, :cond_2

    move-object v8, v5

    move v7, v9

    .line 332
    :cond_2
    invoke-interface {v4, v6, v8, p0}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 336
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    if-nez v9, :cond_3

    .line 339
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    .line 340
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 343
    :cond_3
    iget v9, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v9, :cond_4

    const/high16 v10, 0x40000000    # 2.0f

    .line 344
    invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    goto :goto_2

    .line 347
    :cond_4
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 349
    :goto_2
    invoke-virtual {v8, p1, v9}, Landroid/view/View;->measure(II)V

    .line 353
    invoke-virtual {v8}, Landroid/view/View;->forceLayout()V

    if-lez v6, :cond_5

    add-int/2addr v0, v2

    .line 360
    :cond_5
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v0, v9

    if-lt v0, p2, :cond_6

    return p2

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_7
    return v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 572
    iput-boolean p1, p0, Ll/۫ܺ;->ۚ֫:Z

    return-void
.end method

.method public ֫(Landroid/view/MotionEvent;I)Z
    .locals 13

    .line 503
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 p2, 0x3

    if-eq v0, p2, :cond_2

    goto/16 :goto_5

    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 512
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result p2

    if-gez p2, :cond_3

    :cond_2
    const/4 v3, 0x0

    goto/16 :goto_6

    .line 518
    :cond_3
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    .line 519
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    float-to-int p2, p2

    .line 520
    invoke-virtual {p0, v4, p2}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    const/4 v2, 0x1

    goto/16 :goto_6

    .line 526
    :cond_4
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v3

    sub-int v3, v5, v3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    int-to-float v4, v4

    int-to-float p2, p2

    .line 661
    iput-boolean v1, p0, Ll/۫ܺ;->᩵֫:Z

    .line 664
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 665
    invoke-static {p0, v4, p2}, Ll/᩸ܺ;->֫(Landroid/view/View;FF)V

    .line 667
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v8

    if-nez v8, :cond_5

    .line 668
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 672
    :cond_5
    invoke-virtual {p0}, Ll/ۢۢۡ;->layoutChildren()V

    .line 676
    iget v8, p0, Ll/۫ܺ;->֨֫:I

    if-eq v8, v6, :cond_6

    .line 677
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_6

    if-eq v8, v3, :cond_6

    .line 678
    invoke-virtual {v8}, Landroid/view/View;->isPressed()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 679
    invoke-virtual {v8, v2}, Landroid/view/View;->setPressed(Z)V

    .line 682
    :cond_6
    iput v5, p0, Ll/۫ܺ;->֨֫:I

    .line 685
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v8

    int-to-float v8, v8

    sub-float v8, v4, v8

    .line 686
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v9

    int-to-float v9, v9

    sub-float v9, p2, v9

    .line 688
    invoke-static {v3, v8, v9}, Ll/᩸ܺ;->֫(Landroid/view/View;FF)V

    .line 690
    invoke-virtual {v3}, Landroid/view/View;->isPressed()Z

    move-result v8

    if-nez v8, :cond_7

    .line 691
    invoke-virtual {v3, v1}, Landroid/view/View;->setPressed(Z)V

    .line 604
    :cond_7
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_8

    if-eq v5, v6, :cond_8

    const/4 v8, 0x1

    goto :goto_1

    :cond_8
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_9

    .line 607
    invoke-virtual {v1, v2, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 624
    :cond_9
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v9

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v10

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v11

    iget-object v12, p0, Ll/۫ܺ;->۬֫:Landroid/graphics/Rect;

    invoke-virtual {v12, v2, v9, v10, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 627
    iget v2, v12, Landroid/graphics/Rect;->left:I

    iget v9, p0, Ll/۫ܺ;->᩹֫:I

    sub-int/2addr v2, v9

    iput v2, v12, Landroid/graphics/Rect;->left:I

    .line 628
    iget v2, v12, Landroid/graphics/Rect;->top:I

    iget v9, p0, Ll/۫ܺ;->ۙ֫:I

    sub-int/2addr v2, v9

    iput v2, v12, Landroid/graphics/Rect;->top:I

    .line 629
    iget v2, v12, Landroid/graphics/Rect;->right:I

    iget v9, p0, Ll/۫ܺ;->᩶֫:I

    add-int/2addr v2, v9

    iput v2, v12, Landroid/graphics/Rect;->right:I

    .line 630
    iget v2, v12, Landroid/graphics/Rect;->bottom:I

    iget v9, p0, Ll/۫ܺ;->᩸֫:I

    add-int/2addr v2, v9

    iput v2, v12, Landroid/graphics/Rect;->bottom:I

    const/16 v2, 0x21

    if-lt v7, v2, :cond_a

    .line 131
    invoke-static {p0}, Ll/᩶ܺ;->֫(Landroid/widget/AbsListView;)Z

    move-result v9

    goto :goto_2

    .line 133
    :cond_a
    invoke-static {p0}, Ll/ۗܺ;->֫(Landroid/widget/AbsListView;)Z

    move-result v9

    .line 635
    :goto_2
    invoke-virtual {v3}, Landroid/view/View;->isEnabled()Z

    move-result v10

    if-eq v10, v9, :cond_c

    xor-int/lit8 v9, v9, 0x1

    if-lt v7, v2, :cond_b

    .line 138
    invoke-static {p0, v9}, Ll/᩶ܺ;->֫(Landroid/widget/AbsListView;Z)V

    goto :goto_3

    .line 140
    :cond_b
    invoke-static {p0, v9}, Ll/ۗܺ;->֫(Landroid/widget/AbsListView;Z)V

    :goto_3
    if-eq v5, v6, :cond_c

    .line 638
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_c
    if-eqz v8, :cond_e

    .line 614
    invoke-virtual {v12}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    .line 615
    invoke-virtual {v12}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v7

    .line 616
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-nez v8, :cond_d

    const/4 v8, 0x1

    goto :goto_4

    :cond_d
    const/4 v8, 0x0

    :goto_4
    const/4 v9, 0x0

    invoke-virtual {v1, v8, v9}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 617
    invoke-static {v1, v2, v7}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;FF)V

    .line 595
    :cond_e
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_f

    if-eq v5, v6, :cond_f

    .line 597
    invoke-static {v1, v4, p2}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;FF)V

    .line 384
    :cond_f
    iget-object p2, p0, Ll/۫ܺ;->ۗ֫:Ll/ۙܺ;

    if-eqz p2, :cond_10

    const/4 v1, 0x0

    .line 385
    invoke-virtual {p2, v1}, Ll/ۙܺ;->֫(Z)V

    .line 704
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    const/4 p2, 0x1

    if-ne v0, p2, :cond_11

    .line 560
    invoke-virtual {p0, v5}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v0

    .line 561
    invoke-virtual {p0, v3, v5, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_11
    const/4 p2, 0x0

    const/4 v2, 0x0

    :goto_5
    const/4 v3, 0x1

    :goto_6
    if-eqz v3, :cond_12

    if-eqz v2, :cond_13

    :cond_12
    const/4 p2, 0x0

    .line 644
    iput-boolean p2, p0, Ll/۫ܺ;->᩵֫:Z

    .line 645
    invoke-virtual {p0, p2}, Landroid/view/View;->setPressed(Z)V

    .line 647
    invoke-virtual {p0}, Ll/۫ܺ;->drawableStateChanged()V

    .line 649
    iget v0, p0, Ll/۫ܺ;->֨֫:I

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 651
    invoke-virtual {v0, p2}, Landroid/view/View;->setPressed(Z)V

    :cond_13
    if-eqz v3, :cond_15

    .line 543
    iget-object p2, p0, Ll/۫ܺ;->ܶ֫:Ll/ۢ֫֫;

    if-nez p2, :cond_14

    .line 544
    new-instance p2, Ll/ۢ֫֫;

    invoke-direct {p2, p0}, Ll/ۢ֫֫;-><init>(Landroid/widget/ListView;)V

    iput-object p2, p0, Ll/۫ܺ;->ܶ֫:Ll/ۢ֫֫;

    .line 546
    :cond_14
    iget-object p2, p0, Ll/۫ܺ;->ܶ֫:Ll/ۢ֫֫;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ll/۟۟;->֫(Z)V

    .line 547
    iget-object p2, p0, Ll/۫ܺ;->ܶ֫:Ll/ۢ֫֫;

    invoke-virtual {p2, p0, p1}, Ll/۟۟;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return v3

    .line 548
    :cond_15
    iget-object p1, p0, Ll/۫ܺ;->ܶ֫:Ll/ۢ֫֫;

    if-eqz p1, :cond_16

    const/4 p2, 0x0

    .line 549
    invoke-virtual {p1, p2}, Ll/۟۟;->֫(Z)V

    :cond_16
    return v3
.end method
