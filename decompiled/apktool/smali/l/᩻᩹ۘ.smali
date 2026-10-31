.class public final Ll/᩻᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Landroid/webkit/WebView;)V
    .locals 3

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "searchBoxJavaBridge_"

    .line 49
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibility"

    .line 50
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibilityTraversal"

    .line 51
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 v0, 0x0

    .line 35
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 36
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 39
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 40
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "WebViewUtils"

    const-string v2, "Exception"

    .line 43
    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    :cond_1
    :goto_1
    return-void
.end method
