.class public final Ll/۠᩺᩻;
.super Ljava/lang/Object;
.source "K78T"


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public ֫:Z

.field public ۖ:Ll/ܳ᩻ۜ;

.field public ۘ:I

.field public ۚ:Z

.field public final ۜ:Ljava/lang/Object;

.field public ۡ:I

.field public ۢ:J

.field public ۧ:Z

.field public final ܳ:Ll/ۡ᩻ۜ;

.field public ܺ:I

.field public ܽ:J

.field public ܿ:Ll/ܳ᩻ۜ;

.field public ᩳ:[Ljava/lang/Thread;

.field public ᩴ:I

.field public ᩵:Z

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۨۨ᩻;Ll/ۡ۠ۘ;Ll/ۡ᩻ۜ;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 48
    iput p1, p0, Ll/۠᩺᩻;->᩻:I

    .line 57
    iput-object p3, p0, Ll/۠᩺᩻;->ܳ:Ll/ۡ᩻ۜ;

    return-void
.end method

.method public static ֫(Ll/۠᩺᩻;)V
    .locals 6

    .line 328
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 329
    :try_start_0
    iget v1, p0, Ll/۠᩺᩻;->ۡ:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    sub-int/2addr v1, v2

    .line 330
    iput v1, p0, Ll/۠᩺᩻;->ۡ:I

    .line 332
    :cond_0
    iget v1, p0, Ll/۠᩺᩻;->ۡ:I

    const/4 v3, 0x0

    if-nez v1, :cond_5

    .line 333
    iget-object v1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    if-eqz v1, :cond_4

    .line 320
    iget-object v4, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-eqz v4, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_3

    if-ne v1, v4, :cond_2

    .line 336
    iput-object v3, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    goto :goto_1

    .line 338
    :cond_2
    iput-boolean v2, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 339
    iput-boolean v2, p0, Ll/۠᩺᩻;->֫:Z

    goto :goto_1

    .line 343
    :cond_3
    iput-object v3, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    .line 344
    invoke-direct {p0, v1}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;)[Ljava/lang/Thread;

    move-result-object v1

    move-object v3, v1

    .line 347
    :cond_4
    :goto_1
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 349
    :cond_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    invoke-direct {p0, v3}, Ll/۠᩺᩻;->ۧ([Ljava/lang/Thread;)V

    return-void

    :catchall_0
    move-exception p0

    .line 349
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/۠᩺᩻;Ll/ܳ᩻ۜ;JI)V
    .locals 2

    .line 508
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܽ(Ll/ܳ᩻ۜ;J)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    .line 518
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;J)V

    return-void

    :cond_0
    if-nez p4, :cond_4

    const/4 p4, 0x0

    .line 411
    :try_start_1
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ܿ()V

    .line 412
    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 415
    :cond_1
    iget-object v1, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ll/ᩴ᩺᩻;->֫(Ljava/util/ArrayList;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 416
    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ܽ()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p4, 0x1

    .line 422
    :cond_3
    :goto_0
    :try_start_2
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;JZ)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-direct {p0, p1, p2, p3, p4}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;JZ)V

    .line 423
    throw v0

    .line 513
    :cond_4
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ۧ(Ll/ܳ᩻ۜ;J)Z

    move-result p4

    :goto_1
    if-eqz p4, :cond_5

    .line 515
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ۢ(Ll/ܳ᩻ۜ;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 518
    :cond_5
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;J)V

    return-void

    :catchall_1
    move-exception p4

    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;J)V

    .line 519
    throw p4
.end method

.method private ֫(Ll/ܳ᩻ۜ;J)V
    .locals 3

    .line 651
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 652
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_0

    iget-wide v1, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long p1, v1, p2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 653
    iput-boolean p1, p0, Ll/۠᩺᩻;->֫:Z

    .line 654
    iput-boolean p1, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 655
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 657
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

.method private ֫(Ll/ܳ᩻ۜ;JZ)V
    .locals 4

    .line 430
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 431
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_2

    iget-wide v1, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long v3, v1, p2

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 434
    iput-boolean p2, p0, Ll/۠᩺᩻;->ۚ:Z

    if-nez p4, :cond_1

    .line 436
    iput-boolean p2, p0, Ll/۠᩺᩻;->֫:Z

    .line 437
    iget-object p1, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/۠᩺᩻;->᩷:I

    .line 439
    :cond_1
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 440
    monitor-exit v0

    return-void

    .line 432
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 440
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫([Ljava/lang/Thread;)V
    .locals 2

    .line 284
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 285
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ᩳ:[Ljava/lang/Thread;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    .line 286
    iput-boolean p1, p0, Ll/۠᩺᩻;->֨:Z

    .line 287
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 289
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

.method private ֫(Ll/ܳ᩻ۜ;JLl/ܿ᩺᩻;)Z
    .locals 2

    .line 626
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܳ(Ll/ܳ᩻ۜ;J)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 629
    :cond_0
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    iget-object p4, p4, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p4}, Ll/ᩴ᩺᩻;->ۧ(Ljava/lang/String;)Ll/ۜ᩺᩻;

    move-result-object p4

    .line 630
    sget-object v0, Ll/ۜ᩺᩻;->ۗ:Ll/ۜ᩺᩻;

    if-ne p4, v0, :cond_1

    .line 631
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    return v1

    .line 634
    :cond_1
    sget-object p1, Ll/ۜ᩺᩻;->ۙ:Ll/ۜ᩺᩻;

    if-eq p4, p1, :cond_3

    sget-object p1, Ll/ۜ᩺᩻;->᩹:Ll/ۜ᩺᩻;

    if-ne p4, p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    return v1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method private ۜ(Ll/ܳ᩻ۜ;J)V
    .locals 5

    .line 664
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 665
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_3

    iget-wide v1, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long v3, v1, p2

    if-eqz v3, :cond_0

    goto :goto_1

    .line 668
    :cond_0
    iget p2, p0, Ll/۠᩺᩻;->ۘ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/۠᩺᩻;->ۘ:I

    .line 669
    iget-object p1, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 670
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget p3, p0, Ll/۠᩺᩻;->᩻:I

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    int-to-long v1, p2

    const-wide/16 v3, 0x64

    mul-long v1, v1, v3

    int-to-long p1, p1

    .line 726
    div-long/2addr v1, p1

    long-to-int p1, v1

    if-ne p1, p3, :cond_2

    goto :goto_0

    :cond_2
    move p3, p1

    .line 669
    :goto_0
    iput p3, p0, Ll/۠᩺᩻;->᩻:I

    .line 671
    monitor-exit v0

    return-void

    .line 666
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 671
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ۢ(Ll/ܳ᩻ۜ;J)V
    .locals 5

    .line 358
    :cond_0
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 359
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 360
    monitor-exit v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 362
    :goto_0
    iget v3, p0, Ll/۠᩺᩻;->ۡ:I

    const/4 v4, 0x1

    if-lez v3, :cond_4

    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result v3

    if-eqz v3, :cond_4

    if-nez v1, :cond_3

    .line 365
    iget v1, p0, Ll/۠᩺᩻;->ܺ:I

    add-int/2addr v1, v4

    iput v1, p0, Ll/۠᩺᩻;->ܺ:I

    .line 366
    iget v3, p0, Ll/۠᩺᩻;->ᩴ:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/۠᩺᩻;->֡:Z

    if-nez v1, :cond_2

    .line 711
    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    .line 368
    iput-boolean v4, p0, Ll/۠᩺᩻;->֡:Z

    .line 370
    :cond_2
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    .line 373
    :cond_3
    :try_start_1
    iget-object v3, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 375
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 376
    iput-boolean v4, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 377
    iput-boolean v4, p0, Ll/۠᩺᩻;->֫:Z

    :cond_4
    if-eqz v1, :cond_7

    .line 382
    iget v1, p0, Ll/۠᩺᩻;->ܺ:I

    sub-int/2addr v1, v4

    iput v1, p0, Ll/۠᩺᩻;->ܺ:I

    if-gez v1, :cond_5

    .line 384
    iput v2, p0, Ll/۠᩺᩻;->ܺ:I

    .line 386
    :cond_5
    iget-boolean v1, p0, Ll/۠᩺᩻;->֡:Z

    if-eqz v1, :cond_6

    iget v1, p0, Ll/۠᩺᩻;->ܺ:I

    if-nez v1, :cond_6

    iget v1, p0, Ll/۠᩺᩻;->ۡ:I

    if-nez v1, :cond_6

    .line 387
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 711
    iget-object v1, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    .line 389
    iput-boolean v2, p0, Ll/۠᩺᩻;->֡:Z

    .line 391
    :cond_6
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 393
    :cond_7
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result v2

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    if-eqz v2, :cond_8

    .line 527
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩷(Ll/ܳ᩻ۜ;J)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 394
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private ۧ([Ljava/lang/Thread;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 269
    :try_start_0
    array-length v0, p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    :try_start_1
    aget-object v4, p1, v2

    .line 270
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 273
    :cond_1
    invoke-direct {p0, p1}, Ll/۠᩺᩻;->֫([Ljava/lang/Thread;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    :goto_1
    const/4 v3, 0x0

    :goto_2
    move-object v2, v0

    .line 297
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 298
    :try_start_2
    iget-object v4, p0, Ll/۠᩺᩻;->ᩳ:[Ljava/lang/Thread;

    if-ne v4, p1, :cond_3

    const/4 p1, 0x1

    .line 301
    iput-boolean p1, p0, Ll/۠᩺᩻;->֫:Z

    .line 302
    iput-boolean p1, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 303
    iput v3, p0, Ll/۠᩺᩻;->ᩴ:I

    .line 304
    iput-boolean p1, p0, Ll/۠᩺᩻;->֨:Z

    const/4 p1, 0x0

    if-nez v3, :cond_2

    .line 306
    iget-object v3, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    .line 765
    iput-object p1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    .line 766
    iput-object p1, p0, Ll/۠᩺᩻;->ᩳ:[Ljava/lang/Thread;

    .line 767
    iput-boolean v1, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 768
    iput-boolean v1, p0, Ll/۠᩺᩻;->֫:Z

    .line 769
    iput-boolean v1, p0, Ll/۠᩺᩻;->ۚ:Z

    .line 770
    iput-boolean v1, p0, Ll/۠᩺᩻;->֡:Z

    .line 771
    iput-boolean v1, p0, Ll/۠᩺᩻;->֨:Z

    .line 772
    iput v1, p0, Ll/۠᩺᩻;->ᩴ:I

    .line 773
    iput v1, p0, Ll/۠᩺᩻;->ܺ:I

    .line 774
    iput v1, p0, Ll/۠᩺᩻;->᩷:I

    .line 775
    iput v1, p0, Ll/۠᩺᩻;->ۘ:I

    const/4 p1, -0x1

    .line 776
    iput p1, p0, Ll/۠᩺᩻;->᩻:I

    move-object p1, v3

    .line 309
    :cond_2
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 310
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_4

    .line 312
    iget-object v0, p0, Ll/۠᩺᩻;->ܳ:Ll/ۡ᩻ۜ;

    iget-object v0, v0, Ll/ۡ᩻ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩵᩻ۜ;

    invoke-static {v0, p1}, Ll/᩵᩻ۜ;->֫(Ll/᩵᩻ۜ;Ll/ܳ᩻ۜ;)V

    goto :goto_3

    .line 299
    :cond_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 276
    :cond_4
    :goto_3
    throw v2

    :catchall_0
    move-exception p1

    .line 310
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private ۧ(Ll/ܳ᩻ۜ;J)Z
    .locals 5

    .line 447
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 448
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    const/4 v2, 0x1

    if-ne v1, p1, :cond_0

    iget-wide v3, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long v1, v3, p2

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->ۚ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 451
    :try_start_1
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 453
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 454
    iput-boolean v2, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 455
    iput-boolean v2, p0, Ll/۠᩺᩻;->֫:Z

    .line 459
    :cond_0
    iget-boolean v1, p0, Ll/۠᩺᩻;->ۚ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_1

    iget-wide v3, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long p1, v3, p2

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 461
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private ܳ(Ll/ܳ᩻ۜ;J)Z
    .locals 1

    .line 642
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 643
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 644
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܽ(Ll/ܳ᩻ۜ;J)Z
    .locals 5

    .line 468
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 469
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    const/4 v2, 0x1

    if-ne v1, p1, :cond_0

    iget-wide v3, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long v1, v3, p2

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->֨:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 472
    :try_start_1
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 474
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 475
    iput-boolean v2, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 476
    iput-boolean v2, p0, Ll/۠᩺᩻;->֫:Z

    .line 480
    :cond_0
    iget-boolean v1, p0, Ll/۠᩺᩻;->֨:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_1

    iget-wide v3, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long p1, v3, p2

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 482
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private ܿ(Ll/ܳ᩻ۜ;J)V
    .locals 4

    .line 679
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 680
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v1, p1, :cond_4

    iget-wide v1, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long v3, v1, p2

    if-nez v3, :cond_4

    iget v1, p0, Ll/۠᩺᩻;->ᩴ:I

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    sub-int/2addr v1, v2

    .line 684
    iput v1, p0, Ll/۠᩺᩻;->ᩴ:I

    .line 685
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 686
    monitor-exit v0

    return-void

    .line 688
    :cond_1
    iget-boolean v1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/۠᩺᩻;->֫:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez v1, :cond_2

    iget v1, p0, Ll/۠᩺᩻;->᩷:I

    iget-object v3, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 689
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v1, v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 690
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 691
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    .line 692
    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 693
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    iget-object v1, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ll/ᩴ᩺᩻;->ۧ(Ljava/util/ArrayList;)V

    .line 711
    :cond_3
    iget-object v0, p1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    .line 696
    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->֫()V

    .line 697
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ᩳ(Ll/ܳ᩻ۜ;J)V

    return-void

    .line 681
    :cond_4
    :goto_1
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 690
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ܿ(Ll/ܳ᩻ۜ;)[Ljava/lang/Thread;
    .locals 13

    .line 230
    iget-boolean v0, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez v0, :cond_2

    iget-boolean v0, p1, Ll/ܳ᩻ۜ;->۠:Z

    if-nez v0, :cond_2

    iget-object v0, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v0}, Ll/ᩴ᩺᩻;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 233
    :cond_0
    iget-wide v0, p0, Ll/۠᩺᩻;->ۢ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/۠᩺᩻;->ۢ:J

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Thread;

    .line 235
    iput-object p1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    .line 236
    iput-object v3, p0, Ll/۠᩺᩻;->ᩳ:[Ljava/lang/Thread;

    .line 237
    iput-wide v0, p0, Ll/۠᩺᩻;->ܽ:J

    const/4 v4, 0x0

    .line 238
    iput-boolean v4, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 239
    iput-boolean v4, p0, Ll/۠᩺᩻;->֫:Z

    .line 240
    iput-boolean v4, p0, Ll/۠᩺᩻;->ۚ:Z

    .line 241
    iput-boolean v4, p0, Ll/۠᩺᩻;->֡:Z

    .line 242
    iput-boolean v4, p0, Ll/۠᩺᩻;->֨:Z

    .line 243
    iput v4, p0, Ll/۠᩺᩻;->ܺ:I

    .line 244
    iput v2, p0, Ll/۠᩺᩻;->ᩴ:I

    .line 245
    iput v4, p0, Ll/۠᩺᩻;->᩷:I

    .line 246
    iput v4, p0, Ll/۠᩺᩻;->ۘ:I

    const/4 v4, -0x1

    .line 247
    iput v4, p0, Ll/۠᩺᩻;->᩻:I

    .line 248
    iget-object v4, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 249
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    const/4 v4, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v2, :cond_1

    .line 252
    new-instance v11, Ljava/lang/Thread;

    new-instance v12, Ll/֨᩺᩻;

    move-object v4, v12

    move-object v5, p0

    move-object v6, p1

    move-wide v7, v0

    move v9, v10

    invoke-direct/range {v4 .. v9}, Ll/֨᩺᩻;-><init>(Ll/۠᩺᩻;Ll/ܳ᩻ۜ;JI)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MT MCP Smali Cache #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v5, v10, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v11, v12, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 254
    invoke-virtual {v11, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 255
    aput-object v11, v3, v10

    move v10, v5

    goto :goto_0

    :cond_1
    return-object v3

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ᩳ(Ll/ܳ᩻ۜ;)V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v0, p1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 145
    iput-boolean v0, p0, Ll/۠᩺᩻;->֫:Z

    .line 147
    :cond_0
    iget-object v0, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    .line 148
    iput-object p1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    .line 150
    :cond_1
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method

.method private ᩳ(Ll/ܳ᩻ۜ;J)V
    .locals 6

    .line 743
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 744
    :try_start_0
    iget-wide v1, p0, Ll/۠᩺᩻;->ܽ:J

    const/4 v3, 0x0

    const/4 v4, 0x0

    cmp-long v5, v1, p2

    if-nez v5, :cond_1

    iget-object p2, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne p2, p1, :cond_1

    .line 765
    iput-object v3, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    .line 766
    iput-object v3, p0, Ll/۠᩺᩻;->ᩳ:[Ljava/lang/Thread;

    .line 767
    iput-boolean v4, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 768
    iput-boolean v4, p0, Ll/۠᩺᩻;->֫:Z

    .line 769
    iput-boolean v4, p0, Ll/۠᩺᩻;->ۚ:Z

    .line 770
    iput-boolean v4, p0, Ll/۠᩺᩻;->֡:Z

    .line 771
    iput-boolean v4, p0, Ll/۠᩺᩻;->֨:Z

    .line 772
    iput v4, p0, Ll/۠᩺᩻;->ᩴ:I

    .line 773
    iput v4, p0, Ll/۠᩺᩻;->ܺ:I

    .line 774
    iput v4, p0, Ll/۠᩺᩻;->᩷:I

    .line 775
    iput v4, p0, Ll/۠᩺᩻;->ۘ:I

    const/4 p2, -0x1

    .line 776
    iput p2, p0, Ll/۠᩺᩻;->᩻:I

    .line 747
    iget-boolean p2, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez p2, :cond_0

    iget p2, p0, Ll/۠᩺᩻;->ۡ:I

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    if-eqz p2, :cond_0

    .line 749
    iput-object v3, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    .line 750
    invoke-direct {p0, p2}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;)[Ljava/lang/Thread;

    move-result-object p2

    move-object v3, p2

    .line 752
    :cond_0
    iget-object p2, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    const/4 v4, 0x1

    .line 754
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 755
    invoke-direct {p0, v3}, Ll/۠᩺᩻;->ۧ([Ljava/lang/Thread;)V

    if-eqz v4, :cond_2

    .line 757
    iget-object p2, p0, Ll/۠᩺᩻;->ܳ:Ll/ۡ᩻ۜ;

    iget-object p2, p2, Ll/ۡ᩻ۜ;->᩸:Ljava/lang/Object;

    check-cast p2, Ll/᩵᩻ۜ;

    invoke-static {p2, p1}, Ll/᩵᩻ۜ;->֫(Ll/᩵᩻ۜ;Ll/ܳ᩻ۜ;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 754
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ᩷(Ll/ܳ᩻ۜ;J)Z
    .locals 9

    .line 537
    new-instance v1, Ll/۬ۜᩳ;

    invoke-direct {v1}, Ll/۬ۜᩳ;-><init>()V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    .line 489
    :goto_0
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 490
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->᩻(Ll/ܳ᩻ۜ;J)Z

    move-result v4

    const/4 v5, -0x2

    const/4 v6, -0x1

    if-nez v4, :cond_0

    .line 491
    monitor-exit v0

    goto :goto_1

    .line 493
    :cond_0
    iget v4, p0, Ll/۠᩺᩻;->ۡ:I

    if-lez v4, :cond_1

    .line 494
    monitor-exit v0

    const/4 v0, -0x2

    goto :goto_2

    .line 496
    :cond_1
    iget v4, p0, Ll/۠᩺᩻;->᩷:I

    iget-object v7, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lt v4, v7, :cond_2

    .line 497
    monitor-exit v0

    :goto_1
    const/4 v0, -0x1

    goto :goto_2

    .line 499
    :cond_2
    iget v4, p0, Ll/۠᩺᩻;->᩷:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/۠᩺᩻;->᩷:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move v0, v4

    :goto_2
    if-ne v0, v5, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 v4, 0x0

    if-ne v0, v6, :cond_4

    goto/16 :goto_7

    .line 548
    :cond_4
    iget-object v5, p1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺᩻;

    .line 549
    iget-object v5, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    iget-object v6, v0, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ll/ᩴ᩺᩻;->ۧ(Ljava/lang/String;)Ll/ۜ᩺᩻;

    move-result-object v5

    .line 550
    sget-object v6, Ll/ۜ᩺᩻;->ۗ:Ll/ۜ᩺᩻;

    if-ne v5, v6, :cond_5

    .line 551
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    return v4

    .line 554
    :cond_5
    sget-object v6, Ll/ۜ᩺᩻;->ۙ:Ll/ۜ᩺᩻;

    if-eq v5, v6, :cond_e

    sget-object v6, Ll/ۜ᩺᩻;->᩹:Ll/ۜ᩺᩻;

    if-ne v5, v6, :cond_6

    goto/16 :goto_8

    .line 559
    :cond_6
    iget-object v5, v0, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 564
    :try_start_1
    iget-object v2, v0, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    .line 60
    invoke-virtual {p1, v2}, Ll/ܳ᩻ۜ;->ۧ(Ljava/lang/String;)Ll/۬ۛ֡;

    move-result-object v2

    .line 565
    iget-object v3, v0, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    goto :goto_3

    .line 567
    :catch_0
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    return v4

    .line 584
    :cond_7
    :goto_3
    :try_start_2
    invoke-static {p1, v0, v3}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/۬ۛ֡;)Ll/۠ۛ֡;

    move-result-object v5
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_2

    .line 590
    :try_start_3
    invoke-virtual {v1}, Ll/۬ۜᩳ;->ܿ()Ll/ܰۖܽ;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 57
    :try_start_4
    new-instance v7, Ll/᩹ܶ֡;

    invoke-direct {v7}, Ll/᩹ܶ֡;-><init>()V

    .line 58
    invoke-static {v6, v5, v7}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 592
    :try_start_5
    invoke-virtual {v6}, Ll/ܰۖܽ;->close()V

    .line 593
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܳ(Ll/ܳ᩻ۜ;J)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v5, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v5}, Ll/ᩴ᩺᩻;->ܽ()Z

    move-result v6

    if-nez v6, :cond_a

    .line 594
    invoke-virtual {v5}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_4

    .line 598
    :cond_8
    iget-object v6, v0, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v6, v1}, Ll/ᩴ᩺᩻;->ۧ(Ljava/lang/String;Ll/۬ۜᩳ;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 599
    invoke-direct {p0, p1, p2, p3, v0}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;JLl/ܿ᩺᩻;)Z

    move-result v5

    if-nez v5, :cond_9

    .line 600
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    goto :goto_7

    .line 603
    :cond_9
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ۜ(Ll/ܳ᩻ۜ;J)V

    goto/16 :goto_0

    .line 595
    :cond_a
    :goto_4
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_7

    :catchall_0
    move-exception v5

    .line 590
    :try_start_6
    invoke-virtual {v6}, Ll/ܰۖܽ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v6

    :try_start_7
    invoke-virtual {v5, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 606
    :catch_1
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ܳ(Ll/ܳ᩻ۜ;J)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v5}, Ll/ᩴ᩺᩻;->ܽ()Z

    move-result v6

    if-nez v6, :cond_d

    .line 607
    invoke-virtual {v5}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_6

    .line 611
    :cond_b
    iget-object v6, v0, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ll/ᩴ᩺᩻;->֫(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_c

    .line 612
    invoke-direct {p0, p1, p2, p3, v0}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;JLl/ܿ᩺᩻;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 613
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    goto :goto_7

    .line 616
    :cond_c
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ۜ(Ll/ܳ᩻ۜ;J)V

    goto/16 :goto_0

    .line 608
    :cond_d
    :goto_6
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    goto :goto_7

    .line 586
    :catch_2
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->֫(Ll/ܳ᩻ۜ;J)V

    :goto_7
    return v4

    .line 556
    :cond_e
    :goto_8
    invoke-direct {p0, p1, p2, p3}, Ll/۠᩺᩻;->ۜ(Ll/ܳ᩻ۜ;J)V

    goto/16 :goto_0

    :catchall_2
    move-exception p1

    .line 500
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw p1
.end method

.method private ᩻(Ll/ܳ᩻ۜ;J)Z
    .locals 2

    .line 401
    iget-object v0, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-ne v0, p1, :cond_0

    iget-wide v0, p0, Ll/۠᩺᩻;->ܽ:J

    cmp-long p1, v0, p2

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/۠᩺᩻;->ۧ:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/۠᩺᩻;->֫:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫()Ll/᩵᩺᩻;
    .locals 4

    .line 88
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 89
    :try_start_0
    iget-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z

    if-eqz v1, :cond_0

    .line 90
    new-instance v1, Ll/֡᩺᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    monitor-exit v0

    return-object v1

    .line 93
    :cond_0
    iget v1, p0, Ll/۠᩺᩻;->ۡ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۠᩺᩻;->ۡ:I

    const/4 v1, 0x0

    .line 94
    :goto_0
    iget v2, p0, Ll/۠᩺᩻;->ᩴ:I

    if-lez v2, :cond_1

    iget v3, p0, Ll/۠᩺᩻;->ܺ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ge v3, v2, :cond_1

    .line 96
    :try_start_1
    iget-object v2, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    .line 102
    :cond_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    .line 104
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 106
    :cond_2
    new-instance v0, Ll/ۚ᩺᩻;

    invoke-direct {v0, p0}, Ll/ۚ᩺᩻;-><init>(Ll/۠᩺᩻;)V

    return-object v0

    :catchall_0
    move-exception v1

    .line 102
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܳ᩻ۜ;)V
    .locals 4

    .line 65
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 66
    :try_start_0
    iget-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z

    if-nez v1, :cond_7

    iget-boolean v1, p1, Ll/ܳ᩻ۜ;->۠:Z

    if-nez v1, :cond_7

    iget-object v1, p1, Ll/ܳ᩻ۜ;->᩸:Ll/ᩴ᩺᩻;

    invoke-virtual {v1}, Ll/ᩴ᩺᩻;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 69
    :cond_0
    iget v1, p0, Ll/۠᩺᩻;->ۡ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_3

    .line 70
    iput-object p1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    .line 320
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_2

    if-eq v1, p1, :cond_2

    .line 72
    iput-boolean v3, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 73
    iput-boolean v3, p0, Ll/۠᩺᩻;->֫:Z

    .line 74
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 76
    :cond_2
    monitor-exit v0

    return-void

    .line 320
    :cond_3
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_6

    const/4 v2, 0x0

    if-ne v1, p1, :cond_5

    goto :goto_0

    .line 216
    :cond_5
    iput-object p1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    .line 217
    iput-boolean v3, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 218
    iput-boolean v3, p0, Ll/۠᩺᩻;->֫:Z

    .line 219
    iget-object p1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    .line 222
    :cond_6
    invoke-direct {p0, p1}, Ll/۠᩺᩻;->ܿ(Ll/ܳ᩻ۜ;)[Ljava/lang/Thread;

    move-result-object v2

    .line 79
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    invoke-direct {p0, v2}, Ll/۠᩺᩻;->ۧ([Ljava/lang/Thread;)V

    return-void

    .line 67
    :cond_7
    :goto_1
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 79
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    .line 157
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 158
    :try_start_0
    iget-object v1, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    if-eqz v1, :cond_2

    iget-object v1, v1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    .line 159
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 160
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 3

    .line 168
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 169
    :try_start_0
    iput-boolean v1, p0, Ll/۠᩺᩻;->᩵:Z

    .line 170
    iput-boolean v1, p0, Ll/۠᩺᩻;->ۧ:Z

    .line 171
    iput-boolean v1, p0, Ll/۠᩺᩻;->֫:Z

    const/4 v1, 0x0

    .line 172
    iput-object v1, p0, Ll/۠᩺᩻;->ۖ:Ll/ܳ᩻ۜ;

    const/4 v1, 0x0

    .line 173
    iput v1, p0, Ll/۠᩺᩻;->ۡ:I

    .line 174
    iget-object v1, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    const/4 v1, 0x0

    .line 320
    :goto_0
    iget-object v2, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    .line 177
    :try_start_1
    iget-object v2, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    .line 183
    :cond_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    .line 185
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 183
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ܳ᩻ۜ;)V
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 114
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠᩺᩻;->ᩳ(Ll/ܳ᩻ۜ;)V

    .line 115
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ(Ll/ܳ᩻ۜ;)V
    .locals 3

    .line 123
    iget-object v0, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 124
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠᩺᩻;->ᩳ(Ll/ܳ᩻ۜ;)V

    const/4 v1, 0x0

    .line 125
    :goto_0
    iget-object v2, p0, Ll/۠᩺᩻;->ܿ:Ll/ܳ᩻ۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, p1, :cond_0

    .line 127
    :try_start_1
    iget-object v2, p0, Ll/۠᩺᩻;->ۜ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    .line 133
    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    .line 135
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 133
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
