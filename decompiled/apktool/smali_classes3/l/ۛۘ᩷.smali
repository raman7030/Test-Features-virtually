.class public final synthetic Ll/ۛۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

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
    .locals 6

    const v0, -0x49179c8f

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v2, Ll/ۛ;->᩺᩻֫:I

    const-string v3, "\u05ab\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x283f

    const v5, 0x48f58919

    xor-int/2addr v4, v5

    const v5, -0x3d6256a2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x52b1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_a

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-lez v3, :cond_8

    goto :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-gez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x38f3

    const v5, -0x7d50c5a9

    xor-int/2addr v4, v5

    const v5, -0x16013047

    goto :goto_0

    .line 2
    :sswitch_2
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    :goto_1
    const-string v3, "\u0733\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2351

    const v5, -0x2619e412

    xor-int/2addr v4, v5

    const v5, -0x2ccc44b0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    new-instance v3, Ll/ۤᩴ᩷;

    .line 4
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    .line 0
    :cond_2
    check-cast p1, Ll/ۙᩴ᩷;

    invoke-direct {v3, p1}, Ll/ۤᩴ᩷;-><init>(Ll/ۙᩴ᩷;)V

    return-object v3

    :sswitch_6
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2387

    const v5, -0x1ca35df7

    xor-int/2addr v4, v5

    const v5, -0x7cc41685

    goto/16 :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06e4\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x626b

    const v5, 0x48fe1fb7

    xor-int/2addr v4, v5

    const v5, 0x360d48ac

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06e0\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x65a9

    const v5, 0x5374620e

    xor-int/2addr v4, v5

    const v5, 0x4ce131ec    # 1.1806704E8f

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b99

    const v5, 0x7dca3b91

    xor-int/2addr v4, v5

    const v5, 0x3917c617

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x525b

    const v5, 0x55d0c84a

    xor-int/2addr v4, v5

    const v5, 0x3f1a7505

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    const-string v3, "\u06da\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e99

    const v5, 0x6d2eece8

    xor-int/2addr v4, v5

    const v5, -0x206264aa

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e8\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5bc3

    const v5, -0x656de6a2

    xor-int/2addr v4, v5

    const v5, -0x52edabf2

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c27

    const v5, -0x19a43a15

    xor-int/2addr v4, v5

    const v5, -0x7daec197

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x63f1

    const v5, -0x668c5431

    xor-int/2addr v4, v5

    const v5, 0x136e7929

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u05a1\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x37b7

    const v5, 0x2fd2c3de

    xor-int/2addr v4, v5

    const v5, -0x3a3240c0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u06db\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x773d

    const v5, 0x7e946882

    xor-int/2addr v4, v5

    const v5, -0x3520b345    # -7317085.5f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1363

    const v5, 0x119ba070

    xor-int/2addr v4, v5

    const v5, -0x19cf66ed

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x758b53a9 -> :sswitch_5
        -0x685c4d9f -> :sswitch_3
        -0x5e293213 -> :sswitch_7
        -0x560a1a53 -> :sswitch_a
        -0x3d75ad84 -> :sswitch_6
        -0x346282c5 -> :sswitch_9
        -0x2bdfc2c0 -> :sswitch_8
        -0x2833c93f -> :sswitch_b
        -0x1ac36a7c -> :sswitch_c
        -0x18169bea -> :sswitch_b
        -0x10c24a24 -> :sswitch_9
        0x4c909fb -> :sswitch_2
        0xb075f8d -> :sswitch_c
        0x235b6263 -> :sswitch_1
        0x361ade5b -> :sswitch_d
        0x39375d35 -> :sswitch_3
        0x3e58563f -> :sswitch_0
        0x469b9658 -> :sswitch_6
        0x4a9a27fa -> :sswitch_0
        0x509f8e07 -> :sswitch_8
        0x5206b999 -> :sswitch_a
        0x57cc6a99 -> :sswitch_5
        0x5ffe4dd5 -> :sswitch_4
        0x611ae590 -> :sswitch_d
        0x65a3a0b1 -> :sswitch_2
        0x709bacd7 -> :sswitch_7
        0x7271d333 -> :sswitch_1
        0x76d6237e -> :sswitch_4
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
