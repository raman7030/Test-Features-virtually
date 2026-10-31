.class public final synthetic Ll/ۡۖ᩷;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x13904074

    sget v2, Ll/ۛ;->᩺᩻֫:I

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v4, "\u05a1\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x28a9

    const v6, -0x689bc801

    xor-int/2addr v5, v6

    const v6, 0x364d775c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x375d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 4
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_9

    goto/16 :goto_1

    .line 4
    :sswitch_2
    sget v4, Ll/۠;->ܺܺܶ:I

    if-gez v4, :cond_6

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto/16 :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    sget p1, Ll/᩹ۖ᩷;->ۘۧ:I

    new-instance p1, Ll/֨ۖ᩷;

    invoke-direct {p1, v0}, Ll/֨ۖ᩷;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    const-string v4, "\u0730\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xed9

    const v6, 0x2d9c42e2

    xor-int/2addr v5, v6

    const v6, -0x21697900

    goto :goto_0

    :sswitch_6
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06ec\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4569

    const v6, 0x37e5504a

    xor-int/2addr v5, v6

    const v6, -0x770baa1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e0\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3ccf

    const v6, 0x6d69a825

    xor-int/2addr v5, v6

    const v6, 0x4e222830    # 6.8013568E8f

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u1a79\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x74bd

    const v6, 0x33f2f494

    xor-int/2addr v5, v6

    const v6, 0x70401966

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_4

    :goto_1
    const-string v4, "\u1a79\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3179

    const v6, -0x62d987cd

    xor-int/2addr v5, v6

    const v6, 0x748803f1    # 8.621E31f

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a8\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3c81

    const v6, -0xadba580

    xor-int/2addr v5, v6

    const v6, -0x56030c09

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u1a7a\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x11df

    const v6, -0x51abd6db

    xor-int/2addr v5, v6

    const v6, -0x683e1650

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u1a7a\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6d1

    const v6, -0x2afb2601

    xor-int/2addr v5, v6

    const v6, -0x1a92fdbf

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d9\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14d3

    const v6, -0x2e9ff448

    xor-int/2addr v5, v6

    const v6, -0x32d3a5c6    # -1.8072464E8f

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_8

    :goto_3
    const-string v4, "\u06df\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b93

    const v6, -0x5d4f1a67

    xor-int/2addr v5, v6

    const v6, -0x3df24780

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a7b\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x237b

    const v6, 0x1c8622b6

    xor-int/2addr v5, v6

    const v6, 0x1bc6eeb6

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a77\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6359

    const v6, -0x54d749db

    xor-int/2addr v5, v6

    const v6, -0x546f535f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a74\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x8d7

    const v6, 0x73aece88

    xor-int/2addr v5, v6

    const v6, 0x796d9f6d

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a75\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e11

    const v6, -0x43988eea

    xor-int/2addr v5, v6

    const v6, 0x7446dcc8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x785

    const v6, -0x66af6558

    xor-int/2addr v5, v6

    const v6, -0x74c52a2f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f840f41 -> :sswitch_c
        -0x7b7b0bbc -> :sswitch_3
        -0x60b0081f -> :sswitch_1
        -0x5ca6255b -> :sswitch_b
        -0x4cf81e57 -> :sswitch_1
        -0x4948a7a9 -> :sswitch_7
        -0x408350f9 -> :sswitch_5
        -0x37e97738 -> :sswitch_8
        -0x292d3d05 -> :sswitch_d
        -0x24851d95 -> :sswitch_e
        -0x10cf79cb -> :sswitch_5
        -0x10aa8856 -> :sswitch_a
        -0xef76172 -> :sswitch_d
        -0x1ce461d -> :sswitch_4
        0x1a0ce84 -> :sswitch_c
        0xe1a7fd2 -> :sswitch_6
        0x1e3a42d0 -> :sswitch_8
        0x2016a7c2 -> :sswitch_e
        0x2456e56a -> :sswitch_0
        0x2fc80a04 -> :sswitch_6
        0x341205c5 -> :sswitch_2
        0x37a264e9 -> :sswitch_a
        0x3d8876b7 -> :sswitch_7
        0x46a4b76a -> :sswitch_2
        0x56f96904 -> :sswitch_9
        0x5748e997 -> :sswitch_4
        0x613c3274 -> :sswitch_0
        0x62d58c65 -> :sswitch_b
        0x6b72c949 -> :sswitch_3
        0x7af5f247 -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
