.class public Ll/ۘۜ֨;
.super Ljava/io/InputStream;
.source "A1S8"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۗ:I

.field public ۙ:Ljava/io/InputStream;

.field public ۤ:Ll/ۜۜ֨;

.field public final ۫:Z

.field public final ۬:[B

.field public ᩶:Ljava/io/IOException;

.field public final ᩸:Ll/ۘ᩻֨;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 7

    .line 256
    invoke-static {}, Ll/ۘ᩻֨;->֫()Ll/ۘ᩻֨;

    move-result-object v5

    .line 298
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-boolean v0, p0, Ll/ۘۜ֨;->᩹:Z

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Ll/ۘۜ֨;->᩶:Ljava/io/IOException;

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 66
    iput-object v0, p0, Ll/ۘۜ֨;->۬:[B

    .line 299
    iput-object v5, p0, Ll/ۘۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 300
    iput-object p1, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    const/4 v2, -0x1

    .line 301
    iput v2, p0, Ll/ۘۜ֨;->ۗ:I

    const/4 v3, 0x1

    .line 302
    iput-boolean v3, p0, Ll/ۘۜ֨;->۫:Z

    .line 303
    new-instance v6, Ll/ۜۜ֨;

    const/16 v0, 0xc

    new-array v4, v0, [B

    .line 57
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0, v4}, Ljava/io/DataInputStream;->readFully([B)V

    move-object v0, v6

    move-object v1, p1

    .line 297
    invoke-direct/range {v0 .. v5}, Ll/ۜۜ֨;-><init>(Ljava/io/InputStream;IZ[BLl/ۘ᩻֨;)V

    .line 303
    iput-object v6, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    return-void
.end method

.method private ֫()V
    .locals 8

    .line 414
    new-instance v0, Ljava/io/DataInputStream;

    iget-object v1, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v1, 0xc

    new-array v6, v1, [B

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 422
    invoke-virtual {v0, v6, v1, v2}, Ljava/io/DataInputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 424
    iput-boolean v2, p0, Ll/ۘۜ֨;->᩹:Z

    return-void

    :cond_1
    const/4 v3, 0x3

    .line 430
    invoke-virtual {v0, v6, v2, v3}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 432
    aget-byte v1, v6, v1

    if-nez v1, :cond_2

    aget-byte v1, v6, v2

    if-nez v1, :cond_2

    const/4 v1, 0x2

    aget-byte v1, v6, v1

    if-nez v1, :cond_2

    aget-byte v1, v6, v3

    if-eqz v1, :cond_0

    :cond_2
    const/4 v1, 0x4

    const/16 v2, 0x8

    .line 437
    invoke-virtual {v0, v6, v1, v2}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 440
    :try_start_0
    new-instance v0, Ll/ۜۜ֨;

    iget-object v3, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    iget v4, p0, Ll/ۘۜ֨;->ۗ:I

    iget-boolean v5, p0, Ll/ۘۜ֨;->۫:Z

    iget-object v7, p0, Ll/ۘۜ֨;->᩸:Ll/ۘ᩻֨;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/ۜۜ֨;-><init>(Ljava/io/InputStream;IZ[BLl/ۘ᩻֨;)V

    iput-object v0, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;
    :try_end_0
    .catch Ll/ܺۜ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 445
    :catch_0
    new-instance v0, Ll/᩹᩻֨;

    const-string v1, "Garbage after a valid XZ Stream"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 445
    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 463
    iget-object v0, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 466
    iget-object v0, p0, Ll/ۘۜ֨;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 469
    iget-object v0, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/ۜۜ֨;->available()I

    move-result v0

    return v0

    .line 467
    :cond_1
    throw v0

    .line 464
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 464
    throw v0
.end method

.method public final close()V
    .locals 3

    .line 508
    iget-object v0, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 509
    iget-object v0, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    .line 510
    invoke-virtual {v0, v2}, Ll/ۜۜ֨;->֫(Z)V

    .line 511
    iput-object v1, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    .line 516
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 518
    iput-object v1, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    .line 519
    throw v0

    :cond_1
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 330
    iget-object v1, p0, Ll/ۘۜ֨;->۬:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۘۜ֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 3

    if-ltz p2, :cond_8

    if-ltz p3, :cond_8

    add-int v0, p2, p3

    if-ltz v0, :cond_8

    .line 369
    array-length v1, p1

    if-gt v0, v1, :cond_8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 375
    :cond_0
    iget-object v1, p0, Ll/ۘۜ֨;->ۙ:Ljava/io/InputStream;

    if-eqz v1, :cond_7

    .line 378
    iget-object v1, p0, Ll/ۘۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_6

    .line 381
    iget-boolean v1, p0, Ll/ۘۜ֨;->᩹:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-lez p3, :cond_5

    .line 388
    :try_start_0
    iget-object v1, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    if-nez v1, :cond_2

    .line 389
    invoke-direct {p0}, Ll/ۘۜ֨;->֫()V

    .line 390
    iget-boolean v1, p0, Ll/ۘۜ֨;->᩹:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_5

    :goto_1
    return v2

    .line 394
    :cond_2
    iget-object v1, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;

    invoke-virtual {v1, p1, p2, p3}, Ll/ۜۜ֨;->read([BII)I

    move-result v1

    if-lez v1, :cond_3

    add-int/2addr v0, v1

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    :cond_3
    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 401
    iput-object v1, p0, Ll/ۘۜ֨;->ۤ:Ll/ۜۜ֨;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 405
    iput-object p1, p0, Ll/ۘۜ֨;->᩶:Ljava/io/IOException;

    if-eqz v0, :cond_4

    goto :goto_2

    .line 407
    :cond_4
    throw p1

    :cond_5
    :goto_2
    return v0

    .line 379
    :cond_6
    throw v1

    .line 376
    :cond_7
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 376
    throw p1

    .line 370
    :cond_8
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
