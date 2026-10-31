.class public final Ll/᩸۠ۜ;
.super Ljava/lang/Object;
.source "B74J"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ljava/lang/Boolean;

.field public final ۙ:Ll/ܶ۠ۜ;

.field public ۬:Z

.field public ᩶:J

.field public ᩸:Z

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ۠ۜ;)V
    .locals 2

    .line 484
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 479
    iput-wide v0, p0, Ll/᩸۠ۜ;->᩶:J

    .line 485
    iput-object p1, p0, Ll/᩸۠ۜ;->ۙ:Ll/ܶ۠ۜ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܶ۠ۜ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩸۠ۜ;-><init>(Ll/ܶ۠ۜ;)V

    return-void
.end method

.method public static ֫(Ll/᩸۠ۜ;Ljava/lang/String;JLjava/lang/Boolean;)V
    .locals 3

    .line 521
    iget-boolean v0, p0, Ll/᩸۠ۜ;->۬:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩸۠ۜ;->ۙ:Ll/ܶ۠ۜ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 524
    :cond_0
    iget v1, v0, Ll/ܶ۠ۜ;->᩷:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iput v1, v0, Ll/ܶ۠ۜ;->᩷:I

    .line 525
    iget v1, v0, Ll/ܶ۠ۜ;->֫:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ܶ۠ۜ;->֫:I

    .line 526
    iput-object p1, p0, Ll/᩸۠ۜ;->᩹:Ljava/lang/String;

    .line 527
    iput-wide p2, p0, Ll/᩸۠ۜ;->᩶:J

    .line 528
    iput-object p4, p0, Ll/᩸۠ۜ;->ۗ:Ljava/lang/Boolean;

    .line 529
    iput-boolean v2, p0, Ll/᩸۠ۜ;->᩸:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸۠ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸۠ۜ;->۬:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸۠ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸۠ۜ;->᩻()V

    return-void
.end method

.method public static ܳ()Ll/᩸۠ۜ;
    .locals 2

    .line 490
    new-instance v0, Ll/᩸۠ۜ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩸۠ۜ;-><init>(Ll/ܶ۠ۜ;)V

    const/4 v1, 0x1

    .line 491
    iput-boolean v1, v0, Ll/᩸۠ۜ;->۬:Z

    return-object v0
.end method

.method private ᩻()V
    .locals 3

    .line 533
    iget-boolean v0, p0, Ll/᩸۠ۜ;->۬:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 536
    iput-boolean v0, p0, Ll/᩸۠ۜ;->۬:Z

    .line 537
    iget-object v1, p0, Ll/᩸۠ۜ;->ۙ:Ll/ܶ۠ۜ;

    if-eqz v1, :cond_2

    .line 538
    iget-boolean v2, p0, Ll/᩸۠ۜ;->᩸:Z

    if-eqz v2, :cond_1

    .line 539
    iget v2, v1, Ll/ܶ۠ۜ;->֫:I

    sub-int/2addr v2, v0

    iput v2, v1, Ll/ܶ۠ۜ;->֫:I

    goto :goto_0

    .line 541
    :cond_1
    iget v2, v1, Ll/ܶ۠ۜ;->᩷:I

    sub-int/2addr v2, v0

    iput v2, v1, Ll/ܶ۠ۜ;->᩷:I

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 544
    iput-boolean v0, p0, Ll/᩸۠ۜ;->᩸:Z

    const/4 v0, 0x0

    .line 545
    iput-object v0, p0, Ll/᩸۠ۜ;->᩹:Ljava/lang/String;

    const-wide/16 v1, -0x1

    .line 546
    iput-wide v1, p0, Ll/᩸۠ۜ;->᩶:J

    .line 547
    iput-object v0, p0, Ll/᩸۠ۜ;->ۗ:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 554
    invoke-static {}, Ll/ۗ۠ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 555
    :try_start_0
    invoke-direct {p0}, Ll/᩸۠ۜ;->᩻()V

    .line 556
    iget-object v1, p0, Ll/᩸۠ۜ;->ۙ:Ll/ܶ۠ۜ;

    if-eqz v1, :cond_0

    iget-boolean v2, v1, Ll/ܶ۠ۜ;->ܳ:Z

    if-eqz v2, :cond_0

    iget v2, v1, Ll/ܶ۠ۜ;->᩷:I

    iget v3, v1, Ll/ܶ۠ۜ;->֫:I

    add-int/2addr v2, v3

    if-nez v2, :cond_0

    .line 558
    iget-object v2, v1, Ll/ܶ۠ۜ;->᩻:Ll/᩸۠֫;

    .line 559
    iget-object v1, v1, Ll/ܶ۠ۜ;->ۜ:Ljava/lang/Thread;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    move-object v1, v2

    .line 561
    :goto_0
    invoke-static {}, Ll/ۗ۠ۜ;->֫()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 562
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 563
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v1, v0, :cond_1

    .line 564
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz v2, :cond_2

    .line 568
    :try_start_1
    invoke-interface {v2}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 562
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 498
    invoke-static {}, Ll/ۗ۠ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 499
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۠ۜ;->᩸:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/᩸۠ۜ;->۬:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩸۠ۜ;->᩹:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 500
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()J
    .locals 3

    .line 505
    invoke-static {}, Ll/ۗ۠ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 506
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۠ۜ;->᩸:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/᩸۠ۜ;->۬:Z

    if-nez v1, :cond_0

    iget-wide v1, p0, Ll/᩸۠ۜ;->᩶:J

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    :goto_0
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 507
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ljava/lang/Boolean;
    .locals 2

    .line 513
    invoke-static {}, Ll/ۗ۠ۜ;->֫()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 514
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۠ۜ;->᩸:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/᩸۠ۜ;->۬:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩸۠ۜ;->ۗ:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 515
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
