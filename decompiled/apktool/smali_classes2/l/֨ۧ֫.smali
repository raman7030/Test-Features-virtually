.class public final Ll/֨ۧ֫;
.super Ll/ܽۛ;
.source "O607"


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 0

    .line 2541
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 2543
    invoke-static {p1}, Ll/۬ۧ֫;->ᩳ(Landroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2547
    invoke-virtual {p2, p1}, Ll/ܳ۟;->ܽ(Landroid/view/View;)V

    :cond_0
    return-void
.end method
