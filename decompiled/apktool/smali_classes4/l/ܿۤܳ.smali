.class public final Ll/ܿۤܳ;
.super Landroid/os/Handler;
.source "3AN5"


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 47
    const-class p1, Ll/ܳۤܳ;

    move-object v0, p1

    monitor-enter v0

    .line 48
    :try_start_0
    invoke-static {}, Ll/ܳۤܳ;->֫()Ll/۟֡ᩴ;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 49
    invoke-static {}, Ll/ܳۤܳ;->֫()Ll/۟֡ᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟֡ᩴ;->clear()V

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    array-length v0, p1

    if-lez v0, :cond_0

    .line 55
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 50
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
