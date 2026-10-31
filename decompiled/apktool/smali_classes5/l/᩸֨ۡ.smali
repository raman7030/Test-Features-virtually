.class public final synthetic Ll/᩸֨ۡ;
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

    iput-object p1, p0, Ll/᩸֨ۡ;->᩸:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x51bc2ec

    sget v2, Ll/᩺;->ۙۛܶ:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u1a73\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xbb9

    const v6, -0x6952a65f

    xor-int/2addr v5, v6

    const v6, 0x6c962d38

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x481f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 6
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :sswitch_0
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-nez v4, :cond_b

    goto/16 :goto_1

    .line 53
    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u073d\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5eb7

    const v6, -0x6131ccee

    xor-int/2addr v5, v6

    const v6, 0x6ad4e49d

    goto :goto_0

    .line 34
    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_5

    goto/16 :goto_2

    .line 7
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto/16 :goto_2

    .line 8
    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܺ۠ۡ;

    .line 132
    iput-object v0, p1, Ll/ܺ۠ۡ;->֫:Ljava/util/Map;

    return-void

    .line 2
    :sswitch_6
    iget-object v0, p0, Ll/᩸֨ۡ;->᩸:Ljava/util/Map;

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u073f\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4fdd

    const v6, 0x68dfad84

    xor-int/2addr v5, v6

    const v6, 0x6f5c677f

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06df\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c09

    const v6, -0x34a42733    # -1.4407885E7f

    xor-int/2addr v5, v6

    const v6, -0x3bfdab7f

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e4\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x40f

    const v6, -0x6acc6a2b

    xor-int/2addr v5, v6

    const v6, -0x4c70d937

    goto/16 :goto_0

    .line 53
    :sswitch_8
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06e0\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13e3

    const v6, 0x2b8f231f

    xor-int/2addr v5, v6

    const v6, 0x2ff8dff7

    goto/16 :goto_0

    .line 112
    :sswitch_9
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u073d\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x32b3

    const v6, -0x792a73e2

    xor-int/2addr v5, v6

    const v6, 0x52d80e54

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06ec\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x76b7

    const v6, 0x456868c6

    xor-int/2addr v5, v6

    const v6, -0x68b2cbe9

    goto/16 :goto_0

    .line 128
    :sswitch_a
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u0733\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xa57

    const v6, 0x9717afe

    xor-int/2addr v5, v6

    const v6, 0x3f75e5d6

    goto/16 :goto_0

    .line 127
    :sswitch_b
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u1a75\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xc8f

    const v6, 0x7cc1e808

    xor-int/2addr v5, v6

    const v6, -0x3357728b    # -8.8370088E7f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a1\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6f47

    const v6, -0x6c54bda6

    xor-int/2addr v5, v6

    const v6, -0x2bc7d14

    goto/16 :goto_0

    .line 26
    :sswitch_c
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_9

    :goto_3
    const-string v4, "\u1a7b\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xc33

    const v6, 0x74c7bf08

    xor-int/2addr v5, v6

    const v6, 0x45619297

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0730\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7125

    const v6, -0x6ebf43fd

    xor-int/2addr v5, v6

    const v6, -0x1f367f17

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u05a8\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7c3b

    const v6, -0x73b73058

    xor-int/2addr v5, v6

    const v6, 0x17a3d67e

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u0736\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x70f1

    const v6, 0x217f8f32

    xor-int/2addr v5, v6

    const v6, -0x44d361d8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6d0b

    const v6, -0x27f677d6

    xor-int/2addr v5, v6

    const v6, -0x595c75af

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x756c1bdb -> :sswitch_1
        -0x6cbc4822 -> :sswitch_d
        -0x692cb480 -> :sswitch_a
        -0x59eb8eb4 -> :sswitch_a
        -0x4c93e639 -> :sswitch_4
        -0x4319108c -> :sswitch_6
        -0x415a3a44 -> :sswitch_3
        -0x4157c42c -> :sswitch_9
        -0x34d09a7a -> :sswitch_2
        -0x2eda6b25 -> :sswitch_b
        -0x2b7efd19 -> :sswitch_0
        -0x2b48f641 -> :sswitch_7
        -0xd206506 -> :sswitch_8
        -0x71f3e1d -> :sswitch_d
        -0x6b73ad0 -> :sswitch_4
        -0x2894390 -> :sswitch_e
        -0x1e00593 -> :sswitch_2
        -0x140bcb2 -> :sswitch_5
        -0x125e870 -> :sswitch_6
        0x6ae1a35 -> :sswitch_8
        0x8bc3380 -> :sswitch_5
        0xa961a93 -> :sswitch_9
        0x1665cd13 -> :sswitch_3
        0x226c2596 -> :sswitch_7
        0x2acfa429 -> :sswitch_1
        0x3a38e9bc -> :sswitch_e
        0x4538265f -> :sswitch_c
        0x46e9c0bd -> :sswitch_c
        0x712aba69 -> :sswitch_b
        0x77835ea6 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
