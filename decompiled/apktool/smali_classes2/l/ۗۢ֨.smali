.class public final Ll/ۗۢ֨;
.super Landroid/os/Handler;
.source "N4W1"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/֫ۢ֨;)V
    .locals 1

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۗۢ֨;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 24
    iget-object v0, p0, Ll/ۗۢ֨;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۢ֨;

    if-nez v0, :cond_0

    goto :goto_1

    .line 28
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, -0x1

    if-ne p1, v1, :cond_1

    .line 29
    invoke-virtual {v0}, Ll/֫ۢ֨;->invalidateSelf()V

    return-void

    .line 31
    :cond_1
    iget-object p1, v0, Ll/֫ۢ֨;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷֨;

    .line 32
    invoke-interface {v0}, Ll/ۨ᩷֨;->֫()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
