.class public final Ll/ۡۗۧ;
.super Ll/ۖۗۧ;
.source "Y64E"


# virtual methods
.method public final ֫()I
    .locals 1

    .line 266
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v0

    return v0
.end method

.method public final ֫(Landroid/view/View;)I
    .locals 2

    .line 298
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 299
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedRight(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0, p1}, Ll/ܿ۬ۧ;->offsetChildrenHorizontal(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 261
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ۧ(Landroid/view/View;)I
    .locals 2

    .line 282
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 283
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedMeasuredWidth(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v0

    return v0
.end method

.method public final ܳ(Landroid/view/View;)I
    .locals 3

    .line 317
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۖۗۧ;->ܽ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Ll/ܿ۬ۧ;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 318
    iget p1, v2, Landroid/graphics/Rect;->left:I

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v0

    return v0
.end method

.method public final ܽ(Landroid/view/View;)I
    .locals 2

    .line 290
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 291
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ܿ()I
    .locals 1

    .line 344
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v0

    return v0
.end method

.method public final ܿ(Landroid/view/View;)I
    .locals 3

    .line 311
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۖۗۧ;->ܽ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Ll/ܿ۬ۧ;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 312
    iget p1, v2, Landroid/graphics/Rect;->right:I

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v0

    return v0
.end method

.method public final ᩳ(Landroid/view/View;)I
    .locals 2

    .line 305
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 306
    iget-object v1, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v1, p1}, Ll/ܿ۬ۧ;->getDecoratedLeft(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ᩻()I
    .locals 3

    .line 323
    iget-object v0, p0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    .line 324
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method
