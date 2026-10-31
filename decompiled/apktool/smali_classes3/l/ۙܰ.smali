.class public final Ll/ۙܰ;
.super Ll/᩶ܰ;
.source "XAMH"


# virtual methods
.method public final ֫(Z)V
    .locals 2

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    const/high16 p1, 0x8000000

    .line 517
    iget-object v1, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v1, p1}, Landroid/view/Window;->clearFlags(I)V

    const/high16 p1, -0x80000000

    .line 513
    invoke-virtual {v1, p1}, Landroid/view/Window;->addFlags(I)V

    .line 606
    invoke-virtual {p0, v0}, Ll/᩹ܰ;->ᩳ(I)V

    return-void

    .line 608
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩹ܰ;->ܿ(I)V

    return-void
.end method
