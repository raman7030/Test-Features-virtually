.class public final Ll/֡᩻᩷;
.super Ljava/lang/Object;
.source "R2SJ"


# static fields
.field private static final ۠ܰ᩵:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    return-void

    :array_0
    .array-data 2
        0x10d8s
        0x1433s
        0x1439s
        0x147fs
        0x1420s
        0x143cs
        0x1425s
        0x1437s
        0x1439s
        0x143es
        0x147fs
        0x1425s
        0x1420s
        0x1434s
        0x1431s
        0x1424s
        0x1435s
        0x1434s
        0x1431s
        0x1424s
        0x1431s
        0x1439s
        0x1424s
        0x1435s
        0x143ds
        0x1423s
        0x143bs
        0x143es
        0x1434s
        0x1426s
        0x1423s
        0x143fs
    .end array-data
.end method

.method public static ֫()Ll/᩵᩻᩷;
    .locals 1

    .line 101
    new-instance v0, Ll/ۘ᩻᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩵᩻᩷;
    .locals 1

    .line 58
    new-instance v0, Ll/ۖ᩻᩷;

    invoke-direct {v0, p0}, Ll/ۖ᩻᩷;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۧ()Ljava/util/List;
    .locals 35

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0x5f4fc25a

    sget v26, Ll/ۛ;->᩺᩻֫:I

    sget v27, Ll/֨۬;->۫ۙ᩺:I

    const-string v28, "\u05a1\u06d9"

    invoke-static/range {v28 .. v28}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v28

    xor-int v28, v28, v26

    xor-int v0, v28, v27

    mul-int/lit16 v0, v0, 0x4be3

    const v30, -0x55a1e29c

    xor-int v0, v0, v30

    const v30, 0x6995fa9d

    xor-int v28, v28, v30

    move-object/from16 v20, v2

    move-object/from16 v29, v5

    move-object/from16 v24, v9

    move-object v11, v10

    move-object v1, v15

    move-object/from16 v2, v16

    move-object/from16 v9, v23

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object v5, v4

    move-object/from16 v23, v8

    move-object v15, v14

    move-object/from16 v8, v22

    const/4 v4, 0x0

    move-object/from16 v22, v7

    move-object v14, v13

    move-object/from16 v7, v21

    move-object/from16 v21, v6

    move-object v13, v12

    const/4 v12, 0x0

    :goto_0
    xor-int v6, v25, v27

    mul-int/lit16 v6, v6, 0x1f1d

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v25, v28, v0

    sparse-switch v25, :sswitch_data_0

    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    .line 149
    invoke-virtual/range {v21 .. v21}, Ll/ܳ᩻᩷;->ܽ()Lorg/json/JSONObject;

    move-result-object v22

    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/16 v1, 0x15

    move-object/from16 v23, v2

    const/4 v2, 0x5

    invoke-static {v0, v1, v2, v3}, Ll/֡ۨ;->ۡܺ֡([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_11

    move-object/from16 v30, v4

    goto/16 :goto_3

    .line 467
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v0, "\u06d8\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x29

    xor-int v6, v0, v26

    mul-int/lit16 v6, v6, -0x59c3

    const v28, -0x2fea933

    xor-int v6, v6, v28

    const v28, -0x42092c11

    goto/16 :goto_7

    :sswitch_1
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_2

    :cond_1
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    :goto_1
    move-object/from16 v9, v29

    goto/16 :goto_d

    :cond_2
    const-string v0, "\u073a\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v6, v0, v27

    mul-int/lit16 v6, v6, -0x292d

    const v28, 0x4f2ee0eb

    xor-int v6, v6, v28

    const v28, 0x45043777

    goto/16 :goto_7

    .line 355
    :sswitch_2
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_3

    :goto_2
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    goto/16 :goto_8

    :cond_3
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x75

    xor-int v6, v0, v26

    mul-int/lit16 v6, v6, 0x1943

    const v28, -0x2be021f6    # -2.74649999E12f

    xor-int v6, v6, v28

    const v28, -0x31ab931c

    goto/16 :goto_7

    .line 325
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v0, :cond_4

    goto :goto_5

    :cond_4
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v0, v23

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v23, v2

    :goto_3
    move-object/from16 v1, v17

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    goto/16 :goto_25

    .line 165
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v0, :cond_5

    goto :goto_2

    :cond_5
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    :goto_4
    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    goto/16 :goto_18

    .line 81
    :sswitch_5
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_1

    :cond_6
    move/from16 v28, v4

    goto/16 :goto_9

    :sswitch_6
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    :goto_5
    const-string v0, "\u1a75\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v6, v0, v26

    mul-int/lit16 v6, v6, -0x2223

    const v28, 0x10bd5e48

    xor-int v6, v6, v28

    const v28, -0x71ab252f

    goto :goto_7

    .line 92
    :sswitch_7
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_6

    goto/16 :goto_2

    .line 90
    :sswitch_8
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto/16 :goto_2

    .line 200
    :sswitch_9
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    const/4 v0, 0x0

    return-object v0

    .line 161
    :sswitch_a
    invoke-virtual {v14, v4}, Ll/ᩴ᩻᩷;->֫(Z)V

    .line 162
    invoke-static {v11, v14}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v23

    move-object/from16 v0, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v22

    goto/16 :goto_10

    :sswitch_b
    const/4 v0, 0x1

    const/4 v4, 0x1

    goto :goto_6

    :sswitch_c
    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_6
    const-string v0, "\u0736\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x2b

    xor-int v6, v0, v26

    mul-int/lit16 v6, v6, 0x2fad

    const v28, -0x126e35ea

    xor-int v6, v6, v28

    const v28, -0x56461c1d

    :goto_7
    xor-int v28, v0, v28

    move v0, v6

    goto/16 :goto_0

    .line 160
    :sswitch_d
    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/16 v6, 0x1f

    move/from16 v28, v4

    const/4 v4, 0x1

    invoke-static {v0, v6, v4, v3}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {v13, v0}, Ll/ۗ᩶;->ۘ᩷۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "\u06e0\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x45bf

    const v6, 0x51b99c39

    xor-int/2addr v4, v6

    const v6, 0x254b0ef2

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06e4\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x11

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0xd3

    const v6, 0xd39e256

    xor-int/2addr v4, v6

    const v6, 0xf1afa2e

    goto/16 :goto_a

    :sswitch_e
    move/from16 v28, v4

    const/4 v0, 0x1

    .line 159
    invoke-static {v9, v10, v0, v3}, Ll/֫᩹;->᩻۟ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-static {v13, v0}, Ll/ۘܿ;->۬ۖ᩶(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    move-object v4, v9

    move v6, v10

    int-to-long v9, v0

    invoke-virtual {v14, v9, v10}, Ll/ᩴ᩻᩷;->֫(J)V

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_9

    :goto_8
    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x7

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x46e5

    const v10, 0x5aee133d

    xor-int/2addr v9, v10

    const v10, -0x27db29e6

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u073d\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v9, v0, v26

    mul-int/lit16 v9, v9, -0x5ead

    const v10, -0x19beeb3e

    xor-int/2addr v9, v10

    const v10, -0x562a22f1

    goto/16 :goto_c

    :sswitch_f
    move/from16 v28, v4

    .line 158
    invoke-virtual {v14, v2}, Ll/ᩴ᩻᩷;->ۜ(Ljava/lang/String;)V

    .line 159
    invoke-static {v13, v5}, Ll/ۗ᩶;->ۘ᩷۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ᩴ᩻᩷;->ܿ(I)V

    sget-object v9, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/16 v10, 0x1e

    .line 233
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_a

    :goto_9
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x2ee5

    const v6, 0x3fa08a7b

    xor-int/2addr v4, v6

    const v6, -0x36b79431

    goto :goto_a

    :cond_a
    const-string v0, "\u1a73\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, 0x6cfb

    const v6, 0x729a7c25

    xor-int/2addr v4, v6

    const v6, -0x19093666

    :goto_a
    xor-int/2addr v0, v6

    goto/16 :goto_22

    :sswitch_10
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    .line 157
    invoke-virtual {v14, v1}, Ll/ᩴ᩻᩷;->֫(Ljava/lang/String;)V

    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/16 v2, 0x1d

    const/4 v9, 0x1

    invoke-static {v0, v2, v9, v3}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static {v13, v0}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 465
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_b

    goto/16 :goto_1

    :cond_b
    const-string v0, "\u06e0\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x29

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x47d1

    const v10, -0xec8825d

    xor-int/2addr v9, v10

    const v10, 0x67037fcb

    goto/16 :goto_c

    :sswitch_11
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1c

    const/4 v1, 0x1

    .line 156
    invoke-static {v8, v0, v1, v3}, Ll/ۖۘ;->۠ܶܿ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v13, v0}, Ll/᩺;->ᩳ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_b

    :cond_c
    const-string v0, "\u05a1\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x3d0f

    const v10, -0x7e88178a

    xor-int/2addr v9, v10

    const v10, 0x78c6eb92

    goto :goto_c

    :sswitch_12
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1b

    const/4 v8, 0x1

    .line 155
    invoke-static {v7, v0, v8, v3}, Ll/֫᩹;->᩻۟ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v13, v0}, Ll/᩺;->ᩳ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ᩴ᩻᩷;->ܽ(Ljava/lang/String;)V

    sget-object v8, Ll/֡᩻᩷;->۠ܰ᩵:[S

    .line 452
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_b
    const-string v0, "\u0736\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v26, v0

    mul-int/lit8 v0, v0, -0x37

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x7fdb

    const v10, 0x3c41320e

    xor-int/2addr v9, v10

    const v10, -0x779cff3c

    goto :goto_c

    :cond_d
    const-string v0, "\u1a78\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x59

    xor-int v9, v0, v26

    mul-int/lit16 v9, v9, -0x3a53

    const v10, 0x1ee0d89d

    xor-int/2addr v9, v10

    const v10, -0x28e988c2

    :goto_c
    xor-int/2addr v0, v10

    move v10, v6

    move/from16 v33, v28

    move/from16 v28, v0

    move v0, v9

    move-object v9, v4

    goto/16 :goto_23

    :sswitch_13
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    .line 154
    invoke-static {v13, v15}, Ll/ۗ᩶;->ۘ᩷۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ᩴ᩻᩷;->ܽ(I)V

    move-object/from16 v9, v29

    .line 155
    invoke-static {v13, v9}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ᩴ᩻᩷;->ᩳ(Ljava/lang/String;)V

    sget-object v7, Ll/֡᩻᩷;->۠ܰ᩵:[S

    .line 303
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_e

    :goto_d
    const-string v0, "\u06db\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x3f

    xor-int v10, v0, v27

    mul-int/lit16 v10, v10, -0x2187

    const v29, 0x7dac0eba    # 2.858796E37f

    xor-int v10, v10, v29

    const v29, -0x62eb781d

    goto :goto_e

    :cond_e
    const-string v0, "\u06d6\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v10, v0, v26

    mul-int/lit16 v10, v10, -0x38eb

    const v29, -0x71b15895

    xor-int v10, v10, v29

    const v29, -0x103bd74e

    :goto_e
    xor-int v0, v0, v29

    move-object/from16 v29, v9

    move-object v9, v4

    move/from16 v4, v28

    move/from16 v28, v0

    move v0, v10

    goto/16 :goto_1f

    :sswitch_14
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    .line 152
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 153
    new-instance v14, Ll/ᩴ᩻᩷;

    invoke-direct {v14}, Ll/ᩴ᩻᩷;-><init>()V

    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/16 v15, 0x1a

    move-object/from16 v24, v1

    const/4 v1, 0x1

    invoke-static {v0, v15, v1, v3}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object v15

    .line 43
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_f

    move-object/from16 v30, v4

    goto/16 :goto_4

    :cond_f
    const-string v0, "\u0733\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x5b9b

    const v29, -0x79268a76

    xor-int v1, v1, v29

    const v29, 0xda3eecc

    goto :goto_f

    :sswitch_15
    return-object v11

    :sswitch_16
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    .line 151
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_10

    const-string v0, "\u1a74\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x2d09

    const v29, 0x5be0e2a8

    xor-int v1, v1, v29

    const v29, -0x22d4bb82

    goto :goto_f

    :cond_10
    const-string v0, "\u06e7\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x520d

    const v29, -0x7abeaaa2

    xor-int v1, v1, v29

    const v29, 0x13c835cf

    :goto_f
    xor-int v0, v0, v29

    move-object/from16 v29, v9

    move-object v9, v4

    move/from16 v4, v28

    move/from16 v28, v0

    move v0, v1

    goto/16 :goto_17

    :sswitch_17
    move-object/from16 v24, v1

    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v1, v22

    move-object/from16 v10, v23

    move-object/from16 v9, v29

    .line 149
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 150
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    :goto_10
    const-string v22, "\u0730\u0733"

    invoke-static/range {v22 .. v22}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v27

    move-object/from16 v23, v0

    xor-int v0, v22, v26

    mul-int/lit16 v0, v0, -0x7db3

    const v29, 0x6b225fd3

    xor-int v0, v0, v29

    const v29, 0x76ff6ebb

    xor-int v22, v22, v29

    move-object/from16 v29, v9

    move-object v9, v4

    move/from16 v4, v28

    move/from16 v28, v22

    move-object/from16 v22, v1

    move-object/from16 v1, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v10

    goto/16 :goto_1f

    :cond_11
    const-string v1, "\u06eb\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, 0x77

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x3271

    const v29, -0x5b54f176

    xor-int v2, v2, v29

    const v29, -0x10f2bcce

    xor-int v1, v1, v29

    move-object/from16 v29, v9

    move-object v9, v4

    move/from16 v4, v28

    move/from16 v28, v1

    move-object/from16 v1, v24

    move-object/from16 v24, v10

    move v10, v6

    move-object/from16 v33, v23

    move-object/from16 v23, v0

    move v0, v2

    goto/16 :goto_12

    .line 148
    :sswitch_18
    new-instance v0, Ll/֫ۛۡ;

    invoke-virtual/range {v21 .. v21}, Ll/ܳ᩻᩷;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 148
    throw v0

    :sswitch_19
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v22

    move-object/from16 v33, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v33

    .line 147
    invoke-virtual/range {v21 .. v21}, Ll/ܳ᩻᩷;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "\u1a73\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    move-object/from16 v22, v1

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, 0x42cd

    const v29, 0x36908a39

    xor-int v1, v1, v29

    const v29, -0x4b6c0459

    goto :goto_11

    :cond_12
    move-object/from16 v22, v1

    const-string v0, "\u1a7a\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x756d

    const v29, -0x5452b5c8

    xor-int v1, v1, v29

    const v29, 0x11529912

    :goto_11
    xor-int v0, v0, v29

    move-object/from16 v29, v9

    move-object v9, v4

    move/from16 v4, v28

    move/from16 v28, v0

    move v0, v1

    move-object/from16 v1, v24

    move-object/from16 v24, v10

    move v10, v6

    move-object/from16 v33, v23

    move-object/from16 v23, v2

    :goto_12
    move-object/from16 v2, v33

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v33, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v33

    .line 474
    :try_start_0
    invoke-static/range {v20 .. v20}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܳ᩷;

    .line 475
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v29, v2

    .line 476
    :try_start_1
    invoke-static {v0}, Ll/֡ܶ;->᩹᩵ۚ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 477
    invoke-virtual {v0}, Ll/ܽܳ᩷;->᩵()I

    move-result v0

    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v2, v32

    .line 478
    :try_start_2
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v30, v4

    move-object/from16 v32, v5

    move-object/from16 v1, v17

    goto/16 :goto_1b

    :catch_0
    move-exception v0

    goto :goto_14

    :catch_1
    move-exception v0

    goto :goto_13

    :catch_2
    move-exception v0

    move-object/from16 v29, v2

    :goto_13
    move-object/from16 v2, v32

    :goto_14
    move-object/from16 v17, v0

    move-object/from16 v30, v4

    move-object/from16 v32, v5

    goto/16 :goto_1d

    :sswitch_1b
    move/from16 v28, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    :try_start_3
    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    const/4 v1, 0x3

    move-object/from16 v30, v4

    const/16 v4, 0xe

    :try_start_4
    invoke-static {v0, v1, v4, v3}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 481
    :try_start_5
    invoke-static {v0}, Ll/ܿ᩻᩷;->֫(Ljava/lang/String;)Ll/ܿ᩻᩷;

    move-result-object v0

    sget-object v1, Ll/֡᩻᩷;->۠ܰ᩵:[S
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const/16 v4, 0x11

    move-object/from16 v32, v5

    const/4 v5, 0x4

    :try_start_6
    invoke-static {v1, v4, v5, v3}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 482
    invoke-static {v2}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4}, Ll/ۘܿ;->ۨ᩹ܺ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    invoke-virtual {v0}, Ll/ܿ᩻᩷;->ۧ()Ll/ܳ᩻᩷;

    move-result-object v21
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    const-string v0, "\u0730\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x652f

    const v4, -0x523f4403

    xor-int/2addr v1, v4

    const v4, -0x44578932

    goto/16 :goto_1e

    :catch_3
    move-exception v0

    :goto_15
    move-object/from16 v32, v5

    goto/16 :goto_1c

    :catch_4
    move-exception v0

    goto :goto_15

    :catch_5
    move-exception v0

    move-object/from16 v30, v4

    goto :goto_15

    :sswitch_1c
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v29, v23

    move-object/from16 v10, v24

    move-object/from16 v24, v1

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    .line 474
    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/4 v1, 0x2

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/ۘᩴ;->ۤ֨ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    if-eqz v18, :cond_13

    const-string v1, "\u06db\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, -0x3131

    const v5, -0x2cd07b01

    xor-int/2addr v4, v5

    const v5, -0x588339da

    goto :goto_16

    :cond_13
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x1f47

    const v5, 0x7d21b395

    xor-int/2addr v4, v5

    const v5, -0x3e6ae77f

    :goto_16
    xor-int/2addr v1, v5

    move-object/from16 v9, v30

    move-object/from16 v5, v32

    move-object/from16 v32, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v29

    move-object/from16 v29, v0

    move v0, v4

    move/from16 v4, v28

    move/from16 v28, v1

    :goto_17
    move-object/from16 v1, v24

    goto :goto_1a

    :sswitch_1d
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/4 v1, 0x1

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/֡۬;->ۢܳ᩸([SIII)Ljava/lang/String;

    move-result-object v5

    .line 466
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_14

    :goto_18
    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x59

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x61ed

    const v4, 0x118bb339

    xor-int/2addr v1, v4

    const v4, 0x76feb790

    goto :goto_19

    :cond_14
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x4f

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x4003

    const v4, -0x738a0ee9

    xor-int/2addr v1, v4

    const v4, 0x63f00a3b

    :goto_19
    xor-int/2addr v0, v4

    move-object/from16 v32, v2

    move-object/from16 v2, v23

    move/from16 v4, v28

    move-object/from16 v23, v29

    move/from16 v28, v0

    move v0, v1

    move-object/from16 v29, v9

    move-object/from16 v1, v24

    move-object/from16 v9, v30

    :goto_1a
    move-object/from16 v24, v10

    goto/16 :goto_1f

    :sswitch_1e
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    .line 474
    :try_start_7
    invoke-static/range {v20 .. v20}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v18
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    const-string v0, "\u0733\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x7

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, 0x172d

    const v4, 0x4f23d3a

    xor-int/2addr v1, v4

    const v4, 0x45329c4a

    goto :goto_1e

    .line 485
    :sswitch_1f
    new-instance v0, Ljava/lang/RuntimeException;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_20
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    .line 472
    :try_start_8
    invoke-static {}, Ll/۬ܿ᩷;->ۧ()Ljava/util/List;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 473
    :try_start_9
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 474
    :try_start_a
    invoke-static {v0}, Ll/֨ۤ;->ۨ۫֨(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    move-object/from16 v20, v0

    :goto_1b
    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x4c5d

    const v5, -0x7c8d7f64

    xor-int/2addr v4, v5

    const v5, 0x5f4e3a4d

    goto/16 :goto_21

    :catch_6
    move-exception v0

    const/4 v2, 0x0

    goto :goto_1c

    :catch_7
    move-exception v0

    :goto_1c
    move-object/from16 v17, v0

    :goto_1d
    const-string v0, "\u06e8\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, 0xb

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x44df

    const v4, -0x4ce77f7f

    xor-int/2addr v1, v4

    const v4, 0x62123727

    :goto_1e
    xor-int/2addr v0, v4

    move/from16 v4, v28

    move-object/from16 v5, v32

    move/from16 v28, v0

    move v0, v1

    move-object/from16 v32, v2

    move-object/from16 v2, v23

    move-object/from16 v1, v24

    move-object/from16 v23, v29

    move-object/from16 v29, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v30

    :goto_1f
    move v10, v6

    goto/16 :goto_0

    .line 144
    :sswitch_21
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :sswitch_22
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    .line 146
    sget v0, Ll/ܺ᩻᩷;->֫:I

    const-string v0, "\u06e4\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x7b7d

    const v5, 0x275e594

    xor-int/2addr v4, v5

    const v5, -0x25404e51

    goto/16 :goto_21

    :sswitch_23
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    .line 143
    invoke-static {}, Ll/۬ܿ᩷;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ;->᩺ۚۧ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "\u06df\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x6cdf

    const v5, -0x3d8dd047

    xor-int/2addr v4, v5

    const v5, 0x4cb7e071    # 9.640436E7f

    goto :goto_21

    :cond_15
    const-string v0, "\u06d8\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x1d

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x2a47

    const v5, 0x354989ec

    xor-int/2addr v4, v5

    const v5, 0x2d880851

    goto :goto_21

    :sswitch_24
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    const/16 v0, 0x472b

    const/16 v3, 0x472b

    goto :goto_20

    :sswitch_25
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    const/16 v0, 0x1450

    const/16 v3, 0x1450

    :goto_20
    const-string v0, "\u06da\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x36f7

    const v5, -0x3cd30dd2

    xor-int/2addr v4, v5

    const v5, 0x26785753

    :goto_21
    xor-int/2addr v0, v5

    move-object/from16 v17, v1

    move-object/from16 v1, v24

    move-object/from16 v5, v32

    move-object/from16 v32, v2

    move-object/from16 v24, v10

    move-object/from16 v2, v23

    move-object/from16 v23, v29

    move v10, v6

    move-object/from16 v29, v9

    move-object/from16 v9, v30

    :goto_22
    move/from16 v33, v28

    move/from16 v28, v0

    move v0, v4

    :goto_23
    move/from16 v4, v33

    goto/16 :goto_0

    :sswitch_26
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    mul-int v0, v19, v19

    move/from16 v4, v31

    mul-int/lit16 v5, v4, 0x77f8

    sub-int/2addr v0, v5

    if-gez v0, :cond_16

    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x1f

    xor-int v5, v0, v26

    mul-int/lit16 v5, v5, -0x5f6f

    const v17, -0x34975240    # -1.5248832E7f

    xor-int v5, v5, v17

    const v17, 0x26050c1c

    goto :goto_24

    :cond_16
    const-string v0, "\u06e0\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v5, v0, v27

    mul-int/lit16 v5, v5, 0x5ca1

    const v17, -0x2ddd2d76

    xor-int v5, v5, v17

    const v17, 0x52ed1446

    :goto_24
    xor-int v0, v0, v17

    move-object/from16 v17, v1

    move/from16 v31, v4

    move-object/from16 v1, v24

    move/from16 v4, v28

    move/from16 v28, v0

    move v0, v5

    move-object/from16 v24, v10

    move-object/from16 v5, v32

    move-object/from16 v32, v2

    move v10, v6

    move-object/from16 v2, v23

    move-object/from16 v23, v29

    goto/16 :goto_26

    :sswitch_27
    move/from16 v28, v4

    move-object/from16 v30, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v9, v29

    move-object/from16 v24, v1

    move-object/from16 v1, v17

    move-object/from16 v29, v23

    move-object/from16 v23, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v5

    sget-object v0, Ll/֡᩻᩷;->۠ܰ᩵:[S

    const/4 v4, 0x0

    aget-short v0, v0, v4

    add-int/lit16 v4, v0, 0x1dfe

    .line 91
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_17

    move/from16 v31, v0

    move/from16 v19, v4

    move-object/from16 v0, v29

    :goto_25
    const-string v4, "\u1a74\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v26

    xor-int v5, v4, v27

    mul-int/lit16 v5, v5, 0x43f5

    const v17, 0x7752f9

    xor-int v5, v5, v17

    const v17, 0x7e629483

    xor-int v4, v4, v17

    move-object/from16 v17, v1

    move-object/from16 v29, v9

    move-object/from16 v1, v24

    move-object/from16 v9, v30

    move-object/from16 v24, v10

    move v10, v6

    move-object/from16 v33, v23

    move-object/from16 v23, v0

    move v0, v5

    move-object/from16 v5, v32

    move-object/from16 v32, v2

    move-object/from16 v2, v33

    move/from16 v34, v28

    move/from16 v28, v4

    move/from16 v4, v34

    goto/16 :goto_0

    :cond_17
    const-string v5, "\u06e2\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v27

    mul-int/lit8 v5, v5, -0x2d

    move/from16 v17, v0

    xor-int v0, v5, v26

    mul-int/lit16 v0, v0, -0x1047

    const v19, 0xb726fda

    xor-int v0, v0, v19

    const v19, 0x1021a453

    xor-int v5, v5, v19

    move/from16 v19, v4

    move/from16 v31, v17

    move/from16 v4, v28

    move-object/from16 v17, v1

    move/from16 v28, v5

    move-object/from16 v1, v24

    move-object/from16 v5, v32

    move-object/from16 v32, v2

    move-object/from16 v24, v10

    move-object/from16 v2, v23

    move-object/from16 v23, v29

    move v10, v6

    :goto_26
    move-object/from16 v29, v9

    move-object/from16 v9, v30

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ec5731e -> :sswitch_0
        -0x7e90b0e3 -> :sswitch_1d
        -0x7c5a5220 -> :sswitch_d
        -0x7b5d906e -> :sswitch_27
        -0x792c19e6 -> :sswitch_7
        -0x77605cb1 -> :sswitch_16
        -0x72a47c42 -> :sswitch_20
        -0x6f7b0d7d -> :sswitch_26
        -0x6ca97287 -> :sswitch_4
        -0x6a0e8187 -> :sswitch_10
        -0x650ba2c9 -> :sswitch_f
        -0x61a9f426 -> :sswitch_5
        -0x606253c7 -> :sswitch_23
        -0x5eaec27b -> :sswitch_d
        -0x5e7fd0a2 -> :sswitch_21
        -0x5c8e1902 -> :sswitch_7
        -0x57cc0e3f -> :sswitch_2
        -0x54cb956c -> :sswitch_17
        -0x5007e5a5 -> :sswitch_1a
        -0x4d860a94 -> :sswitch_1e
        -0x43a8d1e7 -> :sswitch_8
        -0x4025247a -> :sswitch_25
        -0x3fc52bd6 -> :sswitch_c
        -0x3e332511 -> :sswitch_8
        -0x3d8a7876 -> :sswitch_0
        -0x3991ebe8 -> :sswitch_f
        -0x37833ec2 -> :sswitch_b
        -0x36ee395f -> :sswitch_1b
        -0x34b053bf -> :sswitch_23
        -0x2dc495ef -> :sswitch_20
        -0x2bf4a840 -> :sswitch_18
        -0x2bd17104 -> :sswitch_10
        -0x2a538703 -> :sswitch_14
        -0x24ae2db8 -> :sswitch_22
        -0x1f6bd769 -> :sswitch_13
        -0x1f01a2ab -> :sswitch_1e
        -0x1cadf69a -> :sswitch_a
        -0x1a406c06 -> :sswitch_22
        -0x1660d0ae -> :sswitch_1a
        -0x1585550f -> :sswitch_6
        -0x118e0b6a -> :sswitch_e
        -0x10f1d22a -> :sswitch_26
        -0xf8b89d2 -> :sswitch_12
        -0x965ab85 -> :sswitch_19
        -0x22dbfe9 -> :sswitch_6
        -0x1003755 -> :sswitch_15
        0xd9e228b -> :sswitch_19
        0x108bb733 -> :sswitch_18
        0x1a5e896d -> :sswitch_12
        0x1ce4a48a -> :sswitch_e
        0x1f4e7017 -> :sswitch_1
        0x20100b3b -> :sswitch_11
        0x21dad273 -> :sswitch_24
        0x22f2616c -> :sswitch_17
        0x28f1d66b -> :sswitch_3
        0x296dc143 -> :sswitch_9
        0x2b85cab4 -> :sswitch_3
        0x2bd04f49 -> :sswitch_15
        0x3052ca2d -> :sswitch_c
        0x3274dff0 -> :sswitch_2
        0x348b8935 -> :sswitch_1b
        0x384084d9 -> :sswitch_a
        0x4410820b -> :sswitch_24
        0x4824288e -> :sswitch_1f
        0x4fce13fb -> :sswitch_b
        0x537a8ef0 -> :sswitch_1f
        0x57ba792b -> :sswitch_1c
        0x5b5ccf51 -> :sswitch_9
        0x6017d7e2 -> :sswitch_13
        0x62a9fc69 -> :sswitch_1
        0x64c70183 -> :sswitch_27
        0x663cc527 -> :sswitch_1d
        0x6c508a20 -> :sswitch_21
        0x6de4aecc -> :sswitch_11
        0x77912944 -> :sswitch_1c
        0x79f122d9 -> :sswitch_14
        0x7a52245a -> :sswitch_4
        0x7c0ba404 -> :sswitch_25
        0x7c8e80a5 -> :sswitch_5
        0x7e7b8f70 -> :sswitch_16
    .end sparse-switch
.end method
