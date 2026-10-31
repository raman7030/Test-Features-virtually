.class public final synthetic Ll/ۚۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7b594adb

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v5, "\u1a73\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x265d

    const v7, -0x362f51f1

    xor-int/2addr v6, v7

    const v7, 0x7161cd69

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x69c9

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 578
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_6

    goto/16 :goto_3

    .line 1023
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v5, :cond_9

    goto/16 :goto_4

    .line 1274
    :sswitch_1
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v5, :cond_b

    goto/16 :goto_2

    .line 2151
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v5

    if-lez v5, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_3

    .line 1218
    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return p1

    .line 6
    :sswitch_5
    sget p1, Ll/֫᩵᩷;->ۛۧ:I

    .line 2274
    iget-object p1, v0, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    iget-object p2, v1, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/ۙᩴ᩷;

    .line 1487
    sget-boolean v5, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06d8\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4e8f

    const v7, -0x6e7d80d2

    xor-int/2addr v6, v7

    const v7, -0x457c409c

    goto :goto_0

    :sswitch_7
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_1

    :goto_1
    const-string v5, "\u06db\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6ab9

    const v7, 0x3cc93e92

    xor-int/2addr v6, v7

    const v7, -0x57f53a2e

    goto :goto_0

    :cond_1
    const-string v5, "\u0730\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3931

    const v7, 0x354b995a

    xor-int/2addr v6, v7

    const v7, -0x79badba4

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v5, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v5, :cond_3

    :cond_2
    :goto_2
    const-string v5, "\u073d\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x242d

    const v7, 0x28c2eae9

    xor-int/2addr v6, v7

    const v7, 0x62933aaf

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u1a77\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x189b

    const v7, 0x3b12a966

    xor-int/2addr v6, v7

    const v7, 0x12f70c20

    goto/16 :goto_0

    .line 229
    :sswitch_9
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06dc\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1383

    const v7, 0x3078372c

    xor-int/2addr v6, v7

    const v7, -0x63ac6c3e    # -7.0005016E-22f

    goto/16 :goto_0

    .line 1200
    :sswitch_a
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u0730\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa6f

    const v7, -0x286652a1

    xor-int/2addr v6, v7

    const v7, 0x511ad8a3

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06da\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1ad9

    const v7, -0x4dbccfce

    xor-int/2addr v6, v7

    const v7, -0x4e21e7f1

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_7

    :goto_3
    const-string v5, "\u05ab\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x578d

    const v7, 0x45dcdf24

    xor-int/2addr v6, v7

    const v7, -0x23cf3b08

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d7\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2477

    const v7, 0x6ee6e9d8

    xor-int/2addr v6, v7

    const v7, 0x7a555004

    goto/16 :goto_0

    .line 471
    :sswitch_c
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u0736\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x73b1

    const v7, 0x2ae6a78b

    xor-int/2addr v6, v7

    const v7, -0x27da12e

    goto/16 :goto_0

    .line 646
    :sswitch_d
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    const-string v5, "\u06e7\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6e7

    const v7, 0x30c51196

    xor-int/2addr v6, v7

    const v7, -0x7818e9bf

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e2\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x10c5

    const v7, 0x4c31da04    # 4.6622736E7f

    xor-int/2addr v6, v7

    const v7, 0x1527fc44

    goto/16 :goto_0

    .line 1765
    :sswitch_e
    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a7a\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x163d

    const v7, 0x5742aa66

    xor-int/2addr v6, v7

    const v7, -0x7073d764

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d9\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xc6b

    const v7, 0x6e736e86

    xor-int/2addr v6, v7

    const v7, 0x641c9122    # 1.15526E22f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7323271e -> :sswitch_c
        -0x6feac337 -> :sswitch_2
        -0x68cbb8e8 -> :sswitch_7
        -0x5f581d57 -> :sswitch_8
        -0x5c74023e -> :sswitch_e
        -0x525e2900 -> :sswitch_2
        -0x474c5b30 -> :sswitch_1
        -0x42682cfc -> :sswitch_a
        -0x371e3eff -> :sswitch_9
        -0x2c421b3c -> :sswitch_b
        -0x25d7be9a -> :sswitch_7
        -0x2023f975 -> :sswitch_d
        -0x1766835e -> :sswitch_e
        -0xd4c5bce -> :sswitch_a
        0xb8e3e34 -> :sswitch_c
        0x129e9656 -> :sswitch_4
        0x1c60542c -> :sswitch_9
        0x1e37e82f -> :sswitch_0
        0x1fbe3e47 -> :sswitch_6
        0x31738e1b -> :sswitch_8
        0x328e366d -> :sswitch_3
        0x3dbe0d7d -> :sswitch_3
        0x45aba2dd -> :sswitch_0
        0x45cb8da3 -> :sswitch_4
        0x4b5f106d -> :sswitch_d
        0x571688b5 -> :sswitch_b
        0x5722edf6 -> :sswitch_5
        0x59cfc9cb -> :sswitch_5
        0x5ab005e6 -> :sswitch_6
        0x6a464369 -> :sswitch_1
    .end sparse-switch
.end method
