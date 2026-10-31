.class public final Ll/ۖᩴܽ;
.super Ljava/lang/Object;
.source "R6PB"


# direct methods
.method public static ֫(Ll/ۜ֨ܽ;[I[ILl/ۖ۠ܽ;)Ll/ۖ۠ܽ;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 137
    :cond_0
    new-instance v0, Ll/ۖ۠ܽ;

    const/4 v1, 0x0

    aget v1, p1, v1

    div-int/lit8 v1, v1, 0x8

    aget v1, p2, v1

    const/4 v2, 0x1

    .line 138
    aget p1, p1, v2

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    div-int/lit8 p1, p1, 0x8

    aget v2, p2, p1

    :goto_0
    invoke-direct {v0, p0, v1, v2, p3}, Ll/ۖ۠ܽ;-><init>(Ll/ۜ֨ܽ;IILl/ۖ۠ܽ;)V

    return-object v0
.end method

.method public static ֫(Ll/֫֡ܽ;)Ll/ۢ۠ܽ;
    .locals 39

    move-object/from16 v0, p0

    .line 79
    iget v1, v0, Ll/֫֡ܽ;->ۧ:I

    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 84
    :goto_0
    iget-object v4, v0, Ll/֫֡ܽ;->ۡ:Ll/ۛۚܽ;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    or-int v14, v2, v3

    and-int/lit16 v1, v1, -0x400

    if-nez v1, :cond_50

    .line 92
    new-instance v1, Ll/ܺᩴܽ;

    iget v2, v0, Ll/֫֡ܽ;->ᩳ:I

    invoke-direct {v1, v2, v14}, Ll/ܺᩴܽ;-><init>(IZ)V

    .line 93
    iget-object v2, v0, Ll/֫֡ܽ;->᩻:Ll/ۛۚܽ;

    invoke-virtual {v1, v2}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v2

    .line 94
    invoke-static {v4}, Ll/ܳ۠ܽ;->ܽ(Ll/ۛۚܽ;)Ll/ۜ֨ܽ;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 95
    iget-object v5, v3, Ll/ۜ֨ܽ;->֫:Ll/ۛۚܽ;

    if-nez v5, :cond_2

    goto :goto_2

    .line 96
    :cond_2
    invoke-static {v5}, Ll/ܳ۠ܽ;->ܽ(Ll/ۛۚܽ;)Ll/ۜ֨ܽ;

    move-result-object v5

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v5, 0x0

    :goto_3
    if-eqz v3, :cond_5

    .line 97
    iget-object v6, v3, Ll/ۜ֨ܽ;->֫:Ll/ۛۚܽ;

    if-eqz v6, :cond_5

    if-eqz v5, :cond_4

    goto :goto_4

    .line 98
    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Unknown regex search fallback"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_4
    const/4 v6, -0x1

    if-nez v3, :cond_6

    const/4 v7, 0x0

    goto :goto_6

    .line 129
    :cond_6
    iget-object v7, v3, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    invoke-virtual {v1, v7}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v7

    .line 130
    iget-object v8, v3, Ll/ۜ֨ܽ;->ۢ:Ll/ۛۚܽ;

    if-nez v8, :cond_7

    const/4 v8, -0x1

    goto :goto_5

    :cond_7
    invoke-virtual {v1, v8}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v8

    .line 131
    :goto_5
    filled-new-array {v7, v8}, [I

    move-result-object v7

    :goto_6
    if-nez v5, :cond_8

    const/4 v8, 0x0

    goto :goto_8

    .line 129
    :cond_8
    iget-object v8, v5, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    invoke-virtual {v1, v8}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v8

    .line 130
    iget-object v9, v5, Ll/ۜ֨ܽ;->ۢ:Ll/ۛۚܽ;

    if-nez v9, :cond_9

    const/4 v9, -0x1

    goto :goto_7

    :cond_9
    invoke-virtual {v1, v9}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v9

    .line 131
    :goto_7
    filled-new-array {v8, v9}, [I

    move-result-object v8

    .line 102
    :goto_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    .line 103
    const-class v10, Ll/۫֡ܽ;

    if-eq v9, v10, :cond_b

    const-class v10, Ll/ۤ֡ܽ;

    if-ne v9, v10, :cond_a

    goto :goto_9

    :cond_a
    const/4 v9, 0x0

    goto :goto_a

    .line 104
    :cond_b
    :goto_9
    move-object v9, v4

    check-cast v9, Ll/۫֡ܽ;

    :goto_a
    if-nez v9, :cond_c

    const/4 v10, -0x1

    goto :goto_b

    .line 105
    :cond_c
    iget-object v10, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-virtual {v1, v10}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v10

    :goto_b
    if-eqz v9, :cond_d

    move v4, v2

    goto :goto_c

    .line 107
    :cond_d
    instance-of v11, v4, Ll/֡֨ܽ;

    if-eqz v11, :cond_e

    .line 108
    iget-object v4, v4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 107
    :cond_e
    invoke-virtual {v1, v4}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v4

    :goto_c
    const/4 v11, 0x0

    .line 110
    :goto_d
    iget-object v13, v1, Ll/ܺᩴܽ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v11, v15, :cond_f

    .line 111
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۛۚܽ;

    mul-int/lit8 v15, v11, 0x8

    invoke-virtual {v1, v13, v15}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_d

    .line 114
    :cond_f
    iget-object v11, v1, Ll/ܺᩴܽ;->ᩳ:[I

    iget-object v15, v1, Ll/ܺᩴܽ;->ۜ:Ljava/util/ArrayList;

    invoke-static {v11, v15, v2}, Ll/᩻۠ܽ;->֫([ILjava/util/ArrayList;I)Ll/᩻۠ܽ;

    move-result-object v16

    .line 414
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v11

    .line 415
    new-array v12, v11, [I

    iput-object v12, v1, Ll/ܺᩴܽ;->ܽ:[I

    .line 416
    invoke-static {v12, v6}, Ljava/util/Arrays;->fill([II)V

    .line 417
    new-array v6, v11, [I

    const/4 v12, 0x0

    move/from16 v18, v14

    .line 418
    :goto_e
    iget-boolean v14, v1, Ll/ܺᩴܽ;->ۧ:Z

    if-ge v12, v11, :cond_15

    mul-int/lit8 v19, v12, 0x8

    .line 419
    iget-object v0, v1, Ll/ܺᩴܽ;->ܽ:[I

    const/16 v20, 0x0

    move-object/from16 v20, v3

    const/4 v3, 0x0

    .line 461
    :goto_f
    div-int/lit8 v21, v19, 0x8

    move-object/from16 v22, v7

    aget v7, v0, v21

    move-object/from16 v23, v5

    const/4 v5, -0x1

    const/16 v24, -0x2

    if-ne v7, v5, :cond_12

    .line 462
    iget-object v5, v1, Ll/ܺᩴܽ;->ᩳ:[I

    aget v7, v5, v19

    move-object/from16 v25, v8

    const/16 v8, 0xb

    if-eq v7, v8, :cond_11

    if-nez v14, :cond_10

    const/16 v8, 0x8

    if-ne v7, v8, :cond_10

    add-int/lit8 v7, v19, 0x3

    aget v7, v5, v7

    if-nez v7, :cond_10

    add-int/lit8 v7, v19, 0x2

    aget v7, v5, v7

    iget-object v8, v1, Ll/ܺᩴܽ;->᩷:[Z

    aget-boolean v7, v8, v7

    if-eqz v7, :cond_11

    .line 464
    :cond_10
    aput v19, v0, v21

    goto :goto_10

    .line 467
    :cond_11
    aput v24, v0, v21

    add-int/lit8 v7, v3, 0x1

    .line 468
    aput v19, v6, v3

    add-int/lit8 v19, v19, 0x1

    .line 469
    aget v19, v5, v19

    move v3, v7

    move-object/from16 v7, v22

    move-object/from16 v5, v23

    move-object/from16 v8, v25

    goto :goto_f

    :cond_12
    move-object/from16 v25, v8

    .line 471
    :goto_10
    aget v5, v0, v21

    const/4 v7, -0x2

    if-eq v5, v7, :cond_14

    const/4 v7, 0x0

    :goto_11
    if-ge v7, v3, :cond_13

    .line 475
    aget v8, v6, v7

    div-int/lit8 v8, v8, 0x8

    aput v5, v0, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    :cond_13
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, v20

    move-object/from16 v7, v22

    move-object/from16 v5, v23

    move-object/from16 v8, v25

    goto :goto_e

    .line 473
    :cond_14
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Regex program encountered an empty jump cycle"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move-object/from16 v20, v3

    move-object/from16 v23, v5

    move-object/from16 v22, v7

    move-object/from16 v25, v8

    const/4 v0, 0x0

    :goto_12
    mul-int/lit8 v3, v11, 0x8

    if-ge v0, v3, :cond_1c

    .line 422
    iget-object v3, v1, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v5, v0, 0x1

    aget v6, v3, v5

    const/4 v7, -0x1

    if-eq v6, v7, :cond_16

    iget-object v7, v1, Ll/ܺᩴܽ;->ܽ:[I

    div-int/lit8 v6, v6, 0x8

    aget v6, v7, v6

    aput v6, v3, v5

    .line 423
    :cond_16
    aget v5, v3, v0

    const/4 v6, 0x6

    if-ne v5, v6, :cond_17

    add-int/lit8 v5, v0, 0x2

    .line 424
    aget v3, v3, v5

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    const/4 v5, 0x0

    .line 425
    :goto_13
    array-length v6, v3

    if-ge v5, v6, :cond_1b

    .line 426
    iget-object v6, v1, Ll/ܺᩴܽ;->ܽ:[I

    aget v7, v3, v5

    div-int/lit8 v7, v7, 0x8

    aget v6, v6, v7

    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_17
    const/16 v6, 0xa

    if-eq v5, v6, :cond_1a

    const/16 v6, 0x9

    if-eq v5, v6, :cond_1a

    const/16 v6, 0x13

    if-eq v5, v6, :cond_1a

    const/16 v6, 0x12

    if-eq v5, v6, :cond_1a

    const/16 v6, 0x1b

    if-eq v5, v6, :cond_1a

    const/16 v6, 0x1a

    if-ne v5, v6, :cond_18

    goto :goto_14

    :cond_18
    const/16 v6, 0x16

    if-eq v5, v6, :cond_19

    const/16 v6, 0x19

    if-ne v5, v6, :cond_1b

    :cond_19
    add-int/lit8 v5, v0, 0x3

    .line 433
    iget-object v6, v1, Ll/ܺᩴܽ;->ܽ:[I

    aget v7, v3, v5

    div-int/lit8 v7, v7, 0x8

    aget v6, v6, v7

    aput v6, v3, v5

    goto :goto_15

    :cond_1a
    :goto_14
    add-int/lit8 v5, v0, 0x6

    .line 431
    iget-object v6, v1, Ll/ܺᩴܽ;->ܽ:[I

    aget v7, v3, v5

    div-int/lit8 v7, v7, 0x8

    aget v6, v6, v7

    aput v6, v3, v5

    :cond_1b
    :goto_15
    add-int/lit8 v0, v0, 0x8

    goto :goto_12

    :cond_1c
    const/4 v0, 0x0

    :goto_16
    if-ge v0, v3, :cond_2c

    if-eqz v14, :cond_1d

    goto/16 :goto_1f

    .line 438
    :cond_1d
    iget-object v5, v1, Ll/ܺᩴܽ;->ᩳ:[I

    aget v6, v5, v0

    const/16 v7, 0xa

    if-eq v6, v7, :cond_2a

    const/16 v7, 0x9

    if-ne v6, v7, :cond_1e

    goto/16 :goto_1d

    :cond_1e
    const/4 v7, 0x7

    if-ne v6, v7, :cond_28

    add-int/lit8 v6, v0, 0x1

    .line 480
    aget v7, v5, v6

    .line 481
    aget v8, v5, v7

    const/4 v11, 0x1

    if-ne v8, v11, :cond_1f

    const/4 v8, 0x1

    goto :goto_17

    :cond_1f
    const/4 v8, 0x0

    :goto_17
    if-eqz v8, :cond_20

    add-int/lit8 v11, v7, 0x1

    .line 482
    aget v11, v5, v11

    goto :goto_18

    :cond_20
    move v11, v7

    .line 483
    :goto_18
    aget v12, v5, v11

    move/from16 v19, v3

    const/4 v3, 0x4

    if-eq v12, v3, :cond_21

    move-object/from16 v24, v9

    move/from16 v21, v10

    goto/16 :goto_1e

    :cond_21
    add-int/lit8 v3, v11, 0x1

    .line 484
    aget v3, v5, v3

    .line 485
    aget v12, v5, v3

    move/from16 v21, v10

    const/16 v10, 0x8

    if-ne v12, v10, :cond_27

    add-int/lit8 v10, v3, 0x2

    aget v10, v5, v10

    add-int/lit8 v12, v0, 0x2

    move-object/from16 v24, v9

    aget v9, v5, v12

    if-ne v10, v9, :cond_2b

    add-int/lit8 v9, v3, 0x3

    aget v9, v5, v9

    if-lez v9, :cond_2b

    add-int/lit8 v3, v3, 0x1

    aget v3, v5, v3

    aget v3, v5, v3

    if-eqz v3, :cond_22

    goto/16 :goto_1e

    :cond_22
    add-int/lit8 v3, v11, 0x2

    .line 487
    aget v3, v5, v3

    add-int/lit8 v11, v11, 0x3

    .line 488
    aget v10, v5, v11

    if-eqz v8, :cond_23

    const/16 v11, 0xc

    goto :goto_19

    :cond_23
    const/16 v11, 0xd

    .line 490
    :goto_19
    aput v11, v5, v0

    const/4 v11, -0x1

    .line 491
    aput v11, v5, v6

    if-eqz v8, :cond_24

    add-int/lit8 v7, v7, 0x2

    .line 492
    aget v6, v5, v7

    goto :goto_1a

    :cond_24
    move v6, v3

    :goto_1a
    aput v6, v5, v12

    add-int/lit8 v6, v0, 0x3

    if-eqz v8, :cond_25

    goto :goto_1b

    :cond_25
    move v3, v10

    .line 493
    :goto_1b
    aput v3, v5, v6

    add-int/lit8 v3, v0, 0x4

    .line 494
    aput v9, v5, v3

    add-int/lit8 v3, v0, 0x5

    if-eqz v8, :cond_26

    goto :goto_1c

    :cond_26
    const/4 v10, 0x0

    .line 495
    :goto_1c
    aput v10, v5, v3

    goto :goto_1e

    :cond_27
    move-object/from16 v24, v9

    goto :goto_1e

    :cond_28
    move/from16 v19, v3

    move-object/from16 v24, v9

    move/from16 v21, v10

    const/16 v3, 0xe

    if-ne v6, v3, :cond_2b

    add-int/lit8 v3, v0, 0x1

    .line 448
    aget v3, v5, v3

    .line 450
    aget v6, v5, v3

    const/4 v7, 0x1

    if-eq v6, v7, :cond_29

    const/4 v7, 0x3

    if-ne v6, v7, :cond_2b

    :cond_29
    add-int/lit8 v3, v3, 0x1

    aget v3, v5, v3

    aget v3, v5, v3

    if-nez v3, :cond_2b

    add-int/lit8 v3, v0, 0x3

    const/4 v6, 0x1

    .line 451
    aput v6, v5, v3

    goto :goto_1e

    :cond_2a
    :goto_1d
    move/from16 v19, v3

    move-object/from16 v24, v9

    move/from16 v21, v10

    add-int/lit8 v3, v0, 0x6

    .line 439
    aget v6, v5, v3

    .line 440
    aget v7, v5, v6

    const/4 v8, 0x7

    if-ne v7, v8, :cond_2b

    add-int/lit8 v7, v6, 0x2

    aget v7, v5, v7

    add-int/lit8 v8, v0, 0x3

    aget v8, v5, v8

    if-ne v7, v8, :cond_2b

    add-int/lit8 v6, v6, 0x1

    .line 442
    aget v6, v5, v6

    aput v6, v5, v3

    add-int/lit8 v3, v0, 0x7

    const/4 v6, 0x1

    .line 443
    aput v6, v5, v3

    :cond_2b
    :goto_1e
    add-int/lit8 v0, v0, 0x8

    move/from16 v3, v19

    move/from16 v10, v21

    move-object/from16 v9, v24

    goto/16 :goto_16

    :cond_2c
    :goto_1f
    move-object/from16 v24, v9

    move/from16 v21, v10

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 502
    :goto_20
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v6

    mul-int/lit8 v6, v6, 0x8

    if-ge v0, v6, :cond_4b

    .line 503
    iget-object v6, v1, Ll/ܺᩴܽ;->ᩳ:[I

    aget v6, v6, v0

    const/4 v7, 0x6

    if-eq v6, v7, :cond_2d

    move-object/from16 v17, v1

    move/from16 v30, v2

    move/from16 v19, v4

    move-object v2, v13

    goto/16 :goto_36

    :cond_2d
    if-nez v3, :cond_2e

    .line 504
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Ll/ۜ۠ܽ;

    .line 505
    :cond_2e
    iget-object v6, v1, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v7, v0, 0x2

    aget v6, v6, v7

    .line 506
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [I

    if-nez v14, :cond_48

    .line 508
    array-length v8, v7

    if-lez v8, :cond_48

    array-length v8, v7

    const/16 v9, 0x1f

    if-gt v8, v9, :cond_48

    if-nez v5, :cond_2f

    .line 509
    new-instance v5, Ll/ۢᩴܽ;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v5, v8}, Ll/ۢᩴܽ;-><init>(I)V

    .line 510
    :cond_2f
    iget-object v8, v5, Ll/ۢᩴܽ;->ۧ:[J

    iget-object v9, v5, Ll/ۢᩴܽ;->֫:[J

    const/16 v10, 0x80

    new-array v10, v10, [I

    const/4 v11, 0x0

    .line 511
    :goto_21
    array-length v12, v7

    const-wide/16 v26, 0x1

    if-ge v11, v12, :cond_45

    .line 512
    aget v12, v7, v11

    move/from16 v19, v4

    .line 547
    iget-object v4, v5, Ll/ۢᩴܽ;->ܽ:[B

    div-int/lit8 v28, v12, 0x8

    move-object/from16 v29, v5

    aget-byte v5, v4, v28

    move/from16 v30, v2

    const/4 v2, 0x2

    if-ne v5, v2, :cond_31

    :cond_30
    move-object/from16 v17, v1

    move-object/from16 v31, v3

    move/from16 v32, v6

    move-object/from16 v35, v13

    goto/16 :goto_2e

    .line 548
    :cond_31
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x1

    .line 549
    aput-byte v5, v4, v28

    .line 550
    new-instance v5, Ll/ۡᩴܽ;

    invoke-direct {v5, v12}, Ll/ۡᩴܽ;-><init>(I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x1

    .line 551
    :goto_22
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_30

    .line 0
    invoke-static {v2, v5}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v5

    .line 552
    check-cast v5, Ll/ۡᩴܽ;

    .line 553
    iget v12, v5, Ll/ۡᩴܽ;->ۧ:I

    div-int/lit8 v28, v12, 0x8

    move-object/from16 v31, v3

    .line 554
    iget-object v3, v1, Ll/ܺᩴܽ;->ᩳ:[I

    move/from16 v32, v6

    aget v6, v3, v12

    const-wide/16 v33, -0x1

    move-object/from16 v35, v13

    const/4 v13, 0x7

    if-eq v6, v13, :cond_3c

    const/16 v13, 0xb

    if-eq v6, v13, :cond_3c

    const/4 v13, 0x6

    if-ne v6, v13, :cond_32

    goto/16 :goto_28

    :cond_32
    const/4 v5, 0x3

    if-ne v6, v5, :cond_35

    add-int/lit8 v12, v12, 0x2

    .line 589
    aget v3, v3, v12

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    .line 590
    array-length v5, v3

    if-nez v5, :cond_33

    .line 591
    aput-wide v33, v9, v28

    aput-wide v33, v8, v28

    const/4 v13, 0x0

    goto/16 :goto_26

    :cond_33
    const/4 v13, 0x0

    .line 592
    aget v3, v3, v13

    if-ltz v3, :cond_3b

    const/16 v5, 0x80

    if-ge v3, v5, :cond_3b

    const/16 v5, 0x40

    if-ge v3, v5, :cond_34

    shl-long v5, v26, v3

    .line 593
    aput-wide v5, v8, v28

    goto :goto_26

    :cond_34
    shl-long v5, v26, v3

    .line 594
    aput-wide v5, v9, v28

    goto :goto_26

    :cond_35
    const/4 v13, 0x0

    const/4 v5, 0x1

    if-eq v6, v5, :cond_38

    const/4 v5, 0x2

    if-eq v6, v5, :cond_38

    const/16 v5, 0xc

    if-eq v6, v5, :cond_38

    const/4 v5, 0x4

    if-eq v6, v5, :cond_36

    const/4 v5, 0x5

    if-eq v6, v5, :cond_36

    const/16 v5, 0xd

    if-ne v6, v5, :cond_37

    :cond_36
    add-int/lit8 v5, v12, 0x3

    .line 598
    aget v5, v3, v5

    if-lez v5, :cond_37

    goto :goto_23

    .line 609
    :cond_37
    aput-wide v33, v9, v28

    aput-wide v33, v8, v28

    goto :goto_26

    :cond_38
    :goto_23
    add-int/lit8 v12, v12, 0x2

    .line 601
    aget v3, v3, v12

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۚܽ;

    const/4 v5, 0x0

    :goto_24
    const/16 v6, 0x80

    if-ge v5, v6, :cond_3b

    .line 603
    invoke-interface {v3, v5}, Ll/ۧۚܽ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_3a

    const/16 v6, 0x40

    if-ge v5, v6, :cond_39

    .line 604
    aget-wide v33, v8, v28

    shl-long v36, v26, v5

    or-long v33, v33, v36

    aput-wide v33, v8, v28

    goto :goto_25

    .line 605
    :cond_39
    aget-wide v33, v9, v28

    shl-long v36, v26, v5

    or-long v33, v33, v36

    aput-wide v33, v9, v28

    :cond_3a
    :goto_25
    add-int/lit8 v5, v5, 0x1

    goto :goto_24

    :cond_3b
    :goto_26
    const/4 v3, 0x2

    .line 579
    aput-byte v3, v4, v28

    :goto_27
    const/4 v3, 0x1

    .line 0
    invoke-static {v2, v3}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    move-object/from16 v17, v1

    goto :goto_2d

    :cond_3c
    const/4 v13, 0x0

    const/16 v17, 0x6

    const/4 v13, 0x6

    :goto_28
    if-ne v6, v13, :cond_3d

    add-int/lit8 v12, v12, 0x2

    .line 556
    aget v3, v3, v12

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    goto :goto_29

    :cond_3d
    const/4 v3, 0x0

    :goto_29
    if-nez v3, :cond_3e

    const/4 v6, 0x1

    goto :goto_2a

    .line 557
    :cond_3e
    array-length v6, v3

    .line 558
    :goto_2a
    iget v12, v5, Ll/ۡᩴܽ;->֫:I

    if-ne v12, v6, :cond_3f

    const/4 v3, 0x2

    .line 559
    aput-byte v3, v4, v28

    goto :goto_27

    :cond_3f
    if-nez v3, :cond_40

    const/4 v3, 0x1

    .line 563
    iget-object v6, v1, Ll/ܺᩴܽ;->ᩳ:[I

    iget v13, v5, Ll/ۡᩴܽ;->ۧ:I

    add-int/lit8 v13, v13, 0x1

    aget v6, v6, v13

    goto :goto_2b

    :cond_40
    const/4 v6, 0x1

    aget v3, v3, v12

    move v6, v3

    const/4 v3, 0x1

    .line 564
    :goto_2b
    div-int/lit8 v13, v6, 0x8

    move-object/from16 v17, v1

    .line 565
    aget-byte v1, v4, v13

    if-nez v1, :cond_41

    .line 566
    aput-byte v3, v4, v13

    .line 567
    new-instance v1, Ll/ۡᩴܽ;

    invoke-direct {v1, v6}, Ll/ۡᩴܽ;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_41
    const/4 v3, 0x1

    if-ne v1, v3, :cond_42

    .line 571
    aput-wide v33, v9, v28

    aput-wide v33, v8, v28

    goto :goto_2c

    .line 573
    :cond_42
    aget-wide v33, v8, v28

    aget-wide v37, v8, v13

    or-long v33, v33, v37

    aput-wide v33, v8, v28

    .line 574
    aget-wide v33, v9, v28

    aget-wide v37, v9, v13

    or-long v33, v33, v37

    aput-wide v33, v9, v28

    :goto_2c
    add-int/lit8 v12, v12, 0x1

    .line 576
    iput v12, v5, Ll/ۡᩴܽ;->֫:I

    :goto_2d
    const/4 v5, 0x1

    move-object/from16 v1, v17

    move-object/from16 v3, v31

    move/from16 v6, v32

    move-object/from16 v13, v35

    goto/16 :goto_22

    .line 513
    :goto_2e
    aget v1, v7, v11

    div-int/lit8 v1, v1, 0x8

    .line 514
    aget-wide v2, v8, v1

    const/4 v4, 0x1

    shl-int/2addr v4, v11

    :goto_2f
    const-wide/16 v5, 0x0

    cmp-long v12, v2, v5

    if-eqz v12, :cond_43

    .line 540
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v5

    aget v6, v10, v5

    or-int/2addr v6, v4

    aput v6, v10, v5

    sub-long v5, v2, v26

    and-long/2addr v2, v5

    goto :goto_2f

    .line 515
    :cond_43
    aget-wide v1, v9, v1

    :goto_30
    cmp-long v3, v1, v5

    if-eqz v3, :cond_44

    .line 540
    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v3

    add-int/lit8 v3, v3, 0x40

    aget v12, v10, v3

    or-int/2addr v12, v4

    aput v12, v10, v3

    sub-long v12, v1, v26

    and-long/2addr v1, v12

    goto :goto_30

    :cond_44
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v17

    move/from16 v4, v19

    move-object/from16 v5, v29

    move/from16 v2, v30

    move-object/from16 v3, v31

    move/from16 v6, v32

    move-object/from16 v13, v35

    goto/16 :goto_21

    :cond_45
    move-object/from16 v17, v1

    move/from16 v30, v2

    move-object/from16 v31, v3

    move/from16 v19, v4

    move-object/from16 v29, v5

    move/from16 v32, v6

    move-object/from16 v35, v13

    .line 517
    array-length v1, v7

    shl-long v1, v26, v1

    sub-long v1, v1, v26

    long-to-int v2, v1

    const/4 v1, 0x0

    const/16 v3, 0x80

    :goto_31
    if-ge v1, v3, :cond_47

    .line 519
    aget v4, v10, v1

    if-eq v4, v2, :cond_46

    move-object/from16 v5, v29

    goto :goto_33

    :cond_46
    add-int/lit8 v1, v1, 0x1

    goto :goto_31

    :cond_47
    move-object/from16 v5, v29

    goto :goto_32

    :cond_48
    move-object/from16 v17, v1

    move/from16 v30, v2

    move-object/from16 v31, v3

    move/from16 v19, v4

    move/from16 v32, v6

    move-object/from16 v35, v13

    :goto_32
    const/4 v10, 0x0

    :goto_33
    if-eqz v14, :cond_49

    .line 528
    div-int/lit8 v1, v0, 0x8

    move-object/from16 v2, v35

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ֡ܽ;

    invoke-static {v1}, Ll/ܳ۠ܽ;->֫(Ll/ۨ֡ܽ;)[I

    move-result-object v1

    goto :goto_34

    :cond_49
    move-object/from16 v2, v35

    const/4 v1, 0x0

    .line 529
    :goto_34
    new-instance v3, Ll/ۜ۠ܽ;

    if-nez v1, :cond_4a

    const/4 v1, 0x0

    goto :goto_35

    :cond_4a
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    :goto_35
    invoke-direct {v3, v7, v10, v1}, Ll/ۜ۠ܽ;-><init>([I[I[I)V

    aput-object v3, v31, v32

    move-object/from16 v3, v31

    :goto_36
    add-int/lit8 v0, v0, 0x8

    move-object v13, v2

    move-object/from16 v1, v17

    move/from16 v4, v19

    move/from16 v2, v30

    goto/16 :goto_20

    :cond_4b
    move-object/from16 v17, v1

    move/from16 v30, v2

    move/from16 v19, v4

    move-object v2, v13

    if-nez v3, :cond_4d

    :cond_4c
    move-object/from16 v0, v17

    goto :goto_38

    :cond_4d
    const/4 v0, 0x0

    .line 532
    :goto_37
    array-length v1, v3

    if-ge v0, v1, :cond_4c

    .line 533
    aget-object v1, v3, v0

    if-eqz v1, :cond_4e

    invoke-virtual {v15, v0, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_4e
    add-int/lit8 v0, v0, 0x1

    goto :goto_37

    .line 455
    :goto_38
    iget-object v1, v0, Ll/ܺᩴܽ;->ܽ:[I

    div-int/lit8 v3, v30, 0x8

    aget v8, v1, v3

    .line 116
    div-int/lit8 v4, v19, 0x8

    aget v9, v1, v4

    if-nez v24, :cond_4f

    const/4 v1, 0x0

    move-object v13, v1

    goto :goto_39

    .line 118
    :cond_4f
    new-instance v3, Ll/۫᩵ܽ;

    div-int/lit8 v10, v21, 0x8

    aget v1, v1, v10

    move-object/from16 v4, v24

    invoke-direct {v3, v4, v1}, Ll/۫᩵ܽ;-><init>(Ll/۫֡ܽ;I)V

    move-object v13, v3

    .line 119
    :goto_39
    iget-object v1, v0, Ll/ܺᩴܽ;->ܽ:[I

    const/4 v3, 0x0

    move-object/from16 v5, v23

    move-object/from16 v4, v25

    invoke-static {v5, v4, v1, v3}, Ll/ۖᩴܽ;->֫(Ll/ۜ֨ܽ;[I[ILl/ۖ۠ܽ;)Ll/ۖ۠ܽ;

    move-result-object v1

    .line 120
    iget-object v3, v0, Ll/ܺᩴܽ;->ܽ:[I

    move-object/from16 v4, v20

    move-object/from16 v7, v22

    invoke-static {v4, v7, v3, v1}, Ll/ۖᩴܽ;->֫(Ll/ۜ֨ܽ;[I[ILl/ۖ۠ܽ;)Ll/ۖ۠ܽ;

    move-result-object v1

    .line 121
    new-instance v3, Ll/ۢ۠ܽ;

    iget-object v4, v0, Ll/ܺᩴܽ;->ᩳ:[I

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    .line 122
    invoke-virtual {v15}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v2, p0

    iget v10, v2, Ll/֫֡ܽ;->ᩳ:I

    iget-boolean v11, v0, Ll/ܺᩴܽ;->ܿ:Z

    iget-boolean v12, v0, Ll/ܺᩴܽ;->ܳ:Z

    iget-object v0, v2, Ll/֫֡ܽ;->ۡ:Ll/ۛۚܽ;

    iget-object v2, v2, Ll/֫֡ܽ;->᩻:Ll/ۛۚܽ;

    move-object v5, v3

    move/from16 v14, v18

    move-object v15, v1

    move-object/from16 v17, v0

    move-object/from16 v18, v2

    invoke-direct/range {v5 .. v18}, Ll/ۢ۠ܽ;-><init>([I[Ljava/lang/Object;IIIZZLl/۫᩵ܽ;ZLl/ۖ۠ܽ;Ll/᩻۠ܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V

    return-object v3

    :cond_50
    move-object v2, v0

    .line 90
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Regex program does not support flags: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v2, Ll/֫֡ܽ;->ۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
