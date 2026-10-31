.class public final Ll/ۚۖܽ;
.super Ljava/io/InputStream;
.source "54YN"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:Ll/۠ۖܽ;

.field public ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(JLl/᩻ۖܽ;)V
    .locals 2

    .line 218
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, -0x1

    .line 212
    iput-wide v0, p0, Ll/ۚۖܽ;->᩹:J

    .line 219
    iput-wide p1, p0, Ll/ۚۖܽ;->᩸:J

    .line 220
    iput-object p3, p0, Ll/ۚۖܽ;->᩶:Ll/۠ۖܽ;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 259
    iget-object v0, p0, Ll/ۚۖܽ;->᩶:Ll/۠ۖܽ;

    invoke-interface {v0}, Ll/۠ۖܽ;->length()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۚۖܽ;->᩸:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    return v0

    :cond_0
    long-to-int v1, v0

    return v1
.end method

.method public final declared-synchronized mark(I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 270
    :try_start_0
    iget-wide v1, p0, Ll/ۚۖܽ;->᩸:J

    iput-wide v1, p0, Ll/ۚۖܽ;->᩹:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
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

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 5

    .line 225
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    iget-object v2, p0, Ll/ۚۖܽ;->᩶:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 226
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    .line 227
    invoke-interface {v2}, Ll/۠ۖܽ;->read()I

    move-result v0

    return v0
.end method

.method public final read([B)I
    .locals 4

    .line 232
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    iget-object v2, p0, Ll/ۚۖܽ;->᩶:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 233
    invoke-interface {v2, p1}, Ll/۠ۖܽ;->read([B)I

    move-result p1

    if-lez p1, :cond_0

    .line 235
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    :cond_0
    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 242
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    iget-object v2, p0, Ll/ۚۖܽ;->᩶:Ll/۠ۖܽ;

    invoke-interface {v2, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 243
    invoke-interface {v2, p1, p2, p3}, Ll/۠ۖܽ;->read([BII)I

    move-result p1

    if-lez p1, :cond_0

    .line 245
    iget-wide p2, p0, Ll/ۚۖܽ;->᩸:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۚۖܽ;->᩸:J

    :cond_0
    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 275
    :try_start_0
    iget-wide v1, p0, Ll/ۚۖܽ;->᩹:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 277
    iput-wide v1, p0, Ll/ۚۖܽ;->᩸:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    monitor-exit v0

    return-void

    .line 276
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Resetting to invalid mark"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 278
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final skip(J)J
    .locals 2

    long-to-int p2, p1

    .line 252
    invoke-virtual {p0}, Ll/ۚۖܽ;->available()I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 253
    iget-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    int-to-long p1, p1

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۚۖܽ;->᩸:J

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
