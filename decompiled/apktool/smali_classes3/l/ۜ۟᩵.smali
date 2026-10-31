.class public final Ll/ۜ۟᩵;
.super Ll/ܶ۟᩵;
.source "G4FN"


# instance fields
.field public final synthetic ᩶:Ll/᩷۟᩵;

.field public final ᩹:Ll/ᩳܰ᩵;


# direct methods
.method public constructor <init>(Ll/᩷۟᩵;Ll/ᩳܰ᩵;)V
    .locals 2

    .line 158
    iput-object p1, p0, Ll/ۜ۟᩵;->᩶:Ll/᩷۟᩵;

    .line 237
    iget-object p1, p1, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    .line 49
    iget-object p1, p1, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 237
    invoke-virtual {p1}, Ll/ۨܰ᩵;->ܺ()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    .line 159
    invoke-direct {p0, p1, v0}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iput-object p2, p0, Ll/ۜ۟᩵;->᩹:Ll/ᩳܰ᩵;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    .line 198
    iget-object v0, p0, Ll/ۜ۟᩵;->᩹:Ll/ᩳܰ᩵;

    const-string v1, "Callback failure for "

    const-string v2, "canceled due to "

    .line 199
    iget-object v3, p0, Ll/ۜ۟᩵;->᩶:Ll/᩷۟᩵;

    iget-object v4, v3, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    iget-object v5, v3, Ll/᩷۟᩵;->۬:Ll/ۙܽ֡;

    invoke-virtual {v5}, Ll/ۙܽ֡;->᩻()V

    const/4 v5, 0x0

    .line 201
    :try_start_0
    invoke-virtual {v3}, Ll/᩷۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 203
    :try_start_1
    invoke-interface {v0, v5}, Ll/ᩳܰ᩵;->֫(Ll/ᩴ۟᩵;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v1

    const/4 v5, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    const/4 v5, 0x1

    goto :goto_1

    :catchall_1
    move-exception v1

    .line 214
    :goto_0
    :try_start_2
    invoke-virtual {v3}, Ll/᩷۟᩵;->cancel()V

    if-nez v5, :cond_0

    .line 216
    new-instance v3, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 217
    invoke-interface {v0, v3}, Ll/ᩳܰ᩵;->֫(Ljava/io/IOException;)V

    .line 219
    :cond_0
    throw v1

    :catch_1
    move-exception v2

    .line 205
    :goto_1
    invoke-virtual {v3, v2}, Ll/᩷۟᩵;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v2

    if-eqz v5, :cond_2

    .line 208
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    iget-object v6, v3, Ll/᩷۟᩵;->ۗ:Ll/᩸֫֡;

    invoke-virtual {v6}, Ll/᩸֫֡;->ۧ()Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "canceled "

    goto :goto_2

    :cond_1
    const-string v6, ""

    :goto_2
    const-string v7, "call"

    const-string v8, " to "

    .line 0
    invoke-static {v1, v6, v7, v8}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    iget-object v3, v3, Ll/᩷۟᩵;->ۙ:Ll/ۡ۟᩵;

    .line 49
    iget-object v3, v3, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 237
    invoke-virtual {v3}, Ll/ۨܰ᩵;->ܺ()Ljava/lang/String;

    move-result-object v3

    .line 233
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 208
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v0, v3, v1, v2}, Ll/ᩴܽ֡;->֫(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 210
    :cond_2
    invoke-static {v3}, Ll/᩷۟᩵;->֫(Ll/᩷۟᩵;)Ll/᩶ܰ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    invoke-interface {v0, v2}, Ll/ᩳܰ᩵;->֫(Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 390
    :goto_3
    iget-object v0, v4, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 221
    invoke-virtual {v0, p0}, Ll/ۚܰ᩵;->ۧ(Ll/ۜ۟᩵;)V

    return-void

    :catchall_2
    move-exception v0

    .line 390
    iget-object v1, v4, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 221
    invoke-virtual {v1, p0}, Ll/ۚܰ᩵;->ۧ(Ll/ۜ۟᩵;)V

    throw v0
.end method

.method public final ֫(Ljava/util/concurrent/ExecutorService;)V
    .locals 4

    .line 180
    iget-object v0, p0, Ll/ۜ۟᩵;->᩶:Ll/᩷۟᩵;

    iget-object v1, v0, Ll/᩷۟᩵;->᩸:Ll/ܿ۟᩵;

    .line 183
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 186
    :try_start_1
    new-instance v2, Ljava/io/InterruptedIOException;

    const-string v3, "executor rejected"

    invoke-direct {v2, v3}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 188
    invoke-static {v0}, Ll/᩷۟᩵;->֫(Ll/᩷۟᩵;)Ll/᩶ܰ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    iget-object p1, p0, Ll/ۜ۟᩵;->᩹:Ll/ᩳܰ᩵;

    invoke-interface {p1, v2}, Ll/ᩳܰ᩵;->֫(Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 390
    iget-object p1, v1, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 192
    invoke-virtual {p1, p0}, Ll/ۚܰ᩵;->ۧ(Ll/ۜ۟᩵;)V

    return-void

    .line 390
    :goto_0
    iget-object v0, v1, Ll/ܿ۟᩵;->ۨ:Ll/ۚܰ᩵;

    .line 192
    invoke-virtual {v0, p0}, Ll/ۚܰ᩵;->ۧ(Ll/ۜ۟᩵;)V

    throw p1
.end method
