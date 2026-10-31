.class public final synthetic Ll/ܶۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Consumer;

.field public final synthetic ᩹:Ll/ۛۘۡ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;Ll/ۛۘۡ;)V
    .locals 6

    const v0, -0x1309b7e3

    sget v1, Ll/֨۬;->۫ۙ᩺:I

    sget v2, Ll/ۛ;->᩺᩻֫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d8\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3633

    const v5, 0x7c340a8b

    xor-int/2addr v4, v5

    const v5, 0xda6189c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x10f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-gez v3, :cond_a

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v3, :cond_5

    goto/16 :goto_2

    .line 2
    :sswitch_2
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_8

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_2

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ܶۘۡ;->᩹:Ll/ۛۘۡ;

    return-void

    .line 2
    :sswitch_6
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a7b\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2bd1

    const v5, -0x5decf282

    xor-int/2addr v4, v5

    const v5, 0x62e318b

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e35

    const v5, 0xa631aa4

    xor-int/2addr v4, v5

    const v5, -0x7d59c965

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ced

    const v5, 0x43f57d14

    xor-int/2addr v4, v5

    const v5, -0x504fcab7

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u073a\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x10bb

    const v5, 0x73f61389

    xor-int/2addr v4, v5

    const v5, -0x4c4f08f1

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u073f\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x33bb

    const v5, -0x559b5235

    xor-int/2addr v4, v5

    const v5, -0x5277bafd

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b61

    const v5, -0x51f9391a

    xor-int/2addr v4, v5

    const v5, 0x48e99ad6

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-gtz v3, :cond_6

    :cond_5
    const-string v3, "\u1a79\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3e77

    const v5, -0x2c72f3fc

    xor-int/2addr v4, v5

    const v5, 0x3187b2be

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073a\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7139

    const v5, 0x14e35a3f

    xor-int/2addr v4, v5

    const v5, 0x408a659e

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x369d

    const v5, 0x7ef08435

    xor-int/2addr v4, v5

    const v5, -0x11609297

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    const-string v3, "\u073d\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xf99

    const v5, 0x57af8c2

    xor-int/2addr v4, v5

    const v5, 0x14fee2b5

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e0\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2867

    const v5, -0x3d18dbe5

    xor-int/2addr v4, v5

    const v5, -0x7e06d54d

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_b

    :cond_a
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4dad

    const v5, 0x16edd49c

    xor-int/2addr v4, v5

    const v5, 0x1ce5e45e

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f13

    const v5, 0x61588f3e

    xor-int/2addr v4, v5

    const v5, -0x50a4bef6

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܶۘۡ;->᩸:Ljava/util/function/Consumer;

    .line 2
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_c

    :goto_2
    const-string v3, "\u1a75\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6ef7

    const v5, -0x4dda5759

    xor-int/2addr v4, v5

    const v5, -0x7a6af02a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x12ab

    const v5, -0x17cb631

    xor-int/2addr v4, v5

    const v5, -0x1aab28d0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fcb1277 -> :sswitch_a
        -0x75a10d44 -> :sswitch_6
        -0x734bcc38 -> :sswitch_8
        -0x6af12f87 -> :sswitch_9
        -0x59c5cd2b -> :sswitch_c
        -0x58c8f6fd -> :sswitch_0
        -0x3c0516fd -> :sswitch_c
        -0x364412e8 -> :sswitch_3
        -0x250aaf0b -> :sswitch_7
        -0x23214200 -> :sswitch_e
        0x59b72d2 -> :sswitch_5
        0x8632a1b -> :sswitch_d
        0x12f7be99 -> :sswitch_b
        0x156a66ce -> :sswitch_0
        0x1c7a0239 -> :sswitch_3
        0x1fc3178b -> :sswitch_d
        0x294b7630 -> :sswitch_1
        0x35fd4b11 -> :sswitch_b
        0x39008e0b -> :sswitch_2
        0x406d47ea -> :sswitch_9
        0x40bf82d9 -> :sswitch_8
        0x4582bff1 -> :sswitch_7
        0x4f6c3a34 -> :sswitch_a
        0x5b73fd97 -> :sswitch_5
        0x68a114eb -> :sswitch_4
        0x69fbba63 -> :sswitch_6
        0x6c2675d1 -> :sswitch_4
        0x73c8019b -> :sswitch_e
        0x7a0b22fb -> :sswitch_1
        0x7eae54fd -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 p1, 0x0

    const v0, -0x5a341327

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v3, "\u1a75\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d77

    const v5, -0x3499908d    # -1.5101811E7f

    xor-int/2addr v4, v5

    const v5, -0x587c82f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x947

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v3, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_6

    goto/16 :goto_4

    .line 2
    :sswitch_2
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 0
    :sswitch_4
    iget-object v0, p0, Ll/ܶۘۡ;->᩹:Ll/ۛۘۡ;

    invoke-static {p1, v0}, Ll/ۛۘۡ;->֫(Ljava/util/function/Consumer;Ll/ۛۘۡ;)V

    return-void

    :sswitch_5
    iget-object p1, p0, Ll/ܶۘۡ;->᩸:Ljava/util/function/Consumer;

    .line 1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06dc\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x721f

    const v5, 0x4d544ba

    xor-int/2addr v4, v5

    const v5, 0x1b1258d1

    goto :goto_0

    .line 0
    :sswitch_6
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06e7\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1563

    const v5, 0x11f30c50

    xor-int/2addr v4, v5

    const v5, -0x1ea2e067

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7853

    const v5, -0x1e19a9ba

    xor-int/2addr v4, v5

    const v5, -0x4da8cffe

    goto :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_1
    const-string v3, "\u06e7\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x494f

    const v5, 0x1ff4519c

    xor-int/2addr v4, v5

    const v5, 0x4ae3c0fc    # 7463038.0f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x680d

    const v5, -0x40a9f314

    xor-int/2addr v4, v5

    const v5, 0x254fe131

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_4

    :goto_2
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x38c1

    const v5, 0x31ae15aa

    xor-int/2addr v4, v5

    const v5, 0x5e0c9e15

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0736\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73ff

    const v5, 0x7028df2

    xor-int/2addr v4, v5

    const v5, -0x30e44a11

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x32ed

    const v5, 0x1ee3146b

    xor-int/2addr v4, v5

    const v5, 0x850f5c1

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-ltz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06d8\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x50ed

    const v5, 0x4428e169

    xor-int/2addr v4, v5

    const v5, 0x86c79a7

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06db\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc6b

    const v5, 0x34641e1e

    xor-int/2addr v4, v5

    const v5, 0x5dfef279

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a7a\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c45

    const v5, -0x420265aa

    xor-int/2addr v4, v5

    const v5, -0x7f31b35

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d29

    const v5, -0x4dae88a

    xor-int/2addr v4, v5

    const v5, 0x27840693

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d6\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7127

    const v5, -0x12056a4b

    xor-int/2addr v4, v5

    const v5, -0x3e6cff4

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x404f

    const v5, -0x5fbfd59b

    xor-int/2addr v4, v5

    const v5, 0x230d35c5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x9d9

    const v5, -0x4d2b4c01

    xor-int/2addr v4, v5

    const v5, 0x41d5264e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75d99b81 -> :sswitch_3
        -0x73fa930f -> :sswitch_1
        -0x715d2622 -> :sswitch_4
        -0x67bf3c93 -> :sswitch_2
        -0x574b225f -> :sswitch_5
        -0x43d8924a -> :sswitch_2
        -0x3f7fe73a -> :sswitch_e
        -0x39b50d7a -> :sswitch_a
        -0x30c76f09 -> :sswitch_4
        -0x2b7ff2c9 -> :sswitch_c
        -0x2385f626 -> :sswitch_9
        -0x1b0d09fb -> :sswitch_8
        -0x1b08d2b8 -> :sswitch_e
        -0x16fbc47a -> :sswitch_5
        -0x117214ee -> :sswitch_0
        -0x115cb604 -> :sswitch_a
        -0x1122b57b -> :sswitch_d
        -0x435bbce -> :sswitch_7
        0x5ae40a0 -> :sswitch_6
        0x11fe3b2a -> :sswitch_3
        0x1d5f4c00 -> :sswitch_6
        0x220e2a3f -> :sswitch_7
        0x230b5812 -> :sswitch_c
        0x35f8df85 -> :sswitch_b
        0x374815db -> :sswitch_d
        0x4c9c5d1c -> :sswitch_1
        0x57076ee0 -> :sswitch_b
        0x6a1de8dd -> :sswitch_8
        0x717d547f -> :sswitch_0
        0x73a513c1 -> :sswitch_9
    .end sparse-switch
.end method
