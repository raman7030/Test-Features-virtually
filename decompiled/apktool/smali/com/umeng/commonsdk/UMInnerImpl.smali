.class public Lcom/umeng/commonsdk/UMInnerImpl;
.super Ljava/lang/Object;
.source "UMInnerImpl.java"


# static fields
.field public static final synthetic $r8$clinit:I

.field public static isInternal:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized initAndSendInternal(Landroid/content/Context;)V
    .locals 6

    const-string v1, "e is "

    .line 4
    const-class v0, Lcom/umeng/commonsdk/UMInnerImpl;

    .line 5
    monitor-enter v0

    if-eqz p0, :cond_0

    const/4 v2, 0x1

    .line 79
    :try_start_0
    sget-boolean v3, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z

    if-nez v3, :cond_0

    .line 80
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/umeng/commonsdk/UMInnerImpl$2;

    invoke-direct {v4, p0}, Lcom/umeng/commonsdk/UMInnerImpl$2;-><init>(Landroid/content/Context;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 154
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 156
    sput-boolean v2, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z

    .line 158
    invoke-static {p0}, Lcom/umeng/commonsdk/UMInnerImpl;->sendInternal(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_1
    const-string v4, "internal"

    .line 161
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v2, v5

    invoke-static {v4, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static {p0, v3}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    .line 165
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static declared-synchronized sendInternal(Landroid/content/Context;)V
    .locals 6

    const-string v1, "e is "

    .line 4
    const-class v0, Lcom/umeng/commonsdk/UMInnerImpl;

    .line 5
    monitor-enter v0

    if-eqz p0, :cond_0

    const/4 v2, 0x1

    .line 39
    :try_start_0
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/umeng/commonsdk/UMInnerImpl$1;

    invoke-direct {v4, p0}, Lcom/umeng/commonsdk/UMInnerImpl$1;-><init>(Landroid/content/Context;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 67
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 68
    sput-boolean v2, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_1
    const-string v4, "internal"

    .line 72
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v2, v5

    invoke-static {v4, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {p0, v3}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    .line 75
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method
