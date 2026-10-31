.class public final Ll/ܰ֨ۢ;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "A9AU"


# instance fields
.field public final ֫:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 13
    iput-object p1, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method


# virtual methods
.method public final createSocket()Ljava/net/Socket;
    .locals 2

    .line 28
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object v0
.end method

.method public final createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 44
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 52
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 59
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 67
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 37
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getDefaultCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ܰ֨ۢ;->֫:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
