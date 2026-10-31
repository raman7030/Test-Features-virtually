.class public final synthetic Ll/ۗۘᩳ;
.super Ljava/lang/Object;
.source "06TX"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;)V
    .locals 3

    .line 209
    invoke-static {p0}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩻۠ᩴ;

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0, v2}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-void

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_0

    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;[B)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 201
    sget-object v1, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    .line 202
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 203
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "App migration write made no progress"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 204
    :cond_1
    invoke-virtual {p0, v2}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 201
    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
.end method
