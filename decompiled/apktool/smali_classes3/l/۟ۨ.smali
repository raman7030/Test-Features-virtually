.class public final Ll/۟ۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;)I
    .locals 0

    .line 5497
    invoke-virtual {p0}, Landroid/view/View;->getImportantForContentCapture()I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/View;I)V
    .locals 0

    .line 5487
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForContentCapture(I)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0

    .line 5477
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۧ(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    .line 5482
    invoke-virtual {p0}, Landroid/view/View;->getStateDescription()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Landroid/view/View;)Ll/۫ܰ;
    .locals 0

    .line 5469
    invoke-virtual {p0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 5471
    invoke-static {p0}, Ll/۫ܰ;->֫(Landroid/view/WindowInsetsController;)Ll/۫ܰ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩳ(Landroid/view/View;)Z
    .locals 0

    .line 5492
    invoke-virtual {p0}, Landroid/view/View;->isImportantForContentCapture()Z

    move-result p0

    return p0
.end method
