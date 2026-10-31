.class public final Ll/֫ۨۡ;
.super Ljava/lang/Object;
.source "PB32"


# static fields
.field public static final ֫:Ljava/util/concurrent/ExecutorService;

.field public static final ۧ:Ljava/util/concurrent/ExecutorService;

.field public static final ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static ܿ:Landroid/os/Handler;

.field public static final ᩳ:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 23
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    const/16 v0, 0x40

    .line 24
    invoke-static {v0}, Ll/֫ۨۡ;->֫(I)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 39
    sget v0, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 25
    sput-object v0, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    .line 29
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/۟ۛۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۟ۛۡ;-><init>(I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string v1, "Custom-Looper"

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ֫(Ljava/util/concurrent/ExecutorService;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 2

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Callable;

    .line 88
    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(I)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 8

    .line 43
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v3, 0xa

    move-object v0, v7

    move v1, p0

    move v2, p0

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    const/4 p0, 0x1

    .line 44
    invoke-virtual {v7, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    return-object v7
.end method

.method public static synthetic ֫()V
    .locals 2

    .line 30
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 31
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/֫ۨۡ;->ܿ:Landroid/os/Handler;

    .line 32
    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;JLjava/lang/Runnable;)V
    .locals 3

    .line 80
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v0

    .line 81
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 82
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    add-long/2addr v1, p1

    invoke-virtual {v0, p3, p0, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public static ֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V
    .locals 3

    .line 74
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v0

    .line 75
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-virtual {v0, p0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public static ֫(Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .line 49
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 52
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-interface {p0, v1, v2, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۧ()Landroid/os/Handler;
    .locals 1

    .line 59
    :goto_0
    sget-object v0, Ll/֫ۨۡ;->ܿ:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 60
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    return-object v0
.end method
