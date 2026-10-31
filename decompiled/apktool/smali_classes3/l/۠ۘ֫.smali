.class public final Ll/۠ۘ֫;
.super Landroid/os/Handler;
.source "X6AW"


# instance fields
.field public ֫:Ll/ܶۘ֫;


# direct methods
.method public constructor <init>(Ll/ܶۘ֫;)V
    .locals 0

    .line 679
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 680
    iput-object p1, p0, Ll/۠ۘ֫;->֫:Ll/ܶۘ֫;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 686
    iget-object v0, p0, Ll/۠ۘ֫;->֫:Ll/ܶۘ֫;

    if-eqz v0, :cond_0

    .line 687
    invoke-virtual {v0, p1}, Ll/ܶۘ֫;->֫(Landroid/os/Message;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 689
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final sendMessageAtTime(Landroid/os/Message;J)Z
    .locals 3

    .line 702
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 703
    const-class v1, Ll/۫;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "data_calling_uid"

    .line 704
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 705
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    const-string v2, "data_calling_pid"

    if-lez v1, :cond_0

    .line 707
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 708
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, -0x1

    .line 710
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 712
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 695
    iput-object v0, p0, Ll/۠ۘ֫;->֫:Ll/ܶۘ֫;

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 716
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 717
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 719
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
