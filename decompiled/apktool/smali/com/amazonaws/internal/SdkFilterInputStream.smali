.class public Lcom/amazonaws/internal/SdkFilterInputStream;
.super Ljava/io/FilterInputStream;
.source "SdkFilterInputStream.java"

# interfaces
.implements Lcom/amazonaws/internal/MetricAware;
.implements Ll/ܶ֨ᩴ;


# virtual methods
.method public available()I
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 85
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    .line 90
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 91
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    return-void
.end method

.method public declared-synchronized mark(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 96
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 97
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final markSupported()Z
    .locals 1

    .line 108
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 109
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 67
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1

    .line 72
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 73
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public declared-synchronized reset()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 102
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 103
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
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

.method public skip(J)J
    .locals 1

    .line 78
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 79
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ֫()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 35
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    instance-of v0, v0, Lcom/amazonaws/internal/MetricAware;

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    check-cast v0, Lcom/amazonaws/internal/MetricAware;

    .line 37
    invoke-interface {v0}, Lcom/amazonaws/internal/MetricAware;->֫()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 49
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ܽ()V

    .line 51
    new-instance v0, Lcom/amazonaws/AbortedException;

    invoke-direct {v0}, Lcom/amazonaws/AbortedException;-><init>()V

    throw v0
.end method
