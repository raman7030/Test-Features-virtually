.class public final Ll/ܳ᩻ۧ;
.super Landroid/os/HandlerThread;
.source "N8TR"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public ۗ:Ll/᩻᩻ۧ;

.field public ۙ:Ljava/lang/RuntimeException;

.field public ᩶:Ljava/lang/Error;

.field public ᩸:Ll/᩷ۚ֫;

.field public ᩹:Landroid/os/Handler;


# direct methods
.method private ۧ(I)V
    .locals 2

    .line 222
    iget-object v0, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    iget-object v0, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    invoke-virtual {v0, p1}, Ll/᩷ۚ֫;->֫(I)V

    .line 224
    new-instance v0, Ll/᩻᩻ۧ;

    iget-object v1, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    .line 226
    invoke-virtual {v1}, Ll/᩷ۚ֫;->֫()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p0, v1, p1}, Ll/᩻᩻ۧ;-><init>(Ll/ܳ᩻ۧ;Landroid/graphics/SurfaceTexture;Z)V

    iput-object v0, p0, Ll/ܳ᩻ۧ;->ۗ:Ll/᩻᩻ۧ;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 188
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 230
    :cond_0
    :try_start_0
    iget-object p1, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    iget-object p1, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    invoke-virtual {p1}, Ll/᩷ۚ֫;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    const-string v0, "Failed to release placeholder surface"

    .line 211
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    return v1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 214
    throw p1

    .line 191
    :cond_1
    :try_start_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, p1}, Ll/ܳ᩻ۧ;->ۧ(I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/ۖۚ֫; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object v0, p0

    .line 202
    monitor-enter v0

    .line 203
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 204
    monitor-exit v0

    return v1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_4
    const-string v0, "Failed to initialize placeholder surface"

    .line 199
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    iput-object p1, p0, Ll/ܳ᩻ۧ;->᩶:Ljava/lang/Error;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object v0, p0

    .line 202
    monitor-enter v0

    .line 203
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 204
    monitor-exit v0

    goto :goto_0

    :catchall_4
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw p1

    :catch_1
    move-exception p1

    :try_start_6
    const-string v0, "Failed to initialize placeholder surface"

    .line 196
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Ll/ܳ᩻ۧ;->ۙ:Ljava/lang/RuntimeException;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v0, p0

    .line 202
    monitor-enter v0

    .line 203
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 204
    monitor-exit v0

    goto :goto_0

    :catchall_5
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw p1

    :catch_2
    move-exception p1

    :try_start_8
    const-string v0, "Failed to initialize placeholder surface"

    .line 193
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    iput-object p1, p0, Ll/ܳ᩻ۧ;->ۙ:Ljava/lang/RuntimeException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move-object v0, p0

    .line 202
    monitor-enter v0

    .line 203
    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 204
    monitor-exit v0

    :goto_0
    return v1

    :catchall_6
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    throw p1

    :goto_1
    move-object v0, p0

    .line 202
    monitor-enter v0

    .line 203
    :try_start_a
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 204
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 205
    throw p1

    :catchall_7
    move-exception p1

    .line 204
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    throw p1
.end method

.method public final ֫(I)Ll/᩻᩻ۧ;
    .locals 4

    .line 154
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 155
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Ll/ܳ᩻ۧ;->᩹:Landroid/os/Handler;

    .line 156
    new-instance v1, Ll/᩷ۚ֫;

    invoke-direct {v1, v0}, Ll/᩷ۚ֫;-><init>(Landroid/os/Handler;)V

    iput-object v1, p0, Ll/ܳ᩻ۧ;->᩸:Ll/᩷ۚ֫;

    move-object v0, p0

    .line 158
    monitor-enter v0

    .line 159
    :try_start_0
    iget-object v1, p0, Ll/ܳ᩻ۧ;->᩹:Landroid/os/Handler;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 160
    :goto_0
    iget-object p1, p0, Ll/ܳ᩻ۧ;->ۗ:Ll/᩻᩻ۧ;

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ܳ᩻ۧ;->ۙ:Ljava/lang/RuntimeException;

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ܳ᩻ۧ;->᩶:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 162
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v3, 0x1

    goto :goto_0

    .line 167
    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_1

    .line 170
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 172
    :cond_1
    iget-object p1, p0, Ll/ܳ᩻ۧ;->ۙ:Ljava/lang/RuntimeException;

    if-nez p1, :cond_3

    .line 174
    iget-object p1, p0, Ll/ܳ᩻ۧ;->᩶:Ljava/lang/Error;

    if-nez p1, :cond_2

    .line 177
    iget-object p1, p0, Ll/ܳ᩻ۧ;->ۗ:Ll/᩻᩻ۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    .line 175
    :cond_2
    throw p1

    .line 173
    :cond_3
    throw p1

    :catchall_0
    move-exception p1

    .line 167
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 2

    .line 182
    iget-object v0, p0, Ll/ܳ᩻ۧ;->᩹:Landroid/os/Handler;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    iget-object v0, p0, Ll/ܳ᩻ۧ;->᩹:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
