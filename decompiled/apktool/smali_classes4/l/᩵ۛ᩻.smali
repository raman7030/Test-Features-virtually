.class public Ll/᩵ۛ᩻;
.super Landroid/app/Service;
.source "A6XJ"


# static fields
.field public static volatile ۛ:Z

.field public static volatile ۤ:Ll/ܳۛ᩻;

.field public static ۫:Ll/᩵ۛ᩻;

.field public static final synthetic ۬:I


# instance fields
.field public ۗ:Landroid/net/wifi/WifiManager$WifiLock;

.field public ۙ:Landroid/os/PowerManager$WakeLock;

.field public ᩶:Ljava/util/concurrent/ScheduledExecutorService;

.field public ᩸:Z

.field public ᩹:Ll/᩹ۢۡ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static synthetic ֫()Ll/ܳۛ᩻;
    .locals 1

    .line 98
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    return-object v0
.end method

.method public static ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 591
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.mcp.ACTION_FAILED_TO_START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 592
    instance-of v1, p0, Ljava/net/BindException;

    if-eqz v1, :cond_0

    .line 593
    invoke-static {}, Ll/᩸ۛ᩻;->ᩳ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const p0, 0x7f120935

    invoke-static {p0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 594
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v1, "error"

    .line 595
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 596
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ֫(Ll/᩵ۛ᩻;)V
    .locals 1

    .line 349
    :try_start_0
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    const-string v0, "MT MCP health check failed"

    .line 351
    invoke-static {v0, p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private ۖ()V
    .locals 4

    .line 526
    invoke-static {}, Ll/᩵ۛ᩻;->᩷()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Ll/᩸ۛ᩻;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 531
    :cond_0
    :try_start_0
    invoke-static {p0}, Ll/᩸ᩴܺ;->ۧ(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 532
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۡ()V

    return-void

    .line 535
    :cond_1
    iget-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    if-nez v0, :cond_2

    const-string v0, "mcp"

    .line 536
    invoke-static {p0, v0}, Ll/᩹ۢۡ;->֫(Landroid/app/Service;Ljava/lang/String;)Ll/᩹ۢۡ;

    move-result-object v0

    .line 537
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x7f08013c

    invoke-static {v1, v3, v2}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 537
    new-instance v1, Ll/ۢۛ᩻;

    invoke-direct {v1, p0}, Ll/ۢۛ᩻;-><init>(Ll/᩵ۛ᩻;)V

    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 538
    iput-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    .line 542
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 194
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "amfbc"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 196
    invoke-static {v1}, Ll/᩸ۛ᩻;->֫(I)I

    move-result v1

    .line 204
    invoke-static {v0, v1}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result v0

    .line 543
    iget-object v1, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 544
    iget-object v1, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    .line 212
    invoke-static {v0}, Ll/۟۫ۡ;->֫(I)I

    move-result v0

    const/16 v2, 0xdc

    if-le v0, v2, :cond_3

    const v0, -0xc4c4c5

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    .line 544
    :goto_0
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 546
    iget-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    invoke-virtual {v0}, Ll/᩹ۢۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 547
    iget-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    invoke-virtual {v0}, Ll/᩹ۢۡ;->show()V

    return-void

    .line 549
    :cond_4
    iget-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    invoke-virtual {v0}, Ll/᩹ۢۡ;->֫()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show MT MCP floating window"

    .line 553
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 554
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۡ()V

    return-void

    .line 527
    :cond_5
    :goto_1
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۡ()V

    return-void
.end method

.method public static ۜ()I
    .locals 2

    .line 145
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 147
    invoke-virtual {v0}, Ll/ܳۛ᩻;->ۡ()I

    move-result v0

    return v0

    .line 149
    :cond_0
    invoke-static {}, Ll/᩸ۛ᩻;->ᩳ()I

    move-result v0

    return v0
.end method

.method private ۡ()V
    .locals 2

    .line 562
    iget-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;

    if-nez v0, :cond_0

    return-void

    .line 566
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/᩹ۢۡ;->ܽ()V

    const/4 v0, 0x0

    .line 567
    iput-object v0, p0, Ll/᩵ۛ᩻;->᩹:Ll/᩹ۢۡ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to remove MT MCP floating window"

    .line 569
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۢ()V
    .locals 3

    .line 132
    invoke-static {}, Ll/᩵ۛ᩻;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 135
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 136
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩵ۛ᩻;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static synthetic ۧ()V
    .locals 4

    const/4 v0, 0x0

    .line 276
    sput-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    const/4 v1, 0x0

    .line 277
    sput-boolean v1, Ll/᩵ۛ᩻;->ۛ:Z

    .line 278
    sget-object v2, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    .line 279
    sput-object v0, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    if-eqz v2, :cond_0

    .line 280
    iget-boolean v3, v2, Ll/᩵ۛ᩻;->᩸:Z

    if-nez v3, :cond_0

    .line 282
    invoke-virtual {v2, v0, v1, v1}, Ll/᩵ۛ᩻;->onStartCommand(Landroid/content/Intent;II)I

    return-void

    .line 284
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.mcp.ACTION_STOPPED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method private ܳ()Landroid/app/Notification;
    .locals 7

    .line 613
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/۠᩶᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 614
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩵ۛ᩻;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "bin.mt.mcp.ACTION_STOP"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 615
    invoke-static {}, Ll/᩵ۛ᩻;->ۜ()I

    move-result v2

    .line 616
    invoke-static {v2}, Ll/ܿ۬᩻;->֫(I)Ljava/util/ArrayList;

    move-result-object v3

    .line 617
    new-instance v4, Ll/᩷᩶;

    const-string v5, "MT_APK_MCP"

    invoke-direct {v4, p0, v5}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 618
    invoke-virtual {v4}, Ll/᩷᩶;->ܳ()V

    const v5, 0x7f120569

    .line 619
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 620
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-static {v2}, Ll/ܿ۬᩻;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    :goto_0
    invoke-virtual {v4, v2}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    const/high16 v2, 0xc000000

    .line 621
    invoke-static {p0, v6, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 623
    invoke-virtual {v4}, Ll/᩷᩶;->ܽ()V

    .line 624
    invoke-virtual {v4, v6}, Ll/᩷᩶;->֫(Z)V

    const v0, 0x7f1209e1

    .line 625
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    .line 626
    invoke-static {p0, v3, v1, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x108001d

    .line 625
    invoke-virtual {v4, v2, v0, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 628
    invoke-virtual {v4}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized ܺ()V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 295
    :try_start_0
    iget-object v1, p0, Ll/᩵ۛ᩻;->᩶:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 296
    monitor-exit v0

    return-void

    .line 298
    :cond_0
    :try_start_1
    new-instance v1, Ll/ۜۛ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    iput-object v2, p0, Ll/᩵ۛ᩻;->᩶:Ljava/util/concurrent/ScheduledExecutorService;

    .line 303
    new-instance v3, Ll/᩷ۛ᩻;

    const/4 v1, 0x0

    invoke-direct {v3, v1, p0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x7530

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 305
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static synthetic ܽ()Ll/ܳۛ᩻;
    .locals 1

    .line 91
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    return-object v0
.end method

.method private ܿ()V
    .locals 5

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 337
    :try_start_0
    iget-object v1, p0, Ll/᩵ۛ᩻;->᩶:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    .line 338
    iput-object v2, p0, Ll/᩵ۛ᩻;->᩶:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_0

    .line 340
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 342
    :cond_0
    monitor-exit v0

    .line 506
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۡ()V

    .line 268
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    if-eqz v0, :cond_2

    .line 269
    sget-boolean v1, Ll/᩵ۛ᩻;->ۛ:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 272
    sput-boolean v1, Ll/᩵ۛ᩻;->ۛ:Z

    .line 273
    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Ll/᩻ۛ᩻;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0}, Ll/᩻ۛ᩻;-><init>(ILjava/lang/Object;)V

    const-string v0, "MT MCP Stop"

    invoke-direct {v1, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 508
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_4

    .line 509
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 510
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 512
    :cond_3
    iput-object v2, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    .line 514
    :cond_4
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_6

    .line 515
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 516
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 518
    :cond_5
    iput-object v2, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    :cond_6
    return-void

    :catchall_0
    move-exception v1

    .line 342
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private ᩳ()V
    .locals 15

    .line 359
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 361
    invoke-virtual {v0}, Ll/ۙܳܳ;->ܿ()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_2

    .line 362
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    const/4 v6, -0x1

    if-eqz v3, :cond_3

    .line 363
    invoke-virtual {v0}, Ll/ܳۛ᩻;->ۡ()I

    move-result v7

    goto :goto_3

    :cond_3
    const/4 v7, -0x1

    :goto_3
    if-eqz v3, :cond_4

    .line 364
    invoke-virtual {v0}, Ll/ۙܳܳ;->֫()I

    move-result v6

    .line 365
    :cond_4
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    .line 366
    :goto_4
    iget-object v8, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    if-eqz v5, :cond_b

    if-gtz v6, :cond_7

    goto/16 :goto_b

    .line 392
    :cond_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    const/4 v10, 0x0

    .line 395
    :try_start_0
    new-instance v11, Ljava/net/URL;

    const-string v12, "http"

    const-string v13, "127.0.0.1"

    const-string v14, "/mcp"

    invoke-direct {v11, v12, v13, v6, v14}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 396
    sget-object v12, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    invoke-virtual {v11, v12}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v11

    check-cast v11, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v10, "GET"

    .line 397
    invoke-virtual {v11, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v10, 0x3e8

    .line 398
    invoke-virtual {v11, v10}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 399
    invoke-virtual {v11, v10}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 400
    invoke-virtual {v11, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 401
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 427
    sget-object v10, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    sub-long/2addr v12, v8

    invoke-virtual {v10, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    .line 402
    invoke-static {v2, v12, v13}, Ll/ᩴۛ᩻;->֫(IJ)Ll/ᩴۛ᩻;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 407
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_c

    :catchall_0
    move-exception v0

    goto :goto_a

    :catch_0
    move-exception v2

    move-object v10, v11

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v2

    .line 427
    :goto_6
    :try_start_2
    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    sub-long/2addr v12, v8

    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    .line 416
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_9

    .line 417
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_8

    goto :goto_7

    .line 420
    :cond_8
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    .line 418
    :cond_9
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 404
    :goto_8
    invoke-static {v8, v9, v2}, Ll/ᩴۛ᩻;->֫(JLjava/lang/String;)Ll/ᩴۛ᩻;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v10, :cond_c

    .line 407
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_c

    :goto_9
    move-object v11, v10

    :goto_a
    if-eqz v11, :cond_a

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 409
    :cond_a
    throw v0

    .line 390
    :cond_b
    :goto_b
    invoke-static {}, Ll/ᩴۛ᩻;->֫()Ll/ᩴۛ᩻;

    move-result-object v2

    .line 368
    :cond_c
    :goto_c
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "MT MCP health state: pid="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", service="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", hasServer="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", wasStarted="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", alive="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", serverPort="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", listeningPort="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", configuredPort="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    invoke-static {}, Ll/᩸ۛ᩻;->ᩳ()I

    move-result v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", wakeLockHeld="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", wifiLockHeld="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", localHttpChecked="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ᩴۛ᩻;->֫(Ll/ᩴۛ᩻;)Z

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", localHttpResponded="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ᩴۛ᩻;->ᩳ(Ll/ᩴۛ᩻;)Z

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", localHttpStatus="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ᩴۛ᩻;->ܿ(Ll/ᩴۛ᩻;)I

    move-result v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", localHttpElapsedMs="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ᩴۛ᩻;->ۧ(Ll/ᩴۛ᩻;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", localHttpError="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ᩴۛ᩻;->ܽ(Ll/ᩴۛ᩻;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 368
    invoke-static {v0}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static ᩷()Z
    .locals 2

    .line 85
    sget-object v0, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    .line 86
    sget-boolean v1, Ll/᩵ۛ᩻;->ۛ:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ᩻()V
    .locals 6

    .line 470
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    const-string v2, ":Mcp"

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    :cond_0
    iput-object v3, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    const-string v0, "power"

    .line 485
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 486
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v0, v5, v4}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    .line 487
    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 488
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۙ:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 474
    :cond_1
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 475
    :cond_3
    :goto_0
    iput-object v3, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    .line 495
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "wifi"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 496
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    .line 497
    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 498
    iget-object v0, p0, Ll/᩵ۛ᩻;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 5

    .line 164
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 165
    invoke-static {}, Ll/ᩳ۬᩷;->ۢ֫()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    .line 166
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const-string v0, "notification"

    .line 167
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 168
    new-instance v1, Landroid/app/NotificationChannel;

    const v1, 0x7f120569

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "MT_APK_MCP"

    const/4 v4, 0x3

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 169
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    const/16 v0, 0x3f0

    .line 171
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܳ()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    const-string v0, "MT MCP service onDestroy"

    .line 253
    invoke-static {v0}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 254
    iput-boolean v0, p0, Ll/᩵ۛ᩻;->᩸:Z

    .line 255
    sget-object v1, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    if-ne v1, p0, :cond_0

    const/4 v1, 0x0

    .line 256
    sput-object v1, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    .line 258
    :cond_0
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܿ()V

    .line 259
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 260
    sget-boolean v0, Ll/᩵ۛ᩻;->ۛ:Z

    if-nez v0, :cond_1

    .line 261
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.mcp.ACTION_STOPPED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 263
    :cond_1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 179
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܳ()Landroid/app/Notification;

    move-result-object p2

    const/16 p3, 0x3f0

    invoke-virtual {p0, p3, p2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 p2, 0x2

    if-eqz p1, :cond_0

    const-string v0, "bin.mt.mcp.ACTION_STOP"

    .line 180
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    const-string v1, "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"

    .line 184
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 185
    invoke-static {}, Ll/᩵ۛ᩻;->᩷()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 186
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۖ()V

    return v0

    .line 189
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2

    .line 192
    :cond_2
    sget-boolean p1, Ll/᩵ۛ᩻;->ۛ:Z

    if-eqz p1, :cond_3

    .line 193
    sput-object p0, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    return v0

    .line 196
    :cond_3
    invoke-static {}, Ll/᩵ۛ᩻;->᩷()Z

    move-result p1

    const-string v1, "bin.mt.mcp.ACTION_STARTED"

    if-eqz p1, :cond_4

    .line 198
    :try_start_0
    invoke-direct {p0}, Ll/᩵ۛ᩻;->᩻()V

    .line 199
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۖ()V

    .line 200
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܺ()V

    .line 201
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    .line 204
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܿ()V

    .line 205
    invoke-static {p1}, Ll/᩵ۛ᩻;->֫(Ljava/lang/Exception;)V

    .line 206
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2

    .line 242
    :cond_4
    sget-object p1, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    if-eqz p1, :cond_6

    .line 243
    invoke-virtual {p1}, Ll/ۙܳܳ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_6

    .line 268
    sget-object p1, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    if-eqz p1, :cond_6

    .line 269
    sget-boolean v2, Ll/᩵ۛ᩻;->ۛ:Z

    if-eqz v2, :cond_5

    goto :goto_0

    .line 272
    :cond_5
    sput-boolean v0, Ll/᩵ۛ᩻;->ۛ:Z

    .line 273
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Ll/᩻ۛ᩻;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p1}, Ll/᩻ۛ᩻;-><init>(ILjava/lang/Object;)V

    const-string p1, "MT MCP Stop"

    invoke-direct {v2, v3, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 211
    :cond_6
    :goto_0
    sget-boolean p1, Ll/᩵ۛ᩻;->ۛ:Z

    if-eqz p1, :cond_7

    .line 212
    sput-object p0, Ll/᩵ۛ᩻;->۫:Ll/᩵ۛ᩻;

    return v0

    .line 368
    :cond_7
    :try_start_1
    invoke-static {}, Ll/᩸ۛ᩻;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 369
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-nez v2, :cond_8

    .line 371
    :try_start_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 372
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 218
    :catch_1
    :cond_8
    :try_start_3
    new-instance p1, Ll/ܳۛ᩻;

    invoke-static {}, Ll/᩸ۛ᩻;->ᩳ()I

    move-result v2

    invoke-direct {p1, v2}, Ll/ܳۛ᩻;-><init>(I)V

    .line 220
    sput-object p1, Ll/᩵ۛ᩻;->ۤ:Ll/ܳۛ᩻;

    .line 221
    invoke-virtual {p1}, Ll/ۙܳܳ;->ܽ()V

    .line 222
    invoke-direct {p0}, Ll/᩵ۛ᩻;->᩻()V

    .line 223
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ۖ()V

    .line 224
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܳ()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 225
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܺ()V

    .line 226
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 330
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/ۚۡ᩷;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ll/ۚۡ᩷;-><init>(I)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 314
    new-instance p2, Ll/ۡۛ᩻;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ll/ۡۛ᩻;-><init>(I)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v0

    :catch_2
    move-exception p1

    .line 228
    invoke-direct {p0}, Ll/᩵ۛ᩻;->ܿ()V

    .line 229
    invoke-static {p1}, Ll/᩵ۛ᩻;->֫(Ljava/lang/Exception;)V

    .line 230
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2
.end method
