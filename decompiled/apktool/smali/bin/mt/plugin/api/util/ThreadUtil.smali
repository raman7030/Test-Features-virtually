.class public Lbin/mt/plugin/api/util/ThreadUtil;
.super Ljava/lang/Object;
.source "ThreadUtil.java"


# static fields
.field public static final HANDLER:Landroid/os/Handler;

.field public static final UI_THREAD:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->HANDLER:Landroid/os/Handler;

    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    sput-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->UI_THREAD:Ljava/lang/Thread;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static assertInUIThread()V
    .locals 2

    .line 42
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->isInUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static isInUiThread()Z
    .locals 2

    .line 32
    sget-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->UI_THREAD:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static post(Ljava/lang/Runnable;)V
    .locals 1

    .line 70
    sget-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->HANDLER:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static postDelayed(Ljava/lang/Runnable;J)V
    .locals 1

    .line 81
    sget-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->HANDLER:Landroid/os/Handler;

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 54
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->isInUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 59
    :cond_0
    sget-object v0, Lbin/mt/plugin/api/util/ThreadUtil;->HANDLER:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
