.class public final Ll/ܺۗۧ;
.super Ll/ۖۗۧ;
.source "Y64E"


# virtual methods
.method public final ֫()I
    .locals 1

    .line 364
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v0

    return v0
.end method

.method public final ֫(Landroid/view/View;)I
    .locals 2

    .line 396
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 397
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedBottom(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 369
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->offsetChildrenVertical(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 359
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ۧ(Landroid/view/View;)I
    .locals 2

    .line 380
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 381
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 374
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v0

    return v0
.end method

.method public final ܳ(Landroid/view/View;)I
    .locals 3

    .line 415
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۖۗۧ;->ܽ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Ll/ܿ۬ۧ;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 416
    iget p1, v2, Landroid/graphics/Rect;->top:I

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v0

    return v0
.end method

.method public final ܽ(Landroid/view/View;)I
    .locals 2

    .line 388
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 389
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedMeasuredWidth(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ܿ()I
    .locals 1

    .line 442
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v0

    return v0
.end method

.method public final ܿ(Landroid/view/View;)I
    .locals 3

    .line 409
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۖۗۧ;->ܽ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Ll/ܿ۬ۧ;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 410
    iget p1, v2, Landroid/graphics/Rect;->bottom:I

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 437
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v0

    return v0
.end method

.method public final ᩳ(Landroid/view/View;)I
    .locals 2

    .line 403
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 404
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedTop(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ᩻()I
    .locals 3

    .line 421
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    .line 422
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method
