.class public final Ll/ܰܽܽ;
.super Ljava/lang/Object;
.source "56JZ"


# direct methods
.method public static ֫(Ll/ۗۜܽ;II)I
    .locals 6

    if-ltz p1, :cond_1

    int-to-long v0, p1

    const-wide/16 v2, 0x8

    add-long/2addr v2, v0

    int-to-long v4, p2

    cmp-long p2, v2, v4

    if-gtz p2, :cond_1

    add-int/lit8 p2, p1, 0x4

    .line 90
    invoke-virtual {p0, p2}, Ll/ۗۜܽ;->ܽ(I)I

    move-result p2

    add-int/lit8 v2, p1, 0x2

    .line 91
    invoke-virtual {p0, v2}, Ll/ۗۜܽ;->ܳ(I)I

    move-result p0

    const/16 v2, 0x8

    if-lt p0, v2, :cond_0

    if-lt p2, p0, :cond_0

    int-to-long v2, p2

    add-long/2addr v0, v2

    cmp-long p0, v0, v4

    if-gtz p0, :cond_0

    add-int/2addr p1, p2

    return p1

    .line 93
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid chunk bounds"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 89
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid chunk offset"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۗۜܽ;I)Ll/ۤܽܽ;
    .locals 22

    move-object/from16 v0, p0

    .line 18
    :try_start_0
    new-instance v1, Ll/ۨܽܽ;

    .line 143
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-virtual/range {p0 .. p0}, Ll/ۗۜܽ;->֫()[B

    move-result-object v2

    array-length v2, v2

    move/from16 v3, p1

    :goto_0
    if-ge v3, v2, :cond_1b

    .line 21
    invoke-static {v0, v3, v2}, Ll/ܰܽܽ;->֫(Ll/ۗۜܽ;II)I

    move-result v4

    add-int/lit8 v5, v3, 0x2

    .line 22
    invoke-virtual {v0, v5}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v5

    const/16 v6, 0x11c

    if-ge v5, v6, :cond_0

    .line 23
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    .line 24
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    add-int/2addr v3, v5

    :goto_1
    if-ge v3, v4, :cond_18

    .line 27
    invoke-static {v0, v3, v4}, Ll/ܰܽܽ;->֫(Ll/ۗۜܽ;II)I

    move-result v5

    .line 28
    invoke-virtual {v0, v3}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v7

    add-int/lit8 v8, v3, 0x2

    .line 29
    invoke-virtual {v0, v8}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v8

    const/16 v9, 0x202

    if-eq v7, v9, :cond_1

    const/16 v10, 0x201

    if-ne v7, v10, :cond_5

    :cond_1
    const/16 v10, 0x10

    if-ge v8, v10, :cond_2

    .line 31
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    :cond_2
    add-int/lit8 v10, v3, 0x8

    .line 32
    invoke-virtual {v0, v10}, Ll/ۗۜܽ;->ܿ(I)I

    move-result v10

    .line 33
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩺ܽܽ;

    const/4 v12, 0x0

    if-nez v11, :cond_3

    .line 35
    new-instance v11, Ll/᩺ܽܽ;

    invoke-direct {v11, v12}, Ll/᩺ܽܽ;-><init>(I)V

    .line 36
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v6, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/high16 v10, 0x10000

    if-ne v7, v9, :cond_7

    add-int/lit8 v7, v3, 0xc

    .line 39
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v7

    if-ltz v7, :cond_6

    if-gt v7, v10, :cond_6

    int-to-long v9, v3

    int-to-long v12, v8

    add-long/2addr v9, v12

    int-to-long v12, v7

    const-wide/16 v14, 0x4

    mul-long v12, v12, v14

    add-long/2addr v12, v9

    int-to-long v9, v5

    cmp-long v14, v12, v9

    if-lez v14, :cond_4

    goto :goto_2

    :cond_4
    add-int/2addr v3, v8

    .line 42
    invoke-virtual {v0, v3, v7}, Ll/ۗۜܽ;->֫(II)[I

    move-result-object v3

    iput-object v3, v11, Ll/᩺ܽܽ;->ۧ:[I

    :cond_5
    move/from16 v18, v2

    move/from16 p1, v4

    move/from16 v19, v5

    move-object/from16 v20, v6

    goto/16 :goto_b

    .line 41
    :cond_6
    :goto_2
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    :cond_7
    const/16 v7, 0x18

    if-ge v8, v7, :cond_8

    .line 44
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    :cond_8
    add-int/lit8 v7, v3, 0x14

    .line 45
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v9

    const/16 v10, 0x1c

    if-eq v9, v10, :cond_a

    const/16 v10, 0x20

    if-eq v9, v10, :cond_a

    const/16 v10, 0x24

    if-eq v9, v10, :cond_a

    const/16 v10, 0x30

    if-eq v9, v10, :cond_a

    const/16 v10, 0x34

    if-ne v9, v10, :cond_9

    goto :goto_3

    :cond_9
    const/16 v10, 0x4c

    if-ne v9, v10, :cond_b

    :cond_a
    :goto_3
    const-wide/16 v12, 0x14

    int-to-long v9, v9

    add-long/2addr v9, v12

    int-to-long v12, v8

    cmp-long v14, v9, v12

    if-lez v14, :cond_c

    .line 50
    :cond_b
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    .line 51
    :cond_c
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v9

    sget-object v10, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    invoke-static {v9, v10}, Ll/᩸ܽܽ;->֫(Ll/ۛۜܽ;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object v9

    .line 52
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object v7

    .line 123
    sget-object v10, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    invoke-static {v7, v10}, Ll/᩸ܽܽ;->֫(Ll/ۛۜܽ;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object v7

    add-int/lit8 v14, v3, 0xc

    .line 53
    invoke-virtual {v0, v14}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v14

    add-int/lit8 v15, v3, 0x9

    .line 54
    invoke-virtual {v0, v15}, Ll/ۗۜܽ;->ܿ(I)I

    move-result v15

    and-int/lit8 v16, v15, 0x1

    const/16 v17, 0x1

    if-eqz v16, :cond_d

    const/16 v16, 0x1

    goto :goto_4

    :cond_d
    const/16 v16, 0x0

    :goto_4
    if-nez v16, :cond_e

    and-int/lit8 v15, v15, 0x2

    if-eqz v15, :cond_e

    goto :goto_5

    :cond_e
    const/16 v17, 0x0

    :goto_5
    if-eqz v17, :cond_f

    const/4 v15, 0x2

    goto :goto_6

    :cond_f
    const/4 v15, 0x4

    :goto_6
    move/from16 v18, v2

    add-int/lit8 v2, v3, 0x10

    .line 58
    invoke-virtual {v0, v2}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v2

    if-ltz v14, :cond_17

    move/from16 p1, v4

    const/high16 v4, 0x10000

    if-gt v14, v4, :cond_17

    if-lt v2, v8, :cond_17

    sub-int v4, v5, v3

    if-gt v2, v4, :cond_17

    move/from16 v19, v5

    int-to-long v4, v14

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    int-to-long v6, v15

    mul-long v6, v6, v4

    add-long/2addr v6, v12

    int-to-long v4, v2

    cmp-long v2, v6, v4

    if-lez v2, :cond_10

    goto :goto_c

    .line 61
    :cond_10
    new-array v2, v14, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v14, :cond_16

    add-int v6, v3, v8

    mul-int v7, v5, v15

    add-int/2addr v7, v6

    if-eqz v17, :cond_11

    .line 65
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v6

    goto :goto_8

    :cond_11
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v6

    :goto_8
    if-nez v16, :cond_13

    if-eqz v17, :cond_12

    const v10, 0xffff

    goto :goto_9

    :cond_12
    const/4 v10, -0x1

    :goto_9
    if-eq v6, v10, :cond_15

    :cond_13
    add-int/lit8 v6, v4, 0x1

    if-eqz v16, :cond_14

    .line 67
    invoke-virtual {v0, v7}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v7

    goto :goto_a

    :cond_14
    move v7, v5

    :goto_a
    aput v7, v2, v4

    move v4, v6

    :cond_15
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    .line 69
    :cond_16
    iget-object v3, v11, Ll/᩺ܽܽ;->֫:Ljava/util/ArrayList;

    new-instance v5, Ll/ۛܽܽ;

    move-object/from16 v6, v21

    invoke-direct {v5, v9, v6, v2, v4}, Ll/ۛܽܽ;-><init>(Ll/᩸ܽܽ;Ll/᩸ܽܽ;[II)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_b
    move/from16 v4, p1

    move/from16 v2, v18

    move/from16 v3, v19

    move-object/from16 v6, v20

    goto/16 :goto_1

    :cond_17
    :goto_c
    return-object v10

    :cond_18
    move/from16 v18, v2

    move/from16 p1, v4

    move-object/from16 v20, v6

    .line 74
    invoke-virtual/range {v20 .. v20}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܽܽ;

    .line 75
    invoke-virtual {v3, v1}, Ll/᩺ܽܽ;->֫(Ll/ۨܽܽ;)Z

    move-result v3

    if-nez v3, :cond_19

    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0

    :cond_1a
    move/from16 v3, p1

    move/from16 v2, v18

    goto/16 :goto_0

    .line 81
    :cond_1b
    iget v0, v1, Ll/ۨܽܽ;->ᩳ:I

    if-lez v0, :cond_1c

    iget v0, v1, Ll/ۨܽܽ;->ܽ:I

    if-nez v0, :cond_1c

    iget v0, v1, Ll/ۨܽܽ;->ۧ:I

    iget v1, v1, Ll/ۨܽܽ;->֫:I

    if-ge v0, v1, :cond_1c

    .line 82
    sget-object v0, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    return-object v0

    :cond_1c
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 84
    :catch_0
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    return-object v0
.end method
