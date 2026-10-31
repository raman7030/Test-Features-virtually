.class public final synthetic Ll/ۜۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ᩸:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۘ᩷;->᩸:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x72e19785

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v4, "\u1a78\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c85

    const v6, -0xb3091cb

    xor-int/2addr v5, v6

    const v6, 0x233be312

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x3b31

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1213
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_3

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v4, :cond_a

    goto/16 :goto_3

    .line 727
    :sswitch_1
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06db\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6bb9

    const v6, -0x3b291237

    xor-int/2addr v5, v6

    const v6, 0x652e044c

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    .line 1732
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto/16 :goto_3

    .line 823
    :sswitch_4
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    const/4 v0, 0x0

    return v0

    .line 1978
    :sswitch_5
    invoke-static {v0}, Ll/֫ۧ;->ܶۜܰ(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :sswitch_6
    iget-object v0, p0, Ll/ۜۘ᩷;->᩸:Ll/֡ۚۢ;

    .line 1299
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x93

    const v6, 0x787853df

    xor-int/2addr v5, v6

    const v6, -0x23b61d82

    goto :goto_0

    :cond_2
    :goto_1
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x375f

    const v6, 0x3d53383e

    xor-int/2addr v5, v6

    const v6, -0x4e32d33d

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e2\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5c1f

    const v6, 0x3ba840b9

    xor-int/2addr v5, v6

    const v6, -0x4036a63

    goto/16 :goto_0

    .line 1607
    :sswitch_7
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u1a7b\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1519

    const v6, -0x77400990

    xor-int/2addr v5, v6

    const v6, 0x20702864

    goto/16 :goto_0

    .line 1174
    :sswitch_8
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x11eb

    const v6, -0x6b4b8c10

    xor-int/2addr v5, v6

    const v6, 0x5eca58cb

    goto/16 :goto_0

    .line 775
    :sswitch_9
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u0733\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6f29

    const v6, -0x5c31b975

    xor-int/2addr v5, v6

    const v6, 0x6f7db93f

    goto/16 :goto_0

    .line 849
    :sswitch_a
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06d6\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x464d

    const v6, -0x40a847e2

    xor-int/2addr v5, v6

    const v6, 0x75e410e4

    goto/16 :goto_0

    .line 117
    :sswitch_b
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u1a75\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14df

    const v6, 0x1fbc7a4f

    xor-int/2addr v5, v6

    const v6, -0x78b1389e

    goto/16 :goto_0

    .line 666
    :sswitch_c
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_9

    :goto_2
    const-string v4, "\u1a74\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c39

    const v6, 0xbc186fc

    xor-int/2addr v5, v6

    const v6, -0x52fd5f40

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d9\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e97

    const v6, -0x74b8fe54

    xor-int/2addr v5, v6

    const v6, 0x313b4cd1

    goto/16 :goto_0

    .line 1844
    :sswitch_d
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-ltz v4, :cond_b

    :cond_a
    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x371b

    const v6, -0x19e5acf4

    xor-int/2addr v5, v6

    const v6, 0x4b649796    # 1.4981014E7f

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7a\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa31

    const v6, -0x6a306af7

    xor-int/2addr v5, v6

    const v6, -0x5807e9e3

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Ll/֫᩵᩷;->ۛۧ:I

    .line 1677
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_c

    :goto_3
    const-string v4, "\u06eb\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xfb3

    const v6, -0x4cb25c9f

    xor-int/2addr v5, v6

    const v6, 0x727eccf0

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0736\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5dbb

    const v6, -0x6887157

    xor-int/2addr v5, v6

    const v6, 0x2ea7674d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f47f838 -> :sswitch_3
        -0x7e711b7e -> :sswitch_2
        -0x75a8a686 -> :sswitch_8
        -0x5dfd0b2f -> :sswitch_6
        -0x5b231035 -> :sswitch_9
        -0x582fb3c1 -> :sswitch_8
        -0x3f832738 -> :sswitch_e
        -0x35d99621 -> :sswitch_2
        -0x33f659e7 -> :sswitch_9
        -0x2c904dd4 -> :sswitch_b
        -0x18fb936b -> :sswitch_3
        -0x667b6cb -> :sswitch_1
        -0x4378b1e -> :sswitch_0
        0x1089c057 -> :sswitch_6
        0x1d9728f2 -> :sswitch_e
        0x1dadd177 -> :sswitch_1
        0x24b7fde1 -> :sswitch_0
        0x25fecd88 -> :sswitch_7
        0x28453fe8 -> :sswitch_a
        0x29d0b9ba -> :sswitch_b
        0x388e1af9 -> :sswitch_c
        0x4669e7b2 -> :sswitch_4
        0x4b3410dd -> :sswitch_c
        0x553b23b9 -> :sswitch_4
        0x56422bbe -> :sswitch_7
        0x565418bb -> :sswitch_d
        0x61743c32 -> :sswitch_5
        0x7341ad13 -> :sswitch_5
        0x77f9b36a -> :sswitch_a
        0x786e1b98 -> :sswitch_d
    .end sparse-switch
.end method
