.class public final Ll/ۚܰ᩵;
.super Ljava/lang/Object;
.source "54FB"


# instance fields
.field public ֫:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ۧ:Ljava/util/ArrayDeque;

.field public final ܽ:Ljava/util/ArrayDeque;

.field public final ᩳ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۚܰ᩵;->ۧ:Ljava/util/ArrayDeque;

    .line 51
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    .line 54
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۚܰ᩵;->ᩳ:Ljava/util/ArrayDeque;

    return-void
.end method

.method private ֫(Ljava/util/ArrayDeque;Ljava/lang/Object;)V
    .locals 1

    move-object v0, p0

    .line 219
    monitor-enter v0

    .line 220
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 222
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    invoke-direct {p0}, Ll/ۚܰ᩵;->ܽ()V

    return-void

    .line 220
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Call wasn\'t in-flight!"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 222
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ܽ()V
    .locals 8

    .line 168
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    .line 170
    monitor-enter v0

    .line 171
    :try_start_0
    iget-object v2, p0, Ll/ۚܰ᩵;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    .line 172
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ۟᩵;

    .line 174
    iget-object v5, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->size()I

    move-result v5

    const/16 v6, 0x40

    if-lt v5, v6, :cond_0

    goto :goto_2

    .line 195
    :cond_0
    iget-object v5, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜ۟᩵;

    .line 172
    iget-object v6, v6, Ll/ۜ۟᩵;->᩶:Ll/᩷۟᩵;

    .line 164
    iget-object v6, v6, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    .line 49
    iget-object v6, v6, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 486
    iget-object v6, v6, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    .line 164
    iget-object v7, v3, Ll/ۜ۟᩵;->᩶:Ll/᩷۟᩵;

    iget-object v7, v7, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    .line 49
    iget-object v7, v7, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 486
    iget-object v7, v7, Ll/ۨܰ᩵;->ۧ:Ljava/lang/String;

    .line 197
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x5

    if-lt v4, v5, :cond_3

    goto :goto_0

    .line 177
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 178
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    iget-object v4, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 181
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ll/ۚܰ᩵;->ۧ()I

    .line 182
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v4, v0, :cond_5

    .line 185
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ۟᩵;

    .line 186
    invoke-virtual {p0}, Ll/ۚܰ᩵;->֫()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۜ۟᩵;->֫(Ljava/util/concurrent/ExecutorService;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    return-void

    :catchall_0
    move-exception v1

    .line 182
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized ֫()Ljava/util/concurrent/ExecutorService;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 64
    :try_start_0
    iget-object v1, p0, Ll/ۚܰ᩵;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v1, :cond_0

    .line 65
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v8}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v2, "OkHttp Dispatcher"

    const/4 v3, 0x0

    .line 66
    invoke-static {v2, v3}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v9

    const/4 v3, 0x0

    const v4, 0x7fffffff

    const-wide/16 v5, 0x3c

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Ll/ۚܰ᩵;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 68
    :cond_0
    iget-object v1, p0, Ll/ۚܰ᩵;->֫:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۜ۟᩵;)V
    .locals 2

    move-object v0, p0

    .line 134
    monitor-enter v0

    .line 135
    :try_start_0
    iget-object v1, p0, Ll/ۚܰ᩵;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    invoke-direct {p0}, Ll/ۚܰ᩵;->ܽ()V

    return-void

    :catchall_0
    move-exception p1

    .line 136
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩷۟᩵;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 204
    :try_start_0
    iget-object v1, p0, Ll/ۚܰ᩵;->ᩳ:Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
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

.method public final declared-synchronized ۧ()I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 255
    :try_start_0
    iget-object v1, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    iget-object v2, p0, Ll/ۚܰ᩵;->ᩳ:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v1, v2

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ۜ۟᩵;)V
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ۚܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-direct {p0, v0, p1}, Ll/ۚܰ᩵;->֫(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/᩷۟᩵;)V
    .locals 1

    .line 214
    iget-object v0, p0, Ll/ۚܰ᩵;->ᩳ:Ljava/util/ArrayDeque;

    invoke-direct {p0, v0, p1}, Ll/ۚܰ᩵;->֫(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    return-void
.end method
