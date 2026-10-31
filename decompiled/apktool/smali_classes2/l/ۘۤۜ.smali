.class public final Ll/ۘۤۜ;
.super Ljava/lang/Object;
.source "D8GL"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ۖۤۜ;

.field public ܽ:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ll/ۖۤۜ;)V
    .locals 0

    .line 5657
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5658
    iput-object p1, p0, Ll/ۘۤۜ;->ۧ:Ll/ۖۤۜ;

    return-void
.end method

.method public static ֫(Ll/ۘۤۜ;)V
    .locals 2

    move-object v0, p0

    .line 5675
    monitor-enter v0

    .line 5676
    :try_start_0
    iget-boolean v1, p0, Ll/ۘۤۜ;->֫:Z

    if-eqz v1, :cond_0

    .line 5677
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 5679
    iput-boolean v1, p0, Ll/ۘۤۜ;->֫:Z

    .line 5680
    iget-object v1, p0, Ll/ۘۤۜ;->ܽ:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    .line 5682
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 5684
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5686
    iget-object p0, p0, Ll/ۘۤۜ;->ۧ:Ll/ۖۤۜ;

    invoke-virtual {p0}, Ll/ۖۤۜ;->᩵()Ll/֨۠ۜ;

    move-result-object p0

    sget-object v0, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0}, Ll/֨۠ۜ;->֫()V

    return-void

    :catchall_0
    move-exception p0

    .line 5684
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۘۤۜ;Ljava/lang/Thread;)Z
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 5663
    :try_start_0
    iput-object p1, p0, Ll/ۘۤۜ;->ܽ:Ljava/lang/Thread;

    .line 5664
    iget-boolean p0, p0, Ll/ۘۤۜ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 p0, p0, 0x1

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(Ll/ۘۤۜ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 5669
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    const/4 v1, 0x0

    .line 5670
    iput-object v1, p0, Ll/ۘۤۜ;->ܽ:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5671
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

.method public static ܽ(Ll/ۘۤۜ;)Ll/ۖۤۜ;
    .locals 0

    .line 5690
    iget-object p0, p0, Ll/ۘۤۜ;->ۧ:Ll/ۖۤۜ;

    return-object p0
.end method
