.class public final synthetic Ll/ۡ᩵ۡ;
.super Ljava/lang/Object;
.source "T6NI"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ۙ:Ll/۫ۚۡ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ljava/util/List;

.field public final synthetic ᩹:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroid/app/Activity;Ll/֡ۚۢ;Ll/۫ۚۡ;)V
    .locals 6

    const v0, -0x5d2ca7d2

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e1\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7575

    const v5, -0x2018f84d

    xor-int/2addr v4, v5

    const v5, 0x17c18b71

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xcd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_0

    goto :goto_1

    .line 1
    :sswitch_0
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_a

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v3, :cond_5

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۡ᩵ۡ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۡ᩵ۡ;->ۙ:Ll/۫ۚۡ;

    return-void

    :cond_0
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7cc1

    const v5, 0x18b38795

    xor-int/2addr v4, v5

    const v5, -0x7f49c6c5

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d9\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x378f

    const v5, 0xe146cc1

    xor-int/2addr v4, v5

    const v5, -0x4fb1de05

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_2

    :goto_1
    const-string v3, "\u0730\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x26c5

    const v5, -0x2b9a46c9

    xor-int/2addr v4, v5

    const v5, 0x4ffbe71f

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u0736\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b9

    const v5, -0x26bcb9f3

    xor-int/2addr v4, v5

    const v5, 0x6d7cce0

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a95

    const v5, -0x668cb3f9

    xor-int/2addr v4, v5

    const v5, 0x7746511b

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x40b

    const v5, -0x53e20a5

    xor-int/2addr v4, v5

    const v5, 0x696e464e

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u073d\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x19f7

    const v5, -0x294f8209

    xor-int/2addr v4, v5

    const v5, 0x4d4d12c4    # 2.15034944E8f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69e1

    const v5, -0x20c6687a

    xor-int/2addr v4, v5

    const v5, 0x41a35d39

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7755

    const v5, 0x408c6806

    xor-int/2addr v4, v5

    const v5, 0x6ad35905

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f49

    const v5, -0x10da439e

    xor-int/2addr v4, v5

    const v5, 0x11200d33

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x35ab

    const v5, -0x595475eb

    xor-int/2addr v4, v5

    const v5, -0x349ebba6    # -1.4763098E7f

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7697

    const v5, 0x1cad84c2

    xor-int/2addr v4, v5

    const v5, -0x7469cf90

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05ab\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e77

    const v5, -0x7d4edebb

    xor-int/2addr v4, v5

    const v5, -0x336d5f8

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۡ᩵ۡ;->᩸:Ljava/util/List;

    iput-object p2, p0, Ll/ۡ᩵ۡ;->᩹:Landroid/app/Activity;

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_c

    :goto_5
    const-string v3, "\u0736\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c81

    const v5, -0x2199227f

    xor-int/2addr v4, v5

    const v5, 0x1674ccfe

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c93

    const v5, 0x6fadc716

    xor-int/2addr v4, v5

    const v5, 0x7ca1d103

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7602626e -> :sswitch_1
        -0x67e19903 -> :sswitch_c
        -0x61d02e69 -> :sswitch_4
        -0x5e1580b2 -> :sswitch_0
        -0x5d33a5e8 -> :sswitch_5
        -0x56106777 -> :sswitch_1
        -0x43e93e93 -> :sswitch_6
        -0x42e86ce8 -> :sswitch_5
        -0x2fe55475 -> :sswitch_2
        -0x2642140f -> :sswitch_d
        -0x16e704f5 -> :sswitch_b
        0x62a3d93 -> :sswitch_b
        0x6cb7808 -> :sswitch_a
        0x13c53dc1 -> :sswitch_a
        0x15841757 -> :sswitch_8
        0x2494c7c9 -> :sswitch_c
        0x286a5715 -> :sswitch_6
        0x2d4eb05e -> :sswitch_e
        0x34cee9e1 -> :sswitch_3
        0x397c053e -> :sswitch_e
        0x3c3fd53a -> :sswitch_d
        0x43ad3102 -> :sswitch_7
        0x47cb63a9 -> :sswitch_9
        0x47d01c09 -> :sswitch_8
        0x48aadb9d -> :sswitch_3
        0x5354585a -> :sswitch_0
        0x553c4633 -> :sswitch_7
        0x63dad9a0 -> :sswitch_9
        0x6d7ff4af -> :sswitch_4
        0x7a1da346 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x4970f3cb

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v5, "\u1a77\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x176d

    const v7, 0x53a81fed

    xor-int/2addr v6, v7

    const v7, 0x6116cfeb

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x3bab

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 16
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_b

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_8

    goto/16 :goto_3

    .line 19
    :sswitch_1
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-gez v5, :cond_5

    goto/16 :goto_3

    .line 12
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_3

    .line 16
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    :sswitch_4
    return-void

    .line 33
    :sswitch_5
    new-instance v5, Ll/۠᩵᩷;

    const/4 v6, 0x1

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v7, p0, Ll/ۡ᩵ۡ;->᩶:Ll/֡ۚۢ;

    .line 1
    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_1

    goto :goto_1

    .line 33
    :cond_1
    iget-object v8, p0, Ll/ۡ᩵ۡ;->ۙ:Ll/۫ۚۡ;

    sget-boolean v9, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v9, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {v5, v7, v8, v1, v6}, Ll/۠᩵᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Ll/ۡ᩵ۡ;->᩹:Landroid/app/Activity;

    invoke-static {p1, v1, v5}, Ll/ۖ᩵ۡ;->֫(Landroid/app/Activity;Ll/᩷᩵ۡ;Ljava/lang/Runnable;)V

    return-void

    .line 31
    :sswitch_6
    invoke-static {v0, p1}, Ll/᩺;->֫ۢۡ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷᩵ۡ;

    .line 32
    iget-boolean v5, v1, Ll/᩷᩵ۡ;->֫:Z

    if-eqz v5, :cond_3

    const-string v5, "\u06e1\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1f7f

    const v7, 0xe7e1e99

    xor-int/2addr v6, v7

    const v7, -0x44f0731e

    goto :goto_0

    :cond_3
    const-string v5, "\u06df\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1bb3

    const v7, -0x23979965

    xor-int/2addr v6, v7

    const v7, -0x6e6823c1

    goto/16 :goto_0

    .line 31
    :sswitch_7
    iget-object v0, p0, Ll/ۡ᩵ۡ;->᩸:Ljava/util/List;

    .line 20
    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_4

    :goto_1
    const-string v5, "\u06e2\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4cc3

    const v7, -0x3c1aba66

    xor-int/2addr v6, v7

    const v7, -0x72561f8d

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u05a1\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x771f

    const v7, -0x5c1a6973

    xor-int/2addr v6, v7

    const v7, -0x4203ed09

    goto/16 :goto_0

    .line 10
    :sswitch_8
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_6

    :cond_5
    const-string v5, "\u06d7\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2c11

    const v7, 0x439337b4

    xor-int/2addr v6, v7

    const v7, 0x31bb83e3

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a73\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6815

    const v7, -0x326b84f9

    xor-int/2addr v6, v7

    const v7, 0x98c54e4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v5

    if-gtz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u0730\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5d01

    const v7, -0x87b96c

    xor-int/2addr v6, v7

    const v7, -0x3a7a6cb4

    goto/16 :goto_0

    .line 21
    :sswitch_a
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u1a73\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x77cf

    const v7, 0x4413d229

    xor-int/2addr v6, v7

    const v7, 0x5abd8718

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05ab\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x21eb

    const v7, -0x4e372f8f

    xor-int/2addr v6, v7

    const v7, 0x3f2d9f0d

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u1a76\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x51ab

    const v7, -0x3b0a4a91

    xor-int/2addr v6, v7

    const v7, -0x24ef0043

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_c

    :cond_b
    const-string v5, "\u05a1\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x13d

    const v7, -0x2d023eab

    xor-int/2addr v6, v7

    const v7, 0x6e4b7aa0

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e2\u06dc"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6d0d

    const v7, 0x7930df64

    xor-int/2addr v6, v7

    const v7, -0x61b81bd1

    goto/16 :goto_0

    .line 18
    :sswitch_d
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_d

    :goto_3
    const-string v5, "\u06dc\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x78b

    const v7, 0x776048e7

    xor-int/2addr v6, v7

    const v7, 0x764cc8c0

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a78\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2b4d

    const v7, -0x5815336e

    xor-int/2addr v6, v7

    const v7, 0x5a6ce932

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fa5e228 -> :sswitch_1
        -0x6b835e72 -> :sswitch_5
        -0x6911eff1 -> :sswitch_2
        -0x6689c4c1 -> :sswitch_4
        -0x607a0007 -> :sswitch_6
        -0x5fa7780a -> :sswitch_2
        -0x5e0aa154 -> :sswitch_a
        -0x5b47de2f -> :sswitch_4
        -0x513175f8 -> :sswitch_9
        -0x509aa730 -> :sswitch_6
        -0x3473f3d8 -> :sswitch_c
        -0x2d97456d -> :sswitch_3
        -0x28be4e43 -> :sswitch_7
        -0x1af85927 -> :sswitch_b
        -0x185033f5 -> :sswitch_3
        -0xf09a1e1 -> :sswitch_d
        -0x8b2c997 -> :sswitch_b
        -0x69563ab -> :sswitch_a
        0x4c0bc55 -> :sswitch_0
        0x131b8af2 -> :sswitch_8
        0x15366566 -> :sswitch_d
        0x1bb233b0 -> :sswitch_8
        0x1ddaed9e -> :sswitch_5
        0x22598588 -> :sswitch_9
        0x2bf63519 -> :sswitch_7
        0x4b891e0c -> :sswitch_c
        0x4c3297a9 -> :sswitch_0
        0x60bd81c7 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
