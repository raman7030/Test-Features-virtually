.class public final synthetic Ll/֨ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, -0x3214affa

    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v4, "\u0736\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f2f

    const v6, 0x631c7ac6

    xor-int/2addr v5, v6

    const v6, 0x49c1c3ea

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x31b5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1248
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v4

    if-ltz v4, :cond_7

    goto :goto_1

    .line 282
    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v4

    if-gtz v4, :cond_2

    goto :goto_1

    .line 2253
    :sswitch_2
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_b

    goto :goto_1

    .line 472
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    :goto_1
    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7f13

    const v6, -0x641c86d

    xor-int/2addr v5, v6

    const v6, 0x37b7b72f

    goto :goto_0

    .line 1564
    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    const-wide/16 v0, 0x0

    return-wide v0

    .line 4
    :sswitch_5
    sget p1, Ll/֫᩵᩷;->ۛۧ:I

    .line 2277
    iget-wide v0, v0, Ll/ۙᩴ᩷;->֫:J

    return-wide v0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    .line 48
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06d9\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x899

    const v6, 0xf93720e

    xor-int/2addr v5, v6

    const v6, 0x1f9f9720

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u0736\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5839

    const v6, -0x1e3be5a4

    xor-int/2addr v5, v6

    const v6, 0x3d70bfd9

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_3

    :cond_2
    :goto_2
    const-string v4, "\u06d6\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x30e3

    const v6, -0x3204248a

    xor-int/2addr v5, v6

    const v6, 0xe5752bd

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e4\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x69b

    const v6, 0x6b269795

    xor-int/2addr v5, v6

    const v6, -0x470e5b6b

    goto/16 :goto_0

    .line 1761
    :sswitch_9
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06dc\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28e9

    const v6, -0x3ddab6b5

    xor-int/2addr v5, v6

    const v6, 0x5f230acb

    goto/16 :goto_0

    .line 2097
    :sswitch_a
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0730\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x48d

    const v6, 0x32e05c46

    xor-int/2addr v5, v6

    const v6, 0x1027142

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06e4\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5bd

    const v6, -0x6ced36b4

    xor-int/2addr v5, v6

    const v6, -0x6a4dafbd

    goto/16 :goto_0

    :cond_7
    :goto_3
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x27f7

    const v6, -0x38e57212

    xor-int/2addr v5, v6

    const v6, -0x12a7644b

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d9\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xc2b

    const v6, -0x6de33cce

    xor-int/2addr v5, v6

    const v6, 0x2bd3a556

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u1a76\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7d2d

    const v6, -0x88766ea

    xor-int/2addr v5, v6

    const v6, 0x70a720e3

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_a

    :goto_4
    const-string v4, "\u1a76\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5ef

    const v6, -0x39c6d8d1

    xor-int/2addr v5, v6

    const v6, 0x19ae7a2d

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d7\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7f5b

    const v6, 0x360ac2ee

    xor-int/2addr v5, v6

    const v6, 0xe35f0c1

    goto/16 :goto_0

    .line 1012
    :sswitch_e
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fed

    const v6, -0x58814fa3

    xor-int/2addr v5, v6

    const v6, -0x1bf20adc

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7269

    const v6, -0x3cd4743b

    xor-int/2addr v5, v6

    const v6, -0x532dd23e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79058695 -> :sswitch_6
        -0x71651663 -> :sswitch_8
        -0x5907e1a3 -> :sswitch_c
        -0x50980b22 -> :sswitch_e
        -0x2f44675c -> :sswitch_9
        -0x2b0fe564 -> :sswitch_b
        -0x2011789e -> :sswitch_2
        -0x14731201 -> :sswitch_6
        -0x595b822 -> :sswitch_b
        0x6dffb66 -> :sswitch_4
        0x9cb53e8 -> :sswitch_8
        0xc775314 -> :sswitch_1
        0xf913670 -> :sswitch_3
        0x10478938 -> :sswitch_9
        0x121a1547 -> :sswitch_1
        0x18a04602 -> :sswitch_7
        0x1de99de0 -> :sswitch_a
        0x2ac07e21 -> :sswitch_2
        0x30aa6981 -> :sswitch_7
        0x3a9359b1 -> :sswitch_3
        0x438e608a -> :sswitch_0
        0x44c9e2a9 -> :sswitch_a
        0x4619ef5d -> :sswitch_c
        0x5b894fec -> :sswitch_e
        0x64ce1657 -> :sswitch_d
        0x6dd36831 -> :sswitch_4
        0x7710afae -> :sswitch_0
        0x7a1e84a9 -> :sswitch_5
        0x7d2fe330 -> :sswitch_5
        0x7d6bfacf -> :sswitch_d
    .end sparse-switch
.end method
