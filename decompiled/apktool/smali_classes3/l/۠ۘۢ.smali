.class public Ll/۠ۘۢ;
.super Landroid/app/Service;
.source "DAMT"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ۛ:Ljava/lang/Object;

.field public static final synthetic ۤ:I

.field public static ۨ:Ll/۠ۘۢ;

.field public static volatile ᩺:Ljava/lang/Thread;


# instance fields
.field public ۗ:Landroid/os/PowerManager$WakeLock;

.field public volatile ۙ:Z

.field public ۫:Landroid/net/wifi/WifiManager$WifiLock;

.field public ۬:Ll/ۙۘۢ;

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:Ljava/net/ServerSocket;

.field public ᩹:Ll/֡ۖۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Ll/۠ۘۢ;->ۙ:Z

    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    .line 56
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۠ۘۢ;->᩶:Ljava/util/ArrayList;

    .line 59
    iput-object v0, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    return-void
.end method

.method private ֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;
    .locals 4

    .line 332
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 333
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result p1

    .line 334
    new-instance v1, Ll/֨ۘۢ;

    .line 605
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 335
    invoke-static {v1, p1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Z)V

    const/4 v2, 0x0

    if-nez p2, :cond_1

    .line 336
    iget-boolean p2, p0, Ll/۠ۘۢ;->ۙ:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    invoke-static {v1, p2}, Ll/֨ۘۢ;->ۧ(Ll/֨ۘۢ;Z)V

    .line 337
    iget-object p2, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;

    invoke-static {v1, p2}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Ljava/net/ServerSocket;)V

    const/4 p2, 0x0

    .line 338
    iput-object p2, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;

    .line 339
    iget-object v3, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    invoke-static {v1, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Ll/ۙۘۢ;)V

    .line 340
    iput-object p2, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    .line 341
    iget-object v3, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    invoke-static {v1, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Landroid/os/PowerManager$WakeLock;)V

    .line 342
    iput-object p2, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    .line 343
    iget-object v3, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-static {v1, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Landroid/net/wifi/WifiManager$WifiLock;)V

    .line 344
    iput-object p2, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz p1, :cond_2

    .line 346
    sput-object p2, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    .line 347
    sput-object p2, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    .line 348
    iput-boolean v2, p0, Ll/۠ۘۢ;->ۙ:Z

    .line 350
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 351
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2

    .line 421
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.plus.FTP_SERVER_FAILED_TO_START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "msg"

    .line 422
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 423
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ֫(Ll/֨ۘۢ;)V
    .locals 1

    .line 430
    invoke-static {p0}, Ll/֨ۘۢ;->ܳ(Ll/֨ۘۢ;)Ll/ۙۘۢ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 431
    invoke-static {p0}, Ll/֨ۘۢ;->ܳ(Ll/֨ۘۢ;)Ll/ۙۘۢ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    :try_start_0
    iget-object v0, v0, Ll/ۙۘۢ;->᩹:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 433
    :cond_0
    :goto_0
    invoke-static {p0}, Ll/֨ۘۢ;->ۧ(Ll/֨ۘۢ;)Ljava/net/ServerSocket;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 450
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    .line 434
    :goto_1
    invoke-static {p0}, Ll/֨ۘۢ;->᩻(Ll/֨ۘۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Ll/֨ۘۢ;->᩻(Ll/֨ۘۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 435
    invoke-static {p0}, Ll/֨ۘۢ;->᩻(Ll/֨ۘۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 437
    :cond_2
    invoke-static {p0}, Ll/֨ۘۢ;->ܿ(Ll/֨ۘۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Ll/֨ۘۢ;->ܿ(Ll/֨ۘۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 438
    invoke-static {p0}, Ll/֨ۘۢ;->ܿ(Ll/֨ۘۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_3
    return-void
.end method

.method public static synthetic ֫(Ll/۠ۘۢ;)V
    .locals 2

    const-string v0, "notification"

    .line 104
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const/16 v1, 0x3ec

    .line 105
    invoke-direct {p0}, Ll/۠ۘۢ;->ۧ()Landroid/app/Notification;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private ֫(Ljava/lang/Thread;)Z
    .locals 1

    .line 414
    sget-object v0, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    if-ne p1, v0, :cond_0

    sget-object p1, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ()Landroid/app/Notification;
    .locals 5

    .line 110
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/۠ۘۢ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bin.mt.plus.FsService.ACTION_STOP"

    .line 111
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 112
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ܶ᩶᩷;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL"

    const/4 v3, 0x1

    .line 113
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    .line 114
    new-instance v2, Ll/᩷᩶;

    const-string v3, "MT_FTP_SERVER"

    invoke-direct {v2, p0, v3}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 115
    invoke-virtual {v2}, Ll/᩷᩶;->ܳ()V

    const v3, 0x7f120831

    .line 116
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 117
    invoke-static {}, Ll/۠ۘۢ;->ܽ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    const/high16 v3, 0xc000000

    const/4 v4, 0x0

    .line 118
    invoke-static {p0, v4, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 119
    invoke-virtual {v2}, Ll/᩷᩶;->ܽ()V

    .line 120
    invoke-virtual {v2, v4}, Ll/᩷᩶;->֫(Z)V

    const v1, 0x7f1209e1

    .line 121
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/high16 v3, 0x4000000

    invoke-static {p0, v4, v0, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const v3, 0x108001d

    invoke-virtual {v2, v3, v1, v0}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 122
    invoke-virtual {v2}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private ۧ(Ljava/lang/Thread;)Z
    .locals 1

    .line 405
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 406
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ll/۠ۘۢ;->ۙ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 407
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܳ()Ll/֨ۘۢ;
    .locals 4

    .line 206
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 207
    :try_start_0
    new-instance v1, Ll/֨ۘۢ;

    .line 605
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 208
    iget-object v2, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    invoke-static {v1, v2}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Landroid/os/PowerManager$WakeLock;)V

    const/4 v2, 0x0

    .line 209
    iput-object v2, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    .line 210
    iget-object v3, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-static {v1, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Landroid/net/wifi/WifiManager$WifiLock;)V

    .line 211
    iput-object v2, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    .line 212
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 213
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ܽ()Ljava/lang/String;
    .locals 3

    .line 528
    invoke-static {}, Ll/۬ۘۢ;->֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const v0, 0x7f12086b

    .line 530
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, "ftp://"

    const-string v2, ":"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 532
    invoke-static {}, Ll/ܶۘۢ;->ܿ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private ܽ(Ljava/lang/Thread;)V
    .locals 3

    .line 359
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 360
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Ll/۠ۘۢ;->ۙ:Z

    if-eqz v1, :cond_0

    goto :goto_1

    .line 363
    :cond_0
    iget-object v1, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_1

    .line 364
    iget-object v1, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    .line 365
    iput-object v2, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 367
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_2

    .line 370
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 376
    :catch_0
    :cond_2
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 377
    :try_start_2
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Ll/۠ۘۢ;->ۙ:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    if-nez p1, :cond_3

    iget-object p1, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;

    if-eqz p1, :cond_3

    .line 391
    new-instance v2, Ll/ۙۘۢ;

    .line 14
    invoke-direct {v2}, Ljava/lang/Thread;-><init>()V

    .line 15
    iput-object p1, v2, Ll/ۙۘۢ;->᩹:Ljava/net/ServerSocket;

    .line 16
    iput-object p0, v2, Ll/ۙۘۢ;->᩸:Ll/۠ۘۢ;

    .line 379
    iput-object v2, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    .line 381
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_4

    .line 383
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 381
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    .line 361
    :cond_5
    :goto_1
    :try_start_4
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    .line 367
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public static ܿ()V
    .locals 3

    .line 76
    invoke-static {}, Ll/۠ۘۢ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 78
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/۠ۘۢ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 79
    invoke-static {v0, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private ܿ(Ljava/lang/Thread;)Z
    .locals 6

    .line 503
    sget-object v1, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 504
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Ll/۠ۘۢ;->ۙ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 507
    :cond_0
    iget-object v2, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 508
    monitor-exit v0

    return v4

    .line 510
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 511
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "wifi"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 512
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":FTPServer"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x3

    invoke-virtual {v0, v5, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v2

    .line 513
    invoke-virtual {v2, v3}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 514
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    move-object v0, v1

    .line 515
    monitor-enter v0

    .line 516
    :try_start_1
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Ll/۠ۘۢ;->ۙ:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    if-nez p1, :cond_2

    .line 517
    iput-object v2, p0, Ll/۠ۘۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    .line 518
    monitor-exit v0

    return v4

    .line 520
    :cond_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 521
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 522
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    :cond_3
    return v3

    :catchall_0
    move-exception p1

    .line 520
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 505
    :cond_4
    :goto_0
    :try_start_3
    monitor-exit v0

    return v3

    :catchall_1
    move-exception p1

    .line 510
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public static ᩳ()Z
    .locals 2

    .line 67
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 68
    :try_start_0
    sget-object v1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    sget-object v1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ᩳ(Ljava/lang/Thread;)Z
    .locals 6

    .line 475
    sget-object v1, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 476
    :try_start_0
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Ll/۠ۘۢ;->ۙ:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 479
    :cond_0
    iget-object v2, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 480
    monitor-exit v0

    return v4

    .line 482
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v0, "power"

    .line 483
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 484
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":FTPServer"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    .line 485
    invoke-virtual {v2, v3}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 486
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    move-object v0, v1

    .line 487
    monitor-enter v0

    .line 488
    :try_start_1
    invoke-direct {p0, p1}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Ll/۠ۘۢ;->ۙ:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    if-nez p1, :cond_2

    .line 489
    iput-object v2, p0, Ll/۠ۘۢ;->ۗ:Landroid/os/PowerManager$WakeLock;

    .line 490
    monitor-exit v0

    return v4

    .line 492
    :cond_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 493
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 494
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_3
    return v3

    :catchall_0
    move-exception p1

    .line 492
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 477
    :cond_4
    :goto_0
    :try_start_3
    monitor-exit v0

    return v3

    :catchall_1
    move-exception p1

    .line 482
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method private ᩻()V
    .locals 3

    move-object v0, p0

    .line 456
    monitor-enter v0

    .line 457
    :try_start_0
    iget-object v1, p0, Ll/۠ۘۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۘۢ;

    if-eqz v2, :cond_0

    .line 459
    invoke-virtual {v2}, Ll/᩶ۘۢ;->֫()V

    .line 460
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ۧ()V

    goto :goto_0

    .line 463
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 5

    .line 94
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 96
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const-string v0, "notification"

    .line 97
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 98
    new-instance v1, Landroid/app/NotificationChannel;

    const v1, 0x7f12084e

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "MT_FTP_SERVER"

    const/4 v4, 0x3

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 99
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    const/16 v0, 0x3ec

    .line 102
    invoke-direct {p0}, Ll/۠ۘۢ;->ۧ()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 103
    new-instance v0, Ll/֡ۖۢ;

    new-instance v1, Ll/ۖ۫᩻;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, p0, v1}, Ll/֡ۖۢ;-><init>(Landroid/content/ContextWrapper;Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/۠ۘۢ;->᩹:Ll/֡ۖۢ;

    return-void
.end method

.method public final onDestroy()V
    .locals 5

    .line 172
    iget-object v0, p0, Ll/۠ۘۢ;->᩹:Ll/֡ۖۢ;

    invoke-virtual {v0}, Ll/֡ۖۢ;->֫()V

    const/4 v1, 0x1

    .line 173
    iput-boolean v1, p0, Ll/۠ۘۢ;->ۙ:Z

    .line 187
    sget-object v0, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v0

    .line 188
    :try_start_0
    sget-object v2, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    if-eq v2, p0, :cond_0

    .line 189
    invoke-static {}, Ll/֨ۘۢ;->֫()Ll/֨ۘۢ;

    move-result-object v2

    monitor-exit v0

    goto :goto_0

    .line 191
    :cond_0
    iput-boolean v1, p0, Ll/۠ۘۢ;->ۙ:Z

    .line 192
    new-instance v2, Ll/֨ۘۢ;

    .line 605
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 193
    sget-object v3, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    invoke-static {v2, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Ljava/lang/Thread;)V

    .line 194
    iget-object v3, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;

    invoke-static {v2, v3}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Ljava/net/ServerSocket;)V

    const/4 v3, 0x0

    .line 195
    iput-object v3, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;

    .line 196
    iget-object v4, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    invoke-static {v2, v4}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;Ll/ۙۘۢ;)V

    .line 197
    iput-object v3, p0, Ll/۠ۘۢ;->۬:Ll/ۙۘۢ;

    .line 198
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :goto_0
    invoke-static {v2}, Ll/֨ۘۢ;->ᩳ(Ll/֨ۘۢ;)Ljava/lang/Thread;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 176
    invoke-static {v2}, Ll/֨ۘۢ;->ᩳ(Ll/֨ۘۢ;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 178
    :cond_1
    invoke-static {v2}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 179
    invoke-direct {p0}, Ll/۠ۘۢ;->ܳ()Ll/֨ۘۢ;

    move-result-object v0

    invoke-static {v0}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 180
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(Z)V

    return-void

    :catchall_0
    move-exception v1

    .line 199
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    const/16 p2, 0x3ec

    .line 127
    invoke-direct {p0}, Ll/۠ۘۢ;->ۧ()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 p2, 0x2

    if-eqz p1, :cond_0

    const-string p3, "bin.mt.plus.FsService.ACTION_STOP"

    .line 128
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 129
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2

    .line 134
    :cond_0
    sget-object p1, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 135
    :try_start_0
    sget-object p1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    const/4 p3, 0x1

    if-eqz p1, :cond_1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 137
    monitor-exit v0

    return p3

    :cond_1
    const/4 p1, 0x0

    .line 139
    sput-object p1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    .line 140
    sput-object p1, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    const/4 v1, 0x0

    .line 141
    iput-boolean v1, p0, Ll/۠ۘۢ;->ۙ:Z

    .line 167
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 143
    sput-object v1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    .line 144
    sput-object p0, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 148
    :try_start_2
    sget-object v3, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    if-ne v3, v1, :cond_2

    sget-object v1, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    if-ne v1, p0, :cond_2

    .line 149
    sput-object p1, Ll/۠ۘۢ;->᩺:Ljava/lang/Thread;

    .line 150
    sput-object p1, Ll/۠ۘۢ;->ۨ:Ll/۠ۘۢ;

    :cond_2
    move-object p1, v2

    .line 154
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_3

    .line 156
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۠ۘۢ;->֫(Ljava/lang/String;)V

    return p2

    :cond_3
    return p3

    :catchall_0
    move-exception p1

    .line 154
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final run()V
    .locals 8

    const-string v0, "bin.mt.plus.FTP_SERVER_STOPPED"

    .line 239
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 245
    :try_start_0
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    .line 315
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 398
    :cond_0
    :try_start_1
    invoke-static {}, Ll/ۢ֨ۢ;->ۘ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 262
    :try_start_2
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v4, :cond_1

    .line 315
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 268
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Ll/۠ۘۢ;->֫()Z

    move-result v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v4, :cond_2

    .line 315
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 285
    :cond_2
    :try_start_4
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ܿ(Ljava/lang/Thread;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ᩳ(Ljava/lang/Thread;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 290
    :cond_3
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v4, :cond_4

    .line 315
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 296
    :cond_4
    :try_start_5
    new-instance v4, Landroid/content/Intent;

    const-string v6, "bin.mt.plus.FTP_SERVER_STARTED"

    invoke-direct {v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 300
    :catch_0
    :goto_0
    :try_start_6
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 301
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ܽ(Ljava/lang/Thread;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-wide/16 v6, 0x3e8

    .line 306
    :try_start_7
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    .line 313
    :cond_5
    invoke-direct {p0}, Ll/۠ۘۢ;->᩻()V

    .line 315
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto/16 :goto_6

    :catchall_0
    move-exception v4

    goto/16 :goto_8

    .line 315
    :cond_6
    :goto_1
    invoke-direct {p0, v1, v5}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void

    :catch_1
    move-exception v4

    .line 273
    :try_start_8
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v6, :cond_7

    const/4 v2, 0x1

    const/4 v5, 0x0

    goto :goto_3

    .line 278
    :cond_7
    :try_start_9
    instance-of v6, v4, Ljava/net/BindException;

    if-eqz v6, :cond_8

    .line 279
    invoke-static {}, Ll/ܶۘۢ;->ܿ()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v6, v5, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const v4, 0x7f120935

    invoke-static {v4, v6}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 280
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 315
    :goto_3
    invoke-direct {p0, v1, v2}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    if-eqz v5, :cond_9

    .line 319
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_5

    .line 321
    :cond_9
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :catch_2
    move-exception v4

    .line 253
    :try_start_a
    invoke-direct {p0, v1}, Ll/۠ۘۢ;->ۧ(Ljava/lang/Thread;)Z

    move-result v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-eqz v6, :cond_a

    const/4 v2, 0x1

    const/4 v5, 0x0

    goto :goto_4

    .line 257
    :cond_a
    :try_start_b
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 315
    :goto_4
    invoke-direct {p0, v1, v2}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    if-eqz v5, :cond_b

    .line 319
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 320
    :goto_5
    invoke-static {v3}, Ll/۠ۘۢ;->֫(Ljava/lang/String;)V

    goto :goto_7

    .line 321
    :cond_b
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 322
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    :cond_c
    :goto_7
    return-void

    :catchall_1
    move-exception v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_9

    :catchall_2
    move-exception v4

    const/4 v5, 0x0

    :goto_8
    const/4 v6, 0x0

    :goto_9
    if-eqz v5, :cond_d

    .line 313
    invoke-direct {p0}, Ll/۠ۘۢ;->᩻()V

    .line 315
    :cond_d
    invoke-direct {p0, v1, v2}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;Z)Ll/֨ۘۢ;

    move-result-object v1

    .line 316
    invoke-static {v1}, Ll/۠ۘۢ;->֫(Ll/֨ۘۢ;)V

    .line 317
    invoke-static {v1}, Ll/֨ۘۢ;->֫(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 318
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    if-eqz v6, :cond_f

    .line 319
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_a

    .line 320
    :cond_e
    invoke-static {v3}, Ll/۠ۘۢ;->֫(Ljava/lang/String;)V

    goto :goto_b

    :cond_f
    :goto_a
    if-nez v5, :cond_10

    .line 321
    invoke-static {v1}, Ll/֨ۘۢ;->ܽ(Ll/֨ۘۢ;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 322
    :cond_10
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 325
    :cond_11
    :goto_b
    throw v4
.end method

.method public final ֫(Ll/᩶ۘۢ;)V
    .locals 5

    move-object v0, p0

    .line 547
    monitor-enter v0

    .line 548
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 549
    iget-object v2, p0, Ll/۠ۘۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ۘۢ;

    .line 550
    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_0

    .line 552
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V

    .line 553
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    invoke-virtual {v3}, Ll/᩶ۘۢ;->ۧ()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 560
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۘۢ;

    .line 561
    iget-object v3, p0, Ll/۠ۘۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 564
    :cond_2
    iget-object v1, p0, Ll/۠ۘۢ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫()Z
    .locals 6

    .line 218
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0}, Ljava/net/ServerSocket;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 221
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/net/ServerSocket;->setReuseAddress(Z)V

    .line 222
    new-instance v3, Ljava/net/InetSocketAddress;

    invoke-static {}, Ll/ܶۘۢ;->ܿ()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-virtual {v0, v3}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    .line 223
    sget-object v3, Ll/۠ۘۢ;->ۛ:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 224
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-direct {p0, v4}, Ll/۠ۘۢ;->֫(Ljava/lang/Thread;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-boolean v4, p0, Ll/۠ۘۢ;->ۙ:Z

    if-nez v4, :cond_0

    .line 225
    iput-object v0, p0, Ll/۠ۘۢ;->᩸:Ljava/net/ServerSocket;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 228
    :goto_0
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v1, :cond_1

    .line 450
    :try_start_3
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    :cond_1
    return v1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catchall_1
    move-exception v1

    :goto_1
    move v5, v2

    move-object v2, v1

    move v1, v5

    .line 228
    :goto_2
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v2

    goto :goto_3

    :catchall_3
    move-exception v2

    move-object v5, v2

    move v2, v1

    move-object v1, v5

    goto :goto_1

    :catchall_4
    move-exception v1

    move-object v2, v1

    const/4 v1, 0x0

    :goto_3
    if-nez v1, :cond_2

    .line 450
    :try_start_6
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 234
    :catch_1
    :cond_2
    throw v2
.end method
