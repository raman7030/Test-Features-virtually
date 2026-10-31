.class public final Ll/ܳܳۧ;
.super Landroid/os/Handler;
.source "763M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ۗ:I

.field public final ۙ:I

.field public final ۛ:J

.field public volatile ۤ:Z

.field public final synthetic ۨ:Ll/ۡܳۧ;

.field public final ۫:Ll/᩻ܳۧ;

.field public ۬:Ljava/lang/Thread;

.field public ᩶:Ljava/io/IOException;

.field public ᩸:Ll/ᩳܳۧ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۡܳۧ;Landroid/os/Looper;Ll/᩻ܳۧ;Ll/ᩳܳۧ;IJ)V
    .locals 0

    .line 384
    iput-object p1, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    .line 385
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 386
    iput-object p3, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    .line 387
    iput-object p4, p0, Ll/ܳܳۧ;->᩸:Ll/ᩳܳۧ;

    .line 388
    iput p5, p0, Ll/ܳܳۧ;->ۙ:I

    .line 389
    iput-wide p6, p0, Ll/ܳܳۧ;->ۛ:J

    return-void
.end method

.method private ֫()V
    .locals 7

    .line 550
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 551
    iget-wide v0, p0, Ll/ܳܳۧ;->ۛ:J

    sub-long v4, v2, v0

    .line 552
    iget-object v0, p0, Ll/ܳܳۧ;->᩸:Ll/ᩳܳۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    iget-object v1, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    iget v6, p0, Ll/ܳܳۧ;->ۗ:I

    invoke-interface/range {v0 .. v6}, Ll/ᩳܳۧ;->֫(Ll/᩻ܳۧ;JJI)V

    const/4 v0, 0x0

    .line 553
    iput-object v0, p0, Ll/ܳܳۧ;->᩶:Ljava/io/IOException;

    .line 554
    iget-object v0, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    invoke-static {v0}, Ll/ۡܳۧ;->ۧ(Ll/ۡܳۧ;)Ll/۠ܳۧ;

    move-result-object v1

    invoke-static {v0}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;)Ll/ܳܳۧ;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 498
    iget-boolean v0, p0, Ll/ܳܳۧ;->ۤ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 501
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 502
    invoke-direct {p0}, Ll/ܳܳۧ;->֫()V

    return-void

    :cond_1
    const/4 v2, 0x4

    if-eq v0, v2, :cond_9

    .line 558
    iget-object v0, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;Ll/ܳܳۧ;)V

    .line 509
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    .line 510
    iget-wide v2, p0, Ll/ܳܳۧ;->ۛ:J

    sub-long v7, v5, v2

    .line 511
    iget-object v3, p0, Ll/ܳܳۧ;->᩸:Ll/ᩳܳۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    iget-boolean v0, p0, Ll/ܳܳۧ;->᩹:Z

    if-eqz v0, :cond_2

    .line 513
    iget-object v4, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Ll/ᩳܳۧ;->֫(Ll/᩻ܳۧ;JJZ)V

    return-void

    .line 516
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_8

    const/4 v11, 0x3

    if-eq v0, v11, :cond_3

    goto :goto_1

    .line 527
    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Ljava/io/IOException;

    iput-object v9, p0, Ll/ܳܳۧ;->᩶:Ljava/io/IOException;

    .line 528
    iget p1, p0, Ll/ܳܳۧ;->ۗ:I

    add-int/lit8 v10, p1, 0x1

    iput v10, p0, Ll/ܳܳۧ;->ۗ:I

    .line 529
    iget-object v4, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    .line 530
    invoke-interface/range {v3 .. v10}, Ll/ᩳܳۧ;->֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;

    move-result-object p1

    .line 531
    invoke-static {p1}, Ll/ܿܳۧ;->ۧ(Ll/ܿܳۧ;)I

    move-result v0

    if-ne v0, v11, :cond_4

    .line 532
    iget-object p1, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    iget-object v0, p0, Ll/ܳܳۧ;->᩶:Ljava/io/IOException;

    invoke-static {p1, v0}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;Ljava/io/IOException;)V

    return-void

    .line 533
    :cond_4
    invoke-static {p1}, Ll/ܿܳۧ;->ۧ(Ll/ܿܳۧ;)I

    move-result v0

    if-eq v0, v2, :cond_7

    .line 534
    invoke-static {p1}, Ll/ܿܳۧ;->ۧ(Ll/ܿܳۧ;)I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 535
    iput v1, p0, Ll/ܳܳۧ;->ۗ:I

    .line 538
    :cond_5
    invoke-static {p1}, Ll/ܿܳۧ;->֫(Ll/ܿܳۧ;)J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    .line 539
    invoke-static {p1}, Ll/ܿܳۧ;->֫(Ll/ܿܳۧ;)J

    move-result-wide v0

    goto :goto_0

    .line 562
    :cond_6
    iget p1, p0, Ll/ܳܳۧ;->ۗ:I

    sub-int/2addr p1, v1

    mul-int/lit16 p1, p1, 0x3e8

    const/16 v0, 0x1388

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v0, p1

    .line 537
    :goto_0
    invoke-virtual {p0, v0, v1}, Ll/ܳܳۧ;->֫(J)V

    :cond_7
    :goto_1
    return-void

    .line 519
    :cond_8
    :try_start_0
    iget-object v4, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    invoke-interface/range {v3 .. v8}, Ll/ᩳܳۧ;->֫(Ll/᩻ܳۧ;JJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unexpected exception handling load completed"

    .line 522
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 523
    iget-object v0, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    new-instance v1, Ll/ۢܳۧ;

    invoke-direct {v1, p1}, Ll/ۢܳۧ;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;Ljava/io/IOException;)V

    return-void

    .line 506
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Error;

    throw p1
.end method

.method public final run()V
    .locals 5

    const-string v1, "load:"

    const/4 v2, 0x3

    move-object v0, p0

    .line 446
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 447
    :try_start_1
    iget-boolean v3, p0, Ll/ܳܳۧ;->᩹:Z

    .line 448
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    iput-object v4, p0, Ll/ܳܳۧ;->۬:Ljava/lang/Thread;

    .line 449
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v3, :cond_0

    .line 451
    :try_start_2
    iget-object v0, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 453
    :try_start_3
    iget-object v0, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    invoke-interface {v0}, Ll/᩻ܳۧ;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 456
    throw v0

    :cond_0
    :goto_0
    move-object v0, p0

    .line 458
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v1, 0x0

    .line 459
    :try_start_5
    iput-object v1, p0, Ll/ܳܳۧ;->۬:Ljava/lang/Thread;

    .line 461
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 462
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 463
    :try_start_6
    iget-boolean v0, p0, Ll/ܳܳۧ;->ۤ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x2

    .line 464
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    return-void

    :catchall_1
    move-exception v1

    .line 462
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    :catchall_2
    move-exception v1

    .line 449
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    :catch_0
    move-exception v0

    .line 488
    iget-boolean v1, p0, Ll/ܳܳۧ;->ۤ:Z

    if-nez v1, :cond_1

    const-string v1, "Unexpected error loading stream"

    .line 489
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x4

    .line 490
    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 492
    :cond_1
    throw v0

    :catch_1
    move-exception v0

    .line 480
    iget-boolean v1, p0, Ll/ܳܳۧ;->ۤ:Z

    if-nez v1, :cond_2

    const-string v1, "OutOfMemory error loading stream"

    .line 481
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 482
    new-instance v1, Ll/ۢܳۧ;

    invoke-direct {v1, v0}, Ll/ۢܳۧ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    :catch_2
    move-exception v0

    .line 472
    iget-boolean v1, p0, Ll/ܳܳۧ;->ۤ:Z

    if-nez v1, :cond_2

    const-string v1, "Unexpected exception loading stream"

    .line 473
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 474
    new-instance v1, Ll/ۢܳۧ;

    invoke-direct {v1, v0}, Ll/ۢܳۧ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    :catch_3
    move-exception v0

    .line 467
    iget-boolean v1, p0, Ll/ܳܳۧ;->ۤ:Z

    if-nez v1, :cond_2

    .line 468
    invoke-virtual {p0, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 393
    iget-object v0, p0, Ll/ܳܳۧ;->᩶:Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ܳܳۧ;->ۗ:I

    if-gt v1, p1, :cond_0

    goto :goto_0

    .line 394
    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(J)V
    .locals 4

    .line 399
    iget-object v0, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    invoke-static {v0}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;)Ll/ܳܳۧ;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 400
    invoke-static {v0, p0}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;Ll/ܳܳۧ;)V

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-lez v3, :cond_1

    .line 402
    invoke-virtual {p0, v2, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 404
    :cond_1
    invoke-direct {p0}, Ll/ܳܳۧ;->֫()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 9

    .line 409
    iput-boolean p1, p0, Ll/ܳܳۧ;->ۤ:Z

    const/4 v1, 0x0

    .line 410
    iput-object v1, p0, Ll/ܳܳۧ;->᩶:Ljava/io/IOException;

    const/4 v2, 0x1

    .line 411
    invoke-virtual {p0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 413
    iput-boolean v2, p0, Ll/ܳܳۧ;->᩹:Z

    .line 414
    invoke-virtual {p0, v2}, Landroid/os/Handler;->removeMessages(I)V

    if-nez p1, :cond_2

    const/4 v0, 0x2

    .line 416
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 420
    monitor-enter v0

    .line 421
    :try_start_0
    iput-boolean v2, p0, Ll/ܳܳۧ;->᩹:Z

    .line 422
    iget-object v2, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    invoke-interface {v2}, Ll/᩻ܳۧ;->ۧ()V

    .line 423
    iget-object v2, p0, Ll/ܳܳۧ;->۬:Ljava/lang/Thread;

    if-eqz v2, :cond_1

    .line 425
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 427
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 558
    iget-object p1, p0, Ll/ܳܳۧ;->ۨ:Ll/ۡܳۧ;

    invoke-static {p1, v1}, Ll/ۡܳۧ;->֫(Ll/ۡܳۧ;Ll/ܳܳۧ;)V

    .line 431
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 432
    iget-object v2, p0, Ll/ܳܳۧ;->᩸:Ll/ᩳܳۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    iget-object v3, p0, Ll/ܳܳۧ;->۫:Ll/᩻ܳۧ;

    iget-wide v6, p0, Ll/ܳܳۧ;->ۛ:J

    sub-long v6, v4, v6

    const/4 v8, 0x1

    .line 433
    invoke-interface/range {v2 .. v8}, Ll/ᩳܳۧ;->֫(Ll/᩻ܳۧ;JJZ)V

    .line 438
    iput-object v1, p0, Ll/ܳܳۧ;->᩸:Ll/ᩳܳۧ;

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    .line 427
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
