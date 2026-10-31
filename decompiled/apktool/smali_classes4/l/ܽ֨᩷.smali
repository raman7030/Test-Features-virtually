.class public final synthetic Ll/ܽ֨᩷;
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

    iput-object p1, p0, Ll/ܽ֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 6

    const v0, 0x443e350

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    const-string v3, "\u073d\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7537

    const v5, -0x2d99128f

    xor-int/2addr v4, v5

    const v5, -0x3a22696

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1d3f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_8

    goto/16 :goto_3

    .line 4
    :sswitch_0
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-nez v3, :cond_4

    goto/16 :goto_2

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-lez v3, :cond_1

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    goto/16 :goto_2

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ܽ֨᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ܿ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 2
    :sswitch_6
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u1a75\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x46cd

    const v5, -0x6075bb85

    xor-int/2addr v4, v5

    const v5, -0x779fc0b4

    goto :goto_0

    :cond_0
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7d5b

    const v5, 0x2fa8e00c

    xor-int/2addr v4, v5

    const v5, -0xa4222e7

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5229

    const v5, 0x779c37ff

    xor-int/2addr v4, v5

    const v5, -0x453fb3a7

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06d9\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bdf

    const v5, 0x329f53f6

    xor-int/2addr v4, v5

    const v5, -0x498bebda

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a77\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51b3

    const v5, 0x1617189

    xor-int/2addr v4, v5

    const v5, 0x4c14a6c5    # 3.8968084E7f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_5

    :cond_4
    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x711

    const v5, -0x36fe506c    # -531193.25f

    xor-int/2addr v4, v5

    const v5, 0x4211c8f5

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7a\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xbbb

    const v5, -0xa750412

    xor-int/2addr v4, v5

    const v5, -0x1811022

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u06e2\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5cb1

    const v5, -0x382baf1c

    xor-int/2addr v4, v5

    const v5, 0x4646b158

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1681

    const v5, -0x58226f0f

    xor-int/2addr v4, v5

    const v5, -0x4dc77c87

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e85

    const v5, 0x4183bc83

    xor-int/2addr v4, v5

    const v5, 0xe709d2e

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x15a3

    const v5, 0x49214e78    # 660711.5f

    xor-int/2addr v4, v5

    const v5, -0x7bdc17c1    # -1.92672E-36f

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_a

    :goto_2
    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x407b

    const v5, 0x505cee75

    xor-int/2addr v4, v5

    const v5, -0x512e4858

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x61f9

    const v5, 0x18c00e98

    xor-int/2addr v4, v5

    const v5, 0x4b57763

    goto/16 :goto_0

    .line 4
    :sswitch_e
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3369

    const v5, 0x1fd5c641

    xor-int/2addr v4, v5

    const v5, 0x5b2419b5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2287

    const v5, -0x461b5c5f

    xor-int/2addr v4, v5

    const v5, -0x3bb0505d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x70f11d93 -> :sswitch_1
        -0x6d93b5a7 -> :sswitch_9
        -0x699198bc -> :sswitch_a
        -0x68073469 -> :sswitch_9
        -0x67c245a0 -> :sswitch_7
        -0x6324d45d -> :sswitch_b
        -0x59314483 -> :sswitch_2
        -0x4b369b23 -> :sswitch_3
        -0x4211d7aa -> :sswitch_5
        -0x3fdd6c81 -> :sswitch_7
        -0x3e11c8e5 -> :sswitch_2
        -0x29f97d17 -> :sswitch_d
        -0x24a67bb0 -> :sswitch_8
        -0x1768e0b9 -> :sswitch_c
        -0xc9e84cb -> :sswitch_6
        -0x7ef7061 -> :sswitch_c
        0x7017164 -> :sswitch_e
        0x93156c1 -> :sswitch_4
        0x106554a4 -> :sswitch_d
        0x193e12cc -> :sswitch_6
        0x1d02c82e -> :sswitch_0
        0x1fce0419 -> :sswitch_8
        0x226acb7e -> :sswitch_0
        0x22d00099 -> :sswitch_1
        0x2f04365a -> :sswitch_3
        0x3426e9d5 -> :sswitch_b
        0x4b72fe57 -> :sswitch_e
        0x4e9ed0ad -> :sswitch_a
        0x7148a536 -> :sswitch_5
        0x7b62e5c4 -> :sswitch_4
    .end sparse-switch
.end method
