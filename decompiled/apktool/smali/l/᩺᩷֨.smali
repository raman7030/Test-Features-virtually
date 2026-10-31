.class public final Ll/᩺᩷֨;
.super Ljava/lang/Object;
.source "K5JX"


# instance fields
.field public volatile ֫:Z


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 43
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/᩺᩷֨;->֫:Z

    if-nez v1, :cond_0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 46
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 39
    :try_start_0
    iput-boolean v1, p0, Ll/᩺᩷֨;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 31
    :try_start_0
    iget-boolean v1, p0, Ll/᩺᩷֨;->֫:Z

    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p0, Ll/᩺᩷֨;->֫:Z

    if-nez v1, :cond_0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
