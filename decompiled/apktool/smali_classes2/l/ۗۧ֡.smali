.class public final Ll/ۗۧ֡;
.super Ljava/lang/Object;
.source "T4F2"

# interfaces
.implements Ll/ۚᩳ֡;


# instance fields
.field public final synthetic ۙ:Ll/ۤۧ֡;

.field public final ᩶:Ll/۫ܽ֡;

.field public ᩸:Z

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۤۧ֡;)V
    .locals 0

    .line 538
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    .line 545
    new-instance p1, Ll/۫ܽ֡;

    invoke-direct {p1}, Ll/۫ܽ֡;-><init>()V

    iput-object p1, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    return-void
.end method

.method private ֫(Z)V
    .locals 11

    .line 568
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    monitor-enter v0

    .line 569
    :try_start_0
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v1, v1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {v1}, Ll/ۙܽ֡;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 571
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-wide v2, v1, Ll/ۤۧ֡;->֫:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    iget-boolean v2, p0, Ll/ۗۧ֡;->᩹:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Ll/ۗۧ֡;->᩸:Z

    if-nez v2, :cond_0

    iget-object v2, v1, Ll/ۤۧ֡;->ܽ:Ll/ܰ֫֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_0

    .line 654
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 656
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 657
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 575
    :cond_0
    :try_start_4
    iget-object v1, v1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {v1}, Ll/۫ۧ֡;->ۡ()V

    .line 578
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    invoke-virtual {v1}, Ll/ۤۧ֡;->ۧ()V

    .line 579
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-wide v1, v1, Ll/ۤۧ֡;->֫:J

    iget-object v3, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {v3}, Ll/۫ܽ֡;->size()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 580
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-wide v2, v1, Ll/ۤۧ֡;->֫:J

    sub-long/2addr v2, v9

    iput-wide v2, v1, Ll/ۤۧ֡;->֫:J

    .line 581
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 583
    iget-object v0, v1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {v0}, Ll/ۙܽ֡;->᩻()V

    .line 585
    :try_start_5
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v5, v0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v6, v0, Ll/ۤۧ֡;->ܳ:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {p1}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    const/4 v7, 0x0

    :goto_1
    iget-object v8, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual/range {v5 .. v10}, Ll/᩹ۧ֡;->֫(IZLl/۫ܽ֡;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 587
    iget-object p1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object p1, p1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {p1}, Ll/۫ۧ֡;->ۡ()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v0, v0, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {v0}, Ll/۫ۧ֡;->ۡ()V

    throw p1

    :catchall_1
    move-exception p1

    .line 575
    :try_start_6
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v1, v1, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    invoke-virtual {v1}, Ll/۫ۧ֡;->ۡ()V

    throw p1

    :catchall_2
    move-exception p1

    .line 581
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 608
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    monitor-enter v0

    .line 609
    :try_start_0
    iget-boolean v1, p0, Ll/ۗۧ֡;->᩸:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 610
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 611
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v0, v0, Ll/ۤۧ֡;->ۜ:Ll/ۗۧ֡;

    iget-boolean v0, v0, Ll/ۗۧ֡;->᩹:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 613
    iget-object v0, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 614
    :goto_0
    iget-object v0, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->size()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    .line 615
    invoke-direct {p0, v1}, Ll/ۗۧ֡;->֫(Z)V

    goto :goto_0

    .line 619
    :cond_1
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v2, v0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    iget v3, v0, Ll/ۤۧ֡;->ܳ:I

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v2 .. v7}, Ll/᩹ۧ֡;->֫(IZLl/۫ܽ֡;J)V

    .line 622
    :cond_2
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    monitor-enter v0

    .line 623
    :try_start_1
    iput-boolean v1, p0, Ll/ۗۧ֡;->᩸:Z

    .line 624
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 625
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v0, v0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    .line 444
    iget-object v0, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v0}, Ll/ۛۧ֡;->flush()V

    .line 626
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    invoke-virtual {v0}, Ll/ۤۧ֡;->֫()V

    return-void

    :catchall_0
    move-exception v1

    .line 624
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 610
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final flush()V
    .locals 5

    .line 593
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    monitor-enter v0

    .line 594
    :try_start_0
    iget-object v1, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    invoke-virtual {v1}, Ll/ۤۧ֡;->ۧ()V

    .line 595
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    :goto_0
    iget-object v0, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x0

    .line 597
    invoke-direct {p0, v0}, Ll/ۗۧ֡;->֫(Z)V

    .line 598
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v0, v0, Ll/ۤۧ֡;->ۧ:Ll/᩹ۧ֡;

    .line 444
    iget-object v0, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v0}, Ll/ۛۧ֡;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 595
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 3

    .line 556
    iget-object v0, p0, Ll/ۗۧ֡;->᩶:Ll/۫ܽ֡;

    invoke-virtual {v0, p1, p2, p3}, Ll/۫ܽ֡;->֫(Ll/۫ܽ֡;J)V

    .line 557
    :goto_0
    invoke-virtual {v0}, Ll/۫ܽ֡;->size()J

    move-result-wide p1

    const-wide/16 v1, 0x4000

    cmp-long p3, p1, v1

    if-ltz p3, :cond_0

    const/4 p1, 0x0

    .line 558
    invoke-direct {p0, p1}, Ll/ۗۧ֡;->֫(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 603
    iget-object v0, p0, Ll/ۗۧ֡;->ۙ:Ll/ۤۧ֡;

    iget-object v0, v0, Ll/ۤۧ֡;->ۡ:Ll/۫ۧ֡;

    return-object v0
.end method
