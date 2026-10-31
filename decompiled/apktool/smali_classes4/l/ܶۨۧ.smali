.class public final Ll/ܶۨۧ;
.super Landroid/util/Property;
.source "R697"


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 69
    check-cast p1, Landroid/view/View;

    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 69
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/Rect;

    .line 78
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method
