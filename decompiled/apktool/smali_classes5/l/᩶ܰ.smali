.class public Ll/᩶ܰ;
.super Ll/᩹ܰ;
.source "XAMH"


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 571
    iget-object v0, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Z)V
    .locals 2

    const/16 v0, 0x2000

    if-eqz p1, :cond_0

    const/high16 p1, 0x4000000

    .line 517
    iget-object v1, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v1, p1}, Landroid/view/Window;->clearFlags(I)V

    const/high16 p1, -0x80000000

    .line 513
    invoke-virtual {v1, p1}, Landroid/view/Window;->addFlags(I)V

    .line 580
    invoke-virtual {p0, v0}, Ll/᩹ܰ;->ᩳ(I)V

    return-void

    .line 582
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩹ܰ;->ܿ(I)V

    return-void
.end method
