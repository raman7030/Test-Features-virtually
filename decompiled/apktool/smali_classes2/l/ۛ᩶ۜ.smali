.class public final Ll/ۛ᩶ۜ;
.super Landroid/media/MediaDataSource;
.source "P74O"


# instance fields
.field public volatile ᩶:Ljava/io/IOException;

.field public final ᩸:Ll/۟ܰۜ;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/۟ܰۜ;)V
    .locals 5

    .line 23
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 24
    invoke-interface {p1}, Ll/۟ܰۜ;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 28
    iput-object p1, p0, Ll/ۛ᩶ۜ;->᩸:Ll/۟ܰۜ;

    .line 29
    iput-wide v0, p0, Ll/ۛ᩶ۜ;->᩹:J

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Media handle length must be known"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۛ᩶ۜ;->᩸:Ll/۟ܰۜ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final getSize()J
    .locals 2

    .line 72
    iget-wide v0, p0, Ll/ۛ᩶ۜ;->᩹:J

    return-wide v0
.end method

.method public final readAt(J[BII)I
    .locals 8

    if-nez p5, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v2, -0x1

    cmp-long v3, p1, v0

    if-ltz v3, :cond_4

    if-gez p5, :cond_1

    goto :goto_0

    .line 41
    :cond_1
    iget-wide v0, p0, Ll/ۛ᩶ۜ;->᩹:J

    cmp-long v3, p1, v0

    if-ltz v3, :cond_2

    return v2

    :cond_2
    int-to-long v2, p5

    sub-long/2addr v0, p1

    .line 44
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p5, v0

    .line 46
    :try_start_0
    iget-object v2, p0, Ll/ۛ᩶ۜ;->᩸:Ll/۟ܰۜ;

    move-wide v3, p1

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-interface/range {v2 .. v7}, Ll/۟ܰۜ;->ۧ(J[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p5

    :catch_0
    move-exception p1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 57
    :try_start_1
    iget-object p2, p0, Ll/ۛ᩶ۜ;->᩶:Ljava/io/IOException;

    if-nez p2, :cond_3

    .line 58
    iput-object p1, p0, Ll/ۛ᩶ۜ;->᩶:Ljava/io/IOException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :cond_3
    monitor-exit v0

    .line 50
    throw p1

    :catchall_0
    move-exception p1

    .line 60
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    :goto_0
    return v2
.end method

.method public final ֫()V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۛ᩶ۜ;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 66
    :cond_0
    throw v0
.end method
