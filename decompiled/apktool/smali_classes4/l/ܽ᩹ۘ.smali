.class public final Ll/ܽ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static final ֫:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static ۧ:Landroid/os/Handler;

.field public static ܽ:Landroid/os/HandlerThread;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 52
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x3

    const-wide/16 v3, 0xa

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 48
    sput-object v7, Ll/ܽ᩹ۘ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ljava/util/concurrent/Executor;
    .locals 1

    .line 166
    new-instance v0, Ll/ۧ᩹ۘ;

    invoke-direct {v0}, Ll/ۧ᩹ۘ;-><init>()V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Runnable;)V
    .locals 3

    .line 124
    sget-object v0, Ll/ܽ᩹ۘ;->ۧ:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 125
    const-class v0, Ll/ܽ᩹ۘ;

    monitor-enter v0

    .line 126
    :try_start_0
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "SDK_SUB"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v1, Ll/ܽ᩹ۘ;->ܽ:Landroid/os/HandlerThread;

    .line 127
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 128
    new-instance v1, Landroid/os/Handler;

    sget-object v2, Ll/ܽ᩹ۘ;->ܽ:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Ll/ܽ᩹ۘ;->ۧ:Landroid/os/Handler;

    .line 129
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 131
    :cond_0
    :goto_0
    sget-object v0, Ll/ܽ᩹ۘ;->ۧ:Landroid/os/Handler;

    .line 146
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
