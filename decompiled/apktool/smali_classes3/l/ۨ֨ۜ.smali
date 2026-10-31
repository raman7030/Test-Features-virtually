.class public final Ll/ۨ֨ۜ;
.super Ljava/lang/Object;
.source "K74T"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ᩳ۠ۜ;

.field public final ܽ:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 584
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 585
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 586
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֨ۜ;->ܽ:Ljava/util/Set;

    return-void
.end method

.method public static ֫(Ll/ۨ֨ۜ;Ll/ۤ֨ۜ;)V
    .locals 1

    move-object v0, p0

    .line 666
    monitor-enter v0

    .line 667
    :try_start_0
    iget-object p0, p0, Ll/ۨ֨ۜ;->ܽ:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 668
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/io/Closeable;)Ll/ۤ֨ۜ;
    .locals 2

    .line 613
    new-instance v1, Ll/ۤ֨ۜ;

    invoke-direct {v1, p0, p1}, Ll/ۤ֨ۜ;-><init>(Ll/ۨ֨ۜ;Ljava/io/Closeable;)V

    move-object v0, p0

    .line 614
    monitor-enter v0

    .line 615
    :try_start_0
    iget-boolean p1, p0, Ll/ۨ֨ۜ;->֫:Z

    if-nez p1, :cond_0

    .line 616
    iget-object p1, p0, Ll/ۨ֨ۜ;->ܽ:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 617
    monitor-exit v0

    return-object v1

    .line 619
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 673
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string v0, "HLS thumbnail generation was canceled"

    invoke-direct {p1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 622
    :try_start_1
    invoke-virtual {v1}, Ll/ۤ֨ۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 624
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 626
    :goto_0
    throw p1

    :catchall_0
    move-exception p1

    .line 619
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 4

    move-object v0, p0

    .line 649
    monitor-enter v0

    .line 650
    :try_start_0
    iget-boolean v1, p0, Ll/ۨ֨ۜ;->֫:Z

    if-eqz v1, :cond_0

    .line 651
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 653
    iput-boolean v1, p0, Ll/ۨ֨ۜ;->֫:Z

    .line 654
    iget-object v1, p0, Ll/ۨ֨ۜ;->ۧ:Ll/ᩳ۠ۜ;

    .line 655
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۨ֨ۜ;->ܽ:Ljava/util/Set;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 656
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 887
    iget-object v0, v1, Ll/ᩳ۠ۜ;->᩹:Ll/ܽۚۜ;

    invoke-virtual {v0}, Ll/ܽۚۜ;->ܿ()V

    .line 660
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ֨ۜ;

    .line 661
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 656
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ᩳ۠ۜ;)V
    .locals 2

    move-object v0, p0

    .line 593
    monitor-enter v0

    .line 594
    :try_start_0
    iget-boolean v1, p0, Ll/ۨ֨ۜ;->֫:Z

    if-nez v1, :cond_0

    .line 595
    iput-object p1, p0, Ll/ۨ֨ۜ;->ۧ:Ll/ᩳ۠ۜ;

    .line 596
    monitor-exit v0

    return-void

    .line 598
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 887
    iget-object p1, p1, Ll/ᩳ۠ۜ;->᩹:Ll/ܽۚۜ;

    invoke-virtual {p1}, Ll/ܽۚۜ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 598
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 2

    move-object v0, p0

    .line 637
    monitor-enter v0

    .line 638
    :try_start_0
    iget-boolean v1, p0, Ll/ۨ֨ۜ;->֫:Z

    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-nez v1, :cond_0

    .line 639
    monitor-exit v0

    return-void

    .line 641
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 673
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "HLS thumbnail generation was canceled"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 642
    throw v0

    :catchall_0
    move-exception v1

    .line 641
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ᩳ۠ۜ;)V
    .locals 2

    move-object v0, p0

    .line 603
    monitor-enter v0

    .line 604
    :try_start_0
    iget-object v1, p0, Ll/ۨ֨ۜ;->ۧ:Ll/ᩳ۠ۜ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 605
    iput-object p1, p0, Ll/ۨ֨ۜ;->ۧ:Ll/ᩳ۠ۜ;

    .line 607
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
