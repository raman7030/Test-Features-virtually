.class public final synthetic Ll/ۚ֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ֨ۡ;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x7f0e3983

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x650b

    const v6, -0x737b9a2e

    xor-int/2addr v5, v6

    const v6, 0x382b356a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x1313

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 98
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_1

    goto/16 :goto_1

    .line 107
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_4

    goto/16 :goto_2

    .line 49
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v4

    if-gtz v4, :cond_a

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    .line 4
    :sswitch_4
    check-cast p1, Ll/ܺ۠ۡ;

    .line 132
    iput-object v0, p1, Ll/ܺ۠ۡ;->֫:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_5
    iget-object v0, p0, Ll/ۚ֨ۡ;->᩸:Ljava/util/Map;

    .line 125
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_0

    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6587

    const v6, -0x5a22ceeb

    xor-int/2addr v5, v6

    const v6, 0x621fc3a3

    goto :goto_0

    :cond_0
    const-string v4, "\u0733\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x74c3

    const v6, 0x93ee211

    xor-int/2addr v5, v6

    const v6, -0x15ed2e1c

    goto :goto_0

    .line 81
    :sswitch_6
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_2

    :cond_1
    const-string v4, "\u06df\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e83

    const v6, -0x4525897c

    xor-int/2addr v5, v6

    const v6, -0x5f6587d3

    goto :goto_0

    :cond_2
    const-string v4, "\u1a73\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4517

    const v6, -0x768ed3c6

    xor-int/2addr v5, v6

    const v6, -0xfa324e2

    goto/16 :goto_0

    .line 73
    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v4, "\u06e2\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x500f

    const v6, -0xa17f322

    xor-int/2addr v5, v6

    const v6, 0x4a242576    # 2689373.5f

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_5

    :cond_4
    const-string v4, "\u1a73\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xe85

    const v6, 0x22fbe6f8

    xor-int/2addr v5, v6

    const v6, -0x2b133e72

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a79\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4871

    const v6, 0x20103386

    xor-int/2addr v5, v6

    const v6, 0x34717792

    goto/16 :goto_0

    .line 29
    :sswitch_9
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v4, "\u06e8\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x428f

    const v6, 0x53ffbed3

    xor-int/2addr v5, v6

    const v6, 0x2e92e4a7

    goto/16 :goto_0

    .line 25
    :sswitch_a
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_7

    goto :goto_1

    :cond_7
    const-string v4, "\u06ec\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2555

    const v6, -0x3260c15b

    xor-int/2addr v5, v6

    const v6, 0x4a9afd53    # 5078697.5f

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u06eb\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x654d

    const v6, 0x2efa4c24

    xor-int/2addr v5, v6

    const v6, -0x120ffccd

    goto/16 :goto_0

    .line 125
    :sswitch_c
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_9

    goto :goto_2

    :cond_9
    const-string v4, "\u0733\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x655f

    const v6, 0x2bd994eb

    xor-int/2addr v5, v6

    const v6, 0x4e1d43fe    # 6.5961971E8f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v4

    if-gtz v4, :cond_b

    :cond_a
    :goto_1
    const-string v4, "\u06d9\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xa2d

    const v6, -0x6554e5e8

    xor-int/2addr v5, v6

    const v6, -0x53de47a3

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a74\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1219

    const v6, 0x6db42c48

    xor-int/2addr v5, v6

    const v6, -0x79b5bb47

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_c

    :goto_2
    const-string v4, "\u06e7\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7c89

    const v6, -0xc74aa69

    xor-int/2addr v5, v6

    const v6, -0x5f5c46b5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x40c7

    const v6, -0x530ad588

    xor-int/2addr v5, v6

    const v6, 0x43575423

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6bd7e9ca -> :sswitch_8
        -0x626a822e -> :sswitch_b
        -0x5475a5ab -> :sswitch_e
        -0x5338134e -> :sswitch_6
        -0x52764c27 -> :sswitch_7
        -0x4aad97c5 -> :sswitch_9
        -0x497df93c -> :sswitch_4
        -0x2c9e2070 -> :sswitch_9
        -0x12472198 -> :sswitch_5
        -0x58f2692 -> :sswitch_c
        -0x4de24d5 -> :sswitch_d
        -0x41b2d52 -> :sswitch_0
        0x5fe685a -> :sswitch_b
        0x19b5f42d -> :sswitch_5
        0x1b629299 -> :sswitch_e
        0x23bd4fd0 -> :sswitch_3
        0x2dfd050a -> :sswitch_a
        0x324799e3 -> :sswitch_0
        0x39615c5e -> :sswitch_1
        0x4ac2456a -> :sswitch_2
        0x4ee836bb -> :sswitch_8
        0x54a9bfea -> :sswitch_a
        0x55ef79b9 -> :sswitch_3
        0x58b6bb26 -> :sswitch_d
        0x5a434029 -> :sswitch_6
        0x5a66c4e8 -> :sswitch_1
        0x5aac8980 -> :sswitch_c
        0x68c4c43a -> :sswitch_2
        0x73e9c843 -> :sswitch_4
        0x7f60db21 -> :sswitch_7
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
