.class public final Ll/ۧ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final ᩸:Ljava/util/LinkedList;

.field public ᩹:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۧ᩹ۘ;->᩸:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 174
    :try_start_0
    iget-object v1, p0, Ll/ۧ᩹ۘ;->᩸:Ljava/util/LinkedList;

    new-instance v2, Ll/֫᩹ۘ;

    invoke-direct {v2, p0, p1}, Ll/֫᩹ۘ;-><init>(Ll/ۧ᩹ۘ;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 183
    iget-object p1, p0, Ll/ۧ᩹ۘ;->᩹:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    .line 184
    invoke-virtual {p0}, Ll/ۧ᩹ۘ;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    :cond_0
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

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 189
    :try_start_0
    iget-object v1, p0, Ll/ۧ᩹ۘ;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    iput-object v1, p0, Ll/ۧ᩹ۘ;->᩹:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 190
    sget-object v2, Ll/ܽ᩹ۘ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
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
