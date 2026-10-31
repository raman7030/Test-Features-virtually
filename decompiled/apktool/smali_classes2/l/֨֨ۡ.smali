.class public final synthetic Ll/֨֨ۡ;
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

    iput-object p1, p0, Ll/֨֨ۡ;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5d2841e3

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v4, "\u06e8\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1987

    const v6, -0x1a4c810e

    xor-int/2addr v5, v6

    const v6, 0x7bad8e27

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x7a25

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 58
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_2

    .line 36
    :sswitch_1
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :sswitch_2
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_b

    goto :goto_1

    .line 7
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    :goto_1
    const-string v4, "\u0730\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xac9

    const v6, -0x7edc61cd

    xor-int/2addr v5, v6

    const v6, 0x1f29ee74

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܺ۠ۡ;

    .line 132
    iput-object v0, p1, Ll/ܺ۠ۡ;->֫:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/֨֨ۡ;->᩸:Ljava/util/Map;

    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u073a\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x179b

    const v6, -0x4697f66b

    xor-int/2addr v5, v6

    const v6, -0x785efdb3

    goto :goto_0

    .line 104
    :sswitch_7
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e8\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3957

    const v6, 0x92263d0

    xor-int/2addr v5, v6

    const v6, -0x5aec0360

    goto :goto_0

    .line 54
    :sswitch_8
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d95

    const v6, 0x755115a7

    xor-int/2addr v5, v6

    const v6, 0x525e72d6

    goto/16 :goto_0

    .line 41
    :sswitch_9
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5385

    const v6, -0xabaff9c

    xor-int/2addr v5, v6

    const v6, 0x41c7d26d

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u0730\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5c09

    const v6, -0x216d2a35

    xor-int/2addr v5, v6

    const v6, -0x226a2d43

    goto/16 :goto_0

    .line 64
    :sswitch_b
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_2
    const-string v4, "\u05a8\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6e73

    const v6, -0x168ad7df

    xor-int/2addr v5, v6

    const v6, 0x26c73282

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e0\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x56e1

    const v6, 0x16bd8205

    xor-int/2addr v5, v6

    const v6, -0x1988d8e7

    goto/16 :goto_0

    .line 41
    :sswitch_c
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06df\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x53b9

    const v6, 0x2be253e9

    xor-int/2addr v5, v6

    const v6, -0x2871d1ef

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e2\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x672b

    const v6, -0x7fcc566b

    xor-int/2addr v5, v6

    const v6, -0x6ae6d1af

    goto/16 :goto_0

    .line 125
    :sswitch_d
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u0730\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x84b

    const v6, -0x7b26420f

    xor-int/2addr v5, v6

    const v6, -0x17751f0c

    goto/16 :goto_0

    .line 32
    :sswitch_e
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_a

    :goto_4
    const-string v4, "\u05a8\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6a81

    const v6, -0x3b42d6e7

    xor-int/2addr v5, v6

    const v6, 0x7a3b76f5

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e7\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4925

    const v6, -0x52d19eea

    xor-int/2addr v5, v6

    const v6, 0x41dbf8a0

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v4, "\u06e4\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x91b

    const v6, 0x660de2c6

    xor-int/2addr v5, v6

    const v6, -0x3a6ea339

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x393f

    const v6, -0x378e5a08

    xor-int/2addr v5, v6

    const v6, -0x53255f68

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bc4c173 -> :sswitch_1
        -0x76a62cc7 -> :sswitch_2
        -0x7143fe6a -> :sswitch_0
        -0x6aaf7329 -> :sswitch_b
        -0x5b3cb9bc -> :sswitch_d
        -0x5544ce09 -> :sswitch_4
        -0x3b6df04d -> :sswitch_7
        -0x3189b164 -> :sswitch_8
        -0x2dbfbaa5 -> :sswitch_2
        -0x186571f8 -> :sswitch_a
        -0x145135d8 -> :sswitch_4
        -0xb2cad96 -> :sswitch_8
        -0xa59f625 -> :sswitch_5
        -0x2e14a53 -> :sswitch_6
        0x6ea6b4d -> :sswitch_9
        0x83cf544 -> :sswitch_5
        0xe8c8f98 -> :sswitch_3
        0x10075703 -> :sswitch_6
        0x12f03aab -> :sswitch_a
        0x19ce327e -> :sswitch_e
        0x1c0dc71a -> :sswitch_c
        0x21017533 -> :sswitch_e
        0x34ebbdb9 -> :sswitch_7
        0x3689452e -> :sswitch_d
        0x3dc99abb -> :sswitch_b
        0x4acfc4e9 -> :sswitch_c
        0x4e7e88ba -> :sswitch_0
        0x629a9a40 -> :sswitch_1
        0x68816f95 -> :sswitch_9
        0x7085db98 -> :sswitch_3
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
