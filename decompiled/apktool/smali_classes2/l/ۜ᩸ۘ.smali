.class public Ll/ۜ᩸ۘ;
.super Landroid/webkit/WebView;
.source "51RR"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 18
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const-string p1, "searchBoxJavaBridge_"

    .line 36
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string p1, "accessibility"

    .line 37
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string p1, "accessibilityTraversal"

    .line 38
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string p1, "openSDK_LOG.OpenWebView"

    const-string v0, "removeJSInterface"

    .line 39
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 4

    const-string v0, "-->OpenWebView.destroy setBuiltInZoomControls"

    const-string v1, "openSDK_LOG.OpenWebView"

    .line 72
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 73
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    const/16 v2, 0x8

    .line 74
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 75
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 77
    invoke-static {v1, v0, v2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    :goto_0
    invoke-super {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 7

    const-string v0, "openSDK_LOG.OpenWebView"

    .line 45
    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    .line 46
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :try_start_0
    const-string v3, "removeJavascriptInterface"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    .line 54
    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_1

    new-array v3, v4, [Ljava/lang/Object;

    const-string v5, "searchBoxJavaBridge_"

    aput-object v5, v3, v2

    .line 57
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array v3, v4, [Ljava/lang/Object;

    const-string v5, "accessibility"

    aput-object v5, v3, v2

    .line 58
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array v3, v4, [Ljava/lang/Object;

    const-string v4, "accessibilityTraversal"

    aput-object v4, v3, v2

    .line 59
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "remove js interface"

    .line 60
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remove js interface.e:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
