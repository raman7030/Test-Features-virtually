.class public final Ll/ܽܰܿ;
.super Ljava/lang/Object;
.source "D5GW"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public ۤ:Z

.field public final ۫:Ljava/lang/Runnable;

.field public final ۬:Ll/ۜܰܿ;

.field public final ᩶:Ljava/lang/Runnable;

.field public ᩸:Ljava/lang/Runnable;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۜܰܿ;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    .line 958
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 959
    iput-object p1, p0, Ll/ܽܰܿ;->۬:Ll/ۜܰܿ;

    .line 960
    iput-object p2, p0, Ll/ܽܰܿ;->᩶:Ljava/lang/Runnable;

    .line 961
    iput-object p3, p0, Ll/ܽܰܿ;->۫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1042
    invoke-virtual {p0}, Ll/ܽܰܿ;->ᩳ()V

    move-object v0, p0

    .line 1043
    monitor-enter v0

    .line 1044
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->ۗ:Z

    if-eqz v1, :cond_0

    .line 1045
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1047
    iput-boolean v1, p0, Ll/ܽܰܿ;->ۗ:Z

    .line 1048
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1049
    iget-object v0, p0, Ll/ܽܰܿ;->۬:Ll/ۜܰܿ;

    invoke-static {v0, p0}, Ll/ۜܰܿ;->֫(Ll/ۜܰܿ;Ll/ܽܰܿ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1048
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 4

    move-object v0, p0

    .line 1005
    monitor-enter v0

    .line 1006
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->᩹:Z

    if-nez v1, :cond_1

    .line 1007
    iget-object v1, p0, Ll/ܽܰܿ;->᩸:Ljava/lang/Runnable;

    if-nez v1, :cond_0

    goto :goto_0

    .line 1008
    :cond_0
    new-instance v2, Ll/֫۠᩷;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1, p1}, Ll/֫۠᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v2

    :goto_0
    iput-object p1, p0, Ll/ܽܰܿ;->᩸:Ljava/lang/Runnable;

    const/4 p1, 0x0

    .line 1018
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    .line 1020
    check-cast p1, Ll/᩵ܰܿ;

    invoke-virtual {p1}, Ll/᩵ܰܿ;->run()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 1018
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 980
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->ۙ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ܽܰܿ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    .line 983
    :cond_0
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 981
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܳ()V
    .locals 2

    move-object v0, p0

    .line 1027
    monitor-enter v0

    .line 1028
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->ۤ:Z

    if-eqz v1, :cond_0

    .line 1029
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1031
    iput-boolean v1, p0, Ll/ܽܰܿ;->ۤ:Z

    .line 1032
    iget-object v1, p0, Ll/ܽܰܿ;->۫:Ljava/lang/Runnable;

    .line 1033
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1035
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception v1

    .line 1033
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 2

    move-object v0, p0

    .line 967
    monitor-enter v0

    .line 968
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->ۙ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 969
    iput-boolean v1, p0, Ll/ܽܰܿ;->ۙ:Z

    .line 970
    iget-object v1, p0, Ll/ܽܰܿ;->᩶:Ljava/lang/Runnable;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 972
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 974
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 972
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 3

    move-object v0, p0

    .line 989
    monitor-enter v0

    .line 990
    :try_start_0
    iget-boolean v1, p0, Ll/ܽܰܿ;->᩹:Z

    if-eqz v1, :cond_0

    .line 991
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 993
    iput-boolean v1, p0, Ll/ܽܰܿ;->᩹:Z

    .line 994
    iget-object v1, p0, Ll/ܽܰܿ;->᩸:Ljava/lang/Runnable;

    const/4 v2, 0x0

    .line 995
    iput-object v2, p0, Ll/ܽܰܿ;->᩸:Ljava/lang/Runnable;

    .line 996
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 998
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 996
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
