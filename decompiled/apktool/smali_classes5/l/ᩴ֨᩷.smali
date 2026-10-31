.class public final synthetic Ll/ᩴ֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 6

    const v0, 0x5d18ca54

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a2d

    const v5, -0x40e0cdaa

    xor-int/2addr v4, v5

    const v5, 0x7d0eb748

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5569

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 2
    :sswitch_0
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_9

    goto/16 :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v3, :cond_6

    goto/16 :goto_4

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    :sswitch_5
    iget-object p1, p0, Ll/ᩴ֨᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {p1}, Lbin/mt/plus/Main;->ܺ(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    .line 1
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_0

    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7263

    const v5, 0x624e8354

    xor-int/2addr v4, v5

    const v5, -0x13b643d5

    goto :goto_0

    :cond_0
    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x2b

    const v5, 0x7a4a46b9

    xor-int/2addr v4, v5

    const v5, 0x64f4eef0

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06d8\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x59d

    const v5, -0x518646c6

    xor-int/2addr v4, v5

    const v5, -0x5db840c3

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_2

    :goto_1
    const-string v3, "\u06da\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1331

    const v5, 0x20c1ce3f

    xor-int/2addr v4, v5

    const v5, -0x36e5f01

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x511b

    const v5, 0x2d6e2461

    xor-int/2addr v4, v5

    const v5, -0x4bcc68fc

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06df\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a77

    const v5, -0x11045cf4

    xor-int/2addr v4, v5

    const v5, -0x5ef40bb6

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b83

    const v5, 0x470b897b

    xor-int/2addr v4, v5

    const v5, -0x74eb45b0

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u1a77\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4abd

    const v5, -0x624456db

    xor-int/2addr v4, v5

    const v5, 0x3e252917

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ed1

    const v5, -0xd4403c5

    xor-int/2addr v4, v5

    const v5, -0x1f5be21

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a1\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a19

    const v5, 0x7ae7704a

    xor-int/2addr v4, v5

    const v5, -0x6eb4eb7e

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a7b\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x394f

    const v5, -0x59842879

    xor-int/2addr v4, v5

    const v5, 0x38de97cb

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6547

    const v5, -0x134e270f

    xor-int/2addr v4, v5

    const v5, 0x67a7a32f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6049

    const v5, 0x10d94443

    xor-int/2addr v4, v5

    const v5, -0x1e84870b

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6001

    const v5, -0x386604cd

    xor-int/2addr v4, v5

    const v5, 0x16116ff0

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0733\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b81

    const v5, 0x4c92075d    # 7.6561128E7f

    xor-int/2addr v4, v5

    const v5, -0x7ec95c22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c1af7a3 -> :sswitch_6
        -0x789839c2 -> :sswitch_0
        -0x74684fe7 -> :sswitch_4
        -0x693e4c6b -> :sswitch_b
        -0x6495aec5 -> :sswitch_3
        -0x4ad148e3 -> :sswitch_b
        -0x4a8960b4 -> :sswitch_5
        -0x4a2ff378 -> :sswitch_e
        -0x410dea3f -> :sswitch_1
        -0x2bb538e5 -> :sswitch_3
        -0x215e8e2f -> :sswitch_9
        -0x200baa99 -> :sswitch_d
        -0x1f7d3b22 -> :sswitch_a
        -0x188f60db -> :sswitch_9
        -0x14868408 -> :sswitch_8
        -0xf899716 -> :sswitch_e
        0x19c5e009 -> :sswitch_c
        0x1c33a48c -> :sswitch_a
        0x25c7c205 -> :sswitch_4
        0x2a906ad4 -> :sswitch_7
        0x2c732b8f -> :sswitch_8
        0x32c2c041 -> :sswitch_1
        0x351fec48 -> :sswitch_0
        0x441ce99c -> :sswitch_c
        0x512d4632 -> :sswitch_5
        0x540399ea -> :sswitch_d
        0x5f6c0689 -> :sswitch_6
        0x6cf4db62 -> :sswitch_2
        0x6d65ebcb -> :sswitch_7
        0x7372f217 -> :sswitch_2
    .end sparse-switch
.end method
