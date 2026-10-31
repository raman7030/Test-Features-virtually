.class public final Ll/ᩴܰܿ;
.super Ljava/lang/Object;
.source "C5GL"


# instance fields
.field public ֫:Ll/ᩳܽܳ;

.field public ۧ:Ljava/lang/Object;


# virtual methods
.method public final declared-synchronized ֫()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1254
    :try_start_0
    iget-object v1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
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

.method public final declared-synchronized ֫(Ljava/lang/Object;Ll/ᩳܽܳ;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1264
    :try_start_0
    iget-object v1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Ll/ᩴܰܿ;->֫:Ll/ᩳܽܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ᩳܽܳ;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1259
    :try_start_0
    iget-object v1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ᩴܰܿ;->֫:Ll/ᩳܽܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ljava/lang/Object;Ll/ᩳܽܳ;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1269
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ll/ᩴܰܿ;->֫(Ljava/lang/Object;Ll/ᩳܽܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1270
    iput-object p1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;

    .line 1271
    iput-object p1, p0, Ll/ᩴܰܿ;->֫:Ll/ᩳܽܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1273
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ(Ljava/lang/Object;Ll/ᩳܽܳ;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1244
    :try_start_0
    iget-object v1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 1245
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    .line 1247
    :cond_0
    :try_start_1
    iput-object p1, p0, Ll/ᩴܰܿ;->ۧ:Ljava/lang/Object;

    .line 1248
    iput-object p2, p0, Ll/ᩴܰܿ;->֫:Ll/ᩳܽܳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1249
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
