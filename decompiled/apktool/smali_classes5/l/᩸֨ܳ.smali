.class public final Ll/᩸֨ܳ;
.super Ll/ۨ۬ܿ;
.source "E4GI"


# instance fields
.field public final synthetic ۗ:Ll/۫֨ܳ;

.field public final synthetic ۬:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/۫֨ܳ;Ll/ۗܺ᩷;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 78
    iput-object p1, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    iput-object p3, p0, Ll/᩸֨ܳ;->۬:Ljava/util/concurrent/atomic/AtomicBoolean;

    const p1, 0x7f1201a8

    invoke-direct {p0, p2, p1}, Ll/ۨ۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ܽ()V
    .locals 4

    .line 101
    iget-object v0, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    invoke-static {v0}, Ll/۫֨ܳ;->ܽ(Ll/۫֨ܳ;)V

    .line 102
    iget-object v0, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    monitor-enter v0

    .line 103
    :try_start_0
    iget-object v1, p0, Ll/᩸֨ܳ;->۬:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 104
    iget-object v1, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 106
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܿ()V
    .locals 5

    .line 82
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const v0, 0x7f120305

    .line 84
    invoke-static {v0, v2}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    monitor-enter v0

    .line 89
    :try_start_0
    iget-object v3, p0, Ll/᩸֨ܳ;->۬:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_1

    .line 90
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->֫()V

    .line 91
    monitor-exit v0

    return-void

    .line 93
    :cond_1
    iget-object v2, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    invoke-static {v2}, Ll/۫֨ܳ;->ۧ(Ll/۫֨ܳ;)Ll/۬֨ܳ;

    move-result-object v2

    invoke-interface {v2, v1}, Ll/۬֨ܳ;->֫(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->֫()V

    .line 95
    iget-object v1, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 96
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 4

    .line 111
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Ll/᩸֨ܳ;->ۗ:Ll/۫֨ܳ;

    invoke-static {v1}, Ll/۫֨ܳ;->֫(Ll/۫֨ܳ;)Ll/ۗܺ᩷;

    move-result-object v2

    const-class v3, Ll/ۗܺܳ;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 112
    invoke-static {v1}, Ll/۫֨ܳ;->֫(Ll/۫֨ܳ;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
