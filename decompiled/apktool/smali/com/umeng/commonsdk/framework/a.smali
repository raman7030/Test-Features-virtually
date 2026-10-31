.class public Lcom/umeng/commonsdk/framework/a;
.super Ljava/lang/Object;
.source "747B"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;


# static fields
.field public static a:Landroid/os/HandlerThread; = null

.field public static b:Landroid/os/Handler; = null

.field public static c:Landroid/os/Handler; = null

.field public static final d:I = 0xc8

.field public static final e:I = 0x111

.field public static final f:I = 0x112

.field public static final g:I = 0x200

.field public static final h:I = 0x301

.field public static i:Lcom/umeng/commonsdk/framework/a$a; = null

.field public static j:Landroid/net/ConnectivityManager; = null

.field public static k:Landroid/content/IntentFilter; = null

.field public static volatile l:Z = false

.field public static m:Ljava/util/ArrayList; = null

.field public static n:Ljava/lang/Object; = null

.field public static o:Ljava/util/concurrent/locks/ReentrantLock; = null

.field public static final p:Ljava/lang/String; = "report_policy"

.field public static final q:Ljava/lang/String; = "report_interval"

.field public static r:Z = false

.field public static final s:I = 0xf

.field public static final t:I = 0x3

.field public static final u:I = 0x5a

.field public static v:I

.field public static w:Ljava/lang/Object;

.field public static x:Landroid/content/BroadcastReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v0, 0x0

    .line 82
    sput-boolean v0, Lcom/umeng/commonsdk/framework/a;->r:Z

    const/16 v0, 0xf

    .line 86
    sput v0, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 87
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    .line 90
    invoke-static {}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "connectivity"

    .line 92
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 233
    :cond_0
    new-instance v0, Lcom/umeng/commonsdk/framework/a$1;

    invoke-direct {v0}, Lcom/umeng/commonsdk/framework/a$1;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    .line 254
    invoke-static {}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext()Landroid/content/Context;

    move-result-object v0

    .line 255
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_0

    const-string v1, "connectivity"

    .line 256
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 259
    :cond_0
    sput-object p2, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    .line 261
    :try_start_0
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    if-nez p2, :cond_3

    .line 263
    new-instance p2, Landroid/os/HandlerThread;

    const-string v0, "NetWorkSender"

    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object p2, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 264
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 265
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->i:Lcom/umeng/commonsdk/framework/a$a;

    if-nez p2, :cond_1

    .line 266
    new-instance p2, Lcom/umeng/commonsdk/framework/a$a;

    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/umeng/commonsdk/framework/a$a;-><init>(Ljava/lang/String;)V

    sput-object p2, Lcom/umeng/commonsdk/framework/a;->i:Lcom/umeng/commonsdk/framework/a$a;

    .line 267
    invoke-virtual {p2}, Landroid/os/FileObserver;->startWatching()V

    const-string p2, "--->>> FileMonitor has already started!"

    .line 268
    invoke-static {p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 288
    :cond_1
    invoke-direct {p0}, Lcom/umeng/commonsdk/framework/a;->j()V

    .line 290
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-nez p2, :cond_2

    .line 291
    new-instance p2, Lcom/umeng/commonsdk/framework/a$2;

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, p0, v0}, Lcom/umeng/commonsdk/framework/a$2;-><init>(Lcom/umeng/commonsdk/framework/a;Landroid/os/Looper;)V

    sput-object p2, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 334
    :cond_2
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object p2

    const-string v0, "report_policy"

    invoke-virtual {p2, v0, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    .line 335
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object p2

    const-string v0, "report_interval"

    invoke-virtual {p2, v0, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    return-void

    :catchall_0
    move-exception p2

    .line 338
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic a(I)V
    .locals 0

    .line 35
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/a;->c(I)V

    return-void
.end method

.method public static a(II)V
    .locals 3

    .line 481
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 482
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeMessages(I)V

    .line 483
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 484
    iput p0, v0, Landroid/os/Message;->what:I

    .line 485
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    int-to-long v1, p1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public static a(IJ)V
    .locals 2

    .line 444
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 445
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 446
    iput p0, v0, Landroid/os/Message;->what:I

    .line 447
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "--->>> sendMsgDelayed: "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "MobclickRT"

    invoke-static {v1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 97
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    const-string v0, "connectivity"

    .line 99
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    const-string v0, "MobclickRT"

    const-string v1, "--->>> createCMIfNeeded:\u6ce8\u518c\u7f51\u7edc\u72b6\u6001\u76d1\u542c\u5668\u3002"

    .line 101
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/umeng/commonsdk/framework/UMSenderStateNotify;)V
    .locals 3

    .line 109
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 111
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 112
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    :cond_0
    if-eqz p0, :cond_3

    const/4 v1, 0x0

    .line 116
    :goto_0
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 117
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_1

    const-string p0, "MobclickRT"

    const-string v1, "--->>> addConnStateObserver: input item has exist."

    .line 118
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 122
    :cond_2
    :try_start_2
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 125
    :try_start_3
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 127
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0
.end method

.method public static a(Z)V
    .locals 3

    .line 213
    sput-boolean p0, Lcom/umeng/commonsdk/framework/a;->l:Z

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 215
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 216
    :try_start_0
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    if-eqz p0, :cond_0

    .line 217
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-lez p0, :cond_0

    :goto_0
    if-ge v1, p0, :cond_0

    .line 220
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;

    invoke-interface {v2}, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;->onConnectionAvailable()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 224
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p0, "MobclickRT"

    const-string v0, "\u7f51\u7edc\u72b6\u6001\u901a\u77e5\uff1a\u5c1d\u8bd5\u53d1\u9001 MSG_PROCESS_NEXT"

    .line 225
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->d()V

    return-void

    :catchall_0
    move-exception p0

    .line 224
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_1
    const-string p0, "--->>> network disconnected."

    .line 228
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 229
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->l:Z

    return-void
.end method

.method public static a()Z
    .locals 2

    .line 131
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 132
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 133
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static b()I
    .locals 2

    .line 137
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 138
    :try_start_0
    sget v1, Lcom/umeng/commonsdk/framework/a;->v:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 139
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static b(I)V
    .locals 1

    .line 418
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 419
    invoke-virtual {v0, p0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 421
    iput p0, v0, Landroid/os/Message;->what:I

    .line 422
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 196
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    .line 199
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    if-nez v0, :cond_0

    .line 200
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 201
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 202
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    const-string v0, "MobclickRT"

    const-string v1, "--->>> \u6ce8\u518c\u7f51\u7edc\u72b6\u6001\u76d1\u542c\u5668\u3002"

    .line 203
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

    sget-object v1, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method public static c(I)V
    .locals 1

    .line 432
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 433
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 434
    iput p0, v0, Landroid/os/Message;->what:I

    .line 435
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public static d()V
    .locals 2

    .line 456
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x111

    .line 459
    :try_start_0
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 461
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_0
    return-void
.end method

.method public static e()V
    .locals 2

    const/16 v0, 0x112

    const/16 v1, 0xbb8

    .line 491
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/framework/a;->a(II)V

    return-void
.end method

.method public static synthetic f()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 35
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static synthetic g()V
    .locals 0

    .line 35
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->n()V

    return-void
.end method

.method public static synthetic h()V
    .locals 0

    .line 35
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->m()V

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    .line 35
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->l()V

    return-void
.end method

.method private j()V
    .locals 6

    const-string v1, "--->>> set report_interval value to: "

    .line 143
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 144
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "report_policy"

    const-string v4, ""

    invoke-static {v2, v3, v4}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "11"

    .line 145
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "MobclickRT"

    const-string v3, "--->>> switch to report_policy 11"

    .line 147
    invoke-static {v2, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 148
    sput-boolean v2, Lcom/umeng/commonsdk/framework/a;->r:Z

    const/16 v2, 0xf

    .line 149
    sput v2, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 150
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "report_interval"

    const-string v5, "15"

    invoke-static {v3, v4, v5}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "MobclickRT"

    .line 152
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    if-lt v3, v1, :cond_1

    const/16 v1, 0x5a

    if-le v3, v1, :cond_0

    goto :goto_0

    :cond_0
    mul-int/lit16 v3, v3, 0x3e8

    .line 156
    sput v3, Lcom/umeng/commonsdk/framework/a;->v:I

    goto :goto_1

    .line 154
    :cond_1
    :goto_0
    sput v2, Lcom/umeng/commonsdk/framework/a;->v:I

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 159
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 161
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static k()V
    .locals 2

    .line 346
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 347
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 349
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 350
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 352
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 353
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    :cond_2
    return-void
.end method

.method public static l()V
    .locals 4

    .line 359
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 360
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 361
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 364
    sget-object v3, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;

    invoke-interface {v3}, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;->onSenderIdle()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 368
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static m()V
    .locals 0

    return-void
.end method

.method public static n()V
    .locals 7

    const-string v0, "]."

    const-string v1, "--->>> send envelope file [ "

    const-string v2, "--->>> Ready to send envelope file ["

    const-string v3, "--->>> handleProcessNext: Enter..."

    .line 528
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 531
    sget-boolean v3, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-nez v3, :cond_0

    return-void

    .line 534
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v3

    .line 536
    :try_start_0
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/UMFrUtils;->envelopeFileNumber(Landroid/content/Context;)I

    move-result v4

    if-lez v4, :cond_4

    const-string v4, "--->>> The envelope file exists."

    .line 537
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 538
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/UMFrUtils;->envelopeFileNumber(Landroid/content/Context;)I

    move-result v4

    const/16 v5, 0xc8

    if-le v4, v5, :cond_1

    const-string v4, "--->>> Number of envelope files is greater than 200, remove old files first."

    .line 539
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 540
    invoke-static {v3, v5}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeRedundantEnvelopeFiles(Landroid/content/Context;I)V

    .line 543
    :cond_1
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 545
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 547
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    const-string v2, "MobclickRT"

    .line 548
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    new-instance v0, Lcom/umeng/commonsdk/statistics/c;

    invoke-direct {v0, v3}, Lcom/umeng/commonsdk/statistics/c;-><init>(Landroid/content/Context;)V

    .line 553
    invoke-virtual {v0, v4}, Lcom/umeng/commonsdk/statistics/c;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "--->>> Send envelope file success, delete it."

    .line 555
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 557
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeEnvelopeFile(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "--->>> Failed to delete already processed file. We try again after delete failed."

    .line 558
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 559
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeEnvelopeFile(Ljava/io/File;)Z

    :cond_2
    const/16 v0, 0x111

    .line 568
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->c(I)V

    return-void

    :cond_3
    const-string v0, "--->>> Send envelope file failed, abandon and wait next trigger!"

    .line 564
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    return-void

    .line 579
    :cond_4
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 581
    invoke-static {v3, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v1, "--->>> really set report_interval value to: "

    const-string v2, "--->>> set report_interval value to: "

    .line 168
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v3, "report_policy"

    .line 169
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "11"

    .line 170
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "MobclickRT"

    const-string v4, "--->>> switch to report_policy 11"

    .line 172
    invoke-static {v3, v4}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 173
    sput-boolean v3, Lcom/umeng/commonsdk/framework/a;->r:Z

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 177
    sput-boolean v3, Lcom/umeng/commonsdk/framework/a;->r:Z

    :cond_1
    :goto_0
    const-string v3, "report_interval"

    .line 181
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 182
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string p2, "MobclickRT"

    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x3

    if-lt p1, p2, :cond_3

    const/16 p2, 0x5a

    if-le p1, p2, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit16 p1, p1, 0x3e8

    .line 187
    sput p1, Lcom/umeng/commonsdk/framework/a;->v:I

    goto :goto_2

    :cond_3
    :goto_1
    const/16 p1, 0x3a98

    .line 185
    sput p1, Lcom/umeng/commonsdk/framework/a;->v:I

    :goto_2
    const-string p1, "MobclickRT"

    .line 189
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/umeng/commonsdk/framework/a;->v:I

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
