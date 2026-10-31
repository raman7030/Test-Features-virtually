.class public final synthetic Ll/᩸ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, 0x21083944

    sget v2, Ll/֡۬;->۠֡᩶:I

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x45cd

    const v6, 0xb20a32b

    xor-int/2addr v5, v6

    const v6, 0xa9c611a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x51b7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2039
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    .line 1784
    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v4, :cond_b

    goto/16 :goto_1

    :sswitch_1
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v4, :cond_8

    goto/16 :goto_1

    .line 984
    :sswitch_2
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v4, :cond_4

    goto/16 :goto_4

    .line 893
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2283
    :sswitch_5
    iget-object p1, v0, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    neg-long v0, v0

    return-wide v0

    .line 4
    :sswitch_6
    sget v4, Ll/֫᩵᩷;->ۛۧ:I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06e7\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3791

    const v6, -0x220513cb

    xor-int/2addr v5, v6

    const v6, -0x3bbe36cd

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    .line 1381
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06d6\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6355

    const v6, 0x491be58c    # 638552.75f

    xor-int/2addr v5, v6

    const v6, -0x2503d77a

    goto :goto_0

    .line 288
    :sswitch_8
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e8\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xfcd

    const v6, 0x5da955fd

    xor-int/2addr v5, v6

    const v6, -0x49f97c9

    goto/16 :goto_0

    .line 1053
    :sswitch_9
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a76\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7645

    const v6, 0x10c3eb16

    xor-int/2addr v5, v6

    const v6, -0x5cb25a80

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u06e2\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x535

    const v6, 0x1a707fc

    xor-int/2addr v5, v6

    const v6, 0x4917a1c8    # 621084.5f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7741

    const v6, 0x2ecf3bdf

    xor-int/2addr v5, v6

    const v6, -0x65484c39

    goto/16 :goto_0

    .line 881
    :sswitch_b
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u0733\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x57b9

    const v6, 0x2ca66d18

    xor-int/2addr v5, v6

    const v6, -0x3088f5b

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d8\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ab9

    const v6, -0x71f1c774

    xor-int/2addr v5, v6

    const v6, 0x3676e17f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e1\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4459

    const v6, 0x65400d61

    xor-int/2addr v5, v6

    const v6, -0x6d40f0f3

    goto/16 :goto_0

    .line 2228
    :sswitch_c
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v4

    if-gtz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u0730\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2735

    const v6, 0x3d6b04dd

    xor-int/2addr v5, v6

    const v6, 0x295d0e3a

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x790f

    const v6, -0x421db6a4

    xor-int/2addr v5, v6

    const v6, 0x56521e77

    goto/16 :goto_0

    .line 764
    :sswitch_d
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_a

    :goto_4
    const-string v4, "\u1a76\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x305f

    const v6, 0x22dca78d

    xor-int/2addr v5, v6

    const v6, -0x985d11a

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2b09

    const v6, 0x5e79a792

    xor-int/2addr v5, v6

    const v6, 0x6672cc18

    goto/16 :goto_0

    .line 8
    :sswitch_e
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    const-string v4, "\u0733\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3371

    const v6, -0x7f384318

    xor-int/2addr v5, v6

    const v6, -0x7111969c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05ab\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4d4f

    const v6, -0x2e1896b4

    xor-int/2addr v5, v6

    const v6, 0x6cbc0a0b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b19a8d9 -> :sswitch_9
        -0x7a9adf1c -> :sswitch_7
        -0x78a610ed -> :sswitch_a
        -0x77a11e15 -> :sswitch_b
        -0x6f74b938 -> :sswitch_d
        -0x5bdb50c9 -> :sswitch_5
        -0x4d316604 -> :sswitch_c
        -0x3de84deb -> :sswitch_6
        -0x2c35cf92 -> :sswitch_e
        -0x2a2a0295 -> :sswitch_8
        -0x1c742459 -> :sswitch_7
        -0x9d9a933 -> :sswitch_1
        -0x7632180 -> :sswitch_6
        0xa1cb98a -> :sswitch_8
        0xc0be869 -> :sswitch_b
        0x1c1ef6c7 -> :sswitch_d
        0x1d17b579 -> :sswitch_5
        0x2e9d7972 -> :sswitch_a
        0x2f2f99e4 -> :sswitch_4
        0x37aa3479 -> :sswitch_1
        0x3cef6b6d -> :sswitch_0
        0x3d743c0a -> :sswitch_e
        0x4191dc8a -> :sswitch_4
        0x436416c0 -> :sswitch_2
        0x43e1e533 -> :sswitch_9
        0x51fc0d11 -> :sswitch_3
        0x5bc84791 -> :sswitch_2
        0x5e56821a -> :sswitch_0
        0x62683ad8 -> :sswitch_3
        0x7e995534 -> :sswitch_c
    .end sparse-switch
.end method
