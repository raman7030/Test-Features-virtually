.class public final synthetic Ll/ᩳ֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 6

    const v0, 0x4bd9a14

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v3, "\u1a7a\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6347

    const v5, -0x73b180e7

    xor-int/2addr v4, v5

    const v5, 0x25577428

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x559

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-lez v3, :cond_9

    goto/16 :goto_1

    .line 0
    :sswitch_0
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_b

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v3, :cond_3

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    return-void

    .line 0
    :sswitch_4
    iget-object v0, p0, Ll/ᩳ֨᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ۧ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e0\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5085

    const v5, -0x61e59f5c

    xor-int/2addr v4, v5

    const v5, -0x67f6faa2

    goto :goto_0

    .line 2
    :sswitch_6
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a77\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5457

    const v5, 0x413c7325

    xor-int/2addr v4, v5

    const v5, 0x4c82ca08    # 6.85712E7f

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x533d

    const v5, -0x45ecd5f5

    xor-int/2addr v4, v5

    const v5, -0x3fbe5213

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u05ab\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6eed

    const v5, -0x7d02894c

    xor-int/2addr v4, v5

    const v5, -0x20ca4735

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a77\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2023

    const v5, -0x6850d8e6

    xor-int/2addr v4, v5

    const v5, 0x60163820

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x238f

    const v5, 0x7a3e1796

    xor-int/2addr v4, v5

    const v5, 0x44a4129d

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_6

    :goto_2
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39d

    const v5, 0x4863acc5

    xor-int/2addr v4, v5

    const v5, 0x33ebf781

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x25ff

    const v5, -0x513cda37

    xor-int/2addr v4, v5

    const v5, -0x30910804

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_7

    :goto_3
    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xef

    const v5, -0x601f34e

    xor-int/2addr v4, v5

    const v5, 0xdbeb802

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2925

    const v5, 0x3f52166e

    xor-int/2addr v4, v5

    const v5, -0x25555565

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x12c7

    const v5, 0x3f44b186

    xor-int/2addr v4, v5

    const v5, 0xf358b87

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x267f

    const v5, 0x72ae420c

    xor-int/2addr v4, v5

    const v5, 0x5d0744e3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x50e1

    const v5, 0x36fc4a

    xor-int/2addr v4, v5

    const v5, 0x4d052f36    # 1.39653984E8f

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05ab\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x721b

    const v5, -0x2727015e

    xor-int/2addr v4, v5

    const v5, -0x356bcff2    # -4855815.0f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d3

    const v5, -0xa3b7f3d

    xor-int/2addr v4, v5

    const v5, 0xc28b81a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7fc120 -> :sswitch_7
        -0x7be6a555 -> :sswitch_2
        -0x72ac95cd -> :sswitch_d
        -0x6f396501 -> :sswitch_a
        -0x6343075e -> :sswitch_c
        -0x5fee0c36 -> :sswitch_1
        -0x5edf8747 -> :sswitch_5
        -0x5e506197 -> :sswitch_d
        -0x5ac35975 -> :sswitch_b
        -0x54101197 -> :sswitch_e
        -0x459ce251 -> :sswitch_8
        -0x30903f14 -> :sswitch_3
        -0x2c2bafc7 -> :sswitch_9
        -0x28152946 -> :sswitch_3
        -0x255c270b -> :sswitch_e
        -0x21b6ba50 -> :sswitch_0
        -0x13518a76 -> :sswitch_7
        0x3156372 -> :sswitch_4
        0xd9fcef4 -> :sswitch_c
        0xe8c020e -> :sswitch_2
        0x1238de67 -> :sswitch_b
        0x132e9092 -> :sswitch_a
        0x13cd8730 -> :sswitch_8
        0x1ed714ce -> :sswitch_9
        0x49b0d544 -> :sswitch_4
        0x537c2d9f -> :sswitch_1
        0x59ea54e4 -> :sswitch_0
        0x676ea68c -> :sswitch_6
        0x67eea137 -> :sswitch_6
        0x680448d1 -> :sswitch_5
    .end sparse-switch
.end method
