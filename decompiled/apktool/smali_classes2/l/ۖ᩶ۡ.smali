.class public final Ll/ۖ᩶ۡ;
.super Ljava/lang/Object;
.source "ABJA"


# instance fields
.field public ֫:[F

.field public ۧ:C


# direct methods
.method public constructor <init>(C[F)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-char p1, p0, Ll/ۖ᩶ۡ;->ۧ:C

    .line 128
    iput-object p2, p0, Ll/ۖ᩶ۡ;->֫:[F

    return-void
.end method

.method public static ֫([Ll/ۖ᩶ۡ;Ll/ۢ᩶ۡ;)Ljava/lang/String;
    .locals 12

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_8

    aget-object v3, p0, v2

    .line 151
    iget-char v4, v3, Ll/ۖ᩶ۡ;->ۧ:C

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    iget-object v4, v3, Ll/ۖ᩶ۡ;->֫:[F

    array-length v4, v4

    .line 155
    iget-char v5, v3, Ll/ۖ᩶ۡ;->ۧ:C

    const/16 v6, 0x6d

    const/4 v7, 0x2

    if-eq v5, v6, :cond_0

    const/16 v8, 0x4d

    if-ne v5, v8, :cond_2

    :cond_0
    if-le v4, v7, :cond_2

    if-ne v5, v6, :cond_1

    const/16 v5, 0x6c

    goto :goto_1

    :cond_1
    const/16 v5, 0x4c

    :goto_1
    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/16 v5, 0x20

    const/4 v6, 0x0

    :goto_2
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v4, :cond_7

    if-lez v8, :cond_4

    .line 161
    rem-int/lit8 v9, v8, 0x2

    if-eqz v9, :cond_3

    const-string v9, ","

    goto :goto_4

    :cond_3
    const-string v9, " "

    :goto_4
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    if-eqz v6, :cond_5

    if-ne v8, v7, :cond_5

    .line 164
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    :cond_5
    iget-object v9, v3, Ll/ۖ᩶ۡ;->֫:[F

    aget v9, v9, v8

    .line 12
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v10, v10, v11

    if-gtz v10, :cond_6

    float-to-double v9, v9

    .line 170
    invoke-virtual {p1, v9, v10}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v9

    .line 171
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 168
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Invalid number: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 175
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֡᩶ۡ;[FII)V
    .locals 5

    .line 418
    new-array v0, p3, [D

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_0

    add-int v3, v2, p2

    .line 420
    aget v3, p1, v3

    float-to-double v3, v3

    aput-wide v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 423
    :cond_0
    div-int/lit8 v2, p3, 0x2

    invoke-virtual {p0, v0, v0, v2}, Ll/֡᩶ۡ;->֫([D[DI)V

    :goto_1
    if-ge v1, p3, :cond_1

    add-int p0, v1, p2

    .line 426
    aget-wide v2, v0, v1

    double-to-float v2, v2

    aput v2, p1, p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ֫(Ll/֡᩶ۡ;[Ll/ۖ᩶ۡ;)V
    .locals 34

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    .line 180
    new-instance v13, Ll/ܶ᩶ۡ;

    invoke-direct {v13}, Ll/ܶ᩶ۡ;-><init>()V

    .line 181
    new-instance v14, Ll/ܶ᩶ۡ;

    invoke-direct {v14}, Ll/ܶ᩶ۡ;-><init>()V

    .line 183
    array-length v15, v12

    const/16 v0, 0x20

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v15, :cond_12

    aget-object v9, v12, v10

    .line 199
    iget-object v1, v9, Ll/ۖ᩶ۡ;->֫:[F

    array-length v8, v1

    mul-int/lit8 v1, v8, 0x2

    .line 200
    new-array v6, v1, [F

    .line 203
    iget v7, v13, Ll/ܶ᩶ۡ;->᩸:F

    .line 204
    iget v5, v13, Ll/ܶ᩶ۡ;->᩹:F

    .line 205
    iget v4, v14, Ll/ܶ᩶ۡ;->᩸:F

    .line 206
    iget v3, v14, Ll/ܶ᩶ۡ;->᩹:F

    .line 208
    invoke-static {}, Ll/ۘ᩶ۡ;->֫()Ll/ۢ۬ܺ;

    move-result-object v2

    move/from16 v16, v10

    iget-char v10, v9, Ll/ۖ᩶ۡ;->ۧ:C

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    invoke-virtual {v2, v10}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v17

    .line 209
    iget-char v2, v9, Ll/ۖ᩶ۡ;->ۧ:C

    const/4 v10, 0x1

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    sparse-switch v2, :sswitch_data_0

    move-object v14, v9

    .line 393
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-char v2, v14, Ll/ۖ᩶ۡ;->ۧ:C

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v8, :cond_0

    mul-int/lit8 v2, v0, 0x2

    .line 327
    aput v19, v6, v2

    add-int/lit8 v2, v2, 0x1

    .line 328
    iget-object v10, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v17, v10, v0

    aput v17, v6, v2

    .line 329
    aget v2, v10, v0

    add-float/2addr v5, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 332
    :cond_0
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_a

    const/16 v0, 0x6c

    .line 333
    iput-char v0, v9, Ll/ۖ᩶ۡ;->ۧ:C

    const/4 v0, 0x0

    .line 334
    invoke-static {v11, v6, v0, v1}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    .line 335
    iput-object v6, v9, Ll/ۖ᩶ۡ;->֫:[F

    goto/16 :goto_8

    :sswitch_1
    const/4 v1, 0x0

    const/16 v2, 0x7a

    if-eq v0, v2, :cond_6

    const/16 v2, 0x5a

    if-ne v0, v2, :cond_1

    goto :goto_4

    .line 250
    :cond_1
    iget-object v3, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v1, v3, v1

    add-float v6, v7, v1

    .line 251
    aget v1, v3, v10

    add-float v7, v5, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v2, 0x0

    const/4 v10, 0x2

    move-object/from16 v0, p0

    move-object v1, v3

    .line 258
    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    goto :goto_2

    :cond_2
    const/4 v10, 0x2

    .line 259
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 260
    iget-object v0, v9, Ll/ۖ᩶ۡ;->֫:[F

    const/4 v1, 0x0

    invoke-static {v11, v0, v1, v10}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    :cond_3
    :goto_2
    const/4 v0, 0x2

    move v1, v6

    move v2, v7

    :goto_3
    if-ge v0, v8, :cond_4

    .line 264
    iget-object v3, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v4, v3, v0

    add-float/2addr v1, v4

    add-int/lit8 v4, v0, 0x1

    .line 265
    aget v3, v3, v4

    add-float/2addr v2, v3

    add-int v0, v0, v17

    goto :goto_3

    .line 268
    :cond_4
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 269
    iget-object v0, v9, Ll/ۖ᩶ۡ;->֫:[F

    add-int/lit8 v8, v8, -0x2

    invoke-static {v11, v0, v10, v8}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    :cond_5
    move v5, v2

    move v4, v6

    move v3, v7

    move v7, v1

    goto/16 :goto_8

    :cond_6
    :goto_4
    const/16 v0, 0x4d

    .line 235
    iput-char v0, v9, Ll/ۖ᩶ۡ;->ۧ:C

    .line 236
    iget-object v0, v9, Ll/ۖ᩶ۡ;->֫:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    add-float v6, v2, v4

    aput v6, v0, v1

    .line 237
    aget v1, v0, v10

    add-float v7, v3, v1

    aput v7, v0, v10

    move/from16 v0, v17

    :goto_5
    if-ge v0, v8, :cond_7

    .line 241
    iget-object v1, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v2, v1, v0

    sub-int v3, v0, v17

    aget v3, v1, v3

    add-float/2addr v2, v3

    aput v2, v1, v0

    add-int/lit8 v2, v0, 0x1

    .line 242
    aget v3, v1, v2

    sub-int v4, v2, v17

    aget v4, v1, v4

    add-float/2addr v3, v4

    aput v3, v1, v2

    add-int v0, v0, v17

    goto :goto_5

    .line 244
    :cond_7
    iget-object v3, v9, Ll/ۖ᩶ۡ;->֫:[F

    add-int/lit8 v0, v8, -0x2

    aget v10, v3, v0

    add-int/lit8 v0, v8, -0x1

    .line 245
    aget v17, v3, v0

    .line 247
    div-int/lit8 v5, v8, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v3

    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    move v4, v10

    move-object/from16 v24, v14

    move/from16 v22, v15

    move/from16 v3, v17

    goto :goto_9

    :sswitch_2
    const/4 v0, 0x0

    :goto_6
    if-ge v0, v8, :cond_8

    .line 312
    iget-object v2, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v2, v2, v0

    add-float/2addr v7, v2

    mul-int/lit8 v10, v0, 0x2

    .line 314
    aput v2, v6, v10

    add-int/lit8 v10, v10, 0x1

    .line 315
    aput v19, v6, v10

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 317
    :cond_8
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_a

    const/16 v0, 0x6c

    .line 318
    iput-char v0, v9, Ll/ۖ᩶ۡ;->ۧ:C

    const/4 v0, 0x0

    .line 319
    invoke-static {v11, v6, v0, v1}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    .line 320
    iput-object v6, v9, Ll/ۖ᩶ۡ;->֫:[F

    goto :goto_8

    :sswitch_3
    const/4 v0, 0x0

    :goto_7
    sub-int v1, v8, v17

    add-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_9

    .line 280
    iget-object v1, v9, Ll/ۖ᩶ۡ;->֫:[F

    add-int v0, v0, v17

    add-int/lit8 v2, v0, -0x2

    aget v2, v1, v2

    add-float/2addr v7, v2

    add-int/lit8 v2, v0, -0x1

    .line 281
    aget v1, v1, v2

    add-float/2addr v5, v1

    goto :goto_7

    .line 283
    :cond_9
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 284
    iget-object v0, v9, Ll/ۖ᩶ۡ;->֫:[F

    const/4 v1, 0x0

    invoke-static {v11, v0, v1, v8}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    :cond_a
    :goto_8
    move v6, v4

    move v4, v7

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v7, v3

    move v3, v5

    :goto_9
    move-object v14, v9

    goto/16 :goto_12

    :sswitch_4
    const/4 v0, 0x0

    move v2, v7

    move-object v0, v11

    const/4 v10, 0x0

    :goto_a
    sub-int v1, v8, v17

    add-int/lit8 v1, v1, 0x1

    if-ge v10, v1, :cond_d

    .line 369
    iget-object v1, v9, Ll/ۖ᩶ۡ;->֫:[F

    add-int/lit8 v7, v10, 0x5

    aget v6, v1, v7

    add-float v19, v2, v6

    add-int/lit8 v6, v10, 0x6

    .line 370
    aget v1, v1, v6

    add-float v20, v5, v1

    .line 371
    invoke-static {v0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 372
    new-instance v21, Ll/ܺ᩹ۡ;

    iget-object v0, v9, Ll/ۖ᩶ۡ;->֫:[F

    aget v22, v0, v10

    add-int/lit8 v23, v10, 0x1

    aget v24, v0, v23

    add-int/lit8 v25, v10, 0x2

    aget v26, v0, v25

    add-int/lit8 v1, v10, 0x3

    aget v27, v0, v1

    add-int/lit8 v28, v10, 0x4

    aget v29, v0, v28

    aget v1, v0, v7

    add-float v30, v2, v1

    aget v0, v0, v6

    add-float v31, v5, v0

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    move/from16 v32, v3

    move v3, v5

    move/from16 v33, v4

    move/from16 v4, v22

    move/from16 v5, v24

    move/from16 v6, v26

    move v12, v7

    move/from16 v7, v27

    move/from16 v22, v15

    move v15, v8

    move/from16 v8, v29

    move-object/from16 v24, v14

    move-object v14, v9

    move/from16 v9, v30

    move/from16 v26, v10

    move/from16 v10, v31

    invoke-direct/range {v0 .. v10}, Ll/ܺ᩹ۡ;-><init>(Ll/֡᩶ۡ;FFFFFFFFF)V

    .line 380
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    const/4 v1, 0x2

    invoke-static {v11, v0, v12, v1}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[FII)V

    .line 382
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v21 .. v21}, Ll/ܺ᩹ۡ;->ۧ()F

    move-result v1

    aput v1, v0, v26

    .line 383
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v21 .. v21}, Ll/ܺ᩹ۡ;->ܽ()F

    move-result v1

    aput v1, v0, v23

    .line 384
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v21 .. v21}, Ll/ܺ᩹ۡ;->ᩳ()F

    move-result v1

    aput v1, v0, v25

    .line 385
    invoke-virtual/range {v21 .. v21}, Ll/ܺ᩹ۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 386
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v1, v0, v28

    sub-float v1, v18, v1

    aput v1, v0, v28

    :cond_b
    move-object v0, v11

    goto :goto_b

    :cond_c
    move/from16 v32, v3

    move/from16 v33, v4

    move/from16 v26, v10

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    :goto_b
    add-int v10, v26, v17

    move-object/from16 v12, p1

    move-object v9, v14

    move v8, v15

    move/from16 v2, v19

    move/from16 v5, v20

    move/from16 v15, v22

    move-object/from16 v14, v24

    move/from16 v3, v32

    move/from16 v4, v33

    goto/16 :goto_a

    :cond_d
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move-object v14, v9

    move v4, v2

    move v3, v5

    goto/16 :goto_10

    :sswitch_5
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move-object v14, v9

    move v7, v3

    move v6, v4

    goto/16 :goto_12

    :sswitch_6
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    const/16 v0, 0x4c

    .line 300
    iput-char v0, v14, Ll/ۖ᩶ۡ;->ۧ:C

    const/4 v0, 0x0

    move v8, v5

    :goto_c
    if-ge v0, v15, :cond_e

    mul-int/lit8 v1, v0, 0x2

    .line 302
    aput v7, v6, v1

    add-int/lit8 v1, v1, 0x1

    .line 303
    iget-object v2, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v3, v2, v0

    aput v3, v6, v1

    .line 304
    aget v8, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_e
    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v6

    move-object v3, v6

    move v5, v15

    .line 306
    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    .line 307
    iput-object v6, v14, Ll/ۖ᩶ۡ;->֫:[F

    goto :goto_e

    :sswitch_7
    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    const/4 v0, 0x0

    .line 217
    iget-object v1, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v4, v1, v0

    .line 218
    aget v3, v1, v10

    move/from16 v32, v3

    move/from16 v33, v4

    goto :goto_f

    :sswitch_8
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    const/16 v0, 0x4c

    .line 289
    iput-char v0, v14, Ll/ۖ᩶ۡ;->ۧ:C

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v15, :cond_f

    mul-int/lit8 v1, v0, 0x2

    .line 291
    iget-object v2, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v3, v2, v0

    aput v3, v6, v1

    add-int/lit8 v1, v1, 0x1

    .line 292
    aput v5, v6, v1

    .line 293
    aget v7, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_f
    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v6

    move-object v3, v6

    move v8, v5

    move v5, v15

    .line 295
    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    .line 296
    iput-object v6, v14, Ll/ۖ᩶ۡ;->֫:[F

    :goto_e
    move v5, v8

    move v3, v5

    move v4, v7

    goto :goto_10

    :sswitch_9
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    .line 225
    :goto_f
    iget-object v3, v14, Ll/ۖ᩶ۡ;->֫:[F

    add-int/lit8 v8, v15, -0x2

    aget v6, v3, v8

    add-int/lit8 v8, v15, -0x1

    .line 226
    aget v7, v3, v8

    .line 228
    div-int/lit8 v5, v15, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v3

    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    move v4, v6

    move v3, v7

    :goto_10
    move/from16 v7, v32

    move/from16 v6, v33

    goto/16 :goto_12

    :sswitch_a
    move/from16 v32, v3

    move/from16 v33, v4

    move-object/from16 v24, v14

    move/from16 v22, v15

    move v15, v8

    move-object v14, v9

    move v8, v5

    const/4 v0, 0x0

    move v2, v7

    move v3, v8

    const/4 v12, 0x0

    :goto_11
    sub-int v8, v15, v17

    add-int/lit8 v8, v8, 0x1

    if-ge v12, v8, :cond_11

    .line 343
    invoke-static/range {p0 .. p0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 344
    new-instance v19, Ll/ܺ᩹ۡ;

    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v4, v0, v12

    add-int/lit8 v20, v12, 0x1

    aget v5, v0, v20

    add-int/lit8 v21, v12, 0x2

    aget v6, v0, v21

    add-int/lit8 v1, v12, 0x3

    aget v7, v0, v1

    add-int/lit8 v23, v12, 0x4

    aget v8, v0, v23

    add-int/lit8 v1, v12, 0x5

    aget v9, v0, v1

    add-int/lit8 v1, v12, 0x6

    aget v10, v0, v1

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v10}, Ll/ܺ᩹ۡ;-><init>(Ll/֡᩶ۡ;FFFFFFFFF)V

    .line 349
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v19 .. v19}, Ll/ܺ᩹ۡ;->ۧ()F

    move-result v1

    aput v1, v0, v12

    .line 350
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v19 .. v19}, Ll/ܺ᩹ۡ;->ܽ()F

    move-result v1

    aput v1, v0, v20

    .line 351
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    invoke-virtual/range {v19 .. v19}, Ll/ܺ᩹ۡ;->ᩳ()F

    move-result v1

    aput v1, v0, v21

    .line 352
    invoke-virtual/range {v19 .. v19}, Ll/ܺ᩹ۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 353
    iget-object v0, v14, Ll/ۖ᩶ۡ;->֫:[F

    aget v1, v0, v23

    sub-float v1, v18, v1

    aput v1, v0, v23

    .line 357
    :cond_10
    iget-object v3, v14, Ll/ۖ᩶ۡ;->֫:[F

    add-int/lit8 v4, v12, 0x5

    aget v6, v3, v4

    add-int/lit8 v0, v12, 0x6

    .line 358
    aget v7, v3, v0

    const/4 v5, 0x1

    move-object/from16 v0, p0

    move-object v1, v3

    move v2, v4

    .line 360
    invoke-virtual/range {v0 .. v5}, Ll/֡᩶ۡ;->֫([FI[FII)V

    add-int v12, v12, v17

    move v2, v6

    move v3, v7

    goto :goto_11

    :cond_11
    move v4, v2

    goto/16 :goto_10

    .line 128
    :goto_12
    iput v4, v13, Ll/ܶ᩶ۡ;->᩸:F

    .line 129
    iput v3, v13, Ll/ܶ᩶ۡ;->᩹:F

    move-object/from16 v0, v24

    .line 128
    iput v6, v0, Ll/ܶ᩶ۡ;->᩸:F

    .line 129
    iput v7, v0, Ll/ܶ᩶ۡ;->᩹:F

    .line 185
    iget-char v1, v14, Ll/ۖ᩶ۡ;->ۧ:C

    add-int/lit8 v10, v16, 0x1

    move-object/from16 v12, p1

    move-object v14, v0

    move v0, v1

    move/from16 v15, v22

    goto/16 :goto_0

    :cond_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_a
        0x43 -> :sswitch_9
        0x48 -> :sswitch_8
        0x4c -> :sswitch_9
        0x4d -> :sswitch_7
        0x51 -> :sswitch_9
        0x53 -> :sswitch_9
        0x54 -> :sswitch_9
        0x56 -> :sswitch_6
        0x5a -> :sswitch_5
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x6c -> :sswitch_3
        0x6d -> :sswitch_1
        0x71 -> :sswitch_3
        0x73 -> :sswitch_3
        0x74 -> :sswitch_3
        0x76 -> :sswitch_0
        0x7a -> :sswitch_5
    .end sparse-switch
.end method

.method public static ֫(Ll/֡᩶ۡ;)Z
    .locals 1

    .line 400
    invoke-virtual {p0}, Ll/֡᩶ۡ;->ܽ()I

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static ֫([Ll/ۖ᩶ۡ;)Z
    .locals 6

    .line 138
    array-length v0, p0

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p0, v3

    const/16 v5, 0x7a

    if-eq v1, v5, :cond_0

    const/16 v5, 0x5a

    if-ne v1, v5, :cond_1

    .line 139
    :cond_0
    iget-char v1, v4, Ll/ۖ᩶ۡ;->ۧ:C

    const/16 v5, 0x6d

    if-ne v1, v5, :cond_1

    const/4 p0, 0x1

    return p0

    .line 142
    :cond_1
    iget-char v1, v4, Ll/ۖ᩶ۡ;->ۧ:C

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 7

    .line 433
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    iget-char v1, p0, Ll/ۖ᩶ۡ;->ۧ:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 436
    iget-object v1, p0, Ll/ۖ᩶ۡ;->֫:[F

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v5, v1, v3

    add-int/lit8 v6, v4, 0x1

    .line 437
    rem-int/lit8 v4, v4, 0x2

    if-nez v4, :cond_0

    const/16 v4, 0x20

    goto :goto_1

    :cond_0
    const/16 v4, 0x2c

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    float-to-double v4, v5

    .line 438
    invoke-static {v4, v5}, Ll/᩻֡ۚ;->֫(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    .line 440
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()[F
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ۖ᩶ۡ;->֫:[F

    return-object v0
.end method

.method public final ۧ()C
    .locals 1

    .line 119
    iget-char v0, p0, Ll/ۖ᩶ۡ;->ۧ:C

    return v0
.end method
