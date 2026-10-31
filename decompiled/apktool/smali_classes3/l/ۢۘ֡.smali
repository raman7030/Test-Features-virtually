.class public final Ll/ۢۘ֡;
.super Ljava/lang/Object;
.source "SAHW"


# static fields
.field public static ֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 126
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۢۘ֡;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ֫()Ljava/util/HashMap;
    .locals 1

    .line 49
    sget-object v0, Ll/ۢۘ֡;->ۧ:Ljava/util/HashMap;

    return-object v0
.end method

.method public static ֫(Ll/᩺ۖ֡;)V
    .locals 4

    .line 170
    sget-object v0, Ll/ۢۘ֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 171
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_0

    .line 172
    sget-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 173
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static declared-synchronized ֫(Ll/᩺ۖ֡;Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;)V
    .locals 11

    .line 2
    const-class v0, Ll/ۢۘ֡;

    .line 3
    monitor-enter v0

    .line 192
    :try_start_0
    sget-object v1, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez v1, :cond_0

    .line 193
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Ll/᩻ۘ֡;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩻ۘ֡;-><init>(I)V

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v1, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 194
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 195
    sget-object v4, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v5, Ll/ۜۘ֡;

    .line 73
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 195
    invoke-virtual {p1}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v6

    invoke-virtual {p2}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v8

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v4 .. v10}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 197
    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 198
    new-instance v9, Ll/᩷ۘ֡;

    invoke-direct {v9, v1}, Ll/᩷ۘ֡;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 199
    sget-object v2, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p1}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v4

    .line 200
    invoke-virtual {p2}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v6

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v3, v9

    .line 199
    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    .line 201
    invoke-virtual {p0, p1}, Ll/᩺ۖ֡;->֫(Ljava/util/concurrent/ScheduledFuture;)V

    .line 202
    sget-object p0, Ll/ۢۘ֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ll/᩺ۖ֡;Ll/ۖ᩹ᩴ;Z)V
    .locals 2

    .line 2
    const-class v0, Ll/ۢۘ֡;

    .line 3
    monitor-enter v0

    if-eqz p0, :cond_0

    .line 140
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۖ֡;->֫()V

    .line 141
    invoke-static {p0}, Ll/ۢۘ֡;->֫(Ll/᩺ۖ֡;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    if-nez p2, :cond_1

    .line 143
    sget-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz p0, :cond_1

    sget-object p0, Ll/ۢۘ֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 144
    sget-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :try_start_1
    sget-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p1}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, p1, p2, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    :catch_0
    :try_start_2
    sget-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    const/4 p0, 0x0

    .line 152
    sput-object p0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_2

    .line 143
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 154
    :cond_1
    :goto_2
    monitor-exit v0

    return-void
.end method

.method public static synthetic ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    .line 49
    sget-object v0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object v0
.end method

.method public static synthetic ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    sput-object v0, Ll/ۢۘ֡;->֫:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EvictionTimer []"

    return-object v0
.end method
