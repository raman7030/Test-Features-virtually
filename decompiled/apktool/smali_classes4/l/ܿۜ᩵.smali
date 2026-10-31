.class public final Ll/ܿۜ᩵;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "H6Q8"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ֫֫:I

.field public static final ۟:I

.field public static final ۧ֫:J

.field public static final ܰ:I

.field public static final ܳ֫:Ll/ܰ᩻᩵;

.field public static final ܽ֫:J

.field public static final ܿ֫:Ll/ܿۜ᩵;

.field public static final ᩳ֫:Lsun/misc/Unsafe;

.field public static final ᩺:I

.field public static final ᩻֫:Ljava/lang/RuntimePermission;


# instance fields
.field public final ۗ:J

.field public ۙ:I

.field public ۛ:[Ll/ᩳۜ᩵;

.field public final ۤ:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final ۨ:Ljava/lang/String;

.field public volatile ۫:J

.field public volatile ۬:I

.field public final ᩶:Ll/۟᩻᩵;

.field public final ᩸:I

.field public volatile ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 2533
    const-class v0, [Ll/ۡۜ᩵;

    const-class v1, Ll/ܿۜ᩵;

    sget-object v2, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v2, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    :try_start_0
    const-string v3, "\u1a79"

    .line 2542
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v2, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/ܿۜ᩵;->ۧ֫:J

    const-string v3, "\u06ec"

    .line 2544
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v2, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/ܿۜ᩵;->ܽ֫:J

    .line 2545
    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result v1

    sput v1, Ll/ܿۜ᩵;->᩺:I

    .line 2546
    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 2549
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x1f

    sput v0, Ll/ܿۜ᩵;->ܰ:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v0, 0x100

    :try_start_1
    const-string v1, "java.util.concurrent.ForkJoinPool.common.maximumSpares"

    .line 2562
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2564
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 2566
    :catch_0
    :cond_0
    sput v0, Ll/ܿۜ᩵;->۟:I

    .line 2568
    new-instance v0, Ll/ܰ᩻᩵;

    .line 666
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2568
    sput-object v0, Ll/ܿۜ᩵;->ܳ֫:Ll/ܰ᩻᩵;

    .line 2570
    new-instance v0, Ljava/lang/RuntimePermission;

    const-string v1, "modifyThread"

    invoke-direct {v0, v1}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܿۜ᩵;->᩻֫:Ljava/lang/RuntimePermission;

    .line 2572
    new-instance v0, Ll/ۨ᩻᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۜ᩵;

    sput-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    .line 2576
    iget v0, v0, Ll/ܿۜ᩵;->۬:I

    const v1, 0xffff

    and-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Ll/ܿۜ᩵;->֫֫:I

    return-void

    .line 2548
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    const-string v1, "array index scale not a power of two"

    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    .line 2551
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 10

    .line 1961
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    const/4 v0, -0x1

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "java.util.concurrent.ForkJoinPool.common.parallelism"

    .line 1967
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1969
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_0
    const-string v2, "java.util.concurrent.ForkJoinPool.common.threadFactory"

    .line 1950
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v2, v1

    goto :goto_0

    .line 1953
    :cond_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 1954
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1970
    :goto_0
    check-cast v2, Ll/۟᩻᩵;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v3, "java.util.concurrent.ForkJoinPool.common.exceptionHandler"

    .line 1950
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    move-object v3, v1

    goto :goto_1

    .line 1953
    :cond_2
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 1954
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1972
    :goto_1
    check-cast v3, Ljava/lang/Thread$UncaughtExceptionHandler;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object v3, v1

    :goto_2
    move-object v1, v2

    goto :goto_3

    :catch_1
    move-object v3, v1

    :goto_3
    if-nez v1, :cond_4

    .line 1978
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v1

    if-nez v1, :cond_3

    .line 1979
    sget-object v1, Ll/ܿۜ᩵;->ܳ֫:Ll/ܰ᩻᩵;

    goto :goto_4

    .line 1982
    :cond_3
    new-instance v1, Ll/ۧۜ᩵;

    .line 2605
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_4
    :goto_4
    const/4 v2, 0x1

    if-gez v0, :cond_5

    .line 1986
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sub-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/4 v0, 0x1

    :cond_5
    const/16 v4, 0x7fff

    if-le v0, v4, :cond_6

    const/16 v0, 0x7fff

    :cond_6
    neg-int v4, v0

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long v6, v4, v6

    const-wide v8, 0xffff00000000L

    and-long/2addr v6, v8

    const/16 v8, 0x30

    shl-long/2addr v4, v8

    const-wide/high16 v8, -0x1000000000000L

    and-long/2addr v4, v8

    or-long/2addr v4, v6

    rsub-int/lit8 v6, v0, 0x1

    const v7, 0xffff

    and-int/2addr v6, v7

    .line 1993
    sget v7, Ll/ܿۜ᩵;->۟:I

    shl-int/lit8 v7, v7, 0x10

    or-int/2addr v6, v7

    if-le v0, v2, :cond_7

    add-int/lit8 v7, v0, -0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x1

    :goto_5
    ushr-int/lit8 v8, v7, 0x1

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x2

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x4

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x8

    or-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x10

    or-int/2addr v7, v8

    add-int/2addr v7, v2

    shl-int/lit8 v2, v7, 0x1

    const-string v7, "FJPool.commonPool-worker-"

    .line 1998
    iput-object v7, p0, Ll/ܿۜ᩵;->ۨ:Ljava/lang/String;

    .line 1999
    new-array v2, v2, [Ll/ᩳۜ᩵;

    iput-object v2, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    .line 2000
    iput-object v1, p0, Ll/ܿۜ᩵;->᩶:Ll/۟᩻᩵;

    .line 2001
    iput-object v3, p0, Ll/ܿۜ᩵;->ۤ:Ljava/lang/Thread$UncaughtExceptionHandler;

    const-wide/32 v1, 0xea60

    .line 2003
    iput-wide v1, p0, Ll/ܿۜ᩵;->ۗ:J

    .line 2004
    iput v6, p0, Ll/ܿۜ᩵;->᩸:I

    .line 2005
    iput v0, p0, Ll/ܿۜ᩵;->۬:I

    .line 2006
    iput-wide v4, p0, Ll/ܿۜ᩵;->᩹:J

    return-void
.end method

.method public static ֫(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1188
    :cond_0
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p2, p0, p1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 1189
    invoke-static {v0, p2, p0, p1, v1}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1
.end method

.method public static varargs ֫([Ljava/security/Permission;)Ljava/security/AccessControlContext;
    .locals 5

    .line 640
    new-instance v0, Ljava/security/Permissions;

    invoke-direct {v0}, Ljava/security/Permissions;-><init>()V

    .line 641
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    .line 642
    invoke-virtual {v0, v4}, Ljava/security/Permissions;->add(Ljava/security/Permission;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 643
    :cond_0
    new-instance p0, Ljava/security/AccessControlContext;

    new-instance v1, Ljava/security/ProtectionDomain;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0}, Ljava/security/ProtectionDomain;-><init>(Ljava/security/CodeSource;Ljava/security/PermissionCollection;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/security/ProtectionDomain;

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Ljava/security/AccessControlContext;-><init>([Ljava/security/ProtectionDomain;)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;JJ)V
    .locals 8

    .line 1169
    :cond_0
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    move-result-wide v4

    add-long v6, v4, p3

    move-object v1, p0

    move-wide v2, p1

    .line 1170
    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static ֫(Ljava/util/concurrent/Executor;Ll/ᩴ᩻᩵;)V
    .locals 9

    .line 2476
    instance-of v0, p0, Ll/ܿۜ᩵;

    if-eqz v0, :cond_6

    .line 2478
    check-cast p0, Ll/ܿۜ᩵;

    .line 2479
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 2480
    instance-of v1, v0, Ll/ۘۜ᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۘۜ᩵;

    iget-object v1, v0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    if-ne v1, p0, :cond_0

    .line 2482
    iget-object p0, v0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    goto :goto_0

    .line 2483
    :cond_0
    invoke-static {}, Ll/ۚۜ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz p0, :cond_1

    array-length v1, p0

    if-lez v1, :cond_1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x7e

    .line 2485
    aget-object p0, p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_6

    .line 2490
    :cond_2
    :goto_1
    iget v0, p0, Ll/ᩳۜ᩵;->ۧ:I

    iget v1, p0, Ll/ᩳۜ᩵;->ۢ:I

    .line 2491
    iget-object v2, p0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v2, :cond_6

    sub-int v1, v0, v1

    if-gez v1, :cond_6

    array-length v3, v2

    if-lez v3, :cond_6

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v0

    int-to-long v3, v3

    .line 2494
    sget v5, Ll/ܿۜ᩵;->ܰ:I

    shl-long/2addr v3, v5

    sget v5, Ll/ܿۜ᩵;->᩺:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    .line 2495
    sget-object v5, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    .line 2496
    invoke-virtual {v5, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡۜ᩵;

    .line 2497
    invoke-virtual {p1}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v7, v0, 0x1

    .line 2499
    iget v8, p0, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v0, v8, :cond_2

    if-nez v6, :cond_4

    const/4 v0, -0x1

    if-ne v1, v0, :cond_2

    goto :goto_2

    .line 2504
    :cond_4
    instance-of v0, v6, Ll/ۢ᩻᩵;

    if-nez v0, :cond_5

    goto :goto_2

    .line 2506
    :cond_5
    invoke-static {v5, v2, v3, v4, v6}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2508
    iput v7, p0, Ll/ᩳۜ᩵;->ۧ:I

    .line 2509
    invoke-virtual {v6}, Ll/ۡۜ᩵;->ۧ()I

    goto :goto_1

    :cond_6
    :goto_2
    return-void
.end method

.method public static ֫(Ll/ᩴ᩻᩵;)V
    .locals 13

    .line 2447
    iget-wide v0, p0, Ll/ᩴ᩻᩵;->ۛ:J

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    .line 2448
    instance-of v5, v4, Ll/ۘۜ᩵;

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_5

    check-cast v4, Ll/ۘۜ᩵;

    iget-object v5, v4, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    if-eqz v5, :cond_5

    iget-object v4, v4, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    if-eqz v4, :cond_5

    .line 2452
    :cond_0
    invoke-virtual {p0}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v8

    if-nez v8, :cond_7

    .line 2453
    invoke-direct {v5, v4}, Ll/ܿۜ᩵;->ܽ(Ll/ᩳۜ᩵;)I

    move-result v8

    if-eqz v8, :cond_0

    const-wide/high16 v9, 0x1000000000000L

    .line 2455
    :try_start_0
    invoke-virtual {p0}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 1859
    :goto_0
    invoke-virtual {p0}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v4

    if-nez v4, :cond_2

    cmp-long v4, v0, v6

    if-nez v4, :cond_1

    .line 1861
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    goto :goto_0

    .line 1863
    :cond_1
    iget-wide v11, p0, Ll/ᩴ᩻᩵;->ܰ:J

    invoke-static {p0, v11, v12}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    if-lez v8, :cond_3

    move-wide v6, v9

    .line 2458
    :cond_3
    invoke-static {v5, v2, v3, v6, v7}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    return-void

    :catchall_0
    move-exception p0

    if-lez v8, :cond_4

    move-wide v6, v9

    :cond_4
    invoke-static {v5, v2, v3, v6, v7}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    throw p0

    .line 2465
    :cond_5
    invoke-virtual {p0}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_7

    .line 1859
    :goto_1
    invoke-virtual {p0}, Ll/ᩴ᩻᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_7

    cmp-long v2, v0, v6

    if-nez v2, :cond_6

    .line 1861
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    goto :goto_1

    .line 1863
    :cond_6
    iget-wide v2, p0, Ll/ᩴ᩻᩵;->ܰ:J

    invoke-static {p0, v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_7
    return-void
.end method

.method private ֫(ZZ)Z
    .locals 19

    move-object/from16 v7, p0

    .line 1864
    :goto_0
    iget v5, v7, Ll/ܿۜ᩵;->۬:I

    const/high16 v0, 0x40000

    and-int/2addr v0, v5

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    .line 1865
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    if-ne v7, v0, :cond_0

    goto :goto_1

    .line 1868
    :cond_0
    sget-object v1, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    const/high16 v0, 0x40000

    sget-wide v3, Ll/ܿۜ᩵;->ܽ֫:J

    or-int v6, v5, v0

    move-object/from16 v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    goto/16 :goto_8

    .line 1871
    :cond_2
    :goto_2
    iget v0, v7, Ll/ܿۜ᩵;->۬:I

    const/high16 v1, -0x80000000

    and-int/2addr v1, v0

    const v2, 0xffff

    const/4 v3, 0x1

    if-nez v1, :cond_d

    if-nez p1, :cond_c

    const-wide/16 v9, 0x0

    .line 1875
    :goto_3
    iget-wide v4, v7, Ll/ܿۜ᩵;->᩹:J

    .line 1876
    iget-object v1, v7, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    and-int/2addr v0, v2

    const/16 v2, 0x30

    shr-long v11, v4, v2

    long-to-int v6, v11

    add-int/2addr v0, v6

    if-lez v0, :cond_3

    const/high16 v0, -0x80000000

    move-wide/from16 v17, v9

    goto :goto_7

    :cond_3
    if-eqz v1, :cond_7

    const/4 v0, 0x0

    .line 1881
    :goto_4
    array-length v6, v1

    if-ge v0, v6, :cond_7

    .line 1882
    aget-object v6, v1, v0

    if-eqz v6, :cond_6

    .line 1883
    iget v11, v6, Ll/ᩳۜ᩵;->ۜ:I

    iget v12, v6, Ll/ᩳۜ᩵;->ܳ:I

    const/high16 v13, -0x80000000

    .line 1884
    iget v14, v6, Ll/ᩳۜ᩵;->ܽ:I

    iget v15, v6, Ll/ᩳۜ᩵;->ۧ:I

    .line 1885
    iget v6, v6, Ll/ᩳۜ᩵;->ۢ:I

    if-ne v15, v6, :cond_5

    and-int/lit8 v6, v14, 0x1

    if-ne v6, v3, :cond_4

    if-gez v11, :cond_5

    if-ltz v12, :cond_4

    goto :goto_5

    :cond_4
    move-wide/from16 v17, v9

    int-to-long v8, v11

    shl-long/2addr v8, v2

    const/16 v3, 0x20

    int-to-long v10, v12

    shl-long/2addr v10, v3

    add-long/2addr v8, v10

    int-to-long v10, v15

    const/16 v3, 0x10

    shl-long/2addr v10, v3

    add-long/2addr v8, v10

    int-to-long v10, v14

    add-long/2addr v8, v10

    add-long/2addr v8, v4

    move-wide v4, v8

    goto :goto_6

    :cond_5
    :goto_5
    move-wide/from16 v17, v9

    const/4 v3, 0x1

    const/high16 v0, -0x80000000

    goto :goto_7

    :cond_6
    move-wide/from16 v17, v9

    :goto_6
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x1

    move-wide/from16 v9, v17

    goto :goto_4

    :cond_7
    move-wide/from16 v17, v9

    const/high16 v0, -0x80000000

    const/4 v3, 0x0

    .line 1895
    :goto_7
    iget v2, v7, Ll/ܿۜ᩵;->۬:I

    and-int v6, v2, v0

    if-eqz v6, :cond_8

    goto :goto_9

    :cond_8
    if-eqz v3, :cond_9

    goto :goto_1

    :goto_8
    return v0

    .line 1899
    :cond_9
    iget-object v3, v7, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-ne v3, v1, :cond_b

    cmp-long v1, v17, v4

    if-nez v1, :cond_a

    :goto_9
    move v5, v2

    goto :goto_b

    :cond_a
    move-wide v9, v4

    goto :goto_a

    :cond_b
    move-wide/from16 v9, v17

    :goto_a
    const v0, 0xffff

    const/4 v3, 0x1

    move v0, v2

    const v2, 0xffff

    goto :goto_3

    :cond_c
    const/high16 v1, -0x80000000

    move v5, v0

    const/high16 v0, -0x80000000

    :goto_b
    and-int v1, v5, v0

    if-nez v1, :cond_2

    .line 1904
    sget-object v1, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v3, Ll/ܿۜ᩵;->ܽ֫:J

    or-int v6, v5, v0

    move-object/from16 v2, p0

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    goto/16 :goto_2

    :cond_d
    const v0, 0xffff

    const/16 v8, 0x20

    const/4 v11, 0x1

    .line 1907
    :cond_e
    iget v1, v7, Ll/ܿۜ᩵;->۬:I

    const/high16 v2, 0x80000

    and-int/2addr v1, v2

    if-nez v1, :cond_19

    const-wide/16 v3, 0x0

    .line 1910
    :cond_f
    :goto_c
    iget-wide v5, v7, Ll/ܿۜ᩵;->᩹:J

    .line 1911
    iget-object v1, v7, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v1, :cond_14

    const/4 v12, 0x0

    .line 1912
    :goto_d
    array-length v13, v1

    if-ge v12, v13, :cond_14

    .line 1913
    aget-object v13, v1, v12

    if-eqz v13, :cond_13

    .line 1914
    iget-object v14, v13, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    .line 864
    :cond_10
    :goto_e
    invoke-virtual {v13}, Ll/ᩳۜ᩵;->ۧ()Ll/ۡۜ᩵;

    move-result-object v15

    if-eqz v15, :cond_11

    .line 488
    iget v9, v15, Ll/ۡۜ᩵;->᩸:I

    if-ltz v9, :cond_10

    const/4 v9, 0x0

    .line 490
    :try_start_0
    invoke-virtual {v15, v9}, Ll/ۡۜ᩵;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_e

    :catchall_0
    nop

    goto :goto_e

    :cond_11
    const/4 v9, 0x0

    if-eqz v14, :cond_12

    .line 1918
    :try_start_1
    invoke-virtual {v14}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1922
    :catchall_1
    :cond_12
    iget v10, v13, Ll/ᩳۜ᩵;->ܳ:I

    int-to-long v14, v10

    shl-long/2addr v14, v8

    iget v10, v13, Ll/ᩳۜ᩵;->ۧ:I

    int-to-long v9, v10

    add-long/2addr v14, v9

    add-long/2addr v5, v14

    :cond_13
    add-int/lit8 v12, v12, 0x1

    goto :goto_d

    .line 1926
    :cond_14
    iget v9, v7, Ll/ܿۜ᩵;->۬:I

    and-int v10, v9, v2

    if-nez v10, :cond_16

    iget-object v12, v7, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-ne v12, v1, :cond_f

    cmp-long v1, v3, v5

    if-nez v1, :cond_15

    goto :goto_f

    :cond_15
    move-wide v3, v5

    goto :goto_c

    :cond_16
    :goto_f
    if-eqz v10, :cond_17

    goto :goto_10

    :cond_17
    and-int v1, v9, v0

    .line 1932
    iget-wide v2, v7, Ll/ܿۜ᩵;->᩹:J

    ushr-long/2addr v2, v8

    long-to-int v3, v2

    int-to-short v2, v3

    add-int/2addr v1, v2

    if-lez v1, :cond_18

    goto :goto_10

    .line 1934
    :cond_18
    sget-object v1, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    const/high16 v2, 0x80000

    sget-wide v3, Ll/ܿۜ᩵;->ܽ֫:J

    or-int v6, v9, v2

    move-object/from16 v2, p0

    move v5, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object/from16 v16, p0

    .line 1935
    monitor-enter v16

    .line 1936
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->notifyAll()V

    .line 1937
    monitor-exit v16

    goto :goto_10

    :catchall_2
    move-exception v0

    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :cond_19
    :goto_10
    return v11
.end method

.method private ۧ(J)V
    .locals 8

    move-wide v4, p1

    :cond_0
    const-wide/high16 p1, 0x1000000000000L

    add-long/2addr p1, v4

    const-wide/high16 v0, -0x1000000000000L

    and-long/2addr p1, v0

    const-wide v0, 0x100000000L

    add-long/2addr v0, v4

    const-wide v2, 0xffff00000000L

    and-long/2addr v0, v2

    or-long v6, p1, v0

    .line 1230
    iget-wide p1, p0, Ll/ܿۜ᩵;->᩹:J

    cmp-long v0, p1, v4

    if-nez v0, :cond_1

    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1231
    invoke-direct {p0}, Ll/ܿۜ᩵;->ᩳ()Z

    return-void

    .line 1234
    :cond_1
    iget-wide v4, p0, Ll/ܿۜ᩵;->᩹:J

    const-wide p1, 0x800000000000L

    and-long/2addr p1, v4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_2

    long-to-int p1, v4

    if-eqz p1, :cond_0

    :cond_2
    return-void
.end method

.method private ۧ(Ll/ۡۜ᩵;)V
    .locals 9

    .line 1830
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ll/ۘۜ᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۘۜ᩵;

    iget-object v1, v0, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    if-ne v1, p0, :cond_0

    iget-object v0, v0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    if-eqz v0, :cond_0

    .line 1833
    invoke-virtual {v0, p1}, Ll/ᩳۜ᩵;->֫(Ll/ۡۜ᩵;)V

    return-void

    .line 1757
    :cond_0
    invoke-static {}, Ll/ۚۜ᩵;->֫()I

    move-result v0

    if-nez v0, :cond_1

    .line 1758
    invoke-static {}, Ll/ۚۜ᩵;->ۧ()V

    .line 1759
    invoke-static {}, Ll/ۚۜ᩵;->֫()I

    move-result v0

    :cond_1
    move v1, v0

    .line 1762
    :goto_0
    iget v0, p0, Ll/ܿۜ᩵;->۬:I

    .line 1763
    iget-object v2, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    const/high16 v3, 0x40000

    and-int/2addr v0, v3

    if-nez v0, :cond_b

    if-eqz v2, :cond_b

    .line 1764
    array-length v0, v2

    if-lez v0, :cond_b

    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x7e

    .line 1769
    aget-object v0, v2, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    .line 1770
    iget-object v0, p0, Ll/ܿۜ᩵;->ۨ:Ljava/lang/String;

    const/high16 v4, 0x40000000    # 2.0f

    or-int v5, v1, v4

    const v6, -0x10002

    and-int/2addr v5, v6

    .line 1772
    new-instance v6, Ll/ᩳۜ᩵;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Ll/ᩳۜ᩵;-><init>(Ll/ܿۜ᩵;Ll/ۘۜ᩵;)V

    .line 1773
    iput v5, v6, Ll/ᩳۜ᩵;->ܽ:I

    .line 1774
    iput v4, v6, Ll/ᩳۜ᩵;->ۜ:I

    .line 1775
    iput v3, v6, Ll/ᩳۜ᩵;->ܳ:I

    if-eqz v0, :cond_3

    .line 1777
    monitor-enter v0

    .line 1779
    :try_start_0
    iget-object v4, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v4, :cond_2

    array-length v7, v4

    if-lez v7, :cond_2

    add-int/lit8 v7, v7, -0x1

    and-int/2addr v5, v7

    and-int/lit8 v5, v5, 0x7e

    aget-object v7, v4, v5

    if-nez v7, :cond_2

    .line 1782
    aput-object v6, v4, v5

    const/4 v4, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1785
    :goto_1
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_2
    move-object v0, v6

    goto :goto_4

    .line 1788
    :cond_4
    invoke-virtual {v0}, Ll/ᩳۜ᩵;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 1789
    iget v4, v0, Ll/ᩳۜ᩵;->ۧ:I

    iget v5, v0, Ll/ᩳۜ᩵;->ۢ:I

    .line 1790
    iget-object v6, v0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v6, :cond_6

    array-length v7, v6

    if-lez v7, :cond_6

    add-int/lit8 v7, v7, -0x1

    sub-int/2addr v4, v5

    add-int v8, v7, v4

    if-lez v8, :cond_6

    and-int/2addr v7, v5

    .line 1792
    aput-object p1, v6, v7

    add-int/lit8 v6, v5, 0x1

    .line 1793
    iput v6, v0, Ll/ᩳۜ᩵;->ۢ:I

    .line 1794
    iput v2, v0, Ll/ᩳۜ᩵;->ܳ:I

    if-gez v4, :cond_5

    .line 1795
    iget v4, v0, Ll/ᩳۜ᩵;->ۧ:I

    sub-int/2addr v4, v5

    const/4 v5, -0x1

    if-ge v4, v5, :cond_5

    return-void

    :cond_5
    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_3

    :cond_6
    const/4 v4, 0x1

    const/4 v5, 0x1

    :goto_3
    const/4 v4, 0x1

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_4
    if-eqz v4, :cond_a

    if-eqz v5, :cond_9

    .line 1805
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳۜ᩵;->֫()V

    .line 1806
    iget v1, v0, Ll/ᩳۜ᩵;->ۢ:I

    .line 1807
    iget-object v4, v0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v4, :cond_8

    array-length v5, v4

    if-lez v5, :cond_8

    sub-int/2addr v5, v3

    and-int/2addr v5, v1

    .line 1808
    aput-object p1, v4, v5

    add-int/2addr v1, v3

    .line 1809
    iput v1, v0, Ll/ᩳۜ᩵;->ۢ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1812
    :cond_8
    iput v2, v0, Ll/ᩳۜ᩵;->ܳ:I

    goto :goto_5

    :catchall_1
    move-exception p1

    iput v2, v0, Ll/ᩳۜ᩵;->ܳ:I

    throw p1

    .line 1815
    :cond_9
    :goto_5
    invoke-virtual {p0}, Ll/ܿۜ᩵;->ܽ()V

    return-void

    .line 1819
    :cond_a
    invoke-static {v1}, Ll/ۚۜ᩵;->֫(I)I

    move-result v1

    goto/16 :goto_0

    .line 1765
    :cond_b
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    invoke-direct {p1}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    throw p1
.end method

.method private ܳ()Ll/ۡۜ᩵;
    .locals 11

    .line 1704
    :cond_0
    iget v0, p0, Ll/ܿۜ᩵;->۬:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v0, :cond_4

    array-length v1, v0

    if-lez v1, :cond_4

    add-int/lit8 v1, v1, -0x1

    .line 1707
    invoke-static {}, Ll/ۚۜ᩵;->ܽ()I

    move-result v2

    ushr-int/lit8 v3, v2, 0x10

    and-int/2addr v2, v1

    or-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v2

    .line 1720
    :cond_1
    :goto_0
    aget-object v7, v0, v6

    if-eqz v7, :cond_2

    .line 1721
    iget v8, v7, Ll/ᩳۜ᩵;->ۧ:I

    add-int/2addr v4, v8

    .line 1722
    iget v9, v7, Ll/ᩳۜ᩵;->ۢ:I

    sub-int v9, v8, v9

    if-gez v9, :cond_2

    iget-object v9, v7, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v9, :cond_2

    array-length v10, v9

    if-lez v10, :cond_2

    add-int/lit8 v10, v10, -0x1

    and-int v0, v10, v8

    int-to-long v0, v0

    .line 1725
    sget v2, Ll/ܿۜ᩵;->ܰ:I

    shl-long/2addr v0, v2

    sget v2, Ll/ܿۜ᩵;->᩺:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1726
    sget-object v2, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    .line 1727
    invoke-virtual {v2, v9, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡۜ᩵;

    if-eqz v3, :cond_0

    add-int/lit8 v4, v8, 0x1

    .line 1728
    iget v5, v7, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v8, v5, :cond_0

    .line 1729
    invoke-static {v2, v9, v0, v1, v3}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1730
    iput v4, v7, Ll/ᩳۜ᩵;->ۧ:I

    return-object v3

    :cond_2
    add-int/2addr v6, v3

    and-int/2addr v6, v1

    if-ne v6, v2, :cond_1

    if-ne v5, v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    move v5, v4

    const/4 v4, 0x0

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private ܽ(Ll/ᩳۜ᩵;)I
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    .line 1399
    iget-wide v4, v8, Ll/ܿۜ᩵;->᩹:J

    .line 1400
    iget-object v1, v8, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    const/16 v2, 0x20

    ushr-long v2, v4, v2

    long-to-int v3, v2

    int-to-short v2, v3

    const/4 v9, 0x1

    if-ltz v2, :cond_f

    if-eqz v1, :cond_e

    .line 1402
    array-length v3, v1

    if-lez v3, :cond_e

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    long-to-int v6, v4

    const-wide/high16 v11, 0x1000000000000L

    if-eqz v6, :cond_5

    sub-int/2addr v3, v9

    and-int v2, v6, v3

    .line 1405
    aget-object v13, v1, v2

    .line 1406
    iget v14, v0, Ll/ᩳۜ᩵;->ܳ:I

    if-gez v14, :cond_1

    add-long/2addr v11, v4

    goto :goto_0

    :cond_1
    move-wide v11, v4

    :goto_0
    const-wide v0, -0x100000000L

    and-long/2addr v0, v11

    const v2, 0x7fffffff

    and-int v11, v6, v2

    if-eqz v13, :cond_4

    .line 1410
    iget v2, v13, Ll/ᩳۜ᩵;->ܳ:I

    .line 1411
    iget-object v12, v13, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    .line 1412
    iget v3, v13, Ll/ᩳۜ᩵;->᩷:I

    int-to-long v9, v3

    const-wide v15, 0xffffffffL

    and-long/2addr v9, v15

    or-long/2addr v9, v0

    if-ne v2, v6, :cond_4

    .line 1413
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    move-object/from16 v1, p0

    move-wide v6, v9

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1414
    iput v11, v13, Ll/ᩳۜ᩵;->ܳ:I

    .line 1415
    iget v0, v13, Ll/ᩳۜ᩵;->ۜ:I

    if-gez v0, :cond_2

    .line 1416
    invoke-static {v12}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_2
    if-gez v14, :cond_3

    const/4 v0, -0x1

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    const/4 v0, 0x0

    return v0

    :cond_5
    const/16 v0, 0x30

    shr-long v6, v4, v0

    long-to-int v0, v6

    .line 1422
    iget v6, v8, Ll/ܿۜ᩵;->᩸:I

    const v7, 0xffff

    and-int/2addr v6, v7

    int-to-short v6, v6

    sub-int/2addr v0, v6

    if-lez v0, :cond_6

    const-wide/high16 v0, -0x1000000000000L

    sub-long v2, v4, v11

    and-long/2addr v0, v2

    const-wide v2, 0xffffffffffffL

    and-long/2addr v2, v4

    or-long v6, v2, v0

    .line 1425
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    return v0

    .line 1428
    :cond_6
    iget v0, v8, Ll/ܿۜ᩵;->۬:I

    and-int/2addr v0, v7

    add-int v6, v0, v2

    const/4 v7, 0x1

    const/4 v9, 0x0

    move v10, v6

    :goto_1
    if-ge v7, v3, :cond_a

    .line 1432
    aget-object v11, v1, v7

    if-eqz v11, :cond_9

    .line 1433
    iget v12, v11, Ll/ᩳۜ᩵;->ۜ:I

    if-nez v12, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v10, v10, -0x1

    .line 1439
    iget-object v11, v11, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    if-eqz v11, :cond_9

    .line 1440
    invoke-virtual {v11}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v11

    sget-object v12, Ljava/lang/Thread$State;->BLOCKED:Ljava/lang/Thread$State;

    if-eq v11, v12, :cond_8

    sget-object v12, Ljava/lang/Thread$State;->WAITING:Ljava/lang/Thread$State;

    if-ne v11, v12, :cond_9

    :cond_8
    add-int/lit8 v9, v9, 0x1

    :cond_9
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    :cond_a
    if-nez v10, :cond_e

    .line 1446
    iget-wide v10, v8, Ll/ܿۜ᩵;->᩹:J

    cmp-long v1, v10, v4

    if-eqz v1, :cond_b

    goto :goto_2

    :cond_b
    const/16 v1, 0x7fff

    if-ge v6, v1, :cond_c

    .line 1448
    iget v1, v8, Ll/ܿۜ᩵;->᩸:I

    ushr-int/lit8 v1, v1, 0x10

    if-lt v2, v1, :cond_f

    :cond_c
    if-ge v9, v0, :cond_d

    .line 1453
    invoke-static {}, Ljava/lang/Thread;->yield()V

    const/4 v0, 0x0

    return v0

    .line 1457
    :cond_d
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "Thread limit exceeded replacing blocked worker"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_2
    const/4 v0, 0x0

    return v0

    :cond_f
    const-wide v0, 0x100000000L

    add-long/2addr v0, v4

    const-wide v2, 0xffff00000000L

    and-long/2addr v0, v2

    const-wide v2, -0xffff00000001L

    and-long/2addr v2, v4

    or-long v6, v2, v0

    .line 1464
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-direct/range {p0 .. p0}, Ll/ܿۜ᩵;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    return v0

    :cond_10
    const/4 v0, 0x0

    return v0
.end method

.method private ᩳ()Z
    .locals 3

    .line 1207
    iget-object v0, p0, Ll/ܿۜ᩵;->᩶:Ll/۟᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {v0, p0}, Ll/۟᩻᩵;->֫(Ll/ܿۜ᩵;)Ll/ۘۜ᩵;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    .line 1208
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :cond_0
    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 1214
    :goto_0
    invoke-virtual {p0, v1, v0}, Ll/ܿۜ᩵;->֫(Ll/ۘۜ᩵;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 9

    .line 2286
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_f

    .line 2288
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, v0, :cond_9

    .line 2323
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    .line 2325
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    .line 2326
    instance-of p2, p1, Ll/ۘۜ᩵;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ۘۜ᩵;

    iget-object p2, p1, Ll/ۘۜ᩵;->᩸:Ll/ܿۜ᩵;

    if-ne p2, p0, :cond_0

    .line 2328
    iget-object p1, p1, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    invoke-virtual {p0, p1}, Ll/ܿۜ᩵;->֫(Ll/ᩳۜ᩵;)V

    return v2

    .line 2332
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    .line 2334
    :goto_0
    invoke-direct {p0}, Ll/ܿۜ᩵;->ܳ()Ll/ۡۜ᩵;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2335
    invoke-virtual {p1}, Ll/ۡۜ᩵;->ۧ()I

    goto :goto_0

    .line 2133
    :cond_1
    iget-wide p1, p0, Ll/ܿۜ᩵;->᩹:J

    .line 2134
    iget p3, p0, Ll/ܿۜ᩵;->۬:I

    const v0, 0xffff

    and-int/2addr v0, p3

    const/16 v1, 0x20

    ushr-long v7, p1, v1

    long-to-int v1, v7

    int-to-short v1, v1

    add-int/2addr v1, v0

    const/16 v7, 0x30

    shr-long v7, p1, v7

    long-to-int v8, v7

    add-int/2addr v0, v8

    const/high16 v7, -0x7ff80000

    and-int/2addr p3, v7

    if-eqz p3, :cond_2

    goto :goto_3

    :cond_2
    if-lez v0, :cond_3

    goto :goto_2

    .line 2143
    :cond_3
    iget-object p3, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz p3, :cond_6

    const/4 v0, 0x1

    .line 2144
    :goto_1
    array-length v7, p3

    if-ge v0, v7, :cond_6

    .line 2145
    aget-object v7, p3, v0

    if-eqz v7, :cond_5

    .line 2146
    iget v7, v7, Ll/ᩳۜ᩵;->ۜ:I

    const/high16 v8, 0x40000000    # 2.0f

    and-int/2addr v7, v8

    if-nez v7, :cond_4

    :goto_2
    const/4 p1, 0x0

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, -0x1

    :cond_5
    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_6
    if-nez v1, :cond_1

    .line 2152
    iget-wide v0, p0, Ll/ܿۜ᩵;->᩹:J

    cmp-long p3, v0, p1

    if-nez p3, :cond_1

    :goto_3
    const/4 p1, 0x1

    :goto_4
    if-eqz p1, :cond_7

    goto :goto_5

    .line 2338
    :cond_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long/2addr p1, v5

    cmp-long p3, p1, v3

    if-lez p3, :cond_8

    goto :goto_5

    .line 2341
    :cond_8
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    .line 2292
    :cond_9
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 2293
    invoke-virtual {p0}, Ll/ܿۜ᩵;->isTerminated()Z

    move-result p3

    if-eqz p3, :cond_a

    return v1

    :cond_a
    const-wide/16 v3, 0x0

    cmp-long p3, p1, v3

    if-gtz p3, :cond_b

    :goto_5
    return v2

    .line 2297
    :cond_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    add-long/2addr v5, p1

    move-object v0, p0

    .line 2298
    monitor-enter v0

    .line 2300
    :goto_6
    :try_start_0
    invoke-virtual {p0}, Ll/ܿۜ᩵;->isTerminated()Z

    move-result p3

    if-eqz p3, :cond_c

    .line 2301
    monitor-exit v0

    return v1

    :cond_c
    cmp-long p3, p1, v3

    if-gtz p3, :cond_d

    .line 2303
    monitor-exit v0

    return v2

    .line 2304
    :cond_d
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-lez p3, :cond_e

    goto :goto_7

    :cond_e
    const-wide/16 p1, 0x1

    .line 2305
    :goto_7
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 2306
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v5, p1

    goto :goto_6

    :catchall_0
    move-exception p1

    .line 2308
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 2287
    :cond_f
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final synthetic close()V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤ᩻᩵;->֫(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2036
    instance-of v0, p1, Ll/ۡۜ᩵;

    if-eqz v0, :cond_0

    .line 2037
    check-cast p1, Ll/ۡۜ᩵;

    goto :goto_0

    .line 2039
    :cond_0
    new-instance v0, Ll/ۢۜ᩵;

    invoke-direct {v0, p1}, Ll/ۢۜ᩵;-><init>(Ljava/lang/Runnable;)V

    move-object p1, v0

    .line 2040
    :goto_0
    invoke-direct {p0, p1}, Ll/ܿۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    return-void
.end method

.method public final invokeAll(Ljava/util/Collection;)Ljava/util/List;
    .locals 5

    .line 2082
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 2085
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Callable;

    .line 2086
    new-instance v3, Ll/ܳۜ᩵;

    invoke-direct {v3, v2}, Ll/ܳۜ᩵;-><init>(Ljava/util/concurrent/Callable;)V

    .line 2087
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2088
    invoke-direct {p0, v3}, Ll/ܿۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    goto :goto_0

    .line 2090
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_1

    .line 2091
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡۜ᩵;

    invoke-virtual {v3}, Ll/ۡۜ᩵;->ܿ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    .line 2094
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_2

    .line 2095
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Future;

    invoke-interface {v4, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 2107
    :cond_2
    throw p1
.end method

.method public final isShutdown()Z
    .locals 2

    .line 2267
    iget v0, p0, Ll/ܿۜ᩵;->۬:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTerminated()Z
    .locals 2

    .line 2258
    iget v0, p0, Ll/ܿۜ᩵;->۬:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1

    .line 2525
    new-instance v0, Ll/᩻ۜ᩵;

    invoke-direct {v0, p1, p2}, Ll/᩻ۜ᩵;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 1

    .line 2529
    new-instance v0, Ll/ܳۜ᩵;

    invoke-direct {v0, p1}, Ll/ܳۜ᩵;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public final shutdown()V
    .locals 2

    .line 607
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 609
    sget-object v1, Ll/ܿۜ᩵;->᩻֫:Ljava/lang/RuntimePermission;

    invoke-virtual {v0, v1}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2225
    invoke-direct {p0, v0, v1}, Ll/ܿۜ᩵;->֫(ZZ)Z

    return-void
.end method

.method public final shutdownNow()Ljava/util/List;
    .locals 2

    .line 607
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 609
    sget-object v1, Ll/ܿۜ᩵;->᩻֫:Ljava/lang/RuntimePermission;

    invoke-virtual {v0, v1}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    :cond_0
    const/4 v0, 0x1

    .line 2248
    invoke-direct {p0, v0, v0}, Ll/ܿۜ᩵;->֫(ZZ)Z

    .line 2249
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2069
    instance-of v0, p1, Ll/ۡۜ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡۜ᩵;

    goto :goto_0

    :cond_0
    new-instance v0, Ll/ۜۜ᩵;

    invoke-direct {v0, p1}, Ll/ۜۜ᩵;-><init>(Ljava/lang/Runnable;)V

    move-object p1, v0

    :goto_0
    invoke-direct {p0, p1}, Ll/ܿۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    return-object p1
.end method

.method public final submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1

    .line 2058
    new-instance v0, Ll/᩻ۜ᩵;

    invoke-direct {v0, p1, p2}, Ll/᩻ۜ᩵;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Ll/ܿۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    return-object v0
.end method

.method public final submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1

    .line 2049
    new-instance v0, Ll/ܳۜ᩵;

    invoke-direct {v0, p1}, Ll/ܳۜ᩵;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-direct {p0, v0}, Ll/ܿۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 2168
    iget-wide v0, p0, Ll/ܿۜ᩵;->۫:J

    .line 2170
    iget-object v2, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v6, v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 2171
    :goto_0
    array-length v10, v2

    if-ge v8, v10, :cond_4

    .line 2172
    aget-object v10, v2, v8

    if-eqz v10, :cond_2

    .line 757
    iget v11, v10, Ll/ᩳۜ᩵;->ۧ:I

    iget v12, v10, Ll/ᩳۜ᩵;->ۢ:I

    sub-int/2addr v11, v12

    if-ltz v11, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :cond_0
    neg-int v11, v11

    :goto_1
    and-int/lit8 v12, v8, 0x1

    if-nez v12, :cond_1

    int-to-long v10, v11

    add-long/2addr v6, v10

    goto :goto_2

    :cond_1
    int-to-long v11, v11

    add-long/2addr v3, v11

    .line 2178
    iget v11, v10, Ll/ᩳۜ᩵;->ᩳ:I

    int-to-long v11, v11

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    add-long/2addr v0, v11

    .line 1002
    iget-object v10, v10, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    if-eqz v10, :cond_2

    .line 1003
    invoke-virtual {v10}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v10

    sget-object v11, Ljava/lang/Thread$State;->BLOCKED:Ljava/lang/Thread$State;

    if-eq v10, v11, :cond_2

    sget-object v11, Ljava/lang/Thread$State;->WAITING:Ljava/lang/Thread$State;

    if-eq v10, v11, :cond_2

    sget-object v11, Ljava/lang/Thread$State;->TIMED_WAITING:Ljava/lang/Thread$State;

    if-eq v10, v11, :cond_2

    add-int/lit8 v9, v9, 0x1

    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x0

    move-wide v6, v3

    .line 2186
    :cond_4
    iget v2, p0, Ll/ܿۜ᩵;->۬:I

    const v8, 0xffff

    and-int/2addr v8, v2

    .line 2188
    iget-wide v10, p0, Ll/ܿۜ᩵;->᩹:J

    const/16 v12, 0x20

    ushr-long v12, v10, v12

    long-to-int v13, v12

    int-to-short v12, v13

    add-int/2addr v12, v8

    const/16 v13, 0x30

    shr-long/2addr v10, v13

    long-to-int v11, v10

    add-int/2addr v11, v8

    if-gez v11, :cond_5

    goto :goto_3

    :cond_5
    move v5, v11

    :goto_3
    const/high16 v10, 0x80000

    and-int/2addr v10, v2

    if-eqz v10, :cond_6

    const-string v2, "Terminated"

    goto :goto_4

    :cond_6
    const/high16 v10, -0x80000000

    and-int/2addr v10, v2

    if-eqz v10, :cond_7

    const-string v2, "Terminating"

    goto :goto_4

    :cond_7
    const/high16 v10, 0x40000

    and-int/2addr v2, v10

    if-eqz v2, :cond_8

    const-string v2, "Shutting down"

    goto :goto_4

    :cond_8
    const-string v2, "Running"

    .line 2197
    :goto_4
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v13, "["

    const-string v14, ", parallelism = "

    .line 0
    invoke-static {v10, v11, v13, v2, v14}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, ", size = "

    const-string v11, ", active = "

    invoke-static {v10, v8, v2, v12, v11}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v2, ", running = "

    const-string v8, ", steals = "

    invoke-static {v10, v5, v2, v9, v8}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 2197
    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", tasks = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", submissions = "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    .line 0
    invoke-static {v10, v6, v7, v0}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩳۜ᩵;Ll/ۡۜ᩵;J)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-eqz v1, :cond_b

    .line 1581
    invoke-virtual/range {p1 .. p2}, Ll/ᩳۜ᩵;->ۧ(Ll/ۡۜ᩵;)V

    .line 1582
    iget v3, v1, Ll/ᩳۜ᩵;->ۜ:I

    iget v4, v1, Ll/ᩳۜ᩵;->ܽ:I

    .line 1583
    iget v5, v2, Ll/ۡۜ᩵;->᩸:I

    :cond_0
    :goto_0
    if-ltz v5, :cond_a

    .line 1587
    invoke-static {}, Ll/ۚۜ᩵;->ܽ()I

    move-result v5

    const/4 v6, 0x1

    or-int/2addr v5, v6

    .line 1588
    iget-object v7, v0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v7, :cond_2

    .line 1589
    array-length v8, v7

    add-int/lit8 v9, v8, -0x1

    neg-int v10, v8

    :goto_1
    if-ge v10, v8, :cond_2

    add-int v11, v5, v10

    and-int/2addr v11, v9

    if-ltz v11, :cond_1

    if-ge v11, v8, :cond_1

    .line 1591
    aget-object v11, v7, v11

    if-eqz v11, :cond_1

    iget v12, v11, Ll/ᩳۜ᩵;->ۜ:I

    if-ne v12, v4, :cond_1

    iget v12, v11, Ll/ᩳۜ᩵;->ۧ:I

    iget v13, v11, Ll/ᩳۜ᩵;->ۢ:I

    sub-int v13, v12, v13

    if-gez v13, :cond_1

    iget-object v13, v11, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v13, :cond_1

    array-length v14, v13

    if-lez v14, :cond_1

    .line 1595
    iget v5, v11, Ll/ᩳۜ᩵;->ܽ:I

    add-int/lit8 v14, v14, -0x1

    and-int v7, v14, v12

    int-to-long v7, v7

    .line 1597
    sget v9, Ll/ܿۜ᩵;->ܰ:I

    shl-long/2addr v7, v9

    sget v9, Ll/ܿۜ᩵;->᩺:I

    int-to-long v9, v9

    add-long/2addr v7, v9

    .line 1598
    sget-object v9, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    .line 1599
    invoke-virtual {v9, v13, v7, v8}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡۜ᩵;

    if-eqz v10, :cond_3

    add-int/lit8 v14, v12, 0x1

    .line 1600
    iget v15, v11, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v12, v15, :cond_3

    iget v12, v11, Ll/ᩳۜ᩵;->ۜ:I

    if-ne v4, v12, :cond_3

    .line 1601
    invoke-static {v9, v13, v7, v8, v10}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 1602
    iput v14, v11, Ll/ᩳۜ᩵;->ۧ:I

    .line 1603
    iput v5, v1, Ll/ᩳۜ᩵;->ۜ:I

    .line 1604
    invoke-virtual {v10}, Ll/ۡۜ᩵;->ۧ()I

    .line 1605
    iput v3, v1, Ll/ᩳۜ᩵;->ۜ:I

    goto :goto_2

    :cond_1
    add-int/lit8 v10, v10, 0x2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 1612
    :cond_3
    :goto_2
    iget v5, v2, Ll/ۡۜ᩵;->᩸:I

    if-gez v5, :cond_4

    goto :goto_3

    :cond_4
    if-nez v6, :cond_0

    const-wide/16 v6, 0x0

    cmp-long v8, p3, v6

    if-nez v8, :cond_5

    move-wide v8, v6

    goto :goto_4

    .line 1618
    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long v8, p3, v8

    cmp-long v10, v8, v6

    if-gtz v10, :cond_6

    :goto_3
    return v5

    .line 1620
    :cond_6
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    cmp-long v5, v8, v6

    if-gtz v5, :cond_7

    const-wide/16 v8, 0x1

    .line 1622
    :cond_7
    :goto_4
    invoke-direct/range {p0 .. p1}, Ll/ܿۜ᩵;->ܽ(Ll/ᩳۜ᩵;)I

    move-result v5

    if-eqz v5, :cond_9

    .line 1623
    invoke-virtual {v2, v8, v9}, Ll/ۡۜ᩵;->֫(J)V

    .line 1624
    sget-wide v8, Ll/ܿۜ᩵;->ۧ֫:J

    if-lez v5, :cond_8

    const-wide/high16 v6, 0x1000000000000L

    :cond_8
    invoke-static {v0, v8, v9, v6, v7}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    .line 1626
    :cond_9
    iget v5, v2, Ll/ۡۜ᩵;->᩸:I

    goto/16 :goto_0

    :cond_a
    return v5

    :cond_b
    const/4 v1, 0x0

    return v1
.end method

.method public final ֫(Ll/ۘۜ᩵;)Ll/ᩳۜ᩵;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x1

    .line 1246
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 1247
    iget-object v3, v1, Ll/ܿۜ᩵;->ۤ:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v3, :cond_0

    .line 1248
    invoke-virtual {v0, v3}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1249
    :cond_0
    new-instance v3, Ll/ᩳۜ᩵;

    invoke-direct {v3, v1, v0}, Ll/ᩳۜ᩵;-><init>(Ll/ܿۜ᩵;Ll/ۘۜ᩵;)V

    .line 1251
    iget v4, v1, Ll/ܿۜ᩵;->۬:I

    const/high16 v5, 0x10000

    and-int/2addr v4, v5

    .line 1252
    iget-object v5, v1, Ll/ܿۜ᩵;->ۨ:Ljava/lang/String;

    if-eqz v5, :cond_9

    move-object/from16 v16, v5

    .line 1255
    monitor-enter v16

    .line 1256
    :try_start_0
    iget-object v6, v1, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    .line 1257
    iget v7, v1, Ll/ܿۜ᩵;->ۙ:I

    const v8, -0x61c88647

    add-int/2addr v7, v8

    iput v7, v1, Ll/ܿۜ᩵;->ۙ:I

    const/4 v8, 0x0

    if-eqz v6, :cond_8

    .line 1258
    array-length v9, v6

    if-le v9, v2, :cond_8

    add-int/lit8 v10, v9, -0x1

    and-int v11, v7, v10

    shl-int/lit8 v12, v7, 0x1

    or-int/2addr v12, v2

    and-int/2addr v12, v10

    ushr-int/lit8 v13, v9, 0x1

    .line 1264
    :goto_0
    aget-object v14, v6, v12

    if-eqz v14, :cond_3

    iget v14, v14, Ll/ᩳۜ᩵;->ܳ:I

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v14, v15, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v13, v13, -0x1

    if-nez v13, :cond_2

    or-int/lit8 v12, v9, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v12, v12, 0x2

    and-int/2addr v12, v10

    goto :goto_0

    :cond_3
    :goto_1
    or-int/2addr v4, v12

    const/high16 v10, 0x3ffe0000    # 1.984375f

    and-int/2addr v7, v10

    or-int/2addr v4, v7

    .line 1275
    iput v4, v3, Ll/ᩳۜ᩵;->ܽ:I

    iput v4, v3, Ll/ᩳۜ᩵;->ܳ:I

    if-ge v12, v9, :cond_4

    .line 1278
    aput-object v3, v6, v12

    goto :goto_4

    :cond_4
    shl-int/lit8 v4, v9, 0x1

    .line 1281
    new-array v7, v4, [Ll/ᩳۜ᩵;

    .line 1282
    aput-object v3, v7, v12

    sub-int/2addr v4, v2

    :goto_2
    if-ge v8, v9, :cond_7

    .line 1286
    aget-object v2, v6, v8

    if-eqz v2, :cond_5

    .line 1287
    iget v10, v2, Ll/ᩳۜ᩵;->ܽ:I

    and-int/2addr v10, v4

    and-int/lit8 v10, v10, 0x7e

    aput-object v2, v7, v10

    :cond_5
    add-int/lit8 v2, v8, 0x1

    if-lt v2, v9, :cond_6

    goto :goto_3

    .line 1290
    :cond_6
    aget-object v10, v6, v2

    aput-object v10, v7, v2

    add-int/lit8 v8, v8, 0x2

    goto :goto_2

    .line 1292
    :cond_7
    :goto_3
    iput-object v7, v1, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    :goto_4
    move v8, v11

    .line 1295
    :cond_8
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1296
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object v3

    :catchall_0
    move-exception v0

    .line 1295
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_9
    return-object v3
.end method

.method public final ֫(Ll/ۘۜ᩵;Ljava/lang/Throwable;)V
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    const-wide v10, 0xffffffffL

    const/4 v1, 0x0

    const/4 v12, 0x0

    if-eqz v0, :cond_3

    .line 1313
    iget-object v0, v0, Ll/ۘۜ᩵;->᩹:Ll/ᩳۜ᩵;

    if-eqz v0, :cond_2

    .line 1314
    iget-object v2, v9, Ll/ܿۜ᩵;->ۨ:Ljava/lang/String;

    .line 1315
    iget v3, v0, Ll/ᩳۜ᩵;->ᩳ:I

    int-to-long v3, v3

    and-long/2addr v3, v10

    .line 1316
    iget v5, v0, Ll/ᩳۜ᩵;->ܽ:I

    const v6, 0xffff

    and-int/2addr v5, v6

    if-eqz v2, :cond_1

    move-object/from16 v16, v2

    .line 1319
    monitor-enter v16

    .line 1320
    :try_start_0
    iget-object v2, v9, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v2, :cond_0

    array-length v6, v2

    if-le v6, v5, :cond_0

    aget-object v6, v2, v5

    if-ne v6, v0, :cond_0

    .line 1322
    aput-object v1, v2, v5

    .line 1323
    :cond_0
    iget-wide v1, v9, Ll/ܿۜ᩵;->۫:J

    add-long/2addr v1, v3

    iput-wide v1, v9, Ll/ܿۜ᩵;->۫:J

    .line 1324
    monitor-exit v16

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1326
    :cond_1
    :goto_0
    iget v1, v0, Ll/ᩳۜ᩵;->ܳ:I

    goto :goto_1

    :cond_2
    move-object v1, v0

    :cond_3
    const/4 v0, 0x0

    move-object v0, v1

    const/4 v1, 0x0

    :goto_1
    const/high16 v2, 0x40000000    # 2.0f

    if-eq v1, v2, :cond_5

    .line 1330
    :cond_4
    sget-object v1, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v3, Ll/ܿۜ᩵;->ۧ֫:J

    iget-wide v5, v9, Ll/ܿۜ᩵;->᩹:J

    const-wide/high16 v7, 0x1000000000000L

    sub-long v7, v5, v7

    const-wide/high16 v13, -0x1000000000000L

    and-long/2addr v7, v13

    const-wide v13, 0x100000000L

    sub-long v13, v5, v13

    const-wide v15, 0xffff00000000L

    and-long/2addr v13, v15

    or-long/2addr v7, v13

    and-long v13, v5, v10

    or-long/2addr v7, v13

    move-object/from16 v2, p0

    .line 1331
    invoke-virtual/range {v1 .. v8}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_5
    if-eqz v0, :cond_7

    .line 864
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ll/ᩳۜ᩵;->ۧ()Ll/ۡۜ᩵;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 488
    iget v2, v1, Ll/ۡۜ᩵;->᩸:I

    if-ltz v2, :cond_6

    .line 490
    :try_start_1
    invoke-virtual {v1, v12}, Ll/ۡۜ᩵;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    nop

    goto :goto_2

    .line 1338
    :cond_7
    invoke-direct {v9, v12, v12}, Ll/ܿۜ᩵;->֫(ZZ)Z

    move-result v1

    if-nez v1, :cond_8

    if-eqz v0, :cond_8

    iget-object v0, v0, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v0, :cond_8

    .line 1340
    invoke-virtual/range {p0 .. p0}, Ll/ܿۜ᩵;->ܽ()V

    :cond_8
    if-nez p2, :cond_9

    .line 1343
    invoke-static {}, Ll/ۡۜ᩵;->ۡ()V

    return-void

    .line 1345
    :cond_9
    sget v0, Ll/ۡۜ᩵;->᩹:I

    .line 2107
    throw p2
.end method

.method public final ֫(Ll/ᩳۜ᩵;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1639
    iget v2, v1, Ll/ᩳۜ᩵;->ۜ:I

    iget v3, v1, Ll/ᩳۜ᩵;->ܽ:I

    const/high16 v4, 0x10000

    and-int/2addr v3, v4

    const/4 v4, -0x1

    const/4 v5, -0x1

    move v6, v2

    :goto_0
    const/4 v7, 0x0

    if-eqz v3, :cond_0

    .line 1643
    invoke-virtual {v1, v7}, Ll/ᩳۜ᩵;->֫(I)V

    goto :goto_1

    .line 1645
    :cond_0
    invoke-virtual {v1, v7}, Ll/ᩳۜ᩵;->ۧ(I)V

    :goto_1
    if-ne v5, v4, :cond_1

    .line 1646
    iget v4, v1, Ll/ᩳۜ᩵;->ܳ:I

    if-ltz v4, :cond_1

    const/4 v5, 0x1

    .line 1649
    :cond_1
    invoke-static {}, Ll/ۚۜ᩵;->ܽ()I

    move-result v4

    .line 1650
    iget-object v7, v0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    const-wide/high16 v8, 0x1000000000000L

    if-eqz v7, :cond_9

    .line 1651
    array-length v10, v7

    add-int/lit8 v11, v10, -0x1

    const/4 v12, 0x1

    move v13, v10

    :goto_2
    if-lez v13, :cond_8

    sub-int v14, v4, v13

    and-int/2addr v14, v11

    if-ltz v14, :cond_6

    if-ge v14, v10, :cond_6

    .line 1653
    aget-object v14, v7, v14

    if-eqz v14, :cond_6

    .line 1654
    iget v15, v14, Ll/ᩳۜ᩵;->ۧ:I

    move/from16 v16, v3

    iget v3, v14, Ll/ᩳۜ᩵;->ۢ:I

    sub-int v3, v15, v3

    if-gez v3, :cond_4

    iget-object v3, v14, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v3, :cond_4

    const/high16 v17, 0x40000000    # 2.0f

    move/from16 v18, v4

    array-length v4, v3

    if-lez v4, :cond_5

    if-nez v5, :cond_2

    .line 1658
    sget-wide v10, Ll/ܿۜ᩵;->ۧ֫:J

    invoke-static {v0, v10, v11, v8, v9}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    const/4 v5, 0x1

    :cond_2
    add-int/lit8 v4, v4, -0x1

    and-int/2addr v4, v15

    int-to-long v7, v4

    .line 1661
    sget v4, Ll/ܿۜ᩵;->ܰ:I

    shl-long/2addr v7, v4

    sget v4, Ll/ܿۜ᩵;->᩺:I

    int-to-long v9, v4

    add-long/2addr v7, v9

    .line 1662
    sget-object v4, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    .line 1663
    invoke-virtual {v4, v3, v7, v8}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡۜ᩵;

    if-eqz v9, :cond_3

    add-int/lit8 v10, v15, 0x1

    .line 1664
    iget v11, v14, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v15, v11, :cond_3

    .line 1665
    invoke-static {v4, v3, v7, v8, v9}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1666
    iput v10, v14, Ll/ᩳۜ᩵;->ۧ:I

    .line 1667
    iget v3, v14, Ll/ᩳۜ᩵;->ܽ:I

    iput v3, v1, Ll/ᩳۜ᩵;->ۜ:I

    .line 1668
    invoke-virtual {v9}, Ll/ۡۜ᩵;->ۧ()I

    .line 1669
    iput v2, v1, Ll/ᩳۜ᩵;->ۜ:I

    move v6, v2

    :cond_3
    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    move/from16 v18, v4

    const/high16 v17, 0x40000000    # 2.0f

    .line 1674
    :cond_5
    iget v3, v14, Ll/ᩳۜ᩵;->ۜ:I

    and-int v3, v3, v17

    if-nez v3, :cond_7

    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_3

    :cond_6
    move/from16 v16, v3

    move/from16 v18, v4

    :cond_7
    :goto_3
    add-int/lit8 v13, v13, -0x1

    const-wide/high16 v8, 0x1000000000000L

    move/from16 v3, v16

    move/from16 v4, v18

    goto :goto_2

    :cond_8
    move/from16 v16, v3

    const/4 v3, 0x1

    goto :goto_4

    :cond_9
    move/from16 v16, v3

    const/4 v3, 0x1

    const/4 v12, 0x1

    :goto_4
    if-eqz v12, :cond_b

    if-nez v5, :cond_a

    .line 1681
    sget-wide v3, Ll/ܿۜ᩵;->ۧ֫:J

    const-wide/high16 v5, 0x1000000000000L

    invoke-static {v0, v3, v4, v5, v6}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    .line 1682
    :cond_a
    iput v2, v1, Ll/ᩳۜ᩵;->ۜ:I

    return-void

    :cond_b
    if-eqz v3, :cond_d

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v6, v3, :cond_c

    .line 1687
    iput v3, v1, Ll/ᩳۜ᩵;->ۜ:I

    const/high16 v6, 0x40000000    # 2.0f

    :cond_c
    const/4 v3, 0x1

    if-ne v5, v3, :cond_d

    .line 1690
    sget-wide v3, Ll/ܿۜ᩵;->ۧ֫:J

    const-wide/high16 v7, -0x1000000000000L

    invoke-static {v0, v3, v4, v7, v8}, Ll/ܿۜ᩵;->֫(Ljava/lang/Object;JJ)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    :cond_d
    const/4 v4, -0x1

    move/from16 v3, v16

    goto/16 :goto_0
.end method

.method public final ֫(Ll/ۡۜ᩵;)Z
    .locals 4

    .line 1843
    invoke-static {}, Ll/ۚۜ᩵;->֫()I

    move-result v0

    .line 1845
    iget-object v1, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    and-int/2addr v0, v2

    and-int/lit8 v0, v0, 0x7e

    aget-object v0, v1, v0

    if-eqz v0, :cond_0

    .line 1848
    invoke-virtual {v0, p1}, Ll/ᩳۜ᩵;->ܽ(Ll/ۡۜ᩵;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ᩳۜ᩵;)V
    .locals 25

    move-object/from16 v0, p1

    .line 1473
    invoke-virtual/range {p1 .. p1}, Ll/ᩳۜ᩵;->֫()V

    .line 1474
    iget v1, v0, Ll/ᩳۜ᩵;->ܽ:I

    invoke-static {}, Ll/ۚۜ᩵;->ܽ()I

    move-result v2

    xor-int/2addr v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    const/4 v2, 0x0

    move-object/from16 v11, p0

    move-object v3, v0

    .line 1478
    :goto_0
    iget-object v4, v11, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-eqz v4, :cond_11

    .line 1480
    array-length v5, v4

    add-int/lit8 v6, v5, -0x1

    const/4 v7, 0x0

    move-object v12, v3

    move v3, v5

    :goto_1
    if-lez v3, :cond_7

    and-int v8, v1, v6

    if-ltz v8, :cond_5

    if-ge v8, v5, :cond_5

    .line 1482
    aget-object v8, v4, v8

    if-eqz v8, :cond_5

    iget v9, v8, Ll/ᩳۜ᩵;->ۧ:I

    iget v10, v8, Ll/ᩳۜ᩵;->ۢ:I

    sub-int v10, v9, v10

    if-gez v10, :cond_5

    iget-object v10, v8, Ll/ᩳۜ᩵;->֫:[Ll/ۡۜ᩵;

    if-eqz v10, :cond_5

    array-length v13, v10

    if-lez v13, :cond_5

    .line 1485
    iget v7, v8, Ll/ᩳۜ᩵;->ܽ:I

    add-int/lit8 v13, v13, -0x1

    and-int v12, v13, v9

    int-to-long v12, v12

    .line 1487
    sget v14, Ll/ܿۜ᩵;->ܰ:I

    shl-long/2addr v12, v14

    sget v14, Ll/ܿۜ᩵;->᩺:I

    move-object/from16 v16, v4

    move/from16 v17, v5

    int-to-long v4, v14

    add-long/2addr v12, v4

    .line 1488
    sget-object v4, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    .line 1489
    invoke-virtual {v4, v10, v12, v13}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡۜ᩵;

    if-eqz v5, :cond_4

    add-int/lit8 v14, v9, 0x1

    .line 1490
    iget v15, v8, Ll/ᩳۜ᩵;->ۧ:I

    if-ne v9, v15, :cond_4

    .line 1491
    invoke-static {v4, v10, v12, v13, v5}, Ll/ۛ᩻᩵;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1492
    iput v14, v8, Ll/ᩳۜ᩵;->ۧ:I

    iget v4, v8, Ll/ᩳۜ᩵;->ۢ:I

    sub-int/2addr v14, v4

    if-gez v14, :cond_1

    if-eq v7, v2, :cond_1

    .line 1493
    invoke-virtual {v11}, Ll/ܿۜ᩵;->ܽ()V

    .line 1494
    :cond_1
    iput v7, v0, Ll/ᩳۜ᩵;->ۜ:I

    .line 1495
    invoke-virtual {v5}, Ll/ۡۜ᩵;->ۧ()I

    .line 1496
    iget v2, v0, Ll/ᩳۜ᩵;->ܽ:I

    const/high16 v4, 0x10000

    and-int/2addr v2, v4

    const/16 v4, 0x400

    if-eqz v2, :cond_2

    .line 1497
    invoke-virtual {v0, v4}, Ll/ᩳۜ᩵;->֫(I)V

    goto :goto_2

    .line 1499
    :cond_2
    invoke-virtual {v0, v4}, Ll/ᩳۜ᩵;->ۧ(I)V

    .line 1500
    :goto_2
    iget-object v2, v0, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    .line 1501
    iget v4, v0, Ll/ᩳۜ᩵;->ᩳ:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Ll/ᩳۜ᩵;->ᩳ:I

    const/4 v4, 0x0

    .line 1502
    iput v4, v0, Ll/ᩳۜ᩵;->ۜ:I

    if-eqz v2, :cond_3

    .line 1504
    invoke-virtual {v2}, Ll/ۘۜ᩵;->֫()V

    :cond_3
    move v2, v7

    :cond_4
    const/4 v4, 0x1

    move-object v12, v0

    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    move-object/from16 v16, v4

    move/from16 v17, v5

    const/high16 v4, 0x10000

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v1, v1, 0x1

    :goto_3
    add-int/lit8 v3, v3, -0x1

    move-object/from16 v4, v16

    move/from16 v5, v17

    goto/16 :goto_1

    :cond_7
    const/high16 v4, 0x10000

    :goto_4
    if-eqz v7, :cond_8

    shl-int/lit8 v3, v1, 0xd

    xor-int/2addr v1, v3

    ushr-int/lit8 v3, v1, 0x11

    xor-int/2addr v1, v3

    shl-int/lit8 v3, v1, 0x5

    xor-int/2addr v1, v3

    goto :goto_7

    .line 1520
    :cond_8
    iget v2, v12, Ll/ᩳۜ᩵;->ܳ:I

    const-wide v13, 0xffffffffL

    const-wide v15, -0x100000000L

    if-ltz v2, :cond_a

    add-int/2addr v2, v4

    const/high16 v3, -0x80000000

    or-int/2addr v2, v3

    .line 1521
    iput v2, v12, Ll/ᩳۜ᩵;->ܳ:I

    .line 1524
    :cond_9
    iget-wide v7, v11, Ll/ܿۜ᩵;->᩹:J

    long-to-int v3, v7

    iput v3, v12, Ll/ᩳۜ᩵;->᩷:I

    const-wide/high16 v3, 0x1000000000000L

    sub-long v3, v7, v3

    and-long/2addr v3, v15

    int-to-long v5, v2

    and-long/2addr v5, v13

    or-long v9, v5, v3

    .line 1526
    sget-object v3, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v5, Ll/ܿۜ᩵;->ۧ֫:J

    move-object v4, v11

    invoke-virtual/range {v3 .. v10}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_6

    .line 1529
    :cond_a
    iget v3, v12, Ll/ᩳۜ᩵;->᩷:I

    const/high16 v4, -0x40000000    # -2.0f

    .line 1530
    iput v4, v12, Ll/ᩳۜ᩵;->ۜ:I

    const/4 v4, 0x0

    .line 1533
    :goto_5
    iget v5, v12, Ll/ᩳۜ᩵;->ܳ:I

    if-ltz v5, :cond_b

    const/4 v2, 0x0

    .line 1534
    iput v2, v12, Ll/ᩳۜ᩵;->ۜ:I

    :goto_6
    const/4 v2, 0x0

    :goto_7
    move-object v3, v12

    goto/16 :goto_0

    .line 1537
    :cond_b
    iget v5, v11, Ll/ܿۜ᩵;->۬:I

    if-gez v5, :cond_c

    goto/16 :goto_9

    :cond_c
    const v6, 0xffff

    and-int/2addr v6, v5

    .line 1539
    iget-wide v7, v11, Ll/ܿۜ᩵;->᩹:J

    const/16 v9, 0x30

    shr-long v9, v7, v9

    long-to-int v10, v9

    add-int/2addr v6, v10

    if-gtz v6, :cond_d

    const/high16 v9, 0x40000

    and-int/2addr v5, v9

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    .line 1542
    invoke-direct {v11, v5, v5}, Ll/ܿۜ᩵;->֫(ZZ)Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v5, v4, 0x1

    if-nez v5, :cond_e

    .line 1545
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    goto :goto_8

    :cond_e
    if-gtz v6, :cond_f

    if-eqz v3, :cond_f

    long-to-int v5, v7

    if-ne v2, v5, :cond_f

    .line 1547
    iget-wide v5, v11, Ll/ܿۜ᩵;->ۗ:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    add-long/2addr v9, v5

    .line 1548
    invoke-static {v11, v9, v10}, Ljava/util/concurrent/locks/LockSupport;->parkUntil(Ljava/lang/Object;J)V

    .line 1549
    iget-wide v5, v11, Ll/ܿۜ᩵;->᩹:J

    cmp-long v17, v5, v7

    if-nez v17, :cond_10

    .line 1550
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v9, v5

    const-wide/16 v5, 0x14

    cmp-long v17, v9, v5

    if-gtz v17, :cond_10

    const-wide v5, 0x100000000L

    sub-long v5, v7, v5

    and-long/2addr v5, v15

    int-to-long v9, v3

    and-long/2addr v9, v13

    or-long v23, v9, v5

    .line 1553
    sget-object v17, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v19, Ll/ܿۜ᩵;->ۧ֫:J

    move-object/from16 v18, v11

    move-wide/from16 v21, v7

    invoke-virtual/range {v17 .. v24}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v0, 0x40000000    # 2.0f

    .line 1554
    iput v0, v12, Ll/ᩳۜ᩵;->ܳ:I

    return-void

    .line 1560
    :cond_f
    invoke-static/range {p0 .. p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    :cond_10
    :goto_8
    move-object/from16 v11, p0

    goto :goto_5

    :cond_11
    :goto_9
    return-void
.end method

.method public final ܽ()V
    .locals 14

    .line 1354
    :cond_0
    iget-wide v4, p0, Ll/ܿۜ᩵;->᩹:J

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-ltz v2, :cond_1

    goto :goto_0

    :cond_1
    long-to-int v2, v4

    if-nez v2, :cond_2

    const-wide v2, 0x800000000000L

    and-long/2addr v2, v4

    cmp-long v6, v2, v0

    if-eqz v6, :cond_6

    .line 1358
    invoke-direct {p0, v4, v5}, Ll/ܿۜ᩵;->ۧ(J)V

    return-void

    .line 1361
    :cond_2
    iget-object v0, p0, Ll/ܿۜ᩵;->ۛ:[Ll/ᩳۜ᩵;

    if-nez v0, :cond_3

    goto :goto_0

    .line 1363
    :cond_3
    array-length v1, v0

    const v3, 0xffff

    and-int/2addr v3, v2

    if-gt v1, v3, :cond_4

    goto :goto_0

    .line 1365
    :cond_4
    aget-object v8, v0, v3

    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    const v0, 0x7fffffff

    and-int v9, v2, v0

    .line 1369
    iget v0, v8, Ll/ᩳۜ᩵;->ܳ:I

    .line 1370
    iget v1, v8, Ll/ᩳۜ᩵;->᩷:I

    int-to-long v6, v1

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    const-wide/high16 v10, 0x1000000000000L

    add-long/2addr v10, v4

    const-wide v12, -0x100000000L

    and-long/2addr v10, v12

    or-long/2addr v6, v10

    .line 1371
    iget-object v10, v8, Ll/ᩳۜ᩵;->ܿ:Ll/ۘۜ᩵;

    if-ne v2, v0, :cond_0

    .line 1372
    sget-object v0, Ll/ܿۜ᩵;->ᩳ֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ܿۜ᩵;->ۧ֫:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1373
    iput v9, v8, Ll/ᩳۜ᩵;->ܳ:I

    .line 1374
    iget v0, v8, Ll/ᩳۜ᩵;->ۜ:I

    if-gez v0, :cond_6

    .line 1375
    invoke-static {v10}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_6
    :goto_0
    return-void
.end method
