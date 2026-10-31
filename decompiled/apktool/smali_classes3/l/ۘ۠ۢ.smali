.class public abstract Ll/ۘ۠ۢ;
.super Ljava/lang/Object;
.source "VAJH"

# interfaces
.implements Ll/ܿۖ᩷;


# static fields
.field public static final ۢ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ᩷֫:Landroid/os/Handler;


# instance fields
.field public final ֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/lang/ref/WeakReference;

.field public ۛ:I

.field public final ۜ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۟:Ljava/lang/CharSequence;

.field public ۤ:Ljava/util/concurrent/CountDownLatch;

.field public final ۧ֫:Ljava/lang/ref/WeakReference;

.field public ۨ:Landroid/os/Bundle;

.field public ۫:Z

.field public ۬:Ljava/util/ArrayList;

.field public ܰ:Ll/ۡۤۡ;

.field public final ܳ֫:Ljava/lang/Object;

.field public ܽ֫:I

.field public ܿ֫:Ll/ܳ۠ۢ;

.field public ᩳ֫:Ll/ܿ۠ۢ;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩸:Z

.field public final ᩹:Ll/ۚۡ֫;

.field public ᩺:Ll/᩷ۡ֫;

.field public ᩻֫:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 77
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ۘ۠ۢ;->ۢ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 541
    new-instance v0, Ll/᩷۠ۢ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ۘ۠ۢ;->᩷֫:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->ܳ֫:Ljava/lang/Object;

    .line 83
    sget-object v0, Ll/ܳ۠ۢ;->᩹:Ll/ܳ۠ۢ;

    iput-object v0, p0, Ll/ۘ۠ۢ;->ܿ֫:Ll/ܳ۠ۢ;

    .line 87
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۘ۠ۢ;->ۧ֫:Ljava/lang/ref/WeakReference;

    .line 88
    new-instance v0, Ll/ۚۡ֫;

    .line 33
    invoke-direct {v0, p0}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 88
    iput-object v0, p0, Ll/ۘ۠ۢ;->᩹:Ll/ۚۡ֫;

    const/4 v0, -0x1

    .line 92
    iput v0, p0, Ll/ۘ۠ۢ;->ܽ֫:I

    .line 95
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->ۜ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 99
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ll/ۘ۠ۢ;->ۤ:Ljava/util/concurrent/CountDownLatch;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->۬:Ljava/util/ArrayList;

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->ۗ:Ljava/util/ArrayList;

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۠ۢ;->᩶:Ljava/util/ArrayList;

    const/16 v0, 0x14

    .line 558
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ۠ۢ;->ܰ:Ll/ۡۤۡ;

    return-void
.end method

.method public static ֫([Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 677
    invoke-static {p0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ۜ۠ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ۠ۢ;-><init>(I)V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۘ۠ۢ;)Ll/ۚۡ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ۠ۢ;->᩹:Ll/ۚۡ֫;

    return-object p0
.end method

.method private ֫(Ll/ۗܺ᩷;Z)V
    .locals 3

    .line 453
    iget-object v0, p0, Ll/ۘ۠ۢ;->ܳ֫:Ljava/lang/Object;

    monitor-enter v0

    .line 454
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֡֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 455
    monitor-exit v0

    return-void

    .line 457
    :cond_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֨()Ll/֡ۚۢ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 458
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 460
    invoke-virtual {v1}, Ll/֡ۚۢ;->֫()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v2

    if-ne v2, p1, :cond_1

    .line 461
    monitor-exit v0

    return-void

    .line 463
    :cond_1
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 465
    :cond_2
    iput-boolean p2, p0, Ll/ۘ۠ۢ;->۫:Z

    .line 466
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۙ֫()V

    .line 467
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;

    move-result-object p2

    .line 468
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(Ll/֡ۚۢ;)V

    .line 469
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ۘ۠ۢ;->ۙ:Ljava/lang/ref/WeakReference;

    .line 470
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic ֫(Ll/ۘ۠ۢ;Ll/ۗܺ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 329
    invoke-direct {p0, p1, v0}, Ll/ۘ۠ۢ;->֫(Ll/ۗܺ᩷;Z)V

    .line 330
    iget-object p1, p0, Ll/ۘ۠ۢ;->ۤ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 331
    invoke-static {p0}, Ll/ܶ۠ۢ;->ۧ(Ll/ۘ۠ۢ;)V

    return-void
.end method

.method private ᩸(Ljava/lang/String;)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Key not found in input data"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    .line 284
    iput-boolean v0, p0, Ll/ۘ۠ۢ;->᩸:Z

    return-void
.end method

.method public final ֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 159
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֡֫()Z
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ۘ۠ۢ;->ܿ֫:Ll/ܳ۠ۢ;

    sget-object v1, Ll/ܳ۠ۢ;->᩶:Ll/ܳ۠ۢ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֨(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 151
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֨()Ll/֡ۚۢ;
    .locals 1

    .line 482
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۙ:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 483
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۚۢ;

    return-object v0
.end method

.method public ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 0

    .line 350
    invoke-static {p1}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "TaskId"

    const/4 v1, -0x1

    .line 106
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۘ۠ۢ;->ۛ:I

    const-string v0, "TaskArgument"

    .line 107
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    return-void
.end method

.method public abstract ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
.end method

.method public ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 513
    iput-object p1, p0, Ll/ۘ۠ۢ;->۟:Ljava/lang/CharSequence;

    .line 514
    iget-object p1, p0, Ll/ۘ۠ۢ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 515
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public final ֫(Ll/ۖ۠ۢ;)V
    .locals 2

    .line 313
    iget-object v0, p0, Ll/ۘ۠ۢ;->ܿ֫:Ll/ܳ۠ۢ;

    sget-object v1, Ll/ܳ۠ۢ;->᩶:Ll/ܳ۠ۢ;

    if-eq v0, v1, :cond_0

    .line 316
    iget-object v0, p0, Ll/ۘ۠ۢ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 314
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not add FinallyListener after finished"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 634
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    .line 635
    invoke-virtual {p1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    .line 636
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->cancel()V

    return-void

    .line 638
    :cond_0
    check-cast p1, Ll/᩷ۡ֫;

    iput-object p1, p0, Ll/ۘ۠ۢ;->᩺:Ll/᩷ۡ֫;

    return-void
.end method

.method public ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܳ۠ۢ;)V
    .locals 1

    .line 245
    sget-object v0, Ll/ܳ۠ۢ;->᩶:Ll/ܳ۠ۢ;

    if-ne p1, v0, :cond_0

    .line 248
    :try_start_0
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۤ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 253
    :catch_0
    :cond_0
    iget-object v0, p0, Ll/ۘ۠ۢ;->ܳ֫:Ljava/lang/Object;

    monitor-enter v0

    .line 254
    :try_start_1
    iput-object p1, p0, Ll/ۘ۠ۢ;->ܿ֫:Ll/ܳ۠ۢ;

    .line 255
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܿ۠ۢ;)V
    .locals 5

    .line 359
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֨()Ll/֡ۚۢ;

    move-result-object v0

    .line 360
    iget-object v1, p0, Ll/ۘ۠ۢ;->۬:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 361
    sget-object v2, Ll/ۘ۠ۢ;->᩷֫:Landroid/os/Handler;

    iget v3, p0, Ll/ۘ۠ۢ;->ۛ:I

    invoke-virtual {v2, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 362
    new-instance v2, Ll/᩷۠᩷;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v3, 0x32

    invoke-static {v2, v3, v4}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 364
    :cond_0
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 366
    :goto_0
    invoke-virtual {v0}, Ll/֡ۚۢ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Ll/ۗܺ᩷;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    iget-boolean v2, p0, Ll/ۘ۠ۢ;->۫:Z

    .line 369
    invoke-virtual {p0, v0, p1, v2}, Ll/ۘ۠ۢ;->֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V

    .line 370
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ۠ۢ;

    .line 371
    invoke-interface {v4, v0, p1, v2}, Ll/ܺ۠ۢ;->֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V

    goto :goto_1

    .line 374
    :cond_1
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 376
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩹֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 377
    invoke-virtual {p1, v0}, Ll/ܿ۠ۢ;->֫(Ll/ۗܺ᩷;)V

    goto :goto_2

    .line 381
    :cond_2
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 383
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩹֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 615
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    const-class v3, Ll/ۢܶۢ;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 616
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, 0x4000000

    invoke-static {v2, v3, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 617
    new-instance v2, Ll/᩷᩶;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    const-string v4, "MTaskService3"

    invoke-direct {v2, v3, v4}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 618
    invoke-virtual {v2}, Ll/᩷᩶;->ܳ()V

    .line 619
    invoke-virtual {v2}, Ll/᩷᩶;->ᩳ()V

    const v3, 0x7f120a22

    .line 651
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    .line 620
    invoke-virtual {v2, v3}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 621
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۘ֫()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    .line 622
    invoke-virtual {v2, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 623
    invoke-virtual {v2}, Ll/᩷᩶;->ۧ()V

    const/4 v0, 0x1

    .line 624
    invoke-virtual {v2, v0}, Ll/᩷᩶;->֫(Z)V

    .line 625
    sget-object v0, Ll/ۡܶۢ;->۫:Landroid/app/NotificationManager;

    iget v3, p0, Ll/ۘ۠ۢ;->ۛ:I

    add-int/lit16 v3, v3, 0x2710

    invoke-virtual {v2}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 388
    :cond_3
    :goto_2
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 389
    invoke-static {p0}, Ll/ܶ۠ۢ;->֫(Ll/ۘ۠ۢ;)V

    .line 391
    :cond_4
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 393
    invoke-virtual {v0}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 395
    iget-object v3, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    const-string v4, "ARG_CURRENT_WINDOW_LEFT"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 396
    iget-object v3, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    goto :goto_3

    .line 397
    :cond_5
    invoke-virtual {v2}, Ll/ۢۘܳ;->᩵()Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_6

    .line 398
    invoke-virtual {v2}, Ll/ۢۘܳ;->᩷()Ll/ܽۢܳ;

    move-result-object v4

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Ll/ۢۘܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v4

    :goto_4
    if-nez v3, :cond_7

    .line 399
    invoke-virtual {v2}, Ll/ۢۘܳ;->᩷()Ll/ܽۢܳ;

    move-result-object v2

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ll/ۢۘܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v2

    .line 400
    :goto_5
    invoke-virtual {p0, v0, v4, v2, p1}, Ll/ۘ۠ۢ;->֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V

    .line 401
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ۠ۢ;

    .line 402
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    .line 406
    :cond_8
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ۧ(Ll/ܿ۠ۢ;)V

    .line 407
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ۠ۢ;

    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_7

    .line 410
    :cond_9
    iget-object p1, p0, Ll/ۘ۠ۢ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 411
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_8

    .line 413
    :cond_a
    iget-object p1, p0, Ll/ۘ۠ۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/AutoCloseable;

    .line 414
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_9

    :cond_b
    return-void
.end method

.method public final ֫(Ll/ܽۢܳ;)Z
    .locals 1

    const-string v0, "ARG_ANOTHER_WINDOW_DIGEST"

    .line 241
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 663
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫֫()Ll/ܰܺܳ;
    .locals 3

    const-string v0, "ARG_STATELESS_VISITOR"

    .line 211
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x1

    .line 212
    invoke-static {v0, v1}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v0

    .line 213
    instance-of v1, v0, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/lang/AutoCloseable;

    .line 214
    iget-object v2, p0, Ll/ۘ۠ۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final ۖ(Ljava/lang/String;)J
    .locals 2

    .line 172
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۗ֫()V
    .locals 3

    .line 326
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܺ()Ll/ۗܺ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 328
    new-instance v1, Ll/᩻۠ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, v0}, Ll/᩻۠ۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 334
    :cond_0
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۤ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 335
    invoke-static {p0}, Ll/ܶ۠ۢ;->ۧ(Ll/ۘ۠ۢ;)V

    return-void
.end method

.method public final ۘ(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 1

    .line 202
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۘ֫()Ljava/lang/CharSequence;
.end method

.method public ۙ֫()V
    .locals 2

    .line 554
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۜ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 555
    iget-object v0, p0, Ll/ۘ۠ۢ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final ۚ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۢۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۚ()Ll/ۚۡ֫;
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ۘ۠ۢ;->᩹:Ll/ۚۡ֫;

    return-object v0
.end method

.method public final ۛ()Ll/ۨۧᩳ;
    .locals 5

    .line 229
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    const-string v1, "ARG_SIGNATURE_OPTIONS"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 25
    :cond_0
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 26
    invoke-virtual {v1}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ܿᩳ;->֫([B)Ll/۬ܿᩳ;

    move-result-object v0

    .line 27
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v2

    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    aget-object v2, v2, v3

    .line 28
    invoke-virtual {v1}, Ll/۬ۜܽ;->֡()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {v1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    .line 30
    new-instance v4, Ll/ۨۧᩳ;

    invoke-direct {v4, v0, v2, v3, v1}, Ll/ۨۧᩳ;-><init>(Ll/۬ܿᩳ;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object v4
.end method

.method public final ۜ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 519
    iget-object v0, p0, Ll/ۘ۠ۢ;->۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۠()Ll/ۨܺ᩷;
.end method

.method public final ۡ(I)V
    .locals 0

    .line 491
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    return-void
.end method

.method public ۡ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ᩴ᩸ܽ;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۡ֫()Ll/ܿ۠ۢ;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۘ۠ۢ;->ᩳ֫:Ll/ܿ۠ۢ;

    return-object v0
.end method

.method public abstract ۢ()Ll/ܿ۠ۢ;
.end method

.method public ۢ(I)V
    .locals 1

    .line 531
    iget v0, p0, Ll/ۘ۠ۢ;->ܽ֫:I

    if-eq v0, p1, :cond_0

    .line 532
    iput p1, p0, Ll/ۘ۠ۢ;->ܽ֫:I

    .line 533
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    :cond_0
    return-void
.end method

.method public final ۢ֫()I
    .locals 1

    .line 538
    iget v0, p0, Ll/ۘ۠ۢ;->ܽ֫:I

    return v0
.end method

.method public abstract ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;
.end method

.method public ۧ()Ll/۬ۧᩳ;
    .locals 1

    const v0, 0x7f1209a7

    .line 772
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const/4 v0, 0x0

    .line 773
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 774
    new-instance v0, Ll/ۡ۠ۢ;

    invoke-direct {v0, p0}, Ll/ۡ۠ۢ;-><init>(Ll/ۘ۠ۢ;)V

    return-object v0
.end method

.method public final ۧ(JJ)V
    .locals 0

    .line 527
    invoke-static {p1, p2, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public abstract ۧ(Ll/ܿ۠ۢ;)V
.end method

.method public final ۧ(Ll/ܽۢܳ;)Z
    .locals 1

    const-string v0, "ARG_CURRENT_WINDOW_DIGEST"

    .line 237
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 659
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۨ()Landroid/os/Bundle;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    return-object v0
.end method

.method public final ۫()I
    .locals 1

    .line 114
    iget v0, p0, Ll/ۘ۠ۢ;->ۛ:I

    return v0
.end method

.method public final ۬֫()Ll/ܿ۠ۢ;
    .locals 1

    .line 643
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public ܶ(Ljava/lang/String;)V
    .locals 1

    .line 495
    iput-object p1, p0, Ll/ۘ۠ۢ;->᩻֫:Ljava/lang/CharSequence;

    .line 496
    iget-object p1, p0, Ll/ۘ۠ۢ;->ۜ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 497
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public final ܶ֫()Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 523
    iget-object v2, p0, Ll/ۘ۠ۢ;->֫֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    return v0
.end method

.method public final ܺ(Ljava/lang/String;)I
    .locals 1

    .line 167
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public ܺ()Ll/ۗܺ᩷;
    .locals 1

    .line 478
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ۗܺ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 449
    invoke-direct {p0, p1, v0}, Ll/ۘ۠ۢ;->֫(Ll/ۗܺ᩷;Z)V

    return-void
.end method

.method public final ܽ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 267
    iput-object p1, p0, Ll/ۘ۠ۢ;->ᩳ֫:Ll/ܿ۠ۢ;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 177
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܽ֫()Ll/ܰܺܳ;
    .locals 3

    const-string v0, "ARG_STATELESS_VISITOR2"

    .line 220
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x1

    .line 221
    invoke-static {v0, v1}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v0

    .line 222
    instance-of v1, v0, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/lang/AutoCloseable;

    .line 223
    iget-object v2, p0, Ll/ۘ۠ۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final ܿ()Ll/ۘ۠ۢ;
    .locals 2

    .line 682
    new-instance v0, Ll/ۢ۠ۢ;

    invoke-direct {v0}, Ll/ۘ۠ۢ;-><init>()V

    .line 719
    iget v1, p0, Ll/ۘ۠ۢ;->ۛ:I

    iput v1, v0, Ll/ۘ۠ۢ;->ۛ:I

    .line 720
    iget-object v1, p0, Ll/ۘ۠ۢ;->ᩳ֫:Ll/ܿ۠ۢ;

    iput-object v1, v0, Ll/ۘ۠ۢ;->ᩳ֫:Ll/ܿ۠ۢ;

    const v1, 0x7f120a22

    .line 721
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ۠ۢ;->᩻֫:Ljava/lang/CharSequence;

    .line 722
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۘ֫()Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ۠ۢ;->۟:Ljava/lang/CharSequence;

    .line 723
    sget-object v1, Ll/ܳ۠ۢ;->᩶:Ll/ܳ۠ۢ;

    iput-object v1, v0, Ll/ۘ۠ۢ;->ܿ֫:Ll/ܳ۠ۢ;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 509
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩴ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 146
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final ᩴ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ۘ۠ۢ;->᩻֫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ᩵(Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .line 129
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object p1

    .line 130
    invoke-static {p1}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object p1

    .line 131
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 132
    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 134
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ᩶֫()V
    .locals 5

    .line 561
    iget-object v0, p0, Ll/ۘ۠ۢ;->ܰ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 562
    iget v0, p0, Ll/ۘ۠ۢ;->ۛ:I

    iget-object v1, p0, Ll/ۘ۠ۢ;->ۧ֫:Ljava/lang/ref/WeakReference;

    sget-object v2, Ll/ۘ۠ۢ;->᩷֫:Landroid/os/Handler;

    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v3, 0x14

    .line 563
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public abstract ᩷()V
.end method

.method public final ᩷(Ljava/lang/String;)[B
    .locals 2

    .line 182
    invoke-direct {p0, p1}, Ll/ۘ۠ۢ;->᩸(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Ll/ۘ۠ۢ;->ۨ:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 184
    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    check-cast p1, [B

    return-object p1

    .line 186
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 187
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 190
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    iget-object v1, p0, Ll/ۘ۠ۢ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0

    :catch_0
    move-exception p1

    .line 192
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 197
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown: "

    .line 0
    invoke-static {p1, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 197
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩸֫()Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 505
    iget-object v2, p0, Ll/ۘ۠ۢ;->ۜ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    return v0
.end method

.method public ᩹֫()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۡܽ᩻;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 293
    iget-boolean v0, p0, Ll/ۘ۠ۢ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 296
    :cond_0
    iget-object v0, p0, Ll/ۘ۠ۢ;->᩺:Ll/᩷ۡ֫;

    if-eqz v0, :cond_1

    .line 297
    invoke-virtual {v0}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
