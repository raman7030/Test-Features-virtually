.class public final Ll/۫۠ۘ;
.super Landroid/webkit/WebViewClient;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/connect/auth/a;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/a;)V
    .locals 0

    .line 262
    iput-object p1, p0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 427
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 428
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "-->onPageFinished, url: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.AuthDialog"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    iget-object p1, p0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩻(Lcom/tencent/connect/auth/a;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 431
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 432
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 436
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 437
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۘ(Lcom/tencent/connect/auth/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩵(Lcom/tencent/connect/auth/a;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->onPageStarted, url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.AuthDialog"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 409
    iget-object p1, p0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩻(Lcom/tencent/connect/auth/a;)Landroid/widget/FrameLayout;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 411
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/tencent/connect/auth/a;->֫(Lcom/tencent/connect/auth/a;J)V

    .line 414
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_0

    .line 415
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۘ(Lcom/tencent/connect/auth/a;)Landroid/os/Handler;

    move-result-object p3

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩵(Lcom/tencent/connect/auth/a;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p3, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 417
    :cond_0
    invoke-static {p1, p2}, Lcom/tencent/connect/auth/a;->ᩳ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V

    .line 419
    new-instance p3, Ll/ۨ۠ۘ;

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, p1, v0}, Ll/ۨ۠ۘ;-><init>(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V

    .line 420
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩵(Lcom/tencent/connect/auth/a;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۘ(Lcom/tencent/connect/auth/a;)Landroid/os/Handler;

    move-result-object p1

    const-wide/32 v0, 0x1d4c0

    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 366
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 367
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "-->onReceivedError, errorCode: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " | description: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.AuthDialog"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    iget-object p1, p0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->֫(Lcom/tencent/connect/auth/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 370
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object p2

    new-instance p3, Ll/᩵᩹ۘ;

    const/16 v0, 0x2329

    const-string v1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\uff01"

    invoke-direct {p3, v0, v1, p4}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ll/ۤ۠ۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 371
    invoke-virtual {p1}, Lcom/tencent/connect/auth/a;->dismiss()V

    return-void

    .line 374
    :cond_0
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://imgcache.qq.com/ptlogin/static/qzsjump.html?"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 378
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۢ(Lcom/tencent/connect/auth/a;)J

    move-result-wide v0

    sub-long/2addr p2, v0

    .line 379
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۡ(Lcom/tencent/connect/auth/a;)I

    move-result p4

    const/4 v0, 0x1

    if-ge p4, v0, :cond_1

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܺ(Lcom/tencent/connect/auth/a;)J

    move-result-wide v0

    cmp-long p4, p2, v0

    if-gez p4, :cond_1

    .line 380
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۖ(Lcom/tencent/connect/auth/a;)V

    .line 383
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ۘ(Lcom/tencent/connect/auth/a;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Ll/۬۠ۘ;

    invoke-direct {p2, p0}, Ll/۬۠ۘ;-><init>(Ll/۫۠ۘ;)V

    const-wide/16 p3, 0x1f4

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 393
    :cond_1
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 394
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p2

    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ᩴ(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_2
    return-void

    .line 400
    :cond_3
    invoke-static {p1}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object v0

    new-instance v1, Ll/᩵᩹ۘ;

    invoke-direct {v1, p2, p3, p4}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ۤ۠ۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 401
    invoke-virtual {p1}, Lcom/tencent/connect/auth/a;->dismiss()V

    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x8
    .end annotation

    const-string p1, "openSDK_LOG.AuthDialog"

    const-string v0, "-->onReceivedSslError "

    .line 446
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "\u8bf7\u6c42\u4e0d\u5408\u6cd5\uff0c\u8bf7\u68c0\u67e5\u624b\u673a\u5b89\u5168\u8bbe\u7f6e\uff0c\u5982\u7cfb\u7edf\u65f6\u95f4\u3001\u4ee3\u7406\u7b49"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string p3, "-->onReceivedSslError \u8bf7\u6c42\u4e0d\u5408\u6cd5\uff0c\u8bf7\u68c0\u67e5\u624b\u673a\u5b89\u5168\u8bbe\u7f6e\uff0c\u5982\u7cfb\u7edf\u65f6\u95f4\u3001\u4ee3\u7406\u7b49"

    .line 448
    invoke-static {p1, p3}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    :goto_0
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    .line 265
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "-->Redirect URL: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.AuthDialog"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "auth://browser"

    .line 266
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    if-eqz p1, :cond_4

    .line 267
    invoke-static {p2}, Ll/ᩳ᩹ۘ;->ܽ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 270
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ۧ(Lcom/tencent/connect/auth/a;)Z

    move-result p2

    invoke-static {v2, p2}, Lcom/tencent/connect/auth/a;->֫(Lcom/tencent/connect/auth/a;Z)V

    .line 272
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܽ(Lcom/tencent/connect/auth/a;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p2, "fail_cb"

    const/4 v0, 0x0

    .line 274
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 276
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/tencent/connect/auth/a;->֫(Ljava/lang/String;)V

    return v1

    :cond_1
    const-string p2, "fall_to_wv"

    .line 277
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p2

    if-ne p2, v1, :cond_3

    .line 279
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ᩳ(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "?"

    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-le p1, v0, :cond_2

    const-string p2, "&"

    :cond_2
    invoke-static {v2, p2}, Lcom/tencent/connect/auth/a;->ۧ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V

    const-string p1, "browser_error=1"

    .line 280
    invoke-static {v2, p1}, Lcom/tencent/connect/auth/a;->ۧ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V

    .line 281
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 282
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p1

    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ᩳ(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v1

    :cond_3
    const-string p2, "redir"

    .line 287
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 288
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p2

    if-eqz p2, :cond_d

    .line 289
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v1

    :cond_4
    const-string p1, "auth://tauth.qq.com/"

    .line 294
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 295
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object p1

    invoke-static {p2}, Ll/ᩳ᩹ۘ;->ܽ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۤ۠ۘ;->֫(Lorg/json/JSONObject;)V

    .line 296
    invoke-virtual {v2}, Lcom/tencent/connect/auth/a;->dismiss()V

    return v1

    :cond_5
    const-string p1, "auth://cancel"

    .line 298
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 299
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ۠ۘ;->֫()V

    .line 300
    invoke-virtual {v2}, Lcom/tencent/connect/auth/a;->dismiss()V

    return v1

    :cond_6
    const-string p1, "auth://close"

    .line 302
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 304
    invoke-virtual {v2}, Lcom/tencent/connect/auth/a;->dismiss()V

    return v1

    :cond_7
    const-string p1, "download://"

    .line 306
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, ".apk"

    invoke-virtual {p2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string p1, "auth://progress"

    .line 322
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_b

    .line 325
    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 326
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    .line 327
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_0

    .line 330
    :cond_9
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_a

    .line 333
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->᩻(Lcom/tencent/connect/auth/a;)Landroid/widget/FrameLayout;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 334
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 335
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return v1

    :cond_a
    if-ne p1, v1, :cond_d

    .line 339
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->᩻(Lcom/tencent/connect/auth/a;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :cond_b
    const-string p1, "auth://onLoginSubmit"

    .line 345
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 347
    :try_start_1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 348
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    .line 349
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_d

    .line 350
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v2, p1}, Lcom/tencent/connect/auth/a;->ܽ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return v1

    .line 355
    :cond_c
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ۜ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩹ۘ;

    move-result-object p1

    invoke-static {v2}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object v2

    invoke-virtual {p1, v2, p2}, Ll/ۢ᩹ۘ;->֫(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_e

    :catch_0
    :cond_d
    :goto_0
    return v1

    :cond_e
    const-string p1, "-->Redirect URL: return false"

    .line 359
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    .line 310
    :cond_f
    :goto_1
    :try_start_2
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    const/16 p1, 0xb

    .line 311
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_2

    .line 313
    :cond_10
    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 315
    :goto_2
    new-instance p2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {p2, v3, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x10000000

    .line 316
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 317
    invoke-static {v2}, Lcom/tencent/connect/auth/a;->֫(Lcom/tencent/connect/auth/a;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return v1

    :catch_1
    move-exception p1

    const-string p2, "-->start download activity exception, e: "

    .line 319
    invoke-static {v0, p2, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
