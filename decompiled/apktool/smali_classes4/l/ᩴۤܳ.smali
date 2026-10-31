.class public final Ll/ᩴۤܳ;
.super Ljava/lang/Object;
.source "57TP"


# instance fields
.field public final ֫:Ll/᩵ۘ֡;

.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public constructor <init>(Ll/ۗۖ֡;Ll/ۛܳ᩻;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ᩴۤܳ;->ۧ:Ll/ۧۤᩴ;

    .line 33
    new-instance v0, Ll/᩵ۘ֡;

    invoke-direct {v0, p1, p2}, Ll/᩵ۘ֡;-><init>(Ll/ۗۖ֡;Ll/ۛܳ᩻;)V

    iput-object v0, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Ljava/lang/Object;Ll/ۖۤܳ;)V
    .locals 1

    .line 151
    :cond_0
    invoke-virtual {p3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۤܳ;

    if-eqz v0, :cond_1

    .line 152
    invoke-virtual {v0, p2}, Ll/ۘۤܳ;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    invoke-static {p2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void

    .line 163
    :cond_1
    iget-object p3, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {p3, p1, p2}, Ll/᩵ۘ֡;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    invoke-static {p2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۘۤܳ;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 3

    const/4 v0, 0x0

    .line 67
    :try_start_0
    iget-object v1, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {v1, p1}, Ll/᩵ۘ֡;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 69
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 0
    :cond_0
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 75
    invoke-virtual {p3}, Ll/ۘۤܳ;->ۧ()V

    .line 76
    invoke-virtual {p4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 0
    :cond_1
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 79
    invoke-direct {p0, p1, v1, p5}, Ll/ᩴۤܳ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/ۖۤܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 83
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 0
    :cond_2
    invoke-virtual {p6, v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 86
    :goto_0
    invoke-virtual {p3}, Ll/ۘۤܳ;->ۧ()V

    .line 87
    invoke-virtual {p4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴۤܳ;Ll/ۘۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;)V
    .locals 2

    .line 95
    :try_start_0
    invoke-virtual {p1}, Ll/ۘۤܳ;->ܽ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 v1, 0x0

    .line 0
    invoke-virtual {p3, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    invoke-virtual {p1}, Ll/ۘۤܳ;->ۧ()V

    .line 105
    invoke-virtual {p4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 0
    :cond_1
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 108
    invoke-direct {p0, p2, v0, p5}, Ll/ᩴۤܳ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/ۖۤܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    .line 38
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    new-instance v1, Ll/ۢۤܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v9, Ll/ᩴۤܳ;->ۧ:Ll/ۧۤᩴ;

    invoke-static {v2, v0, v1}, Ll/ᩳۤᩴ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ll/ۖۤܳ;

    .line 44
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    iget-object v1, v9, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {v1, v0}, Ll/᩵ۘ֡;->ᩳ(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_0

    .line 49
    :try_start_0
    invoke-virtual {v1, v0}, Ll/᩵ۘ֡;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 56
    :catch_0
    :cond_0
    new-instance v11, Ll/ۘۤܳ;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Ll/ۘۤܳ;-><init>(I)V

    .line 57
    invoke-virtual {v10, v11}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 60
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 61
    new-instance v13, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v13}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 62
    new-instance v14, Ljava/util/concurrent/CountDownLatch;

    const/4 v15, 0x1

    invoke-direct {v14, v15}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 65
    sget-object v8, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Ll/ۡۤܳ;

    move-object v1, v7

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object v4, v12

    move-object v5, v11

    move-object v6, v14

    move-object v15, v7

    move-object v7, v10

    move-object v0, v8

    move-object v8, v13

    invoke-direct/range {v1 .. v8}, Ll/ۡۤܳ;-><init>(Ll/ᩴۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۘۤܳ;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 93
    new-instance v8, Ll/ܺۤܳ;

    move-object v1, v8

    move-object v3, v11

    move-object/from16 v4, p1

    move-object v5, v12

    invoke-direct/range {v1 .. v7}, Ll/ܺۤܳ;-><init>(Ll/ᩴۤܳ;Ll/ۘۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;)V

    invoke-interface {v0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 121
    :try_start_1
    invoke-virtual {v14}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 124
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    if-nez v0, :cond_3

    .line 129
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {v10, v11}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 139
    invoke-virtual {v11}, Ll/ۘۤܳ;->֫()V

    .line 142
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 143
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    return-object v0

    .line 134
    :cond_2
    :try_start_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Failed to get object"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_3
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 138
    invoke-virtual {v10, v11}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 139
    invoke-virtual {v11}, Ll/ۘۤܳ;->֫()V

    .line 142
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    .line 143
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 145
    :cond_4
    throw v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 204
    iget-object v0, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1279
    sget-object v1, Ll/۫ۖ֡;->᩶:Ll/۫ۖ֡;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۘ֡;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)V
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {v0, p1}, Ll/᩵ۘ֡;->ܽ(Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Ll/ᩴۤܳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۤܳ;

    if-eqz p1, :cond_0

    .line 197
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۤܳ;

    if-eqz v0, :cond_0

    .line 198
    invoke-virtual {v0}, Ll/ۘۤܳ;->֫()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 171
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 174
    iget-object v0, p0, Ll/ᩴۤܳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۤܳ;

    if-eqz v0, :cond_1

    .line 178
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۤܳ;

    if-eqz v1, :cond_1

    .line 179
    invoke-virtual {v1, p2}, Ll/ۘۤܳ;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Ll/ᩴۤܳ;->֫:Ll/᩵ۘ֡;

    invoke-virtual {v0, p1, p2}, Ll/᩵ۘ֡;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
