.class public final Ll/۠ۛۡ;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "1B8U"


# static fields
.field public static ۧ:[Ljava/lang/String;


# instance fields
.field public ֫:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 31
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/SSLSocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_2

    .line 36
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 37
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSupportedProtocols()[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    .line 38
    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    const-string v7, "SSL"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 39
    invoke-virtual {v1, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v3, [Ljava/lang/String;

    .line 40
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    move-exception v0

    .line 44
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫()Ll/ᩳ۟᩵;
    .locals 7

    .line 118
    new-instance v0, Ll/֨ۛۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 137
    new-instance v1, Ll/ᩳ۟᩵;

    invoke-direct {v1}, Ll/ᩳ۟᩵;-><init>()V

    .line 142
    :try_start_0
    new-instance v2, Ll/۠ۛۡ;

    .line 48
    invoke-direct {v2}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v3, "TLS"

    .line 50
    invoke-static {v3}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljavax/net/ssl/X509TrustManager;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    .line 51
    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {v3, v6, v4, v5}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 52
    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iput-object v3, v2, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 143
    :try_start_2
    invoke-virtual {v1, v2, v0}, Ll/ᩳ۟᩵;->֫(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    return-object v1

    .line 54
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    .line 145
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    .line 88
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 89
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 62
    sget-object v0, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p2, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 96
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 97
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 62
    sget-object p3, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 63
    invoke-virtual {p2, p3}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 104
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 105
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 62
    sget-object v0, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p2, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 112
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 113
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 62
    sget-object p3, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 63
    invoke-virtual {p2, p3}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/۠ۛۡ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p1

    .line 80
    instance-of p2, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz p2, :cond_0

    .line 81
    move-object p2, p1

    check-cast p2, Ljavax/net/ssl/SSLSocket;

    .line 62
    sget-object p3, Ll/۠ۛۡ;->ۧ:[Ljava/lang/String;

    if-eqz p3, :cond_0

    .line 63
    invoke-virtual {p2, p3}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
