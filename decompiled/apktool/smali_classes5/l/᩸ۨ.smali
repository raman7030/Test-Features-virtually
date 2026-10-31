.class public final Ll/᩸ۨ;
.super Ll/᩶ۨ;
.source "95QI"


# virtual methods
.method public final ֫(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 4789
    invoke-static {p1}, Ll/᩺ۨ;->ۧ(Landroid/view/View;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 4784
    check-cast p2, Ljava/lang/Boolean;

    .line 4795
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Ll/᩺ۨ;->֫(Landroid/view/View;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 4784
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 4866
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 4867
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-ne p1, p2, :cond_2

    const/4 v0, 0x1

    :cond_2
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method
