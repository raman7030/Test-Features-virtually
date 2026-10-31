.class public final synthetic Ll/ۙ֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֨ۡ;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3ec30b4a

    sget v2, Ll/ۛ;->᩺᩻֫:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u1a79\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e2f

    const v6, 0x298a274e

    xor-int/2addr v5, v6

    const v6, -0x28d8c653

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x6405

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 12
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_8

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v4, :cond_a

    goto/16 :goto_4

    .line 98
    :sswitch_1
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v4, :cond_7

    goto/16 :goto_4

    .line 36
    :sswitch_2
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-gez v4, :cond_2

    goto/16 :goto_4

    .line 115
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܺ۠ۡ;

    .line 132
    iput-object v0, p1, Ll/ܺ۠ۡ;->֫:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/ۙ֨ۡ;->᩸:Ljava/util/Map;

    .line 8
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u06e0\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e0f

    const v6, 0x7c728fac

    xor-int/2addr v5, v6

    const v6, -0x54ee9297

    goto :goto_0

    .line 50
    :sswitch_7
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v4

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06d9\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7131

    const v6, 0x2392846e

    xor-int/2addr v5, v6

    const v6, -0x3490b7c8    # -1.5681592E7f

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_3

    :cond_2
    const-string v4, "\u06e0\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x640f

    const v6, -0x118b65e

    xor-int/2addr v5, v6

    const v6, 0x6d0f7453

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073a\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x25b9

    const v6, 0x3ed93814

    xor-int/2addr v5, v6

    const v6, -0x3cd8c849

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-eqz v4, :cond_4

    :goto_1
    const-string v4, "\u06dc\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3c91

    const v6, -0x60680ea5

    xor-int/2addr v5, v6

    const v6, -0xf3593ba

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6aef

    const v6, 0x7f9bb16d

    xor-int/2addr v5, v6

    const v6, -0x26b8356f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06d6\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4307

    const v6, -0x14556dcc

    xor-int/2addr v5, v6

    const v6, 0x7cd60c93

    goto/16 :goto_0

    .line 92
    :sswitch_b
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06da\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4eb5

    const v6, 0x3b8dbb96

    xor-int/2addr v5, v6

    const v6, 0x198cd1bf

    goto/16 :goto_0

    :cond_7
    :goto_2
    const-string v4, "\u0733\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4053

    const v6, -0x6ef3053d

    xor-int/2addr v5, v6

    const v6, -0x6724c029

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a79\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1acf

    const v6, 0x1c407e32

    xor-int/2addr v5, v6

    const v6, 0x54472e5b

    goto/16 :goto_0

    .line 9
    :sswitch_c
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a75\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2d39

    const v6, 0x7501359c

    xor-int/2addr v5, v6

    const v6, -0x6dd94473

    goto/16 :goto_0

    .line 79
    :sswitch_d
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06ec\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1721

    const v6, -0x6536068e

    xor-int/2addr v5, v6

    const v6, 0x1c4944c1

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u073d\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3db1

    const v6, -0x4c56de9c

    xor-int/2addr v5, v6

    const v6, -0x629f718c

    goto/16 :goto_0

    .line 120
    :sswitch_e
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v4

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06e4\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3df3

    const v6, 0x621e60ab

    xor-int/2addr v5, v6

    const v6, 0x27c5007d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05ab\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4fd

    const v6, -0x6b0a156

    xor-int/2addr v5, v6

    const v6, 0x1fbd3383

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe6f4b2 -> :sswitch_b
        -0x71a1a5cc -> :sswitch_d
        -0x5c2d3987 -> :sswitch_9
        -0x43c2bb4f -> :sswitch_7
        -0x37931be9 -> :sswitch_0
        -0x32203449 -> :sswitch_1
        -0x2f1c0a65 -> :sswitch_6
        -0x2c7f333b -> :sswitch_8
        -0x2503c48a -> :sswitch_3
        -0xb44d55e -> :sswitch_a
        -0x92f833e -> :sswitch_0
        -0x62e0881 -> :sswitch_5
        -0x313bb11 -> :sswitch_3
        0x85b884 -> :sswitch_1
        0x4815713 -> :sswitch_4
        0x62f61b9 -> :sswitch_6
        0x100f191a -> :sswitch_c
        0x17b7fe3a -> :sswitch_5
        0x191e44cc -> :sswitch_4
        0x1f9a27f6 -> :sswitch_7
        0x261a793e -> :sswitch_d
        0x2a30cdd7 -> :sswitch_a
        0x2bbafdae -> :sswitch_2
        0x425d4998 -> :sswitch_9
        0x48a72e91 -> :sswitch_8
        0x5c353ff1 -> :sswitch_e
        0x6e972e81 -> :sswitch_b
        0x705754f4 -> :sswitch_c
        0x7215fe11 -> :sswitch_2
        0x728309ab -> :sswitch_e
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
