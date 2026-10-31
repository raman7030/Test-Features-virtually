.class public final Ll/᩹ۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Landroidx/window/sidecar/SidecarInterface$SidecarCallback;


# instance fields
.field public final ֫:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

.field public ۧ:Landroidx/window/sidecar/SidecarDeviceState;

.field public final ܽ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ܿ:Ll/۠ۧܽ;

.field public final ᩳ:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(Ll/۠ۧܽ;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V
    .locals 1

    const-string v0, "sidecarAdapter"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 409
    iput-object p1, p0, Ll/᩹ۧܽ;->ܿ:Ll/۠ۧܽ;

    .line 410
    iput-object p2, p0, Ll/᩹ۧܽ;->֫:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    .line 412
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ll/᩹ۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 422
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ll/᩹ۧܽ;->ᩳ:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public ֫(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V
    .locals 3

    const-string v0, "token"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newLayout"

    .line 11
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Ll/᩹ۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    monitor-enter v0

    .line 438
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧܽ;->ᩳ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    .line 439
    iget-object v2, p0, Ll/᩹ۧܽ;->ܿ:Ll/۠ۧܽ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p2}, Ll/۠ۧܽ;->֫(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 440
    monitor-exit v0

    return-void

    .line 442
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩹ۧܽ;->ᩳ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/sidecar/SidecarWindowLayoutInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 437
    monitor-exit v0

    .line 444
    iget-object v0, p0, Ll/᩹ۧܽ;->֫:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    invoke-interface {v0, p1, p2}, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;->onWindowLayoutChanged(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V

    return-void

    :catchall_0
    move-exception p1

    .line 437
    monitor-exit v0

    throw p1
.end method

.method public ֫(Landroidx/window/sidecar/SidecarDeviceState;)V
    .locals 3

    const-string v0, "newDeviceState"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    iget-object v0, p0, Ll/᩹ۧܽ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 425
    :try_start_0
    iget-object v1, p0, Ll/᩹ۧܽ;->ܿ:Ll/۠ۧܽ;

    iget-object v2, p0, Ll/᩹ۧܽ;->ۧ:Landroidx/window/sidecar/SidecarDeviceState;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-static {v2, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    goto :goto_1

    .line 79
    :cond_1
    invoke-static {v2}, Ll/ᩴۧܽ;->ۧ(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result v1

    .line 80
    invoke-static {p1}, Ll/ᩴۧܽ;->ۧ(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_2

    .line 426
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 428
    :cond_2
    :goto_1
    :try_start_1
    iput-object p1, p0, Ll/᩹ۧܽ;->ۧ:Landroidx/window/sidecar/SidecarDeviceState;

    .line 429
    iget-object v1, p0, Ll/᩹ۧܽ;->֫:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    invoke-interface {v1, p1}, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;->onDeviceStateChanged(Landroidx/window/sidecar/SidecarDeviceState;)V

    .line 430
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 424
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
