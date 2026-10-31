.class public final Ll/ܿ۟᩵;
.super Ljava/lang/Object;
.source "V4F9"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۖ֫:Ljava/util/List;

.field public static final ۘ֫:Ljava/util/List;


# instance fields
.field public final ֫֫:Z

.field public final ۗ:Ll/᩻ܰ᩵;

.field public final ۙ:Ll/֨ܽ֡;

.field public final ۛ:Ll/᩵ܰ᩵;

.field public final ۜ֫:I

.field public final ۟:Z

.field public final ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

.field public final ۢ֫:Ljavax/net/SocketFactory;

.field public final ۤ:Ljava/util/List;

.field public final ۧ֫:Ljavax/net/ssl/HostnameVerifier;

.field public final ۨ:Ll/ۚܰ᩵;

.field public final ۫:Ll/ۡܰ᩵;

.field public final ۬:I

.field public final ܰ:Ll/᩹ܰ᩵;

.field public final ܳ֫:Ll/۬᩺᩵;

.field public final ܺ֫:I

.field public final ܽ֫:Ljava/util/List;

.field public final ܿ֫:Ljava/util/List;

.field public final ᩳ֫:Ljava/util/List;

.field public final ᩶:I

.field public final ᩷֫:Z

.field public final ᩸:Ll/۬᩺᩵;

.field public final ᩹:Ll/۟᩺᩵;

.field public final ᩺:Ll/۠ܰ᩵;

.field public final ᩻֫:Ljava/net/ProxySelector;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Ll/ܳ۟᩵;

    .line 127
    sget-object v2, Ll/ܳ۟᩵;->۬:Ll/ܳ۟᩵;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Ll/ܿ۟᩵;->ۘ֫:Ljava/util/List;

    new-array v0, v0, [Ll/ۖܰ᩵;

    .line 130
    sget-object v1, Ll/ۖܰ᩵;->᩻:Ll/ۖܰ᩵;

    aput-object v1, v0, v3

    sget-object v1, Ll/ۖܰ᩵;->ܿ:Ll/ۖܰ᩵;

    aput-object v1, v0, v4

    invoke-static {v0}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ܿ۟᩵;->ۖ֫:Ljava/util/List;

    .line 134
    new-instance v0, Ll/ܽ۟᩵;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 134
    sput-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 231
    new-instance v0, Ll/ᩳ۟᩵;

    invoke-direct {v0}, Ll/ᩳ۟᩵;-><init>()V

    invoke-direct {p0, v0}, Ll/ܿ۟᩵;-><init>(Ll/ᩳ۟᩵;)V

    return-void
.end method

.method public constructor <init>(Ll/ᩳ۟᩵;)V
    .locals 8

    const-string v0, "No System TLS"

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    iget-object v1, p1, Ll/ᩳ۟᩵;->ۢ:Ll/ۚܰ᩵;

    iput-object v1, p0, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 237
    iget-object v1, p1, Ll/ᩳ۟᩵;->ۚ:Ljava/util/List;

    iput-object v1, p0, Ll/ܿ۟᩵;->ܿ֫:Ljava/util/List;

    .line 238
    iget-object v1, p1, Ll/ᩳ۟᩵;->ۜ:Ljava/util/List;

    iput-object v1, p0, Ll/ܿ۟᩵;->ۤ:Ljava/util/List;

    .line 239
    iget-object v2, p1, Ll/ᩳ۟᩵;->᩵:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/ܿ۟᩵;->ܽ֫:Ljava/util/List;

    .line 240
    iget-object v2, p1, Ll/ᩳ۟᩵;->֡:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/ܿ۟᩵;->ᩳ֫:Ljava/util/List;

    .line 241
    iget-object v2, p1, Ll/ᩳ۟᩵;->ܺ:Ll/᩹ܰ᩵;

    iput-object v2, p0, Ll/ܿ۟᩵;->ܰ:Ll/᩹ܰ᩵;

    .line 242
    iget-object v2, p1, Ll/ᩳ۟᩵;->۠:Ljava/net/ProxySelector;

    iput-object v2, p0, Ll/ܿ۟᩵;->᩻֫:Ljava/net/ProxySelector;

    .line 243
    iget-object v2, p1, Ll/ᩳ۟᩵;->᩷:Ll/᩵ܰ᩵;

    iput-object v2, p0, Ll/ܿ۟᩵;->ۛ:Ll/᩵ܰ᩵;

    .line 244
    iget-object v2, p1, Ll/ᩳ۟᩵;->ۧ:Ll/۟᩺᩵;

    iput-object v2, p0, Ll/ܿ۟᩵;->᩹:Ll/۟᩺᩵;

    .line 246
    iget-object v2, p1, Ll/ᩳ۟᩵;->᩹:Ljavax/net/SocketFactory;

    iput-object v2, p0, Ll/ܿ۟᩵;->ۢ֫:Ljavax/net/SocketFactory;

    .line 249
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖܰ᩵;

    if-nez v3, :cond_1

    .line 127
    iget-boolean v3, v4, Ll/ۖܰ᩵;->ܽ:Z

    if-eqz v3, :cond_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    .line 253
    :cond_2
    iget-object v1, p1, Ll/ᩳ۟᩵;->᩶:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v4, 0x0

    if-nez v1, :cond_5

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "Unexpected default trust managers:"

    .line 670
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v3

    .line 669
    invoke-static {v3}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v3

    .line 671
    invoke-virtual {v3, v4}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 672
    invoke-virtual {v3}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v3

    .line 673
    array-length v6, v3

    if-ne v6, v5, :cond_4

    aget-object v6, v3, v2

    instance-of v7, v6, Ljavax/net/ssl/X509TrustManager;

    if-eqz v7, :cond_4

    .line 677
    check-cast v6, Ljavax/net/ssl/X509TrustManager;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 292
    :try_start_1
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴܽ֡;->֫()Ljavax/net/ssl/SSLContext;

    move-result-object v1

    new-array v3, v5, [Ljavax/net/ssl/TrustManager;

    aput-object v6, v3, v2

    .line 293
    invoke-virtual {v1, v4, v3, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 294
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 258
    iput-object v0, p0, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    invoke-virtual {v0, v6}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/X509TrustManager;)Ll/֨ܽ֡;

    move-result-object v0

    .line 259
    iput-object v0, p0, Ll/ܿ۟᩵;->ۙ:Ll/֨ܽ֡;

    goto :goto_2

    :catch_0
    move-exception p1

    .line 296
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    .line 674
    :cond_4
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 679
    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    .line 254
    :cond_5
    :goto_1
    iput-object v1, p0, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    .line 255
    iget-object v0, p1, Ll/ᩳ۟᩵;->ᩳ:Ll/֨ܽ֡;

    iput-object v0, p0, Ll/ܿ۟᩵;->ۙ:Ll/֨ܽ֡;

    .line 262
    :goto_2
    iget-object v0, p0, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_6

    .line 263
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    iget-object v1, p0, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 266
    :cond_6
    iget-object v0, p1, Ll/ᩳ۟᩵;->ᩴ:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Ll/ܿ۟᩵;->ۧ֫:Ljavax/net/ssl/HostnameVerifier;

    .line 267
    iget-object v0, p1, Ll/ᩳ۟᩵;->ܿ:Ll/᩻ܰ᩵;

    iget-object v1, p0, Ll/ܿ۟᩵;->ۙ:Ll/֨ܽ֡;

    invoke-virtual {v0, v1}, Ll/᩻ܰ᩵;->֫(Ll/֨ܽ֡;)Ll/᩻ܰ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ۟᩵;->ۗ:Ll/᩻ܰ᩵;

    .line 269
    iget-object v0, p1, Ll/ᩳ۟᩵;->֨:Ll/۬᩺᩵;

    iput-object v0, p0, Ll/ܿ۟᩵;->ܳ֫:Ll/۬᩺᩵;

    .line 270
    iget-object v0, p1, Ll/ᩳ۟᩵;->֫:Ll/۬᩺᩵;

    iput-object v0, p0, Ll/ܿ۟᩵;->᩸:Ll/۬᩺᩵;

    .line 271
    iget-object v0, p1, Ll/ᩳ۟᩵;->᩻:Ll/ۡܰ᩵;

    iput-object v0, p0, Ll/ܿ۟᩵;->۫:Ll/ۡܰ᩵;

    .line 272
    iget-object v0, p1, Ll/ᩳ۟᩵;->ۡ:Ll/۠ܰ᩵;

    iput-object v0, p0, Ll/ܿ۟᩵;->᩺:Ll/۠ܰ᩵;

    .line 273
    iget-boolean v0, p1, Ll/ᩳ۟᩵;->ۘ:Z

    iput-boolean v0, p0, Ll/ܿ۟᩵;->֫֫:Z

    .line 274
    iget-boolean v0, p1, Ll/ᩳ۟᩵;->ۖ:Z

    iput-boolean v0, p0, Ll/ܿ۟᩵;->۟:Z

    .line 275
    iget-boolean v0, p1, Ll/ᩳ۟᩵;->᩸:Z

    iput-boolean v0, p0, Ll/ܿ۟᩵;->᩷֫:Z

    .line 276
    iget v0, p1, Ll/ᩳ۟᩵;->ܽ:I

    iput v0, p0, Ll/ܿ۟᩵;->᩶:I

    .line 277
    iget v0, p1, Ll/ᩳ۟᩵;->ܳ:I

    iput v0, p0, Ll/ܿ۟᩵;->۬:I

    .line 278
    iget v0, p1, Ll/ᩳ۟᩵;->ܶ:I

    iput v0, p0, Ll/ܿ۟᩵;->ۜ֫:I

    .line 279
    iget p1, p1, Ll/ᩳ۟᩵;->ۙ:I

    iput p1, p0, Ll/ܿ۟᩵;->ܺ֫:I

    .line 282
    iget-object p1, p0, Ll/ܿ۟᩵;->ܽ֫:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 285
    iget-object p1, p0, Ll/ܿ۟᩵;->ᩳ֫:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return-void

    .line 286
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ۟᩵;->ᩳ֫:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 283
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ۟᩵;->ܽ֫:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֡()Ljava/net/ProxySelector;
    .locals 1

    .line 330
    iget-object v0, p0, Ll/ܿ۟᩵;->᩻֫:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final ֨()Z
    .locals 1

    .line 386
    iget-boolean v0, p0, Ll/ܿ۟᩵;->᩷֫:Z

    return v0
.end method

.method public final ֫()Ll/۬᩺᩵;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/ܿ۟᩵;->᩸:Ll/۬᩺᩵;

    return-object v0
.end method

.method public final ֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;
    .locals 0

    .line 427
    invoke-static {p0, p1}, Ll/᩷۟᩵;->֫(Ll/ܿ۟᩵;Ll/ۡ۟᩵;)Ll/᩷۟᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۖ()Ll/ᩳ۟᩵;
    .locals 1

    .line 440
    new-instance v0, Ll/ᩳ۟᩵;

    invoke-direct {v0, p0}, Ll/ᩳ۟᩵;-><init>(Ll/ܿ۟᩵;)V

    return-object v0
.end method

.method public final ۘ()Ljava/util/List;
    .locals 1

    .line 394
    iget-object v0, p0, Ll/ܿ۟᩵;->ܿ֫:Ljava/util/List;

    return-object v0
.end method

.method public final ۚ()I
    .locals 1

    .line 312
    iget v0, p0, Ll/ܿ۟᩵;->ۜ֫:I

    return v0
.end method

.method public final ۜ()Ll/᩵ܰ᩵;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/ܿ۟᩵;->ۛ:Ll/᩵ܰ᩵;

    return-object v0
.end method

.method public final ۠()Ljavax/net/SocketFactory;
    .locals 1

    .line 350
    iget-object v0, p0, Ll/ܿ۟᩵;->ۢ֫:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 378
    iget-boolean v0, p0, Ll/ܿ۟᩵;->֫֫:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 382
    iget-boolean v0, p0, Ll/ܿ۟᩵;->۟:Z

    return v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 398
    iget-object v0, p0, Ll/ܿ۟᩵;->ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ܶ()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ܿ۟᩵;->ۡ֫:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final ܺ()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 358
    iget-object v0, p0, Ll/ܿ۟᩵;->ۧ֫:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final ܽ()Ll/᩻ܰ᩵;
    .locals 1

    .line 362
    iget-object v0, p0, Ll/ܿ۟᩵;->ۗ:Ll/᩻ܰ᩵;

    return-object v0
.end method

.method public final ܿ()Ll/ۡܰ᩵;
    .locals 1

    .line 374
    iget-object v0, p0, Ll/ܿ۟᩵;->۫:Ll/ۡܰ᩵;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 307
    iget v0, p0, Ll/ܿ۟᩵;->۬:I

    return v0
.end method

.method public final ᩵()Ll/۬᩺᩵;
    .locals 1

    .line 370
    iget-object v0, p0, Ll/ܿ۟᩵;->ܳ֫:Ll/۬᩺᩵;

    return-object v0
.end method

.method public final ᩷()Ll/۠ܰ᩵;
    .locals 1

    .line 346
    iget-object v0, p0, Ll/ܿ۟᩵;->᩺:Ll/۠ܰ᩵;

    return-object v0
.end method

.method public final ᩹()I
    .locals 1

    .line 317
    iget v0, p0, Ll/ܿ۟᩵;->ܺ֫:I

    return v0
.end method
