.class public final Ll/ۗ᩶۠;
.super Lmoe/shizuku/server/IShizukuApplication$Stub;
.source "79RF"


# virtual methods
.method public final bindApplication(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "shizuku:attach-reply-uid"

    const/4 v1, -0x1

    .line 54
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ll/᩺᩶۠;->֫(I)V

    const-string v0, "shizuku:attach-reply-version"

    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ll/᩺᩶۠;->ۧ(I)V

    const-string v0, "shizuku:attach-reply-patch-version"

    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    const-string v0, "shizuku:attach-reply-secontext"

    .line 57
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "shizuku:attach-reply-permission-granted"

    const/4 v1, 0x0

    .line 58
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ll/᩺᩶۠;->֫(Z)V

    const-string v0, "shizuku:attach-reply-should-show-request-permission-rationale"

    .line 59
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 61
    invoke-static {}, Ll/᩺᩶۠;->֫()V

    return-void
.end method

.method public final dispatchRequestPermissionResult(ILandroid/os/Bundle;)V
    .locals 2

    const-string v0, "shizuku:request-permission-reply-allowed"

    const/4 v1, 0x0

    .line 66
    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 67
    :goto_0
    invoke-static {p1, v1}, Ll/᩺᩶۠;->֫(II)V

    return-void
.end method

.method public final showPermissionConfirmation(IILjava/lang/String;I)V
    .locals 0

    return-void
.end method
