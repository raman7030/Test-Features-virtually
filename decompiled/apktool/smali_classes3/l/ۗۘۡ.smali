.class public final synthetic Ll/ۗۘۡ;
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

    iput-object p1, p0, Ll/ۗۘۡ;->᩸:Ll/ۛۘۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x5fcc381

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    const-string v4, "\u1a77\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2e33

    const v6, 0x2e6d428b

    xor-int/2addr v5, v6

    const v6, -0x568951e5

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7477

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v4, Ll/۟;->ۗۤۛ:I

    if-nez v4, :cond_b

    goto/16 :goto_1

    :sswitch_1
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_9

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v4, :cond_5

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/᩺ۚۡ;

    invoke-static {v0, p1}, Ll/ۛۘۡ;->ܽ(Ll/ۛۘۡ;Ll/᩺ۚۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ۗۘۡ;->᩸:Ll/ۛۘۡ;

    .line 4
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_0

    const-string v4, "\u05ab\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a85

    const v6, -0x71268e98

    xor-int/2addr v5, v6

    const v6, -0x1b07e5b9

    goto :goto_0

    :cond_0
    const-string v4, "\u0736\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x70c1

    const v6, -0x7552a233

    xor-int/2addr v5, v6

    const v6, -0x1f7dff5b

    goto :goto_0

    .line 1
    :sswitch_7
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x228f

    const v6, 0x10ff00e2

    xor-int/2addr v5, v6

    const v6, -0x66fbfc9d

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u073d\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6dd7

    const v6, 0x49bf14cf

    xor-int/2addr v5, v6

    const v6, 0x296c9705

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06d7\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc4b

    const v6, -0x3ecb26f

    xor-int/2addr v5, v6

    const v6, -0x4bc9f423

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06e2\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x56b9

    const v6, -0x56a1fbae

    xor-int/2addr v5, v6

    const v6, 0x69555389

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_6

    :cond_5
    const-string v4, "\u1a78\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7981

    const v6, -0xb1da1ad

    xor-int/2addr v5, v6

    const v6, -0x3734769c

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a7a\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4543

    const v6, -0x7c8184b0

    xor-int/2addr v5, v6

    const v6, -0x767b2dd4

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06df\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4cf9

    const v6, 0xba1a02d

    xor-int/2addr v5, v6

    const v6, -0x1aaea95

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_8

    :goto_1
    const-string v4, "\u05ab\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5ad7

    const v6, 0x378c703e

    xor-int/2addr v5, v6

    const v6, -0x6c172687

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06df\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3ef9

    const v6, 0x32f3d7ff

    xor-int/2addr v5, v6

    const v6, 0x4ef3c981

    goto/16 :goto_0

    :cond_9
    :goto_2
    const-string v4, "\u073f\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x8b9

    const v6, -0x309d0c63

    xor-int/2addr v5, v6

    const v6, 0x7ccc255c

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a76\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2465

    const v6, 0x744526b4

    xor-int/2addr v5, v6

    const v6, 0x47bc676b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u06da\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4f0f

    const v6, -0x3b92680e

    xor-int/2addr v5, v6

    const v6, -0x2fa4362c

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073f\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xe23

    const v6, 0x9b67142

    xor-int/2addr v5, v6

    const v6, -0x1c8bf4cd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f9507e8 -> :sswitch_8
        -0x75bc2e0c -> :sswitch_4
        -0x75b2fa6a -> :sswitch_e
        -0x6bc0b856 -> :sswitch_2
        -0x5a5f9140 -> :sswitch_3
        -0x5a23bde3 -> :sswitch_d
        -0x48d3db7f -> :sswitch_5
        -0x484678d9 -> :sswitch_6
        -0x3e511da7 -> :sswitch_4
        -0x3da8685e -> :sswitch_a
        -0x3a2bbe3f -> :sswitch_3
        -0x35ba3119 -> :sswitch_0
        -0x26143a37 -> :sswitch_e
        -0x217762d7 -> :sswitch_d
        -0x165c1121 -> :sswitch_9
        -0xe898d7a -> :sswitch_8
        -0xe2eb829 -> :sswitch_0
        -0x5e8e722 -> :sswitch_c
        0x7d111ce -> :sswitch_7
        0x10558b25 -> :sswitch_1
        0x1affa45a -> :sswitch_7
        0x1c3d5fc7 -> :sswitch_9
        0x2c1ca53a -> :sswitch_c
        0x2dad6eb1 -> :sswitch_b
        0x31784bfe -> :sswitch_b
        0x51ae88a5 -> :sswitch_2
        0x5a5eb091 -> :sswitch_6
        0x6f89d540 -> :sswitch_1
        0x746d05e2 -> :sswitch_5
        0x7a8e0f9a -> :sswitch_a
    .end sparse-switch
.end method
