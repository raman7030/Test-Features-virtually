.class public final Ll/᩶۬ᩳ;
.super Ljava/lang/Object;
.source "I6UJ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۙ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/ۙ۬ᩳ;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 73
    iget-object v0, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    monitor-enter v0

    .line 74
    :try_start_0
    iget-boolean v1, p0, Ll/᩶۬ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 75
    iput-boolean v1, p0, Ll/᩶۬ᩳ;->᩸:Z

    .line 76
    iget-object v2, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    invoke-static {v2}, Ll/ۙ۬ᩳ;->ܽ(Ll/ۙ۬ᩳ;)I

    move-result v3

    sub-int/2addr v3, v1

    invoke-static {v2, v3}, Ll/ۙ۬ᩳ;->֫(Ll/ۙ۬ᩳ;I)V

    .line 77
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/᩸ۙᩳ;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 3

    .line 65
    iget-object v0, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    monitor-enter v0

    .line 66
    :try_start_0
    iget-boolean v1, p0, Ll/᩶۬ᩳ;->᩸:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    invoke-static {v1}, Ll/ۙ۬ᩳ;->֫(Ll/ۙ۬ᩳ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 67
    iget-object v1, p0, Ll/᩶۬ᩳ;->᩹:Ll/ۙ۬ᩳ;

    invoke-static {v1}, Ll/ۙ۬ᩳ;->ۧ(Ll/ۙ۬ᩳ;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p1, p2, p3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 66
    :cond_0
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    const-string p2, "Persistence scheduler slot is closed"

    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
