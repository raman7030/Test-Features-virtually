.class public Ll/ۙܽ֡;
.super Ll/ܶᩳ֡;
.source "H4EU"


# static fields
.field public static final ۜ:J

.field public static ۢ:Ll/ۙܽ֡;

.field public static final ᩷:J


# instance fields
.field public ܳ:Ll/ۙܽ֡;

.field public ܿ:Z

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 50
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۙܽ֡;->ۜ:J

    .line 51
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۙܽ֡;->᩷:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۢ()Ll/ۙܽ֡;
    .locals 9

    .line 342
    sget-object v0, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    iget-object v0, v0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    .line 345
    const-class v1, Ll/ۙܽ֡;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 346
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 347
    sget-wide v5, Ll/ۙܽ֡;->ۜ:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 348
    sget-object v0, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    iget-object v0, v0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, v3

    sget-wide v3, Ll/ۙܽ֡;->᩷:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    .line 349
    sget-object v0, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    return-object v0

    :cond_0
    return-object v2

    .line 353
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 145
    iget-wide v5, v0, Ll/ۙܽ֡;->᩻:J

    sub-long/2addr v5, v3

    const-wide/16 v3, 0x0

    cmp-long v7, v5, v3

    if-lez v7, :cond_2

    const-wide/32 v3, 0xf4240

    .line 359
    div-long v7, v5, v3

    mul-long v3, v3, v7

    sub-long/2addr v5, v3

    long-to-int v0, v5

    .line 361
    invoke-virtual {v1, v7, v8, v0}, Ljava/lang/Object;->wait(JI)V

    return-object v2

    .line 366
    :cond_2
    sget-object v1, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    iget-object v3, v0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    iput-object v3, v1, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    .line 367
    iput-object v2, v0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 294
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 296
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final ֫(Z)V
    .locals 1

    .line 274
    invoke-virtual {p0}, Ll/ۙܽ֡;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 275
    invoke-virtual {p0, p1}, Ll/ۙܽ֡;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۜ()Z
    .locals 4

    .line 120
    iget-boolean v0, p0, Ll/ۙܽ֡;->ܿ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 121
    :cond_0
    iput-boolean v1, p0, Ll/ۙܽ֡;->ܿ:Z

    .line 0
    const-class v0, Ll/ۙܽ֡;

    monitor-enter v0

    .line 128
    :try_start_0
    sget-object v2, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    :goto_0
    if-eqz v2, :cond_2

    .line 129
    iget-object v3, v2, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    if-ne v3, p0, :cond_1

    .line 130
    iget-object v3, p0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    iput-object v3, v2, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    const/4 v2, 0x0

    .line 131
    iput-object v2, p0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    monitor-exit v0

    return v1

    :cond_1
    move-object v2, v3

    goto :goto_0

    .line 137
    :cond_2
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public ᩷()V
    .locals 0

    return-void
.end method

.method public final ᩻()V
    .locals 10

    .line 73
    iget-boolean v0, p0, Ll/ۙܽ֡;->ܿ:Z

    if-nez v0, :cond_8

    .line 74
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܳ()J

    move-result-wide v1

    .line 75
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ᩳ()Z

    move-result v3

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    if-nez v3, :cond_0

    return-void

    :cond_0
    const/4 v4, 0x1

    .line 79
    iput-boolean v4, p0, Ll/ۙܽ֡;->ܿ:Z

    .line 0
    const-class v0, Ll/ۙܽ֡;

    monitor-enter v0

    .line 86
    :try_start_0
    sget-object v5, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    if-nez v5, :cond_1

    .line 87
    new-instance v5, Ll/ۙܽ֡;

    invoke-direct {v5}, Ll/ۙܽ֡;-><init>()V

    sput-object v5, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    .line 88
    new-instance v5, Ll/᩶ܽ֡;

    const-string v7, "Okio Watchdog"

    .line 303
    invoke-direct {v5, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v5, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 88
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 91
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    if-eqz v6, :cond_2

    if-eqz v3, :cond_2

    .line 95
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v6

    sub-long/2addr v6, v4

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    add-long/2addr v1, v4

    iput-wide v1, p0, Ll/ۙܽ֡;->᩻:J

    goto :goto_0

    :cond_2
    if-eqz v6, :cond_3

    add-long/2addr v1, v4

    .line 97
    iput-wide v1, p0, Ll/ۙܽ֡;->᩻:J

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_7

    .line 99
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۙܽ֡;->᩻:J

    .line 145
    :goto_0
    iget-wide v1, p0, Ll/ۙܽ֡;->᩻:J

    sub-long/2addr v1, v4

    .line 106
    sget-object v3, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    .line 107
    :goto_1
    iget-object v6, v3, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    if-eqz v6, :cond_5

    .line 145
    iget-wide v7, v6, Ll/ۙܽ֡;->᩻:J

    sub-long/2addr v7, v4

    cmp-long v9, v1, v7

    if-gez v9, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v6

    goto :goto_1

    .line 108
    :cond_5
    :goto_2
    iput-object v6, p0, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    .line 109
    iput-object p0, v3, Ll/ۙܽ֡;->ܳ:Ll/ۙܽ֡;

    .line 110
    sget-object v1, Ll/ۙܽ֡;->ۢ:Ll/ۙܽ֡;

    if-ne v3, v1, :cond_6

    .line 111
    const-class v1, Ll/ۙܽ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :cond_6
    monitor-exit v0

    return-void

    .line 101
    :cond_7
    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 73
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced enter/exit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
