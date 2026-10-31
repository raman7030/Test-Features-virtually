.class public final Ll/ᩴ᩶ᩳ;
.super Ljava/lang/Object;
.source "46SG"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;[BZ)Ljava/util/UUID;
    .locals 11

    const-string v0, "migration.id"

    .line 82
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    const-string v1, "migration.id.tmp"

    invoke-interface {p0, v1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ll/ܳ۠ᩴ;

    .line 83
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v0, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    sget-object v5, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    if-eqz v4, :cond_1

    .line 84
    invoke-static {v0}, Ll/ᩴ᩶ᩳ;->֫(Ll/᩷۠ᩴ;)[B

    move-result-object p2

    invoke-static {p2, p1}, Ll/ᩴ᩶ᩳ;->֫([B[B)Ljava/util/UUID;

    move-result-object p1

    new-array p2, v3, [Ll/᩻۠ᩴ;

    .line 86
    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v1, p2, v6

    invoke-static {v0, p2}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2, v3}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 87
    invoke-interface {v5, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-object p1

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_0

    .line 86
    :try_start_1
    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p0

    :cond_1
    if-nez p2, :cond_9

    .line 91
    invoke-static {p0}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object p2

    .line 92
    :try_start_2
    invoke-interface {p2}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷۠ᩴ;

    .line 93
    invoke-interface {v7}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v7

    invoke-interface {v7}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "session.lock"

    .line 94
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    .line 95
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unidentified migration directory contains data"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 98
    :cond_4
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 99
    sget-object p2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    new-array v1, v3, [Ll/ܳ۠ᩴ;

    aput-object p2, v1, v6

    invoke-static {v2, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-array v1, v3, [Ll/ܳ۠ᩴ;

    aput-object p2, v1, v6

    .line 100
    invoke-static {v2, v1}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 102
    invoke-static {v2}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v7

    const-wide/16 v9, 0x40

    cmp-long p2, v7, v9

    if-nez p2, :cond_5

    .line 103
    invoke-static {v2}, Ll/ᩴ᩶ᩳ;->֫(Ll/᩷۠ᩴ;)[B

    move-result-object p2

    .line 104
    invoke-static {p2}, Ll/ᩴ᩶ᩳ;->֫([B)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p2, p1}, Ll/ᩴ᩶ᩳ;->֫([B[B)Ljava/util/UUID;

    .line 106
    :cond_5
    invoke-interface {v5, v2}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    .line 107
    invoke-interface {v5, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    goto :goto_2

    .line 100
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Migration identity temporary is not a regular file"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 109
    :cond_7
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    .line 117
    new-instance v1, Ll/ۤۜܽ;

    const/16 v4, 0x40

    invoke-direct {v1, v4}, Ll/ۤۜܽ;-><init>(I)V

    const v4, 0x4d324449    # 1.86926224E8f

    .line 118
    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 119
    invoke-virtual {p2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {p2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 44
    array-length v3, p1

    invoke-virtual {v1, p1, v6, v3}, Ll/ۤۜܽ;->write([BII)V

    .line 120
    invoke-virtual {v1, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 121
    invoke-virtual {v1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {v1}, Ll/ۤۜܽ;->size()I

    move-result v3

    invoke-static {v6, v3, p1}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 122
    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    .line 110
    invoke-interface {v5, v2, p1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;[B)V

    .line 111
    invoke-interface {v5, v2, v0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    .line 112
    invoke-interface {v5, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-object p2

    :catchall_2
    move-exception p0

    if-eqz p2, :cond_8

    .line 91
    :try_start_3
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw p0

    .line 90
    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Existing recovery entry has no migration identity"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([B[B)Ljava/util/UUID;
    .locals 5

    .line 150
    invoke-static {p0}, Ll/ᩴ᩶ᩳ;->֫([B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    const-wide/16 v1, 0x8

    .line 152
    invoke-virtual {v0, v1, v2}, Ll/۬ۜܽ;->seek(J)V

    .line 153
    new-instance p0, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    const/16 v1, 0x20

    new-array v2, v1, [B

    .line 212
    invoke-virtual {v0, v1, v2}, Ll/۬ۜܽ;->֫(I[B)V

    .line 155
    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Migration belongs to a different legacy source"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 150
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid migration identity format or checksum"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;[BLl/֨۬ᩳ;Ll/᩸ۘᩳ;)Ll/ۖ᩶ᩳ;
    .locals 9

    .line 49
    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 50
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 52
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    .line 53
    invoke-static {p0}, Ll/۟ۙᩳ;->ܿ(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 57
    :try_start_0
    invoke-virtual {v0}, Ll/۟ۙᩳ;->ܽ()Z

    move-result v2

    invoke-static {p0, p1, v2}, Ll/ᩴ᩶ᩳ;->֫(Ll/᩷۠ᩴ;[BZ)Ljava/util/UUID;

    move-result-object p1

    .line 58
    invoke-virtual {v0}, Ll/۟ۙᩳ;->ܽ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 59
    invoke-virtual {v0, p2, p1}, Ll/۟ۙᩳ;->֫(Ll/֨۬ᩳ;Ljava/util/UUID;)Ll/᩺ۙᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    :try_start_1
    iget-object v3, v2, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    .line 60
    new-instance v4, Ll/ۘ᩶ᩳ;

    invoke-direct {v4, v3, p0}, Ll/ۘ᩶ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/᩷۠ᩴ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 61
    :try_start_2
    invoke-virtual {p3, v4}, Ll/᩸ۘᩳ;->֫(Ll/ۘ᩶ᩳ;)V

    .line 62
    invoke-static {v4}, Ll/ۘ᩶ᩳ;->ᩳ(Ll/ۘ᩶ᩳ;)V

    .line 63
    new-instance p3, Ll/۫᩹ᩳ;

    invoke-static {v4}, Ll/ۘ᩶ᩳ;->ܽ(Ll/ۘ᩶ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v5

    const-wide/16 v6, 0x0

    invoke-direct {p3, v5, v6, v7}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 64
    :try_start_3
    new-instance v5, Ll/ۡۗᩳ;

    invoke-direct {v5, v3}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;)V

    invoke-static {v4}, Ll/ۘ᩶ᩳ;->ۧ(Ll/ۘ᩶ᩳ;)Ll/ۖۗᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۖۗᩳ;->֫()[B

    move-result-object v3

    invoke-static {v4}, Ll/ۘ᩶ᩳ;->֫(Ll/ۘ᩶ᩳ;)Ll/ۖۙᩳ;

    move-result-object v8

    invoke-virtual {v5, p3, v3, v8}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    :try_start_4
    invoke-virtual {p3}, Ll/۬᩹ᩳ;->close()V

    .line 66
    invoke-static {v4}, Ll/ۘ᩶ᩳ;->ۧ(Ll/ۘ᩶ᩳ;)Ll/ۖۗᩳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۖۗᩳ;->֫()[B

    move-result-object p3

    invoke-static {p3}, Ll/۫᩶ᩳ;->ۧ([B)Ll/۫᩶ᩳ;

    move-result-object p3

    invoke-virtual {p3, p0, p2}, Ll/۫᩶ᩳ;->ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V

    .line 67
    invoke-virtual {v0, v2, v6, v7}, Ll/۟ۙᩳ;->֫(Ll/᩺ۙᩳ;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 68
    :try_start_5
    invoke-virtual {v4}, Ll/ۘ᩶ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-virtual {v2}, Ll/᩺ۙᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    goto :goto_3

    :catchall_0
    move-exception p0

    .line 63
    :try_start_7
    invoke-virtual {p3}, Ll/۬᩹ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p0

    .line 59
    :try_start_9
    invoke-virtual {v4}, Ll/ۘ᩶ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    :try_start_a
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception p0

    :try_start_b
    invoke-virtual {v2}, Ll/᩺ۙᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception p1

    :try_start_c
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    .line 70
    :cond_0
    :goto_3
    new-instance p3, Ll/ۖ᩶ᩳ;

    invoke-direct {p3, p0, v0, p1, p2}, Ll/ۖ᩶ᩳ;-><init>(Ll/᩷۠ᩴ;Ll/۟ۙᩳ;Ljava/util/UUID;Ll/֨۬ᩳ;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 71
    :try_start_d
    invoke-static {p3}, Ll/ۖ᩶ᩳ;->֫(Ll/ۖ᩶ᩳ;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    return-object p3

    :catchall_6
    move-exception p0

    move-object v1, p3

    goto :goto_4

    :catchall_7
    move-exception p0

    :goto_4
    if-nez v1, :cond_1

    .line 76
    invoke-virtual {v0}, Ll/۟ۙᩳ;->close()V

    goto :goto_5

    :cond_1
    invoke-virtual {v1}, Ll/ۖ᩶ᩳ;->close()V

    .line 78
    :goto_5
    throw p0

    .line 49
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Migration identity must have 32 bytes"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([B)Z
    .locals 6

    .line 143
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 144
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const v2, 0x4d324449    # 1.86926224E8f

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x38

    .line 145
    invoke-virtual {v0, v4, v5}, Ll/۬ۜܽ;->seek(J)V

    .line 146
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/16 v1, 0x3c

    invoke-static {v3, v1, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p0

    if-ne v0, p0, :cond_1

    return v2

    :cond_1
    :goto_0
    return v3
.end method

.method public static ֫(Ll/᩷۠ᩴ;)[B
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 126
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v0

    const-wide/16 v3, 0x40

    cmp-long v5, v0, v3

    if-nez v5, :cond_4

    new-array v0, v2, [Ll/᩻۠ᩴ;

    .line 129
    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p0

    const/16 v0, 0x40

    :try_start_0
    new-array v1, v0, [B

    :goto_0
    if-ge v2, v0, :cond_1

    rsub-int/lit8 v3, v2, 0x40

    .line 133
    invoke-virtual {p0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-lez v3, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 134
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration identity read made no progress"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 139
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v1

    .line 137
    :cond_2
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration identity changed during reading"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_3

    .line 129
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0

    .line 127
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid migration identity file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
