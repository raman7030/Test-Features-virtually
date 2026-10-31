.class public final synthetic Ll/ۖ֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/᩻ᩴ;


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    const p1, 0x4c4c73cc    # 5.3595952E7f

    sget v0, Ll/ۗ᩵;->֫۠۟:I

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v2, "\u073d\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x79

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3a6f

    const v4, -0x138789a

    xor-int/2addr v3, v4

    const v4, -0x54f89f8d

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x3c6f

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 2
    sget v2, Lbin/mt/plus/Main;->ܿܽ:I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "\u1a7a\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x511

    const v4, 0x13813394

    xor-int/2addr v3, v4

    const v4, 0x7ad05842

    goto :goto_0

    .line 166
    :sswitch_0
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v2, :cond_7

    goto/16 :goto_1

    .line 629
    :sswitch_1
    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v2, :cond_5

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 p1, 0x0

    return p1

    .line 1006
    :sswitch_5
    invoke-static {}, Ll/ܶ۠ۢ;->ܳ()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v2, "\u05ab\u06eb"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x623b

    const v4, 0x233ae11a

    xor-int/2addr v3, v4

    const v4, -0x17fda8d0

    goto :goto_0

    .line 288
    :sswitch_6
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v2, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v2, "\u06e8\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6a2d

    const v4, 0x7d2a92be

    xor-int/2addr v3, v4

    const v4, 0x34524316

    goto :goto_0

    .line 773
    :sswitch_7
    sget v2, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v2, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v2, "\u06eb\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2263

    const v4, -0x212bbcd3

    xor-int/2addr v3, v4

    const v4, 0x475d3709

    goto/16 :goto_0

    :sswitch_8
    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v2, "\u0730\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x71

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x6763

    const v4, 0x47296b4a

    xor-int/2addr v3, v4

    const v4, 0x5ccbe38b

    goto/16 :goto_0

    :sswitch_9
    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v2, "\u06db\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x5

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4b57

    const v4, 0x9155e58

    xor-int/2addr v3, v4

    const v4, 0x67f9ed4f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v2

    if-gtz v2, :cond_6

    :cond_5
    const-string v2, "\u1a74\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x71

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2459

    const v4, 0x4247185f

    xor-int/2addr v3, v4

    const v4, -0x73e62224

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u0730\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x13

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5425

    const v4, -0x1850571b

    xor-int/2addr v3, v4

    const v4, 0x70c12ce6

    goto/16 :goto_0

    .line 280
    :sswitch_b
    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v2, :cond_8

    :cond_7
    const-string v2, "\u05ab\u06da"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x55

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6eef

    const v4, 0x42a39960

    xor-int/2addr v3, v4

    const v4, -0x53e9dbaa

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e7\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x624b

    const v4, 0x5abbcc21

    xor-int/2addr v3, v4

    const v4, -0x19d9a094

    goto/16 :goto_0

    .line 292
    :sswitch_c
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v2

    if-eqz v2, :cond_9

    :goto_1
    const-string v2, "\u06e7\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7e83

    const v4, 0x7b4c5e77

    xor-int/2addr v3, v4

    const v4, -0x352751c5    # -7100189.5f

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u1a77\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x450d

    const v4, -0x8b19933

    xor-int/2addr v3, v4

    const v4, 0x65a23965

    goto/16 :goto_0

    .line 532
    :sswitch_d
    sget-boolean v2, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v2, :cond_a

    goto :goto_2

    :cond_a
    const-string v2, "\u1a77\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2ccf

    const v4, 0x59a62ee9

    xor-int/2addr v3, v4

    const v4, -0x466712fc

    goto/16 :goto_0

    .line 309
    :sswitch_e
    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v2, :cond_c

    :cond_b
    :goto_2
    const-string v2, "\u1a79\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x33

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2215

    const v4, 0x7b4cf3e8

    xor-int/2addr v3, v4

    const v4, -0x3427ca37    # -2.833909E7f

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06d8\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x19

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0xdf5

    const v4, -0x2266b225

    xor-int/2addr v3, v4

    const v4, 0x2f40fee9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f4bf8fd -> :sswitch_3
        -0x57e72852 -> :sswitch_d
        -0x563609a3 -> :sswitch_e
        -0x55004d02 -> :sswitch_1
        -0x4dea39ef -> :sswitch_4
        -0x49efc956 -> :sswitch_2
        -0x2d5ee157 -> :sswitch_7
        -0x1c5e6af7 -> :sswitch_8
        -0x1726f8b9 -> :sswitch_b
        -0xdb64e8f -> :sswitch_6
        -0xb8037c8 -> :sswitch_5
        -0x854994c -> :sswitch_0
        -0x8494c9e -> :sswitch_0
        -0x36b40d3 -> :sswitch_3
        -0x72b8c8 -> :sswitch_d
        0xb0e373 -> :sswitch_9
        0x38b4df4 -> :sswitch_b
        0xc8f8d8f -> :sswitch_c
        0xf9c0e1e -> :sswitch_1
        0x17c303cf -> :sswitch_6
        0x27becc6d -> :sswitch_2
        0x2b0c3dce -> :sswitch_a
        0x2e1a4dfa -> :sswitch_9
        0x5332f42a -> :sswitch_a
        0x5b5a45a2 -> :sswitch_8
        0x63404e3d -> :sswitch_7
        0x657ae4f9 -> :sswitch_5
        0x6d406524 -> :sswitch_c
        0x752598b1 -> :sswitch_e
        0x7fcc2e89 -> :sswitch_4
    .end sparse-switch
.end method
