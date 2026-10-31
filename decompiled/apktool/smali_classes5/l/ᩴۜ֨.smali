.class public final Ll/ᩴۜ֨;
.super Ll/ۛ᩻֨;
.source "Z1QE"


# instance fields
.field public ۗ:[Ll/۟᩻֨;

.field public ۙ:Ljava/io/IOException;

.field public ۛ:Ljava/io/OutputStream;

.field public final ۤ:Ll/ۗۜ֨;

.field public final ۨ:Ll/᩹ۜ֨;

.field public ۫:Z

.field public ۬:Z

.field public final ᩶:Ll/ۚۜ֨;

.field public final ᩸:Ll/ۘ᩻֨;

.field public ᩹:Ll/ܶ᩻֨;

.field public final ᩺:[B


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ll/ۧۜ֨;)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ll/ۧۜ֨;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    .line 244
    invoke-static {}, Ll/ۘ᩻֨;->֫()Ll/ۘ᩻֨;

    move-result-object p2

    .line 14
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 53
    new-instance v3, Ll/᩹ۜ֨;

    invoke-direct {v3}, Ll/᩹ۜ֨;-><init>()V

    iput-object v3, p0, Ll/ᩴۜ֨;->ۨ:Ll/᩹ۜ֨;

    .line 55
    new-instance v4, Ll/ۗۜ֨;

    invoke-direct {v4}, Ll/ۗۜ֨;-><init>()V

    iput-object v4, p0, Ll/ᩴۜ֨;->ۤ:Ll/ۗۜ֨;

    const/4 v4, 0x0

    .line 57
    iput-object v4, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    .line 67
    iput-object v4, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    .line 68
    iput-boolean v2, p0, Ll/ᩴۜ֨;->۫:Z

    new-array v4, v0, [B

    .line 70
    iput-object v4, p0, Ll/ᩴۜ֨;->᩺:[B

    .line 272
    iput-object p2, p0, Ll/ᩴۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 273
    iput-object p1, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    .line 335
    iput-boolean v0, p0, Ll/ᩴۜ֨;->۬:Z

    .line 338
    aget-object p1, v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    new-instance p2, Ll/۟᩻֨;

    invoke-direct {p2, p1}, Ll/۟᩻֨;-><init>(Ll/ۧۜ֨;)V

    new-array p1, v0, [Ll/۟᩻֨;

    aput-object p2, p1, v2

    .line 339
    iget-boolean p2, p0, Ll/ᩴۜ֨;->۬:Z

    iput-boolean p2, p0, Ll/ᩴۜ֨;->۬:Z

    .line 342
    invoke-static {p1}, Ll/ܳۜ֨;->֫([Ll/۫᩻֨;)V

    .line 343
    iput-object p1, p0, Ll/ᩴۜ֨;->ۗ:[Ll/۟᩻֨;

    const/4 p1, 0x4

    .line 276
    iput p1, v3, Ll/᩹ۜ֨;->ۧ:I

    .line 277
    invoke-static {p1}, Ll/ۚۜ֨;->֫(I)Ll/ۚۜ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴۜ֨;->᩶:Ll/ۚۜ֨;

    .line 595
    iget-object p1, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    sget-object p2, Ll/ۡۜ֨;->ۧ:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    const/4 p1, 0x2

    new-array p1, p1, [B

    aput-byte v2, p1, v2

    .line 591
    iget p2, v3, Ll/᩹ۜ֨;->ۧ:I

    int-to-byte p2, p2

    aput-byte p2, p1, v0

    .line 599
    iget-object p2, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 601
    iget-object p2, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-static {p1, p2}, Ll/᩸ۜ֨;->֫([BLjava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 565
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 570
    :try_start_0
    invoke-virtual {p0}, Ll/ᩴۜ֨;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 574
    :catch_0
    :try_start_1
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 578
    iget-object v1, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v1, :cond_0

    .line 579
    iput-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 582
    iput-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    .line 585
    :cond_1
    iget-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_2

    return-void

    .line 586
    :cond_2
    throw v0
.end method

.method public final finish()V
    .locals 7

    .line 531
    iget-object v0, p0, Ll/ᩴۜ֨;->ۤ:Ll/ۗۜ֨;

    iget-boolean v1, p0, Ll/ᩴۜ֨;->۫:Z

    if-nez v1, :cond_1

    .line 534
    invoke-virtual {p0}, Ll/ᩴۜ֨;->֫()V

    .line 537
    :try_start_0
    iget-object v1, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ll/ۗۜ֨;->֫(Ljava/io/OutputStream;)V

    const/4 v1, 0x6

    new-array v1, v1, [B

    .line 606
    invoke-virtual {v0}, Ll/ۙۜ֨;->ۧ()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    div-long/2addr v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x4

    if-ge v4, v5, :cond_0

    mul-int/lit8 v5, v4, 0x8

    ushr-long v5, v2, v5

    long-to-int v6, v5

    int-to-byte v5, v6

    .line 608
    aput-byte v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    aput-byte v0, v1, v5

    .line 591
    iget-object v0, p0, Ll/ᩴۜ֨;->ۨ:Ll/᩹ۜ֨;

    iget v0, v0, Ll/᩹ۜ֨;->ۧ:I

    int-to-byte v0, v0

    const/4 v2, 0x5

    aput-byte v0, v1, v2

    .line 612
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-static {v1, v0}, Ll/᩸ۜ֨;->֫([BLjava/io/OutputStream;)V

    .line 613
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 614
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    sget-object v1, Ll/ۡۜ֨;->֫:[B

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 547
    iput-boolean v0, p0, Ll/ᩴۜ֨;->۫:Z

    return-void

    :catch_0
    move-exception v0

    .line 540
    iput-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    .line 541
    throw v0

    :cond_1
    return-void
.end method

.method public final flush()V
    .locals 2

    .line 486
    iget-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 489
    iget-boolean v0, p0, Ll/ᩴۜ֨;->۫:Z

    if-nez v0, :cond_2

    .line 493
    :try_start_0
    iget-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    if-eqz v0, :cond_1

    .line 494
    iget-boolean v1, p0, Ll/ᩴۜ֨;->۬:Z

    if-eqz v1, :cond_0

    .line 497
    invoke-virtual {v0}, Ll/ܶ᩻֨;->flush()V

    return-void

    .line 499
    :cond_0
    invoke-virtual {p0}, Ll/ᩴۜ֨;->֫()V

    .line 500
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    .line 503
    :cond_1
    iget-object v0, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 506
    iput-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    .line 507
    throw v0

    .line 490
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream finished or closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 490
    throw v0

    .line 487
    :cond_3
    throw v0
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 360
    iget-object v0, p0, Ll/ᩴۜ֨;->᩺:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 361
    invoke-virtual {p0, v0, v1, p1}, Ll/ᩴۜ֨;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 5

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    if-ltz v0, :cond_3

    .line 390
    array-length v1, p1

    if-gt v0, v1, :cond_3

    .line 393
    iget-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 396
    iget-boolean v0, p0, Ll/ᩴۜ֨;->۫:Z

    if-nez v0, :cond_1

    .line 400
    :try_start_0
    iget-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    if-nez v0, :cond_0

    .line 401
    new-instance v0, Ll/ܶ᩻֨;

    iget-object v1, p0, Ll/ᩴۜ֨;->ۛ:Ljava/io/OutputStream;

    iget-object v2, p0, Ll/ᩴۜ֨;->ۗ:[Ll/۟᩻֨;

    iget-object v3, p0, Ll/ᩴۜ֨;->᩶:Ll/ۚۜ֨;

    iget-object v4, p0, Ll/ᩴۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܶ᩻֨;-><init>(Ljava/io/OutputStream;[Ll/۟᩻֨;Ll/ۚۜ֨;Ll/ۘ᩻֨;)V

    iput-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    .line 404
    :cond_0
    iget-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܶ᩻֨;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 406
    iput-object p1, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    .line 407
    throw p1

    .line 397
    :cond_1
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream finished or closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 397
    throw p1

    .line 394
    :cond_2
    throw v0

    .line 391
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫()V
    .locals 5

    .line 440
    iget-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 443
    iget-boolean v0, p0, Ll/ᩴۜ֨;->۫:Z

    if-nez v0, :cond_1

    .line 449
    iget-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    if-eqz v0, :cond_0

    .line 451
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩻֨;->finish()V

    .line 452
    iget-object v0, p0, Ll/ᩴۜ֨;->ۤ:Ll/ۗۜ֨;

    iget-object v1, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    invoke-virtual {v1}, Ll/ܶ᩻֨;->ܽ()J

    move-result-wide v1

    iget-object v3, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;

    .line 453
    invoke-virtual {v3}, Ll/ܶ᩻֨;->֫()J

    move-result-wide v3

    .line 452
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۗۜ֨;->֫(JJ)V

    const/4 v0, 0x0

    .line 454
    iput-object v0, p0, Ll/ᩴۜ֨;->᩹:Ll/ܶ᩻֨;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 456
    iput-object v0, p0, Ll/ᩴۜ֨;->ۙ:Ljava/io/IOException;

    .line 457
    throw v0

    :cond_0
    return-void

    .line 444
    :cond_1
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream finished or closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 444
    throw v0

    .line 441
    :cond_2
    throw v0
.end method
