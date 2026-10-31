.class public final Ll/᩶ᩳܳ;
.super Ljava/lang/Object;
.source "J72H"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Z

.field public final ۙ:Ljava/util/HashSet;

.field public final ۛ:Ljava/lang/Object;

.field public final ۤ:Ll/ܶ᩵ܿ;

.field public final ۨ:Ll/ܰܺܳ;

.field public final ۫:Ljava/lang/Object;

.field public final ۬:Ljava/util/concurrent/Semaphore;

.field public final ܰ:Ll/֫ۤᩴ;

.field public volatile ᩶:I

.field public final ᩸:Ljava/lang/ref/WeakReference;

.field public volatile ᩹:Z

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;Z)V
    .locals 3

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    invoke-static {}, Ll/ۧۤᩴ;->newKeySet()Ll/֫ۤᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    .line 218
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    .line 219
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    .line 220
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object v0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    .line 229
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶ᩳܳ;->᩸:Ljava/lang/ref/WeakReference;

    .line 230
    iput-object p2, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    .line 232
    instance-of p1, p2, Ll/ۖۛܳ;

    if-eqz p1, :cond_0

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :cond_0
    iput-object p2, p0, Ll/᩶ᩳܳ;->۫:Ljava/lang/Object;

    .line 233
    iput-object p3, p0, Ll/᩶ᩳܳ;->᩺:Ljava/lang/String;

    .line 234
    iput-boolean p4, p0, Ll/᩶ᩳܳ;->ۗ:Z

    const/4 p1, 0x0

    .line 235
    iput-object p1, p0, Ll/᩶ᩳܳ;->ۤ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public constructor <init>(Ll/֨ۚ᩷;Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    invoke-static {}, Ll/ۧۤᩴ;->newKeySet()Ll/֫ۤᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    .line 218
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    .line 219
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    .line 220
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object v0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    .line 242
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶ᩳܳ;->᩸:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    .line 243
    iput-object p1, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    .line 244
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩶ᩳܳ;->۫:Ljava/lang/Object;

    .line 245
    iput-object p1, p0, Ll/᩶ᩳܳ;->᩺:Ljava/lang/String;

    .line 246
    iput-boolean v2, p0, Ll/᩶ᩳܳ;->ۗ:Z

    .line 247
    iput-object p2, p0, Ll/᩶ᩳܳ;->ۤ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method private ֫(I)Ljava/io/InputStream;
    .locals 6

    .line 354
    iget-object v0, p0, Ll/᩶ᩳܳ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۗܺ᩷;

    .line 355
    iget-boolean v0, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v0, :cond_8

    iget v0, p0, Ll/᩶ᩳܳ;->᩶:I

    if-ne p1, v0, :cond_8

    if-eqz v2, :cond_8

    .line 356
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_8

    .line 359
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۤ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 362
    :cond_0
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/᩶ᩳܳ;->᩺:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 365
    iget-object v0, p0, Ll/᩶ᩳܳ;->۫:Ljava/lang/Object;

    monitor-enter v0

    .line 367
    :try_start_0
    iget-object v1, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 368
    :try_start_1
    iget-boolean v3, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v3, :cond_6

    iget v3, p0, Ll/᩶ᩳܳ;->᩶:I

    if-ne p1, v3, :cond_6

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_6

    .line 371
    iget-object p1, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    instance-of v3, p1, Ll/ۗۢ᩻;

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    .line 372
    invoke-virtual {p1, v4}, Ll/ܰܺܳ;->֫(Z)V

    .line 373
    :cond_1
    iget-object p1, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    iget-object v4, p0, Ll/᩶ᩳܳ;->᩺:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 374
    move-object v4, p1

    check-cast v4, Ll/ܺۘܳ;

    invoke-virtual {v4}, Ll/ܺۘܳ;->ۙ֫()Z

    move-result v5

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Ll/᩶ᩳܳ;->ۗ:Z

    if-nez v5, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    invoke-virtual {v4}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_5

    .line 377
    :cond_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 379
    :try_start_2
    iget-object v1, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    invoke-virtual {v1, v2, p1}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 383
    monitor-exit v0

    return-object p1

    .line 381
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v1, "MHTML source was not opened"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 375
    :cond_5
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v2, "MHTML source is unavailable"

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 369
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v2, "HTML preview owner is unavailable"

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 377
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 384
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    .line 363
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "MHTML source is unavailable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 357
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "HTML preview owner is unavailable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/᩶ᩳܳ;I)Ljava/io/InputStream;
    .locals 0

    .line 331
    invoke-direct {p0, p1}, Ll/᩶ᩳܳ;->֫(I)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩶ᩳܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/᩶ᩳܳ;->֫(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩶ᩳܳ;ILl/ۗܺ᩷;)V
    .locals 1

    .line 322
    iget-boolean v0, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v0, :cond_0

    iget p0, p0, Ll/᩶ᩳܳ;->᩶:I

    if-ne p1, p0, :cond_0

    .line 323
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    const p0, 0x7f120711

    .line 324
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩶ᩳܳ;Landroid/os/ParcelFileDescriptor;I)V
    .locals 5

    .line 296
    :try_start_0
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    invoke-direct {v0, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 297
    :try_start_1
    invoke-direct {p0, p2}, Ll/᩶ᩳܳ;->ۧ(I)Ll/᩺ᩳܳ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/high16 v2, 0x10000

    :try_start_2
    new-array v2, v2, [B

    .line 299
    :goto_0
    iget-boolean v3, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v3, :cond_2

    iget v3, p0, Ll/᩶ᩳܳ;->᩶:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p2, v3, :cond_2

    .line 302
    :try_start_3
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    .line 308
    :try_start_4
    invoke-virtual {v0, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    .line 319
    :goto_1
    iget-object v3, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    instance-of v3, v3, Ll/ۗۢ᩻;

    if-eqz v3, :cond_1

    .line 320
    iget-object v3, p0, Ll/᩶ᩳܳ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܺ᩷;

    if-eqz v3, :cond_1

    .line 321
    new-instance v4, Ll/᩹ᩳܳ;

    invoke-direct {v4, p0, p2, v3}, Ll/᩹ᩳܳ;-><init>(Ll/᩶ᩳܳ;ILl/ۗܺ᩷;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 305
    :cond_1
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 310
    :cond_2
    :goto_2
    :try_start_5
    invoke-virtual {v1}, Ll/᩺ᩳܳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_5

    :catchall_0
    move-exception p2

    .line 296
    :try_start_7
    invoke-virtual {v1}, Ll/᩺ᩳܳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_8
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_a
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception p2

    .line 312
    iget-object v0, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    invoke-virtual {v0, p1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z

    .line 313
    iget-object p0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 314
    throw p2

    .line 312
    :catch_2
    :goto_5
    iget-object p2, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    invoke-virtual {p2, p1}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z

    .line 313
    iget-object p0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

.method public static ֫(Ll/᩶ᩳܳ;Ll/᩺ᩳܳ;)V
    .locals 1

    .line 344
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 345
    :try_start_0
    iget-object p0, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 346
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ֫(Z)V
    .locals 5

    .line 398
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 399
    :try_start_0
    iget-boolean v1, p0, Ll/᩶ᩳܳ;->᩹:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, Ll/᩶ᩳܳ;->᩹:Z

    .line 400
    iget p1, p0, Ll/᩶ᩳܳ;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩶ᩳܳ;->᩶:I

    .line 401
    iget-object p1, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/᩺ᩳܳ;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩺ᩳܳ;

    .line 402
    iget-object v2, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 403
    iget-object v2, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    new-array v3, v1, [Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v2, v3}, Ll/۟۫ᩴ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/os/ParcelFileDescriptor;

    .line 404
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    array-length v0, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ll/᩺ᩳܳ;->close()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 406
    :cond_0
    array-length p1, v2

    :goto_1
    if-ge v1, p1, :cond_2

    aget-object v0, v2, v1

    if-nez v0, :cond_1

    goto :goto_2

    .line 430
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 408
    :catch_0
    :goto_2
    iget-object v3, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    invoke-virtual {v3, v0}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 404
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static ۧ(Ll/᩶ᩳܳ;)Landroid/os/ParcelFileDescriptor;
    .locals 8

    .line 255
    iget v1, p0, Ll/᩶ᩳܳ;->᩶:I

    .line 256
    iget-boolean v0, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v0, :cond_7

    .line 259
    iget-object v0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->tryAcquire()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 266
    :try_start_0
    invoke-static {}, Landroid/os/ParcelFileDescriptor;->createPipe()[Landroid/os/ParcelFileDescriptor;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v5, 0x1

    .line 267
    :try_start_1
    aget-object v6, v4, v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 268
    :try_start_2
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 269
    :try_start_3
    iget-boolean v7, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v7, :cond_0

    iget v7, p0, Ll/᩶ᩳܳ;->᩶:I

    if-ne v1, v7, :cond_0

    .line 272
    iget-object v7, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    invoke-virtual {v7, v6}, Ll/֫ۤᩴ;->add(Ljava/lang/Object;)Z

    .line 273
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 275
    :try_start_4
    sget-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v7, Ll/۠ᩳܳ;

    invoke-direct {v7, p0, v6, v1}, Ll/۠ᩳܳ;-><init>(Ll/᩶ᩳܳ;Landroid/os/ParcelFileDescriptor;I)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 277
    :try_start_5
    aget-object p0, v4, v3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    return-object p0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_4

    .line 270
    :cond_0
    :try_start_6
    new-instance v1, Ljava/io/FileNotFoundException;

    const-string v5, "HTML preview session is closed"

    invoke-direct {v1, v5}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 273
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v6, v2

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_0

    :catch_5
    move-exception v0

    :goto_0
    move-object v6, v2

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v4, v2

    move-object v6, v4

    :goto_1
    const/4 v1, 0x0

    goto :goto_5

    :catch_6
    move-exception v0

    goto :goto_2

    :catch_7
    move-exception v0

    :goto_2
    move-object v4, v2

    move-object v6, v4

    :goto_3
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 417
    :goto_4
    :try_start_8
    new-instance v1, Ljava/io/FileNotFoundException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v7}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 418
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 279
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move v1, v5

    :goto_5
    if-nez v1, :cond_5

    if-eqz v6, :cond_1

    .line 283
    iget-object v1, p0, Ll/᩶ᩳܳ;->ܰ:Ll/֫ۤᩴ;

    invoke-virtual {v1, v6}, Ll/֫ۤᩴ;->remove(Ljava/lang/Object;)Z

    :cond_1
    if-nez v6, :cond_2

    goto :goto_6

    .line 430
    :cond_2
    :try_start_9
    invoke-virtual {v6}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    goto :goto_6

    :catch_8
    nop

    :goto_6
    if-nez v4, :cond_3

    goto :goto_7

    .line 286
    :cond_3
    aget-object v2, v4, v3

    :goto_7
    if-nez v2, :cond_4

    goto :goto_8

    .line 430
    :cond_4
    :try_start_a
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 287
    :catch_9
    :goto_8
    iget-object p0, p0, Ll/᩶ᩳܳ;->۬:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 289
    :cond_5
    throw v0

    .line 260
    :cond_6
    new-instance p0, Ljava/io/FileNotFoundException;

    const-string v0, "Too many open HTML preview streams"

    invoke-direct {p0, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 257
    :cond_7
    new-instance p0, Ljava/io/FileNotFoundException;

    const-string v0, "HTML preview session is closed"

    invoke-direct {p0, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۧ(I)Ll/᩺ᩳܳ;
    .locals 3

    .line 330
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۨ:Ll/ܰܺܳ;

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_0

    .line 331
    new-instance v0, Ll/᩺ᩳܳ;

    new-instance v1, Ll/ܶᩳܳ;

    invoke-direct {v1, p0, p1}, Ll/ܶᩳܳ;-><init>(Ll/᩶ᩳܳ;I)V

    new-instance v2, Ll/᩸ᩳܳ;

    invoke-direct {v2, p0}, Ll/᩸ᩳܳ;-><init>(Ll/᩶ᩳܳ;)V

    invoke-direct {v0, v1, v2}, Ll/᩺ᩳܳ;-><init>(Ll/ۨᩳܳ;Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 332
    :cond_0
    new-instance v0, Ll/᩺ᩳܳ;

    invoke-direct {p0, p1}, Ll/᩶ᩳܳ;->֫(I)Ljava/io/InputStream;

    move-result-object v1

    new-instance v2, Ll/᩸ᩳܳ;

    invoke-direct {v2, p0}, Ll/᩸ᩳܳ;-><init>(Ll/᩶ᩳܳ;)V

    invoke-direct {v0, v1, v2}, Ll/᩺ᩳܳ;-><init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V

    :goto_0
    move-object v1, v0

    .line 333
    iget-object v0, p0, Ll/᩶ᩳܳ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 334
    :try_start_0
    iget-boolean v2, p0, Ll/᩶ᩳܳ;->᩹:Z

    if-nez v2, :cond_1

    iget v2, p0, Ll/᩶ᩳܳ;->᩶:I

    if-ne p1, v2, :cond_1

    .line 335
    iget-object p1, p0, Ll/᩶ᩳܳ;->ۙ:Ljava/util/HashSet;

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 336
    monitor-exit v0

    return-object v1

    .line 338
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    invoke-virtual {v1}, Ll/᩺ᩳܳ;->close()V

    .line 340
    new-instance p1, Ljava/io/IOException;

    const-string v0, "HTML preview request was cancelled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 338
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 392
    invoke-direct {p0, v0}, Ll/᩶ᩳܳ;->֫(Z)V

    return-void
.end method
