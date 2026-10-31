.class public final synthetic Ll/ۛ۬ᩳ;
.super Ljava/lang/Object;
.source "T6QB"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;)V
    .locals 7

    const-string v0, "Failed to close recovery directory: "

    const-string v1, "Failed to sync recovery directory: "

    const-string v2, "java.vm.name"

    .line 40
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Dalvik"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    const/4 v0, 0x1

    new-array v1, v0, [Ll/᩻۠ᩴ;

    .line 41
    sget-object v2, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v2, v1, v3

    invoke-static {p0, v1}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/nio/channels/FileChannel;->force(Z)V
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

    .line 46
    :cond_1
    :try_start_2
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    sget v4, Landroid/system/OsConstants;->O_RDONLY:I

    invoke-static {v2, v4, v3}, Landroid/system/Os;->open(Ljava/lang/String;II)Ljava/io/FileDescriptor;

    move-result-object v2
    :try_end_2
    .catch Landroid/system/ErrnoException; {:try_start_2 .. :try_end_2} :catch_3

    const/4 v3, 0x0

    .line 52
    :try_start_3
    invoke-static {v2}, Landroid/system/Os;->fsync(Ljava/io/FileDescriptor;)V
    :try_end_3
    .catch Landroid/system/ErrnoException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 57
    :try_start_4
    invoke-static {v2}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_4
    .catch Landroid/system/ErrnoException; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 59
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    throw v2

    :catchall_2
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v4

    .line 54
    :try_start_5
    new-instance v5, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 55
    :try_start_6
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v1

    move-object v3, v5

    .line 57
    :goto_1
    :try_start_7
    invoke-static {v2}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_7
    .catch Landroid/system/ErrnoException; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_2

    :catch_2
    move-exception v2

    .line 59
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v3, :cond_2

    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 63
    :goto_2
    throw v1

    .line 61
    :cond_2
    throw v4

    :catch_3
    move-exception v0

    .line 48
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to open recovery directory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫(Ll/᩷۠ᩴ;[B)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 25
    sget-object v1, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    .line 26
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 27
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

    const-string v0, "Recovery entry write made no progress"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_1
    invoke-virtual {p0, v2}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_2

    .line 25
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
