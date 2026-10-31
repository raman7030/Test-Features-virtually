.class public final Ll/᩻۬ۜ;
.super Ljava/lang/Object;
.source "Y74X"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public ᩸:Ll/ܺ᩸֫;

.field public volatile ᩹:Ll/ܳ۬ۜ;


# direct methods
.method public constructor <init>(Ll/ܺ᩸֫;ZLjava/lang/String;)V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    .line 183
    iput-object p3, p0, Ll/᩻۬ۜ;->᩶:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 185
    sget-object p1, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 186
    sget-object p1, Ll/ܳ۬ۜ;->ۗ:Ll/ܳ۬ۜ;

    goto :goto_0

    :cond_1
    sget-object p1, Ll/ܳ۬ۜ;->᩹:Ll/ܳ۬ۜ;

    :goto_0
    iput-object p1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    return-void
.end method

.method private ۖ()V
    .locals 6

    .line 319
    iget-object v0, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v1, Ll/ܳ۬ۜ;->ۗ:Ll/ܳ۬ۜ;

    if-eq v0, v1, :cond_0

    goto :goto_2

    .line 324
    :cond_0
    invoke-static {}, Ll/᩷۬ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 325
    :try_start_0
    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v2

    .line 326
    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v3

    sget-object v4, Ll/ۜ۬ۜ;->ۙ:Ll/ۜ۬ۜ;

    if-ne v3, v4, :cond_1

    invoke-static {}, Ll/᩷۬ۜ;->ۧ()Ll/ܺ᩸֫;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 327
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 328
    sget-object v0, Ll/ۜ۬ۜ;->ۗ:Ll/ۜ۬ۜ;

    if-eq v2, v0, :cond_5

    sget-object v0, Ll/ۜ۬ۜ;->᩶:Ll/ۜ۬ۜ;

    if-ne v2, v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p0

    .line 331
    monitor-enter v0

    .line 332
    :try_start_1
    iget-object v5, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    if-eq v5, v1, :cond_3

    .line 333
    monitor-exit v0

    return-void

    :cond_3
    if-ne v2, v4, :cond_4

    if-eqz v3, :cond_4

    .line 336
    iput-object v3, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    .line 337
    sget-object v1, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    goto :goto_1

    .line 339
    :cond_4
    sget-object v1, Ll/ܳ۬ۜ;->᩹:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 341
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 342
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_5
    :goto_2
    return-void

    :catchall_1
    move-exception v1

    .line 327
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method private ۘ()V
    .locals 3

    move-object v0, p0

    .line 309
    monitor-enter v0

    .line 310
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->ۙ:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_0

    .line 311
    sget-object v1, Ll/ܳ۬ۜ;->ۗ:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 312
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 314
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ۜ()Ll/ܺ᩸֫;
    .locals 9

    .line 259
    invoke-static {}, Ll/᩻۬ۜ;->ᩴ()V

    .line 260
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    .line 261
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    add-long/2addr v3, v1

    .line 264
    invoke-static {}, Ll/᩷۬ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 265
    :goto_0
    :try_start_0
    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v5

    sget-object v6, Ll/ۜ۬ۜ;->ۗ:Ll/ۜ۬ۜ;

    if-eq v5, v6, :cond_0

    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v5

    sget-object v6, Ll/ۜ۬ۜ;->᩶:Ll/ۜ۬ۜ;

    if-ne v5, v6, :cond_1

    :cond_0
    iget-object v5, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v6, Ll/ܳ۬ۜ;->ۙ:Ll/ܳ۬ۜ;

    if-ne v5, v6, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    .line 267
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    .line 268
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 269
    invoke-virtual {v7, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sub-long/2addr v1, v7

    long-to-int v2, v1

    .line 271
    :try_start_1
    invoke-static {}, Ll/᩷۬ۜ;->֫()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1, v5, v6, v2}, Ljava/lang/Object;->wait(JI)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long v1, v3, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 273
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 359
    new-instance v2, Ljava/io/InterruptedIOException;

    const-string v3, "Interrupted while waiting for media cache initialization"

    invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 362
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 274
    throw v2

    .line 278
    :cond_1
    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v1

    .line 279
    invoke-static {}, Ll/᩷۬ۜ;->ܽ()Ll/ۜ۬ۜ;

    move-result-object v2

    sget-object v3, Ll/ۜ۬ۜ;->ۙ:Ll/ۜ۬ۜ;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    invoke-static {}, Ll/᩷۬ۜ;->ۧ()Ll/ܺ᩸֫;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v4

    .line 280
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 282
    invoke-static {}, Ll/᩻۬ۜ;->ᩴ()V

    move-object v0, p0

    .line 283
    monitor-enter v0

    .line 346
    :try_start_3
    iget-object v5, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v6, Ll/ܳ۬ۜ;->۬:Ll/ܳ۬ۜ;

    if-eq v5, v6, :cond_7

    .line 285
    invoke-static {}, Ll/᩻۬ۜ;->ᩴ()V

    .line 286
    iget-object v5, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v6, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    if-ne v5, v6, :cond_3

    .line 287
    iget-object v1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    monitor-exit v0

    return-object v1

    .line 289
    :cond_3
    iget-object v5, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v7, Ll/ܳ۬ۜ;->᩹:Ll/ܳ۬ۜ;

    if-ne v5, v7, :cond_4

    .line 290
    monitor-exit v0

    return-object v4

    .line 292
    :cond_4
    iget-object v4, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v5, Ll/ܳ۬ۜ;->ۙ:Ll/ܳ۬ۜ;

    if-ne v4, v5, :cond_6

    if-ne v1, v3, :cond_5

    if-eqz v2, :cond_5

    .line 296
    iput-object v2, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    .line 297
    iput-object v6, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    goto :goto_2

    .line 300
    :cond_5
    iput-object v7, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 302
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 303
    iget-object v1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    monitor-exit v0

    return-object v1

    .line 293
    :cond_6
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "Media cache decision was canceled"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 347
    :cond_7
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "Media cache session was released"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 304
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 280
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static ᩴ()V
    .locals 2

    .line 352
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 359
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Interrupted while waiting for media cache initialization"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 353
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 386
    monitor-enter v0

    .line 387
    :try_start_0
    sget-object v1, Ll/ܳ۬ۜ;->۬:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 388
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 389
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    invoke-static {}, Ll/᩷۬ۜ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v1

    .line 389
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫()Ll/ܺ᩸֫;
    .locals 4

    .line 224
    invoke-direct {p0}, Ll/᩻۬ۜ;->ۖ()V

    .line 226
    :goto_0
    invoke-static {}, Ll/᩻۬ۜ;->ᩴ()V

    move-object v0, p0

    .line 227
    monitor-enter v0

    .line 346
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->۬:Ll/ܳ۬ۜ;

    if-eq v1, v2, :cond_3

    .line 229
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_0

    .line 230
    iget-object v1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    monitor-exit v0

    return-object v1

    .line 232
    :cond_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->᩹:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 233
    monitor-exit v0

    return-object v1

    .line 235
    :cond_1
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->ۗ:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_2

    .line 236
    sget-object v1, Ll/ܳ۬ۜ;->ۙ:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 237
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    :try_start_1
    invoke-direct {p0}, Ll/᩻۬ۜ;->ۜ()Ll/ܺ᩸֫;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 251
    invoke-direct {p0}, Ll/᩻۬ۜ;->ۘ()V

    .line 252
    throw v0

    .line 240
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    :try_start_3
    monitor-exit v0

    goto :goto_0

    :catch_1
    move-exception v1

    .line 242
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 359
    new-instance v2, Ljava/io/InterruptedIOException;

    const-string v3, "Interrupted while waiting for media cache initialization"

    invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 362
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 243
    throw v2

    .line 347
    :cond_3
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "Media cache session was released"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 245
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 381
    iget-object v0, p0, Ll/᩻۬ۜ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()V
    .locals 3

    move-object v0, p0

    .line 369
    monitor-enter v0

    .line 370
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->۬:Ll/ܳ۬ۜ;

    if-eq v1, v2, :cond_0

    .line 371
    sget-object v1, Ll/ܳ۬ۜ;->᩹:Ll/ܳ۬ۜ;

    iput-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    .line 373
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 374
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    invoke-static {}, Ll/᩷۬ۜ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v1

    .line 374
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ll/ܺ᩸֫;
    .locals 3

    .line 206
    invoke-direct {p0}, Ll/᩻۬ۜ;->ۖ()V

    move-object v0, p0

    .line 207
    monitor-enter v0

    .line 208
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 209
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩻()Z
    .locals 3

    .line 197
    invoke-direct {p0}, Ll/᩻۬ۜ;->ۖ()V

    move-object v0, p0

    .line 198
    monitor-enter v0

    .line 199
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ۜ;->᩹:Ll/ܳ۬ۜ;

    sget-object v2, Ll/ܳ۬ۜ;->᩶:Ll/ܳ۬ۜ;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ll/᩻۬ۜ;->᩸:Ll/ܺ᩸֫;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 200
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
