.class public final synthetic Ll/ۘۚۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۛۚۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۚۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۚۡ;->᩸:Ll/ۛۚۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x52736bef

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    const-string v4, "\u06eb\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xc95

    const v6, -0x2d7c802

    xor-int/2addr v5, v6

    const v6, -0x20216f26

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4603

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_a

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v4, :cond_9

    goto/16 :goto_1

    .line 0
    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    check-cast p1, Ll/ۚᩴۡ;

    invoke-static {v0, p1}, Ll/ۛۚۡ;->֫(Ll/ۛۚۡ;Ll/ۚᩴۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ۘۚۡ;->᩸:Ll/ۛۚۡ;

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u073a\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x21ad

    const v6, -0x34e70348    # -1.0026168E7f

    xor-int/2addr v5, v6

    const v6, 0x34c74847

    goto :goto_0

    .line 1
    :sswitch_7
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c3b

    const v6, 0x51499f28

    xor-int/2addr v5, v6

    const v6, 0x53ff2dbc

    goto :goto_0

    .line 4
    :sswitch_8
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06d8\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x53cf

    const v6, -0x7ad6be2b

    xor-int/2addr v5, v6

    const v6, 0x2db3d7d5

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4641

    const v6, 0x5ac542f8

    xor-int/2addr v5, v6

    const v6, -0x61d54fa6

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06d9\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1e31

    const v6, 0x7edf691a

    xor-int/2addr v5, v6

    const v6, -0x147270f9

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u05ab\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1eb7

    const v6, -0x5a6d6cbd

    xor-int/2addr v5, v6

    const v6, 0x69448bc1

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06d6\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x345d

    const v6, -0x2f36ac8

    xor-int/2addr v5, v6

    const v6, 0x7e9cc366

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_7

    :cond_6
    const-string v4, "\u06d8\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6f6d

    const v6, 0x6a3d5920

    xor-int/2addr v5, v6

    const v6, 0x54d6f14a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06db\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x485b

    const v6, -0x2ac49720

    xor-int/2addr v5, v6

    const v6, 0x163751f1

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_8

    :goto_2
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xacd

    const v6, 0x24a2626d

    xor-int/2addr v5, v6

    const v6, 0x217a09ca

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0730\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3f45

    const v6, 0x557ff7fc

    xor-int/2addr v5, v6

    const v6, -0x183c3ceb

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v4, "\u073a\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x24bf

    const v6, -0x687804f0

    xor-int/2addr v5, v6

    const v6, 0x716217af

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d9\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7705

    const v6, 0x11d81515

    xor-int/2addr v5, v6

    const v6, 0x6e84face

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06ec\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a45

    const v6, 0x5bcd3c9f

    xor-int/2addr v5, v6

    const v6, 0x4a559c3e    # 3499791.5f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d8b

    const v6, -0xfbfd2e3

    xor-int/2addr v5, v6

    const v6, -0x2c3ab850

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74413d2f -> :sswitch_a
        -0x612360cb -> :sswitch_8
        -0x5d5eccee -> :sswitch_d
        -0x5c35c089 -> :sswitch_7
        -0x5922f19d -> :sswitch_6
        -0x57ef8036 -> :sswitch_a
        -0x45aab24d -> :sswitch_2
        -0x44bcba9c -> :sswitch_4
        -0x43f67b64 -> :sswitch_e
        -0x41728b9d -> :sswitch_d
        -0x4088485f -> :sswitch_2
        -0x35e36c2f -> :sswitch_3
        -0x34014a35 -> :sswitch_b
        -0x1a072328 -> :sswitch_5
        0xb152bf8 -> :sswitch_6
        0xc28cb19 -> :sswitch_9
        0x1e5fbcd4 -> :sswitch_5
        0x1eaf8c7f -> :sswitch_8
        0x25373e80 -> :sswitch_7
        0x29fed2e6 -> :sswitch_0
        0x2afcbaa6 -> :sswitch_e
        0x4acaa274 -> :sswitch_b
        0x54da4596 -> :sswitch_c
        0x55254646 -> :sswitch_c
        0x585ff3ea -> :sswitch_4
        0x5c522d82 -> :sswitch_3
        0x61c04624 -> :sswitch_9
        0x68a3ffca -> :sswitch_0
        0x710d4416 -> :sswitch_1
        0x79e6f68f -> :sswitch_1
    .end sparse-switch
.end method
