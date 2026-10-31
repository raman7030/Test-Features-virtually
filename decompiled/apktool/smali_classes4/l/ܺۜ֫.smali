.class public final Ll/ܺۜ֫;
.super Ll/᩸ᩳ;
.source "O5NM"


# virtual methods
.method public final ֫(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 3

    .line 3553
    check-cast p2, Ll/۠ᩳ;

    .line 3559
    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 3560
    invoke-virtual {p2}, Ll/۠ᩳ;->֫()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 3562
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3564
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 3565
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const-string v1, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v2, 0x0

    .line 3566
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3567
    new-instance v0, Ll/ۚᩳ;

    invoke-virtual {p2}, Ll/۠ᩳ;->ᩳ()Landroid/content/IntentSender;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚᩳ;-><init>(Landroid/content/IntentSender;)V

    const/4 v1, 0x0

    .line 3568
    invoke-virtual {v0, v1}, Ll/ۚᩳ;->֫(Landroid/content/Intent;)V

    .line 3569
    invoke-virtual {p2}, Ll/۠ᩳ;->ܽ()I

    move-result v1

    invoke-virtual {p2}, Ll/۠ᩳ;->ۧ()I

    move-result p2

    invoke-virtual {v0, v1, p2}, Ll/ۚᩳ;->֫(II)V

    .line 3570
    invoke-virtual {v0}, Ll/ۚᩳ;->֫()Ll/۠ᩳ;

    move-result-object p2

    :cond_0
    const-string v0, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 3574
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p2, 0x2

    .line 3575
    invoke-static {p2}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 3576
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    return-object p1
.end method

.method public final ֫(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 1

    .line 3584
    new-instance v0, Ll/ۜᩳ;

    invoke-direct {v0, p1, p2}, Ll/ۜᩳ;-><init>(Landroid/content/Intent;I)V

    return-object v0
.end method
