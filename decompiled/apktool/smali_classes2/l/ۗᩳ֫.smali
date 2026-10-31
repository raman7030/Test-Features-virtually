.class public final Ll/ۗᩳ֫;
.super Ljava/lang/Object;
.source "CB25"

# interfaces
.implements Ll/ܿᩳ֫;


# instance fields
.field public ֫:Ll/ܳᩳ֫;

.field public ۜ:Landroid/database/ContentObserver;

.field public final ۧ:Landroid/content/Context;

.field public ܳ:Landroid/os/Handler;

.field public ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ll/᩶ᩳ֫;

.field public final ᩷:Ll/ۨ۫;

.field public ᩻:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۨ۫;Ll/᩶ᩳ֫;)V
    .locals 1

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    const-string v0, "Context cannot be null"

    .line 236
    invoke-static {p1, v0}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۗᩳ֫;->ۧ:Landroid/content/Context;

    .line 239
    iput-object p2, p0, Ll/ۗᩳ֫;->᩷:Ll/ۨ۫;

    .line 240
    iput-object p3, p0, Ll/ۗᩳ֫;->ᩳ:Ll/᩶ᩳ֫;

    return-void
.end method

.method private ܽ()V
    .locals 5

    .line 326
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 327
    :try_start_0
    iput-object v1, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    .line 328
    iget-object v2, p0, Ll/ۗᩳ֫;->ۜ:Landroid/database/ContentObserver;

    if-eqz v2, :cond_0

    .line 329
    iget-object v3, p0, Ll/ۗᩳ֫;->ᩳ:Ll/᩶ᩳ֫;

    iget-object v4, p0, Ll/ۗᩳ֫;->ۧ:Landroid/content/Context;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 330
    iput-object v1, p0, Ll/ۗᩳ֫;->ۜ:Landroid/database/ContentObserver;

    .line 332
    :cond_0
    iget-object v2, p0, Ll/ۗᩳ֫;->ܳ:Landroid/os/Handler;

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    .line 333
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 335
    :cond_1
    iput-object v1, p0, Ll/ۗᩳ֫;->ܳ:Landroid/os/Handler;

    .line 336
    iget-object v2, p0, Ll/ۗᩳ֫;->᩻:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v2, :cond_2

    .line 338
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 340
    :cond_2
    iput-object v1, p0, Ll/ۗᩳ֫;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 341
    iput-object v1, p0, Ll/ۗᩳ֫;->᩻:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 342
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ᩳ()Ll/ܿۤ;
    .locals 4

    .line 285
    :try_start_0
    iget-object v0, p0, Ll/ۗᩳ֫;->ᩳ:Ll/᩶ᩳ֫;

    iget-object v1, p0, Ll/ۗᩳ֫;->ۧ:Landroid/content/Context;

    iget-object v2, p0, Ll/ۗᩳ֫;->᩷:Ll/ۨ۫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    invoke-static {v1, v2}, Ll/᩻ۤ;->֫(Landroid/content/Context;Ll/ۨ۫;)Ll/ᩳۤ;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    invoke-virtual {v0}, Ll/ᩳۤ;->ۧ()I

    move-result v1

    if-nez v1, :cond_1

    .line 292
    invoke-virtual {v0}, Ll/ᩳۤ;->֫()[Ll/ܿۤ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 293
    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 296
    aget-object v0, v0, v1

    return-object v0

    .line 294
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "fetchFonts failed (empty result)"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "fetchFonts failed ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ᩳۤ;->ۧ()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_0
    move-exception v0

    .line 287
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "provider not found"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    const-string v1, "fetchFonts result is not OK. ("

    .line 350
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 351
    :try_start_0
    iget-object v2, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    if-nez v2, :cond_0

    .line 352
    monitor-exit v0

    return-void

    .line 354
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 356
    :try_start_1
    invoke-direct {p0}, Ll/ۗᩳ֫;->ᩳ()Ll/ܿۤ;

    move-result-object v2

    .line 358
    invoke-virtual {v2}, Ll/ܿۤ;->֫()I

    move-result v3

    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 361
    iget-object v4, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    move-object v0, v4

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 369
    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :cond_1
    :goto_0
    if-nez v3, :cond_4

    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 378
    sget v1, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 380
    iget-object v0, p0, Ll/ۗᩳ֫;->ᩳ:Ll/᩶ᩳ֫;

    iget-object v1, p0, Ll/ۗᩳ֫;->ۧ:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܿۤ;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 74
    invoke-static {v1, v0, v3}, Ll/ۜ۬;->֫(Landroid/content/Context;[Ll/ܿۤ;I)Landroid/graphics/Typeface;

    move-result-object v0

    .line 381
    iget-object v1, p0, Ll/ۗᩳ֫;->ۧ:Landroid/content/Context;

    .line 382
    invoke-virtual {v2}, Ll/ܿۤ;->ܽ()Landroid/net/Uri;

    move-result-object v2

    .line 381
    invoke-static {v1, v2}, Ll/֡۬;->֫(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 386
    invoke-static {v0, v1}, Ll/᩺ᩳ֫;->֫(Landroid/graphics/Typeface;Ljava/nio/MappedByteBuffer;)Ll/᩺ᩳ֫;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 119
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 390
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 391
    :try_start_6
    iget-object v2, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    if-eqz v2, :cond_2

    .line 392
    invoke-virtual {v2, v1}, Ll/ܳᩳ֫;->֫(Ll/᩺ᩳ֫;)V

    .line 394
    :cond_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 395
    :try_start_7
    invoke-direct {p0}, Ll/ۗᩳ֫;->ܽ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    return-void

    :catchall_1
    move-exception v1

    .line 394
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 384
    :cond_3
    :try_start_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to open file."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    .line 388
    :try_start_b
    sget v1, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 389
    throw v0

    .line 373
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 397
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 398
    :try_start_c
    iget-object v2, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    if-eqz v2, :cond_5

    .line 399
    invoke-virtual {v2, v1}, Ll/ܳᩳ֫;->֫(Ljava/lang/Throwable;)V

    .line 401
    :cond_5
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 402
    invoke-direct {p0}, Ll/ۗᩳ֫;->ܽ()V

    return-void

    :catchall_4
    move-exception v1

    .line 401
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    throw v1

    :catchall_5
    move-exception v1

    .line 354
    :try_start_e
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    throw v1
.end method

.method public final ֫(Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 245
    :try_start_0
    iput-object p1, p0, Ll/ۗᩳ֫;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 246
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܳᩳ֫;)V
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 260
    :try_start_0
    iput-object p1, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    .line 261
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    invoke-virtual {p0}, Ll/ۗᩳ֫;->ۧ()V

    return-void

    :catchall_0
    move-exception p1

    .line 261
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 10

    .line 267
    iget-object v0, p0, Ll/ۗᩳ֫;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 268
    :try_start_0
    iget-object v1, p0, Ll/ۗᩳ֫;->֫:Ll/ܳᩳ֫;

    if-nez v1, :cond_0

    .line 270
    monitor-exit v0

    return-void

    .line 272
    :cond_0
    iget-object v1, p0, Ll/ۗᩳ֫;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v1, :cond_1

    const-string v1, "emojiCompat"

    .line 56
    new-instance v9, Ll/᩶ܽ֫;

    invoke-direct {v9, v1}, Ll/᩶ܽ֫;-><init>(Ljava/lang/String;)V

    .line 61
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0xf

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v2, 0x1

    .line 69
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 273
    iput-object v1, p0, Ll/ۗᩳ֫;->᩻:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 275
    iput-object v1, p0, Ll/ۗᩳ֫;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 277
    :cond_1
    iget-object v1, p0, Ll/ۗᩳ֫;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Ll/ۙᩳ֫;

    invoke-direct {v2, p0}, Ll/ۙᩳ֫;-><init>(Ll/ۗᩳ֫;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 278
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
