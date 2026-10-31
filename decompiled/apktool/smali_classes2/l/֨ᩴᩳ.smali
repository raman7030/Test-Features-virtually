.class public final Ll/֨ᩴᩳ;
.super Ljava/lang/Object;
.source "76RQ"


# direct methods
.method public static ֫(Landroid/os/Bundle;Ll/ۗ֫ܿ;I)Ll/ۗ֫ܿ;
    .locals 4

    const-string v0, "initialSmoothPending"

    .line 28
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object p1

    .line 30
    :cond_0
    sget v1, Ll/᩸᩺ᩳ;->᩷:I

    .line 503
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "smooth_mode_threshold"

    const v3, 0x30d40

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 29
    invoke-virtual {p1, p2, v1}, Ll/ۗ֫ܿ;->֫(II)Ll/ۗ֫ܿ;

    move-result-object p1

    .line 31
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-object p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;Ll/ۗ֫ܿ;[B[BLl/ۧ᩸ᩳ;Ll/ۜ֡ᩳ;Ll/ܿۖ᩷;)Ll/ۨ᩵ᩳ;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    const/4 v3, 0x0

    new-array v4, v3, [Ll/ܳ۠ᩴ;

    .line 75
    invoke-static {v0, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-nez v4, :cond_15

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p0 .. p0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "-new-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v4

    .line 77
    new-instance v13, Landroid/os/Bundle;

    move-object/from16 v5, p1

    invoke-direct {v13, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    const/4 v5, 0x1

    if-nez v1, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const-string v7, "e2SourcePending"

    .line 78
    invoke-virtual {v13, v7, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v6, "initialSmoothPending"

    .line 79
    invoke-virtual {v13, v6, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v5, "changed"

    .line 80
    invoke-virtual {v13, v5, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v5, "error"

    invoke-virtual {v13, v5, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-nez v1, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    .line 81
    :cond_1
    iget-object v5, v1, Ll/ۧ᩸ᩳ;->ܽ:Ll/᩺ܶᩳ;

    move-object v7, v5

    .line 86
    :goto_1
    :try_start_0
    iget-object v5, v2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v6, v2, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    invoke-static {v4, v5, v6}, Ll/᩻۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/᩻۬ᩳ;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_16

    .line 87
    :try_start_1
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->ᩳ֫()V

    .line 88
    new-instance v12, Ll/ۙ֫ܿ;

    invoke-direct {v12, v15}, Ll/ۙ֫ܿ;-><init>(Ll/᩻۬ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_15

    const-string v11, "Session creation is canceled"

    if-eqz v1, :cond_3

    .line 89
    iget-object v5, v1, Ll/ۧ᩸ᩳ;->ᩳ:Ljava/lang/CharSequence;

    const/4 v6, 0x0

    .line 90
    :goto_2
    :try_start_2
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v6, v8, :cond_3

    .line 132
    invoke-interface/range {p7 .. p7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v8

    if-nez v8, :cond_2

    .line 92
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    int-to-long v8, v8

    move-object/from16 v22, v4

    int-to-long v3, v6

    const-wide/16 v16, 0x1000

    add-long v3, v3, v16

    :try_start_3
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 93
    invoke-virtual {v12}, Ll/ۤ᩸ᩳ;->length()I

    move-result v17

    invoke-virtual {v12}, Ll/ۤ᩸ᩳ;->length()I

    move-result v18

    iget-object v3, v1, Ll/ۧ᩸ᩳ;->ᩳ:Ljava/lang/CharSequence;

    move-object/from16 v16, v12

    move-object/from16 v19, v3

    move/from16 v20, v6

    move/from16 v21, v4

    invoke-virtual/range {v16 .. v21}, Ll/ۙ֫ܿ;->ۧ(IILjava/lang/CharSequence;II)V

    .line 94
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->ۘ()V

    move v6, v4

    move-object/from16 v4, v22

    const/4 v3, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    move-object/from16 v22, v4

    .line 132
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception v0

    move-object/from16 v22, v4

    goto :goto_3

    :cond_3
    move-object/from16 v22, v4

    const/4 v3, 0x0

    .line 233
    :try_start_4
    invoke-virtual {v12, v3, v3}, Ll/ۤ᩸ᩳ;->setSelection(II)V

    .line 97
    invoke-virtual {v12, v3}, Ll/ۙ֫ܿ;->ۧ(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_14

    if-eqz v1, :cond_4

    .line 98
    :try_start_5
    invoke-virtual {v12}, Ll/ۤ᩸ᩳ;->length()I

    move-result v1

    move-object/from16 v3, p2

    invoke-static {v13, v3, v1}, Ll/֨ᩴᩳ;->֫(Landroid/os/Bundle;Ll/ۗ֫ܿ;I)Ll/ۗ֫ܿ;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v8, v1

    goto :goto_4

    :goto_3
    move-object v14, v12

    move-object/from16 v5, v22

    goto/16 :goto_11

    :cond_4
    move-object/from16 v3, p2

    move-object v8, v3

    .line 99
    :goto_4
    :try_start_6
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->ܳ()Ll/۟ۗᩳ;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_14

    :try_start_7
    invoke-virtual {v1}, Ll/۟ۗᩳ;->ܳ()Ll/۫᩹ᩳ;

    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_11

    const/high16 v4, 0x800000

    move-object v5, v3

    move-object v6, v13

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object v14, v11

    move v11, v4

    .line 100
    :try_start_8
    invoke-static/range {v5 .. v11}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_e

    const/high16 v10, 0x800000

    .line 101
    :try_start_9
    invoke-virtual {v4}, Ll/۫ᩴᩳ;->֫()[B

    move-result-object v5

    .line 102
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v6

    new-instance v7, Ljava/io/ByteArrayInputStream;

    invoke-direct {v7, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v5, v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    int-to-long v8, v5

    move-object/from16 p1, v12

    int-to-long v11, v10

    :try_start_a
    iget-object v5, v2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    move-object/from16 v17, v5

    move-object/from16 v5, v22

    const/high16 v18, 0x800000

    move-wide v10, v11

    move-object/from16 v19, p1

    move-object/from16 v12, v17

    :try_start_b
    invoke-static/range {v5 .. v12}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֨۬ᩳ;)Ll/ۨۙᩳ;

    move-result-object v5

    .line 103
    invoke-virtual {v1}, Ll/۟ۗᩳ;->֫()[B

    move-result-object v6

    invoke-virtual {v15}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v7

    invoke-static {v6, v5, v7}, Ll/۠֫ܿ;->֫([BLl/ۨۙᩳ;Ljava/util/UUID;)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/۟ۗᩳ;->ۧ([B)J

    move-result-wide v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 104
    :try_start_c
    invoke-virtual {v15, v5, v6}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 105
    :try_start_d
    invoke-virtual {v4}, Ll/۫ᩴᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :try_start_f
    invoke-virtual {v1}, Ll/۟ۗᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    move-object/from16 v5, v22

    .line 106
    :try_start_10
    invoke-static {v5, v13}, Ll/ۢ֡ᩳ;->֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V

    .line 107
    invoke-virtual/range {v19 .. v19}, Ll/ۙ֫ܿ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_13

    .line 108
    :try_start_11
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->ᩴ()Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 132
    :try_start_12
    invoke-interface/range {p7 .. p7}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x1

    new-array v1, v1, [Ll/᩺֨ᩴ;

    .line 111
    sget-object v3, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-static {v5, v0, v1}, Ll/ܿ۠ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)Ll/᩷۠ᩴ;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 113
    :try_start_13
    invoke-interface/range {p0 .. p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v1

    .line 212
    sget-object v3, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    invoke-interface {v3, v1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 114
    iget-object v1, v2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v3, v2, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    iget-object v2, v2, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    const/4 v4, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, v3

    move-object/from16 p3, v2

    move/from16 p4, v18

    move-object/from16 p5, p7

    move-object/from16 p6, v4

    .line 72
    invoke-static/range {p0 .. p6}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    return-object v0

    :catchall_2
    move-exception v0

    const/4 v1, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto/16 :goto_12

    .line 132
    :cond_5
    :try_start_14
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, v14}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    :catchall_3
    move-exception v0

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    goto/16 :goto_f

    :catchall_5
    move-exception v0

    :goto_5
    move-object/from16 v5, v22

    goto :goto_e

    :catchall_6
    move-exception v0

    goto :goto_b

    :catchall_7
    move-exception v0

    goto :goto_8

    :catchall_8
    move-exception v0

    goto :goto_6

    :catchall_9
    move-exception v0

    goto :goto_6

    :catchall_a
    move-exception v0

    move-object/from16 v19, p1

    goto :goto_6

    :catchall_b
    move-exception v0

    move-object/from16 v19, v12

    :goto_6
    move-object/from16 v5, v22

    move-object v2, v0

    .line 99
    :try_start_15
    invoke-virtual {v4}, Ll/۫ᩴᩳ;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    goto :goto_7

    :catchall_c
    move-exception v0

    move-object v4, v0

    :try_start_16
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    :catchall_d
    move-exception v0

    goto :goto_9

    :catchall_e
    move-exception v0

    move-object/from16 v19, v12

    :goto_8
    move-object/from16 v5, v22

    :goto_9
    move-object v2, v0

    :try_start_17
    invoke-virtual {v3}, Ll/۬᩹ᩳ;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    goto :goto_a

    :catchall_f
    move-exception v0

    move-object v3, v0

    :try_start_18
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    :catchall_10
    move-exception v0

    goto :goto_c

    :catchall_11
    move-exception v0

    move-object/from16 v19, v12

    :goto_b
    move-object/from16 v5, v22

    :goto_c
    move-object v2, v0

    :try_start_19
    invoke-virtual {v1}, Ll/۟ۗᩳ;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_12

    goto :goto_d

    :catchall_12
    move-exception v0

    move-object v1, v0

    :try_start_1a
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    :catchall_13
    move-exception v0

    goto :goto_e

    :catchall_14
    move-exception v0

    move-object/from16 v19, v12

    goto :goto_5

    :goto_e
    move-object/from16 v14, v19

    goto :goto_11

    :catchall_15
    move-exception v0

    move-object v5, v4

    :goto_f
    const/4 v14, 0x0

    goto :goto_11

    :catchall_16
    move-exception v0

    move-object v5, v4

    :goto_10
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_11
    const/4 v1, 0x0

    :goto_12
    if-eqz v14, :cond_d

    .line 116
    :try_start_1b
    invoke-virtual {v14}, Ll/ۙ֫ܿ;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_17

    goto/16 :goto_1a

    :catchall_17
    move-exception v0

    move-object v2, v0

    if-eqz v15, :cond_9

    .line 118
    :try_start_1c
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_18

    goto :goto_16

    :catchall_18
    move-exception v0

    if-nez v1, :cond_8

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    .line 120
    invoke-static {v5, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-array v1, v1, [Ll/ۧ۠ᩴ;

    .line 122
    invoke-static {v5, v1}, Ll/ܿ۠ᩴ;->walk(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 123
    :try_start_1d
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    invoke-static {v3}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_19

    goto :goto_13

    .line 124
    :cond_6
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V

    goto :goto_15

    :catchall_19
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_7

    .line 122
    :try_start_1e
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1a

    goto :goto_14

    :catchall_1a
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_14
    throw v2

    .line 126
    :cond_8
    :goto_15
    throw v0

    :cond_9
    :goto_16
    if-nez v1, :cond_c

    const/4 v1, 0x0

    new-array v0, v1, [Ll/ܳ۠ᩴ;

    .line 120
    invoke-static {v5, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-array v0, v1, [Ll/ۧ۠ᩴ;

    .line 122
    invoke-static {v5, v0}, Ll/ܿ۠ᩴ;->walk(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 123
    :try_start_1f
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v0

    invoke-interface {v1, v0}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    invoke-static {v3}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1b

    goto :goto_17

    .line 124
    :cond_a
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V

    goto :goto_19

    :catchall_1b
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_b

    .line 122
    :try_start_20
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1c

    goto :goto_18

    :catchall_1c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_18
    throw v2

    .line 127
    :cond_c
    :goto_19
    throw v2

    :cond_d
    :goto_1a
    if-eqz v15, :cond_11

    .line 118
    :try_start_21
    invoke-virtual {v15}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1d

    goto :goto_1e

    :catchall_1d
    move-exception v0

    if-nez v1, :cond_10

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    .line 120
    invoke-static {v5, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_10

    new-array v1, v1, [Ll/ۧ۠ᩴ;

    .line 122
    invoke-static {v5, v1}, Ll/ܿ۠ᩴ;->walk(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 123
    :try_start_22
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    invoke-static {v3}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1e

    goto :goto_1b

    .line 124
    :cond_e
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V

    goto :goto_1d

    :catchall_1e
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_f

    .line 122
    :try_start_23
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1f

    goto :goto_1c

    :catchall_1f
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    :goto_1c
    throw v2

    .line 126
    :cond_10
    :goto_1d
    throw v0

    :cond_11
    :goto_1e
    if-nez v1, :cond_14

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    .line 120
    invoke-static {v5, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_14

    new-array v1, v1, [Ll/ۧ۠ᩴ;

    .line 122
    invoke-static {v5, v1}, Ll/ܿ۠ᩴ;->walk(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 123
    :try_start_24
    invoke-static {}, Ll/۠۬ᩴ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    invoke-static {v3}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_20

    goto :goto_1f

    .line 124
    :cond_12
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V

    goto :goto_21

    :catchall_20
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_13

    .line 122
    :try_start_25
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_21

    goto :goto_20

    :catchall_21
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_13
    :goto_20
    throw v2

    .line 128
    :cond_14
    :goto_21
    throw v0

    .line 75
    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Session directory already exists"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
