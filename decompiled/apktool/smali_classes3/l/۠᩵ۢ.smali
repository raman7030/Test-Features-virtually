.class public final Ll/۠᩵ۢ;
.super Ljava/lang/Object;
.source "Y7CF"


# static fields
.field public static final ܽ:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final ᩳ:Ll/۠᩵ۢ;


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ll/᩵᩵ۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Ll/۠᩵ۢ;->ܽ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 39
    new-instance v0, Ll/۠᩵ۢ;

    invoke-direct {v0}, Ll/۠᩵ۢ;-><init>()V

    sput-object v0, Ll/۠᩵ۢ;->ᩳ:Ll/۠᩵ۢ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/۠᩵ۢ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 42
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method

.method public static synthetic ֫(Ll/۠᩵ۢ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    .line 148
    invoke-direct {p0, p1, p2}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 333
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩹۬ܳ;)Ljava/util/LinkedHashMap;
    .locals 3

    if-eqz p0, :cond_1

    .line 454
    invoke-virtual {p0}, Ll/᩹۬ܳ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 457
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 458
    invoke-virtual {p0}, Ll/᩹۬ܳ;->֫()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "size"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    invoke-virtual {p0}, Ll/᩹۬ܳ;->ۧ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v1, "time"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/List;
    .locals 6

    if-eqz p0, :cond_5

    .line 350
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 353
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 354
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    const-string v2, "from"

    .line 355
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "to"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 358
    :cond_2
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 359
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v4, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 363
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    :cond_4
    return-object v0

    .line 351
    :cond_5
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method public static ֫()Ll/۠᩵ۢ;
    .locals 1

    .line 48
    sget-object v0, Ll/۠᩵ۢ;->ᩳ:Ll/۠᩵ۢ;

    return-object v0
.end method

.method public static ֫(Ll/֨᩵ۢ;Z)V
    .locals 3

    .line 296
    invoke-static {p0}, Ll/֨᩵ۢ;->ܿ(Ll/֨᩵ۢ;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 297
    invoke-static {p0}, Ll/֨᩵ۢ;->ܿ(Ll/֨᩵ۢ;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    .line 298
    invoke-static {p0, v0}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ljava/util/concurrent/ScheduledFuture;)V

    :cond_0
    const-string v0, ""

    .line 300
    invoke-static {p0, v0}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 301
    invoke-static {p0, v0}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 302
    sget-object v2, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    invoke-static {p0, v2}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Ll/᩹۬ܳ;)V

    .line 303
    invoke-static {p0, v2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/᩹۬ܳ;)V

    .line 304
    invoke-static {p0, v0}, Ll/֨᩵ۢ;->ܽ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 305
    invoke-static {p0, v1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Z)V

    .line 306
    invoke-static {p0, v1}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    .line 307
    invoke-static {p0}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    const-string p1, "waiting_conflict"

    invoke-static {p0}, Ll/֨᩵ۢ;->ۡ(Ll/֨᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "running"

    .line 308
    invoke-static {p0, p1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 257
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    move-object v0, p1

    .line 264
    monitor-enter v0

    .line 265
    :try_start_0
    invoke-static {p1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 266
    monitor-exit v0

    return v2

    .line 268
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 269
    monitor-exit v0

    return v2

    .line 271
    :cond_2
    invoke-static {p1}, Ll/֨᩵ۢ;->ܺ(Ll/֨᩵ۢ;)V

    .line 272
    invoke-static {p1}, Ll/֨᩵ۢ;->ۢ(Ll/֨᩵ۢ;)Ll/ۘ۠ۢ;

    move-result-object v1

    .line 273
    invoke-static {p1}, Ll/֨᩵ۢ;->᩷(Ll/֨᩵ۢ;)I

    move-result v3

    .line 274
    invoke-static {p1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;)Ll/ᩴܽ᩻;

    move-result-object v4

    .line 275
    invoke-static {p1, v2}, Ll/۠᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    const-string v5, "running"

    .line 276
    invoke-static {p1, v5}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 277
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_3

    .line 279
    invoke-virtual {v4, p2}, Ll/ᩴܽ᩻;->ܽ(Ljava/lang/String;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 288
    invoke-virtual {v1}, Ll/ۘ۠ۢ;->cancel()V

    return v2

    .line 285
    :cond_4
    invoke-static {v3}, Ll/ܶ۠ۢ;->֫(I)Ll/ۘ۠ۢ;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 288
    invoke-virtual {p1}, Ll/ۘ۠ۢ;->cancel()V

    :cond_5
    return v2

    :catchall_0
    move-exception p1

    .line 277
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static synthetic ֫(Ll/۠᩵ۢ;JLjava/util/Map$Entry;)Z
    .locals 4

    .line 318
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֨᩵ۢ;

    move-object v0, p0

    .line 319
    monitor-enter v0

    .line 320
    :try_start_0
    invoke-static {p0}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result p3

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-static {p0}, Ll/֨᩵ۢ;->ۜ(Ll/֨᩵ۢ;)J

    move-result-wide v2

    sub-long/2addr p1, v2

    const-wide/32 v2, 0x493e0

    cmp-long p3, p1, v2

    if-lez p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 322
    invoke-static {p0, v1}, Ll/۠᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    .line 324
    :cond_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p0

    .line 325
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 316
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 317
    iget-object v2, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v3

    new-instance v4, Ll/ۚ᩵ۢ;

    invoke-direct {v4, p0, v0, v1}, Ll/ۚ᩵ۢ;-><init>(Ll/۠᩵ۢ;J)V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ft-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۠᩵ۢ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 60
    new-instance v1, Ll/֨᩵ۢ;

    invoke-direct {v1, v0, p1}, Ll/֨᩵ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨᩵ۢ;

    if-nez p2, :cond_0

    return-void

    :cond_0
    move-object v0, p2

    .line 72
    monitor-enter v0

    .line 73
    :try_start_0
    invoke-static {p2, p1}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;I)V

    .line 74
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩶ܶۢ;)V
    .locals 3

    .line 103
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    if-nez p1, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    .line 107
    monitor-enter v0

    .line 108
    :try_start_0
    invoke-static {p1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 109
    monitor-exit v0

    return-void

    .line 111
    :cond_1
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ᩴ֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ۜ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ܿ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 113
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ۢ֫()I

    move-result v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;I)V

    .line 114
    invoke-virtual {p2}, Ll/᩶ܶۢ;->۫֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 115
    invoke-virtual {p2}, Ll/᩶ܶۢ;->ۤ֫()J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;J)V

    .line 116
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ܿ۠ۢ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 195
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    if-nez p1, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    .line 199
    monitor-enter v0

    const/4 v1, 0x0

    .line 200
    :try_start_0
    invoke-static {p1, v1}, Ll/۠᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    .line 201
    invoke-static {p1}, Ll/֨᩵ۢ;->ۖ(Ll/֨᩵ۢ;)V

    .line 202
    invoke-virtual {p3}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "success"

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Ll/ܿ۠ۢ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "cancelled"

    goto :goto_0

    :cond_2
    const-string v1, "failure"

    :goto_0
    invoke-static {p1, v1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 203
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ᩴ֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ۜ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ܿ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 205
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->ۢ֫()I

    move-result v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;I)V

    .line 206
    invoke-virtual {p2}, Ll/᩶ܶۢ;->۫֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 207
    invoke-virtual {p2}, Ll/᩶ܶۢ;->ۤ֫()J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;J)V

    .line 208
    invoke-virtual {p3}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Ll/ܿ۠ۢ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    const-string p2, ""

    :goto_1
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->ᩳ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 340
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 341
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_2

    .line 343
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 209
    :goto_2
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->ᩳ(Ll/֨᩵ۢ;Ljava/util/List;)V

    .line 340
    invoke-virtual {p5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 341
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_3

    .line 343
    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 210
    :goto_3
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ljava/util/List;)V

    .line 211
    invoke-static {p6}, Ll/۠᩵ۢ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Ll/֨᩵ۢ;->ܽ(Ll/֨᩵ۢ;Ljava/util/List;)V

    if-eqz p7, :cond_7

    .line 340
    invoke-interface {p7}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_4

    .line 343
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_5

    .line 341
    :cond_7
    :goto_4
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 212
    :goto_5
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Ljava/util/List;)V

    .line 213
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    invoke-static {p1, p2, p3}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;J)V

    const/4 p2, 0x0

    .line 214
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/᩶ܶۢ;)V

    .line 215
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/ᩴܽ᩻;)V

    .line 216
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩶ܶۢ;Ll/ᩴܽ᩻;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 86
    monitor-enter v0

    .line 87
    :try_start_0
    invoke-static {p1, p2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/᩶ܶۢ;)V

    .line 88
    invoke-static {p1, p3}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/ᩴܽ᩻;)V

    .line 89
    invoke-static {p1}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;)Z

    move-result p1

    .line 90
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    if-eqz p3, :cond_1

    const/4 p1, 0x0

    .line 93
    invoke-virtual {p3, p1}, Ll/ᩴܽ᩻;->ܽ(Ljava/lang/String;)V

    .line 288
    :cond_1
    invoke-virtual {p2}, Ll/ۘ۠ۢ;->cancel()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    .line 90
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Ll/ᩴܽ᩻;Z)Z
    .locals 5

    .line 125
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/֨᩵ۢ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    move-object v0, v1

    .line 129
    monitor-enter v0

    .line 130
    :try_start_0
    invoke-static {v1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 133
    :cond_1
    invoke-static {v1, p6}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/ᩴܽ᩻;)V

    const/4 v3, 0x1

    .line 134
    invoke-static {v1, v3}, Ll/۠᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    const-string v4, "waiting_conflict"

    .line 135
    invoke-static {v1, v4}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 136
    invoke-static {v1, p2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 137
    invoke-static {p3}, Ll/۠᩵ۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 138
    invoke-static {v1, p4}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Ll/᩹۬ܳ;)V

    .line 139
    invoke-static {v1, p5}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ll/᩹۬ܳ;)V

    .line 140
    invoke-virtual {p6}, Ll/ᩴܽ᩻;->ܿ()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Ll/֨᩵ۢ;->ܽ(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 142
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p7, :cond_2

    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    .line 143
    :goto_0
    invoke-static {v1, p3}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;Z)V

    if-eqz p3, :cond_3

    const-string p3, "replace"

    .line 144
    invoke-static {v1}, Ll/֨᩵ۢ;->ܽ(Ll/֨᩵ۢ;)Ljava/lang/String;

    move-result-object p4

    .line 145
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 146
    invoke-virtual {p6}, Ll/ᩴܽ᩻;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-static {v1, v2}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    .line 147
    sget-object p3, Ll/۠᩵ۢ;->ܽ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p4, Ll/֡᩵ۢ;

    invoke-direct {p4, p0, p1, p2}, Ll/֡᩵ۢ;-><init>(Ll/۠᩵ۢ;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 p5, 0x493e0

    invoke-interface {p3, p4, p5, p6, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-static {v1, p1}, Ll/֨᩵ۢ;->֫(Ll/֨᩵ۢ;Ljava/util/concurrent/ScheduledFuture;)V

    .line 152
    monitor-exit v0

    return v3

    .line 131
    :cond_4
    :goto_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 153
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z
    .locals 4

    .line 160
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    .line 166
    monitor-enter v0

    .line 167
    :try_start_0
    invoke-static {p1}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;)Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p1}, Ll/֨᩵ۢ;->ۧ(Ll/֨᩵ۢ;)Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-static {v2, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;)Ll/ᩴܽ᩻;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {p1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;)Ll/ᩴܽ᩻;

    move-result-object v2

    .line 171
    invoke-virtual {v2, p2}, Ll/ᩴܽ᩻;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 174
    :cond_1
    invoke-static {p1}, Ll/֨᩵ۢ;->ܳ(Ll/֨᩵ۢ;)Ll/ᩴܽ᩻;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz p5, :cond_2

    .line 176
    invoke-static {p1}, Ll/֨᩵ۢ;->ᩳ(Ll/֨᩵ۢ;)Z

    move-result p5

    if-eqz p5, :cond_2

    const/4 v1, 0x1

    .line 177
    :cond_2
    invoke-static {p1, v3}, Ll/۠᩵ۢ;->֫(Ll/֨᩵ۢ;Z)V

    const-string p5, "running"

    .line 178
    invoke-static {p1, p5}, Ll/֨᩵ۢ;->᩻(Ll/֨᩵ۢ;Ljava/lang/String;)V

    .line 179
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    invoke-virtual {v2, p2, p3, p4, v1}, Ll/ᩴܽ᩻;->֫(Ljava/lang/String;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1

    .line 172
    :cond_3
    :goto_0
    :try_start_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 179
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 316
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 317
    iget-object v2, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v2

    new-instance v3, Ll/ۚ᩵ۢ;

    invoke-direct {v3, p0, v0, v1}, Ll/ۚ᩵ۢ;-><init>(Ll/۠᩵ۢ;J)V

    invoke-static {v2, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 232
    iget-object v0, p0, Ll/۠᩵ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩵ۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    move-object v0, p1

    .line 236
    monitor-enter v0

    .line 237
    :try_start_0
    invoke-static {p1}, Ll/֨᩵ۢ;->ۘ(Ll/֨᩵ۢ;)Ljava/util/LinkedHashMap;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 238
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 223
    invoke-direct {p0, p1, v0}, Ll/۠᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
