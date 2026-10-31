.class public final Ll/ۜۘ֡;
.super Ljava/lang/Object;
.source "SAHW"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 5

    .line 76
    const-class v0, Ll/ۢۘ֡;

    monitor-enter v0

    .line 77
    :try_start_0
    invoke-static {}, Ll/ۢۘ֡;->֫()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 78
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    .line 79
    invoke-static {}, Ll/ۢۘ֡;->ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 80
    invoke-static {}, Ll/ۢۘ֡;->֫()Ljava/util/HashMap;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 83
    :cond_1
    invoke-static {}, Ll/ۢۘ֡;->֫()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Ll/ۢۘ֡;->ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 84
    invoke-static {}, Ll/ۢۘ֡;->ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 85
    invoke-static {}, Ll/ۢۘ֡;->ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    .line 86
    invoke-static {}, Ll/ۢۘ֡;->ܽ()V

    .line 88
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
