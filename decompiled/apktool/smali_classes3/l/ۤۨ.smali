.class public final Ll/ۤۨ;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ֫(Landroid/view/View;)V
    .locals 0

    .line 5610
    invoke-virtual {p0}, Landroid/view/View;->cancelDragAndDrop()V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/view/PointerIcon;)V
    .locals 0

    .line 5598
    invoke-virtual {p0, p1}, Landroid/view/View;->setPointerIcon(Landroid/view/PointerIcon;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/view/View$DragShadowBuilder;)V
    .locals 0

    .line 5616
    invoke-virtual {p0, p1}, Landroid/view/View;->updateDragShadow(Landroid/view/View$DragShadowBuilder;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z
    .locals 0

    .line 5605
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->startDragAndDrop(Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/view/View;)V
    .locals 0

    .line 5626
    invoke-virtual {p0}, Landroid/view/View;->dispatchFinishTemporaryDetach()V

    return-void
.end method

.method public static ܽ(Landroid/view/View;)V
    .locals 0

    .line 5621
    invoke-virtual {p0}, Landroid/view/View;->dispatchStartTemporaryDetach()V

    return-void
.end method
