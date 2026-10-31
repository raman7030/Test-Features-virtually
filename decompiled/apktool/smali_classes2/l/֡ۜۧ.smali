.class public final Ll/֡ۜۧ;
.super Ljava/lang/Object;
.source "J8M6"


# direct methods
.method public static ֫(Ll/ᩳ֨֫;)Ljava/util/ArrayList;
    .locals 25

    move-object/from16 v0, p0

    .line 119
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_c

    :cond_0
    const/4 v1, 0x7

    .line 123
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v3, 0x64666c38

    const/4 v4, 0x1

    if-ne v1, v3, :cond_2

    .line 126
    new-instance v1, Ll/ᩳ֨֫;

    invoke-direct {v1}, Ll/ᩳ֨֫;-><init>()V

    .line 127
    new-instance v3, Ljava/util/zip/Inflater;

    invoke-direct {v3, v4}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 129
    :try_start_0
    invoke-static {v0, v1, v3}, Ll/ۘ֨֫;->֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Ljava/util/zip/Inflater;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 133
    invoke-virtual {v3}, Ljava/util/zip/Inflater;->end()V

    return-object v2

    :cond_1
    invoke-virtual {v3}, Ljava/util/zip/Inflater;->end()V

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    invoke-virtual {v3}, Ljava/util/zip/Inflater;->end()V

    .line 134
    throw v1

    :cond_2
    const v3, 0x72617720

    if-eq v1, v3, :cond_3

    goto/16 :goto_c

    .line 145
    :cond_3
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 146
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    .line 147
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_14

    .line 149
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    add-int/2addr v5, v3

    if-le v5, v3, :cond_13

    if-le v5, v4, :cond_4

    goto/16 :goto_c

    .line 153
    :cond_4
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const v6, 0x6d657368

    if-ne v3, v6, :cond_12

    .line 170
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const/16 v6, 0x2710

    if-le v3, v6, :cond_5

    goto :goto_3

    .line 174
    :cond_5
    new-array v6, v3, [F

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v3, :cond_6

    .line 495
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    .line 176
    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 179
    :cond_6
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    const/16 v8, 0x7d00

    if-le v7, v8, :cond_7

    :goto_3
    move-object v12, v0

    move-object v15, v1

    move/from16 p0, v4

    goto/16 :goto_9

    :cond_7
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 184
    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    int-to-double v12, v3

    mul-double v12, v12, v8

    .line 185
    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    move-result-wide v12

    div-double/2addr v12, v10

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v12, v12

    .line 187
    new-instance v13, Ll/ܽ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v14

    .line 48
    array-length v15, v14

    invoke-direct {v13, v14, v15}, Ll/ܽ֨֫;-><init>([BI)V

    .line 188
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    mul-int/lit8 v14, v14, 0x8

    invoke-virtual {v13, v14}, Ll/ܽ֨֫;->ᩳ(I)V

    mul-int/lit8 v14, v7, 0x5

    .line 189
    new-array v14, v14, [F

    const/4 v15, 0x5

    new-array v2, v15, [I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_4
    if-ge v8, v7, :cond_a

    const/16 v18, 0x0

    move/from16 p0, v4

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v15, :cond_9

    .line 194
    aget v15, v2, v4

    .line 195
    invoke-virtual {v13, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v18

    shr-int/lit8 v19, v18, 0x1

    move/from16 v20, v12

    and-int/lit8 v12, v18, 0x1

    neg-int v12, v12

    xor-int v12, v19, v12

    add-int/2addr v15, v12

    if-ge v15, v3, :cond_b

    if-gez v15, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 v12, v9, 0x1

    .line 199
    aget v18, v6, v15

    aput v18, v14, v9

    .line 200
    aput v15, v2, v4

    add-int/lit8 v4, v4, 0x1

    const/4 v15, 0x5

    move v9, v12

    move/from16 v12, v20

    goto :goto_5

    :cond_9
    move/from16 v20, v12

    add-int/lit8 v8, v8, 0x1

    const/4 v15, 0x5

    move/from16 v4, p0

    goto :goto_4

    :cond_a
    move/from16 p0, v4

    .line 205
    invoke-virtual {v13}, Ll/ܽ֨֫;->ᩳ()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    and-int/lit8 v2, v2, -0x8

    invoke-virtual {v13, v2}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v2, 0x20

    .line 207
    invoke-virtual {v13, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 208
    new-array v4, v3, [Ll/ᩴۜۧ;

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v3, :cond_10

    const/16 v8, 0x8

    .line 210
    invoke-virtual {v13, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 211
    invoke-virtual {v13, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 212
    invoke-virtual {v13, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const v12, 0x1f400

    if-le v2, v12, :cond_c

    :cond_b
    :goto_7
    move-object v12, v0

    move-object v15, v1

    goto :goto_9

    :cond_c
    move-object v12, v0

    move-object v15, v1

    int-to-double v0, v7

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    mul-double v0, v0, v16

    .line 216
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    mul-int/lit8 v1, v2, 0x3

    .line 218
    new-array v1, v1, [F

    move/from16 v18, v3

    mul-int/lit8 v3, v2, 0x2

    .line 219
    new-array v3, v3, [F

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide/from16 v21, v10

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v2, :cond_f

    .line 221
    invoke-virtual {v13, v0}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    shr-int/lit8 v19, v11, 0x1

    and-int/lit8 v11, v11, 0x1

    neg-int v11, v11

    xor-int v11, v19, v11

    add-int v11, v20, v11

    if-ltz v11, :cond_e

    if-lt v11, v7, :cond_d

    goto :goto_9

    :cond_d
    mul-int/lit8 v19, v10, 0x3

    mul-int/lit8 v20, v11, 0x5

    .line 225
    aget v23, v14, v20

    aput v23, v1, v19

    add-int/lit8 v23, v19, 0x1

    add-int/lit8 v24, v20, 0x1

    .line 226
    aget v24, v14, v24

    aput v24, v1, v23

    add-int/lit8 v19, v19, 0x2

    add-int/lit8 v23, v20, 0x2

    .line 227
    aget v23, v14, v23

    aput v23, v1, v19

    mul-int/lit8 v19, v10, 0x2

    add-int/lit8 v23, v20, 0x3

    .line 228
    aget v23, v14, v23

    aput v23, v3, v19

    add-int/lit8 v19, v19, 0x1

    add-int/lit8 v20, v20, 0x4

    .line 229
    aget v20, v14, v20

    aput v20, v3, v19

    add-int/lit8 v10, v10, 0x1

    move/from16 v20, v11

    goto :goto_8

    :cond_e
    :goto_9
    const/4 v0, 0x0

    goto :goto_a

    .line 231
    :cond_f
    new-instance v0, Ll/ᩴۜۧ;

    invoke-direct {v0, v9, v8, v1, v3}, Ll/ᩴۜۧ;-><init>(II[F[F)V

    aput-object v0, v4, v6

    add-int/lit8 v6, v6, 0x1

    const/16 v2, 0x20

    move-object v0, v12

    move-object v1, v15

    move/from16 v3, v18

    move-wide/from16 v10, v21

    goto/16 :goto_6

    :cond_10
    move-object v12, v0

    move-object v15, v1

    .line 233
    new-instance v0, Ll/ۘۜۧ;

    invoke-direct {v0, v4}, Ll/ۘۜۧ;-><init>([Ll/ᩴۜۧ;)V

    :goto_a
    if-nez v0, :cond_11

    goto :goto_c

    :cond_11
    move-object v1, v15

    .line 159
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    move-object v12, v0

    move/from16 p0, v4

    .line 162
    :goto_b
    invoke-virtual {v12, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    move/from16 v4, p0

    move v3, v5

    move-object v0, v12

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_13
    :goto_c
    const/4 v0, 0x0

    return-object v0

    :cond_14
    return-object v1
.end method

.method public static ֫(I[B)Ll/᩵ۜۧ;
    .locals 7

    .line 63
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0, p1}, Ll/ᩳ֨֫;-><init>([B)V

    const/4 p1, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 89
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 90
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    .line 91
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    const v4, 0x70726f6a

    if-ne p1, v4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    const/16 p1, 0x8

    .line 97
    invoke-virtual {v0, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 98
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    .line 99
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    :goto_1
    if-ge p1, v4, :cond_5

    .line 101
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    add-int/2addr v5, p1

    if-le v5, p1, :cond_5

    if-le v5, v4, :cond_1

    goto :goto_3

    .line 105
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    const v6, 0x79746d70

    if-eq p1, v6, :cond_3

    const v6, 0x6d736870

    if-ne p1, v6, :cond_2

    goto :goto_2

    .line 112
    :cond_2
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    move p1, v5

    goto :goto_1

    .line 108
    :cond_3
    :goto_2
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 109
    invoke-static {v0}, Ll/֡ۜۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_4

    .line 68
    :cond_4
    invoke-static {v0}, Ll/֡ۜۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    :cond_5
    :goto_3
    move-object p1, v3

    :goto_4
    if-nez p1, :cond_6

    return-object v3

    .line 75
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v1, :cond_8

    const/4 v4, 0x2

    if-eq v0, v4, :cond_7

    return-object v3

    .line 79
    :cond_7
    new-instance v0, Ll/᩵ۜۧ;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۜۧ;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۜۧ;

    invoke-direct {v0, v2, p1, p0}, Ll/᩵ۜۧ;-><init>(Ll/ۘۜۧ;Ll/ۘۜۧ;I)V

    return-object v0

    .line 77
    :cond_8
    new-instance v0, Ll/᩵ۜۧ;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۜۧ;

    .line 181
    invoke-direct {v0, p1, p1, p0}, Ll/᩵ۜۧ;-><init>(Ll/ۘۜۧ;Ll/ۘۜۧ;I)V

    return-object v0
.end method
