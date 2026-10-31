.class public final Ll/᩷᩹ۡ;
.super Ljava/lang/Object;
.source "C8F7"


# direct methods
.method public static ֫(IIILandroid/view/View;)V
    .locals 2

    .line 55
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_3

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    if-eq p0, v1, :cond_0

    .line 57
    iput p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_0
    if-eq p1, v1, :cond_1

    .line 60
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :cond_1
    if-eq p2, v1, :cond_2

    .line 63
    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 68
    :cond_2
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 70
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Landroid/view/View;)V
    .locals 3

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const v1, 0x7f0a02f7

    .line 24
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Rect;

    .line 25
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 26
    iget v2, v1, Landroid/graphics/Rect;->top:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 27
    iget v2, v1, Landroid/graphics/Rect;->right:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 28
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 31
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ۧ(Landroid/view/View;)V
    .locals 5

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 15
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const v0, 0x7f0a02f7

    .line 16
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method
