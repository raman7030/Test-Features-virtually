.class public final Ll/ۢ᩺ܺ;
.super Ljava/io/FilterInputStream;
.source "B2OJ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 44
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, -0x1

    .line 36
    iput-wide v0, p0, Ll/ۢ᩺ܺ;->᩹:J

    return-void
.end method


# virtual methods
.method public final declared-synchronized mark(I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1}, Ljava/io/InputStream;->mark(I)V

    .line 80
    iget-wide v1, p0, Ll/ۢ᩺ܺ;->᩸:J

    iput-wide v1, p0, Ll/ۢ᩺ܺ;->᩹:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
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

.method public final read()I
    .locals 5

    .line 54
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 56
    iget-wide v1, p0, Ll/ۢ᩺ܺ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۢ᩺ܺ;->᩸:J

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 2

    .line 63
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 65
    iget-wide p2, p0, Ll/ۢ᩺ܺ;->᩸:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۢ᩺ܺ;->᩸:J

    :cond_0
    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 86
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->markSupported()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 89
    iget-wide v1, p0, Ll/ۢ᩺ܺ;->᩹:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 93
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 94
    iget-wide v1, p0, Ll/ۢ᩺ܺ;->᩹:J

    iput-wide v1, p0, Ll/ۢ᩺ܺ;->᩸:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit v0

    return-void

    .line 90
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Mark not set"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Mark not supported"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 95
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final skip(J)J
    .locals 2

    .line 72
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    .line 73
    iget-wide v0, p0, Ll/ۢ᩺ܺ;->᩸:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۢ᩺ܺ;->᩸:J

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 49
    iget-wide v0, p0, Ll/ۢ᩺ܺ;->᩸:J

    return-wide v0
.end method
