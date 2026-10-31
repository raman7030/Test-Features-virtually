.class public final Ll/᩻᩺᩵;
.super Ljava/io/OutputStream;
.source "QB6R"


# instance fields
.field public final ۗ:[B

.field public final ۙ:Ljava/io/OutputStream;

.field public ۬:I

.field public ᩶:J

.field public ᩸:Z

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 449
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const v0, 0x8000

    new-array v0, v0, [B

    .line 443
    iput-object v0, p0, Ll/᩻᩺᩵;->ۗ:[B

    .line 450
    iput-object p1, p0, Ll/᩻᩺᩵;->ۙ:Ljava/io/OutputStream;

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 599
    iget-boolean v0, p0, Ll/᩻᩺᩵;->᩸:Z

    if-nez v0, :cond_1

    .line 602
    iget-object v0, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 603
    :cond_0
    throw v0

    .line 600
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()V
    .locals 6

    .line 557
    iget v0, p0, Ll/᩻᩺᩵;->۬:I

    if-nez v0, :cond_0

    return-void

    .line 560
    :cond_0
    iget-object v1, p0, Ll/᩻᩺᩵;->ۗ:[B

    .line 545
    :try_start_0
    invoke-direct {p0}, Ll/᩻᩺᩵;->ᩳ()J

    move-result-wide v2

    const/4 v4, 0x0

    .line 544
    invoke-static {v2, v3, v1, v4, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J[BII)[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 581
    array-length v1, v0

    if-eqz v1, :cond_1

    .line 582
    iget-object v1, p0, Ll/᩻᩺᩵;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    :cond_1
    iput v4, p0, Ll/᩻᩺᩵;->۬:I

    return-void

    :catch_0
    move-exception v0

    .line 590
    iget-object v1, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 591
    iput-object v0, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    goto :goto_0

    :cond_2
    if-eq v1, v0, :cond_3

    .line 593
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 608
    :cond_3
    :goto_0
    iget-wide v1, p0, Ll/᩻᩺᩵;->᩶:J

    const-wide/16 v3, 0x0

    .line 609
    iput-wide v3, p0, Ll/᩻᩺᩵;->᩶:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_4

    .line 611
    invoke-static {v1, v2}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J)V

    .line 549
    :cond_4
    throw v0
.end method

.method private ᩳ()J
    .locals 5

    .line 568
    iget-wide v0, p0, Ll/᩻᩺᩵;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 569
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩻᩺᩵;->᩶:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 571
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to create Ultra Deflate compressor"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_1
    :goto_0
    iget-wide v0, p0, Ll/᩻᩺᩵;->᩶:J

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 7

    .line 506
    iget-boolean v0, p0, Ll/᩻᩺᩵;->᩸:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x1

    .line 509
    iput-boolean v0, p0, Ll/᩻᩺᩵;->᩸:Z

    .line 512
    iget-object v0, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    iget-object v1, p0, Ll/᩻᩺᩵;->ۙ:Ljava/io/OutputStream;

    if-nez v0, :cond_1

    .line 514
    :try_start_0
    invoke-direct {p0}, Ll/᩻᩺᩵;->ܽ()V

    .line 515
    invoke-direct {p0}, Ll/᩻᩺᩵;->ᩳ()J

    move-result-wide v2

    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/SevenZip;->ۧ(J)[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 581
    array-length v2, v0

    if-eqz v2, :cond_1

    .line 582
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 608
    :goto_1
    :try_start_1
    iget-wide v2, p0, Ll/᩻᩺᩵;->᩶:J

    const-wide/16 v4, 0x0

    .line 609
    iput-wide v4, p0, Ll/᩻᩺᩵;->᩶:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    .line 611
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    if-nez v0, :cond_2

    move-object v0, v2

    goto :goto_2

    :cond_2
    if-eq v0, v2, :cond_3

    .line 620
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 527
    :cond_3
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    .line 530
    iget-object v2, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    if-eq v1, v2, :cond_5

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_3

    :cond_4
    if-eq v0, v1, :cond_5

    .line 620
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    if-eqz v0, :cond_9

    .line 626
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_8

    .line 629
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_7

    .line 632
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_6

    .line 633
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 635
    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to close Ultra Deflate stream"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 630
    :cond_7
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 627
    :cond_8
    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_9
    :goto_4
    return-void
.end method

.method public final flush()V
    .locals 6

    .line 490
    iget-boolean v0, p0, Ll/᩻᩺᩵;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    .line 493
    :cond_0
    invoke-direct {p0}, Ll/᩻᩺᩵;->֫()V

    .line 495
    :try_start_0
    invoke-direct {p0}, Ll/᩻᩺᩵;->ܽ()V

    .line 496
    invoke-direct {p0}, Ll/᩻᩺᩵;->ᩳ()J

    move-result-wide v0

    invoke-static {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZip;->ܽ(J)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    iget-object v1, p0, Ll/᩻᩺᩵;->ۙ:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    :try_start_1
    array-length v2, v0

    if-eqz v2, :cond_1

    .line 582
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 497
    :cond_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 590
    iget-object v1, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 591
    iput-object v0, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    goto :goto_0

    :cond_2
    if-eq v1, v0, :cond_3

    .line 593
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 608
    :cond_3
    :goto_0
    iget-wide v1, p0, Ll/᩻᩺᩵;->᩶:J

    const-wide/16 v3, 0x0

    .line 609
    iput-wide v3, p0, Ll/᩻᩺᩵;->᩶:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_4

    .line 611
    invoke-static {v1, v2}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J)V

    .line 500
    :cond_4
    throw v0
.end method

.method public final write(I)V
    .locals 3

    .line 455
    invoke-direct {p0}, Ll/᩻᩺᩵;->֫()V

    .line 456
    iget v0, p0, Ll/᩻᩺᩵;->۬:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩻᩺᩵;->۬:I

    int-to-byte p1, p1

    iget-object v2, p0, Ll/᩻᩺᩵;->ۗ:[B

    aput-byte p1, v2, v0

    .line 457
    array-length p1, v2

    if-ne v1, p1, :cond_0

    .line 458
    invoke-direct {p0}, Ll/᩻᩺᩵;->ܽ()V

    :cond_0
    return-void
.end method

.method public final write([BII)V
    .locals 4

    .line 464
    invoke-direct {p0}, Ll/᩻᩺᩵;->֫()V

    or-int v0, p2, p3

    if-ltz v0, :cond_7

    .line 465
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_7

    :cond_0
    :goto_0
    if-lez p3, :cond_6

    .line 470
    iget v0, p0, Ll/᩻᩺᩵;->۬:I

    iget-object v1, p0, Ll/᩻᩺᩵;->ۗ:[B

    if-nez v0, :cond_5

    array-length v2, v1

    if-lt p3, v2, :cond_5

    .line 471
    array-length v0, v1

    .line 545
    :try_start_0
    invoke-direct {p0}, Ll/᩻᩺᩵;->ᩳ()J

    move-result-wide v2

    .line 544
    invoke-static {v2, v3, p1, p2, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J[BII)[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 581
    array-length v2, v0

    if-eqz v2, :cond_1

    .line 582
    iget-object v2, p0, Ll/᩻᩺᩵;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    :cond_1
    array-length v0, v1

    add-int/2addr p2, v0

    .line 473
    array-length v0, v1

    sub-int/2addr p3, v0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 590
    iget-object p2, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    if-nez p2, :cond_2

    .line 591
    iput-object p1, p0, Ll/᩻᩺᩵;->᩹:Ljava/io/IOException;

    goto :goto_1

    :cond_2
    if-eq p2, p1, :cond_3

    .line 593
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 608
    :cond_3
    :goto_1
    iget-wide p2, p0, Ll/᩻᩺᩵;->᩶:J

    const-wide/16 v0, 0x0

    .line 609
    iput-wide v0, p0, Ll/᩻᩺᩵;->᩶:J

    cmp-long v2, p2, v0

    if-eqz v2, :cond_4

    .line 611
    invoke-static {p2, p3}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(J)V

    .line 549
    :cond_4
    throw p1

    .line 477
    :cond_5
    array-length v2, v1

    sub-int/2addr v2, v0

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 478
    iget v2, p0, Ll/᩻᩺᩵;->۬:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 479
    iget v2, p0, Ll/᩻᩺᩵;->۬:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩻᩺᩵;->۬:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    .line 482
    array-length v0, v1

    if-ne v2, v0, :cond_0

    .line 483
    invoke-direct {p0}, Ll/᩻᩺᩵;->ܽ()V

    goto :goto_0

    :cond_6
    return-void

    .line 466
    :cond_7
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
