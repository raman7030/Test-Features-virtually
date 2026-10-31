.class public final Ll/ۚ᩺;
.super Ljava/lang/Object;
.source "X6B0"


# direct methods
.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;)V
    .locals 0

    .line 541
    invoke-interface {p0, p1}, Landroid/view/ViewParent;->onStopNestedScroll(Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;IIII)V
    .locals 0

    .line 547
    invoke-interface/range {p0 .. p5}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;II[I)V
    .locals 0

    .line 552
    invoke-interface {p0, p1, p2, p3, p4}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 536
    invoke-interface {p0, p1, p2, p3}, Landroid/view/ViewParent;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;FF)Z
    .locals 0

    .line 563
    invoke-interface {p0, p1, p2, p3}, Landroid/view/ViewParent;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z
    .locals 0

    .line 558
    invoke-interface {p0, p1, p2, p3, p4}, Landroid/view/ViewParent;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 531
    invoke-interface {p0, p1, p2, p3}, Landroid/view/ViewParent;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p0

    return p0
.end method
