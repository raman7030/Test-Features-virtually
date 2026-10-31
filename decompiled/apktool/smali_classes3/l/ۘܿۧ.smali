.class public abstract Ll/ۘܿۧ;
.super Ll/ۚܿۧ;
.source "R8K8"


# virtual methods
.method public abstract ֫(Ll/ۖܿۧ;[[[I[ILl/ܺۧۧ;Ll/ۙ᩵֫;)Landroid/util/Pair;
.end method

.method public final ֫([Ll/ᩳ۬֫;Ll/ۛܽۧ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)Ll/֨ܿۧ;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 361
    array-length v2, v0

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [I

    .line 362
    array-length v3, v0

    add-int/lit8 v3, v3, 0x1

    new-array v4, v3, [[Ll/۬᩵֫;

    .line 363
    array-length v5, v0

    add-int/lit8 v5, v5, 0x1

    new-array v5, v5, [[[I

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_0

    .line 365
    iget v7, v1, Ll/ۛܽۧ;->ۧ:I

    new-array v8, v7, [Ll/۬᩵֫;

    aput-object v8, v4, v6

    .line 366
    new-array v7, v7, [[I

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 560
    :cond_0
    array-length v3, v0

    new-array v12, v3, [I

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v3, :cond_1

    .line 562
    aget-object v7, v0, v6

    invoke-interface {v7}, Ll/ᩳ۬֫;->᩵()I

    move-result v7

    aput v7, v12, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 376
    :goto_2
    iget v6, v1, Ll/ۛܽۧ;->ۧ:I

    if-ge v3, v6, :cond_a

    .line 377
    invoke-virtual {v1, v3}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v6

    .line 379
    iget v7, v6, Ll/۬᩵֫;->ܿ:I

    iget v8, v6, Ll/۬᩵֫;->ᩳ:I

    const/4 v9, 0x5

    if-ne v7, v9, :cond_2

    const/4 v7, 0x1

    goto :goto_3

    :cond_2
    const/4 v7, 0x0

    .line 504
    :goto_3
    array-length v9, v0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x1

    .line 507
    :goto_4
    array-length v14, v0

    if-ge v10, v14, :cond_7

    .line 508
    aget-object v14, v0, v10

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v8, :cond_3

    move-object/from16 v16, v12

    .line 514
    invoke-virtual {v6, v1}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v12

    invoke-interface {v14, v12}, Ll/ᩳ۬֫;->֫(Ll/۠ᩴ֫;)I

    move-result v12

    and-int/lit8 v12, v12, 0x7

    .line 515
    invoke-static {v15, v12}, Ljava/lang/Math;->max(II)I

    move-result v15

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v12, v16

    goto :goto_5

    :cond_3
    move-object/from16 v16, v12

    .line 517
    aget v1, v2, v10

    if-nez v1, :cond_4

    const/4 v1, 0x1

    goto :goto_6

    :cond_4
    const/4 v1, 0x0

    :goto_6
    if-gt v15, v11, :cond_5

    if-ne v15, v11, :cond_6

    if-eqz v7, :cond_6

    if-nez v13, :cond_6

    if-eqz v1, :cond_6

    :cond_5
    move v13, v1

    move v9, v10

    move v11, v15

    :cond_6
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p2

    move-object/from16 v12, v16

    goto :goto_4

    :cond_7
    move-object/from16 v16, v12

    .line 386
    array-length v1, v0

    if-ne v9, v1, :cond_8

    .line 387
    new-array v1, v8, [I

    goto :goto_8

    .line 388
    :cond_8
    aget-object v1, v0, v9

    .line 542
    new-array v7, v8, [I

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v8, :cond_9

    .line 544
    invoke-virtual {v6, v10}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v11

    invoke-interface {v1, v11}, Ll/ᩳ۬֫;->֫(Ll/۠ᩴ֫;)I

    move-result v11

    aput v11, v7, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_9
    move-object v1, v7

    .line 390
    :goto_8
    aget v7, v2, v9

    .line 391
    aget-object v8, v4, v9

    aput-object v6, v8, v7

    .line 392
    aget-object v6, v5, v9

    aput-object v1, v6, v7

    add-int/lit8 v7, v7, 0x1

    .line 393
    aput v7, v2, v9

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, p2

    move-object/from16 v12, v16

    goto/16 :goto_2

    :cond_a
    move-object/from16 v16, v12

    .line 397
    array-length v1, v0

    new-array v8, v1, [Ll/ۛܽۧ;

    .line 398
    array-length v1, v0

    new-array v1, v1, [Ljava/lang/String;

    .line 399
    array-length v3, v0

    new-array v7, v3, [I

    const/4 v3, 0x0

    .line 400
    :goto_9
    array-length v6, v0

    if-ge v3, v6, :cond_b

    .line 401
    aget v6, v2, v3

    .line 402
    new-instance v9, Ll/ۛܽۧ;

    aget-object v10, v4, v3

    .line 404
    invoke-static {v6, v10}, Ll/ۘ֨֫;->֫(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ll/۬᩵֫;

    invoke-direct {v9, v10}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    aput-object v9, v8, v3

    .line 405
    aget-object v9, v5, v3

    .line 406
    invoke-static {v6, v9}, Ll/ۘ֨֫;->֫(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[I

    aput-object v6, v5, v3

    .line 407
    aget-object v6, v0, v3

    invoke-interface {v6}, Ll/ᩳ۬֫;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v3

    .line 408
    aget-object v6, v0, v3

    check-cast v6, Ll/ۙ᩹֫;

    invoke-virtual {v6}, Ll/ۙ᩹֫;->ۖ()I

    move-result v6

    aput v6, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    .line 412
    :cond_b
    array-length v1, v0

    aget v1, v2, v1

    .line 413
    new-instance v11, Ll/ۛܽۧ;

    array-length v0, v0

    aget-object v0, v4, v0

    .line 415
    invoke-static {v1, v0}, Ll/ۘ֨֫;->֫(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۬᩵֫;

    invoke-direct {v11, v0}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    .line 419
    new-instance v0, Ll/ۖܿۧ;

    move-object v6, v0

    move-object/from16 v9, v16

    move-object v10, v5

    invoke-direct/range {v6 .. v11}, Ll/ۖܿۧ;-><init>([I[Ll/ۛܽۧ;[I[[[ILl/ۛܽۧ;)V

    move-object/from16 v6, p0

    move-object v7, v0

    move-object v8, v5

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    .line 429
    invoke-virtual/range {v6 .. v11}, Ll/ۘܿۧ;->֫(Ll/ۖܿۧ;[[[I[ILl/ܺۧۧ;Ll/ۙ᩵֫;)Landroid/util/Pair;

    move-result-object v1

    .line 436
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [Ll/ᩴܿۧ;

    .line 146
    array-length v3, v2

    new-array v3, v3, [Ljava/util/List;

    const/4 v4, 0x0

    .line 147
    :goto_a
    array-length v5, v2

    if-ge v4, v5, :cond_d

    .line 148
    aget-object v5, v2, v4

    if-eqz v5, :cond_c

    .line 149
    invoke-static {v5}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_b

    :cond_c
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v5

    :goto_b
    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    .line 166
    :cond_d
    new-instance v2, Ll/֫۬ܺ;

    invoke-direct {v2}, Ll/֫۬ܺ;-><init>()V

    const/4 v4, 0x0

    .line 168
    :goto_c
    invoke-virtual {v0}, Ll/ۖܿۧ;->֫()I

    move-result v5

    if-ge v4, v5, :cond_13

    .line 170
    invoke-virtual {v0, v4}, Ll/ۖܿۧ;->ۧ(I)Ll/ۛܽۧ;

    move-result-object v5

    .line 171
    aget-object v6, v3, v4

    const/4 v7, 0x0

    .line 172
    :goto_d
    iget v8, v5, Ll/ۛܽۧ;->ۧ:I

    if-ge v7, v8, :cond_12

    .line 173
    invoke-virtual {v5, v7}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v8

    .line 175
    invoke-virtual {v0, v4, v7}, Ll/ۖܿۧ;->֫(II)I

    move-result v9

    if-eqz v9, :cond_e

    const/4 v9, 0x1

    goto :goto_e

    :cond_e
    const/4 v9, 0x0

    .line 178
    :goto_e
    iget v10, v8, Ll/۬᩵֫;->ᩳ:I

    new-array v11, v10, [I

    .line 179
    new-array v10, v10, [Z

    const/4 v12, 0x0

    .line 180
    :goto_f
    iget v13, v8, Ll/۬᩵֫;->ᩳ:I

    if-ge v12, v13, :cond_11

    .line 182
    invoke-virtual {v0, v4, v7, v12}, Ll/ۖܿۧ;->֫(III)I

    move-result v13

    aput v13, v11, v12

    const/4 v13, 0x0

    .line 184
    :goto_10
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_10

    .line 185
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩴܿۧ;

    .line 186
    invoke-interface {v14}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v15

    invoke-virtual {v15, v8}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    .line 187
    invoke-interface {v14, v12}, Ll/ᩴܿۧ;->indexOf(I)I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_f

    const/4 v13, 0x1

    goto :goto_11

    :cond_f
    add-int/lit8 v13, v13, 0x1

    goto :goto_10

    :cond_10
    const/4 v13, 0x0

    .line 192
    :goto_11
    aput-boolean v13, v10, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_f

    .line 194
    :cond_11
    new-instance v12, Ll/᩺᩵֫;

    invoke-direct {v12, v8, v9, v11, v10}, Ll/᩺᩵֫;-><init>(Ll/۬᩵֫;Z[I[Z)V

    invoke-virtual {v2, v12}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    .line 197
    :cond_13
    invoke-virtual {v0}, Ll/ۖܿۧ;->ۧ()Ll/ۛܽۧ;

    move-result-object v3

    const/4 v4, 0x0

    .line 198
    :goto_12
    iget v5, v3, Ll/ۛܽۧ;->ۧ:I

    if-ge v4, v5, :cond_14

    .line 199
    invoke-virtual {v3, v4}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v5

    .line 200
    iget v6, v5, Ll/۬᩵֫;->ᩳ:I

    new-array v6, v6, [I

    const/4 v7, 0x0

    .line 201
    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([II)V

    .line 202
    iget v8, v5, Ll/۬᩵֫;->ᩳ:I

    new-array v8, v8, [Z

    .line 203
    new-instance v9, Ll/᩺᩵֫;

    invoke-direct {v9, v5, v7, v6, v8}, Ll/᩺᩵֫;-><init>(Ll/۬᩵֫;Z[I[Z)V

    invoke-virtual {v2, v9}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    .line 206
    :cond_14
    new-instance v3, Ll/ܰ᩵֫;

    invoke-virtual {v2}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v2

    invoke-direct {v3, v2}, Ll/ܰ᩵֫;-><init>(Ljava/util/List;)V

    .line 438
    new-instance v2, Ll/֨ܿۧ;

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [Ll/ܿ۬֫;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [Ll/ۢܿۧ;

    invoke-direct {v2, v4, v1, v3, v0}, Ll/֨ܿۧ;-><init>([Ll/ܿ۬֫;[Ll/ۢܿۧ;Ll/ܰ᩵֫;Ljava/lang/Object;)V

    return-object v2
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 348
    check-cast p1, Ll/ۖܿۧ;

    return-void
.end method
