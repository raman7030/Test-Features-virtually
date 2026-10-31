.class public final synthetic Ll/ܿܽ᩷;
.super Ljava/lang/Object;
.source "D2S2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۚܽ᩷;

.field public final synthetic ᩹:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ۚܽ᩷;Ljava/lang/Runnable;)V
    .locals 6

    const v0, -0x742b7e0a

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/۠;->ܺܺܶ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d8b

    const v5, 0x33cd26ec

    xor-int/2addr v4, v5

    const v5, 0x25d630cc

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xe65

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_b

    goto/16 :goto_4

    .line 0
    :sswitch_1
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_7

    goto/16 :goto_4

    :sswitch_2
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v3, :cond_9

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    :goto_1
    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b1b

    const v5, 0x4c10a04b    # 3.7912876E7f

    xor-int/2addr v4, v5

    const v5, 0x52295afd    # 1.81844001E11f

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p2, p0, Ll/ܿܽ᩷;->᩹:Ljava/lang/Runnable;

    return-void

    .line 4
    :sswitch_6
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a78\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f19

    const v5, -0x263f4fed

    xor-int/2addr v4, v5

    const v5, 0x7b6ad923

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06d9\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x269b

    const v5, 0x7bc02ef8

    xor-int/2addr v4, v5

    const v5, 0x3ce0efc6

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e37

    const v5, -0x4edba6e6

    xor-int/2addr v4, v5

    const v5, 0x604265a4

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4151

    const v5, -0x52e675b1

    xor-int/2addr v4, v5

    const v5, 0x6b1166c2

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x13ad

    const v5, 0x5a485506

    xor-int/2addr v4, v5

    const v5, 0x76982e4a

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5357

    const v5, 0x7df64615

    xor-int/2addr v4, v5

    const v5, -0x62b086e8

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_6

    :goto_2
    const-string v3, "\u06eb\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd9f

    const v5, -0x7ffc5d27

    xor-int/2addr v4, v5

    const v5, 0x83e51fa

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77c9

    const v5, -0x1cb8b0ba

    xor-int/2addr v4, v5

    const v5, 0x5bf5650a

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7751

    const v5, -0x769b26b5

    xor-int/2addr v4, v5

    const v5, -0x6da83bdd

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05ab\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e49

    const v5, 0xd07cd33

    xor-int/2addr v4, v5

    const v5, -0x65060461

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06da\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4e71

    const v5, -0x3ed84e61

    xor-int/2addr v4, v5

    const v5, 0x131f7b86

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x532f

    const v5, 0x6ec52fd5

    xor-int/2addr v4, v5

    const v5, 0x64bb3df

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܿܽ᩷;->᩸:Ll/ۚܽ᩷;

    .line 3
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e67

    const v5, -0x762ff11d

    xor-int/2addr v4, v5

    const v5, -0x23cee2a6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4305

    const v5, -0x548fea39

    xor-int/2addr v4, v5

    const v5, -0x5257fcf4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fdf573d -> :sswitch_a
        -0x6c064f7d -> :sswitch_9
        -0x69a13e00 -> :sswitch_5
        -0x58c7629d -> :sswitch_2
        -0x57309c57 -> :sswitch_4
        -0x50a3029a -> :sswitch_1
        -0x4fcc759a -> :sswitch_2
        -0x3b282831 -> :sswitch_e
        -0x371e3317 -> :sswitch_e
        -0x349a59b8 -> :sswitch_0
        -0x282974f8 -> :sswitch_b
        -0x1d9dd11b -> :sswitch_7
        -0x15fa8467 -> :sswitch_a
        -0x14839ca0 -> :sswitch_c
        -0x11153c33 -> :sswitch_c
        -0x9ecde29 -> :sswitch_5
        -0x1d77fb9 -> :sswitch_3
        0x1c5bfd14 -> :sswitch_d
        0x1ec4818b -> :sswitch_b
        0x1ed313a6 -> :sswitch_d
        0x20084563 -> :sswitch_0
        0x20969a2b -> :sswitch_6
        0x31050116 -> :sswitch_1
        0x442f15c4 -> :sswitch_8
        0x44687ff4 -> :sswitch_6
        0x47136c14 -> :sswitch_4
        0x481d4ed5 -> :sswitch_7
        0x58f64452 -> :sswitch_9
        0x680fa302 -> :sswitch_3
        0x6a3b5399 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܿܽ᩷;->᩸:Ll/ۚܽ᩷;

    iget-object v1, p0, Ll/ܿܽ᩷;->᩹:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Ll/ۚܽ᩷;->֫(Ll/ۚܽ᩷;Ljava/lang/Runnable;)V

    return-void
.end method
