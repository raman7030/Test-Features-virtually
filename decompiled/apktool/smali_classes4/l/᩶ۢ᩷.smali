.class public final Ll/᩶ۢ᩷;
.super Ljava/lang/Object;
.source "G40W"


# static fields
.field public static final ֫:Ll/ۧ֫֡;

.field private static final ۤ᩹۫:[S


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩶ۢ᩷;->ۤ᩹۫:[S

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x393ed60d

    sget v12, Ll/᩺;->ۙۛܶ:I

    sget v13, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v14, "\u0730\u05a1"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2e3b

    const v16, -0x464124d4

    xor-int v15, v15, v16

    const v16, -0x49395216

    xor-int v14, v14, v16

    :goto_0
    const/16 v16, 0x0

    move-object/from16 v19, v16

    move/from16 v16, v6

    move-object/from16 v6, v19

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x495d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 30
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_0
    const/16 v10, 0x3cb5

    move/from16 v18, v7

    move/from16 v17, v11

    goto/16 :goto_5

    .line 26
    :sswitch_1
    new-instance v6, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ܽ()Ljava/io/File;

    move-result-object v14

    .line 27
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v15

    if-eqz v15, :cond_0

    move/from16 v18, v7

    move/from16 v17, v11

    goto/16 :goto_9

    .line 26
    :cond_0
    sget-object v15, Ll/᩶ۢ᩷;->ۤ᩹۫:[S

    sget v17, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v17, :cond_1

    move/from16 v17, v11

    goto :goto_2

    :cond_1
    move/from16 v17, v11

    const/4 v11, 0x1

    sget v18, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v18, :cond_2

    :goto_2
    move/from16 v18, v7

    goto :goto_3

    :cond_2
    move/from16 v18, v7

    const/4 v7, 0x7

    invoke-static {v15, v11, v7, v10}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v11

    if-gtz v11, :cond_3

    :goto_3
    goto :goto_4

    :cond_3
    invoke-direct {v6, v14, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 30
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v7

    if-gtz v7, :cond_4

    goto/16 :goto_a

    :cond_4
    const-string v7, "\u06e0\u0730"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v12, v7

    mul-int/lit8 v7, v7, 0x4d

    xor-int v11, v7, v13

    mul-int/lit16 v11, v11, 0x3ee7

    const v14, -0x258b1456

    xor-int/2addr v11, v14

    const v14, -0x7e8605ae

    goto/16 :goto_8

    :sswitch_2
    move/from16 v18, v7

    move/from16 v17, v11

    mul-int v7, v5, v9

    sub-int v7, v8, v7

    if-ltz v7, :cond_5

    const-string v7, "\u06d8\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    mul-int/lit8 v7, v7, 0xb

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x3f91

    const v14, -0xc84d986

    xor-int/2addr v11, v14

    const v14, 0x7861caff

    goto/16 :goto_8

    :cond_5
    const-string v7, "\u06eb\u06d9"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v12

    mul-int/lit8 v7, v7, 0x15

    xor-int v11, v7, v13

    mul-int/lit16 v11, v11, 0x62b3

    const v14, -0x777d12b5

    xor-int/2addr v11, v14

    const v14, 0x1a7e6c01

    goto/16 :goto_8

    :sswitch_3
    move/from16 v18, v7

    move/from16 v17, v11

    .line 26
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto/16 :goto_7

    :sswitch_4
    move/from16 v18, v7

    move/from16 v17, v11

    .line 30
    aget-short v5, v3, v4

    .line 29
    sget-boolean v7, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v7, :cond_6

    :goto_4
    move/from16 v6, v16

    move/from16 v7, v18

    goto :goto_6

    :cond_6
    const-string v7, "\u06d7\u1a73"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    mul-int/lit8 v7, v7, 0x5d

    xor-int v11, v7, v13

    mul-int/lit16 v11, v11, -0xde1

    const v14, -0x47d249ef

    xor-int/2addr v11, v14

    const v14, -0x66684ac8

    goto/16 :goto_8

    :sswitch_5
    move/from16 v18, v7

    move/from16 v17, v11

    const/16 v7, 0x513

    const/16 v10, 0x513

    :goto_5
    const-string v7, "\u073d\u06e8"

    .line 30
    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    mul-int/lit8 v7, v7, -0x67

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, -0xc77

    const v14, -0x50f5ad9b

    xor-int/2addr v11, v14

    const v14, 0x5cbc6a9e

    goto/16 :goto_8

    :sswitch_6
    move/from16 v17, v11

    mul-int v7, v5, v5

    const v11, 0x403009

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v14

    if-ltz v14, :cond_7

    move v6, v7

    const v7, 0x403009

    :goto_6
    const-string v11, "\u06e7\u0736"

    .line 29
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v12

    xor-int v14, v11, v13

    mul-int/lit16 v14, v14, -0xd19

    const v15, -0x1b0d6348

    xor-int/2addr v15, v14

    const v14, -0x2ab5e79d

    xor-int/2addr v14, v11

    move/from16 v11, v17

    goto/16 :goto_0

    :cond_7
    const-string v14, "\u0733\u1a74"

    .line 30
    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x354d

    const v16, -0x5268b00

    xor-int v15, v15, v16

    const v16, -0x5de99ad8

    move/from16 v16, v7

    move v7, v14

    move v11, v15

    const v14, -0x5de99ad8

    const v18, 0x403009

    goto/16 :goto_8

    :sswitch_7
    const v3, 0x150eb72

    .line 26
    invoke-static {v6, v3, v0, v1, v2}, Ll/ۧ֫֡;->֫(Ljava/io/File;IIJ)Ll/ۧ֫֡;

    move-result-object v0

    sput-object v0, Ll/᩶ۢ᩷;->֫:Ll/ۧ֫֡;

    return-void

    :sswitch_8
    move/from16 v18, v7

    move/from16 v17, v11

    const-wide/32 v1, 0x1f00000

    .line 30
    sget v7, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v7, :cond_8

    goto/16 :goto_a

    :cond_8
    const-string v7, "\u06ec\u06d9"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    mul-int/lit8 v7, v7, 0x7f

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x266d

    const v14, -0x203b21ca

    xor-int/2addr v11, v14

    const v14, 0x5394acd1

    goto/16 :goto_b

    :sswitch_9
    move/from16 v18, v7

    move/from16 v17, v11

    .line 29
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v7, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v7, :cond_c

    goto :goto_7

    :sswitch_a
    move/from16 v18, v7

    move/from16 v17, v11

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v7

    if-gtz v7, :cond_9

    :goto_7
    const-string v7, "\u06da\u06e7"

    .line 26
    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v12

    mul-int/lit8 v7, v7, 0x35

    xor-int v11, v7, v13

    mul-int/lit16 v11, v11, 0x6d45

    const v14, -0x4c5b8dfd

    xor-int/2addr v11, v14

    const v14, 0x4a31cc07    # 2913025.8f

    goto/16 :goto_b

    :sswitch_b
    move/from16 v18, v7

    move/from16 v17, v11

    add-int v8, v16, v18

    const/16 v9, 0x1006

    .line 28
    sget v7, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v7, :cond_a

    :cond_9
    const-string v7, "\u1a77\u1a77"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v13, v7

    mul-int/lit8 v7, v7, -0x6d

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x2211

    const v14, -0x2fb0c02

    xor-int/2addr v11, v14

    const v14, 0x1efd2d8e

    goto :goto_8

    :cond_a
    const-string v7, "\u1a7b\u073f"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v13, v7

    mul-int/lit8 v7, v7, -0x11

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x548f

    const v14, 0x6e108c8e

    xor-int/2addr v11, v14

    const v14, -0x2771e65a

    goto :goto_8

    :sswitch_c
    move/from16 v18, v7

    move/from16 v17, v11

    .line 29
    sget-object v3, Ll/᩶ۢ᩷;->ۤ᩹۫:[S

    const/4 v4, 0x0

    sget v7, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v7, :cond_b

    goto :goto_a

    :cond_b
    const-string v7, "\u06ec\u1a77"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    mul-int/lit8 v7, v7, 0x49

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x6e73

    const v14, -0x167ca89c

    xor-int/2addr v11, v14

    const v14, -0x49d98717

    :goto_8
    xor-int/2addr v7, v14

    move v14, v7

    move v15, v11

    move/from16 v7, v18

    move/from16 v11, v17

    goto/16 :goto_1

    :sswitch_d
    move/from16 v18, v7

    move/from16 v17, v11

    .line 30
    sget v7, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v7, :cond_d

    :cond_c
    :goto_9
    const-string v6, "\u05a8\u073d"

    .line 27
    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v12

    mul-int/lit8 v6, v6, -0x7d

    xor-int v7, v6, v13

    mul-int/lit16 v7, v7, -0x5783

    const v11, -0x104281f

    xor-int v15, v7, v11

    const v7, 0x4d5bcd4f    # 2.30479088E8f

    xor-int v14, v6, v7

    move/from16 v6, v16

    move/from16 v11, v17

    move/from16 v7, v18

    goto/16 :goto_0

    :cond_d
    :goto_a
    const-string v7, "\u0733\u06d9"

    .line 29
    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v11, v7, v12

    mul-int/lit16 v11, v11, 0x3f65

    const v14, -0x62741582

    xor-int/2addr v11, v14

    const v14, -0x4c50f67a

    :goto_b
    move v15, v11

    xor-int/2addr v14, v7

    move/from16 v11, v17

    move/from16 v7, v18

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fee7ebf -> :sswitch_d
        -0x6ba1b34b -> :sswitch_c
        -0x680a6596 -> :sswitch_b
        -0x6784d793 -> :sswitch_c
        -0x62ed718a -> :sswitch_a
        -0x4cacf17d -> :sswitch_9
        -0x4b80cb9b -> :sswitch_8
        -0x408210b2 -> :sswitch_b
        -0x3f04d974 -> :sswitch_7
        -0x3cac3d7f -> :sswitch_6
        -0x35d9ac5a -> :sswitch_5
        -0x1f563c51 -> :sswitch_d
        -0x1dd7df34 -> :sswitch_4
        -0x1d684ed9 -> :sswitch_3
        -0x80e2ea6 -> :sswitch_4
        0x438f22c -> :sswitch_9
        0xa5c34fb -> :sswitch_6
        0xe95fd77 -> :sswitch_a
        0x14e78ae8 -> :sswitch_8
        0x2f931545 -> :sswitch_2
        0x3d2d64a8 -> :sswitch_2
        0x4e6140e0 -> :sswitch_3
        0x50a745c8 -> :sswitch_1
        0x5cac2f66 -> :sswitch_0
        0x63b43c34 -> :sswitch_7
        0x6d02a36b -> :sswitch_1
        0x71cfd404 -> :sswitch_5
        0x7a46c24c -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x21a0s
        0x3cffs
        0x3cf1s
        0x3cf6s
        0x3cd4s
        0x3cd6s
        0x3cdds
        0x3cd0s
    .end array-data
.end method

.method public static bridge synthetic ֫()Ll/ۧ֫֡;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶ۢ᩷;->֫:Ll/ۧ֫֡;

    return-object v0
.end method
