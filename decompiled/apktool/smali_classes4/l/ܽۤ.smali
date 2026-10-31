.class public final Ll/ܽۤ;
.super Ljava/lang/Object;
.source "2B21"


# static fields
.field public static final ֫:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final ۧ:Ljava/lang/Object;

.field public static final ܽ:Ll/ۗ᩵;

.field public static final ᩳ:Ll/֨᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 58
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ܽۤ;->ᩳ:Ll/֨᩵;

    .line 82
    new-instance v9, Ll/᩷ۤ;

    .line 164
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v1, 0x2710

    int-to-long v5, v1

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x1

    .line 93
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 61
    sput-object v0, Ll/ܽۤ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 68
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽۤ;->ۧ:Ljava/lang/Object;

    .line 72
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    sput-object v0, Ll/ܽۤ;->ܽ:Ll/ۗ᩵;

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ll/ۨ۫;ILl/ܶ۫;)Landroid/graphics/Typeface;
    .locals 5

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۨ۫;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 165
    sget-object v0, Ll/ܽۤ;->ᩳ:Ll/֨᩵;

    invoke-virtual {v0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    .line 167
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, v0}, Ll/ۧۤ;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p3, p0}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    return-object v0

    .line 171
    :cond_0
    new-instance v2, Ll/ܰ۫;

    invoke-direct {v2, p3}, Ll/ܰ۫;-><init>(Ll/ܶ۫;)V

    .line 181
    sget-object p3, Ll/ܽۤ;->ۧ:Ljava/lang/Object;

    move-object v0, p3

    monitor-enter v0

    .line 182
    :try_start_0
    sget-object p3, Ll/ܽۤ;->ܽ:Ll/ۗ᩵;

    const/4 v3, 0x0

    .line 369
    invoke-virtual {p3, v1, v3}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 182
    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_1

    .line 186
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    monitor-exit v0

    return-object v3

    .line 189
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 190
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    invoke-virtual {p3, v1, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    new-instance p3, Ll/۟۫;

    invoke-direct {p3, v1, p0, p1, p2}, Ll/۟۫;-><init>(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)V

    .line 204
    sget-object p0, Ll/ܽۤ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 206
    new-instance p1, Ll/֫ۤ;

    invoke-direct {p1, v1}, Ll/֫ۤ;-><init>(Ljava/lang/String;)V

    .line 36
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-nez p2, :cond_2

    .line 37
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    .line 39
    :cond_2
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 57
    :goto_0
    new-instance v0, Ll/ۡۤ;

    invoke-direct {v0, p2, p3, p1}, Ll/ۡۤ;-><init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;Ll/۬ۤ;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v3

    :catchall_0
    move-exception p0

    .line 192
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Landroid/content/Context;Ll/ۨ۫;Ll/ܶ۫;II)Landroid/graphics/Typeface;
    .locals 2

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۨ۫;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 103
    sget-object v1, Ll/ܽۤ;->ᩳ:Ll/֨᩵;

    invoke-virtual {v1, v0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    .line 105
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, v1}, Ll/ۧۤ;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p2, p0}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    .line 112
    invoke-static {v0, p0, p1, p3}, Ll/ܽۤ;->֫(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)Ll/ۧۤ;

    move-result-object p0

    .line 113
    invoke-virtual {p2, p0}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    .line 114
    iget-object p0, p0, Ll/ۧۤ;->ۧ:Landroid/graphics/Typeface;

    return-object p0

    .line 117
    :cond_1
    new-instance v1, Ll/᩺۫;

    invoke-direct {v1, v0, p0, p1, p3}, Ll/᩺۫;-><init>(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)V

    .line 125
    :try_start_0
    sget-object p0, Ll/ܽۤ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 65
    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long p3, p4

    .line 67
    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, p3, p4, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    :try_start_2
    check-cast p0, Ll/ۧۤ;

    .line 130
    invoke-virtual {p2, p0}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    .line 131
    iget-object p0, p0, Ll/ۧۤ;->ۧ:Landroid/graphics/Typeface;

    return-object p0

    .line 73
    :catch_0
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "timeout"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_1
    move-exception p0

    .line 71
    throw p0

    :catch_2
    move-exception p0

    .line 69
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 133
    :catch_3
    new-instance p0, Ll/ۧۤ;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, Ll/ۧۤ;-><init>(I)V

    invoke-virtual {p2, p0}, Ll/ܶ۫;->֫(Ll/ۧۤ;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Landroid/content/Context;Ll/ۨ۫;I)Ll/ۧۤ;
    .locals 6

    .line 238
    sget-object v0, Ll/ܽۤ;->ᩳ:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    .line 240
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, v1}, Ll/ۧۤ;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    .line 245
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Ll/ۛ۫;->֫(Landroid/content/Context;Ll/ۨ۫;)Ll/ᩳۤ;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    invoke-virtual {p2}, Ll/ᩳۤ;->ۧ()I

    move-result v1

    const/4 v2, -0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    .line 270
    invoke-virtual {p2}, Ll/ᩳۤ;->ۧ()I

    move-result v1

    if-eq v1, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, -0x2

    goto :goto_2

    .line 277
    :cond_2
    invoke-virtual {p2}, Ll/ᩳۤ;->֫()[Ll/ܿۤ;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 278
    array-length v4, v1

    if-nez v4, :cond_3

    goto :goto_2

    .line 282
    :cond_3
    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v1, v4

    .line 285
    invoke-virtual {v5}, Ll/ܿۤ;->֫()I

    move-result v5

    if-eqz v5, :cond_5

    if-gez v5, :cond_4

    :goto_1
    const/4 v3, -0x3

    goto :goto_2

    :cond_4
    move v3, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    const/4 v3, 0x0

    :cond_7
    :goto_2
    if-eqz v3, :cond_8

    .line 252
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, v3}, Ll/ۧۤ;-><init>(I)V

    return-object p0

    .line 256
    :cond_8
    invoke-virtual {p2}, Ll/ᩳۤ;->֫()[Ll/ܿۤ;

    move-result-object p2

    .line 255
    invoke-static {p1, p2, p3}, Ll/ۜ۬;->֫(Landroid/content/Context;[Ll/ܿۤ;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 259
    invoke-virtual {v0, p0, p1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, p1}, Ll/ۧۤ;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    .line 262
    :cond_9
    new-instance p0, Ll/ۧۤ;

    invoke-direct {p0, v2}, Ll/ۧۤ;-><init>(I)V

    return-object p0

    .line 247
    :catch_0
    new-instance p0, Ll/ۧۤ;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Ll/ۧۤ;-><init>(I)V

    return-object p0
.end method
