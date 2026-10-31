.class public final Ll/ۧ۟ۖ;
.super Ll/۟ܰۖ;
.source "J9I9"


# instance fields
.field public final ۙ:Ll/ܳ۟ۖ;

.field public final ᩶:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final ᩸:Ll/֫۟ۖ;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/ܳ۟ۖ;Ll/֫۟ۖ;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ۧ۟ۖ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ۧ۟ۖ;->᩶:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 34
    iput-object p1, p0, Ll/ۧ۟ۖ;->ۙ:Ll/ܳ۟ۖ;

    .line 35
    iput-object p2, p0, Ll/ۧ۟ۖ;->᩸:Ll/֫۟ۖ;

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 4

    .line 40
    iget-object p1, p0, Ll/ۧ۟ۖ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v0, p0, Ll/ۧ۟ۖ;->᩶:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const/4 v1, 0x0

    .line 42
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ۟ۖ;->isDone()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    iget-object v3, p0, Ll/ۧ۟ۖ;->᩸:Ll/֫۟ۖ;

    invoke-interface {v3}, Ll/֫۟ۖ;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return v2

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return v1

    :catchall_0
    move-exception v2

    .line 50
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    sget-object p1, Ll/ۧۧۘ;->᩸:Ll/ܽ۟ۖ;

    invoke-interface {p1, v2}, Ll/ܽ۟ۖ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ll/ۧۧۘ;

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 54
    throw p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۧ۟ۖ;->ۙ:Ll/ܳ۟ۖ;

    invoke-virtual {v0}, Ll/ܳ۟ۖ;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۧ۟ۖ;->ۙ:Ll/ܳ۟ۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ۟ۖ;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 2

    .line 59
    iget-object v0, p0, Ll/ۧ۟ۖ;->᩶:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 61
    :try_start_0
    iget-object v1, p0, Ll/ۧ۟ۖ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 64
    throw v1
.end method

.method public final isDone()Z
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۧ۟ۖ;->᩶:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 71
    :try_start_0
    iget-object v1, p0, Ll/ۧ۟ۖ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۧ۟ۖ;->ۙ:Ll/ܳ۟ۖ;

    invoke-virtual {v1}, Ll/ܳ۟ۖ;->isDone()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 73
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 74
    throw v1
.end method
