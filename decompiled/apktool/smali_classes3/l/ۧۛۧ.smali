.class public final Ll/ۧۛۧ;
.super Landroid/util/Property;
.source "A65W"


# virtual methods
.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 123
    check-cast p1, Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 123
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    .line 126
    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 127
    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v0

    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v2, p2

    .line 130
    invoke-static {p1, v0, p2, v1, v2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    return-void
.end method
