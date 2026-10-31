.class public final Ll/֫ܽۜ;
.super Ljava/lang/Object;
.source "S76S"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    const-string v0, "cache"

    .line 34
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resource_arsc"

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resources.arsc.bin"

    .line 35
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;[B[B)V
    .locals 5

    const-string v0, "cache"

    .line 34
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resource_arsc"

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resources.arsc.bin"

    .line 35
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    const-string v0, ".resource_arsc"

    .line 87
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 110
    :try_start_1
    new-instance v3, Ll/ۤۜܽ;

    const/16 v4, 0x40

    invoke-direct {v3, v4}, Ll/ۤۜܽ;-><init>(I)V

    const v4, 0x4d524143    # 2.20468272E8f

    .line 111
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v4, 0x1

    .line 112
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 113
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 114
    invoke-virtual {v3, p1}, Ll/ۤۜܽ;->write([B)V

    .line 115
    array-length p1, p2

    invoke-virtual {v3, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 116
    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    .line 117
    invoke-virtual {v2, p2}, Ljava/io/OutputStream;->write([B)V

    .line 119
    invoke-virtual {v3}, Ll/ۤۜܽ;->ᩳ()V

    .line 125
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 126
    invoke-virtual {p1, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 127
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p1

    long-to-int p2, p1

    .line 120
    invoke-virtual {v3, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 121
    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    const/4 p1, 0x0

    .line 92
    invoke-virtual {v0, p0, v1, v4, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 131
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 132
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    if-eqz v2, :cond_1

    .line 89
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    .line 131
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 132
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 95
    :cond_2
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;[B)[B
    .locals 8

    const-string v0, "cache"

    .line 34
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resource_arsc"

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "resources.arsc.bin"

    .line 35
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 48
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    const/16 v3, 0x30

    new-array v4, v3, [B

    .line 51
    invoke-virtual {v0, v4}, Ljava/io/DataInputStream;->readFully([B)V

    .line 52
    new-instance v5, Ll/۬ۜܽ;

    invoke-direct {v5, v4}, Ll/۬ۜܽ;-><init>([B)V

    .line 53
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    const v6, 0x4d524143    # 2.20468272E8f

    if-ne v4, v6, :cond_4

    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_4

    .line 54
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    if-ne v4, v6, :cond_4

    const/16 v4, 0x20

    new-array v6, v4, [B

    .line 61
    invoke-virtual {v5, v4, v6}, Ll/۬ۜܽ;->֫(I[B)V

    .line 59
    invoke-static {v6, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 62
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    if-ltz p1, :cond_2

    int-to-long v4, p1

    int-to-long v6, v3

    sub-long/2addr v1, v6

    const-wide/16 v6, 0x4

    sub-long/2addr v1, v6

    cmp-long v3, v4, v1

    if-nez v3, :cond_2

    .line 66
    new-array p1, p1, [B

    .line 67
    invoke-virtual {v0, p1}, Ljava/io/DataInputStream;->readFully([B)V

    const/4 v1, 0x4

    new-array v1, v1, [B

    .line 69
    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 70
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v1}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 71
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 125
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 126
    invoke-virtual {v2, p1}, Ljava/util/zip/CRC32;->update([B)V

    .line 127
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    long-to-int v3, v2

    if-ne v3, v1, :cond_1

    .line 75
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    .line 72
    :cond_1
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Resource ARSC cache CRC mismatch"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Invalid resource ARSC cache payload length"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Resource ARSC cache input hash mismatch"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Unsupported resource ARSC cache format"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 48
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 131
    :catch_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 132
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method
