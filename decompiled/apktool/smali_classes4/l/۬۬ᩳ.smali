.class public final Ll/۬۬ᩳ;
.super Ljava/lang/Object;
.source "M6UH"

# interfaces
.implements Ll/ۤ۬ᩳ;


# instance fields
.field public final ᩶:Ll/᩷۠ᩴ;

.field public final ᩸:Ljava/nio/channels/FileChannel;

.field public final ᩹:Ljava/nio/channels/FileLock;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Z)V
    .locals 4

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/۬۬ᩳ;->᩶:Ll/᩷۠ᩴ;

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    new-array p2, p2, [Ll/᩻۠ᩴ;

    .line 62
    sget-object v3, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    aput-object v3, p2, v2

    sget-object v2, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v2, p2, v1

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v1, p2, v0

    invoke-static {p1, p2}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array p2, v0, [Ll/᩻۠ᩴ;

    .line 64
    sget-object v0, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v0, p2, v2

    sget-object v0, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v0, p2, v1

    invoke-static {p1, p2}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    .line 66
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object p1

    iput-object p1, p0, Ll/۬۬ᩳ;->᩹:Ljava/nio/channels/FileLock;

    if-eqz p1, :cond_1

    return-void

    .line 67
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery file is already in use"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 69
    :goto_1
    iget-object p2, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 70
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 107
    iget-object v0, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    :try_start_0
    iget-object v1, p0, Ll/۬۬ᩳ;->᩹:Ljava/nio/channels/FileLock;

    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 110
    throw v1
.end method

.method public final length()J
    .locals 2

    .line 95
    iget-object v0, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public final truncate(J)V
    .locals 1

    .line 96
    iget-object v0, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0, p1, p2}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    return-void
.end method

.method public final ֫(JI[B)V
    .locals 2

    const/4 v0, 0x0

    .line 87
    invoke-static {p4, v0, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 88
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 89
    iget-object p4, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-lez p4, :cond_0

    int-to-long v0, p4

    add-long/2addr p1, v0

    goto :goto_0

    .line 90
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery write made no progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final ֫(J[BII)V
    .locals 0

    .line 76
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 77
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 78
    iget-object p4, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {p4, p3, p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-ltz p4, :cond_1

    if-eqz p4, :cond_0

    int-to-long p4, p4

    add-long/2addr p1, p4

    goto :goto_0

    .line 80
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery read made no progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated recovery file"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final ۘ֫()V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/۬۬ᩳ;->᩶:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ۛ۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public final ܺ()V
    .locals 2

    .line 97
    iget-object v0, p0, Ll/۬۬ᩳ;->᩸:Ljava/nio/channels/FileChannel;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    return-void
.end method
