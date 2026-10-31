.class public final Ll/᩹֫;
.super Landroid/os/Handler;
.source "U6BF"


# instance fields
.field public final synthetic ֫:Ll/ۙ֫;


# direct methods
.method public constructor <init>(Ll/ۙ֫;Landroid/os/Looper;)V
    .locals 0

    .line 1491
    iput-object p1, p0, Ll/᩹֫;->֫:Ll/ۙ֫;

    .line 1492
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1497
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1502
    iget-object v0, p0, Ll/᩹֫;->֫:Ll/ۙ֫;

    iget-object v0, v0, Ll/ۙ֫;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 1503
    :try_start_0
    iget-object v1, p0, Ll/᩹֫;->֫:Ll/ۙ֫;

    iget-object v1, v1, Ll/ۙ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֫;

    .line 1504
    iget-object v2, p0, Ll/᩹֫;->֫:Ll/ۙ֫;

    iget-object v3, v2, Ll/ۙ֫;->ۧ:Ll/᩹֫;

    .line 1505
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 1507
    invoke-interface {v1}, Ll/ۗ֫;->֫()Ll/ۙ֫;

    move-result-object v0

    if-ne v2, v0, :cond_1

    if-nez v3, :cond_0

    goto :goto_0

    .line 1511
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/᩸ۘ֫;

    .line 1512
    invoke-interface {v1, p1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    .line 1513
    iget-object p1, p0, Ll/᩹֫;->֫:Ll/ۙ֫;

    invoke-virtual {p1, v1, v3}, Ll/ۙ֫;->֫(Ll/ۗ֫;Landroid/os/Handler;)V

    const/4 p1, 0x0

    .line 1514
    invoke-interface {v1, p1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void

    :catchall_0
    move-exception p1

    .line 1505
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
