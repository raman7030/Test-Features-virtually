.class public final Ll/ۨ᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"


# instance fields
.field public ֫:Ll/ۗ᩻᩵;

.field public ۖ:I

.field public final ۘ:Ll/᩻۬ᩳ;

.field public ۜ:Ll/ۗ᩻᩵;

.field public final ۡ:Ll/᩻ᩴᩳ;

.field public ۢ:Ll/ۤᩴᩳ;

.field public final ۧ:Ll/֨֫ܿ;

.field public ܳ:Ll/ۨܶᩳ;

.field public ܺ:Z

.field public ܽ:Ll/᩹ᩴᩳ;

.field public ܿ:Ll/ܰۘᩳ;

.field public ᩳ:Ll/ۗ᩻᩵;

.field public final ᩴ:Ll/ۙ֫ܿ;

.field public ᩷:I

.field public ᩻:Ll/ۗ᩻᩵;


# direct methods
.method public constructor <init>(Ll/᩻۬ᩳ;Ll/ۙ֫ܿ;Ll/ۤᩴᩳ;Ll/᩻ᩴᩳ;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ۨ᩵ᩳ;->ۖ:I

    const-wide/16 v0, 0x0

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩵ᩳ;->᩻:Ll/ۗ᩻᩵;

    .line 61
    iput-object p1, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    iput-object p2, p0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    iput-object p3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iput-object p4, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    .line 62
    new-instance p1, Ll/֨֫ܿ;

    invoke-direct {p1, p2}, Ll/֨֫ܿ;-><init>(Ll/۟᩺ᩳ;)V

    iput-object p1, p0, Ll/ۨ᩵ᩳ;->ۧ:Ll/֨֫ܿ;

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 541
    invoke-static {p0, p1}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۨ᩵ᩳ;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 536
    :try_start_0
    iget-object p0, p0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {p0}, Ll/ۙ֫ܿ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p0

    .line 537
    invoke-static {p1, p0}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۨ᩵ᩳ;)Ll/ۗ᩻᩵;
    .locals 0

    .line 511
    iget-object p0, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {p0}, Ll/᩻۬ᩳ;->ᩴ()Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v8, p4

    move-object/from16 v1, p6

    const-string v2, "app-pages"

    .line 47
    invoke-interface {v0, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ll/ܳ۠ᩴ;

    sget-object v4, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 79
    invoke-static/range {p0 .. p0}, Ll/ܰۘᩳ;->ۧ(Ll/᩷۠ᩴ;)Ll/ܰۘᩳ;

    move-result-object v0

    new-instance v1, Ll/ۜ֡ᩳ;

    invoke-direct {v1, v9, v10, v11}, Ll/ۜ֡ᩳ;-><init>(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;)V

    move-object/from16 v12, p5

    invoke-virtual {v0, v1, v8, v12}, Ll/ܰۘᩳ;->֫(Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v12, p5

    .line 81
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    invoke-static/range {p3 .. p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-ltz v8, :cond_6

    .line 84
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 88
    :try_start_0
    invoke-static/range {p0 .. p2}, Ll/᩻۬ᩳ;->ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/ܿ۬ᩳ;

    move-result-object v14
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_7

    .line 89
    :try_start_1
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v1, :cond_1

    .line 90
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->ܳ()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/util/UUID;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    .line 92
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->֫()[B

    move-result-object v1

    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->ܳ()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v1}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;[B)Ll/ۨۙᩳ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    .line 95
    :try_start_3
    invoke-static {v14, v0, v9, v8}, Ll/ۛᩴᩳ;->֫(Ll/ܿ۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ۛᩴᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛᩴᩳ;->֫()Ll/ۤᩴᩳ;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    :try_start_4
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 97
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->ܽ()Ll/᩻۬ᩳ;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 98
    :try_start_5
    invoke-virtual {v2}, Ll/᩻۬ᩳ;->ᩳ֫()V

    .line 99
    new-instance v3, Ll/ۙ֫ܿ;

    invoke-direct {v3, v2}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    const/4 v13, 0x0

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    const/4 v3, 0x0

    const/4 v13, 0x0

    goto/16 :goto_10

    .line 102
    :cond_2
    :try_start_6
    invoke-static {v14, v0, v9, v8}, Ll/ᩴۘᩳ;->֫(Ll/ܿ۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ᩴۘᩳ;

    move-result-object v15

    iget-object v7, v15, Ll/ᩴۘᩳ;->ܿ:Ll/ۛܰᩳ;

    .line 103
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 83
    :try_start_7
    iget-object v1, v15, Ll/ᩴۘᩳ;->ܽ:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v2

    iget-object v3, v15, Ll/ᩴۘᩳ;->ᩳ:Ll/᩺ܶᩳ;

    invoke-static {v7}, Ll/ۗ֫ܿ;->֫(Ll/ۛܰᩳ;)Ll/ۗ֫ܿ;

    move-result-object v4

    iget-object v5, v15, Ll/ᩴۘᩳ;->ۧ:[B

    iget-object v1, v15, Ll/ᩴۘᩳ;->֫:[B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_12

    move-object/from16 v16, v1

    move-object v1, v6

    move-object v13, v6

    move-object/from16 v6, v16

    move-object/from16 v16, v7

    move/from16 v7, p4

    :try_start_8
    invoke-static/range {v1 .. v7}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object v18
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_11

    .line 105
    :try_start_9
    invoke-virtual/range {v18 .. v18}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v1

    invoke-static {v1, v8, v13}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_e

    .line 106
    :try_start_a
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 107
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->ܳ()Ljava/util/UUID;

    move-result-object v2

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-virtual/range {v18 .. v18}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 108
    invoke-virtual/range {v18 .. v18}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v1

    array-length v1, v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    int-to-long v4, v1

    int-to-long v7, v8

    move-object/from16 v1, p0

    move-object v12, v6

    move-wide v6, v7

    move-object/from16 v8, p1

    .line 107
    :try_start_b
    invoke-static/range {v1 .. v8}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֨۬ᩳ;)Ll/ۨۙᩳ;

    move-result-object v1

    .line 109
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 110
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->ܽ()Ll/᩻۬ᩳ;

    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 111
    :try_start_c
    invoke-virtual {v2}, Ll/᩻۬ᩳ;->ᩳ֫()V

    .line 112
    new-instance v3, Ll/ۙ֫ܿ;

    invoke-virtual/range {v16 .. v16}, Ll/ۛܰᩳ;->֫()J

    move-result-wide v4

    invoke-direct {v3, v2, v4, v5}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;J)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 113
    :try_start_d
    invoke-virtual {v2}, Ll/᩻۬ᩳ;->ܳ()Ll/۟ۗᩳ;

    move-result-object v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 114
    :try_start_e
    invoke-virtual {v4}, Ll/۟ۗᩳ;->֫()[B

    move-result-object v5

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v6

    invoke-static {v5, v1, v6}, Ll/۠֫ܿ;->֫([BLl/ۨۙᩳ;Ljava/util/UUID;)[B

    move-result-object v1

    invoke-virtual {v4, v1}, Ll/۟ۗᩳ;->ۧ([B)J

    move-result-wide v5

    .line 115
    invoke-virtual {v2, v5, v6}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 116
    :try_start_f
    invoke-virtual {v4}, Ll/۟ۗᩳ;->close()V

    .line 117
    iget-object v1, v15, Ll/ᩴۘᩳ;->ᩳ:Ll/᩺ܶᩳ;

    invoke-virtual {v12, v2, v1}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 118
    :try_start_10
    invoke-virtual {v12}, Ll/ۛᩴᩳ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :try_start_11
    invoke-virtual/range {v18 .. v18}, Ll/۫ᩴᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :try_start_12
    invoke-virtual {v13}, Ll/۬᩹ᩳ;->close()V

    .line 120
    :goto_1
    iget-object v4, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    invoke-virtual {v4, v2}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;)V

    .line 121
    invoke-static/range {p5 .. p5}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 122
    new-instance v4, Ll/ۨ᩵ᩳ;

    new-instance v5, Ll/᩻ᩴᩳ;

    invoke-direct {v5, v2, v0, v9, v11}, Ll/᩻ᩴᩳ;-><init>(Ll/᩻۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ljava/util/concurrent/Executor;)V

    invoke-direct {v4, v2, v3, v1, v5}, Ll/ۨ᩵ᩳ;-><init>(Ll/᩻۬ᩳ;Ll/ۙ֫ܿ;Ll/ۤᩴᩳ;Ll/᩻ᩴᩳ;)V

    .line 124
    iget-object v0, v4, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    new-instance v5, Ll/ۜ֡ᩳ;

    invoke-direct {v5, v9, v10, v11}, Ll/ۜ֡ᩳ;-><init>(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;)V

    iput-object v5, v0, Ll/᩻ᩴᩳ;->ۖ:Ll/ۜ֡ᩳ;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 126
    :try_start_13
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    :goto_2
    move-object v13, v1

    goto/16 :goto_15

    :catchall_3
    move-exception v0

    move-object v13, v3

    :goto_3
    move-object v3, v13

    move-object v13, v2

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_c

    :catchall_5
    move-exception v0

    move-object/from16 v17, v1

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v1, v0

    .line 113
    :try_start_14
    invoke-virtual {v4}, Ll/۟ۗᩳ;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception v0

    move-object v4, v0

    :try_start_15
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    :catchall_8
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :catchall_9
    move-exception v0

    move-object v1, v0

    goto :goto_6

    :catchall_a
    move-exception v0

    goto :goto_5

    :catchall_b
    move-exception v0

    move-object v12, v6

    :goto_5
    move-object v1, v0

    const/4 v2, 0x0

    :goto_6
    const/4 v3, 0x0

    .line 103
    :goto_7
    :try_start_16
    invoke-virtual {v12}, Ll/ۛᩴᩳ;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    goto :goto_8

    :catchall_c
    move-exception v0

    move-object v4, v0

    :try_start_17
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    :catchall_d
    move-exception v0

    const/16 v17, 0x0

    :goto_9
    move-object v1, v0

    move-object/from16 v19, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v19

    goto :goto_a

    :catchall_e
    move-exception v0

    move-object v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    :goto_a
    :try_start_18
    invoke-virtual/range {v18 .. v18}, Ll/۫ᩴᩳ;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    goto :goto_b

    :catchall_f
    move-exception v0

    move-object v4, v0

    :try_start_19
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    :catchall_10
    move-exception v0

    move-object v1, v2

    :goto_c
    move-object v2, v1

    move-object v1, v0

    goto :goto_e

    :catchall_11
    move-exception v0

    goto :goto_d

    :catchall_12
    move-exception v0

    move-object v13, v6

    :goto_d
    move-object v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    :goto_e
    :try_start_1a
    invoke-virtual {v13}, Ll/۬᩹ᩳ;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    goto :goto_f

    :catchall_13
    move-exception v0

    move-object v4, v0

    :try_start_1b
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_14

    :catchall_14
    move-exception v0

    move-object v1, v2

    move-object/from16 v13, v17

    :goto_10
    move-object/from16 v17, v1

    move-object v1, v0

    goto :goto_12

    :catch_3
    move-exception v0

    .line 93
    :try_start_1c
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid fragment recovery metadata"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    :goto_11
    move-object v1, v0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    .line 88
    :goto_12
    :try_start_1d
    invoke-virtual {v14}, Ll/ܿ۬ᩳ;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_15

    goto :goto_13

    :catchall_15
    move-exception v0

    move-object v2, v0

    :try_start_1e
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v1
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_1e .. :try_end_1e} :catch_5
    .catch Ljava/lang/Error; {:try_start_1e .. :try_end_1e} :catch_4

    :catch_4
    move-exception v0

    goto :goto_14

    :catch_5
    move-exception v0

    goto :goto_14

    :catch_6
    move-exception v0

    :goto_14
    move-object v2, v13

    move-object/from16 v13, v17

    :goto_15
    move-object v1, v0

    move-object/from16 v17, v3

    goto :goto_17

    :catch_7
    move-exception v0

    goto :goto_16

    :catch_8
    move-exception v0

    goto :goto_16

    :catch_9
    move-exception v0

    :goto_16
    move-object v1, v0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_17
    if-eqz v13, :cond_3

    .line 127
    invoke-virtual {v13}, Ll/ۤᩴᩳ;->close()V

    :cond_3
    if-eqz v17, :cond_4

    .line 129
    :try_start_1f
    invoke-virtual/range {v17 .. v17}, Ll/ۙ֫ܿ;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_16

    goto :goto_18

    :catchall_16
    move-exception v0

    move-object v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_18
    if-eqz v2, :cond_5

    .line 132
    :try_start_20
    invoke-virtual {v2}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_17

    goto :goto_19

    :catchall_17
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 134
    :cond_5
    :goto_19
    throw v1

    .line 83
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative fragment state limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/ۜ֡ᩳ;)Ll/ۨ᩵ᩳ;
    .locals 6

    .line 140
    iget-object v0, p1, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v1, p1, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    invoke-static {p0, v0, v1}, Ll/᩻۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/᩻۬ᩳ;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ᩳ֫()V

    .line 142
    new-instance v1, Ll/ۨ᩵ᩳ;

    new-instance v2, Ll/ۙ֫ܿ;

    invoke-direct {v2, v0}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;)V

    new-instance v3, Ll/᩻ᩴᩳ;

    iget-object v4, p1, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v5, p1, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    invoke-direct {v3, v0, p0, v4, v5}, Ll/᩻ᩴᩳ;-><init>(Ll/᩻۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ljava/util/concurrent/Executor;)V

    const/4 p0, 0x0

    invoke-direct {v1, v0, v2, p0, v3}, Ll/ۨ᩵ᩳ;-><init>(Ll/᩻۬ᩳ;Ll/ۙ֫ܿ;Ll/ۤᩴᩳ;Ll/᩻ᩴᩳ;)V

    .line 144
    iget-object p0, v1, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    iput-object p1, p0, Ll/᩻ᩴᩳ;->ۖ:Ll/ۜ֡ᩳ;

    return-object v1
.end method

.method private ֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move/from16 v2, p5

    .line 301
    iget-object v3, v1, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    iget-object v4, v1, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {v4}, Ll/᩻ᩴᩳ;->ᩳ()Ll/᩷۠ᩴ;

    move-result-object v4

    .line 302
    :try_start_0
    invoke-virtual {v3}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 303
    :try_start_1
    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v5

    array-length v5, v5

    int-to-long v5, v5

    const-wide/16 v7, 0x4

    mul-long v5, v5, v7

    const-wide/32 v7, 0x8000

    add-long/2addr v5, v7

    invoke-virtual {v13, v5, v6}, Ll/۫᩹ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 304
    :try_start_2
    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v5

    invoke-static {v5, v2, v13}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 305
    :try_start_3
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 306
    invoke-virtual {v3}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v6

    new-instance v7, Ljava/io/ByteArrayInputStream;

    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v5

    array-length v5, v5

    int-to-long v8, v5

    int-to-long v10, v2

    move-object/from16 v2, p4

    iget-object v12, v2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    move-object v5, v4

    invoke-static/range {v5 .. v12}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֨۬ᩳ;)Ll/ۨۙᩳ;

    move-result-object v2

    .line 307
    invoke-virtual {v3}, Ll/᩻۬ᩳ;->ܳ()Ll/۟ۗᩳ;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 308
    :try_start_4
    invoke-virtual {v5}, Ll/۟ۗᩳ;->֫()[B

    move-result-object v6

    invoke-virtual {v3}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v7

    invoke-static {v6, v2, v7}, Ll/۠֫ܿ;->֫([BLl/ۨۙᩳ;Ljava/util/UUID;)[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/۟ۗᩳ;->ۧ([B)J

    move-result-wide v6

    .line 309
    invoke-virtual {v3, v6, v7}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v2

    iput-object v2, v1, Ll/ۨ᩵ᩳ;->᩻:Ll/ۗ᩻᩵;

    if-nez p7, :cond_0

    .line 310
    invoke-virtual {v2}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 311
    :cond_0
    :try_start_5
    invoke-virtual {v5}, Ll/۟ۗᩳ;->close()V

    move-object/from16 v2, p1

    .line 313
    invoke-static {v4, v2}, Ll/ۢ֡ᩳ;->֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V

    .line 314
    iget-object v4, v1, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz v4, :cond_1

    .line 315
    iget-object v4, v1, Ll/ۨ᩵ᩳ;->᩻:Ll/ۗ᩻᩵;

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 316
    iget-object v6, v1, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    iget v7, v1, Ll/ۨ᩵ᩳ;->᩷:I

    iget-object v4, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v4}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v9

    iget v10, v0, Ll/᩺ܶᩳ;->ܽ:I

    iget-object v4, v15, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iget-object v5, v1, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    invoke-virtual {v5}, Ll/ܰۘᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۗ֫ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v8, p1

    invoke-virtual/range {v6 .. v11}, Ll/ܰۘᩳ;->֫(ILandroid/os/Bundle;ZILjava/lang/String;)V

    .line 318
    :cond_1
    invoke-virtual {v15, v3, v0}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;

    move-result-object v0

    .line 323
    iget-object v2, v1, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    .line 324
    iput-object v0, v1, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    if-eqz v2, :cond_2

    .line 325
    invoke-virtual {v2}, Ll/ۤᩴᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 319
    :cond_2
    :try_start_6
    invoke-virtual {v15}, Ll/ۛᩴᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-eqz v14, :cond_3

    :try_start_7
    invoke-virtual {v14}, Ll/ۚ۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :cond_3
    :try_start_8
    invoke-virtual {v13}, Ll/۬᩹ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 307
    :try_start_9
    invoke-virtual {v5}, Ll/۟ۗᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 302
    :try_start_b
    invoke-virtual {v15}, Ll/ۛᩴᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    if-eqz v14, :cond_4

    :try_start_d
    invoke-virtual {v14}, Ll/ۚ۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_f
    invoke-virtual {v13}, Ll/۬᩹ᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_3

    :catchall_7
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :catchall_8
    move-exception v0

    move-object v2, v0

    :try_start_11
    invoke-virtual/range {p3 .. p3}, Ll/۫ᩴᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    goto :goto_4

    :catchall_9
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
.end method

.method private ֫(Ljava/lang/Throwable;)V
    .locals 3

    move-object v0, p0

    .line 55
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ܽ:Ll/᩹ᩴᩳ;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/ۨ᩵ᩳ;->ܽ:Ll/᩹ᩴᩳ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 56
    invoke-virtual {v1, p1}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 55
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ll/ۗܶᩳ;ZLl/ۧ᩸ᩳ;IILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)V
    .locals 20

    move-object/from16 v9, p0

    move-object/from16 v0, p3

    .line 403
    iget-object v1, v0, Ll/ۧ᩸ᩳ;->ᩳ:Ljava/lang/CharSequence;

    invoke-static/range {p7 .. p7}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 404
    iget-object v8, v9, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v8}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    const-string v3, ""

    const/4 v10, 0x0

    invoke-virtual {v8, v10, v2, v3}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;

    iget-object v11, v9, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v11}, Ll/᩻۬ᩳ;->ۘ()V

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 405
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v6, v2, :cond_1

    .line 406
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    int-to-long v2, v2

    int-to-long v4, v6

    const-wide/16 v12, 0x1000

    add-long/2addr v12, v4

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v12, v2

    .line 407
    iget-object v7, v0, Ll/ۧ᩸ᩳ;->ᩳ:Ljava/lang/CharSequence;

    .line 424
    invoke-static/range {p7 .. p7}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 425
    invoke-virtual {v8}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    int-to-long v2, v2

    int-to-long v13, v12

    add-long/2addr v2, v13

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x7fffffff

    cmp-long v13, v2, v4

    if-gtz v13, :cond_0

    .line 426
    invoke-virtual {v8}, Ll/ۤ᩸ᩳ;->length()I

    move-result v3

    invoke-virtual {v8}, Ll/ۤ᩸ᩳ;->length()I

    move-result v4

    move-object v2, v8

    move-object v5, v7

    move v7, v12

    invoke-virtual/range {v2 .. v7}, Ll/ۙ֫ܿ;->ۧ(IILjava/lang/CharSequence;II)V

    .line 428
    invoke-virtual {v11}, Ll/᩻۬ᩳ;->ۘ()V

    move v6, v12

    goto :goto_0

    .line 425
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Reloaded text exceeds coordinate limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 410
    :cond_1
    invoke-virtual {v11}, Ll/᩻۬ᩳ;->᩸()V

    .line 233
    invoke-virtual {v8, v10, v10}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    .line 410
    invoke-virtual {v8, v10}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 411
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v2

    const-string v1, "changed"

    .line 412
    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "error"

    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "e2SourcePending"

    .line 413
    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-nez p2, :cond_2

    .line 414
    move-object/from16 v1, p1

    check-cast v1, Ll/ۙܶᩳ;

    .line 73
    iget-object v1, v1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    const-string v1, "fileTime"

    .line 414
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "checkFileExists"

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 416
    :cond_2
    invoke-virtual {v11}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1

    .line 417
    :try_start_0
    iget-object v3, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v12, v3, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v15, v0, Ll/ۧ᩸ᩳ;->ܽ:Ll/᩺ܶᩳ;

    iget-object v3, v0, Ll/ۧ᩸ᩳ;->֫:Ljava/lang/String;

    const/16 v19, 0x1

    move-object v13, v1

    move-object v14, v2

    move-object/from16 v16, v3

    move/from16 v17, p4

    move/from16 v18, p5

    invoke-virtual/range {v12 .. v19}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;IIZ)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    .line 419
    iget-object v3, v0, Ll/ۧ᩸ᩳ;->ܽ:Ll/᩺ܶᩳ;

    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object/from16 v5, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 416
    :try_start_1
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
.end method

.method public static ֫(Ll/ۨ᩵ᩳ;Ll/ۗ᩻᩵;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 513
    invoke-static {p2, p3}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p2

    move-object v0, p0

    .line 330
    monitor-enter v0

    :try_start_0
    iget-object p3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    .line 331
    invoke-virtual {p3}, Ll/ۤᩴᩳ;->close()V

    .line 515
    :cond_0
    invoke-direct {p0, p2}, Ll/ۨ᩵ᩳ;->֫(Ljava/lang/Throwable;)V

    if-nez p2, :cond_1

    .line 560
    invoke-virtual {p1, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 561
    :cond_1
    instance-of p0, p2, Ll/۬᩻᩵;

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :cond_2
    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 330
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 466
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Fragment recovery is canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֡ᩴᩳ;Ll/ۜ֡ᩳ;)V
    .locals 12

    .line 471
    iget-object v2, p2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v3, p2, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    iget-object v4, p2, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    new-instance v6, Ll/ۨۘᩳ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/high16 v5, 0x800000

    move-object v1, p0

    .line 72
    invoke-static/range {v1 .. v7}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;

    move-result-object v9

    const/high16 v6, 0x800000

    iget-object v10, v9, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    const/4 v11, 0x0

    .line 474
    :try_start_0
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v2

    .line 475
    invoke-virtual {p1, v2}, Ll/֡ᩴᩳ;->֫(Landroid/os/Bundle;)V

    .line 477
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 478
    :try_start_1
    iget-object v3, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v4, v3, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v3, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    invoke-virtual {v4, v1, v2, v3}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 479
    :try_start_2
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    .line 480
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v1, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    new-instance v7, Ll/ۨۘᩳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    move-object v1, v9

    move-object v5, p2

    .line 296
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    .line 481
    invoke-virtual {v10}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ll/ۨ᩵ᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 484
    invoke-virtual {v9}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 477
    :try_start_3
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    :goto_1
    move-object v11, v0

    .line 482
    :try_start_5
    throw v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 484
    :goto_2
    :try_start_6
    invoke-virtual {v9}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    :goto_3
    if-nez v11, :cond_0

    .line 485
    throw v0

    :cond_0
    invoke-virtual {v11, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 486
    :goto_4
    throw v1
.end method

.method public static ۧ(Ll/᩷۠ᩴ;Ll/ۜ֡ᩳ;)Landroid/os/Bundle;
    .locals 22

    move-object/from16 v0, p1

    .line 436
    iget-object v2, v0, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v3, v0, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    iget-object v4, v0, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    new-instance v6, Ll/ۨۘᩳ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/high16 v5, 0x800000

    move-object/from16 v1, p0

    .line 72
    invoke-static/range {v1 .. v7}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;

    move-result-object v9

    .line 439
    :try_start_0
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "filePath"

    .line 440
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "untitled"

    .line 441
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 442
    new-instance v10, Ll/ۙܶᩳ;

    const/4 v11, 0x0

    new-array v3, v11, [Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v12

    invoke-direct {v10, v12}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    const-string v2, "forceTryAXml"

    .line 443
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const/4 v13, 0x1

    if-nez v2, :cond_1

    const-string v2, "forceTryClass"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    const/4 v4, 0x1

    :goto_1
    new-instance v7, Ll/ۨۘᩳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    const/4 v5, -0x1

    move-object v1, v9

    move-object/from16 v2, p0

    move-object v3, v10

    move-object/from16 v6, p1

    .line 203
    invoke-virtual/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/ۗܶᩳ;ZILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)Ll/ۨ᩵ᩳ;

    move-result-object v9

    iget-object v14, v9, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    .line 445
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    invoke-virtual {v14}, Ll/᩻۬ᩳ;->ۙ()Ll/ۚۙᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۗ֫ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 446
    invoke-virtual {v14}, Ll/᩻۬ᩳ;->ۙ()Ll/ۚۙᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    if-eqz v2, :cond_2

    .line 447
    invoke-static {v9, v1, v2}, Ll/ܳ᩸ᩳ;->֫(Ll/ۨ᩵ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    :try_start_1
    invoke-virtual {v2, v10}, Ll/ܳ᩸ᩳ;->֫(Ll/ۗܶᩳ;)V

    invoke-virtual {v2}, Ll/ܳ᩸ᩳ;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 449
    :try_start_2
    invoke-virtual {v2}, Ll/ܳ᩸ᩳ;->close()V

    .line 450
    iget-object v2, v9, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v2, v11}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 451
    iget-object v2, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v2, v2, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v2}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v10

    const-string v2, "changed"

    .line 452
    invoke-virtual {v10, v2, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "error"

    invoke-virtual {v10, v2, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "fileTime"

    .line 73
    invoke-virtual {v12}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    .line 453
    invoke-virtual {v10, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "checkFileExists"

    invoke-virtual {v10, v2, v13}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 455
    invoke-virtual {v14}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 456
    :try_start_3
    iget-object v3, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v15, v3, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v3, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    const/16 v20, 0x1

    const/high16 v6, 0x800000

    move-object/from16 v16, v2

    move-object/from16 v17, v10

    move-object/from16 v18, v3

    move-object/from16 v19, v1

    move/from16 v21, v6

    invoke-virtual/range {v15 .. v21}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 457
    :try_start_4
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V

    .line 458
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v1, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    new-instance v7, Ll/ۨۘᩳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v5, p1

    .line 296
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    .line 459
    invoke-virtual {v14}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ll/ۨ᩵ᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v10

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v1, v0

    .line 455
    :try_start_5
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 447
    :try_start_7
    invoke-virtual {v2}, Ll/ܳ᩸ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    .line 446
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Session text is not ready for saving"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 441
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Untitled session requires an output path"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 462
    :goto_4
    invoke-virtual {v9}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    throw v0
.end method

.method public static synthetic ۧ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 539
    invoke-static {p0, p1}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۨ᩵ᩳ;)Ll/ۗ᩻᩵;
    .locals 0

    .line 541
    iget-object p0, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {p0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۨ᩵ᩳ;Ll/ۗ᩻᩵;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 543
    invoke-static {p2, p3}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p2

    move-object v0, p0

    .line 330
    monitor-enter v0

    :try_start_0
    iget-object p3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    .line 331
    invoke-virtual {p3}, Ll/ۤᩴᩳ;->close()V

    .line 545
    :cond_0
    invoke-direct {p0, p2}, Ll/ۨ᩵ᩳ;->֫(Ljava/lang/Throwable;)V

    if-nez p2, :cond_1

    .line 560
    invoke-virtual {p1, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 561
    :cond_1
    instance-of p0, p2, Ll/۬᩻᩵;

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :cond_2
    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 330
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic ܽ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 511
    invoke-static {p0, p1}, Ll/ۨ᩵ᩳ;->ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    if-eq p0, p1, :cond_1

    .line 553
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    return-object p0
.end method

.method private ᩳ()V
    .locals 1

    .line 287
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 288
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->length()I

    .line 289
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۗ᩻᩵;
    .locals 4

    move-object v0, p0

    .line 527
    monitor-enter v0

    .line 528
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ᩳ:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_0

    .line 557
    new-instance v2, Ll/ۚ۬ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v1

    .line 528
    monitor-exit v0

    return-object v1

    .line 529
    :cond_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->֫:Ll/ۗ᩻᩵;

    .line 530
    iget-object v2, p0, Ll/ۨ᩵ᩳ;->ۧ:Ll/֨֫ܿ;

    invoke-virtual {v2}, Ll/֨֫ܿ;->close()V

    .line 531
    new-instance v2, Ll/ۗ᩻᩵;

    invoke-direct {v2}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v2, p0, Ll/ۨ᩵ᩳ;->ᩳ:Ll/ۗ᩻᩵;

    .line 532
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    const/4 v0, 0x0

    .line 533
    invoke-static {v0}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ll/᩺᩵ܿ;

    const/4 v3, 0x6

    invoke-direct {v0, v3}, Ll/᩺᩵ܿ;-><init>(I)V

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    .line 535
    :goto_0
    new-instance v1, Ll/۫᩵ᩳ;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p0}, Ll/۫᩵ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۤ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۤ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۛ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۛ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    .line 539
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/ۚ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۚ᩵ᩳ;-><init>(Ll/ۨ᩵ᩳ;)V

    .line 540
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/֨᩵ᩳ;

    invoke-direct {v1, p0, v2}, Ll/֨᩵ᩳ;-><init>(Ll/ۨ᩵ᩳ;Ll/ۗ᩻᩵;)V

    .line 542
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 557
    new-instance v0, Ll/ۚ۬ۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v0}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 532
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(J)Ll/ۗ᩻᩵;
    .locals 5

    move-object v0, p0

    .line 495
    monitor-enter v0

    .line 496
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ᩳ:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_0

    .line 557
    new-instance p1, Ll/ۚ۬ۚ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, p1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    .line 496
    monitor-exit v0

    return-object p1

    .line 497
    :cond_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->֫:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_1

    .line 557
    new-instance p1, Ll/ۚ۬ۚ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, p1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    .line 497
    monitor-exit v0

    return-object p1

    .line 498
    :cond_1
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 499
    :try_start_1
    iget-object v2, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-nez v4, :cond_2

    iget-object v2, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->ܶ()J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-ltz v4, :cond_2

    .line 502
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 503
    :try_start_2
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۧ:Ll/֨֫ܿ;

    invoke-virtual {p1}, Ll/֨֫ܿ;->close()V

    .line 504
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {p1}, Ll/ۙ֫ܿ;->close()V

    .line 505
    new-instance p1, Ll/ۗ᩻᩵;

    invoke-direct {p1}, Ll/ۗ᩻᩵;-><init>()V

    iput-object p1, p0, Ll/ۨ᩵ᩳ;->֫:Ll/ۗ᩻᩵;

    .line 506
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 508
    iget-object p2, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {p2}, Ll/᩻ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p2

    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/֨ۚᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/֨ۚᩳ;-><init>(ILjava/lang/Object;)V

    sget-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p2, v1, v0}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;

    move-result-object p2

    new-instance v0, Ll/᩶᩵ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 509
    invoke-virtual {p2, v0}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p2

    new-instance v0, Ll/ۙ᩵ᩳ;

    invoke-direct {v0, p0}, Ll/ۙ᩵ᩳ;-><init>(Ll/ۨ᩵ᩳ;)V

    .line 510
    invoke-virtual {p2, v0}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p2

    new-instance v0, Ll/ۗ᩵ᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۗ᩵ᩳ;-><init>(Ll/ۨ᩵ᩳ;Ll/ۗ᩻᩵;)V

    .line 512
    invoke-virtual {p2, v0}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 557
    new-instance p2, Ll/ۚ۬ۚ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    .line 500
    :cond_2
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment final checkpoint is not current and durable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 502
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 506
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۗܶᩳ;ZILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)Ll/ۨ᩵ᩳ;
    .locals 22

    move-object/from16 v10, p0

    move-object/from16 v0, p2

    move/from16 v4, p4

    move-object/from16 v9, p6

    .line 209
    iget-object v1, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "e2SourcePending"

    .line 210
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v19

    .line 211
    iget-object v8, v10, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    if-nez v19, :cond_0

    invoke-virtual {v8}, Ll/᩻۬ᩳ;->ۙ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v10

    .line 212
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    if-eqz v19, :cond_4

    move/from16 v3, p3

    .line 215
    invoke-static {v0, v3, v4, v9}, Ll/ܿ᩸ᩳ;->֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;

    move-result-object v5

    .line 216
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v5, :cond_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object v4, v5

    move v5, v6

    move v6, v7

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    .line 218
    invoke-direct/range {v1 .. v9}, Ll/ۨ᩵ᩳ;->֫(Ll/ۗܶᩳ;ZLl/ۧ᩸ᩳ;IILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)V

    .line 219
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩵ᩳ;->ᩳ()V

    return-object v10

    :cond_1
    const-string v3, "textPageSize"

    .line 222
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    if-gtz v3, :cond_3

    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz v3, :cond_2

    goto :goto_0

    .line 225
    :cond_2
    new-instance v3, Ll/ۙᩴᩳ;

    invoke-direct {v3, v0}, Ll/ۙᩴᩳ;-><init>(Ll/ۗܶᩳ;)V

    move-object/from16 v7, p5

    iget-object v5, v7, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    invoke-static {v8, v3, v5, v4, v9}, Ll/ۨܶᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/ۨܶᩳ;

    move-result-object v3

    iput-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    goto :goto_2

    :cond_3
    :goto_0
    move-object/from16 v7, p5

    const-wide/16 v11, -0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-wide v7, v11

    .line 262
    invoke-static/range {v1 .. v8}, Ll/ܰۘᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/᩷۠ᩴ;Ll/ۗܶᩳ;ILl/ۜ֡ᩳ;Ll/ܿۖ᩷;J)Ll/ۨ᩵ᩳ;

    move-result-object v0

    return-object v0

    :cond_4
    move-object/from16 v7, p5

    .line 227
    new-instance v3, Ll/ۙᩴᩳ;

    invoke-direct {v3, v0}, Ll/ۙᩴᩳ;-><init>(Ll/ۗܶᩳ;)V

    .line 67
    instance-of v4, v9, Ll/֫᩵ᩳ;

    if-nez v4, :cond_5

    goto :goto_1

    .line 68
    :cond_5
    new-instance v4, Ll/᩺ᩴᩳ;

    invoke-direct {v4, v3, v9}, Ll/᩺ᩴᩳ;-><init>(Ll/᩷۬ᩳ;Ll/ܿۖ᩷;)V

    move-object v3, v4

    .line 227
    :goto_1
    iget-object v4, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v4, v4, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    iget v4, v4, Ll/᩺ܶᩳ;->ܽ:I

    invoke-static {v8, v3, v4}, Ll/ۨܶᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;I)Ll/ۨܶᩳ;

    move-result-object v3

    iput-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    .line 229
    :goto_2
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩵ᩳ;->ᩳ()V

    .line 230
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ۢ()Ljava/lang/String;

    move-result-object v6

    if-eqz v19, :cond_6

    move-object v5, v6

    goto :goto_3

    .line 231
    :cond_6
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v3, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v3, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    invoke-virtual {v3, v6}, Ll/ۗ֫ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v5, v3

    .line 232
    :goto_3
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ᩳ()Ll/ᩴۗᩳ;

    move-result-object v3

    .line 233
    :try_start_0
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 234
    iget-object v4, v10, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    if-eqz v3, :cond_7

    :try_start_1
    invoke-virtual {v4}, Ll/ۤ᩸ᩳ;->ܳ()Ll/֨ۙᩳ;

    move-result-object v11

    .line 210
    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v11, v3}, Ll/֨ۙᩳ;->֫(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    :cond_7
    if-eqz v3, :cond_8

    .line 235
    invoke-virtual {v3}, Ll/ᩴۗᩳ;->close()V

    .line 236
    :cond_8
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v3

    if-nez v3, :cond_a

    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܺ()Ll/֡ۙᩳ;

    move-result-object v3

    sget-object v11, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    if-ne v3, v11, :cond_9

    goto :goto_4

    .line 237
    :cond_9
    new-instance v0, Ljava/io/IOException;

    iget-object v1, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v1}, Ll/ۨܶᩳ;->֫()Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "Cannot prepare source text"

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_a
    :goto_4
    if-eqz v19, :cond_b

    .line 238
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ܽ()Ll/᩺ܶᩳ;

    move-result-object v3

    goto :goto_5

    :cond_b
    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v3, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    :goto_5
    move-object/from16 v20, v3

    const/4 v3, 0x0

    if-eqz v19, :cond_c

    .line 233
    invoke-virtual {v4, v3, v3}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    .line 239
    invoke-virtual {v4, v3}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 240
    :cond_c
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "changed"

    .line 241
    invoke-virtual {v4}, Ll/ۙ֫ܿ;->isChanged()Z

    move-result v11

    invoke-virtual {v1, v2, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "error"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v2, 0x1

    if-eqz v19, :cond_d

    .line 242
    check-cast v0, Ll/ۙܶᩳ;

    .line 73
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v11

    const-string v0, "fileTime"

    .line 242
    invoke-virtual {v1, v0, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "checkFileExists"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_d
    if-nez v19, :cond_f

    .line 243
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_6

    :cond_e
    move-object v0, v5

    goto :goto_7

    :cond_f
    :goto_6
    iget-object v0, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v0}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۙᩳ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 245
    :goto_7
    invoke-virtual {v8}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v21

    if-eqz v19, :cond_10

    .line 246
    :try_start_2
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v11, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    .line 247
    invoke-virtual {v2}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v18

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v12, v21

    move-object v13, v1

    move-object/from16 v14, v20

    move-object v15, v0

    .line 246
    invoke-virtual/range {v11 .. v18}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;IIZ)Ll/۫ᩴᩳ;

    move-result-object v0

    const/high16 v2, 0x800000

    move-object v13, v4

    move-object v14, v5

    move-object v15, v6

    const/high16 v6, 0x800000

    move-object v4, v0

    move-object v0, v8

    goto :goto_8

    .line 248
    :cond_10
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v3}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v11

    const/high16 v12, 0x800000

    move-object/from16 v3, v21

    move-object v13, v4

    move-object v4, v1

    move-object v14, v5

    move-object/from16 v5, v20

    move-object v15, v6

    move-object v6, v0

    move v7, v11

    move-object v0, v8

    move v8, v12

    invoke-virtual/range {v2 .. v8}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const/high16 v3, 0x800000

    move-object v4, v2

    const/high16 v6, 0x800000

    .line 249
    :goto_8
    invoke-virtual/range {v21 .. v21}, Ll/۬᩹ᩳ;->close()V

    if-eqz p7, :cond_11

    .line 251
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    invoke-virtual {v2}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    const/4 v8, 0x1

    goto :goto_9

    :cond_11
    const/4 v2, 0x0

    const/4 v8, 0x0

    :goto_9
    move-object v11, v1

    move-object/from16 v1, p0

    move-object v2, v11

    move-object/from16 v3, v20

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    .line 252
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    .line 253
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩵ᩳ;->ᩳ()V

    .line 254
    iget-object v1, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    .line 255
    invoke-virtual {v1}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v2

    .line 256
    :cond_12
    :goto_a
    invoke-virtual {v1}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܺ()Ll/֡ۙᩳ;

    move-result-object v3

    sget-object v4, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    if-ne v3, v4, :cond_15

    .line 257
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 258
    invoke-virtual {v1}, Ll/ۨܶᩳ;->ᩳ()Ll/ᩴۗᩳ;

    move-result-object v3

    .line 259
    :try_start_3
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    if-eqz v3, :cond_13

    .line 260
    invoke-virtual {v13}, Ll/ۤ᩸ᩳ;->ܳ()Ll/֨ۙᩳ;

    move-result-object v4

    .line 210
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v3}, Ll/֨ۙᩳ;->֫(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_13
    if-eqz v3, :cond_12

    .line 261
    invoke-virtual {v3}, Ll/ᩴۗᩳ;->close()V

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v3, :cond_14

    .line 258
    :try_start_4
    invoke-virtual {v3}, Ll/ᩴۗᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_14
    :goto_b
    throw v1

    .line 263
    :cond_15
    invoke-static/range {p6 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 264
    invoke-virtual {v1}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_19

    if-nez v19, :cond_17

    .line 266
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_c

    :cond_16
    move-object v6, v14

    goto :goto_d

    :cond_17
    :goto_c
    invoke-virtual {v1}, Ll/ۨܶᩳ;->ܳ()Ll/ۚۙᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۚۙᩳ;->ۢ()Ljava/lang/String;

    move-result-object v3

    move-object v6, v3

    .line 267
    :goto_d
    invoke-virtual {v1}, Ll/ۨܶᩳ;->close()V

    const/4 v1, 0x0

    .line 268
    iput-object v1, v10, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    if-eqz v2, :cond_18

    .line 270
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩵ᩳ;->ᩳ()V

    return-object v10

    .line 273
    :cond_18
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1

    .line 274
    :try_start_5
    iget-object v0, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    const/high16 v8, 0x800000

    const/4 v7, 0x1

    move-object v3, v1

    move-object v4, v11

    move-object/from16 v5, v20

    invoke-virtual/range {v2 .. v8}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/high16 v6, 0x800000

    .line 275
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    move-object/from16 v1, p0

    move-object v2, v11

    move-object/from16 v3, v20

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    .line 276
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    .line 277
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩵ᩳ;->ᩳ()V

    return-object v10

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 273
    :try_start_6
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_e

    :catchall_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v2

    .line 264
    :cond_19
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Cannot display incomplete source text"

    invoke-virtual {v1}, Ll/ۨܶᩳ;->֫()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_4
    move-exception v0

    move-object v1, v0

    .line 245
    :try_start_7
    invoke-virtual/range {v21 .. v21}, Ll/۬᩹ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1

    :catchall_6
    move-exception v0

    move-object v1, v0

    if-eqz v3, :cond_1a

    .line 232
    :try_start_8
    invoke-virtual {v3}, Ll/ᩴۗᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1a
    :goto_10
    throw v1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۙܶᩳ;ZZIIILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)Ll/ۨ᩵ᩳ;
    .locals 20

    move-object/from16 v10, p0

    .line 370
    iget-object v0, v10, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    const/4 v1, 0x0

    if-eqz p10, :cond_1

    .line 371
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ܰ()Ll/ۚۗᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚۗᩳ;->ܽ()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    .line 372
    iget-object v4, v10, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 373
    :goto_0
    iget v5, v10, Ll/ۨ᩵ᩳ;->᩷:I

    if-ge v4, v5, :cond_0

    .line 374
    invoke-static/range {p9 .. p9}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 375
    iget-object v5, v10, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    move-object/from16 v7, p8

    invoke-virtual {v5, v4, v7}, Ll/ܰۘᩳ;->֫(ILl/ۜ֡ᩳ;)Ll/۟᩸ᩳ;

    move-result-object v5

    :try_start_0
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->length()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v6

    add-long/2addr v2, v8

    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    :cond_0
    move-object/from16 v7, p8

    goto :goto_2

    :cond_1
    move-object/from16 v7, p8

    const-wide/16 v2, -0x1

    :goto_2
    move-wide v8, v2

    if-eqz p3, :cond_2

    .line 379
    invoke-static {}, Ll/ܿ᩸ᩳ;->֫()Ll/ۧ᩸ᩳ;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v11, p9

    goto :goto_3

    :cond_2
    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v11, p9

    invoke-static {v3, v4, v5, v11}, Ll/ܿ᩸ᩳ;->֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;

    move-result-object v2

    :goto_3
    move-object v6, v2

    .line 380
    invoke-static/range {p9 .. p9}, Ll/ۨ᩵ᩳ;->֫(Ll/ܿۖ᩷;)V

    if-nez v6, :cond_4

    .line 381
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-nez v2, :cond_3

    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v2, v2, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v2}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v2

    const-string v12, "textPageSize"

    invoke-virtual {v2, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_4

    :cond_3
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-wide v7, v8

    .line 382
    invoke-static/range {v1 .. v8}, Ll/ܰۘᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/᩷۠ᩴ;Ll/ۗܶᩳ;ILl/ۜ֡ᩳ;Ll/ܿۖ᩷;J)Ll/ۨ᩵ᩳ;

    move-result-object v0

    return-object v0

    .line 384
    :cond_4
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    if-eqz v2, :cond_5

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v6

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-wide v7, v8

    .line 385
    invoke-static/range {v1 .. v8}, Ll/ܰۘᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/ۙܶᩳ;ZLl/ۧ᩸ᩳ;Ll/ۜ֡ᩳ;Ll/ܿۖ᩷;J)Ll/ۨ᩵ᩳ;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v8, 0x1

    if-nez v6, :cond_7

    .line 388
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v2}, Ll/ۤ᩸ᩳ;->length()I

    move-result v6

    const-string v9, ""

    invoke-virtual {v2, v1, v6, v9}, Ll/ۤ᩸ᩳ;->replace(IILjava/lang/CharSequence;)Ll/ۤ᩸ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩸()V

    .line 233
    invoke-virtual {v2, v1, v1}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    .line 388
    invoke-virtual {v2, v1}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 389
    iget-object v1, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v1, v1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v14

    const-string v1, "e2SourcePending"

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 390
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1

    .line 391
    :try_start_2
    iget-object v2, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v12, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    const-string v16, "\n"

    const/16 v19, 0x0

    const/4 v15, 0x0

    move-object v13, v1

    move/from16 v17, p6

    move/from16 v18, p7

    invoke-virtual/range {v12 .. v19}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;IIZ)Ll/۫ᩴᩳ;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 392
    :try_start_3
    invoke-virtual {v2}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v6

    const/high16 v9, 0x800000

    invoke-static {v6, v9, v1}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    const/4 v9, 0x0

    .line 393
    :try_start_4
    invoke-virtual {v6, v0, v9}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;

    move-result-object v0

    .line 323
    iget-object v9, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    .line 324
    iput-object v0, v10, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    if-eqz v9, :cond_6

    .line 325
    invoke-virtual {v9}, Ll/ۤᩴᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 394
    :cond_6
    :try_start_5
    invoke-virtual {v6}, Ll/ۛᩴᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-virtual {v2}, Ll/۫ᩴᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    .line 395
    invoke-virtual/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/ۗܶᩳ;ZILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)Ll/ۨ᩵ᩳ;

    move-result-object v0

    return-object v0

    :catchall_2
    move-exception v0

    move-object v3, v0

    .line 390
    :try_start_7
    invoke-virtual {v6}, Ll/ۛᩴᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v4, v0

    :try_start_8
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_9
    invoke-virtual {v2}, Ll/۫ᩴᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_a
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_6

    :catchall_7
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2

    :cond_7
    const/4 v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v6

    move/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 397
    invoke-direct/range {v1 .. v9}, Ll/ۨ᩵ᩳ;->֫(Ll/ۗܶᩳ;ZLl/ۧ᩸ᩳ;IILl/ۜ֡ᩳ;Ll/ܿۖ᩷;Z)V

    return-object v10
.end method

.method public final ֫(I)V
    .locals 4

    .line 183
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v0, v0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v0, v0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v0}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "textPageSize"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 184
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    invoke-virtual {v3, v1, v0, v2}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;)Ll/۫ᩴᩳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 185
    :try_start_1
    invoke-virtual {v0}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v2

    const/high16 v3, 0x800000

    invoke-static {v2, v3, v1}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 186
    :try_start_2
    iget-object v3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, v3, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    invoke-virtual {v2, p1, v3}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;

    move-result-object p1

    .line 323
    iget-object v3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    .line 324
    iput-object p1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    if-eqz v3, :cond_0

    .line 325
    invoke-virtual {v3}, Ll/ۤᩴᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    :cond_0
    :try_start_3
    invoke-virtual {v2}, Ll/ۛᩴᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v0}, Ll/۫ᩴᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 184
    :try_start_5
    invoke-virtual {v2}, Ll/ۛᩴᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_7
    invoke-virtual {v0}, Ll/۫ᩴᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p1

    :try_start_9
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final ֫(IILjava/lang/CharSequence;)V
    .locals 6

    .line 149
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    invoke-virtual {v0}, Ll/ۤ᩸ᩳ;->length()I

    move-result v2

    move-object v3, p3

    move v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۙ֫ܿ;->ۧ(IILjava/lang/CharSequence;II)V

    .line 150
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۘ()V

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;Ll/ۨۘᩳ;)V
    .locals 8

    const/high16 v5, 0x800000

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 296
    invoke-direct/range {v0 .. v7}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    return-void
.end method

.method public final ֫(Ll/ۗ֫ܿ;[B[BLl/ۜ֡ᩳ;I)V
    .locals 9

    .line 193
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v0, v0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v0, v0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {v0}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v0

    .line 194
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v1}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v8

    .line 195
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v1, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    .line 236
    iget-object v1, v2, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    invoke-virtual {v1, p1}, Ll/ۗ֫ܿ;->֫(Ll/ۗ֫ܿ;)Ll/ۗ֫ܿ;

    move-result-object v4

    move-object v1, v8

    move-object v2, v0

    move-object v5, p2

    move-object v6, p3

    move v7, p5

    invoke-static/range {v1 .. v7}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    invoke-virtual {v8}, Ll/۬᩹ᩳ;->close()V

    .line 197
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v3, p1, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    new-instance v7, Ll/ۨۘᩳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v5, p4

    move v6, p5

    .line 296
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    return-void

    :catchall_0
    move-exception p1

    .line 194
    :try_start_1
    invoke-virtual {v8}, Ll/۬᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(Ll/ۛᩴᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;Ll/ۜ֡ᩳ;Ll/ܿۖ᩷;I)V
    .locals 18

    move-object/from16 v9, p0

    .line 160
    iget-object v0, v9, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩸()V

    .line 233
    iget-object v1, v9, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    move/from16 v2, p7

    invoke-virtual {v1, v2, v2}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    const/4 v2, 0x0

    .line 160
    invoke-virtual {v1, v2}, Ll/ۙ֫ܿ;->ۧ(Z)V

    .line 162
    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/4 v15, 0x0

    move-object/from16 v10, p1

    move-object v11, v1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    .line 163
    :try_start_0
    invoke-virtual/range {v10 .. v17}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;IIZ)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    .line 165
    iget-object v0, v9, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    .line 296
    invoke-direct/range {v1 .. v8}, Ll/ۨ᩵ᩳ;->֫(Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/۫ᩴᩳ;Ll/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 162
    :try_start_1
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
.end method

.method public final ֫(Ll/ܰۘᩳ;II)V
    .locals 10

    .line 170
    iput-object p1, p0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    iput p2, p0, Ll/ۨ᩵ᩳ;->᩷:I

    .line 171
    invoke-virtual {p1}, Ll/ܰۘᩳ;->ۧ()Landroid/os/Bundle;

    move-result-object v2

    .line 173
    iget-object v7, p0, Ll/ۨ᩵ᩳ;->ۘ:Ll/᩻۬ᩳ;

    invoke-virtual {v7}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v8

    .line 174
    :try_start_0
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v0, v0, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    invoke-virtual {p1}, Ll/ܰۘᩳ;->ܽ()I

    move-result v1

    const/4 v9, 0x1

    if-ne v1, v9, :cond_0

    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/ܰۘᩳ;->ܿ()Ll/᩺ܶᩳ;

    move-result-object v1

    :goto_0
    move-object v3, v1

    invoke-virtual {p1}, Ll/ܰۘᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    move-object v1, v8

    move v6, p3

    invoke-virtual/range {v0 .. v6}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 175
    invoke-virtual {v8}, Ll/۬᩹ᩳ;->close()V

    .line 176
    :try_start_1
    invoke-virtual {v7}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    invoke-virtual {v0}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v2

    invoke-static {v2, p3, v1}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 177
    :try_start_3
    invoke-virtual {p1}, Ll/ܰۘᩳ;->ܽ()I

    move-result v2

    if-ne v2, v9, :cond_1

    iget-object v2, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩸:Ll/᩺ܶᩳ;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll/ܰۘᩳ;->ܿ()Ll/᩺ܶᩳ;

    move-result-object v2

    :goto_1
    invoke-virtual {p3, v7, v2}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;

    move-result-object v2

    .line 323
    iget-object v3, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    .line 324
    iput-object v2, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    if-eqz v3, :cond_2

    .line 325
    invoke-virtual {v3}, Ll/ۤᩴᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    :cond_2
    :try_start_4
    invoke-virtual {p3}, Ll/ۛᩴᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-virtual {v0}, Ll/۫ᩴᩳ;->close()V

    .line 179
    iget-object p3, p0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    iput-object p1, p3, Ll/᩻ᩴᩳ;->ܳ:Ll/ܰۘᩳ;

    iput p2, p3, Ll/᩻ᩴᩳ;->ۢ:I

    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_6
    invoke-virtual {p3}, Ll/ۛᩴᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_7
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_8
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p2

    :try_start_9
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception p1

    :try_start_a
    invoke-virtual {v0}, Ll/۫ᩴᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1

    :catchall_6
    move-exception p1

    .line 173
    :try_start_b
    invoke-virtual {v8}, Ll/۬᩹ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩹ᩴᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 49
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ܽ:Ll/᩹ᩴᩳ;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۨ᩵ᩳ;->֫:Ll/ۗ᩻᩵;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ᩳ:Ll/ۗ᩻᩵;

    if-nez v1, :cond_0

    .line 50
    iput-object p1, p0, Ll/ۨ᩵ᩳ;->ܽ:Ll/᩹ᩴᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v0

    return-void

    .line 49
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Session directory lease is already owned"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ۗ᩻᩵;
    .locals 4

    move-object v0, p0

    .line 336
    monitor-enter v0

    .line 337
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ۜ:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_0

    .line 557
    new-instance v2, Ll/ۚ۬ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v1

    .line 337
    monitor-exit v0

    return-object v1

    .line 338
    :cond_0
    iget-object v1, p0, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 339
    invoke-static {v2}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 340
    :cond_1
    new-instance v3, Ll/֡᩵ᩳ;

    invoke-direct {v3, v1}, Ll/֡᩵ᩳ;-><init>(Ll/ۨܶᩳ;)V

    sget-object v1, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v3, v1}, Ll/ۗ᩻᩵;->֫(Ll/֡᩵ᩳ;Ljava/util/concurrent/ThreadPoolExecutor;)Ll/ۗ᩻᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩵ᩳ;->ۜ:Ll/ۗ᩻᩵;

    .line 343
    iput-object v2, p0, Ll/ۨ᩵ᩳ;->ܳ:Ll/ۨܶᩳ;

    .line 557
    new-instance v2, Ll/ۚ۬ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v1

    .line 344
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 345
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Ll/ۗ᩻᩵;
    .locals 3

    .line 282
    iget-object v0, p0, Ll/ۨ᩵ᩳ;->᩻:Ll/ۗ᩻᩵;

    new-instance v1, Ll/۬᩵ᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۬᩵ᩳ;-><init>(I)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method
