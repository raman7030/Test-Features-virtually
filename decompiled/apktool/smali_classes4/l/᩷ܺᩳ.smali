.class public final Ll/᩷ܺᩳ;
.super Landroid/os/Handler;
.source "K1X4"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1052
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Ll/ۡܺᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡܺᩳ;

    .line 1054
    :try_start_0
    invoke-static {p1}, Ll/ۡܺᩳ;->֫(Ll/ۡܺᩳ;)Ll/ۢܺᩳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۢܺᩳ;->call()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۡܺᩳ;->֫(Ll/ۡܺᩳ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1060
    invoke-static {p1}, Ll/ۡܺᩳ;->ۧ(Ll/ۡܺᩳ;)V

    return-void

    :catchall_0
    move-exception v0

    .line 1058
    :try_start_1
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1, v1}, Ll/ۡܺᩳ;->֫(Ll/ۡܺᩳ;Ljava/lang/Exception;)V

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1056
    invoke-static {p1, v0}, Ll/ۡܺᩳ;->֫(Ll/ۡܺᩳ;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1060
    :goto_0
    invoke-static {p1}, Ll/ۡܺᩳ;->ۧ(Ll/ۡܺᩳ;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {p1}, Ll/ۡܺᩳ;->ۧ(Ll/ۡܺᩳ;)V

    .line 1061
    throw v0

    :cond_0
    :goto_1
    return-void
.end method
