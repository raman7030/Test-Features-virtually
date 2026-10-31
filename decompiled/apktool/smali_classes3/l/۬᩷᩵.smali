.class public final Ll/۬᩷᩵;
.super Ljava/util/Timer;
.source "XA2E"


# instance fields
.field public volatile ֫:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 184
    invoke-direct {p0, p1, p2}, Ljava/util/Timer;-><init>(Ljava/lang/String;Z)V

    const/4 p1, 0x0

    .line 185
    iput-boolean p1, p0, Ll/۬᩷᩵;->֫:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized cancel()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 202
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 203
    :try_start_1
    iput-boolean v1, p0, Ll/۬᩷᩵;->֫:Z

    .line 204
    invoke-super {p0}, Ljava/util/Timer;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
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

.method public final declared-synchronized schedule(Ljava/util/TimerTask;J)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 213
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 214
    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized schedule(Ljava/util/TimerTask;JJ)V
    .locals 1

    monitor-enter p0

    .line 233
    :try_start_0
    iget-boolean v0, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 234
    :cond_0
    :try_start_1
    invoke-super/range {p0 .. p5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 223
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 224
    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized schedule(Ljava/util/TimerTask;Ljava/util/Date;J)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 243
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 244
    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2, p3, p4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V
    .locals 1

    monitor-enter p0

    .line 253
    :try_start_0
    iget-boolean v0, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 254
    :cond_0
    :try_start_1
    invoke-super/range {p0 .. p5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 255
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized scheduleAtFixedRate(Ljava/util/TimerTask;Ljava/util/Date;J)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 263
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩷᩵;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 264
    :cond_0
    :try_start_1
    invoke-super {p0, p1, p2, p3, p4}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;Ljava/util/Date;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
