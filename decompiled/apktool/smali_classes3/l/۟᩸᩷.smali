.class public Ll/۟᩸᩷;
.super Landroid/app/Activity;
.source "67G1"


# instance fields
.field public doingOnConfigurationChanged:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0xc19b67b

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6dc1

    const v6, 0x4da25ec4    # 3.40514944E8f

    xor-int/2addr v5, v6

    const v6, -0x17f0ca86

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x48c9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_4

    goto/16 :goto_4

    .line 75
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v4, :cond_a

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_5

    .line 55
    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_c

    goto/16 :goto_2

    .line 133
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto/16 :goto_2

    .line 85
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    return-void

    .line 65
    :sswitch_5
    invoke-static {p1, v0}, Ll/᩹֡᩷;->֫(Landroid/content/res/Configuration;I)V

    goto :goto_1

    .line 62
    :sswitch_6
    sget v4, Ll/᩹֡᩷;->ᩴ֫:I

    .line 144
    sget-object v4, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v4, :cond_0

    const-string v4, "\u06eb\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6ef5

    const v6, -0x59f3798f

    xor-int/2addr v5, v6

    const v6, -0xf6750e8

    goto :goto_0

    .line 46
    :sswitch_7
    invoke-virtual {p0}, Ll/۟᩸᩷;->getUiConfigNightMode()I

    move-result v0

    invoke-virtual {p0}, Ll/۟᩸᩷;->shouldApplyUiConfigNightMode()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u05a1\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6519

    const v6, -0x550fd61b

    xor-int/2addr v5, v6

    const v6, 0x32bf2677

    goto :goto_0

    .line 48
    :sswitch_8
    invoke-super {p0, p1}, Landroid/app/Activity;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V

    return-void

    :sswitch_9
    if-eqz p1, :cond_0

    const-string v4, "\u06e7\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x79c9

    const v6, 0x745d3970

    xor-int/2addr v5, v6

    const v6, 0x2cffb068

    goto/16 :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u06e1\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3d3f

    const v6, -0x255c4647

    xor-int/2addr v5, v6

    const v6, -0x7a41c8ed

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06e2\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2251

    const v6, -0x5828f388

    xor-int/2addr v5, v6

    const v6, -0x77193d6c

    goto/16 :goto_0

    .line 142
    :sswitch_b
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_2

    :goto_2
    const-string v4, "\u06e8\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x736d

    const v6, -0x76b41be7

    xor-int/2addr v5, v6

    const v6, 0x217470b3

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u1a77\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3605

    const v6, 0x57338d4c

    xor-int/2addr v5, v6

    const v6, 0x355e7d26

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u0730\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5cdf

    const v6, -0x6c59022d

    xor-int/2addr v5, v6

    const v6, 0x73efc596

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a78\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3f57

    const v6, -0x7d01ead8

    xor-int/2addr v5, v6

    const v6, 0x1a6316e7    # 4.6961E-23f

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_3
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3b71

    const v6, 0x7e0fd422

    xor-int/2addr v5, v6

    const v6, 0x1a80a308

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073a\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7e1d

    const v6, -0x67aec30c

    xor-int/2addr v5, v6

    const v6, 0x351248e1

    goto/16 :goto_0

    .line 22
    :sswitch_e
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u06e0\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e97

    const v6, -0x5aab31c5

    xor-int/2addr v5, v6

    const v6, 0x3e2a49b1

    goto/16 :goto_0

    .line 126
    :sswitch_f
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u0730\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a65

    const v6, -0x3b28594f

    xor-int/2addr v5, v6

    const v6, -0x1f08aed

    goto/16 :goto_0

    .line 44
    :sswitch_10
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_9

    :goto_4
    const-string v4, "\u1a7a\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d27

    const v6, -0x4b918c7d

    xor-int/2addr v5, v6

    const v6, 0x7345e22

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a73\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3355

    const v6, 0x357e20c9

    xor-int/2addr v5, v6

    const v6, -0x53fc73cd

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_b

    :cond_a
    const-string v4, "\u1a7b\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x659b

    const v6, 0x3d3cfde6

    xor-int/2addr v5, v6

    const v6, -0x26f001c8

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x313f

    const v6, 0x7d1eb854

    xor-int/2addr v5, v6

    const v6, 0x1050f151

    goto/16 :goto_0

    .line 105
    :sswitch_12
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u0730\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6383

    const v6, 0x7bbc59df

    xor-int/2addr v5, v6

    const v6, 0x2fcb1f5f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61f1

    const v6, -0x5b7fc8d3

    xor-int/2addr v5, v6

    const v6, -0x260581e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6c609fae -> :sswitch_3
        -0x6717945f -> :sswitch_c
        -0x639bfa24 -> :sswitch_8
        -0x63247deb -> :sswitch_e
        -0x5e166d9e -> :sswitch_6
        -0x596a9eda -> :sswitch_11
        -0x5961e4d8 -> :sswitch_f
        -0x58ce1fa1 -> :sswitch_d
        -0x39ebd162 -> :sswitch_5
        -0x394d7736 -> :sswitch_12
        -0x36d720b9 -> :sswitch_3
        -0x1e2bc8f3 -> :sswitch_0
        -0x1b53b81a -> :sswitch_4
        -0x1afe4441 -> :sswitch_4
        -0x9ccbc21 -> :sswitch_5
        -0x94cf297 -> :sswitch_10
        -0x84e5bf9 -> :sswitch_1
        -0x7e41971 -> :sswitch_1
        -0x6da5e85 -> :sswitch_a
        -0x39c9c04 -> :sswitch_2
        -0x37cf46a -> :sswitch_c
        0x2420d7e -> :sswitch_7
        0x1097f44c -> :sswitch_d
        0x1c7819ed -> :sswitch_b
        0x1ef2a827 -> :sswitch_9
        0x1f2f0973 -> :sswitch_10
        0x2377b195 -> :sswitch_12
        0x2a4cf987 -> :sswitch_6
        0x3d73cfc0 -> :sswitch_2
        0x493b49ec -> :sswitch_b
        0x4aaa9e8d -> :sswitch_e
        0x4ae390f3 -> :sswitch_f
        0x593bf57f -> :sswitch_0
        0x59de1e8a -> :sswitch_9
        0x635dcd27 -> :sswitch_8
        0x654e83ca -> :sswitch_11
        0x7226510c -> :sswitch_a
        0x7f931455 -> :sswitch_7
    .end sparse-switch
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x187a22d4

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    const-string v4, "\u06d8\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x905

    const v6, -0x647db497

    xor-int/2addr v5, v6

    const v6, -0x6127dce9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7081

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 36
    invoke-virtual {p0}, Ll/۟᩸᩷;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p1, v0, v1}, Ll/ۧ᩹᩷;->֫(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void

    .line 31
    :sswitch_0
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_4

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_1

    .line 7
    :sswitch_2
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v4, :cond_6

    goto/16 :goto_2

    .line 13
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto/16 :goto_2

    .line 17
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    return-void

    .line 36
    :sswitch_5
    invoke-virtual {p0}, Ll/۟᩸᩷;->getUiConfigNightMode()I

    move-result v0

    .line 30
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u1a76\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1687

    const v6, 0x1b4b7948

    xor-int/2addr v5, v6

    const v6, 0x54a7ef

    goto :goto_0

    .line 20
    :sswitch_6
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6945

    const v6, 0x1c84ecbb

    xor-int/2addr v5, v6

    const v6, -0x7e482d9

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v4

    if-ltz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u073a\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x71b7

    const v6, 0x3fb02e4a

    xor-int/2addr v5, v6

    const v6, 0x638abd0

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u05a1\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x18fd

    const v6, 0x240b96f0

    xor-int/2addr v5, v6

    const v6, 0x10f9178a

    goto/16 :goto_0

    .line 31
    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    const-string v4, "\u1a73\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c9d

    const v6, -0x4dfc11cb

    xor-int/2addr v5, v6

    const v6, 0x14cca78c

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7e09

    const v6, -0x549cd5f3

    xor-int/2addr v5, v6

    const v6, 0x403403d8

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_7

    :cond_6
    :goto_1
    const-string v4, "\u1a75\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4d9

    const v6, -0x15868359

    xor-int/2addr v5, v6

    const v6, 0x57d42798

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a76\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x174d

    const v6, -0x30ea43c0

    xor-int/2addr v5, v6

    const v6, 0x3b141add

    goto/16 :goto_0

    .line 29
    :sswitch_b
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x22f7

    const v6, -0x741b26ff

    xor-int/2addr v5, v6

    const v6, -0x4d5b36e5

    goto/16 :goto_0

    .line 25
    :sswitch_c
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v4, "\u06dc\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x257d

    const v6, 0x5f22f76e

    xor-int/2addr v5, v6

    const v6, 0x2c804491

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a76\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6bcd

    const v6, -0x75253f0

    xor-int/2addr v5, v6

    const v6, 0x7f2b1d6a

    goto/16 :goto_0

    .line 28
    :sswitch_d
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u1a78\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x59e1

    const v6, 0x257ea386

    xor-int/2addr v5, v6

    const v6, 0x2896ae47

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0733\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x494f

    const v6, 0x40976ec5

    xor-int/2addr v5, v6

    const v6, -0x246a2ef1

    goto/16 :goto_0

    .line 14
    :sswitch_e
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u06e1\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2d61

    const v6, 0x49ba18b0    # 1524502.0f

    xor-int/2addr v5, v6

    const v6, 0x418fc0a5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x51af

    const v6, 0x22e224ce

    xor-int/2addr v5, v6

    const v6, 0x48d5b379

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ad3bd82 -> :sswitch_1
        -0x6870ce34 -> :sswitch_e
        -0x68246eac -> :sswitch_6
        -0x58b2bd40 -> :sswitch_7
        -0x550b012f -> :sswitch_9
        -0x4efbd3e0 -> :sswitch_c
        -0x479cd925 -> :sswitch_e
        -0x429cbfa8 -> :sswitch_4
        -0x408dd249 -> :sswitch_d
        -0x215f801d -> :sswitch_5
        -0x1ad9707e -> :sswitch_6
        -0x11340640 -> :sswitch_b
        -0x2d10997 -> :sswitch_c
        0x9491d8e -> :sswitch_3
        0x14a2ba61 -> :sswitch_2
        0x1ce1bece -> :sswitch_b
        0x1f471f0f -> :sswitch_8
        0x1fdefc7e -> :sswitch_5
        0x37a95ce7 -> :sswitch_8
        0x3bf5be37 -> :sswitch_0
        0x3d155ef5 -> :sswitch_3
        0x3d5841cd -> :sswitch_9
        0x405b8bad -> :sswitch_4
        0x406b6a6e -> :sswitch_2
        0x51c99a93 -> :sswitch_a
        0x53e58820 -> :sswitch_a
        0x65c795ab -> :sswitch_0
        0x6b4fd61d -> :sswitch_1
        0x7ae50e98 -> :sswitch_7
        0x7f043eeb -> :sswitch_d
    .end sparse-switch
.end method

.method public getUiConfigNightMode()I
    .locals 1

    const/16 v0, -0x64

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2450dfd1

    sget v3, Ll/۠;->ܺܺܶ:I

    sget v4, Ll/֡۬;->۠֡᩶:I

    const-string v5, "\u1a79\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x362f

    const v7, -0x62cf8946

    xor-int/2addr v6, v7

    const v7, 0x117cdd3f

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x55e1

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_7

    goto/16 :goto_2

    .line 60
    :sswitch_0
    sget-boolean v5, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v5, :cond_5

    goto/16 :goto_1

    .line 83
    :sswitch_1
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-gez v5, :cond_b

    goto/16 :goto_2

    .line 16
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto/16 :goto_2

    .line 99
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    .line 74
    :sswitch_4
    iput-boolean v0, p0, Ll/۟᩸᩷;->doingOnConfigurationChanged:Z

    return-void

    :sswitch_5
    iput-boolean v0, p0, Ll/۟᩸᩷;->doingOnConfigurationChanged:Z

    .line 75
    throw v1

    .line 109
    :sswitch_6
    :try_start_0
    invoke-static {}, Ll/᩹֡᩷;->֫()V

    .line 71
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 72
    invoke-virtual {p0}, Ll/۟᩸᩷;->getUiConfigNightMode()I

    move-result v5

    invoke-virtual {p0}, Ll/۟᩸᩷;->shouldApplyUiConfigNightMode()Z

    move-result v6

    invoke-static {p0, v5, v6}, Ll/ۧ᩹᩷;->ۧ(Landroid/app/Activity;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u1a77\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x471b

    const v7, -0x253b600

    xor-int/2addr v6, v7

    const v7, 0x33624f0e

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v5, "\u06e0\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x34ad

    const v7, -0x75a6e07a

    xor-int/2addr v6, v7

    const v7, -0x54209d55

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_8
    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Ll/۟᩸᩷;->doingOnConfigurationChanged:Z

    const/4 v0, 0x0

    const-string v5, "\u06ec\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x18b5

    const v7, 0x38ea94b4

    xor-int/2addr v6, v7

    const v7, -0x79830518

    goto/16 :goto_0

    .line 65
    :sswitch_9
    iget-boolean v5, p0, Ll/۟᩸᩷;->doingOnConfigurationChanged:Z

    if-eqz v5, :cond_0

    const-string v5, "\u06d9\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x27f

    const v7, 0x419748fe

    xor-int/2addr v6, v7

    const v7, -0x3ae933e2

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u06ec\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4ca7

    const v7, 0x6ac7ce4a

    xor-int/2addr v6, v7

    const v7, 0x6f856453

    goto/16 :goto_0

    .line 18
    :sswitch_a
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u05a1\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x51a7

    const v7, -0x4f3e8ab0

    xor-int/2addr v6, v7

    const v7, 0x60f1e896

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v5, "\u05a8\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x42f

    const v7, -0x648f5cc7

    xor-int/2addr v6, v7

    const v7, -0x567d02a6

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06e1\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1bb7

    const v7, 0x79d734e9

    xor-int/2addr v6, v7

    const v7, -0x659dd32a

    goto/16 :goto_0

    .line 83
    :sswitch_d
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u1a79\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x44dd

    const v7, -0x246468a4

    xor-int/2addr v6, v7

    const v7, 0x1b6ceaf6

    goto/16 :goto_0

    .line 101
    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v5

    if-gtz v5, :cond_6

    :cond_5
    const-string v5, "\u06d9\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1aed

    const v7, 0x68414082

    xor-int/2addr v6, v7

    const v7, -0x49234959

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a7a\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xaf5

    const v7, 0x43abcc6

    xor-int/2addr v6, v7

    const v7, -0x4d70979c

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_8

    :cond_7
    :goto_1
    const-string v5, "\u05ab\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xbe9

    const v7, 0x3e73f3bb

    xor-int/2addr v6, v7

    const v7, 0x61f0df8a

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e2\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5f0d

    const v7, 0x41fe9f6d

    xor-int/2addr v6, v7

    const v7, 0x7b825a2f

    goto/16 :goto_0

    .line 38
    :sswitch_10
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u05a8\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4337

    const v7, 0xc2c53c5

    xor-int/2addr v6, v7

    const v7, 0x4c55228f    # 5.587206E7f

    goto/16 :goto_0

    .line 50
    :sswitch_11
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_a

    :goto_2
    const-string v5, "\u1a74\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5d81

    const v7, -0x6eb3541b

    xor-int/2addr v6, v7

    const v7, -0x17b1102e

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1795

    const v7, 0x79a40958

    xor-int/2addr v6, v7

    const v7, 0x670443c8

    goto/16 :goto_0

    .line 22
    :sswitch_12
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u1a7b\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3f2d

    const v7, -0x43dbd391

    xor-int/2addr v6, v7

    const v7, 0xbd2e1cf

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e0\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7edb

    const v7, 0x78f5a668

    xor-int/2addr v6, v7

    const v7, 0x3b90d17c

    goto/16 :goto_0

    .line 91
    :sswitch_13
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v5

    if-ltz v5, :cond_d

    :goto_4
    const-string v5, "\u06d8\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2951

    const v7, -0x2c010806

    xor-int/2addr v6, v7

    const v7, 0x4e7b6587

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e1\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5195

    const v7, 0x7131c10d

    xor-int/2addr v6, v7

    const v7, 0x744e2368

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d767fa0 -> :sswitch_b
        -0x7d6e3b6c -> :sswitch_4
        -0x77c59363 -> :sswitch_a
        -0x759f3798 -> :sswitch_11
        -0x722cb3dc -> :sswitch_a
        -0x6a89964f -> :sswitch_9
        -0x6597df7f -> :sswitch_2
        -0x5b9fb938 -> :sswitch_8
        -0x4ccb0258 -> :sswitch_5
        -0x472ef39f -> :sswitch_c
        -0x358dbcaa -> :sswitch_e
        -0x35825433 -> :sswitch_4
        -0x2fb438a9 -> :sswitch_6
        -0x2efe1adc -> :sswitch_9
        -0x296e8229 -> :sswitch_d
        -0x134f872d -> :sswitch_f
        -0xf591d54 -> :sswitch_3
        -0x49ca64 -> :sswitch_10
        0x72ca8fd -> :sswitch_1
        0x91c633e -> :sswitch_12
        0x994a5b6 -> :sswitch_13
        0x1343d222 -> :sswitch_5
        0x1447e7fe -> :sswitch_8
        0x28cf6022 -> :sswitch_13
        0x2dd6f409 -> :sswitch_11
        0x2e1aa09f -> :sswitch_7
        0x31a491bd -> :sswitch_10
        0x377afc23 -> :sswitch_e
        0x378ce390 -> :sswitch_6
        0x3abd4340 -> :sswitch_1
        0x3d9b92ce -> :sswitch_b
        0x4b2aeb25 -> :sswitch_f
        0x4f270104 -> :sswitch_c
        0x5690fd8a -> :sswitch_0
        0x57d3d0f0 -> :sswitch_3
        0x66f7541a -> :sswitch_0
        0x68ba7fee -> :sswitch_2
        0x6ca5bc42 -> :sswitch_12
        0x74a28f38 -> :sswitch_d
        0x74e6e7e2 -> :sswitch_7
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x66fb966d

    sget v2, Ll/֨۬;->۫ۙ᩺:I

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    const-string v4, "\u1a7b\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6a85

    const v6, -0x63508581

    xor-int/2addr v5, v6

    const v6, 0x4e87d520    # 1.13944576E9f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x1a2d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 56
    invoke-virtual {p0}, Ll/۟᩸᩷;->getUiConfigNightMode()I

    move-result v0

    .line 54
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-gez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u0736\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2945

    const v6, 0x312a37eb

    xor-int/2addr v5, v6

    const v6, 0x7748fa9

    goto :goto_0

    .line 19
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v4, Ll/۟;->ۗۤۛ:I

    if-nez v4, :cond_a

    goto/16 :goto_1

    .line 5
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_1

    .line 48
    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    .line 56
    :sswitch_5
    invoke-virtual {p0}, Ll/۟᩸᩷;->shouldApplyUiConfigNightMode()Z

    move-result v1

    invoke-static {p0, v0, v1}, Ll/ۧ᩹᩷;->ܽ(Landroid/app/Activity;IZ)V

    .line 57
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    return-void

    :cond_1
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2751

    const v6, 0x21dfaa9c

    xor-int/2addr v5, v6

    const v6, -0x5ed445d1

    goto :goto_0

    .line 19
    :sswitch_6
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u073d\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c83

    const v6, 0x3745e8c5

    xor-int/2addr v5, v6

    const v6, -0x14cde598

    goto/16 :goto_0

    .line 44
    :sswitch_7
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_4

    :cond_3
    const-string v4, "\u06dc\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3393

    const v6, 0x1ab42e40

    xor-int/2addr v5, v6

    const v6, 0x147a4b22

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e2\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x354b

    const v6, 0x73994e36

    xor-int/2addr v5, v6

    const v6, -0x3b3a197d

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_5

    :goto_1
    const-string v4, "\u05ab\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x104f

    const v6, -0x59e5d0a

    xor-int/2addr v5, v6

    const v6, -0x40730c1b

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e7\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x520f

    const v6, 0x31c2c48a

    xor-int/2addr v5, v6

    const v6, 0x4fe88f9d

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06db\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5453

    const v6, 0x49b8a85e    # 1512715.8f

    xor-int/2addr v5, v6

    const v6, 0x20156174

    goto/16 :goto_0

    .line 51
    :sswitch_a
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e7\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x67cd

    const v6, 0x54b2cbb3

    xor-int/2addr v5, v6

    const v6, 0x6e91fb83

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u073a\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6cc1

    const v6, -0x27de1d8d

    xor-int/2addr v5, v6

    const v6, -0x1c19a43c

    goto/16 :goto_0

    .line 27
    :sswitch_c
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u06e2\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1213

    const v6, 0x16b99c3c

    xor-int/2addr v5, v6

    const v6, -0x2369aea2

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u073a\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x45f7

    const v6, 0x55dddd1d

    xor-int/2addr v5, v6

    const v6, 0x70bbd92a

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06da\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b69

    const v6, 0x3ea71685

    xor-int/2addr v5, v6

    const v6, 0x6eb8d186

    goto/16 :goto_0

    .line 55
    :sswitch_e
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_c

    :goto_3
    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x466f

    const v6, 0x4dacbac7    # 3.62240224E8f

    xor-int/2addr v5, v6

    const v6, 0x175471da

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a1\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7fb3

    const v6, 0xfce6a0

    xor-int/2addr v5, v6

    const v6, 0x3a4176ae

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x726b40bb -> :sswitch_0
        -0x69a7e626 -> :sswitch_3
        -0x6216acd4 -> :sswitch_6
        -0x5be56dbd -> :sswitch_5
        -0x5b6ef9f2 -> :sswitch_1
        -0x573c8368 -> :sswitch_e
        -0x4a9306b5 -> :sswitch_7
        -0x46639618 -> :sswitch_4
        -0x3696be5e -> :sswitch_d
        -0x2bed46b2 -> :sswitch_b
        -0x2913fefd -> :sswitch_7
        -0x235d1a28 -> :sswitch_d
        -0x1c0dd382 -> :sswitch_c
        -0x175048e2 -> :sswitch_9
        -0xe487473 -> :sswitch_0
        -0xe0a8ef3 -> :sswitch_4
        0x5059b0f -> :sswitch_a
        0xff07264 -> :sswitch_2
        0x1113e293 -> :sswitch_6
        0x25166347 -> :sswitch_2
        0x39e96106 -> :sswitch_8
        0x3c9b812d -> :sswitch_b
        0x3d568bcf -> :sswitch_3
        0x47c8784b -> :sswitch_5
        0x5209bb5a -> :sswitch_1
        0x5916343f -> :sswitch_a
        0x601d09c3 -> :sswitch_8
        0x663c3892 -> :sswitch_c
        0x7318bff8 -> :sswitch_e
        0x7c9f0542 -> :sswitch_9
    .end sparse-switch
.end method

.method public shouldApplyUiConfigNightMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
