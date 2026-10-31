.class public final Ll/ۡܰ᩵;
.super Ljava/lang/Object;
.source "54FG"


# static fields
.field public static final ᩻:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public final ֫:Ljava/lang/Runnable;

.field public ۧ:Z

.field public final ܳ:Ll/ۡ᩵֡;

.field public final ܽ:Ljava/util/ArrayDeque;

.field public final ܿ:I

.field public final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 50
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v0, "OkHttp ConnectionPool"

    const/4 v1, 0x1

    .line 52
    invoke-static {v0, v1}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, Ll/ۡܰ᩵;->᩻:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 86
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v1, Ll/ۢܰ᩵;

    invoke-direct {v1, p0}, Ll/ۢܰ᩵;-><init>(Ll/ۡܰ᩵;)V

    iput-object v1, p0, Ll/ۡܰ᩵;->֫:Ljava/lang/Runnable;

    .line 76
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    .line 77
    new-instance v1, Ll/ۡ᩵֡;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۡ᩵֡;-><init>(I)V

    iput-object v1, p0, Ll/ۡܰ᩵;->ܳ:Ll/ۡ᩵֡;

    const/4 v1, 0x5

    .line 90
    iput v1, p0, Ll/ۡܰ᩵;->ܿ:I

    const-wide/16 v1, 0x5

    .line 91
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡܰ᩵;->ᩳ:J

    return-void
.end method

.method private ֫(Ll/᩻֫֡;J)I
    .locals 6

    .line 257
    iget-object v0, p1, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 258
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 259
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    .line 261
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 267
    :cond_1
    check-cast v3, Ll/ۡ֫֡;

    .line 269
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "A connection to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩻֫֡;->ᩳ()Ll/ۚ۟᩵;

    move-result-object v5

    .line 58
    iget-object v5, v5, Ll/ۚ۟᩵;->֫:Ll/ۙ᩺᩵;

    .line 93
    iget-object v5, v5, Ll/ۙ᩺᩵;->ۡ:Ll/ۨܰ᩵;

    .line 269
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 271
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v5

    iget-object v3, v3, Ll/ۡ֫֡;->֫:Ljava/lang/Object;

    invoke-virtual {v5, v3, v4}, Ll/ᩴܽ֡;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x1

    .line 274
    iput-boolean v3, p1, Ll/᩻֫֡;->ۜ:Z

    .line 277
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 278
    iget-wide v2, p0, Ll/ۡܰ᩵;->ᩳ:J

    sub-long/2addr p2, v2

    iput-wide p2, p1, Ll/᩻֫֡;->᩻:J

    return v1

    .line 283
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final ֫(J)J
    .locals 12

    move-object v0, p0

    .line 206
    monitor-enter v0

    .line 207
    :try_start_0
    iget-object v1, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩻֫֡;

    .line 211
    invoke-direct {p0, v8, p1, p2}, Ll/ۡܰ᩵;->֫(Ll/᩻֫֡;J)I

    move-result v9

    if-lez v9, :cond_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 219
    iget-wide v9, v8, Ll/᩻֫֡;->᩻:J

    sub-long v9, p1, v9

    cmp-long v11, v9, v4

    if-lez v11, :cond_0

    move-object v3, v8

    move-wide v4, v9

    goto :goto_0

    .line 226
    :cond_2
    iget-wide p1, p0, Ll/ۡܰ᩵;->ᩳ:J

    cmp-long v1, v4, p1

    if-gez v1, :cond_6

    iget v1, p0, Ll/ۡܰ᩵;->ܿ:I

    if-le v6, v1, :cond_3

    goto :goto_1

    :cond_3
    if-lez v6, :cond_4

    sub-long/2addr p1, v4

    .line 233
    monitor-exit v0

    return-wide p1

    :cond_4
    if-lez v7, :cond_5

    .line 236
    monitor-exit v0

    return-wide p1

    .line 239
    :cond_5
    iput-boolean v2, p0, Ll/ۡܰ᩵;->ۧ:Z

    const-wide/16 p1, -0x1

    .line 240
    monitor-exit v0

    return-wide p1

    .line 230
    :cond_6
    :goto_1
    iget-object p1, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 242
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    invoke-virtual {v3}, Ll/᩻֫֡;->ܿ()Ljava/net/Socket;

    move-result-object p1

    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    const-wide/16 p1, 0x0

    return-wide p1

    :catchall_0
    move-exception p1

    .line 242
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۙ᩺᩵;Ll/ܺ֫֡;)Ljava/net/Socket;
    .locals 3

    .line 139
    iget-object v0, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֫֡;

    .line 140
    invoke-virtual {v1, p1, v2}, Ll/᩻֫֡;->֫(Ll/ۙ᩺᩵;Ll/ۚ۟᩵;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 141
    invoke-virtual {v1}, Ll/᩻֫֡;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    invoke-virtual {p2}, Ll/ܺ֫֡;->ܽ()Ll/᩻֫֡;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 143
    invoke-virtual {p2, v1}, Ll/ܺ֫֡;->֫(Ll/᩻֫֡;)Ljava/net/Socket;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final ֫(Ll/ۙ᩺᩵;Ll/ܺ֫֡;Ll/ۚ۟᩵;)Ll/᩻֫֡;
    .locals 3

    .line 124
    iget-object v0, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֫֡;

    .line 125
    invoke-virtual {v1, p1, p3}, Ll/᩻֫֡;->֫(Ll/ۙ᩺᩵;Ll/ۚ۟᩵;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    .line 126
    invoke-virtual {p2, v1, p1}, Ll/ܺ֫֡;->֫(Ll/᩻֫֡;Z)V

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩻֫֡;)Z
    .locals 1

    .line 164
    iget-boolean v0, p1, Ll/᩻֫֡;->ۜ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۡܰ᩵;->ܿ:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    const/4 p1, 0x0

    return p1

    .line 165
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/᩻֫֡;)V
    .locals 2

    .line 151
    iget-boolean v0, p0, Ll/ۡܰ᩵;->ۧ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 152
    iput-boolean v0, p0, Ll/ۡܰ᩵;->ۧ:Z

    .line 153
    sget-object v0, Ll/ۡܰ᩵;->᩻:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Ll/ۡܰ᩵;->֫:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 155
    :cond_0
    iget-object v0, p0, Ll/ۡܰ᩵;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method
