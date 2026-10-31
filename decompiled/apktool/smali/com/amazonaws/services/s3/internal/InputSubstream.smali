.class public final Lcom/amazonaws/services/s3/internal/InputSubstream;
.super Lcom/amazonaws/internal/SdkFilterInputStream;
.source "InputSubstream.java"


# instance fields
.field public final ۗ:J

.field public final ۙ:J

.field public ᩶:J

.field public final ᩸:Z

.field public ᩹:J


# direct methods
.method public constructor <init>(Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;JJ)V
    .locals 2

    .line 29
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    .line 32
    iput-wide v0, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩶:J

    .line 50
    iput-wide v0, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    .line 51
    iput-wide p4, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۙ:J

    .line 52
    iput-wide p2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۗ:J

    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩸:Z

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 7

    .line 108
    iget-wide v0, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    iget-wide v2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۙ:J

    iget-wide v4, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۗ:J

    cmp-long v6, v0, v4

    if-gez v6, :cond_0

    goto :goto_0

    :cond_0
    add-long/2addr v2, v4

    sub-long/2addr v2, v0

    .line 113
    :goto_0
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->available()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final close()V
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩸:Z

    if-eqz v0, :cond_0

    .line 102
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V

    :cond_0
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 86
    :try_start_0
    iget-wide v1, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    iput-wide v1, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩶:J

    .line 87
    invoke-super {p0, p1}, Lcom/amazonaws/internal/SdkFilterInputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
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
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 59
    invoke-virtual {p0, v1, v2, v0}, Lcom/amazonaws/services/s3/internal/InputSubstream;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v0

    .line 63
    :cond_0
    aget-byte v0, v1, v2

    return v0
.end method

.method public final read([BII)I
    .locals 6

    .line 68
    :goto_0
    iget-wide v0, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    iget-wide v2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۗ:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    sub-long/2addr v2, v0

    .line 69
    invoke-virtual {p0, v2, v3}, Lcom/amazonaws/internal/SdkFilterInputStream;->skip(J)J

    move-result-wide v0

    .line 70
    iget-wide v2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    goto :goto_0

    .line 73
    :cond_0
    iget-wide v4, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->ۙ:J

    add-long/2addr v4, v2

    sub-long/2addr v4, v0

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-gtz v2, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    int-to-long v0, p3

    .line 77
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 78
    invoke-super {p0, p1, p2, p3}, Lcom/amazonaws/internal/SdkFilterInputStream;->read([BII)I

    move-result p1

    .line 79
    iget-wide p2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 92
    :try_start_0
    iget-wide v1, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩶:J

    iput-wide v1, p0, Lcom/amazonaws/services/s3/internal/InputSubstream;->᩹:J

    .line 93
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
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
