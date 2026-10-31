.class public final Ll/ۗܳ֨;
.super Landroid/os/Handler;
.source "OBMG"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 92
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 93
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 94
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "appid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 95
    invoke-static {}, Ll/۬ܳ֨;->ᩳ()Ll/᩻۬ۡ;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Ll/᩻۬ۡ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۬ܳ֨;->֫(Ljava/lang/String;)V

    .line 96
    invoke-static {}, Ll/۬ܳ֨;->ܿ()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    monitor-enter v0

    .line 97
    :try_start_0
    invoke-static {}, Ll/۬ܳ֨;->ܿ()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 98
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-void
.end method
