.class public final synthetic Ll/۟֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟֨ۡ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x47d59fe0    # 109375.75f

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v3, Ll/۠;->ܺܺܶ:I

    const-string v4, "\u06e4\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2d77

    const v6, -0x23fe97fb

    xor-int/2addr v5, v6

    const v6, 0x54009e4f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x3221

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    iget-object v0, p0, Ll/۟֨ۡ;->᩸:Ljava/lang/String;

    .line 56
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :sswitch_0
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-lez v4, :cond_9

    goto/16 :goto_3

    .line 53
    :sswitch_1
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_7

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    .line 36
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto/16 :goto_3

    .line 74
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 4
    :sswitch_5
    check-cast p1, Ll/ܺ۠ۡ;

    .line 128
    iput-object v0, p1, Ll/ܺ۠ۡ;->ۡ:Ljava/lang/String;

    return-void

    :cond_0
    const-string v4, "\u073f\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x408d

    const v6, 0x23f51b86

    xor-int/2addr v5, v6

    const v6, -0x37a285da

    goto :goto_0

    :sswitch_6
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5733

    const v6, 0x6fc2c8fe

    xor-int/2addr v5, v6

    const v6, 0x740d1b46

    goto :goto_0

    :cond_2
    const-string v4, "\u05a1\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5109

    const v6, 0x51338080

    xor-int/2addr v5, v6

    const v6, -0x3ab89fc

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u0733\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1d5

    const v6, 0x49a66bc1

    xor-int/2addr v5, v6

    const v6, 0x69266ac8

    goto/16 :goto_0

    .line 18
    :sswitch_8
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u1a75\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x703d

    const v6, 0x462e3325

    xor-int/2addr v5, v6

    const v6, -0x5575b609

    goto/16 :goto_0

    .line 95
    :sswitch_9
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x246b

    const v6, -0x5dd12965

    xor-int/2addr v5, v6

    const v6, -0x7bb97806

    goto/16 :goto_0

    .line 111
    :sswitch_a
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u0730\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ac9

    const v6, -0x1b1879dc

    xor-int/2addr v5, v6

    const v6, -0x6a2cf55

    goto/16 :goto_0

    .line 127
    :sswitch_b
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_8

    :cond_7
    const-string v4, "\u0736\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x665

    const v6, 0x6fddf5e7

    xor-int/2addr v5, v6

    const v6, 0x9fbbc21

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06db\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x38c1

    const v6, 0x7144fae0

    xor-int/2addr v5, v6

    const v6, -0x9665c75

    goto/16 :goto_0

    .line 119
    :sswitch_c
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a79\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3651

    const v6, -0x337855f9    # -7.1127096E7f

    xor-int/2addr v5, v6

    const v6, 0x71e92479

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x789b

    const v6, 0xc280f40

    xor-int/2addr v5, v6

    const v6, 0x6ce67616

    goto/16 :goto_0

    .line 47
    :sswitch_d
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v4

    if-eqz v4, :cond_b

    :goto_3
    const-string v4, "\u06eb\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x15ef

    const v6, 0x4c144e24    # 3.8877328E7f

    xor-int/2addr v5, v6

    const v6, -0x7e8b6c54

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e4\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x44df

    const v6, -0x65c0fb2

    xor-int/2addr v5, v6

    const v6, 0xe8903cb

    goto/16 :goto_0

    .line 51
    :sswitch_e
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u1a78\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e3f

    const v6, -0x5c28924d

    xor-int/2addr v5, v6

    const v6, -0xb183ef1

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d6\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3393

    const v6, 0x54d21bab

    xor-int/2addr v5, v6

    const v6, 0x13f8bed3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b28d0f6 -> :sswitch_9
        -0x7805a2a4 -> :sswitch_6
        -0x6381daf6 -> :sswitch_5
        -0x597cd117 -> :sswitch_1
        -0x3fe52550 -> :sswitch_1
        -0x3d0ce0b5 -> :sswitch_d
        -0x35d10f0d -> :sswitch_b
        -0x34dacafb -> :sswitch_e
        -0x2b90cc48 -> :sswitch_9
        -0x1a0f7fcb -> :sswitch_e
        0x687fff2 -> :sswitch_a
        0x6c3db63 -> :sswitch_d
        0xd92e303 -> :sswitch_3
        0x18cb3de4 -> :sswitch_0
        0x202e6456 -> :sswitch_3
        0x25ec7d61 -> :sswitch_7
        0x2b72a3c2 -> :sswitch_b
        0x30848b5f -> :sswitch_4
        0x32f0f2c2 -> :sswitch_7
        0x35b69ff3 -> :sswitch_8
        0x391d5ce2 -> :sswitch_c
        0x3c520d9d -> :sswitch_5
        0x3d05375a -> :sswitch_6
        0x42602c82 -> :sswitch_8
        0x5aaa57eb -> :sswitch_c
        0x5ce80903 -> :sswitch_0
        0x5dd8e1eb -> :sswitch_2
        0x6c46747f -> :sswitch_4
        0x6e5bed50 -> :sswitch_a
        0x6ff49653 -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
