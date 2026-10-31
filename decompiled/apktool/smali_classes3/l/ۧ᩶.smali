.class public abstract Ll/ۧ᩶;
.super Landroid/app/Service;
.source "268P"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ۫:Ljava/lang/Object;

.field public static final ۬:Ljava/util/HashMap;


# instance fields
.field public ۗ:Ll/ܰ᩹;

.field public ۙ:Z

.field public ᩶:Ll/۫᩹;

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:Ll/֫᩶;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 109
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۧ᩶;->۫:Ljava/lang/Object;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۧ᩶;->۬:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 420
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/ۧ᩶;->ۙ:Z

    .line 421
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 422
    iput-object v0, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    return-void

    .line 424
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Landroid/content/ContextWrapper;Landroid/content/ComponentName;ZI)Ll/֫᩶;
    .locals 3

    .line 533
    sget-object v0, Ll/ۧ᩶;->۬:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩶;

    if-nez v1, :cond_2

    .line 535
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_1

    if-eqz p2, :cond_0

    .line 539
    new-instance p2, Ll/۟᩹;

    invoke-direct {p2, p0, p1, p3}, Ll/۟᩹;-><init>(Landroid/content/ContextWrapper;Landroid/content/ComponentName;I)V

    goto :goto_0

    .line 537
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t be here without a job id"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 541
    :cond_1
    new-instance p2, Ll/ۤ᩹;

    invoke-direct {p2, p0, p1}, Ll/ۤ᩹;-><init>(Landroid/content/ContextWrapper;Landroid/content/ComponentName;)V

    .line 543
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_2
    return-object v1
.end method

.method public static ֫(Landroid/app/Application;Landroid/content/Intent;)V
    .locals 4

    .line 2
    const-class v0, Ll/ۡܺۢ;

    .line 505
    new-instance v1, Landroid/content/ComponentName;

    invoke-direct {v1, p0, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 524
    sget-object v0, Ll/ۧ᩶;->۫:Ljava/lang/Object;

    monitor-enter v0

    const/16 v2, 0x64

    const/4 v3, 0x1

    .line 525
    :try_start_0
    invoke-static {p0, v1, v3, v2}, Ll/ۧ᩶;->֫(Landroid/content/ContextWrapper;Landroid/content/ComponentName;ZI)Ll/֫᩶;

    move-result-object p0

    .line 526
    invoke-virtual {p0, v2}, Ll/֫᩶;->֫(I)V

    .line 527
    invoke-virtual {p0, p1}, Ll/֫᩶;->֫(Landroid/content/Intent;)V

    .line 528
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 469
    iget-object p1, p0, Ll/ۧ᩶;->ۗ:Ll/ܰ᩹;

    if-eqz p1, :cond_0

    .line 470
    invoke-virtual {p1}, Ll/ܰ᩹;->֫()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 3

    .line 430
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 432
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    .line 433
    new-instance v0, Ll/ܰ᩹;

    invoke-direct {v0, p0}, Ll/ܰ᩹;-><init>(Ll/ۧ᩶;)V

    iput-object v0, p0, Ll/ۧ᩶;->ۗ:Ll/ܰ᩹;

    .line 434
    iput-object v2, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    return-void

    .line 436
    :cond_0
    iput-object v2, p0, Ll/ۧ᩶;->ۗ:Ll/ܰ᩹;

    .line 437
    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x0

    .line 438
    invoke-static {p0, v0, v1, v1}, Ll/ۧ᩶;->֫(Landroid/content/ContextWrapper;Landroid/content/ComponentName;ZI)Ll/֫᩶;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 480
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 481
    iget-object v0, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 482
    monitor-enter v0

    const/4 v1, 0x1

    .line 483
    :try_start_0
    iput-boolean v1, p0, Ll/ۧ᩶;->ۙ:Z

    .line 484
    iget-object v1, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    invoke-virtual {v1}, Ll/֫᩶;->֫()V

    .line 485
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .line 448
    iget-object p2, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    .line 449
    iget-object p2, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    invoke-virtual {p2}, Ll/֫᩶;->ܽ()V

    .line 451
    iget-object p2, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    move-object v0, p2

    monitor-enter v0

    .line 452
    :try_start_0
    iget-object p2, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    new-instance v1, Ll/ۛ᩹;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    :goto_0
    invoke-direct {v1, p0, p1, p3}, Ll/ۛ᩹;-><init>(Ll/ۧ᩶;Landroid/content/Intent;I)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 454
    invoke-virtual {p0, p1}, Ll/ۧ᩶;->֫(Z)V

    .line 455
    monitor-exit v0

    const/4 p1, 0x3

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method

.method public final ֫()V
    .locals 2

    .line 623
    iget-object v0, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 624
    monitor-enter v0

    const/4 v1, 0x0

    .line 625
    :try_start_0
    iput-object v1, p0, Ll/ۧ᩶;->᩶:Ll/۫᩹;

    .line 634
    iget-object v1, p0, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 635
    invoke-virtual {p0, v1}, Ll/ۧ᩶;->֫(Z)V

    goto :goto_0

    .line 636
    :cond_0
    iget-boolean v1, p0, Ll/ۧ᩶;->ۙ:Z

    if-nez v1, :cond_1

    .line 637
    iget-object v1, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    invoke-virtual {v1}, Ll/֫᩶;->֫()V

    .line 639
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method

.method public abstract ֫(Landroid/content/Intent;)V
.end method

.method public final ֫(Z)V
    .locals 2

    .line 612
    iget-object v0, p0, Ll/ۧ᩶;->᩶:Ll/۫᩹;

    if-nez v0, :cond_1

    .line 613
    new-instance v0, Ll/۫᩹;

    invoke-direct {v0, p0}, Ll/۫᩹;-><init>(Ll/ۧ᩶;)V

    iput-object v0, p0, Ll/ۧ᩶;->᩶:Ll/۫᩹;

    .line 614
    iget-object v0, p0, Ll/ۧ᩶;->᩹:Ll/֫᩶;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 615
    invoke-virtual {v0}, Ll/֫᩶;->ۧ()V

    .line 618
    :cond_0
    iget-object p1, p0, Ll/ۧ᩶;->᩶:Ll/۫᩹;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method
