.class public final Ll/ܳۚ֫;
.super Ljava/lang/Object;
.source "K5JX"


# instance fields
.field public final ֫:Ll/ܽۚ֫;

.field public ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    sget-object v0, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    invoke-direct {p0, v0}, Ll/ܳۚ֫;-><init>(Ll/ܽۚ֫;)V

    return-void
.end method

.method public constructor <init>(Ll/ܽۚ֫;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 84
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/ܳۚ֫;->ۧ:Z

    if-nez v1, :cond_0

    .line 85
    iget-object v1, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 88
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

.method public final declared-synchronized ֫(J)Z
    .locals 5

    move-object v0, p0

    monitor-enter v0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    .line 153
    :try_start_0
    iget-boolean p1, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    .line 155
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    invoke-interface {v1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v1

    add-long/2addr p1, v1

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    .line 159
    invoke-virtual {p0}, Ll/ܳۚ֫;->ۧ()V

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    .line 162
    :goto_0
    iget-boolean v4, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_2

    cmp-long v4, v1, p1

    if-gez v4, :cond_2

    .line 164
    :try_start_2
    iget-object v4, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sub-long v1, p1, v1

    .line 165
    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 169
    :goto_1
    :try_start_3
    iget-object v1, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    invoke-interface {v1}, Ll/ܽۚ֫;->ܽ()J

    move-result-wide v1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    .line 173
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 176
    :cond_3
    :goto_2
    iget-boolean p1, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x0

    .line 126
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 128
    :try_start_1
    iget-object v2, p0, Ll/ܳۚ֫;->֫:Ll/ܽۚ֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 136
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 74
    :try_start_0
    iput-boolean v1, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
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

.method public final declared-synchronized ܿ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 59
    :try_start_0
    iget-boolean v1, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 60
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    .line 62
    :try_start_1
    iput-boolean v1, p0, Ll/ܳۚ֫;->ۧ:Z

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 181
    :try_start_0
    iget-boolean v1, p0, Ll/ܳۚ֫;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
