.class public final Ll/᩺ۢ۠;
.super Ll/ۨۢ۠;
.source "G7LX"


# direct methods
.method private ֫(Ll/ۙ֨֨;Ll/֨֡۠;Ljava/lang/String;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 18

    move-object/from16 v1, p0

    .line 466
    iget-object v0, v1, Ll/֫ۡ۠;->ܽ:Ll/ۛܶ۠;

    iget-object v2, v1, Ll/֫ۡ۠;->֫:Ll/۬᩷۠;

    new-instance v7, Ll/ۧ֨֨;

    .line 468
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v3

    iget-object v4, v1, Ll/֫ۡ۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v5, v4, Ll/᩷ۚ֨;->ۢ֫:Ll/ܳ֡֨;

    iget-object v6, v4, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    move-object/from16 v8, p1

    move-object/from16 v9, p5

    invoke-direct {v7, v9, v8, v3, v5}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    .line 471
    iget-object v9, v1, Ll/֫ۡ۠;->ۧ:Ll/ܿ֨۠;

    iget v10, v9, Ll/ܿ֨۠;->ܽ:I

    move-object/from16 v3, p2

    .line 473
    :try_start_0
    invoke-virtual {v9, v3}, Ll/ܿ֨۠;->֫(Ll/ۗ۠۠;)V

    .line 475
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 476
    new-instance v8, Ll/ᩴܶ۠;

    invoke-direct {v8}, Ll/ᩴܶ۠;-><init>()V

    .line 477
    invoke-virtual/range {p4 .. p4}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۠ۢ۠;

    .line 227
    invoke-virtual {v8, v12}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 482
    :cond_0
    iget-object v11, v4, Ll/᩷ۚ֨;->ۡ֫:Ll/ۙ֨֨;

    iget-object v12, v4, Ll/᩷ۚ֨;->ۖ֫:Ll/ۙ֨֨;

    invoke-static {v11, v6, v12}, Ll/ۖܶ۠;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v11

    .line 485
    invoke-virtual {v11, v6}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v6

    .line 486
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    .line 281
    invoke-virtual {v5, v6}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v16

    .line 488
    iget-object v11, v1, Ll/֫ۡ۠;->ᩳ:Ll/᩹ܽ۠;

    .line 489
    invoke-virtual {v2}, Ll/۬᩷۠;->ᩳ()Ll/֫ۤ֨;

    move-result-object v13

    iget-object v14, v4, Ll/᩷ۚ֨;->ܳۧ:Ll/ۙ֨֨;

    iget-object v15, v0, Ll/ۛܶ۠;->۫ۧ:Ll/ۤܶ۠;

    const/16 v17, 0x0

    move-object/from16 v12, p2

    .line 488
    invoke-virtual/range {v11 .. v17}, Ll/᩹ܽ۠;->֫(Ll/ۗ۠۠;Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۘ֡֨;

    move-result-object v3

    .line 495
    new-instance v11, Ll/ۢ֡֨;

    iget-object v0, v0, Ll/ۛܶ۠;->۫ۧ:Ll/ۤܶ۠;

    iget-object v5, v4, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    .line 497
    invoke-virtual {v3}, Ll/ۘ֡֨;->᩹֫()Ll/ܺ֡֨;

    move-result-object v6

    .line 499
    invoke-static/range {p3 .. p3}, Ll/ۚۢ۠;->֫(Ljava/lang/String;)Ll/֨ۢ۠;

    move-result-object v3

    invoke-static {v3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    .line 289
    invoke-virtual {v8}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v4

    .line 281
    invoke-virtual {v4, v3}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    .line 500
    invoke-virtual {v8}, Ll/ᩴܶ۠;->size()I

    move-result v4

    new-array v4, v4, [Ll/۠ۢ۠;

    invoke-virtual {v3, v4}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, [Ll/۠ۢ۠;

    move-object v3, v11

    move-object v4, v0

    invoke-direct/range {v3 .. v8}, Ll/ۢ֡֨;-><init>(Ll/ۤܶ۠;Ll/ۛ֡֨;Ll/ܺ֡֨;Ll/ۧ֨֨;[Ll/۠ۢ۠;)V

    .line 502
    invoke-virtual {v2}, Ll/۬᩷۠;->ܳ()Ll/ܳۢ۠;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    .line 444
    invoke-virtual {v11, v2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v3

    invoke-static {v3}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    .line 487
    iget-object v3, v11, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    .line 488
    invoke-virtual {v11, v2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v2

    check-cast v2, Ll/ۧ֨֨;

    .line 489
    iget-object v3, v2, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    invoke-static {v3}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v3

    .line 490
    iget-object v4, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-virtual {v4, v11, v2}, Ll/֨᩷۠;->֫(Ll/ۢ֡֨;Ll/ۧ֨֨;)V

    .line 491
    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    iput v10, v9, Ll/ܿ֨۠;->ܽ:I

    return-void

    :catchall_0
    move-exception v0

    iput v10, v9, Ll/ܿ֨۠;->ܽ:I

    .line 506
    throw v0
.end method


# virtual methods
.method public final ֫(Ll/֨֡۠;Ll/ۖܶ۠;ZLl/ۙ֨֨;)V
    .locals 18

    move-object/from16 v6, p0

    .line 405
    invoke-static/range {p2 .. p2}, Ll/ۨۢ۠;->֫(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v7

    .line 408
    invoke-virtual {v7}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, v6, Ll/֫ۡ۠;->ܳ:Ll/᩷ۚ֨;

    if-eqz v1, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܶ۠;

    .line 409
    invoke-virtual {v1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v9

    const-string v4, "Arguments list is empty"

    invoke-static {v4, v2}, Ll/۫ۙ;->֫(Ljava/lang/String;Z)V

    .line 411
    new-instance v2, Ljava/lang/StringBuilder;

    .line 218
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    .line 411
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 412
    new-instance v4, Ll/ᩴܶ۠;

    invoke-direct {v4}, Ll/ᩴܶ۠;-><init>()V

    .line 413
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 415
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v10, v0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۚ۠;

    .line 416
    iget-object v11, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v11}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v11

    const-string v12, ""

    .line 417
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    .line 418
    :cond_0
    iget-object v12, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object v13, v3, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    if-ne v12, v13, :cond_1

    const/4 v0, 0x0

    .line 420
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    if-eqz v11, :cond_4

    .line 425
    invoke-virtual {v12}, Ll/ۙ֨֨;->᩶֫()Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x2

    .line 426
    invoke-virtual {v0, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_3

    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-eq v12, v13, :cond_2

    goto :goto_2

    .line 430
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 427
    :cond_3
    :goto_2
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 428
    invoke-static {v0}, Ll/ۚۢ۠;->֫(Ljava/lang/String;)Ll/֨ۢ۠;

    move-result-object v0

    .line 227
    invoke-virtual {v5, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 434
    :cond_4
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 435
    iget-object v11, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    if-eqz v10, :cond_5

    if-eqz p3, :cond_6

    .line 437
    :cond_5
    iget-object v10, v6, Ll/֫ۡ۠;->֫:Ll/۬᩷۠;

    invoke-virtual {v10, v11, v0}, Ll/۬᩷۠;->֫(Ll/ۙ֨֨;Ll/ۚۚ۠;)Ll/۟᩷۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟᩷۠;->ᩳ()Ll/۟᩷۠;

    .line 295
    :cond_6
    iget-object v0, v6, Ll/֫ۡ۠;->᩻:Ll/ۛ᩸֨;

    invoke-virtual {v0, v11}, Ll/ۛ᩸֨;->᩶(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, v11, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v10, v3, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    iget-object v10, v10, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-eq v0, v10, :cond_7

    .line 440
    iget-object v14, v3, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    iget-object v0, v6, Ll/֫ۡ۠;->ܽ:Ll/ۛܶ۠;

    iget-object v15, v0, Ll/ۛܶ۠;->᩸ܽ:Ll/ۤܶ۠;

    iget-object v0, v3, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v16

    const/16 v17, 0x1

    iget-object v12, v6, Ll/֫ۡ۠;->֫:Ll/۬᩷۠;

    move-object/from16 v13, p1

    invoke-virtual/range {v12 .. v17}, Ll/۬᩷۠;->֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Z)V

    .line 441
    iget-object v11, v3, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    .line 227
    :cond_7
    invoke-virtual {v4, v11}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    const/4 v10, 0x0

    goto/16 :goto_1

    .line 448
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v11

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p1

    move-object v4, v5

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Ll/᩺ۢ۠;->֫(Ll/ۙ֨֨;Ll/֨֡۠;Ljava/lang/String;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    move v0, v10

    goto/16 :goto_0

    .line 218
    :cond_9
    invoke-virtual {v7}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    if-le v0, v9, :cond_b

    .line 454
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 455
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    :goto_3
    invoke-virtual {v7}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    if-ge v2, v4, :cond_a

    .line 457
    iget-object v4, v3, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    invoke-virtual {v0, v4}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 458
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 460
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Ll/᩺ۢ۠;->֫(Ll/ۙ֨֨;Ll/֨֡۠;Ljava/lang/String;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    :cond_b
    return-void
.end method
