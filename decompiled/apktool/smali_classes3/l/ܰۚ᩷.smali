.class public final synthetic Ll/ܰۚ᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;

.field public final synthetic ᩹:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/content/Intent;)V
    .locals 6

    const v0, 0x33fb6b81

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06dc\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4049

    const v5, 0x1de75953

    xor-int/2addr v4, v5

    const v5, -0x6138a2b5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5cd7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_a

    goto/16 :goto_3

    .line 3
    :sswitch_0
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e8\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x609b

    const v5, 0x7a05f1d9

    xor-int/2addr v4, v5

    const v5, 0x12cc771d

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v3, :cond_6

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ܰۚ᩷;->᩹:Landroid/content/Intent;

    return-void

    .line 1
    :sswitch_6
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06d9\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3bad

    const v5, -0x46a4c811

    xor-int/2addr v4, v5

    const v5, 0x65ef822b

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2669

    const v5, 0x1c828b96

    xor-int/2addr v4, v5

    const v5, -0x4ccc4c4d

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x393f

    const v5, 0xe059e19

    xor-int/2addr v4, v5

    const v5, -0x334f5965    # -9.2615896E7f

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5f1b

    const v5, -0xc01e344

    xor-int/2addr v4, v5

    const v5, 0x3a8ea8f

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_5

    :goto_1
    const-string v3, "\u06e4\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1619

    const v5, 0x25e79f7f

    xor-int/2addr v4, v5

    const v5, 0x4d32ca2f    # 1.87474672E8f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64bb

    const v5, 0x4a5885b9    # 3547502.2f

    xor-int/2addr v4, v5

    const v5, -0x78fcfff9

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x446d

    const v5, 0x4a95323f    # 4888863.5f

    xor-int/2addr v4, v5

    const v5, -0x5fb84a66

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x39

    const v5, -0x5d52adc

    xor-int/2addr v4, v5

    const v5, -0x4fb1d153

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4f63

    const v5, -0x349f97ca    # -1.4706742E7f

    xor-int/2addr v4, v5

    const v5, 0x4d70a7d0    # 2.523456E8f

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u05a1\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x208f

    const v5, -0x7b2956e4

    xor-int/2addr v4, v5

    const v5, -0x29517c31

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u1a7a\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6cf3

    const v5, -0x67de9b81

    xor-int/2addr v4, v5

    const v5, 0x282f4430

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x23c9

    const v5, -0x314e99ca

    xor-int/2addr v4, v5

    const v5, -0x2da7e494

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܰۚ᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06df\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e35

    const v5, -0xa9a0117

    xor-int/2addr v4, v5

    const v5, 0x3f606505

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4fa1

    const v5, -0x6a2df984

    xor-int/2addr v4, v5

    const v5, 0x8942cb3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f3f956b -> :sswitch_c
        -0x7e4b8234 -> :sswitch_a
        -0x78932b87 -> :sswitch_6
        -0x7863f78d -> :sswitch_b
        -0x74fb2843 -> :sswitch_2
        -0x73887806 -> :sswitch_8
        -0x437b0920 -> :sswitch_e
        -0x16e6b16b -> :sswitch_0
        -0xb68839c -> :sswitch_1
        -0xa19d516 -> :sswitch_7
        -0x68b56cd -> :sswitch_8
        0x352b490 -> :sswitch_4
        0x669da6f -> :sswitch_b
        0xaea534f -> :sswitch_d
        0x1c7056b2 -> :sswitch_4
        0x1fbb9fcd -> :sswitch_2
        0x2229f748 -> :sswitch_c
        0x25944fee -> :sswitch_6
        0x2c1cb183 -> :sswitch_a
        0x30a72507 -> :sswitch_1
        0x38378114 -> :sswitch_7
        0x4898825e -> :sswitch_9
        0x54c34f17 -> :sswitch_3
        0x55207397 -> :sswitch_3
        0x5a3587da -> :sswitch_d
        0x61a3621d -> :sswitch_5
        0x6a4046e9 -> :sswitch_e
        0x7384245b -> :sswitch_9
        0x7998d7eb -> :sswitch_0
        0x7eb67948 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܰۚ᩷;->᩸:Lbin/mt/plus/Main;

    iget-object v1, p0, Ll/ܰۚ᩷;->᩹:Landroid/content/Intent;

    invoke-static {v0, v1}, Lbin/mt/plus/Main;->֫(Lbin/mt/plus/Main;Landroid/content/Intent;)V

    return-void
.end method
