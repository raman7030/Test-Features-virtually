.class public final synthetic Ll/ܽۖ᩷;
.super Ljava/lang/Object;
.source "K185"


# direct methods
.method public static ֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;
    .locals 6

    const v0, 0x46cefe9f

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x750b

    const v5, -0x69847217

    xor-int/2addr v4, v5

    const v5, -0x7e7fbe10

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x239f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 11
    new-instance v3, Ll/ᩳۖ᩷;

    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_0

    goto/16 :goto_5

    .line 7
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-gez v3, :cond_8

    goto :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_1

    .line 1
    :sswitch_2
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v3, :cond_2

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    :goto_1
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x56d3

    const v5, 0x31189a3e

    xor-int/2addr v4, v5

    const v5, -0x4b70d4c8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    const/4 p0, 0x0

    return-object p0

    .line 9
    :sswitch_5
    new-instance p0, Ll/ۨۘᩳ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :cond_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v4

    if-ltz v4, :cond_1

    goto :goto_2

    .line 6
    :cond_1
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_3

    :cond_2
    :goto_2
    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d49

    const v5, 0x868ab7

    xor-int/2addr v4, v5

    const v5, -0x39012a7a

    goto :goto_0

    :cond_3
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_4

    goto :goto_5

    .line 0
    :cond_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    .line 10
    :cond_5
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_7

    goto :goto_3

    .line 7
    :cond_7
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x35ef

    const v5, -0x2fbd8dc7

    xor-int/2addr v4, v5

    const v5, -0x74437b15

    goto/16 :goto_0

    .line 4
    :cond_9
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06d6\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x40ff

    const v5, -0x7f60d427

    xor-int/2addr v4, v5

    const v5, -0x59788534

    goto/16 :goto_0

    .line 2
    :cond_b
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_c

    :goto_5
    const-string v3, "\u06e7\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x302d

    const v5, 0x74a38fd

    xor-int/2addr v4, v5

    const v5, -0x5ddc190b

    goto/16 :goto_0

    .line 11
    :cond_c
    invoke-direct {v3, p0}, Ll/ᩳۖ᩷;-><init>(Ll/ܿۖ᩷;)V

    return-object v3

    :sswitch_6
    if-nez p0, :cond_d

    const-string v3, "\u1a74\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45b7

    const v5, 0xee7c7be

    xor-int/2addr v4, v5

    const v5, 0x48f85cff

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7987

    const v5, -0x2bcc46a3

    xor-int/2addr v4, v5

    const v5, 0x1e64ed4a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79036fc3 -> :sswitch_3
        -0x6d8444c3 -> :sswitch_2
        -0x6c01c69b -> :sswitch_2
        -0x6980c053 -> :sswitch_0
        -0x5a33b9a4 -> :sswitch_5
        -0x5328bcc5 -> :sswitch_6
        -0x40195311 -> :sswitch_1
        -0x1fd8d555 -> :sswitch_1
        -0x14256f13 -> :sswitch_6
        0x18676f0d -> :sswitch_0
        0x1ec58e0e -> :sswitch_4
        0x2bb53141 -> :sswitch_5
        0x59b8ed60 -> :sswitch_4
        0x6406a93e -> :sswitch_3
    .end sparse-switch
.end method
