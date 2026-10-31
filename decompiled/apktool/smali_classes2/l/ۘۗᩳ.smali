.class public final Ll/ۘۗᩳ;
.super Ljava/lang/Object;
.source "I6PE"


# direct methods
.method public static ֫()Ljava/lang/IllegalArgumentException;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid inline session state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ܶۙᩳ;
    .locals 32

    move-object/from16 v0, p0

    .line 52
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->֫()I

    move-result v1

    .line 53
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    const-wide/16 v4, 0xc

    cmp-long v6, v2, v4

    if-ltz v6, :cond_7

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, 0x31535354

    if-ne v2, v3, :cond_7

    .line 54
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    if-ltz v2, :cond_6

    int-to-long v3, v2

    .line 55
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    const-wide/16 v7, 0x4

    sub-long/2addr v5, v7

    cmp-long v7, v3, v5

    if-gtz v7, :cond_6

    .line 211
    new-array v3, v2, [B

    .line 212
    invoke-virtual {v0, v2, v3}, Ll/۬ۜܽ;->֫(I[B)V

    .line 58
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 59
    iget-object v0, v0, Ll/۬ۜܽ;->᩸:[B

    add-int/lit8 v2, v2, 0x8

    invoke-static {v1, v2, v0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v0

    if-ne v4, v0, :cond_5

    .line 60
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 61
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v3

    .line 62
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    const-wide/16 v12, 0x0

    cmp-long v6, v1, v12

    if-ltz v6, :cond_4

    cmp-long v6, v3, v12

    if-ltz v6, :cond_4

    if-ltz v5, :cond_4

    const/16 v6, 0x2000

    if-gt v5, v6, :cond_4

    int-to-long v6, v5

    .line 63
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-gtz v10, :cond_4

    .line 211
    new-array v6, v5, [B

    .line 212
    invoke-virtual {v0, v5, v6}, Ll/۬ۜܽ;->֫(I[B)V

    const/4 v5, 0x0

    .line 64
    invoke-static {v5, v6}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v14

    .line 67
    :try_start_0
    new-instance v15, Ll/ᩴ᩹ᩳ;

    invoke-direct {v15, v0}, Ll/ᩴ᩹ᩳ;-><init>(Ll/۬ۜܽ;)V

    .line 68
    invoke-virtual {v15}, Ll/ᩴ᩹ᩳ;->֫()Ll/ۨ᩹ᩳ;

    move-result-object v10

    .line 69
    new-instance v11, Ll/ۚۗᩳ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    invoke-direct {v11, v5, v6}, Ll/ۚۗᩳ;-><init>(II)V

    .line 70
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v19

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v21

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v23

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v28

    .line 71
    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result v5

    and-int/lit16 v8, v5, 0xff

    const/4 v5, 0x1

    if-gt v8, v5, :cond_2

    .line 72
    invoke-virtual {v11}, Ll/ۚۗᩳ;->ܽ()I

    move-result v5

    invoke-virtual {v10}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v6

    if-gt v5, v6, :cond_2

    invoke-virtual {v11}, Ll/ۚۗᩳ;->֫()I

    move-result v5

    invoke-virtual {v10}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v6

    if-gt v5, v6, :cond_2

    .line 73
    new-instance v16, Ljava/util/HashSet;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashSet;-><init>()V

    move-object v5, v0

    move-object v6, v15

    move-object/from16 v7, v16

    move/from16 v31, v8

    move-wide/from16 v8, v28

    move-object/from16 p0, v10

    move-object/from16 v18, v11

    move-wide/from16 v10, v21

    .line 74
    invoke-static/range {v5 .. v11}, Ll/ۘۗᩳ;->֫(Ll/۬ۜܽ;Ll/ᩴ᩹ᩳ;Ljava/util/HashSet;JJ)Ll/ܺۙᩳ;

    move-result-object v26

    move-object v5, v0

    move-object v6, v15

    move-object/from16 v7, v16

    move-wide/from16 v8, v28

    move-wide/from16 v10, v21

    .line 75
    invoke-static/range {v5 .. v11}, Ll/ۘۗᩳ;->֫(Ll/۬ۜܽ;Ll/ᩴ᩹ᩳ;Ljava/util/HashSet;JJ)Ll/ܺۙᩳ;

    move-result-object v27

    .line 76
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    cmp-long v0, v5, v12

    if-nez v0, :cond_1

    .line 77
    new-instance v0, Ll/ۢ۬ᩳ;

    const/4 v5, 0x1

    move/from16 v6, v31

    if-ne v6, v5, :cond_0

    const/4 v5, 0x1

    const/16 v30, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    const/16 v30, 0x0

    :goto_0
    move-object/from16 v25, v0

    invoke-direct/range {v25 .. v30}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v5

    invoke-static {v0, v5}, Ll/ܳۗᩳ;->֫(Ll/ۢ۬ᩳ;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :try_start_2
    new-instance v7, Ll/ۖۙᩳ;

    move-object/from16 v16, v7

    move-object/from16 v17, v0

    invoke-direct/range {v16 .. v24}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    .line 81
    new-instance v11, Ll/۫᩹ᩳ;

    move-object/from16 v0, p0

    invoke-direct {v11, v0, v3, v4}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    :try_start_3
    new-instance v0, Ll/ܶۙᩳ;

    sget-object v8, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    move-object v4, v0

    move-object v5, v11

    move-object v6, v14

    move-wide v9, v1

    invoke-direct/range {v4 .. v10}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 86
    invoke-virtual {v14}, Ll/ۖۗᩳ;->close()V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    .line 79
    :try_start_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid session history"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 76
    :cond_1
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 72
    :cond_2
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :goto_1
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_3

    .line 84
    :try_start_5
    invoke-virtual {v11}, Ll/۬᩹ᩳ;->close()V

    .line 85
    :cond_3
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 86
    :goto_3
    invoke-virtual {v14}, Ll/ۖۗᩳ;->close()V

    throw v0

    .line 63
    :cond_4
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 59
    :cond_5
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 55
    :cond_6
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 53
    :cond_7
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/۬ۜܽ;Ll/ᩴ᩹ᩳ;Ljava/util/HashSet;JJ)Ll/ܺۙᩳ;
    .locals 23

    .line 91
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ltz v0, :cond_5

    int-to-long v1, v0

    .line 92
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x15

    div-long/2addr v3, v5

    cmp-long v5, v1, v3

    if-gtz v5, :cond_5

    .line 93
    new-instance v1, Ll/ܺۙᩳ;

    invoke-direct {v1}, Ll/ܺۙᩳ;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 95
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    .line 96
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    const-wide/16 v9, 0x0

    cmp-long v11, v4, v9

    if-lez v11, :cond_3

    cmp-long v11, v4, p3

    if-gez v11, :cond_3

    .line 97
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    move-object/from16 v12, p2

    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    const/4 v11, 0x1

    if-gt v3, v11, :cond_3

    if-lez v8, :cond_3

    int-to-long v13, v8

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v15

    const-wide/16 v17, 0x34

    div-long v15, v15, v17

    cmp-long v11, v13, v15

    if-gtz v11, :cond_3

    .line 98
    new-instance v11, Ll/ܺۙᩳ;

    invoke-direct {v11}, Ll/ܺۙᩳ;-><init>()V

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v8, :cond_1

    .line 100
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v15

    .line 101
    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v18

    .line 102
    new-instance v14, Ll/ۚۗᩳ;

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    invoke-direct {v14, v9, v10}, Ll/ۚۗᩳ;-><init>(II)V

    const-wide/16 v9, 0x0

    cmp-long v20, v16, v9

    if-ltz v20, :cond_0

    cmp-long v20, v18, v9

    if-ltz v20, :cond_0

    cmp-long v20, v16, p5

    if-gtz v20, :cond_0

    cmp-long v20, v18, p5

    if-gtz v20, :cond_0

    .line 104
    new-instance v9, Ll/᩺᩶ᩳ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩴ᩹ᩳ;->֫()Ll/ۨ᩹ᩳ;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Ll/ᩴ᩹ᩳ;->֫()Ll/ۨ᩹ᩳ;

    move-result-object v22

    move-object v10, v14

    move-object v14, v9

    move-object/from16 v20, v10

    invoke-direct/range {v14 .. v22}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    invoke-virtual {v11, v9}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v11

    add-int/lit8 v13, v13, 0x1

    const-wide/16 v9, 0x0

    goto :goto_1

    .line 103
    :cond_0
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 106
    :cond_1
    new-instance v10, Ll/ۡ۬ᩳ;

    if-nez v3, :cond_2

    sget-object v3, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    goto :goto_2

    :cond_2
    sget-object v3, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    :goto_2
    move-object v8, v3

    move-object v3, v10

    move-object v9, v11

    invoke-direct/range {v3 .. v9}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    invoke-virtual {v1, v10}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 97
    :cond_3
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_4
    return-object v1

    .line 92
    :cond_5
    invoke-static {}, Ll/ۘۗᩳ;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/ܶۙᩳ;Ll/ۤۜܽ;)V
    .locals 5

    .line 19
    invoke-virtual {p1}, Ll/ۤۜܽ;->size()I

    move-result v0

    const v1, 0x31535354

    .line 20
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 21
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 22
    iget-wide v1, p0, Ll/ܶۙᩳ;->᩶:J

    invoke-virtual {p1, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 23
    iget-object v1, p0, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 24
    iget-object v2, p0, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v2, v2, Ll/ۖۗᩳ;->᩸:[B

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۧ([B)V

    .line 25
    new-instance v2, Ll/᩵᩹ᩳ;

    invoke-direct {v2, p1}, Ll/᩵᩹ᩳ;-><init>(Ll/ۤۜܽ;)V

    .line 26
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩵᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)V

    .line 27
    iget-object p0, p0, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    .line 28
    iget-object v1, p0, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v1}, Ll/ۚۗᩳ;->ܽ()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    iget-object v1, p0, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v1}, Ll/ۚۗᩳ;->֫()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 29
    iget-wide v3, p0, Ll/ۖۙᩳ;->֫:J

    invoke-virtual {p1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    iget-wide v3, p0, Ll/ۖۙᩳ;->ᩳ:J

    invoke-virtual {p1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    iget-wide v3, p0, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual {p1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 30
    iget-object p0, p0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v3, p0, Ll/ۢ۬ᩳ;->ۧ:J

    invoke-virtual {p1, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 31
    iget-boolean v1, p0, Ll/ۢ۬ᩳ;->֫:Z

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 32
    iget-object v1, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-static {v1, v2, p1}, Ll/ۘۗᩳ;->֫(Ll/ܺۙᩳ;Ll/᩵᩹ᩳ;Ll/ۤۜܽ;)V

    .line 33
    iget-object p0, p0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-static {p0, v2, p1}, Ll/ۘۗᩳ;->֫(Ll/ܺۙᩳ;Ll/᩵᩹ᩳ;Ll/ۤۜܽ;)V

    .line 34
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    .line 35
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p0

    invoke-virtual {p1}, Ll/ۤۜܽ;->size()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-static {v0, v1, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result p0

    invoke-virtual {p1, p0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public static ֫(Ll/ܺۙᩳ;Ll/᩵᩹ᩳ;Ll/ۤۜܽ;)V
    .locals 6

    .line 39
    invoke-virtual {p0}, Ll/ܺۙᩳ;->ۧ()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 40
    invoke-virtual {p0}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    move-object v0, p0

    check-cast v0, Ll/᩷ۙᩳ;

    invoke-virtual {v0}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ۬ᩳ;

    .line 41
    iget-wide v1, v0, Ll/ۡ۬ᩳ;->ۧ:J

    iget-object v3, v0, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {p2, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    iget-wide v1, v0, Ll/ۡ۬ᩳ;->ܳ:J

    invoke-virtual {p2, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    iget-object v0, v0, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    sget-object v1, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p2, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 42
    invoke-virtual {v3}, Ll/ܺۙᩳ;->ۧ()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 43
    invoke-virtual {v3}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    move-object v1, v0

    check-cast v1, Ll/᩷ۙᩳ;

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩶ᩳ;

    .line 44
    iget v2, v1, Ll/᩺᩶ᩳ;->ۜ:I

    iget-object v3, v1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    invoke-virtual {p2, v2}, Ll/ۤۜܽ;->writeInt(I)V

    iget-wide v4, v1, Ll/᩺᩶ᩳ;->ܽ:J

    invoke-virtual {p2, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    iget-wide v4, v1, Ll/᩺᩶ᩳ;->ۧ:J

    invoke-virtual {p2, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 45
    invoke-virtual {v3}, Ll/ۚۗᩳ;->ܽ()I

    move-result v2

    invoke-virtual {p2, v2}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {v3}, Ll/ۚۗᩳ;->֫()I

    move-result v2

    invoke-virtual {p2, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 46
    iget-object v2, v1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {p1, v2}, Ll/᩵᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)V

    iget-object v1, v1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {p1, v1}, Ll/᩵᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)V

    goto :goto_1

    :cond_2
    return-void
.end method
