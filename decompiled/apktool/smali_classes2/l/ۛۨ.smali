.class public final Ll/ۛۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 5550
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->keyboardNavigationClusterSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;)Landroid/view/autofill/AutofillId;
    .locals 0

    .line 5586
    invoke-virtual {p0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;I)V
    .locals 0

    .line 5576
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0

    .line 5514
    invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/util/Collection;I)V
    .locals 0

    .line 5556
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->addKeyboardNavigationClusters(Ljava/util/Collection;I)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Z)V
    .locals 0

    .line 5544
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusedByDefault(Z)V

    return-void
.end method

.method public static varargs ֫(Landroid/view/View;[Ljava/lang/String;)V
    .locals 0

    .line 5509
    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    return-void
.end method

.method public static ۜ(Landroid/view/View;)Z
    .locals 0

    .line 5561
    invoke-virtual {p0}, Landroid/view/View;->restoreDefaultFocus()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/view/View;)I
    .locals 0

    .line 5571
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAutofill()I

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/view/View;I)V
    .locals 0

    .line 5524
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextClusterForwardId(I)V

    return-void
.end method

.method public static ۧ(Landroid/view/View;Z)V
    .locals 0

    .line 5534
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeyboardNavigationCluster(Z)V

    return-void
.end method

.method public static ܳ(Landroid/view/View;)Z
    .locals 0

    .line 5581
    invoke-virtual {p0}, Landroid/view/View;->isImportantForAutofill()Z

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/view/View;)I
    .locals 0

    .line 5519
    invoke-virtual {p0}, Landroid/view/View;->getNextClusterForwardId()I

    move-result p0

    return p0
.end method

.method public static ܿ(Landroid/view/View;)Z
    .locals 0

    .line 5539
    invoke-virtual {p0}, Landroid/view/View;->isFocusedByDefault()Z

    move-result p0

    return p0
.end method

.method public static ᩳ(Landroid/view/View;)Z
    .locals 0

    .line 5566
    invoke-virtual {p0}, Landroid/view/View;->hasExplicitFocusable()Z

    move-result p0

    return p0
.end method

.method public static ᩻(Landroid/view/View;)Z
    .locals 0

    .line 5529
    invoke-virtual {p0}, Landroid/view/View;->isKeyboardNavigationCluster()Z

    move-result p0

    return p0
.end method
