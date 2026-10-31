.class public final Ll/ۚۤܳ;
.super Ljava/lang/Object;
.source "41V3"


# instance fields
.field public final ֫:[Landroid/os/StatFs;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    array-length v0, p1

    new-array v0, v0, [Landroid/os/StatFs;

    iput-object v0, p0, Ll/ۚۤܳ;->֫:[Landroid/os/StatFs;

    .line 15
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۤ֨ۡ;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0, p1}, Ll/ۤ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 21
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f4

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 24
    throw v0
.end method

.method public static synthetic ֫(Ll/ۚۤܳ;[Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Ll/ۚۤܳ;->֫:[Landroid/os/StatFs;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 17
    new-instance v2, Landroid/os/StatFs;

    aget-object v3, p1, v0

    invoke-direct {v2, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 10

    .line 38
    iget-object v0, p0, Ll/ۚۤܳ;->֫:[Landroid/os/StatFs;

    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    .line 39
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v8

    mul-long v8, v8, v6

    add-long/2addr v2, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public final ۧ()J
    .locals 10

    .line 30
    iget-object v0, p0, Ll/ۚۤܳ;->֫:[Landroid/os/StatFs;

    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    .line 31
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v8

    mul-long v8, v8, v6

    add-long/2addr v2, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method
