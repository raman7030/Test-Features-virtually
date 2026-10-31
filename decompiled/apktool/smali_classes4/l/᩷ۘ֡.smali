.class public final Ll/᩷ۘ֡;
.super Ljava/lang/Object;
.source "SAHW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Ll/᩷ۘ֡;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/᩷ۘ֡;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 113
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 115
    :cond_0
    invoke-static {}, Ll/ۢۘ֡;->ۧ()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 116
    invoke-static {}, Ll/ۢۘ֡;->֫()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
