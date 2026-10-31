.class public abstract Ll/᩺᩸ܿ;
.super Ljava/lang/Object;
.source "F99O"

# interfaces
.implements Ll/֡᩶ܿ;


# static fields
.field public static volatile ֫:Z


# direct methods
.method public static ֫(Landroid/net/LocalServerSocket;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 35
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static ֫(Landroid/net/LocalServerSocket;Ll/ۨ᩸ܿ;Z)V
    .locals 3

    .line 73
    :try_start_0
    new-instance v1, Ll/۬᩶ܿ;

    invoke-virtual {p0}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬᩶ܿ;-><init>(Landroid/net/LocalSocket;)V

    move-object v0, p1

    .line 0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 192
    :try_start_1
    iget-boolean v2, p1, Ll/ۨ᩸ܿ;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    .line 193
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v0, 0x0

    goto :goto_0

    .line 195
    :cond_0
    :try_start_3
    iput-object v1, p1, Ll/ۨ᩸ܿ;->֫:Ll/ۙ᩸ܿ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 196
    :try_start_4
    monitor-exit v0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_1

    .line 75
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    invoke-static {p0}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    return-void

    .line 78
    :cond_1
    :try_start_5
    sget v0, Ll/᩹᩶ܿ;->֫:I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 129
    :try_start_6
    new-instance v0, Ll/᩵᩶ܿ;

    invoke-direct {v0, v1, p2}, Ll/᩵᩶ܿ;-><init>(Ll/ۙ᩸ܿ;Z)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 79
    :try_start_7
    invoke-virtual {p1, v0}, Ll/ۨ᩸ܿ;->֫(Ll/᩵᩶ܿ;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 87
    invoke-static {p0}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    return-void

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    .line 136
    :goto_1
    :try_start_8
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 137
    throw p2

    :catch_2
    move-exception p2

    .line 133
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 134
    throw p2
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_0
    move-exception p2

    .line 196
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p2

    .line 85
    :try_start_b
    invoke-virtual {p1, p2}, Ll/ۨ᩸ܿ;->֫(Ljava/lang/Error;)V

    goto :goto_2

    :catch_4
    move-exception p2

    .line 83
    invoke-virtual {p1, p2}, Ll/ۨ᩸ܿ;->֫(Ljava/lang/RuntimeException;)V

    goto :goto_2

    :catch_5
    move-exception p2

    .line 81
    invoke-virtual {p1, p2}, Ll/ۨ᩸ܿ;->֫(Ljava/io/IOException;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 87
    :goto_2
    invoke-static {p0}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    return-void

    :goto_3
    invoke-static {p0}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    .line 88
    throw p1
.end method


# virtual methods
.method public final ֫(Z)Ll/᩵᩶ܿ;
    .locals 12

    .line 64
    new-instance v0, Ll/ۨ᩸ܿ;

    .line 180
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x64

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez p1, :cond_2

    .line 66
    sget-boolean v6, Ll/᩺᩸ܿ;->֫:Z

    if-nez v6, :cond_0

    invoke-virtual {p0}, Ll/᩺᩸ܿ;->ᩳ()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 101
    :cond_0
    new-instance v6, Ljava/net/ServerSocket;

    invoke-direct {v6, v4}, Ljava/net/ServerSocket;-><init>(I)V

    const/16 v7, 0x258

    .line 102
    invoke-virtual {v6, v7}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 105
    new-instance v7, Ljava/lang/Thread;

    new-instance v8, Ll/ۤ᩸ܿ;

    invoke-direct {v8, v6, v0}, Ll/ۤ᩸ܿ;-><init>(Ljava/net/ServerSocket;Ll/ۨ᩸ܿ;)V

    invoke-direct {v7, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 124
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 125
    invoke-static {}, Ll/ۧۨۡ;->֫()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 126
    sget-object v8, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v9, Ll/ۛ᩸ܿ;

    invoke-direct {v9, p0, v6}, Ll/ۛ᩸ܿ;-><init>(Ll/᩺᩸ܿ;Ljava/net/ServerSocket;)V

    invoke-interface {v8, v9}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v8

    .line 131
    :try_start_0
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 133
    invoke-virtual {v0}, Ll/ۨ᩸ܿ;->֫()V

    .line 44
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    .line 53
    :try_start_1
    invoke-virtual {v7, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    :catch_0
    invoke-static {p1}, Ll/᩹᩶ܿ;->֫(Ljava/lang/Throwable;)V

    throw v5

    .line 140
    :cond_1
    :try_start_2
    invoke-virtual {v6}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v8

    invoke-virtual {p0, v8}, Ll/᩺᩸ܿ;->֫(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_0
    const/4 v8, 0x0

    goto :goto_2

    :catch_1
    move-exception p1

    .line 142
    invoke-virtual {v0}, Ll/ۨ᩸ܿ;->֫()V

    .line 44
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    .line 53
    :try_start_3
    invoke-virtual {v7, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 145
    :catch_2
    throw p1

    .line 68
    :cond_2
    :goto_1
    new-instance v6, Landroid/net/LocalServerSocket;

    invoke-static {}, Ll/۬᩶ܿ;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    .line 71
    new-instance v7, Ljava/lang/Thread;

    new-instance v8, Ll/۫᩸ܿ;

    invoke-direct {v8, v6, v0, p1}, Ll/۫᩸ܿ;-><init>(Landroid/net/LocalServerSocket;Ll/ۨ᩸ܿ;Z)V

    invoke-direct {v7, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 90
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 92
    :try_start_4
    invoke-virtual {v6}, Landroid/net/LocalServerSocket;->getLocalSocketAddress()Landroid/net/LocalSocketAddress;

    move-result-object v8

    invoke-virtual {v8}, Landroid/net/LocalSocketAddress;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8, p1}, Ll/᩺᩸ܿ;->֫(Ljava/lang/String;Z)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6

    const/4 v8, 0x1

    move-object v11, v6

    move-object v6, v5

    move-object v5, v11

    :goto_2
    const-wide/16 v9, 0x258

    .line 150
    :try_start_5
    invoke-virtual {v7, v9, v10}, Ljava/lang/Thread;->join(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    nop

    .line 153
    :goto_3
    iget-object v9, v0, Ll/ۨ᩸ܿ;->ܽ:Ll/᩵᩶ܿ;

    if-eqz v9, :cond_3

    .line 154
    iget-object p1, v0, Ll/ۨ᩸ܿ;->ܽ:Ll/᩵᩶ܿ;

    return-object p1

    .line 155
    :cond_3
    iget-object v9, v0, Ll/ۨ᩸ܿ;->ᩳ:Ljava/io/IOException;

    if-nez v9, :cond_8

    .line 157
    iget-object v9, v0, Ll/ۨ᩸ܿ;->ܿ:Ljava/lang/RuntimeException;

    if-nez v9, :cond_7

    .line 159
    iget-object v9, v0, Ll/ۨ᩸ܿ;->ܳ:Ljava/lang/Error;

    if-nez v9, :cond_6

    .line 162
    invoke-virtual {v0}, Ll/ۨ᩸ܿ;->֫()V

    if-nez p1, :cond_5

    .line 164
    invoke-interface {p0}, Ll/֡᩶ܿ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v8, :cond_5

    .line 165
    sget-boolean p1, Ll/᩺᩸ܿ;->֫:Z

    if-nez p1, :cond_4

    .line 166
    sput-boolean v3, Ll/᩺᩸ܿ;->֫:Z

    .line 168
    :cond_4
    invoke-static {v5}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    .line 51
    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    .line 53
    :try_start_6
    invoke-virtual {v7, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    const-string p1, "switch the root connection to ServerSocket"

    .line 170
    invoke-static {p1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0, v4}, Ll/᩺᩸ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object p1

    return-object p1

    .line 173
    :cond_5
    invoke-static {v5}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    .line 44
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 51
    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    .line 53
    :try_start_7
    invoke-virtual {v7, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_5

    .line 176
    :catch_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Accept timeout"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 160
    :cond_6
    iget-object p1, v0, Ll/ۨ᩸ܿ;->ܳ:Ljava/lang/Error;

    throw p1

    .line 158
    :cond_7
    iget-object p1, v0, Ll/ۨ᩸ܿ;->ܿ:Ljava/lang/RuntimeException;

    throw p1

    .line 156
    :cond_8
    iget-object p1, v0, Ll/ۨ᩸ܿ;->ᩳ:Ljava/io/IOException;

    throw p1

    :catch_6
    move-exception p1

    .line 94
    invoke-virtual {v0}, Ll/ۨ᩸ܿ;->֫()V

    .line 95
    invoke-static {v6}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;)V

    .line 51
    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    .line 53
    :try_start_8
    invoke-virtual {v7, v1, v2}, Ljava/lang/Thread;->join(J)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_7

    .line 97
    :catch_7
    throw p1
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(Ljava/lang/String;Z)V
.end method

.method public abstract ᩳ()Z
.end method
