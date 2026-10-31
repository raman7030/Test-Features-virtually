.class public final synthetic Ll/᩵ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֫᩵᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/֫᩵᩷;I)V
    .locals 6

    const v0, 0x38bacc61

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7b\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x477

    const v5, 0x54ba2e68

    xor-int/2addr v4, v5

    const v5, -0x58d65ac6

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xc6f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_2

    .line 1
    :sswitch_0
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v3, :cond_9

    goto/16 :goto_2

    .line 3
    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a7a\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e7d

    const v5, -0x77988fc8

    xor-int/2addr v4, v5

    const v5, -0x4928e2cf

    goto :goto_0

    .line 2
    :sswitch_2
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v3, "\u1a79\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1037

    const v5, -0x61a458d8

    xor-int/2addr v4, v5

    const v5, -0x117265fc

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/᩵ۘ᩷;->᩹:I

    return-void

    .line 4
    :sswitch_5
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06d8\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x255b

    const v5, -0x1aa105a2

    xor-int/2addr v4, v5

    const v5, -0x28823fe9

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06da\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x161b

    const v5, 0x3d676d29

    xor-int/2addr v4, v5

    const v5, 0x7b100906

    goto/16 :goto_0

    .line 3
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_2
    const-string v3, "\u1a7b\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2d0b

    const v5, -0x67b4f5ec

    xor-int/2addr v4, v5

    const v5, -0x61c14bbe

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c6f

    const v5, 0xdd001b9

    xor-int/2addr v4, v5

    const v5, -0x2946148a

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12e1

    const v5, -0x3428a47c

    xor-int/2addr v4, v5

    const v5, -0x57d189cd

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u1a78\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5cf9

    const v5, 0xe32e505

    xor-int/2addr v4, v5

    const v5, -0x48631a17

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x605f

    const v5, 0x79a304bf

    xor-int/2addr v4, v5

    const v5, -0x66e496bf

    goto/16 :goto_0

    .line 1
    :sswitch_b
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1a5d

    const v5, 0x568c9d5b

    xor-int/2addr v4, v5

    const v5, 0x3de6b10b

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x730f

    const v5, -0x4511a933

    xor-int/2addr v4, v5

    const v5, 0x15a5411e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7485

    const v5, 0x767e6649

    xor-int/2addr v4, v5

    const v5, 0x3be9dfe1

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06eb\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x663b

    const v5, -0x7c03642

    xor-int/2addr v4, v5

    const v5, 0x489b14fb

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩵ۘ᩷;->᩸:Ll/֫᩵᩷;

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4261

    const v5, 0x15e7f61d

    xor-int/2addr v4, v5

    const v5, 0x77a903fe

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c5

    const v5, 0x41186f34

    xor-int/2addr v4, v5

    const v5, -0x7cf8e651

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f49ab2e -> :sswitch_2
        -0x6b492c2f -> :sswitch_4
        -0x66dd3a1f -> :sswitch_c
        -0x59ef2abb -> :sswitch_0
        -0x4a640c98 -> :sswitch_b
        -0x3bd28bed -> :sswitch_1
        -0x3ade34e4 -> :sswitch_e
        -0x324a2515 -> :sswitch_d
        -0x2785efdc -> :sswitch_5
        -0x229a6ac0 -> :sswitch_e
        -0x165335ea -> :sswitch_3
        -0x78e3c20 -> :sswitch_6
        0xe04db1 -> :sswitch_9
        0x196e6bf4 -> :sswitch_9
        0x1afc0884 -> :sswitch_d
        0x23a06434 -> :sswitch_0
        0x39bdf031 -> :sswitch_a
        0x3fdd133a -> :sswitch_a
        0x412d3908 -> :sswitch_5
        0x438f367c -> :sswitch_7
        0x46c92077 -> :sswitch_3
        0x4ceb479d -> :sswitch_7
        0x4e86e4b0 -> :sswitch_4
        0x615e62f7 -> :sswitch_1
        0x64c1ede8 -> :sswitch_c
        0x6626d21b -> :sswitch_8
        0x676d2ae5 -> :sswitch_2
        0x6aacb0f1 -> :sswitch_6
        0x6da27f9f -> :sswitch_b
        0x7c168695 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩵ۘ᩷;->᩸:Ll/֫᩵᩷;

    iget v1, p0, Ll/᩵ۘ᩷;->᩹:I

    invoke-static {v0, v1}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;I)V

    return-void
.end method
