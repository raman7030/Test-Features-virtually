.class public final Ll/᩹ۘۧ;
.super Ll/ܶۘۧ;
.source "18RZ"


# instance fields
.field public ֡:Ll/ܶۢۧ;

.field public ۘ:Ll/֨ۢۧ;

.field public ۚ:Ll/᩸ۘۧ;

.field public ᩴ:I

.field public ᩵:Z


# virtual methods
.method public final ֫(Ll/ᩳ֨֫;)J
    .locals 12

    .line 76
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/4 v2, 0x1

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 81
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    aget-byte v0, v0, v1

    iget-object v3, p0, Ll/᩹ۘۧ;->ۚ:Ll/᩸ۘۧ;

    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 195
    iget v4, v3, Ll/᩸ۘۧ;->ۧ:I

    iget-object v5, v3, Ll/᩸ۘۧ;->ܽ:Ll/ܶۢۧ;

    shr-int/2addr v0, v2

    const/16 v6, 0xff

    const/16 v7, 0x8

    rsub-int/lit8 v4, v4, 0x8

    ushr-int v4, v6, v4

    and-int/2addr v0, v4

    .line 197
    iget-object v3, v3, Ll/᩸ۘۧ;->ᩳ:[Ll/۠ۢۧ;

    aget-object v0, v3, v0

    iget-boolean v0, v0, Ll/۠ۢۧ;->֫:Z

    if-nez v0, :cond_1

    .line 198
    iget v0, v5, Ll/ܶۢۧ;->ܽ:I

    goto :goto_0

    .line 200
    :cond_1
    iget v0, v5, Ll/ܶۢۧ;->ᩳ:I

    .line 85
    :goto_0
    iget-boolean v3, p0, Ll/᩹ۘۧ;->᩵:Z

    if-eqz v3, :cond_2

    iget v1, p0, Ll/᩹ۘۧ;->ᩴ:I

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x4

    :cond_2
    int-to-long v3, v1

    .line 179
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۧ()I

    move-result v1

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    if-ge v1, v5, :cond_3

    .line 180
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, 0x4

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 113
    array-length v5, v1

    invoke-virtual {p1, v5, v1}, Ll/ᩳ֨֫;->֫(I[B)V

    goto :goto_1

    .line 182
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 186
    :goto_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    .line 187
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, -0x4

    const-wide/16 v8, 0xff

    and-long v10, v3, v8

    long-to-int v6, v10

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    .line 188
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, -0x3

    ushr-long v6, v3, v7

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v1, v5

    .line 189
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    add-int/lit8 v5, v5, -0x2

    const/16 v6, 0x10

    ushr-long v6, v3, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v1, v5

    .line 190
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result p1

    sub-int/2addr p1, v2

    const/16 v5, 0x18

    ushr-long v5, v3, v5

    and-long/2addr v5, v8

    long-to-int v6, v5

    int-to-byte v5, v6

    aput-byte v5, v1, p1

    .line 90
    iput-boolean v2, p0, Ll/᩹ۘۧ;->᩵:Z

    .line 91
    iput v0, p0, Ll/᩹ۘۧ;->ᩴ:I

    return-wide v3
.end method

.method public final ֫(Z)V
    .locals 0

    .line 56
    invoke-super {p0, p1}, Ll/ܶۘۧ;->֫(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Ll/᩹ۘۧ;->ۚ:Ll/᩸ۘۧ;

    .line 59
    iput-object p1, p0, Ll/᩹ۘۧ;->֡:Ll/ܶۢۧ;

    .line 60
    iput-object p1, p0, Ll/᩹ۘۧ;->ۘ:Ll/֨ۢۧ;

    :cond_0
    const/4 p1, 0x0

    .line 62
    iput p1, p0, Ll/᩹ۘۧ;->ᩴ:I

    .line 63
    iput-boolean p1, p0, Ll/᩹ۘۧ;->᩵:Z

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;JLl/֨ۘۧ;)Z
    .locals 17
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 99
    iget-object v3, v0, Ll/᩹ۘۧ;->ۚ:Ll/᩸ۘۧ;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 100
    iget-object v1, v2, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4

    .line 138
    :cond_0
    iget-object v6, v0, Ll/᩹ۘۧ;->֡:Ll/ܶۢۧ;

    const/4 v3, 0x1

    const/4 v5, 0x4

    if-nez v6, :cond_3

    .line 251
    invoke-static {v3, v1, v4}, Ll/᩸ۢۧ;->֫(ILl/ᩳ֨֫;Z)Z

    .line 253
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ۖ()I

    .line 254
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v8

    .line 255
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ۖ()I

    move-result v9

    .line 256
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    if-gtz v3, :cond_1

    const/4 v3, -0x1

    const/4 v10, -0x1

    goto :goto_0

    :cond_1
    move v10, v3

    .line 260
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    if-gtz v3, :cond_2

    const/4 v3, -0x1

    const/4 v11, -0x1

    goto :goto_1

    :cond_2
    move v11, v3

    .line 264
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->᩷()I

    .line 268
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    and-int/lit8 v4, v3, 0xf

    int-to-double v6, v4

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 269
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-int v4, v6

    and-int/lit16 v3, v3, 0xf0

    shr-int/2addr v3, v5

    int-to-double v5, v3

    .line 270
    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-int v13, v5

    .line 272
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    .line 274
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v14

    .line 276
    new-instance v1, Ll/ܶۢۧ;

    move-object v7, v1

    move v12, v4

    invoke-direct/range {v7 .. v14}, Ll/ܶۢۧ;-><init>(IIIIII[B)V

    .line 139
    iput-object v1, v0, Ll/᩹ۘۧ;->֡:Ll/ܶۢۧ;

    goto :goto_2

    .line 143
    :cond_3
    iget-object v7, v0, Ll/᩹ۘۧ;->ۘ:Ll/֨ۢۧ;

    if-nez v7, :cond_4

    .line 301
    invoke-static {v1, v3, v3}, Ll/᩸ۢۧ;->֫(Ll/ᩳ֨֫;ZZ)Ll/֨ۢۧ;

    move-result-object v1

    .line 144
    iput-object v1, v0, Ll/᩹ۘۧ;->ۘ:Ll/֨ۢۧ;

    :goto_2
    const/4 v1, 0x0

    goto/16 :goto_20

    .line 151
    :cond_4
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v8

    new-array v8, v8, [B

    .line 153
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v10

    invoke-static {v9, v4, v8, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 155
    iget v9, v6, Ll/ܶۢۧ;->ܿ:I

    const/4 v10, 0x5

    .line 452
    invoke-static {v10, v1, v4}, Ll/᩸ۢۧ;->֫(ILl/ᩳ֨֫;Z)Z

    .line 454
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    add-int/2addr v4, v3

    .line 456
    new-instance v3, Ll/ۚۢۧ;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    invoke-direct {v3, v11}, Ll/ۚۢۧ;-><init>([B)V

    .line 457
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v1, 0x0

    :goto_3
    const/16 v11, 0x18

    const/4 v12, 0x2

    const/16 v13, 0x10

    if-ge v1, v4, :cond_10

    .line 625
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    move-result v14

    const v15, 0x564342

    if-ne v14, v15, :cond_f

    .line 630
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->֫(I)I

    move-result v13

    .line 631
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    move-result v11

    .line 633
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v14

    if-nez v14, :cond_7

    .line 635
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v14

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v11, :cond_9

    if-eqz v14, :cond_5

    .line 638
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v16

    if-eqz v16, :cond_6

    .line 639
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    goto :goto_5

    .line 642
    :cond_5
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    :cond_6
    :goto_5
    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    .line 646
    :cond_7
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v11, :cond_9

    sub-int v14, v11, v10

    const/4 v15, 0x0

    :goto_7
    if-lez v14, :cond_8

    add-int/lit8 v15, v15, 0x1

    ushr-int/lit8 v14, v14, 0x1

    goto :goto_7

    .line 648
    :cond_8
    invoke-virtual {v3, v15}, Ll/ۚۢۧ;->֫(I)I

    move-result v14

    add-int/2addr v10, v14

    goto :goto_6

    .line 652
    :cond_9
    invoke-virtual {v3, v5}, Ll/ۚۢۧ;->֫(I)I

    move-result v10

    if-gt v10, v12, :cond_e

    const/4 v14, 0x1

    if-eq v10, v14, :cond_a

    if-ne v10, v12, :cond_d

    :cond_a
    const/16 v12, 0x20

    .line 657
    invoke-virtual {v3, v12}, Ll/ۚۢۧ;->ۧ(I)V

    .line 658
    invoke-virtual {v3, v12}, Ll/ۚۢۧ;->ۧ(I)V

    .line 659
    invoke-virtual {v3, v5}, Ll/ۚۢۧ;->֫(I)I

    move-result v5

    add-int/2addr v5, v14

    .line 660
    invoke-virtual {v3, v14}, Ll/ۚۢۧ;->ۧ(I)V

    if-ne v10, v14, :cond_c

    if-eqz v13, :cond_b

    int-to-long v10, v11

    int-to-long v12, v13

    long-to-double v10, v10

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    long-to-double v12, v12

    div-double/2addr v14, v12

    .line 681
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    double-to-long v10, v10

    goto :goto_8

    :cond_b
    const-wide/16 v10, 0x0

    goto :goto_8

    :cond_c
    int-to-long v10, v11

    int-to-long v12, v13

    mul-long v10, v10, v12

    :goto_8
    int-to-long v12, v5

    mul-long v10, v10, v12

    long-to-int v5, v10

    .line 672
    invoke-virtual {v3, v5}, Ll/ۚۢۧ;->ۧ(I)V

    :cond_d
    add-int/lit8 v1, v1, 0x1

    const/4 v5, 0x4

    const/4 v10, 0x5

    goto/16 :goto_3

    .line 654
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lookup type greater than 2 not decodable: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_f
    const/4 v1, 0x0

    .line 626
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "expected code book to start with [0x56, 0x43, 0x42] at "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    invoke-virtual {v3}, Ll/ۚۢۧ;->֫()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 626
    invoke-static {v2, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_10
    const/4 v1, 0x6

    .line 463
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_12

    .line 465
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->֫(I)I

    move-result v10

    if-nez v10, :cond_11

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_11
    const-string v1, "placeholder of time domain transforms not zeroed out"

    const/4 v2, 0x0

    .line 466
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 570
    :cond_12
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v4

    const/4 v5, 0x1

    add-int/2addr v4, v5

    const/4 v10, 0x0

    :goto_a
    const/4 v11, 0x3

    if-ge v10, v4, :cond_1c

    .line 572
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->֫(I)I

    move-result v1

    if-eqz v1, :cond_1a

    if-ne v1, v5, :cond_19

    const/4 v1, 0x5

    .line 586
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v1

    .line 588
    new-array v5, v1, [I

    const/4 v12, -0x1

    const/4 v13, 0x0

    :goto_b
    if-ge v13, v1, :cond_14

    const/4 v14, 0x4

    .line 590
    invoke-virtual {v3, v14}, Ll/ۚۢۧ;->֫(I)I

    move-result v14

    aput v14, v5, v13

    if-le v14, v12, :cond_13

    move v12, v14

    :cond_13
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 595
    new-array v13, v12, [I

    const/4 v14, 0x0

    :goto_c
    if-ge v14, v12, :cond_17

    .line 597
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    aput v11, v13, v14

    const/4 v11, 0x2

    .line 598
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    move-result v11

    const/16 v15, 0x8

    if-lez v11, :cond_15

    .line 600
    invoke-virtual {v3, v15}, Ll/ۚۢۧ;->ۧ(I)V

    :cond_15
    const/16 v16, 0x0

    move/from16 p1, v4

    move/from16 p2, v12

    const/16 v4, 0x8

    const/4 v12, 0x0

    :goto_d
    const/4 v15, 0x1

    shl-int/2addr v15, v11

    if-ge v12, v15, :cond_16

    .line 603
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v12, v12, 0x1

    const/16 v4, 0x8

    goto :goto_d

    :cond_16
    add-int/lit8 v14, v14, 0x1

    const/4 v11, 0x3

    move/from16 v4, p1

    move/from16 v12, p2

    goto :goto_c

    :cond_17
    move/from16 p1, v4

    const/4 v4, 0x2

    .line 606
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v4, 0x4

    .line 607
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->֫(I)I

    move-result v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_e
    if-ge v11, v1, :cond_1b

    .line 610
    aget v15, v5, v11

    .line 611
    aget v15, v13, v15

    add-int/2addr v12, v15

    :goto_f
    if-ge v14, v12, :cond_18

    .line 613
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_f

    :cond_18
    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    .line 618
    :cond_19
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "floor type greater than 1 not decodable: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_1a
    move/from16 p1, v4

    const/16 v1, 0x8

    .line 575
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->ۧ(I)V

    const/16 v4, 0x10

    .line 576
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    .line 577
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v4, 0x6

    .line 578
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->ۧ(I)V

    .line 579
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v4, 0x4

    .line 580
    invoke-virtual {v3, v4}, Ll/ۚۢۧ;->֫(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    :goto_10
    if-ge v5, v4, :cond_1b

    .line 582
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x8

    goto :goto_10

    :cond_1b
    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x6

    const/4 v5, 0x1

    const/16 v13, 0x10

    move/from16 v4, p1

    goto/16 :goto_a

    .line 537
    :cond_1c
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    :goto_11
    if-ge v5, v4, :cond_23

    const/16 v10, 0x10

    .line 539
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->֫(I)I

    move-result v10

    const/4 v11, 0x2

    if-gt v10, v11, :cond_22

    const/16 v10, 0x18

    .line 544
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    .line 545
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    .line 546
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    .line 547
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/16 v10, 0x8

    .line 548
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    .line 549
    new-array v11, v1, [I

    const/4 v12, 0x0

    :goto_12
    if-ge v12, v1, :cond_1e

    const/4 v13, 0x3

    .line 552
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->֫(I)I

    move-result v13

    .line 553
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v14

    const/4 v15, 0x5

    if-eqz v14, :cond_1d

    .line 554
    invoke-virtual {v3, v15}, Ll/ۚۢۧ;->֫(I)I

    move-result v14

    goto :goto_13

    :cond_1d
    const/4 v14, 0x0

    :goto_13
    mul-int/lit8 v14, v14, 0x8

    add-int/2addr v14, v13

    .line 556
    aput v14, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_12

    :cond_1e
    const/4 v12, 0x0

    :goto_14
    if-ge v12, v1, :cond_21

    const/4 v13, 0x0

    :goto_15
    if-ge v13, v10, :cond_20

    .line 560
    aget v14, v11, v12

    const/4 v15, 0x1

    shl-int/2addr v15, v13

    and-int/2addr v14, v15

    if-eqz v14, :cond_1f

    .line 561
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->ۧ(I)V

    :cond_1f
    add-int/lit8 v13, v13, 0x1

    const/16 v10, 0x8

    goto :goto_15

    :cond_20
    add-int/lit8 v12, v12, 0x1

    const/16 v10, 0x8

    goto :goto_14

    :cond_21
    add-int/lit8 v5, v5, 0x1

    const/4 v1, 0x6

    goto :goto_11

    :cond_22
    const-string v1, "residueType greater than 2 is not decodable"

    const/4 v2, 0x0

    .line 541
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 496
    :cond_23
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v4, 0x0

    :goto_16
    if-ge v4, v1, :cond_2c

    const/16 v5, 0x10

    .line 498
    invoke-virtual {v3, v5}, Ll/ۚۢۧ;->֫(I)I

    move-result v5

    if-eqz v5, :cond_24

    .line 500
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "mapping type other than 0 not supported: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    goto :goto_1d

    .line 504
    :cond_24
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_25

    const/4 v5, 0x4

    .line 505
    invoke-virtual {v3, v5}, Ll/ۚۢۧ;->֫(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_17

    :cond_25
    const/4 v5, 0x1

    .line 510
    :goto_17
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v10

    if-eqz v10, :cond_28

    const/16 v10, 0x8

    .line 511
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->֫(I)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    const/4 v11, 0x0

    :goto_18
    if-ge v11, v10, :cond_28

    add-int/lit8 v12, v9, -0x1

    const/4 v13, 0x0

    move v14, v12

    :goto_19
    if-lez v14, :cond_26

    add-int/lit8 v13, v13, 0x1

    ushr-int/lit8 v14, v14, 0x1

    goto :goto_19

    .line 513
    :cond_26
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->ۧ(I)V

    const/4 v13, 0x0

    :goto_1a
    if-lez v12, :cond_27

    add-int/lit8 v13, v13, 0x1

    ushr-int/lit8 v12, v12, 0x1

    goto :goto_1a

    .line 514
    :cond_27
    invoke-virtual {v3, v13}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_18

    :cond_28
    const/4 v10, 0x2

    .line 519
    invoke-virtual {v3, v10}, Ll/ۚۢۧ;->֫(I)I

    move-result v10

    if-nez v10, :cond_2b

    const/4 v10, 0x1

    if-le v5, v10, :cond_29

    const/4 v10, 0x0

    :goto_1b
    if-ge v10, v9, :cond_29

    const/4 v11, 0x4

    .line 525
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1b

    :cond_29
    const/4 v10, 0x0

    :goto_1c
    if-ge v10, v5, :cond_2a

    const/16 v11, 0x8

    .line 529
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->ۧ(I)V

    .line 530
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->ۧ(I)V

    .line 531
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->ۧ(I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1c

    :cond_2a
    :goto_1d
    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_2b
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    const/4 v2, 0x0

    .line 520
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_2c
    const/4 v1, 0x6

    .line 483
    invoke-virtual {v3, v1}, Ll/ۚۢۧ;->֫(I)I

    move-result v1

    add-int/lit8 v4, v1, 0x1

    .line 484
    new-array v9, v4, [Ll/۠ۢۧ;

    const/4 v5, 0x0

    :goto_1e
    if-ge v5, v4, :cond_2d

    .line 486
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v10

    const/16 v11, 0x10

    .line 487
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    .line 488
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    const/16 v11, 0x8

    .line 489
    invoke-virtual {v3, v11}, Ll/ۚۢۧ;->֫(I)I

    .line 490
    new-instance v11, Ll/۠ۢۧ;

    invoke-direct {v11, v10}, Ll/۠ۢۧ;-><init>(Z)V

    aput-object v11, v9, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    .line 475
    :cond_2d
    invoke-virtual {v3}, Ll/ۚۢۧ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_30

    const/4 v3, 0x0

    const/4 v10, 0x0

    :goto_1f
    if-lez v1, :cond_2e

    add-int/lit8 v10, v10, 0x1

    ushr-int/lit8 v1, v1, 0x1

    goto :goto_1f

    .line 159
    :cond_2e
    new-instance v1, Ll/᩸ۘۧ;

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Ll/᩸ۘۧ;-><init>(Ll/ܶۢۧ;Ll/֨ۢۧ;[B[Ll/۠ۢۧ;I)V

    .line 104
    :goto_20
    iput-object v1, v0, Ll/᩹ۘۧ;->ۚ:Ll/᩸ۘۧ;

    if-nez v1, :cond_2f

    const/4 v1, 0x1

    return v1

    .line 110
    :cond_2f
    iget-object v3, v1, Ll/᩸ۘۧ;->ܽ:Ll/ܶۢۧ;

    .line 112
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 113
    iget-object v5, v3, Ll/ܶۢۧ;->ܳ:[B

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    iget-object v5, v1, Ll/᩸ۘۧ;->ܿ:[B

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    iget-object v1, v1, Ll/᩸ۘۧ;->֫:Ll/֨ۢۧ;

    iget-object v1, v1, Ll/֨ۢۧ;->֫:[Ljava/lang/String;

    .line 118
    invoke-static {v1}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ۢۧ;->֫(Ljava/util/List;)Ll/᩻᩵֫;

    move-result-object v1

    .line 120
    new-instance v5, Ll/֨ᩴ֫;

    invoke-direct {v5}, Ll/֨ᩴ֫;-><init>()V

    const-string v6, "audio/ogg"

    .line 122
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v6, "audio/vorbis"

    .line 123
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget v6, v3, Ll/ܶۢۧ;->ۧ:I

    .line 124
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܽ(I)V

    iget v6, v3, Ll/ܶۢۧ;->֫:I

    .line 125
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->֡(I)V

    iget v6, v3, Ll/ܶۢۧ;->ܿ:I

    .line 126
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v3, v3, Ll/ܶۢۧ;->᩻:I

    .line 127
    invoke-virtual {v5, v3}, Ll/֨ᩴ֫;->۠(I)V

    .line 128
    invoke-virtual {v5, v4}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 129
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 130
    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    iput-object v1, v2, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    const/4 v1, 0x1

    return v1

    :cond_30
    const-string v1, "framing bit after modes not set as expected"

    const/4 v2, 0x0

    .line 476
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1
.end method

.method public final ܽ(J)V
    .locals 4

    .line 68
    invoke-super {p0, p1, p2}, Ll/ܶۘۧ;->ܽ(J)V

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 69
    :goto_0
    iput-boolean p1, p0, Ll/᩹ۘۧ;->᩵:Z

    .line 70
    iget-object p1, p0, Ll/᩹ۘۧ;->֡:Ll/ܶۢۧ;

    if-eqz p1, :cond_1

    iget v2, p1, Ll/ܶۢۧ;->ܽ:I

    :cond_1
    iput v2, p0, Ll/᩹ۘۧ;->ᩴ:I

    return-void
.end method
