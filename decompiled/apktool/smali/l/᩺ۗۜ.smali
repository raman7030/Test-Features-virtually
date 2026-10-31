.class public final Ll/᩺ۗۜ;
.super Ljava/lang/Object;
.source "M799"


# instance fields
.field public final ֫:Landroid/content/Context;

.field public final ۧ:Ljava/util/concurrent/Executor;

.field public ܳ:Z

.field public final ܽ:Ll/᩶۫᩷;

.field public ܿ:Ll/ۨۗۜ;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 45
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۗۜ;->֫:Landroid/content/Context;

    .line 55
    iput-object v0, p0, Ll/᩺ۗۜ;->ۧ:Ljava/util/concurrent/Executor;

    .line 56
    iput-object v1, p0, Ll/᩺ۗۜ;->ܽ:Ll/᩶۫᩷;

    return-void
.end method

.method private ֫(Ll/ۨۗۜ;)Ll/۬ۗۜ;
    .locals 7

    .line 321
    iget-object v0, p1, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-eqz v0, :cond_0

    return-object v0

    .line 325
    :cond_0
    iget-object v0, p0, Ll/᩺ۗۜ;->ܽ:Ll/᩶۫᩷;

    iget-object v1, p0, Ll/᩺ۗۜ;->֫:Landroid/content/Context;

    iget-object v2, p1, Ll/ۨۗۜ;->ۢ:Ll/۫֡ۜ;

    iget-wide v3, p1, Ll/ۨۗۜ;->ܽ:J

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    invoke-virtual {v2}, Ll/۫֡ۜ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Ll/᩺ܶۜ;->᩷:I

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    const-wide/16 v5, 0x2710

    cmp-long v0, v3, v5

    if-gtz v0, :cond_1

    .line 613
    :try_start_0
    new-instance v0, Ll/ۤۗۜ;

    .line 616
    invoke-static {v2, v3, v4}, Ll/᩺ܶۜ;->֫(Ll/۫֡ۜ;J)Ll/᩺ܶۜ;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ll/ۤۗۜ;-><init>(Landroid/content/Context;Ll/۫֡ۜ;Ll/᩺ܶۜ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 621
    :catch_0
    :cond_1
    invoke-static {v1, v2}, Ll/۫ۗۜ;->֫(Landroid/content/Context;Ll/۫֡ۜ;)Ll/۬ۗۜ;

    move-result-object v0

    :goto_0
    move-object v1, v0

    .line 327
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 328
    :try_start_1
    iget-boolean v2, p1, Ll/ۨۗۜ;->ܺ:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-eq v2, p1, :cond_2

    goto :goto_1

    .line 332
    :cond_2
    iput-object v1, p1, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    .line 333
    monitor-exit v0

    return-object v1

    .line 492
    :cond_3
    :goto_1
    invoke-interface {v1}, Ll/۬ۗۜ;->֫()V

    .line 330
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    .line 334
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 400
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 422
    :try_start_0
    iget-object v1, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-ne v1, p1, :cond_0

    iget v1, p1, Ll/ۨۗۜ;->ܿ:I

    invoke-static {p2}, Ll/ۛۗۜ;->֫(Ll/ۛۗۜ;)I

    move-result v2

    if-ne v1, v2, :cond_0

    iget v1, p1, Ll/ۨۗۜ;->ۜ:I

    invoke-static {p2}, Ll/ۛۗۜ;->ܽ(Ll/ۛۗۜ;)I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 402
    monitor-exit v0

    return-void

    .line 404
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    new-instance v0, Ll/᩸ۗۜ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩸ۗۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 404
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ۨۗۜ;Ll/۬ۗۜ;)V
    .locals 6

    .line 354
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 355
    :try_start_0
    iget-boolean v1, p1, Ll/ۨۗۜ;->᩷:Z

    if-eqz v1, :cond_0

    .line 356
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 358
    iput-boolean v1, p1, Ll/ۨۗۜ;->᩷:Z

    .line 359
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 362
    :try_start_1
    invoke-interface {p2}, Ll/۬ۗۜ;->ᩳ()Ll/ܰۗۜ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move-object v5, p2

    goto :goto_1

    :catchall_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    if-nez v5, :cond_1

    goto :goto_3

    .line 370
    :cond_1
    iget-object p2, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 371
    :try_start_2
    iget-object p2, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-ne p2, p1, :cond_3

    iget-boolean p2, p1, Ll/ۨۗۜ;->ܺ:Z

    if-eqz p2, :cond_2

    goto :goto_2

    .line 374
    :cond_2
    iget v4, p1, Ll/ۨۗۜ;->ۜ:I

    .line 375
    iget v3, p1, Ll/ۨۗۜ;->ܿ:I

    .line 376
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 378
    new-instance p2, Ll/ܶۗۜ;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ܶۗۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;IILl/ܰۗۜ;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 372
    :cond_3
    :goto_2
    :try_start_3
    monitor-exit v0

    :goto_3
    return-void

    :catchall_1
    move-exception p1

    .line 376
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    .line 359
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/۬ۗۜ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩺ۗۜ;->ۧ(Ll/۬ۗۜ;)V

    return-void
.end method

.method public static ֫(Ll/᩺ۗۜ;Ljava/util/List;)V
    .locals 1

    .line 472
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 473
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 283
    :cond_0
    invoke-direct {p0}, Ll/᩺ۗۜ;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;)V
    .locals 0

    .line 252
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->ۧ(Ll/ۨۗۜ;)V

    .line 253
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->ᩳ(Ll/ۨۗۜ;)V

    .line 254
    invoke-direct {p0}, Ll/᩺ۗۜ;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;IILl/ܰۗۜ;)V
    .locals 1

    .line 380
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 382
    :try_start_0
    iget-object p0, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-ne p0, p1, :cond_1

    iget p0, p1, Ll/ۨۗۜ;->ܿ:I

    if-ne p0, p2, :cond_1

    iget p0, p1, Ll/ۨۗۜ;->ۜ:I

    if-ne p0, p3, :cond_1

    iget-boolean p0, p1, Ll/ۨۗۜ;->ܺ:Z

    if-eqz p0, :cond_0

    goto :goto_0

    .line 388
    :cond_0
    iget-object p0, p1, Ll/ۨۗۜ;->֫:Ll/᩹ۗۜ;

    .line 389
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    invoke-interface {p0, p3, p4}, Ll/᩹ۗۜ;->֫(ILl/ܰۗۜ;)V

    return-void

    .line 386
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 389
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V
    .locals 8

    const/4 v1, 0x0

    .line 293
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->֫(Ll/ۨۗۜ;)Ll/۬ۗۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 295
    invoke-static {p2}, Ll/ۛۗۜ;->ᩳ(Ll/ۛۗۜ;)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long v3, v2, v4

    invoke-static {p2}, Ll/ۛۗۜ;->ܿ(Ll/ۛۗۜ;)I

    move-result v5

    invoke-static {p2}, Ll/ۛۗۜ;->ۧ(Ll/ۛۗۜ;)I

    move-result v6

    new-instance v7, Ll/۠ۗۜ;

    invoke-direct {v7, p0, p1, p2}, Ll/۠ۗۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V

    move-object v2, v0

    invoke-interface/range {v2 .. v7}, Ll/۬ۗۜ;->֫(JIILl/᩶ۗۜ;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 300
    invoke-direct {p0, p1, v0}, Ll/᩺ۗۜ;->֫(Ll/ۨۗۜ;Ll/۬ۗۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_0
    move-object v2, v1

    .line 305
    :goto_0
    invoke-direct {p0, p1, p2, v2}, Ll/᩺ۗۜ;->֫(Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V

    .line 306
    iget-object p2, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 307
    :try_start_1
    iput-object v1, p1, Ll/ۨۗۜ;->ܳ:Ll/ۛۗۜ;

    .line 308
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 309
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->ܿ(Ll/ۨۗۜ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 310
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->ۧ(Ll/ۨۗۜ;)V

    .line 311
    invoke-direct {p0, p1}, Ll/᩺ۗۜ;->ᩳ(Ll/ۨۗۜ;)V

    .line 313
    :cond_1
    invoke-direct {p0}, Ll/᩺ۗۜ;->ܽ()V

    return-void

    :catchall_1
    move-exception p0

    .line 308
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public static ֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 407
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 422
    :try_start_0
    iget-object p0, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-ne p0, p1, :cond_0

    iget p0, p1, Ll/ۨۗۜ;->ܿ:I

    invoke-static {p2}, Ll/ۛۗۜ;->֫(Ll/ۛۗۜ;)I

    move-result v1

    if-ne p0, v1, :cond_0

    iget p0, p1, Ll/ۨۗۜ;->ۜ:I

    invoke-static {p2}, Ll/ۛۗۜ;->ܽ(Ll/ۛۗۜ;)I

    move-result v1

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    .line 410
    monitor-exit v0

    return-void

    .line 412
    :cond_1
    iget-object p0, p1, Ll/ۨۗۜ;->֫:Ll/᩹ۗۜ;

    .line 413
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    invoke-static {p2}, Ll/ۛۗۜ;->ܽ(Ll/ۛۗۜ;)I

    move-result p1

    invoke-interface {p0, p1, p3}, Ll/᩹ۗۜ;->֫(ILandroid/graphics/Bitmap;)V

    return-void

    :catchall_0
    move-exception p0

    .line 413
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Ll/᩺ۗۜ;Ll/۬ۗۜ;Ll/ۨۗۜ;)V
    .locals 0

    .line 265
    :try_start_0
    invoke-interface {p1}, Ll/۬ۗۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 268
    :goto_0
    invoke-direct {p0, p2}, Ll/᩺ۗۜ;->ܿ(Ll/ۨۗۜ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 269
    invoke-direct {p0, p2}, Ll/᩺ۗۜ;->ۧ(Ll/ۨۗۜ;)V

    .line 270
    invoke-direct {p0, p2}, Ll/᩺ۗۜ;->ᩳ(Ll/ۨۗۜ;)V

    .line 272
    :cond_0
    invoke-direct {p0}, Ll/᩺ۗۜ;->ܽ()V

    return-void
.end method

.method private ۧ(Ll/ۨۗۜ;)V
    .locals 3

    .line 441
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 442
    :try_start_0
    iget-object v1, p1, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    const/4 v2, 0x0

    .line 443
    iput-object v2, p1, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    const/4 v2, 0x0

    .line 444
    iput-boolean v2, p1, Ll/ۨۗۜ;->ܺ:Z

    .line 445
    iput-boolean v2, p1, Ll/ۨۗۜ;->᩷:Z

    .line 446
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    invoke-static {v1}, Ll/᩺ۗۜ;->ۧ(Ll/۬ۗۜ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 446
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ۧ(Ll/۬ۗۜ;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 492
    invoke-interface {p0}, Ll/۬ۗۜ;->֫()V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V
    .locals 2

    .line 340
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 341
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p0, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-ne p0, p1, :cond_0

    iget-boolean p0, p1, Ll/ۨۗۜ;->ܺ:Z

    if-nez p0, :cond_0

    iget p0, p1, Ll/ۨۗۜ;->ܿ:I

    invoke-static {p2}, Ll/ۛۗۜ;->֫(Ll/ۛۗۜ;)I

    move-result p1

    if-ne p0, p1, :cond_0

    .line 347
    monitor-exit v0

    return-void

    .line 345
    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string p1, "Video preview request was canceled"

    invoke-direct {p0, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 347
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ܽ()V
    .locals 2

    .line 481
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 482
    :try_start_0
    iput-boolean v1, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 483
    invoke-direct {p0}, Ll/᩺ۗۜ;->ᩳ()V

    .line 484
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ܽ(Ll/ۨۗۜ;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 201
    :cond_0
    iget v0, p0, Ll/ۨۗۜ;->ܿ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۨۗۜ;->ܿ:I

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Ll/ۨۗۜ;->᩻:Ll/ۛۗۜ;

    const/4 v0, 0x0

    .line 203
    iput-boolean v0, p0, Ll/ۨۗۜ;->ۧ:Z

    .line 204
    iput-boolean v1, p0, Ll/ۨۗۜ;->ܺ:Z

    .line 205
    iput-boolean v0, p0, Ll/ۨۗۜ;->᩷:Z

    return-void
.end method

.method private ܿ(Ll/ۨۗۜ;)Z
    .locals 1

    .line 431
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 432
    :try_start_0
    iget-boolean p1, p1, Ll/ۨۗۜ;->ܺ:Z

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 433
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ᩳ()V
    .locals 6

    .line 212
    iget-object v0, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 216
    :cond_0
    iget-boolean v1, v0, Ll/ۨۗۜ;->ܺ:Z

    iget-object v2, p0, Ll/᩺ۗۜ;->ۧ:Ljava/util/concurrent/Executor;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    iget-object v4, v0, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-eqz v4, :cond_1

    .line 250
    iput-boolean v3, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 251
    new-instance v1, Ll/֡ۗۜ;

    invoke-direct {v1, p0, v0}, Ll/֡ۗۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;)V

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const/4 v4, 0x0

    if-eqz v1, :cond_3

    .line 220
    iget-object v1, v0, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-nez v1, :cond_3

    .line 221
    iput-boolean v4, v0, Ll/ۨۗۜ;->ܺ:Z

    .line 463
    iget-object v1, v0, Ll/ۨۗۜ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 0
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 466
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 467
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    move-object v1, v5

    .line 223
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    .line 280
    iput-boolean v3, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 281
    new-instance v0, Ll/֨ۗۜ;

    invoke-direct {v0, p0, v1}, Ll/֨ۗۜ;-><init>(Ll/᩺ۗۜ;Ljava/util/List;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 228
    :cond_3
    iget-boolean v1, v0, Ll/ۨۗۜ;->ۧ:Z

    if-eqz v1, :cond_4

    .line 229
    iget-object v1, v0, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    .line 230
    iput-boolean v4, v0, Ll/ۨۗۜ;->ۧ:Z

    if-eqz v1, :cond_4

    .line 231
    invoke-interface {v1}, Ll/۬ۗۜ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 262
    iput-boolean v3, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 263
    new-instance v3, Ll/ۚۗۜ;

    invoke-direct {v3, p0, v1, v0}, Ll/ۚۗۜ;-><init>(Ll/᩺ۗۜ;Ll/۬ۗۜ;Ll/ۨۗۜ;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 236
    :cond_4
    iget-object v1, v0, Ll/ۨۗۜ;->᩻:Ll/ۛۗۜ;

    if-nez v1, :cond_5

    :goto_1
    return-void

    :cond_5
    const/4 v4, 0x0

    .line 240
    iput-object v4, v0, Ll/ۨۗۜ;->᩻:Ll/ۛۗۜ;

    .line 241
    iput-object v1, v0, Ll/ۨۗۜ;->ܳ:Ll/ۛۗۜ;

    .line 242
    iput-boolean v3, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 243
    new-instance v3, Ll/۟۠ۜ;

    invoke-direct {v3, p0, v0, v1}, Ll/۟۠ۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ᩳ(Ll/ۨۗۜ;)V
    .locals 2

    .line 455
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 463
    :try_start_0
    iget-object p1, p1, Ll/ۨۗۜ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 466
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 467
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    move-object p1, v1

    .line 457
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 472
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 473
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 457
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 136
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 137
    :try_start_0
    iget-object v1, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-eqz v1, :cond_0

    .line 139
    iget v2, v1, Ll/ۨۗۜ;->ܿ:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v1, Ll/ۨۗۜ;->ܿ:I

    const/4 v2, 0x0

    .line 140
    iput-object v2, v1, Ll/ۨۗۜ;->᩻:Ll/ۛۗۜ;

    .line 141
    iput-boolean v3, v1, Ll/ۨۗۜ;->ۧ:Z

    .line 142
    iget-boolean v1, p0, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v1, :cond_0

    .line 143
    invoke-direct {p0}, Ll/᩺ۗۜ;->ᩳ()V

    .line 146
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(IIJ)V
    .locals 15

    move-object v1, p0

    .line 108
    iget-object v0, v1, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    move-object v14, v0

    monitor-enter v14

    .line 109
    :try_start_0
    iget-object v0, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-nez v0, :cond_0

    .line 111
    monitor-exit v14

    return-void

    :cond_0
    const/4 v2, 0x1

    move/from16 v3, p1

    .line 113
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    move/from16 v3, p2

    .line 114
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 115
    new-instance v2, Ll/ۛۗۜ;

    iget v4, v0, Ll/ۨۗۜ;->ۜ:I

    iget v5, v0, Ll/ۨۗۜ;->ܿ:I

    iget-wide v8, v0, Ll/ۨۗۜ;->ܽ:J

    const-wide/16 v10, 0x3e8

    const-wide/16 v12, 0x1

    .line 189
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v3, v8, v12

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    const-wide v8, 0x7fffffffffffffffL

    :goto_0
    move-wide/from16 v12, p3

    .line 206
    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    .line 192
    div-long/2addr v8, v10

    mul-long v8, v8, v10

    move-object v3, v2

    .line 118
    invoke-direct/range {v3 .. v9}, Ll/ۛۗۜ;-><init>(IIIIJ)V

    .line 122
    iget-object v3, v0, Ll/ۨۗۜ;->ܳ:Ll/ۛۗۜ;

    invoke-virtual {v2, v3}, Ll/ۛۗۜ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 123
    monitor-exit v14

    return-void

    .line 125
    :cond_2
    iput-object v2, v0, Ll/ۨۗۜ;->᩻:Ll/ۛۗۜ;

    .line 126
    iget-boolean v0, v1, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v0, :cond_3

    .line 127
    invoke-direct {p0}, Ll/᩺ۗۜ;->ᩳ()V

    .line 129
    :cond_3
    monitor-exit v14

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 4

    .line 180
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 181
    :try_start_0
    iget-object v1, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v2, v2, v3

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 280
    iput-boolean v1, p0, Ll/᩺ۗۜ;->ܳ:Z

    .line 281
    iget-object v1, p0, Ll/᩺ۗۜ;->ۧ:Ljava/util/concurrent/Executor;

    new-instance v2, Ll/֨ۗۜ;

    invoke-direct {v2, p0, p1}, Ll/֨ۗۜ;-><init>(Ll/᩺ۗۜ;Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 184
    monitor-exit v0

    return-void

    .line 186
    :cond_0
    invoke-static {v1}, Ll/᩺ۗۜ;->ܽ(Ll/ۨۗۜ;)V

    .line 187
    iget-object v1, v1, Ll/ۨۗۜ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    iget-boolean p1, p0, Ll/᩺ۗۜ;->ܳ:Z

    if-nez p1, :cond_1

    .line 189
    invoke-direct {p0}, Ll/᩺ۗۜ;->ᩳ()V

    .line 191
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

.method public final ֫(Ll/ᩳۜܳ;Ll/۫֡ۜ;JILl/᩹ۗۜ;)V
    .locals 13

    move-object v1, p0

    move-object v0, p1

    .line 74
    invoke-virtual {p2}, Ll/۫֡ۜ;->ۧ()Ljava/lang/String;

    move-result-object v5

    .line 75
    iget-object v2, v1, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    move-object v12, v2

    monitor-enter v12

    .line 76
    :try_start_0
    iget-object v2, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-eqz v2, :cond_5

    iget v3, v2, Ll/ۨۗۜ;->ۜ:I

    move/from16 v8, p5

    if-ne v3, v8, :cond_4

    iget-object v2, v2, Ll/ۨۗۜ;->ᩳ:Ll/ᩳۜܳ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    .line 101
    :cond_0
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 78
    :goto_1
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    iget-object v2, v2, Ll/ۨۗۜ;->ۘ:Ljava/lang/String;

    .line 79
    invoke-static {v2, v5}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 88
    :cond_2
    iget-object v2, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    iput-object v0, v2, Ll/ۨۗۜ;->ᩳ:Ll/ᩳۜܳ;

    move-object v4, p2

    .line 89
    iput-object v4, v2, Ll/ۨۗۜ;->ۢ:Ll/۫֡ۜ;

    .line 90
    iput-object v5, v2, Ll/ۨۗۜ;->ۘ:Ljava/lang/String;

    move-wide/from16 v6, p3

    .line 91
    iput-wide v6, v2, Ll/ۨۗۜ;->ܽ:J

    move-object/from16 v9, p6

    .line 92
    iput-object v9, v2, Ll/ۨۗۜ;->֫:Ll/᩹ۗۜ;

    .line 93
    iget-object v0, v2, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-nez v0, :cond_3

    iget-boolean v0, v1, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 94
    iput-boolean v0, v2, Ll/ۨۗۜ;->ܺ:Z

    .line 96
    :cond_3
    monitor-exit v12

    return-void

    :cond_4
    :goto_2
    move-object v4, p2

    move-wide/from16 v6, p3

    goto :goto_3

    :cond_5
    move-object v4, p2

    move-wide/from16 v6, p3

    move/from16 v8, p5

    :goto_3
    move-object/from16 v9, p6

    .line 80
    iget-object v10, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    .line 81
    invoke-static {v10}, Ll/᩺ۗۜ;->ܽ(Ll/ۨۗۜ;)V

    .line 82
    new-instance v11, Ll/ۨۗۜ;

    move-object v2, v11

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v6, p3

    move/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Ll/ۨۗۜ;-><init>(Ll/ᩳۜܳ;Ll/۫֡ۜ;Ljava/lang/String;JILl/᩹ۗۜ;)V

    iput-object v11, v1, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    .line 83
    iget-boolean v0, v1, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v0, :cond_6

    if-eqz v10, :cond_6

    iget-object v0, v10, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    .line 250
    iput-boolean v0, v1, Ll/᩺ۗۜ;->ܳ:Z

    .line 251
    iget-object v0, v1, Ll/᩺ۗۜ;->ۧ:Ljava/util/concurrent/Executor;

    new-instance v2, Ll/֡ۗۜ;

    invoke-direct {v2, p0, v10}, Ll/֡ۗۜ;-><init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 86
    :cond_6
    monitor-exit v12

    return-void

    :catchall_0
    move-exception v0

    .line 96
    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ۧ()V
    .locals 3

    .line 153
    iget-object v0, p0, Ll/᩺ۗۜ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 154
    :try_start_0
    iget-object v1, p0, Ll/᩺ۗۜ;->ܿ:Ll/ۨۗۜ;

    if-eqz v1, :cond_3

    .line 155
    iget-boolean v2, v1, Ll/ۨۗۜ;->ܺ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object v2, v1, Ll/ۨۗۜ;->ۖ:Ll/۬ۗۜ;

    if-nez v2, :cond_1

    iget-boolean v2, p0, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v2, :cond_1

    .line 159
    monitor-exit v0

    return-void

    .line 161
    :cond_1
    invoke-static {v1}, Ll/᩺ۗۜ;->ܽ(Ll/ۨۗۜ;)V

    .line 162
    iget-boolean v1, p0, Ll/᩺ۗۜ;->ܳ:Z

    if-nez v1, :cond_2

    .line 163
    invoke-direct {p0}, Ll/᩺ۗۜ;->ᩳ()V

    .line 165
    :cond_2
    monitor-exit v0

    return-void

    .line 156
    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 165
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
