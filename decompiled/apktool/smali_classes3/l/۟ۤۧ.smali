.class public final Ll/۟ۤۧ;
.super Landroid/util/Property;
.source "A65W"


# virtual methods
.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 89
    check-cast p1, Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 89
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 94
    iget v2, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 95
    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 96
    invoke-static {p1, v0, v1, v2, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    return-void
.end method
