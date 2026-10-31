.class public final Ll/֡۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֨᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/ۚ۠᩷;


# direct methods
.method public constructor <init>(Ll/ۚ۠᩷;)V
    .locals 0

    .line 355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۠᩷;->᩸:Ll/ۚ۠᩷;

    return-void
.end method


# virtual methods
.method public final ֫(JJJ)V
    .locals 4

    const p1, 0x5ed31d5f

    sget p2, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    const-string v1, "\u06eb\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x47

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x135d

    const v3, -0x35d87aae

    xor-int/2addr v2, v3

    const v3, 0x68a015b5

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x271f

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 138
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_5

    goto/16 :goto_3

    .line 241
    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_b

    goto/16 :goto_2

    .line 255
    :sswitch_1
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\u06d9\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x58d7

    const v3, 0x4e13de11    # 6.2020102E8f

    xor-int/2addr v2, v3

    const v3, -0x24cdeae3

    goto :goto_0

    .line 48
    :sswitch_2
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    :goto_1
    const-string v1, "\u0736\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x51

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x40ed

    const v3, 0x32272633

    xor-int/2addr v2, v3

    const v3, 0x7f675543

    goto :goto_0

    .line 132
    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    .line 358
    :sswitch_5
    iget-object p1, p0, Ll/֡۠᩷;->᩸:Ll/ۚ۠᩷;

    iget-object p1, p1, Ll/ۚ۠᩷;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {p1, p3, p4, p5, p6}, Ll/᩺ۤܿ;->֫(JJ)V

    return-void

    :sswitch_6
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u06e8\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x6d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x443f

    const v3, -0x7ca2b3fd

    xor-int/2addr v2, v3

    const v3, -0x6390212

    goto :goto_0

    :sswitch_7
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u0730\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1c81

    const v3, 0x23d2b783

    xor-int/2addr v2, v3

    const v3, -0x40b551f9

    goto/16 :goto_0

    .line 227
    :sswitch_8
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_4

    :cond_3
    :goto_2
    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x71

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x74f5

    const v3, -0x9ae338c

    xor-int/2addr v2, v3

    const v3, 0x3bea9c46

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06dc\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x2cf3

    const v3, 0x51cf35b5

    xor-int/2addr v2, v3

    const v3, 0x10c1a8da

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u1a78\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x6b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x2b55

    const v3, -0x6731f2f

    xor-int/2addr v2, v3

    const v3, -0x37c01cc6

    goto/16 :goto_0

    .line 205
    :sswitch_9
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a77\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x5919

    const v3, 0x426abc83

    xor-int/2addr v2, v3

    const v3, -0x5b3c1e0e

    goto/16 :goto_0

    .line 88
    :sswitch_a
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x217

    const v3, -0x24db6a1f

    xor-int/2addr v2, v3

    const v3, -0x75d4c47a

    goto/16 :goto_0

    :sswitch_b
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_8

    goto :goto_4

    :cond_8
    const-string v1, "\u06db\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x5f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2033

    const v3, -0x6aa424ea

    xor-int/2addr v2, v3

    const v3, -0x1c9664a9

    goto/16 :goto_0

    .line 74
    :sswitch_c
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "\u05a1\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x3f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x959

    const v3, 0x1f45471b

    xor-int/2addr v2, v3

    const v3, -0x3c149a75

    goto/16 :goto_0

    .line 229
    :sswitch_d
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_a

    :goto_3
    const-string v1, "\u06e0\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x731b

    const v3, -0x161f15ca

    xor-int/2addr v2, v3

    const v3, 0x335aa065

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u0730\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x5b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6f73

    const v3, 0x564110ad

    xor-int/2addr v2, v3

    const v3, -0x63faf9b7

    goto/16 :goto_0

    .line 83
    :sswitch_e
    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u1a7a\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x2b57

    const v3, -0x6e17fc93

    xor-int/2addr v2, v3

    const v3, 0x4a84b999    # 4349132.5f

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u073d\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x657b

    const v3, -0x30e2f902

    xor-int/2addr v2, v3

    const v3, 0x3ddb2a63    # 0.10701444f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78cc36e0 -> :sswitch_9
        -0x671ab431 -> :sswitch_2
        -0x561b64d3 -> :sswitch_1
        -0x540f5628 -> :sswitch_c
        -0x44d80964 -> :sswitch_1
        -0x40360e16 -> :sswitch_7
        -0x3dd7dfcd -> :sswitch_b
        -0x3d8e77ed -> :sswitch_e
        -0x3c77c4ed -> :sswitch_a
        -0x24b37673 -> :sswitch_b
        -0x24520cab -> :sswitch_d
        -0x1e684dba -> :sswitch_5
        -0x17fdd3ee -> :sswitch_a
        -0xb7c75b4 -> :sswitch_6
        -0x6b057ff -> :sswitch_3
        0xa825562 -> :sswitch_4
        0x1042fc57 -> :sswitch_6
        0x18ec4bdf -> :sswitch_9
        0x1cf7e892 -> :sswitch_e
        0x1d77eb7e -> :sswitch_4
        0x25252644 -> :sswitch_d
        0x35bc8f8e -> :sswitch_c
        0x3b69fec7 -> :sswitch_7
        0x3bde4835 -> :sswitch_0
        0x3e06fb57 -> :sswitch_2
        0x58aea76d -> :sswitch_8
        0x58fa1090 -> :sswitch_8
        0x59539f2b -> :sswitch_5
        0x66c75ad1 -> :sswitch_3
        0x680195fa -> :sswitch_0
    .end sparse-switch
.end method

.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 363
    iget-object v0, p0, Ll/֡۠᩷;->᩸:Ll/ۚ۠᩷;

    iget-object v0, v0, Ll/ۚ۠᩷;->ܳ:Ll/᩺ۤܿ;

    invoke-static {v0}, Ll/ۘ᩶;->ܺ֡ۘ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
