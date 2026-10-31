.class public final Ll/۟֨ܳ;
.super Ll/ܰ֨ܳ;
.source "98EM"


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 308
    invoke-virtual {p0}, Ll/۟֨ܳ;->ܽ()Landroid/widget/TextView;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    const/4 v1, -0x1

    .line 40
    invoke-static {v1, p1, v1, v0}, Ll/᩷᩹ۡ;->֫(IIILandroid/view/View;)V

    return-void
.end method

.method public final ܽ()Landroid/widget/TextView;
    .locals 2

    .line 303
    iget-object v0, p0, Ll/ܰ֨ܳ;->֫:[Landroid/view/View;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method
