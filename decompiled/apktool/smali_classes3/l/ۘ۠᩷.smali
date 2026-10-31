.class public final synthetic Ll/ۘ۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ۠᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7504fb62

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/ۛ;->᩺᩻֫:I

    const-string v4, "\u073d\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6bd1

    const v6, -0x69f2e7c8

    xor-int/2addr v5, v6

    const v6, -0x106a0eba

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x5115

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 4
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v4, :cond_7

    goto/16 :goto_3

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    .line 1
    :sswitch_2
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_9

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    return-void

    .line 0
    :sswitch_5
    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lbin/mt/plus/Main;->֫(Lbin/mt/plus/Main;Ljava/lang/Long;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/ۘ۠᩷;->᩸:Lbin/mt/plus/Main;

    .line 2
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3889

    const v6, -0x32ab16dc

    xor-int/2addr v5, v6

    const v6, -0x1ee58baf

    goto :goto_0

    :cond_1
    const-string v4, "\u05a8\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2583

    const v6, 0x35eea7fc

    xor-int/2addr v5, v6

    const v6, -0xe46c16c

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a76\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b6d

    const v6, -0xdf3b7d

    xor-int/2addr v5, v6

    const v6, -0x651015b0

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u1a78\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x324f

    const v6, 0x5c6dc8c1

    xor-int/2addr v5, v6

    const v6, -0x2653564e

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u1a7b\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x29ed

    const v6, 0x3d9f0a62

    xor-int/2addr v5, v6

    const v6, -0x5ff98043

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u05a8\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a07

    const v6, 0xd21aedf

    xor-int/2addr v5, v6

    const v6, -0x5b2e22df

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06ec\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4b17

    const v6, 0x60ad9d91    # 1.0008252E20f

    xor-int/2addr v5, v6

    const v6, 0x5b320e04

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6a79

    const v6, 0x79a843a1

    xor-int/2addr v5, v6

    const v6, 0x278bb42f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06dc\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5ef9

    const v6, 0x1f0a3e0c

    xor-int/2addr v5, v6

    const v6, 0x5da4dfc

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x262b

    const v6, -0x57eaf94f

    xor-int/2addr v5, v6

    const v6, 0x40e784c4

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d6\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x799b

    const v6, -0x1e9cc79d

    xor-int/2addr v5, v6

    const v6, -0x169a98cb

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_b

    :goto_4
    const-string v4, "\u073f\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x40bf

    const v6, 0x6c82e109

    xor-int/2addr v5, v6

    const v6, 0x482b0501

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e2\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x663f

    const v6, 0x209b1dca

    xor-int/2addr v5, v6

    const v6, -0x1a8d1449

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_c

    :goto_5
    const-string v4, "\u1a7b\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x145f

    const v6, 0x2fdcf5f9

    xor-int/2addr v5, v6

    const v6, 0xb46c005

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05ab\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7cfd

    const v6, 0x6e0b1fbb

    xor-int/2addr v5, v6

    const v6, 0x6bffd23d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x756bc287 -> :sswitch_d
        -0x7099f72e -> :sswitch_7
        -0x62e29f87 -> :sswitch_1
        -0x5db56745 -> :sswitch_4
        -0x5538eb52 -> :sswitch_3
        -0x4ea3df1c -> :sswitch_c
        -0x49fa0cda -> :sswitch_9
        -0x480e45e0 -> :sswitch_3
        -0x46a3738e -> :sswitch_e
        -0x4000b0cb -> :sswitch_0
        -0x3e1046ce -> :sswitch_5
        -0x35438cce -> :sswitch_1
        -0x2d379967 -> :sswitch_2
        -0x1a6c3fa1 -> :sswitch_6
        -0x1893750f -> :sswitch_a
        -0xdecf711 -> :sswitch_4
        -0xde70e58 -> :sswitch_2
        -0x93355b9 -> :sswitch_8
        0x8452431 -> :sswitch_c
        0xbe6f7fb -> :sswitch_6
        0x1ad255ff -> :sswitch_0
        0x1b1cf567 -> :sswitch_e
        0x1d5b1049 -> :sswitch_b
        0x26b246ea -> :sswitch_5
        0x27b1aeb3 -> :sswitch_b
        0x302ba677 -> :sswitch_a
        0x3d36fdcc -> :sswitch_d
        0x4578d2ba -> :sswitch_9
        0x557c5dea -> :sswitch_7
        0x7d26860c -> :sswitch_8
    .end sparse-switch
.end method
