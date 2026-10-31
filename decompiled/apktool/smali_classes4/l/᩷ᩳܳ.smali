.class public final Ll/᩷ᩳܳ;
.super Ljava/lang/Object;
.source "P71B"


# static fields
.field private static final ۬ᩴ֫:[S


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܿᩳܳ;

.field public final ܽ:Ll/ᩴܽܳ;

.field public final ᩳ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x33

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    return-void

    :array_0
    .array-data 2
        0x1baes
        -0xa50s
        -0xa44s
        -0xa10s
        -0xa07s
        -0xa0es
        -0xa05s
        -0xa18s
        -0xa0cs
        -0xa5fs
        -0xa50s
        -0xa44s
        -0xa11s
        -0xa0ds
        -0xa17s
        -0xa12s
        -0xa01s
        -0xa07s
        -0xa30s
        -0xa07s
        -0xa0es
        -0xa05s
        -0xa18s
        -0xa0cs
        -0xa5fs
        -0xa11s
        -0xa0ds
        -0xa17s
        -0xa12s
        -0xa01s
        -0xa07s
        -0xa2ds
        -0xa06s
        -0xa06s
        -0xa11s
        -0xa07s
        -0xa18s
        -0xa5fs
        0x1d1es
        -0x7c9es
        -0x7cb6s
        -0x7ca9s
        -0x7cads
        -0x7ca2s
        -0x7cf9s
        -0x7cbes
        -0x7ca1s
        -0x7cads
        -0x7cbes
        -0x7cb7s
        -0x7cads
    .end array-data
.end method

.method public constructor <init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const v6, -0x37ed70e1

    sget v7, Ll/ۛ;->᩺᩻֫:I

    sget v8, Ll/ۗ᩵;->֫۠۟:I

    sget-object v9, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    const/4 v10, 0x0

    aget-short v9, v9, v10

    add-int/lit16 v10, v9, 0x30c4

    mul-int v10, v10, v10

    mul-int v9, v9, v9

    const v11, 0x94a1610

    add-int/2addr v9, v11

    add-int/2addr v9, v9

    sub-int/2addr v10, v9

    if-gtz v10, :cond_0

    const v9, 0xf59c

    goto :goto_0

    :cond_0
    const/16 v9, 0x6499

    .line 1079
    :goto_0
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v10, "\u06e7\u06e7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v7

    mul-int/lit16 v11, v11, 0x53b9

    const v12, 0x1e526034

    xor-int/2addr v11, v12

    const v12, -0x157f1363

    :goto_1
    xor-int/2addr v10, v12

    :goto_2
    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x1b39

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v11

    xor-int/2addr v6, v10

    sparse-switch v6, :sswitch_data_0

    const/4 v5, 0x0

    goto :goto_4

    :sswitch_0
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v10, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v10, :cond_2

    :cond_1
    move-object/from16 v10, p1

    goto/16 :goto_6

    :cond_2
    move-object/from16 v10, p1

    goto/16 :goto_b

    :sswitch_1
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v10, p1

    goto/16 :goto_8

    .line 490
    :sswitch_2
    sget v10, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v10, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v10, p1

    goto/16 :goto_9

    :sswitch_3
    sget-boolean v10, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v10, :cond_1

    goto :goto_3

    .line 818
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    :goto_3
    const-string v10, "\u1a74\u05ab"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v7

    mul-int/lit16 v11, v11, -0x30cb

    const v12, -0x7d984b6b

    xor-int/2addr v11, v12

    const v12, 0x976496b

    goto :goto_1

    .line 332
    :sswitch_5
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 1089
    :sswitch_6
    iput-object v5, v0, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    return-void

    :sswitch_7
    invoke-virtual/range {p4 .. p4}, Ll/ܿᩳܳ;->ۧ()Z

    move-result v10

    if-eqz v10, :cond_5

    move-object/from16 v10, p1

    goto :goto_5

    :cond_5
    move-object/from16 v5, p4

    :goto_4
    const-string v10, "\u06e8\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v7

    mul-int/lit16 v11, v11, 0xe49

    const v12, 0x3282bd2b

    xor-int/2addr v11, v12

    const v12, -0x2674b264

    goto :goto_1

    :sswitch_8
    move-object/from16 v10, p1

    .line 1086
    iput-object v10, v0, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    .line 1087
    iput v1, v0, Ll/᩷ᩳܳ;->ᩳ:I

    .line 1088
    iput v2, v0, Ll/᩷ᩳܳ;->֫:I

    if-eqz p4, :cond_6

    const-string v11, "\u06d6\u073f"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v7

    mul-int/lit8 v11, v11, -0x47

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x78ad

    const v13, 0x7de29cc5

    xor-int/2addr v12, v13

    const v13, -0x2e463579

    goto/16 :goto_7

    :cond_6
    :goto_5
    const-string v11, "\u1a7a\u06e0"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v7

    mul-int/lit8 v11, v11, -0x7d

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x1ac9

    const v13, -0x4692b6be

    xor-int/2addr v12, v13

    const v13, 0x188a2c64

    goto :goto_7

    :sswitch_9
    move-object/from16 v10, p1

    .line 1081
    invoke-interface/range {p1 .. p1}, Ll/ᩴܽܳ;->length()I

    move-result v11

    int-to-long v11, v11

    cmp-long v13, v3, v11

    if-gtz v13, :cond_11

    const-string v11, "\u1a73\u1a74"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v8

    mul-int/lit8 v11, v11, 0x25

    xor-int v12, v11, v7

    mul-int/lit16 v12, v12, -0x448b

    const v13, -0x523a1632

    xor-int/2addr v12, v13

    const v13, 0x1a74a91c

    goto :goto_7

    :sswitch_a
    move-object/from16 v10, p1

    int-to-long v3, v1

    int-to-long v11, v2

    add-long/2addr v3, v11

    .line 1085
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v11

    if-gtz v11, :cond_7

    :goto_6
    const-string v11, "\u06da\u1a7b"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v7, v11

    mul-int/lit8 v11, v11, 0x47

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x5cdb

    const v13, -0x6eb815c

    xor-int/2addr v12, v13

    const v13, 0x2bb9efe6

    goto :goto_7

    :cond_7
    const-string v11, "\u06eb\u1a7a"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v8

    xor-int v12, v11, v7

    mul-int/lit16 v12, v12, 0x5e21

    const v13, -0x5d5ca3cc

    xor-int/2addr v12, v13

    const v13, -0x70157d31

    goto :goto_7

    :sswitch_b
    move-object/from16 v10, p1

    if-lez v2, :cond_11

    const-string v11, "\u06da\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v7

    mul-int/lit8 v11, v11, 0x75

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x14bd

    const v13, 0x502afb07

    xor-int/2addr v12, v13

    const v13, -0x28e7d4b5

    :goto_7
    xor-int/2addr v11, v13

    move v10, v11

    move v11, v12

    goto/16 :goto_2

    :sswitch_c
    move-object/from16 v10, p1

    .line 1082
    new-instance v11, Ljava/lang/IndexOutOfBoundsException;

    sget-object v12, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    .line 317
    sget v13, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v13, :cond_8

    goto :goto_8

    :cond_8
    const/4 v13, 0x1

    .line 1021
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v14

    if-eqz v14, :cond_9

    goto :goto_a

    :cond_9
    const/16 v14, 0x9

    .line 1082
    invoke-static {v12, v13, v14, v9}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v12

    .line 917
    sget v13, Ll/֨۟;->᩹֫᩷:I

    if-eqz v13, :cond_a

    goto/16 :goto_b

    .line 1082
    :cond_a
    sget-object v13, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    const/16 v14, 0xa

    .line 1087
    sget v15, Ll/ۛ;->᩺᩻֫:I

    if-ltz v15, :cond_b

    :goto_8
    const-string v11, "\u1a73\u05ab"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v8

    xor-int v12, v11, v7

    mul-int/lit16 v12, v12, 0x2af9

    const v13, -0x7db5183d

    xor-int/2addr v12, v13

    const v13, 0x3c3ac8c3

    goto :goto_7

    :cond_b
    const/16 v15, 0xf

    .line 63
    sget v16, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v16, :cond_c

    :goto_9
    const-string v11, "\u1a7b\u1a75"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v7

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x13b3

    const v13, 0x4a04d3f7    # 2176253.8f

    xor-int/2addr v12, v13

    const v13, -0xc5478d2

    goto :goto_7

    .line 1082
    :cond_c
    invoke-static {v13, v14, v15, v9}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v13

    .line 981
    sget v14, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v14, :cond_d

    goto :goto_a

    .line 1082
    :cond_d
    sget-object v14, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    .line 337
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v16

    if-eqz v16, :cond_e

    goto :goto_b

    :cond_e
    const/16 v15, 0xd

    .line 948
    sget v17, Ll/ۛ;->᩺᩻֫:I

    if-ltz v17, :cond_f

    :goto_a
    const-string v11, "\u06d9\u06dc"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v7, v11

    mul-int/lit8 v11, v11, -0x79

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x63bb

    const v13, 0x6f014ac8

    xor-int/2addr v12, v13

    const v13, -0x32620e5a

    goto/16 :goto_7

    :cond_f
    const/16 v0, 0x19

    .line 1082
    invoke-static {v14, v0, v15, v9}, Ll/֡ۨ;->ۡܺ֡([SIII)Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v0, v1, v12, v13, v2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 511
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v12

    if-eqz v12, :cond_10

    :goto_b
    const-string v0, "\u06e2\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v8

    xor-int v11, v0, v7

    mul-int/lit16 v11, v11, 0x5175

    const v12, -0x7f70597e

    xor-int/2addr v11, v12

    const v12, -0x5fe3f973

    goto :goto_c

    .line 1084
    :cond_10
    invoke-interface/range {p1 .. p1}, Ll/ᩴܽܳ;->length()I

    move-result v1

    invoke-static {v0, v1}, Ll/֡֡;->᩹᩻ܽ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v11

    :sswitch_d
    move-object/from16 v10, p1

    if-ltz v1, :cond_11

    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v8

    xor-int v11, v0, v7

    mul-int/lit16 v11, v11, -0x4ff9

    const v12, -0x34c953d0    # -1.1971632E7f

    xor-int/2addr v11, v12

    const v12, -0x5d11e045

    goto :goto_c

    :cond_11
    const-string v0, "\u06e1\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v7

    xor-int v11, v0, v8

    mul-int/lit16 v11, v11, 0x327

    const v12, -0x63f9cc57

    xor-int/2addr v11, v12

    const v12, -0x6d1d0bed

    :goto_c
    xor-int/2addr v0, v12

    move v10, v0

    move-object/from16 v0, p0

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ba624f6 -> :sswitch_b
        -0x76d2558d -> :sswitch_2
        -0x4a6a5c03 -> :sswitch_8
        -0x439ed40c -> :sswitch_5
        -0x42722af9 -> :sswitch_a
        -0x385a01e2 -> :sswitch_4
        -0x31fa3b2c -> :sswitch_a
        -0x1e41a7a4 -> :sswitch_4
        -0x1b3f7577 -> :sswitch_7
        -0xe715754 -> :sswitch_9
        0xdaa586 -> :sswitch_d
        0x5be1cf8 -> :sswitch_1
        0x93db51f -> :sswitch_2
        0x15088192 -> :sswitch_1
        0x17f90bcf -> :sswitch_b
        0x1e9fe823 -> :sswitch_3
        0x223d19ae -> :sswitch_0
        0x2cc4bbca -> :sswitch_0
        0x2fe31409 -> :sswitch_5
        0x3622ba91 -> :sswitch_8
        0x3afe2908 -> :sswitch_9
        0x3bb79494 -> :sswitch_c
        0x4b5c6728 -> :sswitch_6
        0x56f80f0b -> :sswitch_3
        0x5f946b55 -> :sswitch_d
        0x6c9fcbfa -> :sswitch_6
        0x77573ee2 -> :sswitch_7
        0x7fd5085e -> :sswitch_c
    .end sparse-switch
.end method

.method public static ֫(Ll/ܿᩳܳ;IJII)Z
    .locals 15

    move-object v0, p0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, -0x1989b87e

    sget v7, Ll/֨ۤ;->ܿۖ᩵:I

    sget v8, Ll/ۘۨ;->۫᩸۠:I

    const-string v9, "\u06eb\u1a77"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3adb

    const v11, -0x1fdecb86

    xor-int/2addr v10, v11

    const v11, -0x1faef7ed

    :goto_0
    xor-int/2addr v9, v11

    :goto_1
    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x55d5

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 744
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v12

    if-eqz v12, :cond_f

    goto/16 :goto_8

    .line 10
    :sswitch_0
    sget v9, Ll/֡۬;->۠֡᩶:I

    if-gtz v9, :cond_1

    :cond_0
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    goto/16 :goto_7

    :cond_1
    const-string v9, "\u0730\u05ab"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x7f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6c61

    const v11, 0x2d641b6c

    xor-int/2addr v10, v11

    const v11, -0x4ba4427c

    goto :goto_0

    .line 940
    :sswitch_1
    sget-boolean v9, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v9, :cond_0

    :goto_2
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    goto/16 :goto_8

    .line 811
    :sswitch_2
    sget v9, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v9, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    goto/16 :goto_5

    .line 885
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x1

    return v0

    :sswitch_6
    move/from16 v9, p4

    move/from16 v10, p5

    .line 1264
    invoke-virtual {p0, v9, v10}, Ll/ܿᩳܳ;->ۧ(II)Z

    move-result v11

    if-nez v11, :cond_3

    const-string v11, "\u1a79\u05ab"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v7

    xor-int v12, v11, v8

    mul-int/lit16 v12, v12, 0x8b7

    const v13, -0x13e72827

    xor-int/2addr v12, v13

    const v13, -0x622d7d9e

    goto :goto_3

    :sswitch_7
    move/from16 v9, p4

    move/from16 v10, p5

    const-wide/32 v11, 0x10000

    add-long/2addr v11, v2

    cmp-long v13, v4, v11

    if-gtz v13, :cond_3

    const-string v11, "\u05ab\u05ab"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v8

    xor-int v12, v11, v7

    mul-int/lit16 v12, v12, 0x3787

    const v13, 0x7339559c

    xor-int/2addr v12, v13

    const v13, -0x65c0bbce

    :goto_3
    xor-int/2addr v11, v13

    move v9, v11

    move v10, v12

    goto/16 :goto_1

    :cond_3
    move/from16 v11, p1

    goto :goto_4

    :sswitch_8
    return v1

    :sswitch_9
    move/from16 v9, p4

    move/from16 v10, p5

    .line 1260
    invoke-virtual {p0}, Ll/ܿᩳܳ;->֫()I

    move-result v2

    int-to-long v2, v2

    move/from16 v11, p1

    int-to-long v4, v11

    add-long v12, p2, v4

    cmp-long v14, v4, v2

    if-ltz v14, :cond_4

    const-string v4, "\u06d8\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v7, v4

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v8

    mul-int/lit16 v5, v5, -0x27e9

    const v14, 0x229d454a

    xor-int/2addr v5, v14

    const v14, 0x53a4fe9

    xor-int/2addr v4, v14

    move v9, v4

    move v10, v5

    move-wide v4, v12

    goto/16 :goto_1

    :cond_4
    move-wide v4, v12

    :goto_4
    const-string v12, "\u1a76\u06ec"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v8

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x28bf

    const v14, 0x351973c9

    xor-int/2addr v13, v14

    const v14, 0x5016f2c7

    goto/16 :goto_9

    :sswitch_a
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    const/4 v1, 0x0

    if-nez v0, :cond_5

    const-string v12, "\u06d9\u1a77"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, 0x4645

    const v14, -0x66f472b7

    xor-int/2addr v13, v14

    const v14, 0x30d6563c

    goto/16 :goto_9

    :cond_5
    const-string v12, "\u06e8\u0736"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v8

    mul-int/lit8 v12, v12, 0x7

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, -0x5d65

    const v14, -0x7880071c

    xor-int/2addr v13, v14

    const v14, -0x1f3c2387

    goto/16 :goto_9

    :sswitch_b
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 183
    sget v12, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v12, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v12, "\u06e4\u06eb"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v8

    mul-int/lit8 v12, v12, 0x3b

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x3d6d

    const v14, 0x21b18f5b

    xor-int/2addr v13, v14

    const v14, -0x4fd379e

    goto/16 :goto_9

    :sswitch_c
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 950
    sget v12, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v12, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v12, "\u0733\u1a76"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    mul-int/lit8 v12, v12, -0x49

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, -0x308f

    const v14, 0x45effbb8

    xor-int/2addr v13, v14

    const v14, -0x1c023176

    goto/16 :goto_9

    :sswitch_d
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 551
    sget-boolean v12, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v12, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v12, "\u06e8\u06e0"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, 0x662d

    const v14, 0x17298737

    xor-int/2addr v13, v14

    const v14, -0x7ae39b62

    goto/16 :goto_9

    :sswitch_e
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    sget-boolean v12, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v12, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v12, "\u1a7b\u0733"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v8

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x4ff5

    const v14, -0x64974a92

    xor-int/2addr v13, v14

    const v14, 0x8da8ab7

    goto/16 :goto_9

    :sswitch_f
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v12

    if-eqz v12, :cond_a

    :goto_5
    const-string v12, "\u0733\u0730"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, 0x4df9

    const v14, 0xeeefbf0

    xor-int/2addr v13, v14

    const v14, 0x5fd057ad

    goto/16 :goto_9

    :cond_a
    const-string v12, "\u0733\u1a75"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v7, v12

    mul-int/lit8 v12, v12, -0xd

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, 0x6e17

    const v14, 0x5c9e0725

    xor-int/2addr v13, v14

    const v14, 0x82c8035

    goto/16 :goto_9

    :sswitch_10
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 722
    sget v12, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v12, :cond_b

    goto/16 :goto_7

    :cond_b
    const-string v12, "\u05ab\u06da"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v8

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x1691

    const v14, -0x3616e012

    xor-int/2addr v13, v14

    const v14, 0x3d119100

    goto/16 :goto_9

    :sswitch_11
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 1049
    sget v12, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v12, :cond_c

    :goto_6
    const-string v12, "\u05ab\u1a74"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v8

    mul-int/lit8 v12, v12, 0x71

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x2135

    const v14, -0x3fe253fc    # -2.463624f

    xor-int/2addr v13, v14

    const v14, -0x10c677bb

    goto/16 :goto_9

    :cond_c
    const-string v12, "\u06df\u06da"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v8, v12

    mul-int/lit8 v12, v12, 0x2d

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, 0x5b95

    const v14, -0x304e537e

    xor-int/2addr v13, v14

    const v14, -0x46e29a1f

    goto/16 :goto_9

    :sswitch_12
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 554
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v12

    if-ltz v12, :cond_d

    goto :goto_7

    :cond_d
    const-string v12, "\u06ec\u1a7b"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, -0x4581

    const v14, 0x75bd6646

    xor-int/2addr v13, v14

    const v14, -0x39fb3aa8

    goto :goto_9

    :sswitch_13
    move/from16 v11, p1

    move/from16 v9, p4

    move/from16 v10, p5

    .line 247
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v12

    if-ltz v12, :cond_e

    :goto_7
    const-string v12, "\u1a73\u1a79"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    mul-int/lit8 v12, v12, 0x25

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, 0x7753

    const v14, 0x7116c633

    xor-int/2addr v13, v14

    const v14, 0x3e6d48f2

    goto :goto_9

    :cond_e
    const-string v12, "\u06d7\u06e8"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v8

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, -0xe95

    const v14, 0x4b0c2835    # 9185333.0f

    xor-int/2addr v13, v14

    const v14, -0x72a04bf9

    goto :goto_9

    :goto_8
    const-string v12, "\u0733\u0736"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v8, v12

    mul-int/lit8 v12, v12, -0x75

    xor-int v13, v12, v7

    mul-int/lit16 v13, v13, -0x72dd

    const v14, 0x1a466f89

    xor-int/2addr v13, v14

    const v14, -0x6675c31d

    goto :goto_9

    :cond_f
    const-string v12, "\u1a74\u05a8"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v7

    xor-int v13, v12, v8

    mul-int/lit16 v13, v13, -0x5ec1

    const v14, -0x6b54e702

    xor-int/2addr v13, v14

    const v14, -0x4797afa8

    :goto_9
    xor-int/2addr v12, v14

    move v9, v12

    move v10, v13

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7655cce5 -> :sswitch_8
        -0x60e83ca0 -> :sswitch_d
        -0x5639d4bd -> :sswitch_13
        -0x5317f05a -> :sswitch_10
        -0x4f003434 -> :sswitch_9
        -0x4909101c -> :sswitch_8
        -0x43b836ec -> :sswitch_a
        -0x42514215 -> :sswitch_8
        -0x41861b69 -> :sswitch_b
        -0x401b4e18 -> :sswitch_8
        -0x3ea6c916 -> :sswitch_1
        -0x3667e921 -> :sswitch_1
        -0x3271ae6a -> :sswitch_a
        -0x31356fe4 -> :sswitch_9
        -0x2d574b67 -> :sswitch_3
        -0x27271930 -> :sswitch_e
        -0x240dfe66 -> :sswitch_f
        -0x1ced20bb -> :sswitch_4
        -0x11c56f46 -> :sswitch_d
        -0x9dd95c7 -> :sswitch_12
        -0x7ff5d8b -> :sswitch_11
        -0x37b3b10 -> :sswitch_2
        -0x36429d2 -> :sswitch_7
        0x5a2ce39 -> :sswitch_0
        0x80dfa64 -> :sswitch_0
        0x864bd0f -> :sswitch_c
        0xd77b80c -> :sswitch_c
        0x10a9bd59 -> :sswitch_5
        0x23a9ae1f -> :sswitch_6
        0x25442181 -> :sswitch_4
        0x2a3768c8 -> :sswitch_7
        0x2cda69d3 -> :sswitch_10
        0x35136c85 -> :sswitch_13
        0x4019ced7 -> :sswitch_f
        0x4b7c313e -> :sswitch_11
        0x4b8224ec -> :sswitch_b
        0x4cbc91d9 -> :sswitch_2
        0x56320562 -> :sswitch_5
        0x588be570 -> :sswitch_3
        0x5dbb1465 -> :sswitch_e
        0x6bbc48e3 -> :sswitch_12
        0x7cdcd747 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(II)Ll/᩷ᩳܳ;
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, -0x4690a730

    sget v13, Ll/᩺;->ۙۛܶ:I

    sget v14, Ll/ۖ;->᩹۟ۘ:I

    const-string v15, "\u1a74\u0730"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x5

    xor-int v3, v15, v13

    mul-int/lit16 v3, v3, 0x76d

    const v17, 0x565c2f57

    xor-int v3, v3, v17

    const v17, 0x1b56f268    # 1.7779991E-22f

    xor-int v15, v15, v17

    move-object v8, v7

    move/from16 v16, v15

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, -0x4690a730

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x54f

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v3, v15

    xor-int v15, v16, v3

    sparse-switch v15, :sswitch_data_0

    return-object v0

    .line 957
    :sswitch_0
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_0

    move/from16 v17, v4

    move/from16 v16, v15

    goto/16 :goto_7

    :cond_0
    const-string v3, "\u06da\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v14

    mul-int/lit8 v3, v3, 0x45

    move/from16 v16, v15

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, 0x205b

    const v17, 0x628d2cc7

    xor-int v15, v15, v17

    const v17, 0x2d53e20

    goto/16 :goto_3

    :sswitch_1
    move/from16 v16, v15

    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_1

    :goto_1
    move/from16 v17, v4

    goto/16 :goto_6

    :cond_1
    move/from16 v17, v4

    goto/16 :goto_8

    :sswitch_2
    move/from16 v16, v15

    .line 219
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v17, v4

    goto/16 :goto_7

    :sswitch_3
    move/from16 v16, v15

    .line 859
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto :goto_1

    .line 6
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    const/4 v1, 0x0

    return-object v1

    .line 1112
    :sswitch_5
    new-instance v1, Ll/᩷ᩳܳ;

    iget-object v3, v0, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    invoke-direct {v1, v3, v5, v2, v7}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    return-object v1

    :sswitch_6
    move/from16 v16, v15

    const/4 v3, 0x0

    goto :goto_2

    :sswitch_7
    move/from16 v16, v15

    .line 1111
    invoke-virtual {v6, v5, v2}, Ll/ܿᩳܳ;->ᩳ(II)Ll/ܿᩳܳ;

    move-result-object v3

    :goto_2
    move-object v7, v3

    const-string v3, "\u1a73\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v15, v3, v14

    mul-int/lit16 v15, v15, 0x75b

    const v17, 0x7cb127f5

    xor-int v15, v15, v17

    const v17, -0x1d372840

    goto/16 :goto_3

    :sswitch_8
    move/from16 v16, v15

    if-ne v2, v4, :cond_4

    const-string v3, "\u05a1\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v14

    mul-int/lit8 v3, v3, 0x79

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, 0x4543

    const v17, -0x241b747d

    xor-int v15, v15, v17

    const v17, -0x6e40fb40

    goto/16 :goto_3

    :sswitch_9
    move/from16 v16, v15

    .line 1108
    iget v3, v0, Ll/᩷ᩳܳ;->ᩳ:I

    add-int v5, v3, v1

    .line 1110
    iget-object v6, v0, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    if-nez v6, :cond_3

    const-string v3, "\u1a75\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v15, v3, v14

    mul-int/lit16 v15, v15, 0x2059

    const v17, -0x21c56341

    xor-int v15, v15, v17

    const v17, -0x64db17f1

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, -0x451b

    const v17, -0x5cc528cd

    xor-int v15, v15, v17

    const v17, -0x5cb6a21d

    goto/16 :goto_3

    :sswitch_a
    move/from16 v16, v15

    if-nez v1, :cond_4

    const-string v3, "\u1a73\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x11

    xor-int v15, v3, v14

    mul-int/lit16 v15, v15, -0x5141

    const v17, 0x449259b5

    xor-int v15, v15, v17

    const v17, 0x5d14cd15

    goto :goto_3

    :cond_4
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, 0x6059

    const v17, -0x6a0ee370

    xor-int v15, v15, v17

    const v17, 0xb4c1f62

    goto :goto_3

    :sswitch_b
    move/from16 v16, v15

    .line 1103
    new-instance v3, Ljava/lang/IllegalArgumentException;

    sget-object v15, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    move/from16 v17, v4

    const/16 v4, 0x27

    .line 795
    sget v18, Ll/֡֡;->֫ۤܳ:I

    if-ltz v18, :cond_5

    goto/16 :goto_7

    :cond_5
    const/16 v1, 0xc

    .line 1103
    invoke-static {v15, v4, v1, v12}, Ll/֡ۨ;->ۡܺ֡([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :sswitch_c
    move/from16 v16, v15

    .line 1101
    iget v4, v0, Ll/᩷ᩳܳ;->֫:I

    invoke-static {v4, v1, v2}, Ll/ۡܽܳ;->ܽ(III)V

    if-eqz v2, :cond_6

    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, 0x750b

    const v17, 0xc2aa7bc

    xor-int v15, v15, v17

    const v17, 0x5217d8d8

    goto :goto_3

    :cond_6
    const-string v3, "\u06e1\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v13, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v15, v3, v14

    mul-int/lit16 v15, v15, 0x1977

    const v17, 0x33b9f884

    xor-int v15, v15, v17

    const v17, 0x7957e599

    :goto_3
    xor-int v3, v3, v17

    move/from16 v19, v16

    move/from16 v16, v3

    move v3, v15

    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_d
    move/from16 v17, v4

    move/from16 v16, v15

    const v3, 0xc2cf

    const v12, 0xc2cf

    goto :goto_4

    :sswitch_e
    move/from16 v17, v4

    move/from16 v16, v15

    const v3, 0x8327

    const v12, 0x8327

    :goto_4
    const-string v3, "\u073d\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, -0x489d

    const v15, -0x7bd703df

    xor-int/2addr v4, v15

    const v15, 0x2f01c63e

    goto/16 :goto_9

    :sswitch_f
    move/from16 v17, v4

    move/from16 v16, v15

    add-int v3, v9, v11

    mul-int v3, v3, v3

    sub-int v3, v10, v3

    if-gtz v3, :cond_7

    const-string v3, "\u06ec\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, -0x1451

    const v15, 0x74884fc0

    xor-int/2addr v4, v15

    const v15, -0x552b4f93

    goto/16 :goto_9

    :cond_7
    const-string v3, "\u05a1\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v14, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x60df

    const v15, -0xc21a8c7

    xor-int/2addr v4, v15

    const v15, -0x39f67294

    goto/16 :goto_9

    :sswitch_10
    move/from16 v17, v4

    move/from16 v16, v15

    mul-int/lit16 v10, v9, 0x1940

    const/16 v11, 0x650

    .line 348
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, 0xb75

    const v15, 0x13ec71db

    xor-int/2addr v4, v15

    const v15, -0x36c7c1b6

    goto/16 :goto_9

    :sswitch_11
    move/from16 v17, v4

    move/from16 v16, v15

    const/16 v3, 0x26

    aget-short v9, v8, v3

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v3, "\u06e0\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, -0x4fff

    const v15, -0x440bdc47

    xor-int/2addr v4, v15

    const v15, 0x74d784dd

    goto/16 :goto_9

    :sswitch_12
    move/from16 v17, v4

    move/from16 v16, v15

    sget-object v8, Ll/᩷ᩳܳ;->۬ᩴ֫:[S

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v3, "\u1a7b\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0xad7

    const v15, 0x42351e67

    xor-int/2addr v4, v15

    const v15, -0x5d63a052

    goto/16 :goto_9

    :sswitch_13
    move/from16 v17, v4

    move/from16 v16, v15

    .line 646
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_b

    goto :goto_6

    :cond_b
    const-string v3, "\u1a75\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, 0x52f1

    const v15, -0x1201831

    xor-int/2addr v4, v15

    const v15, 0x1ec4f842

    goto/16 :goto_9

    :sswitch_14
    move/from16 v17, v4

    move/from16 v16, v15

    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_c

    goto/16 :goto_8

    :cond_c
    const-string v3, "\u06da\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x4d9f

    const v15, 0x3b8077ca

    xor-int/2addr v4, v15

    const v15, -0x269f33f9

    goto/16 :goto_9

    :sswitch_15
    move/from16 v17, v4

    move/from16 v16, v15

    .line 1090
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_d

    :goto_5
    const-string v3, "\u06e1\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x230b

    const v15, 0x131054

    xor-int/2addr v4, v15

    const v15, -0x66c8b08

    goto/16 :goto_9

    :cond_d
    const-string v3, "\u1a74\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x3339

    const v15, -0x7683c55b

    xor-int/2addr v4, v15

    const v15, -0x3507552d    # -8148329.5f

    goto/16 :goto_9

    :sswitch_16
    move/from16 v17, v4

    move/from16 v16, v15

    .line 174
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_e

    :goto_6
    const-string v3, "\u06dc\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v14

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, 0x323b

    const v15, 0x86abfea

    xor-int/2addr v4, v15

    const v15, 0x31ed08a6

    goto/16 :goto_9

    :cond_e
    const-string v3, "\u06e2\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, 0x77bf

    const v15, 0x36bfaf4

    xor-int/2addr v4, v15

    const v15, -0x6cefd0e3

    goto :goto_9

    :sswitch_17
    move/from16 v17, v4

    move/from16 v16, v15

    .line 84
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_f

    :goto_7
    const-string v3, "\u06d8\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, 0x62c7

    const v15, 0x3e90a72c

    xor-int/2addr v4, v15

    const v15, 0x6276b908

    goto :goto_9

    :cond_f
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v14

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x7c0b

    const v15, -0x23f75015

    xor-int/2addr v4, v15

    const v15, -0x3b92a415

    goto :goto_9

    :sswitch_18
    move/from16 v17, v4

    move/from16 v16, v15

    .line 557
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_10

    :goto_8
    const-string v3, "\u06eb\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, 0xca5

    const v15, 0x713db1ae

    xor-int/2addr v4, v15

    const v15, -0x29294e2f

    goto :goto_9

    :cond_10
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    xor-int v4, v3, v14

    mul-int/lit16 v4, v4, -0x9bf

    const v15, 0x63bf8032

    xor-int/2addr v4, v15

    const v15, 0x6d854413

    :goto_9
    xor-int/2addr v3, v15

    move/from16 v15, v16

    move/from16 v16, v3

    move v3, v4

    move/from16 v4, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d0cd4bb -> :sswitch_2
        -0x77a68fc9 -> :sswitch_5
        -0x74bd90a8 -> :sswitch_a
        -0x71a1f010 -> :sswitch_18
        -0x69a438f3 -> :sswitch_1
        -0x60c8941c -> :sswitch_e
        -0x590c0a39 -> :sswitch_15
        -0x513b5fb3 -> :sswitch_6
        -0x48ae5639 -> :sswitch_4
        -0x3ffc95c8 -> :sswitch_8
        -0x383cbbed -> :sswitch_7
        -0x374d770d -> :sswitch_10
        -0x36a16efe -> :sswitch_8
        -0x2de58370 -> :sswitch_9
        -0x293aba10 -> :sswitch_1
        -0x28d71420 -> :sswitch_5
        -0x1cca9584 -> :sswitch_2
        -0x1c74d267 -> :sswitch_4
        -0x10cf88ca -> :sswitch_d
        -0x2902d15 -> :sswitch_12
        0x369b6c -> :sswitch_13
        0x47ab185 -> :sswitch_e
        0x985703e -> :sswitch_f
        0x106dfd2c -> :sswitch_f
        0x1248389d -> :sswitch_b
        0x13ad6876 -> :sswitch_14
        0x171de2e9 -> :sswitch_9
        0x1ae23a03 -> :sswitch_c
        0x1d3b308a -> :sswitch_16
        0x25fa61ea -> :sswitch_18
        0x28f0c8d7 -> :sswitch_b
        0x2d8316a5 -> :sswitch_a
        0x321acc0b -> :sswitch_16
        0x361d7448 -> :sswitch_12
        0x373b53c2 -> :sswitch_11
        0x3809a407 -> :sswitch_17
        0x3e77ab42 -> :sswitch_10
        0x43230537 -> :sswitch_15
        0x4a6a982e -> :sswitch_13
        0x52170d4c -> :sswitch_0
        0x53f86153 -> :sswitch_c
        0x54e8fa36 -> :sswitch_6
        0x5866a4e5 -> :sswitch_17
        0x5920bf5b -> :sswitch_0
        0x78d28e0b -> :sswitch_3
        0x78e508b9 -> :sswitch_14
        0x7a1f2148 -> :sswitch_7
        0x7b118ae4 -> :sswitch_3
        0x7bc99cd2 -> :sswitch_11
        0x7f380993 -> :sswitch_d
    .end sparse-switch
.end method

.method public final ֫(Ll/᩷ᩳܳ;)Ll/᩷ᩳܳ;
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, -0xfaa46e6

    sget v31, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v32, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v33, "\u06da\u05a8"

    invoke-static/range {v33 .. v33}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v32

    xor-int v2, v33, v31

    mul-int/lit16 v2, v2, -0x1d05

    const v35, 0x1458bd93    # 1.09426E-26f

    xor-int v2, v2, v35

    const v35, -0x5f1f5f5b

    xor-int v33, v33, v35

    move-object v5, v13

    move-object/from16 v28, v27

    move/from16 v34, v33

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v33, -0xfaa46e6

    const/16 v35, 0x0

    move-object v13, v6

    move-object v6, v14

    move-object v14, v7

    move-wide/from16 v40, v16

    move-object/from16 v17, v12

    move-wide v15, v8

    move-wide v7, v10

    move-object/from16 v12, v24

    move-object/from16 v11, v29

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v29, v3

    move-object/from16 v24, v22

    const/4 v3, 0x0

    move-wide/from16 v22, v20

    move-wide/from16 v20, v18

    move-wide/from16 v18, v40

    :goto_0
    xor-int v4, v33, v31

    mul-int/lit16 v4, v4, 0x23a3

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v2, v4

    xor-int v33, v34, v2

    sparse-switch v33, :sswitch_data_0

    .line 197
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto :goto_2

    .line 45
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_1

    :cond_0
    :goto_1
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    goto/16 :goto_13

    :cond_1
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    goto/16 :goto_10

    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    if-gez v2, :cond_3

    :cond_2
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    goto/16 :goto_e

    :cond_3
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    goto/16 :goto_6

    .line 338
    :sswitch_2
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v2, :cond_4

    :goto_2
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    move/from16 v5, v25

    goto/16 :goto_1e

    :cond_4
    move/from16 v34, v10

    move-object v10, v6

    move-object v6, v5

    move/from16 v5, v25

    move-wide/from16 v40, v15

    move/from16 v16, v3

    move-wide/from16 v2, v40

    move/from16 v15, v35

    goto/16 :goto_20

    .line 918
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    if-gez v2, :cond_2

    goto :goto_2

    .line 685
    :sswitch_4
    sget v2, Ll/ۛ;->᩺᩻֫:I

    if-gez v2, :cond_5

    goto :goto_1

    :cond_5
    move-wide/from16 v36, v15

    goto :goto_4

    .line 272
    :sswitch_5
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v2, :cond_6

    goto :goto_1

    :cond_6
    const-string v2, "\u0730\u06e0"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v4, v2, v32

    mul-int/lit16 v4, v4, -0x79cf

    const v34, -0x6cd010e7

    xor-int v4, v4, v34

    const v34, 0x491c08e6    # 639118.4f

    goto :goto_3

    .line 368
    :sswitch_6
    sget v2, Ll/᩹;->ۤܿܳ:I

    if-nez v2, :cond_0

    goto :goto_2

    :sswitch_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v2, :cond_7

    goto :goto_2

    :cond_7
    const-string v2, "\u1a76\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    xor-int v4, v2, v31

    mul-int/lit16 v4, v4, 0x1f8b

    const v34, 0x115f3c63

    xor-int v4, v4, v34

    const v34, -0x145f3506

    :goto_3
    xor-int v34, v2, v34

    move v2, v4

    goto/16 :goto_0

    .line 965
    :sswitch_8
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 v1, 0x0

    return-object v1

    .line 1247
    :sswitch_9
    new-instance v2, Ll/᩷ᩳܳ;

    new-instance v4, Ll/᩶ۧܳ;

    move-wide/from16 v36, v15

    long-to-int v15, v7

    .line 1057
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v16

    if-gtz v16, :cond_8

    :goto_4
    const-string v2, "\u06e1\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v4, v2, v32

    mul-int/lit16 v4, v4, 0x71d1

    const v15, 0x1cbe835d

    xor-int/2addr v4, v15

    const v15, 0x6fb11ce1

    goto :goto_5

    .line 1247
    :cond_8
    invoke-direct {v4, v10, v15}, Ll/᩶ۧܳ;-><init>(BI)V

    const/4 v1, 0x0

    invoke-direct {v2, v4, v1, v15, v11}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    return-object v2

    .line 1240
    :sswitch_a
    new-instance v1, Ll/᩷ᩳܳ;

    long-to-int v2, v7

    invoke-direct {v1, v6, v3, v2, v5}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    return-object v1

    :sswitch_b
    move-wide/from16 v36, v15

    .line 1245
    move-object v2, v13

    check-cast v2, Ll/᩶ۧܳ;

    iget-byte v10, v12, Ll/᩶ۧܳ;->᩹:B

    iget-byte v2, v2, Ll/᩶ۧܳ;->᩹:B

    if-ne v10, v2, :cond_9

    const-string v2, "\u05a8\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    xor-int v4, v2, v31

    mul-int/lit16 v4, v4, -0x69cb

    const v15, -0xd18ef6e

    xor-int/2addr v4, v15

    const v15, -0x2acc38f5

    :goto_5
    xor-int v34, v2, v15

    move v2, v4

    goto/16 :goto_1d

    :cond_9
    move/from16 v16, v3

    move-object v2, v5

    move/from16 v34, v10

    move/from16 v15, v35

    move-object v10, v6

    goto/16 :goto_c

    .line 1235
    :sswitch_c
    new-instance v1, Ll/᩷ᩳܳ;

    long-to-int v2, v7

    invoke-direct {v1, v6, v3, v2, v14}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    return-object v1

    :sswitch_d
    move-wide/from16 v36, v15

    .line 1237
    iget v4, v0, Ll/᩷ᩳܳ;->ᩳ:I

    move v2, v3

    move-object/from16 v3, v28

    move/from16 v15, v35

    move/from16 v16, v2

    move-object v2, v5

    move/from16 v34, v10

    move-object v10, v6

    move-wide v5, v7

    move-wide/from16 v38, v7

    move/from16 v7, v26

    move/from16 v8, v27

    invoke-static/range {v3 .. v8}, Ll/᩷ᩳܳ;->֫(Ll/ܿᩳܳ;IJII)Z

    move-result v3

    if-eqz v3, :cond_a

    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v31

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, 0x4507

    const v5, 0x360e0784

    xor-int/2addr v4, v5

    const v5, 0x440b83ec

    goto/16 :goto_7

    :cond_a
    move-wide/from16 v7, v38

    goto/16 :goto_d

    :sswitch_e
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    iget v3, v1, Ll/᩷ᩳܳ;->ᩳ:I

    iget v4, v1, Ll/᩷ᩳܳ;->֫:I

    iget-object v5, v0, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    .line 828
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_b

    move/from16 v26, v3

    move/from16 v27, v4

    move-object/from16 v28, v5

    :goto_6
    const-string v3, "\u06d8\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v32, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, 0x5c3

    const v5, 0x42e2b07c

    xor-int/2addr v4, v5

    const v5, -0x1f124584

    goto/16 :goto_7

    :cond_b
    const-string v6, "\u1a78\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v32

    xor-int v7, v6, v31

    mul-int/lit16 v7, v7, 0x1555

    const v8, 0x50ab1015

    xor-int/2addr v7, v8

    const v8, -0x5baf1215

    xor-int/2addr v6, v8

    move/from16 v26, v3

    move/from16 v27, v4

    move-object/from16 v28, v5

    move/from16 v35, v15

    move/from16 v3, v16

    move-wide/from16 v15, v36

    move-object v5, v2

    move v2, v7

    move-wide/from16 v7, v38

    move/from16 v40, v34

    move/from16 v34, v6

    move-object v6, v10

    move/from16 v10, v40

    goto/16 :goto_0

    :sswitch_f
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    .line 1244
    move-object v12, v10

    check-cast v12, Ll/᩶ۧܳ;

    .line 1245
    instance-of v3, v13, Ll/᩶ۧܳ;

    if-eqz v3, :cond_d

    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v31

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, -0x25b

    const v5, -0xd2379e3

    xor-int/2addr v4, v5

    const v5, -0x25aeda3f

    goto/16 :goto_7

    :sswitch_10
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object/from16 v3, v24

    move v4, v15

    move-wide/from16 v5, v38

    move v7, v15

    move v8, v9

    .line 1232
    invoke-static/range {v3 .. v8}, Ll/᩷ᩳܳ;->֫(Ll/ܿᩳܳ;IJII)Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v32

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, -0x6fbd

    const v5, 0x7d11265a

    xor-int/2addr v4, v5

    const v5, -0x5fa3106d

    goto :goto_7

    :cond_c
    move/from16 v3, v16

    move-wide/from16 v7, v38

    goto/16 :goto_8

    :sswitch_11
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    if-nez v14, :cond_a

    const-string v3, "\u06d9\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v31

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, -0x2951

    const v5, 0x7865d6b9

    xor-int/2addr v4, v5

    const v5, -0x5bc284cb

    goto :goto_7

    :sswitch_12
    move-object v2, v5

    move-wide/from16 v38, v7

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    .line 1244
    instance-of v3, v10, Ll/᩶ۧܳ;

    if-eqz v3, :cond_d

    const-string v3, "\u073a\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, 0x41e1

    const v5, -0x771c24b7

    xor-int/2addr v4, v5

    const v5, -0x5d821eca

    :goto_7
    xor-int/2addr v3, v5

    move-object v5, v2

    move v2, v4

    move-object v6, v10

    move/from16 v35, v15

    move/from16 v10, v34

    move-wide/from16 v7, v38

    goto/16 :goto_1b

    :cond_d
    move-wide/from16 v7, v38

    goto/16 :goto_c

    :sswitch_13
    move-object v2, v5

    move-object v10, v6

    move-wide/from16 v38, v7

    move/from16 v15, v35

    .line 1230
    new-instance v1, Ll/᩷ᩳܳ;

    long-to-int v3, v7

    invoke-direct {v1, v10, v15, v3, v2}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    return-object v1

    :sswitch_14
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move-object v10, v6

    .line 1232
    iget v3, v0, Ll/᩷ᩳܳ;->ᩳ:I

    if-nez v2, :cond_e

    const-string v4, "\u06d9\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v31

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v32

    mul-int/lit16 v5, v5, 0xaf9

    const v6, -0x7264d791

    xor-int/2addr v5, v6

    const v6, -0x485a56a5

    goto :goto_9

    :cond_e
    :goto_8
    const-string v4, "\u06d6\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v32, v4

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v31

    mul-int/lit16 v5, v5, 0x5d1d

    const v6, 0x27dc5860

    xor-int/2addr v5, v6

    const v6, 0x6ac844a6

    :goto_9
    xor-int/2addr v4, v6

    move-object v6, v10

    move/from16 v35, v15

    goto/16 :goto_b

    :sswitch_15
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    const/4 v3, 0x0

    move-object v11, v3

    goto/16 :goto_12

    :sswitch_16
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    if-nez v14, :cond_10

    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v31

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, -0x26bf

    const v5, 0x102f4ef4

    xor-int/2addr v4, v5

    const v5, -0x5eb35d6c

    goto/16 :goto_f

    :sswitch_17
    return-object v11

    :sswitch_18
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    .line 1228
    iget-object v3, v1, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    if-ne v2, v3, :cond_f

    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v32

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v31

    mul-int/lit16 v5, v5, -0x46d5

    const v6, -0x595ef2a1

    xor-int/2addr v5, v6

    const v6, 0x6c3d7655

    goto :goto_a

    :cond_f
    const-string v4, "\u05a1\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v31

    xor-int v5, v4, v32

    mul-int/lit16 v5, v5, -0x7c27

    const v6, -0x531579a7

    xor-int/2addr v5, v6

    const v6, 0x5dbac4b9

    :goto_a
    xor-int/2addr v4, v6

    move-object/from16 v24, v3

    move-object v6, v10

    move/from16 v35, v15

    move/from16 v3, v16

    :goto_b
    move/from16 v10, v34

    move-wide/from16 v15, v36

    move/from16 v34, v4

    move/from16 v40, v5

    move-object v5, v2

    move/from16 v2, v40

    goto/16 :goto_0

    :sswitch_19
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    if-nez v2, :cond_10

    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v31

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, 0x3189

    const v5, -0xbaa042e

    xor-int/2addr v4, v5

    const v5, 0x5771cae

    goto/16 :goto_f

    :cond_10
    :goto_c
    const-string v3, "\u1a77\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, 0x4a51

    const v5, 0x3a729d55

    xor-int/2addr v4, v5

    const v5, 0x6224720b

    goto/16 :goto_f

    :sswitch_1a
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    .line 1227
    iget v3, v1, Ll/᩷ᩳܳ;->ᩳ:I

    int-to-long v3, v3

    cmp-long v5, v22, v3

    if-nez v5, :cond_11

    const-string v3, "\u1a76\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v31

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, -0x7b69

    const v5, -0xbf86d8e

    xor-int/2addr v4, v5

    const v5, -0x2a1b98fd

    goto :goto_f

    :cond_11
    :goto_d
    const-string v3, "\u1a76\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v32, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, -0x7ae7

    const v5, 0x153ae522

    xor-int/2addr v4, v5

    const v5, -0x7186db4b

    goto :goto_f

    :sswitch_1b
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    add-long v22, v18, v20

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_e
    const-string v3, "\u06e4\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, -0x5447

    const v5, 0x4e8c4390

    xor-int/2addr v4, v5

    const v5, -0x6a7f0be5

    goto :goto_f

    :cond_12
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v32

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v31

    mul-int/lit16 v4, v4, -0x596f

    const v5, -0x682a6bb4

    xor-int/2addr v4, v5

    const v5, 0x123c23e

    :goto_f
    xor-int/2addr v3, v5

    move-object v5, v2

    move v2, v4

    goto/16 :goto_19

    :sswitch_1c
    move-object v2, v5

    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v16, v3

    move-object v10, v6

    iget v3, v0, Ll/᩷ᩳܳ;->ᩳ:I

    int-to-long v4, v3

    move-object v6, v2

    move v15, v3

    int-to-long v2, v9

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v18

    if-eqz v18, :cond_13

    move-wide/from16 v20, v2

    move-wide/from16 v18, v4

    move/from16 v35, v15

    :goto_10
    const-string v2, "\u1a73\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v31

    mul-int/lit8 v2, v2, 0x27

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, -0x6899

    const v4, 0x1ace2b2b

    xor-int/2addr v3, v4

    const v4, 0x20b4ee21

    xor-int/2addr v2, v4

    move-object v5, v6

    move-object v6, v10

    goto/16 :goto_17

    :cond_13
    const-string v18, "\u06d7\u06d9"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v32

    move-wide/from16 v19, v2

    xor-int v2, v18, v31

    mul-int/lit16 v2, v2, -0x72bf

    const v3, 0x448cd8f9

    xor-int/2addr v2, v3

    const v3, 0x1aaa2c23

    xor-int v3, v18, v3

    move/from16 v35, v15

    move-wide/from16 v20, v19

    move-wide/from16 v18, v4

    move-object v5, v6

    move-object v6, v10

    goto/16 :goto_1a

    :sswitch_1d
    return-object v17

    :sswitch_1e
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    iget-object v5, v0, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    iget-object v6, v0, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    if-ne v6, v13, :cond_14

    const-string v2, "\u06d8\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    mul-int/lit8 v2, v2, -0x57

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, -0x2ccf

    const v4, -0x5970fc81

    xor-int/2addr v3, v4

    const v4, 0x7eb64923

    :goto_11
    xor-int/2addr v2, v4

    goto/16 :goto_16

    :cond_14
    move-object/from16 v11, v17

    :goto_12
    const-string v2, "\u1a79\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v31

    mul-int/lit8 v2, v2, 0x6f

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, -0x76e3

    const v4, -0x4408a1a2

    xor-int/2addr v3, v4

    const v4, 0x75e790b

    goto :goto_11

    :sswitch_1f
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    const-wide/32 v2, 0x7fffffff

    const/16 v17, 0x0

    cmp-long v4, v7, v2

    if-lez v4, :cond_15

    const-string v2, "\u06e2\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v32, v2

    mul-int/lit8 v2, v2, -0x25

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, 0x55e5

    const v4, -0x5757713f

    xor-int/2addr v3, v4

    const v4, -0x23b73dba

    goto :goto_14

    :cond_15
    const-string v2, "\u1a7a\u05ab"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, -0x166d

    const v4, 0x3a935b01

    xor-int/2addr v3, v4

    const v4, 0x7960eaf7    # 7.299001E34f

    goto :goto_14

    :sswitch_20
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    add-long v7, v36, v29

    .line 1127
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v2, :cond_16

    :goto_13
    const-string v2, "\u1a73\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    mul-int/lit8 v2, v2, 0x49

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, -0x7ae9

    const v4, -0x55898f81

    xor-int/2addr v3, v4

    const v4, 0x4697c100    # 19424.5f

    goto :goto_14

    :cond_16
    const-string v2, "\u06e4\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v32

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, -0x62a9

    const v4, 0x5114d74a

    xor-int/2addr v3, v4

    const v4, 0xf134e1c

    :goto_14
    xor-int/2addr v2, v4

    :goto_15
    move-object v5, v6

    move-object v6, v10

    :goto_16
    move/from16 v35, v15

    :goto_17
    move/from16 v10, v34

    move/from16 v34, v2

    move v2, v3

    goto/16 :goto_1c

    :sswitch_21
    move/from16 v16, v3

    move/from16 v34, v10

    move/from16 v15, v35

    move-object v10, v6

    move-object v6, v5

    .line 1223
    iget-object v14, v1, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    move/from16 v5, v25

    int-to-long v2, v5

    .line 1003
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_17

    goto/16 :goto_20

    :cond_17
    const-string v4, "\u0730\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v31

    move-wide/from16 v35, v2

    xor-int v2, v4, v32

    mul-int/lit16 v2, v2, -0xa4d

    const v3, -0x5c734441

    xor-int/2addr v2, v3

    const v3, 0x15a664ca

    xor-int/2addr v3, v4

    move/from16 v25, v5

    move-object v5, v6

    move-object v6, v10

    move/from16 v10, v34

    move/from16 v34, v3

    move/from16 v3, v16

    move-wide/from16 v40, v35

    move/from16 v35, v15

    :goto_18
    move-wide/from16 v15, v40

    goto/16 :goto_0

    :sswitch_22
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    .line 1223
    iget v2, v1, Ll/᩷ᩳܳ;->֫:I

    iget-object v13, v1, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    .line 136
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_18

    move/from16 v25, v2

    goto/16 :goto_1f

    :cond_18
    const-string v3, "\u06e1\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v31

    xor-int v4, v3, v32

    mul-int/lit16 v4, v4, 0x5183

    const v5, 0x38bffd8d

    xor-int/2addr v4, v5

    const v5, -0x2bea1447

    xor-int/2addr v3, v5

    move/from16 v25, v2

    move v2, v4

    move-object v5, v6

    :goto_19
    move-object v6, v10

    move/from16 v35, v15

    :goto_1a
    move/from16 v10, v34

    :goto_1b
    move/from16 v34, v3

    :goto_1c
    move/from16 v3, v16

    :goto_1d
    move-wide/from16 v15, v36

    goto/16 :goto_0

    :sswitch_23
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    move/from16 v5, v25

    int-to-long v2, v9

    .line 1006
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_19

    move-wide/from16 v29, v2

    :goto_1e
    const-string v2, "\u073f\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, 0x7a1d

    const v4, -0x21857fd8

    xor-int/2addr v3, v4

    const v4, 0x271f5782

    xor-int/2addr v2, v4

    move/from16 v25, v5

    goto/16 :goto_15

    :cond_19
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v32

    mul-int/lit8 v4, v4, -0x55

    xor-int v1, v4, v31

    mul-int/lit16 v1, v1, 0x2469

    const v25, 0x7c54e48c

    xor-int v1, v1, v25

    const v25, -0x239d4cfb

    xor-int v4, v4, v25

    move-wide/from16 v29, v2

    move/from16 v25, v5

    move-object v5, v6

    move-object v6, v10

    move/from16 v35, v15

    move/from16 v3, v16

    move/from16 v10, v34

    move-wide/from16 v15, v36

    move v2, v1

    move/from16 v34, v4

    goto/16 :goto_23

    :sswitch_24
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    move/from16 v5, v25

    .line 1223
    iget v9, v0, Ll/᩷ᩳܳ;->֫:I

    .line 788
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_1a

    move/from16 v25, v5

    :goto_1f
    const-string v1, "\u0730\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v2, v1, v31

    mul-int/lit16 v2, v2, 0x5335

    const v3, 0x36e811a8

    xor-int/2addr v2, v3

    const v3, 0x1cd37dec

    xor-int/2addr v1, v3

    goto/16 :goto_22

    :cond_1a
    const-string v1, "\u06e4\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v2, v1, v31

    mul-int/lit16 v2, v2, -0x4211

    const v3, 0x6f78e26a    # 7.7026E28f

    xor-int/2addr v2, v3

    const v3, 0x67cabd72

    goto :goto_21

    :sswitch_25
    move/from16 v34, v10

    move-wide/from16 v36, v15

    move/from16 v15, v35

    move/from16 v16, v3

    move-object v10, v6

    move-object v6, v5

    move/from16 v5, v25

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_1b

    move-wide/from16 v2, v36

    :goto_20
    const-string v1, "\u06df\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v4, v1, v32

    mul-int/lit16 v4, v4, 0x26d5

    const v25, -0x184098a4

    xor-int v4, v4, v25

    const v25, -0x734ac093

    xor-int v1, v1, v25

    move/from16 v25, v5

    move-object v5, v6

    move-object v6, v10

    move/from16 v35, v15

    move/from16 v10, v34

    move/from16 v34, v1

    move-object/from16 v1, p1

    move-wide/from16 v40, v2

    move v2, v4

    move/from16 v3, v16

    goto/16 :goto_18

    :cond_1b
    const-string v1, "\u06e8\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v31, v1

    mul-int/lit8 v1, v1, -0x6f

    xor-int v2, v1, v32

    mul-int/lit16 v2, v2, 0x7073

    const v3, -0x1c0296ea

    xor-int/2addr v2, v3

    const v3, 0x30de33dc

    :goto_21
    xor-int/2addr v1, v3

    move/from16 v25, v5

    :goto_22
    move-object v5, v6

    move-object v6, v10

    move/from16 v35, v15

    move/from16 v3, v16

    move/from16 v10, v34

    move-wide/from16 v15, v36

    move/from16 v34, v1

    :goto_23
    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eef29c4 -> :sswitch_9
        -0x7d2af31d -> :sswitch_10
        -0x7b8844c8 -> :sswitch_10
        -0x7ae1e018 -> :sswitch_6
        -0x73c1a251 -> :sswitch_13
        -0x6afb2417 -> :sswitch_a
        -0x6a960271 -> :sswitch_15
        -0x68bce259 -> :sswitch_24
        -0x6841ab25 -> :sswitch_1e
        -0x680edd91 -> :sswitch_14
        -0x656b556c -> :sswitch_7
        -0x61f195b6 -> :sswitch_b
        -0x61261635 -> :sswitch_11
        -0x5fadfd7a -> :sswitch_3
        -0x5288008c -> :sswitch_13
        -0x50cf2bb6 -> :sswitch_16
        -0x4b8a5a4d -> :sswitch_4
        -0x4a003654 -> :sswitch_21
        -0x44b16dd8 -> :sswitch_24
        -0x44256892 -> :sswitch_7
        -0x426a9a86 -> :sswitch_19
        -0x40d96bcb -> :sswitch_8
        -0x3f5adfe8 -> :sswitch_12
        -0x3b2faeb9 -> :sswitch_21
        -0x3a289241 -> :sswitch_e
        -0x3857f02d -> :sswitch_11
        -0x383bfa4e -> :sswitch_1c
        -0x340d57fd -> :sswitch_1
        -0x312ac55f -> :sswitch_18
        -0x2c7c68a7 -> :sswitch_22
        -0x2bdff905 -> :sswitch_d
        -0x267147d3 -> :sswitch_c
        -0x1fd0dc75 -> :sswitch_5
        -0x168025a5 -> :sswitch_1
        -0x1657512d -> :sswitch_1a
        -0x12a0e246 -> :sswitch_3
        -0xf8f8d4c -> :sswitch_d
        -0xb3c2164 -> :sswitch_25
        -0x9a15c20 -> :sswitch_f
        -0x6d326ed -> :sswitch_25
        -0x6a9e18e -> :sswitch_1d
        -0x17adeb4 -> :sswitch_9
        0x2518691 -> :sswitch_0
        0x3e6efdf -> :sswitch_1a
        0x6922377 -> :sswitch_1b
        0x7f7b073 -> :sswitch_16
        0xab1d86d -> :sswitch_1d
        0xbee9236 -> :sswitch_2
        0xce73697 -> :sswitch_12
        0xd282eb2 -> :sswitch_f
        0xe5b0d56 -> :sswitch_5
        0x103c9635 -> :sswitch_e
        0x18891d2b -> :sswitch_1e
        0x22f3f0be -> :sswitch_4
        0x25765d70 -> :sswitch_20
        0x28973aa9 -> :sswitch_23
        0x28ab83bf -> :sswitch_2
        0x28f620fb -> :sswitch_6
        0x33e9e951 -> :sswitch_23
        0x360498e0 -> :sswitch_17
        0x37f79c8e -> :sswitch_c
        0x3c50bc41 -> :sswitch_14
        0x4512507b -> :sswitch_b
        0x46f56133 -> :sswitch_8
        0x48f03fdb -> :sswitch_0
        0x499fa230 -> :sswitch_18
        0x4c5097ad -> :sswitch_1f
        0x4e8952f6 -> :sswitch_1b
        0x5ad46d12 -> :sswitch_15
        0x5b3036f0 -> :sswitch_1f
        0x601fa40c -> :sswitch_22
        0x63c8e132 -> :sswitch_a
        0x67835f0b -> :sswitch_1c
        0x716b80ae -> :sswitch_19
        0x744c5022 -> :sswitch_20
        0x7826ac93 -> :sswitch_17
    .end sparse-switch
.end method

.method public final ֫(I[BII)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x52b539c2

    sget v4, Ll/֡֡;->֫ۤܳ:I

    sget v5, Ll/֡۬;->۠֡᩶:I

    const-string v6, "\u06d7\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x12c5

    const v8, 0x36429aac

    xor-int/2addr v7, v8

    const v8, 0x1822fa1c

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x523b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 1047
    sget v6, Ll/֡۬;->۠֡᩶:I

    if-gtz v6, :cond_5

    goto/16 :goto_2

    .line 200
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u1a78\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6cb3

    const v8, 0x379f5c1

    xor-int/2addr v7, v8

    const v8, -0x7d24f09b

    goto :goto_0

    .line 404
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v6

    if-gtz v6, :cond_b

    goto/16 :goto_2

    .line 585
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v6, Ll/֡۬;->۠֡᩶:I

    if-gtz v6, :cond_6

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    return-void

    :sswitch_5
    add-int v6, v1, p1

    .line 1096
    invoke-virtual {v2, v6, p2, p3, p4}, Ll/ܿᩳܳ;->֫(I[BII)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 1093
    :sswitch_7
    invoke-static {v0, p1, p4}, Ll/ۡܽܳ;->ܽ(III)V

    .line 1094
    iget v1, p0, Ll/᩷ᩳܳ;->ᩳ:I

    add-int v2, v1, p1

    iget-object v6, p0, Ll/᩷ᩳܳ;->ܽ:Ll/ᩴܽܳ;

    invoke-interface {v6, v2, p2, p3, p4}, Ll/ᩴܽܳ;->֫(I[BII)V

    .line 1095
    iget-object v2, p0, Ll/᩷ᩳܳ;->ۧ:Ll/ܿᩳܳ;

    if-eqz v2, :cond_1

    const-string v6, "\u06db\u1a78"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x189d

    const v8, -0x112e18fc

    xor-int/2addr v7, v8

    const v8, 0x395a1ac3    # 2.080007E-4f

    goto :goto_0

    :cond_1
    :goto_1
    const-string v6, "\u06d7\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x17

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x51a5

    const v8, -0x4ac2bc56

    xor-int/2addr v7, v8

    const v8, 0x1b3ed4b8

    goto/16 :goto_0

    .line 1093
    :sswitch_8
    iget v0, p0, Ll/᩷ᩳܳ;->֫:I

    .line 291
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v6, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v6, "\u06d9\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x39e5

    const v8, -0x51c1a5da

    xor-int/2addr v7, v8

    const v8, -0x475b5c36

    goto/16 :goto_0

    .line 979
    :sswitch_9
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u1a7b\u06ec"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xa11

    const v8, -0x90f116c

    xor-int/2addr v7, v8

    const v8, -0x2099820b

    goto/16 :goto_0

    .line 443
    :sswitch_a
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u1a7a\u05a1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x4b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3dcd

    const v8, -0x46d6fb89

    xor-int/2addr v7, v8

    const v8, 0x6dc5ab1

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u0733\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xd93

    const v8, 0x7f864a8e

    xor-int/2addr v7, v8

    const v8, 0x354d8493

    goto/16 :goto_0

    .line 383
    :sswitch_b
    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v6, :cond_7

    :cond_6
    :goto_2
    const-string v6, "\u06e4\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6beb

    const v8, -0x1cda1e51

    xor-int/2addr v7, v8

    const v8, -0x3a66a3ce

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06eb\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5829

    const v8, 0x6fa644dc

    xor-int/2addr v7, v8

    const v8, -0x5651c3a6

    goto/16 :goto_0

    .line 841
    :sswitch_c
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v6

    if-eqz v6, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v6, "\u06eb\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x68e3

    const v8, 0x481dc362

    xor-int/2addr v7, v8

    const v8, 0x1ee77ffb

    goto/16 :goto_0

    .line 701
    :sswitch_d
    sget v6, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v6, :cond_9

    goto :goto_3

    :cond_9
    const-string v6, "\u06e0\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x499b

    const v8, -0x1d5a50b8

    xor-int/2addr v7, v8

    const v8, 0x43f91601

    goto/16 :goto_0

    .line 980
    :sswitch_e
    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-eqz v6, :cond_a

    :goto_3
    const-string v6, "\u06d7\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x32cd

    const v8, 0xbad24db

    xor-int/2addr v7, v8

    const v8, -0x1ce42ce3

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a7b\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x19

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1643

    const v8, 0x57205f8d

    xor-int/2addr v7, v8

    const v8, -0xa1e5345

    goto/16 :goto_0

    .line 695
    :sswitch_f
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v6

    if-eqz v6, :cond_c

    :cond_b
    const-string v6, "\u06eb\u06db"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5aa1

    const v8, -0x16c8948d

    xor-int/2addr v7, v8

    const v8, -0x58f8ffd8

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5419

    const v8, -0x41a715d0

    xor-int/2addr v7, v8

    const v8, 0x2c6b9c0e

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v6, :cond_d

    :goto_4
    const-string v6, "\u073f\u06d7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4297

    const v8, -0x7e0953a6

    xor-int/2addr v7, v8

    const v8, 0x134504c4

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e8\u06d7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7ddf

    const v8, -0x3550a93c    # -5745506.0f

    xor-int/2addr v7, v8

    const v8, 0x53ac4f77

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76ea0801 -> :sswitch_5
        -0x61a14fad -> :sswitch_e
        -0x5be7b436 -> :sswitch_3
        -0x5adc3c2b -> :sswitch_d
        -0x59911e35 -> :sswitch_d
        -0x56281be4 -> :sswitch_6
        -0x4faed9b1 -> :sswitch_7
        -0x46c119ef -> :sswitch_6
        -0x45914b76 -> :sswitch_a
        -0x2f31a44b -> :sswitch_e
        -0x2b714021 -> :sswitch_2
        -0x253f1598 -> :sswitch_4
        -0x252e87a9 -> :sswitch_4
        -0x228d3b8c -> :sswitch_3
        -0x1dbd40fe -> :sswitch_b
        -0x15ea79ee -> :sswitch_c
        -0x5d48750 -> :sswitch_8
        -0x5b1227b -> :sswitch_9
        0xc96255 -> :sswitch_10
        0x29b4778 -> :sswitch_b
        0x34d8673 -> :sswitch_10
        0x23c05b6f -> :sswitch_8
        0x249e6a5f -> :sswitch_0
        0x2da63e31 -> :sswitch_a
        0x35cfdb27 -> :sswitch_1
        0x45da997d -> :sswitch_9
        0x48392718 -> :sswitch_f
        0x4b47d099 -> :sswitch_f
        0x5564b000 -> :sswitch_5
        0x5b12ba96 -> :sswitch_c
        0x68f2429d -> :sswitch_7
        0x6dca602d -> :sswitch_0
        0x7e0e5b68 -> :sswitch_2
        0x7e7d294d -> :sswitch_1
    .end sparse-switch
.end method
