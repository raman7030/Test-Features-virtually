.class public final Ll/᩶᩶ۜ;
.super Ljava/lang/Object;
.source "Q759"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ֫֫:J

.field public ۗ:Ljava/lang/Thread;

.field public ۙ:Z

.field public final ۛ:Ljava/util/concurrent/Executor;

.field public ۟:Z

.field public final ۤ:Ll/ۗ۠֫;

.field public ۧ֫:Ljava/lang/Thread;

.field public ۨ:Ljava/lang/Throwable;

.field public final ۫:Ll/᩸۠֫;

.field public ۬:Z

.field public final ܰ:Ljava/lang/Object;

.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:Ljava/lang/Throwable;

.field public ᩺:Z


# direct methods
.method public constructor <init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 2

    .line 440
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 421
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    const-wide/16 v0, -0x1

    .line 426
    iput-wide v0, p0, Ll/᩶᩶ۜ;->֫֫:J

    .line 441
    iput-object p1, p0, Ll/᩶᩶ۜ;->۫:Ll/᩸۠֫;

    .line 442
    iput-object p2, p0, Ll/᩶᩶ۜ;->ۤ:Ll/ۗ۠֫;

    .line 443
    iput-object p3, p0, Ll/᩶᩶ۜ;->ۛ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩶᩶ۜ;->ܽ(Ljava/lang/Throwable;)V

    return-void
.end method

.method private ۧ(Ljava/lang/Throwable;)V
    .locals 1

    .line 516
    :try_start_0
    invoke-virtual {p0}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eq v0, p1, :cond_0

    .line 519
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 522
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 523
    :try_start_1
    iput-object p1, p0, Ll/᩶᩶ۜ;->ۨ:Ljava/lang/Throwable;

    const/4 p1, 0x1

    .line 524
    iput-boolean p1, p0, Ll/᩶᩶ۜ;->۬:Z

    .line 525
    iget-object p1, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 526
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method

.method public static ܽ(Ljava/lang/Throwable;)V
    .locals 2

    .line 663
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 666
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_2

    .line 669
    instance-of v0, p0, Ljava/lang/Error;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    return-void

    .line 673
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Preview data source close failed"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 669
    :cond_1
    check-cast p0, Ljava/lang/Error;

    .line 670
    throw p0

    .line 666
    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    .line 667
    throw p0

    .line 663
    :cond_3
    check-cast p0, Ljava/io/IOException;

    .line 664
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 457
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    .line 459
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 460
    :try_start_0
    iput-object v1, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    .line 461
    iget-boolean v2, p0, Ll/᩶᩶ۜ;->᩸:Z

    .line 462
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, -0x1

    if-nez v2, :cond_0

    .line 468
    :try_start_1
    iget-object v0, p0, Ll/᩶᩶ۜ;->۫:Ll/᩸۠֫;

    iget-object v2, p0, Ll/᩶᩶ۜ;->ۤ:Ll/ۗ۠֫;

    invoke-interface {v0, v2}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 472
    :try_start_2
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 474
    :try_start_3
    iput-boolean v3, p0, Ll/᩶᩶ۜ;->۟:Z

    .line 475
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 472
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    .line 474
    :try_start_5
    iput-boolean v3, p0, Ll/᩶᩶ۜ;->۟:Z

    .line 475
    monitor-exit v0

    goto :goto_1

    :catchall_2
    move-exception v2

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v2

    :cond_0
    :goto_0
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_2

    .line 480
    invoke-direct {p0, v2}, Ll/᩶᩶ۜ;->ۧ(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 503
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 504
    :try_start_7
    iget-object v2, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    if-ne v2, v1, :cond_1

    .line 505
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    .line 507
    :cond_1
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 509
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    return-void

    :catchall_3
    move-exception v1

    .line 507
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v1

    .line 484
    :cond_2
    :try_start_9
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 485
    :try_start_a
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۨ:Ljava/lang/Throwable;

    .line 486
    iput-wide v5, p0, Ll/᩶᩶ۜ;->֫֫:J

    .line 487
    iput-boolean v3, p0, Ll/᩶᩶ۜ;->۬:Z

    .line 488
    iget-object v2, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 489
    :catch_0
    :goto_2
    iget-boolean v2, p0, Ll/᩶᩶ۜ;->᩸:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Ll/᩶᩶ۜ;->᩺:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    if-nez v2, :cond_3

    .line 491
    :try_start_b
    iget-object v2, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_2

    .line 496
    :cond_3
    :try_start_c
    iget-boolean v2, p0, Ll/᩶᩶ۜ;->᩺:Z

    .line 497
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    if-nez v2, :cond_4

    .line 679
    :try_start_d
    invoke-virtual {p0}, Ll/᩶᩶ۜ;->ܽ()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 503
    :catchall_4
    :cond_4
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 504
    :try_start_e
    iget-object v2, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    if-ne v2, v1, :cond_5

    .line 505
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    .line 507
    :cond_5
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 509
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    return-void

    :catchall_5
    move-exception v1

    .line 507
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    throw v1

    :catchall_6
    move-exception v2

    .line 497
    :try_start_10
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :catchall_7
    move-exception v0

    move-object v2, v0

    .line 503
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 504
    :try_start_12
    iget-object v3, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    if-ne v3, v1, :cond_6

    .line 505
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    .line 507
    :cond_6
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 509
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 510
    throw v2

    :catchall_8
    move-exception v1

    .line 507
    :try_start_13
    monitor-exit v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    throw v1

    :catchall_9
    move-exception v1

    .line 462
    :try_start_14
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    throw v1
.end method

.method public final ֫()V
    .locals 4

    .line 530
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 531
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->۬:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/᩶᩶ۜ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 533
    :try_start_1
    iget-object v1, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 535
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 536
    new-instance v2, Ljava/io/InterruptedIOException;

    const-string v3, "Preview read was canceled"

    invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 538
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 539
    throw v2

    .line 542
    :cond_0
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->᩸:Z

    if-nez v1, :cond_5

    .line 545
    iget-object v1, p0, Ll/᩶᩶ۜ;->ۨ:Ljava/lang/Throwable;

    instance-of v2, v1, Ljava/io/IOException;

    if-nez v2, :cond_4

    .line 548
    instance-of v2, v1, Ljava/lang/RuntimeException;

    if-nez v2, :cond_3

    .line 551
    instance-of v2, v1, Ljava/lang/Error;

    if-nez v2, :cond_2

    if-nez v1, :cond_1

    .line 557
    monitor-exit v0

    return-void

    .line 555
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Preview data source open failed"

    iget-object v3, p0, Ll/᩶᩶ۜ;->ۨ:Ljava/lang/Throwable;

    invoke-direct {v1, v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 552
    :cond_2
    check-cast v1, Ljava/lang/Error;

    throw v1

    .line 549
    :cond_3
    check-cast v1, Ljava/lang/RuntimeException;

    throw v1

    .line 546
    :cond_4
    check-cast v1, Ljava/io/IOException;

    throw v1

    .line 543
    :cond_5
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "Preview read was canceled"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 557
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 4

    .line 582
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 583
    :try_start_0
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->᩺:Z

    if-eqz v1, :cond_0

    .line 584
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 586
    iput-boolean v1, p0, Ll/᩶᩶ۜ;->᩸:Z

    .line 587
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->۟:Z

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    .line 589
    :cond_1
    iget-object v2, p0, Ll/᩶᩶ۜ;->ۧ֫:Ljava/lang/Thread;

    .line 590
    :goto_0
    iget-object v3, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 591
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    .line 593
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    if-eqz v1, :cond_3

    .line 596
    invoke-virtual {p0}, Ll/᩶᩶ۜ;->ܽ()V

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 591
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܳ()V
    .locals 3

    .line 448
    :try_start_0
    iget-object v0, p0, Ll/᩶᩶ۜ;->ۛ:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 451
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Preview open capacity is exhausted"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Ll/᩶᩶ۜ;->ۧ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 619
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 620
    :try_start_0
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->ۙ:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 621
    iput-boolean v2, p0, Ll/᩶᩶ۜ;->ۙ:Z

    .line 622
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iput-object v1, p0, Ll/᩶᩶ۜ;->ۗ:Ljava/lang/Thread;

    const/4 v1, 0x0

    const/4 v3, 0x1

    goto :goto_1

    .line 624
    :cond_0
    iget-object v1, p0, Ll/᩶᩶ۜ;->ۗ:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v1, v4, :cond_1

    .line 626
    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 628
    :goto_0
    iget-boolean v4, p0, Ll/᩶᩶ۜ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v4, :cond_2

    .line 630
    :try_start_1
    iget-object v4, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    .line 637
    :cond_2
    :goto_1
    :try_start_2
    iget-object v4, p0, Ll/᩶᩶ۜ;->᩹:Ljava/lang/Throwable;

    .line 638
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    .line 642
    :try_start_3
    iget-object v0, p0, Ll/᩶᩶ۜ;->۫:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 646
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 647
    :try_start_4
    iput-object v4, p0, Ll/᩶᩶ۜ;->᩹:Ljava/lang/Throwable;

    .line 648
    iput-boolean v2, p0, Ll/᩶᩶ۜ;->᩶:Z

    .line 649
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۗ:Ljava/lang/Thread;

    .line 650
    iget-object v2, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 651
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    move-object v3, v0

    .line 646
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 647
    :try_start_5
    iput-object v3, p0, Ll/᩶᩶ۜ;->᩹:Ljava/lang/Throwable;

    .line 648
    iput-boolean v2, p0, Ll/᩶᩶ۜ;->᩶:Z

    .line 649
    iput-object v4, p0, Ll/᩶᩶ۜ;->ۗ:Ljava/lang/Thread;

    .line 650
    iget-object v2, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 651
    monitor-exit v0

    move-object v4, v3

    goto :goto_2

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 656
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 658
    :cond_4
    invoke-static {v4}, Ll/᩶᩶ۜ;->ܽ(Ljava/lang/Throwable;)V

    return-void

    :catchall_3
    move-exception v1

    .line 638
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v1
.end method

.method public final ܿ()J
    .locals 3

    .line 573
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 574
    :try_start_0
    iget-wide v1, p0, Ll/᩶᩶ۜ;->֫֫:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 575
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Z
    .locals 3

    .line 561
    iget-object v0, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 562
    :try_start_0
    iget-boolean v1, p0, Ll/᩶᩶ۜ;->᩸:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/᩶᩶ۜ;->۬:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩶᩶ۜ;->ۨ:Ljava/lang/Throwable;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/᩶᩶ۜ;->᩺:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 565
    iput-boolean v1, p0, Ll/᩶᩶ۜ;->᩺:Z

    .line 566
    iget-object v2, p0, Ll/᩶᩶ۜ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 567
    monitor-exit v0

    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 563
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 568
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
