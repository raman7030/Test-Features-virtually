.class public final Ll/᩻֡ۡ;
.super Ljava/lang/Object;
.source "U4EL"


# static fields
.field public static final synthetic ֫:I

.field private static final ۢܽܰ:[S

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 24

    const/16 v0, 0x40

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻֡ۡ;->ۢܽܰ:[S

    const/4 v1, 0x0

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

    const v14, -0x7e3d0e38

    sget v15, Ll/֡ᩴ;->ܳۤ֫:I

    sget v16, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v17, "\u06d8\u073d"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v0, v17, v16

    mul-int/lit16 v0, v0, -0x38b5

    const v19, -0x2994058e

    xor-int v0, v0, v19

    const v19, -0x381531e6

    xor-int v17, v17, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    const/16 v18, 0x0

    :goto_0
    xor-int v14, v14, v16

    mul-int/lit16 v14, v14, -0x49dd

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v0, v14

    xor-int v14, v17, v0

    sparse-switch v14, :sswitch_data_0

    move/from16 v17, v14

    move-object/from16 v0, v19

    .line 19
    invoke-static/range {v20 .. v20}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v14

    sput-object v14, Ll/᩻֡ۡ;->ܽ:Ljava/util/regex/Pattern;

    sget-boolean v14, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v14, :cond_d

    goto/16 :goto_7

    .line 0
    :sswitch_0
    sget-object v9, Ll/᩻֡ۡ;->ۢܽܰ:[S

    const/16 v11, 0x32

    .line 19
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_0

    move/from16 v17, v14

    const/4 v10, 0x1

    goto/16 :goto_1

    :cond_0
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v10, v0, v16

    mul-int/lit16 v10, v10, 0x41a3

    const v22, 0x5d79e3bf

    xor-int v10, v10, v22

    const v22, 0x4d47ee16    # 2.09641824E8f

    move/from16 v17, v14

    move v14, v10

    const/4 v10, 0x1

    goto/16 :goto_9

    :sswitch_1
    sget-object v12, Ll/᩻֡ۡ;->ۢܽܰ:[S

    const/16 v13, 0x33

    .line 6
    sget v17, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v17, :cond_1

    move-object v0, v12

    move/from16 v17, v14

    const/16 v12, 0xd

    goto/16 :goto_7

    :cond_1
    const-string v17, "\u06d9\u073a"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v0, v17, v16

    mul-int/lit16 v0, v0, 0x4531

    const v22, -0xf04e6a9

    xor-int v0, v0, v22

    const v22, 0x1fe850f5

    move-object/from16 v19, v12

    const/16 v12, 0xd

    move/from16 v23, v14

    move v14, v0

    move/from16 v0, v17

    move/from16 v17, v23

    goto/16 :goto_9

    .line 11
    :sswitch_2
    sget-object v18, Ll/᩻֡ۡ;->ۢܽܰ:[S

    const/16 v21, 0x0

    .line 4
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_2

    move/from16 v17, v14

    goto/16 :goto_1

    :cond_2
    const-string v0, "\u06da\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x35

    move/from16 v17, v14

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x509d

    const v22, 0x5673f707

    xor-int v14, v14, v22

    const v22, -0x2c9988b

    goto/16 :goto_9

    :sswitch_3
    move/from16 v17, v14

    add-int v5, v3, v4

    const/4 v6, 0x1

    .line 8
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u06d7\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x77

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x2a43

    const v22, -0x2aa124b4

    xor-int v14, v14, v22

    const v22, -0xf4986a0

    goto/16 :goto_9

    :sswitch_4
    move/from16 v17, v14

    .line 11
    aget-short v1, v18, v21

    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x6571

    const v22, 0x22158c87

    xor-int v14, v14, v22

    const v22, -0x43ed8a2

    goto/16 :goto_9

    :sswitch_5
    move/from16 v17, v14

    .line 2
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v0, :cond_b

    goto :goto_1

    :sswitch_6
    move/from16 v17, v14

    .line 11
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto :goto_1

    :sswitch_7
    move/from16 v17, v14

    const v0, 0xd4cc

    goto/16 :goto_2

    :sswitch_8
    move/from16 v17, v14

    const/4 v2, 0x2

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v0, "\u06da\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x5f

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x1251

    const v22, 0xc44441c

    xor-int v14, v14, v22

    const v22, -0xa9f242a

    goto/16 :goto_9

    :sswitch_9
    move/from16 v17, v14

    mul-int v3, v1, v2

    const/4 v4, 0x1

    .line 10
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, 0x5f09

    const v22, -0x42a9d9c6

    xor-int v14, v14, v22

    const v22, -0x1b47db5d

    goto/16 :goto_9

    :sswitch_a
    move/from16 v17, v14

    .line 0
    invoke-static {v9, v10, v11, v8}, Ll/֫ۡ;->֫ܿۨ([SIII)Ljava/lang/String;

    move-result-object v20

    .line 7
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_7

    :goto_1
    const-string v0, "\u0736\u06e8"

    .line 4
    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x21

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x1497

    const v22, -0x2b9b3296

    xor-int v14, v14, v22

    const v22, -0xf2d1a85

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u1a76\u1a7b"

    .line 7
    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x661f

    const v22, 0x73f38707

    xor-int v14, v14, v22

    const v22, -0x1d362ac6

    goto/16 :goto_9

    :sswitch_b
    move/from16 v17, v14

    const v0, 0xa984

    :goto_2
    const-string v8, "\u06e0\u1a75"

    .line 19
    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v16

    xor-int v14, v8, v15

    mul-int/lit8 v14, v14, -0x5f

    const v22, -0x3432b19a    # -2.69099E7f

    xor-int v14, v14, v22

    const v22, -0x6b80463

    move/from16 v23, v8

    move v8, v0

    :goto_3
    move/from16 v0, v23

    goto/16 :goto_9

    .line 7
    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_d
    move/from16 v17, v14

    .line 19
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_8

    goto :goto_5

    :sswitch_e
    move/from16 v17, v14

    add-int v7, v1, v6

    .line 16
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_9

    :cond_8
    :goto_4
    const-string v0, "\u06db\u073d"

    .line 11
    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x5933

    const v22, -0x585f5f28

    xor-int v14, v14, v22

    const v22, 0xc64e1da

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u06ec\u06ec"

    .line 16
    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x27

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x61a1

    const v22, 0x6251582c

    xor-int v14, v14, v22

    const v22, -0x6d40a7df

    goto/16 :goto_9

    :sswitch_f
    move/from16 v17, v14

    mul-int v0, v7, v7

    sub-int/2addr v0, v5

    if-ltz v0, :cond_a

    const-string v0, "\u06e0\u05a1"

    .line 19
    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x46ad

    const v22, 0x1c069c29

    xor-int v14, v14, v22

    const v22, -0x1780df8e

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u0733\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x22e9

    const v22, -0xbb96bd5

    xor-int v14, v14, v22

    const v22, 0x41bfddb0

    goto/16 :goto_9

    :sswitch_10
    move/from16 v17, v14

    .line 0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v0

    if-lez v0, :cond_c

    :cond_b
    :goto_5
    const-string v0, "\u06dc\u06d7"

    .line 2
    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x77

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x5f91

    const v22, 0x60acb6bf

    xor-int v14, v14, v22

    const v22, 0x7bfd6233

    goto :goto_9

    :cond_c
    :goto_6
    const-string v0, "\u05a8\u0736"

    .line 8
    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x65

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x3759

    const v22, 0xf77c54c

    xor-int v14, v14, v22

    const v22, -0x67ba5644

    goto :goto_9

    :sswitch_11
    move-object/from16 v0, v19

    .line 19
    invoke-static {v0, v13, v12, v8}, Ll/֡ۨ;->ۡܺ֡([SIII)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻֡ۡ;->ۧ:Ljava/util/regex/Pattern;

    return-void

    :goto_7
    const-string v14, "\u05a1\u05ab"

    .line 6
    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v16

    move-object/from16 v19, v0

    xor-int v0, v14, v15

    mul-int/lit16 v0, v0, 0x208d

    const v22, 0x2bf36940

    xor-int v0, v0, v22

    const v22, -0x620bbdd3

    goto :goto_8

    :cond_d
    const-string v14, "\u1a76\u06df"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v15

    mul-int/lit8 v14, v14, -0x6f

    move-object/from16 v19, v0

    xor-int v0, v14, v16

    mul-int/lit16 v0, v0, -0x47d3

    const v22, -0x4cdd765

    xor-int v0, v0, v22

    const v22, 0x57fcd62b

    :goto_8
    move/from16 v23, v14

    move v14, v0

    goto/16 :goto_3

    :goto_9
    xor-int v0, v0, v22

    move/from16 v23, v17

    move/from16 v17, v0

    move v0, v14

    move/from16 v14, v23

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79ec8b25 -> :sswitch_11
        -0x6a603a49 -> :sswitch_10
        -0x592c8439 -> :sswitch_f
        -0x5513a2ad -> :sswitch_e
        -0x50047bf2 -> :sswitch_d
        -0x3e90eacd -> :sswitch_c
        -0x2fa31b0a -> :sswitch_b
        -0x2ea1fdb5 -> :sswitch_a
        -0x2e4a7ab3 -> :sswitch_9
        -0x269cb263 -> :sswitch_8
        -0x210603a0 -> :sswitch_a
        -0x20cd2ec7 -> :sswitch_7
        -0x2031c83d -> :sswitch_e
        -0x17bc8341 -> :sswitch_6
        -0x16fd0410 -> :sswitch_5
        -0xcc4d0e1 -> :sswitch_4
        -0x95345b0 -> :sswitch_9
        0xc17292d -> :sswitch_d
        0x180292f6 -> :sswitch_f
        0x313655d5 -> :sswitch_4
        0x3e987248 -> :sswitch_11
        0x456a4a9e -> :sswitch_3
        0x4746fa02 -> :sswitch_2
        0x47b929e2 -> :sswitch_1
        0x50654ae6 -> :sswitch_c
        0x56e77cfa -> :sswitch_6
        0x5da2ac54 -> :sswitch_0
        0x5e11ead0 -> :sswitch_2
        0x623a1005 -> :sswitch_8
        0x68a4cb22 -> :sswitch_0
        0x6b7ef9a9 -> :sswitch_5
        0x6da9aa73 -> :sswitch_1
        0x7184051c -> :sswitch_7
        0x73127332 -> :sswitch_b
        0x755b2259 -> :sswitch_3
        0x7e6adb4a -> :sswitch_10
    .end sparse-switch

    :array_0
    .array-data 2
        0x20c1s
        -0x2b6es
        -0x2b69s
        -0x2b53s
        -0x2b1fs
        -0x2b4as
        -0x2b73s
        -0x2b1fs
        -0x2b6as
        -0x2b04s
        -0x2b1fs
        -0x2b0bs
        -0x2b6ds
        -0x2b1es
        -0x2b70s
        -0x2b1fs
        -0x2b6fs
        -0x2b19s
        -0x2b74s
        -0x2b69s
        -0x2b53s
        -0x2b1fs
        -0x2b4as
        -0x2b73s
        -0x2b1fs
        -0x2b6as
        -0x2b04s
        -0x2b1fs
        -0x2b0bs
        -0x2b6ds
        -0x2b1es
        -0x2b70s
        -0x2b1fs
        -0x2b6fs
        -0x2b19s
        -0x2b70s
        -0x2b1es
        -0x2b69s
        -0x2b53s
        -0x2b1fs
        -0x2b4as
        -0x2b73s
        -0x2b1fs
        -0x2b6as
        -0x2b6fs
        -0x2b49s
        -0x2b02s
        -0x2b20s
        -0x2b06s
        -0x2b4fs
        -0x2b18s
        -0x2b6es
        -0x2b03s
        -0x2b69s
        -0x2b01s
        -0x2b1fs
        -0x2b0bs
        -0x2b6fs
        -0x2b70s
        -0x2b58s
        -0x2b49s
        -0x2b0bs
        -0x2b4fs
        -0x2b18s
    .end array-data
.end method

.method public static ֫(IILjava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x39becb70

    sget v2, Ll/֡᩶;->ܳܶ۠:I

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6f6d

    const v6, 0x77f04876

    xor-int/2addr v5, v6

    const v6, -0x7525964d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x1a55

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :sswitch_0
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_6

    goto/16 :goto_1

    .line 44
    :sswitch_1
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :sswitch_2
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_c

    goto/16 :goto_2

    .line 20
    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_2

    .line 25
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    :sswitch_6
    if-gt v0, p1, :cond_0

    const-string v4, "\u0733\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x28e7

    const v6, 0x6a3c3902

    xor-int/2addr v5, v6

    const v6, 0x1a651a25

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x0

    return p0

    .line 69
    :sswitch_8
    invoke-static {p2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v0

    if-gt p0, v0, :cond_0

    const-string v4, "\u06e1\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e63

    const v6, -0x40477b1b

    xor-int/2addr v5, v6

    const v6, -0x2c9900c6

    goto :goto_0

    :sswitch_9
    if-nez p2, :cond_1

    :cond_0
    const-string v4, "\u1a75\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6de7

    const v6, -0x635ba087

    xor-int/2addr v5, v6

    const v6, 0x7e673773

    goto :goto_0

    :cond_1
    const-string v4, "\u06db\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x247f

    const v6, -0x18861273

    xor-int/2addr v5, v6

    const v6, 0x532b48c1

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06e0\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c51

    const v6, 0x4a8e066a    # 4653877.0f

    xor-int/2addr v5, v6

    const v6, 0x73610786

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u05a8\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x652f

    const v6, -0x328472f9

    xor-int/2addr v5, v6

    const v6, 0x2261fd1d

    goto/16 :goto_0

    .line 30
    :sswitch_b
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a78\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x35e5

    const v6, 0x449c1a8f

    xor-int/2addr v5, v6

    const v6, 0x79410bbf

    goto/16 :goto_0

    .line 47
    :sswitch_c
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06d6\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2757

    const v6, 0x3ce3bd55

    xor-int/2addr v5, v6

    const v6, 0x40394a46

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v4

    if-ltz v4, :cond_7

    :cond_6
    const-string v4, "\u1a7b\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e5d

    const v6, -0x7f6f6335

    xor-int/2addr v5, v6

    const v6, -0xa355118

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06ec\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x11c5

    const v6, 0x45d67c5a

    xor-int/2addr v5, v6

    const v6, -0x5f31ae77

    goto/16 :goto_0

    .line 66
    :sswitch_e
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u06d7\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xa5

    const v6, -0x5c303d65

    xor-int/2addr v5, v6

    const v6, -0x7acfff30

    goto/16 :goto_0

    .line 9
    :sswitch_f
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_1
    const-string v4, "\u1a7b\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x51cf

    const v6, 0x2bcf1929

    xor-int/2addr v5, v6

    const v6, 0x1c80461d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3adf

    const v6, -0x3341e5fe    # -9.9667984E7f

    xor-int/2addr v5, v6

    const v6, 0x2df3fc7d

    goto/16 :goto_0

    .line 26
    :sswitch_10
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-eqz v4, :cond_b

    :goto_2
    const-string v4, "\u073d\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36bf

    const v6, 0x3d9eb1dd

    xor-int/2addr v5, v6

    const v6, 0x34341a49

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06ec\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x74bd

    const v6, -0x1e04f07d

    xor-int/2addr v5, v6

    const v6, -0x4ec5673

    goto/16 :goto_0

    .line 40
    :sswitch_11
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_3
    const-string v4, "\u1a74\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7e21

    const v6, -0x316bc318

    xor-int/2addr v5, v6

    const v6, -0x3b2d97f6

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28b3

    const v6, -0x470eeb6

    xor-int/2addr v5, v6

    const v6, 0x6b3eb130

    goto/16 :goto_0

    .line 26
    :sswitch_12
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_e

    :goto_4
    const-string v4, "\u1a79\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xdaf

    const v6, -0x4ac28b21

    xor-int/2addr v5, v6

    const v6, 0x826a751

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06d9\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x82f

    const v6, -0x141c82d6

    xor-int/2addr v5, v6

    const v6, -0x7614a2d7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7b3daa -> :sswitch_11
        -0x7b18ff29 -> :sswitch_1
        -0x79b86535 -> :sswitch_12
        -0x7819e264 -> :sswitch_9
        -0x75c0c21a -> :sswitch_4
        -0x75b12cf1 -> :sswitch_f
        -0x6e787471 -> :sswitch_3
        -0x6c2590ed -> :sswitch_7
        -0x62fa8a77 -> :sswitch_f
        -0x6045b485 -> :sswitch_10
        -0x5e2177f9 -> :sswitch_a
        -0x5d44f3a3 -> :sswitch_8
        -0x567df40d -> :sswitch_3
        -0x4b41ae96 -> :sswitch_b
        -0x331dda3b -> :sswitch_b
        -0x2ca4a330 -> :sswitch_11
        -0x294aa607 -> :sswitch_e
        -0x207ffe18 -> :sswitch_d
        -0xc227814 -> :sswitch_4
        -0x3e75637 -> :sswitch_6
        0xb79ad1 -> :sswitch_e
        0x99b7cda -> :sswitch_8
        0xb254120 -> :sswitch_7
        0x27e1d164 -> :sswitch_6
        0x2d3c9fd9 -> :sswitch_c
        0x35a08a3a -> :sswitch_d
        0x3b18f5e1 -> :sswitch_2
        0x3ea7c982 -> :sswitch_5
        0x40d51365 -> :sswitch_5
        0x4633929c -> :sswitch_2
        0x48a4ff4c -> :sswitch_c
        0x52957384 -> :sswitch_0
        0x5d065e13 -> :sswitch_0
        0x6a7e65d8 -> :sswitch_10
        0x71e3e9ea -> :sswitch_9
        0x747a42b9 -> :sswitch_1
        0x78d1a41f -> :sswitch_a
        0x7e5d7431 -> :sswitch_12
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x979415e

    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v4, "\u06db\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xfef

    const v6, -0x4b77aed9

    xor-int/2addr v5, v6

    const v6, -0x18c47455

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x14bf

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 21
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_4

    goto/16 :goto_1

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v4, :cond_7

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    .line 10
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x0

    return p0

    .line 57
    :sswitch_6
    sget-object v0, Ll/᩻֡ۡ;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_7
    const/16 v4, 0x20

    .line 55
    invoke-static {v0, v4, p0}, Ll/᩻֡ۡ;->֫(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u0736\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a5b

    const v6, -0x702b0c36

    xor-int/2addr v5, v6

    const v6, 0x26137fc2

    goto :goto_0

    :cond_0
    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b3b

    const v6, -0x1a75342c

    xor-int/2addr v5, v6

    const v6, -0x46c92a94

    goto :goto_0

    :sswitch_8
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u05a1\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7657

    const v6, 0x1f7dbd23

    xor-int/2addr v5, v6

    const v6, -0x1941cc06

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a73\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3333

    const v6, -0x76bde892

    xor-int/2addr v5, v6

    const v6, 0x15fc74df

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string v4, "\u06d6\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x76d9

    const v6, -0x4cdae116

    xor-int/2addr v5, v6

    const v6, -0x70c503a1

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e4\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x639d

    const v6, 0x3e07bd38

    xor-int/2addr v5, v6

    const v6, 0x288b24f

    goto/16 :goto_0

    .line 23
    :sswitch_a
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06e0\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1fcf

    const v6, -0x165f5796

    xor-int/2addr v5, v6

    const v6, 0x6196a284

    goto/16 :goto_0

    .line 14
    :sswitch_b
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u06da\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6b07

    const v6, 0x2d9e3417

    xor-int/2addr v5, v6

    const v6, 0x67b02db

    goto/16 :goto_0

    .line 34
    :sswitch_c
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_8

    :cond_7
    const-string v4, "\u06dc\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2a65

    const v6, 0x1eeab42b

    xor-int/2addr v5, v6

    const v6, 0x78f09f06

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ee3

    const v6, 0x7299a3b2

    xor-int/2addr v5, v6

    const v6, 0x27e03d2e

    goto/16 :goto_0

    .line 50
    :sswitch_d
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u06e0\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x25b3

    const v6, -0x64fb5409

    xor-int/2addr v5, v6

    const v6, -0x2a9265d9

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1b83

    const v6, -0x58e48c77

    xor-int/2addr v5, v6

    const v6, 0x42d79c08

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6645

    const v6, 0x78c4fa78

    xor-int/2addr v5, v6

    const v6, 0x71fe72ad

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073a\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2d75

    const v6, 0x558ad614

    xor-int/2addr v5, v6

    const v6, 0x4ae6626a    # 7549237.0f

    goto/16 :goto_0

    .line 3
    :sswitch_f
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3cf9

    const v6, -0x5be83510

    xor-int/2addr v5, v6

    const v6, 0x5a7716dd

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x6

    .line 10
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_d

    :cond_c
    :goto_4
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3479

    const v6, 0x173ba60c

    xor-int/2addr v5, v6

    const v6, 0x3661b05b

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0736\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x570b

    const v6, -0x1525bcd0

    xor-int/2addr v5, v6

    const v6, 0x7134dec6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7737ed6c -> :sswitch_7
        -0x6f43e5ca -> :sswitch_f
        -0x6e7748f8 -> :sswitch_6
        -0x65ad56ed -> :sswitch_e
        -0x63cfffed -> :sswitch_5
        -0x5b964ede -> :sswitch_d
        -0x4a008a0b -> :sswitch_2
        -0x4754be23 -> :sswitch_c
        -0x3fec2de2 -> :sswitch_b
        -0x3c362eb7 -> :sswitch_8
        -0x3679cec6 -> :sswitch_10
        -0x2d4ea0ac -> :sswitch_10
        -0x236cac11 -> :sswitch_7
        -0xb3f2ed1 -> :sswitch_8
        -0x459f318 -> :sswitch_4
        -0x181697c -> :sswitch_a
        -0xf4c47a -> :sswitch_6
        0x23ea3bb -> :sswitch_1
        0x1323906b -> :sswitch_0
        0x13bcc833 -> :sswitch_b
        0x187c239b -> :sswitch_4
        0x28c6b867 -> :sswitch_a
        0x30d5b721 -> :sswitch_3
        0x317471e0 -> :sswitch_d
        0x3447aadc -> :sswitch_e
        0x44af8543 -> :sswitch_9
        0x45a2ab15 -> :sswitch_0
        0x48c40d47 -> :sswitch_2
        0x5ece9e2d -> :sswitch_1
        0x5f89595c -> :sswitch_f
        0x64535d38 -> :sswitch_9
        0x6583175a -> :sswitch_5
        0x6c6a21dd -> :sswitch_c
        0x724feb73 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x18

    .line 23
    invoke-static {v0, v1, p0}, Ll/᩻֡ۡ;->֫(IILjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x4e9fa261

    sget v7, Ll/۠;->ܺܺܶ:I

    sget v8, Ll/ۘۨ;->۫᩸۠:I

    const-string v9, "\u06e0\u06dc"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x2b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3b31

    const v11, -0x642303a5

    xor-int/2addr v10, v11

    const v11, 0x3e187ed7

    :goto_0
    xor-int/2addr v9, v11

    :goto_1
    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x6615

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    const/16 v1, 0x20

    .line 4
    sget-boolean v9, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v9, :cond_3

    goto/16 :goto_5

    .line 25
    :sswitch_0
    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v9, :cond_6

    goto/16 :goto_7

    :sswitch_1
    sget v9, Ll/֡᩶;->ܳܶ۠:I

    if-lez v9, :cond_a

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_e

    goto :goto_2

    .line 41
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_2
    const-string v9, "\u1a73\u05a1"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x11bd

    const v11, -0x37abc312

    xor-int/2addr v10, v11

    const v11, 0x3c14f66c

    goto :goto_0

    .line 16
    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v2

    :sswitch_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 48
    :sswitch_7
    aget-char v9, v3, v5

    if-ne v9, v1, :cond_0

    const-string v9, "\u0736\u06d9"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x67

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2ed3

    const v11, -0xbfccd9a

    xor-int/2addr v10, v11

    const v11, -0x56632663

    goto :goto_0

    :cond_0
    const-string v9, "\u1a73\u06e2"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x26eb

    const v11, 0x1afabef4

    xor-int/2addr v10, v11

    const v11, 0x5e9e31c6

    goto :goto_0

    :sswitch_8
    const/4 p0, 0x1

    return p0

    :sswitch_9
    if-ge v5, v4, :cond_1

    const-string v9, "\u1a7b\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x23

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5543

    const v11, 0x506c8efb

    xor-int/2addr v10, v11

    const v11, -0x2cc8cb6f

    goto/16 :goto_0

    :cond_1
    const-string v9, "\u06e0\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x6b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6f8f

    const v11, -0x71f3c944

    xor-int/2addr v10, v11

    const v11, 0x69199851

    goto/16 :goto_0

    :sswitch_a
    return v2

    :sswitch_b
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_3
    const-string v9, "\u1a73\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4bf3

    const v11, -0x66374fa3

    xor-int/2addr v10, v11

    const v11, 0x18c19fe7

    goto/16 :goto_0

    .line 42
    :sswitch_c
    invoke-static {v0, v1, p0}, Ll/᩻֡ۡ;->֫(IILjava/lang/String;)Z

    move-result v2

    const/4 v9, 0x0

    if-nez v2, :cond_2

    const-string v2, "\u06e2\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v7

    xor-int v10, v2, v8

    mul-int/lit16 v10, v10, -0x3de9

    const v11, -0x1c371a3a

    xor-int/2addr v10, v11

    const v11, -0x62d5eb7e

    goto :goto_4

    :cond_2
    const-string v2, "\u0730\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    xor-int v10, v2, v7

    mul-int/lit8 v10, v10, -0x4d

    const v11, -0x271dc67b

    xor-int/2addr v10, v11

    const v11, 0x6916f1aa

    :goto_4
    xor-int/2addr v2, v11

    move v9, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_3
    const-string v9, "\u06e1\u06d6"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x59

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6835

    const v11, -0x62488c4f

    xor-int/2addr v10, v11

    const v11, -0x7fe30375

    goto/16 :goto_0

    :sswitch_d
    sget v9, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v9, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v9, "\u06d8\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x4b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3c7f

    const v11, 0x1beb2e83

    xor-int/2addr v10, v11

    const v11, -0x567ddd4d

    goto/16 :goto_0

    .line 31
    :sswitch_e
    sget v9, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v9, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v9, "\u0730\u1a76"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x45

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6715

    const v11, 0x49b4497f

    xor-int/2addr v10, v11

    const v11, 0x1c15b658

    goto/16 :goto_0

    .line 20
    :sswitch_f
    sget-boolean v9, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v9, :cond_7

    :cond_6
    const-string v9, "\u06da\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x79

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x703

    const v11, -0x3779f169

    xor-int/2addr v10, v11

    const v11, -0x634edff1

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u06e4\u05a8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x71d

    const v11, -0x7ac25642

    xor-int/2addr v10, v11

    const v11, -0x56142208

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v9, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v9, :cond_8

    goto :goto_5

    :cond_8
    const-string v9, "\u06e8\u06ec"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x87d

    const v11, -0x64330974

    xor-int/2addr v10, v11

    const v11, -0x55e5e680

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v9

    if-nez v9, :cond_9

    :goto_5
    const-string v9, "\u1a78\u06dc"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x19

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7363

    const v11, 0x2d1286ed

    xor-int/2addr v10, v11

    const v11, -0x76b64d74

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u06d7\u1a75"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x3b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x338f

    const v11, 0x4aa7746e    # 5487159.0f

    xor-int/2addr v10, v11

    const v11, -0x9190a9b

    goto/16 :goto_0

    :sswitch_12
    sget v9, Ll/֡۬;->۠֡᩶:I

    if-gtz v9, :cond_b

    :cond_a
    :goto_6
    const-string v9, "\u1a79\u1a79"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x55

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x11f7

    const v11, 0x2345b773

    xor-int/2addr v10, v11

    const v11, -0x586b2954    # -4.1311E-15f

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06da\u073a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x5d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3dc3

    const v11, 0x266e7333

    xor-int/2addr v10, v11

    const v11, -0x3f2e6c74

    goto/16 :goto_0

    .line 40
    :sswitch_13
    sget v9, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v9, :cond_c

    goto :goto_7

    :cond_c
    const-string v9, "\u0736\u06e8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5f3f

    const v11, 0x5865cd42

    xor-int/2addr v10, v11

    const v11, -0x185030ac

    goto/16 :goto_0

    :sswitch_14
    sget v9, Ll/֡֡;->֫ۤܳ:I

    if-ltz v9, :cond_d

    goto :goto_7

    :cond_d
    const-string v9, "\u06d7\u1a7a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x9

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xae1

    const v11, 0x10afeb9d

    xor-int/2addr v10, v11

    const v11, -0x7a1fc022

    goto/16 :goto_0

    :sswitch_15
    const/4 v0, 0x7

    sget v9, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v9, :cond_f

    :cond_e
    :goto_7
    const-string v9, "\u073f\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x6d53

    const v11, 0x736ed4a9

    xor-int/2addr v10, v11

    const v11, -0x7df20e49

    goto/16 :goto_0

    :cond_f
    const-string v9, "\u05a1\u05ab"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x79

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5779

    const v11, -0x2b733ca6

    xor-int/2addr v10, v11

    const v11, -0x33ed353d    # -3.8480652E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72af03fd -> :sswitch_12
        -0x7218f55b -> :sswitch_4
        -0x700ad105 -> :sswitch_b
        -0x67a9cfe4 -> :sswitch_b
        -0x641c4cd9 -> :sswitch_1
        -0x641b797a -> :sswitch_13
        -0x62b9537e -> :sswitch_d
        -0x6181174f -> :sswitch_f
        -0x5c64310b -> :sswitch_c
        -0x5c3de134 -> :sswitch_10
        -0x5bc50923 -> :sswitch_9
        -0x56cd9f93 -> :sswitch_9
        -0x567f8297 -> :sswitch_e
        -0x4c5ddddb -> :sswitch_5
        -0x4bb313a1 -> :sswitch_2
        -0x47d0f09d -> :sswitch_c
        -0x460edfdc -> :sswitch_13
        -0x43aa3edd -> :sswitch_7
        -0x26bd66c7 -> :sswitch_7
        -0x20e49f0d -> :sswitch_11
        -0x2096d38c -> :sswitch_0
        -0x20490621 -> :sswitch_4
        -0x200715c0 -> :sswitch_14
        -0x1ffd7cc6 -> :sswitch_2
        -0x1a2f5989 -> :sswitch_a
        -0x17ad7ad9 -> :sswitch_8
        -0x15c215a7 -> :sswitch_d
        -0x12115192 -> :sswitch_5
        0x16659c19 -> :sswitch_0
        0x1bea01c3 -> :sswitch_f
        0x22719768 -> :sswitch_15
        0x29952388 -> :sswitch_14
        0x2cda0b3a -> :sswitch_a
        0x320a4e3a -> :sswitch_8
        0x32752cce -> :sswitch_6
        0x3924fc5b -> :sswitch_6
        0x3f89b77a -> :sswitch_10
        0x428c63ca -> :sswitch_1
        0x43b883e3 -> :sswitch_3
        0x4bc086b9 -> :sswitch_15
        0x4f0820a9 -> :sswitch_e
        0x565fec61 -> :sswitch_12
        0x64ee3023 -> :sswitch_3
        0x6c37b768 -> :sswitch_11
    .end sparse-switch
.end method

.method public static ܿ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0xe351b1f

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    const-string v4, "\u06d6\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x224b

    const v6, 0x42c7552d

    xor-int/2addr v5, v6

    const v6, -0x5b63b86b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x6833

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    .line 0
    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_1

    .line 40
    :sswitch_2
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u1a73\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1db1

    const v6, 0x1494d8d8

    xor-int/2addr v5, v6

    const v6, -0x66cc8df4

    goto :goto_0

    .line 43
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x0

    return p0

    .line 63
    :sswitch_6
    sget-object v0, Ll/᩻֡ۡ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_7
    const/16 v4, 0x18

    .line 61
    invoke-static {v0, v4, p0}, Ll/᩻֡ۡ;->֫(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "\u1a77\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c11

    const v6, -0x76b79b88

    xor-int/2addr v5, v6

    const v6, -0x3b0a387a

    goto :goto_0

    :cond_1
    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x275f

    const v6, 0x7383ddbc

    xor-int/2addr v5, v6

    const v6, -0x7919c484

    goto/16 :goto_0

    .line 8
    :sswitch_8
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06e8\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1a67

    const v6, 0x48fadcab

    xor-int/2addr v5, v6

    const v6, 0x3ee0e395

    goto/16 :goto_0

    .line 24
    :sswitch_9
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    :goto_2
    const-string v4, "\u1a7b\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit8 v5, v5, 0x3b

    const v6, -0x4cfb98e0

    xor-int/2addr v5, v6

    const v6, -0x1566a6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u0730\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x24d9

    const v6, 0x41c69a3b

    xor-int/2addr v5, v6

    const v6, -0x41a367

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5fcb

    const v6, -0x347ff61b    # -1.6782282E7f

    xor-int/2addr v5, v6

    const v6, 0x57a1b9ec

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u06e0\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4ac7

    const v6, 0x10ababc5

    xor-int/2addr v5, v6

    const v6, 0x747e2c55

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06d9\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xef7

    const v6, -0x513ea7df

    xor-int/2addr v5, v6

    const v6, -0x266a9d58

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a77\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x68a9

    const v6, -0x10b9cc8e

    xor-int/2addr v5, v6

    const v6, 0x75936ab

    goto/16 :goto_0

    .line 45
    :sswitch_c
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06d6\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1539

    const v6, 0x5accd61b

    xor-int/2addr v5, v6

    const v6, -0x66a0a34f

    goto/16 :goto_0

    .line 59
    :sswitch_d
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u1a74\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x665

    const v6, 0x4b05f384    # 8778628.0f

    xor-int/2addr v5, v6

    const v6, -0x4f66a459

    goto/16 :goto_0

    .line 19
    :sswitch_e
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a78\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7685

    const v6, -0x353b13e3    # -6452750.5f

    xor-int/2addr v5, v6

    const v6, -0xbfd5171

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e8\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5979

    const v6, 0x1a2dcdfb

    xor-int/2addr v5, v6

    const v6, 0x5bb5d3cd

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_b

    goto :goto_5

    :cond_b
    const-string v4, "\u06ec\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x125f

    const v6, -0x116baa05

    xor-int/2addr v5, v6

    const v6, -0x3467906c    # -1.9980072E7f

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x4

    .line 52
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06ec\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5809

    const v6, -0x55a960d2

    xor-int/2addr v5, v6

    const v6, 0x7453eb8a

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x72cb

    const v6, -0x10ddb4bc

    xor-int/2addr v5, v6

    const v6, -0x57df918d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x740b9bae -> :sswitch_7
        -0x63dbdccc -> :sswitch_e
        -0x637a29a7 -> :sswitch_c
        -0x5fa9c36f -> :sswitch_b
        -0x4df091b1 -> :sswitch_b
        -0x427a3026 -> :sswitch_2
        -0x3eb89232 -> :sswitch_1
        -0x2cc31bc0 -> :sswitch_c
        -0x267797ef -> :sswitch_9
        -0x1db2dd26 -> :sswitch_5
        -0x1c868e44 -> :sswitch_1
        -0x17a5a0f3 -> :sswitch_a
        -0x15d41860 -> :sswitch_0
        -0x8aa6751 -> :sswitch_e
        -0x553f97e -> :sswitch_f
        -0xd1ad56 -> :sswitch_4
        0x666c0d6 -> :sswitch_7
        0x8893801 -> :sswitch_0
        0xb95a43d -> :sswitch_8
        0xba26faa -> :sswitch_8
        0x1188c79a -> :sswitch_10
        0x224829ec -> :sswitch_10
        0x27b7ecee -> :sswitch_5
        0x29378590 -> :sswitch_9
        0x2c2413eb -> :sswitch_3
        0x33f28f80 -> :sswitch_6
        0x38c93d80 -> :sswitch_6
        0x3d43ea10 -> :sswitch_a
        0x3e0c613f -> :sswitch_2
        0x47f3bb0d -> :sswitch_4
        0x5b062e28 -> :sswitch_d
        0x6b58a03a -> :sswitch_3
        0x7949f2d5 -> :sswitch_f
        0x7d0ed1fc -> :sswitch_d
    .end sparse-switch
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x1f265084

    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v9, Ll/ۘۨ;->۫᩸۠:I

    const-string v10, "\u073f\u06eb"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x47

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x53c1

    const v12, -0x2ae90054

    xor-int/2addr v11, v12

    const v12, -0x5f77bcd0

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x6397

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 16
    sget v10, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v10, :cond_13

    goto/16 :goto_a

    :sswitch_0
    sget v10, Ll/֨۬;->۫ۙ᩺:I

    if-lez v10, :cond_10

    goto/16 :goto_b

    :sswitch_1
    sget v10, Ll/᩺;->ۙۛܶ:I

    if-gtz v10, :cond_c

    goto/16 :goto_b

    .line 18
    :sswitch_2
    sget-boolean v10, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v10, :cond_14

    goto/16 :goto_a

    .line 5
    :sswitch_3
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v10, :cond_e

    goto :goto_2

    .line 24
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v10

    if-lez v10, :cond_12

    goto/16 :goto_9

    .line 28
    :sswitch_5
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget-boolean v10, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v10, :cond_a

    goto :goto_2

    .line 25
    :sswitch_6
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    :goto_2
    const-string v10, "\u06ec\u0730"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x72e9

    const v12, -0x205cb169

    xor-int/2addr v11, v12

    const v12, 0x3874838f

    goto :goto_0

    .line 29
    :sswitch_7
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const/4 p0, 0x0

    return p0

    :sswitch_8
    return v2

    :sswitch_9
    const/16 v10, 0x39

    if-le v6, v10, :cond_1

    goto :goto_3

    :sswitch_a
    const/16 v10, 0x5f

    if-eq v6, v10, :cond_1

    const-string v10, "\u06e0\u1a73"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7073

    const v12, 0x46aad134

    xor-int/2addr v11, v12

    const v12, 0x180244b9

    goto :goto_0

    :sswitch_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_6

    :sswitch_c
    const/16 v10, 0x5a

    if-le v6, v10, :cond_1

    goto :goto_4

    :sswitch_d
    const/16 v10, 0x30

    if-lt v6, v10, :cond_0

    const-string v10, "\u06da\u06e1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x385

    const v12, 0x328051cf

    xor-int/2addr v11, v12

    const v12, 0xf9d90ea

    goto/16 :goto_0

    :cond_0
    :goto_3
    const-string v10, "\u0733\u1a75"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x43

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3fab

    const v12, -0x3b781684

    xor-int/2addr v11, v12

    const v12, 0x6b5e95c4

    goto/16 :goto_0

    :sswitch_e
    const/16 v10, 0x7a

    if-le v6, v10, :cond_1

    goto :goto_5

    :cond_1
    const-string v10, "\u06dc\u1a73"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x145d

    const v12, 0x9f68114

    xor-int/2addr v11, v12

    const v12, -0x45d8e3c9

    goto/16 :goto_0

    :sswitch_f
    const/16 v10, 0x41

    if-lt v6, v10, :cond_2

    const-string v10, "\u1a76\u1a73"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3405

    const v12, 0x1f0c3ceb

    xor-int/2addr v11, v12

    const v12, 0x3b70732c

    goto/16 :goto_0

    :cond_2
    :goto_4
    const-string v10, "\u06eb\u05ab"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4347

    const v12, 0x41c3f8a

    xor-int/2addr v11, v12

    const v12, 0x3b87887d

    goto/16 :goto_0

    .line 33
    :sswitch_10
    aget-char v6, v3, v5

    const/16 v10, 0x61

    if-lt v6, v10, :cond_3

    const-string v10, "\u06d6\u073d"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2ed

    const v12, -0x532a4767

    xor-int/2addr v11, v12

    const v12, 0x37bdd071

    goto/16 :goto_0

    :cond_3
    :goto_5
    const-string v10, "\u06e8\u06e8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x75e9

    const v12, -0x67359066

    xor-int/2addr v11, v12

    const v12, -0x621aa606

    goto/16 :goto_0

    :sswitch_11
    const/4 p0, 0x1

    return p0

    :sswitch_12
    if-ge v5, v4, :cond_4

    const-string v10, "\u06e0\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3147

    const v12, -0x679a701f

    xor-int/2addr v11, v12

    const v12, 0x4d1885a0    # 1.5993088E8f

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u073d\u06e4"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x6d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5e75

    const v12, -0x1e7bdcb0

    xor-int/2addr v11, v12

    const v12, 0x769c111

    goto/16 :goto_0

    :sswitch_13
    return v2

    :sswitch_14
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_6
    const-string v10, "\u06d8\u1a7b"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xb03

    const v12, 0x49d82213

    xor-int/2addr v11, v12

    const v12, -0x1dec3a

    goto/16 :goto_0

    .line 27
    :sswitch_15
    invoke-static {v0, v1, p0}, Ll/᩻֡ۡ;->֫(IILjava/lang/String;)Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_5

    const-string v2, "\u06e7\u0736"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    xor-int v11, v2, v9

    mul-int/lit16 v11, v11, 0x2053

    const v12, 0x54af130f

    xor-int/2addr v11, v12

    const v12, 0x4e9c04c9

    goto :goto_7

    :cond_5
    const-string v2, "\u0730\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v9, v2

    mul-int/lit8 v2, v2, 0x11

    xor-int v11, v2, v8

    mul-int/lit16 v11, v11, -0x3e03

    const v12, -0x4b596113

    xor-int/2addr v11, v12

    const v12, 0x7c3dbe7c

    :goto_7
    xor-int/2addr v2, v12

    move v10, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_16
    const/16 v1, 0x18

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_8

    :cond_6
    const-string v10, "\u06e4\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1a1b

    const v12, -0x255ef7c2

    xor-int/2addr v11, v12

    const v12, 0x5de94ed0

    goto/16 :goto_0

    :sswitch_17
    sget v10, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v10, :cond_7

    goto :goto_9

    :cond_7
    const-string v10, "\u1a73\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x20a7

    const v12, 0x752d0844

    xor-int/2addr v11, v12

    const v12, 0x13050d9

    goto/16 :goto_0

    .line 5
    :sswitch_18
    sget-boolean v10, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v10, :cond_8

    goto :goto_8

    :cond_8
    const-string v10, "\u1a74\u06ec"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x2d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x16cf

    const v12, 0xcba214a

    xor-int/2addr v11, v12

    const v12, 0x45fe4167

    goto/16 :goto_0

    :sswitch_19
    sget v10, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v10, :cond_9

    :goto_8
    const-string v10, "\u06dc\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x20e7

    const v12, 0x732d5e2c

    xor-int/2addr v11, v12

    const v12, 0x17428a13

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a73\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4f55

    const v12, 0x371b87b4

    xor-int/2addr v11, v12

    const v12, -0x20f4d953

    goto/16 :goto_0

    .line 18
    :sswitch_1a
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    :goto_9
    const-string v10, "\u06da\u06ec"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x463b

    const v12, -0x34aac114

    xor-int/2addr v11, v12

    const v12, -0x4aef48f2

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06e8\u06d9"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x318d

    const v12, 0x6b7d10c6

    xor-int/2addr v11, v12

    const v12, 0x605fb0e1

    goto/16 :goto_0

    .line 23
    :sswitch_1b
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v10

    if-ltz v10, :cond_d

    :cond_c
    const-string v10, "\u073a\u1a75"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7915

    const v12, 0x5b573cdb

    xor-int/2addr v11, v12

    const v12, -0x5e383e5

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u05a8\u05a1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5983

    const v12, 0x55907165

    xor-int/2addr v11, v12

    const v12, -0x46dd6369

    goto/16 :goto_0

    :sswitch_1c
    sget v10, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v10, :cond_f

    :cond_e
    const-string v10, "\u06db\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4469

    const v12, -0x38ef2b49

    xor-int/2addr v11, v12

    const v12, -0x24129339

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06d6\u1a7b"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x4b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5b7f

    const v12, 0x7ce43ce9

    xor-int/2addr v11, v12

    const v12, -0x655dbf52

    goto/16 :goto_0

    .line 12
    :sswitch_1d
    sget-boolean v10, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v10, :cond_11

    :cond_10
    const-string v10, "\u06e0\u06e1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x11b1

    const v12, 0xb100528

    xor-int/2addr v11, v12

    const v12, 0x40dfbae3

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u06e2\u0730"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x67d9

    const v12, 0x1fe20f17

    xor-int/2addr v11, v12

    const v12, 0x2ef352a0

    goto/16 :goto_0

    :cond_12
    :goto_a
    const-string v10, "\u06d7\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xa3

    const v12, 0x329e5673

    xor-int/2addr v11, v12

    const v12, -0x5b5522a4

    goto/16 :goto_0

    :cond_13
    const-string v10, "\u1a7a\u06e8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1c2f

    const v12, -0x3e5f8098

    xor-int/2addr v11, v12

    const v12, -0x33dd7220    # -4.2612608E7f

    goto/16 :goto_0

    :sswitch_1e
    const/4 v0, 0x4

    .line 19
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v10

    if-eqz v10, :cond_15

    :cond_14
    :goto_b
    const-string v10, "\u1a76\u05a1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xaeb

    const v12, 0x263d93f8

    xor-int/2addr v11, v12

    const v12, -0x6eda700b

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u1a74\u0736"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5877

    const v12, -0x4a70dc53

    xor-int/2addr v11, v12

    const v12, -0x6a4cf082

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fdd0168 -> :sswitch_a
        -0x7bc67c07 -> :sswitch_9
        -0x7943b5fb -> :sswitch_19
        -0x78586489 -> :sswitch_f
        -0x6ec602a5 -> :sswitch_1c
        -0x6b4a90c4 -> :sswitch_3
        -0x673e7b97 -> :sswitch_14
        -0x65f7e914 -> :sswitch_8
        -0x59c3bf09 -> :sswitch_1
        -0x462230be -> :sswitch_c
        -0x43e63cfe -> :sswitch_e
        -0x41e50175 -> :sswitch_c
        -0x3e4c4bf8 -> :sswitch_1e
        -0x3aeb91e9 -> :sswitch_13
        -0x3ac7ee4e -> :sswitch_13
        -0x394368c4 -> :sswitch_10
        -0x37ef57c5 -> :sswitch_1c
        -0x36892ac5 -> :sswitch_17
        -0x32883e4d -> :sswitch_15
        -0x2b8b28c6 -> :sswitch_7
        -0x29b2a50f -> :sswitch_15
        -0x229b8db8 -> :sswitch_d
        -0x216887a2 -> :sswitch_7
        -0x1b7e00cf -> :sswitch_5
        -0x1a0f0d76 -> :sswitch_3
        -0x182fb0a7 -> :sswitch_16
        -0xf2a841a -> :sswitch_8
        -0x6ead921 -> :sswitch_a
        0x40741c5 -> :sswitch_12
        0x6938e5e -> :sswitch_b
        0xdc70792 -> :sswitch_f
        0x112c6b93 -> :sswitch_1d
        0x1901db70 -> :sswitch_12
        0x1a5c441f -> :sswitch_1
        0x22e40a87 -> :sswitch_1a
        0x293bf941 -> :sswitch_14
        0x29961625 -> :sswitch_d
        0x2d244c28 -> :sswitch_9
        0x31833b74 -> :sswitch_b
        0x3286e03a -> :sswitch_1a
        0x39eb3a7e -> :sswitch_18
        0x3d0ea42d -> :sswitch_4
        0x3d2bc033 -> :sswitch_19
        0x3eb4a408 -> :sswitch_6
        0x424921a3 -> :sswitch_5
        0x47857e1a -> :sswitch_1d
        0x4a514e97 -> :sswitch_0
        0x4eeb2ddc -> :sswitch_10
        0x520df785 -> :sswitch_6
        0x544fb574 -> :sswitch_4
        0x548412ae -> :sswitch_1b
        0x56487b69 -> :sswitch_1e
        0x5664bf09 -> :sswitch_e
        0x5a749fd1 -> :sswitch_2
        0x701e0c51 -> :sswitch_16
        0x7127864c -> :sswitch_11
        0x71b84e34 -> :sswitch_2
        0x72e205ee -> :sswitch_11
        0x732ec89d -> :sswitch_1b
        0x742d7f92 -> :sswitch_0
        0x74546488 -> :sswitch_17
        0x747f7be7 -> :sswitch_18
    .end sparse-switch
.end method
