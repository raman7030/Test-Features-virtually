.class public final Ll/᩻ܰܽ;
.super Ljava/lang/Object;
.source "79RC"


# instance fields
.field public final ֫:Ll/ܺۢᩴ;

.field public final ۧ:I

.field public ܽ:Ljava/lang/String;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x66915efb

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v3, Ll/᩺;->ۙۛܶ:I

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e0\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xacf

    const v6, -0x2801c1af

    xor-int/2addr v5, v6

    const v6, 0x28ab6fa0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x6e53

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 185
    :sswitch_0
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v4, :cond_1

    goto/16 :goto_1

    :sswitch_1
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v4, :cond_7

    goto/16 :goto_3

    .line 160
    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_2

    .line 204
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    const/4 v0, 0x0

    .line 214
    iput-boolean v0, p0, Ll/᩻ܰܽ;->ᩳ:Z

    .line 218
    iput p1, p0, Ll/᩻ܰܽ;->ۧ:I

    return-void

    .line 213
    :sswitch_5
    iput-object v0, p0, Ll/᩻ܰܽ;->֫:Ll/ܺۢᩴ;

    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_0

    const-string v4, "\u0736\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x464f

    const v6, -0x475efef3

    xor-int/2addr v5, v6

    const v6, 0x1fa01b08

    goto :goto_0

    :cond_0
    const-string v4, "\u06e2\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4533

    const v6, 0x1c24ca4b

    xor-int/2addr v5, v6

    const v6, 0x7e2971c9

    goto :goto_0

    .line 175
    :sswitch_6
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_2

    :cond_1
    const-string v4, "\u06eb\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4753

    const v6, -0x1fd2399f

    xor-int/2addr v5, v6

    const v6, -0x6bc84ac4

    goto :goto_0

    :cond_2
    const-string v4, "\u0733\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x21fb

    const v6, 0x58415f60

    xor-int/2addr v5, v6

    const v6, -0x4dde087a

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06ec\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x51f5

    const v6, 0x6f4bb3d4

    xor-int/2addr v5, v6

    const v6, -0x7192f16d

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06e8\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2337

    const v6, -0x2c98d19d

    xor-int/2addr v5, v6

    const v6, -0x631bbcea

    goto/16 :goto_0

    .line 67
    :sswitch_9
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a77\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6467

    const v6, -0x5271eb3

    xor-int/2addr v5, v6

    const v6, -0x3f5a9a94    # -5.1686306f

    goto/16 :goto_0

    .line 88
    :sswitch_a
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06e4\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5aad

    const v6, 0x71a04889

    xor-int/2addr v5, v6

    const v6, 0x342e2658

    goto/16 :goto_0

    .line 11
    :sswitch_b
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a79\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x50bf

    const v6, -0x62ef3484

    xor-int/2addr v5, v6

    const v6, 0x6e5e3b20

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06df\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2bb5

    const v6, 0x7cd55c83

    xor-int/2addr v5, v6

    const v6, -0x150f45b5

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1235

    const v6, 0x45dc5da0

    xor-int/2addr v5, v6

    const v6, -0x1c8f3664

    goto/16 :goto_0

    .line 81
    :sswitch_d
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_a

    :goto_2
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x21e1

    const v6, -0x43b04ccf    # -0.012677f

    xor-int/2addr v5, v6

    const v6, -0x4b7a056f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3eb5

    const v6, 0x4f63ab69

    xor-int/2addr v5, v6

    const v6, -0x5e7db425

    goto/16 :goto_0

    .line 213
    :sswitch_e
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    .line 99
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u1a7b\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2153

    const v6, -0x794c0477

    xor-int/2addr v5, v6

    const v6, 0x1774e857

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x12cb

    const v6, 0x476b9b4

    xor-int/2addr v5, v6

    const v6, 0x7551acb1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e294e97 -> :sswitch_d
        -0x792653a3 -> :sswitch_2
        -0x5e2b9190 -> :sswitch_1
        -0x5c8e829a -> :sswitch_0
        -0x56f866fb -> :sswitch_7
        -0x56cddda4 -> :sswitch_8
        -0x46c67b35 -> :sswitch_9
        -0x35f8ecc0 -> :sswitch_c
        -0x2b19d3c4 -> :sswitch_6
        -0x1e144aec -> :sswitch_d
        -0x1c0fecc4 -> :sswitch_2
        -0x1780ee79 -> :sswitch_8
        -0x14d8c37d -> :sswitch_0
        0x9a39965 -> :sswitch_3
        0x105ebca3 -> :sswitch_4
        0x1d48b548 -> :sswitch_e
        0x2f9c7189 -> :sswitch_5
        0x3269e987 -> :sswitch_a
        0x349bfd8d -> :sswitch_5
        0x372ee122 -> :sswitch_1
        0x37bbb3f2 -> :sswitch_9
        0x39189aad -> :sswitch_3
        0x3d71aa3f -> :sswitch_a
        0x46350af4 -> :sswitch_7
        0x64515cc5 -> :sswitch_4
        0x70871d9f -> :sswitch_b
        0x749a53bb -> :sswitch_c
        0x7aea12ba -> :sswitch_6
        0x7c497fec -> :sswitch_e
        0x7ee40679 -> :sswitch_b
    .end sparse-switch
.end method
