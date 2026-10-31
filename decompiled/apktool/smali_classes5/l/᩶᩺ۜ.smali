.class public final Ll/᩶᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ll/ۙۛۜ;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡֫:Ljava/util/concurrent/ExecutorService;

.field public final ֫֫:Ll/ۙۨۜ;

.field public final ۖ֫:Ll/ۨ᩺ۜ;

.field public volatile ۗ:Z

.field public final ۘ֫:Ljava/util/ArrayList;

.field public ۙ:Z

.field public ۛ:Ll/ܰܰۜ;

.field public final ۜ֫:Ljava/util/concurrent/ExecutorService;

.field public ۟:Ll/ۜ۫᩻;

.field public ۡ֫:Z

.field public final ۢ֫:J

.field public ۤ:I

.field public final ۧ֫:Landroid/os/Handler;

.field public ۨ:Ll/ܶ᩺ۜ;

.field public volatile ۫:Ll/ܶ᩺ۜ;

.field public volatile ۬:Z

.field public volatile ܰ:J

.field public ܳ֫:Ll/ܶ᩺ۜ;

.field public ܺ֫:J

.field public ܽ֫:Z

.field public final ܿ֫:Landroid/util/SparseArray;

.field public volatile ᩳ֫:J

.field public final ᩴ֫:J

.field public ᩵֫:Ll/۬ۛۜ;

.field public final ᩶:Ll/᩶ۛۜ;

.field public final ᩷֫:Ljava/util/IdentityHashMap;

.field public volatile ᩸:Z

.field public final ᩹:J

.field public ᩺:Ll/᩹ۛۜ;

.field public final ᩻֫:Ll/ۨ᩺ۜ;


# direct methods
.method public constructor <init>(Ll/ܺܶۜ;Ljava/util/ArrayList;)V
    .locals 11

    .line 75
    new-instance v0, Ll/᩶ۛۜ;

    const-string v1, "activity"

    .line 103
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    .line 104
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    .line 105
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v4

    invoke-virtual {v1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v1

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-lez v7, :cond_5

    if-lez v4, :cond_4

    const-wide/16 v5, 0x3

    const-wide/32 v7, 0x100000

    if-eqz v1, :cond_0

    int-to-long v1, v4

    mul-long v1, v1, v7

    const-wide/16 v3, 0x10

    .line 25
    div-long/2addr v1, v3

    const-wide/32 v3, 0x1000000

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/32 v9, 0x10000000

    .line 26
    div-long/2addr v2, v5

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 104
    :goto_0
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v1, v2, v3}, Ll/᩶ۛۜ;-><init>(JLl/᩹ۛۜ;)V

    .line 75
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "gallery-sources"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Landroid/util/SparseArray;

    const/4 v2, 0x3

    invoke-direct {p1, v2}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    .line 41
    new-instance p1, Ll/ۙۨۜ;

    invoke-direct {p1}, Ll/ۙۨۜ;-><init>()V

    iput-object p1, p0, Ll/᩶᩺ۜ;->֫֫:Ll/ۙۨۜ;

    .line 42
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {p1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    .line 43
    new-instance p1, Ll/ۘ᩺ۜ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩺ۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    .line 44
    new-instance p1, Ll/ᩴ᩺ۜ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩺ۜ;->ۜ֫:Ljava/util/concurrent/ExecutorService;

    .line 57
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/᩶᩺ۜ;->᩷֫:Ljava/util/IdentityHashMap;

    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz p2, :cond_3

    .line 85
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    cmp-long p1, v2, v7

    if-ltz p1, :cond_3

    .line 88
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Ll/᩶᩺ۜ;->ۘ֫:Ljava/util/ArrayList;

    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺ۨۜ;

    if-eqz p2, :cond_1

    goto :goto_1

    .line 90
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null gallery source"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_2
    iput-object v0, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    .line 93
    new-instance p1, Ll/᩵۫᩷;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/᩵۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩶ۛۜ;->֫(Ll/᩵۫᩷;)V

    .line 94
    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide p1

    const-wide/16 v2, 0x8

    div-long/2addr p1, v2

    const-wide/32 v2, 0x800000

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩶᩺ۜ;->ۢ֫:J

    .line 96
    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    .line 14
    div-long/2addr v2, v5

    const-wide/16 v7, 0x2

    mul-long v2, v2, v7

    .line 96
    iput-wide v2, p0, Ll/᩶᩺ۜ;->᩹:J

    .line 97
    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    mul-long p1, p1, v5

    sub-long/2addr v2, p1

    iput-wide v2, p0, Ll/᩶᩺ۜ;->ᩴ֫:J

    .line 98
    new-instance p1, Ll/ۨ᩺ۜ;

    invoke-direct {p1, v1}, Ll/ۨ᩺ۜ;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Ll/᩶᩺ۜ;->ۖ֫:Ll/ۨ᩺ۜ;

    .line 99
    new-instance p1, Ll/ۨ᩺ۜ;

    invoke-direct {p1, v1}, Ll/ۨ᩺ۜ;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Ll/᩶᩺ۜ;->᩻֫:Ll/ۨ᩺ۜ;

    return-void

    .line 86
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery sources or bitmap budget"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Memory class must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum heap must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֡(Ll/᩶᩺ۜ;)Ll/۬ۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    return-object p0
.end method

.method public static bridge synthetic ֨(Ll/᩶᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    return-void
.end method

.method private ֫(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;
    .locals 10

    if-eqz p1, :cond_5

    .line 365
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v0, :cond_5

    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۘ:Z

    if-nez v0, :cond_5

    invoke-virtual {p1}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->᩵:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 366
    :cond_0
    iget-object v0, p1, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v0, :cond_3

    .line 367
    iget-object v0, p1, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/᩻ܰۜ;

    .line 1049
    iget-boolean v1, p1, Ll/ܶ᩺ۜ;->ۤ:Z

    if-eqz v1, :cond_2

    iget-object v1, p1, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v1, p1, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    .line 368
    :goto_0
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p1, Ll/ܶ᩺ۜ;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 369
    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v5, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v7, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/᩻ܰۜ;JJ)V

    return-object v0

    .line 372
    :cond_3
    iget-object v0, p1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-eqz v0, :cond_5

    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->᩶:Z

    if-nez v0, :cond_5

    .line 373
    iget-object v0, p1, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/ۡܰۜ;

    .line 374
    iget-object v1, p1, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p1, Ll/ܶ᩺ۜ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v6, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v8, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v5, 0x0

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    return-object v0

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 654
    iget-object v3, v1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    .line 655
    iget-boolean v4, v0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v4, :cond_25

    iget-boolean v4, v0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v4, :cond_25

    iget-wide v4, v1, Ll/ۚ᩺ۜ;->ۧ:J

    iget-wide v6, v0, Ll/᩶᩺ۜ;->ܰ:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_25

    iget-boolean v4, v3, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v4, :cond_25

    iget-object v4, v0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    iget v5, v3, Ll/ܶ᩺ۜ;->ۚ:I

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_25

    iget-boolean v4, v2, Ll/᩸᩺ۜ;->۫:Z

    if-nez v4, :cond_25

    .line 656
    invoke-direct/range {p0 .. p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_b

    .line 661
    :cond_0
    iget-boolean v4, v1, Ll/ۚ᩺ۜ;->ܿ:Z

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    iget-object v4, v3, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-nez v4, :cond_3

    iget-object v4, v2, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    if-eqz v4, :cond_3

    iget-boolean v4, v0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v4, :cond_1

    iget-boolean v4, v3, Ll/ܶ᩺ۜ;->ۖ:Z

    if-eqz v4, :cond_1

    iget-object v4, v2, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    instance-of v4, v4, Ll/֨ۨۜ;

    if-nez v4, :cond_3

    .line 663
    :cond_1
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->֨:Z

    .line 665
    iget-boolean v1, v0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v1, :cond_2

    iget-object v1, v2, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    instance-of v1, v1, Ll/֨ۨۜ;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->ۗ:Z

    .line 666
    invoke-virtual/range {p2 .. p2}, Ll/᩸᩺ۜ;->close()V

    return-void

    .line 669
    :cond_3
    iget-object v4, v2, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    instance-of v7, v4, Ll/ۛۨۜ;

    if-nez v7, :cond_23

    iget-boolean v7, v2, Ll/᩸᩺ۜ;->᩹:Z

    if-eqz v7, :cond_4

    goto/16 :goto_a

    .line 674
    :cond_4
    iget-boolean v7, v1, Ll/ۚ᩺ۜ;->ܺ:Z

    if-eqz v7, :cond_6

    .line 675
    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->ۘ:Z

    if-eqz v4, :cond_5

    .line 676
    iget v1, v3, Ll/ܶ᩺ۜ;->ۚ:I

    .line 222
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 223
    iget-boolean v3, v0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v3, :cond_21

    iget-object v3, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v3, :cond_21

    invoke-virtual {v3, v1}, Ll/۬ۛۜ;->ۧ(I)Z

    goto/16 :goto_9

    .line 677
    :cond_5
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ᩳ()V

    goto/16 :goto_9

    .line 678
    :cond_6
    iget-object v7, v1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    const-wide/16 v8, 0x2

    const-wide/32 v10, 0x40000

    const/4 v12, 0x0

    if-eqz v7, :cond_b

    .line 679
    iget-object v5, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    if-eqz v5, :cond_9

    .line 1049
    iget-boolean v1, v3, Ll/ܶ᩺ۜ;->ۤ:Z

    if-eqz v1, :cond_7

    iget-object v1, v3, Ll/ܶ᩺ۜ;->ᩴ:Ljava/util/HashMap;

    goto :goto_1

    :cond_7
    iget-object v1, v3, Ll/ܶ᩺ۜ;->ۛ:Ljava/util/HashMap;

    .line 1195
    :goto_1
    iput-object v12, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 680
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ۨۜ;

    if-eqz v1, :cond_8

    .line 681
    invoke-virtual {v1}, Ll/᩹ۨۜ;->close()V

    .line 682
    :cond_8
    invoke-static {v3}, Ll/ܶ᩺ۜ;->ۧ(Ll/ܶ᩺ۜ;)V

    .line 683
    iget-object v1, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto/16 :goto_9

    .line 685
    :cond_9
    instance-of v4, v4, Ll/֨ۨۜ;

    if-eqz v4, :cond_a

    .line 686
    iget-wide v4, v3, Ll/ܶ᩺ۜ;->֫:J

    div-long/2addr v4, v8

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v3, Ll/ܶ᩺ۜ;->֫:J

    .line 688
    invoke-static {v3}, Ll/ܶ᩺ۜ;->ܽ(Ll/ܶ᩺ۜ;)V

    .line 689
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v3, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    .line 690
    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->᩷:Z

    .line 691
    iget-object v4, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 693
    :cond_a
    iget-object v3, v3, Ll/ܶ᩺ۜ;->ܿ:Ljava/util/HashSet;

    iget-object v1, v1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    .line 695
    :cond_b
    iget-object v7, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    if-nez v7, :cond_18

    .line 696
    iget-object v1, v1, Ll/ۚ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v1, :cond_c

    iget-object v7, v2, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    if-nez v7, :cond_c

    .line 698
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->ܰ:Z

    .line 699
    invoke-virtual/range {p2 .. p2}, Ll/᩸᩺ۜ;->close()V

    return-void

    .line 702
    :cond_c
    iget-object v7, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    if-nez v7, :cond_13

    iget-object v7, v2, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    if-nez v7, :cond_13

    .line 704
    instance-of v1, v4, Ll/֨ۨۜ;

    if-eqz v1, :cond_d

    iget-object v6, v2, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    if-nez v6, :cond_e

    iget-boolean v6, v3, Ll/ܶ᩺ۜ;->ۗ:Z

    if-nez v6, :cond_d

    goto :goto_2

    :cond_d
    const/4 v5, 0x0

    :cond_e
    :goto_2
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->ۗ:Z

    xor-int/lit8 v6, v5, 0x1

    .line 706
    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->ᩳ:Z

    if-nez v5, :cond_21

    .line 707
    iget-object v5, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    iget v6, v3, Ll/ܶ᩺ۜ;->ۚ:I

    iget-wide v7, v3, Ll/ܶ᩺ۜ;->ۙ:J

    .line 646
    instance-of v3, v4, Ll/֫ۨۜ;

    if-eqz v3, :cond_f

    const v1, 0x7f12046e

    goto :goto_4

    .line 647
    :cond_f
    instance-of v3, v4, Ll/ۨۛۜ;

    if-eqz v3, :cond_10

    const v1, 0x7f120472

    goto :goto_4

    :cond_10
    if-nez v1, :cond_12

    .line 648
    instance-of v1, v4, Ljava/lang/OutOfMemoryError;

    if-nez v1, :cond_12

    instance-of v1, v4, Ll/ۛۛۡ;

    if-eqz v1, :cond_11

    goto :goto_3

    :cond_11
    const v1, 0x7f12046d

    goto :goto_4

    :cond_12
    :goto_3
    const v1, 0x7f12072a

    .line 707
    :goto_4
    invoke-virtual {v5, v6, v1, v7, v8}, Ll/۬ۛۜ;->֫(IIJ)V

    goto/16 :goto_9

    :cond_13
    if-eqz v1, :cond_14

    .line 710
    iget-object v4, v3, Ll/ܶ᩺ۜ;->۠:Ll/᩹ۛۜ;

    invoke-virtual {v1, v4}, Ll/ܰۛۜ;->֫(Ll/᩹ۛۜ;)V

    .line 711
    :cond_14
    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->֨:Z

    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->ۗ:Z

    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->ᩳ:Z

    .line 712
    iget-object v1, v2, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    iput-object v1, v3, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    .line 1188
    iget-object v1, v2, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    iput-object v12, v2, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    .line 713
    iput-object v1, v3, Ll/ܶ᩺ۜ;->۠:Ll/᩹ۛۜ;

    .line 1194
    iget-object v1, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 1195
    iput-object v12, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 714
    iput-object v1, v3, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    .line 1199
    iget-object v1, v2, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    .line 1200
    iput-object v12, v2, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    .line 715
    iput-object v1, v3, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 716
    iget-object v1, v3, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v1, Ll/ۘܰۜ;

    if-nez v1, :cond_16

    .line 716
    iget-object v1, v3, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v1, :cond_15

    goto :goto_5

    :cond_15
    const/4 v5, 0x0

    :cond_16
    :goto_5
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->᩶:Z

    .line 717
    iget-object v1, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    iget v4, v3, Ll/ܶ᩺ۜ;->ۚ:I

    iget-wide v5, v3, Ll/ܶ᩺ۜ;->ۙ:J

    invoke-virtual {v1, v4, v5, v6, v3}, Ll/۬ۛۜ;->֫(IJLl/ۗۨۜ;)Z

    move-result v1

    if-nez v1, :cond_17

    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 718
    :cond_17
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ᩳ()V

    goto/16 :goto_9

    .line 720
    :cond_18
    invoke-direct {v0, v3}, Ll/᩶᩺ۜ;->ۧ(Ll/ܶ᩺ۜ;)Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_1a

    iget-object v4, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    .line 1037
    iget-object v7, v3, Ll/ܶ᩺ۜ;->۟:Landroid/graphics/RectF;

    iget-object v13, v3, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-eqz v13, :cond_21

    iget v15, v3, Ll/ܶ᩺ۜ;->֫֫:F

    const/4 v14, 0x0

    cmpg-float v14, v15, v14

    if-gtz v14, :cond_19

    goto/16 :goto_9

    .line 1038
    :cond_19
    iget-object v14, v3, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v10, v14, Ll/ܶۨۜ;->ۜ:I

    iget v14, v14, Ll/ܶۨۜ;->ۧ:I

    iget v11, v13, Ll/᩹ۨۜ;->ۗ:I

    .line 1039
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ܽ()J

    move-result-wide v18

    iget v13, v3, Ll/ܶ᩺ۜ;->ۡ:I

    iget v8, v3, Ll/ܶ᩺ۜ;->ۢ:I

    move v9, v13

    move v13, v10

    move v10, v15

    move-object v15, v7

    move/from16 v16, v10

    move/from16 v17, v11

    move/from16 v20, v9

    move/from16 v21, v8

    .line 1038
    invoke-static/range {v13 .. v21}, Ll/֫᩺ۜ;->֫(IILandroid/graphics/RectF;FIJII)Ljava/util/List;

    move-result-object v8

    .line 1040
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_21

    iget-object v9, v3, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget v10, v9, Ll/ܶۨۜ;->ۜ:I

    iget v9, v9, Ll/ܶۨۜ;->ۧ:I

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡܰۜ;

    iget v8, v8, Ll/ۡܰۜ;->ۜ:I

    invoke-static {v4, v7, v10, v9, v8}, Ll/֫᩺ۜ;->֫(Ll/ۡܰۜ;Landroid/graphics/RectF;III)Z

    move-result v4

    if-eqz v4, :cond_21

    goto :goto_6

    .line 720
    :cond_1a
    iget-object v4, v3, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    iget-object v7, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_21

    .line 721
    :goto_6
    iget-object v4, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    if-eqz v4, :cond_1e

    .line 722
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 724
    iget-object v4, v3, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹᩺ۜ;

    iget-object v7, v7, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    invoke-virtual {v7}, Ll/᩹ۨۜ;->close()V

    goto :goto_7

    .line 725
    :cond_1b
    iget-object v4, v3, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 727
    iget-object v4, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v3, Ll/ܶ᩺ۜ;->ܽ֫:Ljava/util/List;

    .line 728
    iget-object v4, v0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    iget-object v7, v3, Ll/ܶ᩺ۜ;->֡:Ll/֨᩺ۜ;

    invoke-virtual {v4, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 729
    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->᩵:Z

    .line 730
    iget-object v4, v3, Ll/ܶ᩺ۜ;->᩹:Ll/۟ۨۜ;

    invoke-virtual {v4}, Ll/۟ۨۜ;->֫()V

    .line 731
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->᩷:Z

    .line 733
    :cond_1c
    new-instance v4, Ll/᩹᩺ۜ;

    iget-object v5, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    .line 1194
    iget-object v6, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 1195
    iput-object v12, v2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 733
    invoke-direct {v4, v5, v6}, Ll/᩹᩺ۜ;-><init>(Ll/ۡܰۜ;Ll/᩹ۨۜ;)V

    .line 734
    iget-object v5, v3, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    iget-object v1, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹᩺ۜ;

    if-eqz v1, :cond_1d

    .line 735
    iget-object v1, v1, Ll/᩹᩺ۜ;->֫:Ll/᩹ۨۜ;

    invoke-virtual {v1}, Ll/᩹ۨۜ;->close()V

    .line 1001
    :cond_1d
    iget-object v1, v3, Ll/ܶ᩺ۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1002
    iget-object v3, v3, Ll/ܶ᩺ۜ;->᩺:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 737
    iget-object v1, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto :goto_9

    .line 738
    :cond_1e
    iget-object v4, v2, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    instance-of v4, v4, Ll/֨ۨۜ;

    if-eqz v4, :cond_20

    .line 739
    iget-wide v4, v3, Ll/ܶ᩺ۜ;->֫:J

    const-wide/16 v7, 0x2

    div-long/2addr v4, v7

    const-wide/32 v7, 0x40000

    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v3, Ll/ܶ᩺ۜ;->֫:J

    .line 741
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_1f

    iput-boolean v6, v3, Ll/ܶ᩺ۜ;->᩷:Z

    goto :goto_8

    .line 742
    :cond_1f
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->֫()V

    .line 743
    :goto_8
    iget-object v3, v3, Ll/ܶ᩺ۜ;->ܳ:Ljava/util/HashSet;

    iget-object v1, v1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 744
    iget-object v1, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto :goto_9

    .line 747
    :cond_20
    iput-boolean v5, v3, Ll/ܶ᩺ۜ;->᩶:Z

    .line 748
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->֫()V

    .line 751
    :cond_21
    :goto_9
    invoke-virtual/range {p2 .. p2}, Ll/᩸᩺ۜ;->close()V

    .line 752
    invoke-direct/range {p0 .. p0}, Ll/᩶᩺ۜ;->ۘ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_22

    invoke-direct/range {p0 .. p0}, Ll/᩶᩺ۜ;->᩵()V

    .line 753
    :cond_22
    iget-object v1, v0, Ll/᩶᩺ۜ;->۟:Ll/ۜ۫᩻;

    if-eqz v1, :cond_24

    invoke-virtual {v1}, Ll/ۜ۫᩻;->run()V

    return-void

    .line 670
    :cond_23
    :goto_a
    invoke-virtual/range {p2 .. p2}, Ll/᩸᩺ۜ;->close()V

    .line 671
    iget v1, v3, Ll/ܶ᩺ۜ;->ۚ:I

    .line 222
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 223
    iget-boolean v2, v0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v2, :cond_24

    iget-object v2, v0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v2, :cond_24

    invoke-virtual {v2, v1}, Ll/۬ۛۜ;->ۧ(I)Z

    :cond_24
    return-void

    .line 657
    :cond_25
    :goto_b
    invoke-virtual/range {p2 .. p2}, Ll/᩸᩺ۜ;->close()V

    return-void
.end method

.method private ֫(Ll/ۚ᩺ۜ;Ll/᩺ۨۜ;Ll/᩸᩺ۜ;Ll/᩶ۛۜ;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    .line 424
    instance-of v2, v10, Ll/ۘܰۜ;

    if-eqz v2, :cond_0

    move-object v2, v10

    check-cast v2, Ll/ۘܰۜ;

    .line 425
    invoke-virtual/range {p2 .. p2}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v9

    .line 426
    iget-wide v3, v0, Ll/᩶᩺ۜ;->ۢ֫:J

    new-instance v5, Ll/᩷᩺ۜ;

    invoke-direct {v5, v0, v1}, Ll/᩷᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-virtual {v2, v12, v3, v4, v5}, Ll/ۘܰۜ;->֫(Ll/᩶ۛۜ;JLl/᩷᩺ۜ;)Ll/᩹ۨۜ;

    move-result-object v1

    iput-object v1, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 427
    invoke-virtual {v10, v9}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 428
    new-instance v1, Ll/ܶۨۜ;

    invoke-virtual/range {p2 .. p2}, Ll/᩺ۨۜ;->᩻()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    iget-object v2, v2, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    iget-object v2, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    iget-object v2, v2, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    .line 429
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v7, 0x1

    const-string v8, "video/*"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Ll/ܶۨۜ;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ۨۨۜ;)V

    iput-object v1, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    return-void

    .line 432
    :cond_0
    iget-boolean v2, v0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    div-long/2addr v2, v4

    const-wide/32 v4, 0x100000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    iget-wide v2, v0, Ll/᩶᩺ۜ;->ۢ֫:J

    :goto_0
    move-wide v13, v2

    .line 433
    new-instance v2, Ll/ۢ᩺ۜ;

    invoke-direct {v2, v0, v1}, Ll/ۢ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-static {v10, v2}, Ll/ᩳۨۜ;->֫(Ll/᩺ۨۜ;Ll/ۢ᩺ۜ;)Ll/᩺ۛۜ;

    move-result-object v15

    .line 435
    iget-wide v5, v0, Ll/᩶᩺ۜ;->ۢ֫:J

    iget-wide v7, v0, Ll/᩶᩺ۜ;->᩹:J

    new-instance v9, Ll/ۡ᩺ۜ;

    invoke-direct {v9, v0, v1}, Ll/ۡ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    move-object/from16 v2, p2

    move-object v3, v15

    move-object/from16 v4, p4

    invoke-static/range {v2 .. v9}, Ll/ᩳۨۜ;->֫(Ll/᩺ۨۜ;Ll/᩺ۛۜ;Ll/᩶ۛۜ;JJLl/ۡ᩺ۜ;)Ll/ܰۛۜ;

    move-result-object v2

    iput-object v2, v11, Ll/᩸᩺ۜ;->ۙ:Ll/ܰۛۜ;

    if-eqz v2, :cond_2

    .line 436
    iget-object v1, v2, Ll/ܰۛۜ;->۬:Ll/ܶۨۜ;

    iput-object v1, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    return-void

    .line 438
    :cond_2
    iget-object v2, v0, Ll/᩶᩺ۜ;->֫֫:Ll/ۙۨۜ;

    iget-object v3, v15, Ll/᩺ۛۜ;->ۧ:Ll/ۨۨۜ;

    iget-object v4, v15, Ll/᩺ۛۜ;->֫:Ll/ۤ۠ۜ;

    iget-object v4, v4, Ll/ۤ۠ۜ;->֫:Landroid/graphics/BitmapFactory$Options;

    invoke-virtual {v2, v10, v3, v4}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/ۨۨۜ;Landroid/graphics/BitmapFactory$Options;)Ll/ܶۨۜ;

    move-result-object v2

    iput-object v2, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    .line 439
    iget-object v3, v2, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    if-eqz v3, :cond_4

    if-eqz p5, :cond_3

    .line 441
    invoke-virtual/range {p2 .. p2}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 442
    invoke-direct/range {p0 .. p0}, Ll/᩶᩺ۜ;->ۖ()V

    .line 444
    :try_start_0
    iget-object v2, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    new-instance v3, Ll/ܺ᩺ۜ;

    invoke-direct {v3, v0, v1}, Ll/ܺ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-static {v10, v2, v12, v3}, Ll/ܰܰۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/ܰܰۜ;

    move-result-object v2

    iput-object v2, v0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    .line 445
    iget-object v3, v1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iput-object v3, v0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;
    :try_end_0
    .catch Ll/֨ۨۜ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_3
    const/4 v2, 0x0

    :goto_1
    move-object v6, v2

    .line 451
    iget-object v2, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    new-instance v7, Ll/ۖ᩺ۜ;

    invoke-direct {v7, v0, v1}, Ll/ۖ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    sget-object v8, Ll/᩶ۨۜ;->֫:Ll/᩶ۨۜ;

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move-wide v4, v13

    invoke-static/range {v1 .. v8}, Ll/᩷ܰۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;JLl/ܰܰۜ;Ll/ܿۖ᩷;Ll/᩶ۨۜ;)Ll/᩹ۨۜ;

    move-result-object v1

    iput-object v1, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    return-void

    .line 455
    :cond_4
    iget-object v2, v2, Ll/ܶۨۜ;->ܽ:Ljava/lang/String;

    invoke-static {v2}, Ll/ܰܰۜ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-wide v13, v0, Ll/᩶᩺ۜ;->ۢ֫:J

    .line 456
    :cond_5
    invoke-direct/range {p0 .. p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 457
    iget-boolean v2, v0, Ll/᩶᩺ۜ;->۬:Z

    if-nez v2, :cond_6

    if-eqz p5, :cond_6

    iget-object v1, v1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v2, v0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-ne v1, v2, :cond_6

    iget-object v1, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    iget-object v1, v1, Ll/ܶۨۜ;->ܽ:Ljava/lang/String;

    const-string v2, "image/png"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 458
    iget-wide v1, v0, Ll/᩶᩺ۜ;->ۢ֫:J

    const-wide/16 v3, 0x2

    mul-long v1, v1, v3

    const-wide/32 v3, 0x800000

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    move-wide v5, v1

    goto :goto_2

    :cond_6
    move-wide v5, v13

    .line 459
    :goto_2
    iget-object v1, v0, Ll/᩶᩺ۜ;->֫֫:Ll/ۙۨۜ;

    iget-object v3, v11, Ll/᩸᩺ۜ;->ۗ:Ll/ܶۨۜ;

    move-object/from16 v2, p2

    move-object/from16 v4, p4

    invoke-virtual/range {v1 .. v6}, Ll/ۙۨۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;J)Ll/᩹ۨۜ;

    move-result-object v1

    iput-object v1, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    :cond_7
    return-void
.end method

.method public static synthetic ֫(Ll/᩶᩺ۜ;)V
    .locals 3

    .line 93
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    new-instance v1, Ll/ᩴ᩷ܳ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ᩴ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 325
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ۙ:Z

    if-eqz p1, :cond_0

    .line 326
    invoke-direct {p0, p1, p2}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V

    goto :goto_0

    .line 327
    :cond_0
    invoke-virtual {p2}, Ll/᩸᩺ۜ;->close()V

    .line 328
    :goto_0
    iget-boolean p1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/᩶᩺ۜ;->ܽ֫:Z

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۜ()Ll/ۚ᩺ۜ;

    move-result-object p1

    if-eqz p1, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    .line 329
    :cond_2
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ᩴ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩶᩺ۜ;Ll/᩹ۛۜ;Ll/ۚ᩺ۜ;ZLl/᩹ۨۜ;JLl/ܶ᩺ۜ;Ll/᩹ۨۜ;)V
    .locals 14

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p7

    .line 2
    iget-object v1, v10, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    .line 514
    new-instance v11, Ll/᩸᩺ۜ;

    invoke-direct {v11}, Ll/᩸᩺ۜ;-><init>()V

    .line 515
    iput-object v0, v11, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    .line 517
    :try_start_0
    invoke-direct {p0, v8}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    .line 518
    iput-boolean v2, v11, Ll/᩸᩺ۜ;->۫:Z

    if-eqz p3, :cond_0

    .line 520
    iget-wide v1, v7, Ll/᩶᩺ۜ;->ۢ֫:J

    invoke-static {v9, p1, v1, v2}, Ll/ۙۨۜ;->֫(Ll/᩹ۨۜ;Ll/᩹ۛۜ;J)Ll/᩹ۨۜ;

    move-result-object v0

    iput-object v0, v11, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    const/4 v0, 0x0

    .line 521
    iput-object v0, v11, Ll/᩸᩺ۜ;->۬:Ll/᩹ۛۜ;

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    .line 524
    :cond_0
    new-instance v12, Ll/᩶ۛۜ;

    move-wide/from16 v3, p5

    invoke-direct {v12, v3, v4, p1}, Ll/᩶ۛۜ;-><init>(JLl/᩹ۛۜ;)V

    .line 525
    invoke-virtual {v1}, Ll/᩺ۨۜ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 526
    iget-object v3, v7, Ll/᩶᩺ۜ;->᩻֫:Ll/ۨ᩺ۜ;

    if-eqz v3, :cond_1

    .line 527
    new-instance v4, Ll/ܳ᩺ۜ;

    invoke-direct {v4, p0, v8}, Ll/ܳ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-virtual {v3, v1, v2, v4}, Ll/ۨ᩺ۜ;->֫(Ll/᩺ۨۜ;ZLl/ܿۖ᩷;)Ll/ۛ᩺ۜ;

    move-result-object v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v6, 0x0

    move-object v1, p0

    move-object/from16 v2, p2

    move-object v3, v13

    move-object v4, v11

    move-object v5, v12

    .line 528
    :try_start_1
    invoke-direct/range {v1 .. v6}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;Ll/᩺ۨۜ;Ll/᩸᩺ۜ;Ll/᩶ۛۜ;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 529
    :try_start_2
    invoke-virtual {v13}, Ll/ۛ᩺ۜ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 527
    :try_start_3
    invoke-virtual {v13}, Ll/ۛ᩺ۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 526
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "A cache directory is required for this image source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 530
    :cond_2
    iget-object v3, v10, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    const/4 v6, 0x0

    move-object v1, p0

    move-object/from16 v2, p2

    move-object v4, v11

    move-object v5, v12

    invoke-direct/range {v1 .. v6}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;Ll/᩺ۨۜ;Ll/᩸᩺ۜ;Ll/᩶ۛۜ;Z)V

    .line 532
    :goto_1
    invoke-virtual {v12}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ll/᩹ۛۜ;->ۧ(J)Z
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_3
    :goto_2
    if-eqz v9, :cond_4

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_5

    .line 536
    :goto_3
    :try_start_5
    iput-object v0, v11, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v9, :cond_4

    .line 538
    :goto_4
    invoke-virtual/range {p4 .. p4}, Ll/᩹ۨۜ;->close()V

    .line 540
    :cond_4
    iget-object v0, v7, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    new-instance v9, Ll/᩻᩺ۜ;

    move-object v1, v9

    move-object v2, p0

    move/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p2

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Ll/᩻᩺ۜ;-><init>(Ll/᩶᩺ۜ;ZLl/ܶ᩺ۜ;Ll/᩹ۨۜ;Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V

    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :goto_5
    if-eqz v9, :cond_5

    .line 538
    invoke-virtual/range {p4 .. p4}, Ll/᩹ۨۜ;->close()V

    .line 539
    :cond_5
    throw v0
.end method

.method public static ֫(Ll/᩶᩺ۜ;ZLl/ܶ᩺ۜ;Ll/᩹ۨۜ;Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V
    .locals 5

    const/4 v0, 0x0

    .line 541
    iput-object v0, p0, Ll/᩶᩺ۜ;->ܳ֫:Ll/ܶ᩺ۜ;

    const-wide/16 v1, 0x0

    .line 542
    iput-wide v1, p0, Ll/᩶᩺ۜ;->ܺ֫:J

    .line 543
    iput-object v0, p0, Ll/᩶᩺ۜ;->᩺:Ll/᩹ۛۜ;

    if-eqz p1, :cond_2

    .line 545
    iget-boolean p1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p2, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq p2, p1, :cond_1

    iget-object p1, p2, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-ne p1, p3, :cond_1

    iget-wide v1, p4, Ll/ۚ᩺ۜ;->ۧ:J

    iget-wide v3, p0, Ll/᩶᩺ۜ;->ܰ:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    iget-boolean p1, p5, Ll/᩸᩺ۜ;->۫:Z

    if-nez p1, :cond_1

    .line 547
    iget-object p1, p5, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    if-eqz p1, :cond_0

    .line 1195
    iput-object v0, p5, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    .line 548
    iput-object p1, p2, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    .line 549
    invoke-virtual {p3}, Ll/᩹ۨۜ;->close()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 550
    iput-boolean p1, p2, Ll/ܶ᩺ۜ;->۬:Z

    .line 552
    :cond_1
    :goto_0
    invoke-virtual {p5}, Ll/᩸᩺ۜ;->close()V

    goto :goto_1

    .line 553
    :cond_2
    invoke-direct {p0, p4, p5}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V

    .line 554
    :goto_1
    iget-boolean p1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez p1, :cond_5

    .line 555
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    const/4 p2, 0x0

    iput-boolean p2, p1, Ll/ܶ᩺ۜ;->᩷:Z

    .line 556
    :cond_3
    iget-object p1, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 557
    :cond_4
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    :cond_5
    return-void
.end method

.method private ֫(Ll/ۚ᩺ۜ;)Z
    .locals 5

    .line 591
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v0, :cond_4

    iget-wide v0, p1, Ll/ۚ᩺ۜ;->ۧ:J

    iget-wide v2, p0, Ll/᩶᩺ۜ;->ܰ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v0, :cond_4

    iget-wide v0, p1, Ll/ۚ᩺ۜ;->ܽ:J

    iget-wide v2, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    .line 593
    invoke-virtual {v0}, Ll/᩺ۨۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ll/ۚ᩺ۜ;->ܿ:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v0}, Ll/᩺ۨۜ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p1, Ll/ۚ᩺ۜ;->ܿ:Z

    if-eqz v0, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    .line 594
    invoke-virtual {v0}, Ll/᩺ۨۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    iget-object v0, p1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    if-nez v0, :cond_2

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    .line 595
    invoke-direct {p0, v0}, Ll/᩶᩺ۜ;->ۧ(Ll/ܶ᩺ۜ;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    if-eqz v0, :cond_5

    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->ᩳ֫:Ljava/util/List;

    iget-object v1, p1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    .line 596
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    .line 597
    iput-boolean v0, p1, Ll/ۚ᩺ۜ;->֫:Z

    .line 599
    :cond_5
    iget-boolean p1, p1, Ll/ۚ᩺ۜ;->֫:Z

    return p1
.end method

.method public static synthetic ֫(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 444
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩶᩺ۜ;Ll/ܶ᩺ۜ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->ۧ(Ll/ܶ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۖ(Ll/᩶᩺ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ۢ֫:J

    return-wide v0
.end method

.method private ۖ()V
    .locals 2

    const/4 v0, 0x0

    .line 635
    :try_start_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܰܰۜ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 639
    iput-object v0, p0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    .line 640
    iput-object v0, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    .line 641
    throw v1

    .line 639
    :catch_0
    :cond_0
    :goto_0
    iput-object v0, p0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    .line 640
    iput-object v0, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    return-void
.end method

.method private ۘ()J
    .locals 6

    .line 404
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 405
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_2

    .line 398
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v0

    const-wide/16 v2, 0x80

    div-long/2addr v0, v2

    const-wide/32 v2, 0x100000

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, p0, Ll/᩶᩺ۜ;->᩹:J

    return-wide v0

    .line 406
    :cond_2
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ܰ:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ۘ:Z

    if-eqz v0, :cond_3

    goto :goto_0

    .line 407
    :cond_3
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    invoke-virtual {v0}, Ll/ܰۛۜ;->ܳ()J

    move-result-wide v0

    .line 408
    iget-object v2, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    iget-object v4, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v4, v4, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    invoke-virtual {v4}, Ll/ܰۛۜ;->ܽ()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_4

    return-wide v0

    :cond_4
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static bridge synthetic ۘ(Ll/᩶᩺ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ܺ֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۚ(Ll/᩶᩺ۜ;)Ll/ۚ᩺ۜ;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۜ()Ll/ۚ᩺ۜ;

    move-result-object p0

    return-object p0
.end method

.method private ۜ()Ll/ۚ᩺ۜ;
    .locals 4

    .line 335
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 336
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    invoke-direct {p0, v0}, Ll/᩶᩺ۜ;->ܽ(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 338
    :cond_1
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 340
    :goto_0
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 341
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩺ۜ;

    .line 342
    iget-object v3, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v2, v3, :cond_3

    iget-boolean v3, v2, Ll/ܶ᩺ۜ;->ۖ:Z

    if-nez v3, :cond_2

    goto :goto_1

    .line 343
    :cond_2
    invoke-direct {p0, v2}, Ll/᩶᩺ۜ;->ܽ(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 347
    :cond_4
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    invoke-direct {p0, v0}, Ll/᩶᩺ۜ;->֫(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v0

    if-eqz v0, :cond_5

    return-object v0

    .line 349
    :cond_5
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    :goto_2
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_8

    .line 350
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩺ۜ;

    .line 351
    iget-object v3, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v2, v3, :cond_7

    iget-boolean v3, v2, Ll/ܶ᩺ۜ;->ۖ:Z

    if-nez v3, :cond_6

    goto :goto_3

    .line 352
    :cond_6
    invoke-direct {p0, v2}, Ll/᩶᩺ۜ;->֫(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v2

    if-eqz v2, :cond_7

    return-object v2

    :cond_7
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 355
    :cond_8
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_b

    :goto_4
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_b

    .line 356
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺ۜ;

    .line 357
    iget-object v2, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v0, v2, :cond_a

    iget-boolean v2, v0, Ll/ܶ᩺ۜ;->ۖ:Z

    if-nez v2, :cond_a

    iget-object v2, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v2}, Ll/᩺ۨۜ;->֫()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_5

    .line 358
    :cond_9
    invoke-direct {p0, v0}, Ll/᩶᩺ۜ;->ܽ(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;

    move-result-object v0

    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_b
    :goto_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public static bridge synthetic ۜ(Ll/᩶᩺ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶᩺ۜ;->۬:Z

    return p0
.end method

.method public static synthetic ۜ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 435
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/᩶᩺ۜ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic ۡ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V
    .locals 3

    .line 310
    new-instance v0, Ll/᩸᩺ۜ;

    invoke-direct {v0}, Ll/᩸᩺ۜ;-><init>()V

    .line 312
    :try_start_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    if-nez p1, :cond_0

    iget-object v2, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    goto :goto_0

    :cond_0
    iget-object v2, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    :goto_0
    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    if-eqz v1, :cond_2

    iget-boolean v1, v1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v1, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    :cond_2
    const/4 v1, 0x0

    .line 313
    invoke-direct {p0, v1}, Ll/᩶᩺ۜ;->ۧ(Z)V

    if-eqz p1, :cond_3

    .line 314
    iget-object v1, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-boolean v1, v1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v1, :cond_3

    invoke-direct {p0, p1, v0}, Ll/᩶᩺ۜ;->ۧ(Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    .line 317
    :goto_1
    iput-object v1, v0, Ll/᩸᩺ۜ;->᩶:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    .line 318
    iget-object v1, p1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    iget-object v2, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    if-ne v1, v2, :cond_3

    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    .line 320
    :cond_3
    :goto_2
    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v1, :cond_4

    if-eqz p1, :cond_5

    iget-object v1, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-boolean v1, v1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v1, :cond_5

    .line 321
    :cond_4
    invoke-virtual {v0}, Ll/᩸᩺ۜ;->close()V

    .line 322
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    .line 324
    :cond_5
    iget-object v1, p0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    new-instance v2, Ll/ۧ᩺ۜ;

    invoke-direct {v2, p0, p1, v0}, Ll/ۧ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/᩶᩺ۜ;)Ll/᩹ۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->᩺:Ll/᩹ۛۜ;

    return-object p0
.end method

.method public static synthetic ۢ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 426
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method private ۧ(Ll/ۚ᩺ۜ;)Ll/᩺ۨۜ;
    .locals 6

    .line 607
    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    .line 608
    iget-object v1, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v1}, Ll/᩺ۨۜ;->ۘ()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    .line 609
    :cond_0
    iget-object v2, p0, Ll/᩶᩺ۜ;->᩷֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v2, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ᩺ۜ;

    if-nez v3, :cond_2

    .line 611
    iget-object v3, p0, Ll/᩶᩺ۜ;->ۖ֫:Ll/ۨ᩺ۜ;

    if-eqz v3, :cond_1

    .line 612
    iget-boolean v4, p1, Ll/ۚ᩺ۜ;->ܿ:Z

    xor-int/lit8 v4, v4, 0x1

    new-instance v5, Ll/ۜ᩺ۜ;

    invoke-direct {v5, p0, p1}, Ll/ۜ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-virtual {v3, v1, v4, v5}, Ll/ۨ᩺ۜ;->֫(Ll/᩺ۨۜ;ZLl/ܿۖ᩷;)Ll/ۛ᩺ۜ;

    move-result-object p1

    .line 613
    invoke-virtual {v2, v0, p1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 611
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "A cache directory is required for this image source"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object v3
.end method

.method private ۧ(Ll/ۚ᩺ۜ;Ll/᩸᩺ۜ;)V
    .locals 10

    .line 564
    iget-object v0, p1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v1, p1, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    .line 565
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 566
    iput-boolean v2, p2, Ll/᩸᩺ۜ;->۫:Z

    .line 567
    iget-boolean v3, p1, Ll/ۚ᩺ۜ;->ܺ:Z

    if-eqz v3, :cond_4

    .line 568
    iget-boolean p1, p1, Ll/ۚ᩺ۜ;->ܳ:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->ۖ()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget-object p1, p1, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    .line 569
    invoke-virtual {v0}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨۨۜ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    iput-boolean v2, p2, Ll/᩸᩺ۜ;->᩹:Z

    return-void

    .line 570
    :cond_4
    iget-object v2, p1, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    if-eqz v2, :cond_5

    .line 571
    iget-object v3, p1, Ll/ۚ᩺ۜ;->ۜ:Ll/ܰۛۜ;

    iget-object v4, v2, Ll/᩻ܰۜ;->ܿ:Landroid/graphics/RectF;

    iget v5, v2, Ll/᩻ܰۜ;->᩻:F

    iget-wide v7, p1, Ll/ۚ᩺ۜ;->᩷:J

    new-instance v9, Ll/ܽ᩺ۜ;

    invoke-direct {v9, p0, p1}, Ll/ܽ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    iget-object v6, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual/range {v3 .. v9}, Ll/ܰۛۜ;->֫(Landroid/graphics/RectF;FLl/᩶ۛۜ;JLl/ܽ᩺ۜ;)Ll/᩹ۨۜ;

    move-result-object p1

    iput-object p1, p2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    return-void

    :cond_5
    if-nez v1, :cond_6

    .line 574
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->ۧ(Ll/ۚ᩺ۜ;)Ll/᩺ۨۜ;

    move-result-object v2

    .line 575
    iget-object v4, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;Ll/᩺ۨۜ;Ll/᩸᩺ۜ;Ll/᩶ۛۜ;Z)V

    return-void

    .line 577
    :cond_6
    iget-object v2, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    iget-object v3, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    if-eq v2, v0, :cond_8

    .line 578
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    .line 579
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->ۧ(Ll/ۚ᩺ۜ;)Ll/᩺ۨۜ;

    move-result-object v2

    .line 580
    iget-object v4, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget-object v5, v4, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    if-nez v5, :cond_7

    invoke-static {v2, v4}, Ll/ܰܰۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;)Ll/ܰܰۜ;

    move-result-object v2

    goto :goto_0

    .line 581
    :cond_7
    new-instance v5, Ll/ᩳ᩺ۜ;

    invoke-direct {v5, p0, p1}, Ll/ᩳ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-static {v2, v4, v3, v5}, Ll/ܰܰۜ;->֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/ܰܰۜ;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    .line 582
    iput-object v0, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    .line 585
    :cond_8
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۛ:Ll/ܰܰۜ;

    new-instance v2, Landroid/graphics/Rect;

    iget v4, v1, Ll/ۡܰۜ;->ܳ:I

    iget v5, v1, Ll/ۡܰۜ;->᩷:I

    iget v6, v1, Ll/ۡܰۜ;->᩻:I

    iget v7, v1, Ll/ۡܰۜ;->֫:I

    invoke-direct {v2, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    iget v1, v1, Ll/ۡܰۜ;->ۜ:I

    new-instance v4, Ll/ܿ᩺ۜ;

    invoke-direct {v4, p0, p1}, Ll/ܿ᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-virtual {v0, v2, v1, v3, v4}, Ll/ܰܰۜ;->֫(Landroid/graphics/Rect;ILl/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/᩹ۨۜ;

    move-result-object p1

    iput-object p1, p2, Ll/᩸᩺ۜ;->᩸:Ll/᩹ۨۜ;

    return-void
.end method

.method public static ۧ(Ll/᩶᩺ۜ;)V
    .locals 8

    const/4 v0, 0x0

    .line 295
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ۡ֫:Z

    .line 301
    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v1, :cond_7

    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۙ:Z

    if-eqz v1, :cond_0

    goto :goto_3

    .line 413
    :cond_0
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۘ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    cmp-long v6, v1, v3

    if-eqz v6, :cond_4

    .line 414
    iget-object v3, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v3}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v3

    iget-object v6, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v6}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v6

    sub-long/2addr v3, v6

    cmp-long v6, v3, v1

    if-gez v6, :cond_4

    iget-object v1, p0, Ll/᩶᩺ۜ;->ܳ֫:Ll/ܶ᩺ۜ;

    if-eqz v1, :cond_1

    goto :goto_1

    .line 415
    :cond_1
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    sub-int/2addr v1, v5

    :goto_0
    if-ltz v1, :cond_4

    .line 416
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩺ۜ;

    .line 417
    iget-object v3, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v2, v3, :cond_3

    iget-object v3, v2, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-nez v3, :cond_2

    iget-object v3, v2, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v3, :cond_3

    :cond_2
    iget-object v3, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    iget v2, v2, Ll/ܶ᩺ۜ;->ۚ:I

    invoke-virtual {v3, v2}, Ll/۬ۛۜ;->ۧ(I)Z

    :cond_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 303
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ᩴ()V

    .line 304
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۜ()Ll/ۚ᩺ۜ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 305
    iget-object v2, v1, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    iget-object v3, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    iput-boolean v2, v1, Ll/ۚ᩺ۜ;->ܿ:Z

    .line 306
    :cond_6
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ܽ֫:Z

    .line 307
    iput-boolean v5, p0, Ll/᩶᩺ۜ;->ۙ:Z

    .line 309
    iget-object v0, p0, Ll/᩶᩺ۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/᩵᩺ۜ;

    invoke-direct {v2, p0, v1}, Ll/᩵᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_7
    :goto_3
    return-void
.end method

.method private ۧ(Z)V
    .locals 4

    .line 620
    iget-object v0, p0, Ll/᩶᩺ۜ;->᩷֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 621
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 622
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 623
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩺ۜ;

    if-nez p1, :cond_1

    .line 624
    iget-boolean v3, v2, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v3, :cond_1

    invoke-direct {p0, v2}, Ll/᩶᩺ۜ;->ۧ(Ll/ܶ᩺ۜ;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 626
    :cond_1
    iget-object v3, p0, Ll/᩶᩺ۜ;->ۨ:Ll/ܶ᩺ۜ;

    if-ne v3, v2, :cond_2

    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    .line 627
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩺ۜ;

    invoke-virtual {v1}, Ll/ۛ᩺ۜ;->close()V

    .line 628
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ۧ(Ll/ܶ᩺ۜ;)Z
    .locals 1

    .line 603
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Ll/ܶ᩺ۜ;->ۖ:Z

    return p1

    :cond_0
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic ۧ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 451
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/᩶᩺ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶᩺ۜ;->᩸:Z

    return p0
.end method

.method public static synthetic ܳ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 612
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/᩶᩺ۜ;)Landroid/util/SparseArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    return-object p0
.end method

.method private ܽ(Ll/ܶ᩺ۜ;)Ll/ۚ᩺ۜ;
    .locals 13

    if-eqz p1, :cond_a

    .line 381
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 382
    :cond_0
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq p1, v0, :cond_1

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۖ:Z

    if-eqz v0, :cond_4

    .line 383
    :cond_1
    iget-object v0, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v0

    iget-object v2, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v2}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 398
    iget-boolean v2, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    div-long/2addr v2, v4

    const-wide/32 v4, 0x100000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Ll/᩶᩺ۜ;->᩹:J

    :goto_0
    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    goto/16 :goto_1

    .line 384
    :cond_3
    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v9, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v11, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v12}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    return-object v0

    .line 386
    :cond_4
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ᩳ:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq p1, v0, :cond_5

    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->֨:Z

    if-eqz v0, :cond_5

    goto :goto_1

    .line 388
    :cond_5
    iget-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq p1, v0, :cond_6

    iget-object v0, p1, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v0}, Ll/᩺ۨۜ;->֫()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 389
    :cond_6
    iget-object v0, p1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/᩶᩺ۜ;->ܳ֫:Ll/ܶ᩺ۜ;

    if-ne p1, v0, :cond_7

    goto :goto_1

    :cond_7
    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v5, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v7, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    return-object v0

    .line 390
    :cond_8
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۘ:Z

    if-eqz v0, :cond_9

    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v5, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v7, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    return-object v0

    .line 391
    :cond_9
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۘ()J

    move-result-wide v0

    .line 392
    iget-object v2, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-ne p1, v2, :cond_a

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_a

    iget-object v2, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v2

    iget-object v4, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v4}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v2, v0

    if-ltz v4, :cond_a

    .line 393
    new-instance v0, Ll/ۚ᩺ۜ;

    iget-wide v9, p0, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v11, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v12}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    return-object v0

    :cond_a
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic ܽ(Ll/᩶᩺ۜ;)V
    .locals 0

    .line 281
    iget-object p0, p0, Ll/᩶᩺ۜ;->᩻֫:Ll/ۨ᩺ۜ;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ll/ۨ᩺ۜ;->close()V

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 581
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ܿ(Ll/᩶᩺ۜ;)V
    .locals 1

    .line 276
    invoke-direct {p0}, Ll/᩶᩺ۜ;->ۖ()V

    const/4 v0, 0x1

    .line 277
    invoke-direct {p0, v0}, Ll/᩶᩺ۜ;->ۧ(Z)V

    .line 278
    iget-object p0, p0, Ll/᩶᩺ۜ;->ۖ֫:Ll/ۨ᩺ۜ;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ll/ۨ᩺ۜ;->close()V

    :cond_0
    return-void
.end method

.method public static synthetic ܿ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 433
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method private ᩳ(Ll/ܶ᩺ۜ;)J
    .locals 6

    .line 465
    iget-object v0, p1, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    if-eqz v0, :cond_2

    iget-boolean v1, p1, Ll/ܶ᩺ۜ;->۬:Z

    if-nez v1, :cond_2

    iget-object v0, v0, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/᩶᩺ۜ;->ۢ֫:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    .line 467
    :goto_0
    iget-object v1, p1, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget-object v1, v1, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v4, p1, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget-object v4, v4, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v1, v4, v0}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-lez v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 469
    :cond_1
    iget-object v1, p1, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget-object v1, v1, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object p1, p1, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    iget-object p1, p1, Ll/᩹ۨۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {v1, p1, v0}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v0

    return-wide v0

    :cond_2
    :goto_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static synthetic ᩳ(Ll/᩶᩺ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    return-void
.end method

.method public static synthetic ᩳ(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 527
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/᩶᩺ۜ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->ۘ֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩴ()V
    .locals 22

    move-object/from16 v10, p0

    .line 493
    iget-boolean v0, v10, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_10

    iget-boolean v0, v10, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v0, :cond_10

    iget-object v0, v10, Ll/᩶᩺ۜ;->ܳ֫:Ll/ܶ᩺ۜ;

    if-nez v0, :cond_10

    iget-object v0, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eqz v0, :cond_10

    iget-object v0, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v0, v0, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-nez v0, :cond_0

    iget-object v0, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ᩳ:Z

    if-eqz v0, :cond_10

    :cond_0
    iget-object v0, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v0, v0, Ll/ܶ᩺ۜ;->ۘ:Z

    if-eqz v0, :cond_1

    goto/16 :goto_b

    .line 473
    :cond_1
    iget-boolean v0, v10, Ll/᩶᩺ۜ;->۬:Z

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v0, :cond_6

    iget-boolean v0, v10, Ll/᩶᩺ۜ;->᩸:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v10, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_6

    invoke-direct/range {p0 .. p0}, Ll/᩶᩺ۜ;->ۘ()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-lez v0, :cond_2

    goto/16 :goto_3

    .line 474
    :cond_2
    iget-object v0, v10, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v0}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v5

    iget-object v0, v10, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v0}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/4 v0, 0x0

    .line 476
    :goto_0
    iget-object v7, v10, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v0, v7, :cond_4

    .line 477
    iget-object v7, v10, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ᩺ۜ;

    .line 478
    invoke-direct {v10, v7}, Ll/᩶᩺ۜ;->ᩳ(Ll/ܶ᩺ۜ;)J

    move-result-wide v8

    .line 479
    iget-object v11, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v7, v11, :cond_3

    cmp-long v11, v8, v1

    if-lez v11, :cond_3

    cmp-long v11, v8, v5

    if-gtz v11, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 481
    :cond_4
    iget-wide v7, v10, Ll/᩶᩺ۜ;->ۢ֫:J

    cmp-long v0, v5, v7

    if-ltz v0, :cond_6

    const/4 v0, 0x0

    :goto_1
    iget-object v5, v10, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v0, v5, :cond_6

    .line 482
    iget-object v5, v10, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/ܶ᩺ۜ;

    .line 483
    iget-object v5, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v7, v5, :cond_5

    iget-boolean v5, v7, Ll/ܶ᩺ۜ;->ۧ:Z

    if-nez v5, :cond_5

    iget-boolean v5, v7, Ll/ܶ᩺ۜ;->ᩳ:Z

    if-nez v5, :cond_5

    iget-boolean v5, v7, Ll/ܶ᩺ۜ;->֨:Z

    if-nez v5, :cond_5

    iget-object v5, v7, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-nez v5, :cond_5

    iget-object v5, v7, Ll/ܶ᩺ۜ;->۫:Ll/᩺ۨۜ;

    invoke-virtual {v5}, Ll/᩺ۨۜ;->֫()Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_2
    move-object v8, v7

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    :goto_3
    move-object v8, v4

    :goto_4
    if-nez v8, :cond_7

    goto/16 :goto_b

    .line 497
    :cond_7
    iget-object v9, v8, Ll/ܶ᩺ۜ;->ܶ:Ll/᩹ۨۜ;

    const/4 v0, 0x1

    if-eqz v9, :cond_8

    const/4 v3, 0x1

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_9

    .line 499
    invoke-direct {v10, v8}, Ll/᩶᩺ۜ;->ᩳ(Ll/ܶ᩺ۜ;)J

    move-result-wide v6

    goto :goto_6

    :cond_9
    iget-wide v6, v10, Ll/᩶᩺ۜ;->ۢ֫:J

    .line 501
    :goto_6
    iget-object v3, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v3, v3, Ll/ܶ᩺ۜ;->᩶:Z

    if-eqz v3, :cond_b

    iget-object v3, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v3, v3, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    if-eqz v3, :cond_a

    iget-object v3, v10, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object v3, v3, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 502
    invoke-virtual {v3}, Ll/ܰۛۜ;->֫()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_7

    .line 504
    :cond_a
    iget-wide v11, v10, Ll/᩶᩺ۜ;->᩹:J

    iget-object v3, v10, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v3}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v13

    iget-object v3, v10, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v3}, Ll/᩶ۛۜ;->ۧ()J

    move-result-wide v15

    sub-long/2addr v13, v15

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    goto :goto_8

    .line 503
    :cond_b
    :goto_7
    iget-wide v11, v10, Ll/᩶᩺ۜ;->ۢ֫:J

    :goto_8
    move-wide/from16 v19, v11

    .line 505
    iget-object v3, v10, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    invoke-virtual {v3, v6, v7}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v3

    if-nez v3, :cond_c

    goto :goto_b

    :cond_c
    if-eqz v5, :cond_d

    .line 507
    invoke-virtual {v9}, Ll/᩹ۨۜ;->᩺ۧ()Ll/᩹ۨۜ;

    move-result-object v11

    move-object/from16 v21, v11

    goto :goto_9

    :cond_d
    move-object/from16 v21, v4

    .line 508
    :goto_9
    iput-object v8, v10, Ll/᩶᩺ۜ;->ܳ֫:Ll/ܶ᩺ۜ;

    if-eqz v5, :cond_e

    move-wide v1, v6

    .line 509
    :cond_e
    iput-wide v1, v10, Ll/᩶᩺ۜ;->ܺ֫:J

    if-eqz v5, :cond_f

    goto :goto_a

    :cond_f
    move-object v4, v3

    .line 510
    :goto_a
    iput-object v4, v10, Ll/᩶᩺ۜ;->᩺:Ll/᩹ۛۜ;

    .line 511
    new-instance v4, Ll/ۚ᩺ۜ;

    iget-wide v1, v10, Ll/᩶᩺ۜ;->ܰ:J

    iget-wide v6, v10, Ll/᩶᩺ۜ;->ᩳ֫:J

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v4

    move-object v12, v8

    move-wide v15, v1

    move-wide/from16 v17, v6

    invoke-direct/range {v11 .. v18}, Ll/ۚ᩺ۜ;-><init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V

    .line 512
    iput-boolean v0, v4, Ll/ۚ᩺ۜ;->ܿ:Z

    .line 513
    iget-object v11, v10, Ll/᩶᩺ۜ;->ۜ֫:Ljava/util/concurrent/ExecutorService;

    new-instance v12, Ll/֡᩺ۜ;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-object/from16 v5, v21

    move-wide/from16 v6, v19

    invoke-direct/range {v0 .. v9}, Ll/֡᩺ۜ;-><init>(Ll/᩶᩺ۜ;Ll/᩹ۛۜ;Ll/ۚ᩺ۜ;ZLl/᩹ۨۜ;JLl/ܶ᩺ۜ;Ll/᩹ۨۜ;)V

    invoke-interface {v11, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_10
    :goto_b
    return-void
.end method

.method public static bridge synthetic ᩵(Ll/᩶᩺ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ᩴ֫:J

    return-wide v0
.end method

.method private ᩵()V
    .locals 3

    .line 290
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 291
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ܽ֫:Z

    .line 292
    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۡ֫:Z

    if-eqz v1, :cond_1

    :goto_0
    return-void

    .line 293
    :cond_1
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ۡ֫:Z

    .line 294
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۧ֫:Landroid/os/Handler;

    new-instance v1, Ll/ܺ᩷ܳ;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0}, Ll/ܺ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩶᩺ۜ;)Ll/ܶ᩺ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    return-object p0
.end method

.method public static synthetic ᩷(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 585
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/᩶᩺ۜ;)Ll/᩶ۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    return-object p0
.end method

.method public static ᩻()V
    .locals 2

    .line 286
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Gallery UI access off main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ᩻(Ll/᩶᩺ۜ;Ll/ۚ᩺ۜ;)Z
    .locals 0

    .line 572
    invoke-direct {p0, p1}, Ll/᩶᩺ۜ;->֫(Ll/ۚ᩺ۜ;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 263
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 264
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 265
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    .line 266
    iget-object v0, p0, Ll/᩶᩺ۜ;->᩶:Ll/᩶ۛۜ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩶ۛۜ;->֫(Ll/᩵۫᩷;)V

    const/4 v0, 0x0

    .line 267
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->᩸:Z

    .line 268
    iput-object v1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    .line 269
    iput-object v1, p0, Ll/᩶᩺ۜ;->۟:Ll/ۜ۫᩻;

    .line 270
    iget-object v2, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/۬ۛۜ;->ܿ()V

    .line 271
    :cond_1
    iput-object v1, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    .line 272
    :goto_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩺ۜ;

    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->ۧ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 273
    :cond_2
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 275
    iget-object v0, p0, Ll/᩶᩺ۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩷۠᩷;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 280
    iget-object v0, p0, Ll/᩶᩺ۜ;->֡֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 281
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۜ֫:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/֡ܿܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֡ܿܳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 282
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۜ֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/ܶۨۜ;
    .locals 1

    .line 138
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 139
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩺ۜ;

    if-eqz p1, :cond_1

    .line 140
    iget-boolean v0, p1, Ll/ܶ᩺ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(IJ)V
    .locals 4

    .line 210
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 211
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺ۜ;

    if-eqz v0, :cond_1

    .line 212
    iget-wide v1, v0, Ll/ܶ᩺ۜ;->ۙ:J

    cmp-long v3, v1, p2

    if-nez v3, :cond_1

    .line 213
    iget-object p2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 214
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    .line 215
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 216
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۜ۫᩻;)V
    .locals 0

    .line 128
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 129
    iput-object p1, p0, Ll/᩶᩺ۜ;->۟:Ll/ۜ۫᩻;

    return-void
.end method

.method public final ֫(Ll/۬ۛۜ;I)V
    .locals 1

    .line 110
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 111
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-nez v0, :cond_0

    .line 112
    iput-object p1, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۚۛۜ;

    .line 113
    iput-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    .line 114
    invoke-virtual {p1, p0, p2}, Ll/۬ۛۜ;->֫(Ll/᩶᩺ۜ;I)V

    return-void

    .line 111
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Gallery session already attached or closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 4

    .line 230
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 231
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->᩸:Z

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 232
    :cond_0
    iput-boolean p1, p0, Ll/᩶᩺ۜ;->᩸:Z

    .line 233
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ܰ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩶᩺ۜ;->ܰ:J

    const/4 v0, 0x0

    .line 234
    :goto_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 235
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 236
    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->֫()V

    if-eqz p1, :cond_1

    .line 237
    iget-object v2, v1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 238
    iput-boolean v2, v1, Ll/ܶ᩺ۜ;->ۘ:Z

    .line 239
    iput-boolean v2, v1, Ll/ܶ᩺ۜ;->᩸:Z

    .line 241
    :cond_1
    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->ᩳ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 244
    :cond_2
    iget-object p1, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 245
    :cond_3
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ(IJ)V
    .locals 7

    .line 195
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 196
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_0

    return-void

    .line 197
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺ۜ;

    if-eqz v0, :cond_1

    .line 198
    invoke-virtual {v0}, Ll/ܶ᩺ۜ;->ۧ()V

    .line 199
    :cond_1
    new-instance v0, Ll/ܶ᩺ۜ;

    iget-object v1, p0, Ll/᩶᩺ۜ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/᩺ۨۜ;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Ll/ܶ᩺ۜ;-><init>(Ll/᩶᩺ۜ;IJLl/᩺ۨۜ;)V

    .line 200
    iget-object p2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 201
    iget p2, p0, Ll/᩶᩺ۜ;->ۤ:I

    if-ne p1, p2, :cond_2

    .line 202
    iput-object v0, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    const/4 p1, 0x1

    .line 203
    iput-boolean p1, v0, Ll/ܶ᩺ۜ;->ۧ֫:Z

    .line 205
    :cond_2
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    return-void
.end method

.method public final ۧ(Ll/۬ۛۜ;I)V
    .locals 1

    .line 119
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 120
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0}, Ll/۬ۛۜ;->ܿ()V

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    .line 123
    invoke-virtual {p0, p1, p2}, Ll/᩶᩺ۜ;->֫(Ll/۬ۛۜ;I)V

    return-void

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Gallery session is not attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩺ۜ;

    if-eqz p1, :cond_0

    .line 144
    iget-boolean p1, p1, Ll/ܶ᩺ۜ;->ᩳ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()V
    .locals 6

    .line 250
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 251
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ܰ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩶᩺ۜ;->ܰ:J

    const/4 v0, 0x0

    .line 252
    :goto_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 253
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 254
    iget-wide v2, v1, Ll/ܶ᩺ۜ;->֫:J

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    const-wide/32 v4, 0x40000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܶ᩺ۜ;->֫:J

    .line 255
    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->֫()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 257
    :cond_0
    iget-object v0, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 258
    :cond_1
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    return-void
.end method

.method public final ܽ()V
    .locals 6

    .line 175
    iget-boolean v0, p0, Ll/᩶᩺ۜ;->۬:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 177
    :goto_0
    iget-object v3, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 178
    iget-object v3, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩺ۜ;

    .line 179
    iget-object v4, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    iget v5, v3, Ll/ܶ᩺ۜ;->ۚ:I

    invoke-virtual {v4, v5}, Ll/۬ۛۜ;->֫(I)Z

    move-result v4

    .line 180
    iget-boolean v5, v3, Ll/ܶ᩺ۜ;->ۖ:Z

    if-eq v5, v4, :cond_2

    .line 181
    iput-boolean v4, v3, Ll/ܶ᩺ۜ;->ۖ:Z

    if-nez v4, :cond_1

    .line 182
    invoke-virtual {v3}, Ll/ܶ᩺ۜ;->֫()V

    :cond_1
    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    const/4 v1, 0x0

    .line 188
    :goto_1
    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩺ۜ;

    iput-boolean v0, v2, Ll/ܶ᩺ۜ;->᩷:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 190
    :cond_4
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    :cond_5
    :goto_2
    return-void
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 148
    iget-object v0, p0, Ll/᩶᩺ۜ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ۨۜ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p1, Ll/ۘܰۜ;

    return p1
.end method

.method public final ᩳ()V
    .locals 2

    .line 226
    iget v0, p0, Ll/᩶᩺ۜ;->ۤ:I

    .line 222
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 223
    iget-boolean v1, p0, Ll/᩶᩺ۜ;->ۗ:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩶᩺ۜ;->᩵֫:Ll/۬ۛۜ;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ll/۬ۛۜ;->ۧ(I)Z

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 4

    .line 152
    invoke-static {}, Ll/᩶᩺ۜ;->᩻()V

    .line 153
    iget-wide v0, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩶᩺ۜ;->ᩳ֫:J

    .line 154
    iput p1, p0, Ll/᩶᩺ۜ;->ۤ:I

    .line 155
    iget-object v0, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩺ۜ;

    iput-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    .line 156
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 157
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iput-boolean v0, p1, Ll/ܶ᩺ۜ;->ܰ:Z

    .line 158
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-object p1, p1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iput-boolean v1, p1, Ll/ܶ᩺ۜ;->ۘ:Z

    .line 160
    :cond_0
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v2, p1, Ll/ܶ᩺ۜ;->᩸:Z

    iget-object v3, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iget-boolean v3, v3, Ll/ܶ᩺ۜ;->ۧ֫:Z

    or-int/2addr v2, v3

    iput-boolean v2, p1, Ll/ܶ᩺ۜ;->᩸:Z

    .line 161
    iget-object p1, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    iput-boolean v1, p1, Ll/ܶ᩺ۜ;->ۧ֫:Z

    :cond_1
    const/4 p1, 0x0

    .line 163
    :goto_0
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    .line 164
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩺ۜ;

    .line 165
    iget-boolean v2, p0, Ll/᩶᩺ۜ;->۬:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/᩶᩺ۜ;->۫:Ll/ܶ᩺ۜ;

    if-eq v1, v2, :cond_2

    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->֫()V

    .line 166
    :cond_2
    invoke-virtual {v1}, Ll/ܶ᩺ۜ;->ᩳ()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 169
    :goto_1
    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge p1, v1, :cond_4

    iget-object v1, p0, Ll/᩶᩺ۜ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩺ۜ;

    iput-boolean v0, v1, Ll/ܶ᩺ۜ;->۬:Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 170
    :cond_4
    invoke-direct {p0}, Ll/᩶᩺ۜ;->᩵()V

    return-void
.end method
