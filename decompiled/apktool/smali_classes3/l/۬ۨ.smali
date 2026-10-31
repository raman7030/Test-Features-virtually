.class public final Ll/۬ۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 5332
    invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Ll/᩸ܰ;Landroid/graphics/Rect;)Ll/᩸ܰ;
    .locals 1

    .line 5185
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5188
    invoke-virtual {p0, v0, p2}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    move-result-object p1

    .line 5187
    invoke-static {p0, p1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0

    .line 5190
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->setEmpty()V

    return-object p1
.end method

.method public static ֫(Landroid/view/View;F)V
    .locals 0

    .line 5292
    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 5327
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 5342
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 5307
    invoke-virtual {p0, p1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܽۨ;)V
    .locals 2

    .line 5200
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    const v0, 0x7f0a05ae

    .line 5201
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    if-nez p1, :cond_1

    const p1, 0x7f0a05b6

    .line 5208
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 5210
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void

    .line 5214
    :cond_1
    new-instance v0, Ll/ۗۨ;

    invoke-direct {v0, p0, p1}, Ll/ۗۨ;-><init>(Landroid/view/View;Ll/ܽۨ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Z)V
    .locals 0

    .line 5347
    invoke-virtual {p0, p1}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public static ֫(Landroid/view/WindowInsets;Landroid/view/View;)V
    .locals 1

    const v0, 0x7f0a05b6

    .line 5261
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnApplyWindowInsetsListener;

    if-eqz v0, :cond_0

    .line 5264
    invoke-interface {v0, p1, p0}, Landroid/view/View$OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/View;FF)Z
    .locals 0

    .line 5277
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->dispatchNestedPreFling(FF)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/View;FFZ)Z
    .locals 0

    .line 5271
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->dispatchNestedFling(FFZ)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/View;I)Z
    .locals 0

    .line 5357
    invoke-virtual {p0, p1}, Landroid/view/View;->startNestedScroll(I)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/View;IIII[I)Z
    .locals 0

    .line 5373
    invoke-virtual/range {p0 .. p5}, Landroid/view/View;->dispatchNestedScroll(IIII[I)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/View;II[I[I)Z
    .locals 0

    .line 5380
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->dispatchNestedPreScroll(II[I[I)Z

    move-result p0

    return p0
.end method

.method public static ۜ(Landroid/view/View;)Z
    .locals 0

    .line 5367
    invoke-virtual {p0}, Landroid/view/View;->hasNestedScrollingParent()Z

    move-result p0

    return p0
.end method

.method public static ۡ(Landroid/view/View;)V
    .locals 0

    .line 5362
    invoke-virtual {p0}, Landroid/view/View;->stopNestedScroll()V

    return-void
.end method

.method public static ۢ(Landroid/view/View;)Z
    .locals 0

    .line 5352
    invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 5337
    invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/view/View;F)V
    .locals 0

    .line 5297
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationZ(F)V

    return-void
.end method

.method public static ܳ(Landroid/view/View;)F
    .locals 0

    .line 5302
    invoke-virtual {p0}, Landroid/view/View;->getTranslationZ()F

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/view/View;)F
    .locals 0

    .line 5317
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/view/View;F)V
    .locals 0

    .line 5287
    invoke-virtual {p0, p1}, Landroid/view/View;->setZ(F)V

    return-void
.end method

.method public static ܿ(Landroid/view/View;)Ljava/lang/String;
    .locals 0

    .line 5322
    invoke-virtual {p0}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Landroid/view/View;)Ll/᩸ܰ;
    .locals 0

    .line 5179
    invoke-static {p0}, Ll/ܳܰ;->֫(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Landroid/view/View;)Z
    .locals 0

    .line 5312
    invoke-virtual {p0}, Landroid/view/View;->isImportantForAccessibility()Z

    move-result p0

    return p0
.end method

.method public static ᩻(Landroid/view/View;)F
    .locals 0

    .line 5282
    invoke-virtual {p0}, Landroid/view/View;->getZ()F

    move-result p0

    return p0
.end method
