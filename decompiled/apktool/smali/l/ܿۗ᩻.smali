.class public Ll/ܿۗ᩻;
.super Ljava/lang/Object;
.source "5990"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x81

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method private ܽ()I
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x72af0da9

    sget v9, Ll/֡᩶;->ܳܶ۠:I

    sget v10, Ll/ۖ;->᩹۟ۘ:I

    const-string v11, "\u06da\u1a73"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x6705

    const v13, 0x51eeb909

    xor-int/2addr v12, v13

    const v13, -0x12a39b3d

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, -0xcd1

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 170
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v11

    if-nez v11, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v11, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v11, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v11, "\u1a7a\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0xa41

    const v13, -0x699aaad

    xor-int/2addr v12, v13

    const v13, 0x3350c06d

    goto :goto_0

    :sswitch_1
    sget v11, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v11, :cond_b

    goto/16 :goto_4

    .line 125
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_9

    goto/16 :goto_4

    .line 70
    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_4

    .line 84
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_1

    .line 181
    :sswitch_6
    iget-object v11, p0, Ll/ܿۗ᩻;->ᩳ:[I

    aget v11, v11, v4

    if-nez v11, :cond_3

    const-string v11, "\u0730\u0730"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x5f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x324d

    const v13, 0x622f20d0

    xor-int/2addr v12, v13

    const v13, 0x78c3cfc4

    goto :goto_0

    :sswitch_7
    add-int/lit8 v5, v5, 0x1

    .line 184
    iput v5, p0, Ll/ܿۗ᩻;->ۧ:I

    return v7

    :sswitch_8
    add-int v7, v5, v6

    .line 98
    sget-boolean v11, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v11, :cond_1

    const-string v11, "\u06d9\u073a"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x1d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x36a1

    const v13, -0x75eaa90

    xor-int/2addr v12, v13

    const v13, 0x4e2c72ac    # 7.2329907E8f

    goto/16 :goto_0

    :cond_1
    const-string v11, "\u0730\u06ec"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x3f

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x6455

    const v13, -0x43b0a452

    xor-int/2addr v12, v13

    const v13, 0x313e566a

    goto/16 :goto_0

    :sswitch_9
    sub-int v5, v3, v4

    const/4 v6, -0x1

    .line 80
    sget-boolean v11, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v11, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v11, "\u1a75\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x28cf

    const v13, 0x7a872711

    xor-int/2addr v12, v13

    const v13, -0x14742b7e

    goto/16 :goto_0

    :sswitch_a
    if-ltz v4, :cond_3

    const-string v11, "\u1a74\u0730"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x65

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1035

    const v13, 0x55a0c3a0

    xor-int/2addr v12, v13

    const v13, 0x2dcd6f12

    goto/16 :goto_0

    :cond_3
    const-string v11, "\u06d7\u073d"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5449

    const v13, 0x21ddce84

    xor-int/2addr v12, v13

    const v13, -0x7f8b3824

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v4, v3, -0x1

    :goto_1
    const-string v11, "\u06da\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0xf3f

    const v13, -0x6803b96f

    xor-int/2addr v12, v13

    const v13, 0x70b0fc51

    goto/16 :goto_0

    .line 180
    :sswitch_c
    iget-object v3, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v3, v3

    sget v11, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u0730\u06d8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0xd63

    const v13, 0x5e7f13f5

    xor-int/2addr v12, v13

    const v13, 0x6349fb1

    goto/16 :goto_0

    :sswitch_d
    return v2

    :sswitch_e
    add-int v2, v0, v1

    const/4 v11, -0x2

    if-ne v2, v11, :cond_5

    const-string v11, "\u073a\u1a7a"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x3b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x695d

    const v13, -0x64b4355e

    xor-int/2addr v12, v13

    const v13, -0x34c035bf    # -1.2569153E7f

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u1a7b\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x775d

    const v13, 0x70863a00

    xor-int/2addr v12, v13

    const v13, 0x70a79870

    goto/16 :goto_0

    :sswitch_f
    const/4 v1, -0x2

    .line 111
    sget v11, Ll/֨۟;->᩹֫᩷:I

    if-eqz v11, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v11, "\u073f\u1a7a"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x47

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3f1b

    const v13, -0x1e922333

    xor-int/2addr v12, v13

    const v13, 0x61144b42

    goto/16 :goto_0

    :sswitch_10
    sget v11, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v11, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v11, "\u06d8\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x49

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x415f

    const v13, -0x3fe68995

    xor-int/2addr v12, v13

    const v13, -0x1be77a0d

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u06df\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x1bcb

    const v13, 0x2164882a

    xor-int/2addr v12, v13

    const v13, -0x6661a0fb

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v11, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v11, :cond_a

    :cond_9
    :goto_2
    const-string v11, "\u1a75\u1a78"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7a83

    const v13, -0x3949eea

    xor-int/2addr v12, v13

    const v13, -0x42309f5d

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06e8\u05a1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0xe0b

    const v13, 0x52aaf5d2

    xor-int/2addr v12, v13

    const v13, -0xfaddff5

    goto/16 :goto_0

    :sswitch_12
    sget v11, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v11, :cond_c

    :cond_b
    :goto_3
    const-string v11, "\u1a79\u06d9"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x50b3

    const v13, 0x212dc8f4

    xor-int/2addr v12, v13

    const v13, 0x4fb991d8

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u05a8\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x5f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x1f3d

    const v13, -0x6de78d24

    xor-int/2addr v12, v13

    const v13, 0x2e39e221

    goto/16 :goto_0

    .line 4
    :sswitch_13
    sget v11, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v11, :cond_d

    goto :goto_4

    :cond_d
    const-string v11, "\u1a73\u073a"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2957

    const v13, -0x46c7bcbc

    xor-int/2addr v12, v13

    const v13, -0xd7552c

    goto/16 :goto_0

    .line 174
    :sswitch_14
    iget v0, p0, Ll/ܿۗ᩻;->ۧ:I

    sget v11, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v11, :cond_e

    :goto_4
    const-string v11, "\u06e8\u05a8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x6f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x130f

    const v13, -0x6a86aaa3

    xor-int/2addr v12, v13

    const v13, 0x4587387b

    goto/16 :goto_0

    :cond_e
    const-string v11, "\u06e1\u06ec"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x2eab

    const v13, 0x64e9af8a

    xor-int/2addr v12, v13

    const v13, 0x16babd09

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79f724c3 -> :sswitch_4
        -0x76aefaba -> :sswitch_11
        -0x6913d982 -> :sswitch_2
        -0x65183780 -> :sswitch_f
        -0x60fd3d18 -> :sswitch_7
        -0x5a64814b -> :sswitch_12
        -0x52e2ca16 -> :sswitch_2
        -0x48139aa4 -> :sswitch_14
        -0x441bc5a0 -> :sswitch_4
        -0x41c366b9 -> :sswitch_11
        -0x3cd1945d -> :sswitch_10
        -0x3497a736 -> :sswitch_7
        -0x33295dcc -> :sswitch_6
        -0x301312fc -> :sswitch_13
        -0x2dc58f2e -> :sswitch_5
        -0x2daacee1 -> :sswitch_c
        -0x27af714f -> :sswitch_e
        -0x209d09c1 -> :sswitch_b
        -0x1f93b4a8 -> :sswitch_1
        -0x18833eba -> :sswitch_3
        -0xeaefd9c -> :sswitch_0
        0xbd98827 -> :sswitch_0
        0xf232e09 -> :sswitch_10
        0x14169ad5 -> :sswitch_c
        0x187e5e6b -> :sswitch_e
        0x1b2655a4 -> :sswitch_6
        0x1d864612 -> :sswitch_f
        0x21f49822 -> :sswitch_5
        0x23e428dc -> :sswitch_d
        0x29c9a4ee -> :sswitch_9
        0x2a00fdf6 -> :sswitch_a
        0x2a144cfb -> :sswitch_d
        0x32de63a6 -> :sswitch_8
        0x34188389 -> :sswitch_8
        0x37e3a292 -> :sswitch_b
        0x3a840397 -> :sswitch_13
        0x45fbdad8 -> :sswitch_a
        0x4f7b1036 -> :sswitch_14
        0x52fd0767 -> :sswitch_3
        0x592290bc -> :sswitch_9
        0x69e3606a -> :sswitch_1
        0x6d489d2e -> :sswitch_12
    .end sparse-switch
.end method


# virtual methods
.method public ֫()I
    .locals 26

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x566ab901

    sget v21, Ll/ۘܿ;->ۘܰ۫:I

    sget v22, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v23, "\u06ec\u05a1"

    invoke-static/range {v23 .. v23}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v1, v23, v22

    mul-int/lit16 v1, v1, -0x65a7

    const v25, -0x3703bbf4

    xor-int v1, v1, v25

    const v25, -0x50b351e8

    xor-int v23, v23, v25

    move-object/from16 v25, v4

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v24, 0x0

    :goto_0
    xor-int v4, v20, v22

    mul-int/lit16 v4, v4, 0x3d1f

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v20, v23, v1

    sparse-switch v20, :sswitch_data_0

    .line 90
    iget-object v1, v0, Ll/ܿۗ᩻;->ᩳ:[I

    aget v1, v1, v3

    if-nez v1, :cond_1

    const-string v1, "\u1a74\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x7da1

    const v23, 0x3fd4c2c0

    xor-int v4, v4, v23

    const v23, -0x37b6d414    # -205999.69f

    goto/16 :goto_a

    .line 861
    :sswitch_0
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v1, :cond_6

    goto/16 :goto_b

    .line 568
    :sswitch_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_14

    goto :goto_1

    .line 409
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v1, :cond_0

    goto/16 :goto_8

    :cond_0
    const-string v1, "\u1a7a\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x31

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x6af5

    const v23, -0x36e82387

    xor-int v4, v4, v23

    const v23, -0x31f12280

    goto/16 :goto_a

    .line 420
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_9

    .line 734
    :sswitch_4
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_11

    goto/16 :goto_8

    .line 213
    :sswitch_5
    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_f

    goto :goto_1

    .line 1055
    :sswitch_6
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    :goto_1
    const-string v1, "\u1a7a\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x4fa1

    const v23, 0x15edb8e7

    xor-int v4, v4, v23

    const v23, -0x6c77e806

    goto/16 :goto_a

    :sswitch_7
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    const/4 v1, 0x0

    return v1

    :sswitch_8
    add-int/lit8 v3, v3, 0x1

    move/from16 v17, v19

    goto/16 :goto_3

    :sswitch_9
    const/4 v1, 0x1

    const/16 v19, 0x1

    goto :goto_2

    :sswitch_a
    const/4 v1, 0x0

    const/16 v19, 0x0

    :goto_2
    const-string v1, "\u073d\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0xb

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x4c67

    const v23, -0x59e1e1f9

    xor-int v4, v4, v23

    const v23, 0x4488e6b

    goto/16 :goto_a

    :cond_1
    const-string v1, "\u06e8\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x79df

    const v23, 0x53283771

    xor-int v4, v4, v23

    const v23, -0x346c6b65    # -1.934367E7f

    goto/16 :goto_a

    :sswitch_b
    add-int/lit8 v1, v14, -0x1

    goto/16 :goto_5

    :sswitch_c
    if-eqz v17, :cond_2

    const-string v1, "\u06db\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x664f

    const v23, -0x12cd4544

    xor-int v4, v4, v23

    const v23, -0x4b3a7fc

    goto/16 :goto_a

    :sswitch_d
    if-eqz v17, :cond_4

    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x169b

    const v23, 0xd0b31a5

    xor-int v4, v4, v23

    const v23, -0x6da0d79b

    goto/16 :goto_a

    :sswitch_e
    if-ge v3, v5, :cond_2

    const-string v1, "\u1a77\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x3e7

    const v23, 0x54139032

    xor-int v4, v4, v23

    const v23, -0x2fbfb6bf

    goto/16 :goto_a

    :cond_2
    const-string v1, "\u06dc\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x1d

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x1c27

    const v23, 0x7dfe31f6

    xor-int v4, v4, v23

    const v23, 0x28dd3531

    goto/16 :goto_a

    :sswitch_f
    const/4 v1, 0x1

    move/from16 v17, v18

    const/4 v3, 0x1

    :goto_3
    const-string v1, "\u1a7a\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x3f

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x5e43

    const v23, 0x5189023b

    xor-int v4, v4, v23

    const v23, 0x40fa65f1

    goto/16 :goto_a

    :sswitch_10
    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_4

    :sswitch_11
    const/4 v1, 0x0

    const/16 v18, 0x0

    :goto_4
    const-string v1, "\u06e7\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x3495

    const v23, 0x4f304234

    xor-int v4, v4, v23

    const v23, 0x39f47229

    goto/16 :goto_a

    :sswitch_12
    add-int/lit8 v1, v15, 0x1

    .line 97
    iput v1, v0, Ll/ܿۗ᩻;->֫:I

    return v15

    .line 88
    :sswitch_13
    iget-object v1, v0, Ll/ܿۗ᩻;->ᩳ:[I

    aget v1, v1, v6

    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    if-ne v1, v2, :cond_3

    const-string v1, "\u06e2\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x23

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x50f1

    const v23, -0xcb8a84c

    xor-int v4, v4, v23

    const v23, 0x1c2dd1d7

    goto/16 :goto_a

    :cond_3
    const-string v1, "\u06da\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x6f

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0xa6b

    const v23, 0x7bf23300

    xor-int v4, v4, v23

    const v23, -0x3375c000

    goto/16 :goto_a

    :sswitch_14
    add-int v14, v13, v9

    .line 86
    iget v1, v0, Ll/ܿۗ᩻;->ܿ:I

    if-gez v1, :cond_4

    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x19

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x7f53

    const v23, 0xa5daef1

    xor-int v4, v4, v23

    const v23, -0x264da1a0

    goto/16 :goto_a

    :cond_4
    move v1, v14

    :goto_5
    move v15, v1

    goto/16 :goto_7

    :sswitch_15
    sub-int v13, v12, v11

    .line 347
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u1a77\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x43

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x4e19

    const v23, -0x24f81081

    xor-int v4, v4, v23

    const v23, 0x5144c9d9

    goto/16 :goto_a

    .line 1134
    :sswitch_16
    invoke-static {v10}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v11

    const/16 v12, 0x20

    .line 589
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_7

    :cond_6
    const-string v1, "\u06e1\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x65

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x49ab

    const v23, 0x78ae7bc1

    xor-int v4, v4, v23

    const v23, 0x1edee20e

    goto/16 :goto_a

    :cond_7
    const-string v1, "\u073d\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x21

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x3a1d

    const v23, -0x264fd93c

    xor-int v4, v4, v23

    const v23, -0x4f7c217

    goto/16 :goto_a

    :sswitch_17
    shl-int v9, v7, v8

    .line 85
    aget v10, v25, v6

    .line 456
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_8

    goto :goto_6

    :cond_8
    const-string v1, "\u06e8\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x2b3b

    const v23, 0x15503081

    xor-int v4, v4, v23

    const v23, -0x53b4f749

    goto/16 :goto_a

    :sswitch_18
    const/4 v8, 0x5

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_9

    :goto_6
    const-string v1, "\u1a78\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x6285

    const v23, -0x2e90fc98

    xor-int v4, v4, v23

    const v23, 0x3bdc9b55

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x509

    const v23, -0x47e2aa41

    xor-int v4, v4, v23

    const v23, 0x49507074    # 853767.25f

    goto/16 :goto_a

    :sswitch_19
    add-int/lit8 v7, v5, -0x1

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-ltz v1, :cond_a

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u06e1\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x395b

    const v23, 0x4c43b43e    # 5.1302648E7f

    xor-int v4, v4, v23

    const v23, 0x3cbb0b03

    goto/16 :goto_a

    .line 80
    :sswitch_1a
    iget-object v1, v0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v5, v1

    if-nez v5, :cond_b

    move-object/from16 v25, v1

    const/4 v6, 0x0

    const/4 v15, 0x0

    :goto_7
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x371

    const v23, 0x10292a6d

    xor-int v4, v4, v23

    const v23, 0x76812a7f

    goto/16 :goto_a

    :cond_b
    const-string v4, "\u1a74\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v6, v4, v21

    mul-int/lit16 v6, v6, 0x28dd

    const v25, -0x168611f

    xor-int v6, v6, v25

    const v25, -0x57fc628f

    xor-int v4, v4, v25

    move-object/from16 v25, v1

    move/from16 v23, v4

    move v1, v6

    const/4 v6, 0x0

    goto/16 :goto_0

    :sswitch_1b
    return v16

    :sswitch_1c
    sub-int v1, v24, v2

    const/4 v4, -0x1

    if-ne v1, v4, :cond_c

    const-string v4, "\u06df\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v21

    mul-int/lit8 v4, v4, -0x4b

    move/from16 v16, v1

    xor-int v1, v4, v22

    mul-int/lit16 v1, v1, 0x5079

    const v23, -0x76888cfe

    xor-int v1, v1, v23

    const v23, 0x7a1148b

    xor-int v23, v4, v23

    goto/16 :goto_0

    :cond_c
    move/from16 v16, v1

    const-string v1, "\u06e2\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x5daf

    const v23, -0x3709b01a

    xor-int v4, v4, v23

    const v23, 0x33a8e0b1

    goto/16 :goto_a

    :sswitch_1d
    const/4 v2, 0x1

    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_e

    :cond_d
    const-string v1, "\u06ec\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x6913

    const v23, -0x1ac0d567

    xor-int v4, v4, v23

    const v23, 0x3c4bc0fc

    goto/16 :goto_a

    :cond_e
    const-string v1, "\u06da\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x6f7d

    const v23, -0x13ed7906

    xor-int v4, v4, v23

    const v23, -0x7343eada

    goto/16 :goto_a

    .line 955
    :sswitch_1e
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_10

    :cond_f
    :goto_8
    const-string v1, "\u06ec\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x711f

    const v23, -0x2b97f248

    xor-int v4, v4, v23

    const v23, -0x24aed32f

    goto :goto_a

    :cond_10
    const-string v1, "\u06df\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x31

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x4f23

    const v23, 0x4e38ee29    # 7.7565395E8f

    xor-int v4, v4, v23

    const v23, 0x4025bd6a

    goto :goto_a

    .line 164
    :sswitch_1f
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_12

    :cond_11
    :goto_9
    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x7d13

    const v23, 0x42d7db18

    xor-int v4, v4, v23

    const v23, -0x2514a741

    goto :goto_a

    :cond_12
    const-string v1, "\u1a77\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x100f

    const v23, -0x5d63e2d8

    xor-int v4, v4, v23

    const v23, 0x77d1bd02

    goto :goto_a

    .line 244
    :sswitch_20
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_13

    goto :goto_b

    :cond_13
    const-string v1, "\u1a78\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x5dcf

    const v23, 0x42ea7560

    xor-int v4, v4, v23

    const v23, -0x103e3e28

    :goto_a
    xor-int v23, v1, v23

    move v1, v4

    goto/16 :goto_0

    .line 78
    :sswitch_21
    iget v1, v0, Ll/ܿۗ᩻;->֫:I

    .line 178
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_15

    move/from16 v24, v1

    :cond_14
    :goto_b
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x6909

    const v23, 0x4a4954f1    # 3298620.2f

    xor-int v4, v4, v23

    const v23, -0x17137bba

    goto :goto_a

    :cond_15
    const-string v4, "\u06d7\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v21

    xor-int v0, v4, v22

    mul-int/lit16 v0, v0, -0x6a21

    const v23, -0x6c259022

    xor-int v0, v0, v23

    const v23, 0x4f98f470

    xor-int v23, v4, v23

    move/from16 v24, v1

    move v1, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d0fa3f7 -> :sswitch_1e
        -0x73c01355 -> :sswitch_8
        -0x62e0ff07 -> :sswitch_e
        -0x5ec06c61 -> :sswitch_0
        -0x5e9554a0 -> :sswitch_f
        -0x59bd3d03 -> :sswitch_1d
        -0x579db8f0 -> :sswitch_1c
        -0x5503f3e9 -> :sswitch_d
        -0x54c0f460 -> :sswitch_4
        -0x4faa556d -> :sswitch_21
        -0x4e504139 -> :sswitch_f
        -0x4beff3b6 -> :sswitch_4
        -0x4b1f393d -> :sswitch_18
        -0x47a2d830 -> :sswitch_1f
        -0x440ce142 -> :sswitch_1b
        -0x438d8947 -> :sswitch_17
        -0x3c565775 -> :sswitch_12
        -0x383cc112 -> :sswitch_20
        -0x37f55c2c -> :sswitch_1d
        -0x35b74160 -> :sswitch_b
        -0x3307ee42 -> :sswitch_6
        -0x32b6d2ec -> :sswitch_e
        -0x3102840e -> :sswitch_0
        -0x30fc68ae -> :sswitch_1
        -0x2d1630ea -> :sswitch_1
        -0x2be6d5d8 -> :sswitch_19
        -0x29e56497 -> :sswitch_13
        -0x293edf3a -> :sswitch_3
        -0x291964a5 -> :sswitch_13
        -0x1e78d6d2 -> :sswitch_1a
        -0x1d414039 -> :sswitch_5
        -0x19279a19 -> :sswitch_20
        -0x13f8d706 -> :sswitch_d
        -0x1268abb -> :sswitch_12
        0x65aa644 -> :sswitch_3
        0xab0a2be -> :sswitch_1a
        0x1ae0202d -> :sswitch_1f
        0x1dcebb7e -> :sswitch_2
        0x1e151b22 -> :sswitch_14
        0x2410c427 -> :sswitch_16
        0x271763f5 -> :sswitch_21
        0x292d0d7c -> :sswitch_1e
        0x2fc95e35 -> :sswitch_5
        0x3d25e445 -> :sswitch_17
        0x40110383 -> :sswitch_9
        0x43c875ce -> :sswitch_a
        0x44e19540 -> :sswitch_1b
        0x4afb6a6f -> :sswitch_2
        0x5216e05b -> :sswitch_10
        0x530acc04 -> :sswitch_6
        0x5610f69b -> :sswitch_7
        0x581863c9 -> :sswitch_c
        0x594b04fc -> :sswitch_c
        0x5bc0ed17 -> :sswitch_15
        0x5d220961 -> :sswitch_19
        0x607f66b9 -> :sswitch_10
        0x629434b0 -> :sswitch_15
        0x66a9f6cd -> :sswitch_7
        0x677d2957 -> :sswitch_b
        0x689ed810 -> :sswitch_18
        0x6e2c9c04 -> :sswitch_8
        0x70dbb43b -> :sswitch_16
        0x72cfdb4b -> :sswitch_9
        0x76c602bd -> :sswitch_a
        0x799e14f4 -> :sswitch_1c
        0x7aa1137b -> :sswitch_11
        0x7ad5185a -> :sswitch_11
        0x7b21b129 -> :sswitch_14
    .end sparse-switch
.end method

.method public final ֫(I)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x6fdd97a2    # 1.37159E29f

    sget v6, Ll/ۘۨ;->۫᩸۠:I

    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v8, "\u05a1\u06eb"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2923

    const v10, -0x7cacac85

    xor-int/2addr v9, v10

    const v10, 0x7e55b443

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x30c5

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 135
    iget v8, p0, Ll/ܿۗ᩻;->ܿ:I

    if-gez v8, :cond_2

    const-string v8, "\u06e0\u0730"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x31

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2d97

    const v10, -0x16a53ad6

    xor-int/2addr v9, v10

    const v10, -0x700d7598

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v8, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v8, :cond_10

    goto :goto_1

    .line 132
    :sswitch_1
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v8, "\u0730\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x7d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2bbf

    const v10, 0x3315467

    xor-int/2addr v9, v10

    const v10, 0x41ea6c9

    goto :goto_0

    .line 15
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v8, :cond_c

    goto :goto_2

    .line 56
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    :goto_2
    const-string v8, "\u06d9\u06e0"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x31ab

    const v10, 0x15a4894

    xor-int/2addr v9, v10

    const v10, 0x38bff73c

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    neg-int p1, v4

    return p1

    :sswitch_6
    not-int p1, v4

    return p1

    :sswitch_7
    const/4 p1, -0x1

    return p1

    :sswitch_8
    return v0

    :sswitch_9
    return v4

    .line 153
    :sswitch_a
    invoke-direct {p0}, Ll/ܿۗ᩻;->ܽ()I

    move-result v8

    if-gt p1, v8, :cond_1

    const-string v8, "\u05a8\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1ce7

    const v10, -0x4073928d

    xor-int/2addr v9, v10

    const v10, -0x1842c34

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u0730\u073f"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2175

    const v10, 0x667dcf60

    xor-int/2addr v9, v10

    const v10, -0x532fd39c

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u05a8\u06d6"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x1f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x66e3

    const v10, -0x44f6138d

    xor-int/2addr v9, v10

    const v10, -0x10ff55f6

    goto/16 :goto_0

    :sswitch_b
    add-int v4, v2, v3

    .line 150
    aget v4, v1, v4

    .line 152
    iget v8, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz v8, :cond_3

    const-string v8, "\u0736\u05a1"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5e15

    const v10, 0x5a1e4ad3

    xor-int/2addr v9, v10

    const v10, 0x75443551

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u073a\u06e7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x79

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3695

    const v10, -0x58eb6aa3

    xor-int/2addr v9, v10

    const v10, -0x6ee2f1a5

    goto/16 :goto_0

    :sswitch_c
    const/4 v3, -0x1

    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u06e1\u06e7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7b61

    const v10, 0xe3efe7c

    xor-int/2addr v9, v10

    const v10, -0x2ffaa09f

    goto/16 :goto_0

    .line 150
    :sswitch_d
    array-length v2, v1

    sub-int/2addr v2, p1

    .line 10
    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v8, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v8, "\u073d\u073a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x57

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2237

    const v10, -0x5140190

    xor-int/2addr v9, v10

    const v10, -0x4787b6e2

    goto/16 :goto_0

    :sswitch_e
    return v0

    .line 147
    :sswitch_f
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v8, v1

    if-lt p1, v8, :cond_6

    const-string v8, "\u06d6\u1a79"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7359

    const v10, 0xb5ed495

    xor-int/2addr v9, v10

    const v10, 0x3558dfaa

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u1a73\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x905

    const v10, 0x325ae430

    xor-int/2addr v9, v10

    const v10, 0x4a519897    # 3434021.8f

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    if-gez p1, :cond_7

    const-string v8, "\u1a76\u1a7a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1835

    const v10, -0x718f2a3a

    xor-int/2addr v9, v10

    const v10, 0x1f7afc30

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u0736\u1a7b"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x5

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7865

    const v10, -0x52ba8d11

    xor-int/2addr v9, v10

    const v10, 0x10b0fde2

    goto/16 :goto_0

    .line 118
    :sswitch_11
    sget-boolean v8, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v8, :cond_8

    goto :goto_3

    :cond_8
    const-string v8, "\u06eb\u05a8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x54d3

    const v10, 0x27865398

    xor-int/2addr v9, v10

    const v10, -0x3131f99a

    goto/16 :goto_0

    .line 106
    :sswitch_12
    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v8, :cond_9

    goto :goto_4

    :cond_9
    const-string v8, "\u06d6\u06d7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x55

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2197

    const v10, -0x71859cb5

    xor-int/2addr v9, v10

    const v10, -0x270b3064

    goto/16 :goto_0

    .line 8
    :sswitch_13
    sget-boolean v8, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v8, :cond_a

    :goto_3
    const-string v8, "\u073a\u06d9"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2f03

    const v10, -0x5e17da30

    xor-int/2addr v9, v10

    const v10, -0x4459e55e

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e8\u06d6"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5741

    const v10, 0x160a09ff

    xor-int/2addr v9, v10

    const v10, -0x7486ce70

    goto/16 :goto_0

    :sswitch_14
    sget v8, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v8, :cond_b

    goto/16 :goto_5

    :cond_b
    const-string v8, "\u1a79\u06e1"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x62a1

    const v10, 0x3ac899ee

    xor-int/2addr v9, v10

    const v10, 0x1b5e5ffd

    goto/16 :goto_0

    .line 87
    :sswitch_15
    sget v8, Ll/۟;->ۗۤۛ:I

    if-eqz v8, :cond_d

    :cond_c
    :goto_4
    const-string v8, "\u06df\u06e2"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x37

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3e23

    const v10, -0x21bbe247

    xor-int/2addr v9, v10

    const v10, 0x5693063b

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d8\u06dc"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x65

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x23f9

    const v10, -0x78af4843

    xor-int/2addr v9, v10

    const v10, 0x757f2311

    goto/16 :goto_0

    :sswitch_16
    sget v8, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v8, :cond_e

    goto :goto_5

    :cond_e
    const-string v8, "\u1a7a\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x38cf

    const v10, 0x569d7149

    xor-int/2addr v9, v10

    const v10, -0x3fe6658e    # -2.4000516f

    goto/16 :goto_0

    :sswitch_17
    sget v8, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v8, :cond_f

    goto :goto_5

    :cond_f
    const-string v8, "\u1a79\u05ab"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1c6d

    const v10, 0xf93a9c

    xor-int/2addr v9, v10

    const v10, -0x1481b147

    goto/16 :goto_0

    .line 55
    :sswitch_18
    sget v8, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v8, :cond_11

    :cond_10
    :goto_5
    const-string v8, "\u06eb\u06da"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3dbd

    const v10, 0x64666552    # 1.7000208E22f

    xor-int/2addr v9, v10

    const v10, -0x7ca8a783

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u06db\u06e8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x23

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xa0b

    const v10, 0x6d9eedf4

    xor-int/2addr v9, v10

    const v10, -0x7e0fe9c1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7950f33c -> :sswitch_b
        -0x753b6480 -> :sswitch_16
        -0x746a8969 -> :sswitch_1
        -0x6da66f3c -> :sswitch_17
        -0x6b73eda0 -> :sswitch_15
        -0x679baa08 -> :sswitch_10
        -0x628df4a6 -> :sswitch_14
        -0x600f2af8 -> :sswitch_b
        -0x572e153c -> :sswitch_5
        -0x552b7038 -> :sswitch_2
        -0x534e7bbb -> :sswitch_d
        -0x523efb9d -> :sswitch_3
        -0x45094346 -> :sswitch_8
        -0x42280498 -> :sswitch_16
        -0x3fa44e5d -> :sswitch_c
        -0x3dfda614 -> :sswitch_12
        -0x37f4d965 -> :sswitch_3
        -0x21a3f5f2 -> :sswitch_4
        -0x1a970617 -> :sswitch_8
        -0x19c0a4ab -> :sswitch_9
        -0x15cf4045 -> :sswitch_2
        -0x110022c9 -> :sswitch_17
        -0xf053fa1 -> :sswitch_4
        -0xc4e572e -> :sswitch_18
        -0x6656b1f -> :sswitch_e
        -0x63fb89e -> :sswitch_5
        0xd242d21 -> :sswitch_e
        0xddf9abb -> :sswitch_7
        0x193d290b -> :sswitch_7
        0x1dea12c6 -> :sswitch_13
        0x1e56f923 -> :sswitch_18
        0x23ee5ff9 -> :sswitch_9
        0x2700840f -> :sswitch_10
        0x288a3af3 -> :sswitch_6
        0x342fb9c8 -> :sswitch_c
        0x4720356f -> :sswitch_14
        0x4a33ec7e -> :sswitch_6
        0x4df7ebf6 -> :sswitch_13
        0x4e0d2843 -> :sswitch_a
        0x4e463c40 -> :sswitch_1
        0x5d45da68 -> :sswitch_0
        0x5e1b4980 -> :sswitch_f
        0x6072d429 -> :sswitch_a
        0x65e85462 -> :sswitch_f
        0x6d9acb6b -> :sswitch_12
        0x71408892 -> :sswitch_11
        0x71b6261e -> :sswitch_d
        0x73c76c0c -> :sswitch_11
        0x7ac7ab63 -> :sswitch_0
        0x7fb82a6e -> :sswitch_15
    .end sparse-switch
.end method

.method public native ֫(Ll/ܿۗ᩻;)Z
.end method

.method public ۧ()I
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x4a660e4e    # 3769235.5f

    sget v8, Ll/֡᩶;->ܳܶ۠:I

    sget v9, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v10, "\u05ab\u06e8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x771f

    const v12, 0x4453dc5a

    xor-int/2addr v11, v12

    const v12, -0x28802d8a

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0xdc7

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget v10, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v10, :cond_8

    goto/16 :goto_6

    .line 120
    :sswitch_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget-boolean v10, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v10, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v10, "\u073d\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x59

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4e17

    const v12, -0x4fdcf343

    xor-int/2addr v11, v12

    const v12, 0x6257310e

    goto :goto_0

    .line 27
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v10

    if-eqz v10, :cond_d

    goto/16 :goto_6

    .line 63
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 v0, 0x0

    return v0

    .line 121
    :sswitch_5
    invoke-static {v4}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v5

    add-int/2addr v5, v6

    goto :goto_1

    :sswitch_6
    shl-int/lit8 v6, v3, 0x5

    .line 92
    sget v10, Ll/ۛ;->᩺᩻֫:I

    if-ltz v10, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v10, "\u06e2\u073a"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2889

    const v12, -0x4f162e77

    xor-int/2addr v11, v12

    const v12, -0x2c167203

    goto :goto_0

    :sswitch_7
    add-int/lit8 v2, v5, 0x2

    .line 123
    iput v2, p0, Ll/ܿۗ᩻;->ܽ:I

    move v2, v5

    goto/16 :goto_3

    .line 119
    :sswitch_8
    invoke-virtual {p0, v3}, Ll/ܿۗ᩻;->֫(I)I

    move-result v4

    if-nez v4, :cond_2

    const-string v10, "\u05a8\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x5f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7d27

    const v12, 0x34a3f554

    xor-int/2addr v11, v12

    const v12, -0x5f21e20f

    goto/16 :goto_0

    :cond_2
    const-string v10, "\u06da\u06eb"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1347

    const v12, 0x5a1994ab

    xor-int/2addr v11, v12

    const v12, -0x51cebe1f

    goto/16 :goto_0

    :sswitch_9
    const/4 v5, -0x1

    :goto_1
    const-string v10, "\u06d7\u06db"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6265

    const v12, 0x752b3f57

    xor-int/2addr v11, v12

    const v12, -0x3098fd03

    goto/16 :goto_0

    :sswitch_a
    const/4 v3, 0x0

    :goto_2
    const-string v10, "\u06d9\u06e1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x59

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3d6b

    const v12, -0x15bbfc10

    xor-int/2addr v11, v12

    const v12, 0x1999121f

    goto/16 :goto_0

    .line 114
    :sswitch_b
    iget v10, p0, Ll/ܿۗ᩻;->ܿ:I

    if-nez v10, :cond_3

    const-string v10, "\u06d9\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1593

    const v12, 0x7978728c

    xor-int/2addr v11, v12

    const v12, -0xa835c69

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u1a75\u06d7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x17a5

    const v12, -0x2b4c9d97

    xor-int/2addr v11, v12

    const v12, 0x1708e6e9

    goto/16 :goto_0

    :sswitch_c
    return v2

    :sswitch_d
    add-int v10, v0, v1

    const/4 v11, -0x2

    if-ne v10, v11, :cond_4

    const-string v10, "\u073d\u06d6"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x4d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3e3

    const v12, -0x6df59125

    xor-int/2addr v11, v12

    const v12, 0x6015f568

    goto/16 :goto_0

    :cond_4
    move v2, v10

    :goto_3
    const-string v10, "\u1a76\u0733"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2277

    const v12, 0x400f1d23

    xor-int/2addr v11, v12

    const v12, -0x29db601

    goto/16 :goto_0

    :sswitch_e
    const/4 v1, -0x2

    .line 25
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v10

    if-gtz v10, :cond_5

    const-string v10, "\u05a8\u073d"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x387

    const v12, 0x69a43a00

    xor-int/2addr v11, v12

    const v12, 0x64ea7709

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u06e2\u06eb"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4795

    const v12, -0x6cf8e7a3

    xor-int/2addr v11, v12

    const v12, -0x26aacc0e

    goto/16 :goto_0

    .line 102
    :sswitch_f
    sget-boolean v10, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v10, :cond_6

    goto :goto_4

    :cond_6
    const-string v10, "\u0736\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x33

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5e4f

    const v12, 0x5318db10

    xor-int/2addr v11, v12

    const v12, 0x46fd9e78

    goto/16 :goto_0

    .line 120
    :sswitch_10
    sget v10, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v10, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v10, "\u06e2\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x63

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x641b

    const v12, 0x1f8cf636

    xor-int/2addr v11, v12

    const v12, -0x453d1eb4

    goto/16 :goto_0

    .line 33
    :sswitch_11
    sget v10, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v10, :cond_9

    :cond_8
    :goto_4
    const-string v10, "\u06e4\u05a8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3a81

    const v12, -0x50316fcf

    xor-int/2addr v11, v12

    const v12, -0x70fc922a

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a76\u1a7b"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7333

    const v12, -0x7642ca41

    xor-int/2addr v11, v12

    const v12, -0x5a090661

    goto/16 :goto_0

    .line 101
    :sswitch_12
    sget v10, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v10, :cond_a

    goto :goto_5

    :cond_a
    const-string v10, "\u06d9\u06e2"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x68e5

    const v12, 0x352a5f30

    xor-int/2addr v11, v12

    const v12, 0x7fba397f

    goto/16 :goto_0

    .line 84
    :sswitch_13
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v10

    if-gtz v10, :cond_b

    goto :goto_5

    :cond_b
    const-string v10, "\u05ab\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x79f3

    const v12, 0x78341c67

    xor-int/2addr v11, v12

    const v12, 0x52e16211

    goto/16 :goto_0

    :sswitch_14
    sget v10, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v10, :cond_c

    goto :goto_5

    :cond_c
    const-string v10, "\u06da\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x39

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x169

    const v12, -0x5b031c58

    xor-int/2addr v11, v12

    const v12, -0x70bd1661

    goto/16 :goto_0

    :sswitch_15
    sget v10, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v10, :cond_e

    :cond_d
    :goto_5
    const-string v10, "\u073d\u06e8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6ee3

    const v12, -0x55d97485

    xor-int/2addr v11, v12

    const v12, -0xea800c6

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u1a75\u06ec"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x73

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x125b

    const v12, 0x527dcece

    xor-int/2addr v11, v12

    const v12, -0x5ae7bdd

    goto/16 :goto_0

    .line 111
    :sswitch_16
    iget v0, p0, Ll/ܿۗ᩻;->ܽ:I

    .line 9
    sget v10, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v10, :cond_f

    :goto_6
    const-string v10, "\u05a1\u06db"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x769b

    const v12, 0x7b114045

    xor-int/2addr v11, v12

    const v12, 0x4f05d4bf

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u1a7a\u06da"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x59b5

    const v12, -0x6bfc328

    xor-int/2addr v11, v12

    const v12, 0x11a3e39b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c0be666 -> :sswitch_16
        -0x76a641dd -> :sswitch_5
        -0x673b373a -> :sswitch_4
        -0x6527cdd9 -> :sswitch_14
        -0x632e20a7 -> :sswitch_9
        -0x6124d7df -> :sswitch_8
        -0x5987ce88 -> :sswitch_16
        -0x59852e29 -> :sswitch_0
        -0x582e623c -> :sswitch_c
        -0x549c1d3f -> :sswitch_13
        -0x541808c9 -> :sswitch_3
        -0x454593fe -> :sswitch_3
        -0x444c9651 -> :sswitch_2
        -0x2f4dab83 -> :sswitch_11
        -0x2a4ca62c -> :sswitch_1
        -0x2a158ef0 -> :sswitch_6
        -0x27602d9f -> :sswitch_11
        -0x26e79e81 -> :sswitch_b
        -0x23963cef -> :sswitch_f
        -0x2119ff70 -> :sswitch_b
        -0x1ff22832 -> :sswitch_4
        -0x1af4d6b4 -> :sswitch_1
        -0x12ac3092 -> :sswitch_e
        -0x11e959ea -> :sswitch_8
        -0xbaa7e4 -> :sswitch_10
        0xb1fcc0 -> :sswitch_7
        0x501ca77 -> :sswitch_c
        0x8513bda -> :sswitch_12
        0x181d8786 -> :sswitch_7
        0x24700bdc -> :sswitch_15
        0x287649dd -> :sswitch_12
        0x365f71cd -> :sswitch_6
        0x48fd9d73 -> :sswitch_0
        0x572a4507 -> :sswitch_f
        0x5a74fb7c -> :sswitch_9
        0x678c3102 -> :sswitch_e
        0x68cb7d2d -> :sswitch_2
        0x6d1d97b7 -> :sswitch_5
        0x720ca29f -> :sswitch_14
        0x7285a6a9 -> :sswitch_15
        0x749a832c -> :sswitch_d
        0x76e1bc2b -> :sswitch_10
        0x77fd52f1 -> :sswitch_13
        0x78c7aff9 -> :sswitch_d
        0x7ac6eff2 -> :sswitch_a
        0x7af6a694 -> :sswitch_a
    .end sparse-switch
.end method

.method public ۧ(I)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x41d4671a

    sget v6, Ll/֡ᩴ;->ܳۤ֫:I

    sget v7, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v8, "\u1a7a\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x332d

    const v10, 0x2a60d711

    xor-int/2addr v9, v10

    const v10, 0x1c358393

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x6c31

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 128
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v8

    if-lez v8, :cond_e

    goto/16 :goto_3

    .line 134
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v8, Ll/᩺;->ۙۛܶ:I

    if-lez v8, :cond_c

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v8, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v8, :cond_8

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    const/4 p1, 0x0

    return p1

    :sswitch_4
    neg-int p1, v4

    return p1

    :sswitch_5
    not-int p1, v4

    return p1

    :sswitch_6
    const/4 p1, -0x1

    return p1

    :sswitch_7
    return v0

    :sswitch_8
    return v4

    .line 165
    :sswitch_9
    invoke-direct {p0}, Ll/ܿۗ᩻;->ܽ()I

    move-result v8

    if-gt p1, v8, :cond_0

    const-string v8, "\u06e8\u06d7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3acf

    const v10, 0x61859550

    xor-int/2addr v9, v10

    const v10, 0x5ffbada3

    goto :goto_0

    :cond_0
    const-string v8, "\u06d8\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x37

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6cf9

    const v10, -0x67e84542

    xor-int/2addr v9, v10

    const v10, 0x5c6abbe4

    goto :goto_0

    .line 135
    :sswitch_a
    iget v8, p0, Ll/ܿۗ᩻;->ܿ:I

    if-gez v8, :cond_1

    const-string v8, "\u06d7\u1a7b"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x760f

    const v10, 0x1bc8409d

    xor-int/2addr v9, v10

    const v10, 0x4f20d526

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06e1\u05ab"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3fff

    const v10, -0x5581dfbc

    xor-int/2addr v9, v10

    const v10, -0x18f8afec

    goto/16 :goto_0

    :sswitch_b
    add-int v4, v2, v3

    .line 162
    aget v4, v1, v4

    .line 164
    iget v8, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz v8, :cond_2

    const-string v8, "\u073f\u06d8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x5b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x318d

    const v10, -0x6252a1e2

    xor-int/2addr v9, v10

    const v10, 0x62b383d4

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u05ab\u06d7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x9

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x53c1

    const v10, 0x79cb6f04

    xor-int/2addr v9, v10

    const v10, 0x5dda7605

    goto/16 :goto_0

    :sswitch_c
    const/4 v3, -0x1

    .line 79
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v8

    if-gtz v8, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v8, "\u073f\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x29

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5345

    const v10, -0x7ddefba3

    xor-int/2addr v9, v10

    const v10, 0x7178ab2a

    goto/16 :goto_0

    .line 162
    :sswitch_d
    array-length v2, v1

    sub-int/2addr v2, p1

    .line 68
    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u1a7b\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x6f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x12db

    const v10, -0x15f9ddf

    xor-int/2addr v9, v10

    const v10, -0x48cc97ee

    goto/16 :goto_0

    :sswitch_e
    return v0

    .line 159
    :sswitch_f
    iget-object v1, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v8, v1

    if-lt p1, v8, :cond_5

    const-string v8, "\u1a73\u06d6"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x18c7

    const v10, 0x45f0e623

    xor-int/2addr v9, v10

    const v10, 0x1b43347f

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u1a79\u1a79"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x75b7

    const v10, -0x45dd67eb

    xor-int/2addr v9, v10

    const v10, 0x53785200

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    if-gez p1, :cond_6

    const-string v8, "\u1a7a\u1a77"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2167

    const v10, -0x50558ebf

    xor-int/2addr v9, v10

    const v10, 0x55eb6b8e

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06d9\u1a74"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x37a3

    const v10, -0x2ffc150

    xor-int/2addr v9, v10

    const v10, 0x22f6f90d

    goto/16 :goto_0

    .line 58
    :sswitch_11
    sget v8, Ll/֨۟;->᩹֫᩷:I

    if-eqz v8, :cond_7

    :goto_1
    const-string v8, "\u06e1\u06e8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5af9

    const v10, 0x2aa9df38

    xor-int/2addr v9, v10

    const v10, -0x42bf6c5b

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e8\u1a78"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x55

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x159d

    const v10, 0x74cff348

    xor-int/2addr v9, v10

    const v10, 0xacf3788

    goto/16 :goto_0

    .line 119
    :sswitch_12
    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v8, :cond_9

    :cond_8
    :goto_2
    const-string v8, "\u0730\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x31c7

    const v10, -0x129a6859

    xor-int/2addr v9, v10

    const v10, 0x16bc6fe3

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a7a\u1a7a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4a2f

    const v10, -0x173935b5

    xor-int/2addr v9, v10

    const v10, -0x70fb3ff1

    goto/16 :goto_0

    :sswitch_13
    sget-boolean v8, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v8, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v8, "\u073a\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x55

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3f2d

    const v10, -0x6cd94b6f

    xor-int/2addr v9, v10

    const v10, -0x1ee03164

    goto/16 :goto_0

    :sswitch_14
    sget v8, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v8, :cond_b

    goto :goto_4

    :cond_b
    const-string v8, "\u05a8\u06d9"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6cfd

    const v10, 0x53e6f7bd

    xor-int/2addr v9, v10

    const v10, 0x22272b52

    goto/16 :goto_0

    :sswitch_15
    sget-boolean v8, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v8, :cond_d

    :cond_c
    :goto_3
    const-string v8, "\u06da\u0730"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x545

    const v10, 0x359bda8c

    xor-int/2addr v9, v10

    const v10, -0x2341622f

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u073f\u1a7a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x53f3

    const v10, 0x5a619f8f

    xor-int/2addr v9, v10

    const v10, 0x428be735

    goto/16 :goto_0

    .line 23
    :sswitch_16
    sget v8, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v8, :cond_f

    :cond_e
    :goto_4
    const-string v8, "\u1a77\u06d9"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4cd9

    const v10, 0x225d2c74

    xor-int/2addr v9, v10

    const v10, 0x719b8abd

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u073a\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x69cf

    const v10, -0x5acb21f

    xor-int/2addr v9, v10

    const v10, 0x59bbc556

    goto/16 :goto_0

    .line 147
    :sswitch_17
    sget-boolean v8, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v8, :cond_10

    goto :goto_5

    :cond_10
    const-string v8, "\u06db\u06d6"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5857

    const v10, -0xf2fbacf

    xor-int/2addr v9, v10

    const v10, -0x7e78d9b9

    goto/16 :goto_0

    .line 103
    :sswitch_18
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v8

    if-gtz v8, :cond_11

    :goto_5
    const-string v8, "\u1a78\u06d9"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x48a3

    const v10, 0x46079f49

    xor-int/2addr v9, v10

    const v10, 0x20c44f87

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u06da\u06d6"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x853

    const v10, -0x34ae019b    # -1.3762149E7f

    xor-int/2addr v9, v10

    const v10, -0x454b7978

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d440eed -> :sswitch_a
        -0x7d3dee96 -> :sswitch_d
        -0x755c8f54 -> :sswitch_d
        -0x71bd82fa -> :sswitch_4
        -0x70b88a10 -> :sswitch_2
        -0x6da64c04 -> :sswitch_b
        -0x6ccdef9c -> :sswitch_14
        -0x69c759cb -> :sswitch_15
        -0x697c3c1c -> :sswitch_7
        -0x6166c818 -> :sswitch_6
        -0x6120d03b -> :sswitch_17
        -0x5e1daa83 -> :sswitch_8
        -0x57f03c16 -> :sswitch_10
        -0x493847e3 -> :sswitch_5
        -0x44239d34 -> :sswitch_13
        -0x3e34cfd5 -> :sswitch_17
        -0x36cb6cf3 -> :sswitch_14
        -0x3485c4be -> :sswitch_3
        -0x34381e18 -> :sswitch_9
        -0x33ec24e4 -> :sswitch_e
        -0x32704bb9 -> :sswitch_18
        -0x2c630cf5 -> :sswitch_9
        -0x296fddc9 -> :sswitch_18
        -0x1ce16ae3 -> :sswitch_c
        -0x1c3c1e15 -> :sswitch_0
        -0x1055da7b -> :sswitch_8
        -0xcb0e404 -> :sswitch_f
        -0x811c2e5 -> :sswitch_10
        -0x4bc58f3 -> :sswitch_15
        0x3fc4a80 -> :sswitch_1
        0xd074a0d -> :sswitch_1
        0xda0e8e0 -> :sswitch_0
        0x136c6309 -> :sswitch_16
        0x16fc70e0 -> :sswitch_11
        0x178c8745 -> :sswitch_e
        0x1841eaec -> :sswitch_b
        0x303b19da -> :sswitch_6
        0x3828c196 -> :sswitch_f
        0x3c0d3446 -> :sswitch_5
        0x433ba240 -> :sswitch_12
        0x455c111e -> :sswitch_11
        0x4931180d -> :sswitch_13
        0x4c7b7586 -> :sswitch_2
        0x503ef156 -> :sswitch_16
        0x5b8b2ee6 -> :sswitch_12
        0x6cf943c8 -> :sswitch_3
        0x6d4a0446 -> :sswitch_a
        0x7299a247 -> :sswitch_c
        0x7c145abc -> :sswitch_4
        0x7efc7551 -> :sswitch_7
    .end sparse-switch
.end method
