.class public final Ll/۬ۖۡ;
.super Ljava/util/ArrayList;
.source "S3XU"


# instance fields
.field public final ᩸:Ll/ۢ᩵ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x48b240f1

    sget v2, Ll/᩺;->ۙۛܶ:I

    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    .line 1137
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "\u06db\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4f01

    const v6, 0x6aa9e2db

    xor-int/2addr v5, v6

    const v6, -0x66f84de0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7125

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 373
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_9

    goto/16 :goto_3

    :sswitch_0
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-lez v4, :cond_a

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-lez v4, :cond_3

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_1

    goto/16 :goto_5

    .line 49
    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 1138
    :sswitch_5
    iput-object v0, p0, Ll/۬ۖۡ;->᩸:Ll/ۢ᩵ᩴ;

    return-void

    .line 866
    :sswitch_6
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4f51

    const v6, -0x3a08695d

    xor-int/2addr v5, v6

    const v6, -0x3cfc108a

    goto :goto_0

    .line 800
    :sswitch_7
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u1a73\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7bbf

    const v6, 0x59021da7

    xor-int/2addr v5, v6

    const v6, -0x55abd4b0

    goto :goto_0

    :cond_2
    const-string v4, "\u06d9\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b61

    const v6, 0x50eb17c0

    xor-int/2addr v5, v6

    const v6, -0x2467badf

    goto/16 :goto_0

    .line 933
    :sswitch_8
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    :goto_2
    const-string v4, "\u06e1\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x17af

    const v6, 0x6b601c57

    xor-int/2addr v5, v6

    const v6, -0x11490aa5

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0733\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c0f

    const v6, -0x854e911

    xor-int/2addr v5, v6

    const v6, -0x2e58ae56

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0730\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x16c3

    const v6, -0x6294cddd

    xor-int/2addr v5, v6

    const v6, -0x7f0313d7

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06e0\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36e5

    const v6, 0x2d696ad8

    xor-int/2addr v5, v6

    const v6, -0x5a5a00e6

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u0736\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x35f3

    const v6, 0x2c103601

    xor-int/2addr v5, v6

    const v6, -0x59a0d940

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v4, "\u06e1\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b5b

    const v6, -0x179806f9

    xor-int/2addr v5, v6

    const v6, -0x51feea12

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06eb\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6415

    const v6, 0x1ca32244

    xor-int/2addr v5, v6

    const v6, 0x6a7a7988

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06ec\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f0f

    const v6, -0x36475fe8    # -1512451.0f

    xor-int/2addr v5, v6

    const v6, -0x6726b1d1

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06e7\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x9a7

    const v6, 0x6def2301

    xor-int/2addr v5, v6

    const v6, 0x57765970

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7e3

    const v6, 0x55d97f1c

    xor-int/2addr v5, v6

    const v6, 0x4bb0344b    # 2.3095446E7f

    goto/16 :goto_0

    .line 1138
    :sswitch_e
    new-instance v0, Ll/ۢ᩵ᩴ;

    invoke-direct {v0}, Ll/ۢ᩵ᩴ;-><init>()V

    .line 452
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_c

    :goto_5
    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5137

    const v6, -0x600b283e

    xor-int/2addr v5, v6

    const v6, -0x75d93409

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a75\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x785b

    const v6, 0x4d1be6d9    # 1.63474832E8f

    xor-int/2addr v5, v6

    const v6, 0x2292b4f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7598bbef -> :sswitch_0
        -0x7044c71c -> :sswitch_6
        -0x60c27b1a -> :sswitch_e
        -0x5e102ccf -> :sswitch_d
        -0x40397c4c -> :sswitch_4
        -0x34bff57c -> :sswitch_d
        -0x32db328a -> :sswitch_e
        -0x24aad05a -> :sswitch_2
        -0x1bbb4ed6 -> :sswitch_7
        -0x1a0ab6e2 -> :sswitch_a
        -0x18574276 -> :sswitch_1
        -0x18b4a5c -> :sswitch_3
        0x355207f -> :sswitch_1
        0x55f78d0 -> :sswitch_c
        0x21252b62 -> :sswitch_4
        0x23d39294 -> :sswitch_c
        0x28985521 -> :sswitch_b
        0x2a032282 -> :sswitch_7
        0x32246623 -> :sswitch_a
        0x4479fd88 -> :sswitch_9
        0x48085203 -> :sswitch_8
        0x4c772e2a -> :sswitch_3
        0x4e5e5845 -> :sswitch_9
        0x52301e1b -> :sswitch_2
        0x5e6a200e -> :sswitch_b
        0x5f99a226 -> :sswitch_0
        0x6a344587 -> :sswitch_8
        0x72ddaaa2 -> :sswitch_5
        0x7e31dbbe -> :sswitch_6
        0x7fbf153d -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 6

    const v0, -0x7df5b4fb

    sget v1, Ll/֨᩺;->ۨ֨۬:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x709b

    const v5, -0x5788b721

    xor-int/2addr v4, v5

    const v5, -0x430b4831

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x175b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_6

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x562b

    const v5, 0x75f27ea6

    xor-int/2addr v4, v5

    const v5, 0x3b3c1256

    goto :goto_0

    .line 1003
    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    .line 902
    :sswitch_2
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_a

    goto/16 :goto_4

    .line 940
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_4

    .line 926
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x0

    return p1

    .line 1137
    :sswitch_6
    check-cast p1, Ll/ۗۖۡ;

    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :sswitch_7
    instance-of v3, p1, Ll/ۗۖۡ;

    if-nez v3, :cond_1

    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x678f

    const v5, 0x6289fc7

    xor-int/2addr v4, v5

    const v5, 0x4bf509c4    # 3.211764E7f

    goto :goto_0

    :cond_1
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2c69

    const v5, -0x2841c5b

    xor-int/2addr v4, v5

    const v5, 0x20dd0e57

    goto :goto_0

    :sswitch_8
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x52d1

    const v5, 0x4e91dc4

    xor-int/2addr v4, v5

    const v5, -0x36139745

    goto/16 :goto_0

    .line 664
    :sswitch_9
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c03

    const v5, -0x3bd58950

    xor-int/2addr v4, v5

    const v5, 0x4d235a70    # 1.7128832E8f

    goto/16 :goto_0

    .line 45
    :sswitch_a
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u073a\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b99

    const v5, 0x7efa9665

    xor-int/2addr v4, v5

    const v5, 0x5662ce6f

    goto/16 :goto_0

    .line 181
    :sswitch_b
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x48ef

    const v5, 0x189c8051

    xor-int/2addr v4, v5

    const v5, -0x1e4b8e6f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e8\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f23

    const v5, 0x47e4fa7b

    xor-int/2addr v4, v5

    const v5, 0x731158db    # 1.1515583E31f

    goto/16 :goto_0

    .line 965
    :sswitch_c
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u06d8\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4db5

    const v5, -0x5339b86e

    xor-int/2addr v4, v5

    const v5, -0x28a88e78

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7a\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77c1

    const v5, 0x57bf1197

    xor-int/2addr v4, v5

    const v5, 0x7663947b

    goto/16 :goto_0

    .line 739
    :sswitch_d
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4495

    const v5, 0x58aa5da5

    xor-int/2addr v4, v5

    const v5, -0xf926581

    goto/16 :goto_0

    .line 267
    :sswitch_e
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c1

    const v5, -0x2e05e8f2

    xor-int/2addr v4, v5

    const v5, 0x424e1d3c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c1f

    const v5, 0x2667da22

    xor-int/2addr v4, v5

    const v5, 0x6ae67baa

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u06e2\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c9b

    const v5, -0x169e150f

    xor-int/2addr v4, v5

    const v5, -0x726ba069

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a41

    const v5, 0x26122465

    xor-int/2addr v4, v5

    const v5, 0x72085c75

    goto/16 :goto_0

    .line 434
    :sswitch_10
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_d

    :goto_4
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x264d

    const v5, -0x19f59e74

    xor-int/2addr v4, v5

    const v5, 0x6623f185

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1607

    const v5, 0x636fd58e

    xor-int/2addr v4, v5

    const v5, -0x2e6b1592

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7edeed08 -> :sswitch_9
        -0x6db6f32d -> :sswitch_10
        -0x6b62bb43 -> :sswitch_2
        -0x5d81af21 -> :sswitch_a
        -0x5cd61a98 -> :sswitch_0
        -0x597d96bc -> :sswitch_3
        -0x4fecc050 -> :sswitch_8
        -0x4c5b8519 -> :sswitch_c
        -0x444349ac -> :sswitch_10
        -0x3f2f2bc4 -> :sswitch_7
        -0x2580dbfa -> :sswitch_b
        -0x1adef924 -> :sswitch_6
        -0x66bfb4a -> :sswitch_a
        -0xd68dc4 -> :sswitch_f
        0xbdb1381 -> :sswitch_4
        0x15823d1d -> :sswitch_1
        0x1be80a85 -> :sswitch_7
        0x1cb06eac -> :sswitch_3
        0x1fa7a050 -> :sswitch_0
        0x30db73c1 -> :sswitch_b
        0x31c25bf8 -> :sswitch_e
        0x331fc258 -> :sswitch_6
        0x3367b730 -> :sswitch_1
        0x39067c64 -> :sswitch_d
        0x44585482 -> :sswitch_d
        0x489e4b16 -> :sswitch_4
        0x48bc6a19 -> :sswitch_5
        0x4c3eaa44 -> :sswitch_c
        0x5c133da2 -> :sswitch_8
        0x5dac8624 -> :sswitch_f
        0x65488e3d -> :sswitch_5
        0x718697f0 -> :sswitch_2
        0x75f14ca6 -> :sswitch_e
        0x78df48da -> :sswitch_9
    .end sparse-switch
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 6

    const v0, 0x4285e81e

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v3, "\u0730\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55a7

    const v5, -0xc6715e2

    xor-int/2addr v4, v5

    const v5, 0x2a33b882

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x20a1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 960
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_c

    goto/16 :goto_3

    .line 1101
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_7

    goto/16 :goto_2

    :sswitch_1
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v3, :cond_9

    goto/16 :goto_4

    :sswitch_2
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_b

    goto/16 :goto_4

    .line 768
    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto/16 :goto_4

    .line 118
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, -0x1

    return p1

    .line 1137
    :sswitch_6
    check-cast p1, Ll/ۗۖۡ;

    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :sswitch_7
    instance-of v3, p1, Ll/ۗۖۡ;

    if-nez v3, :cond_0

    const-string v3, "\u1a74\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b39

    const v5, 0x71e6c534

    xor-int/2addr v4, v5

    const v5, 0x742e040f

    goto :goto_0

    :cond_0
    const-string v3, "\u1a7b\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x72f3

    const v5, -0x46c9f0c5

    xor-int/2addr v4, v5

    const v5, -0xecb7cef

    goto :goto_0

    .line 1070
    :sswitch_8
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x31ef

    const v5, 0x187f3734

    xor-int/2addr v4, v5

    const v5, 0x6395bbb3

    goto/16 :goto_0

    .line 38
    :sswitch_9
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e0\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7a6d

    const v5, -0x7878baf6

    xor-int/2addr v4, v5

    const v5, 0x26f6d4b1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59fd

    const v5, 0xf207f27

    xor-int/2addr v4, v5

    const v5, -0x28f5c875

    goto/16 :goto_0

    .line 1084
    :sswitch_b
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x220d

    const v5, 0x8f59a0e

    xor-int/2addr v4, v5

    const v5, 0x1586016e

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a78\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x14eb

    const v5, 0x346a50ee

    xor-int/2addr v4, v5

    const v5, 0x78a1856

    goto/16 :goto_0

    .line 1129
    :sswitch_c
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31d3

    const v5, -0x435230d9

    xor-int/2addr v4, v5

    const v5, 0xf80e50d    # 1.2710002E-29f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6737

    const v5, 0x27dbe397

    xor-int/2addr v4, v5

    const v5, -0x66f65b00

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u1a75\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c1d

    const v5, -0x3355ab89    # -8.9301944E7f

    xor-int/2addr v4, v5

    const v5, 0x2ce8547d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a75\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e23

    const v5, -0x27a9d967

    xor-int/2addr v4, v5

    const v5, 0x36f99cc1

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u06ec\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x42f1

    const v5, -0x50650486

    xor-int/2addr v4, v5

    const v5, 0x780b7f1

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a77\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4305

    const v5, 0x7815b480

    xor-int/2addr v4, v5

    const v5, 0x5f59117a

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v3, "\u06dc\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7403

    const v5, -0x1361db55

    xor-int/2addr v4, v5

    const v5, -0x6c7c79fc

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x70f

    const v5, 0x4ffd5866

    xor-int/2addr v4, v5

    const v5, 0x5c745b25

    goto/16 :goto_0

    .line 496
    :sswitch_10
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_d

    :goto_4
    const-string v3, "\u073a\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4dad

    const v5, 0x65385951

    xor-int/2addr v4, v5

    const v5, -0x4f5b5af9

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u05ab\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2f73

    const v5, -0x41317312

    xor-int/2addr v4, v5

    const v5, 0x373ca6b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7df20083 -> :sswitch_a
        -0x72e73b8a -> :sswitch_7
        -0x7078ca18 -> :sswitch_e
        -0x684a21d0 -> :sswitch_f
        -0x61e6ddf0 -> :sswitch_4
        -0x5d1bc942 -> :sswitch_1
        -0x541cb404 -> :sswitch_8
        -0x4aef6f3c -> :sswitch_1
        -0x415697a8 -> :sswitch_10
        -0x395e2a8a -> :sswitch_e
        -0x37d407df -> :sswitch_7
        -0x339e660a -> :sswitch_9
        -0x11c5bd92 -> :sswitch_c
        -0x83068e7 -> :sswitch_4
        -0x69b8016 -> :sswitch_9
        -0x5d15bd2 -> :sswitch_0
        -0x4d4c52e -> :sswitch_8
        0x713598e -> :sswitch_c
        0x80bf457 -> :sswitch_d
        0xd96cc4c -> :sswitch_5
        0x115970f1 -> :sswitch_3
        0x1847c636 -> :sswitch_d
        0x2967dde8 -> :sswitch_3
        0x2a73ce1e -> :sswitch_2
        0x2b265646 -> :sswitch_6
        0x2b4bd724 -> :sswitch_2
        0x477da4aa -> :sswitch_0
        0x4a9b5ece -> :sswitch_b
        0x4de9b3eb -> :sswitch_10
        0x5a905f11 -> :sswitch_5
        0x5c7f6f46 -> :sswitch_b
        0x68cc477a -> :sswitch_6
        0x7045703e -> :sswitch_a
        0x72c9dff8 -> :sswitch_f
    .end sparse-switch
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 6

    const v0, -0x18fe3f22

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v3, "\u06d9\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x595d

    const v5, -0x31d1b8f3

    xor-int/2addr v4, v5

    const v5, 0x239fbe9f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x296d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_c

    goto/16 :goto_3

    .line 332
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_4

    .line 897
    :sswitch_1
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v3, :cond_7

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_4

    .line 540
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, -0x1

    return p1

    .line 1137
    :sswitch_6
    check-cast p1, Ll/ۗۖۡ;

    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :sswitch_7
    instance-of v3, p1, Ll/ۗۖۡ;

    if-nez v3, :cond_0

    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b1f

    const v5, 0x756ffd07

    xor-int/2addr v4, v5

    const v5, -0x27ddfa6a

    goto :goto_0

    :cond_0
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x160d

    const v5, 0x3e889add

    xor-int/2addr v4, v5

    const v5, 0x6ccaf23c

    goto :goto_0

    :sswitch_8
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0730\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xee1

    const v5, 0x4dd0a915    # 4.37592736E8f

    xor-int/2addr v4, v5

    const v5, -0x51174e5a

    goto :goto_0

    :sswitch_9
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05a1\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3cf1

    const v5, 0x401d03bb

    xor-int/2addr v4, v5

    const v5, 0x17e7340d

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4377

    const v5, -0x9c218

    xor-int/2addr v4, v5

    const v5, 0x3cdd675b

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x62df

    const v5, -0x78857ba8

    xor-int/2addr v4, v5

    const v5, 0x2b2263e8

    goto/16 :goto_0

    .line 1090
    :sswitch_b
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d7

    const v5, -0x1f8f2d8b

    xor-int/2addr v4, v5

    const v5, 0x2f31175d

    goto/16 :goto_0

    .line 297
    :sswitch_c
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06e0\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1d35

    const v5, -0x1f84e11

    xor-int/2addr v4, v5

    const v5, -0x1411dd92

    goto/16 :goto_0

    .line 207
    :sswitch_d
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u06e4\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1ebf

    const v5, -0x4211777c

    xor-int/2addr v4, v5

    const v5, 0x66b70543

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x2b

    const v5, -0x6aff76f6

    xor-int/2addr v4, v5

    const v5, -0x801ee4b

    goto/16 :goto_0

    .line 977
    :sswitch_e
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u06e0\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7367

    const v5, -0x152ee606

    xor-int/2addr v4, v5

    const v5, -0x1210ff8f

    goto/16 :goto_0

    .line 478
    :sswitch_f
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-nez v3, :cond_a

    :goto_2
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7eb

    const v5, -0x3ad127c2

    xor-int/2addr v4, v5

    const v5, 0x6b9face9

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b17

    const v5, -0x7b3e985c

    xor-int/2addr v4, v5

    const v5, 0x3b6504ad

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd1

    const v5, -0x4cd627cd

    xor-int/2addr v4, v5

    const v5, 0x8619355

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1127

    const v5, 0x51f709e4

    xor-int/2addr v4, v5

    const v5, 0x69b12765

    goto/16 :goto_0

    .line 590
    :sswitch_10
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_d

    :goto_4
    const-string v3, "\u073a\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x407f

    const v5, 0x45d8e788

    xor-int/2addr v4, v5

    const v5, 0x1e3b7f72

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e0\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c73

    const v5, 0x289ab1c9

    xor-int/2addr v4, v5

    const v5, 0x20adf3ff

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x732df151 -> :sswitch_10
        -0x7153a1a8 -> :sswitch_6
        -0x6cbc6307 -> :sswitch_4
        -0x6af1ee19 -> :sswitch_9
        -0x6a6dd06b -> :sswitch_4
        -0x6614ecf3 -> :sswitch_6
        -0x636cd953 -> :sswitch_f
        -0x629eb532 -> :sswitch_f
        -0x59a5452f -> :sswitch_9
        -0x5118aab3 -> :sswitch_10
        -0x49e20e30 -> :sswitch_e
        -0x360379b2 -> :sswitch_3
        -0x2d91bbdf -> :sswitch_1
        -0x25ece8de -> :sswitch_a
        -0x1ac7eefd -> :sswitch_8
        -0x14302353 -> :sswitch_2
        -0x1232916a -> :sswitch_0
        -0xd3749b1 -> :sswitch_8
        -0x561f4da -> :sswitch_5
        -0x2215200 -> :sswitch_b
        0x1b1916e -> :sswitch_2
        0x53839ab -> :sswitch_1
        0x15db0c2d -> :sswitch_a
        0x18cd011f -> :sswitch_d
        0x1ecc24f5 -> :sswitch_b
        0x23905173 -> :sswitch_7
        0x2767ccdc -> :sswitch_c
        0x27c3d798 -> :sswitch_7
        0x2e1adb34 -> :sswitch_d
        0x4e9f1202 -> :sswitch_3
        0x4f02758e -> :sswitch_e
        0x55593b60 -> :sswitch_5
        0x5698d6c2 -> :sswitch_0
        0x7a86c993 -> :sswitch_c
    .end sparse-switch
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 6

    const v0, 0x6e9a8d24

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3943

    const v5, 0x71edb198

    xor-int/2addr v4, v5

    const v5, -0x6bda01c2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1a1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 604
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    const/4 p1, 0x0

    return p1

    :sswitch_0
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v3, :cond_3

    goto/16 :goto_2

    .line 473
    :sswitch_1
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a63

    const v5, 0x65087aa3

    xor-int/2addr v4, v5

    const v5, 0x5855e6e1

    goto :goto_0

    .line 111
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_1

    :sswitch_4
    const/4 p1, 0x0

    return p1

    .line 1137
    :sswitch_5
    check-cast p1, Ll/ۗۖۡ;

    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :sswitch_6
    instance-of v3, p1, Ll/ۗۖۡ;

    if-nez v3, :cond_1

    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3c99

    const v5, -0x53851be6

    xor-int/2addr v4, v5

    const v5, -0x66450e15

    goto :goto_0

    :cond_1
    const-string v3, "\u05a8\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1db7

    const v5, 0x78928d6a

    xor-int/2addr v4, v5

    const v5, -0x6db50992

    goto :goto_0

    .line 636
    :sswitch_7
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a7f

    const v5, -0x34335c18    # -2.6822608E7f

    xor-int/2addr v4, v5

    const v5, 0x2b437989

    goto/16 :goto_0

    .line 519
    :sswitch_8
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06dc\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1389

    const v5, 0x4655b4ad

    xor-int/2addr v4, v5

    const v5, -0x2b1b4449

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d9\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7439

    const v5, 0x32d262f6

    xor-int/2addr v4, v5

    const v5, 0x6c15a9f1

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v3, "\u06ec\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x588d

    const v5, -0x1bd4e163

    xor-int/2addr v4, v5

    const v5, -0x72e7b5f9

    goto/16 :goto_0

    .line 584
    :sswitch_a
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f1d

    const v5, -0x350fd851    # -7869399.5f

    xor-int/2addr v4, v5

    const v5, -0x76cb1ccb

    goto/16 :goto_0

    .line 901
    :sswitch_b
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v3, "\u0730\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2481

    const v5, -0x42cef1a0

    xor-int/2addr v4, v5

    const v5, -0x73d418f8

    goto/16 :goto_0

    .line 429
    :sswitch_c
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_8

    goto :goto_1

    :cond_8
    const-string v3, "\u06e0\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f15

    const v5, -0x78b6f898

    xor-int/2addr v4, v5

    const v5, -0x12b77e07

    goto/16 :goto_0

    .line 334
    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u06d6\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7981

    const v5, -0x6f695636

    xor-int/2addr v4, v5

    const v5, 0x6d585a40

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_1
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x276d

    const v5, -0x190650cd

    xor-int/2addr v4, v5

    const v5, 0x5455f50a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d6\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f13

    const v5, -0x79e74306

    xor-int/2addr v4, v5

    const v5, -0x188569ab

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_c

    :cond_b
    :goto_2
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a9f

    const v5, 0x55d7e702

    xor-int/2addr v4, v5

    const v5, -0x5b58ce3d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x708f

    const v5, -0x65bcf643

    xor-int/2addr v4, v5

    const v5, 0x627cdeef

    goto/16 :goto_0

    .line 881
    :sswitch_10
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_d

    :goto_3
    const-string v3, "\u06eb\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x47ab

    const v5, -0x7ad94f5c

    xor-int/2addr v4, v5

    const v5, 0x4cdf0e9a    # 1.16946128E8f

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u073a\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51c3

    const v5, -0x6ec0113

    xor-int/2addr v4, v5

    const v5, -0x7e2f6da9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e22f27c -> :sswitch_9
        -0x74f10b1a -> :sswitch_f
        -0x6e239d19 -> :sswitch_f
        -0x6ca5f075 -> :sswitch_10
        -0x69040779 -> :sswitch_e
        -0x5a87ac19 -> :sswitch_8
        -0x5762923b -> :sswitch_3
        -0x47fcb4dd -> :sswitch_10
        -0x2ba2e619 -> :sswitch_c
        -0x27ad7ce2 -> :sswitch_8
        -0x2333151c -> :sswitch_e
        -0x203b9ba4 -> :sswitch_6
        -0x1cbbef96 -> :sswitch_7
        -0x1c90b985 -> :sswitch_0
        -0x19d3d298 -> :sswitch_b
        -0x9d37434 -> :sswitch_7
        -0x344a060 -> :sswitch_c
        0x23af0 -> :sswitch_4
        0x13fdb9dc -> :sswitch_d
        0x1da8b8be -> :sswitch_5
        0x286765f0 -> :sswitch_3
        0x2a449c3f -> :sswitch_d
        0x330f9f46 -> :sswitch_5
        0x360f68cb -> :sswitch_2
        0x4137312f -> :sswitch_1
        0x42b81410 -> :sswitch_4
        0x4507bfe6 -> :sswitch_1
        0x45e28535 -> :sswitch_6
        0x4959b8b8 -> :sswitch_0
        0x5023cb0c -> :sswitch_2
        0x7122a43c -> :sswitch_a
        0x78acc35d -> :sswitch_a
        0x7cab852b -> :sswitch_b
        0x7db01b14 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x12dc43d5

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v5, "\u05a8\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x61f9

    const v7, 0x73f866ef

    xor-int/2addr v6, v7

    const v7, -0x4d511afa

    :goto_0
    xor-int/2addr v5, v7

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x583

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v5, "\u06e0\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x131b

    const v7, -0x679987c6

    xor-int/2addr v6, v7

    const v7, 0x426ffc70    # 59.99652f

    goto :goto_0

    .line 1127
    :sswitch_0
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_c

    goto/16 :goto_4

    .line 158
    :sswitch_1
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v5, :cond_a

    goto/16 :goto_4

    .line 874
    :sswitch_2
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_4

    .line 924
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return-object p1

    :sswitch_4
    const/4 p1, 0x0

    return-object p1

    .line 1182
    :sswitch_5
    invoke-static {v1}, Ll/ۗ۬;->᩶᩵᩻(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_6
    const/4 v1, -0x1

    .line 1178
    invoke-virtual {v0, v1, p1}, Ll/ۢ᩵ᩴ;->֫(ILjava/lang/String;)I

    move-result v5

    if-ne v5, v1, :cond_1

    const-string v1, "\u073f\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v4

    xor-int v6, v1, v3

    mul-int/lit16 v6, v6, 0x3d1d

    const v7, -0x3d91bcc6

    xor-int/2addr v6, v7

    const v7, -0x6c06b824

    goto :goto_2

    :cond_1
    const-string v1, "\u1a74\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v3, v1

    mul-int/lit8 v1, v1, -0x9

    xor-int v6, v1, v4

    mul-int/lit16 v6, v6, 0x3e5

    const v7, 0x3477a201

    xor-int/2addr v6, v7

    const v7, -0x5760ef6a

    :goto_2
    xor-int/2addr v1, v7

    move v8, v5

    move v5, v1

    move v1, v8

    goto :goto_1

    :sswitch_7
    iget-object v0, p0, Ll/۬ۖۡ;->᩸:Ll/ۢ᩵ᩴ;

    .line 551
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6867

    const v7, 0x30deb33d

    xor-int/2addr v6, v7

    const v7, -0x660adca2

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u05a1\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x34a5

    const v7, 0x6c806517

    xor-int/2addr v6, v7

    const v7, 0x2ef635dc

    goto/16 :goto_0

    .line 660
    :sswitch_9
    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_4

    :goto_3
    const-string v5, "\u0733\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5d6f

    const v7, -0x2b2717da

    xor-int/2addr v6, v7

    const v7, 0x2127917d

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e7\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x50df

    const v7, -0x4a6270f4

    xor-int/2addr v6, v7

    const v7, -0x9566fe1

    goto/16 :goto_0

    .line 290
    :sswitch_a
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u06da\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3ad3

    const v7, 0x4b592fd3    # 1.4233555E7f

    xor-int/2addr v6, v7

    const v7, -0x4d0f2d3c

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u06df\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4855

    const v7, -0x39625dbd

    xor-int/2addr v6, v7

    const v7, -0x326d8b4b

    goto/16 :goto_0

    .line 698
    :sswitch_c
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    const-string v5, "\u1a74\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x206d

    const v7, -0x1ee6e067

    xor-int/2addr v6, v7

    const v7, 0x3779e5b8

    goto/16 :goto_0

    .line 358
    :sswitch_d
    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v5, :cond_8

    goto :goto_6

    :cond_8
    const-string v5, "\u06e0\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x531b

    const v7, -0x31580f8d

    xor-int/2addr v6, v7

    const v7, 0xf3c1a27

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v5, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v5, :cond_9

    :goto_4
    const-string v5, "\u05ab\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7905

    const v7, -0x67128b2

    xor-int/2addr v6, v7

    const v7, 0x29ad271d

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a75\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2f01

    const v7, 0x18b37d54

    xor-int/2addr v6, v7

    const v7, -0x77539f60

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_5
    const-string v5, "\u06e4\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x715f

    const v7, 0x3bb6006f

    xor-int/2addr v6, v7

    const v7, 0x11aa291a

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06db\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6993

    const v7, -0x13238772

    xor-int/2addr v6, v7

    const v7, -0x492fd12e

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_6
    const-string v5, "\u0730\u06dc"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x38c9

    const v7, -0x73d53f73

    xor-int/2addr v6, v7

    const v7, 0x7584ef42

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06da\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x216b

    const v7, 0x7dd006f9

    xor-int/2addr v6, v7

    const v7, 0x270606a6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c56217b -> :sswitch_3
        -0x6c2d7c4f -> :sswitch_a
        -0x6a95eaed -> :sswitch_8
        -0x696038f0 -> :sswitch_0
        -0x67926bbc -> :sswitch_e
        -0x643212a0 -> :sswitch_1
        -0x63eccd82 -> :sswitch_10
        -0x5332c087 -> :sswitch_f
        -0x4cdd3c39 -> :sswitch_7
        -0x48b753cd -> :sswitch_6
        -0x3da78eb0 -> :sswitch_b
        -0x377357d1 -> :sswitch_c
        -0x2cdee07f -> :sswitch_9
        -0x265dc904 -> :sswitch_2
        -0x2370c85d -> :sswitch_3
        -0xe556559 -> :sswitch_e
        -0xe1748e8 -> :sswitch_10
        -0xdef7dfe -> :sswitch_d
        -0xc144f11 -> :sswitch_5
        -0x813d145 -> :sswitch_0
        0x339730f -> :sswitch_b
        0x33adde4 -> :sswitch_8
        0x2181a7d3 -> :sswitch_c
        0x26ceb7f3 -> :sswitch_7
        0x3150d208 -> :sswitch_5
        0x3bd1b41e -> :sswitch_a
        0x3f179468 -> :sswitch_2
        0x47d2d3ca -> :sswitch_9
        0x5b396b18 -> :sswitch_1
        0x6060c764 -> :sswitch_6
        0x66db7a36 -> :sswitch_4
        0x7d877694 -> :sswitch_f
        0x7d8d8134 -> :sswitch_d
        0x7eb52220 -> :sswitch_4
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/String;I)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x52d384b6

    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v5, "\u073f\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x59f7

    const v7, 0x474f3d3

    xor-int/2addr v6, v7

    const v7, -0x787baf16

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x1213

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 1164
    iget-object v0, p0, Ll/۬ۖۡ;->᩸:Ll/ۢ᩵ᩴ;

    .line 1137
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_0

    const-string v5, "\u06e2\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xe01

    const v7, -0x1c79fa9

    xor-int/2addr v6, v7

    const v7, 0x5cb29db7

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v5

    if-gtz v5, :cond_a

    goto :goto_1

    .line 1117
    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_1

    goto/16 :goto_2

    .line 900
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    .line 1164
    :sswitch_5
    invoke-virtual {v0, v1, p1}, Ll/ۢ᩵ᩴ;->֫(ILjava/lang/Object;)I

    .line 1165
    new-instance v0, Ll/ۗۖۡ;

    invoke-direct {v0, p1, p2}, Ll/ۗۖۡ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string v5, "\u06e0\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4a05

    const v7, -0x30353d7f

    xor-int/2addr v6, v7

    const v7, -0x5fc261d3

    goto :goto_0

    :sswitch_6
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_2

    :cond_1
    :goto_1
    const-string v5, "\u06d9\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5923

    const v7, -0x558ab016

    xor-int/2addr v6, v7

    const v7, -0x5c2182c5

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06d9\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4b2d

    const v7, 0x2eb2a3e2

    xor-int/2addr v6, v7

    const v7, -0x5f6653c1

    goto/16 :goto_0

    .line 597
    :sswitch_7
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u1a74\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x60bf

    const v7, -0x51b17c5e

    xor-int/2addr v6, v7

    const v7, -0x2098e581

    goto/16 :goto_0

    .line 1061
    :sswitch_8
    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u06e1\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2e97

    const v7, -0x29c21342

    xor-int/2addr v6, v7

    const v7, 0x5fa460c5

    goto/16 :goto_0

    .line 198
    :sswitch_9
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v5

    if-gtz v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u06e1\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7edd

    const v7, 0x135998e1

    xor-int/2addr v6, v7

    const v7, 0x39756319

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u05a1\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x58a1

    const v7, -0x657b733a

    xor-int/2addr v6, v7

    const v7, 0x2bf401b1

    goto/16 :goto_0

    .line 247
    :sswitch_a
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v5, "\u1a77\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2551

    const v7, -0x29421190

    xor-int/2addr v6, v7

    const v7, -0x1577b02b

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06db\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6791

    const v7, -0x74c6fcab

    xor-int/2addr v6, v7

    const v7, 0x72032781

    goto/16 :goto_0

    .line 759
    :sswitch_c
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u1a76\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4a11

    const v7, -0x13b72c25

    xor-int/2addr v6, v7

    const v7, -0x764ef13f

    goto/16 :goto_0

    .line 321
    :sswitch_d
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v5

    if-ltz v5, :cond_b

    :cond_a
    const-string v5, "\u05a1\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x156b

    const v7, 0x48f85e74

    xor-int/2addr v6, v7

    const v7, 0x183bbfcb

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xe41

    const v7, 0x401da17

    xor-int/2addr v6, v7

    const v7, 0x2f8091ad

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_c

    :goto_3
    const-string v5, "\u0733\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6ef5

    const v7, 0x214ab00a

    xor-int/2addr v6, v7

    const v7, -0x25fafb40

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073a\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6b63

    const v7, 0xc2299d4

    xor-int/2addr v6, v7

    const v7, -0x2ac36f49

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72f11bf2 -> :sswitch_a
        -0x6e1606b0 -> :sswitch_c
        -0x6dbd3226 -> :sswitch_d
        -0x6abc8da6 -> :sswitch_1
        -0x621a6d07 -> :sswitch_3
        -0x5faf823e -> :sswitch_8
        -0x5d7feed4 -> :sswitch_4
        -0x5d079146 -> :sswitch_c
        -0x53939eeb -> :sswitch_6
        -0x5305fdfd -> :sswitch_b
        -0x4d2e88a6 -> :sswitch_3
        -0x37d4be79 -> :sswitch_1
        -0x2d234673 -> :sswitch_7
        -0x28e9765f -> :sswitch_0
        -0x26ffea89 -> :sswitch_0
        -0x26dd4f34 -> :sswitch_5
        -0x209de85e -> :sswitch_8
        -0xe261814 -> :sswitch_2
        0x4b4c372 -> :sswitch_d
        0xc207f60 -> :sswitch_e
        0x2102c0b6 -> :sswitch_e
        0x254ec68a -> :sswitch_6
        0x287a6e18 -> :sswitch_2
        0x2d4574d7 -> :sswitch_5
        0x3830305a -> :sswitch_a
        0x3a32b121 -> :sswitch_9
        0x577de7af -> :sswitch_4
        0x5838ee51 -> :sswitch_b
        0x67f371f6 -> :sswitch_9
        0x6dffb54f -> :sswitch_7
    .end sparse-switch
.end method
