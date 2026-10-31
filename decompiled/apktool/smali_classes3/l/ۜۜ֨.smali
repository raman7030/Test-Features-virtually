.class public final Ll/ۜۜ֨;
.super Ljava/io/InputStream;
.source "21TH"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:Ljava/io/IOException;

.field public ۙ:Z

.field public final ۛ:Ll/᩹ۜ֨;

.field public final ۤ:I

.field public final ۨ:[B

.field public final ۫:Ll/۬ۜ֨;

.field public ۬:Ljava/io/InputStream;

.field public final ᩶:Ll/ۚۜ֨;

.field public final ᩸:Ll/ۘ᩻֨;

.field public ᩹:Ll/۠᩻֨;

.field public final ᩺:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;IZ[BLl/ۘ᩻֨;)V
    .locals 2

    .line 302
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    .line 45
    new-instance v1, Ll/۬ۜ֨;

    invoke-direct {v1}, Ll/۬ۜ֨;-><init>()V

    iput-object v1, p0, Ll/ۜۜ֨;->۫:Ll/۬ۜ֨;

    const/4 v1, 0x0

    .line 46
    iput-boolean v1, p0, Ll/ۜۜ֨;->ۙ:Z

    .line 47
    iput-object v0, p0, Ll/ۜۜ֨;->ۗ:Ljava/io/IOException;

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 49
    iput-object v0, p0, Ll/ۜۜ֨;->ۨ:[B

    .line 303
    iput-object p5, p0, Ll/ۜۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 304
    iput-object p1, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    .line 305
    iput p2, p0, Ll/ۜۜ֨;->ۤ:I

    .line 306
    iput-boolean p3, p0, Ll/ۜۜ֨;->᩺:Z

    .line 307
    invoke-static {p4}, Ll/ܶۜ֨;->ۧ([B)Ll/᩹ۜ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۜ֨;->ۛ:Ll/᩹ۜ֨;

    .line 308
    iget p1, p1, Ll/᩹ۜ֨;->ۧ:I

    invoke-static {p1}, Ll/ۚۜ֨;->֫(I)Ll/ۚۜ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۜ֨;->᩶:Ll/ۚۜ֨;

    return-void
.end method

.method private ֫()V
    .locals 5

    const/16 v0, 0xc

    new-array v0, v0, [B

    .line 446
    new-instance v1, Ljava/io/DataInputStream;

    iget-object v2, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 447
    invoke-static {v0}, Ll/ܶۜ֨;->֫([B)Ll/᩹ۜ֨;

    move-result-object v0

    .line 449
    iget-object v1, p0, Ll/ۜۜ֨;->ۛ:Ll/᩹ۜ֨;

    .line 89
    iget v1, v1, Ll/᩹ۜ֨;->ۧ:I

    iget v2, v0, Ll/᩹ۜ֨;->ۧ:I

    if-ne v1, v2, :cond_0

    .line 449
    iget-object v1, p0, Ll/ۜۜ֨;->۫:Ll/۬ۜ֨;

    .line 451
    invoke-virtual {v1}, Ll/ۙۜ֨;->ۧ()J

    move-result-wide v1

    iget-wide v3, v0, Ll/᩹ۜ֨;->֫:J

    cmp-long v0, v1, v3

    if-nez v0, :cond_0

    return-void

    .line 452
    :cond_0
    new-instance v0, Ll/᩹᩻֨;

    const-string v1, "XZ Stream Footer does not match Stream Header"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 452
    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 469
    iget-object v0, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 472
    iget-object v0, p0, Ll/ۜۜ֨;->ۗ:Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 475
    iget-object v0, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/۠᩻֨;->available()I

    move-result v0

    return v0

    .line 473
    :cond_1
    throw v0

    .line 470
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 470
    throw v0
.end method

.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 488
    invoke-virtual {p0, v0}, Ll/ۜۜ֨;->֫(Z)V

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 352
    iget-object v1, p0, Ll/ۜۜ֨;->ۨ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۜۜ֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 10

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    add-int v0, p2, p3

    if-ltz v0, :cond_a

    .line 391
    array-length v1, p1

    if-gt v0, v1, :cond_a

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 397
    :cond_0
    iget-object v0, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    if-eqz v0, :cond_9

    .line 400
    iget-object v0, p0, Ll/ۜۜ֨;->ۗ:Ljava/io/IOException;

    if-nez v0, :cond_8

    .line 403
    iget-boolean v0, p0, Ll/ۜۜ֨;->ۙ:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-lez p3, :cond_7

    .line 410
    :try_start_0
    iget-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, p0, Ll/ۜۜ֨;->۫:Ll/۬ۜ֨;

    if-nez v2, :cond_4

    .line 412
    :try_start_1
    new-instance v2, Ll/۠᩻֨;

    iget-object v5, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    iget-object v6, p0, Ll/ۜۜ֨;->᩶:Ll/ۚۜ֨;

    iget-boolean v7, p0, Ll/ۜۜ֨;->᩺:Z

    iget v8, p0, Ll/ۜۜ֨;->ۤ:I

    iget-object v9, p0, Ll/ۜۜ֨;->᩸:Ll/ۘ᩻֨;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Ll/۠᩻֨;-><init>(Ljava/io/InputStream;Ll/ۚۜ֨;ZILl/ۘ᩻֨;)V

    iput-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;
    :try_end_1
    .catch Ll/ۨ᩻֨; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 416
    :catch_0
    :try_start_2
    iget-object p1, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    invoke-virtual {v3, p1}, Ll/۬ۜ֨;->֫(Ljava/io/InputStream;)V

    .line 417
    invoke-direct {p0}, Ll/ۜۜ֨;->֫()V

    const/4 p1, 0x1

    .line 418
    iput-boolean p1, p0, Ll/ۜۜ֨;->ۙ:Z

    if-lez v0, :cond_3

    move v1, v0

    :cond_3
    return v1

    .line 423
    :cond_4
    :goto_1
    iget-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    invoke-virtual {v2, p1, p2, p3}, Ll/۠᩻֨;->read([BII)I

    move-result v2

    if-lez v2, :cond_5

    add-int/2addr v0, v2

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    goto :goto_0

    :cond_5
    if-ne v2, v1, :cond_2

    .line 430
    iget-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    invoke-virtual {v2}, Ll/۠᩻֨;->ܽ()J

    move-result-wide v4

    iget-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    .line 431
    invoke-virtual {v2}, Ll/۠᩻֨;->֫()J

    move-result-wide v6

    .line 430
    invoke-virtual {v3, v4, v5, v6, v7}, Ll/۬ۜ֨;->֫(JJ)V

    const/4 v2, 0x0

    .line 432
    iput-object v2, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 436
    iput-object p1, p0, Ll/ۜۜ֨;->ۗ:Ljava/io/IOException;

    if-eqz v0, :cond_6

    goto :goto_2

    .line 438
    :cond_6
    throw p1

    :cond_7
    :goto_2
    return v0

    .line 401
    :cond_8
    throw v0

    .line 398
    :cond_9
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 398
    throw p1

    .line 392
    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Z)V
    .locals 2

    .line 514
    iget-object v0, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 515
    iget-object v0, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 516
    invoke-virtual {v0}, Ll/۠᩻֨;->close()V

    .line 517
    iput-object v1, p0, Ll/ۜۜ֨;->᩹:Ll/۠᩻֨;

    :cond_0
    if-eqz p1, :cond_1

    .line 522
    :try_start_0
    iget-object p1, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 524
    iput-object v1, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    .line 525
    throw p1

    .line 524
    :cond_1
    :goto_0
    iput-object v1, p0, Ll/ۜۜ֨;->۬:Ljava/io/InputStream;

    :cond_2
    return-void
.end method
