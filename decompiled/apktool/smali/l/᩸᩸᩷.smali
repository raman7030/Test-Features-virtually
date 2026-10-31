.class public final synthetic Ll/᩸᩸᩷;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ll/֫᩹᩵;


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const v8, -0x397d8cb8

    sget v9, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v10, Ll/ۨ;->᩺᩷ۚ:I

    const-string v11, "\u06e4\u06ec"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x43

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7025

    const v13, 0x153794c3

    xor-int/2addr v12, v13

    const v13, -0x1a6d307e

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, -0x1709

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 63
    invoke-virtual {v0, v6, v7}, Ll/ᩳ۟᩵;->֫(J)V

    .line 9
    sget v11, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v11, :cond_2

    goto :goto_1

    .line 40
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v11, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v11, :cond_9

    goto :goto_1

    :sswitch_1
    sget v11, Ll/۠;->ܺܺܶ:I

    if-gez v11, :cond_b

    goto :goto_1

    .line 6
    :sswitch_2
    sget v11, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v11, :cond_1

    goto/16 :goto_3

    .line 66
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_3

    .line 46
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    const/4 v0, 0x0

    return-object v0

    .line 64
    :sswitch_5
    new-instance v11, Ll/ۛۚ᩷;

    .line 4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v12

    if-nez v12, :cond_0

    goto :goto_1

    .line 14
    :cond_0
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {v0, v11}, Ll/ᩳ۟᩵;->֫(Ll/᩺ܰ᩵;)V

    .line 67
    invoke-virtual {v0}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_1
    const-string v11, "\u06e0\u06e4"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0xd

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x36ad

    const v13, 0xabf3fb3

    xor-int/2addr v12, v13

    const v13, -0x1f9f88e3

    goto :goto_0

    :cond_2
    const-string v11, "\u06da\u1a73"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x52bf

    const v13, -0x711a0165

    xor-int/2addr v12, v13

    const v13, -0x6bec0fe7

    goto :goto_0

    .line 62
    :sswitch_6
    invoke-virtual {v0, v4, v5, v1}, Ll/ᩳ۟᩵;->ۧ(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v6, 0x19

    .line 58
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v11

    if-ltz v11, :cond_3

    goto :goto_2

    :cond_3
    const-string v11, "\u06d9\u0733"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x15

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x71d

    const v13, 0x46987915

    xor-int/2addr v12, v13

    const v13, -0x40e491c2

    goto/16 :goto_0

    :sswitch_7
    const-wide/16 v4, 0xf

    .line 38
    sget v11, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v11, :cond_4

    goto :goto_2

    :cond_4
    const-string v11, "\u05a1\u1a79"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x15

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0xfd1

    const v13, -0x69833d1d

    xor-int/2addr v12, v13

    const v13, -0xe2ac9bd

    goto/16 :goto_0

    .line 60
    :sswitch_8
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)V

    .line 61
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->ܽ(JLjava/util/concurrent/TimeUnit;)V

    .line 6
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_5

    :goto_2
    const-string v11, "\u1a73\u073d"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x782f

    const v13, 0x27931332

    xor-int/2addr v12, v13

    const v13, 0x57ccb4b7

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u06d6\u0736"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x1d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x718b

    const v13, -0x4c67507c

    xor-int/2addr v12, v13

    const v13, 0x4aa490f5    # 5392506.5f

    goto/16 :goto_0

    :sswitch_9
    const-wide/16 v2, 0xa

    .line 17
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v11

    if-ltz v11, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v11, "\u1a7a\u06d9"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3921

    const v13, 0x76b07089

    xor-int/2addr v12, v13

    const v13, 0x52d43e88

    goto/16 :goto_0

    .line 60
    :sswitch_a
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v11

    if-nez v11, :cond_7

    :goto_3
    const-string v11, "\u06d8\u06d6"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x11cb

    const v13, -0x2de76794

    xor-int/2addr v12, v13

    const v13, -0x6b9a437

    goto/16 :goto_0

    :cond_7
    const-string v11, "\u06e0\u0736"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x39

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6a7d

    const v13, -0x6ca02c6c

    xor-int/2addr v12, v13

    const v13, 0x7c2c1984

    goto/16 :goto_0

    :sswitch_b
    sget v11, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v11, :cond_8

    goto :goto_4

    :cond_8
    const-string v11, "\u06e4\u06db"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x2b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3d41

    const v13, 0x780a72e4

    xor-int/2addr v12, v13

    const v13, -0x3562e6e0    # -5147792.0f

    goto/16 :goto_0

    .line 12
    :sswitch_c
    sget-boolean v11, Ll/֨۫;->۬᩷᩶:Z

    if-nez v11, :cond_a

    :cond_9
    const-string v11, "\u073d\u06e2"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0xf7f

    const v13, 0x20c05fcc

    xor-int/2addr v12, v13

    const v13, -0x3609c5c6

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06eb\u06e7"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0xb

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x191f

    const v13, -0x58a87b0c

    xor-int/2addr v12, v13

    const v13, 0x50a2e26e

    goto/16 :goto_0

    .line 59
    :sswitch_d
    invoke-static {}, Ll/۠ۛۡ;->֫()Ll/ᩳ۟᩵;

    move-result-object v0

    .line 50
    sget v11, Ll/ۛ;->᩺᩻֫:I

    if-ltz v11, :cond_c

    :cond_b
    :goto_4
    const-string v11, "\u06dc\u06d9"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x17

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x409f

    const v13, 0x61f30de

    xor-int/2addr v12, v13

    const v13, 0x3143097a

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u0733\u1a7a"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x79

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4173

    const v13, -0x3fc5995f

    xor-int/2addr v12, v13

    const v13, -0x2dcc978b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c20721d -> :sswitch_d
        -0x7c1a575f -> :sswitch_0
        -0x7902ddd5 -> :sswitch_8
        -0x6fe81548 -> :sswitch_b
        -0x6c5db0af -> :sswitch_d
        -0x69af62a9 -> :sswitch_6
        -0x4fa88c5c -> :sswitch_a
        -0x3f871836 -> :sswitch_1
        -0x3e9e37e5 -> :sswitch_2
        -0x86531bf -> :sswitch_7
        -0x394506f -> :sswitch_9
        0xda26c02 -> :sswitch_7
        0x112592f8 -> :sswitch_a
        0x16d58b7c -> :sswitch_1
        0x22b74b33 -> :sswitch_c
        0x2665d734 -> :sswitch_4
        0x392632bd -> :sswitch_b
        0x3ee19540 -> :sswitch_3
        0x403939fc -> :sswitch_5
        0x41bfd206 -> :sswitch_9
        0x46bc6c02 -> :sswitch_8
        0x4b5fb910 -> :sswitch_3
        0x50ab7d1b -> :sswitch_2
        0x6046c001 -> :sswitch_5
        0x658fa0c8 -> :sswitch_c
        0x6e91b3ad -> :sswitch_4
        0x76fb588d -> :sswitch_6
        0x7debca48 -> :sswitch_0
    .end sparse-switch
.end method
