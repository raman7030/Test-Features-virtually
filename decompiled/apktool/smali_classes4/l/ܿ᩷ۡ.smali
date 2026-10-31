.class public final Ll/ܿ᩷ۡ;
.super Ljava/lang/Object;
.source "HAWX"


# direct methods
.method public static ֫(Landroid/view/ViewGroup;FF)Landroid/view/View;
    .locals 4

    .line 346
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 347
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 348
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v3, p1

    if-gtz v3, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, p1, v3

    if-gtz v3, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, v3, p2

    if-gtz v3, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v3, p2, v3

    if-gtz v3, :cond_3

    .line 349
    instance-of p0, v2, Landroid/view/ViewGroup;

    if-nez p0, :cond_0

    goto :goto_1

    .line 352
    :cond_0
    instance-of p0, v2, Ll/۬۬ۧ;

    if-nez p0, :cond_2

    instance-of p0, v2, Landroid/widget/ListView;

    if-eqz p0, :cond_1

    goto :goto_1

    .line 355
    :cond_1
    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p1, p0

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr p1, p0

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p2, p0

    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr p2, p0

    invoke-static {v2, p1, p2}, Ll/ܿ᩷ۡ;->֫(Landroid/view/ViewGroup;FF)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final ֫(Ll/ܳ᩷ۡ;FF)Z
    .locals 0

    .line 336
    invoke-static {p0, p1, p2}, Ll/ܿ᩷ۡ;->֫(Landroid/view/ViewGroup;FF)Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 337
    :cond_0
    instance-of p1, p0, Ll/ۢۢۡ;

    if-eqz p1, :cond_1

    .line 338
    move-object p1, p0

    check-cast p1, Ll/ۢۢۡ;

    .line 102
    iget-boolean p1, p1, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz p1, :cond_2

    goto :goto_0

    .line 339
    :cond_1
    instance-of p1, p0, Ll/ۖۢۡ;

    if-eqz p1, :cond_2

    .line 340
    move-object p1, p0

    check-cast p1, Ll/ۖۢۡ;

    invoke-virtual {p1}, Ll/ۖۢۡ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p1, -0x1

    .line 342
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p0

    return p0
.end method
