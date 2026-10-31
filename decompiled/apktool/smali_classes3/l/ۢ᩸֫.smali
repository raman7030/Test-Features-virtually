.class public final Ll/ۢ᩸֫;
.super Ljava/io/BufferedOutputStream;
.source "Z728"


# instance fields
.field public ᩸:Z


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Ll/ۢ᩸֫;->᩸:Z

    .line 46
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 51
    :goto_0
    :try_start_1
    iget-object v1, p0, Ljava/io/BufferedOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    :goto_1
    if-nez v0, :cond_1

    return-void

    .line 58
    :cond_1
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2912
    throw v0
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 1

    .line 70
    iget-boolean v0, p0, Ll/ۢ᩸֫;->᩸:Z

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 71
    iput-object p1, p0, Ljava/io/BufferedOutputStream;->out:Ljava/io/OutputStream;

    const/4 p1, 0x0

    .line 72
    iput p1, p0, Ljava/io/BufferedOutputStream;->count:I

    .line 73
    iput-boolean p1, p0, Ll/ۢ᩸֫;->᩸:Z

    return-void
.end method
