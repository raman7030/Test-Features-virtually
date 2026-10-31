.class public final synthetic Ll/ܺ۠᩷;
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

    iput-object p1, p0, Ll/ܺ۠᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 6

    const v0, -0x5ee5d46d

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v3, "\u1a75\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b79

    const v5, 0x2ff97711

    xor-int/2addr v4, v5

    const v5, -0x74442c53

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1a89

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_8

    goto/16 :goto_1

    :sswitch_1
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-nez v3, :cond_4

    goto/16 :goto_5

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-gtz v3, :cond_b

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_4

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    return-void

    :sswitch_5
    iget-object p1, p0, Ll/ܺ۠᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {p1}, Lbin/mt/plus/Main;->ۢ(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ll/ܰۚۡ;

    .line 1
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u05a8\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ac5

    const v5, -0x42bef630

    xor-int/2addr v4, v5

    const v5, 0x65742cd

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06eb\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x16a7

    const v5, 0x5ea66c9

    xor-int/2addr v4, v5

    const v5, 0x7121dfc1

    goto :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u073a\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x60b1

    const v5, -0x61aba5a6

    xor-int/2addr v4, v5

    const v5, -0x6b222788

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a76\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x617f

    const v5, 0x36b373fc

    xor-int/2addr v4, v5

    const v5, 0x4c31c2f4    # 4.659912E7f

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x729f

    const v5, -0x37c9a167

    xor-int/2addr v4, v5

    const v5, -0x6961b03c

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x14ab

    const v5, -0x76c7d077

    xor-int/2addr v4, v5

    const v5, -0x74431e01

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u05a8\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x321b

    const v5, 0x21e49cfa

    xor-int/2addr v4, v5

    const v5, 0x6bb90e77

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x36e1

    const v5, -0x3fecf65a

    xor-int/2addr v4, v5

    const v5, 0x5f811ef5

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e49

    const v5, -0x32beb1a5

    xor-int/2addr v4, v5

    const v5, -0x7b07fbbb

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u0736\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5605

    const v5, -0x69940189

    xor-int/2addr v4, v5

    const v5, -0x116902c1

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7757

    const v5, 0x591a1c28

    xor-int/2addr v4, v5

    const v5, -0x5a6cbfc0

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_4
    const-string v3, "\u06e2\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7eb1

    const v5, -0x18550961

    xor-int/2addr v4, v5

    const v5, 0xec58

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x220d

    const v5, -0x67473c71

    xor-int/2addr v4, v5

    const v5, 0x63df7589

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x555b

    const v5, -0x43b997b0

    xor-int/2addr v4, v5

    const v5, 0x5dd3371

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x523b

    const v5, 0x679f4a0d

    xor-int/2addr v4, v5

    const v5, -0x3bfddea1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c991811 -> :sswitch_8
        -0x677fc0df -> :sswitch_c
        -0x5fdca1aa -> :sswitch_5
        -0x51fdaa21 -> :sswitch_6
        -0x4cf375ed -> :sswitch_b
        -0x4b656e46 -> :sswitch_0
        -0x403ef405 -> :sswitch_4
        -0x3d334884 -> :sswitch_3
        -0x3b3935af -> :sswitch_d
        -0x39e6039b -> :sswitch_e
        -0x37aead75 -> :sswitch_8
        -0x36dcd9f8 -> :sswitch_a
        -0x20d350fb -> :sswitch_7
        -0x1ee3f170 -> :sswitch_a
        -0x18e9437c -> :sswitch_4
        -0xf5f62bf -> :sswitch_7
        0x7458fd6 -> :sswitch_3
        0x7e2e862 -> :sswitch_2
        0x1b21c11c -> :sswitch_d
        0x2ac9eb83 -> :sswitch_6
        0x2c1f28f9 -> :sswitch_e
        0x2c220686 -> :sswitch_0
        0x357514b7 -> :sswitch_c
        0x49bdf615 -> :sswitch_2
        0x549c8ca9 -> :sswitch_9
        0x58f7c555 -> :sswitch_1
        0x64da8b67 -> :sswitch_9
        0x6792fe8e -> :sswitch_5
        0x6e00aad1 -> :sswitch_1
        0x7ab0ca3e -> :sswitch_b
    .end sparse-switch
.end method
