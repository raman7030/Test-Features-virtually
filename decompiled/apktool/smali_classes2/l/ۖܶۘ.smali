.class public final Ll/ۖܶۘ;
.super Landroid/webkit/WebViewClient;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/open/TDialog;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TDialog;)V
    .locals 0

    .line 424
    iput-object p1, p0, Ll/ۖܶۘ;->֫:Lcom/tencent/open/TDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 497
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 499
    iget-object p1, p0, Ll/ۖܶۘ;->֫:Lcom/tencent/open/TDialog;

    invoke-static {p1}, Lcom/tencent/open/TDialog;->ܽ(Lcom/tencent/open/TDialog;)Ll/ۜ᩸ۘ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 500
    invoke-static {p1}, Lcom/tencent/open/TDialog;->ܽ(Lcom/tencent/open/TDialog;)Ll/ۜ᩸ۘ;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 490
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Webview loading URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.TDialog"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 475
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 476
    iget-object p1, p0, Ll/ۖܶۘ;->֫:Lcom/tencent/open/TDialog;

    invoke-static {p1}, Lcom/tencent/open/TDialog;->ۧ(Lcom/tencent/open/TDialog;)Ll/ᩴܶۘ;

    move-result-object v0

    new-instance v1, Ll/᩵᩹ۘ;

    invoke-direct {v1, p2, p3, p4}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ᩴܶۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 481
    invoke-static {p1}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 482
    invoke-static {p1}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    const-string p3, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\u6216\u7cfb\u7edf\u9519\u8bef"

    const/4 p4, 0x0

    invoke-static {p2, p3, p4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    .line 483
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 485
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .line 428
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Redirect URL: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.TDialog"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    invoke-static {}, Ll/ܰ᩸ۘ;->֫()Ll/ܰ᩸ۘ;

    move-result-object p1

    iget-object v0, p0, Ll/ۖܶۘ;->֫:Lcom/tencent/open/TDialog;

    invoke-static {v0}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-string v2, "auth://tauth.qq.com/"

    invoke-virtual {p1, v1, v2}, Ll/ܰ᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 431
    invoke-static {v0}, Lcom/tencent/open/TDialog;->ۧ(Lcom/tencent/open/TDialog;)Ll/ᩴܶۘ;

    move-result-object p1

    invoke-static {p2}, Ll/ᩳ᩹ۘ;->ܽ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩴܶۘ;->֫(Lorg/json/JSONObject;)V

    .line 432
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 433
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return v1

    :cond_0
    const-string p1, "auth://cancel"

    .line 436
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 437
    invoke-static {v0}, Lcom/tencent/open/TDialog;->ۧ(Lcom/tencent/open/TDialog;)Ll/ᩴܶۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴܶۘ;->֫()V

    .line 438
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 439
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return v1

    :cond_1
    const-string p1, "auth://close"

    .line 442
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 444
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 445
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return v1

    :cond_2
    const-string p1, "download://"

    .line 448
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, ".apk"

    invoke-virtual {p2, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "auth://progress"

    .line 466
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    return p1

    .line 452
    :cond_5
    :goto_0
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/16 p1, 0xb

    .line 453
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    .line 455
    :cond_6
    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 457
    :goto_1
    new-instance p2, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {p2, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x10000000

    .line 458
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 459
    invoke-static {v0}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 460
    invoke-static {v0}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_2
    return v1
.end method
