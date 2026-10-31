.class public final Ll/᩷ۜۡ;
.super Ll/ܺۜۡ;
.source "98W2"


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 328
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f120757

    .line 329
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 330
    new-instance v0, Ll/֡֡ۡ;

    invoke-direct {v0, p1}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;)V

    return-void

    .line 333
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۛ᩻ۡ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 334
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
