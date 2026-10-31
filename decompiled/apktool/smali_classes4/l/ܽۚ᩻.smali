.class public final Ll/ܽۚ᩻;
.super Ljava/lang/Thread;
.source "L9TE"


# instance fields
.field public final ᩶:Ljava/lang/ref/WeakReference;

.field public ᩸:Ll/۟֡᩻;

.field public ᩹:Ljava/net/ServerSocket;


# direct methods
.method public constructor <init>(Ll/ۢۚ᩻;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܽۚ᩻;->᩶:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 42
    iget-object v0, p0, Ll/ܽۚ᩻;->᩶:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/net/ServerSocket;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/net/ServerSocket;-><init>(I)V

    iput-object v2, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    .line 43
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-nez v2, :cond_0

    .line 44
    new-instance v2, Ll/ۜۚ᩻;

    iget-object v3, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    invoke-virtual {v3}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v3

    iget-object v4, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    invoke-direct {v2, v3, v4}, Ll/ۜۚ᩻;-><init>(Ljava/net/Socket;Ll/۟֡᩻;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 49
    :cond_0
    iget-object v2, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    :try_start_1
    iget-object v2, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    if-eqz v2, :cond_1

    .line 52
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 53
    iput-object v1, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    nop

    .line 58
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;

    if-eqz v0, :cond_5

    goto :goto_4

    :catchall_0
    move-exception v2

    .line 49
    iget-object v3, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    invoke-static {v3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    :try_start_2
    iget-object v3, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    if-eqz v3, :cond_2

    .line 52
    invoke-virtual {v3}, Ljava/net/ServerSocket;->close()V

    .line 53
    iput-object v1, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    nop

    .line 58
    :cond_2
    :goto_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;

    if-eqz v0, :cond_3

    .line 60
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 62
    :cond_3
    throw v2

    .line 49
    :catch_2
    iget-object v2, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    :try_start_3
    iget-object v2, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    if-eqz v2, :cond_4

    .line 52
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 53
    iput-object v1, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    nop

    .line 58
    :cond_4
    :goto_3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;

    if-eqz v0, :cond_5

    .line 60
    :goto_4
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    :cond_5
    return-void
.end method

.method public final ֫(Ll/۟֡᩻;)Landroid/net/Uri;
    .locals 4

    .line 25
    iget-object v0, p1, Ll/۟֡᩻;->᩹:Ljava/lang/String;

    iget-object v1, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/۟֡᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 26
    :cond_0
    iget-object v1, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    if-eqz v1, :cond_1

    .line 28
    sget-object v2, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v3, Ll/ۧۚ᩻;

    invoke-direct {v3, v1}, Ll/ۧۚ᩻;-><init>(Ll/۟֡᩻;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 30
    :cond_1
    iput-object p1, p0, Ll/ܽۚ᩻;->᩸:Ll/۟֡᩻;

    .line 32
    :cond_2
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "http"

    .line 33
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "127.0.0.1:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    .line 34
    invoke-virtual {v3}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/۟֡᩻;->ۗ:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized ۧ()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 70
    :try_start_0
    iget-object v1, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 72
    iput-object v2, p0, Ll/ܽۚ᩻;->᩹:Ljava/net/ServerSocket;

    .line 73
    sget-object v2, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v3, Ll/֡۫ܳ;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v1}, Ll/֡۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
