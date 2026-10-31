.class public final Ll/ᩴᩳۢ;
.super Ljava/lang/Object;
.source "Q1K7"


# instance fields
.field public ֫:Ll/ۧ۫᩷;

.field public final synthetic ۜ:Ll/֡ᩳۢ;

.field public ۧ:I

.field public ܳ:Ljava/io/OutputStream;

.field public ܽ:I

.field public ܿ:Ll/ۗۖܽ;

.field public ᩳ:Ll/ۗۖܽ;

.field public ᩻:Ll/ۗۖܽ;


# direct methods
.method public constructor <init>(Ll/֡ᩳۢ;)V
    .locals 5

    .line 464
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    const/4 v0, -0x1

    .line 462
    iput v0, p0, Ll/ᩴᩳۢ;->ܽ:I

    .line 465
    iget v0, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {p1, v0}, Ll/֡ᩳۢ;->֫(Ll/֡ᩳۢ;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 466
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    const-wide/32 v2, 0x80000

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 467
    iget v0, p0, Ll/ᩴᩳۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {p1, v0}, Ll/֡ᩳۢ;->֫(Ll/֡ᩳۢ;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    .line 469
    :cond_0
    new-instance v0, Ll/ۧ۫᩷;

    invoke-static {p1}, Ll/֡ᩳۢ;->ۧ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;

    move-result-object p1

    iget v1, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ᩴᩳۢ;->֫:Ll/ۧ۫᩷;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 489
    :try_start_0
    iget-object v1, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    if-eqz v1, :cond_0

    .line 490
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v1, 0x0

    .line 491
    iput-object v1, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    :cond_0
    const/4 v1, -0x1

    .line 493
    iput v1, p0, Ll/ᩴᩳۢ;->ܽ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
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

.method public final declared-synchronized ֫(Ljava/lang/String;Ll/۬ۜᩳ;)V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 498
    :try_start_0
    iget-object v1, p0, Ll/ᩴᩳۢ;->֫:Ll/ۧ۫᩷;

    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 499
    iget v2, p0, Ll/ᩴᩳۢ;->ܽ:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    .line 501
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    long-to-int v2, v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 507
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ll/۬ۜᩳ;->ܽ()I

    move-result v3

    .line 509
    iget-object v5, p0, Ll/ᩴᩳۢ;->᩻:Ll/ۗۖܽ;

    const/4 v6, 0x1

    if-nez v5, :cond_2

    .line 510
    new-instance v5, Ll/ۗۖܽ;

    iget-object v7, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    invoke-static {v7}, Ll/֡ᩳۢ;->ܿ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;

    move-result-object v7

    .line 140
    invoke-virtual {v7}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {v7, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v7

    .line 510
    invoke-direct {v5, v7}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v5, p0, Ll/ᩴᩳۢ;->᩻:Ll/ۗۖܽ;

    .line 512
    :cond_2
    iget-object v5, p0, Ll/ᩴᩳۢ;->ܿ:Ll/ۗۖܽ;

    if-nez v5, :cond_3

    .line 513
    new-instance v5, Ll/ۗۖܽ;

    iget-object v7, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    invoke-static {v7}, Ll/֡ᩳۢ;->ܽ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;

    move-result-object v7

    .line 140
    invoke-virtual {v7}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {v7, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v7

    .line 513
    invoke-direct {v5, v7}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v5, p0, Ll/ᩴᩳۢ;->ܿ:Ll/ۗۖܽ;

    .line 515
    :cond_3
    iget-object v5, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    if-nez v5, :cond_4

    .line 516
    invoke-virtual {v1, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    .line 519
    :cond_4
    iget-object v1, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    invoke-virtual {p2}, Ll/۬ۜᩳ;->ۧ()[B

    move-result-object p2

    invoke-virtual {v1, p2, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 520
    iget-object p2, p0, Ll/ᩴᩳۢ;->ܳ:Ljava/io/OutputStream;

    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    .line 521
    iget-object p2, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    iget v1, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {p2, v1}, Ll/֡ᩳۢ;->ۧ(Ll/֡ᩳۢ;I)V

    .line 522
    iget-object p2, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    invoke-static {p2}, Ll/֡ᩳۢ;->ᩳ(Ll/֡ᩳۢ;)Ll/ۧۤᩴ;

    move-result-object p2

    new-instance v1, Ll/᩵ᩳۢ;

    iget v5, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-direct {v1, v5, v2, v3}, Ll/᩵ᩳۢ;-><init>(III)V

    invoke-virtual {p2, p1, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int p2, v2, v3

    .line 523
    iput p2, p0, Ll/ᩴᩳۢ;->ܽ:I

    .line 525
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v1, 0x4e20

    if-gt p2, v1, :cond_5

    const/4 v4, 0x1

    :cond_5
    if-eqz v4, :cond_6

    .line 526
    iget-object p2, p0, Ll/ᩴᩳۢ;->᩻:Ll/ۗۖܽ;

    goto :goto_1

    :cond_6
    iget-object p2, p0, Ll/ᩴᩳۢ;->ܿ:Ll/ۗۖܽ;

    :goto_1
    if-eqz v4, :cond_7

    .line 177
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {p2, v1}, Ll/۫ۜᩳ;->ۧ(Ljava/io/OutputStream;I)V

    .line 178
    invoke-static {p2, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 185
    :cond_7
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {p2, v1}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 186
    invoke-static {p2, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    .line 532
    :goto_2
    iget p1, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {p2, p1}, Ll/۫ۜᩳ;->ۧ(Ljava/io/OutputStream;I)V

    .line 533
    invoke-static {p2, v2}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 534
    invoke-static {p2, v3}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 535
    invoke-virtual {p2}, Ll/ۗۖܽ;->flush()V

    .line 537
    iget p1, p0, Ll/ᩴᩳۢ;->ܽ:I

    const/high16 p2, 0x80000

    if-lt p1, p2, :cond_8

    .line 538
    iget p1, p0, Ll/ᩴᩳۢ;->ۧ:I

    add-int/2addr p1, v6

    iput p1, p0, Ll/ᩴᩳۢ;->ۧ:I

    .line 539
    new-instance p1, Ll/ۧ۫᩷;

    iget-object p2, p0, Ll/ᩴᩳۢ;->ۜ:Ll/֡ᩳۢ;

    invoke-static {p2}, Ll/֡ᩳۢ;->ۧ(Ll/֡ᩳۢ;)Ll/ۧ۫᩷;

    move-result-object p2

    iget v1, p0, Ll/ᩴᩳۢ;->ۧ:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, p2, v1}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ᩴᩳۢ;->֫:Ll/ۧ۫᩷;

    .line 540
    invoke-virtual {p0}, Ll/ᩴᩳۢ;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    :cond_8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 543
    :try_start_1
    invoke-virtual {p0}, Ll/ᩴᩳۢ;->ۧ()V

    .line 544
    throw p1

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 473
    :try_start_0
    iget-object v1, p0, Ll/ᩴᩳۢ;->᩻:Ll/ۗۖܽ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 474
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 475
    iput-object v2, p0, Ll/ᩴᩳۢ;->᩻:Ll/ۗۖܽ;

    .line 477
    :cond_0
    iget-object v1, p0, Ll/ᩴᩳۢ;->ܿ:Ll/ۗۖܽ;

    if-eqz v1, :cond_1

    .line 478
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 479
    iput-object v2, p0, Ll/ᩴᩳۢ;->ܿ:Ll/ۗۖܽ;

    .line 481
    :cond_1
    iget-object v1, p0, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    if-eqz v1, :cond_2

    .line 482
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 483
    iput-object v2, p0, Ll/ᩴᩳۢ;->ᩳ:Ll/ۗۖܽ;

    .line 485
    :cond_2
    invoke-virtual {p0}, Ll/ᩴᩳۢ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 486
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
