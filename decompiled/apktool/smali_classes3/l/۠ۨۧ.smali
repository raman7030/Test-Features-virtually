.class public final Ll/۠ۨۧ;
.super Landroid/util/Property;
.source "R697"


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroid/view/View;

    .line 58
    invoke-static {p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 54
    check-cast p1, Landroid/view/View;

    check-cast p2, Ljava/lang/Float;

    .line 63
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;F)V

    return-void
.end method
