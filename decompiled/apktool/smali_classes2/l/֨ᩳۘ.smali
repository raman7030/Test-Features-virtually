.class public final Ll/֨ᩳۘ;
.super Ljava/lang/Object;
.source "F9E6"


# instance fields
.field public final ֫:Ll/᩸ۘܺ;

.field public ۜ:Ljavax/net/SocketFactory;

.field public final ۧ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public ܳ:I

.field public final ܽ:Ll/֫᩻֨;

.field public ܿ:Ll/ۚᩳۘ;

.field public ᩳ:Ljava/io/BufferedOutputStream;

.field public ᩻:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljavax/net/SocketFactory;ILl/᩸ۘܺ;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const-class v0, Ll/֨ᩳۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    iput-object v0, p0, Ll/֨ᩳۘ;->ܽ:Ll/֫᩻֨;

    .line 48
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/֨ᩳۘ;->ۧ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 50
    new-instance v0, Ll/᩷۟ۖ;

    invoke-direct {v0}, Ll/᩷۟ۖ;-><init>()V

    .line 61
    iput p2, p0, Ll/֨ᩳۘ;->ܳ:I

    .line 62
    iput-object p1, p0, Ll/֨ᩳۘ;->ۜ:Ljavax/net/SocketFactory;

    .line 63
    iput-object p3, p0, Ll/֨ᩳۘ;->֫:Ll/᩸ۘܺ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 144
    invoke-virtual {p0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۘ;->ۧ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 151
    :try_start_0
    invoke-virtual {p0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 155
    :cond_1
    iget-object v1, p0, Ll/֨ᩳۘ;->ܿ:Ll/ۚᩳۘ;

    invoke-virtual {v1}, Ll/֡ᩳۘ;->ܽ()V

    .line 157
    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 158
    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 161
    :cond_2
    iget-object v1, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 162
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 163
    iput-object v2, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    .line 166
    :cond_3
    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    if-eqz v1, :cond_4

    .line 167
    invoke-virtual {v1}, Ljava/net/Socket;->close()V

    .line 168
    iput-object v2, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    :cond_4
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 172
    throw v1
.end method

.method public final ֫(Ljava/net/InetSocketAddress;)V
    .locals 4

    .line 129
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getHostString()Ljava/lang/String;

    move-result-object v0

    .line 130
    iget-object v1, p0, Ll/֨ᩳۘ;->ۜ:Ljavax/net/SocketFactory;

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p1

    invoke-virtual {v1, v0, p1}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    .line 135
    iget v1, p0, Ll/֨ᩳۘ;->ܳ:I

    invoke-virtual {p1, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 136
    new-instance p1, Ljava/io/BufferedOutputStream;

    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    const/16 v2, 0x2328

    invoke-direct {p1, v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    iput-object p1, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    .line 137
    new-instance p1, Ll/ۚᩳۘ;

    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, Ll/֨ᩳۘ;->֫:Ll/᩸ۘܺ;

    invoke-virtual {v2}, Ll/᩸ۘܺ;->֫()Ll/ۢ۟ۖ;

    move-result-object v3

    invoke-virtual {v2}, Ll/᩸ۘܺ;->ۧ()Ll/ۡ۟ۖ;

    move-result-object v2

    invoke-direct {p1, v0, v1, v3, v2}, Ll/ۚᩳۘ;-><init>(Ljava/lang/String;Ljava/io/InputStream;Ll/ۢ۟ۖ;Ll/ۡ۟ۖ;)V

    iput-object p1, p0, Ll/֨ᩳۘ;->ܿ:Ll/ۚᩳۘ;

    .line 138
    invoke-virtual {p1}, Ll/֡ᩳۘ;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/֨֫ۘ;)V
    .locals 6

    const-string v0, "Acquiring write lock to send packet << {} >>"

    .line 68
    iget-object v1, p0, Ll/֨ᩳۘ;->ܽ:Ll/֫᩻֨;

    invoke-interface {v1, p1, v0}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 80
    iget-object v0, p0, Ll/֨ᩳۘ;->ۧ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 86
    :try_start_0
    invoke-virtual {p0}, Ll/֨ᩳۘ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v2, "Writing packet {}"

    .line 90
    invoke-interface {v1, p1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 94
    :try_start_1
    iget-object v2, p0, Ll/֨ᩳۘ;->֫:Ll/᩸ۘܺ;

    invoke-virtual {v2}, Ll/᩸ۘܺ;->ܽ()Ll/ܰۢܽ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v2, Ll/֡֫ۘ;

    invoke-virtual {p1}, Ll/֨֫ۘ;->ܽ()I

    move-result v4

    invoke-direct {v2, v4}, Ll/֡֫ۘ;-><init>(I)V

    .line 27
    invoke-interface {p1, v2}, Ll/֡ܰۖ;->֫(Ll/֡֫ۘ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    :try_start_2
    invoke-virtual {v2}, Ll/ۤܰۖ;->ܽ()I

    move-result v4

    .line 198
    iget-object v5, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    invoke-virtual {v5, v3}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 199
    iget-object v3, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    shr-int/lit8 v5, v4, 0x10

    int-to-byte v5, v5

    invoke-virtual {v3, v5}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 200
    iget-object v3, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    shr-int/lit8 v5, v4, 0x8

    int-to-byte v5, v5

    invoke-virtual {v3, v5}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 201
    iget-object v3, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    invoke-virtual {v3, v4}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 194
    iget-object v3, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    invoke-virtual {v2}, Ll/ۤܰۖ;->֫()[B

    move-result-object v4

    invoke-virtual {v2}, Ll/ۤܰۖ;->ۡ()I

    move-result v5

    invoke-virtual {v2}, Ll/ۤܰۖ;->ܽ()I

    move-result v2

    invoke-virtual {v3, v4, v5, v2}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 105
    iget-object v2, p0, Ll/֨ᩳۘ;->ᩳ:Ljava/io/BufferedOutputStream;

    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v2, "Packet {} sent, lock released."

    .line 111
    invoke-interface {v1, p1, v2}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 115
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    .line 110
    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 100
    throw p1

    .line 87
    :cond_0
    new-instance v1, Ll/ۖ۟ۖ;

    const-string v4, "Cannot write %s as transport got disconnected"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 113
    :try_start_5
    new-instance v1, Ll/ۖ۟ۖ;

    .line 35
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 113
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 115
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 116
    throw p1

    .line 77
    :cond_1
    new-instance v0, Ll/ۖ۟ۖ;

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v3

    const-string p1, "Cannot write %s as transport is disconnected"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    throw v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 177
    iget-object v0, p0, Ll/֨ᩳۘ;->ۧ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 179
    :try_start_0
    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/net/Socket;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/֨ᩳۘ;->᩻:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 181
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 182
    throw v1
.end method
