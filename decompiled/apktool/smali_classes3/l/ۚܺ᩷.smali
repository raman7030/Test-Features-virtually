.class public final synthetic Ll/ۚܺ᩷;
.super Ljava/lang/Object;
.source "L61J"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܺ᩷;->᩸:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x4655da96

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v3, Ll/֡֡;->֫ۤܳ:I

    const-string v4, "\u06e1\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3a87

    const v6, -0x134d1dbe

    xor-int/2addr v5, v6

    const v6, -0x4591dd36

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x33fd

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 52
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_7

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u1a75\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x327f

    const v6, -0x7d49a37a

    xor-int/2addr v5, v6

    const v6, 0x24c1b392

    goto :goto_0

    .line 59
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_c

    goto/16 :goto_2

    .line 157
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v4

    if-eqz v4, :cond_a

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    return-void

    .line 164
    :sswitch_5
    iget-object v4, p0, Ll/ۚܺ᩷;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v4, v0}, Ll/ۗܺ᩷;->֫(Ll/᩷ܺ᩷;)V

    goto :goto_1

    .line 163
    :sswitch_6
    invoke-virtual {v0}, Ll/᩷ܺ᩷;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4815

    const v6, 0xa57c3df

    xor-int/2addr v5, v6

    const v6, 0x53378cbd

    goto :goto_0

    :sswitch_7
    return-void

    .line 2
    :sswitch_8
    move-object v0, p1

    check-cast v0, Ll/᩷ܺ᩷;

    .line 4
    sget v4, Ll/ۗܺ᩷;->֫ۧ:I

    if-eqz v0, :cond_1

    const-string v4, "\u05ab\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x12cf

    const v6, -0x173c88f3

    xor-int/2addr v5, v6

    const v6, 0x6da584f0

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xff7

    const v6, 0x598f3a0a

    xor-int/2addr v5, v6

    const v6, 0x4527c793

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_2

    const-string v4, "\u0733\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x25c1

    const v6, 0x3f5166d2

    xor-int/2addr v5, v6

    const v6, -0x4861b0cf

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u1a77\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5249

    const v6, -0x1e05ed4c

    xor-int/2addr v5, v6

    const v6, -0x1835aa4e

    goto/16 :goto_0

    .line 117
    :sswitch_a
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u1a74\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e65

    const v6, 0x5e31f769

    xor-int/2addr v5, v6

    const v6, -0x2a7f9388

    goto/16 :goto_0

    .line 113
    :sswitch_b
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u0733\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ccb

    const v6, -0x25c6d150

    xor-int/2addr v5, v6

    const v6, 0x7ba8c4ea

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_5

    :goto_2
    const-string v4, "\u06e4\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6b6b

    const v6, -0x6c5b5a9d

    xor-int/2addr v5, v6

    const v6, 0x2107f693

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d9\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2939

    const v6, 0x7d239e57

    xor-int/2addr v5, v6

    const v6, -0x5632e35e

    goto/16 :goto_0

    .line 132
    :sswitch_d
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u073f\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f75

    const v6, -0x53d1c84e

    xor-int/2addr v5, v6

    const v6, -0x72017f3f

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u0736\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5851

    const v6, -0x3f0e33ed

    xor-int/2addr v5, v6

    const v6, -0x57bdbe5b

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u05a1\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5a49

    const v6, -0xa512a1a

    xor-int/2addr v5, v6

    const v6, -0x71f77e17

    goto/16 :goto_0

    .line 146
    :sswitch_f
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a7a\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5827

    const v6, -0x2a092a88

    xor-int/2addr v5, v6

    const v6, 0x44bc8222

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a7b\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6d01

    const v6, -0x2a5c60fd

    xor-int/2addr v5, v6

    const v6, 0x33a9ca05

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d9\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c7f

    const v6, -0x187f16b3

    xor-int/2addr v5, v6

    const v6, 0x219f802f

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_4
    const-string v4, "\u06e1\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x488f

    const v6, 0x5c11d93

    xor-int/2addr v5, v6

    const v6, 0x4248bc80

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e7\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1ef3

    const v6, -0x3a42754

    xor-int/2addr v5, v6

    const v6, -0x4ef3a37f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ff63765 -> :sswitch_9
        -0x777bfa93 -> :sswitch_7
        -0x7148e801 -> :sswitch_1
        -0x6effd0b1 -> :sswitch_6
        -0x65b64dc6 -> :sswitch_7
        -0x5b748b0f -> :sswitch_a
        -0x59d75f03 -> :sswitch_3
        -0x4ef533f1 -> :sswitch_11
        -0x3f7943db -> :sswitch_8
        -0x3eeaa6d0 -> :sswitch_f
        -0x3d83d26e -> :sswitch_9
        -0x3d278bcf -> :sswitch_a
        -0x3c4aaaea -> :sswitch_0
        -0x3be87e9f -> :sswitch_f
        -0x366a7945 -> :sswitch_0
        -0x17758036 -> :sswitch_3
        -0xd027415 -> :sswitch_1
        -0xb664022 -> :sswitch_b
        -0x1dbaf7e -> :sswitch_4
        0x13eaa013 -> :sswitch_2
        0x1566b552 -> :sswitch_8
        0x2120f20c -> :sswitch_b
        0x25a3611a -> :sswitch_5
        0x2ea37e32 -> :sswitch_c
        0x3288d9df -> :sswitch_e
        0x3e1f0bcd -> :sswitch_d
        0x3f40e130 -> :sswitch_e
        0x441e197f -> :sswitch_4
        0x48d3d949 -> :sswitch_5
        0x4e3d3b46 -> :sswitch_6
        0x654dae23 -> :sswitch_11
        0x6c2b081a -> :sswitch_10
        0x715b7a51 -> :sswitch_c
        0x76ba85d8 -> :sswitch_2
        0x7761f28d -> :sswitch_d
        0x7b57b7c3 -> :sswitch_10
    .end sparse-switch
.end method
