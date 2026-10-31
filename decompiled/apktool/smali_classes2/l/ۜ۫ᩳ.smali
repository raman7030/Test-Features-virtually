.class public final Ll/ۜ۫ᩳ;
.super Ljava/lang/Object;
.source "25S1"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/text/SpanWatcher;


# static fields
.field public static final ۙ:Ljava/lang/Class;

.field private static final ܺ֫᩶:[S


# instance fields
.field public ᩶:I

.field public ᩸:Ll/۫ۨᩳ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜ۫ᩳ;->ܺ֫᩶:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x731a37b5

    sget v11, Ll/ۘۛ;->ۖۚ֡:I

    sget v12, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v13, "\u1a77\u1a7a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x61

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6147

    const v15, -0x57556be2

    xor-int/2addr v14, v15

    const v15, 0x53cb2f6a

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x6e3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 27
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v13

    if-nez v13, :cond_d

    goto/16 :goto_6

    :sswitch_0
    const/16 v4, 0x132f

    .line 10
    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v13, :cond_0

    goto :goto_1

    :cond_0
    const-string v13, "\u073f\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1287

    const v15, 0x67245b0

    xor-int/2addr v14, v15

    const v15, 0x58517143

    goto :goto_0

    :sswitch_1
    add-int v8, v6, v7

    .line 29
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_1

    :cond_1
    const-string v13, "\u06dc\u1a75"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x31

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x62eb

    const v15, -0x54ae8db5

    xor-int/2addr v14, v15

    const v15, -0x4a17ca2b

    goto :goto_0

    :sswitch_2
    mul-int v6, v3, v3

    const v7, 0x17002a1

    sget v13, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v13, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v13, "\u1a73\u0730"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x419b

    const v15, -0x1f786b24

    xor-int/2addr v14, v15

    const v15, 0x390b65c4

    goto :goto_0

    :sswitch_3
    const v9, 0xd025

    goto/16 :goto_3

    .line 27
    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_6

    :sswitch_5
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget v13, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v13, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_1
    const-string v13, "\u06d7\u1a74"

    .line 10
    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x47

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2263

    const v15, -0x1616721f

    xor-int/2addr v14, v15

    const v15, -0x76982210

    goto/16 :goto_0

    .line 0
    :sswitch_6
    :try_start_0
    sget-object v13, Ll/ۜ۫ᩳ;->ܺ֫᩶:[S

    const/4 v14, 0x1

    const/16 v15, 0x21

    invoke-static {v13, v14, v15, v9}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v13

    .line 29
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    const-string v13, "\u1a79\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x17

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x431b

    const v15, -0x4169eee2

    xor-int/2addr v14, v15

    const v15, 0x2d47c2ef

    goto/16 :goto_0

    .line 9
    :sswitch_7
    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v13, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v13, "\u1a74\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x59e3

    const v15, -0x552e23b4

    xor-int/2addr v14, v15

    const v15, -0x704f884e

    goto/16 :goto_0

    .line 32
    :sswitch_8
    sput-object v0, Ll/ۜ۫ᩳ;->ۙ:Ljava/lang/Class;

    return-void

    .line 9
    :sswitch_9
    sget-object v1, Ll/ۜ۫ᩳ;->ܺ֫᩶:[S

    const/4 v2, 0x0

    .line 21
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v13

    if-gtz v13, :cond_5

    goto :goto_4

    :cond_5
    const-string v13, "\u1a76\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x391f

    const v15, -0x47256e2

    xor-int/2addr v14, v15

    const v15, -0x7d57a51d

    goto/16 :goto_0

    .line 25
    :sswitch_a
    sget-boolean v13, Ll/֨۫;->۬᩷᩶:Z

    if-nez v13, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v13, "\u06e7\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x6a8b

    const v15, 0x7be5f653

    xor-int/2addr v14, v15

    const v15, 0x673921f2

    goto/16 :goto_0

    .line 27
    :sswitch_b
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_c
    const/4 v0, 0x0

    :goto_2
    const-string v13, "\u1a75\u06db"

    .line 29
    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x62e5

    const v15, 0x622b30e5

    xor-int/2addr v14, v15

    const v15, -0x569dd6f6

    goto/16 :goto_0

    :sswitch_d
    const v9, 0xd8b9

    :goto_3
    const-string v13, "\u05a8\u05a1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x250b

    const v15, 0x49ce4096    # 1689618.8f

    xor-int/2addr v14, v15

    const v15, 0x35b555e7

    goto/16 :goto_0

    .line 27
    :sswitch_e
    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v13, :cond_7

    goto/16 :goto_7

    :cond_7
    :goto_4
    const-string v13, "\u073d\u1a7a"

    .line 21
    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x6f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x94d

    const v15, -0x41ccbba9

    xor-int/2addr v14, v15

    const v15, 0x4732eedb

    goto/16 :goto_0

    :sswitch_f
    add-int v5, v3, v4

    mul-int v5, v5, v5

    .line 20
    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v13, :cond_8

    :goto_5
    const-string v13, "\u06e4\u06d8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3217

    const v15, -0x3cce1a14

    xor-int/2addr v14, v15

    const v15, -0x7f2c52f1

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u1a78\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1105

    const v15, -0x2db197f4

    xor-int/2addr v14, v15

    const v15, 0x307a80ed

    goto/16 :goto_0

    .line 2
    :sswitch_10
    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v13, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v13, "\u06da\u073d"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x49

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4f31

    const v15, -0x3460fb9b    # -2.0842698E7f

    xor-int/2addr v14, v15

    const v15, 0x551e3b1d

    goto/16 :goto_0

    :sswitch_11
    add-int v13, v8, v8

    sub-int/2addr v13, v5

    if-gez v13, :cond_a

    const-string v13, "\u1a79\u1a7b"

    .line 29
    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x3d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7eab

    const v15, 0x2884150f

    xor-int/2addr v14, v15

    const v15, -0x41eecd48

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06d7\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3c61

    const v15, 0x8697491

    xor-int/2addr v14, v15

    const v15, 0x4854ad0a

    goto/16 :goto_0

    .line 23
    :sswitch_12
    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v13, :cond_b

    goto :goto_7

    :cond_b
    const-string v13, "\u06ec\u1a79"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5cb5

    const v15, 0x541dc8c5

    xor-int/2addr v14, v15

    const v15, 0x6d6a3e83

    goto/16 :goto_0

    .line 10
    :sswitch_13
    aget-short v3, v1, v2

    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_c

    goto :goto_7

    :cond_c
    const-string v13, "\u05a8\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x5f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x22eb

    const v15, -0x4c7bb1d2

    xor-int/2addr v14, v15

    const v15, 0x46b6b4b3

    goto/16 :goto_0

    :goto_6
    const-string v13, "\u05a1\u1a75"

    .line 9
    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4f2f

    const v15, -0x4083fdcf

    xor-int/2addr v14, v15

    const v15, -0x331835d8

    goto/16 :goto_0

    :cond_d
    :goto_7
    const-string v13, "\u1a79\u073f"

    .line 2
    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x334f

    const v15, 0x381d267a

    xor-int/2addr v14, v15

    const v15, -0x46a4da3b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e62c502 -> :sswitch_13
        -0x7431f7a6 -> :sswitch_12
        -0x73155bad -> :sswitch_11
        -0x6c55d597 -> :sswitch_10
        -0x6600877f -> :sswitch_f
        -0x5e4a0711 -> :sswitch_f
        -0x5c736145 -> :sswitch_e
        -0x5b5c4905 -> :sswitch_d
        -0x57829365 -> :sswitch_c
        -0x55c1b5c7 -> :sswitch_b
        -0x515e57ac -> :sswitch_a
        -0x34acb73a -> :sswitch_12
        -0x32f68dec -> :sswitch_9
        -0x2f8070e8 -> :sswitch_8
        -0x2964b153 -> :sswitch_7
        -0x26bdeb92 -> :sswitch_6
        -0x2374b32c -> :sswitch_7
        -0x207ea93a -> :sswitch_5
        -0x19f5c662 -> :sswitch_e
        -0x115ffc8e -> :sswitch_11
        -0xe9f420c -> :sswitch_4
        -0x7db575c -> :sswitch_6
        0x6a91ccf -> :sswitch_a
        0x10e79cae -> :sswitch_c
        0x26291393 -> :sswitch_3
        0x2794f200 -> :sswitch_2
        0x31e53095 -> :sswitch_4
        0x3eb2615e -> :sswitch_2
        0x3eedb1cf -> :sswitch_3
        0x4596e77c -> :sswitch_8
        0x524916c1 -> :sswitch_5
        0x5b276a54 -> :sswitch_9
        0x5e7dcc39 -> :sswitch_b
        0x5fd1163c -> :sswitch_1
        0x6344b980 -> :sswitch_10
        0x64331706 -> :sswitch_d
        0x6c004618 -> :sswitch_0
        0x78118148 -> :sswitch_1
        0x7c3dcab3 -> :sswitch_13
        0x7f39443f -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x202es
        -0x2728s
        -0x2729s
        -0x2723s
        -0x2735s
        -0x272as
        -0x2730s
        -0x2723s
        -0x2769s
        -0x2733s
        -0x2724s
        -0x273fs
        -0x2733s
        -0x2769s
        -0x2736s
        -0x2733s
        -0x2740s
        -0x272bs
        -0x2724s
        -0x2769s
        -0x2716s
        -0x2737s
        -0x2724s
        -0x272bs
        -0x272bs
        -0x2706s
        -0x272fs
        -0x2724s
        -0x2726s
        -0x272es
        -0x2716s
        -0x2737s
        -0x2728s
        -0x2729s
    .end array-data
.end method

.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    return-void
.end method

.method private ֫(IILjava/lang/Class;)V
    .locals 17

    move/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x5d053952

    sget v11, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v12, Ll/ۨ;->᩺᩷ۚ:I

    const-string v13, "\u0736\u06db"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5373

    const v15, 0x1f75171c

    xor-int/2addr v14, v15

    const v15, -0x49bbdfae

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x37ff

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_8

    goto/16 :goto_6

    .line 167
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v13, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v13, :cond_1

    :cond_0
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_8

    :cond_1
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_a

    .line 163
    :sswitch_1
    sget v13, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v13, :cond_0

    :goto_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_9

    :sswitch_2
    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v13, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto :goto_2

    .line 166
    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    return-void

    .line 236
    :sswitch_5
    invoke-static {v4, v8}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 238
    :sswitch_6
    invoke-static {v7}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 239
    invoke-interface {v2, v13}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto/16 :goto_4

    :sswitch_7
    return-void

    :sswitch_8
    if-ne v9, v1, :cond_3

    goto :goto_3

    :cond_3
    const-string v13, "\u06e8\u1a79"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7bfb

    const v15, -0x1e45d925

    xor-int/2addr v14, v15

    const v15, 0x5a857841

    goto :goto_0

    :sswitch_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v13, p3

    goto/16 :goto_5

    .line 238
    :sswitch_a
    invoke-static {v7}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const-string v13, "\u1a7a\u06e4"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x1f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5f31

    const v15, 0x178800d7

    xor-int/2addr v14, v15

    const v15, -0x4594548d

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06dc\u1a7a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5169

    const v15, -0x3379d0d8    # -7.0351168E7f

    xor-int/2addr v14, v15

    const v15, -0x637d205a

    goto/16 :goto_0

    .line 232
    :sswitch_b
    aget-object v8, v3, v6

    .line 233
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 234
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    if-eq v13, v0, :cond_5

    const-string v13, "\u1a76\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7369

    const v15, -0xdf08adc

    xor-int/2addr v14, v15

    const v15, -0x9301ce0

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v13, "\u06e4\u073a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x39

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x68d9

    const v15, -0x72236b08

    xor-int/2addr v14, v15

    const v15, 0x785c8fdc

    goto/16 :goto_0

    .line 238
    :sswitch_c
    invoke-static {v4}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    const-string v13, "\u06e2\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x6d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x74f

    const v15, 0xb14b3b2

    xor-int/2addr v14, v15

    const v15, 0x65446f4b

    goto/16 :goto_0

    :sswitch_d
    if-ge v6, v5, :cond_6

    const-string v13, "\u06ec\u1a7a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x4f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4bb

    const v15, -0x4db0216c

    xor-int/2addr v14, v15

    const v15, -0x5dc6e53f

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u06eb\u1a75"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x505f

    const v15, -0x68dcd623

    xor-int/2addr v14, v15

    const v15, -0x123686bf

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v13, p3

    .line 230
    invoke-interface {v2, v0, v1, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    .line 231
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 232
    array-length v5, v3

    const/4 v6, 0x0

    :goto_5
    const-string v14, "\u06d6\u1a77"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x75

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x1d63

    const v16, -0x5dc0001a

    xor-int v15, v15, v16

    const v16, 0x6445d6b6

    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_1

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 229
    iget-object v2, v14, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v2}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v2

    .line 109
    sget-boolean v15, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v15, :cond_7

    goto :goto_7

    :cond_7
    const-string v15, "\u06d8\u06e8"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v11

    mul-int/lit8 v15, v15, 0x39

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, -0x7365

    const v16, -0x2f48616f

    xor-int v0, v0, v16

    const v16, 0xa0fdea7

    xor-int v15, v15, v16

    move v14, v0

    move v13, v15

    goto/16 :goto_c

    :goto_6
    const-string v0, "\u06e7\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x29

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x617

    const v16, 0x7d325f3d

    xor-int v15, v15, v16

    const v16, -0x47f29713

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u06d6\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x6b21

    const v16, 0x743d7afa

    xor-int v15, v15, v16

    const v16, -0x5cf0ea5

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 102
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_9

    :goto_7
    const-string v0, "\u06dc\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x3d

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x718d

    const v16, -0x69ff4ace

    xor-int v15, v15, v16

    const v16, 0x1165e8b0

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u1a73\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x3581

    const v16, -0x39eb7fbe

    xor-int v15, v15, v16

    const v16, -0x6496a0a2

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_a

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u05a8\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, -0x41

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0xeb

    const v16, 0x1629d7d2

    xor-int v15, v15, v16

    const v16, -0x4cef83aa

    goto/16 :goto_b

    :sswitch_12
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 59
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06da\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v11, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x4c39

    const v16, 0x40928f3f

    xor-int v15, v15, v16

    const v16, -0x7427db37

    goto/16 :goto_b

    :sswitch_13
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 77
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u06e2\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x556d

    const v16, 0x71fc3277

    xor-int v15, v15, v16

    const v16, 0x3d7bca3

    goto/16 :goto_b

    :sswitch_14
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_d

    goto/16 :goto_a

    :cond_d
    const-string v0, "\u1a7a\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x75

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x38b5

    const v16, 0x76be88be

    xor-int v15, v15, v16

    const v16, -0x59cbb367

    goto/16 :goto_b

    :sswitch_15
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_e

    :goto_8
    const-string v0, "\u06db\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x304f

    const v16, -0x3f7d3a01

    xor-int v15, v15, v16

    const v16, 0x6edf4483

    goto/16 :goto_b

    :cond_e
    const-string v0, "\u06e1\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x6af3

    const v16, 0x7fdfefc4

    xor-int v15, v15, v16

    const v16, 0x55f67589

    goto :goto_b

    :sswitch_16
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_f

    :goto_9
    const-string v0, "\u1a73\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x5f

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x6d1f

    const v16, -0x35ac9ccb

    xor-int v15, v15, v16

    const v16, 0x5db910af

    goto :goto_b

    :cond_f
    const-string v0, "\u06eb\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x11f7

    const v16, 0x71e13e0b

    xor-int v15, v15, v16

    const v16, 0x602f3222

    goto :goto_b

    :sswitch_17
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 183
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v0

    if-ltz v0, :cond_10

    :goto_a
    const-string v0, "\u05ab\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0xc31

    const v16, 0x6d2bc1ed

    xor-int v15, v15, v16

    const v16, 0x3f7a822f

    goto :goto_b

    :cond_10
    const-string v0, "\u06da\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x6827

    const v16, 0x480e6170

    xor-int v15, v15, v16

    const v16, 0x4b5702d7    # 1.4090967E7f

    :goto_b
    xor-int v0, v0, v16

    move v13, v0

    move v14, v15

    :goto_c
    move/from16 v0, p1

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e23715d -> :sswitch_14
        -0x758feb08 -> :sswitch_1
        -0x71505014 -> :sswitch_5
        -0x711450b7 -> :sswitch_4
        -0x71110ad4 -> :sswitch_3
        -0x6feaff48 -> :sswitch_8
        -0x6f23e0d2 -> :sswitch_9
        -0x6c0775b5 -> :sswitch_13
        -0x6b4e6dff -> :sswitch_14
        -0x695f8aec -> :sswitch_5
        -0x641265eb -> :sswitch_f
        -0x621ae91b -> :sswitch_8
        -0x6082015b -> :sswitch_16
        -0x5a701e5d -> :sswitch_11
        -0x450a4725 -> :sswitch_2
        -0x44b98b35 -> :sswitch_a
        -0x42839426 -> :sswitch_e
        -0x3fda7c46 -> :sswitch_11
        -0x2802b859 -> :sswitch_12
        -0x259e09b8 -> :sswitch_9
        -0x24fefc51 -> :sswitch_b
        -0x1ab5de37 -> :sswitch_3
        -0x14af90c8 -> :sswitch_1
        -0x1474d995 -> :sswitch_15
        -0x10c36120 -> :sswitch_a
        -0xd432120 -> :sswitch_c
        -0x49aced4 -> :sswitch_6
        0x417981a -> :sswitch_4
        0xadd2ddd -> :sswitch_6
        0x10125170 -> :sswitch_d
        0x127eb66f -> :sswitch_c
        0x1deebfe3 -> :sswitch_e
        0x261729bc -> :sswitch_10
        0x2e1a0cb2 -> :sswitch_f
        0x39eaa3ac -> :sswitch_10
        0x39f47283 -> :sswitch_15
        0x3b656056 -> :sswitch_0
        0x3d609f99 -> :sswitch_b
        0x40941cc0 -> :sswitch_12
        0x558c62e2 -> :sswitch_7
        0x5778b498 -> :sswitch_0
        0x5cd33290 -> :sswitch_2
        0x626ee10b -> :sswitch_17
        0x63e74924 -> :sswitch_7
        0x6c342ec9 -> :sswitch_d
        0x75fd821d -> :sswitch_13
        0x7b5501e3 -> :sswitch_16
        0x7b594e3e -> :sswitch_17
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0xc837147    # -2.0009667E31f

    sget v5, Ll/֨۬;->۫ۙ᩺:I

    sget v6, Ll/ۗ᩵;->֫۠۟:I

    const-string v7, "\u0736\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5879

    const v9, 0x6ad09f3c

    xor-int/2addr v8, v9

    const v9, -0x50118ef0

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x21f7

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 3370
    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_f

    goto/16 :goto_3

    .line 9449
    :sswitch_0
    sget v7, Ll/ۖ;->᩹۟ۘ:I

    if-gez v7, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v7

    if-eqz v7, :cond_c

    goto/16 :goto_4

    .line 4537
    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    .line 147
    :sswitch_4
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ()V

    .line 148
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶ܽ()V

    goto/16 :goto_2

    .line 146
    :sswitch_5
    invoke-virtual {v0, v2, v3}, Ll/۫ۨᩳ;->֫(II)V

    .line 6330
    sget v7, Ll/᩹;->ۤܿܳ:I

    if-eqz v7, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v7, "\u06e8\u06eb"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x6f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1473

    const v9, 0x103c18e0

    xor-int/2addr v8, v9

    const v9, -0x7cf4ee94

    goto :goto_0

    .line 144
    :sswitch_6
    invoke-static {v0}, Ll/֨᩺;->᩷ۡۚ(Ljava/lang/Object;)I

    move-result v2

    .line 145
    invoke-static {v0}, Ll/ۛ;->ܽ۫᩸(Ljava/lang/Object;)I

    move-result v3

    .line 4012
    sget v7, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u06e0\u06eb"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7719

    const v9, -0x2e5cf487

    xor-int/2addr v8, v9

    const v9, -0x877209c

    goto :goto_0

    .line 141
    :sswitch_7
    invoke-static {v0}, Ll/ۛ;->֨ܶᩳ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v7, "\u05a8\u06d8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x4b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2da5

    const v9, -0x71885063

    xor-int/2addr v8, v9

    const v9, -0x2e0eb4fd

    goto/16 :goto_0

    .line 139
    :sswitch_8
    invoke-static {v1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/text/TextWatcher;

    .line 140
    invoke-interface {v7, p1}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    goto :goto_1

    .line 9843
    :sswitch_9
    iget-boolean v7, v0, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez v7, :cond_4

    const-string v7, "\u06e2\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3d97

    const v9, -0x359d02fa    # -3718977.5f

    xor-int/2addr v8, v9

    const v9, 0x7306a611

    goto/16 :goto_0

    :sswitch_a
    return-void

    .line 139
    :sswitch_b
    invoke-static {v1}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u1a74\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xf47

    const v9, 0x7b75497c

    xor-int/2addr v8, v9

    const v9, -0x5e092dcd

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06e4\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3edb

    const v9, -0x2b5c30c

    xor-int/2addr v8, v9

    const v9, -0x627839ba

    goto/16 :goto_0

    :sswitch_c
    iget-object v1, v0, Ll/۫ۨᩳ;->֫ܽ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    const-string v7, "\u06eb\u06df"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x4b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xb8b

    const v9, 0x44fdfcab

    xor-int/2addr v8, v9

    const v9, 0x448fc1ee

    goto/16 :goto_0

    .line 136
    :sswitch_d
    iget-object v0, p0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v7

    if-eq p1, v7, :cond_5

    :cond_4
    :goto_2
    const-string v7, "\u06e4\u05a1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x27

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x56ab

    const v9, -0x7e9babf5

    xor-int/2addr v8, v9

    const v9, -0x35c8fdf7

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06e2\u06e0"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x7f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5d5f

    const v9, 0x1aa374a3

    xor-int/2addr v8, v9

    const v9, -0x2a273a9

    goto/16 :goto_0

    :sswitch_e
    sget v7, Ll/֨۟;->᩹֫᩷:I

    if-eqz v7, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v7, "\u06d6\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4f81

    const v9, 0x3b5e6146

    xor-int/2addr v8, v9

    const v9, 0x74f0a06e

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v7, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v7, "\u05ab\u1a77"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x3f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7713

    const v9, -0x6391b5d

    xor-int/2addr v8, v9

    const v9, 0x61275973

    goto/16 :goto_0

    .line 7414
    :sswitch_10
    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v7, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v7, "\u1a7a\u1a73"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x33b

    const v9, -0x2f57c740

    xor-int/2addr v8, v9

    const v9, 0x575609df

    goto/16 :goto_0

    .line 7816
    :sswitch_11
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u073d\u06db"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x79

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1839

    const v9, -0x8785baa

    xor-int/2addr v8, v9

    const v9, -0x6c0218ee

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e0\u06e0"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x626f

    const v9, -0x6d6071f5

    xor-int/2addr v8, v9

    const v9, 0x1f0cfc2f

    goto/16 :goto_0

    :sswitch_12
    sget v7, Ll/֨۟;->᩹֫᩷:I

    if-eqz v7, :cond_b

    :goto_4
    const-string v7, "\u05ab\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x75

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x25dd

    const v9, 0x7eb88328

    xor-int/2addr v8, v9

    const v9, -0x6a5e26d4

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u1a7a\u06da"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x565d

    const v9, -0x5156ceab

    xor-int/2addr v8, v9

    const v9, -0x2398d0ca

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v7

    if-eqz v7, :cond_d

    :cond_c
    const-string v7, "\u06d9\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x583b

    const v9, -0xf1df7c6

    xor-int/2addr v8, v9

    const v9, 0x742a9dd2

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06d9\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2f1d

    const v9, 0x4d28ee21    # 1.77136144E8f

    xor-int/2addr v8, v9

    const v9, -0x26b169af

    goto/16 :goto_0

    .line 6147
    :sswitch_14
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v7

    if-eqz v7, :cond_e

    :goto_5
    const-string v7, "\u1a75\u1a75"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x17

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x258d

    const v9, 0x74b19bb5

    xor-int/2addr v8, v9

    const v9, -0x2a6ee846

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u05a8\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4e7

    const v9, 0x2c5f999

    xor-int/2addr v8, v9

    const v9, -0x13581cf1

    goto/16 :goto_0

    :sswitch_15
    sget v7, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v7, :cond_10

    :cond_f
    :goto_6
    const-string v7, "\u1a7a\u06d8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x22e9

    const v9, 0x79609361

    xor-int/2addr v8, v9

    const v9, -0xca28f44

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u1a78\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x783

    const v9, 0x7122998d

    xor-int/2addr v8, v9

    const v9, -0x74b6162

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f237f7a -> :sswitch_9
        -0x7782a020 -> :sswitch_1
        -0x6f25ec58 -> :sswitch_2
        -0x6ca11ea8 -> :sswitch_a
        -0x6ad6e13c -> :sswitch_1
        -0x6a880b03 -> :sswitch_7
        -0x697ee2c5 -> :sswitch_9
        -0x5b1a8355 -> :sswitch_11
        -0x5934c41a -> :sswitch_3
        -0x4a0dd8a0 -> :sswitch_c
        -0x483a1cf6 -> :sswitch_b
        -0x4433f4d6 -> :sswitch_12
        -0x42796153 -> :sswitch_15
        -0x3ec1e228 -> :sswitch_2
        -0x3bb0eadf -> :sswitch_c
        -0x3563b5f8 -> :sswitch_e
        -0x3291cf69 -> :sswitch_4
        -0x1dbee232 -> :sswitch_f
        -0x1cf97f61 -> :sswitch_7
        -0x14bde56a -> :sswitch_13
        -0xfcc5d18 -> :sswitch_14
        0x14be922 -> :sswitch_15
        0x7ea08cc -> :sswitch_10
        0xcc080be -> :sswitch_4
        0xed70977 -> :sswitch_e
        0x14e1c79f -> :sswitch_8
        0x178827e7 -> :sswitch_10
        0x21cd6ec5 -> :sswitch_0
        0x2322a03b -> :sswitch_6
        0x23cc2b7d -> :sswitch_5
        0x444995bf -> :sswitch_5
        0x464a100a -> :sswitch_0
        0x573172df -> :sswitch_3
        0x5892ba00 -> :sswitch_d
        0x58c83b0d -> :sswitch_f
        0x59b371f4 -> :sswitch_13
        0x5c0c4b6a -> :sswitch_a
        0x5e497b5f -> :sswitch_8
        0x6204e916 -> :sswitch_6
        0x67bf0d45 -> :sswitch_b
        0x69704fbe -> :sswitch_11
        0x74afb383 -> :sswitch_14
        0x7a6a6090 -> :sswitch_12
        0x7c747c86 -> :sswitch_d
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x2cac6c4c

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    sget v5, Ll/ۛ;->᩺᩻֫:I

    const-string v6, "\u05a1\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x1f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x769d

    const v8, 0x54cdba99

    xor-int/2addr v7, v8

    const v8, 0x1be9a026

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x18f9

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 6
    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_7

    goto/16 :goto_3

    :sswitch_0
    sget v6, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v6, :cond_e

    goto/16 :goto_5

    .line 0
    :sswitch_1
    sget v6, Ll/ۗ᩵;->֫۠۟:I

    if-gez v6, :cond_a

    goto/16 :goto_3

    .line 24
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_6

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    return-void

    :sswitch_5
    add-int v6, p2, p3

    .line 62
    invoke-direct {p0, p2, v6, v2}, Ll/ۜ۫ᩳ;->֫(IILjava/lang/Class;)V

    goto :goto_1

    :sswitch_6
    add-int/2addr p3, p2

    .line 64
    const-class p1, Landroid/text/style/SuggestionSpan;

    invoke-direct {p0, p2, p3, p1}, Ll/ۜ۫ᩳ;->֫(IILjava/lang/Class;)V

    return-void

    .line 55
    :sswitch_7
    invoke-static {v1}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/text/TextWatcher;

    .line 56
    invoke-interface {v6, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    goto :goto_2

    .line 57
    :sswitch_8
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۢ֫()I

    move-result v2

    iput v2, p0, Ll/ۜ۫ᩳ;->᩹:I

    .line 58
    invoke-static {v0}, Ll/֨ۡ;->ۜۧ۟(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    iput v2, p0, Ll/ۜ۫ᩳ;->᩶:I

    .line 61
    sget-object v2, Ll/ۜ۫ᩳ;->ۙ:Ljava/lang/Class;

    if-eqz v2, :cond_0

    const-string v6, "\u0733\u1a74"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4311

    const v8, -0x3beb397d

    xor-int/2addr v7, v8

    const v8, 0x5a2991e5

    goto :goto_0

    :cond_0
    :goto_1
    const-string v6, "\u06da\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1ce5

    const v8, -0x7646f61

    xor-int/2addr v7, v8

    const v8, -0x405b346e

    goto/16 :goto_0

    .line 55
    :sswitch_9
    invoke-static {v1}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u06df\u06e2"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x37cf

    const v8, -0x4e86110f

    xor-int/2addr v7, v8

    const v8, -0xd950e20

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u06dc\u06e4"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xa05

    const v8, 0x487eb098    # 260802.38f

    xor-int/2addr v7, v8

    const v8, -0x71224e84

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_b
    iget-object v1, v0, Ll/۫ۨᩳ;->֫ܽ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    const-string v6, "\u06d8\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2e13

    const v8, 0x1adae29    # 6.380007E-38f

    xor-int/2addr v7, v8

    const v8, -0x1922fa64

    goto/16 :goto_0

    .line 52
    :sswitch_c
    iget-object v0, p0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v6

    if-eq p1, v6, :cond_2

    const-string v6, "\u0733\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x12c5

    const v8, 0x6374cbc2

    xor-int/2addr v7, v8

    const v8, 0x71c28d17

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u073a\u1a77"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v4

    mul-int/lit8 v7, v7, 0xd

    const v8, 0x7057c37b

    xor-int/2addr v7, v8

    const v8, -0x6ce8d50b

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v6, "\u1a75\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x67fb

    const v8, 0x318bb0cc

    xor-int/2addr v7, v8

    const v8, 0x12e57929    # 1.44818E-27f

    goto/16 :goto_0

    .line 58
    :sswitch_e
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u06df\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4353

    const v8, 0x48c47a9d

    xor-int/2addr v7, v8

    const v8, 0x5bcb59ba

    goto/16 :goto_0

    .line 7
    :sswitch_f
    sget-boolean v6, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v6, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v6, "\u06e4\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x17

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x23e3

    const v8, -0x37386bd9

    xor-int/2addr v7, v8

    const v8, 0x7621ff9b

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string v6, "\u06dc\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x37bb

    const v8, -0x244cf10a

    xor-int/2addr v7, v8

    const v8, -0x7c572cb5

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06eb\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x515b

    const v8, -0x1d1e28e0

    xor-int/2addr v7, v8

    const v8, 0x27c9e6f6

    goto/16 :goto_0

    .line 44
    :sswitch_10
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v6

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u0730\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x323b

    const v8, -0x7ef5363c

    xor-int/2addr v7, v8

    const v8, -0x6142f4db

    goto/16 :goto_0

    .line 3
    :sswitch_11
    sget v6, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v6, :cond_9

    :goto_4
    const-string v6, "\u06e8\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x69e7

    const v8, 0x5135b98f

    xor-int/2addr v7, v8

    const v8, 0xcb0af4e

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e7\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1fdb

    const v8, -0x1d5d522f

    xor-int/2addr v7, v8

    const v8, 0x3992640b

    goto/16 :goto_0

    :sswitch_12
    sget v6, Ll/ۛ;->᩺᩻֫:I

    if-ltz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u0736\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x22cf

    const v8, 0x7696f59

    xor-int/2addr v7, v8

    const v8, -0x47a423f0

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u0730\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x35e9

    const v8, 0x426a3b

    xor-int/2addr v7, v8

    const v8, -0x3717f8d7

    goto/16 :goto_0

    :sswitch_13
    sget-boolean v6, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v6, :cond_c

    goto :goto_6

    :cond_c
    const-string v6, "\u06eb\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7a37

    const v8, 0x297e5627

    xor-int/2addr v7, v8

    const v8, 0x5a59c214

    goto/16 :goto_0

    .line 56
    :sswitch_14
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_d

    :goto_6
    const-string v6, "\u1a75\u1a7b"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5031

    const v8, 0x248c3e54

    xor-int/2addr v7, v8

    const v8, 0x2473ce6a

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06d6\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1acd

    const v8, 0x6d59627c

    xor-int/2addr v7, v8

    const v8, 0x9a0aeff

    goto/16 :goto_0

    .line 3
    :sswitch_15
    sget v6, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v6, :cond_f

    :cond_e
    :goto_7
    const-string v6, "\u05ab\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x68f5

    const v8, -0x22bb0008

    xor-int/2addr v7, v8

    const v8, 0x71a3036c

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u1a73\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x18e3

    const v8, -0x71f79c9a

    xor-int/2addr v7, v8

    const v8, -0x6ffb6d56

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e5adc38 -> :sswitch_10
        -0x76091dbf -> :sswitch_14
        -0x737c532d -> :sswitch_12
        -0x6e9b241c -> :sswitch_0
        -0x59985a3f -> :sswitch_b
        -0x52950b6f -> :sswitch_2
        -0x4fd7e52a -> :sswitch_a
        -0x4bdbef1c -> :sswitch_f
        -0x49693e20 -> :sswitch_15
        -0x49036966 -> :sswitch_d
        -0x4891c19d -> :sswitch_12
        -0x465bd76c -> :sswitch_4
        -0x430e21ee -> :sswitch_5
        -0x42748687 -> :sswitch_7
        -0x3501e43f -> :sswitch_f
        -0x32f9cfc8 -> :sswitch_e
        -0x3125fc86 -> :sswitch_a
        -0x308b6be0 -> :sswitch_4
        -0x2b5a6696 -> :sswitch_10
        -0x2a4fefda -> :sswitch_13
        -0x22589391 -> :sswitch_2
        -0x1b5a9872 -> :sswitch_3
        -0x1a293deb -> :sswitch_9
        -0x1006c41b -> :sswitch_11
        -0x948ebb3 -> :sswitch_15
        -0x7827294 -> :sswitch_1
        0x4073669 -> :sswitch_8
        0x7d8af97 -> :sswitch_5
        0xab07e63 -> :sswitch_6
        0xbeacb68 -> :sswitch_9
        0x1c326b30 -> :sswitch_14
        0x1d7ffa9f -> :sswitch_d
        0x1f5d0a54 -> :sswitch_7
        0x23bf95d4 -> :sswitch_c
        0x36bc5226 -> :sswitch_3
        0x3b3c9be7 -> :sswitch_13
        0x4b73dfa0 -> :sswitch_1
        0x4e18eb82 -> :sswitch_6
        0x532ea3d6 -> :sswitch_b
        0x5a472d5c -> :sswitch_8
        0x5b16fb39 -> :sswitch_0
        0x5bed7abb -> :sswitch_e
        0x5f3435b6 -> :sswitch_c
        0x7dfca542 -> :sswitch_11
    .end sparse-switch
.end method

.method public final onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, 0x491464a6    # 607818.4f

    sget p2, Ll/ۗ۬;->ۘܳ᩻:I

    sget p3, Ll/ۗ᩵;->֫۠۟:I

    const-string p4, "\u1a74\u06d6"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x33

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x37b

    const v1, -0x2949fe34    # -1.00059417E14f

    xor-int/2addr v0, v1

    const v1, -0x6e20f42e

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x3ddd

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result p4

    if-lez p4, :cond_7

    goto/16 :goto_1

    .line 2
    :sswitch_0
    sget p4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez p4, :cond_b

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result p4

    if-gez p4, :cond_4

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    :sswitch_4
    return-void

    .line 4
    :sswitch_5
    sget p4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz p4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string p4, "\u1a79\u1a78"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x21

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x675f

    const v1, -0x58426396

    xor-int/2addr v0, v1

    const v1, 0x14e740c0

    goto :goto_0

    .line 1
    :sswitch_6
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result p4

    if-eqz p4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p4, "\u06dc\u0730"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x6287

    const v1, -0x4b4d3bcb

    xor-int/2addr v0, v1

    const v1, 0x691dcf3b

    goto :goto_0

    .line 2
    :sswitch_7
    sget p4, Ll/֡۬;->۠֡᩶:I

    if-gtz p4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string p4, "\u073d\u0730"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x3b

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x516f

    const v1, -0x3b9bac95

    xor-int/2addr v0, v1

    const v1, 0x50315e83

    goto/16 :goto_0

    :sswitch_8
    sget p4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p4, "\u1a76\u1a79"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x5137

    const v1, 0xead9edf

    xor-int/2addr v0, v1

    const v1, -0x6e87d50a

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget p4, Ll/֨۟;->᩹֫᩷:I

    if-eqz p4, :cond_5

    :cond_4
    :goto_1
    const-string p4, "\u1a73\u1a7a"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1cab

    const v1, -0x678f56f7

    xor-int/2addr v0, v1

    const v1, 0x776e0eec

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u05ab\u1a7a"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x1557

    const v1, 0x5a35d250

    xor-int/2addr v0, v1

    const v1, -0x3fedcf87

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result p4

    if-eqz p4, :cond_6

    goto :goto_2

    :cond_6
    const-string p4, "\u06e8\u0730"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2d57

    const v1, -0x69519b19

    xor-int/2addr v0, v1

    const v1, 0x1f2e4340

    goto/16 :goto_0

    :sswitch_b
    sget-boolean p4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p4, :cond_8

    :cond_7
    :goto_2
    const-string p4, "\u06d6\u1a79"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4f0b

    const v1, 0x328d8dc7

    xor-int/2addr v0, v1

    const v1, 0x993ab05

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u0733\u06da"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x41

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x12c7

    const v1, -0x570039fe

    xor-int/2addr v0, v1

    const v1, -0x5aa0dd80

    goto/16 :goto_0

    :sswitch_c
    sget p4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz p4, :cond_9

    :goto_3
    const-string p4, "\u073f\u06e1"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x7f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4cb1

    const v1, -0x226acb87

    xor-int/2addr v0, v1

    const v1, -0x725cc39d

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u0733\u073f"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x11

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2069

    const v1, 0x6dd6c110

    xor-int/2addr v0, v1

    const v1, 0x36f4045e

    goto/16 :goto_0

    :sswitch_d
    sget p4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz p4, :cond_a

    :goto_4
    const-string p4, "\u1a74\u1a73"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x67e5

    const v1, 0x72a34446

    xor-int/2addr v0, v1

    const v1, 0x231f4043

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u0736\u05a8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x61

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7b01

    const v1, 0x227c41a4

    xor-int/2addr v0, v1

    const v1, -0x2b4896bf

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget p4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz p4, :cond_c

    :cond_b
    const-string p4, "\u1a7a\u0736"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x47

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5231

    const v1, -0x7dc2993c

    xor-int/2addr v0, v1

    const v1, -0x2d6d281a

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06d7\u06e2"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x2d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x7213

    const v1, 0x284ccc0e

    xor-int/2addr v0, v1

    const v1, 0x41da2f3c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce19a1e -> :sswitch_b
        -0x55cc62b8 -> :sswitch_d
        -0x4ef421c5 -> :sswitch_d
        -0x45fbbbe7 -> :sswitch_7
        -0x43d5cde9 -> :sswitch_4
        -0x4378e1b2 -> :sswitch_0
        -0x1a568e8f -> :sswitch_c
        -0x180356ba -> :sswitch_5
        -0x5868319 -> :sswitch_2
        0x7e6cca -> :sswitch_1
        0x4ce0af2 -> :sswitch_e
        0xd602562 -> :sswitch_a
        0x1266e462 -> :sswitch_4
        0x1c1391f6 -> :sswitch_0
        0x246f3f1d -> :sswitch_7
        0x38e7596e -> :sswitch_3
        0x3d57c660 -> :sswitch_9
        0x3eafddbe -> :sswitch_b
        0x48e8db77 -> :sswitch_c
        0x4b644c87 -> :sswitch_5
        0x551418e3 -> :sswitch_2
        0x582f2e35 -> :sswitch_3
        0x58e6fc97 -> :sswitch_8
        0x5d6349ea -> :sswitch_1
        0x5de21fa4 -> :sswitch_6
        0x5f3aae6f -> :sswitch_a
        0x6da47e3f -> :sswitch_9
        0x7506a17e -> :sswitch_8
        0x7beab8b0 -> :sswitch_6
        0x7d9217d0 -> :sswitch_e
    .end sparse-switch
.end method

.method public final onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V
    .locals 7

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    const v0, -0x4488e598

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v3, "\u073f\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b3

    const v5, -0x143dbfb

    xor-int/2addr v4, v5

    const v5, 0x17533c91

    :goto_0
    xor-int/2addr v3, v5

    :goto_1
    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x19ff

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 21
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_1c

    goto/16 :goto_f

    .line 1109
    :sswitch_0
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_1b

    goto :goto_3

    .line 700
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_12

    goto :goto_2

    .line 201
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    const-string v3, "\u1a78\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e1d

    const v5, -0x3f6572e7

    xor-int/2addr v4, v5

    const v5, -0x23978f9c

    goto :goto_0

    .line 680
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_15

    goto/16 :goto_e

    .line 1181
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-lez v3, :cond_e

    goto/16 :goto_e

    :sswitch_5
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-nez v3, :cond_18

    goto/16 :goto_e

    .line 761
    :sswitch_6
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v3, :cond_10

    goto/16 :goto_e

    :sswitch_7
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v3, :cond_1

    goto/16 :goto_e

    :cond_1
    :goto_3
    const-string v3, "\u1a78\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4569

    const v5, 0x24e2306a

    xor-int/2addr v4, v5

    const v5, 0x138458c8

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_e

    .line 15
    :sswitch_9
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 192
    :sswitch_a
    iget v3, p4, Ll/ܳۨᩳ;->֫:I

    if-nez v3, :cond_5

    goto :goto_4

    .line 193
    :sswitch_b
    invoke-static {p3}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    goto/16 :goto_7

    .line 188
    :sswitch_c
    iput-boolean p5, p4, Ll/ܳۨᩳ;->ܿ:Z

    goto/16 :goto_5

    :sswitch_d
    if-eqz p4, :cond_2

    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3437

    const v5, -0x5dbecb3b

    xor-int/2addr v4, v5

    const v5, -0x583e2f9f

    goto/16 :goto_0

    :cond_2
    :goto_4
    const-string v3, "\u1a75\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b47

    const v5, 0x7ee32081

    xor-int/2addr v4, v5

    const v5, 0x15c0cb4c

    goto/16 :goto_0

    .line 187
    :sswitch_e
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isSelectingMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "\u1a76\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7fb1

    const v5, 0x74e4c263

    xor-int/2addr v4, v5

    const v5, 0x455c2c00    # 3522.75f

    goto/16 :goto_0

    .line 191
    :sswitch_f
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    if-ltz v3, :cond_5

    const-string v3, "\u06e4\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2bc1

    const v5, -0x7e7b0790

    xor-int/2addr v4, v5

    const v5, 0x30672d4f

    goto/16 :goto_0

    .line 169
    :sswitch_10
    invoke-static {p3}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-static {v3}, Ll/ۗ᩶;->֨֫ۜ(Ljava/lang/Object;)I

    move-result v3

    if-ne p6, v3, :cond_7

    goto :goto_6

    .line 170
    :sswitch_11
    invoke-virtual {p3}, Ll/۫ۨᩳ;->۟ܽ()V

    const/4 v3, 0x0

    .line 1330
    invoke-virtual {p3, v3}, Ll/۫ۨᩳ;->֫(Z)V

    .line 172
    invoke-static {p3}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    goto/16 :goto_8

    :sswitch_12
    if-eqz p4, :cond_3

    const-string v3, "\u1a73\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ebd

    const v5, 0x72c010f8

    xor-int/2addr v4, v5

    const v5, 0xf398271

    goto/16 :goto_0

    :cond_3
    :goto_5
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x9f3

    const v5, -0xde0b9b1

    xor-int/2addr v4, v5

    const v5, -0x4a1cff65

    goto/16 :goto_0

    :sswitch_13
    return-void

    .line 182
    :sswitch_14
    iput-boolean p5, p4, Ll/ܳۨᩳ;->ᩳ:Z

    goto/16 :goto_9

    :sswitch_15
    if-eqz p6, :cond_4

    const-string v3, "\u0730\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ebb

    const v5, -0x6cce69f6

    xor-int/2addr v4, v5

    const v5, -0x11a48651

    goto/16 :goto_0

    :cond_4
    :goto_6
    const-string v3, "\u1a7a\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e57

    const v5, 0x1555f7b4

    xor-int/2addr v4, v5

    const v5, -0x2fd85b0c

    goto/16 :goto_0

    .line 174
    :sswitch_16
    invoke-virtual {p3}, Ll/۫ۨᩳ;->ᩳᩳ()V

    goto/16 :goto_c

    .line 186
    :sswitch_17
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45a3

    const v5, 0x251a766f

    xor-int/2addr v4, v5

    const v5, -0x2f4a91c4

    goto/16 :goto_0

    :cond_5
    :goto_7
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4799

    const v5, -0x58a5a279

    xor-int/2addr v4, v5

    const v5, 0x32915d9f

    goto/16 :goto_0

    .line 179
    :sswitch_18
    iget v3, p4, Ll/ܳۨᩳ;->֫:I

    if-nez v3, :cond_6

    goto/16 :goto_a

    :cond_6
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2959

    const v5, 0x3dfc4e1b

    xor-int/2addr v4, v5

    const v5, 0x66673dc6

    goto/16 :goto_0

    .line 180
    :sswitch_19
    invoke-static {p3}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    goto :goto_9

    .line 165
    :sswitch_1a
    invoke-static {p3}, Ll/ۗ۬;->᩷ۢᩴ(Ljava/lang/Object;)I

    move-result p6

    .line 166
    invoke-static {p3}, Ll/ۛ;->ܽ۫᩸(Ljava/lang/Object;)I

    move-result v3

    .line 167
    invoke-virtual {p3, p6, v3}, Ll/۫ۨᩳ;->֫(II)V

    .line 168
    invoke-virtual {p3}, Ll/۫ۨᩳ;->ۡ()V

    if-ne p6, v3, :cond_7

    const-string v3, "\u1a79\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55fd

    const v5, 0x462156c5

    xor-int/2addr v4, v5

    const v5, 0xdaf4382

    goto/16 :goto_0

    :cond_7
    :goto_8
    const-string v3, "\u1a73\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6679

    const v5, 0x2b72d5cc

    xor-int/2addr v4, v5

    const v5, 0x385e42dd

    goto/16 :goto_0

    .line 177
    :sswitch_1b
    instance-of v3, p2, Landroid/text/style/ParagraphStyle;

    if-eqz v3, :cond_8

    goto/16 :goto_b

    :cond_8
    :goto_9
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22e7

    const v5, 0x433d8fb4

    xor-int/2addr v4, v5

    const v5, 0x59886086

    goto/16 :goto_0

    :sswitch_1c
    if-eqz p4, :cond_9

    const-string v3, "\u1a78\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x529f

    const v5, -0x316cb260

    xor-int/2addr v4, v5

    const v5, 0x387aaec6

    goto/16 :goto_0

    :cond_9
    :goto_a
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7cfb

    const v5, -0x191d22c2

    xor-int/2addr v4, v5

    const v5, -0x61251b26

    goto/16 :goto_0

    .line 164
    :sswitch_1d
    invoke-static {p3}, Ll/ۛ;->֨ܶᩳ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x62fb

    const v5, -0x5a074b2e

    xor-int/2addr v4, v5

    const v5, -0x7376e281

    goto/16 :goto_0

    .line 176
    :sswitch_1e
    iget-object p4, p3, Ll/۫ۨᩳ;->᩺ۧ:Ll/ܳۨᩳ;

    .line 177
    instance-of p5, p2, Landroid/text/style/UpdateAppearance;

    const/4 v3, 0x1

    if-nez p5, :cond_a

    const-string p5, "\u06df\u06eb"

    invoke-static {p5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p5

    xor-int/2addr p5, v1

    xor-int v4, p5, v2

    mul-int/lit16 v4, v4, 0x68af

    const v5, 0x13e03809

    xor-int/2addr v4, v5

    const v5, 0xc39ee38

    xor-int/2addr p5, v5

    move v3, p5

    const/4 p5, 0x1

    goto/16 :goto_1

    :cond_a
    const/4 p5, 0x1

    :goto_b
    const-string v3, "\u06df\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d0d

    const v5, -0x2e2e041f

    xor-int/2addr v4, v5

    const v5, -0x5a96ccf7

    goto/16 :goto_0

    .line 164
    :sswitch_1f
    sget-object p3, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    iget-object v3, p0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    if-ne p2, p3, :cond_b

    const-string p3, "\u06d8\u06e0"

    invoke-static {p3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p3

    xor-int/2addr p3, v2

    mul-int/lit8 p3, p3, -0x61

    xor-int v4, p3, v1

    mul-int/lit16 v4, v4, -0x2365

    const v5, -0x555d6cb8

    xor-int/2addr v4, v5

    const v5, -0x33adbc5

    xor-int/2addr p3, v5

    move-object v6, v3

    move v3, p3

    move-object p3, v6

    goto/16 :goto_1

    :cond_b
    move-object p3, v3

    :cond_c
    :goto_c
    const-string v3, "\u06d8\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xd2f

    const v5, -0x2541d101

    xor-int/2addr v4, v5

    const v5, 0x313027a1

    goto/16 :goto_0

    .line 830
    :sswitch_20
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_d

    const-string v3, "\u0736\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2dbd

    const v5, 0x7b8c64da

    xor-int/2addr v4, v5

    const v5, 0x1e6fdae6

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4599

    const v5, 0x46448844

    xor-int/2addr v4, v5

    const v5, 0x1c3f206b

    goto/16 :goto_0

    .line 1261
    :sswitch_21
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_f

    :cond_e
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x54f

    const v5, 0x44e50e3b

    xor-int/2addr v4, v5

    const v5, -0xbdb1220

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06e0\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64b5

    const v5, 0x3a819b3d

    xor-int/2addr v4, v5

    const v5, 0x29f00847

    goto/16 :goto_0

    :sswitch_22
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_11

    :cond_10
    const-string v3, "\u1a79\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d15

    const v5, -0x5b89d089

    xor-int/2addr v4, v5

    const v5, 0x682b4d2b

    goto/16 :goto_0

    :cond_11
    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x329d

    const v5, -0x6a3878e0

    xor-int/2addr v4, v5

    const v5, 0x1cc1a11f

    goto/16 :goto_0

    :sswitch_23
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_13

    :cond_12
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e2d

    const v5, -0x1c65d612

    xor-int/2addr v4, v5

    const v5, -0x71768954

    goto/16 :goto_0

    :cond_13
    const-string v3, "\u06e4\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77af

    const v5, 0x551e4dc7

    xor-int/2addr v4, v5

    const v5, 0x5b9b68a7

    goto/16 :goto_0

    :sswitch_24
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_14

    goto :goto_d

    :cond_14
    const-string v3, "\u06e7\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x46c7

    const v5, 0x4ba66f23    # 2.1814854E7f

    xor-int/2addr v4, v5

    const v5, -0x41635ab3

    goto/16 :goto_0

    .line 700
    :sswitch_25
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_16

    :cond_15
    const-string v3, "\u06e2\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3337

    const v5, -0x6760a7cc

    xor-int/2addr v4, v5

    const v5, 0x4a11df92    # 2389988.5f

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2743

    const v5, 0x36c04d63

    xor-int/2addr v4, v5

    const v5, -0x5778c6fa

    goto/16 :goto_0

    :sswitch_26
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_17

    goto :goto_e

    :cond_17
    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5723

    const v5, 0x668b6665

    xor-int/2addr v4, v5

    const v5, 0x4b610d59    # 1.4749017E7f

    goto/16 :goto_0

    .line 147
    :sswitch_27
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v3

    if-eqz v3, :cond_19

    :cond_18
    :goto_d
    const-string v3, "\u073d\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7fad

    const v5, -0x29e198ff

    xor-int/2addr v4, v5

    const v5, 0x12d5ba02

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e4\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x527d

    const v5, 0x7c3e7a85

    xor-int/2addr v4, v5

    const v5, 0x3f13d85a

    goto/16 :goto_0

    .line 845
    :sswitch_28
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v3

    if-ltz v3, :cond_1a

    :goto_e
    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x533b

    const v5, 0x6f20f7bb

    xor-int/2addr v4, v5

    const v5, 0x54812753

    goto/16 :goto_0

    :cond_1a
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d19

    const v5, 0x4d9105bb    # 3.04133984E8f

    xor-int/2addr v4, v5

    const v5, 0x4e171cf9    # 6.3381459E8f

    goto/16 :goto_0

    :cond_1b
    :goto_f
    const-string v3, "\u1a79\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76ad

    const v5, -0x50e69730

    xor-int/2addr v4, v5

    const v5, -0x704bb073

    goto/16 :goto_0

    :cond_1c
    const-string v3, "\u0733\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5cb7

    const v5, 0x2349a179

    xor-int/2addr v4, v5

    const v5, 0x35d11b5b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fafce44 -> :sswitch_1c
        -0x7d483f2a -> :sswitch_f
        -0x77400df3 -> :sswitch_2
        -0x756efd8c -> :sswitch_1c
        -0x755d5a3d -> :sswitch_3
        -0x6ee498b5 -> :sswitch_b
        -0x67457981 -> :sswitch_26
        -0x63af2eeb -> :sswitch_e
        -0x5dae416c -> :sswitch_12
        -0x5c49b014 -> :sswitch_27
        -0x5c31586d -> :sswitch_7
        -0x59102fc1 -> :sswitch_19
        -0x584f7506 -> :sswitch_4
        -0x55d9f1c9 -> :sswitch_1e
        -0x51d38312 -> :sswitch_24
        -0x4ffecff3 -> :sswitch_16
        -0x4c876954 -> :sswitch_5
        -0x4c09a869 -> :sswitch_1f
        -0x469040ac -> :sswitch_25
        -0x46046e67 -> :sswitch_1d
        -0x4597fc6d -> :sswitch_6
        -0x43886453 -> :sswitch_1a
        -0x4120f30f -> :sswitch_23
        -0x3fb56b84 -> :sswitch_26
        -0x3bae91d4 -> :sswitch_20
        -0x317f5002 -> :sswitch_16
        -0x30e9e410 -> :sswitch_22
        -0x2f27ae4b -> :sswitch_22
        -0x2a27e30f -> :sswitch_18
        -0x28251291 -> :sswitch_7
        -0x268165ca -> :sswitch_1
        -0x259f49a2 -> :sswitch_8
        -0x22398738 -> :sswitch_d
        -0x209a7f2e -> :sswitch_a
        -0x1e84c776 -> :sswitch_1d
        -0x1e6743dc -> :sswitch_1b
        -0x1cd5beec -> :sswitch_f
        -0x1c88da49 -> :sswitch_1e
        -0x1bc530b7 -> :sswitch_4
        -0x17eb5159 -> :sswitch_9
        -0x17730f9a -> :sswitch_24
        -0x1406cf90 -> :sswitch_9
        -0x10fa7fe8 -> :sswitch_11
        -0xef76e44 -> :sswitch_a
        -0xe9f3091 -> :sswitch_21
        -0xc314a81 -> :sswitch_0
        -0xb976d96 -> :sswitch_21
        0xdec4b5 -> :sswitch_14
        0x12ccd87 -> :sswitch_13
        0x53b3635 -> :sswitch_27
        0x8c46a7c -> :sswitch_c
        0xae7c57f -> :sswitch_2
        0xf4103dc -> :sswitch_17
        0x11b4a5a8 -> :sswitch_5
        0x12d6b0ff -> :sswitch_3
        0x13c0a89a -> :sswitch_28
        0x1da84bbb -> :sswitch_25
        0x1e55d403 -> :sswitch_10
        0x23854be1 -> :sswitch_6
        0x2fd1ec1d -> :sswitch_15
        0x30ae6eb2 -> :sswitch_14
        0x3bbc547b -> :sswitch_11
        0x3d17a953 -> :sswitch_12
        0x430a6ab5 -> :sswitch_b
        0x46aadf0e -> :sswitch_17
        0x4773f858 -> :sswitch_d
        0x47da2563 -> :sswitch_0
        0x4ae280c6 -> :sswitch_23
        0x4f161576 -> :sswitch_1f
        0x5139a1db -> :sswitch_1a
        0x52700249 -> :sswitch_1
        0x530c36c3 -> :sswitch_c
        0x56fee716 -> :sswitch_8
        0x59f32218 -> :sswitch_e
        0x5b65e2c1 -> :sswitch_15
        0x5c55abf8 -> :sswitch_1b
        0x5e38ffc1 -> :sswitch_18
        0x6318785a -> :sswitch_28
        0x74df7d00 -> :sswitch_10
        0x762bdfb7 -> :sswitch_19
        0x7723f527 -> :sswitch_13
        0x7d2a992d -> :sswitch_20
    .end sparse-switch
.end method

.method public final onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, -0x4aff03d1

    sget p2, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget p3, Ll/֫᩵;->ܶ᩻᩷:I

    const-string p4, "\u06d7\u05a8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x3cfd

    const v1, -0x30bd9c1e

    xor-int/2addr v0, v1

    const v1, -0x1f294e13

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x4edd

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget p4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p4, :cond_b

    goto/16 :goto_1

    :sswitch_0
    sget p4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz p4, :cond_1

    goto/16 :goto_2

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result p4

    if-eqz p4, :cond_5

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :sswitch_4
    return-void

    .line 3
    :sswitch_5
    sget p4, Ll/ۛ;->᩺᩻֫:I

    if-ltz p4, :cond_0

    const-string p4, "\u06e7\u05ab"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x57

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x5e29

    const v1, -0x45531a5

    xor-int/2addr v0, v1

    const v1, 0x5d273640

    goto :goto_0

    :cond_0
    const-string p4, "\u0736\u1a77"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2539

    const v1, 0x39fc0708

    xor-int/2addr v0, v1

    const v1, -0x56d35d04

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result p4

    if-eqz p4, :cond_2

    :cond_1
    const-string p4, "\u06e4\u1a77"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x19

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x2ac1

    const v1, -0x1ff754e3

    xor-int/2addr v0, v1

    const v1, -0x1624ae75

    goto :goto_0

    :cond_2
    const-string p4, "\u06d6\u06db"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x41

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7b35

    const v1, -0x554c35cc

    xor-int/2addr v0, v1

    const v1, -0x385b7f33

    goto/16 :goto_0

    :sswitch_7
    sget p4, Ll/֡֡;->֫ۤܳ:I

    if-ltz p4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string p4, "\u1a76\u073f"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1d59

    const v1, 0x635a739

    xor-int/2addr v0, v1

    const v1, 0x7086ff67

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget p4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string p4, "\u06d8\u1a77"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x7bc7

    const v1, -0x1894a8a4

    xor-int/2addr v0, v1

    const v1, 0x48fd5bd4    # 518878.62f

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget p4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz p4, :cond_6

    :cond_5
    :goto_1
    const-string p4, "\u06ec\u05ab"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x15

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7c59

    const v1, -0x786d2205

    xor-int/2addr v0, v1

    const v1, 0x5642d6ea

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u1a74\u06d9"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x61

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x13db

    const v1, 0x2248ce85

    xor-int/2addr v0, v1

    const v1, -0x26e0abbc

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean p4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez p4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string p4, "\u06d8\u1a78"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4c65

    const v1, 0x4b6d44c1    # 1.5549633E7f

    xor-int/2addr v0, v1

    const v1, -0x21507588

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result p4

    if-gtz p4, :cond_8

    goto :goto_3

    :cond_8
    const-string p4, "\u05a8\u1a7b"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x4d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1b9b

    const v1, 0x3ea21a09

    xor-int/2addr v0, v1

    const v1, 0x3dd06b3

    goto/16 :goto_0

    :sswitch_c
    sget p4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz p4, :cond_9

    goto :goto_3

    :cond_9
    const-string p4, "\u06d9\u05ab"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0xb

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x3f7b

    const v1, 0x2d352d3

    xor-int/2addr v0, v1

    const v1, 0x1e7ca2b6

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget p4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p4, :cond_a

    :goto_2
    const-string p4, "\u1a79\u1a76"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x3b

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x7ecd

    const v1, 0x5ae2d836

    xor-int/2addr v0, v1

    const v1, -0x1d0fda8

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u06d7\u073a"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4ebf

    const v1, 0x43027cea

    xor-int/2addr v0, v1

    const v1, -0x76629325

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget p4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p4, :cond_c

    :cond_b
    :goto_3
    const-string p4, "\u06dc\u05a8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2479

    const v1, 0x3116324d

    xor-int/2addr v0, v1

    const v1, 0x492e81c4    # 714780.25f

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06d9\u1a79"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x37

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x43df

    const v1, 0x1b8800aa

    xor-int/2addr v0, v1

    const v1, 0x606d723

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f5f285e -> :sswitch_d
        -0x7be9f185 -> :sswitch_a
        -0x59ac84d5 -> :sswitch_a
        -0x57ee3d9e -> :sswitch_3
        -0x4a62ecfd -> :sswitch_7
        -0x49831821 -> :sswitch_e
        -0x268c75a1 -> :sswitch_0
        -0x2651d68a -> :sswitch_8
        -0x262d962d -> :sswitch_6
        -0x19d9125d -> :sswitch_1
        -0x180afca0 -> :sswitch_7
        -0x127bc7e4 -> :sswitch_2
        -0x370d000 -> :sswitch_0
        0x624eed6 -> :sswitch_4
        0xc785b9a -> :sswitch_8
        0x10205fea -> :sswitch_9
        0x155e45b8 -> :sswitch_5
        0x245c147f -> :sswitch_4
        0x262f4b6d -> :sswitch_6
        0x269501b3 -> :sswitch_c
        0x3139192a -> :sswitch_1
        0x3964d9f7 -> :sswitch_5
        0x4da9627e -> :sswitch_2
        0x54204d06 -> :sswitch_b
        0x58c99073 -> :sswitch_b
        0x64bc2f76 -> :sswitch_e
        0x672108b8 -> :sswitch_d
        0x71a7d2f3 -> :sswitch_9
        0x7b0c008f -> :sswitch_3
        0x7bc265f2 -> :sswitch_c
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

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

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, -0x40337955

    sget v35, Ll/ۗ۬;->ۘܳ᩻:I

    sget v36, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v37, "\u06e4\u073f"

    invoke-static/range {v37 .. v37}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v37

    add-int v37, v37, v35

    mul-int/lit8 v37, v37, -0x61

    xor-int v5, v37, v36

    mul-int/lit16 v5, v5, -0x179

    const v39, -0x41c3bed1

    xor-int v5, v5, v39

    const v39, -0x22aa0d56

    xor-int v37, v37, v39

    move-object v10, v9

    move-object/from16 v9, v16

    move-wide/from16 v22, v17

    move-object/from16 v30, v24

    move-wide/from16 v11, v25

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v17, v8

    move-object/from16 v25, v14

    move-object/from16 v24, v20

    const/4 v14, 0x0

    move-object v8, v7

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v3, v34, v36

    mul-int/lit16 v3, v3, -0x6b61

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v5

    xor-int v34, v37, v3

    sparse-switch v34, :sswitch_data_0

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v12, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v2, v10, :cond_19

    move-object/from16 v18, v7

    move-object/from16 v23, v8

    move v7, v10

    move/from16 v17, v12

    goto/16 :goto_22

    .line 8910
    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_38

    :cond_1
    const-string v3, "\u06eb\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x37

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x39a7

    const v31, 0x4900e08a

    xor-int v5, v5, v31

    const v31, 0x35e60bbe

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v3

    if-lez v3, :cond_3

    :cond_2
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_37

    :cond_3
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_36

    :sswitch_2
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v3, "\u06d6\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v35, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x6a7

    const v31, 0x24c6746

    xor-int v5, v5, v31

    const v31, 0xdc79487    # 1.2300079E-30f

    goto/16 :goto_6

    :sswitch_3
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v3, :cond_2

    goto :goto_2

    .line 822
    :sswitch_4
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_32

    .line 5965
    :sswitch_5
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_6

    goto/16 :goto_1

    :cond_6
    :goto_2
    const-string v3, "\u0736\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, 0x3b

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x2785

    const v31, 0x192253d5

    xor-int v5, v5, v31

    const v31, 0x72e9e5d9

    goto/16 :goto_6

    .line 7354
    :sswitch_6
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_0

    :goto_3
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_33

    :sswitch_7
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_35

    .line 4583
    :sswitch_8
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto :goto_3

    :sswitch_9
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    :sswitch_a
    sub-int v1, v14, v2

    .line 9158
    invoke-static {v13, v1}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v1

    sub-int v1, v14, v1

    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_a

    :sswitch_b
    if-gez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    move/from16 v28, v1

    move v5, v4

    move-object/from16 v26, v9

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v30, v28

    move/from16 v25, v5

    move-object/from16 v4, p1

    goto/16 :goto_1a

    .line 109
    :sswitch_c
    invoke-virtual {v7, v11, v12}, Ll/᩻۫ᩳ;->֫(J)V

    goto/16 :goto_7

    .line 130
    :sswitch_d
    invoke-virtual {v6, v15}, Ll/۫ۨᩳ;->ۢ(I)V

    goto/16 :goto_4

    :sswitch_e
    if-ge v2, v14, :cond_a

    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    mul-int/lit8 v3, v3, -0x3

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x7a91

    const v31, 0x51f9a76f

    xor-int v5, v5, v31

    const v31, -0x8591dc1

    goto/16 :goto_6

    :sswitch_f
    if-ltz v4, :cond_b

    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x1bb5

    const v31, 0x1eba9324

    xor-int v5, v5, v31

    const v31, -0x5ae5aec7

    goto/16 :goto_6

    :sswitch_10
    const/4 v3, -0x1

    .line 9162
    iput v3, v10, Ll/᩺֫ܿ;->֨ۧ:I

    iput v3, v10, Ll/᩺֫ܿ;->۠ۧ:I

    .line 9163
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ܺ()V

    .line 9164
    invoke-static {v6}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    move-wide/from16 v43, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_29

    .line 107
    :sswitch_11
    invoke-virtual {v8}, Ll/ۜܺܿ;->ۧ()J

    move-result-wide v31

    const-wide/16 v37, -0x1

    cmp-long v3, v31, v37

    if-nez v3, :cond_c

    const-string v3, "\u0736\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    mul-int/lit8 v3, v3, 0x1f

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x7cbb

    const v31, 0x4cd9c936    # 1.14182576E8f

    xor-int v5, v5, v31

    const v31, -0x73edfe92

    goto/16 :goto_6

    .line 129
    :sswitch_12
    iget v3, v0, Ll/ۜ۫ᩳ;->᩹:I

    if-eq v3, v15, :cond_9

    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, -0x7b

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x807

    const v31, -0x23dcca57

    xor-int v5, v5, v31

    const v31, -0x2898d270

    goto/16 :goto_6

    :cond_9
    :goto_4
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_30

    :sswitch_13
    if-lt v2, v4, :cond_a

    const-string v3, "\u05a8\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x442d

    const v31, 0x113bd6e7

    xor-int v5, v5, v31

    const v31, -0x45774fc2

    goto :goto_6

    :cond_a
    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_9

    :sswitch_14
    if-eq v4, v1, :cond_b

    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x6eb9

    const v31, 0x5124f3b8

    xor-int v5, v5, v31

    const v31, -0x74c3bcf6

    goto :goto_6

    :cond_b
    :goto_5
    const-string v3, "\u06d9\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x3d63

    const v31, -0x8c6141

    xor-int v5, v5, v31

    const v31, 0x74f26b8a

    goto :goto_6

    .line 106
    :sswitch_15
    invoke-virtual {v8}, Ll/ۜܺܿ;->᩻()Ll/ܶۜܿ;

    move-result-object v3

    if-ne v9, v3, :cond_c

    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, -0x2b

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x14c9

    const v31, 0x7e86e01c

    xor-int v5, v5, v31

    const v31, -0x18054431

    :goto_6
    xor-int v37, v3, v31

    goto/16 :goto_0

    :cond_c
    :goto_7
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-wide/from16 v18, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v23, v8

    move-object v11, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    goto/16 :goto_20

    .line 125
    :sswitch_16
    invoke-virtual {v6}, Ll/۫ۨᩳ;->֡ۧ()Z

    move-result v3

    move-object/from16 v5, v30

    invoke-interface {v5, v3}, Ll/᩵ۨᩳ;->֫(Z)V

    .line 126
    iget-object v3, v6, Ll/۫ۨᩳ;->᩷֫:Ll/᩵ۨᩳ;

    move/from16 v30, v1

    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۚ()Z

    move-result v1

    move/from16 v31, v4

    invoke-virtual {v6}, Ll/۫ۨᩳ;->֡()Z

    move-result v4

    invoke-interface {v3, v1, v4}, Ll/᩵ۨᩳ;->֫(ZZ)V

    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v5

    move-object/from16 v33, v24

    move/from16 v5, v26

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    goto/16 :goto_d

    :sswitch_17
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    .line 128
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۢ֫()I

    move-result v15

    if-nez v29, :cond_d

    const-string v1, "\u1a75\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v36

    mul-int/lit8 v1, v1, -0x37

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, 0x6899

    const v4, 0x5eaf211e

    xor-int/2addr v3, v4

    const v4, 0x4332d430

    goto :goto_8

    :cond_d
    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    move-wide/from16 v43, v22

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_30

    :sswitch_18
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    if-lez v13, :cond_e

    const-string v1, "\u073f\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, 0x77

    xor-int v3, v1, v36

    mul-int/lit16 v3, v3, 0x7c9f

    const v4, 0xf72de1b

    xor-int/2addr v3, v4

    const v4, -0x4d4bf238

    :goto_8
    xor-int v37, v1, v4

    move/from16 v1, v30

    move/from16 v4, v31

    goto/16 :goto_b

    :cond_e
    :goto_9
    move v1, v14

    :goto_a
    const-string v3, "\u06dc\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v4, v3, v35

    mul-int/lit16 v4, v4, -0x587b

    const v30, 0x4755aaf5

    xor-int v4, v4, v30

    const v30, -0x48375259

    xor-int v37, v3, v30

    move-object/from16 v30, v5

    move v5, v4

    move/from16 v4, v31

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v26, v1

    move/from16 v27, v3

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v25, v4

    move-object/from16 v24, v5

    move/from16 v5, v26

    move-object/from16 v4, p1

    move-object/from16 v26, v9

    move/from16 v9, p3

    goto/16 :goto_e

    :sswitch_1a
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v28, v1

    move/from16 v41, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move/from16 v40, v27

    move/from16 v25, v4

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    goto/16 :goto_14

    :sswitch_1b
    move-object/from16 v3, v25

    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    .line 104
    invoke-virtual {v8, v3}, Ll/ۜܺܿ;->ܿ(Ll/᩶᩸ᩳ;)V

    cmp-long v25, v11, v22

    if-ltz v25, :cond_f

    const-string v25, "\u073d\u073a"

    invoke-static/range {v25 .. v25}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v25

    xor-int v25, v25, v35

    move-object/from16 v31, v3

    xor-int v3, v25, v36

    mul-int/lit16 v3, v3, 0xb33

    const v32, -0x3b5bf38

    xor-int v3, v3, v32

    const v32, -0x1909b380

    xor-int v37, v25, v32

    move/from16 v1, v30

    move-object/from16 v25, v31

    :goto_b
    move-object/from16 v30, v5

    goto/16 :goto_c

    :cond_f
    move-object/from16 v31, v3

    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v4, p1

    move-object/from16 v24, v5

    move-object v11, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-wide/from16 v18, v22

    move/from16 v22, v41

    move/from16 v9, p3

    goto/16 :goto_1f

    :sswitch_1c
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 119
    invoke-virtual {v3, v4, v2, v9, v1}, Ll/᩸ܽܿ;->ۧ(Ljava/lang/CharSequence;III)V

    move-object/from16 v33, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v21, v5

    goto/16 :goto_1d

    :sswitch_1d
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    invoke-static/range {v20 .. v20}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v33, v3

    move-object/from16 v3, v32

    check-cast v3, Landroid/text/TextWatcher;

    .line 123
    invoke-interface {v3, v4, v2, v9, v1}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_16

    :sswitch_1e
    move/from16 v30, v1

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move/from16 v1, p4

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    .line 124
    iget-object v3, v6, Ll/۫ۨᩳ;->᩷֫:Ll/᩵ۨᩳ;

    if-eqz v3, :cond_10

    const-string v24, "\u1a75\u06da"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v36, v24

    mul-int/lit8 v24, v24, 0x5d

    move-object/from16 v32, v3

    xor-int v3, v24, v35

    mul-int/lit16 v3, v3, -0x2cff

    const v37, 0x74bc41e2

    xor-int v3, v3, v37

    const v37, 0x9409be1

    xor-int v37, v24, v37

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    :goto_c
    move v5, v3

    goto/16 :goto_0

    :cond_10
    move-object/from16 v32, v3

    :goto_d
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    move-wide/from16 v37, v11

    xor-int v11, v3, v36

    mul-int/lit16 v11, v11, -0x247f

    const v12, -0x2311bce2

    xor-int/2addr v11, v12

    const v12, -0x57ae446

    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_12

    :sswitch_1f
    move-object/from16 v4, p1

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    sub-int v3, v21, v2

    .line 9152
    invoke-static {v9, v3}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v3

    sub-int v11, v9, v3

    sub-int v12, v21, v3

    sub-int v3, v18, v3

    move v14, v3

    move v13, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_13

    :sswitch_20
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v5, :cond_11

    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v11, v3, v36

    mul-int/lit16 v11, v11, -0x465b

    const v12, -0x5ac27681

    xor-int/2addr v11, v12

    const v12, 0x325fdd9

    goto :goto_f

    :cond_11
    move/from16 v27, v5

    :goto_e
    const-string v3, "\u06da\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, 0x76d7

    const v12, 0x728ff5d9

    xor-int/2addr v11, v12

    const v12, 0x62f2313a

    :goto_f
    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_11

    :sswitch_21
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 9176
    iput v3, v10, Ll/᩺֫ܿ;->۠ۧ:I

    move/from16 v11, v41

    .line 9177
    iput v11, v10, Ll/᩺֫ܿ;->֨ۧ:I

    .line 9178
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ܺ()V

    .line 9179
    invoke-static {v6}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    move/from16 v39, v3

    move/from16 v12, v16

    move/from16 v3, v21

    move-wide/from16 v40, v22

    move/from16 v21, v5

    move-object/from16 v23, v8

    move/from16 v22, v11

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    goto/16 :goto_29

    :sswitch_22
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 101
    invoke-virtual {v6}, Ll/۫ۨᩳ;->᩹ܽ()V

    move/from16 v39, v3

    move-object/from16 v32, v10

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_1b

    :sswitch_23
    move-wide/from16 v37, v11

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 117
    iget-object v12, v6, Ll/۫ۨᩳ;->ۧ֫:Ll/᩸ܽܿ;

    if-eqz v12, :cond_12

    const-string v32, "\u0736\u06eb"

    invoke-static/range {v32 .. v32}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v32

    add-int v32, v32, v36

    mul-int/lit8 v32, v32, -0x3b

    move/from16 v39, v3

    xor-int v3, v32, v35

    mul-int/lit16 v3, v3, 0x4c65

    const v33, -0x59176533

    xor-int v3, v3, v33

    const v33, -0x2d02e833

    xor-int v32, v32, v33

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move-object/from16 v30, v24

    move v5, v3

    move-object/from16 v24, v12

    move-wide/from16 v11, v37

    move/from16 v37, v32

    goto/16 :goto_0

    :cond_12
    move/from16 v39, v3

    move-object/from16 v32, v10

    move-object/from16 v33, v12

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_15

    :sswitch_24
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    invoke-static/range {v20 .. v20}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    const-string v3, "\u06ec\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    mul-int/lit8 v3, v3, 0x35

    xor-int v12, v3, v36

    mul-int/lit16 v12, v12, -0x37b

    const v32, 0x1485f87b

    xor-int v12, v12, v32

    const v32, -0x181b6e36

    goto :goto_10

    :cond_13
    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v12, v3, v36

    mul-int/lit16 v12, v12, -0x7791

    const v32, 0x63b59a7b    # 6.6999843E21f

    xor-int v12, v12, v32

    const v32, 0x537ab675

    :goto_10
    xor-int v3, v3, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    :goto_11
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    :goto_12
    move-wide/from16 v11, v37

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_25
    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v3, :cond_14

    const-string v12, "\u1a74\u06e1"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v36

    mul-int/lit8 v12, v12, 0x5f

    move/from16 v21, v5

    xor-int v5, v12, v35

    mul-int/lit16 v5, v5, 0x7f19

    const v32, 0x24797dae

    xor-int v5, v5, v32

    const v32, 0x1663a7d2

    xor-int v12, v12, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_1c

    :cond_14
    move/from16 v21, v5

    move v12, v3

    move v13, v9

    move/from16 v14, v18

    :goto_13
    const-string v5, "\u06df\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    move-object/from16 v32, v10

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, -0x2cbb

    const v25, 0x5a907ffe

    xor-int v10, v10, v25

    const v25, -0x61d9907

    xor-int v5, v5, v25

    move/from16 v41, v11

    move v4, v12

    goto/16 :goto_18

    :sswitch_26
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v1, :cond_15

    const-string v5, "\u06eb\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v36, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x7ab

    const v12, 0x6396b571

    xor-int/2addr v10, v12

    const v12, -0x4664dc8d

    goto/16 :goto_17

    :cond_15
    move/from16 v40, v21

    move/from16 v41, v28

    :goto_14
    const-string v5, "\u1a77\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x4433

    const v11, 0x2b8cfc4d

    xor-int/2addr v10, v11

    const v11, -0x4242d206

    xor-int/2addr v5, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    goto/16 :goto_19

    :sswitch_27
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 9843
    iget-boolean v5, v6, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez v5, :cond_16

    const-string v5, "\u1a7b\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x5c71

    const v12, 0x4972ecc0    # 995020.0f

    xor-int/2addr v10, v12

    const v12, 0x7fe250ee

    goto/16 :goto_17

    :cond_16
    :goto_15
    move-wide/from16 v42, v22

    move/from16 v22, v11

    move-wide/from16 v10, v42

    goto/16 :goto_1d

    :sswitch_28
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 122
    iget-object v5, v6, Ll/۫ۨᩳ;->֫ܽ:Ljava/util/ArrayList;

    invoke-static {v5}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v20, v5

    :goto_16
    const-string v5, "\u05a8\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, -0x6709

    const v12, -0x3c7d8d84

    xor-int/2addr v10, v12

    const v12, -0x2cff3f19

    goto :goto_17

    :sswitch_29
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v9, :cond_17

    const-string v5, "\u06e8\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x5f73

    const v12, 0x2bc9a27f

    xor-int/2addr v10, v12

    const v12, -0x436f9b57

    :goto_17
    xor-int/2addr v5, v12

    move/from16 v41, v11

    move/from16 v4, v25

    :goto_18
    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v40, v39

    :goto_19
    move/from16 v37, v5

    move v5, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_17
    move v5, v3

    move/from16 v28, v18

    :goto_1a
    const-string v10, "\u1a73\u1a7b"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v36

    xor-int v12, v10, v35

    mul-int/lit16 v12, v12, 0x1421

    const v21, -0x6908c2d0

    xor-int v12, v12, v21

    const v21, 0x3c4b4f5f

    xor-int v10, v10, v21

    move/from16 v21, v3

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v10

    goto/16 :goto_21

    :sswitch_2a
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 98
    :try_start_0
    iget-object v5, v6, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v5, v2, v9, v1}, Ll/ۗۤᩳ;->֫(III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1b
    const-string v5, "\u06da\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    mul-int/lit8 v5, v5, -0x41

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x3153

    const v12, -0xf204c9

    xor-int/2addr v10, v12

    const v12, 0x13715364

    goto/16 :goto_17

    :catch_0
    const-string v5, "\u073d\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int v5, v5, v36

    mul-int/lit8 v5, v5, -0x61

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x746b

    const v12, -0x65e351ff

    xor-int/2addr v10, v12

    const v12, 0x5a8c1219

    goto/16 :goto_17

    :sswitch_2b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 112
    invoke-virtual {v6}, Ll/۫ۨᩳ;->۫()V

    const/4 v5, 0x0

    .line 1330
    invoke-virtual {v6, v5}, Ll/۫ۨᩳ;->֫(Z)V

    move v5, v11

    move-wide/from16 v10, v22

    .line 114
    iput-wide v10, v6, Ll/۫ۨᩳ;->ܳܽ:J

    .line 115
    invoke-virtual {v6}, Ll/۫ۨᩳ;->۟ܽ()V

    if-nez v29, :cond_18

    const-string v12, "\u06e1\u06df"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    move/from16 v22, v5

    xor-int v5, v12, v36

    mul-int/lit16 v5, v5, -0x7a5f

    const v23, 0x40dd4b2a

    xor-int v5, v5, v23

    const v23, 0x139a861    # 3.409994E-38f

    xor-int v12, v12, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_1c
    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v12

    goto :goto_1e

    :cond_18
    move/from16 v22, v5

    :goto_1d
    const-string v5, "\u1a78\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v36, v5

    mul-int/lit8 v5, v5, -0x11

    xor-int v12, v5, v35

    mul-int/lit16 v12, v12, 0x54a9

    const v23, 0x7052463b

    xor-int v12, v12, v23

    const v23, 0x759411ee

    xor-int v5, v5, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v5

    move v5, v12

    :goto_1e
    move-wide/from16 v11, v42

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v12, v19

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 82
    iput v12, v5, Ll/ܳۨᩳ;->ۧ:I

    move-object/from16 v23, v8

    move-wide/from16 v40, v10

    move/from16 v12, v16

    move/from16 v10, v18

    move-object/from16 v18, v7

    goto/16 :goto_2d

    :cond_19
    const-string v11, "\u1a7a\u06da"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v35

    mul-int/lit8 v11, v11, 0x23

    move/from16 v17, v12

    xor-int v12, v11, v36

    mul-int/lit16 v12, v12, 0x4435

    const v18, 0x41944ff8

    xor-int v12, v12, v18

    const v18, -0x227230fc

    xor-int v11, v11, v18

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v12

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_31

    :sswitch_2d
    move/from16 v9, p3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v4, p1

    move/from16 v1, p4

    .line 93
    invoke-virtual {v8}, Ll/ۜܺܿ;->᩻()Ll/ܶۜܿ;

    move-result-object v11

    .line 95
    invoke-virtual {v8, v2, v9, v1, v4}, Ll/ۜܺܿ;->֫(IIILjava/lang/CharSequence;)V

    const-wide/16 v18, 0x0

    if-nez v29, :cond_1a

    const-string v12, "\u1a74\u1a74"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v35

    mul-int/lit8 v12, v12, -0x73

    move-object/from16 v23, v8

    xor-int v8, v12, v36

    mul-int/lit16 v8, v8, 0x2855

    const v26, 0x1ce8f77b

    xor-int v8, v8, v26

    const v26, 0x12939f51

    xor-int v12, v12, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    move-object/from16 v10, v32

    move-wide/from16 v43, v37

    move/from16 v37, v12

    move-wide/from16 v11, v43

    goto/16 :goto_0

    :cond_1a
    :goto_1f
    move-object/from16 v23, v8

    :goto_20
    const-string v8, "\u06e1\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    mul-int/lit8 v8, v8, 0x71

    xor-int v12, v8, v35

    mul-int/lit16 v12, v12, 0x1cc9

    const v26, 0x474878d

    xor-int v12, v12, v26

    const v26, 0x4f352809    # 3.03929984E9f

    xor-int v8, v8, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v12

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    :goto_21
    move-object/from16 v10, v32

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 81
    iput v2, v5, Ll/ܳۨᩳ;->ܽ:I

    move-object/from16 v18, v7

    move/from16 v12, v16

    goto/16 :goto_24

    :sswitch_2f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 82
    iget v8, v5, Ll/ܳۨᩳ;->ۧ:I

    add-int v11, v2, v9

    if-ge v8, v11, :cond_1b

    const-string v8, "\u06e1\u06d6"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v35, v8

    mul-int/lit8 v8, v8, 0x5f

    xor-int v12, v8, v36

    mul-int/lit16 v12, v12, 0x2481

    const v17, -0x49b335cf

    xor-int v12, v12, v17

    const v17, 0x3f102829

    xor-int v8, v8, v17

    move-object/from16 v17, v5

    move/from16 v18, v10

    move/from16 v19, v11

    move v5, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_3c

    :cond_1b
    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move/from16 v19, v11

    move/from16 v12, v16

    goto/16 :goto_2d

    :sswitch_30
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v10, :cond_1c

    const-string v8, "\u06df\u1a7a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x64db

    const v12, -0x58ec6213

    xor-int/2addr v11, v12

    const v12, 0x1b4f22a9

    xor-int/2addr v8, v12

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_28

    :cond_1c
    move-object/from16 v18, v7

    move v7, v10

    :goto_22
    move/from16 v12, v16

    goto/16 :goto_25

    :sswitch_31
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const-wide/16 v11, -0x1

    goto :goto_23

    :sswitch_32
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 92
    invoke-virtual {v7, v2, v9, v1}, Ll/᩻۫ᩳ;->֫(III)J

    move-result-wide v11

    :goto_23
    const-string v8, "\u06e4\u06e0"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v35

    mul-int/lit8 v8, v8, -0x3

    move-object/from16 v18, v7

    xor-int v7, v8, v36

    mul-int/lit16 v7, v7, 0x599

    const v19, -0x79756344

    xor-int v7, v7, v19

    const v19, -0x1fbdb913

    xor-int v37, v8, v19

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    goto/16 :goto_2e

    :sswitch_33
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 78
    iput v2, v5, Ll/ܳۨᩳ;->ܽ:I

    add-int v7, v2, v9

    .line 79
    iput v7, v5, Ll/ܳۨᩳ;->ۧ:I

    move/from16 v12, v16

    goto/16 :goto_2c

    :sswitch_34
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v12, v2, :cond_1d

    const-string v7, "\u05a8\u06e1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v36

    xor-int v8, v7, v35

    mul-int/lit16 v8, v8, 0x78a3

    const v11, 0x7fca3054

    xor-int/2addr v8, v11

    const v11, 0x6cb9578e

    goto/16 :goto_2b

    :cond_1d
    :goto_24
    const-string v7, "\u05a1\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v36

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v35

    mul-int/lit16 v8, v8, -0x4b91

    const v11, -0x58e19ecf

    xor-int/2addr v8, v11

    const v11, 0x71829266

    goto/16 :goto_2b

    :sswitch_35
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v3, :cond_1e

    const-string v7, "\u0736\u1a7a"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, -0x5005

    const v11, -0x5fd62c0    # -1.69547E35f

    xor-int/2addr v8, v11

    const v11, -0x51454dc1

    goto/16 :goto_2b

    :cond_1e
    move v7, v10

    :goto_25
    move-object/from16 v10, v32

    goto/16 :goto_29

    :sswitch_36
    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move-object/from16 v4, p1

    move/from16 v30, v1

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 90
    iget v7, v0, Ll/ۜ۫ᩳ;->᩶:I

    invoke-virtual {v6, v2, v9, v1, v7}, Ll/۫ۨᩳ;->֫(IIII)Z

    move-result v29

    .line 91
    iget-object v7, v6, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    move-object v8, v4

    check-cast v8, Ll/᩶᩸ᩳ;

    invoke-virtual {v7, v8, v2, v9, v1}, Ll/ۜ֫ܿ;->֫(Ll/᩶᩸ᩳ;III)V

    if-eqz v29, :cond_1f

    const-string v7, "\u1a73\u06e2"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    xor-int v11, v7, v36

    mul-int/lit16 v11, v11, 0x656b

    const v16, 0x10c5bbc8

    xor-int v11, v11, v16

    const v16, 0x7fcb3755

    goto :goto_26

    :cond_1f
    const-string v7, "\u06d9\u06e2"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v36

    xor-int v11, v7, v35

    mul-int/lit16 v11, v11, -0x1355

    const v16, -0x7baf135c

    xor-int v11, v11, v16

    const v16, 0x691a7cb9

    :goto_26
    xor-int v7, v7, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v17, v5

    move-object/from16 v25, v8

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v7

    move-object/from16 v7, v18

    goto/16 :goto_3b

    :sswitch_37
    return-void

    :sswitch_38
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const/4 v7, 0x1

    .line 76
    iput-boolean v7, v5, Ll/ܳۨᩳ;->ᩳ:Z

    .line 77
    iget v7, v5, Ll/ܳۨᩳ;->ܽ:I

    if-gez v7, :cond_20

    const-string v8, "\u06e4\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v35

    mul-int/lit8 v8, v8, 0x2f

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x5509

    const v12, -0x3a37d3b0

    xor-int/2addr v11, v12

    const v12, 0xda3ada2

    goto :goto_27

    :cond_20
    const-string v8, "\u06e7\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x6eeb

    const v12, -0x321e04df

    xor-int/2addr v11, v12

    const v12, -0x19c94c63

    :goto_27
    xor-int/2addr v8, v12

    move/from16 v16, v7

    move/from16 v19, v17

    move-object/from16 v7, v18

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move/from16 v18, v10

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_28
    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    goto/16 :goto_3c

    :sswitch_39
    move-object/from16 v18, v7

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 88
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ᩴۧ()V

    .line 9145
    iget-object v10, v6, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v3, v10, Ll/᩺֫ܿ;->۠ۧ:I

    .line 9146
    iget v7, v10, Ll/᩺֫ܿ;->֨ۧ:I

    if-eq v3, v7, :cond_21

    const-string v8, "\u06d8\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v36

    mul-int/lit8 v8, v8, -0x15

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, 0x6c1b

    const v16, 0x31cf9594

    xor-int v11, v11, v16

    const v16, -0x33a23eb6    # -5.8131752E7f

    goto :goto_2a

    :cond_21
    :goto_29
    const-string v8, "\u073a\u05a8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v35

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x46ed

    const v16, -0x3c405e37

    xor-int v11, v11, v16

    const v16, -0x50b396ad

    :goto_2a
    xor-int v8, v8, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-object/from16 v42, v18

    move/from16 v18, v7

    move-object/from16 v7, v42

    move-wide/from16 v43, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v43

    goto/16 :goto_0

    :sswitch_3a
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 74
    iget-object v5, v6, Ll/۫ۨᩳ;->᩺ۧ:Ll/ܳۨᩳ;

    if-eqz v5, :cond_22

    const-string v7, "\u06e7\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v36

    xor-int v8, v7, v35

    mul-int/lit16 v8, v8, -0x3b75

    const v11, -0x49b3ef03

    xor-int/2addr v8, v11

    const v11, 0xc4ba045

    :goto_2b
    xor-int/2addr v7, v11

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move-object/from16 v17, v5

    move/from16 v37, v7

    move v5, v8

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v8, v23

    goto :goto_2f

    :cond_22
    move/from16 v19, v17

    :goto_2c
    move-object/from16 v17, v5

    :goto_2d
    const-string v5, "\u06df\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v36, v5

    mul-int/lit8 v5, v5, -0xb

    xor-int v7, v5, v35

    mul-int/lit16 v7, v7, -0x7883

    const v8, -0x1c78385b

    xor-int/2addr v7, v8

    const v8, 0x4d90919

    xor-int/2addr v5, v8

    move/from16 v16, v12

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v5

    :goto_2e
    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    :goto_2f
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    goto/16 :goto_3a

    :sswitch_3b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 70
    iget-object v6, v0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    iget-object v7, v6, Ll/۫ۨᩳ;->᩺:Ll/᩻۫ᩳ;

    iget-object v8, v6, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    invoke-static {v6}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v11

    if-eq v4, v11, :cond_23

    :goto_30
    const-string v11, "\u06ec\u05a1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v0, v11, v36

    mul-int/lit16 v0, v0, -0x1d6b

    const v16, -0x4d86155f

    xor-int v0, v0, v16

    const v16, 0x6bdccba

    xor-int v11, v11, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move v5, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    :goto_31
    move-wide/from16 v42, v37

    move/from16 v37, v11

    move-wide/from16 v11, v42

    move-wide/from16 v44, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v44

    goto/16 :goto_0

    :cond_23
    const-string v0, "\u06db\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x27

    xor-int v11, v0, v36

    mul-int/lit16 v11, v11, -0x7bd

    const v16, 0x3686a306

    xor-int v11, v11, v16

    const v16, -0x7a2e0c4

    xor-int v0, v0, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    goto/16 :goto_3c

    :sswitch_3c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 4090
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_24

    goto/16 :goto_34

    :cond_24
    const-string v0, "\u073a\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x2ecb

    const v8, -0x69c9ee69

    xor-int/2addr v7, v8

    const v8, 0xe75281b

    goto/16 :goto_39

    :sswitch_3d
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 6689
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_25

    :goto_32
    const-string v0, "\u1a74\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x50c5

    const v8, 0x760d01ca

    xor-int/2addr v7, v8

    const v8, -0x4d484d33

    goto/16 :goto_39

    :cond_25
    const-string v0, "\u06eb\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x158f

    const v8, -0x78093b09

    xor-int/2addr v7, v8

    const v8, 0x2a92605d

    goto/16 :goto_39

    :sswitch_3e
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_26

    goto :goto_33

    :cond_26
    const-string v0, "\u1a75\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x3b6b

    const v8, 0x694e2b00

    xor-int/2addr v7, v8

    const v8, 0x4a6006d9    # 3670454.2f

    goto/16 :goto_39

    :sswitch_3f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_27

    :goto_33
    const-string v0, "\u06d6\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x3a43

    const v8, 0xaacf204

    xor-int/2addr v7, v8

    const v8, -0x5663c523

    goto/16 :goto_39

    :cond_27
    const-string v0, "\u1a74\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x2841

    const v8, -0x7623c555

    xor-int/2addr v7, v8

    const v8, 0x5151b577

    goto/16 :goto_39

    :sswitch_40
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 5223
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v0

    if-nez v0, :cond_28

    :goto_34
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x443b

    const v8, 0x26ed2c5e

    xor-int/2addr v7, v8

    const v8, 0x5c7735f1

    goto/16 :goto_39

    :cond_28
    const-string v0, "\u06eb\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x41

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x3e69

    const v8, -0x3fe8db5

    xor-int/2addr v7, v8

    const v8, 0x47ecf14e

    goto/16 :goto_39

    :sswitch_41
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 4985
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v0

    if-ltz v0, :cond_29

    goto :goto_35

    :cond_29
    const-string v0, "\u06df\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v36

    mul-int/lit8 v0, v0, 0x4b

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x4fed

    const v8, -0x6d42ecb4

    xor-int/2addr v7, v8

    const v8, 0x31ce75ba

    goto/16 :goto_39

    :sswitch_42
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 5614
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_2a

    :goto_35
    const-string v0, "\u06db\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x2c03

    const v8, 0x5bdf7b5a

    xor-int/2addr v7, v8

    const v8, -0x5d43d9fe

    goto/16 :goto_39

    :cond_2a
    const-string v0, "\u05a1\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x690d

    const v8, -0x4c7ed07f

    xor-int/2addr v7, v8

    const v8, -0x461db4f2    # -4.3162E-4f

    goto/16 :goto_39

    :sswitch_43
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 3569
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_2b

    :goto_36
    const-string v0, "\u1a76\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v36

    mul-int/lit8 v0, v0, -0x29

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x41d1

    const v8, -0x7c92ac49

    xor-int/2addr v7, v8

    const v8, 0x59065d61

    goto/16 :goto_39

    :cond_2b
    const-string v0, "\u06e1\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    mul-int/lit8 v0, v0, 0x1b

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x65c5

    const v8, 0x5baaec8d

    xor-int/2addr v7, v8

    const v8, -0x189fa802

    goto/16 :goto_39

    :sswitch_44
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 4715
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_2c

    :goto_37
    const-string v0, "\u1a73\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x6f

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x4e2f

    const v8, 0x4803df51

    xor-int/2addr v7, v8

    const v8, 0x2781a4fd

    goto/16 :goto_39

    :cond_2c
    const-string v0, "\u1a73\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, 0x5f

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x1365

    const v8, -0x66ec09e6

    xor-int/2addr v7, v8

    const v8, -0x10a4d17

    goto :goto_39

    :sswitch_45
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 3121
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_2d

    :goto_38
    const-string v0, "\u1a78\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    mul-int/lit8 v0, v0, -0x63

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x3461

    const v8, -0x24b65538

    xor-int/2addr v7, v8

    const v8, -0x58bc6115

    goto :goto_39

    :cond_2d
    const-string v0, "\u073f\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x6097

    const v8, -0x30f01c09

    xor-int/2addr v7, v8

    const v8, 0x5a057220

    :goto_39
    xor-int/2addr v0, v8

    move/from16 v16, v12

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move-object/from16 v17, v5

    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-object/from16 v0, p0

    :goto_3a
    move/from16 v21, v3

    :goto_3b
    move/from16 v18, v10

    move-object/from16 v10, v32

    :goto_3c
    move-wide/from16 v42, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v42

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f26e79c -> :sswitch_6
        -0x7e47cfd6 -> :sswitch_14
        -0x79795335 -> :sswitch_16
        -0x789c4097 -> :sswitch_b
        -0x733cefad -> :sswitch_30
        -0x72ca2b6b -> :sswitch_36
        -0x6f6d6567 -> :sswitch_2a
        -0x68975922 -> :sswitch_12
        -0x6886cf35 -> :sswitch_40
        -0x672c236d -> :sswitch_17
        -0x64645928 -> :sswitch_41
        -0x62ae5ef0 -> :sswitch_2
        -0x6038b12d -> :sswitch_21
        -0x5f7aac7b -> :sswitch_3d
        -0x5cb53efd -> :sswitch_6
        -0x5ca81ad5 -> :sswitch_3e
        -0x56d2e875 -> :sswitch_11
        -0x56ba0292 -> :sswitch_f
        -0x5589a462 -> :sswitch_b
        -0x523ee6d9 -> :sswitch_18
        -0x518548b8 -> :sswitch_a
        -0x5057dff6 -> :sswitch_31
        -0x50333f67 -> :sswitch_12
        -0x502cb898 -> :sswitch_d
        -0x4fe41a26 -> :sswitch_24
        -0x4e558fcd -> :sswitch_5
        -0x4dea3482 -> :sswitch_34
        -0x4d1f5b16 -> :sswitch_20
        -0x4c8cbbbc -> :sswitch_8
        -0x4c4114d1 -> :sswitch_2c
        -0x48b78c1d -> :sswitch_13
        -0x485970a1 -> :sswitch_29
        -0x481604b9 -> :sswitch_1a
        -0x477e8894 -> :sswitch_e
        -0x477d65ac -> :sswitch_0
        -0x46bde6d8 -> :sswitch_d
        -0x45b5332f -> :sswitch_32
        -0x43a8e582 -> :sswitch_c
        -0x421f22d9 -> :sswitch_26
        -0x3bea2c0c -> :sswitch_37
        -0x3b700c8b -> :sswitch_15
        -0x3b2b7f80 -> :sswitch_1d
        -0x356d7cd4 -> :sswitch_1b
        -0x32c2032e -> :sswitch_38
        -0x328cb1f1 -> :sswitch_44
        -0x31e81962 -> :sswitch_3
        -0x309d0ddf -> :sswitch_19
        -0x2fde3b72 -> :sswitch_7
        -0x2aa3aec9 -> :sswitch_35
        -0x2a0c4e19 -> :sswitch_3a
        -0x27e3eb83 -> :sswitch_33
        -0x2792de28 -> :sswitch_22
        -0x2772ef9c -> :sswitch_21
        -0x27036033 -> :sswitch_17
        -0x263a00df -> :sswitch_1
        -0x233ab482 -> :sswitch_2
        -0x2149cd6c -> :sswitch_35
        -0x2143a9c8 -> :sswitch_34
        -0x1ea6bff8 -> :sswitch_39
        -0x1c142d8d -> :sswitch_14
        -0x1968d3e2 -> :sswitch_5
        -0x174ccfee -> :sswitch_25
        -0x16f2a4da -> :sswitch_2e
        -0x165b94d0 -> :sswitch_10
        -0x1477b7a0 -> :sswitch_44
        -0xe86d141 -> :sswitch_24
        -0xbc42228 -> :sswitch_a
        -0xaf5c795 -> :sswitch_16
        -0xa59f51c -> :sswitch_2c
        -0x960a6af -> :sswitch_8
        -0x81f5fb8 -> :sswitch_2f
        -0x77f02d6 -> :sswitch_30
        -0x5ff2f29 -> :sswitch_18
        -0x6b5564 -> :sswitch_13
        0x124fcdb -> :sswitch_20
        0x3bd1bd5 -> :sswitch_28
        0x6c446ea -> :sswitch_3f
        0x7e96334 -> :sswitch_1f
        0xa0cdfcb -> :sswitch_4
        0xeb5cc49 -> :sswitch_2a
        0x115534b5 -> :sswitch_3e
        0x15496681 -> :sswitch_1e
        0x1c4e46b7 -> :sswitch_28
        0x1e4099f8 -> :sswitch_3d
        0x208959d8 -> :sswitch_1c
        0x215c409a -> :sswitch_19
        0x22f98034 -> :sswitch_41
        0x23402c17 -> :sswitch_27
        0x24c448e7 -> :sswitch_37
        0x26ed3f49 -> :sswitch_3
        0x2aeb5c2e -> :sswitch_2d
        0x2c0f698e -> :sswitch_1f
        0x2c69cf6f -> :sswitch_1b
        0x2c7d12ab -> :sswitch_4
        0x32cf1629 -> :sswitch_43
        0x32e42337 -> :sswitch_45
        0x36d14e5c -> :sswitch_1a
        0x37adc4b9 -> :sswitch_e
        0x389a4580 -> :sswitch_2e
        0x38ddfb5a -> :sswitch_42
        0x39083934 -> :sswitch_2b
        0x3974df75 -> :sswitch_11
        0x39f25ed3 -> :sswitch_f
        0x3d3903a7 -> :sswitch_32
        0x42b26adc -> :sswitch_27
        0x42e88a7e -> :sswitch_9
        0x44ab3b15 -> :sswitch_22
        0x47201558 -> :sswitch_3a
        0x47fdaf93 -> :sswitch_3b
        0x49691d91 -> :sswitch_1c
        0x4988dabe -> :sswitch_45
        0x4be16e1b -> :sswitch_15
        0x4f31fb55 -> :sswitch_7
        0x54a88d23 -> :sswitch_2f
        0x564c9da4 -> :sswitch_25
        0x568be864 -> :sswitch_10
        0x5868d95e -> :sswitch_38
        0x594dd322 -> :sswitch_9
        0x59cc19c6 -> :sswitch_33
        0x5d6ccb8a -> :sswitch_1
        0x5d983347 -> :sswitch_23
        0x5db155f2 -> :sswitch_31
        0x5e362d0a -> :sswitch_1d
        0x61ac34d3 -> :sswitch_42
        0x66586dde -> :sswitch_39
        0x686ba500 -> :sswitch_26
        0x6915eb8f -> :sswitch_3b
        0x6a48c4c5 -> :sswitch_23
        0x6a85f21c -> :sswitch_29
        0x6c9d3e7c -> :sswitch_2b
        0x710327d6 -> :sswitch_1e
        0x723dbbe0 -> :sswitch_c
        0x77335640 -> :sswitch_43
        0x77f07b5c -> :sswitch_40
        0x7848c3fa -> :sswitch_3c
        0x78c9c0d5 -> :sswitch_3f
        0x78d327b9 -> :sswitch_2d
        0x7a0b9f41 -> :sswitch_36
        0x7e0d56fb -> :sswitch_0
        0x7eb11921 -> :sswitch_3c
    .end sparse-switch
.end method

.method public final ֫(Ll/۟᩺ᩳ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7eeaa692

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    sget v4, Ll/ۖ;->᩹۟ۘ:I

    const-string v5, "\u06e2\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5805

    const v7, -0xb91d58a

    xor-int/2addr v6, v7

    const v7, -0x6fd6b0ee

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0xbb3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 44
    invoke-virtual {v1}, Ll/ۗۤᩳ;->ܺ()V

    goto :goto_1

    .line 7
    :sswitch_0
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v5, :cond_8

    goto/16 :goto_3

    :sswitch_1
    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-lez v5, :cond_6

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_2

    .line 20
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    return-void

    .line 43
    :sswitch_5
    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-eqz v1, :cond_0

    const-string v5, "\u06dc\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x587b

    const v7, -0x4e63da71

    xor-int/2addr v6, v7

    const v7, -0x8bfd105

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_7
    iget-object v0, p0, Ll/ۜ۫ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/֨ۡ;->ۜۧ۟(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v5

    if-ne v5, p1, :cond_0

    const-string v5, "\u0733\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2551

    const v7, -0x5c87732f

    xor-int/2addr v6, v7

    const v7, 0x6f71a173

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5cab

    const v7, 0x44383656    # 736.849f

    xor-int/2addr v6, v7

    const v7, 0x75cbb038

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v5, "\u1a7b\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x214d

    const v7, 0x5d1c1bdb

    xor-int/2addr v6, v7

    const v7, 0x4abf997f    # 6278335.5f

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06e4\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5009

    const v7, -0x7aa0607c

    xor-int/2addr v6, v7

    const v7, -0x384d3b02

    goto/16 :goto_0

    .line 13
    :sswitch_a
    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_3

    goto :goto_3

    :cond_3
    const-string v5, "\u0730\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3a63

    const v7, -0xf701c01

    xor-int/2addr v6, v7

    const v7, 0x13f0597f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-eqz v5, :cond_4

    :goto_2
    const-string v5, "\u073a\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6825

    const v7, 0x75d1ef6

    xor-int/2addr v6, v7

    const v7, -0x253edf92

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1019

    const v7, 0x5d54df3a

    xor-int/2addr v6, v7

    const v7, 0xaf4ddaa

    goto/16 :goto_0

    .line 38
    :sswitch_c
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06eb\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x48a5

    const v7, -0x4784a2d2

    xor-int/2addr v6, v7

    const v7, -0x7483313b

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_7

    :cond_6
    :goto_3
    const-string v5, "\u06da\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x402b

    const v7, -0x26eb0007

    xor-int/2addr v6, v7

    const v7, 0x530025e4

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u05a8\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2e45

    const v7, 0x5df413a6

    xor-int/2addr v6, v7

    const v7, -0x5de2e34b

    goto/16 :goto_0

    .line 6
    :sswitch_e
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u06e2\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6fe1

    const v7, 0x7d5d7421

    xor-int/2addr v6, v7

    const v7, 0x69d14d86

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a1\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x45cb

    const v7, 0x21b64b7b

    xor-int/2addr v6, v7

    const v7, 0x6a28d0b7

    goto/16 :goto_0

    .line 24
    :sswitch_f
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_a

    :goto_5
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x32ff

    const v7, -0x2c2d26e7

    xor-int/2addr v6, v7

    const v7, 0x23ab7d51

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7a\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7d59

    const v7, -0x7e6c10c7

    xor-int/2addr v6, v7

    const v7, -0x482ed56f

    goto/16 :goto_0

    .line 42
    :sswitch_10
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_6

    :cond_b
    const-string v5, "\u06e2\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2231

    const v7, 0x4bc3725c    # 2.5617592E7f

    xor-int/2addr v6, v7

    const v7, 0x7db6aead

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_6
    const-string v5, "\u1a74\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5837

    const v7, -0x681b65a2

    xor-int/2addr v6, v7

    const v7, -0x7c805c02

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05ab\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ed7

    const v7, -0x66343d28

    xor-int/2addr v6, v7

    const v7, -0x4aacb1dd

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d6f5f92 -> :sswitch_0
        -0x7c5b023d -> :sswitch_7
        -0x7bfbe425 -> :sswitch_10
        -0x74204473 -> :sswitch_10
        -0x6cd7a121 -> :sswitch_6
        -0x6c15d11b -> :sswitch_7
        -0x691fdd2b -> :sswitch_3
        -0x68e67726 -> :sswitch_c
        -0x5a78b2f2 -> :sswitch_1
        -0x4f78d187 -> :sswitch_1
        -0x4a1c12d4 -> :sswitch_2
        -0x49d834a4 -> :sswitch_5
        -0x493ec7d5 -> :sswitch_5
        -0x3559cca7 -> :sswitch_9
        -0x338f95b7 -> :sswitch_b
        -0x293c66e6 -> :sswitch_a
        -0x20645c4d -> :sswitch_11
        -0x1bccc45f -> :sswitch_4
        -0x1895efa5 -> :sswitch_3
        -0xaa0b2d1 -> :sswitch_0
        0x11f98a6 -> :sswitch_4
        0x9570608 -> :sswitch_d
        0x1bdc649b -> :sswitch_c
        0x21513e30 -> :sswitch_8
        0x2f6b7dc4 -> :sswitch_f
        0x497f1832 -> :sswitch_11
        0x4b1f5d05 -> :sswitch_e
        0x56870f9c -> :sswitch_8
        0x5c5a2ef2 -> :sswitch_d
        0x631f1e22 -> :sswitch_a
        0x6491937e -> :sswitch_f
        0x6859012f -> :sswitch_2
        0x6903507f -> :sswitch_e
        0x6ab63a62 -> :sswitch_6
        0x6d9f3564 -> :sswitch_b
        0x73b62ae1 -> :sswitch_9
    .end sparse-switch
.end method
