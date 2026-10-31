.class public final Ll/ۜ֫ܿ;
.super Ljava/lang/Object;
.source "S4H6"


# static fields
.field public static final ۖ:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final ۘ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final ᩴ:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public ֫:Z

.field public final ۜ:Ljava/lang/ref/WeakReference;

.field public ۡ:Ljava/util/concurrent/ScheduledFuture;

.field public ۢ:Ljava/util/concurrent/Future;

.field public ۧ:Z

.field public ܳ:Ll/᩶᩸ᩳ;

.field public final ܺ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public ܽ:Ljava/util/concurrent/ScheduledFuture;

.field public final ܿ:Ljava/lang/Object;

.field public volatile ᩳ:I

.field public volatile ᩷:Ll/ܳ֫ܿ;

.field public ᩻:Ll/ۨۘܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ۜ֫ܿ;->ᩴ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x40

    invoke-direct {v7, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v8, Ll/ۨ۟ᩳ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x2

    const-wide/16 v4, 0x1e

    move-object v1, v0

    move v2, v3

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x1

    .line 110
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 40
    sput-object v0, Ll/ۜ֫ܿ;->ۘ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 41
    new-instance v0, Ll/ۤ۟ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Ll/ۜ֫ܿ;->ۖ:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 3

    .line 92
    sget-object v0, Ll/ۜ֫ܿ;->ۘ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 51
    invoke-static {v1, v2, v2}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 97
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/ۜ֫ܿ;->ۜ:Ljava/lang/ref/WeakReference;

    .line 98
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۜ֫ܿ;->ܺ:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 105
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Search-Highlight-Worker-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/ۜ֫ܿ;->ᩴ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 106
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method

.method private ֫(Ljava/util/concurrent/Future;)V
    .locals 1

    const/4 v0, 0x0

    .line 515
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 516
    instance-of v0, p1, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Runnable;

    iget-object v0, p0, Ll/ۜ֫ܿ;->ܺ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۜ֫ܿ;Ll/۫ۨᩳ;Ll/ᩳ֫ܿ;)V
    .locals 9

    .line 466
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 467
    :try_start_0
    invoke-static {p2}, Ll/ᩳ֫ܿ;->֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;

    move-result-object v1

    .line 468
    invoke-direct {p0, v1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ll/ܿ֫ܿ;->᩷(Ll/ܿ֫ܿ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 469
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-static {v1}, Ll/ܿ֫ܿ;->ܳ(Ll/ܿ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v3

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 473
    :cond_0
    iget v2, p0, Ll/ۜ֫ܿ;->ᩳ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۜ֫ܿ;->ᩳ:I

    const/4 v2, 0x0

    .line 474
    iput-object v2, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    .line 475
    new-instance v2, Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܿ֫ܿ;->ܳ(Ll/ܿ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v4

    invoke-static {v1}, Ll/ܿ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)I

    move-result v5

    invoke-static {p2}, Ll/ᩳ֫ܿ;->ܽ(Ll/ᩳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v6

    invoke-static {p2}, Ll/ᩳ֫ܿ;->ۧ(Ll/ᩳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v7

    const/4 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object v2, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 477
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧ()V

    .line 479
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    .line 470
    :cond_1
    :goto_0
    :try_start_1
    invoke-direct {p0, v1}, Ll/ۜ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)V

    .line 471
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 477
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;)V
    .locals 11

    .line 357
    new-instance v0, Ll/᩷֫ܿ;

    invoke-direct {v0}, Ll/᩷֫ܿ;-><init>()V

    .line 359
    sget-object v1, Ll/᩻֫ܿ;->ۙ:Ll/᩻֫ܿ;

    .line 534
    iget v1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    invoke-static {p1}, Ll/ܿ֫ܿ;->֫(Ll/ܿ֫ܿ;)I

    move-result v2

    if-ne v1, v2, :cond_11

    .line 362
    new-instance v1, Ll/۟۟ᩳ;

    invoke-direct {v1, p0, p1}, Ll/۟۟ᩳ;-><init>(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;)V

    .line 366
    :try_start_0
    invoke-static {p1}, Ll/ܿ֫ܿ;->ܳ(Ll/ܿ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v2
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    .line 367
    :try_start_1
    invoke-virtual {v2, v1}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 534
    iget v3, p0, Ll/ۜ֫ܿ;->ᩳ:I

    invoke-static {p1}, Ll/ܿ֫ܿ;->֫(Ll/ܿ֫ܿ;)I

    move-result v4

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_10

    .line 368
    invoke-static {p1}, Ll/ܿ֫ܿ;->᩷(Ll/ܿ֫ܿ;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 369
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v3

    invoke-static {p1}, Ll/ܿ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)I

    move-result v4

    if-ne v3, v4, :cond_10

    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v3

    invoke-static {p1}, Ll/ܿ֫ܿ;->᩻(Ll/ܿ֫ܿ;)I

    move-result v4

    if-eq v3, v4, :cond_1

    goto/16 :goto_6

    .line 374
    :cond_1
    invoke-static {p1}, Ll/ܿ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Ll/ۨۘܽ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    .line 375
    invoke-static {p1}, Ll/ܿ֫ܿ;->ۜ(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1}, Ll/ܿ֫ܿ;->ܿ(Ll/ܿ֫ܿ;)I

    move-result v1

    invoke-static {p1}, Ll/ܿ֫ܿ;->ᩳ(Ll/ܿ֫ܿ;)I

    move-result v4

    invoke-virtual {v3, v1, v4}, Ll/۫ۘܽ;->region(II)V

    .line 376
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    .line 380
    :cond_3
    :try_start_2
    invoke-virtual {v3}, Ll/۫ۘܽ;->find()Z

    move-result v6
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 534
    :try_start_3
    iget v7, p0, Ll/ۜ֫ܿ;->ᩳ:I

    invoke-static {p1}, Ll/ܿ֫ܿ;->֫(Ll/ܿ֫ܿ;)I

    move-result v8

    if-ne v7, v8, :cond_4

    const/4 v7, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_d

    .line 388
    invoke-static {p1}, Ll/ܿ֫ܿ;->᩷(Ll/ܿ֫ܿ;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_3

    .line 392
    :cond_5
    invoke-virtual {v3}, Ll/۫ۘܽ;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_6

    sget-object v7, Ll/᩻֫ܿ;->ۛ:Ll/᩻֫ܿ;

    goto :goto_2

    .line 393
    :cond_6
    invoke-virtual {v3}, Ll/۫ۘܽ;->᩻()Z

    move-result v7

    if-eqz v7, :cond_7

    sget-object v7, Ll/᩻֫ܿ;->۫:Ll/᩻֫ܿ;

    goto :goto_2

    .line 394
    :cond_7
    invoke-virtual {v3}, Ll/۫ۘܽ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_8

    sget-object v7, Ll/᩻֫ܿ;->᩶:Ll/᩻֫ܿ;

    goto :goto_2

    :cond_8
    sget-object v7, Ll/᩻֫ܿ;->᩹:Ll/᩻֫ܿ;

    :goto_2
    if-nez v6, :cond_9

    goto :goto_5

    .line 396
    :cond_9
    invoke-virtual {v3}, Ll/۫ۘܽ;->start()I

    move-result v6

    .line 397
    invoke-virtual {v3}, Ll/۫ۘܽ;->end()I

    move-result v8

    if-eq v6, v8, :cond_b

    const/16 v9, 0x270f

    if-ne v1, v9, :cond_a

    .line 400
    sget-object v1, Ll/᩻֫ܿ;->᩹:Ll/᩻֫ܿ;

    if-ne v7, v1, :cond_f

    sget-object v7, Ll/᩻֫ܿ;->۬:Ll/᩻֫ܿ;

    goto :goto_5

    .line 403
    :cond_a
    invoke-virtual {v0, v6, v8}, Ll/᩷֫ܿ;->֫(II)V

    add-int/lit8 v1, v1, 0x1

    .line 406
    :cond_b
    sget-object v6, Ll/᩻֫ܿ;->᩹:Ll/᩻֫ܿ;

    if-eq v7, v6, :cond_c

    goto :goto_5

    .line 407
    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-wide/16 v8, 0xbb8

    cmp-long v10, v6, v8

    if-lez v10, :cond_3

    .line 408
    sget-object v7, Ll/᩻֫ܿ;->ۛ:Ll/᩻֫ܿ;

    goto :goto_5

    .line 389
    :cond_d
    :goto_3
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;)V

    goto :goto_7

    :catch_0
    move-exception v1

    .line 502
    instance-of v1, v1, Ll/ۘ۬ᩳ;

    if-eqz v1, :cond_e

    sget-object v1, Ll/᩻֫ܿ;->۫:Ll/᩻֫ܿ;

    :goto_4
    move-object v7, v1

    goto :goto_5

    :cond_e
    sget-object v1, Ll/᩻֫ܿ;->᩶:Ll/᩻֫ܿ;

    goto :goto_4

    .line 412
    :cond_f
    :goto_5
    new-instance v1, Ll/ᩳ֫ܿ;

    invoke-static {p1}, Ll/ܿ֫ܿ;->᩻(Ll/ܿ֫ܿ;)I

    move-result v3

    invoke-virtual {v0, v3}, Ll/᩷֫ܿ;->֫(I)Ll/ۢ֫ܿ;

    move-result-object v0

    invoke-direct {v1, p1, v0, v7}, Ll/ᩳ֫ܿ;-><init>(Ll/ܿ֫ܿ;Ll/ۢ֫ܿ;Ll/᩻֫ܿ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 413
    :try_start_4
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 422
    :try_start_5
    invoke-direct {p0, v1}, Ll/ۜ֫ܿ;->֫(Ll/ᩳ֫ܿ;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_9

    :catch_1
    move-exception v0

    .line 424
    invoke-direct {p0, p1, v0}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ljava/lang/RuntimeException;)V

    goto :goto_9

    :catch_2
    move-exception v0

    .line 382
    :try_start_6
    throw v0

    .line 370
    :cond_10
    :goto_6
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 413
    :goto_7
    :try_start_7
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_3

    return-void

    :catchall_0
    move-exception v0

    .line 366
    :try_start_8
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v1

    :try_start_9
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v0
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_3

    :catch_3
    move-exception v0

    .line 417
    invoke-direct {p0, p1, v0}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ljava/lang/RuntimeException;)V

    goto :goto_9

    .line 414
    :catch_4
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;)V

    :cond_11
    :goto_9
    return-void
.end method

.method public static ֫(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;Ljava/util/concurrent/Future;)V
    .locals 2

    .line 431
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 432
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    .line 433
    sget-object v1, Ll/᩻֫ܿ;->ۛ:Ll/᩻֫ܿ;

    invoke-direct {p0, p1, v1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ll/᩻֫ܿ;)V

    .line 434
    iget p1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    const/4 p1, 0x0

    .line 435
    iput-object p1, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    .line 436
    iput-object p1, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 439
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 441
    invoke-direct {p0, p2}, Ll/ۜ֫ܿ;->֫(Ljava/util/concurrent/Future;)V

    .line 442
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    .line 439
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ֫(Ll/ܿ֫ܿ;)V
    .locals 1

    .line 484
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 485
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)V

    .line 486
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ܿ֫ܿ;Ljava/lang/RuntimeException;)V
    .locals 2

    .line 492
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 493
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 494
    :cond_0
    iget-object v1, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, Ll/ۜ֫ܿ;->֫(Ljava/util/concurrent/Future;)V

    .line 495
    :cond_1
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)V

    .line 502
    instance-of p2, p2, Ll/ۘ۬ᩳ;

    if-eqz p2, :cond_2

    sget-object p2, Ll/᩻֫ܿ;->۫:Ll/᩻֫ܿ;

    goto :goto_0

    :cond_2
    sget-object p2, Ll/᩻֫ܿ;->᩶:Ll/᩻֫ܿ;

    .line 496
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ll/᩻֫ܿ;)V

    .line 497
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 498
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 497
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ܿ֫ܿ;Ll/᩻֫ܿ;)V
    .locals 8

    .line 507
    iget-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 508
    invoke-static {v0}, Ll/ܳ֫ܿ;->ۧ(Ll/ܳ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v1

    invoke-static {p1}, Ll/ܿ֫ܿ;->ܳ(Ll/ܿ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {v0}, Ll/ܳ֫ܿ;->֫(Ll/ܳ֫ܿ;)I

    move-result v1

    invoke-static {p1}, Ll/ܿ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)I

    move-result p1

    if-ne v1, p1, :cond_0

    .line 509
    new-instance p1, Ll/ܳ֫ܿ;

    invoke-static {v0}, Ll/ܳ֫ܿ;->ۧ(Ll/ܳ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v3

    invoke-static {v0}, Ll/ܳ֫ܿ;->֫(Ll/ܳ֫ܿ;)I

    move-result v4

    invoke-static {v0}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v5

    const/4 v7, 0x0

    move-object v2, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object p1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    :cond_0
    return-void
.end method

.method private ֫(Ll/ᩳ֫ܿ;)V
    .locals 3

    .line 448
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 449
    :try_start_0
    invoke-static {p1}, Ll/ᩳ֫ܿ;->֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1}, Ll/ᩳ֫ܿ;->֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ֫ܿ;->᩷(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 453
    :cond_0
    iget-object v1, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 454
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v1, 0x0

    .line 455
    iput-object v1, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    .line 457
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۜ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_3

    .line 459
    new-instance v1, Ll/֫֫ܿ;

    invoke-direct {v1, p0, v0, p1}, Ll/֫֫ܿ;-><init>(Ll/ۜ֫ܿ;Ll/۫ۨᩳ;Ll/ᩳ֫ܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 460
    :cond_3
    :goto_0
    invoke-static {p1}, Ll/ᩳ֫ܿ;->֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;)V

    return-void

    .line 450
    :cond_4
    :goto_1
    :try_start_1
    invoke-static {p1}, Ll/ᩳ֫ܿ;->֫(Ll/ᩳ֫ܿ;)Ll/ܿ֫ܿ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)V

    .line 451
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 457
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ۧ(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;)V
    .locals 7

    .line 337
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 338
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1}, Ll/ܿ֫ܿ;->᩷(Ll/ܿ֫ܿ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 342
    iput-object v1, p0, Ll/ۜ֫ܿ;->ܽ:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    :try_start_1
    iget-object v2, p0, Ll/ۜ֫ܿ;->ܺ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v3, Ll/᩺۟ᩳ;

    invoke-direct {v3, p0, p1}, Ll/᩺۟ᩳ;-><init>(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    .line 345
    iput-object v2, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    .line 346
    sget-object v3, Ll/ۜ֫ܿ;->ۖ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Ll/ܰ۟ᩳ;

    invoke-direct {v4, p0, p1, v2}, Ll/ܰ۟ᩳ;-><init>(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;Ljava/util/concurrent/Future;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0xdac

    invoke-interface {v3, v4, v5, v6, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    iput-object v2, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 351
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    .line 352
    invoke-direct {p0, p1, v1}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ljava/lang/RuntimeException;)V

    :cond_1
    return-void

    .line 339
    :cond_2
    :goto_1
    :try_start_3
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ۧ(Ll/ܿ֫ܿ;)V

    .line 340
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 351
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private ۧ(Ll/ܿ֫ܿ;)V
    .locals 2

    .line 521
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    sget-object v0, Ll/᩻֫ܿ;->ۙ:Ll/᩻֫ܿ;

    invoke-direct {p0, p1, v0}, Ll/ۜ֫ܿ;->֫(Ll/ܿ֫ܿ;Ll/᩻֫ܿ;)V

    .line 523
    iget p1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    const/4 p1, 0x0

    .line 524
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    .line 525
    iput-object p1, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    .line 526
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 527
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 528
    iput-object p1, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public static ܽ(Ll/ۜ֫ܿ;Ll/ܿ֫ܿ;)V
    .locals 0

    .line 534
    iget p0, p0, Ll/ۜ֫ܿ;->ᩳ:I

    invoke-static {p1}, Ll/ܿ֫ܿ;->֫(Ll/ܿ֫ܿ;)I

    move-result p1

    if-ne p0, p1, :cond_0

    .line 363
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 364
    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Search highlight canceled"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ܽ(Ll/ܿ֫ܿ;)Z
    .locals 2

    .line 539
    iget v0, p0, Ll/ۜ֫ܿ;->ᩳ:I

    invoke-static {p1}, Ll/ܿ֫ܿ;->֫(Ll/ܿ֫ܿ;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    invoke-static {p1}, Ll/ܿ֫ܿ;->ܽ(Ll/ܿ֫ܿ;)Ll/ۨۘܽ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    invoke-static {p1}, Ll/ܿ֫ܿ;->ܳ(Ll/ܿ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object p1

    if-ne v0, p1, :cond_0

    iget-boolean p1, p0, Ll/ۜ֫ܿ;->֫:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/ۜ֫ܿ;->ۧ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ܿ()V
    .locals 2

    .line 565
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۜ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_0

    .line 567
    new-instance v1, Ll/ۛ۟ᩳ;

    invoke-direct {v1, v0}, Ll/ۛ۟ᩳ;-><init>(Ll/۫ۨᩳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private ܿ(Ll/᩶᩸ᩳ;)V
    .locals 10

    .line 316
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v8

    .line 317
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 319
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۜ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۨᩳ;

    if-eqz v0, :cond_0

    .line 321
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 323
    iget v1, v0, Ll/۬۟ᩳ;->ۧ:I

    if-ltz v1, :cond_1

    iget v2, v0, Ll/۬۟ᩳ;->֫:I

    if-ge v1, v2, :cond_1

    if-gt v2, v5, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    .line 325
    iget v2, v0, Ll/۬۟ᩳ;->ۧ:I

    move v6, v2

    goto :goto_2

    :cond_2
    const/4 v2, -0x1

    const/4 v6, -0x1

    :goto_2
    if-eqz v1, :cond_3

    .line 326
    iget v0, v0, Ll/۬۟ᩳ;->֫:I

    move v7, v0

    goto :goto_3

    :cond_3
    const/4 v0, -0x1

    const/4 v7, -0x1

    .line 327
    :goto_3
    new-instance v9, Ll/ܿ֫ܿ;

    iget v0, p0, Ll/ۜ֫ܿ;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۜ֫ܿ;->ᩳ:I

    iget-object v2, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    move-object v0, v9

    move-object v3, p1

    move v4, v8

    invoke-direct/range {v0 .. v7}, Ll/ܿ֫ܿ;-><init>(ILl/ۨۘܽ;Ll/᩶᩸ᩳ;IIII)V

    .line 329
    new-instance p1, Ll/ܳ֫ܿ;

    iget-object v1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    iget-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v0}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v3

    sget-object v4, Ll/᩻֫ܿ;->ۤ:Ll/᩻֫ܿ;

    const/4 v5, 0x0

    move-object v0, p1

    move v2, v8

    invoke-direct/range {v0 .. v5}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object p1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 330
    sget-object p1, Ll/ۜ֫ܿ;->ۖ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Ll/ۡۛᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, v9}, Ll/ۡۛᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x64

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ֫ܿ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private ᩳ()V
    .locals 8

    .line 545
    iget v0, p0, Ll/ۜ֫ܿ;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜ֫ܿ;->ᩳ:I

    .line 546
    iget-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v0

    sget-object v1, Ll/᩻֫ܿ;->ۤ:Ll/᩻֫ܿ;

    if-ne v0, v1, :cond_0

    .line 547
    new-instance v0, Ll/ܳ֫ܿ;

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->ۧ(Ll/ܳ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v3

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->֫(Ll/ܳ֫ܿ;)I

    move-result v4

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v5

    sget-object v6, Ll/᩻֫ܿ;->ۙ:Ll/᩻֫ܿ;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 549
    :cond_0
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 550
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 551
    iput-object v2, p0, Ll/ۜ֫ܿ;->ܽ:Ljava/util/concurrent/ScheduledFuture;

    .line 553
    :cond_1
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    .line 554
    invoke-direct {p0, v0}, Ll/ۜ֫ܿ;->֫(Ljava/util/concurrent/Future;)V

    .line 555
    iput-object v2, p0, Ll/ۜ֫ܿ;->ۢ:Ljava/util/concurrent/Future;

    .line 557
    :cond_2
    iget-object v0, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_3

    .line 558
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 559
    iput-object v2, p0, Ll/ۜ֫ܿ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;II)Ll/ܽ֫ܿ;
    .locals 6

    .line 58
    iget-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 59
    invoke-static {v0}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֫ܿ;->֫()I

    move-result v1

    .line 60
    sget-object v2, Ll/ۧ֫ܿ;->֫:[I

    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    :pswitch_0
    const v2, 0x7f120a84

    .line 66
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    const v2, 0x7f120904

    .line 65
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    const v2, 0x7f120905

    .line 64
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    if-nez v1, :cond_0

    const v2, 0x7f120906

    .line 62
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v2, v5, v4

    const v2, 0x7f120907

    invoke-virtual {p1, v2, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    const-string p1, "\u2026"

    .line 69
    :goto_0
    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v2

    sget-object v5, Ll/᩻֫ܿ;->ۤ:Ll/᩻֫ܿ;

    if-eq v2, v5, :cond_2

    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v2

    sget-object v5, Ll/᩻֫ܿ;->ۙ:Ll/᩻֫ܿ;

    if-ne v2, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-eqz p1, :cond_3

    .line 70
    new-instance p2, Ll/ܽ֫ܿ;

    xor-int/lit8 p3, v2, 0x1

    invoke-direct {p2, p1, v1, p3, v2}, Ll/ܽ֫ܿ;-><init>(Ljava/lang/String;IZZ)V

    return-object p2

    .line 71
    :cond_3
    invoke-static {v0}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ll/ۢ֫ܿ;->֫(II)I

    move-result p1

    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object p3

    sget-object v2, Ll/᩻֫ܿ;->۬:Ll/᩻֫ܿ;

    if-ne p3, v2, :cond_4

    const-string p3, "+"

    goto :goto_3

    :cond_4
    const-string p3, ""

    :goto_3
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 73
    new-instance p3, Ll/ܽ֫ܿ;

    const/4 v2, -0x1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_4
    if-nez v1, :cond_6

    invoke-static {v0}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object p1

    sget-object v0, Ll/᩻֫ܿ;->᩹:Ll/᩻֫ܿ;

    if-ne p1, v0, :cond_6

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    invoke-direct {p3, p2, v1, v3, v4}, Ll/ܽ֫ܿ;-><init>(Ljava/lang/String;IZZ)V

    return-object p3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()V
    .locals 4

    .line 202
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 203
    :try_start_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    const/4 v1, 0x0

    .line 204
    iput-object v1, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    .line 205
    iget-object v1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 206
    :cond_0
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 207
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 208
    :goto_1
    invoke-static {v1, v3, v2}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 209
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception v1

    .line 209
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/graphics/Canvas;IIFFLl/֫ۖܽ;Ll/᩺֫ܿ;Ll/ۧۧܿ;)V
    .locals 16

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p0

    .line 160
    iget-object v2, v10, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v2}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v11

    .line 161
    invoke-virtual {v11}, Ll/ۢ֫ܿ;->֫()I

    move-result v2

    if-eqz v2, :cond_4

    if-ne v0, v1, :cond_0

    goto/16 :goto_2

    .line 164
    :cond_0
    invoke-virtual {v11, v0}, Ll/ۢ֫ܿ;->ۧ(I)I

    move-result v2

    const/4 v3, 0x0

    move v12, v2

    move v2, v0

    .line 167
    :goto_0
    invoke-virtual {v11}, Ll/ۢ֫ܿ;->֫()I

    move-result v4

    if-ge v12, v4, :cond_4

    .line 168
    invoke-virtual {v11, v12}, Ll/ۢ֫ܿ;->ᩳ(I)I

    move-result v4

    if-lt v4, v1, :cond_1

    goto/16 :goto_2

    .line 172
    :cond_1
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 173
    invoke-virtual {v11, v12}, Ll/ۢ֫ܿ;->֫(I)I

    move-result v5

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v13

    if-ge v2, v4, :cond_2

    .line 175
    move-object/from16 v5, p8

    check-cast v5, Ll/᩶ۤᩳ;

    invoke-virtual {v5, v2, v3, v4}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    add-float/2addr v3, v2

    :cond_2
    move v14, v3

    .line 177
    move-object/from16 v2, p8

    check-cast v2, Ll/᩶ۤᩳ;

    invoke-virtual {v2, v4, v14, v13}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    add-float v15, v14, v2

    .line 187
    iget v2, v9, Ll/᩺֫ܿ;->ۨ֫:I

    if-nez v2, :cond_3

    .line 188
    iget v2, v9, Ll/᩺֫ܿ;->ۛ֫:I

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, p4

    move v5, v15

    move/from16 v6, p5

    move-object/from16 v7, p6

    .line 189
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 191
    :cond_3
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v2, p1

    move v3, v14

    move/from16 v4, p4

    move v5, v15

    move/from16 v6, p5

    move-object/from16 v7, p6

    .line 192
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 193
    iget v2, v9, Ll/᩺֫ܿ;->ۛ֫:I

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 194
    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    int-to-float v2, v2

    add-float v3, v14, v2

    add-float v4, p4, v2

    sub-float v5, v15, v2

    sub-float v6, p5, v2

    move-object/from16 v2, p1

    .line 195
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_1
    add-int/lit8 v12, v12, 0x1

    move v2, v13

    move v3, v15

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public final ֫(Ll/۟᩺ᩳ;Ll/ۨۘܽ;)V
    .locals 2

    const-string v0, "text"

    .line 116
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 119
    :try_start_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    .line 120
    iput-object p2, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    .line 121
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 122
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 123
    iget-boolean p2, p0, Ll/ۜ֫ܿ;->֫:Z

    if-nez p2, :cond_0

    iget-boolean p2, p0, Ll/ۜ֫ܿ;->ۧ:Z

    if-nez p2, :cond_0

    .line 124
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    .line 126
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 126
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩶᩸ᩳ;)V
    .locals 3

    .line 275
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 276
    :try_start_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    const/4 v1, 0x0

    .line 277
    iput-boolean v1, p0, Ll/ۜ֫ܿ;->֫:Z

    .line 278
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 279
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {p1, v1, v2}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 280
    iget-object v1, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/ۜ֫ܿ;->ۧ:Z

    if-nez v1, :cond_0

    .line 281
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    .line 283
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 283
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩶᩸ᩳ;III)V
    .locals 9

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    .line 230
    :cond_0
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 231
    :try_start_0
    iget-object v1, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    if-nez v1, :cond_1

    .line 232
    monitor-exit v0

    return-void

    .line 234
    :cond_1
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    .line 235
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 236
    iget-boolean v1, p0, Ll/ۜ֫ܿ;->֫:Z

    if-nez v1, :cond_4

    iget-boolean v1, p0, Ll/ۜ֫ܿ;->ۧ:Z

    if-eqz v1, :cond_2

    goto :goto_1

    .line 240
    :cond_2
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    .line 241
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    int-to-long v2, v1

    int-to-long v5, p4

    sub-long/2addr v2, v5

    int-to-long v5, p3

    add-long/2addr v2, v5

    .line 243
    iget-object v5, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-ltz v8, :cond_3

    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v2, v6

    if-gtz v8, :cond_3

    .line 244
    invoke-static {v5}, Ll/ܳ֫ܿ;->ۧ(Ll/ܳ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v6

    if-ne v6, p1, :cond_3

    invoke-static {v5}, Ll/ܳ֫ܿ;->֫(Ll/ܳ֫ܿ;)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v4, :cond_3

    invoke-static {v5}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v6

    .line 247
    invoke-virtual {v6}, Ll/ۢ֫ܿ;->ۧ()I

    move-result v6

    long-to-int v3, v2

    if-ne v6, v3, :cond_3

    .line 248
    invoke-static {v5}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v1

    invoke-virtual {v1, p2, p3, p4}, Ll/ۢ֫ܿ;->֫(III)V

    .line 249
    new-instance p2, Ll/ܳ֫ܿ;

    invoke-static {v5}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object p3

    invoke-static {v5}, Ll/ܳ֫ܿ;->ܽ(Ll/ܳ֫ܿ;)Ll/᩻֫ܿ;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, p2

    move-object v3, p1

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object p2, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    goto :goto_0

    .line 251
    :cond_3
    invoke-static {p1, v4, v1}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 253
    :goto_0
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    .line 254
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    .line 237
    :cond_4
    :goto_1
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 254
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ(Ll/᩶᩸ᩳ;)V
    .locals 4

    .line 261
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 262
    :try_start_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    const/4 v1, 0x1

    .line 263
    iput-boolean v1, p0, Ll/ۜ֫ܿ;->֫:Z

    .line 264
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 265
    iget-object v2, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v2}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢ֫ܿ;->֫()I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 266
    :goto_0
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {p1, v2, v3}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 267
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 269
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 267
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v0}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֫ܿ;->֫()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 8

    .line 215
    invoke-virtual {p0}, Ll/ۜ֫ܿ;->֫()V

    .line 216
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 217
    :try_start_0
    new-instance v7, Ll/ܳ֫ܿ;

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->ۧ(Ll/ܳ֫ܿ;)Ll/᩶᩸ᩳ;

    move-result-object v2

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->֫(Ll/ܳ֫ܿ;)I

    move-result v3

    iget-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    invoke-static {v1}, Ll/ܳ֫ܿ;->ᩳ(Ll/ܳ֫ܿ;)Ll/ۢ֫ܿ;

    move-result-object v4

    sget-object v5, Ll/᩻֫ܿ;->ۗ:Ll/᩻֫ܿ;

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/ܳ֫ܿ;-><init>(Ll/᩶᩸ᩳ;ILl/ۢ֫ܿ;Ll/᩻֫ܿ;I)V

    iput-object v7, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 218
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception v1

    .line 218
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ(Ll/᩶᩸ᩳ;)V
    .locals 3

    .line 300
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 301
    :try_start_0
    iget-object v1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-eq v1, p1, :cond_0

    .line 302
    monitor-exit v0

    return-void

    .line 304
    :cond_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    const/4 v1, 0x0

    .line 305
    iput-boolean v1, p0, Ll/ۜ֫ܿ;->ۧ:Z

    .line 306
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {p1, v1, v2}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 307
    iget-object v1, p0, Ll/ۜ֫ܿ;->᩻:Ll/ۨۘܽ;

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/ۜ֫ܿ;->֫:Z

    if-nez v1, :cond_1

    .line 308
    invoke-direct {p0, p1}, Ll/ۜ֫ܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    .line 310
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 310
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩳ(Ll/᩶᩸ᩳ;)V
    .locals 3

    .line 289
    iget-object v0, p0, Ll/ۜ֫ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 290
    :try_start_0
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ᩳ()V

    .line 291
    iput-object p1, p0, Ll/ۜ֫ܿ;->ܳ:Ll/᩶᩸ᩳ;

    const/4 v1, 0x1

    .line 292
    iput-boolean v1, p0, Ll/ۜ֫ܿ;->ۧ:Z

    .line 293
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {p1, v1, v2}, Ll/ܳ֫ܿ;->֫(Ll/᩶᩸ᩳ;II)Ll/ܳ֫ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ֫ܿ;->᩷:Ll/ܳ֫ܿ;

    .line 294
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    invoke-direct {p0}, Ll/ۜ֫ܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 294
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
