.class public Ll/ܿ᩺ܳ;
.super Ll/᩹ܶۢ;
.source "E29Y"


# instance fields
.field public ۘ֫:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 388
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 389
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ᩺ܳ;->ۘ֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 6

    const-string p1, "compressToAnother"

    .line 519
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 520
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    :goto_0
    move v2, p1

    .line 521
    iget-object p1, p0, Ll/ܿ᩺ܳ;->ۘ֫:Ljava/util/List;

    invoke-static {p1}, Ll/᩻᩺ܳ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    move-object v0, p4

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Ll/᩻᩺ܳ;->֫(Ll/ܿ۠ۢ;ZZLl/ܽۢܳ;Ll/ܽۢܳ;Ljava/util/List;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "output"

    .line 398
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a26

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 393
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "output"

    .line 410
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v2, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const-string v3, "password"

    .line 412
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "level"

    .line 413
    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v4

    const-string v5, "deleteSources"

    .line 414
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "splitSize"

    .line 415
    invoke-virtual {v1, v6}, Ll/ۘ۠ۢ;->ۖ(Ljava/lang/String;)J

    move-result-wide v6

    const-string v8, "replaceExisting"

    .line 416
    invoke-virtual {v1, v8}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    .line 418
    invoke-static {v1, v2, v9}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Z)Ll/֫ۤܳ;

    move-result-object v10

    iget-object v11, v10, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    .line 419
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v12

    if-eqz v12, :cond_0

    .line 420
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide/16 v12, -0x1

    if-nez v8, :cond_2

    cmp-long v8, v6, v12

    if-eqz v8, :cond_1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v8, 0x1

    .line 423
    :goto_1
    invoke-static {v0, v8}, Ll/᩹۟ܳ;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩹۟ܳ;

    move-result-object v0

    .line 425
    invoke-virtual {v0}, Ll/᩹۟ܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v8

    .line 426
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    cmp-long v15, v6, v12

    if-nez v15, :cond_3

    .line 428
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-nez v15, :cond_4

    .line 431
    :try_start_0
    new-instance v6, Ll/ۡܰۡ;

    invoke-direct {v6, v8}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    goto :goto_2

    .line 432
    :cond_4
    new-instance v12, Ll/ۡܰۡ;

    new-instance v13, Ll/ۙۨܳ;

    invoke-direct {v13, v14}, Ll/ۙۨܳ;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v12, v8, v6, v7, v13}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;JLl/ۙۨܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-object v6, v12

    .line 434
    :goto_2
    :try_start_1
    invoke-virtual {v6, v3}, Ll/ۡܰۡ;->ᩳ(Ljava/lang/String;)V

    .line 435
    invoke-static {v4, v6}, Ll/᩷֨ܳ;->֫(ILl/ۡܰۡ;)Z

    move-result v3

    .line 436
    new-instance v4, Ll/ܶܶܽ;

    invoke-direct {v4}, Ll/ܶܶܽ;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v3, :cond_7

    .line 438
    :try_start_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۟۫ܳ;

    .line 439
    iget-boolean v13, v12, Ll/۟۫ܳ;->ᩳ:Z

    if-nez v13, :cond_5

    iget-object v13, v12, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    const-string v9, "AndroidManifest.xml"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 440
    iget-object v7, v12, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    :try_start_3
    invoke-static {v7}, Ll/ܶۨۡ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶۨۡ;

    move-result-object v7

    .line 200
    invoke-static {v7}, Ll/᩹ۨۡ;->ܳ(Ll/ܶۨۡ;)Z

    move-result v9

    iput-boolean v9, v4, Ll/ܶܶܽ;->ܽ:Z

    .line 201
    invoke-static {v7}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result v7

    iput-boolean v7, v4, Ll/ܶܶܽ;->ۧ:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catch_0
    const/4 v9, 0x0

    .line 203
    :try_start_4
    iput-boolean v9, v4, Ll/ܶܶܽ;->ܽ:Z

    .line 204
    iput-boolean v9, v4, Ll/ܶܶܽ;->ۧ:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :cond_6
    const/4 v9, 0x0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v3, v8

    goto/16 :goto_9

    .line 448
    :cond_7
    :goto_4
    :try_start_5
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v9, :cond_b

    :try_start_6
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۟۫ܳ;

    .line 449
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v11

    if-eqz v11, :cond_8

    goto/16 :goto_6

    .line 451
    :cond_8
    invoke-virtual {v10}, Ll/֫ۤܳ;->ܿ()V

    .line 453
    iget-boolean v11, v9, Ll/۟۫ܳ;->ᩳ:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    iget-wide v12, v9, Ll/۟۫ܳ;->᩷:J

    move-object/from16 v17, v7

    move-object/from16 v16, v8

    iget-wide v7, v9, Ll/۟۫ܳ;->ۢ:J

    move-object/from16 v18, v2

    iget-object v2, v9, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    move/from16 v19, v5

    const-string v5, "/"

    if-eqz v11, :cond_9

    .line 454
    :try_start_7
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 455
    new-instance v5, Ll/ۗ᩺ۡ;

    invoke-direct {v5, v2}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v5, v7, v8}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 457
    invoke-virtual {v6, v5}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    move-object/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v2, v18

    move/from16 v5, v19

    goto :goto_5

    .line 461
    :cond_9
    iget-object v9, v9, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v3, :cond_a

    .line 463
    invoke-static {v2, v4}, Ll/᩸ܶܽ;->֫(Ljava/lang/String;Ll/ܶܶܽ;)I

    move-result v11

    invoke-virtual {v6, v11}, Ll/ۡܰۡ;->ۧ(I)V

    .line 465
    :cond_a
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const v20, 0x7f1201df

    move/from16 v21, v3

    invoke-static/range {v20 .. v20}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "("

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ll/֫ۤܳ;->֫()I

    move-result v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ll/֫ۤܳ;->ܽ()I

    move-result v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 466
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 467
    new-instance v3, Ll/ۗ᩺ۡ;

    invoke-direct {v3, v2}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 468
    invoke-virtual {v3, v12, v13}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 469
    invoke-virtual {v3, v7, v8}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 470
    invoke-virtual {v6, v3}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 471
    invoke-virtual {v6}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v2

    new-instance v3, Ll/ᩳ᩺ܳ;

    invoke-direct {v3, v1, v10}, Ll/ᩳ᩺ܳ;-><init>(Ll/ܿ᩺ܳ;Ll/֫ۤܳ;)V

    invoke-virtual {v9, v2, v3}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V

    .line 483
    invoke-virtual {v10, v12, v13}, Ll/֫ۤܳ;->֫(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-object/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v2, v18

    move/from16 v5, v19

    move/from16 v3, v21

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object/from16 v3, v16

    goto/16 :goto_9

    :cond_b
    :goto_6
    move-object/from16 v18, v2

    move/from16 v19, v5

    move-object/from16 v16, v8

    .line 485
    :try_start_8
    invoke-virtual {v6}, Ll/ۡܰۡ;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 490
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 491
    invoke-static {v14}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 492
    invoke-virtual/range {v16 .. v16}, Ll/ܶ᩵ܿ;->۫()Z

    .line 493
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_c
    if-eqz v15, :cond_e

    .line 496
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual/range {v16 .. v16}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 502
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v3, v16

    invoke-virtual {v14, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_d
    move-object/from16 v3, v16

    .line 498
    invoke-static {v14}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 499
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۫()Z

    .line 500
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Unable to finalize ZIP split output: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v3, v2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    .line 500
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_7
    if-nez v15, :cond_f

    .line 505
    sget-object v2, Ll/᩸۟ܳ;->᩹:Ll/᩸۟ܳ;

    goto :goto_8

    .line 506
    :cond_f
    sget-object v2, Ll/᩸۟ܳ;->ۙ:Ll/᩸۟ܳ;

    .line 504
    :goto_8
    invoke-virtual {v0, v14, v2}, Ll/᩹۟ܳ;->֫(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Ll/ܿ᩺ܳ;->ۘ֫:Ljava/util/List;

    .line 508
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 509
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_10
    if-eqz v19, :cond_11

    .line 512
    iget-object v0, v1, Ll/ܿ᩺ܳ;->ۘ֫:Ljava/util/List;

    invoke-virtual {v10}, Ll/֫ۤܳ;->ܽ()I

    move-result v2

    move-object/from16 v3, v18

    invoke-static {v1, v3, v0, v2}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V

    .line 514
    :cond_11
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    move-object/from16 v3, v16

    goto :goto_b

    :catchall_2
    move-exception v0

    move-object v3, v8

    move-object v2, v0

    .line 430
    :goto_9
    :try_start_9
    invoke-virtual {v6}, Ll/ۡܰۡ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v4, v0

    :try_start_a
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    :catch_2
    move-exception v0

    goto :goto_b

    :catch_3
    move-exception v0

    move-object v3, v8

    .line 486
    :goto_b
    invoke-static {v14}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 487
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۫()Z

    .line 488
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 526
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 403
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 404
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
