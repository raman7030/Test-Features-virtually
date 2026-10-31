.class public abstract Ll/ۘ۬᩵;
.super Ljava/lang/Object;
.source "2AYL"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Ll/ۡ۬᩵;
.implements Ll/ۤۛ᩵;


# instance fields
.field public volatile _heap:Ljava/lang/Object;

.field public ᩸:I

.field public ᩹:J


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 411
    check-cast p1, Ll/ۘ۬᩵;

    .line 431
    iget-wide v0, p0, Ll/ۘ۬᩵;->᩹:J

    iget-wide v2, p1, Ll/ۘ۬᩵;->᩹:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Delayed[nanos="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۘ۬᩵;->᩹:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ֫(JLl/ᩴ۬᩵;Ll/ܽ۬᩵;)I
    .locals 7

    .line 1
    monitor-enter p0

    .line 443
    :try_start_0
    iget-object v0, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;

    invoke-static {}, Ll/ۚ۬᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v0, v1, :cond_0

    monitor-exit p0

    const/4 p1, 0x2

    return p1

    .line 20
    :cond_0
    :try_start_1
    monitor-enter p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    invoke-virtual {p3}, Ll/۫ۛ᩵;->֫()Ll/ۤۛ᩵;

    move-result-object v0

    check-cast v0, Ll/ۘ۬᩵;

    .line 445
    invoke-static {p4}, Ll/᩵۬᩵;->֫(Ll/᩵۬᩵;)Z

    move-result p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_1

    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    const-wide/16 v1, 0x0

    if-nez v0, :cond_2

    .line 458
    :try_start_4
    iput-wide p1, p3, Ll/ᩴ۬᩵;->ۧ:J

    goto :goto_1

    .line 465
    :cond_2
    iget-wide v3, v0, Ll/ۘ۬᩵;->᩹:J

    sub-long v5, v3, p1

    cmp-long p4, v5, v1

    if-ltz p4, :cond_3

    goto :goto_0

    :cond_3
    move-wide p1, v3

    .line 469
    :goto_0
    iget-wide v3, p3, Ll/ᩴ۬᩵;->ۧ:J

    sub-long v3, p1, v3

    cmp-long p4, v3, v1

    if-lez p4, :cond_4

    iput-wide p1, p3, Ll/ᩴ۬᩵;->ۧ:J

    .line 478
    :cond_4
    :goto_1
    iget-wide p1, p0, Ll/ۘ۬᩵;->᩹:J

    iget-wide v3, p3, Ll/ᩴ۬᩵;->ۧ:J

    sub-long/2addr p1, v3

    cmp-long p4, p1, v1

    if-gez p4, :cond_5

    iput-wide v3, p0, Ll/ۘ۬᩵;->᩹:J

    .line 74
    :cond_5
    invoke-virtual {p3, p0}, Ll/۫ۛ᩵;->֫(Ll/ۘ۬᩵;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 73
    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 481
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    .line 73
    :try_start_6
    monitor-exit p3

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public final ֫()Ll/۫ۛ᩵;
    .locals 2

    .line 422
    iget-object v0, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;

    instance-of v1, v0, Ll/۫ۛ᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/۫ۛ᩵;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 428
    iput p1, p0, Ll/ۘ۬᩵;->᩸:I

    return-void
.end method

.method public final ֫(Ll/۫ۛ᩵;)V
    .locals 2

    .line 424
    iget-object v0, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;

    invoke-static {}, Ll/ۚ۬᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 425
    iput-object p1, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;

    return-void

    .line 424
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 428
    iget v0, p0, Ll/ۘ۬᩵;->᩸:I

    return v0
.end method

.method public final declared-synchronized ܿ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 486
    :try_start_0
    iget-object v1, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;

    .line 487
    invoke-static {}, Ll/ۚ۬᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    .line 489
    :cond_0
    :try_start_1
    instance-of v2, v1, Ll/ᩴ۬᩵;

    if-eqz v2, :cond_1

    check-cast v1, Ll/ᩴ۬᩵;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1, p0}, Ll/۫ۛ᩵;->ۧ(Ll/ۘ۬᩵;)V

    .line 490
    :cond_2
    invoke-static {}, Ll/ۚ۬᩵;->ۧ()Ll/ܶۛ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ۘ۬᩵;->_heap:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 491
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
