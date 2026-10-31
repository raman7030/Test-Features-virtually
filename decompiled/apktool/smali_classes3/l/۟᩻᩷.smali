.class public abstract Ll/۟᩻᩷;
.super Ljava/lang/Object;
.source "I3YL"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/Object;

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/CharSequence;

.field public ᩳ:Lbin/mt/plugin/api/preference/PluginPreference$OnClickInterceptListener;

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x17643bbe

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06db\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1183

    const v6, -0x78ff844d

    xor-int/2addr v5, v6

    const v6, 0x69f77c74

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x8af

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 10
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v4, :cond_2

    goto/16 :goto_4

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v4, :cond_9

    goto/16 :goto_2

    .line 9
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 12
    :sswitch_4
    iput-boolean v0, p0, Ll/۟᩻᩷;->֫:Z

    return-void

    :sswitch_5
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u1a78\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4cf1

    const v6, 0x3838437f

    xor-int/2addr v5, v6

    const v6, -0x45d5e45f

    goto :goto_0

    .line 4
    :sswitch_6
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06e2\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x489f

    const v6, 0x5c9caa0c

    xor-int/2addr v5, v6

    const v6, 0x2ba9ce3f

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u06ec\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d85

    const v6, -0x1c954d3a

    xor-int/2addr v5, v6

    const v6, 0x3f122e51

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e4\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7ca3

    const v6, 0x503991e1

    xor-int/2addr v5, v6

    const v6, -0x1b2ae571

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u073a\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5b2d

    const v6, -0x4d1ea5a8

    xor-int/2addr v5, v6

    const v6, 0x5389966b

    goto/16 :goto_0

    .line 7
    :sswitch_9
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_5

    :goto_1
    const-string v4, "\u06da\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1f8f

    const v6, -0x2265341b

    xor-int/2addr v5, v6

    const v6, -0x4472aa03

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1621

    const v6, 0x514cc31c

    xor-int/2addr v5, v6

    const v6, -0x62fcb986

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u06d6\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb55

    const v6, -0x5d2ae021

    xor-int/2addr v5, v6

    const v6, -0x282ac0c0

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e4\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1f0b

    const v6, -0x60c19d88

    xor-int/2addr v5, v6

    const v6, -0x2226ff62

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u073f\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x26c3

    const v6, -0xda90cc8

    xor-int/2addr v5, v6

    const v6, -0x7af411a8

    goto/16 :goto_0

    .line 9
    :sswitch_c
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u0730\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5383

    const v6, 0x2224084b

    xor-int/2addr v5, v6

    const v6, -0x76668658

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06d9\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ddb

    const v6, 0x43919fa0

    xor-int/2addr v5, v6

    const v6, 0xf967aa8

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05a1\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6a1d

    const v6, -0x5de9e144

    xor-int/2addr v5, v6

    const v6, -0x67e0c157

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ll/۟᩻᩷;->᩻:Z

    .line 3
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a75\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x27d

    const v6, -0x6e696000

    xor-int/2addr v5, v6

    const v6, -0x607ebb1b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d8\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f01

    const v6, 0x55654bed

    xor-int/2addr v5, v6

    const v6, 0x5b7a5662

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x67a939f6 -> :sswitch_c
        -0x64d5586e -> :sswitch_5
        -0x645cd0cc -> :sswitch_5
        -0x4ffbc295 -> :sswitch_a
        -0x4e2cdf70 -> :sswitch_d
        -0x47c18fce -> :sswitch_7
        -0x3de53813 -> :sswitch_6
        -0x3124658b -> :sswitch_0
        -0x22398909 -> :sswitch_7
        -0x1d069fa3 -> :sswitch_4
        -0x18535726 -> :sswitch_e
        -0xf266c50 -> :sswitch_0
        -0xa30855a -> :sswitch_b
        -0x316af7a -> :sswitch_8
        0x264dc59 -> :sswitch_a
        0x7d69aff -> :sswitch_b
        0x81d6aa9 -> :sswitch_e
        0x11cd105b -> :sswitch_2
        0x1cae803d -> :sswitch_c
        0x2e2eabe2 -> :sswitch_2
        0x34664f47 -> :sswitch_4
        0x3883dfd1 -> :sswitch_6
        0x413b9365 -> :sswitch_8
        0x501790ee -> :sswitch_3
        0x5396ea95 -> :sswitch_9
        0x575ec96c -> :sswitch_d
        0x599acb3e -> :sswitch_3
        0x5ef812fb -> :sswitch_1
        0x66d927d0 -> :sswitch_1
        0x78b2b933 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public abstract ֫()Ll/ܰ᩻᩷;
.end method

.method public abstract ֫(Lbin/mt/plugin/api/LocalString;)V
.end method

.method public abstract ֫(Lbin/mt/plugin/api/PluginContext;)V
.end method
