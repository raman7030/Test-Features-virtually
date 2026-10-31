.class public Ll/ᩴܽ֡;
.super Ljava/lang/Object;
.source "45RK"


# static fields
.field public static final ֫:Ll/ᩴܽ֡;

.field public static final ۧ:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const-string v0, "java.vm.name"

    .line 211
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dalvik"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_7

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "com.android.org.conscrypt.SSLParametersImpl"

    if-nez v1, :cond_0

    goto :goto_1

    .line 469
    :cond_0
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    const/16 v7, 0x1d

    if-lt v1, v7, :cond_1

    .line 80
    :try_start_1
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 82
    new-instance v1, Ll/ܿܽ֡;

    .line 32
    invoke-direct {v1, v4, v4, v4, v4}, Ll/᩷ܽ֡;-><init>(Ll/ۘܽ֡;Ll/ۘܽ֡;Ll/ۘܽ֡;Ll/ۘܽ֡;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    :cond_1
    :goto_1
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_2

    goto/16 :goto_c

    .line 240
    :cond_2
    const-class v1, [B

    .line 211
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_7

    :cond_3
    const-string v0, "com.android.org.conscrypt.SSLParametersImpl"

    .line 248
    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    :try_start_3
    const-string v0, "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"

    .line 251
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 255
    :goto_3
    new-instance v0, Ll/ۘܽ֡;

    const-string v2, "setUseSessionTickets"

    new-array v6, v3, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v5

    invoke-direct {v0, v4, v2, v6}, Ll/ۘܽ֡;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 257
    new-instance v2, Ll/ۘܽ֡;

    const-string v6, "setHostname"

    new-array v7, v3, [Ljava/lang/Class;

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v5

    invoke-direct {v2, v4, v6, v7}, Ll/ۘܽ֡;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    const-string v6, "GMSCore_OpenSSL"

    .line 215
    invoke-static {v6}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    :try_start_4
    const-string v6, "android.net.Network"

    .line 219
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_3

    :goto_4
    const/4 v6, 0x1

    goto :goto_5

    :catch_3
    const/4 v6, 0x0

    :goto_5
    if-eqz v6, :cond_5

    .line 263
    :try_start_5
    new-instance v6, Ll/ۘܽ֡;

    const-string v7, "getAlpnSelectedProtocol"

    new-array v8, v5, [Ljava/lang/Class;

    invoke-direct {v6, v1, v7, v8}, Ll/ۘܽ֡;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 265
    new-instance v7, Ll/ۘܽ֡;

    const-string v8, "setAlpnProtocols"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v1, v3, v5

    invoke-direct {v7, v4, v8, v3}, Ll/ۘܽ֡;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    goto :goto_6

    :cond_5
    move-object v6, v4

    move-object v7, v6

    .line 269
    :goto_6
    new-instance v1, Ll/᩷ܽ֡;

    invoke-direct {v1, v0, v2, v6, v7}, Ll/᩷ܽ֡;-><init>(Ll/ۘܽ֡;Ll/ۘܽ֡;Ll/ۘܽ֡;Ll/ۘܽ֡;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_4

    move-object v4, v1

    goto :goto_7

    :catch_4
    nop

    :goto_7
    if-eqz v4, :cond_6

    :goto_8
    move-object v1, v4

    goto/16 :goto_c

    .line 249
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "No platform found on Android"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_7
    const-class v0, Ljavax/net/ssl/SSLSocket;

    const-string v1, "okhttp.platform"

    .line 190
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "conscrypt"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    goto :goto_9

    .line 195
    :cond_8
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v1}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Conscrypt"

    .line 196
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_9
    if-eqz v1, :cond_9

    .line 216
    invoke-static {}, Ll/ۢܽ֡;->ᩳ()Ll/ۢܽ֡;

    move-result-object v1

    if-eqz v1, :cond_9

    goto :goto_c

    .line 96
    :cond_9
    :try_start_6
    const-class v1, Ljavax/net/ssl/SSLParameters;

    const-string v2, "setApplicationProtocols"

    new-array v6, v3, [Ljava/lang/Class;

    const-class v7, [Ljava/lang/String;

    aput-object v7, v6, v5

    .line 97
    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v2, "getApplicationProtocol"

    .line 98
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 100
    new-instance v6, Ll/ۡܽ֡;

    invoke-direct {v6, v1, v2}, Ll/ۡܽ֡;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5

    move-object v1, v6

    goto :goto_a

    :catch_5
    move-object v1, v4

    :goto_a
    if-eqz v1, :cond_a

    goto :goto_c

    :cond_a
    const-string v1, "org.eclipse.jetty.alpn.ALPN"

    .line 89
    :try_start_7
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "org.eclipse.jetty.alpn.ALPN$Provider"

    .line 90
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v6, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    .line 91
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const-string v6, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    .line 92
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const-string v6, "put"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Class;

    aput-object v0, v7, v5

    aput-object v2, v7, v3

    .line 93
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v2, "get"

    new-array v6, v3, [Ljava/lang/Class;

    aput-object v0, v6, v5

    .line 94
    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    const-string v2, "remove"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v5

    .line 95
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    .line 96
    new-instance v0, Ll/ۖܽ֡;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ۖܽ֡;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_6

    move-object v4, v0

    goto :goto_b

    :catch_6
    nop

    :goto_b
    if-eqz v4, :cond_b

    goto/16 :goto_8

    .line 236
    :cond_b
    new-instance v1, Ll/ᩴܽ֡;

    invoke-direct {v1}, Ll/ᩴܽ֡;-><init>()V

    .line 78
    :goto_c
    sput-object v1, Ll/ᩴܽ֡;->֫:Ll/ᩴܽ֡;

    .line 81
    const-class v0, Ll/ܿ۟᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ᩴܽ֡;->ۧ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 164
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ۟᩵;

    .line 165
    sget-object v4, Ll/ܳ۟᩵;->ۙ:Ll/ܳ۟᩵;

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 166
    :cond_0
    invoke-virtual {v3}, Ll/ܳ۟᩵;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ܽ()Ll/ᩴܽ֡;
    .locals 1

    .line 84
    sget-object v0, Ll/ᩴܽ֡;->֫:Ll/ᩴܽ֡;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 319
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljavax/net/ssl/SSLContext;
    .locals 3

    const-string v0, "java.specification.version"

    .line 294
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1.7"

    .line 295
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "TLSv1.2"

    .line 298
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    :try_start_1
    const-string v0, "TLS"

    .line 305
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    .line 307
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No TLS provider"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ֫(Ljavax/net/ssl/X509TrustManager;)Ll/֨ܽ֡;
    .locals 1

    .line 172
    new-instance v0, Ll/֡ܽ֡;

    invoke-virtual {p0, p1}, Ll/ᩴܽ֡;->ۧ(Ljavax/net/ssl/X509TrustManager;)Ll/ܶܽ֡;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/֡ܽ֡;-><init>(Ll/ܶܽ֡;)V

    return-object v0
.end method

.method public ֫(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 133
    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 134
    :goto_0
    sget-object v0, Ll/ᩴܽ֡;->ۧ:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string v0, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const/4 v0, 0x5

    .line 158
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, v0, p2, p1}, Ll/ᩴܽ֡;->֫(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ֫(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0

    .line 129
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public ֫(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    return-void
.end method

.method public ֫(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public ֫(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 2

    .line 147
    sget-object v0, Ll/ᩴܽ֡;->ۧ:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "response.body().close()"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۧ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۧ(Ljavax/net/ssl/X509TrustManager;)Ll/ܶܽ֡;
    .locals 1

    .line 312
    new-instance v0, Ll/ۚܽ֡;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۚܽ֡;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method
