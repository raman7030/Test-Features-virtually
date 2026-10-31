.class public final Ll/ۚ֡᩷;
.super Ljava/lang/Object;
.source "77A2"


# static fields
.field private static final ܿ᩶᩵:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚ֡᩷;->ܿ᩶᩵:[S

    return-void

    :array_0
    .array-data 2
        0x1208s
        0x3af1s
        0x3af1s
        0x3ae3s
        0x3ae4s
        0x3af4s
        0x430as
        0x46c8s
        0x4e10s
    .end array-data
.end method

.method public static ֫()V
    .locals 23

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x71c9247c

    sget v18, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v19, Ll/ۘܿ;->ۘܰ۫:I

    const-string v20, "\u05a8\u0730"

    invoke-static/range {v20 .. v20}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    xor-int v0, v20, v18

    mul-int/lit16 v0, v0, -0x5b5f

    const v22, -0x9e5e60b

    xor-int v0, v0, v22

    const v22, 0x57f30a6

    xor-int v20, v20, v22

    move-object v3, v2

    move-object v6, v5

    move-object v15, v14

    move-object/from16 v10, v16

    move/from16 v21, v20

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v20, -0x71c9247c

    const/16 v22, 0x0

    :goto_0
    xor-int v12, v20, v18

    mul-int/lit16 v12, v12, 0x6507

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v0, v12

    xor-int v20, v21, v0

    sparse-switch v20, :sswitch_data_0

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    return-void

    .line 31
    :sswitch_0
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-lez v0, :cond_5

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_d

    goto/16 :goto_4

    .line 22
    :sswitch_2
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_b

    goto/16 :goto_4

    .line 33
    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_4

    :sswitch_4
    const v0, 0x7eca09bc

    xor-int/2addr v0, v9

    .line 21
    invoke-static {v0}, Ll/֨֫;->ۚ۬᩷(I)V

    goto/16 :goto_2

    :sswitch_5
    const/4 v0, 0x6

    const/4 v9, 0x3

    .line 20
    invoke-static {v10, v0, v9, v14}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "\u073d\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x7659

    const v21, -0x1f541281

    xor-int v12, v12, v21

    const v21, -0x56a6ad0b

    goto/16 :goto_7

    :sswitch_6
    invoke-interface {v6, v8, v3}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-static {v0}, Ll/֫ܺ;->ۚ۬᩻(Ljava/lang/Object;)V

    sget-object v10, Ll/ۚ֡᩷;->ܿ᩶᩵:[S

    .line 15
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "\u06da\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x323b

    const v21, -0x6e962bec

    xor-int v12, v12, v21

    const v21, 0x627d78a

    goto/16 :goto_7

    :sswitch_7
    add-int v0, v4, v7

    .line 35
    invoke-static {v0, v5}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v8

    .line 29
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x6b

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0xa5

    const v21, -0x3fd7f217

    xor-int v12, v12, v21

    const v21, 0x35038c28

    goto/16 :goto_7

    .line 20
    :sswitch_8
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-static {v0}, Ll/֫ܿ;->ܽ᩶ܿ(Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v6

    const/4 v7, 0x1

    .line 24
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    const-string v0, "\u06e7\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x46cf

    const v21, -0x73680c84

    xor-int v12, v12, v21

    const v21, 0x24ff265b

    goto/16 :goto_7

    :cond_3
    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x6b

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x3687

    const v21, 0x4f5c629a

    xor-int v12, v12, v21

    const v21, -0x45519674

    goto/16 :goto_7

    :sswitch_9
    return-void

    :sswitch_a
    const/4 v0, 0x5

    .line 15
    invoke-static {v15, v11, v0, v14}, Ll/ۘᩴ;->ۤ֨ۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x3

    if-ge v4, v5, :cond_4

    const-string v0, "\u06d9\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x70fb

    const v21, -0x106df6b9

    xor-int v12, v12, v21

    const v21, 0x2c9eca23

    goto/16 :goto_7

    :cond_4
    :goto_2
    const-string v0, "\u0733\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x77

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x10a1

    const v21, -0x6928b50b

    xor-int v12, v12, v21

    const v21, 0x25afb239

    goto/16 :goto_7

    :sswitch_b
    const/4 v11, 0x1

    .line 20
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v0

    if-ltz v0, :cond_6

    :cond_5
    const-string v0, "\u1a75\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, 0x56ed

    const v21, -0x1a9e44bc

    xor-int v12, v12, v21

    const v21, -0x7965c8b9

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u05ab\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x7cad

    const v21, 0x5e027f4d

    xor-int v12, v12, v21

    const v21, 0x3c8d02bb

    goto/16 :goto_7

    .line 15
    :sswitch_c
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v2, 0x0

    sget-object v15, Ll/ۚ֡᩷;->ܿ᩶᩵:[S

    .line 31
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06dc\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x7f

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x2dd

    const v21, -0x45155d02

    xor-int v12, v12, v21

    const v21, -0x7d92fc93

    goto/16 :goto_7

    :sswitch_d
    const/16 v0, 0x227e

    const/16 v14, 0x227e

    goto :goto_3

    :sswitch_e
    const/16 v0, 0x3a97

    const/16 v14, 0x3a97

    :goto_3
    const-string v0, "\u1a78\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, 0x28ff

    const v21, -0x7ea5fb59

    xor-int v12, v12, v21

    const v21, -0x388957b6

    goto/16 :goto_7

    :sswitch_f
    add-int v0, v13, v13

    sub-int v0, v22, v0

    if-gtz v0, :cond_8

    const-string v0, "\u073a\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x774d

    const v21, -0x18c8436a

    xor-int v12, v12, v21

    const v21, 0x54bc6263

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u1a77\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, 0x7cb5

    const v21, -0x77e3a343

    xor-int v12, v12, v21

    const v21, 0x6c3e79d2

    goto/16 :goto_7

    :sswitch_10
    mul-int v0, v17, v17

    const v12, 0xa5b7204

    add-int v13, v0, v12

    .line 25
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06df\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x3b

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, 0x7f61

    const v21, -0x279ff001

    xor-int v12, v12, v21

    const v21, 0x29ad3ef7

    goto/16 :goto_7

    :sswitch_11
    add-int v0, v17, v16

    mul-int v22, v0, v0

    .line 29
    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_a

    :goto_4
    const-string v0, "\u06e1\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x62e7

    const v21, 0xcf163cc

    xor-int v12, v12, v21

    const v21, 0xd123d39

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06e0\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x74fd

    const v21, -0x762a3d57

    xor-int v12, v12, v21

    const v21, 0x4710b3b5

    goto :goto_7

    :sswitch_12
    const/16 v16, 0x337e

    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_c

    :cond_b
    :goto_5
    const-string v0, "\u05ab\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x1b

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x743

    const v21, -0x12a9ae47

    xor-int v12, v12, v21

    const v21, 0x125a94d1

    goto :goto_7

    :cond_c
    const-string v0, "\u06dc\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x11

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x5a1f

    const v21, 0x1c9a2c7c

    xor-int v12, v12, v21

    const v21, -0x63d1ea7

    goto :goto_7

    :sswitch_13
    sget-object v0, Ll/ۚ֡᩷;->ܿ᩶᩵:[S

    const/4 v12, 0x0

    aget-short v17, v0, v12

    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_e

    :cond_d
    :goto_6
    const-string v0, "\u06ec\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, 0x9

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x41b9

    const v21, -0x3cf3d7bd

    xor-int v12, v12, v21

    const v21, 0x7601dea4

    goto :goto_7

    :cond_e
    const-string v0, "\u1a74\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x2b

    xor-int v12, v0, v18

    mul-int/lit16 v12, v12, -0x35f7

    const v21, 0x47cccf11

    xor-int v12, v12, v21

    const v21, 0x60595eff

    :goto_7
    xor-int v21, v0, v21

    move v0, v12

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7df81bc1 -> :sswitch_0
        -0x72db680a -> :sswitch_13
        -0x7083d97a -> :sswitch_9
        -0x704f98ed -> :sswitch_7
        -0x67f98ae5 -> :sswitch_12
        -0x5fc4b9e0 -> :sswitch_e
        -0x5cc59b3c -> :sswitch_5
        -0x5b3aff7f -> :sswitch_8
        -0x599939b6 -> :sswitch_9
        -0x53d429d7 -> :sswitch_e
        -0x53d02dae -> :sswitch_d
        -0x4c68623e -> :sswitch_10
        -0x4b2926b3 -> :sswitch_a
        -0x42d5f6f4 -> :sswitch_2
        -0x34902971 -> :sswitch_6
        -0x337e1bf1 -> :sswitch_b
        -0x2f87c3e9 -> :sswitch_0
        -0x25fa693f -> :sswitch_4
        -0x1b99aca5 -> :sswitch_d
        -0x17b61e3f -> :sswitch_a
        -0x1187e0f0 -> :sswitch_3
        -0xd5f32d9 -> :sswitch_5
        -0x29ccdd8 -> :sswitch_6
        0x419504d -> :sswitch_8
        0x8c46498 -> :sswitch_10
        0xec21df5 -> :sswitch_1
        0x20451bae -> :sswitch_c
        0x2102b9f3 -> :sswitch_4
        0x279b5611 -> :sswitch_3
        0x2a8e3ede -> :sswitch_13
        0x34da426c -> :sswitch_2
        0x3ac5dfbc -> :sswitch_11
        0x3cf6d185 -> :sswitch_f
        0x3ffd7642 -> :sswitch_1
        0x4482e1e5 -> :sswitch_f
        0x5165265d -> :sswitch_11
        0x5b1f8206 -> :sswitch_7
        0x7391e1fe -> :sswitch_c
        0x7529cb9f -> :sswitch_b
        0x7969e00f -> :sswitch_12
    .end sparse-switch
.end method
