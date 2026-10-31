.class public Ll/᩷᩸ۘ;
.super Landroid/widget/FrameLayout;
.source "51RR"


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getBoundingRects()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 51
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 55
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v3

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 56
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 57
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 59
    invoke-virtual {p0, v1, v3, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
