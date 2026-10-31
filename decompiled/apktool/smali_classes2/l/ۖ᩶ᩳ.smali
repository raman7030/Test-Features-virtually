.class public final Ll/ۖ᩶ᩳ;
.super Ljava/lang/Object;
.source "46SG"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Z

.field public final ۙ:Ll/᩷۠ᩴ;

.field public final ۤ:Ljava/util/UUID;

.field public ۫:Ll/ۖۗᩳ;

.field public final ۬:Ll/۟ۙᩳ;

.field public ᩶:Z

.field public final ᩸:Ll/֨۬ᩳ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/۟ۙᩳ;Ljava/util/UUID;Ll/֨۬ᩳ;)V
    .locals 0

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 334
    iput-object p1, p0, Ll/ۖ᩶ᩳ;->ۙ:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/ۖ᩶ᩳ;->۬:Ll/۟ۙᩳ;

    iput-object p3, p0, Ll/ۖ᩶ᩳ;->ۤ:Ljava/util/UUID;

    iput-object p4, p0, Ll/ۖ᩶ᩳ;->᩸:Ll/֨۬ᩳ;

    return-void
.end method

.method public static ֫(Ll/ۖ᩶ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 369
    invoke-direct {p0, v0}, Ll/ۖ᩶ᩳ;->ۧ(Ll/᩻᩵ᩳ;)Ljava/lang/Object;

    return-void
.end method

.method private ۧ(Ll/᩻᩵ᩳ;)Ljava/lang/Object;
    .locals 11

    .line 372
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    iget-object v1, p0, Ll/ۖ᩶ᩳ;->ۙ:Ll/᩷۠ᩴ;

    iget-object v2, p0, Ll/ۖ᩶ᩳ;->۬:Ll/۟ۙᩳ;

    invoke-virtual {v2}, Ll/۟ۙᩳ;->᩻()Ll/ܰۙᩳ;

    move-result-object v3

    .line 373
    iget-object v4, v3, Ll/ܰۙᩳ;->ᩳ:Ljava/util/UUID;

    iget-object v5, p0, Ll/ۖ᩶ᩳ;->ۤ:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 374
    invoke-virtual {v2, v3}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v2

    iget-object v4, p0, Ll/ۖ᩶ᩳ;->᩸:Ll/֨۬ᩳ;

    invoke-static {v2, v4}, Ll/᩸۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object v2

    .line 375
    :try_start_0
    new-instance v6, Ll/ۡۗᩳ;

    invoke-direct {v6, v2}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;)V

    sget-object v7, Ll/᩷ۗᩳ;->֫:Ll/᩷ۗᩳ;

    invoke-virtual {v6, v7}, Ll/ۡۗᩳ;->֫(Ll/᩷ۗᩳ;)Ll/ۢۗᩳ;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 376
    :try_start_1
    iget-wide v7, v6, Ll/ۢۗᩳ;->ۛ:J

    invoke-static {v3, v2, v7, v8}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/᩸۬ᩳ;J)V

    .line 377
    iget-wide v7, v6, Ll/ۢۗᩳ;->᩹:J

    const-wide/16 v9, 0x0

    cmp-long v3, v7, v9

    if-nez v3, :cond_3

    iget-object v3, v6, Ll/ۢۗᩳ;->ۤ:Ljava/io/IOException;

    if-nez v3, :cond_3

    iget-object v3, v6, Ll/ۢۗᩳ;->۫:Ljava/io/IOException;

    if-nez v3, :cond_3

    .line 380
    invoke-virtual {v6}, Ll/ۢۗᩳ;->ܽ()[B

    move-result-object v3

    invoke-static {v3}, Ll/۫᩶ᩳ;->ۧ([B)Ll/۫᩶ᩳ;

    move-result-object v3

    .line 381
    iget-object v7, v3, Ll/۫᩶ᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v7, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 382
    invoke-virtual {v3, v1, v4}, Ll/۫᩶ᩳ;->ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V

    .line 383
    iget-object v4, v2, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    invoke-interface {v4}, Ll/ۤ۬ᩳ;->ܺ()V

    .line 384
    invoke-interface {v0, v1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 387
    iget-object v0, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;

    .line 388
    invoke-virtual {v6}, Ll/ۢۗᩳ;->֫()Ll/ۖۗᩳ;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;

    if-eqz v0, :cond_0

    .line 389
    invoke-virtual {v0}, Ll/ۖۗᩳ;->close()V

    :cond_0
    if-eqz p1, :cond_1

    .line 391
    new-instance v0, Ll/۫᩹ᩳ;

    invoke-virtual {v6}, Ll/ۢۗᩳ;->ᩳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-wide v4, v6, Ll/ۢۗᩳ;->᩺:J

    invoke-direct {v0, v1, v4, v5}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 392
    :try_start_2
    invoke-virtual {p1, v0, v3}, Ll/᩻᩵ᩳ;->֫(Ll/۫᩹ᩳ;Ll/۫᩶ᩳ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 393
    :try_start_3
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 396
    :try_start_4
    invoke-virtual {v6}, Ll/ۢۗᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 391
    :try_start_5
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 396
    :cond_1
    :try_start_7
    invoke-virtual {v6}, Ll/ۢۗᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->close()V

    const/4 p1, 0x0

    return-object p1

    .line 381
    :cond_2
    :try_start_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Migration metadata identity does not match"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 378
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Migration recovery requires explicit repair before cleanup"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p1

    .line 374
    :try_start_9
    invoke-virtual {v6}, Ll/ۢۗᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    :try_start_a
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception p1

    :try_start_b
    invoke-virtual {v2}, Ll/᩸۬ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 373
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Migration recovery identity does not match"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 401
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 402
    :cond_0
    :try_start_1
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩹:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 403
    :try_start_2
    iget-object v3, p0, Ll/ۖ᩶ᩳ;->۬:Ll/۟ۙᩳ;

    invoke-virtual {v3}, Ll/۟ۙᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 405
    :try_start_3
    iput-boolean v2, p0, Ll/ۖ᩶ᩳ;->᩶:Z

    .line 406
    iget-object v2, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V

    iput-object v1, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 408
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v3

    .line 405
    :try_start_4
    iput-boolean v2, p0, Ll/ۖ᩶ᩳ;->᩶:Z

    .line 406
    iget-object v2, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V

    iput-object v1, p0, Ll/ۖ᩶ᩳ;->۫:Ll/ۖۗᩳ;

    .line 407
    :cond_2
    throw v3

    .line 402
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot release migration ownership during use"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/᩻᩵ᩳ;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 399
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩶:Z

    if-nez v1, :cond_1

    .line 350
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩹:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 352
    iput-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 353
    :try_start_1
    invoke-direct {p0, p1}, Ll/ۖ᩶ᩳ;->ۧ(Ll/᩻᩵ᩳ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    :try_start_2
    iput-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 353
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 354
    :try_start_3
    iput-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z

    throw p1

    .line 350
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Migration result is already in use"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 399
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Migration result is closed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 350
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final ֫()Ll/᩷۠ᩴ;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/ۖ᩶ᩳ;->ۙ:Ll/᩷۠ᩴ;

    return-object v0
.end method

.method public final declared-synchronized ֫(Ll/᩹ۘᩳ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 399
    :try_start_0
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩶:Z

    if-nez v1, :cond_1

    .line 363
    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩹:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ۖ᩶ᩳ;->ۗ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 364
    iput-boolean v1, p0, Ll/ۖ᩶ᩳ;->᩹:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 369
    :try_start_1
    invoke-direct {p0, v1}, Ll/ۖ᩶ᩳ;->ۧ(Ll/᩻᩵ᩳ;)Ljava/lang/Object;

    .line 365
    invoke-virtual {p1}, Ll/᩹ۘᩳ;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 366
    :try_start_2
    iput-boolean v2, p0, Ll/ۖ᩶ᩳ;->᩹:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 367
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 366
    :try_start_3
    iput-boolean v2, p0, Ll/ۖ᩶ᩳ;->᩹:Z

    throw p1

    .line 363
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Migration result is already in use"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 399
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Migration result is closed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 363
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final ܽ()Ljava/util/UUID;
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ۖ᩶ᩳ;->ۤ:Ljava/util/UUID;

    return-object v0
.end method
