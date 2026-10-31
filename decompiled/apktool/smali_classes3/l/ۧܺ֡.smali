.class public Ll/ۧܺ֡;
.super Ljava/io/FilterOutputStream;
.source "V2FP"


# virtual methods
.method public close()V
    .locals 2

    .line 137
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 449
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 456
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 163
    throw v1

    :catch_1
    move-exception v0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 147
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    const/4 v0, 0x1

    .line 233
    invoke-virtual {p0, v0}, Ll/ۧܺ֡;->֫(I)V

    .line 234
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final write([B)V
    .locals 1

    .line 198
    sget-object v0, Ll/᩹ۢ֡;->֫:[B

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1723
    :cond_0
    array-length v0, p1

    .line 199
    :goto_0
    invoke-virtual {p0, v0}, Ll/ۧܺ֡;->֫(I)V

    .line 200
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 217
    invoke-virtual {p0, p3}, Ll/ۧܺ֡;->֫(I)V

    .line 218
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public ֫(I)V
    .locals 0

    return-void
.end method
