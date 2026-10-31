.class public final Ll/۫ۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;)Ll/᩸ܰ;
    .locals 2

    .line 5392
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 148
    :cond_0
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    .line 5398
    invoke-virtual {v0, v0}, Ll/᩸ܰ;->֫(Ll/᩸ܰ;)V

    .line 5399
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/᩸ܰ;->֫(Landroid/view/View;)V

    return-object v0
.end method

.method public static ֫(Landroid/view/View;I)V
    .locals 0

    .line 5405
    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollIndicators(I)V

    return-void
.end method

.method public static ֫(Landroid/view/View;II)V
    .locals 0

    .line 5410
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setScrollIndicators(II)V

    return-void
.end method

.method public static ۧ(Landroid/view/View;)I
    .locals 0

    .line 5415
    invoke-virtual {p0}, Landroid/view/View;->getScrollIndicators()I

    move-result p0

    return p0
.end method
