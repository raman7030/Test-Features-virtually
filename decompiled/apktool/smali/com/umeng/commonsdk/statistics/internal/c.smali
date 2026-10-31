.class public Lcom/umeng/commonsdk/statistics/internal/c;
.super Ljava/lang/Object;
.source "A612"


# static fields
.field public static e:Z

.field public static f:Z

.field public static g:Z


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Landroid/content/Context;

.field public d:Lcom/umeng/commonsdk/statistics/internal/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "10.0.0.172"

    .line 71
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->a:Ljava/lang/String;

    const/16 v0, 0x50

    .line 72
    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->b:I

    .line 84
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    return-object p0
.end method

.method private a()V
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v1, "domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 105
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v3, "domain_s"

    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 107
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 109
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 111
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 113
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 116
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 4

    .line 128
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v1, "domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v3, "domain_s"

    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 131
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 133
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 135
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 137
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 141
    :cond_1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v1, "oversea_domain_p"

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    const-string v3, "oversea_domain_s"

    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 146
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    .line 148
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 150
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    .line 154
    :cond_3
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    .line 158
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 159
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    const-string v1, "460"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    const-string v1, "461"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 161
    :cond_4
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    :cond_5
    return-void
.end method

.method private c()V
    .locals 3

    .line 191
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->g:Z

    if-nez v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object v0

    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$1;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$1;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    const-string v2, "cfgfd"

    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    const/4 v0, 0x1

    .line 209
    sput-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->g:Z

    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    .line 214
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->f:Z

    if-nez v0, :cond_0

    const-string v0, "MobclickRT"

    const-string v1, "--->>> \u6ce8\u518c\u96f6\u53f7\u62a5\u6587 imprint \u5e94\u7b54\u5904\u7406\u56de\u8c03\u3002"

    .line 216
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object v0

    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$2;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$2;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    const-string v2, "iscfg"

    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registPreProcessCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;)V

    .line 235
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object v0

    new-instance v1, Lcom/umeng/commonsdk/statistics/internal/c$3;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/internal/c$3;-><init>(Lcom/umeng/commonsdk/statistics/internal/c;)V

    const-string v2, "cfgfd"

    invoke-virtual {v0, v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    const/4 v0, 0x1

    .line 261
    sput-boolean v0, Lcom/umeng/commonsdk/statistics/internal/c;->f:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/commonsdk/statistics/internal/b;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    return-void
.end method

.method public a([BLjava/lang/String;)[B
    .locals 8

    const-string v0, "\\|"

    const-string v1, "Content-Type"

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 433
    :try_start_0
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz v4, :cond_0

    .line 434
    invoke-interface {v4}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestStart()V

    .line 442
    :cond_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p2

    check-cast p2, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 445
    :try_start_1
    sget-boolean v4, Lcom/umeng/commonsdk/statistics/internal/c;->e:Z

    const/4 v5, 0x1

    if-nez v4, :cond_1

    .line 446
    sget-object v4, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p2, v4}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v4, "TLS"

    .line 468
    invoke-static {v4}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v4

    .line 469
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v4, v3, v3, v6}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 470
    invoke-virtual {v4}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 471
    sput-boolean v5, Lcom/umeng/commonsdk/statistics/internal/c;->e:Z

    :cond_1
    const-string v4, "X-Umeng-UTC"

    .line 475
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "X-Umeng-Sdk"

    .line 476
    iget-object v6, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/umeng/commonsdk/statistics/internal/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/umeng/commonsdk/statistics/internal/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v1, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Msg-Type"

    const-string v6, "envelope/json"

    .line 478
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "X-Umeng-Pro-Ver"

    const-string v6, "1.0.0"

    .line 480
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SM-IMP"

    const-string v6, "1"

    .line 482
    invoke-virtual {p2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x7530

    .line 483
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 484
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v4, "POST"

    .line 485
    invoke-virtual {p2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 487
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 488
    invoke-virtual {p2, v5}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/4 v4, 0x0

    .line 489
    invoke-virtual {p2, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 492
    invoke-virtual {p2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4
    :try_end_1
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 493
    :try_start_2
    invoke-virtual {v4, p1}, Ljava/io/OutputStream;->write([B)V

    .line 494
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 496
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 499
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz p1, :cond_2

    .line 500
    invoke-interface {p1}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestEnd()V

    .line 502
    :cond_2
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    .line 503
    invoke-virtual {p2, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 505
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "application/thrift"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    .line 508
    :goto_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->OS:Ljava/lang/String;

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_4

    if-eqz v5, :cond_4

    .line 515
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_2
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_2 .. :try_end_2} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 518
    :try_start_3
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readStreamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 520
    :try_start_4
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_4 .. :try_end_4} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 543
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 545
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 552
    :goto_1
    :try_start_6
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 556
    :catch_1
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 520
    :try_start_7
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    throw v1
    :try_end_7
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 543
    :cond_4
    :try_start_8
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 545
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 552
    :goto_2
    :try_start_9
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 556
    :catch_3
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v3

    :catchall_1
    nop

    goto :goto_3

    :catchall_2
    move-object v4, v3

    goto :goto_3

    :catch_4
    move-object v4, v3

    goto :goto_5

    :catch_5
    move-object v4, v3

    goto :goto_7

    :catchall_3
    move-object p2, v3

    move-object v4, p2

    :goto_3
    if-eqz v4, :cond_5

    .line 543
    :try_start_a
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    goto :goto_4

    :catch_6
    move-exception p1

    .line 545
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    if-eqz p2, :cond_6

    .line 552
    :try_start_b
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 556
    :catch_7
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    return-object v3

    :catch_8
    move-object p2, v3

    move-object v4, p2

    :catch_9
    :goto_5
    :try_start_c
    const-string p1, "A_10200"

    .line 533
    invoke-static {p1, v2, v0}, Lcom/umeng/commonsdk/debug/UMLog;->aq(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    if-eqz v4, :cond_7

    .line 543
    :try_start_d
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    goto :goto_6

    :catch_a
    move-exception p1

    .line 545
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_7
    :goto_6
    if-eqz p2, :cond_8

    .line 552
    :try_start_e
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 556
    :catch_b
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    return-object v3

    :catch_c
    move-object p2, v3

    move-object v4, p2

    :catch_d
    :goto_7
    :try_start_f
    const-string p1, "A_10201"

    .line 528
    invoke-static {p1, v2, v0}, Lcom/umeng/commonsdk/debug/UMLog;->aq(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    if-eqz v4, :cond_9

    .line 543
    :try_start_10
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    goto :goto_8

    :catch_e
    move-exception p1

    .line 545
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_9
    :goto_8
    if-eqz p2, :cond_a

    .line 552
    :try_start_11
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_f

    .line 556
    :catch_f
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_a
    return-object v3

    :catchall_4
    move-exception p1

    if-eqz v4, :cond_b

    .line 543
    :try_start_12
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_10

    goto :goto_9

    :catch_10
    move-exception v0

    .line 545
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->c:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_b
    :goto_9
    if-eqz p2, :cond_c

    .line 552
    :try_start_13
    invoke-virtual {p2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_11

    .line 556
    :catch_11
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_c
    throw p1
.end method

.method public a([BZZLjava/lang/String;)[B
    .locals 4

    .line 275
    sget v0, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    if-nez v0, :cond_0

    .line 276
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->a()V

    goto :goto_0

    .line 279
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_DEFAULT_URL:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 280
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->OVERSEA_SECONDARY_URL:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 281
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->b()V

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 285
    :goto_1
    sget-object v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_5

    .line 286
    aget-object v0, v2, v1

    if-eqz p3, :cond_1

    .line 288
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->d()V

    goto :goto_2

    .line 290
    :cond_1
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/c;->c()V

    .line 0
    :goto_2
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 292
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 294
    invoke-virtual {p0, p1, v0}, Lcom/umeng/commonsdk/statistics/internal/c;->a([BLjava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_3

    .line 297
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz p1, :cond_2

    .line 298
    invoke-interface {p1, p2}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestSucceed(Z)V

    :cond_2
    return-object v0

    .line 302
    :cond_3
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/internal/c;->d:Lcom/umeng/commonsdk/statistics/internal/b;

    if-eqz v2, :cond_4

    .line 303
    invoke-interface {v2}, Lcom/umeng/commonsdk/statistics/internal/b;->onRequestFailed()V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    return-object v0
.end method
