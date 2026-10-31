.class public final Ll/ܳ۬ᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Ll/ܶۙᩳ;


# direct methods
.method public constructor <init>(Ll/ܶۙᩳ;)V
    .locals 0

    .line 838
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;

    return-void
.end method

.method public static ֫(Ll/ܳ۬ᩳ;)Ll/ܶۙᩳ;
    .locals 1

    .line 840
    iget-object p0, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Session state is closed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 850
    :try_start_0
    iget-object v1, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܶۙᩳ;->close()V

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 851
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

.method public final declared-synchronized ֫()Ll/۫᩹ᩳ;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 840
    :try_start_0
    iget-object v1, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz v1, :cond_0

    .line 844
    iget-object v1, v1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    .line 845
    new-instance v2, Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v3

    invoke-virtual {v1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v4

    invoke-direct {v2, v3, v4, v5}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    .line 840
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Session state is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 845
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/ۤۜܽ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 840
    :try_start_0
    iget-object v1, p0, Ll/ܳ۬ᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz v1, :cond_0

    .line 848
    invoke-static {v1, p1}, Ll/ۘۗᩳ;->֫(Ll/ܶۙᩳ;Ll/ۤۜܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    .line 840
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Session state is closed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 848
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
