.class public final Ll/ۘ᩶ܿ;
.super Ljava/io/FilterInputStream;
.source "N17O"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩵᩶ܿ;


# direct methods
.method public constructor <init>(Ll/᩵᩶ܿ;Ljava/io/InputStream;)V
    .locals 0

    .line 479
    iput-object p1, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 519
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 521
    iget-object v1, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v1, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw v0
.end method

.method public final close()V
    .locals 2

    .line 527
    iget-object v0, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ܽ()V

    .line 528
    iget-object v0, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    iget-object v0, v0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 529
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 2

    .line 483
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 485
    iget-object v1, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v1, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw v0
.end method

.method public final read([B)I
    .locals 1

    .line 492
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 494
    iget-object v0, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method

.method public final read([BII)I
    .locals 1

    .line 501
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 503
    iget-object p2, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {p2, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method

.method public final declared-synchronized reset()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 535
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 539
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 537
    :try_start_1
    iget-object v2, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v2, v1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final skip(J)J
    .locals 1

    .line 510
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 512
    iget-object p2, p0, Ll/ۘ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {p2, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
