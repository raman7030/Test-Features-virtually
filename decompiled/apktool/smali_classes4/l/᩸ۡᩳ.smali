.class public final Ll/᩸ۡᩳ;
.super Ljava/lang/Object;
.source "N1X5"

# interfaces
.implements Landroid/content/ServiceConnection;


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 63
    sget p1, Ll/֡ܺᩳ;->ܿ:I

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p1, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface"

    .line 45
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 46
    instance-of v0, p1, Ll/ۚܺᩳ;

    if-eqz v0, :cond_1

    .line 47
    check-cast p1, Ll/ۚܺᩳ;

    goto :goto_0

    .line 49
    :cond_1
    new-instance p1, Ll/᩵ܺᩳ;

    invoke-direct {p1, p2}, Ll/᩵ܺᩳ;-><init>(Landroid/os/IBinder;)V

    .line 64
    :goto_0
    sget-object p2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/ܶۡᩳ;

    invoke-direct {v0, p0, p1}, Ll/ܶۡᩳ;-><init>(Ll/᩸ۡᩳ;Ll/ۚܺᩳ;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 84
    invoke-static {}, Ll/ۙۡᩳ;->ۧ()Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_0

    .line 85
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Ll/ۙۡᩳ;->֫(Ljava/lang/Boolean;)V

    :cond_0
    return-void
.end method
