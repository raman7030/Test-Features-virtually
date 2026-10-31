.class public final Ll/۟֨ۢ;
.super Ljavax/net/SocketFactory;
.source "A9AT"


# instance fields
.field public final ֫:Ljavax/net/SocketFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljavax/net/SocketFactory;-><init>()V

    .line 17
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    return-void
.end method


# virtual methods
.method public final createSocket()Ljava/net/Socket;
    .locals 2

    .line 22
    iget-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object v0
.end method

.method public final createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 30
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 38
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 45
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/۟֨ۢ;->֫:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    const/4 p2, 0x1

    .line 53
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object p1
.end method
