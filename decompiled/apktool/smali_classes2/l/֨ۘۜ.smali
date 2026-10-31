.class public final Ll/֨ۘۜ;
.super Ljava/lang/Object;
.source "R6VA"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۚۘۜ;

.field public ܽ:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۘۜ;->ܽ:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/io/Closeable;)Ll/ۚۘۜ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 15
    :try_start_0
    new-instance v1, Ll/ۚۘۜ;

    invoke-direct {v1, p1}, Ll/ۚۘۜ;-><init>(Ljava/io/Closeable;)V

    .line 16
    iget-boolean p1, p0, Ll/֨ۘۜ;->֫:Z

    if-nez p1, :cond_0

    .line 20
    iput-object v1, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit v0

    return-object v1

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ll/ۚۘۜ;->close()V

    .line 18
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string v1, "Text search canceled."

    invoke-direct {p1, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 3

    move-object v0, p0

    .line 31
    monitor-enter v0

    const/4 v1, 0x1

    .line 32
    :try_start_0
    iput-boolean v1, p0, Ll/֨ۘۜ;->֫:Z

    .line 34
    iget-object v1, p0, Ll/֨ۘۜ;->ܽ:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 35
    :cond_0
    iget-object v1, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;

    const/4 v2, 0x0

    .line 36
    iput-object v2, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    .line 53
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ll/ۚۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 37
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 3

    move-object v0, p0

    .line 43
    monitor-enter v0

    const/4 v1, 0x0

    .line 44
    :try_start_0
    iput-object v1, p0, Ll/֨ۘۜ;->ܽ:Ljava/lang/Thread;

    .line 45
    iget-object v2, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;

    .line 46
    iput-object v1, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;

    .line 47
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    return-void

    .line 53
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ll/ۚۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 47
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 27
    :try_start_0
    iget-boolean v1, p0, Ll/֨ۘۜ;->֫:Z
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

.method public final declared-synchronized ᩳ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 25
    :try_start_0
    iput-object v1, p0, Ll/֨ۘۜ;->ۧ:Ll/ۚۘۜ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
