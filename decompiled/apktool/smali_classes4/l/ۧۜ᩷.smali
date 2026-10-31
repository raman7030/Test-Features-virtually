.class public final Ll/ۧۜ᩷;
.super Ljava/lang/Object;
.source "K3YN"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$List$Item;


# instance fields
.field public ֫:Ll/֫ۜ᩷;

.field public ۧ:Ljava/lang/CharSequence;

.field public ܽ:Ljava/lang/CharSequence;

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 6

    const v0, -0x53548ac0

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5647

    const v5, 0xdf3ab5

    xor-int/2addr v4, v5

    const v5, 0x1ce80c53

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5e75

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 16
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_3

    goto/16 :goto_5

    .line 25
    :sswitch_0
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v3, :cond_9

    goto :goto_1

    .line 20
    :sswitch_1
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v3

    if-gtz v3, :cond_b

    goto/16 :goto_3

    .line 18
    :sswitch_3
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 p1, 0x0

    return-object p1

    .line 30
    :sswitch_5
    iget-object v0, p0, Ll/ۧۜ᩷;->֫:Ll/֫ۜ᩷;

    invoke-virtual {v0, p1, p2}, Ll/֫ۜ᩷;->addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;

    move-result-object p1

    return-object p1

    :sswitch_6
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06da\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x66b5

    const v5, 0x65c75f9b

    xor-int/2addr v4, v5

    const v5, -0x785b3f01

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v3

    if-gtz v3, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x23a5

    const v5, 0x775eda4d    # 4.5199905E33f

    xor-int/2addr v4, v5

    const v5, 0x2fb02311

    goto :goto_0

    :cond_2
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x77cd

    const v5, 0x732efe84

    xor-int/2addr v4, v5

    const v5, 0x1eeb6169

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d9\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x989

    const v5, -0x6ce389fd

    xor-int/2addr v4, v5

    const v5, -0x18159640    # -2.213969E24f

    goto/16 :goto_0

    .line 9
    :sswitch_8
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u073d\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e25

    const v5, -0x971669e

    xor-int/2addr v4, v5

    const v5, 0x4ab804c6    # 6029923.0f

    goto/16 :goto_0

    .line 22
    :sswitch_9
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1cf7

    const v5, -0x85afa30

    xor-int/2addr v4, v5

    const v5, 0x51dcf4bc

    goto/16 :goto_0

    .line 11
    :sswitch_a
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_6

    :goto_2
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e0d

    const v5, 0x635b6e88

    xor-int/2addr v4, v5

    const v5, -0x1471a0e5

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a74\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x240d

    const v5, 0x1729258f

    xor-int/2addr v4, v5

    const v5, -0x6ff42560

    goto/16 :goto_0

    .line 24
    :sswitch_b
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7f37

    const v5, 0x73a49278

    xor-int/2addr v4, v5

    const v5, 0x2af5f3ba

    goto/16 :goto_0

    .line 25
    :sswitch_c
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6073

    const v5, -0x69ecf929

    xor-int/2addr v4, v5

    const v5, 0x1cf15c2d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6423

    const v5, -0x4f9eeea0

    xor-int/2addr v4, v5

    const v5, -0x44f346fc

    goto/16 :goto_0

    .line 27
    :sswitch_d
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4865

    const v5, -0x2c1cc292

    xor-int/2addr v4, v5

    const v5, -0x34190449    # -3.0275438E7f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5307

    const v5, 0x201e9ae8

    xor-int/2addr v4, v5

    const v5, 0x60402e55

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06df\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b45

    const v5, 0x825b70a

    xor-int/2addr v4, v5

    const v5, -0x2c90ece

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d21

    const v5, -0x22cd0e7f

    xor-int/2addr v4, v5

    const v5, -0x590f99d8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x63482f10 -> :sswitch_a
        -0x4f251ed0 -> :sswitch_4
        -0x41ace6f0 -> :sswitch_2
        -0x3fc00815 -> :sswitch_8
        -0x3cbbe7b2 -> :sswitch_e
        -0x33ee7510 -> :sswitch_5
        -0x26ea5503 -> :sswitch_c
        -0x246f793f -> :sswitch_7
        -0xdad1d1b -> :sswitch_5
        -0xcb5f13c -> :sswitch_6
        -0x365d1f8 -> :sswitch_2
        -0x278a9d -> :sswitch_0
        0x112ed5b -> :sswitch_6
        0xd4f1cc3 -> :sswitch_d
        0x11a0f1f7 -> :sswitch_1
        0x13450144 -> :sswitch_3
        0x16b9806b -> :sswitch_0
        0x17c3328d -> :sswitch_9
        0x1cc4f91a -> :sswitch_8
        0x22df5297 -> :sswitch_1
        0x2aef89fc -> :sswitch_b
        0x3ceea6ac -> :sswitch_4
        0x49a87f53 -> :sswitch_c
        0x4b52d510 -> :sswitch_d
        0x4d847f3b -> :sswitch_7
        0x68170b74 -> :sswitch_b
        0x6cd5f5cf -> :sswitch_3
        0x6f5ac8b2 -> :sswitch_e
        0x78113f87 -> :sswitch_a
        0x7da96816 -> :sswitch_9
    .end sparse-switch
.end method

.method public final summary(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 0

    .line 24
    iput-object p1, p0, Ll/ۧۜ᩷;->ܽ:Ljava/lang/CharSequence;

    return-object p0
.end method
