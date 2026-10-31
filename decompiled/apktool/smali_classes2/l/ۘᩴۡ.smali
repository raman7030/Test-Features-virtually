.class public final Ll/ۘᩴۡ;
.super Ljava/lang/Object;
.source "V4FO"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 6

    const v0, -0x8270da6

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x456f

    const v5, 0x66e78854

    xor-int/2addr v4, v5

    const v5, -0x22058f1d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2915

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-gez v3, :cond_3

    goto/16 :goto_4

    .line 38
    :sswitch_0
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 93
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto/16 :goto_2

    .line 170
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 254
    :sswitch_4
    iput p2, p0, Ll/ۘᩴۡ;->ۧ:I

    return-void

    .line 226
    :sswitch_5
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06e7\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5f89

    const v5, -0x73f9de06

    xor-int/2addr v4, v5

    const v5, -0x7f012502

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e61

    const v5, 0x4e48327f    # 8.3968813E8f

    xor-int/2addr v4, v5

    const v5, 0x293497a1

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u0730\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3361

    const v5, 0x12613724

    xor-int/2addr v4, v5

    const v5, 0x638e5a

    goto/16 :goto_0

    .line 239
    :sswitch_8
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_4

    :cond_3
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x47a5

    const v5, -0x7b816ac0

    xor-int/2addr v4, v5

    const v5, 0x59372e6b

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06df\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x851

    const v5, -0x3b104763

    xor-int/2addr v4, v5

    const v5, -0x301ff3f5

    goto/16 :goto_0

    .line 32
    :sswitch_9
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u1a7b\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4cbb

    const v5, 0x59981202

    xor-int/2addr v4, v5

    const v5, -0xb6b5ed

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f87

    const v5, 0x440c20cd

    xor-int/2addr v4, v5

    const v5, -0x49cda467

    goto/16 :goto_0

    .line 156
    :sswitch_a
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xeb

    const v5, -0x41a8abb7

    xor-int/2addr v4, v5

    const v5, 0x3fa4a4ec

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u073d\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1197

    const v5, -0x3073ea9b

    xor-int/2addr v4, v5

    const v5, -0x4d751340

    goto/16 :goto_0

    .line 23
    :sswitch_c
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u06db\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x51bf

    const v5, 0x75183765

    xor-int/2addr v4, v5

    const v5, 0xb22b76f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x549d

    const v5, 0x295f628a

    xor-int/2addr v4, v5

    const v5, 0x2a8891ca

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e0\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7325

    const v5, 0x7a1b8e36

    xor-int/2addr v4, v5

    const v5, -0x56fcf6c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7507

    const v5, 0x75be4277

    xor-int/2addr v4, v5

    const v5, -0x2181a68e

    goto/16 :goto_0

    .line 253
    :sswitch_e
    iput p1, p0, Ll/ۘᩴۡ;->֫:I

    .line 38
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d8\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x282f

    const v5, -0x3b948562

    xor-int/2addr v4, v5

    const v5, -0x28815a4f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a5b

    const v5, 0x4bc9d61d    # 2.6455098E7f

    xor-int/2addr v4, v5

    const v5, -0xb035672

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73e24dbe -> :sswitch_3
        -0x73aa61b9 -> :sswitch_d
        -0x6be95578 -> :sswitch_8
        -0x663191aa -> :sswitch_5
        -0x611ca3dc -> :sswitch_4
        -0x5f69d3db -> :sswitch_a
        -0x5e90a563 -> :sswitch_5
        -0x5d2c918f -> :sswitch_b
        -0x46856c39 -> :sswitch_7
        -0x43e479dd -> :sswitch_e
        -0x416ba195 -> :sswitch_c
        -0x34981fe7 -> :sswitch_d
        -0x33de5b07 -> :sswitch_9
        -0x32e72b06 -> :sswitch_b
        -0x2e9376de -> :sswitch_0
        -0x2c4d4a16 -> :sswitch_6
        -0x26c15532 -> :sswitch_9
        -0x20b75d14 -> :sswitch_3
        -0xbe0b45a -> :sswitch_6
        0xcb6c2f8 -> :sswitch_1
        0x1c448492 -> :sswitch_2
        0x33dc9e1d -> :sswitch_c
        0x3e699113 -> :sswitch_8
        0x4827705f -> :sswitch_0
        0x4f24f74f -> :sswitch_2
        0x62afa51f -> :sswitch_e
        0x649d07e9 -> :sswitch_1
        0x6d5fa37f -> :sswitch_4
        0x71d8ab4b -> :sswitch_a
        0x74093c5e -> :sswitch_7
    .end sparse-switch
.end method
