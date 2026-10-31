.class public final Ll/֫᩹ܽ;
.super Ljava/lang/Object;
.source "F77E"


# instance fields
.field public final ֫:Ll/᩷᩸ܽ;

.field public final ۧ:Ll/ۙ᩵ᩴ;

.field public final ܳ:Ll/ۤ᩸ܽ;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ܿ:Ll/᩶۫᩷;

.field public final ᩳ:Ll/ۡ᩵ܿ;

.field public final ᩻:Ll/ۢ᩸ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩸ܽ;Ll/ۡ᩵ܿ;Ll/ۢ᩸ܽ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 3

    .line 33
    new-instance v0, Ll/ۙ᩵ᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll/ۤ᩸ܽ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/֫᩹ܽ;->֫:Ll/᩷᩸ܽ;

    .line 45
    iput-object p2, p0, Ll/֫᩹ܽ;->ᩳ:Ll/ۡ᩵ܿ;

    .line 46
    iput-object p3, p0, Ll/֫᩹ܽ;->᩻:Ll/ۢ᩸ܽ;

    .line 47
    iput-object p4, p0, Ll/֫᩹ܽ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    iput-object v0, p0, Ll/֫᩹ܽ;->ۧ:Ll/ۙ᩵ᩴ;

    .line 49
    iput-object v1, p0, Ll/֫᩹ܽ;->ܿ:Ll/᩶۫᩷;

    .line 50
    iput-object v2, p0, Ll/֫᩹ܽ;->ܳ:Ll/ۤ᩸ܽ;

    return-void
.end method

.method public static ֫(Ll/֫᩹ܽ;Ll/ۨܶܽ;Ll/۟᩸ܽ;)V
    .locals 9

    .line 139
    iget-object v0, p0, Ll/֫᩹ܽ;->֫:Ll/᩷᩸ܽ;

    iget-object v0, v0, Ll/᩷᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ᩴ᩸ܽ;

    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫᩹ܽ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, p0, Ll/֫᩹ܽ;->ᩳ:Ll/ۡ᩵ܿ;

    iget-object v0, v0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩵ۛۡ;

    const/4 v1, 0x1

    .line 41
    invoke-virtual {v0, v1}, Ll/᩵ۛۡ;->֫(I)Z

    .line 143
    iget-object p0, p0, Ll/֫᩹ܽ;->᩻:Ll/ۢ᩸ܽ;

    iget-object v0, p0, Ll/ۢ᩸ܽ;->֫:Ll/ᩴ᩸ܽ;

    iget-object v1, p0, Ll/ۢ᩸ܽ;->ۧ:Ljava/io/BufferedOutputStream;

    iget-boolean v2, p0, Ll/ۢ᩸ܽ;->ܽ:Z

    iget-boolean v3, p0, Ll/ۢ᩸ܽ;->ᩳ:Z

    iget-boolean v4, p0, Ll/ۢ᩸ܽ;->ܿ:Z

    iget-boolean v5, p0, Ll/ۢ᩸ܽ;->ܳ:Z

    iget-boolean v6, p0, Ll/ۢ᩸ܽ;->᩻:Z

    move-object v7, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Ll/ᩴ᩸ܽ;->֫(Ll/ᩴ᩸ܽ;Ljava/io/BufferedOutputStream;ZZZZZLl/ۨܶܽ;Ll/۟᩸ܽ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(Ljava/util/ArrayList;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z
    .locals 4

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/֫᩹ܽ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨܶܽ;

    .line 135
    iget-object v3, p0, Ll/֫᩹ܽ;->֫:Ll/᩷᩸ܽ;

    iget-object v3, v3, Ll/᩷᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ᩴ᩸ܽ;

    invoke-virtual {v3}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 138
    :cond_0
    new-instance v2, Ll/ۛ᩸ܽ;

    invoke-direct {v2, p0, v1, p3}, Ll/ۛ᩸ܽ;-><init>(Ll/֫᩹ܽ;Ll/ۨܶܽ;Ll/۟᩸ܽ;)V

    invoke-interface {p2, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 152
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/concurrent/Future;

    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_2

    const/4 v1, 0x0

    .line 156
    :try_start_0
    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_4

    :catch_0
    move-exception v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 173
    instance-of v3, v0, Ljava/lang/Exception;

    if-eqz v3, :cond_3

    check-cast v0, Ljava/lang/Exception;

    goto :goto_3

    .line 176
    :cond_3
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v3

    .line 0
    :cond_4
    :goto_3
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    :catch_1
    :goto_4
    const/4 v0, 0x1

    goto :goto_2

    :catch_2
    move-exception v3

    :cond_6
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_6

    :goto_5
    const/4 p2, 0x1

    goto :goto_2

    :cond_8
    return p2
.end method

.method private ֫(Ljava/util/List;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z
    .locals 8

    .line 79
    iget-object v0, p0, Ll/֫᩹ܽ;->֫:Ll/᩷᩸ܽ;

    iget-object v1, p0, Ll/֫᩹ܽ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 83
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ܶܽ;

    .line 84
    iget-object v7, v0, Ll/᩷᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v7, Ll/ᩴ᩸ܽ;

    invoke-virtual {v7}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_1

    goto :goto_1

    .line 88
    :cond_1
    :try_start_2
    iget-object v7, v6, Ll/᩺ܶܽ;->ۧ:Ll/ܰܶܽ;

    if-eq v7, v5, :cond_3

    if-eqz v2, :cond_2

    .line 90
    invoke-virtual {v5}, Ll/ܰܶܽ;->ۧ()V

    const/4 v2, 0x0

    .line 93
    :cond_2
    iget-object v5, v6, Ll/᩺ܶܽ;->ۧ:Ll/ܰܶܽ;

    .line 94
    invoke-virtual {v5}, Ll/ܰܶܽ;->֫()V

    const/4 v2, 0x1

    .line 97
    :cond_3
    invoke-direct {p0, v6, p2, p3}, Ll/֫᩹ܽ;->֫(Ll/᩺ܶܽ;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z

    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    or-int/2addr v4, v6

    goto :goto_0

    :catch_0
    move-exception v6

    .line 0
    :cond_4
    :try_start_3
    invoke-virtual {v1, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 101
    :goto_0
    iget-object v6, v0, Ll/᩷᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ᩴ᩸ܽ;

    invoke-virtual {v6}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v6, :cond_0

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    .line 107
    invoke-virtual {v5}, Ll/ܰܶܽ;->ۧ()V

    :cond_7
    return v4

    :catchall_0
    move-exception p1

    move-object v3, v5

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_2
    if-eqz v2, :cond_8

    invoke-virtual {v3}, Ll/ܰܶܽ;->ۧ()V

    .line 109
    :cond_8
    throw p1
.end method

.method public static ֫(Ljava/util/concurrent/ExecutorService;)Z
    .locals 4

    .line 181
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v0, 0x0

    .line 184
    :cond_0
    :goto_0
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-interface {p0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    return v0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private ֫(Ll/᩺ܶܽ;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z
    .locals 3

    .line 116
    iget-object v0, p1, Ll/᩺ܶܽ;->ܽ:Ll/ܰܶܽ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 118
    :try_start_0
    iget-object v2, p1, Ll/᩺ܶܽ;->ۧ:Ll/ܰܶܽ;

    if-eq v0, v2, :cond_0

    .line 119
    invoke-virtual {v0}, Ll/ܰܶܽ;->֫()V

    const/4 v1, 0x1

    .line 122
    :cond_0
    iget-object p1, p1, Ll/᩺ܶܽ;->֫:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2, p3}, Ll/֫᩹ܽ;->֫(Ljava/util/ArrayList;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 125
    invoke-virtual {v0}, Ll/ܰܶܽ;->ۧ()V

    :cond_1
    return p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ܰܶܽ;->ۧ()V

    .line 127
    :cond_2
    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)V
    .locals 6

    .line 57
    iget-object v0, p0, Ll/֫᩹ܽ;->ۧ:Ll/ۙ᩵ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v0, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 58
    iget-object v1, p0, Ll/֫᩹ܽ;->ܿ:Ll/᩶۫᩷;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 59
    new-instance v2, Ll/۟᩸ܽ;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iget-object v4, p0, Ll/֫᩹ܽ;->ܳ:Ll/ۤ᩸ܽ;

    iget-object v5, p0, Ll/֫᩹ܽ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1, v3, v5, v4}, Ll/۟᩸ܽ;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۤ᩸ܽ;)V

    .line 62
    :try_start_0
    invoke-direct {p0, p1, v0, v2}, Ll/֫᩹ܽ;->֫(Ljava/util/List;Ljava/util/concurrent/ExecutorService;Ll/۟᩸ܽ;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    invoke-static {v0}, Ll/֫᩹ܽ;->֫(Ljava/util/concurrent/ExecutorService;)Z

    move-result v0

    or-int/2addr p1, v0

    .line 65
    invoke-static {v1}, Ll/֫᩹ܽ;->֫(Ljava/util/concurrent/ExecutorService;)Z

    move-result v0

    or-int/2addr p1, v0

    if-eqz p1, :cond_0

    .line 67
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 70
    :cond_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    if-nez p1, :cond_1

    return-void

    .line 72
    :cond_1
    throw p1

    :catchall_0
    move-exception p1

    .line 64
    invoke-static {v0}, Ll/֫᩹ܽ;->֫(Ljava/util/concurrent/ExecutorService;)Z

    move-result v0

    .line 65
    invoke-static {v1}, Ll/֫᩹ܽ;->֫(Ljava/util/concurrent/ExecutorService;)Z

    move-result v1

    or-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 67
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 69
    :cond_2
    throw p1
.end method
