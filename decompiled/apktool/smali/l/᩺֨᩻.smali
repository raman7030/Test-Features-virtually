.class public final Ll/᩺֨᩻;
.super Ljava/lang/Object;
.source "X72V"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩺֨᩻;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    move-object v0, p0

    .line 38
    monitor-enter v0

    .line 39
    :try_start_0
    iget-boolean v1, p0, Ll/᩺֨᩻;->ۧ:Z

    if-eqz v1, :cond_0

    .line 40
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 42
    iput-boolean v1, p0, Ll/᩺֨᩻;->ۧ:Z

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩺֨᩻;->֫:Ljava/util/HashSet;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    iget-object v2, p0, Ll/᩺֨᩻;->֫:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܰ᩵;

    .line 47
    invoke-interface {v1}, Ll/ܽܰ᩵;->cancel()V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 45
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܽܰ᩵;)V
    .locals 2

    move-object v0, p0

    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    iget-boolean v1, p0, Ll/᩺֨᩻;->ۧ:Z

    if-nez v1, :cond_0

    .line 22
    iget-object v1, p0, Ll/᩺֨᩻;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 23
    monitor-exit v0

    return-void

    .line 25
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-interface {p1}, Ll/ܽܰ᩵;->cancel()V

    .line 60
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string v0, "Remote payload opening was canceled"

    invoke-direct {p1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1

    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 53
    :try_start_0
    iget-boolean v1, p0, Ll/᩺֨᩻;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 56
    monitor-exit v0

    return-void

    .line 60
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "Remote payload opening was canceled"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v1

    :catchall_0
    move-exception v1

    .line 56
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ(Ll/ܽܰ᩵;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v1, p0, Ll/᩺֨᩻;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
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
