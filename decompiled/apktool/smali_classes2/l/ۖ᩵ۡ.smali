.class public final Ll/ۖ᩵ۡ;
.super Ljava/lang/Object;
.source "T6NI"


# static fields
.field private static final ۡ֡֡:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    return-void

    :array_0
    .array-data 2
        0x208as
        0x3420s
        0x2dacs
        -0x3524s
        -0x3123s
        -0x3773s
        0x30eas
        0x3e21s
        0x2ec0s
        0x3096s
        0x37a6s
        0x12ccs
        0x3106s
        0x25b4s
        0x1e2as
        -0x2256s
        -0x2413s
        -0x3adbs
        0x3f69s
    .end array-data
.end method

.method public static ֫(Landroid/app/Activity;Ll/᩷᩵ۡ;Ljava/lang/Runnable;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const v20, -0x17bc57d

    sget v21, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v22, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v23, "\u1a74\u06e2"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v2, v23, v22

    mul-int/lit16 v2, v2, -0xda9

    const v25, 0x21902536

    xor-int v2, v2, v25

    const v25, 0x5f6e9805

    xor-int v23, v23, v25

    move-object/from16 v25, v7

    move-object/from16 v20, v15

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move-object/from16 v14, v18

    move/from16 v24, v23

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v23, -0x17bc57d

    move-object v7, v5

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v8, v23, v22

    mul-int/lit16 v8, v8, 0x679b

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v2, v8

    xor-int v23, v24, v2

    sparse-switch v23, :sswitch_data_0

    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    add-int v1, v18, v19

    mul-int v1, v1, v1

    mul-int/lit8 v2, v18, 0x2

    add-int/lit8 v2, v2, 0x1

    sub-int/2addr v1, v2

    if-gez v1, :cond_d

    const-string v1, "\u06d7\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x19

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x29a7

    const v20, -0x591722b9

    xor-int v2, v2, v20

    const v20, -0x3eadc98c

    goto/16 :goto_c

    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_1
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    goto/16 :goto_b

    :cond_0
    move-object/from16 v8, p2

    :goto_2
    move-object/from16 v24, v1

    goto/16 :goto_6

    .line 172
    :sswitch_1
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-lez v2, :cond_3

    :cond_1
    :goto_3
    move-object/from16 v8, p2

    goto/16 :goto_a

    .line 128
    :sswitch_2
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-gez v2, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto :goto_1

    .line 81
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    return-void

    .line 68
    :sswitch_5
    sget-object v2, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    const/16 v7, 0x10

    const/4 v8, 0x3

    invoke-static {v2, v7, v8, v15}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    const v7, 0x7d26d221

    xor-int/2addr v2, v7

    invoke-static {v0, v2}, Ll/֡֡;->᩻֫ۧ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object v7, v2

    goto/16 :goto_7

    :sswitch_6
    const/4 v0, 0x3

    .line 53
    invoke-static {v14, v6, v0, v15}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7ebcca7e

    xor-int/2addr v0, v1

    const/4 v1, 0x0

    .line 54
    invoke-static {v3, v0, v1}, Ll/ۛ;->᩸᩷֫(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    invoke-static {v3}, Ll/֡ᩴ;->ܳ᩶ۢ(Ljava/lang/Object;)Ll/֡ۚۢ;

    return-void

    :sswitch_7
    xor-int v2, v10, v11

    .line 53
    invoke-static {v3, v2, v1}, Ll/֨ᩴ;->ᩳۨۘ(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v14, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    const/16 v6, 0xd

    sget v2, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v2, :cond_2

    goto :goto_3

    :cond_2
    const-string v2, "\u06d6\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x4b

    xor-int v8, v2, v21

    mul-int/lit16 v8, v8, 0x7005

    const v24, -0x2f1bbeb2

    xor-int v8, v8, v24

    const v24, -0x18f97e4f

    goto :goto_4

    :sswitch_8
    const/16 v2, 0xa

    const/4 v8, 0x3

    .line 52
    invoke-static {v13, v2, v8, v15}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7ef1f826

    .line 163
    sget v2, Ll/۠;->ܺܺܶ:I

    if-ltz v2, :cond_4

    :cond_3
    const-string v2, "\u0733\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x39

    xor-int v8, v2, v21

    mul-int/lit16 v8, v8, 0x90b

    const v24, -0x716c8f7f

    xor-int v8, v8, v24

    const v24, -0x148b6aac

    goto :goto_4

    :cond_4
    const-string v2, "\u06ec\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, 0x1b

    xor-int v8, v2, v22

    mul-int/lit16 v8, v8, 0x731d

    const v24, 0xf6a99c5

    xor-int v8, v8, v24

    const v24, 0x4c8c6c5d    # 7.3622248E7f

    :goto_4
    xor-int v24, v2, v24

    move v2, v8

    goto/16 :goto_0

    :sswitch_9
    const v1, 0x7ed3daa2

    xor-int/2addr v1, v9

    .line 52
    invoke-static {v0, v1, v5}, Ll/ۗ᩶;->ܰۖ۬(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ۗ᩺;->ۜܶۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll/ᩳۨ᩷;

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v2, :cond_5

    goto/16 :goto_3

    :cond_5
    const/4 v2, 0x2

    move-object/from16 v8, p2

    invoke-direct {v1, v2, v8}, Ll/ᩳۨ᩷;-><init>(ILjava/lang/Object;)V

    sget-object v13, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    .line 29
    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_6

    const-string v2, "\u06e4\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    move-object/from16 v24, v1

    xor-int v1, v2, v21

    mul-int/lit16 v1, v1, -0x166b

    const v26, -0x55e2990d

    xor-int v1, v1, v26

    const v26, 0x8f4cd96

    goto :goto_5

    :cond_6
    move-object/from16 v24, v1

    const-string v1, "\u0733\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x496d

    const v26, -0x573c2c4

    xor-int v2, v2, v26

    const v26, -0x10099d69    # -1.52505E29f

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v8, p2

    const/4 v2, 0x7

    const/4 v9, 0x3

    .line 68
    invoke-static {v12, v2, v9, v15}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    .line 13
    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v2, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v2, "\u1a77\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    move-object/from16 v24, v1

    xor-int v1, v2, v21

    mul-int/lit16 v1, v1, 0x6371

    const v26, -0x317ac50a

    xor-int v1, v1, v26

    const v26, -0x5661a410

    :goto_5
    xor-int v2, v2, v26

    move/from16 v27, v2

    move v2, v1

    move-object/from16 v1, v24

    move/from16 v24, v27

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    const/4 v1, 0x1

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v5, v1

    .line 68
    sget-object v12, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    .line 79
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_8

    :goto_6
    const-string v1, "\u06da\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x166f

    const v26, -0x1bfa2c57

    xor-int v2, v2, v26

    const v26, -0x13994468

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x3d79

    const v26, 0x430c1b20

    xor-int v2, v2, v26

    const v26, 0x17c45954

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    .line 67
    sget-object v1, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    const/4 v2, 0x4

    const/4 v7, 0x3

    invoke-static {v1, v2, v7, v15}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7d13d00e

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Ll/֡֡;->᩻֫ۧ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_7

    :sswitch_d
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    .line 68
    invoke-static {v4}, Ll/֫ܺ;->᩺ۜ۠(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\u1a79\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x4791

    const v26, -0x536afbd8

    xor-int v2, v2, v26

    const v26, -0x4491290b

    goto/16 :goto_8

    :cond_9
    move-object v7, v4

    :goto_7
    const-string v1, "\u1a75\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0xdab

    const v26, 0x1336bc90

    xor-int v2, v2, v26

    const v26, 0x72463e5b

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    .line 186
    invoke-static/range {v25 .. v25}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7ef5c207

    xor-int/2addr v1, v2

    .line 51
    invoke-static {v3, v1}, Ll/֡ۨ;->᩺۠ۧ(Ljava/lang/Object;I)V

    move-object/from16 v2, p1

    move-object/from16 v1, v24

    .line 67
    iget-object v4, v2, Ll/᩷᩵ۡ;->᩻:Ljava/lang/String;

    iget-boolean v1, v2, Ll/᩷᩵ۡ;->ܳ:Z

    if-eqz v1, :cond_a

    const-string v1, "\u1a79\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x33

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x8f1

    const v26, -0x76255db6

    xor-int v2, v2, v26

    const v26, -0x6f91080b

    goto :goto_8

    :cond_a
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x22a7

    const v26, -0x224a1f9d

    xor-int v2, v2, v26

    const v26, -0x533a07fd

    goto :goto_8

    :sswitch_f
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    const/4 v1, 0x1

    const/4 v2, 0x3

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    .line 186
    invoke-static {v3, v1, v2, v15}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v25

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x555d

    const v20, 0x5e4a7144

    xor-int v2, v2, v20

    const v20, -0x73d9b441

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    .line 50
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v3, Ll/᩵ۚۢ;

    invoke-direct {v3, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    sget-object v20, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_c

    goto/16 :goto_a

    :cond_c
    const-string v1, "\u1a78\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x45

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x29c1

    const v26, -0x54b49ac7

    xor-int v2, v2, v26

    const v26, 0x71d1e698

    :goto_8
    xor-int v1, v1, v26

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    const v1, 0xb32b

    const v15, 0xb32b

    goto :goto_9

    :sswitch_12
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    const/16 v1, 0x4a54

    const/16 v15, 0x4a54

    :goto_9
    const-string v1, "\u073d\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x5

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0xecf

    const v20, -0xebae0ba

    xor-int v2, v2, v20

    const v20, 0x4d410986

    goto/16 :goto_c

    :cond_d
    const-string v1, "\u06eb\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x33eb

    const v20, -0x373f9657

    xor-int v2, v2, v20

    const v20, 0x4bfff6cb    # 3.3549718E7f

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    const/4 v1, 0x0

    aget-short v18, v17, v1

    const/16 v19, 0x1

    .line 66
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_e

    move-object/from16 v20, v3

    move-object/from16 v3, v26

    :goto_a
    const-string v1, "\u073d\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x2b

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x53df

    const v24, -0x3a446b47

    xor-int v2, v2, v24

    const v24, -0x295a02a3

    xor-int v24, v1, v24

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x4f

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x5093

    const v20, -0x2776a5dc

    xor-int v2, v2, v20

    const v20, 0x4e523447    # 8.8166035E8f

    goto :goto_c

    :sswitch_14
    move-object/from16 v8, p2

    move-object/from16 v24, v1

    move-object/from16 v26, v3

    move-object/from16 v3, v20

    sget-object v17, Ll/ۖ᩵ۡ;->ۡ֡֡:[S

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_f

    :goto_b
    const-string v1, "\u06e2\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x729

    const v20, -0x377cc47c

    xor-int v2, v2, v20

    const v20, -0x667302ef

    goto :goto_c

    :cond_f
    const-string v1, "\u1a77\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x234d

    const v20, 0x35da84de

    xor-int v2, v2, v20

    const v20, 0x739cdd44

    :goto_c
    xor-int v1, v1, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v26

    :goto_d
    move-object/from16 v27, v24

    move/from16 v24, v1

    move-object/from16 v1, v27

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x794b9b86 -> :sswitch_7
        -0x7744b0d3 -> :sswitch_10
        -0x741bc726 -> :sswitch_9
        -0x71d349e2 -> :sswitch_12
        -0x714064b8 -> :sswitch_d
        -0x69968c46 -> :sswitch_f
        -0x54159cfa -> :sswitch_14
        -0x510ad382 -> :sswitch_b
        -0x44c71693 -> :sswitch_14
        -0x41793305 -> :sswitch_9
        -0x3cdc2644 -> :sswitch_2
        -0x39f89684 -> :sswitch_0
        -0x327021cf -> :sswitch_8
        -0x2b1658e4 -> :sswitch_8
        -0x25e929e9 -> :sswitch_3
        -0x1dff15e4 -> :sswitch_a
        -0x1cbc80c4 -> :sswitch_a
        -0x1842dadb -> :sswitch_4
        -0x158cf7d7 -> :sswitch_1
        -0x13def3e3 -> :sswitch_4
        -0x779ef64 -> :sswitch_12
        -0x1606a71 -> :sswitch_6
        0x12f8cc5 -> :sswitch_5
        0x18e194a8 -> :sswitch_1
        0x1c2e069d -> :sswitch_3
        0x1dde8849 -> :sswitch_f
        0x1eddc8eb -> :sswitch_10
        0x26131673 -> :sswitch_c
        0x2a8d65ea -> :sswitch_0
        0x2e7432cb -> :sswitch_c
        0x2fa7684c -> :sswitch_7
        0x315da9de -> :sswitch_6
        0x3af68257 -> :sswitch_13
        0x43faa29d -> :sswitch_d
        0x464373e3 -> :sswitch_2
        0x4fea2cc5 -> :sswitch_5
        0x51e6cbf1 -> :sswitch_13
        0x5f7d78b9 -> :sswitch_e
        0x635d254b -> :sswitch_11
        0x674f2f0e -> :sswitch_11
        0x74dcabdc -> :sswitch_b
        0x78a151b2 -> :sswitch_e
    .end sparse-switch
.end method

.method public static ֫(Ll/֡ۚۢ;Ljava/lang/String;Ljava/util/function/IntConsumer;)V
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x1f4a2d11

    sget v10, Ll/ۗ۬;->ۘܳ᩻:I

    sget v11, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v12, "\u1a73\u06db"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x15db

    const v14, 0x6b5de24c

    xor-int/2addr v13, v14

    const v14, -0xfca1dce

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, 0x2a31

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    .line 25
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v12

    if-eqz v12, :cond_0

    :goto_2
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_5

    :cond_0
    const-string v12, "\u06e7\u06d7"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x3b

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x7059

    const v14, 0x7152e76

    xor-int/2addr v13, v14

    const v14, -0x49b879cb

    goto :goto_0

    .line 7
    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v12, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v12, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v12

    if-lez v12, :cond_2

    goto :goto_2

    :cond_2
    const-string v12, "\u06e4\u06d7"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x2015

    const v14, -0x5fd9cdeb

    xor-int/2addr v13, v14

    const v14, 0x99a7589

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    goto :goto_2

    .line 68
    :sswitch_4
    new-instance v1, Ll/ܺ᩵ۡ;

    move-object/from16 v12, p2

    invoke-direct {v1, v0, v12}, Ll/ܺ᩵ۡ;-><init>(Ll/ۖܿ;Ljava/util/function/IntConsumer;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void

    :sswitch_5
    move-object/from16 v12, p2

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 67
    invoke-virtual {v0, v1, v13, v14}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    sget v13, Ll/֡۬;->۠֡᩶:I

    if-gtz v13, :cond_3

    move-object/from16 v13, p1

    goto/16 :goto_5

    :cond_3
    const-string v13, "\u05a8\u06d7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x6f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3413

    const v15, 0x7d79b249

    xor-int/2addr v14, v15

    const v15, -0x1241f814

    xor-int/2addr v13, v15

    move v12, v13

    move v13, v14

    goto/16 :goto_1

    :sswitch_6
    move-object/from16 v12, p2

    .line 65
    sget v13, Ll/᩹֡᩷;->֫:I

    invoke-static {v1, v13}, Ll/ۗ۬;->֨᩹ܿ(Ljava/lang/Object;I)V

    move-object/from16 v13, p1

    .line 66
    invoke-static {v1, v13}, Ll/֫ܽ;->ۚۖۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    sget v14, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v14, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v14, "\u06da\u073d"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x45

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x266b

    const v16, 0x37167e5f

    xor-int v15, v15, v16

    const v16, -0x53430f38

    goto/16 :goto_6

    :sswitch_7
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 64
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 41
    sget v14, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v14, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v14, "\u1a79\u0730"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x2c01

    const v16, 0x1e7efd98

    xor-int v15, v15, v16

    const v16, 0x4c03336b    # 3.4393516E7f

    goto/16 :goto_6

    :sswitch_8
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v7}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v8

    .line 62
    invoke-virtual {v1, v3, v5, v6, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v8, 0x41700000    # 15.0f

    .line 55
    sget v14, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v14, :cond_6

    goto :goto_3

    :cond_6
    const-string v14, "\u0733\u0730"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x6c25

    const v16, 0xcb72800

    xor-int v15, v15, v16

    const v16, -0x7bd8bf8d

    goto/16 :goto_6

    :sswitch_9
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 63
    invoke-static {v2}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v6

    const/high16 v7, 0x40c00000    # 6.0f

    .line 2
    sget v14, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v14, :cond_7

    goto :goto_3

    :cond_7
    const-string v14, "\u0730\u06d7"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v10, v14

    mul-int/lit8 v14, v14, -0x61

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x7d3b

    const v16, 0x4dbde63c    # 3.98247808E8f

    xor-int v15, v15, v16

    const v16, -0x5c4613f8

    goto/16 :goto_6

    :sswitch_a
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 62
    invoke-static {v4}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v5

    .line 20
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v14

    if-eqz v14, :cond_8

    :goto_3
    const-string v14, "\u06d8\u05ab"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x195d

    const v16, 0x1c7e592a

    xor-int v15, v15, v16

    const v16, -0x2fab84a

    goto/16 :goto_6

    :cond_8
    const-string v14, "\u1a78\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x3be7

    const v16, -0x6bae9f11

    xor-int v15, v15, v16

    const v16, 0x3d8c6f14

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    const/high16 v2, 0x41c00000    # 24.0f

    .line 62
    invoke-static {v2}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v3

    const/high16 v4, 0x40800000    # 4.0f

    .line 5
    sget v14, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v14, :cond_9

    goto :goto_4

    :cond_9
    const-string v14, "\u06db\u073f"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x31bb

    const v16, -0x20747dee

    xor-int v15, v15, v16

    const v16, -0x7bb4811f

    goto/16 :goto_6

    :sswitch_c
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 61
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Ll/֡ۚۢ;->֫()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v1, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v14

    if-ltz v14, :cond_a

    :goto_4
    const-string v14, "\u073d\u1a78"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x13

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, -0x6f17

    const v16, -0xb032276

    xor-int v15, v15, v16

    const v16, -0x5b053145

    goto :goto_6

    :cond_a
    const-string v14, "\u06e7\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x1bff

    const v16, -0x4d537b52

    xor-int v15, v15, v16

    const v16, -0x51e4dc85

    goto :goto_6

    :sswitch_d
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 60
    invoke-virtual/range {p0 .. p0}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v0

    .line 17
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v14

    if-eqz v14, :cond_b

    goto :goto_5

    :cond_b
    const-string v14, "\u1a79\u073f"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x6d

    xor-int v15, v14, v10

    mul-int/lit16 v15, v15, 0xad

    const v16, -0x357ba050    # -4337624.0f

    xor-int v15, v15, v16

    const v16, -0x2ed33256

    goto :goto_6

    :sswitch_e
    move-object/from16 v13, p1

    move-object/from16 v12, p2

    .line 23
    sget-boolean v14, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v14, :cond_c

    :goto_5
    const-string v14, "\u073d\u0730"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x128d

    const v16, -0x28e8ffe0

    xor-int v15, v15, v16

    const v16, 0x26586517

    goto :goto_6

    :cond_c
    const-string v14, "\u06e8\u1a7a"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v10

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x7249

    const v16, 0x24065ff9

    xor-int v15, v15, v16

    const v16, -0x683a0c0c

    :goto_6
    xor-int v14, v14, v16

    move v12, v14

    move v13, v15

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x739d5809 -> :sswitch_b
        -0x72236e17 -> :sswitch_5
        -0x5f080234 -> :sswitch_6
        -0x59a101ba -> :sswitch_7
        -0x50a7ded5 -> :sswitch_9
        -0x4c5d28c0 -> :sswitch_8
        -0x4a43a4f2 -> :sswitch_d
        -0x44133f89 -> :sswitch_4
        -0x351e326c -> :sswitch_c
        -0x32831b2c -> :sswitch_2
        -0x2e872b67 -> :sswitch_9
        -0x2db07f6e -> :sswitch_e
        -0x1a92a376 -> :sswitch_3
        -0x167973d2 -> :sswitch_e
        -0x671ee8d -> :sswitch_1
        -0x145dfc6 -> :sswitch_c
        0x15b8d7e -> :sswitch_0
        0x4d8c2a5 -> :sswitch_b
        0x5683ca6 -> :sswitch_3
        0x11f26b15 -> :sswitch_0
        0x1f525495 -> :sswitch_4
        0x2205db51 -> :sswitch_d
        0x446dc5dd -> :sswitch_1
        0x48b82abf -> :sswitch_7
        0x4f3ed7cb -> :sswitch_5
        0x501b8101 -> :sswitch_2
        0x53e568d7 -> :sswitch_8
        0x650fd565 -> :sswitch_6
        0x68bc5055 -> :sswitch_a
        0x6e18c30b -> :sswitch_a
    .end sparse-switch
.end method
