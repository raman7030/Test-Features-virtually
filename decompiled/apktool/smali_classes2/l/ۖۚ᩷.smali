.class public final Ll/ۖۚ᩷;
.super Landroid/webkit/WebViewClient;
.source "E72G"


# instance fields
.field public final synthetic ֫:Ll/֨ۚ᩷;


# direct methods
.method public constructor <init>(Ll/֨ۚ᩷;)V
    .locals 0

    .line 490
    iput-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 537
    iget-object p3, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p3, p1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 543
    iget-object v0, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {v0, p1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 544
    invoke-static {v0, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    const/4 p1, 0x0

    const/16 v0, 0x64

    .line 550
    iget-object v1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {v1, p1, v0}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;ZI)V

    .line 551
    invoke-static {v1}, Ll/֨ۚ᩷;->ۢ(Ll/֨ۚ᩷;)V

    .line 552
    invoke-static {v1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 523
    iget-object p3, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p3}, Ll/֨ۚ᩷;->ܳ(Ll/֨ۚ᩷;)Ll/ܳܿܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Ll/֨ۚ᩷;->ܳ(Ll/֨ۚ᩷;)Ll/ܳܿܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳܿܳ;->ۧ()V

    .line 524
    :cond_0
    invoke-static {p3}, Ll/֨ۚ᩷;->᩻(Ll/֨ۚ᩷;)Ll/ۚۚ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 525
    invoke-static {p3, p2}, Ll/֨ۚ᩷;->ۧ(Ll/֨ۚ᩷;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x11

    const/16 v1, 0x17

    const/16 v2, 0xd

    .line 526
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 525
    :goto_0
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    :cond_2
    if-nez p2, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    .line 528
    :cond_3
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 529
    :goto_1
    invoke-static {p3, p1}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    .line 530
    invoke-static {p3, p1}, Ll/֨ۚ᩷;->ۧ(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 531
    invoke-static {p3, p1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;ZI)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 570
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1}, Ll/֨ۚ᩷;->ۡ(Ll/֨ۚ᩷;)V

    if-nez p4, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 571
    :cond_0
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ᩳ(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 559
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 560
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1}, Ll/֨ۚ᩷;->ۡ(Ll/֨ۚ᩷;)V

    .line 561
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ᩳ(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 0

    .line 578
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 579
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1}, Ll/֨ۚ᩷;->ۡ(Ll/֨ۚ᩷;)V

    :cond_0
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .line 586
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1}, Ll/֨ۚ᩷;->ۡ(Ll/֨ۚ᩷;)V

    .line 587
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 1

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    if-eqz p2, :cond_0

    .line 595
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 597
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 598
    iget-object p2, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p2}, Ll/֨ۚ᩷;->ۜ(Ll/֨ۚ᩷;)Landroid/webkit/WebView;

    move-result-object v0

    if-ne v0, p1, :cond_1

    .line 599
    invoke-static {p2}, Ll/֨ۚ᩷;->᩷(Ll/֨ۚ᩷;)V

    .line 601
    :cond_1
    invoke-static {p2}, Ll/֨ۚ᩷;->ۡ(Ll/֨ۚ᩷;)V

    const p1, 0x7f120711

    .line 602
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 603
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 0

    .line 495
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    .line 501
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 504
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    .line 505
    iget-object p2, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p2, p1}, Ll/֨ۚ᩷;->ܽ(Ll/֨ۚ᩷;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 507
    invoke-static {p2, p1}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    .line 508
    invoke-static {p2, p1}, Ll/֨ۚ᩷;->ۧ(Ll/֨ۚ᩷;Landroid/net/Uri;)V

    :cond_1
    return v0
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    .line 517
    iget-object p1, p0, Ll/ۖۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2}, Ll/֨ۚ᩷;->ܽ(Ll/֨ۚ᩷;Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
