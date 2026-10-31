.class public final Ll/ۗ᩻᩵;
.super Ljava/lang/Object;
.source "I6PU"

# interfaces
.implements Ljava/util/concurrent/Future;
.implements Ll/۫᩻᩵;


# static fields
.field public static final ۗ:Ll/᩻᩻᩵;

.field public static final ۙ:J

.field public static final ۛ:Z

.field public static final ۤ:Lsun/misc/Unsafe;

.field public static final ۫:J

.field public static final ۬:J

.field public static final ᩶:Ljava/util/concurrent/Executor;


# instance fields
.field public volatile ᩸:Ljava/lang/Object;

.field public volatile ᩹:Ll/ۘ᩻᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 281
    const-class v0, Ll/ۗ᩻᩵;

    new-instance v1, Ll/᩻᩻᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    sput-object v1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    .line 2117
    sget v1, Ll/ܿۜ᩵;->֫֫:I

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 425
    :goto_0
    sput-boolean v2, Ll/ۗ᩻᩵;->ۛ:Z

    if-eqz v2, :cond_1

    .line 2023
    sget-object v1, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    goto :goto_1

    .line 432
    :cond_1
    new-instance v1, Ll/᩵᩻᩵;

    .line 435
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 432
    :goto_1
    sput-object v1, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    .line 3023
    sget-object v1, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v1, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    :try_start_0
    const-string v2, "\u1a78"

    .line 3030
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ۗ᩻᩵;->۬:J

    const-string v2, "\u1a79"

    .line 3032
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ۗ᩻᩵;->۫:J

    .line 3033
    const-class v0, Ll/ۘ᩻᩵;

    const-string v2, "\u06e4"

    .line 3034
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ll/ۗ᩻᩵;->ۙ:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 3036
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 1965
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1971
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1972
    iput-object p1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-void
.end method

.method private ֫(Z)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1875
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    move-object v2, v0

    .line 1880
    :cond_1
    :goto_0
    iget-object v3, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v3, :cond_5

    if-nez v2, :cond_2

    .line 1882
    new-instance v2, Ll/ᩴ᩻᩵;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v4, v2

    move v9, p1

    invoke-direct/range {v4 .. v9}, Ll/ᩴ᩻᩵;-><init>(JJZ)V

    .line 1883
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    instance-of v3, v3, Ll/ۘۜ᩵;

    if-eqz v3, :cond_1

    .line 2684
    sget-object v3, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    .line 1884
    invoke-static {v3, v2}, Ll/ܿۜ᩵;->֫(Ljava/util/concurrent/Executor;Ll/ᩴ᩻᩵;)V

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    .line 1887
    invoke-virtual {p0, v2}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;)Z

    move-result v1

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 1888
    iget-boolean v3, v2, Ll/ᩴ᩻᩵;->ۨ:Z

    if-eqz v3, :cond_4

    .line 1889
    iput-object v0, v2, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    .line 1890
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ۧ()V

    return-object v0

    .line 1895
    :cond_4
    :try_start_0
    invoke-static {v2}, Ll/ܿۜ᩵;->֫(Ll/ᩴ᩻᩵;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v3, 0x1

    .line 1897
    iput-boolean v3, v2, Ll/ᩴ᩻᩵;->ۨ:Z

    goto :goto_0

    :cond_5
    if-eqz v2, :cond_6

    .line 1902
    iput-object v0, v2, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    .line 1903
    iget-boolean p1, v2, Ll/ᩴ᩻᩵;->ۨ:Z

    if-eqz p1, :cond_6

    .line 1904
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 1906
    :cond_6
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܳ()V

    return-object v3
.end method

.method public static ֫(Ljava/lang/IllegalStateException;)Ll/ۗ᩻᩵;
    .locals 2

    .line 2864
    new-instance v0, Ll/ۗ᩻᩵;

    new-instance v1, Ll/᩻᩻᩵;

    invoke-direct {v1, p0}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ll/ۗ᩻᩵;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫(Ll/֡᩵ᩳ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۗ᩻᩵;
    .locals 2

    .line 447
    sget-boolean v0, Ll/ۗ᩻᩵;->ۛ:Z

    if-nez v0, :cond_0

    .line 2023
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    if-ne p1, v0, :cond_0

    .line 448
    sget-object p1, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1814
    :goto_0
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 1815
    new-instance v1, Ll/ۜ᩻᩵;

    .line 1787
    invoke-direct {v1}, Ll/ۡۜ᩵;-><init>()V

    .line 1788
    iput-object v0, v1, Ll/ۜ᩻᩵;->ۤ:Ll/ۗ᩻᩵;

    iput-object p0, v1, Ll/ۜ᩻᩵;->ۛ:Ll/֡᩵ᩳ;

    .line 1815
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static ֫(Ll/ۘ֫ܿ;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;
    .locals 2

    .line 447
    sget-boolean v0, Ll/ۗ᩻᩵;->ۛ:Z

    if-nez v0, :cond_0

    .line 2023
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    if-ne p1, v0, :cond_0

    .line 448
    sget-object p1, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1778
    :goto_0
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 1779
    new-instance v1, Ll/᩷᩻᩵;

    .line 1751
    invoke-direct {v1}, Ll/ۡۜ᩵;-><init>()V

    .line 1752
    iput-object v0, v1, Ll/᩷᩻᩵;->ۤ:Ll/ۗ᩻᩵;

    iput-object p0, v1, Ll/᩷᩻᩵;->ۛ:Ll/ۘ֫ܿ;

    .line 1779
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static varargs ֫([Ll/ۗ᩻᩵;)Ll/ۗ᩻᩵;
    .locals 2

    .line 2491
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ll/ۗ᩻᩵;->֫([Ll/ۗ᩻᩵;II)Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ll/ۗ᩻᩵;II)Ll/ۗ᩻᩵;
    .locals 5

    .line 1507
    sget-object v0, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    if-le p1, p2, :cond_0

    .line 1509
    iput-object v0, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v1

    :cond_0
    add-int v2, p1, p2

    ushr-int/lit8 v2, v2, 0x1

    if-ne p1, v2, :cond_1

    .line 1513
    aget-object v3, p0, p1

    goto :goto_0

    .line 1514
    :cond_1
    invoke-static {p0, p1, v2}, Ll/ۗ᩻᩵;->֫([Ll/ۗ᩻᩵;II)Ll/ۗ᩻᩵;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_d

    if-ne p1, p2, :cond_2

    move-object p0, v3

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    if-ne p2, v2, :cond_3

    aget-object p0, p0, p2

    goto :goto_1

    .line 1516
    :cond_3
    invoke-static {p0, v2, p2}, Ll/ۗ᩻᩵;->֫([Ll/ۗ᩻᩵;II)Ll/ۗ᩻᩵;

    move-result-object p0

    :goto_1
    if-eqz p0, :cond_d

    .line 1518
    iget-object p1, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz p1, :cond_8

    iget-object p2, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez p2, :cond_4

    goto :goto_2

    .line 1520
    :cond_4
    instance-of p0, p1, Ll/᩻᩻᩵;

    if-eqz p0, :cond_5

    move-object p0, p1

    check-cast p0, Ll/᩻᩻᩵;

    iget-object p0, p0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-nez p0, :cond_6

    :cond_5
    instance-of p0, p2, Ll/᩻᩻᩵;

    if-eqz p0, :cond_7

    move-object p0, p2

    check-cast p0, Ll/᩻᩻᩵;

    iget-object p0, p0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz p0, :cond_7

    move-object p1, p2

    .line 1524
    :cond_6
    invoke-static {p1, p0}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v1

    .line 1526
    :cond_7
    iput-object v0, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v1

    .line 1519
    :cond_8
    :goto_2
    new-instance p1, Ll/ܺ᩻᩵;

    .line 1202
    invoke-direct {p1, v4, v1, v3}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p0, p1, Ll/ۡ᩻᩵;->ܰ:Ll/ۗ᩻᩵;

    .line 1232
    :cond_9
    iget-object p2, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez p2, :cond_c

    .line 1233
    invoke-virtual {v3, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 1234
    iget-object p2, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez p2, :cond_a

    .line 1235
    new-instance p2, Ll/ۖ᩻᩵;

    .line 1210
    invoke-direct {p2}, Ll/ۘ᩻᩵;-><init>()V

    iput-object p1, p2, Ll/ۖ᩻᩵;->ۛ:Ll/ܺ᩻᩵;

    .line 1235
    invoke-virtual {p0, p2}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v1

    .line 1236
    :cond_a
    iget-object p0, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz p0, :cond_b

    const/4 p0, 0x0

    .line 1237
    invoke-virtual {p1, p0}, Ll/ܺ᩻᩵;->֫(I)Ll/ۗ᩻᩵;

    :cond_b
    return-object v1

    .line 1241
    :cond_c
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v1

    .line 1517
    :cond_d
    throw v4
.end method

.method public static ֫(Ll/ۘ᩻᩵;Ll/ۘ᩻᩵;)V
    .locals 3

    .line 482
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۗ᩻᩵;->ۙ:J

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 323
    instance-of v0, p1, Ll/۬᩻᩵;

    if-nez v0, :cond_0

    .line 324
    new-instance p0, Ll/۬᩻᩵;

    .line 66
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    move-object p1, p0

    goto :goto_0

    .line 325
    :cond_0
    instance-of v0, p0, Ll/᩻᩻᩵;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ll/᩻᩻᩵;

    iget-object v0, v0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-ne p1, v0, :cond_1

    return-object p0

    .line 327
    :cond_1
    :goto_0
    new-instance p0, Ll/᩻᩻᩵;

    invoke-direct {p0, p1}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method private ܽ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;
    .locals 3

    .line 793
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 2669
    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    .line 803
    instance-of v2, v0, Ll/᩻᩻᩵;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ll/᩻᩻᩵;

    iget-object v2, v2, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v2, :cond_0

    .line 804
    invoke-static {v0, v2}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v1

    :cond_0
    if-eqz p2, :cond_1

    .line 808
    :try_start_0
    new-instance v0, Ll/᩶᩻᩵;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0, p1}, Ll/᩶᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;Ljava/lang/Runnable;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v1

    .line 810
    :cond_1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 811
    sget-object p1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    iput-object p1, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 814
    invoke-static {p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;

    move-result-object p1

    iput-object p1, v1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v1

    .line 2669
    :cond_2
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 796
    new-instance v1, Ll/᩶᩻᩵;

    invoke-direct {v1, p2, v0, p0, p1}, Ll/᩶᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0
.end method

.method public static ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;
    .locals 2

    .line 305
    new-instance v0, Ll/᩻᩻᩵;

    instance-of v1, p0, Ll/۬᩻᩵;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v1

    .line 305
    :goto_0
    invoke-direct {v0, p0}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ܿ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p0, :cond_4

    .line 381
    instance-of v0, p0, Ll/᩻᩻᩵;

    if-eqz v0, :cond_3

    .line 383
    check-cast p0, Ll/᩻᩻᩵;

    iget-object p0, p0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 385
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_2

    .line 387
    instance-of v0, p0, Ll/۬᩻᩵;

    if-eqz v0, :cond_1

    .line 388
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p0, v0

    .line 390
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 386
    :cond_2
    check-cast p0, Ljava/util/concurrent/CancellationException;

    throw p0

    :cond_3
    return-object p0

    .line 380
    :cond_4
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0
.end method

.method public static ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;
    .locals 1

    .line 2042
    new-instance v0, Ll/ۗ᩻᩵;

    if-nez p0, :cond_0

    sget-object p0, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    :cond_0
    invoke-direct {v0, p0}, Ll/ۗ᩻᩵;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 5

    .line 2550
    iget-object p1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    new-instance p1, Ll/᩻᩻᩵;

    new-instance v2, Ljava/util/concurrent/CancellationException;

    invoke-direct {v2}, Ljava/util/concurrent/CancellationException;-><init>()V

    invoke-direct {p1, v2}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    .line 254
    sget-object v2, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v3, Ll/ۗ᩻᩵;->۬:J

    invoke-static {v2, p0, v3, v4, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2552
    :goto_0
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܳ()V

    if-nez p1, :cond_2

    .line 2553
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->isCancelled()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 2068
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2069
    invoke-direct {p0, v0}, Ll/ۗ᩻᩵;->֫(Z)Ljava/lang/Object;

    move-result-object v0

    .line 2070
    :cond_0
    invoke-static {v0}, Ll/ۗ᩻᩵;->ܿ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    .line 2089
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    .line 2091
    iget-object v3, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v3, :cond_c

    .line 1915
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    add-long/2addr v3, v1

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    const-wide/16 v3, 0x1

    :cond_0
    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v8, 0x0

    move-object v8, v13

    move-object v9, v8

    const/4 v14, 0x0

    :goto_0
    if-nez v7, :cond_7

    .line 1921
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v15

    if-eqz v15, :cond_1

    move-object v3, v9

    :goto_1
    move v7, v15

    goto :goto_6

    .line 1923
    :cond_1
    iget-object v12, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    cmp-long v7, v1, v5

    if-gtz v7, :cond_3

    :goto_2
    move-object v3, v12

    goto :goto_1

    :cond_3
    if-nez v8, :cond_5

    .line 1928
    new-instance v10, Ll/ᩴ᩻᩵;

    const/16 v16, 0x1

    move-object v7, v10

    move-wide v8, v1

    move-object v5, v10

    move-wide v10, v3

    move-object v6, v12

    move/from16 v12, v16

    invoke-direct/range {v7 .. v12}, Ll/ᩴ᩻᩵;-><init>(JJZ)V

    .line 1929
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    instance-of v7, v7, Ll/ۘۜ᩵;

    if-eqz v7, :cond_4

    .line 2684
    sget-object v7, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    .line 1930
    invoke-static {v7, v5}, Ll/ܿۜ᩵;->֫(Ljava/util/concurrent/Executor;Ll/ᩴ᩻᩵;)V

    :cond_4
    move-object v8, v5

    goto :goto_3

    :cond_5
    move-object v6, v12

    if-nez v14, :cond_6

    .line 1933
    invoke-virtual {v0, v8}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;)Z

    move-result v14

    :goto_3
    move-object v9, v6

    move v7, v15

    :goto_4
    const-wide/16 v5, 0x0

    goto :goto_0

    .line 1936
    :cond_6
    :try_start_0
    invoke-static {v8}, Ll/ܿۜ᩵;->֫(Ll/ᩴ᩻᩵;)V

    .line 1937
    iget-boolean v7, v8, Ll/ᩴ᩻᩵;->ۨ:Z

    .line 1938
    iget-wide v1, v8, Ll/ᩴ᩻᩵;->ܰ:J
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    const/4 v7, 0x1

    :goto_5
    move-object v9, v6

    goto :goto_4

    :cond_7
    move-object v3, v9

    :goto_6
    if-eqz v8, :cond_8

    .line 1945
    iput-object v13, v8, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    if-nez v3, :cond_8

    .line 1947
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩻᩵;->ۧ()V

    :cond_8
    if-eqz v3, :cond_a

    if-eqz v7, :cond_9

    .line 1951
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1952
    :cond_9
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩻᩵;->ܳ()V

    goto :goto_7

    :cond_a
    if-eqz v7, :cond_b

    move-object v3, v13

    goto :goto_7

    .line 1957
    :cond_b
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw v1

    .line 2093
    :cond_c
    :goto_7
    invoke-static {v3}, Ll/ۗ᩻᩵;->ܿ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public final isCancelled()Z
    .locals 2

    .line 2565
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    instance-of v1, v0, Ll/᩻᩻᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩻᩻᩵;

    iget-object v0, v0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isDone()Z
    .locals 1

    .line 2052
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 2641
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    .line 2643
    iget-object v1, p0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    const/4 v2, 0x0

    :goto_0
    if-eqz v1, :cond_0

    add-int/lit8 v2, v2, 0x1

    iget-object v1, v1, Ll/ۘ᩻᩵;->ۤ:Ll/ۘ᩻᩵;

    goto :goto_0

    .line 2645
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_2

    if-nez v2, :cond_1

    const-string v0, "[Not completed]"

    goto :goto_1

    :cond_1
    const-string v0, "[Not completed, "

    const-string v3, " dependents]"

    .line 0
    invoke-static {v2, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 2645
    :cond_2
    instance-of v2, v0, Ll/᩻᩻᩵;

    if-eqz v2, :cond_3

    check-cast v0, Ll/᩻᩻᩵;

    iget-object v2, v0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[Completed exceptionally: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v0, "[Completed normally]"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۗ᩻᩵;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ljava/lang/Runnable;)Ll/ۗ᩻᩵;
    .locals 1

    const/4 v0, 0x0

    .line 2191
    invoke-direct {p0, p1, v0}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;
    .locals 1

    if-eqz p1, :cond_2

    .line 594
    iget-object v0, p1, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-eqz v0, :cond_2

    .line 596
    iget-object v0, p1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 597
    invoke-virtual {p1}, Ll/ۗ᩻᩵;->ۧ()V

    :cond_0
    if-ltz p2, :cond_2

    if-nez v0, :cond_1

    .line 598
    iget-object v0, p1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 599
    :cond_1
    invoke-virtual {p1}, Ll/ۗ᩻᩵;->ܳ()V

    .line 601
    :cond_2
    iget-object p1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-eqz p1, :cond_4

    if-gez p2, :cond_3

    return-object p0

    .line 605
    :cond_3
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܳ()V

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۟֨ᩳ;)Ll/ۗ᩻᩵;
    .locals 4

    .line 725
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2669
    new-instance v2, Ll/ۗ᩻᩵;

    invoke-direct {v2}, Ll/ۗ᩻᩵;-><init>()V

    .line 736
    instance-of v3, v0, Ll/᩻᩻᩵;

    if-eqz v3, :cond_1

    .line 737
    move-object v3, v0

    check-cast v3, Ll/᩻᩻᩵;

    iget-object v3, v3, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v3, :cond_0

    .line 738
    invoke-static {v0, v3}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v2

    :cond_0
    move-object v0, v1

    .line 748
    :cond_1
    :try_start_0
    invoke-virtual {p1, v0}, Ll/۟֨ᩳ;->֫(Ljava/lang/Object;)V

    .line 749
    sget-object p1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :catchall_0
    move-exception p1

    .line 752
    invoke-static {p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;

    move-result-object p1

    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v2

    .line 2669
    :cond_2
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 728
    new-instance v2, Ll/֡᩻᩵;

    .line 688
    invoke-direct {v2, v1, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v2, Ll/֡᩻᩵;->ܰ:Ll/۟֨ᩳ;

    .line 728
    invoke-virtual {p0, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0
.end method

.method public final ֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    .locals 3

    .line 2669
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 877
    iget-object v1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 878
    new-instance v1, Ll/ۙ᩻᩵;

    .line 825
    invoke-direct {v1, v2, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v1, Ll/ۙ᩻᩵;->ܰ:Ll/۠ۜ᩵;

    .line 878
    invoke-virtual {p0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0

    .line 880
    :cond_0
    invoke-virtual {v0, v1, p1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ll/۠ۜ᩵;Ll/ۙ᩻᩵;)Z

    return-object v0
.end method

.method public final ֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;
    .locals 3

    .line 2669
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 941
    iget-object v1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 942
    new-instance v1, Ll/᩸᩻᩵;

    .line 897
    invoke-direct {v1, v2, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v1, Ll/᩸᩻᩵;->ܰ:Ll/ܶۜ᩵;

    .line 942
    invoke-virtual {p0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0

    .line 944
    :cond_0
    invoke-virtual {v0, v1, p1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ll/ܶۜ᩵;Ll/᩸᩻᩵;)Z

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 2143
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Object;)Z

    .line 2144
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .line 339
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    .line 340
    invoke-static {p1, p2}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    .line 339
    invoke-static {v0, p0, v1, v2, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 3

    .line 2157
    new-instance v0, Ll/᩻᩻᩵;

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2157
    invoke-direct {v0, p1}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    .line 254
    sget-object p1, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    invoke-static {p1, p0, v1, v2, v0}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    .line 2158
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/᩸ۜ᩵;)V
    .locals 3

    .line 2669
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 999
    iget-object v1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 1000
    new-instance v1, Ll/ܶ᩻᩵;

    .line 961
    invoke-direct {v1, v2, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v1, Ll/ܶ᩻᩵;->ܰ:Ll/᩸ۜ᩵;

    .line 1000
    invoke-virtual {p0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-void

    .line 1002
    :cond_0
    invoke-virtual {v0, v1, p1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ll/᩸ۜ᩵;Ll/ܶ᩻᩵;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/۠ۜ᩵;Ll/ۙ᩻᩵;)Z
    .locals 4

    .line 843
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v1, 0x1

    if-nez v0, :cond_4

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 845
    :try_start_0
    invoke-virtual {p3}, Ll/֨᩻᩵;->ۜ()Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 847
    :cond_0
    instance-of p3, p1, Ll/᩻᩻᩵;

    if-eqz p3, :cond_1

    .line 848
    move-object p3, p1

    check-cast p3, Ll/᩻᩻᩵;

    iget-object p3, p3, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    :cond_1
    move-object p3, v0

    move-object v0, p1

    .line 855
    :goto_0
    :try_start_1
    invoke-interface {p2, v0, p3}, Ll/۠ۜ᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V

    if-nez p3, :cond_3

    .line 254
    sget-object p2, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۗ᩻᩵;->۬:J

    invoke-static {p2, p0, v2, v3, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v1

    :catchall_0
    move-exception p2

    move-object v0, p3

    goto :goto_1

    :catchall_1
    move-exception p2

    :goto_1
    move-object p3, p2

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, v0

    .line 867
    :cond_3
    :goto_2
    invoke-virtual {p0, p1, p3}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_4
    return v1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ܶۜ᩵;Ll/᩸᩻᩵;)Z
    .locals 2

    .line 915
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_2

    if-eqz p3, :cond_0

    .line 917
    :try_start_0
    invoke-virtual {p3}, Ll/֨᩻᩵;->ۜ()Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 919
    :cond_0
    instance-of p3, p1, Ll/᩻᩻᩵;

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 920
    check-cast p1, Ll/᩻᩻᩵;

    iget-object p1, p1, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    .line 928
    :cond_1
    invoke-interface {p2, p1, v0}, Ll/ܶۜ᩵;->֫(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 930
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩸ۜ᩵;Ll/ܶ᩻᩵;)Z
    .locals 2

    .line 979
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_2

    if-eqz p3, :cond_0

    .line 981
    :try_start_0
    invoke-virtual {p3}, Ll/֨᩻᩵;->ۜ()Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 983
    :cond_0
    instance-of p3, p1, Ll/᩻᩻᩵;

    if-eqz p3, :cond_1

    move-object p3, p1

    check-cast p3, Ll/᩻᩻᩵;

    iget-object p3, p3, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz p3, :cond_1

    .line 984
    invoke-interface {p2, p3}, Ll/᩸ۜ᩵;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Object;)Z

    goto :goto_0

    .line 254
    :cond_1
    sget-object p2, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v0, Ll/ۗ᩻᩵;->۬:J

    invoke-static {p2, p0, v0, v1, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 988
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۘ᩻᩵;)Z
    .locals 6

    .line 263
    iget-object v4, p0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    .line 264
    invoke-static {p1, v4}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;Ll/ۘ᩻᩵;)V

    .line 265
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۗ᩻᩵;->۫:J

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/ᩳ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;
    .locals 1

    .line 447
    sget-boolean v0, Ll/ۗ᩻᩵;->ۛ:Z

    if-nez v0, :cond_0

    .line 2023
    sget-object v0, Ll/ܿۜ᩵;->ܿ֫:Ll/ܿۜ᩵;

    if-ne p2, v0, :cond_0

    .line 448
    sget-object p2, Ll/ۗ᩻᩵;->᩶:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2200
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;
    .locals 4

    .line 652
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2669
    new-instance v2, Ll/ۗ᩻᩵;

    invoke-direct {v2}, Ll/ۗ᩻᩵;-><init>()V

    .line 663
    instance-of v3, v0, Ll/᩻᩻᩵;

    if-eqz v3, :cond_1

    .line 664
    move-object v3, v0

    check-cast v3, Ll/᩻᩻᩵;

    iget-object v3, v3, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v3, :cond_0

    .line 665
    invoke-static {v0, v3}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v2

    :cond_0
    move-object v0, v1

    .line 675
    :cond_1
    :try_start_0
    invoke-interface {p1, v0}, Ll/᩸ۜ᩵;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    .line 291
    sget-object p1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    .line 675
    :cond_2
    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :catchall_0
    move-exception p1

    .line 678
    invoke-static {p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;

    move-result-object p1

    iput-object p1, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v2

    .line 2669
    :cond_3
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 655
    new-instance v2, Ll/ۚ᩻᩵;

    .line 616
    invoke-direct {v2, v1, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v2, Ll/ۚ᩻᩵;->ܰ:Ll/᩸ۜ᩵;

    .line 655
    invoke-virtual {p0, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0
.end method

.method public final ۧ()V
    .locals 12

    const/4 v0, 0x0

    .line 520
    :goto_0
    iget-object v5, p0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ll/ۘ᩻᩵;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 521
    iget-object v6, v5, Ll/ۘ᩻᩵;->ۤ:Ll/ۘ᩻᩵;

    .line 258
    sget-object v1, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v3, Ll/ۗ᩻᩵;->۫:J

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Ll/ᩳ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    if-eqz v5, :cond_2

    if-nez v0, :cond_2

    .line 523
    iget-object v0, v5, Ll/ۘ᩻᩵;->ۤ:Ll/ۘ᩻᩵;

    move-object v10, v0

    move-object v7, v5

    :goto_1
    if-eqz v10, :cond_2

    .line 524
    iget-object v11, v10, Ll/ۘ᩻᩵;->ۤ:Ll/ۘ᩻᩵;

    .line 525
    invoke-virtual {v10}, Ll/ۘ᩻᩵;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v7, v10

    move-object v10, v11

    goto :goto_1

    .line 486
    :cond_1
    sget-object v6, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v8, Ll/ۗ᩻᩵;->ۙ:J

    invoke-static/range {v6 .. v11}, Ll/᩷ܰܺ;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)V
    .locals 3

    .line 370
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    .line 358
    instance-of v1, p1, Ll/᩻᩻᩵;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ll/᩻᩻᩵;

    iget-object v1, v1, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    instance-of v2, v1, Ll/۬᩻᩵;

    if-nez v2, :cond_0

    .line 361
    new-instance p1, Ll/᩻᩻᩵;

    new-instance v2, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 361
    invoke-direct {p1, v2}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    .line 370
    :cond_0
    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    invoke-static {v0, p0, v1, v2, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ljava/lang/Throwable;)V
    .locals 3

    .line 311
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    .line 312
    invoke-static {p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;

    move-result-object p1

    .line 311
    invoke-static {v0, p0, v1, v2, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/ۘ᩻᩵;)V
    .locals 1

    .line 577
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 578
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 579
    invoke-static {p1, v0}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;Ll/ۘ᩻᩵;)V

    .line 583
    :cond_1
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 584
    invoke-virtual {p1, v0}, Ll/ۘ᩻᩵;->֫(I)Ll/ۗ᩻᩵;

    :cond_2
    return-void
.end method

.method public final ܳ()V
    .locals 10

    :goto_0
    move-object v0, p0

    .line 500
    :cond_0
    :goto_1
    iget-object v1, v0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-nez v1, :cond_2

    if-eq v0, p0, :cond_1

    iget-object v1, p0, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-eqz v1, :cond_1

    move-object v0, p0

    goto :goto_2

    :cond_1
    return-void

    :cond_2
    :goto_2
    move-object v8, v1

    .line 503
    iget-object v9, v8, Ll/ۘ᩻᩵;->ۤ:Ll/ۘ᩻᩵;

    .line 258
    sget-object v1, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v4, Ll/ۗ᩻᩵;->۫:J

    move-object v2, v1

    move-object v3, v0

    move-object v6, v8

    move-object v7, v9

    invoke-static/range {v2 .. v7}, Ll/ᩳ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v9, :cond_5

    if-eq v0, p0, :cond_4

    .line 270
    :cond_3
    invoke-virtual {p0, v8}, Ll/ۗ᩻᩵;->֫(Ll/ۘ᩻᩵;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    .line 486
    sget-wide v3, Ll/ۗ᩻᩵;->ۙ:J

    move-object v2, v8

    move-object v5, v9

    invoke-static/range {v1 .. v6}, Ll/᩷ܰܺ;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    const/4 v0, -0x1

    .line 511
    invoke-virtual {v8, v0}, Ll/ۘ᩻᩵;->֫(I)Ll/ۗ᩻᩵;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0
.end method

.method public final ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;
    .locals 4

    .line 2669
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    .line 1166
    iget-object v1, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 1167
    new-instance v1, Ll/۠᩻᩵;

    .line 1123
    invoke-direct {v1, v2, v0, p0}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p1, v1, Ll/۠᩻᩵;->ܰ:Ll/᩸ۜ᩵;

    .line 1167
    invoke-virtual {p0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    return-object v0

    .line 1169
    :cond_0
    instance-of v3, v1, Ll/᩻᩻᩵;

    if-eqz v3, :cond_2

    .line 1170
    move-object v3, v1

    check-cast v3, Ll/᩻᩻᩵;

    iget-object v3, v3, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v3, :cond_1

    .line 1171
    invoke-static {v1, v3}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v0

    :cond_1
    move-object v1, v2

    .line 1181
    :cond_2
    :try_start_0
    invoke-interface {p1, v1}, Ll/᩸ۜ᩵;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫᩻᩵;

    invoke-interface {p1}, Ll/۫᩻᩵;->֫()Ll/ۗ᩻᩵;

    move-result-object p1

    .line 1182
    iget-object v1, p1, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v1, :cond_4

    .line 358
    instance-of p1, v1, Ll/᩻᩻᩵;

    if-eqz p1, :cond_3

    move-object p1, v1

    check-cast p1, Ll/᩻᩻᩵;

    iget-object p1, p1, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    instance-of v2, p1, Ll/۬᩻᩵;

    if-nez v2, :cond_3

    .line 361
    new-instance v1, Ll/᩻᩻᩵;

    new-instance v2, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 361
    invoke-direct {v1, v2}, Ll/᩻᩻᩵;-><init>(Ljava/lang/Throwable;)V

    .line 1183
    :cond_3
    iput-object v1, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v0

    .line 1185
    :cond_4
    new-instance v1, Ll/᩹᩻᩵;

    .line 1083
    invoke-direct {v1, v2, v0, p1}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    .line 1185
    invoke-virtual {p1, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 1188
    invoke-static {p1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Throwable;)Ll/᩻᩻᩵;

    move-result-object p1

    iput-object p1, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final ܽ()V
    .locals 3

    .line 285
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    invoke-static {v0, p0, v1, v2}, Ll/ܳ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;J)Z

    return-void
.end method

.method public final ܽ(Ljava/lang/Object;)Z
    .locals 3

    .line 296
    sget-object v0, Ll/ۗ᩻᩵;->ۤ:Lsun/misc/Unsafe;

    if-nez p1, :cond_0

    sget-object p1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    :cond_0
    sget-wide v1, Ll/ۗ᩻᩵;->۬:J

    invoke-static {v0, p0, v1, v2, p1}, Ll/ܿ᩻᩵;->֫(Lsun/misc/Unsafe;Ll/ۗ᩻᩵;JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 2

    .line 2113
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2114
    invoke-direct {p0, v0}, Ll/ۗ᩻᩵;->֫(Z)Ljava/lang/Object;

    move-result-object v0

    .line 399
    :cond_0
    instance-of v1, v0, Ll/᩻᩻᩵;

    if-eqz v1, :cond_4

    .line 401
    check-cast v0, Ll/᩻᩻᩵;

    iget-object v0, v0, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 403
    :cond_1
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_3

    .line 405
    instance-of v1, v0, Ll/۬᩻᩵;

    if-eqz v1, :cond_2

    .line 406
    check-cast v0, Ll/۬᩻᩵;

    throw v0

    .line 407
    :cond_2
    new-instance v1, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 407
    throw v1

    .line 404
    :cond_3
    check-cast v0, Ljava/util/concurrent/CancellationException;

    throw v0

    :cond_4
    return-object v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 2581
    iget-object v0, p0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    instance-of v1, v0, Ll/᩻᩻᩵;

    if-eqz v1, :cond_0

    sget-object v1, Ll/ۗ᩻᩵;->ۗ:Ll/᩻᩻᩵;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
