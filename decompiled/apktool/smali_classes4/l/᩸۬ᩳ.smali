.class public final Ll/᩸۬ᩳ;
.super Ljava/lang/Object;
.source "06UY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֫֫:I

.field public final ۗ:I

.field public final ۙ:Ll/֨۬ᩳ;

.field public final ۛ:Ll/ۤ۬ᩳ;

.field public volatile ۟:Z

.field public final ۤ:I

.field public final ۧ֫:Ljava/util/UUID;

.field public final ۨ:J

.field public ۫:Z

.field public final ۬:Ll/ۗ᩻᩵;

.field public ܰ:Z

.field public ܽ֫:J

.field public ᩶:Ll/ۚ۬ᩳ;

.field public ᩸:I

.field public ᩹:Z

.field public final ᩺:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩸۬ᩳ;->᩺:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x1

    .line 35
    iput v0, p0, Ll/᩸۬ᩳ;->֫֫:I

    .line 38
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩸۬ᩳ;->۬:Ll/ۗ᩻᩵;

    .line 41
    new-instance v0, Ll/ܺ۬ᩳ;

    invoke-direct {v0, p1}, Ll/ܺ۬ᩳ;-><init>(Ll/ۤ۬ᩳ;)V

    iput-object v0, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    .line 42
    iput-object p2, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    .line 43
    iput p3, p0, Ll/᩸۬ᩳ;->ۗ:I

    .line 44
    iput p4, p0, Ll/᩸۬ᩳ;->ۤ:I

    .line 45
    iput-object p5, p0, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    .line 46
    iput-wide p6, p0, Ll/᩸۬ᩳ;->ۨ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸۬ᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩸۬ᩳ;->᩸:I

    return p0
.end method

.method private ֫(Ll/۠۬ᩳ;[BLl/۬ۜܽ;Ljava/util/zip/CRC32;)Ll/ۧ۫ᩳ;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    .line 408
    iget-object v2, v0, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    if-ne v2, v1, :cond_9

    iget v2, v0, Ll/۠۬ᩳ;->ۧ:I

    iget v3, v1, Ll/᩸۬ᩳ;->ۗ:I

    if-ne v2, v3, :cond_9

    iget v2, v0, Ll/۠۬ᩳ;->ܿ:I

    if-ltz v2, :cond_9

    if-gt v2, v3, :cond_9

    iget v3, v0, Ll/۠۬ᩳ;->ܳ:I

    if-ltz v3, :cond_9

    if-gt v3, v2, :cond_9

    .line 412
    iget-boolean v3, v0, Ll/۠۬ᩳ;->ᩳ:Z

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    const/4 v11, 0x2

    :goto_0
    mul-int v12, v2, v11

    add-int/lit8 v13, v12, 0x10

    add-int/lit8 v2, v12, 0x40

    .line 416
    iget-object v3, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v3, v3, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v16, v3

    monitor-enter v16

    .line 417
    :try_start_0
    iget-wide v14, v0, Ll/۠۬ᩳ;->᩻:J

    const-wide/16 v3, 0x40

    cmp-long v5, v14, v3

    if-ltz v5, :cond_8

    .line 418
    iget-wide v3, v1, Ll/᩸۬ᩳ;->ܽ֫:J

    int-to-long v6, v2

    sub-long/2addr v3, v6

    cmp-long v5, v14, v3

    if-gtz v5, :cond_8

    .line 421
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    array-length v3, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 424
    iget-object v2, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    const/16 v16, 0x0

    check-cast v2, Ll/ܺ۬ᩳ;

    move-wide v3, v14

    move/from16 v17, v5

    move-object/from16 v5, p2

    move-wide/from16 v18, v6

    move/from16 v6, v16

    move/from16 v7, v17

    invoke-virtual/range {v2 .. v7}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    const-wide/16 v2, 0x0

    .line 425
    invoke-virtual {v9, v2, v3}, Ll/۬ۜܽ;->seek(J)V

    .line 426
    invoke-static/range {p3 .. p3}, Ll/֫۫ᩳ;->֫(Ll/۬ۜܽ;)Ll/۟۬ᩳ;

    move-result-object v7

    .line 427
    iget v2, v7, Ll/۟۬ᩳ;->ᩳ:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    iget-wide v2, v7, Ll/۟۬ᩳ;->֫:J

    iget-wide v4, v0, Ll/۠۬ᩳ;->ܽ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_7

    iget v2, v7, Ll/۟۬ᩳ;->ܽ:I

    if-ne v2, v13, :cond_7

    .line 430
    invoke-virtual/range {p3 .. p3}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    iget v3, v0, Ll/۠۬ᩳ;->ۧ:I

    if-ne v2, v3, :cond_6

    invoke-virtual/range {p3 .. p3}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    iget v3, v0, Ll/۠۬ᩳ;->ܿ:I

    if-ne v2, v3, :cond_6

    .line 431
    invoke-virtual/range {p3 .. p3}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    iget v3, v0, Ll/۠۬ᩳ;->ܳ:I

    if-ne v2, v3, :cond_6

    invoke-virtual/range {p3 .. p3}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    if-ne v2, v11, :cond_6

    .line 434
    invoke-virtual/range {p4 .. p4}, Ljava/util/zip/CRC32;->reset()V

    move/from16 v2, v17

    add-int/lit8 v5, v2, -0x20

    .line 437
    invoke-static {v13, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/16 v4, 0x20

    .line 436
    invoke-virtual {v10, v8, v4, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 438
    new-instance v13, Ll/ۧ۫ᩳ;

    iget v3, v0, Ll/۠۬ᩳ;->ۧ:I

    iget v4, v0, Ll/۠۬ᩳ;->ܿ:I

    iget v5, v0, Ll/۠۬ᩳ;->ܳ:I

    iget-boolean v6, v0, Ll/۠۬ᩳ;->ᩳ:Z

    invoke-direct {v13, v3, v4, v5, v6}, Ll/ۧ۫ᩳ;-><init>(IIIZ)V

    int-to-long v3, v2

    add-long/2addr v3, v14

    const/16 v5, 0x30

    const/4 v6, 0x0

    const/16 v16, 0x0

    move-wide/from16 v16, v3

    move v6, v12

    const/4 v12, 0x0

    const/16 v20, 0x0

    :goto_1
    if-eqz v6, :cond_2

    if-ne v5, v2, :cond_1

    add-int/lit8 v2, v6, 0x10

    .line 444
    array-length v3, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 445
    iget-object v2, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    const/16 v21, 0x0

    check-cast v2, Ll/ܺ۬ᩳ;

    move-wide/from16 v3, v16

    move/from16 v22, v5

    move-object/from16 v5, p2

    move v9, v6

    move/from16 v6, v21

    move-wide/from16 v23, v14

    move-object v14, v7

    move/from16 v7, v22

    invoke-virtual/range {v2 .. v7}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    move/from16 v2, v22

    int-to-long v3, v2

    add-long v16, v16, v3

    .line 448
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v10, v8, v4, v3}, Ljava/util/zip/CRC32;->update([BII)V

    const/4 v5, 0x0

    move v15, v2

    move-wide/from16 v21, v16

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    move v9, v6

    move-wide/from16 v23, v14

    move-object v14, v7

    move v15, v2

    move-wide/from16 v21, v16

    move/from16 v16, v5

    :goto_2
    sub-int v2, v15, v16

    .line 451
    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    move-result v17

    move-object v2, v13

    move-object/from16 v3, p2

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v20

    move v7, v12

    .line 452
    invoke-virtual/range {v2 .. v7}, Ll/ۧ۫ᩳ;->֫([BIIII)I

    move-result v12

    .line 453
    div-int v2, v17, v11

    add-int v20, v2, v20

    add-int v5, v16, v17

    sub-int v6, v9, v17

    move-object/from16 v9, p3

    move-object v7, v14

    move v2, v15

    move-wide/from16 v16, v21

    move-wide/from16 v14, v23

    goto :goto_1

    :cond_2
    move-wide/from16 v23, v14

    move-object v14, v7

    .line 457
    iget v0, v0, Ll/۠۬ᩳ;->ܳ:I

    if-ne v12, v0, :cond_5

    invoke-virtual/range {p4 .. p4}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    long-to-int v0, v3

    iget v3, v14, Ll/۟۬ᩳ;->ۧ:I

    if-ne v0, v3, :cond_5

    sub-int/2addr v2, v5

    const/16 v0, 0x10

    if-ge v2, v0, :cond_3

    .line 462
    iget-object v0, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    add-long v14, v23, v18

    const-wide/16 v2, 0x10

    sub-long v3, v14, v2

    const/16 v7, 0x10

    move-object v2, v0

    check-cast v2, Ll/ܺ۬ᩳ;

    const/4 v6, 0x0

    move-object/from16 v5, p2

    invoke-virtual/range {v2 .. v7}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    const/4 v5, 0x0

    :cond_3
    int-to-long v2, v5

    move-object/from16 v0, p3

    .line 465
    invoke-virtual {v0, v2, v3}, Ll/۬ۜܽ;->seek(J)V

    add-long v14, v23, v18

    .line 466
    invoke-static {v0, v14, v15}, Ll/֫۫ᩳ;->֫(Ll/۬ۜܽ;J)J

    move-result-wide v2

    cmp-long v0, v2, v23

    if-nez v0, :cond_4

    return-object v13

    .line 467
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery footer reference"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 458
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid text page checksum"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 432
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid text page metadata"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 428
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid text page reference"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 419
    :cond_8
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Truncated or unwritten text page"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 421
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 410
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid text page shape"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;
    .locals 7

    .line 59
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    const-wide/16 v5, 0x1

    const/16 v2, 0x800

    const/16 v3, 0x10

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Ll/᩸۬ᩳ;->֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)Ll/᩸۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)Ll/᩸۬ᩳ;
    .locals 9

    .line 75
    :try_start_0
    invoke-static {p2, p3}, Ll/᩸۬ᩳ;->֫(II)V

    .line 76
    new-instance v8, Ll/᩸۬ᩳ;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-direct/range {v0 .. v7}, Ll/᩸۬ᩳ;-><init>(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)V

    iget-object p1, v8, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    .line 77
    new-instance p4, Ll/ۤۜܽ;

    const/16 p5, 0x40

    invoke-direct {p4, p5}, Ll/ۤۜܽ;-><init>(I)V

    const p6, 0x3244544d

    .line 78
    invoke-virtual {p4, p6}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p6, 0x1

    .line 79
    invoke-virtual {p4, p6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 80
    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    .line 81
    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    .line 82
    iget-wide v0, v8, Ll/᩸۬ᩳ;->ۨ:J

    invoke-virtual {p4, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    .line 83
    invoke-virtual {p4, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 84
    invoke-virtual {p4, p3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 85
    invoke-virtual {p4}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {p4}, Ll/ۤۜܽ;->size()I

    move-result p2

    const/4 p3, 0x0

    invoke-static {p3, p2, p1}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p1

    invoke-virtual {p4, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 86
    :goto_0
    invoke-virtual {p4}, Ll/ۤۜܽ;->size()I

    move-result p1

    if-ge p1, p5, :cond_0

    invoke-virtual {p4, p3}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p4}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {p4}, Ll/ۤۜܽ;->size()I

    move-result p2

    const-wide/16 p3, 0x0

    invoke-interface {p0, p3, p4, p2, p1}, Ll/ۤ۬ᩳ;->֫(JI[B)V

    .line 88
    invoke-interface {p0}, Ll/ۤ۬ᩳ;->ܺ()V

    .line 89
    invoke-interface {p0}, Ll/ۤ۬ᩳ;->ۘ֫()V

    const-wide/16 p1, 0x40

    .line 90
    iput-wide p1, v8, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v8

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 93
    :goto_1
    :try_start_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_2
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 94
    :goto_2
    throw p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;
    .locals 2

    .line 23
    new-instance v0, Ll/۬۬ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۬۬ᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    .line 99
    invoke-static {v0, p1}, Ll/᩸۬ᩳ;->ۧ(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ljava/util/UUID;)Ll/᩸۬ᩳ;
    .locals 7

    .line 23
    new-instance v0, Ll/۬۬ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/۬۬ᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    const/16 v3, 0x10

    const-wide/16 v5, 0x1

    const/16 v2, 0x800

    move-object v1, p1

    move-object v4, p2

    .line 55
    invoke-static/range {v0 .. v6}, Ll/᩸۬ᩳ;->֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)Ll/᩸۬ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸۬ᩳ;Ll/᩷۠ᩴ;)Ll/᩸۬ᩳ;
    .locals 12

    .line 68
    iget-wide v0, p0, Ll/᩸۬ᩳ;->ۨ:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 23
    new-instance v5, Ll/۬۬ᩳ;

    const/4 v0, 0x1

    invoke-direct {v5, p1, v0}, Ll/۬۬ᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    .line 69
    iget-object v6, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget v7, p0, Ll/᩸۬ᩳ;->ۗ:I

    iget v8, p0, Ll/᩸۬ᩳ;->ۤ:I

    iget-object v9, p0, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-wide p0, p0, Ll/᩸۬ᩳ;->ۨ:J

    const-wide/16 v0, 0x1

    add-long v10, p0, v0

    invoke-static/range {v5 .. v11}, Ll/᩸۬ᩳ;->֫(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)Ll/᩸۬ᩳ;

    move-result-object p0

    return-object p0

    .line 68
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Recovery generation exhausted"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(II)V
    .locals 1

    const/16 v0, 0x8

    if-lt p0, v0, :cond_0

    const/high16 v0, 0x10000

    if-gt p0, v0, :cond_0

    and-int/lit8 p0, p0, 0x1

    if-nez p0, :cond_0

    const/4 p0, 0x4

    if-lt p1, p0, :cond_0

    const/16 p0, 0x100

    if-gt p1, p0, :cond_0

    and-int/lit8 p0, p1, 0x1

    if-nez p0, :cond_0

    return-void

    .line 129
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid recovery tree configuration"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;JII)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    .line 333
    iget-object v2, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v15, v2, Ll/֨۬ᩳ;->᩷:Ll/ۤۜܽ;

    .line 334
    iget-object v14, v2, Ll/֨۬ᩳ;->ᩳ:[B

    .line 335
    iget-object v9, v2, Ll/֨۬ᩳ;->᩻:Ljava/util/zip/CRC32;

    .line 336
    invoke-virtual {v15}, Ll/ۤۜܽ;->ᩳ()V

    .line 337
    invoke-static {v15, v1}, Ll/᩸۬ᩳ;->֫(Ll/ۤۜܽ;Ll/۠۬ᩳ;)V

    .line 338
    invoke-virtual {v9}, Ljava/util/zip/CRC32;->reset()V

    .line 339
    invoke-virtual {v15}, Ll/ۤۜܽ;->size()I

    move-result v2

    const/4 v13, 0x0

    invoke-virtual {v9, v14, v13, v2}, Ljava/util/zip/CRC32;->update([BII)V

    .line 340
    array-length v2, v14

    div-int v10, v2, p6

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 341
    :goto_0
    iget v2, v8, Ll/ۧ۫ᩳ;->ܿ:I

    if-ge v4, v2, :cond_0

    sub-int/2addr v2, v4

    .line 342
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v11

    add-int v12, v4, v11

    const/4 v7, 0x0

    .line 343
    iget-boolean v3, v1, Ll/۠۬ᩳ;->ᩳ:Z

    move-object/from16 v2, p2

    move-object v5, v14

    move v6, v12

    invoke-virtual/range {v2 .. v7}, Ll/ۧ۫ᩳ;->֫(ZI[BII)V

    mul-int v11, v11, p6

    .line 344
    invoke-virtual {v9, v14, v13, v11}, Ljava/util/zip/CRC32;->update([BII)V

    move v4, v12

    goto :goto_0

    .line 347
    :cond_0
    invoke-virtual {v9}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v3, v2

    .line 348
    invoke-virtual {v15}, Ll/ۤۜܽ;->ᩳ()V

    const/4 v10, 0x1

    .line 349
    iget-wide v11, v1, Ll/۠۬ᩳ;->ܽ:J

    move-object v9, v15

    const/16 v16, 0x0

    move/from16 v13, p5

    move-object v7, v14

    move v14, v3

    invoke-static/range {v9 .. v14}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;IJII)V

    .line 351
    invoke-static {v15, v1}, Ll/᩸۬ᩳ;->֫(Ll/ۤۜܽ;Ll/۠۬ᩳ;)V

    .line 352
    invoke-virtual {v15}, Ll/ۤۜܽ;->size()I

    move-result v2

    const/4 v3, 0x0

    move-wide/from16 v9, p3

    move v13, v2

    const/4 v4, 0x0

    .line 354
    :goto_1
    iget v2, v8, Ll/ۧ۫ᩳ;->ܿ:I

    iget-object v11, v0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    if-ge v4, v2, :cond_2

    sub-int/2addr v2, v4

    .line 355
    array-length v3, v7

    sub-int/2addr v3, v13

    div-int v3, v3, p6

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int v14, v4, v12

    .line 356
    iget-boolean v3, v1, Ll/۠۬ᩳ;->ᩳ:Z

    move-object/from16 v2, p2

    move-object v5, v7

    move v6, v14

    move-object v0, v7

    move v7, v13

    invoke-virtual/range {v2 .. v7}, Ll/ۧ۫ᩳ;->֫(ZI[BII)V

    mul-int v12, v12, p6

    add-int/2addr v12, v13

    .line 359
    array-length v2, v0

    if-ne v12, v2, :cond_1

    .line 360
    check-cast v11, Ll/ܺ۬ᩳ;

    invoke-virtual {v11, v9, v10, v12, v0}, Ll/ܺ۬ᩳ;->֫(JI[B)V

    int-to-long v2, v12

    add-long/2addr v9, v2

    const/4 v2, 0x0

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    move v13, v12

    :goto_2
    move-object v7, v0

    move v4, v14

    move-object/from16 v0, p0

    goto :goto_1

    :cond_2
    move-object v0, v7

    .line 365
    array-length v1, v0

    sub-int/2addr v1, v13

    const/16 v2, 0x10

    if-ge v1, v2, :cond_3

    .line 366
    move-object v1, v11

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1, v9, v10, v13, v0}, Ll/ܺ۬ᩳ;->֫(JI[B)V

    int-to-long v1, v13

    add-long/2addr v9, v1

    const/4 v13, 0x0

    .line 370
    :cond_3
    invoke-virtual {v15, v13}, Ll/ۤۜܽ;->֫(I)V

    const-wide/16 v1, -0x1

    .line 371
    invoke-virtual {v15, v1, v2}, Ll/ۤۜܽ;->seek(J)V

    move-wide/from16 v1, p3

    move/from16 v3, p5

    .line 372
    invoke-static {v15, v1, v2, v3}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;JI)V

    .line 373
    invoke-virtual {v15}, Ll/ۤۜܽ;->size()I

    move-result v1

    check-cast v11, Ll/ܺ۬ᩳ;

    invoke-virtual {v11, v9, v10, v1, v0}, Ll/ܺ۬ᩳ;->֫(JI[B)V

    return-void
.end method

.method public static ֫(Ll/ۤۜܽ;Ll/۠۬ᩳ;)V
    .locals 1

    .line 377
    iget v0, p1, Ll/۠۬ᩳ;->ۧ:I

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 378
    iget v0, p1, Ll/۠۬ᩳ;->ܿ:I

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 379
    iget v0, p1, Ll/۠۬ᩳ;->ܳ:I

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 380
    iget-boolean p1, p1, Ll/۠۬ᩳ;->ᩳ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸۬ᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩸۬ᩳ;->᩸:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩸۬ᩳ;)Ll/ۚ۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸۬ᩳ;->᩶:Ll/ۚ۬ᩳ;

    return-object p0
.end method

.method public static ۧ(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;
    .locals 14

    const/16 v6, 0x40

    :try_start_0
    new-array v0, v6, [B

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, v0

    .line 105
    invoke-interface/range {v1 .. v6}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    .line 106
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 107
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, 0x3244544d

    if-ne v2, v3, :cond_3

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    .line 108
    new-instance v9, Ljava/util/UUID;

    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v4

    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-direct {v9, v4, v5, v6, v7}, Ljava/util/UUID;-><init>(JJ)V

    .line 109
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    .line 110
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    .line 111
    invoke-static {v7, v8}, Ll/᩸۬ᩳ;->֫(II)V

    const-wide/16 v4, 0x0

    cmp-long v2, v10, v4

    if-lez v2, :cond_2

    .line 112
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v6, 0x0

    const/16 v12, 0x28

    invoke-static {v6, v12, v0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v0

    if-ne v2, v0, :cond_2

    .line 115
    :goto_0
    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v12

    cmp-long v0, v12, v4

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported recovery file header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_1
    new-instance v0, Ll/᩸۬ᩳ;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v4 .. v11}, Ll/᩸۬ᩳ;-><init>(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;IILjava/util/UUID;J)V

    .line 117
    invoke-interface {p0}, Ll/ۤ۬ᩳ;->length()J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩸۬ᩳ;->ܽ֫:J

    .line 118
    iput-boolean v3, v0, Ll/᩸۬ᩳ;->۟:Z

    return-object v0

    .line 113
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery file header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported recovery file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    move-object v1, v0

    .line 121
    :try_start_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 122
    :goto_2
    throw v1
.end method

.method public static bridge synthetic ܽ(Ll/᩸۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸۬ᩳ;->᩶:Ll/ۚ۬ᩳ;

    return-void
.end method

.method private ᩴ()V
    .locals 2

    .line 535
    iget-boolean v0, p0, Ll/᩸۬ᩳ;->۟:Z

    if-nez v0, :cond_1

    .line 536
    iget-boolean v0, p0, Ll/᩸۬ᩳ;->᩹:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery append requires reopening after I/O failure"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 535
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery validation is required before append"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 576
    monitor-enter v0

    .line 577
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۬ᩳ;->ܰ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 578
    iput-boolean v1, p0, Ll/᩸۬ᩳ;->ܰ:Z

    .line 579
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 580
    invoke-virtual {p0}, Ll/᩸۬ᩳ;->᩻()V

    return-void

    :catchall_0
    move-exception v1

    .line 579
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(IIZLjava/util/function/Supplier;)Ll/۠۬ᩳ;
    .locals 16

    move-object/from16 v11, p0

    move/from16 v0, p2

    move/from16 v12, p3

    .line 255
    iget v1, v11, Ll/᩸۬ᩳ;->ۗ:I

    invoke-static {v1, v0, v12}, Ll/ۧ۫ᩳ;->֫(IIZ)J

    move-result-wide v1

    iget-object v13, v11, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v13, v1, v2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v14

    .line 256
    :try_start_0
    invoke-interface/range {p4 .. p4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ll/ۧ۫ᩳ;

    .line 257
    new-instance v10, Ll/۠۬ᩳ;

    invoke-virtual/range {p0 .. p0}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v3

    iget v7, v11, Ll/᩸۬ᩳ;->ۗ:I

    const-wide/16 v5, -0x1

    move-object v1, v10

    move-object/from16 v2, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move-object v11, v10

    move/from16 v10, p3

    invoke-direct/range {v1 .. v10}, Ll/۠۬ᩳ;-><init>(Ll/᩸۬ᩳ;JJIIIZ)V

    .line 258
    iget v1, v15, Ll/ۧ۫ᩳ;->ܿ:I

    move/from16 v2, p1

    if-ne v1, v2, :cond_0

    iget v1, v15, Ll/ۧ۫ᩳ;->᩻:I

    if-ne v1, v0, :cond_0

    invoke-virtual {v15}, Ll/ۧ۫ᩳ;->ܽ()Z

    move-result v0

    if-ne v0, v12, :cond_0

    .line 261
    invoke-virtual {v13, v11, v15, v14}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;Ll/ۚ۬ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    invoke-virtual {v14}, Ll/ۚ۬ᩳ;->close()V

    return-object v11

    .line 259
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid text page statistics"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 255
    :try_start_2
    invoke-virtual {v14}, Ll/ۚ۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public final ֫(Ll/ۧ۫ᩳ;)Ll/۠۬ᩳ;
    .locals 11

    .line 276
    invoke-virtual {p1}, Ll/ۧ۫ᩳ;->ۧ()I

    move-result v0

    iget v1, p0, Ll/᩸۬ᩳ;->ۗ:I

    if-ne v0, v1, :cond_2

    .line 278
    invoke-virtual {p1}, Ll/ۧ۫ᩳ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 279
    :goto_0
    iget v1, p1, Ll/ۧ۫ᩳ;->ܿ:I

    if-ge v0, v1, :cond_1

    .line 280
    invoke-virtual {p1, v0}, Ll/ۧ۫ᩳ;->֫(I)C

    move-result v1

    const/16 v2, 0xff

    if-le v1, v2, :cond_0

    const/4 v0, 0x0

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/4 v10, 0x1

    .line 283
    :goto_1
    new-instance v0, Ll/۠۬ᩳ;

    invoke-virtual {p0}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v3

    iget v8, p1, Ll/ۧ۫ᩳ;->ܿ:I

    iget v9, p1, Ll/ۧ۫ᩳ;->᩻:I

    const-wide/16 v5, -0x1

    iget v7, p0, Ll/᩸۬ᩳ;->ۗ:I

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v10}, Ll/۠۬ᩳ;-><init>(Ll/᩸۬ᩳ;JJIIIZ)V

    .line 284
    invoke-virtual {p0, v0, p1}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V

    return-object v0

    .line 276
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Incompatible copied page capacity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۠۬ᩳ;Ll/֡۬ᩳ;)Ll/ۧ۫ᩳ;
    .locals 3

    if-nez p2, :cond_0

    .line 398
    iget-object p2, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object p2, p2, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 399
    :try_start_0
    iget-object p2, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, p2, Ll/֨۬ᩳ;->ᩳ:[B

    iget-object v2, p2, Ll/֨۬ᩳ;->ۜ:Ll/۬ۜܽ;

    iget-object p2, p2, Ll/֨۬ᩳ;->᩻:Ljava/util/zip/CRC32;

    invoke-direct {p0, p1, v1, v2, p2}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;[BLl/۬ۜܽ;Ljava/util/zip/CRC32;)Ll/ۧ۫ᩳ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 400
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 402
    :cond_0
    iget-object v0, p2, Ll/֡۬ᩳ;->֫:[B

    iget-object v1, p2, Ll/֡۬ᩳ;->ܽ:Ll/۬ۜܽ;

    iget-object p2, p2, Ll/֡۬ᩳ;->ۧ:Ljava/util/zip/CRC32;

    invoke-direct {p0, p1, v0, v1, p2}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;[BLl/۬ۜܽ;Ljava/util/zip/CRC32;)Ll/ۧ۫ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ܶ۬ᩳ;
    .locals 8

    .line 175
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 176
    :try_start_0
    invoke-direct {p0}, Ll/᩸۬ᩳ;->ᩴ()V

    .line 177
    iget v1, p0, Ll/᩸۬ᩳ;->᩸:I

    if-eqz v1, :cond_0

    .line 178
    new-instance v2, Ll/ܶ۬ᩳ;

    invoke-direct {v2, p0}, Ll/ܶ۬ᩳ;-><init>(Ll/᩸۬ᩳ;)V

    add-int/lit8 v1, v1, 0x1

    .line 179
    iput v1, p0, Ll/᩸۬ᩳ;->᩸:I

    .line 180
    monitor-exit v0

    return-object v2

    .line 182
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 183
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v0}, Ll/֨۬ᩳ;->ܽ()J

    move-result-wide v0

    const-wide/16 v2, 0x20

    div-long/2addr v0, v2

    const-wide/32 v2, 0x10000

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    const/16 v0, 0x2000

    const/4 v2, 0x0

    if-lt v1, v0, :cond_1

    .line 187
    :try_start_1
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    int-to-long v3, v1

    const-wide/16 v5, 0x17

    add-long/2addr v3, v5

    const-wide/16 v5, -0x8

    and-long/2addr v3, v5

    invoke-virtual {v0, v3, v4}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0
    :try_end_1
    .catch Ll/ۘ۬ᩳ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UncheckedIOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v0

    goto :goto_0

    :catch_0
    :cond_1
    move-object v3, v2

    .line 193
    :goto_0
    :try_start_2
    new-instance v4, Ll/ܶ۬ᩳ;

    invoke-direct {v4, p0}, Ll/ܶ۬ᩳ;-><init>(Ll/᩸۬ᩳ;)V

    if-nez v3, :cond_2

    move-object v1, v2

    goto :goto_1

    .line 194
    :cond_2
    new-array v0, v1, [B

    move-object v1, v0

    .line 195
    :goto_1
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 196
    :try_start_3
    invoke-direct {p0}, Ll/᩸۬ᩳ;->ᩴ()V

    .line 197
    iget v5, p0, Ll/᩸۬ᩳ;->᩸:I

    if-nez v5, :cond_3

    .line 198
    iget-object v5, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v5, Ll/ܺ۬ᩳ;

    iget-wide v6, p0, Ll/᩸۬ᩳ;->ܽ֫:J

    invoke-virtual {v5, v6, v7, v1}, Ll/ܺ۬ᩳ;->֫(J[B)V

    .line 199
    iput-object v3, p0, Ll/᩸۬ᩳ;->᩶:Ll/ۚ۬ᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :cond_3
    move-object v2, v3

    .line 202
    :goto_2
    :try_start_4
    iget v1, p0, Ll/᩸۬ᩳ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩸۬ᩳ;->᩸:I

    .line 203
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v2, :cond_4

    .line 206
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V

    :cond_4
    return-object v4

    :catchall_0
    move-exception v1

    move-object v3, v2

    goto :goto_3

    :catchall_1
    move-exception v1

    .line 204
    :goto_3
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v3, :cond_5

    .line 206
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V

    .line 207
    :cond_5
    throw v0

    :catchall_3
    move-exception v1

    .line 182
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v1
.end method

.method public final ֫(JJ)V
    .locals 4

    .line 155
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 156
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۬ᩳ;->۟:Z

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x40

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    iget-wide v1, p0, Ll/᩸۬ᩳ;->ܽ֫:J

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-lez v3, :cond_0

    .line 159
    iget-object v1, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1, p1, p2}, Ll/ܺ۬ᩳ;->truncate(J)V

    .line 160
    iput-wide p1, p0, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    :try_start_1
    iget-object p1, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast p1, Ll/ܺ۬ᩳ;

    invoke-virtual {p1}, Ll/ܺ۬ᩳ;->ܺ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    :try_start_2
    iget-object p1, p0, Ll/᩸۬ᩳ;->᩺:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1, p3, p4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    const/4 p1, 0x0

    .line 168
    iput-boolean p1, p0, Ll/᩸۬ᩳ;->۟:Z

    .line 169
    iput-boolean p1, p0, Ll/᩸۬ᩳ;->᩹:Z

    .line 170
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    .line 164
    iput-boolean p2, p0, Ll/᩸۬ᩳ;->᩹:Z

    .line 165
    throw p1

    .line 157
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid recovery acceptance"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 170
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V
    .locals 21

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    .line 290
    iget-object v1, v8, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, v1, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v16, v1

    monitor-enter v16

    .line 291
    :try_start_0
    iget-wide v1, v0, Ll/۠۬ᩳ;->᩻:J

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-ltz v6, :cond_0

    monitor-exit v16

    return-void

    .line 292
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/᩸۬ᩳ;->ᩴ()V

    .line 293
    iget-boolean v1, v0, Ll/۠۬ᩳ;->ᩳ:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    const/4 v7, 0x2

    .line 294
    :goto_0
    iget v1, v3, Ll/ۧ۫ᩳ;->ܿ:I

    mul-int v1, v1, v7

    add-int/lit8 v13, v1, 0x10

    add-int/lit8 v9, v1, 0x30

    add-int/lit8 v15, v1, 0x40

    .line 296
    iget-wide v11, v8, Ll/᩸۬ᩳ;->ܽ֫:J

    .line 297
    iget-object v1, v8, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v10, v1, Ll/֨۬ᩳ;->᩷:Ll/ۤۜܽ;

    .line 298
    iget-object v14, v1, Ll/֨۬ᩳ;->ᩳ:[B

    .line 299
    iget-object v6, v1, Ll/֨۬ᩳ;->᩻:Ljava/util/zip/CRC32;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    :try_start_1
    array-length v1, v14
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt v15, v1, :cond_2

    .line 303
    :try_start_2
    invoke-virtual {v10}, Ll/ۤۜܽ;->ᩳ()V

    const/16 v7, 0x20

    .line 304
    invoke-virtual {v10, v7}, Ll/ۤۜܽ;->֫(I)V

    const-wide/16 v4, -0x1

    .line 305
    invoke-virtual {v10, v4, v5}, Ll/ۤۜܽ;->seek(J)V

    .line 306
    invoke-static {v10, v0}, Ll/᩸۬ᩳ;->֫(Ll/ۤۜܽ;Ll/۠۬ᩳ;)V

    .line 307
    iget v2, v3, Ll/ۧ۫ᩳ;->ܿ:I

    invoke-virtual {v10}, Ll/ۤۜܽ;->size()I

    move-result v17
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-boolean v1, v0, Ll/۠۬ᩳ;->ᩳ:Z

    const/16 v18, 0x0

    move/from16 v19, v1

    move-object/from16 v1, p2

    move/from16 v20, v2

    move/from16 v2, v19

    move/from16 v3, v18

    move-object v4, v14

    move/from16 v5, v20

    move-object/from16 p2, v6

    move/from16 v6, v17

    invoke-virtual/range {v1 .. v6}, Ll/ۧ۫ᩳ;->֫(ZI[BII)V

    .line 308
    invoke-virtual/range {p2 .. p2}, Ljava/util/zip/CRC32;->reset()V

    move-object/from16 v1, p2

    .line 309
    invoke-virtual {v1, v14, v7, v13}, Ljava/util/zip/CRC32;->update([BII)V

    .line 310
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    .line 311
    invoke-virtual {v10, v9}, Ll/ۤۜܽ;->֫(I)V

    const-wide/16 v3, -0x1

    .line 312
    invoke-virtual {v10, v3, v4}, Ll/ۤۜܽ;->seek(J)V

    .line 313
    invoke-static {v10, v11, v12, v13}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;JI)V

    const-wide/16 v3, 0x0

    .line 314
    invoke-virtual {v10, v3, v4}, Ll/ۤۜܽ;->seek(J)V

    .line 315
    iget-wide v3, v0, Ll/۠۬ᩳ;->ܽ:J
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v1, 0x1

    move-object v9, v10

    move v10, v1

    move-wide v5, v11

    move-wide v11, v3

    move-object v1, v14

    move v14, v2

    :try_start_4
    invoke-static/range {v9 .. v14}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;IJII)V

    .line 317
    iget-object v2, v8, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v2, Ll/ܺ۬ᩳ;

    invoke-virtual {v2, v5, v6, v15, v1}, Ll/ܺ۬ᩳ;->֫(JI[B)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-wide v9, v5

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-wide v5, v11

    :goto_1
    move-object v1, v0

    move-wide v9, v5

    goto :goto_4

    :catch_2
    move-exception v0

    move-wide v5, v11

    move-wide v9, v5

    goto :goto_3

    :cond_2
    move-wide v5, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide v9, v5

    move-wide v4, v9

    move v6, v13

    .line 319
    :try_start_5
    invoke-direct/range {v1 .. v7}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;JII)V

    :goto_2
    int-to-long v1, v15

    add-long/2addr v1, v9

    .line 321
    iput-wide v1, v8, Ll/᩸۬ᩳ;->ܽ֫:J

    .line 322
    iput-wide v9, v0, Ll/۠۬ᩳ;->᩻:J
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 327
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-void

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    move-wide v9, v11

    :goto_3
    move-object v1, v0

    .line 541
    :goto_4
    :try_start_7
    iget-object v0, v8, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v0, Ll/ܺ۬ᩳ;

    invoke-virtual {v0, v9, v10}, Ll/ܺ۬ᩳ;->truncate(J)V

    .line 542
    iput-wide v9, v8, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_5

    :catch_5
    move-exception v0

    const/4 v2, 0x1

    .line 544
    :try_start_8
    iput-boolean v2, v8, Ll/᩸۬ᩳ;->᩹:Z

    .line 545
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 325
    :goto_5
    throw v1

    :catchall_0
    move-exception v0

    .line 327
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method public final ֫(JLl/۟۬ᩳ;)[B
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    .line 524
    iget-object v2, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v2, v2, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object v12, v2

    monitor-enter v12

    .line 525
    :try_start_0
    iget v2, v0, Ll/۟۬ᩳ;->ܽ:I

    const/16 v3, 0x2000

    if-gt v2, v3, :cond_2

    .line 526
    new-array v9, v2, [B

    .line 527
    iget-object v3, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    const-wide/16 v4, 0x20

    add-long v10, p1, v4

    check-cast v3, Ll/ܺ۬ᩳ;

    const/4 v7, 0x0

    move-wide v4, v10

    move-object v6, v9

    move v8, v2

    invoke-virtual/range {v3 .. v8}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    .line 528
    sget v3, Ll/֫۫ᩳ;->֫:I

    .line 139
    iget v3, v0, Ll/۟۬ᩳ;->ܽ:I

    if-ne v2, v3, :cond_1

    const/4 v3, 0x0

    invoke-static {v3, v2, v9}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v3

    iget v0, v0, Ll/۟۬ᩳ;->ۧ:I

    if-ne v3, v0, :cond_1

    const/16 v0, 0x10

    new-array v3, v0, [B

    int-to-long v4, v2

    add-long/2addr v10, v4

    .line 486
    iget-object v2, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    move-object v13, v2

    check-cast v13, Ll/ܺ۬ᩳ;

    const/16 v17, 0x0

    move-wide v14, v10

    move-object/from16 v16, v3

    move/from16 v18, v0

    invoke-virtual/range {v13 .. v18}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    int-to-long v4, v0

    add-long/2addr v10, v4

    .line 487
    invoke-static {v10, v11, v3}, Ll/֫۫ᩳ;->֫(J[B)J

    move-result-wide v2

    cmp-long v0, v2, p1

    if-nez v0, :cond_0

    .line 530
    monitor-exit v12

    return-object v9

    .line 488
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery footer reference"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery payload checksum"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 525
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Recovery metadata record is too large"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 531
    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ۖ()V
    .locals 3

    .line 243
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 244
    :try_start_0
    invoke-direct {p0}, Ll/᩸۬ᩳ;->ᩴ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    :try_start_1
    iget-object v1, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1}, Ll/ܺ۬ᩳ;->ܺ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    .line 248
    iput-boolean v2, p0, Ll/᩸۬ᩳ;->᩹:Z

    .line 249
    throw v1

    :catchall_0
    move-exception v1

    .line 251
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۘ()Ll/ۗ᩻᩵;
    .locals 1

    .line 555
    iget-object v0, p0, Ll/᩸۬ᩳ;->۬:Ll/ۗ᩻᩵;

    return-object v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Ll/᩸۬ᩳ;->۟:Z

    return v0
.end method

.method public final ۧ(J)Ll/۟۬ᩳ;
    .locals 7

    const/16 v5, 0x20

    new-array v6, v5, [B

    const-wide/16 v0, 0x40

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 474
    iget-wide v0, p0, Ll/᩸۬ᩳ;->ܽ֫:J

    int-to-long v2, v5

    sub-long/2addr v0, v2

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    const/4 v4, 0x0

    .line 475
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v0, Ll/ܺ۬ᩳ;

    move-wide v1, p1

    move-object v3, v6

    invoke-virtual/range {v0 .. v5}, Ll/ܺ۬ᩳ;->֫(J[BII)V

    .line 61
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, v6}, Ll/۬ۜܽ;-><init>([B)V

    invoke-static {v0}, Ll/֫۫ᩳ;->֫(Ll/۬ۜܽ;)Ll/۟۬ᩳ;

    move-result-object v0

    .line 477
    iget v1, v0, Ll/۟۬ᩳ;->ܽ:I

    int-to-long v1, v1

    const-wide/16 v3, 0x30

    add-long/2addr v1, v3

    iget-wide v3, p0, Ll/᩸۬ᩳ;->ܽ֫:J

    sub-long/2addr v3, p1

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    return-object v0

    .line 478
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Truncated recovery record"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 474
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid recovery record offset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()J
    .locals 2

    .line 140
    iget-object v0, p0, Ll/᩸۬ᩳ;->᩺:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()J
    .locals 3

    .line 148
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 149
    :try_start_0
    iget-wide v1, p0, Ll/᩸۬ᩳ;->ܽ֫:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 150
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ(J[BII)J
    .locals 14

    move-object v1, p0

    move-object/from16 v0, p3

    move/from16 v8, p5

    .line 498
    iget-object v2, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v2, v2, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object v13, v2

    monitor-enter v13

    .line 499
    :try_start_0
    invoke-direct {p0}, Ll/᩸۬ᩳ;->ᩴ()V

    if-ltz v8, :cond_0

    .line 500
    array-length v2, v0

    if-gt v8, v2, :cond_0

    const/16 v2, 0x2000

    if-gt v8, v2, :cond_0

    .line 501
    iget-wide v9, v1, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    .line 503
    :try_start_1
    invoke-static {v2, v8, v0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v7

    .line 504
    iget-object v3, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v11, v3, Ll/֨۬ᩳ;->᩷:Ll/ۤۜܽ;

    .line 505
    iget-object v12, v3, Ll/֨۬ᩳ;->ᩳ:[B

    const/16 v3, 0x20

    .line 507
    invoke-static {v0, v2, v12, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 508
    invoke-virtual {v11}, Ll/ۤۜܽ;->ᩳ()V

    add-int/lit8 v0, v8, 0x20

    .line 509
    invoke-virtual {v11, v0}, Ll/ۤۜܽ;->֫(I)V

    move-object v2, v11

    move/from16 v3, p4

    move-wide v4, p1

    move/from16 v6, p5

    .line 510
    invoke-static/range {v2 .. v7}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;IJII)V

    const-wide/16 v2, -0x1

    .line 511
    invoke-virtual {v11, v2, v3}, Ll/ۤۜܽ;->seek(J)V

    .line 512
    invoke-static {v11, v9, v10, v8}, Ll/֫۫ᩳ;->֫(Ll/ۤۜܽ;JI)V

    .line 513
    iget-object v0, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    invoke-virtual {v11}, Ll/ۤۜܽ;->size()I

    move-result v2

    check-cast v0, Ll/ܺ۬ᩳ;

    invoke-virtual {v0, v9, v10, v2, v12}, Ll/ܺ۬ᩳ;->֫(JI[B)V

    .line 514
    invoke-virtual {v11}, Ll/ۤۜܽ;->size()I

    move-result v0

    int-to-long v2, v0

    add-long/2addr v2, v9

    iput-wide v2, v1, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 515
    :try_start_2
    monitor-exit v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-wide v9

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 541
    :try_start_3
    iget-object v0, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v0, Ll/ܺ۬ᩳ;

    invoke-virtual {v0, v9, v10}, Ll/ܺ۬ᩳ;->truncate(J)V

    .line 542
    iput-wide v9, v1, Ll/᩸۬ᩳ;->ܽ֫:J
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_1
    move-exception v0

    const/4 v3, 0x1

    .line 544
    :try_start_4
    iput-boolean v3, v1, Ll/᩸۬ᩳ;->᩹:Z

    .line 545
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 518
    :goto_0
    throw v2

    .line 500
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Recovery metadata record is too large"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 520
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final ᩳ()J
    .locals 5

    .line 134
    iget-object v0, p0, Ll/᩸۬ᩳ;->᩺:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-wide v0

    .line 135
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Page identity exhausted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final declared-synchronized ᩺ۧ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 550
    :try_start_0
    iget-boolean v1, p0, Ll/᩸۬ᩳ;->۫:Z

    if-nez v1, :cond_0

    .line 551
    iget v1, p0, Ll/᩸۬ᩳ;->֫֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩸۬ᩳ;->֫֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    monitor-exit v0

    return-void

    .line 550
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Page store is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 552
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩻()V
    .locals 3

    move-object v0, p0

    .line 558
    monitor-enter v0

    .line 559
    :try_start_0
    iget v1, p0, Ll/᩸۬ᩳ;->֫֫:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iput v1, p0, Ll/᩸۬ᩳ;->֫֫:I

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 560
    :cond_0
    iput-boolean v2, p0, Ll/᩸۬ᩳ;->۫:Z

    .line 561
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 563
    :try_start_1
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v0, p0}, Ll/֨۬ᩳ;->֫(Ll/᩸۬ᩳ;)V

    .line 564
    iget-object v0, p0, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v0, Ll/ܺ۬ᩳ;

    invoke-virtual {v0}, Ll/ܺ۬ᩳ;->close()V

    .line 565
    iget-object v0, p0, Ll/᩸۬ᩳ;->۬:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 567
    :goto_0
    iget-object v1, p0, Ll/᩸۬ᩳ;->۬:Ll/ۗ᩻᩵;

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 568
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 569
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 570
    :cond_1
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 568
    :cond_2
    new-instance v1, Ljava/io/UncheckedIOException;

    check-cast v0, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 561
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
