.class public final Ll/۠ܺ֡;
.super Ljava/net/Socket;
.source "196G"


# instance fields
.field public final ᩸:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/net/Socket;-><init>()V

    const-string v0, "delegate"

    .line 40
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public final bind(Ljava/net/SocketAddress;)V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    return-void
.end method

.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final connect(Ljava/net/SocketAddress;)V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;)V

    return-void
.end method

.method public final connect(Ljava/net/SocketAddress;I)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1, p2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public final getChannel()Ljava/nio/channels/SocketChannel;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    return-object v0
.end method

.method public final getInetAddress()Ljava/net/InetAddress;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 39
    new-instance v0, Ljava/util/zip/InflaterInputStream;

    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final getKeepAlive()Z
    .locals 1

    .line 80
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getKeepAlive()Z

    move-result v0

    return v0
.end method

.method public final getLocalAddress()Ljava/net/InetAddress;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalPort()I
    .locals 1

    .line 90
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalPort()I

    move-result v0

    return v0
.end method

.method public final getLocalSocketAddress()Ljava/net/SocketAddress;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public final getOOBInline()Z
    .locals 1

    .line 100
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOOBInline()Z

    move-result v0

    return v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 2

    .line 44
    new-instance v0, Ljava/util/zip/DeflaterOutputStream;

    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public final getPort()I
    .locals 1

    .line 110
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getPort()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized getReceiveBufferSize()I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 115
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getReceiveBufferSize()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final getRemoteSocketAddress()Ljava/net/SocketAddress;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public final getReuseAddress()Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getReuseAddress()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized getSendBufferSize()I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 130
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getSendBufferSize()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final getSoLinger()I
    .locals 1

    .line 135
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getSoLinger()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized getSoTimeout()I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 140
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getSoTimeout()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final getTcpNoDelay()Z
    .locals 1

    .line 145
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getTcpNoDelay()Z

    move-result v0

    return v0
.end method

.method public final getTrafficClass()I
    .locals 1

    .line 150
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getTrafficClass()I

    move-result v0

    return v0
.end method

.method public final isBound()Z
    .locals 1

    .line 155
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isBound()Z

    move-result v0

    return v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 160
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    return v0
.end method

.method public final isConnected()Z
    .locals 1

    .line 165
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    move-result v0

    return v0
.end method

.method public final isInputShutdown()Z
    .locals 1

    .line 170
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    return v0
.end method

.method public final isOutputShutdown()Z
    .locals 1

    .line 175
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    return v0
.end method

.method public final sendUrgentData(I)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->sendUrgentData(I)V

    return-void
.end method

.method public final setKeepAlive(Z)V
    .locals 1

    .line 185
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setKeepAlive(Z)V

    return-void
.end method

.method public final setOOBInline(Z)V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setOOBInline(Z)V

    return-void
.end method

.method public final setPerformancePreferences(III)V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/Socket;->setPerformancePreferences(III)V

    return-void
.end method

.method public final declared-synchronized setReceiveBufferSize(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 200
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1, p1}, Ljava/net/Socket;->setReceiveBufferSize(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setReuseAddress(Z)V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setReuseAddress(Z)V

    return-void
.end method

.method public final declared-synchronized setSendBufferSize(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 210
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1, p1}, Ljava/net/Socket;->setSendBufferSize(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setSoLinger(ZI)V
    .locals 1

    .line 215
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1, p2}, Ljava/net/Socket;->setSoLinger(ZI)V

    return-void
.end method

.method public final declared-synchronized setSoTimeout(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 220
    :try_start_0
    iget-object v1, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v1, p1}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setTcpNoDelay(Z)V
    .locals 1

    .line 225
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-void
.end method

.method public final setTrafficClass(I)V
    .locals 1

    .line 230
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setTrafficClass(I)V

    return-void
.end method

.method public final shutdownInput()V
    .locals 1

    .line 235
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V

    return-void
.end method

.method public final shutdownOutput()V
    .locals 1

    .line 240
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->shutdownOutput()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/۠ܺ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
