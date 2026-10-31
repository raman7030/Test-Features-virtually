.class public final Ll/ۙܿ;
.super Ljava/lang/Object;
.source "Y4G0"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final ۙ:Ljava/util/ArrayDeque;

.field public final ᩶:Ljava/lang/Object;

.field public ᩸:Ljava/lang/Runnable;

.field public final ᩹:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙܿ;->᩶:Ljava/lang/Object;

    .line 131
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۙܿ;->ۙ:Ljava/util/ArrayDeque;

    .line 136
    iput-object p1, p0, Ll/ۙܿ;->᩹:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 3

    .line 141
    iget-object v0, p0, Ll/ۙܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 142
    :try_start_0
    iget-object v1, p0, Ll/ۙܿ;->ۙ:Ljava/util/ArrayDeque;

    new-instance v2, Ll/᩶ܿ;

    invoke-direct {v2, p0, p1}, Ll/᩶ܿ;-><init>(Ll/ۙܿ;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 149
    iget-object p1, p0, Ll/ۙܿ;->᩸:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    .line 150
    invoke-virtual {p0}, Ll/ۙܿ;->ۧ()V

    .line 152
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

.method public final ۧ()V
    .locals 3

    .line 156
    iget-object v0, p0, Ll/ۙܿ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 157
    :try_start_0
    iget-object v1, p0, Ll/ۙܿ;->ۙ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    iput-object v1, p0, Ll/ۙܿ;->᩸:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 158
    iget-object v2, p0, Ll/ۙܿ;->᩹:Ljava/util/concurrent/Executor;

    check-cast v2, Ll/ۗܿ;

    invoke-virtual {v2, v1}, Ll/ۗܿ;->execute(Ljava/lang/Runnable;)V

    .line 160
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
