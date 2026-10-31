.class public final Ll/ۗ۟᩻;
.super Ljava/lang/Object;
.source "S76D"


# instance fields
.field public ֫:J

.field public ۧ:Z

.field public ܽ:J

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ۘܺۢ;


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v16, p0

    .line 9
    monitor-enter v16

    .line 404
    :try_start_0
    iget-object v4, v1, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;

    const/4 v5, 0x0

    if-eqz v4, :cond_f

    iget-object v4, v1, Ll/ۗ۟᩻;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    iget-object v4, v1, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;

    iget-boolean v4, v4, Ll/ۘܺۢ;->ᩳ:Z

    if-ne v4, v2, :cond_f

    iget-boolean v4, v1, Ll/ۗ۟᩻;->ۧ:Z

    if-eq v4, v3, :cond_0

    goto/16 :goto_8

    .line 408
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 409
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v6

    iget-wide v8, v1, Ll/ۗ۟᩻;->֫:J

    cmp-long v0, v6, v8

    if-nez v0, :cond_e

    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    iget-wide v8, v1, Ll/ۗ۟᩻;->ܽ:J

    cmp-long v0, v6, v8

    if-eqz v0, :cond_1

    goto/16 :goto_7

    .line 413
    :cond_1
    iget-object v0, v1, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;

    iget-wide v6, v0, Ll/ۘܺۢ;->ܺ:J

    iget-wide v8, v0, Ll/ۘܺۢ;->᩻:J

    sub-long/2addr v6, v8

    .line 414
    iget-wide v10, v0, Ll/ۘܺۢ;->ۜ:J

    sub-long/2addr v10, v8

    const-wide/16 v8, 0x0

    cmp-long v4, v6, v8

    if-ltz v4, :cond_d

    cmp-long v4, v10, v8

    if-ltz v4, :cond_d

    .line 415
    iget-wide v12, v0, Ll/ۘܺۢ;->ۡ:J

    cmp-long v4, v12, v8

    if-gez v4, :cond_2

    goto/16 :goto_6

    :cond_2
    if-eqz v2, :cond_3

    move-wide v14, v6

    goto :goto_0

    :cond_3
    move-wide v14, v10

    :goto_0
    cmp-long v17, p2, v14

    if-ltz v17, :cond_c

    if-eqz v4, :cond_c

    const-wide v17, 0x7fffffffffffffffL

    sub-long v19, v17, v14

    cmp-long v4, v19, v12

    if-gez v4, :cond_4

    goto/16 :goto_5

    :cond_4
    sub-long v26, p2, v14

    cmp-long v4, v26, v12

    if-gez v4, :cond_b

    sub-long v12, v17, v6

    cmp-long v4, v12, v26

    if-ltz v4, :cond_b

    sub-long v12, v17, v10

    cmp-long v4, v12, v26

    if-gez v4, :cond_5

    goto :goto_4

    .line 427
    :cond_5
    iget-object v0, v0, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    if-eqz v3, :cond_a

    .line 429
    iget-boolean v3, v0, Ll/ۖܺۢ;->ۧ:Z

    if-eqz v3, :cond_9

    iget-wide v3, v0, Ll/ۖܺۢ;->ۜ:J

    cmp-long v12, v3, v8

    if-ltz v12, :cond_9

    iget-wide v12, v0, Ll/ۖܺۢ;->ܳ:J

    cmp-long v14, v12, v8

    if-lez v14, :cond_9

    sub-long v17, v17, v12

    cmp-long v8, v3, v17

    if-lez v8, :cond_6

    goto :goto_2

    :cond_6
    add-long v8, v6, v26

    add-long/2addr v12, v3

    cmp-long v14, v8, v3

    if-ltz v14, :cond_8

    cmp-long v14, v8, v12

    if-ltz v14, :cond_7

    goto :goto_1

    :cond_7
    sub-long/2addr v8, v3

    .line 438
    invoke-virtual {v0, v8, v9}, Ll/ۖܺۢ;->֫(J)Ll/ۖܺۢ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 436
    :cond_8
    :goto_1
    monitor-exit v16

    return-object v5

    .line 431
    :cond_9
    :goto_2
    monitor-exit v16

    return-object v5

    :cond_a
    :goto_3
    move-object/from16 v33, v0

    .line 440
    :try_start_1
    iget-object v0, v1, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;

    iget-object v3, v0, Ll/ۘܺۢ;->᩷:Ljava/lang/String;

    add-long v22, v6, v26

    add-long v24, v10, v26

    iget-wide v4, v0, Ll/ۘܺۢ;->ۡ:J

    iget-boolean v6, v0, Ll/ۘܺۢ;->ۢ:Z

    iget-boolean v7, v0, Ll/ۘܺۢ;->ܳ:Z

    iget-boolean v0, v0, Ll/ۘܺۢ;->ܿ:Z

    const/16 v17, 0x1

    move/from16 v18, p4

    move-wide/from16 v19, p2

    move-object/from16 v21, v3

    move-wide/from16 v28, v4

    move/from16 v30, v6

    move/from16 v31, v7

    move/from16 v32, v0

    invoke-static/range {v17 .. v33}, Ll/ۘܺۢ;->֫(ZZJLjava/lang/String;JJJJZZZLl/ۖܺۢ;)Ll/ۘܺۢ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v16

    return-object v0

    .line 425
    :cond_b
    :goto_4
    monitor-exit v16

    return-object v5

    .line 420
    :cond_c
    :goto_5
    monitor-exit v16

    return-object v5

    .line 416
    :cond_d
    :goto_6
    monitor-exit v16

    return-object v5

    .line 410
    :cond_e
    :goto_7
    :try_start_2
    iput-object v5, v1, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 411
    monitor-exit v16

    return-object v5

    .line 406
    :cond_f
    :goto_8
    monitor-exit v16

    return-object v5

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ll/ۘܺۢ;Z)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-eqz p3, :cond_0

    .line 450
    :try_start_0
    iget-object v1, p2, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    iget-boolean v1, v1, Ll/ۖܺۢ;->ۧ:Z

    if-nez v1, :cond_0

    const/4 p1, 0x0

    .line 451
    iput-object p1, p0, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    monitor-exit v0

    return-void

    .line 454
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 455
    iput-object p1, p0, Ll/ۗ۟᩻;->ܿ:Ljava/lang/String;

    .line 456
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۗ۟᩻;->֫:J

    .line 457
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ۟᩻;->ܽ:J

    .line 458
    iput-boolean p3, p0, Ll/ۗ۟᩻;->ۧ:Z

    .line 459
    iput-object p2, p0, Ll/ۗ۟᩻;->ᩳ:Ll/ۘܺۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 460
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
