.class public Ll/۠᩻;
.super Ll/᩵᩻;
.source "T9OD"


# instance fields
.field public ֫֫:Z

.field public ۧ֫:Ll/֨᩻;


# virtual methods
.method public final applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 387
    invoke-super {p0, p1}, Ll/᩵᩻;->applyTheme(Landroid/content/res/Resources$Theme;)V

    .line 388
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۠᩻;->onStateChange([I)Z

    return-void
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 306
    iget-boolean v0, p0, Ll/۠᩻;->֫֫:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Ll/᩵᩻;->mutate()Landroid/graphics/drawable/Drawable;

    .line 307
    iget-object v0, p0, Ll/۠᩻;->ۧ֫:Ll/֨᩻;

    invoke-virtual {v0}, Ll/֨᩻;->ܿ()V

    const/4 v0, 0x1

    .line 308
    iput-boolean v0, p0, Ll/۠᩻;->֫֫:Z

    :cond_0
    return-object p0
.end method

.method public onStateChange([I)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ֫(Ll/ᩴ᩻;)V
    .locals 1

    .line 393
    invoke-super {p0, p1}, Ll/᩵᩻;->֫(Ll/ᩴ᩻;)V

    .line 394
    instance-of v0, p1, Ll/֨᩻;

    if-eqz v0, :cond_0

    .line 395
    check-cast p1, Ll/֨᩻;

    iput-object p1, p0, Ll/۠᩻;->ۧ֫:Ll/֨᩻;

    :cond_0
    return-void
.end method
