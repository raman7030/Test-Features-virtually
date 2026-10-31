.class public final Ll/ۢ֨᩻;
.super Ljava/lang/Object;
.source "M9Q4"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 594
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 595
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ֨᩻;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 611
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    .line 612
    monitor-enter v0

    .line 613
    :try_start_0
    iget-boolean v2, p0, Ll/ۢ֨᩻;->֫:Z

    if-eqz v2, :cond_0

    .line 614
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 616
    iput-boolean v2, p0, Ll/ۢ֨᩻;->֫:Z

    .line 617
    iget-object v2, p0, Ll/ۢ֨᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ۖܽ;

    .line 618
    invoke-interface {v3}, Ll/۠ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 620
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 621
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۖܽ;

    .line 624
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 620
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/۠ۖܽ;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 599
    :try_start_0
    iget-boolean v1, p0, Ll/ۢ֨᩻;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 600
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    .line 602
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۢ֨᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 603
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

.method public final declared-synchronized ۧ(Ll/۠ۖܽ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 607
    :try_start_0
    iget-object v1, p0, Ll/ۢ֨᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 608
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
