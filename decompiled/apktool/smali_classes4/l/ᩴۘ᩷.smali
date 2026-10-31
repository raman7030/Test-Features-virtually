.class public final synthetic Ll/ᩴۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֫᩵᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/֫᩵᩷;I)V
    .locals 6

    const v0, 0x6698d306

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/֡۬;->۠֡᩶:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c3f

    const v5, -0x2d5f3b2

    xor-int/2addr v4, v5

    const v5, 0x63fbcc76

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5f97

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v3, :cond_a

    goto/16 :goto_1

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/ᩴۘ᩷;->᩹:I

    return-void

    :sswitch_5
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_0

    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e2b

    const v5, -0x7ddd7a3c

    xor-int/2addr v4, v5

    const v5, 0x2f1d1397

    goto :goto_0

    :cond_0
    const-string v3, "\u0733\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f97

    const v5, 0xa0c5aca

    xor-int/2addr v4, v5

    const v5, -0x462ed2c4

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e0\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5acb

    const v5, -0x3de1a064

    xor-int/2addr v4, v5

    const v5, -0x64e3bc0e

    goto/16 :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06df\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x261

    const v5, 0xb0b089

    xor-int/2addr v4, v5

    const v5, -0x435fbc17

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6afd

    const v5, -0xf0ebf96

    xor-int/2addr v4, v5

    const v5, 0x4285ef66

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e83

    const v5, 0x2dd4f199

    xor-int/2addr v4, v5

    const v5, -0x48851f4d

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x644f

    const v5, -0x4a7867c0

    xor-int/2addr v4, v5

    const v5, -0x6f422975

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a76\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x29c5

    const v5, 0x6da09b29

    xor-int/2addr v4, v5

    const v5, -0x65fdaa2b

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u05ab\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e71

    const v5, 0x588b74cd

    xor-int/2addr v4, v5

    const v5, -0x3d4859b0

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x50f

    const v5, -0x2582fb37

    xor-int/2addr v4, v5

    const v5, 0x3245b406

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a7b\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2877

    const v5, -0xbb01aa1

    xor-int/2addr v4, v5

    const v5, 0x58bf358a

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c09

    const v5, -0x61b675ea

    xor-int/2addr v4, v5

    const v5, 0x1c8b2b09

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5f77

    const v5, -0x216f53f3

    xor-int/2addr v4, v5

    const v5, -0x4cc29a0c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴۘ᩷;->᩸:Ll/֫᩵᩷;

    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u06db\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2065

    const v5, 0x737f2eb1

    xor-int/2addr v4, v5

    const v5, -0xf99d83d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x77b3

    const v5, 0x52226ce8

    xor-int/2addr v4, v5

    const v5, 0xe0f545

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d15d201 -> :sswitch_9
        -0x73a741ee -> :sswitch_2
        -0x68935531 -> :sswitch_4
        -0x60146b66 -> :sswitch_9
        -0x5bb424f3 -> :sswitch_6
        -0x5623fd7c -> :sswitch_8
        -0x4e9428b9 -> :sswitch_4
        -0x437891a0 -> :sswitch_d
        -0x3ded90d7 -> :sswitch_7
        -0x3a7ae3e5 -> :sswitch_b
        -0x3101a04f -> :sswitch_e
        -0x277c5742 -> :sswitch_a
        -0x25a3ac39 -> :sswitch_1
        -0x21246297 -> :sswitch_3
        -0x1fe217aa -> :sswitch_6
        -0x1ddeac51 -> :sswitch_3
        0x3e36457 -> :sswitch_c
        0x1682f408 -> :sswitch_5
        0x1879ffb5 -> :sswitch_8
        0x1be81bdb -> :sswitch_1
        0x1cf80eb8 -> :sswitch_a
        0x23c77bf0 -> :sswitch_2
        0x28b0a4b9 -> :sswitch_e
        0x2a460f33 -> :sswitch_0
        0x2e5d21e5 -> :sswitch_d
        0x40574aaf -> :sswitch_b
        0x5d829ad9 -> :sswitch_c
        0x6c12575c -> :sswitch_5
        0x6c3868f5 -> :sswitch_7
        0x7901e231 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ᩴۘ᩷;->᩸:Ll/֫᩵᩷;

    iget v1, p0, Ll/ᩴۘ᩷;->᩹:I

    invoke-static {v0, v1}, Ll/֫᩵᩷;->ܽ(Ll/֫᩵᩷;I)V

    return-void
.end method
