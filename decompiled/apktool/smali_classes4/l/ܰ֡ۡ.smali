.class public final synthetic Ll/ܰ֡ۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۢ۠ۡ;


# instance fields
.field public final synthetic ۙ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/۬۬ܿ;

.field public final synthetic ᩹:Ll/ۛۚۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۬۬ܿ;Ll/֡ۚۢ;Ll/ۛۚۡ;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 6

    const v0, 0xff3622b    # 2.3999463E-29f

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c27

    const v5, 0x1b10db84

    xor-int/2addr v4, v5

    const v5, -0x42d9a26c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x98f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    .line 0
    :sswitch_0
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_b

    goto/16 :goto_1

    .line 4
    :sswitch_1
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_3

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p2, p0, Ll/ܰ֡ۡ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ܰ֡ۡ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e2\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf7

    const v5, 0x40a28a32

    xor-int/2addr v4, v5

    const v5, -0x7ff4f106

    goto :goto_0

    :cond_1
    const-string v3, "\u1a7a\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c15

    const v5, 0x411617cc

    xor-int/2addr v4, v5

    const v5, 0x17f09c62

    goto :goto_0

    .line 0
    :sswitch_7
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6697

    const v5, -0x39667695

    xor-int/2addr v4, v5

    const v5, -0x6acc567

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06d8\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x163f

    const v5, -0xae7efed

    xor-int/2addr v4, v5

    const v5, 0x3154c332

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06eb\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c51

    const v5, -0x69efc9ca

    xor-int/2addr v4, v5

    const v5, -0x7f28036f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18db

    const v5, -0x4a89bacb

    xor-int/2addr v4, v5

    const v5, -0x1d8e7522

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f57

    const v5, 0x20edc629

    xor-int/2addr v4, v5

    const v5, 0x7bc5f0ee

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_8

    :cond_7
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7383

    const v5, 0x16d8f93f

    xor-int/2addr v4, v5

    const v5, 0x737ca021

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1481

    const v5, -0x3b1cfb80

    xor-int/2addr v4, v5

    const v5, -0x3acc1d0b

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a75

    const v5, 0x94266ff

    xor-int/2addr v4, v5

    const v5, -0x17daf86f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a75\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5dfb

    const v5, -0x3e1bb4f3

    xor-int/2addr v4, v5

    const v5, 0x59846a69

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24b1

    const v5, -0x1c736f5

    xor-int/2addr v4, v5

    const v5, 0xadbc4b7

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073d\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6105

    const v5, -0x37a3e60e

    xor-int/2addr v4, v5

    const v5, 0x25b4f76

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܰ֡ۡ;->᩸:Ll/۬۬ܿ;

    iput-object p3, p0, Ll/ܰ֡ۡ;->᩹:Ll/ۛۚۡ;

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a9

    const v5, -0x749a9249

    xor-int/2addr v4, v5

    const v5, 0x1b302c38

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7969

    const v5, -0x35665015    # -5036021.5f

    xor-int/2addr v4, v5

    const v5, 0x214b3e83

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bab60df -> :sswitch_2
        -0x7366e4c5 -> :sswitch_e
        -0x725289f5 -> :sswitch_b
        -0x6e88df18 -> :sswitch_6
        -0x6398d4f2 -> :sswitch_3
        -0x5955b158 -> :sswitch_d
        -0x51494bfb -> :sswitch_5
        -0x5010f373 -> :sswitch_9
        -0x4a3f14e1 -> :sswitch_1
        -0x44dd29d9 -> :sswitch_8
        -0x3c267f40 -> :sswitch_6
        -0x3964a224 -> :sswitch_0
        -0x33305a0a -> :sswitch_8
        -0x265d0914 -> :sswitch_5
        -0x1a6e2a7a -> :sswitch_0
        -0x16a3762e -> :sswitch_d
        -0x14719a9a -> :sswitch_a
        -0x128326e6 -> :sswitch_b
        -0x104e4df9 -> :sswitch_9
        0x520fa8a -> :sswitch_4
        0x8a1c926 -> :sswitch_1
        0x9a6dfc4 -> :sswitch_3
        0x1f82dd7b -> :sswitch_c
        0x1fe94c65 -> :sswitch_7
        0x3198c5c9 -> :sswitch_a
        0x54fd061f -> :sswitch_2
        0x593af823 -> :sswitch_7
        0x5d3500bd -> :sswitch_4
        0x694be590 -> :sswitch_c
        0x696221da -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(Ll/᩻ᩴۡ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5bdf6f7a

    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    sget v4, Ll/֡֡;->֫ۤܳ:I

    const-string v5, "\u1a74\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4313

    const v7, 0x1ca5e0af

    xor-int/2addr v6, v7

    const v7, 0x460eda19

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x6021

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 1
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_8

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_9

    goto/16 :goto_1

    .line 2
    :sswitch_2
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_4

    goto/16 :goto_5

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_5

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/ܰ֡ۡ;->᩸:Ll/۬۬ܿ;

    iget-object v3, p0, Ll/ܰ֡ۡ;->᩹:Ll/ۛۚۡ;

    invoke-static {v2, v0, p1, v3, v1}, Ll/ۛۚۡ;->ۧ(Ll/۬۬ܿ;Ll/֡ۚۢ;Ll/᩻ᩴۡ;Ll/ۛۚۡ;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ܰ֡ۡ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u1a77\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xd8d

    const v7, 0x3d332363

    xor-int/2addr v6, v7

    const v7, -0x89e9a7c

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v0, p0, Ll/ܰ֡ۡ;->᩶:Ll/֡ۚۢ;

    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u1a73\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6d4f

    const v7, 0x42fa5ab

    xor-int/2addr v6, v7

    const v7, -0xad49182

    goto :goto_0

    :sswitch_8
    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u1a7b\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5619

    const v7, -0x716b7dd6

    xor-int/2addr v6, v7

    const v7, 0x5b709961

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u06e8\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x279

    const v7, 0x6d17eb93

    xor-int/2addr v6, v7

    const v7, -0x526eaccd

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_5

    :cond_4
    :goto_1
    const-string v5, "\u06ec\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2bf

    const v7, 0x5158b6ea

    xor-int/2addr v6, v7

    const v7, 0x32d5c518

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06d8\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1e73

    const v7, -0x26383c50

    xor-int/2addr v6, v7

    const v7, 0x776e3573

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06d6\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xa7b

    const v7, 0x4ae62430    # 7541272.0f

    xor-int/2addr v6, v7

    const v7, 0x6f3b562b

    goto/16 :goto_0

    :cond_7
    :goto_2
    const-string v5, "\u06d7\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x248b

    const v7, 0x1d2a3750

    xor-int/2addr v6, v7

    const v7, -0x73a02fe5

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d8\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x260d

    const v7, 0x36a9d729

    xor-int/2addr v6, v7

    const v7, 0x2d95aae

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a73\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x20e3

    const v7, -0x4328f23c

    xor-int/2addr v6, v7

    const v7, 0x695bedfb

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06df\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x695

    const v7, -0x69305ac

    xor-int/2addr v6, v7

    const v7, 0x60142e23

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_b

    :goto_4
    const-string v5, "\u1a75\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5c01

    const v7, 0x407c36b5

    xor-int/2addr v6, v7

    const v7, -0x908f2a1

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d7\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2063

    const v7, -0x47b511ec

    xor-int/2addr v6, v7

    const v7, -0x43c9ed5c

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_c

    :goto_5
    const-string v5, "\u05ab\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6a9

    const v7, 0x187e1692

    xor-int/2addr v6, v7

    const v7, 0xa74032d

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e1\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7577

    const v7, 0x639d9d61

    xor-int/2addr v6, v7

    const v7, -0x2ddb52fb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d2696f1 -> :sswitch_d
        -0x759f0380 -> :sswitch_2
        -0x6f8c0570 -> :sswitch_9
        -0x6e6e6ae8 -> :sswitch_7
        -0x6c616fb9 -> :sswitch_a
        -0x5cbb36ba -> :sswitch_9
        -0x5bdb4281 -> :sswitch_5
        -0x5576b1f0 -> :sswitch_8
        -0x4e26efbb -> :sswitch_5
        -0x43f377af -> :sswitch_e
        -0x42f533e1 -> :sswitch_7
        -0x428d0ffd -> :sswitch_2
        -0x3d692af9 -> :sswitch_a
        -0x2ffbef55 -> :sswitch_1
        -0x2b730179 -> :sswitch_3
        -0x1900c0a8 -> :sswitch_3
        -0x5f3da89 -> :sswitch_4
        -0x57ba351 -> :sswitch_0
        -0x1835688 -> :sswitch_b
        0x45963b3 -> :sswitch_4
        0x90bb883 -> :sswitch_e
        0x2f2e2f99 -> :sswitch_8
        0x4093d4d3 -> :sswitch_c
        0x435e61f2 -> :sswitch_d
        0x4e91eaa1 -> :sswitch_0
        0x5314bac6 -> :sswitch_c
        0x5fc20a4f -> :sswitch_b
        0x6a816772 -> :sswitch_6
        0x6c1841ce -> :sswitch_6
        0x70fa14fa -> :sswitch_1
    .end sparse-switch
.end method
