.class public abstract Ll/ۡۜ᩵;
.super Ljava/lang/Object;
.source "K6PM"

# interfaces
.implements Ljava/util/concurrent/Future;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x6b295cc9a986fd4fL

.field public static final ۗ:[Ll/᩷ۜ᩵;

.field public static final ۙ:Lsun/misc/Unsafe;

.field public static final ۫:Ljava/lang/ref/ReferenceQueue;

.field public static final ۬:Ljava/util/concurrent/locks/ReentrantLock;

.field public static final ᩶:J

.field public static final synthetic ᩹:I


# instance fields
.field public volatile ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x20

    new-array v0, v0, [Ll/᩷ۜ᩵;

    .line 393
    sput-object v0, Ll/ۡۜ᩵;->ۗ:[Ll/᩷ۜ᩵;

    .line 397
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Ll/ۡۜ᩵;->۬:Ljava/util/concurrent/locks/ReentrantLock;

    .line 401
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Ll/ۡۜ᩵;->۫:Ljava/lang/ref/ReferenceQueue;

    .line 969
    sget-object v0, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v0, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    .line 974
    :try_start_0
    const-class v1, Ll/ۡۜ᩵;

    const-string v2, "\u1a78"

    .line 975
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 974
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ll/ۡۜ᩵;->᩶:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 977
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 962
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 963
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 965
    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Ll/ۡۜ᩵;->ۧ(Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 949
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 671
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x40000000    # -2.0f

    if-ne v0, v1, :cond_1

    .line 672
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    goto :goto_0

    .line 674
    :cond_1
    invoke-direct {p0}, Ll/ۡۜ᩵;->ۢ()Ljava/lang/Throwable;

    move-result-object v0

    .line 950
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method

.method private ֫(I)I
    .locals 7

    .line 250
    :cond_0
    iget v6, p0, Ll/ۡۜ᩵;->᩸:I

    if-gez v6, :cond_1

    return v6

    .line 252
    :cond_1
    sget-object v0, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡۜ᩵;->᩶:J

    or-int v5, v6, p1

    move-object v1, p0

    move v4, v6

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    ushr-int/lit8 v0, v6, 0x10

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 254
    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    return p1
.end method

.method private ۜ()I
    .locals 8

    .line 305
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    invoke-virtual {v0, p0}, Ll/ܿۜ᩵;->֫(Ll/ۡۜ᩵;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۡۜ᩵;->ۧ()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ltz v0, :cond_5

    .line 306
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v0, :cond_5

    move v6, v0

    .line 309
    :cond_1
    sget-object v2, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v4, Ll/ۡۜ᩵;->᩶:J

    const/high16 v0, 0x10000

    or-int v7, v6, v0

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, p0

    .line 310
    monitor-enter v0

    .line 311
    :try_start_0
    iget v2, p0, Ll/ۡۜ᩵;->᩸:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ltz v2, :cond_2

    const-wide/16 v2, 0x0

    .line 313
    :try_start_1
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 v1, 0x1

    goto :goto_1

    .line 319
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 320
    :goto_1
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 322
    :cond_3
    :goto_2
    iget v6, p0, Ll/ۡۜ᩵;->᩸:I

    if-gez v6, :cond_1

    if-eqz v1, :cond_4

    .line 324
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    return v6

    :cond_5
    return v0
.end method

.method public static final ۡ()V
    .locals 2

    .line 581
    sget-object v0, Ll/ۡۜ᩵;->۬:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 583
    :try_start_0
    invoke-static {}, Ll/ۡۜ᩵;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 585
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1

    :cond_0
    return-void
.end method

.method private ۢ()Ljava/lang/Throwable;
    .locals 11

    .line 511
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 514
    sget-object v1, Ll/ۡۜ᩵;->۬:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 516
    :try_start_0
    invoke-static {}, Ll/ۡۜ᩵;->᩻()V

    .line 517
    sget-object v2, Ll/ۡۜ᩵;->ۗ:[Ll/᩷ۜ᩵;

    and-int/lit8 v0, v0, 0x1f

    .line 518
    aget-object v0, v2, v0

    :goto_0
    if-eqz v0, :cond_0

    .line 519
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_0

    .line 520
    iget-object v0, v0, Ll/᩷ۜ᩵;->ܽ:Ll/᩷ۜ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 522
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 525
    iget-object v2, v0, Ll/᩷ۜ᩵;->֫:Ljava/lang/Throwable;

    if-nez v2, :cond_1

    goto :goto_3

    .line 527
    :cond_1
    iget-wide v3, v0, Ll/᩷ۜ᩵;->ᩳ:J

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-eqz v0, :cond_5

    .line 531
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v1

    :goto_1
    if-ge v5, v3, :cond_4

    aget-object v7, v0, v5

    .line 532
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 533
    array-length v9, v8

    if-nez v9, :cond_2

    move-object v6, v7

    goto :goto_2

    .line 535
    :cond_2
    array-length v9, v8

    const/4 v10, 0x1

    if-ne v9, v10, :cond_3

    aget-object v8, v8, v4

    const-class v9, Ljava/lang/Throwable;

    if-ne v8, v9, :cond_3

    new-array v0, v10, [Ljava/lang/Object;

    aput-object v2, v0, v4

    .line 536
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    if-eqz v6, :cond_5

    .line 539
    invoke-virtual {v6, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    .line 540
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    :cond_5
    return-object v2

    :cond_6
    :goto_3
    return-object v1

    :catchall_0
    move-exception v0

    .line 522
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method private ۧ(Ljava/lang/Throwable;)I
    .locals 7

    .line 438
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    const/high16 v1, -0x80000000

    if-ltz v0, :cond_2

    .line 439
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 440
    sget-object v2, Ll/ۡۜ᩵;->۬:Ljava/util/concurrent/locks/ReentrantLock;

    .line 441
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 443
    :try_start_0
    invoke-static {}, Ll/ۡۜ᩵;->᩻()V

    .line 444
    sget-object v3, Ll/ۡۜ᩵;->ۗ:[Ll/᩷ۜ᩵;

    and-int/lit8 v0, v0, 0x1f

    .line 446
    aget-object v4, v3, v0

    :goto_0
    if-nez v4, :cond_0

    .line 448
    new-instance v4, Ll/᩷ۜ᩵;

    aget-object v5, v3, v0

    sget-object v6, Ll/ۡۜ᩵;->۫:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v4, p0, p1, v5, v6}, Ll/᩷ۜ᩵;-><init>(Ll/ۡۜ᩵;Ljava/lang/Throwable;Ll/᩷ۜ᩵;Ljava/lang/ref/ReferenceQueue;)V

    aput-object v4, v3, v0

    goto :goto_1

    .line 452
    :cond_0
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v5, p0, :cond_1

    .line 456
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 458
    invoke-direct {p0, v1}, Ll/ۡۜ᩵;->֫(I)I

    move-result v0

    goto :goto_2

    .line 446
    :cond_1
    :try_start_1
    iget-object v4, v4, Ll/᩷ۜ᩵;->ܽ:Ll/᩷ۜ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 456
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_2
    :goto_2
    const/high16 v2, -0x10000000

    and-int/2addr v2, v0

    if-ne v2, v1, :cond_3

    .line 471
    invoke-virtual {p0, p1}, Ll/ۡۜ᩵;->֫(Ljava/lang/Throwable;)V

    :cond_3
    return v0
.end method

.method private ܳ()I
    .locals 4

    .line 360
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    if-gez v0, :cond_0

    return v0

    .line 361
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ll/ۘۜ᩵;

    if-eqz v1, :cond_2

    check-cast v0, Ll/ۘۜ᩵;

    iget-object v1, v0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    .line 363
    invoke-virtual {v1, p0}, Ll/ᩳۜ᩵;->ᩳ(Ll/ۡۜ᩵;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ll/ۡۜ᩵;->ۧ()I

    move-result v2

    if-gez v2, :cond_1

    return v2

    :cond_1
    iget-object v0, v0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    const-wide/16 v2, 0x0

    .line 364
    invoke-virtual {v0, v1, p0, v2, v3}, Ll/ܿۜ᩵;->֫(Ll/ᩳۜ᩵;Ll/ۡۜ᩵;J)I

    move-result v0

    return v0

    .line 365
    :cond_2
    invoke-direct {p0}, Ll/ۡۜ᩵;->ۜ()I

    move-result v0

    return v0
.end method

.method private ᩷()I
    .locals 7

    .line 334
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 336
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v0, :cond_4

    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    invoke-virtual {v0, p0}, Ll/ܿۜ᩵;->֫(Ll/ۡۜ᩵;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۡۜ᩵;->ۧ()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ltz v0, :cond_4

    .line 337
    :cond_1
    :goto_1
    iget v5, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v5, :cond_3

    .line 338
    sget-object v1, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v3, Ll/ۡۜ᩵;->᩶:J

    const/high16 v0, 0x10000

    or-int v6, v5, v0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 339
    monitor-enter v0

    .line 340
    :try_start_0
    iget v1, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v1, :cond_2

    const-wide/16 v1, 0x0

    .line 341
    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_2

    .line 343
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 344
    :goto_2
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    return v5

    :cond_4
    return v0

    .line 335
    :cond_5
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public static ᩻()V
    .locals 6

    .line 553
    :cond_0
    :goto_0
    sget-object v0, Ll/ۡۜ᩵;->۫:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 554
    instance-of v1, v0, Ll/᩷ۜ᩵;

    if-eqz v1, :cond_0

    .line 556
    move-object v1, v0

    check-cast v1, Ll/᩷ۜ᩵;

    iget v1, v1, Ll/᩷ۜ᩵;->ۧ:I

    and-int/lit8 v1, v1, 0x1f

    .line 557
    sget-object v2, Ll/ۡۜ᩵;->ۗ:[Ll/᩷ۜ᩵;

    aget-object v3, v2, v1

    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_0

    .line 560
    iget-object v5, v3, Ll/᩷ۜ᩵;->ܽ:Ll/᩷ۜ᩵;

    if-ne v3, v0, :cond_2

    if-nez v4, :cond_1

    .line 563
    aput-object v5, v2, v1

    goto :goto_0

    .line 565
    :cond_1
    iput-object v5, v4, Ll/᩷ۜ᩵;->ܽ:Ll/᩷ۜ᩵;

    goto :goto_0

    :cond_2
    move-object v4, v3

    move-object v3, v5

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 2

    const/high16 p1, -0x40000000    # -2.0f

    .line 652
    invoke-direct {p0, p1}, Ll/ۡۜ᩵;->֫(I)I

    move-result v0

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 709
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v0, v0, Ll/ۘۜ᩵;

    if-eqz v0, :cond_0

    .line 710
    invoke-direct {p0}, Ll/ۡۜ᩵;->ܳ()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ll/ۡۜ᩵;->᩷()I

    move-result v0

    :goto_0
    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    const/high16 v1, -0x40000000    # -2.0f

    if-eq v0, v1, :cond_2

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 715
    invoke-virtual {p0}, Ll/ۡۜ᩵;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 714
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {p0}, Ll/ۡۜ᩵;->ۢ()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 712
    :cond_2
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 11

    .line 735
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 736
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p3

    if-nez p3, :cond_b

    .line 738
    iget p3, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz p3, :cond_5

    const-wide/16 v1, 0x0

    cmp-long v0, p1, v1

    if-lez v0, :cond_5

    .line 739
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    add-long/2addr v3, p1

    cmp-long p1, v3, v1

    if-nez p1, :cond_0

    const-wide/16 v3, 0x1

    .line 741
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    .line 742
    instance-of p2, p1, Ll/ۘۜ᩵;

    if-eqz p2, :cond_1

    .line 743
    check-cast p1, Ll/ۘۜ᩵;

    .line 744
    iget-object p2, p1, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    iget-object p1, p1, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    invoke-virtual {p2, p1, p0, v3, v4}, Ll/ܿۜ᩵;->֫(Ll/ᩳۜ᩵;Ll/ۡۜ᩵;J)I

    move-result p3

    goto :goto_3

    .line 746
    :cond_1
    sget-object p1, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    invoke-virtual {p1, p0}, Ll/ܿۜ᩵;->֫(Ll/ۡۜ᩵;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ll/ۡۜ᩵;->ۧ()I

    move-result p1

    move p3, p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    const/4 p3, 0x0

    :goto_0
    if-ltz p3, :cond_5

    .line 748
    :cond_3
    :goto_1
    iget v9, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v9, :cond_6

    .line 749
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v3, p1

    cmp-long p3, p1, v1

    if-lez p3, :cond_6

    .line 750
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-lez p3, :cond_3

    sget-object v5, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v7, Ll/ۡۜ᩵;->᩶:J

    const/high16 p3, 0x10000

    or-int v10, v9, p3

    move-object v6, p0

    .line 751
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result p3

    if-eqz p3, :cond_3

    move-object v0, p0

    .line 752
    monitor-enter v0

    .line 753
    :try_start_0
    iget p3, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz p3, :cond_4

    .line 754
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    goto :goto_2

    .line 756
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 757
    :goto_2
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_5
    :goto_3
    move v9, p3

    :cond_6
    if-ltz v9, :cond_7

    .line 763
    iget v9, p0, Ll/ۡۜ᩵;->᩸:I

    :cond_7
    const/high16 p1, -0x10000000

    and-int p2, v9, p1

    if-eq p2, p1, :cond_a

    const/high16 p1, -0x40000000    # -2.0f

    if-eq p2, p1, :cond_9

    const/high16 p1, -0x80000000

    if-eq p2, p1, :cond_8

    .line 768
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    .line 769
    :cond_8
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    invoke-direct {p0}, Ll/ۡۜ᩵;->ۢ()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 766
    :cond_9
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1

    .line 771
    :cond_a
    invoke-virtual {p0}, Ll/ۡۜ᩵;->ᩳ()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 737
    :cond_b
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final isCancelled()Z
    .locals 2

    .line 660
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    const/high16 v1, -0x40000000    # -2.0f

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDone()Z
    .locals 1

    .line 656
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public run()V
    .locals 4

    .line 375
    invoke-virtual {p0}, Ll/ۡۜ᩵;->ۧ()I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 376
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ll/ۘۜ᩵;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۘۜ᩵;

    iget-object v1, v0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    iget-object v0, v0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    const-wide/16 v2, 0x0

    .line 378
    invoke-virtual {v1, v0, p0, v2, v3}, Ll/ܿۜ᩵;->֫(Ll/ᩳۜ᩵;Ll/ۡۜ᩵;J)I

    move-result v0

    goto :goto_0

    .line 379
    :cond_1
    invoke-direct {p0}, Ll/ۡۜ᩵;->ۜ()I

    move-result v0

    :goto_0
    const/high16 v1, -0x10000000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_4

    const/high16 v1, -0x40000000    # -2.0f

    if-eq v0, v1, :cond_3

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    goto :goto_1

    .line 604
    :cond_2
    invoke-direct {p0}, Ll/ۡۜ᩵;->ۢ()Ljava/lang/Throwable;

    move-result-object v0

    .line 594
    sget-object v1, Ll/ܿۜ᩵;->ܳ֫:Ll/ܰ᩻᩵;

    .line 2107
    throw v0

    .line 602
    :cond_3
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫(J)V
    .locals 6

    .line 289
    iget v4, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v4, :cond_1

    sget-object v0, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡۜ᩵;->᩶:J

    const/high16 v1, 0x10000

    or-int v5, v4, v1

    move-object v1, p0

    .line 290
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 291
    monitor-enter v0

    .line 292
    :try_start_0
    iget v1, p0, Ll/ۡۜ᩵;->᩸:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ltz v1, :cond_0

    .line 293
    :try_start_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 295
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 296
    :catch_0
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public ֫(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final ֫()Z
    .locals 7

    .line 839
    :cond_0
    iget v4, p0, Ll/ۡۜ᩵;->᩸:I

    int-to-short v0, v4

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 841
    :cond_1
    sget-object v0, Ll/ۡۜ᩵;->ۙ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡۜ᩵;->᩶:J

    const/high16 v1, -0x10000

    and-int/2addr v1, v4

    const/4 v6, 0x1

    or-int/lit8 v5, v1, 0x1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_0

    return v6
.end method

.method public final ۧ()I
    .locals 2

    .line 269
    iget v0, p0, Ll/ۡۜ᩵;->᩸:I

    if-ltz v0, :cond_0

    .line 271
    :try_start_0
    invoke-virtual {p0}, Ll/ۡۜ᩵;->ܽ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/high16 v0, -0x10000000

    .line 276
    invoke-direct {p0, v0}, Ll/ۡۜ᩵;->֫(I)I

    move-result v0

    return v0

    :catchall_0
    move-exception v0

    .line 273
    invoke-direct {p0, v0}, Ll/ۡۜ᩵;->ۧ(Ljava/lang/Throwable;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public abstract ܽ()Z
.end method

.method public final ܿ()V
    .locals 0

    .line 781
    invoke-direct {p0}, Ll/ۡۜ᩵;->ܳ()I

    return-void
.end method

.method public abstract ᩳ()Ljava/lang/Object;
.end method
