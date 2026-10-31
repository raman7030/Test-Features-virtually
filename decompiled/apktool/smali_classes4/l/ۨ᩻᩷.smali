.class public final Ll/ۨ᩻᩷;
.super Ll/۟᩻᩷;
.source "G3YB"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$Header;


# virtual methods
.method public final enable(Z)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 0

    .line 50
    iput-boolean p1, p0, Ll/۟᩻᩷;->֫:Z

    return-object p0
.end method

.method public final visible(Z)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 0

    .line 44
    iput-boolean p1, p0, Ll/۟᩻᩷;->᩻:Z

    return-object p0
.end method

.method public final ֫()Ll/ܰ᩻᩷;
    .locals 1

    .line 27
    sget-object v0, Ll/ܰ᩻᩷;->᩹:Ll/ܰ᩻᩷;

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/LocalString;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0xfba9eec

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v4, "\u0733\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5bd1

    const v6, -0x3a85b4b6

    xor-int/2addr v5, v6

    const v6, -0x1f23360f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4afb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_c

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :sswitch_1
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_b

    goto/16 :goto_4

    .line 14
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_4

    .line 20
    :sswitch_4
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    return-void

    .line 32
    :sswitch_5
    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 33
    invoke-static {p1, v4}, Ll/᩶᩻᩷;->֫(Lbin/mt/plugin/api/LocalString;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    goto :goto_1

    :sswitch_6
    return-void

    .line 32
    :sswitch_7
    iget-object v0, p0, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v4, "\u06db\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3513

    const v6, 0x16ed563d

    xor-int/2addr v5, v6

    const v6, 0x25c1d765

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u1a7a\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x26c5

    const v6, -0x78153c19

    xor-int/2addr v5, v6

    const v6, 0x380e5b01

    goto :goto_0

    .line 1
    :sswitch_8
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u0736\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2405

    const v6, -0x35e32040    # -2570224.0f

    xor-int/2addr v5, v6

    const v6, -0x4ce53ff5

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06db\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4587

    const v6, 0x54f213ca

    xor-int/2addr v5, v6

    const v6, 0x25c759b7

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a73\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x568f

    const v6, 0x5ea6e78

    xor-int/2addr v5, v6

    const v6, -0x6484ad98

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v4

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u05ab\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7df5

    const v6, -0x49591cee

    xor-int/2addr v5, v6

    const v6, -0x593c5bd6

    goto/16 :goto_0

    .line 8
    :sswitch_c
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_6

    :cond_5
    const-string v4, "\u06e7\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3ff

    const v6, -0xcc12854

    xor-int/2addr v5, v6

    const v6, -0xb06bf0f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073f\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4ffb

    const v6, 0x458e70b4

    xor-int/2addr v5, v6

    const v6, 0x1181c035

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_8

    :cond_7
    const-string v4, "\u06e8\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6939

    const v6, -0x4b105e33

    xor-int/2addr v5, v6

    const v6, 0x6984017d

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a77\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7433

    const v6, -0x15db312d

    xor-int/2addr v5, v6

    const v6, -0x4e787faf

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_9

    :goto_2
    const-string v4, "\u05ab\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit8 v5, v5, 0x7

    const v6, -0x20d95ed4

    xor-int/2addr v5, v6

    const v6, 0x32f5fc6a

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073d\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4141

    const v6, -0x573a55cb

    xor-int/2addr v5, v6

    const v6, -0x195a8327

    goto/16 :goto_0

    .line 32
    :sswitch_f
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u05a1\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5821

    const v6, 0x1ffa4c36

    xor-int/2addr v5, v6

    const v6, -0x23cd5edb

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v4, "\u06da\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5617

    const v6, 0x4fc3ca4c

    xor-int/2addr v5, v6

    const v6, 0x7902be75

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1113

    const v6, -0x32916f46

    xor-int/2addr v5, v6

    const v6, 0x62e1abd2

    goto/16 :goto_0

    .line 26
    :sswitch_10
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_d

    :goto_4
    const-string v4, "\u06df\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x171f

    const v6, -0x37b2d2fa    # -210100.1f

    xor-int/2addr v5, v6

    const v6, -0xe22c41f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x67d

    const v6, -0x2c9a32e0

    xor-int/2addr v5, v6

    const v6, 0x69b55e50

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x62d82e78 -> :sswitch_9
        -0x5e8a320b -> :sswitch_2
        -0x5bc0caad -> :sswitch_f
        -0x59def96a -> :sswitch_2
        -0x57fa187c -> :sswitch_7
        -0x508fba6f -> :sswitch_c
        -0x4958746f -> :sswitch_3
        -0x3404a965 -> :sswitch_7
        -0x315d8e4c -> :sswitch_b
        -0x2f9c0a18 -> :sswitch_0
        -0x29d2fbaf -> :sswitch_6
        -0x1dbebd91 -> :sswitch_d
        -0x18b5499b -> :sswitch_e
        -0x151d29cf -> :sswitch_a
        -0x9ac7eff -> :sswitch_8
        -0x51da5c3 -> :sswitch_5
        -0x51b2b16 -> :sswitch_8
        0x1c0bdaa -> :sswitch_5
        0x3113fd1 -> :sswitch_e
        0x834defe -> :sswitch_c
        0xbc13a06 -> :sswitch_f
        0xca2e7d0 -> :sswitch_6
        0x198fa10e -> :sswitch_10
        0x2540971a -> :sswitch_1
        0x2fb3e406 -> :sswitch_9
        0x56858b14 -> :sswitch_d
        0x59f9e930 -> :sswitch_a
        0x5b17e5a4 -> :sswitch_4
        0x5c15c556 -> :sswitch_3
        0x669a45f7 -> :sswitch_b
        0x690c7cbc -> :sswitch_0
        0x6b0cea00 -> :sswitch_10
        0x72bc4098 -> :sswitch_4
        0x72eca15e -> :sswitch_1
    .end sparse-switch
.end method

.method public final ֫(Lbin/mt/plugin/api/PluginContext;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x13bcca44

    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v5, Ll/֡֡;->֫ۤܳ:I

    const-string v6, "\u06eb\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x76c3

    const v8, -0x1561b568

    xor-int/2addr v7, v8

    const v8, 0x3db8f485

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x1f7

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    const/4 v6, 0x0

    .line 171
    invoke-static {v2, v6}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_1

    const-string v6, "\u06da\u06d8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xce9

    const v8, -0x12f99f7d

    xor-int/2addr v7, v8

    const v8, -0x558fe2ff

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u06e0\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x59c9

    const v8, 0x6eb3f477

    xor-int/2addr v7, v8

    const v8, -0x3caecf4

    goto :goto_0

    :sswitch_1
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v6, :cond_a

    goto/16 :goto_5

    .line 82
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v6, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v6, :cond_c

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_3

    .line 136
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {p1, v2}, Ll/֨֫;->֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :sswitch_6
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_1

    const-string v6, "\u06d7\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x407d

    const v8, -0x3a0ac15

    xor-int/2addr v7, v8

    const v8, 0x362eb414

    goto/16 :goto_0

    .line 171
    :sswitch_7
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_1

    const-string v6, "\u1a77\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6ce3

    const v8, -0x3965256a

    xor-int/2addr v7, v8

    const v8, -0x4ac76ace

    goto/16 :goto_0

    .line 39
    :sswitch_8
    iput-object v1, p0, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    return-void

    :sswitch_9
    iget-object v0, p0, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 171
    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_1

    const-string v6, "\u06df\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2661

    const v8, -0x4387d689

    xor-int/2addr v7, v8

    const v8, 0x60aac16f

    goto/16 :goto_0

    :cond_1
    move-object v1, v0

    :goto_1
    const-string v6, "\u06eb\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a01

    const v8, 0x6f767579

    xor-int/2addr v7, v8

    const v8, -0x3bd263f1

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v6, "\u06da\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x65b3

    const v8, 0xb3f7546

    xor-int/2addr v7, v8

    const v8, 0x210f5fba

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u073f\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x663d

    const v8, 0x4e06c9e7    # 5.653447E8f

    xor-int/2addr v7, v8

    const v8, 0x4d68edd0    # 2.44243712E8f

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/۟;->ۗۤۛ:I

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u06e7\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x1b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xe89

    const v8, -0x39473a57

    xor-int/2addr v7, v8

    const v8, 0x72030dea

    goto/16 :goto_0

    .line 126
    :sswitch_d
    sget v6, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u073f\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6031

    const v8, -0x7bb4bddf

    xor-int/2addr v7, v8

    const v8, 0x545de149

    goto/16 :goto_0

    .line 99
    :sswitch_e
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_6

    goto :goto_2

    :cond_6
    const-string v6, "\u06df\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x698b

    const v8, -0x24bcf4f

    xor-int/2addr v7, v8

    const v8, -0x67e816ad

    goto/16 :goto_0

    .line 150
    :sswitch_f
    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_7

    :goto_2
    const-string v6, "\u06d6\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x36b9

    const v8, 0x6c973269

    xor-int/2addr v7, v8

    const v8, -0x41116295

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06e2\u1a75"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x116f

    const v8, -0x4bc41039

    xor-int/2addr v7, v8

    const v8, -0x30a9b904

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v6

    if-ltz v6, :cond_8

    :goto_3
    const-string v6, "\u1a78\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5513

    const v8, -0x54d38948

    xor-int/2addr v7, v8

    const v8, 0x59503efe

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a73\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3285

    const v8, 0x135171f2

    xor-int/2addr v7, v8

    const v8, -0x6ce7521c

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u06eb\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3e45

    const v8, 0x17ec94d

    xor-int/2addr v7, v8

    const v8, -0x49be289f

    goto/16 :goto_0

    .line 142
    :sswitch_12
    sget v6, Ll/᩺;->ۙۛܶ:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_4
    const-string v6, "\u06e7\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x24eb

    const v8, 0x1a0055bd

    xor-int/2addr v7, v8

    const v8, -0x23db4a8b

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a78\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x63

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6b4d

    const v8, -0x24c621e5

    xor-int/2addr v7, v8

    const v8, 0x6bbe3da8

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v6

    if-gtz v6, :cond_d

    :cond_c
    :goto_5
    const-string v6, "\u073a\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x50c5

    const v8, 0x2a2a54ac

    xor-int/2addr v7, v8

    const v8, 0x2cb512c8

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06eb\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1147

    const v8, 0x3ac4da3d

    xor-int/2addr v7, v8

    const v8, -0x6b45cbad

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d519ca8 -> :sswitch_b
        -0x73714468 -> :sswitch_d
        -0x702d5c8d -> :sswitch_9
        -0x62dcc8ed -> :sswitch_7
        -0x5af79e2e -> :sswitch_12
        -0x5707e5b5 -> :sswitch_c
        -0x52f4fd03 -> :sswitch_10
        -0x4e32e929 -> :sswitch_a
        -0x4a590fcd -> :sswitch_f
        -0x42857bc1 -> :sswitch_0
        -0x3ee2cb7d -> :sswitch_13
        -0x3b885783 -> :sswitch_4
        -0x374f25ef -> :sswitch_4
        -0x3574b8dd -> :sswitch_5
        -0x21ddf6b2 -> :sswitch_f
        -0x1b48b3ce -> :sswitch_c
        -0x10f23289 -> :sswitch_b
        -0xeb63d82 -> :sswitch_7
        -0xb40b0a9 -> :sswitch_0
        0x2698273 -> :sswitch_11
        0x3eb5389 -> :sswitch_a
        0x43d4938 -> :sswitch_11
        0x7a7d85c -> :sswitch_8
        0x1555f544 -> :sswitch_9
        0x1f07c410 -> :sswitch_e
        0x248fda21 -> :sswitch_1
        0x25d72b6e -> :sswitch_3
        0x27a2f8a3 -> :sswitch_10
        0x2f61211f -> :sswitch_5
        0x340a33b2 -> :sswitch_3
        0x38885c18 -> :sswitch_8
        0x3afaab40 -> :sswitch_2
        0x446cedab -> :sswitch_2
        0x4aed1260 -> :sswitch_6
        0x5ab48767 -> :sswitch_13
        0x5eb57605 -> :sswitch_e
        0x64b22ff1 -> :sswitch_d
        0x663b955e -> :sswitch_6
        0x681fd9f4 -> :sswitch_12
        0x76840740 -> :sswitch_1
    .end sparse-switch
.end method
