.class public Ll/ۗۡ֡;
.super Ll/ۤۡ֡;
.source "L2QA"


# instance fields
.field public final ۗ:J

.field public ۙ:J

.field public ۫:Z

.field public final ۬:Ll/᩶۫᩷;

.field public ᩶:J


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 293
    new-instance v0, Ll/ۙۡ֡;

    .line 248
    invoke-direct {v0}, Ll/᩶ۡ֡;-><init>()V

    .line 355
    invoke-virtual {v0, p1, p2}, Ll/᩶ۡ֡;->֫(J)V

    .line 337
    invoke-direct {p0, p3, v0}, Ll/ۤۡ֡;-><init>(Ljava/io/InputStream;Ll/ۙۡ֡;)V

    const/4 p1, 0x1

    .line 312
    iput-boolean p1, p0, Ll/ۗۡ֡;->۫:Z

    const-wide/16 p1, 0x0

    .line 338
    iput-wide p1, p0, Ll/ۗۡ֡;->᩶:J

    .line 339
    invoke-virtual {v0}, Ll/᩶ۡ֡;->֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۗۡ֡;->ۗ:J

    .line 340
    invoke-virtual {v0}, Ll/᩶ۡ֡;->ܽ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۗۡ֡;->۫:Z

    .line 341
    invoke-virtual {v0}, Ll/᩶ۡ֡;->ۧ()Ll/᩶۫᩷;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۡ֡;->۬:Ll/᩶۫᩷;

    return-void
.end method

.method private ᩳ()Z
    .locals 5

    const-wide/16 v0, 0x0

    .line 440
    iget-wide v2, p0, Ll/ۗۡ֡;->ۗ:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 378
    invoke-direct {p0}, Ll/ۗۡ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    .line 487
    iget-object v0, p0, Ll/ۗۡ֡;->۬:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0

    .line 382
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .line 392
    iget-boolean v0, p0, Ll/ۗۡ֡;->۫:Z

    if-eqz v0, :cond_0

    .line 393
    invoke-super {p0}, Ll/ۤۡ֡;->close()V

    :cond_0
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 459
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1}, Ljava/io/InputStream;->mark(I)V

    .line 460
    iget-wide v1, p0, Ll/ۗۡ֡;->᩶:J

    iput-wide v1, p0, Ll/ۗۡ֡;->ۙ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 461
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

    .line 470
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 1

    .line 498
    invoke-direct {p0}, Ll/ۗۡ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    .line 487
    iget-object v0, p0, Ll/ۗۡ֡;->۬:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    return v0

    .line 502
    :cond_0
    invoke-super {p0}, Ll/ۤۡ֡;->read()I

    move-result v0

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 514
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۗۡ֡;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 6

    .line 528
    invoke-direct {p0}, Ll/ۗۡ֡;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 529
    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    .line 487
    iget-object p1, p0, Ll/ۗۡ֡;->۬:Ll/᩶۫᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v0, p3

    const-wide/16 v2, 0x0

    .line 573
    iget-wide v4, p0, Ll/ۗۡ֡;->ۗ:J

    cmp-long p3, v4, v2

    if-ltz p3, :cond_1

    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_1
    long-to-int p3, v0

    .line 532
    invoke-super {p0, p1, p2, p3}, Ll/ۤۡ֡;->read([BII)I

    move-result p1

    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 542
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 543
    iget-wide v1, p0, Ll/ۗۡ֡;->ۙ:J

    iput-wide v1, p0, Ll/ۗۡ֡;->᩶:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 544
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

.method public final declared-synchronized skip(J)J
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 573
    :try_start_0
    iget-wide v1, p0, Ll/ۗۡ֡;->ۗ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    invoke-virtual {p0}, Ll/ۗۡ֡;->֫()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 567
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۤۡ֡;->skip(J)J

    move-result-wide p1

    .line 568
    iget-wide v1, p0, Ll/ۗۡ֡;->᩶:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Ll/ۗۡ֡;->᩶:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 569
    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 583
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ֫()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 404
    :try_start_0
    iget-wide v1, p0, Ll/ۗۡ֡;->᩶:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(I)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 368
    :try_start_0
    iget-wide v1, p0, Ll/ۗۡ֡;->᩶:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗۡ֡;->᩶:J

    .line 370
    :cond_0
    invoke-super {p0, p1}, Ll/ۤۡ֡;->֫(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
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

.method public final declared-synchronized ܽ()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 555
    :try_start_0
    iput-boolean v1, p0, Ll/ۗۡ֡;->۫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 556
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
