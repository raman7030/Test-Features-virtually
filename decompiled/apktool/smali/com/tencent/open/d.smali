.class public Lcom/tencent/open/d;
.super Lcom/tencent/open/c;
.source "51RR"


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x1

    .line 93
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 94
    invoke-super {p0, p1}, Lcom/tencent/open/c;->onCreate(Landroid/os/Bundle;)V

    .line 96
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v1, 0x10

    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 97
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 104
    new-instance p1, Ll/᩻᩸ۘ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "openSDK_LOG.PKDialog"

    const-string v1, "--onConsoleMessage--"

    .line 523
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/c;->᩸:Ll/ܿ᩸ۘ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ܿ᩸ۘ;->֫(Landroid/webkit/WebView;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
