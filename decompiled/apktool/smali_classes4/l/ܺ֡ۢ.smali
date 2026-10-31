.class public final Ll/ܺ֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"


# virtual methods
.method public final ֫(Ljava/net/InetAddress;Ljava/net/InetAddress;)V
    .locals 4

    .line 712
    new-instance v0, Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V

    const/4 v1, 0x1

    .line 713
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setBroadcast(Z)V

    .line 714
    new-instance v1, Ljava/net/InetSocketAddress;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    .line 715
    new-instance p1, Ljava/net/DatagramPacket;

    invoke-static {}, Ll/᩵֡ۢ;->ܽ()[B

    move-result-object v1

    invoke-static {}, Ll/᩵֡ۢ;->ܽ()[B

    move-result-object v2

    array-length v2, v2

    const/16 v3, 0x9

    invoke-direct {p1, v1, v2, p2, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 716
    invoke-virtual {v0, p1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 717
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 712
    :try_start_1
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
