.class public final Ll/ܳ᩹ᩳ;
.super Ljava/lang/Object;
.source "I6UD"


# instance fields
.field public final ֫:Ljava/lang/Runnable;

.field public final ۧ:Ll/᩸۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    .line 28
    iput-object p2, p0, Ll/ܳ᩹ᩳ;->֫:Ljava/lang/Runnable;

    return-void
.end method

.method private ֫(Ll/᩶᩹ᩳ;)J
    .locals 8

    .line 35
    iget-object v0, p0, Ll/ܳ᩹ᩳ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const-wide/16 v0, 0x0

    if-nez p1, :cond_0

    return-wide v0

    .line 37
    :cond_0
    iget-wide v2, p1, Ll/᩶᩹ᩳ;->ܿ:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_1

    iget-wide v0, p1, Ll/᩶᩹ᩳ;->ܿ:J

    return-wide v0

    .line 38
    :cond_1
    instance-of v2, p1, Ll/᩸᩹ᩳ;

    if-eqz v2, :cond_4

    .line 39
    move-object v2, p1

    check-cast v2, Ll/᩸᩹ᩳ;

    iget-object v2, v2, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    if-eqz v2, :cond_3

    .line 40
    iget-object v3, v2, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    iget-object v4, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    if-ne v3, v4, :cond_3

    .line 41
    invoke-virtual {v2}, Ll/۠۬ᩳ;->֫()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-gez v5, :cond_2

    .line 42
    iget-object v0, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v0, v2}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object v0

    .line 43
    :try_start_0
    iget-object v1, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩵۬ᩳ;->֫()Ll/ۧ۫ᩳ;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/᩸۬ᩳ;->֫(Ll/۠۬ᩳ;Ll/ۧ۫ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-virtual {v0}, Ll/᩵۬ᩳ;->close()V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 42
    :try_start_1
    invoke-virtual {v0}, Ll/᩵۬ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 46
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ll/۠۬ᩳ;->֫()J

    move-result-wide v0

    iput-wide v0, p1, Ll/᩶᩹ᩳ;->ܿ:J

    .line 47
    invoke-virtual {v2}, Ll/۠۬ᩳ;->֫()J

    move-result-wide v0

    return-wide v0

    .line 40
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Text page belongs to another store"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_4
    check-cast p1, Ll/᩻᩹ᩳ;

    .line 51
    iget-object v0, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    invoke-direct {p0, v4}, Ll/ܳ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)J

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 52
    :cond_5
    iget-object v0, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 53
    :try_start_2
    new-instance v1, Ll/ۤۜܽ;

    iget-object v3, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v3, v3

    mul-int/lit8 v3, v3, 0x10

    add-int/lit8 v3, v3, 0x10

    invoke-direct {v1, v3}, Ll/ۤۜܽ;-><init>(I)V

    .line 54
    iget v3, p1, Ll/᩶᩹ᩳ;->֫:I

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 55
    iget-object v3, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v3, v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 56
    iget v3, p1, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 57
    iget v3, p1, Ll/᩶᩹ᩳ;->ܽ:I

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 58
    iget-object v3, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v4, v3

    :goto_3
    if-ge v2, v4, :cond_6

    aget-object v5, v3, v2

    .line 59
    iget-wide v6, v5, Ll/᩶᩹ᩳ;->ܿ:J

    invoke-virtual {v1, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 60
    iget v6, v5, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v1, v6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 61
    iget v5, v5, Ll/᩶᩹ᩳ;->ܽ:I

    invoke-virtual {v1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 63
    :cond_6
    iget-object v2, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v2}, Ll/᩸۬ᩳ;->ᩳ()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    invoke-virtual {v1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v5

    invoke-virtual {v1}, Ll/ۤۜܽ;->size()I

    move-result v6

    const/4 v7, 0x2

    move-object v1, v2

    move-wide v2, v3

    move-object v4, v5

    move v5, v7

    invoke-virtual/range {v1 .. v6}, Ll/᩸۬ᩳ;->ܽ(J[BII)J

    move-result-wide v1

    .line 64
    iput-wide v1, p1, Ll/᩶᩹ᩳ;->ܿ:J

    .line 65
    monitor-exit v0

    return-wide v1

    :catchall_2
    move-exception p1

    .line 66
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p1
.end method

.method public static synthetic ֫(Ll/ܳ᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 4

    .line 81
    new-instance v0, Ll/ۨ᩹ᩳ;

    iget-object p0, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget v1, p0, Ll/᩸۬ᩳ;->ۗ:I

    iget v2, p0, Ll/᩸۬ᩳ;->ۤ:I

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, p0}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v0
.end method

.method public static synthetic ֫(Ll/ܳ᩹ᩳ;Ll/᩶᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 3

    .line 85
    new-instance v0, Ll/ۨ᩹ᩳ;

    iget-object p0, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget v1, p0, Ll/᩸۬ᩳ;->ۗ:I

    iget v2, p0, Ll/᩸۬ᩳ;->ۤ:I

    invoke-direct {v0, p1, v1, v2, p0}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v0
.end method

.method private ֫(JJIZLl/ܿ᩹ᩳ;)Ll/᩶᩹ᩳ;
    .locals 25

    move-object/from16 v9, p0

    move-wide/from16 v7, p1

    move/from16 v0, p5

    move/from16 v6, p6

    move-object/from16 v4, p7

    .line 89
    iget-object v1, v9, Ll/ܳ᩹ᩳ;->֫:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    if-ltz v0, :cond_d

    const/16 v1, 0x20

    if-gt v0, v1, :cond_d

    const-wide/16 v1, 0x40

    cmp-long v3, v7, v1

    if-ltz v3, :cond_d

    cmp-long v1, v7, p3

    if-gez v1, :cond_d

    .line 94
    iget-object v1, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, v1, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v16, v1

    monitor-enter v16

    .line 95
    :try_start_0
    iget-object v1, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v1, v7, v8}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v1

    .line 96
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const-wide/16 v2, 0x20

    add-long v11, v7, v2

    .line 97
    iget v2, v1, Ll/۟۬ᩳ;->ܽ:I

    int-to-long v2, v2

    add-long/2addr v2, v11

    const-wide/16 v13, 0x10

    add-long/2addr v2, v13

    cmp-long v5, v2, p3

    if-gtz v5, :cond_c

    .line 98
    iget-wide v2, v1, Ll/۟۬ᩳ;->֫:J

    iget-wide v13, v4, Ll/ܿ᩹ᩳ;->ۧ:J

    cmp-long v5, v2, v13

    if-gez v5, :cond_c

    .line 99
    iget-object v2, v4, Ll/ܿ᩹ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩹ᩳ;

    if-eqz v2, :cond_0

    .line 101
    invoke-direct {v9, v2, v0, v6}, Ll/ܳ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;IZ)V

    return-object v2

    .line 104
    :cond_0
    invoke-virtual/range {p7 .. p7}, Ll/ܿ᩹ᩳ;->֫()V

    const/4 v2, 0x2

    const/16 v3, 0x10

    const/4 v5, 0x1

    if-nez v0, :cond_5

    .line 107
    iget v10, v1, Ll/۟۬ᩳ;->ᩳ:I

    if-ne v10, v5, :cond_4

    iget v10, v1, Ll/۟۬ᩳ;->ܽ:I

    if-lt v10, v3, :cond_4

    const/16 v10, 0x10

    new-array v15, v10, [B

    .line 109
    iget-object v10, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v10, v10, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v10, v10, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    move-object/from16 v16, v10

    monitor-enter v16

    .line 110
    :try_start_1
    iget-object v10, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v10, v10, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    const/4 v14, 0x0

    const/16 v17, 0x10

    move-object v13, v15

    move-object v3, v15

    move/from16 v15, v17

    invoke-interface/range {v10 .. v15}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    .line 111
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 112
    new-instance v10, Ll/۬ۜܽ;

    invoke-direct {v10, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 113
    invoke-virtual {v10}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    invoke-virtual {v10}, Ll/۬ۜܽ;->readInt()I

    move-result v14

    invoke-virtual {v10}, Ll/۬ۜܽ;->readInt()I

    move-result v15

    invoke-virtual {v10}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    .line 114
    iget-object v11, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget v12, v11, Ll/᩸۬ᩳ;->ۗ:I

    if-ne v3, v12, :cond_3

    if-lt v14, v5, :cond_3

    if-gt v14, v3, :cond_3

    if-ltz v15, :cond_3

    if-gt v15, v14, :cond_3

    if-eq v10, v5, :cond_1

    if-ne v10, v2, :cond_3

    :cond_1
    iget v2, v1, Ll/۟۬ᩳ;->ܽ:I

    mul-int v12, v14, v10

    const/16 v13, 0x10

    add-int/2addr v12, v13

    if-ne v2, v12, :cond_3

    .line 118
    new-instance v2, Ll/۠۬ᩳ;

    iget-wide v12, v1, Ll/۟۬ᩳ;->֫:J

    if-ne v10, v5, :cond_2

    const/4 v1, 0x1

    const/16 v19, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/16 v19, 0x0

    :goto_0
    move-object v10, v2

    move v1, v14

    move v5, v15

    move-wide/from16 v14, p1

    move/from16 v16, v3

    move/from16 v17, v1

    move/from16 v18, v5

    invoke-direct/range {v10 .. v19}, Ll/۠۬ᩳ;-><init>(Ll/᩸۬ᩳ;JJIIIZ)V

    .line 120
    iget-object v1, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-virtual {v1, v2}, Ll/֨۬ᩳ;->֫(Ll/۠۬ᩳ;)Ll/᩵۬ᩳ;

    move-result-object v1

    .line 121
    :try_start_2
    new-instance v3, Ll/᩸᩹ᩳ;

    iget-object v5, v4, Ll/ܿ᩹ᩳ;->ᩳ:Ljava/lang/Object;

    invoke-direct {v3, v5, v2}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;Ll/۠۬ᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    invoke-virtual {v1}, Ll/᩵۬ᩳ;->close()V

    move v1, v0

    move-object v0, v4

    move v12, v6

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 120
    :try_start_3
    invoke-virtual {v1}, Ll/᩵۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2

    .line 116
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery text page shape"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 111
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    .line 107
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing recovery text page"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_5
    iget v3, v1, Ll/۟۬ᩳ;->ᩳ:I

    if-ne v3, v2, :cond_b

    iget v3, v1, Ll/۟۬ᩳ;->ܽ:I

    const/16 v10, 0x10

    if-lt v3, v10, :cond_b

    const/16 v10, 0x2000

    if-gt v3, v10, :cond_b

    .line 127
    iget-object v10, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget-object v10, v10, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    int-to-long v11, v3

    const-wide/16 v13, 0x10

    add-long/2addr v11, v13

    invoke-virtual {v10, v11, v12}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v10

    .line 128
    :try_start_5
    new-instance v11, Ll/۬ۜܽ;

    iget-object v3, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    invoke-virtual {v3, v7, v8, v1}, Ll/᩸۬ᩳ;->֫(JLl/۟۬ᩳ;)[B

    move-result-object v3

    invoke-direct {v11, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 129
    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    .line 130
    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v13

    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v14

    if-ne v3, v0, :cond_a

    if-eqz v6, :cond_6

    goto :goto_2

    .line 131
    :cond_6
    iget-object v2, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget v2, v2, Ll/᩸۬ᩳ;->ۤ:I

    div-int/lit8 v2, v2, 0x2

    :goto_2
    if-lt v12, v2, :cond_a

    iget-object v2, v9, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    iget v2, v2, Ll/᩸۬ᩳ;->ۤ:I

    if-gt v12, v2, :cond_a

    iget v1, v1, Ll/۟۬ᩳ;->ܽ:I

    mul-int/lit8 v2, v12, 0x10

    const/16 v3, 0x10

    add-int/2addr v2, v3

    if-ne v1, v2, :cond_a

    if-lt v13, v5, :cond_a

    if-ltz v14, :cond_a

    if-gt v14, v13, :cond_a

    .line 135
    new-array v15, v12, [Ll/᩶᩹ᩳ;

    const-wide/16 v16, 0x0

    const/4 v1, 0x0

    move-wide/from16 v18, v16

    move-wide/from16 v20, v18

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v12, :cond_8

    .line 138
    invoke-virtual {v11}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v2

    .line 139
    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    invoke-virtual {v11}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    add-int/lit8 v8, v0, -0x1

    const/16 v22, 0x0

    move/from16 v23, v1

    move-object/from16 v1, p0

    move/from16 v24, v5

    move-wide/from16 v4, p1

    move/from16 p3, v12

    move v12, v6

    move v6, v8

    move v8, v7

    move/from16 v7, v22

    move v0, v8

    move-object/from16 v8, p7

    .line 140
    invoke-direct/range {v1 .. v8}, Ll/ܳ᩹ᩳ;->֫(JJIZLl/ܿ᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object v1

    .line 141
    iget v2, v1, Ll/᩶᩹ᩳ;->ۧ:I

    move/from16 v3, v23

    if-ne v2, v3, :cond_7

    iget v3, v1, Ll/᩶᩹ᩳ;->ܽ:I

    if-ne v3, v0, :cond_7

    .line 142
    aput-object v1, v15, v24

    int-to-long v0, v2

    add-long v18, v18, v0

    int-to-long v0, v3

    add-long v20, v20, v0

    add-int/lit8 v5, v24, 0x1

    move-wide/from16 v7, p1

    move/from16 v0, p5

    move-object/from16 v4, p7

    move v6, v12

    move/from16 v12, p3

    goto :goto_3

    .line 141
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery child statistics do not match"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move v12, v6

    int-to-long v0, v13

    cmp-long v2, v18, v0

    if-nez v2, :cond_9

    int-to-long v0, v14

    cmp-long v2, v20, v0

    if-nez v2, :cond_9

    .line 146
    invoke-virtual {v11}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-nez v2, :cond_9

    .line 147
    new-instance v3, Ll/᩻᩹ᩳ;

    move-object/from16 v0, p7

    iget-object v1, v0, Ll/ܿ᩹ᩳ;->ᩳ:Ljava/lang/Object;

    invoke-direct {v3, v1, v15}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 148
    invoke-virtual {v10}, Ll/ۚ۬ᩳ;->close()V

    move/from16 v1, p5

    .line 150
    :goto_4
    invoke-direct {v9, v3, v1, v12}, Ll/ܳ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;IZ)V

    move-wide/from16 v1, p1

    .line 151
    iput-wide v1, v3, Ll/᩶᩹ᩳ;->ܿ:J

    .line 152
    iget-object v0, v0, Ll/ܿ᩹ᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    .line 146
    :cond_9
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery index totals"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery index shape"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 127
    :try_start_7
    invoke-virtual {v10}, Ll/ۚ۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1

    .line 125
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Missing recovery index node"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery record boundary or identity"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_5
    move-exception v0

    .line 96
    :try_start_8
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw v0

    .line 91
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid recovery tree reference"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(Ll/᩶᩹ᩳ;IZ)V
    .locals 4

    .line 157
    instance-of v0, p1, Ll/᩸᩹ᩳ;

    if-eqz v0, :cond_0

    iget v1, p1, Ll/᩶᩹ᩳ;->ۧ:I

    goto :goto_0

    :cond_0
    move-object v1, p1

    check-cast v1, Ll/᩻᩹ᩳ;

    iget-object v1, v1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v1, v1

    .line 158
    :goto_0
    iget-object v2, p0, Ll/ܳ᩹ᩳ;->ۧ:Ll/᩸۬ᩳ;

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    iget p3, v2, Ll/᩸۬ᩳ;->ۗ:I

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    goto :goto_2

    :cond_3
    iget p3, v2, Ll/᩸۬ᩳ;->ۤ:I

    :goto_1
    div-int/lit8 v3, p3, 0x2

    .line 159
    :goto_2
    iget p1, p1, Ll/᩶᩹ᩳ;->֫:I

    if-ne p1, p2, :cond_4

    if-lt v1, v3, :cond_4

    return-void

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid recovery node occupancy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ۨ᩹ᩳ;)J
    .locals 2

    .line 32
    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, p1}, Ll/ܳ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(JJIIILl/ܿ᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 12

    move-object v8, p0

    move/from16 v9, p6

    move/from16 v10, p7

    move-object/from16 v11, p8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    const/4 v2, -0x1

    move/from16 v5, p5

    if-ne v5, v2, :cond_0

    if-nez v9, :cond_0

    if-nez v10, :cond_0

    .line 81
    iget-object v2, v11, Ll/ܿ᩹ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ll/ܽ᩹ᩳ;

    invoke-direct {v1, p0}, Ll/ܽ᩹ᩳ;-><init>(Ll/ܳ᩹ᩳ;)V

    invoke-static {v2, v0, v1}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ᩳ;

    return-object v0

    .line 80
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid empty recovery root"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move/from16 v5, p5

    const/4 v6, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object/from16 v7, p8

    .line 83
    invoke-direct/range {v0 .. v7}, Ll/ܳ᩹ᩳ;->֫(JJIZLl/ܿ᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object v0

    .line 84
    iget v1, v0, Ll/᩶᩹ᩳ;->ۧ:I

    if-ne v1, v9, :cond_2

    iget v1, v0, Ll/᩶᩹ᩳ;->ܽ:I

    if-ne v1, v10, :cond_2

    .line 85
    iget-object v1, v11, Ll/ܿ᩹ᩳ;->ܿ:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ll/ᩳ᩹ᩳ;

    invoke-direct {v3, p0, v0}, Ll/ᩳ᩹ᩳ;-><init>(Ll/ܳ᩹ᩳ;Ll/᩶᩹ᩳ;)V

    invoke-static {v1, v2, v3}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ᩳ;

    return-object v0

    .line 84
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery root statistics do not match"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
