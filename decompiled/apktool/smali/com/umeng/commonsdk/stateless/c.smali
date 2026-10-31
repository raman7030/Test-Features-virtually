.class public Lcom/umeng/commonsdk/stateless/c;
.super Ljava/lang/Object;
.source "O464"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "10.0.0.172"

    .line 49
    iput-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->a:Ljava/lang/String;

    const/16 v0, 0x50

    .line 50
    iput v0, p0, Lcom/umeng/commonsdk/stateless/c;->b:I

    .line 55
    iput-object p1, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    return-void
.end method

.method private a()V
    .locals 3

    .line 70
    iget-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    const-string v1, "sl_domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 89
    iget-object v0, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    const-string v1, "sl_domain_p"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    iget-object v1, p0, Lcom/umeng/commonsdk/stateless/c;->c:Landroid/content/Context;

    const-string v3, "oversea_sl_domain_p"

    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 92
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 93
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    .line 95
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 96
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->assembleStatelessURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    .line 99
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    .line 102
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 103
    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    const-string v1, "460"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/umeng/commonsdk/statistics/b;->b:Ljava/lang/String;

    const-string v1, "461"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 105
    :cond_2
    sget-object v0, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    :cond_3
    return-void
.end method


# virtual methods
.method public a([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    const-string v0, "--->>> stateless: disconnect connection."

    const-string v1, "--->>> send stateless message success : "

    const-string v2, "ut/"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_9

    if-nez p2, :cond_0

    goto/16 :goto_a

    .line 150
    :cond_0
    sget v5, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    if-nez v5, :cond_1

    .line 152
    invoke-direct {p0}, Lcom/umeng/commonsdk/stateless/c;->a()V

    goto :goto_0

    .line 156
    :cond_1
    sget-object v5, Lcom/umeng/commonsdk/stateless/a;->k:Ljava/lang/String;

    sput-object v5, Lcom/umeng/commonsdk/stateless/a;->h:Ljava/lang/String;

    .line 157
    invoke-direct {p0}, Lcom/umeng/commonsdk/stateless/c;->b()V

    .line 161
    :goto_0
    sget-object v5, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    .line 163
    sget-object v6, Lcom/umeng/commonsdk/vchannel/a;->c:Ljava/lang/String;

    invoke-virtual {v6, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    move-object p3, v5

    .line 169
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "--->>> \u65e0\u72b6\u6001\u6536\u6570\u57df\u540d\uff1a"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "MobclickRT"

    invoke-static {v6, v5}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 177
    :try_start_0
    new-instance v7, Ljava/net/URL;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v7, p3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p3

    check-cast p3, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 179
    :try_start_1
    sget-object v7, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p3, v7}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v7, "TLS"

    .line 201
    invoke-static {v7}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v7

    .line 202
    new-instance v8, Ljava/security/SecureRandom;

    invoke-direct {v8}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v7, v5, v5, v8}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 203
    invoke-virtual {v7}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v7

    invoke-virtual {p3, v7}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    const-string v7, "X-Umeng-UTC"

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p3, v7, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Msg-Type"

    const-string v8, "envelope/json"

    .line 207
    invoke-virtual {p3, v7, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Content-Type"

    .line 208
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, v7, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "SM-IMP"

    const-string v2, "1"

    .line 211
    invoke-virtual {p3, p4, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p4, 0x7530

    .line 212
    invoke-virtual {p3, p4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 213
    invoke-virtual {p3, p4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string p4, "POST"

    .line 214
    invoke-virtual {p3, p4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 216
    invoke-virtual {p3, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 217
    invoke-virtual {p3, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 218
    invoke-virtual {p3, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 220
    invoke-virtual {p3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p4
    :try_end_1
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 221
    :try_start_2
    invoke-virtual {p4, p1}, Ljava/io/OutputStream;->write([B)V

    .line 222
    invoke-virtual {p4}, Ljava/io/OutputStream;->flush()V

    .line 224
    invoke-virtual {p3}, Ljava/net/URLConnection;->connect()V

    .line 226
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 v2, 0xc8

    if-ne p1, v2, :cond_3

    .line 229
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/umeng/commonsdk/stateless/a;->i:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 247
    :goto_2
    :try_start_3
    invoke-virtual {p4}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 254
    :catch_0
    :try_start_4
    invoke-static {v6, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move v4, v3

    goto :goto_8

    :catchall_1
    move-exception p1

    move-object v5, p4

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v5, p4

    goto :goto_5

    :catchall_2
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_5

    :catchall_3
    move-exception p1

    move-object p3, v5

    :goto_3
    :try_start_5
    const-string p2, "Exception,Failed to send message."

    .line 242
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v5, :cond_4

    .line 247
    :try_start_6
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_4

    :catch_3
    nop

    :cond_4
    :goto_4
    if-eqz p3, :cond_6

    goto :goto_7

    :catch_4
    move-exception p1

    move-object p3, v5

    :goto_5
    :try_start_7
    const-string p2, "SSLHandshakeException, Failed to send message."

    .line 240
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-eqz v5, :cond_5

    .line 247
    :try_start_8
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_6

    :catch_5
    nop

    :cond_5
    :goto_6
    if-eqz p3, :cond_6

    .line 254
    :goto_7
    :try_start_9
    invoke-static {v6, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    :cond_6
    :goto_8
    return v4

    :catchall_5
    move-exception p1

    if-eqz v5, :cond_7

    .line 247
    :try_start_a
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    goto :goto_9

    :catch_6
    nop

    :cond_7
    :goto_9
    if-eqz p3, :cond_8

    .line 254
    :try_start_b
    invoke-static {v6, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 259
    :catchall_6
    :cond_8
    throw p1

    :cond_9
    :goto_a
    new-array p1, v3, [Ljava/lang/Object;

    const-string p2, "[stateless] sendMessage, envelopeByte == null || path == null "

    aput-object p2, p1, v4

    const-string p2, "walle"

    .line 146
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return v4
.end method
