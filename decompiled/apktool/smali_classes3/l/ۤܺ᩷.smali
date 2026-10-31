.class public Ll/ۤܺ᩷;
.super Ll/ᩳۡ;
.source "4651"


# instance fields
.field public ۙ:Landroid/graphics/Paint;

.field public ᩶:I

.field public ᩸:Ll/ۨܺ᩷;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v0, 0x0

    const v1, 0x60000ee3

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    .line 17
    invoke-direct {p0, p1, p2}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "\u06eb\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4ef

    const v4, 0x31a7c134

    xor-int/2addr p2, v4

    const v4, 0x51432a8f

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x6919

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr p2, v1

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto :goto_1

    .line 15
    :sswitch_0
    sget p1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz p1, :cond_a

    goto :goto_1

    .line 12
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    .line 5
    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez p1, :cond_5

    :goto_1
    const-string p1, "\u05ab\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x9

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3537

    const v4, -0x2c44420a

    xor-int/2addr p2, v4

    const v4, 0x2c6c8109

    goto :goto_0

    .line 11
    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 12
    :sswitch_4
    iput-boolean v0, p0, Ll/ۤܺ᩷;->᩹:Z

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p1, "\u073d\u1a7a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7a71

    const v4, -0x3f49ba9c

    xor-int/2addr p2, v4

    const v4, 0x40945b45

    goto :goto_0

    .line 13
    :sswitch_6
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz p1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p1, "\u1a7b\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x7ebb

    const v4, 0x6897f34b

    xor-int/2addr p2, v4

    const v4, -0x4f604ea7

    goto :goto_0

    .line 15
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p1, "\u06db\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1cf7

    const v4, -0xcedc192

    xor-int/2addr p2, v4

    const v4, -0x445d4e92

    goto/16 :goto_0

    .line 10
    :sswitch_8
    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string p1, "\u06ec\u06e7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x275d

    const v4, 0x7d33f8d4

    xor-int/2addr p2, v4

    const v4, 0x23785b46

    goto/16 :goto_0

    :sswitch_9
    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string p1, "\u06db\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x36f3

    const v4, -0x4763085c

    xor-int/2addr p2, v4

    const v4, -0x3398ba3b    # -6.0626708E7f

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz p1, :cond_6

    :cond_5
    const-string p1, "\u1a74\u06d9"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x1b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5d11

    const v4, 0x559cfeaf

    xor-int/2addr p2, v4

    const v4, 0x3e68e241

    goto/16 :goto_0

    :cond_6
    const-string p1, "\u06e2\u06eb"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6cab

    const v4, 0x78610710

    xor-int/2addr p2, v4

    const v4, 0x71e60cab

    goto/16 :goto_0

    :sswitch_b
    sget p1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p1, :cond_8

    :cond_7
    const-string p1, "\u0733\u1a74"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7a01

    const v4, -0x1e1f5b38

    xor-int/2addr p2, v4

    const v4, -0xd970d19

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u06e4\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x6b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x1d11

    const v4, -0x74cf981

    xor-int/2addr p2, v4

    const v4, 0x55119e10    # 1.00067537E13f

    goto/16 :goto_0

    .line 15
    :sswitch_c
    sget-boolean p1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    const-string p1, "\u0730\u073f"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x275

    const v4, -0xa6fd54b

    xor-int/2addr p2, v4

    const v4, -0x18e7e8a5

    goto/16 :goto_0

    :sswitch_d
    sget p1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p1, :cond_b

    :cond_a
    :goto_2
    const-string p1, "\u1a73\u05a1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x735f

    const v4, -0x1e35bce7

    xor-int/2addr p2, v4

    const v4, -0x19edfbdf

    goto/16 :goto_0

    :cond_b
    const-string p1, "\u06e0\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x6d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2d4d

    const v4, -0x1efdbd51

    xor-int/2addr p2, v4

    const v4, -0x50dbe635

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result p1

    if-gtz p1, :cond_c

    :goto_3
    const-string p1, "\u06d6\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6551

    const v4, 0xf5162ce

    xor-int/2addr p2, v4

    const v4, 0x3b91014e

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u0733\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x6c9d

    const v4, -0x5bad633d

    xor-int/2addr p2, v4

    const v4, -0x864de2c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73a514c8 -> :sswitch_1
        -0x70cd715e -> :sswitch_3
        -0x62e64b31 -> :sswitch_6
        -0x5e2ede71 -> :sswitch_a
        -0x57e9fbe5 -> :sswitch_e
        -0x535b9d5f -> :sswitch_2
        -0x4fe093d4 -> :sswitch_0
        -0x4ac5599f -> :sswitch_9
        -0x3e5cd06c -> :sswitch_b
        -0x3a86836c -> :sswitch_b
        -0x37229849 -> :sswitch_d
        -0x30708cb3 -> :sswitch_7
        -0x2d7be117 -> :sswitch_c
        -0x2b2c2a7a -> :sswitch_2
        -0xb6740fa -> :sswitch_6
        0xae6c8df -> :sswitch_1
        0x109e0412 -> :sswitch_5
        0x12fd0f59 -> :sswitch_3
        0x1b6c32ac -> :sswitch_d
        0x1d2a0548 -> :sswitch_0
        0x1e8a10ec -> :sswitch_c
        0x20905e49 -> :sswitch_8
        0x412f5921 -> :sswitch_4
        0x52a4e241 -> :sswitch_a
        0x575d0e22 -> :sswitch_9
        0x5c6b0b49 -> :sswitch_5
        0x5f8e1931 -> :sswitch_8
        0x662f7f58 -> :sswitch_4
        0x77f8291a -> :sswitch_e
        0x7acde0d8 -> :sswitch_7
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const/4 v0, 0x0

    const v1, -0x48c0c84c

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    .line 25
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u06e4\u06da"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x921

    const p3, 0x3e61c842

    xor-int/2addr p2, p3

    const p3, 0x42a98ed1

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v2

    mul-int/lit16 p3, p3, 0x7279

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 12
    iput-boolean v0, p0, Ll/ۤܺ᩷;->᩹:Z

    return-void

    :sswitch_0
    sget p1, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez p1, :cond_7

    goto/16 :goto_3

    .line 3
    :sswitch_1
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-gez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p1, "\u06d9\u06d8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x2263

    const p3, -0x2498bec8

    xor-int/2addr p2, p3

    const p3, 0x23978e34

    goto :goto_0

    :sswitch_2
    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-gez p1, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto/16 :goto_3

    .line 14
    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 13
    :sswitch_5
    sget p1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz p1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p1, "\u1a74\u1a74"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x11

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x75c7

    const p3, 0x7100751e

    xor-int/2addr p2, p3

    const p3, 0x42128e6a

    goto :goto_0

    .line 11
    :sswitch_6
    sget-boolean p1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz p1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p1, "\u1a73\u05ab"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0xf91

    const p3, -0x60d8a4f2

    xor-int/2addr p2, p3

    const p3, -0x5f34519b

    goto :goto_0

    .line 16
    :sswitch_7
    sget p1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz p1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string p1, "\u1a73\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7c83

    const p3, 0x8bef513

    xor-int/2addr p2, p3

    const p3, -0x7403ddf0

    goto/16 :goto_0

    .line 18
    :sswitch_8
    sget p1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string p1, "\u06d9\u06e7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x3

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x7715

    const p3, 0x7a71c9db

    xor-int/2addr p2, p3

    const p3, 0x13a2b541

    goto/16 :goto_0

    :sswitch_9
    sget p1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz p1, :cond_5

    goto :goto_2

    :cond_5
    const-string p1, "\u0730\u06eb"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5ba9

    const p3, -0x4be7c496

    xor-int/2addr p2, p3

    const p3, 0x6c8da1a6

    goto/16 :goto_0

    .line 9
    :sswitch_a
    sget p1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz p1, :cond_6

    goto :goto_1

    :cond_6
    const-string p1, "\u1a74\u073d"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3b9f

    const p3, -0x3b676664

    xor-int/2addr p2, p3

    const p3, 0x2b85d626

    goto/16 :goto_0

    .line 8
    :sswitch_b
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_8

    :cond_7
    :goto_1
    const-string p1, "\u06e8\u05ab"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3d0b

    const p3, -0x1abdfdf0

    xor-int/2addr p2, p3

    const p3, -0x4cadb0f2

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u06e4\u05ab"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0xf17

    const p3, 0x31096dbc    # 1.99985E-9f

    xor-int/2addr p2, p3

    const p3, -0x1cd3a4e7

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result p1

    if-gtz p1, :cond_9

    :goto_2
    const-string p1, "\u05a8\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x59

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x190f

    const p3, -0xd5a2106

    xor-int/2addr p2, p3

    const p3, -0x2d7a1246

    goto/16 :goto_0

    :cond_9
    const-string p1, "\u06eb\u1a78"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x49

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2879

    const p3, -0x5232ddfe

    xor-int/2addr p2, p3

    const p3, -0x3566420

    goto/16 :goto_0

    .line 21
    :sswitch_d
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz p1, :cond_b

    :cond_a
    const-string p1, "\u073d\u0736"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x6f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x339d

    const p3, 0x39d2ac03    # 4.018248E-4f

    xor-int/2addr p2, p3

    const p3, -0x3abf93e8

    goto/16 :goto_0

    :cond_b
    const-string p1, "\u05a8\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x23

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x25d5

    const p3, 0x7a97489a

    xor-int/2addr p2, p3

    const p3, 0x5a2c07b2

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p1, :cond_c

    :goto_3
    const-string p1, "\u05ab\u0733"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3aab

    const p3, -0x2ceb9e70

    xor-int/2addr p2, p3

    const p3, -0xc7d7a9f

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06da\u06e2"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x59

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x692f

    const p3, -0x60bc815

    xor-int/2addr p2, p3

    const p3, -0x5f52f601

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74a51a18 -> :sswitch_d
        -0x67d66a3d -> :sswitch_1
        -0x668a1134 -> :sswitch_5
        -0x6617c48b -> :sswitch_b
        -0x65cd600d -> :sswitch_0
        -0x57a38c20 -> :sswitch_c
        -0x4d82ed40 -> :sswitch_9
        -0x49330446 -> :sswitch_4
        -0x4593557c -> :sswitch_2
        -0x3cf601a3 -> :sswitch_c
        -0x252c8854 -> :sswitch_6
        -0x22c97d81 -> :sswitch_6
        -0x229457ac -> :sswitch_a
        -0x21ac273e -> :sswitch_7
        -0x12111556 -> :sswitch_1
        -0x68a4805 -> :sswitch_0
        0x69f1d92 -> :sswitch_3
        0x1460c800 -> :sswitch_e
        0x16b6a5ae -> :sswitch_4
        0x291f3b3b -> :sswitch_d
        0x324a72fb -> :sswitch_8
        0x39336852 -> :sswitch_5
        0x3a44deba -> :sswitch_8
        0x3f5a7ff6 -> :sswitch_3
        0x432a84a7 -> :sswitch_2
        0x43c6d4fa -> :sswitch_b
        0x540e577c -> :sswitch_e
        0x66870e03 -> :sswitch_9
        0x6d53ef15 -> :sswitch_7
        0x7ad77ff1 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 20

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0xe3995a1

    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v15, "\u06d9\u1a74"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x31

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x710f

    const v17, -0x46aec026

    xor-int v1, v1, v17

    const v17, -0x2b2b21c6

    xor-int v15, v15, v17

    move-object v7, v6

    move-object v11, v10

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0xe3995a1

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x3b7d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v16, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v2, p1

    move/from16 v16, v15

    .line 51
    iget-object v1, v0, Ll/ۤܺ᩷;->ۙ:Landroid/graphics/Paint;

    sget v3, Ll/᩹֡᩷;->ᩳ֫:I

    sget v15, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v15, :cond_b

    move-object/from16 v17, v1

    goto/16 :goto_5

    .line 34
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_0

    :goto_1
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_8

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    .line 53
    :sswitch_5
    iget v1, v0, Ll/ۤܺ᩷;->᩶:I

    int-to-float v1, v1

    move/from16 v16, v15

    iget-object v15, v0, Ll/ۤܺ᩷;->ۙ:Landroid/graphics/Paint;

    move-object/from16 v17, v2

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v2, v9, v12, v1, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_7

    :sswitch_6
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 53
    invoke-virtual {v11}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    add-float v12, v1, v10

    .line 41
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x5b81

    const v18, 0xa5db208

    xor-int v15, v15, v18

    const v18, 0x3e0672a

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    iget v1, v0, Ll/ۤܺ᩷;->᩶:I

    int-to-float v10, v1

    iget-object v11, v0, Ll/ۤܺ᩷;->ۙ:Landroid/graphics/Paint;

    .line 4
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u1a7a\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x6943

    const v18, -0x79678b40

    xor-int v15, v15, v18

    const v18, 0x74d4f45

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    sub-float v9, v6, v8

    .line 29
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_5

    move-object/from16 v1, v17

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u073a\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x7e2d

    const v18, 0x131dce2f

    xor-int v15, v15, v18

    const v18, -0x5c348d76

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v8

    .line 17
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u073a\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x747f

    const v18, -0x5dfe1bc6

    xor-int v15, v15, v18

    const v18, 0x8a81ed

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    int-to-float v6, v5

    .line 52
    iget-object v7, v0, Ll/ۤܺ᩷;->ۙ:Landroid/graphics/Paint;

    .line 48
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    const-string v1, "\u06da\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x1267

    const v18, -0xba066dc

    xor-int v15, v15, v18

    const v18, 0xa8bf353

    goto/16 :goto_9

    :cond_7
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x7f

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x6341

    const v18, 0x6447e8c

    xor-int v15, v15, v18

    const v18, -0x7853dacf

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    iget v1, v0, Ll/ۤܺ᩷;->᩶:I

    sub-int v5, v4, v1

    .line 15
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u1a73\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x50a9

    const v18, 0x5df03a2c

    xor-int v15, v15, v18

    const v18, 0x2a674d7c

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    invoke-static/range {p0 .. p0}, Ll/֡ۜ;->֨ܳᩳ(Ljava/lang/Object;)I

    move-result v4

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_9

    :goto_3
    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x1f37

    const v18, -0x3ce8231f

    xor-int v15, v15, v18

    const v18, 0xa850b00

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u06d8\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x37

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x5123

    const v18, -0x657955c0

    xor-int v15, v15, v18

    const v18, -0x6717820d

    goto/16 :goto_9

    :sswitch_d
    move-object v1, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 51
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    sget v15, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v15, :cond_a

    :goto_4
    const-string v15, "\u073f\u06d9"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    move-object/from16 v17, v1

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, -0x1d83

    const v18, 0x7dc4d055

    xor-int v1, v1, v18

    const v18, -0x425fd38c

    goto :goto_6

    :cond_a
    move-object/from16 v17, v1

    const-string v1, "\u06e1\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x61fd

    const v18, -0x7c9bea71

    xor-int v15, v15, v18

    const v18, -0x52c1a83f

    goto/16 :goto_9

    :goto_5
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x40f1

    const v18, 0x4bcc245

    xor-int v15, v15, v18

    const v18, -0x461083ef    # -4.567807E-4f

    goto/16 :goto_9

    :cond_b
    const-string v15, "\u1a78\u073f"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x53

    move-object/from16 v17, v1

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x71f1

    const v18, -0x1351ed76

    xor-int v1, v1, v18

    const v18, -0x82adebd

    :goto_6
    xor-int v15, v15, v18

    move-object/from16 v2, v17

    move/from16 v19, v16

    move/from16 v16, v15

    goto/16 :goto_a

    :sswitch_e
    return-void

    :sswitch_f
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 49
    invoke-super/range {p0 .. p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 50
    iget-boolean v1, v0, Ll/ۤܺ᩷;->᩹:Z

    if-eqz v1, :cond_c

    const-string v1, "\u1a78\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x3d

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x1611

    const v18, -0x252bcce4

    xor-int v15, v15, v18

    const v18, -0x4334f29f

    goto :goto_9

    :cond_c
    :goto_7
    const-string v1, "\u06dc\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x4aef

    const v18, 0x6c72a574

    xor-int v15, v15, v18

    const v18, -0x3704e165

    goto :goto_9

    :sswitch_10
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 4
    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_d

    :goto_8
    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x35

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x37ab

    const v18, -0x1f5aa553

    xor-int v15, v15, v18

    const v18, -0xa301d85

    goto :goto_9

    :cond_d
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x57

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x2a71

    const v18, 0x8677da6

    xor-int v15, v15, v18

    const v18, 0x4942d63f

    :goto_9
    xor-int v1, v1, v18

    move-object/from16 v2, v17

    move/from16 v19, v16

    move/from16 v16, v1

    move v1, v15

    :goto_a
    move/from16 v15, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x799aa02d -> :sswitch_a
        -0x6c8245ad -> :sswitch_2
        -0x6aa426a2 -> :sswitch_4
        -0x614a0056 -> :sswitch_6
        -0x5a9da3a0 -> :sswitch_2
        -0x52256512 -> :sswitch_10
        -0x318e0b0f -> :sswitch_c
        -0x211c484f -> :sswitch_a
        -0x20e1bd00 -> :sswitch_1
        -0x1f9da512 -> :sswitch_0
        -0x1bc22e2d -> :sswitch_9
        -0x1a156603 -> :sswitch_d
        -0xe830657 -> :sswitch_3
        -0xa661114 -> :sswitch_6
        -0xa345532 -> :sswitch_7
        -0x89885c1 -> :sswitch_5
        -0x6defb44 -> :sswitch_b
        -0x1f31750 -> :sswitch_1
        0x259293a -> :sswitch_8
        0x1013e56c -> :sswitch_b
        0x1151ea90 -> :sswitch_9
        0x15a8ad9d -> :sswitch_10
        0x2017b8f3 -> :sswitch_3
        0x2ae09221 -> :sswitch_4
        0x34c57475 -> :sswitch_c
        0x4862f15a -> :sswitch_8
        0x49270ae3 -> :sswitch_0
        0x51003ad7 -> :sswitch_e
        0x532e235c -> :sswitch_f
        0x574c5596 -> :sswitch_7
        0x578caeaa -> :sswitch_d
        0x6c8874ec -> :sswitch_e
        0x6dbc958d -> :sswitch_5
        0x79c79d0e -> :sswitch_f
    .end sparse-switch
.end method

.method public final ֫(Ll/ۨܺ᩷;)V
    .locals 6

    const v0, -0x7e81967b

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v3, "\u073a\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x76f3

    const v5, -0x76033f0d

    xor-int/2addr v4, v5

    const v5, 0x29c0e795

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2379

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 20
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_a

    :cond_0
    const-string v3, "\u1a76\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a9f

    const v5, 0x35596aa0

    xor-int/2addr v4, v5

    const v5, 0x41231a0b

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-gez v3, :cond_1

    goto/16 :goto_2

    :cond_1
    :goto_1
    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73a3

    const v5, -0x6065f598

    xor-int/2addr v4, v5

    const v5, 0x56c71cc8

    goto :goto_0

    .line 10
    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto/16 :goto_2

    .line 13
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 30
    :sswitch_4
    invoke-virtual {p1}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 29
    :sswitch_5
    iput-object p1, p0, Ll/ۤܺ᩷;->᩸:Ll/ۨܺ᩷;

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22ff

    const v5, 0x6c0a2227

    xor-int/2addr v4, v5

    const v5, -0x3a49d9a0

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073f\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1aad

    const v5, -0x1fcd33fc

    xor-int/2addr v4, v5

    const v5, -0x180b94b

    goto/16 :goto_0

    .line 24
    :sswitch_7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06d6\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xbbf

    const v5, 0x64487269

    xor-int/2addr v4, v5

    const v5, 0x6a689e9d

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a79\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e75

    const v5, 0xada86e9

    xor-int/2addr v4, v5

    const v5, 0x19f8da75

    goto/16 :goto_0

    .line 9
    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x8fb

    const v5, -0x7eed0b90

    xor-int/2addr v4, v5

    const v5, 0x2eaf5bc4

    goto/16 :goto_0

    .line 28
    :sswitch_a
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x766b

    const v5, 0x64cd1bf7

    xor-int/2addr v4, v5

    const v5, 0x39fba1d6

    goto/16 :goto_0

    .line 17
    :sswitch_b
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u06e4\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f99

    const v5, 0x65f1b5fd

    xor-int/2addr v4, v5

    const v5, -0x67ad7446

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_9

    :goto_2
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70db

    const v5, 0xf347454

    xor-int/2addr v4, v5

    const v5, -0x76b565e9

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x549b

    const v5, -0x5e2f7af0

    xor-int/2addr v4, v5

    const v5, 0x408795f3

    goto/16 :goto_0

    .line 18
    :sswitch_d
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x36e3

    const v5, -0x5ac28765    # -1.6434E-16f

    xor-int/2addr v4, v5

    const v5, -0x7556f683

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e1\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3401

    const v5, 0x117abb92

    xor-int/2addr v4, v5

    const v5, 0x162f8c8e

    goto/16 :goto_0

    .line 14
    :sswitch_e
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06e0\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f1

    const v5, -0x5a02a451

    xor-int/2addr v4, v5

    const v5, 0x6816f732

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67d1

    const v5, -0x22f481d6

    xor-int/2addr v4, v5

    const v5, -0x6e2a14ad

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c130e94 -> :sswitch_3
        -0x7937543c -> :sswitch_e
        -0x77e7c17e -> :sswitch_7
        -0x6e503d9f -> :sswitch_1
        -0x4c43a2a0 -> :sswitch_6
        -0x40b0406f -> :sswitch_8
        -0x40a3c4f8 -> :sswitch_e
        -0x3a9f0d84 -> :sswitch_6
        -0x34823b1d -> :sswitch_d
        -0x31fe6595 -> :sswitch_8
        -0x2f33d0e7 -> :sswitch_9
        -0x2e9b6e22 -> :sswitch_b
        -0x14c7b46d -> :sswitch_4
        -0x11d71d62 -> :sswitch_1
        -0x6336ebd -> :sswitch_2
        -0x60a387e -> :sswitch_0
        -0x1f90166 -> :sswitch_5
        0xd5c74a8 -> :sswitch_2
        0x158303a7 -> :sswitch_9
        0x1c582971 -> :sswitch_4
        0x1faad56c -> :sswitch_b
        0x27417d5d -> :sswitch_a
        0x375ae148 -> :sswitch_a
        0x39563153 -> :sswitch_c
        0x45c22824 -> :sswitch_d
        0x4ece71c6 -> :sswitch_0
        0x5ef38937 -> :sswitch_c
        0x5f57c685 -> :sswitch_3
        0x6f9c7e1e -> :sswitch_5
        0x73a7e11f -> :sswitch_7
    .end sparse-switch
.end method

.method public final ֫(Z)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0xa88582c

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    const-string v5, "\u06ec\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4fcd

    const v7, 0x52676c4d

    xor-int/2addr v6, v7

    const v7, -0x616590a5

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x500f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 38
    iput-boolean p1, p0, Ll/ۤܺ᩷;->᩹:Z

    if-eqz p1, :cond_5

    const-string v5, "\u0730\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2667

    const v8, -0x6214a828

    xor-int/2addr v6, v8

    const v8, 0x1a93a0e9

    goto/16 :goto_8

    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_7

    .line 36
    :sswitch_1
    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_c

    goto/16 :goto_5

    .line 38
    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_6

    .line 25
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    .line 42
    :sswitch_5
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto/16 :goto_3

    .line 41
    :sswitch_6
    new-instance v7, Landroid/graphics/Paint;

    const/4 v5, 0x1

    .line 26
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_4

    .line 41
    :cond_0
    invoke-direct {v7, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v7, p0, Ll/ۤܺ᩷;->ۙ:Landroid/graphics/Paint;

    .line 34
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v5, "\u0730\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x10f3

    const v8, 0xe71daed

    xor-int/2addr v6, v8

    const v8, 0x14413a6b

    goto/16 :goto_8

    .line 40
    :sswitch_7
    iput v0, p0, Ll/ۤܺ᩷;->᩶:I

    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u06e0\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2bcb

    const v8, -0x2f41076e

    xor-int/2addr v6, v8

    const v8, 0x748eb18e

    goto/16 :goto_8

    :sswitch_8
    const/high16 v0, 0x40200000    # 2.5f

    invoke-static {v0}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v0

    .line 10
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u073f\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7529

    const v8, 0x1a1bc846

    xor-int/2addr v6, v8

    const v8, 0x16234041

    goto/16 :goto_8

    :cond_4
    const-string v5, "\u06e2\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b05

    const v8, -0x76c80e1e

    xor-int/2addr v6, v8

    const v8, -0x476c6b56

    goto/16 :goto_8

    .line 39
    :sswitch_9
    iget v5, p0, Ll/ۤܺ᩷;->᩶:I

    if-nez v5, :cond_5

    const-string v5, "\u06ec\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4b39

    const v8, 0x74836f37

    xor-int/2addr v6, v8

    const v8, 0x3d869ec6

    goto/16 :goto_8

    .line 44
    :sswitch_a
    invoke-static {p0}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    return-void

    :cond_5
    :goto_3
    const-string v5, "\u1a75\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x15e1

    const v8, -0x7173f8e5

    xor-int/2addr v6, v8

    const v8, 0xd0a76ca

    goto/16 :goto_8

    .line 35
    :sswitch_b
    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v5, :cond_6

    :goto_4
    const-string v5, "\u06db\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1f25

    const v7, -0x27aeea22

    xor-int/2addr v6, v7

    const v7, 0x4af90476    # 8159803.0f

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06eb\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x23a3

    const v8, -0x76e2bdcd

    xor-int/2addr v6, v8

    const v8, -0x48b9c09

    goto/16 :goto_8

    .line 40
    :sswitch_c
    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v5, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v5, "\u06d9\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x220d

    const v8, 0x42762461

    xor-int/2addr v6, v8

    const v8, -0x7c6b1c5e

    goto/16 :goto_8

    .line 31
    :sswitch_d
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_9

    :cond_8
    :goto_5
    const-string v5, "\u1a78\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1663

    const v8, -0x7eb6374d

    xor-int/2addr v6, v8

    const v8, 0x6f65a158

    goto/16 :goto_8

    :cond_9
    const-string v5, "\u06e2\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5f17

    const v8, 0x1b6aaa2e

    xor-int/2addr v6, v8

    const v8, 0x1eec5604

    goto/16 :goto_8

    .line 10
    :sswitch_e
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v5

    if-gtz v5, :cond_a

    :goto_6
    const-string v5, "\u06db\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4fb

    const v8, 0x486ccbe5

    xor-int/2addr v6, v8

    const v8, -0x9ef8c55

    goto :goto_8

    :cond_a
    const-string v5, "\u1a74\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4331

    const v8, -0x271e3fb6

    xor-int/2addr v6, v8

    const v8, 0x73e1cc6b

    goto :goto_8

    .line 17
    :sswitch_f
    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_b

    goto :goto_7

    :cond_b
    const-string v5, "\u1a7b\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x60a3

    const v8, 0x13d3b434

    xor-int/2addr v6, v8

    const v8, 0x5871937a

    goto :goto_8

    .line 0
    :sswitch_10
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_d

    :cond_c
    :goto_7
    const-string v5, "\u1a78\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7c7d

    const v8, 0x5e4ecdab

    xor-int/2addr v6, v8

    const v8, 0x376a5f4a

    goto :goto_8

    :cond_d
    const-string v5, "\u06d8\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3b3b

    const v8, -0x49e81124

    xor-int/2addr v6, v8

    const v8, -0x3a8bf7bd

    :goto_8
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x777da4df -> :sswitch_10
        -0x7245dc32 -> :sswitch_5
        -0x54100d6e -> :sswitch_2
        -0x53b74014 -> :sswitch_3
        -0x3aeafcb7 -> :sswitch_6
        -0x369906f3 -> :sswitch_3
        -0x30dc5781 -> :sswitch_f
        -0x2b31a3a5 -> :sswitch_c
        -0x24f622ad -> :sswitch_6
        -0x20bbb6e8 -> :sswitch_9
        -0xf965acf -> :sswitch_b
        0xe8cae68 -> :sswitch_4
        0xf11c23e -> :sswitch_8
        0x11d2bad4 -> :sswitch_2
        0x11df714f -> :sswitch_a
        0x15386dfc -> :sswitch_5
        0x193ba62e -> :sswitch_1
        0x1a6fc713 -> :sswitch_b
        0x1b3d9d79 -> :sswitch_8
        0x2168b732 -> :sswitch_7
        0x275ab4ec -> :sswitch_0
        0x2aab9a7c -> :sswitch_4
        0x30ef7830 -> :sswitch_0
        0x4569be81 -> :sswitch_a
        0x472c616f -> :sswitch_1
        0x4e77fc68 -> :sswitch_7
        0x55592846 -> :sswitch_d
        0x5e4c5e12 -> :sswitch_d
        0x6066a6ca -> :sswitch_10
        0x60ea740b -> :sswitch_f
        0x63522875 -> :sswitch_e
        0x67e212c2 -> :sswitch_c
        0x7adc6377 -> :sswitch_9
        0x7ec97676 -> :sswitch_e
    .end sparse-switch
.end method

.method public final ܽ()V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۤܺ᩷;->᩸:Ll/ۨܺ᩷;

    invoke-virtual {v0}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
