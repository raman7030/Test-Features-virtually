.class public final Ll/۠ۨ;
.super Ll/᩶ۨ;
.source "95QI"


# virtual methods
.method public final ֫(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 4709
    invoke-static {p1}, Ll/᩺ۨ;->֫(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 4704
    check-cast p2, Ljava/lang/CharSequence;

    .line 4715
    invoke-static {p1, p2}, Ll/᩺ۨ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 4704
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    .line 4720
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
