.class public final Ll/ۢۨۘ;
.super Ll/ܳۨۘ;
.source "H8ZV"


# instance fields
.field public final ֫:Ll/ۚۨۘ;

.field public final ۧ:Ljava/util/concurrent/ExecutorService;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Landroid/os/Handler;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/᩻ۨۘ;)V
    .locals 3

    .line 37
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Ll/ۢۨۘ;->ܿ:Ljava/util/HashMap;

    .line 43
    iget-object v1, p1, Ll/᩻ۨۘ;->ۧ:Ljava/util/concurrent/ExecutorService;

    iput-object v1, p0, Ll/ۢۨۘ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 44
    iget-object v1, p1, Ll/᩻ۨۘ;->ܿ:Ljava/util/HashMap;

    iput-object v1, p0, Ll/ۢۨۘ;->ܳ:Ljava/util/HashMap;

    .line 45
    iget-object v1, p1, Ll/᩻ۨۘ;->ᩳ:Ljava/util/HashMap;

    iput-object v1, p0, Ll/ۢۨۘ;->ᩳ:Ljava/util/HashMap;

    .line 46
    iget-object p1, p1, Ll/᩻ۨۘ;->֫:Ll/ۚۨۘ;

    iput-object p1, p0, Ll/ۢۨۘ;->֫:Ll/ۚۨۘ;

    .line 49
    iput-object v0, p0, Ll/ۢۨۘ;->ܽ:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۨۘ;)Ll/۬ۨۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۨۘ;->֫:Ll/ۚۨۘ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۢۨۘ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۨۘ;->ܽ:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۢۨۘ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۨۘ;->ᩳ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۢۨۘ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۨۘ;->ܳ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۢۨۘ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۨۘ;->ܿ:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܿۨۘ;)V
    .locals 2

    .line 63
    iget-object v0, p0, Ll/ۢۨۘ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 68
    :cond_0
    iget-object v0, p0, Ll/ۢۨۘ;->ܽ:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ܿۨۘ;)V
    .locals 3

    .line 54
    iget-object v0, p0, Ll/ۢۨۘ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    if-nez v1, :cond_0

    .line 81
    new-instance v1, Ll/᩷ۨۘ;

    invoke-direct {v1, p0, p1}, Ll/᩷ۨۘ;-><init>(Ll/ۢۨۘ;Ll/ܿۨۘ;)V

    iget-object v2, p0, Ll/ۢۨۘ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 56
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
