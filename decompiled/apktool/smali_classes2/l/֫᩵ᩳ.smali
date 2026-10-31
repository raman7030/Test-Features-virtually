.class public final Ll/֫᩵ᩳ;
.super Ljava/lang/Object;
.source "A6S3"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final ᩶:Ljava/util/HashSet;

.field public volatile ᩸:Z

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    return-void
.end method

.method public static ֫(Ljava/io/Closeable;Ll/ܿۖ᩷;)Ljava/io/Closeable;
    .locals 2

    .line 48
    instance-of v0, p1, Ll/֫᩵ᩳ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/֫᩵ᩳ;

    .line 49
    new-instance v1, Ll/۟ᩴᩳ;

    invoke-direct {v1, p1, p0}, Ll/۟ᩴᩳ;-><init>(Ll/֫᩵ᩳ;Ljava/io/Closeable;)V

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 39
    :try_start_0
    iget-boolean p0, p1, Ll/֫᩵ᩳ;->᩹:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    monitor-exit v0

    return-object v1

    .line 40
    :cond_0
    :try_start_1
    iget-object p0, p1, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 41
    iget-boolean p0, p1, Ll/֫᩵ᩳ;->᩸:Z

    if-eqz p0, :cond_1

    invoke-virtual {v1}, Ll/۟ᩴᩳ;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_2
    return-object p0
.end method

.method public static ֫(Ll/֫᩵ᩳ;Ll/۟ᩴᩳ;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 44
    :try_start_0
    iget-object p0, p0, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized cancel()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 25
    :try_start_0
    iput-boolean v1, p0, Ll/֫᩵ᩳ;->᩸:Z

    .line 26
    iget-object v1, p0, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ᩴᩳ;

    invoke-virtual {v2}, Ll/۟ᩴᩳ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 27
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
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 33
    :try_start_0
    iget-boolean v1, p0, Ll/֫᩵ᩳ;->᩸:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Ll/֫᩵ᩳ;->᩹:Z

    .line 35
    iget-object v1, p0, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    monitor-exit v0

    return-void

    .line 33
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Canceled input cannot be handed off"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 36
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

    .line 29
    :try_start_0
    iget-object v1, p0, Ll/֫᩵ᩳ;->᩶:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1
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

.method public final ᩻()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Ll/֫᩵ᩳ;->᩸:Z

    return v0
.end method
