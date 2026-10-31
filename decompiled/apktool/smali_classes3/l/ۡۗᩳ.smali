.class public final Ll/ۡۗᩳ;
.super Ljava/lang/Object;
.source "86UT"


# instance fields
.field public volatile ֫:J

.field public ۧ:J

.field public final ܳ:Ll/ܳ᩹ᩳ;

.field public final ܽ:Ll/ܳۗᩳ;

.field public final ܿ:Ll/᩸۬ᩳ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;)V
    .locals 1

    .line 31
    new-instance v0, Ll/֡᩹ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, v0}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public constructor <init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 26
    iput-wide v0, p0, Ll/ۡۗᩳ;->֫:J

    .line 27
    iput-wide v0, p0, Ll/ۡۗᩳ;->ۧ:J

    .line 35
    iput-object p1, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 36
    new-instance v0, Ll/ܳ᩹ᩳ;

    invoke-direct {v0, p1, p2}, Ll/ܳ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/ۡۗᩳ;->ܳ:Ll/ܳ᩹ᩳ;

    .line 37
    new-instance v1, Ll/ܳۗᩳ;

    invoke-direct {v1, p1, v0, p2}, Ll/ܳۗᩳ;-><init>(Ll/᩸۬ᩳ;Ll/ܳ᩹ᩳ;Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/ۡۗᩳ;->ܽ:Ll/ܳۗᩳ;

    return-void
.end method

.method private ֫(JJ)J
    .locals 16

    move-object/from16 v1, p0

    move-wide/from16 v2, p3

    .line 266
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object v15, v0

    monitor-enter v15

    .line 267
    :try_start_0
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v0}, Ll/֨۬ᩳ;->ۧ()[B

    move-result-object v0

    move-wide/from16 v4, p1

    :goto_0
    sub-long v6, v4, v2

    const-wide/16 v10, 0x10

    cmp-long v8, v6, v10

    if-ltz v8, :cond_4

    .line 269
    array-length v6, v0

    int-to-long v6, v6

    sub-long v6, v4, v6

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    sub-long/2addr v4, v12

    long-to-int v14, v4

    .line 271
    iget-object v4, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v4, v4, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    const/4 v8, 0x0

    move-wide v5, v12

    move-object v7, v0

    move v9, v14

    invoke-interface/range {v4 .. v9}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    add-int/lit8 v14, v14, -0x10

    :goto_1
    if-ltz v14, :cond_2

    .line 273
    aget-byte v4, v0, v14

    const/16 v5, 0x4d

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v14, 0x1

    aget-byte v4, v0, v4

    const/16 v5, 0x32

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v14, 0x2

    aget-byte v4, v0, v4

    const/16 v5, 0x45

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v14, 0x3

    aget-byte v4, v0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v5, 0x46

    if-eq v4, v5, :cond_0

    goto :goto_2

    :cond_0
    int-to-long v4, v14

    add-long/2addr v4, v12

    add-long/2addr v4, v10

    add-int/lit8 v6, v14, 0x10

    .line 276
    :try_start_1
    invoke-static {v0, v14, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v6

    invoke-static {v4, v5, v6}, Ll/֫۫ᩳ;->֫(J[B)J

    move-result-wide v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v8, v6, v2

    if-ltz v8, :cond_1

    .line 277
    :try_start_2
    monitor-exit v15

    return-wide v4

    :catch_0
    :cond_1
    :goto_2
    add-int/lit8 v14, v14, -0x1

    goto :goto_1

    :cond_2
    cmp-long v4, v12, v2

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    const-wide/16 v4, 0xf

    add-long/2addr v4, v12

    goto :goto_0

    .line 285
    :cond_4
    :goto_3
    monitor-exit v15

    const-wide/16 v2, -0x1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public static ֫(JLl/۟۬ᩳ;)J
    .locals 2

    const-wide/16 v0, 0x20

    add-long/2addr p0, v0

    .line 261
    iget p2, p2, Ll/۟۬ᩳ;->ܽ:I

    int-to-long v0, p2

    add-long/2addr p0, v0

    const-wide/16 v0, 0x10

    add-long/2addr p0, v0

    return-wide p0
.end method

.method private ֫(Ll/᩻ۗᩳ;)Ll/ۚۙᩳ;
    .locals 7

    .line 236
    iget-wide v0, p1, Ll/᩻ۗᩳ;->ܳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    sget-object p1, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    return-object p1

    .line 237
    :cond_0
    iget-object v0, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 238
    :try_start_0
    iget-object v1, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v2, p1, Ll/᩻ۗᩳ;->ܳ:J

    invoke-virtual {v1, v2, v3}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v1

    .line 239
    iget v2, v1, Ll/۟۬ᩳ;->ᩳ:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_1

    iget-wide v2, v1, Ll/۟۬ᩳ;->֫:J

    iget-wide v4, p1, Ll/᩻ۗᩳ;->᩻:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    iget v2, v1, Ll/۟۬ᩳ;->ܽ:I

    const/16 v3, 0x1000

    if-gt v2, v3, :cond_1

    iget-wide v2, p1, Ll/᩻ۗᩳ;->ܳ:J

    .line 240
    invoke-static {v2, v3, v1}, Ll/ۡۗᩳ;->֫(JLl/۟۬ᩳ;)J

    move-result-wide v2

    iget-wide v4, p1, Ll/᩻ۗᩳ;->ۜ:J

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    .line 243
    iget-object v2, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v3, p1, Ll/᩻ۗᩳ;->ܳ:J

    invoke-virtual {v2, v3, v4, v1}, Ll/᩸۬ᩳ;->֫(JLl/۟۬ᩳ;)[B

    move-result-object p1

    invoke-static {p1}, Ll/ܺۗᩳ;->֫([B)Ll/ۚۙᩳ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 241
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Invalid recovery load reference"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 244
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۡۗᩳ;)Ll/᩸۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    return-object p0
.end method

.method private ֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;JZ)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move-wide/from16 v9, p5

    .line 66
    array-length v2, v0

    const/16 v3, 0x2000

    if-gt v2, v3, :cond_c

    const-wide/16 v2, 0x0

    cmp-long v4, v9, v2

    if-ltz v4, :cond_c

    iget-wide v4, v1, Ll/ۡۗᩳ;->֫:J

    cmp-long v6, v9, v4

    if-lez v6, :cond_c

    .line 67
    invoke-virtual/range {p1 .. p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-ltz v6, :cond_c

    invoke-virtual/range {p1 .. p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v4

    iget-wide v6, v1, Ll/ۡۗᩳ;->ۧ:J

    cmp-long v11, v4, v6

    if-ltz v11, :cond_c

    .line 70
    invoke-virtual/range {p1 .. p1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v11

    .line 71
    iget-object v4, v11, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v5, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    if-ne v4, v5, :cond_b

    .line 72
    invoke-virtual {v5}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 73
    :try_start_0
    iget-object v4, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v4}, Ll/᩸۬ᩳ;->֫()Ll/ܶ۬ᩳ;

    move-result-object v12
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 74
    :try_start_1
    iget-object v4, v1, Ll/ۡۗᩳ;->ܳ:Ll/ܳ᩹ᩳ;

    invoke-virtual {v4, v11}, Ll/ܳ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)J

    move-result-wide v13

    if-nez v8, :cond_0

    move-wide v6, v2

    goto :goto_0

    .line 75
    :cond_0
    iget-object v4, v1, Ll/ۡۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-virtual {v4, v8}, Ll/ܳۗᩳ;->֫(Ll/ۖۙᩳ;)J

    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-wide v6, v4

    :goto_0
    if-eqz p7, :cond_1

    .line 78
    :try_start_2
    iget-object v4, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v5, v4, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v5, v4}, Ll/֨۬ᩳ;->֫(Ll/᩸۬ᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    goto/16 :goto_8

    .line 79
    :cond_1
    :goto_1
    :try_start_3
    iget-object v4, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v4, v4, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v4, v4, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v16, v4

    monitor-enter v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez p4, :cond_2

    :goto_2
    move-wide v3, v2

    goto :goto_3

    .line 80
    :cond_2
    :try_start_4
    iget-object v2, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v18

    invoke-static/range {p4 .. p4}, Ll/ܺۗᩳ;->֫(Ll/ۚۙᩳ;)Ll/ۤۜܽ;

    move-result-object v3

    .line 494
    invoke-virtual {v3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v20

    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v22

    const/16 v21, 0x6

    move-object/from16 v17, v2

    invoke-virtual/range {v17 .. v22}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v2

    goto :goto_2

    .line 81
    :goto_3
    iget-object v2, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v17

    array-length v15, v0

    const/16 v19, 0x4

    move-wide/from16 v23, v3

    move-wide/from16 v3, v17

    move-object/from16 v5, p2

    move-wide/from16 v25, v6

    move/from16 v6, v19

    move v7, v15

    invoke-virtual/range {v2 .. v7}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v2

    .line 83
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ۖ()V

    .line 84
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v18

    .line 85
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ܳ()J

    move-result-wide v4

    cmp-long v0, v4, v18

    if-lez v0, :cond_a

    .line 87
    new-instance v0, Ll/ۤۜܽ;

    if-eqz p4, :cond_3

    const/16 v6, 0x68

    goto :goto_4

    :cond_3
    if-nez v8, :cond_4

    const/16 v6, 0x58

    goto :goto_4

    :cond_4
    const/16 v6, 0x60

    :goto_4
    invoke-direct {v0, v6}, Ll/ۤۜܽ;-><init>(I)V

    .line 88
    iget-object v6, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v6, v6, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v6}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 89
    iget-object v6, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v6, v6, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v6}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 90
    iget-object v6, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v6, v6, Ll/᩸۬ᩳ;->ۨ:J

    invoke-virtual {v0, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 91
    invoke-virtual {v0, v9, v10}, Ll/ۤۜܽ;->ۧ(J)V

    .line 92
    invoke-virtual/range {p1 .. p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 93
    invoke-virtual {v0, v13, v14}, Ll/ۤۜܽ;->ۧ(J)V

    .line 94
    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 95
    iget-wide v2, v1, Ll/ۡۗᩳ;->ᩳ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 96
    invoke-virtual {v0, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 97
    invoke-virtual {v11}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 98
    invoke-virtual {v11}, Ll/ۨ᩹ᩳ;->ܽ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 99
    invoke-virtual {v11}, Ll/ۨ᩹ᩳ;->֫()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    if-eqz p4, :cond_5

    const/4 v2, 0x2

    goto :goto_5

    :cond_5
    if-nez v8, :cond_6

    const/4 v2, 0x0

    goto :goto_5

    :cond_6
    const/4 v2, 0x1

    .line 100
    :goto_5
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    if-nez v8, :cond_7

    if-eqz p4, :cond_8

    :cond_7
    move-wide/from16 v2, v25

    .line 101
    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    :cond_8
    if-eqz p4, :cond_9

    move-wide/from16 v2, v23

    .line 102
    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 103
    :cond_9
    iget-object v2, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v20

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v22

    const/16 v21, 0x3

    move-object/from16 v17, v2

    invoke-virtual/range {v17 .. v22}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v2

    .line 104
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ۖ()V

    .line 106
    invoke-virtual {v12}, Ll/ܶ۬ᩳ;->close()V

    .line 107
    iput-wide v2, v1, Ll/ۡۗᩳ;->ᩳ:J

    .line 108
    invoke-virtual/range {p1 .. p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۡۗᩳ;->ۧ:J

    .line 109
    iput-wide v9, v1, Ll/ۡۗᩳ;->֫:J

    .line 110
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 111
    :try_start_5
    invoke-virtual {v12}, Ll/ܶ۬ᩳ;->close()V
    :try_end_5
    .catch Ljava/io/UncheckedIOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 114
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    return-void

    .line 86
    :cond_a
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Recovery record identity exhausted"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v1

    .line 110
    :goto_6
    :try_start_7
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object v2, v1

    :goto_7
    move-object v3, v2

    move-object v2, v0

    .line 73
    :goto_8
    :try_start_9
    invoke-virtual {v12}, Ll/ܶ۬ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_9

    :catchall_5
    move-exception v0

    move-object v4, v0

    :try_start_a
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v2
    :try_end_a
    .catch Ljava/io/UncheckedIOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :catch_0
    move-exception v0

    goto :goto_a

    :catchall_6
    move-exception v0

    move-object v3, v1

    goto :goto_b

    :catch_1
    move-exception v0

    move-object v3, v1

    .line 112
    :goto_a
    :try_start_b
    invoke-virtual {v0}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catchall_7
    move-exception v0

    .line 114
    :goto_b
    iget-object v2, v3, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->᩻()V

    .line 115
    throw v0

    .line 71
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Snapshot belongs to another recovery store"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid recovery commit state"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(JJ)Ll/᩻ۗᩳ;
    .locals 40

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    .line 206
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object v15, v0

    monitor-enter v15

    .line 207
    :try_start_0
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0, v2, v3}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v0

    .line 208
    iget v4, v0, Ll/۟۬ᩳ;->ᩳ:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_a

    iget v4, v0, Ll/۟۬ᩳ;->ܽ:I

    const/16 v5, 0x58

    const/16 v6, 0x68

    const/16 v7, 0x60

    if-eq v4, v5, :cond_0

    if-eq v4, v7, :cond_0

    if-ne v4, v6, :cond_a

    .line 209
    :cond_0
    invoke-static {v2, v3, v0}, Ll/ۡۗᩳ;->֫(JLl/۟۬ᩳ;)J

    move-result-wide v4

    cmp-long v6, v4, p3

    if-nez v6, :cond_a

    .line 212
    new-instance v4, Ll/۬ۜܽ;

    iget-object v5, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v5, v2, v3, v0}, Ll/᩸۬ᩳ;->֫(JLl/۟۬ᩳ;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Ll/۬ۜܽ;-><init>([B)V

    .line 213
    new-instance v5, Ljava/util/UUID;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    .line 214
    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    .line 215
    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v21

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v23

    .line 216
    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v25

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v27

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v33

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v35

    .line 217
    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    .line 218
    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v11

    .line 219
    iget v12, v0, Ll/۟۬ᩳ;->ܽ:I

    const/4 v13, 0x1

    const/16 v14, 0x68

    if-ne v12, v14, :cond_1

    const/4 v12, 0x2

    goto :goto_0

    :cond_1
    const/16 v14, 0x60

    if-ne v12, v14, :cond_2

    const/4 v12, 0x1

    goto :goto_0

    :cond_2
    const/4 v12, 0x0

    :goto_0
    if-ne v11, v12, :cond_9

    if-lt v11, v13, :cond_3

    .line 220
    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v16

    move-wide/from16 v29, v16

    goto :goto_1

    :cond_3
    const-wide/16 v29, 0x0

    :goto_1
    const/4 v12, 0x2

    if-ne v11, v12, :cond_4

    .line 221
    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v16

    move-wide/from16 v31, v16

    goto :goto_2

    :cond_4
    const-wide/16 v31, 0x0

    .line 222
    :goto_2
    iget-object v12, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v12, v12, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    invoke-virtual {v5, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v13, v5, Ll/᩸۬ᩳ;->ۨ:J

    cmp-long v5, v6, v13

    if-nez v5, :cond_8

    const-wide/16 v5, 0x0

    cmp-long v7, v21, v5

    if-ltz v7, :cond_8

    cmp-long v7, v23, v5

    if-ltz v7, :cond_8

    cmp-long v7, v25, v5

    if-ltz v7, :cond_8

    cmp-long v7, v25, v2

    if-gez v7, :cond_8

    const-wide/16 v13, 0x40

    cmp-long v7, v27, v13

    if-ltz v7, :cond_8

    cmp-long v7, v27, v2

    if-gez v7, :cond_8

    cmp-long v7, v33, v5

    if-ltz v7, :cond_8

    cmp-long v5, v33, v2

    if-gez v5, :cond_8

    iget-wide v5, v0, Ll/۟۬ᩳ;->֫:J

    cmp-long v0, v35, v5

    if-lez v0, :cond_8

    if-ltz v8, :cond_8

    if-ltz v9, :cond_8

    if-gt v9, v8, :cond_8

    const/4 v0, -0x1

    if-lt v10, v0, :cond_8

    const/16 v0, 0x20

    if-gt v10, v0, :cond_8

    const/4 v0, 0x1

    const-wide/16 v5, 0x0

    if-ne v11, v0, :cond_5

    cmp-long v0, v29, v5

    if-eqz v0, :cond_8

    :cond_5
    cmp-long v0, v29, v5

    if-eqz v0, :cond_6

    cmp-long v0, v29, v13

    if-ltz v0, :cond_8

    cmp-long v0, v29, v2

    if-gez v0, :cond_8

    :cond_6
    const/4 v0, 0x2

    if-ne v11, v0, :cond_7

    cmp-long v0, v31, v13

    if-ltz v0, :cond_8

    cmp-long v0, v31, v2

    if-gez v0, :cond_8

    .line 228
    :cond_7
    invoke-virtual {v4}, Ll/۬ۜܽ;->available()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_8

    .line 231
    new-instance v0, Ll/᩻ۗᩳ;

    move-object/from16 v16, v0

    move-wide/from16 v17, p1

    move-wide/from16 v19, p3

    move/from16 v37, v8

    move/from16 v38, v9

    move/from16 v39, v10

    invoke-direct/range {v16 .. v39}, Ll/᩻ۗᩳ;-><init>(JJJJJJJJJJIII)V

    monitor-exit v15

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_3

    .line 229
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery commit metadata"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 219
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery commit extension"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid recovery commit shape"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 232
    :goto_3
    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private ۧ(Ll/᩻ۗᩳ;)V
    .locals 6

    .line 248
    iget-wide v0, p1, Ll/᩻ۗᩳ;->᩷:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    iget-object v0, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 251
    :try_start_0
    iget-object v1, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v2, p1, Ll/᩻ۗᩳ;->᩷:J

    invoke-virtual {v1, v2, v3}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v1

    .line 252
    iget-wide v2, p1, Ll/᩻ۗᩳ;->᩷:J

    invoke-static {v2, v3, v1}, Ll/ۡۗᩳ;->֫(JLl/۟۬ᩳ;)J

    move-result-wide v1

    .line 253
    iget-wide v3, p1, Ll/᩻ۗᩳ;->ۜ:J

    cmp-long v5, v1, v3

    if-gtz v5, :cond_2

    .line 254
    iget-wide v3, p1, Ll/᩻ۗᩳ;->᩷:J

    invoke-direct {p0, v3, v4, v1, v2}, Ll/ۡۗᩳ;->ۧ(JJ)Ll/᩻ۗᩳ;

    move-result-object v1

    .line 255
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    iget-wide v2, v1, Ll/᩻ۗᩳ;->ۢ:J

    iget-wide v4, p1, Ll/᩻ۗᩳ;->ۢ:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, v1, Ll/᩻ۗᩳ;->ۖ:J

    iget-wide v4, p1, Ll/᩻ۗᩳ;->ۖ:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_1

    iget-wide v0, v1, Ll/᩻ۗᩳ;->᩻:J

    iget-wide v2, p1, Ll/᩻ۗᩳ;->᩻:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    :goto_0
    return-void

    .line 257
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid recovery parent order"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 253
    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Recovery parent overlaps commit"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 255
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 41
    iget-wide v0, p0, Ll/ۡۗᩳ;->֫:J

    return-wide v0
.end method

.method public final declared-synchronized ֫(Ll/᩷ۗᩳ;)Ll/ۢۗᩳ;
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 3
    monitor-enter v16

    .line 120
    :try_start_0
    iget-wide v2, v1, Ll/ۡۗᩳ;->֫:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_d

    .line 121
    iget-object v0, v1, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v2

    .line 122
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v4, 0x4000000

    sub-long v4, v2, v4

    const-wide/16 v6, 0x40

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    const/4 v0, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v12, v1

    move-object/from16 v26, v9

    move-object v11, v10

    const/4 v10, 0x0

    move-wide v8, v6

    move-wide v6, v4

    move-wide v4, v2

    :goto_0
    const-wide/16 v13, 0x30

    add-long/2addr v13, v6

    cmp-long v15, v2, v13

    if-ltz v15, :cond_b

    add-int/lit8 v13, v0, 0x1

    const v0, 0x186a0

    if-gt v13, v0, :cond_a

    .line 132
    :try_start_1
    iget-object v0, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v17, v0

    monitor-enter v17
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_12
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    const/16 v0, 0x10

    :try_start_2
    new-array v14, v0, [B

    .line 134
    iget-object v15, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v15, v15, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    int-to-long v0, v0

    sub-long v19, v2, v0

    const/16 v22, 0x0

    const/16 v23, 0x10

    move-object/from16 v18, v15

    move-object/from16 v21, v14

    :try_start_3
    invoke-interface/range {v18 .. v23}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    .line 135
    invoke-static {v2, v3, v14}, Ll/֫۫ᩳ;->֫(J[B)J

    move-result-wide v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    cmp-long v18, v14, v6

    if-ltz v18, :cond_8

    move-wide/from16 v36, v6

    .line 137
    :try_start_4
    iget-object v6, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    invoke-virtual {v6, v14, v15}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v6

    const-wide/16 v18, 0x20

    add-long v18, v14, v18

    .line 138
    iget v7, v6, Ll/۟۬ᩳ;->ܽ:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    move-wide/from16 v38, v8

    int-to-long v7, v7

    add-long v18, v18, v7

    add-long v18, v18, v0

    cmp-long v0, v18, v2

    if-nez v0, :cond_7

    .line 141
    :try_start_5
    monitor-exit v17
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 148
    :try_start_6
    iget v0, v6, Ll/۟۬ᩳ;->ᩳ:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_b

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    add-int/lit8 v10, v10, 0x1

    const/16 v0, 0x20

    if-gt v10, v0, :cond_5

    .line 152
    :try_start_7
    invoke-direct {v12, v14, v15, v2, v3}, Ll/ۡۗᩳ;->ۧ(JJ)Ll/᩻ۗᩳ;

    move-result-object v0

    .line 153
    invoke-direct {v12, v0}, Ll/ۡۗᩳ;->ۧ(Ll/᩻ۗᩳ;)V

    .line 155
    iget-object v1, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, v1, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v17, v1

    monitor-enter v17
    :try_end_7
    .catch Ll/ܰ۬ᩳ; {:try_start_7 .. :try_end_7} :catch_10
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_f
    .catch Ljava/io/UncheckedIOException; {:try_start_7 .. :try_end_7} :catch_e
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 156
    :try_start_8
    iget-object v1, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v6, v0, Ll/᩻ۗᩳ;->ܺ:J

    invoke-virtual {v1, v6, v7}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v1

    .line 157
    iget v6, v1, Ll/۟۬ᩳ;->ᩳ:I

    const/4 v7, 0x4

    if-ne v6, v7, :cond_1

    iget-wide v6, v1, Ll/۟۬ᩳ;->֫:J

    iget-wide v8, v0, Ll/᩻ۗᩳ;->᩻:J

    cmp-long v18, v6, v8

    if-gez v18, :cond_1

    iget-wide v6, v0, Ll/᩻ۗᩳ;->ܺ:J

    .line 158
    invoke-static {v6, v7, v1}, Ll/ۡۗᩳ;->֫(JLl/۟۬ᩳ;)J

    move-result-wide v6

    cmp-long v8, v6, v14

    if-gtz v8, :cond_1

    .line 161
    monitor-exit v17
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 162
    :try_start_9
    iget-object v6, v12, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v7, v0, Ll/᩻ۗᩳ;->ܺ:J

    invoke-static {v6, v7, v8, v1}, Ll/ۖۗᩳ;->֫(Ll/᩸۬ᩳ;JLl/۟۬ᩳ;)Ll/ۖۗᩳ;

    move-result-object v1
    :try_end_9
    .catch Ll/ܰ۬ᩳ; {:try_start_9 .. :try_end_9} :catch_10
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/io/UncheckedIOException; {:try_start_9 .. :try_end_9} :catch_e
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 163
    :try_start_a
    new-instance v6, Ll/ܿ᩹ᩳ;

    iget-wide v7, v0, Ll/᩻ۗᩳ;->᩻:J

    invoke-direct {v6, v7, v8}, Ll/ܿ᩹ᩳ;-><init>(J)V

    .line 164
    iget-object v7, v12, Ll/ۡۗᩳ;->ܳ:Ll/ܳ᩹ᩳ;

    iget-wide v8, v0, Ll/᩻ۗᩳ;->ۡ:J
    :try_end_a
    .catch Ll/ܰ۬ᩳ; {:try_start_a .. :try_end_a} :catch_b
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_a
    .catch Ljava/io/UncheckedIOException; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    move/from16 p1, v10

    :try_start_b
    iget v10, v0, Ll/᩻ۗᩳ;->ۧ:I
    :try_end_b
    .catch Ll/ܰ۬ᩳ; {:try_start_b .. :try_end_b} :catch_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/io/UncheckedIOException; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    move/from16 v40, v13

    :try_start_c
    iget v13, v0, Ll/᩻ۗᩳ;->ᩳ:I
    :try_end_c
    .catch Ll/ܰ۬ᩳ; {:try_start_c .. :try_end_c} :catch_b
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/io/UncheckedIOException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    move-object/from16 v41, v11

    :try_start_d
    iget v11, v0, Ll/᩻ۗᩳ;->ܿ:I

    move-object/from16 v27, v7

    move-wide/from16 v28, v8

    move-wide/from16 v30, v14

    move/from16 v32, v10

    move/from16 v33, v13

    move/from16 v34, v11

    move-object/from16 v35, v6

    invoke-virtual/range {v27 .. v35}, Ll/ܳ᩹ᩳ;->֫(JJIIILl/ܿ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v19

    .line 166
    iget-wide v7, v0, Ll/᩻ۗᩳ;->ܽ:J
    :try_end_d
    .catch Ll/ܰ۬ᩳ; {:try_start_d .. :try_end_d} :catch_b
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3
    .catch Ljava/io/UncheckedIOException; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    const-wide/16 v20, 0x0

    cmp-long v9, v7, v20

    if-eqz v9, :cond_0

    .line 168
    :try_start_e
    iget-object v9, v12, Ll/ۡۗᩳ;->ܽ:Ll/ܳۗᩳ;

    iget v10, v0, Ll/᩻ۗᩳ;->ᩳ:I

    move-object/from16 v27, v9

    move-wide/from16 v28, v7

    move-wide/from16 v30, v14

    move/from16 v32, v10

    move-object/from16 v33, v6

    invoke-virtual/range {v27 .. v33}, Ll/ܳۗᩳ;->֫(JJILl/ܿ᩹ᩳ;)Ll/ۖۙᩳ;

    move-result-object v6
    :try_end_e
    .catch Ll/ܰ۬ᩳ; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/UncheckedIOException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    .line 172
    :goto_1
    :try_start_f
    new-instance v2, Ll/ۜۗᩳ;

    const-string v3, "Recovery history validation failed"

    .line 306
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    throw v2

    :catch_2
    move-exception v0

    .line 170
    throw v0

    :cond_0
    const/4 v6, 0x0

    :goto_2
    move-object/from16 v21, v6

    .line 175
    invoke-direct {v12, v0}, Ll/ۡۗᩳ;->֫(Ll/᩻ۗᩳ;)Ll/ۚۙᩳ;

    move-result-object v22

    .line 176
    new-instance v6, Ll/ۢۗᩳ;

    sub-long v24, v4, v2

    move-object/from16 v17, v6

    move-object/from16 v18, v12

    move-object/from16 v20, v1

    move-object/from16 v23, v0

    move-object/from16 v27, v41

    invoke-direct/range {v17 .. v27}, Ll/ۢۗᩳ;-><init>(Ll/ۡۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;Ll/᩻ۗᩳ;JLjava/io/IOException;Ljava/io/IOException;)V
    :try_end_f
    .catch Ll/ܰ۬ᩳ; {:try_start_f .. :try_end_f} :catch_b
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_3
    .catch Ljava/io/UncheckedIOException; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 178
    monitor-exit v16

    return-object v6

    :catch_3
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v0

    move-object/from16 v41, v11

    goto :goto_4

    :catch_6
    move-exception v0

    move-object/from16 v41, v11

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_3

    :catch_8
    move-exception v0

    goto :goto_5

    :catch_9
    move-exception v0

    move/from16 p1, v10

    :goto_3
    move-object/from16 v41, v11

    move/from16 v40, v13

    :goto_4
    move/from16 v10, p1

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    goto :goto_a

    :catch_a
    move-exception v0

    move/from16 p1, v10

    :goto_5
    move-object/from16 v41, v11

    move/from16 v40, v13

    :goto_6
    move/from16 v10, p1

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    goto/16 :goto_c

    :catch_b
    move-exception v0

    goto/16 :goto_e

    :cond_1
    move/from16 p1, v10

    move-object/from16 v41, v11

    move/from16 v40, v13

    .line 159
    :try_start_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery state reference"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_7

    :catchall_1
    move-exception v0

    move/from16 p1, v10

    move-object/from16 v41, v11

    move/from16 v40, v13

    :goto_7
    move/from16 v10, p1

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    .line 161
    :goto_8
    :try_start_11
    monitor-exit v17
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    :try_start_12
    throw v0
    :try_end_12
    .catch Ll/ܰ۬ᩳ; {:try_start_12 .. :try_end_12} :catch_10
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_d
    .catch Ljava/io/UncheckedIOException; {:try_start_12 .. :try_end_12} :catch_c
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    :catch_c
    move-exception v0

    goto :goto_9

    :catch_d
    move-exception v0

    goto :goto_b

    :catchall_2
    move-exception v0

    goto :goto_8

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    goto :goto_f

    :catch_e
    move-exception v0

    move/from16 p1, v10

    move-object/from16 v41, v11

    move/from16 v40, v13

    move/from16 v10, p1

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    :goto_9
    const/4 v1, 0x0

    .line 185
    :goto_a
    :try_start_13
    invoke-virtual {v0}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object v0

    if-eqz v1, :cond_3

    goto :goto_d

    :catch_f
    move-exception v0

    move/from16 p1, v10

    move-object/from16 v41, v11

    move/from16 v40, v13

    move/from16 v10, p1

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    :goto_b
    const/4 v1, 0x0

    .line 183
    :goto_c
    instance-of v2, v0, Ll/ۜۗᩳ;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v2, :cond_2

    if-nez v11, :cond_2

    move-object v11, v0

    :cond_2
    if-eqz v1, :cond_3

    .line 187
    :goto_d
    :try_start_14
    invoke-virtual {v1}, Ll/ۖۗᩳ;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    :cond_3
    move-object/from16 v26, v0

    move v0, v13

    move-wide v2, v14

    goto/16 :goto_15

    :catchall_4
    move-exception v0

    goto :goto_f

    :catch_10
    move-exception v0

    const/4 v1, 0x0

    .line 180
    :goto_e
    :try_start_15
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    :goto_f
    if-eqz v1, :cond_4

    .line 187
    :try_start_16
    invoke-virtual {v1}, Ll/ۖۗᩳ;->close()V

    .line 188
    :cond_4
    throw v0

    .line 149
    :cond_5
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "Recovery commit scan limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    :cond_6
    move-object/from16 v41, v11

    move/from16 v40, v13

    move-wide v2, v14

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v0, v40

    goto/16 :goto_15

    :catchall_5
    move-exception v0

    goto :goto_11

    :cond_7
    move-object/from16 v41, v11

    move/from16 v40, v13

    const-wide/16 v20, 0x0

    .line 139
    :try_start_17
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery footer size does not match header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_6
    move-exception v0

    goto :goto_10

    :cond_8
    move-wide/from16 v36, v6

    move-wide/from16 v38, v8

    move-object/from16 v41, v11

    move/from16 v40, v13

    const-wide/16 v20, 0x0

    .line 136
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery scan boundary reached"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_12

    :catchall_8
    move-exception v0

    move-wide/from16 v36, v6

    :goto_10
    move-wide/from16 v38, v8

    :goto_11
    move-object/from16 v41, v11

    move/from16 v40, v13

    const-wide/16 v20, 0x0

    goto :goto_12

    :catchall_9
    move-exception v0

    move-wide/from16 v36, v6

    move-wide/from16 v38, v8

    goto :goto_11

    :goto_12
    move-wide/from16 v14, v20

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v13, v40

    move-object/from16 v11, v41

    .line 141
    :goto_13
    :try_start_18
    monitor-exit v17
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    :try_start_19
    throw v0
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_11
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    :catch_11
    move-exception v0

    move-object/from16 v26, v0

    move v0, v13

    goto :goto_14

    :catchall_a
    move-exception v0

    goto :goto_13

    :catch_12
    move-exception v0

    move-wide/from16 v36, v6

    move-wide/from16 v38, v8

    move-object/from16 v41, v11

    move/from16 v40, v13

    const-wide/16 v20, 0x0

    move-object/from16 v26, v0

    move-wide/from16 v14, v20

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v0, v40

    move-object/from16 v11, v41

    :goto_14
    const-wide/16 v17, 0x1

    sub-long v2, v2, v17

    .line 144
    :try_start_1a
    invoke-direct {v12, v2, v3, v6, v7}, Ll/ۡۗᩳ;->֫(JJ)J

    move-result-wide v2

    cmp-long v1, v2, v14

    if-gez v1, :cond_9

    move-object/from16 v0, v26

    goto :goto_16

    :cond_9
    :goto_15
    move-object/from16 v1, p0

    goto/16 :goto_0

    .line 128
    :cond_a
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "Recovery record scan limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 128
    throw v0

    :cond_b
    move-wide/from16 v36, v6

    move-wide/from16 v38, v8

    move-object/from16 v0, v26

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    .line 192
    :goto_16
    new-instance v1, Ljava/io/IOException;

    cmp-long v2, v6, v8

    if-lez v2, :cond_c

    const-string v2, "No valid commit within recovery scan limit"

    goto :goto_17

    :cond_c
    const-string v2, "No valid recovery commit"

    .line 193
    :goto_17
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 120
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Journal already initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_b
    move-exception v0

    .line 193
    monitor-exit v16
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    throw v0
.end method

.method public final declared-synchronized ֫(Ll/ۢۗᩳ;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 197
    :try_start_0
    invoke-static {p1}, Ll/ۢۗᩳ;->ۧ(Ll/ۢۗᩳ;)Ll/ۡۗᩳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    iget-object v1, p1, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;

    if-eqz v1, :cond_0

    iget-wide v1, p0, Ll/ۡۗᩳ;->֫:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 198
    invoke-static {p1}, Ll/ۢۗᩳ;->֫(Ll/ۢۗᩳ;)Ll/᩻ۗᩳ;

    move-result-object p1

    .line 199
    iget-object v1, p0, Ll/ۡۗᩳ;->ܿ:Ll/᩸۬ᩳ;

    iget-wide v2, p1, Ll/᩻ۗᩳ;->֫:J

    iget-wide v4, p1, Ll/᩻ۗᩳ;->᩻:J

    invoke-virtual {v1, v2, v3, v4, v5}, Ll/᩸۬ᩳ;->֫(JJ)V

    .line 200
    iget-wide v1, p1, Ll/᩻ۗᩳ;->ۜ:J

    iput-wide v1, p0, Ll/ۡۗᩳ;->ᩳ:J

    .line 201
    iget-wide v1, p1, Ll/᩻ۗᩳ;->ۖ:J

    iput-wide v1, p0, Ll/ۡۗᩳ;->ۧ:J

    .line 202
    iget-wide v1, p1, Ll/᩻ۗᩳ;->ۢ:J

    iput-wide v1, p0, Ll/ۡۗᩳ;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit v0

    return-void

    .line 197
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid recovered journal state"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 61
    :try_start_0
    sget-object v5, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
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

.method public final declared-synchronized ֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    .locals 9

    move-object v0, p0

    monitor-enter v0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    .line 56
    :try_start_0
    invoke-direct/range {v1 .. v8}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
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
