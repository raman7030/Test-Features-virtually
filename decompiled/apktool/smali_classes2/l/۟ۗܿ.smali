.class public final Ll/۟ۗܿ;
.super Landroid/os/Handler;
.source "7AJG"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 329
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 330
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫۬ܿ;

    if-eqz p1, :cond_0

    .line 332
    invoke-static {p1}, Ll/֫۬ܿ;->ܽ(Ll/֫۬ܿ;)V

    :cond_0
    return-void
.end method
