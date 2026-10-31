.class public final Ll/ۖܰۜ;
.super Landroid/media/MediaDataSource;
.source "O6K0"


# instance fields
.field public final ۗ:Ll/ᩳۜܳ;

.field public ۙ:Ljava/io/InputStream;

.field public ۛ:J

.field public ۤ:J

.field public final ۨ:Ll/ܽܰۜ;

.field public final ۫:Ll/ۗۢ᩻;

.field public final ۬:Landroid/media/MediaDataSource;

.field public final ᩶:J

.field public final ᩸:Ll/᩷᩺ۜ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩺ۢۡ;Ll/ܽܰۜ;Ll/ᩳۜܳ;Ll/᩷᩺ۜ;)V
    .locals 4

    .line 153
    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    .line 147
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x9c4

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۖܰۜ;->᩶:J

    const-wide/32 v0, 0x800000

    .line 148
    iput-wide v0, p0, Ll/ۖܰۜ;->ۛ:J

    .line 154
    iput-object p1, p0, Ll/ۖܰۜ;->۬:Landroid/media/MediaDataSource;

    .line 155
    iput-object p2, p0, Ll/ۖܰۜ;->ۨ:Ll/ܽܰۜ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 156
    :cond_0
    iget-object p1, p2, Ll/ܽܰۜ;->᩸:Ll/ܰܺܳ;

    check-cast p1, Ll/ۗۢ᩻;

    :goto_0
    iput-object p1, p0, Ll/ۖܰۜ;->۫:Ll/ۗۢ᩻;

    .line 157
    iput-object p3, p0, Ll/ۖܰۜ;->ۗ:Ll/ᩳۜܳ;

    .line 158
    iput-object p4, p0, Ll/ۖܰۜ;->᩸:Ll/᩷᩺ۜ;

    return-void
.end method

.method public static ֫(Landroid/media/MediaMetadataRetriever;Ll/ۗۢ᩻;Ll/ᩳۜܳ;Ll/᩷᩺ۜ;)Ll/ۖܰۜ;
    .locals 2

    .line 167
    new-instance v0, Ll/ۖܰۜ;

    new-instance v1, Ll/ܽܰۜ;

    invoke-direct {v1, p1}, Ll/ܽܰۜ;-><init>(Ll/ܰܺܳ;)V

    const/4 p1, 0x0

    invoke-direct {v0, p1, v1, p2, p3}, Ll/ۖܰۜ;-><init>(Ll/᩺ۢۡ;Ll/ܽܰۜ;Ll/ᩳۜܳ;Ll/᩷᩺ۜ;)V

    .line 171
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 172
    invoke-virtual {v0}, Ll/ۖܰۜ;->close()V

    throw p0
.end method

.method public static ֫(Landroid/media/MediaMetadataRetriever;Ll/ܶ᩵ܿ;Ll/᩷᩺ۜ;)Ll/ۖܰۜ;
    .locals 2

    .line 162
    new-instance v0, Ll/ۖܰۜ;

    new-instance v1, Ll/᩺ۢۡ;

    invoke-direct {v1, p1}, Ll/᩺ۢۡ;-><init>(Ll/ܶ᩵ܿ;)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1, p1, p2}, Ll/ۖܰۜ;-><init>(Ll/᩺ۢۡ;Ll/ܽܰۜ;Ll/ᩳۜܳ;Ll/᩷᩺ۜ;)V

    .line 171
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 172
    invoke-virtual {v0}, Ll/ۖܰۜ;->close()V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 200
    :try_start_0
    iget-boolean v1, p0, Ll/ۖܰۜ;->᩹:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 201
    :try_start_1
    iput-boolean v1, p0, Ll/ۖܰۜ;->᩹:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    :try_start_2
    iget-object v1, p0, Ll/ۖܰۜ;->۬:Landroid/media/MediaDataSource;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaDataSource;->close()V

    .line 204
    :cond_1
    iget-object v1, p0, Ll/ۖܰۜ;->ۙ:Ljava/io/InputStream;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    :cond_2
    :try_start_3
    iget-object v1, p0, Ll/ۖܰۜ;->ۨ:Ll/ܽܰۜ;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ܽܰۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 206
    :try_start_4
    iget-object v2, p0, Ll/ۖܰۜ;->ۨ:Ll/ܽܰۜ;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ll/ܽܰۜ;->close()V

    .line 207
    :cond_4
    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public final getSize()J
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ۖܰۜ;->۬:Landroid/media/MediaDataSource;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ll/ۖܰۜ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final declared-synchronized readAt(J[BII)I
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 176
    :try_start_0
    iget-object v1, p0, Ll/ۖܰۜ;->᩸:Ll/᩷᩺ۜ;

    invoke-static {v1}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 177
    iget-boolean v1, p0, Ll/ۖܰۜ;->᩹:Z

    if-nez v1, :cond_7

    iget-wide v1, p0, Ll/ۖܰۜ;->ۛ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۖܰۜ;->᩶:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_7

    if-nez p5, :cond_0

    .line 179
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    int-to-long v1, p5

    .line 180
    :try_start_1
    iget-wide v3, p0, Ll/ۖܰۜ;->ۛ:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v8, v1

    .line 182
    iget-object v3, p0, Ll/ۖܰۜ;->۬:Landroid/media/MediaDataSource;

    if-eqz v3, :cond_1

    move-wide v4, p1

    move-object v6, p3

    move v7, p4

    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result p1

    goto :goto_0

    .line 184
    :cond_1
    iget-object p5, p0, Ll/ۖܰۜ;->ۙ:Ljava/io/InputStream;

    if-eqz p5, :cond_2

    iget-wide v1, p0, Ll/ۖܰۜ;->ۤ:J

    cmp-long v3, p1, v1

    if-eqz v3, :cond_4

    :cond_2
    if-eqz p5, :cond_3

    .line 185
    invoke-virtual {p5}, Ljava/io/InputStream;->close()V

    :cond_3
    const/4 p5, 0x0

    .line 186
    iput-object p5, p0, Ll/ۖܰۜ;->ۙ:Ljava/io/InputStream;

    .line 187
    iget-object p5, p0, Ll/ۖܰۜ;->۫:Ll/ۗۢ᩻;

    iget-object v1, p0, Ll/ۖܰۜ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, p1, p2, v1}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p5

    iput-object p5, p0, Ll/ۖܰۜ;->ۙ:Ljava/io/InputStream;

    .line 188
    iput-wide p1, p0, Ll/ۖܰۜ;->ۤ:J

    .line 190
    :cond_4
    iget-object p1, p0, Ll/ۖܰۜ;->ۙ:Ljava/io/InputStream;

    invoke-virtual {p1, p3, p4, v8}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_5

    .line 191
    iget-wide p2, p0, Ll/ۖܰۜ;->ۤ:J

    int-to-long p4, p1

    add-long/2addr p2, p4

    iput-wide p2, p0, Ll/ۖܰۜ;->ۤ:J

    :cond_5
    :goto_0
    if-lez p1, :cond_6

    .line 193
    iget-wide p2, p0, Ll/ۖܰۜ;->ۛ:J

    int-to-long p4, p1

    sub-long/2addr p2, p4

    iput-wide p2, p0, Ll/ۖܰۜ;->ۛ:J

    .line 194
    :cond_6
    iget-object p2, p0, Ll/ۖܰۜ;->᩸:Ll/᩷᩺ۜ;

    invoke-static {p2}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    monitor-exit v0

    return p1

    .line 178
    :cond_7
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Video poster read limit reached"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
