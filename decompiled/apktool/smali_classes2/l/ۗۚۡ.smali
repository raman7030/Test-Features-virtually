.class public final synthetic Ll/ۗۚۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/֨ۡ֫;
.implements Ll/ܰ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۘۚۡ;


# direct methods
.method public constructor <init>(Ll/ۘۚۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۚۡ;->᩸:Ll/ۘۚۡ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2b3dbb13

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4861

    const v6, -0x1cdd8adc

    xor-int/2addr v5, v6

    const v6, 0x3b34ebae

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x6665

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 165
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_5

    goto/16 :goto_2

    .line 75
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v4, :cond_3

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_c

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v4, :cond_a

    goto/16 :goto_1

    .line 44
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto/16 :goto_1

    .line 124
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    const/4 p1, 0x0

    return p1

    .line 169
    :sswitch_5
    iget-object p1, p0, Ll/ۗۚۡ;->᩸:Ll/ۘۚۡ;

    invoke-static {p1, v0}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 0
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ܰ᩹᩵;

    invoke-interface {v0}, Ll/ܰ᩹᩵;->֫()Ll/ܺ᩹᩵;

    move-result-object v0

    .line 21
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v4

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7961

    const v6, -0x48b998d8

    xor-int/2addr v5, v6

    const v6, -0x4e3746fa

    goto :goto_0

    .line 6
    :sswitch_7
    instance-of v4, p1, Ll/ܰ᩹᩵;

    if-eqz v4, :cond_1

    const-string v4, "\u06d9\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x21bb

    const v6, 0x57b00842

    xor-int/2addr v5, v6

    const v6, 0x40f36bdf

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    return p1

    .line 2
    :sswitch_9
    instance-of v4, p1, Ll/֨ۡ֫;

    if-eqz v4, :cond_1

    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x30c5

    const v6, 0x27889abf

    xor-int/2addr v5, v6

    const v6, 0x4bdceefb    # 2.8958198E7f

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u073a\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c05

    const v6, -0x477ac019

    xor-int/2addr v5, v6

    const v6, -0x1d084818

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x479d

    const v6, 0x2c1db23

    xor-int/2addr v5, v6

    const v6, -0x6514231c

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_4

    :cond_3
    const-string v4, "\u06d7\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5b29

    const v6, -0x6ae7a6ee

    xor-int/2addr v5, v6

    const v6, -0xd437de1

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x38a5

    const v6, -0x180a420e

    xor-int/2addr v5, v6

    const v6, 0xbaed3d7

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d6\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7121

    const v6, -0x363e0a62

    xor-int/2addr v5, v6

    const v6, -0x32c38c13    # -1.9760712E8f

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_6

    :goto_1
    const-string v4, "\u1a76\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c79

    const v6, -0x45c4ae48

    xor-int/2addr v5, v6

    const v6, 0x3d8eb8af

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073f\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f2d

    const v6, 0x127b53d6

    xor-int/2addr v5, v6

    const v6, -0x940ba70

    goto/16 :goto_0

    .line 89
    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e8\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4e8f

    const v6, -0x671d26e5

    xor-int/2addr v5, v6

    const v6, 0x11db7627

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_8

    :goto_2
    const-string v4, "\u1a79\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3541

    const v6, 0x6af731b6

    xor-int/2addr v5, v6

    const v6, 0x577cbd75

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1565

    const v6, -0x17dbe2e3    # -3.1000206E24f

    xor-int/2addr v5, v6

    const v6, 0x57ae1b71

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u06d6\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x72e1

    const v6, 0x68d32aa1

    xor-int/2addr v5, v6

    const v6, 0x7e571d7d

    goto/16 :goto_0

    .line 164
    :sswitch_10
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v4

    if-ltz v4, :cond_b

    :cond_a
    const-string v4, "\u073f\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x645f

    const v6, -0x3617171b

    xor-int/2addr v5, v6

    const v6, -0x4eefb715

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a73\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1629

    const v6, -0x45712d91

    xor-int/2addr v5, v6

    const v6, -0x50560d08

    goto/16 :goto_0

    .line 168
    :sswitch_11
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_3
    const-string v4, "\u06eb\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x63cd

    const v6, 0x447d7a9c

    xor-int/2addr v5, v6

    const v6, -0xa656476

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e2\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4e61

    const v6, 0x5d928666

    xor-int/2addr v5, v6

    const v6, 0x376fc15a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fec908c -> :sswitch_b
        -0x76c49f99 -> :sswitch_10
        -0x703e6075 -> :sswitch_7
        -0x63598e52 -> :sswitch_1
        -0x565cf589 -> :sswitch_8
        -0x52af7eff -> :sswitch_11
        -0x50a4f9ef -> :sswitch_6
        -0x4987e636 -> :sswitch_4
        -0x3f1772de -> :sswitch_10
        -0x31db336d -> :sswitch_b
        -0x2bf879c1 -> :sswitch_1
        -0x29ad5c84 -> :sswitch_c
        -0x1c6cf0fb -> :sswitch_3
        -0x1799db88 -> :sswitch_9
        -0x154c6a0f -> :sswitch_d
        -0xfa561d4 -> :sswitch_d
        -0x8e8c14b -> :sswitch_8
        0x207a9c8 -> :sswitch_0
        0x2d665ff -> :sswitch_c
        0x10cf6342 -> :sswitch_6
        0x137960cf -> :sswitch_2
        0x1d8fe800 -> :sswitch_11
        0x252fd2c3 -> :sswitch_0
        0x28f28a82 -> :sswitch_f
        0x2d163625 -> :sswitch_a
        0x30a505fd -> :sswitch_3
        0x38e3bfca -> :sswitch_a
        0x3b9097b2 -> :sswitch_9
        0x3f92226d -> :sswitch_f
        0x4a1c60d2 -> :sswitch_2
        0x572b7008 -> :sswitch_5
        0x58ec2de3 -> :sswitch_e
        0x64cc742e -> :sswitch_5
        0x6d6409c9 -> :sswitch_7
        0x774ab169 -> :sswitch_e
        0x7deb280d -> :sswitch_4
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗۚۡ;->᩸:Ll/ۘۚۡ;

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ܺ᩹᩵;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗۚۡ;->᩸:Ll/ۘۚۡ;

    return-object v0
.end method

.method public final synthetic ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۗۚۡ;->᩸:Ll/ۘۚۡ;

    invoke-virtual {v0, p1}, Ll/ۘۚۡ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
