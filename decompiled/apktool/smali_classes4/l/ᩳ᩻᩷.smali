.class public final Ll/ᩳ᩻᩷;
.super Ljava/lang/Object;
.source "K2SQ"


# static fields
.field public static ֫:Ljava/lang/String;

.field public static ۧ:Z

.field public static ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Ll/ۧ᩻᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۘۨ;->ܰۛ᩵(Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 1

    .line 29
    sget-object v0, Ll/ᩳ᩻᩷;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 0

    .line 33
    sput-object p0, Ll/ᩳ᩻᩷;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ܰۚۡ;)V
    .locals 6

    const v0, -0x356c9129    # -4831083.5f

    sget v1, Ll/᩺;->ۙۛܶ:I

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    const-string v3, "\u05a1\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6691

    const v5, -0x66c0886d

    xor-int/2addr v4, v5

    const v5, 0x21df80c0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7d3f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto/16 :goto_3

    .line 18
    :sswitch_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_3

    .line 22
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v3, :cond_c

    goto/16 :goto_3

    .line 23
    :sswitch_2
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    return-void

    :sswitch_4
    const/4 v3, 0x0

    .line 25
    sput-boolean v3, Ll/ᩳ᩻᩷;->ۧ:Z

    goto :goto_1

    :sswitch_5
    return-void

    .line 14
    :sswitch_6
    invoke-virtual {p0}, Ll/ܰۚۡ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "\u06eb\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6403

    const v5, 0x34ed3baa

    xor-int/2addr v4, v5

    const v5, -0x71479cd4

    goto :goto_0

    :cond_0
    :goto_1
    const-string v3, "\u073d\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x717f

    const v5, 0x22e14226

    xor-int/2addr v4, v5

    const v5, -0x64065c6b

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v3

    if-gtz v3, :cond_1

    const-string v3, "\u06e0\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4fc9

    const v5, 0xa36981f

    xor-int/2addr v4, v5

    const v5, 0x148b6b2c

    goto :goto_0

    :cond_1
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x929

    const v5, 0x27dc738e

    xor-int/2addr v4, v5

    const v5, 0x2b5b5acb

    goto/16 :goto_0

    .line 7
    :sswitch_8
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a76\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1857

    const v5, 0x66b204bc

    xor-int/2addr v4, v5

    const v5, 0x2e883d5e

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u06d8\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3173

    const v5, -0x7f3be050

    xor-int/2addr v4, v5

    const v5, 0x53ffc6ff

    goto/16 :goto_0

    .line 15
    :sswitch_a
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1165

    const v5, 0x266d5268

    xor-int/2addr v4, v5

    const v5, 0x255dc5d9

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4305

    const v5, 0x77b4028

    xor-int/2addr v4, v5

    const v5, 0x710fe92d

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e0\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d19

    const v5, 0x67f8fdfa

    xor-int/2addr v4, v5

    const v5, -0x324f5de6

    goto/16 :goto_0

    .line 6
    :sswitch_c
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06db\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x75d9

    const v5, -0x34ce1fc5    # -1.1657275E7f

    xor-int/2addr v4, v5

    const v5, 0x10a7e068

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3505

    const v5, -0x4c2f39c6

    xor-int/2addr v4, v5

    const v5, 0x6f36c8a7

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x71f7

    const v5, 0x38736ff0

    xor-int/2addr v4, v5

    const v5, -0x5daf8f3b

    goto/16 :goto_0

    .line 15
    :sswitch_e
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3aed

    const v5, 0x45a613e6

    xor-int/2addr v4, v5

    const v5, -0x13907c33

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e67

    const v5, -0x28e87b06

    xor-int/2addr v4, v5

    const v5, 0xce3c704

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d29

    const v5, -0x5c5cb5d

    xor-int/2addr v4, v5

    const v5, 0x67d58b13

    goto/16 :goto_0

    .line 6
    :sswitch_10
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_4
    const-string v3, "\u06e7\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x446b

    const v5, 0x7d4fb621

    xor-int/2addr v4, v5

    const v5, -0x2e94d9ac

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x55fb

    const v5, 0x73bdb04e

    xor-int/2addr v4, v5

    const v5, 0x39bcd198

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x757c43a9 -> :sswitch_2
        -0x7357acbe -> :sswitch_f
        -0x6c3815c1 -> :sswitch_0
        -0x6b349038 -> :sswitch_10
        -0x686b29cf -> :sswitch_7
        -0x6847374a -> :sswitch_6
        -0x63d12295 -> :sswitch_b
        -0x6357c8fe -> :sswitch_a
        -0x61f37006 -> :sswitch_c
        -0x51e5a051 -> :sswitch_5
        -0x4e00ee50 -> :sswitch_d
        -0x43dace19 -> :sswitch_3
        -0x389e3199 -> :sswitch_5
        -0x25de2329 -> :sswitch_1
        -0x1914b939 -> :sswitch_8
        -0x1587f5b -> :sswitch_6
        0xc808253 -> :sswitch_d
        0x1744f0b0 -> :sswitch_c
        0x202b08db -> :sswitch_3
        0x2194c7be -> :sswitch_10
        0x23b5dc6d -> :sswitch_2
        0x25443de6 -> :sswitch_b
        0x2645a51d -> :sswitch_9
        0x362e2616 -> :sswitch_8
        0x3bace5b0 -> :sswitch_4
        0x3e59c367 -> :sswitch_4
        0x44efa149 -> :sswitch_9
        0x52366b9a -> :sswitch_e
        0x5e8073ef -> :sswitch_f
        0x656dd132 -> :sswitch_1
        0x6aeaff73 -> :sswitch_0
        0x7343387b -> :sswitch_a
        0x7563390e -> :sswitch_e
        0x7839048f -> :sswitch_7
    .end sparse-switch
.end method

.method public static ֫(Z)V
    .locals 0

    .line 25
    sput-boolean p0, Ll/ᩳ᩻᩷;->ۧ:Z

    return-void
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 1

    .line 37
    sget-object v0, Ll/ᩳ᩻᩷;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 0

    .line 41
    sput-object p0, Ll/ᩳ᩻᩷;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ܽ()Z
    .locals 1

    .line 21
    sget-boolean v0, Ll/ᩳ᩻᩷;->ۧ:Z

    return v0
.end method
