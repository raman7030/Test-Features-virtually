.class public Lcom/umeng/commonsdk/internal/utils/c;
.super Ljava/lang/Object;
.source "X47Z"


# static fields
.field public static final a:Ljava/lang/String; = "BatteryUtils"

.field public static b:Z

.field public static c:Landroid/content/Context;


# instance fields
.field public d:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Lcom/umeng/commonsdk/internal/utils/c$1;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/utils/c$1;-><init>(Lcom/umeng/commonsdk/internal/utils/c;)V

    iput-object v0, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/internal/utils/c$1;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/utils/c;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/utils/c;
    .locals 1

    .line 39
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 44
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/c$a;->a()Lcom/umeng/commonsdk/internal/utils/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Landroid/content/Context;
    .locals 1

    .line 22
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 48
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized b()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 57
    :try_start_0
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    .line 58
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 59
    sget-object v2, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v1, 0x1

    .line 60
    sput-boolean v1, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 62
    :try_start_1
    sget-object v2, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public declared-synchronized c()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 68
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v1, 0x0

    .line 69
    sput-boolean v1, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 71
    :try_start_1
    sget-object v2, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
