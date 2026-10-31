.class public final Ll/ۨ᩵ۡ;
.super Ljava/lang/Object;
.source "51RP"


# static fields
.field public static final ֫:Ll/ܿ۠᩵;

.field public static final ۧ:Ll/ܿ۠᩵;

.field private static final ۧ᩸ܶ:[S


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x77

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x4e51843c

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    sget v5, Ll/֨᩺;->ۨ֨۬:I

    const-string v6, "\u1a7b\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x967

    const v8, 0x4ec96124

    xor-int/2addr v7, v8

    const v8, 0x2dcda163

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x2ca3

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 38
    sget v6, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v6, :cond_c

    goto/16 :goto_4

    .line 37
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, "\u1a75\u06dc"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x194d

    const v8, -0x4be4a44d

    xor-int/2addr v7, v8

    const v8, -0x590e496f

    goto :goto_0

    .line 36
    :sswitch_1
    sget v6, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u06e7\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1eff

    const v8, 0x51d8d06

    xor-int/2addr v7, v8

    const v8, -0x7765c0cc

    goto :goto_0

    .line 39
    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_2

    .line 38
    :sswitch_3
    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v6, :cond_b

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_9

    goto :goto_2

    .line 35
    :sswitch_5
    sput-object v1, Ll/ۨ᩵ۡ;->֫:Ll/ܿ۠᩵;

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v6

    if-ltz v6, :cond_2

    goto :goto_1

    :cond_2
    const-string v6, "\u0730\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x526b

    const v8, -0x5a29da8a

    xor-int/2addr v7, v8

    const v8, -0x3373f6ef    # -7.3418888E7f

    goto :goto_0

    :sswitch_6
    invoke-static {v0}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v1

    .line 39
    sget-boolean v6, Ll/֨۫;->۬᩷᩶:Z

    if-nez v6, :cond_3

    :goto_1
    const-string v6, "\u06e7\u05a8"

    .line 37
    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb8d

    const v8, -0x22e63b85

    xor-int/2addr v7, v8

    const v8, 0x626e6dc2

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06d8\u073d"

    .line 39
    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x11ef

    const v8, 0x114007bb

    xor-int/2addr v7, v8

    const v8, 0x61d9be45

    goto/16 :goto_0

    .line 38
    :sswitch_7
    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u06e2\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1a8f

    const v8, 0x702ca091

    xor-int/2addr v7, v8

    const v8, 0x685aa716

    goto/16 :goto_0

    .line 39
    :sswitch_8
    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v6, :cond_7

    :goto_2
    const-string v6, "\u06ec\u0730"

    .line 38
    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4e99

    const v8, 0x37c6d809

    xor-int/2addr v7, v8

    const v8, -0x6b07b8f1

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v6, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u06eb\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2897

    const v8, -0x429a40be

    xor-int/2addr v7, v8

    const v8, 0x1dae15d5    # 4.607999E-21f

    goto/16 :goto_0

    .line 39
    :sswitch_a
    new-instance v2, Ll/ᩴ᩵ۡ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 36
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v6, "\u1a78\u0736"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x441

    const v8, -0x32d12613

    xor-int/2addr v7, v8

    const v8, -0x4ed27cef

    goto/16 :goto_0

    .line 35
    :sswitch_b
    new-instance v0, Ll/ۘ᩵ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget v6, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v6, :cond_8

    :cond_7
    :goto_3
    const-string v6, "\u06e0\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x68ff

    const v8, -0x2e07df56

    xor-int/2addr v7, v8

    const v8, 0x1dae1212

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a79\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7ba7

    const v8, 0x72d5939a

    xor-int/2addr v7, v8

    const v8, -0x3dac4253

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v2}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v0

    sput-object v0, Ll/ۨ᩵ۡ;->ۧ:Ll/ܿ۠᩵;

    return-void

    .line 37
    :sswitch_d
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_e
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v6

    if-ltz v6, :cond_a

    :cond_9
    const-string v6, "\u06d8\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3287

    const v8, 0x315c0df4

    xor-int/2addr v7, v8

    const v8, 0x39c37b99

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a75\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3cad

    const v8, 0x447eec2f

    xor-int/2addr v7, v8

    const v8, 0x35c21589

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v6, "\u06d6\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4f7b

    const v8, 0x43fd7028

    xor-int/2addr v7, v8

    const v8, 0x46facd29

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073a\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2675

    const v8, 0x4f6dfa9d

    xor-int/2addr v7, v8

    const v8, 0xd6babeb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7068a918 -> :sswitch_e
        -0x6e39886e -> :sswitch_d
        -0x6b8f202d -> :sswitch_c
        -0x68a40ae0 -> :sswitch_b
        -0x5abe8361 -> :sswitch_a
        -0x59c1434d -> :sswitch_9
        -0x55c31c0b -> :sswitch_8
        -0x4ffb3734 -> :sswitch_7
        -0x478d0f45 -> :sswitch_d
        -0x368685e6 -> :sswitch_6
        -0x34afeb31 -> :sswitch_6
        -0x2b32c1f8 -> :sswitch_5
        -0x288512b5 -> :sswitch_4
        -0x28108d7d -> :sswitch_3
        -0x2272cb94 -> :sswitch_2
        -0x1dbb7552 -> :sswitch_1
        -0xebb8fe9 -> :sswitch_9
        -0x7c3eedc -> :sswitch_5
        -0x66d4135 -> :sswitch_a
        0xcd2061b -> :sswitch_0
        0xcd57db5 -> :sswitch_8
        0x13e6d6be -> :sswitch_7
        0x164c6309 -> :sswitch_b
        0x239f884d -> :sswitch_0
        0x600b53a8 -> :sswitch_c
        0x687f5e88 -> :sswitch_e
        0x73febb37 -> :sswitch_4
        0x760b80b9 -> :sswitch_1
        0x7a0979c4 -> :sswitch_3
        0x7cb50194 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 2
        0x96cs
        0x6ea9s
        0x6eabs
        0x6ebas
        0x6e98s
        0x6eafs
        0x6ea2s
        0x6ebbs
        0x6eabs
        0x6ee6s
        0x6ee0s
        0x6ee0s
        0x6ee0s
        0x6ee7s
        0x1ca3s
        0x60bs
        0x609s
        0x61es
        0x603s
        0x61cs
        0x603s
        0x61es
        0x613s
        0xefes
        -0x6129s
        -0x6136s
        -0x6129s
        -0x613bs
        -0x612cs
        -0x6133s
        -0x6105s
        -0x612fs
        -0x6129s
        -0x613fs
        -0x612as
        -0x6133s
        -0x6136s
        -0x613es
        -0x6135s
        -0x6140s
        -0x6133s
        -0x613bs
        -0x6136s
        -0x6140s
        -0x6133s
        -0x6105s
        -0x612ds
        -0x6124s
        -0x6105s
        -0x6138s
        -0x6135s
        -0x613ds
        -0x6133s
        -0x6136s
        -0x613ds
        -0x613fs
        -0x6130s
        -0x610es
        -0x613bs
        -0x6138s
        -0x612fs
        -0x613fs
        -0x6174s
        -0x6176s
        -0x6176s
        -0x6176s
        -0x6173s
        0x1d06s
        0x1dc4s
        0x1dc6s
        0x1dd1s
        0x1dccs
        0x1dd3s
        0x1dccs
        0x1dd1s
        0x1ddcs
        0x1dd6s
        0x1dcbs
        0x1dd6s
        0x1dc4s
        0x1dd5s
        0x1dccs
        0x1dfas
        0x1dd0s
        0x1dd6s
        0x1dc0s
        0x1dd7s
        0x1dccs
        0x1dcbs
        0x1dc3s
        0x1dcas
        0x1dc1s
        0x1dccs
        0x1dc4s
        0x1dcbs
        0x1dc1s
        0x1dccs
        0x1dfas
        0x1dd2s
        0x1ddds
        0x1dfas
        0x1dc9s
        0x1dcas
        0x1dc2s
        0x1dccs
        0x1dcbs
        0x1dc2s
        0x1dc0s
        0x1dd1s
        0x1df3s
        0x1dc4s
        0x1dc9s
        0x1dd0s
        0x1dc0s
        0x1d8ds
        0x1d8bs
        0x1d8bs
        0x1d8bs
        0x1d8cs
    .end array-data
.end method

.method public static ֫()Ll/ᩴ᩹ۘ;
    .locals 19

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

    const v13, -0x326e7b53    # -3.0517392E8f

    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    const-string v16, "\u0736\u0733"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v15

    mul-int/lit8 v16, v16, 0x6b

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x7173

    const v18, 0x20ff5415

    xor-int v0, v0, v18

    const v18, 0x552ef487

    xor-int v16, v16, v18

    move-object/from16 v18, v2

    move-object v12, v11

    move/from16 v17, v16

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, -0x326e7b53    # -3.0517392E8f

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v3, v16, v14

    mul-int/lit16 v3, v3, 0xce1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_3

    .line 38
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_c

    goto/16 :goto_4

    .line 35
    :sswitch_1
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_1

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    invoke-static {v1, v2}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Ll/ᩴ᩹ۘ;

    return-object v1

    :sswitch_5
    const/16 v0, 0xd

    invoke-static {v12, v13, v0, v11}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u06ec\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x1457

    const v17, 0x58ba6587

    xor-int v3, v3, v17

    const v17, 0x41445b7e

    goto/16 :goto_5

    :sswitch_6
    const/4 v13, 0x1

    .line 38
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_2

    :cond_1
    const-string v0, "\u06e0\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0xb

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x25b

    const v17, 0x6c84a673

    xor-int v3, v3, v17

    const v17, 0x4f159f3c

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u06e7\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7f

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0xded

    const v17, -0x738e656b

    xor-int v3, v3, v17

    const v17, 0x50950da8    # 2.00056013E10f

    goto/16 :goto_5

    .line 35
    :sswitch_7
    sget-object v12, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v0, "\u0736\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0xe4d

    const v17, 0x1546336

    xor-int v3, v3, v17

    const v17, -0x3e017c2

    goto/16 :goto_5

    :sswitch_8
    sget-object v0, Ll/ۨ᩵ۡ;->֫:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "\u1a78\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x25

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x5de9

    const v17, -0x23b187ae

    xor-int v3, v3, v17

    const v17, -0x786e4f5a    # -2.1921E-34f

    goto/16 :goto_5

    :sswitch_9
    const/16 v0, 0x59ca

    const/16 v11, 0x59ca

    goto :goto_1

    :sswitch_a
    const/16 v0, 0x6ece

    const/16 v11, 0x6ece

    :goto_1
    const-string v0, "\u05a8\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x22db

    const v17, 0x4fdfdfc5

    xor-int v3, v3, v17

    const v17, -0x282a3f20

    goto/16 :goto_5

    :sswitch_b
    mul-int v0, v10, v10

    sub-int/2addr v0, v8

    if-lez v0, :cond_5

    const-string v0, "\u06df\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x3b1d

    const v17, -0x75db2ab7

    xor-int v3, v3, v17

    const v17, -0x551df6aa

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06eb\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x1db3

    const v17, 0x7b1371cf

    xor-int v3, v3, v17

    const v17, -0x64d3544e

    goto/16 :goto_5

    :sswitch_c
    add-int v10, v5, v9

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u1a79\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x7b

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x2405

    const v17, -0x12f12ba2

    xor-int v3, v3, v17

    const v17, 0x5a8f07ca

    goto/16 :goto_5

    :sswitch_d
    add-int v8, v7, v7

    const/16 v9, 0x1220

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_7

    goto :goto_2

    :cond_7
    const-string v0, "\u1a7a\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x6d

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x3c5

    const v17, 0x4fa101d7

    xor-int v3, v3, v17

    const v17, 0x3e34fc6d

    goto/16 :goto_5

    :sswitch_e
    const v0, 0x1488400

    add-int v7, v6, v0

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_8

    :goto_2
    const-string v0, "\u06d8\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x77

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x3e8f

    const v17, 0x1d866298

    xor-int v3, v3, v17

    const v17, -0x16cbb68b

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u0730\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x1d6f

    const v17, -0x2ea6a33a

    xor-int v3, v3, v17

    const v17, -0x223bf5a8

    goto/16 :goto_5

    :sswitch_f
    mul-int v6, v5, v5

    .line 38
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_9

    :goto_3
    const-string v0, "\u05a1\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x35

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x5c01

    const v17, -0x68e9f538

    xor-int v3, v3, v17

    const v17, 0x704d4030

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u1a74\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x6f

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x4a73

    const v17, -0x4cfbaca8

    xor-int v3, v3, v17

    const v17, 0x1820bbb1

    goto :goto_5

    :sswitch_10
    aget-short v5, v18, v4

    .line 39
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v0

    if-ltz v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x6f

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x1f25

    const v17, 0x25805b02

    xor-int v3, v3, v17

    const v17, 0x3ecdec8d

    goto :goto_5

    :cond_b
    const-string v0, "\u06e1\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x557

    const v17, -0x52ff3fd3

    xor-int v3, v3, v17

    const v17, -0x18f5e139

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/4 v4, 0x0

    .line 36
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_d

    :cond_c
    const-string v0, "\u06e0\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x50e1

    const v17, 0x7148f8cd

    xor-int v3, v3, v17

    const v17, 0x1608021

    goto :goto_5

    :cond_d
    const-string v0, "\u1a78\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x3b

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x4439

    const v17, -0x2c3c11f7

    xor-int v3, v3, v17

    const v17, 0x328f2f0d

    :goto_5
    xor-int v17, v0, v17

    move v0, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73a6f389 -> :sswitch_9
        -0x70da1ae8 -> :sswitch_11
        -0x678b2065 -> :sswitch_9
        -0x500c54a7 -> :sswitch_5
        -0x4d381fd2 -> :sswitch_2
        -0x4a6ec555 -> :sswitch_a
        -0x3fddf9d6 -> :sswitch_b
        -0x3e4ee3e8 -> :sswitch_f
        -0x2dd0490d -> :sswitch_e
        -0x255b2f78 -> :sswitch_6
        -0x24f2faa1 -> :sswitch_c
        -0x22e85ae7 -> :sswitch_3
        -0x1123eef2 -> :sswitch_d
        -0xf936ff9 -> :sswitch_2
        -0xe9157e6 -> :sswitch_8
        -0xcd22bf9 -> :sswitch_0
        -0xc8671eb -> :sswitch_d
        -0x997f904 -> :sswitch_10
        0x307d5e6 -> :sswitch_b
        0x69d9d89 -> :sswitch_4
        0x14ec229b -> :sswitch_8
        0x1771e925 -> :sswitch_0
        0x193aebfe -> :sswitch_6
        0x2eb93977 -> :sswitch_e
        0x2fdd3dd6 -> :sswitch_1
        0x37695838 -> :sswitch_3
        0x3a520712 -> :sswitch_7
        0x3df7e51c -> :sswitch_10
        0x46470d35 -> :sswitch_7
        0x49555c24 -> :sswitch_f
        0x520ba64c -> :sswitch_1
        0x60ffd336 -> :sswitch_5
        0x6208dd21 -> :sswitch_a
        0x65c87fb8 -> :sswitch_11
        0x67ff58cb -> :sswitch_4
        0x6d0c97b2 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/᩵֡ۡ;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, 0x78981694

    sget v14, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v15, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v16, "\u06dc\u06e7"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v1, v16, v15

    mul-int/lit16 v1, v1, 0x1ecb

    const v18, 0x4438c27a

    xor-int v1, v1, v18

    const v18, 0x5630b4f2

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v11, v10

    move/from16 v17, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x78981694

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v15

    mul-int/lit16 v4, v4, 0x28ef

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    invoke-static {v11, v12, v13, v10}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 61
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_6

    .line 79
    :sswitch_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_d

    goto/16 :goto_2

    .line 143
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_2

    .line 88
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_3

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto/16 :goto_4

    .line 67
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    .line 112
    :sswitch_5
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ᩹ۘ;->ۧ()V

    goto :goto_1

    .line 167
    :sswitch_6
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object v1

    invoke-virtual {v1, v0, v3}, Ll/ᩴ᩹ۘ;->֫(Ll/ۗܺ᩷;Ll/ۘ᩹ۘ;)V

    return-void

    .line 114
    :sswitch_7
    new-instance v3, Ll/ۛ᩵ۡ;

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v1}, Ll/ۛ᩵ۡ;-><init>(Ll/ۗܺ᩷;Ll/᩵֡ۡ;)V

    .line 166
    invoke-virtual {v0, v3}, Ll/ۗܺ᩷;->֫(Ll/ۘ᩹ۘ;)V

    .line 63
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06d8\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v14, v4

    mul-int/lit8 v4, v4, 0x6f

    xor-int v1, v4, v15

    mul-int/lit16 v1, v1, -0x6a75

    const v17, 0x9c539cd

    xor-int v1, v1, v17

    const v17, -0x20219e7a

    xor-int v17, v4, v17

    goto :goto_0

    .line 5
    :sswitch_8
    invoke-static {v0, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ᩹ۘ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u06eb\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x671d

    const v17, 0x5c0728d9

    xor-int v4, v4, v17

    const v17, -0x26fac0fd

    goto/16 :goto_7

    :cond_1
    :goto_1
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x3131

    const v17, 0x560f7e89

    xor-int v4, v4, v17

    const v17, 0x3f8e16d9

    goto/16 :goto_7

    :cond_2
    const-string v1, "\u06df\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0xf

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x3f79

    const v17, 0x24ef93ea

    xor-int v4, v4, v17

    const v17, 0x31c467e

    goto/16 :goto_7

    :sswitch_9
    const/16 v13, 0x8

    .line 32
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_4

    :cond_3
    :goto_2
    const-string v1, "\u06d8\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x77

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x65d7

    const v17, 0x5287e5b6

    xor-int v4, v4, v17

    const v17, 0x3ec6e293

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u06e8\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x4b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x104f

    const v17, 0x3711648

    xor-int v4, v4, v17

    const v17, 0x12ac03ce

    goto/16 :goto_7

    .line 0
    :sswitch_a
    sget-object v11, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v12, 0xf

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v1

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u06da\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0xf

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x5719

    const v17, -0x1f8f8de

    xor-int v4, v4, v17

    const v17, 0x188bfb70

    goto/16 :goto_7

    :sswitch_b
    const/16 v1, 0x2989

    const/16 v10, 0x2989

    goto :goto_3

    :sswitch_c
    const/16 v1, 0x66a

    const/16 v10, 0x66a

    :goto_3
    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x33

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x408d

    const v17, -0x2b04fe36

    xor-int v4, v4, v17

    const v17, 0x748d8137

    goto/16 :goto_7

    :sswitch_d
    mul-int v1, v6, v9

    sub-int/2addr v1, v8

    if-lez v1, :cond_6

    const-string v1, "\u1a75\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x4b

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x70ad

    const v17, -0x6d1e25c9

    xor-int v4, v4, v17

    const v17, 0x6edc9777

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u1a7b\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x17

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x9b7

    const v17, -0xdab6455

    xor-int v4, v4, v17

    const v17, -0x5890f399

    goto/16 :goto_7

    :sswitch_e
    const/16 v9, 0x10dc

    .line 50
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u05a8\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xc65

    const v17, -0x6dc9fa77

    xor-int v4, v4, v17

    const v17, 0x67fba0db

    goto/16 :goto_7

    :sswitch_f
    const v1, 0x470f44

    add-int v8, v7, v1

    .line 59
    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_8

    :goto_4
    const-string v1, "\u06e7\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x41

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x7ea7

    const v17, -0x293845c

    xor-int v4, v4, v17

    const v17, -0x5d68ba1e

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06e4\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0xeb3

    const v17, -0x7496e6d1

    xor-int v4, v4, v17

    const v17, 0xcf91dfa

    goto/16 :goto_7

    :sswitch_10
    aget-short v6, v18, v5

    mul-int v7, v6, v6

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u06e8\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x3339

    const v17, 0x667a9739

    xor-int v4, v4, v17

    const v17, -0x5d00cf53

    goto/16 :goto_7

    :sswitch_11
    const/16 v5, 0xe

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_b

    :cond_a
    const-string v1, "\u1a73\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xb01

    const v17, -0x73097d26

    xor-int v4, v4, v17

    const v17, -0x75703d94

    goto/16 :goto_7

    :cond_b
    const-string v1, "\u06eb\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xb3b

    const v17, 0x346a5e9f

    xor-int v4, v4, v17

    const v17, -0xd28f845

    goto :goto_7

    :sswitch_12
    sget-object v18, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_c

    :goto_5
    const-string v1, "\u06df\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x415b

    const v17, -0x310b8b31

    xor-int v4, v4, v17

    const v17, 0x150069f6

    goto :goto_7

    :cond_c
    const-string v1, "\u1a7b\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x55

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x20e9

    const v17, -0x7f411161

    xor-int v4, v4, v17

    const v17, 0x7155f65b

    goto :goto_7

    .line 2
    :sswitch_13
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_e

    :cond_d
    :goto_6
    const-string v1, "\u1a73\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1b3f

    const v17, 0x73a3b916

    xor-int v4, v4, v17

    const v17, 0x206a228

    goto :goto_7

    :cond_e
    const-string v1, "\u0730\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x9

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x2225

    const v17, 0x7db6c5ac

    xor-int v4, v4, v17

    const v17, 0x5b43e0b2

    :goto_7
    xor-int v17, v1, v17

    move v1, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e7e3c52 -> :sswitch_e
        -0x7b60efb1 -> :sswitch_d
        -0x5d7cccfb -> :sswitch_13
        -0x5b003392 -> :sswitch_a
        -0x5a84566d -> :sswitch_12
        -0x5687ea60 -> :sswitch_8
        -0x4d0ad601 -> :sswitch_7
        -0x4c6f017c -> :sswitch_12
        -0x4475d5f3 -> :sswitch_10
        -0x43fab08c -> :sswitch_0
        -0x3b889249 -> :sswitch_1
        -0x3a4f9ddd -> :sswitch_4
        -0x34a5d332 -> :sswitch_b
        -0x2cec94a6 -> :sswitch_c
        -0x2bac40df -> :sswitch_2
        -0x2aed0c18 -> :sswitch_6
        -0x27fbeeea -> :sswitch_f
        -0x226b58d3 -> :sswitch_13
        -0x1fc507ab -> :sswitch_0
        -0x1510ef0f -> :sswitch_1
        -0x14f8572c -> :sswitch_f
        -0x13a05ec0 -> :sswitch_d
        -0x7b6b12a -> :sswitch_11
        -0x2167c07 -> :sswitch_3
        0x1283112 -> :sswitch_2
        0x8d0cefd -> :sswitch_c
        0x91451da -> :sswitch_5
        0x158735cb -> :sswitch_9
        0x1dc776c6 -> :sswitch_b
        0x20004481 -> :sswitch_e
        0x29c18cd5 -> :sswitch_4
        0x343e8658 -> :sswitch_7
        0x3616e507 -> :sswitch_9
        0x466e458d -> :sswitch_a
        0x4909f1da -> :sswitch_8
        0x53d5074e -> :sswitch_6
        0x578100a1 -> :sswitch_3
        0x700095d1 -> :sswitch_5
        0x77592ccc -> :sswitch_11
        0x797312a2 -> :sswitch_10
    .end sparse-switch
.end method

.method public static ֫(Ll/᩸ۚۡ;Ll/ۛۚۡ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5bc33fa2

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v3, Ll/֡۬;->۠֡᩶:I

    const-string v4, "\u06eb\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x95f

    const v6, 0x6082365f

    xor-int/2addr v5, v6

    const v6, -0x58f0fc44

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x6ce9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_6

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_3

    .line 208
    :sswitch_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-gez v4, :cond_7

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v4, :cond_9

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    .line 172
    :sswitch_5
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ᩴ᩹ۘ;->ۧ()V

    goto :goto_1

    .line 211
    :sswitch_6
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object p0

    invoke-virtual {p0, p1, v0}, Ll/ᩴ᩹ۘ;->֫(Ll/ۗܺ᩷;Ll/ۘ᩹ۘ;)V

    return-void

    .line 210
    :sswitch_7
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(Ll/ۘ᩹ۘ;)V

    .line 164
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06e8\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xfa1

    const v6, 0x501de258

    xor-int/2addr v5, v6

    const v6, 0x602066d6

    goto :goto_0

    .line 174
    :sswitch_8
    new-instance v0, Ll/۫᩵ۡ;

    invoke-direct {v0, p0, p1}, Ll/۫᩵ۡ;-><init>(Ll/᩸ۚۡ;Ll/ۛۚۡ;)V

    .line 70
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1797

    const v6, -0x42e9ce3f

    xor-int/2addr v5, v6

    const v6, -0xe48bbbc

    goto :goto_0

    .line 171
    :sswitch_9
    invoke-static {}, Ll/ۨ᩵ۡ;->֫()Ll/ᩴ᩹ۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ᩴ᩹ۘ;->֫()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "\u06d6\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2f39

    const v6, 0x1dae4e98

    xor-int/2addr v5, v6

    const v6, 0x61eaf6dc

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u06df\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6dc9

    const v6, 0xae12518

    xor-int/2addr v5, v6

    const v6, 0x10bf3da4

    goto/16 :goto_0

    .line 84
    :sswitch_a
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u0736\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x835

    const v6, 0x29ba34e9

    xor-int/2addr v5, v6

    const v6, -0x691bc8c0

    goto/16 :goto_0

    .line 135
    :sswitch_b
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06e7\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1fa5

    const v6, -0x3411f2e5    # -3.1201846E7f

    xor-int/2addr v5, v6

    const v6, -0x7e641f34

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v4, "\u06ec\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ed7

    const v6, -0x2eea44cd

    xor-int/2addr v5, v6

    const v6, 0x714608e8

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a76\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x30f7

    const v6, -0x14b30c3d    # -2.47772E26f

    xor-int/2addr v5, v6

    const v6, -0x5b556010

    goto/16 :goto_0

    .line 96
    :sswitch_c
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u06df\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x48c5

    const v6, -0x4777e00f

    xor-int/2addr v5, v6

    const v6, -0x6eac7aa4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a79\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2df3

    const v6, -0x219cfebb

    xor-int/2addr v5, v6

    const v6, -0x2f995d1e

    goto/16 :goto_0

    .line 13
    :sswitch_d
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06e8\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6851

    const v6, 0x60864892

    xor-int/2addr v5, v6

    const v6, -0x615e6c3e

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d8\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7da1

    const v6, -0x79bd461f

    xor-int/2addr v5, v6

    const v6, -0x4fe77b3a

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61cf

    const v6, -0x5f2336db

    xor-int/2addr v5, v6

    const v6, -0x7150d3e9

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u0736\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6233

    const v6, -0x27330059

    xor-int/2addr v5, v6

    const v6, -0x1bd1e15f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xf09

    const v6, -0x1d4043e6

    xor-int/2addr v5, v6

    const v6, -0x430eebb7

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_d

    :goto_5
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1c4b

    const v6, -0x5820adba

    xor-int/2addr v5, v6

    const v6, 0x7060782

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5247

    const v6, -0x75dec353

    xor-int/2addr v5, v6

    const v6, 0x1900da25

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79b5dfb1 -> :sswitch_3
        -0x7647e24f -> :sswitch_2
        -0x7592599e -> :sswitch_1
        -0x6706ef87 -> :sswitch_6
        -0x66b4e079 -> :sswitch_9
        -0x63343ca2 -> :sswitch_0
        -0x585d8a5e -> :sswitch_2
        -0x570ce33c -> :sswitch_c
        -0x48273ccd -> :sswitch_5
        -0x46a3cf50 -> :sswitch_6
        -0x44795494 -> :sswitch_9
        -0x3b3a4fea -> :sswitch_8
        -0x2fac3c57 -> :sswitch_e
        -0x2ae544f5 -> :sswitch_d
        -0x26149b44 -> :sswitch_a
        -0x1cf77d9f -> :sswitch_f
        -0x165f4619 -> :sswitch_3
        -0x13dd1039 -> :sswitch_f
        -0x553b803 -> :sswitch_8
        -0x3f5961c -> :sswitch_7
        0x5bfa6e -> :sswitch_c
        0xae66d04 -> :sswitch_5
        0x110c225d -> :sswitch_4
        0x2b59f262 -> :sswitch_e
        0x2c5ee674 -> :sswitch_1
        0x3fc6f559 -> :sswitch_7
        0x426fb5ba -> :sswitch_a
        0x4be3849d -> :sswitch_4
        0x50a2c7b8 -> :sswitch_10
        0x5f155718 -> :sswitch_b
        0x63b57d1f -> :sswitch_0
        0x75cbb63c -> :sswitch_10
        0x7b68f6ea -> :sswitch_b
        0x7b8ecd32 -> :sswitch_d
    .end sparse-switch
.end method

.method public static ֫(Ll/᩹ۚۡ;Ll/ۛۚۡ;)V
    .locals 24

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

    const v15, -0x7ff7e7a9

    sget v16, Ll/֡ᩴ;->ܳۤ֫:I

    sget v17, Ll/ۘۛ;->ۖۚ֡:I

    const-string v18, "\u06e2\u1a76"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, 0x6425

    const v20, 0x49cdac0f

    xor-int v0, v0, v20

    const v20, 0x5daabb40

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v10, v9

    move-object v12, v11

    move-object v15, v14

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v18, -0x7ff7e7a9

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x719d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v5, p0

    .line 88
    invoke-static {v12, v13, v14, v9}, Ll/֫᩺;->ۤᩴܿ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 89
    iput-object v0, v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->state:Ljava/lang/String;

    .line 2
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_6

    move-object/from16 v19, v2

    goto/16 :goto_4

    .line 68
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v0, :cond_0

    :goto_1
    move-object/from16 v5, p0

    move-object/from16 v21, v1

    move-object/from16 v19, v2

    goto/16 :goto_a

    :cond_0
    :goto_2
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    goto/16 :goto_5

    .line 103
    :sswitch_1
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_2

    :cond_1
    move-object/from16 v5, p0

    goto/16 :goto_8

    :cond_2
    move-object/from16 v5, p0

    move-object/from16 v21, v1

    move-object/from16 v19, v2

    goto/16 :goto_9

    .line 5
    :sswitch_2
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 39
    :sswitch_5
    invoke-static {v3, v4}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v3, Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 107
    invoke-interface {v3, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    return-void

    :sswitch_6
    const/16 v0, 0x36

    const/16 v4, 0xd

    .line 39
    invoke-static {v15, v0, v4, v9}, Ll/֫ۡ;->֫ܿۨ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 68
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6821

    const v19, -0x2864721d

    xor-int v5, v5, v19

    const v19, 0x9235b75

    goto :goto_3

    .line 39
    :sswitch_7
    invoke-interface {v2}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v15, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    .line 70
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "\u06d7\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x5f

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1ec1

    const v19, -0x7ce662b1

    xor-int v5, v5, v19

    const v19, 0x68bdd440

    :goto_3
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    .line 90
    :sswitch_8
    new-instance v0, Ll/֡᩵ۡ;

    move-object/from16 v5, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v5, v2}, Ll/֡᩵ۡ;-><init>(Ll/᩹ۚۡ;Ll/ۛۚۡ;)V

    invoke-static {v0}, Ll/ܺ᩹᩷;->֫(Ll/ۡ᩹᩷;)V

    .line 39
    sget-object v0, Ll/ۨ᩵ۡ;->ۧ:Ll/ܿ۠᩵;

    sget v19, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v19, :cond_5

    move-object v2, v0

    goto/16 :goto_8

    :cond_5
    const-string v19, "\u1a7b\u0736"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, -0x4f

    move-object/from16 v21, v0

    xor-int v0, v19, v16

    mul-int/lit16 v0, v0, 0x603b

    const v22, 0x17fa4503

    xor-int v0, v0, v22

    const v22, -0x43d4ef6f

    xor-int v19, v19, v22

    move-object/from16 v2, v21

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u1a74\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x2b

    move-object/from16 v19, v2

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x3e87

    const v21, 0x44aebb5

    xor-int v2, v2, v21

    const v21, -0x5a726783

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    .line 88
    sget-object v12, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v13, 0x27

    const/16 v14, 0xf

    .line 8
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_7

    :goto_4
    const-string v0, "\u06da\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x59

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x504f

    const v21, 0x5ee47a31

    xor-int v2, v2, v21

    const v21, -0x7e47e7f9

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u05a8\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x1d

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x53b3

    const v21, -0x34f637a

    xor-int v2, v2, v21

    const v21, 0x5cb91871

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    const/16 v0, 0xf

    .line 87
    invoke-static {v10, v11, v0, v9}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v0

    .line 88
    iput-object v0, v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->scope:Ljava/lang/String;

    .line 6
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u06e2\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x951

    const v21, -0x2ed0922

    xor-int v2, v2, v21

    const v21, 0x1da9aed1

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    .line 87
    new-instance v1, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;

    invoke-direct {v1}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;-><init>()V

    sget-object v10, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v11, 0x18

    .line 93
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_9

    :goto_5
    const-string v0, "\u06eb\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x515f

    const v21, -0x2497bf38

    xor-int v2, v2, v21

    const v21, 0x1d91d775

    goto :goto_7

    :cond_9
    const-string v0, "\u05ab\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x67

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x5487

    const v21, -0x45d9b544

    xor-int v2, v2, v21

    const v21, -0x7f5aad7f

    goto :goto_7

    :sswitch_c
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    const/16 v0, 0x5761

    const/16 v9, 0x5761

    goto :goto_6

    :sswitch_d
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    const v0, 0x9ea4

    const v9, 0x9ea4

    :goto_6
    const-string v0, "\u1a7a\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x55

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x11fd

    const v21, 0x328e45b7

    xor-int v2, v2, v21

    const v21, -0x6a9274d5

    goto :goto_7

    :sswitch_e
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    mul-int v0, v7, v8

    mul-int v2, v7, v7

    const v21, 0x894e641

    add-int v2, v2, v21

    sub-int/2addr v0, v2

    if-gtz v0, :cond_a

    const-string v0, "\u1a7b\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x9

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x138f

    const v21, -0xcbbc86b

    xor-int v2, v2, v21

    const v21, 0x3029d2f0

    :goto_7
    xor-int v0, v0, v21

    move-object/from16 v23, v19

    move/from16 v19, v0

    move v0, v2

    move-object/from16 v2, v23

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e2\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x101d

    const v21, -0x485ad242

    xor-int v2, v2, v21

    const v21, -0x69a17739

    goto :goto_7

    :sswitch_f
    move-object/from16 v5, p0

    move-object/from16 v19, v2

    aget-short v7, v20, v6

    const/16 v8, 0x5dbe

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_b

    move-object/from16 v2, v19

    :goto_8
    const-string v0, "\u06db\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x31

    move-object/from16 v21, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0xf2d

    const v19, 0x6ac95cd6

    xor-int v1, v1, v19

    const v19, 0xe179e51

    xor-int v19, v0, v19

    goto/16 :goto_c

    :cond_b
    move-object/from16 v21, v1

    const-string v0, "\u06e8\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x9

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3de3

    const v2, 0x50eb1abe

    xor-int/2addr v1, v2

    const v2, -0x2c50921a

    goto :goto_b

    :sswitch_10
    move-object/from16 v5, p0

    move-object/from16 v21, v1

    move-object/from16 v19, v2

    const/16 v6, 0x17

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_c

    :goto_9
    const-string v0, "\u06dc\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x679

    const v2, -0x5ed7a357

    xor-int/2addr v1, v2

    const v2, -0x736e5cc1

    goto :goto_b

    :cond_c
    const-string v0, "\u06dc\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x57

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x61ef

    const v2, 0x57d37d8c

    xor-int/2addr v1, v2

    const v2, -0x7bd35138

    goto :goto_b

    :sswitch_11
    move-object/from16 v5, p0

    move-object/from16 v21, v1

    move-object/from16 v19, v2

    sget-object v20, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    .line 78
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v0

    if-gtz v0, :cond_d

    :goto_a
    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x4b29

    const v2, 0x12cd1c14

    xor-int/2addr v1, v2

    const v2, 0x2b67589a

    goto :goto_b

    :cond_d
    const-string v0, "\u06da\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x63

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x35c5

    const v2, 0x7cf3f3a6

    xor-int/2addr v1, v2

    const v2, 0x23e2674c

    :goto_b
    xor-int/2addr v0, v2

    move-object/from16 v2, v19

    move/from16 v19, v0

    :goto_c
    move v0, v1

    move-object/from16 v1, v21

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bad4154 -> :sswitch_9
        -0x7b950a71 -> :sswitch_1
        -0x77dd8637 -> :sswitch_f
        -0x6844d796 -> :sswitch_9
        -0x5e4d5564 -> :sswitch_3
        -0x52177750 -> :sswitch_d
        -0x5003697f -> :sswitch_10
        -0x4d63a3d3 -> :sswitch_4
        -0x488b7f19 -> :sswitch_4
        -0x45b4e051 -> :sswitch_e
        -0x3bae54c5 -> :sswitch_11
        -0x38f77e1e -> :sswitch_11
        -0x2e6f6395 -> :sswitch_2
        -0x29f65911 -> :sswitch_10
        -0x218cbfac -> :sswitch_6
        -0x1eef95aa -> :sswitch_a
        -0x16402d5c -> :sswitch_d
        -0xf19f86b -> :sswitch_e
        -0x8a454d9 -> :sswitch_5
        -0x1410af1 -> :sswitch_7
        0x9897c8f -> :sswitch_b
        0x156a8715 -> :sswitch_2
        0x1f862e36 -> :sswitch_8
        0x2810778c -> :sswitch_3
        0x31a47a38 -> :sswitch_1
        0x3576d947 -> :sswitch_7
        0x3bbbec37 -> :sswitch_f
        0x3e50eabf -> :sswitch_8
        0x406e8ba2 -> :sswitch_0
        0x4c964870 -> :sswitch_6
        0x4daa5565 -> :sswitch_b
        0x6e374f52 -> :sswitch_a
        0x6e620f34 -> :sswitch_c
        0x6ff95d4d -> :sswitch_5
        0x78844de4 -> :sswitch_c
        0x794d8685 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ۧ(Ll/ۗܺ᩷;Ll/᩵֡ۡ;)V
    .locals 23

    move-object/from16 v0, p0

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

    const v17, 0x38675d42

    sget v18, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v19, Ll/۠;->ܺܺܶ:I

    const-string v20, "\u1a73\u06d6"

    invoke-static/range {v20 .. v20}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v20

    add-int v20, v20, v18

    mul-int/lit8 v20, v20, -0x27

    xor-int v1, v20, v19

    mul-int/lit16 v1, v1, -0x305f

    const v22, 0x68fc7d90

    xor-int v1, v1, v22

    const v22, 0x11b8e191

    xor-int v20, v20, v22

    move-object/from16 v16, v5

    move-object v11, v10

    move-object v15, v14

    move/from16 v21, v20

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const v20, 0x38675d42

    const/16 v22, 0x0

    move-object v5, v4

    move-object v14, v13

    const/4 v13, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v8, v20, v19

    mul-int/lit16 v8, v8, 0x75df

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v1, v8

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    const/16 v1, 0x1da5

    const/16 v10, 0x1da5

    goto/16 :goto_5

    .line 25
    :sswitch_0
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_8

    goto/16 :goto_2

    .line 27
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_4

    goto/16 :goto_6

    .line 65
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_c

    goto :goto_1

    .line 69
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    :goto_1
    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v8, v1, v19

    mul-int/lit8 v8, v8, -0x41

    const v21, -0x45ac95d2

    xor-int v8, v8, v21

    const v21, 0x39cb32

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    .line 39
    :sswitch_5
    invoke-static {v4, v5}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v4, Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 83
    invoke-interface {v4, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    return-void

    .line 39
    :sswitch_6
    sget-object v1, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v5, 0x6a

    const/16 v8, 0xd

    invoke-static {v1, v5, v8, v10}, Ll/֨֫;->ۚܺ᩵([SIII)Ljava/lang/String;

    move-result-object v5

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x571b

    const v21, -0x450c3471    # -0.0018600094f

    xor-int v8, v8, v21

    const v21, -0x6c2f4d96

    goto/16 :goto_7

    .line 51
    :sswitch_7
    invoke-static {v3}, Ll/ܺ᩹᩷;->֫(Ll/ۡ᩹᩷;)V

    .line 39
    sget-object v1, Ll/ۨ᩵ۡ;->ۧ:Ll/ܿ۠᩵;

    invoke-interface {v1}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 10
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v1, "\u06d7\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x3a47

    const v21, 0x203e33c3

    xor-int v8, v8, v21

    const v21, 0x61b2f40

    goto/16 :goto_7

    .line 49
    :sswitch_8
    invoke-static {v15, v6, v7, v10}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 50
    iput-object v1, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->state:Ljava/lang/String;

    .line 51
    new-instance v3, Ll/᩵᩵ۡ;

    move-object/from16 v1, p1

    invoke-direct {v3, v0, v1}, Ll/᩵᩵ۡ;-><init>(Ll/ۗܺ᩷;Ll/᩵֡ۡ;)V

    .line 53
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v8, "\u06eb\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v19, v8

    mul-int/lit8 v8, v8, 0x75

    xor-int v1, v8, v18

    mul-int/lit16 v1, v1, 0x39e9

    const v21, -0x5c30fc0c

    xor-int v1, v1, v21

    const v21, 0x5ac515b7

    xor-int v21, v8, v21

    goto/16 :goto_0

    .line 49
    :sswitch_9
    sget-object v15, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v6, 0x5b

    const/16 v7, 0xf

    .line 72
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u1a79\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x4d

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x777f

    const v21, -0x52d1cde8

    xor-int v8, v8, v21

    const v21, 0x6b1a3b6

    goto/16 :goto_7

    :sswitch_a
    const/16 v1, 0x4c

    const/16 v8, 0xf

    .line 48
    invoke-static {v14, v1, v8, v10}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 49
    iput-object v1, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;->scope:Ljava/lang/String;

    .line 66
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_5

    :cond_4
    :goto_2
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x6d

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x7ea3

    const v21, 0x1bf2e152

    xor-int v8, v8, v21

    const v21, 0x78bfadce

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u1a76\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x4d

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x2221

    const v21, -0x3a132159

    xor-int v8, v8, v21

    const v21, 0x24c14951

    goto/16 :goto_7

    .line 48
    :sswitch_b
    new-instance v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;

    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;-><init>()V

    sget-object v14, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u073f\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x5b07

    const v21, -0xbe1ace4

    xor-int v8, v8, v21

    const v21, -0x1873be48

    goto/16 :goto_7

    .line 0
    :sswitch_c
    invoke-static {v11, v12, v13, v10}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_7

    :goto_3
    const-string v1, "\u06e8\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0x541b

    const v21, 0x6c6c56bb

    xor-int v8, v8, v21

    const v21, -0x2c1b0031

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u073f\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x5107

    const v21, -0x34348560    # -2.66704E7f

    xor-int v8, v8, v21

    const v21, 0x5360d240    # 9.6560008E11f

    goto/16 :goto_7

    .line 0
    :sswitch_d
    sget-object v11, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v12, 0x44

    const/16 v13, 0x8

    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_9

    :cond_8
    :goto_4
    const-string v1, "\u1a7a\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x1be7

    const v21, -0x3c868711

    xor-int v8, v8, v21

    const v21, 0x7dc8d554

    goto/16 :goto_7

    :cond_9
    const-string v1, "\u0730\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x55

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, 0x61c9

    const v21, -0x1d835b59

    xor-int v8, v8, v21

    const v21, -0x7a2fa5b

    goto/16 :goto_7

    :sswitch_e
    const v1, 0xaaae

    const v10, 0xaaae

    :goto_5
    const-string v1, "\u073f\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x1f

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0xcbf

    const v21, -0x1cfaa81c

    xor-int v8, v8, v21

    const v21, 0x25a5a194

    goto/16 :goto_7

    :sswitch_f
    mul-int v1, v22, v9

    mul-int v8, v22, v22

    const v21, 0x579dbe1

    add-int v8, v8, v21

    sub-int/2addr v8, v1

    if-gez v8, :cond_a

    const-string v1, "\u1a7b\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x43

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x793d

    const v21, -0x4671153e

    xor-int v8, v8, v21

    const v21, 0x1df7dbd2

    goto :goto_7

    :cond_a
    const-string v1, "\u05ab\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x63

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0xd1d

    const v21, 0x88c7b14

    xor-int v8, v8, v21

    const v21, 0x15a87f9f

    goto :goto_7

    :sswitch_10
    aget-short v22, v16, v17

    const/16 v9, 0x4ae2

    .line 45
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_b

    goto :goto_6

    :cond_b
    const-string v1, "\u05a1\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x3e69

    const v21, -0x67e542a3    # -1.9999638E-24f

    xor-int v8, v8, v21

    const v21, 0x27f54ad1

    goto :goto_7

    :sswitch_11
    sget-object v16, Ll/ۨ᩵ۡ;->ۧ᩸ܶ:[S

    const/16 v17, 0x43

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u073d\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x1cb5

    const v21, 0x3b4f1921

    xor-int v8, v8, v21

    const v21, -0x4bdd39b2

    goto :goto_7

    :cond_d
    const-string v1, "\u06e8\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x7715

    const v21, -0x7c21c0cc

    xor-int v8, v8, v21

    const v21, 0x5655356f

    :goto_7
    xor-int v21, v1, v21

    move v1, v8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d8e093c -> :sswitch_7
        -0x74f21eef -> :sswitch_b
        -0x6c881a89 -> :sswitch_d
        -0x69fab89c -> :sswitch_f
        -0x5d5dcef8 -> :sswitch_9
        -0x5c88ccf7 -> :sswitch_10
        -0x517eb8b3 -> :sswitch_c
        -0x4975a125 -> :sswitch_11
        -0x448b82c9 -> :sswitch_f
        -0x43cc8b9a -> :sswitch_8
        -0x42a8ab78 -> :sswitch_10
        -0x3a64e2dd -> :sswitch_e
        -0x3a288d72 -> :sswitch_e
        -0x377b999a -> :sswitch_11
        -0x36cb195d -> :sswitch_4
        -0x33c4d41b -> :sswitch_1
        -0x28c5f344 -> :sswitch_1
        -0x20e9ce09 -> :sswitch_0
        -0x1d6f0f7a -> :sswitch_b
        -0x133c470f -> :sswitch_c
        -0xcc6d16c -> :sswitch_6
        -0xba448df -> :sswitch_9
        -0xae43267 -> :sswitch_4
        -0x5facf94 -> :sswitch_6
        0x5d2e4a9 -> :sswitch_3
        0x698abd3 -> :sswitch_a
        0x8591b36 -> :sswitch_7
        0x12ae7c57 -> :sswitch_a
        0x2220ac09 -> :sswitch_5
        0x26c6f9af -> :sswitch_0
        0x27c339ad -> :sswitch_2
        0x308946eb -> :sswitch_2
        0x5ad9d069 -> :sswitch_8
        0x757f384e -> :sswitch_d
        0x7bfad63a -> :sswitch_5
        0x7d37e558 -> :sswitch_3
    .end sparse-switch
.end method
