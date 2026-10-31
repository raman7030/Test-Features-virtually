.class public final Ll/ۢܽ᩷;
.super Ll/ۗ۬ۧ;
.source "D2S2"


# static fields
.field private static final ۜۧۢ:[S


# instance fields
.field public final synthetic ֫:Ll/ۚܽ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۢܽ᩷;->ۜۧۢ:[S

    return-void

    :array_0
    .array-data 2
        0x6das
        0x46es
        -0x25s
        -0xad4s
        0x1319s
        -0x207s
        0xbfes
        0x46ds
        -0x35a9s
        -0xb76s
    .end array-data
.end method

.method public constructor <init>(Ll/ۚܽ᩷;Landroid/view/View;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

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

    const v16, 0x53a1c8ce

    sget v17, Ll/֡֡;->֫ۤܳ:I

    sget v18, Ll/ۘ᩻;->᩵ۜ֨:I

    sget-object v19, Ll/ۢܽ᩷;->ۜۧۢ:[S

    const/16 v20, 0x0

    aget-short v2, v19, v20

    mul-int v19, v2, v2

    const v20, 0x3896611

    add-int v19, v19, v20

    add-int v19, v19, v19

    add-int/lit16 v2, v2, 0x1e17

    mul-int v2, v2, v2

    sub-int v2, v2, v19

    if-gtz v2, :cond_0

    const v2, 0x95ce

    goto :goto_0

    :cond_0
    const/16 v2, 0x6684

    :goto_0
    move-object/from16 v3, p1

    .line 175
    iput-object v3, v0, Ll/ۢܽ᩷;->֫:Ll/ۚܽ᩷;

    .line 176
    invoke-direct {v0, v1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const-string v20, "\u05a1\u06e4"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    sub-int v20, v17, v20

    mul-int/lit8 v20, v20, 0x23

    xor-int v4, v20, v18

    mul-int/lit16 v4, v4, -0x23cb

    const v23, -0x924b472

    xor-int v4, v4, v23

    const v23, -0x5b9b4a7c

    xor-int v20, v20, v23

    move-object/from16 v16, v6

    move-object v9, v14

    move/from16 v21, v20

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const v20, 0x53a1c8ce

    const/16 v22, 0x0

    move v6, v4

    move-object v14, v11

    const/4 v4, 0x0

    :goto_1
    xor-int v11, v20, v18

    mul-int/lit16 v11, v11, -0x2b8f

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v6, v11

    xor-int v20, v21, v6

    sparse-switch v20, :sswitch_data_0

    .line 48
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_7

    goto/16 :goto_6

    .line 98
    :sswitch_0
    sget v6, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v6, :cond_9

    goto :goto_2

    .line 171
    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v6

    if-ltz v6, :cond_d

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    :goto_2
    const-string v6, "\u06e1\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, 0x4433

    const v21, 0x6b7019a2

    xor-int v11, v11, v21

    const v21, 0x78ed315e

    goto/16 :goto_5

    .line 141
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 199
    :sswitch_4
    invoke-static {v8}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v2

    iput v2, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v2, 0x0

    .line 200
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 201
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->requestLayout()V

    return-void

    .line 199
    :sswitch_5
    invoke-static/range {p2 .. p2}, Ll/۠;->۠ۘۨ(Ljava/lang/Object;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    const/high16 v8, 0x40a00000    # 5.0f

    .line 135
    sget-boolean v6, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u06ec\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v18

    mul-int/lit8 v6, v6, 0x3

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, -0x1953

    const v21, 0x6eae8fe1

    xor-int v11, v11, v21

    const v21, 0x1a09dbfd

    goto/16 :goto_5

    .line 197
    :sswitch_6
    invoke-static {v5, v4}, Ll/ۘۛ;->ۜۧܽ(Ljava/lang/Object;I)V

    const/4 v6, 0x0

    .line 198
    invoke-static {v1, v6}, Ll/֫᩺;->ܰۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v6, "\u1a75\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v17

    mul-int/lit8 v6, v6, 0x3f

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, 0xadd

    const v21, -0x15ce0b16

    xor-int v11, v11, v21

    const v21, -0x2f255534

    goto/16 :goto_5

    .line 184
    :sswitch_7
    new-instance v2, Ll/ۜܽ᩷;

    invoke-direct {v2, v0, v5}, Ll/ۜܽ᩷;-><init>(Ll/ۢܽ᩷;Landroid/widget/TextView;)V

    invoke-static {v1, v2}, Ll/֫᩺;->ܰۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_8
    const v6, 0x7d3cac99

    xor-int/2addr v6, v13

    .line 183
    invoke-static {v5, v6}, Ll/֫᩹;->ۢ᩻ۖ(Ljava/lang/Object;I)V

    .line 22
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u06e8\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v17

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, -0x54d1

    const v21, 0x78d9ebb9

    xor-int v11, v11, v21

    const v21, -0x130c042c

    goto/16 :goto_5

    :sswitch_9
    const/4 v6, 0x3

    .line 182
    invoke-static {v9, v10, v6, v2}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    .line 142
    sget v6, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u073f\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v18, v6

    mul-int/lit8 v6, v6, 0x4d

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, -0x7d89

    const v21, 0x54d0ae0b

    xor-int v11, v11, v21

    const v21, 0x6d84db9d

    goto/16 :goto_5

    :sswitch_a
    const/high16 v6, 0x3f000000    # 0.5f

    .line 182
    invoke-static {v5, v6}, Ll/֨ᩴ;->֫᩻ܽ(Ljava/lang/Object;F)V

    sget-object v9, Ll/ۢܽ᩷;->ۜۧۢ:[S

    const/4 v10, 0x7

    .line 58
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v6, "\u06dc\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v17

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, 0x3927

    const v21, -0x39ba4a27

    xor-int v11, v11, v21

    const v21, 0x440cc8eb

    goto/16 :goto_5

    :sswitch_b
    const v5, 0x7d0d6c12

    xor-int/2addr v5, v12

    .line 178
    invoke-static {v1, v5}, Ll/֨ۡ;->᩸֫ۗ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 179
    invoke-static/range {p1 .. p1}, Ll/ۚܽ᩷;->ᩳ(Ll/ۚܽ᩷;)Z

    move-result v6

    if-eqz v6, :cond_6

    const-string v6, "\u06dc\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, 0x3c27

    const v21, 0x2bf79c

    xor-int v11, v11, v21

    const v21, -0x1fce2093

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u1a77\u06d9"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, 0x625d

    const v21, 0x2b6620d0

    xor-int v11, v11, v21

    const v21, 0x2a21aab

    goto/16 :goto_5

    .line 177
    :sswitch_c
    invoke-static {v14, v15, v3, v2}, Ll/۟;->ۜܿܰ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_8

    :cond_7
    const-string v6, "\u06db\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, 0x518b

    const v21, 0x205b585b

    xor-int v11, v11, v21

    const v21, 0x5ca57bee

    goto/16 :goto_5

    :cond_8
    const-string v6, "\u06e1\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v17

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, -0x3d3

    const v21, -0x27f10d9e

    xor-int v11, v11, v21

    const v21, 0x28fbb58c

    goto/16 :goto_5

    :sswitch_d
    sget-object v14, Ll/ۢܽ᩷;->ۜۧۢ:[S

    const/4 v15, 0x4

    const/4 v3, 0x3

    .line 129
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_a

    :cond_9
    :goto_3
    const-string v6, "\u06e8\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v17

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, -0x4b25

    const v21, 0x15ee5f08

    xor-int v11, v11, v21

    const v21, -0x40952b1f

    goto/16 :goto_5

    :cond_a
    const-string v6, "\u06da\u05a1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, 0x6021

    const v21, 0x451cd3d8

    xor-int v11, v11, v21

    const v21, -0xd553bef

    goto :goto_5

    :sswitch_e
    xor-int v4, v19, v22

    .line 177
    invoke-static {v1, v4}, Ll/ۨ;->۬ۜۤ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v4

    const/16 v6, 0x8

    invoke-static {v4, v6}, Ll/֨۬;->ᩳ֫ۖ(Ljava/lang/Object;I)V

    .line 22
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_b

    const/16 v4, 0x8

    :goto_4
    const-string v6, "\u06e8\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v11, v6, v17

    mul-int/lit16 v11, v11, -0x31a3

    const v21, 0x6944d5ff

    xor-int v11, v11, v21

    const v21, 0x5b664e09

    goto :goto_5

    :cond_b
    const-string v4, "\u06ec\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v17

    xor-int v11, v4, v18

    mul-int/lit16 v11, v11, -0x31c7

    const v21, -0x564b8447

    xor-int v11, v11, v21

    const v21, 0x41724a55

    xor-int v21, v4, v21

    move v6, v11

    const/16 v4, 0x8

    goto/16 :goto_1

    .line 176
    :sswitch_f
    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    const v22, 0x7d25e755

    .line 82
    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v6, :cond_c

    goto :goto_6

    :cond_c
    const-string v6, "\u06ec\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v17

    xor-int v11, v6, v18

    mul-int/lit16 v11, v11, 0x25b

    const v21, -0x2ef9b8dc

    xor-int v11, v11, v21

    const v21, 0x2258eb87

    :goto_5
    xor-int v21, v6, v21

    move v6, v11

    goto/16 :goto_1

    .line 176
    :sswitch_10
    sget-object v6, Ll/ۢܽ᩷;->ۜۧۢ:[S

    const/4 v11, 0x1

    const/4 v0, 0x3

    invoke-static {v6, v11, v0, v2}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v16

    .line 56
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_e

    :cond_d
    :goto_6
    const-string v0, "\u0730\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x4e01

    const v11, 0x3cf67450

    xor-int/2addr v6, v11

    const v11, -0x1070c79e

    goto :goto_7

    :cond_e
    const-string v0, "\u06dc\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x41

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, -0x55e7

    const v11, 0x3196c74a

    xor-int/2addr v6, v11

    const v11, 0x5f2208d4

    :goto_7
    xor-int v21, v0, v11

    move-object/from16 v0, p0

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7e4f8e67 -> :sswitch_7
        -0x78e137b5 -> :sswitch_4
        -0x77b9ef93 -> :sswitch_f
        -0x5ec6f714 -> :sswitch_a
        -0x5c738f26 -> :sswitch_5
        -0x4756f126 -> :sswitch_9
        -0x4228758d -> :sswitch_d
        -0x3909c8c2 -> :sswitch_c
        -0x2d099943 -> :sswitch_8
        -0x2ba1b88e -> :sswitch_b
        -0x2b92e6a1 -> :sswitch_6
        -0x2681eb9e -> :sswitch_10
        -0x2102d448 -> :sswitch_e
        -0x1bbc262c -> :sswitch_d
        -0x119fd0f5 -> :sswitch_8
        -0x639da54 -> :sswitch_6
        -0x248813f -> :sswitch_5
        0x67e2953 -> :sswitch_4
        0x10563d26 -> :sswitch_7
        0x132ac092 -> :sswitch_2
        0x140bb6c4 -> :sswitch_f
        0x2277de02 -> :sswitch_c
        0x2e1e813c -> :sswitch_10
        0x35434315 -> :sswitch_0
        0x36caeaea -> :sswitch_2
        0x36fd08c1 -> :sswitch_a
        0x3aa346cc -> :sswitch_9
        0x4cb1c455 -> :sswitch_3
        0x4cbb9937 -> :sswitch_3
        0x602cf98e -> :sswitch_b
        0x68f988eb -> :sswitch_1
        0x6b5365b1 -> :sswitch_e
        0x6f3aba74 -> :sswitch_0
        0x7cb9c2ea -> :sswitch_1
    .end sparse-switch
.end method
