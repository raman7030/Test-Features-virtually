.class public final synthetic Ll/ᩴۖ᩷;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩹᩹ۚ:[S


# instance fields
.field public final synthetic ᩸:Ll/᩵ۖ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴۖ᩷;->᩹᩹ۚ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1443s
        -0x693fs
        -0x6f65s
        0x6b8as
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/᩵ۖ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۖ᩷;->᩸:Ll/᩵ۖ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
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

    const v13, -0x4160302b

    sget v14, Ll/ۗ۬;->ۘܳ᩻:I

    sget v15, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v16, "\u06e8\u06e8"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v15, v16

    mul-int/lit8 v16, v16, 0x79

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x2a33

    const v18, -0x9c445c0

    xor-int v0, v0, v18

    const v18, -0x5c850df5

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v12, v11

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const v16, -0x4160302b

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, -0x1bbf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    const v0, 0xfb3d

    const v11, 0xfb3d

    goto/16 :goto_2

    .line 32
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_6

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_3

    .line 129
    :sswitch_2
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v0, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    goto :goto_1

    .line 179
    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 223
    :sswitch_5
    invoke-static {v1, v2}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    .line 224
    invoke-virtual {v1}, Ll/֨ܿ;->invalidateOptionsMenu()V

    return-void

    .line 223
    :sswitch_6
    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7eb8782e

    xor-int/2addr v2, v0

    .line 20
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u06d7\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x142d

    const v17, 0x6d924199

    xor-int v4, v4, v17

    const v17, 0x4b31aa8c    # 1.1643532E7f

    goto/16 :goto_5

    :sswitch_7
    const/4 v0, 0x3

    .line 223
    invoke-static {v12, v13, v0, v11}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v3

    .line 156
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_1

    const-string v0, "\u06da\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x75

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x7195

    const v17, 0x67dfe5

    xor-int v4, v4, v17

    const v17, 0x7b06bb4e

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u06e8\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x2af3

    const v17, 0x18927ec6

    xor-int v4, v4, v17

    const v17, 0x2924335c

    goto/16 :goto_5

    :sswitch_8
    const/4 v13, 0x1

    .line 5
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_2

    :goto_1
    const-string v0, "\u1a73\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x555d

    const v17, 0x5e8f95f9

    xor-int v4, v4, v17

    const v17, -0x3f36dd1f

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u1a78\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x41

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0xb4d

    const v17, -0x79bfacc9

    xor-int v4, v4, v17

    const v17, -0x71b67325

    goto/16 :goto_5

    .line 223
    :sswitch_9
    sget-object v12, Ll/ᩴۖ᩷;->᩹᩹ۚ:[S

    .line 190
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u06d6\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0xb

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x16f5

    const v17, -0x16ed20ed

    xor-int v4, v4, v17

    const v17, 0x6ae544f6

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ᩴۖ᩷;->᩸:Ll/᩵ۖ᩷;

    .line 223
    iget-object v1, v1, Ll/᩵ۖ᩷;->ܳ:Ll/᩹ۖ᩷;

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v14, v4

    mul-int/lit8 v4, v4, 0x37

    xor-int v0, v4, v15

    mul-int/lit16 v0, v0, 0x45fd

    const v17, 0x203d7573

    xor-int v0, v0, v17

    const v17, -0x3e9b42c7

    xor-int v17, v4, v17

    goto/16 :goto_0

    :sswitch_b
    const/16 v0, 0x390

    const/16 v11, 0x390

    :goto_2
    const-string v0, "\u1a77\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x59

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x161d

    const v17, -0x4e7e838b

    xor-int v4, v4, v17

    const v17, 0x15e5ea6

    goto/16 :goto_5

    :sswitch_c
    mul-int v0, v10, v10

    sub-int/2addr v0, v8

    if-gez v0, :cond_5

    const-string v0, "\u05ab\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x6f

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0xd67

    const v17, -0x38a904dd

    xor-int v4, v4, v17

    const v17, 0x4f3615b4

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u073a\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x25bf

    const v17, -0x5c7bb983

    xor-int v4, v4, v17

    const v17, 0x3baaa4f1

    goto/16 :goto_5

    :sswitch_d
    add-int v10, v6, v9

    .line 4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v0

    if-gtz v0, :cond_7

    :cond_6
    const-string v0, "\u06e2\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x7aa7

    const v17, 0x343a7069

    xor-int v4, v4, v17

    const v17, 0x320685ef

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u1a74\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x213

    const v17, 0x3c49ed75

    xor-int v4, v4, v17

    const v17, 0x1b1e553d

    goto/16 :goto_5

    :sswitch_e
    mul-int v8, v6, v7

    const/16 v9, 0x2113

    .line 198
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x33

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x7a89

    const v17, 0x23ccf5ec

    xor-int v4, v4, v17

    const v17, -0x2d455d65

    goto/16 :goto_5

    :sswitch_f
    aget-short v6, v18, v5

    const v7, 0x844c

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_a

    :cond_9
    :goto_3
    const-string v0, "\u1a75\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x791d

    const v17, 0x218fa64f

    xor-int v4, v4, v17

    const v17, 0x5c1b93f

    goto :goto_5

    :cond_a
    const-string v0, "\u06e7\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x73c1

    const v17, -0x55f7a9c0

    xor-int v4, v4, v17

    const v17, 0x3aefd0b8

    goto :goto_5

    :sswitch_10
    const/4 v5, 0x0

    .line 165
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_b

    goto :goto_4

    :cond_b
    const-string v0, "\u073f\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x53

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x7b5b

    const v17, 0x61927c75

    xor-int v4, v4, v17

    const v17, 0x350b109c

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ᩴۖ᩷;->᩹᩹ۚ:[S

    .line 98
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_d

    :cond_c
    :goto_4
    const-string v0, "\u1a78\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x69

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x54f5

    const v17, -0x5dca6d90

    xor-int v4, v4, v17

    const v17, -0x63a78073

    goto :goto_5

    :cond_d
    const-string v0, "\u06e0\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x63

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3bd5

    const v17, 0x5267f0b2

    xor-int v4, v4, v17

    const v17, -0x92aefc2

    :goto_5
    xor-int v17, v0, v17

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f73ee5d -> :sswitch_0
        -0x7cba3979 -> :sswitch_e
        -0x5945dd4e -> :sswitch_9
        -0x59195819 -> :sswitch_d
        -0x573c1012 -> :sswitch_f
        -0x50388a0e -> :sswitch_b
        -0x4fe80ad4 -> :sswitch_7
        -0x4e62b2d7 -> :sswitch_1
        -0x46bf2023 -> :sswitch_2
        -0x43597b57 -> :sswitch_9
        -0x3bc1c636 -> :sswitch_c
        -0x38007b8d -> :sswitch_a
        -0x3340b4c4 -> :sswitch_2
        -0x2bce3fa0 -> :sswitch_11
        -0x260f4dd6 -> :sswitch_3
        -0x251e2bd2 -> :sswitch_3
        -0x1c65e6b9 -> :sswitch_11
        -0x19ebf3b4 -> :sswitch_10
        -0x9f84655 -> :sswitch_6
        -0x5e14e79 -> :sswitch_7
        0x3944b3c -> :sswitch_8
        0x9e3122f -> :sswitch_0
        0x107f325e -> :sswitch_1
        0x187b1146 -> :sswitch_f
        0x18965405 -> :sswitch_e
        0x197f1ab2 -> :sswitch_4
        0x1fe94e26 -> :sswitch_4
        0x4287cffc -> :sswitch_b
        0x439507b2 -> :sswitch_10
        0x597776fe -> :sswitch_d
        0x5ab46d86 -> :sswitch_5
        0x69482807 -> :sswitch_5
        0x6ac9b7aa -> :sswitch_a
        0x6c055e25 -> :sswitch_8
        0x72ae3a7e -> :sswitch_6
        0x787ff172 -> :sswitch_c
    .end sparse-switch
.end method
