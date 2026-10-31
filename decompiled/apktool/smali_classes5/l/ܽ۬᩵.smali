.class public final Ll/ܽ۬᩵;
.super Ll/᩵۬᩵;
.source "8AY8"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static volatile _thread:Ljava/lang/Thread;

.field public static volatile debugStatus:I

.field public static final ۛ:J

.field public static final ۤ:Ll/ܽ۬᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 2
    new-instance v0, Ll/ܽ۬᩵;

    .line 28
    invoke-direct {v0}, Ll/᩵۬᩵;-><init>()V

    .line 0
    sput-object v0, Ll/ܽ۬᩵;->ۤ:Ll/ܽ۬᩵;

    const/4 v1, 0x0

    .line 103
    invoke-virtual {v0, v1}, Ll/ۖ۬᩵;->֫(Z)V

    .line 37
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    :try_start_0
    const-string v3, "kotlinx.coroutines.DefaultExecutor.keepAlive"

    .line 39
    invoke-static {v3, v1, v2}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 41
    :catch_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ܽ۬᩵;->ۛ:J

    return-void
.end method

.method private final declared-synchronized ۤ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    sget v1, Ll/ܽ۬᩵;->debugStatus:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x2

    const/4 v3, 0x3

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_2

    .line 177
    monitor-exit v0

    return-void

    .line 178
    :cond_2
    :try_start_1
    sput v3, Ll/ܽ۬᩵;->debugStatus:I

    .line 179
    invoke-virtual {p0}, Ll/᩵۬᩵;->۬()V

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 101
    invoke-static {p0}, Ll/ۖ۫᩵;->֫(Ll/ܽ۬᩵;)V

    const/4 v1, 0x0

    move-object v0, p0

    .line 0
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    :try_start_1
    sget v2, Ll/ܽ۬᩵;->debugStatus:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    .line 154
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    sput-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    .line 126
    invoke-direct {p0}, Ll/ܽ۬᩵;->ۤ()V

    .line 129
    invoke-virtual {p0}, Ll/᩵۬᩵;->ۙ()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Ll/ܽ۬᩵;->᩶()Ljava/lang/Thread;

    return-void

    .line 155
    :cond_2
    :try_start_3
    sput v5, Ll/ܽ۬᩵;->debugStatus:I

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    :try_start_4
    monitor-exit v0

    const-wide v5, 0x7fffffffffffffffL

    move-wide v7, v5

    .line 107
    :cond_3
    :goto_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 108
    invoke-virtual {p0}, Ll/᩵۬᩵;->ۗ()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v0, v9, v5

    if-nez v0, :cond_6

    .line 111
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v13

    cmp-long v0, v7, v5

    if-nez v0, :cond_4

    .line 112
    sget-wide v7, Ll/ܽ۬᩵;->ۛ:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    add-long/2addr v7, v13

    :cond_4
    sub-long v13, v7, v13

    cmp-long v0, v13, v11

    if-gtz v0, :cond_5

    .line 125
    sput-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    .line 126
    invoke-direct {p0}, Ll/ܽ۬᩵;->ۤ()V

    .line 129
    invoke-virtual {p0}, Ll/᩵۬᩵;->ۙ()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Ll/ܽ۬᩵;->᩶()Ljava/lang/Thread;

    return-void

    :cond_5
    cmp-long v0, v9, v13

    if-lez v0, :cond_7

    move-wide v9, v13

    goto :goto_3

    :cond_6
    move-wide v7, v5

    :cond_7
    :goto_3
    cmp-long v0, v9, v11

    if-lez v0, :cond_3

    .line 63
    :try_start_5
    sget v0, Ll/ܽ۬᩵;->debugStatus:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eq v0, v4, :cond_9

    if-ne v0, v3, :cond_8

    goto :goto_4

    :cond_8
    const/4 v0, 0x0

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v0, 0x1

    :goto_5
    if-eqz v0, :cond_b

    .line 125
    sput-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    .line 126
    invoke-direct {p0}, Ll/ܽ۬᩵;->ۤ()V

    .line 129
    invoke-virtual {p0}, Ll/᩵۬᩵;->ۙ()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Ll/ܽ۬᩵;->᩶()Ljava/lang/Thread;

    :cond_a
    return-void

    .line 121
    :cond_b
    :try_start_6
    invoke-static {p0, v9, v10}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v2

    .line 157
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v0

    .line 125
    sput-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    .line 126
    invoke-direct {p0}, Ll/ܽ۬᩵;->ۤ()V

    .line 129
    invoke-virtual {p0}, Ll/᩵۬᩵;->ۙ()Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {p0}, Ll/ܽ۬᩵;->᩶()Ljava/lang/Thread;

    :cond_c
    throw v0
.end method

.method public final shutdown()V
    .locals 1

    const/4 v0, 0x4

    .line 84
    sput v0, Ll/ܽ۬᩵;->debugStatus:I

    .line 85
    invoke-super {p0}, Ll/᩵۬᩵;->shutdown()V

    return-void
.end method

.method public final ֫(JLl/ۘ۬᩵;)V
    .locals 0

    .line 78
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    const-string p2, "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"

    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 60
    sget v0, Ll/ܽ۬᩵;->debugStatus:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 69
    invoke-super {p0, p1}, Ll/᩵۬᩵;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 78
    :cond_0
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    const-string v0, "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"

    invoke-direct {p1, v0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩶()Ljava/lang/Thread;
    .locals 3

    .line 49
    sget-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 135
    :try_start_0
    sget-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/Thread;

    const-string v2, "kotlinx.coroutines.DefaultExecutor"

    invoke-direct {v1, p0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 136
    sput-object v1, Ll/ܽ۬᩵;->_thread:Ljava/lang/Thread;

    const/4 v2, 0x1

    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 138
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method
