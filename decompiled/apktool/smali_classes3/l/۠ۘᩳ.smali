.class public final Ll/۠ۘᩳ;
.super Ljava/lang/Object;
.source "G6SF"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Ll/ܶۘᩳ;


# direct methods
.method public constructor <init>(Ll/ܶۘᩳ;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۘᩳ;->᩸:Ll/ܶۘᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 126
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/۠ۘᩳ;->᩸:Ll/ܶۘᩳ;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/۠ۘᩳ;->᩸:Ll/ܶۘᩳ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 127
    invoke-static {v1, v2}, Ll/ܶۘᩳ;->֫(Ll/ܶۘᩳ;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 126
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 3

    move-object v0, p0

    .line 126
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/۠ۘᩳ;->᩸:Ll/ܶۘᩳ;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/۠ۘᩳ;->᩸:Ll/ܶۘᩳ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 127
    invoke-static {v1, p1}, Ll/ܶۘᩳ;->֫(Ll/ܶۘᩳ;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 126
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
