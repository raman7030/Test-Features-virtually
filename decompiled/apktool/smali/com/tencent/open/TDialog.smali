.class public Lcom/tencent/open/TDialog;
.super Lcom/tencent/open/c;
.source "51RR"


# static fields
.field public static final ۨ:Landroid/widget/FrameLayout$LayoutParams;

.field public static ܰ:Ljava/lang/ref/WeakReference;

.field public static ᩺:Landroid/widget/Toast;


# instance fields
.field public ۗ:Ll/ᩴܶۘ;

.field public ۙ:Ljava/lang/String;

.field public ۛ:Landroid/os/Handler;

.field public ۤ:Ll/ۜ᩸ۘ;

.field public ۫:Ll/᩷᩸ۘ;

.field public ۬:Ll/ۘ᩹ۘ;

.field public ᩶:Ljava/lang/ref/WeakReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/tencent/open/TDialog;->ۨ:Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, 0x0

    .line 515
    sput-object v0, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;Ll/᩸۠ۘ;)V
    .locals 1

    .line 197
    invoke-direct {p0, p1}, Lcom/tencent/open/c;-><init>(Landroid/content/Context;)V

    .line 198
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->᩶:Ljava/lang/ref/WeakReference;

    .line 199
    iput-object p2, p0, Lcom/tencent/open/TDialog;->ۙ:Ljava/lang/String;

    .line 200
    new-instance v0, Ll/ᩴܶۘ;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1, p2, p3}, Ll/ᩴܶۘ;-><init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->ۗ:Ll/ᩴܶۘ;

    .line 201
    new-instance p2, Ll/᩵ܶۘ;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p0, v0, p1}, Ll/᩵ܶۘ;-><init>(Lcom/tencent/open/TDialog;Ll/ᩴܶۘ;Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/tencent/open/TDialog;->ۛ:Landroid/os/Handler;

    .line 202
    iput-object p3, p0, Lcom/tencent/open/TDialog;->۬:Ll/ۘ᩹ۘ;

    return-void
.end method

.method public static synthetic ֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/tencent/open/TDialog;->᩶:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_5

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 557
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "action"

    .line 558
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "msg"

    .line 559
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 561
    sget-object v0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 568
    :cond_1
    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ProgressDialog;

    invoke-virtual {p0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 569
    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    if-nez p0, :cond_5

    .line 570
    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void

    .line 562
    :cond_2
    :goto_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 563
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 564
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    .line 566
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_3
    if-nez v0, :cond_5

    .line 574
    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    if-nez p0, :cond_4

    goto :goto_1

    .line 577
    :cond_4
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_5

    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    .line 578
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    if-eqz p0, :cond_5

    .line 579
    sget-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    const/4 p0, 0x0

    .line 580
    sput-object p0, Lcom/tencent/open/TDialog;->ܰ:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    :goto_1
    return-void
.end method

.method public static synthetic ۧ(Lcom/tencent/open/TDialog;)Ll/ᩴܶۘ;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/tencent/open/TDialog;->ۗ:Ll/ᩴܶۘ;

    return-object p0
.end method

.method public static synthetic ܽ(Lcom/tencent/open/TDialog;)Ll/ۜ᩸ۘ;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    return-object p0
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/tencent/open/TDialog;->ۗ:Ll/ᩴܶۘ;

    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {v0}, Ll/ᩴܶۘ;->֫()V

    .line 248
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/4 v0, 0x1

    .line 208
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 209
    invoke-super {p0, p1}, Lcom/tencent/open/c;->onCreate(Landroid/os/Bundle;)V

    .line 210
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Ll/ۗܶۘ;->֫(Landroid/view/Window;)V

    .line 253
    iget-object p1, p0, Lcom/tencent/open/TDialog;->᩶:Ljava/lang/ref/WeakReference;

    const/4 v1, -0x1

    :try_start_0
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "test"

    .line 254
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 259
    new-instance v3, Ll/ۜ᩸ۘ;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Ll/ۜ᩸ۘ;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    .line 260
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v3, 0x11

    .line 262
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 263
    new-instance v3, Ll/᩷᩸ۘ;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    .line 22
    invoke-direct {v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 263
    iput-object v3, p0, Lcom/tencent/open/TDialog;->۫:Ll/᩷᩸ۘ;

    .line 264
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    iget-object v2, p0, Lcom/tencent/open/TDialog;->۫:Ll/᩷᩸ۘ;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 266
    iget-object v2, p0, Lcom/tencent/open/TDialog;->۫:Ll/᩷᩸ۘ;

    iget-object v3, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 267
    iget-object v2, p0, Lcom/tencent/open/TDialog;->۫:Ll/᩷᩸ۘ;

    invoke-virtual {p0, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "openSDK_LOG.TDialog"

    const-string v4, "onCreateView exception"

    .line 270
    invoke-static {v3, v4, v2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 271
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۛ:Landroid/os/Handler;

    invoke-static {p0, v2}, Ll/ۗܶۘ;->֫(Landroid/app/Dialog;Landroid/os/Handler;)V

    .line 218
    :goto_0
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Ll/ܺܶۘ;

    invoke-direct {v3, p0}, Ll/ܺܶۘ;-><init>(Lcom/tencent/open/TDialog;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 315
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    .line 316
    invoke-virtual {v2, v3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 317
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-virtual {v2, v3}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 318
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    new-instance v4, Ll/ۖܶۘ;

    invoke-direct {v4, p0}, Ll/ۖܶۘ;-><init>(Lcom/tencent/open/TDialog;)V

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 319
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    iget-object v4, p0, Lcom/tencent/open/c;->᩹:Landroid/webkit/WebChromeClient;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 320
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-virtual {v2}, Landroid/webkit/WebView;->clearFormData()V

    .line 323
    iget-object v2, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 327
    :cond_0
    iget-object v4, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-static {v4}, Ll/᩻᩹ۘ;->֫(Landroid/webkit/WebView;)V

    .line 328
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 330
    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 333
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 334
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 335
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 337
    sget-object v1, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    if-eqz p1, :cond_1

    .line 339
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 340
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 341
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "databases"

    .line 342
    invoke-virtual {p1, v1, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 341
    invoke-virtual {v2, p1}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 344
    :cond_1
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 346
    iget-object p1, p0, Lcom/tencent/open/c;->᩸:Ll/ܿ᩸ۘ;

    new-instance v0, Ll/ۘܶۘ;

    .line 361
    invoke-direct {v0}, Ll/۫ܶۘ;-><init>()V

    const-string v1, "sdk_js_if"

    .line 346
    invoke-virtual {p1, v0, v1}, Ll/ܿ᩸ۘ;->֫(Ll/۫ܶۘ;Ljava/lang/String;)V

    .line 348
    iget-object p1, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    iget-object v0, p0, Lcom/tencent/open/TDialog;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 349
    iget-object p1, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    sget-object v0, Lcom/tencent/open/TDialog;->ۨ:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 350
    iget-object p1, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    const-string v0, "openSDK_LOG.TDialog"

    const-string v1, "--onConsoleMessage--"

    .line 277
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/c;->᩸:Ll/ܿ᩸ۘ;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->ۤ:Ll/ۜ᩸ۘ;

    invoke-virtual {v0, v1, p1}, Ll/ܿ᩸ۘ;->֫(Landroid/webkit/WebView;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
