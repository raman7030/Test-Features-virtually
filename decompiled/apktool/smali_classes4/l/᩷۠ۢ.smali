.class public final Ll/᩷۠ۢ;
.super Landroid/os/Handler;
.source "VAJH"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 545
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 546
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ۠ۢ;

    if-eqz p1, :cond_0

    .line 548
    invoke-static {p1}, Ll/ۘ۠ۢ;->֫(Ll/ۘ۠ۢ;)Ll/ۚۡ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
