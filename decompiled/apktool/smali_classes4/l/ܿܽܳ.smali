.class public final Ll/ܿܽܳ;
.super Ljava/lang/Object;
.source "P70P"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Z


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 46
    :try_start_0
    iget-boolean v1, p0, Ll/ܿܽܳ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 47
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 49
    :try_start_1
    iput-boolean v1, p0, Ll/ܿܽܳ;->᩸:Z

    .line 50
    invoke-static {}, Ll/ܳܽܳ;->֫()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ltz v1, :cond_1

    .line 55
    monitor-exit v0

    return-void

    .line 52
    :cond_1
    :try_start_2
    invoke-static {}, Ll/ܳܽܳ;->֫()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 53
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Hex file channel count underflow"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 55
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
