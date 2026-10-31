.class public final Ll/ۙ᩶ۜ;
.super Ljava/lang/Object;
.source "Q759"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ֫֫:Landroid/net/Uri;

.field public final ۗ:Ljava/lang/String;

.field public volatile ۙ:Ll/᩶᩶ۜ;

.field public final ۛ:Ljava/lang/String;

.field public final ۟:J

.field public final ۤ:I

.field public final ۨ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ۫:Ljava/lang/Object;

.field public final ۬:Ll/ܶ۠֫;

.field public final ܰ:J

.field public final ᩶:Ljava/lang/Object;

.field public volatile ᩸:Ll/᩶᩶ۜ;

.field public volatile ᩹:Ljava/lang/Thread;

.field public volatile ᩺:Z


# direct methods
.method public constructor <init>(JJLandroid/net/Uri;Ll/ܶ۠֫;Ljava/lang/String;)V
    .locals 4

    .line 59
    invoke-static {}, Ll/ۧۙۜ;->֫()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ۙ᩶ۜ;->۫:Ljava/lang/Object;

    .line 35
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    cmp-long v3, p3, v1

    if-ltz v3, :cond_1

    const-wide v1, 0x7fffffffffffffffL

    sub-long/2addr v1, p3

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    .line 105
    iput-object p6, p0, Ll/ۙ᩶ۜ;->۬:Ll/ܶ۠֫;

    .line 106
    iput-object p5, p0, Ll/ۙ᩶ۜ;->֫֫:Landroid/net/Uri;

    .line 107
    iput-object p7, p0, Ll/ۙ᩶ۜ;->ۗ:Ljava/lang/String;

    .line 108
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p6, "@"

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p6, ":"

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    iput-object p5, p0, Ll/ۙ᩶ۜ;->ۛ:Ljava/lang/String;

    .line 109
    iput-wide p1, p0, Ll/ۙ᩶ۜ;->۟:J

    .line 110
    iput-wide p3, p0, Ll/ۙ᩶ۜ;->ܰ:J

    const/high16 p1, 0x40000

    .line 111
    iput p1, p0, Ll/ۙ᩶ۜ;->ۤ:I

    .line 112
    iput-object v0, p0, Ll/ۙ᩶ۜ;->ۨ:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Resource range overflows"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Resource length must be known"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Resource offset must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ܿۗۜ;Landroid/net/Uri;Ljava/lang/String;J)V
    .locals 8

    const-wide/16 v1, 0x0

    move-object v0, p0

    move-wide v3, p4

    move-object v5, p2

    move-object v6, p1

    move-object v7, p3

    .line 49
    invoke-direct/range {v0 .. v7}, Ll/ۙ᩶ۜ;-><init>(JJLandroid/net/Uri;Ll/ܶ۠֫;Ljava/lang/String;)V

    return-void
.end method

.method private ֫(Ll/᩸۠֫;Ll/ۗ۠֫;)Ll/᩶᩶ۜ;
    .locals 6

    .line 317
    new-instance v1, Ll/᩶᩶ۜ;

    iget-object v0, p0, Ll/ۙ᩶ۜ;->ۨ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-direct {v1, p1, p2, v0}, Ll/᩶᩶ۜ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ljava/util/concurrent/ThreadPoolExecutor;)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 321
    :try_start_0
    iget-object v0, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 322
    :try_start_1
    invoke-direct {p0}, Ll/ۙ᩶ۜ;->֫()V

    .line 323
    iput-object v1, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    .line 324
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    iput-object v2, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    const/4 v2, 0x1

    .line 326
    :try_start_2
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ܳ()V

    .line 327
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 328
    :try_start_3
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->֫()V

    .line 329
    iget-object v0, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 330
    :try_start_4
    iget-boolean v3, p0, Ll/ۙ᩶ۜ;->᩺:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    if-ne v3, v1, :cond_0

    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 331
    iput-object p1, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    .line 332
    iput-object v1, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    const/4 p2, 0x1

    .line 335
    :cond_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz p2, :cond_4

    if-nez p2, :cond_3

    .line 603
    :try_start_5
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ۧ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 346
    :catchall_0
    iget-object p2, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 347
    :try_start_6
    iget-object p2, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    if-ne p2, v1, :cond_1

    .line 348
    iput-object p1, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    .line 350
    :cond_1
    iget-object p2, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    if-nez p2, :cond_2

    iget-object p2, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 351
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne p2, v2, :cond_2

    .line 352
    iput-object p1, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 354
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    :cond_3
    :goto_0
    return-object v1

    .line 337
    :cond_4
    :try_start_7
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v3, "Preview read was canceled"

    invoke-direct {v0, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_2
    move-exception v3

    .line 335
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v0

    move-object v4, p0

    goto :goto_2

    :catchall_4
    move-exception v3

    move-object v4, p0

    move-object v2, v3

    const/4 v3, 0x1

    goto :goto_1

    :catchall_5
    move-exception v2

    const/4 v3, 0x0

    move-object v4, p0

    .line 327
    :goto_1
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    move v2, v3

    :goto_2
    move-object v5, v1

    move-object v1, v0

    move v0, v2

    move-object v2, v5

    goto :goto_3

    :catchall_7
    move-exception v2

    goto :goto_1

    :catchall_8
    move-exception v0

    const/4 v2, 0x0

    move-object v4, p0

    move-object v2, v1

    move-object v1, v0

    const/4 v0, 0x0

    :goto_3
    if-nez p2, :cond_8

    if-eqz v0, :cond_5

    .line 603
    :try_start_c
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ۧ()V

    goto :goto_4

    .line 679
    :cond_5
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 346
    :catchall_9
    :goto_4
    iget-object p2, v4, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 347
    :try_start_d
    iget-object p2, v4, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    if-ne p2, v2, :cond_6

    .line 348
    iput-object p1, v4, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    .line 350
    :cond_6
    iget-object p2, v4, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    if-nez p2, :cond_7

    iget-object p2, v4, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 351
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne p2, v2, :cond_7

    .line 352
    iput-object p1, v4, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 354
    :cond_7
    monitor-exit v0

    goto :goto_5

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    throw p1

    .line 356
    :cond_8
    :goto_5
    throw v1
.end method

.method private ֫()V
    .locals 2

    .line 307
    iget-boolean v0, p0, Ll/ۙ᩶ۜ;->᩺:Z

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 308
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Preview read was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(IJLl/۟᩶ۜ;[B)V
    .locals 7

    .line 269
    iget-object v0, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 270
    :try_start_0
    invoke-direct {p0}, Ll/ۙ᩶ۜ;->֫()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    const v3, 0x8000

    sub-int v4, p1, v2

    .line 282
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 283
    new-array v4, v3, [B

    .line 284
    invoke-static {p5, v2, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 285
    new-instance v5, Ll/᩺᩶ۜ;

    iget-object v6, p0, Ll/ۙ᩶ۜ;->ۛ:Ljava/lang/String;

    invoke-direct {v5, p2, p3, v6}, Ll/᩺᩶ۜ;-><init>(JLjava/lang/String;)V

    .line 288
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v6

    invoke-virtual {v6, v5, v4, p4}, Ll/֫ۙۜ;->֫(Ll/᩺᩶ۜ;[BLl/۟᩶ۜ;)Ll/ܰ᩶ۜ;

    move-result-object v4

    .line 291
    invoke-virtual {v4}, Ll/ܰ᩶ۜ;->close()V

    add-int/2addr v2, v3

    const-wide/16 v3, 0x1

    add-long/2addr p2, v3

    goto :goto_0

    .line 272
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/᩶᩶ۜ;)V
    .locals 3

    .line 362
    iget-object v0, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 363
    :try_start_0
    iget-object v1, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_0

    .line 364
    iput-object v2, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    .line 366
    :cond_0
    iget-object p1, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 367
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 368
    iput-object v2, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 370
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(IJ)Z
    .locals 4

    const-wide/32 v0, 0x8000

    mul-long p2, p2, v0

    .line 165
    iget-wide v2, p0, Ll/ۙ᩶ۜ;->ܰ:J

    sub-long/2addr v2, p2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    if-lez p3, :cond_0

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 379
    iget-object v0, p0, Ll/ۙ᩶ۜ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 380
    :try_start_0
    iput-boolean v1, p0, Ll/ۙ᩶ۜ;->᩺:Z

    .line 381
    iget-object v1, p0, Ll/ۙ᩶ۜ;->ۙ:Ll/᩶᩶ۜ;

    .line 382
    iget-object v2, p0, Ll/ۙ᩶ۜ;->᩸:Ll/᩶᩶ۜ;

    .line 383
    iget-object v3, p0, Ll/ۙ᩶ۜ;->᩹:Ljava/lang/Thread;

    .line 384
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v1, :cond_0

    .line 388
    :try_start_1
    invoke-virtual {v1}, Ll/᩶᩶ۜ;->ۧ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v3, :cond_1

    .line 393
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v3, v1, :cond_1

    .line 394
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz v2, :cond_3

    .line 398
    :try_start_2
    invoke-virtual {v2}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    if-eq v0, v1, :cond_3

    .line 403
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    move-object v1, v0

    .line 408
    :goto_3
    iget-object v0, p0, Ll/ۙ᩶ۜ;->۫:Ljava/lang/Object;

    monitor-enter v0

    .line 409
    :try_start_3
    iget-object v2, p0, Ll/ۙ᩶ۜ;->۫:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 410
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 411
    invoke-static {v1}, Ll/᩶᩶ۜ;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_2
    move-exception v1

    .line 410
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catchall_3
    move-exception v1

    .line 384
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1
.end method

.method public final length()J
    .locals 2

    .line 117
    iget-wide v0, p0, Ll/ۙ᩶ۜ;->ܰ:J

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 23

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p5

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-ltz v5, :cond_19

    if-ltz v1, :cond_19

    if-ltz v2, :cond_19

    .line 298
    array-length v5, v0

    sub-int/2addr v5, v2

    if-gt v1, v5, :cond_19

    .line 301
    iget-wide v5, v7, Ll/ۙ᩶ۜ;->ܰ:J

    int-to-long v8, v2

    sub-long/2addr v5, v8

    cmp-long v8, p1, v5

    if-gtz v8, :cond_18

    move-wide/from16 v8, p1

    move v10, v1

    move v11, v2

    :goto_0
    if-lez v11, :cond_17

    .line 127
    invoke-direct/range {p0 .. p0}, Ll/ۙ᩶ۜ;->֫()V

    const-wide/32 v1, 0x8000

    .line 128
    div-long v12, v8, v1

    .line 129
    rem-long v5, v8, v1

    long-to-int v14, v5

    .line 130
    new-instance v15, Ll/᩺᩶ۜ;

    iget-object v5, v7, Ll/ۙ᩶ۜ;->ۛ:Ljava/lang/String;

    invoke-direct {v15, v12, v13, v5}, Ll/᩺᩶ۜ;-><init>(JLjava/lang/String;)V

    .line 132
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v5

    invoke-virtual {v5, v15}, Ll/֫ۙۜ;->֫(Ll/᩺᩶ۜ;)Ll/ܰ᩶ۜ;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 133
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->֫()[B

    move-result-object v6

    array-length v6, v6

    invoke-direct {v7, v6, v12, v13}, Ll/ۙ᩶ۜ;->֫(IJ)Z

    move-result v6

    if-nez v6, :cond_0

    .line 134
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V

    const/4 v5, 0x0

    :cond_0
    if-nez v5, :cond_14

    .line 171
    iget-object v5, v7, Ll/ۙ᩶ۜ;->۫:Ljava/lang/Object;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 172
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۙ᩶ۜ;->֫()V

    .line 173
    new-instance v5, Ll/᩺᩶ۜ;

    iget-object v6, v7, Ll/ۙ᩶ۜ;->ۛ:Ljava/lang/String;

    invoke-direct {v5, v12, v13, v6}, Ll/᩺᩶ۜ;-><init>(JLjava/lang/String;)V

    .line 176
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v6

    invoke-virtual {v6, v5}, Ll/֫ۙۜ;->֫(Ll/᩺᩶ۜ;)Ll/ܰ᩶ۜ;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    if-eqz v5, :cond_1

    .line 177
    :try_start_1
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->֫()[B

    move-result-object v6

    array-length v6, v6

    invoke-direct {v7, v6, v12, v13}, Ll/ۙ᩶ۜ;->֫(IJ)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_1

    .line 180
    :try_start_2
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V

    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    move-wide/from16 p1, v8

    move v0, v10

    move/from16 p4, v11

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 175
    :try_start_3
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    :cond_1
    if-eqz v5, :cond_2

    .line 180
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V

    :cond_2
    mul-long v1, v1, v12

    cmp-long v5, v1, v3

    if-ltz v5, :cond_13

    .line 182
    iget-wide v3, v7, Ll/ۙ᩶ۜ;->ܰ:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_13

    .line 185
    iget v5, v7, Ll/ۙ᩶ۜ;->ۤ:I

    int-to-long v5, v5

    sub-long/2addr v3, v1

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    if-lez v4, :cond_12

    int-to-long v5, v4

    const-wide/16 v17, 0x2

    move-wide/from16 p1, v8

    mul-long v8, v5, v17

    const-wide/32 v17, 0x7fffffff

    cmp-long v3, v8, v17

    if-gtz v3, :cond_11

    .line 195
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v3

    long-to-int v9, v8

    invoke-virtual {v3, v9}, Ll/֫ۙۜ;->֫(I)Ll/۟᩶ۜ;

    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    if-eqz v8, :cond_10

    .line 200
    :try_start_5
    new-array v9, v4, [B

    .line 202
    iget-object v3, v7, Ll/ۙ᩶ۜ;->۬:Ll/ܶ۠֫;

    invoke-interface {v3}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move/from16 v17, v4

    .line 205
    :try_start_6
    new-instance v4, Ll/ۙ۠֫;

    invoke-direct {v4}, Ll/ۙ۠֫;-><init>()V

    iget-object v0, v7, Ll/ۙ᩶ۜ;->֫֫:Landroid/net/Uri;

    .line 206
    invoke-virtual {v4, v0}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    move v0, v10

    move/from16 p4, v11

    iget-wide v10, v7, Ll/ۙ᩶ۜ;->۟:J

    add-long/2addr v10, v1

    .line 207
    invoke-virtual {v4, v10, v11}, Ll/ۙ۠֫;->ۧ(J)V

    .line 208
    invoke-virtual {v4, v5, v6}, Ll/ۙ۠֫;->֫(J)V

    iget-object v10, v7, Ll/ۙ᩶ۜ;->ۗ:Ljava/lang/String;

    .line 209
    invoke-virtual {v4, v10}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    .line 210
    invoke-virtual {v4}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v4

    .line 205
    invoke-direct {v7, v3, v4}, Ll/ۙ᩶ۜ;->֫(Ll/᩸۠֫;Ll/ۗ۠֫;)Ll/᩶᩶ۜ;

    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 211
    :try_start_7
    invoke-virtual {v4}, Ll/᩶᩶ۜ;->ܿ()J

    move-result-wide v10

    const-wide/16 v18, -0x1

    cmp-long v20, v10, v18

    if-ltz v20, :cond_e

    if-nez v20, :cond_3

    move/from16 v6, v17

    goto :goto_2

    .line 216
    :cond_3
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    :goto_2
    const/4 v5, 0x0

    :goto_3
    const/4 v10, 0x0

    :goto_4
    if-ge v5, v6, :cond_8

    .line 219
    invoke-direct/range {p0 .. p0}, Ll/ۙ᩶ۜ;->֫()V

    sub-int v11, v6, v5

    .line 220
    invoke-interface {v3, v9, v5, v11}, Ll/ۢᩴ֫;->read([BII)I

    move-result v11

    move-object/from16 p5, v3

    const/4 v3, -0x1

    if-ne v11, v3, :cond_4

    goto :goto_5

    :cond_4
    if-ltz v11, :cond_7

    if-nez v11, :cond_6

    add-int/lit8 v10, v10, 0x1

    const/16 v3, 0x10

    if-ge v10, v3, :cond_5

    move-object/from16 v3, p5

    goto :goto_4

    .line 229
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview data source returned too many zero-byte reads"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    add-int/2addr v5, v11

    move-object/from16 v3, p5

    goto :goto_3

    .line 225
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview data source returned an invalid read result"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 240
    :cond_8
    :goto_5
    :try_start_8
    invoke-virtual {v4}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 242
    :try_start_9
    invoke-direct {v7, v4}, Ll/ۙ᩶ۜ;->֫(Ll/᩶᩶ۜ;)V

    if-eqz v5, :cond_d

    const v3, 0x8000

    .line 249
    div-int v4, v5, v3

    mul-int v4, v4, v3

    int-to-long v10, v5

    add-long/2addr v1, v10

    .line 250
    iget-wide v10, v7, Ll/ۙ᩶ۜ;->ܰ:J

    cmp-long v3, v1, v10

    if-nez v3, :cond_9

    move v2, v5

    goto :goto_6

    :cond_9
    move v2, v4

    :goto_6
    if-eqz v2, :cond_c

    move-object/from16 v1, p0

    move-wide v3, v12

    move-object v5, v8

    move-object v6, v9

    .line 257
    invoke-direct/range {v1 .. v6}, Ll/ۙ᩶ۜ;->֫(IJLl/۟᩶ۜ;[B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 259
    :try_start_a
    invoke-virtual {v8}, Ll/۟᩶ۜ;->close()V

    .line 260
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 139
    :goto_7
    invoke-static {}, Ll/֫ۙۜ;->֫()Ll/֫ۙۜ;

    move-result-object v1

    invoke-virtual {v1, v15}, Ll/֫ۙۜ;->֫(Ll/᩺᩶ۜ;)Ll/ܰ᩶ۜ;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 140
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->֫()[B

    move-result-object v1

    array-length v1, v1

    invoke-direct {v7, v1, v12, v13}, Ll/ۙ᩶ۜ;->֫(IJ)Z

    move-result v1

    if-nez v1, :cond_15

    :cond_a
    if-eqz v5, :cond_b

    .line 142
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V

    .line 144
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview page memory budget is exhausted"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_c
    :try_start_b
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview resource ended before a complete page"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 247
    :cond_d
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview resource ended before requested page"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 242
    invoke-direct {v7, v4}, Ll/ۙ᩶ۜ;->֫(Ll/᩶᩶ۜ;)V

    .line 243
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 213
    :cond_e
    :try_start_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview data source returned an invalid length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_8

    :catchall_5
    move-exception v0

    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_f

    .line 240
    :try_start_d
    invoke-virtual {v4}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 242
    :try_start_e
    invoke-direct {v7, v4}, Ll/ۙ᩶ۜ;->֫(Ll/᩶᩶ۜ;)V

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v1, v0

    invoke-direct {v7, v4}, Ll/ۙ᩶ۜ;->֫(Ll/᩶᩶ۜ;)V

    .line 243
    throw v1

    .line 245
    :cond_f
    :goto_9
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :goto_a
    move-object v1, v0

    .line 199
    :try_start_f
    invoke-virtual {v8}, Ll/۟᩶ۜ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_b

    :catchall_7
    move-exception v0

    move-object v2, v0

    :try_start_10
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1

    .line 197
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview page memory budget is exhausted"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview fill is too large"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_12
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview read is past end of resource"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_13
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview read is past end of resource"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_8
    move-exception v0

    .line 260
    monitor-exit v16
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    throw v0

    :cond_14
    move-wide/from16 p1, v8

    move v0, v10

    move/from16 p4, v11

    .line 149
    :cond_15
    :try_start_11
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->֫()[B

    move-result-object v1

    .line 150
    array-length v2, v1

    if-ge v14, v2, :cond_16

    .line 153
    array-length v2, v1

    sub-int/2addr v2, v14

    move/from16 v3, p4

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    move-object/from16 v4, p3

    .line 154
    invoke-static {v1, v14, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    sub-int v11, v3, v2

    add-int v10, v0, v2

    int-to-long v0, v2

    add-long v8, p1, v0

    .line 158
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V

    const-wide/16 v0, 0x0

    move-wide/from16 v21, v0

    move-object v0, v4

    move-wide/from16 v3, v21

    goto/16 :goto_0

    .line 151
    :cond_16
    :try_start_12
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview page ended before requested position"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    :catchall_9
    move-exception v0

    move-object v1, v0

    .line 148
    :try_start_13
    invoke-virtual {v5}, Ll/ܰ᩶ۜ;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    goto :goto_c

    :catchall_a
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1

    :cond_17
    return-void

    .line 302
    :cond_18
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Preview read exceeds resource length"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_19
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method
