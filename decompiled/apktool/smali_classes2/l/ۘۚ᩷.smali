.class public final Ll/ۘۚ᩷;
.super Landroid/webkit/WebChromeClient;
.source "E72G"


# instance fields
.field public final synthetic ֫:Ll/֨ۚ᩷;


# direct methods
.method public constructor <init>(Ll/֨ۚ᩷;)V
    .locals 0

    .line 903
    iput-object p1, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 1

    const/4 v0, 0x0

    .line 960
    invoke-interface {p2, p1, v0, v0}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 923
    iget-object p1, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ܽ(Ll/֨ۚ᩷;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 985
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 989
    :cond_0
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 990
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 991
    invoke-virtual {p1, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/᩹֨᩷;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p4}, Ll/᩹֨᩷;-><init>(ILjava/lang/Object;)V

    const p3, 0x7f12070a

    .line 992
    invoke-virtual {p1, p3, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/᩻ۚ᩷;

    invoke-direct {p2, p4}, Ll/᩻ۚ᩷;-><init>(Landroid/webkit/JsResult;)V

    .line 993
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 994
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_1

    .line 986
    :cond_1
    :goto_0
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 930
    iget-object p1, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ܽ(Ll/֨ۚ᩷;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 1002
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1006
    :cond_0
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 1007
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 1008
    invoke-virtual {p1, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/ܽۚ᩷;

    invoke-direct {p2, p4}, Ll/ܽۚ᩷;-><init>(Landroid/webkit/JsResult;)V

    const p3, 0x7f12070a

    .line 1009
    invoke-virtual {p1, p3, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ᩳۚ᩷;

    invoke-direct {p2, p4}, Ll/ᩳۚ᩷;-><init>(Landroid/webkit/JsResult;)V

    const p3, 0x7f12015e

    .line 1010
    invoke-virtual {p1, p3, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ܿۚ᩷;

    invoke-direct {p2, p4}, Ll/ܿۚ᩷;-><init>(Landroid/webkit/JsResult;)V

    .line 1011
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1012
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_1

    .line 1003
    :cond_1
    :goto_0
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 2

    .line 938
    iget-object p1, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ܽ(Ll/֨ۚ᩷;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    .line 1020
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1024
    :cond_0
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 1025
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    if-nez p4, :cond_1

    const-string p4, ""

    .line 1026
    :cond_1
    invoke-virtual {v1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1027
    invoke-virtual {v1}, Landroid/widget/EditText;->selectAll()V

    .line 1028
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 1029
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 1030
    invoke-virtual {p1, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 1031
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p2, Ll/۟֡᩷;

    invoke-direct {p2, p5, v1}, Ll/۟֡᩷;-><init>(Landroid/webkit/JsPromptResult;Landroid/widget/EditText;)V

    const p3, 0x7f12070a

    .line 1032
    invoke-virtual {p1, p3, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/֫ۚ᩷;

    invoke-direct {p2, p5}, Ll/֫ۚ᩷;-><init>(Landroid/webkit/JsPromptResult;)V

    const p3, 0x7f12015e

    .line 1034
    invoke-virtual {p1, p3, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ۧۚ᩷;

    invoke-direct {p2, p5}, Ll/ۧۚ᩷;-><init>(Landroid/webkit/JsPromptResult;)V

    .line 1035
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1036
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v0

    .line 1021
    :cond_2
    :goto_0
    invoke-virtual {p5}, Landroid/webkit/JsResult;->cancel()V

    return v0
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 0

    .line 953
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    const/16 p1, 0x64

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 917
    :goto_0
    iget-object v0, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {v0, p1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;ZI)V

    return-void
.end method

.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 907
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۘۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {v0, p1}, Ll/֨ۚ᩷;->ۧ(Ll/֨ۚ᩷;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 908
    invoke-static {v0}, Ll/֨ۚ᩷;->᩻(Ll/֨ۚ᩷;)Ll/ۚۚ᩷;

    move-result-object p1

    invoke-static {p1}, Ll/ۚۚ᩷;->ܺ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 909
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 910
    invoke-virtual {v0, p2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 0

    const/4 p1, 0x0

    .line 946
    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
