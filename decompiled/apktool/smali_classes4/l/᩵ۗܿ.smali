.class public final synthetic Ll/᩵ۗܿ;
.super Ljava/lang/Object;
.source "D4GG"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 12
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x4

    if-ne p2, p3, :cond_0

    .line 14
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
