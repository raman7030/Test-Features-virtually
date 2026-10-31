.class public final synthetic Ll/۬ۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۛۘۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۘۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۘۡ;->᩸:Ll/ۛۘۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3a30f9e0

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v4, "\u1a75\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6257

    const v6, -0x3ce847cc

    xor-int/2addr v5, v6

    const v6, 0x22b6e33

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x6c49

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u0736\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7497

    const v6, -0x7acbe0b3

    xor-int/2addr v5, v6

    const v6, -0xf15be83

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_4
    check-cast p1, Ll/᩺ۚۡ;

    invoke-static {v0, p1}, Ll/ۛۘۡ;->ۧ(Ll/ۛۘۡ;Ll/᩺ۚۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    :sswitch_5
    iget-object v0, p0, Ll/۬ۘۡ;->᩸:Ll/ۛۘۡ;

    .line 2
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x55c5

    const v6, 0x4678db81

    xor-int/2addr v5, v6

    const v6, 0x56de2ac6

    goto :goto_0

    :sswitch_6
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e2\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x26cd

    const v6, -0x2860b639

    xor-int/2addr v5, v6

    const v6, -0xca21714

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_4

    :cond_3
    const-string v4, "\u1a74\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1981

    const v6, 0x4be69091    # 3.0220578E7f

    xor-int/2addr v5, v6

    const v6, 0x52a5b332

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06eb\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2eeb

    const v6, 0x822be5d

    xor-int/2addr v5, v6

    const v6, 0x584ab1f6

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u073d\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xa99

    const v6, -0x45538a2

    xor-int/2addr v5, v6

    const v6, 0x1ecc4b12

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a76\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6a03

    const v6, 0x788caa5e

    xor-int/2addr v5, v6

    const v6, 0x4e06d61b    # 5.6554464E8f

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_7

    :goto_2
    const-string v4, "\u06e1\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7ef

    const v6, -0x6df65ae

    xor-int/2addr v5, v6

    const v6, -0x6ef63ebd

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a77\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x35b9

    const v6, 0x563031dd

    xor-int/2addr v5, v6

    const v6, -0x68a83945

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06e2\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x459d

    const v6, -0x6edb29cd

    xor-int/2addr v5, v6

    const v6, -0x4cebe67a

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06df\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x48cb

    const v6, 0x3a33ab25

    xor-int/2addr v5, v6

    const v6, 0x23e2f87f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x407b

    const v6, -0x2583b649

    xor-int/2addr v5, v6

    const v6, -0x385d460d

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u0736\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e5b

    const v6, 0x5cc9b446

    xor-int/2addr v5, v6

    const v6, -0x435bcd3c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v4

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u06d8\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x70f

    const v6, 0x38276e42

    xor-int/2addr v5, v6

    const v6, -0x4201cf97

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4327

    const v6, 0x3e4fbef6

    xor-int/2addr v5, v6

    const v6, 0x1225b160

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74228a1b -> :sswitch_d
        -0x61b06282 -> :sswitch_8
        -0x563499a4 -> :sswitch_5
        -0x52df1e32 -> :sswitch_e
        -0x48996cd6 -> :sswitch_2
        -0x420037f0 -> :sswitch_9
        -0x3d91a3f4 -> :sswitch_6
        -0x3c982db3 -> :sswitch_9
        -0x3b5e8080 -> :sswitch_a
        -0x3062af79 -> :sswitch_b
        -0x1ef2d172 -> :sswitch_8
        -0x11cdf945 -> :sswitch_2
        -0x8bd08d3 -> :sswitch_6
        -0x6c8366f -> :sswitch_d
        -0x629b8fb -> :sswitch_4
        -0x251c1a1 -> :sswitch_1
        0x82e6f7e -> :sswitch_7
        0x13ac6286 -> :sswitch_c
        0x1e8b185a -> :sswitch_0
        0x277d29d8 -> :sswitch_e
        0x2aef3a13 -> :sswitch_0
        0x4a9365b1 -> :sswitch_7
        0x524e7984 -> :sswitch_5
        0x5e599d1c -> :sswitch_b
        0x5f70cc35 -> :sswitch_a
        0x63e994f0 -> :sswitch_1
        0x695cea60 -> :sswitch_4
        0x6d3f493e -> :sswitch_3
        0x7275ac24 -> :sswitch_3
        0x78a39601 -> :sswitch_c
    .end sparse-switch
.end method
