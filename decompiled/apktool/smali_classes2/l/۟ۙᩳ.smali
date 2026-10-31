.class public final Ll/۟ۙᩳ;
.super Ljava/lang/Object;
.source "O6S3"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/᩷۠ᩴ;

.field public ۙ:Ll/ܰۙᩳ;

.field public volatile ۤ:Z

.field public final ۫:Ljava/nio/channels/FileChannel;

.field public final ۬:Ljava/nio/channels/FileLock;

.field public ᩶:Z

.field public ᩸:Ll/᩺ۙᩳ;

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Z)V
    .locals 5

    const-string v0, "Recovery directory is already in use"

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    iput-object p1, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string v1, "session.lock"

    .line 162
    invoke-interface {p1, v1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    new-array p2, p2, [Ll/᩻۠ᩴ;

    .line 163
    sget-object v4, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    aput-object v4, p2, v3

    sget-object v3, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v3, p2, v2

    sget-object v2, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v2, p2, v1

    invoke-static {p1, p2}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array p2, v1, [Ll/᩻۠ᩴ;

    .line 164
    sget-object v1, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v1, p2, v3

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v1, p2, v2

    invoke-static {p1, p2}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    .line 166
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۙᩳ;->۬:Ljava/nio/channels/FileLock;
    :try_end_0
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    return-void

    .line 168
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    .line 167
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 170
    :goto_1
    :try_start_2
    iget-object p2, p0, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_2

    :catch_4
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 171
    :goto_2
    throw p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;
    .locals 4

    .line 46
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ll/᩹۠ᩴ;

    .line 47
    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;

    .line 48
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v0

    sget-object v1, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v1, v0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 49
    new-instance v0, Ll/۟ۙᩳ;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Ll/۟ۙᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    .line 51
    :try_start_0
    iget-object v3, v0, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    invoke-virtual {v3, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 52
    invoke-interface {v1, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 55
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ll/۟ۙᩳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 56
    :goto_1
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/۟ۙᩳ;)Ll/᩺ۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/۟ۙᩳ;Ll/ܰۙᩳ;Ll/᩸۬ᩳ;Ljava/lang/Throwable;)V
    .locals 3

    move-object v0, p0

    .line 264
    monitor-enter v0

    .line 265
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/۟ۙᩳ;->ۤ:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    iget-object v2, p1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_1

    .line 267
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Obsolete recovery generation failed to close"

    invoke-direct {p1, p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    .line 268
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 270
    :cond_1
    :try_start_1
    iget-object p2, p2, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-direct {p0, p1, p2}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/֨۬ᩳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 271
    :try_start_2
    iput-object p1, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    .line 272
    :goto_0
    monitor-exit v0

    return-void

    .line 265
    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 272
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method private ֫(Ll/ܰۙᩳ;Ll/֨۬ᩳ;)V
    .locals 6

    .line 249
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-virtual {p0, p1}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 250
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v3, 0x1

    new-array v4, v3, [Ll/ܳ۠ᩴ;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v1, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    new-array v3, v3, [Ll/ܳ۠ᩴ;

    aput-object v2, v3, v5

    .line 251
    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 252
    invoke-static {v1, p2}, Ll/᩸۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object p2

    .line 253
    :try_start_0
    iget-object v2, p1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    iget-object v3, p2, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p1, Ll/ܰۙᩳ;->ۧ:J

    iget-wide v4, p2, Ll/᩸۬ᩳ;->ۨ:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    .line 256
    invoke-interface {v0, v1}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    .line 257
    iget-object p1, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    invoke-virtual {p2}, Ll/᩸۬ᩳ;->close()V

    return-void

    .line 254
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Obsolete recovery generation identity does not match"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 252
    :try_start_2
    invoke-virtual {p2}, Ll/᩸۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 251
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery generation is not a regular file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/ܰۙᩳ;Ll/֨۬ᩳ;Ljava/lang/Runnable;)V
    .locals 4

    .line 341
    invoke-virtual {p0, p1}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)Ll/۫۬ᩳ;

    move-result-object v0

    invoke-static {v0, p2}, Ll/᩸۬ᩳ;->ۧ(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object p2

    .line 342
    :try_start_0
    new-instance v0, Ll/ۡۗᩳ;

    invoke-direct {v0, p2, p3}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V

    sget-object p3, Ll/᩷ۗᩳ;->֫:Ll/᩷ۗᩳ;

    invoke-virtual {v0, p3}, Ll/ۡۗᩳ;->֫(Ll/᩷ۗᩳ;)Ll/ۢۗᩳ;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-wide v0, p3, Ll/ۢۗᩳ;->ۛ:J

    .line 343
    invoke-static {p1, p2, v0, v1}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/᩸۬ᩳ;J)V

    .line 344
    iget-wide v2, p1, Ll/ܰۙᩳ;->ܽ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    iget-wide v0, p3, Ll/ۢۗᩳ;->᩹:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    iget-object p1, p3, Ll/ۢۗᩳ;->ۤ:Ljava/io/IOException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_0

    .line 347
    :try_start_2
    invoke-virtual {p3}, Ll/ۢۗᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p2}, Ll/᩸۬ᩳ;->close()V

    return-void

    .line 345
    :cond_0
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Recovery candidate is not an exact complete commit"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 341
    :try_start_4
    invoke-virtual {p3}, Ll/ۢۗᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p3

    :try_start_5
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_6
    invoke-virtual {p2}, Ll/᩸۬ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static ֫(Ll/ܰۙᩳ;Ll/᩸۬ᩳ;J)V
    .locals 4

    .line 353
    iget-object v0, p0, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    iget-object v1, p1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ܰۙᩳ;->ۧ:J

    iget-wide v2, p1, Ll/᩸۬ᩳ;->ۨ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    iget-wide p0, p0, Ll/ܰۙᩳ;->ܽ:J

    cmp-long v0, p2, p0

    if-ltz v0, :cond_0

    return-void

    .line 354
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Recovery generation identity or acknowledged revision does not match entry"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۜ()V
    .locals 2

    .line 359
    iget-boolean v0, p0, Ll/۟ۙᩳ;->᩶:Z

    if-nez v0, :cond_1

    .line 364
    iget-boolean v0, p0, Ll/۟ۙᩳ;->ۤ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery entry publication requires reopening"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 359
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery directory is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/۟ۙᩳ;)Ll/ܰۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    return-object p0
.end method

.method public static ۧ([B)Ll/ܰۙᩳ;
    .locals 12

    .line 396
    array-length v0, p0

    const/16 v1, 0x50

    if-ne v0, v1, :cond_5

    .line 397
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 398
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const v2, 0x4544324d

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 399
    new-instance v4, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    invoke-direct {v4, v1, v2, v5, v6}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v5, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-direct {v5, v1, v2, v6, v7}, Ljava/util/UUID;-><init>(JJ)V

    .line 400
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v8

    const-wide/16 v1, 0x0

    cmp-long v3, v6, v1

    if-lez v3, :cond_3

    cmp-long v3, v8, v1

    if-ltz v3, :cond_3

    .line 402
    :goto_0
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v10, 0x4

    cmp-long v3, v1, v10

    if-lez v3, :cond_1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unsupported recovery entry fields"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 403
    :cond_1
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x4c

    invoke-static {v1, v2, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p0

    if-ne v0, p0, :cond_2

    .line 404
    new-instance p0, Ll/ܰۙᩳ;

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    return-object p0

    .line 403
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery entry checksum"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 401
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery entry generation"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 398
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unsupported recovery entry"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 396
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery entry length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/᩷۠ᩴ;)V
    .locals 6

    .line 75
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    .line 76
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x1

    new-array v3, v2, [Ll/ܳ۠ᩴ;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {p0, v3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    new-array v3, v2, [Ll/ܳ۠ᩴ;

    aput-object v1, v3, v4

    .line 77
    invoke-static {p0, v3}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "session.lock"

    .line 78
    invoke-interface {p0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v5, v2, [Ll/ܳ۠ᩴ;

    aput-object v1, v5, v4

    invoke-static {v3, v5}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "-deleted-"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 83
    new-instance v3, Ll/۟ۙᩳ;

    invoke-direct {v3, p0, v4}, Ll/۟ۙᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    :try_start_0
    new-array v2, v2, [Ll/᩺֨ᩴ;

    .line 84
    sget-object v5, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    aput-object v5, v2, v4

    invoke-static {p0, v1, v2}, Ll/ܿ۠ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)Ll/᩷۠ᩴ;

    .line 85
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 86
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V

    new-array v2, v4, [Ll/ۧ۠ᩴ;

    .line 87
    invoke-static {v1, v2}, Ll/ܿ۠ᩴ;->walk(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 88
    :try_start_1
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    invoke-static {v3}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 89
    :cond_1
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V

    .line 90
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_2

    .line 87
    :try_start_2
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p0

    :catchall_2
    move-exception p0

    .line 83
    :try_start_3
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    .line 79
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Recovery deletion requires an owned directory"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ܰۙᩳ;)[B
    .locals 4

    .line 381
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x4544324d

    .line 382
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    .line 383
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 384
    iget-object v1, p0, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 385
    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 386
    iget-object v1, p0, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 387
    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 388
    iget-wide v1, p0, Ll/ܰۙᩳ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 389
    iget-wide v1, p0, Ll/ܰۙᩳ;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 390
    :goto_0
    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result p0

    const/16 v1, 0x4c

    const/4 v2, 0x0

    if-ge p0, v1, :cond_0

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    .line 391
    :cond_0
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p0

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v1

    invoke-static {v2, v1, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 392
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0
.end method

.method public static ܳ(Ll/᩷۠ᩴ;)[B
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 368
    sget-object v1, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    .line 369
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x50

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    const/16 v0, 0x50

    new-array v0, v0, [B

    .line 371
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 372
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 373
    invoke-virtual {p0, v1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated recovery entry"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 375
    :cond_1
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v4, v2

    if-nez v1, :cond_2

    .line 377
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    return-object v0

    .line 375
    :cond_2
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery entry changed during reading"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery entry length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_4

    .line 368
    :try_start_2
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw v0
.end method

.method private ܽ(Ll/֨۬ᩳ;)I
    .locals 9

    .line 213
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    const/4 v1, 0x0

    .line 214
    iput-object v1, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    .line 215
    iget-object v1, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-static {v1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v2

    .line 216
    :try_start_0
    invoke-interface {v2}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷۠ᩴ;

    add-int/lit8 v5, v5, 0x1

    const/16 v7, 0x400

    if-gt v5, v7, :cond_2

    .line 218
    invoke-interface {v6}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v7

    invoke-interface {v7}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "entry.tmp"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_0

    .line 219
    :try_start_1
    invoke-interface {v0, v6}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    invoke-interface {v0, v1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v6

    .line 220
    :try_start_2
    iput-object v6, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    goto :goto_1

    .line 223
    :cond_0
    invoke-direct {p0, v6}, Ll/۟ۙᩳ;->ܽ(Ll/᩷۠ᩴ;)Ll/ܰۙᩳ;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v6, :cond_1

    goto :goto_0

    .line 225
    :cond_1
    :try_start_3
    invoke-direct {p0, v6, p1}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/֨۬ᩳ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_1
    move-exception v6

    .line 226
    :try_start_4
    iput-object v6, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 217
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Recovery directory cleanup scan limit exceeded"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 228
    :cond_3
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    return v4

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_4

    .line 215
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw p1
.end method

.method private ܽ(Ll/᩷۠ᩴ;)Ll/ܰۙᩳ;
    .locals 11

    const/4 v0, 0x1

    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 233
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, v1}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "generation-"

    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v2, 0x2d

    const/16 v3, 0xb

    .line 236
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-ltz v2, :cond_4

    const-string v4, ".mt2"

    .line 237
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 239
    :cond_2
    :try_start_0
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    add-int/2addr v2, v0

    .line 240
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    const-wide/16 v0, 0x1

    cmp-long v2, v7, v0

    if-ltz v2, :cond_4

    .line 241
    iget-object v0, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    iget-object v0, v0, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v6, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 242
    :cond_3
    new-instance v0, Ll/ܰۙᩳ;

    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    iget-object v5, v1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    const-wide/16 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    .line 243
    invoke-virtual {p0, v0}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1, p1}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    return-object v0

    :catch_0
    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static bridge synthetic ܽ(Ll/۟ۙᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۟ۙᩳ;->ۤ:Z

    return p0
.end method

.method public static ܿ(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;
    .locals 7

    const-string v0, "current"

    .line 95
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    new-array v3, v2, [Ll/᩹۠ᩴ;

    .line 96
    invoke-static {p0, v3}, Ll/ܿ۠ᩴ;->createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;
    :try_end_0
    .catch Ljava/nio/file/FileAlreadyExistsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    new-array v4, v1, [Ll/ܳ۠ᩴ;

    .line 98
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v5, v4, v2

    invoke-static {p0, v4}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 100
    :goto_0
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v3

    sget-object v4, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v4, v3}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    const-string v3, "session.lock"

    .line 101
    invoke-interface {p0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v5, v1, [Ll/ܳ۠ᩴ;

    .line 102
    sget-object v6, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v6, v5, v2

    invoke-static {v3, v5}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 103
    invoke-static {p0}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v5

    .line 104
    :try_start_1
    invoke-interface {v5}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v6, :cond_0

    .line 105
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    :try_start_2
    new-array v5, v2, [Ll/᩹۠ᩴ;

    .line 106
    invoke-static {v3, v5}, Ll/ܿ۠ᩴ;->createFile(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;
    :try_end_2
    .catch Ljava/nio/file/FileAlreadyExistsException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    nop

    goto :goto_2

    .line 104
    :cond_0
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Migration directory has no ownership lock"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v5, :cond_1

    .line 103
    :try_start_4
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw p0

    .line 109
    :cond_2
    :goto_2
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    new-array v6, v1, [Ll/ܳ۠ᩴ;

    aput-object v5, v6, v2

    invoke-static {v3, v6}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 110
    new-instance v3, Ll/۟ۙᩳ;

    invoke-direct {v3, p0, v2}, Ll/۟ۙᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    .line 112
    :try_start_5
    iget-object v6, v3, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    invoke-virtual {v6, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 113
    invoke-interface {v4, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 114
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    aput-object v5, v1, v2

    invoke-static {v4, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 115
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۙᩳ;->ܳ(Ll/᩷۠ᩴ;)[B

    move-result-object p0

    invoke-static {p0}, Ll/۟ۙᩳ;->ۧ([B)Ll/ܰۙᩳ;

    move-result-object p0

    iput-object p0, v3, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_2

    :cond_3
    return-object v3

    :catch_2
    move-exception p0

    goto :goto_3

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    .line 119
    :goto_3
    :try_start_6
    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_4

    :catch_5
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 120
    :goto_4
    throw p0

    .line 109
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Migration ownership lock is not a regular file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 98
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Migration path is not a directory"

    invoke-direct {p0, v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method public static ᩳ(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;
    .locals 2

    .line 63
    new-instance v0, Ll/۟ۙᩳ;

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۟ۙᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    :try_start_0
    const-string v1, "current"

    .line 65
    invoke-interface {p0, v1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-static {p0}, Ll/۟ۙᩳ;->ܳ(Ll/᩷۠ᩴ;)[B

    move-result-object p0

    invoke-static {p0}, Ll/۟ۙᩳ;->ۧ([B)Ll/ܰۙᩳ;

    move-result-object p0

    iput-object p0, v0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 68
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ll/۟ۙᩳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 69
    :goto_1
    throw p0
.end method

.method public static bridge synthetic ᩳ(Ll/۟ۙᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 409
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 410
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 411
    iput-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 412
    :try_start_2
    iget-object v1, p0, Ll/۟ۙᩳ;->۬:Ljava/nio/channels/FileLock;

    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 413
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 412
    :try_start_4
    iget-object v2, p0, Ll/۟ۙᩳ;->۫:Ljava/nio/channels/FileChannel;

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    throw v1

    .line 410
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery generation candidate is still active"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    .line 412
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ֫()Ll/ܰۙᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 359
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z

    if-nez v1, :cond_1

    .line 180
    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 181
    monitor-exit v0

    return-object v1

    .line 180
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery directory has no published generation"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 359
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery directory is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 181
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;
    .locals 3

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "generation-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p1, Ll/ܰۙᩳ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".mt2"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ֫(Ll/֨۬ᩳ;)Ll/᩺ۙᩳ;
    .locals 10

    const-string v1, "generation-1-"

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 188
    :try_start_0
    invoke-direct {p0}, Ll/۟ۙᩳ;->ۜ()V

    .line 189
    iget-object v2, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    if-nez v2, :cond_0

    iget-object v2, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-nez v2, :cond_0

    .line 190
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    .line 191
    iget-object v2, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".mt2"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 192
    sget-object v2, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;Z)Ll/۬۬ᩳ;

    move-result-object v1

    invoke-static {v1, p1}, Ll/᩸۬ᩳ;->֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object p1

    .line 193
    new-instance v1, Ll/᩺ۙᩳ;

    new-instance v2, Ll/ܰۙᩳ;

    iget-object v4, p1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    const-wide/16 v6, 0x1

    const-wide/16 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    invoke-direct {v1, p0, p1, v2}, Ll/᩺ۙᩳ;-><init>(Ll/۟ۙᩳ;Ll/᩸۬ᩳ;Ll/ܰۙᩳ;)V

    iput-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 189
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery generation already exists"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֨۬ᩳ;Ljava/util/UUID;)Ll/᩺ۙᩳ;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 139
    :try_start_0
    invoke-direct {p0}, Ll/۟ۙᩳ;->ۜ()V

    .line 140
    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    if-nez v1, :cond_5

    iget-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-nez v1, :cond_5

    .line 141
    new-instance v1, Ll/ܰۙᩳ;

    const-wide/16 v5, 0x1

    const-wide/16 v7, 0x0

    move-object v2, v1

    move-object v3, p2

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    .line 142
    invoke-virtual {p0, v1}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v2

    .line 143
    sget-object v3, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v4, 0x1

    new-array v5, v4, [Ll/ܳ۠ᩴ;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-static {v2, v5}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-array v5, v4, [Ll/ܳ۠ᩴ;

    aput-object v3, v5, v6

    .line 144
    invoke-static {v2, v5}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 146
    invoke-static {v2}, Ll/ۗ۬ᩳ;->֫(Ll/᩷۠ᩴ;)Ll/۬۬ᩳ;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    sget-object v7, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v7, v2}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    iget-object v8, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v7, v8}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5}, Ll/۬۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v5}, Ll/۬۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 144
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Migration candidate is not a regular file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 148
    :cond_1
    :goto_1
    iget-object v5, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string v7, "entry.tmp"

    invoke-interface {v5, v7}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v5

    new-array v7, v4, [Ll/ܳ۠ᩴ;

    aput-object v3, v7, v6

    .line 149
    invoke-static {v5, v7}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v7, v5}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    iget-object v5, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v7, v5}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 150
    :cond_2
    iget-object v5, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string v7, "migration-state.bin"

    invoke-interface {v5, v7}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v5

    new-array v7, v4, [Ll/ܳ۠ᩴ;

    aput-object v3, v7, v6

    .line 151
    invoke-static {v5, v7}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v7

    if-eqz v7, :cond_4

    new-array v4, v4, [Ll/ܳ۠ᩴ;

    aput-object v3, v4, v6

    .line 152
    invoke-static {v5, v4}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 153
    invoke-static {v5}, Ll/ۗ۬ᩳ;->֫(Ll/᩷۠ᩴ;)Ll/۬۬ᩳ;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    sget-object v4, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v4, v5}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    iget-object v5, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v4, v5}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v3}, Ll/۬۬ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_3

    :catchall_2
    move-exception p1

    :try_start_7
    invoke-virtual {v3}, Ll/۬۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p2

    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 152
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Migration state candidate is not a regular file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 155
    :cond_4
    :goto_3
    invoke-static {v2, p1, p2}, Ll/᩸۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ljava/util/UUID;)Ll/᩸۬ᩳ;

    move-result-object p1

    .line 156
    new-instance p2, Ll/᩺ۙᩳ;

    invoke-direct {p2, p0, p1, v1}, Ll/᩺ۙᩳ;-><init>(Ll/۟ۙᩳ;Ll/᩸۬ᩳ;Ll/ܰۙᩳ;)V

    iput-object p2, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-exit v0

    return-object p2

    .line 140
    :cond_5
    :try_start_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Migration entry already exists"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_4
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩸۬ᩳ;)Ll/᩺ۙᩳ;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 198
    :try_start_0
    invoke-direct {p0}, Ll/۟ۙᩳ;->ۜ()V

    .line 199
    invoke-virtual {p0}, Ll/۟ۙᩳ;->֫()Ll/ܰۙᩳ;

    move-result-object v1

    .line 200
    iget-object v2, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-nez v2, :cond_3

    .line 201
    iget-object v2, v1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    iget-object v3, p1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, v1, Ll/ܰۙᩳ;->ۧ:J

    iget-wide v4, p1, Ll/᩸۬ᩳ;->ۨ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    .line 205
    iget-object v2, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-direct {p0, v2}, Ll/۟ۙᩳ;->ܽ(Ll/֨۬ᩳ;)I

    move-result v2

    if-nez v2, :cond_0

    .line 206
    new-instance v2, Ll/ܰۙᩳ;

    iget-object v4, p1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    iget-wide v6, p1, Ll/᩸۬ᩳ;->ۨ:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iget-wide v8, v1, Ll/ܰۙᩳ;->ܽ:J

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    .line 207
    invoke-virtual {p0, v2}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩸۬ᩳ;->֫(Ll/᩸۬ᩳ;Ll/᩷۠ᩴ;)Ll/᩸۬ᩳ;

    move-result-object p1

    .line 208
    new-instance v1, Ll/᩺ۙᩳ;

    invoke-direct {v1, p0, p1, v2}, Ll/᩺ۙᩳ;-><init>(Ll/۟ۙᩳ;Ll/᩸۬ᩳ;Ll/ܰۙᩳ;)V

    iput-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 205
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Previous recovery generation is still in use or cannot be reclaimed"

    iget-object v2, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;

    invoke-direct {p1, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 204
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Recovery generation exhausted"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 202
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Source does not match current recovery generation"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 200
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery generation copy is already active"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 202
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(JLl/᩺ۙᩳ;Ljava/lang/Runnable;)V
    .locals 9

    move-object v0, p0

    monitor-enter v0

    .line 298
    :try_start_0
    invoke-direct {p0}, Ll/۟ۙᩳ;->ۜ()V

    .line 299
    iget-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-ne p3, v1, :cond_2

    invoke-static {p3}, Ll/᩺ۙᩳ;->֫(Ll/᩺ۙᩳ;)Z

    move-result v1

    if-nez v1, :cond_2

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    if-eqz v1, :cond_0

    iget-wide v1, v1, Ll/ܰۙᩳ;->ܽ:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    .line 302
    :cond_0
    new-instance v8, Ll/ܰۙᩳ;

    invoke-static {p3}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-object v2, v1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-static {p3}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-object v3, v1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-static {p3}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-wide v4, v1, Ll/ܰۙᩳ;->ۧ:J

    move-object v1, v8

    move-wide v6, p1

    invoke-direct/range {v1 .. v7}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    .line 303
    iget-object v1, p3, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v1

    .line 304
    iget-object v3, p3, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    iget-object v3, v3, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-direct {p0, v8, v3, p4}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/֨۬ᩳ;Ljava/lang/Runnable;)V

    .line 305
    iget-object p4, p3, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-virtual {p4}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v3

    cmp-long p4, v1, v3

    if-nez p4, :cond_1

    .line 306
    invoke-static {p3, p1, p2}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;J)V

    .line 307
    invoke-static {p3, v1, v2}, Ll/᩺ۙᩳ;->֫(Ll/᩺ۙᩳ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    monitor-exit v0

    return-void

    .line 305
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery candidate changed during validation"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 300
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid recovery generation publication"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩺ۙᩳ;J)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 288
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Ll/۟ۙᩳ;->ܽ(Ll/᩺ۙᩳ;J)V

    .line 289
    invoke-virtual {p0, p1, p2, p3}, Ll/۟ۙᩳ;->ۧ(Ll/᩺ۙᩳ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
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

.method public final declared-synchronized ۧ(Ll/֨۬ᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 278
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/۟ۙᩳ;->ۤ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_1

    .line 279
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Ll/۟ۙᩳ;->ܽ(Ll/֨۬ᩳ;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 280
    :try_start_2
    iput-object p1, p0, Ll/۟ۙᩳ;->᩹:Ljava/io/IOException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 281
    :goto_0
    monitor-exit v0

    return-void

    .line 278
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/᩺ۙᩳ;J)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 312
    :try_start_0
    invoke-direct {p0}, Ll/۟ۙᩳ;->ۜ()V

    .line 313
    iget-object v1, p0, Ll/۟ۙᩳ;->᩸:Ll/᩺ۙᩳ;

    if-ne p1, v1, :cond_3

    invoke-static {p1}, Ll/᩺ۙᩳ;->֫(Ll/᩺ۙᩳ;)Z

    move-result v1

    if-nez v1, :cond_3

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-ltz v3, :cond_3

    invoke-static {p1}, Ll/᩺ۙᩳ;->ᩳ(Ll/᩺ۙᩳ;)J

    move-result-wide v1

    cmp-long v3, v1, p2

    if-nez v3, :cond_3

    invoke-static {p1}, Ll/᩺ۙᩳ;->ܽ(Ll/᩺ۙᩳ;)J

    move-result-wide v1

    iget-object v3, p1, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    .line 314
    invoke-virtual {v3}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_3

    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    if-eqz v1, :cond_0

    iget-wide v1, v1, Ll/ܰۙᩳ;->ܽ:J

    cmp-long v3, p2, v1

    if-ltz v3, :cond_3

    .line 317
    :cond_0
    new-instance v8, Ll/ܰۙᩳ;

    invoke-static {p1}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-object v2, v1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-static {p1}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-object v3, v1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-static {p1}, Ll/᩺ۙᩳ;->ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-wide v4, v1, Ll/ܰۙᩳ;->ۧ:J

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Ll/ܰۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;JJ)V

    .line 319
    iget-object p2, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string p3, "entry.tmp"

    invoke-interface {p2, p3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p2

    const/4 p3, 0x1

    new-array v1, p3, [Ll/ܳ۠ᩴ;

    .line 320
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_2

    .line 321
    :try_start_1
    sget-object v1, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-static {v8}, Ll/۟ۙᩳ;->ۧ(Ll/ܰۙᩳ;)[B

    move-result-object v2

    invoke-interface {v1, p2, v2}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;[B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    :try_start_2
    iput-boolean p3, p0, Ll/۟ۙᩳ;->ۤ:Z

    .line 328
    iget-object p3, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string v2, "current"

    invoke-interface {p3, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p3

    invoke-interface {v1, p2, p3}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    .line 329
    iget-object p2, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-interface {v1, p2}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 330
    iput-object v8, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;

    .line 331
    invoke-static {p1, v8}, Ll/᩺ۙᩳ;->֫(Ll/᩺ۙᩳ;Ll/ܰۙᩳ;)V

    .line 332
    iput-boolean v3, p0, Ll/۟ۙᩳ;->ۤ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 333
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    :try_start_3
    new-array p3, p3, [Ll/ܳ۠ᩴ;

    .line 323
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v1, p3, v3

    invoke-static {p2, p3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {p3, p2}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_3
    move-exception p2

    .line 324
    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 325
    :cond_1
    :goto_1
    throw p1

    .line 320
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery temporary entry requires cleanup"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 315
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery candidate validation is missing or stale"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final ܳ()J
    .locals 2

    .line 350
    iget-object v0, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    invoke-static {v0}, Ll/ܿ۠ᩴ;->getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->getUsableSpace()J

    move-result-wide v0

    return-wide v0
.end method

.method public final declared-synchronized ܽ(Ll/᩺ۙᩳ;J)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 294
    :try_start_0
    new-instance v1, Ll/֡᩹ᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p2, p3, p1, v1}, Ll/۟ۙᩳ;->֫(JLl/᩺ۙᩳ;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
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

.method public final declared-synchronized ܽ()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 359
    :try_start_0
    iget-boolean v1, p0, Ll/۟ۙᩳ;->᩶:Z

    if-nez v1, :cond_1

    .line 124
    iget-object v1, p0, Ll/۟ۙᩳ;->ۙ:Ll/ܰۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    .line 359
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery directory is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 124
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()Z
    .locals 1

    .line 176
    iget-boolean v0, p0, Ll/۟ۙᩳ;->ۤ:Z

    return v0
.end method

.method public final declared-synchronized ᩻()Ll/ܰۙᩳ;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 128
    :try_start_0
    invoke-virtual {p0}, Ll/۟ۙᩳ;->֫()Ll/ܰۙᩳ;

    move-result-object v1

    .line 129
    iget-object v2, p0, Ll/۟ۙᩳ;->ۗ:Ll/᩷۠ᩴ;

    const-string v3, "current"

    invoke-interface {v2, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۙᩳ;->ܳ(Ll/᩷۠ᩴ;)[B

    move-result-object v2

    invoke-static {v2}, Ll/۟ۙᩳ;->ۧ([B)Ll/ܰۙᩳ;

    move-result-object v2

    .line 130
    iget-object v3, v1, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    iget-object v4, v2, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v1, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    iget-object v4, v2, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v3, v1, Ll/ܰۙᩳ;->ۧ:J

    iget-wide v5, v2, Ll/ܰۙᩳ;->ۧ:J

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    iget-wide v3, v1, Ll/ܰۙᩳ;->ܽ:J

    iget-wide v5, v2, Ll/ܰۙᩳ;->ܽ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    .line 134
    monitor-exit v0

    return-object v2

    .line 132
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Published recovery entry changed outside its owner"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
