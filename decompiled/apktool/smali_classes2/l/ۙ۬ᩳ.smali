.class public final Ll/ۙ۬ᩳ;
.super Ljava/lang/Object;
.source "I6UJ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۙ:Ljava/lang/ThreadLocal;


# instance fields
.field public ᩶:I

.field public ᩸:Z

.field public final ᩹:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۙ۬ᩳ;->ۙ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 21
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Ll/᩹۬ᩳ;

    invoke-direct {v2, v0}, Ll/᩹۬ᩳ;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    const/4 v0, 0x2

    invoke-direct {v1, v0, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Ll/ۙ۬ᩳ;->᩹:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v0, 0x1

    .line 29
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    const/4 v0, 0x0

    .line 30
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setExecuteExistingDelayedTasksAfterShutdownPolicy(Z)V

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ll/ۙ۬ᩳ;->ۙ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 24
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۙ۬ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙ۬ᩳ;->᩶:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙ۬ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۙ۬ᩳ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙ۬ᩳ;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙ۬ᩳ;->᩹:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙ۬ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙ۬ᩳ;->᩶:I

    return p0
.end method

.method public static ܽ()Z
    .locals 2

    .line 35
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ll/ۙ۬ᩳ;->ۙ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 56
    :try_start_0
    iget v1, p0, Ll/ۙ۬ᩳ;->᩶:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 57
    iput-boolean v1, p0, Ll/ۙ۬ᩳ;->᩸:Z

    .line 58
    iget-object v1, p0, Ll/ۙ۬ᩳ;->᩹:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v0

    return-void

    .line 56
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Persistence sessions are still active"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 59
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫()Ll/᩶۬ᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 40
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ۬ᩳ;->᩸:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/ۙ۬ᩳ;->᩶:I

    const/16 v2, 0x100

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 41
    iput v1, p0, Ll/ۙ۬ᩳ;->᩶:I

    .line 42
    new-instance v1, Ll/᩶۬ᩳ;

    invoke-direct {v1, p0}, Ll/᩶۬ᩳ;-><init>(Ll/ۙ۬ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 40
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/concurrent/RejectedExecutionException;

    const-string v2, "Persistence session limit reached or scheduler closed"

    invoke-direct {v1, v2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
