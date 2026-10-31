.class public final synthetic Ll/᩶ۖۡ;
.super Ljava/lang/Object;
.source "S3XU"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۖۡ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۖۡ;->᩸:Ll/᩹ۖۡ;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x31fa014e

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u073a\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4fd9

    const v6, 0xf9cf682

    xor-int/2addr v5, v6

    const v6, 0x7bc1b49b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x22f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 131
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_6

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v4, :cond_8

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v4, :cond_a

    goto/16 :goto_2

    .line 123
    :sswitch_2
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-gez v4, :cond_5

    goto/16 :goto_2

    .line 389
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_2

    .line 569
    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    const/4 p1, 0x0

    return-object p1

    .line 638
    :sswitch_5
    invoke-virtual {v0, p1}, Ll/᩹ۖۡ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜᩴܳ;

    return-object p1

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/᩶ۖۡ;->᩸:Ll/᩹ۖۡ;

    .line 385
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u1a75\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x321f

    const v6, -0x33e50717    # -4.062506E7f

    xor-int/2addr v5, v6

    const v6, 0x4bb26a4d    # 2.3385242E7f

    goto :goto_0

    .line 320
    :sswitch_7
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u05a1\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c6b

    const v6, 0x121d4b1b

    xor-int/2addr v5, v6

    const v6, -0x6c70d3a6

    goto :goto_0

    :sswitch_8
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1d8b

    const v6, 0x55cb9880

    xor-int/2addr v5, v6

    const v6, -0x4fdeb433

    goto/16 :goto_0

    .line 446
    :sswitch_9
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06d8\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2e89

    const v6, -0x1c59a537

    xor-int/2addr v5, v6

    const v6, 0x1a98d185

    goto/16 :goto_0

    .line 46
    :sswitch_a
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06d6\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d81

    const v6, -0x6b85ab1f

    xor-int/2addr v5, v6

    const v6, -0x3dc87558

    goto/16 :goto_0

    :cond_5
    :goto_1
    const-string v4, "\u06eb\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3565

    const v6, -0x6fc8012f

    xor-int/2addr v5, v6

    const v6, -0x64b522cb

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073f\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e15

    const v6, -0x35f5464e    # -2272876.5f

    xor-int/2addr v5, v6

    const v6, 0x6471e84a

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_7

    :goto_2
    const-string v4, "\u1a74\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9af

    const v6, 0x7c54e62d

    xor-int/2addr v5, v6

    const v6, -0x405a5d01

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a7a\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5241

    const v6, 0x6bfb24b8

    xor-int/2addr v5, v6

    const v6, 0x733a1ef

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_9

    :cond_8
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1587

    const v6, -0xc516eae

    xor-int/2addr v5, v6

    const v6, 0x418d8778

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0730\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x33a1

    const v6, -0x1305d0b9

    xor-int/2addr v5, v6

    const v6, 0x4bb37d8b    # 2.3526166E7f

    goto/16 :goto_0

    .line 443
    :sswitch_d
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a74\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x324d

    const v6, 0x54935849

    xor-int/2addr v5, v6

    const v6, 0x547e8809

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e2\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xbd1

    const v6, 0x202d86b4

    xor-int/2addr v5, v6

    const v6, 0x498a388c    # 1132305.5f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06eb\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x22b3

    const v6, -0x58154cb4

    xor-int/2addr v5, v6

    const v6, -0x7dcd9bc1

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d7\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6af

    const v6, -0x1d5fbeab

    xor-int/2addr v5, v6

    const v6, -0x2460e8d7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d22b51c -> :sswitch_4
        -0x74842a44 -> :sswitch_8
        -0x727d204a -> :sswitch_4
        -0x6efc08d5 -> :sswitch_8
        -0x6dd6f681 -> :sswitch_7
        -0x58421afc -> :sswitch_5
        -0x4819507d -> :sswitch_a
        -0x469c8a0d -> :sswitch_0
        -0x466855fe -> :sswitch_c
        -0x3a61e65b -> :sswitch_2
        -0x2f4c77cf -> :sswitch_7
        -0x2b361ba9 -> :sswitch_e
        -0x28fe1a63 -> :sswitch_a
        -0x23be1edd -> :sswitch_e
        -0x1c56741d -> :sswitch_9
        -0x1b1f9369 -> :sswitch_d
        -0x197dad63 -> :sswitch_c
        -0x117a7896 -> :sswitch_1
        -0x106c7525 -> :sswitch_b
        -0x5e360d9 -> :sswitch_3
        -0x408f06f -> :sswitch_0
        0x26c4611 -> :sswitch_6
        0x2e8b51e -> :sswitch_d
        0xaa9de02 -> :sswitch_3
        0xcf60c10 -> :sswitch_5
        0x2d7eff89 -> :sswitch_2
        0x3b16d2f5 -> :sswitch_9
        0x4270912a -> :sswitch_6
        0x6566a740 -> :sswitch_1
        0x7fefbee2 -> :sswitch_b
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
