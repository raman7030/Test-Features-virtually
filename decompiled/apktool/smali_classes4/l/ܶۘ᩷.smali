.class public final synthetic Ll/ܶۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1a84042f

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v4, "\u1a79\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4721

    const v6, -0x1bd7343a

    xor-int/2addr v5, v6

    const v6, -0x6d87acb2

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x43a3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_a

    goto/16 :goto_4

    .line 2208
    :sswitch_0
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-nez v4, :cond_4

    goto/16 :goto_4

    .line 1574
    :sswitch_1
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-gez v4, :cond_b

    goto/16 :goto_3

    .line 1913
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v4, :cond_8

    goto/16 :goto_4

    .line 500
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2280
    :sswitch_5
    iget-object p1, v0, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    .line 2258
    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    neg-long v0, v0

    return-wide v0

    .line 4
    :sswitch_6
    sget v4, Ll/֫᩵᩷;->ۛۧ:I

    .line 1254
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u1a76\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3f0b

    const v6, -0x3b165466

    xor-int/2addr v5, v6

    const v6, 0x703196fb

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06d7\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1141

    const v6, -0x25e770b9

    xor-int/2addr v5, v6

    const v6, -0x16a0c8f0

    goto :goto_0

    .line 929
    :sswitch_8
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x416f

    const v6, -0x62532efe

    xor-int/2addr v5, v6

    const v6, -0x36118fdd

    goto/16 :goto_0

    .line 670
    :sswitch_9
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_3

    :goto_1
    const-string v4, "\u1a73\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2447

    const v6, 0x2b9ced6a

    xor-int/2addr v5, v6

    const v6, 0x50fa7d6c

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4651

    const v6, -0x331caaff

    xor-int/2addr v5, v6

    const v6, -0x5672fa9a

    goto/16 :goto_0

    .line 721
    :sswitch_a
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x10ab

    const v6, -0xdde913a

    xor-int/2addr v5, v6

    const v6, 0x5d9ba689

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d6\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6701

    const v6, -0x55e42af6

    xor-int/2addr v5, v6

    const v6, 0x4ba372df    # 2.142355E7f

    goto/16 :goto_0

    .line 2270
    :sswitch_b
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u1a76\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7f15

    const v6, 0x2ce10453

    xor-int/2addr v5, v6

    const v6, -0x3bbb8782

    goto/16 :goto_0

    .line 1720
    :sswitch_c
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_7

    goto :goto_5

    :cond_7
    const-string v4, "\u1a76\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2dcf

    const v6, -0x1142a2d4

    xor-int/2addr v5, v6

    const v6, 0x5bd0d61c

    goto/16 :goto_0

    .line 1948
    :sswitch_d
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5fb9

    const v6, -0x6ad2ad12

    xor-int/2addr v5, v6

    const v6, -0x56f10ac1

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e7\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2acf

    const v6, -0x66ebf617

    xor-int/2addr v5, v6

    const v6, 0x1358493c

    goto/16 :goto_0

    :goto_4
    const-string v4, "\u06da\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2055

    const v6, -0x58bf600b

    xor-int/2addr v5, v6

    const v6, 0x46e0f139

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7bd3

    const v6, -0x32f22bc3

    xor-int/2addr v5, v6

    const v6, 0x46209709

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06dc\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xe69

    const v6, -0x48feeb9c

    xor-int/2addr v5, v6

    const v6, 0x47c2e0f6

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d7\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x412b

    const v6, -0x53b55a29

    xor-int/2addr v5, v6

    const v6, -0x4a5ce837

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec934c8 -> :sswitch_4
        -0x7c7fb91a -> :sswitch_0
        -0x784c8f48 -> :sswitch_3
        -0x783a3f01 -> :sswitch_2
        -0x70259af9 -> :sswitch_0
        -0x67eb9d33 -> :sswitch_8
        -0x62e2d84d -> :sswitch_b
        -0x603a562a -> :sswitch_9
        -0x5852e067 -> :sswitch_e
        -0x381d73f9 -> :sswitch_6
        -0x325bcdd8 -> :sswitch_5
        -0x2f742c20 -> :sswitch_e
        -0x2ac5d70e -> :sswitch_2
        -0x21428c97 -> :sswitch_1
        -0x1c8eaaf2 -> :sswitch_1
        -0x15cbf00d -> :sswitch_a
        -0x1044bee2 -> :sswitch_7
        -0x51d7aac -> :sswitch_6
        0x14508027 -> :sswitch_d
        0x18fd7fc5 -> :sswitch_c
        0x24783bb2 -> :sswitch_4
        0x3512188a -> :sswitch_a
        0x489a11fe -> :sswitch_7
        0x52090a25 -> :sswitch_5
        0x61250bca -> :sswitch_3
        0x689d4346 -> :sswitch_d
        0x74275cc4 -> :sswitch_9
        0x756e8c97 -> :sswitch_b
        0x76aea26e -> :sswitch_8
        0x7d1fad0d -> :sswitch_c
    .end sparse-switch
.end method
