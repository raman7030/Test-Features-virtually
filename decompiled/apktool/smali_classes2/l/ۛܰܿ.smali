.class public final Ll/ۛܰܿ;
.super Ljava/lang/Object;
.source "F70U"


# instance fields
.field public ֫:Z

.field public final ۜ:Ll/ܶ᩵ܿ;

.field public ۧ:Ll/ۡۧܳ;

.field public ܳ:Ljava/lang/Throwable;

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Z

.field public final ᩷:Ll/᩺ܰܿ;

.field public ᩻:Ll/ۤܰܿ;


# direct methods
.method public constructor <init>(Ll/᩺ܰܿ;Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 487
    sget-object v0, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    iput-object v0, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    const-wide/high16 v0, -0x8000000000000000L

    .line 492
    iput-wide v0, p0, Ll/ۛܰܿ;->ܿ:J

    .line 497
    iput-object p1, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    .line 498
    iput-object p2, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/ۛܰܿ;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 679
    iput-boolean v0, p0, Ll/ۛܰܿ;->ᩳ:Z

    .line 680
    iget-boolean v0, p0, Ll/ۛܰܿ;->ܽ:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Ll/ۛܰܿ;->ܽ:Z

    .line 687
    iget-object p1, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    const/4 v0, 0x0

    .line 688
    iput-object v0, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    if-nez p1, :cond_0

    goto :goto_0

    .line 693
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ۡۧܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 705
    :cond_1
    iget-object p1, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    if-nez p1, :cond_2

    .line 706
    iput-object v0, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    goto :goto_1

    .line 708
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 682
    :goto_1
    const-class p0, Ll/᩺ܰܿ;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛܰܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛܰܿ;->ܽ:Z

    return p0
.end method

.method public static ۧ(Ll/ۛܰܿ;)V
    .locals 2

    .line 670
    iget-object v0, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v1, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    if-ne v0, v1, :cond_3

    .line 671
    sget-object v0, Ll/ۤܰܿ;->۬:Ll/ۤܰܿ;

    iput-object v0, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    .line 687
    iget-object v0, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    const/4 v1, 0x0

    .line 688
    iput-object v1, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 693
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/ۡۧܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 705
    :cond_1
    iget-object v0, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    if-nez v0, :cond_2

    .line 706
    iput-object v1, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    goto :goto_1

    .line 708
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 673
    :goto_1
    const-class p0, Ll/᩺ܰܿ;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_3
    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 713
    iget-object v0, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v1, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۛܰܿ;->ᩳ:Z

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩺ܰܿ;->ۢ()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v1}, Ll/᩺ܰܿ;->ۧ(Ll/᩺ܰܿ;)Ljava/lang/String;

    move-result-object v1

    .line 714
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    return-void

    .line 715
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Hex checkpoint write was canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ljava/io/IOException;
    .locals 4

    .line 658
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 720
    :try_start_0
    new-instance v1, Ljava/io/IOException;

    iget-object v2, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v3, Ll/ۤܰܿ;->᩶:Ll/ۤܰܿ;

    if-ne v2, v3, :cond_0

    const-string v2, "Hex checkpoint write was discarded"

    goto :goto_0

    :cond_0
    const-string v2, "Hex checkpoint write failed"

    .line 722
    :goto_0
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 723
    iget-object v2, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    .line 724
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 659
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 660
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܿۖ᩷;)Ll/ۤܰܿ;
    .locals 4

    .line 641
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 642
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v2, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    if-ne v1, v2, :cond_0

    .line 643
    invoke-static {p1}, Ll/᩺ܰܿ;->֫(Ll/ܿۖ᩷;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 645
    :try_start_1
    const-class v1, Ll/᩺ܰܿ;

    const-wide/16 v2, 0x64

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 647
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 648
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Interrupted while waiting for hex checkpoint"

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 651
    :cond_0
    invoke-static {p1}, Ll/᩺ܰܿ;->֫(Ll/ܿۖ᩷;)V

    .line 652
    iget-object p1, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 653
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(J)V
    .locals 1

    .line 529
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 530
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 531
    iput-wide p1, p0, Ll/ۛܰܿ;->ܿ:J

    const/4 p1, 0x1

    .line 532
    iput-boolean p1, p0, Ll/ۛܰܿ;->֫:Z

    .line 533
    const-class p1, Ll/᩺ܰܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 534
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 5

    .line 594
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 595
    :try_start_0
    invoke-static {}, Ll/᩺ܰܿ;->ۢ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v2}, Ll/᩺ܰܿ;->ۧ(Ll/᩺ܰܿ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 687
    :goto_0
    iget-object v2, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    const/4 v3, 0x0

    .line 688
    iput-object v3, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_1

    .line 693
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ll/ۡۧܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    .line 732
    :goto_2
    :try_start_2
    iget-object v4, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-static {v4}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v3

    :goto_3
    if-nez v2, :cond_2

    move-object v2, v3

    goto :goto_4

    :cond_2
    if-eqz v3, :cond_3

    .line 601
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_3
    :goto_4
    if-eqz v1, :cond_6

    .line 605
    :try_start_4
    iget-boolean v1, p0, Ll/ۛܰܿ;->ܽ:Z

    if-eqz v1, :cond_4

    .line 606
    iget-object v1, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v1}, Ll/᩺ܰܿ;->ܽ(Ll/᩺ܰܿ;)V

    goto :goto_5

    .line 608
    :cond_4
    iget-object v1, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v1}, Ll/᩺ܰܿ;->ᩳ(Ll/᩺ܰܿ;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catch_2
    move-exception v1

    if-nez v2, :cond_5

    move-object v2, v1

    goto :goto_5

    .line 614
    :cond_5
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 617
    :goto_5
    invoke-static {}, Ll/᩺ܰܿ;->ۢ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v3, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v3}, Ll/᩺ܰܿ;->ۧ(Ll/᩺ܰܿ;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p0}, Ll/ܰ۬ᩴ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    :cond_6
    iget-object v1, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v3, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    if-ne v1, v3, :cond_8

    .line 620
    iget-boolean v1, p0, Ll/ۛܰܿ;->ᩳ:Z

    if-eqz v1, :cond_7

    sget-object v1, Ll/ۤܰܿ;->᩶:Ll/ۤܰܿ;

    goto :goto_6

    :cond_7
    sget-object v1, Ll/ۤܰܿ;->ۙ:Ll/ۤܰܿ;

    :goto_6
    iput-object v1, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    .line 621
    iput-object p1, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    :cond_8
    if-eqz v2, :cond_a

    .line 624
    iget-object p1, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    if-nez p1, :cond_9

    .line 625
    iput-object v2, p0, Ll/ۛܰܿ;->ܳ:Ljava/lang/Throwable;

    goto :goto_7

    .line 627
    :cond_9
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 630
    :cond_a
    :goto_7
    const-class p1, Ll/᩺ܰܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 631
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۡۧܳ;)V
    .locals 3

    .line 515
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 516
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 517
    iget-object v1, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    if-nez v1, :cond_0

    .line 520
    iput-object p1, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    .line 521
    invoke-virtual {p1}, Ll/ۡۧܳ;->֫()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۛܰܿ;->ܿ:J

    const/4 p1, 0x1

    .line 522
    iput-boolean p1, p0, Ll/ۛܰܿ;->֫:Z

    .line 523
    const-class p1, Ll/᩺ܰܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 524
    monitor-exit v0

    return-void

    .line 518
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Hex checkpoint view is already installed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 524
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Z)V
    .locals 3

    .line 574
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 575
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 576
    iget-object v1, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v1

    if-nez v1, :cond_2

    .line 579
    iget-object v1, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    iget-object v2, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v2}, Ll/᩺ܰܿ;->֫(Ll/᩺ܰܿ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 582
    invoke-static {}, Ll/᩺ܰܿ;->ۢ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {v2}, Ll/᩺ܰܿ;->ۧ(Ll/᩺ܰܿ;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p0}, Ll/ܰ۬ᩴ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    sget-object v1, Ll/ۤܰܿ;->᩹:Ll/ۤܰܿ;

    iput-object v1, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    .line 584
    const-class v1, Ll/᩺ܰܿ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 585
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 588
    iget-object p1, p0, Ll/ۛܰܿ;->᩷:Ll/᩺ܰܿ;

    invoke-static {p1}, Ll/᩺ܰܿ;->ܿ(Ll/᩺ܰܿ;)V

    :cond_0
    return-void

    .line 580
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Unable to commit pending hex checkpoint"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 577
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Hex pending state file is unavailable"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 585
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()J
    .locals 3

    .line 539
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 540
    :try_start_0
    iget-boolean v1, p0, Ll/ۛܰܿ;->֫:Z

    if-eqz v1, :cond_0

    .line 543
    iget-wide v1, p0, Ll/ۛܰܿ;->ܿ:J

    monitor-exit v0

    return-wide v1

    .line 541
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Hex checkpoint generation is unavailable"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 544
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܳ()Ll/ۡۧܳ;
    .locals 3

    .line 549
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 550
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 551
    iget-object v1, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 555
    iput-object v2, p0, Ll/ۛܰܿ;->ۧ:Ll/ۡۧܳ;

    .line 556
    monitor-exit v0

    return-object v1

    .line 553
    :cond_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Hex checkpoint view is unavailable"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 557
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Z
    .locals 2

    .line 665
    iget-object v0, p0, Ll/ۛܰܿ;->᩻:Ll/ۤܰܿ;

    sget-object v1, Ll/ۤܰܿ;->ۗ:Ll/ۤܰܿ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۛܰܿ;->ᩳ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 562
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 563
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 564
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ljava/io/BufferedOutputStream;
    .locals 3

    .line 503
    const-class v0, Ll/᩺ܰܿ;

    monitor-enter v0

    .line 504
    :try_start_0
    invoke-direct {p0}, Ll/ۛܰܿ;->᩻()V

    .line 505
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    iget-object v0, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/᩺ܰܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 507
    new-instance v0, Ljava/io/BufferedOutputStream;

    iget-object v1, p0, Ll/ۛܰܿ;->ۜ:Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    .line 446
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    .line 507
    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0

    :catchall_0
    move-exception v1

    .line 505
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
