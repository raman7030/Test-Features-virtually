.class public abstract Ll/ۗ֫ۢ;
.super Ll/ۖۧۢ;
.source "06PO"


# instance fields
.field public volatile ۗ:J

.field public final ۙ:Ljava/util/concurrent/ExecutorService;

.field public ۛ:J

.field public final ۤ:Ljava/util/concurrent/atomic/AtomicLong;

.field public ۨ:Z

.field public ۫:Ll/ۙ֫ۢ;

.field public final ۬:Landroid/os/Handler;

.field public final ܰ:Ljava/lang/Object;

.field public volatile ᩶:Z

.field public volatile ᩺:Ll/ۡ᩹ۡ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗ֫ۢ;->ܰ:Ljava/lang/Object;

    .line 18
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ۗ֫ۢ;->۬:Landroid/os/Handler;

    .line 19
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Ll/ۗ֫ۢ;->ۙ:Ljava/util/concurrent/ExecutorService;

    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ۗ֫ۢ;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static ֫(Ll/ۗ֫ۢ;)V
    .locals 4

    .line 57
    :goto_0
    iget-object v0, p0, Ll/ۗ֫ۢ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 58
    :try_start_0
    iget-object v1, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    const/4 v2, 0x0

    .line 59
    iput-object v2, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 61
    iput-boolean v1, p0, Ll/ۗ֫ۢ;->ۨ:Z

    .line 62
    monitor-exit v0

    return-void

    .line 64
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 66
    :try_start_1
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 67
    :cond_1
    iget-object v0, v1, Ll/ۙ֫ۢ;->᩹:Ll/᩶֫ۢ;

    iget-object v2, v1, Ll/ۙ֫ۢ;->ۙ:Ljava/lang/CharSequence;

    invoke-interface {v0, v2, v1}, Ll/᩶֫ۢ;->֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 68
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->᩻()Z

    move-result v2

    if-nez v2, :cond_2

    .line 69
    iget-object v2, p0, Ll/ۗ֫ۢ;->۬:Landroid/os/Handler;

    new-instance v3, Ll/᩹֫ۢ;

    invoke-direct {v3, p0, v1, v0}, Ll/᩹֫ۢ;-><init>(Ll/ۗ֫ۢ;Ll/ۙ֫ۢ;Ljava/lang/Runnable;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :cond_2
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 65
    :try_start_3
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 76
    :catchall_2
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->᩻()Z

    goto :goto_0

    :catchall_3
    move-exception p0

    .line 64
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p0
.end method

.method public static synthetic ֫(Ll/ۗ֫ۢ;JJLl/ۡ᩹ۡ;Ljava/lang/Runnable;)V
    .locals 3

    .line 87
    iget-boolean v0, p0, Ll/ۗ֫ۢ;->᩶:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۗ֫ۢ;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    iget-wide p1, p0, Ll/ۗ֫ۢ;->ۗ:J

    cmp-long v0, p3, p1

    if-nez v0, :cond_1

    iget-object p0, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    if-ne p5, p0, :cond_1

    if-eqz p5, :cond_0

    .line 88
    invoke-virtual {p5}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۗ֫ۢ;Ll/ۙ֫ۢ;Ljava/lang/Runnable;)V
    .locals 2

    .line 70
    invoke-virtual {p1}, Ll/ۙ֫ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    iget-wide v0, p1, Ll/ۙ֫ۢ;->᩸:J

    iput-wide v0, p0, Ll/ۗ֫ۢ;->ۛ:J

    .line 72
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗ֫ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗ֫ۢ;->᩶:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۗ֫ۢ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۗ֫ۢ;->ۗ:J

    return-wide v0
.end method


# virtual methods
.method public close()V
    .locals 5

    .line 102
    iget-object v0, p0, Ll/ۗ֫ۢ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 103
    :try_start_0
    iput-boolean v1, p0, Ll/ۗ֫ۢ;->᩶:Z

    .line 104
    iget-wide v1, p0, Ll/ۗ֫ۢ;->ۗ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗ֫ۢ;->ۗ:J

    .line 105
    iget-object v1, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 106
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->close()V

    .line 107
    iput-object v2, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    .line 109
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    iput-object v2, p0, Ll/ۖۧۢ;->᩸:Ll/ۜۧۢ;

    return-void

    :catchall_0
    move-exception v1

    .line 109
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/CharSequence;Ll/᩶֫ۢ;)V
    .locals 10

    .line 35
    iget-object v0, p0, Ll/ۗ֫ۢ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ֫ۢ;->᩶:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 37
    :cond_0
    instance-of v1, p1, Ll/᩶᩸ᩳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Ll/᩶᩸ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_1
    move-object v8, v2

    .line 38
    :goto_0
    new-instance v1, Ll/ۙ֫ۢ;

    iget-wide v3, p0, Ll/ۗ֫ۢ;->ۗ:J

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/ۗ֫ۢ;->ۗ:J

    if-nez v8, :cond_2

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v8

    :goto_1
    move-object v3, v1

    move-object v4, p0

    move-object v9, p2

    invoke-direct/range {v3 .. v9}, Ll/ۙ֫ۢ;-><init>(Ll/ۗ֫ۢ;JLjava/lang/CharSequence;Ll/۟᩸ᩳ;Ll/᩶֫ۢ;)V

    .line 39
    iget-object p1, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ll/ۙ֫ۢ;->close()V

    .line 40
    :cond_3
    iput-object v1, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    .line 41
    iget-boolean p1, p0, Ll/ۗ֫ۢ;->ۨ:Z

    if-eqz p1, :cond_4

    monitor-exit v0

    return-void

    :cond_4
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Ll/ۗ֫ۢ;->ۨ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :try_start_1
    iget-object p1, p0, Ll/ۗ֫ۢ;->ۙ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/᩸֫ۢ;

    invoke-direct {p2, p0}, Ll/᩸֫ۢ;-><init>(Ll/ۗ֫ۢ;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_2
    const/4 p2, 0x0

    .line 46
    iput-boolean p2, p0, Ll/ۗ֫ۢ;->ۨ:Z

    .line 47
    iput-object v2, p0, Ll/ۗ֫ۢ;->۫:Ll/ۙ֫ۢ;

    .line 48
    invoke-virtual {v1}, Ll/ۙ֫ۢ;->close()V

    .line 49
    throw p1

    .line 51
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 9

    .line 83
    iget-object v0, p0, Ll/ۗ֫ۢ;->ۤ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v3

    .line 84
    iget-wide v5, p0, Ll/ۗ֫ۢ;->ۗ:J

    .line 85
    iget-object v7, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    .line 86
    new-instance v0, Ll/ܶ֫ۢ;

    move-object v1, v0

    move-object v2, p0

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Ll/ܶ֫ۢ;-><init>(Ll/ۗ֫ۢ;JJLl/ۡ᩹ۡ;Ljava/lang/Runnable;)V

    .line 91
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ֫ۢ;->run()V

    return-void

    .line 92
    :cond_0
    iget-object p1, p0, Ll/ۗ֫ۢ;->۬:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public ֫(Ll/ۡ᩹ۡ;)V
    .locals 0

    .line 30
    iput-object p1, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    return-void
.end method

.method public final ܽ()Z
    .locals 5

    .line 96
    iget-boolean v0, p0, Ll/ۗ֫ۢ;->᩶:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Ll/ۗ֫ۢ;->ۛ:J

    iget-wide v2, p0, Ll/ۗ֫ۢ;->ۗ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-object v0, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ֫ۢ;->᩺:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
