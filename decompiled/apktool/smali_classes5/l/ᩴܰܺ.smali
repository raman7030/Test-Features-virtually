.class public abstract Ll/ᩴܰܺ;
.super Ll/ۚܰܺ;
.source "U2NA"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic ۨ:I


# instance fields
.field public ۛ:Ll/ۗܰܺ;

.field public ۤ:Ll/ܳ᩹ܺ;


# virtual methods
.method public final run()V
    .locals 6

    .line 73
    iget-object v0, p0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    .line 74
    iget-object v1, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    .line 77
    iget-object v2, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 323
    instance-of v2, v2, Ll/᩺᩺ܺ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    or-int/2addr v2, v5

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    return-void

    :cond_2
    const/4 v2, 0x0

    .line 78
    iput-object v2, p0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    .line 80
    move-object v3, v0

    check-cast v3, Ll/᩶ܰܺ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    :try_start_0
    invoke-static {v0}, Ll/ۨܰܺ;->֫(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    :try_start_1
    invoke-interface {v1, v0}, Ll/ܽܶܺ;->apply(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    iput-object v2, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    .line 172
    move-object v1, p0

    check-cast v1, Ll/ۘܰܺ;

    .line 260
    invoke-virtual {v1, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v0

    .line 36
    :try_start_2
    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_3

    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 130
    :cond_3
    invoke-virtual {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    iput-object v2, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    return-void

    :catchall_1
    move-exception v0

    iput-object v2, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    .line 134
    throw v0

    :catch_0
    move-exception v0

    .line 120
    invoke-virtual {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z

    return-void

    :catch_1
    move-exception v0

    .line 112
    invoke-virtual {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z

    return-void

    :catch_2
    move-exception v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z

    return-void

    .line 104
    :catch_3
    invoke-virtual {p0, v4}, Ll/ܿܰܺ;->cancel(Z)Z

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 5

    .line 194
    iget-object v0, p0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    .line 195
    iget-object v1, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    .line 196
    invoke-super {p0}, Ll/ܿܰܺ;->ܿ()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_0

    .line 199
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "inputFuture=["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "], "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    if-eqz v1, :cond_1

    .line 202
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "function=["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    if-eqz v2, :cond_2

    .line 0
    invoke-static {v0, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 186
    iget-object v0, p0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 77
    :goto_0
    iget-object v2, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 323
    instance-of v2, v2, Ll/᩺᩺ܺ;

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 77
    iget-object v1, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 433
    instance-of v2, v1, Ll/᩺᩺ܺ;

    if-eqz v2, :cond_1

    check-cast v1, Ll/᩺᩺ܺ;

    iget-boolean v1, v1, Ll/᩺᩺ܺ;->ۧ:Z

    .line 832
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    const/4 v0, 0x0

    .line 188
    iput-object v0, p0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    .line 189
    iput-object v0, p0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    return-void
.end method
