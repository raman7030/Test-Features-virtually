.class public final Ll/ۚᩴ᩷;
.super Ll/ۧۙۧ;
.source "C2R7"


# instance fields
.field public final synthetic ֫:Ljava/util/List;

.field public final synthetic ۧ:Ll/᩵֡ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֡ᩴ;Ljava/util/List;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 907
    iput-object p1, p0, Ll/ۚᩴ᩷;->ۧ:Ll/᩵֡ᩴ;

    iput-object p2, p0, Ll/ۚᩴ᩷;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 915
    iget-object v0, p0, Ll/ۚᩴ᩷;->֫:Ljava/util/List;

    invoke-static {v0}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫(II)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x5e7509a1

    sget v7, Ll/֡ᩴ;->ܳۤ֫:I

    sget v8, Ll/ۘۨ;->۫᩸۠:I

    const-string v9, "\u05a1\u1a79"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2fd9

    const v11, -0x23d8bb10

    xor-int/2addr v10, v11

    const v11, -0xbf64ac6

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x5d97

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 189
    sget v9, Ll/֡᩶;->ܳܶ۠:I

    if-lez v9, :cond_2

    goto :goto_1

    .line 824
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v9

    if-eqz v9, :cond_c

    goto/16 :goto_4

    .line 1202
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v9, :cond_9

    goto :goto_1

    .line 210
    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    :goto_1
    const-string v9, "\u073d\u073d"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x41

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7d2b

    const v11, 0x2e5f5771

    xor-int/2addr v10, v11

    const v11, 0x18775f89

    goto :goto_0

    .line 788
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    :sswitch_5
    const/4 p1, 0x0

    return p1

    .line 926
    :sswitch_6
    iget-object v9, v5, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    .line 2258
    iget-wide v9, v9, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v11, v2, v9

    if-nez v11, :cond_0

    const-string v9, "\u06d8\u06d9"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x31fb

    const v11, -0x67641545

    xor-int/2addr v10, v11

    const v11, 0x6393fc8c

    goto :goto_0

    :cond_0
    const-string v9, "\u06eb\u06da"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7ab

    const v11, 0x1dd9a6ac

    xor-int/2addr v10, v11

    const v11, 0x36ff4fed

    goto :goto_0

    .line 926
    :sswitch_7
    move-object v5, v4

    check-cast v5, Ll/ۙᩴ᩷;

    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    const-string v9, "\u073d\u1a77"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6c19

    const v11, 0x3aef56ab

    xor-int/2addr v10, v11

    const v11, 0x3f6fd33c

    goto/16 :goto_0

    .line 2258
    :sswitch_8
    iget-wide v2, v1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 925
    iget-object v4, p0, Ll/ۚᩴ᩷;->֫:Ljava/util/List;

    .line 926
    invoke-static {v4, p2}, Ll/᩺;->֫ۢۡ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    .line 1594
    sget v9, Ll/᩹;->ۤܿܳ:I

    if-eqz v9, :cond_3

    :cond_2
    :goto_2
    const-string v9, "\u06e8\u0733"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x55

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2f91

    const v11, -0x1b16018c

    xor-int/2addr v10, v11

    const v11, 0x10f561d0

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u06db\u06eb"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x41

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5163

    const v11, -0x5f5b6b5d

    xor-int/2addr v10, v11

    const v11, -0x780378e

    goto/16 :goto_0

    .line 925
    :sswitch_9
    move-object v1, v0

    check-cast v1, Ll/ۙᩴ᩷;

    iget-object v1, v1, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    sget v9, Ll/֫᩵᩷;->ۛۧ:I

    sget-boolean v9, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v9, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v9, "\u073a\u06e2"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1797

    const v11, -0x70f01ba4

    xor-int/2addr v10, v11

    const v11, 0x3a2cac6e

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Ll/ۚᩴ᩷;->ۧ:Ll/᩵֡ᩴ;

    invoke-virtual {v0, p1}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v9

    if-eqz v9, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v9, "\u1a73\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x1f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3de9

    const v11, 0x3ba7511

    xor-int/2addr v10, v11

    const v11, -0x20de5e60

    goto/16 :goto_0

    .line 856
    :sswitch_b
    sget v9, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v9, :cond_6

    goto :goto_3

    :cond_6
    const-string v9, "\u06e2\u1a77"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x249b

    const v11, -0x2d83e01c

    xor-int/2addr v10, v11

    const v11, -0x330eaad9    # -1.265278E8f

    goto/16 :goto_0

    .line 920
    :sswitch_c
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    const-string v9, "\u1a76\u06e4"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7db9

    const v11, 0x4b07f812    # 8910866.0f

    xor-int/2addr v10, v11

    const v11, 0x235ec3f9

    goto/16 :goto_0

    :sswitch_d
    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_8

    :goto_3
    const-string v9, "\u1a79\u073a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x59

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7cf9

    const v11, 0x4b714f96    # 1.581455E7f

    xor-int/2addr v10, v11

    const v11, 0x15b5347f

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06e2\u06d9"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7577

    const v11, 0x39506855

    xor-int/2addr v10, v11

    const v11, -0x7332814c

    goto/16 :goto_0

    .line 750
    :sswitch_e
    sget v9, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v9, :cond_a

    :cond_9
    :goto_4
    const-string v9, "\u06e7\u1a7a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2689

    const v11, 0x439edb56

    xor-int/2addr v10, v11

    const v11, -0x3708238d

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06d6\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5109

    const v11, 0x6b331c80

    xor-int/2addr v10, v11

    const v11, 0x71e46163

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_5

    :cond_b
    const-string v9, "\u06d8\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5b95

    const v11, 0x631465a6

    xor-int/2addr v10, v11

    const v11, -0x6a0b7255

    goto/16 :goto_0

    .line 834
    :sswitch_10
    sget v9, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v9, :cond_d

    :cond_c
    :goto_5
    const-string v9, "\u073d\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xa7

    const v11, -0x4a46b6ee

    xor-int/2addr v10, v11

    const v11, -0x3a9340d

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u0730\u06e4"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5323

    const v11, 0x152a249e

    xor-int/2addr v10, v11

    const v11, -0x78f3a9db

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b24ad08 -> :sswitch_6
        -0x7a8ffe68 -> :sswitch_4
        -0x7a3e79d5 -> :sswitch_9
        -0x50fb92f3 -> :sswitch_5
        -0x5064edf8 -> :sswitch_9
        -0x47dcc2f2 -> :sswitch_1
        -0x3a41213e -> :sswitch_b
        -0x28fb937c -> :sswitch_4
        -0x2673f00d -> :sswitch_6
        -0x24aa788c -> :sswitch_d
        -0x2330936d -> :sswitch_8
        -0x22d230f4 -> :sswitch_c
        -0x1f440473 -> :sswitch_7
        -0x18ec13b0 -> :sswitch_7
        -0x17a35e2b -> :sswitch_10
        -0xb64448 -> :sswitch_3
        0x98fd9dc -> :sswitch_b
        0x12ea5bd7 -> :sswitch_10
        0x15365d2c -> :sswitch_c
        0x1ab50a44 -> :sswitch_1
        0x23d93472 -> :sswitch_a
        0x370be3ca -> :sswitch_0
        0x3e69e0c6 -> :sswitch_f
        0x3ff3c906 -> :sswitch_5
        0x40a8c8b5 -> :sswitch_d
        0x46b8e81a -> :sswitch_2
        0x491ddcc5 -> :sswitch_3
        0x533f021a -> :sswitch_f
        0x550a455d -> :sswitch_a
        0x6d36d91d -> :sswitch_0
        0x6e171006 -> :sswitch_e
        0x731770ae -> :sswitch_e
        0x773d3f91 -> :sswitch_8
        0x7bbb73a5 -> :sswitch_2
    .end sparse-switch
.end method

.method public final ۧ()I
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ۚᩴ᩷;->ۧ:Ll/᩵֡ᩴ;

    invoke-virtual {v0}, Ll/᩵֡ᩴ;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ(II)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x5e32ba72

    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    sget v6, Ll/֡۬;->۠֡᩶:I

    const-string v7, "\u06d7\u1a76"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x75

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5f57

    const v9, 0x508525e5

    xor-int/2addr v8, v9

    const v9, -0x1ae5f0d3

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x40bd

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_7

    goto/16 :goto_3

    :sswitch_0
    sget v7, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v7, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v7, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v7, :cond_b

    goto :goto_1

    .line 394
    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget-boolean v7, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v7, "\u06e7\u1a75"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x45

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x135f

    const v9, -0x5bfc7c78

    xor-int/2addr v8, v9

    const v9, 0x1dabe5ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 p1, 0x0

    return p1

    .line 920
    :sswitch_5
    check-cast v3, Ll/ۙᩴ᩷;

    iget-object p1, v3, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    invoke-static {v2, p1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :sswitch_6
    iget-object v2, v1, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    iget-object v3, p0, Ll/ۚᩴ᩷;->֫:Ljava/util/List;

    invoke-static {v3, p2}, Ll/᩺;->֫ۢۡ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    .line 687
    sget-boolean v7, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v7, "\u06d9\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4117

    const v9, 0x17640bfe

    xor-int/2addr v8, v9

    const v9, -0x507ccda1

    goto :goto_0

    .line 920
    :sswitch_7
    invoke-virtual {v0, p1}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙᩴ᩷;

    .line 286
    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "\u1a7b\u06e0"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x2d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x423b

    const v9, -0x217513f4

    xor-int/2addr v8, v9

    const v9, 0x46c87309

    goto/16 :goto_0

    .line 920
    :sswitch_8
    iget-object v0, p0, Ll/ۚᩴ᩷;->ۧ:Ll/᩵֡ᩴ;

    .line 521
    sget v7, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v7, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u1a74\u1a75"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x5d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7b5f

    const v9, -0x1c789519

    xor-int/2addr v8, v9

    const v9, 0x473b1b45

    goto/16 :goto_0

    .line 109
    :sswitch_9
    sget v7, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u1a79\u06df"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6b27

    const v9, 0x4a08a391    # 2238692.2f

    xor-int/2addr v8, v9

    const v9, -0x76408ce9

    goto/16 :goto_0

    .line 261
    :sswitch_a
    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_5

    :goto_2
    const-string v7, "\u06db\u06df"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4c75

    const v9, 0x426ed807

    xor-int/2addr v8, v9

    const v9, -0x59f39f72

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06d8\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x27

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4ea3

    const v9, -0x65279acd

    xor-int/2addr v8, v9

    const v9, 0x45b8fd3f

    goto/16 :goto_0

    .line 414
    :sswitch_b
    sget v7, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v7, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v7, "\u1a7b\u1a7b"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x7b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x68fd

    const v9, -0x22b3ecf1

    xor-int/2addr v8, v9

    const v9, 0x2d065e5b

    goto/16 :goto_0

    :goto_3
    const-string v7, "\u073f\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7bc1

    const v9, -0x45b57f1b

    xor-int/2addr v8, v9

    const v9, 0x17cd97f7

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u1a74\u06eb"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3dcf

    const v9, 0xa600843

    xor-int/2addr v8, v9

    const v9, 0x7fb3b30e

    goto/16 :goto_0

    :sswitch_c
    sget v7, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v7, :cond_8

    goto :goto_4

    :cond_8
    const-string v7, "\u0733\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x33

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5395

    const v9, 0x43d34ae6

    xor-int/2addr v8, v9

    const v9, 0x58ea610d

    goto/16 :goto_0

    .line 206
    :sswitch_d
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_a

    :cond_9
    :goto_4
    const-string v7, "\u06e8\u1a76"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x28b5

    const v9, 0x320386d

    xor-int/2addr v8, v9

    const v9, -0x19975aa6

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u073f\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x37

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5991

    const v9, -0x40f34af3

    xor-int/2addr v8, v9

    const v9, 0x1f8f850f

    goto/16 :goto_0

    .line 251
    :sswitch_e
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v7

    if-ltz v7, :cond_c

    :cond_b
    :goto_5
    const-string v7, "\u0736\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3269

    const v9, 0x2212e29c

    xor-int/2addr v8, v9

    const v9, 0x6a9783f4

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u073a\u1a78"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x32f7

    const v9, -0x512e3a0a

    xor-int/2addr v8, v9

    const v9, -0x2cd2c392

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79fd6fb9 -> :sswitch_e
        -0x72904ef4 -> :sswitch_5
        -0x71f104c3 -> :sswitch_9
        -0x6ea8f470 -> :sswitch_8
        -0x6deefff7 -> :sswitch_b
        -0x59bd79f7 -> :sswitch_a
        -0x484ea308 -> :sswitch_2
        -0x47b2b211 -> :sswitch_d
        -0x452fefdb -> :sswitch_c
        -0x26013683 -> :sswitch_6
        -0x15408c18 -> :sswitch_7
        -0xe76d784 -> :sswitch_1
        0x33396b -> :sswitch_a
        0x525d43a -> :sswitch_3
        0xbc9dc24 -> :sswitch_1
        0xf262fec -> :sswitch_4
        0x11d1af04 -> :sswitch_0
        0x11e285a7 -> :sswitch_3
        0x19319e08 -> :sswitch_e
        0x27872422 -> :sswitch_4
        0x3e8c4fe0 -> :sswitch_d
        0x4222609c -> :sswitch_5
        0x48fb3e23 -> :sswitch_7
        0x4bad321a -> :sswitch_0
        0x55d57bae -> :sswitch_c
        0x6290d1de -> :sswitch_8
        0x6354c21d -> :sswitch_6
        0x6c8b8a90 -> :sswitch_b
        0x727c2694 -> :sswitch_2
        0x7a0afd18 -> :sswitch_9
    .end sparse-switch
.end method
