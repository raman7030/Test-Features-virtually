.class public final synthetic Ll/ܺۤܽ;
.super Ljava/lang/Object;
.source "SAJE"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, 0x115feb0a

    sget v7, Ll/ۘܿ;->ۘܰ۫:I

    sget v8, Ll/֡᩶;->ܳܶ۠:I

    const-string v9, "\u05ab\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6c2d

    const v11, 0x6b7fa15c

    xor-int/2addr v10, v11

    const v11, 0x3bc2300a

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit8 v6, v6, -0x1f

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    sget v9, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v9, :cond_4

    goto/16 :goto_3

    .line 54
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v9

    if-ltz v9, :cond_0

    goto :goto_1

    :cond_0
    const-string v9, "\u06d8\u073a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1c85

    const v11, 0x454e148e

    xor-int/2addr v10, v11

    const v11, 0x7f386378

    goto :goto_0

    :sswitch_1
    sget v9, Ll/۠;->ܺܺܶ:I

    if-gez v9, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v9, "\u0730\u05ab"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x29

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x4cd1

    const v11, 0x3e91ae61

    xor-int/2addr v10, v11

    const v11, 0x754cc300

    goto :goto_0

    .line 94
    :sswitch_2
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_3

    .line 20
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const/4 p1, 0x0

    return p1

    .line 114
    :sswitch_4
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 6
    :sswitch_5
    sget v2, Ll/ᩴۤܽ;->֡֫:I

    .line 114
    invoke-static {v0}, Ll/۟;->ۢ᩷ᩴ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v1}, Ll/֫ܺ;->֨᩹۟(Ljava/lang/Object;)J

    move-result-wide v4

    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v9, :cond_2

    goto :goto_2

    :cond_2
    const-string v9, "\u0736\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4737

    const v11, -0x3cc931da

    xor-int/2addr v10, v11

    const v11, 0x141aad3d

    goto :goto_0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 96
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v9

    if-eqz v9, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v9, "\u1a75\u06df"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x51

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1f7

    const v11, 0x7687a962

    xor-int/2addr v10, v11

    const v11, -0x8ebf7ac

    goto/16 :goto_0

    .line 15
    :sswitch_7
    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v9, :cond_5

    :cond_4
    :goto_2
    const-string v9, "\u1a79\u06d9"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x65

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x666d

    const v11, -0x4cdb45bb

    xor-int/2addr v10, v11

    const v11, 0x66420d04

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u06ec\u06e0"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x44bb

    const v11, 0x4a2bb8db    # 2813494.8f

    xor-int/2addr v10, v11

    const v11, 0x574bc5e2

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v9, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v9, "\u05ab\u073f"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6c07

    const v11, 0x50d9e62f

    xor-int/2addr v10, v11

    const v11, -0x1ddd0215

    goto/16 :goto_0

    :sswitch_9
    sget v9, Ll/᩺;->ۙۛܶ:I

    if-gtz v9, :cond_7

    goto :goto_3

    :cond_7
    const-string v9, "\u1a73\u1a79"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x43

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x17cb

    const v11, -0x6090cd88

    xor-int/2addr v10, v11

    const v11, 0x296958f8

    goto/16 :goto_0

    .line 29
    :sswitch_a
    sget v9, Ll/۠;->ܺܺܶ:I

    if-ltz v9, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v9, "\u06dc\u06db"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0xb

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xd55

    const v11, 0x454b35c6

    xor-int/2addr v10, v11

    const v11, 0x46ccadd9

    goto/16 :goto_0

    .line 25
    :sswitch_b
    sget-boolean v9, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v9, :cond_9

    goto :goto_4

    :cond_9
    const-string v9, "\u1a7a\u06eb"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x5b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5a9f

    const v11, 0x5bc2f9e4

    xor-int/2addr v10, v11

    const v11, 0xc95ef61

    goto/16 :goto_0

    .line 71
    :sswitch_c
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v9

    if-eqz v9, :cond_a

    :goto_3
    const-string v9, "\u05a1\u073d"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x3f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x32bb

    const v11, -0x1c3f5f1b

    xor-int/2addr v10, v11

    const v11, 0x56701aa1    # 6.599929E13f

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u073f\u1a7b"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7cf3

    const v11, 0x41176fe8

    xor-int/2addr v10, v11

    const v11, 0x3a743522

    goto/16 :goto_0

    :sswitch_d
    sget v9, Ll/۠;->ܺܺܶ:I

    if-ltz v9, :cond_b

    goto :goto_4

    :cond_b
    const-string v9, "\u1a75\u06dc"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x152f

    const v11, 0x6d110e58

    xor-int/2addr v10, v11

    const v11, 0x2cb85c8f

    goto/16 :goto_0

    .line 40
    :sswitch_e
    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_c

    :goto_4
    const-string v9, "\u1a75\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7215

    const v11, 0x36426cbc

    xor-int/2addr v10, v11

    const v11, -0x1dc28a4e

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u1a7b\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x3

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7df5

    const v11, 0x1b8a0477

    xor-int/2addr v10, v11

    const v11, -0x6362e71a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x737e6639 -> :sswitch_d
        -0x6bba8304 -> :sswitch_8
        -0x63bea569 -> :sswitch_4
        -0x62d307f6 -> :sswitch_9
        -0x5fb1240c -> :sswitch_e
        -0x5b1f89b0 -> :sswitch_c
        -0x5aa1f6b2 -> :sswitch_5
        -0x50a912e6 -> :sswitch_2
        -0x4dd0201a -> :sswitch_b
        -0x4ad37def -> :sswitch_2
        -0x3f62d31b -> :sswitch_6
        -0x372b3a98 -> :sswitch_a
        -0x11bb63bd -> :sswitch_a
        -0x107437f8 -> :sswitch_8
        -0x89c563e -> :sswitch_1
        -0x7067d98 -> :sswitch_b
        0x1800958 -> :sswitch_1
        0xdfbf7d0 -> :sswitch_6
        0x14745052 -> :sswitch_7
        0x1900ac1f -> :sswitch_c
        0x24e3a5fd -> :sswitch_4
        0x270291c5 -> :sswitch_3
        0x2a4ff9f6 -> :sswitch_3
        0x2edfb64b -> :sswitch_9
        0x379f4fd7 -> :sswitch_7
        0x394ccefd -> :sswitch_d
        0x45f22458 -> :sswitch_5
        0x56c832aa -> :sswitch_0
        0x617269d1 -> :sswitch_e
        0x6a655f79 -> :sswitch_0
    .end sparse-switch
.end method
